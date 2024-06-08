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
 * The condition-query for in-line of E_SHOP_DOMESTIC_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class EShopDomesticSendCIQ extends AbstractBsEShopDomesticSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEShopDomesticSendCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EShopDomesticSendCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEShopDomesticSendCQ myCQ) {
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
    protected ConditionValue xgetCValueShopDomesticSendId() { return _myCQ.xdfgetShopDomesticSendId(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendRowCd() { return _myCQ.xdfgetSendRowCd(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueUsernum1() { return _myCQ.xdfgetUsernum1(); }
    protected ConditionValue xgetCValueTracekey() { return _myCQ.xdfgetTracekey(); }
    protected ConditionValue xgetCValueWarehousecd() { return _myCQ.xdfgetWarehousecd(); }
    protected ConditionValue xgetCValueWarehousename() { return _myCQ.xdfgetWarehousename(); }
    protected ConditionValue xgetCValueFactorycd() { return _myCQ.xdfgetFactorycd(); }
    protected ConditionValue xgetCValueFactoryname() { return _myCQ.xdfgetFactoryname(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueItemname() { return _myCQ.xdfgetItemname(); }
    protected ConditionValue xgetCValueSkucd() { return _myCQ.xdfgetSkucd(); }
    protected ConditionValue xgetCValueReceivecd() { return _myCQ.xdfgetReceivecd(); }
    protected ConditionValue xgetCValueProductmark() { return _myCQ.xdfgetProductmark(); }
    protected ConditionValue xgetCValueOrderno() { return _myCQ.xdfgetOrderno(); }
    protected ConditionValue xgetCValuePrinterno() { return _myCQ.xdfgetPrinterno(); }
    protected ConditionValue xgetCValueMakeno() { return _myCQ.xdfgetMakeno(); }
    protected ConditionValue xgetCValueLot4() { return _myCQ.xdfgetLot4(); }
    protected ConditionValue xgetCValueMaketime() { return _myCQ.xdfgetMaketime(); }
    protected ConditionValue xgetCValueTransportcd() { return _myCQ.xdfgetTransportcd(); }
    protected ConditionValue xgetCValueDistributioncd() { return _myCQ.xdfgetDistributioncd(); }
    protected ConditionValue xgetCValuePalletid() { return _myCQ.xdfgetPalletid(); }
    protected ConditionValue xgetCValueInitnum() { return _myCQ.xdfgetInitnum(); }
    protected ConditionValue xgetCValueCreatedatetime() { return _myCQ.xdfgetCreatedatetime(); }
    protected ConditionValue xgetCValueAssortdatetime() { return _myCQ.xdfgetAssortdatetime(); }
    protected ConditionValue xgetCValueTracetype() { return _myCQ.xdfgetTracetype(); }
    protected ConditionValue xgetCValueTracetypename() { return _myCQ.xdfgetTracetypename(); }
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
    protected ConditionValue xgetCValueDistwarehousename() { return _myCQ.xdfgetDistwarehousename(); }
    protected ConditionValue xgetCValueInvNum() { return _myCQ.xdfgetInvNum(); }
    protected ConditionValue xgetCValueSortNum() { return _myCQ.xdfgetSortNum(); }
    protected ConditionValue xgetCValueAdoptNum() { return _myCQ.xdfgetAdoptNum(); }
    protected ConditionValue xgetCValueWhItemcd() { return _myCQ.xdfgetWhItemcd(); }
    protected ConditionValue xgetCValueWhItemname() { return _myCQ.xdfgetWhItemname(); }
    protected ConditionValue xgetCValueWhDesigncd() { return _myCQ.xdfgetWhDesigncd(); }
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
    public String keepScalarCondition(EShopDomesticSendCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EShopDomesticSendCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EShopDomesticSendCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EShopDomesticSendCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EShopDomesticSendCB.class.getName(); }
    protected String xinCQ() { return EShopDomesticSendCQ.class.getName(); }
}
