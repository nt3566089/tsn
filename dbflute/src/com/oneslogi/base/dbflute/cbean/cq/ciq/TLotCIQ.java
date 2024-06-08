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
 * The condition-query for in-line of T_LOT.
 * @author DBFlute(AutoGenerator)
 */
public class TLotCIQ extends AbstractBsTLotCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTLotCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TLotCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTLotCQ myCQ) {
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
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    public String keepLotId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLotId_ExistsReferrer_TAllocLotList(TAllocLotCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLotId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLotId_ExistsReferrer_TKeepingLotList(TKeepingLotCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLotId_ExistsReferrer_TLastLotList(TLastLotCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLotId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLotId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLotId_ExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLotId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLotId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLotId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLotId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLotId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepLotId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLotId_NotExistsReferrer_TAllocLotList(TAllocLotCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLotId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLotId_NotExistsReferrer_TKeepingLotList(TKeepingLotCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLotId_NotExistsReferrer_TLastLotList(TLastLotCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLotId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLotId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLotId_NotExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLotId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLotId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLotId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLotId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLotId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepLotId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLotId_SpecifyDerivedReferrer_TAllocLotList(TAllocLotCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLotId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLotId_SpecifyDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLotId_SpecifyDerivedReferrer_TLastLotList(TLastLotCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLotId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLotId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLotId_SpecifyDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLotId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLotId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLotId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLotId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLotId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TAllocLotList(TAllocLotCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TAllocLotListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TInventoryBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TKeepingLotListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TLastLotList(TLastLotCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TLastLotListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TMoveInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_TStockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepLotId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_MProduct(sq); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_MProduct(sq); }
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueLotSort() { return _myCQ.xdfgetLotSort(); }
    protected ConditionValue xgetCValueLimitDt() { return _myCQ.xdfgetLimitDt(); }
    protected ConditionValue xgetCValueLot1() { return _myCQ.xdfgetLot1(); }
    protected ConditionValue xgetCValueLot2() { return _myCQ.xdfgetLot2(); }
    protected ConditionValue xgetCValueLot3() { return _myCQ.xdfgetLot3(); }
    protected ConditionValue xgetCValueLot4() { return _myCQ.xdfgetLot4(); }
    protected ConditionValue xgetCValueDamageflg() { return _myCQ.xdfgetDamageflg(); }
    protected ConditionValue xgetCValueNoshippingflg() { return _myCQ.xdfgetNoshippingflg(); }
    protected ConditionValue xgetCValueForeigncargoflg() { return _myCQ.xdfgetForeigncargoflg(); }
    protected ConditionValue xgetCValueCustomsreleaseflg() { return _myCQ.xdfgetCustomsreleaseflg(); }
    protected ConditionValue xgetCValueTaxflg() { return _myCQ.xdfgetTaxflg(); }
    protected ConditionValue xgetCValueTranceportCd() { return _myCQ.xdfgetTranceportCd(); }
    protected ConditionValue xgetCValueSourceCd() { return _myCQ.xdfgetSourceCd(); }
    protected ConditionValue xgetCValueSourceNm() { return _myCQ.xdfgetSourceNm(); }
    protected ConditionValue xgetCValueSchDt() { return _myCQ.xdfgetSchDt(); }
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
    public String keepScalarCondition(TLotCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TLotCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TLotCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TLotCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TLotCB.class.getName(); }
    protected String xinCQ() { return TLotCQ.class.getName(); }
}
