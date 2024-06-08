package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MCenterCustomerCB;
import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.cbean.WCustomerInputCB;
import com.oneslogi.base.dbflute.exbhv.MCenterCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.WCustomerInputBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterCustomer;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dbflute.exentity.WCustomerInput;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.common.DataInputDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.CenterCustomerLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.DataInputLogic;
import com.oneslogi.wms.logic.common.DeliveryCourseLogic;
import com.oneslogi.wms.logic.common.ZipLogic;
import com.oneslogi.wms.util.WCU;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * 取引先マスタ取込サブロジッククラス
 */
public class CustomerInputSubLogic extends DataInputLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCustomerBhv mCustomerBhv;
	@Inject
	private MCenterCustomerBhv mCenterCustomerBhv;
	@Inject
	private WCustomerInputBhv wCustomerInputBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private CenterCustomerLogic centerCustomerLogic;
	@Inject
	private CustomerMasterInsertLogic customerMasterInsertLogic;
	@Inject
	private ZipLogic zipLogic;
	// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add Start
	@Inject
	private CenterClassLogic centerClassLogic;
	// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add End

	/**
	 * <h2>取引先マスタ取込ワークテーブルを登録する（コミットあり）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを取引先マスタ取込ワークテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWCustomerInput 取引先マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWorkWithCommit(DataInputDto dataInputDto, List<WCustomerInput> lstWCustomerInput, ErrorStatus errSts) {
		registerWork(dataInputDto, lstWCustomerInput, errSts);
	}

	/**
	 * <h2>取引先マスタ取込ワークテーブルを登録する（コミットなし）。</h2>
	 * <pre>
	 * アップロードファイルから取込したデータを取引先マスタ取込ワークテーブルに登録する。
	 *</pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWCustomerInput 取引先マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void registerWork(DataInputDto dataInputDto, List<WCustomerInput> lstWCustomerInput, ErrorStatus errSts) {
		wCustomerInputBhv.batchInsert(lstWCustomerInput);
	}

	/**
	 * <h2>取引先マスタ取込ワークテーブルを全件削除する（コミットあり）。</h2>
	 * <pre>
	 * 在庫データワーク取込が全削除後追記の場合、取引先マスタ取込ワークを事前に削除する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWorkWithCommit(ErrorStatus errSts) {
		deleteWork(errSts);
	}

	/**
	 * <h2>取引先マスタ取込ワークテーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 在庫データワーク取込が全削除後追記の場合、取引先マスタ取込ワークを事前に削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deleteWork(ErrorStatus errSts) {
		//「取引先マスタ取込ワーク」テーブルを全件削除する
		try {
			WCustomerInputCB wCustomerInputCB = wCustomerInputBhv.newConditionBean();
			wCustomerInputBhv.varyingQueryDelete(wCustomerInputCB, op -> op.allowNonQueryDelete());
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, wCustomerInputBhv.asTableDbName().toUpperCase());
			return;
		}
	}

	/**
	 * <h2>取引先マスタを移行する（コミットあり）。</h2>
	 * <pre>
	 * 取引先マスタ登録を呼出し、取引先マスタテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWCustomerInput 取引先マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void registerWithCommit(DataInputDto dataInputDto, List<WCustomerInput> lstWCustomerInput, ErrorStatus errSts) throws Exception {
		register(dataInputDto, lstWCustomerInput, errSts);
	}

	/**
	 * <h2>取引先マスタを移行する（コミットなし）。</h2>
	 * <pre>
	 * 取込データをチェックして、取引先マスタテーブルに登録する。
	 * </pre>
	 * @param dataInputDto 初期データ取込DTO
	 * @param lstWCustomerInput 取引先マスタ取込ワークリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void register(DataInputDto dataInputDto, List<WCustomerInput> lstWCustomerInput, ErrorStatus errSts) throws Exception {

		// [Ver3.0][#4636] チェック用に用いるリストが不要となったため、除去 2018.05.22 shimizu

		// [C-CWMS-0039] センタ間移動機能を追加(不要な処理を削除) 2015.09.17 kawana
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add Start
		// ===== 各種区分値CDより区分値明細マスタマップ取得 =====
		// 仕入先フラグ
		Map<String, String> vendorFlgMap = centerClassLogic.getClassMapByCd("VENDOR_FLG");
		// 納品先フラグ
		Map<String, String> deliveryFlgMap = centerClassLogic.getClassMapByCd("DELIVERY_FLG");
		// ワンタイムフラグ
		Map<String, String> onetimeFlgMap = centerClassLogic.getClassMapByCd("ONETIME_FLG");
		// 預託先フラグ
		Map<String, String> depositFlgMap = centerClassLogic.getClassMapByCd("DEPOSIT_FLG");
		// 期限日逆転防止フラグ
		Map<String, String> shippingStopFlgMap = centerClassLogic.getClassMapByCd("SHIPPING_STOP_FLG");
		// 出荷停止フラグ
		Map<String, String> limitDtReverseFlgMap = centerClassLogic.getClassMapByCd("LIMIT_DT_REVERSE_FLG");
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add End

		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add Start
		// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu Start
		// 荷主CDと取引先CDの重複チェック用Set
		Set<String> clientCustomerCdSet = new HashSet<>();
		// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu End
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Add End

		for (WCustomerInput wCustomerInput : lstWCustomerInput) {
			MCustomer mCustomer = new MCustomer();
			List<MCenterCustomer> lstMCenterCustomer = new ArrayList<MCenterCustomer>();

			getErrorManager().clear();

			// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod Start
			// 取込データのチェック処理を行う
			checkRegister(wCustomerInput, mCustomer, lstMCenterCustomer, clientCustomerCdSet, vendorFlgMap, deliveryFlgMap, onetimeFlgMap
					, depositFlgMap, shippingStopFlgMap, limitDtReverseFlgMap, errSts);
			// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod End
			if (getErrorManager().size() > 0) {
				setErrorMessage(wCustomerInput, getErrorManager());
				wCustomerInputBhv.update(wCustomerInput);

				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
			// [ON推-品向-920] 荷主マスタ、センタマスタの取引先IDを設定しないように修正 2015.07.30 kawana Start
			// 取引先マスタ登録処理を行う
			customerMasterInsertLogic.insert(mCustomer, lstMCenterCustomer, errSts);
			// [ON推-品向-920] 荷主マスタ、センタマスタの取引先IDを設定しないように修正 2015.07.30 kawana End
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End

			if (getErrorManager().size() > 0) {
				setErrorMessage(wCustomerInput, getErrorManager());
				wCustomerInputBhv.update(wCustomerInput);

				dataInputDto.addError();
				if (dataInputDto.isOverErrorLimit()) {
					break;
				}
				continue;
			}

			wCustomerInput.setWorkFlg(CDef.WorkFlg.$1.code());
			wCustomerInputBhv.update(wCustomerInput);
			dataInputDto.addSuccess();
		}
	}

	/**
	 * <h2>取込データのチェックを行う。</h2>
	 * <pre>
	 * 取込データを取得し、下記のチェックを行う。
	 *・荷主CDの存在チェック
	 *・センタCDの存在チェック
	 *・配送コースCDの存在チェック
	 *・取引先CDの必須チェック
	 *・取引先名称の必須チェック
	 *・取引先略称の必須チェック
	 *・納品先フラグの必須チェック
	 *・納品先フラグの区分値明細マスタ存在チェック
	 *・ワンタイムフラグの必須チェック
	 *・ワンタイムフラグの区分値明細マスタ存在チェック
	 *・仕入先フラグの必須チェック
	 *・仕入先フラグの区分値明細マスタ存在チェック
	 *・預託先フラグの必須チェック
	 *・預託先フラグの区分値明細マスタ存在チェック
	 *・引当順序の必須チェック
	 *・出荷停止フラグの必須チェック
	 *・出荷停止フラグの区分値明細マスタ存在チェック
	 *・期限日逆転防止フラグの必須チェック
	 *・期限日逆転防止フラグの区分値明細マスタ存在チェック
	 *・郵便番号の存在チェック
	 *・配送順項目の１以上チェック
	 *・配送リードタイム項目の１以上チェック
	 *・取引先CDの重複チェック
	 * チェックNGの場合、エラーをエラーステータスに設定する。
	 *
	 * 取引先マスタ取込ワークのセンタCDと取引先CDによりセンタ取引先マスタ情報を取得し、
	 * 引数のセンタ取引先マスタに設定する。
	 * 引数の取引先マスタに取引先マスタ取込ワーク情報を設定する。
	 * </pre>
	 * @param wCustomerInput 取引先マスタ取込ワーク：全項目
	 * @param mCustomer 取引先マスタ
	 * @param lstMCenterCustomer センタ取引先マスタ配列
	 * @param clientCustomerCdSet 荷主CDと取引先CDの重複チェック用Set
	 * @param vendorFlgMap 仕入先フラグ区分値明細マスタマップ
	 * @param deliveryFlgMap 納品先フラグ区分値明細マスタマップ
	 * @param onetimeFlgMap ワンタイムフラグ区分値明細マスタマップ
	 * @param depositFlgMap 預託先フラグ区分値明細マスタマップ
	 * @param shippingStopFlgMap 期限日逆転防止区分値明細マスタマップ
	 * @param limitDtReverseFlgMap 出荷停止フラグ区分値明細マスタマップ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkRegister(WCustomerInput wCustomerInput, MCustomer mCustomer, List<MCenterCustomer> lstMCenterCustomer
			, Set<String> clientCustomerCdSet, Map<String, String> vendorFlgMap, Map<String, String> deliveryFlgMap, Map<String, String> onetimeFlgMap
			, Map<String, String> depositFlgMap, Map<String, String> shippingStopFlgMap, Map<String, String> limitDtReverseFlgMap, ErrorStatus errSts) {
		MCenterCustomer mCenterCustomer = null;
		// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu Start
		String clientCustomerCd = "";
		// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu End

		wCustomerInput.setErrorFlg(CDef.ErrorFlg.$0.code());
		wCustomerInput.setErrorMsg("");

		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod Start
		// 項目チェック
		// 荷主CD
		if (CU.isNullOrEmpty(wCustomerInput.getClientCd())) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z\\-]*$", wCustomerInput.getClientCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z\\-]{1,5}$", wCustomerInput.getClientCd())) {
				// 長さ(桁数)エラー
				getErrorManager().add(errSts, WmsMessageConst.CLIENT_CD_CHECK_INPUT_MAX_ERROR, "5");
			}
		}

		// ===== 荷主Cd取得と荷主ID設定 =====
		String clientCd = wCustomerInput.getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
		} else {
			mCustomer.setClientId(mClient.getClientId());
			mCustomer.setMClient(mClient);
			// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu Start
			clientCustomerCd = mClient.getClientCd() + "\t";
			// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu End
		}

		// 取引先CD
		if (CU.isNullOrEmpty(wCustomerInput.getCustomerCd())) {
			getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_CD_NOT_INPUT_ERROR);
		} else {
			// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu Start
			clientCustomerCd += wCustomerInput.getCustomerCd();
			// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu End
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z\\-]*$", wCustomerInput.getCustomerCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_CODE_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z\\-]{1,10}$", wCustomerInput.getCustomerCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_CODE_CHECK_INPUT_MAX_ERROR);
			}
			// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu Start
			if(clientCustomerCdSet.contains(clientCustomerCd)) {
				// ファイル内重複エラー
				getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_CODE_DUPLICATE_ERROR);
			}
			// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu End
		}
		// 取引先名称
		if (CU.isNullOrEmpty(wCustomerInput.getCustomerNm())) {
			getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_NM_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput(".{1,50}$", wCustomerInput.getCustomerNm())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_NM_CHECK_INPUT_MAX_ERROR);
			}
		}
		// 取引先略称
		if (CU.isNullOrEmpty(wCustomerInput.getCustomerAbbr())) {
			getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_ABBR_NOT_INPUT_ERROR);
		} else {
			if (!WmsCommonUtil.checkPatternInput(".{1,15}$", wCustomerInput.getCustomerAbbr())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_ABBR_CHECK_INPUT_MAX_ERROR);
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod Start
		// 納品先フラグ
		if (CU.isNullOrEmpty(wCustomerInput.getDeliveryFlg())) {
			getErrorManager().add(errSts, WmsMessageConst.DELIVERY_FLG_NOT_INPUT_ERROR);
		} else {
			// 区分値明細マスタ存在チェック
			if (!deliveryFlgMap.containsKey(wCustomerInput.getDeliveryFlg())) {
				getErrorManager().add(errSts, WmsMessageConst.DELIVERY_FLG_NOT_FOUND_ERROR);
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod End
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add Start
		// ワンタイムフラグ
		if (CU.isNullOrEmpty(wCustomerInput.getOnetimeFlg())) {
			getErrorManager().add(errSts, WmsMessageConst.ONETIME_FLG_NOT_INPUT_ERROR);
		} else {
			// 区分値明細マスタ存在チェック
			if (!onetimeFlgMap.containsKey(wCustomerInput.getOnetimeFlg())) {
				getErrorManager().add(errSts, WmsMessageConst.ONETIME_FLG_NOT_FOUND_ERROR);
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Add End
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod Start
		// 仕入先フラグ
		if (CU.isNullOrEmpty(wCustomerInput.getVendorFlg())) {
			getErrorManager().add(errSts, WmsMessageConst.VENDOR_FLG_NOT_INPUT_ERROR);
		} else {
			// 区分値明細マスタ存在チェック
			if (!vendorFlgMap.containsKey(wCustomerInput.getVendorFlg())) {
				getErrorManager().add(errSts, WmsMessageConst.VENDOR_FLG_NOT_FOUND_ERROR);
			}
		}
		// 預託先フラグ
		if (CU.isNullOrEmpty(wCustomerInput.getDepositFlg())) {
			getErrorManager().add(errSts, WmsMessageConst.DEPOSIT_FLG_NOT_INPUT_ERROR);
		} else {
			// 区分値明細マスタ存在チェック
			if (!depositFlgMap.containsKey(wCustomerInput.getDepositFlg())) {
				getErrorManager().add(errSts, WmsMessageConst.DEPOSIT_FLG_NOT_FOUND_ERROR);
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod End
		// 引当順序
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (CU.isNullOrEmpty(wCustomerInput.getAllocOrder())) {
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			getErrorManager().add(errSts, WmsMessageConst.ALLOC_ORDER_NOT_INPUT_ERROR);
		} else {
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			String strAllocOrder = wCustomerInput.getAllocOrder();
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			if (!WmsCommonUtil.checkPatternInput("^(-)?\\d+(\\.\\d+)?$", strAllocOrder)) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.ALLOC_ORDER_CHECK_NUMERIC_ONLY_ERROR);
			// [Ver3.0][#3892] 最小値、最大値のチェック前に小数チェックを行うよう修正 2018.03.01 shimizu Start
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!WmsCommonUtil.checkPatternInput("^(-)?[0-9]{1,5}+(\\.\\d+)?$", strAllocOrder)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数5桁以内
				getErrorManager().add(errSts, WmsMessageConst.ALLOC_ORDER_CHECK_INPUT_INTEGER_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!WmsCommonUtil.checkPatternInput("^(-)?\\d+$", strAllocOrder)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数0桁以内
				getErrorManager().add(errSts, WmsMessageConst.ALLOC_ORDER_CHECK_INPUT_DECIMAL_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (Long.valueOf(strAllocOrder).longValue() < 0) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小0以上
				getErrorManager().add(errSts, WmsMessageConst.ALLOC_ORDER_INPUT_REQUEST_MIN_IS_ZERO_ERROR);
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod Start
		// 出荷停止フラグ
		if (CU.isNullOrEmpty(wCustomerInput.getShippingStopFlg())) {
			getErrorManager().add(errSts, WmsMessageConst.SHIPPING_STOP_FLG_NOT_INPUT_ERROR);
		} else {
			// 区分値明細マスタ存在チェック
			if (!shippingStopFlgMap.containsKey(wCustomerInput.getShippingStopFlg())) {
				getErrorManager().add(errSts, WmsMessageConst.SHIPPING_STOP_FLG_NOT_FOUND_ERROR);
			}
		}
		// 期限日逆転防止フラグ
		if (CU.isNullOrEmpty(wCustomerInput.getLimitDtReverseFlg())) {
			getErrorManager().add(errSts, WmsMessageConst.LIMIT_DT_REVERSE_FLG_NOT_INPUT_ERROR);
		} else {
			// 区分値明細マスタ存在チェック
			if (!limitDtReverseFlgMap.containsKey(wCustomerInput.getLimitDtReverseFlg())) {
				getErrorManager().add(errSts, WmsMessageConst.LIMIT_DT_REVERSE_FLG_NOT_FOUND_ERROR);
			}
		}
		// [#3614][Ver3.0] 初期データ取込 - 区分値明細マスタ存在チェック処理追加 2018.03.14 honma Mod End
		// 郵便番号
		if (!CU.isNullOrEmpty(wCustomerInput.getZipCd())) {
			MZip mZip = new MZip();
			mZip.setZipCd(wCustomerInput.getZipCd());
			zipLogic.bulkInputCheckZipCd(mZip, "^[0-9]*$", "[0-9]{1,7}$", "7", errSts);
		}
		// 住所
		if (!CU.isNullOrEmpty(wCustomerInput.getAddress1())) {
			if (!WmsCommonUtil.checkPatternInput(".{1,50}$", wCustomerInput.getAddress1())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ADDRESS1_CHECK_INPUT_MAX_ERROR);
			}
		}
		if (!CU.isNullOrEmpty(wCustomerInput.getAddress2())) {
			if (!WmsCommonUtil.checkPatternInput(".{1,50}$", wCustomerInput.getAddress2())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ADDRESS2_CHECK_INPUT_MAX_ERROR);
			}
		}
		if (!CU.isNullOrEmpty(wCustomerInput.getAddress3())) {
			if (!WmsCommonUtil.checkPatternInput(".{1,50}$", wCustomerInput.getAddress3())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.ADDRESS3_CHECK_INPUT_MAX_ERROR);
			}
		}
		// 電話番号
		if (!CU.isNullOrEmpty(wCustomerInput.getTelNo())) {
			if (!WmsCommonUtil.checkPatternInput("^[0-9\\-]*$", wCustomerInput.getTelNo())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.TEL_NO_CHECK_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9\\-]{1,15}$", wCustomerInput.getTelNo())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.TEL_NO_CHECK_INPUT_MAX_ERROR);
			}
		}
		// センタCD
		if (!CU.isNullOrEmpty(wCustomerInput.getCenterCd())) {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z\\-]*$", wCustomerInput.getCenterCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput("[0-9a-zA-Z\\-]{1,5}$", wCustomerInput.getCenterCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.CENTER_CD_CHECK_INPUT_MAX_ERROR, "5");
			}
		}
		// 配送コースCD
		if (!CU.isNullOrEmpty(wCustomerInput.getDeliveryCourseCd())) {
			if (!WmsCommonUtil.checkPatternInput("^[0-9a-zA-Z\\-]*$", wCustomerInput.getDeliveryCourseCd())) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.DELIVERY_COURSE_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR);
			}
			if (!WmsCommonUtil.checkPatternInput(".{1,5}$", wCustomerInput.getDeliveryCourseCd())) {
				// 長さエラー
				getErrorManager().add(errSts, WmsMessageConst.DELIVERY_COURSE_CD_CHECK_INPUT_MAX_ERROR);
			}
		}
		// 配送順
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wCustomerInput.getDeliveryOrder())) {
			String strDeliveryOrder = wCustomerInput.getDeliveryOrder();
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			if (!WmsCommonUtil.checkPatternInput("^(-)?\\d+(\\.\\d+)?$", strDeliveryOrder)) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.DELIVERY_ORDER_CHECK_NUMERIC_ONLY_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!WmsCommonUtil.checkPatternInput("^(-)?[0-9]{1,5}+(\\.\\d+)?$", strDeliveryOrder)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数5桁以内
				getErrorManager().add(errSts, WmsMessageConst.DELIVERY_ORDER_CHECK_INPUT_INTEGER_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!WmsCommonUtil.checkPatternInput("^(-)?\\d+$", strDeliveryOrder)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数0桁以内
				getErrorManager().add(errSts, WmsMessageConst.DELIVERY_ORDER_CHECK_INPUT_DECIMAL_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (Long.valueOf(strDeliveryOrder).longValue() <= 0) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小1以上
				getErrorManager().add(errSts, WmsMessageConst.DELIVERY_ORDER_INPUT_REQUEST_MIN_IS_ONE_ERROR);
			}
		}
		// 配送リードタイム
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		if (!CU.isNullOrEmpty(wCustomerInput.getDeliveryReadTime())) {
			String strDeliveryReadTime = wCustomerInput.getDeliveryReadTime();
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
			if (!WmsCommonUtil.checkPatternInput("^(-)?\\d+(\\.\\d+)?$", strDeliveryReadTime)) {
				// 文字種エラー
				getErrorManager().add(errSts, WmsMessageConst.DELIVERY_READTIME_CHECK_NUMERIC_ONLY_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!WmsCommonUtil.checkPatternInput("^(-)?[0-9]{1,5}+(\\.\\d+)?$", strDeliveryReadTime)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 整数5桁以内
				getErrorManager().add(errSts, WmsMessageConst.DELIVERY_READTIME_CHECK_INPUT_INTEGER_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (!WmsCommonUtil.checkPatternInput("^(-)?\\d+$", strDeliveryReadTime)) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 小数0桁以内
				getErrorManager().add(errSts, WmsMessageConst.DELIVERY_READTIME_CHECK_INPUT_DECIMAL_ERROR);
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			} else if (Long.valueOf(strDeliveryReadTime).longValue() <= 0) {
				// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
				// 最小1以上
				getErrorManager().add(errSts, WmsMessageConst.DELIVERY_READ_TIME_INPUT_REQUEST_MIN_IS_ONE_ERROR);
			}
		}

		if (!CU.isNullOrEmpty(wCustomerInput.getCenterCd())) {
			// ===== センタCd取得とセンタID設定 =====
			String centerCd = wCustomerInput.getCenterCd();
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(centerCd);
			mCenter = centerLogic.getUkEntity(mCenter);
			if (mCenter == null) {
				getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			} else {
				mCenterCustomer = new MCenterCustomer();
				mCenterCustomer.setCenterId(mCenter.getCenterId());
				mCenterCustomer.setMCenter(mCenter);

				// ===== 配送コースCd取得と配送コースID設定 =====
				if (!CU.isNullOrEmpty(wCustomerInput.getDeliveryCourseCd())) {
					String deliveryCourseCd = wCustomerInput.getDeliveryCourseCd();
					MDeliveryCourse mDeliveryCourse = new MDeliveryCourse();
					mDeliveryCourse.setCenterId(mCenter.getCenterId());
					mDeliveryCourse.setDeliveryCourseCd(deliveryCourseCd);
					mDeliveryCourse = deliveryCourseLogic.getUkEntity(mDeliveryCourse);
					if (mDeliveryCourse == null) {
						// [#169] メッセージの重複を削除 2016.12.05 kawana Start
						getErrorManager().add(errSts, WmsMessageConst.DELIVERY_COURSE_CD_NOT_FOUND_ERROR);
						// [#169] メッセージの重複を削除 2016.12.05 kawana End
					} else {
						mCenterCustomer.setDeliveryCourseId(mDeliveryCourse.getDeliveryCourseId());
					}
				}
			}
		}
		// [#3619][Ver3.0] 初期データ取込 - エラーチェック処理修正 2018.03.20 honma Mod End

		// 取引先CD重複チェック
		if (!CU.isNullOrEmpty(wCustomerInput.getCustomerCd())) {
			mCustomer.setCustomerCd(wCustomerInput.getCustomerCd());

			// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu Start
			if(!clientCustomerCdSet.contains(clientCustomerCd)) {
				if (mClient != null) {
					customerLogic.checkCustomerCdInsert(mCustomer, errSts);
				}
			} else {
				MCustomer mc = customerLogic.getUkEntity(mCustomer, errSts);
				mCustomer.setCustomerId(mc.getCustomerId());
				if (mCenterCustomer != null) {
					mCenterCustomer.setCustomerId(mCustomer.getCustomerId());
					List<MCenterCustomer> lstMcc = centerCustomerLogic.getUkList(mCenterCustomer, errSts);
					for (MCenterCustomer mcc : lstMcc) {
						lstMCenterCustomer.add(mcc);
					}
				}
			}
			// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu End
			if (mCenterCustomer != null) {
				lstMCenterCustomer.add(mCenterCustomer);
			}
		}

		if (getErrorManager().size() > 0) {
			return;
		}

		// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu Start
		if(!clientCustomerCdSet.contains(clientCustomerCd)) {
			// 重複チェック用リストに追加
			clientCustomerCdSet.add(clientCustomerCd);
		}
		// [Ver3.0][#4636] 異なる荷主CDに対し、同じ取引先CDを登録できるよう修正 2018.05.22 shimizu End

		mCustomer.setCustomerNm(wCustomerInput.getCustomerNm());
		mCustomer.setCustomerAbbr(wCustomerInput.getCustomerAbbr());
		mCustomer.setZipCd(wCustomerInput.getZipCd());
		mCustomer.setTelNo(wCustomerInput.getTelNo());
		mCustomer.setAddress1(wCustomerInput.getAddress1());
		mCustomer.setAddress2(wCustomerInput.getAddress2());
		mCustomer.setAddress3(wCustomerInput.getAddress3());
		mCustomer.setVendorFlg(wCustomerInput.getVendorFlg());
		mCustomer.setDeliveryFlg(wCustomerInput.getDeliveryFlg());
		mCustomer.setOnetimeFlg(wCustomerInput.getOnetimeFlg());
		mCustomer.setDepositFlg(wCustomerInput.getDepositFlg());
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
		mCustomer.setAllocOrder(WCU.stringToLong(wCustomerInput.getAllocOrder()));
		// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
		mCustomer.setLotReverseFlg(wCustomerInput.getLotReverseFlg());
		mCustomer.setLimitDtReverseFlg(wCustomerInput.getLimitDtReverseFlg());
		mCustomer.setShippingStopFlg(wCustomerInput.getShippingStopFlg());
		if (mCenterCustomer != null) {
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
			mCenterCustomer.setDeliveryOrder(WCU.stringToLong(wCustomerInput.getDeliveryOrder()));
			mCenterCustomer.setDeliveryReadTime(WCU.stringToLong(wCustomerInput.getDeliveryReadTime()));
			// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End
		}
	}

	/**
	 * <h2>取引先マスタテーブルを全件削除する（コミットあり）。</h2>
	 * <pre>
	 * 取引先マスタ移行が全削除後追記の場合、取引先マスタを事前に削除する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public void deleteWithCommit(ErrorStatus errSts) {
		delete(errSts);
	}

	/**
	 * <h2>取引先マスタテーブルを全件削除する（コミットなし）。</h2>
	 * <pre>
	 * 取引先マスタ移行が全削除後追記の場合、センタ取引先マスタと取引先マスタを事前に削除する。
	 * 異常発生する場合削除エラーをエラーステータスに設定する。
	 * </pre>
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(ErrorStatus errSts) {
		//「センタ取引先マスタ」テーブルを全件削除する
		try {
			MCenterCustomerCB mCenterCustomerCB = mCenterCustomerBhv.newConditionBean();
			mCenterCustomerBhv.varyingQueryDelete(mCenterCustomerCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mCenterCustomerBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mCenterCustomerBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mCenterCustomerBhv.asTableDbName().toUpperCase());
			return;
		}

		//「取引先マスタ」テーブルを全件削除する
		try {
			MCustomerCB mCustomerCB = mCustomerBhv.newConditionBean();
			mCustomerBhv.varyingQueryDelete(mCustomerCB, op -> op.allowNonQueryDelete());
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (SQLFailureException e) {
			if (e.getSQLException() != null) {
				// データベースから削除したときのエラーがFK違反の場合
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mCustomerBhv.asTableDbName().toUpperCase() + " " + e.getSQLException().getMessage());
			} else {
				getErrorManager().add(e, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mCustomerBhv.asTableDbName().toUpperCase());
			}
			return;
		// [#3870][Ver3.0] 初期データ取込 - 全削除後追記処理ABENDエラーメッセージ表示修正 2018.03.15 honma Add Start
		} catch (Exception ex) {
			getErrorManager().add(ex, errSts, WmsMessageConst.DELETE_EXCEPTION_ERROR, mCustomerBhv.asTableDbName().toUpperCase());
			return;
		}
	}

}
