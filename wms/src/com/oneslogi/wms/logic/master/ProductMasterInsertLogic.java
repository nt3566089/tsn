package com.oneslogi.wms.logic.master;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品マスタメンテナンス登録ロジッククラス
 */
public class ProductMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProductBhv mProductBhv;
	@Inject
	private MProductShapeBhv mProductShapeBhv;
	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	@Inject
	private ShapeGroupMasterSearchSelectLogic shapeGroupMasterSearchSelectLogic;
	// [Ver3.0] unit of measure対応 2017.12.04 NING End

	/**
	 * <h2>商品マスタデータを登録する</h2>
	 * <pre>
	 *
	 * 商品マスタのデータを登録する。
	 * 商品CDが存在しなかった場合、商品マスタに登録する。
	 * 商品CDが存在した場合、既存エラーをエラーステータスに設定する。
	 * 商品荷姿マスタのデータを登録する。
	 * </pre>
	 * @param mProduct 商品マスタ：全項目
	 * @param mProductShape 商品荷姿マスタ：全項目
	 * @param mShape 荷姿マスタ：荷姿ID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MProduct mProduct, MProductShape mProductShape,  MShape mShape,  ErrorStatus errSts) {

		//検索条件の設定
		MProduct result = null;
		MProductCB cb = mProductBhv.newMyConditionBean();

		//荷主IDの設定
		cb.query().setClientId_Equal(mProduct.getClientId());
		//商品CDの設定
		cb.query().setProductCd_Equal(mProduct.getProductCd());

		result = mProductBhv.selectEntity(cb);

		if (result == null) {
			//存在なかった場合
			// ===== 商品マスタ登録実行 =====
			mProductBhv.insert(mProduct);
		} else {
			//存在した場合
				this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
				return;
		}

		// [Ver3.0] unit of measure対応 2017.12.04 NING Del
		mProductShape.setProductId(mProduct.getProductId());
		// [Ver3.0] unit of measure対応 2017.12.04 NING Del

		// ===== 商品荷姿マスタ登録実行 =====
		mProductShapeBhv.insert(mProductShape);

	}
	// [エンハンス PH2.0] 商品マスタ荷姿内容を変更 2015.11.26 sja Start
	/**
	 * <h2>商品マスタデータを登録する。</h2>
	 * <pre>
	 *
	 * 商品マスタのデータを登録する。
	 * 商品CDが存在しなかった場合、商品マスタに登録する。
	 * 商品CDが存在した場合、既存エラーをエラーステータスに設定する。
	 * 荷姿マスタのデータを登録する。
	 * </pre>
	 * @param mProduct 商品マスタ：全項目
	 * @param shapeGrpDtlList 荷姿グループ明細マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	public void insert(MProduct mProduct, List<MShapeGrpDtl> shapeGrpDtlList, ErrorStatus errSts) {
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		//検索条件の設定
		MProduct result = null;
		MProductCB cb = mProductBhv.newMyConditionBean();

		//荷主IDの設定
		cb.query().setClientId_Equal(mProduct.getClientId());
		//商品CDの設定
		cb.query().setProductCd_Equal(mProduct.getProductCd());

		result = mProductBhv.selectEntity(cb);

		if (result == null) {
			//存在なかった場合
			// ===== 商品マスタ登録実行 =====
			if (mProduct.getMShapeGrp().getShapeGrpId() == null)  {
				MShapeGrp shapeGrp = shapeGroupMasterSearchSelectLogic.selectByClientIdAndShapeGrpCd(mProduct.getClientId(),
						mProduct.getMShapeGrp().getShapeGrpCd());
				mProduct.setShapeGrpId(shapeGrp.getShapeGrpId());
			} else {
				mProduct.setShapeGrpId(mProduct.getMShapeGrp().getShapeGrpId());
			}

			mProductBhv.insert(mProduct);
		} else {
			//存在した場合
				this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
				return;
		}
		// [Ver3.0] unit of measure対応 2017.12.04 NING Start
		// 荷姿グループ詳細ループ
		for (Iterator<MShapeGrpDtl> iterator = shapeGrpDtlList.iterator(); iterator.hasNext();) {
			// 荷姿グループ詳細
			MShapeGrpDtl shapeGrpDtl =  iterator.next();

			// 画面入力商品荷姿
			MProductShape mProductShape = shapeGrpDtl.getMProductShapeList().get(0);
			mProductShape.setProductId(mProduct.getProductId());
			// 新荷姿グループ明細ID設定し、登録する。
			mProductShape.setShapeGrpDtlId(shapeGrpDtl.getShapeGrpDtlId());

			// 商品荷姿マスタ登録実行
			mProductShapeBhv.insert(mProductShape);
		}
		// [Ver3.0] unit of measure対応 2017.12.04 NING End
		// [Ver3.0] unit of measure対応 2017.12.04 NING Del
	}

	/**
	 * <h2>商品マスタデータを登録する。</h2>
	 * <pre>
	 * 商品マスタのデータを登録する。
	 * 商品CDが存在しなかった場合、商品マスタに登録する。
	 * 商品CDが存在した場合、既存エラーをエラーステータスに設定する。
	 * 商品荷姿マスタのデータを登録する。
	 * </pre>
	 * @param mProduct 商品マスタ：全項目
	 * @param mProductShape 商品荷姿マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert1(MProduct mProduct, MProductShape mProductShape,  ErrorStatus errSts) {

		//検索条件の設定
		MProduct result = null;
		MProductCB cb = mProductBhv.newMyConditionBean();

		//荷主IDの設定
		cb.query().setClientId_Equal(mProduct.getClientId());
		//商品CDの設定
		cb.query().setProductCd_Equal(mProduct.getProductCd());

		result = mProductBhv.selectEntity(cb);

		if (result == null) {
			//存在なかった場合
			// ===== 商品マスタ登録実行 =====
			mProductBhv.insert(mProduct);
		} else {
			//存在した場合
				this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
				return;
		}

		// ===== 商品荷姿マスタ登録実行 =====
		mProductShape.setProductId(mProduct.getProductId());
		mProductShapeBhv.insert(mProductShape);
	}
	// [エンハンス PH2.0] 商品マスタ荷姿内容を変更 2015.11.26 sja End

	/**
	 * <h2>商品マスタデータを登録する。</h2>
	 * <pre>
	 *
	 * 商品マスタのデータを登録する。
	 * 商品CDが存在しなかった場合、商品マスタに登録する。
	 * 商品CDが存在した場合、既存エラーをエラーステータスに設定する。
	 * 商品荷姿マスタのデータを登録する。
	 * </pre>
	 * @param mProduct 商品マスタ：全項目
	 * @param mProductShape 商品荷姿マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MProduct mProduct, MProductShape mProductShape,  ErrorStatus errSts) {

		//検索条件の設定
		MProduct result = null;
		MProductCB cb = mProductBhv.newMyConditionBean();

		//荷主IDの設定
		cb.query().setClientId_Equal(mProduct.getClientId());
		//商品CDの設定
		cb.query().setProductCd_Equal(mProduct.getProductCd());

		result = mProductBhv.selectEntity(cb);

		if (result == null) {
			//存在なかった場合
			// ===== 商品マスタ登録実行 =====
			mProductBhv.insert(mProduct);
		} else {
			//存在した場合
				this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
				return;
		}

		// ===== 商品荷姿マスタ登録実行 =====
		mProductShape.setProductId(mProduct.getProductId());
		mProductShapeBhv.insert(mProductShape);
	}

	/**
	 * <h2>商品荷姿マスタデータを一括登録する。</h2>
	 * <pre>
	 *
	 * 商品荷姿マスタリストのデータを一括登録する。
	 *
	 * </pre>
	 * @param mProductShapeList 商品荷姿マスタリスト：全項目
	 */
	public void batchInsert(List<MProductShape> mProductShapeList) {
		// ===== 商品荷姿マスタ登録実行 =====
		mProductShapeBhv.batchInsert(mProductShapeList);
	}
}
