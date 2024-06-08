package com.oneslogi.ht.wms.logic.shipping;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MBoxCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingCB;
import com.oneslogi.base.dbflute.cbean.WShippingInterruptCB;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingBhv;
import com.oneslogi.base.dbflute.exbhv.WShippingInterruptBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.base.dbflute.exentity.WShippingInterrupt;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic.PieceCaseCls;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 *バラ出荷検品（梱包計算なし）チェックロジッククラス
 */
public class ShippingNoPackingCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 荷材マスタ     */
	@Inject
	private MBoxBhv      mBoxBhv;

	/* 出庫ボディ         */
	@Inject
	private TPickingBBhv tPickingBBhv;

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start

	@Inject
	private TPackingBBhv tPackingBBhv;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End

	/* 出荷検品ワーク */
	@Inject
	private WHtShippingBhv wHtShippingBhv;

	//【C-CWMS-0040】「出荷検品中断ワーク」テーブルを削除して「出荷検品中断」テーブルを使用する為「wShippingInterruptBhv」を作成 2015/09/17 Nay Zaw UPDATE Start
	/* 出荷検品中断 */
	@Inject
	private WShippingInterruptBhv wShippingInterruptBhv;
	//【C-CWMS-0040】出荷検品中断ワークテーブルを削除して「出荷検品中断」テーブルを使用する為「wShippingInterruptBhv」を作成 2015/09/17 Nay Zaw UPDATE Start

	// [SK2-033] 引当指示ボディテーブル取得処理の追加 2014.12.11 watanabe Start
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;
	// [SK2-033] 引当指示ボディテーブル取得処理の追加 2014.12.11 watanabe End

	// [SK2-033] 出庫ヘッダテーブル取得処理の追加 2014.12.11 watanabe Start
	@Inject
	private TPickingHBhv tPickingHBhv;
	// [SK2-033] 出庫ヘッダテーブル取得処理の追加 2014.12.11 watanabe End
	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為対応	2015.12.09 NayZaw Start
	@Inject
	private TPackingHBhv tPackingHBhv;
	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為対応	2015.12.09 NayZaw End
	// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto Start
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto End

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private ShippingNoPackingInsertLogic insertLogic;
	@Inject
	private ShippingNoPackingClearLogic clearLogic;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
	@Inject
	private ShipStatusCheckLogic statusCheckLogic;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * <h2>出荷検品ワークのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に、出庫ヘッダが出庫指示済、ピッキング中、ピッキング済、出荷検品中、出荷検品中断、出荷確定済の出庫ボディを取得し、
	 * 検索対象が見つからない場合、【バラ出荷検品（梱包計算なし）クリア.出荷検品中断テーブルの削除】を行って、
	 * ０件エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 引数を条件に、出庫ヘッダからデータを取得し、
	 * 検索対象が見つからない場合、【バラ出荷検品（梱包計算なし）クリア.出荷検品中断テーブルの削除】を行って、
	 * ０件エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 出庫ヘッダの出庫ステータスがピッキング中で【出荷共通ロジック.出荷検品ワークのチェック】がNGの場合、
	 * 他でピッキング中エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 引数を条件に、引当指示ボディからデータを取得し、
	 * 検索対象が見つからない場合、【バラ出荷検品（梱包計算なし）クリア.出荷検品中断テーブルの削除】を行って、
	 * ０件エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 出庫ヘッダの出庫ステータスが出荷検品中で【出荷共通ロジック.出荷検品ワークのチェック】がNGの場合、
	 * 他で出荷検品中エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 【出荷共通ロジック.商品出荷停止及び引当禁止のチェック】を行って、チェックNGの場合、falseを返す。
	 *
	 * 対象のデータが全て検品済の場合、全て検品済のエラーをエラーステータスに設定し、falseを返す。
	 *
	 * 強制確定の場合、強制確定済エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 上記以外の場合、trueを返す。
	 *
	 * 【バラ出荷検品（梱包計算なし）クリア.出荷検品中断テーブルの削除】
	 * ・{@link ShippingNoPackingClearLogic#clearWShippingInterrupt(WHtShipping) 出荷検品中断テーブルの削除メソッド}を呼び出す。
	 *
	 *
	 * 【出荷共通ロジック.出荷検品ワークのチェック】
	 * ・{@link ShippingLogic#checkWHtShipping(WHtShipping , CDef.CenterPickingStatus) 出荷検品ワークのチェックメソッド}を呼び出す。
	 *
	 * 【出荷共通ロジック.商品出荷停止及び引当禁止のチェック】
	 * ・{@link ShippingLogic#checkShippingAllogNgFlg(TPickingH, List) 商品出荷停止及び引当禁止のチェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・出庫作業No.・MACアドレス
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkPickingWorkNo(WHtShipping wHtShipping) {

		//出庫ヘッダ情報の取得
		TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
		tPickingBCB.setupSelect_TPickingH();
		tPickingBCB.query().queryTPickingH().setCenterId_Equal(wHtShipping.getCenterId());
		tPickingBCB.query().queryTPickingH().setClientId_Equal(wHtShipping.getClientId());
		tPickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
		// [ON推-品向-429] ピッキングを行っていなくても出荷検品可能なよう修正 watanabe 2014.12.11 Start
		tPickingBCB.orScopeQuery(new OrQuery<TPickingBCB>() {
			public void query(TPickingBCB orCB) {
				orCB.query().queryTPickingH().setPickingStatus_Equal_$25();
		 // [ON推-品向-451] ピッキング中エラーハンドリング追加 watanabe 2014.12.18 Start
				orCB.query().queryTPickingH().setPickingStatus_Equal_$30();
		 // [ON推-品向-451] ピッキング中エラーハンドリング追加 watanabe 2014.12.18 End
				orCB.query().queryTPickingH().setPickingStatus_Equal_$35();
				orCB.query().queryTPickingH().setPickingStatus_Equal_$40();
				orCB.query().queryTPickingH().setPickingStatus_Equal_$45();
				orCB.query().queryTPickingH().setPickingStatus_Equal_$55();
			}
		});
		// [ON推-品向-429] ピッキングを行っていなくても出荷検品可能なよう修正 watanabe 2014.12.11 End

		// [SK2-078] 欠品状態では出庫ボディにデータが存在しないため、チェック追加 watanabe 2014.12.18 Start
		List<TPickingB> lstTPickingB = tPickingBBhv.selectList(tPickingBCB);

		if (lstTPickingB.size() == 0) {
			//出荷検品中断テーブルをクリア
			clearLogic.clearWShippingInterrupt(wHtShipping);

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
		packingHCb.query().queryTPickingH().setCenterId_Equal(wHtShipping.getCenterId());
		packingHCb.query().queryTPickingH().setClientId_Equal(wHtShipping.getClientId());
		packingHCb.query().queryTPickingH().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
		packingHCb.query().setMixedFlg_Equal_$1();
		List<TPackingH> packingHList = tPackingHBhv.selectList(packingHCb);

		if (packingHList.size() < 1) {
			//出荷検品中断テーブルをクリア
			clearLogic.clearWShippingInterrupt(wHtShipping);

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
			case $35:
				// [#914] 中断の再開できない不具合を修正 2017.01.27 kawana Start
			case $45:
				// [#914] 中断の再開できない不具合を修正 2017.01.27 kawana End
				// 正常 (出庫指示済、ピッキング済、検品中断)
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
			case $40:
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
			//出荷検品中断テーブルをクリア
			clearLogic.clearWShippingInterrupt(wHtShipping);

			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}
		// [SK2-033] 商品出荷停止フラグ及び引当禁止フラグありで出荷指示を行った場合、出庫ボディにレコードができない場合があるため修正 2014.12.11 watanabe End

		//[Ver3.1][#5239]単行ピッキング対象データを選択できないよう修正 2018.09.27 miyabe add Start
		if(tPickingH.isSglRowPicFlg$1()){
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.SINGLE_ROW_PICKING_TARGET_ERROR);
			return false;
		}
		//[Ver3.1][#5239]単行ピッキング対象データを選択できないよう修正 2018.09.27 miyabe add End

		// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana Start
		if (!shippingLogic.checkWHtShipping(wHtShipping, PieceCaseCls.PIECE)) {
			// [2.1.0-CT-051] ケースの出庫フラグ、検品フラグがクリアされてしまう不具合を修正 2016.11.17 kawana End
			//他で出荷検品中です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.OTHER_SHIPPING_PACKING);
			return false;
		}
		// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana End

		// [Ver3.1][#5118]ロケ引当禁止チェックの履行・不履行フラグ追加 2018.09.18 matsumoto Start
		// [SK2-033] 商品出荷停止フラグ及び引当禁止フラグのチェック追加 watanabe 2014.12.11 Start
		if(!shippingLogic.checkShippingNgFlg(tPickingH, lstTAllocInstB)){
			return false;
		}
		// [SK2-033] 商品出荷停止フラグ及び引当禁止フラグのチェック追加 watanabe 2014.12.11 End
		// [Ver3.1][#5118]ロケ引当禁止チェックの履行・不履行フラグ追加 2018.09.18 matsumoto End


		//出庫作業NO全部検品済のチェック
		if (checkInspectionFlg(wHtShipping)) {
			//対象の出庫作業No.はすべて検品済です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PACKING_WORK_NO_ALL_COMPLETE);
			return false;
		}

		//強制確定フラグ = 1: 強制確定
		if (tPickingH.isForceFixedFlg$1()) {
			//対象の出庫作業No.は強制確定済です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PACKING_FORCE_FIXED);
			return false;
		}
		return true;
	}

	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為処理追加 2015.12.09 NayZaw Start
	/**
	 * <h2>出荷梱包Noのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に、梱包ヘッダが出庫指示済、ピッキング中、ピッキング済、出荷検品中、出荷検品中断、出荷確定済の梱包ボディを取得し、
	 * 検索対象が見つからない場合、【バラ出荷検品（梱包計算なし）クリア.出荷検品中断テーブルの削除】を行って、
	 * ０件エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 引数を条件に、梱包ヘッダからデータを取得し、
	 * 検索対象が見つからない場合、【バラ出荷検品（梱包計算なし）クリア.出荷検品中断テーブルの削除】を行って、
	 * ０件エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 梱包ヘッダの梱包ステータスがピッキング中で【出荷共通ロジック.出荷検品ワークのチェック】がNGの場合、
	 * 他でピッキング中エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 引数を条件に、引当指示ボディからデータを取得し、
	 * 検索対象が見つからない場合、【バラ出荷検品（梱包計算なし）クリア.出荷検品中断テーブルの削除】を行って、
	 * ０件エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 梱包ヘッダの梱包ステータスが出荷検品中で【出荷共通ロジック.出荷検品ワークのチェック】がNGの場合、
	 * 他で出荷検品中エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 【出荷共通ロジック.商品出荷停止及び引当禁止のチェック】を行って、チェックNGの場合、falseを返す。
	 *
	 * 対象のデータが全て検品済の場合、全て検品済のエラーをエラーステータスに設定し、falseを返す。
	 *
	 * 強制確定の場合、強制確定済エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 上記以外の場合、trueを返す。
	 *
	 * 【バラ出荷検品（梱包計算なし）クリア.出荷検品中断テーブルの削除】
	 * ・{@link ShippingNoPackingClearLogic#clearWShippingInterrupt(WHtShipping) 出荷検品中断テーブルの削除メソッド}を呼び出す。
	 *
	 *
	 * 【出荷共通ロジック.出荷検品ワークのチェック】
	 * ・{@link ShippingLogic#checkWHtShipping(WHtShipping , CDef.CenterPackingStatus) 出荷検品ワークのチェックメソッド}を呼び出す。
	 *
	 * 【出荷共通ロジック.出荷停止チェック】
	 * ・{@link ShippingLogic#checkShippingNgFlgByPackingNo(TPackingH, List) 出荷停止チェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・出庫作業No.・MACアドレス
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkShippingPackingNo(WHtShipping wHtShipping){

		//出荷梱包No.で検品する場合、
		//梱包ヘッダ情報取得
		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		tPackingBCB.setupSelect_TPackingH();
		tPackingBCB.query().queryTPackingH().setCenterId_Equal(wHtShipping.getCenterId());
		tPackingBCB.query().queryTPackingH().setClientId_Equal(wHtShipping.getClientId());
		tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtShipping.getPickingWorkNo());
		tPackingBCB.orScopeQuery(new OrQuery<TPackingBCB>() {
			public void query(TPackingBCB orCB) {
				orCB.query().queryTPackingH().setPackingStatus_Equal_$25();
				orCB.query().queryTPackingH().setPackingStatus_Equal_$30();
				orCB.query().queryTPackingH().setPackingStatus_Equal_$35();
				orCB.query().queryTPackingH().setPackingStatus_Equal_$40();
				orCB.query().queryTPackingH().setPackingStatus_Equal_$45();
				orCB.query().queryTPackingH().setPackingStatus_Equal_$55();
			}
		});
		List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);
		if(lstTPackingB.size() == 0){
			//出荷検品中断テーブルをクリア
			clearLogic.clearWShippingInterrupt(wHtShipping);
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}
		TPackingHCB packingHCB = tPackingHBhv.newMyConditionBean();

		packingHCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		packingHCB.query().setClientId_Equal(wHtShipping.getClientId());
		packingHCB.query().setShippingPackingNo_Equal(wHtShipping.getPickingWorkNo());
		TPackingH tPackingH = tPackingHBhv.selectEntity(packingHCB);
		if(tPackingH == null || tPackingH.getPackingHId() == null){
			//出荷検品中断テーブルをクリア
			clearLogic.clearWShippingInterrupt(wHtShipping);
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}

		// [#4695] ケース梱包の出荷梱包No.を入力すると致命的エラー 2018.06.07 kawana Start
		if (tPackingH.isMixedFlg$0()) {
			// ケース梱包

			clearLogic.clearWShippingInterrupt(wHtShipping);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.SHIPPING_PACKING_NO_CANNOT_PICKING_TARGET_CASE_PICKING_ERROR);
			return false;
		}
		// [#4695] ケース梱包の出荷梱包No.を入力すると致命的エラー 2018.06.07 kawana End

		//ピッキング中エラーハンドリング
		if(tPackingH.isPackingStatus$30()){
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			if(!shippingLogic.checkWHtShipping(wHtShipping, CDef.PackingStatus.$25)){
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				//他で出荷ピッキング中です。
				getErrorManager().add(new ErrorStatus(),WmsMessageConst.OTHER_SHIPPING_PICKING);
				return false;
			}
		}
		TAllocInstBCB allocInstBCB = tAllocInstBBhv.newMyConditionBean();
		allocInstBCB.query().setAllocInstHId_Equal(tPackingH.getAllocInstHId());
		List<TAllocInstB> lstTAllocInstB = tAllocInstBBhv.selectList(allocInstBCB);
		if(lstTAllocInstB.size() == 0){
			//出荷検品中断テーブルをクリア
			clearLogic.clearWShippingInterrupt(wHtShipping);
			getErrorManager().add(new ErrorStatus(),WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}
		if(tPackingH.isPackingStatus$40()){
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			if(!shippingLogic.checkWHtShipping(wHtShipping,CDef.PackingStatus.$35)){
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				getErrorManager().add(new ErrorStatus(),WmsMessageConst.OTHER_SHIPPING_PACKING);
				return false;
			}
		}
		// [Ver3.1][#5118] ロケ引当禁止チェックの履行・不履行フラグ追加 2018.09.18 matsumoto Start
		if(!shippingLogic.checkShippingNgFlgByPackingNo(tPackingH, lstTAllocInstB)){
			return false;
		}
		// [Ver3.1][#5118] ロケ引当禁止チェックの履行・不履行フラグ追加 2018.09.18 matsumoto End
		//出荷梱包No
		if(checkInspectionFlg(wHtShipping)){
			getErrorManager().add(new ErrorStatus(),WmsMessageConst.HANDY_SHIPPING_PACKING_NO_ALL_COMPLETE);
			return false;
		}

		TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
		tPickingHCB.query().setPickingHId_Equal(tPackingH.getPickingHId());
		TPickingH tPickingH = tPickingHBhv.selectEntity(tPickingHCB);
		//強制確定フラグ = 1: 強制確定
		if (tPickingH.isForceFixedFlg$1()) {
			//対象の出荷梱包No.は強制確定済です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PACKING_NO_FORCE_FIXED);
			return false;
		}

		//[Ver3.1][#5239]単行ピッキング対象データを選択できないよう修正 2018.09.27 miyabe add Start
		if (tPickingH.isSglRowPicFlg$1()) {
			//対象の出荷梱包No.は強制確定済です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.SINGLE_ROW_PICKING_TARGET_ERROR);
			return false;
		}
		//[Ver3.1][#5239]単行ピッキング対象データを選択できないよう修正 2018.09.27 miyabe add End

		return true;
	}
	// [C-CWMS-0051] 出荷梱包No.で検品する場合の為処理追加 2015.12.09 NayZaw End

	/**
	 * <h2>全て検品済かチェックを行う。</h2>
	 * <pre>
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】を行い、
	 * 出庫作業No.の場合、出庫作業No.と紐付く出庫データを取得する。
	 * 出荷梱包No.の場合、出荷梱包No.と紐付く梱包データを取得する。
	 * 【出荷状態チェックロジック.全て検品済の判定】を行い、その結果を返す。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】
	 * ・{@link ShippingLogic#checkPickingWorkNoOrPackingNo(WHtShipping) 出庫作業No.か出荷梱包No.かチェックメソッド}を呼び出す。
	 *
	 * 【出荷状態チェックロジック.全て検品済の判定】
	 * ・{@link ShipStatusCheckLogic#isCompletedInspection(List) 全て検品済の判定メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・出庫作業No.・検品フラグ
	 * @return boolean true:出庫作業NO全部検品済;false:出庫作業NO一部検品済
	 */
	private boolean checkInspectionFlg(WHtShipping wHtShipping) {

		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
		// [C-CWMS-0051] 出庫作業No.で検品するか、出荷梱包No.で検品するかチェック処理追加 2015.12.09 NayZaw Start

		// 未検品の梱包ボディを検索
		TPackingBCB packingBodyCb = tPackingBBhv.newMyConditionBean();
		packingBodyCb.checkInvalidQuery();
		packingBodyCb.query().queryTPackingH().queryTPickingH().setClientId_Equal(wHtShipping.getClientId());
		packingBodyCb.query().queryTPackingH().queryTPickingH().setCenterId_Equal(wHtShipping.getCenterId());

		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShipping.getCenterId();
		final String targetNo = wHtShipping.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			packingBodyCb.query().queryTPackingH().queryTPickingH().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			packingBodyCb.query().queryTPackingH().setShippingPackingNo_Equal(wHtShipping.getPickingWorkNo());
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else {
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}
		List<TPackingB> packingBList = tPackingBBhv.selectList(packingBodyCb);
		//[C-CWMS-0051] 出庫作業No.で検品するか、出荷梱包No.で検品するかチェック処理追加 2015.12.09 NayZaw End

		return statusCheckLogic.isCompletedInspection(packingBList);

		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
	}

	//【C-CWMS-0040】「出荷検品中断ワーク」テーブルを削除して「出荷検品中断」を使用する。  2015/09/15 Nay Zaw UPDATE Start
	/**
	 * <h2>出荷検品中断のチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に、出荷検品中断テーブルのデータを取得し、
	 * データ存在する場合、中断データの再開確認をエラーステータスに設定し、falseを返す。
	 * 検索対象が見つからない場合、【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】を行って
	 * ①出庫作業No.で検品の場合、
	 *  出庫作業No.と紐付く出庫指示済、ピッキング済、出荷検品中、出荷検品中断の出庫データを取得し、
	 *  検索対象が見つからない場合、０件エラーをエラーステータスに設定し、falseを返す。
	 *  出庫ステータス = "45"(検品中断)の場合、他で出荷検品中のエラーをエラーステータスに設定し、falseを返す。
	 *  【バラ出荷検品（梱包計算なし）登録ロジック.出荷検品ワークの登録】を実行後、【出荷共通ロジック.出庫ステータスの更新(出荷検品中)】を呼出す。
	 *
	 * ②出荷梱包No.で検品の場合、
	 *  出荷梱包No.と紐付く出庫指示済、ピッキング済、出荷検品中、出荷検品中断の梱包データを取得し、
	 *  検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 *  梱包ステータス = "45"(検品中断)の場合、他で出荷検品中のエラーをエラーステータスに設定し、falseを返す。
	 *  【バラ出荷検品（梱包計算なし）登録ロジック.出荷検品ワークの登録(梱包No.で検品)】を実行後、【出荷共通ロジック.梱包ステータスの更新(出荷検品中)】を呼出す。
	 *
	 * エラーが無い場合、trueを返す。
	 *
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】
	 * ・{@link ShippingLogic#checkPickingWorkNoOrPackingNo(WHtShipping) 出庫作業No.か出荷梱包No.かチェックメソッド}を呼び出す。
	 *
	 * 【バラ出荷検品（梱包計算なし）登録ロジック.出荷検品ワークの登録】
	 * ・{@link ShippingNoPackingInsertLogic#insertWHtShipping(WHtShipping) 出荷検品ワークの登録メソッド}を呼び出す。
	 *
	 * 【出荷共通ロジック.出庫ステータスの更新(出荷検品中)】
	 * ・{@link ShippingLogic#updatePickingStatus(WHtShipping, CDef.CenterPickingStatus) 出庫ステータスの更新(出荷検品中)メソッド}を呼び出す。
	 *
	 * 【バラ出荷検品（梱包計算なし）登録ロジック.出荷検品ワークの登録(梱包No.で検品)】
	 * ・{@link ShippingNoPackingInsertLogic#insertWHtShippingByPackingNo(WHtShipping) 出荷検品ワークの登録(梱包No.で検品)メソッド}を呼び出す。
	 *
	 * 【出荷共通ロジック.梱包ステータスの更新(出荷検品中)】
	 * ・{@link ShippingLogic#updatePackingStatus(WHtShipping, CDef.CenterPackingStatus) 梱包ステータスの更新(出荷検品中)メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・出庫作業No.
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkWShippingInterrupt(WHtShipping wHtShipping){
		//出荷検品中断テーブルのデータ取得
		WShippingInterruptCB wShippingInterruptCB = wShippingInterruptBhv.newMyConditionBean();
		wShippingInterruptCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wShippingInterruptCB.query().setClientId_Equal(wHtShipping.getClientId());
		wShippingInterruptCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
//		wShippingInterruptCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());		//出荷検品中断ではMACAddressが保存してない為確認不要 2015/09/17 Nay Zaw

		List<WShippingInterrupt> lstWShippingInterrupt = wShippingInterruptBhv.selectList(wShippingInterruptCB);
		if (lstWShippingInterrupt.size() > 0) {
			//取得データが1件以上の場合
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_CONFIRM_INTERRUPT_RESUME);
			return false;
		} else {
			//取得データが0件の場合
			//検品中チェック
			//[C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015.12.09 NayZaw Start
			//入力データが出庫作業No.か出荷梱包No.かチェックるする処理を呼び出す。
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

			final long centerId = wHtShipping.getCenterId();
			final String targetNo = wHtShipping.getPickingWorkNo();

			if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
				// 出庫作業No.

				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

				//入力したデータが出庫作業No.である場合、出庫データ取得
				TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
				tPickingBCB.setupSelect_TPickingH();
				tPickingBCB.setupSelect_TShippingInstB().withTShippingInstH();
				tPickingBCB.query().queryTPickingH().setCenterId_Equal(wHtShipping.getCenterId());
				tPickingBCB.query().queryTPickingH().setClientId_Equal(wHtShipping.getClientId());
				tPickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
				// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana Start
				tPickingBCB.query().existsTPackingBList(new SubQuery<TPackingBCB>() {
					@Override
					public void query(TPackingBCB arg0) {
						// 対象ステータス
						arg0.orScopeQuery(new OrQuery<TPackingBCB>() {
							public void query(TPackingBCB orCB) {
								orCB.query().queryTPackingH().setPackingStatus_Equal_$25();
								orCB.query().queryTPackingH().setPackingStatus_Equal_$35();
								orCB.query().queryTPackingH().setPackingStatus_Equal_$40();
								orCB.query().queryTPackingH().setPackingStatus_Equal_$45();
							}
						});
						// 混載品の対象
						arg0.query().queryTPackingH().setMixedFlg_Equal_$1();
					}
				});
				// [#260][2.1.0-CT-051] ステータス遷移不正を修正 2016.11.22 kawana End

				List<TPickingB> lstTPickingB = tPickingBBhv.selectList(tPickingBCB);

				if (lstTPickingB.size() == 0) {
					//該当データが存在しません。
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
					return false;
				}

				TPickingB tPickingB = lstTPickingB.get(0);
				TPickingH tPickingH = tPickingB.chaseTPickingH();
				//出庫ステータス = 45: 検品中断
				if (tPickingH.isPickingStatus$45()) {
					//他で出荷検品中です。
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.OTHER_SHIPPING_PACKING);
					return false;
				}

				//出荷検品ワークマージ(出荷指示から)
				insertLogic.insertWHtShipping(wHtShipping);

				//出庫ステータスの更新(出庫ステータス = 40: 検品中)
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				shippingLogic.updatePickingStatus(wHtShipping, CDef.PickingStatus.$40);
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
			} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
				// 出荷梱包No.

				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

				//入力したデータが出荷梱包No.である場合、梱包データ取得
				TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
				tPackingBCB.setupSelect_TPackingH();
				tPackingBCB.setupSelect_TPickingB().withTShippingInstB().withTShippingInstH();
				tPackingBCB.query().queryTPackingH().setCenterId_Equal(wHtShipping.getCenterId());
				tPackingBCB.query().queryTPackingH().setClientId_Equal(wHtShipping.getClientId());
				tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtShipping.getPickingWorkNo());
				tPackingBCB.orScopeQuery(new OrQuery<TPackingBCB>() {
					public void query(TPackingBCB orCB) {
						orCB.query().queryTPackingH().setPackingStatus_Equal_$25();
						orCB.query().queryTPackingH().setPackingStatus_Equal_$35();
						orCB.query().queryTPackingH().setPackingStatus_Equal_$40();
						orCB.query().queryTPackingH().setPackingStatus_Equal_$45();
					}
				});

				List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);
				if (lstTPackingB.size() == 0) {
					//該当データが存在しません。
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
					return false;
				}
				TPackingB tPackingB = lstTPackingB.get(0);
				TPackingH tPackingH = tPackingB.chaseTPackingH();
				//梱包ステータス = 45:検品中断
				if (tPackingH.isPackingStatus$45()) {
					//他で出荷検品中です。
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.OTHER_SHIPPING_PACKING);
					return false;
				}

				//出荷検品ワークマージ(出荷指示から)
				insertLogic.insertWHtShippingByPackingNo(wHtShipping);

				//梱包ステータス、出庫ステータスの更新(梱包ステータス＝40：検品中、出庫ステータス＝40：検品中)
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				shippingLogic.updatePackingStatus(wHtShipping, CDef.PackingStatus.$40);
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
			} else {
				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

				//該当データが存在しません。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
				return false;
			}
			//[C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015.12.09 NayZaw End
		}
		return true;
	}
	//【C-CWMS-0040】「出荷検品中断ワーク」テーブルを削除して「出荷検品中断」を使用する。  2015/09/15 Nay Zaw UPDATE End

	/**
	 * <h2>出荷検品ワークテーブルを取得する。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークデータを取得し、取得したデータの出荷作業備考を引数に設定する。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：MACアドレス・荷主ID・センタID
	 */
	public void selectSpgWorkComment(WHtShipping wHtShipping) {
		//出荷検品ワークテーブルの取得
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
//		wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
		List<WHtShipping> lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);
		// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto Start
		LinkedHashSet<String> spgWorkCommentSet = new LinkedHashSet<>();
		if (lstWHtShipping.size() > 0) {

			List<TShippingInstH> tShippingInstHList = new ArrayList<>();
			TShippingInstHCB tShippingInstHCB = tShippingInstHBhv.newMyConditionBean();
			tShippingInstHCB.query().setAllocInstHId_Equal(lstWHtShipping.get(0).getAllocInstHId());
			tShippingInstHCB.query().setClientId_Equal(wHtShipping.getClientId());
			tShippingInstHCB.query().setCenterId_Equal(wHtShipping.getCenterId());
			tShippingInstHCB.query().addOrderBy_ShippingSlipNo_Asc();
			tShippingInstHList = tShippingInstHBhv.selectList(tShippingInstHCB);

			for (TShippingInstH tShippingInstH : tShippingInstHList) {
				if (!CU.isNullOrEmpty(tShippingInstH.getPickingWorkMessage())) {
					spgWorkCommentSet.add(tShippingInstH.getPickingWorkMessage());
				}
			}

			wHtShipping.setSpgWorkCommentSet(spgWorkCommentSet);

		}
		// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto End
	}

	/**
	 * <h2>商品の存在チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に、出荷検品ワークのデータを検索、計算後の検品残数を設定してtrueを返す。
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：出庫作業No.・MACアドレス・荷主ID・センタID・JANCD
	 * @return boolean true:データ存在エラーなし;データ未存在
	 */
	public boolean checkProduct(WHtShipping wHtShipping) {
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
		// [#2943] HTソースCDスキャン時インクリメント制御対応（各機能）2017.12.25 fujiwara Start
		wHtShippingCB.setupSelect_MProduct().withMShapeGrp();
		// [#2943] HTソースCDスキャン時インクリメント制御対応（各機能）2017.12.25 fujiwara End
//      wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
		wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());

		wHtShippingCB.query().addOrderBy_SpgQtyRemain_Desc();

		final String janCd = wHtShipping.getJanCd();
		wHtShippingCB.orScopeQuery(new OrQuery<WHtShippingCB>() {
			public void query(WHtShippingCB orCB) {
				orCB.query().setJanCd_Equal(janCd);
				orCB.query().setProductCd_Equal(janCd);
			}
		});

		List<WHtShipping> lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);

		if (lstWHtShipping.size() == 0) {
			//入力内容に誤りがあります。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.INPUT_ERROR);
			return false;
		}

		WHtShipping entity = lstWHtShipping.get(0);
		wHtShipping.setMProduct(entity.getMProduct());
		wHtShipping.setProductId(entity.getProductId());
		wHtShipping.setProductCd(entity.getProductCd());
		wHtShipping.setProductNm(entity.getProductNm());
//		wHtShipping.setUnitNum(entity.getUnitNum());
		wHtShipping.setInstNum(entity.getInstNum());
		wHtShipping.setSpgQtyOns(entity.getSpgQtyOns());
		wHtShipping.setSpgQtyRemain(WCC.subtract(entity.getInstNum(), entity.getSpgQtyOns()));

		return true;
	}

	/**
	 * <h2>出荷検品ワークテーブルのデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークテーブルから荷材が未登録のデータ件数を取得し、返却する。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：出庫作業No.・MACアドレス・荷主ID・センタID
	 * @return int 出庫検品箱が未登録件数
	 */
	public int selectNoBoxCount(WHtShipping wHtShipping) {
		//出荷検品ワークテーブルのデータ取得
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
//		wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
		wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
		wHtShippingCB.query().setBoxId_IsNull();

		int count = wHtShippingBhv.selectCount(wHtShippingCB);

		return count;
	}

	/**
	 * <h2>検品済数のチェックを行う。</h2>
	 * <pre>
	 * 引数の検品済数が０の場合、数量が０のエラーをエラーステータスに設定しfalseを返す。
	 *
	 * 引数を条件に出荷検品ワークテーブルのデータを取得し、
	 * 指示数＜検品済数＋引数の検品済数(今回検品数)の場合、
	 * 検品数超えエラーをエラーステータスに設定しfalseを返す。
	 *
	 * それ以外の場合、trueを返す。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：出庫作業No.・MACアドレス・荷主ID・センタID・商品ID
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkSpgQtyOns(WHtShipping wHtShipping) {
		// [#4256] 基盤のエラーチェック内容と同じエラーチェックを削除 2018.04.20 fujiwara Del

		//出荷検品ワークテーブルのデータ取得
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
//		wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
		wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
		wHtShippingCB.query().setProductId_Equal(wHtShipping.getProductId());

		wHtShippingCB.query().addOrderBy_SpgQtyRemain_Desc();

		List<WHtShipping> lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);

		if (lstWHtShipping.size() > 0) {
			WHtShipping entity = lstWHtShipping.get(0);

			if (WCC.isLessThan(entity.getInstNum(), WCC.add(entity.getSpgQtyOns(), wHtShipping.getSpgQtyOns()))) {
				//該当の商品は検品数を\n超えています。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SPG_QTY_ONS_OVER_ERROR);
				return false;
			}
		}

		return true;
	}

	/**
	 * <h2>箱の存在のチェックを行う。</h2>
	 * <pre>
	 * 引数を条件荷材マスタを検索し、
	 * 荷材マスタの荷材IDと荷材名称を出荷検品ワークに設定後、trueを返す。
	 *
	 * 検索対象が見つからない場合、未存在エラーをエラーステータスに設定しfalseを返す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：センタID・荷材ID
	 * @return boolean true:荷材マスタに存在;false:荷材マスタに存在しない
	 */
	public boolean checkBoxCd(WHtShipping wHtShipping) {
		MBoxCB mBoxCB = mBoxBhv.newMyConditionBean();
		mBoxCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		mBoxCB.query().setBoxCd_Equal(wHtShipping.getBoxCd());

		MBox mBox = mBoxBhv.selectEntity(mBoxCB);

		if (mBox == null) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}

		wHtShipping.setBoxId(mBox.getBoxId());
		wHtShipping.setBoxNm(mBox.getBoxNm());

		return true;
	}

	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
	/**
	 * <h2>デフォルト荷材を取得。</h2>
	 * <pre>
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク
	 * @return MBox
	 */
	public MBox selectDefaultBox(WHtShipping wHtShipping) {
		//出荷梱包ヘッダテーブルの取得
		TPackingHCB packingHCB = tPackingHBhv.newMyConditionBean();
		packingHCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		packingHCB.query().setClientId_Equal(wHtShipping.getClientId());
		packingHCB.query().setShippingPackingNo_Equal(wHtShipping.getPickingWorkNo());
		TPackingH tPackingH = tPackingHBhv.selectEntity(packingHCB);
		// デフォルト荷材
		//[Ver3.0][#2859] 荷材ID未設定の時nullを返す 2017.12.01 miyabe start
		if(tPackingH.getBoxId() != null){
			MBoxCB cb = mBoxBhv.newMyConditionBean();
			cb.query().setCenterId_Equal(wHtShipping.getCenterId());
			cb.query().setBoxId_Equal(tPackingH.getBoxId());
			return mBoxBhv.selectEntityWithDeletedCheck(cb);
		}
		else {
			return null;
		}
		//[Ver3.0][#2859] 荷材ID未設定の時nullを返す 2017.12.01 miyabe End
	}
	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
}