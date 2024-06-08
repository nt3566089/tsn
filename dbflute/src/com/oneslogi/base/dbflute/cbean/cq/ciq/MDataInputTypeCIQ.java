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
 * The condition-query for in-line of M_DATA_INPUT_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class MDataInputTypeCIQ extends AbstractBsMDataInputTypeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMDataInputTypeCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MDataInputTypeCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMDataInputTypeCQ myCQ) {
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
    protected ConditionValue xgetCValueDataInputTypeId() { return _myCQ.xdfgetDataInputTypeId(); }
    public String keepDataInputTypeId_ExistsReferrer_MDataInputTypeBList(MDataInputTypeBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDataInputTypeId_NotExistsReferrer_MDataInputTypeBList(MDataInputTypeBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDataInputTypeId_SpecifyDerivedReferrer_MDataInputTypeBList(MDataInputTypeBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDataInputTypeId_QueryDerivedReferrer_MDataInputTypeBList(MDataInputTypeBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDataInputTypeId_QueryDerivedReferrer_MDataInputTypeBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueDataInputTypeCd() { return _myCQ.xdfgetDataInputTypeCd(); }
    protected ConditionValue xgetCValueDataInputTypeNm() { return _myCQ.xdfgetDataInputTypeNm(); }
    protected ConditionValue xgetCValueCharacterCd() { return _myCQ.xdfgetCharacterCd(); }
    protected ConditionValue xgetCValueLineFeedCd() { return _myCQ.xdfgetLineFeedCd(); }
    protected ConditionValue xgetCValueDelimiter() { return _myCQ.xdfgetDelimiter(); }
    protected ConditionValue xgetCValueSkippingRows() { return _myCQ.xdfgetSkippingRows(); }
    protected ConditionValue xgetCValueUploadTableNm() { return _myCQ.xdfgetUploadTableNm(); }
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
    public String keepScalarCondition(MDataInputTypeCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MDataInputTypeCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MDataInputTypeCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MDataInputTypeCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MDataInputTypeCB.class.getName(); }
    protected String xinCQ() { return MDataInputTypeCQ.class.getName(); }
}
