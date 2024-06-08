package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_PIC_MTHD_RCMD_CART as TABLE. <br>
 * ピッキング提案台車
 * <pre>
 * [primary-key]
 *     PIC_MTHD_RCMD_CART_ID
 *
 * [column]
 *     PIC_MTHD_RCMD_CART_ID, PACKING_H_ID, CART_NO, PIC_MTHD_RCMD_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PIC_MTHD_RCMD_CART_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_PIC_MTHD_RCMD, T_PACKING_H
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tPicMthdRcmd, tPackingH
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTPicMthdRcmdCartDto implements Serializable {

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
    /** PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _picMthdRcmdCartId;

    /** PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H} */
    @JsonKey
    protected Long _packingHId;

    /** CART_NO: {bigint(19)} */
    @JsonKey
    protected Long _cartNo;

    /** PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD} */
    @JsonKey
    protected Long _picMthdRcmdId;

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
    public BsTPicMthdRcmdCartDto() {
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
    protected TPicMthdRcmdDto _tPicMthdRcmd;

    public TPicMthdRcmdDto getTPicMthdRcmd() {
        return _tPicMthdRcmd;
    }

    public void setTPicMthdRcmd(TPicMthdRcmdDto tPicMthdRcmd) {
        this._tPicMthdRcmd = tPicMthdRcmd;
    }

    protected TPackingHDto _tPackingH;

    public TPackingHDto getTPackingH() {
        return _tPackingH;
    }

    public void setTPackingH(TPackingHDto tPackingH) {
        this._tPackingH = tPackingH;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTPicMthdRcmdCartDto)) { return false; }
        final BsTPicMthdRcmdCartDto otherEntity = (BsTPicMthdRcmdCartDto)other;
        if (!helpComparingValue(getPicMthdRcmdCartId(), otherEntity.getPicMthdRcmdCartId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_PIC_MTHD_RCMD_CART");
        result = xCH(result, getPicMthdRcmdCartId());
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
        sb.append(c).append(getPicMthdRcmdCartId());
        sb.append(c).append(getPackingHId());
        sb.append(c).append(getCartNo());
        sb.append(c).append(getPicMthdRcmdId());
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
     * [get] PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング提案台車ID
     * @return The value of the column 'PIC_MTHD_RCMD_CART_ID'. (NullAllowed)
     */
    public Long getPicMthdRcmdCartId() {
        return _picMthdRcmdCartId;
    }

    /**
     * [set] PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング提案台車ID
     * @param picMthdRcmdCartId The value of the column 'PIC_MTHD_RCMD_CART_ID'. (NullAllowed)
     */
    public void setPicMthdRcmdCartId(Long picMthdRcmdCartId) {
        __modifiedProperties.add("picMthdRcmdCartId");
        this._picMthdRcmdCartId = picMthdRcmdCartId;
    }

    /**
     * [get] PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H} <br>
     * 梱包ヘッダID
     * @return The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public Long getPackingHId() {
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H} <br>
     * 梱包ヘッダID
     * @param packingHId The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public void setPackingHId(Long packingHId) {
        __modifiedProperties.add("packingHId");
        this._packingHId = packingHId;
    }

    /**
     * [get] CART_NO: {bigint(19)} <br>
     * 台車No.
     * @return The value of the column 'CART_NO'. (NullAllowed)
     */
    public Long getCartNo() {
        return _cartNo;
    }

    /**
     * [set] CART_NO: {bigint(19)} <br>
     * 台車No.
     * @param cartNo The value of the column 'CART_NO'. (NullAllowed)
     */
    public void setCartNo(Long cartNo) {
        __modifiedProperties.add("cartNo");
        this._cartNo = cartNo;
    }

    /**
     * [get] PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD} <br>
     * ピッキング提案ID
     * @return The value of the column 'PIC_MTHD_RCMD_ID'. (NullAllowed)
     */
    public Long getPicMthdRcmdId() {
        return _picMthdRcmdId;
    }

    /**
     * [set] PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD} <br>
     * ピッキング提案ID
     * @param picMthdRcmdId The value of the column 'PIC_MTHD_RCMD_ID'. (NullAllowed)
     */
    public void setPicMthdRcmdId(Long picMthdRcmdId) {
        __modifiedProperties.add("picMthdRcmdId");
        this._picMthdRcmdId = picMthdRcmdId;
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
