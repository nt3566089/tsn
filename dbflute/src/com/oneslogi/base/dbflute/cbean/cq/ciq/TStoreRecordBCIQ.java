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
 * The condition-query for in-line of T_STORE_RECORD_B.
 * @author DBFlute(AutoGenerator)
 */
public class TStoreRecordBCIQ extends AbstractBsTStoreRecordBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTStoreRecordBCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TStoreRecordBCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTStoreRecordBCQ myCQ) {
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
    protected ConditionValue xgetCValueStoreRecordBId() { return _myCQ.xdfgetStoreRecordBId(); }
    public String keepStoreRecordBId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStoreRecordBId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStoreRecordBId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStoreRecordBId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStoreRecordBId_QueryDerivedReferrer_TStockInoutListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueStoreRecordHId() { return _myCQ.xdfgetStoreRecordHId(); }
    public String keepStoreRecordHId_InScopeRelation_TStoreRecordH(TStoreRecordHCQ sq)
    { return _myCQ.keepStoreRecordHId_InScopeRelation_TStoreRecordH(sq); }
    public String keepStoreRecordHId_NotInScopeRelation_TStoreRecordH(TStoreRecordHCQ sq)
    { return _myCQ.keepStoreRecordHId_NotInScopeRelation_TStoreRecordH(sq); }
    protected ConditionValue xgetCValueReceivePlanBId() { return _myCQ.xdfgetReceivePlanBId(); }
    public String keepReceivePlanBId_InScopeRelation_TReceivePlanB(TReceivePlanBCQ sq)
    { return _myCQ.keepReceivePlanBId_InScopeRelation_TReceivePlanB(sq); }
    public String keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(TReceivePlanBCQ sq)
    { return _myCQ.keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(sq); }
    protected ConditionValue xgetCValueProcessNo() { return _myCQ.xdfgetProcessNo(); }
    protected ConditionValue xgetCValueClientOrderNo() { return _myCQ.xdfgetClientOrderNo(); }
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueLimitDt() { return _myCQ.xdfgetLimitDt(); }
    protected ConditionValue xgetCValueStoreDt() { return _myCQ.xdfgetStoreDt(); }
    protected ConditionValue xgetCValueStoreNum() { return _myCQ.xdfgetStoreNum(); }
    protected ConditionValue xgetCValueStoreFlg() { return _myCQ.xdfgetStoreFlg(); }
    protected ConditionValue xgetCValueStoreLocationId() { return _myCQ.xdfgetStoreLocationId(); }
    public String keepStoreLocationId_InScopeRelation_MLocation(MLocationCQ sq)
    { return _myCQ.keepStoreLocationId_InScopeRelation_MLocation(sq); }
    public String keepStoreLocationId_NotInScopeRelation_MLocation(MLocationCQ sq)
    { return _myCQ.keepStoreLocationId_NotInScopeRelation_MLocation(sq); }
    protected ConditionValue xgetCValueInputType() { return _myCQ.xdfgetInputType(); }
    protected ConditionValue xgetCValueHtStoreInspectionDt() { return _myCQ.xdfgetHtStoreInspectionDt(); }
    protected ConditionValue xgetCValueHtStoreInspectionUserId() { return _myCQ.xdfgetHtStoreInspectionUserId(); }
    protected ConditionValue xgetCValueStoreRecordBComment() { return _myCQ.xdfgetStoreRecordBComment(); }
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
    public String keepScalarCondition(TStoreRecordBCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TStoreRecordBCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TStoreRecordBCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TStoreRecordBCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TStoreRecordBCB.class.getName(); }
    protected String xinCQ() { return TStoreRecordBCQ.class.getName(); }
}
