package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.MZoneCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ゾーンマスタ共通ロジッククラス
 */
public class ZoneLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MZoneBhv mZoneBhv;
	@Inject
	private MLocationBhv mLocationBhv;

	/**
	 * <h2>登録時ゾーンCD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・ゾーンCD重複チェック
	 * </pre>
	 * @param mZone ゾーンマスタ：ゾーンCD・倉庫ID
	 * @return boolean (true:ゾーンCD重複)
	 */
	public boolean checkZoneCdInsert(MZone mZone) {
		boolean result = false;
		result = checkZoneCdInsert(mZone, null);
		return result;
	}

	/**
	 * <h2>登録時ゾーンCD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にゾーンマスタのデータを検索し、
	 * 検索件数が1件以上の場合、既に登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mZone ゾーンマスタ：ゾーンCD・倉庫ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:ゾーンCD重複)
	 */
	public boolean checkZoneCdInsert(MZone mZone, ErrorStatus errSts) {

		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);
		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End

		MZoneCB cb = mZoneBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setZoneCd_Equal(mZone.getZoneCd());
		cb.query().setWarehouseId_Equal(mZone.getWarehouseId());

		int count = mZoneBhv.selectCount(cb);

		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);
		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End

		if (count > 0) {
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
			//this.getErrorManager().add(errSts, WmsMessageConst.ZONE_CODE_DUPLICATE_ERROR);
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時ゾーンCD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・ゾーンCD重複チェック
	 * </pre>
	 * @param mZone ゾーンマスタ：ゾーンCD・ゾーンID
	 * @return boolean (true:ゾーンCD重複)
	 */
	public boolean checkZoneCdUpdate(MZone mZone) {
		boolean result = false;
		result = checkZoneCdUpdate(mZone, null);
		return result;
	}

	/**
	 * <h2>更新時ゾーンCD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にゾーンマスタのデータを検索し、
	 * 引数と取得結果のゾーンIDが異なる場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mZone ゾーンマスタ：ゾーンCD・ゾーンID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:ゾーンCD重複)
	 */
	public boolean checkZoneCdUpdate(MZone mZone, ErrorStatus errSts) {
		MZoneCB cb = mZoneBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setZoneCd_Equal(mZone.getZoneCd());
		MZone Zone = mZoneBhv.selectEntity(cb);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (Zone != null &&
				!CU.isNotNullAndEquals(mZone.getZoneId(), Zone.getZoneId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End

			this.getErrorManager().add(errSts, WmsMessageConst.ZONE_CODE_DUPLICATE_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>ロケーションマスタに登録済チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にゾーンマスタのデータを検索し、
	 * 検索件数が0件以外の場合、登録済削除不可エラーをエラー情報として管理する。
	 * </pre>
	 * @param mZone ゾーンマスタ：ゾーンID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:ゾーンID重複)
	 */
	public boolean checkLocationExist(MZone mZone, ErrorStatus errSts) {
		List<MLocation> result = null;
		MLocationCB cb = mLocationBhv.newMyConditionBean();
		cb.setupSelect_MZone();
		cb.query().setZoneId_Equal(mZone.getZoneId());
		result = mLocationBhv.selectList(cb);
		if (result.size() != 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.ZONE_CODE_CANNOT_DELETE_IN_LOCATION_MASTER_ERROR);
			return false;
		}
		return true;
	}
	/**
	 * <h2>ゾーンID存在チェック処理を行う。</h2>
	 * <pre>
	 * 引数をキーにゾーンマスタの存在チェックを行う。
	 * 検索結果が1件以上の場合、trueを返す。
	 * </pre>
	 * @param mZone ゾーンマスタ：ゾーンID
	 * @return boolean (true:ゾーンID存在)
	 */
	public boolean checkZoneId(MZone mZone) {
		MZoneCB cb = mZoneBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setZoneId_Equal(mZone.getZoneId());

		int count = mZoneBhv.selectCount(cb);
		if (count > 0) {
			return true;
		}
		return false;
	}

	/**
	 * <h2>ゾーンマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にゾーンマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param mZone ゾーンマスタ：ゾーンID
	 * @return MZone ゾーンマスタ
	 */
	public MZone getPkEntity(MZone mZone) {
		if (mZone.getZoneId() == null) {
			return null;
		}
		return mZoneBhv.selectByPKValueWithDeletedCheck(mZone.getZoneId());
	}

	/**
	 * <h2>ゾーンマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にゾーンマスタデータを取得する。
	 * </pre>
	 * @param mZone ゾーンマスタ：倉庫ID・ゾーンCD
	 * @return MZone ゾーンマスタ
	 */
	public MZone getUkEntity(MZone mZone) {
		MZoneCB cb = mZoneBhv.newMyConditionBean();
		//if (mZone.getWarehouseId() == null) {
		//	return null;
		//}
		cb.query().setWarehouseId_Equal(mZone.getWarehouseId());
		if (CU.isNullOrEmpty(mZone.getZoneCd())) {
			return null;
		}
		cb.query().setZoneCd_Equal(mZone.getZoneCd());
		return mZoneBhv.selectEntityWithDeletedCheck(cb);
	}
	/**
	 * <h2>ゾーンマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にゾーンマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param mZone ゾーンマスタ：倉庫ID・ゾーンCD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MZone ゾーンマスタ
	 */
	public MZone getUkEntity(MZone mZone, ErrorStatus errSts) {
		MZone resultEntity = null;
		try {
		MZoneCB cb = mZoneBhv.newMyConditionBean();
		//if (mZone.getWarehouseId() == null) {
		//	return null;
		//}
		cb.query().setWarehouseId_Equal(mZone.getWarehouseId());
		if (CU.isNullOrEmpty(mZone.getZoneCd())) {
			return null;
		}
		cb.query().setZoneCd_Equal(mZone.getZoneCd());
		resultEntity = mZoneBhv.selectEntityWithDeletedCheck(cb);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.WAREHOUSE_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

}