package com.oneslogi.wms.logic.inventory;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.exbhv.TInventoryInstBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlInstKeyListPmb;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dbflute.exentity.customize.SqlInstKeyList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫調査指示一覧データ取得ロジッククラス
 */
public class InstKeyListSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TInventoryInstBhv tInventoryInstBhv;

	/**
	 * <h2>在庫調査指示一覧データを取得する。</h2>
	 * <pre>
	 * 受取った条件で在庫調査指示一覧データを検索する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸日(From)・棚卸日(To)・荷主ID・センタID
	 * @param tInventoryInst 棚卸指示：預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)
	 * @param paging ページ検索
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<SqlInstKeyList> 棚卸入力履歴リスト
	 */
	public PagingResultBean<SqlInstKeyList> select(TInventoryH tInventoryH, TInventoryInst tInventoryInst, PagingData paging, ErrorStatus errSts) {

		// ===== 初期処理 =====
		PagingResultBean<SqlInstKeyList> result = null;

		// ===== 在庫調査指示一覧取得 =====
		
		// 外出しSQLの定義
		String path = TInventoryInstBhv.PATH_selectSqlInstKeyList;

		// 検索条件の設定
		SqlInstKeyListPmb pmb = setCondition(tInventoryH, tInventoryInst);

		// 検索実行
		Class<SqlInstKeyList> entityType = SqlInstKeyList.class;		
		result = selectPage(tInventoryInstBhv, path, pmb, entityType, paging);

		// 該当データ無し
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}
		
		// ===== 在庫調査指示一覧レコード数データ取得 =====

		return result;
	}


	/**
	 * <h2>外出しSQL文の検索条件を設定する。</h2>
	 * <pre>
	 * 外出しSQL文の検索条件を設定する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸日(From)・棚卸日(To)・荷主ID・センタID
	 * @param tInventoryInst 棚卸指示：預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)
	 * @return SqlInstKeyListCountPmb 在庫調査指示一覧
	 */
	protected SqlInstKeyListPmb setCondition(TInventoryH tInventoryH, TInventoryInst tInventoryInst) {
		SqlInstKeyListPmb pmb = new SqlInstKeyListPmb();

		// 検索条件の設定
		pmb.setClientId(tInventoryH.getClientId());//荷主ID
		pmb.setCenterId(tInventoryH.getCenterId());//センタID
		pmb.setInventoryInstKbn(tInventoryInst.getInventoryInstKbn());//在庫調査区分
		pmb.setInventoryDt(tInventoryH.getInventoryDt());//在庫調査指示作成日
		if (tInventoryH.getInventoryKey() == null) {
			pmb.setInventoryKey_PrefixSearch(null);
		} else {
			pmb.setInventoryKey_PrefixSearch(String.valueOf(tInventoryH.getInventoryKey()));//在庫調査指示キー
		}
		pmb.setLocationGrp(tInventoryInst.getLocationGrp());//ロケーショングループ
		
		return pmb;
	}
}
