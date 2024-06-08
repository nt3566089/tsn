package com.oneslogi.wms.logic.common;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.MShapeGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品マスタ共通ロジッククラス
 */
public class ProductLogic extends AbstractWmsLogic {

	@Inject
	private MProductBhv mProductBhv;

	@Inject
	private MShapeGrpBhv mShapeGrpBhv;

	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に商品マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 商品マスタ：商品ID
	 * @return MProduct 商品マスタ
	 */
	public MProduct getPkEntityWithDeletedCheck(MProduct entity) {
		if (entity.getProductId() == null) {
			return null;
		}
		return mProductBhv.selectByPKValueWithDeletedCheck(entity.getProductId());
	}

	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に商品マスタデータを取得する。
	 * </pre>
	 * @param entity 商品マスタ：商品ID
	 * @return MProduct 商品マスタ
	 */
	public MProduct getPkEntity(MProduct entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に商品マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 商品マスタ：商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MProduct 商品マスタ
	 */
	public MProduct getPkEntity(MProduct entity, ErrorStatus errSts) {
		MProduct resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に商品マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 商品マスタ：商品CD・荷主ID
	 * @return MProduct 商品マスタ
	 */
	public MProduct getUkEntityWithDeletedCheck(MProduct entity) {

		if (entity.getClientId() == null) {
			return null;
		}
		if (CU.isNullOrEmpty(entity.getProductCd())) {
			return null;
		}

		MProductCB cb = mProductBhv.newMyConditionBean();
		// [Ver3.0] unit of measure対応 2017.11.28 NING Start
		cb.setupSelect_MShapeGrp();
		// [Ver3.0] unit of measure対応 2017.11.28 NING End
		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setProductCd_Equal(entity.getProductCd());
		return mProductBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に商品マスタデータを取得する。
	 * </pre>
	 * @param entity 商品マスタ：商品CD・荷主ID
	 * @return MProduct 商品マスタ
	 */
	public MProduct getUkEntity(MProduct entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に商品マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 商品マスタ：商品CD・荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MProduct 商品マスタ
	 */
	public MProduct getUkEntity(MProduct entity, ErrorStatus errSts) {
		MProduct resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>登録時商品CDの重複チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に商品マスタのデータを検索し、
	 * 検索件数が1件以上の場合、既に登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mProduct 商品マスタ：商品CD・荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:商品CD重複)
	 */
	public boolean checkProductCdInsert(MProduct mProduct, ErrorStatus errSts) {

		// 削除フラグの検索条件自動付加を無効化
		this.setBehaviorAutoDelFlg(false);
		MProductCB cb = mProductBhv.newMyConditionBean();
		cb.query().setProductCd_Equal(mProduct.getProductCd());
		cb.query().setClientId_Equal(mProduct.getClientId());

		int count = mProductBhv.selectCount(cb);
		if (count > 0) {
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
			//this.getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CODE_DUPLICATE_ERROR);
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
			return true;
		}

		// [ON推-品向-929] 削除フラグの検索条件自動付加を有効化漏れを修正 2015.08.06 kawana Start
		// 削除フラグの検索条件自動付加を有効化
		this.setBehaviorAutoDelFlg(true);
		// [ON推-品向-929] 削除フラグの検索条件自動付加を有効化漏れを修正 2015.08.06 kawana End

		return false;
	}

	/**
	 * <h2>登録時JANCDの重複チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に商品マスタのデータを検索し、
	 * 検索件数が1件以上の場合、既に登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mProduct 商品マスタ：荷主ID・JANCD・商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:JANCD重複)
	 */
	public boolean checkJanCdInsert(MProduct mProduct, ErrorStatus errSts) {

		// [ON推-品向-929] 削除済商品のJANCDは重複扱いとしないため削除フラグ自動付加解除の処理を削除 2015.08.06 kawana

		MProductCB cb = mProductBhv.newMyConditionBean();
		cb.query().setClientId_Equal(mProduct.getClientId());
		cb.query().setJanCd_Equal(mProduct.getJanCd());
		cb.query().setProductId_NotEqual(mProduct.getProductId());

		int count = mProductBhv.selectCount(cb);
		if (count > 0) {
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
			//this.getErrorManager().add(errSts, WmsMessageConst.JAN_CD_DUPLICATE_ERROR);
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
			return true;
		}
		return false;
	}

	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に商品マスタデータを取得する。
	 * </pre>
	 * @param entity 商品マスタ：荷主ID・商品CD
	 * @return MProduct 商品マスタ
	 */
	public MProduct getUkEntityWithShape(MProduct entity) {
		return getUkEntityWithShape(entity, null);
	}

	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に商品マスタデータを取得する。
     * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 商品マスタ：荷主ID・商品CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MProduct 商品マスタ
	 */
	public MProduct getUkEntityWithShape(MProduct entity, ErrorStatus errSts) {
		MProduct resultEntity = null;
		try {
			resultEntity = getUkEntityWithShapeWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "productNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に商品マスタと商品荷姿マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 商品マスタ：荷主ID・商品CD
	 * @return MProduct 商品マスタ
	 */
	public MProduct getUkEntityWithShapeWithDeletedCheck(MProduct entity) {
		MProduct result = new MProduct();

		if (entity.getClientId() == null) {
			return null;
		}
		if (CU.isNullOrEmpty(entity.getProductCd())) {
			return null;
		}

		MProductCB cb = mProductBhv.newMyConditionBean();
		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setProductCd_Equal(entity.getProductCd());

		result = mProductBhv.selectEntityWithDeletedCheck(cb);
		List<MProduct> mProductList = new ArrayList<MProduct>();
		mProductList.add(result);

		// 商品荷姿マスタ
		mProductBhv.loadMProductShapeList(mProductList, new ConditionBeanSetupper<MProductShapeCB>(){
			public void setup(MProductShapeCB pcb){
			}
		});

		return mProductList.get(0);
	}

	// [エンハンス PH2.0] 入数取得 2015.11.23 sja Start
	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に商品マスタと商品荷姿マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * センタマスタのケース荷姿を利用して、商品荷姿マスタの入数を検索し、
	 * ケース荷姿が設定されていない場合、ケースの入数が'0'を設定する。
	 * </pre>
	 * @param entity 商品マスタ：荷主ID・商品CD
	 * @param shapeId 荷姿ID
	 * @return MProduct 商品マスタ
	 */
	public MProduct getUkEntityWithShapeWithDeletedCheck(MProduct entity,final Long shapeId) {
		MProduct result = new MProduct();

		if (entity.getClientId() == null) {
			return null;
		}
		if (CU.isNullOrEmpty(entity.getProductCd())) {
			return null;
		}

		MProductCB cb = mProductBhv.newMyConditionBean();
		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setProductCd_Equal(entity.getProductCd());

		result = mProductBhv.selectEntityWithDeletedCheck(cb);
		List<MProduct> mProductList = new ArrayList<MProduct>();
		mProductList.add(result);

		// 商品荷姿マスタ
		mProductBhv.loadMProductShapeList(mProductList, new ConditionBeanSetupper<MProductShapeCB>(){
			public void setup(MProductShapeCB pcb){
				// [Ver3.0] unit of measure対応 2017.12.12 潘 Start
				pcb.query().queryMShapeGrpDtl().setShapeId_Equal(shapeId);
				// [Ver3.0] unit of measure対応 2017.12.12 潘 End
			}
		});

		// センタマスタのケース荷姿を利用して、商品荷姿マスタの入数を表示する
		// ケース荷姿が設定されていない場合、'0'を設定する。
		if (mProductList.get(0).getMProductShapeList().size() == 0 || shapeId == null){
			List<MProductShape> mProductShapeList = new ArrayList<MProductShape>();
			MProductShape productShape = new MProductShape();
			productShape.setUnitNum(0l);
			mProductShapeList.add(productShape);
			mProductList.get(0).setMProductShapeList(mProductShapeList);
		}

		return mProductList.get(0);
	}
	// [エンハンス PH2.0] 入数取得 2015.11.23 sja End

	// [#3000][Ver3.0] 複数荷姿対応（部品API製造 - 画面）2017.11.13 honma Add Start
	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に商品マスタと商品荷姿マスタと荷姿グループマスタと荷姿グループ明細マスタと荷姿マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 商品に紐付く商品荷姿を荷姿ソート順にて全て取得する。
	 * </pre>
	 * @param entity 商品マスタ：荷主ID・商品CD
	 * @return MProduct 商品マスタ
	 */
	public MProduct getUkEntityWithProductShapeWithShapeGrpDtlWithDeletedCheck(MProduct entity) {
		MProduct result = new MProduct();

		if (entity.getClientId() == null) {
			return null;
		}
		if (CU.isNullOrEmpty(entity.getProductCd())) {
			return null;
		}

		MProductCB cb = mProductBhv.newMyConditionBean();
		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setProductCd_Equal(entity.getProductCd());

		result = mProductBhv.selectEntityWithDeletedCheck(cb);

		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start

		// [v3.1] 1行目の倉庫が倉庫マスタに存在しないと致命的エラー発生 - 原因となっているコード(return null)を削除 2018.02.06 kawana Delete

		// 商品荷姿マスタ
		mProductBhv.loadMProductShapeList(result, new ConditionBeanSetupper<MProductShapeCB>(){
			public void setup(MProductShapeCB subCB){
				subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
				subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
				subCB.query().setDelFlg_Equal_$0();
			}
		});

		return result;
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
	}
	// [#3000][Ver3.0] 複数荷姿対応（部品API製造 - 画面）2017.11.13 honma Add End

	// [Ver3.0] unit of measure対応 2017.12.14 NING Start
	/**
	 * <h2>商品荷姿マスタを取得する。</h2>
	 * <pre>
	 * 商品CDと荷主CDに商品荷姿マスタと荷姿グループマスタと荷姿グループ明細マスタと荷姿マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 商品に紐付く商品荷姿を荷姿ソート順にて全て取得する。
	 * </pre>
	 * @param productCd 商品CD
	 * @param clientCd 荷主CD
	 *
	 * @return MShapeGrp 商品荷姿マスタ
	 */
	public MShapeGrp getProductByCd(String productCd, String clientCd) {

		MProductCB cb = mProductBhv.newMyConditionBean();
		cb.setupSelect_MShapeGrp();
		cb.setupSelect_MClient();
		cb.query().queryMClient().setClientCd_Equal(clientCd);
		cb.query().setProductCd_Equal(productCd);

		ListResultBean<MProduct> result = mProductBhv.selectList(cb);

		if (result != null && result.size() > 0) {
			List<MShapeGrp> mShapeGrpList = new ArrayList<MShapeGrp>();
			mShapeGrpList.add(result.get(0).getMShapeGrp());
			// 荷姿グループ明細マスタ
			mShapeGrpBhv.loadMShapeGrpDtlList(mShapeGrpList, new ConditionBeanSetupper<MShapeGrpDtlCB>(){
				public void setup(MShapeGrpDtlCB subCB){
					subCB.setupSelect_MShapeGrp();
					subCB.setupSelect_MShape().withVDictByShapeDictId(getCultureId());
					subCB.setupSelect_MShape().withVDictByShapeUnitDictId(getCultureId());
					subCB.query().addOrderBy_ShapeSort_Asc();
					subCB.query().setDelFlg_Equal_$0();
				}
			});
			return mShapeGrpList.get(0);
		}
		return null;
//		List<MProduct> mProductList = new ArrayList<MProduct>();
//		mProductList.add(result);
//		// 商品荷姿マスタ
//		mProductBhv.loadMProductShapeList(mProductList, new ConditionBeanSetupper<MProductShapeCB>(){
//			public void setup(MProductShapeCB subCB){
//				subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
//				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
//				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
//				subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
//				subCB.query().setDelFlg_Equal_$0();
//			}
//		});

	}
	// [Ver3.0] unit of measure対応 2017.12.14 NING End
	// [Ver3.0] unit of measure対応 2017.12.21 NING Start
	/**
	 * <h2>商品荷姿マスタを取得する。</h2>
	 * <pre>
	 * 商品CDと荷主CDに商品荷姿マスタと荷姿グループマスタと荷姿グループ明細マスタと荷姿マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 商品に紐付く商品荷姿を荷姿ソート順にて全て取得する。
	 * </pre>
	 * @param productCd 商品CD
	 * @param clientCd 荷主CD
	 * @param shapeCd 荷姿CD
	 *
	 * @return MShapeGrp 商品荷姿マスタ
	 */
	public MShapeGrp getProductByCd(String productCd, final String clientCd, final String shapeCd) {

		MProductCB cb = mProductBhv.newMyConditionBean();
		cb.setupSelect_MShapeGrp();
		cb.setupSelect_MClient();
		cb.query().queryMClient().setClientCd_Equal(clientCd);
		cb.query().setProductCd_Equal(productCd);

		ListResultBean<MProduct> result = mProductBhv.selectList(cb);

		if (result != null && result.size() > 0) {
			List<MShapeGrp> mShapeGrpList = new ArrayList<MShapeGrp>();
			mShapeGrpList.add(result.get(0).getMShapeGrp());
			// 荷姿グループ明細マスタ
			mShapeGrpBhv.loadMShapeGrpDtlList(mShapeGrpList, new ConditionBeanSetupper<MShapeGrpDtlCB>(){
				public void setup(MShapeGrpDtlCB subCB){
					subCB.setupSelect_MShape().withVDictByShapeDictId(getCultureId());
					subCB.setupSelect_MShape().withVDictByShapeUnitDictId(getCultureId());
					subCB.query().queryMShape().setShapeCd_Equal(shapeCd);
					subCB.query().addOrderBy_ShapeSort_Asc();
					subCB.query().setDelFlg_Equal_$0();
				}
			});
			return mShapeGrpList.get(0);
		}
		return null;
	}
	// [Ver3.0] unit of measure対応 2017.12.21 NING End

	// [#4655][v3.0] 出荷検品画面で小数有り商品の重量が計算される問題を修正 2018.05.25 kawana Start

	/**
	 * <h2>小数を含む商品かを確認.</h2>
	 * <pre>
	 * 引数の商品IDの商品が小数を含む場合はtrueを返す
	 * </pre>
	 * @param productId 商品ID
	 * @return true : 小数を含む 、 false : 小数を含まない
	 */
	public boolean existDecimal(long productId) {

		MProductCB cb = mProductBhv.newMyConditionBean();
		cb.setupSelect_MShapeGrp();
		cb.query().setProductId_Equal(productId);

		MProduct entity = mProductBhv.selectEntityWithDeletedCheck(cb);

		return entity.getMShapeGrp().isDecimalExistFlg$1();
	}

	// [#4655][v3.0] 出荷検品画面で小数有り商品の重量が計算される問題を修正 2018.05.25 kawana End

	// [#5115][v3.1] 単行出荷検品 作成 2018.08.13 kawana Start

	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に商品マスタデータを取得する。
	 * </pre>
	 * @param entity 商品マスタ：商品CD・荷主ID
	 * @return MProduct 商品マスタ
	 */
	public MProduct getEntityProductCdOrJanCd(final MProduct entity) {
		return getEntityProductCdOrJanCd(entity, null);
	}

	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * 荷主ID、商品CD(またはソースCD)を条件に商品マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 商品マスタ：商品CDまたはソースCD・荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MProduct 商品マスタ
	 */
	public MProduct getEntityProductCdOrJanCd(final MProduct entity, ErrorStatus errSts) {

		if (entity.getClientId() == null) {
			return null;
		}

		if (CU.isNullOrEmpty(entity.getProductCd()) && CU.isNullOrEmpty(entity.getJanCd()) ) {
			return null;
		}

		MProductCB cb = mProductBhv.newMyConditionBean();
		cb.setupSelect_MShapeGrp();
		cb.query().setClientId_Equal(entity.getClientId());
		cb.orScopeQuery(new OrQuery<MProductCB>() {

			@Override
			public void query(MProductCB orCb) {
				orCb.query().setJanCd_Equal(entity.getJanCd());
				orCb.query().setProductCd_Equal(entity.getProductCd());
			}
		});

		MProduct product = mProductBhv.selectEntity(cb);

		if (product == null) {

			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
			return null;
		}

		return product;
	}

	// [#5115][v3.1] 単行出荷検品 作成 2018.08.13 kawana End
}
