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
 * The condition-query for in-line of B_ARG.
 * @author DBFlute(AutoGenerator)
 */
public class BArgCIQ extends AbstractBsBArgCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBArgCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BArgCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBArgCQ myCQ) {
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
    protected ConditionValue xgetCValueArgId() { return _myCQ.xdfgetArgId(); }
    public String keepArgId_ExistsReferrer_BArgValidAsOne(BArgValidCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepArgId_NotExistsReferrer_BArgValidAsOne(BArgValidCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    protected ConditionValue xgetCValueFuncId() { return _myCQ.xdfgetFuncId(); }
    public String keepFuncId_InScopeRelation_BFunc(BFuncCQ sq)
    { return _myCQ.keepFuncId_InScopeRelation_BFunc(sq); }
    public String keepFuncId_NotInScopeRelation_BFunc(BFuncCQ sq)
    { return _myCQ.keepFuncId_NotInScopeRelation_BFunc(sq); }
    protected ConditionValue xgetCValueArgCd() { return _myCQ.xdfgetArgCd(); }
    protected ConditionValue xgetCValueDictId() { return _myCQ.xdfgetDictId(); }
    public String keepDictId_InScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_InScopeRelation_BDict(sq); }
    public String keepDictId_NotInScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_NotInScopeRelation_BDict(sq); }
    protected ConditionValue xgetCValueArgType() { return _myCQ.xdfgetArgType(); }
    protected ConditionValue xgetCValueNecessary() { return _myCQ.xdfgetNecessary(); }
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
    public String keepScalarCondition(BArgCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BArgCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BArgCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BArgCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BArgCB.class.getName(); }
    protected String xinCQ() { return BArgCQ.class.getName(); }
}
