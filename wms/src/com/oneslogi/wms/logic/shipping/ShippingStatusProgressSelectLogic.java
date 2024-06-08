package com.oneslogi.wms.logic.shipping;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlShippingStatusProgressPmb;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingStatusProgress;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;

/**
 * 出荷ステータス別進捗データ取得ロジッククラス
 */
public class ShippingStatusProgressSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private ClientLogic clientLogic;

	@Inject
	private CenterLogic centerLogic;

	/**
	 * <h2>出荷データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し出荷ステータス別進捗データを抽出する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param tShippingInstH 出荷指示ヘッダ：荷主・センタ・配送コースCD・出荷日・作業日
	 * @param errSts エラー時に設定するエラーステータス
	 * @return ListResultBean<SqlShippingStatusProgress> 出荷ステータス別進捗リスト
	 */
	public ListResultBean<SqlShippingStatusProgress> select(TShippingInstH tShippingInstH, ErrorStatus errSts) {

		ListResultBean<SqlShippingStatusProgress> result = null;

		// ===== 配送コース別出庫指示一覧データ取得 =====

		// 外出しSQLの定義
		String path = TShippingInstHBhv.PATH_selectSqlShippingStatusProgress;

		// 検索条件の設定
		SqlShippingStatusProgressPmb pmb = setCondition(tShippingInstH);

		// 該当データ無し
		if (pmb == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// 検索実行
		Class<SqlShippingStatusProgress> entityType = SqlShippingStatusProgress.class;
		result = tShippingInstHBhv.outsideSql().selectList(path, pmb, entityType);

		// 該当データ無し
		if (result.size() == 0 || (result.size() == 1 && result.get(0).getCenterId() == null)) {
			//this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}

	/**
	 * <h2>外出SQL条件の設定を行う。</h2>
	 * <pre>
	 * 外出SQL条件の設定を行う。
	 * </pre>
	 * @param tShippingInstH 出荷指示ヘッダ：荷主・センタ・配送コースCD・出荷日・作業日
	 * @return SqlDeliveryCourseShippingListPmb 外出SQL配送コース出荷リスト
	 */
	protected SqlShippingStatusProgressPmb setCondition(TShippingInstH tShippingInstH) {
		SqlShippingStatusProgressPmb pmb = new SqlShippingStatusProgressPmb();
		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(tShippingInstH.getMClient().getClientCd());
		clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);
		if (clientCondition == null) {
			return null;
		}
		long clientId = clientLogic.getUkEntity(clientCondition).getClientId();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(tShippingInstH.getMCenter().getCenterCd());
		centerCondition = centerLogic.getUkEntity(centerCondition);
		if (centerCondition == null) {
			return null;
		}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// 検索条件の設定
		//pmb.setCenterClassCondition(getCenterClassCondition());
		pmb.setClientId(clientId);//荷主ID
		pmb.setCenterId(centerId);//センタID
		// [#7015][OSS] 配送コースCDを前方一致検索に修正 2020.02.03 tsuboi Start
		pmb.setDeliveryCourseCd_PrefixSearch(tShippingInstH.getDeliveryCourseCd());//配送コースCD
		// [#7015][OSS] 配送コースCDを前方一致検索に修正 2020.02.03 tsuboi End
		pmb.setShippingDt(tShippingInstH.getShippingDt());//出荷日
		pmb.setWorkDt(tShippingInstH.getWorkDt());//作業日

		return pmb;
	}

}
