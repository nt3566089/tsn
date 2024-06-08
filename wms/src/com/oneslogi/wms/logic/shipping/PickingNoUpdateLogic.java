package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPicMthdRcmdDataCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdDataBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmdData;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.WmsCoreNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;

/**
 * ピッキングリスト番号設定ロジック
 */
public class PickingNoUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TPickingBBhv tPickingBBhv;
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [#5105][v3.1] ピッキングリスト発行処理追加 2018.10.18 kawana Start
	@Inject
	private TPicMthdRcmdDataBhv tPicMthdRcmdDataBhv;
	// [#5105][v3.1] ピッキングリスト発行処理追加 2018.10.18 kawana End

	// ===== 使用ロジック =====

	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private PickingListBucketCalculateLogic bucketCalculateLogic;

	// ===== 列挙型 =====

	/**
	 * ピッキングリスト種別
	 */
	private enum ListType {
		ORDER,
		TOTAL,
		MULTI
	}

	/**
	 * <h2>オーダーピッキングリスト関連採番.</h2>
	 * <pre>
	 * オーダーピッキングリストで使用する下記を採番して
	 * DBに設定する。
	 * ・出庫ヘッダ.ピッキンググループNo.
	 * </pre>
	 *
	 * @param tPickingR 出庫帳票:コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateNoOrderPickingList(TPickingR tPickingR, ErrorStatus errSts) {

		// 他ピッキングリストの出力チェック
		checkOtherListOut(tPickingR, ListType.ORDER, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// 対象を検索
		TPickingHCB cb = tPickingHBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstH();
		cb.checkInvalidQuery();
		cb.query().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		cb.query().setPickingGroupNo_IsNull();

		List<TPickingH> pickingHList = tPickingHBhv.selectList(cb);
		if (pickingHList.isEmpty()) {
			// 全てピッキンググループNo.が設定されている
			return;
		}

		// ピッキンググループNo.設定
		setPickingGroupNo(pickingHList);

		// DB更新
		tPickingHBhv.batchUpdate(pickingHList);
	}

	/**
	 * <h2>トータルピッキングリスト関連採番.</h2>
	 * <pre>
	 * トータルピッキングリストで使用する下記を採番して
	 * DBに設定する。
	 * ・出庫ヘッダ.ピッキンググループNo.
	 * ・出庫ボディ.仮置きNo.
	 * ・梱包ヘッダ.種蒔きNo.
	 * </pre>
	 *
	 * @param tPickingR 出庫帳票:コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateNoTotalPickingList(TPickingR tPickingR, ErrorStatus errSts) {

		// 他ピッキングリストの出力チェック
		checkOtherListOut(tPickingR, ListType.TOTAL, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// 対象を検索
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.setupSelect_TPickingB().withTPickingH().withTAllocInstH();
		cb.setupSelect_TPickingB().withTStock().withMLocation().withMZone();
		cb.setupSelect_TPickingB().withTStock().withMProduct();
		cb.setupSelect_TPickingB().withTStock().withTLot();
		cb.setupSelect_TPickingB().withTStock().withTStoreNo();
		cb.setupSelect_TPackingH().withTAllocInstH().withMCenterCustomerBySupplyCustomerId();
		cb.setupSelect_TPackingH().withTAllocInstH().withMCenterCustomerByDelivCustomerId();
		cb.checkInvalidQuery();
		cb.query().queryTPickingB().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		cb.query().queryTPickingB().queryTPickingH().setPickingGroupNo_IsNull();
		cb.query().queryTPackingH().setMixedFlg_Equal_$1();

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);
		if (packingBList.isEmpty()) {
			// 全てピッキンググループNo.が設定されている
			return;
		}

		List<TPickingB> pickingBList = tPackingBBhv.pulloutTPickingB(packingBList);
		List<TPickingH> pickingHList = tPickingBBhv.pulloutTPickingH(pickingBList);
		List<TPackingH> packingHList = tPackingBBhv.pulloutTPackingH(packingBList);

		// ピッキンググループNo.設定
		setPickingGroupNo(pickingHList);

		// 仮置きNo.設定
		setTempNoWithSort(pickingBList);

		// 種蒔きNo.設定
		setSeedingNoWithSort(packingHList);

		// DB更新
		tPickingHBhv.batchUpdate(pickingHList);
		tPickingBBhv.batchUpdate(pickingBList);
		tPackingHBhv.batchUpdate(packingHList);
	}

	/**
	 * <h2>ケースピッキングリスト関連採番.</h2>
	 * <pre>
	 * ケースピッキングリストで使用する下記を採番して
	 * DBに設定する。
	 * ・梱包ボディ.ケースピッキングNo.
	 * </pre>
	 *
	 * @param tPickingR 出庫帳票:コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateNoCasePickingList(TPickingR tPickingR, ErrorStatus errSts) {

		// 対象を検索
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.setupSelect_TPickingB().withTPickingH().withTAllocInstH();
		cb.setupSelect_TPickingB().withTStock().withMLocation();
		cb.checkInvalidQuery();
		cb.query().queryTPickingB().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		cb.query().setCasePickingNo_IsNull();
		cb.query().queryTPackingH().setMixedFlg_Equal_$0();

		cb.query().queryTPackingH().addOrderBy_ShippingPackingNo_Asc();
		cb.query().addOrderBy_PackingBId_Asc();

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);
		if (packingBList.isEmpty()) {
			// 全てピッキンググループNo.が設定されている
			return;
		}

		// ケースピッキングNo.設定
		setCasePickingNo(packingBList);

		// DB更新
		tPackingBBhv.batchUpdate(packingBList);
	}

	/**
	 * <h2>マルチピッキングリスト関連採番.</h2>
	 * <pre>
	 * マルチピッキングリストで使用する下記を採番して
	 * DBに設定する。
	 * ・出庫ヘッダ.ピッキンググループNo.
	 * ・梱包ヘッダ.マルチピック計算フラグ
	 * ・梱包ヘッダ.カートNo.
	 * ・梱包ヘッダ.バケット列No.
	 * ・梱包ヘッダ.バケット段No.
	 * </pre>
	 *
	 * @param tPickingR 出庫帳票:コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateNoMultiPickingList(TPickingR tPickingR, ErrorStatus errSts) {

		// 他ピッキングリストの出力チェック
		checkOtherListOut(tPickingR, ListType.MULTI, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// 対象を検索
		TPickingHCB cb = tPickingHBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstH();
		cb.checkInvalidQuery();
		cb.query().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		cb.query().setPickingGroupNo_IsNull();

		List<TPickingH> pickingHList = tPickingHBhv.selectList(cb);
		if (pickingHList.isEmpty()) {
			// 全てピッキンググループNo.が設定されている
			return;
		}

		// マルチピック計算実行
		bucketCalculateLogic.updateBucket(tPickingR, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ピッキンググループNo.設定
		setPickingGroupNo(pickingHList);

		// DB更新
		tPickingHBhv.batchUpdate(pickingHList);
	}

	// [#5105][v3.1] ピッキングリスト発行処理追加 2018.10.18 kawana Start
	/**
	 * <h2>ピッキング提案時のマルチピッキングリスト関連採番.</h2>
	 * <pre>
	 * ピッキング提案時にマルチピッキングリストで使用する下記を採番して
	 * DBに設定する。
	 * ・出庫ヘッダ.ピッキンググループNo.
	 * ・梱包ヘッダ.マルチピック計算フラグ
	 * ・梱包ヘッダ.カートNo.
	 * ・梱包ヘッダ.バケット列No.
	 * ・梱包ヘッダ.バケット段No.
	 * </pre>
	 *
	 * @param tPicMthdRcmdId ピッキング提案ID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateNoRecommendedMultiPickingList(long tPicMthdRcmdId, ErrorStatus errSts) {

		// 対象を検索

		TPicMthdRcmdDataCB cb = tPicMthdRcmdDataBhv.newConditionBean();
		cb.setupSelect_TPickingH().withTAllocInstH();
		cb.query().setPicMthdRcmdId_Equal(tPicMthdRcmdId);

		// 検索実行
		List<TPicMthdRcmdData> tPicMthdRcmdDataList = tPicMthdRcmdDataBhv.selectList(cb);

		List<TPickingH> pickingHList = tPicMthdRcmdDataBhv.pulloutTPickingH(tPicMthdRcmdDataList);

		// ピッキンググループNo.設定
		setPickingGroupNo(pickingHList);

		// DB更新
		tPickingHBhv.batchUpdate(pickingHList);

		// マルチピック計算実行
		bucketCalculateLogic.updateRecommendedBucket(tPicMthdRcmdId, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
	}

	// [#5105][v3.1] ピッキングリスト発行処理追加 2018.10.18 kawana End

	/**
	 * ピッキンググループNo.設定
	 */
	private void setPickingGroupNo(List<TPickingH> pickingHList) {

		// ピッキンググループNoマップ(キー：作業日)
		Map<String, String> pickingGroupNoMap = new HashMap<String, String>();

		for (TPickingH pickingH : pickingHList) {

			// 作業日
			String workDt = pickingH.getTAllocInstH().getWorkDt();

			String pickingGroupNo;
			if (pickingGroupNoMap.containsKey(workDt)) {
				pickingGroupNo = pickingGroupNoMap.get(workDt);
			} else {
				// ケースピッキングNo採番
				pickingGroupNo = numberingLogic.getNumbering(pickingH.getCenterId(), WmsCoreNumberingConst.PICKING_GROUP_NO);
				pickingGroupNoMap.put(workDt, pickingGroupNo);
			}

			pickingH.setPickingGroupNo(pickingGroupNo);
		}
	}

	/**
	 * 仮置きNo.の設定(出庫ボディのソート込)
	 */
	private void setTempNoWithSort(List<TPickingB> pickingBList) {

		// 仮置きNo.の設定順にソートする
		Collections.sort(pickingBList, new Comparator<TPickingB>() {
			@Override
			public int compare(TPickingB o1, TPickingB o2) {

				TStock stock1 = o1.getTStock();
				TStock stock2 = o2.getTStock();

				// [1.1.4-CT-045] 仮置きNoのソート順を変更 2016.05.19 kawana Start
				int diff;
				BigDecimal diffLong;

				// 作業日(昇順)
				String workDt1 = o1.getTPickingH().getTAllocInstH().getWorkDt();
				String workDt2 = o2.getTPickingH().getTAllocInstH().getWorkDt();
				diff = workDt1.compareTo(workDt2);
				if (diff != 0) {
					return diff;
				}

				// ゾーン ピッキング順序 昇順
				long pickingOrderZone1 = nullToMax(stock1.getMLocation().getMZone().getPickingOrder());
				long pickingOrderZone2 = nullToMax(stock2.getMLocation().getMZone().getPickingOrder());
				diffLong = WCC.subtract(pickingOrderZone1, pickingOrderZone2);
				if (WCC.isNegative(diffLong)) {
					return -1;
				} else if (WCC.isPositive(diffLong)) {
					return 1;
				}

				// ゾーンCD 昇順
				String zoneCd1 = CU.nullToStr(stock1.getMLocation().getMZone().getZoneCd());
				String zoneCd2 = CU.nullToStr(stock2.getMLocation().getMZone().getZoneCd());
				diff = zoneCd1.compareTo(zoneCd2);
				if (diff != 0) {
					return diff;
				}

				// ロケーション ピッキング順序 昇順
				long pickingOrder1 = nullToMax(stock1.getMLocation().getPickingOrder());
				long pickingOrder2 = nullToMax(stock2.getMLocation().getPickingOrder());
				diffLong = WCC.subtract(pickingOrder1, pickingOrder2);
				if (WCC.isNegative(diffLong)) {
					return -1;
				} else if (WCC.isPositive(diffLong)) {
					return 1;
				}

				// ロケーションCD 昇順
				String locationCd1 = stock1.getMLocation().getLocationCd();
				String locationCd2 = stock2.getMLocation().getLocationCd();
				diff = locationCd1.compareTo(locationCd2);
				if (diff != 0) {
					return diff;
				}

				// 商品CD 昇順
				String product1 = stock1.getMProduct().getProductCd();
				String product2 = stock2.getMProduct().getProductCd();
				diff = product1.compareTo(product2);
				if (diff != 0) {
					return diff;
				}

				// 期限日 昇順
				String limitDt1 = CU.nullToStr(stock1.getTLot().getLimitDt());
				String limitDt2 = CU.nullToStr(stock2.getTLot().getLimitDt());
				diff = limitDt1.compareTo(limitDt2);
				if (diff != 0) {
					return diff;
				}

				// ロット 昇順
				String lot1 = CU.nullToStr(stock1.getTLot().getLot());
				String lot2 = CU.nullToStr(stock2.getTLot().getLot());
				diff = lot1.compareTo(lot2);
				if (diff != 0) {
					return diff;
				}

				// 入庫ラベルNo. 昇順
				String storeLabel1 = stock1.getTStoreNo().getStoreLabelNo();
				String storeLabel2 = stock2.getTStoreNo().getStoreLabelNo();
				diff = storeLabel1.compareTo(storeLabel2);
				if (diff != 0) {
					return diff;
				}

				// [1.1.4-CT-045] 仮置きNoのソート順を変更 2016.05.19 kawana End

				return 0;
			}
		});

		String workDt = "";
		int tmpNo = 1; // 変数仮置きNo.
		TPickingB oldPickingB = null;
		for (TPickingB pickingB : pickingBList) {

			if (!workDt.equals(pickingB.getTPickingH().getTAllocInstH().getWorkDt())) {
				// 作業日違い

				tmpNo = 1;
			}

			if (oldPickingB != null) {

				if (oldPickingB.getStockId().longValue() != pickingB.getStockId().longValue()) {
					// 別在庫
					tmpNo++;
				}
			}

			// 仮置きNo.(4桁)を設定
			String tmpNoStr = "0000" + String.valueOf(tmpNo);
			tmpNoStr = tmpNoStr.substring(tmpNoStr.length() - 4);
			pickingB.setTempNo(tmpNoStr);

			oldPickingB = pickingB;
			workDt = pickingB.getTPickingH().getTAllocInstH().getWorkDt();
		}
	}

	/**
	 * 種蒔きNo.設定
	 */
	private void setSeedingNoWithSort(List<TPackingH> packingHList) {

		// 対象データを配送コースID、配送順にソート
		Collections.sort(packingHList, new Comparator<TPackingH>() {

			@Override
			public int compare(TPackingH o1, TPackingH o2) {

				// 作業日(昇順)
				String workDt1 = o1.getTAllocInstH().getWorkDt();
				String workDt2 = o2.getTAllocInstH().getWorkDt();
				int diff = workDt1.compareTo(workDt2);
				if (diff != 0) {
					return diff;
				}

				// 配送コースID昇順
				long deliveryCourseId1 = nullToMax(o1.getTAllocInstH().getDeliveryCourseId());
				long deliveryCourseId2 = nullToMax(o2.getTAllocInstH().getDeliveryCourseId());
				long diffLong = deliveryCourseId1 - deliveryCourseId2;

				if (diffLong < 0) {
					return -1;
				} else if (0 < diffLong) {
					return 1;
				}

				// 配送順昇順(届先)
				long delivOrder1 = nullToMax(o1.getTAllocInstH().chaseMCenterCustomerByDelivCustomerId().getDeliveryOrder());
				long delivOrder2 = nullToMax(o2.getTAllocInstH().chaseMCenterCustomerByDelivCustomerId().getDeliveryOrder());

				diffLong = delivOrder1 - delivOrder2;

				if (diffLong < 0) {
					return -1;
				} else if (0 < diffLong) {
					return 1;
				}

				// 配送順昇順(納品先)
				long supplyOrder1 = nullToMax(o1.getTAllocInstH().chaseMCenterCustomerBySupplyCustomerId().getDeliveryOrder());
				long supplyOrder2 = nullToMax(o2.getTAllocInstH().chaseMCenterCustomerBySupplyCustomerId().getDeliveryOrder());

				diffLong = supplyOrder1 - supplyOrder2;

				if (diffLong < 0) {
					return -1;
				} else if (0 < diffLong) {
					return 1;
				}

				// [#2732] 同じデータで出庫指示してもDBデータの順番が異なる問題を修正(PlutoのDB比較用) 2017.12.18 kawana Start
				// 出庫ヘッダID
				long pickingHId1 = o1.getPickingHId();
				long pickingHId2 = o2.getPickingHId();

				diffLong = pickingHId1 - pickingHId2;

				if (diffLong < 0) {
					return -1;
				} else if (0 < diffLong) {
					return 1;
				}

				// 梱包ヘッダID
				return o1.getPackingHId().compareTo(o2.getPackingHId());
				// [#2732] 同じデータで出庫指示してもDBデータの順番が異なる問題を修正(PlutoのDB比較用) 2017.12.18 kawana End
			}
		});

		// 種蒔きNoを設定
		String workDt = "";
		int seedNo = 1;
		for (TPackingH packingH : packingHList) {

			if (!workDt.equals(packingH.getTAllocInstH().getWorkDt())) {
				// 作業日違い

				seedNo = 1;
			}

			String seedNoStr = "0000000000" + seedNo;
			seedNoStr = seedNoStr.substring(seedNoStr.length() - 10);
			packingH.setSeedingNo(seedNoStr);

			seedNo++;
			workDt = packingH.getTAllocInstH().getWorkDt();
		}
	}

	/**
	 * <h2>ケースピッキングNoの設定.</h2>
	 */
	private void setCasePickingNo(List<TPackingB> packingBList) {

		Map<CasePickingNoKey, String> casePickingNoMap = new HashMap<CasePickingNoKey, String>();

		for (TPackingB packingB : packingBList) {

			// ケース梱包
			TPickingB pickingB = packingB.getTPickingB();

			// ケースピッキングNo
			CasePickingNoKey casePickingNoKey = new CasePickingNoKey(pickingB.getTStock().getMLocation().getZoneId(), pickingB.getTPickingH().getTAllocInstH().getWorkDt());

			String casePickingNo;
			if (casePickingNoMap.containsKey(casePickingNoKey)) {
				casePickingNo = casePickingNoMap.get(casePickingNoKey);
			} else {
				// ケースピッキングNo採番
				casePickingNo = numberingLogic.getNumbering(pickingB.getTPickingH().getCenterId(), WmsCoreNumberingConst.CASE_PICKING_NO);
				casePickingNoMap.put(casePickingNoKey, casePickingNo);
			}

			packingB.setCasePickingNo(casePickingNo);
		}
	}

	/**
	 * ケースピッキングNo.キークラス
	 *
	 * 下記をキーとする
	 * ・ゾーン
	 * ・作業日
	 */
	static class CasePickingNoKey {

		private long zoneId;
		private String workDt;

		public CasePickingNoKey(long zoneId, String workDt) {
			this.zoneId = zoneId;
			this.workDt = workDt;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((workDt == null) ? 0 : workDt.hashCode());
			result = prime * result + (int) (zoneId ^ (zoneId >>> 32));
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
			CasePickingNoKey other = (CasePickingNoKey) obj;
			if (workDt == null) {
				if (other.workDt != null)
					return false;
			} else if (!workDt.equals(other.workDt))
				return false;
			if (zoneId != other.zoneId)
				return false;
			return true;
		}
	}

	/**
	 * 引数がnullの場合はmax値を返す
	 * @param value
	 * @return valueまたはLong側の最大値
	 */
	private long nullToMax(Long value) {
		if (value == null) {
			return Long.MAX_VALUE;
		} else {
			return value.longValue();
		}
	}

	/**
	 * 対象以外のピッキングリストを発行していないかをチェック
	 */
	private void checkOtherListOut(TPickingR tPickingR, ListType type, ErrorStatus errSts) {

		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();

		cb.query().setControlNo_Equal(tPickingR.getControlNo());

		// 対象以外のリスト出力フラグが1を条件にする
		switch (type) {
		case ORDER:
			cb.orScopeQuery(new OrQuery<TPickingRCB>() {
				@Override
				public void query(TPickingRCB orCb) {
					orCb.query().setTplOutFlg_Equal_$1();
					orCb.query().setMltOutFlg_Equal_$1();
					orCb.query().setSplOutFlg_Equal_$1();
				}
			});
			break;
		case TOTAL:
			cb.orScopeQuery(new OrQuery<TPickingRCB>() {
				@Override
				public void query(TPickingRCB orCb) {
					orCb.query().setOplOutFlg_Equal_$1();
					orCb.query().setMltOutFlg_Equal_$1();
					orCb.query().setSplOutFlg_Equal_$1();
				}
			});
			break;
		case MULTI:
			cb.orScopeQuery(new OrQuery<TPickingRCB>() {
				@Override
				public void query(TPickingRCB orCb) {
					orCb.query().setOplOutFlg_Equal_$1();
					orCb.query().setTplOutFlg_Equal_$1();
					orCb.query().setSplOutFlg_Equal_$1();
				}
			});
			break;
		}

		int count = tPickingRBhv.selectCount(cb);

		if (0 < count) {
			// 対象以外のピッキングリストの出力あり

			getErrorManager().add(errSts, WmsMessageConst.PICKING_LIST_CANNOT_PRINT_EXISTS_OTHER_LIST_PRINT_ERROR);
			return;
		}
	}
}