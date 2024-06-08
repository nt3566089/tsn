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
 * The condition-query for in-line of T_TRALLINV.
 * @author DBFlute(AutoGenerator)
 */
public class TTrallinvCIQ extends AbstractBsTTrallinvCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrallinvCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrallinvCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrallinvCQ myCQ) {
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
    protected ConditionValue xgetCValueTrallinvId() { return _myCQ.xdfgetTrallinvId(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueExecutedate() { return _myCQ.xdfgetExecutedate(); }
    protected ConditionValue xgetCValueInoutkbn() { return _myCQ.xdfgetInoutkbn(); }
    protected ConditionValue xgetCValueSysinvtotalinv() { return _myCQ.xdfgetSysinvtotalinv(); }
    protected ConditionValue xgetCValueSysinvkeeplocinv() { return _myCQ.xdfgetSysinvkeeplocinv(); }
    protected ConditionValue xgetCValueSysinvreceivelocinv() { return _myCQ.xdfgetSysinvreceivelocinv(); }
    protected ConditionValue xgetCValueSysinvdamageitem() { return _myCQ.xdfgetSysinvdamageitem(); }
    protected ConditionValue xgetCValueSysinvclssifylocinv() { return _myCQ.xdfgetSysinvclssifylocinv(); }
    protected ConditionValue xgetCValueSysinvtmplocinv() { return _myCQ.xdfgetSysinvtmplocinv(); }
    protected ConditionValue xgetCValueSysinvautoinv() { return _myCQ.xdfgetSysinvautoinv(); }
    protected ConditionValue xgetCValueInvesttotalinv() { return _myCQ.xdfgetInvesttotalinv(); }
    protected ConditionValue xgetCValueInvestkeeplocinv() { return _myCQ.xdfgetInvestkeeplocinv(); }
    protected ConditionValue xgetCValueInvestreceivelocinv() { return _myCQ.xdfgetInvestreceivelocinv(); }
    protected ConditionValue xgetCValueInvestdamageitem() { return _myCQ.xdfgetInvestdamageitem(); }
    protected ConditionValue xgetCValueInvestclssifylocinv() { return _myCQ.xdfgetInvestclssifylocinv(); }
    protected ConditionValue xgetCValueInvesttmplocinv() { return _myCQ.xdfgetInvesttmplocinv(); }
    protected ConditionValue xgetCValueInvestautoinv() { return _myCQ.xdfgetInvestautoinv(); }
    protected ConditionValue xgetCValueYdaytlequlytotalinv() { return _myCQ.xdfgetYdaytlequlytotalinv(); }
    protected ConditionValue xgetCValueYdaytlequlykeeplocinv() { return _myCQ.xdfgetYdaytlequlykeeplocinv(); }
    protected ConditionValue xgetCValueYdaytlequlyreceivelocinv() { return _myCQ.xdfgetYdaytlequlyreceivelocinv(); }
    protected ConditionValue xgetCValueYdaytlequlydamageitem() { return _myCQ.xdfgetYdaytlequlydamageitem(); }
    protected ConditionValue xgetCValueYdaytlequlyclssifylocinv() { return _myCQ.xdfgetYdaytlequlyclssifylocinv(); }
    protected ConditionValue xgetCValueYdaytlequlytmplocinv() { return _myCQ.xdfgetYdaytlequlytmplocinv(); }
    protected ConditionValue xgetCValueYdaytlequlyautoinv() { return _myCQ.xdfgetYdaytlequlyautoinv(); }
    protected ConditionValue xgetCValueTdayeqytotalinv() { return _myCQ.xdfgetTdayeqytotalinv(); }
    protected ConditionValue xgetCValueTdayeqykeeplocinv() { return _myCQ.xdfgetTdayeqykeeplocinv(); }
    protected ConditionValue xgetCValueTdayeqyreceivelocinv() { return _myCQ.xdfgetTdayeqyreceivelocinv(); }
    protected ConditionValue xgetCValueTdayeqydamageitem() { return _myCQ.xdfgetTdayeqydamageitem(); }
    protected ConditionValue xgetCValueTdayeqyclssifylocinv() { return _myCQ.xdfgetTdayeqyclssifylocinv(); }
    protected ConditionValue xgetCValueTdayeqytmplocinv() { return _myCQ.xdfgetTdayeqytmplocinv(); }
    protected ConditionValue xgetCValueTdayeqyautoinv() { return _myCQ.xdfgetTdayeqyautoinv(); }
    protected ConditionValue xgetCValueCapitemflg() { return _myCQ.xdfgetCapitemflg(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
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
    public String keepScalarCondition(TTrallinvCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrallinvCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrallinvCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrallinvCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrallinvCB.class.getName(); }
    protected String xinCQ() { return TTrallinvCQ.class.getName(); }
}
