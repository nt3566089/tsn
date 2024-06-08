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
 * The condition-query for in-line of E_RETURNED_EXCHANGE.
 * @author DBFlute(AutoGenerator)
 */
public class EReturnedExchangeCIQ extends AbstractBsEReturnedExchangeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEReturnedExchangeCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EReturnedExchangeCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEReturnedExchangeCQ myCQ) {
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
    protected ConditionValue xgetCValueReturnedExchangeId() { return _myCQ.xdfgetReturnedExchangeId(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendRowId() { return _myCQ.xdfgetSendRowId(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueRcvtype() { return _myCQ.xdfgetRcvtype(); }
    protected ConditionValue xgetCValueSyhnKbn() { return _myCQ.xdfgetSyhnKbn(); }
    protected ConditionValue xgetCValueRecordType() { return _myCQ.xdfgetRecordType(); }
    protected ConditionValue xgetCValueSupplierrcvno() { return _myCQ.xdfgetSupplierrcvno(); }
    protected ConditionValue xgetCValueSeqno() { return _myCQ.xdfgetSeqno(); }
    protected ConditionValue xgetCValueWorkType() { return _myCQ.xdfgetWorkType(); }
    protected ConditionValue xgetCValueOtherrefno1() { return _myCQ.xdfgetOtherrefno1(); }
    protected ConditionValue xgetCValueRmano() { return _myCQ.xdfgetRmano(); }
    protected ConditionValue xgetCValueOtherrefno3() { return _myCQ.xdfgetOtherrefno3(); }
    protected ConditionValue xgetCValueSuppliercd() { return _myCQ.xdfgetSuppliercd(); }
    protected ConditionValue xgetCValueFromaddress2() { return _myCQ.xdfgetFromaddress2(); }
    protected ConditionValue xgetCValueFromaddress1() { return _myCQ.xdfgetFromaddress1(); }
    protected ConditionValue xgetCValueIfitemcd() { return _myCQ.xdfgetIfitemcd(); }
    protected ConditionValue xgetCValueReceivedqty1() { return _myCQ.xdfgetReceivedqty1(); }
    protected ConditionValue xgetCValuePriceWholesale() { return _myCQ.xdfgetPriceWholesale(); }
    protected ConditionValue xgetCValueLot2() { return _myCQ.xdfgetLot2(); }
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
    public String keepScalarCondition(EReturnedExchangeCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EReturnedExchangeCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EReturnedExchangeCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EReturnedExchangeCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EReturnedExchangeCB.class.getName(); }
    protected String xinCQ() { return EReturnedExchangeCQ.class.getName(); }
}
