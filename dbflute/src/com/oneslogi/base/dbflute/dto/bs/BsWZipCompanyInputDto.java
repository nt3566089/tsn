package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_ZIP_COMPANY_INPUT as TABLE. <br>
 * 郵便番号マスタ(大口事業所)取込ワーク
 * <pre>
 * [primary-key]
 *     ZIP_COMPANY_INPUT_ID
 *
 * [column]
 *     ZIP_COMPANY_INPUT_ID, PUBLIC_CD, COMPANY_KN, COMPANY_NM, ADDRESS1, ADDRESS2, ADDRESS3, ADDRESS4, ZIP_CD, ZIP_CD_5, HANDLING_ADDRESS, FLG5, FLG6, UPD_CD, COMPANY_FLG, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZIP_COMPANY_INPUT_ID
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
public abstract class BsWZipCompanyInputDto implements Serializable {

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
    /** ZIP_COMPANY_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _zipCompanyInputId;

    /** PUBLIC_CD: {varchar(255)} */
    @JsonKey
    protected String _publicCd;

    /** COMPANY_KN: {varchar(255)} */
    @JsonKey
    protected String _companyKn;

    /** COMPANY_NM: {varchar(255)} */
    @JsonKey
    protected String _companyNm;

    /** ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _address1;

    /** ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _address2;

    /** ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _address3;

    /** ADDRESS4: {varchar(255)} */
    @JsonKey
    protected String _address4;

    /** ZIP_CD: {varchar(255)} */
    @JsonKey
    protected String _zipCd;

    /** ZIP_CD_5: {varchar(255)} */
    @JsonKey
    protected String _zipCd5;

    /** HANDLING_ADDRESS: {varchar(255)} */
    @JsonKey
    protected String _handlingAddress;

    /** FLG5: {varchar(255)} */
    @JsonKey
    protected String _flg5;

    /** FLG6: {varchar(255)} */
    @JsonKey
    protected String _flg6;

    /** UPD_CD: {varchar(255)} */
    @JsonKey
    protected String _updCd;

    /** COMPANY_FLG: {varchar(255), default=[1]} */
    @JsonKey
    protected String _companyFlg;

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
    public BsWZipCompanyInputDto() {
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
        if (other == null || !(other instanceof BsWZipCompanyInputDto)) { return false; }
        final BsWZipCompanyInputDto otherEntity = (BsWZipCompanyInputDto)other;
        if (!helpComparingValue(getZipCompanyInputId(), otherEntity.getZipCompanyInputId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_ZIP_COMPANY_INPUT");
        result = xCH(result, getZipCompanyInputId());
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
        sb.append(c).append(getZipCompanyInputId());
        sb.append(c).append(getPublicCd());
        sb.append(c).append(getCompanyKn());
        sb.append(c).append(getCompanyNm());
        sb.append(c).append(getAddress1());
        sb.append(c).append(getAddress2());
        sb.append(c).append(getAddress3());
        sb.append(c).append(getAddress4());
        sb.append(c).append(getZipCd());
        sb.append(c).append(getZipCd5());
        sb.append(c).append(getHandlingAddress());
        sb.append(c).append(getFlg5());
        sb.append(c).append(getFlg6());
        sb.append(c).append(getUpdCd());
        sb.append(c).append(getCompanyFlg());
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
     * [get] ZIP_COMPANY_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 郵便番号マスタ(大口事業所)取込ワークID
     * @return The value of the column 'ZIP_COMPANY_INPUT_ID'. (NullAllowed)
     */
    public Long getZipCompanyInputId() {
        return _zipCompanyInputId;
    }

    /**
     * [set] ZIP_COMPANY_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 郵便番号マスタ(大口事業所)取込ワークID
     * @param zipCompanyInputId The value of the column 'ZIP_COMPANY_INPUT_ID'. (NullAllowed)
     */
    public void setZipCompanyInputId(Long zipCompanyInputId) {
        __modifiedProperties.add("zipCompanyInputId");
        this._zipCompanyInputId = zipCompanyInputId;
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
     * [get] COMPANY_KN: {varchar(255)} <br>
     * 大口事業所名カナ
     * @return The value of the column 'COMPANY_KN'. (NullAllowed)
     */
    public String getCompanyKn() {
        return _companyKn;
    }

    /**
     * [set] COMPANY_KN: {varchar(255)} <br>
     * 大口事業所名カナ
     * @param companyKn The value of the column 'COMPANY_KN'. (NullAllowed)
     */
    public void setCompanyKn(String companyKn) {
        __modifiedProperties.add("companyKn");
        this._companyKn = companyKn;
    }

    /**
     * [get] COMPANY_NM: {varchar(255)} <br>
     * 大口事業所名
     * @return The value of the column 'COMPANY_NM'. (NullAllowed)
     */
    public String getCompanyNm() {
        return _companyNm;
    }

    /**
     * [set] COMPANY_NM: {varchar(255)} <br>
     * 大口事業所名
     * @param companyNm The value of the column 'COMPANY_NM'. (NullAllowed)
     */
    public void setCompanyNm(String companyNm) {
        __modifiedProperties.add("companyNm");
        this._companyNm = companyNm;
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
     * [get] ADDRESS4: {varchar(255)} <br>
     * 小字
     * @return The value of the column 'ADDRESS4'. (NullAllowed)
     */
    public String getAddress4() {
        return _address4;
    }

    /**
     * [set] ADDRESS4: {varchar(255)} <br>
     * 小字
     * @param address4 The value of the column 'ADDRESS4'. (NullAllowed)
     */
    public void setAddress4(String address4) {
        __modifiedProperties.add("address4");
        this._address4 = address4;
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
     * [get] HANDLING_ADDRESS: {varchar(255)} <br>
     * 取扱局
     * @return The value of the column 'HANDLING_ADDRESS'. (NullAllowed)
     */
    public String getHandlingAddress() {
        return _handlingAddress;
    }

    /**
     * [set] HANDLING_ADDRESS: {varchar(255)} <br>
     * 取扱局
     * @param handlingAddress The value of the column 'HANDLING_ADDRESS'. (NullAllowed)
     */
    public void setHandlingAddress(String handlingAddress) {
        __modifiedProperties.add("handlingAddress");
        this._handlingAddress = handlingAddress;
    }

    /**
     * [get] FLG5: {varchar(255)} <br>
     * フラグ５
     * @return The value of the column 'FLG5'. (NullAllowed)
     */
    public String getFlg5() {
        return _flg5;
    }

    /**
     * [set] FLG5: {varchar(255)} <br>
     * フラグ５
     * @param flg5 The value of the column 'FLG5'. (NullAllowed)
     */
    public void setFlg5(String flg5) {
        __modifiedProperties.add("flg5");
        this._flg5 = flg5;
    }

    /**
     * [get] FLG6: {varchar(255)} <br>
     * フラグ６
     * @return The value of the column 'FLG6'. (NullAllowed)
     */
    public String getFlg6() {
        return _flg6;
    }

    /**
     * [set] FLG6: {varchar(255)} <br>
     * フラグ６
     * @param flg6 The value of the column 'FLG6'. (NullAllowed)
     */
    public void setFlg6(String flg6) {
        __modifiedProperties.add("flg6");
        this._flg6 = flg6;
    }

    /**
     * [get] UPD_CD: {varchar(255)} <br>
     * 修正CD
     * @return The value of the column 'UPD_CD'. (NullAllowed)
     */
    public String getUpdCd() {
        return _updCd;
    }

    /**
     * [set] UPD_CD: {varchar(255)} <br>
     * 修正CD
     * @param updCd The value of the column 'UPD_CD'. (NullAllowed)
     */
    public void setUpdCd(String updCd) {
        __modifiedProperties.add("updCd");
        this._updCd = updCd;
    }

    /**
     * [get] COMPANY_FLG: {varchar(255), default=[1]} <br>
     * 大口事業所フラグ
     * @return The value of the column 'COMPANY_FLG'. (NullAllowed)
     */
    public String getCompanyFlg() {
        return _companyFlg;
    }

    /**
     * [set] COMPANY_FLG: {varchar(255), default=[1]} <br>
     * 大口事業所フラグ
     * @param companyFlg The value of the column 'COMPANY_FLG'. (NullAllowed)
     */
    public void setCompanyFlg(String companyFlg) {
        __modifiedProperties.add("companyFlg");
        this._companyFlg = companyFlg;
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
