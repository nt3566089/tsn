package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_ROLE_GRP_DTL as TABLE. <br>
 * 権限グループ明細マスタ
 * <pre>
 * [primary-key]
 *     ROLE_GRP_DTL_ID
 *
 * [column]
 *     ROLE_GRP_DTL_ID, ROLE_GRP_ID, ROLE_ID, APPLY_ORDER, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ROLE_GRP_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_ROLE, B_ROLE_GRP
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bRole, bRoleGrp
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBRoleGrpDtlDto implements Serializable {

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
    /** ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _roleGrpDtlId;

    /** ROLE_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE_GRP} */
    @JsonKey
    protected Long _roleGrpId;

    /** ROLE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ROLE} */
    @JsonKey
    protected Long _roleId;

    /** APPLY_ORDER: {+UQ, NotNull, bigint(19)} */
    @JsonKey
    protected Long _applyOrder;

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
    public BsBRoleGrpDtlDto() {
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
    protected BRoleDto _bRole;

    public BRoleDto getBRole() {
        return _bRole;
    }

    public void setBRole(BRoleDto bRole) {
        this._bRole = bRole;
    }

    protected BRoleGrpDto _bRoleGrp;

    public BRoleGrpDto getBRoleGrp() {
        return _bRoleGrp;
    }

    public void setBRoleGrp(BRoleGrpDto bRoleGrp) {
        this._bRoleGrp = bRoleGrp;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBRoleGrpDtlDto)) { return false; }
        final BsBRoleGrpDtlDto otherEntity = (BsBRoleGrpDtlDto)other;
        if (!helpComparingValue(getRoleGrpDtlId(), otherEntity.getRoleGrpDtlId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_ROLE_GRP_DTL");
        result = xCH(result, getRoleGrpDtlId());
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
        sb.append(c).append(getRoleGrpDtlId());
        sb.append(c).append(getRoleGrpId());
        sb.append(c).append(getRoleId());
        sb.append(c).append(getApplyOrder());
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
     * [get] ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 権限グループ明細ID
     * @return The value of the column 'ROLE_GRP_DTL_ID'. (NullAllowed)
     */
    public Long getRoleGrpDtlId() {
        return _roleGrpDtlId;
    }

    /**
     * [set] ROLE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 権限グループ明細ID
     * @param roleGrpDtlId The value of the column 'ROLE_GRP_DTL_ID'. (NullAllowed)
     */
    public void setRoleGrpDtlId(Long roleGrpDtlId) {
        __modifiedProperties.add("roleGrpDtlId");
        this._roleGrpDtlId = roleGrpDtlId;
    }

    /**
     * [get] ROLE_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE_GRP} <br>
     * 権限グループID
     * @return The value of the column 'ROLE_GRP_ID'. (NullAllowed)
     */
    public Long getRoleGrpId() {
        return _roleGrpId;
    }

    /**
     * [set] ROLE_GRP_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE_GRP} <br>
     * 権限グループID
     * @param roleGrpId The value of the column 'ROLE_GRP_ID'. (NullAllowed)
     */
    public void setRoleGrpId(Long roleGrpId) {
        __modifiedProperties.add("roleGrpId");
        this._roleGrpId = roleGrpId;
    }

    /**
     * [get] ROLE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ROLE} <br>
     * 権限ID
     * @return The value of the column 'ROLE_ID'. (NullAllowed)
     */
    public Long getRoleId() {
        return _roleId;
    }

    /**
     * [set] ROLE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ROLE} <br>
     * 権限ID
     * @param roleId The value of the column 'ROLE_ID'. (NullAllowed)
     */
    public void setRoleId(Long roleId) {
        __modifiedProperties.add("roleId");
        this._roleId = roleId;
    }

    /**
     * [get] APPLY_ORDER: {+UQ, NotNull, bigint(19)} <br>
     * 適用順序
     * @return The value of the column 'APPLY_ORDER'. (NullAllowed)
     */
    public Long getApplyOrder() {
        return _applyOrder;
    }

    /**
     * [set] APPLY_ORDER: {+UQ, NotNull, bigint(19)} <br>
     * 適用順序
     * @param applyOrder The value of the column 'APPLY_ORDER'. (NullAllowed)
     */
    public void setApplyOrder(Long applyOrder) {
        __modifiedProperties.add("applyOrder");
        this._applyOrder = applyOrder;
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
