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
 * The condition-query for in-line of P_PRINTER_ATTRIBUTE.
 * @author DBFlute(AutoGenerator)
 */
public class PPrinterAttributeCIQ extends AbstractBsPPrinterAttributeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPPrinterAttributeCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PPrinterAttributeCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPPrinterAttributeCQ myCQ) {
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
    protected ConditionValue xgetCValuePrinterAttributeId() { return _myCQ.xdfgetPrinterAttributeId(); }
    public String keepPrinterAttributeId_ExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrinterAttributeId_ExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrinterAttributeId_ExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPrinterAttributeId_NotExistsReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrinterAttributeId_NotExistsReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrinterAttributeId_NotExistsReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPrinterAttributeId_SpecifyDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrinterAttributeId_SpecifyDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrinterAttributeId_SpecifyDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPrinterAttributeId_QueryDerivedReferrer_PLayoutPrintSettingList(PLayoutPrintSettingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterAttributeId_QueryDerivedReferrer_PLayoutPrintSettingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdList(PUserAutoPrintSettingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterAttributeId_QueryDerivedReferrer_PUserAutoPrintSettingByPrinterAttributeIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdList(PTerminalAutoPrintSetCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPrinterAttributeId_QueryDerivedReferrer_PTerminalAutoPrintSetByPrinterAttributeIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValuePrinterId() { return _myCQ.xdfgetPrinterId(); }
    public String keepPrinterId_InScopeRelation_PPrinter(PPrinterCQ sq)
    { return _myCQ.keepPrinterId_InScopeRelation_PPrinter(sq); }
    public String keepPrinterId_NotInScopeRelation_PPrinter(PPrinterCQ sq)
    { return _myCQ.keepPrinterId_NotInScopeRelation_PPrinter(sq); }
    protected ConditionValue xgetCValueTrayNm() { return _myCQ.xdfgetTrayNm(); }
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
    public String keepScalarCondition(PPrinterAttributeCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PPrinterAttributeCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PPrinterAttributeCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PPrinterAttributeCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PPrinterAttributeCB.class.getName(); }
    protected String xinCQ() { return PPrinterAttributeCQ.class.getName(); }
}
