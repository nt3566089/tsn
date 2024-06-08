package com.oneslogi.ht.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingPickingCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic;
import com.oneslogi.wms.logic.shipping.ShippingInspectAutoPrintLogic;

/**
 * ケースピッキング検品更新ロジッククラス
 */
public class ShippingCasePickingUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	/* 梱包ボディ */
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [#5491][v3.1] ケースピッキング後の納品明細出力対応 不要な変数(tPackingRBhv)削除 2018.10.25 kawana Delete
	/* 出荷ピッキングワーク */
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;

	// ===== 使用ロジック =====

	/* 出荷共通ロジッククラス */
	@Inject
	private ShippingLogic shippingLogic;
	/* ケースピッキングデータチェックロジッククラス */
	@Inject
	private ShippingCasePickingCheckLogic checkLogic;
	//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.30 chou Add Start
	@Inject
	ShipStatusCheckLogic shipStatusCheckLogic;
	//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.30 chou Add End
	// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana Start
	@Inject
	private ParamLogic paramLogic;
	// [#5491][v3.1] ケースピッキング後の納品明細出力対応 2018.10.25 kawana Start
	@Inject
	private ShippingInspectAutoPrintLogic shippingInspectAutoPrintLogic;
	// [#5491][v3.1] ケースピッキング後の納品明細出力対応 2018.10.25 kawana End
	// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana End

	/**
	 * <h2>出荷ピッキングワークデータを更新する。</h2>
	 * <pre>
	 * 引数を条件に出荷ピッキングワークデータを取得し、
	 * 検品済数、出庫フラグ、スキップ回数を設定後、出荷ピッキングワークを更新する。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：センタID・荷主ID・MACアドレス・出庫作業No.・ロケーションID
	 *                                               ・商品ID・ロットID・入庫ラベルNo.・検品済数・出庫フラグ・スキップ回数
	 */
	public void updateWkPickingFlg(WHtShippingPicking wHtShippingPicking) {
		//出荷ピッキングワークテーブルの取得
		WHtShippingPickingCB wHtShippingPickingCB = wHtShippingPickingBhv.newMyConditionBean();

		wHtShippingPickingCB.query().setCenterId_Equal(wHtShippingPicking.getCenterId());
		wHtShippingPickingCB.query().setClientId_Equal(wHtShippingPicking.getClientId());
		wHtShippingPickingCB.query().setMacAddress_Equal(wHtShippingPicking.getMacAddress());
		wHtShippingPickingCB.query().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		wHtShippingPickingCB.query().setLocationId_Equal(wHtShippingPicking.getLocationId());
		wHtShippingPickingCB.query().setProductId_Equal(wHtShippingPicking.getProductId());
		wHtShippingPickingCB.query().setLotId_Equal(wHtShippingPicking.getLotId());
		//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.27 chou Add Start
		wHtShippingPickingCB.query().setStoreLabelNo_Equal(wHtShippingPicking.getStoreLabelNo());
		//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.27 chou Add End

		List<WHtShippingPicking> lstWHtShippingPicking = wHtShippingPickingBhv.selectList(wHtShippingPickingCB);

		//出荷ピッキングワークテーブル更新
		if(lstWHtShippingPicking != null && lstWHtShippingPicking.size() > 0) {
			WHtShippingPicking wsp = lstWHtShippingPicking.get(0);
			wsp.setSpgQtyOns(wHtShippingPicking.getSpgQtyOns());
			wsp.setPickingFlg(wHtShippingPicking.getPickingFlg());
			wsp.setSkipNum(wHtShippingPicking.getSkipNum());

			wHtShippingPickingBhv.update(wsp);
		}

	}

	/**
	 * <h2>出庫フラグの更新を行う</h2>
	 * <pre>
	 * 引数を条件に混載フラグが単品である梱包ヘッダ情報を取得し、
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 *
	 * 出庫ボディのデータを取得後、出庫数の合計値と【ケースピッキング検品チェックロジック.検品済数取得】を比較し、
	 * 一致する場合、出庫フラグを"1"(出庫済)、検品フラグを"1"(検品済)に更新後、
	 * 【出荷状態チェックロジック.全てピッキング済の判定】で全てピッキング済の場合、梱包ステータスを"35"(ピッキング済)に更新し、
	 * 【出荷共通ロジック.出庫ステータスを更新(ピッキング検品完了のステータス更新)】を行う。
	 *
	 * 【全てピッキング済のチェック】を実行し、
	 * 全てピッキング済の場合、【出荷共通ロジック.出庫ステータスを更新(ピッキング済のステータス更新)】
	 * と【出荷共通ロジック.出庫ステータスを更新(検品済のステータス更新)】を行う。
	 *
	 * 【ケースピッキング検品チェックロジック.検品済数取得】
	 * ・{@link ShippingCasePickingCheckLogic#selectSpgQtyOns(WHtShippingPicking) 検品済数取得メソッド}を呼び出す。
	 *
	 * 【出荷状態チェックロジック.全てピッキング済の判定】
	 * ・{@link ShipStatusCheckLogic#isCompletedPicking(List) 全てピッキング済の判定メソッド}を呼び出す。
	 *
	 * 【出荷共通ロジック.出庫ステータスを更新】
	 * ・{@link ShippingLogic#updatePickingStatusByCasePickingNo(WHtShippingPicking, String, CDef.CenterPickingStatus) 出庫ステータスを更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：センタID・荷主ID・MACアドレス・ロケーションID・MACアドレス・出庫作業No.・商品ID・ロットID・入庫ラベルNo.
	 * @param casePickingNo ケースピッキングNo
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true:ケースピッキングNO全部出庫済;false:ケースピッキングNO一部出庫済
	 */
	// [2.1.0-CT-057]対応修正 引数「エラーステータス」を追加 2016.11.28 nayzaw
	public boolean updatePickingFlg(WHtShippingPicking wHtShippingPicking, String casePickingNo, ErrorStatus errSts) {

		boolean complete = false;

		// [#300][2.1.0-CT-058] ケースピッキング後の荷札出力ですべての荷札が発行されてしまう問題を修正 2016.11.24 kawana Start

		// ===== パラメータマスタ取得 =====

		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(wHtShippingPicking.getClientId());
		mClientCenter.setCenterId(wHtShippingPicking.getCenterId());

		MParam mParam = new MParam();
		mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

		// ===== 対象データを取得 =====

		TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
		packingBCb.setupSelect_TPickingB();
		// [#2147] SDとHTで梱包ステータスが異なる問題を修正 2017.07.24 kawana Start
		packingBCb.setupSelect_TPackingH();
		// [#2147] SDとHTで梱包ステータスが異なる問題を修正 2017.07.24 kawana End

		packingBCb.query().queryTPackingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		packingBCb.query().queryTPackingH().setClientId_Equal(wHtShippingPicking.getClientId());
		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start
		packingBCb.query().setCasePickingNo_Equal(casePickingNo);
		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End
		packingBCb.query().queryTPickingB().queryTStock().queryMLocation().setLocationId_Equal(wHtShippingPicking.getLocationId());
		packingBCb.query().queryTPickingB().queryTStock().queryMProduct().setProductId_Equal(wHtShippingPicking.getProductId());
		packingBCb.query().queryTPickingB().queryTStock().queryTLot().setLotId_Equal(wHtShippingPicking.getLotId());
		// [2.1.0-CT-048]対応修正 2016.11.21 nayzaw Add Start
		//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.27 chou Add Start
		if (mParam.isStoreNoFlg$1()) {
			packingBCb.query().queryTPickingB().queryTStock().queryTStoreNo().setStoreLabelNo_Equal(wHtShippingPicking.getStoreLabelNo());
		}
		//[ON推-1.1.4-CT-066]CT指摘の修正対応 2016.05.27 chou Add End
		// [2.1.0-CT-048]対応修正 2016.11.21 nayzaw Add End

		List<TPackingB> packingBList = tPackingBBhv.selectList(packingBCb);

		if (packingBList.size() < 1) {
			// データなし
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return false;
		}

		BigDecimal sumPickNum = WCC.ZERO;
		Set<Long> packingHIdSet = new HashSet<Long>();

		for (TPackingB packingB : packingBList) {

			// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start

			// 梱包数を加算
			sumPickNum = WCC.add(sumPickNum, packingB.getPackingNum());

			// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End

			packingHIdSet.add(packingB.getPackingHId());
		}

		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start
		// [Ver3.0] unit of measure対応 2017.11.30 王 Start
		// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
		if (WCC.isEqual(sumPickNum, checkLogic.selectSpgQtyOns(wHtShippingPicking, mParam))) {
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
			// [Ver3.0] unit of measure対応 2017.11.30 王 End
			// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End

			// ===== 出庫フラグを「1：出庫済」に更新 =====
			// ===== 検品フラグを「1：検品済」に更新 =====

			for (TPackingB packingB : packingBList) {
				packingB.setPickingFlg_$1();
				//[ON推-1.1.4-CT-051]CT指摘問題の修正対応 2016.05.23 chou Add Start
				packingB.setInspectionFlg_$1();
				//[ON推-1.1.4-CT-051]CT指摘問題の修正対応 2016.05.23 chou Add End
			}
			tPackingBBhv.batchUpdate(packingBList);

			// ===== ステータス更新 =====

			// [#2147] SDとHTで梱包ステータスが異なる問題を修正 2017.07.24 kawana Start

			List<TPackingH> packingHList = tPackingBBhv.pulloutTPackingH(packingBList);

			shippingLogic.updatePickingStatusByCasePickingNo(wHtShippingPicking, casePickingNo, packingHList, CDef.PickingStatus.$50);

			// [#2147] SDとHTで梱包ステータスが異なる問題を修正 2017.07.24 kawana End

			// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana Start
			// ===== 荷札の自動印刷 =====
			// [2.1.0-CT-057]対応修正 引数「エラーステータス」を追加 2016.11.28 nayzaw Start
			autoPrintTagLabel(packingHIdSet, mParam, errSts);
			// [2.1.0-CT-057]対応修正 引数「エラーステータス」を追加 2016.11.28 nayzaw End
			// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana End
		}

		// [#300][2.1.0-CT-058] ケースピッキング後の荷札出力ですべての荷札が発行されてしまう問題を修正 2016.11.24 kawana End

		//ケースピッキングNO単位で全件済かのチェック
		complete = this.checkLogic.checkAllPickingFlg(wHtShippingPicking, casePickingNo);

		if (complete) {
			//ピッキング完了の場合

			//出庫ヘッダ.出庫ステータス、出荷指示ヘッダ.出荷ステータスをピッキング済「35」に更新
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			shippingLogic.updatePickingStatusByCasePickingNo(wHtShippingPicking, casePickingNo, CDef.PickingStatus.$35);

			//[ON推-1.1.4-CT-083]CT指摘の修正対応 2016.05.31 chou Add Start
			shippingLogic.updatePickingStatusByCasePickingNo(wHtShippingPicking, casePickingNo, CDef.PickingStatus.$50);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			//[ON推-1.1.4-CT-083]CT指摘の修正対応 2016.05.31 chou Add End
		}

		return complete;

	}

	// [#5491][v3.1] ケースピッキング後の納品明細出力対応 2018.10.25 kawana Start
	// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana Start

	/**
	 * <h2>ケース荷札・納品明細の自動発行.</h2>
	 * <pre>
	 * パラメータマスタの検品後荷札出力フラグ、検品後納品明細出力フラグの設定に従い、
	 * ケース荷札、納品明細を自動印刷する。
	 * </pre>
	 * @param packingHIdSet 対象の梱包ヘッダIDリスト
	 * @param mParam
	 * @param errSts エラー時に設定するエラーステータス
	 */
	// [2.1.0-CT-057]対応修正 引数「エラーステータス」を追加 2016.11.28 nayzaw
	private void autoPrintTagLabel(Collection<Long> packingHIdList, MParam mParam, ErrorStatus errSts) {

		// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start

		Set<Long> targetPackingHIdSet = new HashSet<Long>();
		for (long packingHId : packingHIdList) {

			// 全て検品済 => 荷札出力
			if (shipStatusCheckLogic.isCompletedInspection(packingHId)) {

				// 対象
				targetPackingHIdSet.add(packingHId);
			}
		}

		if (!targetPackingHIdSet.isEmpty()) {
			// 荷札発行の対象あり

			// 荷札・納品明細発行メソッド呼出し
			shippingInspectAutoPrintLogic.printCase(targetPackingHIdSet, mParam, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
		}
	}

	// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana End
	// [#5491][v3.1] ケースピッキング後の納品明細出力対応 2018.10.25 kawana End
}