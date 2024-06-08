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
import com.oneslogi.base.dbflute.cbean.WHtShippingPickingCB;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic;

/**
 * ケースピッキング検品チェックロジッククラス
 */
public class ShippingCasePickingCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	/* 梱包ボディ */
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start
	// 梱包ヘッダ
	@Inject
	private TPackingHBhv tPackingHBhv;
	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End
	/* 出荷ピッキングワーク */
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;
	/* 引当指示ボディ */
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;

	// [#975] 不要な変数を削除(出庫ヘッダ) 2017.02.21 kawana

	// ===== 使用ロジック =====

	/* 出荷共通ロジッククラス */
	@Inject
	private ShippingLogic shippingLogic;
	/* 出荷状態チェックロジッククラス */
	@Inject
	private ShipStatusCheckLogic statusCheckLogic;
	// [Ver3.0] unit of measure対応 2017.12.01 王 Start
	/* 商品荷姿マスタ */
	@Inject
	private MProductShapeBhv mProductShapeBhv;
	// [Ver3.0] unit of measure対応 2017.12.01 王 End
	/**
	 * <h2>ケースピッキングNoのチェックを行う。</h2>
	 * <pre>
	 * 同じケースピッキングNo.に出荷確定済のデータが含まれる場合、エラーを設定しfalseを返す。
	 *
	 * 検索対象が見つからない、又は引当指示ヘッダIDがNULLのデータが存在する場合、０件エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 出庫ステータスがピッキング中で、【出荷共通ロジック.ケースピッキングNo.で出荷ピッキングワークのチェック】でNGの場合、
	 * 他でピッキング中エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 対象のケースピッキングNo.に紐づくデータが全てピッキング済の場合、全てピッキング済エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 強制確定のデータが存在する場合、強制確定済エラーをエラーステータスに設定し、falseを返す。
	 *
	 * 【出荷共通ロジック.商品出荷停止及び引当禁止のチェック】を行って、チェックNGの場合、falseを返す。
	 *
	 * 上記以外の場合、trueを返す。
	 *
	 * 【出荷共通ロジック.ケースピッキングNo.で出荷ピッキングワークのチェック】
	 * ・{@link ShippingLogic#checkWHtShippingPicking(WHtShippingPicking , CDef.CenterPickingStatus, String) ケースピッキングNo.で出荷ピッキングワークのチェックメソッド}を呼び出す。
	 *
	 * 【出荷共通ロジック.商品出荷停止及び引当禁止のチェック】
	 * ・{@link ShippingLogic#checkShippingAllogNgFlg(TPickingH, List) 商品出荷停止及び引当禁止のチェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID
	 * @param casePickingNo ケースピッキングNo
	 * @return boolean true:エラーなし;false:エラーあり
	 */
	public boolean checkCasePickingNo(WHtShippingPicking wHtShippingPicking, String casePickingNo) {

		// [#1448] ケースピッキング時に出荷確定データが検品済に変わってしまう問題を修正 2017.03.30 kawana Start

		final long centerId = wHtShippingPicking.getCenterId();
		final long clientId = wHtShippingPicking.getClientId();

		// ===== 出荷確定済データ存在確認 =====

		statusCheckLogic.checkExistShippingFixedData(centerId, clientId, casePickingNo, new ErrorStatus());
		if (0 < getErrorManager().size()) {
			return false;
		}

		// [#1448] ケースピッキング時に出荷確定データが検品済に変わってしまう問題を修正 2017.03.30 kawana End

		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start

		// ===== 対象データ取得 =====

		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.setupSelect_TPackingH().withTPickingH();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().setCasePickingNo_Equal(casePickingNo);

		List<TPackingB> packingBList = tPackingBBhv.selectList(cb);

		if (packingBList.size() == 0) {

			// エラー (該当データなし)
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}

		// 全てピッキング済かチェック
		if (statusCheckLogic.isCompletedPicking(packingBList)) {

			// エラー (既にピッキング済)
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PICKING_CASE_PICKING_NO_ALL_COMPLETE);
			return false;
		}

		List<TPackingH> packingHList = tPackingBBhv.pulloutTPackingH(packingBList);
		List<TPickingH> pickingHList = tPackingHBhv.pulloutTPickingH(packingHList);

		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End

		for (TPickingH tPickingH : pickingHList) {

			//出荷ピッキングワークのチェックをする際に、出庫作業No.が必要なので、設定する。
			wHtShippingPicking.setPickingWorkNo(tPickingH.getPickingWorkNo());

			if (tPickingH.isPickingStatus$30()) {
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				if (!shippingLogic.checkWHtShippingPicking(wHtShippingPicking, CDef.PickingStatus.$25, casePickingNo)) {
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
					//他で出荷ピッキング中です。
					getErrorManager().add(new ErrorStatus(), WmsMessageConst.OTHER_SHIPPING_PICKING);
					return false;
				}
			}

			//[ON推-1.1.4-CT-067]CT指摘の修正対応 2016.05.31 chou Del

			// [#975] 全てピッキング済のチェックをループ外に抜出 2017.02.21 kawana

			//強制確定フラグ = 1: 強制確定
			if (tPickingH.isForceFixedFlg$1()) {
				//対象のケースピッキングNo.は強制確定済です。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PACKING_CASE_PICKING_NO_FORCE_FIXED);
				return false;
			}

			if (tPickingH.getAllocInstHId() == null) {
				//該当データが存在しません。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
				return false;
			} else {
				TAllocInstBCB allocInstBCB = tAllocInstBBhv.newMyConditionBean();
				allocInstBCB.query().setAllocInstHId_Equal(tPickingH.getAllocInstHId());
				List<TAllocInstB> lstTAllocInstB = tAllocInstBBhv.selectList(allocInstBCB);

				// 商品出荷停止フラグ及び引当禁止フラグのチェック
				if (!shippingLogic.checkShippingAllogNgFlg(tPickingH, lstTAllocInstB)) {
					return false;
				}

			}

		}

		return true;
	}


	/**
	 * <h2>検品済数合計を取得する。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークからデータを取得し、
	 * 検品済数を合計して返却する。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：センタID・荷主ID・MACアドレス・出庫作業No.・商品ID・ロットID・ロケーションID・入庫ラベルNo.
	 * @param mParam パラメータマスタ
	 * @return 検品済数合計
	 */
	public BigDecimal selectSpgQtyOns(WHtShippingPicking wHtShippingPicking, MParam mParam) {
		//出荷ピッキングワークテーブルの取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();

		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());
		wHtShippingPickingCB.query().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		wHtShippingPickingCB.query().setLocationId_Equal(wHtShippingPicking.getLocationId());
		wHtShippingPickingCB.query().setProductId_Equal(wHtShippingPicking.getProductId());
		wHtShippingPickingCB.query().setLotId_Equal(wHtShippingPicking.getLotId());

		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start
		if (mParam.isStoreNoFlg$1()) {
			// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End
			//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.27 chou Add Start
			wHtShippingPickingCB.query().setStoreLabelNo_Equal(wHtShippingPicking.getStoreLabelNo());
			//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.27 chou Add End
			// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start
		}
		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		BigDecimal spgQtyOns = WCC.ZERO;
		for (WHtShippingPicking entity : lstWHtShippingPicking) {
			spgQtyOns = WCC.add(spgQtyOns, entity.getSpgQtyOns());
		}
		return spgQtyOns;
	}

	/**
	 * <h2>JAN/商品の一致性のチェックを行う。</h2>
	 * <pre>
	 * JAN/商品の入力値が出荷ピッキングワークのJANCDまたは商品CDと異なる場合、
	 * 商品不一致エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：商品CD・JANCD
	 * @param janCdInput JAN/商品の入力値
	 * @return boolean true:同じ;false:違う
	 */
	public boolean checkJanCdDiff(WHtShippingPicking wHtShippingPicking, String janCdInput) {

		//画面表示のJANコードと画面入力のJANコードを取得
		String productCd = wHtShippingPicking.getProductCd();
		String janCd = wHtShippingPicking.getJanCd();

		if (janCd == null) {
			//入力したJAN/商品が画面表示のものと異なる場合はエラー
			if (!productCd.equals(janCdInput)) {
				//商品が異なります。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_JAN_CD_DIFFER_ERROR);
				return false;
			}
		} else {
			//入力したJAN/商品が画面表示のものと異なる場合はエラー
			//[ON推-品向-1111] 修正対応 2016.4.18 chou Mod Start
			//「荷姿マスタ.GTIN14シンボル＋JANCD」が読み込まれた場合もチェック可能
			if (!productCd.equals(janCdInput) && !janCd.equals(janCdInput) && !checkGtin14SymbolJanCdAndGetUnitNum(wHtShippingPicking, janCdInput)) {
			//[ON推-品向-1111] 修正対応 2016.4.18 chou Mod End
				//商品が異なります。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_JAN_CD_DIFFER_ERROR);
				return false;
			}
		}

		return true;
	}

	/**
	 * <h2>入庫ラベルNo.一致性のチェックを行う。</h2>
	 * <pre>
	 * 入力した入庫ラベルNo.が出荷ピッキングワーク(画面表示)のものと異なる場合、
	 * 入庫ラベルNo.が異なりエラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：入庫ラベルNo.
	 * @param storeLabelNoInput 入力した入庫ラベルNo.
	 * @return boolean true:同じ;false:違う
	 */
	public boolean checkStoreLabelNoDiff(WHtShippingPicking wHtShippingPicking, String storeLabelNoInput) {

		//画面表示の入庫NOを取得
		String storeLabelNo = wHtShippingPicking.getStoreLabelNo();

		//入力した入庫NOが画面表示のものと異なる場合はエラー
		if (!storeLabelNo.equals(storeLabelNoInput)) {
			//入庫Noが異なります。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_STORE_NO_DIFFER_ERROR);
			return false;
		}

		return true;
	}

	/**
	 * <h2>全てピッキング済のチェックを行う(単品)。</h2>
	 * <pre>
	 * 引数を条件に梱包ボディを検索し、
	 * 【出荷状態チェックロジック.全てピッキング済の判定】を行って、チェック結果を返却する。
	 *
	 * 【出荷状態チェックロジック.全てピッキング済の判定】
	 * ・{@link ShipStatusCheckLogic#isCompletedPicking(List) 全てピッキング済の判定メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：荷主ID・センタID
	 * @param casePickingNo ケースピッキングNo.
	 * @return boolean true : 全部ピッキング済 ; false : 未ピッキングあり
	 */
	public boolean checkAllPickingFlg(WHtShippingPicking wHtShippingPicking, String casePickingNo) {

		// 梱包ボディを検索
		TPackingBCB packingBodyCb = tPackingBBhv.newMyConditionBean();
		packingBodyCb.checkInvalidQuery();
		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start
		packingBodyCb.query().queryTPackingH().setClientId_Equal(wHtShippingPicking.getClientId());
		packingBodyCb.query().queryTPackingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		packingBodyCb.query().setCasePickingNo_Equal(casePickingNo);
		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End

		List<TPackingB> packingBList = tPackingBBhv.selectList(packingBodyCb);

		return statusCheckLogic.isCompletedPicking(packingBList);

	}

	//[ON推-品向-1111] 修正対応 2016.4.18 chou Add Start
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
	//[ON推-品向-1111] 修正対応 2016.4.18 chou Add End

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
		}
		wHtShippingPicking.setUnitNum(lngUnitNum);
		return result;
	}
	// [Ver3.0] unit of measure対応 2017.12.01 王 End
}