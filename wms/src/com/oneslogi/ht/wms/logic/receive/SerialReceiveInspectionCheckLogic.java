package com.oneslogi.ht.wms.logic.receive;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TSerialNoCB;
import com.oneslogi.base.dbflute.cbean.WHtSerialReceiveInspCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TSerialNoBhv;
import com.oneslogi.base.dbflute.exbhv.WHtSerialReceiveInspBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dbflute.exentity.WHtSerialReceiveInsp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.stock.SerialNoCheckReceiveLogic;

/**
 * 入荷検品チェックロジッククラス
 */
public class SerialReceiveInspectionCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private MProductBhv mProductBhv;
	@Inject
	private TSerialNoBhv tSerialNoBhv;
	@Inject
	private WHtSerialReceiveInspBhv wHtSerialReceiveInspBhv;

	// ===== 使用ロジック =====
	@Inject
	private SerialNoCheckReceiveLogic serialNoCheckLogic;
	@Inject
	private ProductLogic productLogic;

	public enum RestartFlg {
		TRUE,
		FALSE
	}

	/**
	 * <h2>伝票Noの存在チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に入荷予定ヘッダのデータを検索し、１件目のデータを返却する。
	 * 検索対象が見つからない場合、メッセージフラグの値により下記のエラーをエラーステータスに設定する。
	 * ・メッセージフラグが"1"の場合、削除済エラー
	 * ・上記以外の場合、０件エラー
	 *
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダ：荷主ID・センタID・WMS入荷伝票No.
	 * @param restartFlg 再開フラグ
	 * @return TReceivePlanH 入荷予定ヘッダ
	 */
	public TReceivePlanH checkReceiveSlipNo(final long centerId, final long clientId, final String receiveSlipNo, RestartFlg restartFlg) {

		TReceivePlanHCB tReceivePlanHCB = tReceivePlanHBhv.newMyConditionBean();

		tReceivePlanHCB.setupSelect_MCustomerByPlanSupplierId();
		tReceivePlanHCB.query().setCenterId_Equal(centerId);
		tReceivePlanHCB.query().setClientId_Equal(clientId);
		tReceivePlanHCB.query().setReceiveSlipNo_Equal(receiveSlipNo);

		TReceivePlanH receivePlanH = tReceivePlanHBhv.selectEntity(tReceivePlanHCB);

		if (receivePlanH == null) {
			if (restartFlg == RestartFlg.TRUE) {
				// 対象の伝票が削除されました。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SLIP_NO_DELETED);
			} else {
				// 該当データが存在しません。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			}
			return null;
		}

		return receivePlanH;
	}

	/**
	 * <h2>JANCDと商品CDをの存在チェックを行う。</h2>
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダ：荷主ID・センタID・WMS入荷伝票No.
	 * @param msgFlg メッセージフラグ
	 * @return TReceivePlanH 入荷予定ヘッダ
	 */
	public MProduct checkJanCd(Long clientId, final MProduct mProduct) {
		MProduct product = null;
		// 商品情報の取得
		MProductCB mProductCB = mProductBhv.newMyConditionBean();
		mProductCB.query().setClientId_Equal(clientId);
		// 商品マスタの取得
		mProductCB.orScopeQuery(new OrQuery<MProductCB>() {
			public void query(MProductCB orCB) {
				orCB.query().setJanCd_Equal(mProduct.getJanCd());
				orCB.query().setProductCd_Equal(mProduct.getJanCd());
			}
		});
		product = mProductBhv.selectEntity(mProductCB);
		if (product == null) {
			// 該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
		}
		return product;
	}

	/**
	 * <h2>登録済チェック.<h2>
	 * <pre>
	 * 引数のシリアルNo.が異なる伝票No.で登録されていないか確認
	 *
	 * 既に異なる伝票No.で登録済の場合はエラーを登録し、falseを返す。
	 *
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param slipNo WMS入荷伝票No.
	 * @param productCd 商品CD
	 * @param serialNoList 登録するシリアルNo.のリスト
	 * @return 登録なし : true , 既に登録済 : false
	 */
	public boolean checkAlreadyRegistered(long centerId, long clientId, String slipNo, long productId, List<String> serialNoList) {

		TSerialNoCB cb = tSerialNoBhv.newMyConditionBean();

		cb.specify().columnSerialNo();
		cb.specify().columnReceiveSlipNo();

		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(centerId);
		cb.query().setClientId_Equal(clientId);
		cb.query().setProductId_Equal(productId);
		cb.query().setSerialNo_InScope(serialNoList);
		cb.query().setReceiveSlipNo_IsNotNull();

		List<TSerialNo> selectList = tSerialNoBhv.selectList(cb);

		for (TSerialNo serialNo : selectList) {
			String selectSlipNo = serialNo.getReceiveSlipNo();

			if (!selectSlipNo.equals(CU.nullToStr(slipNo))) {

				getErrorManager().add(new ErrorStatus(), WmsMessageConst.SERIAL_NO_ALREADY_REGISTERED_ERROR, serialNo.getSerialNo(), selectSlipNo);
				return false;
			}
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
	 * @param slipNo WMS入荷伝票No.
	 * @param productCd 商品CD
	 * @param macAddress HTのMACアドレス
	 * @return true:未超過 false:超過
	 */
	public boolean checkOrverQuantity(final long centerId, final long clientId, final String slipNo, final long productId, final String productCd, final String macAddress) {

		if (CU.isNullOrEmpty(slipNo)) {
			return true;
		}

		// ===== ワークから登録シリアルNo.取得 =====

		WHtSerialReceiveInspCB workCb = wHtSerialReceiveInspBhv.newMyConditionBean();
		workCb.specify().columnSerialNo();
		workCb.checkInvalidQuery();
		workCb.query().setCenterId_Equal(centerId);
		workCb.query().setClientId_Equal(clientId);
		workCb.query().setMacAddress_Equal(macAddress);
		workCb.query().setReceiveSlipNo_Equal(slipNo);
		workCb.query().setProductCd_Equal(productCd);

		List<WHtSerialReceiveInsp> workList = wHtSerialReceiveInspBhv.selectList(workCb);

		Set<String> workSerialNoSet = new HashSet<String>();
		for (WHtSerialReceiveInsp work : workList) {
			workSerialNoSet.add(work.getSerialNo());
		}

		// ===== 入荷数超過チェック =====

		if (0 < workSerialNoSet.size()) {
			// 追加登録が可能かチェック
			serialNoCheckLogic.checkOrverQuantity(centerId, clientId, slipNo, productId, workSerialNoSet, new ErrorStatus());
		} else {
			// 全数登録済かチェック (シリアル検品開始時のチェック)
			serialNoCheckLogic.checkRegisteredAllQuantity(centerId, clientId, slipNo, productId, new ErrorStatus());
		}
		if (0 < this.getErrorManager().size()) {
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
	 * @param slipNo WMS入荷伝票No.
	 * @param macAddress HTのMACアドレス
	 * @return true:未超過 false:超過
	 */
	public boolean checkOrverQuantity(final long centerId, final long clientId, final String slipNo, final String macAddress) {

		if (CU.isNullOrEmpty(slipNo)) {
			return true;
		}

		// ===== ワークに登録シリアルNo.取得 =====

		WHtSerialReceiveInspCB workCb = wHtSerialReceiveInspBhv.newMyConditionBean();
		workCb.specify().columnProductCd();
		workCb.checkInvalidQuery();
		workCb.query().setCenterId_Equal(centerId);
		workCb.query().setClientId_Equal(clientId);
		workCb.query().setMacAddress_Equal(macAddress);
		workCb.query().setReceiveSlipNo_Equal(slipNo);

		List<WHtSerialReceiveInsp> workList = wHtSerialReceiveInspBhv.selectList(workCb);

		Set<String> productCdSet = new HashSet<String>();
		for (WHtSerialReceiveInsp work : workList) {
			String productCd = work.getProductCd();
			if (productCdSet.contains(productCd)) {
				continue;
			}

			productCdSet.add(productCd);

			MProduct pc = new MProduct();
			pc.setClientId(clientId);
			pc.setProductCd(productCd);
			MProduct product = productLogic.getUkEntity(pc, new ErrorStatus());
			if (0 < getErrorManager().size()) {
				return false;
			}

			checkOrverQuantity(centerId, clientId, slipNo, product.getProductId(), productCd, macAddress);
			if (0 < getErrorManager().size()) {
				return false;
			}
		}

		return true;
	}

	/**
	 * <h2>入荷伝票Noに入力した商品存在チェック</h2>
	 * <pre>
	 * 入力した商品CDまたはJANCDが対応の入荷伝票Noに存在チェック
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param mProduct 商品マスタ
	 * @param receiveSlipNo 入荷伝票No.
	 * @return
	 */
	public boolean checkReceiveProduct(final long centerId, final long clientId, final long productId, final String receiveSlipNo) {

		TSerialNo checkProductSerialNo = new TSerialNo();
		checkProductSerialNo.setCenterId(centerId);
		checkProductSerialNo.setClientId(clientId);
		checkProductSerialNo.setReceiveSlipNo(receiveSlipNo);
		checkProductSerialNo.setProductId(productId);

		serialNoCheckLogic.checkProduct(checkProductSerialNo, new ErrorStatus());
		if (0 < this.getErrorManager().size()) {
			return false;
		}

		return true;
	}
}
