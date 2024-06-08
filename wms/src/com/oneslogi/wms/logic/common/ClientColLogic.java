package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MClientColCB;
import com.oneslogi.base.dbflute.exbhv.MClientColBhv;
import com.oneslogi.base.dbflute.exentity.MClientCol;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷主列マスタ共通ロジッククラス
 */
public class ClientColLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientColBhv mClientColBhv;

	/**
	 * <h2>登録時列CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・列CD重複チェック
	 * </pre>
	 * @param mClientCol 荷主列マスタ：荷主ID・列ID
	 * @return boolean (true:列CD重複)
	 */
	public boolean checkClientColCdInsert(MClientCol mClientCol) {
		boolean result = false;
		result = checkClientColCdInsert(mClientCol, null);
		return result;
	}

	/**
	 * <h2>登録時列ID重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に荷主列マスタのデータを検索し、
	 * 検索件数が1件以上の場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mClientCol 荷主列マスタ：荷主ID・列ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:列ID重複)
	 */
	public boolean checkClientColCdInsert(MClientCol mClientCol, ErrorStatus errSts) {
		MClientColCB cb = mClientColBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setClientId_Equal(mClientCol.getClientId());
		cb.query().setColId_Equal(mClientCol.getColId());

		int count = mClientColBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_COL_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時列CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・列CD重複チェック
	 * </pre>
	 * @param mClientCol 荷主列マスタ：荷主ID・列ID・荷主列ID
	 * @return boolean (true:列CD重複)
	 */
	public boolean checkClientColCdUpdate(MClientCol mClientCol) {
		boolean result = false;
		result = checkClientColCdUpdate(mClientCol, null);
		return result;
	}

	/**
	 * <h2>更新時荷主列ID重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に荷主列マスタのデータを検索し、
	 * 引数と取得結果の荷主列IDが異なる場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mClientCol 荷主列マスタ：荷主ID・列ID・荷主列ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:荷主列ID重複)
	 */
	public boolean checkClientColCdUpdate(MClientCol mClientCol, ErrorStatus errSts) {
		MClientColCB cb = mClientColBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setClientId_Equal(mClientCol.getClientId());
		cb.query().setColId_Equal(mClientCol.getColId());
		MClientCol clientCol = mClientColBhv.selectEntity(cb);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (clientCol != null &&
				!CU.isNotNullAndEquals(mClientCol.getClientColId(), clientCol.getClientColId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_COL_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>荷主列マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主列マスタデータを取得する。
	 * </pre>
	 * @param entity 荷主列マスタ：荷主列ID
	 * @return MClientCol 荷主列マスタ
	 */
	public MClientCol getPkEntity(MClientCol entity) {
		return getPkEntity(entity, null);
	}

	/**
	 * <h2>荷主列マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主列マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷主列マスタ：荷主列ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClientCol 荷主列マスタ
	 */
	public MClientCol getPkEntity(MClientCol entity, ErrorStatus errSts) {
		MClientCol resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_COL_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>荷主列マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主列マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主列マスタ：荷主列ID
	 * @return MClientCol 荷主列マスタ
	 */
	public MClientCol getPkEntityWithDeletedCheck(MClientCol entity) {
		if (entity.getClientColId() == null) {
			return null;
		}
		return mClientColBhv.selectByPKValueWithDeletedCheck(entity.getClientColId());
	}

	/**
	 * <h2>荷主列マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主列マスタデータを取得する。
	 * </pre>
	 * @param entity 荷主列マスタ：荷主ID・列ID
	 * @return MClientCol 荷主列マスタ
	 */
	public MClientCol getUkEntity(MClientCol entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>荷主列マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主列マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷主列マスタ：荷主ID・列ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClientCol 荷主列マスタ
	 */
	public MClientCol getUkEntity(MClientCol entity, ErrorStatus errSts) {
		MClientCol resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_COL_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>荷主列マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主列マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主列マスタ：荷主ID・列ID
	 * @return MClientCol 荷主列マスタ
	 */
	public MClientCol getUkEntityWithDeletedCheck(MClientCol entity) {
		Long clientId = entity.getClientId();
		if (clientId == null) {
			return null;
		}
		MClientColCB cb = mClientColBhv.newMyConditionBean();
		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setColId_Equal(entity.getColId());
		return mClientColBhv.selectEntityWithDeletedCheck(cb);
	}
}