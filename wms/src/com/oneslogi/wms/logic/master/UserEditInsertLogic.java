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
 * ユーザマスタメンテナンス登録ロジッククラス
 */
public class UserEditInsertLogic extends AbstractWmsLogic {

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
	 * <h2>ユーザセンタマスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータをユーザセンタマスタに登録する。
	 * </pre>
	 * @param mUserCenter ユーザセンタマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insertMUserCenter(MUserCenter mUserCenter, ErrorStatus errSts) {

		// ユーザセンタマスタ登録実行
		mUserCenterBhv.insert(mUserCenter);
	}

	/**
	 * <h2>ユーザ荷主マスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータをユーザ荷主マスタに登録する。
	 * </pre>
	 * @param mUserClient ユーザ荷主マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insertMuserClient(MUserClient mUserClient, ErrorStatus errSts) {

		// ユーザ荷主マスタ登録実行
		mUserClientBhv.insert(mUserClient);
	}

	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
	/**
	 * <h2>ユーザ預託マスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータをユーザ預託マスタに登録する。
	 * </pre>
	 * @param mUserDeposit ユーザ預託マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insertMUserDeposit(MUserDeposit mUserDeposit, ErrorStatus errSts) {

		// ユーザ預託マスタ登録実行
		mUserDepositBhv.insert(mUserDeposit);
	}
	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End
}
