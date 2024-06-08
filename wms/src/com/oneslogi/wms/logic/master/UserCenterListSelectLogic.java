package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MUserCenterCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ユーザマスタ一覧検索ロジッククラス。
 */
public class UserCenterListSelectLogic extends AbstractWmsLogic {

	@Inject
	private MCenterBhv mCenterBhv;

	/**
	 * <h2>ユーザ管理センタデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースからセンタマスタ、ユーザセンタマスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param bUser ユーザマスタ：ユーザID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MCenter> センタマスタリスト
	 */
	public List<MCenter> selectByIdCenter(final BUser bUser, ErrorStatus errSts) {

		List<MCenter> result = null;

		MCenterCB cb = mCenterBhv.newMyConditionBean();
		cb.query().addOrderBy_CenterCd_Asc();

		result = mCenterBhv.selectList(cb);

		mCenterBhv.loadMUserCenterList(result, new ConditionBeanSetupper<MUserCenterCB>() {
			public void setup(MUserCenterCB subCB) {
				subCB.query().setUserId_Equal(bUser.getUserId());
			}
		});

		// データ存在チェック
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), BaseMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

}
