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
 * The condition-query for in-line of T_TRRCVEXTEND.
 * @author DBFlute(AutoGenerator)
 */
public class TTrrcvextendCIQ extends AbstractBsTTrrcvextendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrrcvextendCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrrcvextendCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrrcvextendCQ myCQ) {
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
    protected ConditionValue xgetCValueReceivePlanHId() { return _myCQ.xdfgetReceivePlanHId(); }
    public String keepReceivePlanHId_InScopeRelation_TTrrcv(TTrrcvCQ sq)
    { return _myCQ.keepReceivePlanHId_InScopeRelation_TTrrcv(sq); }
    public String keepReceivePlanHId_NotInScopeRelation_TTrrcv(TTrrcvCQ sq)
    { return _myCQ.keepReceivePlanHId_NotInScopeRelation_TTrrcv(sq); }
    protected ConditionValue xgetCValueSbwarehousecd() { return _myCQ.xdfgetSbwarehousecd(); }
    protected ConditionValue xgetCValueIino() { return _myCQ.xdfgetIino(); }
    protected ConditionValue xgetCValueRcvschdate() { return _myCQ.xdfgetRcvschdate(); }
    protected ConditionValue xgetCValueCarrierno() { return _myCQ.xdfgetCarrierno(); }
    protected ConditionValue xgetCValueWarehousecd() { return _myCQ.xdfgetWarehousecd(); }
    protected ConditionValue xgetCValueOtherrefno1() { return _myCQ.xdfgetOtherrefno1(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueLot3() { return _myCQ.xdfgetLot3(); }
    protected ConditionValue xgetCValueLot4() { return _myCQ.xdfgetLot4(); }
    protected ConditionValue xgetCValueLot1() { return _myCQ.xdfgetLot1(); }
    protected ConditionValue xgetCValueLot2() { return _myCQ.xdfgetLot2(); }
    protected ConditionValue xgetCValueExpectqty1() { return _myCQ.xdfgetExpectqty1(); }
    protected ConditionValue xgetCValueFromfax() { return _myCQ.xdfgetFromfax(); }
    protected ConditionValue xgetCValueCarriersname() { return _myCQ.xdfgetCarriersname(); }
    protected ConditionValue xgetCValueCarrierwbno() { return _myCQ.xdfgetCarrierwbno(); }
    protected ConditionValue xgetCValueForeigncargoflg() { return _myCQ.xdfgetForeigncargoflg(); }
    protected ConditionValue xgetCValueFromrefname() { return _myCQ.xdfgetFromrefname(); }
    protected ConditionValue xgetCValueCarriername() { return _myCQ.xdfgetCarriername(); }
    protected ConditionValue xgetCValueCustorderno() { return _myCQ.xdfgetCustorderno(); }
    protected ConditionValue xgetCValueArrivalportdate() { return _myCQ.xdfgetArrivalportdate(); }
    protected ConditionValue xgetCValueShipname() { return _myCQ.xdfgetShipname(); }
    protected ConditionValue xgetCValueBatdelino() { return _myCQ.xdfgetBatdelino(); }
    protected ConditionValue xgetCValueBatdelidetailno() { return _myCQ.xdfgetBatdelidetailno(); }
    protected ConditionValue xgetCValueBatwarehousecd() { return _myCQ.xdfgetBatwarehousecd(); }
    protected ConditionValue xgetCValueBatkeepwarehousecd() { return _myCQ.xdfgetBatkeepwarehousecd(); }
    protected ConditionValue xgetCValueBatpartnernorcv() { return _myCQ.xdfgetBatpartnernorcv(); }
    protected ConditionValue xgetCValueBatpartnernosnd() { return _myCQ.xdfgetBatpartnernosnd(); }
    protected ConditionValue xgetCValueBatdelidetailnum() { return _myCQ.xdfgetBatdelidetailnum(); }
    protected ConditionValue xgetCValueBatno() { return _myCQ.xdfgetBatno(); }
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
    public String keepScalarCondition(TTrrcvextendCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrrcvextendCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrrcvextendCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrrcvextendCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrrcvextendCB.class.getName(); }
    protected String xinCQ() { return TTrrcvextendCQ.class.getName(); }
}
