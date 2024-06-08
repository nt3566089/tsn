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
 * The condition-query for in-line of M_IMPORT_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class MImportTypeCIQ extends AbstractBsMImportTypeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMImportTypeCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MImportTypeCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMImportTypeCQ myCQ) {
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
    protected ConditionValue xgetCValueImportTypeId() { return _myCQ.xdfgetImportTypeId(); }
    public String keepImportTypeId_ExistsReferrer_MImportTypeBList(MImportTypeBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepImportTypeId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepImportTypeId_NotExistsReferrer_MImportTypeBList(MImportTypeBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepImportTypeId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepImportTypeId_SpecifyDerivedReferrer_MImportTypeBList(MImportTypeBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepImportTypeId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepImportTypeId_QueryDerivedReferrer_MImportTypeBList(MImportTypeBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepImportTypeId_QueryDerivedReferrer_MImportTypeBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepImportTypeId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepImportTypeId_QueryDerivedReferrer_TEcOrderHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueImportTypeCd() { return _myCQ.xdfgetImportTypeCd(); }
    protected ConditionValue xgetCValueImportTypeNm() { return _myCQ.xdfgetImportTypeNm(); }
    protected ConditionValue xgetCValueEdiId() { return _myCQ.xdfgetEdiId(); }
    public String keepEdiId_InScopeRelation_MEdi(MEdiCQ sq)
    { return _myCQ.keepEdiId_InScopeRelation_MEdi(sq); }
    public String keepEdiId_NotInScopeRelation_MEdi(MEdiCQ sq)
    { return _myCQ.keepEdiId_NotInScopeRelation_MEdi(sq); }
    protected ConditionValue xgetCValueCharacterCd() { return _myCQ.xdfgetCharacterCd(); }
    protected ConditionValue xgetCValueLineFeedCd() { return _myCQ.xdfgetLineFeedCd(); }
    protected ConditionValue xgetCValueDelimiter() { return _myCQ.xdfgetDelimiter(); }
    protected ConditionValue xgetCValueSkippingRows() { return _myCQ.xdfgetSkippingRows(); }
    protected ConditionValue xgetCValueUploadTableNm() { return _myCQ.xdfgetUploadTableNm(); }
    protected ConditionValue xgetCValueDuplicateColumnNm() { return _myCQ.xdfgetDuplicateColumnNm(); }
    protected ConditionValue xgetCValueRcvIdColumnNm() { return _myCQ.xdfgetRcvIdColumnNm(); }
    protected ConditionValue xgetCValueRowNoColumnNm() { return _myCQ.xdfgetRowNoColumnNm(); }
    protected ConditionValue xgetCValueGiftStatementType() { return _myCQ.xdfgetGiftStatementType(); }
    protected ConditionValue xgetCValueGiftStatementDetail() { return _myCQ.xdfgetGiftStatementDetail(); }
    protected ConditionValue xgetCValueOKeepingDays() { return _myCQ.xdfgetOKeepingDays(); }
    protected ConditionValue xgetCValueStatementTitle() { return _myCQ.xdfgetStatementTitle(); }
    protected ConditionValue xgetCValueStatementUrl() { return _myCQ.xdfgetStatementUrl(); }
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
    public String keepScalarCondition(MImportTypeCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MImportTypeCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MImportTypeCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MImportTypeCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MImportTypeCB.class.getName(); }
    protected String xinCQ() { return MImportTypeCQ.class.getName(); }
}
