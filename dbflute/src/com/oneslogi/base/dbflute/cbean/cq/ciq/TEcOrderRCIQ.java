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
 * The condition-query for in-line of T_EC_ORDER_R.
 * @author DBFlute(AutoGenerator)
 */
public class TEcOrderRCIQ extends AbstractBsTEcOrderRCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTEcOrderRCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TEcOrderRCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTEcOrderRCQ myCQ) {
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
    protected ConditionValue xgetCValueEcOrderHId() { return _myCQ.xdfgetEcOrderHId(); }
    public String keepEcOrderHId_InScopeRelation_TEcOrderH(TEcOrderHCQ sq)
    { return _myCQ.keepEcOrderHId_InScopeRelation_TEcOrderH(sq); }
    public String keepEcOrderHId_NotInScopeRelation_TEcOrderH(TEcOrderHCQ sq)
    { return _myCQ.keepEcOrderHId_NotInScopeRelation_TEcOrderH(sq); }
    protected ConditionValue xgetCValueStatementOutFlg() { return _myCQ.xdfgetStatementOutFlg(); }
    protected ConditionValue xgetCValueStatementOutUserId() { return _myCQ.xdfgetStatementOutUserId(); }
    public String keepStatementOutUserId_InScopeRelation_BUser(BUserCQ sq)
    { return _myCQ.keepStatementOutUserId_InScopeRelation_BUser(sq); }
    public String keepStatementOutUserId_NotInScopeRelation_BUser(BUserCQ sq)
    { return _myCQ.keepStatementOutUserId_NotInScopeRelation_BUser(sq); }
    protected ConditionValue xgetCValueStatementOutDt() { return _myCQ.xdfgetStatementOutDt(); }
    protected ConditionValue xgetCValueInvoiceCreateFlg() { return _myCQ.xdfgetInvoiceCreateFlg(); }
    protected ConditionValue xgetCValueInvoiceCreateDt() { return _myCQ.xdfgetInvoiceCreateDt(); }
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
    public String keepScalarCondition(TEcOrderRCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TEcOrderRCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TEcOrderRCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TEcOrderRCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TEcOrderRCB.class.getName(); }
    protected String xinCQ() { return TEcOrderRCQ.class.getName(); }
}
