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
 * The condition-query for in-line of P_SUBREP_LAYOUT.
 * @author DBFlute(AutoGenerator)
 */
public class PSubrepLayoutCIQ extends AbstractBsPSubrepLayoutCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPSubrepLayoutCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PSubrepLayoutCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPSubrepLayoutCQ myCQ) {
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
    protected ConditionValue xgetCValueSubrepLayoutId() { return _myCQ.xdfgetSubrepLayoutId(); }
    public String keepSubrepLayoutId_ExistsReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSubrepLayoutId_NotExistsReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSubrepLayoutId_SpecifyDerivedReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSubrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSubrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueReportLayoutId() { return _myCQ.xdfgetReportLayoutId(); }
    public String keepReportLayoutId_InScopeRelation_PReportLayout(PReportLayoutCQ sq)
    { return _myCQ.keepReportLayoutId_InScopeRelation_PReportLayout(sq); }
    public String keepReportLayoutId_NotInScopeRelation_PReportLayout(PReportLayoutCQ sq)
    { return _myCQ.keepReportLayoutId_NotInScopeRelation_PReportLayout(sq); }
    protected ConditionValue xgetCValueSubrepLayoutData() { return _myCQ.xdfgetSubrepLayoutData(); }
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
    public String keepScalarCondition(PSubrepLayoutCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PSubrepLayoutCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PSubrepLayoutCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PSubrepLayoutCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PSubrepLayoutCB.class.getName(); }
    protected String xinCQ() { return PSubrepLayoutCQ.class.getName(); }
}
