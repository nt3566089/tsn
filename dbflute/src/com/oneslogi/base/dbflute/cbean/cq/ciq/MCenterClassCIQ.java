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
 * The condition-query for in-line of M_CENTER_CLASS.
 * @author DBFlute(AutoGenerator)
 */
public class MCenterClassCIQ extends AbstractBsMCenterClassCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMCenterClassCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MCenterClassCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMCenterClassCQ myCQ) {
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
    protected ConditionValue xgetCValueCenterClassId() { return _myCQ.xdfgetCenterClassId(); }
    public String keepCenterClassId_ExistsReferrer_MCenterClassDtlList(MCenterClassDtlCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterClassId_ExistsReferrer_MCenterClassGrpList(MCenterClassGrpCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterClassId_NotExistsReferrer_MCenterClassDtlList(MCenterClassDtlCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterClassId_NotExistsReferrer_MCenterClassGrpList(MCenterClassGrpCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterClassId_SpecifyDerivedReferrer_MCenterClassDtlList(MCenterClassDtlCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterClassId_SpecifyDerivedReferrer_MCenterClassGrpList(MCenterClassGrpCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterClassId_QueryDerivedReferrer_MCenterClassDtlList(MCenterClassDtlCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterClassId_QueryDerivedReferrer_MCenterClassDtlListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterClassId_QueryDerivedReferrer_MCenterClassGrpList(MCenterClassGrpCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterClassId_QueryDerivedReferrer_MCenterClassGrpListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueClassCd() { return _myCQ.xdfgetClassCd(); }
    protected ConditionValue xgetCValueClassComment() { return _myCQ.xdfgetClassComment(); }
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
    public String keepScalarCondition(MCenterClassCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MCenterClassCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MCenterClassCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MCenterClassCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MCenterClassCB.class.getName(); }
    protected String xinCQ() { return MCenterClassCQ.class.getName(); }
}
