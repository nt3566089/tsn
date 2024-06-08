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
 * The condition-query for in-line of T_TRIMALLOCADJUST.
 * @author DBFlute(AutoGenerator)
 */
public class TTrimallocadjustCIQ extends AbstractBsTTrimallocadjustCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrimallocadjustCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrimallocadjustCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrimallocadjustCQ myCQ) {
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
    protected ConditionValue xgetCValueTrimallocadjustId() { return _myCQ.xdfgetTrimallocadjustId(); }
    protected ConditionValue xgetCValueTrimallocstockId() { return _myCQ.xdfgetTrimallocstockId(); }
    public String keepTrimallocstockId_InScopeRelation_TTrimallocstock(TTrimallocstockCQ sq)
    { return _myCQ.keepTrimallocstockId_InScopeRelation_TTrimallocstock(sq); }
    public String keepTrimallocstockId_NotInScopeRelation_TTrimallocstock(TTrimallocstockCQ sq)
    { return _myCQ.keepTrimallocstockId_NotInScopeRelation_TTrimallocstock(sq); }
    protected ConditionValue xgetCValueTrimallocschId() { return _myCQ.xdfgetTrimallocschId(); }
    public String keepTrimallocschId_InScopeRelation_TTrimallocschkri(TTrimallocschkriCQ sq)
    { return _myCQ.keepTrimallocschId_InScopeRelation_TTrimallocschkri(sq); }
    public String keepTrimallocschId_NotInScopeRelation_TTrimallocschkri(TTrimallocschkriCQ sq)
    { return _myCQ.keepTrimallocschId_NotInScopeRelation_TTrimallocschkri(sq); }
    protected ConditionValue xgetCValueAllocImpKey() { return _myCQ.xdfgetAllocImpKey(); }
    protected ConditionValue xgetCValueAlcImpResgNo() { return _myCQ.xdfgetAlcImpResgNo(); }
    protected ConditionValue xgetCValueAlcImpStkgNo() { return _myCQ.xdfgetAlcImpStkgNo(); }
    protected ConditionValue xgetCValueAdjustedQty() { return _myCQ.xdfgetAdjustedQty(); }
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
    public String keepScalarCondition(TTrimallocadjustCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrimallocadjustCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrimallocadjustCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrimallocadjustCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrimallocadjustCB.class.getName(); }
    protected String xinCQ() { return TTrimallocadjustCQ.class.getName(); }
}
