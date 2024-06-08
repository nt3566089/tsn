package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of M_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class BsMProductCQ extends AbstractBsMProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_PRODUCT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MProductCIQ xcreateCIQ() {
        MProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MProductCIQ xnewCIQ() {
        return new MProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_PRODUCT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    public Map<String, MLocationCQ> xdfgetProductId_ExistsReferrer_MLocationList() { return xgetSQueMap("productId_ExistsReferrer_MLocationList"); }
    public String keepProductId_ExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("productId_ExistsReferrer_MLocationList", sq); }

    public Map<String, MMfwhxitemCQ> xdfgetProductId_ExistsReferrer_MMfwhxitemList() { return xgetSQueMap("productId_ExistsReferrer_MMfwhxitemList"); }
    public String keepProductId_ExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq) { return xkeepSQue("productId_ExistsReferrer_MMfwhxitemList", sq); }

    public Map<String, MProductCQ> xdfgetProductId_ExistsReferrer_MProductSelfAsOne() { return xgetSQueMap("productId_ExistsReferrer_MProductSelfAsOne"); }
    public String keepProductId_ExistsReferrer_MProductSelfAsOne(MProductCQ sq) { return xkeepSQue("productId_ExistsReferrer_MProductSelfAsOne", sq); }

    public Map<String, MProductShapeCQ> xdfgetProductId_ExistsReferrer_MProductShapeList() { return xgetSQueMap("productId_ExistsReferrer_MProductShapeList"); }
    public String keepProductId_ExistsReferrer_MProductShapeList(MProductShapeCQ sq) { return xkeepSQue("productId_ExistsReferrer_MProductShapeList", sq); }

    public Map<String, MProductTermCQ> xdfgetProductId_ExistsReferrer_MProductTermAsOne() { return xgetSQueMap("productId_ExistsReferrer_MProductTermAsOne"); }
    public String keepProductId_ExistsReferrer_MProductTermAsOne(MProductTermCQ sq) { return xkeepSQue("productId_ExistsReferrer_MProductTermAsOne", sq); }

    public Map<String, MSetParentCQ> xdfgetProductId_ExistsReferrer_MSetParentAsOne() { return xgetSQueMap("productId_ExistsReferrer_MSetParentAsOne"); }
    public String keepProductId_ExistsReferrer_MSetParentAsOne(MSetParentCQ sq) { return xkeepSQue("productId_ExistsReferrer_MSetParentAsOne", sq); }

    public Map<String, MSetStructureCQ> xdfgetProductId_ExistsReferrer_MSetStructureList() { return xgetSQueMap("productId_ExistsReferrer_MSetStructureList"); }
    public String keepProductId_ExistsReferrer_MSetStructureList(MSetStructureCQ sq) { return xkeepSQue("productId_ExistsReferrer_MSetStructureList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetProductId_ExistsReferrer_TAllocInstBList() { return xgetSQueMap("productId_ExistsReferrer_TAllocInstBList"); }
    public String keepProductId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("productId_ExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TAllocLotCQ> xdfgetProductId_ExistsReferrer_TAllocLotList() { return xgetSQueMap("productId_ExistsReferrer_TAllocLotList"); }
    public String keepProductId_ExistsReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("productId_ExistsReferrer_TAllocLotList", sq); }

    public Map<String, TInventoryBCQ> xdfgetProductId_ExistsReferrer_TInventoryBList() { return xgetSQueMap("productId_ExistsReferrer_TInventoryBList"); }
    public String keepProductId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("productId_ExistsReferrer_TInventoryBList", sq); }

    public Map<String, TKeepingLotCQ> xdfgetProductId_ExistsReferrer_TKeepingLotList() { return xgetSQueMap("productId_ExistsReferrer_TKeepingLotList"); }
    public String keepProductId_ExistsReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("productId_ExistsReferrer_TKeepingLotList", sq); }

    public Map<String, TLastLotCQ> xdfgetProductId_ExistsReferrer_TLastLotList() { return xgetSQueMap("productId_ExistsReferrer_TLastLotList"); }
    public String keepProductId_ExistsReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("productId_ExistsReferrer_TLastLotList", sq); }

    public Map<String, TLotCQ> xdfgetProductId_ExistsReferrer_TLotList() { return xgetSQueMap("productId_ExistsReferrer_TLotList"); }
    public String keepProductId_ExistsReferrer_TLotList(TLotCQ sq) { return xkeepSQue("productId_ExistsReferrer_TLotList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetProductId_ExistsReferrer_TMoveInstBList() { return xgetSQueMap("productId_ExistsReferrer_TMoveInstBList"); }
    public String keepProductId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("productId_ExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetProductId_ExistsReferrer_TReceivePlanBList() { return xgetSQueMap("productId_ExistsReferrer_TReceivePlanBList"); }
    public String keepProductId_ExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("productId_ExistsReferrer_TReceivePlanBList", sq); }

    public Map<String, TSerialNoCQ> xdfgetProductId_ExistsReferrer_TSerialNoList() { return xgetSQueMap("productId_ExistsReferrer_TSerialNoList"); }
    public String keepProductId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("productId_ExistsReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetProductId_ExistsReferrer_TShippingInstBList() { return xgetSQueMap("productId_ExistsReferrer_TShippingInstBList"); }
    public String keepProductId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("productId_ExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetProductId_ExistsReferrer_TStockList() { return xgetSQueMap("productId_ExistsReferrer_TStockList"); }
    public String keepProductId_ExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("productId_ExistsReferrer_TStockList", sq); }

    public Map<String, TTrinvcheckinfoCQ> xdfgetProductId_ExistsReferrer_TTrinvcheckinfoList() { return xgetSQueMap("productId_ExistsReferrer_TTrinvcheckinfoList"); }
    public String keepProductId_ExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq) { return xkeepSQue("productId_ExistsReferrer_TTrinvcheckinfoList", sq); }

    public Map<String, TYtrsodetailCQ> xdfgetProductId_ExistsReferrer_TYtrsodetailList() { return xgetSQueMap("productId_ExistsReferrer_TYtrsodetailList"); }
    public String keepProductId_ExistsReferrer_TYtrsodetailList(TYtrsodetailCQ sq) { return xkeepSQue("productId_ExistsReferrer_TYtrsodetailList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetProductId_ExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("productId_ExistsReferrer_WHtInventoryInputProdList"); }
    public String keepProductId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetProductId_ExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("productId_ExistsReferrer_WHtReceiveInspectionList"); }
    public String keepProductId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetProductId_ExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("productId_ExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProductId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetProductId_ExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("productId_ExistsReferrer_WHtReceiveStoreList"); }
    public String keepProductId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtShippingCQ> xdfgetProductId_ExistsReferrer_WHtShippingList() { return xgetSQueMap("productId_ExistsReferrer_WHtShippingList"); }
    public String keepProductId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetProductId_ExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("productId_ExistsReferrer_WHtShippingPickingList"); }
    public String keepProductId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetProductId_ExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("productId_ExistsReferrer_WSglRowShipInspHList"); }
    public String keepProductId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("productId_ExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetProductId_ExistsReferrer_WShippingInterruptList() { return xgetSQueMap("productId_ExistsReferrer_WShippingInterruptList"); }
    public String keepProductId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("productId_ExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, MLocationCQ> xdfgetProductId_NotExistsReferrer_MLocationList() { return xgetSQueMap("productId_NotExistsReferrer_MLocationList"); }
    public String keepProductId_NotExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("productId_NotExistsReferrer_MLocationList", sq); }

    public Map<String, MMfwhxitemCQ> xdfgetProductId_NotExistsReferrer_MMfwhxitemList() { return xgetSQueMap("productId_NotExistsReferrer_MMfwhxitemList"); }
    public String keepProductId_NotExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq) { return xkeepSQue("productId_NotExistsReferrer_MMfwhxitemList", sq); }

    public Map<String, MProductCQ> xdfgetProductId_NotExistsReferrer_MProductSelfAsOne() { return xgetSQueMap("productId_NotExistsReferrer_MProductSelfAsOne"); }
    public String keepProductId_NotExistsReferrer_MProductSelfAsOne(MProductCQ sq) { return xkeepSQue("productId_NotExistsReferrer_MProductSelfAsOne", sq); }

    public Map<String, MProductShapeCQ> xdfgetProductId_NotExistsReferrer_MProductShapeList() { return xgetSQueMap("productId_NotExistsReferrer_MProductShapeList"); }
    public String keepProductId_NotExistsReferrer_MProductShapeList(MProductShapeCQ sq) { return xkeepSQue("productId_NotExistsReferrer_MProductShapeList", sq); }

    public Map<String, MProductTermCQ> xdfgetProductId_NotExistsReferrer_MProductTermAsOne() { return xgetSQueMap("productId_NotExistsReferrer_MProductTermAsOne"); }
    public String keepProductId_NotExistsReferrer_MProductTermAsOne(MProductTermCQ sq) { return xkeepSQue("productId_NotExistsReferrer_MProductTermAsOne", sq); }

    public Map<String, MSetParentCQ> xdfgetProductId_NotExistsReferrer_MSetParentAsOne() { return xgetSQueMap("productId_NotExistsReferrer_MSetParentAsOne"); }
    public String keepProductId_NotExistsReferrer_MSetParentAsOne(MSetParentCQ sq) { return xkeepSQue("productId_NotExistsReferrer_MSetParentAsOne", sq); }

    public Map<String, MSetStructureCQ> xdfgetProductId_NotExistsReferrer_MSetStructureList() { return xgetSQueMap("productId_NotExistsReferrer_MSetStructureList"); }
    public String keepProductId_NotExistsReferrer_MSetStructureList(MSetStructureCQ sq) { return xkeepSQue("productId_NotExistsReferrer_MSetStructureList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetProductId_NotExistsReferrer_TAllocInstBList() { return xgetSQueMap("productId_NotExistsReferrer_TAllocInstBList"); }
    public String keepProductId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TAllocLotCQ> xdfgetProductId_NotExistsReferrer_TAllocLotList() { return xgetSQueMap("productId_NotExistsReferrer_TAllocLotList"); }
    public String keepProductId_NotExistsReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TAllocLotList", sq); }

    public Map<String, TInventoryBCQ> xdfgetProductId_NotExistsReferrer_TInventoryBList() { return xgetSQueMap("productId_NotExistsReferrer_TInventoryBList"); }
    public String keepProductId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TInventoryBList", sq); }

    public Map<String, TKeepingLotCQ> xdfgetProductId_NotExistsReferrer_TKeepingLotList() { return xgetSQueMap("productId_NotExistsReferrer_TKeepingLotList"); }
    public String keepProductId_NotExistsReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TKeepingLotList", sq); }

    public Map<String, TLastLotCQ> xdfgetProductId_NotExistsReferrer_TLastLotList() { return xgetSQueMap("productId_NotExistsReferrer_TLastLotList"); }
    public String keepProductId_NotExistsReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TLastLotList", sq); }

    public Map<String, TLotCQ> xdfgetProductId_NotExistsReferrer_TLotList() { return xgetSQueMap("productId_NotExistsReferrer_TLotList"); }
    public String keepProductId_NotExistsReferrer_TLotList(TLotCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TLotList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetProductId_NotExistsReferrer_TMoveInstBList() { return xgetSQueMap("productId_NotExistsReferrer_TMoveInstBList"); }
    public String keepProductId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetProductId_NotExistsReferrer_TReceivePlanBList() { return xgetSQueMap("productId_NotExistsReferrer_TReceivePlanBList"); }
    public String keepProductId_NotExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TReceivePlanBList", sq); }

    public Map<String, TSerialNoCQ> xdfgetProductId_NotExistsReferrer_TSerialNoList() { return xgetSQueMap("productId_NotExistsReferrer_TSerialNoList"); }
    public String keepProductId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetProductId_NotExistsReferrer_TShippingInstBList() { return xgetSQueMap("productId_NotExistsReferrer_TShippingInstBList"); }
    public String keepProductId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetProductId_NotExistsReferrer_TStockList() { return xgetSQueMap("productId_NotExistsReferrer_TStockList"); }
    public String keepProductId_NotExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TStockList", sq); }

    public Map<String, TTrinvcheckinfoCQ> xdfgetProductId_NotExistsReferrer_TTrinvcheckinfoList() { return xgetSQueMap("productId_NotExistsReferrer_TTrinvcheckinfoList"); }
    public String keepProductId_NotExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TTrinvcheckinfoList", sq); }

    public Map<String, TYtrsodetailCQ> xdfgetProductId_NotExistsReferrer_TYtrsodetailList() { return xgetSQueMap("productId_NotExistsReferrer_TYtrsodetailList"); }
    public String keepProductId_NotExistsReferrer_TYtrsodetailList(TYtrsodetailCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TYtrsodetailList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetProductId_NotExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("productId_NotExistsReferrer_WHtInventoryInputProdList"); }
    public String keepProductId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetProductId_NotExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("productId_NotExistsReferrer_WHtReceiveInspectionList"); }
    public String keepProductId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetProductId_NotExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("productId_NotExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProductId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetProductId_NotExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("productId_NotExistsReferrer_WHtReceiveStoreList"); }
    public String keepProductId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtShippingCQ> xdfgetProductId_NotExistsReferrer_WHtShippingList() { return xgetSQueMap("productId_NotExistsReferrer_WHtShippingList"); }
    public String keepProductId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetProductId_NotExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("productId_NotExistsReferrer_WHtShippingPickingList"); }
    public String keepProductId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetProductId_NotExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("productId_NotExistsReferrer_WSglRowShipInspHList"); }
    public String keepProductId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetProductId_NotExistsReferrer_WShippingInterruptList() { return xgetSQueMap("productId_NotExistsReferrer_WShippingInterruptList"); }
    public String keepProductId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, MLocationCQ> xdfgetProductId_SpecifyDerivedReferrer_MLocationList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_MLocationList"); }
    public String keepProductId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_MLocationList", sq); }

    public Map<String, MMfwhxitemCQ> xdfgetProductId_SpecifyDerivedReferrer_MMfwhxitemList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_MMfwhxitemList"); }
    public String keepProductId_SpecifyDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_MMfwhxitemList", sq); }

    public Map<String, MProductShapeCQ> xdfgetProductId_SpecifyDerivedReferrer_MProductShapeList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_MProductShapeList"); }
    public String keepProductId_SpecifyDerivedReferrer_MProductShapeList(MProductShapeCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_MProductShapeList", sq); }

    public Map<String, MSetStructureCQ> xdfgetProductId_SpecifyDerivedReferrer_MSetStructureList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_MSetStructureList"); }
    public String keepProductId_SpecifyDerivedReferrer_MSetStructureList(MSetStructureCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_MSetStructureList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetProductId_SpecifyDerivedReferrer_TAllocInstBList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TAllocInstBList"); }
    public String keepProductId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TAllocInstBList", sq); }

    public Map<String, TAllocLotCQ> xdfgetProductId_SpecifyDerivedReferrer_TAllocLotList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TAllocLotList"); }
    public String keepProductId_SpecifyDerivedReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TAllocLotList", sq); }

    public Map<String, TInventoryBCQ> xdfgetProductId_SpecifyDerivedReferrer_TInventoryBList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TInventoryBList"); }
    public String keepProductId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TInventoryBList", sq); }

    public Map<String, TKeepingLotCQ> xdfgetProductId_SpecifyDerivedReferrer_TKeepingLotList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TKeepingLotList"); }
    public String keepProductId_SpecifyDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TKeepingLotList", sq); }

    public Map<String, TLastLotCQ> xdfgetProductId_SpecifyDerivedReferrer_TLastLotList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TLastLotList"); }
    public String keepProductId_SpecifyDerivedReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TLastLotList", sq); }

    public Map<String, TLotCQ> xdfgetProductId_SpecifyDerivedReferrer_TLotList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TLotList"); }
    public String keepProductId_SpecifyDerivedReferrer_TLotList(TLotCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TLotList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetProductId_SpecifyDerivedReferrer_TMoveInstBList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TMoveInstBList"); }
    public String keepProductId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TMoveInstBList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetProductId_SpecifyDerivedReferrer_TReceivePlanBList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TReceivePlanBList"); }
    public String keepProductId_SpecifyDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TReceivePlanBList", sq); }

    public Map<String, TSerialNoCQ> xdfgetProductId_SpecifyDerivedReferrer_TSerialNoList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TSerialNoList"); }
    public String keepProductId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetProductId_SpecifyDerivedReferrer_TShippingInstBList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TShippingInstBList"); }
    public String keepProductId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetProductId_SpecifyDerivedReferrer_TStockList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TStockList"); }
    public String keepProductId_SpecifyDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TStockList", sq); }

    public Map<String, TTrinvcheckinfoCQ> xdfgetProductId_SpecifyDerivedReferrer_TTrinvcheckinfoList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TTrinvcheckinfoList"); }
    public String keepProductId_SpecifyDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TTrinvcheckinfoList", sq); }

    public Map<String, TYtrsodetailCQ> xdfgetProductId_SpecifyDerivedReferrer_TYtrsodetailList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TYtrsodetailList"); }
    public String keepProductId_SpecifyDerivedReferrer_TYtrsodetailList(TYtrsodetailCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TYtrsodetailList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtReceiveStoreList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtShippingCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtShippingList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtShippingList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtShippingPickingList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtShippingPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetProductId_SpecifyDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WSglRowShipInspHList"); }
    public String keepProductId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetProductId_SpecifyDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WShippingInterruptList"); }
    public String keepProductId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WShippingInterruptList", sq); }

    public Map<String, MLocationCQ> xdfgetProductId_QueryDerivedReferrer_MLocationList() { return xgetSQueMap("productId_QueryDerivedReferrer_MLocationList"); }
    public String keepProductId_QueryDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_MLocationList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_MLocationListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_MLocationList"); }
    public String keepProductId_QueryDerivedReferrer_MLocationListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_MLocationList", pm); }

    public Map<String, MMfwhxitemCQ> xdfgetProductId_QueryDerivedReferrer_MMfwhxitemList() { return xgetSQueMap("productId_QueryDerivedReferrer_MMfwhxitemList"); }
    public String keepProductId_QueryDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_MMfwhxitemList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_MMfwhxitemListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_MMfwhxitemList"); }
    public String keepProductId_QueryDerivedReferrer_MMfwhxitemListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_MMfwhxitemList", pm); }

    public Map<String, MProductShapeCQ> xdfgetProductId_QueryDerivedReferrer_MProductShapeList() { return xgetSQueMap("productId_QueryDerivedReferrer_MProductShapeList"); }
    public String keepProductId_QueryDerivedReferrer_MProductShapeList(MProductShapeCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_MProductShapeList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_MProductShapeListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_MProductShapeList"); }
    public String keepProductId_QueryDerivedReferrer_MProductShapeListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_MProductShapeList", pm); }

    public Map<String, MSetStructureCQ> xdfgetProductId_QueryDerivedReferrer_MSetStructureList() { return xgetSQueMap("productId_QueryDerivedReferrer_MSetStructureList"); }
    public String keepProductId_QueryDerivedReferrer_MSetStructureList(MSetStructureCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_MSetStructureList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_MSetStructureListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_MSetStructureList"); }
    public String keepProductId_QueryDerivedReferrer_MSetStructureListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_MSetStructureList", pm); }

    public Map<String, TAllocInstBCQ> xdfgetProductId_QueryDerivedReferrer_TAllocInstBList() { return xgetSQueMap("productId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepProductId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TAllocInstBList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TAllocInstBListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepProductId_QueryDerivedReferrer_TAllocInstBListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TAllocInstBList", pm); }

    public Map<String, TAllocLotCQ> xdfgetProductId_QueryDerivedReferrer_TAllocLotList() { return xgetSQueMap("productId_QueryDerivedReferrer_TAllocLotList"); }
    public String keepProductId_QueryDerivedReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TAllocLotList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TAllocLotListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TAllocLotList"); }
    public String keepProductId_QueryDerivedReferrer_TAllocLotListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TAllocLotList", pm); }

    public Map<String, TInventoryBCQ> xdfgetProductId_QueryDerivedReferrer_TInventoryBList() { return xgetSQueMap("productId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepProductId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TInventoryBList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TInventoryBListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepProductId_QueryDerivedReferrer_TInventoryBListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TInventoryBList", pm); }

    public Map<String, TKeepingLotCQ> xdfgetProductId_QueryDerivedReferrer_TKeepingLotList() { return xgetSQueMap("productId_QueryDerivedReferrer_TKeepingLotList"); }
    public String keepProductId_QueryDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TKeepingLotList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TKeepingLotListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TKeepingLotList"); }
    public String keepProductId_QueryDerivedReferrer_TKeepingLotListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TKeepingLotList", pm); }

    public Map<String, TLastLotCQ> xdfgetProductId_QueryDerivedReferrer_TLastLotList() { return xgetSQueMap("productId_QueryDerivedReferrer_TLastLotList"); }
    public String keepProductId_QueryDerivedReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TLastLotList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TLastLotListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TLastLotList"); }
    public String keepProductId_QueryDerivedReferrer_TLastLotListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TLastLotList", pm); }

    public Map<String, TLotCQ> xdfgetProductId_QueryDerivedReferrer_TLotList() { return xgetSQueMap("productId_QueryDerivedReferrer_TLotList"); }
    public String keepProductId_QueryDerivedReferrer_TLotList(TLotCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TLotList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TLotListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TLotList"); }
    public String keepProductId_QueryDerivedReferrer_TLotListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TLotList", pm); }

    public Map<String, TMoveInstBCQ> xdfgetProductId_QueryDerivedReferrer_TMoveInstBList() { return xgetSQueMap("productId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepProductId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TMoveInstBList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TMoveInstBListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepProductId_QueryDerivedReferrer_TMoveInstBListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TMoveInstBList", pm); }

    public Map<String, TReceivePlanBCQ> xdfgetProductId_QueryDerivedReferrer_TReceivePlanBList() { return xgetSQueMap("productId_QueryDerivedReferrer_TReceivePlanBList"); }
    public String keepProductId_QueryDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TReceivePlanBList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TReceivePlanBListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TReceivePlanBList"); }
    public String keepProductId_QueryDerivedReferrer_TReceivePlanBListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TReceivePlanBList", pm); }

    public Map<String, TSerialNoCQ> xdfgetProductId_QueryDerivedReferrer_TSerialNoList() { return xgetSQueMap("productId_QueryDerivedReferrer_TSerialNoList"); }
    public String keepProductId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TSerialNoList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TSerialNoListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TSerialNoList"); }
    public String keepProductId_QueryDerivedReferrer_TSerialNoListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TSerialNoList", pm); }

    public Map<String, TShippingInstBCQ> xdfgetProductId_QueryDerivedReferrer_TShippingInstBList() { return xgetSQueMap("productId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepProductId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TShippingInstBList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TShippingInstBListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepProductId_QueryDerivedReferrer_TShippingInstBListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TShippingInstBList", pm); }

    public Map<String, TStockCQ> xdfgetProductId_QueryDerivedReferrer_TStockList() { return xgetSQueMap("productId_QueryDerivedReferrer_TStockList"); }
    public String keepProductId_QueryDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TStockList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TStockListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TStockList"); }
    public String keepProductId_QueryDerivedReferrer_TStockListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TStockList", pm); }

    public Map<String, TTrinvcheckinfoCQ> xdfgetProductId_QueryDerivedReferrer_TTrinvcheckinfoList() { return xgetSQueMap("productId_QueryDerivedReferrer_TTrinvcheckinfoList"); }
    public String keepProductId_QueryDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TTrinvcheckinfoList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TTrinvcheckinfoListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TTrinvcheckinfoList"); }
    public String keepProductId_QueryDerivedReferrer_TTrinvcheckinfoListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TTrinvcheckinfoList", pm); }

    public Map<String, TYtrsodetailCQ> xdfgetProductId_QueryDerivedReferrer_TYtrsodetailList() { return xgetSQueMap("productId_QueryDerivedReferrer_TYtrsodetailList"); }
    public String keepProductId_QueryDerivedReferrer_TYtrsodetailList(TYtrsodetailCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TYtrsodetailList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TYtrsodetailListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TYtrsodetailList"); }
    public String keepProductId_QueryDerivedReferrer_TYtrsodetailListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TYtrsodetailList", pm); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetProductId_QueryDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepProductId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtInventoryInputProdList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtInventoryInputProdListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepProductId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtInventoryInputProdList", pm); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetProductId_QueryDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtReceiveInspectionList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtReceiveInspectionListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtReceiveInspectionList", pm); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", pm); }

    public Map<String, WHtReceiveStoreCQ> xdfgetProductId_QueryDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtReceiveStoreList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtReceiveStoreListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtReceiveStoreList", pm); }

    public Map<String, WHtShippingCQ> xdfgetProductId_QueryDerivedReferrer_WHtShippingList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepProductId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtShippingList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtShippingListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepProductId_QueryDerivedReferrer_WHtShippingListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtShippingList", pm); }

    public Map<String, WHtShippingPickingCQ> xdfgetProductId_QueryDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepProductId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtShippingPickingList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtShippingPickingListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepProductId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtShippingPickingList", pm); }

    public Map<String, WSglRowShipInspHCQ> xdfgetProductId_QueryDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("productId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepProductId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WSglRowShipInspHList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WSglRowShipInspHListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepProductId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WSglRowShipInspHList", pm); }

    public Map<String, WShippingInterruptCQ> xdfgetProductId_QueryDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("productId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepProductId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WShippingInterruptList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WShippingInterruptListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepProductId_QueryDerivedReferrer_WShippingInterruptListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WShippingInterruptList", pm); }

    public Map<String, MProductCQ> getProductId_InScopeRelation_MProductSelf() { return xgetSQueMap("productId_InScopeRelation_MProductSelf"); }
    public String keepProductId_InScopeRelation_MProductSelf(MProductCQ sq) { return xkeepSQue("productId_InScopeRelation_MProductSelf", sq); }

    public Map<String, MProductCQ> getProductId_NotInScopeRelation_MProductSelf() { return xgetSQueMap("productId_NotInScopeRelation_MProductSelf"); }
    public String keepProductId_NotInScopeRelation_MProductSelf(MProductCQ sq) { return xkeepSQue("productId_NotInScopeRelation_MProductSelf", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _productNm;
    public ConditionValue xdfgetProductNm()
    { if (_productNm == null) { _productNm = nCV(); }
      return _productNm; }
    protected ConditionValue xgetCValueProductNm() { return xdfgetProductNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _productAbbr;
    public ConditionValue xdfgetProductAbbr()
    { if (_productAbbr == null) { _productAbbr = nCV(); }
      return _productAbbr; }
    protected ConditionValue xgetCValueProductAbbr() { return xdfgetProductAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductAbbr_Asc() { regOBA("PRODUCT_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductAbbr_Desc() { regOBD("PRODUCT_ABBR"); return this; }

    protected ConditionValue _janCd;
    public ConditionValue xdfgetJanCd()
    { if (_janCd == null) { _janCd = nCV(); }
      return _janCd; }
    protected ConditionValue xgetCValueJanCd() { return xdfgetJanCd(); }

    /**
     * Add order-by as ascend. <br>
     * JAN_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _lotManagFlg;
    public ConditionValue xdfgetLotManagFlg()
    { if (_lotManagFlg == null) { _lotManagFlg = nCV(); }
      return _lotManagFlg; }
    protected ConditionValue xgetCValueLotManagFlg() { return xdfgetLotManagFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LotManagFlg_Asc() { regOBA("LOT_MANAG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LotManagFlg_Desc() { regOBD("LOT_MANAG_FLG"); return this; }

    protected ConditionValue _limitDtManagFlg;
    public ConditionValue xdfgetLimitDtManagFlg()
    { if (_limitDtManagFlg == null) { _limitDtManagFlg = nCV(); }
      return _limitDtManagFlg; }
    protected ConditionValue xgetCValueLimitDtManagFlg() { return xdfgetLimitDtManagFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LimitDtManagFlg_Asc() { regOBA("LIMIT_DT_MANAG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LimitDtManagFlg_Desc() { regOBD("LIMIT_DT_MANAG_FLG"); return this; }

    protected ConditionValue _receiveLimitNum;
    public ConditionValue xdfgetReceiveLimitNum()
    { if (_receiveLimitNum == null) { _receiveLimitNum = nCV(); }
      return _receiveLimitNum; }
    protected ConditionValue xgetCValueReceiveLimitNum() { return xdfgetReceiveLimitNum(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ReceiveLimitNum_Asc() { regOBA("RECEIVE_LIMIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ReceiveLimitNum_Desc() { regOBD("RECEIVE_LIMIT_NUM"); return this; }

    protected ConditionValue _shippingLimitNum;
    public ConditionValue xdfgetShippingLimitNum()
    { if (_shippingLimitNum == null) { _shippingLimitNum = nCV(); }
      return _shippingLimitNum; }
    protected ConditionValue xgetCValueShippingLimitNum() { return xdfgetShippingLimitNum(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ShippingLimitNum_Asc() { regOBA("SHIPPING_LIMIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ShippingLimitNum_Desc() { regOBD("SHIPPING_LIMIT_NUM"); return this; }

    protected ConditionValue _mergeCls;
    public ConditionValue xdfgetMergeCls()
    { if (_mergeCls == null) { _mergeCls = nCV(); }
      return _mergeCls; }
    protected ConditionValue xgetCValueMergeCls() { return xdfgetMergeCls(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_MergeCls_Asc() { regOBA("MERGE_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_MergeCls_Desc() { regOBD("MERGE_CLS"); return this; }

    protected ConditionValue _lotReverseFlg;
    public ConditionValue xdfgetLotReverseFlg()
    { if (_lotReverseFlg == null) { _lotReverseFlg = nCV(); }
      return _lotReverseFlg; }
    protected ConditionValue xgetCValueLotReverseFlg() { return xdfgetLotReverseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LotReverseFlg_Asc() { regOBA("LOT_REVERSE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LotReverseFlg_Desc() { regOBD("LOT_REVERSE_FLG"); return this; }

    protected ConditionValue _limitDtReverseFlg;
    public ConditionValue xdfgetLimitDtReverseFlg()
    { if (_limitDtReverseFlg == null) { _limitDtReverseFlg = nCV(); }
      return _limitDtReverseFlg; }
    protected ConditionValue xgetCValueLimitDtReverseFlg() { return xdfgetLimitDtReverseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LimitDtReverseFlg_Asc() { regOBA("LIMIT_DT_REVERSE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LimitDtReverseFlg_Desc() { regOBD("LIMIT_DT_REVERSE_FLG"); return this; }

    protected ConditionValue _shippingStopFlg;
    public ConditionValue xdfgetShippingStopFlg()
    { if (_shippingStopFlg == null) { _shippingStopFlg = nCV(); }
      return _shippingStopFlg; }
    protected ConditionValue xgetCValueShippingStopFlg() { return xdfgetShippingStopFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ShippingStopFlg_Asc() { regOBA("SHIPPING_STOP_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ShippingStopFlg_Desc() { regOBD("SHIPPING_STOP_FLG"); return this; }

    protected ConditionValue _fixedPoint;
    public ConditionValue xdfgetFixedPoint()
    { if (_fixedPoint == null) { _fixedPoint = nCV(); }
      return _fixedPoint; }
    protected ConditionValue xgetCValueFixedPoint() { return xdfgetFixedPoint(); }

    /**
     * Add order-by as ascend. <br>
     * FIXED_POINT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FixedPoint_Asc() { regOBA("FIXED_POINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIXED_POINT: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FixedPoint_Desc() { regOBD("FIXED_POINT"); return this; }

    protected ConditionValue _shapeGrpId;
    public ConditionValue xdfgetShapeGrpId()
    { if (_shapeGrpId == null) { _shapeGrpId = nCV(); }
      return _shapeGrpId; }
    protected ConditionValue xgetCValueShapeGrpId() { return xdfgetShapeGrpId(); }

    public Map<String, MShapeGrpCQ> getShapeGrpId_InScopeRelation_MShapeGrp() { return xgetSQueMap("shapeGrpId_InScopeRelation_MShapeGrp"); }
    public String keepShapeGrpId_InScopeRelation_MShapeGrp(MShapeGrpCQ sq) { return xkeepSQue("shapeGrpId_InScopeRelation_MShapeGrp", sq); }

    public Map<String, MShapeGrpCQ> getShapeGrpId_NotInScopeRelation_MShapeGrp() { return xgetSQueMap("shapeGrpId_NotInScopeRelation_MShapeGrp"); }
    public String keepShapeGrpId_NotInScopeRelation_MShapeGrp(MShapeGrpCQ sq) { return xkeepSQue("shapeGrpId_NotInScopeRelation_MShapeGrp", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ShapeGrpId_Asc() { regOBA("SHAPE_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ShapeGrpId_Desc() { regOBD("SHAPE_GRP_ID"); return this; }

    protected ConditionValue _nmfcCode;
    public ConditionValue xdfgetNmfcCode()
    { if (_nmfcCode == null) { _nmfcCode = nCV(); }
      return _nmfcCode; }
    protected ConditionValue xgetCValueNmfcCode() { return xdfgetNmfcCode(); }

    /**
     * Add order-by as ascend. <br>
     * NMFC_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_NmfcCode_Asc() { regOBA("NMFC_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * NMFC_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_NmfcCode_Desc() { regOBD("NMFC_CODE"); return this; }

    protected ConditionValue _freightCls;
    public ConditionValue xdfgetFreightCls()
    { if (_freightCls == null) { _freightCls = nCV(); }
      return _freightCls; }
    protected ConditionValue xgetCValueFreightCls() { return xdfgetFreightCls(); }

    /**
     * Add order-by as ascend. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FreightCls_Asc() { regOBA("FREIGHT_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FreightCls_Desc() { regOBD("FREIGHT_CLS"); return this; }

    protected ConditionValue _counntryOfOrigin;
    public ConditionValue xdfgetCounntryOfOrigin()
    { if (_counntryOfOrigin == null) { _counntryOfOrigin = nCV(); }
      return _counntryOfOrigin; }
    protected ConditionValue xgetCValueCounntryOfOrigin() { return xdfgetCounntryOfOrigin(); }

    /**
     * Add order-by as ascend. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_CounntryOfOrigin_Asc() { regOBA("COUNNTRY_OF_ORIGIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNNTRY_OF_ORIGIN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_CounntryOfOrigin_Desc() { regOBD("COUNNTRY_OF_ORIGIN"); return this; }

    protected ConditionValue _unitVal;
    public ConditionValue xdfgetUnitVal()
    { if (_unitVal == null) { _unitVal = nCV(); }
      return _unitVal; }
    protected ConditionValue xgetCValueUnitVal() { return xdfgetUnitVal(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_VAL: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UnitVal_Asc() { regOBA("UNIT_VAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_VAL: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UnitVal_Desc() { regOBD("UNIT_VAL"); return this; }

    protected ConditionValue _htsCd;
    public ConditionValue xdfgetHtsCd()
    { if (_htsCd == null) { _htsCd = nCV(); }
      return _htsCd; }
    protected ConditionValue xgetCValueHtsCd() { return xdfgetHtsCd(); }

    /**
     * Add order-by as ascend. <br>
     * HTS_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_HtsCd_Asc() { regOBA("HTS_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HTS_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_HtsCd_Desc() { regOBD("HTS_CD"); return this; }

    protected ConditionValue _itemgroup;
    public ConditionValue xdfgetItemgroup()
    { if (_itemgroup == null) { _itemgroup = nCV(); }
      return _itemgroup; }
    protected ConditionValue xgetCValueItemgroup() { return xdfgetItemgroup(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Itemgroup_Asc() { regOBA("ITEMGROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Itemgroup_Desc() { regOBD("ITEMGROUP"); return this; }

    protected ConditionValue _actflg;
    public ConditionValue xdfgetActflg()
    { if (_actflg == null) { _actflg = nCV(); }
      return _actflg; }
    protected ConditionValue xgetCValueActflg() { return xdfgetActflg(); }

    /**
     * Add order-by as ascend. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Actflg_Asc() { regOBA("ACTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Actflg_Desc() { regOBD("ACTFLG"); return this; }

    protected ConditionValue _invtype;
    public ConditionValue xdfgetInvtype()
    { if (_invtype == null) { _invtype = nCV(); }
      return _invtype; }
    protected ConditionValue xgetCValueInvtype() { return xdfgetInvtype(); }

    /**
     * Add order-by as ascend. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Invtype_Asc() { regOBA("INVTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVTYPE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Invtype_Desc() { regOBD("INVTYPE"); return this; }

    protected ConditionValue _setitemflg;
    public ConditionValue xdfgetSetitemflg()
    { if (_setitemflg == null) { _setitemflg = nCV(); }
      return _setitemflg; }
    protected ConditionValue xgetCValueSetitemflg() { return xdfgetSetitemflg(); }

    /**
     * Add order-by as ascend. <br>
     * SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Setitemflg_Asc() { regOBA("SETITEMFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Setitemflg_Desc() { regOBD("SETITEMFLG"); return this; }

    protected ConditionValue _owneritemcd;
    public ConditionValue xdfgetOwneritemcd()
    { if (_owneritemcd == null) { _owneritemcd = nCV(); }
      return _owneritemcd; }
    protected ConditionValue xgetCValueOwneritemcd() { return xdfgetOwneritemcd(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Owneritemcd_Asc() { regOBA("OWNERITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Owneritemcd_Desc() { regOBD("OWNERITEMCD"); return this; }

    protected ConditionValue _supplieritemcd;
    public ConditionValue xdfgetSupplieritemcd()
    { if (_supplieritemcd == null) { _supplieritemcd = nCV(); }
      return _supplieritemcd; }
    protected ConditionValue xgetCValueSupplieritemcd() { return xdfgetSupplieritemcd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Supplieritemcd_Asc() { regOBA("SUPPLIERITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Supplieritemcd_Desc() { regOBD("SUPPLIERITEMCD"); return this; }

    protected ConditionValue _positemcd;
    public ConditionValue xdfgetPositemcd()
    { if (_positemcd == null) { _positemcd = nCV(); }
      return _positemcd; }
    protected ConditionValue xgetCValuePositemcd() { return xdfgetPositemcd(); }

    /**
     * Add order-by as ascend. <br>
     * POSITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Positemcd_Asc() { regOBA("POSITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * POSITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Positemcd_Desc() { regOBD("POSITEMCD"); return this; }

    protected ConditionValue _itfcd;
    public ConditionValue xdfgetItfcd()
    { if (_itfcd == null) { _itfcd = nCV(); }
      return _itfcd; }
    protected ConditionValue xgetCValueItfcd() { return xdfgetItfcd(); }

    /**
     * Add order-by as ascend. <br>
     * ITFCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Itfcd_Asc() { regOBA("ITFCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITFCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Itfcd_Desc() { regOBD("ITFCD"); return this; }

    protected ConditionValue _manuitemcd;
    public ConditionValue xdfgetManuitemcd()
    { if (_manuitemcd == null) { _manuitemcd = nCV(); }
      return _manuitemcd; }
    protected ConditionValue xgetCValueManuitemcd() { return xdfgetManuitemcd(); }

    /**
     * Add order-by as ascend. <br>
     * MANUITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Manuitemcd_Asc() { regOBA("MANUITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Manuitemcd_Desc() { regOBD("MANUITEMCD"); return this; }

    protected ConditionValue _priceBuy;
    public ConditionValue xdfgetPriceBuy()
    { if (_priceBuy == null) { _priceBuy = nCV(); }
      return _priceBuy; }
    protected ConditionValue xgetCValuePriceBuy() { return xdfgetPriceBuy(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PriceBuy_Asc() { regOBA("PRICE_BUY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PriceBuy_Desc() { regOBD("PRICE_BUY"); return this; }

    protected ConditionValue _priceWholesale;
    public ConditionValue xdfgetPriceWholesale()
    { if (_priceWholesale == null) { _priceWholesale = nCV(); }
      return _priceWholesale; }
    protected ConditionValue xgetCValuePriceWholesale() { return xdfgetPriceWholesale(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PriceWholesale_Asc() { regOBA("PRICE_WHOLESALE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PriceWholesale_Desc() { regOBD("PRICE_WHOLESALE"); return this; }

    protected ConditionValue _priceSale;
    public ConditionValue xdfgetPriceSale()
    { if (_priceSale == null) { _priceSale = nCV(); }
      return _priceSale; }
    protected ConditionValue xgetCValuePriceSale() { return xdfgetPriceSale(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PriceSale_Asc() { regOBA("PRICE_SALE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PriceSale_Desc() { regOBD("PRICE_SALE"); return this; }

    protected ConditionValue _allocpolicykey;
    public ConditionValue xdfgetAllocpolicykey()
    { if (_allocpolicykey == null) { _allocpolicykey = nCV(); }
      return _allocpolicykey; }
    protected ConditionValue xgetCValueAllocpolicykey() { return xdfgetAllocpolicykey(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Allocpolicykey_Asc() { regOBA("ALLOCPOLICYKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOCPOLICYKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Allocpolicykey_Desc() { regOBD("ALLOCPOLICYKEY"); return this; }

    protected ConditionValue _slotpolicykey;
    public ConditionValue xdfgetSlotpolicykey()
    { if (_slotpolicykey == null) { _slotpolicykey = nCV(); }
      return _slotpolicykey; }
    protected ConditionValue xgetCValueSlotpolicykey() { return xdfgetSlotpolicykey(); }

    /**
     * Add order-by as ascend. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Slotpolicykey_Asc() { regOBA("SLOTPOLICYKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Slotpolicykey_Desc() { regOBD("SLOTPOLICYKEY"); return this; }

    protected ConditionValue _inworkingkey;
    public ConditionValue xdfgetInworkingkey()
    { if (_inworkingkey == null) { _inworkingkey = nCV(); }
      return _inworkingkey; }
    protected ConditionValue xgetCValueInworkingkey() { return xdfgetInworkingkey(); }

    /**
     * Add order-by as ascend. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Inworkingkey_Asc() { regOBA("INWORKINGKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Inworkingkey_Desc() { regOBD("INWORKINGKEY"); return this; }

    protected ConditionValue _outworkingkey;
    public ConditionValue xdfgetOutworkingkey()
    { if (_outworkingkey == null) { _outworkingkey = nCV(); }
      return _outworkingkey; }
    protected ConditionValue xgetCValueOutworkingkey() { return xdfgetOutworkingkey(); }

    /**
     * Add order-by as ascend. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Outworkingkey_Asc() { regOBA("OUTWORKINGKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Outworkingkey_Desc() { regOBD("OUTWORKINGKEY"); return this; }

    protected ConditionValue _abctype;
    public ConditionValue xdfgetAbctype()
    { if (_abctype == null) { _abctype = nCV(); }
      return _abctype; }
    protected ConditionValue xgetCValueAbctype() { return xdfgetAbctype(); }

    /**
     * Add order-by as ascend. <br>
     * ABCTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Abctype_Asc() { regOBA("ABCTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ABCTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Abctype_Desc() { regOBD("ABCTYPE"); return this; }

    protected ConditionValue _qty1type;
    public ConditionValue xdfgetQty1type()
    { if (_qty1type == null) { _qty1type = nCV(); }
      return _qty1type; }
    protected ConditionValue xgetCValueQty1type() { return xdfgetQty1type(); }

    /**
     * Add order-by as ascend. <br>
     * QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Qty1type_Asc() { regOBA("QTY1TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Qty1type_Desc() { regOBD("QTY1TYPE"); return this; }

    protected ConditionValue _unit1;
    public ConditionValue xdfgetUnit1()
    { if (_unit1 == null) { _unit1 = nCV(); }
      return _unit1; }
    protected ConditionValue xgetCValueUnit1() { return xdfgetUnit1(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Unit1_Asc() { regOBA("UNIT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Unit1_Desc() { regOBD("UNIT1"); return this; }

    protected ConditionValue _unit1style;
    public ConditionValue xdfgetUnit1style()
    { if (_unit1style == null) { _unit1style = nCV(); }
      return _unit1style; }
    protected ConditionValue xgetCValueUnit1style() { return xdfgetUnit1style(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT1STYLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Unit1style_Asc() { regOBA("UNIT1STYLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT1STYLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Unit1style_Desc() { regOBD("UNIT1STYLE"); return this; }

    protected ConditionValue _length1;
    public ConditionValue xdfgetLength1()
    { if (_length1 == null) { _length1 = nCV(); }
      return _length1; }
    protected ConditionValue xgetCValueLength1() { return xdfgetLength1(); }

    /**
     * Add order-by as ascend. <br>
     * LENGTH1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Length1_Asc() { regOBA("LENGTH1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LENGTH1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Length1_Desc() { regOBD("LENGTH1"); return this; }

    protected ConditionValue _width1;
    public ConditionValue xdfgetWidth1()
    { if (_width1 == null) { _width1 = nCV(); }
      return _width1; }
    protected ConditionValue xgetCValueWidth1() { return xdfgetWidth1(); }

    /**
     * Add order-by as ascend. <br>
     * WIDTH1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Width1_Asc() { regOBA("WIDTH1"); return this; }

    /**
     * Add order-by as descend. <br>
     * WIDTH1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Width1_Desc() { regOBD("WIDTH1"); return this; }

    protected ConditionValue _height1;
    public ConditionValue xdfgetHeight1()
    { if (_height1 == null) { _height1 = nCV(); }
      return _height1; }
    protected ConditionValue xgetCValueHeight1() { return xdfgetHeight1(); }

    /**
     * Add order-by as ascend. <br>
     * HEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Height1_Asc() { regOBA("HEIGHT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Height1_Desc() { regOBD("HEIGHT1"); return this; }

    protected ConditionValue _grossweight1;
    public ConditionValue xdfgetGrossweight1()
    { if (_grossweight1 == null) { _grossweight1 = nCV(); }
      return _grossweight1; }
    protected ConditionValue xgetCValueGrossweight1() { return xdfgetGrossweight1(); }

    /**
     * Add order-by as ascend. <br>
     * GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Grossweight1_Asc() { regOBA("GROSSWEIGHT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Grossweight1_Desc() { regOBD("GROSSWEIGHT1"); return this; }

    protected ConditionValue _netweight1;
    public ConditionValue xdfgetNetweight1()
    { if (_netweight1 == null) { _netweight1 = nCV(); }
      return _netweight1; }
    protected ConditionValue xgetCValueNetweight1() { return xdfgetNetweight1(); }

    /**
     * Add order-by as ascend. <br>
     * NETWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Netweight1_Asc() { regOBA("NETWEIGHT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NETWEIGHT1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Netweight1_Desc() { regOBD("NETWEIGHT1"); return this; }

    protected ConditionValue _cube1;
    public ConditionValue xdfgetCube1()
    { if (_cube1 == null) { _cube1 = nCV(); }
      return _cube1; }
    protected ConditionValue xgetCValueCube1() { return xdfgetCube1(); }

    /**
     * Add order-by as ascend. <br>
     * CUBE1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Cube1_Asc() { regOBA("CUBE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUBE1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Cube1_Desc() { regOBD("CUBE1"); return this; }

    protected ConditionValue _liter1;
    public ConditionValue xdfgetLiter1()
    { if (_liter1 == null) { _liter1 = nCV(); }
      return _liter1; }
    protected ConditionValue xgetCValueLiter1() { return xdfgetLiter1(); }

    /**
     * Add order-by as ascend. <br>
     * LITER1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Liter1_Asc() { regOBA("LITER1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LITER1: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Liter1_Desc() { regOBD("LITER1"); return this; }

    protected ConditionValue _unit2;
    public ConditionValue xdfgetUnit2()
    { if (_unit2 == null) { _unit2 = nCV(); }
      return _unit2; }
    protected ConditionValue xgetCValueUnit2() { return xdfgetUnit2(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT2: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Unit2_Asc() { regOBA("UNIT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT2: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Unit2_Desc() { regOBD("UNIT2"); return this; }

    protected ConditionValue _unit2style;
    public ConditionValue xdfgetUnit2style()
    { if (_unit2style == null) { _unit2style = nCV(); }
      return _unit2style; }
    protected ConditionValue xgetCValueUnit2style() { return xdfgetUnit2style(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT2STYLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Unit2style_Asc() { regOBA("UNIT2STYLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT2STYLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Unit2style_Desc() { regOBD("UNIT2STYLE"); return this; }

    protected ConditionValue _length2;
    public ConditionValue xdfgetLength2()
    { if (_length2 == null) { _length2 = nCV(); }
      return _length2; }
    protected ConditionValue xgetCValueLength2() { return xdfgetLength2(); }

    /**
     * Add order-by as ascend. <br>
     * LENGTH2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Length2_Asc() { regOBA("LENGTH2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LENGTH2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Length2_Desc() { regOBD("LENGTH2"); return this; }

    protected ConditionValue _width2;
    public ConditionValue xdfgetWidth2()
    { if (_width2 == null) { _width2 = nCV(); }
      return _width2; }
    protected ConditionValue xgetCValueWidth2() { return xdfgetWidth2(); }

    /**
     * Add order-by as ascend. <br>
     * WIDTH2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Width2_Asc() { regOBA("WIDTH2"); return this; }

    /**
     * Add order-by as descend. <br>
     * WIDTH2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Width2_Desc() { regOBD("WIDTH2"); return this; }

    protected ConditionValue _height2;
    public ConditionValue xdfgetHeight2()
    { if (_height2 == null) { _height2 = nCV(); }
      return _height2; }
    protected ConditionValue xgetCValueHeight2() { return xdfgetHeight2(); }

    /**
     * Add order-by as ascend. <br>
     * HEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Height2_Asc() { regOBA("HEIGHT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Height2_Desc() { regOBD("HEIGHT2"); return this; }

    protected ConditionValue _grossweight2;
    public ConditionValue xdfgetGrossweight2()
    { if (_grossweight2 == null) { _grossweight2 = nCV(); }
      return _grossweight2; }
    protected ConditionValue xgetCValueGrossweight2() { return xdfgetGrossweight2(); }

    /**
     * Add order-by as ascend. <br>
     * GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Grossweight2_Asc() { regOBA("GROSSWEIGHT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Grossweight2_Desc() { regOBD("GROSSWEIGHT2"); return this; }

    protected ConditionValue _netweight2;
    public ConditionValue xdfgetNetweight2()
    { if (_netweight2 == null) { _netweight2 = nCV(); }
      return _netweight2; }
    protected ConditionValue xgetCValueNetweight2() { return xdfgetNetweight2(); }

    /**
     * Add order-by as ascend. <br>
     * NETWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Netweight2_Asc() { regOBA("NETWEIGHT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NETWEIGHT2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Netweight2_Desc() { regOBD("NETWEIGHT2"); return this; }

    protected ConditionValue _cube2;
    public ConditionValue xdfgetCube2()
    { if (_cube2 == null) { _cube2 = nCV(); }
      return _cube2; }
    protected ConditionValue xgetCValueCube2() { return xdfgetCube2(); }

    /**
     * Add order-by as ascend. <br>
     * CUBE2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Cube2_Asc() { regOBA("CUBE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUBE2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Cube2_Desc() { regOBD("CUBE2"); return this; }

    protected ConditionValue _liter2;
    public ConditionValue xdfgetLiter2()
    { if (_liter2 == null) { _liter2 = nCV(); }
      return _liter2; }
    protected ConditionValue xgetCValueLiter2() { return xdfgetLiter2(); }

    /**
     * Add order-by as ascend. <br>
     * LITER2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Liter2_Asc() { regOBA("LITER2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LITER2: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Liter2_Desc() { regOBD("LITER2"); return this; }

    protected ConditionValue _unit3;
    public ConditionValue xdfgetUnit3()
    { if (_unit3 == null) { _unit3 = nCV(); }
      return _unit3; }
    protected ConditionValue xgetCValueUnit3() { return xdfgetUnit3(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT3: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Unit3_Asc() { regOBA("UNIT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT3: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Unit3_Desc() { regOBD("UNIT3"); return this; }

    protected ConditionValue _unit3style;
    public ConditionValue xdfgetUnit3style()
    { if (_unit3style == null) { _unit3style = nCV(); }
      return _unit3style; }
    protected ConditionValue xgetCValueUnit3style() { return xdfgetUnit3style(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT3STYLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Unit3style_Asc() { regOBA("UNIT3STYLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT3STYLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Unit3style_Desc() { regOBD("UNIT3STYLE"); return this; }

    protected ConditionValue _length3;
    public ConditionValue xdfgetLength3()
    { if (_length3 == null) { _length3 = nCV(); }
      return _length3; }
    protected ConditionValue xgetCValueLength3() { return xdfgetLength3(); }

    /**
     * Add order-by as ascend. <br>
     * LENGTH3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Length3_Asc() { regOBA("LENGTH3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LENGTH3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Length3_Desc() { regOBD("LENGTH3"); return this; }

    protected ConditionValue _width3;
    public ConditionValue xdfgetWidth3()
    { if (_width3 == null) { _width3 = nCV(); }
      return _width3; }
    protected ConditionValue xgetCValueWidth3() { return xdfgetWidth3(); }

    /**
     * Add order-by as ascend. <br>
     * WIDTH3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Width3_Asc() { regOBA("WIDTH3"); return this; }

    /**
     * Add order-by as descend. <br>
     * WIDTH3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Width3_Desc() { regOBD("WIDTH3"); return this; }

    protected ConditionValue _height3;
    public ConditionValue xdfgetHeight3()
    { if (_height3 == null) { _height3 = nCV(); }
      return _height3; }
    protected ConditionValue xgetCValueHeight3() { return xdfgetHeight3(); }

    /**
     * Add order-by as ascend. <br>
     * HEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Height3_Asc() { regOBA("HEIGHT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Height3_Desc() { regOBD("HEIGHT3"); return this; }

    protected ConditionValue _grossweight3;
    public ConditionValue xdfgetGrossweight3()
    { if (_grossweight3 == null) { _grossweight3 = nCV(); }
      return _grossweight3; }
    protected ConditionValue xgetCValueGrossweight3() { return xdfgetGrossweight3(); }

    /**
     * Add order-by as ascend. <br>
     * GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Grossweight3_Asc() { regOBA("GROSSWEIGHT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Grossweight3_Desc() { regOBD("GROSSWEIGHT3"); return this; }

    protected ConditionValue _netweight3;
    public ConditionValue xdfgetNetweight3()
    { if (_netweight3 == null) { _netweight3 = nCV(); }
      return _netweight3; }
    protected ConditionValue xgetCValueNetweight3() { return xdfgetNetweight3(); }

    /**
     * Add order-by as ascend. <br>
     * NETWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Netweight3_Asc() { regOBA("NETWEIGHT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NETWEIGHT3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Netweight3_Desc() { regOBD("NETWEIGHT3"); return this; }

    protected ConditionValue _cube3;
    public ConditionValue xdfgetCube3()
    { if (_cube3 == null) { _cube3 = nCV(); }
      return _cube3; }
    protected ConditionValue xgetCValueCube3() { return xdfgetCube3(); }

    /**
     * Add order-by as ascend. <br>
     * CUBE3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Cube3_Asc() { regOBA("CUBE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUBE3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Cube3_Desc() { regOBD("CUBE3"); return this; }

    protected ConditionValue _liter3;
    public ConditionValue xdfgetLiter3()
    { if (_liter3 == null) { _liter3 = nCV(); }
      return _liter3; }
    protected ConditionValue xgetCValueLiter3() { return xdfgetLiter3(); }

    /**
     * Add order-by as ascend. <br>
     * LITER3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Liter3_Asc() { regOBA("LITER3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LITER3: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Liter3_Desc() { regOBD("LITER3"); return this; }

    protected ConditionValue _pQty;
    public ConditionValue xdfgetPQty()
    { if (_pQty == null) { _pQty = nCV(); }
      return _pQty; }
    protected ConditionValue xgetCValuePQty() { return xdfgetPQty(); }

    /**
     * Add order-by as ascend. <br>
     * P_QTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PQty_Asc() { regOBA("P_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_QTY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PQty_Desc() { regOBD("P_QTY"); return this; }

    protected ConditionValue _pHeight;
    public ConditionValue xdfgetPHeight()
    { if (_pHeight == null) { _pHeight = nCV(); }
      return _pHeight; }
    protected ConditionValue xgetCValuePHeight() { return xdfgetPHeight(); }

    /**
     * Add order-by as ascend. <br>
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PHeight_Asc() { regOBA("P_HEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_HEIGHT: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PHeight_Desc() { regOBD("P_HEIGHT"); return this; }

    protected ConditionValue _pOdd;
    public ConditionValue xdfgetPOdd()
    { if (_pOdd == null) { _pOdd = nCV(); }
      return _pOdd; }
    protected ConditionValue xgetCValuePOdd() { return xdfgetPOdd(); }

    /**
     * Add order-by as ascend. <br>
     * P_ODD: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_POdd_Asc() { regOBA("P_ODD"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_ODD: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_POdd_Desc() { regOBD("P_ODD"); return this; }

    protected ConditionValue _pDescription;
    public ConditionValue xdfgetPDescription()
    { if (_pDescription == null) { _pDescription = nCV(); }
      return _pDescription; }
    protected ConditionValue xgetCValuePDescription() { return xdfgetPDescription(); }

    /**
     * Add order-by as ascend. <br>
     * P_DESCRIPTION: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PDescription_Asc() { regOBA("P_DESCRIPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_DESCRIPTION: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PDescription_Desc() { regOBD("P_DESCRIPTION"); return this; }

    protected ConditionValue _notes;
    public ConditionValue xdfgetNotes()
    { if (_notes == null) { _notes = nCV(); }
      return _notes; }
    protected ConditionValue xgetCValueNotes() { return xdfgetNotes(); }

    /**
     * Add order-by as ascend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

    protected ConditionValue _qty2usedflg;
    public ConditionValue xdfgetQty2usedflg()
    { if (_qty2usedflg == null) { _qty2usedflg = nCV(); }
      return _qty2usedflg; }
    protected ConditionValue xgetCValueQty2usedflg() { return xdfgetQty2usedflg(); }

    /**
     * Add order-by as ascend. <br>
     * QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Qty2usedflg_Asc() { regOBA("QTY2USEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Qty2usedflg_Desc() { regOBD("QTY2USEDFLG"); return this; }

    protected ConditionValue _qty2style;
    public ConditionValue xdfgetQty2style()
    { if (_qty2style == null) { _qty2style = nCV(); }
      return _qty2style; }
    protected ConditionValue xgetCValueQty2style() { return xdfgetQty2style(); }

    /**
     * Add order-by as ascend. <br>
     * QTY2STYLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Qty2style_Asc() { regOBA("QTY2STYLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY2STYLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Qty2style_Desc() { regOBD("QTY2STYLE"); return this; }

    protected ConditionValue _qty3usedflg;
    public ConditionValue xdfgetQty3usedflg()
    { if (_qty3usedflg == null) { _qty3usedflg = nCV(); }
      return _qty3usedflg; }
    protected ConditionValue xgetCValueQty3usedflg() { return xdfgetQty3usedflg(); }

    /**
     * Add order-by as ascend. <br>
     * QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Qty3usedflg_Asc() { regOBA("QTY3USEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Qty3usedflg_Desc() { regOBD("QTY3USEDFLG"); return this; }

    protected ConditionValue _qty3style;
    public ConditionValue xdfgetQty3style()
    { if (_qty3style == null) { _qty3style = nCV(); }
      return _qty3style; }
    protected ConditionValue xgetCValueQty3style() { return xdfgetQty3style(); }

    /**
     * Add order-by as ascend. <br>
     * QTY3STYLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Qty3style_Asc() { regOBA("QTY3STYLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY3STYLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Qty3style_Desc() { regOBD("QTY3STYLE"); return this; }

    protected ConditionValue _spCalcflg;
    public ConditionValue xdfgetSpCalcflg()
    { if (_spCalcflg == null) { _spCalcflg = nCV(); }
      return _spCalcflg; }
    protected ConditionValue xgetCValueSpCalcflg() { return xdfgetSpCalcflg(); }

    /**
     * Add order-by as ascend. <br>
     * SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpCalcflg_Asc() { regOBA("SP_CALCFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpCalcflg_Desc() { regOBD("SP_CALCFLG"); return this; }

    protected ConditionValue _spLotatrb1usedflg;
    public ConditionValue xdfgetSpLotatrb1usedflg()
    { if (_spLotatrb1usedflg == null) { _spLotatrb1usedflg = nCV(); }
      return _spLotatrb1usedflg; }
    protected ConditionValue xgetCValueSpLotatrb1usedflg() { return xdfgetSpLotatrb1usedflg(); }

    /**
     * Add order-by as ascend. <br>
     * SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpLotatrb1usedflg_Asc() { regOBA("SP_LOTATRB1USEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpLotatrb1usedflg_Desc() { regOBD("SP_LOTATRB1USEDFLG"); return this; }

    protected ConditionValue _spOperator1;
    public ConditionValue xdfgetSpOperator1()
    { if (_spOperator1 == null) { _spOperator1 = nCV(); }
      return _spOperator1; }
    protected ConditionValue xgetCValueSpOperator1() { return xdfgetSpOperator1(); }

    /**
     * Add order-by as ascend. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpOperator1_Asc() { regOBA("SP_OPERATOR1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpOperator1_Desc() { regOBD("SP_OPERATOR1"); return this; }

    protected ConditionValue _spLotatrb2usedflg;
    public ConditionValue xdfgetSpLotatrb2usedflg()
    { if (_spLotatrb2usedflg == null) { _spLotatrb2usedflg = nCV(); }
      return _spLotatrb2usedflg; }
    protected ConditionValue xgetCValueSpLotatrb2usedflg() { return xdfgetSpLotatrb2usedflg(); }

    /**
     * Add order-by as ascend. <br>
     * SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpLotatrb2usedflg_Asc() { regOBA("SP_LOTATRB2USEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpLotatrb2usedflg_Desc() { regOBD("SP_LOTATRB2USEDFLG"); return this; }

    protected ConditionValue _spOperator2;
    public ConditionValue xdfgetSpOperator2()
    { if (_spOperator2 == null) { _spOperator2 = nCV(); }
      return _spOperator2; }
    protected ConditionValue xgetCValueSpOperator2() { return xdfgetSpOperator2(); }

    /**
     * Add order-by as ascend. <br>
     * SP_OPERATOR2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpOperator2_Asc() { regOBA("SP_OPERATOR2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SP_OPERATOR2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpOperator2_Desc() { regOBD("SP_OPERATOR2"); return this; }

    protected ConditionValue _spLotatrb3usedflg;
    public ConditionValue xdfgetSpLotatrb3usedflg()
    { if (_spLotatrb3usedflg == null) { _spLotatrb3usedflg = nCV(); }
      return _spLotatrb3usedflg; }
    protected ConditionValue xgetCValueSpLotatrb3usedflg() { return xdfgetSpLotatrb3usedflg(); }

    /**
     * Add order-by as ascend. <br>
     * SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpLotatrb3usedflg_Asc() { regOBA("SP_LOTATRB3USEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpLotatrb3usedflg_Desc() { regOBD("SP_LOTATRB3USEDFLG"); return this; }

    protected ConditionValue _spOperator3;
    public ConditionValue xdfgetSpOperator3()
    { if (_spOperator3 == null) { _spOperator3 = nCV(); }
      return _spOperator3; }
    protected ConditionValue xgetCValueSpOperator3() { return xdfgetSpOperator3(); }

    /**
     * Add order-by as ascend. <br>
     * SP_OPERATOR3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpOperator3_Asc() { regOBA("SP_OPERATOR3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SP_OPERATOR3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpOperator3_Desc() { regOBD("SP_OPERATOR3"); return this; }

    protected ConditionValue _spRate;
    public ConditionValue xdfgetSpRate()
    { if (_spRate == null) { _spRate = nCV(); }
      return _spRate; }
    protected ConditionValue xgetCValueSpRate() { return xdfgetSpRate(); }

    /**
     * Add order-by as ascend. <br>
     * SP_RATE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpRate_Asc() { regOBA("SP_RATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SP_RATE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SpRate_Desc() { regOBD("SP_RATE"); return this; }

    protected ConditionValue _lotatrb1title;
    public ConditionValue xdfgetLotatrb1title()
    { if (_lotatrb1title == null) { _lotatrb1title = nCV(); }
      return _lotatrb1title; }
    protected ConditionValue xgetCValueLotatrb1title() { return xdfgetLotatrb1title(); }

    /**
     * Add order-by as ascend. <br>
     * LOTATRB1TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb1title_Asc() { regOBA("LOTATRB1TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTATRB1TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb1title_Desc() { regOBD("LOTATRB1TITLE"); return this; }

    protected ConditionValue _lotatrb2title;
    public ConditionValue xdfgetLotatrb2title()
    { if (_lotatrb2title == null) { _lotatrb2title = nCV(); }
      return _lotatrb2title; }
    protected ConditionValue xgetCValueLotatrb2title() { return xdfgetLotatrb2title(); }

    /**
     * Add order-by as ascend. <br>
     * LOTATRB2TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb2title_Asc() { regOBA("LOTATRB2TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTATRB2TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb2title_Desc() { regOBD("LOTATRB2TITLE"); return this; }

    protected ConditionValue _lotatrb3title;
    public ConditionValue xdfgetLotatrb3title()
    { if (_lotatrb3title == null) { _lotatrb3title = nCV(); }
      return _lotatrb3title; }
    protected ConditionValue xgetCValueLotatrb3title() { return xdfgetLotatrb3title(); }

    /**
     * Add order-by as ascend. <br>
     * LOTATRB3TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb3title_Asc() { regOBA("LOTATRB3TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTATRB3TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb3title_Desc() { regOBD("LOTATRB3TITLE"); return this; }

    protected ConditionValue _lotatrb4title;
    public ConditionValue xdfgetLotatrb4title()
    { if (_lotatrb4title == null) { _lotatrb4title = nCV(); }
      return _lotatrb4title; }
    protected ConditionValue xgetCValueLotatrb4title() { return xdfgetLotatrb4title(); }

    /**
     * Add order-by as ascend. <br>
     * LOTATRB4TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb4title_Asc() { regOBA("LOTATRB4TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTATRB4TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb4title_Desc() { regOBD("LOTATRB4TITLE"); return this; }

    protected ConditionValue _lotatrb5title;
    public ConditionValue xdfgetLotatrb5title()
    { if (_lotatrb5title == null) { _lotatrb5title = nCV(); }
      return _lotatrb5title; }
    protected ConditionValue xgetCValueLotatrb5title() { return xdfgetLotatrb5title(); }

    /**
     * Add order-by as ascend. <br>
     * LOTATRB5TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb5title_Asc() { regOBA("LOTATRB5TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTATRB5TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb5title_Desc() { regOBD("LOTATRB5TITLE"); return this; }

    protected ConditionValue _lotatrb6title;
    public ConditionValue xdfgetLotatrb6title()
    { if (_lotatrb6title == null) { _lotatrb6title = nCV(); }
      return _lotatrb6title; }
    protected ConditionValue xgetCValueLotatrb6title() { return xdfgetLotatrb6title(); }

    /**
     * Add order-by as ascend. <br>
     * LOTATRB6TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb6title_Asc() { regOBA("LOTATRB6TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTATRB6TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb6title_Desc() { regOBD("LOTATRB6TITLE"); return this; }

    protected ConditionValue _lotatrb7title;
    public ConditionValue xdfgetLotatrb7title()
    { if (_lotatrb7title == null) { _lotatrb7title = nCV(); }
      return _lotatrb7title; }
    protected ConditionValue xgetCValueLotatrb7title() { return xdfgetLotatrb7title(); }

    /**
     * Add order-by as ascend. <br>
     * LOTATRB7TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb7title_Asc() { regOBA("LOTATRB7TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTATRB7TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb7title_Desc() { regOBD("LOTATRB7TITLE"); return this; }

    protected ConditionValue _lotatrb8title;
    public ConditionValue xdfgetLotatrb8title()
    { if (_lotatrb8title == null) { _lotatrb8title = nCV(); }
      return _lotatrb8title; }
    protected ConditionValue xgetCValueLotatrb8title() { return xdfgetLotatrb8title(); }

    /**
     * Add order-by as ascend. <br>
     * LOTATRB8TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb8title_Asc() { regOBA("LOTATRB8TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTATRB8TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb8title_Desc() { regOBD("LOTATRB8TITLE"); return this; }

    protected ConditionValue _lotatrb9title;
    public ConditionValue xdfgetLotatrb9title()
    { if (_lotatrb9title == null) { _lotatrb9title = nCV(); }
      return _lotatrb9title; }
    protected ConditionValue xgetCValueLotatrb9title() { return xdfgetLotatrb9title(); }

    /**
     * Add order-by as ascend. <br>
     * LOTATRB9TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb9title_Asc() { regOBA("LOTATRB9TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTATRB9TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb9title_Desc() { regOBD("LOTATRB9TITLE"); return this; }

    protected ConditionValue _lotatrb10title;
    public ConditionValue xdfgetLotatrb10title()
    { if (_lotatrb10title == null) { _lotatrb10title = nCV(); }
      return _lotatrb10title; }
    protected ConditionValue xgetCValueLotatrb10title() { return xdfgetLotatrb10title(); }

    /**
     * Add order-by as ascend. <br>
     * LOTATRB10TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb10title_Asc() { regOBA("LOTATRB10TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOTATRB10TITLE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lotatrb10title_Desc() { regOBD("LOTATRB10TITLE"); return this; }

    protected ConditionValue _fUser1;
    public ConditionValue xdfgetFUser1()
    { if (_fUser1 == null) { _fUser1 = nCV(); }
      return _fUser1; }
    protected ConditionValue xgetCValueFUser1() { return xdfgetFUser1(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FUser1_Asc() { regOBA("F_USER1"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FUser1_Desc() { regOBD("F_USER1"); return this; }

    protected ConditionValue _fUser2;
    public ConditionValue xdfgetFUser2()
    { if (_fUser2 == null) { _fUser2 = nCV(); }
      return _fUser2; }
    protected ConditionValue xgetCValueFUser2() { return xdfgetFUser2(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FUser2_Asc() { regOBA("F_USER2"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FUser2_Desc() { regOBD("F_USER2"); return this; }

    protected ConditionValue _fUser3;
    public ConditionValue xdfgetFUser3()
    { if (_fUser3 == null) { _fUser3 = nCV(); }
      return _fUser3; }
    protected ConditionValue xgetCValueFUser3() { return xdfgetFUser3(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FUser3_Asc() { regOBA("F_USER3"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FUser3_Desc() { regOBD("F_USER3"); return this; }

    protected ConditionValue _fUser4;
    public ConditionValue xdfgetFUser4()
    { if (_fUser4 == null) { _fUser4 = nCV(); }
      return _fUser4; }
    protected ConditionValue xgetCValueFUser4() { return xdfgetFUser4(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FUser4_Asc() { regOBA("F_USER4"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FUser4_Desc() { regOBD("F_USER4"); return this; }

    protected ConditionValue _fUser5;
    public ConditionValue xdfgetFUser5()
    { if (_fUser5 == null) { _fUser5 = nCV(); }
      return _fUser5; }
    protected ConditionValue xgetCValueFUser5() { return xdfgetFUser5(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER5: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FUser5_Asc() { regOBA("F_USER5"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER5: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FUser5_Desc() { regOBD("F_USER5"); return this; }

    protected ConditionValue _item40;
    public ConditionValue xdfgetItem40()
    { if (_item40 == null) { _item40 = nCV(); }
      return _item40; }
    protected ConditionValue xgetCValueItem40() { return xdfgetItem40(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM40: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Item40_Asc() { regOBA("ITEM40"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM40: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Item40_Desc() { regOBD("ITEM40"); return this; }

    protected ConditionValue _priceInsurance;
    public ConditionValue xdfgetPriceInsurance()
    { if (_priceInsurance == null) { _priceInsurance = nCV(); }
      return _priceInsurance; }
    protected ConditionValue xgetCValuePriceInsurance() { return xdfgetPriceInsurance(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PriceInsurance_Asc() { regOBA("PRICE_INSURANCE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_PriceInsurance_Desc() { regOBD("PRICE_INSURANCE"); return this; }

    protected ConditionValue _limitday;
    public ConditionValue xdfgetLimitday()
    { if (_limitday == null) { _limitday = nCV(); }
      return _limitday; }
    protected ConditionValue xgetCValueLimitday() { return xdfgetLimitday(); }

    /**
     * Add order-by as ascend. <br>
     * LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Limitday_Asc() { regOBA("LIMITDAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Limitday_Desc() { regOBD("LIMITDAY"); return this; }

    protected ConditionValue _deliverableday;
    public ConditionValue xdfgetDeliverableday()
    { if (_deliverableday == null) { _deliverableday = nCV(); }
      return _deliverableday; }
    protected ConditionValue xgetCValueDeliverableday() { return xdfgetDeliverableday(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Deliverableday_Asc() { regOBA("DELIVERABLEDAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Deliverableday_Desc() { regOBD("DELIVERABLEDAY"); return this; }

    protected ConditionValue _printdateflg;
    public ConditionValue xdfgetPrintdateflg()
    { if (_printdateflg == null) { _printdateflg = nCV(); }
      return _printdateflg; }
    protected ConditionValue xgetCValuePrintdateflg() { return xdfgetPrintdateflg(); }

    /**
     * Add order-by as ascend. <br>
     * PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Printdateflg_Asc() { regOBA("PRINTDATEFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Printdateflg_Desc() { regOBD("PRINTDATEFLG"); return this; }

    protected ConditionValue _suppliercd;
    public ConditionValue xdfgetSuppliercd()
    { if (_suppliercd == null) { _suppliercd = nCV(); }
      return _suppliercd; }
    protected ConditionValue xgetCValueSuppliercd() { return xdfgetSuppliercd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Suppliercd_Asc() { regOBA("SUPPLIERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Suppliercd_Desc() { regOBD("SUPPLIERCD"); return this; }

    protected ConditionValue _dispatchqtytype;
    public ConditionValue xdfgetDispatchqtytype()
    { if (_dispatchqtytype == null) { _dispatchqtytype = nCV(); }
      return _dispatchqtytype; }
    protected ConditionValue xgetCValueDispatchqtytype() { return xdfgetDispatchqtytype(); }

    /**
     * Add order-by as ascend. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Dispatchqtytype_Asc() { regOBA("DISPATCHQTYTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISPATCHQTYTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Dispatchqtytype_Desc() { regOBD("DISPATCHQTYTYPE"); return this; }

    protected ConditionValue _tariffqtytype;
    public ConditionValue xdfgetTariffqtytype()
    { if (_tariffqtytype == null) { _tariffqtytype = nCV(); }
      return _tariffqtytype; }
    protected ConditionValue xgetCValueTariffqtytype() { return xdfgetTariffqtytype(); }

    /**
     * Add order-by as ascend. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Tariffqtytype_Asc() { regOBA("TARIFFQTYTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TARIFFQTYTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Tariffqtytype_Desc() { regOBD("TARIFFQTYTYPE"); return this; }

    protected ConditionValue _useruse1;
    public ConditionValue xdfgetUseruse1()
    { if (_useruse1 == null) { _useruse1 = nCV(); }
      return _useruse1; }
    protected ConditionValue xgetCValueUseruse1() { return xdfgetUseruse1(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Useruse1_Asc() { regOBA("USERUSE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Useruse1_Desc() { regOBD("USERUSE1"); return this; }

    protected ConditionValue _useruse2;
    public ConditionValue xdfgetUseruse2()
    { if (_useruse2 == null) { _useruse2 = nCV(); }
      return _useruse2; }
    protected ConditionValue xgetCValueUseruse2() { return xdfgetUseruse2(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Useruse2_Asc() { regOBA("USERUSE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Useruse2_Desc() { regOBD("USERUSE2"); return this; }

    protected ConditionValue _useruse3;
    public ConditionValue xdfgetUseruse3()
    { if (_useruse3 == null) { _useruse3 = nCV(); }
      return _useruse3; }
    protected ConditionValue xgetCValueUseruse3() { return xdfgetUseruse3(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Useruse3_Asc() { regOBA("USERUSE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Useruse3_Desc() { regOBD("USERUSE3"); return this; }

    protected ConditionValue _useruse4;
    public ConditionValue xdfgetUseruse4()
    { if (_useruse4 == null) { _useruse4 = nCV(); }
      return _useruse4; }
    protected ConditionValue xgetCValueUseruse4() { return xdfgetUseruse4(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE4: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Useruse4_Asc() { regOBA("USERUSE4"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE4: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Useruse4_Desc() { regOBD("USERUSE4"); return this; }

    protected ConditionValue _useruse5;
    public ConditionValue xdfgetUseruse5()
    { if (_useruse5 == null) { _useruse5 = nCV(); }
      return _useruse5; }
    protected ConditionValue xgetCValueUseruse5() { return xdfgetUseruse5(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE5: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Useruse5_Asc() { regOBA("USERUSE5"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE5: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Useruse5_Desc() { regOBD("USERUSE5"); return this; }

    protected ConditionValue _lot1nullflg;
    public ConditionValue xdfgetLot1nullflg()
    { if (_lot1nullflg == null) { _lot1nullflg = nCV(); }
      return _lot1nullflg; }
    protected ConditionValue xgetCValueLot1nullflg() { return xdfgetLot1nullflg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lot1nullflg_Asc() { regOBA("LOT1NULLFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lot1nullflg_Desc() { regOBD("LOT1NULLFLG"); return this; }

    protected ConditionValue _lot2nullflg;
    public ConditionValue xdfgetLot2nullflg()
    { if (_lot2nullflg == null) { _lot2nullflg = nCV(); }
      return _lot2nullflg; }
    protected ConditionValue xgetCValueLot2nullflg() { return xdfgetLot2nullflg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lot2nullflg_Asc() { regOBA("LOT2NULLFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lot2nullflg_Desc() { regOBD("LOT2NULLFLG"); return this; }

    protected ConditionValue _lot3nullflg;
    public ConditionValue xdfgetLot3nullflg()
    { if (_lot3nullflg == null) { _lot3nullflg = nCV(); }
      return _lot3nullflg; }
    protected ConditionValue xgetCValueLot3nullflg() { return xdfgetLot3nullflg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lot3nullflg_Asc() { regOBA("LOT3NULLFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lot3nullflg_Desc() { regOBD("LOT3NULLFLG"); return this; }

    protected ConditionValue _lot4nullflg;
    public ConditionValue xdfgetLot4nullflg()
    { if (_lot4nullflg == null) { _lot4nullflg = nCV(); }
      return _lot4nullflg; }
    protected ConditionValue xgetCValueLot4nullflg() { return xdfgetLot4nullflg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lot4nullflg_Asc() { regOBA("LOT4NULLFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lot4nullflg_Desc() { regOBD("LOT4NULLFLG"); return this; }

    protected ConditionValue _lot5nullflg;
    public ConditionValue xdfgetLot5nullflg()
    { if (_lot5nullflg == null) { _lot5nullflg = nCV(); }
      return _lot5nullflg; }
    protected ConditionValue xgetCValueLot5nullflg() { return xdfgetLot5nullflg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lot5nullflg_Asc() { regOBA("LOT5NULLFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Lot5nullflg_Desc() { regOBD("LOT5NULLFLG"); return this; }

    protected ConditionValue _otherlot1nullflg;
    public ConditionValue xdfgetOtherlot1nullflg()
    { if (_otherlot1nullflg == null) { _otherlot1nullflg = nCV(); }
      return _otherlot1nullflg; }
    protected ConditionValue xgetCValueOtherlot1nullflg() { return xdfgetOtherlot1nullflg(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Otherlot1nullflg_Asc() { regOBA("OTHERLOT1NULLFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Otherlot1nullflg_Desc() { regOBD("OTHERLOT1NULLFLG"); return this; }

    protected ConditionValue _otherlot2nullflg;
    public ConditionValue xdfgetOtherlot2nullflg()
    { if (_otherlot2nullflg == null) { _otherlot2nullflg = nCV(); }
      return _otherlot2nullflg; }
    protected ConditionValue xgetCValueOtherlot2nullflg() { return xdfgetOtherlot2nullflg(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Otherlot2nullflg_Asc() { regOBA("OTHERLOT2NULLFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Otherlot2nullflg_Desc() { regOBD("OTHERLOT2NULLFLG"); return this; }

    protected ConditionValue _otherlot3nullflg;
    public ConditionValue xdfgetOtherlot3nullflg()
    { if (_otherlot3nullflg == null) { _otherlot3nullflg = nCV(); }
      return _otherlot3nullflg; }
    protected ConditionValue xgetCValueOtherlot3nullflg() { return xdfgetOtherlot3nullflg(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Otherlot3nullflg_Asc() { regOBA("OTHERLOT3NULLFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Otherlot3nullflg_Desc() { regOBD("OTHERLOT3NULLFLG"); return this; }

    protected ConditionValue _otherlot4nullflg;
    public ConditionValue xdfgetOtherlot4nullflg()
    { if (_otherlot4nullflg == null) { _otherlot4nullflg = nCV(); }
      return _otherlot4nullflg; }
    protected ConditionValue xgetCValueOtherlot4nullflg() { return xdfgetOtherlot4nullflg(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Otherlot4nullflg_Asc() { regOBA("OTHERLOT4NULLFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Otherlot4nullflg_Desc() { regOBD("OTHERLOT4NULLFLG"); return this; }

    protected ConditionValue _otherlot5nullflg;
    public ConditionValue xdfgetOtherlot5nullflg()
    { if (_otherlot5nullflg == null) { _otherlot5nullflg = nCV(); }
      return _otherlot5nullflg; }
    protected ConditionValue xgetCValueOtherlot5nullflg() { return xdfgetOtherlot5nullflg(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Otherlot5nullflg_Asc() { regOBA("OTHERLOT5NULLFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Otherlot5nullflg_Desc() { regOBD("OTHERLOT5NULLFLG"); return this; }

    protected ConditionValue _itemprintname;
    public ConditionValue xdfgetItemprintname()
    { if (_itemprintname == null) { _itemprintname = nCV(); }
      return _itemprintname; }
    protected ConditionValue xgetCValueItemprintname() { return xdfgetItemprintname(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMPRINTNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Itemprintname_Asc() { regOBA("ITEMPRINTNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMPRINTNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Itemprintname_Desc() { regOBD("ITEMPRINTNAME"); return this; }

    protected ConditionValue _pricelevel;
    public ConditionValue xdfgetPricelevel()
    { if (_pricelevel == null) { _pricelevel = nCV(); }
      return _pricelevel; }
    protected ConditionValue xgetCValuePricelevel() { return xdfgetPricelevel(); }

    /**
     * Add order-by as ascend. <br>
     * PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Pricelevel_Asc() { regOBA("PRICELEVEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Pricelevel_Desc() { regOBD("PRICELEVEL"); return this; }

    protected ConditionValue _itemcatalogurl;
    public ConditionValue xdfgetItemcatalogurl()
    { if (_itemcatalogurl == null) { _itemcatalogurl = nCV(); }
      return _itemcatalogurl; }
    protected ConditionValue xgetCValueItemcatalogurl() { return xdfgetItemcatalogurl(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Itemcatalogurl_Asc() { regOBA("ITEMCATALOGURL"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Itemcatalogurl_Desc() { regOBD("ITEMCATALOGURL"); return this; }

    protected ConditionValue _usernum1;
    public ConditionValue xdfgetUsernum1()
    { if (_usernum1 == null) { _usernum1 = nCV(); }
      return _usernum1; }
    protected ConditionValue xgetCValueUsernum1() { return xdfgetUsernum1(); }

    /**
     * Add order-by as ascend. <br>
     * USERNUM1: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Usernum1_Asc() { regOBA("USERNUM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNUM1: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Usernum1_Desc() { regOBD("USERNUM1"); return this; }

    protected ConditionValue _usernum2;
    public ConditionValue xdfgetUsernum2()
    { if (_usernum2 == null) { _usernum2 = nCV(); }
      return _usernum2; }
    protected ConditionValue xgetCValueUsernum2() { return xdfgetUsernum2(); }

    /**
     * Add order-by as ascend. <br>
     * USERNUM2: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Usernum2_Asc() { regOBA("USERNUM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNUM2: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Usernum2_Desc() { regOBD("USERNUM2"); return this; }

    protected ConditionValue _usernum3;
    public ConditionValue xdfgetUsernum3()
    { if (_usernum3 == null) { _usernum3 = nCV(); }
      return _usernum3; }
    protected ConditionValue xgetCValueUsernum3() { return xdfgetUsernum3(); }

    /**
     * Add order-by as ascend. <br>
     * USERNUM3: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Usernum3_Asc() { regOBA("USERNUM3"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNUM3: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Usernum3_Desc() { regOBD("USERNUM3"); return this; }

    protected ConditionValue _usernum4;
    public ConditionValue xdfgetUsernum4()
    { if (_usernum4 == null) { _usernum4 = nCV(); }
      return _usernum4; }
    protected ConditionValue xgetCValueUsernum4() { return xdfgetUsernum4(); }

    /**
     * Add order-by as ascend. <br>
     * USERNUM4: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Usernum4_Asc() { regOBA("USERNUM4"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNUM4: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Usernum4_Desc() { regOBD("USERNUM4"); return this; }

    protected ConditionValue _usernum5;
    public ConditionValue xdfgetUsernum5()
    { if (_usernum5 == null) { _usernum5 = nCV(); }
      return _usernum5; }
    protected ConditionValue xgetCValueUsernum5() { return xdfgetUsernum5(); }

    /**
     * Add order-by as ascend. <br>
     * USERNUM5: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Usernum5_Asc() { regOBA("USERNUM5"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERNUM5: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Usernum5_Desc() { regOBD("USERNUM5"); return this; }

    protected ConditionValue _userdate1;
    public ConditionValue xdfgetUserdate1()
    { if (_userdate1 == null) { _userdate1 = nCV(); }
      return _userdate1; }
    protected ConditionValue xgetCValueUserdate1() { return xdfgetUserdate1(); }

    /**
     * Add order-by as ascend. <br>
     * USERDATE1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Userdate1_Asc() { regOBA("USERDATE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERDATE1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Userdate1_Desc() { regOBD("USERDATE1"); return this; }

    protected ConditionValue _userdate2;
    public ConditionValue xdfgetUserdate2()
    { if (_userdate2 == null) { _userdate2 = nCV(); }
      return _userdate2; }
    protected ConditionValue xgetCValueUserdate2() { return xdfgetUserdate2(); }

    /**
     * Add order-by as ascend. <br>
     * USERDATE2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Userdate2_Asc() { regOBA("USERDATE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERDATE2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Userdate2_Desc() { regOBD("USERDATE2"); return this; }

    protected ConditionValue _userdate3;
    public ConditionValue xdfgetUserdate3()
    { if (_userdate3 == null) { _userdate3 = nCV(); }
      return _userdate3; }
    protected ConditionValue xgetCValueUserdate3() { return xdfgetUserdate3(); }

    /**
     * Add order-by as ascend. <br>
     * USERDATE3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Userdate3_Asc() { regOBA("USERDATE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERDATE3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Userdate3_Desc() { regOBD("USERDATE3"); return this; }

    protected ConditionValue _userdate4;
    public ConditionValue xdfgetUserdate4()
    { if (_userdate4 == null) { _userdate4 = nCV(); }
      return _userdate4; }
    protected ConditionValue xgetCValueUserdate4() { return xdfgetUserdate4(); }

    /**
     * Add order-by as ascend. <br>
     * USERDATE4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Userdate4_Asc() { regOBA("USERDATE4"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERDATE4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Userdate4_Desc() { regOBD("USERDATE4"); return this; }

    protected ConditionValue _userdate5;
    public ConditionValue xdfgetUserdate5()
    { if (_userdate5 == null) { _userdate5 = nCV(); }
      return _userdate5; }
    protected ConditionValue xgetCValueUserdate5() { return xdfgetUserdate5(); }

    /**
     * Add order-by as ascend. <br>
     * USERDATE5: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Userdate5_Asc() { regOBA("USERDATE5"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERDATE5: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Userdate5_Desc() { regOBD("USERDATE5"); return this; }

    protected ConditionValue _cggdid;
    public ConditionValue xdfgetCggdid()
    { if (_cggdid == null) { _cggdid = nCV(); }
      return _cggdid; }
    protected ConditionValue xgetCValueCggdid() { return xdfgetCggdid(); }

    /**
     * Add order-by as ascend. <br>
     * CGGDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Cggdid_Asc() { regOBA("CGGDID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CGGDID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Cggdid_Desc() { regOBD("CGGDID"); return this; }

    protected ConditionValue _brctg;
    public ConditionValue xdfgetBrctg()
    { if (_brctg == null) { _brctg = nCV(); }
      return _brctg; }
    protected ConditionValue xgetCValueBrctg() { return xdfgetBrctg(); }

    /**
     * Add order-by as ascend. <br>
     * BRCTG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Brctg_Asc() { regOBA("BRCTG"); return this; }

    /**
     * Add order-by as descend. <br>
     * BRCTG: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Brctg_Desc() { regOBD("BRCTG"); return this; }

    protected ConditionValue _ctweight;
    public ConditionValue xdfgetCtweight()
    { if (_ctweight == null) { _ctweight = nCV(); }
      return _ctweight; }
    protected ConditionValue xgetCValueCtweight() { return xdfgetCtweight(); }

    /**
     * Add order-by as ascend. <br>
     * CTWEIGHT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Ctweight_Asc() { regOBA("CTWEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTWEIGHT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Ctweight_Desc() { regOBD("CTWEIGHT"); return this; }

    protected ConditionValue _bxoszl;
    public ConditionValue xdfgetBxoszl()
    { if (_bxoszl == null) { _bxoszl = nCV(); }
      return _bxoszl; }
    protected ConditionValue xgetCValueBxoszl() { return xdfgetBxoszl(); }

    /**
     * Add order-by as ascend. <br>
     * BXOSZL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Bxoszl_Asc() { regOBA("BXOSZL"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXOSZL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Bxoszl_Desc() { regOBD("BXOSZL"); return this; }

    protected ConditionValue _bxoszw;
    public ConditionValue xdfgetBxoszw()
    { if (_bxoszw == null) { _bxoszw = nCV(); }
      return _bxoszw; }
    protected ConditionValue xgetCValueBxoszw() { return xdfgetBxoszw(); }

    /**
     * Add order-by as ascend. <br>
     * BXOSZW: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Bxoszw_Asc() { regOBA("BXOSZW"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXOSZW: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Bxoszw_Desc() { regOBD("BXOSZW"); return this; }

    protected ConditionValue _bxoszh;
    public ConditionValue xdfgetBxoszh()
    { if (_bxoszh == null) { _bxoszh = nCV(); }
      return _bxoszh; }
    protected ConditionValue xgetCValueBxoszh() { return xdfgetBxoszh(); }

    /**
     * Add order-by as ascend. <br>
     * BXOSZH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Bxoszh_Asc() { regOBA("BXOSZH"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXOSZH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Bxoszh_Desc() { regOBD("BXOSZH"); return this; }

    protected ConditionValue _bxcpy;
    public ConditionValue xdfgetBxcpy()
    { if (_bxcpy == null) { _bxcpy = nCV(); }
      return _bxcpy; }
    protected ConditionValue xgetCValueBxcpy() { return xdfgetBxcpy(); }

    /**
     * Add order-by as ascend. <br>
     * BXCPY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Bxcpy_Asc() { regOBA("BXCPY"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXCPY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Bxcpy_Desc() { regOBD("BXCPY"); return this; }

    protected ConditionValue _bxweight;
    public ConditionValue xdfgetBxweight()
    { if (_bxweight == null) { _bxweight = nCV(); }
      return _bxweight; }
    protected ConditionValue xgetCValueBxweight() { return xdfgetBxweight(); }

    /**
     * Add order-by as ascend. <br>
     * BXWEIGHT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Bxweight_Asc() { regOBA("BXWEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * BXWEIGHT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Bxweight_Desc() { regOBD("BXWEIGHT"); return this; }

    protected ConditionValue _itemAdmin;
    public ConditionValue xdfgetItemAdmin()
    { if (_itemAdmin == null) { _itemAdmin = nCV(); }
      return _itemAdmin; }
    protected ConditionValue xgetCValueItemAdmin() { return xdfgetItemAdmin(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_ADMIN: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ItemAdmin_Asc() { regOBA("ITEM_ADMIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_ADMIN: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ItemAdmin_Desc() { regOBD("ITEM_ADMIN"); return this; }

    protected ConditionValue _sname;
    public ConditionValue xdfgetSname()
    { if (_sname == null) { _sname = nCV(); }
      return _sname; }
    protected ConditionValue xgetCValueSname() { return xdfgetSname(); }

    /**
     * Add order-by as ascend. <br>
     * SNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Sname_Asc() { regOBA("SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Sname_Desc() { regOBD("SNAME"); return this; }

    protected ConditionValue _fractionpieceweight;
    public ConditionValue xdfgetFractionpieceweight()
    { if (_fractionpieceweight == null) { _fractionpieceweight = nCV(); }
      return _fractionpieceweight; }
    protected ConditionValue xgetCValueFractionpieceweight() { return xdfgetFractionpieceweight(); }

    /**
     * Add order-by as ascend. <br>
     * FractionPieceWeight: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Fractionpieceweight_Asc() { regOBA("FractionPieceWeight"); return this; }

    /**
     * Add order-by as descend. <br>
     * FractionPieceWeight: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Fractionpieceweight_Desc() { regOBD("FractionPieceWeight"); return this; }

    protected ConditionValue _taxequivalentnumber;
    public ConditionValue xdfgetTaxequivalentnumber()
    { if (_taxequivalentnumber == null) { _taxequivalentnumber = nCV(); }
      return _taxequivalentnumber; }
    protected ConditionValue xgetCValueTaxequivalentnumber() { return xdfgetTaxequivalentnumber(); }

    /**
     * Add order-by as ascend. <br>
     * TaxEquivalentNumber: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Taxequivalentnumber_Asc() { regOBA("TaxEquivalentNumber"); return this; }

    /**
     * Add order-by as descend. <br>
     * TaxEquivalentNumber: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Taxequivalentnumber_Desc() { regOBD("TaxEquivalentNumber"); return this; }

    protected ConditionValue _syhnkbnjt;
    public ConditionValue xdfgetSyhnkbnjt()
    { if (_syhnkbnjt == null) { _syhnkbnjt = nCV(); }
      return _syhnkbnjt; }
    protected ConditionValue xgetCValueSyhnkbnjt() { return xdfgetSyhnkbnjt(); }

    /**
     * Add order-by as ascend. <br>
     * SYHNKBNJT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Syhnkbnjt_Asc() { regOBA("SYHNKBNJT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYHNKBNJT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Syhnkbnjt_Desc() { regOBD("SYHNKBNJT"); return this; }

    protected ConditionValue _ioidCls;
    public ConditionValue xdfgetIoidCls()
    { if (_ioidCls == null) { _ioidCls = nCV(); }
      return _ioidCls; }
    protected ConditionValue xgetCValueIoidCls() { return xdfgetIoidCls(); }

    /**
     * Add order-by as ascend. <br>
     * IOID_CLS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_IoidCls_Asc() { regOBA("IOID_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * IOID_CLS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_IoidCls_Desc() { regOBD("IOID_CLS"); return this; }

    protected ConditionValue _itfcdCls;
    public ConditionValue xdfgetItfcdCls()
    { if (_itfcdCls == null) { _itfcdCls = nCV(); }
      return _itfcdCls; }
    protected ConditionValue xgetCValueItfcdCls() { return xdfgetItfcdCls(); }

    /**
     * Add order-by as ascend. <br>
     * ITFCD_CLS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ItfcdCls_Asc() { regOBA("ITFCD_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITFCD_CLS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ItfcdCls_Desc() { regOBD("ITFCD_CLS"); return this; }

    protected ConditionValue _manuitemcdCls;
    public ConditionValue xdfgetManuitemcdCls()
    { if (_manuitemcdCls == null) { _manuitemcdCls = nCV(); }
      return _manuitemcdCls; }
    protected ConditionValue xgetCValueManuitemcdCls() { return xdfgetManuitemcdCls(); }

    /**
     * Add order-by as ascend. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ManuitemcdCls_Asc() { regOBA("MANUITEMCD_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUITEMCD_CLS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ManuitemcdCls_Desc() { regOBD("MANUITEMCD_CLS"); return this; }

    protected ConditionValue _ctcpy;
    public ConditionValue xdfgetCtcpy()
    { if (_ctcpy == null) { _ctcpy = nCV(); }
      return _ctcpy; }
    protected ConditionValue xgetCValueCtcpy() { return xdfgetCtcpy(); }

    /**
     * Add order-by as ascend. <br>
     * CTCPY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Ctcpy_Asc() { regOBA("CTCPY"); return this; }

    /**
     * Add order-by as descend. <br>
     * CTCPY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_Ctcpy_Desc() { regOBD("CTCPY"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MProductCQ bq = (MProductCQ)bqs;
        MProductCQ uq = (MProductCQ)uqs;
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMProductSelf()) {
            uq.queryMProductSelf().reflectRelationOnUnionQuery(bq.queryMProductSelf(), uq.queryMProductSelf());
        }
        if (bq.hasConditionQueryMShapeGrp()) {
            uq.queryMShapeGrp().reflectRelationOnUnionQuery(bq.queryMShapeGrp(), uq.queryMShapeGrp());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLimitDtManagFlg()) {
            uq.queryBClassDtlByLimitDtManagFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLimitDtManagFlg(), uq.queryBClassDtlByLimitDtManagFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLimitDtReverseFlg()) {
            uq.queryBClassDtlByLimitDtReverseFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLimitDtReverseFlg(), uq.queryBClassDtlByLimitDtReverseFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLotManagFlg()) {
            uq.queryBClassDtlByLotManagFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLotManagFlg(), uq.queryBClassDtlByLotManagFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLotReverseFlg()) {
            uq.queryBClassDtlByLotReverseFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLotReverseFlg(), uq.queryBClassDtlByLotReverseFlg());
        }
        if (bq.hasConditionQueryBClassDtlByMergeCls()) {
            uq.queryBClassDtlByMergeCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByMergeCls(), uq.queryBClassDtlByMergeCls());
        }
        if (bq.hasConditionQueryBClassDtlByShippingStopFlg()) {
            uq.queryBClassDtlByShippingStopFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByShippingStopFlg(), uq.queryBClassDtlByShippingStopFlg());
        }
        if (bq.hasConditionQueryBClassDtlByFreightCls()) {
            uq.queryBClassDtlByFreightCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByFreightCls(), uq.queryBClassDtlByFreightCls());
        }
        if (bq.hasConditionQueryMProductSelfAsOne()) {
            uq.queryMProductSelfAsOne().reflectRelationOnUnionQuery(bq.queryMProductSelfAsOne(), uq.queryMProductSelfAsOne());
        }
        if (bq.hasConditionQueryMProductTermAsOne()) {
            uq.queryMProductTermAsOne().reflectRelationOnUnionQuery(bq.queryMProductTermAsOne(), uq.queryMProductTermAsOne());
        }
        if (bq.hasConditionQueryMSetParentAsOne()) {
            uq.queryMSetParentAsOne().reflectRelationOnUnionQuery(bq.queryMSetParentAsOne(), uq.queryMSetParentAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("M_PRODUCT", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_PRODUCT by my PRODUCT_ID, named 'MProductSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProductCQ queryMProductSelf() {
        return xdfgetConditionQueryMProductSelf();
    }
    public MProductCQ xdfgetConditionQueryMProductSelf() {
        String prop = "mProductSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProductSelf()); xsetupOuterJoinMProductSelf(); }
        return xgetQueRlMap(prop);
    }
    protected MProductCQ xcreateQueryMProductSelf() {
        String nrp = xresolveNRP("M_PRODUCT", "mProductSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProductSelf", nrp);
    }
    protected void xsetupOuterJoinMProductSelf() { xregOutJo("mProductSelf"); }
    public boolean hasConditionQueryMProductSelf() { return xhasQueRlMap("mProductSelf"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @return The instance of condition-query. (NotNull)
     */
    public MShapeGrpCQ queryMShapeGrp() {
        return xdfgetConditionQueryMShapeGrp();
    }
    public MShapeGrpCQ xdfgetConditionQueryMShapeGrp() {
        String prop = "mShapeGrp";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMShapeGrp()); xsetupOuterJoinMShapeGrp(); }
        return xgetQueRlMap(prop);
    }
    protected MShapeGrpCQ xcreateQueryMShapeGrp() {
        String nrp = xresolveNRP("M_PRODUCT", "mShapeGrp"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeGrpCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShapeGrp", nrp);
    }
    protected void xsetupOuterJoinMShapeGrp() { xregOutJo("mShapeGrp"); }
    public boolean hasConditionQueryMShapeGrp() { return xhasQueRlMap("mShapeGrp"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelFlg() {
        return xdfgetConditionQueryBClassDtlByDelFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelFlg() {
        String prop = "bClassDtlByDelFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelFlg()); xsetupOuterJoinBClassDtlByDelFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelFlg() {
        String nrp = xresolveNRP("M_PRODUCT", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLimitDtManagFlg() {
        return xdfgetConditionQueryBClassDtlByLimitDtManagFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLimitDtManagFlg() {
        String prop = "bClassDtlByLimitDtManagFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLimitDtManagFlg()); xsetupOuterJoinBClassDtlByLimitDtManagFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLimitDtManagFlg() {
        String nrp = xresolveNRP("M_PRODUCT", "bClassDtlByLimitDtManagFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLimitDtManagFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLimitDtManagFlg() { xregOutJo("bClassDtlByLimitDtManagFlg"); }
    public boolean hasConditionQueryBClassDtlByLimitDtManagFlg() { return xhasQueRlMap("bClassDtlByLimitDtManagFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLimitDtReverseFlg() {
        return xdfgetConditionQueryBClassDtlByLimitDtReverseFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLimitDtReverseFlg() {
        String prop = "bClassDtlByLimitDtReverseFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLimitDtReverseFlg()); xsetupOuterJoinBClassDtlByLimitDtReverseFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLimitDtReverseFlg() {
        String nrp = xresolveNRP("M_PRODUCT", "bClassDtlByLimitDtReverseFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLimitDtReverseFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLimitDtReverseFlg() { xregOutJo("bClassDtlByLimitDtReverseFlg"); }
    public boolean hasConditionQueryBClassDtlByLimitDtReverseFlg() { return xhasQueRlMap("bClassDtlByLimitDtReverseFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLotManagFlg() {
        return xdfgetConditionQueryBClassDtlByLotManagFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLotManagFlg() {
        String prop = "bClassDtlByLotManagFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLotManagFlg()); xsetupOuterJoinBClassDtlByLotManagFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLotManagFlg() {
        String nrp = xresolveNRP("M_PRODUCT", "bClassDtlByLotManagFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLotManagFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLotManagFlg() { xregOutJo("bClassDtlByLotManagFlg"); }
    public boolean hasConditionQueryBClassDtlByLotManagFlg() { return xhasQueRlMap("bClassDtlByLotManagFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLotReverseFlg() {
        return xdfgetConditionQueryBClassDtlByLotReverseFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLotReverseFlg() {
        String prop = "bClassDtlByLotReverseFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLotReverseFlg()); xsetupOuterJoinBClassDtlByLotReverseFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLotReverseFlg() {
        String nrp = xresolveNRP("M_PRODUCT", "bClassDtlByLotReverseFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLotReverseFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLotReverseFlg() { xregOutJo("bClassDtlByLotReverseFlg"); }
    public boolean hasConditionQueryBClassDtlByLotReverseFlg() { return xhasQueRlMap("bClassDtlByLotReverseFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByMergeCls() {
        return xdfgetConditionQueryBClassDtlByMergeCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByMergeCls() {
        String prop = "bClassDtlByMergeCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByMergeCls()); xsetupOuterJoinBClassDtlByMergeCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByMergeCls() {
        String nrp = xresolveNRP("M_PRODUCT", "bClassDtlByMergeCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByMergeCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByMergeCls() { xregOutJo("bClassDtlByMergeCls"); }
    public boolean hasConditionQueryBClassDtlByMergeCls() { return xhasQueRlMap("bClassDtlByMergeCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByShippingStopFlg() {
        return xdfgetConditionQueryBClassDtlByShippingStopFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByShippingStopFlg() {
        String prop = "bClassDtlByShippingStopFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByShippingStopFlg()); xsetupOuterJoinBClassDtlByShippingStopFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByShippingStopFlg() {
        String nrp = xresolveNRP("M_PRODUCT", "bClassDtlByShippingStopFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByShippingStopFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByShippingStopFlg() { xregOutJo("bClassDtlByShippingStopFlg"); }
    public boolean hasConditionQueryBClassDtlByShippingStopFlg() { return xhasQueRlMap("bClassDtlByShippingStopFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my FREIGHT_CLS, named 'BClassDtlByFreightCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByFreightCls() {
        return xdfgetConditionQueryBClassDtlByFreightCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByFreightCls() {
        String prop = "bClassDtlByFreightCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByFreightCls()); xsetupOuterJoinBClassDtlByFreightCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByFreightCls() {
        String nrp = xresolveNRP("M_PRODUCT", "bClassDtlByFreightCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByFreightCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByFreightCls() { xregOutJo("bClassDtlByFreightCls"); }
    public boolean hasConditionQueryBClassDtlByFreightCls() { return xhasQueRlMap("bClassDtlByFreightCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_PRODUCT by PRODUCT_ID, named 'MProductSelfAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProductCQ queryMProductSelfAsOne() { return xdfgetConditionQueryMProductSelfAsOne(); }
    public MProductCQ xdfgetConditionQueryMProductSelfAsOne() {
        String prop = "mProductSelfAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProductSelfAsOne()); xsetupOuterJoinMProductSelfAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MProductCQ xcreateQueryMProductSelfAsOne() {
        String nrp = xresolveNRP("M_PRODUCT", "mProductSelfAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProductSelfAsOne", nrp);
    }
    protected void xsetupOuterJoinMProductSelfAsOne() { xregOutJo("mProductSelfAsOne"); }
    public boolean hasConditionQueryMProductSelfAsOne() { return xhasQueRlMap("mProductSelfAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_PRODUCT_TERM by PRODUCT_ID, named 'MProductTermAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProductTermCQ queryMProductTermAsOne() { return xdfgetConditionQueryMProductTermAsOne(); }
    public MProductTermCQ xdfgetConditionQueryMProductTermAsOne() {
        String prop = "mProductTermAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProductTermAsOne()); xsetupOuterJoinMProductTermAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MProductTermCQ xcreateQueryMProductTermAsOne() {
        String nrp = xresolveNRP("M_PRODUCT", "mProductTermAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductTermCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProductTermAsOne", nrp);
    }
    protected void xsetupOuterJoinMProductTermAsOne() { xregOutJo("mProductTermAsOne"); }
    public boolean hasConditionQueryMProductTermAsOne() { return xhasQueRlMap("mProductTermAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_SET_PARENT by PRODUCT_ID, named 'MSetParentAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MSetParentCQ queryMSetParentAsOne() { return xdfgetConditionQueryMSetParentAsOne(); }
    public MSetParentCQ xdfgetConditionQueryMSetParentAsOne() {
        String prop = "mSetParentAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMSetParentAsOne()); xsetupOuterJoinMSetParentAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MSetParentCQ xcreateQueryMSetParentAsOne() {
        String nrp = xresolveNRP("M_PRODUCT", "mSetParentAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MSetParentCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mSetParentAsOne", nrp);
    }
    protected void xsetupOuterJoinMSetParentAsOne() { xregOutJo("mSetParentAsOne"); }
    public boolean hasConditionQueryMSetParentAsOne() { return xhasQueRlMap("mSetParentAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MProductCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MProductCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MProductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MProductCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MProductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MProductCQ> _myselfExistsMap;
    public Map<String, MProductCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MProductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MProductCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MProductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MProductCB.class.getName(); }
    protected String xCQ() { return MProductCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
