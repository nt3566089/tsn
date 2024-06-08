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
 * The condition-query for in-line of T_TRLEAVERESULT.
 * @author DBFlute(AutoGenerator)
 */
public class TTrleaveresultCIQ extends AbstractBsTTrleaveresultCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrleaveresultCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrleaveresultCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrleaveresultCQ myCQ) {
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
    protected ConditionValue xgetCValueTrleaveresultId() { return _myCQ.xdfgetTrleaveresultId(); }
    protected ConditionValue xgetCValueLeaveresultkey() { return _myCQ.xdfgetLeaveresultkey(); }
    protected ConditionValue xgetCValueRefno() { return _myCQ.xdfgetRefno(); }
    protected ConditionValue xgetCValueTaxpalletno() { return _myCQ.xdfgetTaxpalletno(); }
    protected ConditionValue xgetCValueFactorycd() { return _myCQ.xdfgetFactorycd(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueMachineno() { return _myCQ.xdfgetMachineno(); }
    protected ConditionValue xgetCValueCreateno() { return _myCQ.xdfgetCreateno(); }
    protected ConditionValue xgetCValueRcvkey() { return _myCQ.xdfgetRcvkey(); }
    protected ConditionValue xgetCValueCaseflg() { return _myCQ.xdfgetCaseflg(); }
    protected ConditionValue xgetCValueFirmcarryno() { return _myCQ.xdfgetFirmcarryno(); }
    protected ConditionValue xgetCValueLimitdate() { return _myCQ.xdfgetLimitdate(); }
    protected ConditionValue xgetCValueDesigncd() { return _myCQ.xdfgetDesigncd(); }
    protected ConditionValue xgetCValueBatjmfym() { return _myCQ.xdfgetBatjmfym(); }
    protected ConditionValue xgetCValueQty() { return _myCQ.xdfgetQty(); }
    protected ConditionValue xgetCValueLastitemcd() { return _myCQ.xdfgetLastitemcd(); }
    protected ConditionValue xgetCValueLastdesigncd() { return _myCQ.xdfgetLastdesigncd(); }
    protected ConditionValue xgetCValueShipcd() { return _myCQ.xdfgetShipcd(); }
    protected ConditionValue xgetCValueCarryoutdate() { return _myCQ.xdfgetCarryoutdate(); }
    protected ConditionValue xgetCValueShiptocd() { return _myCQ.xdfgetShiptocd(); }
    protected ConditionValue xgetCValueRcvdate() { return _myCQ.xdfgetRcvdate(); }
    protected ConditionValue xgetCValueShtypecd() { return _myCQ.xdfgetShtypecd(); }
    protected ConditionValue xgetCValueTplqty() { return _myCQ.xdfgetTplqty(); }
    protected ConditionValue xgetCValueRcvpalletno() { return _myCQ.xdfgetRcvpalletno(); }
    protected ConditionValue xgetCValueCaseqty() { return _myCQ.xdfgetCaseqty(); }
    protected ConditionValue xgetCValueVaExtdata1() { return _myCQ.xdfgetVaExtdata1(); }
    protected ConditionValue xgetCValueVaExtdata2() { return _myCQ.xdfgetVaExtdata2(); }
    protected ConditionValue xgetCValueVaExtdata3() { return _myCQ.xdfgetVaExtdata3(); }
    protected ConditionValue xgetCValueNvExtdata1() { return _myCQ.xdfgetNvExtdata1(); }
    protected ConditionValue xgetCValueNvExtdata2() { return _myCQ.xdfgetNvExtdata2(); }
    protected ConditionValue xgetCValueNvExtdata3() { return _myCQ.xdfgetNvExtdata3(); }
    protected ConditionValue xgetCValueNmExtdata1() { return _myCQ.xdfgetNmExtdata1(); }
    protected ConditionValue xgetCValueNmExtdata2() { return _myCQ.xdfgetNmExtdata2(); }
    protected ConditionValue xgetCValueNmExtdata3() { return _myCQ.xdfgetNmExtdata3(); }
    protected ConditionValue xgetCValueDtExtdata1() { return _myCQ.xdfgetDtExtdata1(); }
    protected ConditionValue xgetCValueDtExtdata2() { return _myCQ.xdfgetDtExtdata2(); }
    protected ConditionValue xgetCValueDtExtdata3() { return _myCQ.xdfgetDtExtdata3(); }
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
    public String keepScalarCondition(TTrleaveresultCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrleaveresultCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrleaveresultCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrleaveresultCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrleaveresultCB.class.getName(); }
    protected String xinCQ() { return TTrleaveresultCQ.class.getName(); }
}
