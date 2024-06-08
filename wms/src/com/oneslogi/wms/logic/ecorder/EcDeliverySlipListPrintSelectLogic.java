package com.oneslogi.wms.logic.ecorder;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.TEcOrderBCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderHCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderRCB;
import com.oneslogi.base.dbflute.exbhv.TEcOrderHBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderRBhv;
import com.oneslogi.base.dbflute.exentity.TEcOrderB;
import com.oneslogi.base.dbflute.exentity.TEcOrderH;
import com.oneslogi.base.dbflute.exentity.TEcOrderR;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.EcDeliverySlipListDto;
import com.oneslogi.wms.logic.common.ReportLogic;

/**
 * EC受注帳票印刷取得ロジッククラス
 */
public class EcDeliverySlipListPrintSelectLogic extends AbstractWmsLogic {

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (リソースクラスから移動) 2018.08.20 kawana Start

	// ===== 定数定義 =====

	/** 帳票CD - ECお買上明細 **/
	public static final String REPORT_CD = "EcDeliverySlipList";

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (リソースクラスから移動) 2018.08.20 kawana End

	// ===== 使用テーブル =====

	@Inject
	private TEcOrderHBhv tEcOrderHBhv;
	// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動に伴い楽天RMS受注のテーブル結合を削除 2015.05.18 kawana
	@Inject
	private TEcOrderRBhv tEcOrderRBhv;

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (リソースクラスから移動) 2018.08.20 kawana Start

	// ===== 使用ロジック =====

	@Inject
	private EcOrderMergeLogic mergeLogic;
	@Inject
	private ReportLogic reportLogic;

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (リソースクラスから移動) 2018.08.20 kawana End

	/**
	 * <h2>EC受注データを取得する。</h2>
	 * <pre>
	 * 引数の値を条件にデータベースからEC受注データを取得する。
	 * 検索対象が見つからない場合、０件エラーをエラー管理クラスに設定する。
	 * </pre>
	 * @param ecOrderR EC受注帳票：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TEcOrderH> EC受注ヘッダリスト
	 */
	public List<TEcOrderH> select(TEcOrderR ecOrderR, ErrorStatus errSts) {

		TEcOrderHCB cb = tEcOrderHBhv.newMyConditionBean();
		// テーブル結合
		cb.setupSelect_MCenter();
		cb.setupSelect_MClient();
		cb.setupSelect_MImportType();
		cb.setupSelect_TEcOrderRAsOne();
		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH();
		cb.setupSelect_TShippingInstH().withMDeliveryCourse();
		cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId();
		cb.query().queryTEcOrderRAsOne().setControlNo_Equal(ecOrderR.getControlNo());
		// ソート条件
		cb.query().queryMClient().addOrderBy_ClientCd_Asc();
		cb.query().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTShippingInstH().addOrderBy_WorkDt_Asc();
		cb.query().queryTShippingInstH().addOrderBy_PickingBatchNo_Asc();
		cb.query().queryTShippingInstH().addOrderBy_DeliveryCourseCd_Asc();
		cb.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().addOrderBy_PickingWorkNo_Asc();
		cb.query().addOrderBy_OrderNo_Asc();

		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana Start
		List<TEcOrderH> resultList = selectListToReport(tEcOrderHBhv, cb);
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana End

		if (resultList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return resultList;
		}
		tEcOrderHBhv.loadTEcOrderBList(resultList, new ConditionBeanSetupper<TEcOrderBCB>() {
			@Override
			public void setup(TEcOrderBCB cbBody) {
			}
			// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動に伴い楽天RMS受注のテーブル結合を削除 2015.05.18 kawana Start
		});
		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動に伴い楽天RMS受注のテーブル結合を削除 2015.05.18 kawana End

		return resultList;
	}

	/**
	 * <h2>EC受注帳票を更新する。</h2>
	 * <pre>
	 * 引数で受け取ったデータをEC受注帳票に更新する。
	 * </pre>
	 * @param update EC受注帳票(更新用)：全項目
	 * @param search EC受注帳票(検索用)：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void ecOrderRUpdate(TEcOrderR update, TEcOrderR search, ErrorStatus errSts) {
		// ===== EC受注帳票更新 =====

		// 更新条件作成
		TEcOrderRCB cb = tEcOrderRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(search.getControlNo());

		tEcOrderRBhv.queryUpdate(update, cb);
	}

	/**
	 * <h2>EC受注帳票を更新する。</h2>
	 * <pre>
	 * 引数で受け取ったデータをEC受注帳票に一括更新する。
	 * </pre>
	 * @param tEcOrderRList EC受注帳票リスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void ecOrderRBatchUpdate(List<TEcOrderR> tEcOrderRList, ErrorStatus errSts) {

		tEcOrderRBhv.batchUpdateNonstrict(tEcOrderRList);
	}

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (リソースクラスから移動) 2018.08.20 kawana Start

	/**
	 * <h2>ECお買上明細データ取得。</h2>
	 * <pre>
	 * 引数の値を条件にデータベースからEC受注データを取得する。
	 * 検索対象が見つからない場合、０件エラーをエラー管理クラスに設定する。
	 *
	 * 取得したデータをECお買上明細の帳票用Dtoに変換して返却する。
	 * </pre>
	 * @param ecOrderR EC受注帳票(更新用)
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<EcDeliverySlipListDto> ECお買上明細リストデータ取得用DTOリスト
	 * @throws UnsupportedEncodingException
	 */
	public List<EcDeliverySlipListDto> selectReportDtoList(TEcOrderR ecOrderR, ErrorStatus errSts) throws UnsupportedEncodingException {

		List<TEcOrderH> eccOrderHList = select(ecOrderR, errSts);
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 帳票出力データ作成処理
		// 処理済Map(受注番号単位)
		Map<String, Boolean> processedMap = new HashMap<String, Boolean>();
		List<EcDeliverySlipListDto> dataList = new ArrayList<EcDeliverySlipListDto>();

		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
		// 名寄せステータス=1の情報のマップ
		Map<String, TEcOrderH> mergeInfoMap = mergeLogic.createMergeInfoMapWithCheck(eccOrderHList, errSts);
		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		for (int i = 0; i < eccOrderHList.size(); i++) {
			TEcOrderH head = eccOrderHList.get(i);

			// 受注番号
			String orderNo = head.getOrderNo();

			// 既に処理済の場合はスキップ
			if (processedMap.get(orderNo) != null) {
				continue;
			}

			// お買い上げ明細データを追加
			addDeliverySlipData(head, dataList, mergeInfoMap);
			processedMap.put(orderNo, true);

			// 名寄せIDが入っている場合は同じ名寄せIDの受注番号を先に処理
			String mergeId = head.getMergeId();
			if (!CU.isNullOrEmpty(mergeId)) {

				for (int j = i + 1; j < eccOrderHList.size(); j++) {

					TEcOrderH subHead = eccOrderHList.get(j);
					// 名寄せID
					String subMergeId = subHead.getMergeId();

					if (CU.isNullOrEmpty(subMergeId)) {
						// 名寄せID設定なし スキップ
						continue;
					}

					if (!mergeId.equals(subMergeId)) {
						// 名寄せIDが違う スキップ
						continue;
					}

					// 受注番号
					String subOrderNo = subHead.getOrderNo();

					// 既に処理済の場合はスキップ
					if (processedMap.get(subOrderNo) != null) {
						continue;
					}

					// お買い上げ明細データを追加
					addDeliverySlipData(subHead, dataList, mergeInfoMap);
					processedMap.put(subOrderNo, true);
				}
			}
		}
		return dataList;
	}

	// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
	/**
	 * お買い上げ明細データを追加
	 *
	 * @param head 追加対象のEC受注ヘッダデータ
	 * @param dataList 追加先のお買い上げ明細データリスト
	 * @param mergeInfoMap 名寄せ情報マップ
	 * @throws UnsupportedEncodingException
	 */
	private void addDeliverySlipData(TEcOrderH head, List<EcDeliverySlipListDto> dataList, Map<String, TEcOrderH> mergeInfoMap) throws UnsupportedEncodingException {

		for (TEcOrderB body : head.getTEcOrderBList()) {

			EcDeliverySlipListDto redto;
			String pickingWorkNo = head.chaseTShippingInstH().chaseTAllocInstH().chaseTPickingH().getPickingWorkNo();
			// 名寄せステータス
			String mergeStatus = head.getMergeStatus();
			if (!CU.isNullOrEmpty(mergeStatus) && !mergeStatus.equals("0")) {
				// 名寄せあり

				// 名寄せ情報をヘッダにして出力データ作成
				TEcOrderH mergeInfo = mergeInfoMap.get(head.getMergeId());
				redto = createDeliverySlipData(mergeInfo, body, pickingWorkNo);
			} else {

				// 出力データ作成
				redto = createDeliverySlipData(head, body, pickingWorkNo);
			}
			dataList.add(redto);
		}
	}

	private EcDeliverySlipListDto createDeliverySlipData(TEcOrderH head, TEcOrderB body, String pickingWorkNo) throws UnsupportedEncodingException {
		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End
		EcDeliverySlipListDto redto = new EcDeliverySlipListDto();
		// 出庫作業No.の下５桁
		String pickingWorkNoLastFive = "";
		if (!CU.isNullOrEmpty(pickingWorkNo)) {
			if (pickingWorkNo.length() >= 5) {
				pickingWorkNoLastFive = pickingWorkNo.substring(pickingWorkNo.length() - 5, pickingWorkNo.length());
			} else {
				pickingWorkNoLastFive = pickingWorkNo;
			}
		} else {
			pickingWorkNoLastFive = "";
		}
		// [EC-CT1-161] 出庫作業Noの全桁のバーコードを追加するため、修正 2015.03.31 KYO Start
		// 出庫作業No.
		if (!CU.isNullOrEmpty(pickingWorkNo)) {
			redto.setPickingWorkNo(pickingWorkNo);
		} else {
			redto.setPickingWorkNo("");
		}
		// 出庫作業No.(下５桁)
		redto.setPickingWorkNoLastFive(pickingWorkNoLastFive);
		// [EC-CT1-161] 出庫作業Noの全桁のバーコードを追加するため、修正 2015.03.31 KYO End
		// 帳票ID
		redto.reportId = reportLogic.getReportId(REPORT_CD);
		// 帳票CD
		redto.reportCd = REPORT_CD;
		// ギフトフラグ
		redto.setGiftFlg(head.getGiftFlg());
		// 納品書タイトル
		if (head.chaseMImportType() != null) {
			redto.setStatementTitle(head.chaseMImportType().getStatementTitle());
		} else {
			redto.setStatementTitle("");
		}
		// 納品書記載URL
		if (head.chaseMImportType() != null) {
			redto.setStatementUrl(head.chaseMImportType().getStatementUrl());
		} else {
			redto.setStatementUrl("");
		}
		// 納品書記載URL
		if (head.chaseMImportType() != null) {
			redto.setGiftStatementType(head.chaseMImportType().getGiftStatementType());
		} else {
			redto.setGiftStatementType("");
		}
		// 納品書明細置換え文字列
		if (head.chaseMImportType() != null) {
			redto.setGiftStatementDetail(head.chaseMImportType().getGiftStatementDetail());
		} else {
			redto.setGiftStatementDetail("");
		}
		// 荷主名称
		redto.setClientNm(head.chaseMClient().getClientNm());
		// 注文日
		redto.setOrderDt(head.getOrderDt());
		// 受注番号
		redto.setOrderNo(head.getOrderNo());
		// 注文者名称
		redto.setOrderCustomerNm(head.getOrderCustomerNm());
		// 注文者郵便番号
		if (!CU.isNullOrEmpty(head.getOrderZipCd())) {
			StringBuilder strConvetOrder = new StringBuilder();
			if (head.getOrderZipCd().length() <= 3) {
				strConvetOrder.append(head.getOrderZipCd());
				redto.setOrderZipCd(strConvetOrder.toString());
			} else {
				strConvetOrder.append(head.getOrderZipCd().substring(0, 3));
				strConvetOrder.append("-");
				strConvetOrder.append(head.getOrderZipCd().substring(3, head.getOrderZipCd().length()));
				redto.setOrderZipCd(strConvetOrder.toString());
			}
		} else {
			redto.setOrderZipCd("");
		}
		// 注文者住所：都道府県
		redto.setOrderAddress1(head.getOrderAddress1());
		// 注文者住所：都市区
		redto.setOrderAddress2(head.getOrderAddress2());
		// 注文者住所：町以降
		redto.setOrderAddress3(head.getOrderAddress3());

		// 送付先名称
		redto.setDelivCustomerNm(head.getDelivCustomerNm());
		// 送付先郵便番号
		if (!CU.isNullOrEmpty(head.getDelivZipCd())) {
			StringBuilder strConvetDeliv = new StringBuilder();
			if (head.getDelivZipCd().length() <= 3) {
				strConvetDeliv.append(head.getDelivZipCd());
				redto.setDelivZipCd(strConvetDeliv.toString());
			} else {
				strConvetDeliv.append(head.getDelivZipCd().substring(0, 3));
				strConvetDeliv.append("-");
				strConvetDeliv.append(head.getDelivZipCd().substring(3, head.getDelivZipCd().length()));
				redto.setDelivZipCd(strConvetDeliv.toString());
			}
		} else {
			redto.setDelivZipCd("");
		}
		// 送付先住所：都道府県
		redto.setDelivAddress1(head.getDelivAddress1());
		// 送付先住所：都市区
		redto.setDelivAddress2(head.getDelivAddress2());
		// 送付先住所：町以降
		redto.setDelivAddress3(head.getDelivAddress3());

		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana Start
		// 決済方法
		redto.setPaymentMethod(head.getPaymentMethod());
		// クレジットカード種類
		redto.setCardType(head.getCardType());

		String productNm = CU.nullToStr(body.getProductNm());
		productNm = CU.replaceLineFeed(productNm, " ");
		if (productNm.getBytes("MS932").length <= 60) {
			// 商品名
			redto.setProductNm(productNm);
			redto.setProductNmLng("");
		} else {
			// 商品名(長い)
			redto.setProductNm("");
			redto.setProductNmLng(productNm);
		}
		// 商品番号
		redto.setProductNo(body.getProductCd());

		String productOption = CU.nullToStr(body.getProductOption());
		productOption = CU.replaceLineFeed(productOption, " ");
		if (productOption.getBytes("MS932").length <= 60) {
			// 項目・選択肢
			redto.setItemChoice(productOption);
			redto.setItemChoiceLng("");
		} else {
			// 項目・選択肢(長い)
			redto.setItemChoice("");
			redto.setItemChoiceLng(productOption);
		}
		// 個数
		if (body.getOrderNum() != null) {
			redto.setOrderNum(String.valueOf(body.getOrderNum()));
		} else {
			redto.setOrderNum("");
		}
		// 単価
		if (body.getUnitPrice() != null) {
			redto.setUnitPrice(String.valueOf(body.getUnitPrice()));
		} else {
			redto.setUnitPrice("");
		}
		// 小計
		if (body.getOrderNum() != null && body.getUnitPrice() != null) {
			redto.setSubTotal(String.valueOf(body.getUnitTotalPrice()));
		} else if (body.getOrderNum() != null || body.getUnitPrice() != null) {
			redto.setSubTotal("0");
		} else {
			redto.setSubTotal("");
		}
		// 合計
		if (head.getTotal() != null && 0 <= head.getTotal()) {
			redto.setTotal(String.valueOf(head.getTotal()));
		} else {
			redto.setTotal("");
		}
		// 消費税
		//[#4437] ECお買上明細 お買い上げ明細書の消費税表示不正 2018.04.17 fujiwara Start
		if (head.getTax() != null && 0 <= head.getTax()) {
			redto.setTax(String.valueOf(head.getTax()));
		} else {
			redto.setTax("");
		}
		//[#4437] ECお買上明細 お買い上げ明細書の消費税表示不正 2018.04.17 fujiwara End
		// 送料
		if (head.getCarriage() != null && 0 <= head.getCarriage()) {
			redto.setCarriage(String.valueOf(head.getCarriage()));
		} else {
			redto.setCarriage("");
		}
		// 代引料
		if (head.getCod() != null && 0 <= head.getCod()) {
			redto.setCod(String.valueOf(head.getCod()));
		} else {
			redto.setCod("");
		}
		// 合計金額
		if (head.getTotalAmount() != null && 0 <= head.getTotalAmount()) {
			redto.setTotalAmount(String.valueOf(head.getTotalAmount()));
		} else {
			redto.setTotalAmount("");
		}
		// クーポン利用額
		if (head.getCouponDiscount() != null) {
			Long couponUse = 0L - head.getCouponDiscount();
			redto.setCouponUse(String.valueOf(couponUse));
		} else {
			redto.setCouponUse("");
		}
		// ポイント利用額
		if (head.getPointDiscount() != null) {
			Long pointUse = 0L - head.getPointDiscount();
			redto.setPointUse(String.valueOf(pointUse));
		} else {
			redto.setPointUse("");
		}
		// [C-CWMS-0026] クーポン・ポイントの他で値引がある内容の追加 2015.05.18 kyo Start
		// その他値引額
		if (head.getOtherDiscount() != null) {
			Long otherDiscount = 0L - head.getOtherDiscount();
			redto.setOtherDiscount(String.valueOf(otherDiscount));
		} else {
			redto.setOtherDiscount("");
		}
		// [C-CWMS-0026] クーポン・ポイントの他で値引がある内容の追加 2015.05.18 kyo End
		// 請求金額
		if (head.getAmountBilled() != null && 0 <= head.getAmountBilled()) {
			redto.setAmountBilled(String.valueOf(head.getAmountBilled()));
		} else {
			redto.setAmountBilled("");
		}
		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動 2015.05.18 kawana End
		return redto;
	}

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (リソースクラスから移動) 2018.08.20 kawana End
}
