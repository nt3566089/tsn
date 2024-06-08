package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlBillOfLadingPrintPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlBillOfLadingPrintSubReportPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlMatchingUintnumListPmb;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.customize.SqlBillOfLadingPrint;
import com.oneslogi.base.dbflute.exentity.customize.SqlBillOfLadingPrintSelect;
import com.oneslogi.base.dbflute.exentity.customize.SqlBillOfLadingPrintSubReport;
import com.oneslogi.base.dbflute.exentity.customize.SqlMatchingUintnumList;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;

/**
 * 納品明細発行ロジッククラス
 */
public class BillOfLadingPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private NumberingCenterLogic numberingLogic;

	/**
	 * <h2>引当指示と出庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しBill of Lading出力のデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return ListResultBean<SqlDeliverySlipListPrint> 納品明細リスト
	 */
	public ListResultBean<SqlBillOfLadingPrint> select(TPickingR tPickingR,ErrorStatus errSts) {

		// ===== 納品明細データ取得 =====

		ListResultBean<SqlBillOfLadingPrint> result = null;

		// 外出しSQLの定義
		String path = TPickingHBhv.PATH_selectSqlBillOfLadingPrint;

		// 検索条件の設定
		SqlBillOfLadingPrintPmb pmb = new SqlBillOfLadingPrintPmb();
		pmb.setControlNo(tPickingR.getControlNo());

		// 検索実行
		Class<SqlBillOfLadingPrint> entityType = SqlBillOfLadingPrint.class;
		result = selectListToReport(tPickingHBhv, path, pmb, entityType);

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

	/**
	 * <h2>引当指示と出庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しBill of Lading出力のデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @param bolNo Bill of Lading Number
	 * @param errSts エラー時に設定するエラーステータス
	 * @return ListResultBean<SqlDeliverySlipListPrint> 納品明細リスト
	 */
	public ListResultBean<SqlBillOfLadingPrintSubReport> selectSubReportData(TPickingR tPickingR,String bolNo,ErrorStatus errSts) {

		// ===== 納品明細データ取得 =====

		ListResultBean<SqlBillOfLadingPrintSubReport> result = null;

		// 外出しSQLの定義
		String path = TPickingHBhv.PATH_selectSqlBillOfLadingPrintSubReport;

		// 検索条件の設定
		SqlBillOfLadingPrintSubReportPmb pmb = new SqlBillOfLadingPrintSubReportPmb();
		pmb.setControlNo(tPickingR.getControlNo());

		// 検索実行
		Class<SqlBillOfLadingPrintSubReport> entityType = SqlBillOfLadingPrintSubReport.class;
		pmb.setBolNo(bolNo);
		result = selectListToReport(tPickingHBhv, path, pmb, entityType);

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		return result;
	}

	/**
	 * <h2>マッチング変換。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しマッチング変換のデータを取得する。
	 * </pre>
	 * @param productID 商品ID
	 * @return ListResultBean<SqlMatchingUintnumList> マッチング変換のデータ
	 */
	public ListResultBean<SqlMatchingUintnumList> sqlMatchingUintnum(Long productId) {

		// ===== マッチング変換データ取得 =====

		ListResultBean<SqlMatchingUintnumList> result = null;

		// 外出しSQLの定義
		String path = TPickingHBhv.PATH_selectSqlMatchingUintnumList;

		// 検索条件の設定
		SqlMatchingUintnumListPmb pmb = new SqlMatchingUintnumListPmb();

		// 検索実行
		Class<SqlMatchingUintnumList> entityType = SqlMatchingUintnumList.class;
		pmb.setProductId(productId);
		result = selectListToReport(tPickingHBhv, path, pmb, entityType);

		return result;
	}

	/**
	 * <h2>発行取消。</h2>
	 * <pre>
	 * 引数を条件に出庫ヘッダと出庫帳票データを更新する。
	 * </pre>
	 * @param bolNoArryList bolNoList
	 */
	public void updateCancel(String[] bolNoArryList) {

		//bolNoList
		List<String> bolNoList = new ArrayList<String>();
		for (String bolNo : bolNoArryList) {
			bolNoList.add(bolNo);
		}

		// ===== 出庫帳票データを更新する =====
		TPickingRCB cbR = tPickingRBhv.newMyConditionBean();
		cbR.setupSelect_TPickingH();
		cbR.query().queryTPickingH().setBolNo_InScope(bolNoList);
		List<TPickingR> tPickingRList = tPickingRBhv.selectList(cbR);
		for (TPickingR tPickingR : tPickingRList) {
			//Bill of Lading出力フラグ
			tPickingR.setBolOutFlg(null);
			//Bill of Lading出力者ID
			tPickingR.setBolOutUserId(null);
			//Bill of Lading出力日時
			tPickingR.setBolOutDt(null);
		}

		tPickingRBhv.batchUpdate(tPickingRList);
		// ===== 出庫ヘッダを更新する =====
		TPickingHCB cb = tPickingHBhv.newMyConditionBean();
		cb.query().setBolNo_InScope(bolNoList);
		List<TPickingH> tPickingHList = tPickingHBhv.selectList(cb);
		for (TPickingH tPickingH : tPickingHList) {
			//Bill of Lading No.
			tPickingH.setBolNo(null);
		}
		tPickingHBhv.batchUpdate(tPickingHList);
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
	 * @param bodyList 明細部Entity：明細テータ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateControlNo(TPickingR update, List<String> bolNoList, ErrorStatus errSts) {

		List<TPickingR> result = null;
		// ===== 出庫帳票データ更新 =====

		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.setupSelect_TPickingH();
		cb.setupSelect_TPickingH().withTAllocInstH();
		cb.setupSelect_TPickingH().withTAllocInstH().withMCustomerBySupplyCustomerId();

		//検索条件
		cb.query().queryTPickingH().setBolNo_InScope(bolNoList);

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
	 * <h2>出庫ヘッダを更新する。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、出庫ヘッダの更新を実行する。
	 * </pre>
	 * @param dataList 帳票出力データ：全項目(更新用)
	 */
	public List<String> updateBolNo(List<String> bolNoList, List<String> workNoList, List<SqlBillOfLadingPrintSelect> dataList) {

		String bolNo = "";
		String prePickingWorkNo = "";
		String preShippingDt = "";
		String preDeliveryCourseCd = "";
		String delivCustomerCd = "";
		// ===== 出庫ヘッダの更新データ更新 =====
		for (SqlBillOfLadingPrintSelect dto: dataList) {
			if (dto.getBolOutFlg()== null || dto.getBolOutFlg().equals("0") ) {
				if (!preShippingDt.equals(dto.getShippingDt()) || !preDeliveryCourseCd.equals(dto.getDeliveryCourseCd()) || !delivCustomerCd.equals(dto.getDelivCustomerCd())) {
					bolNo = numberingLogic.getNumbering(WmsNumberingConst.BOL_NO);
					bolNoList.add(bolNo);
				}
				preShippingDt = dto.getShippingDt();
				preDeliveryCourseCd = dto.getDeliveryCourseCd();
				delivCustomerCd = dto.getDelivCustomerCd();
				// [#5580][v3.1]FindBugsの警告対応 (Stringの==比較) 2019.01.31 kawana Start
				if (!prePickingWorkNo.equals(dto.getPickingWorkNo())) {
					// [#5580][v3.1]FindBugsの警告対応 (Stringの==比較) 2019.01.31 kawana End

					prePickingWorkNo = dto.getPickingWorkNo();
					// 更新条件作成
					TPickingHCB cb = tPickingHBhv.newMyConditionBean();
					cb.setupSelect_TPickingRAsOne();
					cb.setupSelect_TAllocInstH();
					cb.setupSelect_TAllocInstH().withMDeliveryCourse();
					cb.query().setPickingWorkNo_InScope(workNoList);
					cb.query().setBolNo_IsNullOrEmpty();
					cb.query().queryTAllocInstH().setShippingDt_Equal(dto.getShippingDt());
					cb.query().queryTAllocInstH().queryMDeliveryCourse().setDeliveryCourseCd_Equal(dto.getDeliveryCourseCd());
					cb.query().queryTAllocInstH().setDelivCustomerCd_Equal(dto.getDelivCustomerCd());

					//Bill of Lading No.値設定
					TPickingH tPickingH = new TPickingH();
					tPickingH.setBolNo(bolNo);

					// ===== 出庫帳票の更新実行 =====
					tPickingHBhv.queryUpdate(tPickingH, cb);
				}
			}
		}
		return bolNoList;
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
