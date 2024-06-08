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
 * The condition-query for in-line of P_PRINTER_GROUP.
 * @author DBFlute(AutoGenerator)
 */
public class PPrinterGroupCIQ extends AbstractBsPPrinterGroupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPPrinterGroupCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PPrinterGroupCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPPrinterGroupCQ myCQ) {
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
    protected ConditionValue xgetCValuePrinterGroupId() { return _myCQ.xdfgetPrinterGroupId(); }
    public String keepPrinterGroupId_ExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrinterGroupId_ExistsReferrer_PPrinterList(PPrinterCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrinterGroupId_ExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrinterGroupId_ExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrinterGroupId_NotExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrinterGroupId_NotExistsReferrer_PPrinterList(PPrinterCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrinterGroupId_NotExistsReferrer_PUserAutoPrintSettingByPrinterGroupIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrinterGroupId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrinterGroupId_SpecifyDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrinterGroupId_SpecifyDerivedReferrer_PPrinterList(PPrinterCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrinterGroupId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrinterGroupId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrinterGroupId_QueryDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterGroupId_QueryDerivedReferrer_PLayoutPrintSettingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterGroupId_QueryDerivedReferrer_PPrinterList(PPrinterCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterGroupId_QueryDerivedReferrer_PPrinterListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterGroupId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterGroupIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterGroupId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterGroupIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValuePrinterGroupNm() { return _myCQ.xdfgetPrinterGroupNm(); }
    protected ConditionValue xgetCValueAttribute1() { return _myCQ.xdfgetAttribute1(); }
    protected ConditionValue xgetCValueAttribute2() { return _myCQ.xdfgetAttribute2(); }
    protected ConditionValue xgetCValueAttribute3() { return _myCQ.xdfgetAttribute3(); }
    protected ConditionValue xgetCValueAttribute4() { return _myCQ.xdfgetAttribute4(); }
    protected ConditionValue xgetCValueAttribute5() { return _myCQ.xdfgetAttribute5(); }
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
    public String keepScalarCondition(PPrinterGroupCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PPrinterGroupCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PPrinterGroupCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PPrinterGroupCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PPrinterGroupCB.class.getName(); }
    protected String xinCQ() { return PPrinterGroupCQ.class.getName(); }
}
