package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.cbean.MShapeGrpCB;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷主マスタ共通ロジッククラス
 */
public class ClientLogic extends AbstractWmsLogic {

	@Inject
	private MClientBhv mClientBhv;
	@Inject
	private MShapeGrpBhv mShapeGrpBhv;

	/**
	 * <h2>荷主マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主マスタ：荷主ID
	 * @return MClient 荷主マスタ
	 */
	public MClient getPkEntityWithDeletedCheck(MClient entity) {
		if (entity.getClientId() == null) {
			return null;
		}
		return mClientBhv.selectByPKValueWithDeletedCheck(entity.getClientId());
	}

	/**
	 * <h2>荷主マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主マスタデータを取得する。
	 * </pre>
	 * @param entity 荷主マスタ：荷主ID
	 * @return MClient 荷主マスタ
	 */
	public MClient getPkEntity(MClient entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * <h2>荷主マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷主マスタ：荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClient 荷主マスタ
	 */
	public MClient getPkEntity(MClient entity, ErrorStatus errSts) {
		MClient resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>荷主マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主マスタ：荷主CD
	 * @return MClient 荷主マスタ
	 */
	public MClient getUkEntityWithDeletedCheck(MClient entity) {

		if (CU.isNullOrEmpty(entity.getClientCd())) {
			return null;
		}

		MClientCB cb = mClientBhv.newMyConditionBean();
		cb.query().setClientCd_Equal(entity.getClientCd());
		return mClientBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>荷主マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主マスタデータを取得する。
	 * </pre>
	 * @param entity 荷主マスタ：荷主CD
	 * @return MClient 荷主マスタ
	 */
	public MClient getUkEntity(MClient entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>荷主マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷主マスタ：荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClient 荷主マスタ
	 */
	public MClient getUkEntity(MClient entity, ErrorStatus errSts) {
		MClient resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>登録時荷主マスタ重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・荷主CD重複チェック
	 * </pre>
	 * @param mClient 荷主マスタ：荷主CD
	 * @return boolean (true:荷主マスタ重複)
	 */
	public boolean checkClientCdInsert(MClient mClient) {
		boolean result = false;
		result = checkClientCdInsert(mClient, null);
		return result;
	}

	/**
	 * <h2>登録時荷主CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に荷主マスタデータを取得する。
	 * 検索件数が1件以上の場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mClient 荷主マスタ：荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:荷主CD重複)
	 */
	public boolean checkClientCdInsert(MClient mClient, ErrorStatus errSts) {

		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);
		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End

		MClientCB cb = mClientBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setClientCd_Equal(mClient.getClientCd());

		int count = mClientBhv.selectCount(cb);

		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);
		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End

		if (count > 0) {
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.18 SJA Start
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.18 SJA End
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時荷主マスタ重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・荷主CD重複チェック
	 * </pre>
	 * @param mClient 荷主マスタ：荷主CD・荷主ID
	 * @return boolean (true:荷主マスタ重複)
	 */
	public boolean checkClientCdUpdate(MClient mClient) {
		boolean result = false;
		result = checkClientCdUpdate(mClient, null);
		return result;
	}

	/**
	 * <h2>更新時荷主CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数をキーに荷主マスタのデータを検索する。
	 * 引数と取得結果の荷主IDが異なる場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mClient 荷主マスタ：荷主CD・荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:荷主CD重複)
	 */
	public boolean checkClientCdUpdate(MClient mClient, ErrorStatus errSts) {
		MClientCB cb = mClientBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setClientCd_Equal(mClient.getClientCd());
		MClient client = mClientBhv.selectEntity(cb);

		// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
		if (client != null &&
				!CU.isNotNullAndEquals(mClient.getClientId(), client.getClientId())) {
			// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End

			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.18 SJA Start
			//this.getErrorManager().add(errSts, "clientCodeDuplicateError");
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.18 SJA End
			return true;
		}
		return false;
	}

	// [Ver3.0] unit of measure対応 2017.11.27 NING Start
	/**
	 * <h2>在庫管理単位は未選択であるかをチェック処理を行う。</h2>
	 * <pre>
	 * 荷主の荷姿グループが登録済の場合、在庫管理単位は未選択であるかをチェックする。
	 * </pre>
	 * @param mClient 荷主マスタ：荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:在庫管理単位は未選択)
	 */
	public boolean checkClientShapeGrpIdNoInput(MClient mClient, ErrorStatus errSts) {

		// [Ver3.0][#3928] 削除フラグ自動検索無効化処理の追加 2018.03.06 shimizu Start

		// ※ 荷主マスタメンテナンスで使用するため、荷主の削除フラグは"1"でも"0"でも在庫管理単位を取得したい
		//  (自動で「削除フラグ = "0"」 をつけてしまうと削除した荷主の在庫管理単位が取得されなくなってしまう問題あり)
		//  自動削除フラグ条件付加を無効にして、必要なマスタに「削除フラグ = "0"」を条件追加する方法をとる

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MShapeGrpCB cb = mShapeGrpBhv.newConditionBean();
		cb.query().queryMClient().setClientCd_Equal(mClient.getClientCd());
		// [#4627] チェック不正を修正 2018.05.21 kawana Start
		// setBehaviorAutoDelFlgの上に書いた理由により「削除フラグ = "0"」を追加する
		cb.query().setDelFlg_Equal_$0();
		// [#4627] チェック不正を修正 2018.05.21 kawana End

		int count = mShapeGrpBhv.selectCount(cb);

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(true);
		// [Ver3.0][#3928] 削除フラグ自動検索無効化処理の追加 2018.03.06 shimizu End

		// 在庫管理単位が未選択であるか判定
		if (count > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_DEFAULT_SHAPE_GRP_ID_NOT_INPUT_ERROR);
			return true;
		}
		return false;
	}

	/**
	 * <h2>選択の荷姿グループが存在するかどうかをチェック処理を行う。</h2>
	 * <pre>
	 * 荷姿グループが選択された場合、選択の荷姿グループが存在するかどうかをチェックする。
	 * </pre>
	 * @param mClient 荷主マスタ：荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:選択中の荷姿グループは既に削除)
	 */
	public boolean checkClientShapeGrpAlreadyDel(MClient mClient, ErrorStatus errSts) {

		// [Ver3.0][#3928] 削除フラグ自動検索無効化処理の追加 2018.03.06 shimizu Start

		// ※ 荷主マスタメンテナンスで使用するため、荷主の削除フラグは"1"でも"0"でも在庫管理単位を取得したい
		//  (自動で「削除フラグ = "0"」 をつけてしまうと削除した荷主の在庫管理単位が取得されなくなってしまう問題あり)
		//  自動削除フラグ条件付加を無効にして、必要なマスタに「削除フラグ = "0"」を条件追加する方法をとる

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MShapeGrpCB cb = mShapeGrpBhv.newConditionBean();
		cb.query().setShapeGrpCd_Equal(mClient.getMShapeGrp().getShapeGrpCd());
		cb.query().queryMClient().setClientCd_Equal(mClient.getClientCd());
		// [#4627] チェック不正を修正 2018.05.21 kawana Start
		// setBehaviorAutoDelFlgの上に書いた理由により「削除フラグ = "0"」を追加する
		cb.query().setDelFlg_Equal_$0();
		// [#4627] チェック不正を修正 2018.05.21 kawana End

		int count = mShapeGrpBhv.selectCount(cb);

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(true);
		// [Ver3.0][#3928] 削除フラグ自動検索無効化処理の追加 2018.03.06 shimizu End

		if (count <= 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.SHAPE_GROUP_ALREADY_DELETED_CANNOT_SELECT);
			return true;
		}
		return false;
	}
	// [Ver3.0] unit of measure対応 2017.11.27 NING End
	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	/**
	 * <h2>荷主マスタ．荷姿グループIDと紐づく荷姿グループマスタを取得する。</h2>
	 * <pre>
	 * 荷主マスタ．荷姿グループIDと紐づく荷姿グループマスタを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷主マスタ：荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClient 荷主マスタ
	 */
	public MClient getEntityWithShapeGrp(MClient mClient, ErrorStatus errSts) {
		MClient resultEntity = null;
		try {
			MClientCB cb = mClientBhv.newMyConditionBean();
			cb.setupSelect_MShapeGrp();
			cb.query().queryMShapeGrp().innerJoin();
			cb.query().setClientCd_Equal(mClient.getClientCd());
			resultEntity = mClientBhv.selectEntity(cb);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}
	// [Ver3.0] unit of measure対応 2017.12.04 NING End
}
