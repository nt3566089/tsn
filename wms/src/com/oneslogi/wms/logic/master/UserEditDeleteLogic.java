package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MUserCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MUserClientBhv;
import com.oneslogi.base.dbflute.exbhv.MUserDepositBhv;
import com.oneslogi.base.dbflute.exentity.MUserCenter;
import com.oneslogi.base.dbflute.exentity.MUserClient;
import com.oneslogi.base.dbflute.exentity.MUserDeposit;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ユーザマスタメンテナンス削除ロジッククラス
 */
public class UserEditDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MUserCenterBhv mUserCenterBhv;
	@Inject
	private MUserClientBhv mUserClientBhv;
	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
	@Inject
	private MUserDepositBhv mUserDepositBhv;
	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

	/**
	 * <h2>ユーザセンタマスタを削除する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからユーザセンタマスタのデータを削除する。
	 * </pre>
	 * @param userCenter ユーザセンタマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deleteMUserCenter(MUserCenter userCenter, ErrorStatus errSts) {

		// ユーザセンタマスタ削除
		mUserCenterBhv.delete(userCenter);
	}

	/**
	 * <h2>ユーザ荷主マスタを削除する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからユーザ荷主マスタのデータを削除する。
	 * </pre>
	 * @param userClient ユーザ荷主マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deleteMUserClient(MUserClient userClient, ErrorStatus errSts) {

		// ユーザ荷主マスタ削除
		mUserClientBhv.delete(userClient);
	}

	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
	/**
	 * <h2>ユーザ預託マスタを削除する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからユーザ預託マスタのデータを削除する。
	 * </pre>
	 * @param userDeposit ユーザ預託マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deleteMUserDeposit(MUserDeposit userDeposit, ErrorStatus errSts) {

		// ユーザ荷主マスタ削除
		mUserDepositBhv.delete(userDeposit);
	}
	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End
}
