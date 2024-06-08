package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.cbean.MUserDepositCB;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ユーザマスタ一覧検索ロジッククラス。
 */
public class UserDepositListSelectLogic extends AbstractWmsLogic {

	@Inject
	private MCustomerBhv mCustomerBhv;

	/**
	 * <h2>ユーザ管理預託データを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから取引先マスタ、ユーザ預託マスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param bUser ユーザマスタ：ユーザID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MCustomer> 取引先マスタ(預託)データのリスト
	 */
	public List<MCustomer> selectByIdCustomerDeposit(final BUser bUser, ErrorStatus errSts) {

		List<MCustomer> result = null;

		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		cb.query().setDepositFlg_Equal_$1();
		cb.query().addOrderBy_CustomerCd_Asc();

		result = mCustomerBhv.selectList(cb);

		mCustomerBhv.loadMUserDepositList(result, new ConditionBeanSetupper<MUserDepositCB>() {
			public void setup(MUserDepositCB subCB) {
				subCB.query().setUserId_Equal(bUser.getUserId());
				subCB.query().setDelFlg_Equal_$0();
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
