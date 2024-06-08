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
 * The condition-query for in-line of T_WORK_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class TWorkLogCIQ extends AbstractBsTWorkLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTWorkLogCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TWorkLogCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTWorkLogCQ myCQ) {
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
    protected ConditionValue xgetCValueWorkLogId() { return _myCQ.xdfgetWorkLogId(); }
    public String keepWorkLogId_ExistsReferrer_TWorkDataList(TWorkDataCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepWorkLogId_NotExistsReferrer_TWorkDataList(TWorkDataCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepWorkLogId_SpecifyDerivedReferrer_TWorkDataList(TWorkDataCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepWorkLogId_QueryDerivedReferrer_TWorkDataList(TWorkDataCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepWorkLogId_QueryDerivedReferrer_TWorkDataListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClientCd() { return _myCQ.xdfgetClientCd(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueUserCd() { return _myCQ.xdfgetUserCd(); }
    protected ConditionValue xgetCValueWorkCd() { return _myCQ.xdfgetWorkCd(); }
    protected ConditionValue xgetCValueWorkDt() { return _myCQ.xdfgetWorkDt(); }
    protected ConditionValue xgetCValueWorkStartDt() { return _myCQ.xdfgetWorkStartDt(); }
    protected ConditionValue xgetCValueWorkEndDt() { return _myCQ.xdfgetWorkEndDt(); }
    protected ConditionValue xgetCValueWorkQty() { return _myCQ.xdfgetWorkQty(); }
    protected ConditionValue xgetCValueTraceItem() { return _myCQ.xdfgetTraceItem(); }
    protected ConditionValue xgetCValueMacAddress() { return _myCQ.xdfgetMacAddress(); }
    protected ConditionValue xgetCValueWorkStatus() { return _myCQ.xdfgetWorkStatus(); }
    protected ConditionValue xgetCValueWorkLogOutFlg() { return _myCQ.xdfgetWorkLogOutFlg(); }
    protected ConditionValue xgetCValueWorkLogOutDt() { return _myCQ.xdfgetWorkLogOutDt(); }
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
    public String keepScalarCondition(TWorkLogCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TWorkLogCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TWorkLogCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TWorkLogCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TWorkLogCB.class.getName(); }
    protected String xinCQ() { return TWorkLogCQ.class.getName(); }
}
