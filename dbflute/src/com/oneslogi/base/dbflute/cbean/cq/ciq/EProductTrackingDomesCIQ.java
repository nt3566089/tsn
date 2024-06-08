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
 * The condition-query for in-line of E_PRODUCT_TRACKING_DOMES.
 * @author DBFlute(AutoGenerator)
 */
public class EProductTrackingDomesCIQ extends AbstractBsEProductTrackingDomesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEProductTrackingDomesCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EProductTrackingDomesCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEProductTrackingDomesCQ myCQ) {
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
    protected ConditionValue xgetCValueProductTrackingDomesId() { return _myCQ.xdfgetProductTrackingDomesId(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendRowId() { return _myCQ.xdfgetSendRowId(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueUsernum1() { return _myCQ.xdfgetUsernum1(); }
    protected ConditionValue xgetCValueItemAdmin() { return _myCQ.xdfgetItemAdmin(); }
    protected ConditionValue xgetCValueTracekey() { return _myCQ.xdfgetTracekey(); }
    protected ConditionValue xgetCValueWarehousecd() { return _myCQ.xdfgetWarehousecd(); }
    protected ConditionValue xgetCValueFactorycd() { return _myCQ.xdfgetFactorycd(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueSkucd() { return _myCQ.xdfgetSkucd(); }
    protected ConditionValue xgetCValueDestinationcd() { return _myCQ.xdfgetDestinationcd(); }
    protected ConditionValue xgetCValueManufacturecd() { return _myCQ.xdfgetManufacturecd(); }
    protected ConditionValue xgetCValueOrderno() { return _myCQ.xdfgetOrderno(); }
    protected ConditionValue xgetCValueMachinemo() { return _myCQ.xdfgetMachinemo(); }
    protected ConditionValue xgetCValueCreateno() { return _myCQ.xdfgetCreateno(); }
    protected ConditionValue xgetCValueLimitdate() { return _myCQ.xdfgetLimitdate(); }
    protected ConditionValue xgetCValueDatetime() { return _myCQ.xdfgetDatetime(); }
    protected ConditionValue xgetCValueDistributioncd() { return _myCQ.xdfgetDistributioncd(); }
    protected ConditionValue xgetCValueTransportcd() { return _myCQ.xdfgetTransportcd(); }
    protected ConditionValue xgetCValuePalletid() { return _myCQ.xdfgetPalletid(); }
    protected ConditionValue xgetCValueInitnum() { return _myCQ.xdfgetInitnum(); }
    protected ConditionValue xgetCValueCreatedatetime() { return _myCQ.xdfgetCreatedatetime(); }
    protected ConditionValue xgetCValueAssortdatetime() { return _myCQ.xdfgetAssortdatetime(); }
    protected ConditionValue xgetCValueTracetype() { return _myCQ.xdfgetTracetype(); }
    protected ConditionValue xgetCValueLineblock() { return _myCQ.xdfgetLineblock(); }
    protected ConditionValue xgetCValueAssortedunit() { return _myCQ.xdfgetAssortedunit(); }
    protected ConditionValue xgetCValueAssortedindex() { return _myCQ.xdfgetAssortedindex(); }
    protected ConditionValue xgetCValueOperationcode() { return _myCQ.xdfgetOperationcode(); }
    protected ConditionValue xgetCValueCaseinnum() { return _myCQ.xdfgetCaseinnum(); }
    protected ConditionValue xgetCValueAssortnum() { return _myCQ.xdfgetAssortnum(); }
    protected ConditionValue xgetCValueAssortdifnum() { return _myCQ.xdfgetAssortdifnum(); }
    protected ConditionValue xgetCValueDirectioncd() { return _myCQ.xdfgetDirectioncd(); }
    protected ConditionValue xgetCValuePistontype() { return _myCQ.xdfgetPistontype(); }
    protected ConditionValue xgetCValueCustomercd() { return _myCQ.xdfgetCustomercd(); }
    protected ConditionValue xgetCValueDirectionnum() { return _myCQ.xdfgetDirectionnum(); }
    protected ConditionValue xgetCValueDistwarehousecd() { return _myCQ.xdfgetDistwarehousecd(); }
    protected ConditionValue xgetCValueRcvkey() { return _myCQ.xdfgetRcvkey(); }
    protected ConditionValue xgetCValueItemcdWh() { return _myCQ.xdfgetItemcdWh(); }
    protected ConditionValue xgetCValueDesigncd() { return _myCQ.xdfgetDesigncd(); }
    protected ConditionValue xgetCValueInvNum() { return _myCQ.xdfgetInvNum(); }
    protected ConditionValue xgetCValueSortNum() { return _myCQ.xdfgetSortNum(); }
    protected ConditionValue xgetCValueAdoptNum() { return _myCQ.xdfgetAdoptNum(); }
    protected ConditionValue xgetCValueDtExtdata2() { return _myCQ.xdfgetDtExtdata2(); }
    protected ConditionValue xgetCValueReservearea() { return _myCQ.xdfgetReservearea(); }
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
    public String keepScalarCondition(EProductTrackingDomesCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EProductTrackingDomesCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EProductTrackingDomesCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EProductTrackingDomesCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EProductTrackingDomesCB.class.getName(); }
    protected String xinCQ() { return EProductTrackingDomesCQ.class.getName(); }
}
