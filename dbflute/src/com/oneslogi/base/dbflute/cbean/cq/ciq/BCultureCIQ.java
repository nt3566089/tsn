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
 * The condition-query for in-line of B_CULTURE.
 * @author DBFlute(AutoGenerator)
 */
public class BCultureCIQ extends AbstractBsBCultureCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBCultureCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BCultureCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBCultureCQ myCQ) {
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
    protected ConditionValue xgetCValueCultureId() { return _myCQ.xdfgetCultureId(); }
    public String keepCultureId_ExistsReferrer_BCultureSelfList(BCultureCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCultureId_ExistsReferrer_BCultureAttributeAsOne(BCultureAttributeCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCultureId_ExistsReferrer_BDictCultureList(BDictCultureCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCultureId_ExistsReferrer_BInfoList(BInfoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCultureId_ExistsReferrer_BMessageList(BMessageCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCultureId_ExistsReferrer_BUserList(BUserCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCultureId_ExistsReferrer_MCenterList(MCenterCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCultureId_NotExistsReferrer_BCultureSelfList(BCultureCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCultureId_NotExistsReferrer_BCultureAttributeAsOne(BCultureAttributeCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCultureId_NotExistsReferrer_BDictCultureList(BDictCultureCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCultureId_NotExistsReferrer_BInfoList(BInfoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCultureId_NotExistsReferrer_BMessageList(BMessageCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCultureId_NotExistsReferrer_BUserList(BUserCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCultureId_NotExistsReferrer_MCenterList(MCenterCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCultureId_SpecifyDerivedReferrer_BCultureSelfList(BCultureCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCultureId_SpecifyDerivedReferrer_BDictCultureList(BDictCultureCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCultureId_SpecifyDerivedReferrer_BInfoList(BInfoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCultureId_SpecifyDerivedReferrer_BMessageList(BMessageCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCultureId_SpecifyDerivedReferrer_BUserList(BUserCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCultureId_SpecifyDerivedReferrer_MCenterList(MCenterCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCultureId_QueryDerivedReferrer_BCultureSelfList(BCultureCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCultureId_QueryDerivedReferrer_BCultureSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCultureId_QueryDerivedReferrer_BDictCultureList(BDictCultureCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCultureId_QueryDerivedReferrer_BDictCultureListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCultureId_QueryDerivedReferrer_BInfoList(BInfoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCultureId_QueryDerivedReferrer_BInfoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCultureId_QueryDerivedReferrer_BMessageList(BMessageCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCultureId_QueryDerivedReferrer_BMessageListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCultureId_QueryDerivedReferrer_BUserList(BUserCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCultureId_QueryDerivedReferrer_BUserListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCultureId_QueryDerivedReferrer_MCenterList(MCenterCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCultureId_QueryDerivedReferrer_MCenterListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCultureCd() { return _myCQ.xdfgetCultureCd(); }
    protected ConditionValue xgetCValueDictId() { return _myCQ.xdfgetDictId(); }
    public String keepDictId_InScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_InScopeRelation_BDict(sq); }
    public String keepDictId_NotInScopeRelation_BDict(BDictCQ sq)
    { return _myCQ.keepDictId_NotInScopeRelation_BDict(sq); }
    protected ConditionValue xgetCValueLangCultureId() { return _myCQ.xdfgetLangCultureId(); }
    public String keepLangCultureId_InScopeRelation_BCultureSelf(BCultureCQ sq)
    { return _myCQ.keepLangCultureId_InScopeRelation_BCultureSelf(sq); }
    public String keepLangCultureId_NotInScopeRelation_BCultureSelf(BCultureCQ sq)
    { return _myCQ.keepLangCultureId_NotInScopeRelation_BCultureSelf(sq); }
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
    public String keepScalarCondition(BCultureCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BCultureCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BCultureCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BCultureCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BCultureCB.class.getName(); }
    protected String xinCQ() { return BCultureCQ.class.getName(); }
}
