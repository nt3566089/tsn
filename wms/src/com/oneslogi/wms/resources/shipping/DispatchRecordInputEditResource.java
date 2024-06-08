package com.oneslogi.wms.resources.shipping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MCarrierCB;
import com.oneslogi.base.dbflute.cbean.MCrelaybsCB;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.dtomapper.TCcopamDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MCarrierBhv;
import com.oneslogi.base.dbflute.exbhv.MCrelaybsBhv;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCrelaybs;
import com.oneslogi.base.dbflute.exentity.TCcopam;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.logic.NumberingLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsConst;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.DeliveryListDto;
import com.oneslogi.wms.dto.shipping.DispatchRecordInputEditDto;
import com.oneslogi.wms.logic.common.CarrierLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.shipping.CcopamSelectLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstructionInfoPrintSelectLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstructionInfoPrintUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;
import com.oneslogi.wms.resources.shipping.DispatchRecordInputResource.ReportName;

import net.arnx.jsonic.JSON;

/**
 * 配車実績入力(編集)画面のリソースクラス。
 */
@Path("/shipping/dispatchRecordInputEdit")
public class DispatchRecordInputEditResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	private static final String REPORT_CD = "DeliveryList";

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 拠点マスタに存在しません
		 */
		protected static final int CENTER_NOT_FOUND_ERROR = 2;
		/**
		 * 荷主マスタに存在しません
		 */
		protected static final int CLIENT_NOT_FOUND_ERROR = 3;
		/**
		 * データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 4;
		/**
		 * 着日が中継拠点の適用期間外です
		 */
		protected static final int SHIPTO_RELAY_BASE_OUT_OF_PERIOD_ERROR = 5;
		/**
		 * 他のユーザに変更された可能性があります
		 */
		protected static final int ENTITY_ALREADY_DELETED_ERROR = 6;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK = 7;
	}

	/**
	 * CAPセンターフラグ定義
	 */
	protected static class CapFlg {
		// '1'(CAPセンター)
		protected static final String CAP_FLG_CAP = "1";
		// '0'(CAPセンター以外)
		protected static final String CAP_FLG_OTHER = "0";
	}

	/**
	 * 倉庫区分定義
	 */
	protected static class WarehouseCls {
		// '0'(CAP倉庫)
		protected static final String CLS_CAP = "0";
	}

	/**
	 * 輸送区分定義
	 */
	protected static class SupplierrCvFlg {
		// '2'(CAP)
		protected static final String FLG_CAP = "2";
		// '1'(中継)
		protected static final String FLG_OTHER= "1";
		// '0'(TD)
		protected static final String FLG_TD= "0";
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CcopamSelectLogic selectLogic;
	@Inject
	private ShippingInstructionInfoPrintUpdateLogic updateLogic;
	@Inject
	private ShippingInstructionInfoPrintSelectLogic printSelectLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private NumberingLogic numberingLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private MCarrierBhv mCarrierBhv;
	@Inject
	private MCrelaybsBhv mCrelaybsBhv;

	/**
	 * <h2>初期処理（新規）。</h2>
	 *
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 *
	 * @return DispatchRecordInputEditDto 配車実績入力(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public DispatchRecordInputEditDto initNew() {
		DispatchRecordInputEditDto dispatchRecordInputEditDto = new DispatchRecordInputEditDto();
		// 発行帳票を指定
		dispatchRecordInputEditDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);
		// 拠点
		String defCenterCd = getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_CD_KEY_NAME);

		// 拠点マスタを検索、倉庫区分を取得する
		MCenter mCenterInput = new MCenter();
		mCenterInput.setCenterCd(defCenterCd);
		MCenter mCenter = centerLogic.getUkEntity(mCenterInput);
		// エラーが発生した場合、エラーメッセージを出力し、処理を中断する
		if (mCenter == null) {
			getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}
		// 倉庫区分
		String warehouseCls = mCenter.getWarehousecls();

		// CAPセンターフラグ(0:CAPセンター以外)
		String capFlg = CapFlg.CAP_FLG_OTHER;
		// 輸送区分(1:中継)
		dispatchRecordInputEditDto.data.head.setTdrelayid(SupplierrCvFlg.FLG_OTHER);

		if (!CU.isNullOrEmpty(warehouseCls) && WarehouseCls.CLS_CAP.equals(warehouseCls)) {
			// 変数.倉庫区分が'0'(CAP倉庫)の場合、CAPセンターフラグ(に1:CAPセンターを設定する
			capFlg = CapFlg.CAP_FLG_CAP;
			// 変数.倉庫区分が'0'(CAP倉庫)の場合、輸送区分(3:CAP)
			dispatchRecordInputEditDto.data.head.setTdrelayid(SupplierrCvFlg.FLG_CAP);
		}
		dispatchRecordInputEditDto.data.head.setWarehouseCls(capFlg);
		return dispatchRecordInputEditDto;
	}

	/**
	 * <h2>中継輸送業者名のドロップダウンリスト取得</h2>
	 * <pre>
	 * </pre>
	 * @return List<MCrelaybs>
	 */
	@GET
	@Path("/getMCrelaybs")
	public List<MCrelaybs> getMCrelaybs(@QueryParam("systemDt") String systemDt) {

		MCrelaybsCB mCrelaybsCB = mCrelaybsBhv.newConditionBean();
		mCrelaybsCB.orScopeQuery(new OrQuery<MCrelaybsCB>() {
			public void query(MCrelaybsCB orCB) {
				orCB.query().setDelymd_IsNull();
				orCB.query().setDelymd_GreaterThan(systemDt);
			}
		});
		mCrelaybsCB.query().setZzfrdateh_LessEqual(systemDt);
		mCrelaybsCB.query().setZztodateh_GreaterEqual(systemDt);

		return mCrelaybsBhv.selectList(mCrelaybsCB);
	}

	/**
	 * <h2>運輸業者名のドロップダウンリスト</h2>
	 * <pre>
	 * </pre>
	 * @return List<MCrelaybs>
	 */
	@GET
	@Path("/getMCarriers")
	public List<MCarrier> getMCarriers(@QueryParam("centerId") Long centerId) {
		MCarrierCB mCarrierCB = mCarrierBhv.newConditionBean();
		if(centerId != null) {
			mCarrierCB.query().setCenterId_Equal(centerId);
		}

		return mCarrierBhv.selectList(mCarrierCB);
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 *
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 *
	 * @param locationMasterDto 配車実績入力(編集)画面用DTO
	 * @return DispatchRecordInputEditDto 配車実績入力(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public DispatchRecordInputEditDto initUpdate(@QueryParam("ccopamId") String ccopamId, @QueryParam("centerId") Long centerId, @QueryParam("clientCd") String clientCd,
		 @QueryParam("centerCd") String centerCd) {
		DispatchRecordInputEditDto dispatchRecordInputEditDto = new DispatchRecordInputEditDto();
		// 発行帳票を指定
		dispatchRecordInputEditDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		// 荷主マスタ取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		// 荷主マスタに存在しません
		if (mClient == null) {
			getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}

		// 拠点マスタを検索、倉庫区分を取得する
		MCenter mCenterInput = new MCenter();
		mCenterInput.setCenterCd(centerCd);
		MCenter mCenter = centerLogic.getUkEntity(mCenterInput);
		// エラーが発生した場合、エラーメッセージを出力し、処理を中断する
		if (mCenter == null) {
			getErrorManager().add(errRetSts(StatusCode.CENTER_NOT_FOUND_ERROR), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}

		// 倉庫区分
		String warehouseCls = mCenter.getWarehousecls();

		// CAPセンターフラグ(0:CAPセンター以外)
		String capFlg = CapFlg.CAP_FLG_OTHER;
		// 輸送区分(1:中継)
		dispatchRecordInputEditDto.data.head.setTdrelayid(SupplierrCvFlg.FLG_OTHER);

		if (!CU.isNullOrEmpty(warehouseCls) && WarehouseCls.CLS_CAP.equals(warehouseCls)) {
			// 変数.倉庫区分が'0'(CAP倉庫)の場合、CAPセンターフラグ(に1:CAPセンターを設定する
			capFlg = CapFlg.CAP_FLG_CAP;
			// 変数.倉庫区分が'0'(CAP倉庫)の場合、輸送区分(3:CAP)
			dispatchRecordInputEditDto.data.head.setTdrelayid(SupplierrCvFlg.FLG_CAP);
		}

		TCcopam tCcopam = selectLogic.select(Long.valueOf(ccopamId), centerId, mClient.getClientId(), dispatchRecordInputEditDto.data.head.getTdrelayid(), errRetSts(StatusCode.NOT_FOUND_DATA));
		if (getErrorManager().size() > 0) {
			return dispatchRecordInputEditDto;
		}

		TCcopamDtoMapper mapper = new TCcopamDtoMapper();
		dispatchRecordInputEditDto.data.head = mapper.mappingToDto(tCcopam);
		dispatchRecordInputEditDto.data.head.setWarehouseCls(capFlg);
		return dispatchRecordInputEditDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 *
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 *
	 * @param dispatchRecordInputEditDto  配車実績入力(編集)画面用DTO
	 * @param errSts  ErrorStatus
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(DispatchRecordInputEditDto dispatchRecordInputEditDto) {
		TCcopamDtoMapper mapper = new TCcopamDtoMapper();
		TCcopam head = mapper.mappingToEntity(dispatchRecordInputEditDto.data.head);

		// 入力.輸送区分 == '1:中継' かつ 「発日」 > 「着日」
		if(SupplierrCvFlg.FLG_OTHER.equals(head.getTdrelayid()) && !CU.isNullOrEmpty(head.getSnymd()) &&
 				!CU.isNullOrEmpty(head.getArvymd()) && head.getSnymd().compareTo(head.getArvymd()) > 0){
			getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ARRIVAL_DATE_BEFORE_SHIPPING_DATE_ERROR);
			return null;
		}

		// 入力.輸送区分 == '1:中継' かつ 「着日」 > 「発日」 + 7日
		if(SupplierrCvFlg.FLG_OTHER.equals(head.getTdrelayid()) && !CU.isNullOrEmpty(head.getSnymd()) &&
 				!CU.isNullOrEmpty(head.getArvymd()) && head.getSnymd().compareTo(addDay(head.getArvymd(), 7)) > 0){
			getErrorManager().add(errRetSts(StatusCode.INPUT_CHECK), WmsMessageConst.ARRIVAL_DATE_RANGE_OVER_ERROR);
			return null;
		}

		this.getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}

	/**
	 * <h2>更新処理</h2>
	 *
	 * <pre>
	 * 更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 * </pre>
	 *
	 * @param dispatchRecordInputEditDto 配車実績入力(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(DispatchRecordInputEditDto dispatchRecordInputEditDto) {
		// ENTITY変換
		TCcopamDtoMapper mapper = new TCcopamDtoMapper();
		TCcopam head = mapper.mappingToEntity(dispatchRecordInputEditDto.data.head);

		// 拠点マスタ取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(head.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);

		// 拠点マスタに存在しません
		if (mCenter == null) {
			getErrorManager().add(errRetSts(StatusCode.CENTER_NOT_FOUND_ERROR), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}

		// 荷主マスタ取得
		MClient mClient = new MClient();
		mClient.setClientCd(head.getClientCd());
		mClient = clientLogic.getUkEntity(mClient);

		if (mClient == null) {
			getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}

		// 変数の初期化
		// 拠点ID
		Long centerId = mCenter.getCenterId();
		// 荷主ID
		Long clientId = mClient.getClientId();
		// 汎用パレット数
		Long gnlpltqa = 0L;
		// 配車実績入力ENTITY.輸送区分 == '3'(CAP)の場合
		if (SupplierrCvFlg.FLG_CAP.equals(head.getTdrelayid())) {
			// 入力.個数
			gnlpltqa = head.getNo().longValue();
		}else {
			gnlpltqa = head.getGnlpltqa();
		}

		// 配車実績入力ENTITY.輸送区分 == '1'(中継)の場合
		if (SupplierrCvFlg.FLG_OTHER.equals(head.getTdrelayid())) {
			// 中継拠点マスタを検索、レコードを取得する
			selectLogic.selectMCrelaybsCount(head.getArvymd(), errRetSts(StatusCode.SHIPTO_RELAY_BASE_OUT_OF_PERIOD_ERROR));
			if (getErrorManager().size() > 0) {
				return null;
			}
		}

		// コントロールNo.を取得する
		Long controlNo = numberingCenterLogic.getControlNo();

		// // 配車実績の更新
		updateLogic.updateControlNoEdit(controlNo, head);

		// 配車実績の更新
		updateLogic.editUpdate(controlNo, head, gnlpltqa);

		// コントロールNo.解放
		updateLogic.updateControlNoEdit(controlNo, null);

		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>新規処理</h2>
	 *
	 * <pre>
	 * 新規データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 * </pre>
	 *
	 * @param dispatchRecordInputEditDto 配車実績入力(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public DispatchRecordInputEditDto register(DispatchRecordInputEditDto dispatchRecordInputEditDto) {
		// ENTITY変換
		TCcopamDtoMapper mapper = new TCcopamDtoMapper();
		TCcopam head = mapper.mappingToEntity(dispatchRecordInputEditDto.data.head);

		// 拠点マスタ取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(head.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);

		// 拠点マスタに存在しません
		if (mCenter == null) {
			getErrorManager().add(errRetSts(StatusCode.CENTER_NOT_FOUND_ERROR), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}

		// 荷主マスタ取得
		MClient mClient = new MClient();
		mClient.setClientCd(head.getClientCd());
		mClient = clientLogic.getUkEntity(mClient);

		if (mClient == null) {
			getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}

		// 変数の初期化
		// 拠点ID
		Long centerId = mCenter.getCenterId();
		// 荷主ID
		Long clientId = mClient.getClientId();
		// 組織CD
		String centerCd = mCenter.getCenterCd();
		// 汎用パレット数
		Long gnlpltqa = 0L;
		// 配車実績入力ENTITY.輸送区分 == '3'(CAP)の場合
		if (SupplierrCvFlg.FLG_CAP.equals(head.getTdrelayid())) {
			// 入力.個数
			gnlpltqa = head.getNo().longValue();
		}else {
			gnlpltqa = head.getGnlpltqa();
		}

		// 配車実績入力ENTITY.輸送区分 == '1'(中継)の場合
		if (SupplierrCvFlg.FLG_OTHER.equals(head.getTdrelayid())) {
			// 中継拠点マスタを検索、レコードを取得する
			selectLogic.selectMCrelaybsCount(head.getArvymd(), errRetSts(StatusCode.SHIPTO_RELAY_BASE_OUT_OF_PERIOD_ERROR));
			if (getErrorManager().size() > 0) {
				return null;
			}
		}

		// 配車実績の登録を行う
		updateLogic.tCcopamInsert(head, gnlpltqa, centerId, clientId, centerCd);

		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		dispatchRecordInputEditDto.data.head = mapper.mappingToDto(head);
		return dispatchRecordInputEditDto;
	}

	/**
	 * <h2>配車実績入力(編集)発行。</h2>
	 * <pre>
	 * 配車実績入力(編集)発行を行う
	 * エラーがない場合は、配車実績入力(編集)データを発行し、完了メッセージを設定する
	 * </pre>
	 * @param dispatchRecordInputPrintDto 配車実績入力(一覧)画面発行用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/output")
	public DispatchRecordInputEditDto output(DispatchRecordInputEditDto dispatchRecordInputEditDto) throws Exception {

		// ENTITY変換
		TCcopamDtoMapper headerMapper = new TCcopamDtoMapper();
		TCcopam head = headerMapper.mappingToEntity(dispatchRecordInputEditDto.data.head);

		// 拠点ID取得
		MCenter mCenterInput = new MCenter();
		mCenterInput.setCenterCd(head.getCenterCd());
		MCenter mCenter = centerLogic.getUkEntity(mCenterInput);
		if (mCenter == null) {
			getErrorManager().add(errRetSts(StatusCode.CENTER_NOT_FOUND_ERROR), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}

		// 荷主ID取得
		MClient mClientInput = new MClient();
		mClientInput.setClientCd(head.getClientCd());
		MClient mClient = clientLogic.getUkEntity(mClientInput);
		if (mClient == null) {
			getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		long controlNo = numberingLogic.getControlNo();

		// コントロールNo.の設定
		updateLogic.updateControlNoEdit(controlNo, head);
		if (getErrorManager().size() > 0) {
			getErrorManager().add(errRetSts(StatusCode.ENTITY_ALREADY_DELETED_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// 検索実行
		DeliveryListDto printData = printSelectLogic.selectPrintDataEdit(head.getTdrelayid(), controlNo, errRetSts(StatusCode.ENTITY_ALREADY_DELETED_ERROR));
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 輸送帳票DTOリスト初期化
		List<DeliveryListDto> dataList = new ArrayList<DeliveryListDto>();

		// 変換した発行用データをレスポンス.配車実績入力(一覧)用DTO.依頼書アウトプットデータリストにaddする
		dataList.add(printData);

		// 帳票発行処理
		List<String> listDownloadUrl = new ArrayList<String>();
		String strRptNmOther = "";
		String strRptNmCap = "";
		for (int j = 0; j < 3; j++) {
			if (j == 0) {
				strRptNmOther = ReportName.RPTNM_OTHER1;
				strRptNmCap = ReportName.RPTNM_CAP1;
			} else if (j == 1) {
				strRptNmOther = ReportName.RPTNM_OTHER2;
				strRptNmCap = ReportName.RPTNM_CAP2;
			} else {
				strRptNmOther = ReportName.RPTNM_OTHER3;
				strRptNmCap = ReportName.RPTNM_CAP3;
			}

			for (int i = 0; i < dataList.size(); i++) {

				if (SupplierrCvFlg.FLG_OTHER.equals(dataList.get(i).getDeliveryClass())) {
					// 輸送区分が'1'(中継)の場合
					dataList.get(i).setReportName(strRptNmOther);
				} else {
					// 輸送区分が'1'(中継)以外の場合(TD・CAP)
					dataList.get(i).setReportName(strRptNmCap);
				}

				// 発送元
				dataList.get(i).setSupplierName(mCenter.getCenterNm());
			}
			JSON json = new JSON();
			json.setSuppressNull(true);
			// 輸送帳票を発行する
			dispatchRecordInputEditDto.printBasicData.outputData = json.format(dataList);
			printLogic.print(dispatchRecordInputEditDto);

			listDownloadUrl.add(dispatchRecordInputEditDto.output.downloadUrl);
		}

		updateLogic.updateControlNoEdit(controlNo, null);

		// 発行済みの帳票戻る
		DispatchRecordInputEditDto ret = new DispatchRecordInputEditDto();
		ret.output = dispatchRecordInputEditDto.output;
		ret.output.listDownloadUrl.clear();
		ret.output.listDownloadUrl.addAll(listDownloadUrl);

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return ret;
	}

	public static String addDay(String yyyyMMdd, int day) {

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date;
        try {
            date = format.parse(yyyyMMdd);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, day);
        date = calendar.getTime();

        yyyyMMdd = format.format(date);

        return yyyyMMdd;
    }

}
