package com.oneslogi.wms.logic.common;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfMProduct;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 推奨ロケーションロジッククラス
 */
public class RecommendLocationLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	// [#3704][Ver3.0] 推奨ロケ出力異常 2018.02.21 honma Mod Start
	@Inject
	private MProductBhv mProductBhv;
	// [#3704][Ver3.0] 推奨ロケ出力異常 2018.02.21 honma Mod End

	// ===== enum =====

	// [#4220][Ver3.0] 帳票 - 表示項目最新化(推奨ロケ表示対象) 2018.04.03 honma Mod Start
	/** 発行対象帳票区分 */
	public enum PrintReportCls {
		/** 入荷予定リスト */
		RECEIVE_PLAN_LIST,
		/** 入庫ラベル */
		STORE_LABEL,
	}
	// [#4220][Ver3.0] 帳票 - 表示項目最新化(推奨ロケ表示対象) 2018.04.03 honma Mod End

	/**
	 * <h2>推奨ロケーションを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから入庫推奨ロケーションを取得する。
	 * 優先①：入荷予定リスト発行時、かつ、入荷予定ボディ上にロケが指定されている場合は、これを使用
	 * 優先②：受払上の処理区分が25:入庫格納で（仮ロケ・引当禁止ロケ除く）、入庫日が新しいもの※
	 * 優先③：受払上の処理区分が01:通常入荷で（仮ロケ・引当禁止ロケ除く）、入庫日が新しいもの※
	 * 優先④：在庫データで（仮ロケ・引当禁止ロケ除く）入庫日が新しいもの※
	 *         ※・同じ入庫日の場合、ロケーションマスタのピックロケ区分が0：ピックロケ以外が優先
	 *           ・引当可能数＋引当済数＋移動中数＞0の在庫のみ対象とする
	 * </pre>
	 * @param condition 推奨ロケーションの検索条件
	 * @param cls 発行対象帳票区分
	 * @return MLocation ロケーションマスタ
	 */
	public MLocation getRecommendLocation(RecommendLocationCondition condition, PrintReportCls cls) {

		// 優先①：入荷予定リスト発行時、かつ、入荷予定ボディ上にロケが指定されている場合は、これを使用
		{
			if (PrintReportCls.RECEIVE_PLAN_LIST == cls && condition.getPlanLocation() != null) {
				// 入荷予定ロケ指定あり
				return condition.getPlanLocation();
			}
		}

		if (condition.invalid()) {
			// 条件無効
			return null;
		}

		// [#3704][Ver3.0] 推奨ロケ出力異常 2018.02.21 honma Mod Start
		MProduct mProduct = new MProduct();
		mProduct.setProductId(condition.getProductId());
		List<MProduct> mProductList = new ArrayList<MProduct>();
		mProductList.add(mProduct);

		// 優先②：受払上の処理区分が25:入庫格納で（仮ロケ・引当禁止ロケ除く）、入庫日が新しいもの※
		final String processTypeCdReceiveStore = CDef.ProcessTypeCd.$25.code();
		selectRecommendLocation(mProductList, processTypeCdReceiveStore, condition);

		List<MProduct> mProductListWk = new ArrayList<MProduct>();

		for (MProduct product : mProductList) {
			if (product.getTStockList().size() == 0) {
				mProductListWk.add(product);
			}
		}

		if (mProductListWk.size() > 0) {
			// 優先③：受払上の処理区分が01:通常入荷で（仮ロケ・引当禁止ロケ除く）、入庫日が新しいもの※
			final String processTypeCdNormalReceive = CDef.ProcessTypeCd.$01.code();
			selectRecommendLocation(mProductListWk, processTypeCdNormalReceive, condition);
		}

		List<MProduct> mProductListWk2 = new ArrayList<MProduct>();

		for (MProduct product : mProductListWk) {
			if (product.getTStockList().size() == 0) {
				mProductListWk2.add(product);
			}
		}

		if (mProductListWk2.size() > 0) {
			// 優先④：在庫データで（仮ロケ・引当禁止ロケ除く）入庫日が新しいもの※
			selectRecommendLocation(mProductListWk2, null, condition);
		}

		if (mProduct.getTStockList().size() > 0) {
			return mProduct.getTStockList().get(0).getMLocation();
		}
		// [#3704][Ver3.0] 推奨ロケ出力異常 2018.02.21 honma Mod End

		return null;
	}

	// [#3704][Ver3.0] 推奨ロケ出力異常 2018.02.21 honma Add Start
	/**
	 * <h2>推奨ロケーションを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから入庫推奨ロケーションを取得する。
	 * 処理区分CDにより取得対象を変更する。
	 * 処理区分CD[25]の場合、優先②
	 * 処理区分CD[01]の場合、優先③
	 * 処理区分CD[null]の場合、優先④
	 *
	 * 優先②：受払上の処理区分が25:入庫格納で（仮ロケ・引当禁止ロケ除く）、入庫日が新しいもの※
	 * 優先③：受払上の処理区分が01:通常入荷で（仮ロケ・引当禁止ロケ除く）、入庫日が新しいもの※
	 * 優先④：在庫データで（仮ロケ・引当禁止ロケ除く）入庫日が新しいもの※
	 *         ※・同じ入庫日の場合、ロケーションマスタのピックロケ区分が0：ピックロケ以外が優先
	 *           ・引当可能数＋引当済数＋移動中数＞0の在庫のみ対象とする
	 * </pre>
	 * @param productList 商品マスタリスト
	 * @param processTypeCd 処理区分CD
	 * @param condition 推奨ロケ検索条件
	 */
	private void selectRecommendLocation(List<MProduct> productList, final String processTypeCd, final RecommendLocationCondition condition) {
		mProductBhv.load(productList, new ReferrerLoaderHandler<LoaderOfMProduct>() {
			@Override
			public void handle(LoaderOfMProduct loader) {
				loader.loadTStockList(new ConditionBeanSetupper<TStockCB>() {
					@Override
					public void setup(TStockCB tStockCB) {
						tStockCB.setupSelect_MLocation();
						tStockCB.specify().specifyMLocation().columnLocationCd();
						tStockCB.specify().specifyMLocation().columnLocationNm();
						tStockCB.query().queryMWarehouse().queryMCenter().setCenterId_Equal(condition.getCenterId());
						tStockCB.query().queryMStockType().setStockTypeId_Equal(condition.getStockTypeId());
						tStockCB.query().queryMCustomer().setCustomerId_Equal(condition.getDepositId());

						tStockCB.orScopeQuery(new OrQuery<TStockCB>() {
							@Override
							public void query(TStockCB tStockCBOr) {
								tStockCBOr.query().setChargeNum_GreaterThan(WCC.ZERO);
								tStockCBOr.query().setAllocNum_GreaterThan(WCC.ZERO);
								tStockCBOr.query().setMoveNum_GreaterThan(WCC.ZERO);
							}
						});

						tStockCB.query().existsTStockInoutList(new SubQuery<TStockInoutCB>() {
							@Override
							public void query(TStockInoutCB tStockInoutCB) {
								tStockInoutCB.query().setInoutType_Equal_$0();
								tStockInoutCB.query().setCorrectType_Equal_$0();
								tStockInoutCB.query().queryMProcessType().setProcessTypeCd_Equal(processTypeCd);
								setDelFlg(tStockInoutCB);
							}
						});

						tStockCB.query().queryMLocation().setLocationType_NotEqual_$01();
						tStockCB.query().queryMLocation().setAllocNgFlg_Equal_$0();
						tStockCB.query().queryTStoreNo().addOrderBy_StoreDt_Desc();
						tStockCB.query().queryMLocation().addOrderBy_PickingLocationFlg_Asc();
						tStockCB.query().queryTStockReportAsOne().addOrderBy_LastStoreDt_Desc();
						tStockCB.query().addOrderBy_StockId_Desc();

						tStockCB.fetchFirst(1);
						setDelFlg(tStockCB);
					}
				});
			}
		});
	}
	// [#3704][Ver3.0] 推奨ロケ出力異常 2018.02.21 honma Add Start

	/**
	 * <h2>推奨ロケーション検索条件を設定する。</h2>
	 * <pre>
	 * 推奨ロケーション検索に使用する検索条件(メソッドのパラメータとして使用)。
	 * </pre>
	 */
	public static class RecommendLocationCondition {
		private Long centerId;
		private Long productId;
		private Long stockTypeId;
		private Long depositId;
		private Long warehouseId;
		private Long stockId;
		private MLocation planLocation;

		private RecommendLocationCondition() {
		}

		private RecommendLocationCondition(Builder builder) {
			this.centerId = builder.centerId;
			this.productId = builder.productId;
			this.stockTypeId = builder.stockTypeId;
			this.depositId = builder.depositId;
			this.warehouseId = builder.warehouseId;
			this.stockId = builder.stockId;
			this.planLocation = builder.planLocation;
		}

		public static CenterBuilder builder() {
			return new Builder();
		}

		public static interface CenterBuilder {
			ProductBuilder centerId(Long centerId);
		}

		public static interface ProductBuilder {
			StockTypeBuilder productId(Long productId);
		}

		public static interface StockTypeBuilder {
			DepositBuilder stockTypeId(Long stockTypeId);
		}

		public static interface DepositBuilder {
			Builder depositId(Long depositId);
		}

		public static class Builder implements CenterBuilder, ProductBuilder, StockTypeBuilder, DepositBuilder {
			private Long centerId;
			private Long productId;
			private Long stockTypeId;
			private Long depositId;
			private Long warehouseId;
			private Long stockId;
			private MLocation planLocation;

			private Builder() {
			}

			@Override
			public ProductBuilder centerId(Long centerId) {
				this.centerId = centerId;
				return this;
			}

			@Override
			public StockTypeBuilder productId(Long productId) {
				this.productId = productId;
				return this;
			}

			@Override
			public DepositBuilder stockTypeId(Long stockTypeId) {
				this.stockTypeId = stockTypeId;
				return this;
			}

			@Override
			public Builder depositId(Long depositId) {
				this.depositId = depositId;
				return this;
			}

			public Builder warehouseId(Long warehouseId) {
				this.warehouseId = warehouseId;
				return this;
			}

			public Builder stockId(Long stockId) {
				this.stockId = stockId;
				return this;
			}

			public Builder planLocation(MLocation planLocation) {
				this.planLocation = planLocation;
				return this;
			}

			public RecommendLocationCondition build() {
				return new RecommendLocationCondition(this);
			}
		}

		public Long getCenterId() {
			return centerId;
		}

		public Long getProductId() {
			return productId;
		}

		public Long getStockTypeId() {
			return stockTypeId;
		}

		public Long getDepositId() {
			return depositId;
		}

		public Long getWarehouseId() {
			return warehouseId;
		}

		public Long getStockId() {
			return stockId;
		}

		public MLocation getPlanLocation() {
			return planLocation;
		}

		public boolean invalid() {

			if (centerId == null
					|| productId == null
					|| stockTypeId == null
					|| depositId == null) {

				return true;
			}

			return false;
		}
	}
}
