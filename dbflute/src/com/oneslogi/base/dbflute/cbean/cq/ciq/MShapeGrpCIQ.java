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
 * The condition-query for in-line of M_SHAPE_GRP.
 * @author DBFlute(AutoGenerator)
 */
public class MShapeGrpCIQ extends AbstractBsMShapeGrpCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMShapeGrpCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MShapeGrpCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMShapeGrpCQ myCQ) {
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
    protected ConditionValue xgetCValueShapeGrpId() { return _myCQ.xdfgetShapeGrpId(); }
    public String keepShapeGrpId_ExistsReferrer_MClientList(MClientCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShapeGrpId_ExistsReferrer_MProductList(MProductCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShapeGrpId_ExistsReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShapeGrpId_NotExistsReferrer_MClientList(MClientCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShapeGrpId_NotExistsReferrer_MProductList(MProductCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShapeGrpId_NotExistsReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShapeGrpId_SpecifyDerivedReferrer_MClientList(MClientCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShapeGrpId_SpecifyDerivedReferrer_MProductList(MProductCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShapeGrpId_SpecifyDerivedReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShapeGrpId_QueryDerivedReferrer_MClientList(MClientCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeGrpId_QueryDerivedReferrer_MClientListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeGrpId_QueryDerivedReferrer_MProductList(MProductCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeGrpId_QueryDerivedReferrer_MProductListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeGrpId_QueryDerivedReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeGrpId_QueryDerivedReferrer_MShapeGrpDtlListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueShapeGrpCd() { return _myCQ.xdfgetShapeGrpCd(); }
    protected ConditionValue xgetCValueShapeGrpName() { return _myCQ.xdfgetShapeGrpName(); }
    protected ConditionValue xgetCValueDecimalExistFlg() { return _myCQ.xdfgetDecimalExistFlg(); }
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
    public String keepScalarCondition(MShapeGrpCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MShapeGrpCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MShapeGrpCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MShapeGrpCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MShapeGrpCB.class.getName(); }
    protected String xinCQ() { return MShapeGrpCQ.class.getName(); }
}
