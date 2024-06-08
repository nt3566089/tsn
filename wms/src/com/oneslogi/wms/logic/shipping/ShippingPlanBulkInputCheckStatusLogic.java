package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MWarehouseCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstHDtoMapper;
import com.oneslogi.base.dbflute.exbhv.EShippingInstBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.EShippingInst;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.shipping.ShippingPlanBulkInputDto;
import com.oneslogi.wms.logic.common.CarrierLogic;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.DeliveryCourseLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.ShippingPlanBulkInputRegisterLogic.OutputLog;
import com.oneslogi.wms.resources.shipping.ShippingPlanBulkInputResource.ResultSetupRegisterData;
import com.oneslogi.wms.util.WCU;

/**
 * 出荷指示登録データチェックロジッククラス
 */
public class ShippingPlanBulkInputCheckStatusLogic extends AbstractWmsLogic {

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.27 honma start

	// ===== 定数定義 =====
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 納品先マスタ存在異常
		 */
		protected static final int SUPPLIER_NOT_FOUND = 2;
		/**
		 * 預託マスタ存在異常
		 */
		protected static final int DEPOSIT_NOT_FOUND = 3;
		/**
		 * 処理区分マスタ存在異常
		 */
		protected static final int PROCESS_TYPE_NOT_FOUND = 4;
		/**
		 * 商品マスタ存在異常
		 */
		protected static final int PRODUCT_NOT_FOUND = 5;
		/**
		 * 在庫区分マスタ存在異常
		 */
		protected static final int STOCKTYPE_NOT_FOUND_FOUND = 6;
		/**
		 * ロケーションマスタ存在異常
		 */
		protected static final int LOCATION_NOT_FOUND = 7;
		/**
		 * 出荷指示データ登録異常
		 */
		protected static final int SHIPPING_PLAN_INSERT_FAILED = 8;
		/**
		 * 配送コース異常
		 */
		protected static final int DELIVERY_COUSE_NOT_FOUND = 9;
		/**
		 * 重複レコードチェック異常
		 */
		protected static final int DUPLICATE_RECORD_CHECK_FAILED = 10;
		/**
		 * 出荷日と納品予定日チェック異常
		 */
		protected static final int SHIPPINGDT_DELIVPLANDT_CHECK_FAILED = 11;
		/**
		 * 出荷日と納品指定日チェック異常
		 */
		protected static final int SHIPPINGDT_DELIVDT_CHECK_FAILED = 12;
		/**
		 * 作業日と納品予定日チェック異常
		 */
		protected static final int WORKDT_DELIVPLANDT_CHECK_FAILED = 13;
		/**
		 * 作業日と出荷日チェック異常
		 */
		protected static final int WORKDT_SHIPPINGDT_CHECK_FAILED = 14;
		/**
		 * 顧客出荷指示No.存在チェックのエラー
		 */
		protected static final int CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR = 15;
		// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana Start
		/**
		 * 納品先マスタ存在異常(届先CD)
		 */
		protected static final int DELIVERY_NOT_FOUND_DATA_FAILED = 16;
		/**
		 * 届先住所未入力(ワンタイム)
		 */
		protected static final int DELIVERY_ADDRESS_NO_INPUT = 17;
		// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana End
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kawana Start
		/**
		 * 倉庫マスタ存在異常(届先CD)
		 */
		protected static final int WAREHOUSE_NOT_FOUND = 18;
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kawana End
		// [C-CWMS-0052] 届先入力追加に伴い、届先CDの設定変更 2015.11.18 koyama Start
		/**
		 * 届先マスタ存在異常
		 */
		protected static final int DELIVERY_NOT_FOUND = 19;
		// [C-CWMS-0052] 届先入力追加に伴い、届先CDの設定変更 2015.11.18 koyama End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private CarrierLogic carrierLogic;
	// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kawana Start
	@Inject
	private WarehouseLogic warehouseLogic;
	// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kawana End
	@Inject
	private CenterClassLogic centerClassLogic;
	@Inject
	private ShippingPlanBulkInputSelectLogic shippingPlanBulkInputSelectLogic;
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
	// [#3780][Ver3.0] 運用ログ明細エラーメッセージ 不要ソース削除 2018.02.28 honma Delete
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End

	// ===== 使用テーブル =====
	@Inject
	private EShippingInstBhv eShippingInstBhv;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	// [Ver3.0] unit of measure対応 2017.11.24 潘 Start
	// ===== 使用共通関数 =====
	@Inject
	private HandyCommonUtil util;
	// [Ver3.0] unit of measure対応 2017.11.24 潘 End

	// ===== enum =====
	/** エラー時DB更新有無 */
	public enum DbUpdateForError {
		/** 更新有 */
		TRUE,
		/** 更新無 */
		FALSE
	}

	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add Start
	/**
	 * <h2>ログ追加（エラー情報）</h2>
	 * <pre>
	 * 運用ログのエラーチェック情報出力処理
	 * エラーチェック情報を運用ログに出力する
	 * </pre>
	 * @param processInfo 処理情報
	 * @param replaceValue 差し替え文字列
	 */
	public void addErrorCheckLogDtl(String processInfo, String... replaceValue) {

		// [#3780][Ver3.0] 運用ログ明細エラーメッセージ 不要ソース削除 2018.02.28 honma Delete
		// ログ追加（エラー情報）
		getDatabaseLogger().addErrorLogDtl(processInfo, replaceValue[0], replaceValue[1]);
	}
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Add End

	/**
	 * <h2>出荷指示一括取込の登録データをチェックする。</h2>
	 * <pre>
	 * 一括取込された各CDを元にIDを取得し、下記のチェックを行い、出荷指示ヘッダ情報を設定する。
	 * ・重複チェック（同一伝票の明細が他の行で入力）
	 * ・同一顧客出荷指示No.、納品先CDのヘッダ内容が不一致チェック
	 * ・納品予定日が出荷日より前の日付チェック
	 * ・納品予定日は作業日より前の日付チェック
	 * ・納品指定日は出荷日より前の日付チェック
	 * ・出荷日は作業日より以降の日付チェック
	 * ・既に登録済チェック
	 * ・処理区分マスタ未存在チェック
	 *
	 * チェックNGの場合、出荷指示受信テーブルのエラーフラグ、エラーメッセージCDを更新し、チェック結果に警告を設定する。
	 * チェックOKの場合、チェック結果に正常を設定する。
	 *
	 * </pre>
	 * @param shippingPlanBulkInputDto 出荷指示一括取込画面用DTO：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @param insertFlg 挿入フラグ
	 * @return ResultSetupRegisterData チェックの処理結果
	 */
	public ResultSetupRegisterData CheckStatus(ShippingPlanBulkInputDto shippingPlanBulkInputDto, ErrorStatus errSts,int insertFlg) {

		TShippingInstHDtoMapper tShippingInstHDtoMapper = new TShippingInstHDtoMapper();
		TShippingInstBDtoMapper tShippingInstBDtoMapper = new TShippingInstBDtoMapper();
		// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI Start
		boolean isProduct = false;
		// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI End
		// [ON推-品向-1121] 届先上書チェックを削除 2016.04.21 kawana
		// 出荷指示ヘッダをエンティティに変換
		TShippingInstH tshippingInstH = tShippingInstHDtoMapper.mappingToEntity(shippingPlanBulkInputDto.data.head);
		// 出荷指示ボディをエンティティに変換
		List<TShippingInstB> tShippingInstBList = tShippingInstBDtoMapper.mappingToEntityList(shippingPlanBulkInputDto.data.shippingPlan);

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(tshippingInstH.getMClient().getClientCd());
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(tshippingInstH.getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana Start

		// 重複レコードチェック用マップ
		HashMap<HeaderKey, TShippingInstH> headerMap = new HashMap<HeaderKey, TShippingInstH>();
		HeaderKey currentHeaderKey = null;

		// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana End

		int rowIndex = -1;

		List<EShippingInst> eShippingInstList = new ArrayList<>();
		boolean errFlg = true;

		boolean infoWarn = false;

		for (TShippingInstB tShippingInstB : tShippingInstBList) {
			rowIndex++;
			errFlg = false;
			String errorMessageCd = "";
			// [ON推-品向-126] チェックを削除 2014.11.26 王忠勝

			// エラーチェックロジックでチェック済み為外す 2016.05.19 nayzaw

			// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana Start

			TShippingInstH header = tShippingInstB.getTShippingInstH();

			String clientShippingNo = header.getClientShippingNo();
			String supplyCustomerCd = header.getMCustomerBySupplyCustomerId().getCustomerCd();

			// ヘッダキー(顧客出荷指示No. と 納品先CD)
			HeaderKey headerKey = new HeaderKey(clientShippingNo, supplyCustomerCd);

			if (currentHeaderKey != null && currentHeaderKey.equals(headerKey)) {
				// 前行と同じ伝票

				// ===== ヘッダ一致チェック =====

				ResultMatchHeader resultMatchHeader = checkMatchHeader(headerMap.get(currentHeaderKey), header);
				if (!resultMatchHeader.isMatch()) {
					// 不一致

					if (insertFlg == 1 && !errFlg) {
						errFlg = true;
						errorMessageCd = resultMatchHeader.getErrCd();
					}
				}
			} else {
				// 別伝票

				// 現在のヘッダキー更新
				currentHeaderKey = headerKey;

				// ===== ヘッダ重複チェック =====

				if (headerMap.containsKey(headerKey)) {
					// 既に存在している(行をまたいでいる)のでエラー

					if (insertFlg == 1 && !errFlg) {
						errFlg = true;
						errorMessageCd = WmsMessageConst.SLIP_NO_DUPLICATE_ERROR;
					}
				} else {
					// 新規の伝票

					headerMap.put(headerKey, header);
				}
			}

			String workDt = header.getWorkDt();
			String shippingDt = header.getShippingDt();
			String delivDt = header.getDelivDt();
			String delivPlanDt = header.getDelivPlanDt();

			// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana End

			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.09 kawana Start
			if (!CU.isNullOrEmpty(delivPlanDt)) {
				// 納品予定日が入力されている場合

				// 出荷日比較
				if (shippingDt.compareTo(delivPlanDt) > 0) {
					if (insertFlg ==1 && !errFlg) {
						errFlg = true;
						errorMessageCd = WmsMessageConst.DELIV_PLAN_DATE_CANNOT_CHANGE_BEFORE_SHIP_DATE_ERROR;
					}
				}

				// 作業日比較
				if (workDt.compareTo(delivPlanDt) > 0) {
					if (insertFlg ==1 && !errFlg) {
						errFlg = true;
						errorMessageCd = WmsMessageConst.DELIV_PLAN_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR;
					}
				}
			}
			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.09 kawana End
			if (delivDt != null) {
				if (shippingDt.compareTo(delivDt) > 0) {
					if (insertFlg ==1 && !errFlg) {
						errFlg = true;
						errorMessageCd = WmsMessageConst.DELIV_DATE_CANNOT_CHANGE_BEFORE_SHIP_DATE_ERROR;
					}
				}
			}
			// [EC-CT1-003] 納品予定日を必須から任意に変更(作業日比較を移動) 2015.02.09 kawana
			if (workDt.compareTo(shippingDt) > 0) {
				if (insertFlg ==1 && !errFlg) {
					errFlg = true;
					errorMessageCd = WmsMessageConst.SHIP_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR;
				}
			}

			// エラーチェックロジックでチェック済み為外す 2016.05.19 nayzaw

			if (!CU.isNullOrEmpty(clientShippingNo)) {
				TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
				cb.query().setClientId_Equal(clientId);
				cb.query().setSupplyCustomerCd_Equal(tShippingInstB.getTShippingInstH().getSupplyCustomerCd());
				cb.query().setClientShippingNo_Equal(clientShippingNo);
				// [ON推-品向-528] 一度取込んだ顧客出荷指示Noのデータをキャンセルして、再度同じデータを取込むと重複エラーを解消するために、追加 2015/01/13 許 Start
				cb.query().setShippingStatus_NotEqual_$90();
				// [ON推-品向-528] 一度取込んだ顧客出荷指示Noのデータをキャンセルして、再度同じデータを取込むと重複エラーを解消するために、追加 2015/01/13 許 End
				// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
				//センタID（Center_ID）
				cb.query().setCenterId_Equal(centerId);
				// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End

				int count = tShippingInstHBhv.selectCount(cb);
				if (count > 0) {
					// 顧客出荷指示No.存在チェックのエラーメッセージを設定
					// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
					//getErrorManager().add(new ErrorStatus(errSts, StatusCode.CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR, rowIndex), WmsMessageConst.CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR);
//						getErrorManager().add(new ErrorStatus(errSts, StatusCode.CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR, rowIndex), WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
					if (insertFlg ==1 && !errFlg) {
						errFlg = true;
						errorMessageCd = WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR;
					}
					// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
				}
			}
			// [ON推-品向-126] チェックを修正 2014.11.26 王忠勝 End
//			}
			// [C-CWMS-0052] 届先入力追加に伴い、届先の設定を変更 2015.11.18 koyama End
			// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana End

			// エラーチェックロジックでチェック済み為外す 2016.05.19 nayzaw

			// 処理区分IDを取得
			MProcessType mProcessType = new MProcessType();
			mProcessType.setProcessTypeCd(tShippingInstB.getTShippingInstH().getMProcessType().getProcessTypeCd());
			mProcessType = processTypeLogic.getUkEntity(mProcessType, errRetSts(errSts, StatusCode.PROCESS_TYPE_NOT_FOUND, rowIndex));
			if (mProcessType != null) {
				tShippingInstB.getTShippingInstH().setProcessTypeId(mProcessType.getProcessTypeId());
			}

			// エンティティの編集
			tShippingInstB.getTShippingInstH().setCenterId(centerId);
			tShippingInstB.getTShippingInstH().setClientId(clientId);
			tShippingInstB.getTShippingInstH().setInputType_$10();
			// 出荷ステータスをエラーにする
			tShippingInstB.getTShippingInstH().setShippingStatus_$10();
			// エラーフラグをエラーにする
			tShippingInstB.getTShippingInstH().setErrorFlg_$0();

			if (insertFlg == 1 && errFlg) {
				infoWarn = true;
				tShippingInstB.setErrorFlg("1");
				EShippingInst eShippingInst = eShippingInstBhv.selectByPKValue(tShippingInstB.getShippingInstReceiveId());
				if (eShippingInst !=null) {
					eShippingInst.setErrorFlg("1");
					eShippingInst.setErrorMessageCd(errorMessageCd);
					eShippingInstList.add(eShippingInst);
				}
			}
		}

		if (insertFlg == 1 && !eShippingInstList.isEmpty()) {
			eShippingInstBhv.batchUpdate(eShippingInstList);
		}

		// Dto変換処理
		List<TShippingInstBDto> bodyList = tShippingInstBDtoMapper.mappingToDtoList(tShippingInstBList);
		shippingPlanBulkInputDto.data.shippingPlan = bodyList;

		// 結果の設定
		ResultSetupRegisterData CheckStatus;

		if (getErrorManager().size() > 0) { // チェックエラー
			getErrorManager().clear();
//			CheckStatus = ResultSetupRegisterData.ERROR;
			CheckStatus = ResultSetupRegisterData.ALL_OK;
		}
		else {
			if (insertFlg == 1 && infoWarn) {
				CheckStatus = ResultSetupRegisterData.INFO_WARN;
			} else
			// [ON推-品向-1121] 届先上書チェックを削除 2016.04.21 kawana Start
			// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana Start
			// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI Start
			if (isProduct) {
				CheckStatus = ResultSetupRegisterData.PRODUCT_NOT_FOUND;
			} else {
				// チェック正常
				CheckStatus = ResultSetupRegisterData.ALL_OK;
			}
			// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI End
			// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana End
			// [ON推-品向-1121] 届先上書チェックを削除 2016.04.21 kawana End

		}
		return CheckStatus;
	}

	/**
	 * <h2>出荷指示一括取込の登録データをチェックする。</h2>
	 * <pre>
	 * 一括取込された各CDを元にIDを取得し、下記のチェックを行い、出荷指示ヘッダデータを設定する。
	 * ・倉庫存在チェック
	 * ・ロケーション存在チェック
	 * ・預託CD存在チェック
	 * ・在庫区分CD存在チェック
	 * ・重複チェック（同一伝票の明細が他の行で入力）
	 * ・同一顧客出荷指示No.、納品先CDのヘッダ内容が不一致チェック
	 * ・納品予定日が出荷日より前の日付チェック
	 * ・納品予定日は作業日より前の日付チェック
	 * ・納品指定日は出荷日より前の日付チェック
	 * ・出荷日は作業日より以降の日付チェック
	 * ・納品先マスタ存在チェック
	 * ・届先マスタ存在チェック
	 * ・届先住所入力(ワンタイム)存在チェック
	 * ・顧客出荷指示No.の既に登録済チェック
	 * ・配送コース存在チェック
	 * ・処理区分CD存在チェック
	 * ・処理区分マスタ未存在チェック
	 *
	 * チェックNGの場合、チェック結果にエラーを設定する。
	 * チェックOKの場合、チェック結果に正常を設定する。
	 * 商品CD未存在の場合、チェック結果に商品未存在を設定する。
	 *
	 * </pre>
	 * @param shippingPlanBulkInputDto 出荷指示一括取込画面用DTO：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 * @return ResultSetupRegisterData チェックの処理結果
	 */
	public ResultSetupRegisterData CheckStatus(ShippingPlanBulkInputDto shippingPlanBulkInputDto, ErrorStatus errSts) {

		TShippingInstHDtoMapper tShippingInstHDtoMapper = new TShippingInstHDtoMapper();
		TShippingInstBDtoMapper tShippingInstBDtoMapper = new TShippingInstBDtoMapper();
		// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI Start
		boolean isProduct = false;
		// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI End
		// [ON推-品向-1121] 届先上書チェックを削除 2016.04.21 kawana
		// 出荷指示ヘッダをエンティティに変換
		TShippingInstH tshippingInstH = tShippingInstHDtoMapper.mappingToEntity(shippingPlanBulkInputDto.data.head);
		// 出荷指示ボディをエンティティに変換
		List<TShippingInstB> tShippingInstBList = tShippingInstBDtoMapper.mappingToEntityList(shippingPlanBulkInputDto.data.shippingPlan);

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(tshippingInstH.getMClient().getClientCd());
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(tshippingInstH.getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana Start

		// 重複レコードチェック用マップ
		HashMap<HeaderKey, TShippingInstH> headerMap = new HashMap<HeaderKey, TShippingInstH>();
		HeaderKey currentHeaderKey = null;

		// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana End

		int rowIndex = -1;

		for (TShippingInstB tShippingInstB : tShippingInstBList) {
			rowIndex++;
			// [ON推-品向-126] チェックを削除 2014.11.26 王忠勝

			// 商品IDを設定
			MProduct productCondition = new MProduct();
			productCondition.setClientId(clientId);
			productCondition.setProductCd(tShippingInstB.getMProduct().getProductCd());
			// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI Start
			productCondition = productLogic.getUkEntity(productCondition);
			// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI End
			if (productCondition != null) {
				tShippingInstB.setProductId(productCondition.getProductId());
				// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI Start
			} else {
				isProduct = true;
			}
			// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI End

			// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kawana Start
			// 倉庫存在チェック
			MWarehouse warehouse = null;
			if (!CU.isNullOrEmpty(tShippingInstB.getWarehouseCd())) {
				// 倉庫マスタに指定倉庫CDの存在チェック
				MWarehouse warehouseCondition = new MWarehouse();
				warehouseCondition.setCenterId(centerId);
				warehouseCondition.setWarehouseCd(tShippingInstB.getWarehouseCd());
				warehouse = warehouseLogic.getUkEntityWithCheck(warehouseCondition, errRetSts(errSts, StatusCode.WAREHOUSE_NOT_FOUND, rowIndex));
				if (warehouse != null) {
					tShippingInstB.setWarehouseId(warehouse.getWarehouseId());
				}
			}
			// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kawana End

			if (!CU.isNullOrEmpty(tShippingInstB.getLocationCd())) {
				// ロケーションの設定
				MLocation locationCondition = new MLocation();
				locationCondition.setCenterId(centerId);
				locationCondition.setLocationCd(tShippingInstB.getLocationCd());
				// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kawana Start
				MLocation location = null;
				if (warehouse != null) {
					location = locationLogic.getUkEntityWithWarehouseCd(locationCondition, warehouse, errRetSts(errSts, StatusCode.LOCATION_NOT_FOUND, rowIndex));
				} else {
					location = locationLogic.getUkEntityWithWarehouse(locationCondition, errRetSts(errSts, StatusCode.LOCATION_NOT_FOUND, rowIndex));
				}

				if (location != null) {
					tShippingInstB.setLocationId(location.getLocationId());
					if (location.chaseMZone().getMWarehouse() != null) {
						tShippingInstB.setWarehouseId(location.getMZone().getMWarehouse().getWarehouseId());
						tShippingInstB.setWarehouseCd(location.getMZone().getMWarehouse().getWarehouseCd());
					}
				}
				// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kawana End
			} else {
				tShippingInstB.setLocationId(null);
				tShippingInstB.setLocationCd(null);
			}

			// 預託IDを取得
			MCustomer mCustomer = new MCustomer();
			mCustomer.setClientId(clientId);
			mCustomer.setCustomerCd(tShippingInstB.getDepositCd());
			mCustomer = customerLogic.getUkEntity(mCustomer, errRetSts(errSts, StatusCode.DEPOSIT_NOT_FOUND, rowIndex));
			if (mCustomer != null) {

				tShippingInstB.setDepositId(mCustomer.getCustomerId());
			}
			// 在庫区分IDを取得
			MStockType mStockType = new MStockType();
			//			mStockType.setClientId(clientId);
			mStockType.setStockTypeCd(tShippingInstB.getStockTypeCd());
			mStockType = stockTypeLogic.getUkEntity(mStockType, errRetSts(errSts, StatusCode.STOCKTYPE_NOT_FOUND_FOUND, rowIndex));

			if (mStockType != null) {
				tShippingInstB.setStockTypeId(mStockType.getStockTypeId());
			}

			// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana Start

			TShippingInstH header = tShippingInstB.getTShippingInstH();

			String clientShippingNo = header.getClientShippingNo();
			String supplyCustomerCd = header.getMCustomerBySupplyCustomerId().getCustomerCd();

			// ヘッダキー(顧客出荷指示No. と 納品先CD)
			HeaderKey headerKey = new HeaderKey(clientShippingNo, supplyCustomerCd);

			if (currentHeaderKey != null && currentHeaderKey.equals(headerKey)) {
				// 前行と同じ伝票

				// ===== ヘッダ一致チェック =====

				ResultMatchHeader resultMatchHeader = checkMatchHeader(headerMap.get(currentHeaderKey), header);
				if (!resultMatchHeader.isMatch()) {
					// 不一致

					getErrorManager().add(new ErrorStatus(errSts, StatusCode.DUPLICATE_RECORD_CHECK_FAILED, rowIndex), resultMatchHeader.getErrCd());
				}
			} else {
				// 別伝票

				// 現在のヘッダキー更新
				currentHeaderKey = headerKey;

				// ===== ヘッダ重複チェック =====

				if (headerMap.containsKey(headerKey)) {
					// 既に存在している(行をまたいでいる)のでエラー

					getErrorManager().add(new ErrorStatus(errSts, StatusCode.DUPLICATE_RECORD_CHECK_FAILED, rowIndex), WmsMessageConst.SLIP_NO_DUPLICATE_ERROR);
				} else {
					// 新規の伝票

					headerMap.put(headerKey, header);
				}
			}

			String workDt = header.getWorkDt();
			String shippingDt = header.getShippingDt();
			String delivDt = header.getDelivDt();
			String delivPlanDt = header.getDelivPlanDt();

			// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana End

			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.09 kawana Start
			if (!CU.isNullOrEmpty(delivPlanDt)) {
				// 納品予定日が入力されている場合

				// 出荷日比較
				if (shippingDt.compareTo(delivPlanDt) > 0) {
					getErrorManager().add(new ErrorStatus(errSts, StatusCode.SHIPPINGDT_DELIVPLANDT_CHECK_FAILED, rowIndex), WmsMessageConst.DELIV_PLAN_DATE_CANNOT_CHANGE_BEFORE_SHIP_DATE_ERROR);
				}

				// 作業日比較
				if (workDt.compareTo(delivPlanDt) > 0) {
					getErrorManager().add(new ErrorStatus(errSts, StatusCode.WORKDT_DELIVPLANDT_CHECK_FAILED, rowIndex), WmsMessageConst.DELIV_PLAN_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR);
				}
			}
			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.09 kawana End
			if (delivDt != null) {
				if (shippingDt.compareTo(delivDt) > 0) {
					getErrorManager().add(new ErrorStatus(errSts, StatusCode.SHIPPINGDT_DELIVDT_CHECK_FAILED, rowIndex), WmsMessageConst.DELIV_DATE_CANNOT_CHANGE_BEFORE_SHIP_DATE_ERROR);
				}
			}
			// [EC-CT1-003] 納品予定日を必須から任意に変更(作業日比較を移動) 2015.02.09 kawana
			if (workDt.compareTo(shippingDt) > 0) {
				getErrorManager().add(new ErrorStatus(errSts, StatusCode.WORKDT_SHIPPINGDT_CHECK_FAILED, rowIndex), WmsMessageConst.SHIP_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR);
			}

			// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana Start
			// [C-CWMS-0052] 届先入力追加に伴い、届先の設定を変更 2015.11.18 koyama Start
			boolean findSupplyCustomer = false;
			boolean findDeliveryCustomer = false;

			// 納品先マスタ存在チェックと設定
			MCustomer supplyCustomerCondition = new MCustomer();
			supplyCustomerCondition.setClientId(clientId);
			// 納品先CDがNULLの場合、届先CDをコピー
			if (CU.isNullOrEmpty(tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getCustomerCd()) && !CU.isNullOrEmpty(tShippingInstB.getTShippingInstH().getDelivCustomerCd())) {
				tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().setCustomerCd(tShippingInstB.getTShippingInstH().getDelivCustomerCd());
			}
			supplyCustomerCondition.setCustomerCd(tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getCustomerCd());
			MCustomer supplyCustomer = customerLogic.getDeliveryCustomer(supplyCustomerCondition, errRetSts(errSts, StatusCode.SUPPLIER_NOT_FOUND, rowIndex));

			//納品先マスタに存在する
			if (supplyCustomer != null) {

				findSupplyCustomer = true;

				// 納品先IDを設定
				tShippingInstB.getTShippingInstH().setSupplyCustomerId(supplyCustomer.getCustomerId());

				// 納品先名称を設定(未設定の場合のみ)
				if (CU.isNullOrEmpty(tShippingInstB.getTShippingInstH().getSupplyCustomerNm())) {
					tShippingInstB.getTShippingInstH().setSupplyCustomerNm(supplyCustomer.getCustomerNm());
				}
			}

			// 届先マスタ存在チェックと設定
			MCustomer deliveryCustomerCondition = new MCustomer();
			deliveryCustomerCondition.setClientId(clientId);
			// 届先CDがNULLの場合、納品先CDをコピー
			if (CU.isNullOrEmpty(tShippingInstB.getTShippingInstH().getDelivCustomerCd()) && !CU.isNullOrEmpty(tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getCustomerCd())) {
				tShippingInstB.getTShippingInstH().setDelivCustomerCd(tShippingInstB.getTShippingInstH().getMCustomerBySupplyCustomerId().getCustomerCd());
			}
			deliveryCustomerCondition.setCustomerCd(tShippingInstB.getTShippingInstH().getDelivCustomerCd());
			MCustomer deliveryCustomer = customerLogic.getDeliveryCustomer(deliveryCustomerCondition, errRetSts(errSts, StatusCode.DELIVERY_NOT_FOUND, rowIndex));

			// 届先マスタに存在する
			if (deliveryCustomer != null) {
				// 届先が取得できた場合、ワンタイム設定に従い届先を設定

				// [EC-CT1-180] ワンタイムにかかわらず届先ID、届先CDは納品先ID、納品先CDを設定 2015.04.08 kawana Start

				findDeliveryCustomer = true;

				//届先IDの設定
				tShippingInstB.getTShippingInstH().setDelivCustomerId(deliveryCustomer.getCustomerId());

				if (CU.isNullOrEmpty(deliveryCustomer.getOnetimeFlg()) || deliveryCustomer.isOnetimeFlg$0()) {
					// 通常の届先の場合(ワンタイム以外)

					// [ON推-品向-1121] 届先上書チェックを削除 2016.04.21 kawana

					//届先郵便番号の設定
					tShippingInstB.getTShippingInstH().setDelivZipCd(deliveryCustomer.getZipCd());
					//届先住所1の設定
					tShippingInstB.getTShippingInstH().setDelivAddress1(deliveryCustomer.getAddress1());
					//届先住所2の設定
					tShippingInstB.getTShippingInstH().setDelivAddress2(deliveryCustomer.getAddress2());
					//届先住所3の設定
					tShippingInstB.getTShippingInstH().setDelivAddress3(deliveryCustomer.getAddress3());
					//届先名称の設定
					tShippingInstB.getTShippingInstH().setDelivCustomerNm(deliveryCustomer.getCustomerNm());
					//届先電話番号の設定
					tShippingInstB.getTShippingInstH().setDelivTelNo(deliveryCustomer.getTelNo());

				} else {
					// 届先がワンタイムの場合

					// [品質-102-007] 届先住所のチェックは出荷指示入力にあわせる 2015.04.07 kawana Start
					String delivAddr = new StringBuilder()
							.append(CU.nullToStr(tShippingInstB.getTShippingInstH().getDelivAddress1()))
							.append(CU.nullToStr(tShippingInstB.getTShippingInstH().getDelivAddress2()))
							.append(CU.nullToStr(tShippingInstB.getTShippingInstH().getDelivAddress3()))
							.append(CU.nullToStr(tShippingInstB.getTShippingInstH().getDelivAddressSupply()))
							.toString();

					if (delivAddr.length() < 1) {
						// ワンタイムの場合、届先住所必須
						getErrorManager().add(errRetSts(errSts, StatusCode.DELIVERY_ADDRESS_NO_INPUT, rowIndex), WmsMessageConst.DELIV_ADDRESS_NO_INPUT_ERROR);
					}
					// [品質-102-007] 届先住所のチェックは出荷指示入力にあわせる 2015.04.07 kawana End

				}
				// [EC-CT1-180] ワンタイムにかかわらず届先ID、届先CDは納品先ID、納品先CDを設定 2015.04.08 kawana End
			}

			if (findSupplyCustomer && findDeliveryCustomer) {
				// [ON推-品向-126] チェックを修正 2014.11.26 王忠勝 Start
				//顧客出荷指示No.存在チェック
				if (!CU.isNullOrEmpty(clientShippingNo)) {
					TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
					cb.query().setClientId_Equal(clientId);
					cb.query().setSupplyCustomerId_Equal(supplyCustomer.getCustomerId());
					cb.query().setClientShippingNo_Equal(clientShippingNo);
					// [ON推-品向-528] 一度取込んだ顧客出荷指示Noのデータをキャンセルして、再度同じデータを取込むと重複エラーを解消するために、追加 2015/01/13 許 Start
					cb.query().setShippingStatus_NotEqual_$90();
					// [ON推-品向-528] 一度取込んだ顧客出荷指示Noのデータをキャンセルして、再度同じデータを取込むと重複エラーを解消するために、追加 2015/01/13 許 End
					// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
					//センタID（Center_ID）
					cb.query().setCenterId_Equal(centerId);
					// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End

					int count = tShippingInstHBhv.selectCount(cb);
					if (count > 0) {
						// 顧客出荷指示No.存在チェックのエラーメッセージを設定
						// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
						//getErrorManager().add(new ErrorStatus(errSts, StatusCode.CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR, rowIndex), WmsMessageConst.CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR);
						getErrorManager().add(new ErrorStatus(errSts, StatusCode.CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR, rowIndex), WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
						// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
					}
				}
				// [ON推-品向-126] チェックを修正 2014.11.26 王忠勝 End
			}
			// [C-CWMS-0052] 届先入力追加に伴い、届先の設定を変更 2015.11.18 koyama End
			// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana End

			//配送コースIDを取得
			MDeliveryCourse mDeliveryCourse = new MDeliveryCourse();
			mDeliveryCourse.setCenterId(centerId);
			// [C-CWMS-0052] 届先入力追加に伴い、配送コースの設定を変更 2015.12.01 koyama Start
			// 配送コースがNULLの場合、届先CD紐付く配送コースを取得
			if (CU.isNullOrEmpty(tShippingInstB.getTShippingInstH().getMDeliveryCourse().getDeliveryCourseCd())) {
				// 届先マスタに存在する
				if (deliveryCustomer != null) {
					// 配送コース取得
					Long delivCustomerId = deliveryCustomer.getCustomerId();
					MCustomer mDelivCustomer = new MCustomer();
					mDelivCustomer.setCustomerId(delivCustomerId);
					MDeliveryCourse deliveryCourse = deliveryCourseLogic.getDeliveryCourseByCustomerId(mDelivCustomer, centerId);
					if (deliveryCourse != null) {
						tShippingInstB.getTShippingInstH().getMDeliveryCourse().setDeliveryCourseCd(deliveryCourse.getDeliveryCourseCd());
					}
				}
			}
			// [C-CWMS-0052] 届先入力追加に伴い、配送コースの設定を変更 2015.12.01 koyama End
			mDeliveryCourse.setDeliveryCourseCd(tShippingInstB.getTShippingInstH().getMDeliveryCourse().getDeliveryCourseCd());
			// [C-CWMS-0052] 配送コースがNULLの場合、エラーを表示させるように修正 2015.11.27 koyama Start
			mDeliveryCourse = deliveryCourseLogic.getDeliveryCourse(mDeliveryCourse, errRetSts(errSts, StatusCode.DELIVERY_COUSE_NOT_FOUND, rowIndex));
			// [C-CWMS-0052] 配送コースがNULLの場合、エラーを表示させるように修正 2015.11.27 koyama End
			if (mDeliveryCourse != null) {
				tShippingInstB.getTShippingInstH().setDeliveryCourseId(mDeliveryCourse.getDeliveryCourseId());
				tShippingInstB.getTShippingInstH().setDeliveryCourseNm(mDeliveryCourse.getDeliveryCourseNm());

				//運送業者マスタ存在チェック
				MCarrier mCarrier = new MCarrier();
				mCarrier.setCarrierId(mDeliveryCourse.getCarrierId());
				boolean result = carrierLogic.checkCarrierId(mCarrier);
				if (result == true) {
					mCarrier = carrierLogic.getPkEntity(mCarrier);
					//運送業者CDの設定
					tShippingInstB.getTShippingInstH().setCarrierCd(mCarrier.getCarrierCd());
				}
			}

			// 処理区分IDを取得
			MProcessType mProcessType = new MProcessType();
			mProcessType.setProcessTypeCd(tShippingInstB.getTShippingInstH().getMProcessType().getProcessTypeCd());
			mProcessType = processTypeLogic.getUkEntity(mProcessType, errRetSts(errSts, StatusCode.PROCESS_TYPE_NOT_FOUND, rowIndex));
			if (mProcessType != null) {
				tShippingInstB.getTShippingInstH().setProcessTypeId(mProcessType.getProcessTypeId());
			}
			// エンティティの編集
			tShippingInstB.getTShippingInstH().setCenterId(centerId);
			tShippingInstB.getTShippingInstH().setClientId(clientId);
			tShippingInstB.getTShippingInstH().setInputType_$10();
			// 出荷ステータスをエラーにする
			tShippingInstB.getTShippingInstH().setShippingStatus_$10();
			// エラーフラグをエラーにする
			tShippingInstB.getTShippingInstH().setErrorFlg_$0();
		}


		// Dto変換処理
		List<TShippingInstBDto> bodyList = tShippingInstBDtoMapper.mappingToDtoList(tShippingInstBList);
		shippingPlanBulkInputDto.data.shippingPlan = bodyList;

		// 結果の設定
		ResultSetupRegisterData CheckStatus;

		if (getErrorManager().size() > 0) { // チェックエラー
			CheckStatus = ResultSetupRegisterData.ERROR;
		}
		else {
			// [ON推-品向-1121] 届先上書チェックを削除 2016.04.21 kawana Start
			// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana Start
			// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI Start
			if (isProduct) {
				CheckStatus = ResultSetupRegisterData.PRODUCT_NOT_FOUND;
			} else {
				// チェック正常
				CheckStatus = ResultSetupRegisterData.ALL_OK;
			}
			// [検査-207] 存在しない商品を登録できるようにする  2014.12.04 KI End
			// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana End
			// [ON推-品向-1121] 届先上書チェックを削除 2016.04.21 kawana End

		}
		return CheckStatus;

	}

	/**
	 * <h2>取込データのエラーチェック.<h2>
	 * <pre>エラーがある場合はエラーメッセージをDBに登録する</pre>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param outputLog ログの書込み有無
	 */
	public void checkError(String receiveCd, String centerCd, String clientCd, OutputLog outputLog) {

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			getDatabaseLogger().startLogDtl(WmsMessageConst.BULK_INPUT_SECTION_NAME_ERROR_CHECK_INFORMATION);
		}

		// データ取得
		List<EShippingInst> eShippingInstList = shippingPlanBulkInputSelectLogic.selectEShippingInstList(receiveCd);

		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod Start
		// 必須、文字数などのチェック
		int errCount = checkError(eShippingInstList, centerCd, clientCd, DbUpdateForError.TRUE, outputLog);
		// マスタなどの関連チェック
		int errCountMaster = checkErrorMaster(receiveCd, centerCd, clientCd, outputLog);

		if (outputLog == OutputLog.TRUE) {
			// ログ書込

			// チェック後のデータ取得
			List<EShippingInst> checkedEShippingInstList = shippingPlanBulkInputSelectLogic.selectEShippingInstList(receiveCd);
			int count = checkedEShippingInstList.size();
			int headerCount = shippingPlanBulkInputSelectLogic.getEShippingInstHeader(checkedEShippingInstList, ShippingPlanBulkInputSelectLogic.SelectCls.ALL);
			int errHeaderCount = shippingPlanBulkInputSelectLogic.getEShippingInstHeader(checkedEShippingInstList, ShippingPlanBulkInputSelectLogic.SelectCls.ERROR_ONLY);
			int normalHeaderCount = headerCount - errHeaderCount;
			int errCountAll = errCount + errCountMaster;
			int normalBodyCount = count - errCountAll;

			getDatabaseLogger().addInfoLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_SHIPPING_PLAN_INFORMATION
					, String.valueOf(errHeaderCount), String.valueOf(errCountAll), String.valueOf(normalHeaderCount), String.valueOf(normalBodyCount));
		// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod End
			getDatabaseLogger().endLogDtl();
		}
	}

	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod Start
	/**
	 * <h2>必須、文字種別、文字長さのチェック.<h2>
	 * @param eShippingInstList 取込出荷予定データリスト
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param doUpdate エラー時DB更新有無
	 * @param outputLog ログの書込み有無
	 * @return エラー件数
	 */
	private int checkError(List<EShippingInst> eShippingInstList, String centerCd, String clientCd, DbUpdateForError doUpdate, OutputLog outputLog) {

		// エラー件数
		int errorCount = 0;

		//緊急フラグ Map
		Map<String, String> emergencyFlgMap = centerClassLogic.getClassMapByCd("EMERGENCY_FLG");

		//処理区分 List
		List<MProcessType> mProcessTypeList = processTypeLogic.getMProcessType("0", "1", "0");
		//処理区分 Map
		Map<String, String> processTypeMap = new LinkedHashMap<String, String>();
		for (MProcessType mProcessType : mProcessTypeList) {
			processTypeMap.put(mProcessType.getProcessTypeCd(), String.valueOf(mProcessType.getProcessTypeId()));
		}

		//納品時間帯 Map
		Map<String, String> delivTzMap = centerClassLogic.getClassMapByCd("DELIV_TZ");

		//在庫区分 Map
		Map<String, String> stockTypeMap = stockTypeLogic.getStockTypeMap();

		//預託CD Map
		Map<String, String> mCustomerMap = customerLogic.getDepositMapByClientCd(clientCd);

		// 倉庫CD List
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		long centerId = centerLogic.getUkEntityWithDeletedCheck(mCenter).getCenterId();
		MWarehouseCB mWarehouseCB = new MWarehouseCB();
		mWarehouseCB.setupSelect_MCenter();
		mWarehouseCB.query().queryMCenter().setCenterId_Equal(centerId);
		mWarehouseCB.specify().columnWarehouseCd();
		mWarehouseCB.specify().columnWarehouseNm();
		mWarehouseCB.query().addOrderBy_WarehouseCd_Asc();
		List<MWarehouse> mWarehouseList = warehouseLogic.getEntityList(mWarehouseCB);
		// 倉庫CD Map
		Map<String, String> mWarehouseMap = new HashMap<String, String>();
		for (MWarehouse mWarehouse : mWarehouseList) {
			mWarehouseMap.put(mWarehouse.getWarehouseCd(), String.valueOf(mWarehouse.getWarehouseId()));
		}
		// [Ver3.0] unit of measure対応 2017.11.24 潘 Start
		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		Long clientId = mClient.getClientId();
		// [Ver3.0] unit of measure対応 2017.11.24 潘 End

		for (EShippingInst eShippingInst : eShippingInstList) {

			// ===== 緊急フラグ チェック =====

			String emergencyFlg = eShippingInst.getEmergencyFlg();
			if (CU.isNullOrEmpty(emergencyFlg)) {
				// 必須
				updateErrorExecute(eShippingInst, WmsMessageConst.EMERGENCY_FLG_NOT_INPUT_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			if (!emergencyFlgMap.containsKey(emergencyFlg)) {
				// 緊急フラグがセンタ区分値明細マスタにない。
				updateErrorExecute(eShippingInst, WmsMessageConst.EMERGENCY_FLAG_NOT_FOUND_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}

			// ===== 顧客出荷指示No. チェック =====

			String clientShippingNo = eShippingInst.getClientShippingNo();
			if (CU.isNullOrEmpty(clientShippingNo)) {
				// 必須
				updateErrorExecute(eShippingInst, WmsMessageConst.CLIENT_SHIPPING_NO_NOT_INPUT_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("^[0-9a-zA-Z\\-]*$", clientShippingNo)) {
				// 文字エラー
				updateErrorExecute(eShippingInst, WmsMessageConst.CLIENT_SHIPPING_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("[0-9a-zA-Z\\-]{1,30}$", clientShippingNo)) {
				// 長さエラー
				updateErrorExecute(eShippingInst, WmsMessageConst.CLIENT_SHIPPING_NO_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}

			// ===== 納品先CD チェック =====

			String supplyCustomerCd = eShippingInst.getSupplyCustomerCd();
			if (CU.isNullOrEmpty(supplyCustomerCd)) {
				// 必須
				updateErrorExecute(eShippingInst, WmsMessageConst.SUPPLY_CUSTOMER_CD_NOT_INPUT_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("^[0-9a-zA-Z\\-]*$", supplyCustomerCd)) {
				// 文字エラー
				updateErrorExecute(eShippingInst, WmsMessageConst.SUPPLY_CUSTOMER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("[0-9a-zA-Z\\-]{1,10}$", supplyCustomerCd)) {
				// 長さエラー
				updateErrorExecute(eShippingInst, WmsMessageConst.SUPPLY_CUSTOMER_CD_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}

			// ===== 処理区分CD チェック =====

			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod Start
			String processTypeCd = eShippingInst.getProcessTypeCd();
			// [#246][2.1.0 バグ・品質向上対策] 入荷予定/出荷指示受信テーブルの物理名を(～ID)から(～CD)に修正 2016.11.22 honma Mod End
			if (CU.isNullOrEmpty(processTypeCd)) {
				// 必須
				updateErrorExecute(eShippingInst, WmsMessageConst.PROCESS_TYPE_CD_NOT_INPUT_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			if (!processTypeMap.containsKey(processTypeCd)) {
				// 処理区分CDが処理区分マスタにない。
				updateErrorExecute(eShippingInst, WmsMessageConst.PROCESS_TYPE_CD_NOT_FOUND_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}

			// ===== 納品予定日 チェック =====

			String delivPlanDt = CU.isNullOrEmpty(eShippingInst.getDelivPlanDt()) ? "" : eShippingInst.getDelivPlanDt().replaceAll("/", "");
			if (!CU.isNullOrEmpty(delivPlanDt)) {
				if (checkExcelCellInput(dateRegExp("yyMMdd"), delivPlanDt)) {
					delivPlanDt = CU.convertNumberToString(Calendar.getInstance().get(Calendar.YEAR)).substring(0, 2) + delivPlanDt;
				}
				// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana Start
				if (!WCU.checkDateStr(delivPlanDt)) {
					// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana End
					// 日付不正エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_PLAN_DT_DATE_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 作業日 チェック =====

			String workDt = CU.isNullOrEmpty(eShippingInst.getWorkDt()) ? "" : eShippingInst.getWorkDt().replaceAll("/", "");
			if (CU.isNullOrEmpty(workDt)) {
				// 必須
				updateErrorExecute(eShippingInst, WmsMessageConst.WORK_DT_NOT_INPUT_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			if (checkExcelCellInput(dateRegExp("yyMMdd"), workDt)) {
				workDt = CU.convertNumberToString(Calendar.getInstance().get(Calendar.YEAR)).substring(0, 2) + workDt;
			}
			// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana Start
			if (!WCU.checkDateStr(workDt)) {
				// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana End
				// 日付不正エラー
				updateErrorExecute(eShippingInst, WmsMessageConst.WORK_DT_DATE_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}

			// ===== 出荷日 チェック =====

			String shippingDt = CU.isNullOrEmpty(eShippingInst.getShippingDt()) ? "" : eShippingInst.getShippingDt().replaceAll("/", "");
			if (CU.isNullOrEmpty(shippingDt)) {
				// 必須
				updateErrorExecute(eShippingInst, WmsMessageConst.SHIPPING_DT_NOT_INPUT_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			if (checkExcelCellInput(dateRegExp("yyMMdd"), shippingDt)) {
				shippingDt = CU.convertNumberToString(Calendar.getInstance().get(Calendar.YEAR)).substring(0, 2) + shippingDt;
			}
			// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana Start
			if (!WCU.checkDateStr(shippingDt)) {
				// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana End
				// 日付不正エラー
				updateErrorExecute(eShippingInst, WmsMessageConst.SHIPPING_DT_DATE_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}

			// ===== 配送コースCD チェック =====

			String deliveryCourseCd = eShippingInst.getDeliveryCourseCd();
			if (!CU.isNullOrEmpty(deliveryCourseCd)) {
				if (!checkExcelCellInput("^[0-9a-zA-Z\\-]*$", deliveryCourseCd)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIVERY_COURSE_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput("[0-9a-zA-Z\\-]{1,5}$", deliveryCourseCd)) {
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIVERY_COURSE_CD_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 納品指定日 チェック =====

			String delivDt = CU.isNullOrEmpty(eShippingInst.getDelivDt()) ? "" : eShippingInst.getDelivDt().replaceAll("/", "");
			if (!CU.isNullOrEmpty(delivDt)) {
				if (checkExcelCellInput(dateRegExp("yyMMdd"), delivDt)) {
					delivDt = CU.convertNumberToString(Calendar.getInstance().get(Calendar.YEAR)).substring(0, 2) + delivDt;
				}
				// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana Start
				if (!WCU.checkDateStr(delivDt)) {
					// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana End
					// 日付不正エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_DT_DATE_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 納品時間帯 チェック =====

			String delivTz = eShippingInst.getDelivTz();
			if (!CU.isNullOrEmpty(delivTz)) {
				if (!delivTzMap.containsKey(delivTz)) {
					// 納品時間帯CDがセンタ区分値明細マスタにない。
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_TZ_NOT_FOUND_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 商品CD チェック =====

			String productCd = eShippingInst.getProductCd();
			if (CU.isNullOrEmpty(productCd)) {
				// 必須
				updateErrorExecute(eShippingInst, WmsMessageConst.PRODUCT_CD_NOT_INPUT_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("^[!-~]*$", productCd)) {
				// 文字エラー
				updateErrorExecute(eShippingInst, WmsMessageConst.PRODUCT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			if (!checkExcelCellInput("[!-~]{1,30}$", productCd)) {
				// 長さエラー
				updateErrorExecute(eShippingInst, WmsMessageConst.PRODUCT_CD_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}

			// ===== 預託CD チェック =====

			String depositCd = eShippingInst.getDepositCd();
			if (CU.isNullOrEmpty(depositCd)) {
				// 必須
				updateErrorExecute(eShippingInst, WmsMessageConst.PLAN_DEPOSIT_CD_NOT_INPUT_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			if (!mCustomerMap.containsKey(depositCd)) {
				// 預託CDが取引先マスタにない。
				updateErrorExecute(eShippingInst, WmsMessageConst.DEPOSIT_CD_NOT_FOUND_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}

			// ===== 在庫区分CD チェック =====

			String stockTypeCd = eShippingInst.getStockTypeCd();
			if (CU.isNullOrEmpty(stockTypeCd)) {
				// 必須
				updateErrorExecute(eShippingInst, WmsMessageConst.STOCK_TYPE_CD_NOT_INPUT_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
			if (!checkExcelCellInput(".{1,30}$", stockTypeCd)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana End
				// 文字エラー
				updateErrorExecute(eShippingInst, WmsMessageConst.STOCK_CLASS_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			if (!stockTypeMap.containsKey(stockTypeCd)) {
				// 在庫区分CDが在庫区分マスタにない。
				updateErrorExecute(eShippingInst, WmsMessageConst.STOCK_TYPE_CD_NOT_FOUND_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}

			// ===== 指示数 チェック =====
			// [Ver3.0] unit of measure対応 2017.12.28 潘 Start
			String instNum = eShippingInst.getInstNum();
			if (CU.isNullOrEmpty(instNum)) {
				// 必須
				updateErrorExecute(eShippingInst, WmsMessageConst.INST_NUM_NOT_INPUT_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Mod Start
			// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
			if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", instNum)) {
				// 文字エラー
				updateErrorExecute(eShippingInst, WmsMessageConst.INST_NUM_CHECK_NUMERIC_ONLY_ERROR, doUpdate, outputLog);
				errorCount++;
				continue;
			}
			// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
			// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Mod End

			//小数有無フラグ取得
			String decimalExistFlg = util.getDecimalExistFlg(productCd,clientId);

			//小数有無フラグが有の場合
			//[#4189][Ver3.0]マスタに存在しない商品の場合致命的エラーが発生していた不具合を修正 2018.03.28 miyabe Upd Start
			if(decimalExistFlg != null) {
				if (decimalExistFlg.equals("1")){

					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", instNum)) {
						// 整数7桁以内
						updateErrorExecute(eShippingInst, WmsMessageConst.INST_NUM_CHECK_INPUT_INTEGER_ERROR, doUpdate, outputLog);
						errorCount++;
						continue;
					}

					if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", instNum)) {
						// 小数3桁以内
						updateErrorExecute(eShippingInst, WmsMessageConst.INST_NUM_CHECK_INPUT_DECIMAL_MAX_ERROR, doUpdate, outputLog);
						errorCount++;
						continue;
					}

					if ((WCC.toBigDecimal(instNum).compareTo(WCC.toBigDecimal("0.001"))<0)) {
						// 最小0.001以上
						updateErrorExecute(eShippingInst, WmsMessageConst.INST_NUM_CHECK_INPUT_DECIMAL_MIN_ERROR, doUpdate, outputLog);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End

				}else if(decimalExistFlg.equals("0")){

					//小数有無フラグが無しの場合
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
					if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", instNum)) {
						// 整数7桁以内
						updateErrorExecute(eShippingInst, WmsMessageConst.INST_NUM_CHECK_INPUT_INTEGER_ERROR, doUpdate, outputLog);
						errorCount++;
						continue;
					}

					if (!checkExcelCellInput("^(-)?\\d+$", instNum)) {
						// 小数0桁以内
						updateErrorExecute(eShippingInst, WmsMessageConst.INST_NUM_CHECK_INPUT_DECIMAL_ERROR, doUpdate, outputLog);
						errorCount++;
						continue;
					}

					if ((WCC.toBigDecimal(instNum).compareTo(WCC.toBigDecimal("1"))<0)) {
						// 最小1以上
						updateErrorExecute(eShippingInst, WmsMessageConst.INST_NUM_INPUT_REQUEST_MORE_THAN_ONE_ERROR, doUpdate, outputLog);
						errorCount++;
						continue;
					}
					// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
				}
			}
			//[#4189][Ver3.0]マスタに存在しない商品の場合致命的エラーが発生していた不具合を修正 2018.03.28 miyabe Upd End

			// [Ver3.0] unit of measure対応 2017.12.28 潘 End

//			if (!checkExcelCellInput("[0-9]{1,7}$", instNum)) {
//				// 小数0桁以内
//				updateErrorExecute(eShippingInst, WmsMessageConst.INST_NUM_CHECK_INPUT_INTEGER_ERROR, doUpdate, outputLog);
//				errorCount++;
//				continue;
//			}
//			if (!checkExcelCellInput("^\\d+$", instNum)) {
//				// 小数0桁以内
//				updateErrorExecute(eShippingInst, WmsMessageConst.INST_NUM_CHECK_INPUT_DECIMAL_ERROR, doUpdate, outputLog);
//				errorCount++;
//				continue;
//			}

			// ===== 指定ロット チェック =====

			String lot = eShippingInst.getLot();
			if (!CU.isNullOrEmpty(lot)) {
				if (!checkExcelCellInput("^[ -~｡-ﾟ]*$", lot)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.LOT_CHECK_HALF_WIDTH_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput("[ -~｡-ﾟ]{1,10}$", lot)) {
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.LOT_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 指定期限日 チェック =====

			String limitDt = CU.isNullOrEmpty(eShippingInst.getLimitDt()) ? "" : eShippingInst.getLimitDt().replaceAll("/", "");
			if (!CU.isNullOrEmpty(limitDt)) {
				if (checkExcelCellInput(dateRegExp("yyMMdd"), limitDt)) {
					limitDt = CU.convertNumberToString(Calendar.getInstance().get(Calendar.YEAR)).substring(0, 2) + limitDt;
				}
				// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana Start
				if (!WCU.checkDateStr(limitDt)) {
					// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana End
					// 日付不正エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.LIMIT_DT_DATE_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 指定倉庫CD チェック =====

			String warehouseCd = eShippingInst.getWarehouseCd();
			if (!CU.isNullOrEmpty(warehouseCd)) {
				if (!mWarehouseMap.containsKey(warehouseCd)) {
					// 指定倉庫CDが倉庫マスタにない。
					// [#6746][v3.1] メッセージ不正の修正 「予定倉庫」 ⇒ 「指定倉庫」2019.10.30 kawana Start
					updateErrorExecute(eShippingInst, WmsMessageConst.WAREHOUSE_CD_NOT_FOUND_ERROR, doUpdate, outputLog);
					// [#6746][v3.1] メッセージ不正の修正 「予定倉庫」 ⇒ 「指定倉庫」2019.10.30 kawana End
					errorCount++;
					continue;
				}
			}

			// ===== 指定ロケーションCD チェック =====

			String locationCd = eShippingInst.getLocationCd();
			if (!CU.isNullOrEmpty(locationCd)) {
				if (!checkExcelCellInput("^[0-9a-zA-Z]*$", locationCd)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.LOCATION_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput("[0-9a-zA-Z]{1,30}$", locationCd)) {
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.LOCATION_CD_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 届先CD チェック =====

			String delivCustomerCd = eShippingInst.getDelivCustomerCd();

			// [#380][2.1.0-CT-075] EDI経由の場合、届先CDが空だとエラーになる問題を修正 2016.12.06 kawana Start

			if (!CU.isNullOrEmpty(delivCustomerCd)) {
				if (!checkExcelCellInput("^[0-9a-zA-Z\\-]*$", delivCustomerCd)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_CUSTOMER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				if (!checkExcelCellInput("[0-9a-zA-Z\\-]{1,10}$", delivCustomerCd)) {
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_CUSTOMER_CD_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// [#380][2.1.0-CT-075] EDI経由の場合、届先CDが空だとエラーになる問題を修正 2016.12.06 kawana End

			// ===== 届先名称 チェック =====

			String delivCustomerNm = eShippingInst.getDelivCustomerNm();
			if (!CU.isNullOrEmpty(delivCustomerNm)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
				if (!checkExcelCellInput(".{1,50}$", delivCustomerNm)) {
					// [#13]文字数チェック不正を修正 2016.09.29 kawana End
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_CUSTOMER_NM_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 届先郵便番号 チェック =====
			String delivZipCd = eShippingInst.getDelivZipCd();
			if (!CU.isNullOrEmpty(delivZipCd)) {
				if (!checkExcelCellInput("^[0-9]*$", delivZipCd)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_ZIP_CD_CHECK_NUMERIC_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
				if (!checkExcelCellInput(".{1,7}$", delivZipCd)) {
					// [#13]文字数チェック不正を修正 2016.09.29 kawana End
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_ZIP_CD_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 届先住所1 チェック =====

			String delivAddress1 = eShippingInst.getDelivAddress1();
			if (!CU.isNullOrEmpty(delivAddress1)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
				if (!checkExcelCellInput(".{1,50}$", delivAddress1)) {
					// [#13]文字数チェック不正を修正 2016.09.29 kawana End
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_ADDRESS1_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 届先住所2 チェック =====

			String delivAddress2 = eShippingInst.getDelivAddress2();
			if (!CU.isNullOrEmpty(delivAddress2)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
				if (!checkExcelCellInput(".{1,50}$", delivAddress2)) {
					// [#13]文字数チェック不正を修正 2016.09.29 kawana End
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_ADDRESS2_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 届先住所3 チェック =====

			String delivAddress3 = eShippingInst.getDelivAddress3();
			if (!CU.isNullOrEmpty(delivAddress3)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
				if (!checkExcelCellInput(".{1,50}$", delivAddress3)) {
					// [#13]文字数チェック不正を修正 2016.09.29 kawana End
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_ADDRESS3_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 届先電話番号 チェック =====
			String delivTelNo = eShippingInst.getDelivTelNo();
			if (!CU.isNullOrEmpty(delivTelNo)) {
				if (!checkExcelCellInput("^[0-9\\-]*$", delivTelNo)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_TEL_NO_CHECK_NUMERIC_AND_HYPHEN_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
				if (!checkExcelCellInput(".{1,15}$", delivTelNo)) {
					// [#13]文字数チェック不正を修正 2016.09.29 kawana End
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_TEL_NO_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 届先住所補足 チェック =====

			String delivAddressSupply = eShippingInst.getDelivAddressSupply();
			if (!CU.isNullOrEmpty(delivAddressSupply)) {
				// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
				if (!checkExcelCellInput(".{1,50}$", delivAddressSupply)) {
					// [#13]文字数チェック不正を修正 2016.09.29 kawana End
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.DELIV_ADDRESS_SUPPLY_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 出庫作業メッセージ チェック =====

			String pickingWorkMessage = eShippingInst.getPickingWorkMessage();
			// [#317][2.1.0-CT-060] 出荷指示一括取込 異常終了修正 2016.11.25 honma Mod Start
			if (!CU.isNullOrEmpty(pickingWorkMessage)) {
			// [#317][2.1.0-CT-060] 出荷指示一括取込 異常終了修正 2016.11.25 honma Mod End
				// [#13]文字数チェック不正を修正 2016.09.29 kawana Start
				if (!checkExcelCellInput(".{1,100}$", pickingWorkMessage)) {
					// [#13]文字数チェック不正を修正 2016.09.29 kawana End
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.PICKING_WORK_MESSAGE_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
			// [#3677]金額データ連携　小数を許容するように修正 2018.02.19 shimizu Start
			// ===== 合計金額 チェック =====
			String totalPriceString = eShippingInst.getTotalPrice();
			if(!CU.isNullOrEmpty(totalPriceString)){
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", totalPriceString)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.TOTAL_PRICE_CHECK_NUMERIC_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
				if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", totalPriceString)) {
					// 整数7桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.TOTAL_PRICE_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", totalPriceString)) {
					// 小数3桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.TOTAL_PRICE_CHECK_INPUT_DECIMAL_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if ((WCC.toBigDecimal(totalPriceString).compareTo(WCC.toBigDecimal("0.001"))<0)) {
					// 最小0.001以上
					updateErrorExecute(eShippingInst, WmsMessageConst.TOTAL_PRICE_CHECK_INPUT_DECIMAL_MIN_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
			}

			// ===== 合計消費税 チェック =====
			String totalTaxString = eShippingInst.getTotalTax();
			if(!CU.isNullOrEmpty(totalTaxString)){
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", totalTaxString)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.TOTAL_TAX_CHECK_NUMERIC_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End

				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
				if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", totalTaxString)) {
					// 整数7桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.TOTAL_TAX_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", totalTaxString)) {
					// 小数3桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.TOTAL_TAX_CHECK_INPUT_DECIMAL_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if ((WCC.toBigDecimal(totalTaxString).compareTo(WCC.toBigDecimal("0.001"))<0)) {
					// 最小0.001以上
					updateErrorExecute(eShippingInst, WmsMessageConst.TOTAL_TAX_CHECK_INPUT_DECIMAL_MIN_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
			}
			// ===== 単価 チェック =====
			String unitPriceString = eShippingInst.getUnitPrice();
			if(!CU.isNullOrEmpty(unitPriceString)){
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", unitPriceString)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.UNIT_PRICE_CHECK_NUMERIC_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End

				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
				if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", unitPriceString)) {
					// 整数7桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.UNIT_PRICE_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", unitPriceString)) {
					// 小数3桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.UNIT_PRICE_CHECK_INPUT_DECIMAL_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if ((WCC.toBigDecimal(unitPriceString).compareTo(WCC.toBigDecimal("0.001"))<0)) {
					// 最小0.001以上
					updateErrorExecute(eShippingInst, WmsMessageConst.UNIT_PRICE_CHECK_INPUT_DECIMAL_MIN_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
			}

			// ===== 金額 チェック =====
			String priceString = eShippingInst.getPrice();
			if(!CU.isNullOrEmpty(priceString)){
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", priceString)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.PRICE_CHECK_NUMERIC_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End

				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
				if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", priceString)) {
					// 整数7桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.PRICE_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", priceString)) {
					// 小数3桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.PRICE_CHECK_INPUT_DECIMAL_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if ((WCC.toBigDecimal(priceString).compareTo(WCC.toBigDecimal("0.001"))<0)) {
					// 最小0.001以上
					updateErrorExecute(eShippingInst, WmsMessageConst.PRICE_CHECK_INPUT_DECIMAL_MIN_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
			}

			// ===== 消費税 チェック =====
			String taxString = eShippingInst.getTax();
			if(!CU.isNullOrEmpty(taxString)){
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", taxString)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.TAX_CHECK_NUMERIC_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End

				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
				if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", taxString)) {
					// 整数7桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.TAX_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", taxString)) {
					// 小数3桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.TAX_CHECK_INPUT_DECIMAL_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if ((WCC.toBigDecimal(taxString).compareTo(WCC.toBigDecimal("0.001"))<0)) {
					// 最小0.001以上
					updateErrorExecute(eShippingInst, WmsMessageConst.TAX_CHECK_INPUT_DECIMAL_MIN_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
			}

			// [#3677]金額データ連携　小数を許容するように修正 2018.02.19 shimizu End
			// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End


			// [#2253]予備項目対応 2017.08.18 sampei Start
			// ===== 予備項目１（文字列） チェック =====
			String spareStr1 = eShippingInst.getSpareStr1();
			if (!CU.isNullOrEmpty(spareStr1)) {
				if (!checkExcelCellInput(".{1,200}$", spareStr1)) {
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_STR1_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 予備項目２（文字列） チェック =====
			String spareStr2 = eShippingInst.getSpareStr2();
			if (!CU.isNullOrEmpty(spareStr2)) {
				if (!checkExcelCellInput(".{1,200}$", spareStr2)) {
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_STR2_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// ===== 予備項目３（文字列） チェック =====
			String spareStr3 = eShippingInst.getSpareStr3();
			if (!CU.isNullOrEmpty(spareStr3)) {
				if (!checkExcelCellInput(".{1,200}$", spareStr3)) {
					// 長さエラー
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_STR3_CHECK_INPUT_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
			}

			// [Ver3.0][#4056] 予備項目（数値）の小数桁数を3桁に修正 2018.03.22 shimizu Start
			// ===== 予備項目１（数値） チェック =====
			String spareNum1 = eShippingInst.getSpareNum1();
			if (!CU.isNullOrEmpty(spareNum1)) {
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", spareNum1)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_NUM1_CHECK_NUMERIC_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
				if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", spareNum1)) {
					// 整数7桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_NUM1_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", spareNum1)) {
					// 小数3桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_NUM1_CHECK_INPUT_DECIMAL_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if (WCC.isNegative(spareNum1)) {
					// 最小0以上
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_NUM1_CHECK_INPUT_MIN_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
			}

			// ===== 予備項目２（数値） チェック =====
			String spareNum2 = eShippingInst.getSpareNum2();
			if (!CU.isNullOrEmpty(spareNum2)) {
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", spareNum2)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_NUM2_CHECK_NUMERIC_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
				if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", spareNum2)) {
					// 整数7桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_NUM2_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", spareNum2)) {
					// 小数3桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_NUM2_CHECK_INPUT_DECIMAL_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if (WCC.isNegative(spareNum2)) {
					// 最小0以上
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_NUM2_CHECK_INPUT_MIN_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
			}

			// ===== 予備項目３（数値） チェック =====
			String spareNum3 = eShippingInst.getSpareNum3();
			if (!CU.isNullOrEmpty(spareNum3)) {
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu Start
				if (!checkExcelCellInput("^(-)?\\d+(\\.\\d+)?$", spareNum3)) {
					// 文字エラー
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_NUM3_CHECK_NUMERIC_ONLY_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [Ver3.0][#4007] 文字チェックの正規表現を変更 2018.04.10 shimizu End
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod Start
				if (!checkExcelCellInput("^(-)?[0-9]{1,7}+(\\.\\d+)?$", spareNum3)) {
					// 整数7桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_NUM3_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if (!checkExcelCellInput("^(-)?[0-9]+(\\.(?=.*[1-9])[0-9]{1,3})?$", spareNum3)) {
					// 小数3桁以内
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_NUM3_CHECK_INPUT_DECIMAL_MAX_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}

				if (WCC.isNegative(spareNum3)) {
					// 最小0以上
					updateErrorExecute(eShippingInst, WmsMessageConst.SPARE_NUM3_CHECK_INPUT_MIN_ERROR, doUpdate, outputLog);
					errorCount++;
					continue;
				}
				// [#4279][Ver3.0] 取込系処理 - 最大値チェック除去 2018.04.09 honma Mod End
			}
			// [Ver3.0][#4056] 予備項目（数値）の小数桁数を3桁に修正 2018.03.22 shimizu End
			// [#2253]予備項目対応 2017.08.18 sampei End

			// エラー無を設定
			updateNormalExecute(eShippingInst, doUpdate);
		}

		return errorCount;
	}
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod End

	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod Start
	/**
	 * <h2>関連マスタ存在チェック.</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param outputLog ログの書込み有無
	 * @return エラー件数
	 */
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
	public int checkErrorMaster(String receiveCd, String centerCd, String clientCd, OutputLog outputLog) {
	// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End

		int errorCount = 0;

		TShippingInstBDtoMapper tShippingInstBDtoMapper = new TShippingInstBDtoMapper();
		// [ON推-品向-1121] 届先上書チェックを削除 2016.04.21 kawana

		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(clientCd);
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(centerCd);
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana Start

		// 重複レコードチェック用マップ
		HashMap<HeaderKey, TShippingInstH> headerMap = new HashMap<HeaderKey, TShippingInstH>();
		HeaderKey currentHeaderKey = null;
		// [#5662][v3.1] 重複エラーが続いた時に、2行目以降はエラーが出力されない問題を修正 2018.11.28 kawana Start
		// 伝票重複エラー発生中フラグ
		boolean isSlipNoDuplicateError = false;
		// [#5662][v3.1] 重複エラーが続いた時に、2行目以降はエラーが出力されない問題を修正 2018.11.28 kawana End

		// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana End

		List<TShippingInstBDto> checkList = shippingPlanBulkInputSelectLogic.selectAndConvertEShippingInstList(receiveCd, centerCd, clientCd, ShippingPlanBulkInputSelectLogic.SelectCls.NO_ERROR_ONLY);
		for (TShippingInstBDto updDto : checkList) {

			// 納品先CD not_found
			if (updDto.getTShippingInstH().getMCustomerBySupplyCustomerId() != null && updDto.getTShippingInstH().getMCustomerBySupplyCustomerId().getCustomerId() == null) {
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD START
				//updateErrorExecute(eShippingInstBhv.selectByPKValue(updDto.getShippingInstReceiveId()), WmsMessageConst.SHIP_TO_CODE_NOT_FOUND_ERROR, DbUpdateForError.TRUE, outputLog);
				updateErrorExecute(eShippingInstBhv.selectByPKValue(updDto.getShippingInstReceiveId()), WmsMessageConst.SUPPLY_CUSTOMER_CD_NOT_FOUND_ERROR, DbUpdateForError.TRUE, outputLog);
				// [#7412][v3.1][OSS] 取引先マスタ未登録のエラーメッセージ見直し 2020/05/12 KAI MOD END
				errorCount++;
				continue;
			}

			//指定ロケーションCD not_found
			if (!CU.isNullOrEmpty(updDto.getWarehouseCd()) && !CU.isNullOrEmpty(updDto.getLocationCd()) && !updDto.getWarehouseCd().equals(updDto.getLctWarehouseCd())) {
				updateErrorExecute(eShippingInstBhv.selectByPKValue(updDto.getShippingInstReceiveId()), WmsMessageConst.LOCATION_CD_NOT_FOUND_ERROR, DbUpdateForError.TRUE, outputLog);
				errorCount++;
				continue;
			} else if (!CU.isNullOrEmpty(updDto.getLocationCd()) && updDto.getLocationId() == null) {
				updateErrorExecute(eShippingInstBhv.selectByPKValue(updDto.getShippingInstReceiveId()), WmsMessageConst.LOCATION_CD_NOT_FOUND_ERROR, DbUpdateForError.TRUE, outputLog);
				errorCount++;
				continue;
			}

			//届先CD not_found
			// [#380][2.1.0-CT-075] EDI経由の場合、届先CDが空だとエラーになる問題を修正 2016.12.06 kawana Start
			if (!CU.isNullOrEmpty(updDto.getTShippingInstH().getDelivCustomerCd()) && updDto.getTShippingInstH().getDelivCustomerId() == null) {
				// [#380][2.1.0-CT-075] EDI経由の場合、届先CDが空だとエラーになる問題を修正 2016.12.06 kawana End
				updateErrorExecute(eShippingInstBhv.selectByPKValue(updDto.getShippingInstReceiveId()), WmsMessageConst.DELIV_CUSTOMER_CD_NOT_FOUND_ERROR, DbUpdateForError.TRUE, outputLog);
				errorCount++;
				continue;
			}

			//配送コースCD
			//[ON推-1.1.4-CT-044]CT指摘の修正対応 2016.06.01 chou Del

			//商品ロット管理対象外
			if (updDto.getMProduct() != null && "0".equals(updDto.getMProduct().getLotManagFlg())) {
				if (!CU.isNullOrEmpty(updDto.getLot())) {
					updateErrorExecute(eShippingInstBhv.selectByPKValue(updDto.getShippingInstReceiveId()), WmsMessageConst.SHIPPING_LOT_MANAG_FLG_CANNOT_INPUT_EXCEPT_LOT_MANAGEMENT_PRODUCT_ERROR, DbUpdateForError.TRUE, outputLog);
					errorCount++;
					continue;
				}
			}

			// 商品期限日管理対象外
			if ( updDto.getMProduct() != null && "0".equals(updDto.getMProduct().getLimitDtManagFlg())) {
				if (!CU.isNullOrEmpty(updDto.getLimitDt())) {
					updateErrorExecute(eShippingInstBhv.selectByPKValue(updDto.getShippingInstReceiveId()), WmsMessageConst.SHIPPING_LIMIT_DT_MANAG_FLG_CANNOT_INPUT_EXCEPT_LIMIT_DT_MANAGEMENT_PRODUCT_ERROR, DbUpdateForError.TRUE, outputLog);
					errorCount++;
					continue;
				}
			}

			// 出荷指示ボディをエンティティに変換
			TShippingInstB tShippingInstB = tShippingInstBDtoMapper.mappingToEntity(updDto);

			// [ON推-品向-126] チェックを削除 2014.11.26 王忠勝

			// エラーチェックロジックでチェック済み為外す 2016.05.19 nayzaw

			// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana Start

			TShippingInstH header = tShippingInstB.getTShippingInstH();

			String clientShippingNo = header.getClientShippingNo();
			String supplyCustomerCd = header.getMCustomerBySupplyCustomerId().getCustomerCd();

			// ヘッダキー(顧客出荷指示No. と 納品先CD)
			HeaderKey headerKey = new HeaderKey(clientShippingNo, supplyCustomerCd);

			if (currentHeaderKey != null && currentHeaderKey.equals(headerKey)) {
				// 前行と同じ伝票

				// [#5662][v3.1] 重複エラーが続いた時に、2行目以降はエラーが出力されない問題を修正 2018.11.28 kawana Start
				if (isSlipNoDuplicateError) {
					// 伝票重複エラー中

					updateErrorExecute(eShippingInstBhv.selectByPKValue(tShippingInstB.getShippingInstReceiveId()), WmsMessageConst.SLIP_NO_DUPLICATE_ERROR, DbUpdateForError.TRUE, outputLog);
					errorCount++;
					continue;
				}
				// [#5662][v3.1] 重複エラーが続いた時に、2行目以降はエラーが出力されない問題を修正 2018.11.28 kawana End

				// ===== ヘッダ一致チェック =====

				ResultMatchHeader resultMatchHeader = checkMatchHeader(headerMap.get(currentHeaderKey), header);
				if (!resultMatchHeader.isMatch()) {
					// 不一致

					updateErrorExecute(eShippingInstBhv.selectByPKValue(tShippingInstB.getShippingInstReceiveId()), resultMatchHeader.getErrCd(), DbUpdateForError.TRUE,
							outputLog);
					errorCount++;
					continue;
				}
			} else {
				// 別伝票

				// 現在のヘッダキー更新
				currentHeaderKey = headerKey;

				// ===== ヘッダ重複チェック =====

				if (headerMap.containsKey(headerKey)) {
					// 既に存在している(行をまたいでいる)のでエラー

					updateErrorExecute(eShippingInstBhv.selectByPKValue(tShippingInstB.getShippingInstReceiveId()), WmsMessageConst.SLIP_NO_DUPLICATE_ERROR, DbUpdateForError.TRUE, outputLog);
					errorCount++;
					// [#5662][v3.1] 重複エラーが続いた時に、2行目以降はエラーが出力されない問題を修正 2018.11.28 kawana Start
					// 伝票重複エラー
					isSlipNoDuplicateError = true;
					// [#5662][v3.1] 重複エラーが続いた時に、2行目以降はエラーが出力されない問題を修正 2018.11.28 kawana End
					continue;
				} else {
					// 新規の伝票

					headerMap.put(headerKey, header);
					// [#5662][v3.1] 重複エラーが続いた時に、2行目以降はエラーが出力されない問題を修正 2018.11.28 kawana Start
					// 伝票重複エラーをクリア
					isSlipNoDuplicateError = false;
					// [#5662][v3.1] 重複エラーが続いた時に、2行目以降はエラーが出力されない問題を修正 2018.11.28 kawana End
				}
			}

			String workDt = header.getWorkDt();
			String shippingDt = header.getShippingDt();
			String delivDt = header.getDelivDt();
			String delivPlanDt = header.getDelivPlanDt();

			// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana End

			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.09 kawana Start
			if (!CU.isNullOrEmpty(delivPlanDt)) {
				// 納品予定日が入力されている場合

				// 出荷日比較
				if (shippingDt.compareTo(delivPlanDt) > 0) {
					updateErrorExecute(eShippingInstBhv.selectByPKValue(tShippingInstB.getShippingInstReceiveId()), WmsMessageConst.DELIV_PLAN_DATE_CANNOT_CHANGE_BEFORE_SHIP_DATE_ERROR, DbUpdateForError.TRUE, outputLog);
					errorCount++;
					continue;
				}

				// 作業日比較
				if (workDt.compareTo(delivPlanDt) > 0) {
					updateErrorExecute(eShippingInstBhv.selectByPKValue(tShippingInstB.getShippingInstReceiveId()), WmsMessageConst.DELIV_PLAN_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR, DbUpdateForError.TRUE, outputLog);
					errorCount++;
					continue;
				}
			}
			// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.09 kawana End
			if (delivDt != null) {
				if (shippingDt.compareTo(delivDt) > 0) {
					updateErrorExecute(eShippingInstBhv.selectByPKValue(tShippingInstB.getShippingInstReceiveId()), WmsMessageConst.DELIV_DATE_CANNOT_CHANGE_BEFORE_SHIP_DATE_ERROR, DbUpdateForError.TRUE, outputLog);
					errorCount++;
					continue;
				}
			}
			// [EC-CT1-003] 納品予定日を必須から任意に変更(作業日比較を移動) 2015.02.09 kawana
			if (workDt.compareTo(shippingDt) > 0) {
				updateErrorExecute(eShippingInstBhv.selectByPKValue(tShippingInstB.getShippingInstReceiveId()), WmsMessageConst.SHIP_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR, DbUpdateForError.TRUE, outputLog);
				errorCount++;
				continue;
			}

			// エラーチェックロジックでチェック済み為外す 2016.05.19 nayzaw
			if (!CU.isNullOrEmpty(clientShippingNo)) {
				TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
				cb.query().setClientId_Equal(clientId);
				cb.query().setSupplyCustomerCd_Equal(tShippingInstB.getTShippingInstH().getSupplyCustomerCd());
				cb.query().setClientShippingNo_Equal(clientShippingNo);
				// [ON推-品向-528] 一度取込んだ顧客出荷指示Noのデータをキャンセルして、再度同じデータを取込むと重複エラーを解消するために、追加 2015/01/13 許 Start
				cb.query().setShippingStatus_NotEqual_$90();
				// [ON推-品向-528] 一度取込んだ顧客出荷指示Noのデータをキャンセルして、再度同じデータを取込むと重複エラーを解消するために、追加 2015/01/13 許 End
				// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
				//センタID（Center_ID）
				cb.query().setCenterId_Equal(centerId);
				// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End

				int count = tShippingInstHBhv.selectCount(cb);
				if (count > 0) {
					// 顧客出荷指示No.存在チェックのエラーメッセージを設定
					// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
					updateErrorExecute(eShippingInstBhv.selectByPKValue(tShippingInstB.getShippingInstReceiveId()), WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR, DbUpdateForError.TRUE, outputLog);
					errorCount++;
					continue;
					// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
				}
			}
			// [ON推-品向-126] チェックを修正 2014.11.26 王忠勝 End
			// [C-CWMS-0052] 届先入力追加に伴い、届先の設定を変更 2015.11.18 koyama
			// [C-CWMS-0021] ワンタイム導入に伴い納品先、届先の設定を変更 2015.03.24 kawana

			// エラーチェックロジックでチェック済み為外す 2016.05.19 nayzaw
		}

		return errorCount;
	}
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod End


	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod Start
	/**
	 * <h2>入荷予定受信テーブルのエラー設定.</h2>
	 */
	private void updateErrorExecute(EShippingInst eShippingInst, String errorMessageCd, DbUpdateForError doUpdate, OutputLog outputLog) {
		eShippingInst.setErrorFlg("1");
		eShippingInst.setErrorMessageCd(errorMessageCd);
		if (doUpdate == DbUpdateForError.TRUE) {
			eShippingInstBhv.update(eShippingInst);
		}
		if (outputLog == OutputLog.TRUE) {
			// エラー内容ログ書込開始
			addErrorCheckLogDtl(WmsMessageConst.BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION, CU.convertNumberToString(eShippingInst.getReceiveRowId()), errorMessageCd);
		}
	}
	// [#557][Ver2.1.0-品質検査] 一括取込系（バッチ化対応）ログメッセージ不正の修正 2016.12.27 honma Mod End

	/**
	 * <h2>入荷予定受信テーブルのエラー無し設定.</h2>
	 */
	private void updateNormalExecute(EShippingInst eShippingInst, DbUpdateForError doUpdate) {
		eShippingInst.setErrorFlg("0");
		eShippingInst.setErrorMessageCd(null);
		if (doUpdate == DbUpdateForError.TRUE) {
			eShippingInstBhv.update(eShippingInst);
		}
	}

	/**
	 * <h2>正規表現はチェック。</h2>
	 * @param patternStr 正規表現のコンテンツ
	 * @param inputStr ジャッジのコンテンツ
	 * @return boolean
	 * */
	public boolean checkExcelCellInput(String patternStr, String inputStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}

	/**
	 * <h2>日付を「yyyyMMdd」形式へ変換する。</h2>
	 * <pre>
	 * 次の形式の日付文字列に対応
	 * yyyy/MM/dd
	 * yy/MM/dd
	 * yyyy-MM-dd
	 * yy-MM-dd
	 * yyyyMMdd
	 * yyyy/M/d
	 * yy/M/d
	 * yyyy-M-d
	 * yy-M-d
	 * </pre>
	 * @param dateString 日付文字列
	 * @return yyyyMMddに変換した文字列
	 */
	public String dateRegExp(String pattern) {
		String temp = "";
		for (int i = 0; i < pattern.length(); i++) {
			if (pattern.substring(i, i + 1).equals("/")) {
				temp += "\\/";
			} else if (pattern.substring(i, i + 1).equals(".")) {
				temp += "\\.";
			} else {
				temp += pattern.substring(i, i + 1);
			}
		}
		pattern = temp;
		pattern = pattern.replace("yyyy", "(19[0-9]{2}|[2-9]{1}[0-9]{1}[0-9]{2})"); //1900-9999
		pattern = pattern.replace("yy", "([0-9]{2})"); //00-99
		pattern = pattern.replace("MM", "(0[1-9]|1[0-2])");
		pattern = pattern.replace("M", "([1-9]|1[0-2])");
		pattern = pattern.replace("dd", "(3[01]|[12][0-9]|0[1-9])");
		pattern = pattern.replace("d", "(3[01]|[12][0-9]|[1-9])");
		pattern = "^" + pattern + "$";
		return pattern;
	}

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.27 honma end

	// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana Start

	/**
	 * ヘッダ項目一致チェック
	 */
	private static class ResultMatchHeader {

		private boolean isMatch;
		private String errCd;

		public ResultMatchHeader(boolean isMatch) {
			this.isMatch = true;
		}

		public ResultMatchHeader(boolean isMatch, String errCd) {
			this.isMatch = isMatch;
			this.errCd = errCd;
		}

		public boolean isMatch() {
			return isMatch;
		}

		public String getErrCd() {
			return errCd;
		}
	}

	/**
	 * ヘッダ項目が一致しているか
	 */
	private ResultMatchHeader checkMatchHeader(TShippingInstH header1, TShippingInstH header2) {

		if (!CU.equals(header1.getWorkDt(), header2.getWorkDt())) {
			// 作業日 不一致

			return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_WORK_DT_ERROR);
		}

		if (!CU.equals(header1.getShippingDt(), header2.getShippingDt())) {
			// 出荷日 不一致

			return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_SHIPPING_DT_ERROR);
		}

		if (!CU.equals(header1.getMDeliveryCourse().getDeliveryCourseCd(), header2.getMDeliveryCourse().getDeliveryCourseCd())) {
			// 配送コースCD 不一致

			return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIVERY_COURSE_ERROR);
		}

		if (!CU.equals(header1.getEmergencyFlg(), header2.getEmergencyFlg())) {
			// 緊急フラグCD 不一致

			return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_EMERGENCY_FLG_ERROR);
		}

		if (!CU.equals(header1.getDelivDt(), header2.getDelivDt())) {
			// 納品指定日 不一致

			return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_DT_ERROR);
		}

		if (!CU.equals(header1.getDelivPlanDt(), header2.getDelivPlanDt())) {
			// 納品予定日 不一致

			return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_PLAN_DT_ERROR);
		}

		if (!CU.equals(header1.getDelivTz(), header2.getDelivTz())) {
			// 納品時間帯CD 不一致

			return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_TZ_ERROR);
		}

		if (!CU.equals(header1.getDelivAddressSupply(), header2.getDelivAddressSupply())) {
			// 住所補足 不一致

			return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_ADDRESS_SUPPLY_ERROR);
		}

		if (!CU.equals(header1.getMProcessType().getProcessTypeCd(), header2.getMProcessType().getProcessTypeCd())) {
			// 処理区分CD 不一致

			return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_PROCESS_TYPE_ERROR);
		}

		if (!WCC.isEqual(header1.getTotalPrice(), header2.getTotalPrice())) {
			// 合計金額 不一致

			return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_TOTAL_PRICE_ERROR);
		}

		if (!WCC.isEqual(header1.getTotalTax(), header2.getTotalTax())) {
			// 合計消費税 不一致

			return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_TOTAL_TAX_ERROR);
		}

		if (!CU.equals(header1.getPickingWorkMessage(), header2.getPickingWorkMessage())) {
			// 出庫作業メッセージ 不一致

			return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_PICKING_WORK_MESSAGE_ERROR);
		}

		// [#5662][v3.1] 届先CDはワンタイムにかかわらず不一致チェックを行うように変更 2018.12.03 kawana Start

		if (!CU.equals(header1.getDelivCustomerCd(), header2.getDelivCustomerCd())) {
			// 届先CD

			return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_CUSTOMER_CD_ERROR);
		}

		if (header1.getMCustomerBySupplyCustomerId().isOnetimeFlg$1() && header2.getMCustomerBySupplyCustomerId().isOnetimeFlg$1()) {
			// ワンタイムの届先 (届先の一致を確認) ※エラー内容を統一するためheader2のワンタイムフラグも確認する

			// [#5662][v3.1] 届先CDはワンタイムにかかわらず不一致チェックを行うように変更 2018.12.03 kawana End

			if (!CU.equals(header1.getDelivCustomerNm(), header2.getDelivCustomerNm())) {
				// 届先名称

				return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_CUSTOMER_NM_ERROR);
			}

			if (!CU.equals(header1.getDelivZipCd(), header2.getDelivZipCd())) {
				// 届先郵便番号

				return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_ZIP_CD_ERROR);
			}
			if (!CU.equals(header1.getDelivAddress1(), header2.getDelivAddress1())) {
				// 届先住所1

				return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_ADDRESS_ERROR);
			}
			if (!CU.equals(header1.getDelivAddress2(), header2.getDelivAddress2())) {
				// 届先住所2

				return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_ADDRESS_ERROR);
			}
			if (!CU.equals(header1.getDelivAddress3(), header2.getDelivAddress3())) {
				// 届先住所3

				return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_ADDRESS_ERROR);
			}
			if (!CU.equals(header1.getDelivTelNo(), header2.getDelivTelNo())) {
				// 届先電話番号

				return new ResultMatchHeader(false, WmsMessageConst.DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_TEL_NO_ERROR);
			}
		}

		return new ResultMatchHeader(true);
	}

	/**
	 * ヘッダキー
	 */
	private static class HeaderKey {

		/** 顧客出荷指示No. */
		private String clientShippingNo;
		/** 納品先CD */
		private String supplyCustomerCd;

		public HeaderKey(String clientShippingNo, String supplyCustomerCd) {
			this.clientShippingNo = clientShippingNo;
			this.supplyCustomerCd = supplyCustomerCd;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((clientShippingNo == null) ? 0 : clientShippingNo.hashCode());
			result = prime * result + ((supplyCustomerCd == null) ? 0 : supplyCustomerCd.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			HeaderKey other = (HeaderKey) obj;
			if (clientShippingNo == null) {
				if (other.clientShippingNo != null)
					return false;
			} else if (!clientShippingNo.equals(other.clientShippingNo))
				return false;
			if (supplyCustomerCd == null) {
				if (other.supplyCustomerCd != null)
					return false;
			} else if (!supplyCustomerCd.equals(other.supplyCustomerCd))
				return false;
			return true;
		}
	}

	// [#4624] ヘッダ項目重複チェック不正を修正 2018.05.21 kawana End

}