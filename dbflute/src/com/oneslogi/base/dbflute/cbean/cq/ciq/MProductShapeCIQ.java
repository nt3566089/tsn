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
 * The condition-query for in-line of M_PRODUCT_SHAPE.
 * @author DBFlute(AutoGenerator)
 */
public class MProductShapeCIQ extends AbstractBsMProductShapeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMProductShapeCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MProductShapeCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMProductShapeCQ myCQ) {
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
    protected ConditionValue xgetCValueProductShapeId() { return _myCQ.xdfgetProductShapeId(); }
    public String keepProductShapeId_ExistsReferrer_MLocationByMaxStoreProductShapeIdList(MLocationCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductShapeId_ExistsReferrer_MLocationByReplenishPProductShapeIdList(MLocationCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductShapeId_NotExistsReferrer_MLocationByMaxStoreProductShapeIdList(MLocationCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductShapeId_NotExistsReferrer_MLocationByReplenishPProductShapeIdList(MLocationCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductShapeId_SpecifyDerivedReferrer_MLocationByMaxStoreProductShapeIdList(MLocationCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductShapeId_SpecifyDerivedReferrer_MLocationByReplenishPProductShapeIdList(MLocationCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductShapeId_QueryDerivedReferrer_MLocationByMaxStoreProductShapeIdList(MLocationCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductShapeId_QueryDerivedReferrer_MLocationByMaxStoreProductShapeIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductShapeId_QueryDerivedReferrer_MLocationByReplenishPProductShapeIdList(MLocationCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductShapeId_QueryDerivedReferrer_MLocationByReplenishPProductShapeIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_MProduct(sq); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_MProduct(sq); }
    protected ConditionValue xgetCValueShapeGrpDtlId() { return _myCQ.xdfgetShapeGrpDtlId(); }
    public String keepShapeGrpDtlId_InScopeRelation_MShapeGrpDtl(MShapeGrpDtlCQ sq)
    { return _myCQ.keepShapeGrpDtlId_InScopeRelation_MShapeGrpDtl(sq); }
    public String keepShapeGrpDtlId_NotInScopeRelation_MShapeGrpDtl(MShapeGrpDtlCQ sq)
    { return _myCQ.keepShapeGrpDtlId_NotInScopeRelation_MShapeGrpDtl(sq); }
    protected ConditionValue xgetCValueUnitNum() { return _myCQ.xdfgetUnitNum(); }
    protected ConditionValue xgetCValueLength() { return _myCQ.xdfgetLength(); }
    protected ConditionValue xgetCValueWidth() { return _myCQ.xdfgetWidth(); }
    protected ConditionValue xgetCValueHeight() { return _myCQ.xdfgetHeight(); }
    protected ConditionValue xgetCValueVolume() { return _myCQ.xdfgetVolume(); }
    protected ConditionValue xgetCValueNetWeight() { return _myCQ.xdfgetNetWeight(); }
    protected ConditionValue xgetCValueGrossWeight() { return _myCQ.xdfgetGrossWeight(); }
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
    public String keepScalarCondition(MProductShapeCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MProductShapeCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MProductShapeCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MProductShapeCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MProductShapeCB.class.getName(); }
    protected String xinCQ() { return MProductShapeCQ.class.getName(); }
}
