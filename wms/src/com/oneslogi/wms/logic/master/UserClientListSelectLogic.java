package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.cbean.MUserClientCB;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ユーザマスタ一覧検索ロジッククラス。
 */
public class UserClientListSelectLogic extends AbstractWmsLogic {

	@Inject
	private MClientBhv mClientBhv;

	/**
	 * <h2>ユーザ管理荷主データを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから荷主マスタ、ユーザ荷主マスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param bUser ユーザマスタ：ユーザID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MClient> 荷主マスタデータのリスト
	 */
	public List<MClient> selectByIdClient(final BUser bUser, ErrorStatus errSts) {

		List<MClient> result = null;

		MClientCB cb = mClientBhv.newMyConditionBean();
		cb.query().addOrderBy_ClientCd_Asc();

		result = mClientBhv.selectList(cb);

		mClientBhv.loadMUserClientList(result, new ConditionBeanSetupper<MUserClientCB>() {
			public void setup(MUserClientCB subCB) {
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
