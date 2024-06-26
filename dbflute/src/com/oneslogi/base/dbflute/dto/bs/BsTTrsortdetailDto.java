package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRSORTDETAIL as TABLE. <br>
 * 仕分明細
 * <pre>
 * [primary-key]
 *     TRSODETAIL_ID, PICKING_INST_DETAIL_ID, TAGCD
 *
 * [column]
 *     TRSODETAIL_ID, PICKING_INST_DETAIL_ID, TAGCD, SORTEDQTY1, SORTUSERCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_INST_DETAIL_ID
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
public abstract class BsTTrsortdetailDto implements Serializable {

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
    /** TRSODETAIL_ID: {PK, NotNull, bigint(19)} */
    @JsonKey
    protected Long _trsodetailId;

    /** PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _pickingInstDetailId;

    /** TAGCD: {PK, IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _tagcd;

    /** SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _sortedqty1;

    /** SORTUSERCD: {varchar(30)} */
    @JsonKey
    protected String _sortusercd;

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
    public BsTTrsortdetailDto() {
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
        if (other == null || !(other instanceof BsTTrsortdetailDto)) { return false; }
        final BsTTrsortdetailDto otherEntity = (BsTTrsortdetailDto)other;
        if (!helpComparingValue(getTrsodetailId(), otherEntity.getTrsodetailId())) { return false; }
        if (!helpComparingValue(getPickingInstDetailId(), otherEntity.getPickingInstDetailId())) { return false; }
        if (!helpComparingValue(getTagcd(), otherEntity.getTagcd())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSORTDETAIL");
        result = xCH(result, getTrsodetailId());
        result = xCH(result, getPickingInstDetailId());
        result = xCH(result, getTagcd());
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
        sb.append(c).append(getTrsodetailId());
        sb.append(c).append(getPickingInstDetailId());
        sb.append(c).append(getTagcd());
        sb.append(c).append(getSortedqty1());
        sb.append(c).append(getSortusercd());
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
     * [get] TRSODETAIL_ID: {PK, NotNull, bigint(19)} <br>
     * 仕分明細ID
     * @return The value of the column 'TRSODETAIL_ID'. (NullAllowed)
     */
    public Long getTrsodetailId() {
        return _trsodetailId;
    }

    /**
     * [set] TRSODETAIL_ID: {PK, NotNull, bigint(19)} <br>
     * 仕分明細ID
     * @param trsodetailId The value of the column 'TRSODETAIL_ID'. (NullAllowed)
     */
    public void setTrsodetailId(Long trsodetailId) {
        __modifiedProperties.add("trsodetailId");
        this._trsodetailId = trsodetailId;
    }

    /**
     * [get] PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング指示明細ID
     * @return The value of the column 'PICKING_INST_DETAIL_ID'. (NullAllowed)
     */
    public Long getPickingInstDetailId() {
        return _pickingInstDetailId;
    }

    /**
     * [set] PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング指示明細ID
     * @param pickingInstDetailId The value of the column 'PICKING_INST_DETAIL_ID'. (NullAllowed)
     */
    public void setPickingInstDetailId(Long pickingInstDetailId) {
        __modifiedProperties.add("pickingInstDetailId");
        this._pickingInstDetailId = pickingInstDetailId;
    }

    /**
     * [get] TAGCD: {PK, IX, NotNull, varchar(30)} <br>
     * 仕分タグCD
     * @return The value of the column 'TAGCD'. (NullAllowed)
     */
    public String getTagcd() {
        return _tagcd;
    }

    /**
     * [set] TAGCD: {PK, IX, NotNull, varchar(30)} <br>
     * 仕分タグCD
     * @param tagcd The value of the column 'TAGCD'. (NullAllowed)
     */
    public void setTagcd(String tagcd) {
        __modifiedProperties.add("tagcd");
        this._tagcd = tagcd;
    }

    /**
     * [get] SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量１（バラ）
     * @return The value of the column 'SORTEDQTY1'. (NullAllowed)
     */
    public Long getSortedqty1() {
        return _sortedqty1;
    }

    /**
     * [set] SORTEDQTY1: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量１（バラ）
     * @param sortedqty1 The value of the column 'SORTEDQTY1'. (NullAllowed)
     */
    public void setSortedqty1(Long sortedqty1) {
        __modifiedProperties.add("sortedqty1");
        this._sortedqty1 = sortedqty1;
    }

    /**
     * [get] SORTUSERCD: {varchar(30)} <br>
     * 仕分担当者
     * @return The value of the column 'SORTUSERCD'. (NullAllowed)
     */
    public String getSortusercd() {
        return _sortusercd;
    }

    /**
     * [set] SORTUSERCD: {varchar(30)} <br>
     * 仕分担当者
     * @param sortusercd The value of the column 'SORTUSERCD'. (NullAllowed)
     */
    public void setSortusercd(String sortusercd) {
        __modifiedProperties.add("sortusercd");
        this._sortusercd = sortusercd;
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
