package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MBoxCB;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
/**
 * 荷材マスタ共通ロジッククラス
 */
public class BoxLogic extends AbstractWmsLogic {
	// ===== 使用テーブル =====
	@Inject
	private MBoxBhv mBoxBhv;

	/**
	 * <h2>登録時荷材CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・荷材CD重複チェック
	 * </pre>
	 * @param mBox 荷材マスタ：全項目
	 * @return boolean (true:荷材CD重複)
	 */
	public boolean checkBoxCdInsert(MBox mBox) {
		boolean result = false;
		result = checkBoxCdInsert(mBox, null);
		return result;
	}

	/**
	 * <h2>登録時荷材CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に荷材マスタデータを取得する。
	 * 検索件数が1件以上の場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mBox 荷材マスタ：センタID・荷材CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:荷材CD重複)
	 */
	public boolean checkBoxCdInsert(MBox mBox, ErrorStatus errSts) {
		//削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		MBoxCB cb = mBoxBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		// [ON推-品向-821] 別センタの荷材CDが重複エラーになる 2015.06.16 kawana Start
		cb.query().setCenterId_Equal(mBox.getCenterId());
		// [ON推-品向-821] 別センタの荷材CDが重複エラーになる 2015.06.16 kawana End
		cb.query().setBoxCd_Equal(mBox.getBoxCd());

		int count = mBoxBhv.selectCount(cb);
		if (count > 0) {
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
			//this.getErrorManager().add(errSts, "boxCodeDuplicateError");
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
			return true;
		}
		return false;
	}


	/**
	 * <h2>更新時荷材CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・荷材CD重複チェック
	 * </pre>
	 * @param mBox 荷材マスタ：センタID・荷材CD・荷材ID
	 * @return boolean (true:荷材CD重複)
	 */
	public boolean checkBoxCdUpdate(MBox mBox) {
		boolean result = false;
		result = checkBoxCdUpdate(mBox, null);
		return result;
	}

	/**
	 * <h2>更新時荷材CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に荷材マスタに検索する。
	 * 引数の荷材IDと取得する荷材IDが異なる場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mBox 荷材マスタ：センタID・荷材CD・荷材ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:荷材CD重複)
	 */
	public boolean checkBoxCdUpdate(MBox mBox, ErrorStatus errSts) {
		//削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		MBoxCB cb = mBoxBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		// [ON推-品向-821] 別センタの荷材CDが重複エラーになる 2015.06.16 kawana Start
		cb.query().setCenterId_Equal(mBox.getCenterId());
		// [ON推-品向-821] 別センタの荷材CDが重複エラーになる 2015.06.16 kawana End
		cb.query().setBoxCd_Equal(mBox.getBoxCd());
		MBox box = mBoxBhv.selectEntity(cb);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (box != null &&
				!CU.isNotNullAndEquals(mBox.getBoxId(), box.getBoxId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End

			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
			//this.getErrorManager().add(errSts, "boxCodeDuplicateError");
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
			return true;
		}
		return false;
	}

	/**
	 * <h2>荷材マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷材マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷材マスタ：センタID・荷材CD
	 * @return MBox 荷材マスタ
	 */
	public MBox getUkEntityWithDeletedCheck(MBox entity) {

		// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana Start
		if (entity.getCenterId() == null) {
			return null;
		}
		// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana End

		if (CU.isNullOrEmpty(entity.getBoxCd())) {
			return null;
		}

		MBoxCB cb = mBoxBhv.newMyConditionBean();
		// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana Start
		cb.query().setCenterId_Equal(entity.getCenterId());
		// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana End
		cb.query().setBoxCd_Equal(entity.getBoxCd());
		return mBoxBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>荷材マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷材マスタデータを取得する。
	 * </pre>
	 * @param entity 荷材マスタ：センタID・荷材CD
	 * @return MBox 荷材マスタ
	 */
	public MBox getUkEntity(MBox entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>荷材マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷材マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷材マスタ：センタID・荷材CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MBox 荷材マスタ
	 */
	public MBox getUkEntity(MBox entity, ErrorStatus errSts) {
		MBox resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.BOX_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}
}
