package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of M_CENTER.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCenterCQ extends AbstractBsMCenterCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCenterCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCenterCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CENTER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCenterCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCenterCIQ xcreateCIQ() {
        MCenterCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCenterCIQ xnewCIQ() {
        return new MCenterCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CENTER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCenterCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCenterCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MBoxCQ> xdfgetCenterId_ExistsReferrer_MBoxList() { return xgetSQueMap("centerId_ExistsReferrer_MBoxList"); }
    public String keepCenterId_ExistsReferrer_MBoxList(MBoxCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MBoxList", sq); }

    public Map<String, MBoxGrpCQ> xdfgetCenterId_ExistsReferrer_MBoxGrpList() { return xgetSQueMap("centerId_ExistsReferrer_MBoxGrpList"); }
    public String keepCenterId_ExistsReferrer_MBoxGrpList(MBoxGrpCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MBoxGrpList", sq); }

    public Map<String, MCarrierCQ> xdfgetCenterId_ExistsReferrer_MCarrierList() { return xgetSQueMap("centerId_ExistsReferrer_MCarrierList"); }
    public String keepCenterId_ExistsReferrer_MCarrierList(MCarrierCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCarrierList", sq); }

    public Map<String, MCarrierSlipSgwCQ> xdfgetCenterId_ExistsReferrer_MCarrierSlipSgwList() { return xgetSQueMap("centerId_ExistsReferrer_MCarrierSlipSgwList"); }
    public String keepCenterId_ExistsReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCarrierSlipSgwList", sq); }

    public Map<String, MCarrierSlipYmtCQ> xdfgetCenterId_ExistsReferrer_MCarrierSlipYmtList() { return xgetSQueMap("centerId_ExistsReferrer_MCarrierSlipYmtList"); }
    public String keepCenterId_ExistsReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCarrierSlipYmtList", sq); }

    public Map<String, MCarrierSlipYupkCQ> xdfgetCenterId_ExistsReferrer_MCarrierSlipYupkList() { return xgetSQueMap("centerId_ExistsReferrer_MCarrierSlipYupkList"); }
    public String keepCenterId_ExistsReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCarrierSlipYupkList", sq); }

    public Map<String, MCblkCQ> xdfgetCenterId_ExistsReferrer_MCblkList() { return xgetSQueMap("centerId_ExistsReferrer_MCblkList"); }
    public String keepCenterId_ExistsReferrer_MCblkList(MCblkCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCblkList", sq); }

    public Map<String, MCbrctgCQ> xdfgetCenterId_ExistsReferrer_MCbrctgList() { return xgetSQueMap("centerId_ExistsReferrer_MCbrctgList"); }
    public String keepCenterId_ExistsReferrer_MCbrctgList(MCbrctgCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCbrctgList", sq); }

    public Map<String, MCdrcattCQ> xdfgetCenterId_ExistsReferrer_MCdrcattList() { return xgetSQueMap("centerId_ExistsReferrer_MCdrcattList"); }
    public String keepCenterId_ExistsReferrer_MCdrcattList(MCdrcattCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCdrcattList", sq); }

    public Map<String, MCenterClassCQ> xdfgetCenterId_ExistsReferrer_MCenterClassList() { return xgetSQueMap("centerId_ExistsReferrer_MCenterClassList"); }
    public String keepCenterId_ExistsReferrer_MCenterClassList(MCenterClassCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCenterClassList", sq); }

    public Map<String, MCenterColCQ> xdfgetCenterId_ExistsReferrer_MCenterColList() { return xgetSQueMap("centerId_ExistsReferrer_MCenterColList"); }
    public String keepCenterId_ExistsReferrer_MCenterColList(MCenterColCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCenterColList", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetCenterId_ExistsReferrer_MCenterCustomerList() { return xgetSQueMap("centerId_ExistsReferrer_MCenterCustomerList"); }
    public String keepCenterId_ExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCenterCustomerList", sq); }

    public Map<String, MCenterItemCQ> xdfgetCenterId_ExistsReferrer_MCenterItemList() { return xgetSQueMap("centerId_ExistsReferrer_MCenterItemList"); }
    public String keepCenterId_ExistsReferrer_MCenterItemList(MCenterItemCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCenterItemList", sq); }

    public Map<String, MCenterScreenCQ> xdfgetCenterId_ExistsReferrer_MCenterScreenList() { return xgetSQueMap("centerId_ExistsReferrer_MCenterScreenList"); }
    public String keepCenterId_ExistsReferrer_MCenterScreenList(MCenterScreenCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCenterScreenList", sq); }

    public Map<String, MClientCenterCQ> xdfgetCenterId_ExistsReferrer_MClientCenterList() { return xgetSQueMap("centerId_ExistsReferrer_MClientCenterList"); }
    public String keepCenterId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MClientCenterList", sq); }

    public Map<String, MClinCQ> xdfgetCenterId_ExistsReferrer_MClinList() { return xgetSQueMap("centerId_ExistsReferrer_MClinList"); }
    public String keepCenterId_ExistsReferrer_MClinList(MClinCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MClinList", sq); }

    public Map<String, MCorgCQ> xdfgetCenterId_ExistsReferrer_MCorgList() { return xgetSQueMap("centerId_ExistsReferrer_MCorgList"); }
    public String keepCenterId_ExistsReferrer_MCorgList(MCorgCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCorgList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCenterId_ExistsReferrer_MDeliveryCourseList() { return xgetSQueMap("centerId_ExistsReferrer_MDeliveryCourseList"); }
    public String keepCenterId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MDeliveryCourseList", sq); }

    public Map<String, MLocationCQ> xdfgetCenterId_ExistsReferrer_MLocationList() { return xgetSQueMap("centerId_ExistsReferrer_MLocationList"); }
    public String keepCenterId_ExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MLocationList", sq); }

    public Map<String, MMfinvoperationCQ> xdfgetCenterId_ExistsReferrer_MMfinvoperationList() { return xgetSQueMap("centerId_ExistsReferrer_MMfinvoperationList"); }
    public String keepCenterId_ExistsReferrer_MMfinvoperationList(MMfinvoperationCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MMfinvoperationList", sq); }

    public Map<String, MMfmonthchgCQ> xdfgetCenterId_ExistsReferrer_MMfmonthchgList() { return xgetSQueMap("centerId_ExistsReferrer_MMfmonthchgList"); }
    public String keepCenterId_ExistsReferrer_MMfmonthchgList(MMfmonthchgCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MMfmonthchgList", sq); }

    public Map<String, MMfstockitemCQ> xdfgetCenterId_ExistsReferrer_MMfstockitemList() { return xgetSQueMap("centerId_ExistsReferrer_MMfstockitemList"); }
    public String keepCenterId_ExistsReferrer_MMfstockitemList(MMfstockitemCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MMfstockitemList", sq); }

    public Map<String, MMfwhstrctCQ> xdfgetCenterId_ExistsReferrer_MMfwhstrctList() { return xgetSQueMap("centerId_ExistsReferrer_MMfwhstrctList"); }
    public String keepCenterId_ExistsReferrer_MMfwhstrctList(MMfwhstrctCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MMfwhstrctList", sq); }

    public Map<String, MMfwhxitemCQ> xdfgetCenterId_ExistsReferrer_MMfwhxitemList() { return xgetSQueMap("centerId_ExistsReferrer_MMfwhxitemList"); }
    public String keepCenterId_ExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MMfwhxitemList", sq); }

    public Map<String, MNumberingCenterCQ> xdfgetCenterId_ExistsReferrer_MNumberingCenterList() { return xgetSQueMap("centerId_ExistsReferrer_MNumberingCenterList"); }
    public String keepCenterId_ExistsReferrer_MNumberingCenterList(MNumberingCenterCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MNumberingCenterList", sq); }

    public Map<String, MUserCenterCQ> xdfgetCenterId_ExistsReferrer_MUserCenterList() { return xgetSQueMap("centerId_ExistsReferrer_MUserCenterList"); }
    public String keepCenterId_ExistsReferrer_MUserCenterList(MUserCenterCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MUserCenterList", sq); }

    public Map<String, MUserLoginCQ> xdfgetCenterId_ExistsReferrer_MUserLoginList() { return xgetSQueMap("centerId_ExistsReferrer_MUserLoginList"); }
    public String keepCenterId_ExistsReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MUserLoginList", sq); }

    public Map<String, MWarehouseCQ> xdfgetCenterId_ExistsReferrer_MWarehouseList() { return xgetSQueMap("centerId_ExistsReferrer_MWarehouseList"); }
    public String keepCenterId_ExistsReferrer_MWarehouseList(MWarehouseCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MWarehouseList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetCenterId_ExistsReferrer_MWebHtInfoList() { return xgetSQueMap("centerId_ExistsReferrer_MWebHtInfoList"); }
    public String keepCenterId_ExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MWebHtInfoList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetCenterId_ExistsReferrer_TAllocInstHList() { return xgetSQueMap("centerId_ExistsReferrer_TAllocInstHList"); }
    public String keepCenterId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TAllocInstHList", sq); }

    public Map<String, TCcopamCQ> xdfgetCenterId_ExistsReferrer_TCcopamList() { return xgetSQueMap("centerId_ExistsReferrer_TCcopamList"); }
    public String keepCenterId_ExistsReferrer_TCcopamList(TCcopamCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TCcopamList", sq); }

    public Map<String, TCenterSymbolCQ> xdfgetCenterId_ExistsReferrer_TCenterSymbolList() { return xgetSQueMap("centerId_ExistsReferrer_TCenterSymbolList"); }
    public String keepCenterId_ExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TCenterSymbolList", sq); }

    public Map<String, TCordhdrCQ> xdfgetCenterId_ExistsReferrer_TCordhdrList() { return xgetSQueMap("centerId_ExistsReferrer_TCordhdrList"); }
    public String keepCenterId_ExistsReferrer_TCordhdrList(TCordhdrCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TCordhdrList", sq); }

    public Map<String, TCsrwhadmCQ> xdfgetCenterId_ExistsReferrer_TCsrwhadmList() { return xgetSQueMap("centerId_ExistsReferrer_TCsrwhadmList"); }
    public String keepCenterId_ExistsReferrer_TCsrwhadmList(TCsrwhadmCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TCsrwhadmList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetCenterId_ExistsReferrer_TEcOrderHList() { return xgetSQueMap("centerId_ExistsReferrer_TEcOrderHList"); }
    public String keepCenterId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TEcOrderHList", sq); }

    public Map<String, TInventoryHCQ> xdfgetCenterId_ExistsReferrer_TInventoryHList() { return xgetSQueMap("centerId_ExistsReferrer_TInventoryHList"); }
    public String keepCenterId_ExistsReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TInventoryHList", sq); }

    public Map<String, TMflastshiplotCQ> xdfgetCenterId_ExistsReferrer_TMflastshiplotList() { return xgetSQueMap("centerId_ExistsReferrer_TMflastshiplotList"); }
    public String keepCenterId_ExistsReferrer_TMflastshiplotList(TMflastshiplotCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TMflastshiplotList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetCenterId_ExistsReferrer_TMoveInstHList() { return xgetSQueMap("centerId_ExistsReferrer_TMoveInstHList"); }
    public String keepCenterId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetCenterId_ExistsReferrer_TPackingHList() { return xgetSQueMap("centerId_ExistsReferrer_TPackingHList"); }
    public String keepCenterId_ExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TPackingHList", sq); }

    public Map<String, TPalletCQ> xdfgetCenterId_ExistsReferrer_TPalletList() { return xgetSQueMap("centerId_ExistsReferrer_TPalletList"); }
    public String keepCenterId_ExistsReferrer_TPalletList(TPalletCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TPalletList", sq); }

    public Map<String, TPickingHCQ> xdfgetCenterId_ExistsReferrer_TPickingHList() { return xgetSQueMap("centerId_ExistsReferrer_TPickingHList"); }
    public String keepCenterId_ExistsReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TPickingHList", sq); }

    public Map<String, TPicMthdRcmdCQ> xdfgetCenterId_ExistsReferrer_TPicMthdRcmdList() { return xgetSQueMap("centerId_ExistsReferrer_TPicMthdRcmdList"); }
    public String keepCenterId_ExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TPicMthdRcmdList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetCenterId_ExistsReferrer_TReceivePlanHList() { return xgetSQueMap("centerId_ExistsReferrer_TReceivePlanHList"); }
    public String keepCenterId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, TSerialNoCQ> xdfgetCenterId_ExistsReferrer_TSerialNoList() { return xgetSQueMap("centerId_ExistsReferrer_TSerialNoList"); }
    public String keepCenterId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetCenterId_ExistsReferrer_TShippingInstHList() { return xgetSQueMap("centerId_ExistsReferrer_TShippingInstHList"); }
    public String keepCenterId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TShippingInstHList", sq); }

    public Map<String, TSplinfoCQ> xdfgetCenterId_ExistsReferrer_TSplinfoList() { return xgetSQueMap("centerId_ExistsReferrer_TSplinfoList"); }
    public String keepCenterId_ExistsReferrer_TSplinfoList(TSplinfoCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TSplinfoList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetCenterId_ExistsReferrer_TStoreRecordHList() { return xgetSQueMap("centerId_ExistsReferrer_TStoreRecordHList"); }
    public String keepCenterId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, TTrallinvCQ> xdfgetCenterId_ExistsReferrer_TTrallinvList() { return xgetSQueMap("centerId_ExistsReferrer_TTrallinvList"); }
    public String keepCenterId_ExistsReferrer_TTrallinvList(TTrallinvCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrallinvList", sq); }

    public Map<String, TTrallinvhistoryCQ> xdfgetCenterId_ExistsReferrer_TTrallinvhistoryList() { return xgetSQueMap("centerId_ExistsReferrer_TTrallinvhistoryList"); }
    public String keepCenterId_ExistsReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrallinvhistoryList", sq); }

    public Map<String, TTrcaseinventoryCQ> xdfgetCenterId_ExistsReferrer_TTrcaseinventoryList() { return xgetSQueMap("centerId_ExistsReferrer_TTrcaseinventoryList"); }
    public String keepCenterId_ExistsReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrcaseinventoryList", sq); }

    public Map<String, TTrcasenumCQ> xdfgetCenterId_ExistsReferrer_TTrcasenumList() { return xgetSQueMap("centerId_ExistsReferrer_TTrcasenumList"); }
    public String keepCenterId_ExistsReferrer_TTrcasenumList(TTrcasenumCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrcasenumList", sq); }

    public Map<String, TTrcasestockCQ> xdfgetCenterId_ExistsReferrer_TTrcasestockList() { return xgetSQueMap("centerId_ExistsReferrer_TTrcasestockList"); }
    public String keepCenterId_ExistsReferrer_TTrcasestockList(TTrcasestockCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrcasestockList", sq); }

    public Map<String, TTrhanbaiinvCQ> xdfgetCenterId_ExistsReferrer_TTrhanbaiinvList() { return xgetSQueMap("centerId_ExistsReferrer_TTrhanbaiinvList"); }
    public String keepCenterId_ExistsReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrhanbaiinvList", sq); }

    public Map<String, TTrinvcheckinfoCQ> xdfgetCenterId_ExistsReferrer_TTrinvcheckinfoList() { return xgetSQueMap("centerId_ExistsReferrer_TTrinvcheckinfoList"); }
    public String keepCenterId_ExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrinvcheckinfoList", sq); }

    public Map<String, TTrinvcorrectCQ> xdfgetCenterId_ExistsReferrer_TTrinvcorrectList() { return xgetSQueMap("centerId_ExistsReferrer_TTrinvcorrectList"); }
    public String keepCenterId_ExistsReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrinvcorrectList", sq); }

    public Map<String, TTrinvreanswerCQ> xdfgetCenterId_ExistsReferrer_TTrinvreanswerList() { return xgetSQueMap("centerId_ExistsReferrer_TTrinvreanswerList"); }
    public String keepCenterId_ExistsReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrinvreanswerList", sq); }

    public Map<String, TTrinvrequestCQ> xdfgetCenterId_ExistsReferrer_TTrinvrequestList() { return xgetSQueMap("centerId_ExistsReferrer_TTrinvrequestList"); }
    public String keepCenterId_ExistsReferrer_TTrinvrequestList(TTrinvrequestCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrinvrequestList", sq); }

    public Map<String, TTritemconvresultCQ> xdfgetCenterId_ExistsReferrer_TTritemconvresultList() { return xgetSQueMap("centerId_ExistsReferrer_TTritemconvresultList"); }
    public String keepCenterId_ExistsReferrer_TTritemconvresultList(TTritemconvresultCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTritemconvresultList", sq); }

    public Map<String, TTrjukyuinvCQ> xdfgetCenterId_ExistsReferrer_TTrjukyuinvList() { return xgetSQueMap("centerId_ExistsReferrer_TTrjukyuinvList"); }
    public String keepCenterId_ExistsReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrjukyuinvList", sq); }

    public Map<String, TTrmanufacturedateCQ> xdfgetCenterId_ExistsReferrer_TTrmanufacturedateList() { return xgetSQueMap("centerId_ExistsReferrer_TTrmanufacturedateList"); }
    public String keepCenterId_ExistsReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrmanufacturedateList", sq); }

    public Map<String, TTrmanufacturedatedetailCQ> xdfgetCenterId_ExistsReferrer_TTrmanufacturedatedetailList() { return xgetSQueMap("centerId_ExistsReferrer_TTrmanufacturedatedetailList"); }
    public String keepCenterId_ExistsReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrmanufacturedatedetailList", sq); }

    public Map<String, TTrmanufacturedatehistoryCQ> xdfgetCenterId_ExistsReferrer_TTrmanufacturedatehistoryList() { return xgetSQueMap("centerId_ExistsReferrer_TTrmanufacturedatehistoryList"); }
    public String keepCenterId_ExistsReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrmanufacturedatehistoryList", sq); }

    public Map<String, TTrpallettraceCQ> xdfgetCenterId_ExistsReferrer_TTrpallettraceList() { return xgetSQueMap("centerId_ExistsReferrer_TTrpallettraceList"); }
    public String keepCenterId_ExistsReferrer_TTrpallettraceList(TTrpallettraceCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrpallettraceList", sq); }

    public Map<String, TTrreversestockCQ> xdfgetCenterId_ExistsReferrer_TTrreversestockList() { return xgetSQueMap("centerId_ExistsReferrer_TTrreversestockList"); }
    public String keepCenterId_ExistsReferrer_TTrreversestockList(TTrreversestockCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrreversestockList", sq); }

    public Map<String, TTrstockdiffhistoryCQ> xdfgetCenterId_ExistsReferrer_TTrstockdiffhistoryList() { return xgetSQueMap("centerId_ExistsReferrer_TTrstockdiffhistoryList"); }
    public String keepCenterId_ExistsReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrstockdiffhistoryList", sq); }

    public Map<String, TTrsymboltraceCQ> xdfgetCenterId_ExistsReferrer_TTrsymboltraceList() { return xgetSQueMap("centerId_ExistsReferrer_TTrsymboltraceList"); }
    public String keepCenterId_ExistsReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrsymboltraceList", sq); }

    public Map<String, TTrsymboltraceextendCQ> xdfgetCenterId_ExistsReferrer_TTrsymboltraceextendList() { return xgetSQueMap("centerId_ExistsReferrer_TTrsymboltraceextendList"); }
    public String keepCenterId_ExistsReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrsymboltraceextendList", sq); }

    public Map<String, TTrtraceCQ> xdfgetCenterId_ExistsReferrer_TTrtraceList() { return xgetSQueMap("centerId_ExistsReferrer_TTrtraceList"); }
    public String keepCenterId_ExistsReferrer_TTrtraceList(TTrtraceCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TTrtraceList", sq); }

    public Map<String, TYtrsoCQ> xdfgetCenterId_ExistsReferrer_TYtrsoList() { return xgetSQueMap("centerId_ExistsReferrer_TYtrsoList"); }
    public String keepCenterId_ExistsReferrer_TYtrsoList(TYtrsoCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TYtrsoList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetCenterId_ExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("centerId_ExistsReferrer_WHtInventoryInputProdList"); }
    public String keepCenterId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetCenterId_ExistsReferrer_WHtLoadingList() { return xgetSQueMap("centerId_ExistsReferrer_WHtLoadingList"); }
    public String keepCenterId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtLoadingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetCenterId_ExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("centerId_ExistsReferrer_WHtReceiveInspectionList"); }
    public String keepCenterId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCenterId_ExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("centerId_ExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepCenterId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetCenterId_ExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("centerId_ExistsReferrer_WHtReceiveStoreList"); }
    public String keepCenterId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetCenterId_ExistsReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("centerId_ExistsReferrer_WHtSerialReceiveInspList"); }
    public String keepCenterId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetCenterId_ExistsReferrer_WHtSerialShippingInspList() { return xgetSQueMap("centerId_ExistsReferrer_WHtSerialShippingInspList"); }
    public String keepCenterId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, WHtShippingCQ> xdfgetCenterId_ExistsReferrer_WHtShippingList() { return xgetSQueMap("centerId_ExistsReferrer_WHtShippingList"); }
    public String keepCenterId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetCenterId_ExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("centerId_ExistsReferrer_WHtShippingPickingList"); }
    public String keepCenterId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetCenterId_ExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("centerId_ExistsReferrer_WSglRowShipInspHList"); }
    public String keepCenterId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetCenterId_ExistsReferrer_WShippingInterruptList() { return xgetSQueMap("centerId_ExistsReferrer_WShippingInterruptList"); }
    public String keepCenterId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, MBoxCQ> xdfgetCenterId_NotExistsReferrer_MBoxList() { return xgetSQueMap("centerId_NotExistsReferrer_MBoxList"); }
    public String keepCenterId_NotExistsReferrer_MBoxList(MBoxCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MBoxList", sq); }

    public Map<String, MBoxGrpCQ> xdfgetCenterId_NotExistsReferrer_MBoxGrpList() { return xgetSQueMap("centerId_NotExistsReferrer_MBoxGrpList"); }
    public String keepCenterId_NotExistsReferrer_MBoxGrpList(MBoxGrpCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MBoxGrpList", sq); }

    public Map<String, MCarrierCQ> xdfgetCenterId_NotExistsReferrer_MCarrierList() { return xgetSQueMap("centerId_NotExistsReferrer_MCarrierList"); }
    public String keepCenterId_NotExistsReferrer_MCarrierList(MCarrierCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCarrierList", sq); }

    public Map<String, MCarrierSlipSgwCQ> xdfgetCenterId_NotExistsReferrer_MCarrierSlipSgwList() { return xgetSQueMap("centerId_NotExistsReferrer_MCarrierSlipSgwList"); }
    public String keepCenterId_NotExistsReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCarrierSlipSgwList", sq); }

    public Map<String, MCarrierSlipYmtCQ> xdfgetCenterId_NotExistsReferrer_MCarrierSlipYmtList() { return xgetSQueMap("centerId_NotExistsReferrer_MCarrierSlipYmtList"); }
    public String keepCenterId_NotExistsReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCarrierSlipYmtList", sq); }

    public Map<String, MCarrierSlipYupkCQ> xdfgetCenterId_NotExistsReferrer_MCarrierSlipYupkList() { return xgetSQueMap("centerId_NotExistsReferrer_MCarrierSlipYupkList"); }
    public String keepCenterId_NotExistsReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCarrierSlipYupkList", sq); }

    public Map<String, MCblkCQ> xdfgetCenterId_NotExistsReferrer_MCblkList() { return xgetSQueMap("centerId_NotExistsReferrer_MCblkList"); }
    public String keepCenterId_NotExistsReferrer_MCblkList(MCblkCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCblkList", sq); }

    public Map<String, MCbrctgCQ> xdfgetCenterId_NotExistsReferrer_MCbrctgList() { return xgetSQueMap("centerId_NotExistsReferrer_MCbrctgList"); }
    public String keepCenterId_NotExistsReferrer_MCbrctgList(MCbrctgCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCbrctgList", sq); }

    public Map<String, MCdrcattCQ> xdfgetCenterId_NotExistsReferrer_MCdrcattList() { return xgetSQueMap("centerId_NotExistsReferrer_MCdrcattList"); }
    public String keepCenterId_NotExistsReferrer_MCdrcattList(MCdrcattCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCdrcattList", sq); }

    public Map<String, MCenterClassCQ> xdfgetCenterId_NotExistsReferrer_MCenterClassList() { return xgetSQueMap("centerId_NotExistsReferrer_MCenterClassList"); }
    public String keepCenterId_NotExistsReferrer_MCenterClassList(MCenterClassCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCenterClassList", sq); }

    public Map<String, MCenterColCQ> xdfgetCenterId_NotExistsReferrer_MCenterColList() { return xgetSQueMap("centerId_NotExistsReferrer_MCenterColList"); }
    public String keepCenterId_NotExistsReferrer_MCenterColList(MCenterColCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCenterColList", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetCenterId_NotExistsReferrer_MCenterCustomerList() { return xgetSQueMap("centerId_NotExistsReferrer_MCenterCustomerList"); }
    public String keepCenterId_NotExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCenterCustomerList", sq); }

    public Map<String, MCenterItemCQ> xdfgetCenterId_NotExistsReferrer_MCenterItemList() { return xgetSQueMap("centerId_NotExistsReferrer_MCenterItemList"); }
    public String keepCenterId_NotExistsReferrer_MCenterItemList(MCenterItemCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCenterItemList", sq); }

    public Map<String, MCenterScreenCQ> xdfgetCenterId_NotExistsReferrer_MCenterScreenList() { return xgetSQueMap("centerId_NotExistsReferrer_MCenterScreenList"); }
    public String keepCenterId_NotExistsReferrer_MCenterScreenList(MCenterScreenCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCenterScreenList", sq); }

    public Map<String, MClientCenterCQ> xdfgetCenterId_NotExistsReferrer_MClientCenterList() { return xgetSQueMap("centerId_NotExistsReferrer_MClientCenterList"); }
    public String keepCenterId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MClientCenterList", sq); }

    public Map<String, MClinCQ> xdfgetCenterId_NotExistsReferrer_MClinList() { return xgetSQueMap("centerId_NotExistsReferrer_MClinList"); }
    public String keepCenterId_NotExistsReferrer_MClinList(MClinCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MClinList", sq); }

    public Map<String, MCorgCQ> xdfgetCenterId_NotExistsReferrer_MCorgList() { return xgetSQueMap("centerId_NotExistsReferrer_MCorgList"); }
    public String keepCenterId_NotExistsReferrer_MCorgList(MCorgCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCorgList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCenterId_NotExistsReferrer_MDeliveryCourseList() { return xgetSQueMap("centerId_NotExistsReferrer_MDeliveryCourseList"); }
    public String keepCenterId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MDeliveryCourseList", sq); }

    public Map<String, MLocationCQ> xdfgetCenterId_NotExistsReferrer_MLocationList() { return xgetSQueMap("centerId_NotExistsReferrer_MLocationList"); }
    public String keepCenterId_NotExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MLocationList", sq); }

    public Map<String, MMfinvoperationCQ> xdfgetCenterId_NotExistsReferrer_MMfinvoperationList() { return xgetSQueMap("centerId_NotExistsReferrer_MMfinvoperationList"); }
    public String keepCenterId_NotExistsReferrer_MMfinvoperationList(MMfinvoperationCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MMfinvoperationList", sq); }

    public Map<String, MMfmonthchgCQ> xdfgetCenterId_NotExistsReferrer_MMfmonthchgList() { return xgetSQueMap("centerId_NotExistsReferrer_MMfmonthchgList"); }
    public String keepCenterId_NotExistsReferrer_MMfmonthchgList(MMfmonthchgCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MMfmonthchgList", sq); }

    public Map<String, MMfstockitemCQ> xdfgetCenterId_NotExistsReferrer_MMfstockitemList() { return xgetSQueMap("centerId_NotExistsReferrer_MMfstockitemList"); }
    public String keepCenterId_NotExistsReferrer_MMfstockitemList(MMfstockitemCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MMfstockitemList", sq); }

    public Map<String, MMfwhstrctCQ> xdfgetCenterId_NotExistsReferrer_MMfwhstrctList() { return xgetSQueMap("centerId_NotExistsReferrer_MMfwhstrctList"); }
    public String keepCenterId_NotExistsReferrer_MMfwhstrctList(MMfwhstrctCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MMfwhstrctList", sq); }

    public Map<String, MMfwhxitemCQ> xdfgetCenterId_NotExistsReferrer_MMfwhxitemList() { return xgetSQueMap("centerId_NotExistsReferrer_MMfwhxitemList"); }
    public String keepCenterId_NotExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MMfwhxitemList", sq); }

    public Map<String, MNumberingCenterCQ> xdfgetCenterId_NotExistsReferrer_MNumberingCenterList() { return xgetSQueMap("centerId_NotExistsReferrer_MNumberingCenterList"); }
    public String keepCenterId_NotExistsReferrer_MNumberingCenterList(MNumberingCenterCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MNumberingCenterList", sq); }

    public Map<String, MUserCenterCQ> xdfgetCenterId_NotExistsReferrer_MUserCenterList() { return xgetSQueMap("centerId_NotExistsReferrer_MUserCenterList"); }
    public String keepCenterId_NotExistsReferrer_MUserCenterList(MUserCenterCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MUserCenterList", sq); }

    public Map<String, MUserLoginCQ> xdfgetCenterId_NotExistsReferrer_MUserLoginList() { return xgetSQueMap("centerId_NotExistsReferrer_MUserLoginList"); }
    public String keepCenterId_NotExistsReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MUserLoginList", sq); }

    public Map<String, MWarehouseCQ> xdfgetCenterId_NotExistsReferrer_MWarehouseList() { return xgetSQueMap("centerId_NotExistsReferrer_MWarehouseList"); }
    public String keepCenterId_NotExistsReferrer_MWarehouseList(MWarehouseCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MWarehouseList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetCenterId_NotExistsReferrer_MWebHtInfoList() { return xgetSQueMap("centerId_NotExistsReferrer_MWebHtInfoList"); }
    public String keepCenterId_NotExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MWebHtInfoList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetCenterId_NotExistsReferrer_TAllocInstHList() { return xgetSQueMap("centerId_NotExistsReferrer_TAllocInstHList"); }
    public String keepCenterId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TAllocInstHList", sq); }

    public Map<String, TCcopamCQ> xdfgetCenterId_NotExistsReferrer_TCcopamList() { return xgetSQueMap("centerId_NotExistsReferrer_TCcopamList"); }
    public String keepCenterId_NotExistsReferrer_TCcopamList(TCcopamCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TCcopamList", sq); }

    public Map<String, TCenterSymbolCQ> xdfgetCenterId_NotExistsReferrer_TCenterSymbolList() { return xgetSQueMap("centerId_NotExistsReferrer_TCenterSymbolList"); }
    public String keepCenterId_NotExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TCenterSymbolList", sq); }

    public Map<String, TCordhdrCQ> xdfgetCenterId_NotExistsReferrer_TCordhdrList() { return xgetSQueMap("centerId_NotExistsReferrer_TCordhdrList"); }
    public String keepCenterId_NotExistsReferrer_TCordhdrList(TCordhdrCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TCordhdrList", sq); }

    public Map<String, TCsrwhadmCQ> xdfgetCenterId_NotExistsReferrer_TCsrwhadmList() { return xgetSQueMap("centerId_NotExistsReferrer_TCsrwhadmList"); }
    public String keepCenterId_NotExistsReferrer_TCsrwhadmList(TCsrwhadmCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TCsrwhadmList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetCenterId_NotExistsReferrer_TEcOrderHList() { return xgetSQueMap("centerId_NotExistsReferrer_TEcOrderHList"); }
    public String keepCenterId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TEcOrderHList", sq); }

    public Map<String, TInventoryHCQ> xdfgetCenterId_NotExistsReferrer_TInventoryHList() { return xgetSQueMap("centerId_NotExistsReferrer_TInventoryHList"); }
    public String keepCenterId_NotExistsReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TInventoryHList", sq); }

    public Map<String, TMflastshiplotCQ> xdfgetCenterId_NotExistsReferrer_TMflastshiplotList() { return xgetSQueMap("centerId_NotExistsReferrer_TMflastshiplotList"); }
    public String keepCenterId_NotExistsReferrer_TMflastshiplotList(TMflastshiplotCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TMflastshiplotList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetCenterId_NotExistsReferrer_TMoveInstHList() { return xgetSQueMap("centerId_NotExistsReferrer_TMoveInstHList"); }
    public String keepCenterId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetCenterId_NotExistsReferrer_TPackingHList() { return xgetSQueMap("centerId_NotExistsReferrer_TPackingHList"); }
    public String keepCenterId_NotExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TPackingHList", sq); }

    public Map<String, TPalletCQ> xdfgetCenterId_NotExistsReferrer_TPalletList() { return xgetSQueMap("centerId_NotExistsReferrer_TPalletList"); }
    public String keepCenterId_NotExistsReferrer_TPalletList(TPalletCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TPalletList", sq); }

    public Map<String, TPickingHCQ> xdfgetCenterId_NotExistsReferrer_TPickingHList() { return xgetSQueMap("centerId_NotExistsReferrer_TPickingHList"); }
    public String keepCenterId_NotExistsReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TPickingHList", sq); }

    public Map<String, TPicMthdRcmdCQ> xdfgetCenterId_NotExistsReferrer_TPicMthdRcmdList() { return xgetSQueMap("centerId_NotExistsReferrer_TPicMthdRcmdList"); }
    public String keepCenterId_NotExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TPicMthdRcmdList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetCenterId_NotExistsReferrer_TReceivePlanHList() { return xgetSQueMap("centerId_NotExistsReferrer_TReceivePlanHList"); }
    public String keepCenterId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, TSerialNoCQ> xdfgetCenterId_NotExistsReferrer_TSerialNoList() { return xgetSQueMap("centerId_NotExistsReferrer_TSerialNoList"); }
    public String keepCenterId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetCenterId_NotExistsReferrer_TShippingInstHList() { return xgetSQueMap("centerId_NotExistsReferrer_TShippingInstHList"); }
    public String keepCenterId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TShippingInstHList", sq); }

    public Map<String, TSplinfoCQ> xdfgetCenterId_NotExistsReferrer_TSplinfoList() { return xgetSQueMap("centerId_NotExistsReferrer_TSplinfoList"); }
    public String keepCenterId_NotExistsReferrer_TSplinfoList(TSplinfoCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TSplinfoList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetCenterId_NotExistsReferrer_TStoreRecordHList() { return xgetSQueMap("centerId_NotExistsReferrer_TStoreRecordHList"); }
    public String keepCenterId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, TTrallinvCQ> xdfgetCenterId_NotExistsReferrer_TTrallinvList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrallinvList"); }
    public String keepCenterId_NotExistsReferrer_TTrallinvList(TTrallinvCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrallinvList", sq); }

    public Map<String, TTrallinvhistoryCQ> xdfgetCenterId_NotExistsReferrer_TTrallinvhistoryList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrallinvhistoryList"); }
    public String keepCenterId_NotExistsReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrallinvhistoryList", sq); }

    public Map<String, TTrcaseinventoryCQ> xdfgetCenterId_NotExistsReferrer_TTrcaseinventoryList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrcaseinventoryList"); }
    public String keepCenterId_NotExistsReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrcaseinventoryList", sq); }

    public Map<String, TTrcasenumCQ> xdfgetCenterId_NotExistsReferrer_TTrcasenumList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrcasenumList"); }
    public String keepCenterId_NotExistsReferrer_TTrcasenumList(TTrcasenumCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrcasenumList", sq); }

    public Map<String, TTrcasestockCQ> xdfgetCenterId_NotExistsReferrer_TTrcasestockList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrcasestockList"); }
    public String keepCenterId_NotExistsReferrer_TTrcasestockList(TTrcasestockCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrcasestockList", sq); }

    public Map<String, TTrhanbaiinvCQ> xdfgetCenterId_NotExistsReferrer_TTrhanbaiinvList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrhanbaiinvList"); }
    public String keepCenterId_NotExistsReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrhanbaiinvList", sq); }

    public Map<String, TTrinvcheckinfoCQ> xdfgetCenterId_NotExistsReferrer_TTrinvcheckinfoList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrinvcheckinfoList"); }
    public String keepCenterId_NotExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrinvcheckinfoList", sq); }

    public Map<String, TTrinvcorrectCQ> xdfgetCenterId_NotExistsReferrer_TTrinvcorrectList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrinvcorrectList"); }
    public String keepCenterId_NotExistsReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrinvcorrectList", sq); }

    public Map<String, TTrinvreanswerCQ> xdfgetCenterId_NotExistsReferrer_TTrinvreanswerList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrinvreanswerList"); }
    public String keepCenterId_NotExistsReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrinvreanswerList", sq); }

    public Map<String, TTrinvrequestCQ> xdfgetCenterId_NotExistsReferrer_TTrinvrequestList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrinvrequestList"); }
    public String keepCenterId_NotExistsReferrer_TTrinvrequestList(TTrinvrequestCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrinvrequestList", sq); }

    public Map<String, TTritemconvresultCQ> xdfgetCenterId_NotExistsReferrer_TTritemconvresultList() { return xgetSQueMap("centerId_NotExistsReferrer_TTritemconvresultList"); }
    public String keepCenterId_NotExistsReferrer_TTritemconvresultList(TTritemconvresultCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTritemconvresultList", sq); }

    public Map<String, TTrjukyuinvCQ> xdfgetCenterId_NotExistsReferrer_TTrjukyuinvList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrjukyuinvList"); }
    public String keepCenterId_NotExistsReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrjukyuinvList", sq); }

    public Map<String, TTrmanufacturedateCQ> xdfgetCenterId_NotExistsReferrer_TTrmanufacturedateList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrmanufacturedateList"); }
    public String keepCenterId_NotExistsReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrmanufacturedateList", sq); }

    public Map<String, TTrmanufacturedatedetailCQ> xdfgetCenterId_NotExistsReferrer_TTrmanufacturedatedetailList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrmanufacturedatedetailList"); }
    public String keepCenterId_NotExistsReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrmanufacturedatedetailList", sq); }

    public Map<String, TTrmanufacturedatehistoryCQ> xdfgetCenterId_NotExistsReferrer_TTrmanufacturedatehistoryList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrmanufacturedatehistoryList"); }
    public String keepCenterId_NotExistsReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrmanufacturedatehistoryList", sq); }

    public Map<String, TTrpallettraceCQ> xdfgetCenterId_NotExistsReferrer_TTrpallettraceList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrpallettraceList"); }
    public String keepCenterId_NotExistsReferrer_TTrpallettraceList(TTrpallettraceCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrpallettraceList", sq); }

    public Map<String, TTrreversestockCQ> xdfgetCenterId_NotExistsReferrer_TTrreversestockList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrreversestockList"); }
    public String keepCenterId_NotExistsReferrer_TTrreversestockList(TTrreversestockCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrreversestockList", sq); }

    public Map<String, TTrstockdiffhistoryCQ> xdfgetCenterId_NotExistsReferrer_TTrstockdiffhistoryList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrstockdiffhistoryList"); }
    public String keepCenterId_NotExistsReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrstockdiffhistoryList", sq); }

    public Map<String, TTrsymboltraceCQ> xdfgetCenterId_NotExistsReferrer_TTrsymboltraceList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrsymboltraceList"); }
    public String keepCenterId_NotExistsReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrsymboltraceList", sq); }

    public Map<String, TTrsymboltraceextendCQ> xdfgetCenterId_NotExistsReferrer_TTrsymboltraceextendList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrsymboltraceextendList"); }
    public String keepCenterId_NotExistsReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrsymboltraceextendList", sq); }

    public Map<String, TTrtraceCQ> xdfgetCenterId_NotExistsReferrer_TTrtraceList() { return xgetSQueMap("centerId_NotExistsReferrer_TTrtraceList"); }
    public String keepCenterId_NotExistsReferrer_TTrtraceList(TTrtraceCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TTrtraceList", sq); }

    public Map<String, TYtrsoCQ> xdfgetCenterId_NotExistsReferrer_TYtrsoList() { return xgetSQueMap("centerId_NotExistsReferrer_TYtrsoList"); }
    public String keepCenterId_NotExistsReferrer_TYtrsoList(TYtrsoCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TYtrsoList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetCenterId_NotExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtInventoryInputProdList"); }
    public String keepCenterId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetCenterId_NotExistsReferrer_WHtLoadingList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtLoadingList"); }
    public String keepCenterId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtLoadingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetCenterId_NotExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtReceiveInspectionList"); }
    public String keepCenterId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCenterId_NotExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepCenterId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetCenterId_NotExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtReceiveStoreList"); }
    public String keepCenterId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetCenterId_NotExistsReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtSerialReceiveInspList"); }
    public String keepCenterId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetCenterId_NotExistsReferrer_WHtSerialShippingInspList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtSerialShippingInspList"); }
    public String keepCenterId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, WHtShippingCQ> xdfgetCenterId_NotExistsReferrer_WHtShippingList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtShippingList"); }
    public String keepCenterId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetCenterId_NotExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtShippingPickingList"); }
    public String keepCenterId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetCenterId_NotExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("centerId_NotExistsReferrer_WSglRowShipInspHList"); }
    public String keepCenterId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetCenterId_NotExistsReferrer_WShippingInterruptList() { return xgetSQueMap("centerId_NotExistsReferrer_WShippingInterruptList"); }
    public String keepCenterId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, MBoxCQ> xdfgetCenterId_SpecifyDerivedReferrer_MBoxList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MBoxList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MBoxList(MBoxCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MBoxList", sq); }

    public Map<String, MBoxGrpCQ> xdfgetCenterId_SpecifyDerivedReferrer_MBoxGrpList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MBoxGrpList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MBoxGrpList", sq); }

    public Map<String, MCarrierCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCarrierList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCarrierList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierList(MCarrierCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCarrierList", sq); }

    public Map<String, MCarrierSlipSgwCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCarrierSlipSgwList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCarrierSlipSgwList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCarrierSlipSgwList", sq); }

    public Map<String, MCarrierSlipYmtCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCarrierSlipYmtList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCarrierSlipYmtList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCarrierSlipYmtList", sq); }

    public Map<String, MCarrierSlipYupkCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCarrierSlipYupkList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCarrierSlipYupkList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCarrierSlipYupkList", sq); }

    public Map<String, MCblkCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCblkList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCblkList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCblkList(MCblkCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCblkList", sq); }

    public Map<String, MCbrctgCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCbrctgList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCbrctgList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCbrctgList(MCbrctgCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCbrctgList", sq); }

    public Map<String, MCdrcattCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCdrcattList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCdrcattList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCdrcattList(MCdrcattCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCdrcattList", sq); }

    public Map<String, MCenterClassCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCenterClassList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCenterClassList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterClassList(MCenterClassCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCenterClassList", sq); }

    public Map<String, MCenterColCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCenterColList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCenterColList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterColList(MCenterColCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCenterColList", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCenterCustomerList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCenterCustomerList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCenterCustomerList", sq); }

    public Map<String, MCenterItemCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCenterItemList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCenterItemList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterItemList(MCenterItemCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCenterItemList", sq); }

    public Map<String, MCenterScreenCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCenterScreenList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCenterScreenList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCenterScreenList", sq); }

    public Map<String, MClientCenterCQ> xdfgetCenterId_SpecifyDerivedReferrer_MClientCenterList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MClientCenterList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MClientCenterList", sq); }

    public Map<String, MClinCQ> xdfgetCenterId_SpecifyDerivedReferrer_MClinList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MClinList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MClinList(MClinCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MClinList", sq); }

    public Map<String, MCorgCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCorgList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCorgList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCorgList(MCorgCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCorgList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCenterId_SpecifyDerivedReferrer_MDeliveryCourseList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MDeliveryCourseList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MDeliveryCourseList", sq); }

    public Map<String, MLocationCQ> xdfgetCenterId_SpecifyDerivedReferrer_MLocationList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MLocationList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MLocationList", sq); }

    public Map<String, MMfinvoperationCQ> xdfgetCenterId_SpecifyDerivedReferrer_MMfinvoperationList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MMfinvoperationList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MMfinvoperationList(MMfinvoperationCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MMfinvoperationList", sq); }

    public Map<String, MMfmonthchgCQ> xdfgetCenterId_SpecifyDerivedReferrer_MMfmonthchgList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MMfmonthchgList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MMfmonthchgList(MMfmonthchgCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MMfmonthchgList", sq); }

    public Map<String, MMfstockitemCQ> xdfgetCenterId_SpecifyDerivedReferrer_MMfstockitemList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MMfstockitemList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MMfstockitemList(MMfstockitemCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MMfstockitemList", sq); }

    public Map<String, MMfwhstrctCQ> xdfgetCenterId_SpecifyDerivedReferrer_MMfwhstrctList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MMfwhstrctList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MMfwhstrctList(MMfwhstrctCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MMfwhstrctList", sq); }

    public Map<String, MMfwhxitemCQ> xdfgetCenterId_SpecifyDerivedReferrer_MMfwhxitemList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MMfwhxitemList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MMfwhxitemList", sq); }

    public Map<String, MNumberingCenterCQ> xdfgetCenterId_SpecifyDerivedReferrer_MNumberingCenterList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MNumberingCenterList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MNumberingCenterList(MNumberingCenterCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MNumberingCenterList", sq); }

    public Map<String, MUserCenterCQ> xdfgetCenterId_SpecifyDerivedReferrer_MUserCenterList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MUserCenterList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MUserCenterList(MUserCenterCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MUserCenterList", sq); }

    public Map<String, MUserLoginCQ> xdfgetCenterId_SpecifyDerivedReferrer_MUserLoginList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MUserLoginList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MUserLoginList", sq); }

    public Map<String, MWarehouseCQ> xdfgetCenterId_SpecifyDerivedReferrer_MWarehouseList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MWarehouseList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MWarehouseList(MWarehouseCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MWarehouseList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetCenterId_SpecifyDerivedReferrer_MWebHtInfoList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MWebHtInfoList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MWebHtInfoList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TAllocInstHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TAllocInstHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TAllocInstHList", sq); }

    public Map<String, TCcopamCQ> xdfgetCenterId_SpecifyDerivedReferrer_TCcopamList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TCcopamList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TCcopamList(TCcopamCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TCcopamList", sq); }

    public Map<String, TCenterSymbolCQ> xdfgetCenterId_SpecifyDerivedReferrer_TCenterSymbolList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TCenterSymbolList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TCenterSymbolList", sq); }

    public Map<String, TCordhdrCQ> xdfgetCenterId_SpecifyDerivedReferrer_TCordhdrList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TCordhdrList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TCordhdrList(TCordhdrCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TCordhdrList", sq); }

    public Map<String, TCsrwhadmCQ> xdfgetCenterId_SpecifyDerivedReferrer_TCsrwhadmList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TCsrwhadmList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TCsrwhadmList(TCsrwhadmCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TCsrwhadmList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TEcOrderHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TEcOrderHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TEcOrderHList", sq); }

    public Map<String, TInventoryHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TInventoryHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TInventoryHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TInventoryHList", sq); }

    public Map<String, TMflastshiplotCQ> xdfgetCenterId_SpecifyDerivedReferrer_TMflastshiplotList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TMflastshiplotList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TMflastshiplotList(TMflastshiplotCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TMflastshiplotList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TMoveInstHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TMoveInstHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TPackingHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TPackingHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TPackingHList", sq); }

    public Map<String, TPalletCQ> xdfgetCenterId_SpecifyDerivedReferrer_TPalletList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TPalletList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TPalletList(TPalletCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TPalletList", sq); }

    public Map<String, TPickingHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TPickingHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TPickingHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TPickingHList", sq); }

    public Map<String, TPicMthdRcmdCQ> xdfgetCenterId_SpecifyDerivedReferrer_TPicMthdRcmdList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TPicMthdRcmdList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TPicMthdRcmdList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TReceivePlanHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TReceivePlanHList", sq); }

    public Map<String, TSerialNoCQ> xdfgetCenterId_SpecifyDerivedReferrer_TSerialNoList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TSerialNoList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TShippingInstHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TShippingInstHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TShippingInstHList", sq); }

    public Map<String, TSplinfoCQ> xdfgetCenterId_SpecifyDerivedReferrer_TSplinfoList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TSplinfoList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TSplinfoList(TSplinfoCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TSplinfoList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TStoreRecordHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TStoreRecordHList", sq); }

    public Map<String, TTrallinvCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrallinvList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrallinvList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrallinvList(TTrallinvCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrallinvList", sq); }

    public Map<String, TTrallinvhistoryCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrallinvhistoryList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrallinvhistoryList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrallinvhistoryList", sq); }

    public Map<String, TTrcaseinventoryCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrcaseinventoryList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrcaseinventoryList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrcaseinventoryList", sq); }

    public Map<String, TTrcasenumCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrcasenumList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrcasenumList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrcasenumList(TTrcasenumCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrcasenumList", sq); }

    public Map<String, TTrcasestockCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrcasestockList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrcasestockList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrcasestockList(TTrcasestockCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrcasestockList", sq); }

    public Map<String, TTrhanbaiinvCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrhanbaiinvList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrhanbaiinvList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrhanbaiinvList", sq); }

    public Map<String, TTrinvcheckinfoCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrinvcheckinfoList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrinvcheckinfoList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrinvcheckinfoList", sq); }

    public Map<String, TTrinvcorrectCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrinvcorrectList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrinvcorrectList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrinvcorrectList", sq); }

    public Map<String, TTrinvreanswerCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrinvreanswerList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrinvreanswerList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrinvreanswerList", sq); }

    public Map<String, TTrinvrequestCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrinvrequestList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrinvrequestList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrinvrequestList(TTrinvrequestCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrinvrequestList", sq); }

    public Map<String, TTritemconvresultCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTritemconvresultList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTritemconvresultList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTritemconvresultList(TTritemconvresultCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTritemconvresultList", sq); }

    public Map<String, TTrjukyuinvCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrjukyuinvList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrjukyuinvList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrjukyuinvList", sq); }

    public Map<String, TTrmanufacturedateCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrmanufacturedateList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrmanufacturedateList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrmanufacturedateList", sq); }

    public Map<String, TTrmanufacturedatedetailCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList", sq); }

    public Map<String, TTrmanufacturedatehistoryCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList", sq); }

    public Map<String, TTrpallettraceCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrpallettraceList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrpallettraceList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrpallettraceList(TTrpallettraceCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrpallettraceList", sq); }

    public Map<String, TTrreversestockCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrreversestockList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrreversestockList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrreversestockList(TTrreversestockCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrreversestockList", sq); }

    public Map<String, TTrstockdiffhistoryCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrstockdiffhistoryList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrstockdiffhistoryList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrstockdiffhistoryList", sq); }

    public Map<String, TTrsymboltraceCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrsymboltraceList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrsymboltraceList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrsymboltraceList", sq); }

    public Map<String, TTrsymboltraceextendCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrsymboltraceextendList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrsymboltraceextendList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrsymboltraceextendList", sq); }

    public Map<String, TTrtraceCQ> xdfgetCenterId_SpecifyDerivedReferrer_TTrtraceList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TTrtraceList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TTrtraceList(TTrtraceCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TTrtraceList", sq); }

    public Map<String, TYtrsoCQ> xdfgetCenterId_SpecifyDerivedReferrer_TYtrsoList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TYtrsoList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TYtrsoList(TYtrsoCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TYtrsoList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtLoadingList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtLoadingList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtLoadingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtReceiveStoreList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtSerialShippingInspList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, WHtShippingCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtShippingList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtShippingList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtShippingPickingList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtShippingPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetCenterId_SpecifyDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WSglRowShipInspHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetCenterId_SpecifyDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WShippingInterruptList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WShippingInterruptList", sq); }

    public Map<String, MBoxCQ> xdfgetCenterId_QueryDerivedReferrer_MBoxList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MBoxList"); }
    public String keepCenterId_QueryDerivedReferrer_MBoxList(MBoxCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MBoxList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MBoxListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MBoxList"); }
    public String keepCenterId_QueryDerivedReferrer_MBoxListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MBoxList", pm); }

    public Map<String, MBoxGrpCQ> xdfgetCenterId_QueryDerivedReferrer_MBoxGrpList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MBoxGrpList"); }
    public String keepCenterId_QueryDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MBoxGrpList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MBoxGrpListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MBoxGrpList"); }
    public String keepCenterId_QueryDerivedReferrer_MBoxGrpListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MBoxGrpList", pm); }

    public Map<String, MCarrierCQ> xdfgetCenterId_QueryDerivedReferrer_MCarrierList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCarrierList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierList(MCarrierCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCarrierList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCarrierListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCarrierList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCarrierList", pm); }

    public Map<String, MCarrierSlipSgwCQ> xdfgetCenterId_QueryDerivedReferrer_MCarrierSlipSgwList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCarrierSlipSgwList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCarrierSlipSgwList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCarrierSlipSgwListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCarrierSlipSgwList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCarrierSlipSgwList", pm); }

    public Map<String, MCarrierSlipYmtCQ> xdfgetCenterId_QueryDerivedReferrer_MCarrierSlipYmtList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCarrierSlipYmtList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCarrierSlipYmtList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCarrierSlipYmtListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCarrierSlipYmtList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCarrierSlipYmtList", pm); }

    public Map<String, MCarrierSlipYupkCQ> xdfgetCenterId_QueryDerivedReferrer_MCarrierSlipYupkList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCarrierSlipYupkList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCarrierSlipYupkList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCarrierSlipYupkListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCarrierSlipYupkList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCarrierSlipYupkList", pm); }

    public Map<String, MCblkCQ> xdfgetCenterId_QueryDerivedReferrer_MCblkList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCblkList"); }
    public String keepCenterId_QueryDerivedReferrer_MCblkList(MCblkCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCblkList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCblkListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCblkList"); }
    public String keepCenterId_QueryDerivedReferrer_MCblkListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCblkList", pm); }

    public Map<String, MCbrctgCQ> xdfgetCenterId_QueryDerivedReferrer_MCbrctgList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCbrctgList"); }
    public String keepCenterId_QueryDerivedReferrer_MCbrctgList(MCbrctgCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCbrctgList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCbrctgListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCbrctgList"); }
    public String keepCenterId_QueryDerivedReferrer_MCbrctgListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCbrctgList", pm); }

    public Map<String, MCdrcattCQ> xdfgetCenterId_QueryDerivedReferrer_MCdrcattList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCdrcattList"); }
    public String keepCenterId_QueryDerivedReferrer_MCdrcattList(MCdrcattCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCdrcattList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCdrcattListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCdrcattList"); }
    public String keepCenterId_QueryDerivedReferrer_MCdrcattListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCdrcattList", pm); }

    public Map<String, MCenterClassCQ> xdfgetCenterId_QueryDerivedReferrer_MCenterClassList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCenterClassList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterClassList(MCenterClassCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCenterClassList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCenterClassListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCenterClassList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterClassListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCenterClassList", pm); }

    public Map<String, MCenterColCQ> xdfgetCenterId_QueryDerivedReferrer_MCenterColList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCenterColList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterColList(MCenterColCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCenterColList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCenterColListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCenterColList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterColListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCenterColList", pm); }

    public Map<String, MCenterCustomerCQ> xdfgetCenterId_QueryDerivedReferrer_MCenterCustomerList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCenterCustomerList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCenterCustomerList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCenterCustomerListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCenterCustomerList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterCustomerListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCenterCustomerList", pm); }

    public Map<String, MCenterItemCQ> xdfgetCenterId_QueryDerivedReferrer_MCenterItemList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCenterItemList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterItemList(MCenterItemCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCenterItemList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCenterItemListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCenterItemList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterItemListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCenterItemList", pm); }

    public Map<String, MCenterScreenCQ> xdfgetCenterId_QueryDerivedReferrer_MCenterScreenList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCenterScreenList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCenterScreenList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCenterScreenListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCenterScreenList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterScreenListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCenterScreenList", pm); }

    public Map<String, MClientCenterCQ> xdfgetCenterId_QueryDerivedReferrer_MClientCenterList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MClientCenterList"); }
    public String keepCenterId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MClientCenterList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MClientCenterListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MClientCenterList"); }
    public String keepCenterId_QueryDerivedReferrer_MClientCenterListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MClientCenterList", pm); }

    public Map<String, MClinCQ> xdfgetCenterId_QueryDerivedReferrer_MClinList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MClinList"); }
    public String keepCenterId_QueryDerivedReferrer_MClinList(MClinCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MClinList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MClinListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MClinList"); }
    public String keepCenterId_QueryDerivedReferrer_MClinListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MClinList", pm); }

    public Map<String, MCorgCQ> xdfgetCenterId_QueryDerivedReferrer_MCorgList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCorgList"); }
    public String keepCenterId_QueryDerivedReferrer_MCorgList(MCorgCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCorgList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCorgListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCorgList"); }
    public String keepCenterId_QueryDerivedReferrer_MCorgListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCorgList", pm); }

    public Map<String, MDeliveryCourseCQ> xdfgetCenterId_QueryDerivedReferrer_MDeliveryCourseList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MDeliveryCourseList"); }
    public String keepCenterId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MDeliveryCourseList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MDeliveryCourseListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MDeliveryCourseList"); }
    public String keepCenterId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MDeliveryCourseList", pm); }

    public Map<String, MLocationCQ> xdfgetCenterId_QueryDerivedReferrer_MLocationList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MLocationList"); }
    public String keepCenterId_QueryDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MLocationList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MLocationListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MLocationList"); }
    public String keepCenterId_QueryDerivedReferrer_MLocationListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MLocationList", pm); }

    public Map<String, MMfinvoperationCQ> xdfgetCenterId_QueryDerivedReferrer_MMfinvoperationList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MMfinvoperationList"); }
    public String keepCenterId_QueryDerivedReferrer_MMfinvoperationList(MMfinvoperationCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MMfinvoperationList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MMfinvoperationListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MMfinvoperationList"); }
    public String keepCenterId_QueryDerivedReferrer_MMfinvoperationListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MMfinvoperationList", pm); }

    public Map<String, MMfmonthchgCQ> xdfgetCenterId_QueryDerivedReferrer_MMfmonthchgList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MMfmonthchgList"); }
    public String keepCenterId_QueryDerivedReferrer_MMfmonthchgList(MMfmonthchgCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MMfmonthchgList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MMfmonthchgListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MMfmonthchgList"); }
    public String keepCenterId_QueryDerivedReferrer_MMfmonthchgListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MMfmonthchgList", pm); }

    public Map<String, MMfstockitemCQ> xdfgetCenterId_QueryDerivedReferrer_MMfstockitemList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MMfstockitemList"); }
    public String keepCenterId_QueryDerivedReferrer_MMfstockitemList(MMfstockitemCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MMfstockitemList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MMfstockitemListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MMfstockitemList"); }
    public String keepCenterId_QueryDerivedReferrer_MMfstockitemListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MMfstockitemList", pm); }

    public Map<String, MMfwhstrctCQ> xdfgetCenterId_QueryDerivedReferrer_MMfwhstrctList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MMfwhstrctList"); }
    public String keepCenterId_QueryDerivedReferrer_MMfwhstrctList(MMfwhstrctCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MMfwhstrctList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MMfwhstrctListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MMfwhstrctList"); }
    public String keepCenterId_QueryDerivedReferrer_MMfwhstrctListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MMfwhstrctList", pm); }

    public Map<String, MMfwhxitemCQ> xdfgetCenterId_QueryDerivedReferrer_MMfwhxitemList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MMfwhxitemList"); }
    public String keepCenterId_QueryDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MMfwhxitemList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MMfwhxitemListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MMfwhxitemList"); }
    public String keepCenterId_QueryDerivedReferrer_MMfwhxitemListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MMfwhxitemList", pm); }

    public Map<String, MNumberingCenterCQ> xdfgetCenterId_QueryDerivedReferrer_MNumberingCenterList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MNumberingCenterList"); }
    public String keepCenterId_QueryDerivedReferrer_MNumberingCenterList(MNumberingCenterCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MNumberingCenterList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MNumberingCenterListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MNumberingCenterList"); }
    public String keepCenterId_QueryDerivedReferrer_MNumberingCenterListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MNumberingCenterList", pm); }

    public Map<String, MUserCenterCQ> xdfgetCenterId_QueryDerivedReferrer_MUserCenterList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MUserCenterList"); }
    public String keepCenterId_QueryDerivedReferrer_MUserCenterList(MUserCenterCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MUserCenterList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MUserCenterListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MUserCenterList"); }
    public String keepCenterId_QueryDerivedReferrer_MUserCenterListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MUserCenterList", pm); }

    public Map<String, MUserLoginCQ> xdfgetCenterId_QueryDerivedReferrer_MUserLoginList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MUserLoginList"); }
    public String keepCenterId_QueryDerivedReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MUserLoginList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MUserLoginListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MUserLoginList"); }
    public String keepCenterId_QueryDerivedReferrer_MUserLoginListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MUserLoginList", pm); }

    public Map<String, MWarehouseCQ> xdfgetCenterId_QueryDerivedReferrer_MWarehouseList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MWarehouseList"); }
    public String keepCenterId_QueryDerivedReferrer_MWarehouseList(MWarehouseCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MWarehouseList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MWarehouseListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MWarehouseList"); }
    public String keepCenterId_QueryDerivedReferrer_MWarehouseListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MWarehouseList", pm); }

    public Map<String, MWebHtInfoCQ> xdfgetCenterId_QueryDerivedReferrer_MWebHtInfoList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MWebHtInfoList"); }
    public String keepCenterId_QueryDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MWebHtInfoList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MWebHtInfoListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MWebHtInfoList"); }
    public String keepCenterId_QueryDerivedReferrer_MWebHtInfoListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MWebHtInfoList", pm); }

    public Map<String, TAllocInstHCQ> xdfgetCenterId_QueryDerivedReferrer_TAllocInstHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TAllocInstHList"); }
    public String keepCenterId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TAllocInstHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TAllocInstHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TAllocInstHList"); }
    public String keepCenterId_QueryDerivedReferrer_TAllocInstHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TAllocInstHList", pm); }

    public Map<String, TCcopamCQ> xdfgetCenterId_QueryDerivedReferrer_TCcopamList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TCcopamList"); }
    public String keepCenterId_QueryDerivedReferrer_TCcopamList(TCcopamCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TCcopamList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TCcopamListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TCcopamList"); }
    public String keepCenterId_QueryDerivedReferrer_TCcopamListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TCcopamList", pm); }

    public Map<String, TCenterSymbolCQ> xdfgetCenterId_QueryDerivedReferrer_TCenterSymbolList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TCenterSymbolList"); }
    public String keepCenterId_QueryDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TCenterSymbolList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TCenterSymbolListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TCenterSymbolList"); }
    public String keepCenterId_QueryDerivedReferrer_TCenterSymbolListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TCenterSymbolList", pm); }

    public Map<String, TCordhdrCQ> xdfgetCenterId_QueryDerivedReferrer_TCordhdrList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TCordhdrList"); }
    public String keepCenterId_QueryDerivedReferrer_TCordhdrList(TCordhdrCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TCordhdrList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TCordhdrListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TCordhdrList"); }
    public String keepCenterId_QueryDerivedReferrer_TCordhdrListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TCordhdrList", pm); }

    public Map<String, TCsrwhadmCQ> xdfgetCenterId_QueryDerivedReferrer_TCsrwhadmList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TCsrwhadmList"); }
    public String keepCenterId_QueryDerivedReferrer_TCsrwhadmList(TCsrwhadmCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TCsrwhadmList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TCsrwhadmListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TCsrwhadmList"); }
    public String keepCenterId_QueryDerivedReferrer_TCsrwhadmListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TCsrwhadmList", pm); }

    public Map<String, TEcOrderHCQ> xdfgetCenterId_QueryDerivedReferrer_TEcOrderHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepCenterId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TEcOrderHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TEcOrderHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepCenterId_QueryDerivedReferrer_TEcOrderHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TEcOrderHList", pm); }

    public Map<String, TInventoryHCQ> xdfgetCenterId_QueryDerivedReferrer_TInventoryHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TInventoryHList"); }
    public String keepCenterId_QueryDerivedReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TInventoryHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TInventoryHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TInventoryHList"); }
    public String keepCenterId_QueryDerivedReferrer_TInventoryHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TInventoryHList", pm); }

    public Map<String, TMflastshiplotCQ> xdfgetCenterId_QueryDerivedReferrer_TMflastshiplotList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TMflastshiplotList"); }
    public String keepCenterId_QueryDerivedReferrer_TMflastshiplotList(TMflastshiplotCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TMflastshiplotList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TMflastshiplotListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TMflastshiplotList"); }
    public String keepCenterId_QueryDerivedReferrer_TMflastshiplotListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TMflastshiplotList", pm); }

    public Map<String, TMoveInstHCQ> xdfgetCenterId_QueryDerivedReferrer_TMoveInstHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TMoveInstHList"); }
    public String keepCenterId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TMoveInstHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TMoveInstHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TMoveInstHList"); }
    public String keepCenterId_QueryDerivedReferrer_TMoveInstHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TMoveInstHList", pm); }

    public Map<String, TPackingHCQ> xdfgetCenterId_QueryDerivedReferrer_TPackingHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TPackingHList"); }
    public String keepCenterId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TPackingHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TPackingHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TPackingHList"); }
    public String keepCenterId_QueryDerivedReferrer_TPackingHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TPackingHList", pm); }

    public Map<String, TPalletCQ> xdfgetCenterId_QueryDerivedReferrer_TPalletList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TPalletList"); }
    public String keepCenterId_QueryDerivedReferrer_TPalletList(TPalletCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TPalletList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TPalletListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TPalletList"); }
    public String keepCenterId_QueryDerivedReferrer_TPalletListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TPalletList", pm); }

    public Map<String, TPickingHCQ> xdfgetCenterId_QueryDerivedReferrer_TPickingHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TPickingHList"); }
    public String keepCenterId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TPickingHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TPickingHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TPickingHList"); }
    public String keepCenterId_QueryDerivedReferrer_TPickingHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TPickingHList", pm); }

    public Map<String, TPicMthdRcmdCQ> xdfgetCenterId_QueryDerivedReferrer_TPicMthdRcmdList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TPicMthdRcmdList"); }
    public String keepCenterId_QueryDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TPicMthdRcmdList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TPicMthdRcmdListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TPicMthdRcmdList"); }
    public String keepCenterId_QueryDerivedReferrer_TPicMthdRcmdListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TPicMthdRcmdList", pm); }

    public Map<String, TReceivePlanHCQ> xdfgetCenterId_QueryDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepCenterId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TReceivePlanHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TReceivePlanHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepCenterId_QueryDerivedReferrer_TReceivePlanHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TReceivePlanHList", pm); }

    public Map<String, TSerialNoCQ> xdfgetCenterId_QueryDerivedReferrer_TSerialNoList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TSerialNoList"); }
    public String keepCenterId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TSerialNoList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TSerialNoListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TSerialNoList"); }
    public String keepCenterId_QueryDerivedReferrer_TSerialNoListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TSerialNoList", pm); }

    public Map<String, TShippingInstHCQ> xdfgetCenterId_QueryDerivedReferrer_TShippingInstHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepCenterId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TShippingInstHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TShippingInstHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepCenterId_QueryDerivedReferrer_TShippingInstHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TShippingInstHList", pm); }

    public Map<String, TSplinfoCQ> xdfgetCenterId_QueryDerivedReferrer_TSplinfoList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TSplinfoList"); }
    public String keepCenterId_QueryDerivedReferrer_TSplinfoList(TSplinfoCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TSplinfoList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TSplinfoListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TSplinfoList"); }
    public String keepCenterId_QueryDerivedReferrer_TSplinfoListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TSplinfoList", pm); }

    public Map<String, TStoreRecordHCQ> xdfgetCenterId_QueryDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepCenterId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TStoreRecordHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TStoreRecordHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepCenterId_QueryDerivedReferrer_TStoreRecordHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TStoreRecordHList", pm); }

    public Map<String, TTrallinvCQ> xdfgetCenterId_QueryDerivedReferrer_TTrallinvList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrallinvList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrallinvList(TTrallinvCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrallinvList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrallinvListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrallinvList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrallinvListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrallinvList", pm); }

    public Map<String, TTrallinvhistoryCQ> xdfgetCenterId_QueryDerivedReferrer_TTrallinvhistoryList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrallinvhistoryList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrallinvhistoryList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrallinvhistoryListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrallinvhistoryList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrallinvhistoryListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrallinvhistoryList", pm); }

    public Map<String, TTrcaseinventoryCQ> xdfgetCenterId_QueryDerivedReferrer_TTrcaseinventoryList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrcaseinventoryList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrcaseinventoryList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrcaseinventoryListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrcaseinventoryList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrcaseinventoryListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrcaseinventoryList", pm); }

    public Map<String, TTrcasenumCQ> xdfgetCenterId_QueryDerivedReferrer_TTrcasenumList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrcasenumList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrcasenumList(TTrcasenumCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrcasenumList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrcasenumListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrcasenumList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrcasenumListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrcasenumList", pm); }

    public Map<String, TTrcasestockCQ> xdfgetCenterId_QueryDerivedReferrer_TTrcasestockList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrcasestockList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrcasestockList(TTrcasestockCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrcasestockList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrcasestockListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrcasestockList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrcasestockListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrcasestockList", pm); }

    public Map<String, TTrhanbaiinvCQ> xdfgetCenterId_QueryDerivedReferrer_TTrhanbaiinvList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrhanbaiinvList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrhanbaiinvList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrhanbaiinvListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrhanbaiinvList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrhanbaiinvListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrhanbaiinvList", pm); }

    public Map<String, TTrinvcheckinfoCQ> xdfgetCenterId_QueryDerivedReferrer_TTrinvcheckinfoList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrinvcheckinfoList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrinvcheckinfoList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrinvcheckinfoListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrinvcheckinfoList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrinvcheckinfoListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrinvcheckinfoList", pm); }

    public Map<String, TTrinvcorrectCQ> xdfgetCenterId_QueryDerivedReferrer_TTrinvcorrectList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrinvcorrectList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrinvcorrectList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrinvcorrectListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrinvcorrectList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrinvcorrectListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrinvcorrectList", pm); }

    public Map<String, TTrinvreanswerCQ> xdfgetCenterId_QueryDerivedReferrer_TTrinvreanswerList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrinvreanswerList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrinvreanswerList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrinvreanswerListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrinvreanswerList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrinvreanswerListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrinvreanswerList", pm); }

    public Map<String, TTrinvrequestCQ> xdfgetCenterId_QueryDerivedReferrer_TTrinvrequestList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrinvrequestList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrinvrequestList(TTrinvrequestCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrinvrequestList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrinvrequestListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrinvrequestList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrinvrequestListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrinvrequestList", pm); }

    public Map<String, TTritemconvresultCQ> xdfgetCenterId_QueryDerivedReferrer_TTritemconvresultList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTritemconvresultList"); }
    public String keepCenterId_QueryDerivedReferrer_TTritemconvresultList(TTritemconvresultCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTritemconvresultList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTritemconvresultListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTritemconvresultList"); }
    public String keepCenterId_QueryDerivedReferrer_TTritemconvresultListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTritemconvresultList", pm); }

    public Map<String, TTrjukyuinvCQ> xdfgetCenterId_QueryDerivedReferrer_TTrjukyuinvList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrjukyuinvList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrjukyuinvList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrjukyuinvListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrjukyuinvList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrjukyuinvListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrjukyuinvList", pm); }

    public Map<String, TTrmanufacturedateCQ> xdfgetCenterId_QueryDerivedReferrer_TTrmanufacturedateList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrmanufacturedateList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrmanufacturedateList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrmanufacturedateListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrmanufacturedateList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrmanufacturedateListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrmanufacturedateList", pm); }

    public Map<String, TTrmanufacturedatedetailCQ> xdfgetCenterId_QueryDerivedReferrer_TTrmanufacturedatedetailList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrmanufacturedatedetailList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrmanufacturedatedetailList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrmanufacturedatedetailListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrmanufacturedatedetailList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrmanufacturedatedetailListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrmanufacturedatedetailList", pm); }

    public Map<String, TTrmanufacturedatehistoryCQ> xdfgetCenterId_QueryDerivedReferrer_TTrmanufacturedatehistoryList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrmanufacturedatehistoryList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrmanufacturedatehistoryList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrmanufacturedatehistoryListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrmanufacturedatehistoryList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrmanufacturedatehistoryListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrmanufacturedatehistoryList", pm); }

    public Map<String, TTrpallettraceCQ> xdfgetCenterId_QueryDerivedReferrer_TTrpallettraceList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrpallettraceList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrpallettraceList(TTrpallettraceCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrpallettraceList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrpallettraceListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrpallettraceList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrpallettraceListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrpallettraceList", pm); }

    public Map<String, TTrreversestockCQ> xdfgetCenterId_QueryDerivedReferrer_TTrreversestockList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrreversestockList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrreversestockList(TTrreversestockCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrreversestockList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrreversestockListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrreversestockList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrreversestockListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrreversestockList", pm); }

    public Map<String, TTrstockdiffhistoryCQ> xdfgetCenterId_QueryDerivedReferrer_TTrstockdiffhistoryList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrstockdiffhistoryList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrstockdiffhistoryList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrstockdiffhistoryListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrstockdiffhistoryList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrstockdiffhistoryListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrstockdiffhistoryList", pm); }

    public Map<String, TTrsymboltraceCQ> xdfgetCenterId_QueryDerivedReferrer_TTrsymboltraceList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrsymboltraceList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrsymboltraceList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrsymboltraceListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrsymboltraceList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrsymboltraceListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrsymboltraceList", pm); }

    public Map<String, TTrsymboltraceextendCQ> xdfgetCenterId_QueryDerivedReferrer_TTrsymboltraceextendList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrsymboltraceextendList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrsymboltraceextendList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrsymboltraceextendListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrsymboltraceextendList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrsymboltraceextendListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrsymboltraceextendList", pm); }

    public Map<String, TTrtraceCQ> xdfgetCenterId_QueryDerivedReferrer_TTrtraceList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TTrtraceList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrtraceList(TTrtraceCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TTrtraceList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TTrtraceListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TTrtraceList"); }
    public String keepCenterId_QueryDerivedReferrer_TTrtraceListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TTrtraceList", pm); }

    public Map<String, TYtrsoCQ> xdfgetCenterId_QueryDerivedReferrer_TYtrsoList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TYtrsoList"); }
    public String keepCenterId_QueryDerivedReferrer_TYtrsoList(TYtrsoCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TYtrsoList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TYtrsoListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TYtrsoList"); }
    public String keepCenterId_QueryDerivedReferrer_TYtrsoListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TYtrsoList", pm); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetCenterId_QueryDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtInventoryInputProdList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtInventoryInputProdListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtInventoryInputProdList", pm); }

    public Map<String, WHtLoadingCQ> xdfgetCenterId_QueryDerivedReferrer_WHtLoadingList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtLoadingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtLoadingList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtLoadingListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtLoadingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtLoadingListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtLoadingList", pm); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetCenterId_QueryDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtReceiveInspectionList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtReceiveInspectionListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtReceiveInspectionList", pm); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", pm); }

    public Map<String, WHtReceiveStoreCQ> xdfgetCenterId_QueryDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtReceiveStoreList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtReceiveStoreListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtReceiveStoreList", pm); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetCenterId_QueryDerivedReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtSerialReceiveInspList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtSerialReceiveInspList", pm); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetCenterId_QueryDerivedReferrer_WHtSerialShippingInspList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtSerialShippingInspList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtSerialShippingInspListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtSerialShippingInspList", pm); }

    public Map<String, WHtShippingCQ> xdfgetCenterId_QueryDerivedReferrer_WHtShippingList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtShippingList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtShippingListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtShippingList", pm); }

    public Map<String, WHtShippingPickingCQ> xdfgetCenterId_QueryDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtShippingPickingList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtShippingPickingListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtShippingPickingList", pm); }

    public Map<String, WSglRowShipInspHCQ> xdfgetCenterId_QueryDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepCenterId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WSglRowShipInspHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WSglRowShipInspHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepCenterId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WSglRowShipInspHList", pm); }

    public Map<String, WShippingInterruptCQ> xdfgetCenterId_QueryDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepCenterId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WShippingInterruptList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WShippingInterruptListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepCenterId_QueryDerivedReferrer_WShippingInterruptListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WShippingInterruptList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _centerNm;
    public ConditionValue xdfgetCenterNm()
    { if (_centerNm == null) { _centerNm = nCV(); }
      return _centerNm; }
    protected ConditionValue xgetCValueCenterNm() { return xdfgetCenterNm(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterNm_Asc() { regOBA("CENTER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterNm_Desc() { regOBD("CENTER_NM"); return this; }

    protected ConditionValue _centerAbbr;
    public ConditionValue xdfgetCenterAbbr()
    { if (_centerAbbr == null) { _centerAbbr = nCV(); }
      return _centerAbbr; }
    protected ConditionValue xgetCValueCenterAbbr() { return xdfgetCenterAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterAbbr_Asc() { regOBA("CENTER_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterAbbr_Desc() { regOBD("CENTER_ABBR"); return this; }

    protected ConditionValue _cultureId;
    public ConditionValue xdfgetCultureId()
    { if (_cultureId == null) { _cultureId = nCV(); }
      return _cultureId; }
    protected ConditionValue xgetCValueCultureId() { return xdfgetCultureId(); }

    public Map<String, BCultureCQ> getCultureId_InScopeRelation_BCulture() { return xgetSQueMap("cultureId_InScopeRelation_BCulture"); }
    public String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq) { return xkeepSQue("cultureId_InScopeRelation_BCulture", sq); }

    public Map<String, BCultureCQ> getCultureId_NotInScopeRelation_BCulture() { return xgetSQueMap("cultureId_NotInScopeRelation_BCulture"); }
    public String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq) { return xkeepSQue("cultureId_NotInScopeRelation_BCulture", sq); }

    /**
     * Add order-by as ascend. <br>
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CultureId_Asc() { regOBA("CULTURE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CultureId_Desc() { regOBD("CULTURE_ID"); return this; }

    protected ConditionValue _timeZoneId;
    public ConditionValue xdfgetTimeZoneId()
    { if (_timeZoneId == null) { _timeZoneId = nCV(); }
      return _timeZoneId; }
    protected ConditionValue xgetCValueTimeZoneId() { return xdfgetTimeZoneId(); }

    public Map<String, BTimeZoneCQ> getTimeZoneId_InScopeRelation_BTimeZone() { return xgetSQueMap("timeZoneId_InScopeRelation_BTimeZone"); }
    public String keepTimeZoneId_InScopeRelation_BTimeZone(BTimeZoneCQ sq) { return xkeepSQue("timeZoneId_InScopeRelation_BTimeZone", sq); }

    public Map<String, BTimeZoneCQ> getTimeZoneId_NotInScopeRelation_BTimeZone() { return xgetSQueMap("timeZoneId_NotInScopeRelation_BTimeZone"); }
    public String keepTimeZoneId_NotInScopeRelation_BTimeZone(BTimeZoneCQ sq) { return xkeepSQue("timeZoneId_NotInScopeRelation_BTimeZone", sq); }

    /**
     * Add order-by as ascend. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_TimeZoneId_Asc() { regOBA("TIME_ZONE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_TimeZoneId_Desc() { regOBD("TIME_ZONE_ID"); return this; }

    protected ConditionValue _warehousegroup;
    public ConditionValue xdfgetWarehousegroup()
    { if (_warehousegroup == null) { _warehousegroup = nCV(); }
      return _warehousegroup; }
    protected ConditionValue xgetCValueWarehousegroup() { return xdfgetWarehousegroup(); }

    /**
     * Add order-by as ascend. <br>
     * WarehouseGroup: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Warehousegroup_Asc() { regOBA("WarehouseGroup"); return this; }

    /**
     * Add order-by as descend. <br>
     * WarehouseGroup: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Warehousegroup_Desc() { regOBD("WarehouseGroup"); return this; }

    protected ConditionValue _virtualwhouseflg;
    public ConditionValue xdfgetVirtualwhouseflg()
    { if (_virtualwhouseflg == null) { _virtualwhouseflg = nCV(); }
      return _virtualwhouseflg; }
    protected ConditionValue xgetCValueVirtualwhouseflg() { return xdfgetVirtualwhouseflg(); }

    /**
     * Add order-by as ascend. <br>
     * VirtualWhouseFlg: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Virtualwhouseflg_Asc() { regOBA("VirtualWhouseFlg"); return this; }

    /**
     * Add order-by as descend. <br>
     * VirtualWhouseFlg: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Virtualwhouseflg_Desc() { regOBD("VirtualWhouseFlg"); return this; }

    protected ConditionValue _aname;
    public ConditionValue xdfgetAname()
    { if (_aname == null) { _aname = nCV(); }
      return _aname; }
    protected ConditionValue xgetCValueAname() { return xdfgetAname(); }

    /**
     * Add order-by as ascend. <br>
     * Aname: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Aname_Asc() { regOBA("Aname"); return this; }

    /**
     * Add order-by as descend. <br>
     * Aname: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Aname_Desc() { regOBD("Aname"); return this; }

    protected ConditionValue _address1;
    public ConditionValue xdfgetAddress1()
    { if (_address1 == null) { _address1 = nCV(); }
      return _address1; }
    protected ConditionValue xgetCValueAddress1() { return xdfgetAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * Address1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Address1_Asc() { regOBA("Address1"); return this; }

    /**
     * Add order-by as descend. <br>
     * Address1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Address1_Desc() { regOBD("Address1"); return this; }

    protected ConditionValue _address2;
    public ConditionValue xdfgetAddress2()
    { if (_address2 == null) { _address2 = nCV(); }
      return _address2; }
    protected ConditionValue xgetCValueAddress2() { return xdfgetAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * Address2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Address2_Asc() { regOBA("Address2"); return this; }

    /**
     * Add order-by as descend. <br>
     * Address2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Address2_Desc() { regOBD("Address2"); return this; }

    protected ConditionValue _address3;
    public ConditionValue xdfgetAddress3()
    { if (_address3 == null) { _address3 = nCV(); }
      return _address3; }
    protected ConditionValue xgetCValueAddress3() { return xdfgetAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * Address3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Address3_Asc() { regOBA("Address3"); return this; }

    /**
     * Add order-by as descend. <br>
     * Address3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Address3_Desc() { regOBD("Address3"); return this; }

    protected ConditionValue _postno;
    public ConditionValue xdfgetPostno()
    { if (_postno == null) { _postno = nCV(); }
      return _postno; }
    protected ConditionValue xgetCValuePostno() { return xdfgetPostno(); }

    /**
     * Add order-by as ascend. <br>
     * PostNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Postno_Asc() { regOBA("PostNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * PostNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Postno_Desc() { regOBD("PostNo"); return this; }

    protected ConditionValue _countrycd;
    public ConditionValue xdfgetCountrycd()
    { if (_countrycd == null) { _countrycd = nCV(); }
      return _countrycd; }
    protected ConditionValue xgetCValueCountrycd() { return xdfgetCountrycd(); }

    /**
     * Add order-by as ascend. <br>
     * CountryCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Countrycd_Asc() { regOBA("CountryCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * CountryCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Countrycd_Desc() { regOBD("CountryCd"); return this; }

    protected ConditionValue _portcd;
    public ConditionValue xdfgetPortcd()
    { if (_portcd == null) { _portcd = nCV(); }
      return _portcd; }
    protected ConditionValue xgetCValuePortcd() { return xdfgetPortcd(); }

    /**
     * Add order-by as ascend. <br>
     * PortCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Portcd_Asc() { regOBA("PortCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * PortCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Portcd_Desc() { regOBD("PortCd"); return this; }

    protected ConditionValue _districtcd;
    public ConditionValue xdfgetDistrictcd()
    { if (_districtcd == null) { _districtcd = nCV(); }
      return _districtcd; }
    protected ConditionValue xgetCValueDistrictcd() { return xdfgetDistrictcd(); }

    /**
     * Add order-by as ascend. <br>
     * DistrictCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Districtcd_Asc() { regOBA("DistrictCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * DistrictCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Districtcd_Desc() { regOBD("DistrictCd"); return this; }

    protected ConditionValue _phone1;
    public ConditionValue xdfgetPhone1()
    { if (_phone1 == null) { _phone1 = nCV(); }
      return _phone1; }
    protected ConditionValue xgetCValuePhone1() { return xdfgetPhone1(); }

    /**
     * Add order-by as ascend. <br>
     * Phone1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Phone1_Asc() { regOBA("Phone1"); return this; }

    /**
     * Add order-by as descend. <br>
     * Phone1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Phone1_Desc() { regOBD("Phone1"); return this; }

    protected ConditionValue _phone2;
    public ConditionValue xdfgetPhone2()
    { if (_phone2 == null) { _phone2 = nCV(); }
      return _phone2; }
    protected ConditionValue xgetCValuePhone2() { return xdfgetPhone2(); }

    /**
     * Add order-by as ascend. <br>
     * Phone2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Phone2_Asc() { regOBA("Phone2"); return this; }

    /**
     * Add order-by as descend. <br>
     * Phone2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Phone2_Desc() { regOBD("Phone2"); return this; }

    protected ConditionValue _fax1;
    public ConditionValue xdfgetFax1()
    { if (_fax1 == null) { _fax1 = nCV(); }
      return _fax1; }
    protected ConditionValue xgetCValueFax1() { return xdfgetFax1(); }

    /**
     * Add order-by as ascend. <br>
     * Fax1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Fax1_Asc() { regOBA("Fax1"); return this; }

    /**
     * Add order-by as descend. <br>
     * Fax1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Fax1_Desc() { regOBD("Fax1"); return this; }

    protected ConditionValue _fax2;
    public ConditionValue xdfgetFax2()
    { if (_fax2 == null) { _fax2 = nCV(); }
      return _fax2; }
    protected ConditionValue xgetCValueFax2() { return xdfgetFax2(); }

    /**
     * Add order-by as ascend. <br>
     * Fax2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Fax2_Asc() { regOBA("Fax2"); return this; }

    /**
     * Add order-by as descend. <br>
     * Fax2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Fax2_Desc() { regOBD("Fax2"); return this; }

    protected ConditionValue _warehouseflg;
    public ConditionValue xdfgetWarehouseflg()
    { if (_warehouseflg == null) { _warehouseflg = nCV(); }
      return _warehouseflg; }
    protected ConditionValue xgetCValueWarehouseflg() { return xdfgetWarehouseflg(); }

    /**
     * Add order-by as ascend. <br>
     * WarehouseFlg: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Warehouseflg_Asc() { regOBA("WarehouseFlg"); return this; }

    /**
     * Add order-by as descend. <br>
     * WarehouseFlg: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Warehouseflg_Desc() { regOBD("WarehouseFlg"); return this; }

    protected ConditionValue _refname;
    public ConditionValue xdfgetRefname()
    { if (_refname == null) { _refname = nCV(); }
      return _refname; }
    protected ConditionValue xgetCValueRefname() { return xdfgetRefname(); }

    /**
     * Add order-by as ascend. <br>
     * RefName: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Refname_Asc() { regOBA("RefName"); return this; }

    /**
     * Add order-by as descend. <br>
     * RefName: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Refname_Desc() { regOBD("RefName"); return this; }

    protected ConditionValue _subcontractflg;
    public ConditionValue xdfgetSubcontractflg()
    { if (_subcontractflg == null) { _subcontractflg = nCV(); }
      return _subcontractflg; }
    protected ConditionValue xgetCValueSubcontractflg() { return xdfgetSubcontractflg(); }

    /**
     * Add order-by as ascend. <br>
     * SubcontractFlg: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Subcontractflg_Asc() { regOBA("SubcontractFlg"); return this; }

    /**
     * Add order-by as descend. <br>
     * SubcontractFlg: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Subcontractflg_Desc() { regOBD("SubcontractFlg"); return this; }

    protected ConditionValue _weightcapacity;
    public ConditionValue xdfgetWeightcapacity()
    { if (_weightcapacity == null) { _weightcapacity = nCV(); }
      return _weightcapacity; }
    protected ConditionValue xgetCValueWeightcapacity() { return xdfgetWeightcapacity(); }

    /**
     * Add order-by as ascend. <br>
     * WeightCapacity: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Weightcapacity_Asc() { regOBA("WeightCapacity"); return this; }

    /**
     * Add order-by as descend. <br>
     * WeightCapacity: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Weightcapacity_Desc() { regOBD("WeightCapacity"); return this; }

    protected ConditionValue _capacity;
    public ConditionValue xdfgetCapacity()
    { if (_capacity == null) { _capacity = nCV(); }
      return _capacity; }
    protected ConditionValue xgetCValueCapacity() { return xdfgetCapacity(); }

    /**
     * Add order-by as ascend. <br>
     * Capacity: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Capacity_Asc() { regOBA("Capacity"); return this; }

    /**
     * Add order-by as descend. <br>
     * Capacity: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Capacity_Desc() { regOBD("Capacity"); return this; }

    protected ConditionValue _hulftId;
    public ConditionValue xdfgetHulftId()
    { if (_hulftId == null) { _hulftId = nCV(); }
      return _hulftId; }
    protected ConditionValue xgetCValueHulftId() { return xdfgetHulftId(); }

    /**
     * Add order-by as ascend. <br>
     * HULFT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_HulftId_Asc() { regOBA("HULFT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HULFT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_HulftId_Desc() { regOBD("HULFT_ID"); return this; }

    protected ConditionValue _warehousecls;
    public ConditionValue xdfgetWarehousecls()
    { if (_warehousecls == null) { _warehousecls = nCV(); }
      return _warehousecls; }
    protected ConditionValue xgetCValueWarehousecls() { return xdfgetWarehousecls(); }

    /**
     * Add order-by as ascend. <br>
     * WarehouseCls: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Warehousecls_Asc() { regOBA("WarehouseCls"); return this; }

    /**
     * Add order-by as descend. <br>
     * WarehouseCls: {char(1)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Warehousecls_Desc() { regOBD("WarehouseCls"); return this; }

    protected ConditionValue _cmlrasid;
    public ConditionValue xdfgetCmlrasid()
    { if (_cmlrasid == null) { _cmlrasid = nCV(); }
      return _cmlrasid; }
    protected ConditionValue xgetCValueCmlrasid() { return xdfgetCmlrasid(); }

    /**
     * Add order-by as ascend. <br>
     * CMLRASID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Cmlrasid_Asc() { regOBA("CMLRASID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CMLRASID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Cmlrasid_Desc() { regOBD("CMLRASID"); return this; }

    protected ConditionValue _ownOrAnotherFlg;
    public ConditionValue xdfgetOwnOrAnotherFlg()
    { if (_ownOrAnotherFlg == null) { _ownOrAnotherFlg = nCV(); }
      return _ownOrAnotherFlg; }
    protected ConditionValue xgetCValueOwnOrAnotherFlg() { return xdfgetOwnOrAnotherFlg(); }

    /**
     * Add order-by as ascend. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_OwnOrAnotherFlg_Asc() { regOBA("OWN_OR_ANOTHER_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_OwnOrAnotherFlg_Desc() { regOBD("OWN_OR_ANOTHER_FLG"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMCenterCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMCenterCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCenterCQ bq = (MCenterCQ)bqs;
        MCenterCQ uq = (MCenterCQ)uqs;
        if (bq.hasConditionQueryBCulture()) {
            uq.queryBCulture().reflectRelationOnUnionQuery(bq.queryBCulture(), uq.queryBCulture());
        }
        if (bq.hasConditionQueryBTimeZone()) {
            uq.queryBTimeZone().reflectRelationOnUnionQuery(bq.queryBTimeZone(), uq.queryBTimeZone());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @return The instance of condition-query. (NotNull)
     */
    public BCultureCQ queryBCulture() {
        return xdfgetConditionQueryBCulture();
    }
    public BCultureCQ xdfgetConditionQueryBCulture() {
        String prop = "bCulture";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBCulture()); xsetupOuterJoinBCulture(); }
        return xgetQueRlMap(prop);
    }
    protected BCultureCQ xcreateQueryBCulture() {
        String nrp = xresolveNRP("M_CENTER", "bCulture"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BCultureCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bCulture", nrp);
    }
    protected void xsetupOuterJoinBCulture() { xregOutJo("bCulture"); }
    public boolean hasConditionQueryBCulture() { return xhasQueRlMap("bCulture"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_TIME_ZONE by my TIME_ZONE_ID, named 'BTimeZone'.
     * @return The instance of condition-query. (NotNull)
     */
    public BTimeZoneCQ queryBTimeZone() {
        return xdfgetConditionQueryBTimeZone();
    }
    public BTimeZoneCQ xdfgetConditionQueryBTimeZone() {
        String prop = "bTimeZone";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBTimeZone()); xsetupOuterJoinBTimeZone(); }
        return xgetQueRlMap(prop);
    }
    protected BTimeZoneCQ xcreateQueryBTimeZone() {
        String nrp = xresolveNRP("M_CENTER", "bTimeZone"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BTimeZoneCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bTimeZone", nrp);
    }
    protected void xsetupOuterJoinBTimeZone() { xregOutJo("bTimeZone"); }
    public boolean hasConditionQueryBTimeZone() { return xhasQueRlMap("bTimeZone"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelFlg() {
        return xdfgetConditionQueryBClassDtlByDelFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelFlg() {
        String prop = "bClassDtlByDelFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelFlg()); xsetupOuterJoinBClassDtlByDelFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelFlg() {
        String nrp = xresolveNRP("M_CENTER", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCenterCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCenterCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCenterCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCenterCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCenterCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCenterCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCenterCQ> _myselfExistsMap;
    public Map<String, MCenterCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCenterCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCenterCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCenterCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCenterCB.class.getName(); }
    protected String xCQ() { return MCenterCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
