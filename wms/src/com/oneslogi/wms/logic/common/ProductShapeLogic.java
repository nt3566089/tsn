package com.oneslogi.wms.logic.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品荷姿マスタ共通ロジッククラス
 */
public class ProductShapeLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private MProductShapeBhv mProductShapeBhv;
	// [#590] 商品荷姿の削除前チェックを追加 2017.01.13 kawana Start
	@Inject
	private MLocationBhv mLocationBhv;
	// [#590] 商品荷姿の削除前チェックを追加 2017.01.13 kawana End
	// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Add Start
	@Inject
	private MProductBhv mProductBhv;
	// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Add End

	// ===== 使用ロジック =====

	@Inject
	private ParamLogic paramLogic;

	/**
	 * <h2>商品荷姿マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に商品荷姿マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 商品荷姿マスタ：商品荷姿ID
	 * @return MProductShape 商品荷姿マスタ
	 */
	public MProductShape getPkEntityWithDeletedCheck(MProductShape entity) {
		if (entity.getProductShapeId() == null) {
			return null;
		}
		return mProductShapeBhv.selectByPKValueWithDeletedCheck(entity.getProductShapeId());
	}

	/**
	 * <h2>商品荷姿マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に商品荷姿マスタデータを取得する。
	 * </pre>
	 * @param entity 商品荷姿マスタ：商品荷姿ID
	 * @return MProductShape 商品荷姿マスタ
	 */
	public MProductShape getPkEntity(MProductShape entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * ※※※ 必要であればメッセージ定義後に本メソッドを public に変更すること
	 * プライマリキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 *
	 * @param entity 商品荷姿マスタ：商品荷姿ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MProductShape 商品荷姿マスタ
	 */
	private MProductShape getPkEntity(MProductShape entity, ErrorStatus errSts) {
		MProductShape resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合

			// ※※※ 必要であればメッセージ定義後に本メソッドを public に変更すること
			//			this.getErrorManager().add(errSts, "xxxxxxxxxxxxxxxxx");
		}
		return resultEntity;
	}

	/**
	 * <h2>商品荷姿マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に商品荷姿マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 商品荷姿マスタ：商品ID・荷姿ID
	 * @return MProductShape 商品荷姿マスタ
	 */
	public MProductShape getUkEntityWithDeletedCheck(MProductShape entity) {

		if (entity.getProductId() == null) {
			return null;
		}
		// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
		if (entity.getShapeGrpDtlId() == null) {
			return null;
		}

		MProductShapeCB cb = mProductShapeBhv.newMyConditionBean();
		cb.query().setProductId_Equal(entity.getProductId());
		// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
		cb.query().setShapeGrpDtlId_Equal(entity.getShapeGrpDtlId());
		return mProductShapeBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>商品荷姿マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に商品荷姿マスタデータを取得する。
	 * </pre>
	 * @param entity 商品荷姿マスタ：商品ID・荷姿ID
	 * @return MProductShape 商品荷姿マスタ
	 */
	public MProductShape getUkEntity(MProductShape entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * ※※※ 必要であればメッセージ定義後に本メソッドを public に変更すること
	 *
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 *
	 * @param entity 商品荷姿マスタ：商品ID・荷姿ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MProductShape 商品荷姿マスタ
	 */
	private MProductShape getUkEntity(MProductShape entity, ErrorStatus errSts) {
		MProductShape resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合

			// ※※※ 必要であればメッセージ定義後に本メソッドを public に変更すること
			//			this.getErrorManager().add(errSts, "xxxxxxxxxxxxxxxxx");
		}
		return resultEntity;
	}

	// [エンハンス PH2.0] 入数の取得方を追加する 2015.12.02 sja Start
	// [#581] ケース荷姿が設定されていない商品を含むバラピッキングでエラー発生 2017.01.12 kawana Start
	// [#3347][Ver3.0] TODO残対応(UoM) - 商品荷姿マスタ入数値取得削除 2018.01.15 honma Delete
	// [#581] ケース荷姿が設定されていない商品を含むバラピッキングでエラー発生 2017.01.12 kawana End

	/**
	 * <h2>商品荷姿マスタの入数の値を設定する。</h2>
	 * <pre>
	 * センタマスタの荷姿を利用して、商品荷姿マスタの入数の値をセットする。
	 * 荷姿IDがNULLの場合、入数が0を設定する。
	 * </pre>
	 * @param entity 商品荷姿マスタ：荷主ID・センタID・商品ID・ケースフラグ・ボールフラグ・ピースフラグ
	 * @return MProductShape 商品荷姿マスタ
	 */
	public MProductShape getMProductShape(MProductShape entity) {
		if (entity.getProductId() == null) {
			return null;
		}
		if (entity.getClientId() == null) {
			return null;
		}

		if (entity.getCenterId() == null) {
			return null;
		}
		if (entity.getCaseFlg() == null && entity.getBowFlg() == null && entity.getPieceFlg() == null) {
			return null;
		}
		boolean nullFlg = false;
		MProductShape result = new MProductShape();

		MClientCenter clientCenter = new MClientCenter();
		clientCenter.setClientId(entity.getClientId());
		clientCenter.setCenterId(entity.getCenterId());
		MParam param = paramLogic.getUkEntityWithDeletedCheck(clientCenter);
		if (param == null) {
			return null;
		}

		MProductShapeCB cb = mProductShapeBhv.newMyConditionBean();
		// [Ver3.0] unit of measure対応 2017.12.5 潘 Start
		cb.setupSelect_MShapeGrpDtl();
		cb.query().queryMShapeGrpDtl().innerJoin();
		cb.query().queryMShapeGrpDtl().setShapeSort_Equal(1l);
		// [Ver3.0] unit of measure対応 2017.12.5 潘 End
		cb.query().setProductId_Equal(entity.getProductId());

		// [Ver3.0] unit of measure対応 2017.11.30 駱 Del

		// 荷姿IDがNULLの場合
		if (nullFlg) {
			// 入数が0を設定する
			result.setUnitNum(0l);
		} else {
			result = mProductShapeBhv.selectEntity(cb);
			if (result == null) {
				result = new MProductShape();
				result.setUnitNum(0l);
			}
		}

		return result;
	}

	// [エンハンス PH2.0] 入数の取得方を追加する 2015.12.02 sja End

	// [#590] 商品荷姿の削除前チェックを追加 2017.01.13 kawana Start
	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
	/**
	 * <h2>登録時商品荷姿の重複チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に商品荷姿マスタのデータを検索し、
	 * 検索結果が1件以上の場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mProductShape 商品荷姿マスタ：商品ID・荷姿ID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkInsert(MProductShape mProductShape, ErrorStatus errSts) {

		// 削除フラグの検索条件自動付加を無効化
		boolean preAutoDelFlg = this.getBehaviorAutoDelFlg();
		this.setBehaviorAutoDelFlg(false);
		MProductShapeCB cb = mProductShapeBhv.newMyConditionBean();
		cb.query().setProductId_Equal(mProductShape.getProductId());
		// [Ver3.0] unit of measure対応 2017.12.21 NING Start
		cb.query().setShapeGrpDtlId_Equal(mProductShape.getShapeGrpDtlId());
		// [Ver3.0] unit of measure対応 2017.12.21 NING End
		// [Ver3.0] unit of measure対応 2017.11.30 駱 Del

		int count = mProductShapeBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return;
		}

		// 削除フラグの検索条件自動付加を戻す
		this.setBehaviorAutoDelFlg(preAutoDelFlg);
	}

	// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

	/**
	 * <h2>削除前チェック.</h2>
	 * <pre>
	 * 商品荷姿マスタ削除前のチェックを行う。
	 * 次のチェックを行いエラー時はエラー管理クラスにエラーを登録する。
	 * ・ロケーションマスタ - 補充点商品荷姿ID・最大格納数商品荷姿IDの使用有無
	 * </pre>
	 * @param productShape 削除対象の商品荷姿 (商品荷姿ID必須)
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkDelete(MProductShape productShape, ErrorStatus errSts) {

		final long productShapeId = productShape.getProductShapeId();

		// 削除フラグの検索条件自動付加を無効化
		boolean preAutoDelFlg = this.getBehaviorAutoDelFlg();
		this.setBehaviorAutoDelFlg(false);

		// ===== ロケーションマスタ使用チェック =====
		{
			MLocationCB locationCb = mLocationBhv.newMyConditionBean();
			locationCb.orScopeQuery(new OrQuery<MLocationCB>() {
				@Override
				public void query(MLocationCB orCb) {
					// 補充点商品荷姿ID
					orCb.query().setReplenishPProductShapeId_Equal(productShapeId);
					// 最大格納数商品荷姿ID
					orCb.query().setMaxStoreProductShapeId_Equal(productShapeId);
				}
			});
			List<MLocation> locationList = mLocationBhv.selectList(locationCb);
			if (0 < locationList.size()) {
				// 使用あり (エラー)

				// エラーメッセージ用に荷姿名取得
				MProductShapeCB productShapeCb = mProductShapeBhv.newMyConditionBean();
				// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
				productShapeCb.query().setProductShapeId_Equal(productShapeId);
				// [Ver3.0] unit of measure対応 2017.11.30 駱 Start
				String shapeNm = mProductShapeBhv.selectEntityWithDeletedCheck(productShapeCb).getMShapeGrpDtl().getMShape().getVDictByShapeDictId().getDictNm();
				// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
				// [Ver3.0] unit of measure対応 2017.11.30 駱 End

				for (MLocation location : locationList) {

					// エラー追加
					this.getErrorManager().add(errSts, WmsMessageConst.PRODUCT_SHAPE_CANNOT_DELETE_USE_LOCATION_ERROR, shapeNm, location.getLocationNm());
				}
			}
		}

		// 削除フラグの検索条件自動付加を戻す
		this.setBehaviorAutoDelFlg(preAutoDelFlg);
	}
	// [#590] 商品荷姿の削除前チェックを追加 2017.01.13 kawana End
	// [Ver3.0] unit of measure対応 2017.12.26 NING Start
	/**
	 * <h2>商品荷姿マスタを取得する。</h2>
	 * <pre>
	 * 商品荷姿マスタデータを取得する。
	 * </pre>
	 * @param entity 商品荷姿マスタ：商品ID・荷姿ID
	 * @return MProductShape 商品荷姿マスタ
	 */
	public List<MProductShape> getProdutShapeListById(Long productId, Long shapeGrpDtlId) {


		MProductShapeCB cb = mProductShapeBhv.newMyConditionBean();
		cb.query().setProductId_Equal(productId);
		cb.query().setShapeGrpDtlId_Equal(shapeGrpDtlId);

		return mProductShapeBhv.selectList(cb);
	}
	// [Ver3.0] unit of measure対応 2017.12.26 NING End

	// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Add Start
	/**
	 * <h2>各商品荷姿入数計算後の商品荷姿マスタを取得する。</h2>
	 * <pre>
	 * 商品に紐づく荷姿グループから全ての商品荷姿を取得する。<br>
	 * 取得後に各商品荷姿入数を元にピース計算した値を各商品荷姿ピース入数に設定する。<br>
	 * <pre>
	 * @param product 商品Enitty
	 * @return 商品荷姿リストMap(商品荷姿ID, 商品荷姿Enitty)
	 */
	public Map<Long, MProductShape> getCalcAllProductShapeListUnitNumPiece(MProduct product) {

		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Add Start
		Map<Long, MProductShape> calcProductShapeListMap = new HashMap<Long, MProductShape>();

		if (product == null) {
			return calcProductShapeListMap;
		}
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Add End

		// 商品荷姿マスタ
		mProductBhv.loadMProductShapeList(product, new ConditionBeanSetupper<MProductShapeCB>(){
			public void setup(MProductShapeCB subCB){
				subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
				subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
				subCB.query().setDelFlg_Equal_$0();
			}
		});

		// 子のピース数
		long childUnitNumPiece = 1L;

		boolean isFirst = true;

		for (MProductShape productShape : product.getMProductShapeList()) {

			long unitNum = CU.nullToZero(productShape.getUnitNum());

			if (isFirst) {
				// 1番目はピース荷姿とする
				isFirst = false;
				productShape.setUnitNumPiece(unitNum);
				productShape.setPieceFlg("1");
				// 商品荷姿追加
				calcProductShapeListMap.put(productShape.getProductShapeId(), productShape);
				continue;
			}

			if (unitNum < 1) {
				// 入数未設定
				continue;
			}

			// 子荷姿のピース数 * 入数
			long unitNumPiece = childUnitNumPiece * unitNum;
			productShape.setUnitNumPiece(unitNumPiece);
			childUnitNumPiece = unitNumPiece;

			// 商品荷姿追加
			calcProductShapeListMap.put(productShape.getProductShapeId(), productShape);
		}

		return calcProductShapeListMap;
	}
	// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Add End
}
