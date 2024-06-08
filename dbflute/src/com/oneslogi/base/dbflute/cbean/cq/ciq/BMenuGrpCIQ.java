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
 * The condition-query for in-line of B_MENU_GRP.
 * @author DBFlute(AutoGenerator)
 */
public class BMenuGrpCIQ extends AbstractBsBMenuGrpCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBMenuGrpCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BMenuGrpCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBMenuGrpCQ myCQ) {
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
    protected ConditionValue xgetCValueMenuGrpId() { return _myCQ.xdfgetMenuGrpId(); }
    public String keepMenuGrpId_ExistsReferrer_BMenuList(BMenuCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMenuGrpId_ExistsReferrer_BMenuGrpSelfList(BMenuGrpCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMenuGrpId_NotExistsReferrer_BMenuList(BMenuCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMenuGrpId_NotExistsReferrer_BMenuGrpSelfList(BMenuGrpCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMenuGrpId_SpecifyDerivedReferrer_BMenuList(BMenuCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMenuGrpId_SpecifyDerivedReferrer_BMenuGrpSelfList(BMenuGrpCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMenuGrpId_QueryDerivedReferrer_BMenuList(BMenuCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMenuGrpId_QueryDerivedReferrer_BMenuListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMenuGrpId_QueryDerivedReferrer_BMenuGrpSelfList(BMenuGrpCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMenuGrpId_QueryDerivedReferrer_BMenuGrpSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueMenuGrpCd() { return _myCQ.xdfgetMenuGrpCd(); }
    protected ConditionValue xgetCValueDictId() { return _myCQ.xdfgetDictId(); }
    public String keepDictId_InScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_InScopeRelation_BDict(sq); }
    public String keepDictId_NotInScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_NotInScopeRelation_BDict(sq); }
    protected ConditionValue xgetCValueParentMenuGrpId() { return _myCQ.xdfgetParentMenuGrpId(); }
    public String keepParentMenuGrpId_InScopeRelation_BMenuGrpSelf(BMenuGrpCQ sq)
    { return _myCQ.keepParentMenuGrpId_InScopeRelation_BMenuGrpSelf(sq); }
    public String keepParentMenuGrpId_NotInScopeRelation_BMenuGrpSelf(BMenuGrpCQ sq)
    { return _myCQ.keepParentMenuGrpId_NotInScopeRelation_BMenuGrpSelf(sq); }
    protected ConditionValue xgetCValueViewOrder() { return _myCQ.xdfgetViewOrder(); }
    protected ConditionValue xgetCValueVisibleType() { return _myCQ.xdfgetVisibleType(); }
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
    public String keepScalarCondition(BMenuGrpCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BMenuGrpCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BMenuGrpCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BMenuGrpCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BMenuGrpCB.class.getName(); }
    protected String xinCQ() { return BMenuGrpCQ.class.getName(); }
}
