package com.oneslogi.wms.logic.receive;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlReceiveStatusProgressPmb;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.customize.SqlReceiveStatusProgress;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;

/**
 * 入荷ステータス別進捗データ取得ロジッククラス
 */
public class ReceiveStatusProgressSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private ClientLogic clientLogic;

	@Inject
	private CenterLogic centerLogic;

	/**
	 * <h2>入荷ステータス別進捗取得処理を行う。</h2>
	 * <pre>
	 * 外出しSQLを使用し、引数をキーに配送コース別出庫予定一覧データを取得する。
	 * 引数（入荷予定ヘッダ）の荷主CDまたはセンタCDがマスタに存在しない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダ：荷主CD・センタCD・入荷予定日(From)・入荷予定日(To)・予定仕入先CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return ListResultBean<SqlReceiveStatusProgress> 予定仕入先CD別入荷予定のリスト
	 */
	public ListResultBean<SqlReceiveStatusProgress> select(TReceivePlanH tReceivePlanH, ErrorStatus errSts) {

		ListResultBean<SqlReceiveStatusProgress> result = null;

		// ===== 配送コース別出庫予定一覧データ取得 =====

		// 外出しSQLの定義
		String path = TReceivePlanHBhv.PATH_selectSqlReceiveStatusProgress;

		// 検索条件の設定
		SqlReceiveStatusProgressPmb pmb = setCondition(tReceivePlanH);

		// 該当データ無し
		if (pmb == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// 検索実行
		Class<SqlReceiveStatusProgress> entityType = SqlReceiveStatusProgress.class;
		result = tReceivePlanHBhv.outsideSql().selectList(path, pmb, entityType);

		// 該当データ無し
		if (result.size() == 0 || (result.size() == 1 && result.get(0).getCenterId() == null)) {
			//[ON-推]0件の場合、エラーメッセージを表示しないように修正 2016.04.06 chou 削除 Start
//			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			//[ON-推]0件の場合、エラーメッセージを表示しないように修正 2016.04.06 chou 削除 End
			return result;
		}

		return result;
	}

	/**
	 * <h2>検索文の条件を設定する。</h2>
	 * @param tReceivePlanH 入荷予定ヘッダ：荷主・センタ・入荷予定日(From)・入荷予定日(To)・予定仕入先CD
	 * @return SqlReceiveStatusProgressPmb
	 */
	protected SqlReceiveStatusProgressPmb setCondition(TReceivePlanH tReceivePlanH) {
		SqlReceiveStatusProgressPmb pmb = new SqlReceiveStatusProgressPmb();
		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(tReceivePlanH.getMClient().getClientCd());
		clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);
		if (clientCondition == null) {
			return null;
		}
		long clientId = clientLogic.getUkEntity(clientCondition).getClientId();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(tReceivePlanH.getMCenter().getCenterCd());
		centerCondition = centerLogic.getUkEntity(centerCondition);
		if (centerCondition == null) {
			return null;
		}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// 検索条件の設定
		pmb.setClientId(clientId);//荷主ID
		pmb.setCenterId(centerId);//センタID
		pmb.setReceivePlanDtFrom(tReceivePlanH.getReceivePlanDtFrom());//入荷予定日(From)
		pmb.setReceivePlanDtTo(tReceivePlanH.getReceivePlanDtTo());//入荷予定日(To)
		// [Ver3.0][#4078] 予定仕入先の検索条件を前方一致に変更 2018.04.12 matsumoto Start
		pmb.setPlanSupplierCd_PrefixSearch(tReceivePlanH.getPlanSupplierCd());//予定仕入先CD
		// [Ver3.0][#4078] 予定仕入先の検索条件を前方一致に変更 2018.04.12 matsumoto End

		return pmb;
	}

}
