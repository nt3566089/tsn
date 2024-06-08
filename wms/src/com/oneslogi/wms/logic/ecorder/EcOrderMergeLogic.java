package com.oneslogi.wms.logic.ecorder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oneslogi.base.dbflute.exentity.TEcOrderH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * EC受注データ名寄せロジッククラス
 */
public class EcOrderMergeLogic extends AbstractWmsLogic {

	// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
	/**
	 * <h2>名寄せ情報を作成する。</h2>
	 * <pre>
	 * 名寄せステータス=1（名寄せ有）のデータで名寄せ情報を作成する。
	 * 名寄せ情報の合計金額、送料などに名寄せした合計金額、送料などを設定する。
	 * また、下記の場合はエラーをエラー管理クラスに設定する。
	 * ・同梱する商品の出庫作業No.が異なる
	 * ・同梱する商品の合計金額が異なる
	 * </pre>
	 * @param eccOrderHList EC受注ヘッダリスト：受注番号・名寄せステータス手・名寄せID・合計・出庫作業No.　　　全項目
	 * @param errorStatus エラー時に設定するエラーステータス
	 * @return Map<String, TEcOrderH> 名寄せ情報マップ
	 */
	public Map<String, TEcOrderH> createMergeInfoMapWithCheck(List<TEcOrderH> eccOrderHList, ErrorStatus errorStatus) {

		Map<String, TEcOrderH> mergeInfoMap = new HashMap<String, TEcOrderH>();
		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End

		// 名寄せ合計商品金額のマップ
		Map<String, Long> checkTotalMap = new HashMap<String, Long>();
		// 出庫作業No.のマップ
		Map<String, String> checkWorkNoMap = new HashMap<String, String>();

		// 計算済チェック(受注番号単位)
		Map<String, Boolean> processedOrderNo = new HashMap<String, Boolean>();

		for (TEcOrderH head : eccOrderHList) {

			// 受注番号
			String orderNo = head.getOrderNo();
			if (processedOrderNo.containsKey(orderNo)) {
				// 処理済み スキップ
				continue;
			}
			processedOrderNo.put(orderNo, true);

			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
			// 名寄せステータス
			String mergeStatus = head.getMergeStatus();
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End
			if (CU.isNullOrEmpty(mergeStatus)) {
				// 名寄せなし スキップ
				continue;
			}

			if (mergeStatus.equals("0")) {
				// 名寄せなし スキップ
				continue;
			}

			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
			// 名寄せID
			String mergeId = head.getMergeId();
			// 商品合計
			long productTotal = CU.nullToZero(head.getTotal());
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End

			// 商品合計金額に加算
			if (checkTotalMap.containsKey(mergeId)) {

				Long total = checkTotalMap.get(mergeId);
				checkTotalMap.put(mergeId, (total + productTotal));
			} else {

				checkTotalMap.put(mergeId, productTotal);
			}

			// 出庫作業No.
			String pickingWorkNo = head.chaseTShippingInstH().chaseTAllocInstH().chaseTPickingH().getPickingWorkNo();
			// 出庫作業Noチェック
			if (pickingWorkNo == null) {
				// エラーを登録して処理終了
				getErrorManager().add(errorStatus, WmsMessageConst.EC_ORDER_CANNOT_STATEMENT_OUT_DIFFERENT_PICKING_WORK_NO_ERROR, mergeId);
				return null;
			}
			String checkWorkNo = checkWorkNoMap.get(mergeId);
			if (checkWorkNo == null) {
				// 追加
				checkWorkNoMap.put(mergeId, pickingWorkNo);
			} else {
				if (!checkWorkNo.equals(pickingWorkNo)) {
					// 出庫作業Noが違うためエラー
					getErrorManager().add(errorStatus, WmsMessageConst.EC_ORDER_CANNOT_STATEMENT_OUT_DIFFERENT_PICKING_WORK_NO_ERROR, mergeId);
					return null;
				}
			}

			// 名寄せステータス = 1 の場合はマップに保存 (代表データ)
			if (mergeStatus.equals("1")) {
				if (!mergeInfoMap.containsKey(mergeId)) {

					// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
					mergeInfoMap.put(mergeId, head);
					// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End
				}
			}
		}

		// 金額チェック
		for (Map.Entry<String, Long> checkEntry : checkTotalMap.entrySet()) {

			// 名寄せID
			String mergeId = checkEntry.getKey();
			// 商品合計
			long checkProductTotal = checkEntry.getValue();

			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
			// 名寄せ情報
			TEcOrderH mergeInfo = mergeInfoMap.get(mergeId);
			if (mergeInfo == null) {
				// 代表のデータなし エラー

				getErrorManager().add(errorStatus, WmsMessageConst.EC_ORDER_CANNOT_STATEMENT_OUT_TOTAL_UNMATCH_ERROR, mergeId);
				return null;
			}

			// 名寄せ情報の商品合計
			long productTotal = CU.nullToZero(mergeInfo.getMergeTotal());

			// 金額チェック
			if (checkProductTotal != productTotal) {
				// 名寄せ金額の合計があっていないためエラー

				getErrorManager().add(errorStatus, WmsMessageConst.EC_ORDER_CANNOT_STATEMENT_OUT_TOTAL_UNMATCH_ERROR, mergeId);
				return null;
			}

			// ===== 名寄せ情報の詰め替え =====
			// 商品合計
			long mergeProductTotal = CU.nullToZero(mergeInfo.getMergeTotal());
			mergeInfo.setTotal(mergeProductTotal);
			// 消費税
			Long mergeTax = mergeInfo.getMergeTax();
			mergeInfo.setTax(mergeTax);
			// 送料
			Long mergeCarriage = mergeInfo.getMergeCarriage();
			mergeInfo.setCarriage(mergeCarriage);
			// 代引き手数料
			Long mergeCod = mergeInfo.getMergeCod();
			mergeInfo.setCod(mergeCod);
			// 総合計
			Long mergeAmount = mergeInfo.getMergeTotalAmount();
			mergeInfo.setTotalAmount(mergeAmount);
			// ポイント利用額
			Long mergePoint = mergeInfo.getMergePointDiscount();
			mergeInfo.setPointDiscount(mergePoint);
			// クーポン利用額
			Long mergeCoupon = mergeInfo.getMergeCouponDiscount();
			mergeInfo.setCouponDiscount(mergeCoupon);
			// [C-CWMS-0026] クーポン・ポイントの他で値引がある内容の追加 2015.05.19 kyo Start
			Long mergeOther = mergeInfo.getMergeOtherDiscount();
			mergeInfo.setOtherDiscount(mergeOther);
			// [C-CWMS-0026] クーポン・ポイントの他で値引がある内容の追加 2015.05.19 kyo End
			// 請求金額
			Long mergeBilled = mergeInfo.getMergeAmountBilled();
			mergeInfo.setAmountBilled(mergeBilled);
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End
		}

		return mergeInfoMap;
	}
}
