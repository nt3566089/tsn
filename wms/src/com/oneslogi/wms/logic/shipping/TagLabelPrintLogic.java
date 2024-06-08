package com.oneslogi.wms.logic.shipping;

import java.io.File;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.inject.Inject;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.allcommon.CDef.ArrivalStoreFormat;
import com.oneslogi.base.dbflute.allcommon.CDef.CenterTagDataType;
import com.oneslogi.base.dbflute.allcommon.CDef.CenterTagType;
import com.oneslogi.base.dbflute.allcommon.CDef.MixedFlg;
import com.oneslogi.base.dbflute.cbean.MCarrierBoxCB;
import com.oneslogi.base.dbflute.cbean.MCarrierZipCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPackingRCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierBoxBhv;
import com.oneslogi.base.dbflute.exbhv.MCarrierZipBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingRBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.BClass;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCarrierBox;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYmt;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.base.dbflute.exentity.MCarrierZip;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCommonCarrier;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.base.enums.print.OutputFileType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.AutoPrintLogic;
import com.oneslogi.print.logic.AutoPrintLogic.AutoPrintAddQueueResult;
import com.oneslogi.print.logic.AutoPrintLogic.AutoPrintAddQueueResultDetail;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.TagLabelDto;
import com.oneslogi.wms.dto.report.TagLabelSgwDto;
import com.oneslogi.wms.dto.report.TagLabelYmtDto;
import com.oneslogi.wms.dto.report.TagLabelYupkDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.MatchingLogic;
import com.oneslogi.wms.logic.common.MatchingLogic.CarrierCls;
import com.oneslogi.wms.logic.common.QueryUpdateLogic;
import com.oneslogi.wms.logic.common.QueryUpdateSettingsLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.util.WCU;

/**
 * 荷札発行ロジック
 */
public class TagLabelPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingRBhv tPackingRBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private MCarrierZipBhv mCarrierZipBhv;
	@Inject
	private MCarrierBoxBhv mCarrierBoxBhv;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;

	// ===== 使用ロジック =====
	@Inject
	private PrintLogic printLogic;
	@Inject
	private AutoPrintLogic autoPrintLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private MatchingLogic matchingLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private CenterClassLogic centerClassLogic;
	@Inject
	private TagLabelSagawaApiLogic sagawaApiLogic;
	@Inject
	private QueryUpdateLogic queryUpdateLogic;
	@Inject
	private QueryUpdateSettingsLogic queryUpdateSettingsLogic;

	// ===== 定義 =====

	private static final String REPORT_CD_SLIP = "CommonInvoiceList";
	private static final String REPORT_CD_TAG_COMMON = "CommonTagLabel";
	private static final String REPORT_CD_TAG_YMT = "YamatoDeliveryTagLabel";
	private static final String REPORT_CD_TAG_YMT_COD = "YamatoCollectTagLabel";
	private static final String REPORT_CD_TAG_SGW_API = "SagawaTagLabel";
	private static final String REPORT_CD_TAG_YUPK = "YuPackTagLabel";
	private static final String REPORT_CD_TAG_YUPKT = "YuPacketTagLabel";

	// ===== enum =====

	/** 荷札発行種別 */
	public enum TagLabelCls {
		/** 送り状 */
		SLIP(0),
		/** 荷札(ケース＋バラ) */
		TAG(1),
		/** 荷札(ケースのみ) */
		TAG_CASE(2),
		/** 荷札(バラのみ) */
		TAG_PIECE(3);

		private int code;

		private TagLabelCls(int code) {
			this.code = code;
		}

		private static final Map<Integer, TagLabelCls> enumMap = new HashMap<Integer, TagLabelCls>();
		static {
			for (TagLabelCls value : values()) {
				enumMap.put(value.code, value);
			}
		}

		public static TagLabelCls codeOf(int code) {
			return enumMap.get(code);
		}

		public int code() {
			return code;
		}
	}

	/** コントロールNo付加テーブル */
	private enum ControlNoTable {
		/** 出庫帳票 */
		PICKING_R,
		/** 梱包帳票 */
		PACKING_R
	}

	/** 自動発行区分 */
	private enum AutoPrint {
		TRUE,
		FALSE
	}

	/** 荷札DTO種別 */
	private enum TagLabelDtoCls {
		YAMATO,
		SAGAWA,
		YU_PACK,
		NOTHING
	}

	/** 代引フラグ */
	private enum CodFlg {
		TRUE,
		FALSE
	}

	/** 1枚目フラグ */
	private enum FirstOutFlg {
		TRUE,
		FALSE
	}

	/** 印刷データ種別 */
	private enum PrintDataType {
		DATA,
		PDF
	}

	// ===== 変数 =====
	/** 1枚目の出荷梱包Noマップ (キー:出庫作業No) (パフォーマンス対策) */
	private Map<String, String> firstPackingNoMap = new HashMap<String, String>();
	/** 追跡番号マップ (キー:出庫作業No) (パフォーマンス対策) */
	private Map<CarrierTraceNoKey, String> carrierTraceNoMap = new HashMap<CarrierTraceNoKey, String>();
	/** 出荷梱包Noリストマップ (キー:出庫作業No) (パフォーマンス対策) */
	private Map<CarrierTraceNoKey, List<TPackingH>> packingNoListMap = new HashMap<CarrierTraceNoKey, List<TPackingH>>();

	/**
	 * <h2>荷札発行の帳票CDを取得.</h2>
	 * <pre>
	 * 対象データを検索し、(コントロールNoを条件に使用)
	 * 発行する荷札の帳票CDを返却する。
	 *
	 * 複数の梱包データが対象の場合、
	 * 複数の帳票CDが返却される。(重複なし)
	 *
	 * "配送コースが代引の場合" かつ "梱包が2番目以降の場合(出荷梱包Noで判定)"は
	 * 配送コースマスタの「送り状種別(代引時、2枚目以降)」を帳票CDとし、
	 * 上記以外は「送り状種別」を帳票CDとする。
	 *
	 * ※パラメータの荷札発行種別が送り状の場合は「送り状」の帳票CDのみが返却される
	 * </pre>
	 *
	 * @param tPickingR 出庫帳票(コントロールNoを対象データの検索条件に使用)
	 * @param tagLabelCls 荷札発行種別
	 * @param errSts エラー時に設定するエラーステータス
	 * @return 帳票CDのリスト
	 */
	public List<String> getReportCd(TPickingR tPickingR, TagLabelCls tagLabelCls, ErrorStatus errSts) {
		// 発行

		return getReportCd(tPickingR.getControlNo(), ControlNoTable.PICKING_R, tagLabelCls, errSts);
	}

	/**
	 * <h2>荷札発行の帳票CDを取得.</h2>
	 * <pre>
	 * 対象データを検索し、(コントロールNoを条件に使用)
	 * 発行する荷札の帳票CDを返却する。
	 *
	 * 複数の梱包データが対象の場合、
	 * 複数の帳票CDが返却される。(重複なし)
	 *
	 * "配送コースが代引の場合" かつ "梱包が2番目以降の場合(出荷梱包Noで判定)"は
	 * 配送コースマスタの「送り状種別(代引時、2枚目以降)」を帳票CDとし、
	 * 上記以外は「送り状種別」を帳票CDとする。
	 *
	 * ※パラメータの荷札発行種別が送り状の場合は「送り状」の帳票CDのみが返却される
	 * </pre>
	 *
	 * @param tPackingR 梱包帳票(コントロールNoを対象データの検索条件に使用)
	 * @param tagLabelCls 荷札発行種別
	 * @param errSts エラー時に設定するエラーステータス
	 * @return 帳票CDのリスト
	 */
	public List<String> getReportCd(TPackingR tPackingR, TagLabelCls tagLabelCls, ErrorStatus errSts) {
		// 発行

		return getReportCd(tPackingR.getControlNo(), ControlNoTable.PACKING_R, tagLabelCls, errSts);
	}

	/**
	 * <h2>荷札発行.</h2>
	 * <pre>
	 * 下記手順で荷札を発行する。
	 * ダウンロードURLはパラメータの印刷情報に設定される。
	 * 1. 対象データを検索
	 * 2. 帳票データに変換
	 *   (貨物追跡Noが採番されていない場合は新規に採番する)
	 * 3. 帳票データから帳票を発行
	 *   (パラメータの印刷情報に設定された帳票IDと一致する帳票のみ)
	 * 4. 荷札出力フラグ または 送り状出力フラグ を「1」に更新
	 *
	 * 【使用ロジッククラス】
	 * ・貨物追跡Noの採番は{@link NumberingCenterLogic#getNumbering(Long, String) 採番ロジック.採番(センタ単位orシステム単位)}を使用
	 * ・配送時間帯CDの変換は{@link MatchingLogic#convertDelivTzWmsToCarrier(CarrierCls, String) マッチンングマスタロジック.時間帯CDの変換(WMS⇒運送業者)}を使用
	 * ・帳票の発行は{@link PrintLogic#print(PrintParamDto) オンライン印刷データ登録ロジック.印刷キューデータの登録}を使用
	 * ・佐川APIでの帳票発行は{@link TagLabelSagawaApiLogic#createTagPdf(List, ErrorStatus) 佐川APIロジック.荷札PDF作成}を使用
	 * </pre>
	 *
	 * @param tPickingR 出庫帳票(コントロールNoを対象データの検索条件に使用)
	 * @param tagLabelCls 荷札発行種別
	 * @param printParamDto 印刷情報(画面から選択された情報 + 帳票ID)
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void print(TPickingR tPickingR, TagLabelCls tagLabelCls, PrintParamDto printParamDto, ErrorStatus errSts) {
		// 発行

		print(tPickingR.getControlNo(), ControlNoTable.PICKING_R, tagLabelCls, AutoPrint.FALSE, printParamDto, errSts);
	}

	/**
	 * <h2>荷札発行.</h2>
	 * <pre>
	 * 下記手順で荷札を発行する。
	 * ダウンロードURLはパラメータの印刷情報に設定される。
	 * 1. 対象データを検索
	 * 2. 帳票データに変換
	 *   (貨物追跡Noが採番されていない場合は新規に採番する)
	 * 3. 帳票データから帳票を発行
	 *   (パラメータの印刷情報に設定された帳票IDと一致する帳票のみ)
	 * 4. 荷札出力フラグ または 送り状出力フラグ を「1」に更新
	 *
	 * 【使用ロジッククラス】
	 * ・貨物追跡Noの採番は{@link NumberingCenterLogic#getNumbering(Long, String) 採番ロジック.採番(センタ単位orシステム単位)}を使用
	 * ・配送時間帯CDの変換は{@link MatchingLogic#convertDelivTzWmsToCarrier(CarrierCls, String) マッチンングマスタロジック.時間帯CDの変換(WMS⇒運送業者)}を使用
	 * ・帳票の発行は{@link PrintLogic#print(PrintParamDto) オンライン印刷データ登録ロジック.印刷キューデータの登録}を使用
	 * ・佐川APIでの帳票発行は{@link TagLabelSagawaApiLogic#createTagPdf(List, ErrorStatus) 佐川APIロジック.荷札PDF作成}を使用
	 * </pre>
	 *
	 * @param tPackingR 梱包帳票(コントロールNoを対象データの検索条件に使用)
	 * @param tagLabelCls 荷札発行種別
	 * @param printParamDto 印刷情報(画面から選択された情報 + 帳票ID)
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void print(TPackingR tPackingR, TagLabelCls tagLabelCls, PrintParamDto printParamDto, ErrorStatus errSts) {
		// 発行

		print(tPackingR.getControlNo(), ControlNoTable.PACKING_R, tagLabelCls, AutoPrint.FALSE, printParamDto, errSts);
	}

	/**
	 * <h2>荷札発行(自動印刷).</h2>
	 * <pre>
	 * 下記手順で荷札を発行、自動印刷する
	 *
	 * 1. 対象データを検索
	 * 2. 帳票データに変換
	 *   (貨物追跡Noが採番されていない場合は新規に採番する)
	 * 3. 帳票データから帳票を発行 (自動印刷)
	 * 4. 荷札出力フラグ または 送り状出力フラグ を「1」に更新
	 *
	 * 【使用ロジッククラス】
	 * ・貨物追跡Noの採番は{@link NumberingCenterLogic#getNumbering(Long, String) 採番ロジック.採番(センタ単位orシステム単位)}を使用
	 * ・配送時間帯CDの変換は{@link MatchingLogic#convertDelivTzWmsToCarrier(CarrierCls, String) マッチンングマスタロジック.時間帯CDの変換(WMS⇒運送業者)}を使用
	 * ・帳票の自動印刷は{@link AutoPrintLogic#print(String, String) 自動印刷データ登録ロジック.自動印刷へのキュー投入}を使用
	 * ・佐川APIでの帳票発行は{@link TagLabelSagawaApiLogic#createTagPdf(List, ErrorStatus) 佐川APIロジック.荷札PDF作成}を使用
	 * </pre>
	 *
	 * @param tPickingR 出庫帳票(コントロールNoのみ使用)
	 * @param tagLabelCls 荷札発行種別
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void printAuto(TPickingR tPickingR, TagLabelCls tagLabelCls, ErrorStatus errSts) {
		// 自動印刷

		print(tPickingR.getControlNo(), ControlNoTable.PICKING_R, tagLabelCls, AutoPrint.TRUE, null, errSts);
	}

	/**
	 * <h2>荷札発行(自動印刷).</h2>
	 * <pre>
	 * 下記手順で荷札を発行、自動印刷する
	 *
	 * 1. 対象データを検索
	 * 2. 帳票データに変換
	 *   (貨物追跡Noが採番されていない場合は新規に採番する)
	 * 3. 帳票データから帳票を発行 (自動印刷)
	 * 4. 荷札出力フラグ または 送り状出力フラグ を「1」に更新
	 *
	 * 【使用ロジッククラス】
	 * ・貨物追跡Noの採番は{@link NumberingCenterLogic#getNumbering(Long, String) 採番ロジック.採番(センタ単位orシステム単位)}を使用
	 * ・配送時間帯CDの変換は{@link MatchingLogic#convertDelivTzWmsToCarrier(CarrierCls, String) マッチンングマスタロジック.時間帯CDの変換(WMS⇒運送業者)}を使用
	 * ・帳票の自動印刷は{@link AutoPrintLogic#print(String, String) 自動印刷データ登録ロジック.自動印刷へのキュー投入}を使用
	 * ・佐川APIでの帳票発行は{@link TagLabelSagawaApiLogic#createTagPdf(List, ErrorStatus) 佐川APIロジック.荷札PDF作成}を使用
	 * </pre>
	 *
	 * @param tPackingR 梱包帳票(コントロールNoのみ使用)
	 * @param tagLabelCls 荷札発行種別
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void printAuto(TPackingR tPackingR, TagLabelCls tagLabelCls, ErrorStatus errSts) {
		// 自動印刷

		print(tPackingR.getControlNo(), ControlNoTable.PACKING_R, tagLabelCls, AutoPrint.TRUE, null, errSts);
	}

	private List<String> getReportCd(long controlNo, ControlNoTable controlNoTable, TagLabelCls cls, ErrorStatus errSts) {
		// ===== 対象データの取得 =====
		List<TPackingH> dataList = selectData(controlNo, controlNoTable, cls);
		if (dataList.size() < 1) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		Set<String> reportCdSet = getReportCd(dataList, cls, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		return new ArrayList<String>(reportCdSet);
	}

	private Set<String> getReportCd(List<TPackingH> dataList, TagLabelCls cls, ErrorStatus errSts) {

		Set<String> reportCdSet = new LinkedHashSet<String>();
		if (cls == TagLabelCls.SLIP) {
			// 送り状

			reportCdSet.add(REPORT_CD_SLIP);
			return reportCdSet;
		}

		for (TPackingH packingH : dataList) {

			MCarrierSlipYmt ymt = packingH.getTPickingH().getTAllocInstH().getMDeliveryCourse().getMCarrierSlipYmt();
			MCarrierSlipSgw sgw = packingH.getTPickingH().getTAllocInstH().getMDeliveryCourse().getMCarrierSlipSgw();
			MCarrierSlipYupk yupk = packingH.getTPickingH().getTAllocInstH().getMDeliveryCourse().getMCarrierSlipYupk();

			CodFlg codFlg;
			if (ymt != null) {
				codFlg = isCodYmt(ymt);
			} else if (sgw != null) {
				codFlg = isCodSgw(sgw);
			} else if (yupk != null) {
				codFlg = isCodYupk(yupk);
			} else {
				// [#528] 汎用荷札の代引金額が表示されない不具合を修正 2016.12.22 kawana Start
				codFlg = isCod(packingH.getTPickingH().getTAllocInstH().getAllocInstHId());
				// [#528] 汎用荷札の代引金額が表示されない不具合を修正 2016.12.22 kawana End
			}

			FirstOutFlg firstOutFlg = isFirstOut(packingH);
			String reportCd = getReportCd(packingH.getTPickingH().getTAllocInstH().getMDeliveryCourse(), codFlg, firstOutFlg, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}

			reportCdSet.add(reportCd);
		}

		return reportCdSet;
	}

	private void print(long controlNo, ControlNoTable controlNoTable, TagLabelCls cls, AutoPrint autoPrint, PrintParamDto printParamDto, ErrorStatus errSts) {

		// ===== 対象データの取得 =====
		List<TPackingH> dataList = selectData(controlNo, controlNoTable, cls);
		if (dataList.size() < 1) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		// ===== 帳票データに変換 =====
		Map<String, List<TagLabelDto>> tagLabelDataMap = convertData(dataList, cls, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== 発行 =====

		// [#6634][v3.1] 他センタを送り状出力フラグを更新してしまう不具合を修正(不要な変数を削除) 2019.07.30 kawana Delete

		for (Entry<String, List<TagLabelDto>> entry : tagLabelDataMap.entrySet()) {
			String reportCd = entry.getKey();

			if (autoPrint == AutoPrint.FALSE) {
				long reportId = reportLogic.getReportId(reportCd);
				if (printParamDto.printBasicData.reportId.longValue() != reportId) {
					// 対象の印刷ではないためスキップ
					continue;
				}
			}

			List<TagLabelDto> data = entry.getValue();

			if (reportCd.equals(REPORT_CD_TAG_SGW_API)) {

				List<File> pdfFileList = sagawaApiLogic.createTagPdf(data, errSts);
				if (0 < getErrorManager().size()) {
					return;
				}

				switch (autoPrint) {
				case TRUE:
					excecAutoPrint(reportCd, pdfFileList, PrintDataType.PDF, errSts);
					break;
				case FALSE:
					excecPrint(printParamDto, pdfFileList, PrintDataType.PDF, errSts);
					break;

				}
				if (0 < getErrorManager().size()) {
					return;
				}
			} else {

				switch (autoPrint) {
				case TRUE:
					excecAutoPrint(reportCd, data, PrintDataType.DATA, errSts);
					break;
				case FALSE:
					excecPrint(printParamDto, data, PrintDataType.DATA, errSts);
					break;
				}
				if (0 < getErrorManager().size()) {
					return;
				}
			}

			// [#6634][v3.1] 他センタを送り状出力フラグを更新してしまう不具合を修正(不要な処理を削除) 2019.07.30 kawana Delete
		}

		// ===== 出力フラグ更新 =====

		switch (cls) {
		case SLIP:
			// [#6634][v3.1] 他センタを送り状出力フラグを更新してしまう不具合を修正 2019.07.30 kawana Start
			updateSlipOutFlg(dataList);
			// [#6634][v3.1] 他センタを送り状出力フラグを更新してしまう不具合を修正 2019.07.30 kawana End
			break;
		case TAG:
		case TAG_CASE:
		case TAG_PIECE:
			// [#6634][v3.1] 他センタを送り状出力フラグを更新してしまう不具合を修正 2019.07.30 kawana Start
			updateTagOutFlg(dataList);
			// [#6634][v3.1] 他センタを送り状出力フラグを更新してしまう不具合を修正 2019.07.30 kawana End
			break;
		}
	}

	/**
	 * 対象データの取得
	 * @return 対象データのリスト(ベース:梱包ヘッダ)
	 */
	private List<TPackingH> selectData(long controlNo, ControlNoTable controlNoTable, TagLabelCls cls) {

		TPackingHCB cb = tPackingHBhv.newMyConditionBean();
		cb.setupSelect_TPickingH()
				.withTAllocInstH()
				.withMDeliveryCourse()
				.withMCarrier()
				.withMCommonCarrier();
		cb.setupSelect_MBox();
		cb.setupSelect_MCenter();
		cb.setupSelect_MClient();
		cb.setupSelect_TPackingRAsOne();
		cb.setupSelect_TPickingH().withTPickingRAsOne();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_TPickingH().withTAllocInstH().withMDeliveryCourse().withMCarrierSlipYmt().withBClassDtlByCoolCls().withVDict(getCultureId());
		cb.setupSelect_TPickingH().withTAllocInstH().withMDeliveryCourse().withMCarrierSlipSgw();
		cb.setupSelect_TPickingH().withTAllocInstH().withMDeliveryCourse().withMCarrierSlipYupk().withBClassDtlByCoolType().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

		cb.checkInvalidQuery();

		switch (controlNoTable) {
		case PACKING_R:
			cb.query().queryTPackingRAsOne().setControlNo_Equal(controlNo);
			break;
		case PICKING_R:
			cb.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(controlNo);
			break;
		}

		switch (cls) {
		case TAG_CASE:
			cb.query().setMixedFlg_Equal_$0();
			break;
		case TAG_PIECE:
			cb.query().setMixedFlg_Equal_$1();
			break;
		case SLIP:
		case TAG:
			break;
		}

		cb.query().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		cb.query().addOrderBy_ShippingPackingNo_Asc();

		List<TPackingH> selectList = tPackingHBhv.selectList(cb);

		return selectList;
	}

	/**
	 * 帳票データに変換
	 * @return 帳票データマップ(キー：帳票CD)
	 */
	private Map<String, List<TagLabelDto>> convertData(List<TPackingH> dataList, TagLabelCls cls, ErrorStatus errSts) {
		// 帳票データへの変換

		Map<String, List<TagLabelDto>> tagLabelDataMap = new LinkedHashMap<String, List<TagLabelDto>>();
		Set<String> pickingWorkNoSet = new HashSet<String>();

		for (TPackingH packingH : dataList) {

			MCarrierSlipYmt ymt = packingH.getTPickingH().getTAllocInstH().getMDeliveryCourse().getMCarrierSlipYmt();
			MCarrierSlipSgw sgw = packingH.getTPickingH().getTAllocInstH().getMDeliveryCourse().getMCarrierSlipSgw();
			MCarrierSlipYupk yupk = packingH.getTPickingH().getTAllocInstH().getMDeliveryCourse().getMCarrierSlipYupk();

			TagLabelDto dto;
			CodFlg codFlg;
			FirstOutFlg firstOutFlg;
			String reportCd;
			if (cls == TagLabelCls.SLIP) {
				// 送り状

				// 1出庫作業Noで1つのみ作成
				String pickingWorkNo = packingH.getTPickingH().getPickingWorkNo();
				if (pickingWorkNoSet.contains(pickingWorkNo)) {
					continue;
				} else {
					pickingWorkNoSet.add(pickingWorkNo);
				}

				dto = new TagLabelDto();
				codFlg = CodFlg.FALSE;
				firstOutFlg = FirstOutFlg.FALSE;
				reportCd = REPORT_CD_SLIP;
			} else {
				// 荷札

				// DTO種別決定
				TagLabelDtoCls dtoCls;
				if (ymt != null) {
					dtoCls = TagLabelDtoCls.YAMATO;
				} else if (sgw != null) {
					dtoCls = TagLabelDtoCls.SAGAWA;
				} else if (yupk != null) {
					dtoCls = TagLabelDtoCls.YU_PACK;
				} else {
					dtoCls = TagLabelDtoCls.NOTHING;
				}

				switch (dtoCls) {
				case YAMATO:
					dto = new TagLabelYmtDto();
					codFlg = isCodYmt(ymt);
					// ヤマト用DTOの値を設定
					convertTagLabelYmtDto((TagLabelYmtDto) dto, ymt);
					break;
				case SAGAWA:
					dto = new TagLabelSgwDto();
					codFlg = isCodSgw(sgw);
					// 佐川用DTOの値を設定
					convertTagLabelSgwDto((TagLabelSgwDto) dto, sgw);
					break;
				case YU_PACK:
					dto = new TagLabelYupkDto();
					codFlg = isCodYupk(yupk);
					// ゆうパック用DTOの値を設定
					convertTagLabelYupkDto((TagLabelYupkDto) dto, yupk);
					break;
				default:
					dto = new TagLabelDto();
					// [#528] 汎用荷札の代引金額が表示されない不具合を修正 2016.12.22 kawana Start
					codFlg = isCod(packingH.getTPickingH().getTAllocInstH().getAllocInstHId());
					// [#528] 汎用荷札の代引金額が表示されない不具合を修正 2016.12.22 kawana End
					break;
				}
				firstOutFlg = isFirstOut(packingH);
				reportCd = getReportCd(packingH.getTPickingH().getTAllocInstH().getMDeliveryCourse(), codFlg, firstOutFlg, errSts);
			}

			if (0 < getErrorManager().size()) {
				return null;
			}

			// 共通DTOの値を設定
			convertTagLabelDto(dto, packingH, cls, codFlg, firstOutFlg);

			// 帳票CD毎にデータを設定
			if (tagLabelDataMap.containsKey(reportCd)) {
				tagLabelDataMap.get(reportCd).add(dto);
			} else {
				List<TagLabelDto> dtoList = new ArrayList<TagLabelDto>();
				dtoList.add(dto);
				tagLabelDataMap.put(reportCd, dtoList);
			}
		}

		if (cls == TagLabelCls.SLIP) {
			// 送り状の場合はデータを複製(2個づつにして返す)

			Map<String, List<TagLabelDto>> newTagLabelDataMap = new HashMap<String, List<TagLabelDto>>();
			for (Entry<String, List<TagLabelDto>> entry : tagLabelDataMap.entrySet()) {
				String reportCd = entry.getKey();
				List<TagLabelDto> dtoList = entry.getValue();

				List<TagLabelDto> newDtoList = new ArrayList<TagLabelDto>();
				for (TagLabelDto dto : dtoList) {
					dto.setIsFirst("1");
					newDtoList.add(dto);
					TagLabelDto dto2 = dto.clone();
					dto2.setIsFirst("0");
					newDtoList.add(dto2);
				}

				newTagLabelDataMap.put(reportCd, newDtoList);
			}

			tagLabelDataMap = newTagLabelDataMap;
		}

		return tagLabelDataMap;
	}

	private CodFlg isCodYmt(MCarrierSlipYmt ymt) {

		if (ymt.isSlipType$2()) {
			return CodFlg.TRUE;
		}

		return CodFlg.FALSE;
	}

	private CodFlg isCodSgw(MCarrierSlipSgw sgw) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		CDef.SettlementType settlementType = sgw.getSettlementTypeAsSettlementType();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		if (settlementType != null) {
			switch (settlementType) {
			case $1:
			case $2:
			case $5:
				return CodFlg.TRUE;
			default:
				break;

			}
		}

		switch (CU.nullToStr(sgw.getApiDaibikiFlg())) {
		case "1":
			return CodFlg.TRUE;
		default:
			break;
		}

		return CodFlg.FALSE;
	}

	private CodFlg isCodYupk(MCarrierSlipYupk yupk) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		CDef.CodType codType = yupk.getCodTypeAsCodType();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		if (codType != null) {

			switch (codType) {
			case $2:
				return CodFlg.TRUE;
			default:
				break;

			}
		}

		return CodFlg.FALSE;
	}

	// [#528] 汎用荷札の代引金額が表示されない不具合を修正 2016.12.22 kawana Start

	private CodFlg isCod(long allocInstHId) {

		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setAllocInstHId_Equal(allocInstHId);
		cb.query().setCod_GreaterThan(0L);

		int codCount = tShippingInstHBhv.selectCount(cb);

		if (0 < codCount) {
			return CodFlg.TRUE;
		}

		return CodFlg.FALSE;
	}

	// [#528] 汎用荷札の代引金額が表示されない不具合を修正 2016.12.22 kawana End

	/**
	 * <h2>1枚目の帳票出力か判定.</h2>
	 */
	private FirstOutFlg isFirstOut(TPackingH packingH) {

		String pickingWorkNo = packingH.getTPickingH().getPickingWorkNo();

		String firstNo;
		if (firstPackingNoMap.containsKey(pickingWorkNo)) {
			// 既に検索済
			firstNo = firstPackingNoMap.get(pickingWorkNo);
		} else {
			// 一番小さい出荷梱包Noを検索

			TPackingHCB cb = tPackingHBhv.newMyConditionBean();
			cb.specify().columnShippingPackingNo();
			cb.checkInvalidQuery();
			cb.query().queryTPickingH().setCenterId_Equal(packingH.getCenterId());
			cb.query().queryTPickingH().setPickingWorkNo_Equal(pickingWorkNo);
			// [#5894][v3.1] 納品書在中・代引金額はケース荷札ではなくピース荷札が優先されるように変更 2019.01.16 kawana Start
			cb.query().addOrderBy_MixedFlg_Desc();
			// [#5894][v3.1] 納品書在中・代引金額はケース荷札ではなくピース荷札が優先されるように変更 2019.01.16 kawana End
			cb.query().addOrderBy_ShippingPackingNo_Asc();
			cb.fetchFirst(1);

			TPackingH firstEntity = tPackingHBhv.selectEntity(cb);
			firstNo = firstEntity.getShippingPackingNo();

			firstPackingNoMap.put(pickingWorkNo, firstNo);
		}

		if (firstNo.equals(packingH.getShippingPackingNo())) {
			return FirstOutFlg.TRUE;
		} else {
			return FirstOutFlg.FALSE;
		}
	}

	/**
	 * 帳票コードの取得
	 */
	private String getReportCd(MDeliveryCourse deliveryCourse, CodFlg codFlg, FirstOutFlg firstOutFlg, ErrorStatus errSts) {

		CenterTagType tagType = deliveryCourse.getTagTypeAsCenterTagType();
		String tagTypeAfter = deliveryCourse.getTagTypeAfter();

		if (codFlg == CodFlg.TRUE && firstOutFlg == FirstOutFlg.FALSE) {
			// 代引 かつ 2枚目

			if (!CU.isNullOrEmpty(tagTypeAfter)) {
				tagType = CenterTagType.codeOf(tagTypeAfter);
			}
		}

		if (tagType == null) {
			// 送り状種別未設定

			// エラー登録
			getErrorManager().add(errSts, WmsMessageConst.TAG_TYPE_NOT_FOUND_IN_DELIVERY_COURSE_ERROR, deliveryCourse.getDeliveryCourseCd());
			return null;
		}

		// 帳票CDに変換
		String reportCd = convertReportCd(tagType);

		return reportCd;
	}

	/**
	 * 荷札データ作成
	 */
	private void convertTagLabelDto(TagLabelDto dto, TPackingH packingH, TagLabelCls cls, CodFlg codFlg, FirstOutFlg firstOutFlg) {

		dto.cultureId = getCultureId();

		TAllocInstH allocH = packingH.getTPickingH().getTAllocInstH();
		MDeliveryCourse deliveryCourse = allocH.getMDeliveryCourse();
		MCarrier carrier = deliveryCourse.getMCarrier();
		MCommonCarrier commonCarrier = carrier.chaseMCommonCarrier();
		MClientCenter clientCenter = selectClientCenter(packingH.getCenterId(), packingH.getClientId());
		MParam param = clientCenter.getMParamAsOne();

		dto.setShippingSlipNo(getShippingSlipNo(allocH.getAllocInstHId()));
		dto.setClientShippingNo(getClientShippingNo(allocH.getAllocInstHId()));
		String shippingPackingNo = packingH.getShippingPackingNo();
		dto.setShippingPackingNo(shippingPackingNo);
		dto.setShippingPackingNoAbbr(WCU.subStringRight(shippingPackingNo, 5));
		dto.setShippingPackingNoBarcode(shippingPackingNo);

		List<TPackingH> packingNoList = getPackingNoList(packingH, cls);
		dto.setPackingNum(packingNoList.size());
		// 再梱包フラグ
		boolean rePackFlg = false;
		String firstCarrierTraceNo = CU.nullToStr(packingNoList.get(0).getCarrierTraceNum());
		int index = 1;
		for (TPackingH ph : packingNoList) {
			// 個口番号を設定
			if (CU.nullToStr(shippingPackingNo).equals(ph.getShippingPackingNo())) {
				dto.setPackingIndex(index);
				break;
			}
			index++;

			// 再梱包フラグを設定
			if (!firstCarrierTraceNo.equals(CU.nullToStr(ph.getCarrierTraceNum()))) {
				rePackFlg = true;
			}
		}

		if (!deliveryCourse.isTagType$4()) {
			// 佐川WebAPI以外

			String carrierTraceNo = getCarrierTraceNo(packingH, deliveryCourse, codFlg, firstOutFlg);
			dto.setCarrierTraceNum(carrierTraceNo);
			dto.setCarrierTraceNumBarcode(join(commonCarrier.getTrackingStartBit(), carrierTraceNo, commonCarrier.getTrackingEndBit()));
		} else {
			// 佐川WebAPI

			if (!rePackFlg) {
				// 個口数に変更なし

				// 現在の貨物追跡Noを設定
				dto.setCarrierTraceNum(packingH.getCarrierTraceNum());
			}
		}

		dto.setCarrierTraceNumBarcodeType(commonCarrier.getTrackingBarcode());
		dto.setCarrierTraceNumNumberingUnit(deliveryCourse.getTrackingNumberingUnit());
		// [#410] 送り状の重量、容積が合計値になっていない問題を修正 2016.12.12 kawana Start
		if (cls == TagLabelCls.SLIP) {
			// 送り状 - 全て重量・容積を合計する

			BigDecimal weight = WCC.ZERO;
			BigDecimal volume = WCC.ZERO;
			for (TPackingH ph : packingNoList) {
				weight = WCC.add(weight, CU.nullToZero(ph.getGrossWeight()));
				volume = WCC.add(volume, CU.nullToZero(ph.getTotalVolume()));
			}
			dto.setGrossWeight(weight);
			dto.setTotalVolume(volume);
		} else {
			// 通常 - 1箱分の重量・容積を設定

			dto.setGrossWeight(packingH.getGrossWeight());
			dto.setTotalVolume(packingH.getTotalVolume());
		}
		// [#410] 送り状の重量、容積が合計値になっていない問題を修正 2016.12.12 kawana End
		dto.setPickingWorkNo(packingH.getTPickingH().getPickingWorkNo());
		dto.setPickingWorkNoAbbr(WCU.subStringRight(packingH.getTPickingH().getPickingWorkNo(), 5));
		dto.setDelivUnitNo(packingH.getTPickingH().getDelivUnitNo());
		dto.setDelivUnitNoAbbr(WCU.subStringRight(packingH.getTPickingH().getDelivUnitNo(), 5));

		dto.setShippingDt(allocH.getShippingDt());
		dto.setDelivPlanDt(allocH.getDelivPlanDt());
		dto.setDelivDt(allocH.getDelivDt());
		String delivTz = convertDelivTz(allocH.getDelivTz(), deliveryCourse.getTagDataTypeAsCenterTagDataType());
		dto.setDelivTz(delivTz);
		dto.setDelivTzNm(convertDelivTzNm(delivTz, deliveryCourse.getTagDataTypeAsCenterTagDataType()));
		dto.setSupplyCustomerCd(allocH.getSupplyCustomerCd());
		dto.setSupplyCustomerNm(allocH.getSupplyCustomerNm());
		dto.setDelivCustomerCd(allocH.getDelivCustomerCd());
		dto.setDelivCustomerNm(allocH.getDelivCustomerNm());
		dto.setDelivZipCd(allocH.getDelivZipCd());
		// [#479][2.1.0-CT-082] 荷札出力項目 届先住所補足は荷札に出力しないように修正 2016.12.16 honma Start
		dto.setDelivAddress(CU.join("",
				CU.nullToStr(allocH.getDelivAddress1()),
				CU.nullToStr(allocH.getDelivAddress2()),
				CU.nullToStr(allocH.getDelivAddress3())));
		// [#479][2.1.0-CT-082] 荷札出力項目 届先住所補足は荷札に出力しないように修正 2016.12.16 honma End
		dto.setDelivAddress1(allocH.getDelivAddress1());
		dto.setDelivAddress2(allocH.getDelivAddress2());
		dto.setDelivAddress3(allocH.getDelivAddress3());
		dto.setDelivAddressSupply(allocH.getDelivAddressSupply());
		dto.setDelivTelNo(allocH.getDelivTelNo());

		dto.setDeliveryCourseCd(deliveryCourse.getDeliveryCourseCd());
		dto.setDeliveryCourseNm(deliveryCourse.getDeliveryCourseNm());

		dto.setCarrierCd(carrier.getCarrierCd());
		dto.setCarrierNm(carrier.getCarrierNm());

		MCarrierZip carrierZip = selectArrivalStoreCd(commonCarrier.getCommonCarrierId(), allocH.getDelivZipCd());
		if (carrierZip != null) {
			String arrivalStoreCd = carrierZip.getArrivalStoreCd();
			dto.setArrivalStoreCd(convertArrivalStoreCd(commonCarrier, arrivalStoreCd));
			dto.setArrivalStoreCdBarcode(convertArrivalStoreCdBarcode(commonCarrier, arrivalStoreCd));
			// [#494][Ver2.1.0-ONEsLOGI Cloud/WMS バグ・品質向上対策] 着店CD(バーコード)文字のスタートビット/エンドビット不要への対応 2016.12.20 honma Start
			dto.setArrivalStoreCdBarcodeText(convertArrivalStoreCdBarcodeText(commonCarrier, arrivalStoreCd));
			// [#494][Ver2.1.0-ONEsLOGI Cloud/WMS バグ・品質向上対策] 着店CD(バーコード)文字のスタートビット/エンドビット不要への対応 2016.12.20 honma End
			dto.setArrivalStoreCdBarcodeType(commonCarrier.getArrivalStoreBarcode());
			dto.setArrivalStoreNm(carrierZip.getArrivalStoreNm());
		}

		dto.setCenterNm(packingH.getMCenter().getCenterNm());
		MCustomer centerCustomer = clientCenter.chaseMCustomer();
		dto.setCenterTelNo(centerCustomer.getTelNo());
		dto.setCenterZipCd(centerCustomer.getZipCd());
		dto.setCenterAddress(CU.join("",
				CU.nullToStr(centerCustomer.getAddress1()),
				CU.nullToStr(centerCustomer.getAddress2()),
				CU.nullToStr(centerCustomer.getAddress3())));
		dto.setCenterAddress1(centerCustomer.getAddress1());
		dto.setCenterAddress2(centerCustomer.getAddress2());
		dto.setCenterAddress3(centerCustomer.getAddress3());
		dto.setClientNm(packingH.getMClient().getClientNm());

		dto.setBoxSizeCd(selectBoxSizeCd(carrier.getCarrierId(), packingH.chaseMBox().getBoxId()));
		dto.setBoxNm(packingH.chaseMBox().getBoxNm());

		if (cls == TagLabelCls.SLIP) {
			dto.setReprintFlg(nullToZeroStr(packingH.getTPickingH().getTPickingRAsOne().getSlipOutFlg()));
			dto.printFlg = nullToZeroStr(packingH.getTPickingH().getTPickingRAsOne().getSlipOutFlg());
		} else {
			dto.setReprintFlg(nullToZeroStr(packingH.getTPackingRAsOne().getTagOutFlg()));
			dto.printFlg = nullToZeroStr(packingH.getTPackingRAsOne().getTagOutFlg());
		}

		if (firstOutFlg == FirstOutFlg.TRUE) {
			// 1枚目の帳票のみ

			dto.setIsFirst("1");
			dto.setTagDeliveryOutFlg(nullToZeroStr(param.getTagDeliveryOutFlg()));

			if (codFlg == CodFlg.TRUE) {

				setCodInfo(dto, allocH.getAllocInstHId());
			} else {

				dto.setCod(0L);
				dto.setCodTax(0L);
			}
		} else {

			dto.setIsFirst("0");
			dto.setTagDeliveryOutFlg("0");
			dto.setCod(0L);
			dto.setCodTax(0L);
		}
		dto.setPackingCalCls(param.getPackingCalCls());
		dto.setMixedFlg(packingH.getMixedFlg());
	}

	private String getShippingSlipNo(long allocInstHId) {

		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.specify().columnShippingSlipNo();
		cb.checkInvalidQuery();
		cb.query().setAllocInstHId_Equal(allocInstHId);

		cb.query().addOrderBy_ShippingSlipNo_Asc().withNullsLast();
		cb.fetchFirst(1);

		TShippingInstH instH = tShippingInstHBhv.selectEntity(cb);
		return instH.getShippingSlipNo();
	}

	private String getClientShippingNo(long allocInstHId) {

		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.specify().columnClientShippingNo();
		cb.checkInvalidQuery();
		cb.query().setAllocInstHId_Equal(allocInstHId);

		cb.query().addOrderBy_ClientShippingNo_Asc().withNullsLast();
		cb.fetchFirst(1);

		TShippingInstH instH = tShippingInstHBhv.selectEntity(cb);
		return instH.getClientShippingNo();
	}

	private List<TPackingH> getPackingNoList(TPackingH packingH, TagLabelCls cls) {

		String pickingWorkNo = packingH.getTPickingH().getPickingWorkNo();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		MixedFlg mixedFlg = packingH.getMixedFlgAsMixedFlg();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		CarrierTraceNoKey carrierTraceNoKey = new CarrierTraceNoKey(pickingWorkNo, mixedFlg);

		if (packingNoListMap.containsKey(carrierTraceNoKey)) {
			return packingNoListMap.get(carrierTraceNoKey);
		}

		TPackingHCB cb = tPackingHBhv.newMyConditionBean();
		cb.specify().columnShippingPackingNo();
		cb.specify().columnCarrierTraceNum();
		cb.checkInvalidQuery();
		cb.query().queryTPickingH().setCenterId_Equal(packingH.getCenterId());
		cb.query().queryTPickingH().setPickingWorkNo_Equal(pickingWorkNo);

		// [#410] 送り状の重量、容積が合計値になっていない問題を修正 2016.12.12 kawana Start
		if (cls == TagLabelCls.SLIP) {
			// 送り状

			// 合計箱個数と一緒に合計数量、合計重量を計算する
			cb.specify().columnGrossWeight();
			cb.specify().columnTotalVolume();
		} else {
			// 通常の荷札出力

			// ケース・ピース毎に箱個数を計算するため混載フラグを条件に設定
			// (送り状は1出庫作業No.で1枚のため混載フラグの条件は不要)
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			cb.query().setMixedFlg_Equal_AsMixedFlg(mixedFlg);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		}
		// [#410] 送り状の重量、容積が合計値になっていない問題を修正 2016.12.12 kawana End
		cb.query().addOrderBy_ShippingPackingNo_Asc();

		List<TPackingH> phList = tPackingHBhv.selectList(cb);

		packingNoListMap.put(carrierTraceNoKey, phList);
		return phList;
	}

	/**
	 * 追跡番号の取得または採番
	 */
	private String getCarrierTraceNo(TPackingH packingH, MDeliveryCourse deliveryCourse, CodFlg codFlg, FirstOutFlg firstOutFlg) {

		String carrierTraceNo = packingH.getCarrierTraceNum();

		if (!CU.isNullOrEmpty(carrierTraceNo)) {
			// 設定済

			return carrierTraceNo;
		}

		String key = deliveryCourse.getTrackingNumberingKey();
		String keyAfter = deliveryCourse.getTrackingNumberingAfterKey();

		String bizCd = key;

		if (deliveryCourse.isTrackingNumberingUnit$2()) {
			// 梱包単位

			if (codFlg == CodFlg.TRUE && firstOutFlg == FirstOutFlg.FALSE) {
				// 代引 かつ 2枚目以降

				if (!CU.isNullOrEmpty(keyAfter)) {
					bizCd = keyAfter;
				}
			}
		} else {
			// 出庫作業No単位

			String pickingWorkNo = packingH.getTPickingH().getPickingWorkNo();
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			MixedFlg mixedFlg = packingH.getMixedFlgAsMixedFlg();
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			CarrierTraceNoKey carrierTraceNoKey = new CarrierTraceNoKey(pickingWorkNo, mixedFlg);

			if (carrierTraceNoMap.containsKey(carrierTraceNoKey)) {

				carrierTraceNo = carrierTraceNoMap.get(carrierTraceNoKey);
			} else {

				// 既に採番済の値を取得
				TPackingHCB cb = tPackingHBhv.newMyConditionBean();
				cb.specify().columnCarrierTraceNum();
				cb.checkInvalidQuery();
				cb.query().queryTPickingH().setCenterId_Equal(packingH.getCenterId());
				cb.query().queryTPickingH().setPickingWorkNo_Equal(pickingWorkNo);
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				cb.query().setMixedFlg_Equal_AsMixedFlg(mixedFlg);
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				cb.query().setCarrierTraceNum_IsNotNull();
				cb.fetchFirst(1);

				TPackingH ph = tPackingHBhv.selectEntity(cb);
				if (ph != null) {
					// 採番済の追跡番号を返却
					carrierTraceNo = ph.getCarrierTraceNum();
					carrierTraceNoMap.put(carrierTraceNoKey, carrierTraceNo);
				}
			}
		}

		if (CU.isNullOrEmpty(carrierTraceNo)) {

			if (CU.isNullOrEmpty(bizCd)) {
				// 追跡番号キーの設定なし
				return null;
			}

			// 採番
			carrierTraceNo = numberingLogic.getNumbering(packingH.getCenterId(), bizCd);
		}

		// 梱包ヘッダ更新
		packingH.setCarrierTraceNum(carrierTraceNo);
		tPackingHBhv.update(packingH);

		return carrierTraceNo;
	}

	private String convertDelivTz(String delivTz, CenterTagDataType centerTagDataType) {

		if (CU.isNullOrEmpty(delivTz) || centerTagDataType == null) {
			return delivTz;
		}

		CarrierCls carrierCls;
		switch (centerTagDataType) {
		case $1:
			// B2
			carrierCls = CarrierCls.YAMATO;
			break;
		case $2:
		case $3:
			// E飛伝
			carrierCls = CarrierCls.SAGAWA;
			break;
		case $4:
		case $5:
			// ゆうパック
			carrierCls = CarrierCls.YU_PACK;
			if (CU.isNullOrEmpty(delivTz)) {
				delivTz = "empty";
			}
			break;
		default:
			return delivTz;
		}

		return matchingLogic.convertDelivTzWmsToCarrier(carrierCls, delivTz);
	}

	private String convertDelivTzNm(String delivTz, CenterTagDataType centerTagDataType) {

		if (CU.isNullOrEmpty(delivTz)) {
			return delivTz;
		}

		String classCd;
		if (centerTagDataType == null) {
			classCd = "DELIV_TZ";
		} else {
			switch (centerTagDataType) {
			case $1:
				// B2
				classCd = "YAMATO_DELIV_TZ";
				break;
			case $2:
			case $3:
				// E飛伝
				classCd = "SAGAWA_DELIV_TZ";
				break;
			case $4:
			case $5:
				// E飛伝
				classCd = "YUPACK_DELIV_TZ";
				break;
			default:
				classCd = "DELIV_TZ";
				break;
			}
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe Start
		BClass ccCb = new BClass();
		ccCb.setClassCd(classCd);
		BClassDtl ccdCb = new BClassDtl();
		ccdCb.setClassDtlCd(delivTz);

		BClassDtl centerClassDtl = centerClassLogic.getDtlUkEntity(ccCb, ccdCb);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe End
		if (centerClassDtl == null) {
			return null;
		}

		return centerClassDtl.chaseVDict().getDictNm();
	}

	private MCarrierZip selectArrivalStoreCd(Long commonCarrierId, String zipCd) {
		if (commonCarrierId == null || CU.isNullOrEmpty(zipCd)) {
			return null;
		}

		MCarrierZipCB cb = mCarrierZipBhv.newMyConditionBean();
		cb.specify().columnArrivalStoreCd();
		cb.specify().columnArrivalStoreNm();
		cb.checkInvalidQuery();
		cb.query().setCommonCarrierId_Equal(commonCarrierId);
		cb.query().queryMZip().setZipCd_Equal(zipCd);

		MCarrierZip carrierZip = mCarrierZipBhv.selectEntity(cb);

		return carrierZip;
	}

	private String convertArrivalStoreCd(MCommonCarrier mCommonCarrier, String arrivalStoreCd) {

		if (CU.isNullOrEmpty(arrivalStoreCd)) {
			return "";
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		ArrivalStoreFormat format = mCommonCarrier.getArrivalStoreFormatAsArrivalStoreFormat();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

		if (format == null) {
			return arrivalStoreCd;
		}

		String[] cds;
		switch (format) {
		case $YMTFMT:
			// 先頭の「0」を削除
			if (arrivalStoreCd.indexOf("0") == 0) {
				arrivalStoreCd = arrivalStoreCd.substring(1);
			}
			cds = WCU.splitLen(arrivalStoreCd, 2);
			arrivalStoreCd = CU.join("-", cds);

			return arrivalStoreCd;
		case $YUPKFMT:
			cds = WCU.splitLen(arrivalStoreCd, 2);
			arrivalStoreCd = CU.join("-", cds);

			return arrivalStoreCd;
		default:
			return arrivalStoreCd;
		}
	}

	private String convertArrivalStoreCdBarcode(MCommonCarrier mCommonCarrier, String arrivalStoreCd) {

		if (CU.isNullOrEmpty(arrivalStoreCd)) {
			return "";
		}

		if (mCommonCarrier.isArrivalStoreFormat$YMTFMT()) {
			// 7DRディジットを末尾に付加

			int intStoreCd = Integer.valueOf(arrivalStoreCd);
			int digit = intStoreCd % 7;

			arrivalStoreCd = new StringBuilder().append(arrivalStoreCd).append(digit).toString();
		}

		return CU.join("", CU.nullToStr(mCommonCarrier.getArrivalStoreStartBit()), CU.nullToStr(arrivalStoreCd), CU.nullToStr(mCommonCarrier.getArrivalStoreEndBit()));
	}

	// [#494][Ver2.1.0-ONEsLOGI Cloud/WMS バグ・品質向上対策] 着店CD(バーコード)文字のスタートビット/エンドビット不要への対応 2016.12.20 honma Start
	private String convertArrivalStoreCdBarcodeText(MCommonCarrier mCommonCarrier, String arrivalStoreCd) {

		if (CU.isNullOrEmpty(arrivalStoreCd)) {
			return "";
		}

		if (mCommonCarrier.isArrivalStoreFormat$YMTFMT()) {
			// 7DRディジットを末尾に付加

			int intStoreCd = Integer.valueOf(arrivalStoreCd);
			int digit = intStoreCd % 7;

			arrivalStoreCd = new StringBuilder().append(arrivalStoreCd).append(digit).toString();
		}

		return CU.nullToStr(arrivalStoreCd);
	}

	// [#494][Ver2.1.0-ONEsLOGI Cloud/WMS バグ・品質向上対策] 着店CD(バーコード)文字のスタートビット/エンドビット不要への対応 2016.12.20 honma End

	private MClientCenter selectClientCenter(long centerId, long clientId) {
		MClientCenter conditionEntity = new MClientCenter();
		conditionEntity.setClientId(clientId);
		conditionEntity.setCenterId(centerId);

		return clientCenterLogic.getUkEntityWithCustomerCacheable(conditionEntity);
	}

	private String selectBoxSizeCd(Long carrierId, Long boxId) {

		if (carrierId == null || boxId == null) {
			return "";
		}

		MCarrierBoxCB cb = mCarrierBoxBhv.newMyConditionBean();
		cb.specify().columnBoxSizeCd();
		cb.checkInvalidQuery();
		cb.query().setCarrierId_Equal(carrierId);
		cb.query().setBoxId_Equal(boxId);

		MCarrierBox cBox = mCarrierBoxBhv.selectEntity(cb);
		if (cBox == null) {
			return "";
		}

		return cBox.getBoxSizeCd();
	}

	private void setCodInfo(TagLabelDto dto, long allocInstHId) {

		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.specify().columnCod();
		cb.specify().columnCodTax();
		cb.checkInvalidQuery();
		cb.query().setAllocInstHId_Equal(allocInstHId);

		cb.query().addOrderBy_Cod_Desc().withNullsLast();
		cb.fetchFirst(1);

		TShippingInstH instH = tShippingInstHBhv.selectEntity(cb);

		if (instH == null) {
			return;
		}

		dto.setCod(CU.nullToZero(instH.getCod()));
		dto.setCodTax(CU.nullToZero(instH.getCodTax()));
	}

	private void convertTagLabelYmtDto(TagLabelYmtDto dto, MCarrierSlipYmt ymt) {
		dto.setTagType(ymt.getTagType());
		dto.setTagNm(ymt.getTagNm());
		dto.setCharacterCd(ymt.getCharacterCd());
		dto.setSlipType(ymt.getSlipType());
		dto.setCoolCls(ymt.getCoolCls());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		dto.setCoolClsNm(ymt.chaseBClassDtlByCoolCls().chaseVDict().getDictNm());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		dto.setHonorific(ymt.getHonorific());
		dto.setPackingShowFlg(ymt.getPackingShowFlg());
		dto.setSlipClientTelNo(ymt.getSlipClientTelNo());
		dto.setSlipClientZipCd(ymt.getSlipClientZipCd());
		dto.setSlipClientAddress1(ymt.getSlipClientAddress1());
		dto.setSlipClientAddress2(ymt.getSlipClientAddress2());
		dto.setSlipClientAddress3(ymt.getSlipClientAddress3());
		dto.setSlipClientAddress4(ymt.getSlipClientAddress4());
		dto.setSlipClientNm(ymt.getSlipClientNm());
		dto.setSlipItemCd1(ymt.getSlipItemCd1());
		dto.setSlipItemNm1(ymt.getSlipItemNm1());
		dto.setSlipItemCd2(ymt.getSlipItemCd2());
		dto.setSlipItemNm2(ymt.getSlipItemNm2());
		dto.setFreightHandling1(ymt.getFreightHandling1());
		dto.setFreightHandling2(ymt.getFreightHandling2());
		dto.setArticle(ymt.getArticle());
		dto.setBillingCustomerCd(ymt.getBillingCustomerCd());
		dto.setFareNo(ymt.getFareNo());
		dto.setSendCd(ymt.getSendCd());
	}

	private void convertTagLabelSgwDto(TagLabelSgwDto dto, MCarrierSlipSgw sgw) {
		dto.setTagType(sgw.getTagType());
		dto.setTagNm(sgw.getTagNm());
		dto.setCharacterCd(sgw.getCharacterCd());
		dto.setSlipCustomerCd(sgw.getSlipCustomerCd());
		dto.setWebApiRequestUrl(sgw.getWebApiRequestUrl());
		dto.setCustomerId(sgw.getCustomerId());
		dto.setLoginPassword(sgw.getLoginPassword());
		dto.setDeptConsignorNm(sgw.getDeptConsignorNm());
		dto.setConsignorTelNo(sgw.getConsignorTelNo());
		dto.setSlipClientTelNo(sgw.getSlipClientTelNo());
		dto.setSlipClientZipCd(sgw.getSlipClientZipCd());
		dto.setSlipClientAddress1(sgw.getSlipClientAddress1());
		dto.setSlipClientAddress2(sgw.getSlipClientAddress2());
		dto.setSlipClientNm1(sgw.getSlipClientNm1());
		dto.setSlipClientNm2(sgw.getSlipClientNm2());
		dto.setSlipShapeCd(sgw.getSlipShapeCd());
		dto.setSlipItemNm1(sgw.getSlipItemNm1());
		dto.setSlipItemNm2(sgw.getSlipItemNm2());
		dto.setSlipItemNm3(sgw.getSlipItemNm3());
		dto.setSlipItemNm4(sgw.getSlipItemNm4());
		dto.setSlipItemNm5(sgw.getSlipItemNm5());
		dto.setTransportTypeSpeed(sgw.getTransportTypeSpeed());
		dto.setTransportTypeItem(sgw.getTransportTypeItem());
		dto.setSettlementType(sgw.getSettlementType());
		dto.setSealType1(sgw.getSealType1());
		dto.setSealType2(sgw.getSealType2());
		dto.setSealType3(sgw.getSealType3());
		dto.setCodCls(sgw.getCodCls());
		dto.setSendCd(sgw.getSendCd());
		dto.setApiOkuriCode(sgw.getApiOkuriCode());
		dto.setApiBinsyuCode(sgw.getApiBinsyuCode());
		dto.setApiDaibikiFlg(sgw.getApiDaibikiFlg());
		dto.setApiDaibikiType(sgw.getApiDaibikiType());
		dto.setApiWeightCd1(sgw.getApiWeightCd1());
		dto.setApiWeightCd2(sgw.getApiWeightCd2());
		dto.setApiEidomeFlg(sgw.getApiEidomeFlg());
	}

	private void convertTagLabelYupkDto(TagLabelYupkDto dto, MCarrierSlipYupk yupk) {
		dto.setTagType(yupk.getTagType());
		dto.setTagNm(yupk.getTagNm());
		dto.setCharacterCd(yupk.getCharacterCd());
		dto.setPostType(yupk.getPostType());
		dto.setCoolType(yupk.getCoolType());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		dto.setCoolTypeNm(yupk.chaseBClassDtlByCoolType().chaseVDict().getDictNm());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		dto.setCodType(yupk.getCodType());
		dto.setCarrierType(yupk.getCarrierType());
		dto.setSlipClientZipCd(yupk.getSlipClientZipCd());
		dto.setSlipClientAddress1(yupk.getSlipClientAddress1());
		dto.setSlipClientAddress2(yupk.getSlipClientAddress2());
		dto.setSlipClientAddress3(yupk.getSlipClientAddress3());
		dto.setSlipClientNm1(yupk.getSlipClientNm1());
		dto.setSlipClientTelNo(yupk.getSlipClientTelNo());
		dto.setSlipClientMail(yupk.getSlipClientMail());
		dto.setNoUpsideDownCls(yupk.getNoUpsideDownCls());
		dto.setNoStockCls(yupk.getNoStockCls());
		dto.setSlipProductSizeCls(yupk.getSlipProductSizeCls());
		dto.setSlipProductNo(yupk.getSlipProductNo());
		dto.setSlipItemNm(yupk.getSlipItemNm());
		dto.setShipReserveDataMark(yupk.getShipReserveDataMark());
		dto.setDeliCertPreYears(yupk.getDeliCertPreYears());
		dto.setSendNm(yupk.getSendNm());
	}

	/**
	 * 帳票発行実行 (画面経由)
	 */
	@SuppressWarnings("unchecked")
	private void excecPrint(PrintParamDto printParamDto, List<?> data, PrintDataType dataType, ErrorStatus errSts) {

		switch (dataType) {
		case DATA:
			JSON json = new JSON();
			json.setSuppressNull(true);
			printParamDto.printBasicData.outputData = json.format(data);
			break;
		case PDF:
			printParamDto.printBasicData.addOutputFileList(OutputFileType.ProtectPdf, ((List<File>) data));
			break;
		}

		try {
			printLogic.print(printParamDto);
		} catch (Exception e) {
			// エラー登録
			getErrorManager().add(errSts, WmsMessageConst.REPORT_PRINT_CANNOT_EXECUTE_ERROR);
			e.printStackTrace();
			return;
		}
	}

	/**
	 * 帳票発行実行 (自動印刷)
	 */
	@SuppressWarnings("unchecked")
	private void excecAutoPrint(String reportCd, List<?> data, PrintDataType dataType, ErrorStatus errSts) {

		//帳票発行処理
		try {
			AutoPrintAddQueueResult result = null;
			switch (dataType) {
			case DATA:
				JSON json = new JSON();
				json.setSuppressNull(true);
				result = autoPrintLogic.print(reportCd, json.format(data));
				break;
			case PDF:
				result = autoPrintLogic.printProtectPdf(reportCd, ((List<File>) data));
				break;
			}

			if (result.isError()) {
				// [Ver3.0][#4776]プリンタが設定されていない場合明示的にエラーを表示する 2018.06.29 matsumoto Start
				for (AutoPrintAddQueueResultDetail resultError : result.getResultDetails()) {
					if (resultError.getFieldNm() != null && resultError.getFieldNm().equals("PRINTER_GROUP_ID")) {
						getErrorManager().add(errSts,WmsMessageConst.CAN_NOT_PRINT_PRINTER_NOT_SET_ERROR);
						return;
					}
				}
				// [Ver3.0][#4776]プリンタが設定されていない場合明示的にエラーを表示する 2018.06.29 matsumoto End
				// エラー登録
				getErrorManager().add(errSts, WmsMessageConst.REPORT_PRINT_CANNOT_EXECUTE_ERROR);
				return;
			}
		} catch (Exception e) {
			// エラー登録
			getErrorManager().add(errSts, WmsMessageConst.REPORT_PRINT_CANNOT_EXECUTE_ERROR);
			e.printStackTrace();
			return;
		}
	}

	/**
	 * 荷札出力フラグ更新(出力済に更新)
	 */
	private void updateTagOutFlg(List<TPackingH> printDataList) {

		// ===== 更新条件 =====

		TPackingRCB cb = tPackingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		// [#6634][v3.1] 他センタを送り状出力フラグを更新してしまう不具合を修正 2019.07.30 kawana Start
		cb.query().setPackingHId_InScope(tPackingHBhv.extractPackingHIdList(printDataList));
		// [#6634][v3.1] 他センタを送り状出力フラグを更新してしまう不具合を修正 2019.07.30 kawana End

		// ===== 更新値 =====

		TPackingR packingR = new TPackingR();
		packingR.setTagOutFlg_$1();
		packingR.setTagOutUserId(this.getUserId());
		Timestamp time = new Timestamp(System.currentTimeMillis());
		packingR.setTagOutDt(time);

		// ===== 更新実行 =====
		// 同時実行でデッドロックが発生したため日次用のデッドロック対策メソッドを使用
		queryUpdateLogic.queryUpdateWithSelect(tPackingRBhv, packingR, cb, queryUpdateSettingsLogic.getQuerySetter(tPackingRBhv));
	}

	/**
	 * 送状出力フラグ更新(出力済に更新)
	 */
	private void updateSlipOutFlg(List<TPackingH> printDataList) {

		// ===== 更新条件 =====

		// [#6634][v3.1] 他センタを送り状出力フラグを更新してしまう不具合を修正 2019.07.30 kawana Start
		// 出庫ヘッダIDを抜粋
		Set<Long> pickingHIdSet = new HashSet<Long>();
		for (TPackingH packingH : printDataList) {
			pickingHIdSet.add(packingH.getPickingHId());
		}
		// [#6634][v3.1] 他センタを送り状出力フラグを更新してしまう不具合を修正 2019.07.30 kawana End

		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		// [#6634][v3.1] 他センタを送り状出力フラグを更新してしまう不具合を修正 2019.07.30 kawana Start
		cb.query().setPickingHId_InScope(pickingHIdSet);
		// [#6634][v3.1] 他センタを送り状出力フラグを更新してしまう不具合を修正 2019.07.30 kawana End

		// ===== 更新値 =====

		TPickingR entity = new TPickingR();
		entity.setSlipOutFlg_$1();
		entity.setSlipOutUserId(this.getUserId());
		Timestamp time = new Timestamp(System.currentTimeMillis());
		entity.setSlipOutDt(time);

		// ===== 更新実行 =====
		// 同時実行でデッドロックが発生したため日次用のデッドロック対策メソッドを使用
		queryUpdateLogic.queryUpdateWithSelect(tPickingRBhv, entity, cb, queryUpdateSettingsLogic.getQuerySetter(tPickingRBhv));
	}

	/**
	 * 送り状種別から帳票CDへ変換
	 */
	private String convertReportCd(CenterTagType tagType) {

		switch (tagType) {
		case $1:
			return REPORT_CD_TAG_COMMON;
		case $2:
			return REPORT_CD_TAG_YMT;
		case $3:
			return REPORT_CD_TAG_YMT_COD;
		case $4:
			return REPORT_CD_TAG_SGW_API;
		case $5:
			return REPORT_CD_TAG_YUPK;
		case $6:
			return REPORT_CD_TAG_YUPKT;
		default:
			getErrorManager().throwException(new IllegalStateException("TagType is illegal."));
			return "";
		}
	}

	private String nullToZeroStr(String str) {
		if (CU.isNullOrEmpty(str)) {
			return "0";
		}

		return str;
	}

	private String join(String... strs) {
		if (strs == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder();
		for (String str : strs) {
			if (str == null) {
				continue;
			}
			sb.append(str);
		}

		return sb.toString();
	}
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	private static class CarrierTraceNoKey {

		private String pickingWorkNo;
		private CDef.MixedFlg mixedFlg;

		public CarrierTraceNoKey(String pickingWorkNo, CDef.MixedFlg mixedFlg) {
			this.pickingWorkNo = pickingWorkNo;
			this.mixedFlg = mixedFlg;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((mixedFlg == null) ? 0 : mixedFlg.hashCode());
			result = prime * result + ((pickingWorkNo == null) ? 0 : pickingWorkNo.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CarrierTraceNoKey other = (CarrierTraceNoKey) obj;
			if (mixedFlg != other.mixedFlg)
				return false;
			if (pickingWorkNo == null) {
				if (other.pickingWorkNo != null)
					return false;
			} else if (!pickingWorkNo.equals(other.pickingWorkNo))
				return false;
			return true;
		}

	}
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
}
