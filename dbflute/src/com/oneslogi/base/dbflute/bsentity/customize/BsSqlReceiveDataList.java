package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlReceiveDataList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     receive_plan_h_id, receive_plan_b_id, receive_status, product_id, product_cd, plan_lot, plan_limit_dt, plan_location_cd, plan_store_label_no, plan_num, store_record_h_id, store_record_b_id, lot, limit_dt, store_dt, store_num, store_location_cd, product_nm, product_abbr, jan_cd, receive_status_nm, receive_plan_dt, plan_client_receive_no, receive_slip_no, line_no, center_id, client_id, plan_supplier_cd, store_supplier_cd
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
 * Long receivePlanHId = entity.getReceivePlanHId();
 * Long receivePlanBId = entity.getReceivePlanBId();
 * String receiveStatus = entity.getReceiveStatus();
 * Long productId = entity.getProductId();
 * String productCd = entity.getProductCd();
 * String planLot = entity.getPlanLot();
 * String planLimitDt = entity.getPlanLimitDt();
 * String planLocationCd = entity.getPlanLocationCd();
 * String planStoreLabelNo = entity.getPlanStoreLabelNo();
 * java.math.BigDecimal planNum = entity.getPlanNum();
 * Long storeRecordHId = entity.getStoreRecordHId();
 * Long storeRecordBId = entity.getStoreRecordBId();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * String storeDt = entity.getStoreDt();
 * java.math.BigDecimal storeNum = entity.getStoreNum();
 * String storeLocationCd = entity.getStoreLocationCd();
 * String productNm = entity.getProductNm();
 * String productAbbr = entity.getProductAbbr();
 * String janCd = entity.getJanCd();
 * String receiveStatusNm = entity.getReceiveStatusNm();
 * String receivePlanDt = entity.getReceivePlanDt();
 * String planClientReceiveNo = entity.getPlanClientReceiveNo();
 * String receiveSlipNo = entity.getReceiveSlipNo();
 * Long lineNo = entity.getLineNo();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String planSupplierCd = entity.getPlanSupplierCd();
 * String storeSupplierCd = entity.getStoreSupplierCd();
 * entity.setReceivePlanHId(receivePlanHId);
 * entity.setReceivePlanBId(receivePlanBId);
 * entity.setReceiveStatus(receiveStatus);
 * entity.setProductId(productId);
 * entity.setProductCd(productCd);
 * entity.setPlanLot(planLot);
 * entity.setPlanLimitDt(planLimitDt);
 * entity.setPlanLocationCd(planLocationCd);
 * entity.setPlanStoreLabelNo(planStoreLabelNo);
 * entity.setPlanNum(planNum);
 * entity.setStoreRecordHId(storeRecordHId);
 * entity.setStoreRecordBId(storeRecordBId);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setStoreDt(storeDt);
 * entity.setStoreNum(storeNum);
 * entity.setStoreLocationCd(storeLocationCd);
 * entity.setProductNm(productNm);
 * entity.setProductAbbr(productAbbr);
 * entity.setJanCd(janCd);
 * entity.setReceiveStatusNm(receiveStatusNm);
 * entity.setReceivePlanDt(receivePlanDt);
 * entity.setPlanClientReceiveNo(planClientReceiveNo);
 * entity.setReceiveSlipNo(receiveSlipNo);
 * entity.setLineNo(lineNo);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setPlanSupplierCd(planSupplierCd);
 * entity.setStoreSupplierCd(storeSupplierCd);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlReceiveDataList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** receive_plan_h_id: {bigint(19)} */
    protected Long _receivePlanHId;

    /** receive_plan_b_id: {bigint(19)} */
    protected Long _receivePlanBId;

    /** receive_status: {varchar(30)} */
    protected String _receiveStatus;

    /** product_id: {bigint(19)} */
    protected Long _productId;

    /** product_cd: {varchar(100)} */
    protected String _productCd;

    /** plan_lot: {varchar(30)} */
    protected String _planLot;

    /** plan_limit_dt: {varchar(8)} */
    protected String _planLimitDt;

    /** plan_location_cd: {varchar(30)} */
    protected String _planLocationCd;

    /** plan_store_label_no: {varchar(30)} */
    protected String _planStoreLabelNo;

    /** plan_num: {decimal(16, 6)} */
    protected java.math.BigDecimal _planNum;

    /** store_record_h_id: {bigint(19)} */
    protected Long _storeRecordHId;

    /** store_record_b_id: {bigint(19)} */
    protected Long _storeRecordBId;

    /** lot: {varchar(30)} */
    protected String _lot;

    /** limit_dt: {varchar(8)} */
    protected String _limitDt;

    /** store_dt: {varchar(8)} */
    protected String _storeDt;

    /** store_num: {decimal(16, 6)} */
    protected java.math.BigDecimal _storeNum;

    /** store_location_cd: {varchar(30)} */
    protected String _storeLocationCd;

    /** product_nm: {varchar(255)} */
    protected String _productNm;

    /** product_abbr: {varchar(60)} */
    protected String _productAbbr;

    /** jan_cd: {varchar(30)} */
    protected String _janCd;

    /** receive_status_nm: {varchar(100)} */
    protected String _receiveStatusNm;

    /** receive_plan_dt: {varchar(8)} */
    protected String _receivePlanDt;

    /** plan_client_receive_no: {varchar(30)} */
    protected String _planClientReceiveNo;

    /** receive_slip_no: {varchar(30)} */
    protected String _receiveSlipNo;

    /** line_no: {bigint(19)} */
    protected Long _lineNo;

    /** center_id: {bigint(19)} */
    protected Long _centerId;

    /** client_id: {bigint(19)} */
    protected Long _clientId;

    /** plan_supplier_cd: {varchar(30)} */
    protected String _planSupplierCd;

    /** store_supplier_cd: {varchar(30)} */
    protected String _storeSupplierCd;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlReceiveDataListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlReceiveDataList";
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
        if (obj instanceof BsSqlReceiveDataList) {
            BsSqlReceiveDataList other = (BsSqlReceiveDataList)obj;
            if (!xSV(_receivePlanHId, other._receivePlanHId)) { return false; }
            if (!xSV(_receivePlanBId, other._receivePlanBId)) { return false; }
            if (!xSV(_receiveStatus, other._receiveStatus)) { return false; }
            if (!xSV(_productId, other._productId)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_planLot, other._planLot)) { return false; }
            if (!xSV(_planLimitDt, other._planLimitDt)) { return false; }
            if (!xSV(_planLocationCd, other._planLocationCd)) { return false; }
            if (!xSV(_planStoreLabelNo, other._planStoreLabelNo)) { return false; }
            if (!xSV(_planNum, other._planNum)) { return false; }
            if (!xSV(_storeRecordHId, other._storeRecordHId)) { return false; }
            if (!xSV(_storeRecordBId, other._storeRecordBId)) { return false; }
            if (!xSV(_lot, other._lot)) { return false; }
            if (!xSV(_limitDt, other._limitDt)) { return false; }
            if (!xSV(_storeDt, other._storeDt)) { return false; }
            if (!xSV(_storeNum, other._storeNum)) { return false; }
            if (!xSV(_storeLocationCd, other._storeLocationCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_janCd, other._janCd)) { return false; }
            if (!xSV(_receiveStatusNm, other._receiveStatusNm)) { return false; }
            if (!xSV(_receivePlanDt, other._receivePlanDt)) { return false; }
            if (!xSV(_planClientReceiveNo, other._planClientReceiveNo)) { return false; }
            if (!xSV(_receiveSlipNo, other._receiveSlipNo)) { return false; }
            if (!xSV(_lineNo, other._lineNo)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_planSupplierCd, other._planSupplierCd)) { return false; }
            if (!xSV(_storeSupplierCd, other._storeSupplierCd)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receivePlanHId);
        hs = xCH(hs, _receivePlanBId);
        hs = xCH(hs, _receiveStatus);
        hs = xCH(hs, _productId);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _planLot);
        hs = xCH(hs, _planLimitDt);
        hs = xCH(hs, _planLocationCd);
        hs = xCH(hs, _planStoreLabelNo);
        hs = xCH(hs, _planNum);
        hs = xCH(hs, _storeRecordHId);
        hs = xCH(hs, _storeRecordBId);
        hs = xCH(hs, _lot);
        hs = xCH(hs, _limitDt);
        hs = xCH(hs, _storeDt);
        hs = xCH(hs, _storeNum);
        hs = xCH(hs, _storeLocationCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _janCd);
        hs = xCH(hs, _receiveStatusNm);
        hs = xCH(hs, _receivePlanDt);
        hs = xCH(hs, _planClientReceiveNo);
        hs = xCH(hs, _receiveSlipNo);
        hs = xCH(hs, _lineNo);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _planSupplierCd);
        hs = xCH(hs, _storeSupplierCd);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receivePlanHId));
        sb.append(dm).append(xfND(_receivePlanBId));
        sb.append(dm).append(xfND(_receiveStatus));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_planLot));
        sb.append(dm).append(xfND(_planLimitDt));
        sb.append(dm).append(xfND(_planLocationCd));
        sb.append(dm).append(xfND(_planStoreLabelNo));
        sb.append(dm).append(xfND(_planNum));
        sb.append(dm).append(xfND(_storeRecordHId));
        sb.append(dm).append(xfND(_storeRecordBId));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_storeNum));
        sb.append(dm).append(xfND(_storeLocationCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_receiveStatusNm));
        sb.append(dm).append(xfND(_receivePlanDt));
        sb.append(dm).append(xfND(_planClientReceiveNo));
        sb.append(dm).append(xfND(_receiveSlipNo));
        sb.append(dm).append(xfND(_lineNo));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_planSupplierCd));
        sb.append(dm).append(xfND(_storeSupplierCd));
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
    public SqlReceiveDataList clone() {
        return (SqlReceiveDataList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] receive_plan_h_id: {bigint(19)} <br>
     * @return The value of the column 'receive_plan_h_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceivePlanHId() {
        checkSpecifiedProperty("receivePlanHId");
        return _receivePlanHId;
    }

    /**
     * [set] receive_plan_h_id: {bigint(19)} <br>
     * @param receivePlanHId The value of the column 'receive_plan_h_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        registerModifiedProperty("receivePlanHId");
        _receivePlanHId = receivePlanHId;
    }

    /**
     * [get] receive_plan_b_id: {bigint(19)} <br>
     * @return The value of the column 'receive_plan_b_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceivePlanBId() {
        checkSpecifiedProperty("receivePlanBId");
        return _receivePlanBId;
    }

    /**
     * [set] receive_plan_b_id: {bigint(19)} <br>
     * @param receivePlanBId The value of the column 'receive_plan_b_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        registerModifiedProperty("receivePlanBId");
        _receivePlanBId = receivePlanBId;
    }

    /**
     * [get] receive_status: {varchar(30)} <br>
     * @return The value of the column 'receive_status'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveStatus() {
        checkSpecifiedProperty("receiveStatus");
        return convertEmptyToNull(_receiveStatus);
    }

    /**
     * [set] receive_status: {varchar(30)} <br>
     * @param receiveStatus The value of the column 'receive_status'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveStatus(String receiveStatus) {
        registerModifiedProperty("receiveStatus");
        _receiveStatus = receiveStatus;
    }

    /**
     * [get] product_id: {bigint(19)} <br>
     * @return The value of the column 'product_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] product_id: {bigint(19)} <br>
     * @param productId The value of the column 'product_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] product_cd: {varchar(100)} <br>
     * @return The value of the column 'product_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] product_cd: {varchar(100)} <br>
     * @param productCd The value of the column 'product_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] plan_lot: {varchar(30)} <br>
     * @return The value of the column 'plan_lot'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanLot() {
        checkSpecifiedProperty("planLot");
        return convertEmptyToNull(_planLot);
    }

    /**
     * [set] plan_lot: {varchar(30)} <br>
     * @param planLot The value of the column 'plan_lot'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanLot(String planLot) {
        registerModifiedProperty("planLot");
        _planLot = planLot;
    }

    /**
     * [get] plan_limit_dt: {varchar(8)} <br>
     * @return The value of the column 'plan_limit_dt'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanLimitDt() {
        checkSpecifiedProperty("planLimitDt");
        return convertEmptyToNull(_planLimitDt);
    }

    /**
     * [set] plan_limit_dt: {varchar(8)} <br>
     * @param planLimitDt The value of the column 'plan_limit_dt'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanLimitDt(String planLimitDt) {
        registerModifiedProperty("planLimitDt");
        _planLimitDt = planLimitDt;
    }

    /**
     * [get] plan_location_cd: {varchar(30)} <br>
     * @return The value of the column 'plan_location_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanLocationCd() {
        checkSpecifiedProperty("planLocationCd");
        return convertEmptyToNull(_planLocationCd);
    }

    /**
     * [set] plan_location_cd: {varchar(30)} <br>
     * @param planLocationCd The value of the column 'plan_location_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanLocationCd(String planLocationCd) {
        registerModifiedProperty("planLocationCd");
        _planLocationCd = planLocationCd;
    }

    /**
     * [get] plan_store_label_no: {varchar(30)} <br>
     * @return The value of the column 'plan_store_label_no'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanStoreLabelNo() {
        checkSpecifiedProperty("planStoreLabelNo");
        return convertEmptyToNull(_planStoreLabelNo);
    }

    /**
     * [set] plan_store_label_no: {varchar(30)} <br>
     * @param planStoreLabelNo The value of the column 'plan_store_label_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanStoreLabelNo(String planStoreLabelNo) {
        registerModifiedProperty("planStoreLabelNo");
        _planStoreLabelNo = planStoreLabelNo;
    }

    /**
     * [get] plan_num: {decimal(16, 6)} <br>
     * @return The value of the column 'plan_num'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPlanNum() {
        checkSpecifiedProperty("planNum");
        return _planNum;
    }

    /**
     * [set] plan_num: {decimal(16, 6)} <br>
     * @param planNum The value of the column 'plan_num'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanNum(java.math.BigDecimal planNum) {
        registerModifiedProperty("planNum");
        _planNum = planNum;
    }

    /**
     * [get] store_record_h_id: {bigint(19)} <br>
     * @return The value of the column 'store_record_h_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStoreRecordHId() {
        checkSpecifiedProperty("storeRecordHId");
        return _storeRecordHId;
    }

    /**
     * [set] store_record_h_id: {bigint(19)} <br>
     * @param storeRecordHId The value of the column 'store_record_h_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreRecordHId(Long storeRecordHId) {
        registerModifiedProperty("storeRecordHId");
        _storeRecordHId = storeRecordHId;
    }

    /**
     * [get] store_record_b_id: {bigint(19)} <br>
     * @return The value of the column 'store_record_b_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStoreRecordBId() {
        checkSpecifiedProperty("storeRecordBId");
        return _storeRecordBId;
    }

    /**
     * [set] store_record_b_id: {bigint(19)} <br>
     * @param storeRecordBId The value of the column 'store_record_b_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreRecordBId(Long storeRecordBId) {
        registerModifiedProperty("storeRecordBId");
        _storeRecordBId = storeRecordBId;
    }

    /**
     * [get] lot: {varchar(30)} <br>
     * @return The value of the column 'lot'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] lot: {varchar(30)} <br>
     * @param lot The value of the column 'lot'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] limit_dt: {varchar(8)} <br>
     * @return The value of the column 'limit_dt'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] limit_dt: {varchar(8)} <br>
     * @param limitDt The value of the column 'limit_dt'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] store_dt: {varchar(8)} <br>
     * @return The value of the column 'store_dt'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreDt() {
        checkSpecifiedProperty("storeDt");
        return convertEmptyToNull(_storeDt);
    }

    /**
     * [set] store_dt: {varchar(8)} <br>
     * @param storeDt The value of the column 'store_dt'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreDt(String storeDt) {
        registerModifiedProperty("storeDt");
        _storeDt = storeDt;
    }

    /**
     * [get] store_num: {decimal(16, 6)} <br>
     * @return The value of the column 'store_num'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getStoreNum() {
        checkSpecifiedProperty("storeNum");
        return _storeNum;
    }

    /**
     * [set] store_num: {decimal(16, 6)} <br>
     * @param storeNum The value of the column 'store_num'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreNum(java.math.BigDecimal storeNum) {
        registerModifiedProperty("storeNum");
        _storeNum = storeNum;
    }

    /**
     * [get] store_location_cd: {varchar(30)} <br>
     * @return The value of the column 'store_location_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreLocationCd() {
        checkSpecifiedProperty("storeLocationCd");
        return convertEmptyToNull(_storeLocationCd);
    }

    /**
     * [set] store_location_cd: {varchar(30)} <br>
     * @param storeLocationCd The value of the column 'store_location_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreLocationCd(String storeLocationCd) {
        registerModifiedProperty("storeLocationCd");
        _storeLocationCd = storeLocationCd;
    }

    /**
     * [get] product_nm: {varchar(255)} <br>
     * @return The value of the column 'product_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] product_nm: {varchar(255)} <br>
     * @param productNm The value of the column 'product_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] product_abbr: {varchar(60)} <br>
     * @return The value of the column 'product_abbr'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] product_abbr: {varchar(60)} <br>
     * @param productAbbr The value of the column 'product_abbr'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
    }

    /**
     * [get] jan_cd: {varchar(30)} <br>
     * @return The value of the column 'jan_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] jan_cd: {varchar(30)} <br>
     * @param janCd The value of the column 'jan_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] receive_status_nm: {varchar(100)} <br>
     * @return The value of the column 'receive_status_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveStatusNm() {
        checkSpecifiedProperty("receiveStatusNm");
        return convertEmptyToNull(_receiveStatusNm);
    }

    /**
     * [set] receive_status_nm: {varchar(100)} <br>
     * @param receiveStatusNm The value of the column 'receive_status_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveStatusNm(String receiveStatusNm) {
        registerModifiedProperty("receiveStatusNm");
        _receiveStatusNm = receiveStatusNm;
    }

    /**
     * [get] receive_plan_dt: {varchar(8)} <br>
     * @return The value of the column 'receive_plan_dt'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivePlanDt() {
        checkSpecifiedProperty("receivePlanDt");
        return convertEmptyToNull(_receivePlanDt);
    }

    /**
     * [set] receive_plan_dt: {varchar(8)} <br>
     * @param receivePlanDt The value of the column 'receive_plan_dt'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        registerModifiedProperty("receivePlanDt");
        _receivePlanDt = receivePlanDt;
    }

    /**
     * [get] plan_client_receive_no: {varchar(30)} <br>
     * @return The value of the column 'plan_client_receive_no'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanClientReceiveNo() {
        checkSpecifiedProperty("planClientReceiveNo");
        return convertEmptyToNull(_planClientReceiveNo);
    }

    /**
     * [set] plan_client_receive_no: {varchar(30)} <br>
     * @param planClientReceiveNo The value of the column 'plan_client_receive_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanClientReceiveNo(String planClientReceiveNo) {
        registerModifiedProperty("planClientReceiveNo");
        _planClientReceiveNo = planClientReceiveNo;
    }

    /**
     * [get] receive_slip_no: {varchar(30)} <br>
     * @return The value of the column 'receive_slip_no'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveSlipNo() {
        checkSpecifiedProperty("receiveSlipNo");
        return convertEmptyToNull(_receiveSlipNo);
    }

    /**
     * [set] receive_slip_no: {varchar(30)} <br>
     * @param receiveSlipNo The value of the column 'receive_slip_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveSlipNo(String receiveSlipNo) {
        registerModifiedProperty("receiveSlipNo");
        _receiveSlipNo = receiveSlipNo;
    }

    /**
     * [get] line_no: {bigint(19)} <br>
     * @return The value of the column 'line_no'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLineNo() {
        checkSpecifiedProperty("lineNo");
        return _lineNo;
    }

    /**
     * [set] line_no: {bigint(19)} <br>
     * @param lineNo The value of the column 'line_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineNo(Long lineNo) {
        registerModifiedProperty("lineNo");
        _lineNo = lineNo;
    }

    /**
     * [get] center_id: {bigint(19)} <br>
     * @return The value of the column 'center_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] center_id: {bigint(19)} <br>
     * @param centerId The value of the column 'center_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] client_id: {bigint(19)} <br>
     * @return The value of the column 'client_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] client_id: {bigint(19)} <br>
     * @param clientId The value of the column 'client_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] plan_supplier_cd: {varchar(30)} <br>
     * @return The value of the column 'plan_supplier_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanSupplierCd() {
        checkSpecifiedProperty("planSupplierCd");
        return convertEmptyToNull(_planSupplierCd);
    }

    /**
     * [set] plan_supplier_cd: {varchar(30)} <br>
     * @param planSupplierCd The value of the column 'plan_supplier_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanSupplierCd(String planSupplierCd) {
        registerModifiedProperty("planSupplierCd");
        _planSupplierCd = planSupplierCd;
    }

    /**
     * [get] store_supplier_cd: {varchar(30)} <br>
     * @return The value of the column 'store_supplier_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreSupplierCd() {
        checkSpecifiedProperty("storeSupplierCd");
        return convertEmptyToNull(_storeSupplierCd);
    }

    /**
     * [set] store_supplier_cd: {varchar(30)} <br>
     * @param storeSupplierCd The value of the column 'store_supplier_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreSupplierCd(String storeSupplierCd) {
        registerModifiedProperty("storeSupplierCd");
        _storeSupplierCd = storeSupplierCd;
    }
}
