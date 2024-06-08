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
 * The condition-query for in-line of M_SHAPE.
 * @author DBFlute(AutoGenerator)
 */
public class MShapeCIQ extends AbstractBsMShapeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMShapeCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MShapeCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMShapeCQ myCQ) {
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
    protected ConditionValue xgetCValueShapeId() { return _myCQ.xdfgetShapeId(); }
    public String keepShapeId_ExistsReferrer_HInventoryBList(HInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShapeId_ExistsReferrer_HStockList(HStockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShapeId_ExistsReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShapeId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShapeId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShapeId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShapeId_ExistsReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShapeId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShapeId_ExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShapeId_NotExistsReferrer_HInventoryBList(HInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShapeId_NotExistsReferrer_HStockList(HStockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShapeId_NotExistsReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShapeId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShapeId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShapeId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShapeId_NotExistsReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShapeId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShapeId_NotExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShapeId_SpecifyDerivedReferrer_HInventoryBList(HInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShapeId_SpecifyDerivedReferrer_HStockList(HStockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShapeId_SpecifyDerivedReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShapeId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShapeId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShapeId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShapeId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShapeId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShapeId_SpecifyDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_HInventoryBList(HInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_HInventoryBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_HStockList(HStockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_HStockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_MShapeGrpDtlListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_TInventoryBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_TMoveInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_TPickingBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShapeId_QueryDerivedReferrer_TStockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueShapeCd() { return _myCQ.xdfgetShapeCd(); }
    protected ConditionValue xgetCValueShapeDictId() { return _myCQ.xdfgetShapeDictId(); }
    public String keepShapeDictId_InScopeRelation_BDictByShapeDictId(BDictCQ sq)
    { return _myCQ.keepShapeDictId_InScopeRelation_BDictByShapeDictId(sq); }
    public String keepShapeDictId_NotInScopeRelation_BDictByShapeDictId(BDictCQ sq)
    { return _myCQ.keepShapeDictId_NotInScopeRelation_BDictByShapeDictId(sq); }
    protected ConditionValue xgetCValueShapeUnitDictId() { return _myCQ.xdfgetShapeUnitDictId(); }
    public String keepShapeUnitDictId_InScopeRelation_BDictByShapeUnitDictId(BDictCQ sq)
    { return _myCQ.keepShapeUnitDictId_InScopeRelation_BDictByShapeUnitDictId(sq); }
    public String keepShapeUnitDictId_NotInScopeRelation_BDictByShapeUnitDictId(BDictCQ sq)
    { return _myCQ.keepShapeUnitDictId_NotInScopeRelation_BDictByShapeUnitDictId(sq); }
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
    public String keepScalarCondition(MShapeCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MShapeCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MShapeCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MShapeCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MShapeCB.class.getName(); }
    protected String xinCQ() { return MShapeCQ.class.getName(); }
}
