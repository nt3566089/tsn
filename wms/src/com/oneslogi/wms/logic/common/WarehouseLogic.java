package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MWarehouseCB;
import com.oneslogi.base.dbflute.cbean.MZoneCB;
import com.oneslogi.base.dbflute.exbhv.MWarehouseBhv;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 倉庫マスタ共通ロジッククラス
 */
public class WarehouseLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MWarehouseBhv mWarehouseBhv;
	@Inject
	private MZoneBhv mZoneBhv;

	/**
	 * <h2>登録時倉庫CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・倉庫CD重複チェック
	 * </pre>
	 * @param mWarehouse 倉庫マスタ：倉庫CD・センタID
	 * @return boolean (true:倉庫CD重複)
	 */
	public boolean checkWarehouseCdInsert(MWarehouse mWarehouse) {
		boolean result = false;
		result = checkWarehouseCdInsert(mWarehouse, null);
		return result;
	}

	/**
	 * <h2>登録時倉庫CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に倉庫マスタのデータを検索し、
	 * 検索結果が1件以上の場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mWarehouse 倉庫マスタ：倉庫CD・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:倉庫CD重複)
	 */
	public boolean checkWarehouseCdInsert(MWarehouse mWarehouse, ErrorStatus errSts) {

		// [新WMS-110-007] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);
		// [新WMS-110-007] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End

		MWarehouseCB cb = mWarehouseBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setWarehouseCd_Equal(mWarehouse.getWarehouseCd());
		cb.query().setCenterId_Equal(mWarehouse.getCenterId());

		int count = mWarehouseBhv.selectCount(cb);

		// [新WMS-110-007] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);
		// [新WMS-110-007] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End

		if (count > 0) {
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
			//this.getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_CODE_DUPLICATE_ERROR);
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時倉庫CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・倉庫CD重複チェック
	 * </pre>
	 * @param mWarehouse 倉庫マスタ：倉庫CD・センタID
	 * @return boolean (true:倉庫CD重複)
	 */
	public boolean checkWarehouseCdUpdate(MWarehouse mWarehouse) {
		boolean result = false;
		result = checkWarehouseCdUpdate(mWarehouse, null);
		return result;
	}

	/**
	 * <h2>更新時倉庫CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に倉庫マスタのデータを検索し、
	 * 引数と取得結果の倉庫IDが異なる場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mWarehouse 倉庫マスタ：倉庫CD・センタID・倉庫ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:倉庫CD重複)
	 */
	public boolean checkWarehouseCdUpdate(MWarehouse mWarehouse, ErrorStatus errSts) {
		MWarehouseCB cb = mWarehouseBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setWarehouseCd_Equal(mWarehouse.getWarehouseCd());
		cb.query().setCenterId_Equal(mWarehouse.getCenterId());
		MWarehouse warehouse = mWarehouseBhv.selectEntity(cb);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (warehouse != null &&
				!CU.isNotNullAndEquals(mWarehouse.getWarehouseId(), warehouse.getWarehouseId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End

			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
			//this.getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_CODE_DUPLICATE_ERROR);
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
			return true;
		}
		return false;
	}

	// [SK2-071] 倉庫マスタ削除時、紐付くゾーンマスタが存在チェックを追加 2014.12.17 許 Start
	/**
	 * <h2>ゾーンマスタに登録済チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にゾーンマスタのデータを検索し、
	 * 検索結果が0件以外の場合、削除不可エラーをエラー情報として管理する。
	 * </pre>
	 * @param mWarehouse 倉庫マスタ：倉庫ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:ゾーンマスタに存在)
	 */
	public boolean checkZoneExist(MWarehouse mWarehouse, ErrorStatus errSts) {
		List<MZone> result = null;
		MZoneCB cb = mZoneBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setWarehouseId_Equal(mWarehouse.getWarehouseId());
		result = mZoneBhv.selectList(cb);
		if (result.size() != 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.WAREHOUSE_CODE_CANNOT_DELETE_IN_ZONE_MASTER_ERROR);
			return false;
		}
		return true;
	}
	// [SK2-071] 倉庫マスタ削除時、紐付くゾーンマスタが存在チェックを追加 2014.12.17 許 End

	/**
	 * <h2>倉庫マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に倉庫マスタデータを取得する。
	 * </pre>
	 * @param entity 倉庫マスタ：倉庫ID
	 * @return MWarehouse 倉庫マスタ
	 */
	public MWarehouse getPkEntity(MWarehouse entity) {
		return getPkEntity(entity, null);
	}

	/**
	 * <h2>倉庫マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に倉庫マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 倉庫マスタ：倉庫ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MWarehouse 倉庫マスタ
	 */
	public MWarehouse getPkEntity(MWarehouse entity, ErrorStatus errSts) {
		MWarehouse resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>倉庫マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に倉庫マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 倉庫マスタ：倉庫ID
	 * @return MWarehouse 倉庫マスタ
	 */
	public MWarehouse getPkEntityWithDeletedCheck(MWarehouse entity) {
		if (entity.getWarehouseId() == null) {
			return null;
		}
		return mWarehouseBhv.selectByPKValueWithDeletedCheck(entity.getWarehouseId());
	}

	/**
	 * <h2>倉庫マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に倉庫マスタデータを取得する。
	 * </pre>
	 * @param entity 倉庫マスタ：倉庫CD・センタID
	 * @return MWarehouse 倉庫マスタ
	 */
	public MWarehouse getUkEntity(MWarehouse entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>倉庫マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に倉庫マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 倉庫マスタ：倉庫CD・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MWarehouse 倉庫マスタ
	 */
	public MWarehouse getUkEntity(MWarehouse entity, ErrorStatus errSts) {
		MWarehouse resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>倉庫マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に倉庫マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 倉庫マスタ：倉庫CD・センタID
	 * @return MWarehouse 倉庫マスタ
	 */
	public MWarehouse getUkEntityWithDeletedCheck(MWarehouse entity) {
		if (CU.isNullOrEmpty(entity.getWarehouseCd())) {
			return null;
		}
		if (entity.getCenterId() == null) {
			return null;
		}
		MWarehouseCB cb = mWarehouseBhv.newMyConditionBean();
		cb.query().setWarehouseCd_Equal(entity.getWarehouseCd());
		cb.query().setCenterId_Equal(entity.getCenterId());
		return mWarehouseBhv.selectEntityWithDeletedCheck(cb);
	}
	/**
	 * <h2>倉庫マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に倉庫マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 倉庫マスタ：倉庫CD・センタID
	 * @return MWarehouse 倉庫マスタ
	 */
	public MWarehouse getUkEntityWithCheck(MWarehouse entity, ErrorStatus errSts) {

		MWarehouse resultEntity = null;
		if (entity.getCenterId() == null) {
			return null;
		}
		if (CU.isNullOrEmpty(entity.getWarehouseCd())) {
			return null;
		}
		try {

		MWarehouseCB cb = mWarehouseBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(entity.getCenterId());
		cb.query().setWarehouseCd_Equal(entity.getWarehouseCd());
		resultEntity =  mWarehouseBhv.selectEntityWithDeletedCheck(cb);
		}catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>倉庫マスタリストを取得する。</h2>
	 * <pre>
	 * 倉庫マスタリストを取得する。
	 * </pre>
	 * @param cb 倉庫マスタ：全項目
	 * @return List<MWarehouse> 倉庫マスタリスト
	 */
	public List<MWarehouse> getEntityList(MWarehouseCB cb){
		return mWarehouseBhv.selectList(cb);
	}
}