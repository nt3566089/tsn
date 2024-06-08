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
 * The condition-query for in-line of M_SHAPE_GRP_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class MShapeGrpDtlCIQ extends AbstractBsMShapeGrpDtlCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMShapeGrpDtlCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MShapeGrpDtlCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMShapeGrpDtlCQ myCQ) {
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
    protected ConditionValue xgetCValueShapeGrpDtlId() { return _myCQ.xdfgetShapeGrpDtlId(); }
    public String keepShapeGrpDtlId_ExistsReferrer_MProductShapeList(MProductShapeCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShapeGrpDtlId_NotExistsReferrer_MProductShapeList(MProductShapeCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShapeGrpDtlId_SpecifyDerivedReferrer_MProductShapeList(MProductShapeCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShapeGrpDtlId_QueryDerivedReferrer_MProductShapeList(MProductShapeCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeGrpDtlId_QueryDerivedReferrer_MProductShapeListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueShapeGrpId() { return _myCQ.xdfgetShapeGrpId(); }
    public String keepShapeGrpId_InScopeRelation_MShapeGrp(MShapeGrpCQ sq)
    { return _myCQ.keepShapeGrpId_InScopeRelation_MShapeGrp(sq); }
    public String keepShapeGrpId_NotInScopeRelation_MShapeGrp(MShapeGrpCQ sq)
    { return _myCQ.keepShapeGrpId_NotInScopeRelation_MShapeGrp(sq); }
    protected ConditionValue xgetCValueShapeId() { return _myCQ.xdfgetShapeId(); }
    public String keepShapeId_InScopeRelation_MShape(MShapeCQ sq)
    { return _myCQ.keepShapeId_InScopeRelation_MShape(sq); }
    public String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq)
    { return _myCQ.keepShapeId_NotInScopeRelation_MShape(sq); }
    protected ConditionValue xgetCValueGtin14Symbol() { return _myCQ.xdfgetGtin14Symbol(); }
    protected ConditionValue xgetCValueCasePickFlg() { return _myCQ.xdfgetCasePickFlg(); }
    protected ConditionValue xgetCValueShapeSort() { return _myCQ.xdfgetShapeSort(); }
    protected ConditionValue xgetCValueEmReplenishShapeFlg() { return _myCQ.xdfgetEmReplenishShapeFlg(); }
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
    public String keepScalarCondition(MShapeGrpDtlCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MShapeGrpDtlCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MShapeGrpDtlCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MShapeGrpDtlCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MShapeGrpDtlCB.class.getName(); }
    protected String xinCQ() { return MShapeGrpDtlCQ.class.getName(); }
}
