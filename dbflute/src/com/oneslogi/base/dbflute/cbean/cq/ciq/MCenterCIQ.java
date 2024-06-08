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
 * The condition-query for in-line of M_CENTER.
 * @author DBFlute(AutoGenerator)
 */
public class MCenterCIQ extends AbstractBsMCenterCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMCenterCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MCenterCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMCenterCQ myCQ) {
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
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_ExistsReferrer_MBoxList(MBoxCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MBoxGrpList(MBoxGrpCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCarrierList(MCarrierCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCblkList(MCblkCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCbrctgList(MCbrctgCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCdrcattList(MCdrcattCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCenterClassList(MCenterClassCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCenterColList(MCenterColCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCenterItemList(MCenterItemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCenterScreenList(MCenterScreenCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MClinList(MClinCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCorgList(MCorgCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MMfinvoperationList(MMfinvoperationCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MMfmonthchgList(MMfmonthchgCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MMfstockitemList(MMfstockitemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MMfwhstrctList(MMfwhstrctCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MNumberingCenterList(MNumberingCenterCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MUserCenterList(MUserCenterCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MWarehouseList(MWarehouseCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TCcopamList(TCcopamCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TCordhdrList(TCordhdrCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TCsrwhadmList(TCsrwhadmCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TMflastshiplotList(TMflastshiplotCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TPalletList(TPalletCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TSplinfoList(TSplinfoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrallinvList(TTrallinvCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrcasenumList(TTrcasenumCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrcasestockList(TTrcasestockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrinvrequestList(TTrinvrequestCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTritemconvresultList(TTritemconvresultCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrpallettraceList(TTrpallettraceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrreversestockList(TTrreversestockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TTrtraceList(TTrtraceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TYtrsoList(TYtrsoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MBoxList(MBoxCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MBoxGrpList(MBoxGrpCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCarrierList(MCarrierCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCblkList(MCblkCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCbrctgList(MCbrctgCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCdrcattList(MCdrcattCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCenterClassList(MCenterClassCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCenterColList(MCenterColCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCenterItemList(MCenterItemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCenterScreenList(MCenterScreenCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MClinList(MClinCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCorgList(MCorgCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MMfinvoperationList(MMfinvoperationCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MMfmonthchgList(MMfmonthchgCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MMfstockitemList(MMfstockitemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MMfwhstrctList(MMfwhstrctCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MNumberingCenterList(MNumberingCenterCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MUserCenterList(MUserCenterCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MWarehouseList(MWarehouseCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TCcopamList(TCcopamCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TCordhdrList(TCordhdrCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TCsrwhadmList(TCsrwhadmCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TMflastshiplotList(TMflastshiplotCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TPalletList(TPalletCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TSplinfoList(TSplinfoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrallinvList(TTrallinvCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrcasenumList(TTrcasenumCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrcasestockList(TTrcasestockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrinvrequestList(TTrinvrequestCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTritemconvresultList(TTritemconvresultCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrpallettraceList(TTrpallettraceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrreversestockList(TTrreversestockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TTrtraceList(TTrtraceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TYtrsoList(TYtrsoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MBoxList(MBoxCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierList(MCarrierCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCblkList(MCblkCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCbrctgList(MCbrctgCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCdrcattList(MCdrcattCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterClassList(MCenterClassCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterColList(MCenterColCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterItemList(MCenterItemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MClinList(MClinCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCorgList(MCorgCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MMfinvoperationList(MMfinvoperationCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MMfmonthchgList(MMfmonthchgCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MMfstockitemList(MMfstockitemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MMfwhstrctList(MMfwhstrctCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MNumberingCenterList(MNumberingCenterCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MUserCenterList(MUserCenterCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MWarehouseList(MWarehouseCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TCcopamList(TCcopamCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TCordhdrList(TCordhdrCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TCsrwhadmList(TCsrwhadmCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TMflastshiplotList(TMflastshiplotCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TPalletList(TPalletCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TSplinfoList(TSplinfoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrallinvList(TTrallinvCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrcasenumList(TTrcasenumCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrcasestockList(TTrcasestockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrinvrequestList(TTrinvrequestCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTritemconvresultList(TTritemconvresultCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrpallettraceList(TTrpallettraceCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrreversestockList(TTrreversestockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TTrtraceList(TTrtraceCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TYtrsoList(TYtrsoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MBoxList(MBoxCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MBoxListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MBoxGrpListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierList(MCarrierCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCblkList(MCblkCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCblkListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCbrctgList(MCbrctgCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCbrctgListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCdrcattList(MCdrcattCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCdrcattListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterClassList(MCenterClassCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterClassListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterColList(MCenterColCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterColListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterCustomerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterItemList(MCenterItemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterItemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterScreenListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MClientCenterListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MClinList(MClinCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MClinListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCorgList(MCorgCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCorgListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MLocationListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MMfinvoperationList(MMfinvoperationCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MMfinvoperationListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MMfmonthchgList(MMfmonthchgCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MMfmonthchgListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MMfstockitemList(MMfstockitemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MMfstockitemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MMfwhstrctList(MMfwhstrctCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MMfwhstrctListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MMfwhxitemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MNumberingCenterList(MNumberingCenterCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MNumberingCenterListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MUserCenterList(MUserCenterCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MUserCenterListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MUserLoginListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MWarehouseList(MWarehouseCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MWarehouseListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MWebHtInfoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TAllocInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TCcopamList(TCcopamCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TCcopamListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TCenterSymbolListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TCordhdrList(TCordhdrCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TCordhdrListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TCsrwhadmList(TCsrwhadmCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TCsrwhadmListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TEcOrderHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TInventoryHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TMflastshiplotList(TMflastshiplotCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TMflastshiplotListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TMoveInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPackingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPalletList(TPalletCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPalletListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPickingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPicMthdRcmdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TReceivePlanHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TSerialNoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TShippingInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TSplinfoList(TSplinfoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TSplinfoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TStoreRecordHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrallinvList(TTrallinvCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrallinvListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrallinvhistoryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrcaseinventoryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrcasenumList(TTrcasenumCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrcasenumListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrcasestockList(TTrcasestockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrcasestockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrhanbaiinvListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrinvcheckinfoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrinvcorrectListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrinvreanswerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrinvrequestList(TTrinvrequestCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrinvrequestListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTritemconvresultList(TTritemconvresultCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTritemconvresultListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrjukyuinvListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrmanufacturedateListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrmanufacturedatedetailListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrmanufacturedatehistoryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrpallettraceList(TTrpallettraceCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrpallettraceListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrreversestockList(TTrreversestockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrreversestockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrstockdiffhistoryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrsymboltraceListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrsymboltraceextendListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrtraceList(TTrtraceCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TTrtraceListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TYtrsoList(TYtrsoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TYtrsoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtLoadingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WShippingInterruptListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueCenterNm() { return _myCQ.xdfgetCenterNm(); }
    protected ConditionValue xgetCValueCenterAbbr() { return _myCQ.xdfgetCenterAbbr(); }
    protected ConditionValue xgetCValueCultureId() { return _myCQ.xdfgetCultureId(); }
    public String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq)
    { return _myCQ.keepCultureId_InScopeRelation_BCulture(sq); }
    public String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq)
    { return _myCQ.keepCultureId_NotInScopeRelation_BCulture(sq); }
    protected ConditionValue xgetCValueTimeZoneId() { return _myCQ.xdfgetTimeZoneId(); }
    public String keepTimeZoneId_InScopeRelation_BTimeZone(BTimeZoneCQ sq)
    { return _myCQ.keepTimeZoneId_InScopeRelation_BTimeZone(sq); }
    public String keepTimeZoneId_NotInScopeRelation_BTimeZone(BTimeZoneCQ sq)
    { return _myCQ.keepTimeZoneId_NotInScopeRelation_BTimeZone(sq); }
    protected ConditionValue xgetCValueWarehousegroup() { return _myCQ.xdfgetWarehousegroup(); }
    protected ConditionValue xgetCValueVirtualwhouseflg() { return _myCQ.xdfgetVirtualwhouseflg(); }
    protected ConditionValue xgetCValueAname() { return _myCQ.xdfgetAname(); }
    protected ConditionValue xgetCValueAddress1() { return _myCQ.xdfgetAddress1(); }
    protected ConditionValue xgetCValueAddress2() { return _myCQ.xdfgetAddress2(); }
    protected ConditionValue xgetCValueAddress3() { return _myCQ.xdfgetAddress3(); }
    protected ConditionValue xgetCValuePostno() { return _myCQ.xdfgetPostno(); }
    protected ConditionValue xgetCValueCountrycd() { return _myCQ.xdfgetCountrycd(); }
    protected ConditionValue xgetCValuePortcd() { return _myCQ.xdfgetPortcd(); }
    protected ConditionValue xgetCValueDistrictcd() { return _myCQ.xdfgetDistrictcd(); }
    protected ConditionValue xgetCValuePhone1() { return _myCQ.xdfgetPhone1(); }
    protected ConditionValue xgetCValuePhone2() { return _myCQ.xdfgetPhone2(); }
    protected ConditionValue xgetCValueFax1() { return _myCQ.xdfgetFax1(); }
    protected ConditionValue xgetCValueFax2() { return _myCQ.xdfgetFax2(); }
    protected ConditionValue xgetCValueWarehouseflg() { return _myCQ.xdfgetWarehouseflg(); }
    protected ConditionValue xgetCValueRefname() { return _myCQ.xdfgetRefname(); }
    protected ConditionValue xgetCValueSubcontractflg() { return _myCQ.xdfgetSubcontractflg(); }
    protected ConditionValue xgetCValueWeightcapacity() { return _myCQ.xdfgetWeightcapacity(); }
    protected ConditionValue xgetCValueCapacity() { return _myCQ.xdfgetCapacity(); }
    protected ConditionValue xgetCValueHulftId() { return _myCQ.xdfgetHulftId(); }
    protected ConditionValue xgetCValueWarehousecls() { return _myCQ.xdfgetWarehousecls(); }
    protected ConditionValue xgetCValueCmlrasid() { return _myCQ.xdfgetCmlrasid(); }
    protected ConditionValue xgetCValueOwnOrAnotherFlg() { return _myCQ.xdfgetOwnOrAnotherFlg(); }
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
    public String keepScalarCondition(MCenterCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MCenterCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MCenterCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MCenterCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MCenterCB.class.getName(); }
    protected String xinCQ() { return MCenterCQ.class.getName(); }
}
