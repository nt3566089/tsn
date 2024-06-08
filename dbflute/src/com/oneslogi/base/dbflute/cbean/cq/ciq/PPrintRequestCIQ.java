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
 * The condition-query for in-line of P_PRINT_REQUEST.
 * @author DBFlute(AutoGenerator)
 */
public class PPrintRequestCIQ extends AbstractBsPPrintRequestCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPPrintRequestCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PPrintRequestCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPPrintRequestCQ myCQ) {
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
    public String keepPrintRequestId_ExistsReferrer_PPrintQueueList(PPrintQueueCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrintRequestId_ExistsReferrer_PPrintRequestBinaryList(PPrintRequestBinaryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrintRequestId_ExistsReferrer_PPrintRequestDataAsOne(PPrintRequestDataCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrintRequestId_ExistsReferrer_PPrintRequestHistList(PPrintRequestHistCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrintRequestId_NotExistsReferrer_PPrintQueueList(PPrintQueueCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrintRequestId_NotExistsReferrer_PPrintRequestBinaryList(PPrintRequestBinaryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrintRequestId_NotExistsReferrer_PPrintRequestDataAsOne(PPrintRequestDataCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrintRequestId_NotExistsReferrer_PPrintRequestHistList(PPrintRequestHistCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrintRequestId_SpecifyDerivedReferrer_PPrintQueueList(PPrintQueueCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrintRequestId_SpecifyDerivedReferrer_PPrintRequestBinaryList(PPrintRequestBinaryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrintRequestId_SpecifyDerivedReferrer_PPrintRequestHistList(PPrintRequestHistCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrintRequestId_QueryDerivedReferrer_PPrintQueueList(PPrintQueueCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrintRequestId_QueryDerivedReferrer_PPrintQueueListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrintRequestId_QueryDerivedReferrer_PPrintRequestBinaryList(PPrintRequestBinaryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrintRequestId_QueryDerivedReferrer_PPrintRequestBinaryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrintRequestId_QueryDerivedReferrer_PPrintRequestHistList(PPrintRequestHistCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrintRequestId_QueryDerivedReferrer_PPrintRequestHistListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueReportCd() { return _myCQ.xdfgetReportCd(); }
    protected ConditionValue xgetCValueReportNm() { return _myCQ.xdfgetReportNm(); }
    protected ConditionValue xgetCValueReportLayoutNm() { return _myCQ.xdfgetReportLayoutNm(); }
    protected ConditionValue xgetCValuePrinterGroupId() { return _myCQ.xdfgetPrinterGroupId(); }
    protected ConditionValue xgetCValuePrinterGroupNm() { return _myCQ.xdfgetPrinterGroupNm(); }
    protected ConditionValue xgetCValuePrinterNm() { return _myCQ.xdfgetPrinterNm(); }
    protected ConditionValue xgetCValueTrayNm() { return _myCQ.xdfgetTrayNm(); }
    protected ConditionValue xgetCValuePrintNum() { return _myCQ.xdfgetPrintNum(); }
    protected ConditionValue xgetCValueDocumentPageSize() { return _myCQ.xdfgetDocumentPageSize(); }
    protected ConditionValue xgetCValueSheetCollate() { return _myCQ.xdfgetSheetCollate(); }
    protected ConditionValue xgetCValuePrintStatus() { return _myCQ.xdfgetPrintStatus(); }
    protected ConditionValue xgetCValueFirstPrintDt() { return _myCQ.xdfgetFirstPrintDt(); }
    protected ConditionValue xgetCValueLatestPrintDt() { return _myCQ.xdfgetLatestPrintDt(); }
    protected ConditionValue xgetCValuePrintedCount() { return _myCQ.xdfgetPrintedCount(); }
    protected ConditionValue xgetCValuePrintedFlg() { return _myCQ.xdfgetPrintedFlg(); }
    protected ConditionValue xgetCValueQueueAddDt() { return _myCQ.xdfgetQueueAddDt(); }
    protected ConditionValue xgetCValuePrintDataType() { return _myCQ.xdfgetPrintDataType(); }
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
    public String keepScalarCondition(PPrintRequestCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PPrintRequestCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PPrintRequestCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PPrintRequestCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PPrintRequestCB.class.getName(); }
    protected String xinCQ() { return PPrintRequestCQ.class.getName(); }
}
