package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of P_REPORT_LAYOUT_ITEM as TABLE. <br>
 * 帳票レイアウト項目マスタ
 * <pre>
 * [primary-key]
 *     REPORT_LAYOUT_ITEM_ID
 *
 * [column]
 *     REPORT_LAYOUT_ITEM_ID, REPORT_LAYOUT_ID, ITEM_CD, DICT_ID, ITEM_TYPE, VISIBLE, ITEM_FORMAT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPORT_LAYOUT_ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, P_REPORT_LAYOUT, V_DICT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bDict, pReportLayout, vDict
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsPReportLayoutItemDto implements Serializable {

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
    /** REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _reportLayoutItemId;

    /** REPORT_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT} */
    @JsonKey
    protected Long _reportLayoutId;

    /** ITEM_CD: {+UQ, NotNull, varchar(100)} */
    @JsonKey
    protected String _itemCd;

    /** DICT_ID: {IX, bigint(19), FK to B_DICT} */
    @JsonKey
    protected Long _dictId;

    /** ITEM_TYPE: {varchar(30)} */
    @JsonKey
    protected String _itemType;

    /** VISIBLE: {NotNull, char(1), default=[1]} */
    @JsonKey
    protected String _visible;

    /** ITEM_FORMAT: {varchar(30)} */
    @JsonKey
    protected String _itemFormat;

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
    public BsPReportLayoutItemDto() {
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

    protected PReportLayoutDto _pReportLayout;

    public PReportLayoutDto getPReportLayout() {
        return _pReportLayout;
    }

    public void setPReportLayout(PReportLayoutDto pReportLayout) {
        this._pReportLayout = pReportLayout;
    }

    protected VDictDto _vDict;

    public VDictDto getVDict() {
        return _vDict;
    }

    public void setVDict(VDictDto vDict) {
        this._vDict = vDict;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsPReportLayoutItemDto)) { return false; }
        final BsPReportLayoutItemDto otherEntity = (BsPReportLayoutItemDto)other;
        if (!helpComparingValue(getReportLayoutItemId(), otherEntity.getReportLayoutItemId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "P_REPORT_LAYOUT_ITEM");
        result = xCH(result, getReportLayoutItemId());
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
        sb.append(c).append(getReportLayoutItemId());
        sb.append(c).append(getReportLayoutId());
        sb.append(c).append(getItemCd());
        sb.append(c).append(getDictId());
        sb.append(c).append(getItemType());
        sb.append(c).append(getVisible());
        sb.append(c).append(getItemFormat());
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
     * [get] REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 帳票レイアウト項目ID
     * @return The value of the column 'REPORT_LAYOUT_ITEM_ID'. (NullAllowed)
     */
    public Long getReportLayoutItemId() {
        return _reportLayoutItemId;
    }

    /**
     * [set] REPORT_LAYOUT_ITEM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 帳票レイアウト項目ID
     * @param reportLayoutItemId The value of the column 'REPORT_LAYOUT_ITEM_ID'. (NullAllowed)
     */
    public void setReportLayoutItemId(Long reportLayoutItemId) {
        __modifiedProperties.add("reportLayoutItemId");
        this._reportLayoutItemId = reportLayoutItemId;
    }

    /**
     * [get] REPORT_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT} <br>
     * 帳票レイアウトID
     * @return The value of the column 'REPORT_LAYOUT_ID'. (NullAllowed)
     */
    public Long getReportLayoutId() {
        return _reportLayoutId;
    }

    /**
     * [set] REPORT_LAYOUT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT} <br>
     * 帳票レイアウトID
     * @param reportLayoutId The value of the column 'REPORT_LAYOUT_ID'. (NullAllowed)
     */
    public void setReportLayoutId(Long reportLayoutId) {
        __modifiedProperties.add("reportLayoutId");
        this._reportLayoutId = reportLayoutId;
    }

    /**
     * [get] ITEM_CD: {+UQ, NotNull, varchar(100)} <br>
     * 項目CD
     * @return The value of the column 'ITEM_CD'. (NullAllowed)
     */
    public String getItemCd() {
        return _itemCd;
    }

    /**
     * [set] ITEM_CD: {+UQ, NotNull, varchar(100)} <br>
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
     * [get] ITEM_TYPE: {varchar(30)} <br>
     * 項目型
     * @return The value of the column 'ITEM_TYPE'. (NullAllowed)
     */
    public String getItemType() {
        return _itemType;
    }

    /**
     * [set] ITEM_TYPE: {varchar(30)} <br>
     * 項目型
     * @param itemType The value of the column 'ITEM_TYPE'. (NullAllowed)
     */
    public void setItemType(String itemType) {
        __modifiedProperties.add("itemType");
        this._itemType = itemType;
    }

    /**
     * [get] VISIBLE: {NotNull, char(1), default=[1]} <br>
     * 表示可否
     * @return The value of the column 'VISIBLE'. (NullAllowed)
     */
    public String getVisible() {
        return _visible;
    }

    /**
     * [set] VISIBLE: {NotNull, char(1), default=[1]} <br>
     * 表示可否
     * @param visible The value of the column 'VISIBLE'. (NullAllowed)
     */
    public void setVisible(String visible) {
        __modifiedProperties.add("visible");
        this._visible = visible;
    }

    /**
     * [get] ITEM_FORMAT: {varchar(30)} <br>
     * 項目書式
     * @return The value of the column 'ITEM_FORMAT'. (NullAllowed)
     */
    public String getItemFormat() {
        return _itemFormat;
    }

    /**
     * [set] ITEM_FORMAT: {varchar(30)} <br>
     * 項目書式
     * @param itemFormat The value of the column 'ITEM_FORMAT'. (NullAllowed)
     */
    public void setItemFormat(String itemFormat) {
        __modifiedProperties.add("itemFormat");
        this._itemFormat = itemFormat;
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
