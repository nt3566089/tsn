package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.ScalarQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.WSglRowShipInspBCB;
import com.oneslogi.base.dbflute.cbean.WSglRowShipInspHCB;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.WSglRowShipInspBBhv;
import com.oneslogi.base.dbflute.exbhv.WSglRowShipInspHBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspB;
import com.oneslogi.base.dbflute.exentity.WSglRowShipInspH;
import com.oneslogi.base.exception.CommonException;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ParamLogic;

/**
 * 単行出荷検品ロジッククラス
 */
public class SingleRowShippingInspectLogic extends AbstractWmsLogic {

	// ===== 返信用クラス =====

	/** 検品処理 結果クラス */
	public class ResultInspected {
		/** 対象有無 */
		public boolean isNoData = false;
		/** 1伝票の検品完了 */
		public boolean isInspectedSlip = false;
		/** 伝票残数 */
		public long remainSlipNum;
		/** 出庫作業メッセージ */
		public String pickingWorkMessage;
		/** 出庫作業No. */
		public String pickingWorkNo;
		/** 荷札発行失敗 */
		public boolean failedPrint = false;
		/** 荷札発行失敗メッセージCD */
		public String failedPrintMessageCd;
		/** 荷札発行失敗メッセージ置換文字 */
		public List<String> failedPrintPrintReplaceStrings;
	}

	// ===== 使用テーブル =====

	@Inject
	private WSglRowShipInspHBhv wSglRowShipInspHBhv;
	@Inject
	private WSglRowShipInspBBhv wSglRowShipInspBBhv;
	@Inject
	private TPickingBBhv tPickingBBhv;
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	@Inject
	private MBoxBhv mBoxBhv;
	@Inject
	private MProductBhv mProductBhv;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;

	// ===== 使用ロジック =====

	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;
	@Inject
	private ShippingInspectAutoPrintLogic shippingInspectAutoPrintLogic;

	/**
	 * <h2>検品中データ検索.</h2>
	 * <pre>
	 * ※ 0件の場合はエラーとしない
	 * ユーザの検品中データをワークから取得する。
	 * 未作業の場合も考慮して、0件の場合にもエラーとしない。
	 * 下記の場合はエラーとする。
	 *
	 * 【エラー内容】
	 * ・ピッキンググループNo.が不一致
	 * ・仮置No.が不一致
	 * ・商品IDが不一致
	 * ・商品が出荷停止
	 * ・取引先が出荷停止 (検品を始めているので警告ではなくエラーとし、検品解除してもらう)
	 * ・倉庫CDが不一致
	 * ・ゾーンCDが不一致
	 * </pre>
	 * @param searchCondition 検索条件
	 * @param errSts エラー時に設定するエラーステータス
	 * @return WSglRowShipInspB 検品中のワークデータ (0件の場合はnull)
	 */
	public WSglRowShipInspB selectWorkingData(WSglRowShipInspH searchCondition, ErrorStatus errSts) {

		WSglRowShipInspBCB cb = wSglRowShipInspBBhv.newMyConditionBean();

		cb.setupSelect_WSglRowShipInspH().withMProduct();
		cb.setupSelect_TPickingH().withTAllocInstH().withMCustomerBySupplyCustomerId();

		cb.checkInvalidQuery();
		cb.query().queryWSglRowShipInspH().setCenterId_Equal(searchCondition.getCenterId());
		cb.query().queryWSglRowShipInspH().setClientId_Equal(searchCondition.getClientId());
		// 検品中
		cb.query().setInspectionFlg_Equal_$7();
		cb.query().setUserId_Equal(searchCondition.getUserId());
		cb.query().queryTPickingH().setPickingStatus_Equal_$40();

		cb.fetchFirst(1);

		WSglRowShipInspB workData = wSglRowShipInspBBhv.selectEntity(cb);
		if (workData == null) {
			// 検品中データなし
			return null;
		}

		final WSglRowShipInspH workDataH = workData.getWSglRowShipInspH();

		if (!CU.isNullOrEmpty(searchCondition.getPickingGroupNo())) {
			if (!searchCondition.getPickingGroupNo().equals(workDataH.getPickingGroupNo())) {
				// ピッキンググループNo.不一致

				getErrorManager().add(errSts, WmsMessageConst.SINGLE_ROW_SHIPPING_INSPECT_OTHER_PICKING_GROUP_NO_ERROR, workDataH.getPickingGroupNo());
				return null;
			}
		}

		if (!CU.isNullOrEmpty(searchCondition.getTempNo())) {
			if (!searchCondition.getTempNo().equals(workDataH.getTempNo())) {
				// 仮置No.不一致

				getErrorManager().add(errSts, WmsMessageConst.SINGLE_ROW_SHIPPING_INSPECT_OTHER_TEMP_NO_ERROR, workDataH.getTempNo());
				return null;
			}
		}

		if (searchCondition.getProductId() != null) {
			if (searchCondition.getProductId().longValue() != workDataH.getProductId().longValue()) {
				// 商品ID不一致

				getErrorManager().add(errSts, WmsMessageConst.SINGLE_ROW_SHIPPING_INSPECT_OTHER_PRODUCT_ERROR, workDataH.getMProduct().getProductCd());
				return null;
			}
		}

		if (workDataH.getMProduct().isShippingStopFlg$1()) {
			// 商品出荷停止

			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CANNOT_SELECT_SHIPPING_STOP_ERROR);
			return null;
		}

		if (workData.getTPickingH().getTAllocInstH().getMCustomerBySupplyCustomerId().isShippingStopFlg$1()) {
			// 納品先出荷停止

			getErrorManager().add(errSts, WmsMessageConst.CANNOT_SELECT_STOPPED_SHIP_TO_ERROR);
			return null;
		}

		if (!CU.isNullOrEmpty(searchCondition.getWarehouseCd()) || !CU.isNullOrEmpty(searchCondition.getZoneCd())) {
			// 倉庫、ゾーンの指定あり

			TPickingBCB pickingBCb = tPickingBBhv.newMyConditionBean();
			pickingBCb.setupSelect_TStock().withMLocation().withMZone().withMWarehouse();
			pickingBCb.query().setPickingHId_Equal(workData.getPickingHId());

			TPickingB pickingB = tPickingBBhv.selectEntityWithDeletedCheck(pickingBCb);

			if (!CU.isNullOrEmpty(searchCondition.getWarehouseCd())) {

				if (!searchCondition.getWarehouseCd().equals(pickingB.getTStock().getMLocation().getMZone().getMWarehouse().getWarehouseCd())) {
					// 倉庫CD 不一致

					getErrorManager().add(errSts, WmsMessageConst.SINGLE_ROW_SHIPPING_INSPECT_OTHER_WAREHOUSE_ERROR, pickingB.getTStock().getMLocation().getMZone().getMWarehouse().getWarehouseCd());
					return null;
				}
			}

			if (!CU.isNullOrEmpty(searchCondition.getZoneCd())) {

				if (!searchCondition.getZoneCd().equals(pickingB.getTStock().getMLocation().getMZone().getZoneCd())) {
					// ゾーンCD 不一致

					getErrorManager().add(errSts, WmsMessageConst.SINGLE_ROW_SHIPPING_INSPECT_OTHER_ZONE_ERROR, pickingB.getTStock().getMLocation().getMZone().getZoneCd());
					return null;
				}
			}
		}

		String pickingWorkMessage = selectPickingWorkMessage(workData.getPickingHId());
		workData.setPickingWorkMessage(pickingWorkMessage);

		return workData;
	}

	/**
	 * <h2>検品中データリスト検索.</h2>
	 * <pre>
	 * 単行出荷検品ワークボディリストを検索する。
	 * 引数の単行出荷検品ワークヘッダIDに紐づく全ての単行出荷検品ワークボディを検索する。
	 *
	 * 0件の場合はエラーとする。
	 * </pre>
	 * @param sglRowShipInspHId 単行出荷検品ワークヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return 単行出荷検品ワークボディリスト
	 */
	public List<WSglRowShipInspB> selectWorkingList(long sglRowShipInspHId, ErrorStatus errSts) {

		WSglRowShipInspBCB cb = wSglRowShipInspBBhv.newMyConditionBean();

		cb.setupSelect_WSglRowShipInspH().withMProduct();
		cb.setupSelect_TPickingH().withTAllocInstH().withMCustomerBySupplyCustomerId();
		cb.setupSelect_TPickingH().withTAllocInstH().withMCustomerByDelivCustomerId();
		cb.setupSelect_TPickingH().withTAllocInstH().withMDeliveryCourse();
		// 出庫作業メッセージ
		cb.specify().specifyTPickingH().specifyTAllocInstH().derivedTShippingInstHList().max(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB maxCb) {
				maxCb.specify().columnPickingWorkMessage();
			}
		}, WSglRowShipInspB.ALIAS_pickingWorkMessage);

		cb.checkInvalidQuery();
		cb.query().setSglRowShipInspHId_Equal(sglRowShipInspHId);

		cb.addOrderBy_PK_Asc();

		List<WSglRowShipInspB> workDataList = wSglRowShipInspBBhv.selectList(cb);
		if (workDataList.isEmpty()) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return workDataList;
	}

	/**
	 * <h2>ユーザの検品済商品数を取得.</h2>
	 * <pre>
	 * ユーザの検品済商品数を返す。
	 * 検品済商品数は検品済伝票の商品数も含まれる。
	 *
	 * 例えば、指示数3で2伝票検品済、3伝票目の1個を検品した後に
	 * 呼出された場合、7を返却する。
	 * </pre>
	 * @param searchCondition 単行出荷検品ワークヘッダ : 単行出荷検品ワークヘッダID, ユーザiD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return ユーザの検品済伝票数
	 */
	public long selectUserInspectedNum(final WSglRowShipInspH searchCondition, ErrorStatus errSts) {

		Long inspectedNum = wSglRowShipInspBBhv.scalarSelect(Long.class).sum(new ScalarQuery<WSglRowShipInspBCB>() {

			@Override
			public void query(WSglRowShipInspBCB cb) {
				cb.specify().columnInspectedNum();
				cb.checkInvalidQuery();
				cb.query().setSglRowShipInspHId_Equal(searchCondition.getSglRowShipInspHId());
				cb.query().setUserId_Equal(searchCondition.getUserId());
			}
		}).orElse(null);

		return CU.nullToZero(inspectedNum);
	}

	/**
	 * <h2>作業指示数セット取得.</h2>
	 * <pre>
	 * 指定された条件の伝票を検索し、出荷指示数のセットを返却する。
	 * </pre>
	 * @param searchCondition 検索条件
	 * @param errSts エラー時に設定するエラーステータス
	 * @return 作業指示数セット
	 */
	public Set<Long> selectWorkInstNumSet(WSglRowShipInspH searchCondition, ErrorStatus errSts) {

		// 対象データ検索

		TPickingBCB cb = tPickingBBhv.newMyConditionBean();
		cb.setupSelect_TStock().withMProduct();
		cb.setupSelect_TAllocInstB();

		cb.specify().specifyTStock().columnStockId();
		cb.specify().specifyTStock().specifyMProduct().columnShippingStopFlg();
		cb.specify().specifyTAllocInstB().columnInstNum();
		cb.specify().columnPickingBId();

		// 指示数の指定はしない
		searchCondition.setWorkInstNum(null);

		// 入力された検索条件を引数のCBに設定
		setQueryCondition(cb, searchCondition);

		// 検索実行
		List<TPickingB> pickingBList = tPickingBBhv.selectList(cb);
		if (pickingBList.isEmpty()) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 商品停止チェック
		if (pickingBList.get(0).getTStock().getMProduct().isShippingStopFlg$1()) {

			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CANNOT_SELECT_SHIPPING_STOP_ERROR);
			return null;
		}

		// 指示数セット作成
		Set<Long> workInstNumSet = new HashSet<Long>();
		for (TPickingB pickingB : pickingBList) {
			workInstNumSet.add(WCC.longValue(pickingB.getTAllocInstB().getInstNum()));
		}

		return workInstNumSet;
	}

	/**
	 * <h2>出荷停止納品先存在チェック.</h2>
	 * <pre>
	 * 引数の検索条件で出荷停止の納品先が含まれている場合はtrueを返す。
	 * </pre>
	 *
	 * @param wSglRowShipInspH 単行出荷検品ワーク
	 * @return true : 出荷停止の納品先が存在 , false : 出荷停止の納品先はない
	 */
	public boolean existsShippingStopCustomer(WSglRowShipInspH wSglRowShipInspH) {

		TPickingBCB cb = tPickingBBhv.newMyConditionBean();

		List<CDef.PickingStatus> inPickingStatus = new ArrayList<CDef.PickingStatus>();
		inPickingStatus.add(CDef.PickingStatus.$25); // 出庫指示済
		inPickingStatus.add(CDef.PickingStatus.$30); // ピッキング中
		inPickingStatus.add(CDef.PickingStatus.$35); // ピッキング済

		cb.query().queryTPickingH().setSglRowPicFlg_Equal_$1();
		cb.query().queryTPickingH().setPickingStatus_InScope_AsPickingStatus(inPickingStatus);
		cb.query().queryTPickingH().setPickingGroupNo_IsNotNull();
		cb.query().setTempNo_IsNotNull();

		cb.query().queryTPickingH().setCenterId_Equal(wSglRowShipInspH.getCenterId());
		cb.query().queryTAllocInstB().setProductId_Equal(wSglRowShipInspH.getProductId());
		cb.query().queryTPickingH().setPickingGroupNo_Equal(wSglRowShipInspH.getPickingGroupNo());
		cb.query().setTempNo_Equal(wSglRowShipInspH.getTempNo());
		if (wSglRowShipInspH.getWorkInstNum() != null) {
			BigDecimal workInstNum = WCC.toBigDecimal(wSglRowShipInspH.getWorkInstNum());
			cb.query().queryTAllocInstB().setInstNum_Equal(workInstNum);
		}
		// 納品先出荷停止
		cb.query().queryTPickingH().queryTAllocInstH().queryMCustomerBySupplyCustomerId().setShippingStopFlg_Equal_$1();

		int count = tPickingBBhv.selectCount(cb);
		if (0 < count) {
			// 出荷停止の取引先が存在

			return true;
		}

		return false;
	}

	/**
	 * <h2>検品データ検索.</h2>
	 * <pre>
	 * 指定された検索条件の検品データを取得する。
	 *
	 * 単行出荷検品ワークに該当データがない場合は、
	 * 新規に単行出荷検品ワークを登録する。
	 *
	 * 新規にワークに登録した場合、
	 * 出庫作業No.の一番小さい伝票を検品対象とし下記を行う。
	 * ・出庫ボディ、単行出荷検品ワークボディの検品フラグを「検品作業中」に更新
	 * ・梱包ステータス/出庫ステータス/出荷ステータスを「出荷検品中」に変更
	 * ・出庫作業メッセージを検索して戻り値に設定
	 *
	 * 新規にワークに登録した場合、
	 * 帳票発行区分が「検品開始後に出力」の場合は
	 * 荷札、納品明細の出力設定に従い、荷札、納品明細を発行する。
	 * </pre>
	 * @param searchCondition 検索条件
	 * @param errSts エラー時に設定するエラーステータス
	 * @return WSglRowShipInspB 検品対象の単行出荷検品ワークボディ
	 */
	public WSglRowShipInspB selectInspectData(WSglRowShipInspH searchCondition, ErrorStatus errSts) {

		final long centerId = searchCondition.getCenterId();
		final long clientId = searchCondition.getClientId();
		final long productId = searchCondition.getProductId();
		final long userId = searchCondition.getUserId();
		final long workInstNum = searchCondition.getWorkInstNum();

		TPickingB targetPickingB = selectTargetPickingB(searchCondition, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		String pickingGroupNo = targetPickingB.getTPickingH().getPickingGroupNo();
		String tempNo = targetPickingB.getTempNo();

		WSglRowShipInspHCB wCb = wSglRowShipInspHBhv.newMyConditionBean();
		// 新規行の挿入があるためロックを取得
		wCb.lockForUpdate();
		wCb.query().setClientId_Equal(clientId);
		wCb.query().setCenterId_Equal(centerId);
		wCb.query().setPickingGroupNo_Equal(pickingGroupNo);
		wCb.query().setTempNo_Equal(tempNo);
		wCb.query().setProductId_Equal(productId);
		wCb.query().setWorkInstNum_Equal(workInstNum);

		WSglRowShipInspH wInspH = wSglRowShipInspHBhv.selectEntity(wCb);

		WSglRowShipInspB wInspB = null;
		if (wInspH == null) {
			// ワーク未存在 => 新規作成

			WSglRowShipInspH newSglRowShipInsp = new WSglRowShipInspH();
			newSglRowShipInsp.setClientId(clientId);
			newSglRowShipInsp.setCenterId(centerId);
			newSglRowShipInsp.setPickingGroupNo(pickingGroupNo);
			newSglRowShipInsp.setTempNo(tempNo);
			newSglRowShipInsp.setProductId(productId);
			newSglRowShipInsp.setWorkInstNum(workInstNum);

			wInspB = insertNewWork(newSglRowShipInsp, userId, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}
		} else {
			// ワーク存在 => 未検品1件目を取得

			wInspB = selectStartWorkData(wInspH.getSglRowShipInspHId(), userId, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}

			if (wInspB == null) {
				getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
				return null;
			}
		}

		return wInspB;
	}

	/**
	 * 検品対象の出庫ボディを取得
	 */
	private TPickingB selectTargetPickingB(WSglRowShipInspH searchCondition, ErrorStatus errSts) {

		TPickingBCB cb = tPickingBBhv.newMyConditionBean();

		cb.setupSelect_TPickingH();
		cb.setupSelect_TStock().withMProduct();

		// 入力された検索条件を引数のCBに設定
		setQueryCondition(cb, searchCondition);

		// ソート順 : ピッキンググループNo. > 仮置No. > 出庫作業No.
		cb.query().queryTPickingH().addOrderBy_PickingGroupNo_Asc();
		cb.query().addOrderBy_TempNo_Asc();
		cb.query().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		cb.query().addOrderBy_PickingBId_Asc();

		cb.fetchFirst(1);

		// 検索実行
		TPickingB pickingB = tPickingBBhv.selectEntity(cb);
		if (pickingB == null) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 商品停止チェック
		if (pickingB.getTStock().getMProduct().isShippingStopFlg$1()) {

			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CANNOT_SELECT_SHIPPING_STOP_ERROR);
			return null;
		}

		return pickingB;
	}

	/**
	 * 入力された検索条件を引数のCBに設定
	 */
	private void setQueryCondition(TPickingBCB cb, WSglRowShipInspH searchCondition) {

		final long centerId = searchCondition.getCenterId();
		final long clientId = searchCondition.getClientId();
		final long productId = searchCondition.getProductId();

		// 対象データ検索

		List<CDef.PickingStatus> inPickingStatus = new ArrayList<CDef.PickingStatus>();
		inPickingStatus.add(CDef.PickingStatus.$25); // 出庫指示済
		inPickingStatus.add(CDef.PickingStatus.$35); // ピッキング済

		cb.query().queryTPickingH().setSglRowPicFlg_Equal_$1();
		cb.query().queryTPickingH().setPickingStatus_InScope_AsPickingStatus(inPickingStatus);
		cb.query().queryTPickingH().setPickingGroupNo_IsNotNull();
		cb.query().setTempNo_IsNotNull();

		cb.query().queryTPickingH().setCenterId_Equal(centerId);
		cb.query().queryTPickingH().setClientId_Equal(clientId);
		cb.query().queryTAllocInstB().setProductId_Equal(productId);
		cb.query().queryTPickingH().setPickingGroupNo_Equal(searchCondition.getPickingGroupNo());
		cb.query().setTempNo_Equal(searchCondition.getTempNo());
		if (searchCondition.getWorkInstNum() != null) {
			BigDecimal workInstNum = WCC.toBigDecimal(searchCondition.getWorkInstNum());
			cb.query().queryTAllocInstB().setInstNum_Equal(workInstNum);
		}
		cb.query().queryTPickingH().queryTAllocInstH().queryMCustomerBySupplyCustomerId().setShippingStopFlg_Equal_$0();
		cb.query().queryTStock().queryMLocation().queryMZone().queryMWarehouse().setWarehouseCd_Equal(searchCondition.getWarehouseCd());
		cb.query().queryTStock().queryMLocation().queryMZone().setZoneCd_Equal(searchCondition.getZoneCd());

		if (CU.isNullOrEmpty(searchCondition.getPickingGroupNo())) {
			// ピッキンググループNo.指定なし

			MClientCenter condition = new MClientCenter();
			condition.setClientId(clientId);
			condition.setCenterId(centerId);
			String systemDt = clientCenterLogic.getUkEntityWithDeletedCheck(condition).getSystemDt();

			// 条件 : 作業日 = システム稼働日
			cb.query().queryTPickingH().queryTAllocInstH().setWorkDt_Equal(systemDt);
		}
	}

	/**
	 * 単行出荷検品ワークを新規登録
	 */
	private WSglRowShipInspB insertNewWork(WSglRowShipInspH newSglRowShipInsp, long userId, ErrorStatus errSts) {

		// ===== 登録対象の出庫ボディを検索 =====

		TPickingBCB cb = tPickingBBhv.newMyConditionBean();
		cb.setupSelect_TStock().withMProduct();

		// 検索条件
		setQueryCondition(cb, newSglRowShipInsp);

		// 出庫作業No順
		cb.query().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		cb.query().addOrderBy_PickingBId_Asc();

		List<TPickingB> pickingBList = tPickingBBhv.selectList(cb);

		// ===== 単行出荷検品ワークヘッダを登録 =====

		// ※単行出荷検品は 1ボディ - 1ヘッダ
		newSglRowShipInsp.setSlipNum((long) pickingBList.size());
		newSglRowShipInsp.setInspectedSlipNum(0L);

		MParam mParam = selectMParam(newSglRowShipInsp);
		if (mParam.isBoxSelectSkip$1()) {
			// 荷材スキップあり => デフォルト荷材を設定

			MBox packingBox = selectPackingBox(pickingBList.get(0).getPickingHId());
			if (packingBox != null) {
				newSglRowShipInsp.setBoxId(packingBox.getBoxId());
			} else {
				newSglRowShipInsp.setBoxId(mParam.getDefaultBoxId());
			}
		}

		// ヘッダ登録実行
		wSglRowShipInspHBhv.insert(newSglRowShipInsp);

		// ===== 単行出荷検品ワークボディを登録 =====

		List<WSglRowShipInspB> insertBodyList = new ArrayList<WSglRowShipInspB>();
		for (TPickingB pickingB : pickingBList) {

			WSglRowShipInspB insertBody = new WSglRowShipInspB();
			insertBody.setSglRowShipInspHId(newSglRowShipInsp.getSglRowShipInspHId());
			insertBody.setPickingHId(pickingB.getPickingHId());
			insertBody.setInspectedNum(0L);
			insertBody.setInspectionFlg_$0();

			insertBodyList.add(insertBody);
		}

		// ボディ登録実行
		wSglRowShipInspBBhv.batchInsert(insertBodyList);

		if (mParam.isBoxSelectSkip$1()) {
			// 荷材スキップあり

			// 梱包ヘッダの荷材ID更新
			updateBoxIdPackingH(newSglRowShipInsp.getSglRowShipInspHId(), newSglRowShipInsp.getBoxId());
		}

		// 1件目のデータを返却
		WSglRowShipInspB targetWorkData = insertBodyList.get(0);
		newSglRowShipInsp.setMProduct(pickingBList.get(0).getTStock().getMProduct());
		targetWorkData.setWSglRowShipInspH(newSglRowShipInsp);

		return targetWorkData;
	}

	/**
	 * 梱包荷材の検索
	 */
	private MBox selectPackingBox(long pickingHId) {

		TPackingHCB cb = tPackingHBhv.newMyConditionBean();
		cb.setupSelect_MBox();

		cb.query().setPickingHId_Equal(pickingHId);
		cb.query().setBoxId_IsNotNull();

		// 複数ある場合は荷材CD順
		cb.query().queryMBox().addOrderBy_BoxCd_Asc();

		cb.fetchFirst(1);

		TPackingH packingH = tPackingHBhv.selectEntity(cb);
		if (packingH == null) {
			// 梱包荷材の登録なし
			return null;
		}

		return packingH.getMBox();
	}

	/**
	 * 検品開始時の検品データを取得
	 */
	private WSglRowShipInspB selectStartWorkData(long sglRowShipInspHId, long userId, ErrorStatus errSts) {

		WSglRowShipInspBCB cb = wSglRowShipInspBBhv.newMyConditionBean();

		cb.setupSelect_WSglRowShipInspH().withMProduct();
		cb.setupSelect_TPickingH();

		cb.query().setSglRowShipInspHId_Equal(sglRowShipInspHId);
		cb.query().setInspectionFlg_Equal_$0();
		cb.query().setUserId_IsNull();

		cb.addOrderBy_PK_Asc();

		cb.fetchFirst(1);

		WSglRowShipInspB workInspB = wSglRowShipInspBBhv.selectEntity(cb);
		if (workInspB == null) {
			// データなし
			return null;
		}

		return workInspB;
	}

	/**
	 * <h2>標準荷材の検索.</h2>
	 * <pre>
	 * 次の優先度で荷材を検索して返却。
	 *
	 * 1. 梱包ヘッダに設定された荷材
	 * 2. パラメータマスタのデフォルト荷材
	 *
	 * どちらも未設定の場合は null を返却
	 * </pre>
	 * @param wSglRowShipInspH 単行検品ワークヘッダ : センタID、荷主ID
	 * @param wSglRowShipInspB 単行検品ワークボディ : 出庫ヘッダID
	 * @return MBox 標準荷材
	 */
	public MBox selectDefaultBox(WSglRowShipInspH wSglRowShipInspH, WSglRowShipInspB wSglRowShipInspB) {

		// 梱包ヘッダに使用されている荷材を検索
		MBox packingBox = selectPackingBox(wSglRowShipInspB.getPickingHId());
		if (packingBox != null) {
			// 使用荷材あり

			return packingBox;
		}

		MParam mParam = selectMParam(wSglRowShipInspH);
		if (mParam.getDefaultBoxId() == null) {
			return null;
		}

		// デフォルト荷材検索
		MBox defaultBox = mBoxBhv.selectByPKValueWithDeletedCheck(mParam.getDefaultBoxId());

		return defaultBox;
	}

	/**
	 * <h2>荷材IDの更新.</h2>
	 * <pre>
	 * 単行出荷検品ワークの荷材IDを更新する。
	 * ※ queryUpdate使用
	 * </pre>
	 * @param wSglRowShipInspH 単行出荷検品ワークヘッダ : 単行出荷検品ワークヘッダID、荷材ID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateBoxId(WSglRowShipInspH wSglRowShipInspH, ErrorStatus errSts) {

		final long sglRowShipInspHId = wSglRowShipInspH.getSglRowShipInspHId();
		final long boxId = wSglRowShipInspH.getBoxId();

		// ===== 単行出荷検品ワークの更新 =====
		WSglRowShipInspHCB cb = wSglRowShipInspHBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setSglRowShipInspHId_Equal(sglRowShipInspHId);

		WSglRowShipInspH updateEntity = wSglRowShipInspHBhv.newMyEntity();
		updateEntity.setBoxId(boxId);

		wSglRowShipInspHBhv.queryUpdate(updateEntity, cb);

		// ===== 梱包ヘッダの更新 =====
		updateBoxIdPackingH(sglRowShipInspHId, boxId);
	}

	/**
	 * 梱包ヘッダの荷材IDを更新
	 */
	private void updateBoxIdPackingH(final long sglRowShipInspHId, final long boxId) {

		TPackingHCB cb = tPackingHBhv.newMyConditionBean();
		cb.query().setBoxId_IsNull();
		cb.query().queryTPickingH().existsWSglRowShipInspBList(new SubQuery<WSglRowShipInspBCB>() {
			@Override
			public void query(WSglRowShipInspBCB wCb) {
				wCb.checkInvalidQuery();
				wCb.query().setSglRowShipInspHId_Equal(sglRowShipInspHId);
			}
		});

		TPackingH boxUpdEntity = tPackingHBhv.newMyEntity();
		boxUpdEntity.setBoxId(boxId);

		tPackingHBhv.queryUpdate(boxUpdEntity, cb);
	}

	/**
	 * <h2>検品処理.</h2>
	 * <pre>
	 * 1商品を検品済にする。
	 * 検品中の伝票(単行出荷検品ワークボディ)の検品済数をインクリメントする。
	 * 検品中の伝票がない場合は、未検品の伝票の検品済数をインクリメントする。
	 *
	 * 1伝票の検品が全て完了した場合、
	 * ・出庫ボディ、単行出荷検品ワークボディの検品フラグを「検品済」に更新
	 * ・梱包ステータス/出庫ステータス/出荷ステータスを「出荷検品済」に変更
	 *
	 * 全て完了していない かつ
	 * 未検品だった伝票の検品済数をインクリメントした場合
	 * ・出庫ボディ、単行出荷検品ワークボディの検品フラグを「検品作業中」に更新
	 * ・梱包ステータス/出庫ステータス/出荷ステータスを「出荷検品中」に変更
	 * ・出庫作業メッセージを結果に設定
	 *
	 * 1伝票の検品が完了した場合、
	 * 帳票発行区分が「随時出力」の場合は
	 * 荷札、納品明細の出力設定に従い、荷札、納品明細を発行する。
	 *
	 * ピッキンググループNo.、仮置No.、作業指示数別の
	 * 伝票が全て完了した場合、
	 * 帳票発行区分が「検品完了後に出力」の場合は
	 * 荷札、納品明細の出力設定に従い、荷札、納品明細を発行する。
	 * </pre>
	 *
	 * @param wSglRowShipInspH 単行検品ワークヘッダ
	 * @param wSglRowShipInspB 単行検品ワークボディ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return ResultInspected 検品処理結果クラス
	 */
	public ResultInspected inspected(WSglRowShipInspH wSglRowShipInspH, WSglRowShipInspB wSglRowShipInspB, ErrorStatus errSts) {

		// 検品(入力した)ソースCD
		final String inputJanCd = wSglRowShipInspB.getInputJanCd();

		// ===== 入力ソースCDのチェック =====

		if (CU.isNullOrEmpty(inputJanCd)) {
			getErrorManager().throwException(new IllegalArgumentException("Argment[wSglRowShipInspB.inputJanCd] is null."));
			return null;
		}

		if (wSglRowShipInspH.getMProduct() == null) {
			wSglRowShipInspH.setMProduct(mProductBhv.selectByPKValueWithDeletedCheck(wSglRowShipInspH.getProductId()));
		}

		if (!CU.equals(inputJanCd, wSglRowShipInspH.getMProduct().getJanCd()) && !CU.equals(inputJanCd, wSglRowShipInspH.getMProduct().getProductCd())) {
			// 入力ソースCDが検品中のソースCDと不一致

			getErrorManager().add(errSts, WmsMessageConst.SINGLE_ROW_SHIPPING_INSPECT_OTHER_PRODUCT_ERROR, wSglRowShipInspH.getMProduct().getProductCd());
			return null;
		}

		final long sglRowShipInspHId = wSglRowShipInspH.getSglRowShipInspHId();
		final long userId = wSglRowShipInspB.getUserId();

		// ===== 単行出荷検品ワークヘッダの取得(更新ロック) =====

		WSglRowShipInspHCB whCb = wSglRowShipInspHBhv.newMyConditionBean();
		whCb.lockForUpdate();
		whCb.query().setSglRowShipInspHId_Equal(sglRowShipInspHId);

		WSglRowShipInspH wInspH = wSglRowShipInspHBhv.selectEntity(whCb);

		if (wInspH == null) {
			// 対象データなし

			ResultInspected result = new ResultInspected();
			result.isNoData = true;
			return result;
		}

		// ===== 作業中データ取得 =====

		boolean isNewData = false;

		WSglRowShipInspBCB wbCb = wSglRowShipInspBBhv.newMyConditionBean();
		wbCb.setupSelect_TPickingH();

		wbCb.query().setInspectionFlg_NotEqual_$1();
		wbCb.query().setSglRowShipInspHId_Equal(sglRowShipInspHId);
		wbCb.query().setUserId_Equal(userId);

		wbCb.addOrderBy_PK_Asc();
		wbCb.fetchFirst(1);

		WSglRowShipInspB workInspB = wSglRowShipInspBBhv.selectEntity(wbCb);
		if (workInspB == null) {
			// 作業中データなし ==> 未検品のデータを検品

			WSglRowShipInspBCB newWbCb = wSglRowShipInspBBhv.newMyConditionBean();
			newWbCb.setupSelect_TPickingH();

			newWbCb.query().setSglRowShipInspHId_Equal(sglRowShipInspHId);
			newWbCb.query().setInspectionFlg_Equal_$0();
			newWbCb.query().setUserId_IsNull();

			newWbCb.addOrderBy_PK_Asc();

			newWbCb.fetchFirst(1);

			workInspB = wSglRowShipInspBBhv.selectEntity(newWbCb);

			if (workInspB == null) {
				// 対象データなし

				ResultInspected result = new ResultInspected();
				result.isNoData = true;
				return result;
			}

			isNewData = true;
		}

		// ===== 検品処理 =====

		long inspectedNum = CU.nullToZero(workInspB.getInspectedNum());
		long workInstNum = wInspH.getWorkInstNum();

		// 検品数をインクリメント
		inspectedNum = inspectedNum + 1;
		workInspB.setInspectedNum(inspectedNum);

		// 検品済伝票数
		long inspectedSlipNum = CU.nullToZero(wInspH.getInspectedSlipNum());

		// 1伝票検品完了フラグ
		boolean isInspectedSlip = false;
		if (workInstNum <= inspectedNum) {
			// 検品数が作業指示数に達した ==> 検品済

			isInspectedSlip = true;
		}

		if (isInspectedSlip) {
			// 1伝票 検品完了

			// 検品フラグ・出庫ステータスのDB更新(検品完了)
			updateInspectionEnd(workInspB, userId, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}

			// 検品済伝票数をインクリメント
			inspectedSlipNum = inspectedSlipNum + 1;

			// 単行出荷検品ワークヘッダの更新
			wInspH.setInspectedSlipNum(inspectedSlipNum);
			wSglRowShipInspHBhv.update(wInspH);
		} else {
			// 検品数を増やす

			if (isNewData) {

				// 検品フラグ・出庫ステータスのDB更新(検品開始)
				updateInspectionStart(workInspB, userId, errSts);
				if (0 < getErrorManager().size()) {
					return null;
				}
				// ※排他チェック用にバージョンNo.を更新
				wSglRowShipInspHBhv.update(wInspH);
			} else {

				// 検品済数の更新のみ
				wSglRowShipInspBBhv.update(workInspB);
			}
		}

		// ===== 結果作成 =====

		String pickingWorkMessage = null;
		if (isNewData) {
			// 新しい伝票

			// 出庫作業メッセージを検索
			pickingWorkMessage = selectPickingWorkMessage(workInspB.getPickingHId());
		}

		ResultInspected result = new ResultInspected();
		result.isInspectedSlip = isInspectedSlip;
		result.remainSlipNum = wInspH.getSlipNum().longValue() - inspectedSlipNum;
		result.pickingWorkMessage = pickingWorkMessage;
		result.pickingWorkNo = workInspB.getTPickingH().getPickingWorkNo();

		// ===== 荷札発行 =====

		MParam param = selectMParam(wSglRowShipInspH);

		if (param.isSglRowInspAfterOutCls$1()) {
			// 検品開始後に出力

			// 最初の伝票か
			boolean isFirstSlip = false;
			if (isInspectedSlip) {
				// 1伝票完了

				if (inspectedSlipNum == 1) {
					// 完了数 = 1 (最初の伝票)
					isFirstSlip = true;
				}
			} else {
				if (inspectedSlipNum == 0) {
					// 最初の伝票
					isFirstSlip = true;
				}
			}

			if (isFirstSlip) {
				// 最初の伝票

				if (workInspB.getInspectedNum() == 1 && isFirstSlipCheckDb(workInspB)) {
					// 最初の商品

					// 荷札発行
					List<TPickingH> pickingHList = selectTargetPickingHList(sglRowShipInspHId);
					// 荷札発行
					shippingInspectAutoPrintLogic.printPiecePickingH(pickingHList, param, errSts);
					if (0 < getErrorManager().size()) {
						// 荷札発行失敗

						CommonException error = getErrorManager().get().values().toArray(new CommonException[0])[0];
						result.failedPrint = true;
						result.failedPrintMessageCd = error.getMessageCd();
						result.failedPrintPrintReplaceStrings = error.getReplaceValue();

						// ※※※検品は完了としているのでエラーとしない
						getErrorManager().clear();
					}
				}
			}
		} else if (param.isSglRowInspAfterOutCls$2()) {
			// 随時出力

			if (isInspectedSlip) {
				// 1伝票 検品完了

				// 荷札発行
				shippingInspectAutoPrintLogic.printPiecePickingH(workInspB.getTPickingH(), param, errSts);
				if (0 < getErrorManager().size()) {
					// 荷札発行失敗

					CommonException error = getErrorManager().get().values().toArray(new CommonException[0])[0];
					result.failedPrint = true;
					result.failedPrintMessageCd = error.getMessageCd();
					result.failedPrintPrintReplaceStrings = error.getReplaceValue();

					// ※※※検品は完了としているのでエラーとしない
					getErrorManager().clear();
				}
			}
		} else if (param.isSglRowInspAfterOutCls$3()) {
			// 検品完了後に出力

			if (result.remainSlipNum < 1) {
				// 全伝票 検品完了

				List<TPickingH> pickingHList = selectTargetPickingHList(sglRowShipInspHId);
				// 荷札発行
				shippingInspectAutoPrintLogic.printPiecePickingH(pickingHList, param, errSts);
				if (0 < getErrorManager().size()) {
					// 荷札発行失敗

					CommonException error = getErrorManager().get().values().toArray(new CommonException[0])[0];
					result.failedPrint = true;
					result.failedPrintMessageCd = error.getMessageCd();
					result.failedPrintPrintReplaceStrings = error.getReplaceValue();

					// ※※※検品は完了としているのでエラーとしない
					getErrorManager().clear();
				}
			}
		}

		// ===== ワークテーブル削除 =====

		if (result.remainSlipNum < 1) {
			// 全伝票の検品完了

			deleteWork(wInspH);
		}

		return result;
	}

	/***
	 * 出庫作業メッセージの取得
	 */
	private String selectPickingWorkMessage(long pickingHId) {

		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.specify().columnPickingWorkMessage();

		cb.query().queryTAllocInstH().queryTPickingH().setPickingHId_Equal(pickingHId);
		cb.query().setPickingWorkMessage_IsNotNull();

		cb.query().addOrderBy_PickingWorkMessage_Desc().withNullsLast();
		cb.fetchFirst(1);

		TShippingInstH shippingInstH = tShippingInstHBhv.selectEntity(cb);

		if (shippingInstH == null) {
			return null;
		}

		return shippingInstH.getPickingWorkMessage();
	}

	/**
	 * 検品開始時のDB更新
	 * ・検品フラグ
	 * ・出庫(出荷)ステータス
	 */
	private void updateInspectionStart(WSglRowShipInspB workInspB, long userId, ErrorStatus errSts) {

		// ===== 検品フラグ更新 =====

		TPackingBCB flgUpdCb = tPackingBBhv.newConditionBean();
		flgUpdCb.checkInvalidQuery();
		// 未検品
		flgUpdCb.query().setInspectionFlg_Equal_$0();
		flgUpdCb.query().queryTPackingH().setPickingHId_Equal(workInspB.getPickingHId());

		TPackingB flgUpdEntity = tPackingBBhv.newMyEntity();
		flgUpdEntity.setInspectionFlg_$7();

		int updCount = tPackingBBhv.queryUpdate(flgUpdEntity, flgUpdCb);
		if (updCount < 1) {
			// 更新エラー

			getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
			return;
		}

		// ===== 出庫ステータスの更新 =====

		List<TPickingH> pickingHList = new ArrayList<TPickingH>();
		pickingHList.add(workInspB.getTPickingH());
		shipStatusUpdateLogic.inspectStart(pickingHList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== 単行出荷検品ワークの更新 =====

		workInspB.setInspectionFlg_$7();
		workInspB.setUserId(userId);

		wSglRowShipInspBBhv.update(workInspB);
	}

	/**
	 * 検品完了時のDB更新
	 * ・検品フラグ
	 * ・出庫(出荷)ステータス
	 * ・荷材ID
	 */
	private void updateInspectionEnd(WSglRowShipInspB workInspB, long userId, ErrorStatus errSts) {

		final long pickingHId = workInspB.getPickingHId();

		// ===== 検品フラグ更新 =====

		TPackingBCB flgUpdCb = tPackingBBhv.newConditionBean();
		flgUpdCb.checkInvalidQuery();
		flgUpdCb.query().setInspectionFlg_NotEqual_$1();
		flgUpdCb.query().queryTPackingH().setPickingHId_Equal(pickingHId);

		TPackingB flgUpdEntity = tPackingBBhv.newMyEntity();
		flgUpdEntity.setInspectionFlg_$1();

		int updCount = tPackingBBhv.queryUpdate(flgUpdEntity, flgUpdCb);
		if (updCount < 1) {
			// 更新エラー

			getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
			return;
		}

		// ===== 出庫ステータスの更新 =====

		List<TPickingH> pickingHList = new ArrayList<TPickingH>();
		pickingHList.add(workInspB.getTPickingH());
		shipStatusUpdateLogic.inspected(pickingHList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== 単行出荷検品ワークの更新 =====

		workInspB.setInspectionFlg_$1();
		workInspB.setUserId(userId);
		wSglRowShipInspBBhv.update(workInspB);
	}

	/**
	 * 対象の出庫ヘッダリストを検索
	 */
	private List<TPickingH> selectTargetPickingHList(long sglRowShipInspHId) {

		WSglRowShipInspBCB cb = wSglRowShipInspBBhv.newMyConditionBean();
		cb.setupSelect_TPickingH();

		cb.query().setSglRowShipInspHId_Equal(sglRowShipInspHId);

		List<WSglRowShipInspB> wInspBList = wSglRowShipInspBBhv.selectList(cb);

		return wSglRowShipInspBBhv.pulloutTPickingH(wInspBList);
	}

	/**
	 * ワークテーブルの削除
	 */
	private void deleteWork(WSglRowShipInspH wSglRowShipInspH) {

		// 単行出荷検品ワークボディの削除
		{
			WSglRowShipInspBCB cb = wSglRowShipInspBBhv.newMyConditionBean();
			cb.query().setSglRowShipInspHId_Equal(wSglRowShipInspH.getSglRowShipInspHId());
			wSglRowShipInspBBhv.queryDelete(cb);
		}

		// 単行出荷検品ワークヘッダの削除
		wSglRowShipInspHBhv.delete(wSglRowShipInspH);
	}

	/**
	 * パラメータマスタの検索
	 */
	private MParam selectMParam(WSglRowShipInspH wSglRowShipInspH) {

		MClientCenter mcc = new MClientCenter();
		mcc.setClientId(wSglRowShipInspH.getClientId());
		mcc.setCenterId(wSglRowShipInspH.getCenterId());

		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mcc);
		return mParam;
	}

	/**
	 * 最初の伝票かを判定
	 */
	private boolean isFirstSlipCheckDb(WSglRowShipInspB workInspB) {

		WSglRowShipInspBCB cb = wSglRowShipInspBBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().setSglRowShipInspHId_Equal(workInspB.getSglRowShipInspHId());
		// 自身以外
		cb.query().setSglRowShipInspBId_NotEqual(workInspB.getSglRowShipInspBId());
		// 0以外
		cb.query().setInspectedNum_NotEqual(0L);

		int count = wSglRowShipInspBBhv.selectCount(cb);

		if (0 < count) {
			// 1件以上 => 他伝票が先に検品中

			return false;
		} else {
			// 0件 => 自伝票が最初に検品中

			return true;
		}
	}

	/**
	 * <h2>次の検品データを検索.</h2>
	 * <pre>
	 * 単行出荷検品ワークから
	 * 自ユーザが検品中 または 未検品の検品データを取得する。
	 * </pre>
	 * @param sglRowShipInspHId 単行出荷検品ワークヘッダID
	 * @param userId ユーザID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return WSglRowShipInspB 次に検品する単行出荷検品ワークボディ
	 */
	public WSglRowShipInspB selectNextData(final long sglRowShipInspHId, final long userId, ErrorStatus errSts) {

		// 出荷検品ワークを検索
		WSglRowShipInspBCB cb = wSglRowShipInspBBhv.newMyConditionBean();
		cb.setupSelect_WSglRowShipInspH().withMProduct();

		cb.checkInvalidQuery();
		cb.query().setSglRowShipInspHId_Equal(sglRowShipInspHId);
		// 検品済以外
		cb.query().setInspectionFlg_NotEqual_$1();

		cb.orScopeQuery(new OrQuery<WSglRowShipInspBCB>() {

			@Override
			public void query(WSglRowShipInspBCB orCb) {
				// 自ユーザまたはユーザなし
				orCb.query().setUserId_Equal(userId);
				orCb.query().setUserId_IsNull();
			}
		});

		// 自ユーザが検品中の行を優先
		cb.query().addOrderBy_UserId_Asc().withNullsLast();
		cb.addOrderBy_PK_Asc();

		cb.fetchFirst(1);

		// 検索実行
		WSglRowShipInspB workInspB = wSglRowShipInspBBhv.selectEntity(cb);
		if (workInspB == null) {
			// データなし
			return null;
		}

		return workInspB;
	}

	/**
	 * <h2>出荷検品解除(ワークテーブルのみ).</h2>
	 * <pre>
	 * 単行出荷検品ワークに対して出荷検品解除処理を行う。
	 *
	 * 対象伝票の単行出荷検品ワークボディを未検品状態にする。
	 * 対象伝票が検品済の場合、
	 * 単行出荷検品ワークヘッダの検品済伝票数を減らす。
	 *
	 * もし、検品済伝票数が0になる場合(最初から0の場合も含む) かつ 検品中のデータがない場合、
	 * 単行出荷検品ワークからボディ、ヘッダともに削除する。
	 *
	 * </pre>
	 *
	 * @param tPickingH 出庫ヘッダ:出庫ヘッダID
	 */
	public void inspectCancelWorkTableOnly(TPickingH tPickingH) {

		WSglRowShipInspBCB cb = wSglRowShipInspBBhv.newMyConditionBean();
		cb.setupSelect_WSglRowShipInspH();
		cb.checkInvalidQuery();
		cb.query().setPickingHId_Equal(tPickingH.getPickingHId());

		// 検品解除対象ワークを検索
		WSglRowShipInspB inspB = wSglRowShipInspBBhv.selectEntity(cb);
		if (inspB == null) {
			return;
		}

		WSglRowShipInspH inspH = inspB.getWSglRowShipInspH();
		// 検品済伝票
		long inspectedSlipNum = inspH.getInspectedSlipNum().longValue();
		if (inspB.isInspectionFlg$1()) {
			// 解除対象が検品済

			inspectedSlipNum = inspectedSlipNum - 1L;
		}

		// ワーク削除判定
		boolean doDelete = false;
		if (inspectedSlipNum < 1) {
			// 検品済伝票が0

			// 検品中ユーザが設定されているボディの件数を取得
			WSglRowShipInspBCB workCountCb = wSglRowShipInspBBhv.newMyConditionBean();
			workCountCb.query().setSglRowShipInspHId_Equal(inspH.getSglRowShipInspHId());
			workCountCb.query().setUserId_IsNotNull();
			workCountCb.query().setPickingHId_NotEqual(inspB.getPickingHId());

			int workBodyCount = wSglRowShipInspBBhv.selectCount(workCountCb);

			if (workBodyCount < 1) {
				// 検品中データなし

				// ワーク全削除
				doDelete = true;
			}
		}

		if (doDelete) {

			// 単行出荷検品ワーク削除
			deleteWork(inspH);
		} else {

			// 1伝票を未検品に変更
			inspB.setUserId(null);
			inspB.setInspectedNum(0L);
			inspB.setInspectionFlg_$0();

			wSglRowShipInspBBhv.update(inspB);

			// 検品済伝票数を更新
			// ※inspectedSlipNumに変更がなくてもボディ変更の排他チェックのためバージョンNo.を更新する
			inspH.setInspectedSlipNum(inspectedSlipNum);
			wSglRowShipInspHBhv.update(inspH);
		}
	}

	/**
	 * 単行出荷検品ワークから削除
	 * @param allocInstHIdList 引当指示ヘッダIDリスト
	 */
	public void deleteWork(List<Long> allocInstHIdList) {

		if (allocInstHIdList.isEmpty()) {
			return;
		}

		// ===== 削除対象の単行出荷検品ワークボディを検索 =====

		WSglRowShipInspBCB cb = wSglRowShipInspBBhv.newMyConditionBean();
		cb.setupSelect_WSglRowShipInspH();
		cb.checkInvalidQuery();
		cb.query().queryTPickingH().setAllocInstHId_InScope(allocInstHIdList);

		List<WSglRowShipInspB> inspBList = wSglRowShipInspBBhv.selectList(cb);
		if (inspBList.isEmpty()) {
			return;
		}

		// ===== 検品済チェック =====

		Map<Long, WSglRowShipInspH> updateInspHMap = new HashMap<Long, WSglRowShipInspH>();
		for (WSglRowShipInspB inspB : inspBList) {

			final long sglRowShipInspHId = inspB.getSglRowShipInspHId();

			WSglRowShipInspH inspH;
			if (updateInspHMap.containsKey(sglRowShipInspHId)) {
				inspH = updateInspHMap.get(sglRowShipInspHId);
			} else {
				inspH = inspB.getWSglRowShipInspH();
				updateInspHMap.put(sglRowShipInspHId, inspH);
			}

			if (inspB.isInspectionFlg$1()) {
				// 検品済

				// 検品済伝票数を減らす
				long inspectedSlipNum = inspH.getInspectedSlipNum();
				inspH.setInspectedSlipNum(inspectedSlipNum - 1L);
			}

			long slipNum = inspH.getSlipNum();
			inspH.setSlipNum(slipNum - 1L);
		}

		// ===== DB更新 =====

		// 単行出荷検品ワークボディ削除実行
		wSglRowShipInspBBhv.batchDelete(inspBList);

		// 単行出荷検品ワークヘッダ更新
		for (WSglRowShipInspH inspH : updateInspHMap.values()) {

			// ワーク削除判定
			boolean doDelete = false;

			// 検品済伝票数
			long inspectedSlipNum = inspH.getInspectedSlipNum().longValue();
			if (inspectedSlipNum < 1) {
				// 検品済伝票なし ==> ワーク削除チェック

				// 検品中ユーザが設定されているボディの件数を取得
				WSglRowShipInspBCB workCountCb = wSglRowShipInspBBhv.newMyConditionBean();
				workCountCb.query().setSglRowShipInspHId_Equal(inspH.getSglRowShipInspHId());
				workCountCb.query().setUserId_IsNotNull();

				int workBodyCount = wSglRowShipInspBBhv.selectCount(workCountCb);
				if (workBodyCount < 1) {
					// 検品中データなし

					// ワーク全削除
					doDelete = true;
				}
			}

			if (doDelete) {

				// 単行出荷検品ワーク削除
				deleteWork(inspH);
			} else {

				// 検品済伝票数を更新
				wSglRowShipInspHBhv.update(inspH);
			}
		}
	}
}
