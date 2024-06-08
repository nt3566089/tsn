package com.oneslogi.wms.logic.shipping;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.exbhv.TCcopamBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlDispatchRecordInputListPmb;
import com.oneslogi.base.dbflute.exentity.TCcopam;
import com.oneslogi.base.dbflute.exentity.customize.SqlDispatchRecordInputList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 配車実績入力(一覧)データ取得ロジッククラス
 */
public class ShippingInstructionInfoSelectLogic extends AbstractWmsLogic {
	
	// ===== 使用テーブル =====
	@Inject
	private TCcopamBhv tCcopamBhv;

	/**
	 * <h2>配車実績入力(一覧)データを取得する。</h2>
	 * <pre>
	 * 受取った条件で配車実績入力(一覧)データを検索する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tCcopam 配車実績：TD中継区分・発送先CD・発送番号(3)・荷主ID・センタID
	 * @param systemDt システム管理日付
	 * @param paging ページ検索
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<SqlInstKeyList> 棚卸入力履歴リスト
	 */
	public PagingResultBean<SqlDispatchRecordInputList> select(TCcopam tCcopam, 
			String systemDt,
			PagingData paging, 
			ErrorStatus errSts) {

		// ===== 初期処理 =====
		PagingResultBean<SqlDispatchRecordInputList> result = null;

		// ===== 配車実績入力(一覧)取得 =====
		
		// 外出しSQLの定義
		String path = TCcopamBhv.PATH_selectSqlDispatchRecordInputList;

		// 検索条件の設定
		SqlDispatchRecordInputListPmb pmb = setCondition(tCcopam, systemDt);

		// 検索実行
		Class<SqlDispatchRecordInputList> entityType = SqlDispatchRecordInputList.class;		
		result = selectPage(tCcopamBhv, path, pmb, entityType, paging);

		// 該当データ無し
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}
		
		return result;
	}


	/**
	 * <h2>外出しSQL文の検索条件を設定する。</h2>
	 * <pre>
	 * 外出しSQL文の検索条件を設定する。
	 * </pre>
	 * @param tCcopam 配車実績：TD中継区分・発送先CD・発送番号(3)・荷主ID・センタID
	 * @param systemDt システム管理日付
	 * @return tTrflexibility 融通指示実行一覧検索条件
	 */
	protected SqlDispatchRecordInputListPmb setCondition(TCcopam tCcopam, String systemDt) {
		SqlDispatchRecordInputListPmb pmb = new SqlDispatchRecordInputListPmb();

		// ===== 検索条件の設定 =====
		
		pmb.setClientId(tCcopam.getClientId());
		pmb.setCenterId(tCcopam.getCenterId());
		// TD中継区分
		pmb.setTdrelayid(tCcopam.getTdrelayid());
		// 発送先CD
		pmb.setStcd(tCcopam.getStcd());
		// 発送番号(3)
		pmb.setSnno3_PrefixSearch(tCcopam.getSnno3());
		// システム管理日付
		pmb.setSystemDt(systemDt);
		
		return pmb;
	}
}
