package com.oneslogi.wms.logic.shipping;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TTrsolistCB;
import com.oneslogi.base.dbflute.exbhv.TTrsolistBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlBondedShippingRelationListPrintGetIdPmb;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TTrsolist;
import com.oneslogi.base.dbflute.exentity.customize.SqlBondedShippingRelationListPrint;
import com.oneslogi.base.dbflute.exentity.customize.SqlBondedShippingRelationListPrintGetId;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;

/**
 * 保税出庫関連リスト出力データ更新ロジッククラス
 */
public class BondedShippingRelationListPrintUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TTrsolistBhv tTrsolistBhv;

	// ===== 使用ロジック =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;

	/**
	 * <h2>コントロールNo設定処理</h2>
	 * <pre>
	 * 次の処理を行う。
	 * ・印刷済フラグの更新
	 * ・発行日の更新
	 * ・コントロールNoクリア
	 * </pre>
	 * @param header 検索条件
	 * @param bodyList 明細情報
	 * @param update 出庫関連リスト印刷：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public int setControlNo(TTrsolist header, List<SqlBondedShippingRelationListPrint> bodyList, TTrsolist update, ErrorStatus errSts) {

		int updateCount = 0;
		
		// 拠点IDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(header.getCenterCd());
		centerCondition = centerLogic.getUkEntity(centerCondition);
		Long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(header.getClientCd());
		Long clientId = clientLogic.getUkEntity(clientCondition).getClientId();

		String getIdPath = TTrsolistBhv.PATH_selectSqlBondedShippingRelationListPrintGetId;

		for (SqlBondedShippingRelationListPrint body : bodyList) {

			// 更新対象の出庫関連リスト出力を取得
			SqlBondedShippingRelationListPrintGetIdPmb getIdPmb = new SqlBondedShippingRelationListPrintGetIdPmb();
			getIdPmb.setCenterId(centerId);
			getIdPmb.setClientId(clientId);
			getIdPmb.setListkbn(body.getListkbn());
			getIdPmb.setPickbatchkey(body.getPickbatchkey().longValue());
			getIdPmb.setPickdate(body.getPickdate());
			getIdPmb.setPrintedflg(body.getPrintedflg());
			getIdPmb.setWorkallocateid(body.getWorkallocateid().longValue());
			
			ListResultBean<SqlBondedShippingRelationListPrintGetId> getIdResult = new ListResultBean<SqlBondedShippingRelationListPrintGetId>();
			Class<SqlBondedShippingRelationListPrintGetId> mrgChkEntityType = SqlBondedShippingRelationListPrintGetId.class;
			getIdResult = tTrsolistBhv.outsideSql().selectList(getIdPath, getIdPmb, mrgChkEntityType);

			// コントロールNoを設定
			for (SqlBondedShippingRelationListPrintGetId getId : getIdResult) {

				TTrsolistCB tTrsolistCB = tTrsolistBhv.newConditionBean();
				tTrsolistCB.query().setShippingListPrintId_Equal(getId.getShippingListPrintId());
				updateCount = updateCount + tTrsolistBhv.queryUpdate(update, tTrsolistCB);
			}
			
		}
		
		return updateCount;

	}

	/**
	 * <h2>コントロールNoクリア処理</h2>
	 * <pre>
	 * 次の処理を行う。
	 * ・印刷済フラグの更新
	 * ・発行日の更新
	 * ・コントロールNoクリア
	 * </pre>
	 * @param controlNo コントロールNo
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public int clearControlNo(Long controlNo, ErrorStatus errSts) {

		int updateCount = 0;

		TTrsolist update = new TTrsolist();
		update.setControlNo(null);
		update.setPrintedflg(CDef.PrintedFlg.$1.code());
		Timestamp time = new Timestamp(System.currentTimeMillis());
		update.setPrintdatetime(time);
		
		TTrsolistCB tTrsolistCB = tTrsolistBhv.newConditionBean();
		tTrsolistCB.query().setControlNo_Equal(controlNo);
		
		updateCount = tTrsolistBhv.queryUpdate(update, tTrsolistCB);

		return updateCount;
	}
}
