package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.AndQuery;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTShippingInstB;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.BMessageCB;
import com.oneslogi.base.dbflute.cbean.BUserCB;
import com.oneslogi.base.dbflute.cbean.MProcessTypeCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.MStockTypeCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.BMessageBhv;
import com.oneslogi.base.dbflute.exbhv.BUserBhv;
import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.BMessage;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.UserDepositListSelectLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 商品別出荷一覧（参照）データ取得ロジッククラス
 */
public class ReferenceProductShippingListSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	@Inject
	private MProcessTypeBhv mProcessTypeBhv;
	@Inject
	private MStockTypeBhv mStockTypeBhv;
	@Inject
	private BMessageBhv bMessageBhv;
	@Inject
	private BUserBhv bUserBhv;
	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete


	//===== 使用ロジック =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private UserDepositListSelectLogic userDepositListSelectLogic;

	/**
	 * <h2>出荷指示データを取得する。</h2>
	 * <pre>
	 * 引数を条件に出庫ボディ、倉庫、ロケーション、ロット、入庫No.、取引マスタ、処理区分マスタを連携して
	 * 出荷指示ボディデータを取得する。
	 * センタ区分値マスタ、処理区分マスタ、在庫区分マスタ、メッセージマスタに紐づく名称を取得し、
	 * 出荷指示ボディデータに設定する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tShippingInstH 出荷指示ヘッダ：センタCD・荷主CD・日付区分（作業日or出荷日）・日付（From）・日付(To)・配送コースCD・運送業者CD・出庫指示バッチNo.
	 *                                    ・WMS出荷伝票No.・顧客出荷指示No.・納品先CD・商品CD・出庫作業No.・欠品フラグ・出荷ステータス・キャンセルデータ表示有無・預託・緊急フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<TShippingInstB> 出荷指示ボデイリスト
	 */
	public PagingResultBean<TShippingInstB> select(final TShippingInstH tShippingInstH, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<TShippingInstB> result = null;

		//==== 出荷指示ヘッダデータ取得 =====

		//検索条件の設定
		TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
		cb.setupSelect_TShippingInstH();
		//荷主マスタ
		cb.setupSelect_TShippingInstH().withMClient();
		//センタマスタ
		cb.setupSelect_TShippingInstH().withMCenter();
		//取引先マスタ(納品先)
		cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId();
		//取引先マスタ(預託先)
		cb.setupSelect_MCustomer();
		//配送コースマスタ
		cb.setupSelect_TShippingInstH().withMDeliveryCourse();
		//運送業者マスタ
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCarrier();
		//処理区分マスタ
		cb.setupSelect_TShippingInstH().withMProcessType();
		//商品マスタ
		cb.setupSelect_MProduct();
		//在庫区分マスタ
		cb.setupSelect_MStockType();
		// 倉庫マスタ
		cb.setupSelect_MWarehouse();
		//ロケーションマスタ
		cb.setupSelect_MLocation();
		//ロット
		cb.setupSelect_TLot();
		//引当指示ヘッダ
		cb.setupSelect_TShippingInstH().withTAllocInstH();
		//出庫ヘッダ
		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH();
		//辞書ビュー(納品先出荷停止フラグ)
		cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId().withBClassDtlByShippingStopFlg();
		cb.setupSelect_TShippingInstH().withMCustomerByDelivCustomerId().withBClassDtlByShippingStopFlg();
		//辞書ビュー(商品出荷停止フラグ)
		cb.setupSelect_MProduct().withBClassDtlByShippingStopFlg();
		// 取引先マスタ
		cb.setupSelect_TAllocInstB().withMCustomer();

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(tShippingInstH.getMClient().getClientCd());
		clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);
		if (clientCondition == null) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(tShippingInstH.getMCenter().getCenterCd());
		centerCondition = centerLogic.getUkEntityWithDeletedCheck(centerCondition);
		if (centerCondition == null) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		//荷主
		cb.query().queryTShippingInstH().setClientId_Equal(clientId);

		//センタ
		cb.query().queryTShippingInstH().setCenterId_Equal(centerId);

		//作業日
		if ("0".equals(tShippingInstH.getTakingShippingFlg())) {
			cb.query().queryTShippingInstH().setWorkDt_GreaterEqual(tShippingInstH.getDtFrom());
			cb.query().queryTShippingInstH().setWorkDt_LessEqual(tShippingInstH.getDtTo());
		}
		//出荷日
		else if ("1".equals(tShippingInstH.getTakingShippingFlg())) {
			cb.query().queryTShippingInstH().setShippingDt_GreaterEqual(tShippingInstH.getDtFrom());
			cb.query().queryTShippingInstH().setShippingDt_LessEqual(tShippingInstH.getDtTo());
		}

		cb.query().queryTShippingInstH().setDeliveryCourseCd_PrefixSearch(tShippingInstH.getDeliveryCourseCd());

		//運送業者
		cb.query().queryTShippingInstH().queryMDeliveryCourse().queryMCarrier().setCarrierCd_Equal(tShippingInstH.getCarrierCd());

		//出庫指示バッチNo.
		cb.query().queryTShippingInstH().setPickingBatchNo_Equal(tShippingInstH.getPickingBatchNo());

		//WMS出荷伝票No.
		cb.query().queryTShippingInstH().setShippingSlipNo_PrefixSearch(tShippingInstH.getShippingSlipNo());

		//納品先CD
		cb.query().queryTShippingInstH().queryMCustomerBySupplyCustomerId().setCustomerCd_PrefixSearch(tShippingInstH.getCustomerCd());

		//商品CD
		cb.query().setProductCd_Equal(tShippingInstH.getProductCd());

		//顧客出荷指示No.
		cb.query().queryTShippingInstH().setClientShippingNo_PrefixSearch(tShippingInstH.getClientShippingNo());

		//出庫作業No.
		cb.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().setPickingWorkNo_LikeSearch(tShippingInstH.getPickingWorkNo(), new LikeSearchOption().likeSuffix());

		//欠品フラグ
		if ("1".equals(tShippingInstH.getStockOutFlg())) {
			// 欠品のみ

			// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
			cb.query().setStockOutNum_GreaterThan(WCC.ZERO);
			// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
		}

		//出荷ステータス
		cb.query().queryTShippingInstH().setShippingStatus_Equal(tShippingInstH.getShippingStatus());

		//緊急のみ
		if (tShippingInstH.isEmergencyFlg$1()) {
			cb.query().queryTShippingInstH().setEmergencyFlg_Equal(tShippingInstH.getEmergencyFlg());
		}

		// 検索条件にキャンセルデータ表示有無
		if (!CU.isNullOrEmpty(tShippingInstH.getCancelDisplay())) {
			// 値の取得先をセンタ区分値マスタから区分値マスタに変更
			CDef.CancelDataDisplay cancelDisplay = CDef.CancelDataDisplay.codeOf(tShippingInstH.getCancelDisplay());
			if (cancelDisplay == CDef.CancelDataDisplay.$0) {
				cb.query().queryTShippingInstH().setShippingStatus_NotEqual_$90();
			}
		}

		// ユーザマスタデータ取得
		BUserCB bUserCb = bUserBhv.newMyConditionBean();
		bUserCb.query().setUserCd_Equal(tShippingInstH.getReferenceUserCd());
		BUser bUser = bUserBhv.selectEntity(bUserCb);

		// 権限に応じた取引先マスタ取得
		List<MCustomer> mCustomerList = userDepositListSelectLogic.selectByIdCustomerDeposit(bUser, errSts);
		// 取引先マスタのIDを取得
		final List<Long> customerIdList = new ArrayList<Long>();

		// ユーザ預託マスタが存在する取引先マスタのIDを抽出
		for(MCustomer mCustomer : mCustomerList) {
			if(mCustomer.getMUserDepositList().size() > 0) {
				customerIdList.add(mCustomer.getCustomerId());
			}
		}

		// IDが存在しない場合は権限に応じた取引先マスタID全てをcustomerIdListに格納
		if(customerIdList.size() == 0) {
			for(MCustomer mCustomer : mCustomerList) {
				customerIdList.add(mCustomer.getCustomerId());
			}
		}

		// 実績の有無で絞り込みをする
		cb.orScopeQuery(new OrQuery<TShippingInstBCB>() {
			@Override
			public void query(TShippingInstBCB orCB) {
				// 実績有
				orCB.query().queryTShippingInstH().queryTAllocInstH().existsTAllocInstBList(new SubQuery<TAllocInstBCB>() {
					@Override
					public void query(TAllocInstBCB subCB) {
						// 引当指示ボディの取引先マスタから絞り込みを行う
						subCB.query().queryMCustomer().setCustomerId_InScope(customerIdList);
						subCB.query().queryMCustomer().setCustomerCd_Equal(tShippingInstH.getDepositCustomerCd());
					}
				});
				// 実績無
				orCB.orScopeQueryAndPart(new AndQuery<TShippingInstBCB>() {
					@Override
					public void query(TShippingInstBCB subCB) {
						subCB.query().queryTShippingInstH().queryTAllocInstH().notExistsTAllocInstBList(new SubQuery<TAllocInstBCB>() {
							@Override
							public void query(TAllocInstBCB dummyCB) {
								// 存在しないことだけを確認
							}
						});
						// 出荷指示ボディの取引先マスタから絞り込みを行う
						subCB.query().queryMCustomer().setCustomerId_InScope(customerIdList);
						subCB.query().queryMCustomer().setCustomerCd_Equal(tShippingInstH.getDepositCustomerCd());
					}
				});
			}
		});

		//ORDER BY

		//荷主CD
		cb.query().queryTShippingInstH().queryMClient().addOrderBy_ClientCd_Asc();

		//センタCD
		cb.query().queryTShippingInstH().queryMCenter().addOrderBy_CenterCd_Asc();

		//作業日
		cb.query().queryTShippingInstH().addOrderBy_WorkDt_Asc();

		//出荷日
		cb.query().queryTShippingInstH().addOrderBy_ShippingDt_Asc();

		//納品先CD
		cb.query().queryTShippingInstH().addOrderBy_SupplyCustomerCd_Asc();

		//顧客出荷指示No.
		cb.query().queryTShippingInstH().addOrderBy_ClientShippingNo_Asc();

		//WMS出荷伝票No.
		cb.query().queryTShippingInstH().addOrderBy_ShippingSlipNo_Asc();

		//出庫指示バッチNo.
		cb.query().queryTShippingInstH().addOrderBy_PickingBatchNo_Asc();

		//納品予定日
		cb.query().queryTShippingInstH().addOrderBy_DelivPlanDt_Asc();

		//行No.
		cb.query().addOrderBy_LineNo_Asc();

		//商品CD
		cb.query().addOrderBy_ProductCd_Asc();

		//===== 出荷指示ボデー検索実行 =====
		// 検索実行
		result = selectPage(tShippingInstBBhv, cb, paging);

		tShippingInstBBhv.loadTPickingBList(result, new ConditionBeanSetupper<TPickingBCB>() {
			public void setup(TPickingBCB subCB) {
				subCB.setupSelect_TStock().withMLocation().withMZone().withMWarehouse();
				subCB.setupSelect_TStock().withTLot();
				subCB.setupSelect_TStock().withTStoreNo();
				subCB.setupSelect_TStock().withMCustomer();
				subCB.setupSelect_TStock().withMStockType();
				subCB.query().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
				subCB.query().queryTStock().queryTLot().addOrderBy_Lot_Asc();
				subCB.query().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
				subCB.query().queryTStock().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();
				subCB.specify().derivedTPackingBList().max(new SubQuery<TPackingBCB>() {
					@Override
					public void query(TPackingBCB subCB) {
						subCB.specify().specifyTPackingH().columnMixedFlg();
					}
				}, TPickingB.ALIAS_mixedFlg);
			}
		});

		// [#3136][Ver3.0] 複数荷姿対応(商品単位) 2017.12.26 shimizu Start
		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		// [#3136][Ver3.0] 複数荷姿対応(商品単位) 2017.12.26 shimizu End

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
		} else {
			// 区分値マスタより取得
			BClassDtlCB cbCCD = bClassDtlBhv.newConditionBean();
			cbCCD.specify().columnClassDtlCd();
			cbCCD.specify().columnDictId();
			cbCCD.setupSelect_BClass();
			cbCCD.specify().specifyBClass().columnClassCd();
			cbCCD.setupSelect_VDict(getCultureId());
			cbCCD.specify().specifyVDict().columnDictNm();
			List<String> classCdList = new ArrayList<String>();
			classCdList.add("SHIPPING_STATUS");
			classCdList.add("DELIV_TZ");
			classCdList.add("SHIPPING_STOP_FLG");
			classCdList.add("MIXED_FLG");
			cbCCD.query().queryBClass().setClassCd_InScope(classCdList);
			cbCCD.query().queryBClass().addOrderBy_ClassCd_Asc();
			cbCCD.query().addOrderBy_ClassDtlCd_Asc();
			List<BClassDtl> bClassList = bClassDtlBhv.selectList(cbCCD);
			Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

			// 区分値をMapに変換
			String classCd = "";
			Map<String, String> dtlMap = null;
			for (BClassDtl bClassDtl : bClassList) {
				if (classCd.equals(bClassDtl.getBClass().getClassCd())) {
					dtlMap.put(bClassDtl.getClassDtlCd() , bClassDtl.getVDict().getDictNm());
				}else{
					if (classCd.length() > 0) {
						bClassMap.put(classCd, dtlMap);
					}
					dtlMap = new HashMap<String, String>();
					dtlMap.put(bClassDtl.getClassDtlCd() , bClassDtl.getVDict().getDictNm());
					classCd = bClassDtl.getBClass().getClassCd();
				}
			}
			if (classCd.length() > 0) {
				bClassMap.put(classCd, dtlMap);
			}
			// 処理区分マスタより取得
			MProcessTypeCB cbPT = mProcessTypeBhv.newConditionBean();
			cbPT.specify().columnProcessTypeCd();
			cbPT.specify().columnDictId();
			cbPT.setupSelect_VDict(getCultureId());
			cbPT.specify().specifyVDict(getCultureId()).columnDictNm();
			cbPT.query().addOrderBy_ProcessTypeCd_Asc();
			List<MProcessType> processTypeList = mProcessTypeBhv.selectList(cbPT);

			classCd = "PROCESS_TYPE";
			dtlMap = new HashMap<String, String>();
			for (MProcessType mProcessType : processTypeList) {
				dtlMap.put(mProcessType.getProcessTypeCd() , mProcessType.getVDict() == null ? "" : mProcessType.getVDict().getDictNm());
			}
			if (classCd.length() > 0) {
				bClassMap.put(classCd, dtlMap);
			}

			// 在庫区分マスタより取得
			MStockTypeCB cbST = mStockTypeBhv.newConditionBean();
			cbST.specify().columnStockTypeCd();
			cbST.specify().columnDictId();
			cbST.setupSelect_VDict(getCultureId());
			cbST.specify().specifyVDict(getCultureId()).columnDictNm();
			cbST.query().addOrderBy_StockTypeCd_Asc();
			List<MStockType> stockTypeList = mStockTypeBhv.selectList(cbST);

			classCd = "STOCK_TYPE";
			dtlMap = new HashMap<String, String>();
			for (MStockType mStockType : stockTypeList) {
					dtlMap.put(mStockType.getStockTypeCd() , mStockType.getVDict().getDictNm());
			}
			if (classCd.length() > 0) {
				bClassMap.put(classCd, dtlMap);
			}

			// メッセージマスタの事前取得
			Map<String, String> mapMessage = new HashMap<String, String>();
			for (TShippingInstB tShippingInstB : result) {
				if (!CU.isNullOrEmpty(tShippingInstB.getErrorMessageCd())) {
					if (!mapMessage.containsKey(tShippingInstB.getErrorMessageCd())) {
						mapMessage.put(tShippingInstB.getErrorMessageCd(), null);
					}
				}
				if (!CU.isNullOrEmpty(tShippingInstB.getTShippingInstH().getErrorMessageCd())) {
					if (!mapMessage.containsKey(tShippingInstB.getTShippingInstH().getErrorMessageCd())) {
						mapMessage.put(tShippingInstB.getTShippingInstH().getErrorMessageCd(), null);
					}
				}


			}
			if (mapMessage.size() > 0) {
				BMessageCB cbM = bMessageBhv.newConditionBean();
				cbM.specify().columnMessageCd();
				cbM.specify().columnMessageNm();
				cbM.query().setCultureId_Equal(getCultureId());
				cbM.query().setMessageCd_InScope(mapMessage.keySet());
				cbM.query().addOrderBy_MessageCd_Asc();
				List<BMessage> messageList = bMessageBhv.selectList(cbM);
				for (BMessage bMessage : messageList) {
					mapMessage.put(bMessage.getMessageCd(), bMessage.getMessageNm());
				}

			}

			// 区分値マスタの名称の設定
			for (TShippingInstB tShippingInstB : result) {
				if (bClassMap.containsKey("SHIPPING_STATUS")) {
					if (bClassMap.get("SHIPPING_STATUS").containsKey(tShippingInstB.getTShippingInstH().getShippingStatus())) {
						if (tShippingInstB.getTShippingInstH().getBClassDtlByShippingStatus() == null) {
							tShippingInstB.getTShippingInstH().setBClassDtlByShippingStatus(new BClassDtl());
						}
						if (tShippingInstB.getTShippingInstH().getBClassDtlByShippingStatus().getVDict() == null) {
							tShippingInstB.getTShippingInstH().getBClassDtlByShippingStatus().setVDict(new VDict());
						}

						tShippingInstB.getTShippingInstH().getBClassDtlByShippingStatus().getVDict().setDictNm(bClassMap.get("SHIPPING_STATUS").get(tShippingInstB.getTShippingInstH().getShippingStatus()));
					}
				}
				if (bClassMap.containsKey("DELIV_TZ")) {
					if (bClassMap.get("DELIV_TZ").containsKey(tShippingInstB.getTShippingInstH().getDelivTz())) {
						if (tShippingInstB.getTShippingInstH().getBClassDtlByDelivTz() == null) {
							tShippingInstB.getTShippingInstH().setBClassDtlByDelivTz(new BClassDtl());
						}
						if (tShippingInstB.getTShippingInstH().getBClassDtlByDelivTz().getVDict() == null) {
							tShippingInstB.getTShippingInstH().getBClassDtlByDelivTz().setVDict(new VDict());
						}
						tShippingInstB.getTShippingInstH().getBClassDtlByDelivTz().getVDict().setDictNm(bClassMap.get("DELIV_TZ").get(tShippingInstB.getTShippingInstH().getDelivTz()));
					}
				}
				// [品質検査対応][Ver3.1][#5705]納品先が削除済みの場合にnullで落ちないようにする 2018.11.22 matsumoto Start
				// 納品先の出荷停止フラグが0の場合、届先の出荷停止フラグを設定
				if (CU.nullToStr(tShippingInstB.getTShippingInstH().chaseMCustomerBySupplyCustomerId().getShippingStopFlg()).equals("0")) {
					tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().setShippingStopFlg(tShippingInstB.getTShippingInstH().getMCustomerByDelivCustomerId().getShippingStopFlg());
				}
				// [品質検査対応][Ver3.1][#5705]納品先が削除済みの場合にnullで落ちないようにする 2018.11.22 matsumoto End
				if (bClassMap.containsKey("SHIPPING_STOP_FLG")) {
					if (tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId() != null) {
						if (bClassMap.get("SHIPPING_STOP_FLG").containsKey(tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getShippingStopFlg())) {
							if (tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getBClassDtlByShippingStopFlg() == null) {
								tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().setBClassDtlByShippingStopFlg(new BClassDtl());
							}
							if (tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getBClassDtlByShippingStopFlg().getVDict() == null) {
								tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getBClassDtlByShippingStopFlg().setVDict(new VDict());
							}
							tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getBClassDtlByShippingStopFlg().getVDict().setDictNm(bClassMap.get("SHIPPING_STOP_FLG").get(tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getShippingStopFlg()));
						}
					}
					if (tShippingInstB.getMProduct() != null) {
						if (bClassMap.get("SHIPPING_STOP_FLG").containsKey(tShippingInstB.getMProduct().getShippingStopFlg())) {
							if (tShippingInstB.getMProduct().getBClassDtlByShippingStopFlg() == null) {
								tShippingInstB.getMProduct().setBClassDtlByShippingStopFlg(new BClassDtl());
							}
							if (tShippingInstB.getMProduct().getBClassDtlByShippingStopFlg().getVDict() == null) {
								tShippingInstB.getMProduct().getBClassDtlByShippingStopFlg().setVDict(new VDict());
							}
							tShippingInstB.getMProduct().getBClassDtlByShippingStopFlg().getVDict().setDictNm(bClassMap.get("SHIPPING_STOP_FLG").get(tShippingInstB.getMProduct().getShippingStopFlg()));
						}
					}
				}
				if (bClassMap.containsKey("PROCESS_TYPE")) {
					if (bClassMap.get("PROCESS_TYPE").containsKey(tShippingInstB.getTShippingInstH().getMProcessType().getProcessTypeCd())) {
						if (tShippingInstB.getTShippingInstH().getMProcessType().getVDict() == null) {
							tShippingInstB.getTShippingInstH().getMProcessType().setVDict(new VDict());
						}
						tShippingInstB.getTShippingInstH().getMProcessType().getVDict().setDictNm(bClassMap.get("PROCESS_TYPE").get(tShippingInstB.getTShippingInstH().getMProcessType().getProcessTypeCd()));
					}
				}
				if (bClassMap.containsKey("STOCK_TYPE") || bClassMap.containsKey("MIXED_FLG")) {
					if (tShippingInstB.getMStockType() != null) {
						if (bClassMap.get("STOCK_TYPE").containsKey(tShippingInstB.getMStockType().getStockTypeCd())) {
							if (tShippingInstB.getMStockType().getVDict() == null) {
								tShippingInstB.getMStockType().setVDict(new VDict());
							}
							tShippingInstB.getMStockType().getVDict().setDictNm(bClassMap.get("STOCK_TYPE").get(tShippingInstB.getMStockType().getStockTypeCd()));
						}
					}
					if (tShippingInstB.getTPickingBList().size() > 0) {
						for (TPickingB tPickingB : tShippingInstB.getTPickingBList()) {
							if (tPickingB.getTStock() != null) {
								if (bClassMap.get("STOCK_TYPE").containsKey(tPickingB.getTStock().getMStockType().getStockTypeCd())) {
									if (tPickingB.getTStock().getMStockType().getVDict() == null) {
										tPickingB.getTStock().getMStockType().setVDict(new VDict());
									}
									tPickingB.getTStock().getMStockType().getVDict().setDictNm(bClassMap.get("STOCK_TYPE").get(tPickingB.getTStock().getMStockType().getStockTypeCd()));
								}
							}
							if (bClassMap.get("MIXED_FLG").containsKey(tPickingB.getMixedFlg())) {
								tPickingB.setMixedFlgNm(bClassMap.get("MIXED_FLG").get(tPickingB.getMixedFlg()));
							}
						}
					}
				}

				// エラーメッセージ名称の取得
				if (mapMessage.size() > 0 && !CU.isNullOrEmpty(tShippingInstB.getErrorMessageCd())) {
					tShippingInstB.setBodyMessageNm(mapMessage.get(tShippingInstB.getErrorMessageCd()));
				}
				if (mapMessage.size() > 0 && !CU.isNullOrEmpty(tShippingInstB.getTShippingInstH().getErrorMessageCd())) {
					tShippingInstB.getTShippingInstH().setHeadMessageNm(mapMessage.get(tShippingInstB.getTShippingInstH().getErrorMessageCd()));
				}
			}

			// [#3136][Ver3.0] 複数荷姿対応(商品単位) 2017.12.26 shimizu Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
			tShippingInstBBhv.load(result, new ReferrerLoaderHandler<LoaderOfTShippingInstB>() {
				@Override
				public void handle(LoaderOfTShippingInstB loader) {
					loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
						@Override
						public void setup(MProductShapeCB subCB) {
							subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
							subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
							subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
							subCB.query().setDelFlg_Equal_$0();
							subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
						}
					});
				}
			});
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

			for (TShippingInstB instB : result) {
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
				WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, instB.getMProduct());
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			}
			// [#3136][Ver3.0] 複数荷姿対応(商品単位) 2017.12.26 shimizu End

		}

		PagingResultBean<TShippingInstB> lstShippingInstB = new PagingResultBean<TShippingInstB>();

		for (int i = 0; i < result.size(); i++) {

			TShippingInstB tShippingInstB = new TShippingInstB();

			// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(stockOutNum設定処理を削除) 2018.07.27 kawana Delete

			// [#3136][Ver3.0] 複数荷姿対応(商品単位) 2017.12.26 shimizu Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品最小荷姿単位名称
			result.get(i).setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, result.get(i).getMProduct()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			// [#3136][Ver3.0] 複数荷姿対応(商品単位) 2017.12.26 shimizu End

			if (result.get(i).getTPickingBList().size() > 1) {

				for (int j = 0; j < result.get(i).getTPickingBList().size(); j++) {

					tShippingInstB = result.get(i).clone();

					TPickingB tPickingB = new TPickingB();
					List<TPickingB> tPickingBList = new ArrayList<TPickingB>();

					tPickingB = result.get(i).getTPickingBList().get(j).clone();
					tPickingB.getTStock().getMLocation().setLocationNm(result.get(i).getTPickingBList().get(j).getTStock().getMLocation().getLocationNm());
					tPickingB.setPickingNum(result.get(i).getTPickingBList().get(j).getPickingNum());
					tPickingB.getTStock().getTLot().setLot(result.get(i).getTPickingBList().get(j).getTStock().getTLot().getLot());
					tPickingB.getTStock().getTLot().setLimitDt(result.get(i).getTPickingBList().get(j).getTStock().getTLot().getLimitDt());
					tPickingB.getTStock().getTStoreNo().setStoreLabelNo(result.get(i).getTPickingBList().get(j).getTStock().getTStoreNo().getStoreLabelNo());
					tPickingB.setMixedFlg(result.get(i).getTPickingBList().get(j).getMixedFlg());
					tPickingBList.add(tPickingB);
					tShippingInstB.setTPickingBList(tPickingBList);

					if (j > 0) {
						tShippingInstB.setInstNum(null);
						tShippingInstB.setAllocNum(null);
						tShippingInstB.setStockOutNum(null);
						tShippingInstB.setLot(null);
						tShippingInstB.setLimitDt(null);
						tShippingInstB.setBodyMessageNm(null);
					}

					lstShippingInstB.add(tShippingInstB);
				}
			} else {
				lstShippingInstB.add(result.get(i).clone());
			}
		}

		return lstShippingInstB;
	}
}
