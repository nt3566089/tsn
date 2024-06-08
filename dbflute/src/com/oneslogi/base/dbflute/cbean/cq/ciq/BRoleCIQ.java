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
 * The condition-query for in-line of B_ROLE.
 * @author DBFlute(AutoGenerator)
 */
public class BRoleCIQ extends AbstractBsBRoleCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBRoleCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BRoleCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBRoleCQ myCQ) {
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
    protected ConditionValue xgetCValueRoleId() { return _myCQ.xdfgetRoleId(); }
    public String keepRoleId_ExistsReferrer_BColRoleList(BColRoleCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepRoleId_ExistsReferrer_BFuncRoleList(BFuncRoleCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepRoleId_ExistsReferrer_BItemRoleList(BItemRoleCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepRoleId_ExistsReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepRoleId_ExistsReferrer_BScreenRoleList(BScreenRoleCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepRoleId_NotExistsReferrer_BColRoleList(BColRoleCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepRoleId_NotExistsReferrer_BFuncRoleList(BFuncRoleCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepRoleId_NotExistsReferrer_BItemRoleList(BItemRoleCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepRoleId_NotExistsReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepRoleId_NotExistsReferrer_BScreenRoleList(BScreenRoleCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepRoleId_SpecifyDerivedReferrer_BColRoleList(BColRoleCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepRoleId_SpecifyDerivedReferrer_BFuncRoleList(BFuncRoleCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepRoleId_SpecifyDerivedReferrer_BItemRoleList(BItemRoleCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepRoleId_SpecifyDerivedReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepRoleId_SpecifyDerivedReferrer_BScreenRoleList(BScreenRoleCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepRoleId_QueryDerivedReferrer_BColRoleList(BColRoleCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepRoleId_QueryDerivedReferrer_BColRoleListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepRoleId_QueryDerivedReferrer_BFuncRoleList(BFuncRoleCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepRoleId_QueryDerivedReferrer_BFuncRoleListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepRoleId_QueryDerivedReferrer_BItemRoleList(BItemRoleCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepRoleId_QueryDerivedReferrer_BItemRoleListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepRoleId_QueryDerivedReferrer_BRoleGrpDtlList(BRoleGrpDtlCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepRoleId_QueryDerivedReferrer_BRoleGrpDtlListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepRoleId_QueryDerivedReferrer_BScreenRoleList(BScreenRoleCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepRoleId_QueryDerivedReferrer_BScreenRoleListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueRoleCd() { return _myCQ.xdfgetRoleCd(); }
    protected ConditionValue xgetCValueDictId() { return _myCQ.xdfgetDictId(); }
    public String keepDictId_InScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_InScopeRelation_BDict(sq); }
    public String keepDictId_NotInScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_NotInScopeRelation_BDict(sq); }
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
    public String keepScalarCondition(BRoleCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BRoleCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BRoleCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BRoleCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BRoleCB.class.getName(); }
    protected String xinCQ() { return BRoleCQ.class.getName(); }
}
