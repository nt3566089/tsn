package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRTEMPALLOCATESEQDETAIL as TABLE. <br>
 * 仮引当順明細
 * <pre>
 * [primary-key]
 *     TEMPORARY_ALLOC_DETAIL_ID
 *
 * [column]
 *     TEMPORARY_ALLOC_DETAIL_ID, TEMPORARY_ALLOC_ID, ALLOCATESEQ, LOT_ID, LOCATION_ID, LISTKBN, DETAILLINENO, PALLET_ID, TEMPPICKEDQTY1, TEMPPICKEDQTY2, TEMPPICKEDQTY3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TEMPORARY_ALLOC_DETAIL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_TRTEMPALLOCATESEQ
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tTrtempallocateseq
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrtempallocateseqdetailDto implements Serializable {

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
    /** TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _temporaryAllocDetailId;

    /** TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ} */
    @JsonKey
    protected Long _temporaryAllocId;

    /** ALLOCATESEQ: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _allocateseq;

    /** LOT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _lotId;

    /** LOCATION_ID: {NotNull, varchar(30)} */
    @JsonKey
    protected String _locationId;

    /** LISTKBN: {NotNull, char(1)} */
    @JsonKey
    protected String _listkbn;

    /** DETAILLINENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _detaillineno;

    /** PALLET_ID: {bigint(19)} */
    @JsonKey
    protected Long _palletId;

    /** TEMPPICKEDQTY1: {bigint(19)} */
    @JsonKey
    protected Long _temppickedqty1;

    /** TEMPPICKEDQTY2: {bigint(19)} */
    @JsonKey
    protected Long _temppickedqty2;

    /** TEMPPICKEDQTY3: {bigint(19)} */
    @JsonKey
    protected Long _temppickedqty3;

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
    public BsTTrtempallocateseqdetailDto() {
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
    protected TTrtempallocateseqDto _tTrtempallocateseq;

    public TTrtempallocateseqDto getTTrtempallocateseq() {
        return _tTrtempallocateseq;
    }

    public void setTTrtempallocateseq(TTrtempallocateseqDto tTrtempallocateseq) {
        this._tTrtempallocateseq = tTrtempallocateseq;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrtempallocateseqdetailDto)) { return false; }
        final BsTTrtempallocateseqdetailDto otherEntity = (BsTTrtempallocateseqdetailDto)other;
        if (!helpComparingValue(getTemporaryAllocDetailId(), otherEntity.getTemporaryAllocDetailId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRTEMPALLOCATESEQDETAIL");
        result = xCH(result, getTemporaryAllocDetailId());
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
        sb.append(c).append(getTemporaryAllocDetailId());
        sb.append(c).append(getTemporaryAllocId());
        sb.append(c).append(getAllocateseq());
        sb.append(c).append(getLotId());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getListkbn());
        sb.append(c).append(getDetaillineno());
        sb.append(c).append(getPalletId());
        sb.append(c).append(getTemppickedqty1());
        sb.append(c).append(getTemppickedqty2());
        sb.append(c).append(getTemppickedqty3());
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
     * [get] TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仮引当順明細ID
     * @return The value of the column 'TEMPORARY_ALLOC_DETAIL_ID'. (NullAllowed)
     */
    public Long getTemporaryAllocDetailId() {
        return _temporaryAllocDetailId;
    }

    /**
     * [set] TEMPORARY_ALLOC_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仮引当順明細ID
     * @param temporaryAllocDetailId The value of the column 'TEMPORARY_ALLOC_DETAIL_ID'. (NullAllowed)
     */
    public void setTemporaryAllocDetailId(Long temporaryAllocDetailId) {
        __modifiedProperties.add("temporaryAllocDetailId");
        this._temporaryAllocDetailId = temporaryAllocDetailId;
    }

    /**
     * [get] TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ} <br>
     * 仮引当順ID
     * @return The value of the column 'TEMPORARY_ALLOC_ID'. (NullAllowed)
     */
    public Long getTemporaryAllocId() {
        return _temporaryAllocId;
    }

    /**
     * [set] TEMPORARY_ALLOC_ID: {NotNull, bigint(19), FK to T_TRTEMPALLOCATESEQ} <br>
     * 仮引当順ID
     * @param temporaryAllocId The value of the column 'TEMPORARY_ALLOC_ID'. (NullAllowed)
     */
    public void setTemporaryAllocId(Long temporaryAllocId) {
        __modifiedProperties.add("temporaryAllocId");
        this._temporaryAllocId = temporaryAllocId;
    }

    /**
     * [get] ALLOCATESEQ: {NotNull, bigint(19)} <br>
     * 実引当順
     * @return The value of the column 'ALLOCATESEQ'. (NullAllowed)
     */
    public Long getAllocateseq() {
        return _allocateseq;
    }

    /**
     * [set] ALLOCATESEQ: {NotNull, bigint(19)} <br>
     * 実引当順
     * @param allocateseq The value of the column 'ALLOCATESEQ'. (NullAllowed)
     */
    public void setAllocateseq(Long allocateseq) {
        __modifiedProperties.add("allocateseq");
        this._allocateseq = allocateseq;
    }

    /**
     * [get] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] LOCATION_ID: {NotNull, varchar(30)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public String getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {NotNull, varchar(30)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(String locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] LISTKBN: {NotNull, char(1)} <br>
     * 単品・端数区分
     * @return The value of the column 'LISTKBN'. (NullAllowed)
     */
    public String getListkbn() {
        return _listkbn;
    }

    /**
     * [set] LISTKBN: {NotNull, char(1)} <br>
     * 単品・端数区分
     * @param listkbn The value of the column 'LISTKBN'. (NullAllowed)
     */
    public void setListkbn(String listkbn) {
        __modifiedProperties.add("listkbn");
        this._listkbn = listkbn;
    }

    /**
     * [get] DETAILLINENO: {NotNull, bigint(19)} <br>
     * 行No
     * @return The value of the column 'DETAILLINENO'. (NullAllowed)
     */
    public Long getDetaillineno() {
        return _detaillineno;
    }

    /**
     * [set] DETAILLINENO: {NotNull, bigint(19)} <br>
     * 行No
     * @param detaillineno The value of the column 'DETAILLINENO'. (NullAllowed)
     */
    public void setDetaillineno(Long detaillineno) {
        __modifiedProperties.add("detaillineno");
        this._detaillineno = detaillineno;
    }

    /**
     * [get] PALLET_ID: {bigint(19)} <br>
     * パレットID
     * @return The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public Long getPalletId() {
        return _palletId;
    }

    /**
     * [set] PALLET_ID: {bigint(19)} <br>
     * パレットID
     * @param palletId The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public void setPalletId(Long palletId) {
        __modifiedProperties.add("palletId");
        this._palletId = palletId;
    }

    /**
     * [get] TEMPPICKEDQTY1: {bigint(19)} <br>
     * 引当数（個装）
     * @return The value of the column 'TEMPPICKEDQTY1'. (NullAllowed)
     */
    public Long getTemppickedqty1() {
        return _temppickedqty1;
    }

    /**
     * [set] TEMPPICKEDQTY1: {bigint(19)} <br>
     * 引当数（個装）
     * @param temppickedqty1 The value of the column 'TEMPPICKEDQTY1'. (NullAllowed)
     */
    public void setTemppickedqty1(Long temppickedqty1) {
        __modifiedProperties.add("temppickedqty1");
        this._temppickedqty1 = temppickedqty1;
    }

    /**
     * [get] TEMPPICKEDQTY2: {bigint(19)} <br>
     * 引当数（ケース）
     * @return The value of the column 'TEMPPICKEDQTY2'. (NullAllowed)
     */
    public Long getTemppickedqty2() {
        return _temppickedqty2;
    }

    /**
     * [set] TEMPPICKEDQTY2: {bigint(19)} <br>
     * 引当数（ケース）
     * @param temppickedqty2 The value of the column 'TEMPPICKEDQTY2'. (NullAllowed)
     */
    public void setTemppickedqty2(Long temppickedqty2) {
        __modifiedProperties.add("temppickedqty2");
        this._temppickedqty2 = temppickedqty2;
    }

    /**
     * [get] TEMPPICKEDQTY3: {bigint(19)} <br>
     * 引当数（カートン）
     * @return The value of the column 'TEMPPICKEDQTY3'. (NullAllowed)
     */
    public Long getTemppickedqty3() {
        return _temppickedqty3;
    }

    /**
     * [set] TEMPPICKEDQTY3: {bigint(19)} <br>
     * 引当数（カートン）
     * @param temppickedqty3 The value of the column 'TEMPPICKEDQTY3'. (NullAllowed)
     */
    public void setTemppickedqty3(Long temppickedqty3) {
        __modifiedProperties.add("temppickedqty3");
        this._temppickedqty3 = temppickedqty3;
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
