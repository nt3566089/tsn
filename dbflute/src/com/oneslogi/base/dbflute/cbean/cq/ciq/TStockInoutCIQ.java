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
 * The condition-query for in-line of T_STOCK_INOUT.
 * @author DBFlute(AutoGenerator)
 */
public class TStockInoutCIQ extends AbstractBsTStockInoutCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTStockInoutCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TStockInoutCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTStockInoutCQ myCQ) {
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
    protected ConditionValue xgetCValueStockInoutId() { return _myCQ.xdfgetStockInoutId(); }
    public String keepStockInoutId_ExistsReferrer_TStockInoutByBfStockInoutIdSelfList(TStockInoutCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockInoutId_ExistsReferrer_TStockInoutByFsStockInoutIdSelfList(TStockInoutCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStockInoutId_NotExistsReferrer_TStockInoutByBfStockInoutIdSelfList(TStockInoutCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockInoutId_NotExistsReferrer_TStockInoutByFsStockInoutIdSelfList(TStockInoutCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStockInoutId_SpecifyDerivedReferrer_TStockInoutByBfStockInoutIdSelfList(TStockInoutCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockInoutId_SpecifyDerivedReferrer_TStockInoutByFsStockInoutIdSelfList(TStockInoutCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfList(TStockInoutCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockInoutId_QueryDerivedReferrer_TStockInoutByBfStockInoutIdSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfList(TStockInoutCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStockInoutId_QueryDerivedReferrer_TStockInoutByFsStockInoutIdSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueFsStockInoutId() { return _myCQ.xdfgetFsStockInoutId(); }
    public String keepFsStockInoutId_InScopeRelation_TStockInoutByFsStockInoutIdSelf(TStockInoutCQ sq)
    { return _myCQ.keepFsStockInoutId_InScopeRelation_TStockInoutByFsStockInoutIdSelf(sq); }
    public String keepFsStockInoutId_NotInScopeRelation_TStockInoutByFsStockInoutIdSelf(TStockInoutCQ sq)
    { return _myCQ.keepFsStockInoutId_NotInScopeRelation_TStockInoutByFsStockInoutIdSelf(sq); }
    protected ConditionValue xgetCValueBfStockInoutId() { return _myCQ.xdfgetBfStockInoutId(); }
    public String keepBfStockInoutId_InScopeRelation_TStockInoutByBfStockInoutIdSelf(TStockInoutCQ sq)
    { return _myCQ.keepBfStockInoutId_InScopeRelation_TStockInoutByBfStockInoutIdSelf(sq); }
    public String keepBfStockInoutId_NotInScopeRelation_TStockInoutByBfStockInoutIdSelf(TStockInoutCQ sq)
    { return _myCQ.keepBfStockInoutId_NotInScopeRelation_TStockInoutByBfStockInoutIdSelf(sq); }
    protected ConditionValue xgetCValueMoveRecordBId() { return _myCQ.xdfgetMoveRecordBId(); }
    public String keepMoveRecordBId_InScopeRelation_TMoveRecordB(TMoveRecordBCQ sq)
    { return _myCQ.keepMoveRecordBId_InScopeRelation_TMoveRecordB(sq); }
    public String keepMoveRecordBId_NotInScopeRelation_TMoveRecordB(TMoveRecordBCQ sq)
    { return _myCQ.keepMoveRecordBId_NotInScopeRelation_TMoveRecordB(sq); }
    protected ConditionValue xgetCValueStoreRecordBId() { return _myCQ.xdfgetStoreRecordBId(); }
    public String keepStoreRecordBId_InScopeRelation_TStoreRecordB(TStoreRecordBCQ sq)
    { return _myCQ.keepStoreRecordBId_InScopeRelation_TStoreRecordB(sq); }
    public String keepStoreRecordBId_NotInScopeRelation_TStoreRecordB(TStoreRecordBCQ sq)
    { return _myCQ.keepStoreRecordBId_NotInScopeRelation_TStoreRecordB(sq); }
    protected ConditionValue xgetCValueAllocInstBId() { return _myCQ.xdfgetAllocInstBId(); }
    public String keepAllocInstBId_InScopeRelation_TAllocInstB(TAllocInstBCQ sq)
    { return _myCQ.keepAllocInstBId_InScopeRelation_TAllocInstB(sq); }
    public String keepAllocInstBId_NotInScopeRelation_TAllocInstB(TAllocInstBCQ sq)
    { return _myCQ.keepAllocInstBId_NotInScopeRelation_TAllocInstB(sq); }
    protected ConditionValue xgetCValueProcessDt() { return _myCQ.xdfgetProcessDt(); }
    protected ConditionValue xgetCValueProcessTypeId() { return _myCQ.xdfgetProcessTypeId(); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_InScopeRelation_MProcessType(sq); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_NotInScopeRelation_MProcessType(sq); }
    protected ConditionValue xgetCValueProcessNo() { return _myCQ.xdfgetProcessNo(); }
    protected ConditionValue xgetCValueCorrectType() { return _myCQ.xdfgetCorrectType(); }
    protected ConditionValue xgetCValueStockId() { return _myCQ.xdfgetStockId(); }
    public String keepStockId_InScopeRelation_TStock(TStockCQ sq)
    { return _myCQ.keepStockId_InScopeRelation_TStock(sq); }
    public String keepStockId_NotInScopeRelation_TStock(TStockCQ sq)
    { return _myCQ.keepStockId_NotInScopeRelation_TStock(sq); }
    protected ConditionValue xgetCValueInoutType() { return _myCQ.xdfgetInoutType(); }
    protected ConditionValue xgetCValueStockInoutNum() { return _myCQ.xdfgetStockInoutNum(); }
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
    public String keepScalarCondition(TStockInoutCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TStockInoutCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TStockInoutCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TStockInoutCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TStockInoutCB.class.getName(); }
    protected String xinCQ() { return TStockInoutCQ.class.getName(); }
}
