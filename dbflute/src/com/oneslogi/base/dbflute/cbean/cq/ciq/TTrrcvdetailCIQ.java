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
 * The condition-query for in-line of T_TRRCVDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TTrrcvdetailCIQ extends AbstractBsTTrrcvdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrrcvdetailCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrrcvdetailCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrrcvdetailCQ myCQ) {
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
    protected ConditionValue xgetCValueReceivePlanBId() { return _myCQ.xdfgetReceivePlanBId(); }
    public String keepReceivePlanBId_InScopeRelation_TReceivePlanB(TReceivePlanBCQ sq)
    { return _myCQ.keepReceivePlanBId_InScopeRelation_TReceivePlanB(sq); }
    public String keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(TReceivePlanBCQ sq)
    { return _myCQ.keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(sq); }
    protected ConditionValue xgetCValueReceivePlanHId() { return _myCQ.xdfgetReceivePlanHId(); }
    public String keepReceivePlanHId_InScopeRelation_TTrrcv(TTrrcvCQ sq)
    { return _myCQ.keepReceivePlanHId_InScopeRelation_TTrrcv(sq); }
    public String keepReceivePlanHId_NotInScopeRelation_TTrrcv(TTrrcvCQ sq)
    { return _myCQ.keepReceivePlanHId_NotInScopeRelation_TTrrcv(sq); }
    protected ConditionValue xgetCValueRcvlineno() { return _myCQ.xdfgetRcvlineno(); }
    protected ConditionValue xgetCValueSupplierrcvlineno() { return _myCQ.xdfgetSupplierrcvlineno(); }
    protected ConditionValue xgetCValueXdocflg() { return _myCQ.xdfgetXdocflg(); }
    protected ConditionValue xgetCValuePokey() { return _myCQ.xdfgetPokey(); }
    protected ConditionValue xgetCValuePolineno() { return _myCQ.xdfgetPolineno(); }
    protected ConditionValue xgetCValuePotype() { return _myCQ.xdfgetPotype(); }
    protected ConditionValue xgetCValueOwnerpolineno() { return _myCQ.xdfgetOwnerpolineno(); }
    protected ConditionValue xgetCValueOriginalpono() { return _myCQ.xdfgetOriginalpono(); }
    protected ConditionValue xgetCValueOriginalpolineno() { return _myCQ.xdfgetOriginalpolineno(); }
    protected ConditionValue xgetCValuePodate() { return _myCQ.xdfgetPodate(); }
    protected ConditionValue xgetCValueOwnercd() { return _myCQ.xdfgetOwnercd(); }
    protected ConditionValue xgetCValueItemadmin() { return _myCQ.xdfgetItemadmin(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueItemcd() { return _myCQ.xdfgetItemcd(); }
    protected ConditionValue xgetCValueIfitemcd() { return _myCQ.xdfgetIfitemcd(); }
    protected ConditionValue xgetCValueLot1() { return _myCQ.xdfgetLot1(); }
    protected ConditionValue xgetCValueLot2() { return _myCQ.xdfgetLot2(); }
    protected ConditionValue xgetCValueLot3() { return _myCQ.xdfgetLot3(); }
    protected ConditionValue xgetCValueLot4() { return _myCQ.xdfgetLot4(); }
    protected ConditionValue xgetCValueLot5() { return _myCQ.xdfgetLot5(); }
    protected ConditionValue xgetCValueOtherlot1() { return _myCQ.xdfgetOtherlot1(); }
    protected ConditionValue xgetCValueOtherlot2() { return _myCQ.xdfgetOtherlot2(); }
    protected ConditionValue xgetCValueOtherlot3() { return _myCQ.xdfgetOtherlot3(); }
    protected ConditionValue xgetCValueOtherlot4() { return _myCQ.xdfgetOtherlot4(); }
    protected ConditionValue xgetCValueOtherlot5() { return _myCQ.xdfgetOtherlot5(); }
    protected ConditionValue xgetCValueDamageflg() { return _myCQ.xdfgetDamageflg(); }
    protected ConditionValue xgetCValueNoshippingflg() { return _myCQ.xdfgetNoshippingflg(); }
    protected ConditionValue xgetCValueForeigncargoflg() { return _myCQ.xdfgetForeigncargoflg(); }
    protected ConditionValue xgetCValueCustomsreleaseflg() { return _myCQ.xdfgetCustomsreleaseflg(); }
    protected ConditionValue xgetCValueTaxflg() { return _myCQ.xdfgetTaxflg(); }
    protected ConditionValue xgetCValueExpectqty1() { return _myCQ.xdfgetExpectqty1(); }
    protected ConditionValue xgetCValueExpectqty2() { return _myCQ.xdfgetExpectqty2(); }
    protected ConditionValue xgetCValueExpectqty3() { return _myCQ.xdfgetExpectqty3(); }
    protected ConditionValue xgetCValueReceivedqty1() { return _myCQ.xdfgetReceivedqty1(); }
    protected ConditionValue xgetCValueReceivedqty2() { return _myCQ.xdfgetReceivedqty2(); }
    protected ConditionValue xgetCValueReceivedqty3() { return _myCQ.xdfgetReceivedqty3(); }
    protected ConditionValue xgetCValueAdjustqty1() { return _myCQ.xdfgetAdjustqty1(); }
    protected ConditionValue xgetCValueAdjustqty2() { return _myCQ.xdfgetAdjustqty2(); }
    protected ConditionValue xgetCValueAdjustqty3() { return _myCQ.xdfgetAdjustqty3(); }
    protected ConditionValue xgetCValueRcvtagqty1() { return _myCQ.xdfgetRcvtagqty1(); }
    protected ConditionValue xgetCValueXdocfreeqty1() { return _myCQ.xdfgetXdocfreeqty1(); }
    protected ConditionValue xgetCValueInspectedqty1() { return _myCQ.xdfgetInspectedqty1(); }
    protected ConditionValue xgetCValueInspectedqty2() { return _myCQ.xdfgetInspectedqty2(); }
    protected ConditionValue xgetCValueInspectedqty3() { return _myCQ.xdfgetInspectedqty3(); }
    protected ConditionValue xgetCValuePriceBuy() { return _myCQ.xdfgetPriceBuy(); }
    protected ConditionValue xgetCValuePriceWholesale() { return _myCQ.xdfgetPriceWholesale(); }
    protected ConditionValue xgetCValuePriceSale() { return _myCQ.xdfgetPriceSale(); }
    protected ConditionValue xgetCValueNotes() { return _myCQ.xdfgetNotes(); }
    protected ConditionValue xgetCValueIcdate() { return _myCQ.xdfgetIcdate(); }
    protected ConditionValue xgetCValueOrderkey() { return _myCQ.xdfgetOrderkey(); }
    protected ConditionValue xgetCValueOrderlineno() { return _myCQ.xdfgetOrderlineno(); }
    protected ConditionValue xgetCValueOwnerorderno() { return _myCQ.xdfgetOwnerorderno(); }
    protected ConditionValue xgetCValueOwnerorderlineno() { return _myCQ.xdfgetOwnerorderlineno(); }
    protected ConditionValue xgetCValueCustorderno() { return _myCQ.xdfgetCustorderno(); }
    protected ConditionValue xgetCValueCustorderlineno() { return _myCQ.xdfgetCustorderlineno(); }
    protected ConditionValue xgetCValueOrdertype() { return _myCQ.xdfgetOrdertype(); }
    protected ConditionValue xgetCValueRcvqtyerrorflg() { return _myCQ.xdfgetRcvqtyerrorflg(); }
    protected ConditionValue xgetCValueLogicflg1() { return _myCQ.xdfgetLogicflg1(); }
    protected ConditionValue xgetCValueLogicflg2() { return _myCQ.xdfgetLogicflg2(); }
    protected ConditionValue xgetCValueLogicflg3() { return _myCQ.xdfgetLogicflg3(); }
    protected ConditionValue xgetCValueMovelineno() { return _myCQ.xdfgetMovelineno(); }
    protected ConditionValue xgetCValueAssylineno() { return _myCQ.xdfgetAssylineno(); }
    protected ConditionValue xgetCValueProducelineno() { return _myCQ.xdfgetProducelineno(); }
    protected ConditionValue xgetCValueChecklastlotflg() { return _myCQ.xdfgetChecklastlotflg(); }
    protected ConditionValue xgetCValueTrpalletId() { return _myCQ.xdfgetTrpalletId(); }
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
    public String keepScalarCondition(TTrrcvdetailCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrrcvdetailCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrrcvdetailCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrrcvdetailCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrrcvdetailCB.class.getName(); }
    protected String xinCQ() { return TTrrcvdetailCQ.class.getName(); }
}
