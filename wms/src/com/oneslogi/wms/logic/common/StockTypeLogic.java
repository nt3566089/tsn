package com.oneslogi.wms.logic.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MProcessTypeCB;
import com.oneslogi.base.dbflute.cbean.MStockTypeCB;
import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫区分マスタ共通ロジッククラス
 */
public class StockTypeLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MStockTypeBhv mStockTypeBhv;
	@Inject
	private MProcessTypeBhv mProcessTypeBhv;

	/**
	 * <h2>登録時在庫区分CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・在庫区分CD重複チェック
	 * </pre>
	 * @param mStockType 在庫区分マスタ：在庫区分CD
	 * @return boolean (true:在庫区分CD重複)
	 */
	public boolean checkStockTypeCdInsert(MStockType mStockType) {
		boolean result = false;
		result = checkStockTypeCdInsert(mStockType, null);
		return result;
	}

	/**
	 * <h2>登録時在庫区分CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に在庫区分マスタのデータを検索し、
	 * 検索件数が1件以上の場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mStockType 在庫区分マスタ：在庫区分CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:在庫区分CD重複)
	 */
	public boolean checkStockTypeCdInsert(MStockType mStockType, ErrorStatus errSts) {
		MStockTypeCB cb = mStockTypeBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setStockTypeCd_Equal(mStockType.getStockTypeCd());

		int count = mStockTypeBhv.selectCount(cb);
		if (count > 0) {
			this.getErrorManager().add(errSts, "alreadyRegisteredCannotRegisterError");
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時在庫区分CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・在庫区分CD重複チェック
	 * </pre>
	 * @param mStockType 在庫区分マスタ：在庫区分CD・在庫区分ID
	 * @return boolean (true:在庫区分CD重複)
	 */
	public boolean checkStockTypeCdUpdate(MStockType mStockType) {
		boolean result = false;
		result = checkStockTypeCdUpdate(mStockType, null);
		return result;
	}

	/**
	 * <h2>更新時在庫区分CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に在庫区分マスタのデータを検索し、
	 * 引数と取得結果の在庫区分IDが異なる場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mStockType 在庫区分マスタ：在庫区分CD・在庫区分ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:在庫区分CD重複)
	 */
	public boolean checkStockTypeCdUpdate(MStockType mStockType, ErrorStatus errSts) {
		MStockTypeCB cb = mStockTypeBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setStockTypeCd_Equal(mStockType.getStockTypeCd());
		MStockType StockType = mStockTypeBhv.selectEntity(cb);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (StockType != null &&
				!CU.isNotNullAndEquals(mStockType.getStockTypeId(), StockType.getStockTypeId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End
			this.getErrorManager().add(errSts, "alreadyRegisteredCannotRegisterError");
			return true;
		}
		return false;
	}

	/**
	 * <h2>在庫区分ID存在チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・在庫区分ID存在チェック
	 * </pre>
	 * @param mStockType 在庫区分マスタ：在庫区分ID
	 * @return boolean (true:在庫区分ID存在)
	 */
	public boolean checkStockTypeId(MStockType mStockType) {
		MStockTypeCB cb = mStockTypeBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setStockTypeId_Equal(mStockType.getStockTypeId());

		int count = mStockTypeBhv.selectCount(cb);
		if (count > 0) {
			return true;
		}
		return false;
	}

	/**
	 * <h2>処理区分マスタに登録済チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に処理区分マスタのデータを検索し、
	 * 検索件数が0件以外の場合、削除不可エラーをエラー情報として管理する。
	 * </pre>
	 * @param mStockType 在庫区分マスタ：在庫区分ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:在庫区分CD重複)
	 */
	public boolean checkProcessTypeExist(MStockType mStockType, ErrorStatus errSts) {
		List<MProcessType> result = null;
		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.setupSelect_MStockType();
		cb.query().setStockTypeId_Equal(mStockType.getStockTypeId());
		result = mProcessTypeBhv.selectList(cb);
		if (result.size() != 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.STOCK_TYPE_CODE_CANNOT_DELETE_IN_PROCESS_TYPE_MASTER_ERROR);
			return false;
		}
		return true;
	}

	/**
	 * <h2>在庫区分マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に在庫区分マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param mStockType 在庫区分マスタ：在庫区分ID
	 * @return MStockType 在庫区分マスタ
	 */
	public MStockType getPkEntityWithDeletedCheck(MStockType mStockType) {
		if (mStockType.getStockTypeId() == null) {
			return null;
		}
		return mStockTypeBhv.selectByPKValueWithDeletedCheck(mStockType.getStockTypeId());
	}

	/**
	 * <h2>在庫区分マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に在庫区分マスタデータを取得する。
	 * </pre>
	 * @param mStockType 在庫区分マスタ：在庫区分CD
	 * @return MStockType 在庫区分マスタ
	 */
	public MStockType getUkEntity(MStockType mStockType) {
		MStockTypeCB cb = mStockTypeBhv.newMyConditionBean();
//		if (mStockType.getClientId() == null) {
//			return null;
//		}
//		cb.query().setClientId_Equal(mStockType.getClientId());
		if (CU.isNullOrEmpty(mStockType.getStockTypeCd())) {
			return null;
		}
		cb.query().setStockTypeCd_Equal(mStockType.getStockTypeCd());
		return mStockTypeBhv.selectEntityWithDeletedCheck(cb);
	}
	/**
	 * <h2>在庫区分マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に在庫区分マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 在庫区分マスタ：在庫区分CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MStockType 在庫区分マスタ
	 */
	public MStockType getUkEntity(MStockType entity, ErrorStatus errSts) {
		MStockType resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "stockTypeNotFoundError");
		}
		return resultEntity;
	}
	/**
	 * <h2>在庫区分マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に在庫区分マスタデータを取得する。
	 * </pre>
	 * @param entity 在庫区分マスタ：在庫区分CD
	 * @return MStockType 在庫区分マスタ
	 */
	public MStockType getUkEntityWithDeletedCheck(MStockType entity) {

//		if (entity.getClientId() == null) {
//			return null;
//		}
		if (CU.isNullOrEmpty(entity.getStockTypeCd())) {
			return null;
		}

		MStockTypeCB cb = mStockTypeBhv.newMyConditionBean();
//		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setStockTypeCd_Equal(entity.getStockTypeCd());
		return mStockTypeBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>在庫区分マスタリストを取得する。</h2>
	 * <pre>
	 * 在庫区分マスタリストを取得する。
	 * </pre>
	 * @return List<MStockType> 在庫区分マスタリスト
	 */
	public List<MStockType> getEntityList() {
		MStockTypeCB cb = mStockTypeBhv.newMyConditionBean();
		return mStockTypeBhv.selectList(cb);
	}

	/**
	 * <h2>在庫区分マスタマップを選択する。</h2>
	 * <pre>
	 * 在庫区分マスタマップのデータを取得する。
	 * </pre>
	 * @return Map<String, String> 在庫区分マスタマップ
	 */
	public Map<String, String> getStockTypeMap() {

		MStockTypeCB cb = mStockTypeBhv.newMyConditionBean();

		ListResultBean<MStockType>  mStockTypeList = mStockTypeBhv.selectList(cb);

		Map<String, String> retMap = new HashMap<String, String>();

		for (MStockType o : mStockTypeList) {
			retMap.put(o.getStockTypeCd(), String.valueOf(o.getStockTypeId()));
		}

		return retMap;
	}
}