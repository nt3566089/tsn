package com.oneslogi.wms.logic.shipping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
//import com.oneslogi.wms.;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ピッキング共通ロジッククラス
 */
public class PickingCommonLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TPickingBBhv tPickingBBhv;
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;


	// ===== 使用ロジッククラス =====

	@Inject
	private ShipStatusCheckLogic shipStatusCheckLogic;

	/**
	 * <h2>ピッキング開始チェック.</h2>
	 * <pre>
	 *
	 *  引数の出庫ボディに対しチェックを行い、次の場合はfalseを返す。
	 *
	 * ・0件の場合
	 * ・検品済、確定済のデータが含まれる場合
	 * ・全てピッキング済の場合
	 * ・他ユーザがピッキング中の場合
	 * ・納品先が出荷停止状態の場合
	 * ・出荷指示に出荷停止商品が含まれている場合
	 * ・引当指示に引当禁止ロケーションが含まれている場合
	 *
	 * ※ 出庫ボディには引当指示ボディの結合が必須
	 * ※ 出庫ボディには梱包ヘッダまたは出庫ヘッダの結合が必須 (ステータス区分による)
	 *
	 * </pre>
	 * @param packingBList : 梱包ボディリスト ※ 梱包ヘッダ(出庫ヘッダ)、引当指示ボディの結合必須
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true:エラーなし / false:エラーあり
	 */
	protected boolean checkPickingStart(List<TPackingB> packingBList, ErrorStatus errSts) {

		// ===== ピッキング済チェック =====

		if (shipStatusCheckLogic.isCompletedPicking(packingBList)) {
			// 既にピッキング済

			getErrorManager().add(errSts, WmsMessageConst.PICKING_ALL_COMPLETED_ERROR);
			return false;
		}

		Set<Long> allocInstHIdSet = new HashSet<Long>();

		for (TPackingB packingB : packingBList) {

			// ===== ケースピッキングNo.単位の排他チェック =====

			// ピック作業中(7) もしくは ピック済(1)

			// ※ ピック作業中(7) は排他処理用のステータス。
			// ※ HTはワークテーブルで排他チェックしているがSDはワークテーブルを使用していないため
			// ※ 排他チェックが出来ない。
			// ※ SDの時だけ作業開始時にピック作業中(7)に更新して排他チェックを行う

			if (packingB.isPickingFlg$1() || packingB.isPickingFlg$7()) {
				// ピック作業中(7) または ピック済(1)

				if (!packingB.getUpdUser().equals(getUserCd())) {
					// 他のユーザがピッキング中
					this.getErrorManager().add(errSts, WmsMessageConst.OTHER_SHIPPING_PICKING);
					return false;
				}
			}

			// ===== 商品出荷停止、引当禁止チェック =====

			long allocInstHId = packingB.getTAllocInstB().getAllocInstHId();

			// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
			if (!allocInstHIdSet.contains(allocInstHId)) {
				// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End

				// 商品出荷停止フラグ及び引当禁止フラグのチェック
				if (!checkShippingAllogNgFlg(allocInstHId, errSts)) {
					return false;
				}
				allocInstHIdSet.add(allocInstHId);
			}
		}

		return true;
	}

	/**
	 * <h2>出荷停止と引当禁止のチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に引当指示データを検索し、
	 * 該当納品先が出荷停止の場合、取引先が出荷停止のエラーをエラーステータスに設定する。
	 * 該当商品が引当済数あり、出荷停止の場合、商品が出荷停止中または引当不可のエラーをエラーステータスに設定する。
	 * 受払と紐付けロケーションが引当禁止の場合、ロケーションが引当禁止のエラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・引当指示ヘッダID
	 * @param lstTAllocInstB 引当指示ボディ：商品ID・引当済数
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true:出荷停止並びに引当禁止ではない;false:出荷停止または引当禁止
	 */
	public boolean checkShippingAllogNgFlg(long allocInstHId, ErrorStatus errSts) {

		TAllocInstBCB cb = tAllocInstBBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstH().withMCustomerBySupplyCustomerId();
		cb.setupSelect_MProduct();
		cb.query().setAllocInstHId_Equal(allocInstHId);

		List<TAllocInstB> allocInstBList = tAllocInstBBhv.selectList(cb);

		for (TAllocInstB entity : allocInstBList) {

			// ===== 取引先出荷停止チェック =====

			if (entity.getTAllocInstH().getMCustomerBySupplyCustomerId().isShippingStopFlg$1()) {
				this.getErrorManager().add(errSts, WmsMessageConst.FOUND_STOPPED_SHIP_TO_ERROR);
				return false;
			}

			// 引当なしの場合は商品、ロケのチェックはしない

			if (WCC.isZeroOrLess(entity.getAllocNum())) {
				// 引当なし
				continue;
			}

			// ===== 商品出荷停止のチェック =====

			if (entity.getMProduct().isShippingStopFlg$1()) {

				this.getErrorManager().add(errSts, WmsMessageConst.FOUND_STOPPED_OR_PRODUCT_ERROR);
				return false;
			}

			// ===== ロケーション引当禁止チェック =====

			TPickingBCB pickingBcb = tPickingBBhv.newMyConditionBean();
			pickingBcb.setupSelect_TStock().withMLocation();
			pickingBcb.query().setAllocInstBId_Equal(entity.getAllocInstBId());
			pickingBcb.query().setPickingNum_GreaterThan(WCC.ZERO);

			List<TPickingB> pickingBList = tPickingBBhv.selectList(pickingBcb);

			for (TPickingB pickingB : pickingBList) {
				if (pickingB.getTStock().getMLocation().isAllocNgFlg$1()) {
					this.getErrorManager().add(errSts, WmsMessageConst.FOUND_STOPPED_ALLOC_TO_ERROR);
					return false;
				}
			}
		}

		return true;
	}
}
