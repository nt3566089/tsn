package com.oneslogi.ht.wms.logic.shipping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.TSerialNoCB;
import com.oneslogi.base.dbflute.cbean.WHtSerialShippingInspCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TSerialNoBhv;
import com.oneslogi.base.dbflute.exbhv.WHtSerialShippingInspBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dbflute.exentity.WHtSerialShippingInsp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.stock.SerialNoCheckShippingLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(出荷)チェックロジッククラス
 */
public class SerialShippingInspectionCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private MProductBhv mProductBhv;
	@Inject
	private TSerialNoBhv tSerialNoBhv;
	@Inject
	private WHtSerialShippingInspBhv wHtSerialShippingInspBhv;

	// ===== 使用ロジック =====

	@Inject
	private SerialNoCheckShippingLogic serialNoCheckLogic;
	@Inject
	private ProductLogic productLogic;

	/**
	 * <h2>ソースCDの存在チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に商品マスタデータ情報を取得する。
	 *
	 * 検索対象が見つからない場合、商品未存在エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mProduct 商品マスタ：荷主ID・JANCD
	 * @return List<MProduct> 商品マスタリスト
	 */
	public List<MProduct> checkJanProdCd(MProduct mProduct) {
		//商品マスタのデータ取得
		MProductCB mProductCB = mProductBhv.newMyConditionBean();
		final String janCd = mProduct.getJanCd();
		mProductCB.query().setClientId_Equal(mProduct.getClientId());
		mProductCB.orScopeQuery(new OrQuery<MProductCB>() {
			public void query(MProductCB orCB) {
				orCB.query().setJanCd_Equal(janCd);
				orCB.query().setProductCd_Equal(janCd);
			}
		});
		List<MProduct> lstMProduct = mProductBhv.selectList(mProductCB);
		if (lstMProduct.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
			return lstMProduct;
		}
		return lstMProduct;
	}

	/**
	 * <h2>商品存在チェック</h2>
	 * <pre>
	 * 出庫作業No.と出荷梱包No.単位で商品存在チェックを行う。
	 * </pre>
	 * @param wHtSerialShippingInsp シリアル登録(出荷)ワーク：センタID・出庫作業No
	 * @return true:存在;false:存在しない
	 */
	public boolean checkProduct(WHtSerialShippingInsp wHtSerialShippingInsp) {

		final long centerId = wHtSerialShippingInsp.getCenterId();
		final long clientId = wHtSerialShippingInsp.getClientId();
		final String targetNo = wHtSerialShippingInsp.getPickingWorkNo();
		final long productId = wHtSerialShippingInsp.getProductId();

		TSerialNo checkProductSerialNo = new TSerialNo();
		checkProductSerialNo.setCenterId(centerId);
		checkProductSerialNo.setClientId(clientId);
		checkProductSerialNo.setPickingWorkNo(targetNo);
		checkProductSerialNo.setProductId(productId);

		serialNoCheckLogic.checkProduct(checkProductSerialNo, new ErrorStatus());
		if (0 < this.getErrorManager().size()) {
			return false;
		}

		return true;
	}

	/**
	 * <h2>登録済チェック.<h2>
	 * <pre>
	 * 引数のシリアルNo.が異なる出庫作業No.で登録されていないか確認
	 *
	 * 既に異なる出庫作業No.で登録済の場合はエラーを登録し、falseを返す。
	 *
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param pickingWorkNo 出庫作業No.
	 * @param productCd 商品CD
	 * @param serialNoList 登録するシリアルNo.のリスト
	 * @return 登録なし : true , 既に登録済 : false
	 */
	public boolean checkAlreadyRegistered(long centerId, long clientId, String pickingWorkNo, long productId, List<String> serialNoList) {

		TSerialNoCB cb = tSerialNoBhv.newMyConditionBean();

		cb.specify().columnSerialNo();
		cb.specify().columnPickingWorkNo();

		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(centerId);
		cb.query().setClientId_Equal(clientId);
		cb.query().setProductId_Equal(productId);
		cb.query().setSerialNo_InScope(serialNoList);
		cb.query().setPickingWorkNo_IsNotNull();

		List<TSerialNo> selectList = tSerialNoBhv.selectList(cb);

		for (TSerialNo serialNo : selectList) {
			String selectPickingWorkNo = serialNo.getPickingWorkNo();

			if (!selectPickingWorkNo.equals(CU.nullToStr(pickingWorkNo))) {

				getErrorManager().add(new ErrorStatus(), WmsMessageConst.SERIAL_NO_ALREADY_REGISTERED_ERROR_SHIPPING, serialNo.getSerialNo(), selectPickingWorkNo);
				return false;
			}
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
	 * @param productCd 商品CD
	 * @param macAddress HTのMACアドレス
	 * @return true:未超過 false:超過
	 */
	public boolean checkOrverQuantity(final long centerId, final long clientId, final String pickingWorkNo, final long productId, final String productCd, final String macAddress) {

		if (CU.isNullOrEmpty(pickingWorkNo)) {
			return true;
		}

		// ===== ワークから登録シリアルNo.取得 =====

		WHtSerialShippingInspCB workCb = wHtSerialShippingInspBhv.newMyConditionBean();
		workCb.specify().columnSerialNo();
		workCb.checkInvalidQuery();
		workCb.query().setCenterId_Equal(centerId);
		workCb.query().setClientId_Equal(clientId);
		workCb.query().setMacAddress_Equal(macAddress);
		workCb.query().setPickingWorkNo_Equal(pickingWorkNo);
		workCb.query().setProductCd_Equal(productCd);

		List<WHtSerialShippingInsp> workList = wHtSerialShippingInspBhv.selectList(workCb);

		Set<String> workSerialNoSet = new HashSet<String>();
		for (WHtSerialShippingInsp work : workList) {
			workSerialNoSet.add(work.getSerialNo());
		}

		// ===== 出庫数超過チェック =====

		if (0 < workSerialNoSet.size()) {
			// 追加登録が可能かチェック
			serialNoCheckLogic.checkOrverQuantity(centerId, clientId, pickingWorkNo, productId, workSerialNoSet, new ErrorStatus());
		} else {
			// 全数登録済かチェック (シリアル登録開始時のチェック)
			serialNoCheckLogic.checkRegisteredAllQuantity(centerId, clientId, pickingWorkNo, productId, new ErrorStatus());
		}
		if (0 < this.getErrorManager().size()) {
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
	 * @param macAddress HTのMACアドレス
	 * @return true:未超過 false:超過
	 */
	public boolean checkOrverQuantity(final long centerId, final long clientId, final String pickingWorkNo, final String macAddress) {

		if (CU.isNullOrEmpty(pickingWorkNo)) {
			return true;
		}

		// ===== ワークに登録シリアルNo.取得 =====

		WHtSerialShippingInspCB workCb = wHtSerialShippingInspBhv.newMyConditionBean();
		workCb.specify().columnProductCd();
		workCb.checkInvalidQuery();
		workCb.query().setCenterId_Equal(centerId);
		workCb.query().setClientId_Equal(clientId);
		workCb.query().setMacAddress_Equal(macAddress);
		workCb.query().setPickingWorkNo_Equal(pickingWorkNo);

		List<WHtSerialShippingInsp> workList = wHtSerialShippingInspBhv.selectList(workCb);

		Set<String> productCdSet = new HashSet<String>();
		for (WHtSerialShippingInsp work : workList) {
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

			checkOrverQuantity(centerId, clientId, pickingWorkNo, product.getProductId(), productCd, macAddress);
			if (0 < getErrorManager().size()) {
				return false;
			}
		}

		return true;
	}

}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End