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
 * The condition-query for in-line of B_CLASS.
 * @author DBFlute(AutoGenerator)
 */
public class BClassCIQ extends AbstractBsBClassCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBClassCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BClassCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBClassCQ myCQ) {
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
    protected ConditionValue xgetCValueClassId() { return _myCQ.xdfgetClassId(); }
    public String keepClassId_ExistsReferrer_BClassDtlList(BClassDtlCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClassId_ExistsReferrer_BClassGrpList(BClassGrpCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClassId_NotExistsReferrer_BClassDtlList(BClassDtlCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClassId_NotExistsReferrer_BClassGrpList(BClassGrpCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClassId_SpecifyDerivedReferrer_BClassDtlList(BClassDtlCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClassId_SpecifyDerivedReferrer_BClassGrpList(BClassGrpCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClassId_QueryDerivedReferrer_BClassDtlList(BClassDtlCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClassId_QueryDerivedReferrer_BClassDtlListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClassId_QueryDerivedReferrer_BClassGrpList(BClassGrpCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClassId_QueryDerivedReferrer_BClassGrpListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClassCd() { return _myCQ.xdfgetClassCd(); }
    protected ConditionValue xgetCValueClassComment() { return _myCQ.xdfgetClassComment(); }
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
    public String keepScalarCondition(BClassCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BClassCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BClassCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BClassCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BClassCB.class.getName(); }
    protected String xinCQ() { return BClassCQ.class.getName(); }
}
