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
 * The condition-query for in-line of P_LAYOUT_PRINT_SETTING.
 * @author DBFlute(AutoGenerator)
 */
public class PLayoutPrintSettingCIQ extends AbstractBsPLayoutPrintSettingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPLayoutPrintSettingCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PLayoutPrintSettingCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPLayoutPrintSettingCQ myCQ) {
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
    protected ConditionValue xgetCValueLayoutPrintSettingId() { return _myCQ.xdfgetLayoutPrintSettingId(); }
    protected ConditionValue xgetCValueReportLayoutId() { return _myCQ.xdfgetReportLayoutId(); }
    public String keepReportLayoutId_InScopeRelation_PReportLayout(PReportLayoutCQ sq)
    { return _myCQ.keepReportLayoutId_InScopeRelation_PReportLayout(sq); }
    public String keepReportLayoutId_NotInScopeRelation_PReportLayout(PReportLayoutCQ sq)
    { return _myCQ.keepReportLayoutId_NotInScopeRelation_PReportLayout(sq); }
    protected ConditionValue xgetCValuePrinterGroupId() { return _myCQ.xdfgetPrinterGroupId(); }
    public String keepPrinterGroupId_InScopeRelation_PPrinterGroup(PPrinterGroupCQ sq)
    { return _myCQ.keepPrinterGroupId_InScopeRelation_PPrinterGroup(sq); }
    public String keepPrinterGroupId_NotInScopeRelation_PPrinterGroup(PPrinterGroupCQ sq)
    { return _myCQ.keepPrinterGroupId_NotInScopeRelation_PPrinterGroup(sq); }
    protected ConditionValue xgetCValuePrinterId() { return _myCQ.xdfgetPrinterId(); }
    public String keepPrinterId_InScopeRelation_PPrinter(PPrinterCQ sq)
    { return _myCQ.keepPrinterId_InScopeRelation_PPrinter(sq); }
    public String keepPrinterId_NotInScopeRelation_PPrinter(PPrinterCQ sq)
    { return _myCQ.keepPrinterId_NotInScopeRelation_PPrinter(sq); }
    protected ConditionValue xgetCValuePrinterAttributeId() { return _myCQ.xdfgetPrinterAttributeId(); }
    public String keepPrinterAttributeId_InScopeRelation_PPrinterAttribute(PPrinterAttributeCQ sq)
    { return _myCQ.keepPrinterAttributeId_InScopeRelation_PPrinterAttribute(sq); }
    public String keepPrinterAttributeId_NotInScopeRelation_PPrinterAttribute(PPrinterAttributeCQ sq)
    { return _myCQ.keepPrinterAttributeId_NotInScopeRelation_PPrinterAttribute(sq); }
    protected ConditionValue xgetCValuePrintNum() { return _myCQ.xdfgetPrintNum(); }
    protected ConditionValue xgetCValueSheetCollate() { return _myCQ.xdfgetSheetCollate(); }
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
    public String keepScalarCondition(PLayoutPrintSettingCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PLayoutPrintSettingCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PLayoutPrintSettingCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PLayoutPrintSettingCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PLayoutPrintSettingCB.class.getName(); }
    protected String xinCQ() { return PLayoutPrintSettingCQ.class.getName(); }
}
