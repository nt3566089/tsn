package com.oneslogi.wms.logic.inventory;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.exbhv.TInventoryInstBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlInstKeyPrintPmb;
import com.oneslogi.base.dbflute.exentity.customize.SqlInstKeyList;
import com.oneslogi.base.dbflute.exentity.customize.SqlInstKeyPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 不適品在庫調査表データ取得ロジッククラス
 */
public class NonconformityStockReportPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TInventoryInstBhv tInventoryInstBhv;

	/**
	 * <h2>不適品在庫調査表データを取得する。</h2>
	 * <pre>
	 * 受取った条件で不適品在庫調査表データを検索する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸日(From)・棚卸日(To)・荷主ID・センタID
	 * @param tInventoryInst 棚卸指示：預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)
	 * @param paging ページ検索
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<SqlInstKeyList> 棚卸入力履歴リスト
	 */
	public ListResultBean<SqlInstKeyPrint> select(SqlInstKeyList sqlInstKey,  ErrorStatus errSts) {

		// ===== 初期処理 =====
		ListResultBean<SqlInstKeyPrint> result = null;
		
		// ===== 不適品在庫調査表取得 =====
		
		// 外出しSQLの定義
		String path = TInventoryInstBhv.PATH_selectSqlInstKeyPrint;

		// 検索条件の設定
		SqlInstKeyPrintPmb pmb = setCondition(sqlInstKey);

		// 検索実行
		Class<SqlInstKeyPrint> entityType = SqlInstKeyPrint.class;		
		result = selectListToReport(tInventoryInstBhv,path,pmb, entityType);

		// 該当データ無し
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return result;
		}
		
		// ===== 不適品在庫調査表レコード数データ取得 =====

		return result;
	}

	/**
	 * <h2>外出しSQL文の検索条件を設定する。</h2>
	 * <pre>
	 * 外出しSQL文の検索条件を設定する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸日(From)・棚卸日(To)・荷主ID・センタID
	 * @param tInventoryInst 棚卸指示：預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)
	 * @return SqlInstKeyListCountPmb 不適品在庫調査表
	 */
	protected SqlInstKeyPrintPmb setCondition(SqlInstKeyList sqlInstKey) {
		SqlInstKeyPrintPmb pmb = new SqlInstKeyPrintPmb();

		// 検索条件の設定
		pmb.setInventoryInstKbn(sqlInstKey.getInventoryInstKbn());//在庫調査区分
		pmb.setInventoryKey(sqlInstKey.getInventoryKey());//在庫調査指示キー
		
		return pmb;
	}
}
