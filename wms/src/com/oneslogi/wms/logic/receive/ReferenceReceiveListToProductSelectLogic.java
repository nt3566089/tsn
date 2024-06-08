package com.oneslogi.wms.logic.receive;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.AndQuery;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTReceivePlanB;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.BUserCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.BUserBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.BMessage;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateCheckLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.master.UserDepositListSelectLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 商品別入荷一覧データ取得ロジッククラス
 */
public class ReferenceReceiveListToProductSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private BClassDtlBhv bClassDtlBhv;

	// ===== 使用ロジック =====
	@Inject
	private MessageLogic messageLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;
	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete
	@Inject
	private UserDepositListSelectLogic userDepositListSelectLogic;
	@Inject
	private BUserBhv bUserBhv;

	/**
	 * <h2>商品別入荷一覧データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからデータを検索し、商品別入荷一覧データを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * 検索対象が存在する場合、【入荷期限日の設定】を行い、戻り値を設定する。
	 *
	 * 【入荷期限日の設定】
	 * ・{@link StockUpdateCheckLogic#receiveLimitDateCheck(TReceivePlanH, List, TStoreRecordH, List) 入荷期限日の設定メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param header 入荷予定ヘッダ：センタID・荷主ID・入荷予定日（From）・入荷予定日(To)・入荷ステータス・削除データ表示フラグ
	 *                               ・予定仕入先CD・WMS入荷伝票No.・予定顧客入荷指示No.・顧客入荷指示No.・顧客発注No.
	 * @param planBody 入荷予定ボディ：予定倉庫ID・商品CD・予定顧客発注No.
	 * @param recordBody 入庫実績ボディ：入庫日（From）・入庫日(To)
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<TReceivePlanB> 入荷予定ボディリスト
	 */
	public PagingResultBean<TReceivePlanB> select(final TReceivePlanH header, TReceivePlanB planBody, final TStoreRecordB recordBody, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<TReceivePlanB> result = null;
		PagingResultBean<TReceivePlanB> resultList = new PagingResultBean<TReceivePlanB>();

		// 削除フラグの設定
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		final TReceivePlanBCB cb = tReceivePlanBBhv.newMyConditionBean();

		// 入荷予定ヘッダの接続
		cb.setupSelect_TReceivePlanH();
		// 商品マスタの接続
		cb.setupSelect_MProduct();
		// 荷主マスタの接続
		cb.setupSelect_TReceivePlanH().withMClient();
		// センタマスタの接続
		cb.setupSelect_TReceivePlanH().withMCenter();
		// 取引先マスタの接続 by 予定仕入先ID
		cb.setupSelect_TReceivePlanH().withMCustomerByPlanSupplierId();
		// 取引先マスタの接続 by 予定預託ID
		cb.setupSelect_TReceivePlanH().withMCustomerByPlanDepositId();
		// 入荷予定帳票の接続
		cb.setupSelect_TReceivePlanH().withTReceivePlanRAsOne();
		// 処理区分マスタの接続
		cb.setupSelect_TReceivePlanH().withMProcessType();
		cb.setupSelect_TReceivePlanH().withMProcessType().withVDict(getCultureId());

		// 在庫区分マスタの接続
		cb.setupSelect_TReceivePlanH().withMStockType();
		cb.setupSelect_TReceivePlanH().withMStockType().withVDict(getCultureId());

		cb.setupSelect_MLocation();

		setQueryCondition(cb, header, planBody, recordBody);

		// フロントから取得したUserCd情報からBUserのEntityを取得
		BUserCB bUserCb = bUserBhv.newMyConditionBean();
		bUserCb.query().setUserCd_Equal(header.getLoginUserCd());
		BUser bUserSelectByBUser = bUserBhv.selectEntity(bUserCb);

		// ユーザの権限内の預託のリストを取得
		List<MCustomer> mCustomerList = userDepositListSelectLogic.selectByIdCustomerDeposit(bUserSelectByBUser, errSts);

		// List<Long>に変換(預託ID)
		final List<Long> mCustomerIdList = new ArrayList<>();
		for (MCustomer mCustomer : mCustomerList) {
			if (mCustomer.getMUserDepositList().size() > 0) {
				mCustomerIdList.add(mCustomer.getCustomerId());
			}
		}
		if (mCustomerIdList.size() == 0) {
			for (MCustomer mCustomer : mCustomerList) {
				mCustomerIdList.add(mCustomer.getCustomerId());
			}
		}

		// 預託で絞り込み
		cb.orScopeQuery(new OrQuery<TReceivePlanBCB>() {

			@Override
			public void query(TReceivePlanBCB orCB) {
				// 実績あり
				orCB.query().existsTStoreRecordBList(new SubQuery<TStoreRecordBCB>() {
					@Override
					public void query(TStoreRecordBCB subCB) {
						// 実績ヘッダに値を設定
						subCB.query().queryTStoreRecordH().queryMCustomerByDepositId().setCustomerId_InScope(mCustomerIdList);
						subCB.query().queryTStoreRecordH().queryMCustomerByDepositId().setCustomerCd_Equal(header.getDepositCustomerCd());
					}
				});

				// 実績なし
				orCB.orScopeQueryAndPart(new AndQuery<TReceivePlanBCB>() {
					@Override
					public void query(final TReceivePlanBCB subCB) {
						subCB.query().notExistsTStoreRecordBList(new SubQuery<TStoreRecordBCB>() {
							@Override
							public void query(TStoreRecordBCB dummyCB) {

							}
						});
						// 予定ヘッダに値を設定
						subCB.query().queryTReceivePlanH().queryMCustomerByPlanDepositId().setCustomerId_InScope(mCustomerIdList);
						subCB.query().queryTReceivePlanH().queryMCustomerByPlanDepositId().setCustomerCd_Equal(header.getDepositCustomerCd());
					}
				});
			}
		});

		// ソート順の設定
		cb.query().queryTReceivePlanH().addOrderBy_ReceivePlanDt_Asc();
		cb.query().queryTReceivePlanH().addOrderBy_PlanClientReceiveNo_Asc();
		cb.query().queryTReceivePlanH().addOrderBy_ReceiveSlipNo_Asc();
		cb.query().queryTReceivePlanH().addOrderBy_ReceiveDeliveryStatus_Asc();
		cb.query().addOrderBy_LineNo_Asc();
		cb.query().addOrderBy_ProductCd_Asc();

		result = selectPage(tReceivePlanBBhv, cb, paging);

		List<String> classCdList = new ArrayList<String>();
		classCdList.add("RECEIVE_STATUS");// 入荷ステータス
		classCdList.add("RECEIVE_DELIVERY_STATUS");// 入荷納品ステータス
		classCdList.add("STORE_FLG");// 入庫格納フラグ

		// 区分値マスタより取得
		Map<String, Map<String, String>> bClassMap = this.getBClassInfo(classCdList);

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		} else {

			// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			tReceivePlanBBhv.load(result, new ReferrerLoaderHandler<LoaderOfTReceivePlanB>() {
				public void handle(LoaderOfTReceivePlanB loader) {
					loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
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

			Map<Long, String> decimalExistFlgMap = new HashMap<>();
			Map<Long, String> minimumUnitMap = new HashMap<>();
			Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
			Map<Long, List<String>> parentUnitMap = new HashMap<>();
			for (TReceivePlanB planB : result) {
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
				WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, planB.getMProduct());
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			}

			// 入庫実績ボディを抽出
			tReceivePlanBBhv.loadTStoreRecordBList(result, new ConditionBeanSetupper<TStoreRecordBCB>() {
				public void setup(final TStoreRecordBCB subCB) {
					subCB.setupSelect_TStoreRecordH();
					subCB.setupSelect_TStoreRecordH().withMCustomerBySupplierId();
					subCB.setupSelect_TStoreRecordH().withMCustomerByDepositId();
					subCB.setupSelect_MLocation();

					subCB.setupSelect_TStoreRecordH().withMProcessType();
					subCB.setupSelect_TStoreRecordH().withMProcessType().withVDict(getCultureId());

					subCB.specify().derivedTStockInoutList().max(new SubQuery<TStockInoutCB>() {
						@Override
						public void query(TStockInoutCB subCB2) {
							// 在庫区分CD
							subCB2.specify().specifyTStock().specifyMStockType().columnStockTypeCd();
							setDelFlg(subCB2);
						}
					}, TStoreRecordB.ALIAS_stockTypeCd);

					subCB.specify().derivedTStockInoutList().max(new SubQuery<TStockInoutCB>() {
						@Override
						public void query(TStockInoutCB subCB2) {
							// 在庫区分NM
							subCB2.specify().specifyTStock().specifyMStockType().specifyVDict(getCultureId()).columnDictNm();
							setDelFlg(subCB2);
						}
					}, TStoreRecordB.ALIAS_stockTypeNm);

					subCB.specify().derivedTStockInoutList().max(new SubQuery<TStockInoutCB>() {
						@Override
						public void query(TStockInoutCB subCB2) {
							// ロケーションNM
							subCB2.specify().specifyTStock().specifyMLocation().columnLocationNm();
							setDelFlg(subCB2);
						}
					}, TStoreRecordB.ALIAS_locationNm);

					subCB.specify().derivedTStockInoutList().max(new SubQuery<TStockInoutCB>() {
						@Override
						public void query(TStockInoutCB subCB2) {
							// 入庫ラベルNo.
							subCB2.specify().specifyTStock().specifyTStoreNo().columnStoreLabelNo();
							setDelFlg(subCB2);
						}
					}, TStoreRecordB.ALIAS_storeLabelNo);

					subCB.query().setStoreDt_GreaterEqual(recordBody.getStoreDtFrom());
					subCB.query().setStoreDt_LessEqual(recordBody.getStoreDtTo());
					// 顧客入荷指示No.の設定
					subCB.query().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(header.getStoreClientReceiveNo());
					// 顧客発注No.の設定
					subCB.query().setClientOrderNo_PrefixSearch(header.getStoreClientOrderNo());

					subCB.query().addSpecifiedDerivedOrderBy_Asc(TStoreRecordB.ALIAS_storeLabelNo);

					setDelFlg(subCB);
				}
			});

			for (int j = 0; j < result.size(); j++)
			{

				// === 区分値マスタの名称の設定 ===
				// 入荷ステータス
				result.get(j).setBClassDtlByReceiveStatus(this.getBClassDtl(bClassMap, "RECEIVE_STATUS", result.get(j).getReceiveStatus()));

				// 入荷納品ステータス
				result.get(j).getTReceivePlanH()
						.setBClassDtlByReceiveDeliveryStatus(this.getBClassDtl(bClassMap, "RECEIVE_DELIVERY_STATUS", result.get(j).getTReceivePlanH().getReceiveDeliveryStatus()));

				for (TStoreRecordB tsrb : result.get(j).getTStoreRecordBList()) {
					// 入庫格納フラグ
					tsrb.setBClassDtlByStoreFlg(this.getBClassDtl(bClassMap, "STORE_FLG", tsrb.getStoreFlg()));
				}

				if (result.get(j).getTStoreRecordBList().size() < 2)
				{
					TReceivePlanB tReceivePlanB = new TReceivePlanB();
					tReceivePlanB = result.get(j).clone();
					tReceivePlanB.setReceiveStatusTemp(result.get(j).getReceiveStatus());
					tReceivePlanB.setBClassDtlByReceiveStatus(result.get(j).getBClassDtlByReceiveStatus().clone());
					tReceivePlanB.getBClassDtlByReceiveStatus().setVDict(result.get(j).getBClassDtlByReceiveStatus().getVDict().clone());
					tReceivePlanB.setTReceivePlanH(result.get(j).getTReceivePlanH().clone());
					tReceivePlanB.getTReceivePlanH().setReceiveSlipNoTemp(result.get(j).getTReceivePlanH().getReceiveSlipNo());
					tReceivePlanB.getTReceivePlanH().setMClient(result.get(j).getTReceivePlanH().getMClient().clone());
					tReceivePlanB.getTReceivePlanH().setMCenter(result.get(j).getTReceivePlanH().getMCenter().clone());

					if (result.get(j).getTReceivePlanH().getMCustomerByPlanSupplierId() != null)
					{
						tReceivePlanB.getTReceivePlanH().setMCustomerByPlanSupplierId(result.get(j).getTReceivePlanH().getMCustomerByPlanSupplierId().clone());
					}
					if (result.get(j).getTReceivePlanH().getMCustomerByPlanDepositId() != null)
					{
						tReceivePlanB.getTReceivePlanH().setMCustomerByPlanDepositId(result.get(j).getTReceivePlanH().getMCustomerByPlanDepositId().clone());
					}
					tReceivePlanB.getTReceivePlanH().setBClassDtlByReceiveDeliveryStatus(result.get(j).getTReceivePlanH().getBClassDtlByReceiveDeliveryStatus().clone());
					tReceivePlanB.getTReceivePlanH().getBClassDtlByReceiveDeliveryStatus().setVDict(result.get(j).getTReceivePlanH().getBClassDtlByReceiveDeliveryStatus().getVDict().clone());
					tReceivePlanB.getTReceivePlanH().setTReceivePlanRAsOne(result.get(j).getTReceivePlanH().getTReceivePlanRAsOne().clone());
					tReceivePlanB.getTReceivePlanH().setMProcessType(result.get(j).getTReceivePlanH().chaseMProcessType().clone());
					tReceivePlanB.getTReceivePlanH().getMProcessType().setVDict(result.get(j).getTReceivePlanH().chaseMProcessType().chaseVDict().clone());
					if (result.get(j).getMProduct() != null)
					{
						tReceivePlanB.setMProduct(result.get(j).getMProduct().clone());
					}
					if (result.get(j).getMLocation() != null)
					{
						tReceivePlanB.setMLocation(result.get(j).getMLocation().clone());
					}

					// エラーメッセージCDの取得
					String errorMessageCd = tReceivePlanB.getErrorMessageCd();

					if (!CU.isNullOrEmpty(errorMessageCd)) {
						// メッセージCDの設定
						BMessage message = new BMessage();
						message.setMessageCd(errorMessageCd);
						message = messageLogic.getUkEntity(message);
						if (message != null) {
							tReceivePlanB.setMessageNm(message.getMessageNm());
						}
					} else {
						tReceivePlanB.setMessageNm(null);
					}

					// 元WMS入荷伝票№の取得
					Long oldReceivePlanHId = tReceivePlanB.getTReceivePlanH().getOldReceivePlanHId();

					if (oldReceivePlanHId != null) {
						TReceivePlanHCB cb1 = tReceivePlanHBhv.newMyConditionBean();
						cb1.query().setReceivePlanHId_Equal(oldReceivePlanHId);
						TReceivePlanH trh = tReceivePlanHBhv.selectEntity(cb1);
						if (trh != null) {
							tReceivePlanB.getTReceivePlanH().setOldReceiveSlipNo(trh.getReceiveSlipNo());
						}
						else
						{
							tReceivePlanB.getTReceivePlanH().setOldReceiveSlipNo(null);
						}
					}
					else
					{
						tReceivePlanB.getTReceivePlanH().setOldReceiveSlipNo(null);
					}

					// 予定数の取得
					BigDecimal planNum = tReceivePlanB.getPlanNum();

					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
					// 予定最小荷姿単位名称
					tReceivePlanB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, result.get(j).getMProduct()));
					// 入数内訳
					tReceivePlanB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, result.get(j).getMProduct()));
					// 予定内訳
					tReceivePlanB.setPlanBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, planNum, minimumUnitMap, parentUnitNumMap
							, parentUnitMap, result.get(j).getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

					if (result.get(j).getTStoreRecordBList().size() == 1)
					{
						TStoreRecordB tStoreRecordB = new TStoreRecordB();
						List<TStoreRecordB> tStoreRecordBList = new ArrayList<TStoreRecordB>();
						tStoreRecordB = result.get(j).getTStoreRecordBList().get(0).clone();
						tStoreRecordB.setBClassDtlByStoreFlg(result.get(j).getTStoreRecordBList().get(0).getBClassDtlByStoreFlg().clone());
						tStoreRecordB.getBClassDtlByStoreFlg().setVDict(result.get(j).getTStoreRecordBList().get(0).getBClassDtlByStoreFlg().getVDict().clone());
						tStoreRecordB.setTStoreRecordH(result.get(j).getTStoreRecordBList().get(0).getTStoreRecordH().clone());
						tStoreRecordB.getTStoreRecordH().setMCustomerBySupplierId(result.get(j).getTStoreRecordBList().get(0).getTStoreRecordH().getMCustomerBySupplierId().clone());
						tStoreRecordB.getTStoreRecordH().setMCustomerByDepositId(result.get(j).getTStoreRecordBList().get(0).getTStoreRecordH().getMCustomerByDepositId().clone());
						tStoreRecordB.getTStoreRecordH().setMProcessType(result.get(j).getTStoreRecordBList().get(0).getTStoreRecordH().chaseMProcessType().clone());
						tStoreRecordB.getTStoreRecordH().getMProcessType().setVDict(result.get(j).getTStoreRecordBList().get(0).getTStoreRecordH().chaseMProcessType().chaseVDict().clone());
						// [#4739] 0入庫したデータを検索すると致命的エラー 2018.06.20 kawana Start
						if (result.get(j).getTStoreRecordBList().get(0).getMLocation() != null) {
							tStoreRecordB.setMLocation(result.get(j).getTStoreRecordBList().get(0).getMLocation().clone());
						}
						// [#4739] 0入庫したデータを検索すると致命的エラー 2018.06.20 kawana End
						tStoreRecordBList.add(tStoreRecordB);
						tReceivePlanB.setTStoreRecordBList(tStoreRecordBList);

						// ＨＴ検品担当者の取得
						String userId = tReceivePlanB.getTStoreRecordBList().get(0).getHtStoreInspectionUserId();
						if (!CU.isNullOrEmpty(userId)) {
							BUser bUser = new BUser();
							// ユーザID設定
							bUser.setUserId(Long.parseLong(userId));
							bUser = userLogic.getPkEntityWithDeletedCheck(bUser);
							if (bUser != null) {
								tReceivePlanB.setUserNm(bUser.getUserNm());
							}
						} else {
							tReceivePlanB.setUserNm(null);
						}

						// 入庫数の取得
						BigDecimal storeNum = tReceivePlanB.getTStoreRecordBList().get(0).getStoreNum();

						// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
						// 入庫内訳
						tReceivePlanB.setStoreBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, storeNum, minimumUnitMap, parentUnitNumMap
								, parentUnitMap, result.get(j).getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
						// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
						// 入庫格納フラグ
						tReceivePlanB.setLastStoreFlgNm(this.getBClassDtl(bClassMap, "STORE_FLG", tReceivePlanB.getTStoreRecordBList().get(0).getStoreFlg()).getVDict().getDictNm());

						// [#5964][v3.1] 入荷期限日が表示されない問題を修正 2019.01.28 kawana Start
						if (WCC.isNotZero(tStoreRecordB.getStoreNum())) {
							ArrayList<TReceivePlanB> planBList = new ArrayList<TReceivePlanB>();
							planBList.add(tReceivePlanB);

							// 入荷期限日の設定
							stockUpdateCheckLogic.receiveLimitDateCheck(tReceivePlanB.getTReceivePlanH(), planBList, tStoreRecordB.chaseTStoreRecordH(), tStoreRecordBList);
						}
						// [#5964][v3.1] 入荷期限日が表示されない問題を修正 2019.01.28 kawana End
					}
					else
					{
						// 入庫格納フラグ
						tReceivePlanB.setLastStoreFlgNm(this.getBClassDtl(bClassMap, "STORE_FLG", CDef.StoreFlg.$0.code()).getVDict().getDictNm());
					}

					// [#5964][v3.1] 入荷期限日が表示されない問題を修正 (ここから移動) 2019.01.28 kawana Delete

					resultList.add(tReceivePlanB);
					continue;
				}

				for (int i = 0; i < result.get(j).getTStoreRecordBList().size(); i++)
				{
					TReceivePlanB tReceivePlanB = new TReceivePlanB();
					tReceivePlanB = result.get(j).clone();
					tReceivePlanB.setReceiveStatusTemp(result.get(j).getReceiveStatus());
					tReceivePlanB.setBClassDtlByReceiveStatus(result.get(j).getBClassDtlByReceiveStatus().clone());
					tReceivePlanB.getBClassDtlByReceiveStatus().setVDict(result.get(j).getBClassDtlByReceiveStatus().getVDict().clone());
					tReceivePlanB.setTReceivePlanH(result.get(j).getTReceivePlanH().clone());
					tReceivePlanB.getTReceivePlanH().setReceiveSlipNoTemp(result.get(j).getTReceivePlanH().getReceiveSlipNo());
					tReceivePlanB.getTReceivePlanH().setMClient(result.get(j).getTReceivePlanH().getMClient().clone());
					tReceivePlanB.getTReceivePlanH().setMCenter(result.get(j).getTReceivePlanH().getMCenter().clone());
					if (result.get(j).getTReceivePlanH().getMCustomerByPlanSupplierId() != null)
					{
						tReceivePlanB.getTReceivePlanH().setMCustomerByPlanSupplierId(result.get(j).getTReceivePlanH().getMCustomerByPlanSupplierId().clone());
					}
					if (result.get(j).getTReceivePlanH().getMCustomerByPlanDepositId() != null)
					{
						tReceivePlanB.getTReceivePlanH().setMCustomerByPlanDepositId(result.get(j).getTReceivePlanH().getMCustomerByPlanDepositId().clone());
					}
					tReceivePlanB.getTReceivePlanH().setBClassDtlByReceiveDeliveryStatus(result.get(j).getTReceivePlanH().getBClassDtlByReceiveDeliveryStatus().clone());
					tReceivePlanB.getTReceivePlanH().getBClassDtlByReceiveDeliveryStatus().setVDict(result.get(j).getTReceivePlanH().getBClassDtlByReceiveDeliveryStatus().getVDict().clone());

					tReceivePlanB.getTReceivePlanH().setTReceivePlanRAsOne(result.get(j).getTReceivePlanH().getTReceivePlanRAsOne().clone());
					tReceivePlanB.getTReceivePlanH().setMProcessType(result.get(j).getTReceivePlanH().chaseMProcessType().clone());
					tReceivePlanB.getTReceivePlanH().getMProcessType().setVDict(result.get(j).getTReceivePlanH().chaseMProcessType().chaseVDict().clone());
					if (result.get(j).getMProduct() != null)
					{
						tReceivePlanB.setMProduct(result.get(j).getMProduct().clone());
					}
					if (result.get(j).getMLocation() != null)
					{
						tReceivePlanB.setMLocation(result.get(j).getMLocation().clone());
					}

					// エラーメッセージCDの取得
					String errorMessageCd = tReceivePlanB.getErrorMessageCd();

					if (!CU.isNullOrEmpty(errorMessageCd)) {
						// メッセージCDの設定
						BMessage message = new BMessage();
						message.setMessageCd(errorMessageCd);
						message = messageLogic.getUkEntity(message);
						if (message != null) {
							tReceivePlanB.setMessageNm(message.getMessageNm());
						}
					} else {
						tReceivePlanB.setMessageNm(null);
					}

					// 元WMS入荷伝票№の取得
					Long oldReceivePlanHId = tReceivePlanB.getTReceivePlanH().getOldReceivePlanHId();

					if (oldReceivePlanHId != null) {
						TReceivePlanHCB cb1 = tReceivePlanHBhv.newMyConditionBean();
						cb1.query().setReceivePlanHId_Equal(oldReceivePlanHId);
						TReceivePlanH trh = tReceivePlanHBhv.selectEntity(cb1);
						if (trh != null) {
							tReceivePlanB.getTReceivePlanH().setOldReceiveSlipNo(trh.getReceiveSlipNo());
						}
						else
						{
							tReceivePlanB.getTReceivePlanH().setOldReceiveSlipNo(null);
						}
					}
					else
					{
						tReceivePlanB.getTReceivePlanH().setOldReceiveSlipNo(null);
					}

					TStoreRecordB tStoreRecordB = new TStoreRecordB();
					List<TStoreRecordB> tStoreRecordBList = new ArrayList<TStoreRecordB>();
					tStoreRecordB = result.get(j).getTStoreRecordBList().get(i).clone();
					tStoreRecordB.setBClassDtlByStoreFlg(result.get(j).getTStoreRecordBList().get(i).getBClassDtlByStoreFlg().clone());
					tStoreRecordB.getBClassDtlByStoreFlg().setVDict(result.get(j).getTStoreRecordBList().get(i).getBClassDtlByStoreFlg().getVDict().clone());
					tStoreRecordB.setTStoreRecordH(result.get(j).getTStoreRecordBList().get(i).getTStoreRecordH().clone());
					tStoreRecordB.getTStoreRecordH().setMCustomerBySupplierId(result.get(j).getTStoreRecordBList().get(i).getTStoreRecordH().getMCustomerBySupplierId().clone());
					tStoreRecordB.getTStoreRecordH().setMCustomerByDepositId(result.get(j).getTStoreRecordBList().get(i).getTStoreRecordH().getMCustomerByDepositId().clone());
					tStoreRecordB.getTStoreRecordH().setMProcessType(result.get(j).getTStoreRecordBList().get(i).getTStoreRecordH().chaseMProcessType().clone());
					tStoreRecordB.getTStoreRecordH().getMProcessType().setVDict(result.get(j).getTStoreRecordBList().get(i).getTStoreRecordH().chaseMProcessType().chaseVDict().clone());
					// [#4739] 0入庫したデータを検索すると致命的エラー 2018.06.20 kawana Start
					if (result.get(j).getTStoreRecordBList().get(i).getMLocation() != null) {
						tStoreRecordB.setMLocation(result.get(j).getTStoreRecordBList().get(i).getMLocation().clone());
					}
					// [#4739] 0入庫したデータを検索すると致命的エラー 2018.06.20 kawana End
					tStoreRecordBList.add(tStoreRecordB);
					tReceivePlanB.setTStoreRecordBList(tStoreRecordBList);

					// ＨＴ検品担当者の取得
					String userId = tReceivePlanB.getTStoreRecordBList().get(0).getHtStoreInspectionUserId();
					if (!CU.isNullOrEmpty(userId)) {
						BUser bUser = new BUser();
						// ユーザID設定
						bUser.setUserId(Long.parseLong(userId));
						bUser = userLogic.getPkEntityWithDeletedCheck(bUser);
						if (bUser != null) {
							tReceivePlanB.setUserNm(bUser.getUserNm());
						}
					} else {
						tReceivePlanB.setUserNm(null);
					}

					// 予定数の取得
					BigDecimal planNum = tReceivePlanB.getPlanNum();

					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
					// 商品最小荷姿単位名称
					tReceivePlanB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, result.get(j).getMProduct()));
					// 入数内訳
					tReceivePlanB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, result.get(j).getMProduct()));
					// 予定内訳
					tReceivePlanB.setPlanBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, planNum, minimumUnitMap, parentUnitNumMap
							, parentUnitMap, result.get(j).getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));

					// 入庫数の取得
					BigDecimal storeNum = tReceivePlanB.getTStoreRecordBList().get(0).getStoreNum();

					// 入庫内訳
					tReceivePlanB.setStoreBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, storeNum, minimumUnitMap, parentUnitNumMap
							, parentUnitMap, result.get(j).getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
					// 入庫格納フラグ
					tReceivePlanB.setLastStoreFlgNm(this.getBClassDtl(bClassMap, "STORE_FLG", tReceivePlanB.getTStoreRecordBList().get(0).getStoreFlg()).getVDict().getDictNm());

					// 入庫実績ボディが存在したとき入荷予定にnullを設定する
					if (i > 0)
					{
						// 入荷予定日
						tReceivePlanB.getTReceivePlanH().setReceivePlanDt(null);
						if (tReceivePlanB.getTReceivePlanH().getMCustomerByPlanSupplierId() != null)
						{
							// 予定仕入先CD
							tReceivePlanB.getTReceivePlanH().getMCustomerByPlanSupplierId().setCustomerCd(null);
							// 予定仕入先名称
							tReceivePlanB.getTReceivePlanH().getMCustomerByPlanSupplierId().setCustomerNm(null);
							// 予定仕入先略称
							tReceivePlanB.getTReceivePlanH().getMCustomerByPlanSupplierId().setCustomerAbbr(null);
						}
						// 予定顧客入荷指示No.
						tReceivePlanB.getTReceivePlanH().setPlanClientReceiveNo(null);
						// WMS入荷伝票No.
						tReceivePlanB.getTReceivePlanH().setReceiveSlipNo(null);
						// 元WMS入荷伝票No.
						tReceivePlanB.getTReceivePlanH().setOldReceiveSlipNo(null);
						// 入荷納品ステータス
						tReceivePlanB.getTReceivePlanH().setReceiveDeliveryStatus(null);
						// 入荷納品ステータス名称
						tReceivePlanB.getTReceivePlanH().getBClassDtlByReceiveDeliveryStatus().getVDict().setDictNm(null);
						// 行No.
						tReceivePlanB.setLineNo(null);
						// 入荷ステータス
						tReceivePlanB.setReceiveStatusTemp(null);
						// 入荷ステータス名称
						tReceivePlanB.getBClassDtlByReceiveStatus().getVDict().setDictNm(null);
						// 商品CD
						tReceivePlanB.setProductCd(null);
						if (tReceivePlanB.getMProduct() != null)
						{
							// 商品名称
							tReceivePlanB.getMProduct().setProductNm(null);
							// 商品略称
							tReceivePlanB.getMProduct().setProductAbbr(null);
							// ＪＡＮCD
							tReceivePlanB.getMProduct().setJanCd(null);
						}

						// 処理区分
						tReceivePlanB.getTReceivePlanH().getMProcessType().setProcessTypeCd(null);
						// 処理区分名称
						tReceivePlanB.getTReceivePlanH().getMProcessType().getVDict().setDictNm(null);
						// 予定顧客発注No.
						tReceivePlanB.setPlanClientOrderNo(null);
						// 商品最小荷姿単位名称
						tReceivePlanB.setProductUnit(null);
						// 入数内訳
						tReceivePlanB.setUnitNumBreakdown(null);
						// 総予定数
						tReceivePlanB.setPlanNum(null);
						// 予定内訳
						tReceivePlanB.setPlanBreakdown(null);
						// 入庫内訳
						tReceivePlanB.setStoreBreakdown(null);
						if (tReceivePlanB.getMLocation() != null)
						{
							// 入荷ロケーション
							tReceivePlanB.getMLocation().setLocationNm(null);
						}
						// エラー内容
						tReceivePlanB.setMessageNm(null);
						// 予定ロット
						tReceivePlanB.setPlanLot(null);
						// 予定期限日
						tReceivePlanB.setPlanLimitDt(null);
						// 予定入庫ラベルNo.
						tReceivePlanB.setPlanStoreLabelNo(null);
					}

					if (WCC.isNotZero(tStoreRecordB.getStoreNum())) {

						ArrayList<TReceivePlanB> planBList = new ArrayList<TReceivePlanB>();
						planBList.add(tReceivePlanB);

						// 入荷期限日の設定
						stockUpdateCheckLogic.receiveLimitDateCheck(tReceivePlanB.getTReceivePlanH(), planBList, tStoreRecordB.chaseTStoreRecordH(), tStoreRecordBList);
					}

					resultList.add(tReceivePlanB);
				}
			}

			return resultList;
		}
	}

	/**
	 * 引数のCBに検索条件を設定する
	 */
	private void setQueryCondition(TReceivePlanBCB cb, final TReceivePlanH header, TReceivePlanB planBody, final TStoreRecordB recordBody) {
		// 入庫日絞り込み条件指定
		if (!CU.isNullOrEmpty(recordBody.getStoreDtFrom()) || !CU.isNullOrEmpty(recordBody.getStoreDtTo())
				|| !CU.isNullOrEmpty(header.getStoreClientReceiveNo()) || !CU.isNullOrEmpty(header.getStoreClientOrderNo())) {
			cb.query().existsTStoreRecordBList(new SubQuery<TStoreRecordBCB>() {
				@Override
				public void query(TStoreRecordBCB subCB) {
					subCB.query().setStoreDt_GreaterEqual(recordBody.getStoreDtFrom());
					subCB.query().setStoreDt_LessEqual(recordBody.getStoreDtTo());
					// 顧客入荷指示No.の設定
					subCB.query().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(header.getStoreClientReceiveNo());
					// 顧客発注No.の設定
					subCB.query().setClientOrderNo_PrefixSearch(header.getStoreClientOrderNo());
					setDelFlg(subCB);
				}
			});
		}

		// 荷主IDの設定
		cb.query().queryTReceivePlanH().setClientId_Equal(header.getClientId());
		// センタIDの設定
		cb.query().queryTReceivePlanH().setCenterId_Equal(header.getCenterId());
		// 予定倉庫ID
		cb.query().setPlanWarehouseId_Equal(planBody.getPlanWarehouseId());
		// 入荷予定日の設定 >=
		cb.query().queryTReceivePlanH().setReceivePlanDt_GreaterEqual(header.getReceivePlanDtFrom());
		// 入荷予定日の設定 <=
		cb.query().queryTReceivePlanH().setReceivePlanDt_LessEqual(header.getReceivePlanDtTo());
		// 入荷ステータスの設定
		cb.query().setReceiveStatus_Equal(header.getReceiveStatus());

		// 削除データ表示
		if (!CU.isNullOrEmpty(header.getDeleteDisplay())) {
			CDef.DeleteDataDisplay deleteDisplay = CDef.DeleteDataDisplay.codeOf(header.getDeleteDisplay());
			if (deleteDisplay == CDef.DeleteDataDisplay.$0) {
				cb.query().setReceiveStatus_NotEqual_$90();
			}
		}

		// 予定仕入先CDの設定
		cb.query().queryTReceivePlanH().setPlanSupplierCd_PrefixSearch(header.getPlanSupplierCd());
		// MS入荷伝票No.の設定
		cb.query().queryTReceivePlanH().setReceiveSlipNo_PrefixSearch(header.getReceiveSlipNo());
		// 顧客入荷指示No.の設定
		cb.query().queryTReceivePlanH().setPlanClientReceiveNo_PrefixSearch(header.getPlanClientReceiveNo());
		// 商品CDの設定
		cb.query().setProductCd_PrefixSearch(planBody.getProductCd());
		// 顧客発注No.の設定
		cb.query().setPlanClientOrderNo_PrefixSearch(planBody.getPlanClientOrderNo());

	}

	/**
	 * <h2>区分値マスタ情報（コード・名称）を取得</h2>
	 *
	 * @param classCdList 区分値CDのリスト
	 * @return Map<String, Map<String, String>> センタ区分値マスタ情報のマップ
	 */
	private Map<String, Map<String, String>> getBClassInfo(List<String> classCdList) {

		// 区分値マスタより取得
		if (classCdList == null || classCdList.isEmpty()) {
			return null;
		}

		BClassDtlCB bClassDtlCB = bClassDtlBhv.newConditionBean();
		bClassDtlCB.specify().columnClassDtlCd();
		bClassDtlCB.specify().columnDictId();
		bClassDtlCB.setupSelect_BClass();
		bClassDtlCB.specify().specifyBClass().columnClassCd();
		bClassDtlCB.setupSelect_VDict(getCultureId());
		bClassDtlCB.specify().specifyVDict().columnDictNm();
		bClassDtlCB.query().queryBClass().setClassCd_InScope(classCdList);
		bClassDtlCB.query().queryBClass().addOrderBy_ClassCd_Asc();
		bClassDtlCB.query().addOrderBy_ClassDtlCd_Asc();

		List<BClassDtl> bClassList = bClassDtlBhv.selectList(bClassDtlCB);

		Map<String, Map<String, String>> centerClassMap = new HashMap<String, Map<String, String>>();

		String classCd = "";
		Map<String, String> bClassDtlMap = new HashMap<String, String>();

		for (int i = 0; i < bClassList.size(); i++) {

			BClassDtl bClassDtl = bClassList.get(i);

			if (!classCd.equals(bClassDtl.getBClass().getClassCd())) {

				if (!bClassDtlMap.isEmpty()) {
					centerClassMap.put(classCd, bClassDtlMap);
					bClassDtlMap = new HashMap<String, String>();
				}

				classCd = bClassDtl.getBClass().getClassCd();
			}

			bClassDtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());

			if (i == bClassList.size() - 1) {
				centerClassMap.put(classCd, bClassDtlMap);
			}

		}

		return centerClassMap;

	}

	/**
	 * <h2>区分値CDで区分値明細の情報を取得</h2>
	 *
	 * @param classMap 区分値マスタ情報のマップ
	 * @param classCd 区分値CD
	 * @param classDtlCd 区分値明細CD
	 * @return BClassDtl 区分値明細の情報
	 */
	private BClassDtl getBClassDtl(Map<String, Map<String, String>> classMap, String classCd, String classDtlCd) {

		BClassDtl bClassDtl = new BClassDtl();
		VDict vDict = new VDict();

		if (classMap != null && classMap.containsKey(classCd)) {
			if (classMap.get(classCd).containsKey(classDtlCd)) {
				vDict.setDictNm(classMap.get(classCd).get(classDtlCd));
			}
		}

		bClassDtl.setVDict(vDict);

		return bClassDtl;

	}
}