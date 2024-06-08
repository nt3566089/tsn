package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_SHIPPING_INST_SPARE as TABLE. <br>
 * 出荷指示予備
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_B_ID
 *
 * [column]
 *     SHIPPING_INST_B_ID, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_SHIPPING_INST_B
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tShippingInstB
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTShippingInstSpareDto implements Serializable {

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
    /** SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to T_SHIPPING_INST_B} */
    @JsonKey
    protected Long _shippingInstBId;

    /** SPARE_STR_1: {varchar(255)} */
    @JsonKey
    protected String _spareStr1;

    /** SPARE_STR_2: {varchar(255)} */
    @JsonKey
    protected String _spareStr2;

    /** SPARE_STR_3: {varchar(255)} */
    @JsonKey
    protected String _spareStr3;

    /** SPARE_NUM_1: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _spareNum1;

    /** SPARE_NUM_2: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _spareNum2;

    /** SPARE_NUM_3: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _spareNum3;

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
    public BsTShippingInstSpareDto() {
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
    protected TShippingInstBDto _tShippingInstB;

    public TShippingInstBDto getTShippingInstB() {
        return _tShippingInstB;
    }

    public void setTShippingInstB(TShippingInstBDto tShippingInstB) {
        this._tShippingInstB = tShippingInstB;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTShippingInstSpareDto)) { return false; }
        final BsTShippingInstSpareDto otherEntity = (BsTShippingInstSpareDto)other;
        if (!helpComparingValue(getShippingInstBId(), otherEntity.getShippingInstBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_SHIPPING_INST_SPARE");
        result = xCH(result, getShippingInstBId());
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
        sb.append(c).append(getShippingInstBId());
        sb.append(c).append(getSpareStr1());
        sb.append(c).append(getSpareStr2());
        sb.append(c).append(getSpareStr3());
        sb.append(c).append(getSpareNum1());
        sb.append(c).append(getSpareNum2());
        sb.append(c).append(getSpareNum3());
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
     * [get] SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to T_SHIPPING_INST_B} <br>
     * 出荷指示ボディID
     * @return The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed)
     */
    public Long getShippingInstBId() {
        return _shippingInstBId;
    }

    /**
     * [set] SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to T_SHIPPING_INST_B} <br>
     * 出荷指示ボディID
     * @param shippingInstBId The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed)
     */
    public void setShippingInstBId(Long shippingInstBId) {
        __modifiedProperties.add("shippingInstBId");
        this._shippingInstBId = shippingInstBId;
    }

    /**
     * [get] SPARE_STR_1: {varchar(255)} <br>
     * 予備項目１（文字列）
     * @return The value of the column 'SPARE_STR_1'. (NullAllowed)
     */
    public String getSpareStr1() {
        return _spareStr1;
    }

    /**
     * [set] SPARE_STR_1: {varchar(255)} <br>
     * 予備項目１（文字列）
     * @param spareStr1 The value of the column 'SPARE_STR_1'. (NullAllowed)
     */
    public void setSpareStr1(String spareStr1) {
        __modifiedProperties.add("spareStr1");
        this._spareStr1 = spareStr1;
    }

    /**
     * [get] SPARE_STR_2: {varchar(255)} <br>
     * 予備項目２（文字列）
     * @return The value of the column 'SPARE_STR_2'. (NullAllowed)
     */
    public String getSpareStr2() {
        return _spareStr2;
    }

    /**
     * [set] SPARE_STR_2: {varchar(255)} <br>
     * 予備項目２（文字列）
     * @param spareStr2 The value of the column 'SPARE_STR_2'. (NullAllowed)
     */
    public void setSpareStr2(String spareStr2) {
        __modifiedProperties.add("spareStr2");
        this._spareStr2 = spareStr2;
    }

    /**
     * [get] SPARE_STR_3: {varchar(255)} <br>
     * 予備項目３（文字列）
     * @return The value of the column 'SPARE_STR_3'. (NullAllowed)
     */
    public String getSpareStr3() {
        return _spareStr3;
    }

    /**
     * [set] SPARE_STR_3: {varchar(255)} <br>
     * 予備項目３（文字列）
     * @param spareStr3 The value of the column 'SPARE_STR_3'. (NullAllowed)
     */
    public void setSpareStr3(String spareStr3) {
        __modifiedProperties.add("spareStr3");
        this._spareStr3 = spareStr3;
    }

    /**
     * [get] SPARE_NUM_1: {decimal(16, 6)} <br>
     * 予備項目１（数値）
     * @return The value of the column 'SPARE_NUM_1'. (NullAllowed)
     */
    public java.math.BigDecimal getSpareNum1() {
        return _spareNum1;
    }

    /**
     * [set] SPARE_NUM_1: {decimal(16, 6)} <br>
     * 予備項目１（数値）
     * @param spareNum1 The value of the column 'SPARE_NUM_1'. (NullAllowed)
     */
    public void setSpareNum1(java.math.BigDecimal spareNum1) {
        __modifiedProperties.add("spareNum1");
        this._spareNum1 = spareNum1;
    }

    /**
     * [get] SPARE_NUM_2: {decimal(16, 6)} <br>
     * 予備項目２（数値）
     * @return The value of the column 'SPARE_NUM_2'. (NullAllowed)
     */
    public java.math.BigDecimal getSpareNum2() {
        return _spareNum2;
    }

    /**
     * [set] SPARE_NUM_2: {decimal(16, 6)} <br>
     * 予備項目２（数値）
     * @param spareNum2 The value of the column 'SPARE_NUM_2'. (NullAllowed)
     */
    public void setSpareNum2(java.math.BigDecimal spareNum2) {
        __modifiedProperties.add("spareNum2");
        this._spareNum2 = spareNum2;
    }

    /**
     * [get] SPARE_NUM_3: {decimal(16, 6)} <br>
     * 予備項目３（数値）
     * @return The value of the column 'SPARE_NUM_3'. (NullAllowed)
     */
    public java.math.BigDecimal getSpareNum3() {
        return _spareNum3;
    }

    /**
     * [set] SPARE_NUM_3: {decimal(16, 6)} <br>
     * 予備項目３（数値）
     * @param spareNum3 The value of the column 'SPARE_NUM_3'. (NullAllowed)
     */
    public void setSpareNum3(java.math.BigDecimal spareNum3) {
        __modifiedProperties.add("spareNum3");
        this._spareNum3 = spareNum3;
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
