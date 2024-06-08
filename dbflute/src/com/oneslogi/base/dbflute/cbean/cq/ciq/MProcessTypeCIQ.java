package com.oneslogi.base.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.bs.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of M_PROCESS_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class MProcessTypeCIQ extends AbstractBsMProcessTypeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMProcessTypeCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MProcessTypeCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMProcessTypeCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueProcessTypeId() { return _myCQ.xdfgetProcessTypeId(); }
    public String keepProcessTypeId_ExistsReferrer_HMoveHList(HMoveHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProcessTypeId_ExistsReferrer_HReceiveHList(HReceiveHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProcessTypeId_ExistsReferrer_HShippingHList(HShippingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProcessTypeId_ExistsReferrer_HStockInoutList(HStockInoutCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProcessTypeId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProcessTypeId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProcessTypeId_ExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProcessTypeId_ExistsReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProcessTypeId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProcessTypeId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProcessTypeId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProcessTypeId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProcessTypeId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProcessTypeId_NotExistsReferrer_HMoveHList(HMoveHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProcessTypeId_NotExistsReferrer_HReceiveHList(HReceiveHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProcessTypeId_NotExistsReferrer_HShippingHList(HShippingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProcessTypeId_NotExistsReferrer_HStockInoutList(HStockInoutCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProcessTypeId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProcessTypeId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProcessTypeId_NotExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProcessTypeId_NotExistsReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProcessTypeId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProcessTypeId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProcessTypeId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProcessTypeId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProcessTypeId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProcessTypeId_SpecifyDerivedReferrer_HMoveHList(HMoveHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProcessTypeId_SpecifyDerivedReferrer_HReceiveHList(HReceiveHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProcessTypeId_SpecifyDerivedReferrer_HShippingHList(HShippingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProcessTypeId_SpecifyDerivedReferrer_HStockInoutList(HStockInoutCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProcessTypeId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProcessTypeId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_HMoveHList(HMoveHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_HMoveHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_HReceiveHList(HReceiveHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_HReceiveHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_HShippingHList(HShippingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_HShippingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_HStockInoutList(HStockInoutCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_HStockInoutListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TAllocInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TMoveInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TPackingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TPickingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TReceivePlanHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TShippingInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TStockInoutListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_TStoreRecordHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProcessTypeId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueProcessTypeCd() { return _myCQ.xdfgetProcessTypeCd(); }
    protected ConditionValue xgetCValueDictId() { return _myCQ.xdfgetDictId(); }
    public String keepDictId_InScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_InScopeRelation_BDict(sq); }
    public String keepDictId_NotInScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_NotInScopeRelation_BDict(sq); }
    protected ConditionValue xgetCValueReceiveFlg() { return _myCQ.xdfgetReceiveFlg(); }
    protected ConditionValue xgetCValueShippingFlg() { return _myCQ.xdfgetShippingFlg(); }
    protected ConditionValue xgetCValueStockAdjustFlg() { return _myCQ.xdfgetStockAdjustFlg(); }
    protected ConditionValue xgetCValueDefaultFlg() { return _myCQ.xdfgetDefaultFlg(); }
    protected ConditionValue xgetCValueStockTypeId() { return _myCQ.xdfgetStockTypeId(); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_InScopeRelation_MStockType(sq); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_NotInScopeRelation_MStockType(sq); }
    protected ConditionValue xgetCValueDelFlg() { return _myCQ.xdfgetDelFlg(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected ConditionValue xgetCValueControlNo() { return _myCQ.xdfgetControlNo(); }
    protected ConditionValue xgetCValueAddDt() { return _myCQ.xdfgetAddDt(); }
    protected ConditionValue xgetCValueAddUser() { return _myCQ.xdfgetAddUser(); }
    protected ConditionValue xgetCValueAddProcess() { return _myCQ.xdfgetAddProcess(); }
    protected ConditionValue xgetCValueUpdDt() { return _myCQ.xdfgetUpdDt(); }
    protected ConditionValue xgetCValueUpdUser() { return _myCQ.xdfgetUpdUser(); }
    protected ConditionValue xgetCValueUpdProcess() { return _myCQ.xdfgetUpdProcess(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MProcessTypeCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MProcessTypeCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MProcessTypeCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MProcessTypeCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MProcessTypeCB.class.getName(); }
    protected String xinCQ() { return MProcessTypeCQ.class.getName(); }
}
