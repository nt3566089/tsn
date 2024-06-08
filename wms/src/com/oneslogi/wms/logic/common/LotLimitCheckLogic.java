package com.oneslogi.wms.logic.common;

import java.math.BigDecimal;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ロット・期限日入力チェック共通ロジッククラス
 */
public class LotLimitCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProductBhv mProductBhv;

	/**
	 * <h2>ロットマスタの期限日入力データのチェック処理を行う。</h2>
	 * <pre>
	 * 実績数0以外の場合、以下のチェックを行う。
	 * ・期限日管理商品の場合、期限日未入力チェックを行う。
	 * ・ロット管理商品の場合、ロット未入力チェックを行う。
	 * エラーの場合、エラー情報として管理する。
	 * </pre>
	 * @param mClient 荷主マスタ：荷主ID
	 * @param mProduct 商品マスタ：商品CD
	 * @param tLot ロットマスタ：期限日・ロット
	 * @param num 実績数
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean 期限日またはロット未入力の場合、false
	 */
	public boolean check(MClient mClient ,MProduct mProduct ,TLot tLot ,BigDecimal num ,ErrorStatus errSts) {

		Boolean result = true ;

		if(WCC.isZero(num)){
			result = true;
		} else {

			// 検索条件の設定
			MProductCB cb =  mProductBhv.newMyConditionBean();
			// 荷主IDの設定
			cb.query().setClientId_Equal(mClient.getClientId());
			// 商品IDの設定
			cb.query().setProductCd_Equal(mProduct.getProductCd());

			MProduct Result  = mProductBhv.selectEntity(cb);

			if(CU.equals(Result.getLimitDtManagFlg(), "1")){
				if(CU.equals(tLot.getLimitDt(), null)){
					this.getErrorManager().add(errSts, WmsMessageConst.LIMIT_DATE_NOT_INPUT_LIMIT_DATE_MANAGEMENT_PRODUCT_ERROR);
					result = false;
					return result;
				}
			}
			if(CU.equals(Result.getLotManagFlg(), "1")){
					if(CU.equals(tLot.getLot(), null)){
						this.getErrorManager().add(errSts, WmsMessageConst.LOT_NOT_INPUT_LOT_MANAGEMENT_PRODUCT_ERROR);
						result = false;
						return result;
				}
			}
		}
         return result;
	}
}
