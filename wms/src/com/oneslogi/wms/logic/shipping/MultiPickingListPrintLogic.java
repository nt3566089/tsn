package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlMultiPickingListPrintPmb;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.customize.SqlMultiPickingListPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * マルチピッキングリスト発行ロジッククラス
 */
public class MultiPickingListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingHBhv tPickingHBhv;

	/**
	 * <h2>マルチピッキングリストデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し、マルチピッキングリストのデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<SqlMultiPickingListPrint>  マルチピッキングリスト発行データリスト
	 */
	public List<SqlMultiPickingListPrint> selectProgressData(TPickingR tPickingR, ErrorStatus errSts) {

		List<SqlMultiPickingListPrint> result = null;

		// ===== ケースピッキングリスト発行データ取得 =====

		// 外出しSQLの定義
		String path = TPickingHBhv.PATH_selectSqlMultiPickingListPrint;

		// 検索条件の設定
		SqlMultiPickingListPrintPmb pmb = setCondition(tPickingR);

		// 検索実行
		Class<SqlMultiPickingListPrint> entityType = SqlMultiPickingListPrint.class;
		result = selectListToReport(tPickingHBhv, path, pmb, entityType);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}

	/**
	 * <h2>検索条件を設定する。</h2>
	 * <pre>
	 * 検索条件を設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @return SqlMultiPickingListPrintPmb マルチピッキングリスト発行データ
	 */
	private SqlMultiPickingListPrintPmb setCondition(TPickingR tPickingR) {
		// 検索条件の設定
		SqlMultiPickingListPrintPmb pmb = new SqlMultiPickingListPrintPmb();
		pmb.setControlNo(tPickingR.getControlNo());
		pmb.setCultureId(getCultureId());

		return pmb;
	}

}
