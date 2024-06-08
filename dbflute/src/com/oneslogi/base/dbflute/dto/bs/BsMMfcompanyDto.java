package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of M_MFCOMPANY as TABLE. <br>
 * 組織マスタ
 * <pre>
 * [primary-key]
 *     COMPANY_ID
 *
 * [column]
 *     COMPANY_ID, COMPANY_CD, COMPANYGROUP, NAME, SNAME, ANAME, ADDRESS1, ADDRESS2, ADDRESS3, POSTNO, COUNTRYCD, PORTCD, DISTRICTCD, PHONE1, PHONE2, FAX1, FAX2, REFNAME, EMAIL, URL, TYPEOWNER, TYPECUSTOMER, TYPESHIPTO, TYPESUPPLIER, TYPEWAREHOUSE, TYPECARRIER, TYPEETC, OWNORANOTHERFLG, NOTES, F_USER1, F_USER2, F_USER3, F_USER4, F_USER5, TRANSPORTPRIORITY, PURCHASETYPE, CALENDARCD, OWNERCUSTOMERCD, OWNERSUPPLIERCD, OWNERREFFLG, WAREHOUSE_FUNC_KBN, DPCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COMPANY_ID
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
public abstract class BsMMfcompanyDto implements Serializable {

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
    /** COMPANY_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _companyId;

    /** COMPANY_CD: {varchar(30)} */
    @JsonKey
    protected String _companyCd;

    /** COMPANYGROUP: {varchar(60)} */
    @JsonKey
    protected String _companygroup;

    /** NAME: {NotNull, varchar(255)} */
    @JsonKey
    protected String _name;

    /** SNAME: {NotNull, varchar(100)} */
    @JsonKey
    protected String _sname;

    /** ANAME: {NotNull, varchar(100)} */
    @JsonKey
    protected String _aname;

    /** ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _address1;

    /** ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _address2;

    /** ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _address3;

    /** POSTNO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _postno;

    /** COUNTRYCD: {varchar(60)} */
    @JsonKey
    protected String _countrycd;

    /** PORTCD: {varchar(60)} */
    @JsonKey
    protected String _portcd;

    /** DISTRICTCD: {varchar(30)} */
    @JsonKey
    protected String _districtcd;

    /** PHONE1: {varchar(60)} */
    @JsonKey
    protected String _phone1;

    /** PHONE2: {varchar(60)} */
    @JsonKey
    protected String _phone2;

    /** FAX1: {varchar(60)} */
    @JsonKey
    protected String _fax1;

    /** FAX2: {varchar(60)} */
    @JsonKey
    protected String _fax2;

    /** REFNAME: {varchar(60)} */
    @JsonKey
    protected String _refname;

    /** EMAIL: {varchar(255)} */
    @JsonKey
    protected String _email;

    /** URL: {varchar(255)} */
    @JsonKey
    protected String _url;

    /** TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _typeowner;

    /** TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _typecustomer;

    /** TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _typeshipto;

    /** TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _typesupplier;

    /** TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _typewarehouse;

    /** TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _typecarrier;

    /** TYPEETC: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _typeetc;

    /** OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _ownoranotherflg;

    /** NOTES: {varchar(4000)} */
    @JsonKey
    protected String _notes;

    /** F_USER1: {varchar(30)} */
    @JsonKey
    protected String _fUser1;

    /** F_USER2: {varchar(30)} */
    @JsonKey
    protected String _fUser2;

    /** F_USER3: {varchar(30)} */
    @JsonKey
    protected String _fUser3;

    /** F_USER4: {varchar(30)} */
    @JsonKey
    protected String _fUser4;

    /** F_USER5: {varchar(30)} */
    @JsonKey
    protected String _fUser5;

    /** TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _transportpriority;

    /** PURCHASETYPE: {varchar(30)} */
    @JsonKey
    protected String _purchasetype;

    /** CALENDARCD: {IX, varchar(30)} */
    @JsonKey
    protected String _calendarcd;

    /** OWNERCUSTOMERCD: {varchar(30)} */
    @JsonKey
    protected String _ownercustomercd;

    /** OWNERSUPPLIERCD: {varchar(30)} */
    @JsonKey
    protected String _ownersuppliercd;

    /** OWNERREFFLG: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ownerrefflg;

    /** WAREHOUSE_FUNC_KBN: {bigint(19)} */
    @JsonKey
    protected Long _warehouseFuncKbn;

    /** DPCD: {varchar(30)} */
    @JsonKey
    protected String _dpcd;

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
    public BsMMfcompanyDto() {
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
        if (other == null || !(other instanceof BsMMfcompanyDto)) { return false; }
        final BsMMfcompanyDto otherEntity = (BsMMfcompanyDto)other;
        if (!helpComparingValue(getCompanyId(), otherEntity.getCompanyId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_MFCOMPANY");
        result = xCH(result, getCompanyId());
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
        sb.append(c).append(getCompanyId());
        sb.append(c).append(getCompanyCd());
        sb.append(c).append(getCompanygroup());
        sb.append(c).append(getName());
        sb.append(c).append(getSname());
        sb.append(c).append(getAname());
        sb.append(c).append(getAddress1());
        sb.append(c).append(getAddress2());
        sb.append(c).append(getAddress3());
        sb.append(c).append(getPostno());
        sb.append(c).append(getCountrycd());
        sb.append(c).append(getPortcd());
        sb.append(c).append(getDistrictcd());
        sb.append(c).append(getPhone1());
        sb.append(c).append(getPhone2());
        sb.append(c).append(getFax1());
        sb.append(c).append(getFax2());
        sb.append(c).append(getRefname());
        sb.append(c).append(getEmail());
        sb.append(c).append(getUrl());
        sb.append(c).append(getTypeowner());
        sb.append(c).append(getTypecustomer());
        sb.append(c).append(getTypeshipto());
        sb.append(c).append(getTypesupplier());
        sb.append(c).append(getTypewarehouse());
        sb.append(c).append(getTypecarrier());
        sb.append(c).append(getTypeetc());
        sb.append(c).append(getOwnoranotherflg());
        sb.append(c).append(getNotes());
        sb.append(c).append(getFUser1());
        sb.append(c).append(getFUser2());
        sb.append(c).append(getFUser3());
        sb.append(c).append(getFUser4());
        sb.append(c).append(getFUser5());
        sb.append(c).append(getTransportpriority());
        sb.append(c).append(getPurchasetype());
        sb.append(c).append(getCalendarcd());
        sb.append(c).append(getOwnercustomercd());
        sb.append(c).append(getOwnersuppliercd());
        sb.append(c).append(getOwnerrefflg());
        sb.append(c).append(getWarehouseFuncKbn());
        sb.append(c).append(getDpcd());
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
     * [get] COMPANY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 組織ID
     * @return The value of the column 'COMPANY_ID'. (NullAllowed)
     */
    public Long getCompanyId() {
        return _companyId;
    }

    /**
     * [set] COMPANY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 組織ID
     * @param companyId The value of the column 'COMPANY_ID'. (NullAllowed)
     */
    public void setCompanyId(Long companyId) {
        __modifiedProperties.add("companyId");
        this._companyId = companyId;
    }

    /**
     * [get] COMPANY_CD: {varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'COMPANY_CD'. (NullAllowed)
     */
    public String getCompanyCd() {
        return _companyCd;
    }

    /**
     * [set] COMPANY_CD: {varchar(30)} <br>
     * 組織CD
     * @param companyCd The value of the column 'COMPANY_CD'. (NullAllowed)
     */
    public void setCompanyCd(String companyCd) {
        __modifiedProperties.add("companyCd");
        this._companyCd = companyCd;
    }

    /**
     * [get] COMPANYGROUP: {varchar(60)} <br>
     * 組織区分
     * @return The value of the column 'COMPANYGROUP'. (NullAllowed)
     */
    public String getCompanygroup() {
        return _companygroup;
    }

    /**
     * [set] COMPANYGROUP: {varchar(60)} <br>
     * 組織区分
     * @param companygroup The value of the column 'COMPANYGROUP'. (NullAllowed)
     */
    public void setCompanygroup(String companygroup) {
        __modifiedProperties.add("companygroup");
        this._companygroup = companygroup;
    }

    /**
     * [get] NAME: {NotNull, varchar(255)} <br>
     * TSN組織名正称(全角)
     * @return The value of the column 'NAME'. (NullAllowed)
     */
    public String getName() {
        return _name;
    }

    /**
     * [set] NAME: {NotNull, varchar(255)} <br>
     * TSN組織名正称(全角)
     * @param name The value of the column 'NAME'. (NullAllowed)
     */
    public void setName(String name) {
        __modifiedProperties.add("name");
        this._name = name;
    }

    /**
     * [get] SNAME: {NotNull, varchar(100)} <br>
     * TSN組織名略称(全角)
     * @return The value of the column 'SNAME'. (NullAllowed)
     */
    public String getSname() {
        return _sname;
    }

    /**
     * [set] SNAME: {NotNull, varchar(100)} <br>
     * TSN組織名略称(全角)
     * @param sname The value of the column 'SNAME'. (NullAllowed)
     */
    public void setSname(String sname) {
        __modifiedProperties.add("sname");
        this._sname = sname;
    }

    /**
     * [get] ANAME: {NotNull, varchar(100)} <br>
     * TSN組織名略称(半角)
     * @return The value of the column 'ANAME'. (NullAllowed)
     */
    public String getAname() {
        return _aname;
    }

    /**
     * [set] ANAME: {NotNull, varchar(100)} <br>
     * TSN組織名略称(半角)
     * @param aname The value of the column 'ANAME'. (NullAllowed)
     */
    public void setAname(String aname) {
        __modifiedProperties.add("aname");
        this._aname = aname;
    }

    /**
     * [get] ADDRESS1: {varchar(255)} <br>
     * 住所１
     * @return The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public String getAddress1() {
        return _address1;
    }

    /**
     * [set] ADDRESS1: {varchar(255)} <br>
     * 住所１
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public void setAddress1(String address1) {
        __modifiedProperties.add("address1");
        this._address1 = address1;
    }

    /**
     * [get] ADDRESS2: {varchar(255)} <br>
     * 住所２
     * @return The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public String getAddress2() {
        return _address2;
    }

    /**
     * [set] ADDRESS2: {varchar(255)} <br>
     * 住所２
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public void setAddress2(String address2) {
        __modifiedProperties.add("address2");
        this._address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(255)} <br>
     * 住所３
     * @return The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public String getAddress3() {
        return _address3;
    }

    /**
     * [set] ADDRESS3: {varchar(255)} <br>
     * 住所３
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public void setAddress3(String address3) {
        __modifiedProperties.add("address3");
        this._address3 = address3;
    }

    /**
     * [get] POSTNO: {NotNull, varchar(30)} <br>
     * 組織郵便番号
     * @return The value of the column 'POSTNO'. (NullAllowed)
     */
    public String getPostno() {
        return _postno;
    }

    /**
     * [set] POSTNO: {NotNull, varchar(30)} <br>
     * 組織郵便番号
     * @param postno The value of the column 'POSTNO'. (NullAllowed)
     */
    public void setPostno(String postno) {
        __modifiedProperties.add("postno");
        this._postno = postno;
    }

    /**
     * [get] COUNTRYCD: {varchar(60)} <br>
     * 国CD
     * @return The value of the column 'COUNTRYCD'. (NullAllowed)
     */
    public String getCountrycd() {
        return _countrycd;
    }

    /**
     * [set] COUNTRYCD: {varchar(60)} <br>
     * 国CD
     * @param countrycd The value of the column 'COUNTRYCD'. (NullAllowed)
     */
    public void setCountrycd(String countrycd) {
        __modifiedProperties.add("countrycd");
        this._countrycd = countrycd;
    }

    /**
     * [get] PORTCD: {varchar(60)} <br>
     * 入出港CD
     * @return The value of the column 'PORTCD'. (NullAllowed)
     */
    public String getPortcd() {
        return _portcd;
    }

    /**
     * [set] PORTCD: {varchar(60)} <br>
     * 入出港CD
     * @param portcd The value of the column 'PORTCD'. (NullAllowed)
     */
    public void setPortcd(String portcd) {
        __modifiedProperties.add("portcd");
        this._portcd = portcd;
    }

    /**
     * [get] DISTRICTCD: {varchar(30)} <br>
     * 地区CD
     * @return The value of the column 'DISTRICTCD'. (NullAllowed)
     */
    public String getDistrictcd() {
        return _districtcd;
    }

    /**
     * [set] DISTRICTCD: {varchar(30)} <br>
     * 地区CD
     * @param districtcd The value of the column 'DISTRICTCD'. (NullAllowed)
     */
    public void setDistrictcd(String districtcd) {
        __modifiedProperties.add("districtcd");
        this._districtcd = districtcd;
    }

    /**
     * [get] PHONE1: {varchar(60)} <br>
     * 組織電話番号
     * @return The value of the column 'PHONE1'. (NullAllowed)
     */
    public String getPhone1() {
        return _phone1;
    }

    /**
     * [set] PHONE1: {varchar(60)} <br>
     * 組織電話番号
     * @param phone1 The value of the column 'PHONE1'. (NullAllowed)
     */
    public void setPhone1(String phone1) {
        __modifiedProperties.add("phone1");
        this._phone1 = phone1;
    }

    /**
     * [get] PHONE2: {varchar(60)} <br>
     * 組織電話番号２
     * @return The value of the column 'PHONE2'. (NullAllowed)
     */
    public String getPhone2() {
        return _phone2;
    }

    /**
     * [set] PHONE2: {varchar(60)} <br>
     * 組織電話番号２
     * @param phone2 The value of the column 'PHONE2'. (NullAllowed)
     */
    public void setPhone2(String phone2) {
        __modifiedProperties.add("phone2");
        this._phone2 = phone2;
    }

    /**
     * [get] FAX1: {varchar(60)} <br>
     * 組織ＦＡＸ番号
     * @return The value of the column 'FAX1'. (NullAllowed)
     */
    public String getFax1() {
        return _fax1;
    }

    /**
     * [set] FAX1: {varchar(60)} <br>
     * 組織ＦＡＸ番号
     * @param fax1 The value of the column 'FAX1'. (NullAllowed)
     */
    public void setFax1(String fax1) {
        __modifiedProperties.add("fax1");
        this._fax1 = fax1;
    }

    /**
     * [get] FAX2: {varchar(60)} <br>
     * FAX番号２
     * @return The value of the column 'FAX2'. (NullAllowed)
     */
    public String getFax2() {
        return _fax2;
    }

    /**
     * [set] FAX2: {varchar(60)} <br>
     * FAX番号２
     * @param fax2 The value of the column 'FAX2'. (NullAllowed)
     */
    public void setFax2(String fax2) {
        __modifiedProperties.add("fax2");
        this._fax2 = fax2;
    }

    /**
     * [get] REFNAME: {varchar(60)} <br>
     * 担当者名
     * @return The value of the column 'REFNAME'. (NullAllowed)
     */
    public String getRefname() {
        return _refname;
    }

    /**
     * [set] REFNAME: {varchar(60)} <br>
     * 担当者名
     * @param refname The value of the column 'REFNAME'. (NullAllowed)
     */
    public void setRefname(String refname) {
        __modifiedProperties.add("refname");
        this._refname = refname;
    }

    /**
     * [get] EMAIL: {varchar(255)} <br>
     * E-Mail
     * @return The value of the column 'EMAIL'. (NullAllowed)
     */
    public String getEmail() {
        return _email;
    }

    /**
     * [set] EMAIL: {varchar(255)} <br>
     * E-Mail
     * @param email The value of the column 'EMAIL'. (NullAllowed)
     */
    public void setEmail(String email) {
        __modifiedProperties.add("email");
        this._email = email;
    }

    /**
     * [get] URL: {varchar(255)} <br>
     * URL
     * @return The value of the column 'URL'. (NullAllowed)
     */
    public String getUrl() {
        return _url;
    }

    /**
     * [set] URL: {varchar(255)} <br>
     * URL
     * @param url The value of the column 'URL'. (NullAllowed)
     */
    public void setUrl(String url) {
        __modifiedProperties.add("url");
        this._url = url;
    }

    /**
     * [get] TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（荷主）
     * @return The value of the column 'TYPEOWNER'. (NullAllowed)
     */
    public java.math.BigDecimal getTypeowner() {
        return _typeowner;
    }

    /**
     * [set] TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（荷主）
     * @param typeowner The value of the column 'TYPEOWNER'. (NullAllowed)
     */
    public void setTypeowner(java.math.BigDecimal typeowner) {
        __modifiedProperties.add("typeowner");
        this._typeowner = typeowner;
    }

    /**
     * [get] TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（得意先）
     * @return The value of the column 'TYPECUSTOMER'. (NullAllowed)
     */
    public java.math.BigDecimal getTypecustomer() {
        return _typecustomer;
    }

    /**
     * [set] TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（得意先）
     * @param typecustomer The value of the column 'TYPECUSTOMER'. (NullAllowed)
     */
    public void setTypecustomer(java.math.BigDecimal typecustomer) {
        __modifiedProperties.add("typecustomer");
        this._typecustomer = typecustomer;
    }

    /**
     * [get] TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（納品先）
     * @return The value of the column 'TYPESHIPTO'. (NullAllowed)
     */
    public java.math.BigDecimal getTypeshipto() {
        return _typeshipto;
    }

    /**
     * [set] TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（納品先）
     * @param typeshipto The value of the column 'TYPESHIPTO'. (NullAllowed)
     */
    public void setTypeshipto(java.math.BigDecimal typeshipto) {
        __modifiedProperties.add("typeshipto");
        this._typeshipto = typeshipto;
    }

    /**
     * [get] TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（調達先）
     * @return The value of the column 'TYPESUPPLIER'. (NullAllowed)
     */
    public java.math.BigDecimal getTypesupplier() {
        return _typesupplier;
    }

    /**
     * [set] TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（調達先）
     * @param typesupplier The value of the column 'TYPESUPPLIER'. (NullAllowed)
     */
    public void setTypesupplier(java.math.BigDecimal typesupplier) {
        __modifiedProperties.add("typesupplier");
        this._typesupplier = typesupplier;
    }

    /**
     * [get] TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（倉庫会社）
     * @return The value of the column 'TYPEWAREHOUSE'. (NullAllowed)
     */
    public java.math.BigDecimal getTypewarehouse() {
        return _typewarehouse;
    }

    /**
     * [set] TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（倉庫会社）
     * @param typewarehouse The value of the column 'TYPEWAREHOUSE'. (NullAllowed)
     */
    public void setTypewarehouse(java.math.BigDecimal typewarehouse) {
        __modifiedProperties.add("typewarehouse");
        this._typewarehouse = typewarehouse;
    }

    /**
     * [get] TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（運送会社）
     * @return The value of the column 'TYPECARRIER'. (NullAllowed)
     */
    public java.math.BigDecimal getTypecarrier() {
        return _typecarrier;
    }

    /**
     * [set] TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（運送会社）
     * @param typecarrier The value of the column 'TYPECARRIER'. (NullAllowed)
     */
    public void setTypecarrier(java.math.BigDecimal typecarrier) {
        __modifiedProperties.add("typecarrier");
        this._typecarrier = typecarrier;
    }

    /**
     * [get] TYPEETC: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（その他）
     * @return The value of the column 'TYPEETC'. (NullAllowed)
     */
    public java.math.BigDecimal getTypeetc() {
        return _typeetc;
    }

    /**
     * [set] TYPEETC: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（その他）
     * @param typeetc The value of the column 'TYPEETC'. (NullAllowed)
     */
    public void setTypeetc(java.math.BigDecimal typeetc) {
        __modifiedProperties.add("typeetc");
        this._typeetc = typeetc;
    }

    /**
     * [get] OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]} <br>
     * 自社他社区分
     * @return The value of the column 'OWNORANOTHERFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getOwnoranotherflg() {
        return _ownoranotherflg;
    }

    /**
     * [set] OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]} <br>
     * 自社他社区分
     * @param ownoranotherflg The value of the column 'OWNORANOTHERFLG'. (NullAllowed)
     */
    public void setOwnoranotherflg(java.math.BigDecimal ownoranotherflg) {
        __modifiedProperties.add("ownoranotherflg");
        this._ownoranotherflg = ownoranotherflg;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 備考
     * @return The value of the column 'NOTES'. (NullAllowed)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 備考
     * @param notes The value of the column 'NOTES'. (NullAllowed)
     */
    public void setNotes(String notes) {
        __modifiedProperties.add("notes");
        this._notes = notes;
    }

    /**
     * [get] F_USER1: {varchar(30)} <br>
     * レコード更新区分
     * @return The value of the column 'F_USER1'. (NullAllowed)
     */
    public String getFUser1() {
        return _fUser1;
    }

    /**
     * [set] F_USER1: {varchar(30)} <br>
     * レコード更新区分
     * @param fUser1 The value of the column 'F_USER1'. (NullAllowed)
     */
    public void setFUser1(String fUser1) {
        __modifiedProperties.add("FUser1");
        this._fUser1 = fUser1;
    }

    /**
     * [get] F_USER2: {varchar(30)} <br>
     * 廃止年月日
     * @return The value of the column 'F_USER2'. (NullAllowed)
     */
    public String getFUser2() {
        return _fUser2;
    }

    /**
     * [set] F_USER2: {varchar(30)} <br>
     * 廃止年月日
     * @param fUser2 The value of the column 'F_USER2'. (NullAllowed)
     */
    public void setFUser2(String fUser2) {
        __modifiedProperties.add("FUser2");
        this._fUser2 = fUser2;
    }

    /**
     * [get] F_USER3: {varchar(30)} <br>
     * 適用開始年月日
     * @return The value of the column 'F_USER3'. (NullAllowed)
     */
    public String getFUser3() {
        return _fUser3;
    }

    /**
     * [set] F_USER3: {varchar(30)} <br>
     * 適用開始年月日
     * @param fUser3 The value of the column 'F_USER3'. (NullAllowed)
     */
    public void setFUser3(String fUser3) {
        __modifiedProperties.add("FUser3");
        this._fUser3 = fUser3;
    }

    /**
     * [get] F_USER4: {varchar(30)} <br>
     * 適用終了年月日
     * @return The value of the column 'F_USER4'. (NullAllowed)
     */
    public String getFUser4() {
        return _fUser4;
    }

    /**
     * [set] F_USER4: {varchar(30)} <br>
     * 適用終了年月日
     * @param fUser4 The value of the column 'F_USER4'. (NullAllowed)
     */
    public void setFUser4(String fUser4) {
        __modifiedProperties.add("FUser4");
        this._fUser4 = fUser4;
    }

    /**
     * [get] F_USER5: {varchar(30)} <br>
     * カテゴリ５
     * @return The value of the column 'F_USER5'. (NullAllowed)
     */
    public String getFUser5() {
        return _fUser5;
    }

    /**
     * [set] F_USER5: {varchar(30)} <br>
     * カテゴリ５
     * @param fUser5 The value of the column 'F_USER5'. (NullAllowed)
     */
    public void setFUser5(String fUser5) {
        __modifiedProperties.add("FUser5");
        this._fUser5 = fUser5;
    }

    /**
     * [get] TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]} <br>
     * 出力順
     * @return The value of the column 'TRANSPORTPRIORITY'. (NullAllowed)
     */
    public java.math.BigDecimal getTransportpriority() {
        return _transportpriority;
    }

    /**
     * [set] TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]} <br>
     * 出力順
     * @param transportpriority The value of the column 'TRANSPORTPRIORITY'. (NullAllowed)
     */
    public void setTransportpriority(java.math.BigDecimal transportpriority) {
        __modifiedProperties.add("transportpriority");
        this._transportpriority = transportpriority;
    }

    /**
     * [get] PURCHASETYPE: {varchar(30)} <br>
     * 発注タイプ
     * @return The value of the column 'PURCHASETYPE'. (NullAllowed)
     */
    public String getPurchasetype() {
        return _purchasetype;
    }

    /**
     * [set] PURCHASETYPE: {varchar(30)} <br>
     * 発注タイプ
     * @param purchasetype The value of the column 'PURCHASETYPE'. (NullAllowed)
     */
    public void setPurchasetype(String purchasetype) {
        __modifiedProperties.add("purchasetype");
        this._purchasetype = purchasetype;
    }

    /**
     * [get] CALENDARCD: {IX, varchar(30)} <br>
     * カレンダCD
     * @return The value of the column 'CALENDARCD'. (NullAllowed)
     */
    public String getCalendarcd() {
        return _calendarcd;
    }

    /**
     * [set] CALENDARCD: {IX, varchar(30)} <br>
     * カレンダCD
     * @param calendarcd The value of the column 'CALENDARCD'. (NullAllowed)
     */
    public void setCalendarcd(String calendarcd) {
        __modifiedProperties.add("calendarcd");
        this._calendarcd = calendarcd;
    }

    /**
     * [get] OWNERCUSTOMERCD: {varchar(30)} <br>
     * 荷主得意先CD
     * @return The value of the column 'OWNERCUSTOMERCD'. (NullAllowed)
     */
    public String getOwnercustomercd() {
        return _ownercustomercd;
    }

    /**
     * [set] OWNERCUSTOMERCD: {varchar(30)} <br>
     * 荷主得意先CD
     * @param ownercustomercd The value of the column 'OWNERCUSTOMERCD'. (NullAllowed)
     */
    public void setOwnercustomercd(String ownercustomercd) {
        __modifiedProperties.add("ownercustomercd");
        this._ownercustomercd = ownercustomercd;
    }

    /**
     * [get] OWNERSUPPLIERCD: {varchar(30)} <br>
     * 荷主調達先CD
     * @return The value of the column 'OWNERSUPPLIERCD'. (NullAllowed)
     */
    public String getOwnersuppliercd() {
        return _ownersuppliercd;
    }

    /**
     * [set] OWNERSUPPLIERCD: {varchar(30)} <br>
     * 荷主調達先CD
     * @param ownersuppliercd The value of the column 'OWNERSUPPLIERCD'. (NullAllowed)
     */
    public void setOwnersuppliercd(String ownersuppliercd) {
        __modifiedProperties.add("ownersuppliercd");
        this._ownersuppliercd = ownersuppliercd;
    }

    /**
     * [get] OWNERREFFLG: {NotNull, decimal(16, 6)} <br>
     * 荷主参照フラグ
     * @return The value of the column 'OWNERREFFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getOwnerrefflg() {
        return _ownerrefflg;
    }

    /**
     * [set] OWNERREFFLG: {NotNull, decimal(16, 6)} <br>
     * 荷主参照フラグ
     * @param ownerrefflg The value of the column 'OWNERREFFLG'. (NullAllowed)
     */
    public void setOwnerrefflg(java.math.BigDecimal ownerrefflg) {
        __modifiedProperties.add("ownerrefflg");
        this._ownerrefflg = ownerrefflg;
    }

    /**
     * [get] WAREHOUSE_FUNC_KBN: {bigint(19)} <br>
     * 倉庫機能区分
     * @return The value of the column 'WAREHOUSE_FUNC_KBN'. (NullAllowed)
     */
    public Long getWarehouseFuncKbn() {
        return _warehouseFuncKbn;
    }

    /**
     * [set] WAREHOUSE_FUNC_KBN: {bigint(19)} <br>
     * 倉庫機能区分
     * @param warehouseFuncKbn The value of the column 'WAREHOUSE_FUNC_KBN'. (NullAllowed)
     */
    public void setWarehouseFuncKbn(Long warehouseFuncKbn) {
        __modifiedProperties.add("warehouseFuncKbn");
        this._warehouseFuncKbn = warehouseFuncKbn;
    }

    /**
     * [get] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPCD'. (NullAllowed)
     */
    public String getDpcd() {
        return _dpcd;
    }

    /**
     * [set] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @param dpcd The value of the column 'DPCD'. (NullAllowed)
     */
    public void setDpcd(String dpcd) {
        __modifiedProperties.add("dpcd");
        this._dpcd = dpcd;
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
