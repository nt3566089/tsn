package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRPALLETDETAIL as TABLE. <br>
 * パレットはり紙情報明細
 * <pre>
 * [primary-key]
 *     TRPALLETDETAIL_ID
 *
 * [column]
 *     TRPALLETDETAIL_ID, CENTER_ID, CLIENT_ID, PALLET_DETAIL_KEY, INOUT_TYPE, TRPALLET_ID, BASE_PALLET_NO, DIV_PALLET_NO, WORK_TYPE, WORK_KEY, REGISTRATION_DATE, WORK_DATE, PRODUCT_ID, PRODUCT_CD, DESIGN_FLG, LIMIT_DATE, FIRM_CARRY_NO, BAT_ARTICLE_SIGN, MOVE_B_LLOCATION_ID, MOVE_B_LOCATION_CD, MOVE_A_LOCATION_ID, MOVE_A_LOCATION_CD, INST_NUM, REST_QTY_CASE, REST_QTY_BOWL, REST_QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRPALLETDETAIL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrpalletdetailDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trpalletdetailId;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** PALLET_DETAIL_KEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _palletDetailKey;

    /** INOUT_TYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _inoutType;

    /** TRPALLET_ID: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _trpalletId;

    /** BASE_PALLET_NO: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _basePalletNo;

    /** DIV_PALLET_NO: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _divPalletNo;

    /** WORK_TYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _workType;

    /** WORK_KEY: {bigint(19)} */
    @JsonKey
    protected Long _workKey;

    /** REGISTRATION_DATE: {varchar(8)} */
    @JsonKey
    protected String _registrationDate;

    /** WORK_DATE: {NotNull, datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _workDate;

    /** PRODUCT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** DESIGN_FLG: {varchar(30)} */
    @JsonKey
    protected String _designFlg;

    /** LIMIT_DATE: {varchar(8)} */
    @JsonKey
    protected String _limitDate;

    /** FIRM_CARRY_NO: {varchar(30)} */
    @JsonKey
    protected String _firmCarryNo;

    /** BAT_ARTICLE_SIGN: {varchar(30)} */
    @JsonKey
    protected String _batArticleSign;

    /** MOVE_B_LLOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _moveBLlocationId;

    /** MOVE_B_LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _moveBLocationCd;

    /** MOVE_A_LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _moveALocationId;

    /** MOVE_A_LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _moveALocationCd;

    /** INST_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _instNum;

    /** REST_QTY_CASE: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _restQtyCase;

    /** REST_QTY_BOWL: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _restQtyBowl;

    /** REST_QTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _restQty;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrpalletdetailDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrpalletdetailDto)) { return false; }
        final BsTTrpalletdetailDto otherEntity = (BsTTrpalletdetailDto)other;
        if (!helpComparingValue(getTrpalletdetailId(), otherEntity.getTrpalletdetailId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRPALLETDETAIL");
        result = xCH(result, getTrpalletdetailId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getTrpalletdetailId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getPalletDetailKey());
        sb.append(c).append(getInoutType());
        sb.append(c).append(getTrpalletId());
        sb.append(c).append(getBasePalletNo());
        sb.append(c).append(getDivPalletNo());
        sb.append(c).append(getWorkType());
        sb.append(c).append(getWorkKey());
        sb.append(c).append(getRegistrationDate());
        sb.append(c).append(getWorkDate());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getDesignFlg());
        sb.append(c).append(getLimitDate());
        sb.append(c).append(getFirmCarryNo());
        sb.append(c).append(getBatArticleSign());
        sb.append(c).append(getMoveBLlocationId());
        sb.append(c).append(getMoveBLocationCd());
        sb.append(c).append(getMoveALocationId());
        sb.append(c).append(getMoveALocationCd());
        sb.append(c).append(getInstNum());
        sb.append(c).append(getRestQtyCase());
        sb.append(c).append(getRestQtyBowl());
        sb.append(c).append(getRestQty());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレットはり紙情報明細ID
     * @return The value of the column 'TRPALLETDETAIL_ID'. (NullAllowed)
     */
    public Long getTrpalletdetailId() {
        return _trpalletdetailId;
    }

    /**
     * [set] TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレットはり紙情報明細ID
     * @param trpalletdetailId The value of the column 'TRPALLETDETAIL_ID'. (NullAllowed)
     */
    public void setTrpalletdetailId(Long trpalletdetailId) {
        __modifiedProperties.add("trpalletdetailId");
        this._trpalletdetailId = trpalletdetailId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] PALLET_DETAIL_KEY: {NotNull, bigint(19)} <br>
     * パレットはり紙明細キー
     * @return The value of the column 'PALLET_DETAIL_KEY'. (NullAllowed)
     */
    public Long getPalletDetailKey() {
        return _palletDetailKey;
    }

    /**
     * [set] PALLET_DETAIL_KEY: {NotNull, bigint(19)} <br>
     * パレットはり紙明細キー
     * @param palletDetailKey The value of the column 'PALLET_DETAIL_KEY'. (NullAllowed)
     */
    public void setPalletDetailKey(Long palletDetailKey) {
        __modifiedProperties.add("palletDetailKey");
        this._palletDetailKey = palletDetailKey;
    }

    /**
     * [get] INOUT_TYPE: {NotNull, varchar(30)} <br>
     * 入出庫区分
     * @return The value of the column 'INOUT_TYPE'. (NullAllowed)
     */
    public String getInoutType() {
        return _inoutType;
    }

    /**
     * [set] INOUT_TYPE: {NotNull, varchar(30)} <br>
     * 入出庫区分
     * @param inoutType The value of the column 'INOUT_TYPE'. (NullAllowed)
     */
    public void setInoutType(String inoutType) {
        __modifiedProperties.add("inoutType");
        this._inoutType = inoutType;
    }

    /**
     * [get] TRPALLET_ID: {IX, NotNull, bigint(19)} <br>
     * パレットはり紙情報ID
     * @return The value of the column 'TRPALLET_ID'. (NullAllowed)
     */
    public Long getTrpalletId() {
        return _trpalletId;
    }

    /**
     * [set] TRPALLET_ID: {IX, NotNull, bigint(19)} <br>
     * パレットはり紙情報ID
     * @param trpalletId The value of the column 'TRPALLET_ID'. (NullAllowed)
     */
    public void setTrpalletId(Long trpalletId) {
        __modifiedProperties.add("trpalletId");
        this._trpalletId = trpalletId;
    }

    /**
     * [get] BASE_PALLET_NO: {decimal(16, 6)} <br>
     * パレット管理番号(親)
     * @return The value of the column 'BASE_PALLET_NO'. (NullAllowed)
     */
    public java.math.BigDecimal getBasePalletNo() {
        return _basePalletNo;
    }

    /**
     * [set] BASE_PALLET_NO: {decimal(16, 6)} <br>
     * パレット管理番号(親)
     * @param basePalletNo The value of the column 'BASE_PALLET_NO'. (NullAllowed)
     */
    public void setBasePalletNo(java.math.BigDecimal basePalletNo) {
        __modifiedProperties.add("basePalletNo");
        this._basePalletNo = basePalletNo;
    }

    /**
     * [get] DIV_PALLET_NO: {decimal(16, 6)} <br>
     * パレット管理番号(子)
     * @return The value of the column 'DIV_PALLET_NO'. (NullAllowed)
     */
    public java.math.BigDecimal getDivPalletNo() {
        return _divPalletNo;
    }

    /**
     * [set] DIV_PALLET_NO: {decimal(16, 6)} <br>
     * パレット管理番号(子)
     * @param divPalletNo The value of the column 'DIV_PALLET_NO'. (NullAllowed)
     */
    public void setDivPalletNo(java.math.BigDecimal divPalletNo) {
        __modifiedProperties.add("divPalletNo");
        this._divPalletNo = divPalletNo;
    }

    /**
     * [get] WORK_TYPE: {NotNull, varchar(30)} <br>
     * 作業区分
     * @return The value of the column 'WORK_TYPE'. (NullAllowed)
     */
    public String getWorkType() {
        return _workType;
    }

    /**
     * [set] WORK_TYPE: {NotNull, varchar(30)} <br>
     * 作業区分
     * @param workType The value of the column 'WORK_TYPE'. (NullAllowed)
     */
    public void setWorkType(String workType) {
        __modifiedProperties.add("workType");
        this._workType = workType;
    }

    /**
     * [get] WORK_KEY: {bigint(19)} <br>
     * 指示キー
     * @return The value of the column 'WORK_KEY'. (NullAllowed)
     */
    public Long getWorkKey() {
        return _workKey;
    }

    /**
     * [set] WORK_KEY: {bigint(19)} <br>
     * 指示キー
     * @param workKey The value of the column 'WORK_KEY'. (NullAllowed)
     */
    public void setWorkKey(Long workKey) {
        __modifiedProperties.add("workKey");
        this._workKey = workKey;
    }

    /**
     * [get] REGISTRATION_DATE: {varchar(8)} <br>
     * 登録日
     * @return The value of the column 'REGISTRATION_DATE'. (NullAllowed)
     */
    public String getRegistrationDate() {
        return _registrationDate;
    }

    /**
     * [set] REGISTRATION_DATE: {varchar(8)} <br>
     * 登録日
     * @param registrationDate The value of the column 'REGISTRATION_DATE'. (NullAllowed)
     */
    public void setRegistrationDate(String registrationDate) {
        __modifiedProperties.add("registrationDate");
        this._registrationDate = registrationDate;
    }

    /**
     * [get] WORK_DATE: {NotNull, datetime2(26, 6)} <br>
     * 作業日時
     * @return The value of the column 'WORK_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getWorkDate() {
        return _workDate;
    }

    /**
     * [set] WORK_DATE: {NotNull, datetime2(26, 6)} <br>
     * 作業日時
     * @param workDate The value of the column 'WORK_DATE'. (NullAllowed)
     */
    public void setWorkDate(java.sql.Timestamp workDate) {
        __modifiedProperties.add("workDate");
        this._workDate = workDate;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_FLG'. (NullAllowed)
     */
    public String getDesignFlg() {
        return _designFlg;
    }

    /**
     * [set] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @param designFlg The value of the column 'DESIGN_FLG'. (NullAllowed)
     */
    public void setDesignFlg(String designFlg) {
        __modifiedProperties.add("designFlg");
        this._designFlg = designFlg;
    }

    /**
     * [get] LIMIT_DATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LIMIT_DATE'. (NullAllowed)
     */
    public String getLimitDate() {
        return _limitDate;
    }

    /**
     * [set] LIMIT_DATE: {varchar(8)} <br>
     * 製造年月日
     * @param limitDate The value of the column 'LIMIT_DATE'. (NullAllowed)
     */
    public void setLimitDate(String limitDate) {
        __modifiedProperties.add("limitDate");
        this._limitDate = limitDate;
    }

    /**
     * [get] FIRM_CARRY_NO: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRM_CARRY_NO'. (NullAllowed)
     */
    public String getFirmCarryNo() {
        return _firmCarryNo;
    }

    /**
     * [set] FIRM_CARRY_NO: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmCarryNo The value of the column 'FIRM_CARRY_NO'. (NullAllowed)
     */
    public void setFirmCarryNo(String firmCarryNo) {
        __modifiedProperties.add("firmCarryNo");
        this._firmCarryNo = firmCarryNo;
    }

    /**
     * [get] BAT_ARTICLE_SIGN: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'BAT_ARTICLE_SIGN'. (NullAllowed)
     */
    public String getBatArticleSign() {
        return _batArticleSign;
    }

    /**
     * [set] BAT_ARTICLE_SIGN: {varchar(30)} <br>
     * 製造記号
     * @param batArticleSign The value of the column 'BAT_ARTICLE_SIGN'. (NullAllowed)
     */
    public void setBatArticleSign(String batArticleSign) {
        __modifiedProperties.add("batArticleSign");
        this._batArticleSign = batArticleSign;
    }

    /**
     * [get] MOVE_B_LLOCATION_ID: {bigint(19)} <br>
     * 移動元ロケーションID
     * @return The value of the column 'MOVE_B_LLOCATION_ID'. (NullAllowed)
     */
    public Long getMoveBLlocationId() {
        return _moveBLlocationId;
    }

    /**
     * [set] MOVE_B_LLOCATION_ID: {bigint(19)} <br>
     * 移動元ロケーションID
     * @param moveBLlocationId The value of the column 'MOVE_B_LLOCATION_ID'. (NullAllowed)
     */
    public void setMoveBLlocationId(Long moveBLlocationId) {
        __modifiedProperties.add("moveBLlocationId");
        this._moveBLlocationId = moveBLlocationId;
    }

    /**
     * [get] MOVE_B_LOCATION_CD: {varchar(30)} <br>
     * 移動元
     * @return The value of the column 'MOVE_B_LOCATION_CD'. (NullAllowed)
     */
    public String getMoveBLocationCd() {
        return _moveBLocationCd;
    }

    /**
     * [set] MOVE_B_LOCATION_CD: {varchar(30)} <br>
     * 移動元
     * @param moveBLocationCd The value of the column 'MOVE_B_LOCATION_CD'. (NullAllowed)
     */
    public void setMoveBLocationCd(String moveBLocationCd) {
        __modifiedProperties.add("moveBLocationCd");
        this._moveBLocationCd = moveBLocationCd;
    }

    /**
     * [get] MOVE_A_LOCATION_ID: {bigint(19)} <br>
     * 移動先ロケーションID
     * @return The value of the column 'MOVE_A_LOCATION_ID'. (NullAllowed)
     */
    public Long getMoveALocationId() {
        return _moveALocationId;
    }

    /**
     * [set] MOVE_A_LOCATION_ID: {bigint(19)} <br>
     * 移動先ロケーションID
     * @param moveALocationId The value of the column 'MOVE_A_LOCATION_ID'. (NullAllowed)
     */
    public void setMoveALocationId(Long moveALocationId) {
        __modifiedProperties.add("moveALocationId");
        this._moveALocationId = moveALocationId;
    }

    /**
     * [get] MOVE_A_LOCATION_CD: {varchar(30)} <br>
     * 移動先
     * @return The value of the column 'MOVE_A_LOCATION_CD'. (NullAllowed)
     */
    public String getMoveALocationCd() {
        return _moveALocationCd;
    }

    /**
     * [set] MOVE_A_LOCATION_CD: {varchar(30)} <br>
     * 移動先
     * @param moveALocationCd The value of the column 'MOVE_A_LOCATION_CD'. (NullAllowed)
     */
    public void setMoveALocationCd(String moveALocationCd) {
        __modifiedProperties.add("moveALocationCd");
        this._moveALocationCd = moveALocationCd;
    }

    /**
     * [get] INST_NUM: {decimal(16, 6)} <br>
     * 指示数
     * @return The value of the column 'INST_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInstNum() {
        return _instNum;
    }

    /**
     * [set] INST_NUM: {decimal(16, 6)} <br>
     * 指示数
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        __modifiedProperties.add("instNum");
        this._instNum = instNum;
    }

    /**
     * [get] REST_QTY_CASE: {decimal(16, 6)} <br>
     * 残数量(ケース)
     * @return The value of the column 'REST_QTY_CASE'. (NullAllowed)
     */
    public java.math.BigDecimal getRestQtyCase() {
        return _restQtyCase;
    }

    /**
     * [set] REST_QTY_CASE: {decimal(16, 6)} <br>
     * 残数量(ケース)
     * @param restQtyCase The value of the column 'REST_QTY_CASE'. (NullAllowed)
     */
    public void setRestQtyCase(java.math.BigDecimal restQtyCase) {
        __modifiedProperties.add("restQtyCase");
        this._restQtyCase = restQtyCase;
    }

    /**
     * [get] REST_QTY_BOWL: {decimal(16, 6)} <br>
     * 残数量(カートン)
     * @return The value of the column 'REST_QTY_BOWL'. (NullAllowed)
     */
    public java.math.BigDecimal getRestQtyBowl() {
        return _restQtyBowl;
    }

    /**
     * [set] REST_QTY_BOWL: {decimal(16, 6)} <br>
     * 残数量(カートン)
     * @param restQtyBowl The value of the column 'REST_QTY_BOWL'. (NullAllowed)
     */
    public void setRestQtyBowl(java.math.BigDecimal restQtyBowl) {
        __modifiedProperties.add("restQtyBowl");
        this._restQtyBowl = restQtyBowl;
    }

    /**
     * [get] REST_QTY: {decimal(16, 6)} <br>
     * 個装残数量
     * @return The value of the column 'REST_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getRestQty() {
        return _restQty;
    }

    /**
     * [set] REST_QTY: {decimal(16, 6)} <br>
     * 個装残数量
     * @param restQty The value of the column 'REST_QTY'. (NullAllowed)
     */
    public void setRestQty(java.math.BigDecimal restQty) {
        __modifiedProperties.add("restQty");
        this._restQty = restQty;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
