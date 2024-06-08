package com.oneslogi.wms.logic.shipping;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.TTrsoCB;
import com.oneslogi.base.dbflute.cbean.TTrsolistCB;
import com.oneslogi.base.dbflute.exbhv.TTrsoBhv;
import com.oneslogi.base.dbflute.exbhv.TTrsolistBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlPickingListRePrintPmb;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TTrso;
import com.oneslogi.base.dbflute.exentity.TTrsolist;
import com.oneslogi.base.dbflute.exentity.customize.SqlPickingListRePrint;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;

/**
 * 保税出庫関連リスト再出力データ取得ロジッククラス
 */
public class PickingListRePrintSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TTrsolistBhv tTrsolistBhv;
	@Inject
	private TTrsoBhv tTrsoBhv;

	// ===== 使用ロジック =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;

	/**
	 * <h2>保税出庫関連リスト再出力データ検索.</h2>
	 * <pre>
	 * 引数の条件を指定して出庫関連リスト出力を検索する。
	 * 検索条件は引数でセットされた条件のみ使用する。
	 *
	 * 検索結果が0件の場合は、エラーを登録する。
	 *
	 * </pre>
	 * @param header 検索条件
	 * @param errSts エラー時に登録するエラーステータス
	 * @return 検索結果
	 */
	public PagingResultBean<SqlPickingListRePrint> select(TTrsolist header, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<SqlPickingListRePrint> result = null;

		// 拠点IDの取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		if (mCenter == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}
		header.setCenterId(mCenter.getCenterId());

		// 荷主IDを取得
		MClient MClient = new MClient();
		MClient.setClientCd(header.getClientCd());
		MClient = clientLogic.getUkEntity(MClient);
		if (MClient == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}
		header.setClientId(MClient.getClientId());

		// ===== 保税出庫関連リスト再出力データ取得 =====

		// 外出しSQLの定義
		String path = TTrsolistBhv.PATH_selectSqlPickingListRePrint;

		// 検索条件の設定
		SqlPickingListRePrintPmb pmb = setCondition(header);

		if (pmb == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// 検索実行
		Class<SqlPickingListRePrint> entityType = SqlPickingListRePrint.class;
		result = selectPage(tTrsolistBhv, path, pmb, entityType, paging);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}

	/**
	 * <h2>外出しSQLの検索条件を設定する。</h2>
	 * <pre>
	 * 検索条件を設定する。
	 * </pre>
	 * @param header 検索条件
	 * @return SqlPickingListRePrintPmb 検索条件pmb
	 */
	private SqlPickingListRePrintPmb setCondition(TTrsolist header) {
		SqlPickingListRePrintPmb pmb = new SqlPickingListRePrintPmb();

		// 検索条件の設定
		pmb.setCenterId(header.getCenterId());
		pmb.setClientId(header.getClientId());
		pmb.setListkbn(header.getListkbn());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss");
		String fromYmd = header.getPrintdatetimeFrom();
		String toYmd = header.getPrintdatetimeTo();

		if (CU.isNullOrEmpty(fromYmd) == false) {
			fromYmd = fromYmd + "T000000";
	        LocalDateTime dateTime = LocalDateTime.parse(fromYmd, formatter);
	        Timestamp timestamp = Timestamp.valueOf(dateTime);
			pmb.setPrintdatetimeFrom(timestamp);
		}

		if (CU.isNullOrEmpty(toYmd) == false) {
			toYmd = toYmd + "T235959";
	        LocalDateTime dateTime = LocalDateTime.parse(toYmd, formatter);
	        Timestamp timestamp = Timestamp.valueOf(dateTime);
			pmb.setPrintdatetimeTo(timestamp);
		}

		pmb.setShipschdateFrom(header.getShipschdateFrom());
		pmb.setShipschdateTo(header.getShipschdateTo());
		if (header.getWorkallocateid() != null) {
			pmb.setWorkallocateid_PrefixSearch(header.getWorkallocateid().toString());
		}
		pmb.setCustomerCd_PrefixSearch(header.getCustomerCd());
		pmb.setShiptocd_PrefixSearch(header.getShiptocd());
		pmb.setOwnerordrno_PrefixSearch(header.getOwnerorderno());
		pmb.setOtherlot2(header.getOtherlot2());
		pmb.setOtherlot4_PrefixSearch(header.getOtherlot4());
		pmb.setRmano_PrefixSearch(header.getRmano());
		pmb.setOtherlot3_PrefixSearch(header.getOtherlot3());
		pmb.setNotes_PrefixSearch(header.getNotes());
		pmb.setLocationCd_PrefixSearch(header.getLocationCd());
		pmb.setTrsoliststs(header.getTrsoliststs());

		return pmb;
	}

	/**
	 * <h2>発行前チェック処理</h2>
	 * <pre>
	 * 発行前チェックを行う。
	 *
	 * エラーがある場合、エラー情報をエラーステータスに設定する。
	 * </pre>
	 * @param header 検索条件
	 * @param bodyList 明細情報
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkPrint(TTrsolist header, List<SqlPickingListRePrint> bodyList, ErrorStatus errSts) {

		for (SqlPickingListRePrint body : bodyList) {

			// 出庫関連リスト出力を取得
			TTrsolistCB tTrsolistCB = tTrsolistBhv.newMyConditionBean();
			tTrsolistCB.query().setShippingListPrintId_Equal(body.getShippingListPrintId());
			tTrsolistCB.specify().columnShippingListPrintId();
			TTrsolist tTrsolist = tTrsolistBhv.selectEntity(tTrsolistCB);
			// エラー判定
			if (tTrsolist == null) {
				this.getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
				return;
			}

			// 出荷ステータスが'02'(引当済)より前のレコードを取得
			if (body.getSoid() != null) {
				TTrsoCB tTrosCB = tTrsoBhv.newMyConditionBean();
				tTrosCB.query().setSoid_Equal(body.getSoid());
				tTrosCB.query().setSts_LessThan("02");
				tTrosCB.specify().columnSoid();
				TTrso tTrso = tTrsoBhv.selectEntity(tTrosCB);
				// エラー判定
				if (tTrso != null) {
					this.getErrorManager().add(errSts, WmsMessageConst.ALLOCATION_UNFINISHED_PICKING_LIST_PRINT_ERROR);
					return;
				}
			}

		}

	}

}
