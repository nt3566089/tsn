package com.oneslogi.wms.logic.stock;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.ScalarQuery;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TSerialNoCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordHCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TSerialNoBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;

/**
 * 出庫指示一覧データ取得ロジッククラス
 */
public class SerialNoCheckReceiveLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TSerialNoBhv tSerialNoBhv;
	@Inject
	private TStoreRecordHBhv tStoreRecordHBhv;
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;
	@Inject
	private MProductBhv mProductBhv;

	// ===== 使用ロジッククラス =====

	@Inject
	private CustomerLogic customerLogic;

	// ===== enum =====

	private enum CheckOrverQuantityMode {
		/** 作業開始 */
		START,
		/** シリアル追加 */
		ADD
	}

	/**
	 * <h2>シリアルNo.ヘッダ情報チェックと設定.</h2>
	 * <pre>
	 * 【WMS入荷伝票No.が設定されている場合】
	 *
	 * 次のチェックを行う。
	 * ・入荷データが存在するか
	 * ・入荷データの仕入先CDと相違がないか (引数の仕入先CDが空の場合はスキップ)
	 *
	 * エラーでなければ、引数に次の値を設定する。
	 * ・仕入先CD
	 * ・仕入先名称
	 * ・仕入先ID (拡張フィールド)
	 *
	 * 【WMS入荷伝票No.が設定されていない場合】
	 *
	 * 仕入先CDが取引先マスタに存在するかのチェックを行い、
	 * エラーでなければ引数に次の値を設定する。
	 * ・仕入先名称
	 * ・仕入先ID (拡張フィールド)
	 *
	 * </pre>
	 *
	 * @param serialNo シリアルNo. : センタID、荷主ID、WMS入荷伝票No.、仕入先CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return true : エラーなし  false : エラーあり
	 */
	public boolean checkAndSetHeader(TSerialNo serialNo, ErrorStatus errSts) {

		// ===== 入荷データ抽出 =====

		long centerId = serialNo.getCenterId();
		long clientId = serialNo.getClientId();
		String receiveSlipNo = serialNo.getReceiveSlipNo();
		String supplierCd = serialNo.getSupplierCd();

		if (!CU.isNullOrEmpty(receiveSlipNo)) {
			// WMS入荷伝票No.の入荷データチェック

			MCustomer supplier = null;

			TStoreRecordHCB recordCb = tStoreRecordHBhv.newMyConditionBean();
			recordCb.setupSelect_MCustomerBySupplierId();
			recordCb.checkInvalidQuery();
			recordCb.query().setCenterId_Equal(centerId);
			recordCb.query().setClientId_Equal(clientId);
			recordCb.query().queryTReceivePlanH().setReceiveSlipNo_Equal(receiveSlipNo);

			TStoreRecordH storeRecordH = tStoreRecordHBhv.selectEntity(recordCb);
			if (storeRecordH != null) {

				supplier = storeRecordH.getMCustomerBySupplierId();
			} else {
				// 入庫実績なし - 入荷予定を検索

				TReceivePlanHCB planCb = tReceivePlanHBhv.newMyConditionBean();
				planCb.setupSelect_MCustomerByPlanSupplierId();
				planCb.checkInvalidQuery();
				planCb.query().setCenterId_Equal(centerId);
				planCb.query().setClientId_Equal(clientId);
				planCb.query().setReceiveSlipNo_Equal(receiveSlipNo);

				TReceivePlanH receivePlanH = tReceivePlanHBhv.selectEntity(planCb);
				if (receivePlanH != null) {

					supplier = receivePlanH.getMCustomerByPlanSupplierId();
				} else {
					// 実績も予定もなし

					getErrorManager().add(errSts, WmsMessageConst.RECEIVE_SLIP_NO_NOT_FOUND_ERROR);
					return false;
				}
			}

			if (!CU.isNullOrEmpty(supplierCd)) {
				if (!supplierCd.equals(supplier.getCustomerCd())) {
					// 仕入先CD 不一致

					getErrorManager().add(errSts, WmsMessageConst.SUPPLIER_CD_UNMATCH_RECEIVE_DATA_ERROR);
					return false;
				}
			}

			serialNo.setSupplierId(supplier.getCustomerId());
			serialNo.setSupplierCd(supplier.getCustomerCd());
			serialNo.setSupplierNm(supplier.getCustomerNm());

		} else if (!CU.isNullOrEmpty(supplierCd)) {
			// 仕入先存在チェック

			MCustomer mCustomer = new MCustomer();
			mCustomer.setClientId(clientId);
			mCustomer.setCustomerCd(supplierCd);

			MCustomer supplier = customerLogic.getVendorCustomerByClientCd(mCustomer);
			if (supplier == null) {

				getErrorManager().add(errSts, WmsMessageConst.SUPPLIER_CD_NOT_FOUND_ERROR);
				return false;
			}

			serialNo.setSupplierId(supplier.getCustomerId());
			serialNo.setSupplierNm(supplier.getCustomerNm());
		}

		return true;
	}

	/**
	 * <h2>商品存在チェック.</h2>
	 * <pre>
	 * 入荷データに該当商品の入荷があるかをチェックする。
	 * WMS入荷伝票No.が空の場合はチェックしない。 (その場合、trueを返却)
	 * </pre>
	 * @param serialNo シリアルNo. : センタID、荷主ID、WMS入荷伝票No.、商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return true : 存在  false : 存在しない
	 */
	public boolean checkProduct(TSerialNo serialNo, ErrorStatus errSts) {

		String receiveSlipNo = serialNo.getReceiveSlipNo();

		if (CU.isNullOrEmpty(receiveSlipNo)) {
			return true;
		}

		final long centerId = serialNo.getCenterId();
		final long clientId = serialNo.getClientId();
		final long productId = serialNo.getProductId();

		TReceivePlanBCB cb = tReceivePlanBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryTReceivePlanH().setCenterId_Equal(centerId);
		cb.query().queryTReceivePlanH().setClientId_Equal(clientId);
		cb.query().queryTReceivePlanH().setReceiveSlipNo_Equal(receiveSlipNo);
		cb.query().setProductId_Equal(productId);

		int count = tReceivePlanBBhv.selectCount(cb);
		if (count < 1) {
			// 該当商品なし

			String productCd = mProductBhv.selectByPKValue(productId).getProductCd();
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.PRODUCT_CD_NOT_FOUND_RECEIVE_DATA_ERROR_DISP_CD, productCd);
			return false;
		}

		return true;
	}

	/**
	 * <h2>入荷数超過チェック.</h2>
	 * <pre>
	 * シリアルNo.数が入荷数を超過していないことをチェック
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param receiveSlipNo WMS入荷伝票No.
	 * @param productId 商品ID
	 * @param addSerialNoSet 追加するシリアルNo.のセット
	 * @param errSts エラー時に設定するエラーステータス
	 * @return true:未超過 false:超過
	 */
	public boolean checkOrverQuantity(final long centerId, final long clientId, final String receiveSlipNo, final long productId, Set<String> addSerialNoSet, ErrorStatus errSts) {

		return checkOrverQuantity(centerId, clientId, receiveSlipNo, productId, addSerialNoSet, new HashSet<String>(), errSts, CheckOrverQuantityMode.ADD);
	}

	/**
	 * <h2>入荷数超過チェック.</h2>
	 * <pre>
	 * シリアルNo.数が入荷数を超過していないことをチェック
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param receiveSlipNo WMS入荷伝票No.
	 * @param productId 商品ID
	 * @param addSerialNoSet 追加するシリアルNo.のセット
	 * @param delSerialNoSet 削除するシリアルNo.のセット
	 * @param errSts エラー時に設定するエラーステータス
	 * @return true:未超過 false:超過
	 */
	public boolean checkOrverQuantity(final long centerId, final long clientId, final String receiveSlipNo, final long productId, Set<String> addSerialNoSet, Set<String> delSerialNoSet,
			ErrorStatus errSts) {

		return checkOrverQuantity(centerId, clientId, receiveSlipNo, productId, addSerialNoSet, delSerialNoSet, errSts, CheckOrverQuantityMode.ADD);
	}

	/**
	 * <h2>入荷数チェック(全て登録済か).</h2>
	 * <pre>
	 * 入荷数分のシリアルNo.が全て登録されている場合はエラーを登録する。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param receiveSlipNo WMS入荷伝票No.
	 * @param productId 商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return true:未超過 false:超過
	 */
	public boolean checkRegisteredAllQuantity(final long centerId, final long clientId, final String receiveSlipNo, final long productId, ErrorStatus errSts) {

		return checkOrverQuantity(centerId, clientId, receiveSlipNo, productId, new HashSet<String>(), new HashSet<String>(), errSts, CheckOrverQuantityMode.START);
	}

	private boolean checkOrverQuantity(final long centerId, final long clientId, final String receiveSlipNo, final long productId,
			Set<String> addSerialNoSet, Set<String> delSerialNoSet, ErrorStatus errSts, CheckOrverQuantityMode mode) {

		if (CU.isNullOrEmpty(receiveSlipNo)) {
			return true;
		}
		//[#3617][Ver3.0] 対象の商品が小数取扱可能な場合チェック処理をスキップする 2018.02.28 miyabe add Start
		// 小数有無フラグを取得
		MProductCB mProductCB = mProductBhv.newConditionBean();
		mProductCB.setupSelect_MShapeGrp();
		mProductCB.query().setProductId_Equal(productId);
		String decimalExistFlg = mProductBhv.selectEntity(mProductCB).getMShapeGrp().getDecimalExistFlg();;
		//[#3617][Ver3.0] 対象の商品が小数取扱可能な場合チェック処理をスキップする 2018.02.28 miyabe add End
		// 追加数
		int addCount = addSerialNoSet.size();

		// ===== 入荷数を取得 =====

		// 入庫数
		Integer storeNum = tStoreRecordBBhv.scalarSelect(Integer.class).sum(new ScalarQuery<TStoreRecordBCB>() {

			@Override
			public void query(TStoreRecordBCB cb) {
				cb.specify().columnStoreNum();
				cb.checkInvalidQuery();
				cb.query().queryTStoreRecordH().setCenterId_Equal(centerId);
				cb.query().queryTStoreRecordH().setClientId_Equal(clientId);
				cb.query().queryTReceivePlanB().setProductId_Equal(productId);
				cb.query().queryTReceivePlanB().queryTReceivePlanH().setReceiveSlipNo_Equal(receiveSlipNo);
			}
		}).orElse(null);

		if (storeNum == null) {
			// 実績なし

			// 入庫数を予定数とする
			storeNum = tReceivePlanBBhv.scalarSelect(Integer.class).sum(new ScalarQuery<TReceivePlanBCB>() {

				@Override
				public void query(TReceivePlanBCB cb) {
					cb.specify().columnPlanNum();
					cb.checkInvalidQuery();
					cb.query().queryTReceivePlanH().setCenterId_Equal(centerId);
					cb.query().queryTReceivePlanH().setClientId_Equal(clientId);
					cb.query().setProductId_Equal(productId);
					cb.query().queryTReceivePlanH().setReceiveSlipNo_Equal(receiveSlipNo);
				}
			}).orElse(0);
		}

		// ===== 判定 =====
		// ※ 登録シリアル数の取得による速度低下を避けるため
		// この時点で一度判定する
		//[#3617][Ver3.0] 対象の商品が小数取扱可能な場合チェック処理をスキップする 2018.02.28 miyabe upd Start
		if (storeNum < addCount && decimalExistFlg.equals("0")) {
		//[#3617][Ver3.0] 対象の商品が小数取扱可能な場合チェック処理をスキップする 2018.02.28 miyabe upd End
			// エラー

			getErrorManager().add(errSts, WmsMessageConst.SERIAL_NO_ORVER_RECEIVE_NUM_ERROR);
			return false;
		}

		// ===== 登録シリアル数を取得 =====

		TSerialNoCB serialCb = tSerialNoBhv.newMyConditionBean();

		serialCb.specify().columnSerialNo();

		serialCb.checkInvalidQuery();
		serialCb.query().setCenterId_Equal(centerId);
		serialCb.query().setClientId_Equal(clientId);
		serialCb.query().setProductId_Equal(productId);
		serialCb.query().setReceiveSlipNo_Equal(receiveSlipNo);

		List<TSerialNo> registeredSerialList = tSerialNoBhv.selectList(serialCb);

		// 登録シリアルNo.数
		int registeredCount = 0;
		for (TSerialNo s : registeredSerialList) {

			String serialNo = s.getSerialNo();

			if (addSerialNoSet.contains(serialNo)) {
				// 登録予定

				// カウントしない
				continue;
			}

			if (delSerialNoSet.contains(serialNo)) {
				// 削除予定

				// カウントしない
				continue;
			}

			// 登録数にカウント
			registeredCount++;
		}

		// ===== 判定 =====

		if (mode == CheckOrverQuantityMode.START) {

			// これから作業開始
			// ※ 既に全数のシリアルが登録済 (storeNum == registeredCount) をエラーにするため
			// ※ 登録数を 1 にしておく

			if (addCount == 0) {
				addCount = 1;
			}
		}

		//[#3617][Ver3.0] 対象の商品が小数取扱可能な場合チェック処理をスキップする 2018.02.28 miyabe upd Start
		if (storeNum < (registeredCount + addCount) && decimalExistFlg.equals("0")) {
		//[#3617][Ver3.0] 対象の商品が小数取扱可能な場合チェック処理をスキップする 2018.02.28 miyabe upd End
			// エラー

			getErrorManager().add(errSts, WmsMessageConst.SERIAL_NO_ORVER_RECEIVE_NUM_ERROR);
			return false;
		}

		return true;
	}
}
