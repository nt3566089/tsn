package com.oneslogi.wms.logic.shipping;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 出庫作業メッセージ取得ロジッククラス
 */
public class PickingWorkMessageSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TShippingInstHBhv tShippingInstHBhv;

	/**
	 * <h2>出庫作業メッセージの取得.</h2>
	 * <pre>
	 * 出庫作業メッセージを取得する。
	 * 出庫作業メッセージが複数件ある場合は、[]付きで結合する。
	 * </pre>
	 * @param pickingWorkNo 出庫作業No.
	 * @return 出庫作業メッセージ
	 */
	public String selectPickingWorkMessage(String pickingWorkNo) {

		if (CU.isNullOrEmpty(pickingWorkNo)) {
			return "";
		}

		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.specify().columnPickingWorkMessage();
		cb.query().queryTAllocInstH().queryTPickingH().setPickingWorkNo_Equal(pickingWorkNo);
		cb.query().setPickingWorkMessage_IsNotNull();
		cb.query().addOrderBy_ShippingSlipNo_Asc();

		List<TShippingInstH> sihList = tShippingInstHBhv.selectList(cb);
		if (sihList.isEmpty()) {
			return "";
		}

		Set<String> pickingWorkMessageSet = new LinkedHashSet<String>();
		for (TShippingInstH sih : sihList) {
			pickingWorkMessageSet.add(sih.getPickingWorkMessage());
		}

		if (pickingWorkMessageSet.size() == 1) {
			return pickingWorkMessageSet.iterator().next();
		}

		StringBuilder sb = new StringBuilder();

		for (String message : pickingWorkMessageSet) {
			sb.append("[").append(message).append("]");
		}

		return sb.toString();
	}
}
