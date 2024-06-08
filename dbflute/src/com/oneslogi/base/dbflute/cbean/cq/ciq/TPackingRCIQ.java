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
 * The condition-query for in-line of T_PACKING_R.
 * @author DBFlute(AutoGenerator)
 */
public class TPackingRCIQ extends AbstractBsTPackingRCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTPackingRCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TPackingRCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTPackingRCQ myCQ) {
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
    protected ConditionValue xgetCValuePackingHId() { return _myCQ.xdfgetPackingHId(); }
    public String keepPackingHId_InScopeRelation_TPackingH(TPackingHCQ sq)
    { return _myCQ.keepPackingHId_InScopeRelation_TPackingH(sq); }
    public String keepPackingHId_NotInScopeRelation_TPackingH(TPackingHCQ sq)
    { return _myCQ.keepPackingHId_NotInScopeRelation_TPackingH(sq); }
    protected ConditionValue xgetCValueStwOutFlg() { return _myCQ.xdfgetStwOutFlg(); }
    protected ConditionValue xgetCValueStwOutUserId() { return _myCQ.xdfgetStwOutUserId(); }
    public String keepStwOutUserId_InScopeRelation_BUserByStwOutUserId(BUserCQ sq)
    { return _myCQ.keepStwOutUserId_InScopeRelation_BUserByStwOutUserId(sq); }
    public String keepStwOutUserId_NotInScopeRelation_BUserByStwOutUserId(BUserCQ sq)
    { return _myCQ.keepStwOutUserId_NotInScopeRelation_BUserByStwOutUserId(sq); }
    protected ConditionValue xgetCValueStwOutDt() { return _myCQ.xdfgetStwOutDt(); }
    protected ConditionValue xgetCValueTagOutFlg() { return _myCQ.xdfgetTagOutFlg(); }
    protected ConditionValue xgetCValueTagOutUserId() { return _myCQ.xdfgetTagOutUserId(); }
    public String keepTagOutUserId_InScopeRelation_BUserByTagOutUserId(BUserCQ sq)
    { return _myCQ.keepTagOutUserId_InScopeRelation_BUserByTagOutUserId(sq); }
    public String keepTagOutUserId_NotInScopeRelation_BUserByTagOutUserId(BUserCQ sq)
    { return _myCQ.keepTagOutUserId_NotInScopeRelation_BUserByTagOutUserId(sq); }
    protected ConditionValue xgetCValueTagOutDt() { return _myCQ.xdfgetTagOutDt(); }
    protected ConditionValue xgetCValueTagDlUrl() { return _myCQ.xdfgetTagDlUrl(); }
    protected ConditionValue xgetCValueInspectionOutFlg() { return _myCQ.xdfgetInspectionOutFlg(); }
    protected ConditionValue xgetCValueInspectionOutUserId() { return _myCQ.xdfgetInspectionOutUserId(); }
    public String keepInspectionOutUserId_InScopeRelation_BUserByInspectionOutUserId(BUserCQ sq)
    { return _myCQ.keepInspectionOutUserId_InScopeRelation_BUserByInspectionOutUserId(sq); }
    public String keepInspectionOutUserId_NotInScopeRelation_BUserByInspectionOutUserId(BUserCQ sq)
    { return _myCQ.keepInspectionOutUserId_NotInScopeRelation_BUserByInspectionOutUserId(sq); }
    protected ConditionValue xgetCValueInspectionOutDt() { return _myCQ.xdfgetInspectionOutDt(); }
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
    public String keepScalarCondition(TPackingRCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TPackingRCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TPackingRCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TPackingRCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TPackingRCB.class.getName(); }
    protected String xinCQ() { return TPackingRCQ.class.getName(); }
}
