package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_ZIP_INPUT as TABLE. <br>
 * 郵便番号マスタ取込ワーク
 * <pre>
 * [primary-key]
 *     ZIP_INPUT_ID
 *
 * [column]
 *     ZIP_INPUT_ID, PUBLIC_CD, ZIP_CD_5, ZIP_CD, ADDRESS_KN1, ADDRESS_KN2, ADDRESS_KN3, ADDRESS1, ADDRESS2, ADDRESS3, FLG1, FLG2, FLG3, FLG4, UPD_TYPE, REASON_TYPE, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZIP_INPUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWZipInputDto implements Serializable {

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
    /** ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _zipInputId;

    /** PUBLIC_CD: {varchar(255)} */
    @JsonKey
    protected String _publicCd;

    /** ZIP_CD_5: {varchar(255)} */
    @JsonKey
    protected String _zipCd5;

    /** ZIP_CD: {varchar(255)} */
    @JsonKey
    protected String _zipCd;

    /** ADDRESS_KN1: {varchar(255)} */
    @JsonKey
    protected String _addressKn1;

    /** ADDRESS_KN2: {varchar(255)} */
    @JsonKey
    protected String _addressKn2;

    /** ADDRESS_KN3: {varchar(255)} */
    @JsonKey
    protected String _addressKn3;

    /** ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _address1;

    /** ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _address2;

    /** ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _address3;

    /** FLG1: {varchar(255)} */
    @JsonKey
    protected String _flg1;

    /** FLG2: {varchar(255)} */
    @JsonKey
    protected String _flg2;

    /** FLG3: {varchar(255)} */
    @JsonKey
    protected String _flg3;

    /** FLG4: {varchar(255)} */
    @JsonKey
    protected String _flg4;

    /** UPD_TYPE: {varchar(255)} */
    @JsonKey
    protected String _updType;

    /** REASON_TYPE: {varchar(255)} */
    @JsonKey
    protected String _reasonType;

    /** LINE_NO: {bigint(19)} */
    @JsonKey
    protected Long _lineNo;

    /** WORK_FLG: {char(1)} */
    @JsonKey
    protected String _workFlg;

    /** ERROR_FLG: {char(1)} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MSG: {varchar(2147483647)} */
    @JsonKey
    protected String _errorMsg;

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
    public BsWZipInputDto() {
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
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWZipInputDto)) { return false; }
        final BsWZipInputDto otherEntity = (BsWZipInputDto)other;
        if (!helpComparingValue(getZipInputId(), otherEntity.getZipInputId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_ZIP_INPUT");
        result = xCH(result, getZipInputId());
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
        sb.append(c).append(getZipInputId());
        sb.append(c).append(getPublicCd());
        sb.append(c).append(getZipCd5());
        sb.append(c).append(getZipCd());
        sb.append(c).append(getAddressKn1());
        sb.append(c).append(getAddressKn2());
        sb.append(c).append(getAddressKn3());
        sb.append(c).append(getAddress1());
        sb.append(c).append(getAddress2());
        sb.append(c).append(getAddress3());
        sb.append(c).append(getFlg1());
        sb.append(c).append(getFlg2());
        sb.append(c).append(getFlg3());
        sb.append(c).append(getFlg4());
        sb.append(c).append(getUpdType());
        sb.append(c).append(getReasonType());
        sb.append(c).append(getLineNo());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMsg());
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
     * [get] ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 郵便番号マスタ取込ワークID
     * @return The value of the column 'ZIP_INPUT_ID'. (NullAllowed)
     */
    public Long getZipInputId() {
        return _zipInputId;
    }

    /**
     * [set] ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 郵便番号マスタ取込ワークID
     * @param zipInputId The value of the column 'ZIP_INPUT_ID'. (NullAllowed)
     */
    public void setZipInputId(Long zipInputId) {
        __modifiedProperties.add("zipInputId");
        this._zipInputId = zipInputId;
    }

    /**
     * [get] PUBLIC_CD: {varchar(255)} <br>
     * 全国地方公共団体CD
     * @return The value of the column 'PUBLIC_CD'. (NullAllowed)
     */
    public String getPublicCd() {
        return _publicCd;
    }

    /**
     * [set] PUBLIC_CD: {varchar(255)} <br>
     * 全国地方公共団体CD
     * @param publicCd The value of the column 'PUBLIC_CD'. (NullAllowed)
     */
    public void setPublicCd(String publicCd) {
        __modifiedProperties.add("publicCd");
        this._publicCd = publicCd;
    }

    /**
     * [get] ZIP_CD_5: {varchar(255)} <br>
     * 旧郵便番号
     * @return The value of the column 'ZIP_CD_5'. (NullAllowed)
     */
    public String getZipCd5() {
        return _zipCd5;
    }

    /**
     * [set] ZIP_CD_5: {varchar(255)} <br>
     * 旧郵便番号
     * @param zipCd5 The value of the column 'ZIP_CD_5'. (NullAllowed)
     */
    public void setZipCd5(String zipCd5) {
        __modifiedProperties.add("zipCd5");
        this._zipCd5 = zipCd5;
    }

    /**
     * [get] ZIP_CD: {varchar(255)} <br>
     * 郵便番号
     * @return The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public String getZipCd() {
        return _zipCd;
    }

    /**
     * [set] ZIP_CD: {varchar(255)} <br>
     * 郵便番号
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public void setZipCd(String zipCd) {
        __modifiedProperties.add("zipCd");
        this._zipCd = zipCd;
    }

    /**
     * [get] ADDRESS_KN1: {varchar(255)} <br>
     * 都道府県名カナ
     * @return The value of the column 'ADDRESS_KN1'. (NullAllowed)
     */
    public String getAddressKn1() {
        return _addressKn1;
    }

    /**
     * [set] ADDRESS_KN1: {varchar(255)} <br>
     * 都道府県名カナ
     * @param addressKn1 The value of the column 'ADDRESS_KN1'. (NullAllowed)
     */
    public void setAddressKn1(String addressKn1) {
        __modifiedProperties.add("addressKn1");
        this._addressKn1 = addressKn1;
    }

    /**
     * [get] ADDRESS_KN2: {varchar(255)} <br>
     * 市区町村名カナ
     * @return The value of the column 'ADDRESS_KN2'. (NullAllowed)
     */
    public String getAddressKn2() {
        return _addressKn2;
    }

    /**
     * [set] ADDRESS_KN2: {varchar(255)} <br>
     * 市区町村名カナ
     * @param addressKn2 The value of the column 'ADDRESS_KN2'. (NullAllowed)
     */
    public void setAddressKn2(String addressKn2) {
        __modifiedProperties.add("addressKn2");
        this._addressKn2 = addressKn2;
    }

    /**
     * [get] ADDRESS_KN3: {varchar(255)} <br>
     * 町域名カナ
     * @return The value of the column 'ADDRESS_KN3'. (NullAllowed)
     */
    public String getAddressKn3() {
        return _addressKn3;
    }

    /**
     * [set] ADDRESS_KN3: {varchar(255)} <br>
     * 町域名カナ
     * @param addressKn3 The value of the column 'ADDRESS_KN3'. (NullAllowed)
     */
    public void setAddressKn3(String addressKn3) {
        __modifiedProperties.add("addressKn3");
        this._addressKn3 = addressKn3;
    }

    /**
     * [get] ADDRESS1: {varchar(255)} <br>
     * 都道府県名
     * @return The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public String getAddress1() {
        return _address1;
    }

    /**
     * [set] ADDRESS1: {varchar(255)} <br>
     * 都道府県名
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public void setAddress1(String address1) {
        __modifiedProperties.add("address1");
        this._address1 = address1;
    }

    /**
     * [get] ADDRESS2: {varchar(255)} <br>
     * 市区町村名
     * @return The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public String getAddress2() {
        return _address2;
    }

    /**
     * [set] ADDRESS2: {varchar(255)} <br>
     * 市区町村名
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public void setAddress2(String address2) {
        __modifiedProperties.add("address2");
        this._address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(255)} <br>
     * 町域名
     * @return The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public String getAddress3() {
        return _address3;
    }

    /**
     * [set] ADDRESS3: {varchar(255)} <br>
     * 町域名
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public void setAddress3(String address3) {
        __modifiedProperties.add("address3");
        this._address3 = address3;
    }

    /**
     * [get] FLG1: {varchar(255)} <br>
     * フラグ１
     * @return The value of the column 'FLG1'. (NullAllowed)
     */
    public String getFlg1() {
        return _flg1;
    }

    /**
     * [set] FLG1: {varchar(255)} <br>
     * フラグ１
     * @param flg1 The value of the column 'FLG1'. (NullAllowed)
     */
    public void setFlg1(String flg1) {
        __modifiedProperties.add("flg1");
        this._flg1 = flg1;
    }

    /**
     * [get] FLG2: {varchar(255)} <br>
     * フラグ２
     * @return The value of the column 'FLG2'. (NullAllowed)
     */
    public String getFlg2() {
        return _flg2;
    }

    /**
     * [set] FLG2: {varchar(255)} <br>
     * フラグ２
     * @param flg2 The value of the column 'FLG2'. (NullAllowed)
     */
    public void setFlg2(String flg2) {
        __modifiedProperties.add("flg2");
        this._flg2 = flg2;
    }

    /**
     * [get] FLG3: {varchar(255)} <br>
     * フラグ３
     * @return The value of the column 'FLG3'. (NullAllowed)
     */
    public String getFlg3() {
        return _flg3;
    }

    /**
     * [set] FLG3: {varchar(255)} <br>
     * フラグ３
     * @param flg3 The value of the column 'FLG3'. (NullAllowed)
     */
    public void setFlg3(String flg3) {
        __modifiedProperties.add("flg3");
        this._flg3 = flg3;
    }

    /**
     * [get] FLG4: {varchar(255)} <br>
     * フラグ４
     * @return The value of the column 'FLG4'. (NullAllowed)
     */
    public String getFlg4() {
        return _flg4;
    }

    /**
     * [set] FLG4: {varchar(255)} <br>
     * フラグ４
     * @param flg4 The value of the column 'FLG4'. (NullAllowed)
     */
    public void setFlg4(String flg4) {
        __modifiedProperties.add("flg4");
        this._flg4 = flg4;
    }

    /**
     * [get] UPD_TYPE: {varchar(255)} <br>
     * 更新の表示
     * @return The value of the column 'UPD_TYPE'. (NullAllowed)
     */
    public String getUpdType() {
        return _updType;
    }

    /**
     * [set] UPD_TYPE: {varchar(255)} <br>
     * 更新の表示
     * @param updType The value of the column 'UPD_TYPE'. (NullAllowed)
     */
    public void setUpdType(String updType) {
        __modifiedProperties.add("updType");
        this._updType = updType;
    }

    /**
     * [get] REASON_TYPE: {varchar(255)} <br>
     * 変更理由
     * @return The value of the column 'REASON_TYPE'. (NullAllowed)
     */
    public String getReasonType() {
        return _reasonType;
    }

    /**
     * [set] REASON_TYPE: {varchar(255)} <br>
     * 変更理由
     * @param reasonType The value of the column 'REASON_TYPE'. (NullAllowed)
     */
    public void setReasonType(String reasonType) {
        __modifiedProperties.add("reasonType");
        this._reasonType = reasonType;
    }

    /**
     * [get] LINE_NO: {bigint(19)} <br>
     * 行NO
     * @return The value of the column 'LINE_NO'. (NullAllowed)
     */
    public Long getLineNo() {
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {bigint(19)} <br>
     * 行NO
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed)
     */
    public void setLineNo(Long lineNo) {
        __modifiedProperties.add("lineNo");
        this._lineNo = lineNo;
    }

    /**
     * [get] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @return The value of the column 'ERROR_MSG'. (NullAllowed)
     */
    public String getErrorMsg() {
        return _errorMsg;
    }

    /**
     * [set] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @param errorMsg The value of the column 'ERROR_MSG'. (NullAllowed)
     */
    public void setErrorMsg(String errorMsg) {
        __modifiedProperties.add("errorMsg");
        this._errorMsg = errorMsg;
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
