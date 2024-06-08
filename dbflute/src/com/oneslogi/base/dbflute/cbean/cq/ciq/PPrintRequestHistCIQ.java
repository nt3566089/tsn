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
 * The condition-query for in-line of P_PRINT_REQUEST_HIST.
 * @author DBFlute(AutoGenerator)
 */
public class PPrintRequestHistCIQ extends AbstractBsPPrintRequestHistCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPPrintRequestHistCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PPrintRequestHistCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPPrintRequestHistCQ myCQ) {
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
    protected ConditionValue xgetCValuePrintRequestHistId() { return _myCQ.xdfgetPrintRequestHistId(); }
    protected ConditionValue xgetCValuePrintRequestId() { return _myCQ.xdfgetPrintRequestId(); }
    public String keepPrintRequestId_InScopeRelation_PPrintRequest(PPrintRequestCQ sq)
    { return _myCQ.keepPrintRequestId_InScopeRelation_PPrintRequest(sq); }
    public String keepPrintRequestId_NotInScopeRelation_PPrintRequest(PPrintRequestCQ sq)
    { return _myCQ.keepPrintRequestId_NotInScopeRelation_PPrintRequest(sq); }
    protected ConditionValue xgetCValuePrintRequestNo() { return _myCQ.xdfgetPrintRequestNo(); }
    protected ConditionValue xgetCValuePrinterNm() { return _myCQ.xdfgetPrinterNm(); }
    protected ConditionValue xgetCValueTrayNm() { return _myCQ.xdfgetTrayNm(); }
    protected ConditionValue xgetCValuePrintNum() { return _myCQ.xdfgetPrintNum(); }
    protected ConditionValue xgetCValueDocumentPageSize() { return _myCQ.xdfgetDocumentPageSize(); }
    protected ConditionValue xgetCValueSheetCollate() { return _myCQ.xdfgetSheetCollate(); }
    protected ConditionValue xgetCValuePrintResultClass() { return _myCQ.xdfgetPrintResultClass(); }
    protected ConditionValue xgetCValueProcessInfo() { return _myCQ.xdfgetProcessInfo(); }
    protected ConditionValue xgetCValueQueueAddDt() { return _myCQ.xdfgetQueueAddDt(); }
    protected ConditionValue xgetCValuePrintDt() { return _myCQ.xdfgetPrintDt(); }
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
    public String keepScalarCondition(PPrintRequestHistCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PPrintRequestHistCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PPrintRequestHistCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PPrintRequestHistCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PPrintRequestHistCB.class.getName(); }
    protected String xinCQ() { return PPrintRequestHistCQ.class.getName(); }
}
