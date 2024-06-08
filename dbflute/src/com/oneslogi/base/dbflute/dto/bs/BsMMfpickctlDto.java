package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_MFPICKCTL as TABLE. <br>
 * 引当制御マスタ
 * <pre>
 * [primary-key]
 *     MFPICKCTL_ID
 *
 * [column]
 *     MFPICKCTL_ID, CLIENT_ID, PRODUCT_CD, PICKFRDATE, PICKTODATE, PICKRANK1, PICKRANK2, PICKRANK3, PICKRANK4, PICKRANK5, VALIDTYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFPICKCTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CLIENT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMMfpickctlDto implements Serializable {

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
    /** MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _mfpickctlId;

    /** CLIENT_ID: {bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** PICKFRDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _pickfrdate;

    /** PICKTODATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _picktodate;

    /** PICKRANK1: {NotNull, varchar(30)} */
    @JsonKey
    protected String _pickrank1;

    /** PICKRANK2: {varchar(30)} */
    @JsonKey
    protected String _pickrank2;

    /** PICKRANK3: {varchar(30)} */
    @JsonKey
    protected String _pickrank3;

    /** PICKRANK4: {varchar(30)} */
    @JsonKey
    protected String _pickrank4;

    /** PICKRANK5: {varchar(30)} */
    @JsonKey
    protected String _pickrank5;

    /** VALIDTYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _validtype;

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
    public BsMMfpickctlDto() {
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
    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMMfpickctlDto)) { return false; }
        final BsMMfpickctlDto otherEntity = (BsMMfpickctlDto)other;
        if (!helpComparingValue(getMfpickctlId(), otherEntity.getMfpickctlId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_MFPICKCTL");
        result = xCH(result, getMfpickctlId());
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
        sb.append(c).append(getMfpickctlId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getPickfrdate());
        sb.append(c).append(getPicktodate());
        sb.append(c).append(getPickrank1());
        sb.append(c).append(getPickrank2());
        sb.append(c).append(getPickrank3());
        sb.append(c).append(getPickrank4());
        sb.append(c).append(getPickrank5());
        sb.append(c).append(getValidtype());
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
     * [get] MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 引当制御ID
     * @return The value of the column 'MFPICKCTL_ID'. (NullAllowed)
     */
    public Long getMfpickctlId() {
        return _mfpickctlId;
    }

    /**
     * [set] MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 引当制御ID
     * @param mfpickctlId The value of the column 'MFPICKCTL_ID'. (NullAllowed)
     */
    public void setMfpickctlId(Long mfpickctlId) {
        __modifiedProperties.add("mfpickctlId");
        this._mfpickctlId = mfpickctlId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PICKFRDATE: {NotNull, varchar(8)} <br>
     * 適用開始日
     * @return The value of the column 'PICKFRDATE'. (NullAllowed)
     */
    public String getPickfrdate() {
        return _pickfrdate;
    }

    /**
     * [set] PICKFRDATE: {NotNull, varchar(8)} <br>
     * 適用開始日
     * @param pickfrdate The value of the column 'PICKFRDATE'. (NullAllowed)
     */
    public void setPickfrdate(String pickfrdate) {
        __modifiedProperties.add("pickfrdate");
        this._pickfrdate = pickfrdate;
    }

    /**
     * [get] PICKTODATE: {NotNull, varchar(8)} <br>
     * 適用終了日
     * @return The value of the column 'PICKTODATE'. (NullAllowed)
     */
    public String getPicktodate() {
        return _picktodate;
    }

    /**
     * [set] PICKTODATE: {NotNull, varchar(8)} <br>
     * 適用終了日
     * @param picktodate The value of the column 'PICKTODATE'. (NullAllowed)
     */
    public void setPicktodate(String picktodate) {
        __modifiedProperties.add("picktodate");
        this._picktodate = picktodate;
    }

    /**
     * [get] PICKRANK1: {NotNull, varchar(30)} <br>
     * 引当順位１デザイン区分
     * @return The value of the column 'PICKRANK1'. (NullAllowed)
     */
    public String getPickrank1() {
        return _pickrank1;
    }

    /**
     * [set] PICKRANK1: {NotNull, varchar(30)} <br>
     * 引当順位１デザイン区分
     * @param pickrank1 The value of the column 'PICKRANK1'. (NullAllowed)
     */
    public void setPickrank1(String pickrank1) {
        __modifiedProperties.add("pickrank1");
        this._pickrank1 = pickrank1;
    }

    /**
     * [get] PICKRANK2: {varchar(30)} <br>
     * 引当順位２デザイン区分
     * @return The value of the column 'PICKRANK2'. (NullAllowed)
     */
    public String getPickrank2() {
        return _pickrank2;
    }

    /**
     * [set] PICKRANK2: {varchar(30)} <br>
     * 引当順位２デザイン区分
     * @param pickrank2 The value of the column 'PICKRANK2'. (NullAllowed)
     */
    public void setPickrank2(String pickrank2) {
        __modifiedProperties.add("pickrank2");
        this._pickrank2 = pickrank2;
    }

    /**
     * [get] PICKRANK3: {varchar(30)} <br>
     * 引当順位３デザイン区分
     * @return The value of the column 'PICKRANK3'. (NullAllowed)
     */
    public String getPickrank3() {
        return _pickrank3;
    }

    /**
     * [set] PICKRANK3: {varchar(30)} <br>
     * 引当順位３デザイン区分
     * @param pickrank3 The value of the column 'PICKRANK3'. (NullAllowed)
     */
    public void setPickrank3(String pickrank3) {
        __modifiedProperties.add("pickrank3");
        this._pickrank3 = pickrank3;
    }

    /**
     * [get] PICKRANK4: {varchar(30)} <br>
     * 引当順位４デザイン区分
     * @return The value of the column 'PICKRANK4'. (NullAllowed)
     */
    public String getPickrank4() {
        return _pickrank4;
    }

    /**
     * [set] PICKRANK4: {varchar(30)} <br>
     * 引当順位４デザイン区分
     * @param pickrank4 The value of the column 'PICKRANK4'. (NullAllowed)
     */
    public void setPickrank4(String pickrank4) {
        __modifiedProperties.add("pickrank4");
        this._pickrank4 = pickrank4;
    }

    /**
     * [get] PICKRANK5: {varchar(30)} <br>
     * 引当順位５デザイン区分
     * @return The value of the column 'PICKRANK5'. (NullAllowed)
     */
    public String getPickrank5() {
        return _pickrank5;
    }

    /**
     * [set] PICKRANK5: {varchar(30)} <br>
     * 引当順位５デザイン区分
     * @param pickrank5 The value of the column 'PICKRANK5'. (NullAllowed)
     */
    public void setPickrank5(String pickrank5) {
        __modifiedProperties.add("pickrank5");
        this._pickrank5 = pickrank5;
    }

    /**
     * [get] VALIDTYPE: {NotNull, varchar(30)} <br>
     * 有効区分
     * @return The value of the column 'VALIDTYPE'. (NullAllowed)
     */
    public String getValidtype() {
        return _validtype;
    }

    /**
     * [set] VALIDTYPE: {NotNull, varchar(30)} <br>
     * 有効区分
     * @param validtype The value of the column 'VALIDTYPE'. (NullAllowed)
     */
    public void setValidtype(String validtype) {
        __modifiedProperties.add("validtype");
        this._validtype = validtype;
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