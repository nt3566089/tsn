package com.oneslogi.wms.resources.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.AppCDef;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.dto.customize.SqlDeliveryCourseShippingListDto;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlDeliveryCourseShippingListDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlDeliveryCourseShippingList;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.DeliveryCourseShippingListDto;
import com.oneslogi.wms.logic.shipping.DeliveryCourseShippingListSelectLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic;
import com.oneslogi.wms.logic.shipping.WorkOrderLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/shipping/deliveryCourseShippingList")
public class DeliveryCourseShippingListResource extends AbstractWmsResource {

	// [ON推-品向-436] 出庫指示の前にエラーチェックを実行 2014.12.15 KI Start
//	@Inject
//	private TShippingInstBBhv tShippingInstBBhv;
	// [ON推-品向-436] 出庫指示の前にエラーチェックを実行 2014.12.15 KI End
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
		 * 出庫指示一覧データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 出荷状態チェック異常
		 */
		protected static final int SHIPPING_STATUS_CHECK_ERROR = 3;
		/**
		 * 出庫指示異常
		 */
		protected static final int SHIPPING_INST_ERROR = 4;
		/**
		 * 出庫指示解除異常
		 */
		protected static final int SHIPPING_INST_CANCEL_ERROR = 5;
		/**
		 * コントロールNo.更新異常
		 */
		protected static final int CONTROLNO_UPDATE_ERROR = 5;
		//dsx
		/**
		 * エラーチェック異常
		 */
		protected static final int ERROR_CHECK_ERROR = 6;
		//dsx
		// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana Start
		/**
		 * 出庫指示ステータス更新異常
		 */
		protected static final int UPDATE_STATUS_ERROR = 11;
		/**
		 * ジョブ登録異常
		 */
		protected static final int JOB_QUE_ENTRY_ERROR = 12;
		// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private DeliveryCourseShippingListSelectLogic deliveryCourseShippingListSelectLogic;
	@Inject
	private ShipStatusCheckLogic shipStatusCheckLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private WorkOrderLogic workOrderLogic;
	//dsx
//	@Inject
//	private ShippingInstErrorCheckLogic shippingInstErrorCheckLogic;
	//dsx

	// [#5120][v3.1] 出庫指示バッチ登録処理を共通化(shipStatusUpdateLogic, jobQueEntryInitializerLogicを削除) 2018.07.24 kawana Delete

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe End

	@GET
	@Path("/init")
	public DeliveryCourseShippingListDto init() {
		return new DeliveryCourseShippingListDto();
	}

	/**
	 * <h2>配送コース別出庫指示一覧データ取得</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、配送コース別出庫指示一覧データ取得
	 * </pre>
	 * @param deliveryCourseShippingListDto 配送コース別出荷進捗画面用DTO
	 * @return DeliveryCourseShippingListDto 配送コース別出荷進捗画面用DTO
	 */
	@GET
	@Path("/search")
	public DeliveryCourseShippingListDto search(DeliveryCourseShippingListDto deliveryCourseShippingListDto) {
		DeliveryCourseShippingListDto resultDeliveryCourseShippingListDto = new DeliveryCourseShippingListDto();

		// Entity変換
		TShippingInstHDtoMapper headerMapper1 = new TShippingInstHDtoMapper();
		TShippingInstH tShippingInstH = headerMapper1.mappingToEntity(deliveryCourseShippingListDto.data.search);
		MCarrier mCarrier = new MCarrier();
		mCarrier.setCarrierCd(deliveryCourseShippingListDto.data.search.getCarrierCd());

		// 配送コース別出荷進捗取得用
		PagingResultBean<SqlDeliveryCourseShippingList> page = deliveryCourseShippingListSelectLogic.select(tShippingInstH, mCarrier, deliveryCourseShippingListDto.paging,
				errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return resultDeliveryCourseShippingListDto;
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe Start
		// 区分値マスタより取得
		BClassDtlCB cb = bClassDtlBhv.newConditionBean();
		cb.specify().columnClassDtlCd();
		cb.specify().columnDictId();
		cb.setupSelect_BClass();
		cb.specify().specifyBClass().columnClassCd();
		cb.setupSelect_VDict(getCultureId());
		cb.specify().specifyVDict().columnDictNm();
		List<String> classCdList = new ArrayList<String>();
		classCdList.add("SHIPPING_STATUS");
		cb.query().queryBClass().setClassCd_InScope(classCdList);
		cb.query().queryBClass().addOrderBy_ClassCd_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();
		List<BClassDtl> centerClassList = bClassDtlBhv.selectList(cb);
		Map<String, Map<String, String>> classMap = new HashMap<String, Map<String, String>>();

		// センタ区分値をMapに変換
		String classCd = "";
		Map<String, String> dtlMap = null;
		for (BClassDtl bClassDtl : centerClassList) {
			if (classCd.equals(bClassDtl.getBClass().getClassCd())) {
				dtlMap.put(bClassDtl.getClassDtlCd() , bClassDtl.getVDict().getDictNm());
			}else{
				if (classCd.length() > 0) {
					classMap.put(classCd, dtlMap);
				}
				dtlMap = new HashMap<String, String>();
				dtlMap.put(bClassDtl.getClassDtlCd() , bClassDtl.getVDict().getDictNm());
				classCd = bClassDtl.getBClass().getClassCd();
			}
		}
		if (classCd.length() > 0) {
			classMap.put(classCd, dtlMap);
		}

		// 区分値マスタの名称の設定
		for (SqlDeliveryCourseShippingList list : page) {
			if (classMap.containsKey("SHIPPING_STATUS")) {
				if (classMap.get("SHIPPING_STATUS").containsKey(list.getShippingStatus())) {
					list.setShippingStatusNm(classMap.get("SHIPPING_STATUS").get(list.getShippingStatus()));
				}
			}
		}

		// Dto変換処理
		SqlDeliveryCourseShippingListDtoMapper mapper = new SqlDeliveryCourseShippingListDtoMapper();
		List<SqlDeliveryCourseShippingListDto> list = mapper.mappingToDtoList(page);

		//検索結果詰め替え処理
		resultDeliveryCourseShippingListDto.paging = deliveryCourseShippingListDto.paging;

		resultDeliveryCourseShippingListDto.data.list = list;

		return resultDeliveryCourseShippingListDto;
	}

	/**
	 * <h2>チェック処理(出庫指示時)</h2>
	 * <pre>
	 * 以下のチェックを行う
	 * ・チェック処理(出庫指示時)
	 * </pre>
	 * @param deliveryCourseShippingListDto 配送コース別出荷進捗画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkIndicator")
	public StatusDto checkIndicator(DeliveryCourseShippingListDto deliveryCourseShippingListDto) {
		//出荷状態チェック
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		for (SqlDeliveryCourseShippingListDto list : deliveryCourseShippingListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.workOrder(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		} else {
			// 確認表示
			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		}
		return null;
	}

	/**
	 * <h2>チェック処理(出庫指示解除時)</h2>
	 * <pre>
	 * 以下のチェックを行う
	 * ・チェック処理(出庫指示解除時)
	 * </pre>
	 * @param deliveryCourseShippingListDto 配送コース別出荷進捗画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkIndicatingLift")
	public StatusDto checkIndicatingLift(DeliveryCourseShippingListDto deliveryCourseShippingListDto) {
		//出荷状態チェック
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		for (SqlDeliveryCourseShippingListDto list : deliveryCourseShippingListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			// [ON推-品向-1042]グルーピングを変更し、ステータスはMIN取得に変更した為、一部出荷確定している場合、エラーになるように修正 2016.01.25 koseki Start
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
			if (AppCDef.ShippingStatus.$55.code().equals(list.getShippingStatusMax())) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
				entityTShippingInstH.setShippingStatus(list.getShippingStatusMax());
			}else{
				entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			}
			//entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			// [ON推-品向-1042]グルーピングを変更し、ステータスはMIN取得に変更した為、一部出荷確定している場合、エラーになるように修正 2016.01.25 koseki End
			listTShippingInstH.add(entityTShippingInstH);
		}
		//出荷状態チェック
		shipStatusCheckLogic.workOrderCancel(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		} else {
			// 確認表示
			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		}
		return null;
	}

	/**
	 * <h2>出庫指示</h2>
	 * <pre>
	 * チェック処理(出庫指示時)チェックを行う
	 * エラーがない場合は、出庫指示処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param deliveryCourseShippingListDto 配送コース別出荷進捗画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/indicator")
	public StatusDto indicator(DeliveryCourseShippingListDto deliveryCourseShippingListDto) {

		// レスポンス対策 2016.02.24 kawana Start
		// DBデータのキャッシュを有効に設定
		this.setDataCache(true);
		// レスポンス対策 2016.02.24 kawana End

		//出荷状態チェック
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;

		//出荷指示ヘッダ.行数
		int countTShippingInstH = 0;
		for (SqlDeliveryCourseShippingListDto list : deliveryCourseShippingListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setClientId(list.getClientId());//荷主ID
			entityTShippingInstH.setCenterId(list.getCenterId());//センタID
			entityTShippingInstH.setWorkDt(list.getWorkDt());//作業日
			entityTShippingInstH.setShippingDt(list.getShippingDt());//出荷日
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());//出荷ステータス
			entityTShippingInstH.setPickingBatchNo(list.getPickingBatchNo());//出庫指示バッチNo.
			entityTShippingInstH.setDeliveryCourseCd(list.getDeliveryCourseCd());//配送コースCD
			//entityTShippingInstH.setEmergencyFlg(list.getEmergencyFlg());
			// [ON推-品向-1042] グルーピングを変更した為、緊急フラグは条件に含めない様に修正 2016-01-25 koseki Start
			//entityTShippingInstH.setEmergencyFlg(deliveryCourseShippingListDto.data.search.getEmergencyFlg());
			// [ON推-品向-1042] グルーピングを変更した為、緊急フラグは条件に含めない様に修正 2016-01-25 koseki End
			entityTShippingInstH.setUpdDt(list.getMaxUpdDt());//更新日時
			countTShippingInstH = countTShippingInstH + (list.getTsihNum() == null?0:Integer.parseInt(list.getTsihNum() + ""));
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.workOrder(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();
		TShippingInstH controlNoTShippingInstH = new TShippingInstH();
		controlNoTShippingInstH.setControlNo(controlNo);

		//コントロールNo.更新
		int updateCnt = deliveryCourseShippingListSelectLogic.updateControlNo(listTShippingInstH, controlNoTShippingInstH, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

//		// [ON推-品向-436] 出庫指示の前にエラーチェックを実行 2014.12.15 KI Start
//
//		// データのエラーチェック
//		countTShippingInstH = 0;
//		boolean errorData = false;
//		List<TShippingInstB> tShippingInstBList = null;
//		TShippingInstBCB tShippingInstBCB = tShippingInstBBhv.newMyConditionBean();
//
//		for (SqlDeliveryCourseShippingListDto list : deliveryCourseShippingListDto.data.list) {
//			tShippingInstBCB.query().queryTShippingInstH().setPickingBatchNo_Equal(list.getPickingBatchNo());
//			tShippingInstBCB.query().queryTShippingInstH().setWorkDt_Equal(list.getWorkDt());
//			tShippingInstBCB.query().queryTShippingInstH().setShippingDt_Equal(list.getShippingDt());
//			tShippingInstBCB.query().queryTShippingInstH().setDeliveryCourseCd_Equal(list.getDeliveryCourseCd());
//			tShippingInstBCB.query().queryTShippingInstH().setCenterId_Equal(list.getCenterId());
//			tShippingInstBCB.query().queryTShippingInstH().setClientId_Equal(list.getClientId());
//			tShippingInstBCB.query().queryTShippingInstH().setShippingStatus_Equal(list.getShippingStatus());
//			tShippingInstBCB.setupSelect_TShippingInstH();
//			tShippingInstBList = tShippingInstBBhv.selectList(tShippingInstBCB);
//
//			for (TShippingInstB listH : tShippingInstBList) {
//				entityTShippingInstH = new TShippingInstH();
//				entityTShippingInstH.setCenterId(listH.getTShippingInstH().getCenterId());
//				entityTShippingInstH.setShippingStatus(listH.getTShippingInstH().getShippingStatus());
//				entityTShippingInstH.setShippingInstHId(listH.getTShippingInstH().getShippingInstHId());
//				entityTShippingInstH.setDeliveryCourseCd(listH.getTShippingInstH().getDeliveryCourseCd());
//				entityTShippingInstH.setSupplyCustomerCd(listH.getTShippingInstH().getSupplyCustomerCd());
//				entityTShippingInstH.setVersionNo(listH.getVersionNo());
//				entityTShippingInstH.setCarrierCd(listH.getTShippingInstH().getCarrierCd());
//				entityTShippingInstH.setDelivZipCd(listH.getTShippingInstH().getDelivTz());
//				entityTShippingInstH.setCustomerCd(listH.getTShippingInstH().getSupplyCustomerCd());
//				errorData = shippingInstErrorCheckLogic.check(entityTShippingInstH, errRetSts(StatusCode.ERROR_CHECK_ERROR));
//			   // 結果判定
//			    if (getErrorManager().size() > 0  ) {
//				// 処理終了
//				return null;
//			   }
//			}
//
//			if (errorData) {
//
//				// エラーデータの場合は警告メッセージを登録
//				getWarnManager().add(warnRetSts(StatusCode.ERROR_CHECK_ERROR), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
//
//				// [ON推-品向-856] コントロールNo.のクリア処理を追加 2015.07.08 kawana Start
//				// コントロールNo.をクリア
//				deliveryCourseShippingListSelectLogic.clearControlNo(controlNoTShippingInstH, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));
//				// [ON推-品向-856] コントロールNo.のクリア処理を追加 2015.07.08 kawana End
//
//				// 処理終了
//				return null;
//			}
//
//		}
//		// [ON推-品向-436] 出庫指示の前にエラーチェックを実行 2014.12.15 KI End

		// レスポンス対策 2016.02.24 kawana Start
		controlNoTShippingInstH.setCenterId(listTShippingInstH.get(0).getCenterId());
		controlNoTShippingInstH.setClientId(listTShippingInstH.get(0).getClientId());
		// レスポンス対策 2016.02.24 kawana End

		//出庫指示処理
		workOrderLogic.shipInstructe(controlNoTShippingInstH, errRetSts(StatusCode.SHIPPING_INST_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// [ON推-品向-856] コントロールNo.のクリア処理を追加 2015.07.08 kawana Start
		// コントロールNo.をクリア
		deliveryCourseShippingListSelectLogic.clearControlNo(controlNoTShippingInstH, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));
		// [ON推-品向-856] コントロールNo.のクリア処理を追加 2015.07.08 kawana End

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;

	}

	// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana Start

	/**
	 * <h2>出庫指示(バッチ処理)</h2>
	 * <pre>
	 * チェック処理(出庫指示時)チェックを行う
	 * エラーがない場合は、出庫指示バッチを登録し、完了メッセージを設定する
	 * </pre>
	 * @param shippingInstDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/indicatorBatch")
	public StatusDto indicatorBatch(DeliveryCourseShippingListDto deliveryCourseShippingListDto) {

		// ===== コントロールNo.を採番 =====

		long controlNo = numberingCenterLogic.getControlNo();

		// ===== コントロールNo.設定 =====

		int dataCount = 0;
		List<TShippingInstH> shippingInstHList = new ArrayList<TShippingInstH>();
		for (SqlDeliveryCourseShippingListDto dto : deliveryCourseShippingListDto.data.list) {
			TShippingInstH entity = new TShippingInstH();
			entity.setClientId(dto.getClientId());//荷主ID
			entity.setCenterId(dto.getCenterId());//センタID
			entity.setWorkDt(dto.getWorkDt());//作業日
			entity.setShippingDt(dto.getShippingDt());//出荷日
			entity.setShippingStatus(dto.getShippingStatus());//出荷ステータス
			entity.setUpdDt(dto.getMaxUpdDt());//更新日時
			entity.setPickingBatchNo(dto.getPickingBatchNo());//出庫指示バッチNo.
			entity.setDeliveryCourseCd(dto.getDeliveryCourseCd());//配送コースCD
			entity.setControlNo(controlNo);
			shippingInstHList.add(entity);
			dataCount = dataCount + CU.nullToZero(dto.getTsihNum()).intValue();
		}

		int updateCnt = deliveryCourseShippingListSelectLogic.updateControlNo(shippingInstHList, shippingInstHList.get(0), errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));
		if (0 < getErrorManager().size()) {
			return null;
		}
		if (updateCnt != dataCount) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// ===== 出荷ステータスチェック =====

		shipStatusCheckLogic.workOrder(shippingInstHList.get(0), dataCount, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#5120][v3.1] 出庫指示バッチ登録処理を共通化(共通化した処理を削除) 2018.07.24 kawana Delete

		// ===== バッチ登録 =====

		SqlDeliveryCourseShippingListDto dto = deliveryCourseShippingListDto.data.list.get(0);
		MCenter center = new MCenter();
		center.setCenterId(dto.getCenterId());
		center.setCenterCd(dto.getCenterCd());
		MClient client = new MClient();
		client.setClientId(dto.getClientId());
		client.setClientCd(dto.getClientCd());

		// [#5120][v3.1] 出庫指示バッチ登録処理を共通化 2018.07.24 kawana Start
		String jobQueNo = workOrderLogic.shipInstructeJobEntry(center, client, controlNo, dataCount, errRetSts(StatusCode.JOB_QUE_ENTRY_ERROR));
		// [#5120][v3.1] 出庫指示バッチ登録処理を共通化 2018.07.24 kawana End
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 完了メッセージ設定 =====
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.SHIPPING_INST_BATCH_REGISTER_INFORMATION, jobQueNo);
		return null;
	}

	// [#5120][v3.1] 出庫指示バッチ登録処理を共通化(jobEntryメソッド削除) 2018.07.24 kawana Delete

	// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana End

	/**
	 * <h2>出庫指示解除</h2>
	 * <pre>
	 * チェック処理(出庫指示解除時)チェックを行う
	 * エラーがない場合は、日付一括変更処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param deliveryCourseShippingListDto 配送コース別出荷進捗画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/indicatingLift")
	public StatusDto indicatingLift(DeliveryCourseShippingListDto deliveryCourseShippingListDto) {

		//出荷状態チェック
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;

		//出荷指示ヘッダ.行数
		int countTShippingInstH = 0;
		for (SqlDeliveryCourseShippingListDto list : deliveryCourseShippingListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setClientId(list.getClientId());//荷主ID
			entityTShippingInstH.setCenterId(list.getCenterId());//センタID
			entityTShippingInstH.setWorkDt(list.getWorkDt());//作業日
			entityTShippingInstH.setShippingDt(list.getShippingDt());//出荷日
			// [ON推-品向-1042]グルーピングを変更し、ステータスはMIN取得に変更した為、一部出荷確定している場合、エラーになるように修正 2016.01.25 koseki Start
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
			if (AppCDef.ShippingStatus.$55.code().equals(list.getShippingStatusMax())) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
				entityTShippingInstH.setShippingStatus(list.getShippingStatusMax());
			}else{
				entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			}
			//entityTShippingInstH.setShippingStatus(list.getShippingStatus());//出荷ステータス
			entityTShippingInstH.setPickingBatchNo(list.getPickingBatchNo());//出庫指示バッチNo.
			entityTShippingInstH.setDeliveryCourseCd(list.getDeliveryCourseCd());//配送コースCD
			entityTShippingInstH.setUpdDt(list.getMaxUpdDt());//更新日時
			//entityTShippingInstH.setEmergencyFlg(list.getEmergencyFlg());
			// [ON推-品向-1042] グルーピングを変更した為、緊急フラグは条件に含めない様に修正 2016-01-25 koseki Start
			//entityTShippingInstH.setEmergencyFlg(deliveryCourseShippingListDto.data.search.getEmergencyFlg());
			// [ON推-品向-1042] グルーピングを変更した為、緊急フラグは条件に含めない様に修正 2016-01-25 koseki End
			countTShippingInstH = countTShippingInstH + (list.getTsihNum() == null?0:Integer.parseInt(list.getTsihNum() + ""));
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.workOrderCancel(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();
		TShippingInstH controlNoTShippingInstH = new TShippingInstH();
		controlNoTShippingInstH.setControlNo(controlNo);

		//コントロールNo.更新
		int updateCnt = deliveryCourseShippingListSelectLogic.updateControlNo(listTShippingInstH, controlNoTShippingInstH, errRetSts(StatusCode.NOT_FOUND_DATA));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		//出庫指示解除処理
		workOrderLogic.shipCancel(controlNoTShippingInstH, errRetSts(StatusCode.SHIPPING_INST_CANCEL_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// [ON推-品向-856] コントロールNo.のクリア処理を追加 2015.07.08 kawana Start
		// コントロールNo.をクリア
		deliveryCourseShippingListSelectLogic.clearControlNo(controlNoTShippingInstH, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));
		// [ON推-品向-856] コントロールNo.のクリア処理を追加 2015.07.08 kawana End

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;

	}

}
