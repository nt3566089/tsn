package com.oneslogi.wms.logic.stock;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.ScalarQuery;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TSerialNoCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TSerialNoBhv;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * 出庫指示一覧データ取得ロジッククラス
 */
public class SerialNoCheckShippingLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TSerialNoBhv tSerialNoBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	@Inject
	private MProductBhv mProductBhv;

	// ===== 使用ロジッククラス =====

	@Inject
	private ShippingCommonLogic commonLogic;
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
	 * 【出庫作業No./出荷梱包No.が設定されている場合】
	 *
	 * 次のチェックを行う。
	 * ・出荷データが存在するか
	 * ・出荷データの納品先CDと相違がないか (引数の納品先CDが空の場合はスキップ)
	 * ・出荷データの出荷日と相違がないか (引数の出荷日が空の場合はスキップ)
	 *
	 * エラーでなければ、引数に次の値を設定する。
	 * ・納品先CD
	 * ・納品先名称
	 * ・出荷日
	 * ・納品先ID (拡張フィールド)
	 * ・出庫作業メッセージ (拡張フィールド)
	 *
	 * 【出庫作業No./出荷梱包No.が空で納品先CDが設定されている場合】
	 *
	 * 納品先CDが取引先マスタに存在するかのチェックを行い、
	 * エラーでなければ引数に次の値を設定する。
	 * ・納品先名
	 * ・納品先ID (拡張フィールド)
	 *
	 * </pre>
	 *
	 * @param serialNo シリアルNo. : センタID、荷主ID、出庫作業No./出荷梱包No.、納品先CD、出荷日
	 * @param errSts エラー時に設定するエラーステータス
	 * @return true : エラーなし  false : エラーあり
	 */
	public boolean checkAndSetHeader(TSerialNo serialNo, ErrorStatus errSts) {

		// ===== 出荷データ抽出 =====

		long centerId = serialNo.getCenterId();
		long clientId = serialNo.getClientId();
		String workNo = serialNo.getPickingWorkNo();
		String shippingDt = serialNo.getShippingDt();
		String supplyCustomerCd = serialNo.getSupplyCustomerCd();

		if (!CU.isNullOrEmpty(workNo)) {
			// 出庫作業No./出荷梱包No.の出荷データチェック

			TShippingInstH shippingInstH = commonLogic.getShippingInstHeaderByWorkNo(centerId, clientId, workNo, errSts);
			if (0 < getErrorManager().size()) {
				return false;
			}

			if (!CU.isNullOrEmpty(supplyCustomerCd)) {
				if (!supplyCustomerCd.equals(shippingInstH.getSupplyCustomerCd())) {
					// 納品先CD 不一致

					getErrorManager().add(errSts, WmsMessageConst.SUPPLIER_CD_UNMATCH_SHIPPING_DATA_ERROR);
					return false;
				}
			}

			if (!CU.isNullOrEmpty(shippingDt)) {
				if (!shippingDt.replaceAll("/", "").equals(shippingInstH.getShippingDt())) {
					// 出荷日 不一致

					getErrorManager().add(errSts, WmsMessageConst.SHIPPING_DT_UNMATCH_SHIPPING_DATA_ERROR);
					return false;
				}
			}

			serialNo.setSupplyCustomerId(shippingInstH.getSupplyCustomerId());
			serialNo.setSupplyCustomerCd(shippingInstH.getSupplyCustomerCd());
			serialNo.setSupplyCustomerNm(shippingInstH.getSupplyCustomerNm());
			serialNo.setShippingDt(shippingInstH.getShippingDt());
			// [#5772][v3.1] HTシリアル登録(出荷)での出庫作業メッセージ表示を削除 2018.12.14 kawana Delete

		} else if (!CU.isNullOrEmpty(supplyCustomerCd)) {
			// 納品先存在チェック

			MCustomer mCustomer = new MCustomer();
			mCustomer.setClientId(clientId);
			mCustomer.setCustomerCd(supplyCustomerCd);

			MCustomer supplyCustomer = customerLogic.getDeliveryCustomer(mCustomer);
			if (supplyCustomer == null) {

				getErrorManager().add(errSts, WmsMessageConst.SUPPLY_CUSTOMER_CD_NOT_FOUND_ERROR);
				return false;
			}

			serialNo.setSupplyCustomerId(supplyCustomer.getCustomerId());
			serialNo.setSupplyCustomerNm(supplyCustomer.getCustomerNm());
		}

		return true;
	}

	/**
	 * <h2>商品存在チェック.</h2>
	 * <pre>
	 * 出荷データに該当商品の出庫があるかをチェックする。
	 * 出庫作業No./出荷梱包No.が空の場合はチェックしない。 (その場合、trueを返却)
	 * </pre>
	 * @param serialNo シリアルNo. : センタID、荷主ID、出庫作業No./出荷梱包No.、商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return true : 存在  false : 存在しない
	 */
	public boolean checkProduct(TSerialNo serialNo, ErrorStatus errSts) {

		final String workNo = serialNo.getPickingWorkNo();

		if (CU.isNullOrEmpty(workNo)) {
			return true;
		}

		final long centerId = serialNo.getCenterId();
		final long clientId = serialNo.getClientId();
		final long productId = serialNo.getProductId();

		//梱包ボディ情報の取得
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		cb.query().queryTPickingB().queryTStock().setProductId_Equal(productId);

		if (commonLogic.isPickingWorkNo(centerId, workNo)) {
			// 出庫作業No.

			cb.query().queryTPackingH().queryTPickingH().setPickingWorkNo_Equal(workNo);
		} else if (commonLogic.isShippingPackingNo(centerId, workNo)) {
			// 出荷梱包No.

			cb.query().queryTPackingH().setShippingPackingNo_Equal(workNo);
		} else {
			// 該当データなし

			getErrorManager().add(errSts, WmsMessageConst.PICKING_WORK_NO_NOT_FOUND_ERROR);
			return false;
		}

		int count = tPackingBBhv.selectCount(cb);
		if (count < 1) {
			// 商品なし

			String productCd = mProductBhv.selectByPKValue(productId).getProductCd();
			getErrorManager().add(errSts, WmsMessageConst.PRODUCT_CD_NOT_FOUND_SHIPPING_DATA_ERROR_DISP_CD, productCd);
			return false;
		}

		return true;
	}

	/**
	 * <h2>出庫数超過チェック.</h2>
	 * <pre>
	 * シリアルNo.数が出庫数を超過していないことをチェック
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param pickingWorkNo 出庫作業No./出荷梱包No.
	 * @param productId 商品ID
	 * @param addSerialNoSet 追加するシリアルNo.のセット
	 * @param errSts エラー時に設定するエラーステータス
	 * @return true:未超過 false:超過
	 */
	public boolean checkOrverQuantity(final long centerId, final long clientId, final String pickingWorkNo, final long productId, Set<String> addSerialNoSet, ErrorStatus errSts) {

		return checkOrverQuantity(centerId, clientId, pickingWorkNo, productId, addSerialNoSet, new HashSet<String>(), errSts, CheckOrverQuantityMode.ADD);
	}

	/**
	 * <h2>出庫数超過チェック.</h2>
	 * <pre>
	 * シリアルNo.数が出庫数を超過していないことをチェック
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param pickingWorkNo 出庫作業No./出荷梱包No.
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
	 * <h2>出庫数チェック(全て登録済か).</h2>
	 * <pre>
	 * 出庫数分のシリアルNo.が全て登録されている場合はエラーを登録する。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param pickingWorkNo 出庫作業No./出荷梱包No.
	 * @param productId 商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return true:未超過 false:超過
	 */
	public boolean checkRegisteredAllQuantity(final long centerId, final long clientId, final String pickingWorkNo, final long productId, ErrorStatus errSts) {

		return checkOrverQuantity(centerId, clientId, pickingWorkNo, productId, new HashSet<String>(), new HashSet<String>(), errSts, CheckOrverQuantityMode.START);
	}

	private boolean checkOrverQuantity(final long centerId, final long clientId, final String pickingWorkNo, final long productId,
			Set<String> addSerialNoSet, Set<String> delSerialNoSet, ErrorStatus errSts, CheckOrverQuantityMode mode) {

		if (CU.isNullOrEmpty(pickingWorkNo)) {
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

		// ===== 出庫数を取得 =====

		// 梱包数
		int packingNum = tPackingBBhv.scalarSelect(Integer.class).sum(new ScalarQuery<TPackingBCB>() {

			@Override
			public void query(TPackingBCB cb) {
				cb.specify().columnPackingNum();
				cb.checkInvalidQuery();
				cb.query().queryTPackingH().setCenterId_Equal(centerId);
				cb.query().queryTPackingH().setClientId_Equal(clientId);
				cb.query().queryTAllocInstB().setProductId_Equal(productId);
				if (commonLogic.isPickingWorkNo(centerId, pickingWorkNo)) {
					// 出庫作業No.

					cb.query().queryTPackingH().queryTPickingH().setPickingWorkNo_Equal(pickingWorkNo);
				} else {
					// 出荷梱包No.

					cb.query().queryTPackingH().setShippingPackingNo_Equal(pickingWorkNo);
				}
			}
		}).orElse(0);

		// ===== 判定 =====
		// ※ 登録シリアル数の取得による速度低下を避けるため
		// この時点で一度判定する

		//[#3617][Ver3.0] 対象の商品が小数取扱可能な場合チェック処理をスキップする 2018.03.01 miyabe upd Start
		if (packingNum < addCount && decimalExistFlg.equals("0")) {
		//[#3617][Ver3.0] 対象の商品が小数取扱可能な場合チェック処理をスキップする 2018.03.01 miyabe upd End
			// エラー

			getErrorManager().add(errSts, WmsMessageConst.SERIAL_NO_ORVER_SHIPPING_NUM_ERROR);
			return false;
		}

		// ===== 登録シリアル数を取得 =====

		TSerialNoCB serialCb = tSerialNoBhv.newMyConditionBean();

		serialCb.specify().columnSerialNo();

		serialCb.checkInvalidQuery();
		serialCb.query().setCenterId_Equal(centerId);
		serialCb.query().setClientId_Equal(clientId);
		serialCb.query().setProductId_Equal(productId);
		serialCb.query().setPickingWorkNo_Equal(pickingWorkNo);

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
			// ※ 既に全数のシリアルが登録済 (packingNum == serialCount) をエラーにするため
			// ※ 登録数を 1 にしておく

			if (addCount == 0) {
				addCount = 1;
			}
		}

		//[#3617][Ver3.0] 対象の商品が小数取扱可能な場合チェック処理をスキップする 2018.03.01 miyabe upd Start
		if (packingNum < (registeredCount + addCount) && decimalExistFlg.equals("0")) {
		//[#3617][Ver3.0] 対象の商品が小数取扱可能な場合チェック処理をスキップする 2018.03.01 miyabe upd End
			// エラー

			getErrorManager().add(errSts, WmsMessageConst.SERIAL_NO_ORVER_SHIPPING_NUM_ERROR);
			return false;
		}

		return true;
	}
}
