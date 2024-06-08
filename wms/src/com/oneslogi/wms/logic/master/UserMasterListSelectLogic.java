package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.BUserCB;
import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.cbean.MUserCenterCB;
import com.oneslogi.base.dbflute.cbean.MUserClientCB;
import com.oneslogi.base.dbflute.exbhv.BUserBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;
import com.oneslogi.base.resources.AuthenticationBaseResource;

/**
 * ユーザマスタ一覧検索機能に対するロジッククラス。
 */
public class UserMasterListSelectLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private BUserBhv bUserBhv;
	@Inject
	private MCenterBhv mCenterBhv;
	@Inject
	private MClientBhv mClientBhv;

	/**
	 * <h2>一覧データ取得</h2>
	 * <pre>
	 * ユーザマスタ情報を取得する
	 * 以下のチェックを行う
	 * ・取得データが0件チェック
	 *
	 * 戻り値には次のテーブルが結合された結果が設定される。
	 *
	 * 【データ取得テーブル】
	 * ・ユーザマスタ
	 * ・カルチャマスタ
	 * ・権限グループマスタ
	 * ・辞書マスタビュー
	 *
	 * 【パラメータの使用項目】
	 *  (ユーザマスタ)
	 *  ・ユーザCD
	 *  ・ユーザ名
	 *  ・カルチャID
	 *  ・権限グループID
	 * </pre>
	 * @param bUser ユーザマスタ
	 * @param paging ページ検索の設定
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return PagingResultBean<BUser> ユーザマスタデータのリスト
	 */
	public PagingResultBean<BUser> selectByConditions(final BUser bUser, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<BUser> result = null;

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		BUserCB cb = bUserBhv.newMyConditionBean();

		cb.setupSelect_BCulture().withVDict(getCultureId());
		cb.setupSelect_BRoleGrp().withVDict(getCultureId());
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());

		// ユーザCDの設定
		cb.query().setUserCd_PrefixSearch(bUser.getUserCd());

		// ユーザ名の設定
		cb.query().setUserNm_LikeSearch(bUser.getUserNm(),new LikeSearchOption().likeContain());

		// カルチャIDの設定
		cb.query().setCultureId_Equal(bUser.getCultureId());

		// 権限グループIDの設定
		cb.query().setRoleGrpId_Equal(bUser.getRoleGrpId());

		// 削除フラグの設定
		cb.query().setDelFlg_Equal(bUser.getDelFlg());

		if (getRoleGrpId() != AuthenticationBaseResource.systemAdminRoleGrpId) {
			cb.query().setRoleGrpId_NotEqual(AuthenticationBaseResource.systemAdminRoleGrpId);
		}

		// システム管理者権限(すべてチェック無しデータ考慮)
		if (bUser.getMUserCenterList().get(0).getMCenter().getCenterId() != null) {
			// ユーザ管理センタデータにセンタの設定
			cb.query().existsMUserCenterList(new SubQuery<MUserCenterCB>() {
				@Override
				public void query(MUserCenterCB subCB) {
					subCB.query().setCenterId_Equal(bUser.getMUserCenterList().get(0).getMCenter().getCenterId());
					subCB.query().setDelFlg_Equal_$0();
				}
			});
		}

		// システム管理者権限(すべてチェック無しデータ考慮)
		if (bUser.getMUserClientList().get(0).getMClient().getClientId() != null) {
			// ユーザ管理荷主データに荷主の設定
			cb.query().existsMUserClientList(new SubQuery<MUserClientCB>() {
				@Override
				public void query(MUserClientCB subCB) {
					subCB.query().setClientId_Equal(bUser.getMUserClientList().get(0).getMClient().getClientId());
					subCB.query().setDelFlg_Equal_$0();
				}
			});
		}

		// ソート順の設定
		cb.query().addOrderBy_UserCd_Asc();

		result = selectPage(bUserBhv, cb, paging);

		// データ存在チェック
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), BaseMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// リターンのユーザ明細一覧データリスト編集
		for (BUser user : result) {

			// カルチャ名の設定
			user.setCultureNm(user.chaseBCulture().chaseVDict().getDictNm());
			// 権限グループ名の設定
			user.setRoleGrpNm(user.chaseBRoleGrp().chaseVDict().getDictNm());
			// 削除フラグ名の設定
			user.setDelFlgNm(user.chaseBClassDtlByDelFlg().chaseVDict().getDictNm());
		}

		//削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return result;
	}

	/**
	 * <h2>センタマスタリストデータ取得</h2>
	 * <pre>
	 * データベースからセンタマスタデータを取得する
	 * チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する
	 * ・取得データが0件チェック
	 *
	 * 戻り値には次のテーブル取得結果が設定される。
	 *
	 * 【データ取得テーブル】
	 * ・センタマスタ
	 *
	 * </pre>
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return List<MCenter> センタマスタリスト
	 */
	public List<MCenter> selectMCenterList(ErrorStatus errSts) {

		List<MCenter> result = null;

		MCenterCB cb = mCenterBhv.newMyConditionBean();
		cb.query().addOrderBy_CenterCd_Asc();

		result = mCenterBhv.selectList(cb);

		// データ存在チェック
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), BaseMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

	/**
	 * <h2>荷主マスタリストデータ取得</h2>
	 * <pre>
	 * データベースから荷主マスタデータを取得する
	 * チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する
	 * ・取得データが0件チェック
	 *
	 * 戻り値には次のテーブル取得結果が設定される。
	 *
	 * 【データ取得テーブル】
	 * ・荷主マスタ
	 *
	 * </pre>
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return List<MCenter> センタマスタリスト
	 */
	public List<MClient> selectMClientList(ErrorStatus errSts) {

		List<MClient> result = null;

		MClientCB cb = mClientBhv.newMyConditionBean();
		cb.query().addOrderBy_ClientCd_Asc();

		result = mClientBhv.selectList(cb);

		// データ存在チェック
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), BaseMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

	/**
	 * <h2>編集データ取得</h2>
	 * <pre>
	 * 引数のヘッダIDを条件にデータベースからユーザマスタデータを取得する
	 * チェックがエラーの場合は対応するメッセージと引数のエラーステータスをエラー管理クラスに登録する
	 * ・取得データが0件チェック
	 *
	 * 戻り値には次のテーブルが結合された結果が設定される。
	 *
	 * 【データ取得テーブル】
	 * ・ユーザマスタ
	 * ・カルチャマスタ
	 * ・権限グループマスタ
	 *
	 * 【パラメータの使用項目】
	 *  (ユーザマスタ)
	 *  ・ユーザID
	 * </pre>
	 * @param bUser ユーザマスタ
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return List<BUser> ユーザマスタリスト
	 */
	public BUser selectById(BUser bUser, ErrorStatus errSts) {

		BUser result = null;

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		BUserCB cb = bUserBhv.newMyConditionBean();

		// カルチャマスタ
		cb.setupSelect_BCulture();

		// 権限グループマスタ
		cb.setupSelect_BRoleGrp();

		// ユーザIDの設定
		cb.query().setUserId_Equal(bUser.getUserId());

		// ソート順の設定
		cb.query().addOrderBy_UserCd_Asc();

		result = bUserBhv.selectEntity(cb);

		//削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// データ存在チェック
		if (result == null) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), BaseMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

}
