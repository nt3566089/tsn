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
 * The condition-query for in-line of E_BONDED_SHIPPING_PLAN_BULK_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public class EBondedShippingPlanBulkInputCIQ extends AbstractBsEBondedShippingPlanBulkInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEBondedShippingPlanBulkInputCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EBondedShippingPlanBulkInputCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEBondedShippingPlanBulkInputCQ myCQ) {
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
    protected ConditionValue xgetCValueBondedShippingPlanBulkInputId() { return _myCQ.xdfgetBondedShippingPlanBulkInputId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueSbwarehousecd() { return _myCQ.xdfgetSbwarehousecd(); }
    protected ConditionValue xgetCValueCustorderno() { return _myCQ.xdfgetCustorderno(); }
    protected ConditionValue xgetCValueOrdertype() { return _myCQ.xdfgetOrdertype(); }
    protected ConditionValue xgetCValueShipcd() { return _myCQ.xdfgetShipcd(); }
    protected ConditionValue xgetCValueCarryoutplancd() { return _myCQ.xdfgetCarryoutplancd(); }
    protected ConditionValue xgetCValueShiptocd() { return _myCQ.xdfgetShiptocd(); }
    protected ConditionValue xgetCValueShiptonm() { return _myCQ.xdfgetShiptonm(); }
    protected ConditionValue xgetCValueReceiveplanym() { return _myCQ.xdfgetReceiveplanym(); }
    protected ConditionValue xgetCValueShtypecd() { return _myCQ.xdfgetShtypecd(); }
    protected ConditionValue xgetCValueShtypenm() { return _myCQ.xdfgetShtypenm(); }
    protected ConditionValue xgetCValueRefno() { return _myCQ.xdfgetRefno(); }
    protected ConditionValue xgetCValuePickingcomment() { return _myCQ.xdfgetPickingcomment(); }
    protected ConditionValue xgetCValuePhoneno() { return _myCQ.xdfgetPhoneno(); }
    protected ConditionValue xgetCValueBatjmfym() { return _myCQ.xdfgetBatjmfym(); }
    protected ConditionValue xgetCValueRmano() { return _myCQ.xdfgetRmano(); }
    protected ConditionValue xgetCValueOwnerorderno() { return _myCQ.xdfgetOwnerorderno(); }
    protected ConditionValue xgetCValuePalletno() { return _myCQ.xdfgetPalletno(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueDesigncd() { return _myCQ.xdfgetDesigncd(); }
    protected ConditionValue xgetCValueManufactureym() { return _myCQ.xdfgetManufactureym(); }
    protected ConditionValue xgetCValueFirmcarryno() { return _myCQ.xdfgetFirmcarryno(); }
    protected ConditionValue xgetCValueQty() { return _myCQ.xdfgetQty(); }
    protected ConditionValue xgetCValueInoutkbn() { return _myCQ.xdfgetInoutkbn(); }
    protected ConditionValue xgetCValueStocktype() { return _myCQ.xdfgetStocktype(); }
    protected ConditionValue xgetCValueCustomsreleasedate() { return _myCQ.xdfgetCustomsreleasedate(); }
    protected ConditionValue xgetCValueSuppliercvno() { return _myCQ.xdfgetSuppliercvno(); }
    protected ConditionValue xgetCValueIfitemcd() { return _myCQ.xdfgetIfitemcd(); }
    protected ConditionValue xgetCValueSendflg() { return _myCQ.xdfgetSendflg(); }
    protected ConditionValue xgetCValuePalletorder() { return _myCQ.xdfgetPalletorder(); }
    protected ConditionValue xgetCValuePallettype() { return _myCQ.xdfgetPallettype(); }
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
    public String keepScalarCondition(EBondedShippingPlanBulkInputCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EBondedShippingPlanBulkInputCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EBondedShippingPlanBulkInputCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EBondedShippingPlanBulkInputCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EBondedShippingPlanBulkInputCB.class.getName(); }
    protected String xinCQ() { return EBondedShippingPlanBulkInputCQ.class.getName(); }
}
