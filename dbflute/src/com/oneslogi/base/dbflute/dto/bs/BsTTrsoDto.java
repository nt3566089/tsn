package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRSO as TABLE. <br>
 * 出庫予定
 * <pre>
 * [primary-key]
 *     SOID
 *
 * [column]
 *     SOID, SOKEY, OWNERSONO, PREOWNERSONO, SOTYPE, PARTFLG, STS, COMPANYCD, ORDERKEY, OWNERORDERNO, ORDERTYPE, CUSTORDERNO, CUSTOMER_CD, RMANO, ORDERDATE, SHIPSCHDATE, SHIPDATE, DELIVSCHDATE, DELIVDATE, CARRYSCHDATE, CARRYOUTDATE, TRANSPORTPRIORITY, SHIPTOCD, SHIPTOSUB, DELIVNAME, ADDRESS1, ADDRESS2, ADDRESS3, POSTNO, COUNTRYCD, PORTCD, DISTRICTCD, PHONENO, FAX1, EMAIL, REFNAME, AREACD, ALLOCGROUP, CARRIERCD, CARRIERNAME, CARRIERWBNO, DELIVERYCD, CARRIERNO, CARRIERSNAME, CARCD, CARRIERSEQ, ITEMCD, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, PICKING_INST_ID, EXECKEY, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOID
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
public abstract class BsTTrsoDto implements Serializable {

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
    /** SOID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _soid;

    /** SOKEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sokey;

    /** OWNERSONO: {varchar(60)} */
    @JsonKey
    protected String _ownersono;

    /** PREOWNERSONO: {varchar(60)} */
    @JsonKey
    protected String _preownersono;

    /** SOTYPE: {varchar(30)} */
    @JsonKey
    protected String _sotype;

    /** PARTFLG: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _partflg;

    /** STS: {IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _sts;

    /** COMPANYCD: {IX, varchar(30)} */
    @JsonKey
    protected String _companycd;

    /** ORDERKEY: {bigint(19)} */
    @JsonKey
    protected Long _orderkey;

    /** OWNERORDERNO: {varchar(60)} */
    @JsonKey
    protected String _ownerorderno;

    /** ORDERTYPE: {varchar(30)} */
    @JsonKey
    protected String _ordertype;

    /** CUSTORDERNO: {varchar(60)} */
    @JsonKey
    protected String _custorderno;

    /** CUSTOMER_CD: {varchar(60)} */
    @JsonKey
    protected String _customerCd;

    /** RMANO: {varchar(60)} */
    @JsonKey
    protected String _rmano;

    /** ORDERDATE: {varchar(8)} */
    @JsonKey
    protected String _orderdate;

    /** SHIPSCHDATE: {IX, NotNull, varchar(8)} */
    @JsonKey
    protected String _shipschdate;

    /** SHIPDATE: {IX, varchar(8)} */
    @JsonKey
    protected String _shipdate;

    /** DELIVSCHDATE: {varchar(8), default=[sysdatetime()]} */
    @JsonKey
    protected String _delivschdate;

    /** DELIVDATE: {varchar(8)} */
    @JsonKey
    protected String _delivdate;

    /** CARRYSCHDATE: {varchar(8)} */
    @JsonKey
    protected String _carryschdate;

    /** CARRYOUTDATE: {varchar(8)} */
    @JsonKey
    protected String _carryoutdate;

    /** TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _transportpriority;

    /** SHIPTOCD: {IX, varchar(30)} */
    @JsonKey
    protected String _shiptocd;

    /** SHIPTOSUB: {char(1)} */
    @JsonKey
    protected String _shiptosub;

    /** DELIVNAME: {varchar(255)} */
    @JsonKey
    protected String _delivname;

    /** ADDRESS1: {char(1)} */
    @JsonKey
    protected String _address1;

    /** ADDRESS2: {varchar(8)} */
    @JsonKey
    protected String _address2;

    /** ADDRESS3: {varchar(30)} */
    @JsonKey
    protected String _address3;

    /** POSTNO: {char(1)} */
    @JsonKey
    protected String _postno;

    /** COUNTRYCD: {varchar(30)} */
    @JsonKey
    protected String _countrycd;

    /** PORTCD: {varchar(30)} */
    @JsonKey
    protected String _portcd;

    /** DISTRICTCD: {varchar(30)} */
    @JsonKey
    protected String _districtcd;

    /** PHONENO: {varchar(60)} */
    @JsonKey
    protected String _phoneno;

    /** FAX1: {varchar(60)} */
    @JsonKey
    protected String _fax1;

    /** EMAIL: {char(1)} */
    @JsonKey
    protected String _email;

    /** REFNAME: {varchar(60)} */
    @JsonKey
    protected String _refname;

    /** AREACD: {varchar(30)} */
    @JsonKey
    protected String _areacd;

    /** ALLOCGROUP: {varchar(60)} */
    @JsonKey
    protected String _allocgroup;

    /** CARRIERCD: {varchar(30)} */
    @JsonKey
    protected String _carriercd;

    /** CARRIERNAME: {varchar(255)} */
    @JsonKey
    protected String _carriername;

    /** CARRIERWBNO: {varchar(60)} */
    @JsonKey
    protected String _carrierwbno;

    /** DELIVERYCD: {IX, varchar(30)} */
    @JsonKey
    protected String _deliverycd;

    /** CARRIERNO: {varchar(60)} */
    @JsonKey
    protected String _carrierno;

    /** CARRIERSNAME: {varchar(100)} */
    @JsonKey
    protected String _carriersname;

    /** CARCD: {varchar(30)} */
    @JsonKey
    protected String _carcd;

    /** CARRIERSEQ: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _carrierseq;

    /** ITEMCD: {varchar(30)} */
    @JsonKey
    protected String _itemcd;

    /** NOTES: {varchar(4000)} */
    @JsonKey
    protected String _notes;

    /** OTHERREFNO1: {varchar(60)} */
    @JsonKey
    protected String _otherrefno1;

    /** OTHERREFNO2: {varchar(60)} */
    @JsonKey
    protected String _otherrefno2;

    /** OTHERREFNO3: {varchar(60)} */
    @JsonKey
    protected String _otherrefno3;

    /** PICKING_INST_ID: {bigint(19)} */
    @JsonKey
    protected Long _pickingInstId;

    /** EXECKEY: {IX, bigint(19)} */
    @JsonKey
    protected Long _execkey;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientId;

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
    public BsTTrsoDto() {
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
        if (other == null || !(other instanceof BsTTrsoDto)) { return false; }
        final BsTTrsoDto otherEntity = (BsTTrsoDto)other;
        if (!helpComparingValue(getSoid(), otherEntity.getSoid())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSO");
        result = xCH(result, getSoid());
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
        sb.append(c).append(getSoid());
        sb.append(c).append(getSokey());
        sb.append(c).append(getOwnersono());
        sb.append(c).append(getPreownersono());
        sb.append(c).append(getSotype());
        sb.append(c).append(getPartflg());
        sb.append(c).append(getSts());
        sb.append(c).append(getCompanycd());
        sb.append(c).append(getOrderkey());
        sb.append(c).append(getOwnerorderno());
        sb.append(c).append(getOrdertype());
        sb.append(c).append(getCustorderno());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getRmano());
        sb.append(c).append(getOrderdate());
        sb.append(c).append(getShipschdate());
        sb.append(c).append(getShipdate());
        sb.append(c).append(getDelivschdate());
        sb.append(c).append(getDelivdate());
        sb.append(c).append(getCarryschdate());
        sb.append(c).append(getCarryoutdate());
        sb.append(c).append(getTransportpriority());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getShiptosub());
        sb.append(c).append(getDelivname());
        sb.append(c).append(getAddress1());
        sb.append(c).append(getAddress2());
        sb.append(c).append(getAddress3());
        sb.append(c).append(getPostno());
        sb.append(c).append(getCountrycd());
        sb.append(c).append(getPortcd());
        sb.append(c).append(getDistrictcd());
        sb.append(c).append(getPhoneno());
        sb.append(c).append(getFax1());
        sb.append(c).append(getEmail());
        sb.append(c).append(getRefname());
        sb.append(c).append(getAreacd());
        sb.append(c).append(getAllocgroup());
        sb.append(c).append(getCarriercd());
        sb.append(c).append(getCarriername());
        sb.append(c).append(getCarrierwbno());
        sb.append(c).append(getDeliverycd());
        sb.append(c).append(getCarrierno());
        sb.append(c).append(getCarriersname());
        sb.append(c).append(getCarcd());
        sb.append(c).append(getCarrierseq());
        sb.append(c).append(getItemcd());
        sb.append(c).append(getNotes());
        sb.append(c).append(getOtherrefno1());
        sb.append(c).append(getOtherrefno2());
        sb.append(c).append(getOtherrefno3());
        sb.append(c).append(getPickingInstId());
        sb.append(c).append(getExeckey());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
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
     * [get] SOID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (NullAllowed)
     */
    public Long getSoid() {
        return _soid;
    }

    /**
     * [set] SOID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (NullAllowed)
     */
    public void setSoid(Long soid) {
        __modifiedProperties.add("soid");
        this._soid = soid;
    }

    /**
     * [get] SOKEY: {NotNull, bigint(19)} <br>
     * 出庫指示Ｋｅｙ
     * @return The value of the column 'SOKEY'. (NullAllowed)
     */
    public Long getSokey() {
        return _sokey;
    }

    /**
     * [set] SOKEY: {NotNull, bigint(19)} <br>
     * 出庫指示Ｋｅｙ
     * @param sokey The value of the column 'SOKEY'. (NullAllowed)
     */
    public void setSokey(Long sokey) {
        __modifiedProperties.add("sokey");
        this._sokey = sokey;
    }

    /**
     * [get] OWNERSONO: {varchar(60)} <br>
     * 整理番号
     * @return The value of the column 'OWNERSONO'. (NullAllowed)
     */
    public String getOwnersono() {
        return _ownersono;
    }

    /**
     * [set] OWNERSONO: {varchar(60)} <br>
     * 整理番号
     * @param ownersono The value of the column 'OWNERSONO'. (NullAllowed)
     */
    public void setOwnersono(String ownersono) {
        __modifiedProperties.add("ownersono");
        this._ownersono = ownersono;
    }

    /**
     * [get] PREOWNERSONO: {varchar(60)} <br>
     * 元荷主出庫指示番号
     * @return The value of the column 'PREOWNERSONO'. (NullAllowed)
     */
    public String getPreownersono() {
        return _preownersono;
    }

    /**
     * [set] PREOWNERSONO: {varchar(60)} <br>
     * 元荷主出庫指示番号
     * @param preownersono The value of the column 'PREOWNERSONO'. (NullAllowed)
     */
    public void setPreownersono(String preownersono) {
        __modifiedProperties.add("preownersono");
        this._preownersono = preownersono;
    }

    /**
     * [get] SOTYPE: {varchar(30)} <br>
     * 出庫タイプ
     * @return The value of the column 'SOTYPE'. (NullAllowed)
     */
    public String getSotype() {
        return _sotype;
    }

    /**
     * [set] SOTYPE: {varchar(30)} <br>
     * 出庫タイプ
     * @param sotype The value of the column 'SOTYPE'. (NullAllowed)
     */
    public void setSotype(String sotype) {
        __modifiedProperties.add("sotype");
        this._sotype = sotype;
    }

    /**
     * [get] PARTFLG: {NotNull, char(1), default=[(0)]} <br>
     * 分割可能フラグ
     * @return The value of the column 'PARTFLG'. (NullAllowed)
     */
    public String getPartflg() {
        return _partflg;
    }

    /**
     * [set] PARTFLG: {NotNull, char(1), default=[(0)]} <br>
     * 分割可能フラグ
     * @param partflg The value of the column 'PARTFLG'. (NullAllowed)
     */
    public void setPartflg(String partflg) {
        __modifiedProperties.add("partflg");
        this._partflg = partflg;
    }

    /**
     * [get] STS: {IX, NotNull, varchar(30)} <br>
     * 出荷ステータス
     * @return The value of the column 'STS'. (NullAllowed)
     */
    public String getSts() {
        return _sts;
    }

    /**
     * [set] STS: {IX, NotNull, varchar(30)} <br>
     * 出荷ステータス
     * @param sts The value of the column 'STS'. (NullAllowed)
     */
    public void setSts(String sts) {
        __modifiedProperties.add("sts");
        this._sts = sts;
    }

    /**
     * [get] COMPANYCD: {IX, varchar(30)} <br>
     * 取引先（代理店）CD
     * @return The value of the column 'COMPANYCD'. (NullAllowed)
     */
    public String getCompanycd() {
        return _companycd;
    }

    /**
     * [set] COMPANYCD: {IX, varchar(30)} <br>
     * 取引先（代理店）CD
     * @param companycd The value of the column 'COMPANYCD'. (NullAllowed)
     */
    public void setCompanycd(String companycd) {
        __modifiedProperties.add("companycd");
        this._companycd = companycd;
    }

    /**
     * [get] ORDERKEY: {bigint(19)} <br>
     * 受注オーダＫｅｙ
     * @return The value of the column 'ORDERKEY'. (NullAllowed)
     */
    public Long getOrderkey() {
        return _orderkey;
    }

    /**
     * [set] ORDERKEY: {bigint(19)} <br>
     * 受注オーダＫｅｙ
     * @param orderkey The value of the column 'ORDERKEY'. (NullAllowed)
     */
    public void setOrderkey(Long orderkey) {
        __modifiedProperties.add("orderkey");
        this._orderkey = orderkey;
    }

    /**
     * [get] OWNERORDERNO: {varchar(60)} <br>
     * 車割キー
     * @return The value of the column 'OWNERORDERNO'. (NullAllowed)
     */
    public String getOwnerorderno() {
        return _ownerorderno;
    }

    /**
     * [set] OWNERORDERNO: {varchar(60)} <br>
     * 車割キー
     * @param ownerorderno The value of the column 'OWNERORDERNO'. (NullAllowed)
     */
    public void setOwnerorderno(String ownerorderno) {
        __modifiedProperties.add("ownerorderno");
        this._ownerorderno = ownerorderno;
    }

    /**
     * [get] ORDERTYPE: {varchar(30)} <br>
     * 依頼種別
     * @return The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public String getOrdertype() {
        return _ordertype;
    }

    /**
     * [set] ORDERTYPE: {varchar(30)} <br>
     * 依頼種別
     * @param ordertype The value of the column 'ORDERTYPE'. (NullAllowed)
     */
    public void setOrdertype(String ordertype) {
        __modifiedProperties.add("ordertype");
        this._ordertype = ordertype;
    }

    /**
     * [get] CUSTORDERNO: {varchar(60)} <br>
     * 依頼番号
     * @return The value of the column 'CUSTORDERNO'. (NullAllowed)
     */
    public String getCustorderno() {
        return _custorderno;
    }

    /**
     * [set] CUSTORDERNO: {varchar(60)} <br>
     * 依頼番号
     * @param custorderno The value of the column 'CUSTORDERNO'. (NullAllowed)
     */
    public void setCustorderno(String custorderno) {
        __modifiedProperties.add("custorderno");
        this._custorderno = custorderno;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(60)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {varchar(60)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] RMANO: {varchar(60)} <br>
     * 問合せ番号
     * @return The value of the column 'RMANO'. (NullAllowed)
     */
    public String getRmano() {
        return _rmano;
    }

    /**
     * [set] RMANO: {varchar(60)} <br>
     * 問合せ番号
     * @param rmano The value of the column 'RMANO'. (NullAllowed)
     */
    public void setRmano(String rmano) {
        __modifiedProperties.add("rmano");
        this._rmano = rmano;
    }

    /**
     * [get] ORDERDATE: {varchar(8)} <br>
     * 指図日
     * @return The value of the column 'ORDERDATE'. (NullAllowed)
     */
    public String getOrderdate() {
        return _orderdate;
    }

    /**
     * [set] ORDERDATE: {varchar(8)} <br>
     * 指図日
     * @param orderdate The value of the column 'ORDERDATE'. (NullAllowed)
     */
    public void setOrderdate(String orderdate) {
        __modifiedProperties.add("orderdate");
        this._orderdate = orderdate;
    }

    /**
     * [get] SHIPSCHDATE: {IX, NotNull, varchar(8)} <br>
     * 出庫予定日
     * @return The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public String getShipschdate() {
        return _shipschdate;
    }

    /**
     * [set] SHIPSCHDATE: {IX, NotNull, varchar(8)} <br>
     * 出庫予定日
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public void setShipschdate(String shipschdate) {
        __modifiedProperties.add("shipschdate");
        this._shipschdate = shipschdate;
    }

    /**
     * [get] SHIPDATE: {IX, varchar(8)} <br>
     * 出庫実績日
     * @return The value of the column 'SHIPDATE'. (NullAllowed)
     */
    public String getShipdate() {
        return _shipdate;
    }

    /**
     * [set] SHIPDATE: {IX, varchar(8)} <br>
     * 出庫実績日
     * @param shipdate The value of the column 'SHIPDATE'. (NullAllowed)
     */
    public void setShipdate(String shipdate) {
        __modifiedProperties.add("shipdate");
        this._shipdate = shipdate;
    }

    /**
     * [get] DELIVSCHDATE: {varchar(8), default=[sysdatetime()]} <br>
     * 受入予定日
     * @return The value of the column 'DELIVSCHDATE'. (NullAllowed)
     */
    public String getDelivschdate() {
        return _delivschdate;
    }

    /**
     * [set] DELIVSCHDATE: {varchar(8), default=[sysdatetime()]} <br>
     * 受入予定日
     * @param delivschdate The value of the column 'DELIVSCHDATE'. (NullAllowed)
     */
    public void setDelivschdate(String delivschdate) {
        __modifiedProperties.add("delivschdate");
        this._delivschdate = delivschdate;
    }

    /**
     * [get] DELIVDATE: {varchar(8)} <br>
     * 納品完了日・時刻
     * @return The value of the column 'DELIVDATE'. (NullAllowed)
     */
    public String getDelivdate() {
        return _delivdate;
    }

    /**
     * [set] DELIVDATE: {varchar(8)} <br>
     * 納品完了日・時刻
     * @param delivdate The value of the column 'DELIVDATE'. (NullAllowed)
     */
    public void setDelivdate(String delivdate) {
        __modifiedProperties.add("delivdate");
        this._delivdate = delivdate;
    }

    /**
     * [get] CARRYSCHDATE: {varchar(8)} <br>
     * 積込検品完了日
     * @return The value of the column 'CARRYSCHDATE'. (NullAllowed)
     */
    public String getCarryschdate() {
        return _carryschdate;
    }

    /**
     * [set] CARRYSCHDATE: {varchar(8)} <br>
     * 積込検品完了日
     * @param carryschdate The value of the column 'CARRYSCHDATE'. (NullAllowed)
     */
    public void setCarryschdate(String carryschdate) {
        __modifiedProperties.add("carryschdate");
        this._carryschdate = carryschdate;
    }

    /**
     * [get] CARRYOUTDATE: {varchar(8)} <br>
     * 配送（出発）完了日・時刻
     * @return The value of the column 'CARRYOUTDATE'. (NullAllowed)
     */
    public String getCarryoutdate() {
        return _carryoutdate;
    }

    /**
     * [set] CARRYOUTDATE: {varchar(8)} <br>
     * 配送（出発）完了日・時刻
     * @param carryoutdate The value of the column 'CARRYOUTDATE'. (NullAllowed)
     */
    public void setCarryoutdate(String carryoutdate) {
        __modifiedProperties.add("carryoutdate");
        this._carryoutdate = carryoutdate;
    }

    /**
     * [get] TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]} <br>
     * 配送ルート順
     * @return The value of the column 'TRANSPORTPRIORITY'. (NullAllowed)
     */
    public java.math.BigDecimal getTransportpriority() {
        return _transportpriority;
    }

    /**
     * [set] TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]} <br>
     * 配送ルート順
     * @param transportpriority The value of the column 'TRANSPORTPRIORITY'. (NullAllowed)
     */
    public void setTransportpriority(java.math.BigDecimal transportpriority) {
        __modifiedProperties.add("transportpriority");
        this._transportpriority = transportpriority;
    }

    /**
     * [get] SHIPTOCD: {IX, varchar(30)} <br>
     * 受入先CD
     * @return The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public String getShiptocd() {
        return _shiptocd;
    }

    /**
     * [set] SHIPTOCD: {IX, varchar(30)} <br>
     * 受入先CD
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public void setShiptocd(String shiptocd) {
        __modifiedProperties.add("shiptocd");
        this._shiptocd = shiptocd;
    }

    /**
     * [get] SHIPTOSUB: {char(1)} <br>
     * 出庫実績送信フラグ
     * @return The value of the column 'SHIPTOSUB'. (NullAllowed)
     */
    public String getShiptosub() {
        return _shiptosub;
    }

    /**
     * [set] SHIPTOSUB: {char(1)} <br>
     * 出庫実績送信フラグ
     * @param shiptosub The value of the column 'SHIPTOSUB'. (NullAllowed)
     */
    public void setShiptosub(String shiptosub) {
        __modifiedProperties.add("shiptosub");
        this._shiptosub = shiptosub;
    }

    /**
     * [get] DELIVNAME: {varchar(255)} <br>
     * 出庫先名称
     * @return The value of the column 'DELIVNAME'. (NullAllowed)
     */
    public String getDelivname() {
        return _delivname;
    }

    /**
     * [set] DELIVNAME: {varchar(255)} <br>
     * 出庫先名称
     * @param delivname The value of the column 'DELIVNAME'. (NullAllowed)
     */
    public void setDelivname(String delivname) {
        __modifiedProperties.add("delivname");
        this._delivname = delivname;
    }

    /**
     * [get] ADDRESS1: {char(1)} <br>
     * 送信済フラグ
     * @return The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public String getAddress1() {
        return _address1;
    }

    /**
     * [set] ADDRESS1: {char(1)} <br>
     * 送信済フラグ
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public void setAddress1(String address1) {
        __modifiedProperties.add("address1");
        this._address1 = address1;
    }

    /**
     * [get] ADDRESS2: {varchar(8)} <br>
     * 通関日
     * @return The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public String getAddress2() {
        return _address2;
    }

    /**
     * [set] ADDRESS2: {varchar(8)} <br>
     * 通関日
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public void setAddress2(String address2) {
        __modifiedProperties.add("address2");
        this._address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(30)} <br>
     * 製品区分
     * @return The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public String getAddress3() {
        return _address3;
    }

    /**
     * [set] ADDRESS3: {varchar(30)} <br>
     * 製品区分
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public void setAddress3(String address3) {
        __modifiedProperties.add("address3");
        this._address3 = address3;
    }

    /**
     * [get] POSTNO: {char(1)} <br>
     * マージ状態区分
     * @return The value of the column 'POSTNO'. (NullAllowed)
     */
    public String getPostno() {
        return _postno;
    }

    /**
     * [set] POSTNO: {char(1)} <br>
     * マージ状態区分
     * @param postno The value of the column 'POSTNO'. (NullAllowed)
     */
    public void setPostno(String postno) {
        __modifiedProperties.add("postno");
        this._postno = postno;
    }

    /**
     * [get] COUNTRYCD: {varchar(30)} <br>
     * 納品先国CD
     * @return The value of the column 'COUNTRYCD'. (NullAllowed)
     */
    public String getCountrycd() {
        return _countrycd;
    }

    /**
     * [set] COUNTRYCD: {varchar(30)} <br>
     * 納品先国CD
     * @param countrycd The value of the column 'COUNTRYCD'. (NullAllowed)
     */
    public void setCountrycd(String countrycd) {
        __modifiedProperties.add("countrycd");
        this._countrycd = countrycd;
    }

    /**
     * [get] PORTCD: {varchar(30)} <br>
     * 納品先入出港CD
     * @return The value of the column 'PORTCD'. (NullAllowed)
     */
    public String getPortcd() {
        return _portcd;
    }

    /**
     * [set] PORTCD: {varchar(30)} <br>
     * 納品先入出港CD
     * @param portcd The value of the column 'PORTCD'. (NullAllowed)
     */
    public void setPortcd(String portcd) {
        __modifiedProperties.add("portcd");
        this._portcd = portcd;
    }

    /**
     * [get] DISTRICTCD: {varchar(30)} <br>
     * 納品先地区CD
     * @return The value of the column 'DISTRICTCD'. (NullAllowed)
     */
    public String getDistrictcd() {
        return _districtcd;
    }

    /**
     * [set] DISTRICTCD: {varchar(30)} <br>
     * 納品先地区CD
     * @param districtcd The value of the column 'DISTRICTCD'. (NullAllowed)
     */
    public void setDistrictcd(String districtcd) {
        __modifiedProperties.add("districtcd");
        this._districtcd = districtcd;
    }

    /**
     * [get] PHONENO: {varchar(60)} <br>
     * 車記号
     * @return The value of the column 'PHONENO'. (NullAllowed)
     */
    public String getPhoneno() {
        return _phoneno;
    }

    /**
     * [set] PHONENO: {varchar(60)} <br>
     * 車記号
     * @param phoneno The value of the column 'PHONENO'. (NullAllowed)
     */
    public void setPhoneno(String phoneno) {
        __modifiedProperties.add("phoneno");
        this._phoneno = phoneno;
    }

    /**
     * [get] FAX1: {varchar(60)} <br>
     * 出庫経路区分
     * @return The value of the column 'FAX1'. (NullAllowed)
     */
    public String getFax1() {
        return _fax1;
    }

    /**
     * [set] FAX1: {varchar(60)} <br>
     * 出庫経路区分
     * @param fax1 The value of the column 'FAX1'. (NullAllowed)
     */
    public void setFax1(String fax1) {
        __modifiedProperties.add("fax1");
        this._fax1 = fax1;
    }

    /**
     * [get] EMAIL: {char(1)} <br>
     * 出庫完了選択フラグ
     * @return The value of the column 'EMAIL'. (NullAllowed)
     */
    public String getEmail() {
        return _email;
    }

    /**
     * [set] EMAIL: {char(1)} <br>
     * 出庫完了選択フラグ
     * @param email The value of the column 'EMAIL'. (NullAllowed)
     */
    public void setEmail(String email) {
        __modifiedProperties.add("email");
        this._email = email;
    }

    /**
     * [get] REFNAME: {varchar(60)} <br>
     * 融通輸送倉庫CD
     * @return The value of the column 'REFNAME'. (NullAllowed)
     */
    public String getRefname() {
        return _refname;
    }

    /**
     * [set] REFNAME: {varchar(60)} <br>
     * 融通輸送倉庫CD
     * @param refname The value of the column 'REFNAME'. (NullAllowed)
     */
    public void setRefname(String refname) {
        __modifiedProperties.add("refname");
        this._refname = refname;
    }

    /**
     * [get] AREACD: {varchar(30)} <br>
     * 納品先エリアCD
     * @return The value of the column 'AREACD'. (NullAllowed)
     */
    public String getAreacd() {
        return _areacd;
    }

    /**
     * [set] AREACD: {varchar(30)} <br>
     * 納品先エリアCD
     * @param areacd The value of the column 'AREACD'. (NullAllowed)
     */
    public void setAreacd(String areacd) {
        __modifiedProperties.add("areacd");
        this._areacd = areacd;
    }

    /**
     * [get] ALLOCGROUP: {varchar(60)} <br>
     * 引当締めグループ
     * @return The value of the column 'ALLOCGROUP'. (NullAllowed)
     */
    public String getAllocgroup() {
        return _allocgroup;
    }

    /**
     * [set] ALLOCGROUP: {varchar(60)} <br>
     * 引当締めグループ
     * @param allocgroup The value of the column 'ALLOCGROUP'. (NullAllowed)
     */
    public void setAllocgroup(String allocgroup) {
        __modifiedProperties.add("allocgroup");
        this._allocgroup = allocgroup;
    }

    /**
     * [get] CARRIERCD: {varchar(30)} <br>
     * 取引先（運送会社）CD
     * @return The value of the column 'CARRIERCD'. (NullAllowed)
     */
    public String getCarriercd() {
        return _carriercd;
    }

    /**
     * [set] CARRIERCD: {varchar(30)} <br>
     * 取引先（運送会社）CD
     * @param carriercd The value of the column 'CARRIERCD'. (NullAllowed)
     */
    public void setCarriercd(String carriercd) {
        __modifiedProperties.add("carriercd");
        this._carriercd = carriercd;
    }

    /**
     * [get] CARRIERNAME: {varchar(255)} <br>
     * 運送会社名称
     * @return The value of the column 'CARRIERNAME'. (NullAllowed)
     */
    public String getCarriername() {
        return _carriername;
    }

    /**
     * [set] CARRIERNAME: {varchar(255)} <br>
     * 運送会社名称
     * @param carriername The value of the column 'CARRIERNAME'. (NullAllowed)
     */
    public void setCarriername(String carriername) {
        __modifiedProperties.add("carriername");
        this._carriername = carriername;
    }

    /**
     * [get] CARRIERWBNO: {varchar(60)} <br>
     * 保税管理番号
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public String getCarrierwbno() {
        return _carrierwbno;
    }

    /**
     * [set] CARRIERWBNO: {varchar(60)} <br>
     * 保税管理番号
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed)
     */
    public void setCarrierwbno(String carrierwbno) {
        __modifiedProperties.add("carrierwbno");
        this._carrierwbno = carrierwbno;
    }

    /**
     * [get] DELIVERYCD: {IX, varchar(30)} <br>
     * 便CD
     * @return The value of the column 'DELIVERYCD'. (NullAllowed)
     */
    public String getDeliverycd() {
        return _deliverycd;
    }

    /**
     * [set] DELIVERYCD: {IX, varchar(30)} <br>
     * 便CD
     * @param deliverycd The value of the column 'DELIVERYCD'. (NullAllowed)
     */
    public void setDeliverycd(String deliverycd) {
        __modifiedProperties.add("deliverycd");
        this._deliverycd = deliverycd;
    }

    /**
     * [get] CARRIERNO: {varchar(60)} <br>
     * 輸送形態CD
     * @return The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public String getCarrierno() {
        return _carrierno;
    }

    /**
     * [set] CARRIERNO: {varchar(60)} <br>
     * 輸送形態CD
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed)
     */
    public void setCarrierno(String carrierno) {
        __modifiedProperties.add("carrierno");
        this._carrierno = carrierno;
    }

    /**
     * [get] CARRIERSNAME: {varchar(100)} <br>
     * 出庫先短縮名称
     * @return The value of the column 'CARRIERSNAME'. (NullAllowed)
     */
    public String getCarriersname() {
        return _carriersname;
    }

    /**
     * [set] CARRIERSNAME: {varchar(100)} <br>
     * 出庫先短縮名称
     * @param carriersname The value of the column 'CARRIERSNAME'. (NullAllowed)
     */
    public void setCarriersname(String carriersname) {
        __modifiedProperties.add("carriersname");
        this._carriersname = carriersname;
    }

    /**
     * [get] CARCD: {varchar(30)} <br>
     * 車輌CD
     * @return The value of the column 'CARCD'. (NullAllowed)
     */
    public String getCarcd() {
        return _carcd;
    }

    /**
     * [set] CARCD: {varchar(30)} <br>
     * 車輌CD
     * @param carcd The value of the column 'CARCD'. (NullAllowed)
     */
    public void setCarcd(String carcd) {
        __modifiedProperties.add("carcd");
        this._carcd = carcd;
    }

    /**
     * [get] CARRIERSEQ: {bigint(19), default=[(0)]} <br>
     * 運行回数
     * @return The value of the column 'CARRIERSEQ'. (NullAllowed)
     */
    public Long getCarrierseq() {
        return _carrierseq;
    }

    /**
     * [set] CARRIERSEQ: {bigint(19), default=[(0)]} <br>
     * 運行回数
     * @param carrierseq The value of the column 'CARRIERSEQ'. (NullAllowed)
     */
    public void setCarrierseq(Long carrierseq) {
        __modifiedProperties.add("carrierseq");
        this._carrierseq = carrierseq;
    }

    /**
     * [get] ITEMCD: {varchar(30)} <br>
     * @return The value of the column 'ITEMCD'. (NullAllowed)
     */
    public String getItemcd() {
        return _itemcd;
    }

    /**
     * [set] ITEMCD: {varchar(30)} <br>
     * @param itemcd The value of the column 'ITEMCD'. (NullAllowed)
     */
    public void setItemcd(String itemcd) {
        __modifiedProperties.add("itemcd");
        this._itemcd = itemcd;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 備考／特約店名称
     * @return The value of the column 'NOTES'. (NullAllowed)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 備考／特約店名称
     * @param notes The value of the column 'NOTES'. (NullAllowed)
     */
    public void setNotes(String notes) {
        __modifiedProperties.add("notes");
        this._notes = notes;
    }

    /**
     * [get] OTHERREFNO1: {varchar(60)} <br>
     * 輸送形態
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public String getOtherrefno1() {
        return _otherrefno1;
    }

    /**
     * [set] OTHERREFNO1: {varchar(60)} <br>
     * 輸送形態
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed)
     */
    public void setOtherrefno1(String otherrefno1) {
        __modifiedProperties.add("otherrefno1");
        this._otherrefno1 = otherrefno1;
    }

    /**
     * [get] OTHERREFNO2: {varchar(60)} <br>
     * 着地名称
     * @return The value of the column 'OTHERREFNO2'. (NullAllowed)
     */
    public String getOtherrefno2() {
        return _otherrefno2;
    }

    /**
     * [set] OTHERREFNO2: {varchar(60)} <br>
     * 着地名称
     * @param otherrefno2 The value of the column 'OTHERREFNO2'. (NullAllowed)
     */
    public void setOtherrefno2(String otherrefno2) {
        __modifiedProperties.add("otherrefno2");
        this._otherrefno2 = otherrefno2;
    }

    /**
     * [get] OTHERREFNO3: {varchar(60)} <br>
     * 印刷フラグ
     * @return The value of the column 'OTHERREFNO3'. (NullAllowed)
     */
    public String getOtherrefno3() {
        return _otherrefno3;
    }

    /**
     * [set] OTHERREFNO3: {varchar(60)} <br>
     * 印刷フラグ
     * @param otherrefno3 The value of the column 'OTHERREFNO3'. (NullAllowed)
     */
    public void setOtherrefno3(String otherrefno3) {
        __modifiedProperties.add("otherrefno3");
        this._otherrefno3 = otherrefno3;
    }

    /**
     * [get] PICKING_INST_ID: {bigint(19)} <br>
     * ピッキング指示ID
     * @return The value of the column 'PICKING_INST_ID'. (NullAllowed)
     */
    public Long getPickingInstId() {
        return _pickingInstId;
    }

    /**
     * [set] PICKING_INST_ID: {bigint(19)} <br>
     * ピッキング指示ID
     * @param pickingInstId The value of the column 'PICKING_INST_ID'. (NullAllowed)
     */
    public void setPickingInstId(Long pickingInstId) {
        __modifiedProperties.add("pickingInstId");
        this._pickingInstId = pickingInstId;
    }

    /**
     * [get] EXECKEY: {IX, bigint(19)} <br>
     * ログ実行キー
     * @return The value of the column 'EXECKEY'. (NullAllowed)
     */
    public Long getExeckey() {
        return _execkey;
    }

    /**
     * [set] EXECKEY: {IX, bigint(19)} <br>
     * ログ実行キー
     * @param execkey The value of the column 'EXECKEY'. (NullAllowed)
     */
    public void setExeckey(Long execkey) {
        __modifiedProperties.add("execkey");
        this._execkey = execkey;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
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
