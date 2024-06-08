package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_MFMONTHCHG as TABLE. <br>
 * 月替り・デ変情報マスタ
 * <pre>
 * [primary-key]
 *     MFMONTHCHG_ID
 *
 * [column]
 *     MFMONTHCHG_ID, CLIENT_ID, CENTER_ID, SYSTEM_DT, PRODUCT_CD, SOTEDUNIT, LIMITDATE, DESIGNFLG, PICKLISTTYPE, SOTEDLOC, PICKLISTKEY, PICKLISTGNO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFMONTHCHG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMMfmonthchgDto implements Serializable {

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
    /** MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _mfmonthchgId;

    /** CLIENT_ID: {bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** SYSTEM_DT: {NotNull, varchar(8)} */
    @JsonKey
    protected String _systemDt;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** SOTEDUNIT: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sotedunit;

    /** LIMITDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _limitdate;

    /** DESIGNFLG: {NotNull, varchar(30)} */
    @JsonKey
    protected String _designflg;

    /** PICKLISTTYPE: {varchar(30)} */
    @JsonKey
    protected String _picklisttype;

    /** SOTEDLOC: {varchar(30)} */
    @JsonKey
    protected String _sotedloc;

    /** PICKLISTKEY: {bigint(19)} */
    @JsonKey
    protected Long _picklistkey;

    /** PICKLISTGNO: {bigint(19)} */
    @JsonKey
    protected Long _picklistgno;

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
    public BsMMfmonthchgDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

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
        if (other == null || !(other instanceof BsMMfmonthchgDto)) { return false; }
        final BsMMfmonthchgDto otherEntity = (BsMMfmonthchgDto)other;
        if (!helpComparingValue(getMfmonthchgId(), otherEntity.getMfmonthchgId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_MFMONTHCHG");
        result = xCH(result, getMfmonthchgId());
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
        sb.append(c).append(getMfmonthchgId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getSystemDt());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getSotedunit());
        sb.append(c).append(getLimitdate());
        sb.append(c).append(getDesignflg());
        sb.append(c).append(getPicklisttype());
        sb.append(c).append(getSotedloc());
        sb.append(c).append(getPicklistkey());
        sb.append(c).append(getPicklistgno());
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
     * [get] MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 月替り・デ変情報ID
     * @return The value of the column 'MFMONTHCHG_ID'. (NullAllowed)
     */
    public Long getMfmonthchgId() {
        return _mfmonthchgId;
    }

    /**
     * [set] MFMONTHCHG_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 月替り・デ変情報ID
     * @param mfmonthchgId The value of the column 'MFMONTHCHG_ID'. (NullAllowed)
     */
    public void setMfmonthchgId(Long mfmonthchgId) {
        __modifiedProperties.add("mfmonthchgId");
        this._mfmonthchgId = mfmonthchgId;
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
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] SYSTEM_DT: {NotNull, varchar(8)} <br>
     * 更新日付
     * @return The value of the column 'SYSTEM_DT'. (NullAllowed)
     */
    public String getSystemDt() {
        return _systemDt;
    }

    /**
     * [set] SYSTEM_DT: {NotNull, varchar(8)} <br>
     * 更新日付
     * @param systemDt The value of the column 'SYSTEM_DT'. (NullAllowed)
     */
    public void setSystemDt(String systemDt) {
        __modifiedProperties.add("systemDt");
        this._systemDt = systemDt;
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
     * [get] SOTEDUNIT: {NotNull, varchar(30)} <br>
     * 補充先
     * @return The value of the column 'SOTEDUNIT'. (NullAllowed)
     */
    public String getSotedunit() {
        return _sotedunit;
    }

    /**
     * [set] SOTEDUNIT: {NotNull, varchar(30)} <br>
     * 補充先
     * @param sotedunit The value of the column 'SOTEDUNIT'. (NullAllowed)
     */
    public void setSotedunit(String sotedunit) {
        __modifiedProperties.add("sotedunit");
        this._sotedunit = sotedunit;
    }

    /**
     * [get] LIMITDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public String getLimitdate() {
        return _limitdate;
    }

    /**
     * [set] LIMITDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public void setLimitdate(String limitdate) {
        __modifiedProperties.add("limitdate");
        this._limitdate = limitdate;
    }

    /**
     * [get] DESIGNFLG: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNFLG'. (NullAllowed)
     */
    public String getDesignflg() {
        return _designflg;
    }

    /**
     * [set] DESIGNFLG: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @param designflg The value of the column 'DESIGNFLG'. (NullAllowed)
     */
    public void setDesignflg(String designflg) {
        __modifiedProperties.add("designflg");
        this._designflg = designflg;
    }

    /**
     * [get] PICKLISTTYPE: {varchar(30)} <br>
     * 山出しタイプ
     * @return The value of the column 'PICKLISTTYPE'. (NullAllowed)
     */
    public String getPicklisttype() {
        return _picklisttype;
    }

    /**
     * [set] PICKLISTTYPE: {varchar(30)} <br>
     * 山出しタイプ
     * @param picklisttype The value of the column 'PICKLISTTYPE'. (NullAllowed)
     */
    public void setPicklisttype(String picklisttype) {
        __modifiedProperties.add("picklisttype");
        this._picklisttype = picklisttype;
    }

    /**
     * [get] SOTEDLOC: {varchar(30)} <br>
     * 仕分ロケ
     * @return The value of the column 'SOTEDLOC'. (NullAllowed)
     */
    public String getSotedloc() {
        return _sotedloc;
    }

    /**
     * [set] SOTEDLOC: {varchar(30)} <br>
     * 仕分ロケ
     * @param sotedloc The value of the column 'SOTEDLOC'. (NullAllowed)
     */
    public void setSotedloc(String sotedloc) {
        __modifiedProperties.add("sotedloc");
        this._sotedloc = sotedloc;
    }

    /**
     * [get] PICKLISTKEY: {bigint(19)} <br>
     * 山出しリストNo.
     * @return The value of the column 'PICKLISTKEY'. (NullAllowed)
     */
    public Long getPicklistkey() {
        return _picklistkey;
    }

    /**
     * [set] PICKLISTKEY: {bigint(19)} <br>
     * 山出しリストNo.
     * @param picklistkey The value of the column 'PICKLISTKEY'. (NullAllowed)
     */
    public void setPicklistkey(Long picklistkey) {
        __modifiedProperties.add("picklistkey");
        this._picklistkey = picklistkey;
    }

    /**
     * [get] PICKLISTGNO: {bigint(19)} <br>
     * 山出しリスト明細行No.
     * @return The value of the column 'PICKLISTGNO'. (NullAllowed)
     */
    public Long getPicklistgno() {
        return _picklistgno;
    }

    /**
     * [set] PICKLISTGNO: {bigint(19)} <br>
     * 山出しリスト明細行No.
     * @param picklistgno The value of the column 'PICKLISTGNO'. (NullAllowed)
     */
    public void setPicklistgno(Long picklistgno) {
        __modifiedProperties.add("picklistgno");
        this._picklistgno = picklistgno;
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
