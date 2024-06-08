package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlPackingSlipListPrintPmb;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlPackingSlipListPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * Packing Slipロジッククラス
 */
public class PackingSlipListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;
	private String clientShippingNo;
	private String shippingDt;

	/**
	 * <h2>引当指示と出庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しPacking Slip出力のデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return ListResultBean<SqlPackingSlipListPrint> Packing Slipリスト
	 */
	public ListResultBean<SqlPackingSlipListPrint> select(String clientShippingNo,TPickingR tPickingR,ErrorStatus errSts) {

		// ===== Packing Slipデータ取得 =====

		ListResultBean<SqlPackingSlipListPrint> result = null;

		// 外出しSQLの定義
		String path = TPickingHBhv.PATH_selectSqlPackingSlipListPrint;

		// 検索条件の設定
		SqlPackingSlipListPrintPmb pmb = new SqlPackingSlipListPrintPmb();
		pmb.setControlNo(tPickingR.getControlNo());
		pmb.setClientShippingNo(clientShippingNo);

		// 検索実行
		Class<SqlPackingSlipListPrint> entityType = SqlPackingSlipListPrint.class;
		result = selectListToReport(tPickingHBhv, path, pmb, entityType);

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

	/**
	 * <h2>出庫帳票を更新する。</h2>
	 * <pre>
	 *
	 * 引数を絞り込み条件に設定し、
	 * 対象データのコントロールNo.を更新する。
	 *
	 * 対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param update 出庫帳票：全項目(更新用)
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID
	 * @param tAllocInstH 引当指示ヘッダ：出荷日・納品先CD
	 * @param report 出庫帳票：Packing Slip出力フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateControlNo(TPickingR update, TPickingH tPickingH,TAllocInstH tAllocInstH,TPickingR report, TShippingInstH tShippingInstH, ErrorStatus errSts) {

		List<TPickingR> result = null;
		// ===== 出庫帳票データ更新 =====

		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.setupSelect_TPickingH();
		cb.setupSelect_TPickingH().withTAllocInstH();
		cb.setupSelect_TPickingH().withTAllocInstH().withMCustomerBySupplyCustomerId();

		//検索条件
		cb.query().queryTPickingH().setClientId_Equal(tPickingH.getClientId());
		cb.query().queryTPickingH().setCenterId_Equal(tPickingH.getCenterId());
		cb.query().queryTPickingH().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());
		cb.query().queryTPickingH().queryTAllocInstH().setShippingDt_Equal(tShippingInstH.getShippingDt());
		cb.query().queryTPickingH().queryTAllocInstH().setSupplyCustomerCd_Equal(tAllocInstH.getSupplyCustomerCd());
		cb.query().setPackingOutFlg_Equal(report.getPackingOutFlg());
		clientShippingNo = tShippingInstH.getClientShippingNo();
		shippingDt = tShippingInstH.getShippingDt();
		cb.query().queryTPickingH().queryTAllocInstH().existsTShippingInstHList(new SubQuery<TShippingInstHCB>() {
			 @Override
				public void query(TShippingInstHCB tShippingInstHCB) {
				 tShippingInstHCB.query().setClientShippingNo_Equal(clientShippingNo);
				 tShippingInstHCB.query().setShippingDt_Equal(shippingDt);
				 	tShippingInstHCB.query().existsTShippingInstBList(new SubQuery<TShippingInstBCB>() {
				 		@Override
				 		public void query(TShippingInstBCB tShippingInstBCB) {
				 		}
				 	});

			 	}
			});

		// ===== 出庫帳票の更新の更新 =====

		tPickingRBhv.queryUpdate(update, cb);

    	 //===== データ存在チェック =====
		result = tPickingRBhv.selectList(cb);

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}
	}

	/**
	 * <h2>出庫帳票を更新する。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、出庫帳票の更新を実行する。
	 * </pre>
	 * @param update 出庫帳票：全項目(更新用)
	 * @param report 出庫帳票(検索用)：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updatePrOutFlg(TPickingR update, TPickingR report, ErrorStatus errSts) {

		// ===== 出庫帳票の更新データ更新 =====

		// 更新条件作成
		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());

		// ===== 出庫帳票の更新実行 =====

		tPickingRBhv.queryUpdate(update, cb);
	}
}
