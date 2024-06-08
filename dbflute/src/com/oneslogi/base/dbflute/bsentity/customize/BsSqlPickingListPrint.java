package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, WORK_DT, SHIPPING_DT, PICKING_BATCH_NO, PICKING_WORK_NO, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, SLIP_NO, LINE_NO, PRODUCT_ID, INST_NUM, ALLOC_NUM, STOCK_OUT_FLG, OPL_OUT_FLG, OPL_OUT_NM, TPL_OUT_FLG, TPL_OUT_NM, MLT_OUT_FLG, MLT_OUT_NM, SPL_OUT_FLG, SPL_OUT_NM, PL1_OUT_FLG, PL1_OUT_NM, PL1_OUT_DT, PL_OUT_FLG, PL_OUT_NM, SL_OUT_FLG, SL_OUT_NM, PL2_OUT_FLG, PL2_OUT_NM, PL2_OUT_DT, CASE_OUT_FLG, CASE_OUT_NM, CASE_OUT_DT, PICKING_GROUP_NO, EMERGENCY_FLG, UPD_DT, NUM, PACKING_CNT, PACKING_CASE_CNT, PACKING_MIXED_CNT, MULTI_PIC_FLG, MULTI_PIC_FLG_NM, TAG_OUT_FLG, TAG_OUT_FLG_NM, TAG_OUT_DT, SGL_ROW_PIC_FLG, SGL_ROW_PIC_NM, CASE_PIC_FLG, CASE_PIC_NM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String workDt = entity.getWorkDt();
 * String shippingDt = entity.getShippingDt();
 * String pickingBatchNo = entity.getPickingBatchNo();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * Long slipNo = entity.getSlipNo();
 * Long lineNo = entity.getLineNo();
 * Long productId = entity.getProductId();
 * java.math.BigDecimal instNum = entity.getInstNum();
 * java.math.BigDecimal allocNum = entity.getAllocNum();
 * String stockOutFlg = entity.getStockOutFlg();
 * String oplOutFlg = entity.getOplOutFlg();
 * String oplOutNm = entity.getOplOutNm();
 * String tplOutFlg = entity.getTplOutFlg();
 * String tplOutNm = entity.getTplOutNm();
 * String mltOutFlg = entity.getMltOutFlg();
 * String mltOutNm = entity.getMltOutNm();
 * String splOutFlg = entity.getSplOutFlg();
 * Integer splOutNm = entity.getSplOutNm();
 * String pl1OutFlg = entity.getPl1OutFlg();
 * Integer pl1OutNm = entity.getPl1OutNm();
 * java.sql.Timestamp pl1OutDt = entity.getPl1OutDt();
 * String plOutFlg = entity.getPlOutFlg();
 * String plOutNm = entity.getPlOutNm();
 * String slOutFlg = entity.getSlOutFlg();
 * String slOutNm = entity.getSlOutNm();
 * String pl2OutFlg = entity.getPl2OutFlg();
 * Integer pl2OutNm = entity.getPl2OutNm();
 * java.sql.Timestamp pl2OutDt = entity.getPl2OutDt();
 * String caseOutFlg = entity.getCaseOutFlg();
 * String caseOutNm = entity.getCaseOutNm();
 * java.sql.Timestamp caseOutDt = entity.getCaseOutDt();
 * String pickingGroupNo = entity.getPickingGroupNo();
 * String emergencyFlg = entity.getEmergencyFlg();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * Long num = entity.getNum();
 * Long packingCnt = entity.getPackingCnt();
 * Integer packingCaseCnt = entity.getPackingCaseCnt();
 * Integer packingMixedCnt = entity.getPackingMixedCnt();
 * String multiPicFlg = entity.getMultiPicFlg();
 * Integer multiPicFlgNm = entity.getMultiPicFlgNm();
 * String tagOutFlg = entity.getTagOutFlg();
 * Integer tagOutFlgNm = entity.getTagOutFlgNm();
 * java.sql.Timestamp tagOutDt = entity.getTagOutDt();
 * String sglRowPicFlg = entity.getSglRowPicFlg();
 * String sglRowPicNm = entity.getSglRowPicNm();
 * String casePicFlg = entity.getCasePicFlg();
 * String casePicNm = entity.getCasePicNm();
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setWorkDt(workDt);
 * entity.setShippingDt(shippingDt);
 * entity.setPickingBatchNo(pickingBatchNo);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setSlipNo(slipNo);
 * entity.setLineNo(lineNo);
 * entity.setProductId(productId);
 * entity.setInstNum(instNum);
 * entity.setAllocNum(allocNum);
 * entity.setStockOutFlg(stockOutFlg);
 * entity.setOplOutFlg(oplOutFlg);
 * entity.setOplOutNm(oplOutNm);
 * entity.setTplOutFlg(tplOutFlg);
 * entity.setTplOutNm(tplOutNm);
 * entity.setMltOutFlg(mltOutFlg);
 * entity.setMltOutNm(mltOutNm);
 * entity.setSplOutFlg(splOutFlg);
 * entity.setSplOutNm(splOutNm);
 * entity.setPl1OutFlg(pl1OutFlg);
 * entity.setPl1OutNm(pl1OutNm);
 * entity.setPl1OutDt(pl1OutDt);
 * entity.setPlOutFlg(plOutFlg);
 * entity.setPlOutNm(plOutNm);
 * entity.setSlOutFlg(slOutFlg);
 * entity.setSlOutNm(slOutNm);
 * entity.setPl2OutFlg(pl2OutFlg);
 * entity.setPl2OutNm(pl2OutNm);
 * entity.setPl2OutDt(pl2OutDt);
 * entity.setCaseOutFlg(caseOutFlg);
 * entity.setCaseOutNm(caseOutNm);
 * entity.setCaseOutDt(caseOutDt);
 * entity.setPickingGroupNo(pickingGroupNo);
 * entity.setEmergencyFlg(emergencyFlg);
 * entity.setUpdDt(updDt);
 * entity.setNum(num);
 * entity.setPackingCnt(packingCnt);
 * entity.setPackingCaseCnt(packingCaseCnt);
 * entity.setPackingMixedCnt(packingMixedCnt);
 * entity.setMultiPicFlg(multiPicFlg);
 * entity.setMultiPicFlgNm(multiPicFlgNm);
 * entity.setTagOutFlg(tagOutFlg);
 * entity.setTagOutFlgNm(tagOutFlgNm);
 * entity.setTagOutDt(tagOutDt);
 * entity.setSglRowPicFlg(sglRowPicFlg);
 * entity.setSglRowPicNm(sglRowPicNm);
 * entity.setCasePicFlg(casePicFlg);
 * entity.setCasePicNm(casePicNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlPickingListPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** WORK_DT: {varchar(8)} */
    protected String _workDt;

    /** SHIPPING_DT: {varchar(8)} */
    protected String _shippingDt;

    /** PICKING_BATCH_NO: {varchar(30)} */
    protected String _pickingBatchNo;

    /** PICKING_WORK_NO: {varchar(30)} */
    protected String _pickingWorkNo;

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(255)} */
    protected String _supplyCustomerNm;

    /** DELIVERY_COURSE_CD: {varchar(30)} */
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {varchar(60)} */
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {varchar(30)} */
    protected String _carrierCd;

    /** CARRIER_NM: {varchar(60)} */
    protected String _carrierNm;

    /** SLIP_NO: {int(10)} */
    protected Long _slipNo;

    /** LINE_NO: {int(10)} */
    protected Long _lineNo;

    /** PRODUCT_ID: {int(10)} */
    protected Long _productId;

    /** INST_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _instNum;

    /** ALLOC_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _allocNum;

    /** STOCK_OUT_FLG: {char(1)} */
    protected String _stockOutFlg;

    /** OPL_OUT_FLG: {varchar(1)} */
    protected String _oplOutFlg;

    /** OPL_OUT_NM: {int(10)} */
    protected String _oplOutNm;

    /** TPL_OUT_FLG: {varchar(1)} */
    protected String _tplOutFlg;

    /** TPL_OUT_NM: {int(10)} */
    protected String _tplOutNm;

    /** MLT_OUT_FLG: {varchar(1)} */
    protected String _mltOutFlg;

    /** MLT_OUT_NM: {int(10)} */
    protected String _mltOutNm;

    /** SPL_OUT_FLG: {varchar(1)} */
    protected String _splOutFlg;

    /** SPL_OUT_NM: {int(10)} */
    protected Integer _splOutNm;

    /** PL1_OUT_FLG: {varchar(1)} */
    protected String _pl1OutFlg;

    /** PL1_OUT_NM: {int(10)} */
    protected Integer _pl1OutNm;

    /** PL1_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _pl1OutDt;

    /** PL_OUT_FLG: {varchar(1)} */
    protected String _plOutFlg;

    /** PL_OUT_NM: {int(10)} */
    protected String _plOutNm;

    /** SL_OUT_FLG: {varchar(1)} */
    protected String _slOutFlg;

    /** SL_OUT_NM: {int(10)} */
    protected String _slOutNm;

    /** PL2_OUT_FLG: {varchar(1)} */
    protected String _pl2OutFlg;

    /** PL2_OUT_NM: {int(10)} */
    protected Integer _pl2OutNm;

    /** PL2_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _pl2OutDt;

    /** CASE_OUT_FLG: {varchar(1)} */
    protected String _caseOutFlg;

    /** CASE_OUT_NM: {int(10)} */
    protected String _caseOutNm;

    /** CASE_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _caseOutDt;

    /** PICKING_GROUP_NO: {varchar(30)} */
    protected String _pickingGroupNo;

    /** EMERGENCY_FLG: {char(1)} */
    protected String _emergencyFlg;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** NUM: {int(10)} */
    protected Long _num;

    /** PACKING_CNT: {int(10)} */
    protected Long _packingCnt;

    /** PACKING_CASE_CNT: {int(10)} */
    protected Integer _packingCaseCnt;

    /** PACKING_MIXED_CNT: {int(10)} */
    protected Integer _packingMixedCnt;

    /** MULTI_PIC_FLG: {char(1), classification=MultiPicFlg} */
    protected String _multiPicFlg;

    /** MULTI_PIC_FLG_NM: {int(10)} */
    protected Integer _multiPicFlgNm;

    /** TAG_OUT_FLG: {varchar(1)} */
    protected String _tagOutFlg;

    /** TAG_OUT_FLG_NM: {int(10)} */
    protected Integer _tagOutFlgNm;

    /** TAG_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _tagOutDt;

    /** SGL_ROW_PIC_FLG: {char(1), classification=SglRowPicFlg} */
    protected String _sglRowPicFlg;

    /** SGL_ROW_PIC_NM: {int(10)} */
    protected String _sglRowPicNm;

    /** CASE_PIC_FLG: {varchar(1)} */
    protected String _casePicFlg;

    /** CASE_PIC_NM: {int(10)} */
    protected String _casePicNm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlPickingListPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlPickingListPrint";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of multiPicFlg as the classification of MultiPicFlg. <br>
     * MULTI_PIC_FLG: {char(1), classification=MultiPicFlg} <br>
     * マルチピック計算フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MultiPicFlg getMultiPicFlgAsMultiPicFlg() {
        return CDef.MultiPicFlg.codeOf(getMultiPicFlg());
    }

    /**
     * Set the value of multiPicFlg as the classification of MultiPicFlg. <br>
     * MULTI_PIC_FLG: {char(1), classification=MultiPicFlg} <br>
     * マルチピック計算フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMultiPicFlgAsMultiPicFlg(CDef.MultiPicFlg cdef) {
        setMultiPicFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of sglRowPicFlg as the classification of SglRowPicFlg. <br>
     * SGL_ROW_PIC_FLG: {char(1), classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SglRowPicFlg getSglRowPicFlgAsSglRowPicFlg() {
        return CDef.SglRowPicFlg.codeOf(getSglRowPicFlg());
    }

    /**
     * Set the value of sglRowPicFlg as the classification of SglRowPicFlg. <br>
     * SGL_ROW_PIC_FLG: {char(1), classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSglRowPicFlgAsSglRowPicFlg(CDef.SglRowPicFlg cdef) {
        setSglRowPicFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of multiPicFlg as $0 (0). <br>
     * $0: 計算無
     */
    public void setMultiPicFlg_$0() {
        setMultiPicFlgAsMultiPicFlg(CDef.MultiPicFlg.$0);
    }

    /**
     * Set the value of multiPicFlg as $1 (1). <br>
     * $1: 計算有
     */
    public void setMultiPicFlg_$1() {
        setMultiPicFlgAsMultiPicFlg(CDef.MultiPicFlg.$1);
    }

    /**
     * Set the value of sglRowPicFlg as $0 (0). <br>
     * $0: 単行ピック無
     */
    public void setSglRowPicFlg_$0() {
        setSglRowPicFlgAsSglRowPicFlg(CDef.SglRowPicFlg.$0);
    }

    /**
     * Set the value of sglRowPicFlg as $1 (1). <br>
     * $1: 単行ピック有
     */
    public void setSglRowPicFlg_$1() {
        setSglRowPicFlgAsSglRowPicFlg(CDef.SglRowPicFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of multiPicFlg $0? <br>
     * $0: 計算無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMultiPicFlg$0() {
        CDef.MultiPicFlg cdef = getMultiPicFlgAsMultiPicFlg();
        return cdef != null ? cdef.equals(CDef.MultiPicFlg.$0) : false;
    }

    /**
     * Is the value of multiPicFlg $1? <br>
     * $1: 計算有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMultiPicFlg$1() {
        CDef.MultiPicFlg cdef = getMultiPicFlgAsMultiPicFlg();
        return cdef != null ? cdef.equals(CDef.MultiPicFlg.$1) : false;
    }

    /**
     * Is the value of sglRowPicFlg $0? <br>
     * $0: 単行ピック無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSglRowPicFlg$0() {
        CDef.SglRowPicFlg cdef = getSglRowPicFlgAsSglRowPicFlg();
        return cdef != null ? cdef.equals(CDef.SglRowPicFlg.$0) : false;
    }

    /**
     * Is the value of sglRowPicFlg $1? <br>
     * $1: 単行ピック有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSglRowPicFlg$1() {
        CDef.SglRowPicFlg cdef = getSglRowPicFlgAsSglRowPicFlg();
        return cdef != null ? cdef.equals(CDef.SglRowPicFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'multiPicFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMultiPicFlgName() {
        CDef.MultiPicFlg cdef = getMultiPicFlgAsMultiPicFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'sglRowPicFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSglRowPicFlgName() {
        CDef.SglRowPicFlg cdef = getSglRowPicFlgAsSglRowPicFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlPickingListPrint) {
            BsSqlPickingListPrint other = (BsSqlPickingListPrint)obj;
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_workDt, other._workDt)) { return false; }
            if (!xSV(_shippingDt, other._shippingDt)) { return false; }
            if (!xSV(_pickingBatchNo, other._pickingBatchNo)) { return false; }
            if (!xSV(_pickingWorkNo, other._pickingWorkNo)) { return false; }
            if (!xSV(_supplyCustomerCd, other._supplyCustomerCd)) { return false; }
            if (!xSV(_supplyCustomerNm, other._supplyCustomerNm)) { return false; }
            if (!xSV(_deliveryCourseCd, other._deliveryCourseCd)) { return false; }
            if (!xSV(_deliveryCourseNm, other._deliveryCourseNm)) { return false; }
            if (!xSV(_carrierCd, other._carrierCd)) { return false; }
            if (!xSV(_carrierNm, other._carrierNm)) { return false; }
            if (!xSV(_slipNo, other._slipNo)) { return false; }
            if (!xSV(_lineNo, other._lineNo)) { return false; }
            if (!xSV(_productId, other._productId)) { return false; }
            if (!xSV(_instNum, other._instNum)) { return false; }
            if (!xSV(_allocNum, other._allocNum)) { return false; }
            if (!xSV(_stockOutFlg, other._stockOutFlg)) { return false; }
            if (!xSV(_oplOutFlg, other._oplOutFlg)) { return false; }
            if (!xSV(_oplOutNm, other._oplOutNm)) { return false; }
            if (!xSV(_tplOutFlg, other._tplOutFlg)) { return false; }
            if (!xSV(_tplOutNm, other._tplOutNm)) { return false; }
            if (!xSV(_mltOutFlg, other._mltOutFlg)) { return false; }
            if (!xSV(_mltOutNm, other._mltOutNm)) { return false; }
            if (!xSV(_splOutFlg, other._splOutFlg)) { return false; }
            if (!xSV(_splOutNm, other._splOutNm)) { return false; }
            if (!xSV(_pl1OutFlg, other._pl1OutFlg)) { return false; }
            if (!xSV(_pl1OutNm, other._pl1OutNm)) { return false; }
            if (!xSV(_pl1OutDt, other._pl1OutDt)) { return false; }
            if (!xSV(_plOutFlg, other._plOutFlg)) { return false; }
            if (!xSV(_plOutNm, other._plOutNm)) { return false; }
            if (!xSV(_slOutFlg, other._slOutFlg)) { return false; }
            if (!xSV(_slOutNm, other._slOutNm)) { return false; }
            if (!xSV(_pl2OutFlg, other._pl2OutFlg)) { return false; }
            if (!xSV(_pl2OutNm, other._pl2OutNm)) { return false; }
            if (!xSV(_pl2OutDt, other._pl2OutDt)) { return false; }
            if (!xSV(_caseOutFlg, other._caseOutFlg)) { return false; }
            if (!xSV(_caseOutNm, other._caseOutNm)) { return false; }
            if (!xSV(_caseOutDt, other._caseOutDt)) { return false; }
            if (!xSV(_pickingGroupNo, other._pickingGroupNo)) { return false; }
            if (!xSV(_emergencyFlg, other._emergencyFlg)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_num, other._num)) { return false; }
            if (!xSV(_packingCnt, other._packingCnt)) { return false; }
            if (!xSV(_packingCaseCnt, other._packingCaseCnt)) { return false; }
            if (!xSV(_packingMixedCnt, other._packingMixedCnt)) { return false; }
            if (!xSV(_multiPicFlg, other._multiPicFlg)) { return false; }
            if (!xSV(_multiPicFlgNm, other._multiPicFlgNm)) { return false; }
            if (!xSV(_tagOutFlg, other._tagOutFlg)) { return false; }
            if (!xSV(_tagOutFlgNm, other._tagOutFlgNm)) { return false; }
            if (!xSV(_tagOutDt, other._tagOutDt)) { return false; }
            if (!xSV(_sglRowPicFlg, other._sglRowPicFlg)) { return false; }
            if (!xSV(_sglRowPicNm, other._sglRowPicNm)) { return false; }
            if (!xSV(_casePicFlg, other._casePicFlg)) { return false; }
            if (!xSV(_casePicNm, other._casePicNm)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _workDt);
        hs = xCH(hs, _shippingDt);
        hs = xCH(hs, _pickingBatchNo);
        hs = xCH(hs, _pickingWorkNo);
        hs = xCH(hs, _supplyCustomerCd);
        hs = xCH(hs, _supplyCustomerNm);
        hs = xCH(hs, _deliveryCourseCd);
        hs = xCH(hs, _deliveryCourseNm);
        hs = xCH(hs, _carrierCd);
        hs = xCH(hs, _carrierNm);
        hs = xCH(hs, _slipNo);
        hs = xCH(hs, _lineNo);
        hs = xCH(hs, _productId);
        hs = xCH(hs, _instNum);
        hs = xCH(hs, _allocNum);
        hs = xCH(hs, _stockOutFlg);
        hs = xCH(hs, _oplOutFlg);
        hs = xCH(hs, _oplOutNm);
        hs = xCH(hs, _tplOutFlg);
        hs = xCH(hs, _tplOutNm);
        hs = xCH(hs, _mltOutFlg);
        hs = xCH(hs, _mltOutNm);
        hs = xCH(hs, _splOutFlg);
        hs = xCH(hs, _splOutNm);
        hs = xCH(hs, _pl1OutFlg);
        hs = xCH(hs, _pl1OutNm);
        hs = xCH(hs, _pl1OutDt);
        hs = xCH(hs, _plOutFlg);
        hs = xCH(hs, _plOutNm);
        hs = xCH(hs, _slOutFlg);
        hs = xCH(hs, _slOutNm);
        hs = xCH(hs, _pl2OutFlg);
        hs = xCH(hs, _pl2OutNm);
        hs = xCH(hs, _pl2OutDt);
        hs = xCH(hs, _caseOutFlg);
        hs = xCH(hs, _caseOutNm);
        hs = xCH(hs, _caseOutDt);
        hs = xCH(hs, _pickingGroupNo);
        hs = xCH(hs, _emergencyFlg);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _num);
        hs = xCH(hs, _packingCnt);
        hs = xCH(hs, _packingCaseCnt);
        hs = xCH(hs, _packingMixedCnt);
        hs = xCH(hs, _multiPicFlg);
        hs = xCH(hs, _multiPicFlgNm);
        hs = xCH(hs, _tagOutFlg);
        hs = xCH(hs, _tagOutFlgNm);
        hs = xCH(hs, _tagOutDt);
        hs = xCH(hs, _sglRowPicFlg);
        hs = xCH(hs, _sglRowPicNm);
        hs = xCH(hs, _casePicFlg);
        hs = xCH(hs, _casePicNm);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_pickingBatchNo));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_slipNo));
        sb.append(dm).append(xfND(_lineNo));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_instNum));
        sb.append(dm).append(xfND(_allocNum));
        sb.append(dm).append(xfND(_stockOutFlg));
        sb.append(dm).append(xfND(_oplOutFlg));
        sb.append(dm).append(xfND(_oplOutNm));
        sb.append(dm).append(xfND(_tplOutFlg));
        sb.append(dm).append(xfND(_tplOutNm));
        sb.append(dm).append(xfND(_mltOutFlg));
        sb.append(dm).append(xfND(_mltOutNm));
        sb.append(dm).append(xfND(_splOutFlg));
        sb.append(dm).append(xfND(_splOutNm));
        sb.append(dm).append(xfND(_pl1OutFlg));
        sb.append(dm).append(xfND(_pl1OutNm));
        sb.append(dm).append(xfND(_pl1OutDt));
        sb.append(dm).append(xfND(_plOutFlg));
        sb.append(dm).append(xfND(_plOutNm));
        sb.append(dm).append(xfND(_slOutFlg));
        sb.append(dm).append(xfND(_slOutNm));
        sb.append(dm).append(xfND(_pl2OutFlg));
        sb.append(dm).append(xfND(_pl2OutNm));
        sb.append(dm).append(xfND(_pl2OutDt));
        sb.append(dm).append(xfND(_caseOutFlg));
        sb.append(dm).append(xfND(_caseOutNm));
        sb.append(dm).append(xfND(_caseOutDt));
        sb.append(dm).append(xfND(_pickingGroupNo));
        sb.append(dm).append(xfND(_emergencyFlg));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_num));
        sb.append(dm).append(xfND(_packingCnt));
        sb.append(dm).append(xfND(_packingCaseCnt));
        sb.append(dm).append(xfND(_packingMixedCnt));
        sb.append(dm).append(xfND(_multiPicFlg));
        sb.append(dm).append(xfND(_multiPicFlgNm));
        sb.append(dm).append(xfND(_tagOutFlg));
        sb.append(dm).append(xfND(_tagOutFlgNm));
        sb.append(dm).append(xfND(_tagOutDt));
        sb.append(dm).append(xfND(_sglRowPicFlg));
        sb.append(dm).append(xfND(_sglRowPicNm));
        sb.append(dm).append(xfND(_casePicFlg));
        sb.append(dm).append(xfND(_casePicNm));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlPickingListPrint clone() {
        return (SqlPickingListPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] WORK_DT: {varchar(8)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {varchar(8)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] SHIPPING_DT: {varchar(8)} <br>
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {varchar(8)} <br>
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] PICKING_BATCH_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_BATCH_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingBatchNo() {
        checkSpecifiedProperty("pickingBatchNo");
        return convertEmptyToNull(_pickingBatchNo);
    }

    /**
     * [set] PICKING_BATCH_NO: {varchar(30)} <br>
     * @param pickingBatchNo The value of the column 'PICKING_BATCH_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingBatchNo(String pickingBatchNo) {
        registerModifiedProperty("pickingBatchNo");
        _pickingBatchNo = pickingBatchNo;
    }

    /**
     * [get] PICKING_WORK_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo() {
        checkSpecifiedProperty("pickingWorkNo");
        return convertEmptyToNull(_pickingWorkNo);
    }

    /**
     * [set] PICKING_WORK_NO: {varchar(30)} <br>
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        registerModifiedProperty("pickingWorkNo");
        _pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        checkSpecifiedProperty("supplyCustomerCd");
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        registerModifiedProperty("supplyCustomerCd");
        _supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseNm() {
        checkSpecifiedProperty("deliveryCourseNm");
        return convertEmptyToNull(_deliveryCourseNm);
    }

    /**
     * [set] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        registerModifiedProperty("deliveryCourseNm");
        _deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_CD: {varchar(30)} <br>
     * @return The value of the column 'CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {varchar(30)} <br>
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierNm() {
        checkSpecifiedProperty("carrierNm");
        return convertEmptyToNull(_carrierNm);
    }

    /**
     * [set] CARRIER_NM: {varchar(60)} <br>
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierNm(String carrierNm) {
        registerModifiedProperty("carrierNm");
        _carrierNm = carrierNm;
    }

    /**
     * [get] SLIP_NO: {int(10)} <br>
     * @return The value of the column 'SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSlipNo() {
        checkSpecifiedProperty("slipNo");
        return _slipNo;
    }

    /**
     * [set] SLIP_NO: {int(10)} <br>
     * @param slipNo The value of the column 'SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipNo(Long slipNo) {
        registerModifiedProperty("slipNo");
        _slipNo = slipNo;
    }

    /**
     * [get] LINE_NO: {int(10)} <br>
     * @return The value of the column 'LINE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLineNo() {
        checkSpecifiedProperty("lineNo");
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {int(10)} <br>
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineNo(Long lineNo) {
        registerModifiedProperty("lineNo");
        _lineNo = lineNo;
    }

    /**
     * [get] PRODUCT_ID: {int(10)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {int(10)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] INST_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'INST_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInstNum() {
        checkSpecifiedProperty("instNum");
        return _instNum;
    }

    /**
     * [set] INST_NUM: {decimal(38, 6)} <br>
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        registerModifiedProperty("instNum");
        _instNum = instNum;
    }

    /**
     * [get] ALLOC_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'ALLOC_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAllocNum() {
        checkSpecifiedProperty("allocNum");
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {decimal(38, 6)} <br>
     * @param allocNum The value of the column 'ALLOC_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        registerModifiedProperty("allocNum");
        _allocNum = allocNum;
    }

    /**
     * [get] STOCK_OUT_FLG: {char(1)} <br>
     * @return The value of the column 'STOCK_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockOutFlg() {
        checkSpecifiedProperty("stockOutFlg");
        return convertEmptyToNull(_stockOutFlg);
    }

    /**
     * [set] STOCK_OUT_FLG: {char(1)} <br>
     * @param stockOutFlg The value of the column 'STOCK_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockOutFlg(String stockOutFlg) {
        registerModifiedProperty("stockOutFlg");
        _stockOutFlg = stockOutFlg;
    }

    /**
     * [get] OPL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'OPL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOplOutFlg() {
        checkSpecifiedProperty("oplOutFlg");
        return convertEmptyToNull(_oplOutFlg);
    }

    /**
     * [set] OPL_OUT_FLG: {varchar(1)} <br>
     * @param oplOutFlg The value of the column 'OPL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOplOutFlg(String oplOutFlg) {
        registerModifiedProperty("oplOutFlg");
        _oplOutFlg = oplOutFlg;
    }

    /**
     * [get] OPL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'OPL_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getOplOutNm() {
        checkSpecifiedProperty("oplOutNm");
        return convertEmptyToNull(_oplOutNm);
    }

    /**
     * [set] OPL_OUT_NM: {int(10)} <br>
     * @param oplOutNm The value of the column 'OPL_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOplOutNm(String oplOutNm) {
        registerModifiedProperty("oplOutNm");
        _oplOutNm = oplOutNm;
    }

    /**
     * [get] TPL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'TPL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTplOutFlg() {
        checkSpecifiedProperty("tplOutFlg");
        return convertEmptyToNull(_tplOutFlg);
    }

    /**
     * [set] TPL_OUT_FLG: {varchar(1)} <br>
     * @param tplOutFlg The value of the column 'TPL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTplOutFlg(String tplOutFlg) {
        registerModifiedProperty("tplOutFlg");
        _tplOutFlg = tplOutFlg;
    }

    /**
     * [get] TPL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'TPL_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTplOutNm() {
        checkSpecifiedProperty("tplOutNm");
        return convertEmptyToNull(_tplOutNm);
    }

    /**
     * [set] TPL_OUT_NM: {int(10)} <br>
     * @param tplOutNm The value of the column 'TPL_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTplOutNm(String tplOutNm) {
        registerModifiedProperty("tplOutNm");
        _tplOutNm = tplOutNm;
    }

    /**
     * [get] MLT_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'MLT_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMltOutFlg() {
        checkSpecifiedProperty("mltOutFlg");
        return convertEmptyToNull(_mltOutFlg);
    }

    /**
     * [set] MLT_OUT_FLG: {varchar(1)} <br>
     * @param mltOutFlg The value of the column 'MLT_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMltOutFlg(String mltOutFlg) {
        registerModifiedProperty("mltOutFlg");
        _mltOutFlg = mltOutFlg;
    }

    /**
     * [get] MLT_OUT_NM: {int(10)} <br>
     * @return The value of the column 'MLT_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMltOutNm() {
        checkSpecifiedProperty("mltOutNm");
        return convertEmptyToNull(_mltOutNm);
    }

    /**
     * [set] MLT_OUT_NM: {int(10)} <br>
     * @param mltOutNm The value of the column 'MLT_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMltOutNm(String mltOutNm) {
        registerModifiedProperty("mltOutNm");
        _mltOutNm = mltOutNm;
    }

    /**
     * [get] SPL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'SPL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSplOutFlg() {
        checkSpecifiedProperty("splOutFlg");
        return convertEmptyToNull(_splOutFlg);
    }

    /**
     * [set] SPL_OUT_FLG: {varchar(1)} <br>
     * @param splOutFlg The value of the column 'SPL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSplOutFlg(String splOutFlg) {
        registerModifiedProperty("splOutFlg");
        _splOutFlg = splOutFlg;
    }

    /**
     * [get] SPL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'SPL_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSplOutNm() {
        checkSpecifiedProperty("splOutNm");
        return _splOutNm;
    }

    /**
     * [set] SPL_OUT_NM: {int(10)} <br>
     * @param splOutNm The value of the column 'SPL_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSplOutNm(Integer splOutNm) {
        registerModifiedProperty("splOutNm");
        _splOutNm = splOutNm;
    }

    /**
     * [get] PL1_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'PL1_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPl1OutFlg() {
        checkSpecifiedProperty("pl1OutFlg");
        return convertEmptyToNull(_pl1OutFlg);
    }

    /**
     * [set] PL1_OUT_FLG: {varchar(1)} <br>
     * @param pl1OutFlg The value of the column 'PL1_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl1OutFlg(String pl1OutFlg) {
        registerModifiedProperty("pl1OutFlg");
        _pl1OutFlg = pl1OutFlg;
    }

    /**
     * [get] PL1_OUT_NM: {int(10)} <br>
     * @return The value of the column 'PL1_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPl1OutNm() {
        checkSpecifiedProperty("pl1OutNm");
        return _pl1OutNm;
    }

    /**
     * [set] PL1_OUT_NM: {int(10)} <br>
     * @param pl1OutNm The value of the column 'PL1_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl1OutNm(Integer pl1OutNm) {
        registerModifiedProperty("pl1OutNm");
        _pl1OutNm = pl1OutNm;
    }

    /**
     * [get] PL1_OUT_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'PL1_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getPl1OutDt() {
        checkSpecifiedProperty("pl1OutDt");
        return _pl1OutDt;
    }

    /**
     * [set] PL1_OUT_DT: {datetime2(26, 6)} <br>
     * @param pl1OutDt The value of the column 'PL1_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl1OutDt(java.sql.Timestamp pl1OutDt) {
        registerModifiedProperty("pl1OutDt");
        _pl1OutDt = pl1OutDt;
    }

    /**
     * [get] PL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'PL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlOutFlg() {
        checkSpecifiedProperty("plOutFlg");
        return convertEmptyToNull(_plOutFlg);
    }

    /**
     * [set] PL_OUT_FLG: {varchar(1)} <br>
     * @param plOutFlg The value of the column 'PL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlOutFlg(String plOutFlg) {
        registerModifiedProperty("plOutFlg");
        _plOutFlg = plOutFlg;
    }

    /**
     * [get] PL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'PL_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlOutNm() {
        checkSpecifiedProperty("plOutNm");
        return convertEmptyToNull(_plOutNm);
    }

    /**
     * [set] PL_OUT_NM: {int(10)} <br>
     * @param plOutNm The value of the column 'PL_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlOutNm(String plOutNm) {
        registerModifiedProperty("plOutNm");
        _plOutNm = plOutNm;
    }

    /**
     * [get] SL_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'SL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlOutFlg() {
        checkSpecifiedProperty("slOutFlg");
        return convertEmptyToNull(_slOutFlg);
    }

    /**
     * [set] SL_OUT_FLG: {varchar(1)} <br>
     * @param slOutFlg The value of the column 'SL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlOutFlg(String slOutFlg) {
        registerModifiedProperty("slOutFlg");
        _slOutFlg = slOutFlg;
    }

    /**
     * [get] SL_OUT_NM: {int(10)} <br>
     * @return The value of the column 'SL_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlOutNm() {
        checkSpecifiedProperty("slOutNm");
        return convertEmptyToNull(_slOutNm);
    }

    /**
     * [set] SL_OUT_NM: {int(10)} <br>
     * @param slOutNm The value of the column 'SL_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlOutNm(String slOutNm) {
        registerModifiedProperty("slOutNm");
        _slOutNm = slOutNm;
    }

    /**
     * [get] PL2_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'PL2_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPl2OutFlg() {
        checkSpecifiedProperty("pl2OutFlg");
        return convertEmptyToNull(_pl2OutFlg);
    }

    /**
     * [set] PL2_OUT_FLG: {varchar(1)} <br>
     * @param pl2OutFlg The value of the column 'PL2_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl2OutFlg(String pl2OutFlg) {
        registerModifiedProperty("pl2OutFlg");
        _pl2OutFlg = pl2OutFlg;
    }

    /**
     * [get] PL2_OUT_NM: {int(10)} <br>
     * @return The value of the column 'PL2_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPl2OutNm() {
        checkSpecifiedProperty("pl2OutNm");
        return _pl2OutNm;
    }

    /**
     * [set] PL2_OUT_NM: {int(10)} <br>
     * @param pl2OutNm The value of the column 'PL2_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl2OutNm(Integer pl2OutNm) {
        registerModifiedProperty("pl2OutNm");
        _pl2OutNm = pl2OutNm;
    }

    /**
     * [get] PL2_OUT_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'PL2_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getPl2OutDt() {
        checkSpecifiedProperty("pl2OutDt");
        return _pl2OutDt;
    }

    /**
     * [set] PL2_OUT_DT: {datetime2(26, 6)} <br>
     * @param pl2OutDt The value of the column 'PL2_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl2OutDt(java.sql.Timestamp pl2OutDt) {
        registerModifiedProperty("pl2OutDt");
        _pl2OutDt = pl2OutDt;
    }

    /**
     * [get] CASE_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'CASE_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseOutFlg() {
        checkSpecifiedProperty("caseOutFlg");
        return convertEmptyToNull(_caseOutFlg);
    }

    /**
     * [set] CASE_OUT_FLG: {varchar(1)} <br>
     * @param caseOutFlg The value of the column 'CASE_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseOutFlg(String caseOutFlg) {
        registerModifiedProperty("caseOutFlg");
        _caseOutFlg = caseOutFlg;
    }

    /**
     * [get] CASE_OUT_NM: {int(10)} <br>
     * @return The value of the column 'CASE_OUT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseOutNm() {
        checkSpecifiedProperty("caseOutNm");
        return convertEmptyToNull(_caseOutNm);
    }

    /**
     * [set] CASE_OUT_NM: {int(10)} <br>
     * @param caseOutNm The value of the column 'CASE_OUT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseOutNm(String caseOutNm) {
        registerModifiedProperty("caseOutNm");
        _caseOutNm = caseOutNm;
    }

    /**
     * [get] CASE_OUT_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'CASE_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getCaseOutDt() {
        checkSpecifiedProperty("caseOutDt");
        return _caseOutDt;
    }

    /**
     * [set] CASE_OUT_DT: {datetime2(26, 6)} <br>
     * @param caseOutDt The value of the column 'CASE_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseOutDt(java.sql.Timestamp caseOutDt) {
        registerModifiedProperty("caseOutDt");
        _caseOutDt = caseOutDt;
    }

    /**
     * [get] PICKING_GROUP_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_GROUP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingGroupNo() {
        checkSpecifiedProperty("pickingGroupNo");
        return convertEmptyToNull(_pickingGroupNo);
    }

    /**
     * [set] PICKING_GROUP_NO: {varchar(30)} <br>
     * @param pickingGroupNo The value of the column 'PICKING_GROUP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingGroupNo(String pickingGroupNo) {
        registerModifiedProperty("pickingGroupNo");
        _pickingGroupNo = pickingGroupNo;
    }

    /**
     * [get] EMERGENCY_FLG: {char(1)} <br>
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmergencyFlg() {
        checkSpecifiedProperty("emergencyFlg");
        return convertEmptyToNull(_emergencyFlg);
    }

    /**
     * [set] EMERGENCY_FLG: {char(1)} <br>
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        registerModifiedProperty("emergencyFlg");
        _emergencyFlg = emergencyFlg;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] NUM: {int(10)} <br>
     * @return The value of the column 'NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNum() {
        checkSpecifiedProperty("num");
        return _num;
    }

    /**
     * [set] NUM: {int(10)} <br>
     * @param num The value of the column 'NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum(Long num) {
        registerModifiedProperty("num");
        _num = num;
    }

    /**
     * [get] PACKING_CNT: {int(10)} <br>
     * @return The value of the column 'PACKING_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPackingCnt() {
        checkSpecifiedProperty("packingCnt");
        return _packingCnt;
    }

    /**
     * [set] PACKING_CNT: {int(10)} <br>
     * @param packingCnt The value of the column 'PACKING_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingCnt(Long packingCnt) {
        registerModifiedProperty("packingCnt");
        _packingCnt = packingCnt;
    }

    /**
     * [get] PACKING_CASE_CNT: {int(10)} <br>
     * @return The value of the column 'PACKING_CASE_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPackingCaseCnt() {
        checkSpecifiedProperty("packingCaseCnt");
        return _packingCaseCnt;
    }

    /**
     * [set] PACKING_CASE_CNT: {int(10)} <br>
     * @param packingCaseCnt The value of the column 'PACKING_CASE_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingCaseCnt(Integer packingCaseCnt) {
        registerModifiedProperty("packingCaseCnt");
        _packingCaseCnt = packingCaseCnt;
    }

    /**
     * [get] PACKING_MIXED_CNT: {int(10)} <br>
     * @return The value of the column 'PACKING_MIXED_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPackingMixedCnt() {
        checkSpecifiedProperty("packingMixedCnt");
        return _packingMixedCnt;
    }

    /**
     * [set] PACKING_MIXED_CNT: {int(10)} <br>
     * @param packingMixedCnt The value of the column 'PACKING_MIXED_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingMixedCnt(Integer packingMixedCnt) {
        registerModifiedProperty("packingMixedCnt");
        _packingMixedCnt = packingMixedCnt;
    }

    /**
     * [get] MULTI_PIC_FLG: {char(1), classification=MultiPicFlg} <br>
     * // cls(MultiPicFlg) マルチピック計算フラグ
     * @return The value of the column 'MULTI_PIC_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMultiPicFlg() {
        checkSpecifiedProperty("multiPicFlg");
        return convertEmptyToNull(_multiPicFlg);
    }

    /**
     * [set] MULTI_PIC_FLG: {char(1), classification=MultiPicFlg} <br>
     * // cls(MultiPicFlg) マルチピック計算フラグ
     * @param multiPicFlg The value of the column 'MULTI_PIC_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMultiPicFlg(String multiPicFlg) {
        registerModifiedProperty("multiPicFlg");
        _multiPicFlg = multiPicFlg;
    }

    /**
     * [get] MULTI_PIC_FLG_NM: {int(10)} <br>
     * @return The value of the column 'MULTI_PIC_FLG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMultiPicFlgNm() {
        checkSpecifiedProperty("multiPicFlgNm");
        return _multiPicFlgNm;
    }

    /**
     * [set] MULTI_PIC_FLG_NM: {int(10)} <br>
     * @param multiPicFlgNm The value of the column 'MULTI_PIC_FLG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMultiPicFlgNm(Integer multiPicFlgNm) {
        registerModifiedProperty("multiPicFlgNm");
        _multiPicFlgNm = multiPicFlgNm;
    }

    /**
     * [get] TAG_OUT_FLG: {varchar(1)} <br>
     * @return The value of the column 'TAG_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagOutFlg() {
        checkSpecifiedProperty("tagOutFlg");
        return convertEmptyToNull(_tagOutFlg);
    }

    /**
     * [set] TAG_OUT_FLG: {varchar(1)} <br>
     * @param tagOutFlg The value of the column 'TAG_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagOutFlg(String tagOutFlg) {
        registerModifiedProperty("tagOutFlg");
        _tagOutFlg = tagOutFlg;
    }

    /**
     * [get] TAG_OUT_FLG_NM: {int(10)} <br>
     * @return The value of the column 'TAG_OUT_FLG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTagOutFlgNm() {
        checkSpecifiedProperty("tagOutFlgNm");
        return _tagOutFlgNm;
    }

    /**
     * [set] TAG_OUT_FLG_NM: {int(10)} <br>
     * @param tagOutFlgNm The value of the column 'TAG_OUT_FLG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagOutFlgNm(Integer tagOutFlgNm) {
        registerModifiedProperty("tagOutFlgNm");
        _tagOutFlgNm = tagOutFlgNm;
    }

    /**
     * [get] TAG_OUT_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'TAG_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTagOutDt() {
        checkSpecifiedProperty("tagOutDt");
        return _tagOutDt;
    }

    /**
     * [set] TAG_OUT_DT: {datetime2(26, 6)} <br>
     * @param tagOutDt The value of the column 'TAG_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagOutDt(java.sql.Timestamp tagOutDt) {
        registerModifiedProperty("tagOutDt");
        _tagOutDt = tagOutDt;
    }

    /**
     * [get] SGL_ROW_PIC_FLG: {char(1), classification=SglRowPicFlg} <br>
     * // cls(SglRowPicFlg)
     * @return The value of the column 'SGL_ROW_PIC_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSglRowPicFlg() {
        checkSpecifiedProperty("sglRowPicFlg");
        return convertEmptyToNull(_sglRowPicFlg);
    }

    /**
     * [set] SGL_ROW_PIC_FLG: {char(1), classification=SglRowPicFlg} <br>
     * // cls(SglRowPicFlg)
     * @param sglRowPicFlg The value of the column 'SGL_ROW_PIC_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSglRowPicFlg(String sglRowPicFlg) {
        registerModifiedProperty("sglRowPicFlg");
        _sglRowPicFlg = sglRowPicFlg;
    }

    /**
     * [get] SGL_ROW_PIC_NM: {int(10)} <br>
     * @return The value of the column 'SGL_ROW_PIC_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSglRowPicNm() {
        checkSpecifiedProperty("sglRowPicNm");
        return convertEmptyToNull(_sglRowPicNm);
    }

    /**
     * [set] SGL_ROW_PIC_NM: {int(10)} <br>
     * @param sglRowPicNm The value of the column 'SGL_ROW_PIC_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSglRowPicNm(String sglRowPicNm) {
        registerModifiedProperty("sglRowPicNm");
        _sglRowPicNm = sglRowPicNm;
    }

    /**
     * [get] CASE_PIC_FLG: {varchar(1)} <br>
     * @return The value of the column 'CASE_PIC_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasePicFlg() {
        checkSpecifiedProperty("casePicFlg");
        return convertEmptyToNull(_casePicFlg);
    }

    /**
     * [set] CASE_PIC_FLG: {varchar(1)} <br>
     * @param casePicFlg The value of the column 'CASE_PIC_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasePicFlg(String casePicFlg) {
        registerModifiedProperty("casePicFlg");
        _casePicFlg = casePicFlg;
    }

    /**
     * [get] CASE_PIC_NM: {int(10)} <br>
     * @return The value of the column 'CASE_PIC_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasePicNm() {
        checkSpecifiedProperty("casePicNm");
        return convertEmptyToNull(_casePicNm);
    }

    /**
     * [set] CASE_PIC_NM: {int(10)} <br>
     * @param casePicNm The value of the column 'CASE_PIC_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasePicNm(String casePicNm) {
        registerModifiedProperty("casePicNm");
        _casePicNm = casePicNm;
    }
}
