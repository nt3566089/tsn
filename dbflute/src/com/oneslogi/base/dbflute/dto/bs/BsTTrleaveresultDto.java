package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRLEAVERESULT as TABLE. <br>
 * 出庫実績情報
 * <pre>
 * [primary-key]
 *     TRLEAVERESULT_ID
 *
 * [column]
 *     TRLEAVERESULT_ID, LEAVERESULTKEY, REFNO, TAXPALLETNO, FACTORYCD, PRODUCT_CD, MACHINENO, CREATENO, RCVKEY, CASEFLG, FIRMCARRYNO, LIMITDATE, DESIGNCD, BATJMFYM, QTY, LASTITEMCD, LASTDESIGNCD, SHIPCD, CARRYOUTDATE, SHIPTOCD, RCVDATE, SHTYPECD, TPLQTY, RCVPALLETNO, CASEQTY, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRLEAVERESULT_ID
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
public abstract class BsTTrleaveresultDto implements Serializable {

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
    /** TRLEAVERESULT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trleaveresultId;

    /** LEAVERESULTKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _leaveresultkey;

    /** REFNO: {varchar(30)} */
    @JsonKey
    protected String _refno;

    /** TAXPALLETNO: {varchar(30)} */
    @JsonKey
    protected String _taxpalletno;

    /** FACTORYCD: {varchar(30)} */
    @JsonKey
    protected String _factorycd;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** MACHINENO: {varchar(30)} */
    @JsonKey
    protected String _machineno;

    /** CREATENO: {varchar(30)} */
    @JsonKey
    protected String _createno;

    /** RCVKEY: {varchar(30)} */
    @JsonKey
    protected String _rcvkey;

    /** CASEFLG: {char(1)} */
    @JsonKey
    protected String _caseflg;

    /** FIRMCARRYNO: {varchar(30)} */
    @JsonKey
    protected String _firmcarryno;

    /** LIMITDATE: {varchar(8)} */
    @JsonKey
    protected String _limitdate;

    /** DESIGNCD: {varchar(30)} */
    @JsonKey
    protected String _designcd;

    /** BATJMFYM: {varchar(30)} */
    @JsonKey
    protected String _batjmfym;

    /** QTY: {varchar(255)} */
    @JsonKey
    protected String _qty;

    /** LASTITEMCD: {varchar(30)} */
    @JsonKey
    protected String _lastitemcd;

    /** LASTDESIGNCD: {varchar(30)} */
    @JsonKey
    protected String _lastdesigncd;

    /** SHIPCD: {varchar(30)} */
    @JsonKey
    protected String _shipcd;

    /** CARRYOUTDATE: {varchar(8)} */
    @JsonKey
    protected String _carryoutdate;

    /** SHIPTOCD: {varchar(30)} */
    @JsonKey
    protected String _shiptocd;

    /** RCVDATE: {varchar(8)} */
    @JsonKey
    protected String _rcvdate;

    /** SHTYPECD: {varchar(30)} */
    @JsonKey
    protected String _shtypecd;

    /** TPLQTY: {varchar(30)} */
    @JsonKey
    protected String _tplqty;

    /** RCVPALLETNO: {varchar(30)} */
    @JsonKey
    protected String _rcvpalletno;

    /** CASEQTY: {varchar(30)} */
    @JsonKey
    protected String _caseqty;

    /** VA_EXTDATA1: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata1;

    /** VA_EXTDATA2: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata2;

    /** VA_EXTDATA3: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata3;

    /** NV_EXTDATA1: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata1;

    /** NV_EXTDATA2: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata2;

    /** NV_EXTDATA3: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata3;

    /** NM_EXTDATA1: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata1;

    /** NM_EXTDATA2: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata2;

    /** NM_EXTDATA3: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata3;

    /** DT_EXTDATA1: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata1;

    /** DT_EXTDATA2: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata2;

    /** DT_EXTDATA3: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata3;

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
    public BsTTrleaveresultDto() {
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
        if (other == null || !(other instanceof BsTTrleaveresultDto)) { return false; }
        final BsTTrleaveresultDto otherEntity = (BsTTrleaveresultDto)other;
        if (!helpComparingValue(getTrleaveresultId(), otherEntity.getTrleaveresultId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRLEAVERESULT");
        result = xCH(result, getTrleaveresultId());
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
        sb.append(c).append(getTrleaveresultId());
        sb.append(c).append(getLeaveresultkey());
        sb.append(c).append(getRefno());
        sb.append(c).append(getTaxpalletno());
        sb.append(c).append(getFactorycd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getMachineno());
        sb.append(c).append(getCreateno());
        sb.append(c).append(getRcvkey());
        sb.append(c).append(getCaseflg());
        sb.append(c).append(getFirmcarryno());
        sb.append(c).append(getLimitdate());
        sb.append(c).append(getDesigncd());
        sb.append(c).append(getBatjmfym());
        sb.append(c).append(getQty());
        sb.append(c).append(getLastitemcd());
        sb.append(c).append(getLastdesigncd());
        sb.append(c).append(getShipcd());
        sb.append(c).append(getCarryoutdate());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getRcvdate());
        sb.append(c).append(getShtypecd());
        sb.append(c).append(getTplqty());
        sb.append(c).append(getRcvpalletno());
        sb.append(c).append(getCaseqty());
        sb.append(c).append(getVaExtdata1());
        sb.append(c).append(getVaExtdata2());
        sb.append(c).append(getVaExtdata3());
        sb.append(c).append(getNvExtdata1());
        sb.append(c).append(getNvExtdata2());
        sb.append(c).append(getNvExtdata3());
        sb.append(c).append(getNmExtdata1());
        sb.append(c).append(getNmExtdata2());
        sb.append(c).append(getNmExtdata3());
        sb.append(c).append(getDtExtdata1());
        sb.append(c).append(getDtExtdata2());
        sb.append(c).append(getDtExtdata3());
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
     * [get] TRLEAVERESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫実績情報ID
     * @return The value of the column 'TRLEAVERESULT_ID'. (NullAllowed)
     */
    public Long getTrleaveresultId() {
        return _trleaveresultId;
    }

    /**
     * [set] TRLEAVERESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫実績情報ID
     * @param trleaveresultId The value of the column 'TRLEAVERESULT_ID'. (NullAllowed)
     */
    public void setTrleaveresultId(Long trleaveresultId) {
        __modifiedProperties.add("trleaveresultId");
        this._trleaveresultId = trleaveresultId;
    }

    /**
     * [get] LEAVERESULTKEY: {NotNull, decimal(16, 6)} <br>
     * 出庫実績キー
     * @return The value of the column 'LEAVERESULTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getLeaveresultkey() {
        return _leaveresultkey;
    }

    /**
     * [set] LEAVERESULTKEY: {NotNull, decimal(16, 6)} <br>
     * 出庫実績キー
     * @param leaveresultkey The value of the column 'LEAVERESULTKEY'. (NullAllowed)
     */
    public void setLeaveresultkey(java.math.BigDecimal leaveresultkey) {
        __modifiedProperties.add("leaveresultkey");
        this._leaveresultkey = leaveresultkey;
    }

    /**
     * [get] REFNO: {varchar(30)} <br>
     * 整理番号
     * @return The value of the column 'REFNO'. (NullAllowed)
     */
    public String getRefno() {
        return _refno;
    }

    /**
     * [set] REFNO: {varchar(30)} <br>
     * 整理番号
     * @param refno The value of the column 'REFNO'. (NullAllowed)
     */
    public void setRefno(String refno) {
        __modifiedProperties.add("refno");
        this._refno = refno;
    }

    /**
     * [get] TAXPALLETNO: {varchar(30)} <br>
     * 保税パレット番号
     * @return The value of the column 'TAXPALLETNO'. (NullAllowed)
     */
    public String getTaxpalletno() {
        return _taxpalletno;
    }

    /**
     * [set] TAXPALLETNO: {varchar(30)} <br>
     * 保税パレット番号
     * @param taxpalletno The value of the column 'TAXPALLETNO'. (NullAllowed)
     */
    public void setTaxpalletno(String taxpalletno) {
        __modifiedProperties.add("taxpalletno");
        this._taxpalletno = taxpalletno;
    }

    /**
     * [get] FACTORYCD: {varchar(30)} <br>
     * 工場CD
     * @return The value of the column 'FACTORYCD'. (NullAllowed)
     */
    public String getFactorycd() {
        return _factorycd;
    }

    /**
     * [set] FACTORYCD: {varchar(30)} <br>
     * 工場CD
     * @param factorycd The value of the column 'FACTORYCD'. (NullAllowed)
     */
    public void setFactorycd(String factorycd) {
        __modifiedProperties.add("factorycd");
        this._factorycd = factorycd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] MACHINENO: {varchar(30)} <br>
     * 号機
     * @return The value of the column 'MACHINENO'. (NullAllowed)
     */
    public String getMachineno() {
        return _machineno;
    }

    /**
     * [set] MACHINENO: {varchar(30)} <br>
     * 号機
     * @param machineno The value of the column 'MACHINENO'. (NullAllowed)
     */
    public void setMachineno(String machineno) {
        __modifiedProperties.add("machineno");
        this._machineno = machineno;
    }

    /**
     * [get] CREATENO: {varchar(30)} <br>
     * 生出番号
     * @return The value of the column 'CREATENO'. (NullAllowed)
     */
    public String getCreateno() {
        return _createno;
    }

    /**
     * [set] CREATENO: {varchar(30)} <br>
     * 生出番号
     * @param createno The value of the column 'CREATENO'. (NullAllowed)
     */
    public void setCreateno(String createno) {
        __modifiedProperties.add("createno");
        this._createno = createno;
    }

    /**
     * [get] RCVKEY: {varchar(30)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (NullAllowed)
     */
    public String getRcvkey() {
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {varchar(30)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed)
     */
    public void setRcvkey(String rcvkey) {
        __modifiedProperties.add("rcvkey");
        this._rcvkey = rcvkey;
    }

    /**
     * [get] CASEFLG: {char(1)} <br>
     * 段ボール有無フラグ
     * @return The value of the column 'CASEFLG'. (NullAllowed)
     */
    public String getCaseflg() {
        return _caseflg;
    }

    /**
     * [set] CASEFLG: {char(1)} <br>
     * 段ボール有無フラグ
     * @param caseflg The value of the column 'CASEFLG'. (NullAllowed)
     */
    public void setCaseflg(String caseflg) {
        __modifiedProperties.add("caseflg");
        this._caseflg = caseflg;
    }

    /**
     * [get] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public String getFirmcarryno() {
        return _firmcarryno;
    }

    /**
     * [set] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmcarryno The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public void setFirmcarryno(String firmcarryno) {
        __modifiedProperties.add("firmcarryno");
        this._firmcarryno = firmcarryno;
    }

    /**
     * [get] LIMITDATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public String getLimitdate() {
        return _limitdate;
    }

    /**
     * [set] LIMITDATE: {varchar(8)} <br>
     * 製造年月日
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed)
     */
    public void setLimitdate(String limitdate) {
        __modifiedProperties.add("limitdate");
        this._limitdate = limitdate;
    }

    /**
     * [get] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public String getDesigncd() {
        return _designcd;
    }

    /**
     * [set] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public void setDesigncd(String designcd) {
        __modifiedProperties.add("designcd");
        this._designcd = designcd;
    }

    /**
     * [get] BATJMFYM: {varchar(30)} <br>
     * BATJ製造月記号
     * @return The value of the column 'BATJMFYM'. (NullAllowed)
     */
    public String getBatjmfym() {
        return _batjmfym;
    }

    /**
     * [set] BATJMFYM: {varchar(30)} <br>
     * BATJ製造月記号
     * @param batjmfym The value of the column 'BATJMFYM'. (NullAllowed)
     */
    public void setBatjmfym(String batjmfym) {
        __modifiedProperties.add("batjmfym");
        this._batjmfym = batjmfym;
    }

    /**
     * [get] QTY: {varchar(255)} <br>
     * 個装数量
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public String getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {varchar(255)} <br>
     * 個装数量
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(String qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
    }

    /**
     * [get] LASTITEMCD: {varchar(30)} <br>
     * 銘柄変更前銘柄CD
     * @return The value of the column 'LASTITEMCD'. (NullAllowed)
     */
    public String getLastitemcd() {
        return _lastitemcd;
    }

    /**
     * [set] LASTITEMCD: {varchar(30)} <br>
     * 銘柄変更前銘柄CD
     * @param lastitemcd The value of the column 'LASTITEMCD'. (NullAllowed)
     */
    public void setLastitemcd(String lastitemcd) {
        __modifiedProperties.add("lastitemcd");
        this._lastitemcd = lastitemcd;
    }

    /**
     * [get] LASTDESIGNCD: {varchar(30)} <br>
     * 銘柄変更前デザイン区分
     * @return The value of the column 'LASTDESIGNCD'. (NullAllowed)
     */
    public String getLastdesigncd() {
        return _lastdesigncd;
    }

    /**
     * [set] LASTDESIGNCD: {varchar(30)} <br>
     * 銘柄変更前デザイン区分
     * @param lastdesigncd The value of the column 'LASTDESIGNCD'. (NullAllowed)
     */
    public void setLastdesigncd(String lastdesigncd) {
        __modifiedProperties.add("lastdesigncd");
        this._lastdesigncd = lastdesigncd;
    }

    /**
     * [get] SHIPCD: {varchar(30)} <br>
     * 発地CD
     * @return The value of the column 'SHIPCD'. (NullAllowed)
     */
    public String getShipcd() {
        return _shipcd;
    }

    /**
     * [set] SHIPCD: {varchar(30)} <br>
     * 発地CD
     * @param shipcd The value of the column 'SHIPCD'. (NullAllowed)
     */
    public void setShipcd(String shipcd) {
        __modifiedProperties.add("shipcd");
        this._shipcd = shipcd;
    }

    /**
     * [get] CARRYOUTDATE: {varchar(8)} <br>
     * 払出実績日
     * @return The value of the column 'CARRYOUTDATE'. (NullAllowed)
     */
    public String getCarryoutdate() {
        return _carryoutdate;
    }

    /**
     * [set] CARRYOUTDATE: {varchar(8)} <br>
     * 払出実績日
     * @param carryoutdate The value of the column 'CARRYOUTDATE'. (NullAllowed)
     */
    public void setCarryoutdate(String carryoutdate) {
        __modifiedProperties.add("carryoutdate");
        this._carryoutdate = carryoutdate;
    }

    /**
     * [get] SHIPTOCD: {varchar(30)} <br>
     * 着地CD
     * @return The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public String getShiptocd() {
        return _shiptocd;
    }

    /**
     * [set] SHIPTOCD: {varchar(30)} <br>
     * 着地CD
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public void setShiptocd(String shiptocd) {
        __modifiedProperties.add("shiptocd");
        this._shiptocd = shiptocd;
    }

    /**
     * [get] RCVDATE: {varchar(8)} <br>
     * 受入予定日
     * @return The value of the column 'RCVDATE'. (NullAllowed)
     */
    public String getRcvdate() {
        return _rcvdate;
    }

    /**
     * [set] RCVDATE: {varchar(8)} <br>
     * 受入予定日
     * @param rcvdate The value of the column 'RCVDATE'. (NullAllowed)
     */
    public void setRcvdate(String rcvdate) {
        __modifiedProperties.add("rcvdate");
        this._rcvdate = rcvdate;
    }

    /**
     * [get] SHTYPECD: {varchar(30)} <br>
     * 輸送形態CD
     * @return The value of the column 'SHTYPECD'. (NullAllowed)
     */
    public String getShtypecd() {
        return _shtypecd;
    }

    /**
     * [set] SHTYPECD: {varchar(30)} <br>
     * 輸送形態CD
     * @param shtypecd The value of the column 'SHTYPECD'. (NullAllowed)
     */
    public void setShtypecd(String shtypecd) {
        __modifiedProperties.add("shtypecd");
        this._shtypecd = shtypecd;
    }

    /**
     * [get] TPLQTY: {varchar(30)} <br>
     * 総パレット数
     * @return The value of the column 'TPLQTY'. (NullAllowed)
     */
    public String getTplqty() {
        return _tplqty;
    }

    /**
     * [set] TPLQTY: {varchar(30)} <br>
     * 総パレット数
     * @param tplqty The value of the column 'TPLQTY'. (NullAllowed)
     */
    public void setTplqty(String tplqty) {
        __modifiedProperties.add("tplqty");
        this._tplqty = tplqty;
    }

    /**
     * [get] RCVPALLETNO: {varchar(30)} <br>
     * 08需給パレット番号
     * @return The value of the column 'RCVPALLETNO'. (NullAllowed)
     */
    public String getRcvpalletno() {
        return _rcvpalletno;
    }

    /**
     * [set] RCVPALLETNO: {varchar(30)} <br>
     * 08需給パレット番号
     * @param rcvpalletno The value of the column 'RCVPALLETNO'. (NullAllowed)
     */
    public void setRcvpalletno(String rcvpalletno) {
        __modifiedProperties.add("rcvpalletno");
        this._rcvpalletno = rcvpalletno;
    }

    /**
     * [get] CASEQTY: {varchar(30)} <br>
     * 段ボール数
     * @return The value of the column 'CASEQTY'. (NullAllowed)
     */
    public String getCaseqty() {
        return _caseqty;
    }

    /**
     * [set] CASEQTY: {varchar(30)} <br>
     * 段ボール数
     * @param caseqty The value of the column 'CASEQTY'. (NullAllowed)
     */
    public void setCaseqty(String caseqty) {
        __modifiedProperties.add("caseqty");
        this._caseqty = caseqty;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public String getVaExtdata1() {
        return _vaExtdata1;
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public void setVaExtdata1(String vaExtdata1) {
        __modifiedProperties.add("vaExtdata1");
        this._vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @return The value of the column 'VA_EXTDATA2'. (NullAllowed)
     */
    public String getVaExtdata2() {
        return _vaExtdata2;
    }

    /**
     * [set] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @param vaExtdata2 The value of the column 'VA_EXTDATA2'. (NullAllowed)
     */
    public void setVaExtdata2(String vaExtdata2) {
        __modifiedProperties.add("vaExtdata2");
        this._vaExtdata2 = vaExtdata2;
    }

    /**
     * [get] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @return The value of the column 'VA_EXTDATA3'. (NullAllowed)
     */
    public String getVaExtdata3() {
        return _vaExtdata3;
    }

    /**
     * [set] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @param vaExtdata3 The value of the column 'VA_EXTDATA3'. (NullAllowed)
     */
    public void setVaExtdata3(String vaExtdata3) {
        __modifiedProperties.add("vaExtdata3");
        this._vaExtdata3 = vaExtdata3;
    }

    /**
     * [get] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @return The value of the column 'NV_EXTDATA1'. (NullAllowed)
     */
    public String getNvExtdata1() {
        return _nvExtdata1;
    }

    /**
     * [set] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @param nvExtdata1 The value of the column 'NV_EXTDATA1'. (NullAllowed)
     */
    public void setNvExtdata1(String nvExtdata1) {
        __modifiedProperties.add("nvExtdata1");
        this._nvExtdata1 = nvExtdata1;
    }

    /**
     * [get] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @return The value of the column 'NV_EXTDATA2'. (NullAllowed)
     */
    public String getNvExtdata2() {
        return _nvExtdata2;
    }

    /**
     * [set] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @param nvExtdata2 The value of the column 'NV_EXTDATA2'. (NullAllowed)
     */
    public void setNvExtdata2(String nvExtdata2) {
        __modifiedProperties.add("nvExtdata2");
        this._nvExtdata2 = nvExtdata2;
    }

    /**
     * [get] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @return The value of the column 'NV_EXTDATA3'. (NullAllowed)
     */
    public String getNvExtdata3() {
        return _nvExtdata3;
    }

    /**
     * [set] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @param nvExtdata3 The value of the column 'NV_EXTDATA3'. (NullAllowed)
     */
    public void setNvExtdata3(String nvExtdata3) {
        __modifiedProperties.add("nvExtdata3");
        this._nvExtdata3 = nvExtdata3;
    }

    /**
     * [get] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @return The value of the column 'NM_EXTDATA1'. (NullAllowed)
     */
    public Long getNmExtdata1() {
        return _nmExtdata1;
    }

    /**
     * [set] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @param nmExtdata1 The value of the column 'NM_EXTDATA1'. (NullAllowed)
     */
    public void setNmExtdata1(Long nmExtdata1) {
        __modifiedProperties.add("nmExtdata1");
        this._nmExtdata1 = nmExtdata1;
    }

    /**
     * [get] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @return The value of the column 'NM_EXTDATA2'. (NullAllowed)
     */
    public Long getNmExtdata2() {
        return _nmExtdata2;
    }

    /**
     * [set] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @param nmExtdata2 The value of the column 'NM_EXTDATA2'. (NullAllowed)
     */
    public void setNmExtdata2(Long nmExtdata2) {
        __modifiedProperties.add("nmExtdata2");
        this._nmExtdata2 = nmExtdata2;
    }

    /**
     * [get] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @return The value of the column 'NM_EXTDATA3'. (NullAllowed)
     */
    public Long getNmExtdata3() {
        return _nmExtdata3;
    }

    /**
     * [set] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @param nmExtdata3 The value of the column 'NM_EXTDATA3'. (NullAllowed)
     */
    public void setNmExtdata3(Long nmExtdata3) {
        __modifiedProperties.add("nmExtdata3");
        this._nmExtdata3 = nmExtdata3;
    }

    /**
     * [get] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @return The value of the column 'DT_EXTDATA1'. (NullAllowed)
     */
    public String getDtExtdata1() {
        return _dtExtdata1;
    }

    /**
     * [set] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @param dtExtdata1 The value of the column 'DT_EXTDATA1'. (NullAllowed)
     */
    public void setDtExtdata1(String dtExtdata1) {
        __modifiedProperties.add("dtExtdata1");
        this._dtExtdata1 = dtExtdata1;
    }

    /**
     * [get] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @return The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    public String getDtExtdata2() {
        return _dtExtdata2;
    }

    /**
     * [set] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @param dtExtdata2 The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    public void setDtExtdata2(String dtExtdata2) {
        __modifiedProperties.add("dtExtdata2");
        this._dtExtdata2 = dtExtdata2;
    }

    /**
     * [get] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @return The value of the column 'DT_EXTDATA3'. (NullAllowed)
     */
    public String getDtExtdata3() {
        return _dtExtdata3;
    }

    /**
     * [set] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @param dtExtdata3 The value of the column 'DT_EXTDATA3'. (NullAllowed)
     */
    public void setDtExtdata3(String dtExtdata3) {
        __modifiedProperties.add("dtExtdata3");
        this._dtExtdata3 = dtExtdata3;
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
