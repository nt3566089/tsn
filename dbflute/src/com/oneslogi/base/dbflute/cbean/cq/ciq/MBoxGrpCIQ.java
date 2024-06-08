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
 * The condition-query for in-line of M_BOX_GRP.
 * @author DBFlute(AutoGenerator)
 */
public class MBoxGrpCIQ extends AbstractBsMBoxGrpCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMBoxGrpCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MBoxGrpCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMBoxGrpCQ myCQ) {
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
    protected ConditionValue xgetCValueBoxGrpId() { return _myCQ.xdfgetBoxGrpId(); }
    public String keepBoxGrpId_ExistsReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBoxGrpId_ExistsReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBoxGrpId_NotExistsReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBoxGrpId_NotExistsReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBoxGrpId_SpecifyDerivedReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBoxGrpId_SpecifyDerivedReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBoxGrpId_QueryDerivedReferrer_MBoxGrpDtlList(MBoxGrpDtlCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxGrpId_QueryDerivedReferrer_MBoxGrpDtlListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxGrpId_QueryDerivedReferrer_MParamList(MParamCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBoxGrpId_QueryDerivedReferrer_MParamListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueBoxGrpCd() { return _myCQ.xdfgetBoxGrpCd(); }
    protected ConditionValue xgetCValueBoxGrpNm() { return _myCQ.xdfgetBoxGrpNm(); }
    protected ConditionValue xgetCValueStandardBoxId() { return _myCQ.xdfgetStandardBoxId(); }
    public String keepStandardBoxId_InScopeRelation_MBox(MBoxCQ sq)
    { return _myCQ.keepStandardBoxId_InScopeRelation_MBox(sq); }
    public String keepStandardBoxId_NotInScopeRelation_MBox(MBoxCQ sq)
    { return _myCQ.keepStandardBoxId_NotInScopeRelation_MBox(sq); }
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
    public String keepScalarCondition(MBoxGrpCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MBoxGrpCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MBoxGrpCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MBoxGrpCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MBoxGrpCB.class.getName(); }
    protected String xinCQ() { return MBoxGrpCQ.class.getName(); }
}
