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
 * The condition-query for in-line of E_MH_SHIPPING.
 * @author DBFlute(AutoGenerator)
 */
public class EMhShippingCIQ extends AbstractBsEMhShippingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEMhShippingCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EMhShippingCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEMhShippingCQ myCQ) {
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
    protected ConditionValue xgetCValueMhShippingId() { return _myCQ.xdfgetMhShippingId(); }
    protected ConditionValue xgetCValueDpcd() { return _myCQ.xdfgetDpcd(); }
    protected ConditionValue xgetCValueDlvymd() { return _myCQ.xdfgetDlvymd(); }
    protected ConditionValue xgetCValueDed() { return _myCQ.xdfgetDed(); }
    protected ConditionValue xgetCValuePstnid() { return _myCQ.xdfgetPstnid(); }
    protected ConditionValue xgetCValueSrded() { return _myCQ.xdfgetSrded(); }
    protected ConditionValue xgetCValueSrpstnid() { return _myCQ.xdfgetSrpstnid(); }
    protected ConditionValue xgetCValueSrlincd() { return _myCQ.xdfgetSrlincd(); }
    protected ConditionValue xgetCValueSrrnk() { return _myCQ.xdfgetSrrnk(); }
    protected ConditionValue xgetCValueSscd() { return _myCQ.xdfgetSscd(); }
    protected ConditionValue xgetCValueSsnm() { return _myCQ.xdfgetSsnm(); }
    protected ConditionValue xgetCValueZzmatnr() { return _myCQ.xdfgetZzmatnr(); }
    protected ConditionValue xgetCValueSlqacb() { return _myCQ.xdfgetSlqacb(); }
    protected ConditionValue xgetCValueSlqact() { return _myCQ.xdfgetSlqact(); }
    protected ConditionValue xgetCValueLinblk() { return _myCQ.xdfgetLinblk(); }
    protected ConditionValue xgetCValueLocno() { return _myCQ.xdfgetLocno(); }
    protected ConditionValue xgetCValueLocid() { return _myCQ.xdfgetLocid(); }
    protected ConditionValue xgetCValueDlvprtrnk() { return _myCQ.xdfgetDlvprtrnk(); }
    protected ConditionValue xgetCValueDlvsnm() { return _myCQ.xdfgetDlvsnm(); }
    protected ConditionValue xgetCValueDlvdtlsnm() { return _myCQ.xdfgetDlvdtlsnm(); }
    protected ConditionValue xgetCValueSroprtcnt() { return _myCQ.xdfgetSroprtcnt(); }
    protected ConditionValue xgetCValueTtsroprtcnt() { return _myCQ.xdfgetTtsroprtcnt(); }
    protected ConditionValue xgetCValueTttopdedrnk() { return _myCQ.xdfgetTttopdedrnk(); }
    protected ConditionValue xgetCValueBrtyp() { return _myCQ.xdfgetBrtyp(); }
    protected ConditionValue xgetCValueBoxno() { return _myCQ.xdfgetBoxno(); }
    protected ConditionValue xgetCValueBoxnocnsnm() { return _myCQ.xdfgetBoxnocnsnm(); }
    protected ConditionValue xgetCValueBoxtyp() { return _myCQ.xdfgetBoxtyp(); }
    protected ConditionValue xgetCValueMgboxdid() { return _myCQ.xdfgetMgboxdid(); }
    protected ConditionValue xgetCValueDmdid() { return _myCQ.xdfgetDmdid(); }
    protected ConditionValue xgetCValueTtboxqa() { return _myCQ.xdfgetTtboxqa(); }
    protected ConditionValue xgetCValueBoxctqata() { return _myCQ.xdfgetBoxctqata(); }
    protected ConditionValue xgetCValueBoxctqaapsrplc() { return _myCQ.xdfgetBoxctqaapsrplc(); }
    protected ConditionValue xgetCValueDrclstlbcbid() { return _myCQ.xdfgetDrclstlbcbid(); }
    protected ConditionValue xgetCValueLbboxno() { return _myCQ.xdfgetLbboxno(); }
    protected ConditionValue xgetCValueLbttboxqa() { return _myCQ.xdfgetLbttboxqa(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
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
    public String keepScalarCondition(EMhShippingCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EMhShippingCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EMhShippingCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EMhShippingCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EMhShippingCB.class.getName(); }
    protected String xinCQ() { return EMhShippingCQ.class.getName(); }
}
