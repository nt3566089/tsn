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
 * The condition-query for in-line of E_SHIPPING_INOUT_PLAN.
 * @author DBFlute(AutoGenerator)
 */
public class EShippingInoutPlanCIQ extends AbstractBsEShippingInoutPlanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEShippingInoutPlanCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EShippingInoutPlanCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEShippingInoutPlanCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingInoutPlanId() { return _myCQ.xdfgetShippingInoutPlanId(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendLowCd() { return _myCQ.xdfgetSendLowCd(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueSbwarehousecd() { return _myCQ.xdfgetSbwarehousecd(); }
    protected ConditionValue xgetCValueSupplierrcvno() { return _myCQ.xdfgetSupplierrcvno(); }
    protected ConditionValue xgetCValueExamkbn() { return _myCQ.xdfgetExamkbn(); }
    protected ConditionValue xgetCValueExamdate() { return _myCQ.xdfgetExamdate(); }
    protected ConditionValue xgetCValueExamend() { return _myCQ.xdfgetExamend(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueLot1() { return _myCQ.xdfgetLot1(); }
    protected ConditionValue xgetCValueBefzaikoinv() { return _myCQ.xdfgetBefzaikoinv(); }
    protected ConditionValue xgetCValueBeflot4() { return _myCQ.xdfgetBeflot4(); }
    protected ConditionValue xgetCValueBeflot3() { return _myCQ.xdfgetBeflot3(); }
    protected ConditionValue xgetCValueAftzaikoinv() { return _myCQ.xdfgetAftzaikoinv(); }
    protected ConditionValue xgetCValueAftlot4() { return _myCQ.xdfgetAftlot4(); }
    protected ConditionValue xgetCValueAftlot3() { return _myCQ.xdfgetAftlot3(); }
    protected ConditionValue xgetCValueQty() { return _myCQ.xdfgetQty(); }
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
    public String keepScalarCondition(EShippingInoutPlanCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EShippingInoutPlanCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EShippingInoutPlanCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EShippingInoutPlanCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EShippingInoutPlanCB.class.getName(); }
    protected String xinCQ() { return EShippingInoutPlanCQ.class.getName(); }
}
