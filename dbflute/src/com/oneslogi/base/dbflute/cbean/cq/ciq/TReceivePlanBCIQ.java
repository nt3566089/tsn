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
 * The condition-query for in-line of T_RECEIVE_PLAN_B.
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanBCIQ extends AbstractBsTReceivePlanBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTReceivePlanBCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TReceivePlanBCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTReceivePlanBCQ myCQ) {
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
    protected ConditionValue xgetCValueReceivePlanBId() { return _myCQ.xdfgetReceivePlanBId(); }
    public String keepReceivePlanBId_ExistsReferrer_TReceivePlanSpareAsOne(TReceivePlanSpareCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepReceivePlanBId_ExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepReceivePlanBId_ExistsReferrer_TTrrcvdetailAsOne(TTrrcvdetailCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepReceivePlanBId_NotExistsReferrer_TReceivePlanSpareAsOne(TReceivePlanSpareCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepReceivePlanBId_NotExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepReceivePlanBId_NotExistsReferrer_TTrrcvdetailAsOne(TTrrcvdetailCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepReceivePlanBId_SpecifyDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepReceivePlanBId_QueryDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepReceivePlanBId_QueryDerivedReferrer_TStoreRecordBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueReceivePlanHId() { return _myCQ.xdfgetReceivePlanHId(); }
    public String keepReceivePlanHId_InScopeRelation_TReceivePlanH(TReceivePlanHCQ sq)
    { return _myCQ.keepReceivePlanHId_InScopeRelation_TReceivePlanH(sq); }
    public String keepReceivePlanHId_NotInScopeRelation_TReceivePlanH(TReceivePlanHCQ sq)
    { return _myCQ.keepReceivePlanHId_NotInScopeRelation_TReceivePlanH(sq); }
    protected ConditionValue xgetCValueLineNo() { return _myCQ.xdfgetLineNo(); }
    protected ConditionValue xgetCValueReceiveStatus() { return _myCQ.xdfgetReceiveStatus(); }
    protected ConditionValue xgetCValuePlanClientOrderNo() { return _myCQ.xdfgetPlanClientOrderNo(); }
    protected ConditionValue xgetCValuePlanWarehouseId() { return _myCQ.xdfgetPlanWarehouseId(); }
    public String keepPlanWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq)
    { return _myCQ.keepPlanWarehouseId_InScopeRelation_MWarehouse(sq); }
    public String keepPlanWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq)
    { return _myCQ.keepPlanWarehouseId_NotInScopeRelation_MWarehouse(sq); }
    protected ConditionValue xgetCValuePlanWarehouseCd() { return _myCQ.xdfgetPlanWarehouseCd(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_MProduct(sq); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_MProduct(sq); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValuePlanLot() { return _myCQ.xdfgetPlanLot(); }
    protected ConditionValue xgetCValuePlanLimitDt() { return _myCQ.xdfgetPlanLimitDt(); }
    protected ConditionValue xgetCValuePlanLocationId() { return _myCQ.xdfgetPlanLocationId(); }
    public String keepPlanLocationId_InScopeRelation_MLocation(MLocationCQ sq)
    { return _myCQ.keepPlanLocationId_InScopeRelation_MLocation(sq); }
    public String keepPlanLocationId_NotInScopeRelation_MLocation(MLocationCQ sq)
    { return _myCQ.keepPlanLocationId_NotInScopeRelation_MLocation(sq); }
    protected ConditionValue xgetCValuePlanLocationCd() { return _myCQ.xdfgetPlanLocationCd(); }
    protected ConditionValue xgetCValuePlanStoreLabelNo() { return _myCQ.xdfgetPlanStoreLabelNo(); }
    protected ConditionValue xgetCValuePlanNum() { return _myCQ.xdfgetPlanNum(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
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
    public String keepScalarCondition(TReceivePlanBCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TReceivePlanBCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TReceivePlanBCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TReceivePlanBCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TReceivePlanBCB.class.getName(); }
    protected String xinCQ() { return TReceivePlanBCQ.class.getName(); }
}
