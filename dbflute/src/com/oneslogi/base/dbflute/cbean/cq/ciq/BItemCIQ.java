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
 * The condition-query for in-line of B_ITEM.
 * @author DBFlute(AutoGenerator)
 */
public class BItemCIQ extends AbstractBsBItemCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBItemCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BItemCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBItemCQ myCQ) {
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
    protected ConditionValue xgetCValueItemId() { return _myCQ.xdfgetItemId(); }
    public String keepItemId_ExistsReferrer_BColList(BColCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepItemId_ExistsReferrer_BColExtBaseList(BColExtBaseCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepItemId_ExistsReferrer_BColExtUserList(BColExtUserCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepItemId_ExistsReferrer_BItemRoleList(BItemRoleCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepItemId_ExistsReferrer_BItemValidAsOne(BItemValidCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepItemId_ExistsReferrer_MCenterItemList(MCenterItemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepItemId_ExistsReferrer_MClientItemList(MClientItemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepItemId_NotExistsReferrer_BColList(BColCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepItemId_NotExistsReferrer_BColExtBaseList(BColExtBaseCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepItemId_NotExistsReferrer_BColExtUserList(BColExtUserCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepItemId_NotExistsReferrer_BItemRoleList(BItemRoleCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepItemId_NotExistsReferrer_BItemValidAsOne(BItemValidCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepItemId_NotExistsReferrer_MCenterItemList(MCenterItemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepItemId_NotExistsReferrer_MClientItemList(MClientItemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepItemId_SpecifyDerivedReferrer_BColList(BColCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepItemId_SpecifyDerivedReferrer_BColExtBaseList(BColExtBaseCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepItemId_SpecifyDerivedReferrer_BColExtUserList(BColExtUserCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepItemId_SpecifyDerivedReferrer_BItemRoleList(BItemRoleCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepItemId_SpecifyDerivedReferrer_MCenterItemList(MCenterItemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepItemId_SpecifyDerivedReferrer_MClientItemList(MClientItemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepItemId_QueryDerivedReferrer_BColList(BColCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepItemId_QueryDerivedReferrer_BColListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepItemId_QueryDerivedReferrer_BColExtBaseList(BColExtBaseCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepItemId_QueryDerivedReferrer_BColExtBaseListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepItemId_QueryDerivedReferrer_BColExtUserList(BColExtUserCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepItemId_QueryDerivedReferrer_BColExtUserListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepItemId_QueryDerivedReferrer_BItemRoleList(BItemRoleCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepItemId_QueryDerivedReferrer_BItemRoleListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepItemId_QueryDerivedReferrer_MCenterItemList(MCenterItemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepItemId_QueryDerivedReferrer_MCenterItemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepItemId_QueryDerivedReferrer_MClientItemList(MClientItemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepItemId_QueryDerivedReferrer_MClientItemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueScreenId() { return _myCQ.xdfgetScreenId(); }
    public String keepScreenId_InScopeRelation_BScreen(BScreenCQ sq)
    { return _myCQ.keepScreenId_InScopeRelation_BScreen(sq); }
    public String keepScreenId_NotInScopeRelation_BScreen(BScreenCQ sq)
    { return _myCQ.keepScreenId_NotInScopeRelation_BScreen(sq); }
    protected ConditionValue xgetCValueItemCd() { return _myCQ.xdfgetItemCd(); }
    protected ConditionValue xgetCValueDictId() { return _myCQ.xdfgetDictId(); }
    public String keepDictId_InScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_InScopeRelation_BDict(sq); }
    public String keepDictId_NotInScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_NotInScopeRelation_BDict(sq); }
    protected ConditionValue xgetCValueItemType() { return _myCQ.xdfgetItemType(); }
    protected ConditionValue xgetCValueVisible() { return _myCQ.xdfgetVisible(); }
    protected ConditionValue xgetCValueEditable() { return _myCQ.xdfgetEditable(); }
    protected ConditionValue xgetCValueTextAlign() { return _myCQ.xdfgetTextAlign(); }
    protected ConditionValue xgetCValueNecessary() { return _myCQ.xdfgetNecessary(); }
    protected ConditionValue xgetCValueDisplayRequired() { return _myCQ.xdfgetDisplayRequired(); }
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
    public String keepScalarCondition(BItemCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BItemCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BItemCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BItemCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BItemCB.class.getName(); }
    protected String xinCQ() { return BItemCQ.class.getName(); }
}
