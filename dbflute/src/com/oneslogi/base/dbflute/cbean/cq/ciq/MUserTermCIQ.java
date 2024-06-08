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
 * The condition-query for in-line of M_USER_TERM.
 * @author DBFlute(AutoGenerator)
 */
public class MUserTermCIQ extends AbstractBsMUserTermCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMUserTermCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MUserTermCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMUserTermCQ myCQ) {
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
    protected ConditionValue xgetCValueCommonAuthId() { return _myCQ.xdfgetCommonAuthId(); }
    protected ConditionValue xgetCValueEmployeeNo() { return _myCQ.xdfgetEmployeeNo(); }
    protected ConditionValue xgetCValueIdType() { return _myCQ.xdfgetIdType(); }
    protected ConditionValue xgetCValueEnrollmentStatus() { return _myCQ.xdfgetEnrollmentStatus(); }
    protected ConditionValue xgetCValueLastName() { return _myCQ.xdfgetLastName(); }
    protected ConditionValue xgetCValueFirstName() { return _myCQ.xdfgetFirstName(); }
    protected ConditionValue xgetCValueLastNameKana() { return _myCQ.xdfgetLastNameKana(); }
    protected ConditionValue xgetCValueFirstNameKana() { return _myCQ.xdfgetFirstNameKana(); }
    protected ConditionValue xgetCValueMailAddress() { return _myCQ.xdfgetMailAddress(); }
    protected ConditionValue xgetCValueAdminFlg() { return _myCQ.xdfgetAdminFlg(); }
    protected ConditionValue xgetCValueCompanyUnitCd() { return _myCQ.xdfgetCompanyUnitCd(); }
    protected ConditionValue xgetCValueBizSystemCd() { return _myCQ.xdfgetBizSystemCd(); }
    protected ConditionValue xgetCValueBizSystemNm() { return _myCQ.xdfgetBizSystemNm(); }
    protected ConditionValue xgetCValueUserRoleCd() { return _myCQ.xdfgetUserRoleCd(); }
    protected ConditionValue xgetCValueUserRoleNm() { return _myCQ.xdfgetUserRoleNm(); }
    protected ConditionValue xgetCValuePlanCompanyCd() { return _myCQ.xdfgetPlanCompanyCd(); }
    protected ConditionValue xgetCValueWmsCompanyCd() { return _myCQ.xdfgetWmsCompanyCd(); }
    protected ConditionValue xgetCValueDlvRootCompanyCd() { return _myCQ.xdfgetDlvRootCompanyCd(); }
    protected ConditionValue xgetCValueSvfCompanyCd() { return _myCQ.xdfgetSvfCompanyCd(); }
    protected ConditionValue xgetCValueKbCompanyCd() { return _myCQ.xdfgetKbCompanyCd(); }
    protected ConditionValue xgetCValueOrderLoginCompanyCd() { return _myCQ.xdfgetOrderLoginCompanyCd(); }
    protected ConditionValue xgetCValueOrderOfficeCompanyCd() { return _myCQ.xdfgetOrderOfficeCompanyCd(); }
    protected ConditionValue xgetCValueOrderSmarteditCompanyCd() { return _myCQ.xdfgetOrderSmarteditCompanyCd(); }
    protected ConditionValue xgetCValueSupanddemTaxCompanyCd() { return _myCQ.xdfgetSupanddemTaxCompanyCd(); }
    protected ConditionValue xgetCValueValidFrdateh() { return _myCQ.xdfgetValidFrdateh(); }
    protected ConditionValue xgetCValueValidTodateh() { return _myCQ.xdfgetValidTodateh(); }
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
    public String keepScalarCondition(MUserTermCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MUserTermCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MUserTermCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MUserTermCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MUserTermCB.class.getName(); }
    protected String xinCQ() { return MUserTermCQ.class.getName(); }
}
