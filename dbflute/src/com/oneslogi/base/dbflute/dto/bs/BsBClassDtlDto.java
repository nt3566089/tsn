package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_CLASS_DTL as TABLE. <br>
 * 区分値明細マスタ
 * <pre>
 * [primary-key]
 *     CLASS_DTL_ID
 *
 * [column]
 *     CLASS_DTL_ID, CLASS_ID, CLASS_DTL_CD, DICT_ID, VIEW_ORDER, DEFAULT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLASS_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CLASS, B_DICT, V_DICT, B_CLASS_DTL_SUB(AsOne)
 *
 * [referrer-table]
 *     B_CLASS_GRP_DTL, B_CLASS_DTL_SUB
 *
 * [foreign-property]
 *     bClass, bDict, vDict, bClassDtlSubAsOne
 *
 * [referrer-property]
 *     bClassGrpDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBClassDtlDto implements Serializable {

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
    /** CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _classDtlId;

    /** CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS} */
    @JsonKey
    protected Long _classId;

    /** CLASS_DTL_CD: {+UQ, NotNull, varchar(100)} */
    @JsonKey
    protected String _classDtlCd;

    /** DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} */
    @JsonKey
    protected Long _dictId;

    /** VIEW_ORDER: {bigint(19)} */
    @JsonKey
    protected Long _viewOrder;

    /** DEFAULT_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _defaultFlg;

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
    public BsBClassDtlDto() {
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
    protected BClassDto _bClass;

    public BClassDto getBClass() {
        return _bClass;
    }

    public void setBClass(BClassDto bClass) {
        this._bClass = bClass;
    }

    protected BDictDto _bDict;

    public BDictDto getBDict() {
        return _bDict;
    }

    public void setBDict(BDictDto bDict) {
        this._bDict = bDict;
    }

    protected VDictDto _vDict;

    public VDictDto getVDict() {
        return _vDict;
    }

    public void setVDict(VDictDto vDict) {
        this._vDict = vDict;
    }

    protected BClassDtlSubDto _bClassDtlSubAsOne;

    public BClassDtlSubDto getBClassDtlSubAsOne() {
        return _bClassDtlSubAsOne;
    }

    public void setBClassDtlSubAsOne(BClassDtlSubDto BClassDtlSubAsOne) {
        this._bClassDtlSubAsOne = BClassDtlSubAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<BClassGrpDtlDto> _bClassGrpDtlList;

    public List<BClassGrpDtlDto> getBClassGrpDtlList() {
        if (_bClassGrpDtlList == null) { _bClassGrpDtlList = new ArrayList<BClassGrpDtlDto>(); }
        return _bClassGrpDtlList;
    }

    public void setBClassGrpDtlList(List<BClassGrpDtlDto> bClassGrpDtlList) {
        this._bClassGrpDtlList = bClassGrpDtlList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBClassDtlDto)) { return false; }
        final BsBClassDtlDto otherEntity = (BsBClassDtlDto)other;
        if (!helpComparingValue(getClassDtlId(), otherEntity.getClassDtlId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_CLASS_DTL");
        result = xCH(result, getClassDtlId());
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
        sb.append(c).append(getClassDtlId());
        sb.append(c).append(getClassId());
        sb.append(c).append(getClassDtlCd());
        sb.append(c).append(getDictId());
        sb.append(c).append(getViewOrder());
        sb.append(c).append(getDefaultFlg());
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
     * [get] CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 区分値明細ID
     * @return The value of the column 'CLASS_DTL_ID'. (NullAllowed)
     */
    public Long getClassDtlId() {
        return _classDtlId;
    }

    /**
     * [set] CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 区分値明細ID
     * @param classDtlId The value of the column 'CLASS_DTL_ID'. (NullAllowed)
     */
    public void setClassDtlId(Long classDtlId) {
        __modifiedProperties.add("classDtlId");
        this._classDtlId = classDtlId;
    }

    /**
     * [get] CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS} <br>
     * 区分値ID
     * @return The value of the column 'CLASS_ID'. (NullAllowed)
     */
    public Long getClassId() {
        return _classId;
    }

    /**
     * [set] CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS} <br>
     * 区分値ID
     * @param classId The value of the column 'CLASS_ID'. (NullAllowed)
     */
    public void setClassId(Long classId) {
        __modifiedProperties.add("classId");
        this._classId = classId;
    }

    /**
     * [get] CLASS_DTL_CD: {+UQ, NotNull, varchar(100)} <br>
     * 区分値明細CD
     * @return The value of the column 'CLASS_DTL_CD'. (NullAllowed)
     */
    public String getClassDtlCd() {
        return _classDtlCd;
    }

    /**
     * [set] CLASS_DTL_CD: {+UQ, NotNull, varchar(100)} <br>
     * 区分値明細CD
     * @param classDtlCd The value of the column 'CLASS_DTL_CD'. (NullAllowed)
     */
    public void setClassDtlCd(String classDtlCd) {
        __modifiedProperties.add("classDtlCd");
        this._classDtlCd = classDtlCd;
    }

    /**
     * [get] DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (NullAllowed)
     */
    public Long getDictId() {
        return _dictId;
    }

    /**
     * [set] DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (NullAllowed)
     */
    public void setDictId(Long dictId) {
        __modifiedProperties.add("dictId");
        this._dictId = dictId;
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
     * [get] DEFAULT_FLG: {NotNull, char(1), default=[0]} <br>
     * デフォルトフラグ
     * @return The value of the column 'DEFAULT_FLG'. (NullAllowed)
     */
    public String getDefaultFlg() {
        return _defaultFlg;
    }

    /**
     * [set] DEFAULT_FLG: {NotNull, char(1), default=[0]} <br>
     * デフォルトフラグ
     * @param defaultFlg The value of the column 'DEFAULT_FLG'. (NullAllowed)
     */
    public void setDefaultFlg(String defaultFlg) {
        __modifiedProperties.add("defaultFlg");
        this._defaultFlg = defaultFlg;
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
