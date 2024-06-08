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
 * The condition-query for in-line of B_DICT.
 * @author DBFlute(AutoGenerator)
 */
public class BDictCIQ extends AbstractBsBDictCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBDictCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BDictCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBDictCQ myCQ) {
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
    protected ConditionValue xgetCValueDictId() { return _myCQ.xdfgetDictId(); }
    public String keepDictId_ExistsReferrer_BArgList(BArgCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDictId_ExistsReferrer_BColList(BColCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDictId_ExistsReferrer_BDictCultureList(BDictCultureCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDictId_ExistsReferrer_BDictValidAsOne(BDictValidCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDictId_ExistsReferrer_BItemList(BItemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDictId_ExistsReferrer_BMenuGrpList(BMenuGrpCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDictId_ExistsReferrer_BScreenList(BScreenCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDictId_ExistsReferrer_MHtDictAsOne(MHtDictCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDictId_ExistsReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDictId_ExistsReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDictId_NotExistsReferrer_BArgList(BArgCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDictId_NotExistsReferrer_BColList(BColCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDictId_NotExistsReferrer_BDictCultureList(BDictCultureCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDictId_NotExistsReferrer_BDictValidAsOne(BDictValidCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDictId_NotExistsReferrer_BItemList(BItemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDictId_NotExistsReferrer_BMenuGrpList(BMenuGrpCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDictId_NotExistsReferrer_BScreenList(BScreenCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDictId_NotExistsReferrer_MHtDictAsOne(MHtDictCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDictId_NotExistsReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDictId_NotExistsReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDictId_SpecifyDerivedReferrer_BArgList(BArgCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDictId_SpecifyDerivedReferrer_BColList(BColCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDictId_SpecifyDerivedReferrer_BDictCultureList(BDictCultureCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDictId_SpecifyDerivedReferrer_BItemList(BItemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDictId_SpecifyDerivedReferrer_BMenuGrpList(BMenuGrpCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDictId_SpecifyDerivedReferrer_BScreenList(BScreenCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDictId_SpecifyDerivedReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDictId_SpecifyDerivedReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_BArgList(BArgCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_BArgListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_BColList(BColCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_BColListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_BDictCultureList(BDictCultureCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_BDictCultureListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_BItemList(BItemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_BItemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_BMenuGrpList(BMenuGrpCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_BMenuGrpListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_BScreenList(BScreenCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_BScreenListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_PReportLayoutItemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDictId_QueryDerivedReferrer_PSubrepLayoutItemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueDictNm() { return _myCQ.xdfgetDictNm(); }
    protected ConditionValue xgetCValueDataType() { return _myCQ.xdfgetDataType(); }
    protected ConditionValue xgetCValueSystemType() { return _myCQ.xdfgetSystemType(); }
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
    public String keepScalarCondition(BDictCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BDictCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BDictCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BDictCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BDictCB.class.getName(); }
    protected String xinCQ() { return BDictCQ.class.getName(); }
}
