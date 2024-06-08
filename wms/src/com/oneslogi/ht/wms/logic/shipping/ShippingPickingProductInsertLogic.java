package com.oneslogi.ht.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.hook.AccessContext;

import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
//import com.oneslogi.wms.;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * バラオーダーピッキング検品(商品)登録ロジッククラス
 */
public class ShippingPickingProductInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	// [#581] ケース荷姿が設定されていない商品を含むバラピッキングでエラー発生(同様の処理を共通化で不要になったソースを削除) 2017.01.12 kawana

	/* 出庫ボディ         */
	@Inject
	private TPickingBBhv tPickingBBhv;

	/* 出荷検品ワーク     */
	@Inject
	private WHtShippingPickingBhv wHtShippingPickingBhv;

	// [C-CWMS-0051] 出荷梱包Noでピッキングする場合為追加 2015.12.16 NayZaw Start
	/*梱包ボディ          */
	@Inject
	private TPackingBBhv tPackingBBhv;

	// [Ver3.0] unit of measure対応 2017.11.24 王 Del

	// [C-CWMS-0051] 出荷梱包Noでピッキングする場合為追加 2015.12.16 NayZaw End

	//ピッキング作業は「出荷ピッキングワーク」テーブルを使用するように修正。 2015/09/14 Start Nay Zaw
	/**
	 * <h2>出荷ピッキングワークを登録する。</h2>
	 * <pre>
	 * 引数を条件に出庫ボディ情報を検索する。
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 *
	 * 商品、ロケーション、ロット単位でケース荷姿入数の取得・出庫数（指示数）の合計値算出を行い、
	 * 取得した結果を基に出荷ピッキングワークデータを登録する。
	 *
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：センタID・荷主ID・MACアドレス・出庫作業No.
	 */
	public void insertWHtShippingPicking(WHtShippingPicking wHtShippingPicking) {
		//出庫ヘッダ情報の取得
		TPickingBCB tPickingBCB = tPickingBBhv.newMyConditionBean();
		tPickingBCB.setupSelect_TShippingInstB();
		//tPickingBCB.setupSelect_TShippingInstB().withMLocation();
		//tPickingBCB.setupSelect_TShippingInstB().withMProduct();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		tPickingBCB.setupSelect_TStock();
		tPickingBCB.setupSelect_TStock().withMProduct();
		tPickingBCB.setupSelect_TStock().withTLot();
		tPickingBCB.setupSelect_TStock().withMLocation();
		tPickingBCB.setupSelect_TStock().withMLocation().withMZone();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		tPickingBCB.query().queryTPickingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		tPickingBCB.query().queryTPickingH().setClientId_Equal(wHtShippingPicking.getClientId());
		tPickingBCB.query().queryTPickingH().setPickingWorkNo_Equal(wHtShippingPicking.getPickingWorkNo());
		// [C-CWMS-0051]荷姿がケース以外を追加する 2015.12.17 NayZaw Start
		tPickingBCB.query().setShapeId_IsNull();
		// [C-CWMS-0051]荷姿がケース以外を追加する 2015.12.17 NayZaw End

		// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動(不要な条件を削除) 2015.10.30 kawana
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		tPickingBCB.query().queryTStock().queryMLocation().queryMZone().addOrderBy_PickingOrder_Asc();
		tPickingBCB.query().queryTStock().queryMLocation().addOrderBy_PickingOrder_Asc();
		tPickingBCB.query().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
		tPickingBCB.query().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
		tPickingBCB.query().queryTStock().queryTLot().addOrderBy_Lot_Asc();
		tPickingBCB.query().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

		List<TPickingB> lstTPickingB = tPickingBBhv.selectList(tPickingBCB);

		//[ON推-品向-1112] 修正対応 2016.4.15 chou Add Start
		if (lstTPickingB == null || lstTPickingB.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return;
		}

		// [#581] ケース荷姿が設定されていない商品を含むバラピッキングでエラー発生(同様の処理を共通化で不要になったソースを削除) 2017.01.12 kawana

		//[ON推-品向-1112] 修正対応 2016.4.15 chou Add End

		BigDecimal instNum = WCC.ZERO;
		long locationIdBef = 0;
		long productIdBef = 0;
		long lotIdBef = 0;

		WHtShippingPicking entity = new WHtShippingPicking();

		//取得した件数分ループ
		for (int row = 0; row < lstTPickingB.size(); row++) {
			//データを1件取得
			TPickingB tmpPickB = lstTPickingB.get(row);

			//登録に必要な情報を修得
			//TShippingInstB tShippingInstB = tmpPickB.chaseTShippingInstB();
			//MLocation mLocation = tShippingInstB.chaseMLocation();
			//MProduct mProduct = tShippingInstB.getMProduct();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			TStock tStock = tmpPickB.chaseTStock();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			MProduct mProduct = tStock.chaseMProduct();
			TLot tLot = tStock.chaseTLot();
			MLocation mLocation = tStock.chaseMLocation();

			// [#581] ケース荷姿が設定されていない商品を含むバラピッキングでエラー発生(同様の処理を共通化で不要になったソースを削除) 2017.01.12 kawana

			//表示内容が変わったらINSERT処理後にエンティティ編集
			//[ON推]変数名の修正 2016.04.20 chou Mod Start
			if (productIdBef != mProduct.getProductId() ||
				locationIdBef != mLocation.getLocationId() ||
			//[ON推]変数名の修正 2016.04.20 chou Mod End
				lotIdBef != tLot.getLotId()) {

				//ループ初回時はINSERT処理は行わない
				if (row != 0) {
					//ワークテーブルにINSERT
					wHtShippingPickingBhv.insert(entity);

					//指示数合計値をクリア
					instNum = WCC.ZERO;
				}

				//指示数の合計に加算
				instNum = WCC.add(instNum, tmpPickB.getPickingNum());

				//エンティティ編集
				entity.setMacAddress(wHtShippingPicking.getMacAddress());
				entity.setClientId(wHtShippingPicking.getClientId());
				entity.setCenterId(wHtShippingPicking.getCenterId());
				entity.setPickingBId(tmpPickB.getPickingBId());
				entity.setPickingWorkNo(wHtShippingPicking.getPickingWorkNo());
				entity.setProductId(mProduct.getProductId());
				entity.setProductCd(mProduct.getProductCd());
				entity.setProductNm(mProduct.getProductNm());
				// [Ver3.0] unit of measure対応 2017.11.24 王 Del
				entity.setLocationId(mLocation.getLocationId());
				entity.setLocationCd(mLocation.getLocationCd());
				entity.setLocationNm(mLocation.getLocationNm());
				entity.setLotId(tLot.getLotId());
				entity.setLot(tLot.getLot());
				entity.setInstNum(instNum);
				entity.setLimitDt(tLot.getLimitDt());
				entity.setWorkStartDt(AccessContext.getAccessTimestampOnThread());
				entity.setPickingFlg("0"); //初期状態は未検品
				entity.setSkipNum(new Long(0));
				entity.setSpgQtyOns(WCC.ZERO); //2015/04/27 KAI ADD カウントアップ対応

				//比較値を退避
				//[ON推]変数名の修正 2016.04.20 chou Mod Start
				productIdBef = mProduct.getProductId();
				locationIdBef = mLocation.getLocationId();
				//[ON推]変数名の修正 2016.04.20 chou Mod End
				lotIdBef = tLot.getLotId();

			} else {
				//指示数の合計に加算
				instNum = WCC.add(instNum, tmpPickB.getPickingNum());

				//加算した数量をセット
				entity.setInstNum(instNum);
			}
		}
		//最終データをワークテーブルにINSERT
		wHtShippingPickingBhv.insert(entity);
	}

	//[C-CWMS-0051] 出荷梱包No.でバラピッキング検品する処理追加 2015.12.14 NayZaw Start
	/**
	 * <h2>出荷ピッキングワークを登録する。</h2>
	 * <pre>
	 * 引数を条件に梱包ボディ情報を検索する。
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 *
	 * 商品、ロケーション、ロット単位でケース荷姿入数の取得・梱包数（指示数）の合計値算出を行い、
	 * 取得した結果を基に出荷ピッキングワークデータを登録する。
	 * </pre>
	 * @param wHtShippingPicking 出荷ピッキングワーク：センタID・荷主ID・MACアドレス・出庫作業No.( 出荷梱包No.)
	 */
	public void insertWHtShippingPickingByPackingNo(WHtShippingPicking wHtShippingPicking) {

		TPackingBCB tPackingBCB = tPackingBBhv.newMyConditionBean();
		tPackingBCB.setupSelect_TPickingB();
		tPackingBCB.setupSelect_TPickingB().withTShippingInstB();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		tPackingBCB.setupSelect_TPickingB().withTStock();
		tPackingBCB.setupSelect_TPickingB().withTStock().withMProduct();
		tPackingBCB.setupSelect_TPickingB().withTStock().withTLot();
		tPackingBCB.setupSelect_TPickingB().withTStock().withMLocation();
		tPackingBCB.setupSelect_TPickingB().withTStock().withMLocation().withMZone();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

		tPackingBCB.query().queryTPackingH().setCenterId_Equal(wHtShippingPicking.getCenterId());
		tPackingBCB.query().queryTPackingH().setClientId_Equal(wHtShippingPicking.getClientId());
		tPackingBCB.query().queryTPackingH().setShippingPackingNo_Equal(wHtShippingPicking.getPickingWorkNo());

		//[ON推-1.1.4-CT-067]CT指摘の修正対応 2016.05.26 chou Add Start
		tPackingBCB.query().queryTPackingH().setMixedFlg_Equal_$1();//混載フラグが1:混載
		//[ON推-1.1.4-CT-067]CT指摘の修正対応 2016.05.26 chou Add End

		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		tPackingBCB.query().queryTPickingB().queryTStock().queryMLocation().queryMZone().addOrderBy_PickingOrder_Asc();
		tPackingBCB.query().queryTPickingB().queryTStock().queryMLocation().addOrderBy_PickingOrder_Asc();
		tPackingBCB.query().queryTPickingB().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
		tPackingBCB.query().queryTPickingB().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
		tPackingBCB.query().queryTPickingB().queryTStock().queryTLot().addOrderBy_Lot_Asc();
		tPackingBCB.query().queryTPickingB().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

		List<TPackingB> lstTPackingB = tPackingBBhv.selectList(tPackingBCB);

		// [ver3.0][#3695] 検索結果が0件の場合エラーを返す 2018.02.14 matsumoto Start
		if (lstTPackingB == null || lstTPackingB.size() == 0) {
			// 該当データなし
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return;
		}
		// [ver3.0][#3695] 検索結果が0件の場合エラーを返す 2018.02.14 matsumoto End

		BigDecimal instNum = WCC.ZERO;
		long locationIdBef = 0;
		long productIdBef = 0;
		long lotIdBef = 0;

		WHtShippingPicking entity = new WHtShippingPicking();

		//取得した件数分ループ
		for (int row = 0; row < lstTPackingB.size(); row++) {
			//データを1件取得
			TPackingB tmpPackB = lstTPackingB.get(row);

			//登録に必要な情報を修得
			TPickingB tPickingB = tmpPackB.chaseTPickingB();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			TStock tStock = tPickingB.chaseTStock();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			MProduct mProduct = tStock.chaseMProduct();
			TLot tLot = tStock.chaseTLot();
			MLocation mLocation = tStock.chaseMLocation();

			// [#581] ケース荷姿が設定されていない商品を含むバラピッキングでエラー発生(同様の処理を共通化で不要になったソースを削除) 2017.01.12 kawana

			//表示内容が変わったらINSERT処理後にエンティティ編集
			if (locationIdBef != mProduct.getProductId() ||
				productIdBef != mLocation.getLocationId() ||
				lotIdBef != tLot.getLotId()) {

				//ループ初回時はINSERT処理は行わない
				if (row != 0) {
					//ワークテーブルにINSERT
					wHtShippingPickingBhv.insert(entity);

					//指示数合計値をクリア
					instNum = WCC.ZERO;
				}
				instNum = WCC.add(instNum, tmpPackB.getPackingNum());

				//エンティティ編集
				entity.setMacAddress(wHtShippingPicking.getMacAddress());
				entity.setClientId(wHtShippingPicking.getClientId());
				entity.setCenterId(wHtShippingPicking.getCenterId());
				entity.setPickingBId(tmpPackB.getPickingBId());
				entity.setPickingWorkNo(wHtShippingPicking.getPickingWorkNo());
				entity.setProductId(mProduct.getProductId());
				entity.setProductCd(mProduct.getProductCd());
				entity.setProductNm(mProduct.getProductNm());
				// [Ver3.0] unit of measure対応 2017.11.24 王 Del
				entity.setLocationId(mLocation.getLocationId());
				entity.setLocationCd(mLocation.getLocationCd());
				entity.setLocationNm(mLocation.getLocationNm());
				entity.setLotId(tLot.getLotId());
				entity.setLot(tLot.getLot());
				entity.setInstNum(instNum);
				entity.setLimitDt(tLot.getLimitDt());
				entity.setWorkStartDt(AccessContext.getAccessTimestampOnThread());
				entity.setPickingFlg("0"); //初期状態は未検品
				entity.setSkipNum(new Long(0));
				entity.setSpgQtyOns(WCC.ZERO); //2015/04/27 KAI ADD カウントアップ対応

				//比較値を退避
				locationIdBef = mProduct.getProductId();
				productIdBef = mLocation.getLocationId();
				lotIdBef = tLot.getLotId();

			} else {
				//指示数の合計に加算
				instNum = WCC.add(instNum, tmpPackB.getPackingNum());

				//加算した数量をセット
				entity.setInstNum(instNum);
			}
		}
		//最終データをワークテーブルにINSERT
		wHtShippingPickingBhv.insert(entity);
	}
	//[C-CWMS-0051] 出荷梱包No.でバラピッキング検品する処理追加 2015.12.14 NayZaw End
}