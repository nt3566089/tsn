package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MCarrierBoxCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierBoxBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierBox;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 運送業者荷材マスタに対するロジッククラス。
 */
public class CarrierBoxLogic extends AbstractWmsLogic {

	@Inject
	private MCarrierBoxBhv mCarrierBoxBhv;
	
	/**
	 * プライマリキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	public MCarrierBox getPkEntityWithDeletedCheck(MCarrierBox entity) {
		if (entity.getCarrierBoxId() == null) {
			return null;
		}
		return mCarrierBoxBhv.selectByPKValueWithDeletedCheck(entity.getCarrierBoxId());
	}

	/**
	 * プライマリキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返す。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	public MCarrierBox getPkEntity(MCarrierBox entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * ※※※ 必要であればメッセージ定義後に本メソッドを public に変更すること
	 * プライマリキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラー情報として管理する。
	 *
	 * @param entity 検索条件
	 * @param errSts エラー時のエラー情報への設定値
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	private MCarrierBox getPkEntity(MCarrierBox entity, ErrorStatus errSts) {
		MCarrierBox resultEntity = null;
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
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	public MCarrierBox getUkEntityWithDeletedCheck(MCarrierBox entity) {

		if (entity.getCarrierId() == null) {
			return null;
		}

		if (entity.getBoxId() == null) {
			return null;
		}

		MCarrierBoxCB cb = mCarrierBoxBhv.newMyConditionBean();
		cb.query().setCarrierId_Equal(entity.getCarrierId());
		cb.query().setBoxId_Equal(entity.getBoxId());
		return mCarrierBoxBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返す。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	public MCarrierBox getUkEntity(MCarrierBox entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * ※※※ 必要であればメッセージ定義後に本メソッドを public に変更すること
	 *
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラー情報として管理する。
	 *
	 * @param entity 検索条件
	 * @param errSts エラー時のエラー情報への設定値
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	private MCarrierBox getUkEntity(MCarrierBox entity, ErrorStatus errSts) {
		MCarrierBox resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合

			// ※※※ 必要であればメッセージ定義後に本メソッドを public に変更すること
			//			this.getErrorManager().add(errSts, "xxxxxxxxxxxxxxxxx");
		}
		return resultEntity;
	}

	/**
	 * <h2>登録時商品荷姿重複チェック処理。</h2>
	 * <pre>
	 * 下記テーブルのデータをチェックする。
	 * ・商品荷姿マスタ
	 *
	 * 【パラメータの使用項目】
	 *  商品荷姿マスタ
	 *  ・商品ID
	 *  ・荷姿ID
	 * </pre>
	 * @param mProductShape 商品荷姿マスタEntity
	 * @param errSts エラー時のエラー情報への設定値
	 * @return boolean (true:商品荷姿重複)
	 */
	public boolean checkCarrierBoxIdInsert(MCarrierBox mCarrierBox, ErrorStatus errSts) {

		// 削除フラグの検索条件自動付加を無効化
		this.setBehaviorAutoDelFlg(false);
		MCarrierBoxCB cb = mCarrierBoxBhv.newMyConditionBean();
		cb.query().setCarrierId_Equal(mCarrierBox.getCarrierId());
		cb.query().setBoxId_Equal(mCarrierBox.getBoxId());

		int count = mCarrierBoxBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			return true;
		}

		// 削除フラグの検索条件自動付加を有効化
		this.setBehaviorAutoDelFlg(true);

		return false;
	}
}
