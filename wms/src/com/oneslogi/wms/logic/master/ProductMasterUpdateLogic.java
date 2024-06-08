package com.oneslogi.wms.logic.master;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.TStockHandCheckLogic;

/**
 * 商品マスタメンテナンス更新ロジッククラス
 */
public class ProductMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProductBhv mProductBhv;

	@Inject
	private MProductShapeBhv mProductShapeBhv;

	@Inject
	private ProductMasterSelectLogic productSelectLogic;

	@Inject
	private TStockHandCheckLogic tStockHandCheckLogic;

	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	@Inject
	private ProductMasterSelectLogic productMasterSelectLogic;
	// [Ver3.0] unit of measure対応 2017.12.04 NING End

	/**
	 * <h2>商品マスタデータを更新する。</h2>
	 * <pre>
	 * 在庫数＝０の場合は、修正可能にする。
	 * 商品マスタと商品荷姿マスタのデータを更新する。
	 * </pre>
	 * @param mProduct 商品マスタ：全項目
	 * @param mProductShape 商品荷姿マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MProduct mProduct, MProductShape mProductShape, ErrorStatus errSts) {

		List<MProduct> result = productSelectLogic.selectById(mProduct, errSts);
		for (MProduct product : result) {
			if (mProduct.isDelFlg$1()
					|| !CU.equals(CU.nullToZero(mProductShape.getUnitNum()).toString(), CU.nullToZero(product.getMProductShapeList().get(0).getUnitNum()).toString())
					|| !CU.equals(mProduct.getLimitDtManagFlg(), product.getLimitDtManagFlg())
					|| !CU.equals(mProduct.getLotManagFlg(), product.getLotManagFlg())) {

				MWarehouse mWarehouse = new MWarehouse();
				TStock tStock = new TStock();
				tStock.setClientId(mProduct.getClientId());
				tStock.setProductId(mProduct.getProductId());
				// [ON推-品向-248] 在庫数＝０の場合は、修正可能にする。 2014.11.28 KI Start
				if (tStockHandCheckLogic.checkDataZeroChargeNum(tStock, mWarehouse, errSts)) {
					// [ON推-品向-248] 在庫数＝０の場合は、修正可能にする。 2014.11.28 KI End
					this.getErrorManager().add(errSts, WmsMessageConst.UPDATE_PRODUCT_STOCK_FOUND_ERROR);
					return;
				}
			}
		}

		// ===== 商品マスタ更新実行 =====
		mProductBhv.update(mProduct);

		// ===== 商品荷姿マスタ更新実行 =====
		mProductShapeBhv.update(mProductShape);
	}

	/**
	 * <h2>商品マスタデータを一括更新する。</h2>
	 * <pre>
	 *
	 * 商品マスタと商品荷姿マスタのデータを一括更新する。
	 * </pre>
	 * @param mProductList 商品マスタリスト：全項目
	 * @param mProductShapeList 商品荷姿マスタリスト：全項目
	 */
	public void batchUpdate(List<MProduct> mProductList,List<MProductShape> mProductShapeList) {
		// ===== 商品マスタ更新実行 =====
		mProductBhv.batchUpdate(mProductList);
		// ===== 商品荷姿マスタ更新実行 =====
		mProductShapeBhv.batchUpdate(mProductShapeList);
	}

	/**
	 * <h2>商品マスタデータを更新する。</h2>
	 * <pre>
	 *
	 * 商品マスタデータを更新する。
	 * </pre>
	 * @param mProductList 商品マスタリスト：全項目
	 */
	public void batchUpdate(List<MProduct> mProductList) {
		// ===== 商品マスタ更新実行 =====
		mProductBhv.batchUpdate(mProductList);
	}

	// [エンハンス PH2.0] 商品マスタ荷姿内容を変更 2015.11.26 sja Start
	/**
	 * <h2>商品マスタデータを更新する。</h2>
	 * <pre>
	 *
	 * 商品マスタと荷姿マスタリストのデータを更新する。
	 * 在庫あり場合、更新不可エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mProduct 商品マスタ：全項目
	 * @param shapeGrpDtlList 荷姿グループ詳細マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	public void update(MProduct mProduct, List<MShapeGrpDtl> shapeGrpDtlList, ErrorStatus errSts) {
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		List<MProduct> result = productSelectLogic.selectById(mProduct, errSts);
		for (MProduct product : result) {
			if (mProduct.isDelFlg$1()
					|| !CU.equals(mProduct.getLimitDtManagFlg(), product.getLimitDtManagFlg())
					|| !CU.equals(mProduct.getLotManagFlg(), product.getLotManagFlg())) {

				MWarehouse mWarehouse = new MWarehouse();
				TStock tStock = new TStock();
				tStock.setClientId(mProduct.getClientId());
				tStock.setProductId(mProduct.getProductId());
				if (tStockHandCheckLogic.checkDataZeroChargeNum(tStock, mWarehouse, errSts)) {
					this.getErrorManager().add(errSts, WmsMessageConst.UPDATE_PRODUCT_STOCK_FOUND_ERROR);
					return;
				}
			}
		}

		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		// 既存荷姿グループ取得
//		MShapeGrp shapeGrp = shapeGroupMasterSelectLogic.selectByClientIdAndGrpCd(mProduct.getMClient().getClientId(), mProduct.getMShapeGrp().getShapeGrpCd());
		// 商品マスタメンテナンス(編集)データ取得
		List<MProduct> list = productMasterSelectLogic.selectById(mProduct, errRetSts(3));
		// 既存荷姿グループ取得
		MShapeGrp shapeGrp = list.get(0).getMProductShapeList().get(0).getMShapeGrpDtl().getMShapeGrp();

		// 在庫管理単位が変更する場合
		boolean grpIdChaged = false;
		if (!shapeGrp.getShapeGrpCd().equals(mProduct.getMShapeGrp().getShapeGrpCd())) {
			//mProduct.setMShapeGrp(mProduct);
			// 荷姿グループID
			mProduct.setShapeGrpId(shapeGrpDtlList.get(0).getMShapeGrp().getShapeGrpId());
			grpIdChaged = true;

			// 商品に紐付く商品荷姿データを取得する
			MProductShapeCB cb = mProductShapeBhv.newConditionBean();
			cb.query().setProductId_Equal(mProduct.getProductId());
			List<MProductShape> mProductShapeList= mProductShapeBhv.selectList(cb);
			// 商品に紐付く商品荷姿データを物理削除する
			for (Iterator<MProductShape> iterator = mProductShapeList.iterator(); iterator.hasNext();) {
				MProductShape mProductShape = iterator.next();
				mProductShapeBhv.delete(mProductShape);
			}
		}
		// ===== 商品マスタ更新実行 =====
		mProductBhv.update(mProduct);
		// 荷姿グループ詳細ループ
		for (Iterator<MShapeGrpDtl> iterator = shapeGrpDtlList.iterator(); iterator.hasNext();) {
			// 荷姿グループ詳細
			MShapeGrpDtl shapeGrpDtl =  iterator.next();

			// 画面入力商品荷姿
			MProductShape mProductShape = shapeGrpDtl.getMProductShapeList().get(0);
			mProductShape.setProductId(mProduct.getProductId());

			// 在庫管理単位が変更する場合
			if (grpIdChaged) {
				// 新荷姿グループ明細ID設定し、登録する。
				mProductShape.setShapeGrpDtlId(shapeGrpDtl.getShapeGrpDtlId());
				// 商品荷姿マスタ登録実行
				mProductShapeBhv.insert(mProductShape);
			} else {
				if (mProductShape.getProductShapeId() == null) {
					// 新荷姿グループ明細ID設定し、登録する。
					mProductShape.setShapeGrpDtlId(shapeGrpDtl.getShapeGrpDtlId());
					// 商品荷姿マスタ登録実行
					mProductShapeBhv.insert(mProductShape);
				} else {
					// 商品荷姿マスタ更新実行
					mProductShapeBhv.update(mProductShape);
				}
			}
		}
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		// [Ver3.0] unit of measure対応 2017.12.04 NING Del
	}

	// [エンハンス PH2.0] 商品マスタ荷姿内容を変更 2015.11.26 sja End
}