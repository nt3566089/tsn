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
 * The condition-query for in-line of B_COL.
 * @author DBFlute(AutoGenerator)
 */
public class BColCIQ extends AbstractBsBColCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBColCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BColCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBColCQ myCQ) {
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
    protected ConditionValue xgetCValueColId() { return _myCQ.xdfgetColId(); }
    public String keepColId_ExistsReferrer_BColRoleList(BColRoleCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepColId_ExistsReferrer_BColValidAsOne(BColValidCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepColId_ExistsReferrer_MCenterColList(MCenterColCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepColId_ExistsReferrer_MClientColList(MClientColCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepColId_NotExistsReferrer_BColRoleList(BColRoleCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepColId_NotExistsReferrer_BColValidAsOne(BColValidCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepColId_NotExistsReferrer_MCenterColList(MCenterColCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepColId_NotExistsReferrer_MClientColList(MClientColCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepColId_SpecifyDerivedReferrer_BColRoleList(BColRoleCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepColId_SpecifyDerivedReferrer_MCenterColList(MCenterColCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepColId_SpecifyDerivedReferrer_MClientColList(MClientColCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepColId_QueryDerivedReferrer_BColRoleList(BColRoleCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepColId_QueryDerivedReferrer_BColRoleListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepColId_QueryDerivedReferrer_MCenterColList(MCenterColCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepColId_QueryDerivedReferrer_MCenterColListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepColId_QueryDerivedReferrer_MClientColList(MClientColCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepColId_QueryDerivedReferrer_MClientColListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueItemId() { return _myCQ.xdfgetItemId(); }
    public String keepItemId_InScopeRelation_BItem(BItemCQ sq)
    { return _myCQ.keepItemId_InScopeRelation_BItem(sq); }
    public String keepItemId_NotInScopeRelation_BItem(BItemCQ sq)
    { return _myCQ.keepItemId_NotInScopeRelation_BItem(sq); }
    protected ConditionValue xgetCValueColCd() { return _myCQ.xdfgetColCd(); }
    protected ConditionValue xgetCValueDictId() { return _myCQ.xdfgetDictId(); }
    public String keepDictId_InScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_InScopeRelation_BDict(sq); }
    public String keepDictId_NotInScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_NotInScopeRelation_BDict(sq); }
    protected ConditionValue xgetCValueColOrder() { return _myCQ.xdfgetColOrder(); }
    protected ConditionValue xgetCValueColType() { return _myCQ.xdfgetColType(); }
    protected ConditionValue xgetCValueVisible() { return _myCQ.xdfgetVisible(); }
    protected ConditionValue xgetCValueEditable() { return _myCQ.xdfgetEditable(); }
    protected ConditionValue xgetCValueTextAlign() { return _myCQ.xdfgetTextAlign(); }
    protected ConditionValue xgetCValueNecessary() { return _myCQ.xdfgetNecessary(); }
    protected ConditionValue xgetCValueColWidth() { return _myCQ.xdfgetColWidth(); }
    protected ConditionValue xgetCValueInColIndex() { return _myCQ.xdfgetInColIndex(); }
    protected ConditionValue xgetCValueInColDefaultValue() { return _myCQ.xdfgetInColDefaultValue(); }
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
    public String keepScalarCondition(BColCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BColCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BColCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BColCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BColCB.class.getName(); }
    protected String xinCQ() { return BColCQ.class.getName(); }
}
