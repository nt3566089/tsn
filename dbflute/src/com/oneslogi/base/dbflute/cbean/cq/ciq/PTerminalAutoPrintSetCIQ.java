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
 * The condition-query for in-line of P_TERMINAL_AUTO_PRINT_SET.
 * @author DBFlute(AutoGenerator)
 */
public class PTerminalAutoPrintSetCIQ extends AbstractBsPTerminalAutoPrintSetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPTerminalAutoPrintSetCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PTerminalAutoPrintSetCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPTerminalAutoPrintSetCQ myCQ) {
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
    protected ConditionValue xgetCValueTerminalAutoPrintSetId() { return _myCQ.xdfgetTerminalAutoPrintSetId(); }
    protected ConditionValue xgetCValueTerminalAssignCd() { return _myCQ.xdfgetTerminalAssignCd(); }
    protected ConditionValue xgetCValueReportLayoutId() { return _myCQ.xdfgetReportLayoutId(); }
    public String keepReportLayoutId_InScopeRelation_PReportLayoutByReportLayoutId(PReportLayoutCQ sq)
    { return _myCQ.keepReportLayoutId_InScopeRelation_PReportLayoutByReportLayoutId(sq); }
    public String keepReportLayoutId_NotInScopeRelation_PReportLayoutByReportLayoutId(PReportLayoutCQ sq)
    { return _myCQ.keepReportLayoutId_NotInScopeRelation_PReportLayoutByReportLayoutId(sq); }
    protected ConditionValue xgetCValuePrinterGroupId() { return _myCQ.xdfgetPrinterGroupId(); }
    public String keepPrinterGroupId_InScopeRelation_PPrinterGroupByPrinterGroupId(PPrinterGroupCQ sq)
    { return _myCQ.keepPrinterGroupId_InScopeRelation_PPrinterGroupByPrinterGroupId(sq); }
    public String keepPrinterGroupId_NotInScopeRelation_PPrinterGroupByPrinterGroupId(PPrinterGroupCQ sq)
    { return _myCQ.keepPrinterGroupId_NotInScopeRelation_PPrinterGroupByPrinterGroupId(sq); }
    protected ConditionValue xgetCValuePrinterId() { return _myCQ.xdfgetPrinterId(); }
    public String keepPrinterId_InScopeRelation_PPrinterByPrinterId(PPrinterCQ sq)
    { return _myCQ.keepPrinterId_InScopeRelation_PPrinterByPrinterId(sq); }
    public String keepPrinterId_NotInScopeRelation_PPrinterByPrinterId(PPrinterCQ sq)
    { return _myCQ.keepPrinterId_NotInScopeRelation_PPrinterByPrinterId(sq); }
    protected ConditionValue xgetCValuePrinterAttributeId() { return _myCQ.xdfgetPrinterAttributeId(); }
    public String keepPrinterAttributeId_InScopeRelation_PPrinterAttributeByPrinterAttributeId(PPrinterAttributeCQ sq)
    { return _myCQ.keepPrinterAttributeId_InScopeRelation_PPrinterAttributeByPrinterAttributeId(sq); }
    public String keepPrinterAttributeId_NotInScopeRelation_PPrinterAttributeByPrinterAttributeId(PPrinterAttributeCQ sq)
    { return _myCQ.keepPrinterAttributeId_NotInScopeRelation_PPrinterAttributeByPrinterAttributeId(sq); }
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
    public String keepScalarCondition(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PTerminalAutoPrintSetCB.class.getName(); }
    protected String xinCQ() { return PTerminalAutoPrintSetCQ.class.getName(); }
}
