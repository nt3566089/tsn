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
 * The condition-query for in-line of B_SCREEN.
 * @author DBFlute(AutoGenerator)
 */
public class BScreenCIQ extends AbstractBsBScreenCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBScreenCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BScreenCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBScreenCQ myCQ) {
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
    protected ConditionValue xgetCValueScreenId() { return _myCQ.xdfgetScreenId(); }
    public String keepScreenId_ExistsReferrer_BItemList(BItemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepScreenId_ExistsReferrer_BMenuList(BMenuCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepScreenId_ExistsReferrer_BScreenRoleList(BScreenRoleCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepScreenId_ExistsReferrer_MCenterScreenList(MCenterScreenCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepScreenId_ExistsReferrer_MClientScreenList(MClientScreenCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepScreenId_NotExistsReferrer_BItemList(BItemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepScreenId_NotExistsReferrer_BMenuList(BMenuCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepScreenId_NotExistsReferrer_BScreenRoleList(BScreenRoleCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepScreenId_NotExistsReferrer_MCenterScreenList(MCenterScreenCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepScreenId_NotExistsReferrer_MClientScreenList(MClientScreenCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepScreenId_SpecifyDerivedReferrer_BItemList(BItemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepScreenId_SpecifyDerivedReferrer_BMenuList(BMenuCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepScreenId_SpecifyDerivedReferrer_BScreenRoleList(BScreenRoleCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepScreenId_SpecifyDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepScreenId_SpecifyDerivedReferrer_MClientScreenList(MClientScreenCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepScreenId_QueryDerivedReferrer_BItemList(BItemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScreenId_QueryDerivedReferrer_BItemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScreenId_QueryDerivedReferrer_BMenuList(BMenuCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScreenId_QueryDerivedReferrer_BMenuListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScreenId_QueryDerivedReferrer_BScreenRoleList(BScreenRoleCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScreenId_QueryDerivedReferrer_BScreenRoleListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScreenId_QueryDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScreenId_QueryDerivedReferrer_MCenterScreenListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScreenId_QueryDerivedReferrer_MClientScreenList(MClientScreenCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepScreenId_QueryDerivedReferrer_MClientScreenListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueScreenCd() { return _myCQ.xdfgetScreenCd(); }
    protected ConditionValue xgetCValueDictId() { return _myCQ.xdfgetDictId(); }
    public String keepDictId_InScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_InScopeRelation_BDict(sq); }
    public String keepDictId_NotInScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_NotInScopeRelation_BDict(sq); }
    protected ConditionValue xgetCValueSystemType() { return _myCQ.xdfgetSystemType(); }
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
    public String keepScalarCondition(BScreenCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BScreenCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BScreenCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BScreenCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BScreenCB.class.getName(); }
    protected String xinCQ() { return BScreenCQ.class.getName(); }
}
