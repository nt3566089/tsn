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
 * The condition-query for in-line of E_BONDED_RECEIVE_RECORD_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class EBondedReceiveRecordSendCIQ extends AbstractBsEBondedReceiveRecordSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEBondedReceiveRecordSendCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EBondedReceiveRecordSendCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEBondedReceiveRecordSendCQ myCQ) {
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
    protected ConditionValue xgetCValueBondedReceiveRecordSendId() { return _myCQ.xdfgetBondedReceiveRecordSendId(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendRowId() { return _myCQ.xdfgetSendRowId(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueFromsub() { return _myCQ.xdfgetFromsub(); }
    protected ConditionValue xgetCValueSbwarehousecd() { return _myCQ.xdfgetSbwarehousecd(); }
    protected ConditionValue xgetCValueRefno() { return _myCQ.xdfgetRefno(); }
    protected ConditionValue xgetCValueReceivePlanDt() { return _myCQ.xdfgetReceivePlanDt(); }
    protected ConditionValue xgetCValueCarrierno() { return _myCQ.xdfgetCarrierno(); }
    protected ConditionValue xgetCValueWarehouseCd() { return _myCQ.xdfgetWarehouseCd(); }
    protected ConditionValue xgetCValueOtherrefno1() { return _myCQ.xdfgetOtherrefno1(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueLot3() { return _myCQ.xdfgetLot3(); }
    protected ConditionValue xgetCValueLot4() { return _myCQ.xdfgetLot4(); }
    protected ConditionValue xgetCValueLot1() { return _myCQ.xdfgetLot1(); }
    protected ConditionValue xgetCValueReceivedqty1Sum() { return _myCQ.xdfgetReceivedqty1Sum(); }
    protected ConditionValue xgetCValueLot2() { return _myCQ.xdfgetLot2(); }
    protected ConditionValue xgetCValueCarriersname() { return _myCQ.xdfgetCarriersname(); }
    protected ConditionValue xgetCValueCarrierwbno() { return _myCQ.xdfgetCarrierwbno(); }
    protected ConditionValue xgetCValueForeigncargoflg() { return _myCQ.xdfgetForeigncargoflg(); }
    protected ConditionValue xgetCValueOtherlot1() { return _myCQ.xdfgetOtherlot1(); }
    protected ConditionValue xgetCValueRecordType() { return _myCQ.xdfgetRecordType(); }
    protected ConditionValue xgetCValueDomRefno() { return _myCQ.xdfgetDomRefno(); }
    protected ConditionValue xgetCValueJttsflg() { return _myCQ.xdfgetJttsflg(); }
    protected ConditionValue xgetCValueSeqno() { return _myCQ.xdfgetSeqno(); }
    protected ConditionValue xgetCValueTransportType() { return _myCQ.xdfgetTransportType(); }
    protected ConditionValue xgetCValueReceivedate() { return _myCQ.xdfgetReceivedate(); }
    protected ConditionValue xgetCValueReceivedatetime() { return _myCQ.xdfgetReceivedatetime(); }
    protected ConditionValue xgetCValueLotno() { return _myCQ.xdfgetLotno(); }
    protected ConditionValue xgetCValueReceivedqty2Sum() { return _myCQ.xdfgetReceivedqty2Sum(); }
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
    public String keepScalarCondition(EBondedReceiveRecordSendCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EBondedReceiveRecordSendCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EBondedReceiveRecordSendCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EBondedReceiveRecordSendCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EBondedReceiveRecordSendCB.class.getName(); }
    protected String xinCQ() { return EBondedReceiveRecordSendCQ.class.getName(); }
}
