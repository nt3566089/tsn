package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of B_CULTURE as TABLE. <br>
 * カルチャマスタ
 * <pre>
 * [primary-key]
 *     CULTURE_ID
 *
 * [column]
 *     CULTURE_ID, CULTURE_CD, DICT_ID, LANG_CULTURE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CULTURE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, B_CULTURE, V_DICT, B_CULTURE_ATTRIBUTE(AsOne)
 *
 * [referrer-table]
 *     B_CULTURE, B_DICT_CULTURE, B_INFO, B_MESSAGE, B_USER, M_CENTER, B_CULTURE_ATTRIBUTE
 *
 * [foreign-property]
 *     bDict, bCultureSelf, vDict, bCultureAttributeAsOne
 *
 * [referrer-property]
 *     bCultureSelfList, bDictCultureList, bInfoList, bMessageList, bUserList, mCenterList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBCultureDto implements Serializable {

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
    /** CULTURE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _cultureId;

    /** CULTURE_CD: {UQ, NotNull, varchar(30)} */
    @JsonKey
    protected String _cultureCd;

    /** DICT_ID: {IX, bigint(19), FK to B_DICT} */
    @JsonKey
    protected Long _dictId;

    /** LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE} */
    @JsonKey
    protected Long _langCultureId;

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
    public BsBCultureDto() {
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

    protected BCultureDto _bCultureSelf;

    public BCultureDto getBCultureSelf() {
        return _bCultureSelf;
    }

    public void setBCultureSelf(BCultureDto bCultureSelf) {
        this._bCultureSelf = bCultureSelf;
    }

    protected VDictDto _vDict;

    public VDictDto getVDict() {
        return _vDict;
    }

    public void setVDict(VDictDto vDict) {
        this._vDict = vDict;
    }

    protected BCultureAttributeDto _bCultureAttributeAsOne;

    public BCultureAttributeDto getBCultureAttributeAsOne() {
        return _bCultureAttributeAsOne;
    }

    public void setBCultureAttributeAsOne(BCultureAttributeDto BCultureAttributeAsOne) {
        this._bCultureAttributeAsOne = BCultureAttributeAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<BCultureDto> _bCultureSelfList;

    public List<BCultureDto> getBCultureSelfList() {
        if (_bCultureSelfList == null) { _bCultureSelfList = new ArrayList<BCultureDto>(); }
        return _bCultureSelfList;
    }

    public void setBCultureSelfList(List<BCultureDto> bCultureSelfList) {
        this._bCultureSelfList = bCultureSelfList;
    }

    protected List<BDictCultureDto> _bDictCultureList;

    public List<BDictCultureDto> getBDictCultureList() {
        if (_bDictCultureList == null) { _bDictCultureList = new ArrayList<BDictCultureDto>(); }
        return _bDictCultureList;
    }

    public void setBDictCultureList(List<BDictCultureDto> bDictCultureList) {
        this._bDictCultureList = bDictCultureList;
    }

    protected List<BInfoDto> _bInfoList;

    public List<BInfoDto> getBInfoList() {
        if (_bInfoList == null) { _bInfoList = new ArrayList<BInfoDto>(); }
        return _bInfoList;
    }

    public void setBInfoList(List<BInfoDto> bInfoList) {
        this._bInfoList = bInfoList;
    }

    protected List<BMessageDto> _bMessageList;

    public List<BMessageDto> getBMessageList() {
        if (_bMessageList == null) { _bMessageList = new ArrayList<BMessageDto>(); }
        return _bMessageList;
    }

    public void setBMessageList(List<BMessageDto> bMessageList) {
        this._bMessageList = bMessageList;
    }

    protected List<BUserDto> _bUserList;

    public List<BUserDto> getBUserList() {
        if (_bUserList == null) { _bUserList = new ArrayList<BUserDto>(); }
        return _bUserList;
    }

    public void setBUserList(List<BUserDto> bUserList) {
        this._bUserList = bUserList;
    }

    protected List<MCenterDto> _mCenterList;

    public List<MCenterDto> getMCenterList() {
        if (_mCenterList == null) { _mCenterList = new ArrayList<MCenterDto>(); }
        return _mCenterList;
    }

    public void setMCenterList(List<MCenterDto> mCenterList) {
        this._mCenterList = mCenterList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBCultureDto)) { return false; }
        final BsBCultureDto otherEntity = (BsBCultureDto)other;
        if (!helpComparingValue(getCultureId(), otherEntity.getCultureId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "B_CULTURE");
        result = xCH(result, getCultureId());
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
        sb.append(c).append(getCultureId());
        sb.append(c).append(getCultureCd());
        sb.append(c).append(getDictId());
        sb.append(c).append(getLangCultureId());
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
     * [get] CULTURE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * カルチャID
     * @return The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public Long getCultureId() {
        return _cultureId;
    }

    /**
     * [set] CULTURE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * カルチャID
     * @param cultureId The value of the column 'CULTURE_ID'. (NullAllowed)
     */
    public void setCultureId(Long cultureId) {
        __modifiedProperties.add("cultureId");
        this._cultureId = cultureId;
    }

    /**
     * [get] CULTURE_CD: {UQ, NotNull, varchar(30)} <br>
     * カルチャCD
     * @return The value of the column 'CULTURE_CD'. (NullAllowed)
     */
    public String getCultureCd() {
        return _cultureCd;
    }

    /**
     * [set] CULTURE_CD: {UQ, NotNull, varchar(30)} <br>
     * カルチャCD
     * @param cultureCd The value of the column 'CULTURE_CD'. (NullAllowed)
     */
    public void setCultureCd(String cultureCd) {
        __modifiedProperties.add("cultureCd");
        this._cultureCd = cultureCd;
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
     * [get] LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE} <br>
     * 言語カルチャID
     * @return The value of the column 'LANG_CULTURE_ID'. (NullAllowed)
     */
    public Long getLangCultureId() {
        return _langCultureId;
    }

    /**
     * [set] LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE} <br>
     * 言語カルチャID
     * @param langCultureId The value of the column 'LANG_CULTURE_ID'. (NullAllowed)
     */
    public void setLangCultureId(Long langCultureId) {
        __modifiedProperties.add("langCultureId");
        this._langCultureId = langCultureId;
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
