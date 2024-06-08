package com.oneslogi.wms.logic.inventory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTInventoryB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInpHistCB;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;
/**
 * 棚卸在庫一括更新データ取得ロジッククラス
 */
public class InventoryAllUptSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/*棚卸ボディ*/
	@Inject
	private TInventoryBBhv tInventoryBBhv;
	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Delete
	/**
	 * <h2>棚卸データを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースから棚卸在庫一括更新データを取得する。
	 * 検索対象が見つからない場合、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸日・荷主ID・センタID・
	 * @param tInventoryInst 棚卸指示：ロケーションCD(From)・ロケーションCD(To)・預託ID・棚卸入力有、アンマッチ有
	 * @param tInventoryB 棚卸ボディ：倉庫ID・在庫区分ID・入庫ラベルNo.・入庫No.ID
	 * @param tProduct 商品マスタ：商品CD
	 * @param zoneIdList ゾーンマスタ：ゾーンID
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<TInventoryB> 棚卸ボディリスト
	 */
	// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
	public PagingResultBean<TInventoryB> select(TInventoryH tInventoryH, TInventoryInst tInventoryInst,TInventoryB tInventoryB,
			MProduct tProduct, List<Long> zoneIdList,PagingData paging, ErrorStatus errSts) {
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End
		PagingResultBean<TInventoryB> result = null;

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

		// ===== 棚卸在庫一括更新データ取得 =====

		// 検索条件の設定
		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
		cb.setupSelect_TInventoryH();
		cb.setupSelect_MProduct();
		// [検査-144] 明細行にゾーンを表示 2014.12.03 kawana Start
		cb.setupSelect_MLocation().withMZone();
		// [検査-144] 明細行にゾーンを表示 2014.12.03 kawana End
		cb.setupSelect_MCustomerByDepositId();
		cb.setupSelect_TLot();
		cb.setupSelect_MWarehouse();
		cb.setupSelect_TStoreNo().withMCustomer();
		cb.setupSelect_TStock();
		cb.setupSelect_MShape();
		cb.setupSelect_MStockType();
		cb.setupSelect_MStockType().withVDict(getCultureId());  /*在庫区分マスタ*/
		cb.setupSelect_TInventoryH().withMClient(); /*荷主マスタ*/
		cb.setupSelect_TInventoryH().withMCenter(); /*センタマスタ*/
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByStockAdjustFlg();
		cb.setupSelect_BClassDtlByStockAdjustFlg().withVDict(getCultureId());

		cb.setupSelect_MCustomerBySupplierId();

		cb.query().queryTInventoryH().setInventoryDt_Equal(tInventoryH.getInventoryDt()); //棚卸日
		cb.query().queryTInventoryH().setClientId_Equal(tInventoryH.getClientId());       //荷主ID
		cb.query().queryTInventoryH().setCenterId_Equal(tInventoryH.getCenterId());       //センタID
		cb.query().setWarehouseId_Equal(tInventoryB.getWarehouseId());                    //倉庫ID
		cb.query().setDepositId_Equal(tInventoryInst.getDepositId());                     //預託ID
		cb.query().setStockTypeId_Equal(tInventoryB.getStockTypeId());                 //在庫区分ID
		MLocation mLocation = new MLocation();
		mLocation.setLocationCdFrom(tInventoryInst.getFromLocationCd());
		mLocation.setLocationCdTo(tInventoryInst.getToLocationCd());
		// 最小ロケーション
		cb.query().queryMLocation().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// 最大ロケーション
		cb.query().queryMLocation().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		 //ゾーンID
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
		cb.query().queryMLocation().setZoneId_InScope(zoneIdList);
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End
		cb.query().queryMProduct().setProductCd_PrefixSearch(tProduct.getProductCd()); //商品CD
		cb.query().setStoreLabelNo_Equal(tInventoryB.getStoreLabelNo());
		cb.query().setStoreNoId_Equal(tInventoryB.getStoreNoId());
		// 入力日時
		cb.specify().derivedTInventoryInpHistList().max(new SubQuery<TInventoryInpHistCB>(){
			@Override
			public void query(TInventoryInpHistCB SubCB) {
			SubCB.specify().columnInputDt();
			// [Ver3.0][#4727] 最新の入力日時を取得するよう修正 2018.06.15 matsumoto Start
			SubCB.query().setLastFlg_Equal_$1();
			// [Ver3.0][#4727] 最新の入力日時を取得するよう修正 2018.06.15 matsumoto End
			setDelFlg(SubCB);
			}
		}, TInventoryB.ALIAS_InputDt);
		// 登録ユーザ
		cb.specify().derivedTInventoryInpHistList().max(new SubQuery<TInventoryInpHistCB>(){
			@Override
			public void query(TInventoryInpHistCB SubCB) {
			SubCB.specify().columnAddUser();
			// [Ver3.0][#4727] 最新の入力者情報を取得するよう修正 2018.06.15 matsumoto Start
			SubCB.query().setLastFlg_Equal_$1();
			// [Ver3.0][#4727] 最新の入力者情報を取得するよう修正 2018.06.15 matsumoto End
			setDelFlg(SubCB);

			}
		}, TInventoryB.ALIAS_AddUser);
		// [ON推-品向-110] ケース入数０の場合、明細棚卸ピース数に０を表示を修正しました 2014.11.20 zheng Start
		// 商品荷姿．入数
		cb.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
			@Override
			public void query(MProductShapeCB SubCB) {
				SubCB.specify().columnUnitNum();
				setDelFlg(SubCB);
			}
		}, TInventoryB.SHAPE_UnitNum);
		// [ON推-品向-110] ケース入数０の場合、明細棚卸ピース数に０を表示を修正しました 2014.11.20 zheng End
		// [SK2-022] 「棚卸入力有」の検索条件を棚卸入力画面と同じ条件に変更 2014.12.10 kawana Start
		if (tInventoryInst.isStockTakingInput$1()) {
			// 棚卸入力有のみ表示

			cb.query().existsTInventoryInpHistList(new SubQuery<TInventoryInpHistCB>() {
				public void query(TInventoryInpHistCB subCB) {

				}
			});
		} else if (tInventoryInst.isStockTakingInput$0()) {
			// 棚卸入力無のみ表示

			cb.query().notExistsTInventoryInpHistList(new SubQuery<TInventoryInpHistCB>() {
				public void query(TInventoryInpHistCB subCB) {

				}
			});
		}
		// [SK2-022] 「棚卸入力有」の検索条件を棚卸入力画面と同じ条件に変更 2014.12.10 kawana End
		//アンマッチ有選択した場合
		if (tInventoryInst.isUnmatch$1()) {
			cb.columnQuery(new SpecifyQuery<TInventoryBCB>() {
			    public void specify(TInventoryBCB cb) {
			        cb.specify().columnChargeNum();
			    }
			}).notEqual(new SpecifyQuery<TInventoryBCB>() {
			    public void specify(TInventoryBCB cb) {
			        cb.specify().columnInventoryNum();
			    }
			});

		}


		//ソート条件
		// [検査-144] センタCDをソート条件の先頭に変更 2014.12.03 kawana Start
		cb.query().queryTInventoryH().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTInventoryH().queryMClient().addOrderBy_ClientCd_Asc();
		// [検査-144] センタCDをソート条件の先頭に変更 2014.12.03 kawana End
		cb.query().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
		cb.query().addOrderBy_StockTypeId_Asc();
		cb.query().queryMLocation().queryMZone().addOrderBy_ZoneCd_Asc();
		cb.query().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryMLocation().addOrderBy_LocationCd_Asc();
		cb.query().addOrderBy_StoreNoId_Asc();

		// 検索実行
		result = selectPage(tInventoryBBhv, cb, paging);

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}
		//[Ver3.0] unit of measure対応 2017.11.22 ライ Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
		tInventoryBBhv.load(result, new ReferrerLoaderHandler<LoaderOfTInventoryB>() {
			@Override
			public void handle(LoaderOfTInventoryB loader) {
				loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
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
		for (TInventoryB tInvtoryB : result) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tInvtoryB.getMProduct());
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}
		for (TInventoryB tInventB : result){
			/**商品単位*/
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			tInventB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tInventB.getMProduct()));
			/**入数内訳*/
			tInventB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tInventB.getMProduct()));
			/**棚卸前内訳*/
			tInventB.setInventoryBeforeBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, tInventB.getChargeNum(), minimumUnitMap, parentUnitNumMap, parentUnitMap
					, tInventB.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			/**現時点内訳*/
			if(tInventB.getTStock() != null){
				tInventB.setBreakdownN(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, tInventB.getTStock().getChargeNum(), minimumUnitMap, parentUnitNumMap, parentUnitMap
						, tInventB.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			}else{
				tInventB.setBreakdownN(null);
			}

			/**棚卸内訳*/
			tInventB.setInventoryBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, tInventB.getInventoryNum(), minimumUnitMap, parentUnitNumMap, parentUnitMap
					, tInventB.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}

		//[Ver3.0] unit of measure対応 2017.11.22 ライ END
		return result;
	}
}