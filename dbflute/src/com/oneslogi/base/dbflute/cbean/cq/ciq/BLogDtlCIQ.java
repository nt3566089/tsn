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
 * The condition-query for in-line of B_LOG_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BLogDtlCIQ extends AbstractBsBLogDtlCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBLogDtlCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BLogDtlCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBLogDtlCQ myCQ) {
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
    protected ConditionValue xgetCValueLogDtlId() { return _myCQ.xdfgetLogDtlId(); }
    protected ConditionValue xgetCValueLogId() { return _myCQ.xdfgetLogId(); }
    public String keepLogId_InScopeRelation_BLog(BLogCQ sq)
    { return _myCQ.keepLogId_InScopeRelation_BLog(sq); }
    public String keepLogId_NotInScopeRelation_BLog(BLogCQ sq)
    { return _myCQ.keepLogId_NotInScopeRelation_BLog(sq); }
    protected ConditionValue xgetCValueLogDtlType() { return _myCQ.xdfgetLogDtlType(); }
    protected ConditionValue xgetCValueLogDtlStatus() { return _myCQ.xdfgetLogDtlStatus(); }
    protected ConditionValue xgetCValueLogDtlSectionId() { return _myCQ.xdfgetLogDtlSectionId(); }
    protected ConditionValue xgetCValueLogDtlSectionNm() { return _myCQ.xdfgetLogDtlSectionNm(); }
    protected ConditionValue xgetCValueProcessInfo() { return _myCQ.xdfgetProcessInfo(); }
    protected ConditionValue xgetCValueProcessDt() { return _myCQ.xdfgetProcessDt(); }
    protected ConditionValue xgetCValueMessageReplaceString1() { return _myCQ.xdfgetMessageReplaceString1(); }
    protected ConditionValue xgetCValueMessageReplaceString2() { return _myCQ.xdfgetMessageReplaceString2(); }
    protected ConditionValue xgetCValueMessageReplaceString3() { return _myCQ.xdfgetMessageReplaceString3(); }
    protected ConditionValue xgetCValueMessageReplaceString4() { return _myCQ.xdfgetMessageReplaceString4(); }
    protected ConditionValue xgetCValueMessageReplaceString5() { return _myCQ.xdfgetMessageReplaceString5(); }
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
    public String keepScalarCondition(BLogDtlCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BLogDtlCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BLogDtlCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BLogDtlCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BLogDtlCB.class.getName(); }
    protected String xinCQ() { return BLogDtlCQ.class.getName(); }
}
