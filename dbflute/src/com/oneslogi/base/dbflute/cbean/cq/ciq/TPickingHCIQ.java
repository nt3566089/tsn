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
 * The condition-query for in-line of T_PICKING_H.
 * @author DBFlute(AutoGenerator)
 */
public class TPickingHCIQ extends AbstractBsTPickingHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTPickingHCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TPickingHCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTPickingHCQ myCQ) {
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
    protected ConditionValue xgetCValuePickingHId() { return _myCQ.xdfgetPickingHId(); }
    public String keepPickingHId_ExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPickingHId_ExistsReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPickingHId_ExistsReferrer_TPickingRAsOne(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPickingHId_ExistsReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPickingHId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPickingHId_ExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepPickingHId_NotExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPickingHId_NotExistsReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPickingHId_NotExistsReferrer_TPickingRAsOne(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPickingHId_NotExistsReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPickingHId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPickingHId_NotExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepPickingHId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPickingHId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPickingHId_SpecifyDerivedReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPickingHId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPickingHId_SpecifyDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepPickingHId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPickingHId_QueryDerivedReferrer_TPackingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPickingHId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPickingHId_QueryDerivedReferrer_TPickingBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPickingHId_QueryDerivedReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPickingHId_QueryDerivedReferrer_TPicMthdRcmdDataListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPickingHId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPickingHId_QueryDerivedReferrer_TReceivePlanHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPickingHId_QueryDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepPickingHId_QueryDerivedReferrer_WSglRowShipInspBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueProcessTypeId() { return _myCQ.xdfgetProcessTypeId(); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_InScopeRelation_MProcessType(sq); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_NotInScopeRelation_MProcessType(sq); }
    protected ConditionValue xgetCValuePickingStatus() { return _myCQ.xdfgetPickingStatus(); }
    protected ConditionValue xgetCValueDelivUnitNo() { return _myCQ.xdfgetDelivUnitNo(); }
    protected ConditionValue xgetCValuePickingWorkNo() { return _myCQ.xdfgetPickingWorkNo(); }
    protected ConditionValue xgetCValueAllocInstHId() { return _myCQ.xdfgetAllocInstHId(); }
    public String keepAllocInstHId_InScopeRelation_TAllocInstH(TAllocInstHCQ sq)
    { return _myCQ.keepAllocInstHId_InScopeRelation_TAllocInstH(sq); }
    public String keepAllocInstHId_NotInScopeRelation_TAllocInstH(TAllocInstHCQ sq)
    { return _myCQ.keepAllocInstHId_NotInScopeRelation_TAllocInstH(sq); }
    protected ConditionValue xgetCValueForceFixedFlg() { return _myCQ.xdfgetForceFixedFlg(); }
    protected ConditionValue xgetCValuePickingGroupNo() { return _myCQ.xdfgetPickingGroupNo(); }
    protected ConditionValue xgetCValueSglRowPicFlg() { return _myCQ.xdfgetSglRowPicFlg(); }
    protected ConditionValue xgetCValueShippingFixedDt() { return _myCQ.xdfgetShippingFixedDt(); }
    protected ConditionValue xgetCValueCenterTransitFlg() { return _myCQ.xdfgetCenterTransitFlg(); }
    protected ConditionValue xgetCValuePackingCalCls() { return _myCQ.xdfgetPackingCalCls(); }
    protected ConditionValue xgetCValueBolNo() { return _myCQ.xdfgetBolNo(); }
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
    public String keepScalarCondition(TPickingHCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TPickingHCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TPickingHCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TPickingHCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TPickingHCB.class.getName(); }
    protected String xinCQ() { return TPickingHCQ.class.getName(); }
}
