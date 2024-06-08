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
 * The condition-query for in-line of B_CLASS_DTL_SUB.
 * @author DBFlute(AutoGenerator)
 */
public class BClassDtlSubCIQ extends AbstractBsBClassDtlSubCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBClassDtlSubCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BClassDtlSubCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBClassDtlSubCQ myCQ) {
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
    protected ConditionValue xgetCValueClassDtlId() { return _myCQ.xdfgetClassDtlId(); }
    public String keepClassDtlId_InScopeRelation_BClassDtl(BClassDtlCQ sq)
    { return _myCQ.keepClassDtlId_InScopeRelation_BClassDtl(sq); }
    public String keepClassDtlId_NotInScopeRelation_BClassDtl(BClassDtlCQ sq)
    { return _myCQ.keepClassDtlId_NotInScopeRelation_BClassDtl(sq); }
    protected ConditionValue xgetCValueOthercd1() { return _myCQ.xdfgetOthercd1(); }
    protected ConditionValue xgetCValueOthercd2() { return _myCQ.xdfgetOthercd2(); }
    protected ConditionValue xgetCValueOthercd3() { return _myCQ.xdfgetOthercd3(); }
    protected ConditionValue xgetCValueOthercd4() { return _myCQ.xdfgetOthercd4(); }
    protected ConditionValue xgetCValueOthercd5() { return _myCQ.xdfgetOthercd5(); }
    protected ConditionValue xgetCValueOther1Comment() { return _myCQ.xdfgetOther1Comment(); }
    protected ConditionValue xgetCValueOther2Comment() { return _myCQ.xdfgetOther2Comment(); }
    protected ConditionValue xgetCValueOther3Comment() { return _myCQ.xdfgetOther3Comment(); }
    protected ConditionValue xgetCValueOther4Comment() { return _myCQ.xdfgetOther4Comment(); }
    protected ConditionValue xgetCValueOther5Comment() { return _myCQ.xdfgetOther5Comment(); }
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
    public String keepScalarCondition(BClassDtlSubCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BClassDtlSubCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BClassDtlSubCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BClassDtlSubCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BClassDtlSubCB.class.getName(); }
    protected String xinCQ() { return BClassDtlSubCQ.class.getName(); }
}
