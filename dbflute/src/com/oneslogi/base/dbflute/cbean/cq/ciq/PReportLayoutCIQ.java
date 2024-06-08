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
 * The condition-query for in-line of P_REPORT_LAYOUT.
 * @author DBFlute(AutoGenerator)
 */
public class PReportLayoutCIQ extends AbstractBsPReportLayoutCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPReportLayoutCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PReportLayoutCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPReportLayoutCQ myCQ) {
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
    protected ConditionValue xgetCValueReportLayoutId() { return _myCQ.xdfgetReportLayoutId(); }
    public String keepReportLayoutId_ExistsReferrer_PLayoutPrintSettingAsOne(PLayoutPrintSettingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepReportLayoutId_ExistsReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepReportLayoutId_ExistsReferrer_PSubrepLayoutAsOne(PSubrepLayoutCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepReportLayoutId_ExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepReportLayoutId_ExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepReportLayoutId_NotExistsReferrer_PLayoutPrintSettingAsOne(PLayoutPrintSettingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepReportLayoutId_NotExistsReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepReportLayoutId_NotExistsReferrer_PSubrepLayoutAsOne(PSubrepLayoutCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepReportLayoutId_NotExistsReferrer_PUserAutoPrintSettingByReportLayoutIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepReportLayoutId_NotExistsReferrer_PTerminalAutoPrintSetByReportLayoutIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepReportLayoutId_SpecifyDerivedReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepReportLayoutId_SpecifyDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepReportLayoutId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepReportLayoutId_QueryDerivedReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepReportLayoutId_QueryDerivedReferrer_PReportLayoutItemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepReportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepReportLayoutId_QueryDerivedReferrer_PUserAutoPrintSettingByReportLayoutIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepReportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepReportLayoutId_QueryDerivedReferrer_PTerminalAutoPrintSetByReportLayoutIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueReportId() { return _myCQ.xdfgetReportId(); }
    public String keepReportId_InScopeRelation_PReport(PReportCQ sq)
    { return _myCQ.keepReportId_InScopeRelation_PReport(sq); }
    public String keepReportId_NotInScopeRelation_PReport(PReportCQ sq)
    { return _myCQ.keepReportId_NotInScopeRelation_PReport(sq); }
    protected ConditionValue xgetCValueReportLayoutNm() { return _myCQ.xdfgetReportLayoutNm(); }
    protected ConditionValue xgetCValueReportLayoutData() { return _myCQ.xdfgetReportLayoutData(); }
    protected ConditionValue xgetCValueUpdatable() { return _myCQ.xdfgetUpdatable(); }
    protected ConditionValue xgetCValueAttribute1() { return _myCQ.xdfgetAttribute1(); }
    protected ConditionValue xgetCValueAttribute2() { return _myCQ.xdfgetAttribute2(); }
    protected ConditionValue xgetCValueAttribute3() { return _myCQ.xdfgetAttribute3(); }
    protected ConditionValue xgetCValueAttribute4() { return _myCQ.xdfgetAttribute4(); }
    protected ConditionValue xgetCValueAttribute5() { return _myCQ.xdfgetAttribute5(); }
    protected ConditionValue xgetCValueAutoPrintTargetFlg() { return _myCQ.xdfgetAutoPrintTargetFlg(); }
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
    public String keepScalarCondition(PReportLayoutCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PReportLayoutCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PReportLayoutCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PReportLayoutCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PReportLayoutCB.class.getName(); }
    protected String xinCQ() { return PReportLayoutCQ.class.getName(); }
}
