package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_FUNC as TABLE. <br>
 * 機能マスタ
 * <pre>
 * [primary-key]
 *     FUNC_ID
 *
 * [column]
 *     FUNC_ID, CLASS_CD, METHOD_CD, FUNC_CD, FUNC_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FUNC_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     B_ARG, B_FUNC_ROLE
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     bArgList, bFuncRoleList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBFuncDto implements Serializable {

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
    /** FUNC_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _funcId;

    /** CLASS_CD: {UQ+, NotNull, varchar(100)} */
    @JsonKey
    protected String _classCd;

    /** METHOD_CD: {+UQ, NotNull, varchar(100)} */
    @JsonKey
    protected String _methodCd;

    /** FUNC_CD: {varchar(100)} */
    @JsonKey
    protected String _funcCd;

    /** FUNC_NM: {varchar(60)} */
    @JsonKey
    protected String _funcNm;

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
    public BsBFuncDto() {
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
    protected List<BArgDto> _bArgList;

    public List<BArgDto> getBArgList() {
        if (_bArgList == null) { _bArgList = new ArrayList<BArgDto>(); }
        return _bArgList;
    }

    public void setBArgList(List<BArgDto> bArgList) {
        this._bArgList = bArgList;
    }

    protected List<BFuncRoleDto> _bFuncRoleList;

    public List<BFuncRoleDto> getBFuncRoleList() {
        if (_bFuncRoleList == null) { _bFuncRoleList = new ArrayList<BFuncRoleDto>(); }
        return _bFuncRoleList;
    }

    public void setBFuncRoleList(List<BFuncRoleDto> bFuncRoleList) {
        this._bFuncRoleList = bFuncRoleList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBFuncDto)) { return false; }
        final BsBFuncDto otherEntity = (BsBFuncDto)other;
        if (!helpComparingValue(getFuncId(), otherEntity.getFuncId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_FUNC");
        result = xCH(result, getFuncId());
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
        sb.append(c).append(getFuncId());
        sb.append(c).append(getClassCd());
        sb.append(c).append(getMethodCd());
        sb.append(c).append(getFuncCd());
        sb.append(c).append(getFuncNm());
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
     * [get] FUNC_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 機能ID
     * @return The value of the column 'FUNC_ID'. (NullAllowed)
     */
    public Long getFuncId() {
        return _funcId;
    }

    /**
     * [set] FUNC_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 機能ID
     * @param funcId The value of the column 'FUNC_ID'. (NullAllowed)
     */
    public void setFuncId(Long funcId) {
        __modifiedProperties.add("funcId");
        this._funcId = funcId;
    }

    /**
     * [get] CLASS_CD: {UQ+, NotNull, varchar(100)} <br>
     * クラス名
     * @return The value of the column 'CLASS_CD'. (NullAllowed)
     */
    public String getClassCd() {
        return _classCd;
    }

    /**
     * [set] CLASS_CD: {UQ+, NotNull, varchar(100)} <br>
     * クラス名
     * @param classCd The value of the column 'CLASS_CD'. (NullAllowed)
     */
    public void setClassCd(String classCd) {
        __modifiedProperties.add("classCd");
        this._classCd = classCd;
    }

    /**
     * [get] METHOD_CD: {+UQ, NotNull, varchar(100)} <br>
     * メソッド名
     * @return The value of the column 'METHOD_CD'. (NullAllowed)
     */
    public String getMethodCd() {
        return _methodCd;
    }

    /**
     * [set] METHOD_CD: {+UQ, NotNull, varchar(100)} <br>
     * メソッド名
     * @param methodCd The value of the column 'METHOD_CD'. (NullAllowed)
     */
    public void setMethodCd(String methodCd) {
        __modifiedProperties.add("methodCd");
        this._methodCd = methodCd;
    }

    /**
     * [get] FUNC_CD: {varchar(100)} <br>
     * 機能名
     * @return The value of the column 'FUNC_CD'. (NullAllowed)
     */
    public String getFuncCd() {
        return _funcCd;
    }

    /**
     * [set] FUNC_CD: {varchar(100)} <br>
     * 機能名
     * @param funcCd The value of the column 'FUNC_CD'. (NullAllowed)
     */
    public void setFuncCd(String funcCd) {
        __modifiedProperties.add("funcCd");
        this._funcCd = funcCd;
    }

    /**
     * [get] FUNC_NM: {varchar(60)} <br>
     * 機能名称
     * @return The value of the column 'FUNC_NM'. (NullAllowed)
     */
    public String getFuncNm() {
        return _funcNm;
    }

    /**
     * [set] FUNC_NM: {varchar(60)} <br>
     * 機能名称
     * @param funcNm The value of the column 'FUNC_NM'. (NullAllowed)
     */
    public void setFuncNm(String funcNm) {
        __modifiedProperties.add("funcNm");
        this._funcNm = funcNm;
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
