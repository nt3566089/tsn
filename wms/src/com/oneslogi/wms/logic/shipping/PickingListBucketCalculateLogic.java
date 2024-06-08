package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPicMthdRcmdCartCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdCartBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmdCart;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ParamLogic;

/**
 * バケット割付処理ロジッククラス
 */
public class PickingListBucketCalculateLogic extends AbstractWmsLogic {

	// [#5131][v3.1] ピッキングリストの採番を発行時に変更(wmscore.jar(BucketCalculateLogicクラス)を移動) 2018.08.22 kawana

	// ===== 使用テーブル =====

	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [#5105][v3.1] ピッキング提案からのピッキングリスト発行処理追加 2018.10.18 kawana Start
	@Inject
	private TPicMthdRcmdCartBhv tPicMthdRcmdCartBhv;
	// [#5105][v3.1] ピッキング提案からのピッキングリスト発行処理追加 2018.10.18 kawana End

	// ===== 使用ロジッククラス =====

	@Inject
	private ParamLogic paramLogic;

	/**
	 * <h2>バケット割付処理を行う。</h2>
	 * <pre>
	 * バケット割付処理を行う。
	 *
	 * 引数のコントロールNoを検索条件に梱包ボディを検索し、
	 * 対象データがない場合は処理を終了する。
	 *
	 * 作業日、配送コース毎に、バケット計算 & 梱包ヘッダ更新を行う。
	 *
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateBucket(TPickingR tPickingR, ErrorStatus errSts) {

		// [#5131][v3.1] ピッキングリストの採番を発行時に変更 2018.08.22 kawana Start

		// レスポンス対策 2016.01.27 kawana Start

		// ===== 対象の梱包ボディを検索 =====

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		// 結合
		// [1.1.4-CT-079] バケット計算を変更 2016.06.13 kawana Start
		cb.setupSelect_TPackingH().withTPickingH().withTAllocInstH();
		// [1.1.4-CT-079] バケット計算を変更 2016.06.13 kawana End

		// 検索条件：コントロールNo
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		cb.query().queryTPackingH().queryTPickingH().setPickingGroupNo_IsNull();
		cb.query().queryTPackingH().setMixedFlg_Equal_$1();

		// [1.1.4-CT-079] バケット計算を変更 2016.06.13 kawana Start
		// ソート条件 : 作業日 > 配送コースCD
		cb.query().queryTPackingH().queryTPickingH().queryTAllocInstH().addOrderBy_WorkDt_Asc();
		cb.query().queryTPackingH().queryTPickingH().queryTAllocInstH().queryMDeliveryCourse().addOrderBy_DeliveryCourseCd_Asc().withNullsLast();
		// [1.1.4-CT-079] バケット計算を変更 2016.06.13 kawana End

		// 検索実行
		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);
		if (packingBList.size() == 0) {
			// 対象データなし
			return;
		}

		// [1.1.4-CT-079] バケット計算を変更 2016.06.13 kawana Start

		// ===== 配送コース毎にバケット割付 =====

		MParam param = getMParam(packingBList.get(0).getTPackingH());

		String oldWorkDt = CU.nullToStr(packingBList.get(0).getTPackingH().getTPickingH().getTAllocInstH().getWorkDt());
		long oldDeliveryCourseId = packingBList.get(0).getTPackingH().getTPickingH().getTAllocInstH().getDeliveryCourseId();

		List<TPackingB> list = new ArrayList<TPackingB>();
		long currentCartNo = 0;

		for (TPackingB packingBody : packingBList) {

			String workDt = CU.nullToStr(packingBody.getTPackingH().getTPickingH().getTAllocInstH().getWorkDt());
			long deliveryCourseId = packingBody.getTPackingH().getTPickingH().getTAllocInstH().getDeliveryCourseId();

			if (!oldWorkDt.equals(workDt)) {
				// 作業日が異なる

				// ===== バケット計算 =====
				calcAndUpdateBucketNo(list, param, currentCartNo);
				// 梱包ボディリストをクリア
				list = new ArrayList<TPackingB>();
				// カート番号をリセット
				currentCartNo = 0;

			} else if (oldDeliveryCourseId != deliveryCourseId) {
				// 配送コースが異なる

				// ===== バケット計算 =====
				currentCartNo = calcAndUpdateBucketNo(list, param, currentCartNo);
				// 梱包ボディリストをクリア
				list = new ArrayList<TPackingB>();
			}

			list.add(packingBody);
			oldWorkDt = workDt;
			oldDeliveryCourseId = deliveryCourseId;
		}

		// ===== バケット計算 =====
		calcAndUpdateBucketNo(list, param, currentCartNo);

		// [1.1.4-CT-079] バケット計算を変更 2016.06.13 kawana End

		// [#5131][v3.1] ピッキングリストの採番を発行時に変更 2018.08.22 kawana End
	}

	// [#5105][v3.1] ピッキング提案からのピッキングリスト発行処理追加 2018.10.18 kawana Start

	/**
	 * <h2>バケット割付処理を行う。</h2>
	 * <pre>
	 * バケット割付処理を行う。
	 *
	 * 引数のコントロールNoを検索条件に梱包ボディを検索し、
	 * 対象データがない場合は処理を終了する。
	 *
	 * 作業日、配送コース毎に、バケット計算 & 梱包ヘッダ更新を行う。
	 *
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateRecommendedBucket(long tPicMthdRcmdId, ErrorStatus errSts) {

		// ===== 対象のピッキング提案台車を検索 =====

		// 検索対象テーブル
		TPicMthdRcmdCartCB cb = tPicMthdRcmdCartBhv.newConditionBean();
		cb.setupSelect_TPackingH().withTPickingH().withTAllocInstH();
		cb.query().setPicMthdRcmdId_Equal(tPicMthdRcmdId);

		// 結合
		cb.setupSelect_TPackingH();

		// ソート条件 : カートNo. > 配送コースCD > 出庫作業No. > 出荷梱包No.
		cb.query().addOrderBy_CartNo_Asc();
		cb.query().queryTPackingH().queryTPickingH().queryTAllocInstH().queryMDeliveryCourse().addOrderBy_DeliveryCourseCd_Asc().withNullsLast();
		cb.query().queryTPackingH().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		cb.query().queryTPackingH().addOrderBy_ShippingPackingNo_Asc();

		// 検索実行
		List<TPicMthdRcmdCart> tPicMthdRcmdCartList = tPicMthdRcmdCartBhv.selectList(cb);
		if (tPicMthdRcmdCartList.isEmpty()) {
			return;
		}

		// ===== バケット割付 =====

		MParam param = getMParam(tPicMthdRcmdCartList.get(0).getTPackingH());
		calcAndUpdateRecommendedBucketNo(tPicMthdRcmdCartList, CU.nullToZero(param.getBacketRowNum()), CU.nullToZero(param.getBacketColNum()));
	}

	// [#5105][v3.1] ピッキング提案からのピッキングリスト発行処理追加 2018.10.18 kawana End

	/**
	 * パラメータマスタの情報取得
	 * @param TShippingInstH 出荷指示
	 * @return MParam パラメータマスタ
	 */
	private MParam getMParam(TPackingH packingH) {
		MClientCenter m = new MClientCenter();
		m.setClientId(packingH.getClientId());
		m.setCenterId(packingH.getCenterId());
		return paramLogic.getUkEntityUseCash(m);
	}

	// [1.1.4-CT-079] バケット計算を変更 2016.06.13 kawana Start

	/**
	 * <h2>バケット計算 & 梱包ヘッダ更新</h2>
	 * <pre>
	 * バケット計算結果を梱包ヘッダに適用後、
	 * 梱包ヘッダを更新する。
	 *
	 * </pre>
	 *
	 * @param packingBList 対象の梱包ボディリスト
	 * @param param パラメータマスタ
	 * @param cartNo 現在の台車No
	 * @return cartNo バケット計算後の台車No
	 */
	private long calcAndUpdateBucketNo(List<TPackingB> packingBList, MParam param, long currentCartNo) {

		// ===== 梱包ヘッダリストを作成 =====

		List<TPackingH> packingHList = new ArrayList<TPackingH>();
		Map<Long, TPackingH> packingHMap = new HashMap<Long, TPackingH>();

		for (TPackingB packingBody : packingBList) {

			long headerId = packingBody.getPackingHId();

			if (packingHMap.containsKey(headerId)) {

				// ボディに追加
				packingHMap.get(headerId).getTPackingBList().add(packingBody);
			} else {

				// ボディを作成してヘッダリスト、マップに追加
				List<TPackingB> bodyList = new ArrayList<TPackingB>();
				bodyList.add(packingBody);

				TPackingH packingH = packingBody.getTPackingH();

				packingH.setTPackingBList(bodyList);

				packingHMap.put(headerId, packingH);
				packingHList.add(packingH);
			}
		}

		// ソート
		sortPackingHList(packingHList);

		// 台車数を算出

		long cartNum = 1;
		long rowNum = CU.nullToZero(param.getBacketRowNum());
		long colNum = CU.nullToZero(param.getBacketColNum());
		if (0 < rowNum && 0 < colNum) {

			cartNum = packingHList.size() / (rowNum * colNum);
			if (0 < packingHList.size() % (rowNum * colNum)) {
				cartNum = cartNum + 1;
			}
		} else {

			if (rowNum < 1) {
				rowNum = Long.MAX_VALUE;
			}
			if (colNum < 1) {
				colNum = Long.MAX_VALUE;
			}
		}

		long cartNo = 1;
		long rowNo = 1L;
		long colNo = 1L;
		for (TPackingH packingH : packingHList) {

			if (cartNum < cartNo) {
				// 台車番号が台車数を超えた場合

				// 台車番号を1にして列番号に1加算
				cartNo = 1;
				colNo++;
			}

			if (colNum < colNo) {
				// 列番号が列数を超えた場合

				// 列番号を1にして段番号に1加算
				colNo = 1;
				rowNo++;
			}

			// [ON推-品向-1104] マルチピック計算フラグを表示 2016.04.18 kawana Start
			packingH.setMultiPicFlg_$1();
			// [ON推-品向-1104] マルチピック計算フラグを表示 2016.04.18 kawana End
			packingH.setCartNo(currentCartNo + cartNo);
			packingH.setBucketRowNo(rowNo);
			packingH.setBucketColNo(colNo);

			tPackingHBhv.update(packingH);

			// 台車番号に1加算
			cartNo++;
		}

		return currentCartNo + cartNum;
	}

	// [#5105][v3.1] ピッキング提案からのピッキングリスト発行処理追加 2018.10.18 kawana Start

	/**
	 * ピッキング台車テーブルに従い台車No、バケット列No、バケット段Noを設定
	 */
	private void calcAndUpdateRecommendedBucketNo(List<TPicMthdRcmdCart> tPicMthdRcmdCartList, long rowNum, long colNum) {

		if (rowNum < 1) {
			rowNum = Long.MAX_VALUE;
		}
		if (colNum < 1) {
			colNum = Long.MAX_VALUE;
		}

		long currentCartNo = tPicMthdRcmdCartList.get(0).getCartNo();
		long rowNo = 1L;
		long colNo = 1L;

		for (TPicMthdRcmdCart tPicMthdRcmdCart : tPicMthdRcmdCartList) {

			long cartNo = tPicMthdRcmdCart.getCartNo();
			if (currentCartNo != cartNo) {
				// 台車No.が変わった

				rowNo = 1L;
				colNo = 1L;
				currentCartNo = cartNo;
			}

			TPackingH packingH = tPicMthdRcmdCart.getTPackingH();

			packingH.setMultiPicFlg_$1();
			packingH.setCartNo(cartNo);
			packingH.setBucketRowNo(rowNo);
			packingH.setBucketColNo(colNo);

			tPackingHBhv.update(packingH);

			// 次の列番号、段番号に変更
			colNo++;
			if (colNum < colNo) {
				// 列数が上限に達した

				// 列番号を1にして段番号に1加算
				colNo = 1;
				rowNo++;
			}
		}
	}

	// [#5105][v3.1] ピッキング提案からのピッキングリスト発行処理追加 2018.10.18 kawana End

	/**
	 * 梱包データのソート編集
	 * @param List<TPackingH> 梱包ヘッダリスト
	 */
	private void sortPackingHList(List<TPackingH> tPackingHList) {

		Collections.sort(tPackingHList, new Comparator<TPackingH>() {

			@Override
			public int compare(TPackingH p1, TPackingH p2) {

				// 梱包ボディ数 降順
				int bodyCount1 = p1.getTPackingBList().size();
				int bodyCount2 = p2.getTPackingBList().size();

				if (bodyCount1 != bodyCount2) {

					// 降順
					return bodyCount2 - bodyCount1;
				}

				// 出庫作業No 昇順
				String pickingWorkNo1 = CU.nullToStr(p1.getTPickingH().getPickingWorkNo());
				String pickingWorkNo2 = CU.nullToStr(p2.getTPickingH().getPickingWorkNo());

				if (!pickingWorkNo1.equals(pickingWorkNo2)) {
					return pickingWorkNo1.compareTo(pickingWorkNo2);
				}

				// 出荷梱包No 昇順
				String shippingPakingNo1 = CU.nullToStr(p1.getShippingPackingNo());
				String shippingPakingNo2 = CU.nullToStr(p2.getShippingPackingNo());

				if (!shippingPakingNo1.equals(shippingPakingNo2)) {
					return shippingPakingNo1.compareTo(shippingPakingNo2);
				}

				return 0;
			}
		});
	}

	// [1.1.4-CT-079] バケット計算を変更 2016.06.13 kawana End

	// [#5131][v3.1] ピッキングリストの採番を発行時に変更 2018.08.22 kawana Start

	/**
	 * バケット計算単位キー
	 *
	 * 下記をキーとする
	 * ・作業日
	 * ・配送コースID
	 */
	static class BucketCalcUnitKey {

		private long deliveryCourseId;
		private String workDt;

		public BucketCalcUnitKey(long deliveryCourseId, String workDt) {
			this.deliveryCourseId = deliveryCourseId;
			this.workDt = workDt;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((workDt == null) ? 0 : workDt.hashCode());
			result = prime * result + (int) (deliveryCourseId ^ (deliveryCourseId >>> 32));
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
			BucketCalcUnitKey other = (BucketCalcUnitKey) obj;
			if (workDt == null) {
				if (other.workDt != null)
					return false;
			} else if (!workDt.equals(other.workDt))
				return false;
			if (deliveryCourseId != other.deliveryCourseId)
				return false;
			return true;
		}
	}

	// [#5131][v3.1] ピッキングリストの採番を発行時に変更 2018.08.22 kawana End
}