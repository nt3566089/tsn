package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_ITEM as TABLE. <br>
 * 項目マスタ
 * <pre>
 * [primary-key]
 *     ITEM_ID
 *
 * [column]
 *     ITEM_ID, SCREEN_ID, ITEM_CD, DICT_ID, ITEM_TYPE, VISIBLE, EDITABLE, TEXT_ALIGN, NECESSARY, DISPLAY_REQUIRED, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, B_SCREEN, V_DICT, V_HT_DICT, B_CLASS_DTL(ByItemType), B_ITEM_VALID(AsOne)
 *
 * [referrer-table]
 *     B_COL, B_COL_EXT_BASE, B_COL_EXT_USER, B_ITEM_ROLE, M_CENTER_ITEM, M_CLIENT_ITEM, B_ITEM_VALID
 *
 * [foreign-property]
 *     bDict, bScreen, vDict, vHtDict, bClassDtlByItemType, bClassDtlByVisible, bClassDtlByEditable, bClassDtlByTextAlign, bClassDtlByNecessary, bClassDtlByDisplayRequired, bItemValidAsOne
 *
 * [referrer-property]
 *     bColList, bColExtBaseList, bColExtUserList, bItemRoleList, mCenterItemList, mClientItemList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBItemDto implements Serializable {

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
    /** ITEM_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _itemId;

    /** SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN} */
    @JsonKey
    protected Long _screenId;

    /** ITEM_CD: {UQ+, NotNull, varchar(100)} */
    @JsonKey
    protected String _itemCd;

    /** DICT_ID: {IX, bigint(19), FK to B_DICT} */
    @JsonKey
    protected Long _dictId;

    /** ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType} */
    @JsonKey
    protected String _itemType;

    /** VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} */
    @JsonKey
    protected String _visible;

    /** EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable} */
    @JsonKey
    protected String _editable;

    /** TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign} */
    @JsonKey
    protected String _textAlign;

    /** NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary} */
    @JsonKey
    protected String _necessary;

    /** DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired} */
    @JsonKey
    protected String _displayRequired;

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
    public BsBItemDto() {
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

    protected BClassDtlDto _bClassDtlByItemType;

    public BClassDtlDto getBClassDtlByItemType() {
        return _bClassDtlByItemType;
    }

    public void setBClassDtlByItemType(BClassDtlDto bClassDtlByItemType) {
        this._bClassDtlByItemType = bClassDtlByItemType;
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

    protected BClassDtlDto _bClassDtlByTextAlign;

    public BClassDtlDto getBClassDtlByTextAlign() {
        return _bClassDtlByTextAlign;
    }

    public void setBClassDtlByTextAlign(BClassDtlDto bClassDtlByTextAlign) {
        this._bClassDtlByTextAlign = bClassDtlByTextAlign;
    }

    protected BClassDtlDto _bClassDtlByNecessary;

    public BClassDtlDto getBClassDtlByNecessary() {
        return _bClassDtlByNecessary;
    }

    public void setBClassDtlByNecessary(BClassDtlDto bClassDtlByNecessary) {
        this._bClassDtlByNecessary = bClassDtlByNecessary;
    }

    protected BClassDtlDto _bClassDtlByDisplayRequired;

    public BClassDtlDto getBClassDtlByDisplayRequired() {
        return _bClassDtlByDisplayRequired;
    }

    public void setBClassDtlByDisplayRequired(BClassDtlDto bClassDtlByDisplayRequired) {
        this._bClassDtlByDisplayRequired = bClassDtlByDisplayRequired;
    }

    protected BItemValidDto _bItemValidAsOne;

    public BItemValidDto getBItemValidAsOne() {
        return _bItemValidAsOne;
    }

    public void setBItemValidAsOne(BItemValidDto BItemValidAsOne) {
        this._bItemValidAsOne = BItemValidAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<BColDto> _bColList;

    public List<BColDto> getBColList() {
        if (_bColList == null) { _bColList = new ArrayList<BColDto>(); }
        return _bColList;
    }

    public void setBColList(List<BColDto> bColList) {
        this._bColList = bColList;
    }

    protected List<BColExtBaseDto> _bColExtBaseList;

    public List<BColExtBaseDto> getBColExtBaseList() {
        if (_bColExtBaseList == null) { _bColExtBaseList = new ArrayList<BColExtBaseDto>(); }
        return _bColExtBaseList;
    }

    public void setBColExtBaseList(List<BColExtBaseDto> bColExtBaseList) {
        this._bColExtBaseList = bColExtBaseList;
    }

    protected List<BColExtUserDto> _bColExtUserList;

    public List<BColExtUserDto> getBColExtUserList() {
        if (_bColExtUserList == null) { _bColExtUserList = new ArrayList<BColExtUserDto>(); }
        return _bColExtUserList;
    }

    public void setBColExtUserList(List<BColExtUserDto> bColExtUserList) {
        this._bColExtUserList = bColExtUserList;
    }

    protected List<BItemRoleDto> _bItemRoleList;

    public List<BItemRoleDto> getBItemRoleList() {
        if (_bItemRoleList == null) { _bItemRoleList = new ArrayList<BItemRoleDto>(); }
        return _bItemRoleList;
    }

    public void setBItemRoleList(List<BItemRoleDto> bItemRoleList) {
        this._bItemRoleList = bItemRoleList;
    }

    protected List<MCenterItemDto> _mCenterItemList;

    public List<MCenterItemDto> getMCenterItemList() {
        if (_mCenterItemList == null) { _mCenterItemList = new ArrayList<MCenterItemDto>(); }
        return _mCenterItemList;
    }

    public void setMCenterItemList(List<MCenterItemDto> mCenterItemList) {
        this._mCenterItemList = mCenterItemList;
    }

    protected List<MClientItemDto> _mClientItemList;

    public List<MClientItemDto> getMClientItemList() {
        if (_mClientItemList == null) { _mClientItemList = new ArrayList<MClientItemDto>(); }
        return _mClientItemList;
    }

    public void setMClientItemList(List<MClientItemDto> mClientItemList) {
        this._mClientItemList = mClientItemList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBItemDto)) { return false; }
        final BsBItemDto otherEntity = (BsBItemDto)other;
        if (!helpComparingValue(getItemId(), otherEntity.getItemId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_ITEM");
        result = xCH(result, getItemId());
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
        sb.append(c).append(getItemId());
        sb.append(c).append(getScreenId());
        sb.append(c).append(getItemCd());
        sb.append(c).append(getDictId());
        sb.append(c).append(getItemType());
        sb.append(c).append(getVisible());
        sb.append(c).append(getEditable());
        sb.append(c).append(getTextAlign());
        sb.append(c).append(getNecessary());
        sb.append(c).append(getDisplayRequired());
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
     * [get] ITEM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 項目ID
     * @return The value of the column 'ITEM_ID'. (NullAllowed)
     */
    public Long getItemId() {
        return _itemId;
    }

    /**
     * [set] ITEM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 項目ID
     * @param itemId The value of the column 'ITEM_ID'. (NullAllowed)
     */
    public void setItemId(Long itemId) {
        __modifiedProperties.add("itemId");
        this._itemId = itemId;
    }

    /**
     * [get] SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN} <br>
     * 画面ID
     * @return The value of the column 'SCREEN_ID'. (NullAllowed)
     */
    public Long getScreenId() {
        return _screenId;
    }

    /**
     * [set] SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN} <br>
     * 画面ID
     * @param screenId The value of the column 'SCREEN_ID'. (NullAllowed)
     */
    public void setScreenId(Long screenId) {
        __modifiedProperties.add("screenId");
        this._screenId = screenId;
    }

    /**
     * [get] ITEM_CD: {UQ+, NotNull, varchar(100)} <br>
     * 項目CD
     * @return The value of the column 'ITEM_CD'. (NullAllowed)
     */
    public String getItemCd() {
        return _itemCd;
    }

    /**
     * [set] ITEM_CD: {UQ+, NotNull, varchar(100)} <br>
     * 項目CD
     * @param itemCd The value of the column 'ITEM_CD'. (NullAllowed)
     */
    public void setItemCd(String itemCd) {
        __modifiedProperties.add("itemCd");
        this._itemCd = itemCd;
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
     * [get] ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType} <br>
     * 項目型
     * @return The value of the column 'ITEM_TYPE'. (NullAllowed)
     */
    public String getItemType() {
        return _itemType;
    }

    /**
     * [set] ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType} <br>
     * 項目型
     * @param itemType The value of the column 'ITEM_TYPE'. (NullAllowed)
     */
    public void setItemType(String itemType) {
        __modifiedProperties.add("itemType");
        this._itemType = itemType;
    }

    /**
     * [get] VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @return The value of the column 'VISIBLE'. (NullAllowed)
     */
    public String getVisible() {
        return _visible;
    }

    /**
     * [set] VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param visible The value of the column 'VISIBLE'. (NullAllowed)
     */
    public void setVisible(String visible) {
        __modifiedProperties.add("visible");
        this._visible = visible;
    }

    /**
     * [get] EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @return The value of the column 'EDITABLE'. (NullAllowed)
     */
    public String getEditable() {
        return _editable;
    }

    /**
     * [set] EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable} <br>
     * 編集可否
     * @param editable The value of the column 'EDITABLE'. (NullAllowed)
     */
    public void setEditable(String editable) {
        __modifiedProperties.add("editable");
        this._editable = editable;
    }

    /**
     * [get] TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign} <br>
     * 表示位置
     * @return The value of the column 'TEXT_ALIGN'. (NullAllowed)
     */
    public String getTextAlign() {
        return _textAlign;
    }

    /**
     * [set] TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign} <br>
     * 表示位置
     * @param textAlign The value of the column 'TEXT_ALIGN'. (NullAllowed)
     */
    public void setTextAlign(String textAlign) {
        __modifiedProperties.add("textAlign");
        this._textAlign = textAlign;
    }

    /**
     * [get] NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary} <br>
     * 必須
     * @return The value of the column 'NECESSARY'. (NullAllowed)
     */
    public String getNecessary() {
        return _necessary;
    }

    /**
     * [set] NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary} <br>
     * 必須
     * @param necessary The value of the column 'NECESSARY'. (NullAllowed)
     */
    public void setNecessary(String necessary) {
        __modifiedProperties.add("necessary");
        this._necessary = necessary;
    }

    /**
     * [get] DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired} <br>
     * 表示必須
     * @return The value of the column 'DISPLAY_REQUIRED'. (NullAllowed)
     */
    public String getDisplayRequired() {
        return _displayRequired;
    }

    /**
     * [set] DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired} <br>
     * 表示必須
     * @param displayRequired The value of the column 'DISPLAY_REQUIRED'. (NullAllowed)
     */
    public void setDisplayRequired(String displayRequired) {
        __modifiedProperties.add("displayRequired");
        this._displayRequired = displayRequired;
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
