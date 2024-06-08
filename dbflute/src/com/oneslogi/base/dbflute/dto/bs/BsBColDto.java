package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_COL as TABLE. <br>
 * 列マスタ
 * <pre>
 * [primary-key]
 *     COL_ID
 *
 * [column]
 *     COL_ID, ITEM_ID, COL_CD, DICT_ID, COL_ORDER, COL_TYPE, VISIBLE, EDITABLE, TEXT_ALIGN, NECESSARY, COL_WIDTH, IN_COL_INDEX, IN_COL_DEFAULT_VALUE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, B_ITEM, V_DICT, V_HT_DICT, B_CLASS_DTL(ByColType), B_COL_VALID(AsOne)
 *
 * [referrer-table]
 *     B_COL_ROLE, M_CENTER_COL, M_CLIENT_COL, B_COL_VALID
 *
 * [foreign-property]
 *     bDict, bItem, vDict, vHtDict, bClassDtlByColType, bClassDtlByVisible, bClassDtlByEditable, bClassDtlByTextAlign, bClassDtlByNecessary, bColValidAsOne
 *
 * [referrer-property]
 *     bColRoleList, mCenterColList, mClientColList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBColDto implements Serializable {

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
    /** COL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _colId;

    /** ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM} */
    @JsonKey
    protected Long _itemId;

    /** COL_CD: {+UQ, varchar(100)} */
    @JsonKey
    protected String _colCd;

    /** DICT_ID: {IX, bigint(19), FK to B_DICT} */
    @JsonKey
    protected Long _dictId;

    /** COL_ORDER: {bigint(19)} */
    @JsonKey
    protected Long _colOrder;

    /** COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType} */
    @JsonKey
    protected String _colType;

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

    /** COL_WIDTH: {bigint(19)} */
    @JsonKey
    protected Long _colWidth;

    /** IN_COL_INDEX: {bigint(19)} */
    @JsonKey
    protected Long _inColIndex;

    /** IN_COL_DEFAULT_VALUE: {varchar(255)} */
    @JsonKey
    protected String _inColDefaultValue;

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
    public BsBColDto() {
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

    protected BItemDto _bItem;

    public BItemDto getBItem() {
        return _bItem;
    }

    public void setBItem(BItemDto bItem) {
        this._bItem = bItem;
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

    protected BClassDtlDto _bClassDtlByColType;

    public BClassDtlDto getBClassDtlByColType() {
        return _bClassDtlByColType;
    }

    public void setBClassDtlByColType(BClassDtlDto bClassDtlByColType) {
        this._bClassDtlByColType = bClassDtlByColType;
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

    protected BColValidDto _bColValidAsOne;

    public BColValidDto getBColValidAsOne() {
        return _bColValidAsOne;
    }

    public void setBColValidAsOne(BColValidDto BColValidAsOne) {
        this._bColValidAsOne = BColValidAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<BColRoleDto> _bColRoleList;

    public List<BColRoleDto> getBColRoleList() {
        if (_bColRoleList == null) { _bColRoleList = new ArrayList<BColRoleDto>(); }
        return _bColRoleList;
    }

    public void setBColRoleList(List<BColRoleDto> bColRoleList) {
        this._bColRoleList = bColRoleList;
    }

    protected List<MCenterColDto> _mCenterColList;

    public List<MCenterColDto> getMCenterColList() {
        if (_mCenterColList == null) { _mCenterColList = new ArrayList<MCenterColDto>(); }
        return _mCenterColList;
    }

    public void setMCenterColList(List<MCenterColDto> mCenterColList) {
        this._mCenterColList = mCenterColList;
    }

    protected List<MClientColDto> _mClientColList;

    public List<MClientColDto> getMClientColList() {
        if (_mClientColList == null) { _mClientColList = new ArrayList<MClientColDto>(); }
        return _mClientColList;
    }

    public void setMClientColList(List<MClientColDto> mClientColList) {
        this._mClientColList = mClientColList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBColDto)) { return false; }
        final BsBColDto otherEntity = (BsBColDto)other;
        if (!helpComparingValue(getColId(), otherEntity.getColId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_COL");
        result = xCH(result, getColId());
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
        sb.append(c).append(getColId());
        sb.append(c).append(getItemId());
        sb.append(c).append(getColCd());
        sb.append(c).append(getDictId());
        sb.append(c).append(getColOrder());
        sb.append(c).append(getColType());
        sb.append(c).append(getVisible());
        sb.append(c).append(getEditable());
        sb.append(c).append(getTextAlign());
        sb.append(c).append(getNecessary());
        sb.append(c).append(getColWidth());
        sb.append(c).append(getInColIndex());
        sb.append(c).append(getInColDefaultValue());
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
     * [get] COL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 列ID
     * @return The value of the column 'COL_ID'. (NullAllowed)
     */
    public Long getColId() {
        return _colId;
    }

    /**
     * [set] COL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 列ID
     * @param colId The value of the column 'COL_ID'. (NullAllowed)
     */
    public void setColId(Long colId) {
        __modifiedProperties.add("colId");
        this._colId = colId;
    }

    /**
     * [get] ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM} <br>
     * 項目ID
     * @return The value of the column 'ITEM_ID'. (NullAllowed)
     */
    public Long getItemId() {
        return _itemId;
    }

    /**
     * [set] ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM} <br>
     * 項目ID
     * @param itemId The value of the column 'ITEM_ID'. (NullAllowed)
     */
    public void setItemId(Long itemId) {
        __modifiedProperties.add("itemId");
        this._itemId = itemId;
    }

    /**
     * [get] COL_CD: {+UQ, varchar(100)} <br>
     * 列CD
     * @return The value of the column 'COL_CD'. (NullAllowed)
     */
    public String getColCd() {
        return _colCd;
    }

    /**
     * [set] COL_CD: {+UQ, varchar(100)} <br>
     * 列CD
     * @param colCd The value of the column 'COL_CD'. (NullAllowed)
     */
    public void setColCd(String colCd) {
        __modifiedProperties.add("colCd");
        this._colCd = colCd;
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
     * [get] COL_ORDER: {bigint(19)} <br>
     * 列順序
     * @return The value of the column 'COL_ORDER'. (NullAllowed)
     */
    public Long getColOrder() {
        return _colOrder;
    }

    /**
     * [set] COL_ORDER: {bigint(19)} <br>
     * 列順序
     * @param colOrder The value of the column 'COL_ORDER'. (NullAllowed)
     */
    public void setColOrder(Long colOrder) {
        __modifiedProperties.add("colOrder");
        this._colOrder = colOrder;
    }

    /**
     * [get] COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType} <br>
     * 列型
     * @return The value of the column 'COL_TYPE'. (NullAllowed)
     */
    public String getColType() {
        return _colType;
    }

    /**
     * [set] COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType} <br>
     * 列型
     * @param colType The value of the column 'COL_TYPE'. (NullAllowed)
     */
    public void setColType(String colType) {
        __modifiedProperties.add("colType");
        this._colType = colType;
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
     * [get] COL_WIDTH: {bigint(19)} <br>
     * 列幅
     * @return The value of the column 'COL_WIDTH'. (NullAllowed)
     */
    public Long getColWidth() {
        return _colWidth;
    }

    /**
     * [set] COL_WIDTH: {bigint(19)} <br>
     * 列幅
     * @param colWidth The value of the column 'COL_WIDTH'. (NullAllowed)
     */
    public void setColWidth(Long colWidth) {
        __modifiedProperties.add("colWidth");
        this._colWidth = colWidth;
    }

    /**
     * [get] IN_COL_INDEX: {bigint(19)} <br>
     * 入力ファイル列位置
     * @return The value of the column 'IN_COL_INDEX'. (NullAllowed)
     */
    public Long getInColIndex() {
        return _inColIndex;
    }

    /**
     * [set] IN_COL_INDEX: {bigint(19)} <br>
     * 入力ファイル列位置
     * @param inColIndex The value of the column 'IN_COL_INDEX'. (NullAllowed)
     */
    public void setInColIndex(Long inColIndex) {
        __modifiedProperties.add("inColIndex");
        this._inColIndex = inColIndex;
    }

    /**
     * [get] IN_COL_DEFAULT_VALUE: {varchar(255)} <br>
     * 入力ファイル列規定値
     * @return The value of the column 'IN_COL_DEFAULT_VALUE'. (NullAllowed)
     */
    public String getInColDefaultValue() {
        return _inColDefaultValue;
    }

    /**
     * [set] IN_COL_DEFAULT_VALUE: {varchar(255)} <br>
     * 入力ファイル列規定値
     * @param inColDefaultValue The value of the column 'IN_COL_DEFAULT_VALUE'. (NullAllowed)
     */
    public void setInColDefaultValue(String inColDefaultValue) {
        __modifiedProperties.add("inColDefaultValue");
        this._inColDefaultValue = inColDefaultValue;
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
