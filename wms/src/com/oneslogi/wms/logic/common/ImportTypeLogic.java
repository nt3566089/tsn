package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MImportTypeCB;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 取込み種別マスタ共通ロジッククラス
 */
public class ImportTypeLogic extends AbstractWmsLogic {

	@Inject
	private MImportTypeBhv mImportTypeBhv;

	/**
	 * <h2>取込み種別マスタのリストを取得する。</h2>
	 * <pre>
	 * 荷主CDを条件に取込み種別マスタのリストを取得する。
	 * 条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主マスタ：荷主CD
	 * @return List<MImportType> 取込み種別マスタリスト
	 */
	public List<MImportType> getEntityListByClientCd(MClient entity) {

		if (CU.isNullOrEmpty(entity.getClientCd())) {
			return null;
		}

		MImportTypeCB cb = mImportTypeBhv.newMyConditionBean();
		cb.query().queryMClient().setClientCd_Equal(entity.getClientCd());

		cb.query().addOrderBy_ImportTypeCd_Asc();

		return mImportTypeBhv.selectList(cb);
	}

	/**
	 * <h2>取込み種別マスタのリストを取得する。</h2>
	 * <pre>
	 * 荷主IDを条件に取込種別マスタのリストを取得する。
	 * 条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 取込種別マスタ：荷主ID
	 * @return List<MImportType> 取込み種別マスタリスト
	 */
	public List<MImportType> getEntityListByClientId(MImportType entity) {

		if (entity.getClientId() == null) {
			return null;
		}

		MImportTypeCB cb = mImportTypeBhv.newMyConditionBean();
		cb.query().setClientId_Equal(entity.getClientId());

		cb.query().addOrderBy_ImportTypeCd_Asc();

		return mImportTypeBhv.selectList(cb);
	}

	/**
	 * <h2>取込種別マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に取込種別マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 取込種別マスタ：取込種別ID
	 * @return MImportType 取込種別マスタ
	 */
	public MImportType getPkEntityWithDeletedCheck(MImportType entity) {
		if (entity.getImportTypeId() == null) {
			return null;
		}
		return mImportTypeBhv.selectByPKValueWithDeletedCheck(entity.getImportTypeId());
	}

	/**
	 * <h2>取込種別マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に取込種別マスタデータを取得する。
	 * </pre>
	 * @param entity 取込種別マスタ：取込種別ID
	 * @return MImportType 取込種別マスタ
	 */
	public MImportType getPkEntity(MImportType entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * <h2>取込種別マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に取込種別マスタデータを取得する。
	 * 検索対象が見つからない場合はエラー管理クラスに未存在エラーを登録しNULLを返す。
	 * </pre>
	 * @param entity 取込種別マスタ：取込種別ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MImportType 取込種別マスタ
	 */
	public MImportType getPkEntity(MImportType entity, ErrorStatus errSts) {
		MImportType resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.IMPORT_TYPE_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>取込種別マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に取込種別マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合、エラー管理クラスに未存在エラーを登録しNULLを返す。
	 * </pre>
	 * @param entity 取込種別マスタ：取込種別ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MImportType 取込種別マスタ
	 */
	public MImportType getPkEntitySetupClient(MImportType entity, ErrorStatus errSts) {

		if (entity.getImportTypeId() == null) {
			return null;
		}

		MImportTypeCB cb = mImportTypeBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		cb.query().setImportTypeId_Equal(entity.getImportTypeId());

		MImportType resultEntity = null;
		try {
			resultEntity = mImportTypeBhv.selectEntityWithDeletedCheck(cb);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.IMPORT_TYPE_NOT_FOUND_ERROR);
		}

		return resultEntity;
	}


	/**
	 * <h2>取込種別マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に取込種別マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 取込種別マスタ：荷主ID・取込種別CD
	 * @return MImportType 取込種別マスタ
	 */
	public MImportType getUkEntityWithDeletedCheck(MImportType entity) {

		if (entity.getClientId() == null) {
			return null;
		}

		if (CU.isNullOrEmpty(entity.getImportTypeCd())) {
			return null;
		}

		MImportTypeCB cb = mImportTypeBhv.newMyConditionBean();
		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setImportTypeCd_Equal(entity.getImportTypeCd());
		return mImportTypeBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>取込種別マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に取込種別マスタデータを取得する。
	 * </pre>
	 * @param entity 取込種別マスタ：荷主ID・取込種別CD
	 * @return MImportType 取込種別マスタ
	 */
	public MImportType getUkEntity(MImportType entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>取込種別マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に取込種別マスタデータを取得する。
	 * 検索対象が見つからない場合、エラー管理クラスに未存在エラーを登録しNULLを返す。
	 * </pre>
	 * @param entity 取込種別マスタ：荷主ID・取込種別CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MImportType 取込種別マスタ
	 */
	public MImportType getUkEntity(MImportType entity, ErrorStatus errSts) {
		MImportType resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.IMPORT_TYPE_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>登録時重複チェック処理を行う。</h2>
	 * <pre>
	 * 荷主ID、取込種別CDの組み合わせが既に登録されているかチェックする。
	 * 検索件数が1件以上の場合、既に登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 取込種別マスタ：荷主ID・取込種別CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true:重複なし false:重複あり
	 */
	public boolean checkCdInsert(MImportType entity, ErrorStatus errSts) {

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MImportTypeCB cb = mImportTypeBhv.newMyConditionBean();

		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setImportTypeCd_Equal(entity.getImportTypeCd());

		int count = mImportTypeBhv.selectCount(cb);

		// 削除フラグの自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		if (count > 0) {
			// 重複エラー
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.20 SJA Start
			//this.getErrorManager().add(errSts, WmsMessageConst.IMPORT_TYPE_DUPLICATE_ERROR);
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.20 SJA End
			return false;
		}

		return true;
	}
}
