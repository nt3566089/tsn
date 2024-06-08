package com.oneslogi.ht.wms.logic.receive;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.WHtSerialReceiveInspCB;
import com.oneslogi.base.dbflute.exbhv.WHtSerialReceiveInspBhv;
import com.oneslogi.base.dbflute.exentity.WHtSerialReceiveInsp;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto;
//import com.oneslogi.wms.;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(入荷)ロジッククラス
 */
public class SerialReceiveInspectionSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* シリアル登録(入荷)データ取得    */
	@Inject
	private WHtSerialReceiveInspBhv wHtSerialReceiveInspBhv;

	/**
	 * <h2>シリアル登録(入荷)ワークテデータ取得</h2>
	 * <pre>
	 * 引数を条件にシリアル登録(入荷)ワークデータ取得
	 * </pre>
	 * @param SerialReceiveInspectionDto シリアル登録(入荷)画面用DTO
	 * @return List<WHtSerialReceiveInsp> HTシリアル登録(入荷)ワークデータ
	 */
	public List<WHtSerialReceiveInsp> selectWHtSerialReceiveInspection(SerialReceiveInspectionDto dto) {

		WHtSerialReceiveInspCB cb = wHtSerialReceiveInspBhv.newConditionBean();
		cb.setupSelect_MCustomer();

		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(dto.getCenterId());
		cb.query().setClientId_Equal(dto.getClientId());
		cb.query().setMacAddress_Equal(dto.getMacAddress());
		if (!CU.isNullOrEmpty(dto.getReceiveSlipNo())) {
			cb.query().setReceiveSlipNo_Equal(dto.getReceiveSlipNo());
		}

		//シリアル入荷ワークテーブルの取得
		List<WHtSerialReceiveInsp> wHtSerialReceiveInsp = wHtSerialReceiveInspBhv.selectList(cb);

		return wHtSerialReceiveInsp;
	}

	/**
	 * <h2>シリアル登録(入荷)ワークテデータ数取得</h2>
	 * <pre>
	 * 引数を条件にシリアル登録(入荷)ワークデータを検索し、件数を返す。
	 * </pre>
	 * @param SerialReceiveInspectionDto シリアル登録(入荷)画面用DTO
	 * @return int HTシリアル登録(入荷)ワークデータ件数
	 */
	public int selectWHtSerialReceiveInspectionCount(SerialReceiveInspectionDto dto) {

		WHtSerialReceiveInspCB cb = wHtSerialReceiveInspBhv.newConditionBean();

		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(dto.getCenterId());
		cb.query().setClientId_Equal(dto.getClientId());
		cb.query().setMacAddress_Equal(dto.getMacAddress());
		if (!CU.isNullOrEmpty(dto.getReceiveSlipNo())) {
			cb.query().setReceiveSlipNo_Equal(dto.getReceiveSlipNo());
		}

		return wHtSerialReceiveInspBhv.selectCount(cb);
	}

	/**
	 * <h2>シリアル登録(入荷)ワークテデータ数取得(商品CD単位)</h2>
	 * <pre>
	 * 引数を条件にシリアル登録(入荷)ワークデータを検索し、件数を返す。
	 * </pre>
	 * @param SerialReceiveInspectionDto シリアル登録(入荷)画面用DTO
	 * @return int HTシリアル登録(入荷)ワークデータ件数(商品単位)
	 */
	public int selectWHtSerialReceiveInspectionProductCount(SerialReceiveInspectionDto dto) {

		WHtSerialReceiveInspCB cb = wHtSerialReceiveInspBhv.newConditionBean();

		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(dto.getCenterId());
		cb.query().setClientId_Equal(dto.getClientId());
		cb.query().setMacAddress_Equal(dto.getMacAddress());
		if (!CU.isNullOrEmpty(dto.getReceiveSlipNo())) {
			cb.query().setReceiveSlipNo_Equal(dto.getReceiveSlipNo());
		}
		cb.query().setProductCd_Equal(dto.getProductCd());

		return wHtSerialReceiveInspBhv.selectCount(cb);
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End