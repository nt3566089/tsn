package com.oneslogi.wms.logic.shipping;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.ScalarQuery;

import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 箱登録ロジッククラス
 */
public class PackingInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.11.04 kawana Start
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.11.04 kawana End

	// ===== 使用ロジッククラス =====
	@Inject
	private PackingInfoUpdateLogic packingInfoUpdateLogic;
	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動により不要な処理を削除 2015.10.30 kawana

	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	/**
	 * <h2>梱包データを登録する。</h2>
	 * <pre>
	 * 梱包ボディを検品済に更新し、【出荷ステータス更新.出荷検品完了】を呼出、
	 * ピース検品を設定後、【出荷ステータス更新.梱包情報更新】を行う。
	 *
	 * 【出荷ステータス更新.出荷検品完了】
	 * ・{@link ShipStatusUpdateLogic#inspected(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品完了ステータス更新メソッド}を呼び出す。
	 *
	 * 【出荷ステータス更新.梱包情報更新】
	 * ・{@link PackingInfoUpdateLogic#updateAll(TPickingH, List, TAllocInstH, TShippingInstH, int, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 梱包情報更新メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param tPickingH 出庫ヘッダ：出庫ヘッダID・荷主ID・センタID・出庫作業No.
	 * @param tPackingBList 梱包ボディリスト：商品CD・荷材CD・荷材ID・梱包数・出庫ボディID・引当指示ボディID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(TPickingH tPickingH, List<TPackingB> tPackingBList, ErrorStatus errSts) {

		// ===== ステータス更新 =====
		// ===== 下記パラメータを設定して、出荷ステータス更新クラス.出荷検品完了メソッドを呼出し =====
		List<TPickingH> tPickingHList = new ArrayList<TPickingH>();

		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.11.04 kawana Start

		// ===== 検品フラグを検品済に変更 =====

		// 更新条件
		TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
		packingBCb.checkInvalidQuery();
		packingBCb.query().queryTPickingB().queryTPickingH().setPickingHId_Equal(tPickingH.getPickingHId());
		//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add Start
		packingBCb.query().queryTPackingH().setMixedFlg_Equal_$1();//混載フラグが1:混載
		//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add End

		// 更新値(検品フラグ)
		TPackingB updatePackingB = new TPackingB();
		updatePackingB.setInspectionFlg_$1();
		// 出庫ボディ 更新実行
		tPackingBBhv.queryUpdate(updatePackingB, packingBCb);

		//[C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.11.04 kawana End

		tPickingHList.add(tPickingH);
		shipStatusUpdateLogic.inspected(tPickingHList, errSts);

		// ===== 出荷指示ヘッダ検索 =====
		TShippingInstHCB hcb = tShippingInstHBhv.newMyConditionBean();
		// エンティティ編集(更新用データ編集)
		List<TShippingInstH> sShipInstHeader = new ArrayList<TShippingInstH>();
		// [検査-118] センタIDと荷主IDの検索条件漏れ 2014.12.06 koseki Start
		hcb.query().queryTAllocInstH().queryTPickingH().setClientId_Equal(tPickingH.getClientId());
		hcb.query().queryTAllocInstH().queryTPickingH().setCenterId_Equal(tPickingH.getCenterId());
		// [検査-118] センタIDと荷主IDの検索条件漏れ 2014.12.06 koseki End
		hcb.query().queryTAllocInstH().queryTPickingH().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());
		sShipInstHeader = tShippingInstHBhv.selectList(hcb);

		TShippingInstH eShipInstHeader = new TShippingInstH();
		//[ver2.2][#2890] 更新日時の取得方法を変更 2017.11.24 miyabe Start
		final TPickingH finalTPickingH = tPickingH;
		Timestamp maxUpdDt = tShippingInstHBhv.scalarSelect(Timestamp.class).max(new ScalarQuery<TShippingInstHCB>(){
			@Override
			public void query(TShippingInstHCB maxCB) {
				maxCB.specify().columnUpdDt();
				maxCB.query().queryTAllocInstH().queryTPickingH().setClientId_Equal(finalTPickingH.getClientId());
				maxCB.query().queryTAllocInstH().queryTPickingH().setCenterId_Equal(finalTPickingH.getCenterId());
				maxCB.query().queryTAllocInstH().queryTPickingH().setPickingWorkNo_Equal(finalTPickingH.getPickingWorkNo());
				setDelFlg(maxCB);
			}
		}).orElse(null);
		eShipInstHeader.setUpdDt(maxUpdDt);

		// ===== 梱包ヘッダ登録 =====
		// ===== 下記パラメータを設定して、梱包明細情報更新.梱包情報更新メソッドを呼出し =====
		//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add Start
		packingInfoUpdateLogic.isPieceShippingInspectProcess = true;
		//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add End
		// [#2913] 梱包明細修正画面 以外からの呼出の場合、届先情報変更は不要のため引数削除 2018.02.07 kawana Start
		// [ON推-CT4-256] バージョンNo.設定を変更 2014.11.20 kei Start
		packingInfoUpdateLogic.updateAll(tPickingH, tPackingBList, eShipInstHeader, sShipInstHeader.size(), errSts);
		// [ON推-CT4-256] バージョンNo.設定を変更 2014.11.20 kei End
		// [#2913] 梱包明細修正画面 以外からの呼出の場合、届先情報変更は不要のため引数削除 2018.02.07 kawana End
		//[ver2.2][#2890] 更新日時の取得方法を変更 2017.11.24 miyabe End

		// [ON推-CT4-256] 排他処理変更対応削除 2014.11.21 kei
	}

	//[C-CWMS-0051] 出荷梱包No.で検品する場合、梱包データ、出庫データ、引当指示データ更新処理追加 2015/12/08 NayZaw Start
	/**
	 * <h2>梱包データを登録する(出荷梱包No.で検品)。</h2>
	 * <pre>
	 * 梱包ヘッダ（出庫フラグ、検品フラグ）を更新後、
	 * 【出荷ステータス更新.出荷検品完了(出荷梱包No.で検品する場合)】を呼出す。
	 *
	 * 【出荷ステータス更新.出荷検品完了(出荷梱包No.で検品する場合)】
	 * ・{@link ShipStatusUpdateLogic#packingInspected(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品完了(出荷梱包No.で検品する場合)ステータス更新メソッド}を呼び出す。
	 *
	 * 出荷指示ヘッダ、出庫ヘッダと出庫ボディのデータを更新する。
	 * </pre>
	 * @param tPackingH 梱包ヘッダ：梱包ヘッダID・センタID・荷主ID・出庫ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insertByPackingNo(TPackingH tPackingH,
			ErrorStatus errSts) {

		List<TPackingH> lstPackingH = new ArrayList<TPackingH>();

		TPackingBCB packingBCb = tPackingBBhv.newMyConditionBean();
		packingBCb.checkInvalidQuery();
		packingBCb.query().setPackingHId_Equal(tPackingH.getPackingHId());
		// 更新値(出庫フラグ、検品フラグ)
		TPackingB updatePackingB = new TPackingB();
		updatePackingB.setPickingFlg_$1();
		updatePackingB.setInspectionFlg_$1();
		// 梱包ボディ 更新実行
		tPackingBBhv.queryUpdate(updatePackingB, packingBCb);
		lstPackingH.add(tPackingH);
		shipStatusUpdateLogic.packingInspected(lstPackingH, errSts);
	}
	//[C-CWMS-0051] 出荷梱包No.で検品する場合、梱包データ、出庫データ、引当指示データ更新処理追加 2015/12/08 NayZaw End

}
