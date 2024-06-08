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
 * The condition-query for in-line of B_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class BLogCIQ extends AbstractBsBLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBLogCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BLogCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBLogCQ myCQ) {
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
    protected ConditionValue xgetCValueLogId() { return _myCQ.xdfgetLogId(); }
    public String keepLogId_ExistsReferrer_BLogDtlList(BLogDtlCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLogId_NotExistsReferrer_BLogDtlList(BLogDtlCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLogId_SpecifyDerivedReferrer_BLogDtlList(BLogDtlCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLogId_QueryDerivedReferrer_BLogDtlList(BLogDtlCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLogId_QueryDerivedReferrer_BLogDtlListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueLogStatus() { return _myCQ.xdfgetLogStatus(); }
    protected ConditionValue xgetCValueLogGroupCd() { return _myCQ.xdfgetLogGroupCd(); }
    protected ConditionValue xgetCValueLogGroupNm() { return _myCQ.xdfgetLogGroupNm(); }
    protected ConditionValue xgetCValueLogGroupProcessId() { return _myCQ.xdfgetLogGroupProcessId(); }
    protected ConditionValue xgetCValuePgmCd() { return _myCQ.xdfgetPgmCd(); }
    protected ConditionValue xgetCValuePgmNm() { return _myCQ.xdfgetPgmNm(); }
    protected ConditionValue xgetCValueProcessStartDt() { return _myCQ.xdfgetProcessStartDt(); }
    protected ConditionValue xgetCValueProcessEndDt() { return _myCQ.xdfgetProcessEndDt(); }
    protected ConditionValue xgetCValueAttribute1() { return _myCQ.xdfgetAttribute1(); }
    protected ConditionValue xgetCValueAttribute2() { return _myCQ.xdfgetAttribute2(); }
    protected ConditionValue xgetCValueAttribute3() { return _myCQ.xdfgetAttribute3(); }
    protected ConditionValue xgetCValueAttribute4() { return _myCQ.xdfgetAttribute4(); }
    protected ConditionValue xgetCValueAttribute5() { return _myCQ.xdfgetAttribute5(); }
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
    public String keepScalarCondition(BLogCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BLogCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BLogCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BLogCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BLogCB.class.getName(); }
    protected String xinCQ() { return BLogCQ.class.getName(); }
}
