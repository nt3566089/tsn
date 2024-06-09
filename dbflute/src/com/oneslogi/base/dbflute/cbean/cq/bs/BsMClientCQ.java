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
 * The base condition-query of M_CLIENT.
 * @author DBFlute(AutoGenerator)
 */
public class BsMClientCQ extends AbstractBsMClientCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MClientCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMClientCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_CLIENT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MClientCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MClientCIQ xcreateCIQ() {
        MClientCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MClientCIQ xnewCIQ() {
        return new MClientCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_CLIENT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MClientCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MClientCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MCbrctgCQ> xdfgetClientId_ExistsReferrer_MCbrctgList() { return xgetSQueMap("clientId_ExistsReferrer_MCbrctgList"); }
    public String keepClientId_ExistsReferrer_MCbrctgList(MCbrctgCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MCbrctgList", sq); }

    public Map<String, MCdrcattCQ> xdfgetClientId_ExistsReferrer_MCdrcattList() { return xgetSQueMap("clientId_ExistsReferrer_MCdrcattList"); }
    public String keepClientId_ExistsReferrer_MCdrcattList(MCdrcattCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MCdrcattList", sq); }

    public Map<String, MClientCenterCQ> xdfgetClientId_ExistsReferrer_MClientCenterList() { return xgetSQueMap("clientId_ExistsReferrer_MClientCenterList"); }
    public String keepClientId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MClientCenterList", sq); }

    public Map<String, MClientColCQ> xdfgetClientId_ExistsReferrer_MClientColList() { return xgetSQueMap("clientId_ExistsReferrer_MClientColList"); }
    public String keepClientId_ExistsReferrer_MClientColList(MClientColCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MClientColList", sq); }

    public Map<String, MClientItemCQ> xdfgetClientId_ExistsReferrer_MClientItemList() { return xgetSQueMap("clientId_ExistsReferrer_MClientItemList"); }
    public String keepClientId_ExistsReferrer_MClientItemList(MClientItemCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MClientItemList", sq); }

    public Map<String, MClientScreenCQ> xdfgetClientId_ExistsReferrer_MClientScreenList() { return xgetSQueMap("clientId_ExistsReferrer_MClientScreenList"); }
    public String keepClientId_ExistsReferrer_MClientScreenList(MClientScreenCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MClientScreenList", sq); }

    public Map<String, MCustomerCQ> xdfgetClientId_ExistsReferrer_MCustomerList() { return xgetSQueMap("clientId_ExistsReferrer_MCustomerList"); }
    public String keepClientId_ExistsReferrer_MCustomerList(MCustomerCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MCustomerList", sq); }

    public Map<String, MImportTypeCQ> xdfgetClientId_ExistsReferrer_MImportTypeList() { return xgetSQueMap("clientId_ExistsReferrer_MImportTypeList"); }
    public String keepClientId_ExistsReferrer_MImportTypeList(MImportTypeCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MImportTypeList", sq); }

    public Map<String, MMfinvoperationCQ> xdfgetClientId_ExistsReferrer_MMfinvoperationList() { return xgetSQueMap("clientId_ExistsReferrer_MMfinvoperationList"); }
    public String keepClientId_ExistsReferrer_MMfinvoperationList(MMfinvoperationCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MMfinvoperationList", sq); }

    public Map<String, MMfmonthchgCQ> xdfgetClientId_ExistsReferrer_MMfmonthchgList() { return xgetSQueMap("clientId_ExistsReferrer_MMfmonthchgList"); }
    public String keepClientId_ExistsReferrer_MMfmonthchgList(MMfmonthchgCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MMfmonthchgList", sq); }

    public Map<String, MMfpickctlCQ> xdfgetClientId_ExistsReferrer_MMfpickctlList() { return xgetSQueMap("clientId_ExistsReferrer_MMfpickctlList"); }
    public String keepClientId_ExistsReferrer_MMfpickctlList(MMfpickctlCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MMfpickctlList", sq); }

    public Map<String, MMfrcvdesignCQ> xdfgetClientId_ExistsReferrer_MMfrcvdesignList() { return xgetSQueMap("clientId_ExistsReferrer_MMfrcvdesignList"); }
    public String keepClientId_ExistsReferrer_MMfrcvdesignList(MMfrcvdesignCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MMfrcvdesignList", sq); }

    public Map<String, MMfrcvitemCQ> xdfgetClientId_ExistsReferrer_MMfrcvitemList() { return xgetSQueMap("clientId_ExistsReferrer_MMfrcvitemList"); }
    public String keepClientId_ExistsReferrer_MMfrcvitemList(MMfrcvitemCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MMfrcvitemList", sq); }

    public Map<String, MMfwhxitemCQ> xdfgetClientId_ExistsReferrer_MMfwhxitemList() { return xgetSQueMap("clientId_ExistsReferrer_MMfwhxitemList"); }
    public String keepClientId_ExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MMfwhxitemList", sq); }

    public Map<String, MProductCQ> xdfgetClientId_ExistsReferrer_MProductList() { return xgetSQueMap("clientId_ExistsReferrer_MProductList"); }
    public String keepClientId_ExistsReferrer_MProductList(MProductCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MProductList", sq); }

    public Map<String, MShapeGrpCQ> xdfgetClientId_ExistsReferrer_MShapeGrpList() { return xgetSQueMap("clientId_ExistsReferrer_MShapeGrpList"); }
    public String keepClientId_ExistsReferrer_MShapeGrpList(MShapeGrpCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MShapeGrpList", sq); }

    public Map<String, MUserClientCQ> xdfgetClientId_ExistsReferrer_MUserClientList() { return xgetSQueMap("clientId_ExistsReferrer_MUserClientList"); }
    public String keepClientId_ExistsReferrer_MUserClientList(MUserClientCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MUserClientList", sq); }

    public Map<String, MUserLoginCQ> xdfgetClientId_ExistsReferrer_MUserLoginList() { return xgetSQueMap("clientId_ExistsReferrer_MUserLoginList"); }
    public String keepClientId_ExistsReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MUserLoginList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetClientId_ExistsReferrer_MWebHtInfoList() { return xgetSQueMap("clientId_ExistsReferrer_MWebHtInfoList"); }
    public String keepClientId_ExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MWebHtInfoList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetClientId_ExistsReferrer_TAllocInstHList() { return xgetSQueMap("clientId_ExistsReferrer_TAllocInstHList"); }
    public String keepClientId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TAllocInstHList", sq); }

    public Map<String, TCcopamCQ> xdfgetClientId_ExistsReferrer_TCcopamList() { return xgetSQueMap("clientId_ExistsReferrer_TCcopamList"); }
    public String keepClientId_ExistsReferrer_TCcopamList(TCcopamCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TCcopamList", sq); }

    public Map<String, TCenterSymbolCQ> xdfgetClientId_ExistsReferrer_TCenterSymbolList() { return xgetSQueMap("clientId_ExistsReferrer_TCenterSymbolList"); }
    public String keepClientId_ExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TCenterSymbolList", sq); }

    public Map<String, TCordhdrCQ> xdfgetClientId_ExistsReferrer_TCordhdrList() { return xgetSQueMap("clientId_ExistsReferrer_TCordhdrList"); }
    public String keepClientId_ExistsReferrer_TCordhdrList(TCordhdrCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TCordhdrList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetClientId_ExistsReferrer_TEcOrderHList() { return xgetSQueMap("clientId_ExistsReferrer_TEcOrderHList"); }
    public String keepClientId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TEcOrderHList", sq); }

    public Map<String, TInventoryHCQ> xdfgetClientId_ExistsReferrer_TInventoryHList() { return xgetSQueMap("clientId_ExistsReferrer_TInventoryHList"); }
    public String keepClientId_ExistsReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TInventoryHList", sq); }

    public Map<String, TMflastshiplotCQ> xdfgetClientId_ExistsReferrer_TMflastshiplotList() { return xgetSQueMap("clientId_ExistsReferrer_TMflastshiplotList"); }
    public String keepClientId_ExistsReferrer_TMflastshiplotList(TMflastshiplotCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TMflastshiplotList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetClientId_ExistsReferrer_TMoveInstHList() { return xgetSQueMap("clientId_ExistsReferrer_TMoveInstHList"); }
    public String keepClientId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetClientId_ExistsReferrer_TPackingHList() { return xgetSQueMap("clientId_ExistsReferrer_TPackingHList"); }
    public String keepClientId_ExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TPackingHList", sq); }

    public Map<String, TPalletCQ> xdfgetClientId_ExistsReferrer_TPalletList() { return xgetSQueMap("clientId_ExistsReferrer_TPalletList"); }
    public String keepClientId_ExistsReferrer_TPalletList(TPalletCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TPalletList", sq); }

    public Map<String, TPickingHCQ> xdfgetClientId_ExistsReferrer_TPickingHList() { return xgetSQueMap("clientId_ExistsReferrer_TPickingHList"); }
    public String keepClientId_ExistsReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TPickingHList", sq); }

    public Map<String, TPicMthdRcmdCQ> xdfgetClientId_ExistsReferrer_TPicMthdRcmdList() { return xgetSQueMap("clientId_ExistsReferrer_TPicMthdRcmdList"); }
    public String keepClientId_ExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TPicMthdRcmdList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetClientId_ExistsReferrer_TReceivePlanHList() { return xgetSQueMap("clientId_ExistsReferrer_TReceivePlanHList"); }
    public String keepClientId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, TSerialNoCQ> xdfgetClientId_ExistsReferrer_TSerialNoList() { return xgetSQueMap("clientId_ExistsReferrer_TSerialNoList"); }
    public String keepClientId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetClientId_ExistsReferrer_TShippingInstHList() { return xgetSQueMap("clientId_ExistsReferrer_TShippingInstHList"); }
    public String keepClientId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TShippingInstHList", sq); }

    public Map<String, TSplinfoCQ> xdfgetClientId_ExistsReferrer_TSplinfoList() { return xgetSQueMap("clientId_ExistsReferrer_TSplinfoList"); }
    public String keepClientId_ExistsReferrer_TSplinfoList(TSplinfoCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TSplinfoList", sq); }

    public Map<String, TStockCQ> xdfgetClientId_ExistsReferrer_TStockList() { return xgetSQueMap("clientId_ExistsReferrer_TStockList"); }
    public String keepClientId_ExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TStockList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetClientId_ExistsReferrer_TStoreRecordHList() { return xgetSQueMap("clientId_ExistsReferrer_TStoreRecordHList"); }
    public String keepClientId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, TTrallinvCQ> xdfgetClientId_ExistsReferrer_TTrallinvList() { return xgetSQueMap("clientId_ExistsReferrer_TTrallinvList"); }
    public String keepClientId_ExistsReferrer_TTrallinvList(TTrallinvCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrallinvList", sq); }

    public Map<String, TTrallinvhistoryCQ> xdfgetClientId_ExistsReferrer_TTrallinvhistoryList() { return xgetSQueMap("clientId_ExistsReferrer_TTrallinvhistoryList"); }
    public String keepClientId_ExistsReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrallinvhistoryList", sq); }

    public Map<String, TTrcaseinventoryCQ> xdfgetClientId_ExistsReferrer_TTrcaseinventoryList() { return xgetSQueMap("clientId_ExistsReferrer_TTrcaseinventoryList"); }
    public String keepClientId_ExistsReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrcaseinventoryList", sq); }

    public Map<String, TTrcasenumCQ> xdfgetClientId_ExistsReferrer_TTrcasenumList() { return xgetSQueMap("clientId_ExistsReferrer_TTrcasenumList"); }
    public String keepClientId_ExistsReferrer_TTrcasenumList(TTrcasenumCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrcasenumList", sq); }

    public Map<String, TTrcasestockCQ> xdfgetClientId_ExistsReferrer_TTrcasestockList() { return xgetSQueMap("clientId_ExistsReferrer_TTrcasestockList"); }
    public String keepClientId_ExistsReferrer_TTrcasestockList(TTrcasestockCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrcasestockList", sq); }

    public Map<String, TTrhanbaiinvCQ> xdfgetClientId_ExistsReferrer_TTrhanbaiinvList() { return xgetSQueMap("clientId_ExistsReferrer_TTrhanbaiinvList"); }
    public String keepClientId_ExistsReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrhanbaiinvList", sq); }

    public Map<String, TTrinvcheckinfoCQ> xdfgetClientId_ExistsReferrer_TTrinvcheckinfoList() { return xgetSQueMap("clientId_ExistsReferrer_TTrinvcheckinfoList"); }
    public String keepClientId_ExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrinvcheckinfoList", sq); }

    public Map<String, TTrinvcorrectCQ> xdfgetClientId_ExistsReferrer_TTrinvcorrectList() { return xgetSQueMap("clientId_ExistsReferrer_TTrinvcorrectList"); }
    public String keepClientId_ExistsReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrinvcorrectList", sq); }

    public Map<String, TTrinvreanswerCQ> xdfgetClientId_ExistsReferrer_TTrinvreanswerList() { return xgetSQueMap("clientId_ExistsReferrer_TTrinvreanswerList"); }
    public String keepClientId_ExistsReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrinvreanswerList", sq); }

    public Map<String, TTrinvrequestCQ> xdfgetClientId_ExistsReferrer_TTrinvrequestList() { return xgetSQueMap("clientId_ExistsReferrer_TTrinvrequestList"); }
    public String keepClientId_ExistsReferrer_TTrinvrequestList(TTrinvrequestCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrinvrequestList", sq); }

    public Map<String, TTritemconvresultCQ> xdfgetClientId_ExistsReferrer_TTritemconvresultList() { return xgetSQueMap("clientId_ExistsReferrer_TTritemconvresultList"); }
    public String keepClientId_ExistsReferrer_TTritemconvresultList(TTritemconvresultCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTritemconvresultList", sq); }

    public Map<String, TTrjukyuinvCQ> xdfgetClientId_ExistsReferrer_TTrjukyuinvList() { return xgetSQueMap("clientId_ExistsReferrer_TTrjukyuinvList"); }
    public String keepClientId_ExistsReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrjukyuinvList", sq); }

    public Map<String, TTrmanufacturedateCQ> xdfgetClientId_ExistsReferrer_TTrmanufacturedateList() { return xgetSQueMap("clientId_ExistsReferrer_TTrmanufacturedateList"); }
    public String keepClientId_ExistsReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrmanufacturedateList", sq); }

    public Map<String, TTrmanufacturedatedetailCQ> xdfgetClientId_ExistsReferrer_TTrmanufacturedatedetailList() { return xgetSQueMap("clientId_ExistsReferrer_TTrmanufacturedatedetailList"); }
    public String keepClientId_ExistsReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrmanufacturedatedetailList", sq); }

    public Map<String, TTrmanufacturedatehistoryCQ> xdfgetClientId_ExistsReferrer_TTrmanufacturedatehistoryList() { return xgetSQueMap("clientId_ExistsReferrer_TTrmanufacturedatehistoryList"); }
    public String keepClientId_ExistsReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrmanufacturedatehistoryList", sq); }

    public Map<String, TTrpallettraceCQ> xdfgetClientId_ExistsReferrer_TTrpallettraceList() { return xgetSQueMap("clientId_ExistsReferrer_TTrpallettraceList"); }
    public String keepClientId_ExistsReferrer_TTrpallettraceList(TTrpallettraceCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrpallettraceList", sq); }

    public Map<String, TTrreversestockCQ> xdfgetClientId_ExistsReferrer_TTrreversestockList() { return xgetSQueMap("clientId_ExistsReferrer_TTrreversestockList"); }
    public String keepClientId_ExistsReferrer_TTrreversestockList(TTrreversestockCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrreversestockList", sq); }

    public Map<String, TTrstockdiffhistoryCQ> xdfgetClientId_ExistsReferrer_TTrstockdiffhistoryList() { return xgetSQueMap("clientId_ExistsReferrer_TTrstockdiffhistoryList"); }
    public String keepClientId_ExistsReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrstockdiffhistoryList", sq); }

    public Map<String, TTrsymboltraceCQ> xdfgetClientId_ExistsReferrer_TTrsymboltraceList() { return xgetSQueMap("clientId_ExistsReferrer_TTrsymboltraceList"); }
    public String keepClientId_ExistsReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrsymboltraceList", sq); }

    public Map<String, TTrsymboltraceextendCQ> xdfgetClientId_ExistsReferrer_TTrsymboltraceextendList() { return xgetSQueMap("clientId_ExistsReferrer_TTrsymboltraceextendList"); }
    public String keepClientId_ExistsReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrsymboltraceextendList", sq); }

    public Map<String, TTrtraceCQ> xdfgetClientId_ExistsReferrer_TTrtraceList() { return xgetSQueMap("clientId_ExistsReferrer_TTrtraceList"); }
    public String keepClientId_ExistsReferrer_TTrtraceList(TTrtraceCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTrtraceList", sq); }

    public Map<String, TYtrsoCQ> xdfgetClientId_ExistsReferrer_TYtrsoList() { return xgetSQueMap("clientId_ExistsReferrer_TYtrsoList"); }
    public String keepClientId_ExistsReferrer_TYtrsoList(TYtrsoCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TYtrsoList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetClientId_ExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("clientId_ExistsReferrer_WHtInventoryInputProdList"); }
    public String keepClientId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetClientId_ExistsReferrer_WHtLoadingList() { return xgetSQueMap("clientId_ExistsReferrer_WHtLoadingList"); }
    public String keepClientId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtLoadingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetClientId_ExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("clientId_ExistsReferrer_WHtReceiveInspectionList"); }
    public String keepClientId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetClientId_ExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("clientId_ExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepClientId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetClientId_ExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("clientId_ExistsReferrer_WHtReceiveStoreList"); }
    public String keepClientId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetClientId_ExistsReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("clientId_ExistsReferrer_WHtSerialReceiveInspList"); }
    public String keepClientId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetClientId_ExistsReferrer_WHtSerialShippingInspList() { return xgetSQueMap("clientId_ExistsReferrer_WHtSerialShippingInspList"); }
    public String keepClientId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, WHtShippingCQ> xdfgetClientId_ExistsReferrer_WHtShippingList() { return xgetSQueMap("clientId_ExistsReferrer_WHtShippingList"); }
    public String keepClientId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetClientId_ExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("clientId_ExistsReferrer_WHtShippingPickingList"); }
    public String keepClientId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetClientId_ExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("clientId_ExistsReferrer_WSglRowShipInspHList"); }
    public String keepClientId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetClientId_ExistsReferrer_WShippingInterruptList() { return xgetSQueMap("clientId_ExistsReferrer_WShippingInterruptList"); }
    public String keepClientId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, MCbrctgCQ> xdfgetClientId_NotExistsReferrer_MCbrctgList() { return xgetSQueMap("clientId_NotExistsReferrer_MCbrctgList"); }
    public String keepClientId_NotExistsReferrer_MCbrctgList(MCbrctgCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MCbrctgList", sq); }

    public Map<String, MCdrcattCQ> xdfgetClientId_NotExistsReferrer_MCdrcattList() { return xgetSQueMap("clientId_NotExistsReferrer_MCdrcattList"); }
    public String keepClientId_NotExistsReferrer_MCdrcattList(MCdrcattCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MCdrcattList", sq); }

    public Map<String, MClientCenterCQ> xdfgetClientId_NotExistsReferrer_MClientCenterList() { return xgetSQueMap("clientId_NotExistsReferrer_MClientCenterList"); }
    public String keepClientId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MClientCenterList", sq); }

    public Map<String, MClientColCQ> xdfgetClientId_NotExistsReferrer_MClientColList() { return xgetSQueMap("clientId_NotExistsReferrer_MClientColList"); }
    public String keepClientId_NotExistsReferrer_MClientColList(MClientColCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MClientColList", sq); }

    public Map<String, MClientItemCQ> xdfgetClientId_NotExistsReferrer_MClientItemList() { return xgetSQueMap("clientId_NotExistsReferrer_MClientItemList"); }
    public String keepClientId_NotExistsReferrer_MClientItemList(MClientItemCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MClientItemList", sq); }

    public Map<String, MClientScreenCQ> xdfgetClientId_NotExistsReferrer_MClientScreenList() { return xgetSQueMap("clientId_NotExistsReferrer_MClientScreenList"); }
    public String keepClientId_NotExistsReferrer_MClientScreenList(MClientScreenCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MClientScreenList", sq); }

    public Map<String, MCustomerCQ> xdfgetClientId_NotExistsReferrer_MCustomerList() { return xgetSQueMap("clientId_NotExistsReferrer_MCustomerList"); }
    public String keepClientId_NotExistsReferrer_MCustomerList(MCustomerCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MCustomerList", sq); }

    public Map<String, MImportTypeCQ> xdfgetClientId_NotExistsReferrer_MImportTypeList() { return xgetSQueMap("clientId_NotExistsReferrer_MImportTypeList"); }
    public String keepClientId_NotExistsReferrer_MImportTypeList(MImportTypeCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MImportTypeList", sq); }

    public Map<String, MMfinvoperationCQ> xdfgetClientId_NotExistsReferrer_MMfinvoperationList() { return xgetSQueMap("clientId_NotExistsReferrer_MMfinvoperationList"); }
    public String keepClientId_NotExistsReferrer_MMfinvoperationList(MMfinvoperationCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MMfinvoperationList", sq); }

    public Map<String, MMfmonthchgCQ> xdfgetClientId_NotExistsReferrer_MMfmonthchgList() { return xgetSQueMap("clientId_NotExistsReferrer_MMfmonthchgList"); }
    public String keepClientId_NotExistsReferrer_MMfmonthchgList(MMfmonthchgCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MMfmonthchgList", sq); }

    public Map<String, MMfpickctlCQ> xdfgetClientId_NotExistsReferrer_MMfpickctlList() { return xgetSQueMap("clientId_NotExistsReferrer_MMfpickctlList"); }
    public String keepClientId_NotExistsReferrer_MMfpickctlList(MMfpickctlCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MMfpickctlList", sq); }

    public Map<String, MMfrcvdesignCQ> xdfgetClientId_NotExistsReferrer_MMfrcvdesignList() { return xgetSQueMap("clientId_NotExistsReferrer_MMfrcvdesignList"); }
    public String keepClientId_NotExistsReferrer_MMfrcvdesignList(MMfrcvdesignCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MMfrcvdesignList", sq); }

    public Map<String, MMfrcvitemCQ> xdfgetClientId_NotExistsReferrer_MMfrcvitemList() { return xgetSQueMap("clientId_NotExistsReferrer_MMfrcvitemList"); }
    public String keepClientId_NotExistsReferrer_MMfrcvitemList(MMfrcvitemCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MMfrcvitemList", sq); }

    public Map<String, MMfwhxitemCQ> xdfgetClientId_NotExistsReferrer_MMfwhxitemList() { return xgetSQueMap("clientId_NotExistsReferrer_MMfwhxitemList"); }
    public String keepClientId_NotExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MMfwhxitemList", sq); }

    public Map<String, MProductCQ> xdfgetClientId_NotExistsReferrer_MProductList() { return xgetSQueMap("clientId_NotExistsReferrer_MProductList"); }
    public String keepClientId_NotExistsReferrer_MProductList(MProductCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MProductList", sq); }

    public Map<String, MShapeGrpCQ> xdfgetClientId_NotExistsReferrer_MShapeGrpList() { return xgetSQueMap("clientId_NotExistsReferrer_MShapeGrpList"); }
    public String keepClientId_NotExistsReferrer_MShapeGrpList(MShapeGrpCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MShapeGrpList", sq); }

    public Map<String, MUserClientCQ> xdfgetClientId_NotExistsReferrer_MUserClientList() { return xgetSQueMap("clientId_NotExistsReferrer_MUserClientList"); }
    public String keepClientId_NotExistsReferrer_MUserClientList(MUserClientCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MUserClientList", sq); }

    public Map<String, MUserLoginCQ> xdfgetClientId_NotExistsReferrer_MUserLoginList() { return xgetSQueMap("clientId_NotExistsReferrer_MUserLoginList"); }
    public String keepClientId_NotExistsReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MUserLoginList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetClientId_NotExistsReferrer_MWebHtInfoList() { return xgetSQueMap("clientId_NotExistsReferrer_MWebHtInfoList"); }
    public String keepClientId_NotExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MWebHtInfoList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetClientId_NotExistsReferrer_TAllocInstHList() { return xgetSQueMap("clientId_NotExistsReferrer_TAllocInstHList"); }
    public String keepClientId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TAllocInstHList", sq); }

    public Map<String, TCcopamCQ> xdfgetClientId_NotExistsReferrer_TCcopamList() { return xgetSQueMap("clientId_NotExistsReferrer_TCcopamList"); }
    public String keepClientId_NotExistsReferrer_TCcopamList(TCcopamCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TCcopamList", sq); }

    public Map<String, TCenterSymbolCQ> xdfgetClientId_NotExistsReferrer_TCenterSymbolList() { return xgetSQueMap("clientId_NotExistsReferrer_TCenterSymbolList"); }
    public String keepClientId_NotExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TCenterSymbolList", sq); }

    public Map<String, TCordhdrCQ> xdfgetClientId_NotExistsReferrer_TCordhdrList() { return xgetSQueMap("clientId_NotExistsReferrer_TCordhdrList"); }
    public String keepClientId_NotExistsReferrer_TCordhdrList(TCordhdrCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TCordhdrList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetClientId_NotExistsReferrer_TEcOrderHList() { return xgetSQueMap("clientId_NotExistsReferrer_TEcOrderHList"); }
    public String keepClientId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TEcOrderHList", sq); }

    public Map<String, TInventoryHCQ> xdfgetClientId_NotExistsReferrer_TInventoryHList() { return xgetSQueMap("clientId_NotExistsReferrer_TInventoryHList"); }
    public String keepClientId_NotExistsReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TInventoryHList", sq); }

    public Map<String, TMflastshiplotCQ> xdfgetClientId_NotExistsReferrer_TMflastshiplotList() { return xgetSQueMap("clientId_NotExistsReferrer_TMflastshiplotList"); }
    public String keepClientId_NotExistsReferrer_TMflastshiplotList(TMflastshiplotCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TMflastshiplotList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetClientId_NotExistsReferrer_TMoveInstHList() { return xgetSQueMap("clientId_NotExistsReferrer_TMoveInstHList"); }
    public String keepClientId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetClientId_NotExistsReferrer_TPackingHList() { return xgetSQueMap("clientId_NotExistsReferrer_TPackingHList"); }
    public String keepClientId_NotExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TPackingHList", sq); }

    public Map<String, TPalletCQ> xdfgetClientId_NotExistsReferrer_TPalletList() { return xgetSQueMap("clientId_NotExistsReferrer_TPalletList"); }
    public String keepClientId_NotExistsReferrer_TPalletList(TPalletCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TPalletList", sq); }

    public Map<String, TPickingHCQ> xdfgetClientId_NotExistsReferrer_TPickingHList() { return xgetSQueMap("clientId_NotExistsReferrer_TPickingHList"); }
    public String keepClientId_NotExistsReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TPickingHList", sq); }

    public Map<String, TPicMthdRcmdCQ> xdfgetClientId_NotExistsReferrer_TPicMthdRcmdList() { return xgetSQueMap("clientId_NotExistsReferrer_TPicMthdRcmdList"); }
    public String keepClientId_NotExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TPicMthdRcmdList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetClientId_NotExistsReferrer_TReceivePlanHList() { return xgetSQueMap("clientId_NotExistsReferrer_TReceivePlanHList"); }
    public String keepClientId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, TSerialNoCQ> xdfgetClientId_NotExistsReferrer_TSerialNoList() { return xgetSQueMap("clientId_NotExistsReferrer_TSerialNoList"); }
    public String keepClientId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetClientId_NotExistsReferrer_TShippingInstHList() { return xgetSQueMap("clientId_NotExistsReferrer_TShippingInstHList"); }
    public String keepClientId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TShippingInstHList", sq); }

    public Map<String, TSplinfoCQ> xdfgetClientId_NotExistsReferrer_TSplinfoList() { return xgetSQueMap("clientId_NotExistsReferrer_TSplinfoList"); }
    public String keepClientId_NotExistsReferrer_TSplinfoList(TSplinfoCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TSplinfoList", sq); }

    public Map<String, TStockCQ> xdfgetClientId_NotExistsReferrer_TStockList() { return xgetSQueMap("clientId_NotExistsReferrer_TStockList"); }
    public String keepClientId_NotExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TStockList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetClientId_NotExistsReferrer_TStoreRecordHList() { return xgetSQueMap("clientId_NotExistsReferrer_TStoreRecordHList"); }
    public String keepClientId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, TTrallinvCQ> xdfgetClientId_NotExistsReferrer_TTrallinvList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrallinvList"); }
    public String keepClientId_NotExistsReferrer_TTrallinvList(TTrallinvCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrallinvList", sq); }

    public Map<String, TTrallinvhistoryCQ> xdfgetClientId_NotExistsReferrer_TTrallinvhistoryList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrallinvhistoryList"); }
    public String keepClientId_NotExistsReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrallinvhistoryList", sq); }

    public Map<String, TTrcaseinventoryCQ> xdfgetClientId_NotExistsReferrer_TTrcaseinventoryList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrcaseinventoryList"); }
    public String keepClientId_NotExistsReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrcaseinventoryList", sq); }

    public Map<String, TTrcasenumCQ> xdfgetClientId_NotExistsReferrer_TTrcasenumList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrcasenumList"); }
    public String keepClientId_NotExistsReferrer_TTrcasenumList(TTrcasenumCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrcasenumList", sq); }

    public Map<String, TTrcasestockCQ> xdfgetClientId_NotExistsReferrer_TTrcasestockList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrcasestockList"); }
    public String keepClientId_NotExistsReferrer_TTrcasestockList(TTrcasestockCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrcasestockList", sq); }

    public Map<String, TTrhanbaiinvCQ> xdfgetClientId_NotExistsReferrer_TTrhanbaiinvList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrhanbaiinvList"); }
    public String keepClientId_NotExistsReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrhanbaiinvList", sq); }

    public Map<String, TTrinvcheckinfoCQ> xdfgetClientId_NotExistsReferrer_TTrinvcheckinfoList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrinvcheckinfoList"); }
    public String keepClientId_NotExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrinvcheckinfoList", sq); }

    public Map<String, TTrinvcorrectCQ> xdfgetClientId_NotExistsReferrer_TTrinvcorrectList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrinvcorrectList"); }
    public String keepClientId_NotExistsReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrinvcorrectList", sq); }

    public Map<String, TTrinvreanswerCQ> xdfgetClientId_NotExistsReferrer_TTrinvreanswerList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrinvreanswerList"); }
    public String keepClientId_NotExistsReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrinvreanswerList", sq); }

    public Map<String, TTrinvrequestCQ> xdfgetClientId_NotExistsReferrer_TTrinvrequestList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrinvrequestList"); }
    public String keepClientId_NotExistsReferrer_TTrinvrequestList(TTrinvrequestCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrinvrequestList", sq); }

    public Map<String, TTritemconvresultCQ> xdfgetClientId_NotExistsReferrer_TTritemconvresultList() { return xgetSQueMap("clientId_NotExistsReferrer_TTritemconvresultList"); }
    public String keepClientId_NotExistsReferrer_TTritemconvresultList(TTritemconvresultCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTritemconvresultList", sq); }

    public Map<String, TTrjukyuinvCQ> xdfgetClientId_NotExistsReferrer_TTrjukyuinvList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrjukyuinvList"); }
    public String keepClientId_NotExistsReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrjukyuinvList", sq); }

    public Map<String, TTrmanufacturedateCQ> xdfgetClientId_NotExistsReferrer_TTrmanufacturedateList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrmanufacturedateList"); }
    public String keepClientId_NotExistsReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrmanufacturedateList", sq); }

    public Map<String, TTrmanufacturedatedetailCQ> xdfgetClientId_NotExistsReferrer_TTrmanufacturedatedetailList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrmanufacturedatedetailList"); }
    public String keepClientId_NotExistsReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrmanufacturedatedetailList", sq); }

    public Map<String, TTrmanufacturedatehistoryCQ> xdfgetClientId_NotExistsReferrer_TTrmanufacturedatehistoryList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrmanufacturedatehistoryList"); }
    public String keepClientId_NotExistsReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrmanufacturedatehistoryList", sq); }

    public Map<String, TTrpallettraceCQ> xdfgetClientId_NotExistsReferrer_TTrpallettraceList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrpallettraceList"); }
    public String keepClientId_NotExistsReferrer_TTrpallettraceList(TTrpallettraceCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrpallettraceList", sq); }

    public Map<String, TTrreversestockCQ> xdfgetClientId_NotExistsReferrer_TTrreversestockList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrreversestockList"); }
    public String keepClientId_NotExistsReferrer_TTrreversestockList(TTrreversestockCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrreversestockList", sq); }

    public Map<String, TTrstockdiffhistoryCQ> xdfgetClientId_NotExistsReferrer_TTrstockdiffhistoryList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrstockdiffhistoryList"); }
    public String keepClientId_NotExistsReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrstockdiffhistoryList", sq); }

    public Map<String, TTrsymboltraceCQ> xdfgetClientId_NotExistsReferrer_TTrsymboltraceList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrsymboltraceList"); }
    public String keepClientId_NotExistsReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrsymboltraceList", sq); }

    public Map<String, TTrsymboltraceextendCQ> xdfgetClientId_NotExistsReferrer_TTrsymboltraceextendList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrsymboltraceextendList"); }
    public String keepClientId_NotExistsReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrsymboltraceextendList", sq); }

    public Map<String, TTrtraceCQ> xdfgetClientId_NotExistsReferrer_TTrtraceList() { return xgetSQueMap("clientId_NotExistsReferrer_TTrtraceList"); }
    public String keepClientId_NotExistsReferrer_TTrtraceList(TTrtraceCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTrtraceList", sq); }

    public Map<String, TYtrsoCQ> xdfgetClientId_NotExistsReferrer_TYtrsoList() { return xgetSQueMap("clientId_NotExistsReferrer_TYtrsoList"); }
    public String keepClientId_NotExistsReferrer_TYtrsoList(TYtrsoCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TYtrsoList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetClientId_NotExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtInventoryInputProdList"); }
    public String keepClientId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetClientId_NotExistsReferrer_WHtLoadingList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtLoadingList"); }
    public String keepClientId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtLoadingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetClientId_NotExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtReceiveInspectionList"); }
    public String keepClientId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetClientId_NotExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepClientId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetClientId_NotExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtReceiveStoreList"); }
    public String keepClientId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetClientId_NotExistsReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtSerialReceiveInspList"); }
    public String keepClientId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetClientId_NotExistsReferrer_WHtSerialShippingInspList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtSerialShippingInspList"); }
    public String keepClientId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, WHtShippingCQ> xdfgetClientId_NotExistsReferrer_WHtShippingList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtShippingList"); }
    public String keepClientId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetClientId_NotExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtShippingPickingList"); }
    public String keepClientId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetClientId_NotExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("clientId_NotExistsReferrer_WSglRowShipInspHList"); }
    public String keepClientId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetClientId_NotExistsReferrer_WShippingInterruptList() { return xgetSQueMap("clientId_NotExistsReferrer_WShippingInterruptList"); }
    public String keepClientId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, MCbrctgCQ> xdfgetClientId_SpecifyDerivedReferrer_MCbrctgList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MCbrctgList"); }
    public String keepClientId_SpecifyDerivedReferrer_MCbrctgList(MCbrctgCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MCbrctgList", sq); }

    public Map<String, MCdrcattCQ> xdfgetClientId_SpecifyDerivedReferrer_MCdrcattList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MCdrcattList"); }
    public String keepClientId_SpecifyDerivedReferrer_MCdrcattList(MCdrcattCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MCdrcattList", sq); }

    public Map<String, MClientCenterCQ> xdfgetClientId_SpecifyDerivedReferrer_MClientCenterList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MClientCenterList"); }
    public String keepClientId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MClientCenterList", sq); }

    public Map<String, MClientColCQ> xdfgetClientId_SpecifyDerivedReferrer_MClientColList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MClientColList"); }
    public String keepClientId_SpecifyDerivedReferrer_MClientColList(MClientColCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MClientColList", sq); }

    public Map<String, MClientItemCQ> xdfgetClientId_SpecifyDerivedReferrer_MClientItemList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MClientItemList"); }
    public String keepClientId_SpecifyDerivedReferrer_MClientItemList(MClientItemCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MClientItemList", sq); }

    public Map<String, MClientScreenCQ> xdfgetClientId_SpecifyDerivedReferrer_MClientScreenList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MClientScreenList"); }
    public String keepClientId_SpecifyDerivedReferrer_MClientScreenList(MClientScreenCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MClientScreenList", sq); }

    public Map<String, MCustomerCQ> xdfgetClientId_SpecifyDerivedReferrer_MCustomerList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MCustomerList"); }
    public String keepClientId_SpecifyDerivedReferrer_MCustomerList(MCustomerCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MCustomerList", sq); }

    public Map<String, MImportTypeCQ> xdfgetClientId_SpecifyDerivedReferrer_MImportTypeList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MImportTypeList"); }
    public String keepClientId_SpecifyDerivedReferrer_MImportTypeList(MImportTypeCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MImportTypeList", sq); }

    public Map<String, MMfinvoperationCQ> xdfgetClientId_SpecifyDerivedReferrer_MMfinvoperationList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MMfinvoperationList"); }
    public String keepClientId_SpecifyDerivedReferrer_MMfinvoperationList(MMfinvoperationCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MMfinvoperationList", sq); }

    public Map<String, MMfmonthchgCQ> xdfgetClientId_SpecifyDerivedReferrer_MMfmonthchgList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MMfmonthchgList"); }
    public String keepClientId_SpecifyDerivedReferrer_MMfmonthchgList(MMfmonthchgCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MMfmonthchgList", sq); }

    public Map<String, MMfpickctlCQ> xdfgetClientId_SpecifyDerivedReferrer_MMfpickctlList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MMfpickctlList"); }
    public String keepClientId_SpecifyDerivedReferrer_MMfpickctlList(MMfpickctlCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MMfpickctlList", sq); }

    public Map<String, MMfrcvdesignCQ> xdfgetClientId_SpecifyDerivedReferrer_MMfrcvdesignList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MMfrcvdesignList"); }
    public String keepClientId_SpecifyDerivedReferrer_MMfrcvdesignList(MMfrcvdesignCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MMfrcvdesignList", sq); }

    public Map<String, MMfrcvitemCQ> xdfgetClientId_SpecifyDerivedReferrer_MMfrcvitemList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MMfrcvitemList"); }
    public String keepClientId_SpecifyDerivedReferrer_MMfrcvitemList(MMfrcvitemCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MMfrcvitemList", sq); }

    public Map<String, MMfwhxitemCQ> xdfgetClientId_SpecifyDerivedReferrer_MMfwhxitemList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MMfwhxitemList"); }
    public String keepClientId_SpecifyDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MMfwhxitemList", sq); }

    public Map<String, MProductCQ> xdfgetClientId_SpecifyDerivedReferrer_MProductList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MProductList"); }
    public String keepClientId_SpecifyDerivedReferrer_MProductList(MProductCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MProductList", sq); }

    public Map<String, MShapeGrpCQ> xdfgetClientId_SpecifyDerivedReferrer_MShapeGrpList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MShapeGrpList"); }
    public String keepClientId_SpecifyDerivedReferrer_MShapeGrpList(MShapeGrpCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MShapeGrpList", sq); }

    public Map<String, MUserClientCQ> xdfgetClientId_SpecifyDerivedReferrer_MUserClientList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MUserClientList"); }
    public String keepClientId_SpecifyDerivedReferrer_MUserClientList(MUserClientCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MUserClientList", sq); }

    public Map<String, MUserLoginCQ> xdfgetClientId_SpecifyDerivedReferrer_MUserLoginList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MUserLoginList"); }
    public String keepClientId_SpecifyDerivedReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MUserLoginList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetClientId_SpecifyDerivedReferrer_MWebHtInfoList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MWebHtInfoList"); }
    public String keepClientId_SpecifyDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MWebHtInfoList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetClientId_SpecifyDerivedReferrer_TAllocInstHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TAllocInstHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TAllocInstHList", sq); }

    public Map<String, TCcopamCQ> xdfgetClientId_SpecifyDerivedReferrer_TCcopamList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TCcopamList"); }
    public String keepClientId_SpecifyDerivedReferrer_TCcopamList(TCcopamCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TCcopamList", sq); }

    public Map<String, TCenterSymbolCQ> xdfgetClientId_SpecifyDerivedReferrer_TCenterSymbolList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TCenterSymbolList"); }
    public String keepClientId_SpecifyDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TCenterSymbolList", sq); }

    public Map<String, TCordhdrCQ> xdfgetClientId_SpecifyDerivedReferrer_TCordhdrList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TCordhdrList"); }
    public String keepClientId_SpecifyDerivedReferrer_TCordhdrList(TCordhdrCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TCordhdrList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetClientId_SpecifyDerivedReferrer_TEcOrderHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TEcOrderHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TEcOrderHList", sq); }

    public Map<String, TInventoryHCQ> xdfgetClientId_SpecifyDerivedReferrer_TInventoryHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TInventoryHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TInventoryHList", sq); }

    public Map<String, TMflastshiplotCQ> xdfgetClientId_SpecifyDerivedReferrer_TMflastshiplotList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TMflastshiplotList"); }
    public String keepClientId_SpecifyDerivedReferrer_TMflastshiplotList(TMflastshiplotCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TMflastshiplotList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetClientId_SpecifyDerivedReferrer_TMoveInstHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TMoveInstHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetClientId_SpecifyDerivedReferrer_TPackingHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TPackingHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TPackingHList", sq); }

    public Map<String, TPalletCQ> xdfgetClientId_SpecifyDerivedReferrer_TPalletList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TPalletList"); }
    public String keepClientId_SpecifyDerivedReferrer_TPalletList(TPalletCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TPalletList", sq); }

    public Map<String, TPickingHCQ> xdfgetClientId_SpecifyDerivedReferrer_TPickingHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TPickingHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TPickingHList", sq); }

    public Map<String, TPicMthdRcmdCQ> xdfgetClientId_SpecifyDerivedReferrer_TPicMthdRcmdList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TPicMthdRcmdList"); }
    public String keepClientId_SpecifyDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TPicMthdRcmdList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetClientId_SpecifyDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TReceivePlanHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TReceivePlanHList", sq); }

    public Map<String, TSerialNoCQ> xdfgetClientId_SpecifyDerivedReferrer_TSerialNoList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TSerialNoList"); }
    public String keepClientId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetClientId_SpecifyDerivedReferrer_TShippingInstHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TShippingInstHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TShippingInstHList", sq); }

    public Map<String, TSplinfoCQ> xdfgetClientId_SpecifyDerivedReferrer_TSplinfoList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TSplinfoList"); }
    public String keepClientId_SpecifyDerivedReferrer_TSplinfoList(TSplinfoCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TSplinfoList", sq); }

    public Map<String, TStockCQ> xdfgetClientId_SpecifyDerivedReferrer_TStockList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TStockList"); }
    public String keepClientId_SpecifyDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TStockList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetClientId_SpecifyDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TStoreRecordHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TStoreRecordHList", sq); }

    public Map<String, TTrallinvCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrallinvList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrallinvList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrallinvList(TTrallinvCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrallinvList", sq); }

    public Map<String, TTrallinvhistoryCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrallinvhistoryList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrallinvhistoryList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrallinvhistoryList", sq); }

    public Map<String, TTrcaseinventoryCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrcaseinventoryList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrcaseinventoryList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrcaseinventoryList", sq); }

    public Map<String, TTrcasenumCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrcasenumList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrcasenumList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrcasenumList(TTrcasenumCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrcasenumList", sq); }

    public Map<String, TTrcasestockCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrcasestockList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrcasestockList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrcasestockList(TTrcasestockCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrcasestockList", sq); }

    public Map<String, TTrhanbaiinvCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrhanbaiinvList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrhanbaiinvList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrhanbaiinvList", sq); }

    public Map<String, TTrinvcheckinfoCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrinvcheckinfoList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrinvcheckinfoList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrinvcheckinfoList", sq); }

    public Map<String, TTrinvcorrectCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrinvcorrectList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrinvcorrectList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrinvcorrectList", sq); }

    public Map<String, TTrinvreanswerCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrinvreanswerList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrinvreanswerList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrinvreanswerList", sq); }

    public Map<String, TTrinvrequestCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrinvrequestList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrinvrequestList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrinvrequestList(TTrinvrequestCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrinvrequestList", sq); }

    public Map<String, TTritemconvresultCQ> xdfgetClientId_SpecifyDerivedReferrer_TTritemconvresultList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTritemconvresultList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTritemconvresultList(TTritemconvresultCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTritemconvresultList", sq); }

    public Map<String, TTrjukyuinvCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrjukyuinvList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrjukyuinvList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrjukyuinvList", sq); }

    public Map<String, TTrmanufacturedateCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrmanufacturedateList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrmanufacturedateList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrmanufacturedateList", sq); }

    public Map<String, TTrmanufacturedatedetailCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList", sq); }

    public Map<String, TTrmanufacturedatehistoryCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList", sq); }

    public Map<String, TTrpallettraceCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrpallettraceList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrpallettraceList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrpallettraceList(TTrpallettraceCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrpallettraceList", sq); }

    public Map<String, TTrreversestockCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrreversestockList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrreversestockList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrreversestockList(TTrreversestockCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrreversestockList", sq); }

    public Map<String, TTrstockdiffhistoryCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrstockdiffhistoryList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrstockdiffhistoryList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrstockdiffhistoryList", sq); }

    public Map<String, TTrsymboltraceCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrsymboltraceList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrsymboltraceList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrsymboltraceList", sq); }

    public Map<String, TTrsymboltraceextendCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrsymboltraceextendList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrsymboltraceextendList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrsymboltraceextendList", sq); }

    public Map<String, TTrtraceCQ> xdfgetClientId_SpecifyDerivedReferrer_TTrtraceList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTrtraceList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTrtraceList(TTrtraceCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTrtraceList", sq); }

    public Map<String, TYtrsoCQ> xdfgetClientId_SpecifyDerivedReferrer_TYtrsoList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TYtrsoList"); }
    public String keepClientId_SpecifyDerivedReferrer_TYtrsoList(TYtrsoCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TYtrsoList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtLoadingList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtLoadingList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtLoadingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtReceiveStoreList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtSerialShippingInspList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, WHtShippingCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtShippingList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtShippingList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtShippingPickingList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtShippingPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetClientId_SpecifyDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WSglRowShipInspHList"); }
    public String keepClientId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetClientId_SpecifyDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WShippingInterruptList"); }
    public String keepClientId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WShippingInterruptList", sq); }

    public Map<String, MCbrctgCQ> xdfgetClientId_QueryDerivedReferrer_MCbrctgList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MCbrctgList"); }
    public String keepClientId_QueryDerivedReferrer_MCbrctgList(MCbrctgCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MCbrctgList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MCbrctgListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MCbrctgList"); }
    public String keepClientId_QueryDerivedReferrer_MCbrctgListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MCbrctgList", pm); }

    public Map<String, MCdrcattCQ> xdfgetClientId_QueryDerivedReferrer_MCdrcattList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MCdrcattList"); }
    public String keepClientId_QueryDerivedReferrer_MCdrcattList(MCdrcattCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MCdrcattList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MCdrcattListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MCdrcattList"); }
    public String keepClientId_QueryDerivedReferrer_MCdrcattListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MCdrcattList", pm); }

    public Map<String, MClientCenterCQ> xdfgetClientId_QueryDerivedReferrer_MClientCenterList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MClientCenterList"); }
    public String keepClientId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MClientCenterList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MClientCenterListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MClientCenterList"); }
    public String keepClientId_QueryDerivedReferrer_MClientCenterListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MClientCenterList", pm); }

    public Map<String, MClientColCQ> xdfgetClientId_QueryDerivedReferrer_MClientColList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MClientColList"); }
    public String keepClientId_QueryDerivedReferrer_MClientColList(MClientColCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MClientColList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MClientColListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MClientColList"); }
    public String keepClientId_QueryDerivedReferrer_MClientColListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MClientColList", pm); }

    public Map<String, MClientItemCQ> xdfgetClientId_QueryDerivedReferrer_MClientItemList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MClientItemList"); }
    public String keepClientId_QueryDerivedReferrer_MClientItemList(MClientItemCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MClientItemList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MClientItemListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MClientItemList"); }
    public String keepClientId_QueryDerivedReferrer_MClientItemListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MClientItemList", pm); }

    public Map<String, MClientScreenCQ> xdfgetClientId_QueryDerivedReferrer_MClientScreenList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MClientScreenList"); }
    public String keepClientId_QueryDerivedReferrer_MClientScreenList(MClientScreenCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MClientScreenList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MClientScreenListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MClientScreenList"); }
    public String keepClientId_QueryDerivedReferrer_MClientScreenListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MClientScreenList", pm); }

    public Map<String, MCustomerCQ> xdfgetClientId_QueryDerivedReferrer_MCustomerList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MCustomerList"); }
    public String keepClientId_QueryDerivedReferrer_MCustomerList(MCustomerCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MCustomerList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MCustomerListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MCustomerList"); }
    public String keepClientId_QueryDerivedReferrer_MCustomerListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MCustomerList", pm); }

    public Map<String, MImportTypeCQ> xdfgetClientId_QueryDerivedReferrer_MImportTypeList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MImportTypeList"); }
    public String keepClientId_QueryDerivedReferrer_MImportTypeList(MImportTypeCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MImportTypeList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MImportTypeListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MImportTypeList"); }
    public String keepClientId_QueryDerivedReferrer_MImportTypeListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MImportTypeList", pm); }

    public Map<String, MMfinvoperationCQ> xdfgetClientId_QueryDerivedReferrer_MMfinvoperationList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MMfinvoperationList"); }
    public String keepClientId_QueryDerivedReferrer_MMfinvoperationList(MMfinvoperationCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MMfinvoperationList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MMfinvoperationListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MMfinvoperationList"); }
    public String keepClientId_QueryDerivedReferrer_MMfinvoperationListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MMfinvoperationList", pm); }

    public Map<String, MMfmonthchgCQ> xdfgetClientId_QueryDerivedReferrer_MMfmonthchgList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MMfmonthchgList"); }
    public String keepClientId_QueryDerivedReferrer_MMfmonthchgList(MMfmonthchgCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MMfmonthchgList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MMfmonthchgListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MMfmonthchgList"); }
    public String keepClientId_QueryDerivedReferrer_MMfmonthchgListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MMfmonthchgList", pm); }

    public Map<String, MMfpickctlCQ> xdfgetClientId_QueryDerivedReferrer_MMfpickctlList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MMfpickctlList"); }
    public String keepClientId_QueryDerivedReferrer_MMfpickctlList(MMfpickctlCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MMfpickctlList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MMfpickctlListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MMfpickctlList"); }
    public String keepClientId_QueryDerivedReferrer_MMfpickctlListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MMfpickctlList", pm); }

    public Map<String, MMfrcvdesignCQ> xdfgetClientId_QueryDerivedReferrer_MMfrcvdesignList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MMfrcvdesignList"); }
    public String keepClientId_QueryDerivedReferrer_MMfrcvdesignList(MMfrcvdesignCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MMfrcvdesignList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MMfrcvdesignListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MMfrcvdesignList"); }
    public String keepClientId_QueryDerivedReferrer_MMfrcvdesignListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MMfrcvdesignList", pm); }

    public Map<String, MMfrcvitemCQ> xdfgetClientId_QueryDerivedReferrer_MMfrcvitemList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MMfrcvitemList"); }
    public String keepClientId_QueryDerivedReferrer_MMfrcvitemList(MMfrcvitemCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MMfrcvitemList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MMfrcvitemListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MMfrcvitemList"); }
    public String keepClientId_QueryDerivedReferrer_MMfrcvitemListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MMfrcvitemList", pm); }

    public Map<String, MMfwhxitemCQ> xdfgetClientId_QueryDerivedReferrer_MMfwhxitemList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MMfwhxitemList"); }
    public String keepClientId_QueryDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MMfwhxitemList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MMfwhxitemListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MMfwhxitemList"); }
    public String keepClientId_QueryDerivedReferrer_MMfwhxitemListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MMfwhxitemList", pm); }

    public Map<String, MProductCQ> xdfgetClientId_QueryDerivedReferrer_MProductList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MProductList"); }
    public String keepClientId_QueryDerivedReferrer_MProductList(MProductCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MProductList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MProductListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MProductList"); }
    public String keepClientId_QueryDerivedReferrer_MProductListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MProductList", pm); }

    public Map<String, MShapeGrpCQ> xdfgetClientId_QueryDerivedReferrer_MShapeGrpList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MShapeGrpList"); }
    public String keepClientId_QueryDerivedReferrer_MShapeGrpList(MShapeGrpCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MShapeGrpList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MShapeGrpListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MShapeGrpList"); }
    public String keepClientId_QueryDerivedReferrer_MShapeGrpListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MShapeGrpList", pm); }

    public Map<String, MUserClientCQ> xdfgetClientId_QueryDerivedReferrer_MUserClientList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MUserClientList"); }
    public String keepClientId_QueryDerivedReferrer_MUserClientList(MUserClientCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MUserClientList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MUserClientListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MUserClientList"); }
    public String keepClientId_QueryDerivedReferrer_MUserClientListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MUserClientList", pm); }

    public Map<String, MUserLoginCQ> xdfgetClientId_QueryDerivedReferrer_MUserLoginList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MUserLoginList"); }
    public String keepClientId_QueryDerivedReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MUserLoginList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MUserLoginListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MUserLoginList"); }
    public String keepClientId_QueryDerivedReferrer_MUserLoginListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MUserLoginList", pm); }

    public Map<String, MWebHtInfoCQ> xdfgetClientId_QueryDerivedReferrer_MWebHtInfoList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MWebHtInfoList"); }
    public String keepClientId_QueryDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MWebHtInfoList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MWebHtInfoListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MWebHtInfoList"); }
    public String keepClientId_QueryDerivedReferrer_MWebHtInfoListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MWebHtInfoList", pm); }

    public Map<String, TAllocInstHCQ> xdfgetClientId_QueryDerivedReferrer_TAllocInstHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TAllocInstHList"); }
    public String keepClientId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TAllocInstHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TAllocInstHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TAllocInstHList"); }
    public String keepClientId_QueryDerivedReferrer_TAllocInstHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TAllocInstHList", pm); }

    public Map<String, TCcopamCQ> xdfgetClientId_QueryDerivedReferrer_TCcopamList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TCcopamList"); }
    public String keepClientId_QueryDerivedReferrer_TCcopamList(TCcopamCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TCcopamList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TCcopamListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TCcopamList"); }
    public String keepClientId_QueryDerivedReferrer_TCcopamListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TCcopamList", pm); }

    public Map<String, TCenterSymbolCQ> xdfgetClientId_QueryDerivedReferrer_TCenterSymbolList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TCenterSymbolList"); }
    public String keepClientId_QueryDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TCenterSymbolList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TCenterSymbolListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TCenterSymbolList"); }
    public String keepClientId_QueryDerivedReferrer_TCenterSymbolListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TCenterSymbolList", pm); }

    public Map<String, TCordhdrCQ> xdfgetClientId_QueryDerivedReferrer_TCordhdrList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TCordhdrList"); }
    public String keepClientId_QueryDerivedReferrer_TCordhdrList(TCordhdrCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TCordhdrList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TCordhdrListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TCordhdrList"); }
    public String keepClientId_QueryDerivedReferrer_TCordhdrListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TCordhdrList", pm); }

    public Map<String, TEcOrderHCQ> xdfgetClientId_QueryDerivedReferrer_TEcOrderHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepClientId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TEcOrderHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TEcOrderHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepClientId_QueryDerivedReferrer_TEcOrderHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TEcOrderHList", pm); }

    public Map<String, TInventoryHCQ> xdfgetClientId_QueryDerivedReferrer_TInventoryHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TInventoryHList"); }
    public String keepClientId_QueryDerivedReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TInventoryHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TInventoryHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TInventoryHList"); }
    public String keepClientId_QueryDerivedReferrer_TInventoryHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TInventoryHList", pm); }

    public Map<String, TMflastshiplotCQ> xdfgetClientId_QueryDerivedReferrer_TMflastshiplotList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TMflastshiplotList"); }
    public String keepClientId_QueryDerivedReferrer_TMflastshiplotList(TMflastshiplotCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TMflastshiplotList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TMflastshiplotListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TMflastshiplotList"); }
    public String keepClientId_QueryDerivedReferrer_TMflastshiplotListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TMflastshiplotList", pm); }

    public Map<String, TMoveInstHCQ> xdfgetClientId_QueryDerivedReferrer_TMoveInstHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TMoveInstHList"); }
    public String keepClientId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TMoveInstHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TMoveInstHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TMoveInstHList"); }
    public String keepClientId_QueryDerivedReferrer_TMoveInstHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TMoveInstHList", pm); }

    public Map<String, TPackingHCQ> xdfgetClientId_QueryDerivedReferrer_TPackingHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TPackingHList"); }
    public String keepClientId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TPackingHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TPackingHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TPackingHList"); }
    public String keepClientId_QueryDerivedReferrer_TPackingHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TPackingHList", pm); }

    public Map<String, TPalletCQ> xdfgetClientId_QueryDerivedReferrer_TPalletList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TPalletList"); }
    public String keepClientId_QueryDerivedReferrer_TPalletList(TPalletCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TPalletList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TPalletListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TPalletList"); }
    public String keepClientId_QueryDerivedReferrer_TPalletListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TPalletList", pm); }

    public Map<String, TPickingHCQ> xdfgetClientId_QueryDerivedReferrer_TPickingHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TPickingHList"); }
    public String keepClientId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TPickingHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TPickingHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TPickingHList"); }
    public String keepClientId_QueryDerivedReferrer_TPickingHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TPickingHList", pm); }

    public Map<String, TPicMthdRcmdCQ> xdfgetClientId_QueryDerivedReferrer_TPicMthdRcmdList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TPicMthdRcmdList"); }
    public String keepClientId_QueryDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TPicMthdRcmdList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TPicMthdRcmdListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TPicMthdRcmdList"); }
    public String keepClientId_QueryDerivedReferrer_TPicMthdRcmdListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TPicMthdRcmdList", pm); }

    public Map<String, TReceivePlanHCQ> xdfgetClientId_QueryDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepClientId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TReceivePlanHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TReceivePlanHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepClientId_QueryDerivedReferrer_TReceivePlanHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TReceivePlanHList", pm); }

    public Map<String, TSerialNoCQ> xdfgetClientId_QueryDerivedReferrer_TSerialNoList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TSerialNoList"); }
    public String keepClientId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TSerialNoList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TSerialNoListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TSerialNoList"); }
    public String keepClientId_QueryDerivedReferrer_TSerialNoListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TSerialNoList", pm); }

    public Map<String, TShippingInstHCQ> xdfgetClientId_QueryDerivedReferrer_TShippingInstHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepClientId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TShippingInstHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TShippingInstHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepClientId_QueryDerivedReferrer_TShippingInstHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TShippingInstHList", pm); }

    public Map<String, TSplinfoCQ> xdfgetClientId_QueryDerivedReferrer_TSplinfoList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TSplinfoList"); }
    public String keepClientId_QueryDerivedReferrer_TSplinfoList(TSplinfoCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TSplinfoList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TSplinfoListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TSplinfoList"); }
    public String keepClientId_QueryDerivedReferrer_TSplinfoListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TSplinfoList", pm); }

    public Map<String, TStockCQ> xdfgetClientId_QueryDerivedReferrer_TStockList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TStockList"); }
    public String keepClientId_QueryDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TStockList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TStockListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TStockList"); }
    public String keepClientId_QueryDerivedReferrer_TStockListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TStockList", pm); }

    public Map<String, TStoreRecordHCQ> xdfgetClientId_QueryDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepClientId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TStoreRecordHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TStoreRecordHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepClientId_QueryDerivedReferrer_TStoreRecordHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TStoreRecordHList", pm); }

    public Map<String, TTrallinvCQ> xdfgetClientId_QueryDerivedReferrer_TTrallinvList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrallinvList"); }
    public String keepClientId_QueryDerivedReferrer_TTrallinvList(TTrallinvCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrallinvList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrallinvListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrallinvList"); }
    public String keepClientId_QueryDerivedReferrer_TTrallinvListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrallinvList", pm); }

    public Map<String, TTrallinvhistoryCQ> xdfgetClientId_QueryDerivedReferrer_TTrallinvhistoryList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrallinvhistoryList"); }
    public String keepClientId_QueryDerivedReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrallinvhistoryList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrallinvhistoryListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrallinvhistoryList"); }
    public String keepClientId_QueryDerivedReferrer_TTrallinvhistoryListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrallinvhistoryList", pm); }

    public Map<String, TTrcaseinventoryCQ> xdfgetClientId_QueryDerivedReferrer_TTrcaseinventoryList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrcaseinventoryList"); }
    public String keepClientId_QueryDerivedReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrcaseinventoryList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrcaseinventoryListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrcaseinventoryList"); }
    public String keepClientId_QueryDerivedReferrer_TTrcaseinventoryListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrcaseinventoryList", pm); }

    public Map<String, TTrcasenumCQ> xdfgetClientId_QueryDerivedReferrer_TTrcasenumList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrcasenumList"); }
    public String keepClientId_QueryDerivedReferrer_TTrcasenumList(TTrcasenumCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrcasenumList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrcasenumListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrcasenumList"); }
    public String keepClientId_QueryDerivedReferrer_TTrcasenumListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrcasenumList", pm); }

    public Map<String, TTrcasestockCQ> xdfgetClientId_QueryDerivedReferrer_TTrcasestockList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrcasestockList"); }
    public String keepClientId_QueryDerivedReferrer_TTrcasestockList(TTrcasestockCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrcasestockList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrcasestockListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrcasestockList"); }
    public String keepClientId_QueryDerivedReferrer_TTrcasestockListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrcasestockList", pm); }

    public Map<String, TTrhanbaiinvCQ> xdfgetClientId_QueryDerivedReferrer_TTrhanbaiinvList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrhanbaiinvList"); }
    public String keepClientId_QueryDerivedReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrhanbaiinvList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrhanbaiinvListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrhanbaiinvList"); }
    public String keepClientId_QueryDerivedReferrer_TTrhanbaiinvListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrhanbaiinvList", pm); }

    public Map<String, TTrinvcheckinfoCQ> xdfgetClientId_QueryDerivedReferrer_TTrinvcheckinfoList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrinvcheckinfoList"); }
    public String keepClientId_QueryDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrinvcheckinfoList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrinvcheckinfoListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrinvcheckinfoList"); }
    public String keepClientId_QueryDerivedReferrer_TTrinvcheckinfoListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrinvcheckinfoList", pm); }

    public Map<String, TTrinvcorrectCQ> xdfgetClientId_QueryDerivedReferrer_TTrinvcorrectList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrinvcorrectList"); }
    public String keepClientId_QueryDerivedReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrinvcorrectList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrinvcorrectListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrinvcorrectList"); }
    public String keepClientId_QueryDerivedReferrer_TTrinvcorrectListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrinvcorrectList", pm); }

    public Map<String, TTrinvreanswerCQ> xdfgetClientId_QueryDerivedReferrer_TTrinvreanswerList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrinvreanswerList"); }
    public String keepClientId_QueryDerivedReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrinvreanswerList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrinvreanswerListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrinvreanswerList"); }
    public String keepClientId_QueryDerivedReferrer_TTrinvreanswerListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrinvreanswerList", pm); }

    public Map<String, TTrinvrequestCQ> xdfgetClientId_QueryDerivedReferrer_TTrinvrequestList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrinvrequestList"); }
    public String keepClientId_QueryDerivedReferrer_TTrinvrequestList(TTrinvrequestCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrinvrequestList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrinvrequestListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrinvrequestList"); }
    public String keepClientId_QueryDerivedReferrer_TTrinvrequestListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrinvrequestList", pm); }

    public Map<String, TTritemconvresultCQ> xdfgetClientId_QueryDerivedReferrer_TTritemconvresultList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTritemconvresultList"); }
    public String keepClientId_QueryDerivedReferrer_TTritemconvresultList(TTritemconvresultCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTritemconvresultList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTritemconvresultListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTritemconvresultList"); }
    public String keepClientId_QueryDerivedReferrer_TTritemconvresultListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTritemconvresultList", pm); }

    public Map<String, TTrjukyuinvCQ> xdfgetClientId_QueryDerivedReferrer_TTrjukyuinvList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrjukyuinvList"); }
    public String keepClientId_QueryDerivedReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrjukyuinvList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrjukyuinvListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrjukyuinvList"); }
    public String keepClientId_QueryDerivedReferrer_TTrjukyuinvListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrjukyuinvList", pm); }

    public Map<String, TTrmanufacturedateCQ> xdfgetClientId_QueryDerivedReferrer_TTrmanufacturedateList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrmanufacturedateList"); }
    public String keepClientId_QueryDerivedReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrmanufacturedateList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrmanufacturedateListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrmanufacturedateList"); }
    public String keepClientId_QueryDerivedReferrer_TTrmanufacturedateListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrmanufacturedateList", pm); }

    public Map<String, TTrmanufacturedatedetailCQ> xdfgetClientId_QueryDerivedReferrer_TTrmanufacturedatedetailList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrmanufacturedatedetailList"); }
    public String keepClientId_QueryDerivedReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrmanufacturedatedetailList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrmanufacturedatedetailListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrmanufacturedatedetailList"); }
    public String keepClientId_QueryDerivedReferrer_TTrmanufacturedatedetailListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrmanufacturedatedetailList", pm); }

    public Map<String, TTrmanufacturedatehistoryCQ> xdfgetClientId_QueryDerivedReferrer_TTrmanufacturedatehistoryList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrmanufacturedatehistoryList"); }
    public String keepClientId_QueryDerivedReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrmanufacturedatehistoryList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrmanufacturedatehistoryListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrmanufacturedatehistoryList"); }
    public String keepClientId_QueryDerivedReferrer_TTrmanufacturedatehistoryListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrmanufacturedatehistoryList", pm); }

    public Map<String, TTrpallettraceCQ> xdfgetClientId_QueryDerivedReferrer_TTrpallettraceList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrpallettraceList"); }
    public String keepClientId_QueryDerivedReferrer_TTrpallettraceList(TTrpallettraceCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrpallettraceList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrpallettraceListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrpallettraceList"); }
    public String keepClientId_QueryDerivedReferrer_TTrpallettraceListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrpallettraceList", pm); }

    public Map<String, TTrreversestockCQ> xdfgetClientId_QueryDerivedReferrer_TTrreversestockList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrreversestockList"); }
    public String keepClientId_QueryDerivedReferrer_TTrreversestockList(TTrreversestockCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrreversestockList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrreversestockListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrreversestockList"); }
    public String keepClientId_QueryDerivedReferrer_TTrreversestockListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrreversestockList", pm); }

    public Map<String, TTrstockdiffhistoryCQ> xdfgetClientId_QueryDerivedReferrer_TTrstockdiffhistoryList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrstockdiffhistoryList"); }
    public String keepClientId_QueryDerivedReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrstockdiffhistoryList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrstockdiffhistoryListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrstockdiffhistoryList"); }
    public String keepClientId_QueryDerivedReferrer_TTrstockdiffhistoryListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrstockdiffhistoryList", pm); }

    public Map<String, TTrsymboltraceCQ> xdfgetClientId_QueryDerivedReferrer_TTrsymboltraceList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrsymboltraceList"); }
    public String keepClientId_QueryDerivedReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrsymboltraceList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrsymboltraceListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrsymboltraceList"); }
    public String keepClientId_QueryDerivedReferrer_TTrsymboltraceListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrsymboltraceList", pm); }

    public Map<String, TTrsymboltraceextendCQ> xdfgetClientId_QueryDerivedReferrer_TTrsymboltraceextendList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrsymboltraceextendList"); }
    public String keepClientId_QueryDerivedReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrsymboltraceextendList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrsymboltraceextendListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrsymboltraceextendList"); }
    public String keepClientId_QueryDerivedReferrer_TTrsymboltraceextendListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrsymboltraceextendList", pm); }

    public Map<String, TTrtraceCQ> xdfgetClientId_QueryDerivedReferrer_TTrtraceList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTrtraceList"); }
    public String keepClientId_QueryDerivedReferrer_TTrtraceList(TTrtraceCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTrtraceList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTrtraceListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTrtraceList"); }
    public String keepClientId_QueryDerivedReferrer_TTrtraceListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTrtraceList", pm); }

    public Map<String, TYtrsoCQ> xdfgetClientId_QueryDerivedReferrer_TYtrsoList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TYtrsoList"); }
    public String keepClientId_QueryDerivedReferrer_TYtrsoList(TYtrsoCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TYtrsoList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TYtrsoListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TYtrsoList"); }
    public String keepClientId_QueryDerivedReferrer_TYtrsoListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TYtrsoList", pm); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetClientId_QueryDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepClientId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtInventoryInputProdList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtInventoryInputProdListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepClientId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtInventoryInputProdList", pm); }

    public Map<String, WHtLoadingCQ> xdfgetClientId_QueryDerivedReferrer_WHtLoadingList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtLoadingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtLoadingList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtLoadingListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtLoadingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtLoadingListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtLoadingList", pm); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetClientId_QueryDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtReceiveInspectionList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtReceiveInspectionListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtReceiveInspectionList", pm); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", pm); }

    public Map<String, WHtReceiveStoreCQ> xdfgetClientId_QueryDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtReceiveStoreList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtReceiveStoreListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtReceiveStoreList", pm); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetClientId_QueryDerivedReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepClientId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtSerialReceiveInspList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepClientId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtSerialReceiveInspList", pm); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetClientId_QueryDerivedReferrer_WHtSerialShippingInspList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepClientId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtSerialShippingInspList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtSerialShippingInspListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepClientId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtSerialShippingInspList", pm); }

    public Map<String, WHtShippingCQ> xdfgetClientId_QueryDerivedReferrer_WHtShippingList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtShippingList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtShippingListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtShippingListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtShippingList", pm); }

    public Map<String, WHtShippingPickingCQ> xdfgetClientId_QueryDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtShippingPickingList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtShippingPickingListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtShippingPickingList", pm); }

    public Map<String, WSglRowShipInspHCQ> xdfgetClientId_QueryDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepClientId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WSglRowShipInspHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WSglRowShipInspHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepClientId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WSglRowShipInspHList", pm); }

    public Map<String, WShippingInterruptCQ> xdfgetClientId_QueryDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepClientId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WShippingInterruptList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WShippingInterruptListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepClientId_QueryDerivedReferrer_WShippingInterruptListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WShippingInterruptList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _clientCd;
    public ConditionValue xdfgetClientCd()
    { if (_clientCd == null) { _clientCd = nCV(); }
      return _clientCd; }
    protected ConditionValue xgetCValueClientCd() { return xdfgetClientCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

    protected ConditionValue _clientNm;
    public ConditionValue xdfgetClientNm()
    { if (_clientNm == null) { _clientNm = nCV(); }
      return _clientNm; }
    protected ConditionValue xgetCValueClientNm() { return xdfgetClientNm(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientNm_Asc() { regOBA("CLIENT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientNm_Desc() { regOBD("CLIENT_NM"); return this; }

    protected ConditionValue _clientAbbr;
    public ConditionValue xdfgetClientAbbr()
    { if (_clientAbbr == null) { _clientAbbr = nCV(); }
      return _clientAbbr; }
    protected ConditionValue xgetCValueClientAbbr() { return xdfgetClientAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientAbbr_Asc() { regOBA("CLIENT_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientAbbr_Desc() { regOBD("CLIENT_ABBR"); return this; }

    protected ConditionValue _customerId;
    public ConditionValue xdfgetCustomerId()
    { if (_customerId == null) { _customerId = nCV(); }
      return _customerId; }
    protected ConditionValue xgetCValueCustomerId() { return xdfgetCustomerId(); }

    public Map<String, MCustomerCQ> getCustomerId_InScopeRelation_MCustomer() { return xgetSQueMap("customerId_InScopeRelation_MCustomer"); }
    public String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("customerId_InScopeRelation_MCustomer", sq); }

    public Map<String, MCustomerCQ> getCustomerId_NotInScopeRelation_MCustomer() { return xgetSQueMap("customerId_NotInScopeRelation_MCustomer"); }
    public String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("customerId_NotInScopeRelation_MCustomer", sq); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_CustomerId_Asc() { regOBA("CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_CustomerId_Desc() { regOBD("CUSTOMER_ID"); return this; }

    protected ConditionValue _shapeGrpId;
    public ConditionValue xdfgetShapeGrpId()
    { if (_shapeGrpId == null) { _shapeGrpId = nCV(); }
      return _shapeGrpId; }
    protected ConditionValue xgetCValueShapeGrpId() { return xdfgetShapeGrpId(); }

    public Map<String, MShapeGrpCQ> getShapeGrpId_InScopeRelation_MShapeGrp() { return xgetSQueMap("shapeGrpId_InScopeRelation_MShapeGrp"); }
    public String keepShapeGrpId_InScopeRelation_MShapeGrp(MShapeGrpCQ sq) { return xkeepSQue("shapeGrpId_InScopeRelation_MShapeGrp", sq); }

    public Map<String, MShapeGrpCQ> getShapeGrpId_NotInScopeRelation_MShapeGrp() { return xgetSQueMap("shapeGrpId_NotInScopeRelation_MShapeGrp"); }
    public String keepShapeGrpId_NotInScopeRelation_MShapeGrp(MShapeGrpCQ sq) { return xkeepSQue("shapeGrpId_NotInScopeRelation_MShapeGrp", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ShapeGrpId_Asc() { regOBA("SHAPE_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ShapeGrpId_Desc() { regOBD("SHAPE_GRP_ID"); return this; }

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
    public BsMClientCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMClientCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMClientCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMClientCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMClientCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMClientCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMClientCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMClientCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMClientCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMClientCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMClientCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MClientCQ bq = (MClientCQ)bqs;
        MClientCQ uq = (MClientCQ)uqs;
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryMShapeGrp()) {
            uq.queryMShapeGrp().reflectRelationOnUnionQuery(bq.queryMShapeGrp(), uq.queryMShapeGrp());
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
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomer() {
        return xdfgetConditionQueryMCustomer();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomer() {
        String prop = "mCustomer";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomer()); xsetupOuterJoinMCustomer(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomer() {
        String nrp = xresolveNRP("M_CLIENT", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @return The instance of condition-query. (NotNull)
     */
    public MShapeGrpCQ queryMShapeGrp() {
        return xdfgetConditionQueryMShapeGrp();
    }
    public MShapeGrpCQ xdfgetConditionQueryMShapeGrp() {
        String prop = "mShapeGrp";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMShapeGrp()); xsetupOuterJoinMShapeGrp(); }
        return xgetQueRlMap(prop);
    }
    protected MShapeGrpCQ xcreateQueryMShapeGrp() {
        String nrp = xresolveNRP("M_CLIENT", "mShapeGrp"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeGrpCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShapeGrp", nrp);
    }
    protected void xsetupOuterJoinMShapeGrp() { xregOutJo("mShapeGrp"); }
    public boolean hasConditionQueryMShapeGrp() { return xhasQueRlMap("mShapeGrp"); }

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
        String nrp = xresolveNRP("M_CLIENT", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, MClientCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MClientCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MClientCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MClientCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MClientCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MClientCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MClientCQ> _myselfExistsMap;
    public Map<String, MClientCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MClientCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MClientCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MClientCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MClientCB.class.getName(); }
    protected String xCQ() { return MClientCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
