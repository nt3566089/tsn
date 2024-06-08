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
 * The condition-query for in-line of B_FUNC.
 * @author DBFlute(AutoGenerator)
 */
public class BFuncCIQ extends AbstractBsBFuncCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBFuncCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BFuncCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBFuncCQ myCQ) {
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
    protected ConditionValue xgetCValueFuncId() { return _myCQ.xdfgetFuncId(); }
    public String keepFuncId_ExistsReferrer_BArgList(BArgCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepFuncId_ExistsReferrer_BFuncRoleList(BFuncRoleCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepFuncId_NotExistsReferrer_BArgList(BArgCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepFuncId_NotExistsReferrer_BFuncRoleList(BFuncRoleCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepFuncId_SpecifyDerivedReferrer_BArgList(BArgCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepFuncId_SpecifyDerivedReferrer_BFuncRoleList(BFuncRoleCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepFuncId_QueryDerivedReferrer_BArgList(BArgCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepFuncId_QueryDerivedReferrer_BArgListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepFuncId_QueryDerivedReferrer_BFuncRoleList(BFuncRoleCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepFuncId_QueryDerivedReferrer_BFuncRoleListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClassCd() { return _myCQ.xdfgetClassCd(); }
    protected ConditionValue xgetCValueMethodCd() { return _myCQ.xdfgetMethodCd(); }
    protected ConditionValue xgetCValueFuncCd() { return _myCQ.xdfgetFuncCd(); }
    protected ConditionValue xgetCValueFuncNm() { return _myCQ.xdfgetFuncNm(); }
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
    public String keepScalarCondition(BFuncCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BFuncCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BFuncCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BFuncCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BFuncCB.class.getName(); }
    protected String xinCQ() { return BFuncCQ.class.getName(); }
}
