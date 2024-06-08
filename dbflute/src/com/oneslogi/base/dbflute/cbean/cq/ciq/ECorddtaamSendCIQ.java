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
 * The condition-query for in-line of E_CORDDTAAM_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class ECorddtaamSendCIQ extends AbstractBsECorddtaamSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsECorddtaamSendCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ECorddtaamSendCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsECorddtaamSendCQ myCQ) {
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
    protected ConditionValue xgetCValueCorddtaamSendId() { return _myCQ.xdfgetCorddtaamSendId(); }
    protected ConditionValue xgetCValueSendCd() { return _myCQ.xdfgetSendCd(); }
    protected ConditionValue xgetCValueSendRowId() { return _myCQ.xdfgetSendRowId(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueDelivayCenterCd() { return _myCQ.xdfgetDelivayCenterCd(); }
    protected ConditionValue xgetCValueDeliveryDatetime() { return _myCQ.xdfgetDeliveryDatetime(); }
    protected ConditionValue xgetCValueDirectionCd() { return _myCQ.xdfgetDirectionCd(); }
    protected ConditionValue xgetCValuePistonType() { return _myCQ.xdfgetPistonType(); }
    protected ConditionValue xgetCValueCapDirectionCd() { return _myCQ.xdfgetCapDirectionCd(); }
    protected ConditionValue xgetCValueCapPistonType() { return _myCQ.xdfgetCapPistonType(); }
    protected ConditionValue xgetCValueSortLineCd() { return _myCQ.xdfgetSortLineCd(); }
    protected ConditionValue xgetCValueSortOrder() { return _myCQ.xdfgetSortOrder(); }
    protected ConditionValue xgetCValueCustomerCd() { return _myCQ.xdfgetCustomerCd(); }
    protected ConditionValue xgetCValueCustomerNm() { return _myCQ.xdfgetCustomerNm(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueSlqacb() { return _myCQ.xdfgetSlqacb(); }
    protected ConditionValue xgetCValueSlqact() { return _myCQ.xdfgetSlqact(); }
    protected ConditionValue xgetCValueLineBlock() { return _myCQ.xdfgetLineBlock(); }
    protected ConditionValue xgetCValueLocationNo() { return _myCQ.xdfgetLocationNo(); }
    protected ConditionValue xgetCValueLocationType() { return _myCQ.xdfgetLocationType(); }
    protected ConditionValue xgetCValueDeliveryPrintRank() { return _myCQ.xdfgetDeliveryPrintRank(); }
    protected ConditionValue xgetCValueDeliverySeqNo() { return _myCQ.xdfgetDeliverySeqNo(); }
    protected ConditionValue xgetCValueDeliveryBranchNo() { return _myCQ.xdfgetDeliveryBranchNo(); }
    protected ConditionValue xgetCValueSortWorkDt() { return _myCQ.xdfgetSortWorkDt(); }
    protected ConditionValue xgetCValueCsroprtcnt() { return _myCQ.xdfgetCsroprtcnt(); }
    protected ConditionValue xgetCValueCuttopdirassord() { return _myCQ.xdfgetCuttopdirassord(); }
    protected ConditionValue xgetCValueProductType() { return _myCQ.xdfgetProductType(); }
    protected ConditionValue xgetCValueBoxNo() { return _myCQ.xdfgetBoxNo(); }
    protected ConditionValue xgetCValueBoxNoSeqNo() { return _myCQ.xdfgetBoxNoSeqNo(); }
    protected ConditionValue xgetCValueBoxType() { return _myCQ.xdfgetBoxType(); }
    protected ConditionValue xgetCValueMergeBoxVisibleType() { return _myCQ.xdfgetMergeBoxVisibleType(); }
    protected ConditionValue xgetCValueDmVisibleType() { return _myCQ.xdfgetDmVisibleType(); }
    protected ConditionValue xgetCValueTotalBoxCnt() { return _myCQ.xdfgetTotalBoxCnt(); }
    protected ConditionValue xgetCValueBoxCartonSum() { return _myCQ.xdfgetBoxCartonSum(); }
    protected ConditionValue xgetCValueBoxCartonSortNum() { return _myCQ.xdfgetBoxCartonSortNum(); }
    protected ConditionValue xgetCValueTttopdedrnk() { return _myCQ.xdfgetTttopdedrnk(); }
    protected ConditionValue xgetCValueLineBlockBoxNo() { return _myCQ.xdfgetLineBlockBoxNo(); }
    protected ConditionValue xgetCValueLineBlockTotalBoxCnt() { return _myCQ.xdfgetLineBlockTotalBoxCnt(); }
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
    public String keepScalarCondition(ECorddtaamSendCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ECorddtaamSendCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ECorddtaamSendCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ECorddtaamSendCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ECorddtaamSendCB.class.getName(); }
    protected String xinCQ() { return ECorddtaamSendCQ.class.getName(); }
}
