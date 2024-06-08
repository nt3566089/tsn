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
 * The condition-query for in-line of M_IMPORT_TYPE_B.
 * @author DBFlute(AutoGenerator)
 */
public class MImportTypeBCIQ extends AbstractBsMImportTypeBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMImportTypeBCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MImportTypeBCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMImportTypeBCQ myCQ) {
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
    protected ConditionValue xgetCValueImportTypeBId() { return _myCQ.xdfgetImportTypeBId(); }
    public String keepImportTypeBId_ExistsReferrer_MImportTypeBCopyBList(MImportTypeBCopyBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepImportTypeBId_ExistsReferrer_MImportTypeBCopyHList(MImportTypeBCopyHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepImportTypeBId_NotExistsReferrer_MImportTypeBCopyBList(MImportTypeBCopyBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepImportTypeBId_NotExistsReferrer_MImportTypeBCopyHList(MImportTypeBCopyHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepImportTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyBList(MImportTypeBCopyBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepImportTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyHList(MImportTypeBCopyHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyBList(MImportTypeBCopyBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyHList(MImportTypeBCopyHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueImportTypeId() { return _myCQ.xdfgetImportTypeId(); }
    public String keepImportTypeId_InScopeRelation_MImportType(MImportTypeCQ sq)
    { return _myCQ.keepImportTypeId_InScopeRelation_MImportType(sq); }
    public String keepImportTypeId_NotInScopeRelation_MImportType(MImportTypeCQ sq)
    { return _myCQ.keepImportTypeId_NotInScopeRelation_MImportType(sq); }
    protected ConditionValue xgetCValueColumnNo() { return _myCQ.xdfgetColumnNo(); }
    protected ConditionValue xgetCValueEdiColumnId() { return _myCQ.xdfgetEdiColumnId(); }
    public String keepEdiColumnId_InScopeRelation_MEdiColumn(MEdiColumnCQ sq)
    { return _myCQ.keepEdiColumnId_InScopeRelation_MEdiColumn(sq); }
    public String keepEdiColumnId_NotInScopeRelation_MEdiColumn(MEdiColumnCQ sq)
    { return _myCQ.keepEdiColumnId_NotInScopeRelation_MEdiColumn(sq); }
    protected ConditionValue xgetCValueUploadColumnNm() { return _myCQ.xdfgetUploadColumnNm(); }
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
    public String keepScalarCondition(MImportTypeBCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MImportTypeBCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MImportTypeBCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MImportTypeBCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MImportTypeBCB.class.getName(); }
    protected String xinCQ() { return MImportTypeBCQ.class.getName(); }
}
