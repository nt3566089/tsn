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
 * The condition-query for in-line of T_TRRCVTAGDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class TTrrcvtagdetailCIQ extends AbstractBsTTrrcvtagdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTTrrcvtagdetailCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TTrrcvtagdetailCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTTrrcvtagdetailCQ myCQ) {
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
    protected ConditionValue xgetCValueTrrcvtagdetailId() { return _myCQ.xdfgetTrrcvtagdetailId(); }
    protected ConditionValue xgetCValueRcvtagkey() { return _myCQ.xdfgetRcvtagkey(); }
    protected ConditionValue xgetCValueAcceptkey() { return _myCQ.xdfgetAcceptkey(); }
    protected ConditionValue xgetCValueAcceptlineno() { return _myCQ.xdfgetAcceptlineno(); }
    protected ConditionValue xgetCValueRcvkey() { return _myCQ.xdfgetRcvkey(); }
    protected ConditionValue xgetCValueRcvlineno() { return _myCQ.xdfgetRcvlineno(); }
    protected ConditionValue xgetCValueSts() { return _myCQ.xdfgetSts(); }
    protected ConditionValue xgetCValueOwnercd() { return _myCQ.xdfgetOwnercd(); }
    protected ConditionValue xgetCValueItemadmin() { return _myCQ.xdfgetItemadmin(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
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
    protected ConditionValue xgetCValueLogisticscd() { return _myCQ.xdfgetLogisticscd(); }
    protected ConditionValue xgetCValueWarehousecd() { return _myCQ.xdfgetWarehousecd(); }
    protected ConditionValue xgetCValueSlotflg() { return _myCQ.xdfgetSlotflg(); }
    protected ConditionValue xgetCValueToloccd() { return _myCQ.xdfgetToloccd(); }
    protected ConditionValue xgetCValueLoccd() { return _myCQ.xdfgetLoccd(); }
    protected ConditionValue xgetCValueLotkey() { return _myCQ.xdfgetLotkey(); }
    protected ConditionValue xgetCValueTagcd() { return _myCQ.xdfgetTagcd(); }
    protected ConditionValue xgetCValueOddsflg() { return _myCQ.xdfgetOddsflg(); }
    protected ConditionValue xgetCValueInstructqty1() { return _myCQ.xdfgetInstructqty1(); }
    protected ConditionValue xgetCValueInstructqty2() { return _myCQ.xdfgetInstructqty2(); }
    protected ConditionValue xgetCValueInstructqty3() { return _myCQ.xdfgetInstructqty3(); }
    protected ConditionValue xgetCValueLoadqty1() { return _myCQ.xdfgetLoadqty1(); }
    protected ConditionValue xgetCValueLoadqty2() { return _myCQ.xdfgetLoadqty2(); }
    protected ConditionValue xgetCValueLoadqty3() { return _myCQ.xdfgetLoadqty3(); }
    protected ConditionValue xgetCValueLabelprintedflg() { return _myCQ.xdfgetLabelprintedflg(); }
    protected ConditionValue xgetCValueNotes() { return _myCQ.xdfgetNotes(); }
    protected ConditionValue xgetCValueSokey() { return _myCQ.xdfgetSokey(); }
    protected ConditionValue xgetCValueSolineno() { return _myCQ.xdfgetSolineno(); }
    protected ConditionValue xgetCValueTriggertype() { return _myCQ.xdfgetTriggertype(); }
    protected ConditionValue xgetCValueProspectflg() { return _myCQ.xdfgetProspectflg(); }
    protected ConditionValue xgetCValueProspectupdateflg() { return _myCQ.xdfgetProspectupdateflg(); }
    protected ConditionValue xgetCValueSlottype() { return _myCQ.xdfgetSlottype(); }
    protected ConditionValue xgetCValueSlottedusercd() { return _myCQ.xdfgetSlottedusercd(); }
    protected ConditionValue xgetCValueXdockorderkey() { return _myCQ.xdfgetXdockorderkey(); }
    protected ConditionValue xgetCValuePickkey() { return _myCQ.xdfgetPickkey(); }
    protected ConditionValue xgetCValueFullpalletkey() { return _myCQ.xdfgetFullpalletkey(); }
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
    public String keepScalarCondition(TTrrcvtagdetailCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TTrrcvtagdetailCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TTrrcvtagdetailCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TTrrcvtagdetailCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TTrrcvtagdetailCB.class.getName(); }
    protected String xinCQ() { return TTrrcvtagdetailCQ.class.getName(); }
}
