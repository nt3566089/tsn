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
 * The condition-query for in-line of M_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class MProductCIQ extends AbstractBsMProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMProductCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MProductCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMProductCQ myCQ) {
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
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    public String keepProductId_ExistsReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_MProductSelfAsOne(MProductCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_MProductShapeList(MProductShapeCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_MProductTermAsOne(MProductTermCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_MSetParentAsOne(MSetParentCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_MSetStructureList(MSetStructureCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_TAllocLotList(TAllocLotCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_TKeepingLotList(TKeepingLotCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_TLastLotList(TLastLotCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_TLotList(TLotCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_TYtrsodetailList(TYtrsodetailCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_MProductSelfAsOne(MProductCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_MProductShapeList(MProductShapeCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_MProductTermAsOne(MProductTermCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_MSetParentAsOne(MSetParentCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_MSetStructureList(MSetStructureCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_TAllocLotList(TAllocLotCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_TKeepingLotList(TKeepingLotCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_TLastLotList(TLastLotCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_TLotList(TLotCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_TYtrsodetailList(TYtrsodetailCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_MProductShapeList(MProductShapeCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_MSetStructureList(MSetStructureCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_TAllocLotList(TAllocLotCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_TLastLotList(TLastLotCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_TLotList(TLotCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_TYtrsodetailList(TYtrsodetailCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_MLocationListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_MMfwhxitemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_MProductShapeList(MProductShapeCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_MProductShapeListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_MSetStructureList(MSetStructureCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_MSetStructureListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TAllocLotList(TAllocLotCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TAllocLotListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TInventoryBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TKeepingLotListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TLastLotList(TLastLotCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TLastLotListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TLotList(TLotCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TLotListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TMoveInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TReceivePlanBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TSerialNoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TStockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TTrinvcheckinfoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TYtrsodetailList(TYtrsodetailCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_TYtrsodetailListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WHtShippingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_QueryDerivedReferrer_WShippingInterruptListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductId_InScopeRelation_MProductSelf(MProductCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_MProductSelf(sq); }
    public String keepProductId_NotInScopeRelation_MProductSelf(MProductCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_MProductSelf(sq); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueProductAbbr() { return _myCQ.xdfgetProductAbbr(); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueLotManagFlg() { return _myCQ.xdfgetLotManagFlg(); }
    protected ConditionValue xgetCValueLimitDtManagFlg() { return _myCQ.xdfgetLimitDtManagFlg(); }
    protected ConditionValue xgetCValueReceiveLimitNum() { return _myCQ.xdfgetReceiveLimitNum(); }
    protected ConditionValue xgetCValueShippingLimitNum() { return _myCQ.xdfgetShippingLimitNum(); }
    protected ConditionValue xgetCValueMergeCls() { return _myCQ.xdfgetMergeCls(); }
    protected ConditionValue xgetCValueLotReverseFlg() { return _myCQ.xdfgetLotReverseFlg(); }
    protected ConditionValue xgetCValueLimitDtReverseFlg() { return _myCQ.xdfgetLimitDtReverseFlg(); }
    protected ConditionValue xgetCValueShippingStopFlg() { return _myCQ.xdfgetShippingStopFlg(); }
    protected ConditionValue xgetCValueFixedPoint() { return _myCQ.xdfgetFixedPoint(); }
    protected ConditionValue xgetCValueShapeGrpId() { return _myCQ.xdfgetShapeGrpId(); }
    public String keepShapeGrpId_InScopeRelation_MShapeGrp(MShapeGrpCQ sq)
    { return _myCQ.keepShapeGrpId_InScopeRelation_MShapeGrp(sq); }
    public String keepShapeGrpId_NotInScopeRelation_MShapeGrp(MShapeGrpCQ sq)
    { return _myCQ.keepShapeGrpId_NotInScopeRelation_MShapeGrp(sq); }
    protected ConditionValue xgetCValueNmfcCode() { return _myCQ.xdfgetNmfcCode(); }
    protected ConditionValue xgetCValueFreightCls() { return _myCQ.xdfgetFreightCls(); }
    protected ConditionValue xgetCValueCounntryOfOrigin() { return _myCQ.xdfgetCounntryOfOrigin(); }
    protected ConditionValue xgetCValueUnitVal() { return _myCQ.xdfgetUnitVal(); }
    protected ConditionValue xgetCValueHtsCd() { return _myCQ.xdfgetHtsCd(); }
    protected ConditionValue xgetCValueItemgroup() { return _myCQ.xdfgetItemgroup(); }
    protected ConditionValue xgetCValueActflg() { return _myCQ.xdfgetActflg(); }
    protected ConditionValue xgetCValueInvtype() { return _myCQ.xdfgetInvtype(); }
    protected ConditionValue xgetCValueSetitemflg() { return _myCQ.xdfgetSetitemflg(); }
    protected ConditionValue xgetCValueOwneritemcd() { return _myCQ.xdfgetOwneritemcd(); }
    protected ConditionValue xgetCValueSupplieritemcd() { return _myCQ.xdfgetSupplieritemcd(); }
    protected ConditionValue xgetCValuePositemcd() { return _myCQ.xdfgetPositemcd(); }
    protected ConditionValue xgetCValueItfcd() { return _myCQ.xdfgetItfcd(); }
    protected ConditionValue xgetCValueManuitemcd() { return _myCQ.xdfgetManuitemcd(); }
    protected ConditionValue xgetCValuePriceBuy() { return _myCQ.xdfgetPriceBuy(); }
    protected ConditionValue xgetCValuePriceWholesale() { return _myCQ.xdfgetPriceWholesale(); }
    protected ConditionValue xgetCValuePriceSale() { return _myCQ.xdfgetPriceSale(); }
    protected ConditionValue xgetCValueAllocpolicykey() { return _myCQ.xdfgetAllocpolicykey(); }
    protected ConditionValue xgetCValueSlotpolicykey() { return _myCQ.xdfgetSlotpolicykey(); }
    protected ConditionValue xgetCValueInworkingkey() { return _myCQ.xdfgetInworkingkey(); }
    protected ConditionValue xgetCValueOutworkingkey() { return _myCQ.xdfgetOutworkingkey(); }
    protected ConditionValue xgetCValueAbctype() { return _myCQ.xdfgetAbctype(); }
    protected ConditionValue xgetCValueQty1type() { return _myCQ.xdfgetQty1type(); }
    protected ConditionValue xgetCValueUnit1() { return _myCQ.xdfgetUnit1(); }
    protected ConditionValue xgetCValueUnit1style() { return _myCQ.xdfgetUnit1style(); }
    protected ConditionValue xgetCValueLength1() { return _myCQ.xdfgetLength1(); }
    protected ConditionValue xgetCValueWidth1() { return _myCQ.xdfgetWidth1(); }
    protected ConditionValue xgetCValueHeight1() { return _myCQ.xdfgetHeight1(); }
    protected ConditionValue xgetCValueGrossweight1() { return _myCQ.xdfgetGrossweight1(); }
    protected ConditionValue xgetCValueNetweight1() { return _myCQ.xdfgetNetweight1(); }
    protected ConditionValue xgetCValueCube1() { return _myCQ.xdfgetCube1(); }
    protected ConditionValue xgetCValueLiter1() { return _myCQ.xdfgetLiter1(); }
    protected ConditionValue xgetCValueUnit2() { return _myCQ.xdfgetUnit2(); }
    protected ConditionValue xgetCValueUnit2style() { return _myCQ.xdfgetUnit2style(); }
    protected ConditionValue xgetCValueLength2() { return _myCQ.xdfgetLength2(); }
    protected ConditionValue xgetCValueWidth2() { return _myCQ.xdfgetWidth2(); }
    protected ConditionValue xgetCValueHeight2() { return _myCQ.xdfgetHeight2(); }
    protected ConditionValue xgetCValueGrossweight2() { return _myCQ.xdfgetGrossweight2(); }
    protected ConditionValue xgetCValueNetweight2() { return _myCQ.xdfgetNetweight2(); }
    protected ConditionValue xgetCValueCube2() { return _myCQ.xdfgetCube2(); }
    protected ConditionValue xgetCValueLiter2() { return _myCQ.xdfgetLiter2(); }
    protected ConditionValue xgetCValueUnit3() { return _myCQ.xdfgetUnit3(); }
    protected ConditionValue xgetCValueUnit3style() { return _myCQ.xdfgetUnit3style(); }
    protected ConditionValue xgetCValueLength3() { return _myCQ.xdfgetLength3(); }
    protected ConditionValue xgetCValueWidth3() { return _myCQ.xdfgetWidth3(); }
    protected ConditionValue xgetCValueHeight3() { return _myCQ.xdfgetHeight3(); }
    protected ConditionValue xgetCValueGrossweight3() { return _myCQ.xdfgetGrossweight3(); }
    protected ConditionValue xgetCValueNetweight3() { return _myCQ.xdfgetNetweight3(); }
    protected ConditionValue xgetCValueCube3() { return _myCQ.xdfgetCube3(); }
    protected ConditionValue xgetCValueLiter3() { return _myCQ.xdfgetLiter3(); }
    protected ConditionValue xgetCValuePQty() { return _myCQ.xdfgetPQty(); }
    protected ConditionValue xgetCValuePHeight() { return _myCQ.xdfgetPHeight(); }
    protected ConditionValue xgetCValuePOdd() { return _myCQ.xdfgetPOdd(); }
    protected ConditionValue xgetCValuePDescription() { return _myCQ.xdfgetPDescription(); }
    protected ConditionValue xgetCValueNotes() { return _myCQ.xdfgetNotes(); }
    protected ConditionValue xgetCValueQty2usedflg() { return _myCQ.xdfgetQty2usedflg(); }
    protected ConditionValue xgetCValueQty2style() { return _myCQ.xdfgetQty2style(); }
    protected ConditionValue xgetCValueQty3usedflg() { return _myCQ.xdfgetQty3usedflg(); }
    protected ConditionValue xgetCValueQty3style() { return _myCQ.xdfgetQty3style(); }
    protected ConditionValue xgetCValueSpCalcflg() { return _myCQ.xdfgetSpCalcflg(); }
    protected ConditionValue xgetCValueSpLotatrb1usedflg() { return _myCQ.xdfgetSpLotatrb1usedflg(); }
    protected ConditionValue xgetCValueSpOperator1() { return _myCQ.xdfgetSpOperator1(); }
    protected ConditionValue xgetCValueSpLotatrb2usedflg() { return _myCQ.xdfgetSpLotatrb2usedflg(); }
    protected ConditionValue xgetCValueSpOperator2() { return _myCQ.xdfgetSpOperator2(); }
    protected ConditionValue xgetCValueSpLotatrb3usedflg() { return _myCQ.xdfgetSpLotatrb3usedflg(); }
    protected ConditionValue xgetCValueSpOperator3() { return _myCQ.xdfgetSpOperator3(); }
    protected ConditionValue xgetCValueSpRate() { return _myCQ.xdfgetSpRate(); }
    protected ConditionValue xgetCValueLotatrb1title() { return _myCQ.xdfgetLotatrb1title(); }
    protected ConditionValue xgetCValueLotatrb2title() { return _myCQ.xdfgetLotatrb2title(); }
    protected ConditionValue xgetCValueLotatrb3title() { return _myCQ.xdfgetLotatrb3title(); }
    protected ConditionValue xgetCValueLotatrb4title() { return _myCQ.xdfgetLotatrb4title(); }
    protected ConditionValue xgetCValueLotatrb5title() { return _myCQ.xdfgetLotatrb5title(); }
    protected ConditionValue xgetCValueLotatrb6title() { return _myCQ.xdfgetLotatrb6title(); }
    protected ConditionValue xgetCValueLotatrb7title() { return _myCQ.xdfgetLotatrb7title(); }
    protected ConditionValue xgetCValueLotatrb8title() { return _myCQ.xdfgetLotatrb8title(); }
    protected ConditionValue xgetCValueLotatrb9title() { return _myCQ.xdfgetLotatrb9title(); }
    protected ConditionValue xgetCValueLotatrb10title() { return _myCQ.xdfgetLotatrb10title(); }
    protected ConditionValue xgetCValueFUser1() { return _myCQ.xdfgetFUser1(); }
    protected ConditionValue xgetCValueFUser2() { return _myCQ.xdfgetFUser2(); }
    protected ConditionValue xgetCValueFUser3() { return _myCQ.xdfgetFUser3(); }
    protected ConditionValue xgetCValueFUser4() { return _myCQ.xdfgetFUser4(); }
    protected ConditionValue xgetCValueFUser5() { return _myCQ.xdfgetFUser5(); }
    protected ConditionValue xgetCValueItem40() { return _myCQ.xdfgetItem40(); }
    protected ConditionValue xgetCValuePriceInsurance() { return _myCQ.xdfgetPriceInsurance(); }
    protected ConditionValue xgetCValueLimitday() { return _myCQ.xdfgetLimitday(); }
    protected ConditionValue xgetCValueDeliverableday() { return _myCQ.xdfgetDeliverableday(); }
    protected ConditionValue xgetCValuePrintdateflg() { return _myCQ.xdfgetPrintdateflg(); }
    protected ConditionValue xgetCValueSuppliercd() { return _myCQ.xdfgetSuppliercd(); }
    protected ConditionValue xgetCValueDispatchqtytype() { return _myCQ.xdfgetDispatchqtytype(); }
    protected ConditionValue xgetCValueTariffqtytype() { return _myCQ.xdfgetTariffqtytype(); }
    protected ConditionValue xgetCValueUseruse1() { return _myCQ.xdfgetUseruse1(); }
    protected ConditionValue xgetCValueUseruse2() { return _myCQ.xdfgetUseruse2(); }
    protected ConditionValue xgetCValueUseruse3() { return _myCQ.xdfgetUseruse3(); }
    protected ConditionValue xgetCValueUseruse4() { return _myCQ.xdfgetUseruse4(); }
    protected ConditionValue xgetCValueUseruse5() { return _myCQ.xdfgetUseruse5(); }
    protected ConditionValue xgetCValueLot1nullflg() { return _myCQ.xdfgetLot1nullflg(); }
    protected ConditionValue xgetCValueLot2nullflg() { return _myCQ.xdfgetLot2nullflg(); }
    protected ConditionValue xgetCValueLot3nullflg() { return _myCQ.xdfgetLot3nullflg(); }
    protected ConditionValue xgetCValueLot4nullflg() { return _myCQ.xdfgetLot4nullflg(); }
    protected ConditionValue xgetCValueLot5nullflg() { return _myCQ.xdfgetLot5nullflg(); }
    protected ConditionValue xgetCValueOtherlot1nullflg() { return _myCQ.xdfgetOtherlot1nullflg(); }
    protected ConditionValue xgetCValueOtherlot2nullflg() { return _myCQ.xdfgetOtherlot2nullflg(); }
    protected ConditionValue xgetCValueOtherlot3nullflg() { return _myCQ.xdfgetOtherlot3nullflg(); }
    protected ConditionValue xgetCValueOtherlot4nullflg() { return _myCQ.xdfgetOtherlot4nullflg(); }
    protected ConditionValue xgetCValueOtherlot5nullflg() { return _myCQ.xdfgetOtherlot5nullflg(); }
    protected ConditionValue xgetCValueItemprintname() { return _myCQ.xdfgetItemprintname(); }
    protected ConditionValue xgetCValuePricelevel() { return _myCQ.xdfgetPricelevel(); }
    protected ConditionValue xgetCValueItemcatalogurl() { return _myCQ.xdfgetItemcatalogurl(); }
    protected ConditionValue xgetCValueUsernum1() { return _myCQ.xdfgetUsernum1(); }
    protected ConditionValue xgetCValueUsernum2() { return _myCQ.xdfgetUsernum2(); }
    protected ConditionValue xgetCValueUsernum3() { return _myCQ.xdfgetUsernum3(); }
    protected ConditionValue xgetCValueUsernum4() { return _myCQ.xdfgetUsernum4(); }
    protected ConditionValue xgetCValueUsernum5() { return _myCQ.xdfgetUsernum5(); }
    protected ConditionValue xgetCValueUserdate1() { return _myCQ.xdfgetUserdate1(); }
    protected ConditionValue xgetCValueUserdate2() { return _myCQ.xdfgetUserdate2(); }
    protected ConditionValue xgetCValueUserdate3() { return _myCQ.xdfgetUserdate3(); }
    protected ConditionValue xgetCValueUserdate4() { return _myCQ.xdfgetUserdate4(); }
    protected ConditionValue xgetCValueUserdate5() { return _myCQ.xdfgetUserdate5(); }
    protected ConditionValue xgetCValueCggdid() { return _myCQ.xdfgetCggdid(); }
    protected ConditionValue xgetCValueBrctg() { return _myCQ.xdfgetBrctg(); }
    protected ConditionValue xgetCValueCtweight() { return _myCQ.xdfgetCtweight(); }
    protected ConditionValue xgetCValueBxoszl() { return _myCQ.xdfgetBxoszl(); }
    protected ConditionValue xgetCValueBxoszw() { return _myCQ.xdfgetBxoszw(); }
    protected ConditionValue xgetCValueBxoszh() { return _myCQ.xdfgetBxoszh(); }
    protected ConditionValue xgetCValueBxcpy() { return _myCQ.xdfgetBxcpy(); }
    protected ConditionValue xgetCValueBxweight() { return _myCQ.xdfgetBxweight(); }
    protected ConditionValue xgetCValueItemAdmin() { return _myCQ.xdfgetItemAdmin(); }
    protected ConditionValue xgetCValueSname() { return _myCQ.xdfgetSname(); }
    protected ConditionValue xgetCValueFractionpieceweight() { return _myCQ.xdfgetFractionpieceweight(); }
    protected ConditionValue xgetCValueTaxequivalentnumber() { return _myCQ.xdfgetTaxequivalentnumber(); }
    protected ConditionValue xgetCValueSyhnkbnjt() { return _myCQ.xdfgetSyhnkbnjt(); }
    protected ConditionValue xgetCValueIoidCls() { return _myCQ.xdfgetIoidCls(); }
    protected ConditionValue xgetCValueItfcdCls() { return _myCQ.xdfgetItfcdCls(); }
    protected ConditionValue xgetCValueManuitemcdCls() { return _myCQ.xdfgetManuitemcdCls(); }
    protected ConditionValue xgetCValueCtcpy() { return _myCQ.xdfgetCtcpy(); }
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
    public String keepScalarCondition(MProductCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MProductCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MProductCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MProductCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MProductCB.class.getName(); }
    protected String xinCQ() { return MProductCQ.class.getName(); }
}
