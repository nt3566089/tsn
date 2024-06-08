package com.oneslogi.wms.logic.common;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MUserCenterCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MUserCenterBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MUserCenter;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ユーザセンタ共通ロジッククラス
 */
public class UserCenterLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private MUserCenterBhv mUserCenterBhv;
	@Inject
	private MCenterBhv mCenterBhv;

	// ===== enum =====

	/** 削除データ検索区分 */
	public enum SelectCls {
		/** 全て検索 */
		ALL,
		/** 削除データのみ検索 */
		DELETE_ONLY,
		/** 未削除データのみ検索 */
		NO_DELETE_ONLY
	}

	/**
	 * <h2>センタマスタリストを取得する。</h2>
	 * <pre>
	 * ログインユーザに使用が許可されているセンタのリストを返却する。0
	 * </pre>
	 * @param SelectCls 削除データ検索区分
	 * @return List<MClient> 荷主マスタリスト
	 */
	// [#2432][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod Start
	public List<MCenter> getCenterList(SelectCls cls) {
	// [#2432][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod End

		List<MCenter> resultCenterList = new ArrayList<MCenter>();

		MUserCenterCB userCenterCB = mUserCenterBhv.newMyConditionBean();
		userCenterCB.setupSelect_MCenter();
		userCenterCB.checkInvalidQuery();
		userCenterCB.query().setUserId_Equal(getUserId());
		userCenterCB.query().setDelFlg_Equal_$0();
		userCenterCB.query().queryMCenter().setDelFlg_Equal_$0();
		// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana Start
		userCenterCB.query().queryMCenter().addOrderBy_CenterCd_Asc();
		// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana End
		List<MUserCenter> userCenterList = mUserCenterBhv.selectList(userCenterCB);
		if (userCenterList.size() < 1) {
			// 全許可 (1個も権限がない場合 = システム管理者)

			// センタマスタから全データ取得
			MCenterCB centerCB = mCenterBhv.newMyConditionBean();

			// [#2432][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod Start
			switch (cls) {
			case ALL:
			default:
				// 削除フラグの自動検索無効化
				this.setBehaviorAutoDelFlg(false);
				break;
			case DELETE_ONLY:
				centerCB.query().setDelFlg_Equal_$1();
				break;
			case NO_DELETE_ONLY:
				centerCB.query().setDelFlg_Equal_$0();
				break;
			}
			// [#2432][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod End

			// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana Start
			centerCB.query().addOrderBy_CenterCd_Asc();
			// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana End
			List<MCenter> centerList = mCenterBhv.selectList(centerCB);

			// [#2432][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod Start
			switch (cls) {
			case ALL:
			default:
				//削除フラグ自動検索有効化
				this.setBehaviorAutoDelFlg(true);
				break;
			case DELETE_ONLY:
			case NO_DELETE_ONLY:
				break;
			}
			// [#2432][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod End

			for (MCenter center : centerList) {
				resultCenterList.add(center);
			}
		} else {
			for (MUserCenter userCenter : userCenterList) {
				resultCenterList.add(userCenter.getMCenter());
			}
		}

		return resultCenterList;
	}

	//[Ver2.2.1][#2517] ログイン時用センタマスタリスト取得 2017.10.05 miyabe Start
	/**
	 * <h2>センタマスタリストを取得する。</h2>
	 * <pre>
	 * ログインユーザに使用が許可されているセンタのリストを返却する。
	 * </pre>
	 * @param userId ユーザID
	 * @param SelectCls 削除データ検索区分
	 * @return List<MClient> 荷主マスタリスト
	 */
	public List<MCenter> getCenterList(Long userId, SelectCls cls) {

		List<MCenter> resultCenterList = new ArrayList<MCenter>();

		MUserCenterCB userCenterCB = mUserCenterBhv.newMyConditionBean();
		userCenterCB.setupSelect_MCenter();
		userCenterCB.checkInvalidQuery();
		userCenterCB.query().setUserId_Equal(userId);
		userCenterCB.query().setDelFlg_Equal_$0();
		userCenterCB.query().queryMCenter().setDelFlg_Equal_$0();
		// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana Start
		userCenterCB.query().queryMCenter().addOrderBy_CenterCd_Asc();
		// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana End
		List<MUserCenter> userCenterList = mUserCenterBhv.selectList(userCenterCB);
		if (userCenterList.size() < 1) {
			// 全許可 (1個も権限がない場合 = システム管理者)

			// センタマスタから全データ取得
			MCenterCB centerCB = mCenterBhv.newMyConditionBean();

			// [#2432][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod Start
			switch (cls) {
			case ALL:
			default:
				// 削除フラグの自動検索無効化
				this.setBehaviorAutoDelFlg(false);
				break;
			case DELETE_ONLY:
				centerCB.query().setDelFlg_Equal_$1();
				break;
			case NO_DELETE_ONLY:
				centerCB.query().setDelFlg_Equal_$0();
				break;
			}
			// [#2432][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod End

			// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana Start
			centerCB.query().addOrderBy_CenterCd_Asc();
			// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana End
			List<MCenter> centerList = mCenterBhv.selectList(centerCB);

			// [#2432][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod Start
			switch (cls) {
			case ALL:
			default:
				//削除フラグ自動検索有効化
				this.setBehaviorAutoDelFlg(true);
				break;
			case DELETE_ONLY:
			case NO_DELETE_ONLY:
				break;
			}
			// [#2432][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod End

			for (MCenter center : centerList) {
				resultCenterList.add(center);
			}
		} else {
			for (MUserCenter userCenter : userCenterList) {
				resultCenterList.add(userCenter.getMCenter());
			}
		}

		return resultCenterList;
	}
	//[Ver2.2.1][#2517] ログイン時用センタマスタリスト取得 2017.10.05 miyabe End


	/**
	 * <h2>センタ権限チェック.</h2>
	 * <pre>
	 * ログインユーザにセンタの使用権限があるかのチェックを行う。
	 * ユーザに使用権限ない場合はエラーを登録する。
	 * </pre>
	 * @param centerCd センタCD
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkPermission(String centerCd, ErrorStatus errSts) {

		// [#2432][#2272][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod Start
		List<MCenter> centerList = getCenterList(UserCenterLogic.SelectCls.ALL);
		// [#2432][#2272][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod End

		for (MCenter center : centerList) {
			if (centerCd.equals(center.getCenterCd())) {
				// 権限有り (正常)

				return;
			}
		}

		// センタ使用権限なし
		getErrorManager().add(errSts, WmsMessageConst.CENTER_CANNOT_USE_NO_PERMISSION_ERROR);
		return;
	}

	/**
	 * <h2>センタ権限チェック.</h2>
	 * <pre>
	 * ログインユーザにセンタの使用権限があるかのチェックを行う。
	 * ユーザに使用権限ない場合はエラーを登録する。
	 * </pre>
	 * @param centerId センタID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkPermission(long centerId, ErrorStatus errSts) {

		// [#2432][#2272][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod Start
		List<MCenter> centerList = getCenterList(UserCenterLogic.SelectCls.ALL);
		// [#2432][#2272][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod End

		for (MCenter center : centerList) {
			if (centerId == center.getCenterId().longValue()) {
				// 権限有り (正常)

				return;
			}
		}

		// センタ使用権限なし
		getErrorManager().add(errSts, WmsMessageConst.CENTER_CANNOT_USE_NO_PERMISSION_ERROR);
		return;
	}
}
