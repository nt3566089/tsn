package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ロケーションマスタ共通ロジッククラス
 */
public class LocationLogic extends AbstractWmsLogic {

	@Inject
	private MLocationBhv mLocationBhv;
	@Inject
	private CenterLogic centerLogic;
	/**
	 * <h2>登録時ロケーションマスタ重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・ロケーションCD重複チェック
	 * </pre>
	 * @param mLocation ロケーションマスタ：センタID・ロケーションCD
	 * @return boolean (true:ロケーションマスタ重複)
	 */
	public boolean checkLocationCdInsert(MLocation mLocation) {
		boolean result = false;
		result = checkLocationCdInsert(mLocation, null);
		return result;
	}

	/**
	 * <h2>登録時ロケーションCD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にロケーションマスタのデータを検索し、
	 * 検索件数が1件以上の場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mLocation ロケーションマスタ：センタID・ロケーションCD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:ロケーションCD重複)
	 */
	public boolean checkLocationCdInsert(MLocation mLocation, ErrorStatus errSts) {

		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);
		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End

		MLocationCB cb = mLocationBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(mLocation.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		mLocation.setCenterId(mCenter.getCenterId());
		cb.query().setCenterId_Equal(mLocation.getCenterId());
		cb.query().setLocationCd_Equal(mLocation.getLocationCd());

		int count = mLocationBhv.selectCount(cb);

		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);
		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End

		if (count > 0) {
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.18 SJA Start
			//this.getErrorManager().add(errSts, "locationCodeDuplicateError");
			this.getErrorManager().add(errSts, "alreadyRegisteredCannotRegisterError");
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.18 SJA End
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時ロケーションマスタ重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・ロケーションCD重複チェック
	 * </pre>
	 * @param mLocation ロケーションマスタ：ロケーションCD・ロケーションID
	 * @return boolean (true:ロケーションマスタ重複)
	 */
	public boolean checkLocationCdUpdate(MLocation mLocation) {
		boolean result = false;
		result = checkLocationCdUpdate(mLocation, null);
		return result;
	}

	/**
	 * <h2>更新時ロケーションCD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にロケーションマスタのデータを検索し、
	 * 引数のロケーションIDと取得するロケーションIDが違う場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mLocation ロケーションマスタ：ロケーションCD・ロケーションID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:ロケーションCD重複)
	 */
	public boolean checkLocationCdUpdate(MLocation mLocation, ErrorStatus errSts) {
		MLocationCB cb = mLocationBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setLocationCd_Equal(mLocation.getLocationCd());
		MLocation location = mLocationBhv.selectEntity(cb);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (location != null &&
				!CU.isNotNullAndEquals(location.getLocationId(), mLocation.getLocationId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End

			this.getErrorManager().add(errSts, "locationCdDuplicateError");
			return true;
		}
		return false;
	}

	/**
	 * <h2>登録時ロケーション名称重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・ロケーション名称重複チェック
	 * </pre>
	 * @param mLocation ロケーションマスタ：ロケーション名称・ロケーションCD
	 * @return boolean (true:ロケーションマスタ重複)
	 */
	public boolean checkLocationNmInsert(MLocation mLocation) {
		boolean result = false;
		result = checkLocationNmInsert(mLocation, null);
		return result;
	}

	/**
	 * <h2>登録時ロケーション名称重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にロケーションマスタのデータを検索し、
	 * 検索件数が1件以上の場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mLocation ロケーションマスタ：ロケーション名称・ロケーションCD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:ロケーションマスタ重複)
	 */
	public boolean checkLocationNmInsert(MLocation mLocation, ErrorStatus errSts) {
		MLocationCB cb = mLocationBhv.newMyConditionBean();
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		cb.checkInvalidQuery();
		cb.query().setLocationNm_Equal(mLocation.getLocationNm());
		cb.query().setLocationCd_NotEqual(mLocation.getLocationCd());

		int count = mLocationBhv.selectCount(cb);
		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		if (count > 0) {
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.18 SJA Start
			//this.getErrorManager().add(errSts, "locationNameDuplicateError");
			this.getErrorManager().add(errSts, "alreadyRegisteredCannotRegisterError");
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.18 SJA End
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時ロケーション名称重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・ロケーション名称重複チェック
	 * </pre>
	 * @param mLocation ロケーションマスタ：ロケーション名称・ロケーションCD
	 * @return boolean (true:ロケーションマスタ重複)
	 */
	public boolean checkLocationNmUpdate(MLocation mLocation) {
		boolean result = false;
		result = checkLocationNmUpdate(mLocation, null);
		return result;
	}

	/**
	 * <h2>更新時ロケーション名称重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にロケーションマスタのデータを検索し、
	 * 引数と取得結果のロケーションIDが異なる場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mLocation ロケーションマスタ：ロケーション名称・ロケーションCD・ロケーションID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:ロケーションマスタ重複)
	 */
	public boolean checkLocationNmUpdate(MLocation mLocation, ErrorStatus errSts) {
		MLocationCB cb = mLocationBhv.newMyConditionBean();

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		cb.checkInvalidQuery();
		cb.query().setLocationNm_Equal(mLocation.getLocationNm());
		cb.query().setLocationCd_NotEqual(mLocation.getLocationCd());
		MLocation location = mLocationBhv.selectEntity(cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (location != null &&
				!CU.isNotNullAndEquals(location.getLocationId(), mLocation.getLocationId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End
			this.getErrorManager().add(errSts, "locationNmDuplicateError");
			return true;
		}
		return false;
	}

	/**
	 * <h2>ロケーションマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にロケーションマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity ロケーションマスタ：ロケーションID
	 * @return MLocation ロケーションマスタ
	 */
	public MLocation getPkEntityWithDeletedCheck(MLocation entity) {
		if (entity.getLocationId() == null) {
			return null;
		}
		return mLocationBhv.selectByPKValueWithDeletedCheck(entity.getLocationId());
	}

	/**
	 * <h2>ロケーションマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にロケーションマスタデータを取得する。
	 * </pre>
	 * @param entity ロケーションマスタ：ロケーションID
	 * @return MLocation ロケーションマスタ
	 */
	public MLocation getPkEntity(MLocation entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * <h2>ロケーションマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にロケーションマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity ロケーションマスタ：ロケーションID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MLocation ロケーションマスタ
	 */
	public MLocation getPkEntity(MLocation entity, ErrorStatus errSts) {
		MLocation resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "locationNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>ロケーションマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にロケーションマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity ロケーションマスタ：センタID・ロケーションCD
	 * @return MLocation ロケーションマスタ
	 */
	public MLocation getUkEntityWithDeletedCheck(MLocation entity) {
		if (entity.getCenterId() == null) {
			return null;
		}
		if (CU.isNullOrEmpty(entity.getLocationCd())) {
			return null;
		}

		MLocationCB cb = mLocationBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(entity.getCenterId());
		cb.query().setLocationCd_Equal(entity.getLocationCd());

		return mLocationBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>ロケーションマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にロケーションマスタデータを取得する。
	 * </pre>
	 * @param entity ロケーションマスタ：センタID・ロケーションCD
	 * @return MLocation ロケーションマスタ
	 */
	public MLocation getUkEntity(MLocation entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>ロケーションマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にロケーションマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity ロケーションマスタ：センタID・ロケーションCD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MLocation ロケーションマスタ
	 */
	public MLocation getUkEntity(MLocation entity, ErrorStatus errSts) {
		MLocation resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "locationNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>ユニークキーを条件に倉庫マスタと結合し、ロケーションマスタのデータを取得する。</h2>
	 * <pre>
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity ロケーションマスタ：センタID・ロケーションCD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MLocation ロケーションマスタ
	 */
	public MLocation getUkEntityWithWarehouse(MLocation entity, ErrorStatus errSts) {
		MLocation resultEntity = null;
		try {

			if (entity.getCenterId() == null) {
				return null;
			}
			if (CU.isNullOrEmpty(entity.getLocationCd())) {
				return null;
			}

			MLocationCB cb = mLocationBhv.newMyConditionBean();
			cb.setupSelect_MZone().withMWarehouse();
			cb.query().setCenterId_Equal(entity.getCenterId());
			cb.query().setLocationCd_Equal(entity.getLocationCd());

			resultEntity = mLocationBhv.selectEntityWithDeletedCheck(cb);

		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "locationNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>倉庫マスタを結合したエンティティを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に倉庫マスタを結合したエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity ロケーションマスタ：ロケーションID
	 * @return MLocation ロケーションマスタ
	 */
	public MLocation getPkEntityWithWarehouseAndDeletedCheck(MLocation entity) {

		if (entity.getLocationId() == null) {
			return null;
		}

		MLocationCB cb = mLocationBhv.newMyConditionBean();
		cb.setupSelect_MZone().withMWarehouse();
		cb.query().setLocationId_Equal(entity.getLocationId());

		return mLocationBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>最小ロケーション取得処理を行う。</h2>
	 * <pre>
	 * 引数をキーに最小ロケーションを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param mLocation ロケーションマスタ：ロケーション(From)
	 * @return MLocation ロケーションマスタ
	 */
	public MLocation getMinLocationCd(MLocation mLocation) {
		String locationCdFrom = mLocation.getLocationCdFrom();

		if (CU.isNullOrEmpty(locationCdFrom)) {
			return null;
		}

		/*ロケーションFROMの後ろに0000を追加するのを削除する 20140918 BY 黄 START
		for (int i = locationCdFrom.length(); i < 10; i++) {
			locationCdFrom = locationCdFrom + "0";
		}ロケーションFROMの後ろに0000を追加するのを削除する 20140918 BY 黄 END*/

		mLocation.setLocationCdFrom(locationCdFrom);
		return mLocation;
	}

	/**
	 * <h2>最大ロケーション取得処理を行う。</h2>
	 * <pre>
	 * 引数をキーに最大ロケーションを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param mLocation ロケーションマスタ：ロケーション(To)
	 * @return MLocation ロケーションマスタ
	 */
	public MLocation getMaxLocationCd(MLocation mLocation) {
		String locationCdTo = mLocation.getLocationCdTo();

		if (CU.isNullOrEmpty(locationCdTo)) {
			return null;
		}

		for (int i = locationCdTo.length(); i < 10; i++) {
			locationCdTo = locationCdTo + "Z";
		}

		mLocation.setLocationCdTo(locationCdTo);
		return mLocation;
	}

	// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
	/**
	 * <h2>ユニークキーを条件に倉庫マスタを結合したエンティティを返す。</h2>
	 * <pre>
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param mLocation ロケーションマスタ：センタID・ロケーションCD
	 * @param mWarehouse 倉庫マスタ：倉庫CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MLocation ロケーションマスタ
	 */
	public MLocation getUkEntityWithWarehouseCd(MLocation mLocation, MWarehouse mWarehouse, ErrorStatus errSts) {
		MLocation resultEntity = null;
		try {

			if (mLocation.getCenterId() == null) {
				return null;
			}
			if (CU.isNullOrEmpty(mLocation.getLocationCd())) {
				return null;
			}

			MLocationCB cb = mLocationBhv.newMyConditionBean();
			cb.setupSelect_MZone().withMWarehouse();
			cb.query().setCenterId_Equal(mLocation.getCenterId());
			cb.query().setLocationCd_Equal(mLocation.getLocationCd());
			if(mWarehouse != null) {
				cb.query().queryMZone().queryMWarehouse().setWarehouseCd_Equal(mWarehouse.getWarehouseCd());
			}
			resultEntity = mLocationBhv.selectEntityWithDeletedCheck(cb);

		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "locationNotFoundError");
		}
		return resultEntity;
	}
	// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End


	/**
	 * <h2>ロケーションマスタリストを取得する。</h2>
	 * <pre>
	 * 引数をキーにロケーションマスタリストを取得する。
	 * </pre>
	 * @param cb ロケーションマスタ：全項目
	 * @return ListResultBean<MLocation> ロケーションマスタリスト
	 */
	public ListResultBean<MLocation> getUkEntityList(MLocationCB cb){
		return mLocationBhv.selectList(cb);
	}
}
