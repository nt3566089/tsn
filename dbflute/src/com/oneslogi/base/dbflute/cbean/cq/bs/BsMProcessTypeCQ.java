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
 * The base condition-query of M_PROCESS_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class BsMProcessTypeCQ extends AbstractBsMProcessTypeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MProcessTypeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMProcessTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_PROCESS_TYPE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MProcessTypeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MProcessTypeCIQ xcreateCIQ() {
        MProcessTypeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MProcessTypeCIQ xnewCIQ() {
        return new MProcessTypeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_PROCESS_TYPE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MProcessTypeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MProcessTypeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _processTypeId;
    public ConditionValue xdfgetProcessTypeId()
    { if (_processTypeId == null) { _processTypeId = nCV(); }
      return _processTypeId; }
    protected ConditionValue xgetCValueProcessTypeId() { return xdfgetProcessTypeId(); }

    public Map<String, HMoveHCQ> xdfgetProcessTypeId_ExistsReferrer_HMoveHList() { return xgetSQueMap("processTypeId_ExistsReferrer_HMoveHList"); }
    public String keepProcessTypeId_ExistsReferrer_HMoveHList(HMoveHCQ sq) { return xkeepSQue("processTypeId_ExistsReferrer_HMoveHList", sq); }

    public Map<String, HReceiveHCQ> xdfgetProcessTypeId_ExistsReferrer_HReceiveHList() { return xgetSQueMap("processTypeId_ExistsReferrer_HReceiveHList"); }
    public String keepProcessTypeId_ExistsReferrer_HReceiveHList(HReceiveHCQ sq) { return xkeepSQue("processTypeId_ExistsReferrer_HReceiveHList", sq); }

    public Map<String, HShippingHCQ> xdfgetProcessTypeId_ExistsReferrer_HShippingHList() { return xgetSQueMap("processTypeId_ExistsReferrer_HShippingHList"); }
    public String keepProcessTypeId_ExistsReferrer_HShippingHList(HShippingHCQ sq) { return xkeepSQue("processTypeId_ExistsReferrer_HShippingHList", sq); }

    public Map<String, HStockInoutCQ> xdfgetProcessTypeId_ExistsReferrer_HStockInoutList() { return xgetSQueMap("processTypeId_ExistsReferrer_HStockInoutList"); }
    public String keepProcessTypeId_ExistsReferrer_HStockInoutList(HStockInoutCQ sq) { return xkeepSQue("processTypeId_ExistsReferrer_HStockInoutList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetProcessTypeId_ExistsReferrer_TAllocInstHList() { return xgetSQueMap("processTypeId_ExistsReferrer_TAllocInstHList"); }
    public String keepProcessTypeId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("processTypeId_ExistsReferrer_TAllocInstHList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetProcessTypeId_ExistsReferrer_TMoveInstHList() { return xgetSQueMap("processTypeId_ExistsReferrer_TMoveInstHList"); }
    public String keepProcessTypeId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("processTypeId_ExistsReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetProcessTypeId_ExistsReferrer_TPackingHList() { return xgetSQueMap("processTypeId_ExistsReferrer_TPackingHList"); }
    public String keepProcessTypeId_ExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("processTypeId_ExistsReferrer_TPackingHList", sq); }

    public Map<String, TPickingHCQ> xdfgetProcessTypeId_ExistsReferrer_TPickingHList() { return xgetSQueMap("processTypeId_ExistsReferrer_TPickingHList"); }
    public String keepProcessTypeId_ExistsReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("processTypeId_ExistsReferrer_TPickingHList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetProcessTypeId_ExistsReferrer_TReceivePlanHList() { return xgetSQueMap("processTypeId_ExistsReferrer_TReceivePlanHList"); }
    public String keepProcessTypeId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("processTypeId_ExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetProcessTypeId_ExistsReferrer_TShippingInstHList() { return xgetSQueMap("processTypeId_ExistsReferrer_TShippingInstHList"); }
    public String keepProcessTypeId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("processTypeId_ExistsReferrer_TShippingInstHList", sq); }

    public Map<String, TStockInoutCQ> xdfgetProcessTypeId_ExistsReferrer_TStockInoutList() { return xgetSQueMap("processTypeId_ExistsReferrer_TStockInoutList"); }
    public String keepProcessTypeId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("processTypeId_ExistsReferrer_TStockInoutList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetProcessTypeId_ExistsReferrer_TStoreRecordHList() { return xgetSQueMap("processTypeId_ExistsReferrer_TStoreRecordHList"); }
    public String keepProcessTypeId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("processTypeId_ExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetProcessTypeId_ExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("processTypeId_ExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProcessTypeId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("processTypeId_ExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, HMoveHCQ> xdfgetProcessTypeId_NotExistsReferrer_HMoveHList() { return xgetSQueMap("processTypeId_NotExistsReferrer_HMoveHList"); }
    public String keepProcessTypeId_NotExistsReferrer_HMoveHList(HMoveHCQ sq) { return xkeepSQue("processTypeId_NotExistsReferrer_HMoveHList", sq); }

    public Map<String, HReceiveHCQ> xdfgetProcessTypeId_NotExistsReferrer_HReceiveHList() { return xgetSQueMap("processTypeId_NotExistsReferrer_HReceiveHList"); }
    public String keepProcessTypeId_NotExistsReferrer_HReceiveHList(HReceiveHCQ sq) { return xkeepSQue("processTypeId_NotExistsReferrer_HReceiveHList", sq); }

    public Map<String, HShippingHCQ> xdfgetProcessTypeId_NotExistsReferrer_HShippingHList() { return xgetSQueMap("processTypeId_NotExistsReferrer_HShippingHList"); }
    public String keepProcessTypeId_NotExistsReferrer_HShippingHList(HShippingHCQ sq) { return xkeepSQue("processTypeId_NotExistsReferrer_HShippingHList", sq); }

    public Map<String, HStockInoutCQ> xdfgetProcessTypeId_NotExistsReferrer_HStockInoutList() { return xgetSQueMap("processTypeId_NotExistsReferrer_HStockInoutList"); }
    public String keepProcessTypeId_NotExistsReferrer_HStockInoutList(HStockInoutCQ sq) { return xkeepSQue("processTypeId_NotExistsReferrer_HStockInoutList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetProcessTypeId_NotExistsReferrer_TAllocInstHList() { return xgetSQueMap("processTypeId_NotExistsReferrer_TAllocInstHList"); }
    public String keepProcessTypeId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("processTypeId_NotExistsReferrer_TAllocInstHList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetProcessTypeId_NotExistsReferrer_TMoveInstHList() { return xgetSQueMap("processTypeId_NotExistsReferrer_TMoveInstHList"); }
    public String keepProcessTypeId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("processTypeId_NotExistsReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetProcessTypeId_NotExistsReferrer_TPackingHList() { return xgetSQueMap("processTypeId_NotExistsReferrer_TPackingHList"); }
    public String keepProcessTypeId_NotExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("processTypeId_NotExistsReferrer_TPackingHList", sq); }

    public Map<String, TPickingHCQ> xdfgetProcessTypeId_NotExistsReferrer_TPickingHList() { return xgetSQueMap("processTypeId_NotExistsReferrer_TPickingHList"); }
    public String keepProcessTypeId_NotExistsReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("processTypeId_NotExistsReferrer_TPickingHList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetProcessTypeId_NotExistsReferrer_TReceivePlanHList() { return xgetSQueMap("processTypeId_NotExistsReferrer_TReceivePlanHList"); }
    public String keepProcessTypeId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("processTypeId_NotExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetProcessTypeId_NotExistsReferrer_TShippingInstHList() { return xgetSQueMap("processTypeId_NotExistsReferrer_TShippingInstHList"); }
    public String keepProcessTypeId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("processTypeId_NotExistsReferrer_TShippingInstHList", sq); }

    public Map<String, TStockInoutCQ> xdfgetProcessTypeId_NotExistsReferrer_TStockInoutList() { return xgetSQueMap("processTypeId_NotExistsReferrer_TStockInoutList"); }
    public String keepProcessTypeId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("processTypeId_NotExistsReferrer_TStockInoutList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetProcessTypeId_NotExistsReferrer_TStoreRecordHList() { return xgetSQueMap("processTypeId_NotExistsReferrer_TStoreRecordHList"); }
    public String keepProcessTypeId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("processTypeId_NotExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetProcessTypeId_NotExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("processTypeId_NotExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProcessTypeId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("processTypeId_NotExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, HMoveHCQ> xdfgetProcessTypeId_SpecifyDerivedReferrer_HMoveHList() { return xgetSQueMap("processTypeId_SpecifyDerivedReferrer_HMoveHList"); }
    public String keepProcessTypeId_SpecifyDerivedReferrer_HMoveHList(HMoveHCQ sq) { return xkeepSQue("processTypeId_SpecifyDerivedReferrer_HMoveHList", sq); }

    public Map<String, HReceiveHCQ> xdfgetProcessTypeId_SpecifyDerivedReferrer_HReceiveHList() { return xgetSQueMap("processTypeId_SpecifyDerivedReferrer_HReceiveHList"); }
    public String keepProcessTypeId_SpecifyDerivedReferrer_HReceiveHList(HReceiveHCQ sq) { return xkeepSQue("processTypeId_SpecifyDerivedReferrer_HReceiveHList", sq); }

    public Map<String, HShippingHCQ> xdfgetProcessTypeId_SpecifyDerivedReferrer_HShippingHList() { return xgetSQueMap("processTypeId_SpecifyDerivedReferrer_HShippingHList"); }
    public String keepProcessTypeId_SpecifyDerivedReferrer_HShippingHList(HShippingHCQ sq) { return xkeepSQue("processTypeId_SpecifyDerivedReferrer_HShippingHList", sq); }

    public Map<String, HStockInoutCQ> xdfgetProcessTypeId_SpecifyDerivedReferrer_HStockInoutList() { return xgetSQueMap("processTypeId_SpecifyDerivedReferrer_HStockInoutList"); }
    public String keepProcessTypeId_SpecifyDerivedReferrer_HStockInoutList(HStockInoutCQ sq) { return xkeepSQue("processTypeId_SpecifyDerivedReferrer_HStockInoutList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetProcessTypeId_SpecifyDerivedReferrer_TAllocInstHList() { return xgetSQueMap("processTypeId_SpecifyDerivedReferrer_TAllocInstHList"); }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("processTypeId_SpecifyDerivedReferrer_TAllocInstHList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetProcessTypeId_SpecifyDerivedReferrer_TMoveInstHList() { return xgetSQueMap("processTypeId_SpecifyDerivedReferrer_TMoveInstHList"); }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("processTypeId_SpecifyDerivedReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetProcessTypeId_SpecifyDerivedReferrer_TPackingHList() { return xgetSQueMap("processTypeId_SpecifyDerivedReferrer_TPackingHList"); }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("processTypeId_SpecifyDerivedReferrer_TPackingHList", sq); }

    public Map<String, TPickingHCQ> xdfgetProcessTypeId_SpecifyDerivedReferrer_TPickingHList() { return xgetSQueMap("processTypeId_SpecifyDerivedReferrer_TPickingHList"); }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("processTypeId_SpecifyDerivedReferrer_TPickingHList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetProcessTypeId_SpecifyDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("processTypeId_SpecifyDerivedReferrer_TReceivePlanHList"); }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("processTypeId_SpecifyDerivedReferrer_TReceivePlanHList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetProcessTypeId_SpecifyDerivedReferrer_TShippingInstHList() { return xgetSQueMap("processTypeId_SpecifyDerivedReferrer_TShippingInstHList"); }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("processTypeId_SpecifyDerivedReferrer_TShippingInstHList", sq); }

    public Map<String, TStockInoutCQ> xdfgetProcessTypeId_SpecifyDerivedReferrer_TStockInoutList() { return xgetSQueMap("processTypeId_SpecifyDerivedReferrer_TStockInoutList"); }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("processTypeId_SpecifyDerivedReferrer_TStockInoutList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetProcessTypeId_SpecifyDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("processTypeId_SpecifyDerivedReferrer_TStoreRecordHList"); }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("processTypeId_SpecifyDerivedReferrer_TStoreRecordHList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetProcessTypeId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("processTypeId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProcessTypeId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("processTypeId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, HMoveHCQ> xdfgetProcessTypeId_QueryDerivedReferrer_HMoveHList() { return xgetSQueMap("processTypeId_QueryDerivedReferrer_HMoveHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_HMoveHList(HMoveHCQ sq) { return xkeepSQue("processTypeId_QueryDerivedReferrer_HMoveHList", sq); }
    public Map<String, Object> xdfgetProcessTypeId_QueryDerivedReferrer_HMoveHListParameter() { return xgetSQuePmMap("processTypeId_QueryDerivedReferrer_HMoveHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_HMoveHListParameter(Object pm) { return xkeepSQuePm("processTypeId_QueryDerivedReferrer_HMoveHList", pm); }

    public Map<String, HReceiveHCQ> xdfgetProcessTypeId_QueryDerivedReferrer_HReceiveHList() { return xgetSQueMap("processTypeId_QueryDerivedReferrer_HReceiveHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_HReceiveHList(HReceiveHCQ sq) { return xkeepSQue("processTypeId_QueryDerivedReferrer_HReceiveHList", sq); }
    public Map<String, Object> xdfgetProcessTypeId_QueryDerivedReferrer_HReceiveHListParameter() { return xgetSQuePmMap("processTypeId_QueryDerivedReferrer_HReceiveHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_HReceiveHListParameter(Object pm) { return xkeepSQuePm("processTypeId_QueryDerivedReferrer_HReceiveHList", pm); }

    public Map<String, HShippingHCQ> xdfgetProcessTypeId_QueryDerivedReferrer_HShippingHList() { return xgetSQueMap("processTypeId_QueryDerivedReferrer_HShippingHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_HShippingHList(HShippingHCQ sq) { return xkeepSQue("processTypeId_QueryDerivedReferrer_HShippingHList", sq); }
    public Map<String, Object> xdfgetProcessTypeId_QueryDerivedReferrer_HShippingHListParameter() { return xgetSQuePmMap("processTypeId_QueryDerivedReferrer_HShippingHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_HShippingHListParameter(Object pm) { return xkeepSQuePm("processTypeId_QueryDerivedReferrer_HShippingHList", pm); }

    public Map<String, HStockInoutCQ> xdfgetProcessTypeId_QueryDerivedReferrer_HStockInoutList() { return xgetSQueMap("processTypeId_QueryDerivedReferrer_HStockInoutList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_HStockInoutList(HStockInoutCQ sq) { return xkeepSQue("processTypeId_QueryDerivedReferrer_HStockInoutList", sq); }
    public Map<String, Object> xdfgetProcessTypeId_QueryDerivedReferrer_HStockInoutListParameter() { return xgetSQuePmMap("processTypeId_QueryDerivedReferrer_HStockInoutList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_HStockInoutListParameter(Object pm) { return xkeepSQuePm("processTypeId_QueryDerivedReferrer_HStockInoutList", pm); }

    public Map<String, TAllocInstHCQ> xdfgetProcessTypeId_QueryDerivedReferrer_TAllocInstHList() { return xgetSQueMap("processTypeId_QueryDerivedReferrer_TAllocInstHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("processTypeId_QueryDerivedReferrer_TAllocInstHList", sq); }
    public Map<String, Object> xdfgetProcessTypeId_QueryDerivedReferrer_TAllocInstHListParameter() { return xgetSQuePmMap("processTypeId_QueryDerivedReferrer_TAllocInstHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TAllocInstHListParameter(Object pm) { return xkeepSQuePm("processTypeId_QueryDerivedReferrer_TAllocInstHList", pm); }

    public Map<String, TMoveInstHCQ> xdfgetProcessTypeId_QueryDerivedReferrer_TMoveInstHList() { return xgetSQueMap("processTypeId_QueryDerivedReferrer_TMoveInstHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("processTypeId_QueryDerivedReferrer_TMoveInstHList", sq); }
    public Map<String, Object> xdfgetProcessTypeId_QueryDerivedReferrer_TMoveInstHListParameter() { return xgetSQuePmMap("processTypeId_QueryDerivedReferrer_TMoveInstHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TMoveInstHListParameter(Object pm) { return xkeepSQuePm("processTypeId_QueryDerivedReferrer_TMoveInstHList", pm); }

    public Map<String, TPackingHCQ> xdfgetProcessTypeId_QueryDerivedReferrer_TPackingHList() { return xgetSQueMap("processTypeId_QueryDerivedReferrer_TPackingHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("processTypeId_QueryDerivedReferrer_TPackingHList", sq); }
    public Map<String, Object> xdfgetProcessTypeId_QueryDerivedReferrer_TPackingHListParameter() { return xgetSQuePmMap("processTypeId_QueryDerivedReferrer_TPackingHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TPackingHListParameter(Object pm) { return xkeepSQuePm("processTypeId_QueryDerivedReferrer_TPackingHList", pm); }

    public Map<String, TPickingHCQ> xdfgetProcessTypeId_QueryDerivedReferrer_TPickingHList() { return xgetSQueMap("processTypeId_QueryDerivedReferrer_TPickingHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("processTypeId_QueryDerivedReferrer_TPickingHList", sq); }
    public Map<String, Object> xdfgetProcessTypeId_QueryDerivedReferrer_TPickingHListParameter() { return xgetSQuePmMap("processTypeId_QueryDerivedReferrer_TPickingHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TPickingHListParameter(Object pm) { return xkeepSQuePm("processTypeId_QueryDerivedReferrer_TPickingHList", pm); }

    public Map<String, TReceivePlanHCQ> xdfgetProcessTypeId_QueryDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("processTypeId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("processTypeId_QueryDerivedReferrer_TReceivePlanHList", sq); }
    public Map<String, Object> xdfgetProcessTypeId_QueryDerivedReferrer_TReceivePlanHListParameter() { return xgetSQuePmMap("processTypeId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TReceivePlanHListParameter(Object pm) { return xkeepSQuePm("processTypeId_QueryDerivedReferrer_TReceivePlanHList", pm); }

    public Map<String, TShippingInstHCQ> xdfgetProcessTypeId_QueryDerivedReferrer_TShippingInstHList() { return xgetSQueMap("processTypeId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("processTypeId_QueryDerivedReferrer_TShippingInstHList", sq); }
    public Map<String, Object> xdfgetProcessTypeId_QueryDerivedReferrer_TShippingInstHListParameter() { return xgetSQuePmMap("processTypeId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TShippingInstHListParameter(Object pm) { return xkeepSQuePm("processTypeId_QueryDerivedReferrer_TShippingInstHList", pm); }

    public Map<String, TStockInoutCQ> xdfgetProcessTypeId_QueryDerivedReferrer_TStockInoutList() { return xgetSQueMap("processTypeId_QueryDerivedReferrer_TStockInoutList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("processTypeId_QueryDerivedReferrer_TStockInoutList", sq); }
    public Map<String, Object> xdfgetProcessTypeId_QueryDerivedReferrer_TStockInoutListParameter() { return xgetSQuePmMap("processTypeId_QueryDerivedReferrer_TStockInoutList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TStockInoutListParameter(Object pm) { return xkeepSQuePm("processTypeId_QueryDerivedReferrer_TStockInoutList", pm); }

    public Map<String, TStoreRecordHCQ> xdfgetProcessTypeId_QueryDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("processTypeId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("processTypeId_QueryDerivedReferrer_TStoreRecordHList", sq); }
    public Map<String, Object> xdfgetProcessTypeId_QueryDerivedReferrer_TStoreRecordHListParameter() { return xgetSQuePmMap("processTypeId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_TStoreRecordHListParameter(Object pm) { return xkeepSQuePm("processTypeId_QueryDerivedReferrer_TStoreRecordHList", pm); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetProcessTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("processTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("processTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", sq); }
    public Map<String, Object> xdfgetProcessTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter() { return xgetSQuePmMap("processTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProcessTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object pm) { return xkeepSQuePm("processTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

    protected ConditionValue _processTypeCd;
    public ConditionValue xdfgetProcessTypeCd()
    { if (_processTypeCd == null) { _processTypeCd = nCV(); }
      return _processTypeCd; }
    protected ConditionValue xgetCValueProcessTypeCd() { return xdfgetProcessTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_ProcessTypeCd_Asc() { regOBA("PROCESS_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_ProcessTypeCd_Desc() { regOBD("PROCESS_TYPE_CD"); return this; }

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
    public BsMProcessTypeCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _receiveFlg;
    public ConditionValue xdfgetReceiveFlg()
    { if (_receiveFlg == null) { _receiveFlg = nCV(); }
      return _receiveFlg; }
    protected ConditionValue xgetCValueReceiveFlg() { return xdfgetReceiveFlg(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_ReceiveFlg_Asc() { regOBA("RECEIVE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_ReceiveFlg_Desc() { regOBD("RECEIVE_FLG"); return this; }

    protected ConditionValue _shippingFlg;
    public ConditionValue xdfgetShippingFlg()
    { if (_shippingFlg == null) { _shippingFlg = nCV(); }
      return _shippingFlg; }
    protected ConditionValue xgetCValueShippingFlg() { return xdfgetShippingFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_ShippingFlg_Asc() { regOBA("SHIPPING_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_ShippingFlg_Desc() { regOBD("SHIPPING_FLG"); return this; }

    protected ConditionValue _stockAdjustFlg;
    public ConditionValue xdfgetStockAdjustFlg()
    { if (_stockAdjustFlg == null) { _stockAdjustFlg = nCV(); }
      return _stockAdjustFlg; }
    protected ConditionValue xgetCValueStockAdjustFlg() { return xdfgetStockAdjustFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_StockAdjustFlg_Asc() { regOBA("STOCK_ADJUST_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_StockAdjustFlg_Desc() { regOBD("STOCK_ADJUST_FLG"); return this; }

    protected ConditionValue _defaultFlg;
    public ConditionValue xdfgetDefaultFlg()
    { if (_defaultFlg == null) { _defaultFlg = nCV(); }
      return _defaultFlg; }
    protected ConditionValue xgetCValueDefaultFlg() { return xdfgetDefaultFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_DefaultFlg_Asc() { regOBA("DEFAULT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFAULT_FLG: {char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_DefaultFlg_Desc() { regOBD("DEFAULT_FLG"); return this; }

    protected ConditionValue _stockTypeId;
    public ConditionValue xdfgetStockTypeId()
    { if (_stockTypeId == null) { _stockTypeId = nCV(); }
      return _stockTypeId; }
    protected ConditionValue xgetCValueStockTypeId() { return xdfgetStockTypeId(); }

    public Map<String, MStockTypeCQ> getStockTypeId_InScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_InScopeRelation_MStockType"); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_InScopeRelation_MStockType", sq); }

    public Map<String, MStockTypeCQ> getStockTypeId_NotInScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_NotInScopeRelation_MStockType"); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_NotInScopeRelation_MStockType", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

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
    public BsMProcessTypeCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMProcessTypeCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMProcessTypeCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMProcessTypeCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMProcessTypeCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMProcessTypeCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMProcessTypeCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMProcessTypeCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMProcessTypeCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMProcessTypeCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMProcessTypeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMProcessTypeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MProcessTypeCQ bq = (MProcessTypeCQ)bqs;
        MProcessTypeCQ uq = (MProcessTypeCQ)uqs;
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
        if (bq.hasConditionQueryVDict()) {
            uq.xsetParameterMapVDict(bq.xdfgetParameterMapVDict());
            uq.xdfgetConditionQueryVDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVDict(), uq.xdfgetConditionQueryVDict());
        }
        if (bq.hasConditionQueryBClassDtlByReceiveFlg()) {
            uq.queryBClassDtlByReceiveFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByReceiveFlg(), uq.queryBClassDtlByReceiveFlg());
        }
        if (bq.hasConditionQueryBClassDtlByShippingFlg()) {
            uq.queryBClassDtlByShippingFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByShippingFlg(), uq.queryBClassDtlByShippingFlg());
        }
        if (bq.hasConditionQueryBClassDtlByStockAdjustFlg()) {
            uq.queryBClassDtlByStockAdjustFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStockAdjustFlg(), uq.queryBClassDtlByStockAdjustFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The instance of condition-query. (NotNull)
     */
    public MStockTypeCQ queryMStockType() {
        return xdfgetConditionQueryMStockType();
    }
    public MStockTypeCQ xdfgetConditionQueryMStockType() {
        String prop = "mStockType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMStockType()); xsetupOuterJoinMStockType(); }
        return xgetQueRlMap(prop);
    }
    protected MStockTypeCQ xcreateQueryMStockType() {
        String nrp = xresolveNRP("M_PROCESS_TYPE", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

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
        String nrp = xresolveNRP("M_PROCESS_TYPE", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vDict", nrp);
    }
    protected void xsetupOuterJoinVDict() { xregOutJo("vDict"); }
    public boolean hasConditionQueryVDict() { return xhasQueRlMap("vDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my RECEIVE_FLG, named 'BClassDtlByReceiveFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByReceiveFlg() {
        return xdfgetConditionQueryBClassDtlByReceiveFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByReceiveFlg() {
        String prop = "bClassDtlByReceiveFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByReceiveFlg()); xsetupOuterJoinBClassDtlByReceiveFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByReceiveFlg() {
        String nrp = xresolveNRP("M_PROCESS_TYPE", "bClassDtlByReceiveFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByReceiveFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByReceiveFlg() { xregOutJo("bClassDtlByReceiveFlg"); }
    public boolean hasConditionQueryBClassDtlByReceiveFlg() { return xhasQueRlMap("bClassDtlByReceiveFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SHIPPING_FLG, named 'BClassDtlByShippingFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByShippingFlg() {
        return xdfgetConditionQueryBClassDtlByShippingFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByShippingFlg() {
        String prop = "bClassDtlByShippingFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByShippingFlg()); xsetupOuterJoinBClassDtlByShippingFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByShippingFlg() {
        String nrp = xresolveNRP("M_PROCESS_TYPE", "bClassDtlByShippingFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByShippingFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByShippingFlg() { xregOutJo("bClassDtlByShippingFlg"); }
    public boolean hasConditionQueryBClassDtlByShippingFlg() { return xhasQueRlMap("bClassDtlByShippingFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStockAdjustFlg() {
        return xdfgetConditionQueryBClassDtlByStockAdjustFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStockAdjustFlg() {
        String prop = "bClassDtlByStockAdjustFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStockAdjustFlg()); xsetupOuterJoinBClassDtlByStockAdjustFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStockAdjustFlg() {
        String nrp = xresolveNRP("M_PROCESS_TYPE", "bClassDtlByStockAdjustFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStockAdjustFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStockAdjustFlg() { xregOutJo("bClassDtlByStockAdjustFlg"); }
    public boolean hasConditionQueryBClassDtlByStockAdjustFlg() { return xhasQueRlMap("bClassDtlByStockAdjustFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vDict".equalsIgnoreCase(property)) { return _parameterMapVDict; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MProcessTypeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MProcessTypeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MProcessTypeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MProcessTypeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MProcessTypeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MProcessTypeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MProcessTypeCQ> _myselfExistsMap;
    public Map<String, MProcessTypeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MProcessTypeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MProcessTypeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MProcessTypeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MProcessTypeCB.class.getName(); }
    protected String xCQ() { return MProcessTypeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
