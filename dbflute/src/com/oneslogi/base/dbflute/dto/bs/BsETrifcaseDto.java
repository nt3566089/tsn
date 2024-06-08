package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_TRIFCASE as TABLE. <br>
 * IFケース情報
 * <pre>
 * [primary-key]
 *     JTSYMBOLNO
 *
 * [column]
 *     JTSYMBOLNO, FACTORYCD, PRODUCT_CD, MACHINENO, LIMITDATE, ORDERNO, CREATENO, SKUCD, DESTINATIONCD, MANUFACTURECD, DATETIME, DISTRIBUTIONCD, PALLETID, TRANSPORTCD, SHIPTOCD, HEAD_ORDERNO, CASEQTY, FRACTQTY, SYMBOLADDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public abstract class BsETrifcaseDto implements Serializable {

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
    /** JTSYMBOLNO: {PK, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _jtsymbolno;

    /** FACTORYCD: {varchar(30)} */
    @JsonKey
    protected String _factorycd;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** MACHINENO: {varchar(30)} */
    @JsonKey
    protected String _machineno;

    /** LIMITDATE: {varchar(8)} */
    @JsonKey
    protected String _limitdate;

    /** ORDERNO: {varchar(30)} */
    @JsonKey
    protected String _orderno;

    /** CREATENO: {varchar(30)} */
    @JsonKey
    protected String _createno;

    /** SKUCD: {varchar(30)} */
    @JsonKey
    protected String _skucd;

    /** DESTINATIONCD: {varchar(30)} */
    @JsonKey
    protected String _destinationcd;

    /** MANUFACTURECD: {varchar(30)} */
    @JsonKey
    protected String _manufacturecd;

    /** DATETIME: {varchar(8)} */
    @JsonKey
    protected String _datetime;

    /** DISTRIBUTIONCD: {char(1)} */
    @JsonKey
    protected String _distributioncd;

    /** PALLETID: {varchar(30)} */
    @JsonKey
    protected String _palletid;

    /** TRANSPORTCD: {varchar(30)} */
    @JsonKey
    protected String _transportcd;

    /** SHIPTOCD: {varchar(30)} */
    @JsonKey
    protected String _shiptocd;

    /** HEAD_ORDERNO: {varchar(30)} */
    @JsonKey
    protected String _headOrderno;

    /** CASEQTY: {bigint(19)} */
    @JsonKey
    protected Long _caseqty;

    /** FRACTQTY: {bigint(19)} */
    @JsonKey
    protected Long _fractqty;

    /** SYMBOLADDFLG: {char(1)} */
    @JsonKey
    protected String _symboladdflg;

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
    public BsETrifcaseDto() {
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
        if (other == null || !(other instanceof BsETrifcaseDto)) { return false; }
        final BsETrifcaseDto otherEntity = (BsETrifcaseDto)other;
        if (!helpComparingValue(getJtsymbolno(), otherEntity.getJtsymbolno())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_TRIFCASE");
        result = xCH(result, getJtsymbolno());
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
        sb.append(c).append(getJtsymbolno());
        sb.append(c).append(getFactorycd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getMachineno());
        sb.append(c).append(getLimitdate());
        sb.append(c).append(getOrderno());
        sb.append(c).append(getCreateno());
        sb.append(c).append(getSkucd());
        sb.append(c).append(getDestinationcd());
        sb.append(c).append(getManufacturecd());
        sb.append(c).append(getDatetime());
        sb.append(c).append(getDistributioncd());
        sb.append(c).append(getPalletid());
        sb.append(c).append(getTransportcd());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getHeadOrderno());
        sb.append(c).append(getCaseqty());
        sb.append(c).append(getFractqty());
        sb.append(c).append(getSymboladdflg());
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
     * [get] JTSYMBOLNO: {PK, NotNull, decimal(16, 6)} <br>
     * JT段ボール管理番号
     * @return The value of the column 'JTSYMBOLNO'. (NullAllowed)
     */
    public java.math.BigDecimal getJtsymbolno() {
        return _jtsymbolno;
    }

    /**
     * [set] JTSYMBOLNO: {PK, NotNull, decimal(16, 6)} <br>
     * JT段ボール管理番号
     * @param jtsymbolno The value of the column 'JTSYMBOLNO'. (NullAllowed)
     */
    public void setJtsymbolno(java.math.BigDecimal jtsymbolno) {
        __modifiedProperties.add("jtsymbolno");
        this._jtsymbolno = jtsymbolno;
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
     * [get] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @return The value of the column 'ORDERNO'. (NullAllowed)
     */
    public String getOrderno() {
        return _orderno;
    }

    /**
     * [set] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @param orderno The value of the column 'ORDERNO'. (NullAllowed)
     */
    public void setOrderno(String orderno) {
        __modifiedProperties.add("orderno");
        this._orderno = orderno;
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
     * [get] SKUCD: {varchar(30)} <br>
     * SKUCD
     * @return The value of the column 'SKUCD'. (NullAllowed)
     */
    public String getSkucd() {
        return _skucd;
    }

    /**
     * [set] SKUCD: {varchar(30)} <br>
     * SKUCD
     * @param skucd The value of the column 'SKUCD'. (NullAllowed)
     */
    public void setSkucd(String skucd) {
        __modifiedProperties.add("skucd");
        this._skucd = skucd;
    }

    /**
     * [get] DESTINATIONCD: {varchar(30)} <br>
     * 仕向地CD
     * @return The value of the column 'DESTINATIONCD'. (NullAllowed)
     */
    public String getDestinationcd() {
        return _destinationcd;
    }

    /**
     * [set] DESTINATIONCD: {varchar(30)} <br>
     * 仕向地CD
     * @param destinationcd The value of the column 'DESTINATIONCD'. (NullAllowed)
     */
    public void setDestinationcd(String destinationcd) {
        __modifiedProperties.add("destinationcd");
        this._destinationcd = destinationcd;
    }

    /**
     * [get] MANUFACTURECD: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURECD'. (NullAllowed)
     */
    public String getManufacturecd() {
        return _manufacturecd;
    }

    /**
     * [set] MANUFACTURECD: {varchar(30)} <br>
     * 製造記号
     * @param manufacturecd The value of the column 'MANUFACTURECD'. (NullAllowed)
     */
    public void setManufacturecd(String manufacturecd) {
        __modifiedProperties.add("manufacturecd");
        this._manufacturecd = manufacturecd;
    }

    /**
     * [get] DATETIME: {varchar(8)} <br>
     * 日付時刻
     * @return The value of the column 'DATETIME'. (NullAllowed)
     */
    public String getDatetime() {
        return _datetime;
    }

    /**
     * [set] DATETIME: {varchar(8)} <br>
     * 日付時刻
     * @param datetime The value of the column 'DATETIME'. (NullAllowed)
     */
    public void setDatetime(String datetime) {
        __modifiedProperties.add("datetime");
        this._datetime = datetime;
    }

    /**
     * [get] DISTRIBUTIONCD: {char(1)} <br>
     * 流通識別
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public String getDistributioncd() {
        return _distributioncd;
    }

    /**
     * [set] DISTRIBUTIONCD: {char(1)} <br>
     * 流通識別
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed)
     */
    public void setDistributioncd(String distributioncd) {
        __modifiedProperties.add("distributioncd");
        this._distributioncd = distributioncd;
    }

    /**
     * [get] PALLETID: {varchar(30)} <br>
     * パレットID
     * @return The value of the column 'PALLETID'. (NullAllowed)
     */
    public String getPalletid() {
        return _palletid;
    }

    /**
     * [set] PALLETID: {varchar(30)} <br>
     * パレットID
     * @param palletid The value of the column 'PALLETID'. (NullAllowed)
     */
    public void setPalletid(String palletid) {
        __modifiedProperties.add("palletid");
        this._palletid = palletid;
    }

    /**
     * [get] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public String getTransportcd() {
        return _transportcd;
    }

    /**
     * [set] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public void setTransportcd(String transportcd) {
        __modifiedProperties.add("transportcd");
        this._transportcd = transportcd;
    }

    /**
     * [get] SHIPTOCD: {varchar(30)} <br>
     * 受入先CD
     * @return The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public String getShiptocd() {
        return _shiptocd;
    }

    /**
     * [set] SHIPTOCD: {varchar(30)} <br>
     * 受入先CD
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public void setShiptocd(String shiptocd) {
        __modifiedProperties.add("shiptocd");
        this._shiptocd = shiptocd;
    }

    /**
     * [get] HEAD_ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @return The value of the column 'HEAD_ORDERNO'. (NullAllowed)
     */
    public String getHeadOrderno() {
        return _headOrderno;
    }

    /**
     * [set] HEAD_ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @param headOrderno The value of the column 'HEAD_ORDERNO'. (NullAllowed)
     */
    public void setHeadOrderno(String headOrderno) {
        __modifiedProperties.add("headOrderno");
        this._headOrderno = headOrderno;
    }

    /**
     * [get] CASEQTY: {bigint(19)} <br>
     * ケース数
     * @return The value of the column 'CASEQTY'. (NullAllowed)
     */
    public Long getCaseqty() {
        return _caseqty;
    }

    /**
     * [set] CASEQTY: {bigint(19)} <br>
     * ケース数
     * @param caseqty The value of the column 'CASEQTY'. (NullAllowed)
     */
    public void setCaseqty(Long caseqty) {
        __modifiedProperties.add("caseqty");
        this._caseqty = caseqty;
    }

    /**
     * [get] FRACTQTY: {bigint(19)} <br>
     * 個数
     * @return The value of the column 'FRACTQTY'. (NullAllowed)
     */
    public Long getFractqty() {
        return _fractqty;
    }

    /**
     * [set] FRACTQTY: {bigint(19)} <br>
     * 個数
     * @param fractqty The value of the column 'FRACTQTY'. (NullAllowed)
     */
    public void setFractqty(Long fractqty) {
        __modifiedProperties.add("fractqty");
        this._fractqty = fractqty;
    }

    /**
     * [get] SYMBOLADDFLG: {char(1)} <br>
     * 段ボール作成済フラグ
     * @return The value of the column 'SYMBOLADDFLG'. (NullAllowed)
     */
    public String getSymboladdflg() {
        return _symboladdflg;
    }

    /**
     * [set] SYMBOLADDFLG: {char(1)} <br>
     * 段ボール作成済フラグ
     * @param symboladdflg The value of the column 'SYMBOLADDFLG'. (NullAllowed)
     */
    public void setSymboladdflg(String symboladdflg) {
        __modifiedProperties.add("symboladdflg");
        this._symboladdflg = symboladdflg;
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
