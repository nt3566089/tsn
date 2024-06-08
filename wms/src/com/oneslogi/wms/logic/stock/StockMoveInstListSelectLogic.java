package com.oneslogi.wms.logic.stock;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTMoveInstB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.cbean.TMoveRecordBCB;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveRecordBBhv;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 在庫移動指示明細データ取得ロジッククラス
 */
public class StockMoveInstListSelectLogic extends AbstractWmsLogic {
	// ===== 使用テーブル =====
    @Inject
	private TMoveInstBBhv tMoveInstBBhv;

	// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正(不要となった変数を削除) 2017.01.26 kawana

	// [C-CWMS-0057] 在庫移動明細一覧画面一覧のため 2016.8.15 ATK Start
	// 在庫移動実績マスタ
	@Inject
	private TMoveRecordBBhv tMoveRecordBBhv;
	// [C-CWMS-0057] 在庫移動明細一覧画面一覧のため 2016.8.15 ATK End

	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

    /**
	 * <h2>在庫移動指示ボディデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから在庫移動指示ボディデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 *
	 * ケース荷姿入数を取得し在庫移動指示ボディデータに設定する。
	 * </pre>
     * @param tMoveInstH 在庫移動指示ヘッダ：センタID・荷主ID・WMS在庫移動伝票No.
     * @param paging ページ検索の設定
     * @param errSts エラー時に設定するエラーステータス
     * @return PagingResultBean<TMoveInstB> 在庫移動指示ボディリスト
     */
	public PagingResultBean<TMoveInstB> select(TMoveInstH tMoveInstH, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<TMoveInstB> result = null;

		// ===== 在庫移動データ取得=====
		TMoveInstBCB cb = tMoveInstBBhv.newMyConditionBean();

		// ===== 取得テーブル =====
        cb.setupSelect_TMoveInstH();
        cb.setupSelect_TMoveInstH().withMCenter();
        cb.setupSelect_TMoveInstH().withMClient();
		// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana Start
        // [Ver3.0] unit of measure対応 2017.11.22 潘 Del
		// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana End
        cb.setupSelect_TMoveInstH().withMProcessType();
        cb.setupSelect_MStockType();
        cb.setupSelect_MStockType().withVDict(getCultureId());
        cb.setupSelect_MWarehouse();
        cb.setupSelect_MCustomerByDepositId();
        cb.setupSelect_MCustomerBySupplierId();
     // [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
        cb.setupSelect_BClassDtlByMoveInstStatus();
        cb.setupSelect_BClassDtlByMoveInstStatus().withVDict(getCultureId());
     // [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
        cb.setupSelect_TLot();
        cb.setupSelect_TStoreNo();
        cb.setupSelect_MLocation();
        // [C-CWMS-0057] 在庫移動明細一覧画面一覧のため 2016.8.15 ATK Start
        cb.setupSelect_TStoreNo().withTStoreNoSelf();
        cb.setupSelect_TMoveInstH().withMProcessType().withVDict(getCultureId());
        // [C-CWMS-0057] 在庫移動明細一覧画面一覧のため 2016.8.15 ATK End
     // [Ver3.0] unit of measure対応 2017.11.22 潘 Start
        cb.setupSelect_MProduct();
     // [Ver3.0] unit of measure対応 2017.11.22 潘 End

        // ===== 検索条件 =====
    	cb.query().queryTMoveInstH().setClientId_Equal(tMoveInstH.getClientId());
    	cb.query().queryTMoveInstH().setCenterId_Equal(tMoveInstH.getCenterId());
    	cb.query().queryTMoveInstH().setMoveSlipNo_Equal(tMoveInstH.getMoveSlipNo());
    	// [C-CWMS-0057] 在庫移動明細一覧画面のため 2016.8.15 ATK Start
    	// 倉庫ID
    	cb.query().queryMWarehouse().setWarehouseId_Equal(tMoveInstH.getWarehouseId());
		// 指示日From
    	cb.query().queryTMoveInstH().setInstDt_GreaterEqual(tMoveInstH.getInstDtFrom());
		// 指示日To
    	cb.query().queryTMoveInstH().setInstDt_LessEqual(tMoveInstH.getInstDtTo());
    	// 処理区分ID
    	cb.query().queryTMoveInstH().queryMProcessType().setProcessTypeId_Equal(tMoveInstH.getProcessTypeId());
    	// 在庫移動指示ステータス
    	cb.query().queryTMoveInstH().setMoveInstStatus_Equal(tMoveInstH.getMoveInstStatus());
    	// 商品CD
    	cb.query().setProductCd_LikeSearch(tMoveInstH.getProductCd(), new LikeSearchOption().likePrefix());
    	// [C-CWMS-0057] 在庫移動明細一覧画面のため 2016.8.15 ATK End


        // ===== ソート順 =====
    	// [ON推-CT113-019]　在庫移動指示ボディID順とする 2015.12.25 hayashi Start
    	//cb.query().addOrderBy_InoutType_Asc();
        //cb.query().addOrderBy_ProductCd_Asc();
        //cb.query().addOrderBy_DepositCd_Asc();
        //cb.query().addOrderBy_StockTypeCd_Asc();
        //cb.query().addOrderBy_WarehouseCd_Asc();
        //cb.query().addOrderBy_LocationCd_Asc();
        //cb.query().addOrderBy_Lot_Asc();
        //cb.query().addOrderBy_LimitDt_Asc();
        //cb.query().addOrderBy_StoreLabelNo_Asc();
    	// 在庫移動指示ボディID
    	cb.addOrderBy_PK_Asc();
    	// [ON推-CT113-019]　在庫移動指示ボディID順とする 2015.12.25 hayashi End

        // ===== 検索実行 =====
    	result = selectPage(tMoveInstBBhv,cb,paging);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		// [Ver3.0] unit of measure対応 2017.11.22 潘 Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		tMoveInstBBhv.load(result, new ReferrerLoaderHandler<LoaderOfTMoveInstB>() {
			@Override
			public void handle(LoaderOfTMoveInstB loader) {
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
		// [Ver3.0] unit of measure対応 2017.11.22 潘 End

		//[ON推-品向-1082]明細に項目追加の修正対応 2016.04.08 chou Mod Start

		// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正(不要となった処理を削除) 2017.01.26 kawana

		//ケース荷姿入数の取得・設定
		for (TMoveInstB tMoveInstB : result) {

			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tMoveInstB.getMProduct());
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

			// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana Start

			// [Ver3.0] unit of measure対応 2017.11.22 潘 Del

			BigDecimal totalNum = CU.nullToZero(tMoveInstB.getInstNum());

			// [Ver3.0] unit of measure対応 2017.11.22 潘 Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品最小荷姿単位名称
			tMoveInstB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tMoveInstB.getMProduct()));
			// 入数内訳
			tMoveInstB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tMoveInstB.getMProduct()));
			// 指示内訳
			tMoveInstB.setInstBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, totalNum, minimumUnitMap, parentUnitNumMap
					, parentUnitMap, tMoveInstB.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

			// [Ver3.0] unit of measure対応 2017.11.22 潘 End

			if (tMoveInstB.isInoutType$1()) {
				// 出庫 - 指示出庫数を設定

				tMoveInstB.setInstNumOut(totalNum);
				// [Ver3.0] unit of measure対応 2017.11.22 潘 Start
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				// 商品最小荷姿単位名称
				tMoveInstB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tMoveInstB.getMProduct()));
				// 入数内訳
				tMoveInstB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tMoveInstB.getMProduct()));
				// 指示出庫内訳
				tMoveInstB.setInstOutBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, totalNum, minimumUnitMap, parentUnitNumMap
						, parentUnitMap, tMoveInstB.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			} else {
				// 出庫 - 指示入庫数を設定

				tMoveInstB.setInstNumIn(totalNum);

				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				// 商品最小荷姿単位名称
				tMoveInstB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tMoveInstB.getMProduct()));
				// 入数内訳
				tMoveInstB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tMoveInstB.getMProduct()));
				// 指示入庫内訳
				tMoveInstB.setInstInBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, totalNum, minimumUnitMap, parentUnitNumMap
						,  parentUnitMap, tMoveInstB.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
				// [Ver3.0] unit of measure対応 2017.11.22 潘 End
			}

			// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana End

			// 取消対象の実績ボディを検索
			TMoveRecordBCB recordCb = tMoveRecordBBhv.newMyConditionBean();
			recordCb.checkInvalidQuery();
			recordCb.query().setMoveInstBId_Equal(tMoveInstB.getMoveInstBId());
			recordCb.query().setMoveInstHId_Equal(tMoveInstB.getMoveInstHId());

			List<TMoveRecordB> moveRecordBList = tMoveRecordBBhv.selectList(recordCb);

			tMoveInstB.setTMoveRecordBList(moveRecordBList);
			// [C-CWMS-0057] 在庫移動明細一覧画面のため 2016.8.15 ATK End
		}
		//[ON推-品向-1082]明細に項目追加の修正対応 2016.04.08 chou Mod End

		return result;
	}
}
