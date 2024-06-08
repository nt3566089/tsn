package com.oneslogi.ht.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingPickingCB;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv;
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
 * バラオーダーピッキング検品チェックロジッククラス
 */
public class ShippingPickingCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 梱包ヘッダ         */
	@Inject
	private TPackingHBhv tPackingHBhv;

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

	/* 出庫ボディ         */
	@Inject
	private TPickingBBhv tPickingBBhv;

	/* 出荷ピッキングワーク     */
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;

	// [SK2-033] 引当指示ボディテーブル取得処理の追加 2014.12.11 watanabe Start
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;
	// [SK2-033] 引当指示ボディテーブル取得処理の追加 2014.12.11 watanabe End

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

	//【C-CWMS-0041】「出庫作業No存在チェック」作業を出荷ピッキングワークに確認するよう修正。 2015/09/15 NayZaw Update Start

	/**
	 * <h2>出庫作業No.のチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に出庫ヘッダ、出庫ボディ、引当指示ボディに検索する、
	 * 検索対象が見つからない場合、未存在エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 出庫ヘッダの出庫ステータスがピッキング中で、【出荷共通ロジック.出荷ピッキングワークのチェック】のチェックがNGの場合
	 * 他で出荷ピッキング中エラーをエラーステータスに設定し、falseを返す。
	 *
	 *【出荷共通ロジック.出荷停止と引当禁止チェック】を行って、NGの場合、falseを返す。
	 *
	 * 出庫ヘッダの出庫ステータスが出荷検品中、出荷検品中断の場合、他で出荷検品中エラーをエラーステータスに設定し、falseを返す。
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
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe ENd
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
		if(lstTAllocInstB.size() == 0){
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
		if(!shippingLogic.checkShippingAllogNgFlg(tPickingH,lstTAllocInstB)){
			return false;
		}
		// [SK2-033] 商品出荷停止フラグ及び引当禁止フラグのチェック追加 2014.12.11 watanabe End

		// [#260][2.1.0-CT-051] ステータス遷移不正を修正(不要なチェックを削除) 2016.11.22 kawana

		//出庫作業NOピッキング済チェック
		if (checkAllPickingFlg(wHtShippingPicking)) {
			//対象の出庫作業No.はすべてピッキング済です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PICKING_WORK_NO_ALL_COMPLETE);
			return false;
		}
		// [#4466] 強制確定フラグ、メッセージ出力条件削除 2018.4.20 fujiwara Del
		return true;
	}
	//【C-CWMS-0041】「出庫作業No存在チェック」作業を出荷ピッキングワークに確認するよう修正。 2015/09/15 NayZaw Update End

	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為処理追加 2015.12.15 NayZaw Start
	/**
	 * <h2>出荷梱包No.のチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に梱包ヘッダ、梱包ボディ、引当指示ボディに検索する、
	 * 検索対象が見つからない場合、未存在エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 梱包ヘッダの梱包ステータスがピッキング中で、【出荷共通ロジック.出荷ピッキングワークのチェック】のチェックがNGの場合
	 * 他で出荷ピッキング中エラーをエラーステータスに設定し、falseを返す。
	 *
	 *【出荷共通ロジック.出荷停止と引当禁止チェック】を行って、NGの場合、falseを返す。
	 *
	 * 梱包ヘッダの梱包ステータスが出荷検品中、出荷検品中断の場合、他で出荷検品中エラーをエラーステータスに設定し、falseを返す。
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
	public boolean checkShippingPackingNo(WHtShippingPicking wHtShippingPicking){

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
		if(tPackingH==null || tPackingH.getPickingHId()==null){
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
		if(lstTAllocInstB.size() == 0){
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
		if(!shippingLogic.checkShippingAllogNgFlgByPackingNo(tPackingH,lstTAllocInstB)){
			return false;
		}
		if(tPackingH.isPackingStatus$40() || tPackingH.isPackingStatus$45()){
			//他で出荷検品中です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.OTHER_SHIPPING_PACKING);
			return false;
		}
		// [#4466] Ver3.0 出荷梱包No.入力時ステータスチェック追加 2018.4.23 fujiwara Start
		if(tPackingH.isPackingStatus$50() || tPackingH.isPackingStatus$55()){
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
	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為処理追加 2015.12.15 NayZaw End

	//【C-CWMS-0041】「ケース品存在チェック」作業で引数を出荷ピッキングワークに変更 2015/09/15 NayZaw Update Start
	/**
	 * <h2>検品済チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に梱包ヘッダ情報を取得し、
	 * 検索対象が存在する場合、検品済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShippingPicking 出荷検品ワーク：出庫作業No.・荷主ID・センタID
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkPacking(WHtShippingPicking wHtShippingPicking) {
		//梱包ヘッダ情報の取得
		TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
		tPackingHCB.setupSelect_TPickingH();
		tPackingHCB.query().queryTPickingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		tPackingHCB.query().queryTPickingH().setClientId_Equal(wHtShippingPicking.getClientId());
		tPackingHCB.query().queryTPickingH().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());

		List<TPackingH> lstTPackingH = tPackingHBhv.selectList(tPackingHCB);

		if (lstTPackingH.size() > 0) {
			//対象の出庫作業No.は検品済です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PACKING_WORK_NO_COMPLETE);
			return false;
		}

		return true;
	}
	//【C-CWMS-0041】「ケース品存在チェック」作業を出荷ピッキングワークにチェックするよう修正。 2015/09/15 NayZaw Update End

	//【C-CWMS-0041】「入庫NO存在チェック」作業で引数を出荷ピッキングワークに変更 2015/09/15 NayZaw UPDATE Start

	/**
	 * <h2>入庫NOの存在チェックを行う。</h2>
	 * <pre>
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】を行って、
	 * ①出庫作業No. の場合、
	 * 出庫作業No.と紐付く混載の梱包データを取得し、
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * 出庫ボディの出庫数を合計し引数に設定する。
	 * 入庫NOが全部ピック済かをチェックし、既にピック済の場合エラーをエラーステータスに設定する。
	 *
	 * ②出荷梱包No.の場合、
	 * 出荷梱包No.と紐付く梱包データを取得し、
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * 梱包ボディの梱包数を合計し引数に設定する。
	 * 入庫NOが全部ピック済かをチェックし、既にピック済の場合エラーをエラーステータスに設定する。
	 *
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】
	 * ・{@link ShippingLogic#checkPickingWorkNoOrPackingNo(WHtShippingPicking) 出庫作業No.か出荷梱包No.かチェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：出庫作業No.・荷主ID・センタID・入庫ラベルNo.
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkStoreLabelNo(WHtShippingPicking wHtShippingPicking) {

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShippingPicking.getCenterId();
		final String targetNo = wHtShippingPicking.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// 検索条件を荷姿IDがNullでチェックから混在フラグをチェックにする 2016.3.8 NayZaw Start
			//出庫ヘッダ情報の取得
			TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
			tPackingBCB.setupSelect_TPickingB();
			tPackingBCB.setupSelect_TPickingB().withTPickingH();
			tPackingBCB.setupSelect_TPackingH();
			tPackingBCB.query().queryTPickingB().queryTPickingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
			tPackingBCB.query().queryTPickingB().queryTPickingH().setClientId_Equal(wHtShippingPicking.getClientId());
			tPackingBCB.query().queryTPickingB().queryTPickingH().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			tPackingBCB.query().queryTPickingB().queryTStock().queryTStoreNo().setStoreLabelNo_Equal(wHtShippingPicking.getStoreLabelNo());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			tPackingBCB.query().queryTPackingH().setMixedFlg_Equal_$1();
			//[ON推-品質問題点指摘票(新ｿﾘV2-063)] 修正対応 2016.08.24 chou Del
			List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);
			if (lstTPackingB.size() == 0) {
				//該当データが存在しません。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
				return false;
			}

			TPickingB tPickingB = lstTPackingB.get(0).getTPickingB();
			// [SK2-026] 同一出荷作業Noの同一入庫ラベルNoで複数伝票を入れることができるため、それらの数量を合計する 2014.12.10 watanabe Start
			BigDecimal sumPickNum = WCC.ZERO;
			//[ON推-品質問題点指摘票(新ｿﾘV2-063)] 修正対応 2016.08.24 chou Del
			for (TPackingB tPackingB : lstTPackingB) {
				//[ON推-品質問題点指摘票(新ｿﾘV2-063)] 修正対応 2016.08.24 chou Del
				sumPickNum = WCC.add(sumPickNum, tPackingB.getTPickingB().getPickingNum());
				//[ON推-品質問題点指摘票(新ｿﾘV2-063)] 修正対応 2016.08.24 chou Del
			}
			//[ON推-品質問題点指摘票(新ｿﾘV2-063)] 修正対応 2016.08.23 chou Mod End
			tPickingB.setPickingNum(sumPickNum);
			// [SK2-026] 同一出荷作業Noの同一入庫ラベルNoで複数伝票を入れることができるため、それらの数量を合計する 2014.12.10 watanabe End

			//入庫NOピック済チェック
			if (checkPickingFlg(wHtShippingPicking)) {
				//該当データが既にピック済です。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PICKING_ALREADY);
				return false;
			}
			wHtShippingPicking.setPickingBId(tPickingB.getPickingBId());
			wHtShippingPicking.setInstNum(tPickingB.getPickingNum());

			// 検索条件を荷姿IDがNullでチェックから混在フラグをチェックにする 2016.3.8 NayZaw End
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			//梱包ヘッダ情報の取得
			TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
			tPackingBCB.query().queryTPackingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
			tPackingBCB.query().queryTPackingH().setClientId_Equal(wHtShippingPicking.getClientId());
			tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtShippingPicking.getPickingWorkNo());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			tPackingBCB.query().queryTPickingB().queryTStock().queryTStoreNo()
					.setStoreLabelNo_Equal(wHtShippingPicking.getStoreLabelNo());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

			List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);

			if (lstTPackingB.size() == 0) {
				//該当データが存在しません。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
				return false;
			}
			TPackingB tPackingB = lstTPackingB.get(0);

			BigDecimal sumPickNum = WCC.ZERO;
			for (TPackingB tmpPackB : lstTPackingB) {
				sumPickNum = WCC.add(sumPickNum, tmpPackB.getPackingNum());
			}
			tPackingB.setPackingNum(sumPickNum);
			// [SK2-026] 同一出荷作業Noの同一入庫ラベルNoで複数伝票を入れることができるため、それらの数量を合計する 2014.12.10 watanabe End

			//入庫NOピック済チェック
			if (checkPickingFlg(wHtShippingPicking)) {
				//該当データが既にピック済です。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PICKING_ALREADY);
				return false;
			}
			wHtShippingPicking.setPickingBId(tPackingB.getPickingBId());
			wHtShippingPicking.setInstNum(tPackingB.getPackingNum());
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

		// [C-CWMS-0051] 出荷梱包No.でバラピッキング検品場合の為、処理追加 2015.12.14 NayZaw End
		return true;
	}
	//【C-CWMS-0041】「入庫NO存在チェック」作業で引数を出荷ピッキングワークに変更 2015/09/15 NayZaw UPDATE End

	//【C-CWMS-0041】「バラ数チェック」作業で引数を出荷ピッキングワークに変更  2015/09/15 NayZaw UPDATE Start
	/**
	 * <h2>バラ数のチェックを行う。</h2>
	 * <pre>
	 * 指示数＜入庫No.の検品済数の場合、バラ数超えエラーをエラーステータスに設定する。
	 * 指示数＞入庫No.の検品済数＋引数の検品済数(今回検品数)の場合、バラ数不足エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：出庫作業No.・荷主ID・センタID・入庫ラベルNo.・MACアドレス・検品済数
	 */
	public boolean checkSpgQtyOns(WHtShippingPicking wHtShippingPicking) {
		//バラ数チェック
		BigDecimal spgQtyOns = selectSpgQtyOns(wHtShippingPicking);
		if (WCC.isLessThan(wHtShippingPicking.getInstNum(), WCC.add(spgQtyOns, wHtShippingPicking.getSpgQtyOns()))) {
			//該当の入庫No.はバラ数を超えています。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_STORE_LABEL_NO_QTY_OVER_ERROR);
			return false;
		}
		if (WCC.isGreaterThan(wHtShippingPicking.getInstNum(), WCC.add(spgQtyOns, wHtShippingPicking.getSpgQtyOns()))) {
			//該当の入庫No.のバラ数が不足です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_STORE_LABEL_NO_QTY_SHORTAGE_ERROR);
			return false;
		}
		return true;
	}
	//【C-CWMS-0041】「バラ数チェック」作業で引数を出荷ピッキングワークに変更  2015/09/15 NayZaw UPDATE End

	//【C-CWMS-0041】「ピッキング済数を取得」作業で引数を出荷ピッキングワークに変更  2015/09/15 NayZaw UPDATE Start

	/**
	 * <h2>ピッキング済数を取得する。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークテーブルを取得し、
	 * 検品済数の合計を返却する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：出庫作業No.・荷主ID・センタID・入庫ラベルNo.・MACアドレス
	 * @return Long ピッキング済数の合計
	 */
	public BigDecimal selectSpgQtyOns(WHtShippingPicking wHtShippingPicking) {
		//出荷検品ワークテーブルの取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();
      //wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShippingPicking.getSpgInspectionFlg());                //不要
		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());
		wHtShippingPickingCB.query().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		wHtShippingPickingCB.query().setStoreLabelNo_Equal(wHtShippingPicking.getStoreLabelNo());

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		BigDecimal spgQtyOns = WCC.ZERO;
		for (WHtShippingPicking entity : lstWHtShippingPicking) {
			spgQtyOns = WCC.add(spgQtyOns, entity.getSpgQtyOns());
		}
		return spgQtyOns;
	}
	//【C-CWMS-0041】「ピッキング済数を取得」作業で引数を出荷ピッキングワークに変更  2015/09/15 NayZaw UPDATE Start

	//【C-CWMS-0041】「出庫作業NO全部出庫済のチェック」作業で引数を出荷ピッキングワークに変更 2015/09/15 Nay Zaw UPDATE Start
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

		// [C-CWMS-0051] 出荷梱包No.でバラピッキング検品場合の為、処理追加 2015.12.16 NayZaw Start
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
		// [C-CWMS-0051] 出荷梱包No.でバラピッキング検品場合の為、処理追加 2015.12.16 NayZaw End

		List<TPackingB> packingBList = tPackingBBhv.selectList(packingBodyCb);

		return statusCheckLogic.isCompletedPicking(packingBList);

		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
	}
	//【C-CWMS-0041】出庫作業NO全部出庫済のチェックで使用する「出荷検品ワーク」から「出荷ピッキングワーク」に変更 2015/09/15 Nay Zaw UPDATE End

	//【C-CWMS-0041】「入庫NO全部出庫済のチェック」作業で引数を出荷ピッキングワークに変更 2015/09/15 NayZaw UPDATE Start

	/**
	 * <h2>入庫NO全部ピック済のチェックを行う。</h2>
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
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：出庫作業No.・荷主ID・センタID・入庫ラベルNo.
	 * @return boolean true:入庫No.全部ピック済;false:入庫No.未ピックあり
	 */
	private boolean checkPickingFlg(WHtShippingPicking wHtShippingPicking) {

		// [C-CWMS-0051] 出荷梱包No.でバラピッキング検品場合の為、処理追加 2015.12.15 NayZaw Start
		TPackingBCB packingBodyCb=null;
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShippingPicking.getCenterId();
		final String targetNo = wHtShippingPicking.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			// 検索条件を荷姿IDがNullでチェックから混在フラグをチェックにする 2016.3.8 NayZaw Start
			//出庫ボディ情報の取得
			TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
			tPackingBCB.setupSelect_TPickingB();
			tPackingBCB.setupSelect_TPickingB().withTPickingH();
			tPackingBCB.setupSelect_TPackingH();
			tPackingBCB.query().queryTPickingB().queryTPickingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
			tPackingBCB.query().queryTPickingB().queryTPickingH().setClientId_Equal(wHtShippingPicking.getClientId());
			tPackingBCB.query().queryTPickingB().queryTPickingH().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			tPackingBCB.query().queryTPickingB().queryTStock().queryTStoreNo().setStoreLabelNo_Equal(wHtShippingPicking.getStoreLabelNo());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			tPackingBCB.query().queryTPackingH().setMixedFlg_Equal_$1();
			List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);

			// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
			List<Long> pickingBIdList1 = new ArrayList<Long>();
			for (TPackingB tPackB : lstTPackingB) {
				pickingBIdList1.add(tPackB.getTPickingB().getPickingBId());
			}
			// 未出庫の梱包ボディを検索
			packingBodyCb = tPackingBBhv.newMyConditionBean();
			packingBodyCb.checkInvalidQuery();
			packingBodyCb.query().setPickingBId_InScope(pickingBIdList1);

			// 検索条件を荷姿IDがNullでチェックから混在フラグをチェックにする 2016.3.8 NayZaw End
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			//出庫ボディ情報の取得
			TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
			tPackingBCB.query().queryTPackingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
			tPackingBCB.query().queryTPackingH().setClientId_Equal(wHtShippingPicking.getClientId());
			tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtShippingPicking.getPickingWorkNo());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			tPackingBCB.query().queryTPickingB().queryTStock().queryTStoreNo().setStoreLabelNo_Equal(wHtShippingPicking.getStoreLabelNo());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

			List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);

			ArrayList<Long> packingBIdList = new ArrayList<Long>();
			for (TPackingB packingB : lstTPackingB) {
				packingBIdList.add(packingB.getPackingBId());
			}
			//未出庫の梱包ボディを検索
			packingBodyCb = tPackingBBhv.newMyConditionBean();
			packingBodyCb.checkInvalidQuery();
			packingBodyCb.query().setPackingBId_InScope(packingBIdList);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
		List<TPackingB> packingBList = tPackingBBhv.selectList(packingBodyCb);

		return statusCheckLogic.isCompletedPicking(packingBList);
		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
		// [C-CWMS-0051] 出荷梱包No.でバラピッキング検品場合の為、処理追加 2015.12.15 NayZaw End
	}
}