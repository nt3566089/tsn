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
 * The base condition-query of M_STOCK_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class BsMStockTypeCQ extends AbstractBsMStockTypeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MStockTypeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMStockTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_STOCK_TYPE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MStockTypeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MStockTypeCIQ xcreateCIQ() {
        MStockTypeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MStockTypeCIQ xnewCIQ() {
        return new MStockTypeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_STOCK_TYPE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MStockTypeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MStockTypeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _stockTypeId;
    public ConditionValue xdfgetStockTypeId()
    { if (_stockTypeId == null) { _stockTypeId = nCV(); }
      return _stockTypeId; }
    protected ConditionValue xgetCValueStockTypeId() { return xdfgetStockTypeId(); }

    public Map<String, HInventoryBCQ> xdfgetStockTypeId_ExistsReferrer_HInventoryBList() { return xgetSQueMap("stockTypeId_ExistsReferrer_HInventoryBList"); }
    public String keepStockTypeId_ExistsReferrer_HInventoryBList(HInventoryBCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_HInventoryBList", sq); }

    public Map<String, HShippingBCQ> xdfgetStockTypeId_ExistsReferrer_HShippingBList() { return xgetSQueMap("stockTypeId_ExistsReferrer_HShippingBList"); }
    public String keepStockTypeId_ExistsReferrer_HShippingBList(HShippingBCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_HShippingBList", sq); }

    public Map<String, HStockCQ> xdfgetStockTypeId_ExistsReferrer_HStockList() { return xgetSQueMap("stockTypeId_ExistsReferrer_HStockList"); }
    public String keepStockTypeId_ExistsReferrer_HStockList(HStockCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_HStockList", sq); }

    public Map<String, MLocationCQ> xdfgetStockTypeId_ExistsReferrer_MLocationList() { return xgetSQueMap("stockTypeId_ExistsReferrer_MLocationList"); }
    public String keepStockTypeId_ExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_MLocationList", sq); }

    public Map<String, MProcessTypeCQ> xdfgetStockTypeId_ExistsReferrer_MProcessTypeList() { return xgetSQueMap("stockTypeId_ExistsReferrer_MProcessTypeList"); }
    public String keepStockTypeId_ExistsReferrer_MProcessTypeList(MProcessTypeCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_MProcessTypeList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetStockTypeId_ExistsReferrer_TAllocInstBList() { return xgetSQueMap("stockTypeId_ExistsReferrer_TAllocInstBList"); }
    public String keepStockTypeId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetStockTypeId_ExistsReferrer_TInventoryBList() { return xgetSQueMap("stockTypeId_ExistsReferrer_TInventoryBList"); }
    public String keepStockTypeId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_TInventoryBList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetStockTypeId_ExistsReferrer_TInventoryInstList() { return xgetSQueMap("stockTypeId_ExistsReferrer_TInventoryInstList"); }
    public String keepStockTypeId_ExistsReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_TInventoryInstList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetStockTypeId_ExistsReferrer_TMoveInstBList() { return xgetSQueMap("stockTypeId_ExistsReferrer_TMoveInstBList"); }
    public String keepStockTypeId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetStockTypeId_ExistsReferrer_TReceivePlanHList() { return xgetSQueMap("stockTypeId_ExistsReferrer_TReceivePlanHList"); }
    public String keepStockTypeId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetStockTypeId_ExistsReferrer_TShippingInstBList() { return xgetSQueMap("stockTypeId_ExistsReferrer_TShippingInstBList"); }
    public String keepStockTypeId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetStockTypeId_ExistsReferrer_TStockList() { return xgetSQueMap("stockTypeId_ExistsReferrer_TStockList"); }
    public String keepStockTypeId_ExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_TStockList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetStockTypeId_ExistsReferrer_TStoreRecordHList() { return xgetSQueMap("stockTypeId_ExistsReferrer_TStoreRecordHList"); }
    public String keepStockTypeId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetStockTypeId_ExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("stockTypeId_ExistsReferrer_WHtInventoryInputProdList"); }
    public String keepStockTypeId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetStockTypeId_ExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("stockTypeId_ExistsReferrer_WHtReceiveInspectionList"); }
    public String keepStockTypeId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetStockTypeId_ExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("stockTypeId_ExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepStockTypeId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetStockTypeId_ExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("stockTypeId_ExistsReferrer_WHtReceiveStoreList"); }
    public String keepStockTypeId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("stockTypeId_ExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, HInventoryBCQ> xdfgetStockTypeId_NotExistsReferrer_HInventoryBList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_HInventoryBList"); }
    public String keepStockTypeId_NotExistsReferrer_HInventoryBList(HInventoryBCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_HInventoryBList", sq); }

    public Map<String, HShippingBCQ> xdfgetStockTypeId_NotExistsReferrer_HShippingBList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_HShippingBList"); }
    public String keepStockTypeId_NotExistsReferrer_HShippingBList(HShippingBCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_HShippingBList", sq); }

    public Map<String, HStockCQ> xdfgetStockTypeId_NotExistsReferrer_HStockList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_HStockList"); }
    public String keepStockTypeId_NotExistsReferrer_HStockList(HStockCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_HStockList", sq); }

    public Map<String, MLocationCQ> xdfgetStockTypeId_NotExistsReferrer_MLocationList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_MLocationList"); }
    public String keepStockTypeId_NotExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_MLocationList", sq); }

    public Map<String, MProcessTypeCQ> xdfgetStockTypeId_NotExistsReferrer_MProcessTypeList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_MProcessTypeList"); }
    public String keepStockTypeId_NotExistsReferrer_MProcessTypeList(MProcessTypeCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_MProcessTypeList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetStockTypeId_NotExistsReferrer_TAllocInstBList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_TAllocInstBList"); }
    public String keepStockTypeId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetStockTypeId_NotExistsReferrer_TInventoryBList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_TInventoryBList"); }
    public String keepStockTypeId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_TInventoryBList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetStockTypeId_NotExistsReferrer_TInventoryInstList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_TInventoryInstList"); }
    public String keepStockTypeId_NotExistsReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_TInventoryInstList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetStockTypeId_NotExistsReferrer_TMoveInstBList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_TMoveInstBList"); }
    public String keepStockTypeId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetStockTypeId_NotExistsReferrer_TReceivePlanHList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_TReceivePlanHList"); }
    public String keepStockTypeId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetStockTypeId_NotExistsReferrer_TShippingInstBList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_TShippingInstBList"); }
    public String keepStockTypeId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetStockTypeId_NotExistsReferrer_TStockList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_TStockList"); }
    public String keepStockTypeId_NotExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_TStockList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetStockTypeId_NotExistsReferrer_TStoreRecordHList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_TStoreRecordHList"); }
    public String keepStockTypeId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetStockTypeId_NotExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_WHtInventoryInputProdList"); }
    public String keepStockTypeId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetStockTypeId_NotExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_WHtReceiveInspectionList"); }
    public String keepStockTypeId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetStockTypeId_NotExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepStockTypeId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetStockTypeId_NotExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("stockTypeId_NotExistsReferrer_WHtReceiveStoreList"); }
    public String keepStockTypeId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("stockTypeId_NotExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, HInventoryBCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_HInventoryBList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_HInventoryBList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_HInventoryBList(HInventoryBCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_HInventoryBList", sq); }

    public Map<String, HShippingBCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_HShippingBList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_HShippingBList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_HShippingBList(HShippingBCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_HShippingBList", sq); }

    public Map<String, HStockCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_HStockList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_HStockList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_HStockList(HStockCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_HStockList", sq); }

    public Map<String, MLocationCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_MLocationList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_MLocationList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_MLocationList", sq); }

    public Map<String, MProcessTypeCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_MProcessTypeList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_MProcessTypeList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_MProcessTypeList(MProcessTypeCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_MProcessTypeList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_TAllocInstBList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_TAllocInstBList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_TInventoryBList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_TInventoryBList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_TInventoryBList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_TInventoryInstList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_TInventoryInstList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_TInventoryInstList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_TMoveInstBList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_TMoveInstBList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_TMoveInstBList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_TReceivePlanHList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_TReceivePlanHList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_TShippingInstBList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_TShippingInstBList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_TStockList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_TStockList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_TStockList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_TStoreRecordHList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_TStoreRecordHList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetStockTypeId_SpecifyDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("stockTypeId_SpecifyDerivedReferrer_WHtReceiveStoreList"); }
    public String keepStockTypeId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("stockTypeId_SpecifyDerivedReferrer_WHtReceiveStoreList", sq); }

    public Map<String, HInventoryBCQ> xdfgetStockTypeId_QueryDerivedReferrer_HInventoryBList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_HInventoryBList"); }
    public String keepStockTypeId_QueryDerivedReferrer_HInventoryBList(HInventoryBCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_HInventoryBList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_HInventoryBListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_HInventoryBList"); }
    public String keepStockTypeId_QueryDerivedReferrer_HInventoryBListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_HInventoryBList", pm); }

    public Map<String, HShippingBCQ> xdfgetStockTypeId_QueryDerivedReferrer_HShippingBList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_HShippingBList"); }
    public String keepStockTypeId_QueryDerivedReferrer_HShippingBList(HShippingBCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_HShippingBList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_HShippingBListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_HShippingBList"); }
    public String keepStockTypeId_QueryDerivedReferrer_HShippingBListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_HShippingBList", pm); }

    public Map<String, HStockCQ> xdfgetStockTypeId_QueryDerivedReferrer_HStockList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_HStockList"); }
    public String keepStockTypeId_QueryDerivedReferrer_HStockList(HStockCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_HStockList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_HStockListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_HStockList"); }
    public String keepStockTypeId_QueryDerivedReferrer_HStockListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_HStockList", pm); }

    public Map<String, MLocationCQ> xdfgetStockTypeId_QueryDerivedReferrer_MLocationList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_MLocationList"); }
    public String keepStockTypeId_QueryDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_MLocationList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_MLocationListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_MLocationList"); }
    public String keepStockTypeId_QueryDerivedReferrer_MLocationListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_MLocationList", pm); }

    public Map<String, MProcessTypeCQ> xdfgetStockTypeId_QueryDerivedReferrer_MProcessTypeList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_MProcessTypeList"); }
    public String keepStockTypeId_QueryDerivedReferrer_MProcessTypeList(MProcessTypeCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_MProcessTypeList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_MProcessTypeListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_MProcessTypeList"); }
    public String keepStockTypeId_QueryDerivedReferrer_MProcessTypeListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_MProcessTypeList", pm); }

    public Map<String, TAllocInstBCQ> xdfgetStockTypeId_QueryDerivedReferrer_TAllocInstBList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_TAllocInstBList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_TAllocInstBListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TAllocInstBListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_TAllocInstBList", pm); }

    public Map<String, TInventoryBCQ> xdfgetStockTypeId_QueryDerivedReferrer_TInventoryBList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_TInventoryBList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_TInventoryBListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TInventoryBListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_TInventoryBList", pm); }

    public Map<String, TInventoryInstCQ> xdfgetStockTypeId_QueryDerivedReferrer_TInventoryInstList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_TInventoryInstList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_TInventoryInstList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_TInventoryInstListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_TInventoryInstList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TInventoryInstListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_TInventoryInstList", pm); }

    public Map<String, TMoveInstBCQ> xdfgetStockTypeId_QueryDerivedReferrer_TMoveInstBList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_TMoveInstBList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_TMoveInstBListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TMoveInstBListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_TMoveInstBList", pm); }

    public Map<String, TReceivePlanHCQ> xdfgetStockTypeId_QueryDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_TReceivePlanHList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_TReceivePlanHListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TReceivePlanHListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_TReceivePlanHList", pm); }

    public Map<String, TShippingInstBCQ> xdfgetStockTypeId_QueryDerivedReferrer_TShippingInstBList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_TShippingInstBList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_TShippingInstBListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TShippingInstBListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_TShippingInstBList", pm); }

    public Map<String, TStockCQ> xdfgetStockTypeId_QueryDerivedReferrer_TStockList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_TStockList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_TStockList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_TStockListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_TStockList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TStockListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_TStockList", pm); }

    public Map<String, TStoreRecordHCQ> xdfgetStockTypeId_QueryDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_TStoreRecordHList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_TStoreRecordHListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepStockTypeId_QueryDerivedReferrer_TStoreRecordHListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_TStoreRecordHList", pm); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetStockTypeId_QueryDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepStockTypeId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_WHtInventoryInputProdList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_WHtInventoryInputProdListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepStockTypeId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_WHtInventoryInputProdList", pm); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetStockTypeId_QueryDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepStockTypeId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_WHtReceiveInspectionList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_WHtReceiveInspectionListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepStockTypeId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_WHtReceiveInspectionList", pm); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetStockTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepStockTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepStockTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", pm); }

    public Map<String, WHtReceiveStoreCQ> xdfgetStockTypeId_QueryDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("stockTypeId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepStockTypeId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("stockTypeId_QueryDerivedReferrer_WHtReceiveStoreList", sq); }
    public Map<String, Object> xdfgetStockTypeId_QueryDerivedReferrer_WHtReceiveStoreListParameter() { return xgetSQuePmMap("stockTypeId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepStockTypeId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object pm) { return xkeepSQuePm("stockTypeId_QueryDerivedReferrer_WHtReceiveStoreList", pm); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

    protected ConditionValue _stockTypeCd;
    public ConditionValue xdfgetStockTypeCd()
    { if (_stockTypeCd == null) { _stockTypeCd = nCV(); }
      return _stockTypeCd; }
    protected ConditionValue xgetCValueStockTypeCd() { return xdfgetStockTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_StockTypeCd_Asc() { regOBA("STOCK_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_StockTypeCd_Desc() { regOBD("STOCK_TYPE_CD"); return this; }

    protected ConditionValue _dictId;
    public ConditionValue xdfgetDictId()
    { if (_dictId == null) { _dictId = nCV(); }
      return _dictId; }
    protected ConditionValue xgetCValueDictId() { return xdfgetDictId(); }

    public Map<String, BDictCQ> getDictId_InScopeRelation_BDict() { return xgetSQueMap("dictId_InScopeRelation_BDict"); }
    public String keepDictId_InScopeRelation_BDict(BDictCQ sq) { return xkeepSQue("dictId_InScopeRelation_BDict", sq); }

    public Map<String, BDictCQ> getDictId_NotInScopeRelation_BDict() { return xgetSQueMap("dictId_NotInScopeRelation_BDict"); }
    public String keepDictId_NotInScopeRelation_BDict(BDictCQ sq) { return xkeepSQue("dictId_NotInScopeRelation_BDict", sq); }

    /**
     * Add order-by as ascend. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _reverseValidFlg;
    public ConditionValue xdfgetReverseValidFlg()
    { if (_reverseValidFlg == null) { _reverseValidFlg = nCV(); }
      return _reverseValidFlg; }
    protected ConditionValue xgetCValueReverseValidFlg() { return xdfgetReverseValidFlg(); }

    /**
     * Add order-by as ascend. <br>
     * REVERSE_VALID_FLG: {char(1), FK to B_CLASS_DTL, classification=ReverseValidFlg}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_ReverseValidFlg_Asc() { regOBA("REVERSE_VALID_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * REVERSE_VALID_FLG: {char(1), FK to B_CLASS_DTL, classification=ReverseValidFlg}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_ReverseValidFlg_Desc() { regOBD("REVERSE_VALID_FLG"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMStockTypeCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMStockTypeCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMStockTypeCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMStockTypeCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMStockTypeCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMStockTypeCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMStockTypeCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMStockTypeCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMStockTypeCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMStockTypeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMStockTypeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MStockTypeCQ bq = (MStockTypeCQ)bqs;
        MStockTypeCQ uq = (MStockTypeCQ)uqs;
        if (bq.hasConditionQueryVDict()) {
            uq.xsetParameterMapVDict(bq.xdfgetParameterMapVDict());
            uq.xdfgetConditionQueryVDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVDict(), uq.xdfgetConditionQueryVDict());
        }
        if (bq.hasConditionQueryBClassDtlByReverseValidFlg()) {
            uq.queryBClassDtlByReverseValidFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByReverseValidFlg(), uq.queryBClassDtlByReverseValidFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * V_DICT by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public VDictCQ queryVDict(Long cultureId) {
        Map<String, Object> parameterMap = xdfgetParameterMapVDict();
        parameterMap.put("cultureId", cultureId);
        xassertFCDP("vDict", parameterMap);
        return xdfgetConditionQueryVDict();
    }
    public VDictCQ xdfgetConditionQueryVDict() {
        String prop = "vDict";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVDict()); xsetupOuterJoinVDict(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapVDict;
    public Map<String, Object> xdfgetParameterMapVDict()
    { if (_parameterMapVDict == null) { _parameterMapVDict = newLinkedHashMapSized(4); }
      return _parameterMapVDict; }
    public void xsetParameterMapVDict(Map<String, Object> parameterMap)
    { _parameterMapVDict = parameterMap; } // for UnionQuery
    protected VDictCQ xcreateQueryVDict() {
        String nrp = xresolveNRP("M_STOCK_TYPE", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vDict", nrp);
    }
    protected void xsetupOuterJoinVDict() { xregOutJo("vDict"); }
    public boolean hasConditionQueryVDict() { return xhasQueRlMap("vDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my REVERSE_VALID_FLG, named 'BClassDtlByReverseValidFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByReverseValidFlg() {
        return xdfgetConditionQueryBClassDtlByReverseValidFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByReverseValidFlg() {
        String prop = "bClassDtlByReverseValidFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByReverseValidFlg()); xsetupOuterJoinBClassDtlByReverseValidFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByReverseValidFlg() {
        String nrp = xresolveNRP("M_STOCK_TYPE", "bClassDtlByReverseValidFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByReverseValidFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByReverseValidFlg() { xregOutJo("bClassDtlByReverseValidFlg"); }
    public boolean hasConditionQueryBClassDtlByReverseValidFlg() { return xhasQueRlMap("bClassDtlByReverseValidFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vDict".equalsIgnoreCase(property)) { return _parameterMapVDict; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MStockTypeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MStockTypeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MStockTypeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MStockTypeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MStockTypeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MStockTypeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MStockTypeCQ> _myselfExistsMap;
    public Map<String, MStockTypeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MStockTypeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MStockTypeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MStockTypeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MStockTypeCB.class.getName(); }
    protected String xCQ() { return MStockTypeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
