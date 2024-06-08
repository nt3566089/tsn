package com.oneslogi.ht.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MBoxCB;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPackingRCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingCB;
import com.oneslogi.base.dbflute.cbean.WShippingInterruptCB;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingRBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingBhv;
import com.oneslogi.base.dbflute.exbhv.WShippingInterruptBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.base.dbflute.exentity.WShippingInterrupt;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.shipping.PackingInsertLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;
import com.oneslogi.wms.logic.shipping.ShippingInspectAutoPrintLogic;

/**
 * バラ出荷検品（梱包計算なし）登録ロジッククラス
 */
public class ShippingNoPackingInsertLogic extends AbstractWmsLogic {

	@Inject
	private PackingInsertLogic packingInsertLogic;

//	// ===== 使用テーブル =====
//	/* 商品荷姿マスタ     */
//	@Inject
//	private MProductShapeBhv mProductShapeBhv;

	/* 出庫ボディ         */
	@Inject
	private TPickingBBhv tPickingBBhv;

	/* 出荷検品ワーク     */
	@Inject
	private WHtShippingBhv wHtShippingBhv;

	/* 出荷検品中断 */
	@Inject
	private WShippingInterruptBhv wShippingInterruptBhv;

	/* 商品マスタ */
	@Inject
	private MProductBhv mProductBhv;

	/* 荷材マスタ */
	@Inject
	private MBoxBhv mBoxBhv;

	@Inject
	private NumberingCenterLogic numberingLogic;

	/* 出庫ヘッダ */
	@Inject
	private TPickingHBhv tPickingHBhv;

	// [#2913] 梱包明細修正画面 以外からの呼出の場合、届先情報変更は不要のため引当指示ヘッダの引数削除(DB操作クラスの削除) 2018.02.07 kawana

	/* 出荷指示ヘッダ */
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;

	/* 梱包ヘッダ                  */
	@Inject
	private TPackingHBhv tPackingHBhv;

	/*  梱包ボディ                 */
	@Inject
	private TPackingBBhv tPackingBBhv;

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  Start
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TPackingRBhv tPackingRBhv;
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  End

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingLogic shippingLogic;
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  Start
	@Inject
	private ParamLogic paramLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
	// [Ver3.1][#5118]荷札自動発行時に使用するロジックを変更 2018.09.18 matsumoto Start
	@Inject
	private ShippingInspectAutoPrintLogic shippingInspectAutoPrintLogic;
	// [Ver3.1][#5118]荷札自動発行時に使用するロジックを変更 2018.09.18 matsumoto End

	// ===== enum =====
	/** コントロールNo付加テーブル */
	public enum ControlNoTable {
		/** 出庫帳票 */
		PICKING_R,
		/** 梱包帳票 */
		PACKING_R
	}
// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  End


	//  【C-CWMS-0040】  DBの出荷検品ワークテーブルで削除した項目を削除,追加したAllocInstHidの追加 Start  2015/09/11  Nay Zaw UPDATE Start
	/**
	 * <h2>出荷検品ワークを登録する。</h2>
	 * <pre>
	 * 引数を条件に、出庫ステータスが出庫指示済、ピッキング済、混載フラグ＝混載の出庫ボディデータを検索し、
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * 商品単位で出庫数を合計し、出荷検品ワークへ登録を行う。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・MACアドレス・出庫作業No.
	 */
	public void insertWHtShipping(WHtShipping wHtShipping) {

		//[ON推-1.1.4-CT-048]CT指摘問題の修正対応 2016.05.25 chou Del

		//出荷指示情報を取得
		TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
		tPickingBCB.setupSelect_TPickingH();
		tPickingBCB.setupSelect_TShippingInstB().withTShippingInstH();
		tPickingBCB.setupSelect_TShippingInstB().withMProduct();
		tPickingBCB.setupSelect_TShippingInstB().withMLocation();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		tPickingBCB.setupSelect_TStock().withTLot();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		tPickingBCB.query().queryTPickingH().setCenterId_Equal(wHtShipping.getCenterId());
		tPickingBCB.query().queryTPickingH().setClientId_Equal(wHtShipping.getClientId());
		tPickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());

		// [#260][2.1.0-CT-051] ステータス遷移不正を修正(ステータス指定を移動するためここから削除) 2016.11.22 kawana

		//[ON推-1.1.4-CT-048]CT指摘問題の修正対応 2016.05.23 chou Add Start
		tPickingBCB.query().existsTPackingBList(new SubQuery<TPackingBCB>(){
			@Override
			public void query(TPackingBCB arg0) {
				// [#260][2.1.0-CT-051] ステータス遷移不正を修正(ステータス指定を移動) 2016.11.22 kawana Start
				// [ON推-品向-429] ピッキングを行っていなくても出荷検品可能なよう修正 2014.12.11 watanabe Start
				arg0.orScopeQuery(new OrQuery<TPackingBCB>() {
					public void query(TPackingBCB orCB) {
						orCB.query().queryTPackingH().setPackingStatus_Equal_$25();
						orCB.query().queryTPackingH().setPackingStatus_Equal_$35();
					}
				});
				// [ON推-品向-429] ピッキングを行っていなくても出荷検品可能なよう修正 2014.12.11 watanabe End
				// [#260][2.1.0-CT-051] ステータス遷移不正を修正(ステータス指定を移動) 2016.11.22 kawana End
				arg0.query().queryTPackingH().setMixedFlg_Equal_$1();//混載フラグは1:混載を指定
			}
		});
		//[ON推-1.1.4-CT-048]CT指摘問題の修正対応 2016.05.23 chou Add End

		// [ON推-品向-242] 変数名変更 2014.11.21 watanabe Start
		List<TPickingB> lstSelTPickingB = tPickingBBhv.selectList(tPickingBCB);
		// [ON推-品向-242] 変数名変更 2014.11.21 watanabe End

		//[ON推-1.1.4-CT-048]CT指摘問題の修正対応 2016.05.23 chou Add Start
		if (lstSelTPickingB == null || lstSelTPickingB.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return;
		}
		//[ON推-1.1.4-CT-048]CT指摘問題の修正対応 2016.05.23 chou Add End

		// [ON推-品向-242] 商品別にグルーピングを行う 2014.11.21 watanabe Start
		HashMap<Long, TPickingB> prodMap = new HashMap<Long, TPickingB>();
		List<Long> prodList = new ArrayList<Long>();
		for (TPickingB tPickingB : lstSelTPickingB) {
			Long tmpProdId = tPickingB.getTShippingInstB().getMProduct().getProductId();
			if(prodMap.get(tmpProdId)!=null){
				//すでに同一商品が存在するため、指定入数、指示数、検品残数を足す
				TPickingB tmpPick = (TPickingB)prodMap.get(tmpProdId);
				// [ON推-品向-242] 足し合わせる対象修正 2014.11.25 watanabe Start
				BigDecimal tmp = WCC.add(tmpPick.getPickingNum(), tPickingB.getPickingNum());
				// [ON推-品向-242] 足し合わせる対象修正 2014.11.25 watanabe End
				tmpPick.setPickingNum(tmp);
				prodMap.put(tmpProdId, tmpPick);
			} else {
				prodList.add(tmpProdId);
				prodMap.put(tmpProdId, tPickingB);
			}
		}

		List<TPickingB> lstTPickingB = new ArrayList<TPickingB>();
		for(int cnt=0; cnt<prodList.size(); cnt++){
			lstTPickingB.add(prodMap.get(prodList.get(cnt)));
		}
		// [ON推-品向-242] 商品別にグルーピングを行う 2014.11.21 watanabe End

		//出荷検品ワークの登録
		List<WHtShipping> lstWHtShipping = new ArrayList<WHtShipping>();
		for (TPickingB tPickingB : lstTPickingB) {
			TPickingH tPickingH = tPickingB.chaseTPickingH();
			TShippingInstB tShippingInstB = tPickingB.chaseTShippingInstB();
			TShippingInstH tShippingInstH = tShippingInstB.chaseTShippingInstH();
			MProduct mProduct = tShippingInstB.chaseMProduct();

			WHtShipping entity = new WHtShipping();
			entity.setMacAddress(wHtShipping.getMacAddress());
			entity.setAllocInstHId(tPickingH.getAllocInstHId());		//追加した項目
			entity.setCenterId(wHtShipping.getCenterId());
			entity.setClientId(wHtShipping.getClientId());
			entity.setPickingWorkNo(tPickingH.getPickingWorkNo());
			entity.setProductId(mProduct.getProductId());
			entity.setProductCd(mProduct.getProductCd());
			entity.setProductNm(mProduct.getProductNm());
			entity.setJanCd(mProduct.getJanCd());
			entity.setInstNum(tPickingB.getPickingNum());
			entity.setSpgQtyOns(WCC.ZERO);
			entity.setSpgQtyRemain(tPickingB.getPickingNum());
			entity.setPieceNo(0l);
			entity.setSpgWorkComment(tShippingInstH.getPickingWorkMessage());

			lstWHtShipping.add(entity);
		}
		wHtShippingBhv.batchInsert(lstWHtShipping);
	}
    //【C-CWMS-0040】  DBの出荷検品ワークテーブルで削除した項目を削除,追加したAllocInstHidの追加  2015/09/11  NayZaw UPDATE  End

	// [C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015.12.09 NayZaw Start
	/**
	 * <h2>出荷検品ワークを登録する(梱包No.で検品)。</h2>
	 * <pre>
	 * 引数を条件に、梱包ステータスが出庫指示済、ピッキング済、混載フラグ＝混載の出庫ボディデータを検索し、
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * 商品単位で出庫数を合計し、出荷検品ワークへ登録を行う。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・MACアドレス・出庫作業No.
	 */
	public void insertWHtShippingByPackingNo(WHtShipping wHtShipping){

		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		tPackingBCB.setupSelect_TPackingH();
		tPackingBCB.setupSelect_TPickingB().withTShippingInstB().withTShippingInstH();
		tPackingBCB.setupSelect_TPickingB().withTShippingInstB().withMProduct();
		tPackingBCB.setupSelect_TPickingB().withTShippingInstB().withMLocation();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		tPackingBCB.setupSelect_TPickingB().withTStock().withTLot();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		tPackingBCB.query().queryTPackingH().setCenterId_Equal(wHtShipping.getCenterId());
		tPackingBCB.query().queryTPackingH().setClientId_Equal(wHtShipping.getClientId());
		tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtShipping.getPickingWorkNo());
		tPackingBCB.orScopeQuery(new OrQuery<TPackingBCB>() {
			public void query(TPackingBCB orCB) {
				orCB.query().queryTPackingH().setPackingStatus_Equal_$25();
				orCB.query().queryTPackingH().setPackingStatus_Equal_$35();
			}
		});
		//[ON推-1.1.4-CT-048]CT指摘問題の修正対応 2016.05.23 chou Add Start
		tPackingBCB.query().queryTPackingH().setMixedFlg_Equal_$1();//混載フラグは1:混載を指定
		//[ON推-1.1.4-CT-048]CT指摘問題の修正対応 2016.05.23 chou Add End

		List<TPackingB> lstSelTPackingB = tPackingBBhv.selectList(tPackingBCB);

		//[ON推-1.1.4-CT-048]CT指摘問題の修正対応 2016.05.23 chou Add Start
		if (lstSelTPackingB == null || lstSelTPackingB.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return;
		}
		//[ON推-1.1.4-CT-048]CT指摘問題の修正対応 2016.05.23 chou Add End

		HashMap<Long,TPackingB> prodMap = new HashMap<Long,TPackingB>();
		List<Long> prodList = new ArrayList<Long>();
		for(TPackingB tPackingB : lstSelTPackingB){
			Long tmpProdId = tPackingB.getTPickingB().getTShippingInstB().getMProduct().getProductId();
			if(prodMap.get(tmpProdId)!=null){
				//すでに同一商品が存在するため、指定入数、指示数、検品残数を足す
				TPackingB tmpPack = (TPackingB)prodMap.get(tmpProdId);
				BigDecimal tmp = WCC.add(tmpPack.getPackingNum(), tPackingB.getPackingNum());
				tmpPack.setPackingNum(tmp);
				prodMap.put(tmpProdId, tmpPack);
			} else {
				prodList.add(tmpProdId);
				prodMap.put(tmpProdId, tPackingB);
			}
		}
		List<TPackingB> lstTPackingB = new ArrayList<TPackingB>();
		for(int cnt=0; cnt<prodList.size(); cnt++){
			lstTPackingB.add(prodMap.get(prodList.get(cnt)));
		}

		//出荷検品ワークの登録
		List<WHtShipping> lstWHtShipping = new ArrayList<WHtShipping>();
		for (TPackingB tPackingB : lstTPackingB) {
			TPackingH tPackingH = tPackingB.chaseTPackingH();
			TPickingB tPickingB = tPackingB.chaseTPickingB();
			TShippingInstB tShippingInstB = tPickingB.chaseTShippingInstB();
			TShippingInstH tShippingInstH = tShippingInstB.chaseTShippingInstH();
			MProduct mProduct = tShippingInstB.chaseMProduct();

			WHtShipping entity = new WHtShipping();
			entity.setMacAddress(wHtShipping.getMacAddress());
			entity.setAllocInstHId(tPackingH.getAllocInstHId());		//追加した項目
			entity.setCenterId(wHtShipping.getCenterId());
			entity.setClientId(wHtShipping.getClientId());

			entity.setPickingWorkNo(tPackingH.getShippingPackingNo());
			entity.setProductId(mProduct.getProductId());
			entity.setProductCd(mProduct.getProductCd());
			entity.setProductNm(mProduct.getProductNm());
			entity.setJanCd(mProduct.getJanCd());
			entity.setInstNum(tPackingB.getPackingNum());
			entity.setSpgQtyOns(WCC.ZERO);
			entity.setSpgQtyRemain(tPackingB.getPackingNum());
			entity.setPieceNo(1l);
			entity.setSpgWorkComment(tShippingInstH.getPickingWorkMessage());
			if(tPackingB.getBoxId()!=null){
				entity.setBoxId(Long.parseLong(tPackingB.getBoxId()));
			}
			lstWHtShipping.add(entity);
		}
		wHtShippingBhv.batchInsert(lstWHtShipping);
	}
	// [C-CWMS-0051] 出荷梱包No.で検品する処理追加 2015.12.09 NayZaw End

	//【C-CWMS-0040】 前「出荷検品中断ワーク」テーブルから取得より「出荷検品中断」テーブルから取得するように更新  2015/09/11  Nay Zaw UPDATE Start

	/**
	 * <h2>出荷検品ワークを登録する(出荷検品中断から)。</h2>
	 * <pre>
	 * 引数を条件に、出荷検品中断データ、商品マスタデータ、荷材マスタデータ、出荷作業備考を取得し、
	 * 出荷検品ワークデータに設定後、登録する。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：荷主ID・センタID・MACアドレス・出庫作業No.
	 */
	public void insertWHtShippingFromInterrupt(WHtShipping wHtShipping) {

		//出荷検品中断テーブルのデータ取得
		WShippingInterruptCB wShippingInterruptCB = wShippingInterruptBhv.newMyConditionBean();
		wShippingInterruptCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wShippingInterruptCB.query().setClientId_Equal(wHtShipping.getClientId());
		wShippingInterruptCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());

		List<WShippingInterrupt> lstWShippingInterrupt = wShippingInterruptBhv.selectList(wShippingInterruptCB);

		//出荷検品ワークの登録
		List<WHtShipping> lstWHtShipping = new ArrayList<WHtShipping>();
		for (WShippingInterrupt wShippingInterrupt : lstWShippingInterrupt) {
			WHtShipping entity = new WHtShipping();
			entity.setMacAddress(wHtShipping.getMacAddress());		//出荷検品中断テーブルからではなくて使っているハンディのMACアドレスを入れる
			entity.setAllocInstHId(wShippingInterrupt.getAllocInstHId());
			entity.setCenterId(wShippingInterrupt.getCenterId());
			entity.setClientId(wShippingInterrupt.getClientId());

			entity.setPickingWorkNo(wShippingInterrupt.getPickingWorkNo());
			entity.setProductId(wShippingInterrupt.getProductId());

			MProductCB mProductCB = mProductBhv.newMyConditionBean();
			mProductCB.query().setProductId_Equal(wShippingInterrupt.getProductId());
			MProduct mProduct = mProductBhv.selectEntity(mProductCB);
			entity.setProductCd(mProduct.getProductCd());
			entity.setProductNm(mProduct.getProductNm());
			entity.setJanCd(mProduct.getJanCd());
			entity.setInstNum(wShippingInterrupt.getInstNum());
			entity.setSpgQtyOns(wShippingInterrupt.getSpgQtyOns());
			entity.setSpgQtyRemain(wShippingInterrupt.getSpgQtyRemain());

			if(wShippingInterrupt.getPieceNo() != null){
				entity.setPieceNo(wShippingInterrupt.getPieceNo());
			}
			else{
				entity.setPieceNo(0l);
			}
			if(wShippingInterrupt.getBoxId() != null)
			{
				entity.setBoxId(wShippingInterrupt.getBoxId());
				MBoxCB mBoxCB = mBoxBhv.newMyConditionBean();
				mBoxCB.query().setBoxId_Equal(wShippingInterrupt.getBoxId());
				MBox mBox = mBoxBhv.selectEntity(mBoxCB);
				entity.setBoxCd(mBox.getBoxCd());
				entity.setBoxNm(mBox.getBoxNm());
			}

			//出荷作業備考データ取得
			TShippingInstHCB tShippingInstHCB =tShippingInstHBhv.newMyConditionBean();
			tShippingInstHCB.query().setCenterId_Equal(wHtShipping.getCenterId());
			tShippingInstHCB.query().setClientId_Equal(wHtShipping.getClientId());
//			tShippingInstHCB.query().setAllocInstHId_Equal(wHtShipping.getAllocInstHId());
			tShippingInstHCB.query().setAllocInstHId_Equal(wShippingInterrupt.getAllocInstHId());

			List<TShippingInstH> lstTShippingInstH = tShippingInstHBhv.selectList(tShippingInstHCB);
			String tempComment=null;
			for(TShippingInstH instH : lstTShippingInstH){
				tempComment = tempComment + instH.getPickingWorkMessage();
			}
			entity.setSpgWorkComment(tempComment);

			lstWHtShipping.add(entity);
		}
		wHtShippingBhv.batchInsert(lstWHtShipping);
	}
//	【C-CWMS-0040】 前「出荷検品中断ワーク」テーブルから取得より「出荷検品中断」テーブルから取得するように更新  2015/09/11 NayZaw UPDATE End

//	【C-CWMS-0040】「出荷検品中断」テーブルで存在しない項目を設定いらない為、削除 2015/09/11 NayZaw UPDATE Start

	/**
	 * <h2>中断処理を実施する。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークテーブルのデータを取得する。
	 * 出荷検品中断ID(自動採番)を採番後、取得したデータを出荷検品中断データに設定し、登録する。
	 * 【出荷共通ロジック.出荷検品ワークテーブルの削除】を実行後、【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】を判定する。
	 * 出庫作業No.の場合、【出荷共通ロジック.出庫ステータス(検品中断)】を実行する。
	 * 出荷梱包No.の場合、【出荷共通ロジック.梱包ステータス(検品中断)】を実行する。
	 *
	 * 【出荷共通ロジック.出荷検品ワークテーブルの削除】
	 * ・{@link ShippingLogic#clearWHtShipping(WHtShipping) 出荷検品ワークテーブルの削除メソッド}を呼び出す。
	 *
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】
	 * ・{@link ShippingLogic#checkPickingWorkNoOrPackingNo(WHtShipping) 出庫作業No.か出荷梱包No.かチェックメソッド}を呼び出す。
	 *
	 * 【出荷共通ロジック.出庫ステータス(検品中断)】
	 * ・{@link ShippingLogic#updatePickingStatus(WHtShipping, CDef.CenterPickingStatus) 出庫ステータス(検品中断)メソッド}を呼び出す。
	 *
	 * 【出荷共通ロジック.梱包ステータス(検品中断)】
	 * ・{@link ShippingLogic#updatePackingStatus(WHtShipping, CDef.CenterPackingStatus) 梱包ステータス(検品中断)メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：出庫作業No.・MACアドレス・荷主ID・センタID
	 */
	public void insertWShippingInterrupt(WHtShipping wHtShipping){
		//出荷検品ワークテーブルのデータ取得
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
//		wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());

		List<WHtShipping> lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);

		//出荷検品中断の登録
		List<WShippingInterrupt> lstWShippingInterrupt = new ArrayList<WShippingInterrupt>();
		for (WHtShipping entity : lstWHtShipping) {
			WShippingInterrupt wShippingInterrupt = new WShippingInterrupt();
			wShippingInterrupt.setShippingInstHId(Long.parseLong(numberingLogic.getNumbering(WmsNumberingConst.SHIPPING_INST_H_ID)));

//			TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
//			tPickingHCB.query().setPickingWorkNo_Equal(entity.getPickingWorkNo());
			//TPickingHCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
			wShippingInterrupt.setAllocInstHId(entity.getAllocInstHId());
			wShippingInterrupt.setCenterId(entity.getCenterId());
			wShippingInterrupt.setClientId(entity.getClientId());
			wShippingInterrupt.setUserCd(wHtShipping.getUpdUser());
			wShippingInterrupt.setPickingWorkNo(entity.getPickingWorkNo());
			wShippingInterrupt.setProductId(entity.getProductId());
			wShippingInterrupt.setInstNum(entity.getInstNum());
			wShippingInterrupt.setSpgQtyOns(entity.getSpgQtyOns());
			wShippingInterrupt.setSpgQtyRemain(entity.getSpgQtyRemain());
			if(entity.getPieceNo()!=0){
				wShippingInterrupt.setPieceNo(entity.getPieceNo());
			}
			else{
				wShippingInterrupt.setPieceNo(null);
			}
			wShippingInterrupt.setBoxId(entity.getBoxId());

			lstWShippingInterrupt.add(wShippingInterrupt);
		}
		wShippingInterruptBhv.batchInsert(lstWShippingInterrupt);

		//出荷検品ワークテーブルをクリア
		shippingLogic.clearWHtShipping(wHtShipping);

		// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw Start
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShipping.getCenterId();
		final String targetNo = wHtShipping.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			//出庫ステータスの更新(出庫ステータス = 45: 検品中断)
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			shippingLogic.updatePickingStatus(wHtShipping, CDef.PickingStatus.$45);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			shippingLogic.updatePackingStatus(wHtShipping, CDef.PackingStatus.$45);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
	}

//	【C-CWMS-0040】「出荷検品中断」テーブルで存在しない項目を設定いらない為、削除 2015/09/11 NayZaw UPDATE End

	/**
	 * <h2>梱包情報を登録する。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークテーブルのデータを取得し、【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】を行う。
	 * 出庫作業No.の場合、出庫作業No.と紐付く出庫データを検索し、【箱登録ロジック.箱登録】を実行する。
	 * 出荷梱包No.の場合、出荷梱包No.と紐付く梱包データを検索し、【箱登録ロジック.箱登録(出荷梱包No.で検品)】を実行する。
	 *
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】
	 * ・{@link ShippingLogic#checkPickingWorkNoOrPackingNo(WHtShipping) 出庫作業No.か出荷梱包No.かチェックメソッド}を呼び出す。
	 *
	 * 【箱登録ロジック.箱登録】
	 * ・{@link PackingInsertLogic#insert(TPickingH, List, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 箱登録メソッド}を呼び出す。
	 *
	 * 【箱登録ロジック.箱登録(出荷梱包No.で検品)】
	 * ・{@link PackingInsertLogic#insertByPackingNo(TPackingH, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 箱登録(出荷梱包No.で検品)メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：出庫作業No.・MACアドレス・荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	// [2.1.0-CT-057]対応修正 引数「エラーステータス」を追加 2016.11.25 nayzaw
	public void insertPacking(WHtShipping wHtShipping, ErrorStatus errSts) {
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
		// [ON推-品向-414] 出庫作業No、個口番号でソート 2014.12.5 watanabe Start
		wHtShippingCB.query().addOrderBy_PickingWorkNo_Asc();
		wHtShippingCB.query().addOrderBy_PieceNo_Asc();
		// [ON推-品向-414] 出庫作業No、個口番号でソート 2014.12.5 watanabe End

		List<WHtShipping> lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);

		if (lstWHtShipping.size() > 0) {
			// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.11 NayZaw Start
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  Start
			// パラメータマスタデータを取得
			MClientCenter mClientCenter = new MClientCenter();
			mClientCenter.setClientId(wHtShipping.getClientId());
			mClientCenter.setCenterId(wHtShipping.getCenterId());
			MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  End

			final long centerId = wHtShipping.getCenterId();
			final String targetNo = wHtShipping.getPickingWorkNo();

			if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
				// 出庫作業No.

				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

				TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
				// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki Start

				//【C-CWMS-0040】「出荷検品中断」テーブルで「pickingBId」がないためtPickingH,lstAllocInstH の取得方法を変更 2015/09/17 Nay Zaw Start
				tPickingHCB.query().setCenterId_Equal(wHtShipping.getCenterId());
				tPickingHCB.query().setClientId_Equal(wHtShipping.getClientId());
				tPickingHCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
				// 出庫ヘッダ
				//tPickingH = new TPickingH();
				TPickingH tPickingH = tPickingHBhv.selectEntity(tPickingHCB);
				List<TPackingB> lstTPackingB = new ArrayList<TPackingB>();

				// [#2913] 梱包明細修正画面 以外からの呼出の場合、届先情報変更は不要のため引当指示ヘッダの引数削除 2018.02.07 kawana

				for (WHtShipping entity : lstWHtShipping) {

					TPackingB tPackingB = new TPackingB();
					tPackingB.setProductCd(entity.getProductCd());
					tPackingB.setPackingNum(entity.getSpgQtyOns());
					tPackingB.setBoxId(entity.getBoxId().toString());
					tPackingB.setBoxCd(entity.getPieceNo().toString());
					lstTPackingB.add(tPackingB);

					// [#2913] 梱包明細修正画面 以外からの呼出の場合、届先情報変更は不要のため引当指示ヘッダの引数削除 2018.02.07 kawana
				}
				// [#2913] 梱包明細修正画面 以外からの呼出の場合、届先情報変更は不要のため引当指示ヘッダの引数削除 2018.02.07 kawana Start
				//【C-CWMS-0040】「出荷検品中断」テーブルで「pickingBId」がないためtPickingH,lstAllocInstH の取得方法を変更 2015/09/17 Nay Zaw End
				packingInsertLogic.insert(tPickingH, lstTPackingB, new ErrorStatus());
				// [#2913] 梱包明細修正画面 以外からの呼出の場合、届先情報変更は不要のため引当指示ヘッダの引数削除 2018.02.07 kawana End

				// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana Start
				// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  Start

				// ===== 荷札自動印刷 =====

				// [#360] 検品後荷札出力フラグの区分値を0始まりに変更 2016.12.12 kawana Start
				// [Ver3.1][#5118]荷札自動発行ロジック変更に伴い荷札出力フラグの条件文を削除 2018.09.19 matsumoto Del

				// [#360] 検品後荷札出力フラグの区分値を0始まりに変更 2016.12.12 kawana End

				// [2.1.0-CT-057]対応修正 パラメータからの「エラーステータス」を使用する 2016.11.28 nayzaw Start
				// [Ver3.1][#5118] 荷札自動発行ロジック変更 2018.09.18 matsumoto Start
				// 荷札発行メソッド呼出し
				shippingInspectAutoPrintLogic.printPiecePickingH(tPickingH, mParam, errSts);
				// [Ver3.1][#5118] 荷札自動発行ロジック変更 2018.09.18 matsumoto End
				// [2.1.0-CT-057]対応修正 パラメータからの「エラーステータス」を使用する 2016.11.28 nayzaw End
				if (0 < getErrorManager().size()) {
					return;
				}

				// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  End
				// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana End
				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
			} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
				// 出荷梱包No.

				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

				TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
				tPackingHCB.query().setCenterId_Equal(lstWHtShipping.get(0).getCenterId());
				tPackingHCB.query().setClientId_Equal(lstWHtShipping.get(0).getClientId());
				tPackingHCB.query().setShippingPackingNo_Equal(lstWHtShipping.get(0).getPickingWorkNo());
				//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add Start
				tPackingHCB.query().setMixedFlg_Equal_$1();//混載フラグが1:混載
				//[ON推-1.1.4-CT-048]CT指摘の修正対応 2016.05.24 chou Add End

				TPackingH tPackingH = tPackingHBhv.selectEntity(tPackingHCB);
				// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
				tPackingH.setBoxId(lstWHtShipping.get(0).getBoxId());
				// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
				packingInsertLogic.insertByPackingNo(tPackingH, new ErrorStatus());

				// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana Start
				// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  Start

				// ===== 荷札自動印刷 =====

				// [#360] 検品後荷札出力フラグの区分値を0始まりに変更 2016.12.12 kawana Start
				// [Ver3.1][#5118]荷札自動発行ロジック変更に伴い荷札出力フラグの条件文を削除 2018.09.19 matsumoto Del
				// [#360] 検品後荷札出力フラグの区分値を0始まりに変更 2016.12.12 kawana End

				// [2.1.0-CT-057]対応修正 パラメータからの「エラーステータス」を使用する 2016.11.28 nayzaw Start
				// [Ver3.1][#5118] 荷札自動発行ロジック変更 2018.09.18 matsumoto Start
				// 荷札発行メソッド呼出し
				shippingInspectAutoPrintLogic.printPiecePackingH(tPackingH, mParam, errSts );
				// [Ver3.1][#5118] 荷札自動発行ロジック変更 2018.09.18 matsumoto End
				// [2.1.0-CT-057]対応修正 パラメータからの「エラーステータス」を使用する 2016.11.28 nayzaw End
				if (0 < getErrorManager().size()) {
					return;
				}

				// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  End
				// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana End
				// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
			}
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.11 NayZaw End
		}
	}

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  Start
	/**
	 * <h2>出庫帳票を更新する。</h2>
	 * <pre>
	 * 出庫帳票のコントロールNo.を更新する。
	 * 出庫帳票を更新する。
	 *
	 * </pre>
	 * @param update 出庫帳票(更新用)
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・出庫作業No.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public int tPickingRUpdate(TPickingR update, TPickingH tPickingH, ErrorStatus errSts) {

		// ===== 出庫帳票更新 =====
		// 更新条件作成
		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.setupSelect_TPickingH();
		cb.checkInvalidQuery();
		cb.query().queryTPickingH().setClientId_Equal(tPickingH.getClientId());
		cb.query().queryTPickingH().setCenterId_Equal(tPickingH.getCenterId());
		cb.query().queryTPickingH().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());

		// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana Start
		// 出庫帳票の更新
		return tPickingRBhv.queryUpdate(update, cb);
		// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana End
	}

	/**
	 * <h2>梱包帳票を更新する。</h2>
	 * <pre>
	 * 梱包帳票のコントロールNo.を更新する。
	 * 梱包帳票を更新する。
	 *
	 * </pre>
	 * @param update 梱包帳票(更新用)
	 * @param tPackingH 梱包ヘッダ：荷主ID・センタID・出荷梱包No.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public int tPackingRUpdate(TPackingR update, TPackingH tPackingH, ErrorStatus errSts) {

		// ===== 梱包帳票更新 =====
		// 更新条件作成
		TPackingRCB cb = tPackingRBhv.newMyConditionBean();
		cb.setupSelect_TPackingH();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setClientId_Equal(tPackingH.getClientId());
		cb.query().queryTPackingH().setCenterId_Equal(tPackingH.getCenterId());
		cb.query().queryTPackingH().setShippingPackingNo_Equal(tPackingH.getShippingPackingNo());

		// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana Start
		// 梱包帳票の更新
		return tPackingRBhv.queryUpdate(update, cb);
		// [#193][2.1.0-CT-032] 荷札自動印刷対応 2016.11.11 kawana End
	}

	/**
	 * コントロールNoのクリア
	 * @param report 出庫帳票(検索用)：コントロールNo.
	 */
	public void clearControlNo(TPickingR report) {

		// ===== 出庫帳票更新 =====
		// 更新条件作成
		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());

		// 更新項目作成
		TPickingR update = new TPickingR();
		update.setControlNo(null);

		// 出庫帳票更新
		tPickingRBhv.queryUpdate(update, cb);
	}

	/**
	 * コントロールNoのクリア
	 * @param report 梱包帳票(検索用)：コントロールNo.
	 */
	public void clearControlNo(TPackingR report) {

		// ===== 梱包帳票更新 =====
		// 更新条件作成
		TPackingRCB cb = tPackingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());

		// 更新項目作成
		TPackingR update = new TPackingR();
		update.setControlNo(null);

		// 梱包帳票更新
		tPackingRBhv.queryUpdate(update, cb);
	}
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/16  End
}