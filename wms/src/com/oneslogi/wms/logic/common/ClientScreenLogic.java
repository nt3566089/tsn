package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MClientScreenCB;
import com.oneslogi.base.dbflute.exbhv.MClientScreenBhv;
import com.oneslogi.base.dbflute.exentity.MClientScreen;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷主画面マスタ共通ロジッククラス
 */
public class ClientScreenLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientScreenBhv mClientScreenBhv;

	/**
	 * <h2>登録時荷主画面マスタ重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・画面ID
	 * </pre>
	 * @param mClientScreen 荷主画面マスタ：荷主ID・画面ID
	 * @return boolean (true:荷主画面マスタ重複)
	 */
	public boolean checkClientScreenCdInsert(MClientScreen mClientScreen) {
		boolean result = false;
		result = checkClientScreenCdInsert(mClientScreen, null);
		return result;
	}

	/**
	 * <h2>登録時荷主IDと画面CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に荷主画面マスタのデータを検索し、
	 * 検索件数が1件以上の場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mClientScreen 荷主画面マスタ：荷主ID・画面ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:荷主IDと画面CD重複)
	 */
	public boolean checkClientScreenCdInsert(MClientScreen mClientScreen, ErrorStatus errSts) {
		MClientScreenCB cb = mClientScreenBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setClientId_Equal(mClientScreen.getClientId());
		cb.query().setScreenId_Equal(mClientScreen.getScreenId());

		int count = mClientScreenBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_SCREEN_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時画面CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・画面ID
	 * </pre>
	 * @param mClientScreen 荷主画面マスタ：荷主ID・画面ID・荷主画面ID
	 * @return boolean (true:画面CD重複)
	 */
	public boolean checkClientScreenCdUpdate(MClientScreen mClientScreen) {
		boolean result = false;
		result = checkClientScreenCdUpdate(mClientScreen, null);
		return result;
	}

	/**
	 * <h2>更新時画面CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に荷主画面マスタのデータを検索し、
	 * 引数と取得結果の荷主画面IDが異なる場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mClientScreen 荷主画面マスタ：荷主ID・画面ID・荷主画面ID
	 * @return boolean (true:画面CD重複)
	 */
	public boolean checkClientScreenCdUpdate(MClientScreen mClientScreen, ErrorStatus errSts) {
		MClientScreenCB cb = mClientScreenBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setClientId_Equal(mClientScreen.getClientId());
		cb.query().setScreenId_Equal(mClientScreen.getScreenId());
		MClientScreen clientScreen = mClientScreenBhv.selectEntity(cb);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (clientScreen != null &&
				!CU.isNotNullAndEquals(mClientScreen.getClientScreenId(), clientScreen.getClientScreenId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_SCREEN_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>荷主画面マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主画面マスタデータを取得する。
	 * </pre>
	 * @param entity 荷主画面マスタ：荷主画面ID
	 * @return MClientScreen 荷主画面マスタ
	 */
	public MClientScreen getPkEntity(MClientScreen entity) {
		return getPkEntity(entity, null);
	}

	/**
	 * <h2>荷主画面マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主画面マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷主画面マスタ：荷主画面ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClientScreen 荷主画面マスタ
	 */
	public MClientScreen getPkEntity(MClientScreen entity, ErrorStatus errSts) {
		MClientScreen resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_SCREEN_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>荷主画面マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主画面マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主画面マスタ：荷主画面ID
	 * @return MClientScreen 荷主画面マスタ
	 */
	public MClientScreen getPkEntityWithDeletedCheck(MClientScreen entity) {
		if (entity.getClientScreenId() == null) {
			return null;
		}
		return mClientScreenBhv.selectByPKValueWithDeletedCheck(entity.getClientScreenId());
	}

	/**
	 * <h2>荷主画面マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主画面マスタデータを取得する。
	 * </pre>
	 * @param entity 荷主画面マスタ：荷主ID・画面ID
	 * @return MClientScreen 荷主画面マスタ
	 */
	public MClientScreen getUkEntity(MClientScreen entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>荷主画面マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主画面マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷主画面マスタ：荷主ID・画面ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClientScreen 荷主画面マスタ
	 */
	public MClientScreen getUkEntity(MClientScreen entity, ErrorStatus errSts) {
		MClientScreen resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_SCREEN_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>荷主画面マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主画面マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主画面マスタ：荷主ID・画面ID
	 * @return MClientScreen 荷主画面マスタ
	 */
	public MClientScreen getUkEntityWithDeletedCheck(MClientScreen entity) {
		Long clientId = entity.getClientId();
		if (clientId == null) {
			return null;
		}
		MClientScreenCB cb = mClientScreenBhv.newMyConditionBean();
		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setScreenId_Equal(entity.getScreenId());
		return mClientScreenBhv.selectEntityWithDeletedCheck(cb);
	}
}