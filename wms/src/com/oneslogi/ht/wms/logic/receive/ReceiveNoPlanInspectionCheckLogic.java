package com.oneslogi.ht.wms.logic.receive;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TStoreNoCB;
import com.oneslogi.base.dbflute.cbean.WHtReceiveNoPlanInspCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreNoBhv;
import com.oneslogi.base.dbflute.exbhv.WHtReceiveNoPlanInspBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.dbflute.exentity.WHtReceiveNoPlanInsp;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 予定無し入荷チェックロジッククラス
 */
public class ReceiveNoPlanInspectionCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private MProductBhv mProductBhv;
    @Inject
	private TStoreNoBhv tStoreNoBhv;
    @Inject
	private WHtReceiveNoPlanInspBhv wHtReceiveNoPlanInspecBhv;

	// [ON推-品向-1016] 再開処理を修正 2015.11.16 By SJA Start
	/**
	 * <h2>予定無し入荷ワークの存在チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に予定無し入荷ワークテーブルのデータを検索し、
	 * 検索結果の１件目のデータを返す。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * 予定無し入荷未登録エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtReceiveNoPlanInspec 予定無し入荷ワーク：MACアドレス・ＨＴ作業ＮＯ
	 * @return WHtReceiveNoPlanInsp 予定無し入荷ワーク
	 */
	public WHtReceiveNoPlanInsp checkWHtReceiveNoPlanInsp(WHtReceiveNoPlanInsp wHtReceiveNoPlanInspec) {
		// 入荷検品ワークテーブルのデータ取得
		WHtReceiveNoPlanInspCB wHtReceiveNoPlanInspecCB = wHtReceiveNoPlanInspecBhv.newMyConditionBean();
		wHtReceiveNoPlanInspecCB.setupSelect_MProduct();
		wHtReceiveNoPlanInspecCB.setupSelect_MLocation();
		wHtReceiveNoPlanInspecCB.setupSelect_MCustomerByDepositId();
		wHtReceiveNoPlanInspecCB.setupSelect_MCustomerBySupplierId();
		wHtReceiveNoPlanInspecCB.setupSelect_MProcessType();
		wHtReceiveNoPlanInspecCB.setupSelect_MStockType();

		wHtReceiveNoPlanInspecCB.query().setHtWorkNo_Equal(wHtReceiveNoPlanInspec.getHtWorkNo());
		wHtReceiveNoPlanInspecCB.query().setMacAddress_Equal(wHtReceiveNoPlanInspec.getMacAddress());

		List<WHtReceiveNoPlanInsp> lstWHtReceiveNoPlanInsp = wHtReceiveNoPlanInspecBhv.selectList(wHtReceiveNoPlanInspecCB);

		if (lstWHtReceiveNoPlanInsp.size() == 0) {
			// 予定無し入荷が行われていません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_NO_PLAN_NOT_INPUT);
			return null;
		}

		return lstWHtReceiveNoPlanInsp.get(0);
	}
	// [ON推-品向-1016] 再開処理を修正 2015.11.16 By SJA End

	/**
	 * <h2>伝票Noの存在チェックを行う。</h2>
	 * <pre>
	 * 引数の条件で入荷予定ヘッダのデータを検索し、
	 * 検索結果の１件目のデータを返す。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * 対象伝票削除済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tReceivePlanH 入荷予定ヘッダ：荷主ID・センタID・WMS入荷伝票No.
	 * @return TReceivePlanH 入荷予定ヘッダ
	 */

	public TReceivePlanH checkReceiveSlipNo(TReceivePlanH tReceivePlanH) {

		TReceivePlanHCB tReceivePlanHCB = tReceivePlanHBhv.newMyConditionBean();

		tReceivePlanHCB.query().setCenterId_Equal(tReceivePlanH.getCenterId());
		tReceivePlanHCB.query().setClientId_Equal(tReceivePlanH.getClientId());
		tReceivePlanHCB.query().setReceiveSlipNo_Equal(tReceivePlanH.getReceiveSlipNo());

		List<TReceivePlanH> lstTReceivePlanH = tReceivePlanHBhv.selectList(tReceivePlanHCB);

		if (lstTReceivePlanH.size() == 0) {
			// 対象の伝票が削除されました。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SLIP_NO_DELETED);
			return null;
		}

		return lstTReceivePlanH.get(0);
	}

	/**
	 * <h2>J/商の存在チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に商品マスタデータ及び商品マスタデータに紐づく商品荷姿情報を取得する。
	 *
	 * 検索対象が見つからない場合、商品未存在エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mProduct 商品マスタ：荷主ID・JANCD
	 * @param centerId センタID
	 * @return List<MProduct> 商品マスタリスト
	 */
	public List<MProduct> checkJanProdCd(MProduct mProduct, Long centerId) {
		//商品マスタのデータ取得
		MProductCB mProductCB = mProductBhv.newMyConditionBean();
		//[#1787] 入数の不正の件対応 2017.05.25 nayzaw Start
		// [Ver3.0] unit of measure対応 2017.12.01 王 Del
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
		//[#1787] 入数の不正の件対応 2017.05.25 nayzaw End
		return lstMProduct;
	}

	/**
	 * <h2>入庫ラベルNo.の存在チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に入庫No.のデータ検索し、
	 * 検索対象が存在する場合、重複エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tStoreNo 入庫No.：入庫ラベルNo.
	 */
	public void checkLabelInput(TStoreNo tStoreNo) {
		//商品マスタのデータ取得
		TStoreNoCB tStoreNoCB = tStoreNoBhv.newMyConditionBean();
		tStoreNoCB.query().setStoreLabelNo_Equal(tStoreNo.getStoreLabelNo());

		List<TStoreNo> lstTStoreNo = tStoreNoBhv.selectList(tStoreNoCB);

		if (lstTStoreNo.size() > 0) {
			// 存在する場合
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.ONS_LABEL_NUMBER_DUPLICATE_ERROR);
			return;
		}
	}
}
