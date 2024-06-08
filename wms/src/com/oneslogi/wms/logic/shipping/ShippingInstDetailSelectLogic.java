package com.oneslogi.wms.logic.shipping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTShippingInstB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 出荷指示明細データ取得ロジッククラス
 */
public class ShippingInstDetailSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;

	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	/**
	 * <h2>出荷指示ボディデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に出荷指示ボディデータを検索する。
	 * 預託、在庫区分、引当禁止フラグが複数存在する場合、
	 * 出荷指示ボディデータの先頭行に預託CD、在庫区分CD、引当禁止フラグの各最大値を設定する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 出荷指示ヘッダ：荷主ID・センタID・WMS出荷伝票No.
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<TShippingInstB> 出荷指示ボディリスト
	 */
	public PagingResultBean<TShippingInstB> select(TShippingInstH header, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<TShippingInstB> result = null;

		// ===== 出荷指示明細データ取得 =====

		// 検索条件の設定

		TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.setupSelect_TShippingInstH();
		// 荷主マスタの接続
		cb.setupSelect_TShippingInstH().withMClient();
		// センタマスタの接続
		cb.setupSelect_TShippingInstH().withMCenter();
		cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId();
		cb.setupSelect_MCustomer();
		cb.setupSelect_MProduct();
		cb.setupSelect_MLocation();
		cb.setupSelect_MStockType().withVDict(getCultureId());
		//辞書ビュー(引当禁止フラグ)
		// [SK2-063、SK2-064] 引当禁止フラグは指示からではないため、削除  2014.12.16 許
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start

		//辞書ビュー(納品先出荷停止フラグ)
		cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId().withBClassDtlByShippingStopFlg().withVDict(getCultureId());
		//辞書ビュー(商品出荷停止フラグ)
		cb.setupSelect_MProduct().withBClassDtlByShippingStopFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kawana Start
		cb.setupSelect_MWarehouse();
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kawana End

		//荷主IDの設定
		cb.query().queryTShippingInstH().setClientId_Equal(header.getClientId());

		//センタIDの設定
		cb.query().queryTShippingInstH().setCenterId_Equal(header.getCenterId());

		//WMS出荷伝票No.の設定
		cb.query().queryTShippingInstH().setShippingSlipNo_Equal(header.getShippingSlipNo());

		 // ソート条件：行No
		cb.query().addOrderBy_LineNo_Asc();

		// 検索実行
		result = selectPage(tShippingInstBBhv, cb, paging);

		// [検査-225] 出荷実績訂正に修正した情報は伝票別出荷一覧画面と出荷指示明細画面に表示するため、訂正した預託と在庫区分を追加 2014.12.08 許 Start
		tShippingInstBBhv.loadTPickingBList(result, new ConditionBeanSetupper<TPickingBCB>() {
			public void setup(TPickingBCB subCB) {
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
				subCB.setupSelect_TStock().withMCustomer();
				// [SK2-063、SK2-064] 引当禁止フラグは指示からじなくて、実績のロケーションより取得を修正 2014.12.16 許 Start
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				subCB.setupSelect_TStock().withMLocation().withBClassDtlByAllocNgFlg().withVDict(getCultureId());
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				// [SK2-063、SK2-064] 引当禁止フラグは指示からじなくて、実績のロケーションより取得を修正 2014.12.16 許 End
				subCB.setupSelect_TStock().withMStockType().withVDict(getCultureId());
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

				// [SK2-063、SK2-064] 引当禁止フラグは指示からじなくて、実績のロケーションより取得を修正 2014.12.16 許 Start
				// [SK2-064] 預託や在庫区分が複数存在する場合、当画面の預託CDと在庫区分CDと引当禁止フラグの最大値を表示するために元のソード順を削除 2014.12.17 許
				// [SK2-063、SK2-064] 引当禁止フラグは指示からじなくて、実績のロケーションより取得を修正 2014.12.16 許 End
				// [SK2-064] 預託や在庫区分が複数存在する場合、当画面の預託CDと在庫区分CDと引当禁止フラグの最大値を表示するために元のソード順を削除 2014.12.17 許
			}
		});
		// [検査-225] 出荷実績訂正に修正した情報は伝票別出荷一覧画面と出荷指示明細画面に表示するため、訂正した預託と在庫区分を追加 2014.12.08 許 End

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
			// [SK2-064] 預託や在庫区分が複数存在する場合、当画面の預託CDと在庫区分CDと引当禁止フラグの最大値を表示することを追加 2014.12.17 Start
		} else {

			// [Ver3.0] unit of measure対応 2017.11.24 駱 Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
			tShippingInstBBhv.load(result, new ReferrerLoaderHandler<LoaderOfTShippingInstB>() {
				@Override
				public void handle(LoaderOfTShippingInstB loader) {
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

			for (TShippingInstB instB : result) {
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
				WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, instB.getMProduct());
				// 商品最小荷姿単位名称
				instB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, instB.getMProduct()));
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			}
		    // [Ver3.0] unit of measure対応 2017.11.24 駱 End
			for (TShippingInstB tShippingInstB : result) {
				List<TPickingB> tPickingBList = tShippingInstB.getTPickingBList();

				if(tPickingBList.size() > 0){
					//預託CD最大値を抽出する
					String maxCustomerCd = "";
					String maxCustomerNm = "";
					// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
					for(TPickingB innerPickingB:tPickingBList){
						if ("".equals(maxCustomerCd) ){
							maxCustomerCd = innerPickingB.chaseTStock().chaseMCustomer().getCustomerCd();
							maxCustomerNm = innerPickingB.chaseTStock().chaseMCustomer().getCustomerNm();
						} else {
							if (innerPickingB.chaseTStock().chaseMCustomer().getCustomerCd().compareTo(maxCustomerCd) > 0 ){
								maxCustomerCd = innerPickingB.chaseTStock().chaseMCustomer().getCustomerCd();
								maxCustomerNm = innerPickingB.chaseTStock().chaseMCustomer().getCustomerNm();
							}
						}
					}

					tPickingBList.get(0).chaseTStock().chaseMCustomer().setCustomerCd(maxCustomerCd);
					tPickingBList.get(0).chaseTStock().chaseMCustomer().setCustomerNm(maxCustomerNm);

					//在庫区分CDの最大値を抽出する
					String maxStockTypeCd = "";
					String maxStockTypeNm = "";
					for(TPickingB innerPickingB:tPickingBList){
						if ("".equals(maxStockTypeCd) ){
							maxStockTypeCd = innerPickingB.chaseTStock().chaseMStockType().getStockTypeCd();
							maxStockTypeNm =innerPickingB.chaseTStock().chaseMStockType().chaseVDict().getDictNm();
						} else {
							if (innerPickingB.chaseTStock().chaseMStockType().getStockTypeCd().compareTo(maxStockTypeCd) > 0 ){
								maxStockTypeCd = innerPickingB.chaseTStock().chaseMStockType().getStockTypeCd();
								maxStockTypeNm =innerPickingB.chaseTStock().chaseMStockType().chaseVDict().getDictNm();
							}
						}
					}
					tPickingBList.get(0).chaseTStock().chaseMStockType().setStockTypeCd(maxStockTypeCd);
					tPickingBList.get(0).chaseTStock().chaseMStockType().chaseVDict().setDictNm(maxStockTypeNm);

					//引当禁止フラグの最大値を抽出する
					String maxAllocNgFlg = "";
					String maxAllocNgFlgNm = "";
					for(TPickingB innerPickingB:tPickingBList){
						if ("".equals(maxAllocNgFlg) ){
							maxAllocNgFlg = innerPickingB.chaseTStock().chaseMLocation().getAllocNgFlg();
						// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
							maxAllocNgFlgNm =innerPickingB.chaseTStock().chaseMLocation().chaseBClassDtlByAllocNgFlg().chaseVDict().getDictNm();
						} else {
							if (innerPickingB.chaseTStock().chaseMLocation().getAllocNgFlg().compareTo(maxAllocNgFlg) > 0 ){
								maxAllocNgFlg = innerPickingB.chaseTStock().chaseMLocation().getAllocNgFlg();
								maxAllocNgFlgNm =innerPickingB.chaseTStock().chaseMLocation().chaseBClassDtlByAllocNgFlg().chaseVDict().getDictNm();
							}
						}
					}
					tPickingBList.get(0).chaseTStock().chaseMLocation().setAllocNgFlg(maxAllocNgFlg);
					tPickingBList.get(0).chaseTStock().chaseMLocation().chaseBClassDtlByAllocNgFlg().chaseVDict().setDictNm(maxAllocNgFlgNm);
					// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
					// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
				}
			}
		}
		// [SK2-064] 預託や在庫区分が複数存在する場合、当画面の預託CDと在庫区分CDと引当禁止フラグの最大値を表示することを追加 2014.12.17 End
		return result;
	}

}
