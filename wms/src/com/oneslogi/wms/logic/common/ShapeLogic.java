package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.MShapeCB;
import com.oneslogi.base.dbflute.cbean.MShapeGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpDtlBhv;
import com.oneslogi.base.dbflute.exentity.MShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷姿マスタ共通ロジッククラス
 */
public class ShapeLogic extends AbstractWmsLogic {

	@Inject
	private MShapeBhv mShapeBhv;
	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
	@Inject
	private MParamBhv mParamBhv;
	@Inject
	private MProductShapeBhv mProductShapeBhv;
	// [Ver3.0] unit of measure対応 2017.11.30 潘 Start
	@Inject
	private MShapeGrpDtlBhv mShapeGrpDtlBhv;
	// [Ver3.0] unit of measure対応 2017.11.30 潘 End

	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End
	/**
	 * <h2>荷姿マスタを取得する。</h2>
	 * <pre>
	 * 荷姿マスタから荷姿IDが最大のデータを取得する。
	 * </pre>
	 * @param entity 荷姿マスタ：荷姿ID
	 * @return MShape 荷姿マスタ
	 */
	public MShape getPkEntityWithDeletedCheck(MShape entity) {

		// ※※※ リリース1.0では、本マスタは使用しないため、仮実装として荷姿IDが最大のものを1件取得する
		MShapeCB cb = mShapeBhv.newMyConditionBean();
		cb.query().scalar_Equal().max(new SubQuery<MShapeCB>() {

			@Override
			public void query(MShapeCB subCb) {
				subCb.specify().columnShapeId();
				setDelFlg(subCb);
			}
		});

		return mShapeBhv.selectEntityWithDeletedCheck(cb);
	}

	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
//	/**
//	 * ユニークキーを条件にエンティティを返す。
//	 * 検索条件がNULLの場合はNULLを返す。
//	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
//	 *
//	 * @param entity 検索条件
//	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
//	 */
//	public MShape getUkEntityWithDeletedCheck(MShape entity) {
//
////		if (entity.getClientId() == null) {
////			return null;
////		}
////		if (CU.isNullOrEmpty(entity.getShapeCd())) {
////			return null;
////		}
////
////		MShapeCB cb = mShapeBhv.newMyConditionBean();
////		cb.query().setClientId_Equal(entity.getClientId());
////		cb.query().setShapeCd_Equal(entity.getShapeCd());
//
//		// ※※※ リリース1.0では、本マスタは使用しないため、仮実装として荷姿IDが最大のものを1件取得する
//		MShapeCB cb = mShapeBhv.newMyConditionBean();
//		cb.query().scalar_Equal().max(new SubQuery<MShapeCB>() {
//
//			@Override
//			public void query(MShapeCB subCb) {
//				subCb.specify().columnShapeId();
//				setDelFlg(subCb);
//			}
//		});
//		return mShapeBhv.selectEntityWithDeletedCheck(cb);
//	}

	/**
	 * <h2>荷姿マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷姿マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷姿マスタ：荷主ID・荷姿CD
	 * @return MShape 荷姿マスタ
	 */
	public MShape getUkEntityWithDeletedCheck(MShape entity) {

		// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
		if (CU.isNullOrEmpty(entity.getShapeCd())) {
			return null;
		}

		MShapeCB cb = mShapeBhv.newMyConditionBean();
		// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
		cb.query().setShapeCd_Equal(entity.getShapeCd());
		return mShapeBhv.selectEntityWithDeletedCheck(cb);
	}

	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End
	/**
	 * <h2>荷姿IDのMAX値を取得する。</h2>
	 * <pre>
	 * 荷姿マスタから荷姿IDの最大値を取得する。
	 * </pre>
	 * @param entity 荷姿マスタ：荷姿ID
	 * @return long 荷姿IDのMAX値
	 */
	public long getMaxValue(MShape entity) {

		return getPkEntityWithDeletedCheck(entity).getShapeId();
	}

	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
	/**
	 * <h2>荷姿マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷姿マスタデータを取得する。
	 * </pre>
	 * @param entity 荷姿マスタ：荷主ID・荷姿CD
	 * @return MShape 荷姿マスタ
	 */
	public MShape getUkEntity(MShape entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>荷姿マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷姿マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷姿マスタ：荷主ID・荷姿CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MShape 荷姿マスタ
	 */
	public MShape getUkEntity(MShape entity, ErrorStatus errSts) {
		MShape resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.SHAPE_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>登録時荷姿CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に荷姿マスタのデータを検索し、
	 * 検索件数が1件以上の場合、既に登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mShape 荷姿マスタ：荷姿CD、荷主マスタ：荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:荷姿CD重複)
	 */
	public boolean checkShapeCdInsert(MShape mShape, ErrorStatus errSts) {
		//削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		MShapeCB cb = mShapeBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setShapeCd_Equal(mShape.getShapeCd());
		// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
		int count = mShapeBhv.selectCount(cb);
		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		if (count > 0) {
			this.getErrorManager().add(errSts, "alreadyRegisteredCannotRegisterError");
			return true;
		}
		return false;
	}

	// [ON推-品向-1113] GTIN14シンボル重複チェック処理を追加 2016.4.19 ichikawa Start
	/**
	 * <h2>登録時GTIN14シンボル重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に荷姿マスタのデータを検索し、
	 * 検索件数が1件以上の場合、既に登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mShape 荷姿マスタ：GTIN14シンボル、荷主マスタ：荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:GTIN14シンボル重複)
	 */
	public boolean checkGtin14SymbolInsert(MShape mShape, ErrorStatus errSts) {
		//削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		MShapeCB cb = mShapeBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
		int count = mShapeBhv.selectCount(cb);
		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>修正時GTIN14シンボル存在チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に荷姿マスタのデータを検索し、
	 * 検索件数が1件以上の場合、既に登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mShape 荷姿マスタ：GTIN14シンボル・荷主ID・荷姿ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:GTIN14シンボル重複)
	 */
	public boolean checkGtin14SymbolExist(MShape mShape, ErrorStatus errSts) {
		//削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		MShapeCB cb = mShapeBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
		cb.query().setShapeId_NotEqual(mShape.getShapeId());
		int count = mShapeBhv.selectCount(cb);
		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return true;
		}
		return false;
	}
	// [ON推-品向-1113] GTIN14シンボル重複チェック処理を追加 2016.4.19 ichikawa End

	/**
	 * <h2>荷姿IDがパラメータマスタに存在チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にパラメータマスタのデータを検索し、
	 * 検索結果が1件以上の場合、削除不可エラーをエラー情報として管理する。
	 * </pre>
	 * @param shapeId 荷姿ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:荷姿ID存在)
	 */
	public boolean checkParamExist(final Long shapeId, ErrorStatus errSts) {

		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);
		MParamCB cb = mParamBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.orScopeQuery(new OrQuery<MParamCB>() {
			@Override
			public void query(MParamCB arg0) {
				// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
			}
		});

		int count = mParamBhv.selectCount(cb);

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);

		if (count > 0) {
			this.getErrorManager().add(errSts, "shapeCodeCannotDeleteInParamMasterError");
			return true;
		}
		return false;
	}

	/**
	 * <h2>荷姿IDが商品荷姿マスタに存在チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に商品荷姿マスタのデータを検索し、
	 * 検索結果が1件以上の場合、削除不可エラーをエラー情報として管理する。
	 * </pre>
	 * @param shapeId 荷姿ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:荷姿ID存在)
	 */
	public boolean checkProductShapeExist(final Long shapeId, ErrorStatus errSts) {

		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);
		MProductShapeCB cb = mProductShapeBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		// [Ver3.0] unit of measure対応 2017.11.30 駱 Del
		int count = mProductShapeBhv.selectCount(cb);

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);

		if (count > 0) {
			this.getErrorManager().add(errSts, "shapeCodeCannotDeleteInProductShapeMasterError");
			return true;
		}
		return false;
	}
	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End

	// [エンハンス PH2.0] PKより、データを取得 2015.12.07 sja Start
	/**
	 * <h2>荷姿マスタのデータを取得する。</h2>
	 * <pre>
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param shapeId 荷姿ID
	 * @return MShape 荷姿マスタ
	 */
	public MShape getPkEntity(Long shapeId) {
		if (shapeId == null) {
			return null;
		}

		return mShapeBhv.selectByPKValueWithDeletedCheck(shapeId);
	}
	// [エンハンス PH2.0] PKより、データを取得 2015.12.07 sja End

	// [Ver3.0] unit of measure対応 2017.11.30 潘 Start
	/**
	 * <h2>荷姿グループ明細で登録済みかどうかをチェックする。</h2>
	 * <pre>
	 * 荷姿グループ明細でデータ存在する場合、明細．荷姿CDの上にエラーを表示する。
	 * </pre>
	 * @param shapeId 荷姿ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:荷姿ID存在)
	 */
	public boolean checkMShapeGrpDtlRegistered(MShape mShape,ErrorStatus errSts) {

		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);
		MShapeGrpDtlCB cb = mShapeGrpDtlBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setShapeId_Equal(mShape.getShapeId());

		int count = mShapeGrpDtlBhv.selectCount(cb);

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);

		if (count > 0) {
			this.getErrorManager().add(errSts, "shapeCodeCannotDeleteInShapeGroupMasterDtlError");
			return true;
		}
		return false;
	}
	// [Ver3.0] unit of measure対応 2017.11.30 潘 End

	/**
	 * <h2>最小単位の荷姿グループ明細を取得する。</h2>
	 * <pre>
	 * 荷姿グループIDにより、最小単位の荷姿グループ明細を取得する。
	 * </pre>
	 * @param shapeGrpId 荷姿グループID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:荷姿ID存在)
	 */
	public MShapeGrpDtl getMinShapeGrpDtl(Long shapeGrpId) {

		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);
		MShapeGrpDtlCB cb = mShapeGrpDtlBhv.newMyConditionBean();
		cb.setupSelect_MShapeGrp();
		cb.query().queryMShapeGrp().setShapeGrpId_Equal(shapeGrpId);
		cb.query().setShapeSort_Equal(1l);

		 ListResultBean<MShapeGrpDtl> result = mShapeGrpDtlBhv.selectList(cb);

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);

		if (result != null && result.size() > 0) {
			return result.get(0);
		}
		return null;
	}
}
