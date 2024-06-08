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
 * The condition-query for in-line of P_PRINTER.
 * @author DBFlute(AutoGenerator)
 */
public class PPrinterCIQ extends AbstractBsPPrinterCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPPrinterCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PPrinterCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPPrinterCQ myCQ) {
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
    protected ConditionValue xgetCValuePrinterId() { return _myCQ.xdfgetPrinterId(); }
    public String keepPrinterId_ExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrinterId_ExistsReferrer_PPrinterAttributeList(PPrinterAttributeCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrinterId_ExistsReferrer_PUserAutoPrintSettingByPrinterIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrinterId_ExistsReferrer_PTerminalAutoPrintSetByPrinterIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrinterId_NotExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrinterId_NotExistsReferrer_PPrinterAttributeList(PPrinterAttributeCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrinterId_NotExistsReferrer_PUserAutoPrintSettingByPrinterIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrinterId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrinterId_SpecifyDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrinterId_SpecifyDerivedReferrer_PPrinterAttributeList(PPrinterAttributeCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrinterId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrinterId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrinterId_QueryDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterId_QueryDerivedReferrer_PLayoutPrintSettingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterId_QueryDerivedReferrer_PPrinterAttributeList(PPrinterAttributeCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterId_QueryDerivedReferrer_PPrinterAttributeListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValuePrinterGroupId() { return _myCQ.xdfgetPrinterGroupId(); }
    public String keepPrinterGroupId_InScopeRelation_PPrinterGroup(PPrinterGroupCQ sq)
    { return _myCQ.keepPrinterGroupId_InScopeRelation_PPrinterGroup(sq); }
    public String keepPrinterGroupId_NotInScopeRelation_PPrinterGroup(PPrinterGroupCQ sq)
    { return _myCQ.keepPrinterGroupId_NotInScopeRelation_PPrinterGroup(sq); }
    protected ConditionValue xgetCValuePrinterNm() { return _myCQ.xdfgetPrinterNm(); }
    protected ConditionValue xgetCValueVisible() { return _myCQ.xdfgetVisible(); }
    protected ConditionValue xgetCValueAddTerminal() { return _myCQ.xdfgetAddTerminal(); }
    protected ConditionValue xgetCValueUpdTerminal() { return _myCQ.xdfgetUpdTerminal(); }
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
    public String keepScalarCondition(PPrinterCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PPrinterCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PPrinterCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PPrinterCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PPrinterCB.class.getName(); }
    protected String xinCQ() { return PPrinterCQ.class.getName(); }
}
