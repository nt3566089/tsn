package com.oneslogi.wms.logic.ecorder;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TAllocInstHCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TEcOrderH;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * EC送り状データ出力の送付先住所変更ロジッククラス
 */
public class EcDelivAddressModifyLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TEcOrderHBhv tEcOrderHBhv;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;

	/**
	 * <h2>EC受注ヘッダの住所を更新する。</h2>
	 * <pre>
	 * 引数で受け取ったデータでEC受注ヘッダの住所を更新する。
	 * </pre>
	 * @param ecOrderH EC受注ヘッダ：荷主ID・センタID・名寄せID・注文者住所：都道府県・注文者住所：都市区・注文者住所：町以降
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 更新件数
	 */
	public int update(TEcOrderH ecOrderH, ErrorStatus errSts) {
		// ===== EC受注ヘッダデータ取得 =====
		int reUpdCnt = 0;
		List<TEcOrderH> tEcOrderHList = new ArrayList<TEcOrderH>();
		//#2622 直した住所をWMSに反映処理を追加 2017/09/20 K.cho Start
		List<TShippingInstH> tShippingInstHList = new ArrayList<TShippingInstH>();
		List<TAllocInstH> tAllocInstHList = new ArrayList<TAllocInstH>();
		//#2622 直した住所をWMSに反映処理を追加 2017/09/20 K.cho End

		if (ecOrderH != null) {

			// 検索条件の設定
			TEcOrderHCB cb = tEcOrderHBhv.newMyConditionBean();
			cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH();
			cb.query().setMergeId_Equal(ecOrderH.getMergeId());
			cb.query().setCenterId_Equal(ecOrderH.getCenterId());
			cb.query().setClientId_Equal(ecOrderH.getClientId());
			tEcOrderHList = tEcOrderHBhv.selectList(cb);

			if (tEcOrderHList.size() > 0) {
				for (TEcOrderH h : tEcOrderHList) {
					if (h != null) {
						h.setInvoiceDelivAddress1(ecOrderH.getDelivAddress1());
						h.setInvoiceDelivAddress2(ecOrderH.getDelivAddress2());
						h.setInvoiceDelivAddress3(ecOrderH.getDelivAddress3());
					}
				}
				int[] updateCount = tEcOrderHBhv.batchUpdate(tEcOrderHList);
				reUpdCnt = updateCount.length;
			}

			//#2622 直した住所をWMSに反映処理を追加 2017/09/20 K.cho Start
			// 出荷指示ヘッダ検索条件の設定
			TShippingInstHCB cb1 = tShippingInstHBhv.newMyConditionBean();
			cb1.checkInvalidQuery();
			cb1.query().setDelivAddressSupply_Equal(ecOrderH.getMergeId());
			cb1.query().setCenterId_Equal(ecOrderH.getCenterId());
			cb1.query().setClientId_Equal(ecOrderH.getClientId());
			tShippingInstHList = tShippingInstHBhv.selectList(cb1);

			if (tShippingInstHList.size() > 0) {
				for (TShippingInstH h : tShippingInstHList) {
					if (h != null) {
						h.setDelivAddress1(ecOrderH.getDelivAddress1());
						h.setDelivAddress2(ecOrderH.getDelivAddress2());
						h.setDelivAddress3(ecOrderH.getDelivAddress3());
					}
				}
				int[] updateCount = tShippingInstHBhv.batchUpdate(tShippingInstHList);
				reUpdCnt = updateCount.length;
			}

			// 引当指示ヘッダ検索条件の設定
			TAllocInstHCB cb2 = tAllocInstHBhv.newMyConditionBean();
			cb2.checkInvalidQuery();
			cb2.query().setDelivAddressSupply_Equal(ecOrderH.getMergeId());
			cb2.query().setCenterId_Equal(ecOrderH.getCenterId());
			cb2.query().setClientId_Equal(ecOrderH.getClientId());
			tAllocInstHList = tAllocInstHBhv.selectList(cb2);

			if (tAllocInstHList.size() > 0) {
				for (TAllocInstH h : tAllocInstHList) {
					if (h != null) {
						h.setDelivAddress1(ecOrderH.getDelivAddress1());
						h.setDelivAddress2(ecOrderH.getDelivAddress2());
						h.setDelivAddress3(ecOrderH.getDelivAddress3());
					}
				}
				int[] updateCount = tAllocInstHBhv.batchUpdate(tAllocInstHList);
				reUpdCnt = updateCount.length;
						}
			//#2622 直した住所をWMSに反映処理を追加 2017/09/20 K.cho End
		}
		return reUpdCnt;
	}

	/**
	 * <h2>EC受注ヘッダの排他チェックを行う。</h2>
	 * <pre>
	 * 受取った引数と検索したデータのバージョンNo.を比較して、排他チェックを行う。
	 * </pre>
	 * @param ecOrderH EC受注ヘッダ：EC受注ヘッダID・バージョンNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean バージョンNo.違う場合(排他チェックNG)：false
	 */
	public boolean updateCheck(TEcOrderH ecOrderH, ErrorStatus errSts) {
		List<TEcOrderH> tEcOrderHList = new ArrayList<TEcOrderH>();

		if (ecOrderH != null) {
			// 検索条件の設定
			TEcOrderHCB cb = tEcOrderHBhv.newMyConditionBean();
			cb.query().setEcOrderHId_Equal(ecOrderH.getEcOrderHId());
			tEcOrderHList = tEcOrderHBhv.selectList(cb);

			if (tEcOrderHList.size() > 0) {
				for (TEcOrderH head : tEcOrderHList) {
					// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
					if (!CU.isNotNullAndEquals(ecOrderH.getVersionNo(), head.getVersionNo())) {
						// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End
						return false;
					}
				}
			}
		}
		return true;
	}
}
