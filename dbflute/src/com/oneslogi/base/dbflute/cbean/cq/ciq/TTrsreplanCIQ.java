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
 * The condition-query for in-line of T_TRSREPLAN.
 * @author DBFlute(AutoGenerator)
 */
public class TTrsreplanCIQ extends AbstractBsTTrsreplanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrsreplanCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrsreplanCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrsreplanCQ myCQ) {
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
    protected ConditionValue xgetCValueTrsreplanId() { return _myCQ.xdfgetTrsreplanId(); }
    protected ConditionValue xgetCValuePrekey() { return _myCQ.xdfgetPrekey(); }
    protected ConditionValue xgetCValueTemplateflg() { return _myCQ.xdfgetTemplateflg(); }
    protected ConditionValue xgetCValueRcvinspectflg() { return _myCQ.xdfgetRcvinspectflg(); }
    protected ConditionValue xgetCValueSupplierrcvno() { return _myCQ.xdfgetSupplierrcvno(); }
    protected ConditionValue xgetCValueRmano() { return _myCQ.xdfgetRmano(); }
    protected ConditionValue xgetCValueRcvtype() { return _myCQ.xdfgetRcvtype(); }
    protected ConditionValue xgetCValuePartflg() { return _myCQ.xdfgetPartflg(); }
    protected ConditionValue xgetCValueActflg() { return _myCQ.xdfgetActflg(); }
    protected ConditionValue xgetCValueSts() { return _myCQ.xdfgetSts(); }
    protected ConditionValue xgetCValuePriorities() { return _myCQ.xdfgetPriorities(); }
    protected ConditionValue xgetCValueCompanycd() { return _myCQ.xdfgetCompanycd(); }
    protected ConditionValue xgetCValueRcvschdate() { return _myCQ.xdfgetRcvschdate(); }
    protected ConditionValue xgetCValueReceivedate() { return _myCQ.xdfgetReceivedate(); }
    protected ConditionValue xgetCValueLogisticscd() { return _myCQ.xdfgetLogisticscd(); }
    protected ConditionValue xgetCValueWarehousecd() { return _myCQ.xdfgetWarehousecd(); }
    protected ConditionValue xgetCValueSuppliercd() { return _myCQ.xdfgetSuppliercd(); }
    protected ConditionValue xgetCValueSuppliername() { return _myCQ.xdfgetSuppliername(); }
    protected ConditionValue xgetCValueAddress1() { return _myCQ.xdfgetAddress1(); }
    protected ConditionValue xgetCValueAddress2() { return _myCQ.xdfgetAddress2(); }
    protected ConditionValue xgetCValueAddress3() { return _myCQ.xdfgetAddress3(); }
    protected ConditionValue xgetCValuePostno() { return _myCQ.xdfgetPostno(); }
    protected ConditionValue xgetCValueCountrycd() { return _myCQ.xdfgetCountrycd(); }
    protected ConditionValue xgetCValuePortcd() { return _myCQ.xdfgetPortcd(); }
    protected ConditionValue xgetCValueDistrictcd() { return _myCQ.xdfgetDistrictcd(); }
    protected ConditionValue xgetCValueSupplierphone() { return _myCQ.xdfgetSupplierphone(); }
    protected ConditionValue xgetCValueFax1() { return _myCQ.xdfgetFax1(); }
    protected ConditionValue xgetCValueEmail() { return _myCQ.xdfgetEmail(); }
    protected ConditionValue xgetCValueRefname() { return _myCQ.xdfgetRefname(); }
    protected ConditionValue xgetCValueFromcd() { return _myCQ.xdfgetFromcd(); }
    protected ConditionValue xgetCValueFromsub() { return _myCQ.xdfgetFromsub(); }
    protected ConditionValue xgetCValueFromname() { return _myCQ.xdfgetFromname(); }
    protected ConditionValue xgetCValueFromaddress1() { return _myCQ.xdfgetFromaddress1(); }
    protected ConditionValue xgetCValueFromaddress2() { return _myCQ.xdfgetFromaddress2(); }
    protected ConditionValue xgetCValueFromaddress3() { return _myCQ.xdfgetFromaddress3(); }
    protected ConditionValue xgetCValueFrompostno() { return _myCQ.xdfgetFrompostno(); }
    protected ConditionValue xgetCValueFromcountrycd() { return _myCQ.xdfgetFromcountrycd(); }
    protected ConditionValue xgetCValueFromportcd() { return _myCQ.xdfgetFromportcd(); }
    protected ConditionValue xgetCValueFromdistrictcd() { return _myCQ.xdfgetFromdistrictcd(); }
    protected ConditionValue xgetCValueFromphone() { return _myCQ.xdfgetFromphone(); }
    protected ConditionValue xgetCValueFromfax() { return _myCQ.xdfgetFromfax(); }
    protected ConditionValue xgetCValueFromemail() { return _myCQ.xdfgetFromemail(); }
    protected ConditionValue xgetCValueFromrefname() { return _myCQ.xdfgetFromrefname(); }
    protected ConditionValue xgetCValueCarriercd() { return _myCQ.xdfgetCarriercd(); }
    protected ConditionValue xgetCValueCarriername() { return _myCQ.xdfgetCarriername(); }
    protected ConditionValue xgetCValueCarrierwbno() { return _myCQ.xdfgetCarrierwbno(); }
    protected ConditionValue xgetCValueDeliverycd() { return _myCQ.xdfgetDeliverycd(); }
    protected ConditionValue xgetCValueCarrierno() { return _myCQ.xdfgetCarrierno(); }
    protected ConditionValue xgetCValueCarriersname() { return _myCQ.xdfgetCarriersname(); }
    protected ConditionValue xgetCValueCarrierseq() { return _myCQ.xdfgetCarrierseq(); }
    protected ConditionValue xgetCValueExpectedtime() { return _myCQ.xdfgetExpectedtime(); }
    protected ConditionValue xgetCValueNotes() { return _myCQ.xdfgetNotes(); }
    protected ConditionValue xgetCValueOtherrefno1() { return _myCQ.xdfgetOtherrefno1(); }
    protected ConditionValue xgetCValueOtherrefno2() { return _myCQ.xdfgetOtherrefno2(); }
    protected ConditionValue xgetCValueOtherrefno3() { return _myCQ.xdfgetOtherrefno3(); }
    protected ConditionValue xgetCValueAllocgroup() { return _myCQ.xdfgetAllocgroup(); }
    protected ConditionValue xgetCValueAcceptkey() { return _myCQ.xdfgetAcceptkey(); }
    protected ConditionValue xgetCValueAcceptusercd() { return _myCQ.xdfgetAcceptusercd(); }
    protected ConditionValue xgetCValueInspectedusercd() { return _myCQ.xdfgetInspectedusercd(); }
    protected ConditionValue xgetCValueReceivedusercd() { return _myCQ.xdfgetReceivedusercd(); }
    protected ConditionValue xgetCValueMovekey() { return _myCQ.xdfgetMovekey(); }
    protected ConditionValue xgetCValueAssykey() { return _myCQ.xdfgetAssykey(); }
    protected ConditionValue xgetCValueProducekey() { return _myCQ.xdfgetProducekey(); }
    protected ConditionValue xgetCValueSyhnKbn() { return _myCQ.xdfgetSyhnKbn(); }
    protected ConditionValue xgetCValueCggdid() { return _myCQ.xdfgetCggdid(); }
    protected ConditionValue xgetCValueConfirmedFlg() { return _myCQ.xdfgetConfirmedFlg(); }
    protected ConditionValue xgetCValueSufferUsageFlg() { return _myCQ.xdfgetSufferUsageFlg(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
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
    public String keepScalarCondition(TTrsreplanCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrsreplanCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrsreplanCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrsreplanCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrsreplanCB.class.getName(); }
    protected String xinCQ() { return TTrsreplanCQ.class.getName(); }
}
