package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlDeliverySlipListPrintPmb;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.customize.SqlDeliverySlipListPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.DeliverySlipListDto;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.util.WRMT;

/**
 * 納品明細発行ロジッククラス
 */
public class DeliverySlipListPrintLogic extends AbstractWmsLogic {

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (リソースクラスから移動) 2018.08.20 kawana Start

	// ===== 定数定義 =====

	/** 帳票CD - 納品明細 **/
	public static final String REPORT_CD = "DeliverySlipList";

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (リソースクラスから移動) 2018.08.20 kawana End

	// ===== 使用テーブル =====

	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;
	// [#5894][v3.1] 納品明細を自動印刷すると同一納品先でも箱分発行される問題を修正 2019.01.16 kawana Start
	@Inject
	private TPackingHBhv tPackingHBhv;
	// [#5894][v3.1] 納品明細を自動印刷すると同一納品先でも箱分発行される問題を修正 2019.01.16 kawana End

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (リソースクラスから移動) 2018.08.20 kawana Start

	// ===== 使用ロジック =====

    // [ON推-品向-958] センタの電話番号を表示するように修正 2015.10.01 kawana Start
	@Inject
	private ClientCenterLogic clientCenterLogic;
    // [ON推-品向-958] センタの電話番号を表示するように修正 2015.10.01 kawana End

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (リソースクラスから移動) 2018.08.20 kawana End

	/**
	 * <h2>引当指示と出庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し納品明細書出力のデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return ListResultBean<SqlDeliverySlipListPrint> 納品明細リスト
	 */
	public ListResultBean<SqlDeliverySlipListPrint> select(TPickingR tPickingR,ErrorStatus errSts) {

		// ===== 納品明細データ取得 =====

		ListResultBean<SqlDeliverySlipListPrint> result = null;

		// 外出しSQLの定義
		String path = TPickingHBhv.PATH_selectSqlDeliverySlipListPrint;

		// 検索条件の設定
		SqlDeliverySlipListPrintPmb pmb = new SqlDeliverySlipListPrintPmb();
		pmb.setControlNo(tPickingR.getControlNo());

		// 検索実行
		Class<SqlDeliverySlipListPrint> entityType = SqlDeliverySlipListPrint.class;
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana Start
		result = selectListToReport(tPickingHBhv, path, pmb, entityType);
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana End

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
	 * @param report 出庫帳票：納品明細書出力フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateControlNo(TPickingR update, TPickingH tPickingH,TAllocInstH tAllocInstH,TPickingR report, ErrorStatus errSts) {

		List<TPickingR> result = null;
		// ===== 出庫帳票データ更新 =====

		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.setupSelect_TPickingH();
		cb.setupSelect_TPickingH().withTAllocInstH();
		cb.setupSelect_TPickingH().withTAllocInstH().withMCustomerBySupplyCustomerId();

		//検索条件
		cb.query().queryTPickingH().queryTAllocInstH().queryMCustomerBySupplyCustomerId().setDeliveryFlg_Equal_$1();
		cb.query().queryTPickingH().setClientId_Equal(tPickingH.getClientId());
		cb.query().queryTPickingH().setCenterId_Equal(tPickingH.getCenterId());
		cb.query().queryTPickingH().queryTAllocInstH().setShippingDt_Equal(tAllocInstH.getShippingDt());
		cb.query().queryTPickingH().queryTAllocInstH().setSupplyCustomerCd_Equal(tAllocInstH.getSupplyCustomerCd());
		cb.query().setPackingOutFlg_Equal(report.getPackingOutFlg());
		cb.query().queryTPickingH().queryMProcessType().setReceiveFlg_Equal_$0();
		cb.query().queryTPickingH().queryMProcessType().setShippingFlg_Equal_$1();
		cb.query().queryTPickingH().queryMProcessType().setStockAdjustFlg_Equal_$0();

		// [ON推-CT4-235] 納品明細書出力の検索条件内容を修正 2014.11.21 xiangy Start
		cb.query().queryTPickingH().queryTAllocInstH().existsTShippingInstHList(new SubQuery<TShippingInstHCB>() {
			 @Override
				public void query(TShippingInstHCB tShippingInstHCB) {
				 	tShippingInstHCB.query().existsTShippingInstBList(new SubQuery<TShippingInstBCB>() {
				 		@Override
				 		public void query(TShippingInstBCB tShippingInstBCB) {
				 		// [SK2-012] 全欠品以外のデータが出力できるように修正 2014/12/10 KI Start
				 		//	tShippingInstBCB.query().setStockOutFlg_Equal_$0();
				 		// [SK2-012] 全欠品以外のデータが出力できるように修正 2014/12/10 KI End
				 		}
				 	});

			 	}
			});
		// [ON推-CT4-235] 納品明細書出力の/検索条件を修正 2014.11.21 xiangy End

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

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (リソースクラスから移動) 2018.08.20 kawana Start

	/**
	 * <h2>納品明細書出力データ取得。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し納品明細書出力のデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 *
	 * 取得したデータを納品明細書の帳票用Dtoに変換して返却する。
	 * </pre>
	 * @param tPickingR 出庫帳票：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<DeliverySlipListDto> 納品明細リスト
	 */
	public List<DeliverySlipListDto> selectReportDtoList(TPickingR tPickingR, long centerId, long clientId, ErrorStatus errSts) {

		// [#6580][v3.1] 最大桁数のテスト用メソッドを追加 2019.07.10 kawana Start
		if (isReportMaxTest()) {
			return testMaxDtoList();
		}
		// [#6580][v3.1] 最大桁数のテスト用メソッドを追加 2019.07.10 kawana End

	    //納品明細発行データ取得メソッドを呼出し
	    ListResultBean<SqlDeliverySlipListPrint> tPickingHList = select(tPickingR, errSts);
	    if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// [ON推-品向-958] センタの電話番号を表示するように修正 2015.10.01 kawana Start
		// 自センタの情報を取得(荷主センタマスタ、取引先取得)
		MClientCenter clientCenterCondition = new MClientCenter();
		clientCenterCondition.setClientId(clientId);
		clientCenterCondition.setCenterId(centerId);
		MClientCenter mClientCenter = clientCenterLogic.getUkEntityWithCustomer(clientCenterCondition);

		String centerTelNo = "";
		if (mClientCenter != null) {
			centerTelNo = CU.nullToStr(mClientCenter.chaseMCustomer().getTelNo());
		}
		// [ON推-品向-958] センタの電話番号を表示するように修正 2015.10.01 kawana End

	    // 帳票出力データ取得処理
	    List<DeliverySlipListDto> dataList = new ArrayList<DeliverySlipListDto>();

	    for (SqlDeliverySlipListPrint head: tPickingHList) {
	    	DeliverySlipListDto redto = new DeliverySlipListDto();

		    redto.cultureId = getCultureId();
		    // ヘッダ部
		    //帳票CD
		    redto.reportCd = REPORT_CD;

		    //センタCD
		    redto.centerCd = head.getCenterCd();

		    //センタ名称
		    redto.centerNm = head.getCenterNm();

		    //荷主CD
		    redto.clientCd = head.getClientCd();

		    //荷主名称
		    redto.clientNm = head.getClientNm();

		    //出荷日
		    redto.shippingDt = head.getShippingDt();

		    //納品指定日
		    redto.delivDt = head.getDelivDt();

			//WMS出荷伝票No.
		    redto.shippingSlipNo = head.getShippingSlipNo();

			//顧客出荷指示No.
		    redto.clientShippingNo = head.getClientShippingNo();

			//商品CD
		    redto.productCd = head.getProductCd();

			//商品名称
		    redto.productNm = head.getProductNm();

			// [ON推-品向-958] センタの電話番号を表示するように修正 2015.10.01 kawana Start
			//電話番号
			redto.telNo = centerTelNo;
			// [ON推-品向-958] センタの電話番号を表示するように修正 2015.10.01 kawana End

			//ロット
		    redto.lot = head.getLot();

			//期限日
		    redto.limitDt = head.getLimitDt();

			//出庫数
		    redto.pickingNum = head.getPickingNum();

		    //納品先CD
		    redto.supplyCustomerCd = head.getSupplyCustomerCd();

		    //納品先名称
		    redto.supplyCustomerNm = head.getSupplyCustomerNm();

			// 発行フラグ
			redto.printFlg = head.getPackingOutFlg();

			// [EC-CT1-162] 出庫作業Noの全桁のバーコードを追加するため、追加 2015.03.31 KYO Start
			// 出庫作業No.の下５桁
			String pickingWorkNoLastFive = "";
			if (!CU.isNullOrEmpty(head.getPickingWorkNo())) {
				if (head.getPickingWorkNo().length() >= 5) {
					pickingWorkNoLastFive = head.getPickingWorkNo().substring(((head.getPickingWorkNo()).length() - 5), head.getPickingWorkNo().length());
				} else {
					pickingWorkNoLastFive = head.getPickingWorkNo();
				}
			} else {
				pickingWorkNoLastFive = "";
			}
			if (!CU.isNullOrEmpty(head.getPickingWorkNo())) {
				redto.setPickingWorkNo(head.getPickingWorkNo());
			} else {
				redto.pickingWorkNo = "";
			}
			if (!CU.isNullOrEmpty(pickingWorkNoLastFive)) {
				redto.setPickingWorkNoLastFive(pickingWorkNoLastFive);
			} else {
				redto.setPickingWorkNoLastFive("");
			}
			// [EC-CT1-162] 出庫作業Noの全桁のバーコードを追加するため、追加 2015.03.31 KYO End

			// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
			// [Ver3.0][#3677] 金額データ連携　小数を許容するように修正する 2018.02.14 shimizu Start
			// 合計金額
			if(head.getTotalPrice() != null){
				redto.totalPrice = head.getTotalPrice();

			}else{
				redto.totalPrice = BigDecimal.ZERO;
			}

			// 合計消費税
			if(head.getTotalTax() != null){
				redto.totalTax = head.getTotalTax();
			}else{
				redto.totalTax = BigDecimal.ZERO;
			}

			// 金額
			if(head.getPrice() != null){
				redto.price = head.getPrice();
			}else{
				redto.price = BigDecimal.ZERO;
			}

			// 消費税
			if(head.getTax() != null){
				redto.tax = head.getTax();
			}else{
				redto.tax = BigDecimal.ZERO;
			}
			// [Ver3.0][#3677] 金額データ連携　小数を許容するように修正する 2018.02.14 shimizu End

			// 出荷指示ボディID
			redto.shippingInstBId = head.getShippingInstBId();

			// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End

			dataList.add(redto);
		}

	    return dataList;
	}

	// [#5115][v3.1] 単行出荷検品 納品書自動発行対応 (リソースクラスから移動) 2018.08.20 kawana End

	// [#5894][v3.1] 納品明細を自動印刷すると同一納品先でも箱分発行される問題を修正 2019.01.16 kawana Start

	/**
	 * <h2>納品明細発行対象の判定.</h2>
	 * <pre>
	 * 引数の梱包ヘッダが納品明細の発行対象かを判定する。
	 * ・ピース梱包で出荷梱包No.が一番小さい箱の対象
	 * ・ケース梱包のみの出荷の場合はケース梱包の中で、出荷梱包No.が一番小さい箱が対象
	 * </pre>
	 * @param packingHId 梱包ヘッダID
	 * @return true:納品明細発行の対象
	 */
	public boolean isTargetPackingH(long packingHId) {

		// ===== 出庫ヘッダID取得 =====

		long pickingHId;
		{
			TPackingHCB cb = tPackingHBhv.newMyConditionBean();
			cb.specify().columnPickingHId();
			cb.query().setPackingHId_Equal(packingHId);

			pickingHId = tPackingHBhv.selectEntity(cb).getPickingHId();
		}

		// ===== 納品明細発行対象の梱包ヘッダID取得 =====

		TPackingHCB cb = tPackingHBhv.newMyConditionBean();
		cb.specify().columnPackingHId();
		cb.query().setPickingHId_Equal(pickingHId);

		// 1:混載が優先
		cb.query().addOrderBy_MixedFlg_Desc();
		// 出荷梱包No.の小さい順
		cb.query().addOrderBy_ShippingPackingNo_Asc();

		cb.fetchFirst(1);

		long targetPackingHId = tPackingHBhv.selectEntity(cb).getPackingHId();

		// ===== 判定 =====

		if (packingHId == targetPackingHId) {
			return true;
		}

		return false;
	}

	// [#5894][v3.1] 納品明細を自動印刷すると同一納品先でも箱分発行される問題を修正 2019.01.16 kawana End

	// [#6580][v3.1] 最大桁数のテスト用メソッドを追加 2019.07.10 kawana Start

	/**
	 * 最大桁、最大行数 印字テスト用リストの取得
	 */
	private List<DeliverySlipListDto> testMaxDtoList() {

		List<DeliverySlipListDto> dataList = new ArrayList<DeliverySlipListDto>();

		final Long cultureId = getCultureId();
		for (int i = 1; i < 100; i++) {

			DeliverySlipListDto redto = new DeliverySlipListDto();
			redto.cultureId = cultureId;
			//帳票CD
			redto.reportCd = REPORT_CD;
			//センタCD
			redto.centerCd = WRMT.centerCd();
			//センタ名称
			redto.centerNm = WRMT.centerAbbr();
			//荷主CD
			redto.clientCd = WRMT.clientCd();
			//荷主名称
			redto.clientNm = WRMT.clientAbbr();
			//出荷日
			redto.shippingDt = WRMT.date();
			//納品指定日
			redto.delivDt = WRMT.date();
			//WMS出荷伝票No.
			redto.shippingSlipNo = WRMT.wmsShippingSlipNo();
			//顧客出荷指示No.
			redto.clientShippingNo = WRMT.clientShippingNo();
			//商品CD
			redto.productCd = WRMT.productCd();
			//商品名称
			redto.productNm = WRMT.productAbbr();
			//電話番号
			redto.telNo = WRMT.telNo();
			//ロット
			redto.lot = WRMT.lot();
			//期限日
			redto.limitDt = WRMT.date();
			//出庫数
			redto.pickingNum = WRMT.stockNum();
			//納品先CD
			redto.supplyCustomerCd = WRMT.customerCd();
			//納品先名称
			redto.supplyCustomerNm = WRMT.customerAbbr();
			// 発行フラグ
			redto.printFlg = "1";
			// 出庫作業No.
			redto.pickingWorkNo = WRMT.pickingWorkNo();
			// 出庫作業No.の下５桁
			redto.pickingWorkNoLastFive = redto.pickingWorkNo.substring(((redto.pickingWorkNo).length() - 5), redto.pickingWorkNo.length());
			// 合計金額
			redto.totalPrice = WRMT.price();
			// 合計消費税
			redto.totalTax = WRMT.price();
			// 金額
			redto.price = WRMT.price();
			// 消費税
			redto.tax = WRMT.price();

			// 出荷指示ボディID (明細のグループ化で使用)
			if (i < 30) {
				// 30行まではロット・期限日違い

				redto.shippingInstBId = 1L;
			} else {
				// 31行からは1明細、1ロット

				redto.shippingInstBId = Long.valueOf(i);
			}

			dataList.add(redto);
		}

		return dataList;
	}

	// [#6580][v3.1] 最大桁数のテスト用メソッドを追加 2019.07.10 kawana End
}
