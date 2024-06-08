package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_PRODUCT_SEND as TABLE. <br>
 * 銘柄テーブル送信
 * <pre>
 * [primary-key]
 *     PRODUCT_SEND_ID
 *
 * [column]
 *     PRODUCT_SEND_ID, SEND_CD, SEND_ROW_ID, PROCESSED_FLG, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, PRICE_BUY, UNIT2, BX_PER_NUMBER, P_BX_COUNT, F_USER1, LENGTH1, WIDTH1, HEIGHT1, P_ODD, SP_OPERATOR1, MANUITEMCD, USERUSE3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_SEND_ID
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
public abstract class BsEProductSendDto implements Serializable {

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
    /** PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _productSendId;

    /** SEND_CD: {varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_ROW_ID: {bigint(19)} */
    @JsonKey
    protected Long _sendRowId;

    /** PROCESSED_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _processedFlg;

    /** PRODUCT_CD: {NotNull, varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {NotNull, varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** PRODUCT_ABBR: {NotNull, varchar(60)} */
    @JsonKey
    protected String _productAbbr;

    /** PRICE_BUY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _priceBuy;

    /** UNIT2: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _unit2;

    /** BX_PER_NUMBER: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _bxPerNumber;

    /** P_BX_COUNT: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _pBxCount;

    /** F_USER1: {varchar(30)} */
    @JsonKey
    protected String _fUser1;

    /** LENGTH1: {bigint(19)} */
    @JsonKey
    protected Long _length1;

    /** WIDTH1: {bigint(19)} */
    @JsonKey
    protected Long _width1;

    /** HEIGHT1: {bigint(19)} */
    @JsonKey
    protected Long _height1;

    /** P_ODD: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _pOdd;

    /** SP_OPERATOR1: {varchar(30)} */
    @JsonKey
    protected String _spOperator1;

    /** MANUITEMCD: {varchar(30)} */
    @JsonKey
    protected String _manuitemcd;

    /** USERUSE3: {NotNull, varchar(60)} */
    @JsonKey
    protected String _useruse3;

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
    public BsEProductSendDto() {
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
        if (other == null || !(other instanceof BsEProductSendDto)) { return false; }
        final BsEProductSendDto otherEntity = (BsEProductSendDto)other;
        if (!helpComparingValue(getProductSendId(), otherEntity.getProductSendId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_PRODUCT_SEND");
        result = xCH(result, getProductSendId());
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
        sb.append(c).append(getProductSendId());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getSendRowId());
        sb.append(c).append(getProcessedFlg());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getProductAbbr());
        sb.append(c).append(getPriceBuy());
        sb.append(c).append(getUnit2());
        sb.append(c).append(getBxPerNumber());
        sb.append(c).append(getPBxCount());
        sb.append(c).append(getFUser1());
        sb.append(c).append(getLength1());
        sb.append(c).append(getWidth1());
        sb.append(c).append(getHeight1());
        sb.append(c).append(getPOdd());
        sb.append(c).append(getSpOperator1());
        sb.append(c).append(getManuitemcd());
        sb.append(c).append(getUseruse3());
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
     * [get] PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 銘柄テーブル送信ID
     * @return The value of the column 'PRODUCT_SEND_ID'. (NullAllowed)
     */
    public Long getProductSendId() {
        return _productSendId;
    }

    /**
     * [set] PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 銘柄テーブル送信ID
     * @param productSendId The value of the column 'PRODUCT_SEND_ID'. (NullAllowed)
     */
    public void setProductSendId(Long productSendId) {
        __modifiedProperties.add("productSendId");
        this._productSendId = productSendId;
    }

    /**
     * [get] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed)
     */
    public String getSendCd() {
        return _sendCd;
    }

    /**
     * [set] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed)
     */
    public void setSendCd(String sendCd) {
        __modifiedProperties.add("sendCd");
        this._sendCd = sendCd;
    }

    /**
     * [get] SEND_ROW_ID: {bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public Long getSendRowId() {
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public void setSendRowId(Long sendRowId) {
        __modifiedProperties.add("sendRowId");
        this._sendRowId = sendRowId;
    }

    /**
     * [get] PROCESSED_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'PROCESSED_FLG'. (NullAllowed)
     */
    public String getProcessedFlg() {
        return _processedFlg;
    }

    /**
     * [set] PROCESSED_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @param processedFlg The value of the column 'PROCESSED_FLG'. (NullAllowed)
     */
    public void setProcessedFlg(String processedFlg) {
        __modifiedProperties.add("processedFlg");
        this._processedFlg = processedFlg;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(100)} <br>
     * 銘柄コード
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(100)} <br>
     * 銘柄コード
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {NotNull, varchar(255)} <br>
     * 銘柄名正称（全角）
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {NotNull, varchar(255)} <br>
     * 銘柄名正称（全角）
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] PRODUCT_ABBR: {NotNull, varchar(60)} <br>
     * 銘柄名略称（半角）
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public String getProductAbbr() {
        return _productAbbr;
    }

    /**
     * [set] PRODUCT_ABBR: {NotNull, varchar(60)} <br>
     * 銘柄名略称（半角）
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed)
     */
    public void setProductAbbr(String productAbbr) {
        __modifiedProperties.add("productAbbr");
        this._productAbbr = productAbbr;
    }

    /**
     * [get] PRICE_BUY: {NotNull, bigint(19)} <br>
     * 装置本数
     * @return The value of the column 'PRICE_BUY'. (NullAllowed)
     */
    public Long getPriceBuy() {
        return _priceBuy;
    }

    /**
     * [set] PRICE_BUY: {NotNull, bigint(19)} <br>
     * 装置本数
     * @param priceBuy The value of the column 'PRICE_BUY'. (NullAllowed)
     */
    public void setPriceBuy(Long priceBuy) {
        __modifiedProperties.add("priceBuy");
        this._priceBuy = priceBuy;
    }

    /**
     * [get] UNIT2: {NotNull, decimal(16, 6)} <br>
     * 1カートン当個数
     * @return The value of the column 'UNIT2'. (NullAllowed)
     */
    public java.math.BigDecimal getUnit2() {
        return _unit2;
    }

    /**
     * [set] UNIT2: {NotNull, decimal(16, 6)} <br>
     * 1カートン当個数
     * @param unit2 The value of the column 'UNIT2'. (NullAllowed)
     */
    public void setUnit2(java.math.BigDecimal unit2) {
        __modifiedProperties.add("unit2");
        this._unit2 = unit2;
    }

    /**
     * [get] BX_PER_NUMBER: {NotNull, decimal(16, 6)} <br>
     * 1段ボール当個数
     * @return The value of the column 'BX_PER_NUMBER'. (NullAllowed)
     */
    public java.math.BigDecimal getBxPerNumber() {
        return _bxPerNumber;
    }

    /**
     * [set] BX_PER_NUMBER: {NotNull, decimal(16, 6)} <br>
     * 1段ボール当個数
     * @param bxPerNumber The value of the column 'BX_PER_NUMBER'. (NullAllowed)
     */
    public void setBxPerNumber(java.math.BigDecimal bxPerNumber) {
        __modifiedProperties.add("bxPerNumber");
        this._bxPerNumber = bxPerNumber;
    }

    /**
     * [get] P_BX_COUNT: {NotNull, decimal(16, 6)} <br>
     * 1パレット当段ボール数
     * @return The value of the column 'P_BX_COUNT'. (NullAllowed)
     */
    public java.math.BigDecimal getPBxCount() {
        return _pBxCount;
    }

    /**
     * [set] P_BX_COUNT: {NotNull, decimal(16, 6)} <br>
     * 1パレット当段ボール数
     * @param pBxCount The value of the column 'P_BX_COUNT'. (NullAllowed)
     */
    public void setPBxCount(java.math.BigDecimal pBxCount) {
        __modifiedProperties.add("PBxCount");
        this._pBxCount = pBxCount;
    }

    /**
     * [get] F_USER1: {varchar(30)} <br>
     * 特販業者コード
     * @return The value of the column 'F_USER1'. (NullAllowed)
     */
    public String getFUser1() {
        return _fUser1;
    }

    /**
     * [set] F_USER1: {varchar(30)} <br>
     * 特販業者コード
     * @param fUser1 The value of the column 'F_USER1'. (NullAllowed)
     */
    public void setFUser1(String fUser1) {
        __modifiedProperties.add("FUser1");
        this._fUser1 = fUser1;
    }

    /**
     * [get] LENGTH1: {bigint(19)} <br>
     * 段ボール長さ（縦）
     * @return The value of the column 'LENGTH1'. (NullAllowed)
     */
    public Long getLength1() {
        return _length1;
    }

    /**
     * [set] LENGTH1: {bigint(19)} <br>
     * 段ボール長さ（縦）
     * @param length1 The value of the column 'LENGTH1'. (NullAllowed)
     */
    public void setLength1(Long length1) {
        __modifiedProperties.add("length1");
        this._length1 = length1;
    }

    /**
     * [get] WIDTH1: {bigint(19)} <br>
     * 段ボール幅（横）
     * @return The value of the column 'WIDTH1'. (NullAllowed)
     */
    public Long getWidth1() {
        return _width1;
    }

    /**
     * [set] WIDTH1: {bigint(19)} <br>
     * 段ボール幅（横）
     * @param width1 The value of the column 'WIDTH1'. (NullAllowed)
     */
    public void setWidth1(Long width1) {
        __modifiedProperties.add("width1");
        this._width1 = width1;
    }

    /**
     * [get] HEIGHT1: {bigint(19)} <br>
     * 段ボール高さ
     * @return The value of the column 'HEIGHT1'. (NullAllowed)
     */
    public Long getHeight1() {
        return _height1;
    }

    /**
     * [set] HEIGHT1: {bigint(19)} <br>
     * 段ボール高さ
     * @param height1 The value of the column 'HEIGHT1'. (NullAllowed)
     */
    public void setHeight1(Long height1) {
        __modifiedProperties.add("height1");
        this._height1 = height1;
    }

    /**
     * [get] P_ODD: {decimal(16, 6)} <br>
     * 一段基準数
     * @return The value of the column 'P_ODD'. (NullAllowed)
     */
    public java.math.BigDecimal getPOdd() {
        return _pOdd;
    }

    /**
     * [set] P_ODD: {decimal(16, 6)} <br>
     * 一段基準数
     * @param pOdd The value of the column 'P_ODD'. (NullAllowed)
     */
    public void setPOdd(java.math.BigDecimal pOdd) {
        __modifiedProperties.add("POdd");
        this._pOdd = pOdd;
    }

    /**
     * [get] SP_OPERATOR1: {varchar(30)} <br>
     * 段ボールコード
     * @return The value of the column 'SP_OPERATOR1'. (NullAllowed)
     */
    public String getSpOperator1() {
        return _spOperator1;
    }

    /**
     * [set] SP_OPERATOR1: {varchar(30)} <br>
     * 段ボールコード
     * @param spOperator1 The value of the column 'SP_OPERATOR1'. (NullAllowed)
     */
    public void setSpOperator1(String spOperator1) {
        __modifiedProperties.add("spOperator1");
        this._spOperator1 = spOperator1;
    }

    /**
     * [get] MANUITEMCD: {varchar(30)} <br>
     * ITFバーコード
     * @return The value of the column 'MANUITEMCD'. (NullAllowed)
     */
    public String getManuitemcd() {
        return _manuitemcd;
    }

    /**
     * [set] MANUITEMCD: {varchar(30)} <br>
     * ITFバーコード
     * @param manuitemcd The value of the column 'MANUITEMCD'. (NullAllowed)
     */
    public void setManuitemcd(String manuitemcd) {
        __modifiedProperties.add("manuitemcd");
        this._manuitemcd = manuitemcd;
    }

    /**
     * [get] USERUSE3: {NotNull, varchar(60)} <br>
     * レコード更新処理区分
     * @return The value of the column 'USERUSE3'. (NullAllowed)
     */
    public String getUseruse3() {
        return _useruse3;
    }

    /**
     * [set] USERUSE3: {NotNull, varchar(60)} <br>
     * レコード更新処理区分
     * @param useruse3 The value of the column 'USERUSE3'. (NullAllowed)
     */
    public void setUseruse3(String useruse3) {
        __modifiedProperties.add("useruse3");
        this._useruse3 = useruse3;
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
