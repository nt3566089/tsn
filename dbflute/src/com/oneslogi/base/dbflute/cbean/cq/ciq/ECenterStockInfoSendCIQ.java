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
 * The condition-query for in-line of E_CENTER_STOCK_INFO_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class ECenterStockInfoSendCIQ extends AbstractBsECenterStockInfoSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsECenterStockInfoSendCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ECenterStockInfoSendCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsECenterStockInfoSendCQ myCQ) {
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
    protected ConditionValue xgetCValueCenterStockInfoSendId() { return _myCQ.xdfgetCenterStockInfoSendId(); }
    protected ConditionValue xgetCValueSeqno() { return _myCQ.xdfgetSeqno(); }
    protected ConditionValue xgetCValueProcessDt() { return _myCQ.xdfgetProcessDt(); }
    protected ConditionValue xgetCValueWarehouseCd() { return _myCQ.xdfgetWarehouseCd(); }
    protected ConditionValue xgetCValueWarehouseName() { return _myCQ.xdfgetWarehouseName(); }
    protected ConditionValue xgetCValueItemCd() { return _myCQ.xdfgetItemCd(); }
    protected ConditionValue xgetCValueItemName() { return _myCQ.xdfgetItemName(); }
    protected ConditionValue xgetCValueLimitDate() { return _myCQ.xdfgetLimitDate(); }
    protected ConditionValue xgetCValueDesignCd() { return _myCQ.xdfgetDesignCd(); }
    protected ConditionValue xgetCValueInvType() { return _myCQ.xdfgetInvType(); }
    protected ConditionValue xgetCValueInvNum() { return _myCQ.xdfgetInvNum(); }
    protected ConditionValue xgetCValueTransportCd() { return _myCQ.xdfgetTransportCd(); }
    protected ConditionValue xgetCValueFirmtransportCd() { return _myCQ.xdfgetFirmtransportCd(); }
    protected ConditionValue xgetCValueSourceCd() { return _myCQ.xdfgetSourceCd(); }
    protected ConditionValue xgetCValueSourceName() { return _myCQ.xdfgetSourceName(); }
    protected ConditionValue xgetCValueSchDate() { return _myCQ.xdfgetSchDate(); }
    protected ConditionValue xgetCValueReceiveDate() { return _myCQ.xdfgetReceiveDate(); }
    protected ConditionValue xgetCValueSchreceiveDate() { return _myCQ.xdfgetSchreceiveDate(); }
    protected ConditionValue xgetCValueSchreceiveNum() { return _myCQ.xdfgetSchreceiveNum(); }
    protected ConditionValue xgetCValueTransportPriority() { return _myCQ.xdfgetTransportPriority(); }
    protected ConditionValue xgetCValueItemSort() { return _myCQ.xdfgetItemSort(); }
    protected ConditionValue xgetCValueUseType() { return _myCQ.xdfgetUseType(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendFlg() { return _myCQ.xdfgetSendFlg(); }
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
    public String keepScalarCondition(ECenterStockInfoSendCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ECenterStockInfoSendCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ECenterStockInfoSendCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ECenterStockInfoSendCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ECenterStockInfoSendCB.class.getName(); }
    protected String xinCQ() { return ECenterStockInfoSendCQ.class.getName(); }
}
