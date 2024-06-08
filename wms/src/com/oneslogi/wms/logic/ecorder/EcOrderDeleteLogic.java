package com.oneslogi.wms.logic.ecorder;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TAmazonOrderCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderBCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderHCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderRCB;
import com.oneslogi.base.dbflute.cbean.TRakutenOrderCB;
import com.oneslogi.base.dbflute.cbean.TYahooOrderCB;
import com.oneslogi.base.dbflute.exbhv.TAmazonOrderBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderBBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderHBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderRBhv;
import com.oneslogi.base.dbflute.exbhv.TRakutenOrderBhv;
import com.oneslogi.base.dbflute.exbhv.TYahooOrderBhv;
import com.oneslogi.base.dbflute.exentity.TAmazonOrder;
import com.oneslogi.base.dbflute.exentity.TEcOrderB;
import com.oneslogi.base.dbflute.exentity.TEcOrderH;
import com.oneslogi.base.dbflute.exentity.TEcOrderR;
import com.oneslogi.base.dbflute.exentity.TRakutenOrder;
import com.oneslogi.base.dbflute.exentity.TYahooOrder;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * EC受注データ削除ロジッククラス
 */
public class EcOrderDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TEcOrderHBhv tEcOrderHBhv;
	@Inject
	private TEcOrderRBhv tEcOrderRBhv;
	@Inject
	private TEcOrderBBhv tEcOrderBBhv;
	@Inject
	private TRakutenOrderBhv tRakutenOrderBhv;
	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana Start
	@Inject
	private TAmazonOrderBhv tAmazonOrderBhv;
	@Inject
	private TYahooOrderBhv tYahooOrderBhv;
	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana End

	/**
	 * <h2>EC受注データを削除する。</h2>
	 * <pre>
	 * EC受注ヘッダのコントロールNo.を条件に下記テーブルの削除フラグを削除済に設定する。
	 * ・楽天RMS受注
	 * ・Amazon受注
	 * ・Yahoo受注
	 * ・EC受注ヘッダ
	 * ・EC受注帳票
	 * ・EC受注ボディ
	 * </pre>
	 * @param controlNo EC受注ヘッダのコントロールNo.
	 */
	public void delete(Long controlNo) {

		// 楽天RMS受注削除 (削除フラグ=1)
		TRakutenOrderCB roCb = tRakutenOrderBhv.newMyConditionBean();
		roCb.query().queryTEcOrderB().queryTEcOrderH().setControlNo_Equal(controlNo);
		TRakutenOrder tRakutenOrder = new TRakutenOrder();
		tRakutenOrder.setDelFlg_$1();

		tRakutenOrderBhv.queryUpdate(tRakutenOrder, roCb);

		// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana Start
		// Amazon受注削除 (削除フラグ=1)
		TAmazonOrderCB aoCb = tAmazonOrderBhv.newMyConditionBean();
		aoCb.query().queryTEcOrderB().queryTEcOrderH().setControlNo_Equal(controlNo);
		TAmazonOrder tAmazonOrder = new TAmazonOrder();
		tAmazonOrder.setDelFlg_$1();

		tAmazonOrderBhv.queryUpdate(tAmazonOrder, aoCb);

		// Yahoo受注削除 (削除フラグ=1)
		TYahooOrderCB yoCb = tYahooOrderBhv.newMyConditionBean();
		yoCb.query().queryTEcOrderB().queryTEcOrderH().setControlNo_Equal(controlNo);
		TYahooOrder tYahooOrder = new TYahooOrder();
		tYahooOrder.setDelFlg_$1();

		tYahooOrderBhv.queryUpdate(tYahooOrder, yoCb);
		// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana End

		// EC受注ボディ削除 (削除フラグ=1)
		TEcOrderBCB eobCb = tEcOrderBBhv.newMyConditionBean();
		eobCb.query().queryTEcOrderH().setControlNo_Equal(controlNo);
		TEcOrderB tEcOrderB = new TEcOrderB();
		tEcOrderB.setDelFlg_$1();

		tEcOrderBBhv.queryUpdate(tEcOrderB, eobCb);

		// EC受注帳票削除 (削除フラグ=1)
		TEcOrderRCB eorCb = tEcOrderRBhv.newMyConditionBean();
		eorCb.query().queryTEcOrderH().setControlNo_Equal(controlNo);
		TEcOrderR tEcOrderR = new TEcOrderR();
		tEcOrderR.setDelFlg_$1();

		tEcOrderRBhv.queryUpdate(tEcOrderR, eorCb);

		// EC受注ヘッダ削除 (削除フラグ=1)
		TEcOrderHCB eohCb = tEcOrderHBhv.newMyConditionBean();
		eohCb.query().setControlNo_Equal(controlNo);
		TEcOrderH tEcOrderH = new TEcOrderH();
		tEcOrderH.setDelFlg_$1();

		tEcOrderHBhv.queryUpdate(tEcOrderH, eohCb);
	}
}
