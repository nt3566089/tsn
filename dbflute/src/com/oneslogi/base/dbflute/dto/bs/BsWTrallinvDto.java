package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_TRALLINV as TABLE. <br>
 * 統合在庫実績ワーク
 * <pre>
 * [primary-key]
 *     TRALLINV_ID
 *
 * [column]
 *     TRALLINV_ID, CENTER_ID, CLIENT_ID, TAG_TYPE, INOUTKBN, PRODUCT_ID, QTY1, QTY2, QTY3, QTY4, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRALLINV_ID
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
public abstract class BsWTrallinvDto implements Serializable {

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
    /** TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trallinvId;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** TAG_TYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _tagType;

    /** INOUTKBN: {varchar(30)} */
    @JsonKey
    protected String _inoutkbn;

    /** PRODUCT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** QTY1: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _qty1;

    /** QTY2: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _qty2;

    /** QTY3: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _qty3;

    /** QTY4: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _qty4;

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
    public BsWTrallinvDto() {
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
        if (other == null || !(other instanceof BsWTrallinvDto)) { return false; }
        final BsWTrallinvDto otherEntity = (BsWTrallinvDto)other;
        if (!helpComparingValue(getTrallinvId(), otherEntity.getTrallinvId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_TRALLINV");
        result = xCH(result, getTrallinvId());
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
        sb.append(c).append(getTrallinvId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getTagType());
        sb.append(c).append(getInoutkbn());
        sb.append(c).append(getProductId());
        sb.append(c).append(getQty1());
        sb.append(c).append(getQty2());
        sb.append(c).append(getQty3());
        sb.append(c).append(getQty4());
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
     * [get] TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 統合在庫実績ワークID
     * @return The value of the column 'TRALLINV_ID'. (NullAllowed)
     */
    public Long getTrallinvId() {
        return _trallinvId;
    }

    /**
     * [set] TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 統合在庫実績ワークID
     * @param trallinvId The value of the column 'TRALLINV_ID'. (NullAllowed)
     */
    public void setTrallinvId(Long trallinvId) {
        __modifiedProperties.add("trallinvId");
        this._trallinvId = trallinvId;
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
     * [get] TAG_TYPE: {NotNull, varchar(30)} <br>
     * データ種別
     * @return The value of the column 'TAG_TYPE'. (NullAllowed)
     */
    public String getTagType() {
        return _tagType;
    }

    /**
     * [set] TAG_TYPE: {NotNull, varchar(30)} <br>
     * データ種別
     * @param tagType The value of the column 'TAG_TYPE'. (NullAllowed)
     */
    public void setTagType(String tagType) {
        __modifiedProperties.add("tagType");
        this._tagType = tagType;
    }

    /**
     * [get] INOUTKBN: {varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public String getInoutkbn() {
        return _inoutkbn;
    }

    /**
     * [set] INOUTKBN: {varchar(30)} <br>
     * 内外区分
     * @param inoutkbn The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public void setInoutkbn(String inoutkbn) {
        __modifiedProperties.add("inoutkbn");
        this._inoutkbn = inoutkbn;
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
     * [get] QTY1: {decimal(16, 6), default=[(0)]} <br>
     * 数量1
     * @return The value of the column 'QTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getQty1() {
        return _qty1;
    }

    /**
     * [set] QTY1: {decimal(16, 6), default=[(0)]} <br>
     * 数量1
     * @param qty1 The value of the column 'QTY1'. (NullAllowed)
     */
    public void setQty1(java.math.BigDecimal qty1) {
        __modifiedProperties.add("qty1");
        this._qty1 = qty1;
    }

    /**
     * [get] QTY2: {decimal(16, 6), default=[(0)]} <br>
     * 数量2
     * @return The value of the column 'QTY2'. (NullAllowed)
     */
    public java.math.BigDecimal getQty2() {
        return _qty2;
    }

    /**
     * [set] QTY2: {decimal(16, 6), default=[(0)]} <br>
     * 数量2
     * @param qty2 The value of the column 'QTY2'. (NullAllowed)
     */
    public void setQty2(java.math.BigDecimal qty2) {
        __modifiedProperties.add("qty2");
        this._qty2 = qty2;
    }

    /**
     * [get] QTY3: {decimal(16, 6), default=[(0)]} <br>
     * 数量3
     * @return The value of the column 'QTY3'. (NullAllowed)
     */
    public java.math.BigDecimal getQty3() {
        return _qty3;
    }

    /**
     * [set] QTY3: {decimal(16, 6), default=[(0)]} <br>
     * 数量3
     * @param qty3 The value of the column 'QTY3'. (NullAllowed)
     */
    public void setQty3(java.math.BigDecimal qty3) {
        __modifiedProperties.add("qty3");
        this._qty3 = qty3;
    }

    /**
     * [get] QTY4: {decimal(16, 6), default=[(0)]} <br>
     * 数量4
     * @return The value of the column 'QTY4'. (NullAllowed)
     */
    public java.math.BigDecimal getQty4() {
        return _qty4;
    }

    /**
     * [set] QTY4: {decimal(16, 6), default=[(0)]} <br>
     * 数量4
     * @param qty4 The value of the column 'QTY4'. (NullAllowed)
     */
    public void setQty4(java.math.BigDecimal qty4) {
        __modifiedProperties.add("qty4");
        this._qty4 = qty4;
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
