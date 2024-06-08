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
 * The condition-query for in-line of E_DUTY_FREE_INOUT_RESULT.
 * @author DBFlute(AutoGenerator)
 */
public class EDutyFreeInoutResultCIQ extends AbstractBsEDutyFreeInoutResultCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEDutyFreeInoutResultCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EDutyFreeInoutResultCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEDutyFreeInoutResultCQ myCQ) {
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
    protected ConditionValue xgetCValueDutyFreeInoutResultId() { return _myCQ.xdfgetDutyFreeInoutResultId(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendRowId() { return _myCQ.xdfgetSendRowId(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueSymbolPosKey() { return _myCQ.xdfgetSymbolPosKey(); }
    protected ConditionValue xgetCValueWarehouseCd() { return _myCQ.xdfgetWarehouseCd(); }
    protected ConditionValue xgetCValueSymbolFactoryCd() { return _myCQ.xdfgetSymbolFactoryCd(); }
    protected ConditionValue xgetCValueSymbolItemCd() { return _myCQ.xdfgetSymbolItemCd(); }
    protected ConditionValue xgetCValueSymbolSku() { return _myCQ.xdfgetSymbolSku(); }
    protected ConditionValue xgetCValueSymbolReceiveCd() { return _myCQ.xdfgetSymbolReceiveCd(); }
    protected ConditionValue xgetCValueSymbolProductMark() { return _myCQ.xdfgetSymbolProductMark(); }
    protected ConditionValue xgetCValueSymbolOrderno() { return _myCQ.xdfgetSymbolOrderno(); }
    protected ConditionValue xgetCValueSymbolPrinterno() { return _myCQ.xdfgetSymbolPrinterno(); }
    protected ConditionValue xgetCValueSymbolMakeno() { return _myCQ.xdfgetSymbolMakeno(); }
    protected ConditionValue xgetCValueSymbolLot4() { return _myCQ.xdfgetSymbolLot4(); }
    protected ConditionValue xgetCValueSymbolMaketime() { return _myCQ.xdfgetSymbolMaketime(); }
    protected ConditionValue xgetCValueSymbolCirculationId() { return _myCQ.xdfgetSymbolCirculationId(); }
    protected ConditionValue xgetCValueTransportCd() { return _myCQ.xdfgetTransportCd(); }
    protected ConditionValue xgetCValuePalletId() { return _myCQ.xdfgetPalletId(); }
    protected ConditionValue xgetCValueInitNum() { return _myCQ.xdfgetInitNum(); }
    protected ConditionValue xgetCValueCreateDatetime() { return _myCQ.xdfgetCreateDatetime(); }
    protected ConditionValue xgetCValueSortingDatetime() { return _myCQ.xdfgetSortingDatetime(); }
    protected ConditionValue xgetCValueTraceType() { return _myCQ.xdfgetTraceType(); }
    protected ConditionValue xgetCValueLineBlock() { return _myCQ.xdfgetLineBlock(); }
    protected ConditionValue xgetCValueAssortEdUnit() { return _myCQ.xdfgetAssortEdUnit(); }
    protected ConditionValue xgetCValueAssortEdIndex() { return _myCQ.xdfgetAssortEdIndex(); }
    protected ConditionValue xgetCValueOperationCode() { return _myCQ.xdfgetOperationCode(); }
    protected ConditionValue xgetCValueCaseInNum() { return _myCQ.xdfgetCaseInNum(); }
    protected ConditionValue xgetCValueAssortNum() { return _myCQ.xdfgetAssortNum(); }
    protected ConditionValue xgetCValueAssortDifNum() { return _myCQ.xdfgetAssortDifNum(); }
    protected ConditionValue xgetCValueDirectionCd() { return _myCQ.xdfgetDirectionCd(); }
    protected ConditionValue xgetCValuePistonType() { return _myCQ.xdfgetPistonType(); }
    protected ConditionValue xgetCValueCustomerCd() { return _myCQ.xdfgetCustomerCd(); }
    protected ConditionValue xgetCValueDirectionNum() { return _myCQ.xdfgetDirectionNum(); }
    protected ConditionValue xgetCValueDistWarehouseCd() { return _myCQ.xdfgetDistWarehouseCd(); }
    protected ConditionValue xgetCValueSymbolRcvKey() { return _myCQ.xdfgetSymbolRcvKey(); }
    protected ConditionValue xgetCValueItemCd() { return _myCQ.xdfgetItemCd(); }
    protected ConditionValue xgetCValueDesignCd() { return _myCQ.xdfgetDesignCd(); }
    protected ConditionValue xgetCValueResesrveArea() { return _myCQ.xdfgetResesrveArea(); }
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
    public String keepScalarCondition(EDutyFreeInoutResultCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EDutyFreeInoutResultCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EDutyFreeInoutResultCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EDutyFreeInoutResultCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EDutyFreeInoutResultCB.class.getName(); }
    protected String xinCQ() { return EDutyFreeInoutResultCQ.class.getName(); }
}
