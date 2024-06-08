package com.oneslogi.ht.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingPickingCB;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * バラオーダーピッキング検品(商品)チェックロジッククラス
 */
public class ShippingPickingProductCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 梱包ヘッダ         */
	@Inject
	private TPackingHBhv tPackingHBhv;

	/* 出庫ボディ         */
	@Inject
	private TPickingBBhv tPickingBBhv;

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

	/* 出荷ピッキングワーク     */
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;

	/* 引当指示ボディ */
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;

	// [#4466] 不要なソースを削除 2018.05.15 fujiwara Del

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingLogic shippingLogic;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
	@Inject
	private ShipStatusCheckLogic statusCheckLogic;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
	// [Ver3.0] unit of measure対応 2017.12.01 王 Start
	/* 商品荷姿マスタ */
	@Inject
	private MProductShapeBhv mProductShapeBhv;

	// [Ver3.0] unit of measure対応 2017.12.01 王 End

	// 【C-CWMS-0041】 出庫作業No存在チェック処理で引数を「出荷検品ワーク」から「出荷ピッキングワーク」に変更  2015/09/14 Start Nay Zaw
	/**
	 * <h2>出庫作業No.のチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に出庫ヘッダ、出庫ボディ、引当指示ボディに検索する、
	 * 検索対象が見つからない場合、未存在エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 出庫ヘッダのステータスがピッキング中で、【出荷共通ロジック.出荷ピッキングワークのチェック】のチェックがNGの場合
	 * 他で出荷ピッキング中エラーをエラーステータスに設定し、falseを返す。
	 *
	 *【出荷共通ロジック.出荷停止と引当禁止チェック】を行って、NGの場合、falseを返す。
	 *
	 * 出庫ヘッダのステータスが出荷検品中、出荷検品中断の場合、他で出荷検品中エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 対象の出庫作業No.に紐づくデータが全てピッキング済の場合、
	 * エラーステータスに全てピッキング済みのエラーを設定し、falseを返す。
	 *
	 * 強制確定の場合、強制確定済エラーをエラーステータスに設定し、falseを返す。
	 *
	 * エラーが無い場合、trueを返す。
	 *
	 * 【出荷共通ロジック.出荷ピッキングワークのチェック】
	 * ・{@link ShippingLogic#checkWHtShippingPicking(WHtShippingPicking, CDef.CenterPickingStatus) 出荷ピッキングワークのチェックメソッド}を呼び出す。
	 *
	 * 【出荷共通ロジック.出荷停止と引当禁止チェック】
	 * ・{@link ShippingLogic#checkShippingAllogNgFlg(TPickingH, List) 出荷停止と引当禁止チェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：出庫作業No.・荷主ID・センタID・MACアドレス
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkPickingWorkNo(WHtShippingPicking wHtShippingPicking) {

		//出庫ヘッダ情報の取得
		TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
		tPickingBCB.setupSelect_TPickingH();
		tPickingBCB.query().queryTPickingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		tPickingBCB.query().queryTPickingH().setClientId_Equal(wHtShippingPicking.getClientId());
		tPickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());

		// [SK2-078] 欠品状態では出庫ボディにデータが存在しないため、チェック追加 watanabe 2014.12.18 Start
		List<TPickingB> lstTPickingB = tPickingBBhv.selectList(tPickingBCB);

		if (lstTPickingB.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}
		// [SK2-078] 欠品状態では出庫ボディにデータが存在しないため、チェック追加 watanabe 2014.12.18 End

		// [SK2-033] 商品出荷停止フラグ及び引当禁止フラグありで出荷指示を行った場合、出庫ボディにレコードができない場合があるため修正 2014.12.11 watanabe Start

		// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana Start

		TPackingHCB packingHCb = tPackingHBhv.newMyConditionBean();
		packingHCb.setupSelect_TPickingH();
		packingHCb.checkInvalidQuery();
		packingHCb.query().queryTPickingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		packingHCb.query().queryTPickingH().setClientId_Equal(wHtShippingPicking.getClientId());
		packingHCb.query().queryTPickingH().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		packingHCb.query().setMixedFlg_Equal_$1();
		List<TPackingH> packingHList = tPackingHBhv.selectList(packingHCb);

		if (packingHList.size() < 1) {

			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}

		// 梱包ステータスチェック
		for (TPackingH packingH : packingHList) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			switch (packingH.getPackingStatusAsPackingStatus()) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			case $25:
				// 正常 (出庫指示済、ピッキング済)
				break;
			//[ver3.0][#3229] 表示メッセージを変更 2018.02.15 matsumoto Start
			case $20:
				//他で出庫指示解除中です。
				getErrorManager().add(new ErrorStatus(),WmsMessageConst.OTHER_SHIP_INSTRUCTE_RELEASING);
				return false;
			case $30:
				//他でピッキング中です。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.OTHER_SHIPPING_PICKING);
				return false;
			case $35:
				//すべてピッキング済みです。
				getErrorManager().add(new ErrorStatus(),WmsMessageConst.PICKING_ALL_COMPLETED_ERROR);
				return false;
			case $40:
			case $45:
				//他で出荷検品中です。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.OTHER_SHIPPING_PACKING);
				return false;
			case $50:
			case $55:
				//対象の出庫作業No./梱包No.はすべて検品済です。
				getErrorManager().add(new ErrorStatus(),WmsMessageConst.SHIP_WOKING_OR_PACKING_NUMBER_CANNOT_INPUT_INSPECTED_ERROR);
				return false;
			case $90:
				//キャンセルのデータが含まれています。
				getErrorManager().add(new ErrorStatus(),WmsMessageConst.CANNOT_EXECUTE_CANCEL_DATA_INCLUDED_ERROR);
				return false;
			case $99:
				//エラーデータが含まれています。
				getErrorManager().add(new ErrorStatus(),WmsMessageConst.ERROR_DATA_FOUND_ERROR);
				return false;
			//[ver3.0][#3229] 表示メッセージを変更 2018.02.15 matsumoto End
			// [ver3.0][#3229] 未出荷、出庫指示中のデータに対するエラーメッセージを追加 2018.02.16 matsumoto Start
			case $10:
			case $15:
				getErrorManager().add(new ErrorStatus(),WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
				return false;
			// [ver3.0][#3229] 未出荷、出庫指示中のデータに対するエラーメッセージを追加 2018.02.16 matsumoto End
			}
		}

		TPickingH tPickingH = packingHList.get(0).getTPickingH();

		// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana End

		TAllocInstBCB allocInstBCB = tAllocInstBBhv.newMyConditionBean();
		allocInstBCB.query().setAllocInstHId_Equal(tPickingH.getAllocInstHId());
		List<TAllocInstB> lstTAllocInstB = tAllocInstBBhv.selectList(allocInstBCB);
		if (lstTAllocInstB.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}

		// [SK2-033] 商品出荷停止フラグ及び引当禁止フラグありで出荷指示を行った場合、出庫ボディにレコードができない場合があるため修正 2014.12.11 watanabe End

		// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana Start
		if (!shippingLogic.checkWHtShippingPicking(wHtShippingPicking)) {
			//他で出荷ピッキング中です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.OTHER_SHIPPING_PICKING);
			return false;
		}
		// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana End
		// [SK2-033] 商品出荷停止フラグ及び引当禁止フラグのチェック追加 2014.12.11 watanabe Start
		if (!shippingLogic.checkShippingAllogNgFlg(tPickingH, lstTAllocInstB)) {
			return false;
		}
		// [SK2-033] 商品出荷停止フラグ及び引当禁止フラグのチェック追加 2014.12.11 watanabe End

		// [#260][2.1.0-CT-051] ステータス遷移不正を修正(不要なチェックを削除) 2016.11.22 kawana

		//出庫作業NOピッキング済チェック
		if (checkAllPickingFlg(wHtShippingPicking)) { // 「wHtShipping」→「wHtShippingPicking」に変更
			//対象の出庫作業No.はすべてピッキング済です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PICKING_WORK_NO_ALL_COMPLETE);
			return false;
		}

		// [#4466] 強制確定フラグ、メッセージ出力条件削除 2018.4.20 fujiwara Del
		return true;
	}

	// [C-CWMS-0051] 出荷梱包No.でピッキング検品する場合の為処理追加 2015.12.14 NayZaw Start
	/**
	 * <h2>出荷梱包No.のチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に梱包ヘッダ、梱包ボディ、引当指示ボディに検索する、
	 * 検索対象が見つからない場合、未存在エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 梱包ヘッダのステータスがピッキング中で、【出荷共通ロジック.出荷ピッキングワークのチェック】のチェックがNGの場合
	 * 他で出荷ピッキング中エラーをエラーステータスに設定し、falseを返す。
	 *
	 *【出荷共通ロジック.出荷停止と引当禁止チェック】を行って、NGの場合、falseを返す。
	 *
	 * 梱包ヘッダのステータスが出荷検品中、出荷検品中断の場合、他で出荷検品中エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 対象の出荷梱包No.に紐づくデータが全てピッキング済の場合、
	 * エラーステータスに全てピッキング済みのエラーを設定し、falseを返す。
	 *
	 * 強制確定の場合、強制確定済エラーをエラーステータスに設定し、falseを返す。
	 * エラーが無い場合、trueを返す。
	 *
	 * 【出荷共通ロジック.出荷ピッキングワークのチェック】
	 * ・{@link ShippingLogic#checkWHtShippingPicking(WHtShippingPicking, CDef.CenterPackingStatus) 出荷ピッキングワークのチェックメソッド}を呼び出す。
	 *
	 * 【出荷共通ロジック.出荷停止と引当禁止チェック】
	 * ・{@link ShippingLogic#checkShippingAllogNgFlgByPackingNo(TPackingH, List) 出荷停止と引当禁止チェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：出庫作業No.・荷主ID・センタID・MACアドレス
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkShippingPackingNo(WHtShippingPicking wHtShippingPicking) {

		//出庫ヘッダ情報の取得
		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		tPackingBCB.setupSelect_TPackingH();
		tPackingBCB.query().queryTPackingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		tPackingBCB.query().queryTPackingH().setClientId_Equal(wHtShippingPicking.getClientId());
		tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtShippingPicking.getPickingWorkNo());

		List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);

		if (lstTPackingB.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}
		TPackingHCB packingHCB = tPackingHBhv.newMyConditionBean();
		packingHCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		packingHCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		packingHCB.query().setShippingPackingNo_Equal(wHtShippingPicking.getPickingWorkNo());
		TPackingH tPackingH = tPackingHBhv.selectEntity(packingHCB);
		if (tPackingH == null || tPackingH.getPickingHId() == null) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}

		// [#4695] ケース梱包の出荷梱包No.を入力すると致命的エラー 2018.06.07 kawana Start
		if (tPackingH.isMixedFlg$0()) {
			// ケース梱包

			getErrorManager().add(new ErrorStatus(), WmsMessageConst.SHIPPING_PACKING_NO_CANNOT_PICKING_TARGET_CASE_PICKING_ERROR);
			return false;
		}
		// [#4695] ケース梱包の出荷梱包No.を入力すると致命的エラー 2018.06.07 kawana End

		TAllocInstBCB allocInstBCB = tAllocInstBBhv.newMyConditionBean();
		allocInstBCB.query().setAllocInstHId_Equal(tPackingH.getAllocInstHId());
		List<TAllocInstB> lstTAllocInstB = tAllocInstBBhv.selectList(allocInstBCB);
		if (lstTAllocInstB.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}
		if (tPackingH.isPackingStatus$30()) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			if (!shippingLogic.checkWHtShippingPicking(wHtShippingPicking, CDef.PackingStatus.$25)) {
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				//他で出荷ピッキング中です。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.OTHER_SHIPPING_PICKING);
				return false;
			}
		}
		// [SK2-033] 商品出荷停止フラグ及び引当禁止フラグのチェック追加 2014.12.11 watanabe Start
		if (!shippingLogic.checkShippingAllogNgFlgByPackingNo(tPackingH, lstTAllocInstB)) {
			return false;
		}
		if (tPackingH.isPackingStatus$40() || tPackingH.isPackingStatus$45()) {
			//他で出荷検品中です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.OTHER_SHIPPING_PACKING);
			return false;
		}
		// [#4466] Ver3.0 出荷梱包No.入力時ステータスチェック追加 2018.4.23 fujiwara Start
		if (tPackingH.isPackingStatus$50() || tPackingH.isPackingStatus$55()){
			//対象の出庫作業No./梱包No.はすべて検品済です。
			getErrorManager().add(new ErrorStatus(),WmsMessageConst.SHIP_WOKING_OR_PACKING_NUMBER_CANNOT_INPUT_INSPECTED_ERROR);
			return false;
		}
		// [#4466] Ver3.0 出荷梱包No.入力時ステータスチェック追加 2018.4.23 fujiwara End
		// [SK2-016] 出庫ヘッダのステータスチェックで、出荷検品実施中のチェックを追加する 2014.12.10 watanabe End
		//出庫作業NOピッキング済チェック
		if (checkAllPickingFlg(wHtShippingPicking)) {
			//対象の出庫作業No.はすべてピッキング済です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PACKING_NO_ALL_COMPLETE);
			return false;
		}

		// [#4466] 不要なソースを削除 2018.05.15 fujiwara Del
		// [#4466] 強制確定フラグ、メッセージ出力条件削除 2018.4.20 fujiwara Del
		return true;
	}

	// [C-CWMS-0051] 出荷梱包No.でピッキング検品する場合の為処理追加 2015.12.14 NayZaw End

	//【C-CWMS-0041】引数を「出荷検品ワーク」から「 出荷ピッキングワーク」に変更 2015/09/14 Nay Zaw UPDATE START

	/**
	 * <h2>検品済チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に梱包ヘッダ情報を取得し、【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】を行う。
	 * 出庫作業No.の場合、出庫作業No.と紐付くデータを取得する。
	 * 出荷梱包No.の場合、出荷梱包No.と紐付くデータを取得する。
	 * 梱包ヘッダのデータが存在する場合、検品済エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 上記以外の場合、trueを返す。
	 *
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】
	 * ・{@link ShippingLogic#checkPickingWorkNoOrPackingNo(WHtShippingPicking) 出庫作業No.か出荷梱包No.かチェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID・出庫作業No.
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkPacking(WHtShippingPicking wHtShippingPicking) {
		//梱包ヘッダ情報の取得
		TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
		tPackingHCB.setupSelect_TPickingH();
		tPackingHCB.query().queryTPickingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		tPackingHCB.query().queryTPickingH().setClientId_Equal(wHtShippingPicking.getClientId());

		// [C-CWMS-0051] 出荷梱包No.でバラピッキング検品場合の為処理追加 2015.12.14 NayZaw Start
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShippingPicking.getCenterId();
		final String targetNo = wHtShippingPicking.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			//入力したデータが出庫作業Noの場合
			tPackingHCB.query().queryTPickingH().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			//入力したデータが出荷梱包No.の場合
			tPackingHCB.query().setShippingPackingNo_Equal(wHtShippingPicking.getPickingWorkNo());
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
		// [C-CWMS-0051] 出荷梱包No.でバラピッキング検品場合の為処理追加 2015.12.14 NayZaw End

		List<TPackingH> lstTPackingH = tPackingHBhv.selectList(tPackingHCB);

		if (lstTPackingH.size() > 0) {
			//対象の出庫作業No.は検品済です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PACKING_WORK_NO_COMPLETE);
			return false;
		}

		return true;
	}

	//【C-CWMS-0041】引数を「出荷検品ワーク」から「 出荷ピッキングワーク」に変更 2015/09/14 Nay Zaw UPDATE End

	//【C-CWMS-0041】 spgQtyOnsチェックを「出荷検品ワーク」でチェックから「出荷ピッキングワーク」でチェックに変更 2015/09/14 Nay Zaw Start Update
	/**
	 * <h2>検品済数を取得する。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークからデータを取得し、
	 * 検品済数を合計して返却する。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：センタID・荷主ID・MACアドレス・出庫作業No.・商品ID・ロットID・ロケーションID
	 * @return Long 検品済数合計
	 */
	public BigDecimal selectSpgQtyOns(WHtShippingPicking wHtShippingPicking) {
		//出荷検品ワークテーブルの取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
		//      wHtShippingPickingCB.query().setSpgInspectionFlg_Equal(wHtShippingPicking.getSpgInspectionFlg());   不要
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());
		wHtShippingPickingCB.query().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		wHtShippingPickingCB.query().setLocationId_Equal(wHtShippingPicking.getLocationId());
		wHtShippingPickingCB.query().setProductId_Equal(wHtShippingPicking.getProductId());
		wHtShippingPickingCB.query().setLotId_Equal(wHtShippingPicking.getLotId());
		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		BigDecimal spgQtyOns = WCC.ZERO;
		for (WHtShippingPicking entity : lstWHtShippingPicking) {
			spgQtyOns = WCC.add(spgQtyOns, entity.getSpgQtyOns());
		}
		return spgQtyOns;
	}

	//【C-CWMS-0041】 spgQtyOnsチェックを「出荷検品ワーク」でチェックから「出荷ピッキングワーク」でチェックに変更 2015/09/14 Nay Zaw UPDATE End

	//【C-CWMS-0041】 JANCdチェックを「出荷検品ワーク」でチェックから「出荷ピッキングワーク」でチェックに変更 2015/09/14 Nay Zaw UPDATE Start

	/**
	 * <h2>JAN/商品の一致性のチェックを行う。</h2>
	 * <pre>
	 * JAN/商品の入力値が出荷ピッキングワークのJANCDまたは商品CDと異なる場合、
	 * 商品不一致エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：商品CD・JANCD
	 * @return boolean true:同じ;false:違う
	 */
	public boolean checkJanCd(WHtShippingPicking wHtShippingPicking) {

		//画面表示のJANコードと画面入力のJANコードを取得
		String productCd = wHtShippingPicking.getMProduct().getProductCd();
		String janCd = wHtShippingPicking.getMProduct().getJanCd();
		String janCdInput = wHtShippingPicking.getJanCd();

		//[ON推-CT-003] 商品マスタのJANがNULLの場合は商品CDのみと比較 2015/03/27 KAI UPDATE START
		if (janCd == null) {
			//入力したJAN/商品が画面表示のものと異なる場合はエラー
			if (!productCd.equals(janCdInput)) {
				//商品が異なります。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_JAN_CD_DIFFER_ERROR);
				return false;
			}
		} else {
			//入力したJAN/商品が画面表示のものと異なる場合はエラー
			//[ON推-品向-1112] 修正対応 2016.4.18 chou Mod Start
			if (!productCd.equals(janCdInput) && !janCd.equals(janCdInput) && !checkGtin14SymbolJanCdAndGetUnitNum(wHtShippingPicking, janCdInput)) {
				//[ON推-品向-1112] 修正対応 2016.4.18 chou Mod End
				//商品が異なります。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_JAN_CD_DIFFER_ERROR);
				return false;
			}
		}
		//[ON推-CT-003] 商品マスタのJANがNULLの場合は商品CDのみと比較 2015/03/27 KAI UPDATE END

		return true;
	}

	//【C-CWMS-0041】 JANCdチェックを「出荷検品ワーク」でチェックから「出荷ピッキングワーク」でチェックに変更 2015/09/14 Nay Zaw UPDATE End

	// 【C-CWMS-0041】引数を「出荷ピッキングワークに変更する 2015/09/14 Nay Zaw UPDATE START
	/**
	 * <h2>バラ数のチェックを行う。</h2>
	 * <pre>
	 * 指示数＜検品済数の場合、バラ数超えエラーをエラーステータスに設定する。
	 * 指示数＞検品済数の場合、バラ数不足エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク
	 */
	public boolean checkSpgQtyOns(WHtShippingPicking wHtShippingPicking) {
		//バラ数チェック
		if (WCC.isLessThan(wHtShippingPicking.getInstNum(), wHtShippingPicking.getSpgQtyOns())) {
			//該当のアイテムのバラ数を超えています。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_JAN_CD_QTY_OVER_ERROR);
			return false;
		}
		if (WCC.isGreaterThan(wHtShippingPicking.getInstNum(), wHtShippingPicking.getSpgQtyOns())) {
			//該当のアイテムのバラ数が不足です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_JAN_CD_QTY_SHORTAGE_ERROR);
			return false;
		}
		return true;
	}

	// 【C-CWMS-0041】引数を「出荷ピッキングワークに変更する 2015/09/14 Nay Zaw UPDATE END

	// 【C-CWMS-0041】引数を「出荷ピッキングワークに変更する 2015/09/14 Nay Zaw UPDATE START
	/**
	 * <h2>全部ピッキング済のチェックを行う。</h2>
	 * <pre>
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】を行って、
	 * 出庫作業No.の場合、出庫作業No.と紐付く、混載の梱包ボディのデータを検索する、
	 * 出荷梱包No.の場合、出荷梱包No.と紐付く梱包ボディのデータを検索する。
	 * 検索データが【出荷状態チェックロジック.全てピッキング済判定】をチェックして結果を返却する。
	 *
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】
	 * ・{@link ShippingLogic#checkPickingWorkNoOrPackingNo(WHtShippingPicking) 出庫作業No.か出荷梱包No.かチェックメソッド}を呼び出す。
	 *
	 * 【出荷状態チェックロジック.全てピッキング済判定】
	 * ・{@link ShipStatusCheckLogic#isCompletedPicking(List) 全てピッキング済判定メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷検品ワーク：センタID・荷主ID・出庫作業NO.
	 * @return boolean true:全てピッキング済;false:未ピッキングあり
	 */
	public boolean checkAllPickingFlg(WHtShippingPicking wHtShippingPicking) {

		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start

		// 未出庫の梱包ボディを検索
		TPackingBCB packingBodyCb = tPackingBBhv.newMyConditionBean();
		packingBodyCb.checkInvalidQuery();
		packingBodyCb.query().queryTPackingH().queryTPickingH().setClientId_Equal(wHtShippingPicking.getClientId());
		packingBodyCb.query().queryTPackingH().queryTPickingH().setCenterId_Equal(wHtShippingPicking.getCenterId());

		// [C-CWMS-0051] 出荷梱包No.でバラピッキング検品場合の為、処理追加 2015.12.14 NayZaw Start
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShippingPicking.getCenterId();
		final String targetNo = wHtShippingPicking.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			packingBodyCb.query().queryTPackingH().queryTPickingH().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
			// 混載フラグ＝1だけチェックする 2015.12.17 NayZaw
			packingBodyCb.query().queryTPackingH().setMixedFlg_Equal_$1();
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			packingBodyCb.query().queryTPackingH().setShippingPackingNo_Equal(wHtShippingPicking.getPickingWorkNo());

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

		// [C-CWMS-0051] 出荷梱包No.でバラピッキング検品場合の為、処理追加 2015.12.14 NayZaw End

		List<TPackingB> packingBList = tPackingBBhv.selectList(packingBodyCb);

		return statusCheckLogic.isCompletedPicking(packingBList);

		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

	}

	// 【C-CWMS-0041】引数を「出荷ピッキングワークに変更する 2015/09/14 Nay Zaw UPDATE END

	//[ON推-品向-1112] 修正対応 2016.4.18 chou Add Start
	/**
	 * <h2>GTIN14シンボルと入力したJANCDの一致性チェックを行う。</h2>
	 * <pre>
	 * 入力値がGTIN14シンボル＋出荷ピッキングワークのJANCDと一致するかチェックする。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：JANCD
	 * @param janCdInput 入力したJANCD
	 * @return boolean true:存在する;false:存在しない
	 */
	public boolean checkGtin14SymbolJanCdAndGetUnitNum(WHtShippingPicking wHtShippingPicking, String janCdInput) {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		@SuppressWarnings("unchecked")
		List<MProductShape> list = (List<MProductShape>)ses.getAttribute("GTIN14_SYMBOL");

		boolean result = false;
		// [Ver3.0] unit of measure対応 2017.11.29 王 Start
		Long lngUnitNum = 1L;
		// [Ver3.0] unit of measure対応 2017.11.29 王 End
		for (MProductShape mps : list) {
			// [Ver3.0] unit of measure対応 2017.11.29 王 Start
			MShapeGrpDtl mShapeGrpDtl = mps.getMShapeGrpDtl();
			if (mShapeGrpDtl != null && (mShapeGrpDtl.getGtin14Symbol() + wHtShippingPicking.getJanCd()).equals(janCdInput)) {
				// ケースピッキング対象が「1：対象」の場合
				if ("1".equals(mps.getMShapeGrpDtl().getCasePickFlg())){
					// 入数の設定
					lngUnitNum = lngUnitNum * mps.getUnitNum();
					result = true;
					break;
				}
				else if (mps.getMShapeGrpDtl().getShapeSort() != 1)
				{
					// 入数の設定
					lngUnitNum = lngUnitNum * mps.getUnitNum();
				}
				// [Ver3.0] unit of measure対応 2017.11.29 王 Del
			}
		}
		wHtShippingPicking.setUnitNum(lngUnitNum);
		// [Ver3.0] unit of measure対応 2017.11.29 王 End
		return result;
	}

	//[ON推-品向-1112] 修正対応 2016.4.18 chou Add End
	// [Ver3.0] unit of measure対応 2017.12.01 王 Start
	/**
	 * <h2>入数の取得処理。</h2>
	 * @param wHtShippingPicking 出荷ピッキングワーク
	 * @return boolean true:存在する;false:存在しない
	 */
	public boolean getUnitNum(WHtShippingPicking wHtShippingPicking) {
		//商品荷姿マスタ
		MProductShapeCB mProductShapeCB = mProductShapeBhv.newMyConditionBean();
		mProductShapeCB.setupSelect_MProduct();
		mProductShapeCB.setupSelect_MShapeGrpDtl();
		mProductShapeCB.query().setProductId_Equal(wHtShippingPicking.getProductId());
		mProductShapeCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
		List<MProductShape> list = mProductShapeBhv.selectList(mProductShapeCB);
		boolean result = false;
		Long lngUnitNum = 1L;
		for (MProductShape mps : list) {
			// ケースピッキング対象が「1：対象」の場合
			if ("1".equals(mps.getMShapeGrpDtl().getCasePickFlg())) {
				// 入数の設定
				lngUnitNum = lngUnitNum * mps.getUnitNum();
				result = true;
				break;
			}
			else if (mps.getMShapeGrpDtl().getShapeSort() != 1)
			{
				// 入数の設定
				lngUnitNum = lngUnitNum * mps.getUnitNum();
			}
		}
		wHtShippingPicking.setUnitNum(lngUnitNum);
		return result;
	}
	// [Ver3.0] unit of measure対応 2017.12.01 王 End
}