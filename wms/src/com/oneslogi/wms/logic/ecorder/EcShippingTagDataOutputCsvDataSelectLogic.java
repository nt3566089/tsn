package com.oneslogi.wms.logic.ecorder;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerListHandler;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.MCarrierBoxCB;
import com.oneslogi.base.dbflute.cbean.MImportTypeBCB;
import com.oneslogi.base.dbflute.cbean.MImportTypeBCopyHCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderHCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierBoxBhv;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBBhv;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierBox;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYmt;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.base.dbflute.exentity.MImportTypeB;
import com.oneslogi.base.dbflute.exentity.MImportTypeBCopyH;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TEcOrderH;
import com.oneslogi.base.dbflute.exentity.TEcOrderR;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.ecorder.EcShinppingTagDataOutPutInvoceDataCountDto;
import com.oneslogi.wms.logic.common.MatchingLogic;
import com.oneslogi.wms.util.WCU;

/**
 * EC送り状CSVファイルのデータ取得ロジッククラス
 */
public class EcShippingTagDataOutputCsvDataSelectLogic extends AbstractWmsLogic {

	public static final String CHARSETS = "MS932";

	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.14 nayzaw Start
	public static final String FILE_IDENTIFICATION_CODE = "DENFD";

	public static final String BOX_SIZE_60 = "60";

	public static final String BOX_SIZE_060 = "060";

	public static final String BOX_SIZE_80 = "80";

	public static final String BOX_SIZE_080 = "080";
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.14 nayzaw End

	// ===== 使用テーブル =====
	@Inject
	private TEcOrderHBhv tEcOrderHBhv;
	// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動に伴い楽天RMS受注のテーブル結合を削除 2015.05.18 kawana
	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
	@Inject
	private MImportTypeBhv mImportTypeBhv;
	@Inject
	private MImportTypeBBhv mImportTypeBBhv;
	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  Start
	@Inject
	private TPackingHBhv tPackingHBhv;
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  End
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.29 nayzaw Start
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.29 nayzaw End
	//[ON推-品向-1183] 修正対応 2016.08.17 chou Add Start
	@Inject
	private MCarrierBoxBhv mCarrierBoxBhv;
	//[ON推-品向-1183] 修正対応 2016.08.17 chou Add End

	// ===== 使用ロジッククラス =====
	@Inject
	private EcOrderMergeLogic mergeLogic;
	@Inject
	private MatchingLogic matchingLogic;

	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
	/**
	 * EC受注ヘッダ取込情報クラス
	 */
	static class EcHeaderImportInfo {

		// インスタンスMAP
		private static Map<Long, EcHeaderImportInfo> instances = new HashMap<Long, EcHeaderImportInfo>();

		long versionNo;
		boolean isImportSlipItemNm1 = false;
		boolean isImportSlipItemNm2 = false;
		boolean isImportSlipItemNm3 = false;
		boolean isImportSlipItemNm4 = false;
		boolean isImportSlipItemNm5 = false;
		boolean isImportSlipItemCd1 = false;
		boolean isImportSlipItemCd2 = false;
		boolean isImportFreightHandling1 = false;
		boolean isImportFreightHandling2 = false;
		boolean isImportArticle = false;

		private EcHeaderImportInfo() {
		}

		/**
		 * 取込種別ボディの定義から
		 * EC受注ヘッダの取込情報を設定する
		 */
		private EcHeaderImportInfo(TEcOrderH ecOrderH) {
			setInfo(ecOrderH);
		}

		/**
		 * <h2>EC受注ヘッダ取込情報の設定を行う。</h2>
		 * <pre>
		 * 取込種別ボディの定義から
		 * EC受注ヘッダの取込情報を設定する。
		 * </pre>
		 * @param ecOrderH EC受注ヘッダ(取込種別ボディまで結合したもの)
		 */
		public void setInfo(TEcOrderH ecOrderH) {

			for (MImportTypeB imb : ecOrderH.getMImportType().getMImportTypeBList()) {

				// アップロード列名
				String uploadColumnNm = CU.nullToStr(imb.getUploadColumnNm());
				// 列名から取込情報を設定
				setInfo_a(uploadColumnNm);

				// EC受注ヘッダコピーマスタの繰返
				for (MImportTypeBCopyH copyH : imb.getMImportTypeBCopyHList()) {
					// コピー列名
					String copyColumnNm = CU.nullToStr(copyH.getCopyHColumnNm());
					// 列名から取込情報を設定
					setInfo_a(copyColumnNm);
				}
			}

			versionNo = ecOrderH.getMImportType().getVersionNo();
		}

		/**
		 * 列名からEC受注ヘッダの取込情報を設定する
		 * @param columnNm 列名
		 */
		private void setInfo_a(String columnNm) {
			if (columnNm.equals("slipItemNm1")) {
				isImportSlipItemNm1 = true;
			}

			if (columnNm.equals("slipItemNm2")) {
				isImportSlipItemNm2 = true;
			}

			if (columnNm.equals("slipItemNm3")) {
				isImportSlipItemNm3 = true;
			}

			if (columnNm.equals("slipItemNm4")) {
				isImportSlipItemNm4 = true;
			}

			if (columnNm.equals("slipItemNm5")) {
				isImportSlipItemNm5 = true;
			}

			if (columnNm.equals("slipItemCd1")) {
				isImportSlipItemCd1 = true;
			}

			if (columnNm.equals("slipItemCd2")) {
				isImportSlipItemCd2 = true;
			}

			if (columnNm.equals("freightHandling1")) {
				isImportFreightHandling1 = true;
			}

			if (columnNm.equals("freightHandling2")) {
				isImportFreightHandling2 = true;
			}

			if (columnNm.equals("article")) {
				isImportArticle = true;
			}
		}

		/**
		 * 取込種別ボディの定義から
		 * EC受注ヘッダの取込情報を設定しインスタンスを取得する。
		 * <pre>
		 * 一度生成したインスタンスはクラス内で保持し、
		 * 同じ取込種別の場合は保持しているインスタンスを返却する。
		 * 取込種別マスタ(ヘッダ)のVersionNoが変更されている場合はインスタンスを再生成する。
		 * VersionNoを変更せずに変更した場合は反映されないので注意が必要
		 * (画面からではなく直接DBを変更した場合)
		 * </pre>
		 *
		 * @param ecOrderH EC受注ヘッダ(取込種別ボディまで結合したもの)
		 * @return EcHeaderImportInfo EC受注ヘッダ取込情報クラス
		 */
		public static EcHeaderImportInfo getInstance(TEcOrderH ecOrderH) {
			long importTypeId = ecOrderH.getImportTypeId();
			long versionNo = ecOrderH.getMImportType().getVersionNo();
			EcHeaderImportInfo info = instances.get(importTypeId);
			if (info == null) {
				// インスタンス未作成
				info = new EcHeaderImportInfo(ecOrderH);
				instances.put(importTypeId, info);
			} else {
				if (versionNo != info.versionNo) {
					// 変更あり

					// インスタンス再生成
					info = new EcHeaderImportInfo(ecOrderH);
					instances.put(importTypeId, info);
				}
			}

			return info;
		}
	}

	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End

	/**
	 * <h2>CSVデータ出力起動時処理の出荷ステータス状態チェックを行う。</h2>
	 * <pre>
	 * 引数shippingInstHListの件数が0の場合、致命的例外をスローし、リターンする。
	 * CSVデータ出力起動時、出荷指示ヘッダリスト.出荷ステータスのチェックを行う。
	 * 出荷ステータスが未出荷、キャンセルまたはエラー有の場合、
	 * 受注データは送り状データを作成できないエラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param shippingInstHList 出荷指示ヘッダリスト：出荷ステータス
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipStatusCheck(List<TShippingInstH> shippingInstHList, ErrorStatus errSts) {
		// ===== shippingInstHListの件数＝0の場合 =====
		if (shippingInstHList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return;
		}
		// ===== CSVデータ出力起動時処理 =====
		for (TShippingInstH head : shippingInstHList) {
			// 未出荷またはキャンセルまたはエラー有の受注データは送り状データを作成できません。
			if (head.isShippingStatus$10() || head.isShippingStatus$90() || head.isShippingStatus$99()) {
				// ===== エラーメッセージをエラー管理クラスに登録 =====
				this.getErrorManager().add(errSts, WmsMessageConst.EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_INVOICE_CREATE_NOT_SHIPPING_ERROR);
				return;
			}
		}
	}

	/**
	 * <h2>EC送り状用の各CSVファイルのデータ件数とCSVファイル名称を取得する。</h2>
	 * <pre>
	 * EC送り状用の各CSVファイルのデータ件数とCSVファイル名称を取得し、戻り値に設定する。
	 * </pre>
	 * @param ecOrderR EC受注帳票：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return EcShinppingTagDataOutPutInvoceDataCountDto EC送り状用の各CSVファイルのデータ件数取得用DTO
	 * */
	public EcShinppingTagDataOutPutInvoceDataCountDto carrierSlipDataCountSelect(final TEcOrderR ecOrderR, ErrorStatus errSts) {

		// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する(使用変数の移動) 2015.08.10 kawana

		EcShinppingTagDataOutPutInvoceDataCountDto dto = new EcShinppingTagDataOutPutInvoceDataCountDto();

		// ===== EC送り状各CSVファイルのデータ件数取得 =====
		TEcOrderHCB cb = tEcOrderHBhv.newMyConditionBean();
		// テーブル結合
		cb.setupSelect_TEcOrderRAsOne();
		cb.setupSelect_TShippingInstH();
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCarrier();
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/05  Start
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCenterClassDtlByTagDataType(getCenterClassCondition()).withVDict(getCultureId());
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/05  End
		// 検索条件
		cb.query().queryTEcOrderRAsOne().setControlNo_Equal(ecOrderR.getControlNo());
		List<TEcOrderH> resultList = tEcOrderHBhv.selectList(cb);

		// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する(共通処理を関数抜出) 2015.08.10 kawana Start
		// 運送業者ごとの件数をDTOに設定
		setCarrierCount(resultList, dto);
		// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する(共通処理を関数抜出) 2015.08.10 kawana End

		return dto;
	}

	// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana Start
	/**
	 * <h2>EC送り状用の各CSVファイルのデータ件数とCSVファイル名称を取得する。</h2>
	 * <pre>
	 * EC送り状用の各CSVファイルのデータ件数とCSVファイル名称を取得し、戻り値に設定する。
	 * </pre>
	 * @param ecOrderHList EC受注ヘッダリスト：EC受注ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return EcShinppingTagDataOutPutInvoceDataCountDto EC送り状用の各CSVファイルのデータ件数取得用DTO
	 * */
	public EcShinppingTagDataOutPutInvoceDataCountDto carrierSlipDataCountSelect(final List<TEcOrderH> ecOrderHList, ErrorStatus errSts) {

		EcShinppingTagDataOutPutInvoceDataCountDto dto = new EcShinppingTagDataOutPutInvoceDataCountDto();

		// 検索対象のEC受注ヘッダIDを抽出
		Set<Long> idSet = new HashSet<Long>();
		for (TEcOrderH h : ecOrderHList) {
			idSet.add(h.getEcOrderHId());
		}

		if (idSet.size() == 0) {
			dto.setAllCarrierSlipIdIsOK(false);
			dto.setYamatoInvoceDataCount(0);
			dto.setSagawaInvoceDataCount(0);
			dto.setYupkInvoceDataCount(0);
			dto.setYamatoCsvFileName("");
			dto.setSagawaCsvFileName("");
			dto.setYupkCsvFileName("");
			return dto;
		}

		// ===== EC送り状各CSVファイルのデータ件数取得 =====
		TEcOrderHCB cb = tEcOrderHBhv.newMyConditionBean();
		// テーブル結合
		cb.setupSelect_TEcOrderRAsOne();
		cb.setupSelect_TShippingInstH();
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCarrier();
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/05  Start
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCenterClassDtlByTagDataType(getCenterClassCondition()).withVDict(getCultureId());
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/05  End

		// 検索条件
		cb.query().setEcOrderHId_InScope(idSet);

		// 検索実行
		List<TEcOrderH> resultList = tEcOrderHBhv.selectList(cb);

		// 運送業者ごとの件数をDTOに設定
		setCarrierCount(resultList, dto);

		return dto;
	}

	/**
	 * 運送業者ごとに件数をカウントしDTOに設定する
	 *
	 * @param ecOrderList カウント対象のリスト
	 * @param setDto 設定するDTO
	 */
	private void setCarrierCount(List<TEcOrderH> ecOrderList, EcShinppingTagDataOutPutInvoceDataCountDto setDto) {
		if (ecOrderList.size() > 0) {
			int sagawaInvoceDataCount = 0;
			int yamatoInvoceDataCount = 0;
			int yupkInvoceDataCount = 0;
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  Start
			int tagDataTypeCount = 0;
			HashMap<String, Boolean> tagDataTypeMap = new HashMap<String, Boolean>();
			boolean tagDataTypeIsNull = false;
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  End
			for (TEcOrderH entity : ecOrderList) {
				// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  Start
				if (entity.chaseTShippingInstH().chaseMDeliveryCourse().getCarrierSlipYmtId() != null) {
					yamatoInvoceDataCount++;
					// ===== ECヤマト送り状CSVファイル名称を取得 =====
//					setDto.setYamatoCsvFileName(entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrier().getTagDataType());
					if (entity.chaseTShippingInstH().chaseMDeliveryCourse().getTagDataType() != null) {
						setDto.setYamatoCsvFileName(entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCenterClassDtlByTagDataType().chaseVDict().getDictNm());
					}
				}
				if (entity.chaseTShippingInstH().chaseMDeliveryCourse().getCarrierSlipSgwId() != null) {
					sagawaInvoceDataCount++;
					// ===== EC佐川送り状CSVファイル名称を取得 =====
//					setDto.setSagawaCsvFileName(entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrier().getTagDataType());
					if (entity.chaseTShippingInstH().chaseMDeliveryCourse().getTagDataType() != null) {
						setDto.setSagawaCsvFileName(entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCenterClassDtlByTagDataType().chaseVDict().getDictNm());
					}
				}
				if (entity.chaseTShippingInstH().chaseMDeliveryCourse().getCarrierSlipYupkId() != null) {
					yupkInvoceDataCount++;
					// ===== ECゆうパック送り状CSVファイル名称を取得 =====
//					setDto.setYupkCsvFileName(entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrier().getTagDataType());
					if (entity.chaseTShippingInstH().chaseMDeliveryCourse().getTagDataType() != null) {
						setDto.setYupkCsvFileName(entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCenterClassDtlByTagDataType().chaseVDict().getDictNm());
					}
				}
				if (entity.chaseTShippingInstH().chaseMDeliveryCourse().getTagDataType() != null) {
					String tagDataType = entity.chaseTShippingInstH().chaseMDeliveryCourse().getTagDataType();
					if (!tagDataTypeMap.containsKey(tagDataType)) {
						tagDataTypeCount = tagDataTypeCount + 1;
						tagDataTypeMap.put(tagDataType, true);
					}
				} else {
					// 配送コースに紐付く送り状データ定義が存在しない場合
					tagDataTypeIsNull = true;
				}
				// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  End
			}
			if ((yamatoInvoceDataCount + sagawaInvoceDataCount + yupkInvoceDataCount) == ecOrderList.size()) {
				// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  Start
//				setDto.setAllCarrierSlipIdIsOK(true);
				if (tagDataTypeIsNull) {
					// 配送コースに紐付く送り状データ定義が存在しない場合
					setDto.setAllCarrierSlipIdIsOK(false);
				} else {
					setDto.setAllCarrierSlipIdIsOK(true);
				}
				// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  End
			} else {
				setDto.setAllCarrierSlipIdIsOK(false);
			}
			setDto.setYamatoInvoceDataCount(yamatoInvoceDataCount);
			setDto.setSagawaInvoceDataCount(sagawaInvoceDataCount);
			setDto.setYupkInvoceDataCount(yupkInvoceDataCount);
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  Start
			setDto.setTagDataTypeCount(tagDataTypeCount);
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  End
		} else {
			setDto.setAllCarrierSlipIdIsOK(false);
			setDto.setYamatoInvoceDataCount(0);
			setDto.setSagawaInvoceDataCount(0);
			setDto.setYupkInvoceDataCount(0);
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  Start
			setDto.setTagDataTypeCount(0);
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  End

			setDto.setYamatoCsvFileName("");
			setDto.setSagawaCsvFileName("");
			setDto.setYupkCsvFileName("");
		}
	}

	// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana End

	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
	/**
	 * <h2>EC送り状CSVデータを取得する。</h2>
	 * <pre>
	 * EC送り状CSVデータを取得処理を行って、
	 * 検索対象が見つからない場合、０件エラーをエラー管理クラスに設定する。
	 * データ存在する場合、取込種別ボディを取得(品名1～5の対応)処理を行う。
	 * </pre>
	 * @param ecOrderR EC受注帳票：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TEcOrderH> EC受注ヘッダリスト
	 * */
	public List<TEcOrderH> selectCsvData(final TEcOrderR ecOrderR, ErrorStatus errSts) {

		TEcOrderHCB cb = tEcOrderHBhv.newMyConditionBean();

		// テーブル結合
		cb.setupSelect_MCenter();
		cb.setupSelect_MClient();
		cb.setupSelect_TEcOrderRAsOne();
		cb.setupSelect_TShippingInstH();
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCarrierSlipSgw();
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCarrierSlipYmt();
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCarrierSlipYupk();
		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH();
		cb.setupSelect_MImportType();
		// 検索条件
		cb.query().queryTEcOrderRAsOne().setControlNo_Equal(ecOrderR.getControlNo());
		// ソート条件
		cb.query().queryMClient().addOrderBy_ClientCd_Asc();
		cb.query().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTShippingInstH().addOrderBy_WorkDt_Asc();
		cb.query().queryTShippingInstH().addOrderBy_PickingBatchNo_Asc();
		cb.query().queryTShippingInstH().addOrderBy_DeliveryCourseCd_Asc();
		cb.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		cb.query().addOrderBy_OrderNo_Asc();

		// 検索実行
		List<TEcOrderH> selectList = tEcOrderHBhv.selectList(cb);
		// ===== ０件チェック =====
		if (selectList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 取込種別ボディを取得(品名1～5の対応)
		List<MImportType> mImportTypeList = tEcOrderHBhv.pulloutMImportType(selectList);
		mImportTypeBhv.loadMImportTypeBList(mImportTypeList, new ConditionBeanSetupper<MImportTypeBCB>() {
			@Override
			public void setup(MImportTypeBCB subCb) {
			}
		}).withNestedReferrer(new ReferrerListHandler<MImportTypeB>() {
			@Override
			public void handle(List<MImportTypeB> bodyList) {
				mImportTypeBBhv.loadMImportTypeBCopyHList(bodyList, new ConditionBeanSetupper<MImportTypeBCopyHCB>() {
					@Override
					public void setup(MImportTypeBCopyHCB copyHCb) {
					}
				});
			}
		});

		return selectList;
	}

	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End

	// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana Start
	/**
	 * <h2>EC送り状CSVデータを取得する。</h2>
	 * <pre>
	 * EC送り状CSVデータを取得処理を行って、
	 * 検索対象が見つからない場合、０件エラーをエラー管理クラスに設定する。
	 * データ存在する場合、取込種別ボディを取得(品名1～5の対応)処理を行う。
	 * </pre>
	 * @param ecOrderHList EC受注ヘッダリスト：EC受注ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TEcOrderH> EC受注ヘッダリスト
	 * */
	public List<TEcOrderH> selectCsvData(final List<TEcOrderH> ecOrderHList, ErrorStatus errSts) {

		// 検索対象のEC受注ヘッダIDを抽出
		Set<Long> idSet = new HashSet<Long>();
		for (TEcOrderH h : ecOrderHList) {
			idSet.add(h.getEcOrderHId());
		}

		if (idSet.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		TEcOrderHCB cb = tEcOrderHBhv.newMyConditionBean();

		// テーブル結合
		cb.setupSelect_MCenter();
		cb.setupSelect_MClient();
		cb.setupSelect_TEcOrderRAsOne();
		cb.setupSelect_TShippingInstH();
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCarrierSlipSgw();
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCarrierSlipYmt();
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCarrierSlipYupk();
		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH();
		cb.setupSelect_MImportType();
		// 検索条件
		cb.query().setEcOrderHId_InScope(idSet);
		// ソート条件
		cb.query().queryMClient().addOrderBy_ClientCd_Asc();
		cb.query().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTShippingInstH().addOrderBy_WorkDt_Asc();
		cb.query().queryTShippingInstH().addOrderBy_PickingBatchNo_Asc();
		cb.query().queryTShippingInstH().addOrderBy_DeliveryCourseCd_Asc();
		cb.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		cb.query().addOrderBy_OrderNo_Asc();

		// 検索実行
		List<TEcOrderH> selectList = tEcOrderHBhv.selectList(cb);
		// ===== ０件チェック =====
		if (selectList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 取込種別ボディを取得(品名1～5の対応)
		List<MImportType> mImportTypeList = tEcOrderHBhv.pulloutMImportType(selectList);
		mImportTypeBhv.loadMImportTypeBList(mImportTypeList, new ConditionBeanSetupper<MImportTypeBCB>() {
			@Override
			public void setup(MImportTypeBCB subCb) {
			}
		}).withNestedReferrer(new ReferrerListHandler<MImportTypeB>() {
			@Override
			public void handle(List<MImportTypeB> bodyList) {
				mImportTypeBBhv.loadMImportTypeBCopyHList(bodyList, new ConditionBeanSetupper<MImportTypeBCopyHCB>() {
					@Override
					public void setup(MImportTypeBCopyHCB copyHCb) {
					}
				});
			}
		});

		return selectList;
	}

	// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana End

	// [ON推-品向-791] 文字コードをマスタから設定 2015.04.22 kawana Start
	/**
	 * <h2>EC受注ヘッダのリストからヤマト送り状用データを作成する。</h2>
	 * <pre>
	 * EC受注ヘッダのリストからヤマト送り状用データを作成する。
	 * CSV出力データ対象がない場合、０件エラーをエラー管理クラスに設定する。
	 * </pre>
	 * @param ecOrderHList EC受注ヘッダリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<SortedMap<Integer, Object>> 送り状データリスト
	 */
	public List<SortedMap<Integer, Object>> createYamatoCsvData(List<TEcOrderH> ecOrderHList, ErrorStatus errSts) {

		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
		// 名寄せステータス=1の情報のマップ作成
		Map<String, TEcOrderH> mergeInfoMap = mergeLogic.createMergeInfoMapWithCheck(ecOrderHList, errSts);
		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 取得した結果からCSV出力データを作成
		List<SortedMap<Integer, Object>> retList = new ArrayList<SortedMap<Integer, Object>>();

		// 出庫作業No.の出力済MAP
		HashMap<String, Boolean> processedShipWorkNoMap = new HashMap<String, Boolean>();

		for (TEcOrderH entity : ecOrderHList) {

			// 出庫作業No.
			String shipWorkNo = entity.chaseTShippingInstH().chaseTAllocInstH().chaseTPickingH().getPickingWorkNo();

			// 既に処理済みの出庫作業No.の場合は処理しない
			if (!CU.isNullOrEmpty(shipWorkNo)) {
				if (processedShipWorkNoMap.containsKey(shipWorkNo)) {
					continue;
				} else {
					processedShipWorkNoMap.put(shipWorkNo, true);
				}
			}

			// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.20 kawana Start

			// 送り状定義テーブル
			MCarrierSlipYmt mYamato = entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt();

			// EC受注ヘッダの取込情報を取得(品名など)
			EcHeaderImportInfo ecHeaderInportInfo = EcHeaderImportInfo.getInstance(entity);
			// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.20 kawana End

			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
			// 名寄せステータス
			String mergeStatus = entity.getMergeStatus();
			if (!CU.isNullOrEmpty(mergeStatus) && !mergeStatus.equals("0")) {
				// 名寄せあり

				// 名寄せIDから代表情報を取得し置き換え
				String mergeId = entity.getMergeId();
				entity = mergeInfoMap.get(mergeId);
			}
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End

			// 出庫作業No.
			String pickingWorkNo = entity.chaseTShippingInstH().chaseTAllocInstH().chaseTPickingH().getPickingWorkNo();
			// 出庫作業No.の下５桁
			String pickingWorkNoLastFive = "";
			if (!CU.isNullOrEmpty(pickingWorkNo)) {
				if (pickingWorkNo.length() >= 5) {
					pickingWorkNoLastFive = pickingWorkNo.substring(pickingWorkNo.length() - 5, pickingWorkNo.length());
				} else {
					pickingWorkNoLastFive = pickingWorkNo;
				}
			} else {
				pickingWorkNoLastFive = "";
			}
			// 送り状種別
			String slipType = entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt().getSlipType();

			// [EC-CT1-158] 住所3を32バイトまでを設定(ここから削除して下に移動) 2015.03.30 kawana

			// 出力データ作成
			SortedMap<Integer, Object> row = new TreeMap<Integer, Object>();

			// [EC-CT1-168] 下5桁からフル桁に変更 2015.04.01 kawana Start
			// お客様管理番号
			row.put(1, pickingWorkNo); // 出庫作業No.
			// [EC-CT1-168] 下5桁からフル桁に変更 2015.04.01 kawana End
			// 送り状種別
			row.put(2, slipType);// 送り状種別
			// クール区分
			row.put(3, entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt().getCoolCls());// クール区分
			// 伝票番号
			row.put(4, null);
			// [#3272] センタ別ロケール対応(帳票用Util使用をWCUに変更) 2018.01.17 kawana Start
			// 出荷予定日
			row.put(5, WCU.stringToDateString(entity.chaseTShippingInstH().chaseTAllocInstH().getShippingDt())); // 出荷日
			// お届け予定(指定)日
			row.put(6, WCU.stringToDateString(entity.chaseTShippingInstH().chaseTAllocInstH().getDelivDt())); // 納品指定日
			// [#3272] センタ別ロケール対応(帳票用Util使用をWCUに変更) 2018.01.17 kawana End
			// 配達時間帯
			// [C-CWMS-0058] 荷札出力対応(時間帯CDの変換を共通ロジック化) 2016.07.28 kawana Start
			// [EC-CT1-175] マッチングマスタの逆変換での使用を修正 2015.04.01 kawana Start
			row.put(7, matchingLogic.convertDelivTzWmsToCarrier(MatchingLogic.CarrierCls.YAMATO, entity.chaseTShippingInstH().chaseTAllocInstH().getDelivTz())); // 納品時間帯
			// [EC-CT1-175] マッチングマスタの逆変換での使用を修正 2015.04.01 kawana End
			// [C-CWMS-0058] 荷札出力対応(時間帯CDの変換を共通ロジック化) 2016.07.28 kawana End
			// お届け先コード
			row.put(8, null);
			// お届け先電話番号
			if ("3".equals(slipType) || "6".equals(slipType)) {
				// メール便(送り状種別が3or6、ハードコーディングで問題無し)のみ出庫ヘッダ.出庫作業No.の下５桁
				row.put(9, pickingWorkNoLastFive);// 出庫作業No.の下５桁
			} else {
				row.put(9, entity.getDelivTelNo());// 送付先電話番号
			}
			// お届け先電話番号枝番
			row.put(10, null);
			// お届け先郵便番号
			row.put(11, entity.getDelivZipCd());//送付先郵便番号
			// [EC-CT1-158] 住所3を32バイトまでを設定 2015.03.30 kawana Start
			// [C-CWMS-0024] 住所変更機能を追加するため、修正 2015.04.08 kyo Start
			String delivInvoiceAddress = new StringBuilder()
					.append(CU.nullToStr(entity.getInvoiceDelivAddress1()))
					.append(CU.nullToStr(entity.getInvoiceDelivAddress2()))
					.append(CU.nullToStr(entity.getInvoiceDelivAddress3())).toString();
			// 住所3を32バイトで分割
			String[] splitAddr3 = {};
			if (!CU.isNullOrEmpty(delivInvoiceAddress)) {
				splitAddr3 = CU.splitBytes(CU.nullToStr(entity.getInvoiceDelivAddress3()), 32, CHARSETS);
			} else {
				splitAddr3 = CU.splitBytes(CU.nullToStr(entity.getDelivAddress3()), 32, CHARSETS);
			}
			// お届け先住所
			String delivAddress1 = "";
			if (!CU.isNullOrEmpty(delivInvoiceAddress)) {
				delivAddress1 = new StringBuilder()
						.append(CU.nullToStr(entity.getInvoiceDelivAddress1()))
						.append(CU.nullToStr(entity.getInvoiceDelivAddress2()))
						.append(splitAddr3[0]).toString();
			} else {
				delivAddress1 = new StringBuilder()
						.append(CU.nullToStr(entity.getDelivAddress1()))
						.append(CU.nullToStr(entity.getDelivAddress2()))
						.append(splitAddr3[0]).toString();
			}
			// [C-CWMS-0024] 住所変更機能を追加するため、修正 2015.04.08 kyo End
			// お届け先住所(アパートマンション名)
			String delivAddress2 = null;
			if (1 < splitAddr3.length) {
				delivAddress2 = splitAddr3[1];
			}
			// お届け先住所
			row.put(12, delivAddress1);
			// お届け先住所(アパートマンション名)
			row.put(13, delivAddress2);
			// [EC-CT1-158] 住所3を32バイトまでを設定 2015.03.30 kawana End
			// お届け先会社・部門名１
			row.put(14, null);
			// お届け先会社・部門名２
			row.put(15, null);
			// お届け先名 32バイト
			String[] delivNms = CU.splitBytes(entity.getDelivCustomerNm(), 32, CHARSETS); // 送付先名字
			row.put(16, delivNms[0]);
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
			// お届け先名略称カナ 50バイト
			String[] delivNmKns = CU.splitBytes(entity.getDelivCustomerNmKana(), 50, CHARSETS);
			row.put(17, delivNmKns[0]);
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End

			// 敬称 4バイト
			String[] honorifics = CU.splitBytes(entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt().getHonorific(), 4, CHARSETS);
			row.put(18, honorifics[0]); // 敬称
			// ご依頼主コード
			row.put(19, null);
			// ご依頼主電話番号
			row.put(20, entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt().getSlipClientTelNo());// ご依頼主電話番号
			// ご依頼主電話番号枝番
			row.put(21, null);
			// ご依頼主郵便番号
			row.put(22, entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt().getSlipClientZipCd());// ご依頼主郵便番号
			// [EC-CT1-160] ご依頼主住所を分割 2015.03.30 kawana Start
			// 住所3を32バイトで分割
			String[] splitClientAddr3 = CU.splitBytes(CU.nullToStr(entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt().getSlipClientAddress3()), 32, CHARSETS);
			// ご依頼主住所
			String slipClientAddress1 = new StringBuilder()
					.append(CU.nullToStr(entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt().getSlipClientAddress1()))
					.append(CU.nullToStr(entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt().getSlipClientAddress2()))
					.append(splitClientAddr3[0]).toString();
			// ご依頼主住所(アパートマンション名)
			String[] splitClientAddr4 = CU.splitBytes(entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt().getSlipClientAddress4(), 32, CHARSETS);
			String slipClientAddress2 = splitClientAddr4[0];
			// ご依頼主住所
			row.put(23, slipClientAddress1);
			// ご依頼主住所
			row.put(24, slipClientAddress2);
			// [EC-CT1-160] ご依頼主住所を分割 2015.03.30 kawana End
			// ご依頼主名 23バイト + 【 出庫作業No.の下５桁 】 (計 32バイト)
			String[] slipClientNms = CU.splitBytes(entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt().getSlipClientNm(), 23, CHARSETS);
			row.put(25, CU.nullToStr(slipClientNms[0]) + "【" + pickingWorkNoLastFive + "】");
			// ご依頼主略称カナ
			row.put(26, null);
			// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.20 kawana Start
			// [EC-CT1-172] 品名コード1,品名コード2,品名2,荷扱い1,荷扱い2を「ヤマト送り状マスタ」から設定 2015.04.02 kawana Start
			// 品名コード１ 30バイト
			String slipItemCd1;
			if (ecHeaderInportInfo.isImportSlipItemCd1) {
				slipItemCd1 = entity.getSlipItemCd1();
			} else {
				slipItemCd1 = mYamato.getSlipItemCd1();
			}
			row.put(27, CU.splitBytes(slipItemCd1, 30, CHARSETS)[0]);
			// 品名１ 50バイト
			String slipItemNm1;
			if (ecHeaderInportInfo.isImportSlipItemNm1) {
				slipItemNm1 = entity.getSlipItemNm1();
			} else {
				slipItemNm1 = mYamato.getSlipItemNm1();
			}
			row.put(28, CU.splitBytes(slipItemNm1, 50, CHARSETS)[0]);
			// 品名コード２ 30バイト
			String slipItemCd2;
			if (ecHeaderInportInfo.isImportSlipItemCd2) {
				slipItemCd2 = entity.getSlipItemCd2();
			} else {
				slipItemCd2 = mYamato.getSlipItemCd2();
			}
			row.put(29, CU.splitBytes(slipItemCd2, 30, CHARSETS)[0]);
			// 品名２ 50バイト
			String slipItemNm2;
			if (ecHeaderInportInfo.isImportSlipItemNm2) {
				slipItemNm2 = entity.getSlipItemNm2();
			} else {
				slipItemNm2 = mYamato.getSlipItemNm2();
			}
			row.put(30, CU.splitBytes(slipItemNm2, 50, CHARSETS)[0]);
			// 荷扱い１ 20バイト
			String freightHandling1;
			if (ecHeaderInportInfo.isImportFreightHandling1) {
				freightHandling1 = entity.getFreightHandling1();
			} else {
				freightHandling1 = mYamato.getFreightHandling1();
			}
			row.put(31, CU.splitBytes(freightHandling1, 20, CHARSETS)[0]);
			// 荷扱い２ 20バイト
			String freightHandling2;
			if (ecHeaderInportInfo.isImportFreightHandling2) {
				freightHandling2 = entity.getFreightHandling2();
			} else {
				freightHandling2 = mYamato.getFreightHandling2();
			}
			row.put(32, CU.splitBytes(freightHandling2, 20, CHARSETS)[0]);
			// [EC-CT1-172] 品名コード1,品名コード2,品名2,荷扱い1,荷扱い2を「ヤマト送り状マスタ」から設定 2015.04.02 kawana End
			// 記事 32バイト
			String article;
			if (ecHeaderInportInfo.isImportArticle) {
				article = entity.getArticle();
			} else {
				article = mYamato.getArticle();
			}
			row.put(33, CU.splitBytes(article, 32, CHARSETS)[0]);
			// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.20 kawana End
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
			if ("2".equals(slipType)) {
				// コレクト代金引換額(税込)
				row.put(34, entity.getAmountBilled()); // 請求金額(-99999=無効値)
				// コレクト内消費税額等
				row.put(35, 0);
			} else {
				// コレクト代金引換額(税込)
				row.put(34, null);
				// コレクト内消費税額等
				row.put(35, null);
			}
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End
			// 営業所止置き 0固定
			row.put(36, 0);
			// 営業所コード
			row.put(37, null);
			// 発行枚数 1固定
			row.put(38, 1);
			// 個数口枠の印字 2固定
			row.put(39, 2);
			// ご請求先顧客コード
			row.put(40, entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt().getBillingCustomerCd());// ご請求先顧客コード
			// ご請求先分類コード
			row.put(41, null);
			// 運賃管理番号
			row.put(42, entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYmt().getFareNo());// 運賃管理番号
			// 注文時カード払いデータ登録 0固定
			row.put(43, 0);
			// 注文時カード払い加盟店番号
			row.put(44, null);
			// 注文時カード払い申込受付番号１
			row.put(45, null);
			// 注文時カード払い申込受付番号２
			row.put(46, null);
			// 注文時カード払い申込受付番号３
			row.put(47, null);
			// お届け予定eメール利用区分 0固定
			row.put(48, 0);
			// お届け予定eメールe-mailアドレス
			row.put(49, null);
			// 入力機種 1固定
			row.put(50, 1);
			// お届け予定eメールメッセージ
			row.put(51, null);
			// お届け完了eメール利用区分 0固定
			row.put(52, 0);
			// お届け完了eメールe-mailアドレス
			row.put(53, null);
			// お届け完了eメールメッセージ
			row.put(54, null);
			// クロネコ収納代行利用区分 0固定
			row.put(55, 0);
			// 収納代行決済ＱＲコード印刷
			row.put(56, null);
			// 収納代行請求金額(税込)
			row.put(57, null);
			// 収納代行内消費税額等
			row.put(58, null);
			// 収納代行請求先郵便番号
			row.put(59, null);
			// 収納代行請求先住所
			row.put(60, null);
			// 収納代行請求先住所(アパートマンション名)
			row.put(61, null);
			// 収納代行請求先会社・部門名１
			row.put(62, null);
			// 収納代行請求先会社・部門名２
			row.put(63, null);
			// 収納代行請求先名(漢字)
			row.put(64, null);
			// 収納代行請求先名(カナ)
			row.put(65, null);
			// 収納代行問合せ先名(漢字)
			row.put(66, null);
			// 収納代行問合せ先郵便番号
			row.put(67, null);
			// 収納代行問合せ先住所
			row.put(68, null);
			// 収納代行問合せ先住所(アパートマンション名)
			row.put(69, null);
			// 収納代行問合せ先電話番号
			row.put(70, null);
			// 収納代行管理番号
			row.put(71, null);
			// 収納代行品名
			row.put(72, null);
			// 収納代行備考
			row.put(73, null);

			retList.add(row);
		}

		// ===== ０件チェック =====
		if (retList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		return retList;
	}

	/**
	 * <h2>EC受注ヘッダのリストから佐川送り状用データを作成する。</h2>
	 * <pre>
	 * EC受注ヘッダのリストから佐川送り状用データを作成する。
	 * CSV出力データ対象がない場合、０件エラーをエラー管理クラスに設定する。
	 * </pre>
	 * @param ecOrderHList EC受注ヘッダリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<SortedMap<Integer, Object>> 送り状データリスト
	 */
	public List<SortedMap<Integer, Object>> createSagawaCsvData(List<TEcOrderH> ecOrderHList, ErrorStatus errSts) {

		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.19 kawana Start
		// 名寄せステータス=1の情報のマップ作成
		Map<String, TEcOrderH> mergeInfoMap = mergeLogic.createMergeInfoMapWithCheck(ecOrderHList, errSts);
		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.19 kawana End
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 取得した結果からCSV出力データを作成
		List<SortedMap<Integer, Object>> resultList = new ArrayList<SortedMap<Integer, Object>>();

		// 出庫作業No.の出力済MAP
		HashMap<String, Boolean> processedShipWorkNoMap = new HashMap<String, Boolean>();

		for (TEcOrderH entity : ecOrderHList) {

			// 出庫作業No.
			String shipWorkNo = entity.chaseTShippingInstH().chaseTAllocInstH().chaseTPickingH().getPickingWorkNo();

			// 佐川送り状定義テーブル
			MCarrierSlipSgw mSagawa = entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipSgw();

			// 既に処理済みの出庫作業No.の場合は処理しない
			if (!CU.isNullOrEmpty(shipWorkNo)) {
				if (processedShipWorkNoMap.containsKey(shipWorkNo)) {
					continue;
				} else {
					processedShipWorkNoMap.put(shipWorkNo, true);
				}
			}

			// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.20 kawana Start
			// EC受注ヘッダの取込情報を取得(品名など)
			EcHeaderImportInfo ecHeaderInportInfo = EcHeaderImportInfo.getInstance(entity);
			// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.20 kawana End

			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動(不要な処理を削除) 2015.05.18 kawana

			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.19 kawana Start
			// 名寄せステータス
			String mergeStatus = entity.getMergeStatus();
			if (!CU.isNullOrEmpty(mergeStatus) && !mergeStatus.equals("0")) {
				// 名寄せあり

				// 名寄せIDから代表情報を取得し置き換え
				String mergeId = entity.getMergeId();
				entity = mergeInfoMap.get(mergeId);
			}
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.19 kawana End

			// 出庫作業No.
			String pickingWorkNo = entity.chaseTShippingInstH().chaseTAllocInstH().chaseTPickingH().getPickingWorkNo();
			// 出庫作業No.の下５桁
			String pickingWorkNoLastFive = "";
			if (!CU.isNullOrEmpty(pickingWorkNo)) {
				if (pickingWorkNo.length() >= 5) {
					pickingWorkNoLastFive = pickingWorkNo.substring(pickingWorkNo.length() - 5, pickingWorkNo.length());
				} else {
					pickingWorkNoLastFive = pickingWorkNo;
				}
			} else {
				pickingWorkNoLastFive = "";
			}

			// 出力データ作成
			SortedMap<Integer, Object> row = new TreeMap<Integer, Object>();

			// 住所録コード
			row.put(1, null);
			// お届け先電話番号
			row.put(2, entity.getDelivTelNo());
			// お届け先郵便番号
			row.put(3, entity.getDelivZipCd());
			// お届け先住所１（必頇）
			// [C-CWMS-0024] 住所変更機能を追加するため、修正 2015.04.08 kyo Start
			String delivAddress = "";
			String delivInvoiceAddress = new StringBuilder()
					.append(CU.nullToStr(entity.getInvoiceDelivAddress1()))
					.append(CU.nullToStr(entity.getInvoiceDelivAddress2()))
					.append(CU.nullToStr(entity.getInvoiceDelivAddress3())).toString();
			if (!CU.isNullOrEmpty(delivInvoiceAddress)) {
				delivAddress = delivInvoiceAddress;
			} else {
				delivAddress = new StringBuilder()
						.append(CU.nullToStr(entity.getDelivAddress1()))
						.append(CU.nullToStr(entity.getDelivAddress2()))
						.append(CU.nullToStr(entity.getDelivAddress3()))
						.toString();
			}
			// [C-CWMS-0024] 住所変更機能を追加するため、修正 2015.04.08 kyo End
			delivAddress = CU.getFullString(delivAddress);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitDelivAddr1 = CU.splitChars(delivAddress, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(4, splitDelivAddr1[0]);
			// お届け先住所２
			if (1 < splitDelivAddr1.length) {
				row.put(5, splitDelivAddr1[1]);
			} else {
				row.put(5, null);
			}
			// お届け先住所３
			if (2 < splitDelivAddr1.length) {
				row.put(6, splitDelivAddr1[2]);
			} else {
				row.put(6, null);
			}
			// お届け先名称１（必頇）
			String delivNm = CU.getFullString(entity.getDelivCustomerNm());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitDelivNm = CU.splitChars(delivNm, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(7, splitDelivNm[0]);
			// お届け先名称２
			if (1 < splitDelivNm.length) {
				row.put(8, splitDelivNm[1]);
			} else {
				row.put(8, null);
			}
			// [EC-CT1-169] 下5桁からフル桁に変更 2015.04.01 kawana Start
			// お客様管理ナンバー
			row.put(9, pickingWorkNo);
			// [EC-CT1-169] 下5桁からフル桁に変更 2015.04.01 kawana End
			// お客様コード
			row.put(10, mSagawa.getSlipCustomerCd());
			// 部署・担当者
			String consignorNm = CU.getFullString(mSagawa.getDeptConsignorNm());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitConsignorNm = CU.splitChars(consignorNm, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(11, splitConsignorNm[0]);
			// 荷送人電話番号
			row.put(12, mSagawa.getConsignorTelNo());
			// ご依頼主電話番号
			row.put(13, mSagawa.getSlipClientTelNo());
			// ご依頼主郵便番号
			row.put(14, mSagawa.getSlipClientZipCd());
			// ご依頼主住所１
			String slipClientAddress1 = CU.getFullString(mSagawa.getSlipClientAddress1());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientAddress1 = CU.splitChars(slipClientAddress1, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(15, splitSlipClientAddress1[0]);
			// ご依頼主住所２
			String slipClientAddress2 = CU.getFullString(mSagawa.getSlipClientAddress2());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientAddress2 = CU.splitChars(slipClientAddress2, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(16, splitSlipClientAddress2[0]);
			// ご依頼主名称１
			String SlipClientNm1 = CU.getFullString(mSagawa.getSlipClientNm1());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientNm1 = CU.splitChars(SlipClientNm1, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(17, splitSlipClientNm1[0]);
			// [EC-CT1-170] 依頼主名の後に【出庫作業No下5桁】を追加 2015.04.01 kawana Start
			// ご依頼主名称２
			String SlipClientNm2 = CU.getFullString(mSagawa.getSlipClientNm2());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientNm2 = CU.splitChars(SlipClientNm2, 9);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(18, CU.nullToStr(splitSlipClientNm2[0]) + CU.getFullString("【" + pickingWorkNoLastFive + "】"));
			// [EC-CT1-170] 依頼主名の後に【出庫作業No下5桁】を追加 2015.04.01 kawana End
			// 荷姿コード
			row.put(19, mSagawa.getSlipShapeCd());
			//[ON推-品向-1183] 修正対応 2016.08.17 chou Mod Start
			//row.put(19, mSagawa.getSlipShapeCd());
			//梱包ヘッダ.荷材IDを取得
			Long boxId = null;
			TPackingHCB tcb = tPackingHBhv.newMyConditionBean();
			tcb.query().setClientId_Equal(entity.getClientId());
			tcb.query().setCenterId_Equal(entity.getCenterId());
			tcb.query().setAllocInstHId_Equal(entity.chaseTShippingInstH().chaseTAllocInstH().getAllocInstHId());

			List<TPackingH> lstTPackingH = tPackingHBhv.selectList(tcb);
			if (lstTPackingH != null && lstTPackingH.size() > 0) {
				boxId = lstTPackingH.get(0).getBoxId();//荷材ID
			}

			if (boxId == null) {//荷材IDが未設定の場合
				// 荷姿コード
				row.put(19, "");
			}else {//以外の場合
				//荷材サイズCDを取得
				MCarrierBoxCB cb = mCarrierBoxBhv.newMyConditionBean();
				cb.query().setCarrierId_Equal(entity.chaseTShippingInstH().chaseMDeliveryCourse().getCarrierId());//運送業者ID
				cb.query().setBoxId_Equal(boxId);//荷材ID

				List<MCarrierBox> lstMCarrierBox = mCarrierBoxBhv.selectList(cb);
				if (lstMCarrierBox != null && lstMCarrierBox.size() > 0) {
					// 荷姿コード
					row.put(19, CU.nullToStr(lstMCarrierBox.get(0).getBoxSizeCd()));//荷材サイズCDで設定する
				}else{
					// 荷姿コード
					row.put(19, "");
				}
			}
			//[ON推-品向-1183] 修正対応 2016.08.17 chou Mod End
			// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.20 kawana Start
			// 品名１ 32バイト
			String slipItemNm1;
			if (ecHeaderInportInfo.isImportSlipItemNm1) {
				slipItemNm1 = entity.getSlipItemNm1();
			} else {
				slipItemNm1 = mSagawa.getSlipItemNm1();
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			if (isSingleByteChars(slipItemNm1, 32, CHARSETS)) {
				row.put(20, CU.splitChars(slipItemNm1, 32)[0]);
			} else {
				row.put(20, CU.splitChars(slipItemNm1, 16)[0]);
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			// 品名２ 32バイト
			String slipItemNm2;
			if (ecHeaderInportInfo.isImportSlipItemNm2) {
				slipItemNm2 = entity.getSlipItemNm2();
			} else {
				slipItemNm2 = mSagawa.getSlipItemNm2();
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			if (isSingleByteChars(slipItemNm2, 32, CHARSETS)) {
				row.put(21, CU.splitChars(slipItemNm2, 32)[0]);
			} else {
				row.put(21, CU.splitChars(slipItemNm2, 16)[0]);
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			// 品名３ 32バイト
			String slipItemNm3;
			if (ecHeaderInportInfo.isImportSlipItemNm3) {
				slipItemNm3 = entity.getSlipItemNm3();
			} else {
				slipItemNm3 = mSagawa.getSlipItemNm3();
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			if (isSingleByteChars(slipItemNm3, 32, CHARSETS)) {
				row.put(22, CU.splitChars(slipItemNm3, 32)[0]);
			} else {
				row.put(22, CU.splitChars(slipItemNm3, 16)[0]);
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			// 品名４ 32バイト
			String slipItemNm4;
			if (ecHeaderInportInfo.isImportSlipItemNm4) {
				slipItemNm4 = entity.getSlipItemNm4();
			} else {
				slipItemNm4 = mSagawa.getSlipItemNm4();
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			if (isSingleByteChars(slipItemNm4, 32, CHARSETS)) {
				row.put(23, CU.splitChars(slipItemNm4, 32)[0]);
			} else {
				row.put(23, CU.splitChars(slipItemNm4, 16)[0]);
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			// 品名５ 32バイト
			String slipItemNm5;
			if (ecHeaderInportInfo.isImportSlipItemNm5) {
				slipItemNm5 = entity.getSlipItemNm5();
			} else {
				slipItemNm5 = mSagawa.getSlipItemNm5();
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			if (isSingleByteChars(slipItemNm5, 32, CHARSETS)) {
				row.put(24, CU.splitChars(slipItemNm5, 32)[0]);
			} else {
				row.put(24, CU.splitChars(slipItemNm5, 16)[0]);
			}
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.20 kawana End
			// [C-CWMS-0026] 出荷個数をEC取込データから設定できるように変更 2015.05.20 kawana Start
			if (entity.getPackingQty() != null) {
				// 出荷個数
				row.put(25, String.valueOf(entity.getPackingQty()));
			} else {
				// 出荷個数
				row.put(25, "1");
			}
			// [C-CWMS-0026] 出荷個数をEC取込データから設定できるように変更 2015.05.20 kawana End
			// 便種（スピードで選択）
			row.put(26, mSagawa.getTransportTypeSpeed());
			// 便種（商品）
			row.put(27, mSagawa.getTransportTypeItem());
			// 配達日
			row.put(28, entity.chaseTShippingInstH().chaseTAllocInstH().getDelivDt());
			// 配達指定時間帯 (マッチングマスタより設定)
			// [C-CWMS-0058] 荷札出力対応(時間帯CDの変換を共通ロジック化) 2016.07.28 kawana Start
			// [EC-CT1-175] マッチングマスタの逆変換での使用を修正 2015.04.01 kawana Start
			row.put(29, matchingLogic.convertDelivTzWmsToCarrier(MatchingLogic.CarrierCls.SAGAWA, entity.chaseTShippingInstH().chaseTAllocInstH().getDelivTz()));
			// [EC-CT1-175] マッチングマスタの逆変換での使用を修正 2015.04.01 kawana End
			// [C-CWMS-0058] 荷札出力対応(時間帯CDの変換を共通ロジック化) 2016.07.28 kawana End
			// 配達指定時間（時分）
			row.put(30, null);
			// [ON推-品向-1001] 佐川送り状の代引金額を請求金額に変更 2015.11.09 kawana Start
			// [ON推-品向-839] 代引金額をEC受注ヘッダから出力 2015.07.02 kawana Start
			// 代引金額
			if (mSagawa.isCodCls$2()) {
				// 着払
				row.put(31, CU.nullToZero(entity.getAmountBilled()));
			} else {
				row.put(31, 0);
			}
			// [ON推-品向-839] 代引金額をEC受注ヘッダから出力 2015.07.02 kawana End
			// [ON推-品向-1001] 佐川送り状の代引金額を請求金額に変更 2015.11.09 kawana End
			// 消費税
			row.put(32, "0");
			// [ON推-品向-788] 送り状マスタから設定 2015.04.20 kawana Start
			// 決済種別
			row.put(33, mSagawa.getSettlementType());
			// [ON推-品向-788] 送り状マスタから設定 2015.04.20 kawana End
			// 保険金額
			row.put(34, "0");
			// 保険金額印字
			row.put(35, "0");
			// [ON推-品向-788] 送り状マスタから設定 2015.04.20 kawana Start
			// 指定シール①
			row.put(36, mSagawa.getSealType1());
			// 指定シール②
			row.put(37, mSagawa.getSealType2());
			// 指定シール③
			row.put(38, mSagawa.getSealType3());
			// [ON推-品向-788] 送り状マスタから設定 2015.04.20 kawana End
			// 営業店止め
			row.put(39, "0");
			// ＳＲＣ区分
			row.put(40, "0");
			// 営業店コード
			row.put(41, null);
			// [ON推-品向-788] 送り状マスタから設定 2015.04.20 kawana Start
			// 元着区分
			row.put(42, mSagawa.getCodCls());
			// [ON推-品向-788] 送り状マスタから設定 2015.04.20 kawana End

			resultList.add(row);

			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動(不要な処理を削除) 2015.05.18 kawana
		}

		// ===== ０件チェック =====
		if (resultList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		// [C-CWMS-0023] 佐川送り状対応 2015.03.31 kawana End
		return resultList;
	}

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  Start
	/**
	 * <h2>EC受注ヘッダのリストから佐川送り状(E飛伝Pro)用データを作成する。</h2>
	 * <pre>
	 * EC受注ヘッダのリストから佐川送り状(E飛伝Pro)用データを作成する。
	 * CSV出力データ対象がない場合、０件エラーをエラー管理クラスに設定する。
	 * </pre>
	 * @param ecOrderHList EC受注ヘッダリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<SortedMap<Integer, Object>> 送り状データリスト
	 */
	public List<SortedMap<Integer, Object>> createSagawaProCsvData(List<TEcOrderH> ecOrderHList, ErrorStatus errSts) {

		// 名寄せステータス=1の情報のマップ作成
		Map<String, TEcOrderH> mergeInfoMap = mergeLogic.createMergeInfoMapWithCheck(ecOrderHList, errSts);
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 取得した結果からCSV出力データを作成
		List<SortedMap<Integer, Object>> resultList = new ArrayList<SortedMap<Integer, Object>>();

		// 出庫作業No.の出力済MAP
		HashMap<String, Boolean> processedShipWorkNoMap = new HashMap<String, Boolean>();

		for (TEcOrderH entity : ecOrderHList) {

			// 出庫作業No.
			String shipWorkNo = entity.chaseTShippingInstH().chaseTAllocInstH().chaseTPickingH().getPickingWorkNo();

			// 佐川送り状定義テーブル
			MCarrierSlipSgw mSagawa = entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipSgw();

			// 既に処理済みの出庫作業No.の場合は処理しない
			if (!CU.isNullOrEmpty(shipWorkNo)) {
				if (processedShipWorkNoMap.containsKey(shipWorkNo)) {
					continue;
				} else {
					processedShipWorkNoMap.put(shipWorkNo, true);
				}
			}

			// 名寄せステータス
			String mergeStatus = entity.getMergeStatus();
			if (!CU.isNullOrEmpty(mergeStatus) && !mergeStatus.equals("0")) {
				// 名寄せあり

				// 名寄せIDから代表情報を取得し置き換え
				String mergeId = entity.getMergeId();
				entity = mergeInfoMap.get(mergeId);
			}

			// 出庫作業No.
			String pickingWorkNo = entity.chaseTShippingInstH().chaseTAllocInstH().chaseTPickingH().getPickingWorkNo();
			// 出庫作業No.の下５桁
			String pickingWorkNoLastFive = "";
			if (!CU.isNullOrEmpty(pickingWorkNo)) {
				if (pickingWorkNo.length() >= 5) {
					pickingWorkNoLastFive = pickingWorkNo.substring(pickingWorkNo.length() - 5, pickingWorkNo.length());
				} else {
					pickingWorkNoLastFive = pickingWorkNo;
				}
			} else {
				pickingWorkNoLastFive = "";
			}

			// 出力データ作成
			SortedMap<Integer, Object> row = new TreeMap<Integer, Object>();

			//ご依頼主コード（必頇）
			row.put(1, mSagawa.getSlipCustomerCd());
			//部署ご担当者コード
			row.put(2, null);
			//部署ご担当者名
			String consignorNm = CU.getFullString(mSagawa.getDeptConsignorNm());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitConsignorNm = CU.splitChars(consignorNm, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(3, splitConsignorNm[0]);
			//ご依頼主電話
			row.put(4, mSagawa.getSlipClientTelNo());
			//お届け先コード
			row.put(5, null);
			//お届け先郵便番号
			row.put(6, entity.getDelivZipCd());
			// お届け先名称１（必頇）
			String delivNm = CU.getFullString(entity.getDelivCustomerNm());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitDelivNm = CU.splitChars(delivNm, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(7, splitDelivNm[0]);
			// お届け先名称２
			if (1 < splitDelivNm.length) {
				row.put(8, splitDelivNm[1]);
			} else {
				row.put(8, null);
			}
			// お届け先住所１（必頇）
			String delivAddress = "";
			String delivInvoiceAddress = new StringBuilder()
					.append(CU.nullToStr(entity.getInvoiceDelivAddress1()))
					.append(CU.nullToStr(entity.getInvoiceDelivAddress2()))
					.append(CU.nullToStr(entity.getInvoiceDelivAddress3())).toString();
			if (!CU.isNullOrEmpty(delivInvoiceAddress)) {
				delivAddress = delivInvoiceAddress;
			} else {
				delivAddress = new StringBuilder()
						.append(CU.nullToStr(entity.getDelivAddress1()))
						.append(CU.nullToStr(entity.getDelivAddress2()))
						.append(CU.nullToStr(entity.getDelivAddress3()))
						.toString();
			}
			delivAddress = CU.getFullString(delivAddress);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitDelivAddr1 = CU.splitChars(delivAddress, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(9, splitDelivAddr1[0]);
			// お届け先住所２
			if (1 < splitDelivAddr1.length) {
				row.put(10, splitDelivAddr1[1]);
			} else {
				row.put(10, null);
			}
			// お届け先住所３
			if (2 < splitDelivAddr1.length) {
				row.put(11, splitDelivAddr1[2]);
			} else {
				row.put(11, null);
			}
			//お届け先電話
			row.put(12, entity.getDelivTelNo());
			//ご不在連絡先
			row.put(13, null);
			//メールアドレス
			row.put(14, null);
			//代行ご依頼主コード
			row.put(15, mSagawa.getSlipCustomerCd());
			//代行ご依頼主郵便番号
			row.put(16, mSagawa.getSlipClientZipCd());
			//代行ご依頼主名１
			String SlipClientNm1 = CU.getFullString(mSagawa.getSlipClientNm1());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientNm1 = CU.splitChars(SlipClientNm1, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(17, splitSlipClientNm1[0]);
			//代行ご依頼主名２
			String SlipClientNm2 = CU.getFullString(mSagawa.getSlipClientNm2());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientNm2 = CU.splitChars(SlipClientNm2, 9);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(18, CU.nullToStr(splitSlipClientNm2[0]) + CU.getFullString("【" + pickingWorkNoLastFive + "】"));
			//代行ご依頼主住所１
			String slipClientAddress1 = CU.getFullString(mSagawa.getSlipClientAddress1());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientAddress1 = CU.splitChars(slipClientAddress1, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(19, splitSlipClientAddress1[0]);
			//代行ご依頼主住所２
			String slipClientAddress2 = CU.getFullString(mSagawa.getSlipClientAddress2());
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod Start
			String[] splitSlipClientAddress2 = CU.splitChars(slipClientAddress2, 16);
			// [#2727][Ver2.2] 送り状データ出力 -【E飛伝】送り状住所（Ｎ個）への住所展開方法の修正 2017.09.25 honma Mod End
			row.put(20, splitSlipClientAddress2[0]);
			//代行ご依頼主住所３
			row.put(21, null);
			//代行ご依頼主電話
			row.put(22, mSagawa.getSlipClientTelNo());
			//出荷日
			row.put(23, entity.chaseTShippingInstH().chaseTAllocInstH().getShippingDt());
			//発送日
			row.put(24, entity.chaseTShippingInstH().chaseTAllocInstH().getShippingDt());
			//配達指定日
			row.put(25, entity.chaseTShippingInstH().chaseTAllocInstH().getDelivDt());
			//セット数
			row.put(26, null);
			//個数
			if (entity.getPackingQty() != null) {
				// 出荷個数
				row.put(27, String.valueOf(entity.getPackingQty()));
			} else {
				// 出荷個数
				row.put(27, "1");
			}
			//元着区分
			row.put(28, mSagawa.getCodCls());
			//保険金額
			row.put(29, "0");
			//決済種別
			row.put(30, mSagawa.getSettlementType());
			//代引金額
			if (mSagawa.isCodCls$2()) {
				// 着払
				row.put(31, CU.nullToZero(entity.getAmountBilled()));
			} else {
				row.put(31, 0);
			}
			//代引税金額
			if (mSagawa.isCodCls$2()) {
				// 着払
				row.put(32, CU.nullToZero(entity.getAmountBilled()) + CU.nullToZero(entity.getTax()));
			} else {
				row.put(32, 0);
			}
			//消費税区分
			row.put(33, null);
			//問い合わせNo.
			row.put(34, null);
			//旧問い合わせNo.
			row.put(35, null);
			//顧客管理番号
			row.put(36, null);
			//営止め区分
			row.put(37, "0");
			//営止精算店コード
			row.put(38, null);
			//クール指定区分
			row.put(39, "0");
			//便種コード
			row.put(40, mSagawa.getTransportTypeItem());
			//時間帯コード
			row.put(41, matchingLogic.convertDelivTzWmsToCarrier(MatchingLogic.CarrierCls.SAGAWA, entity.chaseTShippingInstH().chaseTAllocInstH().getDelivTz()));
			//配達時間指定
			row.put(42, null);
			//シールコード１
			row.put(43, mSagawa.getSealType1());
			//シールコード２
			row.put(44, mSagawa.getSealType2());
			//シールコード３
			row.put(45, mSagawa.getSealType3());
			//シールコード４
			row.put(46, null);
			//出荷区分
			row.put(47, null);
			//出荷場印字区分
			row.put(48, null);
			//保険金額印字区分
			row.put(49, "0");
			//集約解除指定区分
			row.put(50, null);
			//編集０１
			row.put(51, null);
			//編集０２
			row.put(52, null);
			//編集０３
			row.put(53, null);
			//編集０４
			row.put(54, null);
			//編集０５
			row.put(55, null);
			//編集０６
			row.put(56, null);
			//編集０７
			row.put(57, null);
			//編集０８
			row.put(58, null);
			//編集０９
			row.put(59, null);
			//編集１０
			row.put(60, null);
			//重量１個数
			row.put(61, null);
			//重量２個数
			row.put(62, null);
			//重量３個数
			row.put(63, null);
			//重量４個数
			row.put(64, null);
			//重量５個数
			row.put(65, null);
			//重量６個数
			row.put(66, null);
			//重量７（値）
			row.put(67, null);
			//重量７単位
			row.put(68, null);
			//重量７個数
			row.put(69, null);
			//重量８（値）
			row.put(70, null);
			//重量８単位
			row.put(71, null);
			//重量８個数
			row.put(72, null);

			resultList.add(row);
		}

		// ===== ０件チェック =====
		if (resultList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return resultList;
	}
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  End

	/**
	 * <h2>EC受注ヘッダのリストからゆうパック送り状用データを作成する。</h2>
	 * <pre>
	 * EC受注ヘッダのリストからゆうパック送り状用データを作成する。
	 * CSV出力データ対象がない場合、０件エラーをエラー管理クラスに設定する。
	 * </pre>
	 * @param ecOrderHList EC受注ヘッダリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<SortedMap<Integer, Object>> 送り状データリスト
	 */
	public List<SortedMap<Integer, Object>> createYoupackCsvData(List<TEcOrderH> ecOrderHList, ErrorStatus errSts) {
		// [C-CWMS-0027] ゆうパックプリントR対応 追加 2015.05.15 kyo Start

		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.19 kawana Start
		// 名寄せステータス=1の情報のマップ作成
		Map<String, TEcOrderH> mergeInfoMap = mergeLogic.createMergeInfoMapWithCheck(ecOrderHList, errSts);
		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.19 kawana End
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 取得した結果からCSV出力データを作成
		List<SortedMap<Integer, Object>> resultList = new ArrayList<SortedMap<Integer, Object>>();

		// 出庫作業No.の出力済MAP
		HashMap<String, Boolean> processedShipWorkNoMap = new HashMap<String, Boolean>();

		for (TEcOrderH entity : ecOrderHList) {

			// 出庫作業No.
			String shipWorkNo = entity.chaseTShippingInstH().chaseTAllocInstH().chaseTPickingH().getPickingWorkNo();

			// ゆうパック送り状定義テーブル
			MCarrierSlipYupk mYoupack = entity.chaseTShippingInstH().chaseMDeliveryCourse().chaseMCarrierSlipYupk();

			// 既に処理済みの出庫作業No.の場合は処理しない
			if (!CU.isNullOrEmpty(shipWorkNo)) {
				if (processedShipWorkNoMap.containsKey(shipWorkNo)) {
					continue;
				} else {
					processedShipWorkNoMap.put(shipWorkNo, true);
				}
			}

			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.19 kawana Start
			// 名寄せステータス
			String mergeStatus = entity.getMergeStatus();
			if (!CU.isNullOrEmpty(mergeStatus) && !mergeStatus.equals("0")) {
				// 名寄せあり

				// 名寄せIDから代表情報を取得し置き換え
				String mergeId = entity.getMergeId();
				entity = mergeInfoMap.get(mergeId);
			}
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.19 kawana End

			// 出庫作業No.
			String pickingWorkNo = entity.chaseTShippingInstH().chaseTAllocInstH().chaseTPickingH().getPickingWorkNo();
			// 出庫作業No.の下５桁
			String pickingWorkNoLastFive = "";
			if (!CU.isNullOrEmpty(pickingWorkNo)) {
				if (pickingWorkNo.length() >= 5) {
					pickingWorkNoLastFive = pickingWorkNo.substring(pickingWorkNo.length() - 5, pickingWorkNo.length());
				} else {
					pickingWorkNoLastFive = pickingWorkNo;
				}
			} else {
				pickingWorkNoLastFive = "";
			}
			// 出力データ作成
			SortedMap<Integer, Object> row = new TreeMap<Integer, Object>();

			// お客様側管理番号
			row.put(1, pickingWorkNo); // 出庫作業No.
			// [ON推-品向-841] 日付形式を"yyyymmdd"に修正 2015.07.02 kawana Start
			// 発送予定日
			row.put(2, entity.chaseTShippingInstH().chaseTAllocInstH().getShippingDt()); // 出荷日
			// [ON推-品向-841] 日付形式を"yyyymmdd"に修正 2015.07.02 kawana End
			// 発送予定時間区分
			row.put(3, null);
			// 出荷期限日
			row.put(4, null);
			// [ON推-品向-842] 到着期限日に納品日を設定 2015.07.02 kawana Start
			// 到着期限日
			row.put(5, entity.chaseTShippingInstH().chaseTAllocInstH().getDelivDt());
			// [ON推-品向-842] 到着期限日に納品日を設定 2015.07.02 kawana End
			// 郵便種別
			row.put(6, mYoupack.getPostType());
			// 保冷種別
			row.put(7, mYoupack.getCoolType());
			// [ON推-品向-962] マスタからの設定項目追加 2015.10.05 kawana Start
			// 元/着払/代引
			row.put(8, mYoupack.getCodType());
			// [ON推-品向-962] マスタからの設定項目追加 2015.10.05 kawana End
			// 書留/セキュリティ/特定記録種別
			row.put(9, null);
			// 配達時間帯指定郵便種別
			row.put(10, null);
			// [ON推-品向-962] マスタからの設定項目追加 2015.10.05 kawana Start
			// 送り状種別
			row.put(11, CU.splitBytes(CU.nullToStr(mYoupack.getCarrierType()), 20, CHARSETS)[0]);
			// [ON推-品向-962] マスタからの設定項目追加 2015.10.05 kawana End
			// お届け先コード
			row.put(12, null);
			// お届け先郵便番号
			row.put(13, entity.getDelivZipCd());
			// お届け先住所１
			String[] splitAddr1 = {};
			if (!CU.isNullOrEmpty(entity.getInvoiceDelivAddress1())) {
				splitAddr1 = CU.splitBytes(CU.nullToStr(entity.getInvoiceDelivAddress1()), 50, CHARSETS);
			} else {
				splitAddr1 = CU.splitBytes(CU.nullToStr(entity.getDelivAddress1()), 50, CHARSETS);
			}
			row.put(14, splitAddr1[0]);
			// お届け先住所２
			String[] splitAddr2 = {};
			if (!CU.isNullOrEmpty(entity.getInvoiceDelivAddress2())) {
				splitAddr2 = CU.splitBytes(CU.nullToStr(entity.getInvoiceDelivAddress2()), 50, CHARSETS);
			} else {
				splitAddr2 = CU.splitBytes(CU.nullToStr(entity.getDelivAddress2()), 50, CHARSETS);
			}
			row.put(15, splitAddr2[0]);
			// お届け先住所３
			String[] splitAddr3 = {};
			if (!CU.isNullOrEmpty(entity.getInvoiceDelivAddress3())) {
				splitAddr3 = CU.splitBytes(CU.nullToStr(entity.getInvoiceDelivAddress3()), 50, CHARSETS);
			} else {
				splitAddr3 = CU.splitBytes(CU.nullToStr(entity.getDelivAddress3()), 50, CHARSETS);
			}
			row.put(16, splitAddr3[0]);
			// お届け先名称１
			String[] delivNms = CU.splitBytes(entity.getDelivCustomerNm(), 50, CHARSETS); // 送付先名字
			row.put(17, delivNms[0]);
			// お届け先名称２
			row.put(18, null);
			// お届け先敬称区分
			row.put(19, null);
			// お届け先電話番号
			row.put(20, entity.getDelivTelNo());
			// お届け先メールアドレス１
			row.put(21, null);
			// お届け先局留め区分
			row.put(22, null);
			// お届け先局留め郵便局名
			row.put(23, null);
			// お届け先局留めメール使用区分
			row.put(24, null);
			// お届け先局留め郵便番号
			row.put(25, null);
			// お届け先配達予告メール使用区分
			row.put(26, null);
			// お届け先再配達予告メール使用区分
			row.put(27, null);
			// ご依頼主コード
			row.put(28, null);
			// ご依頼主集荷先と同一区分
			row.put(29, null);
			// ご依頼主郵便番号
			row.put(30, entity.getOrderZipCd());
			// ご依頼主住所１
			String[] splitOrderAddr1 = {};
			splitOrderAddr1 = CU.splitBytes(entity.getOrderAddress1(), 50, CHARSETS);
			row.put(31, splitOrderAddr1[0]);
			// ご依頼主住所２
			String[] splitOrderAddr2 = {};
			splitOrderAddr2 = CU.splitBytes(entity.getOrderAddress2(), 50, CHARSETS);
			row.put(32, splitOrderAddr2[0]);
			// ご依頼主住所３
			String[] splitOrderAddr3 = {};
			splitOrderAddr3 = CU.splitBytes(entity.getOrderAddress3(), 50, CHARSETS);
			row.put(33, splitOrderAddr3[0]);
			// ご依頼主名称１
			// 注文者名称 41バイト + 【 出庫作業No.の下５桁 】 (計 50バイト)
			String[] slipOrderCustomerNms = CU.splitBytes(entity.getOrderCustomerNm(), 41, CHARSETS);
			row.put(34, CU.nullToStr(slipOrderCustomerNms[0]) + "【" + pickingWorkNoLastFive + "】");
			// ご依頼主名称２
			row.put(35, null);
			// ご依頼主敬称
			row.put(36, null);
			// ご依頼主電話番号
			row.put(37, entity.getOrderTelNo());
			// ご依頼主メールアドレス１
			row.put(38, null);
			// ご依頼主荷送人指図区分
			row.put(39, null);
			// ご依頼主お届け通知メール使用区分
			row.put(40, null);
			// ご依頼主お届け通知はがき使用区分
			row.put(41, null);
			// 集荷先コード
			row.put(42, null);
			// 集荷先連携可否区分
			row.put(43, null);
			// 集荷先会社コード
			row.put(44, null);
			// 集荷先依頼先店所コード
			row.put(45, null);
			// 集荷先郵便番号
			row.put(46, null);
			// 集荷先住所１
			row.put(47, null);
			// 集荷先住所２
			row.put(48, null);
			// 集荷先住所３
			row.put(49, null);
			// 集荷先名称１
			row.put(50, null);
			// 集荷先名称２
			row.put(51, null);
			// 集荷先敬称
			row.put(52, null);
			// 集荷先電話番号
			row.put(53, null);
			// 受注番号
			row.put(54, entity.getOrderNo());
			// こわれもの区分
			row.put(55, null);
			// なまもの区分
			row.put(56, null);
			// ビン類区分
			row.put(57, null);
			// [ON推-品向-962] マスタからの設定項目追加 2015.10.05 kawana Start
			// 逆さま厳禁区分
			row.put(58, mYoupack.getNoUpsideDownCls());
			// 下積み厳禁区分
			row.put(59, mYoupack.getNoStockCls());
			// [ON推-品向-962] マスタからの設定項目追加 2015.10.05 kawana End
			// 商品サイズ区分
			row.put(60, mYoupack.getSlipProductSizeCls());
			// 重量合計(g)
			row.put(61, null);
			// 25kg超重量物区分
			row.put(62, null);
			// 損害要償額
			row.put(63, null);
			// 速達・配達日指定種別
			row.put(64, null);
			// [ON推-品向-841] 日付形式を"yyyymmdd"に修正 2015.07.02 kawana Start
			// 配達指定日/希望日
			row.put(65, entity.chaseTShippingInstH().chaseTAllocInstH().getDelivDt()); // 納品指定日
			// [ON推-品向-841] 日付形式を"yyyymmdd"に修正 2015.07.02 kawana End
			// [C-CWMS-0058] 荷札出力対応(時間帯CDの変換を共通ロジック化) 2016.07.28 kawana Start
			// 配達時間帯区分
			if (CU.isNullOrEmpty(entity.chaseTShippingInstH().chaseTAllocInstH().getDelivTz())) {
				row.put(66, matchingLogic.convertDelivTzWmsToCarrier(MatchingLogic.CarrierCls.YU_PACK, "empty"));
			} else {
				row.put(66, matchingLogic.convertDelivTzWmsToCarrier(MatchingLogic.CarrierCls.YU_PACK, entity.chaseTShippingInstH().chaseTAllocInstH().getDelivTz()));
			}
			// [C-CWMS-0058] 荷札出力対応(時間帯CDの変換を共通ロジック化) 2016.07.28 kawana End
			// 差出方法区分
			row.put(67, null);
			// ゆうパック複数個割引
			row.put(68, null);
			// ゆうパック同一割引
			row.put(69, null);
			// セット商品コード
			row.put(70, null);
			// セット品名ラベル印字区分
			row.put(71, null);
			// 倉庫数
			row.put(72, null);
			// 複数個口数
			row.put(73, null);
			// 記事名１
			row.put(74, null);
			// 記事名２
			row.put(75, null);
			// フリー項目０１
			row.put(76, null);
			// フリー項目０２
			row.put(77, null);
			// フリー項目０３
			row.put(78, null);
			// フリー項目０４
			row.put(79, null);
			// フリー項目０５
			row.put(80, null);
			// フリー項目０６
			row.put(81, null);
			// フリー項目０７
			row.put(82, null);
			// フリー項目０８
			row.put(83, null);
			// フリー項目０９
			row.put(84, null);
			// フリー項目１０
			row.put(85, null);
			// 港利用区分
			row.put(86, null);
			// 空港・局/支店名
			row.put(87, null);
			// 航空会社名
			row.put(88, null);
			// 利用便名
			row.put(89, null);
			// レジャー区分
			row.put(90, null);
			// プレー・搭乗日
			row.put(91, null);
			// プレー・搭乗時間
			row.put(92, null);
			// クラブ本数
			row.put(93, null);
			// 往路集貨日
			row.put(94, null);
			// 出荷先登録名
			row.put(95, null);
			// 集荷希望区分
			row.put(96, null);
			// 集荷日付
			row.put(97, null);
			// 集荷時間帯区分
			row.put(98, null);
			// 視点連携先選択用名称
			row.put(99, null);
			// 代引金額
			row.put(100, entity.getAmountBilled()); // 請求金額
			// 代引消費税金額
			row.put(101, entity.getTax()); // 消費税
			// 送り状発行年月日
			row.put(102, null);
			// 商品番号(明細)
			row.put(103, mYoupack.getSlipProductNo());
			// 品名(明細)
			row.put(104, mYoupack.getSlipItemNm());
			// 個数(明細)
			row.put(105, null);
			// 重量(g)(明細)
			row.put(106, null);
			// 単価(明細)
			row.put(107, null);
			// 金額(明細)
			row.put(108, null);
			// 商品備考０１(明細)
			row.put(109, null);
			// 商品備考０２(明細)
			row.put(110, null);
			// 商品備考０３(明細)
			row.put(111, null);
			// 商品備考０４(明細)
			row.put(112, null);
			// 商品備考０５(明細)
			row.put(113, null);
			// 商品備考０６(明細)
			row.put(114, null);
			// 商品備考０７(明細)
			row.put(115, null);
			// 商品備考０８(明細)
			row.put(116, null);
			// 商品備考０９(明細)
			row.put(117, null);
			// 商品備考１０(明細)
			row.put(118, null);

			resultList.add(row);
		}
		// [C-CWMS-0027] ゆうパックプリントR対応 追加 2015.05.15 kyo End
		// ===== ０件チェック =====
		if (resultList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		return resultList;
	}

	// [ON推-品向-791] 文字コードをマスタから設定 2015.04.22 kawana End

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  Start
	/**
	 * <h2>EC受注ヘッダのリストからゆうパック(発送履歴)送り状用データを作成する。</h2>
	 * <pre>
	 * EC受注ヘッダのリストからゆうパック(発送履歴)送り状用データを作成する。
	 * CSV出力データ対象がない場合、０件エラーをエラー管理クラスに設定する。
	 * </pre>
	 * @param ecOrderHList EC受注ヘッダリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<SortedMap<Integer, Object>> 送り状データリスト
	 */
	public List<SortedMap<Integer, Object>> createHYoupackCsvData(List<TEcOrderH> ecOrderHList, ErrorStatus errSts) {
		// 名寄せステータス=1の情報のマップ作成
		mergeLogic.createMergeInfoMapWithCheck(ecOrderHList, errSts);
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 出庫作業No.の出力済MAP
		HashMap<Long, Boolean> processedAllocInstHIdMap = new HashMap<Long, Boolean>();
		List<TAllocInstH> allocInstHList = new ArrayList<TAllocInstH>();
		for (TEcOrderH entity : ecOrderHList) {
			// 出庫作業No.
			Long allocInstHId = entity.chaseTShippingInstH().chaseTAllocInstH().getAllocInstHId();

			// 既に処理済みの出庫作業No.の場合は処理しない
			if (allocInstHId != null) {
				if (processedAllocInstHIdMap.containsKey(allocInstHId)) {
					continue;
				} else {
					processedAllocInstHIdMap.put(allocInstHId, true);
					allocInstHList.add(entity.chaseTShippingInstH().chaseTAllocInstH());
				}
			}
		}

		// ===== 送り状データ出力データ取得 =====
		List<TPackingH> selectPackingList = selectTPackingH(allocInstHList, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 取得した結果からCSV出力データを作成
		List<SortedMap<Integer, Object>> resultList = new ArrayList<SortedMap<Integer, Object>>();

		String pickingWorkNo = null;
		String carrierTraceNum = null;
		String currentPickingWorkNo = null;
		String currentCarrierTraceNum = null;
		boolean isFirst = true;
		for (int i = 0; i < selectPackingList.size(); i++) {
			currentPickingWorkNo = selectPackingList.get(i).chaseTPickingH().getPickingWorkNo();
			currentCarrierTraceNum = CU.nullToStr(selectPackingList.get(i).getCarrierTraceNum());

			// 出庫作業No.、貨物追跡No.単位に出力
			if (isFirst || !pickingWorkNo.equals(currentPickingWorkNo) || !carrierTraceNum.equals(currentCarrierTraceNum)) {
				// 出力データ作成
				SortedMap<Integer, Object> row = new TreeMap<Integer, Object>();

				// お客様側管理番号
				row.put(1, CU.getFullString(currentPickingWorkNo));
				// お問い合わせ番号
				row.put(2, currentCarrierTraceNum);
				// 発送日;
				row.put(3, selectPackingList.get(i).chaseTAllocInstH().getShippingDt());
				// 配達希望日
				row.put(4, selectPackingList.get(i).chaseTAllocInstH().getDelivDt());
				// 配達時間帯区分
				if (CU.isNullOrEmpty(selectPackingList.get(i).chaseTAllocInstH().getDelivTz())) {

					row.put(5, matchingLogic.convertDelivTzWmsToCarrier(MatchingLogic.CarrierCls.YU_PACK, "empty"));
				} else {

					row.put(5, matchingLogic.convertDelivTzWmsToCarrier(MatchingLogic.CarrierCls.YU_PACK, selectPackingList.get(i).chaseTAllocInstH().getDelivTz()));
				}

				resultList.add(row);

				isFirst = false;
				pickingWorkNo = currentPickingWorkNo;
				carrierTraceNum = currentCarrierTraceNum;
            }
		}

		// ===== ０件チェック =====
		if (resultList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		return resultList;
	}

	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403] ゆうパックの送り状データの新しいフォーマット作成 2016.12.27 nayzaw Start
	/**
	 * @param ecOrderHList EC受注ヘッダリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<SortedMap<Integer, Object>> 送り状データリスト
	 */
	public List<SortedMap<Integer, Object>> createCYoupackCsvData(List<TEcOrderH> ecOrderHList, ErrorStatus errSts) {
		// 名寄せステータス=1の情報のマップ作成
		mergeLogic.createMergeInfoMapWithCheck(ecOrderHList, errSts);
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		HashMap<Long, TEcOrderH> shippingInstHIdMap = new HashMap<Long, TEcOrderH>();
		for(TEcOrderH tEcOrderH : ecOrderHList){
			shippingInstHIdMap.put(tEcOrderH.getShippingInstHId(), tEcOrderH);
		}
		// 出庫作業No.の出力済MAP
		HashMap<Long, Boolean> processedAllocInstHIdMap = new HashMap<Long, Boolean>();
		List<TAllocInstH> allocInstHList = new ArrayList<TAllocInstH>();
		for (TEcOrderH entity : ecOrderHList) {
			// 出庫作業No.
			Long allocInstHId = entity.chaseTShippingInstH().chaseTAllocInstH().getAllocInstHId();

			// 既に処理済みの出庫作業No.の場合は処理しない
			if (allocInstHId != null) {
				if (processedAllocInstHIdMap.containsKey(allocInstHId)) {
					continue;
				} else {
					processedAllocInstHIdMap.put(allocInstHId, true);
					TAllocInstH tAllocInstH = entity.chaseTShippingInstH().chaseTAllocInstH();
					tAllocInstH.setDelivZipCd(entity.getDelivZipCd());
					tAllocInstH.setDelivTelNo(entity.getDelivTelNo());

					allocInstHList.add(tAllocInstH);
				}
			}
		}
		// ===== 送り状データ出力データ取得 =====
		List<TPackingB> selectPackingList = selectTPackingB(allocInstHList, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 取得した結果からCSV出力データを作成
		List<SortedMap<Integer, Object>> resultList = new ArrayList<SortedMap<Integer, Object>>();

		boolean isFirst = true;
		long packingHId = 0l;

		for (int i = 0; i < selectPackingList.size(); i++) {
			TPackingB tPackingB = selectPackingList.get(i);

			// 出庫作業No.、貨物追跡No.単位に出力
			if (isFirst || packingHId != tPackingB.getPackingHId()) {
				packingHId = tPackingB.getPackingHId();
				isFirst = false;
				// ゆうパック送り状情報取得
				MCarrierSlipYupk mYouPack = tPackingB.chaseTPackingH().chaseTAllocInstH().chaseMDeliveryCourse().chaseMCarrierSlipYupk();
				long shippingInstHId = tPackingB.chaseTPickingB().chaseTShippingInstB().chaseTShippingInstH().getShippingInstHId();
				TEcOrderH tEcOrderH = shippingInstHIdMap.get(shippingInstHId);
				SortedMap<Integer, Object> row = new TreeMap<Integer, Object>();

				// ファイル識別コード
				row.put(1, FILE_IDENTIFICATION_CODE);
				// 発送日
				row.put(2,tPackingB.chaseTPickingB().chaseTShippingInstB().chaseTShippingInstH().getShippingDt());
				// 発送時刻
				row.put(3, null);
				// 商品種別コード
				row.put(4, mYouPack.getProductTypeCode());
				// 注意コード
				row.put(5, null);
				// 伝票個数
				row.put(6, tPackingB.getShippingInstHCount());
				// お問い合わせ番号
				row.put(7, tPackingB.chaseTPackingH().getCarrierTraceNum());
				// お客様側管理番号
				row.put(8, tPackingB.chaseTPackingH().chaseTPickingH().getPickingWorkNo());
				// 複数個口代表お問い合わせ番号
				// 出庫ヘッダに紐付く、出荷梱包ヘッダ.貨物追跡No.の最小値(複数個口の時のみ)
				if(tPackingB.getPackingHCount() > 1){
					row.put(9, tPackingB.getMinCarrierTraceNum());
				}else{
					row.put(9, "");
				}
				// ゆうびんビズカードお客さま番号
				row.put(10, mYouPack.getPostBizCardCustomerNo());
				row.put(11, null);

				// ご依頼主名
				// 全角50文字もしくは半角100文字
				String[] slipClientNm = CU.splitBytes(CU.nullToStr(mYouPack.getSlipClientNm1()), 100, CHARSETS);
				row.put(12,slipClientNm[0]);
				row.put(13, null);
				row.put(14, null);
				// ご依頼主電話番号
				row.put(15, mYouPack.getSlipClientTelNo());
				// ご依頼主郵便番号
				row.put(16, mYouPack.getSlipClientZipCd());
				// ご依頼主住所
				// 全半角150文字まで
				String slipClientAddress = new StringBuilder()
						.append(CU.nullToStr(mYouPack.getSlipClientAddress1()))
						.append(CU.nullToStr(mYouPack.getSlipClientAddress2()))
						.append(CU.nullToStr(mYouPack.getSlipClientAddress3())).toString();

				if(slipClientAddress != null && slipClientAddress.length() > 150){
					slipClientAddress = slipClientAddress.substring(0,150);
				}
				row.put(17, slipClientAddress);
				// （ご依頼主住所１）
				row.put(18, null);
				// （ご依頼主住所２）
				row.put(19, null);
				// （ご依頼主住所３）
				row.put(20, null);
				// お届け先名
				String[] delivCustomerNm = CU.splitBytes(CU.nullToStr(tEcOrderH.getDelivCustomerNm()), 100, CHARSETS);
				row.put(21, delivCustomerNm[0]);
				row.put(22, null);
				row.put(23, null);
				// お届け先電話番号
				row.put(24, tEcOrderH.getDelivTelNo());
				// お届け先郵便番号
				row.put(25, tEcOrderH.getDelivZipCd());
				// お届け先住所
				// 全半角150文字まで
				String delivAddress = new StringBuilder()
				.append(CU.nullToStr(tEcOrderH.getDelivAddress1()))
				.append(CU.nullToStr(tEcOrderH.getDelivAddress2()))
				.append(CU.nullToStr(tEcOrderH.getDelivAddress3())).toString();

				if(delivAddress != null && delivAddress.length() > 150){
					delivAddress = delivAddress.substring(0, 150);
				}
				row.put(26, delivAddress);

				row.put(27, null);
				row.put(28, null);
				row.put(29, null);
				row.put(30, null);
				row.put(31, tEcOrderH.getDelivDt());
				if (CU.isNullOrEmpty(tEcOrderH.getDelivTz())) {
					row.put(32, matchingLogic.convertDelivTzWmsToCarrier(MatchingLogic.CarrierCls.YU_PACK, "empty"));
				} else {
					row.put(32, matchingLogic.convertDelivTzWmsToCarrier(MatchingLogic.CarrierCls.YU_PACK, tEcOrderH.getDelivTz()));
				}

				row.put(33, null);
				// 代金引換金額
				if(tEcOrderH.getAmountBilled() != null){
					row.put(34, tEcOrderH.getAmountBilled());
				}else{
					row.put(34, "");
				}
				// 消費税額等
				if(tEcOrderH.getTax()!= null){
					row.put(35, tEcOrderH.getTax());
				}else{
					row.put(35, "");
				}
				//品名
				String slipItemNm = mYouPack.getSlipItemNm();
				if(slipItemNm != null && slipItemNm.length() > 60){
					slipItemNm = slipItemNm.substring(0, 60);
				}
				row.put(36, slipItemNm);
				row.put(37, null);
				row.put(38, null);
				row.put(39, null);
				row.put(40, null);

				if(tPackingB.chaseTPackingH().getBoxId() != null && tPackingB.chaseTPackingH().chaseTAllocInstH().chaseMDeliveryCourse().getCarrierId() != null){
					String boxSizeCd = selectBoxSizeCd(tPackingB.chaseTPackingH().chaseTAllocInstH().chaseMDeliveryCourse().getCarrierId(), tPackingB.chaseTPackingH().getBoxId());
					if(boxSizeCd != null){
						if(boxSizeCd.equals(BOX_SIZE_60)){
							boxSizeCd = BOX_SIZE_060;
						}
						else if(boxSizeCd.equals(BOX_SIZE_80)){
							boxSizeCd = BOX_SIZE_080;
						}
					}
					row.put(41, boxSizeCd);
				}else{
					row.put(41, null);
				}
				row.put(42, null);
				row.put(43, null);
				row.put(44, null);
				row.put(45, null);
				row.put(46, null);
				// 発送会社コード
				row.put(47, mYouPack.getShippingCompanyCode());
				// 発送局コード
				row.put(48, mYouPack.getShipmentCode());
				row.put(49, null);
				row.put(50, null);
				row.put(51, null);
				row.put(52, null);
				row.put(53, null);
				row.put(54, null);
				row.put(55, null);
				row.put(56, null);
				row.put(57, null);
				row.put(58, null);
				row.put(59, null);
				row.put(60, null);
				row.put(61, null);
				row.put(62, null);
				row.put(63, null);
				row.put(64, null);
				row.put(65, null);
				row.put(66, null);
				row.put(67, null);
				row.put(68, "0");
				row.put(69, null);

				resultList.add(row);
			}
		}
		if (resultList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		return resultList;
	}

	// [品質向上対策 #403] ゆうパックの送り状データの新しいフォーマット作成 2017.1.16 nayzaw Start

	/**
	 * @param ecOrderHList EC受注ヘッダリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<SortedMap<Integer, Object>> 送り状データリスト
	 */
	public List<SortedMap<Integer, Object>> createLargeFDYupkEexportData(List<TEcOrderH> ecOrderHList, ErrorStatus errSts){

		// 名寄せステータス=1の情報のマップ作成
		mergeLogic.createMergeInfoMapWithCheck(ecOrderHList, errSts);
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		HashMap<Long, TEcOrderH> shippingInstHIdMap = new HashMap<Long, TEcOrderH>();
		for(TEcOrderH tEcOrderH : ecOrderHList){
			shippingInstHIdMap.put(tEcOrderH.getShippingInstHId(), tEcOrderH);
		}
		// 出庫作業No.の出力済MAP
		HashMap<Long, Boolean> processedAllocInstHIdMap = new HashMap<Long, Boolean>();
		List<TAllocInstH> allocInstHList = new ArrayList<TAllocInstH>();
		for (TEcOrderH entity : ecOrderHList) {
			// 出庫作業No.
			Long allocInstHId = entity.chaseTShippingInstH().chaseTAllocInstH().getAllocInstHId();

			// 既に処理済みの出庫作業No.の場合は処理しない
			if (allocInstHId != null) {
				if (processedAllocInstHIdMap.containsKey(allocInstHId)) {
					continue;
				} else {
					processedAllocInstHIdMap.put(allocInstHId, true);
					TAllocInstH tAllocInstH = entity.chaseTShippingInstH().chaseTAllocInstH();
					tAllocInstH.setDelivZipCd(entity.getDelivZipCd());
					tAllocInstH.setDelivTelNo(entity.getDelivTelNo());

					allocInstHList.add(tAllocInstH);
				}
			}
		}
		// ===== 送り状データ出力データ取得 =====
		List<TPackingB> selectPackingList = selectTPackingB(allocInstHList, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 取得した結果からCSV出力データを作成
		List<SortedMap<Integer, Object>> resultList = new ArrayList<SortedMap<Integer, Object>>();

		boolean isFirst = true;
		long packingHId = 0l;

		for (int i = 0; i < selectPackingList.size(); i++) {
			TPackingB tPackingB = selectPackingList.get(i);

			// 出庫作業No.、貨物追跡No.単位に出力
			if (isFirst || packingHId != tPackingB.getPackingHId()) {
				packingHId = tPackingB.getPackingHId();
				isFirst = false;
				// ゆうパック送り状情報取得
				MCarrierSlipYupk mYouPack = tPackingB.chaseTPackingH().chaseTAllocInstH().chaseMDeliveryCourse().chaseMCarrierSlipYupk();
				long shippingInstHId = tPackingB.chaseTPickingB().chaseTShippingInstB().chaseTShippingInstH().getShippingInstHId();
				TEcOrderH tEcOrderH = shippingInstHIdMap.get(shippingInstHId);
				SortedMap<Integer, Object> row = new TreeMap<Integer, Object>();

				// ファイル識別コード
				row.put(1, FILE_IDENTIFICATION_CODE);
				// 発送日
				row.put(2,tPackingB.chaseTPickingB().chaseTShippingInstB().chaseTShippingInstH().getShippingDt());
				row.put(3, null);
				row.put(4, null);
				row.put(5, null);
				// お問い合わせ番号
				row.put(6, tPackingB.chaseTPackingH().getCarrierTraceNum());
				// お客様側管理番号
				row.put(7, tPackingB.chaseTPackingH().chaseTPickingH().getPickingWorkNo());
				// ゆうびんビズカードお客さま番号
				row.put(8, mYouPack.getPostBizCardCustomerNo());
				row.put(9, null);
				// お届け先名
				String[] delivCustomerNm = CU.splitBytes(CU.nullToStr(tEcOrderH.getDelivCustomerNm()), 100, CHARSETS);
				row.put(10, delivCustomerNm[0]);
				row.put(11, null);
				row.put(12, null);
				// お届け先電話番号
				row.put(13, tEcOrderH.getDelivTelNo());
				// お届け先郵便番号
				row.put(14, tEcOrderH.getDelivZipCd());
				// お届け先住所
				// 全半角150文字まで
				String delivAddress = new StringBuilder()
				.append(CU.nullToStr(tEcOrderH.getDelivAddress1()))
				.append(CU.nullToStr(tEcOrderH.getDelivAddress2()))
				.append(CU.nullToStr(tEcOrderH.getDelivAddress3())).toString();

				if(delivAddress != null && delivAddress.length() > 150){
					delivAddress = delivAddress.substring(0, 150);
				}
				row.put(15, delivAddress);

				row.put(16, null);
				row.put(17, null);
				row.put(18, null);

				// 代金引換金額
				if(tEcOrderH.getAmountBilled() != null){
					row.put(19, tEcOrderH.getAmountBilled());
				}else{
					row.put(19, "");
				}
				row.put(20, null);
				// 発送会社コード
				row.put(21, mYouPack.getShippingCompanyCode());
				// 発送局コード
				row.put(22, mYouPack.getShipmentCode());

				row.put(23, null);
				row.put(24, null);
				row.put(25, null);
				row.put(26, null);
				row.put(27, null);
				row.put(28, null);
				// 登録取消区分
				row.put(29, "1");

				resultList.add(row);
			}
		}
		if (resultList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		return resultList;
	}
	// [品質向上対策 #403] ゆうパックの送り状データの新しいフォーマット作成 2017.1.16 nayzaw End

	/**
	 * <h2>EC送り状CSVデータを取得する。</h2>
	 * <pre>
	 * EC送り状CSVデータを取得処理を行って、
	 * 検索対象が見つからない場合、０件エラーをエラー管理クラスに設定する。
	 *
	 * @param allocInstHList 引当指示ヘッダリスト：引当指示ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TPackingH> 梱包ヘッダリスト
	 */
	public List<TPackingB> selectTPackingB(final List<TAllocInstH> allocInstHList, ErrorStatus errSts){
		// 検索対象のEC受注ヘッダIDを抽出
		Set<Long> idSet = new HashSet<Long>();
		for (TAllocInstH h : allocInstHList) {
			idSet.add(h.getAllocInstHId());
		}

		if (idSet.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		List<TPackingB> result = null;
		//
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.setupSelect_TPackingH();
		cb.setupSelect_TPackingH().withTPickingH();
		cb.setupSelect_TPackingH().withTAllocInstH();
		cb.setupSelect_TPackingH().withTAllocInstH().withMDeliveryCourse().withMCarrierSlipYmt();
		cb.setupSelect_TPackingH().withTAllocInstH().withMDeliveryCourse().withMCarrierSlipSgw();
		cb.setupSelect_TPackingH().withTAllocInstH().withMDeliveryCourse().withMCarrierSlipYupk();
		cb.setupSelect_TPickingB().withTShippingInstB().withTShippingInstH();

		// 出庫指示バッチNo.
		cb.specify().specifyTPackingH().specifyTAllocInstH().derivedTShippingInstHList().max(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB maxCb) {
				maxCb.specify().columnPickingBatchNo();
			}
		}, TPackingB.ALIAS_pickingBatchNo);

		cb.specify().specifyTPackingH().specifyTAllocInstH().derivedTShippingInstHList().count(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB countCb){
				countCb.specify().columnShippingInstHId();
			}
		}, TPackingB.ALIAS_shippingInstHCount);

		cb.specify().specifyTPackingH().specifyTAllocInstH().derivedTPackingHList().count(new SubQuery<TPackingHCB>() {
			@Override
			public void query(TPackingHCB countCb){
				countCb.specify().columnPackingHId();
			}
		}, TPackingB.ALIAS_packingHCount);

		cb.specify().specifyTPackingH().specifyTAllocInstH().derivedTPackingHList().min(new SubQuery<TPackingHCB>() {
			@Override
			public void query(TPackingHCB minCb){
				minCb.specify().columnCarrierTraceNum();
			}
		}, TPackingH.ALIAS_minCarrierTraceNum);

		// 検索条件の設定
		cb.query().queryTPackingH().setAllocInstHId_InScope(idSet);

		// ソート順
		cb.query().queryTPackingH().queryTPickingH().queryMClient().addOrderBy_ClientCd_Asc();
		cb.query().queryTPackingH().queryTPickingH().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTPackingH().queryTAllocInstH().addOrderBy_WorkDt_Asc();
		cb.query().queryTPackingH().queryTAllocInstH().addSpecifiedDerivedOrderBy_Asc(TPackingB.ALIAS_pickingBatchNo);
		cb.query().queryTPackingH().queryTAllocInstH().queryMDeliveryCourse().addOrderBy_DeliveryCourseCd_Asc();
		cb.query().queryTPackingH().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		cb.query().queryTPackingH().addOrderBy_PackingHId_Asc();
		cb.query().queryTPackingH().addOrderBy_CarrierTraceNum_Asc();

		// 検索実行
		result = tPackingBBhv.selectList(cb);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}
		return result;
	}
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403] ゆうパックの送り状データの新しいフォーマット作成 2016.12.27 nayzaw End

	/**
	 * <h2>EC送り状CSVデータを取得する。</h2>
	 * <pre>
	 * EC送り状CSVデータを取得処理を行って、
	 * 検索対象が見つからない場合、０件エラーをエラー管理クラスに設定する。
	 * </pre>
	 * @param allocInstHList 引当指示ヘッダリスト：引当指示ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TPackingH> 梱包ヘッダリスト
	 * */
	public List<TPackingH> selectTPackingH(final List<TAllocInstH> allocInstHList, ErrorStatus errSts) {

		// 検索対象のEC受注ヘッダIDを抽出
		Set<Long> idSet = new HashSet<Long>();
		for (TAllocInstH h : allocInstHList) {
			idSet.add(h.getAllocInstHId());
		}

		if (idSet.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		List<TPackingH> result = null;

		// ===== 梱包ヘッダリストデータ取得 =====
		TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
		tPackingHCB.setupSelect_TPickingH();
		tPackingHCB.setupSelect_TAllocInstH();
		tPackingHCB.setupSelect_TAllocInstH().withMDeliveryCourse().withMCarrierSlipYmt();
		tPackingHCB.setupSelect_TAllocInstH().withMDeliveryCourse().withMCarrierSlipSgw();
		tPackingHCB.setupSelect_TAllocInstH().withMDeliveryCourse().withMCarrierSlipYupk();

		// 出庫指示バッチNo.
		tPackingHCB.specify().specifyTAllocInstH().derivedTShippingInstHList().max(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB maxCb) {
				maxCb.specify().columnPickingBatchNo();
			}
		}, TPackingH.ALIAS_pickingBatchNo);

		// 検索条件の設定
		tPackingHCB.query().setAllocInstHId_InScope(idSet);

		// ソート順
		tPackingHCB.query().queryTPickingH().queryMClient().addOrderBy_ClientCd_Asc();
		tPackingHCB.query().queryTPickingH().queryMCenter().addOrderBy_CenterCd_Asc();
		tPackingHCB.query().queryTAllocInstH().addOrderBy_WorkDt_Asc();
		tPackingHCB.query().queryTAllocInstH().addSpecifiedDerivedOrderBy_Asc(TPackingH.ALIAS_pickingBatchNo);
		tPackingHCB.query().queryTAllocInstH().queryMDeliveryCourse().addOrderBy_DeliveryCourseCd_Asc();
		tPackingHCB.query().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		tPackingHCB.query().addOrderBy_CarrierTraceNum_Asc();

		// 検索実行
		result = tPackingHBhv.selectList(tPackingHCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/01  End

	// [C-CWMS-0058] 荷札出力対応(時間帯CDの変換を共通ロジック化)不要になったメソッドを削除 2016.07.28 kawana

	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403] ゆうパックの送り状データの新しいフォーマット作成 2016.12.29 nayzaw Start
	/**
	 * <h2>荷材サイズCDを取得</h2>
	 * <pre>
	 * 運送業者IDおよび荷材IDで荷材サイズCDを取得する処理
	 * </pre>
	 * @param carrierId 運送業者ID
	 * @param boxId 荷材ID
	 * @return 荷材サイズCD
	 */
	public String selectBoxSizeCd(Long carrierId, Long boxId) {

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
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403] ゆうパックの送り状データの新しいフォーマット作成 2016.12.29 nayzaw End

	private boolean isSingleByteChars(String str, int len, String charset) {

		String w = CU.nullToStr(str);

		if (w.length() > len) {
			w = w.substring(0, len);
		}

		try {
			if (w.getBytes(charset).length != w.length()) {
				return false;
			} else {
				return true;
			}
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}

	}

}
