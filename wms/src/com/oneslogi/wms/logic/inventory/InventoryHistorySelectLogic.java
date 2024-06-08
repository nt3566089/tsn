package com.oneslogi.wms.logic.inventory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTInventoryInpHist;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInpHistCB;
import com.oneslogi.base.dbflute.exbhv.TInventoryInpHistBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInpHist;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 棚卸履歴検索データ取得ロジッククラス
 */
public class InventoryHistorySelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TInventoryInpHistBhv tInventoryInpHistBhv;

	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	/**
	 * <h2>棚卸履歴データを取得する。</h2>
	 * <pre>
	 * 受取った条件で棚卸履歴データを検索する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸日(From)・棚卸日(To)・荷主ID・センタID
	 * @param tInventoryB 棚卸ボディ：倉庫ID・入庫ラベルNo.
	 * @param tInventoryInst 棚卸指示：預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)
	 * @param mProduct 商品マスタ：商品CD
	 * @param zoneIdList ゾーンIDリスト：ゾーンID
	 * @param paging ページ検索
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<TInventoryInpHist> 棚卸入力履歴リスト
	 */
	public PagingResultBean<TInventoryInpHist> select(TInventoryH tInventoryH, TInventoryB tInventoryB,TInventoryInst tInventoryInst, MProduct mProduct, List<Long> zoneIdList, PagingData paging, ErrorStatus errSts) {

		// ===== 初期処理 =====
		PagingResultBean<TInventoryInpHist> result = null;

		MLocation mLocationExentity = new MLocation();
		mLocationExentity.setLocationCdFrom(tInventoryInst.getFromLocationCd());
		mLocationExentity.setLocationCdTo(tInventoryInst.getToLocationCd());
		LocationLogic LocationLogic = new LocationLogic();
		// 最小、最大ロケーションを取得する
		MLocation maxLocationCd = LocationLogic.getMaxLocationCd(mLocationExentity);
		if (maxLocationCd == null) {
			maxLocationCd = new MLocation();
		}
		MLocation minLocationCd = LocationLogic.getMinLocationCd(mLocationExentity);
		if (minLocationCd == null) {
			minLocationCd = new MLocation();
		}

		// ===== 棚卸入力データ取得 =====
		// 検索条件の設定
		TInventoryInpHistCB cb = tInventoryInpHistBhv.newMyConditionBean();
		cb.setupSelect_TInventoryB();
		cb.setupSelect_TInventoryB().withTInventoryH();
		// [検査-196] 明細行にゾーンを表示 2014.12.03 kawana Start
		cb.setupSelect_TInventoryB().withMLocation().withMZone();
		// [検査-196] 明細行にゾーンを表示 2014.12.03 kawana End
		//荷主センタ変更対応 201７.02.14 sja Start
		cb.setupSelect_TInventoryB().withTInventoryH().withMClient(); /*荷主マスタ*/
		cb.setupSelect_TInventoryB().withTInventoryH().withMCenter(); /*センタマスタ*/
		//荷主センタ変更対応 201７.02.14 sja End
		cb.setupSelect_TInventoryB().withMProduct();
		cb.setupSelect_TInventoryB().withMProduct().withMClient();
		cb.setupSelect_TInventoryB().withMStockType();
		cb.setupSelect_TInventoryB().withMStockType().withVDict(getCultureId());
		cb.setupSelect_TInventoryB().withMCustomerByDepositId();
		cb.setupSelect_TInventoryB().withMCustomerBySupplierId();
		//cb.setupSelect_TInventoryB().withTStoreNo();
		//cb.setupSelect_TInventoryB().withTStoreNo().withMCustomer();
		// [検査-196] 明細行に倉庫を表示 2014.12.03 kawana Start
		cb.setupSelect_TInventoryB().withMWarehouse();
		// [検査-196] 明細行に倉庫を表示 2014.12.03 kawana End
		// 棚卸日(From)
		cb.query().queryTInventoryB().queryTInventoryH().setInventoryDt_GreaterEqual(tInventoryH.getInventoryDtFrom());
		// 棚卸日(To)
		cb.query().queryTInventoryB().queryTInventoryH().setInventoryDt_LessEqual(tInventoryH.getInventoryDtTo());
		// 荷主ID
		cb.query().queryTInventoryB().queryTInventoryH().setClientId_Equal(tInventoryH.getClientId());
		// センタID
		cb.query().queryTInventoryB().queryTInventoryH().setCenterId_Equal(tInventoryH.getCenterId());
		// 倉庫ID
		cb.query().queryTInventoryB().setWarehouseId_Equal(tInventoryB.getWarehouseId());
		// 預託ID
		cb.query().queryTInventoryB().setDepositId_Equal(tInventoryInst.getDepositId());
		// 在庫区分ID
		cb.query().queryTInventoryB().setStockTypeId_Equal(tInventoryInst.getStockTypeId());
		// 最小ロケーション
		cb.query().queryTInventoryB().queryMLocation().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// 最大ロケーション
		cb.query().queryTInventoryB().queryMLocation().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		// ゾーンID
		cb.query().queryTInventoryB().queryMLocation().setZoneId_InScope(zoneIdList);
		// 商品CD
		cb.query().queryTInventoryB().queryMProduct().setProductCd_LikeSearch(mProduct.getProductCd(), new LikeSearchOption().likePrefix());
		// 入庫ラベルNo
		//cb.query().queryTInventoryB().setStoreLabelNo_LikeSearch(tInventoryB.getStoreLabelNo(), new LikeSearchOption().likePrefix());
		cb.query().queryTInventoryB().setStoreLabelNo_Equal(tInventoryB.getStoreLabelNo());
		// 最新フラグ
		//cb.query().setLastFlg_Equal_$1();
		// [ON推-品向-108] 明細棚卸ピース数に０を表示を修正しました 2014.11.20 zheng Start
		// 商品荷姿．入数
//			cb.specify().specifyTInventoryB().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
//				@Override
//				public void query(MProductShapeCB SubCB) {
//					SubCB.specify().columnUnitNum();
//					setDelFlg(SubCB);
//				}
//			}, TInventoryInpHist.SHAPE_UnitNum);
			// [ON推-品向-108] 明細棚卸ピース数に０を表示を修正しました 2014.11.20 zheng End
		//[ON推-品向-319]出力順は「棚卸入力画面」と合せっていました。 2014.11.28 衛 Start
		// ソート条件
		//棚卸日＞センタCD＞荷主CD＞倉庫CD＞ゾーンCD＞預託CD＞在庫区分CD＞ロケーションCD＞商品CD＞ロット＞期限日＞入庫ラベルNo.＞入力時間
		cb.query().queryTInventoryB().queryTInventoryH().addOrderBy_InventoryDt_Asc();
		cb.query().queryTInventoryB().queryTInventoryH().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTInventoryB().queryTInventoryH().queryMClient().addOrderBy_ClientCd_Asc();
		//[ON推-品向-319]出力順は「棚卸入力画面」と合せっていました。 2014.11.28 衛 End
		cb.query().queryTInventoryB().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
		cb.query().queryTInventoryB().queryMLocation().queryMZone().addOrderBy_ZoneCd_Asc();
		cb.query().queryTInventoryB().queryMCustomerByDepositId().addOrderBy_CustomerCd_Asc();
		cb.query().queryTInventoryB().queryMStockType().addOrderBy_StockTypeCd_Asc();
		cb.query().queryTInventoryB().queryMLocation().addOrderBy_LocationCd_Asc();
		cb.query().queryTInventoryB().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryTInventoryB().addOrderBy_Lot_Asc();
		cb.query().queryTInventoryB().addOrderBy_LimitDt_Asc();
		cb.query().queryTInventoryB().addOrderBy_StoreLabelNo_Asc();
		cb.query().addOrderBy_InputDt_Asc();

		// 検索実行
		result = selectPage(tInventoryInpHistBhv, cb, paging);
		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}
		// [Ver3.0] unit of measure対応 2017.11.22 駱 Start
		 else {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			tInventoryInpHistBhv.load(result, new ReferrerLoaderHandler<LoaderOfTInventoryInpHist>() {
				@Override
				public void handle(LoaderOfTInventoryInpHist loader) {
					loader.pulloutTInventoryB().pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
						@Override
						public void setup(MProductShapeCB subCB) {
							subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
							subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
							subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
							subCB.query().setDelFlg_Equal_$0();
							subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
						}
					});
				}
			});
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			Map<Long, String> decimalExistFlgMap = new HashMap<>();
			Map<Long, String> minimumUnitMap = new HashMap<>();
			Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
			Map<Long, List<String>> parentUnitMap = new HashMap<>();
			for (TInventoryInpHist inpHistB : result) {
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
				WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, inpHistB.getTInventoryB().getMProduct());
				// 商品最小荷姿単位名称
				inpHistB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, inpHistB.getTInventoryB().getMProduct()));
				// 入数内訳
				inpHistB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, inpHistB.getTInventoryB().getMProduct()));
				// 棚卸前内訳
				inpHistB.setInventoryBeforeBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, inpHistB.getTInventoryB().getChargeNum(), minimumUnitMap, parentUnitNumMap
						, parentUnitMap, inpHistB.getTInventoryB().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
				// 棚卸内訳
				inpHistB.setInventoryBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, inpHistB.getInventoryNum(), minimumUnitMap, parentUnitNumMap
						, parentUnitMap, inpHistB.getTInventoryB().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			}


		}
		// [Ver3.0] unit of measure対応 2017.11.22 駱 End
		return result;}

}
