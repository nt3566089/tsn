package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_MENU as TABLE. <br>
 * メニューマスタ
 * <pre>
 * [primary-key]
 *     MENU_ID
 *
 * [column]
 *     MENU_ID, MENU_GRP_ID, SCREEN_ID, DICT_ID, URL_PATH, VIEW_ORDER, TARGET_WINDOW, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MENU_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, B_SCREEN, B_MENU_GRP, V_DICT, V_HT_DICT, B_CLASS_DTL(ByTargetWindow)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bDict, bScreen, bMenuGrp, vDict, vHtDict, bClassDtlByTargetWindow
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBMenuDto implements Serializable {

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
    /** MENU_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _menuId;

    /** MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP} */
    @JsonKey
    protected Long _menuGrpId;

    /** SCREEN_ID: {IX, bigint(19), FK to B_SCREEN} */
    @JsonKey
    protected Long _screenId;

    /** DICT_ID: {IX, bigint(19), FK to B_DICT} */
    @JsonKey
    protected Long _dictId;

    /** URL_PATH: {varchar(255)} */
    @JsonKey
    protected String _urlPath;

    /** VIEW_ORDER: {bigint(19)} */
    @JsonKey
    protected Long _viewOrder;

    /** TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow} */
    @JsonKey
    protected String _targetWindow;

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
    public BsBMenuDto() {
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
    protected BDictDto _bDict;

    public BDictDto getBDict() {
        return _bDict;
    }

    public void setBDict(BDictDto bDict) {
        this._bDict = bDict;
    }

    protected BScreenDto _bScreen;

    public BScreenDto getBScreen() {
        return _bScreen;
    }

    public void setBScreen(BScreenDto bScreen) {
        this._bScreen = bScreen;
    }

    protected BMenuGrpDto _bMenuGrp;

    public BMenuGrpDto getBMenuGrp() {
        return _bMenuGrp;
    }

    public void setBMenuGrp(BMenuGrpDto bMenuGrp) {
        this._bMenuGrp = bMenuGrp;
    }

    protected VDictDto _vDict;

    public VDictDto getVDict() {
        return _vDict;
    }

    public void setVDict(VDictDto vDict) {
        this._vDict = vDict;
    }

    protected VHtDictDto _vHtDict;

    public VHtDictDto getVHtDict() {
        return _vHtDict;
    }

    public void setVHtDict(VHtDictDto vHtDict) {
        this._vHtDict = vHtDict;
    }

    protected BClassDtlDto _bClassDtlByTargetWindow;

    public BClassDtlDto getBClassDtlByTargetWindow() {
        return _bClassDtlByTargetWindow;
    }

    public void setBClassDtlByTargetWindow(BClassDtlDto bClassDtlByTargetWindow) {
        this._bClassDtlByTargetWindow = bClassDtlByTargetWindow;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBMenuDto)) { return false; }
        final BsBMenuDto otherEntity = (BsBMenuDto)other;
        if (!helpComparingValue(getMenuId(), otherEntity.getMenuId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_MENU");
        result = xCH(result, getMenuId());
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
        sb.append(c).append(getMenuId());
        sb.append(c).append(getMenuGrpId());
        sb.append(c).append(getScreenId());
        sb.append(c).append(getDictId());
        sb.append(c).append(getUrlPath());
        sb.append(c).append(getViewOrder());
        sb.append(c).append(getTargetWindow());
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
     * [get] MENU_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * メニューID
     * @return The value of the column 'MENU_ID'. (NullAllowed)
     */
    public Long getMenuId() {
        return _menuId;
    }

    /**
     * [set] MENU_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * メニューID
     * @param menuId The value of the column 'MENU_ID'. (NullAllowed)
     */
    public void setMenuId(Long menuId) {
        __modifiedProperties.add("menuId");
        this._menuId = menuId;
    }

    /**
     * [get] MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP} <br>
     * メニューグループID
     * @return The value of the column 'MENU_GRP_ID'. (NullAllowed)
     */
    public Long getMenuGrpId() {
        return _menuGrpId;
    }

    /**
     * [set] MENU_GRP_ID: {IX, NotNull, bigint(19), FK to B_MENU_GRP} <br>
     * メニューグループID
     * @param menuGrpId The value of the column 'MENU_GRP_ID'. (NullAllowed)
     */
    public void setMenuGrpId(Long menuGrpId) {
        __modifiedProperties.add("menuGrpId");
        this._menuGrpId = menuGrpId;
    }

    /**
     * [get] SCREEN_ID: {IX, bigint(19), FK to B_SCREEN} <br>
     * 画面ID
     * @return The value of the column 'SCREEN_ID'. (NullAllowed)
     */
    public Long getScreenId() {
        return _screenId;
    }

    /**
     * [set] SCREEN_ID: {IX, bigint(19), FK to B_SCREEN} <br>
     * 画面ID
     * @param screenId The value of the column 'SCREEN_ID'. (NullAllowed)
     */
    public void setScreenId(Long screenId) {
        __modifiedProperties.add("screenId");
        this._screenId = screenId;
    }

    /**
     * [get] DICT_ID: {IX, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (NullAllowed)
     */
    public Long getDictId() {
        return _dictId;
    }

    /**
     * [set] DICT_ID: {IX, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (NullAllowed)
     */
    public void setDictId(Long dictId) {
        __modifiedProperties.add("dictId");
        this._dictId = dictId;
    }

    /**
     * [get] URL_PATH: {varchar(255)} <br>
     * URLパス
     * @return The value of the column 'URL_PATH'. (NullAllowed)
     */
    public String getUrlPath() {
        return _urlPath;
    }

    /**
     * [set] URL_PATH: {varchar(255)} <br>
     * URLパス
     * @param urlPath The value of the column 'URL_PATH'. (NullAllowed)
     */
    public void setUrlPath(String urlPath) {
        __modifiedProperties.add("urlPath");
        this._urlPath = urlPath;
    }

    /**
     * [get] VIEW_ORDER: {bigint(19)} <br>
     * 表示順
     * @return The value of the column 'VIEW_ORDER'. (NullAllowed)
     */
    public Long getViewOrder() {
        return _viewOrder;
    }

    /**
     * [set] VIEW_ORDER: {bigint(19)} <br>
     * 表示順
     * @param viewOrder The value of the column 'VIEW_ORDER'. (NullAllowed)
     */
    public void setViewOrder(Long viewOrder) {
        __modifiedProperties.add("viewOrder");
        this._viewOrder = viewOrder;
    }

    /**
     * [get] TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow} <br>
     * ターゲットウインドウ
     * @return The value of the column 'TARGET_WINDOW'. (NullAllowed)
     */
    public String getTargetWindow() {
        return _targetWindow;
    }

    /**
     * [set] TARGET_WINDOW: {varchar(30), FK to B_CLASS_DTL, classification=TargetWindow} <br>
     * ターゲットウインドウ
     * @param targetWindow The value of the column 'TARGET_WINDOW'. (NullAllowed)
     */
    public void setTargetWindow(String targetWindow) {
        __modifiedProperties.add("targetWindow");
        this._targetWindow = targetWindow;
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
