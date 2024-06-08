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
 * The condition-query for in-line of M_EDI.
 * @author DBFlute(AutoGenerator)
 */
public class MEdiCIQ extends AbstractBsMEdiCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMEdiCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MEdiCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMEdiCQ myCQ) {
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
    protected ConditionValue xgetCValueEdiId() { return _myCQ.xdfgetEdiId(); }
    public String keepEdiId_ExistsReferrer_MEdiColumnList(MEdiColumnCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepEdiId_ExistsReferrer_MImportTypeList(MImportTypeCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepEdiId_NotExistsReferrer_MEdiColumnList(MEdiColumnCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepEdiId_NotExistsReferrer_MImportTypeList(MImportTypeCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepEdiId_SpecifyDerivedReferrer_MEdiColumnList(MEdiColumnCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepEdiId_SpecifyDerivedReferrer_MImportTypeList(MImportTypeCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepEdiId_QueryDerivedReferrer_MEdiColumnList(MEdiColumnCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepEdiId_QueryDerivedReferrer_MEdiColumnListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepEdiId_QueryDerivedReferrer_MImportTypeList(MImportTypeCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepEdiId_QueryDerivedReferrer_MImportTypeListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueEdiNm() { return _myCQ.xdfgetEdiNm(); }
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
    public String keepScalarCondition(MEdiCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MEdiCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MEdiCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MEdiCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MEdiCB.class.getName(); }
    protected String xinCQ() { return MEdiCQ.class.getName(); }
}
