package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_ITEM_ROLE as TABLE. <br>
 * 項目権限マスタ
 * <pre>
 * [primary-key]
 *     ITEM_ROLE_ID
 *
 * [column]
 *     ITEM_ROLE_ID, ROLE_ID, ITEM_ID, VISIBLE, EDITABLE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ITEM_ROLE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_ITEM, B_ROLE, B_CLASS_DTL(ByVisible)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bItem, bRole, bClassDtlByVisible, bClassDtlByEditable
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBItemRoleDto implements Serializable {

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
    /** ITEM_ROLE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _itemRoleId;

    /** ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE} */
    @JsonKey
    protected Long _roleId;

    /** ITEM_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ITEM} */
    @JsonKey
    protected Long _itemId;

    /** VISIBLE: {char(1), FK to B_CLASS_DTL, classification=Visible} */
    @JsonKey
    protected String _visible;

    /** EDITABLE: {char(1), FK to B_CLASS_DTL, classification=Editable} */
    @JsonKey
    protected String _editable;

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
    public BsBItemRoleDto() {
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
    protected BItemDto _bItem;

    public BItemDto getBItem() {
        return _bItem;
    }

    public void setBItem(BItemDto bItem) {
        this._bItem = bItem;
    }

    protected BRoleDto _bRole;

    public BRoleDto getBRole() {
        return _bRole;
    }

    public void setBRole(BRoleDto bRole) {
        this._bRole = bRole;
    }

    protected BClassDtlDto _bClassDtlByVisible;

    public BClassDtlDto getBClassDtlByVisible() {
        return _bClassDtlByVisible;
    }

    public void setBClassDtlByVisible(BClassDtlDto bClassDtlByVisible) {
        this._bClassDtlByVisible = bClassDtlByVisible;
    }

    protected BClassDtlDto _bClassDtlByEditable;

    public BClassDtlDto getBClassDtlByEditable() {
        return _bClassDtlByEditable;
    }

    public void setBClassDtlByEditable(BClassDtlDto bClassDtlByEditable) {
        this._bClassDtlByEditable = bClassDtlByEditable;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBItemRoleDto)) { return false; }
        final BsBItemRoleDto otherEntity = (BsBItemRoleDto)other;
        if (!helpComparingValue(getItemRoleId(), otherEntity.getItemRoleId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_ITEM_ROLE");
        result = xCH(result, getItemRoleId());
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
        sb.append(c).append(getItemRoleId());
        sb.append(c).append(getRoleId());
        sb.append(c).append(getItemId());
        sb.append(c).append(getVisible());
        sb.append(c).append(getEditable());
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
     * [get] ITEM_ROLE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 項目権限ID
     * @return The value of the column 'ITEM_ROLE_ID'. (NullAllowed)
     */
    public Long getItemRoleId() {
        return _itemRoleId;
    }

    /**
     * [set] ITEM_ROLE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 項目権限ID
     * @param itemRoleId The value of the column 'ITEM_ROLE_ID'. (NullAllowed)
     */
    public void setItemRoleId(Long itemRoleId) {
        __modifiedProperties.add("itemRoleId");
        this._itemRoleId = itemRoleId;
    }

    /**
     * [get] ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE} <br>
     * 権限ID
     * @return The value of the column 'ROLE_ID'. (NullAllowed)
     */
    public Long getRoleId() {
        return _roleId;
    }

    /**
     * [set] ROLE_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ROLE} <br>
     * 権限ID
     * @param roleId The value of the column 'ROLE_ID'. (NullAllowed)
     */
    public void setRoleId(Long roleId) {
        __modifiedProperties.add("roleId");
        this._roleId = roleId;
    }

    /**
     * [get] ITEM_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ITEM} <br>
     * 項目ID
     * @return The value of the column 'ITEM_ID'. (NullAllowed)
     */
    public Long getItemId() {
        return _itemId;
    }

    /**
     * [set] ITEM_ID: {+UQ, IX, NotNull, bigint(19), FK to B_ITEM} <br>
     * 項目ID
     * @param itemId The value of the column 'ITEM_ID'. (NullAllowed)
     */
    public void setItemId(Long itemId) {
        __modifiedProperties.add("itemId");
        this._itemId = itemId;
    }

    /**
     * [get] VISIBLE: {char(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @return The value of the column 'VISIBLE'. (NullAllowed)
     */
    public String getVisible() {
        return _visible;
    }

    /**
     * [set] VISIBLE: {char(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param visible The value of the column 'VISIBLE'. (NullAllowed)
     */
    public void setVisible(String visible) {
        __modifiedProperties.add("visible");
        this._visible = visible;
    }

    /**
     * [get] EDITABLE: {char(1), FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @return The value of the column 'EDITABLE'. (NullAllowed)
     */
    public String getEditable() {
        return _editable;
    }

    /**
     * [set] EDITABLE: {char(1), FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @param editable The value of the column 'EDITABLE'. (NullAllowed)
     */
    public void setEditable(String editable) {
        __modifiedProperties.add("editable");
        this._editable = editable;
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
