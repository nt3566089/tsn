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
 * The condition-query for in-line of P_PRINT_REQUEST_DATA.
 * @author DBFlute(AutoGenerator)
 */
public class PPrintRequestDataCIQ extends AbstractBsPPrintRequestDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPPrintRequestDataCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PPrintRequestDataCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPPrintRequestDataCQ myCQ) {
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
    protected ConditionValue xgetCValuePrintRequestId() { return _myCQ.xdfgetPrintRequestId(); }
    public String keepPrintRequestId_InScopeRelation_PPrintRequest(PPrintRequestCQ sq)
    { return _myCQ.keepPrintRequestId_InScopeRelation_PPrintRequest(sq); }
    public String keepPrintRequestId_NotInScopeRelation_PPrintRequest(PPrintRequestCQ sq)
    { return _myCQ.keepPrintRequestId_NotInScopeRelation_PPrintRequest(sq); }
    protected ConditionValue xgetCValueReportLayoutData() { return _myCQ.xdfgetReportLayoutData(); }
    protected ConditionValue xgetCValueSubrepLayoutData() { return _myCQ.xdfgetSubrepLayoutData(); }
    protected ConditionValue xgetCValueReportLayoutBinary() { return _myCQ.xdfgetReportLayoutBinary(); }
    protected ConditionValue xgetCValueSubrepLayoutBinary() { return _myCQ.xdfgetSubrepLayoutBinary(); }
    protected ConditionValue xgetCValueDataForReport() { return _myCQ.xdfgetDataForReport(); }
    protected ConditionValue xgetCValueCultureCd() { return _myCQ.xdfgetCultureCd(); }
    protected ConditionValue xgetCValueTimeZoneCd() { return _myCQ.xdfgetTimeZoneCd(); }
    protected ConditionValue xgetCValueDateTimeFormat() { return _myCQ.xdfgetDateTimeFormat(); }
    protected ConditionValue xgetCValueDateFormat() { return _myCQ.xdfgetDateFormat(); }
    protected ConditionValue xgetCValueTimeFormat() { return _myCQ.xdfgetTimeFormat(); }
    protected ConditionValue xgetCValueNumberFormat() { return _myCQ.xdfgetNumberFormat(); }
    protected ConditionValue xgetCValueCurrencyFormat() { return _myCQ.xdfgetCurrencyFormat(); }
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
    public String keepScalarCondition(PPrintRequestDataCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PPrintRequestDataCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PPrintRequestDataCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PPrintRequestDataCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PPrintRequestDataCB.class.getName(); }
    protected String xinCQ() { return PPrintRequestDataCQ.class.getName(); }
}
