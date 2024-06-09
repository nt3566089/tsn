package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of M_PARAM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MParamDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MParamDbm _instance = new MParamDbm();
    private MParamDbm() {}
    public static MParamDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((MParam)et).getClientCenterId(), (et, vl) -> ((MParam)et).setClientCenterId(ctl(vl)), "clientCenterId");
        setupEpg(_epgMap, et -> ((MParam)et).getDeliveryCourseId(), (et, vl) -> ((MParam)et).setDeliveryCourseId(ctl(vl)), "deliveryCourseId");
        setupEpg(_epgMap, et -> ((MParam)et).getStoreDtFlg(), (et, vl) -> ((MParam)et).setStoreDtFlg((String)vl), "storeDtFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getStoreNoFlg(), (et, vl) -> ((MParam)et).setStoreNoFlg((String)vl), "storeNoFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getMergeCls(), (et, vl) -> ((MParam)et).setMergeCls((String)vl), "mergeCls");
        setupEpg(_epgMap, et -> ((MParam)et).getTKeepingDays(), (et, vl) -> ((MParam)et).setTKeepingDays(ctl(vl)), "TKeepingDays");
        setupEpg(_epgMap, et -> ((MParam)et).getHKeepingDays(), (et, vl) -> ((MParam)et).setHKeepingDays(ctl(vl)), "HKeepingDays");
        setupEpg(_epgMap, et -> ((MParam)et).getDKeepingDays(), (et, vl) -> ((MParam)et).setDKeepingDays(ctl(vl)), "DKeepingDays");
        setupEpg(_epgMap, et -> ((MParam)et).getOverStoreNumFlg(), (et, vl) -> ((MParam)et).setOverStoreNumFlg((String)vl), "overStoreNumFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getPastStoreDtFlg(), (et, vl) -> ((MParam)et).setPastStoreDtFlg((String)vl), "pastStoreDtFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getUseHtShipFlg(), (et, vl) -> ((MParam)et).setUseHtShipFlg((String)vl), "useHtShipFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getAllocSortKey(), (et, vl) -> ((MParam)et).setAllocSortKey((String)vl), "allocSortKey");
        setupEpg(_epgMap, et -> ((MParam)et).getRgReplenishUnitCls(), (et, vl) -> ((MParam)et).setRgReplenishUnitCls((String)vl), "rgReplenishUnitCls");
        setupEpg(_epgMap, et -> ((MParam)et).getEmReplenishUnitCls(), (et, vl) -> ((MParam)et).setEmReplenishUnitCls((String)vl), "emReplenishUnitCls");
        setupEpg(_epgMap, et -> ((MParam)et).getEmReplenishZoneId(), (et, vl) -> ((MParam)et).setEmReplenishZoneId(ctl(vl)), "emReplenishZoneId");
        setupEpg(_epgMap, et -> ((MParam)et).getEmReplenishAllocCls(), (et, vl) -> ((MParam)et).setEmReplenishAllocCls((String)vl), "emReplenishAllocCls");
        setupEpg(_epgMap, et -> ((MParam)et).getPackingCalCls(), (et, vl) -> ((MParam)et).setPackingCalCls((String)vl), "packingCalCls");
        setupEpg(_epgMap, et -> ((MParam)et).getPackingProcessCls(), (et, vl) -> ((MParam)et).setPackingProcessCls((String)vl), "packingProcessCls");
        setupEpg(_epgMap, et -> ((MParam)et).getProductPartPacking(), (et, vl) -> ((MParam)et).setProductPartPacking((String)vl), "productPartPacking");
        setupEpg(_epgMap, et -> ((MParam)et).getDecimalProductPacking(), (et, vl) -> ((MParam)et).setDecimalProductPacking((String)vl), "decimalProductPacking");
        setupEpg(_epgMap, et -> ((MParam)et).getPackingBoxGroupId(), (et, vl) -> ((MParam)et).setPackingBoxGroupId(ctl(vl)), "packingBoxGroupId");
        setupEpg(_epgMap, et -> ((MParam)et).getTotalPicFlg(), (et, vl) -> ((MParam)et).setTotalPicFlg((String)vl), "totalPicFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getMultiPicCls(), (et, vl) -> ((MParam)et).setMultiPicCls((String)vl), "multiPicCls");
        setupEpg(_epgMap, et -> ((MParam)et).getBacketColNum(), (et, vl) -> ((MParam)et).setBacketColNum(ctl(vl)), "backetColNum");
        setupEpg(_epgMap, et -> ((MParam)et).getBacketRowNum(), (et, vl) -> ((MParam)et).setBacketRowNum(ctl(vl)), "backetRowNum");
        setupEpg(_epgMap, et -> ((MParam)et).getCasePicFlg(), (et, vl) -> ((MParam)et).setCasePicFlg((String)vl), "casePicFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getSglRowPicFlg(), (et, vl) -> ((MParam)et).setSglRowPicFlg((String)vl), "sglRowPicFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getSglRowPicMaxInstNum(), (et, vl) -> ((MParam)et).setSglRowPicMaxInstNum(ctl(vl)), "sglRowPicMaxInstNum");
        setupEpg(_epgMap, et -> ((MParam)et).getPicMthdRcmdFlg(), (et, vl) -> ((MParam)et).setPicMthdRcmdFlg((String)vl), "picMthdRcmdFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getPicMthdRcmdBreakKey(), (et, vl) -> ((MParam)et).setPicMthdRcmdBreakKey((String)vl), "picMthdRcmdBreakKey");
        setupEpg(_epgMap, et -> ((MParam)et).getPicMthdRcmdApiKey(), (et, vl) -> ((MParam)et).setPicMthdRcmdApiKey((String)vl), "picMthdRcmdApiKey");
        setupEpg(_epgMap, et -> ((MParam)et).getPicMthdRcmdMltPlOut(), (et, vl) -> ((MParam)et).setPicMthdRcmdMltPlOut((String)vl), "picMthdRcmdMltPlOut");
        setupEpg(_epgMap, et -> ((MParam)et).getPicMthdRcmdSplSlOut(), (et, vl) -> ((MParam)et).setPicMthdRcmdSplSlOut((String)vl), "picMthdRcmdSplSlOut");
        setupEpg(_epgMap, et -> ((MParam)et).getProductLabelOutUnit(), (et, vl) -> ((MParam)et).setProductLabelOutUnit((String)vl), "productLabelOutUnit");
        setupEpg(_epgMap, et -> ((MParam)et).getResultAfterProductLabel(), (et, vl) -> ((MParam)et).setResultAfterProductLabel((String)vl), "resultAfterProductLabel");
        setupEpg(_epgMap, et -> ((MParam)et).getResultAfterProductTarget(), (et, vl) -> ((MParam)et).setResultAfterProductTarget((String)vl), "resultAfterProductTarget");
        setupEpg(_epgMap, et -> ((MParam)et).getProductLabelJanBarcode(), (et, vl) -> ((MParam)et).setProductLabelJanBarcode((String)vl), "productLabelJanBarcode");
        setupEpg(_epgMap, et -> ((MParam)et).getProductLabelProdBarcode(), (et, vl) -> ((MParam)et).setProductLabelProdBarcode((String)vl), "productLabelProdBarcode");
        setupEpg(_epgMap, et -> ((MParam)et).getProductLabelJanStartbit(), (et, vl) -> ((MParam)et).setProductLabelJanStartbit((String)vl), "productLabelJanStartbit");
        setupEpg(_epgMap, et -> ((MParam)et).getProductLabelJanEndbit(), (et, vl) -> ((MParam)et).setProductLabelJanEndbit((String)vl), "productLabelJanEndbit");
        setupEpg(_epgMap, et -> ((MParam)et).getProductLabelProdStartbit(), (et, vl) -> ((MParam)et).setProductLabelProdStartbit((String)vl), "productLabelProdStartbit");
        setupEpg(_epgMap, et -> ((MParam)et).getProductLabelProdEndbit(), (et, vl) -> ((MParam)et).setProductLabelProdEndbit((String)vl), "productLabelProdEndbit");
        setupEpg(_epgMap, et -> ((MParam)et).getBoxSelectSkip(), (et, vl) -> ((MParam)et).setBoxSelectSkip((String)vl), "boxSelectSkip");
        setupEpg(_epgMap, et -> ((MParam)et).getDefaultBoxId(), (et, vl) -> ((MParam)et).setDefaultBoxId(ctl(vl)), "defaultBoxId");
        setupEpg(_epgMap, et -> ((MParam)et).getErrorSoundPlayFlg(), (et, vl) -> ((MParam)et).setErrorSoundPlayFlg((String)vl), "errorSoundPlayFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getWarnSoundPlayFlg(), (et, vl) -> ((MParam)et).setWarnSoundPlayFlg((String)vl), "warnSoundPlayFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getInspSoundPlayFlg(), (et, vl) -> ((MParam)et).setInspSoundPlayFlg((String)vl), "inspSoundPlayFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getInspCompSoundPlayFlg(), (et, vl) -> ((MParam)et).setInspCompSoundPlayFlg((String)vl), "inspCompSoundPlayFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getAfterTagOutFlg(), (et, vl) -> ((MParam)et).setAfterTagOutFlg((String)vl), "afterTagOutFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getTagDeliveryOutFlg(), (et, vl) -> ((MParam)et).setTagDeliveryOutFlg((String)vl), "tagDeliveryOutFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getAfterDelivSlipOutFlg(), (et, vl) -> ((MParam)et).setAfterDelivSlipOutFlg((String)vl), "afterDelivSlipOutFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getAfterDelivSlipOutTgt(), (et, vl) -> ((MParam)et).setAfterDelivSlipOutTgt((String)vl), "afterDelivSlipOutTgt");
        setupEpg(_epgMap, et -> ((MParam)et).getSglRowInspAfterOutCls(), (et, vl) -> ((MParam)et).setSglRowInspAfterOutCls((String)vl), "sglRowInspAfterOutCls");
        setupEpg(_epgMap, et -> ((MParam)et).getHtCharReadFlg(), (et, vl) -> ((MParam)et).setHtCharReadFlg((String)vl), "htCharReadFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getHtLotInputType(), (et, vl) -> ((MParam)et).setHtLotInputType((String)vl), "htLotInputType");
        setupEpg(_epgMap, et -> ((MParam)et).getHtSerialInputType(), (et, vl) -> ((MParam)et).setHtSerialInputType((String)vl), "htSerialInputType");
        setupEpg(_epgMap, et -> ((MParam)et).getInspectionLabelOutFlg(), (et, vl) -> ((MParam)et).setInspectionLabelOutFlg((String)vl), "inspectionLabelOutFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getAutoShipInstFlg(), (et, vl) -> ((MParam)et).setAutoShipInstFlg((String)vl), "autoShipInstFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getStockOutAutoInstFlg(), (et, vl) -> ((MParam)et).setStockOutAutoInstFlg((String)vl), "stockOutAutoInstFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getAutoEmgSetFlg(), (et, vl) -> ((MParam)et).setAutoEmgSetFlg((String)vl), "autoEmgSetFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getAutoEmgSetTgt(), (et, vl) -> ((MParam)et).setAutoEmgSetTgt((String)vl), "autoEmgSetTgt");
        setupEpg(_epgMap, et -> ((MParam)et).getAutoEmgSetMinute(), (et, vl) -> ((MParam)et).setAutoEmgSetMinute(ctl(vl)), "autoEmgSetMinute");
        setupEpg(_epgMap, et -> ((MParam)et).getStockOutInstCxlFlg(), (et, vl) -> ((MParam)et).setStockOutInstCxlFlg((String)vl), "stockOutInstCxlFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getStockOutAllocCls(), (et, vl) -> ((MParam)et).setStockOutAllocCls((String)vl), "stockOutAllocCls");
        setupEpg(_epgMap, et -> ((MParam)et).getStockOutInstSplitFlg(), (et, vl) -> ((MParam)et).setStockOutInstSplitFlg((String)vl), "stockOutInstSplitFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getCesIntegrationFlg(), (et, vl) -> ((MParam)et).setCesIntegrationFlg((String)vl), "cesIntegrationFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getPackingSlipAutoOutputFlg(), (et, vl) -> ((MParam)et).setPackingSlipAutoOutputFlg((String)vl), "packingSlipAutoOutputFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getCenterKbn(), (et, vl) -> ((MParam)et).setCenterKbn((String)vl), "centerKbn");
        setupEpg(_epgMap, et -> ((MParam)et).getDelFlg(), (et, vl) -> ((MParam)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MParam)et).getVersionNo(), (et, vl) -> ((MParam)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MParam)et).getControlNo(), (et, vl) -> ((MParam)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MParam)et).getAddDt(), (et, vl) -> ((MParam)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MParam)et).getAddUser(), (et, vl) -> ((MParam)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MParam)et).getAddProcess(), (et, vl) -> ((MParam)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MParam)et).getUpdDt(), (et, vl) -> ((MParam)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MParam)et).getUpdUser(), (et, vl) -> ((MParam)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MParam)et).getUpdProcess(), (et, vl) -> ((MParam)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MParam)et).getMClientCenter(), (et, vl) -> ((MParam)et).setMClientCenter((MClientCenter)vl), "MClientCenter");
        setupEfpg(_efpgMap, et -> ((MParam)et).getMBox(), (et, vl) -> ((MParam)et).setMBox((MBox)vl), "MBox");
        setupEfpg(_efpgMap, et -> ((MParam)et).getMDeliveryCourse(), (et, vl) -> ((MParam)et).setMDeliveryCourse((MDeliveryCourse)vl), "MDeliveryCourse");
        setupEfpg(_efpgMap, et -> ((MParam)et).getMZone(), (et, vl) -> ((MParam)et).setMZone((MZone)vl), "MZone");
        setupEfpg(_efpgMap, et -> ((MParam)et).getMBoxGrp(), (et, vl) -> ((MParam)et).setMBoxGrp((MBoxGrp)vl), "MBoxGrp");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByAfterTagOutFlg(), (et, vl) -> ((MParam)et).setBClassDtlByAfterTagOutFlg((BClassDtl)vl), "BClassDtlByAfterTagOutFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByAfterDelivSlipOutFlg(), (et, vl) -> ((MParam)et).setBClassDtlByAfterDelivSlipOutFlg((BClassDtl)vl), "BClassDtlByAfterDelivSlipOutFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByAfterDelivSlipOutTgt(), (et, vl) -> ((MParam)et).setBClassDtlByAfterDelivSlipOutTgt((BClassDtl)vl), "BClassDtlByAfterDelivSlipOutTgt");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlBySglRowInspAfterOutCls(), (et, vl) -> ((MParam)et).setBClassDtlBySglRowInspAfterOutCls((BClassDtl)vl), "BClassDtlBySglRowInspAfterOutCls");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByBoxSelectSkip(), (et, vl) -> ((MParam)et).setBClassDtlByBoxSelectSkip((BClassDtl)vl), "BClassDtlByBoxSelectSkip");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByCasePicFlg(), (et, vl) -> ((MParam)et).setBClassDtlByCasePicFlg((BClassDtl)vl), "BClassDtlByCasePicFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByDelFlg(), (et, vl) -> ((MParam)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByHtCharReadFlg(), (et, vl) -> ((MParam)et).setBClassDtlByHtCharReadFlg((BClassDtl)vl), "BClassDtlByHtCharReadFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByMergeCls(), (et, vl) -> ((MParam)et).setBClassDtlByMergeCls((BClassDtl)vl), "BClassDtlByMergeCls");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByMultiPicCls(), (et, vl) -> ((MParam)et).setBClassDtlByMultiPicCls((BClassDtl)vl), "BClassDtlByMultiPicCls");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByOverStoreNumFlg(), (et, vl) -> ((MParam)et).setBClassDtlByOverStoreNumFlg((BClassDtl)vl), "BClassDtlByOverStoreNumFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByPackingCalCls(), (et, vl) -> ((MParam)et).setBClassDtlByPackingCalCls((BClassDtl)vl), "BClassDtlByPackingCalCls");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByPackingProcessCls(), (et, vl) -> ((MParam)et).setBClassDtlByPackingProcessCls((BClassDtl)vl), "BClassDtlByPackingProcessCls");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByPastStoreDtFlg(), (et, vl) -> ((MParam)et).setBClassDtlByPastStoreDtFlg((BClassDtl)vl), "BClassDtlByPastStoreDtFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByProductLabelJanBarcode(), (et, vl) -> ((MParam)et).setBClassDtlByProductLabelJanBarcode((BClassDtl)vl), "BClassDtlByProductLabelJanBarcode");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByProductLabelOutUnit(), (et, vl) -> ((MParam)et).setBClassDtlByProductLabelOutUnit((BClassDtl)vl), "BClassDtlByProductLabelOutUnit");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByProductLabelProdBarcode(), (et, vl) -> ((MParam)et).setBClassDtlByProductLabelProdBarcode((BClassDtl)vl), "BClassDtlByProductLabelProdBarcode");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByProductPartPacking(), (et, vl) -> ((MParam)et).setBClassDtlByProductPartPacking((BClassDtl)vl), "BClassDtlByProductPartPacking");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByDecimalProductPacking(), (et, vl) -> ((MParam)et).setBClassDtlByDecimalProductPacking((BClassDtl)vl), "BClassDtlByDecimalProductPacking");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByEmReplenishAllocCls(), (et, vl) -> ((MParam)et).setBClassDtlByEmReplenishAllocCls((BClassDtl)vl), "BClassDtlByEmReplenishAllocCls");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByRgReplenishUnitCls(), (et, vl) -> ((MParam)et).setBClassDtlByRgReplenishUnitCls((BClassDtl)vl), "BClassDtlByRgReplenishUnitCls");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByEmReplenishUnitCls(), (et, vl) -> ((MParam)et).setBClassDtlByEmReplenishUnitCls((BClassDtl)vl), "BClassDtlByEmReplenishUnitCls");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByResultAfterProductLabel(), (et, vl) -> ((MParam)et).setBClassDtlByResultAfterProductLabel((BClassDtl)vl), "BClassDtlByResultAfterProductLabel");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByResultAfterProductTarget(), (et, vl) -> ((MParam)et).setBClassDtlByResultAfterProductTarget((BClassDtl)vl), "BClassDtlByResultAfterProductTarget");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByStoreDtFlg(), (et, vl) -> ((MParam)et).setBClassDtlByStoreDtFlg((BClassDtl)vl), "BClassDtlByStoreDtFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByStoreNoFlg(), (et, vl) -> ((MParam)et).setBClassDtlByStoreNoFlg((BClassDtl)vl), "BClassDtlByStoreNoFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByTagDeliveryOutFlg(), (et, vl) -> ((MParam)et).setBClassDtlByTagDeliveryOutFlg((BClassDtl)vl), "BClassDtlByTagDeliveryOutFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByUseHtShipFlg(), (et, vl) -> ((MParam)et).setBClassDtlByUseHtShipFlg((BClassDtl)vl), "BClassDtlByUseHtShipFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByInspectionLabelOutFlg(), (et, vl) -> ((MParam)et).setBClassDtlByInspectionLabelOutFlg((BClassDtl)vl), "BClassDtlByInspectionLabelOutFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlBySglRowPicFlg(), (et, vl) -> ((MParam)et).setBClassDtlBySglRowPicFlg((BClassDtl)vl), "BClassDtlBySglRowPicFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByTotalPicFlg(), (et, vl) -> ((MParam)et).setBClassDtlByTotalPicFlg((BClassDtl)vl), "BClassDtlByTotalPicFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByPicMthdRcmdFlg(), (et, vl) -> ((MParam)et).setBClassDtlByPicMthdRcmdFlg((BClassDtl)vl), "BClassDtlByPicMthdRcmdFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByPicMthdRcmdBreakKey(), (et, vl) -> ((MParam)et).setBClassDtlByPicMthdRcmdBreakKey((BClassDtl)vl), "BClassDtlByPicMthdRcmdBreakKey");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByAutoShipInstFlg(), (et, vl) -> ((MParam)et).setBClassDtlByAutoShipInstFlg((BClassDtl)vl), "BClassDtlByAutoShipInstFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByStockOutAutoInstFlg(), (et, vl) -> ((MParam)et).setBClassDtlByStockOutAutoInstFlg((BClassDtl)vl), "BClassDtlByStockOutAutoInstFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByAutoEmgSetFlg(), (et, vl) -> ((MParam)et).setBClassDtlByAutoEmgSetFlg((BClassDtl)vl), "BClassDtlByAutoEmgSetFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByAutoEmgSetTgt(), (et, vl) -> ((MParam)et).setBClassDtlByAutoEmgSetTgt((BClassDtl)vl), "BClassDtlByAutoEmgSetTgt");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByStockOutAllocCls(), (et, vl) -> ((MParam)et).setBClassDtlByStockOutAllocCls((BClassDtl)vl), "BClassDtlByStockOutAllocCls");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByStockOutInstCxlFlg(), (et, vl) -> ((MParam)et).setBClassDtlByStockOutInstCxlFlg((BClassDtl)vl), "BClassDtlByStockOutInstCxlFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByStockOutInstSplitFlg(), (et, vl) -> ((MParam)et).setBClassDtlByStockOutInstSplitFlg((BClassDtl)vl), "BClassDtlByStockOutInstSplitFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByPicMthdRcmdMltPlOut(), (et, vl) -> ((MParam)et).setBClassDtlByPicMthdRcmdMltPlOut((BClassDtl)vl), "BClassDtlByPicMthdRcmdMltPlOut");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByPicMthdRcmdSplSlOut(), (et, vl) -> ((MParam)et).setBClassDtlByPicMthdRcmdSplSlOut((BClassDtl)vl), "BClassDtlByPicMthdRcmdSplSlOut");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByErrorSoundPlayFlg(), (et, vl) -> ((MParam)et).setBClassDtlByErrorSoundPlayFlg((BClassDtl)vl), "BClassDtlByErrorSoundPlayFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByWarnSoundPlayFlg(), (et, vl) -> ((MParam)et).setBClassDtlByWarnSoundPlayFlg((BClassDtl)vl), "BClassDtlByWarnSoundPlayFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByInspSoundPlayFlg(), (et, vl) -> ((MParam)et).setBClassDtlByInspSoundPlayFlg((BClassDtl)vl), "BClassDtlByInspSoundPlayFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByInspCompSoundPlayFlg(), (et, vl) -> ((MParam)et).setBClassDtlByInspCompSoundPlayFlg((BClassDtl)vl), "BClassDtlByInspCompSoundPlayFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByCesIntegrationFlg(), (et, vl) -> ((MParam)et).setBClassDtlByCesIntegrationFlg((BClassDtl)vl), "BClassDtlByCesIntegrationFlg");
        setupEfpg(_efpgMap, et -> ((MParam)et).getBClassDtlByPackingSlipAutoOutputFlg(), (et, vl) -> ((MParam)et).setBClassDtlByPackingSlipAutoOutputFlg((BClassDtl)vl), "BClassDtlByPackingSlipAutoOutputFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_PARAM";
    protected final String _tableDispName = "M_PARAM";
    protected final String _tablePropertyName = "MParam";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_PARAM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientCenterId = cci("CLIENT_CENTER_ID", "CLIENT_CENTER_ID", null, null, Long.class, "clientCenterId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "MClientCenter", null, null, false);
    protected final ColumnInfo _columnDeliveryCourseId = cci("DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", null, null, Long.class, "deliveryCourseId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MDeliveryCourse", null, null, false);
    protected final ColumnInfo _columnStoreDtFlg = cci("STORE_DT_FLG", "STORE_DT_FLG", null, null, String.class, "storeDtFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByStoreDtFlg", null, CDef.DefMeta.StoreDtFlg, false);
    protected final ColumnInfo _columnStoreNoFlg = cci("STORE_NO_FLG", "STORE_NO_FLG", null, null, String.class, "storeNoFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByStoreNoFlg", null, CDef.DefMeta.StoreNoFlg, false);
    protected final ColumnInfo _columnMergeCls = cci("MERGE_CLS", "MERGE_CLS", null, null, String.class, "mergeCls", null, false, false, true, "varchar", 30, 0, null, "02", false, null, null, "BClassDtlByMergeCls", null, CDef.DefMeta.MergeCls, false);
    protected final ColumnInfo _columnTKeepingDays = cci("T_KEEPING_DAYS", "T_KEEPING_DAYS", null, null, Long.class, "TKeepingDays", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHKeepingDays = cci("H_KEEPING_DAYS", "H_KEEPING_DAYS", null, null, Long.class, "HKeepingDays", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDKeepingDays = cci("D_KEEPING_DAYS", "D_KEEPING_DAYS", null, null, Long.class, "DKeepingDays", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOverStoreNumFlg = cci("OVER_STORE_NUM_FLG", "OVER_STORE_NUM_FLG", null, null, String.class, "overStoreNumFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByOverStoreNumFlg", null, CDef.DefMeta.OverStoreNumFlg, false);
    protected final ColumnInfo _columnPastStoreDtFlg = cci("PAST_STORE_DT_FLG", "PAST_STORE_DT_FLG", null, null, String.class, "pastStoreDtFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByPastStoreDtFlg", null, CDef.DefMeta.PastStoreDtFlg, false);
    protected final ColumnInfo _columnUseHtShipFlg = cci("USE_HT_SHIP_FLG", "USE_HT_SHIP_FLG", null, null, String.class, "useHtShipFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByUseHtShipFlg", null, CDef.DefMeta.UseHtShipFlg, false);
    protected final ColumnInfo _columnAllocSortKey = cci("ALLOC_SORT_KEY", "ALLOC_SORT_KEY", null, null, String.class, "allocSortKey", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRgReplenishUnitCls = cci("RG_REPLENISH_UNIT_CLS", "RG_REPLENISH_UNIT_CLS", null, null, String.class, "rgReplenishUnitCls", null, false, false, false, "varchar", 30, 0, null, "1", false, null, null, "BClassDtlByRgReplenishUnitCls", null, CDef.DefMeta.ReplenishUnitCls, false);
    protected final ColumnInfo _columnEmReplenishUnitCls = cci("EM_REPLENISH_UNIT_CLS", "EM_REPLENISH_UNIT_CLS", null, null, String.class, "emReplenishUnitCls", null, false, false, false, "varchar", 30, 0, null, "0", false, null, null, "BClassDtlByEmReplenishUnitCls", null, CDef.DefMeta.ReplenishUnitCls, false);
    protected final ColumnInfo _columnEmReplenishZoneId = cci("EM_REPLENISH_ZONE_ID", "EM_REPLENISH_ZONE_ID", null, null, Long.class, "emReplenishZoneId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MZone", null, null, false);
    protected final ColumnInfo _columnEmReplenishAllocCls = cci("EM_REPLENISH_ALLOC_CLS", "EM_REPLENISH_ALLOC_CLS", null, null, String.class, "emReplenishAllocCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByEmReplenishAllocCls", null, CDef.DefMeta.ReplenishAllocCls, false);
    protected final ColumnInfo _columnPackingCalCls = cci("PACKING_CAL_CLS", "PACKING_CAL_CLS", null, null, String.class, "packingCalCls", null, false, false, false, "varchar", 30, 0, null, "0", false, null, null, "BClassDtlByPackingCalCls", null, CDef.DefMeta.PackingCalCls, false);
    protected final ColumnInfo _columnPackingProcessCls = cci("PACKING_PROCESS_CLS", "PACKING_PROCESS_CLS", null, null, String.class, "packingProcessCls", null, false, false, false, "varchar", 30, 0, null, "0", false, null, null, "BClassDtlByPackingProcessCls", null, CDef.DefMeta.PackingProcessCls, false);
    protected final ColumnInfo _columnProductPartPacking = cci("PRODUCT_PART_PACKING", "PRODUCT_PART_PACKING", null, null, String.class, "productPartPacking", null, false, false, false, "varchar", 30, 0, null, "0", false, null, null, "BClassDtlByProductPartPacking", null, CDef.DefMeta.ProductPartPacking, false);
    protected final ColumnInfo _columnDecimalProductPacking = cci("DECIMAL_PRODUCT_PACKING", "DECIMAL_PRODUCT_PACKING", null, null, String.class, "decimalProductPacking", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByDecimalProductPacking", null, CDef.DefMeta.DecimalProductPacking, false);
    protected final ColumnInfo _columnPackingBoxGroupId = cci("PACKING_BOX_GROUP_ID", "PACKING_BOX_GROUP_ID", null, null, Long.class, "packingBoxGroupId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MBoxGrp", null, null, false);
    protected final ColumnInfo _columnTotalPicFlg = cci("TOTAL_PIC_FLG", "TOTAL_PIC_FLG", null, null, String.class, "totalPicFlg", null, false, false, true, "char", 1, 0, null, "1", false, null, null, "BClassDtlByTotalPicFlg", null, CDef.DefMeta.TotalPicFlg, false);
    protected final ColumnInfo _columnMultiPicCls = cci("MULTI_PIC_CLS", "MULTI_PIC_CLS", null, null, String.class, "multiPicCls", null, false, false, true, "varchar", 30, 0, null, "0", false, null, null, "BClassDtlByMultiPicCls", null, CDef.DefMeta.MultiPicCls, false);
    protected final ColumnInfo _columnBacketColNum = cci("BACKET_COL_NUM", "BACKET_COL_NUM", null, null, Long.class, "backetColNum", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBacketRowNum = cci("BACKET_ROW_NUM", "BACKET_ROW_NUM", null, null, Long.class, "backetRowNum", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePicFlg = cci("CASE_PIC_FLG", "CASE_PIC_FLG", null, null, String.class, "casePicFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByCasePicFlg", null, CDef.DefMeta.CasePicFlg, false);
    protected final ColumnInfo _columnSglRowPicFlg = cci("SGL_ROW_PIC_FLG", "SGL_ROW_PIC_FLG", null, null, String.class, "sglRowPicFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlBySglRowPicFlg", null, CDef.DefMeta.SglRowPicFlg, false);
    protected final ColumnInfo _columnSglRowPicMaxInstNum = cci("SGL_ROW_PIC_MAX_INST_NUM", "SGL_ROW_PIC_MAX_INST_NUM", null, null, Long.class, "sglRowPicMaxInstNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicMthdRcmdFlg = cci("PIC_MTHD_RCMD_FLG", "PIC_MTHD_RCMD_FLG", null, null, String.class, "picMthdRcmdFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByPicMthdRcmdFlg", null, CDef.DefMeta.PicMthdRcmdFlg, false);
    protected final ColumnInfo _columnPicMthdRcmdBreakKey = cci("PIC_MTHD_RCMD_BREAK_KEY", "PIC_MTHD_RCMD_BREAK_KEY", null, null, String.class, "picMthdRcmdBreakKey", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByPicMthdRcmdBreakKey", null, CDef.DefMeta.PicMthdRcmdBreakKey, false);
    protected final ColumnInfo _columnPicMthdRcmdApiKey = cci("PIC_MTHD_RCMD_API_KEY", "PIC_MTHD_RCMD_API_KEY", null, null, String.class, "picMthdRcmdApiKey", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicMthdRcmdMltPlOut = cci("PIC_MTHD_RCMD_MLT_PL_OUT", "PIC_MTHD_RCMD_MLT_PL_OUT", null, null, String.class, "picMthdRcmdMltPlOut", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByPicMthdRcmdMltPlOut", null, CDef.DefMeta.PicMthdRcmdListOut, false);
    protected final ColumnInfo _columnPicMthdRcmdSplSlOut = cci("PIC_MTHD_RCMD_SPL_SL_OUT", "PIC_MTHD_RCMD_SPL_SL_OUT", null, null, String.class, "picMthdRcmdSplSlOut", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByPicMthdRcmdSplSlOut", null, CDef.DefMeta.PicMthdRcmdListOut, false);
    protected final ColumnInfo _columnProductLabelOutUnit = cci("PRODUCT_LABEL_OUT_UNIT", "PRODUCT_LABEL_OUT_UNIT", null, null, String.class, "productLabelOutUnit", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByProductLabelOutUnit", null, CDef.DefMeta.ProductLabelOutUnit, false);
    protected final ColumnInfo _columnResultAfterProductLabel = cci("RESULT_AFTER_PRODUCT_LABEL", "RESULT_AFTER_PRODUCT_LABEL", null, null, String.class, "resultAfterProductLabel", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByResultAfterProductLabel", null, CDef.DefMeta.ResultAfterProductLabel, false);
    protected final ColumnInfo _columnResultAfterProductTarget = cci("RESULT_AFTER_PRODUCT_TARGET", "RESULT_AFTER_PRODUCT_TARGET", null, null, String.class, "resultAfterProductTarget", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByResultAfterProductTarget", null, CDef.DefMeta.ResultAfterProductTarget, false);
    protected final ColumnInfo _columnProductLabelJanBarcode = cci("PRODUCT_LABEL_JAN_BARCODE", "PRODUCT_LABEL_JAN_BARCODE", null, null, String.class, "productLabelJanBarcode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByProductLabelJanBarcode", null, CDef.DefMeta.ProductLabelJanBarcode, false);
    protected final ColumnInfo _columnProductLabelProdBarcode = cci("PRODUCT_LABEL_PROD_BARCODE", "PRODUCT_LABEL_PROD_BARCODE", null, null, String.class, "productLabelProdBarcode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByProductLabelProdBarcode", null, CDef.DefMeta.ProductLabelProdBarcode, false);
    protected final ColumnInfo _columnProductLabelJanStartbit = cci("PRODUCT_LABEL_JAN_STARTBIT", "PRODUCT_LABEL_JAN_STARTBIT", null, null, String.class, "productLabelJanStartbit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductLabelJanEndbit = cci("PRODUCT_LABEL_JAN_ENDBIT", "PRODUCT_LABEL_JAN_ENDBIT", null, null, String.class, "productLabelJanEndbit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductLabelProdStartbit = cci("PRODUCT_LABEL_PROD_STARTBIT", "PRODUCT_LABEL_PROD_STARTBIT", null, null, String.class, "productLabelProdStartbit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductLabelProdEndbit = cci("PRODUCT_LABEL_PROD_ENDBIT", "PRODUCT_LABEL_PROD_ENDBIT", null, null, String.class, "productLabelProdEndbit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxSelectSkip = cci("BOX_SELECT_SKIP", "BOX_SELECT_SKIP", null, null, String.class, "boxSelectSkip", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByBoxSelectSkip", null, CDef.DefMeta.BoxSelectSkip, false);
    protected final ColumnInfo _columnDefaultBoxId = cci("DEFAULT_BOX_ID", "DEFAULT_BOX_ID", null, null, Long.class, "defaultBoxId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MBox", null, null, false);
    protected final ColumnInfo _columnErrorSoundPlayFlg = cci("ERROR_SOUND_PLAY_FLG", "ERROR_SOUND_PLAY_FLG", null, null, String.class, "errorSoundPlayFlg", null, false, false, true, "char", 1, 0, null, "1", false, null, null, "BClassDtlByErrorSoundPlayFlg", null, CDef.DefMeta.SoundPlayFlg, false);
    protected final ColumnInfo _columnWarnSoundPlayFlg = cci("WARN_SOUND_PLAY_FLG", "WARN_SOUND_PLAY_FLG", null, null, String.class, "warnSoundPlayFlg", null, false, false, true, "char", 1, 0, null, "1", false, null, null, "BClassDtlByWarnSoundPlayFlg", null, CDef.DefMeta.SoundPlayFlg, false);
    protected final ColumnInfo _columnInspSoundPlayFlg = cci("INSP_SOUND_PLAY_FLG", "INSP_SOUND_PLAY_FLG", null, null, String.class, "inspSoundPlayFlg", null, false, false, true, "char", 1, 0, null, "1", false, null, null, "BClassDtlByInspSoundPlayFlg", null, CDef.DefMeta.SoundPlayFlg, false);
    protected final ColumnInfo _columnInspCompSoundPlayFlg = cci("INSP_COMP_SOUND_PLAY_FLG", "INSP_COMP_SOUND_PLAY_FLG", null, null, String.class, "inspCompSoundPlayFlg", null, false, false, true, "char", 1, 0, null, "1", false, null, null, "BClassDtlByInspCompSoundPlayFlg", null, CDef.DefMeta.SoundPlayFlg, false);
    protected final ColumnInfo _columnAfterTagOutFlg = cci("AFTER_TAG_OUT_FLG", "AFTER_TAG_OUT_FLG", null, null, String.class, "afterTagOutFlg", null, false, false, true, "char", 1, 0, null, "1", false, null, null, "BClassDtlByAfterTagOutFlg", null, CDef.DefMeta.AfterTagOutFlg, false);
    protected final ColumnInfo _columnTagDeliveryOutFlg = cci("TAG_DELIVERY_OUT_FLG", "TAG_DELIVERY_OUT_FLG", null, null, String.class, "tagDeliveryOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByTagDeliveryOutFlg", null, CDef.DefMeta.TagDeliveryOutFlg, false);
    protected final ColumnInfo _columnAfterDelivSlipOutFlg = cci("AFTER_DELIV_SLIP_OUT_FLG", "AFTER_DELIV_SLIP_OUT_FLG", null, null, String.class, "afterDelivSlipOutFlg", null, false, false, true, "char", 1, 0, null, "1", false, null, null, "BClassDtlByAfterDelivSlipOutFlg", null, CDef.DefMeta.AfterTagOutFlg, false);
    protected final ColumnInfo _columnAfterDelivSlipOutTgt = cci("AFTER_DELIV_SLIP_OUT_TGT", "AFTER_DELIV_SLIP_OUT_TGT", null, null, String.class, "afterDelivSlipOutTgt", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByAfterDelivSlipOutTgt", null, CDef.DefMeta.AfterDelivSlipOutTgt, false);
    protected final ColumnInfo _columnSglRowInspAfterOutCls = cci("SGL_ROW_INSP_AFTER_OUT_CLS", "SGL_ROW_INSP_AFTER_OUT_CLS", null, null, String.class, "sglRowInspAfterOutCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlBySglRowInspAfterOutCls", null, CDef.DefMeta.SglRowInspAfterOutCls, false);
    protected final ColumnInfo _columnHtCharReadFlg = cci("HT_CHAR_READ_FLG", "HT_CHAR_READ_FLG", null, null, String.class, "htCharReadFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByHtCharReadFlg", null, CDef.DefMeta.HtCharReadFlg, false);
    protected final ColumnInfo _columnHtLotInputType = cci("HT_LOT_INPUT_TYPE", "HT_LOT_INPUT_TYPE", null, null, String.class, "htLotInputType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHtSerialInputType = cci("HT_SERIAL_INPUT_TYPE", "HT_SERIAL_INPUT_TYPE", null, null, String.class, "htSerialInputType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectionLabelOutFlg = cci("INSPECTION_LABEL_OUT_FLG", "INSPECTION_LABEL_OUT_FLG", null, null, String.class, "inspectionLabelOutFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByInspectionLabelOutFlg", null, CDef.DefMeta.InspectionLabelOutFlg, false);
    protected final ColumnInfo _columnAutoShipInstFlg = cci("AUTO_SHIP_INST_FLG", "AUTO_SHIP_INST_FLG", null, null, String.class, "autoShipInstFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByAutoShipInstFlg", null, CDef.DefMeta.AutoShipInstFlg, false);
    protected final ColumnInfo _columnStockOutAutoInstFlg = cci("STOCK_OUT_AUTO_INST_FLG", "STOCK_OUT_AUTO_INST_FLG", null, null, String.class, "stockOutAutoInstFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByStockOutAutoInstFlg", null, CDef.DefMeta.StockOutAutoInstFlg, false);
    protected final ColumnInfo _columnAutoEmgSetFlg = cci("AUTO_EMG_SET_FLG", "AUTO_EMG_SET_FLG", null, null, String.class, "autoEmgSetFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByAutoEmgSetFlg", null, CDef.DefMeta.AutoEmgSetFlg, false);
    protected final ColumnInfo _columnAutoEmgSetTgt = cci("AUTO_EMG_SET_TGT", "AUTO_EMG_SET_TGT", null, null, String.class, "autoEmgSetTgt", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByAutoEmgSetTgt", null, CDef.DefMeta.AutoEmgSetTgt, false);
    protected final ColumnInfo _columnAutoEmgSetMinute = cci("AUTO_EMG_SET_MINUTE", "AUTO_EMG_SET_MINUTE", null, null, Long.class, "autoEmgSetMinute", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockOutInstCxlFlg = cci("STOCK_OUT_INST_CXL_FLG", "STOCK_OUT_INST_CXL_FLG", null, null, String.class, "stockOutInstCxlFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, "BClassDtlByStockOutInstCxlFlg", null, CDef.DefMeta.StockOutInstCxlFlg, false);
    protected final ColumnInfo _columnStockOutAllocCls = cci("STOCK_OUT_ALLOC_CLS", "STOCK_OUT_ALLOC_CLS", null, null, String.class, "stockOutAllocCls", null, false, false, false, "varchar", 30, 0, null, "0", false, null, null, "BClassDtlByStockOutAllocCls", null, CDef.DefMeta.StockOutAllocCls, false);
    protected final ColumnInfo _columnStockOutInstSplitFlg = cci("STOCK_OUT_INST_SPLIT_FLG", "STOCK_OUT_INST_SPLIT_FLG", null, null, String.class, "stockOutInstSplitFlg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, "BClassDtlByStockOutInstSplitFlg", null, CDef.DefMeta.StockOutInstSplitFlg, false);
    protected final ColumnInfo _columnCesIntegrationFlg = cci("CES_INTEGRATION_FLG", "CES_INTEGRATION_FLG", null, null, String.class, "cesIntegrationFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByCesIntegrationFlg", null, CDef.DefMeta.CesIntegrationFlg, false);
    protected final ColumnInfo _columnPackingSlipAutoOutputFlg = cci("PACKING_SLIP_AUTO_OUTPUT_FLG", "PACKING_SLIP_AUTO_OUTPUT_FLG", null, null, String.class, "packingSlipAutoOutputFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByPackingSlipAutoOutputFlg", null, CDef.DefMeta.PackingSlipAutoOutputFlg, false);
    protected final ColumnInfo _columnCenterKbn = cci("CENTER_KBN", "CENTER_KBN", null, null, String.class, "centerKbn", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, "BClassDtlByDelFlg", null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCenterId() { return _columnClientCenterId; }
    /**
     * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseId() { return _columnDeliveryCourseId; }
    /**
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDtFlg() { return _columnStoreDtFlg; }
    /**
     * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNoFlg() { return _columnStoreNoFlg; }
    /**
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeCls() { return _columnMergeCls; }
    /**
     * T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTKeepingDays() { return _columnTKeepingDays; }
    /**
     * H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHKeepingDays() { return _columnHKeepingDays; }
    /**
     * D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDKeepingDays() { return _columnDKeepingDays; }
    /**
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOverStoreNumFlg() { return _columnOverStoreNumFlg; }
    /**
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPastStoreDtFlg() { return _columnPastStoreDtFlg; }
    /**
     * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseHtShipFlg() { return _columnUseHtShipFlg; }
    /**
     * ALLOC_SORT_KEY: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocSortKey() { return _columnAllocSortKey; }
    /**
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRgReplenishUnitCls() { return _columnRgReplenishUnitCls; }
    /**
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmReplenishUnitCls() { return _columnEmReplenishUnitCls; }
    /**
     * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmReplenishZoneId() { return _columnEmReplenishZoneId; }
    /**
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmReplenishAllocCls() { return _columnEmReplenishAllocCls; }
    /**
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingCalCls() { return _columnPackingCalCls; }
    /**
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingProcessCls() { return _columnPackingProcessCls; }
    /**
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductPartPacking() { return _columnProductPartPacking; }
    /**
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDecimalProductPacking() { return _columnDecimalProductPacking; }
    /**
     * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingBoxGroupId() { return _columnPackingBoxGroupId; }
    /**
     * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalPicFlg() { return _columnTotalPicFlg; }
    /**
     * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMultiPicCls() { return _columnMultiPicCls; }
    /**
     * BACKET_COL_NUM: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBacketColNum() { return _columnBacketColNum; }
    /**
     * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBacketRowNum() { return _columnBacketRowNum; }
    /**
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePicFlg() { return _columnCasePicFlg; }
    /**
     * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSglRowPicFlg() { return _columnSglRowPicFlg; }
    /**
     * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSglRowPicMaxInstNum() { return _columnSglRowPicMaxInstNum; }
    /**
     * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicMthdRcmdFlg() { return _columnPicMthdRcmdFlg; }
    /**
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicMthdRcmdBreakKey() { return _columnPicMthdRcmdBreakKey; }
    /**
     * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicMthdRcmdApiKey() { return _columnPicMthdRcmdApiKey; }
    /**
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicMthdRcmdMltPlOut() { return _columnPicMthdRcmdMltPlOut; }
    /**
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicMthdRcmdSplSlOut() { return _columnPicMthdRcmdSplSlOut; }
    /**
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductLabelOutUnit() { return _columnProductLabelOutUnit; }
    /**
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnResultAfterProductLabel() { return _columnResultAfterProductLabel; }
    /**
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnResultAfterProductTarget() { return _columnResultAfterProductTarget; }
    /**
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductLabelJanBarcode() { return _columnProductLabelJanBarcode; }
    /**
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductLabelProdBarcode() { return _columnProductLabelProdBarcode; }
    /**
     * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductLabelJanStartbit() { return _columnProductLabelJanStartbit; }
    /**
     * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductLabelJanEndbit() { return _columnProductLabelJanEndbit; }
    /**
     * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductLabelProdStartbit() { return _columnProductLabelProdStartbit; }
    /**
     * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductLabelProdEndbit() { return _columnProductLabelProdEndbit; }
    /**
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxSelectSkip() { return _columnBoxSelectSkip; }
    /**
     * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultBoxId() { return _columnDefaultBoxId; }
    /**
     * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorSoundPlayFlg() { return _columnErrorSoundPlayFlg; }
    /**
     * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarnSoundPlayFlg() { return _columnWarnSoundPlayFlg; }
    /**
     * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspSoundPlayFlg() { return _columnInspSoundPlayFlg; }
    /**
     * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspCompSoundPlayFlg() { return _columnInspCompSoundPlayFlg; }
    /**
     * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAfterTagOutFlg() { return _columnAfterTagOutFlg; }
    /**
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagDeliveryOutFlg() { return _columnTagDeliveryOutFlg; }
    /**
     * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAfterDelivSlipOutFlg() { return _columnAfterDelivSlipOutFlg; }
    /**
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAfterDelivSlipOutTgt() { return _columnAfterDelivSlipOutTgt; }
    /**
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSglRowInspAfterOutCls() { return _columnSglRowInspAfterOutCls; }
    /**
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtCharReadFlg() { return _columnHtCharReadFlg; }
    /**
     * HT_LOT_INPUT_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtLotInputType() { return _columnHtLotInputType; }
    /**
     * HT_SERIAL_INPUT_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtSerialInputType() { return _columnHtSerialInputType; }
    /**
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectionLabelOutFlg() { return _columnInspectionLabelOutFlg; }
    /**
     * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAutoShipInstFlg() { return _columnAutoShipInstFlg; }
    /**
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockOutAutoInstFlg() { return _columnStockOutAutoInstFlg; }
    /**
     * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAutoEmgSetFlg() { return _columnAutoEmgSetFlg; }
    /**
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAutoEmgSetTgt() { return _columnAutoEmgSetTgt; }
    /**
     * AUTO_EMG_SET_MINUTE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAutoEmgSetMinute() { return _columnAutoEmgSetMinute; }
    /**
     * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockOutInstCxlFlg() { return _columnStockOutInstCxlFlg; }
    /**
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockOutAllocCls() { return _columnStockOutAllocCls; }
    /**
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockOutInstSplitFlg() { return _columnStockOutInstSplitFlg; }
    /**
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCesIntegrationFlg() { return _columnCesIntegrationFlg; }
    /**
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingSlipAutoOutputFlg() { return _columnPackingSlipAutoOutputFlg; }
    /**
     * CENTER_KBN: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterKbn() { return _columnCenterKbn; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientCenterId());
        ls.add(columnDeliveryCourseId());
        ls.add(columnStoreDtFlg());
        ls.add(columnStoreNoFlg());
        ls.add(columnMergeCls());
        ls.add(columnTKeepingDays());
        ls.add(columnHKeepingDays());
        ls.add(columnDKeepingDays());
        ls.add(columnOverStoreNumFlg());
        ls.add(columnPastStoreDtFlg());
        ls.add(columnUseHtShipFlg());
        ls.add(columnAllocSortKey());
        ls.add(columnRgReplenishUnitCls());
        ls.add(columnEmReplenishUnitCls());
        ls.add(columnEmReplenishZoneId());
        ls.add(columnEmReplenishAllocCls());
        ls.add(columnPackingCalCls());
        ls.add(columnPackingProcessCls());
        ls.add(columnProductPartPacking());
        ls.add(columnDecimalProductPacking());
        ls.add(columnPackingBoxGroupId());
        ls.add(columnTotalPicFlg());
        ls.add(columnMultiPicCls());
        ls.add(columnBacketColNum());
        ls.add(columnBacketRowNum());
        ls.add(columnCasePicFlg());
        ls.add(columnSglRowPicFlg());
        ls.add(columnSglRowPicMaxInstNum());
        ls.add(columnPicMthdRcmdFlg());
        ls.add(columnPicMthdRcmdBreakKey());
        ls.add(columnPicMthdRcmdApiKey());
        ls.add(columnPicMthdRcmdMltPlOut());
        ls.add(columnPicMthdRcmdSplSlOut());
        ls.add(columnProductLabelOutUnit());
        ls.add(columnResultAfterProductLabel());
        ls.add(columnResultAfterProductTarget());
        ls.add(columnProductLabelJanBarcode());
        ls.add(columnProductLabelProdBarcode());
        ls.add(columnProductLabelJanStartbit());
        ls.add(columnProductLabelJanEndbit());
        ls.add(columnProductLabelProdStartbit());
        ls.add(columnProductLabelProdEndbit());
        ls.add(columnBoxSelectSkip());
        ls.add(columnDefaultBoxId());
        ls.add(columnErrorSoundPlayFlg());
        ls.add(columnWarnSoundPlayFlg());
        ls.add(columnInspSoundPlayFlg());
        ls.add(columnInspCompSoundPlayFlg());
        ls.add(columnAfterTagOutFlg());
        ls.add(columnTagDeliveryOutFlg());
        ls.add(columnAfterDelivSlipOutFlg());
        ls.add(columnAfterDelivSlipOutTgt());
        ls.add(columnSglRowInspAfterOutCls());
        ls.add(columnHtCharReadFlg());
        ls.add(columnHtLotInputType());
        ls.add(columnHtSerialInputType());
        ls.add(columnInspectionLabelOutFlg());
        ls.add(columnAutoShipInstFlg());
        ls.add(columnStockOutAutoInstFlg());
        ls.add(columnAutoEmgSetFlg());
        ls.add(columnAutoEmgSetTgt());
        ls.add(columnAutoEmgSetMinute());
        ls.add(columnStockOutInstCxlFlg());
        ls.add(columnStockOutAllocCls());
        ls.add(columnStockOutInstSplitFlg());
        ls.add(columnCesIntegrationFlg());
        ls.add(columnPackingSlipAutoOutputFlg());
        ls.add(columnCenterKbn());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnClientCenterId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_CLIENT_CENTER by my CLIENT_CENTER_ID, named 'MClientCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClientCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientCenterId(), MClientCenterDbm.getInstance().columnClientCenterId());
        return cfi("M_PARAM_FK3", "MClientCenter", this, MClientCenterDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "MParamAsOne", false);
    }
    /**
     * M_BOX by my DEFAULT_BOX_ID, named 'MBox'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMBox() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDefaultBoxId(), MBoxDbm.getInstance().columnBoxId());
        return cfi("M_PARAM_FK1", "MBox", this, MBoxDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MParamList", false);
    }
    /**
     * M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMDeliveryCourse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDeliveryCourseId(), MDeliveryCourseDbm.getInstance().columnDeliveryCourseId());
        return cfi("M_PARAM_FK5", "MDeliveryCourse", this, MDeliveryCourseDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "MParamList", false);
    }
    /**
     * M_ZONE by my EM_REPLENISH_ZONE_ID, named 'MZone'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMZone() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEmReplenishZoneId(), MZoneDbm.getInstance().columnZoneId());
        return cfi("M_PARAM_FK2", "MZone", this, MZoneDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "MParamList", false);
    }
    /**
     * M_BOX_GRP by my PACKING_BOX_GROUP_ID, named 'MBoxGrp'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMBoxGrp() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingBoxGroupId(), MBoxGrpDbm.getInstance().columnBoxGrpId());
        return cfi("M_PARAM_FK4", "MBoxGrp", this, MBoxGrpDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "MParamList", false);
    }
    /**
     * B_CLASS_DTL by my AFTER_TAG_OUT_FLG, named 'BClassDtlByAfterTagOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByAfterTagOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAfterTagOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_AFTER_TAG_OUT_FLG", "BClassDtlByAfterTagOutFlg", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'AFTER_TAG_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_FLG, named 'BClassDtlByAfterDelivSlipOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByAfterDelivSlipOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAfterDelivSlipOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_AFTER_DELIV_SLIP_OUT_FLG", "BClassDtlByAfterDelivSlipOutFlg", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'AFTER_TAG_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_TGT, named 'BClassDtlByAfterDelivSlipOutTgt'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByAfterDelivSlipOutTgt() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAfterDelivSlipOutTgt(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_AFTER_DELIV_SLIP_OUT_TGT", "BClassDtlByAfterDelivSlipOutTgt", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'AFTER_DELIV_SLIP_OUT_TGT'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SGL_ROW_INSP_AFTER_OUT_CLS, named 'BClassDtlBySglRowInspAfterOutCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySglRowInspAfterOutCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSglRowInspAfterOutCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_SGL_ROW_INSP_AFTER_OUT_CLS", "BClassDtlBySglRowInspAfterOutCls", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SGL_ROW_INSP_AFTER_OUT_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my BOX_SELECT_SKIP, named 'BClassDtlByBoxSelectSkip'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByBoxSelectSkip() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxSelectSkip(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_BOX_SELECT_SKIP", "BClassDtlByBoxSelectSkip", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'BOX_SELECT_SKIP'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my CASE_PIC_FLG, named 'BClassDtlByCasePicFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCasePicFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCasePicFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_CASE_PIC_FLG", "BClassDtlByCasePicFlg", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CASE_PIC_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 11, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my HT_CHAR_READ_FLG, named 'BClassDtlByHtCharReadFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByHtCharReadFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnHtCharReadFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_HT_CHAR_READ_FLG", "BClassDtlByHtCharReadFlg", this, BClassDtlDbm.getInstance(), mp, 12, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'HT_CHAR_READ_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByMergeCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMergeCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_MERGE_CLS", "BClassDtlByMergeCls", this, BClassDtlDbm.getInstance(), mp, 13, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'MERGE_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my MULTI_PIC_CLS, named 'BClassDtlByMultiPicCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByMultiPicCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMultiPicCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_MULTI_PIC_CLS", "BClassDtlByMultiPicCls", this, BClassDtlDbm.getInstance(), mp, 14, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'MULTI_PIC_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my OVER_STORE_NUM_FLG, named 'BClassDtlByOverStoreNumFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByOverStoreNumFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOverStoreNumFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_OVER_STORE_NUM_FLG", "BClassDtlByOverStoreNumFlg", this, BClassDtlDbm.getInstance(), mp, 15, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'OVER_STORE_NUM_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPackingCalCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingCalCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_PACKING_CAL_CLS", "BClassDtlByPackingCalCls", this, BClassDtlDbm.getInstance(), mp, 16, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PACKING_CAL_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PACKING_PROCESS_CLS, named 'BClassDtlByPackingProcessCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPackingProcessCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingProcessCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_PACKING_PROCESS_CLS", "BClassDtlByPackingProcessCls", this, BClassDtlDbm.getInstance(), mp, 17, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PACKING_PROCESS_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PAST_STORE_DT_FLG, named 'BClassDtlByPastStoreDtFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPastStoreDtFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPastStoreDtFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_PAST_STORE_DT_FLG", "BClassDtlByPastStoreDtFlg", this, BClassDtlDbm.getInstance(), mp, 18, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PAST_STORE_DT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PRODUCT_LABEL_JAN_BARCODE, named 'BClassDtlByProductLabelJanBarcode'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByProductLabelJanBarcode() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductLabelJanBarcode(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_PRODUCT_LABEL_JAN_BARCODE", "BClassDtlByProductLabelJanBarcode", this, BClassDtlDbm.getInstance(), mp, 19, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PRODUCT_LABEL_JAN_BARCODE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PRODUCT_LABEL_OUT_UNIT, named 'BClassDtlByProductLabelOutUnit'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByProductLabelOutUnit() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductLabelOutUnit(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_PRODUCT_LABEL_OUT_UNIT", "BClassDtlByProductLabelOutUnit", this, BClassDtlDbm.getInstance(), mp, 20, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PRODUCT_LABEL_OUT_UNIT'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PRODUCT_LABEL_PROD_BARCODE, named 'BClassDtlByProductLabelProdBarcode'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByProductLabelProdBarcode() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductLabelProdBarcode(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_PRODUCT_LABEL_PROD_BARCODE", "BClassDtlByProductLabelProdBarcode", this, BClassDtlDbm.getInstance(), mp, 21, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PRODUCT_LABEL_PROD_BARCODE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PRODUCT_PART_PACKING, named 'BClassDtlByProductPartPacking'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByProductPartPacking() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductPartPacking(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_PRODUCT_PART_PACKING", "BClassDtlByProductPartPacking", this, BClassDtlDbm.getInstance(), mp, 22, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PRODUCT_PART_PACKING'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DECIMAL_PRODUCT_PACKING, named 'BClassDtlByDecimalProductPacking'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDecimalProductPacking() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDecimalProductPacking(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_DECIMAL_PRODUCT_PACKING", "BClassDtlByDecimalProductPacking", this, BClassDtlDbm.getInstance(), mp, 23, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DECIMAL_PRODUCT_PACKING'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my EM_REPLENISH_ALLOC_CLS, named 'BClassDtlByEmReplenishAllocCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByEmReplenishAllocCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEmReplenishAllocCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_EM_REPLENISH_ALLOC_CLS", "BClassDtlByEmReplenishAllocCls", this, BClassDtlDbm.getInstance(), mp, 24, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'REPLENISH_ALLOC_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my RG_REPLENISH_UNIT_CLS, named 'BClassDtlByRgReplenishUnitCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByRgReplenishUnitCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRgReplenishUnitCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_RG_REPLENISH_UNIT_CLS", "BClassDtlByRgReplenishUnitCls", this, BClassDtlDbm.getInstance(), mp, 25, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'REPLENISH_UNIT_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my EM_REPLENISH_UNIT_CLS, named 'BClassDtlByEmReplenishUnitCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByEmReplenishUnitCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEmReplenishUnitCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_EM_REPLENISH_UNIT_CLS", "BClassDtlByEmReplenishUnitCls", this, BClassDtlDbm.getInstance(), mp, 26, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'REPLENISH_UNIT_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my RESULT_AFTER_PRODUCT_LABEL, named 'BClassDtlByResultAfterProductLabel'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByResultAfterProductLabel() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnResultAfterProductLabel(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_RESULT_AFTER_PRODUCT_LABEL", "BClassDtlByResultAfterProductLabel", this, BClassDtlDbm.getInstance(), mp, 27, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'RESULT_AFTER_PRODUCT_LABEL'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my RESULT_AFTER_PRODUCT_TARGET, named 'BClassDtlByResultAfterProductTarget'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByResultAfterProductTarget() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnResultAfterProductTarget(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_RESULT_AFTER_PRODUCT_TARGET", "BClassDtlByResultAfterProductTarget", this, BClassDtlDbm.getInstance(), mp, 28, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'RESULT_AFTER_PRODUCT_TARGET'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my STORE_DT_FLG, named 'BClassDtlByStoreDtFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStoreDtFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreDtFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_STORE_DT_FLG", "BClassDtlByStoreDtFlg", this, BClassDtlDbm.getInstance(), mp, 29, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STORE_DT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my STORE_NO_FLG, named 'BClassDtlByStoreNoFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStoreNoFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_STORE_NO_FLG", "BClassDtlByStoreNoFlg", this, BClassDtlDbm.getInstance(), mp, 30, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STORE_NO_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my TAG_DELIVERY_OUT_FLG, named 'BClassDtlByTagDeliveryOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByTagDeliveryOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTagDeliveryOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_TAG_DELIVERY_OUT_FLG", "BClassDtlByTagDeliveryOutFlg", this, BClassDtlDbm.getInstance(), mp, 31, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'TAG_DELIVERY_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my USE_HT_SHIP_FLG, named 'BClassDtlByUseHtShipFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByUseHtShipFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUseHtShipFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_USE_HT_SHIP_FLG", "BClassDtlByUseHtShipFlg", this, BClassDtlDbm.getInstance(), mp, 32, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'USE_HT_SHIP_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my INSPECTION_LABEL_OUT_FLG, named 'BClassDtlByInspectionLabelOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInspectionLabelOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInspectionLabelOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_INSPECTION_LABEL_OUT_FLG", "BClassDtlByInspectionLabelOutFlg", this, BClassDtlDbm.getInstance(), mp, 33, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INSPECTION_LABEL_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySglRowPicFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSglRowPicFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_SGL_ROW_PIC_FLG", "BClassDtlBySglRowPicFlg", this, BClassDtlDbm.getInstance(), mp, 34, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SGL_ROW_PIC_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my TOTAL_PIC_FLG, named 'BClassDtlByTotalPicFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByTotalPicFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTotalPicFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_TOTAL_PIC_FLG", "BClassDtlByTotalPicFlg", this, BClassDtlDbm.getInstance(), mp, 35, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'TOTAL_PIC_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PIC_MTHD_RCMD_FLG, named 'BClassDtlByPicMthdRcmdFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPicMthdRcmdFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPicMthdRcmdFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_PIC_MTHD_RCMD_FLG", "BClassDtlByPicMthdRcmdFlg", this, BClassDtlDbm.getInstance(), mp, 36, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PIC_MTHD_RCMD_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PIC_MTHD_RCMD_BREAK_KEY, named 'BClassDtlByPicMthdRcmdBreakKey'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPicMthdRcmdBreakKey() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPicMthdRcmdBreakKey(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_PIC_MTHD_RCMD_BREAK_KEY", "BClassDtlByPicMthdRcmdBreakKey", this, BClassDtlDbm.getInstance(), mp, 37, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PIC_MTHD_RCMD_BREAK_KEY'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my AUTO_SHIP_INST_FLG, named 'BClassDtlByAutoShipInstFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByAutoShipInstFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAutoShipInstFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_AUTO_SHIP_INST_FLG", "BClassDtlByAutoShipInstFlg", this, BClassDtlDbm.getInstance(), mp, 38, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'AUTO_SHIP_INST_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my STOCK_OUT_AUTO_INST_FLG, named 'BClassDtlByStockOutAutoInstFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStockOutAutoInstFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockOutAutoInstFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_STOCK_OUT_AUTO_INST_FLG", "BClassDtlByStockOutAutoInstFlg", this, BClassDtlDbm.getInstance(), mp, 39, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STOCK_OUT_AUTO_INST_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my AUTO_EMG_SET_FLG, named 'BClassDtlByAutoEmgSetFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByAutoEmgSetFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAutoEmgSetFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_AUTO_EMG_SET_FLG", "BClassDtlByAutoEmgSetFlg", this, BClassDtlDbm.getInstance(), mp, 40, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'AUTO_EMG_SET_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my AUTO_EMG_SET_TGT, named 'BClassDtlByAutoEmgSetTgt'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByAutoEmgSetTgt() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAutoEmgSetTgt(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_AUTO_EMG_SET_TGT", "BClassDtlByAutoEmgSetTgt", this, BClassDtlDbm.getInstance(), mp, 41, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'AUTO_EMG_SET_TGT'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my STOCK_OUT_ALLOC_CLS, named 'BClassDtlByStockOutAllocCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStockOutAllocCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockOutAllocCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_STOCK_OUT_ALLOC_CLS", "BClassDtlByStockOutAllocCls", this, BClassDtlDbm.getInstance(), mp, 42, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STOCK_OUT_ALLOC_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my STOCK_OUT_INST_CXL_FLG, named 'BClassDtlByStockOutInstCxlFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStockOutInstCxlFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockOutInstCxlFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_STOCK_OUT_INST_CXL_FLG", "BClassDtlByStockOutInstCxlFlg", this, BClassDtlDbm.getInstance(), mp, 43, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STOCK_OUT_INST_CXL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my STOCK_OUT_INST_SPLIT_FLG, named 'BClassDtlByStockOutInstSplitFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStockOutInstSplitFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockOutInstSplitFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_STOCK_OUT_INST_SPLIT_FLG", "BClassDtlByStockOutInstSplitFlg", this, BClassDtlDbm.getInstance(), mp, 44, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STOCK_OUT_INST_SPLIT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PIC_MTHD_RCMD_MLT_PL_OUT, named 'BClassDtlByPicMthdRcmdMltPlOut'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPicMthdRcmdMltPlOut() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPicMthdRcmdMltPlOut(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_PIC_MTHD_RCMD_MLT_PL_OUT", "BClassDtlByPicMthdRcmdMltPlOut", this, BClassDtlDbm.getInstance(), mp, 45, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PIC_MTHD_RCMD_LIST_OUT'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PIC_MTHD_RCMD_SPL_SL_OUT, named 'BClassDtlByPicMthdRcmdSplSlOut'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPicMthdRcmdSplSlOut() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPicMthdRcmdSplSlOut(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_PIC_MTHD_RCMD_SPL_SL_OUT", "BClassDtlByPicMthdRcmdSplSlOut", this, BClassDtlDbm.getInstance(), mp, 46, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PIC_MTHD_RCMD_LIST_OUT'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my ERROR_SOUND_PLAY_FLG, named 'BClassDtlByErrorSoundPlayFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByErrorSoundPlayFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnErrorSoundPlayFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_ERROR_SOUND_PLAY_FLG", "BClassDtlByErrorSoundPlayFlg", this, BClassDtlDbm.getInstance(), mp, 47, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SOUND_PLAY_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my WARN_SOUND_PLAY_FLG, named 'BClassDtlByWarnSoundPlayFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByWarnSoundPlayFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarnSoundPlayFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_WARN_SOUND_PLAY_FLG", "BClassDtlByWarnSoundPlayFlg", this, BClassDtlDbm.getInstance(), mp, 48, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SOUND_PLAY_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my INSP_SOUND_PLAY_FLG, named 'BClassDtlByInspSoundPlayFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInspSoundPlayFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInspSoundPlayFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_INSP_SOUND_PLAY_FLG", "BClassDtlByInspSoundPlayFlg", this, BClassDtlDbm.getInstance(), mp, 49, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SOUND_PLAY_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my INSP_COMP_SOUND_PLAY_FLG, named 'BClassDtlByInspCompSoundPlayFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInspCompSoundPlayFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInspCompSoundPlayFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_INSP_COMP_SOUND_PLAY_FLG", "BClassDtlByInspCompSoundPlayFlg", this, BClassDtlDbm.getInstance(), mp, 50, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SOUND_PLAY_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my CES_INTEGRATION_FLG, named 'BClassDtlByCesIntegrationFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCesIntegrationFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCesIntegrationFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_CES_INTEGRATION_FLG", "BClassDtlByCesIntegrationFlg", this, BClassDtlDbm.getInstance(), mp, 51, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CES_INTEGRATION_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PACKING_SLIP_AUTO_OUTPUT_FLG, named 'BClassDtlByPackingSlipAutoOutputFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPackingSlipAutoOutputFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingSlipAutoOutputFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PARAM_PACKING_SLIP_AUTO_OUTPUT_FLG", "BClassDtlByPackingSlipAutoOutputFlg", this, BClassDtlDbm.getInstance(), mp, 52, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PACKING_SLIP_AUTO_OUTPUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MParam"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MParamCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MParamBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MParam> getEntityType() { return MParam.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MParam newEntity() { return new MParam(); }
    public MParam newMyEntity() { return new MParam(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MParam)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MParam)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
