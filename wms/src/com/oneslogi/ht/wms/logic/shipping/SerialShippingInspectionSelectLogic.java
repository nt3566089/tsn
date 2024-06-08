package com.oneslogi.ht.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.cbean.WHtSerialShippingInspCB;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.WHtSerialShippingInspBhv;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.WHtSerialShippingInsp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(出荷) 検索ロジッククラス
 */
public class SerialShippingInspectionSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private WHtSerialShippingInspBhv wHtSerialShippingInspBhv;
	@Inject
	private MCustomerBhv mCustomerBhv;

	/**
	 * <h2>シリアル登録(出荷)ワークを取得する。</h2>
	 * <pre>
	 * 引数を条件にシリアル登録(出荷)ワークからデータを検索し、
	 * 取得したデータに入数（ケース荷姿の入数）とロケーション名称を設定して返却する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShippingPicking シリアル登録(出荷)ワーク：出庫作業No.・MACアドレス・荷主ID・センタID
	 * @return List<WHtSerialShippingInsp> シリアル登録(出荷)ワーク
	 */
	public List<WHtSerialShippingInsp> selectList(WHtSerialShippingInsp wHtSerialShippingInsp) {
		//シリアル登録(出荷)ワークテーブルのデータ取得
		WHtSerialShippingInspCB wHtSerialShippingInspCB = wHtSerialShippingInspBhv.newMyConditionBean();
		wHtSerialShippingInspCB.setupSelect_MCustomer();
		wHtSerialShippingInspCB.query().setCenterId_Equal(wHtSerialShippingInsp.getCenterId());
		wHtSerialShippingInspCB.query().setClientId_Equal(wHtSerialShippingInsp.getClientId());
		wHtSerialShippingInspCB.query().setMacAddress_Equal(wHtSerialShippingInsp.getMacAddress());
		if (!CU.isNullOrEmpty(wHtSerialShippingInsp.getProductCd())) {
			wHtSerialShippingInspCB.query().setProductCd_Equal(wHtSerialShippingInsp.getProductCd());
		}
		List<WHtSerialShippingInsp> lstWHtSerialShippingInsp = wHtSerialShippingInspBhv.selectList(wHtSerialShippingInspCB);
		return lstWHtSerialShippingInsp;
	}

	/**
	 * <h2>取引先マスタ(納品先)データを取得する。</h2>
	 * <pre>
	 * 引数を条件に取引先マスタから仕入先データを検索し、結果を返却する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mClientDto 荷主マスタ：荷主ID
	 * @return List<MCustomer> 取引先マスタリスト
	 */
	public List<MCustomer> selectSupplierList(MClientDto mClientDto) {

		//取引先マスタテーブルのデータ取得
		MCustomerCB mCustomerCB = mCustomerBhv.newMyConditionBean();
		mCustomerCB.query().setDeliveryFlg_Equal_$1();
		mCustomerCB.query().setClientId_Equal(mClientDto.getClientId());

		mCustomerCB.query().addOrderBy_CustomerCd_Asc();

		List<MCustomer> lstMCustomer = mCustomerBhv.selectList(mCustomerCB);

		if (lstMCustomer.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstMCustomer;
		}

		return lstMCustomer;
	}

}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End