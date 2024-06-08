package com.oneslogi.ht.wms.logic.system;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.PPrinterAttributeCB;
import com.oneslogi.base.dbflute.cbean.PPrinterCB;
import com.oneslogi.base.dbflute.cbean.PPrinterGroupCB;
import com.oneslogi.base.dbflute.cbean.PReportLayoutCB;
import com.oneslogi.base.dbflute.exbhv.PPrinterAttributeBhv;
import com.oneslogi.base.dbflute.exbhv.PPrinterBhv;
import com.oneslogi.base.dbflute.exbhv.PPrinterGroupBhv;
import com.oneslogi.base.dbflute.exbhv.PReportLayoutBhv;
import com.oneslogi.base.dbflute.exentity.PPrinter;
import com.oneslogi.base.dbflute.exentity.PPrinterAttribute;
import com.oneslogi.base.dbflute.exentity.PPrinterGroup;
import com.oneslogi.base.dbflute.exentity.PReportLayout;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * プリンタ選択データ取得ロジッククラス
 * @author za.nay.km
 *
 */
public class PrinterSelectSelectLogic extends AbstractWmsLogic {

	@Inject
	PReportLayoutBhv pReportLayoutBhv;
	@Inject
	PPrinterGroupBhv pPrinterGroupBhv;
	@Inject
	PPrinterBhv pPrinterBhv;
	@Inject
	PPrinterAttributeBhv pPrinterAttributeBhv;


	/**
	 * 帳票レイアウト情報取得処理
	 * @param pReportLayout  検索条件帳票レイアウト
	 * @return retPReportLayout 検索結果帳票レイアウト
	 * @throws Exception
	 */
	public PReportLayout selectPReportLayout(PReportLayout pReportLayout)throws Exception{

		PReportLayoutCB cb = pReportLayoutBhv.newMyConditionBean();
		cb.query().setReportLayoutId_Equal(pReportLayout.getReportLayoutId());
		PReportLayout retPReportLayout = pReportLayoutBhv.selectEntity(cb);

		return retPReportLayout;
	}

	public PPrinterGroup selectPPrinterGroup(PPrinterGroup pPrinterGroup)throws Exception{

		PPrinterGroupCB cb = pPrinterGroupBhv.newMyConditionBean();
		cb.query().setPrinterGroupId_Equal(pPrinterGroup.getPrinterGroupId());
		PPrinterGroup retPPrinterGroup = pPrinterGroupBhv.selectEntity(cb);

		return retPPrinterGroup;
	}

	public PPrinter selectPPrinter(PPrinter pPrinter)throws Exception{

		PPrinterCB cb = pPrinterBhv.newMyConditionBean();
		cb.query().setPrinterId_Equal(pPrinter.getPrinterId());
		PPrinter retPPrinter = pPrinterBhv.selectEntity(cb);

		return retPPrinter;
	}

	/**
	 * @param pPrinterAttribute
	 * @return
	 * @throws Exception
	 */
	public PPrinterAttribute selectPPrinterAttribute(PPrinterAttribute pPrinterAttribute)throws Exception{

		PPrinterAttributeCB cb = pPrinterAttributeBhv.newMyConditionBean();
		cb.query().setPrinterAttributeId_Equal(pPrinterAttribute.getPrinterAttributeId());
		PPrinterAttribute retPPrinterAttribute = pPrinterAttributeBhv.selectEntity(cb);

		return retPPrinterAttribute;
	}
}
