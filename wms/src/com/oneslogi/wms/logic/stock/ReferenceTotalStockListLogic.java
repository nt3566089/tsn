package com.oneslogi.wms.logic.stock;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.ScalarQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.BUserCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.BUserBhv;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.SelectClientLogic;
import com.oneslogi.wms.logic.common.UserCenterLogic;
import com.oneslogi.wms.logic.master.UserDepositListSelectLogic;

/**
 * トータル在庫問合せ（参照）データ取得ロジッククラス
 */
public class ReferenceTotalStockListLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private MClientCenterBhv mClientCenterBhv;
	@Inject
	private TReceivePlanBBhv receivePlanBBhv;
	@Inject
	private BUserBhv bUserBhv;

	// ===== 使用ロジック =====

	@Inject
	private SelectClientLogic selectClientLogic;
	@Inject
	private UserCenterLogic userCenterLogic;
	@Inject
	private UserDepositListSelectLogic userDepositListSelectLogic;

	/**
	 * <h2>在庫データを取得する。</h2>
	 * <pre>
	 * 引数をキーにトータル在庫問合せデータを取得する。
	 * 対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 * ユーザに付与された権限の範囲での取引先マスタIDで絞り込みを行う。
	 * 商品CD、預託CD、在庫区分CD毎に各センタの合計在庫数を計算し、在庫リストに設定して返す。
	 * </pre>
	 * @param tStock 在庫：荷主ID・預託ID・在庫区分ID・在庫数0非表示・定点切れ
	 * @param mCenter センタマスタ：センタID
	 * @param mProduct 商品マスタ：商品CD・JANCD
	 * @param tLot ロット：期限日(From)・期限日(To)・ロット
	 * @param bUser ユーザマスタ：ユーザID
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<TStock> 在庫リスト
	 */
	public PagingResultBean<TStock> select(TStock tStock,
			MCenter mCenter,
			MProduct mProduct,
			TLot tLot,
			BUser bUser,
			ErrorStatus errSts) throws Exception {

		PagingResultBean<TStock> result = new PagingResultBean<TStock>();

		// ===== ユーザが管理しているセンタリスト・荷主リストを作成 =====

		List<MCenter> userCenterList = userCenterLogic.getCenterList(UserCenterLogic.SelectCls.NO_DELETE_ONLY);
		List<MClient> userClientList = new ArrayList<MClient>();

		final Set<Long> userCenterIdSet = new HashSet<Long>();
		final Set<Long> userClientIdSet = new HashSet<Long>();

		for (MCenter center : userCenterList) {
			userCenterIdSet.add(center.getCenterId());
			// 紐づく荷主リストを取得
			List<MClient> clientList = selectClientLogic.selectClientList(center.getCenterCd());

			for (MClient client : clientList) {
				long clientId = client.getClientId();
				if (!userClientIdSet.contains(clientId)) {
					userClientIdSet.add(clientId);
					userClientList.add(client);
				}
			}
		}

		// ====== システム稼働日を取得 ======

		String systemDt = mClientCenterBhv.scalarSelect(String.class).max(new ScalarQuery<MClientCenterCB>() {
			@Override
			public void query(MClientCenterCB maxCb) {
				maxCb.specify().columnSystemDt();
				maxCb.query().setCenterId_InScope(userCenterIdSet);
				maxCb.query().setClientId_InScope(userClientIdSet);
				maxCb.query().setDelFlg_Equal_$0();
			}
		}).orElse(null);

		// ====== 在庫データ取得 =======
		TStockCB tStockCB = tStockBhv.newMyConditionBean();
		// データ取得テーブル
		tStockCB.setupSelect_MClient();
		tStockCB.setupSelect_MProduct();
		tStockCB.setupSelect_MStockType();
		tStockCB.setupSelect_MStockType().withVDict(getCultureId());
		tStockCB.setupSelect_MCustomer();
		tStockCB.setupSelect_MWarehouse();
		tStockCB.setupSelect_MWarehouse().withMCenter();
		tStockCB.setupSelect_TLot();

		// ======= ユーザマスタデータ取得 =======
		BUserCB bUserCb = bUserBhv.newMyConditionBean();
		bUserCb.query().setUserCd_Equal(bUser.getUserCd());
		BUser user = bUserBhv.selectEntity(bUserCb);

		// ------- 検索条件 -------

		Set<Long> queryCenterIdSet = new HashSet<Long>();
		Set<Long> queryClientIdSet = new HashSet<Long>();
		if (mCenter == null || mCenter.getCenterId() == null) {
			queryCenterIdSet.addAll(userCenterIdSet);
		} else {
			queryCenterIdSet.add(mCenter.getCenterId());
		}

		if (tStock.getClientId() == null) {
			queryClientIdSet.addAll(userClientIdSet);
		} else {
			queryClientIdSet.add(tStock.getClientId());
		}

		// 権限に応じた取引先マスタ取得
		List<MCustomer> mCustomerList = userDepositListSelectLogic.selectByIdCustomerDeposit(user, errSts);
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

		// 取得した取引先マスタIDリストで絞り込みを行う
		tStockCB.query().queryMCustomer().setCustomerId_InScope(customerIdList);

		// センタ
		tStockCB.query().queryMLocation().setCenterId_InScope(queryCenterIdSet);
		// 荷主
		tStockCB.query().queryMProduct().setClientId_InScope(queryClientIdSet);
		// 商品CD
		tStockCB.query().queryMProduct().setProductCd_PrefixSearch(mProduct.getProductCd());
		// [Ver3.0][#4001] 完全一致を前方一致に変更 2018.04.10 shimizu Start
		// JANCD
		tStockCB.query().queryMProduct().setJanCd_LikeSearch(mProduct.getJanCd(), new LikeSearchOption().likePrefix());
		// [Ver3.0][#4001] 完全一致を前方一致に変更 2018.04.10 shimizu End
		// 預託在庫区分
		tStockCB.query().setDepositId_Equal(tStock.getDepositId());
		// 在庫区分
		tStockCB.query().setStockTypeId_Equal(tStock.getStockTypeId());
		// 期限日(From)
		tStockCB.query().queryTLot().setLimitDt_GreaterEqual(tLot.getLimitDtFrom());
		// 期限日(To)
		tStockCB.query().queryTLot().setLimitDt_LessEqual(tLot.getLimitDtTo());
		// ロット
		tStockCB.query().queryTLot().setLot_PrefixSearch(tLot.getLot());
		// 削除フラグ
		tStockCB.query().queryMProduct().setDelFlg_Equal_$0();
		// ------ ソート条件 ------
		// 荷主CD
		tStockCB.query().queryMClient().addOrderBy_ClientCd_Asc();
		// 商品CD
		tStockCB.query().queryMProduct().addOrderBy_ProductCd_Asc();
		// 預託CD
		tStockCB.query().queryMCustomer().addOrderBy_CustomerCd_Asc();
		// 在庫区分CD
		tStockCB.query().queryMStockType().addOrderBy_StockTypeCd_Asc();
		// センタCD
		tStockCB.query().queryMWarehouse().queryMCenter().addOrderBy_CenterCd_Asc();

		// ------ 検索実行 ------
		ListResultBean<TStock> tStockList = selectList(tStockBhv, tStockCB);
		//ListResultBean<TStock> tStockList = selectPage(tStockBhv, tStockCB, paging);

		// レスポンス対策
		String strClientCd = "";
		String strProductCd = "";
		String strCustomerCd = "";
		String strStockTypeCd = "";
		BigDecimal lngStockNum = WCC.ZERO;
		BigDecimal lngExpiredStockNum = WCC.ZERO;
		String dtTemp = null;
		String dt = null;
		int limitNum = 0;
		TStock ts = null ;
		// 取得した在庫データを回す
		for (int i = 0; i < tStockList.size(); i++) {
			lngStockNum = WCC.ZERO;
			lngExpiredStockNum = WCC.ZERO;
			// 以下のブレイク条件毎に集計する。
			if (tStockList.get(i).getMClient().getClientCd().compareTo(strClientCd) != 0
					|| tStockList.get(i).getMProduct().getProductCd().compareTo(strProductCd) != 0
					|| tStockList.get(i).getMCustomer().getCustomerCd().compareTo(strCustomerCd) != 0
					|| tStockList.get(i).getMStockType().getStockTypeCd().compareTo(strStockTypeCd) != 0) {
				if (ts != null) {
					// [#6925][OSS] 在庫数 0非表示の検索条件が機能していない 2019.12.04 kawana Start
					// 検索条件により追加「しない」在庫を判
					boolean doAdd = true;

					// 在庫数 0非表示
					if (CDef.StockNum0Display.$1.code().equals(tStock.getStockNumDisplay())) {
						if (WCC.isZeroOrLess(ts.getStockNum()) && WCC.isZeroOrLess(ts.getExpiredStockNum())) {
							// 総在庫数、期限切れ在庫数 0
							doAdd = false;
						}
					}

					// 定点切れのみ表示 (定点超え 非表示)
					if (CDef.FixedPoint.$0.code().equals(tStock.getFixedPointDisplay())) {
						if (ts.getMProduct().getFixedPoint() == null || WCC.isLessEqual(ts.getMProduct().getFixedPoint(), ts.getStockNum())) {
							// 定点未設定 または (定点 <= 在庫数) は追加「しない」
							doAdd = false;
						}
					}

					if (doAdd) {
						result.add(ts);
					}
					// [#6925][OSS] 在庫数 0非表示の検索条件が機能していない 2019.12.04 kawana End
				}
				ts = tStockList.get(i);
				List<MCenter> copyUserCenterList = new ArrayList<MCenter>();
				for (MCenter mc : userCenterList) {
					copyUserCenterList.add(mc.clone());
				}
				ts.setMCenterList(copyUserCenterList);
			}
			// ユーザセンタを横に展開
			for (MCenter mc : ts.getMCenterList()) {
				if (mc.getCenterCd().equals(tStockList.get(i).getMWarehouse().getMCenter().getCenterCd())) {
					if (mc.getStockNum() == null) {
						mc.setStockNum(WCC.ZERO);
					}
					if (mc.getExpiredStockNum() == null) {
						mc.setExpiredStockNum(WCC.ZERO);
					}

					// 在庫数と期限切れ在庫数の算出
					if (CDef.LimitDtManagFlg.$0.code().equals(tStockList.get(i).getMProduct().getLimitDtManagFlg())) {
						lngStockNum = WCC.add(tStockList.get(i).getChargeNum(),
								tStockList.get(i).getAllocNum(),
								tStockList.get(i).getMoveNum(),
								tStockList.get(i).getTransitNum());

						lngExpiredStockNum = WCC.ZERO;
					} else {
						dtTemp = systemDt.substring(0, 4) + "/" + systemDt.substring(4, 6) + "/" + systemDt.substring(6, 8);
						if (tStockList.get(i).getMProduct().getShippingLimitNum() == null) {
							limitNum = 0;
						} else {
							limitNum = tStockList.get(i).getMProduct().getShippingLimitNum().intValue();
						}

						SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
						Date date = sdf.parse(dtTemp);
						Calendar cl = Calendar.getInstance();
						cl.setTime(date);
						cl.add(Calendar.DAY_OF_MONTH, limitNum);
						dt = sdf.format(cl.getTime());
						dt = dt.replace("/", "");

						// 期限日
						String limitDt = tStockList.get(i).getTLot().getLimitDt();

						// [ver3.0][#3726] 期限日管理商品で期限日がnullの場合致命的エラー発生 2018.02.19 matsumoto Start
						if (limitDt == null) {
							lngStockNum = WCC.add(tStockList.get(i).getChargeNum(),
									tStockList.get(i).getAllocNum(),
									tStockList.get(i).getMoveNum(),
									tStockList.get(i).getTransitNum());
							lngExpiredStockNum = WCC.ZERO;
						// [ver3.0][#3726] 期限日管理商品で期限日がnullの場合致命的エラー発生 2018.02.19 matsumoto End
						} else if (dt.compareTo(limitDt) > 0) {
							lngStockNum = WCC.ZERO;
							lngExpiredStockNum = WCC.add(tStockList.get(i).getChargeNum(),
									tStockList.get(i).getAllocNum(),
									tStockList.get(i).getMoveNum(),
									tStockList.get(i).getTransitNum());

						} else {
							lngStockNum = WCC.add(tStockList.get(i).getChargeNum(),
									tStockList.get(i).getAllocNum(),
									tStockList.get(i).getMoveNum(),
									tStockList.get(i).getTransitNum());
							lngExpiredStockNum = WCC.ZERO;
						}
					}

					mc.setStockNum(WCC.add(mc.getStockNum(), lngStockNum));
					mc.setExpiredStockNum(WCC.add(mc.getExpiredStockNum(), lngExpiredStockNum));

					break;
				}
			}

			if (ts.getStockNum() == null) {
				ts.setStockNum(WCC.ZERO);
			}
			if (ts.getExpiredStockNum() == null) {
				ts.setExpiredStockNum(WCC.ZERO);
			}
			ts.setStockNum(WCC.add(ts.getStockNum(), lngStockNum));
			ts.setExpiredStockNum(WCC.add(ts.getExpiredStockNum(), lngExpiredStockNum));

			strClientCd = tStockList.get(i).getMClient().getClientCd();
			strProductCd = tStockList.get(i).getMProduct().getProductCd();
			strCustomerCd = tStockList.get(i).getMCustomer().getCustomerCd();
			strStockTypeCd = tStockList.get(i).getMStockType().getStockTypeCd();
		}
		if (ts != null) {
			// [#6925][OSS] 在庫数 0非表示の検索条件が機能していない 2019.12.04 kawana Start
			// 検索条件により追加「しない」在庫を判
			boolean doAdd = true;

			// 在庫数 0非表示
			if (CDef.StockNum0Display.$1.code().equals(tStock.getStockNumDisplay())) {
				if (WCC.isZeroOrLess(ts.getStockNum()) && WCC.isZeroOrLess(ts.getExpiredStockNum())) {
					// 総在庫数、期限切れ在庫数 0
					doAdd = false;
				}
			}

			// 定点切れのみ表示 (定点超え 非表示)
			if (CDef.FixedPoint.$0.code().equals(tStock.getFixedPointDisplay())) {
				if (ts.getMProduct().getFixedPoint() == null || WCC.isLessEqual(ts.getMProduct().getFixedPoint(), ts.getStockNum())) {
					// 定点未設定 または (定点 <= 在庫数) は追加「しない」
					doAdd = false;
				}
			}

			if (doAdd) {
				result.add(ts);
			}
			// [#6925][OSS] 在庫数 0非表示の検索条件が機能していない 2019.12.04 kawana End
		}

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 入荷予定数、予定日を設定
		setCalculateData(result, userCenterIdSet, userClientIdSet, systemDt);

		return result;
	}

	/**
	 * <h2>入荷予定数と予定日を取得する。</h2>
	 * <pre>
	 * システム管理日付より後、入荷ステータスが未入荷、入荷中の入荷予定数を商品、預託、在庫区分ごとに合算する。
	 * </pre>
	 * @param stockList 在庫リスト：預託ID・在庫区分ID・商品ID
	 * @param userCenterIdSet ユーザ管理対象のセンタIDのセット
	 * @param userClientIdSet ユーザ管理対象の荷主IDのセット
	 * @param systemDt システム管理日付
	 * @throws Exception 例外処理
	 */
	private void setCalculateData(List<TStock> stockList, Set<Long> userCenterIdSet, Set<Long> userClientIdSet, String systemDt) throws Exception {

		// ====== 在庫区分リスト件数分繰返し ======
		for (TStock tStock : stockList) {
			// 入荷予定数と入荷予定日取得
			selectPlanSummary(tStock, userCenterIdSet, userClientIdSet, systemDt);

			if (tStock.chaseMProduct().getFixedPoint() == null) {
				MProduct mp = tStock.chaseMProduct();
				mp.setFixedPoint(WCC.ZERO);
				tStock.setMProduct(mp);
			}
		}
	}

	/**
	 * システム管理日付より後の入荷予定数を商品、預託、在庫区分ごとに合算する
	 */
	private void selectPlanSummary(TStock tStock, Set<Long> centerIdSet, Set<Long> clientIdSet, String systemDt) throws Exception {

		TReceivePlanBCB cb = receivePlanBBhv.newMyConditionBean();
		// ====== データ取得テーブル ======
		cb.setupSelect_TReceivePlanH();

		// ====== 検索条件 ======

		// センタID
		cb.query().queryTReceivePlanH().setCenterId_InScope(centerIdSet);
		// 荷主ID
		cb.query().queryTReceivePlanH().setClientId_InScope(clientIdSet);
		// 入荷予定日
		cb.query().queryTReceivePlanH().setReceivePlanDt_GreaterThan(systemDt);
		// 預託ID
		cb.query().queryTReceivePlanH().setPlanDepositId_Equal(tStock.getDepositId());
		// 在庫区分ID
		cb.query().queryTReceivePlanH().setStockTypeId_Equal(tStock.getStockTypeId());
		// 商品ID
		cb.query().setProductId_Equal(tStock.getProductId());
		// 入荷ステータス(入荷予定ボディ)
		cb.query().setReceiveStatus_Equal_$01();

		// 入荷ステータス(入荷予定ヘッダ)
		cb.orScopeQuery(new OrQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB orCb) {
				orCb.query().queryTReceivePlanH().setReceiveStatus_Equal_$01();
				orCb.query().queryTReceivePlanH().setReceiveStatus_Equal_$02();
			}
		});

		// ====== ソート順 ======
		cb.query().queryTReceivePlanH().addOrderBy_ReceivePlanDt_Asc();

		// 検索実行
		List<TReceivePlanB> selectList = receivePlanBBhv.selectList(cb);
		if (selectList.size() == 0) {
			return;
		}

		BigDecimal planNum = WCC.ZERO;
		String planDt = null;

		// ====== 検索件数分繰返し =====
		for (TReceivePlanB planB : selectList) {
			if (CU.isNullOrEmpty(planDt)) {
				planDt = planB.chaseTReceivePlanH().getReceivePlanDt();
				planNum = planB.getPlanNum();
				continue;
			}

			// 入荷予定数がゼロの場合、次のループを続け
			BigDecimal tmpPlanNum = planB.getPlanNum();
			if (tmpPlanNum == null || WCC.isZero(tmpPlanNum)) {
				continue;
			}

			// 直近予定日と直近予定数取得
			String tmpPlanDt = planB.chaseTReceivePlanH().getReceivePlanDt();
			if (CU.equals(planDt, tmpPlanDt)) {
				planNum = WCC.add(planNum, planB.getPlanNum());
			} else {
				if (WCC.isPositive(planNum)) {
					break;
				} else {
					planDt = planB.chaseTReceivePlanH().getReceivePlanDt();
				}
			}
		}

		tStock.setReceivePlanDt(planDt);
		tStock.setReceivePlanNum(planNum);
	}
}
