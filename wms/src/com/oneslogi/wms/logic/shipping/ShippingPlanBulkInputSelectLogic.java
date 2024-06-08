package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlEShippingInstListPmb;
import com.oneslogi.base.dbflute.cbean.EShippingInstCB;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dbflute.dto.TShippingInstSpareDto;
import com.oneslogi.base.dbflute.dto.customize.SqlEShippingInstListDto;
import com.oneslogi.base.dbflute.exbhv.EShippingInstBhv;
import com.oneslogi.base.dbflute.exentity.EShippingInst;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.util.WCU;

/**
 * 出荷指示一括取込データ取得ロジッククラス
 */
public class ShippingPlanBulkInputSelectLogic extends AbstractWmsLogic {

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.27 honma start

	// ===== 使用テーブル =====
	@Inject
	private EShippingInstBhv eShippingInstBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterClassLogic centerClassLogic;
	@Inject
	private CenterLogic centerLogic;

	// ===== enum =====
	/** エラーデータ検索区分 */
	public enum SelectCls {
		/** 全て検索 */
		ALL,
		/** エラーデータのみ検索 */
		ERROR_ONLY,
		/** エラー無データのみ検索 */
		NO_ERROR_ONLY
	}

	// [#6743][v3.1] 未使用になったメソッドの削除 (checkExcelCellInput、dateRegExp) 2019.10.31 kawana delete

	/**
	 *<h2>日付を「yyyy/MM/dd」形式へ変換する。</h2>
	 * <pre>
	 * 次の形式の日付文字列に対応
	 * yyyyMMdd
	 * </pre>
	 * @return String yyyy/MM/ddに変換した文字列
	 * */
	private String formatDate(String dateTime) {
		if (CU.isNullOrEmpty(dateTime)) {
			return dateTime;
		}
		// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana Start
		if (!WCU.checkDateStr(dateTime)) {
			// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana End
			return dateTime;
		}

		SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy/MM/dd");
		String sfstr = "";
		try {
			sfstr = sf2.format(sf1.parse(dateTime));
		} catch (Exception e) {

		}
		return sfstr;
	}

	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
	private static class ClientShippingNoKey {
		String clientShippingNo;
		String customerCd;
		String delivPlanDt;
		String emergencyFlg;
		String processTypeCd;

		ClientShippingNoKey(String clientShippingNo, String customerCd, String delivPlanDt, String emergencyFlg, String processTypeCd) {
			this.clientShippingNo = clientShippingNo;
			this.customerCd = customerCd;
			this.delivPlanDt = delivPlanDt;
			this.emergencyFlg = emergencyFlg;
			this.processTypeCd = processTypeCd;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((clientShippingNo == null) ? 0 : clientShippingNo.hashCode());
			result = prime * result + ((customerCd == null) ? 0 : customerCd.hashCode());
			result = prime * result + ((delivPlanDt == null) ? 0 : delivPlanDt.hashCode());
			result = prime * result + ((emergencyFlg == null) ? 0 : emergencyFlg.hashCode());
			result = prime * result + ((processTypeCd == null) ? 0 : processTypeCd.hashCode());
			return result;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ClientShippingNoKey other = (ClientShippingNoKey) obj;
			if (clientShippingNo == null) {
				if (other.clientShippingNo != null)
					return false;
			} else if (!clientShippingNo.equals(other.clientShippingNo))
				return false;
			if (customerCd == null) {
				if (other.customerCd != null)
					return false;
			} else if (!customerCd.equals(other.customerCd))
				return false;
			if (delivPlanDt == null) {
				if (other.delivPlanDt != null)
					return false;
			} else if (!delivPlanDt.equals(other.delivPlanDt))
				return false;
			if (emergencyFlg == null) {
				if (other.emergencyFlg != null)
					return false;
			} else if (!emergencyFlg.equals(other.emergencyFlg))
				return false;
			if (processTypeCd == null) {
				if (other.processTypeCd != null)
					return false;
			} else if (!processTypeCd.equals(other.processTypeCd))
				return false;
			return true;
		}
	}

	/**
	 * <h2>取込出荷指示ヘッダ件数取得<h2>
	 * <pre>
	 * 取込出荷指示データリストから、取込出荷指示ヘッダ件数を取得する。
	 * </pre>
	 * @param eShippingInstList 取込出荷指示データリスト
	 * @param cls エラー検索区分
	 * @return 取込出荷指示ヘッダ件数
	 */
	public int getEShippingInstHeader(List<EShippingInst> eShippingInstList, SelectCls cls) {
		int count = 0;
		String errorFlg = null;

		switch (cls) {
		case ALL:
		default:
			break;
		case ERROR_ONLY:
			errorFlg = "1";
			break;
		case NO_ERROR_ONLY:
			errorFlg = "0";
			break;
		}

		// 出荷指示ヘッダ用Map
		Map<ClientShippingNoKey, String> clientShippingNoMap = new HashMap<ClientShippingNoKey, String>();

		// 件数分ループ
		for (EShippingInst eShippingInst : eShippingInstList) {
			// 顧客出荷指示No, 納品先CD, 納品予定日, 緊急フラグ, 処理区分CDでキーを作成
			String clientShippingNo = eShippingInst.getClientShippingNo();
			String customerCd = eShippingInst.getSupplyCustomerCd();
			String delivPlanDt = eShippingInst.getDelivPlanDt();
			String emergencyFlg = eShippingInst.getEmergencyFlg();
			String processTypeCd = eShippingInst.getProcessTypeCd();
			String shippingInstErrorFlg = eShippingInst.getErrorFlg();
			ClientShippingNoKey clientShippingNoKey = new ClientShippingNoKey(clientShippingNo, customerCd, delivPlanDt, emergencyFlg, processTypeCd);

			if (!clientShippingNoMap.containsKey(clientShippingNoKey)) {
				// ヘッダ未作成

				// 取込出荷指示ヘッダ件数カウント
				switch (cls) {
				case ALL:
				default:
					count++;
					clientShippingNoMap.put(clientShippingNoKey, shippingInstErrorFlg);
					break;
				case ERROR_ONLY:
				case NO_ERROR_ONLY:
					if (errorFlg.equals(shippingInstErrorFlg)) {
						count++;
						clientShippingNoMap.put(clientShippingNoKey, shippingInstErrorFlg);
					}
					break;
				}
			}
		}

		return count;
	}
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.09.27 honma add start
	/**
	 * <h2>ファイル取込データから出荷指示受信テーブルのエンティティに変換.</h2>
	 * @param receiveCd 設定する受信CD
	 * @param mCenter センタマスタ
	 * @param mClient 荷主マスタ
	 * @param shippingInstList 取込出荷指示リスト
	 * @return 出荷指示受信テーブルのリスト
	 */
	public List<EShippingInst> convertEShippingInst(String receiveCd, MCenter mCenter, MClient mClient, List<TShippingInstBDto> shippingInstList) {

		List<EShippingInst> eShippingInstList = new ArrayList<>();

		// 一覧件数分ループ
		for (int row = 0; row < shippingInstList.size(); row++) {

			// [#5662][v3.1] 緊急フラグの「9」を取込と空になってしまう問題を修正 2018.11.21 kawana Start
			// [#380][2.1.0-CT-075] 納品先CD、届先CDはファイル内容のまま登録 2016.12.06 kawana Start
			TShippingInstBDto data = shippingInstList.get(row);
			// [#380][2.1.0-CT-075] 納品先CD、届先CDはファイル内容のまま登録 2016.12.06 kawana End
			// [#5662][v3.1] 緊急フラグの「9」を取込と空になってしまう問題を修正 2018.11.21 kawana End
			//出荷指示受信テーブル
			EShippingInst eShippingInst = new EShippingInst();
			eShippingInst.setCenterCd(mCenter.getCenterCd());
			eShippingInst.setClientCd(mClient.getClientCd());
			eShippingInst.setReceiveRowId(Long.valueOf(row) + 1);
			eShippingInst.setReceiveCd(receiveCd);
			eShippingInst.setImportFlg("0");
			eShippingInst.setErrorFlg("0");
			eShippingInst.setDelFlg_$0();
			//緊急フラグ
			String emergencyFlg = data.getTShippingInstH().getEmergencyFlg();
			eShippingInst.setEmergencyFlg(emergencyFlg);
			//顧客出荷指示No.
			String clientShippingNo = data.getTShippingInstH().getClientShippingNo();
			eShippingInst.setClientShippingNo(clientShippingNo);
			// [#5662][v3.1] 緊急フラグの「9」を取込と空になってしまう問題を修正 2018.11.21 kawana Start
			// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana Start
			// [#380][2.1.0-CT-075] 納品先CD、届先CDはファイル内容のまま登録 2016.12.06 kawana Start
			if (data.getTShippingInstH().getMCustomerBySupplyCustomerId() != null) {
				//納品先CD
				eShippingInst.setSupplyCustomerCd(data.getTShippingInstH().getMCustomerBySupplyCustomerId().getCustomerCd());
				//納品先名称
				eShippingInst.setSupplyCustomerNm(data.getTShippingInstH().getMCustomerBySupplyCustomerId().getCustomerNm());
			}
			// [#380][2.1.0-CT-075] 納品先CD、届先CDはファイル内容のまま登録 2016.12.06 kawana End
			// [#5662][v3.1] 緊急フラグの「9」を取込と空になってしまう問題を修正 2018.11.21 kawana End
			//処理区分CD
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
			String processTypeCd = data.getTShippingInstH().getMProcessType().getProcessTypeCd();
			eShippingInst.setProcessTypeCd(processTypeCd);
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
			//納品予定日
			String delivPlanDt = CU.isNullOrEmpty(data.getTShippingInstH().getDelivPlanDt()) ? "" : data.getTShippingInstH().getDelivPlanDt().replaceAll("/", "");
			eShippingInst.setDelivPlanDt(delivPlanDt);
			//作業日
			String workDt = CU.isNullOrEmpty(data.getTShippingInstH().getWorkDt()) ? "" : data.getTShippingInstH().getWorkDt().replaceAll("/", "");
			eShippingInst.setWorkDt(workDt);
			//出荷日
			String shippingDt = CU.isNullOrEmpty(data.getTShippingInstH().getShippingDt()) ? "" : data.getTShippingInstH().getShippingDt().replaceAll("/", "");
			eShippingInst.setShippingDt(shippingDt);
			//配送コースCD
			String deliveryCourseCd = data.getTShippingInstH().getMDeliveryCourse().getDeliveryCourseCd();
			eShippingInst.setDeliveryCourseCd(deliveryCourseCd);
			//納品指定日
			String delivDt = CU.isNullOrEmpty(data.getTShippingInstH().getDelivDt()) ? "" : data.getTShippingInstH().getDelivDt().replaceAll("/", "");
			eShippingInst.setDelivDt(delivDt);
			//納品時間帯
			String delivTz = data.getTShippingInstH().getDelivTz();
			eShippingInst.setDelivTz(delivTz);
			//商品CD
			String productCd = data.getMProduct().getProductCd();
			eShippingInst.setProductCd(productCd);
			//商品名称
			String productNm = data.getMProduct().getProductNm();
			eShippingInst.setProductNm(productNm);
			//預託CD
			String depositCd = data.getDepositCd();
			eShippingInst.setDepositCd(depositCd);
			//在庫区分CD
			String stockTypeCd = data.getStockTypeCd();
			eShippingInst.setStockTypeCd(stockTypeCd);
			//指示数
			String instNum = (data.getInstNum() == null) ? "" : CU.convertNumberToString(data.getInstNum());
			eShippingInst.setInstNum(instNum);
			//指定ロット
			String lot = data.getLot();
			eShippingInst.setLot(lot);
			//指定期限日
			String limitDt = CU.isNullOrEmpty(data.getLimitDt()) ? "" : data.getLimitDt().replaceAll("/", "");
			eShippingInst.setLimitDt(limitDt);
			//指定倉庫CD
			String warehouseCd = data.getWarehouseCd();
			eShippingInst.setWarehouseCd(warehouseCd);
			//指定ロケーションCD
			String locationCd = data.getLocationCd();
			eShippingInst.setLocationCd(locationCd);
			// [#380][2.1.0-CT-075] 納品先CD、届先CDはファイル内容のまま登録 2016.12.06 kawana Start
			//届先CD
			eShippingInst.setDelivCustomerCd(data.getTShippingInstH().getDelivCustomerCd());
			// [#380][2.1.0-CT-075] 納品先CD、届先CDはファイル内容のまま登録 2016.12.06 kawana End
			//届先名称
			String delivCustomerNm = data.getTShippingInstH().getDelivCustomerNm();
			eShippingInst.setDelivCustomerNm(delivCustomerNm);
			//届先郵便番号
			String delivZipCd = data.getTShippingInstH().getDelivZipCd();
			eShippingInst.setDelivZipCd(delivZipCd);
			//届先住所1
			String delivAddress1 = data.getTShippingInstH().getDelivAddress1();
			eShippingInst.setDelivAddress1(delivAddress1);
			//届先住所2
			String delivAddress2 = data.getTShippingInstH().getDelivAddress2();
			eShippingInst.setDelivAddress2(delivAddress2);
			//届先住所3
			String delivAddress3 = data.getTShippingInstH().getDelivAddress3();
			eShippingInst.setDelivAddress3(delivAddress3);
			//届先電話番号
			String delivTelNo = data.getTShippingInstH().getDelivTelNo();
			eShippingInst.setDelivTelNo(delivTelNo);
			//届先住所補足
			String delivAddressSupply = data.getTShippingInstH().getDelivAddressSupply();
			eShippingInst.setDelivAddressSupply(delivAddressSupply);
			// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana End
			//出庫作業メッセージ
			String pickingWorkMessage = data.getTShippingInstH().getPickingWorkMessage();
			eShippingInst.setPickingWorkMessage(pickingWorkMessage);

            // [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
			//合計金額
			String totalPrice = (data.getTShippingInstH().getTotalPrice() == null) ? "" : CU.convertNumberToString(data.getTShippingInstH().getTotalPrice());
			eShippingInst.setTotalPrice(totalPrice);
			//合計消費税
			String totalTax = (data.getTShippingInstH().getTotalTax() == null) ? "" : CU.convertNumberToString(data.getTShippingInstH().getTotalTax());
			eShippingInst.setTotalTax(totalTax);
			//単価
			String unitPrice = (data.getUnitPrice() == null) ? "" : CU.convertNumberToString(data.getUnitPrice());
			eShippingInst.setUnitPrice(unitPrice);
			//金額
			String price = (data.getPrice() == null) ? "" : CU.convertNumberToString(data.getPrice());
			eShippingInst.setPrice(price);
			//消費税
			String tax = (data.getTax() == null) ? "" : CU.convertNumberToString(data.getTax());
			eShippingInst.setTax(tax);

            // [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End

			// [#2253]予備項目対応 2017.08.18 sampei Start
			//予備項目１（文字列）
			eShippingInst.setSpareStr1(data.getTShippingInstSpareAsOne().getSpareStr1());
			//予備項目２（文字列）
			eShippingInst.setSpareStr2(data.getTShippingInstSpareAsOne().getSpareStr2());
			//予備項目３（文字列）
			eShippingInst.setSpareStr3(data.getTShippingInstSpareAsOne().getSpareStr3());

			//予備項目１（数値）
			BigDecimal spareNum1 = null;
			if (data.getTShippingInstSpareAsOne().getSpareNum1() != null) {
				spareNum1 = data.getTShippingInstSpareAsOne().getSpareNum1();
			}
			eShippingInst.setSpareNum1((spareNum1 == null) ? null : CU.convertNumberToString(spareNum1));

			//予備項目２（数値）
			BigDecimal spareNum2 = null;
			if (data.getTShippingInstSpareAsOne().getSpareNum2() != null) {
				spareNum2 = data.getTShippingInstSpareAsOne().getSpareNum2();
			}
			eShippingInst.setSpareNum2((spareNum2 == null) ? null : CU.convertNumberToString(spareNum2));

			//予備項目３（数値）
			BigDecimal spareNum3 = null;
			if (data.getTShippingInstSpareAsOne().getSpareNum3() != null) {
				spareNum3 = data.getTShippingInstSpareAsOne().getSpareNum3();
			}
			eShippingInst.setSpareNum3((spareNum3 == null) ? null : CU.convertNumberToString(spareNum3));
			// [#2253]予備項目対応 2017.08.18 sampei End


			eShippingInstList.add(eShippingInst);
		}
		return eShippingInstList;

	}

	/**
	 * <h2>出荷予定受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @return 検索結果のリスト
	 */
	public List<EShippingInst> selectEShippingInstList(String receiveCd) {

		EShippingInstCB cb = eShippingInstBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().setReceiveCd_Equal(receiveCd);
		cb.query().addOrderBy_ReceiveRowId_Asc();

		return eShippingInstBhv.selectList(cb);
	}

	// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Add Start
	/**
	 * <h2>出荷予定受信テーブル検索.</h2>
	 * @param receiveCd 受信CD
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<EShippingInst> selectEShippingInstList(String receiveCd, SelectCls cls) {

		EShippingInstCB cb = eShippingInstBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().setReceiveCd_Equal(receiveCd);

		switch (cls) {
		case ALL:
		default:
			break;
		case ERROR_ONLY:
			cb.query().setErrorFlg_Equal("1");
			break;
		case NO_ERROR_ONLY:
			cb.query().setErrorFlg_Equal("0");
			break;
		}

		cb.query().addOrderBy_ReceiveRowId_Asc();

		return eShippingInstBhv.selectList(cb);
	}
	// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Add End

	/**
	 * <h2>出荷予定受信テーブル検索(出荷予定ボディDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<TShippingInstBDto> selectAndConvertEShippingInstList(String receiveCd, String centerCd, String clientCd, SelectCls cls) {
		return selectAndConvertEShippingInstList(receiveCd, centerCd, clientCd, null, cls);
	}

	/**
	 * <h2>出荷予定受信テーブル検索(出荷予定ボディDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param paging ページング設定
	 * @param cls エラー検索区分
	 * @return 検索結果の出荷指示ヘッダデータリスト
	 */
	public List<TShippingInstBDto> selectAndConvertEShippingInstList(String receiveCd, String centerCd, String clientCd, PagingData paging, SelectCls cls) {

		List<TShippingInstBDto> shippingInstPlan = null;

		// センタIDの取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		long centerId = centerLogic.getUkEntityWithDeletedCheck(mCenter).getCenterId();
		//緊急フラグ Map
		Map<String, String> emergencyFlgMap = centerClassLogic.getClassMapByCd("EMERGENCY_FLG");

		//納品時間帯 Map
		Map<String, String> delivTzMap = centerClassLogic.getClassMapByCd("DELIV_TZ");

		// 外出しSQLの定義
		String path = EShippingInstBhv.PATH_selectSqlEShippingInstList;

		BsSqlEShippingInstListPmb pmb = new BsSqlEShippingInstListPmb();
		pmb.setClientCd(clientCd);
		pmb.setCenterCd(centerCd);
		pmb.setCenterId(centerId);
		pmb.setReceiveCd(receiveCd);

		switch (cls) {
		case ALL:
		default:
			break;
		case ERROR_ONLY:
			pmb.setErrorFlg("1");
			break;
		case NO_ERROR_ONLY:
			pmb.setErrorFlg("0");
			break;
		}

		pmb.setImportFlg("0");

		pmb.setCultureId(getCultureId());

		Class<SqlEShippingInstListDto> entityType = SqlEShippingInstListDto.class;
		List<SqlEShippingInstListDto> sqlDtoList;
		if (paging != null) {
			sqlDtoList = super.selectPage(eShippingInstBhv, path, pmb, entityType, paging);
		} else {
			sqlDtoList = super.selectList(eShippingInstBhv, path, pmb, entityType);
		}

		shippingInstPlan = new ArrayList<>();
		for (SqlEShippingInstListDto sqlDto : sqlDtoList) {
			TShippingInstBDto shippingInstBDto = new TShippingInstBDto();
			shippingInstBDto.setLineNo(sqlDto.getReceiveRowId());
			shippingInstBDto.setShippingInstReceiveId(sqlDto.getShippingInstId());
			shippingInstBDto.setErrorMessageNm(sqlDto.getMessageNm());
			TShippingInstHDto shippingInstHDto = new TShippingInstHDto();
			shippingInstHDto.setEmergencyFlg(sqlDto.getEmergencyFlg());
			if (!CU.isNullOrEmpty(sqlDto.getEmergencyFlg()) && emergencyFlgMap.containsKey(sqlDto.getEmergencyFlg())) {
				shippingInstHDto.setEmergencyFlgNm(sqlDto.getEmergencyFlg() + ":" + emergencyFlgMap.get(sqlDto.getEmergencyFlg()));
			} else {
				shippingInstHDto.setEmergencyFlgNm(sqlDto.getEmergencyFlg());
			}
			shippingInstHDto.setClientShippingNo(sqlDto.getClientShippingNo());
			shippingInstBDto.setTShippingInstH(shippingInstHDto);

			MCustomerDto mCustomerBySupplyCustomerId = new MCustomerDto();
			mCustomerBySupplyCustomerId.setCustomerCd(sqlDto.getSupplyCustomerCd());
			mCustomerBySupplyCustomerId.setCustomerId(sqlDto.getSupplyCustomerId());
			mCustomerBySupplyCustomerId.setCustomerNm(sqlDto.getSupplyCustomerNm());
			mCustomerBySupplyCustomerId.setCustomerAbbr(sqlDto.getSupplyCustomerAbbr());
			// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana Start
			mCustomerBySupplyCustomerId.setOnetimeFlg(sqlDto.getOnetimeFlg());
			// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana End
			shippingInstHDto.setMCustomerBySupplyCustomerId(mCustomerBySupplyCustomerId);

			MProcessTypeDto mProcessType = new MProcessTypeDto();
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
			mProcessType.setProcessTypeCd(sqlDto.getProcessTypeCd());
			mProcessType.setProcessTypeNm((sqlDto.getMptProcessTypeId() != null) ? (sqlDto.getProcessTypeCd() + ":" + sqlDto.getProcessTypeNm()) : sqlDto.getProcessTypeCd());
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
			mProcessType.setProcessTypeId(sqlDto.getMptProcessTypeId());
			shippingInstHDto.setMProcessType(mProcessType);

			shippingInstHDto.setDelivPlanDt(formatDate(sqlDto.getDelivPlanDt()));
			shippingInstHDto.setWorkDt(formatDate(sqlDto.getWorkDt()));
			shippingInstHDto.setShippingDt(formatDate(sqlDto.getShippingDt()));
			MDeliveryCourseDto mDeliveryCourse = new MDeliveryCourseDto();
			mDeliveryCourse.setDeliveryCourseCd0(sqlDto.getDeliveryCourseCd0());
			if (CU.isNullOrEmpty(sqlDto.getDeliveryCourseCd())) {
				mDeliveryCourse.setDeliveryCourseCd(sqlDto.getDeliveryCourseCd0());
				mDeliveryCourse.setDeliveryCourseNm(sqlDto.getDeliveryCourseNm0());
			} else {
				mDeliveryCourse.setDeliveryCourseCd(sqlDto.getDeliveryCourseCd());
				mDeliveryCourse.setDeliveryCourseNm(sqlDto.getDeliveryCourseNm());
			}
			shippingInstHDto.setMDeliveryCourse(mDeliveryCourse);

			shippingInstHDto.setDelivDt(formatDate(sqlDto.getDelivDt()));
			shippingInstHDto.setDelivTz(sqlDto.getDelivTz());
			if (!CU.isNullOrEmpty(sqlDto.getEmergencyFlg()) && delivTzMap.containsKey(sqlDto.getDelivTz())) {
				shippingInstHDto.setDelivTzNm(sqlDto.getDelivTz() + ":" + delivTzMap.get(sqlDto.getDelivTz()));
			} else {
				shippingInstHDto.setDelivTzNm(sqlDto.getDelivTz());
			}
			shippingInstHDto.setDelivCustomerCd(sqlDto.getDelivCustomerCd());
			shippingInstHDto.setDelivCustomerId(sqlDto.getDelivCustomerId());
			if ("0".equals(sqlDto.getOnetimeFlg())) {
				shippingInstHDto.setDelivCustomerNm(sqlDto.getOneCustomerNm());
				shippingInstHDto.setDelivZipCd(sqlDto.getZipCd());
				shippingInstHDto.setDelivAddress1(sqlDto.getAddress1());
				// [#911] 住所表示がおかしい不具合を修正 2017.01.26 kawana Start
				shippingInstHDto.setDelivAddress2(sqlDto.getAddress2());
				shippingInstHDto.setDelivAddress3(sqlDto.getAddress3());
				// [#911] 住所表示がおかしい不具合を修正 2017.01.26 kawana End
				shippingInstHDto.setDelivTelNo(sqlDto.getTelNo());
			} else {
				shippingInstHDto.setDelivZipCd(sqlDto.getDelivZipCd());
				shippingInstHDto.setDelivAddress1(sqlDto.getDelivAddress1());
				shippingInstHDto.setDelivAddress2(sqlDto.getDelivAddress2());
				shippingInstHDto.setDelivAddress3(sqlDto.getDelivAddress3());
				shippingInstHDto.setDelivTelNo(sqlDto.getDelivTelNo());
				shippingInstHDto.setDelivCustomerNm(sqlDto.getDelivCustomerNm());
			}

			MProductDto mproduct = new MProductDto();
			mproduct.setProductId(sqlDto.getProductId());
			mproduct.setProductCd(sqlDto.getProductCd());
			mproduct.setProductNm(sqlDto.getMpProductNm());
			mproduct.setProductAbbr(sqlDto.getProductAbbr());
			mproduct.setJanCd(sqlDto.getJanCd());
			mproduct.setLotManagFlg(sqlDto.getLotManagFlg());
			mproduct.setLimitDtManagFlg(sqlDto.getLimitDtManagFlg());
			shippingInstBDto.setMProduct(mproduct);

			shippingInstBDto.setDepositCd(sqlDto.getDepositCd());
			shippingInstBDto.setDepositNm((sqlDto.getDepositId()!= null) ? (sqlDto.getDepositCd() + ":" + sqlDto.getDepositNm()) : sqlDto.getDepositCd());

			shippingInstBDto.setStockTypeCd(sqlDto.getStockTypeCd());
			shippingInstBDto.setStockTypeNm((sqlDto.getMstStockTypeId()!= null) ? (sqlDto.getStockTypeCd() + ":" + sqlDto.getStockTypeNm()) : sqlDto.getStockTypeCd());

			shippingInstBDto.setInstNum((sqlDto.getInstNum()!=null) ?WCC.toBigDecimal(sqlDto.getInstNum()):WCC.ZERO);

			shippingInstBDto.setLot(sqlDto.getLot());

			shippingInstBDto.setLimitDt(formatDate(sqlDto.getLimitDt()));

			shippingInstBDto.setLctWarehouseCd(sqlDto.getLctWarehouseCd());
			if (CU.isNullOrEmpty(sqlDto.getWarehouseCd())) {
				shippingInstBDto.setWarehouseCd(sqlDto.getLctWarehouseCd());
			} else {
				shippingInstBDto.setWarehouseCd(sqlDto.getWarehouseCd());
			}
			shippingInstBDto.setWarehouseNm((sqlDto.getWarehouseId()!= null) ? (sqlDto.getWarehouseCd() + ":" + sqlDto.getWarehouseNm()) : sqlDto.getWarehouseCd());

			shippingInstBDto.setLocationCd(sqlDto.getLocationCd());
			shippingInstBDto.setLocationId(sqlDto.getCclLocationId());

			shippingInstHDto.setDelivAddressSupply(sqlDto.getDelivAddressSupply());
			shippingInstHDto.setPickingWorkMessage(sqlDto.getPickingWorkMessage());

			// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
			// [#3677]金額データ連携　小数を許容するように修正する 2018.02.13 shimizu Start
			if(!CU.isNullOrEmpty(sqlDto.getTotalPrice())){
				shippingInstHDto.setTotalPrice(new BigDecimal(sqlDto.getTotalPrice()));
			}
			if(!CU.isNullOrEmpty(sqlDto.getTotalTax())){
				shippingInstHDto.setTotalTax(new BigDecimal(sqlDto.getTotalTax()));
			}
			if(!CU.isNullOrEmpty(sqlDto.getUnitPrice())){
				shippingInstBDto.setUnitPrice(new BigDecimal(sqlDto.getUnitPrice()));
			}
			if(!CU.isNullOrEmpty(sqlDto.getPrice())){
				shippingInstBDto.setPrice(new BigDecimal(sqlDto.getPrice()));
			}
			if(!CU.isNullOrEmpty(sqlDto.getTax())){
				shippingInstBDto.setTax(new BigDecimal(sqlDto.getTax()));
			}
			// [#3677]金額データ連携　小数を許容するように修正する 2018.02.13 shimizu End
			// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End


			// [#2253]予備項目対応 2017.08.18 sampei Start
			TShippingInstSpareDto tShippingInstSpareDto = new TShippingInstSpareDto();
			tShippingInstSpareDto.setSpareStr1(sqlDto.getSpareStr1());
			tShippingInstSpareDto.setSpareStr2(sqlDto.getSpareStr2());
			tShippingInstSpareDto.setSpareStr3(sqlDto.getSpareStr3());

			if(!CU.isNullOrEmpty(sqlDto.getSpareNum1())){
				BigDecimal spareNum1 = new BigDecimal(sqlDto.getSpareNum1());
				tShippingInstSpareDto.setSpareNum1(spareNum1);
			}
			if(!CU.isNullOrEmpty(sqlDto.getSpareNum2())){
				BigDecimal spareNum2 = new BigDecimal(sqlDto.getSpareNum2());
				tShippingInstSpareDto.setSpareNum2(spareNum2);
			}
			if(!CU.isNullOrEmpty(sqlDto.getSpareNum3())){
				BigDecimal spareNum3 = new BigDecimal(sqlDto.getSpareNum3());
				tShippingInstSpareDto.setSpareNum3(spareNum3);
			}
			shippingInstBDto.setTShippingInstSpareAsOne(tShippingInstSpareDto);
			// [#2253]予備項目対応 2017.08.18 sampei End

			shippingInstPlan.add(shippingInstBDto);
		}

		return shippingInstPlan;
	}

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.27 honma end
	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
	/**
	 * <h2>出荷予定受信テーブル検索</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @return セレクト件数
	 */
	public int getEShippingPlanCount(String receiveCd, String centerCd, String clientCd) {

		// センタIDの取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		long centerId = centerLogic.getUkEntityWithDeletedCheck(mCenter).getCenterId();

		// 外出しSQLの定義
		String path = EShippingInstBhv.PATH_selectSqlEShippingInstList;

		BsSqlEShippingInstListPmb pmb = new BsSqlEShippingInstListPmb();
		pmb.setClientCd(clientCd);
		pmb.setCenterCd(centerCd);
		pmb.setCenterId(centerId);
		pmb.setReceiveCd(receiveCd);
		pmb.setImportFlg("0");
		pmb.setCultureId(getCultureId());

		Class<SqlEShippingInstListDto> entityType = SqlEShippingInstListDto.class;

		return eShippingInstBhv.outsideSql().selectList(path, pmb, entityType).size();
	}
	//[Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

}
