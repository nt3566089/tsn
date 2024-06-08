package com.oneslogi.wms.logic.shipping;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.BNumberingCB;
import com.oneslogi.base.dbflute.cbean.MNumberingCenterCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.exbhv.BNumberingBhv;
import com.oneslogi.base.dbflute.exbhv.MNumberingCenterBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exentity.BNumbering;
import com.oneslogi.base.dbflute.exentity.MNumberingCenter;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 出荷共通ロジッククラス
 */
public class ShippingCommonLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private BNumberingBhv bNumberingBhv;
	@Inject
	private MNumberingCenterBhv mNumberingCenterBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;

	// ===== 変数 =====

	private static Map<NumberingKey, String> fixedValueMap = new HashMap<NumberingKey, String>();

	/**
	 * <h2>対象No.が出庫作業No.かを判定.</h2>
	 * <pre>
	 * 対象の管理番号が出庫作業No.かを判定。
	 * </pre>
	 * @param centerId センタID
	 * @param targetNo 管理No.
	 * @return true:出庫作業No.
	 */
	public boolean isPickingWorkNo(long centerId, String targetNo) {

		String fixedValue = getPickingWorkNoFixedValue(centerId);
		return targetNo.startsWith(fixedValue);
	}

	/**
	 * <h2>対象No.が出荷梱包No.かを判定.</h2>
	 * <pre>
	 * 対象の管理番号が出荷梱包No.かを判定。
	 * </pre>
	 * @param centerId センタID
	 * @param targetNo 管理No.
	 * @return true:出荷梱包No.
	 */
	public boolean isShippingPackingNo(long centerId, String targetNo) {

		String fixedValue = getShippingPackingNoFixedValue(centerId);
		return targetNo.startsWith(fixedValue);
	}

	/**
	 * <h2>出庫作業No.の採番固定値を取得する。</h2>
	 * <pre>
	 * センタ採番マスタもしくは採番マスタから出庫作業No.の採番固定値(頭文字)を取得する。
	 * </pre>
	 * @param centerId センタId
	 * @return 出庫作業No.の採番固定値(頭文字)
	 */
	private String getPickingWorkNoFixedValue(long centerId) {

		return getNumberingFixedValue(centerId, WmsNumberingConst.PICKING_WORK_NO);
	}

	/**
	 * <h2>出荷梱包No.の採番固定値を取得する。</h2>
	 * <pre>
	 * センタ採番マスタもしくは採番マスタから出荷梱包No.の採番固定値(頭文字)を取得する。
	 * </pre>
	 * @param bizCd 業務CD
	 * @return 出荷梱包No.の採番固定値(頭文字)
	 */
	private String getShippingPackingNoFixedValue(long centerId) {

		return getNumberingFixedValue(centerId, WmsNumberingConst.SHIPPING_PACKING_NO);
	}

	/**
	 * <h2>採番値の頭文字取得.</h2>>
	 */
	private String getNumberingFixedValue(long centerId, String bizCd) {

		// ===== キャッシュ(マップ)から取得 =====

		NumberingKey key = new NumberingKey(centerId, bizCd);
		if (fixedValueMap.containsKey(key)) {
			return fixedValueMap.get(key);
		}

		// ===== センタ採番マスタから取得 =====

		MNumberingCenterCB centerCb = mNumberingCenterBhv.newMyConditionBean();
		centerCb.specify().columnFixedValue();
		centerCb.checkInvalidQuery();
		centerCb.query().setCenterId_Equal(centerId);
		centerCb.query().setBizCd_Equal(bizCd);
		MNumberingCenter numberingCenter = mNumberingCenterBhv.selectEntity(centerCb);
		if (numberingCenter != null) {
			String fixedValue = numberingCenter.getFixedValue();
			fixedValueMap.put(key, fixedValue);
			return fixedValue;
		}

		BNumberingCB cb = bNumberingBhv.newMyConditionBean();
		cb.specify().columnFixedValue();
		cb.checkInvalidQuery();
		cb.query().setBizCd_Equal(bizCd);
		BNumbering numbering = bNumberingBhv.selectEntity(cb);
		if (numbering != null) {
			String fixedValue = numbering.getFixedValue();
			fixedValueMap.put(key, fixedValue);
			return fixedValue;
		}

		return null;
	}

	private static class NumberingKey {
		private long centerId;
		private String bizCd;

		private NumberingKey(long centerId, String bizCd) {
			this.centerId = centerId;
			this.bizCd = bizCd;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((bizCd == null) ? 0 : bizCd.hashCode());
			result = prime * result + (int) (centerId ^ (centerId >>> 32));
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
			NumberingKey other = (NumberingKey) obj;
			if (bizCd == null) {
				if (other.bizCd != null)
					return false;
			} else if (!bizCd.equals(other.bizCd))
				return false;
			if (centerId != other.centerId)
				return false;
			return true;
		}
	}

	/**
	 * <h2>出荷指示ヘッダ取得(出庫作業No/出荷梱包No指定).</h2>
	 * <pre>
	 * 出庫作業No./出荷梱包No.から出荷指示ヘッダを取得する。
	 * 該当データが存在しない場合はエラーを登録する。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param workNo 出庫作業No./出荷梱包No.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return 出荷指示ヘッダ
	 */
	public TShippingInstH getShippingInstHeaderByWorkNo(long centerId, long clientId, String workNo, ErrorStatus errSts) {

		//梱包ボディ情報の取得
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		// 結合
		cb.setupSelect_TPickingB().withTShippingInstB().withTShippingInstH();

		// 出荷指示ヘッダ以外の項目は取得しないように設定
		cb.specify().columnPackingBId();
		cb.specify().specifyTPickingB().columnPickingBId();
		cb.specify().specifyTPickingB().specifyTShippingInstB().columnShippingInstBId();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);

		if (isPickingWorkNo(centerId, workNo)) {
			// 出庫作業No.

			cb.query().queryTPackingH().queryTPickingH().setPickingWorkNo_Equal(workNo);
		} else if (isShippingPackingNo(centerId, workNo)) {
			// 出荷梱包No.

			cb.query().queryTPackingH().setShippingPackingNo_Equal(workNo);
		} else {
			// 該当データなし

			getErrorManager().add(errSts, WmsMessageConst.PICKING_WORK_NO_NOT_FOUND_ERROR);
			return null;
		}
		cb.fetchFirst(1);

		TPackingB packingB = tPackingBBhv.selectEntity(cb);

		if (packingB == null) {
			// 該当データなし

			getErrorManager().add(errSts, WmsMessageConst.PICKING_WORK_NO_NOT_FOUND_ERROR);
			return null;
		}

		return packingB.getTPickingB().getTShippingInstB().getTShippingInstH();
	}
}
