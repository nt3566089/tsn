package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exbhv.TTrsolistBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlBondedShippingRelationListPrintCntChkPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlBondedShippingRelationListPrintMrgChkPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlBondedShippingRelationListPrintPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlBondedShippingRelationListPrintWorkallocateidChkPmb;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TTrsolist;
import com.oneslogi.base.dbflute.exentity.customize.SqlBondedShippingRelationListPrint;
import com.oneslogi.base.dbflute.exentity.customize.SqlBondedShippingRelationListPrintCntChk;
import com.oneslogi.base.dbflute.exentity.customize.SqlBondedShippingRelationListPrintMrgChk;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;

/**
 * 保税出庫関連リスト出力データ取得ロジッククラス
 */
public class BondedShippingRelationListPrintSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TTrsolistBhv tTrsolistBhv;

	// ===== 使用ロジック =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;

	/**
	 * <h2>保税出庫関連リスト出力データ検索.</h2>
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
	public PagingResultBean<SqlBondedShippingRelationListPrint> select(TTrsolist header, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<SqlBondedShippingRelationListPrint> result = null;

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

		// ===== 保税出庫関連リスト出力データ取得 =====

		// 外出しSQLの定義
		String path = TTrsolistBhv.PATH_selectSqlBondedShippingRelationListPrint;

		// 検索条件の設定
		SqlBondedShippingRelationListPrintPmb pmb = setCondition(header);

		if (pmb == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// 検索実行
		Class<SqlBondedShippingRelationListPrint> entityType = SqlBondedShippingRelationListPrint.class;
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
	 * @return SqlBondedShippingRelationListPrintPmb 検索条件pmb
	 */
	private SqlBondedShippingRelationListPrintPmb setCondition(TTrsolist header) {
		SqlBondedShippingRelationListPrintPmb pmb = new SqlBondedShippingRelationListPrintPmb();

		// 検索条件の設定
		pmb.setCenterId(header.getCenterId());
		pmb.setClientId(header.getClientId());
		pmb.setShipschdateFrom(header.getShipschdateFrom());
		pmb.setShipschdateTo(header.getShipschdateTo());
		if (CU.equals(header.getPrintedflg(), CDef.ListOutKbn.$2.code()) == false) {
			pmb.setPrintedflg(header.getPrintedflg());
		}
		pmb.setListkbn(header.getListkbn());
		if (header.getPickbatchkey() != null) {
			pmb.setPickbatchkey_PrefixSearch(header.getPickbatchkey().toString());
		}
		if (header.getWorkallocateid() != null) {
			pmb.setWorkallocateid_PrefixSearch(header.getWorkallocateid().toString());
		}

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
	public void checkPrint(TTrsolist header, List<SqlBondedShippingRelationListPrint> bodyList, ErrorStatus errSts) {

		// 拠点IDの取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		if (mCenter == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return;
		}
		Long centerId = mCenter.getCenterId();

		// 荷主IDを取得
		MClient mClient = new MClient();
		mClient.setClientCd(header.getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return;
		}
		Long clientId = mClient.getClientId();

		String cntChkPath = TTrsolistBhv.PATH_selectSqlBondedShippingRelationListPrintCntChk;
		String mrgChkPath = TTrsolistBhv.PATH_selectSqlBondedShippingRelationListPrintMrgChk;
		String mrgChkWPath = TTrsolistBhv.PATH_selectSqlBondedShippingRelationListPrintWorkallocateidChk;

		for (SqlBondedShippingRelationListPrint body : bodyList) {
			// ===== 件数チェック =====
			// 検索条件の設定
			SqlBondedShippingRelationListPrintCntChkPmb cntChkPmb = new SqlBondedShippingRelationListPrintCntChkPmb();
			cntChkPmb.setCenterId(centerId);
			cntChkPmb.setClientId(clientId);
			cntChkPmb.setListkbn(body.getListkbn());
			cntChkPmb.setPickbatchkey(body.getPickbatchkey());
			cntChkPmb.setPickdate(body.getPickdate());
			cntChkPmb.setPrintedflg(body.getPrintedflg());
			cntChkPmb.setWorkallocateid(body.getWorkallocateid().longValue());

			// 検索処理
			ListResultBean<SqlBondedShippingRelationListPrintCntChk> cntChkResult = new ListResultBean<SqlBondedShippingRelationListPrintCntChk>();
			Class<SqlBondedShippingRelationListPrintCntChk> cntChkEntityType = SqlBondedShippingRelationListPrintCntChk.class;
			cntChkResult = tTrsolistBhv.outsideSql().selectList(cntChkPath, cntChkPmb, cntChkEntityType);

			// エラー判定
			if (cntChkResult.get(0).getRecCnt() == 0) {
				this.getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_UPDATE_ERROR);
				return;
			}

			// ===== マージ状態チェック =====
			// 検索条件の設定
			SqlBondedShippingRelationListPrintMrgChkPmb mrgChkPmb = new SqlBondedShippingRelationListPrintMrgChkPmb();
			mrgChkPmb.setCenterId(centerId);
			mrgChkPmb.setClientId(clientId);
			mrgChkPmb.setPickbatchkey(body.getPickbatchkey());

			// 検索処理
			ListResultBean<SqlBondedShippingRelationListPrintMrgChk> mrgChkResult = new ListResultBean<SqlBondedShippingRelationListPrintMrgChk>();
			Class<SqlBondedShippingRelationListPrintMrgChk> mrgChkEntityType = SqlBondedShippingRelationListPrintMrgChk.class;
			mrgChkResult = tTrsolistBhv.outsideSql().selectList(mrgChkPath, mrgChkPmb, mrgChkEntityType);

			// エラー判定
			if (mrgChkResult.get(0).getRecCnt() > 0) {
				this.getErrorManager().add(errSts, WmsMessageConst.MERGE_STATUS_FAILURE_ERROR);
				return;
			}

			// ===== 棚出しリストキー（＝引当バッチキー）有効チェック =====
			// 検索条件の設定
			SqlBondedShippingRelationListPrintWorkallocateidChkPmb mrgChkWPmb = new SqlBondedShippingRelationListPrintWorkallocateidChkPmb();
			mrgChkWPmb.setCenterId(centerId);
			mrgChkWPmb.setWorkallocateid(body.getWorkallocateid());

			// 検索処理
			ListResultBean<SqlBondedShippingRelationListPrintMrgChk> mrgChkWResult = new ListResultBean<SqlBondedShippingRelationListPrintMrgChk>();
			Class<SqlBondedShippingRelationListPrintMrgChk> mrgChkWEntityType = SqlBondedShippingRelationListPrintMrgChk.class;
			mrgChkWResult = tTrsolistBhv.outsideSql().selectList(mrgChkWPath, mrgChkWPmb, mrgChkWEntityType);

			// エラー判定
			if (mrgChkWResult.get(0).getRecCnt() == 0) {
				this.getErrorManager().add(errSts, WmsMessageConst.PRINT_DATA_NOT_FOUND_ERROR);
				return;
			}
		}
	}
}
