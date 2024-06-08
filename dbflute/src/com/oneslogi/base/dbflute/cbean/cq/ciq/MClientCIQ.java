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
 * The condition-query for in-line of M_CLIENT.
 * @author DBFlute(AutoGenerator)
 */
public class MClientCIQ extends AbstractBsMClientCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMClientCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MClientCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMClientCQ myCQ) {
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
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_ExistsReferrer_MCbrctgList(MCbrctgCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MCdrcattList(MCdrcattCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MClientColList(MClientColCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MClientItemList(MClientItemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MClientScreenList(MClientScreenCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MCustomerList(MCustomerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MImportTypeList(MImportTypeCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MMfinvoperationList(MMfinvoperationCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MMfmonthchgList(MMfmonthchgCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MMfpickctlList(MMfpickctlCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MMfrcvdesignList(MMfrcvdesignCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MMfrcvitemList(MMfrcvitemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MProductList(MProductCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MShapeGrpList(MShapeGrpCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MUserClientList(MUserClientCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TCcopamList(TCcopamCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TCordhdrList(TCordhdrCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TMflastshiplotList(TMflastshiplotCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TPalletList(TPalletCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TSplinfoList(TSplinfoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrallinvList(TTrallinvCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrcasenumList(TTrcasenumCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrcasestockList(TTrcasestockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrinvrequestList(TTrinvrequestCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTritemconvresultList(TTritemconvresultCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrpallettraceList(TTrpallettraceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrreversestockList(TTrreversestockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTrtraceList(TTrtraceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TYtrsoList(TYtrsoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MCbrctgList(MCbrctgCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MCdrcattList(MCdrcattCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MClientColList(MClientColCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MClientItemList(MClientItemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MClientScreenList(MClientScreenCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MCustomerList(MCustomerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MImportTypeList(MImportTypeCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MMfinvoperationList(MMfinvoperationCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MMfmonthchgList(MMfmonthchgCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MMfpickctlList(MMfpickctlCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MMfrcvdesignList(MMfrcvdesignCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MMfrcvitemList(MMfrcvitemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MMfwhxitemList(MMfwhxitemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MProductList(MProductCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MShapeGrpList(MShapeGrpCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MUserClientList(MUserClientCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TCcopamList(TCcopamCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TCordhdrList(TCordhdrCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TMflastshiplotList(TMflastshiplotCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TPalletList(TPalletCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TSplinfoList(TSplinfoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrallinvList(TTrallinvCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrcasenumList(TTrcasenumCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrcasestockList(TTrcasestockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrinvrequestList(TTrinvrequestCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTritemconvresultList(TTritemconvresultCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrpallettraceList(TTrpallettraceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrreversestockList(TTrreversestockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTrtraceList(TTrtraceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TYtrsoList(TYtrsoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MCbrctgList(MCbrctgCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MCdrcattList(MCdrcattCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MClientColList(MClientColCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MClientItemList(MClientItemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MClientScreenList(MClientScreenCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MCustomerList(MCustomerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MImportTypeList(MImportTypeCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MMfinvoperationList(MMfinvoperationCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MMfmonthchgList(MMfmonthchgCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MMfpickctlList(MMfpickctlCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MMfrcvdesignList(MMfrcvdesignCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MMfrcvitemList(MMfrcvitemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MProductList(MProductCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MShapeGrpList(MShapeGrpCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MUserClientList(MUserClientCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TCcopamList(TCcopamCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TCordhdrList(TCordhdrCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TMflastshiplotList(TMflastshiplotCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TPalletList(TPalletCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TSplinfoList(TSplinfoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrallinvList(TTrallinvCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrcasenumList(TTrcasenumCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrcasestockList(TTrcasestockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrinvrequestList(TTrinvrequestCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTritemconvresultList(TTritemconvresultCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrpallettraceList(TTrpallettraceCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrreversestockList(TTrreversestockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTrtraceList(TTrtraceCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TYtrsoList(TYtrsoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MCbrctgList(MCbrctgCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MCbrctgListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MCdrcattList(MCdrcattCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MCdrcattListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientCenterListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientColList(MClientColCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientColListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientItemList(MClientItemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientItemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientScreenList(MClientScreenCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientScreenListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MCustomerList(MCustomerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MCustomerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MImportTypeList(MImportTypeCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MImportTypeListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MMfinvoperationList(MMfinvoperationCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MMfinvoperationListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MMfmonthchgList(MMfmonthchgCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MMfmonthchgListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MMfpickctlList(MMfpickctlCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MMfpickctlListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MMfrcvdesignList(MMfrcvdesignCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MMfrcvdesignListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MMfrcvitemList(MMfrcvitemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MMfrcvitemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MMfwhxitemList(MMfwhxitemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MMfwhxitemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MProductList(MProductCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MProductListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MShapeGrpList(MShapeGrpCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MShapeGrpListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MUserClientList(MUserClientCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MUserClientListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MUserLoginListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MWebHtInfoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TAllocInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TCcopamList(TCcopamCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TCcopamListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TCenterSymbolListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TCordhdrList(TCordhdrCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TCordhdrListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TEcOrderHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TInventoryHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TMflastshiplotList(TMflastshiplotCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TMflastshiplotListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TMoveInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPackingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPalletList(TPalletCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPalletListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPickingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPicMthdRcmdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TReceivePlanHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TSerialNoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TShippingInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TSplinfoList(TSplinfoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TSplinfoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TStockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TStoreRecordHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrallinvList(TTrallinvCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrallinvListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrallinvhistoryList(TTrallinvhistoryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrallinvhistoryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrcaseinventoryList(TTrcaseinventoryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrcaseinventoryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrcasenumList(TTrcasenumCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrcasenumListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrcasestockList(TTrcasestockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrcasestockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrhanbaiinvList(TTrhanbaiinvCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrhanbaiinvListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrinvcheckinfoList(TTrinvcheckinfoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrinvcheckinfoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrinvcorrectList(TTrinvcorrectCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrinvcorrectListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrinvreanswerList(TTrinvreanswerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrinvreanswerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrinvrequestList(TTrinvrequestCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrinvrequestListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTritemconvresultList(TTritemconvresultCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTritemconvresultListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrjukyuinvList(TTrjukyuinvCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrjukyuinvListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrmanufacturedateList(TTrmanufacturedateCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrmanufacturedateListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrmanufacturedatedetailList(TTrmanufacturedatedetailCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrmanufacturedatedetailListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrmanufacturedatehistoryList(TTrmanufacturedatehistoryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrmanufacturedatehistoryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrpallettraceList(TTrpallettraceCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrpallettraceListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrreversestockList(TTrreversestockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrreversestockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrstockdiffhistoryList(TTrstockdiffhistoryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrstockdiffhistoryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrsymboltraceList(TTrsymboltraceCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrsymboltraceListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrsymboltraceextendList(TTrsymboltraceextendCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrsymboltraceextendListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrtraceList(TTrtraceCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTrtraceListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TYtrsoList(TYtrsoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TYtrsoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtLoadingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtShippingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WShippingInterruptListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClientCd() { return _myCQ.xdfgetClientCd(); }
    protected ConditionValue xgetCValueClientNm() { return _myCQ.xdfgetClientNm(); }
    protected ConditionValue xgetCValueClientAbbr() { return _myCQ.xdfgetClientAbbr(); }
    protected ConditionValue xgetCValueCustomerId() { return _myCQ.xdfgetCustomerId(); }
    public String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepCustomerId_InScopeRelation_MCustomer(sq); }
    public String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepCustomerId_NotInScopeRelation_MCustomer(sq); }
    protected ConditionValue xgetCValueShapeGrpId() { return _myCQ.xdfgetShapeGrpId(); }
    public String keepShapeGrpId_InScopeRelation_MShapeGrp(MShapeGrpCQ sq)
    { return _myCQ.keepShapeGrpId_InScopeRelation_MShapeGrp(sq); }
    public String keepShapeGrpId_NotInScopeRelation_MShapeGrp(MShapeGrpCQ sq)
    { return _myCQ.keepShapeGrpId_NotInScopeRelation_MShapeGrp(sq); }
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
    public String keepScalarCondition(MClientCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MClientCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MClientCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MClientCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MClientCB.class.getName(); }
    protected String xinCQ() { return MClientCQ.class.getName(); }
}
