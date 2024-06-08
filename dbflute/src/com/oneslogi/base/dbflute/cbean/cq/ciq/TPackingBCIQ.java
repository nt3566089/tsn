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
 * The condition-query for in-line of T_PACKING_B.
 * @author DBFlute(AutoGenerator)
 */
public class TPackingBCIQ extends AbstractBsTPackingBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTPackingBCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TPackingBCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTPackingBCQ myCQ) {
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
    protected ConditionValue xgetCValuePackingBId() { return _myCQ.xdfgetPackingBId(); }
    protected ConditionValue xgetCValuePackingHId() { return _myCQ.xdfgetPackingHId(); }
    public String keepPackingHId_InScopeRelation_TPackingH(TPackingHCQ sq)
    { return _myCQ.keepPackingHId_InScopeRelation_TPackingH(sq); }
    public String keepPackingHId_NotInScopeRelation_TPackingH(TPackingHCQ sq)
    { return _myCQ.keepPackingHId_NotInScopeRelation_TPackingH(sq); }
    protected ConditionValue xgetCValuePickingBId() { return _myCQ.xdfgetPickingBId(); }
    public String keepPickingBId_InScopeRelation_TPickingB(TPickingBCQ sq)
    { return _myCQ.keepPickingBId_InScopeRelation_TPickingB(sq); }
    public String keepPickingBId_NotInScopeRelation_TPickingB(TPickingBCQ sq)
    { return _myCQ.keepPickingBId_NotInScopeRelation_TPickingB(sq); }
    protected ConditionValue xgetCValueAllocInstBId() { return _myCQ.xdfgetAllocInstBId(); }
    public String keepAllocInstBId_InScopeRelation_TAllocInstB(TAllocInstBCQ sq)
    { return _myCQ.keepAllocInstBId_InScopeRelation_TAllocInstB(sq); }
    public String keepAllocInstBId_NotInScopeRelation_TAllocInstB(TAllocInstBCQ sq)
    { return _myCQ.keepAllocInstBId_NotInScopeRelation_TAllocInstB(sq); }
    protected ConditionValue xgetCValuePackingNum() { return _myCQ.xdfgetPackingNum(); }
    protected ConditionValue xgetCValuePickingFlg() { return _myCQ.xdfgetPickingFlg(); }
    protected ConditionValue xgetCValueInspectionFlg() { return _myCQ.xdfgetInspectionFlg(); }
    protected ConditionValue xgetCValueCasePickingNo() { return _myCQ.xdfgetCasePickingNo(); }
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
    public String keepScalarCondition(TPackingBCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TPackingBCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TPackingBCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TPackingBCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TPackingBCB.class.getName(); }
    protected String xinCQ() { return TPackingBCQ.class.getName(); }
}
