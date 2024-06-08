package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of M_MFCOMPANY as TABLE. <br>
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long companyId = entity.getCompanyId();
 * String companyCd = entity.getCompanyCd();
 * String companygroup = entity.getCompanygroup();
 * String name = entity.getName();
 * String sname = entity.getSname();
 * String aname = entity.getAname();
 * String address1 = entity.getAddress1();
 * String address2 = entity.getAddress2();
 * String address3 = entity.getAddress3();
 * String postno = entity.getPostno();
 * String countrycd = entity.getCountrycd();
 * String portcd = entity.getPortcd();
 * String districtcd = entity.getDistrictcd();
 * String phone1 = entity.getPhone1();
 * String phone2 = entity.getPhone2();
 * String fax1 = entity.getFax1();
 * String fax2 = entity.getFax2();
 * String refname = entity.getRefname();
 * String email = entity.getEmail();
 * String url = entity.getUrl();
 * java.math.BigDecimal typeowner = entity.getTypeowner();
 * java.math.BigDecimal typecustomer = entity.getTypecustomer();
 * java.math.BigDecimal typeshipto = entity.getTypeshipto();
 * java.math.BigDecimal typesupplier = entity.getTypesupplier();
 * java.math.BigDecimal typewarehouse = entity.getTypewarehouse();
 * java.math.BigDecimal typecarrier = entity.getTypecarrier();
 * java.math.BigDecimal typeetc = entity.getTypeetc();
 * java.math.BigDecimal ownoranotherflg = entity.getOwnoranotherflg();
 * String notes = entity.getNotes();
 * String fUser1 = entity.getFUser1();
 * String fUser2 = entity.getFUser2();
 * String fUser3 = entity.getFUser3();
 * String fUser4 = entity.getFUser4();
 * String fUser5 = entity.getFUser5();
 * java.math.BigDecimal transportpriority = entity.getTransportpriority();
 * String purchasetype = entity.getPurchasetype();
 * String calendarcd = entity.getCalendarcd();
 * String ownercustomercd = entity.getOwnercustomercd();
 * String ownersuppliercd = entity.getOwnersuppliercd();
 * java.math.BigDecimal ownerrefflg = entity.getOwnerrefflg();
 * Long warehouseFuncKbn = entity.getWarehouseFuncKbn();
 * String dpcd = entity.getDpcd();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCompanyId(companyId);
 * entity.setCompanyCd(companyCd);
 * entity.setCompanygroup(companygroup);
 * entity.setName(name);
 * entity.setSname(sname);
 * entity.setAname(aname);
 * entity.setAddress1(address1);
 * entity.setAddress2(address2);
 * entity.setAddress3(address3);
 * entity.setPostno(postno);
 * entity.setCountrycd(countrycd);
 * entity.setPortcd(portcd);
 * entity.setDistrictcd(districtcd);
 * entity.setPhone1(phone1);
 * entity.setPhone2(phone2);
 * entity.setFax1(fax1);
 * entity.setFax2(fax2);
 * entity.setRefname(refname);
 * entity.setEmail(email);
 * entity.setUrl(url);
 * entity.setTypeowner(typeowner);
 * entity.setTypecustomer(typecustomer);
 * entity.setTypeshipto(typeshipto);
 * entity.setTypesupplier(typesupplier);
 * entity.setTypewarehouse(typewarehouse);
 * entity.setTypecarrier(typecarrier);
 * entity.setTypeetc(typeetc);
 * entity.setOwnoranotherflg(ownoranotherflg);
 * entity.setNotes(notes);
 * entity.setFUser1(fUser1);
 * entity.setFUser2(fUser2);
 * entity.setFUser3(fUser3);
 * entity.setFUser4(fUser4);
 * entity.setFUser5(fUser5);
 * entity.setTransportpriority(transportpriority);
 * entity.setPurchasetype(purchasetype);
 * entity.setCalendarcd(calendarcd);
 * entity.setOwnercustomercd(ownercustomercd);
 * entity.setOwnersuppliercd(ownersuppliercd);
 * entity.setOwnerrefflg(ownerrefflg);
 * entity.setWarehouseFuncKbn(warehouseFuncKbn);
 * entity.setDpcd(dpcd);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMMfcompany extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** COMPANY_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _companyId;

    /** COMPANY_CD: {varchar(30)} */
    protected String _companyCd;

    /** COMPANYGROUP: {varchar(60)} */
    protected String _companygroup;

    /** NAME: {NotNull, varchar(255)} */
    protected String _name;

    /** SNAME: {NotNull, varchar(100)} */
    protected String _sname;

    /** ANAME: {NotNull, varchar(100)} */
    protected String _aname;

    /** ADDRESS1: {varchar(255)} */
    protected String _address1;

    /** ADDRESS2: {varchar(255)} */
    protected String _address2;

    /** ADDRESS3: {varchar(255)} */
    protected String _address3;

    /** POSTNO: {NotNull, varchar(30)} */
    protected String _postno;

    /** COUNTRYCD: {varchar(60)} */
    protected String _countrycd;

    /** PORTCD: {varchar(60)} */
    protected String _portcd;

    /** DISTRICTCD: {varchar(30)} */
    protected String _districtcd;

    /** PHONE1: {varchar(60)} */
    protected String _phone1;

    /** PHONE2: {varchar(60)} */
    protected String _phone2;

    /** FAX1: {varchar(60)} */
    protected String _fax1;

    /** FAX2: {varchar(60)} */
    protected String _fax2;

    /** REFNAME: {varchar(60)} */
    protected String _refname;

    /** EMAIL: {varchar(255)} */
    protected String _email;

    /** URL: {varchar(255)} */
    protected String _url;

    /** TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _typeowner;

    /** TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _typecustomer;

    /** TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _typeshipto;

    /** TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _typesupplier;

    /** TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _typewarehouse;

    /** TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _typecarrier;

    /** TYPEETC: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _typeetc;

    /** OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _ownoranotherflg;

    /** NOTES: {varchar(4000)} */
    protected String _notes;

    /** F_USER1: {varchar(30)} */
    protected String _fUser1;

    /** F_USER2: {varchar(30)} */
    protected String _fUser2;

    /** F_USER3: {varchar(30)} */
    protected String _fUser3;

    /** F_USER4: {varchar(30)} */
    protected String _fUser4;

    /** F_USER5: {varchar(30)} */
    protected String _fUser5;

    /** TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _transportpriority;

    /** PURCHASETYPE: {varchar(30)} */
    protected String _purchasetype;

    /** CALENDARCD: {IX, varchar(30)} */
    protected String _calendarcd;

    /** OWNERCUSTOMERCD: {varchar(30)} */
    protected String _ownercustomercd;

    /** OWNERSUPPLIERCD: {varchar(30)} */
    protected String _ownersuppliercd;

    /** OWNERREFFLG: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _ownerrefflg;

    /** WAREHOUSE_FUNC_KBN: {bigint(19)} */
    protected Long _warehouseFuncKbn;

    /** DPCD: {varchar(30)} */
    protected String _dpcd;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "M_MFCOMPANY";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_companyId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMMfcompany) {
            BsMMfcompany other = (BsMMfcompany)obj;
            if (!xSV(_companyId, other._companyId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _companyId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_companyId));
        sb.append(dm).append(xfND(_companyCd));
        sb.append(dm).append(xfND(_companygroup));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_sname));
        sb.append(dm).append(xfND(_aname));
        sb.append(dm).append(xfND(_address1));
        sb.append(dm).append(xfND(_address2));
        sb.append(dm).append(xfND(_address3));
        sb.append(dm).append(xfND(_postno));
        sb.append(dm).append(xfND(_countrycd));
        sb.append(dm).append(xfND(_portcd));
        sb.append(dm).append(xfND(_districtcd));
        sb.append(dm).append(xfND(_phone1));
        sb.append(dm).append(xfND(_phone2));
        sb.append(dm).append(xfND(_fax1));
        sb.append(dm).append(xfND(_fax2));
        sb.append(dm).append(xfND(_refname));
        sb.append(dm).append(xfND(_email));
        sb.append(dm).append(xfND(_url));
        sb.append(dm).append(xfND(_typeowner));
        sb.append(dm).append(xfND(_typecustomer));
        sb.append(dm).append(xfND(_typeshipto));
        sb.append(dm).append(xfND(_typesupplier));
        sb.append(dm).append(xfND(_typewarehouse));
        sb.append(dm).append(xfND(_typecarrier));
        sb.append(dm).append(xfND(_typeetc));
        sb.append(dm).append(xfND(_ownoranotherflg));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_fUser1));
        sb.append(dm).append(xfND(_fUser2));
        sb.append(dm).append(xfND(_fUser3));
        sb.append(dm).append(xfND(_fUser4));
        sb.append(dm).append(xfND(_fUser5));
        sb.append(dm).append(xfND(_transportpriority));
        sb.append(dm).append(xfND(_purchasetype));
        sb.append(dm).append(xfND(_calendarcd));
        sb.append(dm).append(xfND(_ownercustomercd));
        sb.append(dm).append(xfND(_ownersuppliercd));
        sb.append(dm).append(xfND(_ownerrefflg));
        sb.append(dm).append(xfND(_warehouseFuncKbn));
        sb.append(dm).append(xfND(_dpcd));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public MMfcompany clone() {
        return (MMfcompany)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COMPANY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 組織ID
     * @return The value of the column 'COMPANY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCompanyId() {
        checkSpecifiedProperty("companyId");
        return _companyId;
    }

    /**
     * [set] COMPANY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 組織ID
     * @param companyId The value of the column 'COMPANY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCompanyId(Long companyId) {
        registerModifiedProperty("companyId");
        _companyId = companyId;
    }

    /**
     * [get] COMPANY_CD: {varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanyCd() {
        checkSpecifiedProperty("companyCd");
        return convertEmptyToNull(_companyCd);
    }

    /**
     * [set] COMPANY_CD: {varchar(30)} <br>
     * 組織CD
     * @param companyCd The value of the column 'COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyCd(String companyCd) {
        registerModifiedProperty("companyCd");
        _companyCd = companyCd;
    }

    /**
     * [get] COMPANYGROUP: {varchar(60)} <br>
     * 組織区分
     * @return The value of the column 'COMPANYGROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanygroup() {
        checkSpecifiedProperty("companygroup");
        return convertEmptyToNull(_companygroup);
    }

    /**
     * [set] COMPANYGROUP: {varchar(60)} <br>
     * 組織区分
     * @param companygroup The value of the column 'COMPANYGROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanygroup(String companygroup) {
        registerModifiedProperty("companygroup");
        _companygroup = companygroup;
    }

    /**
     * [get] NAME: {NotNull, varchar(255)} <br>
     * TSN組織名正称(全角)
     * @return The value of the column 'NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return convertEmptyToNull(_name);
    }

    /**
     * [set] NAME: {NotNull, varchar(255)} <br>
     * TSN組織名正称(全角)
     * @param name The value of the column 'NAME'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] SNAME: {NotNull, varchar(100)} <br>
     * TSN組織名略称(全角)
     * @return The value of the column 'SNAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSname() {
        checkSpecifiedProperty("sname");
        return convertEmptyToNull(_sname);
    }

    /**
     * [set] SNAME: {NotNull, varchar(100)} <br>
     * TSN組織名略称(全角)
     * @param sname The value of the column 'SNAME'. (basically NotNull if update: for the constraint)
     */
    public void setSname(String sname) {
        registerModifiedProperty("sname");
        _sname = sname;
    }

    /**
     * [get] ANAME: {NotNull, varchar(100)} <br>
     * TSN組織名略称(半角)
     * @return The value of the column 'ANAME'. (basically NotNull if selected: for the constraint)
     */
    public String getAname() {
        checkSpecifiedProperty("aname");
        return convertEmptyToNull(_aname);
    }

    /**
     * [set] ANAME: {NotNull, varchar(100)} <br>
     * TSN組織名略称(半角)
     * @param aname The value of the column 'ANAME'. (basically NotNull if update: for the constraint)
     */
    public void setAname(String aname) {
        registerModifiedProperty("aname");
        _aname = aname;
    }

    /**
     * [get] ADDRESS1: {varchar(255)} <br>
     * 住所１
     * @return The value of the column 'ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress1() {
        checkSpecifiedProperty("address1");
        return convertEmptyToNull(_address1);
    }

    /**
     * [set] ADDRESS1: {varchar(255)} <br>
     * 住所１
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress1(String address1) {
        registerModifiedProperty("address1");
        _address1 = address1;
    }

    /**
     * [get] ADDRESS2: {varchar(255)} <br>
     * 住所２
     * @return The value of the column 'ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress2() {
        checkSpecifiedProperty("address2");
        return convertEmptyToNull(_address2);
    }

    /**
     * [set] ADDRESS2: {varchar(255)} <br>
     * 住所２
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress2(String address2) {
        registerModifiedProperty("address2");
        _address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(255)} <br>
     * 住所３
     * @return The value of the column 'ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress3() {
        checkSpecifiedProperty("address3");
        return convertEmptyToNull(_address3);
    }

    /**
     * [set] ADDRESS3: {varchar(255)} <br>
     * 住所３
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress3(String address3) {
        registerModifiedProperty("address3");
        _address3 = address3;
    }

    /**
     * [get] POSTNO: {NotNull, varchar(30)} <br>
     * 組織郵便番号
     * @return The value of the column 'POSTNO'. (basically NotNull if selected: for the constraint)
     */
    public String getPostno() {
        checkSpecifiedProperty("postno");
        return convertEmptyToNull(_postno);
    }

    /**
     * [set] POSTNO: {NotNull, varchar(30)} <br>
     * 組織郵便番号
     * @param postno The value of the column 'POSTNO'. (basically NotNull if update: for the constraint)
     */
    public void setPostno(String postno) {
        registerModifiedProperty("postno");
        _postno = postno;
    }

    /**
     * [get] COUNTRYCD: {varchar(60)} <br>
     * 国CD
     * @return The value of the column 'COUNTRYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCountrycd() {
        checkSpecifiedProperty("countrycd");
        return convertEmptyToNull(_countrycd);
    }

    /**
     * [set] COUNTRYCD: {varchar(60)} <br>
     * 国CD
     * @param countrycd The value of the column 'COUNTRYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCountrycd(String countrycd) {
        registerModifiedProperty("countrycd");
        _countrycd = countrycd;
    }

    /**
     * [get] PORTCD: {varchar(60)} <br>
     * 入出港CD
     * @return The value of the column 'PORTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPortcd() {
        checkSpecifiedProperty("portcd");
        return convertEmptyToNull(_portcd);
    }

    /**
     * [set] PORTCD: {varchar(60)} <br>
     * 入出港CD
     * @param portcd The value of the column 'PORTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPortcd(String portcd) {
        registerModifiedProperty("portcd");
        _portcd = portcd;
    }

    /**
     * [get] DISTRICTCD: {varchar(30)} <br>
     * 地区CD
     * @return The value of the column 'DISTRICTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistrictcd() {
        checkSpecifiedProperty("districtcd");
        return convertEmptyToNull(_districtcd);
    }

    /**
     * [set] DISTRICTCD: {varchar(30)} <br>
     * 地区CD
     * @param districtcd The value of the column 'DISTRICTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistrictcd(String districtcd) {
        registerModifiedProperty("districtcd");
        _districtcd = districtcd;
    }

    /**
     * [get] PHONE1: {varchar(60)} <br>
     * 組織電話番号
     * @return The value of the column 'PHONE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhone1() {
        checkSpecifiedProperty("phone1");
        return convertEmptyToNull(_phone1);
    }

    /**
     * [set] PHONE1: {varchar(60)} <br>
     * 組織電話番号
     * @param phone1 The value of the column 'PHONE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhone1(String phone1) {
        registerModifiedProperty("phone1");
        _phone1 = phone1;
    }

    /**
     * [get] PHONE2: {varchar(60)} <br>
     * 組織電話番号２
     * @return The value of the column 'PHONE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhone2() {
        checkSpecifiedProperty("phone2");
        return convertEmptyToNull(_phone2);
    }

    /**
     * [set] PHONE2: {varchar(60)} <br>
     * 組織電話番号２
     * @param phone2 The value of the column 'PHONE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhone2(String phone2) {
        registerModifiedProperty("phone2");
        _phone2 = phone2;
    }

    /**
     * [get] FAX1: {varchar(60)} <br>
     * 組織ＦＡＸ番号
     * @return The value of the column 'FAX1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFax1() {
        checkSpecifiedProperty("fax1");
        return convertEmptyToNull(_fax1);
    }

    /**
     * [set] FAX1: {varchar(60)} <br>
     * 組織ＦＡＸ番号
     * @param fax1 The value of the column 'FAX1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFax1(String fax1) {
        registerModifiedProperty("fax1");
        _fax1 = fax1;
    }

    /**
     * [get] FAX2: {varchar(60)} <br>
     * FAX番号２
     * @return The value of the column 'FAX2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFax2() {
        checkSpecifiedProperty("fax2");
        return convertEmptyToNull(_fax2);
    }

    /**
     * [set] FAX2: {varchar(60)} <br>
     * FAX番号２
     * @param fax2 The value of the column 'FAX2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFax2(String fax2) {
        registerModifiedProperty("fax2");
        _fax2 = fax2;
    }

    /**
     * [get] REFNAME: {varchar(60)} <br>
     * 担当者名
     * @return The value of the column 'REFNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getRefname() {
        checkSpecifiedProperty("refname");
        return convertEmptyToNull(_refname);
    }

    /**
     * [set] REFNAME: {varchar(60)} <br>
     * 担当者名
     * @param refname The value of the column 'REFNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRefname(String refname) {
        registerModifiedProperty("refname");
        _refname = refname;
    }

    /**
     * [get] EMAIL: {varchar(255)} <br>
     * E-Mail
     * @return The value of the column 'EMAIL'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmail() {
        checkSpecifiedProperty("email");
        return convertEmptyToNull(_email);
    }

    /**
     * [set] EMAIL: {varchar(255)} <br>
     * E-Mail
     * @param email The value of the column 'EMAIL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmail(String email) {
        registerModifiedProperty("email");
        _email = email;
    }

    /**
     * [get] URL: {varchar(255)} <br>
     * URL
     * @return The value of the column 'URL'. (NullAllowed even if selected: for no constraint)
     */
    public String getUrl() {
        checkSpecifiedProperty("url");
        return convertEmptyToNull(_url);
    }

    /**
     * [set] URL: {varchar(255)} <br>
     * URL
     * @param url The value of the column 'URL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUrl(String url) {
        registerModifiedProperty("url");
        _url = url;
    }

    /**
     * [get] TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（荷主）
     * @return The value of the column 'TYPEOWNER'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTypeowner() {
        checkSpecifiedProperty("typeowner");
        return _typeowner;
    }

    /**
     * [set] TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（荷主）
     * @param typeowner The value of the column 'TYPEOWNER'. (basically NotNull if update: for the constraint)
     */
    public void setTypeowner(java.math.BigDecimal typeowner) {
        registerModifiedProperty("typeowner");
        _typeowner = typeowner;
    }

    /**
     * [get] TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（得意先）
     * @return The value of the column 'TYPECUSTOMER'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTypecustomer() {
        checkSpecifiedProperty("typecustomer");
        return _typecustomer;
    }

    /**
     * [set] TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（得意先）
     * @param typecustomer The value of the column 'TYPECUSTOMER'. (basically NotNull if update: for the constraint)
     */
    public void setTypecustomer(java.math.BigDecimal typecustomer) {
        registerModifiedProperty("typecustomer");
        _typecustomer = typecustomer;
    }

    /**
     * [get] TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（納品先）
     * @return The value of the column 'TYPESHIPTO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTypeshipto() {
        checkSpecifiedProperty("typeshipto");
        return _typeshipto;
    }

    /**
     * [set] TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（納品先）
     * @param typeshipto The value of the column 'TYPESHIPTO'. (basically NotNull if update: for the constraint)
     */
    public void setTypeshipto(java.math.BigDecimal typeshipto) {
        registerModifiedProperty("typeshipto");
        _typeshipto = typeshipto;
    }

    /**
     * [get] TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（調達先）
     * @return The value of the column 'TYPESUPPLIER'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTypesupplier() {
        checkSpecifiedProperty("typesupplier");
        return _typesupplier;
    }

    /**
     * [set] TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（調達先）
     * @param typesupplier The value of the column 'TYPESUPPLIER'. (basically NotNull if update: for the constraint)
     */
    public void setTypesupplier(java.math.BigDecimal typesupplier) {
        registerModifiedProperty("typesupplier");
        _typesupplier = typesupplier;
    }

    /**
     * [get] TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（倉庫会社）
     * @return The value of the column 'TYPEWAREHOUSE'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTypewarehouse() {
        checkSpecifiedProperty("typewarehouse");
        return _typewarehouse;
    }

    /**
     * [set] TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（倉庫会社）
     * @param typewarehouse The value of the column 'TYPEWAREHOUSE'. (basically NotNull if update: for the constraint)
     */
    public void setTypewarehouse(java.math.BigDecimal typewarehouse) {
        registerModifiedProperty("typewarehouse");
        _typewarehouse = typewarehouse;
    }

    /**
     * [get] TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（運送会社）
     * @return The value of the column 'TYPECARRIER'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTypecarrier() {
        checkSpecifiedProperty("typecarrier");
        return _typecarrier;
    }

    /**
     * [set] TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（運送会社）
     * @param typecarrier The value of the column 'TYPECARRIER'. (basically NotNull if update: for the constraint)
     */
    public void setTypecarrier(java.math.BigDecimal typecarrier) {
        registerModifiedProperty("typecarrier");
        _typecarrier = typecarrier;
    }

    /**
     * [get] TYPEETC: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（その他）
     * @return The value of the column 'TYPEETC'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTypeetc() {
        checkSpecifiedProperty("typeetc");
        return _typeetc;
    }

    /**
     * [set] TYPEETC: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 組織タイプ区分（その他）
     * @param typeetc The value of the column 'TYPEETC'. (basically NotNull if update: for the constraint)
     */
    public void setTypeetc(java.math.BigDecimal typeetc) {
        registerModifiedProperty("typeetc");
        _typeetc = typeetc;
    }

    /**
     * [get] OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]} <br>
     * 自社他社区分
     * @return The value of the column 'OWNORANOTHERFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getOwnoranotherflg() {
        checkSpecifiedProperty("ownoranotherflg");
        return _ownoranotherflg;
    }

    /**
     * [set] OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]} <br>
     * 自社他社区分
     * @param ownoranotherflg The value of the column 'OWNORANOTHERFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnoranotherflg(java.math.BigDecimal ownoranotherflg) {
        registerModifiedProperty("ownoranotherflg");
        _ownoranotherflg = ownoranotherflg;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 備考
     * @return The value of the column 'NOTES'. (NullAllowed even if selected: for no constraint)
     */
    public String getNotes() {
        checkSpecifiedProperty("notes");
        return convertEmptyToNull(_notes);
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 備考
     * @param notes The value of the column 'NOTES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotes(String notes) {
        registerModifiedProperty("notes");
        _notes = notes;
    }

    /**
     * [get] F_USER1: {varchar(30)} <br>
     * レコード更新区分
     * @return The value of the column 'F_USER1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser1() {
        checkSpecifiedProperty("FUser1");
        return convertEmptyToNull(_fUser1);
    }

    /**
     * [set] F_USER1: {varchar(30)} <br>
     * レコード更新区分
     * @param fUser1 The value of the column 'F_USER1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser1(String fUser1) {
        registerModifiedProperty("FUser1");
        _fUser1 = fUser1;
    }

    /**
     * [get] F_USER2: {varchar(30)} <br>
     * 廃止年月日
     * @return The value of the column 'F_USER2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser2() {
        checkSpecifiedProperty("FUser2");
        return convertEmptyToNull(_fUser2);
    }

    /**
     * [set] F_USER2: {varchar(30)} <br>
     * 廃止年月日
     * @param fUser2 The value of the column 'F_USER2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser2(String fUser2) {
        registerModifiedProperty("FUser2");
        _fUser2 = fUser2;
    }

    /**
     * [get] F_USER3: {varchar(30)} <br>
     * 適用開始年月日
     * @return The value of the column 'F_USER3'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser3() {
        checkSpecifiedProperty("FUser3");
        return convertEmptyToNull(_fUser3);
    }

    /**
     * [set] F_USER3: {varchar(30)} <br>
     * 適用開始年月日
     * @param fUser3 The value of the column 'F_USER3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser3(String fUser3) {
        registerModifiedProperty("FUser3");
        _fUser3 = fUser3;
    }

    /**
     * [get] F_USER4: {varchar(30)} <br>
     * 適用終了年月日
     * @return The value of the column 'F_USER4'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser4() {
        checkSpecifiedProperty("FUser4");
        return convertEmptyToNull(_fUser4);
    }

    /**
     * [set] F_USER4: {varchar(30)} <br>
     * 適用終了年月日
     * @param fUser4 The value of the column 'F_USER4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser4(String fUser4) {
        registerModifiedProperty("FUser4");
        _fUser4 = fUser4;
    }

    /**
     * [get] F_USER5: {varchar(30)} <br>
     * カテゴリ５
     * @return The value of the column 'F_USER5'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser5() {
        checkSpecifiedProperty("FUser5");
        return convertEmptyToNull(_fUser5);
    }

    /**
     * [set] F_USER5: {varchar(30)} <br>
     * カテゴリ５
     * @param fUser5 The value of the column 'F_USER5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser5(String fUser5) {
        registerModifiedProperty("FUser5");
        _fUser5 = fUser5;
    }

    /**
     * [get] TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]} <br>
     * 出力順
     * @return The value of the column 'TRANSPORTPRIORITY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTransportpriority() {
        checkSpecifiedProperty("transportpriority");
        return _transportpriority;
    }

    /**
     * [set] TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]} <br>
     * 出力順
     * @param transportpriority The value of the column 'TRANSPORTPRIORITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportpriority(java.math.BigDecimal transportpriority) {
        registerModifiedProperty("transportpriority");
        _transportpriority = transportpriority;
    }

    /**
     * [get] PURCHASETYPE: {varchar(30)} <br>
     * 発注タイプ
     * @return The value of the column 'PURCHASETYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPurchasetype() {
        checkSpecifiedProperty("purchasetype");
        return convertEmptyToNull(_purchasetype);
    }

    /**
     * [set] PURCHASETYPE: {varchar(30)} <br>
     * 発注タイプ
     * @param purchasetype The value of the column 'PURCHASETYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchasetype(String purchasetype) {
        registerModifiedProperty("purchasetype");
        _purchasetype = purchasetype;
    }

    /**
     * [get] CALENDARCD: {IX, varchar(30)} <br>
     * カレンダCD
     * @return The value of the column 'CALENDARCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCalendarcd() {
        checkSpecifiedProperty("calendarcd");
        return convertEmptyToNull(_calendarcd);
    }

    /**
     * [set] CALENDARCD: {IX, varchar(30)} <br>
     * カレンダCD
     * @param calendarcd The value of the column 'CALENDARCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCalendarcd(String calendarcd) {
        registerModifiedProperty("calendarcd");
        _calendarcd = calendarcd;
    }

    /**
     * [get] OWNERCUSTOMERCD: {varchar(30)} <br>
     * 荷主得意先CD
     * @return The value of the column 'OWNERCUSTOMERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnercustomercd() {
        checkSpecifiedProperty("ownercustomercd");
        return convertEmptyToNull(_ownercustomercd);
    }

    /**
     * [set] OWNERCUSTOMERCD: {varchar(30)} <br>
     * 荷主得意先CD
     * @param ownercustomercd The value of the column 'OWNERCUSTOMERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnercustomercd(String ownercustomercd) {
        registerModifiedProperty("ownercustomercd");
        _ownercustomercd = ownercustomercd;
    }

    /**
     * [get] OWNERSUPPLIERCD: {varchar(30)} <br>
     * 荷主調達先CD
     * @return The value of the column 'OWNERSUPPLIERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnersuppliercd() {
        checkSpecifiedProperty("ownersuppliercd");
        return convertEmptyToNull(_ownersuppliercd);
    }

    /**
     * [set] OWNERSUPPLIERCD: {varchar(30)} <br>
     * 荷主調達先CD
     * @param ownersuppliercd The value of the column 'OWNERSUPPLIERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnersuppliercd(String ownersuppliercd) {
        registerModifiedProperty("ownersuppliercd");
        _ownersuppliercd = ownersuppliercd;
    }

    /**
     * [get] OWNERREFFLG: {NotNull, decimal(16, 6)} <br>
     * 荷主参照フラグ
     * @return The value of the column 'OWNERREFFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getOwnerrefflg() {
        checkSpecifiedProperty("ownerrefflg");
        return _ownerrefflg;
    }

    /**
     * [set] OWNERREFFLG: {NotNull, decimal(16, 6)} <br>
     * 荷主参照フラグ
     * @param ownerrefflg The value of the column 'OWNERREFFLG'. (basically NotNull if update: for the constraint)
     */
    public void setOwnerrefflg(java.math.BigDecimal ownerrefflg) {
        registerModifiedProperty("ownerrefflg");
        _ownerrefflg = ownerrefflg;
    }

    /**
     * [get] WAREHOUSE_FUNC_KBN: {bigint(19)} <br>
     * 倉庫機能区分
     * @return The value of the column 'WAREHOUSE_FUNC_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWarehouseFuncKbn() {
        checkSpecifiedProperty("warehouseFuncKbn");
        return _warehouseFuncKbn;
    }

    /**
     * [set] WAREHOUSE_FUNC_KBN: {bigint(19)} <br>
     * 倉庫機能区分
     * @param warehouseFuncKbn The value of the column 'WAREHOUSE_FUNC_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseFuncKbn(Long warehouseFuncKbn) {
        registerModifiedProperty("warehouseFuncKbn");
        _warehouseFuncKbn = warehouseFuncKbn;
    }

    /**
     * [get] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDpcd() {
        checkSpecifiedProperty("dpcd");
        return convertEmptyToNull(_dpcd);
    }

    /**
     * [set] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @param dpcd The value of the column 'DPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDpcd(String dpcd) {
        registerModifiedProperty("dpcd");
        _dpcd = dpcd;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
