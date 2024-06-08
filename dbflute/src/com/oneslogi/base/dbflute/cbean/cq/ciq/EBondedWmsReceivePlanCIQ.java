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
 * The condition-query for in-line of E_BONDED_WMS_RECEIVE_PLAN.
 * @author DBFlute(AutoGenerator)
 */
public class EBondedWmsReceivePlanCIQ extends AbstractBsEBondedWmsReceivePlanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEBondedWmsReceivePlanCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EBondedWmsReceivePlanCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEBondedWmsReceivePlanCQ myCQ) {
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
    protected ConditionValue xgetCValueBondedWmsReceivePlanId() { return _myCQ.xdfgetBondedWmsReceivePlanId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueNotes() { return _myCQ.xdfgetNotes(); }
    protected ConditionValue xgetCValueSbwarehousecd() { return _myCQ.xdfgetSbwarehousecd(); }
    protected ConditionValue xgetCValueSupplierrcvno() { return _myCQ.xdfgetSupplierrcvno(); }
    protected ConditionValue xgetCValueRcvschdate() { return _myCQ.xdfgetRcvschdate(); }
    protected ConditionValue xgetCValueCarrierno() { return _myCQ.xdfgetCarrierno(); }
    protected ConditionValue xgetCValueShiptocd() { return _myCQ.xdfgetShiptocd(); }
    protected ConditionValue xgetCValueOtherrefno1() { return _myCQ.xdfgetOtherrefno1(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueLot3() { return _myCQ.xdfgetLot3(); }
    protected ConditionValue xgetCValueLot4() { return _myCQ.xdfgetLot4(); }
    protected ConditionValue xgetCValueLot1() { return _myCQ.xdfgetLot1(); }
    protected ConditionValue xgetCValueExpectqty1() { return _myCQ.xdfgetExpectqty1(); }
    protected ConditionValue xgetCValueFromfax() { return _myCQ.xdfgetFromfax(); }
    protected ConditionValue xgetCValueBatjmfym() { return _myCQ.xdfgetBatjmfym(); }
    protected ConditionValue xgetCValueCarriersname() { return _myCQ.xdfgetCarriersname(); }
    protected ConditionValue xgetCValueCarrierwbno() { return _myCQ.xdfgetCarrierwbno(); }
    protected ConditionValue xgetCValueForeigncargoflg() { return _myCQ.xdfgetForeigncargoflg(); }
    protected ConditionValue xgetCValueBlNo() { return _myCQ.xdfgetBlNo(); }
    protected ConditionValue xgetCValueCarriername() { return _myCQ.xdfgetCarriername(); }
    protected ConditionValue xgetCValueFromemail() { return _myCQ.xdfgetFromemail(); }
    protected ConditionValue xgetCValueArrivalportdate() { return _myCQ.xdfgetArrivalportdate(); }
    protected ConditionValue xgetCValueShipname() { return _myCQ.xdfgetShipname(); }
    protected ConditionValue xgetCValueBatdelino() { return _myCQ.xdfgetBatdelino(); }
    protected ConditionValue xgetCValueBatdelidetailno() { return _myCQ.xdfgetBatdelidetailno(); }
    protected ConditionValue xgetCValueBatwarehousecd() { return _myCQ.xdfgetBatwarehousecd(); }
    protected ConditionValue xgetCValueBatkeepwarehousecd() { return _myCQ.xdfgetBatkeepwarehousecd(); }
    protected ConditionValue xgetCValueBatpartnernorcv() { return _myCQ.xdfgetBatpartnernorcv(); }
    protected ConditionValue xgetCValueBatpartnernosnd() { return _myCQ.xdfgetBatpartnernosnd(); }
    protected ConditionValue xgetCValueBatdelidetailnum() { return _myCQ.xdfgetBatdelidetailnum(); }
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
    public String keepScalarCondition(EBondedWmsReceivePlanCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EBondedWmsReceivePlanCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EBondedWmsReceivePlanCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EBondedWmsReceivePlanCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EBondedWmsReceivePlanCB.class.getName(); }
    protected String xinCQ() { return EBondedWmsReceivePlanCQ.class.getName(); }
}
