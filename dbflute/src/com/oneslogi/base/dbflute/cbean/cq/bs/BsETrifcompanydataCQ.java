package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of E_TRIFCOMPANYDATA.
 * @author DBFlute(AutoGenerator)
 */
public class BsETrifcompanydataCQ extends AbstractBsETrifcompanydataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ETrifcompanydataCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsETrifcompanydataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_TRIFCOMPANYDATA) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ETrifcompanydataCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ETrifcompanydataCIQ xcreateCIQ() {
        ETrifcompanydataCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ETrifcompanydataCIQ xnewCIQ() {
        return new ETrifcompanydataCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_TRIFCOMPANYDATA on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ETrifcompanydataCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ETrifcompanydataCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ifdatakey;
    public ConditionValue xdfgetIfdatakey()
    { if (_ifdatakey == null) { _ifdatakey = nCV(); }
      return _ifdatakey; }
    protected ConditionValue xgetCValueIfdatakey() { return xdfgetIfdatakey(); }

    /**
     * Add order-by as ascend. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Ifdatakey_Asc() { regOBA("IFDATAKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * IFDATAKEY: {PK, NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Ifdatakey_Desc() { regOBD("IFDATAKEY"); return this; }

    protected ConditionValue _segname;
    public ConditionValue xdfgetSegname()
    { if (_segname == null) { _segname = nCV(); }
      return _segname; }
    protected ConditionValue xgetCValueSegname() { return xdfgetSegname(); }

    /**
     * Add order-by as ascend. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Segname_Asc() { regOBA("SEGNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEGNAME: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Segname_Desc() { regOBD("SEGNAME"); return this; }

    protected ConditionValue _refno;
    public ConditionValue xdfgetRefno()
    { if (_refno == null) { _refno = nCV(); }
      return _refno; }
    protected ConditionValue xgetCValueRefno() { return xdfgetRefno(); }

    /**
     * Add order-by as ascend. <br>
     * REFNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Refno_Asc() { regOBA("REFNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Refno_Desc() { regOBD("REFNO"); return this; }

    protected ConditionValue _companycd;
    public ConditionValue xdfgetCompanycd()
    { if (_companycd == null) { _companycd = nCV(); }
      return _companycd; }
    protected ConditionValue xgetCValueCompanycd() { return xdfgetCompanycd(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANYCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Companycd_Asc() { regOBA("COMPANYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANYCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Companycd_Desc() { regOBD("COMPANYCD"); return this; }

    protected ConditionValue _itemadmin;
    public ConditionValue xdfgetItemadmin()
    { if (_itemadmin == null) { _itemadmin = nCV(); }
      return _itemadmin; }
    protected ConditionValue xgetCValueItemadmin() { return xdfgetItemadmin(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMADMIN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Itemadmin_Asc() { regOBA("ITEMADMIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMADMIN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Itemadmin_Desc() { regOBD("ITEMADMIN"); return this; }

    protected ConditionValue _companygroup;
    public ConditionValue xdfgetCompanygroup()
    { if (_companygroup == null) { _companygroup = nCV(); }
      return _companygroup; }
    protected ConditionValue xgetCValueCompanygroup() { return xdfgetCompanygroup(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANYGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Companygroup_Asc() { regOBA("COMPANYGROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANYGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Companygroup_Desc() { regOBD("COMPANYGROUP"); return this; }

    protected ConditionValue _actflg;
    public ConditionValue xdfgetActflg()
    { if (_actflg == null) { _actflg = nCV(); }
      return _actflg; }
    protected ConditionValue xgetCValueActflg() { return xdfgetActflg(); }

    /**
     * Add order-by as ascend. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Actflg_Asc() { regOBA("ACTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Actflg_Desc() { regOBD("ACTFLG"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /**
     * Add order-by as ascend. <br>
     * NAME: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

    protected ConditionValue _sname;
    public ConditionValue xdfgetSname()
    { if (_sname == null) { _sname = nCV(); }
      return _sname; }
    protected ConditionValue xgetCValueSname() { return xdfgetSname(); }

    /**
     * Add order-by as ascend. <br>
     * SNAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Sname_Asc() { regOBA("SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SNAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Sname_Desc() { regOBD("SNAME"); return this; }

    protected ConditionValue _aname;
    public ConditionValue xdfgetAname()
    { if (_aname == null) { _aname = nCV(); }
      return _aname; }
    protected ConditionValue xgetCValueAname() { return xdfgetAname(); }

    /**
     * Add order-by as ascend. <br>
     * ANAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Aname_Asc() { regOBA("ANAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ANAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Aname_Desc() { regOBD("ANAME"); return this; }

    protected ConditionValue _address1;
    public ConditionValue xdfgetAddress1()
    { if (_address1 == null) { _address1 = nCV(); }
      return _address1; }
    protected ConditionValue xgetCValueAddress1() { return xdfgetAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Address1_Asc() { regOBA("ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Address1_Desc() { regOBD("ADDRESS1"); return this; }

    protected ConditionValue _address2;
    public ConditionValue xdfgetAddress2()
    { if (_address2 == null) { _address2 = nCV(); }
      return _address2; }
    protected ConditionValue xgetCValueAddress2() { return xdfgetAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Address2_Asc() { regOBA("ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Address2_Desc() { regOBD("ADDRESS2"); return this; }

    protected ConditionValue _address3;
    public ConditionValue xdfgetAddress3()
    { if (_address3 == null) { _address3 = nCV(); }
      return _address3; }
    protected ConditionValue xgetCValueAddress3() { return xdfgetAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Address3_Asc() { regOBA("ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Address3_Desc() { regOBD("ADDRESS3"); return this; }

    protected ConditionValue _postno;
    public ConditionValue xdfgetPostno()
    { if (_postno == null) { _postno = nCV(); }
      return _postno; }
    protected ConditionValue xgetCValuePostno() { return xdfgetPostno(); }

    /**
     * Add order-by as ascend. <br>
     * POSTNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Postno_Asc() { regOBA("POSTNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * POSTNO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Postno_Desc() { regOBD("POSTNO"); return this; }

    protected ConditionValue _countrycd;
    public ConditionValue xdfgetCountrycd()
    { if (_countrycd == null) { _countrycd = nCV(); }
      return _countrycd; }
    protected ConditionValue xgetCValueCountrycd() { return xdfgetCountrycd(); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRYCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Countrycd_Asc() { regOBA("COUNTRYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRYCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Countrycd_Desc() { regOBD("COUNTRYCD"); return this; }

    protected ConditionValue _portcd;
    public ConditionValue xdfgetPortcd()
    { if (_portcd == null) { _portcd = nCV(); }
      return _portcd; }
    protected ConditionValue xgetCValuePortcd() { return xdfgetPortcd(); }

    /**
     * Add order-by as ascend. <br>
     * PORTCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Portcd_Asc() { regOBA("PORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PORTCD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Portcd_Desc() { regOBD("PORTCD"); return this; }

    protected ConditionValue _districtcd;
    public ConditionValue xdfgetDistrictcd()
    { if (_districtcd == null) { _districtcd = nCV(); }
      return _districtcd; }
    protected ConditionValue xgetCValueDistrictcd() { return xdfgetDistrictcd(); }

    /**
     * Add order-by as ascend. <br>
     * DISTRICTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Districtcd_Asc() { regOBA("DISTRICTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISTRICTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Districtcd_Desc() { regOBD("DISTRICTCD"); return this; }

    protected ConditionValue _phone1;
    public ConditionValue xdfgetPhone1()
    { if (_phone1 == null) { _phone1 = nCV(); }
      return _phone1; }
    protected ConditionValue xgetCValuePhone1() { return xdfgetPhone1(); }

    /**
     * Add order-by as ascend. <br>
     * PHONE1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Phone1_Asc() { regOBA("PHONE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * PHONE1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Phone1_Desc() { regOBD("PHONE1"); return this; }

    protected ConditionValue _phone2;
    public ConditionValue xdfgetPhone2()
    { if (_phone2 == null) { _phone2 = nCV(); }
      return _phone2; }
    protected ConditionValue xgetCValuePhone2() { return xdfgetPhone2(); }

    /**
     * Add order-by as ascend. <br>
     * PHONE2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Phone2_Asc() { regOBA("PHONE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * PHONE2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Phone2_Desc() { regOBD("PHONE2"); return this; }

    protected ConditionValue _fax1;
    public ConditionValue xdfgetFax1()
    { if (_fax1 == null) { _fax1 = nCV(); }
      return _fax1; }
    protected ConditionValue xgetCValueFax1() { return xdfgetFax1(); }

    /**
     * Add order-by as ascend. <br>
     * FAX1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Fax1_Asc() { regOBA("FAX1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FAX1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Fax1_Desc() { regOBD("FAX1"); return this; }

    protected ConditionValue _fax2;
    public ConditionValue xdfgetFax2()
    { if (_fax2 == null) { _fax2 = nCV(); }
      return _fax2; }
    protected ConditionValue xgetCValueFax2() { return xdfgetFax2(); }

    /**
     * Add order-by as ascend. <br>
     * FAX2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Fax2_Asc() { regOBA("FAX2"); return this; }

    /**
     * Add order-by as descend. <br>
     * FAX2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Fax2_Desc() { regOBD("FAX2"); return this; }

    protected ConditionValue _refname;
    public ConditionValue xdfgetRefname()
    { if (_refname == null) { _refname = nCV(); }
      return _refname; }
    protected ConditionValue xgetCValueRefname() { return xdfgetRefname(); }

    /**
     * Add order-by as ascend. <br>
     * REFNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Refname_Asc() { regOBA("REFNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Refname_Desc() { regOBD("REFNAME"); return this; }

    protected ConditionValue _email;
    public ConditionValue xdfgetEmail()
    { if (_email == null) { _email = nCV(); }
      return _email; }
    protected ConditionValue xgetCValueEmail() { return xdfgetEmail(); }

    /**
     * Add order-by as ascend. <br>
     * EMAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Email_Asc() { regOBA("EMAIL"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Email_Desc() { regOBD("EMAIL"); return this; }

    protected ConditionValue _url;
    public ConditionValue xdfgetUrl()
    { if (_url == null) { _url = nCV(); }
      return _url; }
    protected ConditionValue xgetCValueUrl() { return xdfgetUrl(); }

    /**
     * Add order-by as ascend. <br>
     * URL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Url_Asc() { regOBA("URL"); return this; }

    /**
     * Add order-by as descend. <br>
     * URL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Url_Desc() { regOBD("URL"); return this; }

    protected ConditionValue _typeowner;
    public ConditionValue xdfgetTypeowner()
    { if (_typeowner == null) { _typeowner = nCV(); }
      return _typeowner; }
    protected ConditionValue xgetCValueTypeowner() { return xdfgetTypeowner(); }

    /**
     * Add order-by as ascend. <br>
     * TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typeowner_Asc() { regOBA("TYPEOWNER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typeowner_Desc() { regOBD("TYPEOWNER"); return this; }

    protected ConditionValue _typecustomer;
    public ConditionValue xdfgetTypecustomer()
    { if (_typecustomer == null) { _typecustomer = nCV(); }
      return _typecustomer; }
    protected ConditionValue xgetCValueTypecustomer() { return xdfgetTypecustomer(); }

    /**
     * Add order-by as ascend. <br>
     * TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typecustomer_Asc() { regOBA("TYPECUSTOMER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typecustomer_Desc() { regOBD("TYPECUSTOMER"); return this; }

    protected ConditionValue _typeshipto;
    public ConditionValue xdfgetTypeshipto()
    { if (_typeshipto == null) { _typeshipto = nCV(); }
      return _typeshipto; }
    protected ConditionValue xgetCValueTypeshipto() { return xdfgetTypeshipto(); }

    /**
     * Add order-by as ascend. <br>
     * TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typeshipto_Asc() { regOBA("TYPESHIPTO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typeshipto_Desc() { regOBD("TYPESHIPTO"); return this; }

    protected ConditionValue _typesupplier;
    public ConditionValue xdfgetTypesupplier()
    { if (_typesupplier == null) { _typesupplier = nCV(); }
      return _typesupplier; }
    protected ConditionValue xgetCValueTypesupplier() { return xdfgetTypesupplier(); }

    /**
     * Add order-by as ascend. <br>
     * TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typesupplier_Asc() { regOBA("TYPESUPPLIER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typesupplier_Desc() { regOBD("TYPESUPPLIER"); return this; }

    protected ConditionValue _typewarehouse;
    public ConditionValue xdfgetTypewarehouse()
    { if (_typewarehouse == null) { _typewarehouse = nCV(); }
      return _typewarehouse; }
    protected ConditionValue xgetCValueTypewarehouse() { return xdfgetTypewarehouse(); }

    /**
     * Add order-by as ascend. <br>
     * TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typewarehouse_Asc() { regOBA("TYPEWAREHOUSE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typewarehouse_Desc() { regOBD("TYPEWAREHOUSE"); return this; }

    protected ConditionValue _typecarrier;
    public ConditionValue xdfgetTypecarrier()
    { if (_typecarrier == null) { _typecarrier = nCV(); }
      return _typecarrier; }
    protected ConditionValue xgetCValueTypecarrier() { return xdfgetTypecarrier(); }

    /**
     * Add order-by as ascend. <br>
     * TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typecarrier_Asc() { regOBA("TYPECARRIER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typecarrier_Desc() { regOBD("TYPECARRIER"); return this; }

    protected ConditionValue _typeetc;
    public ConditionValue xdfgetTypeetc()
    { if (_typeetc == null) { _typeetc = nCV(); }
      return _typeetc; }
    protected ConditionValue xgetCValueTypeetc() { return xdfgetTypeetc(); }

    /**
     * Add order-by as ascend. <br>
     * TYPEETC: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typeetc_Asc() { regOBA("TYPEETC"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPEETC: {NotNull, decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Typeetc_Desc() { regOBD("TYPEETC"); return this; }

    protected ConditionValue _ownoranotherflg;
    public ConditionValue xdfgetOwnoranotherflg()
    { if (_ownoranotherflg == null) { _ownoranotherflg = nCV(); }
      return _ownoranotherflg; }
    protected ConditionValue xgetCValueOwnoranotherflg() { return xdfgetOwnoranotherflg(); }

    /**
     * Add order-by as ascend. <br>
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Ownoranotherflg_Asc() { regOBA("OWNORANOTHERFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Ownoranotherflg_Desc() { regOBD("OWNORANOTHERFLG"); return this; }

    protected ConditionValue _notes;
    public ConditionValue xdfgetNotes()
    { if (_notes == null) { _notes = nCV(); }
      return _notes; }
    protected ConditionValue xgetCValueNotes() { return xdfgetNotes(); }

    /**
     * Add order-by as ascend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

    protected ConditionValue _fUser1;
    public ConditionValue xdfgetFUser1()
    { if (_fUser1 == null) { _fUser1 = nCV(); }
      return _fUser1; }
    protected ConditionValue xgetCValueFUser1() { return xdfgetFUser1(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_FUser1_Asc() { regOBA("F_USER1"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_FUser1_Desc() { regOBD("F_USER1"); return this; }

    protected ConditionValue _fUser2;
    public ConditionValue xdfgetFUser2()
    { if (_fUser2 == null) { _fUser2 = nCV(); }
      return _fUser2; }
    protected ConditionValue xgetCValueFUser2() { return xdfgetFUser2(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_FUser2_Asc() { regOBA("F_USER2"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_FUser2_Desc() { regOBD("F_USER2"); return this; }

    protected ConditionValue _fUser3;
    public ConditionValue xdfgetFUser3()
    { if (_fUser3 == null) { _fUser3 = nCV(); }
      return _fUser3; }
    protected ConditionValue xgetCValueFUser3() { return xdfgetFUser3(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_FUser3_Asc() { regOBA("F_USER3"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_FUser3_Desc() { regOBD("F_USER3"); return this; }

    protected ConditionValue _fUser4;
    public ConditionValue xdfgetFUser4()
    { if (_fUser4 == null) { _fUser4 = nCV(); }
      return _fUser4; }
    protected ConditionValue xgetCValueFUser4() { return xdfgetFUser4(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_FUser4_Asc() { regOBA("F_USER4"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_FUser4_Desc() { regOBD("F_USER4"); return this; }

    protected ConditionValue _fUser5;
    public ConditionValue xdfgetFUser5()
    { if (_fUser5 == null) { _fUser5 = nCV(); }
      return _fUser5; }
    protected ConditionValue xgetCValueFUser5() { return xdfgetFUser5(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER5: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_FUser5_Asc() { regOBA("F_USER5"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER5: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_FUser5_Desc() { regOBD("F_USER5"); return this; }

    protected ConditionValue _transportpriority;
    public ConditionValue xdfgetTransportpriority()
    { if (_transportpriority == null) { _transportpriority = nCV(); }
      return _transportpriority; }
    protected ConditionValue xgetCValueTransportpriority() { return xdfgetTransportpriority(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Transportpriority_Asc() { regOBA("TRANSPORTPRIORITY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Transportpriority_Desc() { regOBD("TRANSPORTPRIORITY"); return this; }

    protected ConditionValue _purchasetype;
    public ConditionValue xdfgetPurchasetype()
    { if (_purchasetype == null) { _purchasetype = nCV(); }
      return _purchasetype; }
    protected ConditionValue xgetCValuePurchasetype() { return xdfgetPurchasetype(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASETYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Purchasetype_Asc() { regOBA("PURCHASETYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASETYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Purchasetype_Desc() { regOBD("PURCHASETYPE"); return this; }

    protected ConditionValue _calendarcd;
    public ConditionValue xdfgetCalendarcd()
    { if (_calendarcd == null) { _calendarcd = nCV(); }
      return _calendarcd; }
    protected ConditionValue xgetCValueCalendarcd() { return xdfgetCalendarcd(); }

    /**
     * Add order-by as ascend. <br>
     * CALENDARCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Calendarcd_Asc() { regOBA("CALENDARCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CALENDARCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Calendarcd_Desc() { regOBD("CALENDARCD"); return this; }

    protected ConditionValue _ownercustomercd;
    public ConditionValue xdfgetOwnercustomercd()
    { if (_ownercustomercd == null) { _ownercustomercd = nCV(); }
      return _ownercustomercd; }
    protected ConditionValue xgetCValueOwnercustomercd() { return xdfgetOwnercustomercd(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Ownercustomercd_Asc() { regOBA("OWNERCUSTOMERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Ownercustomercd_Desc() { regOBD("OWNERCUSTOMERCD"); return this; }

    protected ConditionValue _ownersuppliercd;
    public ConditionValue xdfgetOwnersuppliercd()
    { if (_ownersuppliercd == null) { _ownersuppliercd = nCV(); }
      return _ownersuppliercd; }
    protected ConditionValue xgetCValueOwnersuppliercd() { return xdfgetOwnersuppliercd(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Ownersuppliercd_Asc() { regOBA("OWNERSUPPLIERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Ownersuppliercd_Desc() { regOBD("OWNERSUPPLIERCD"); return this; }

    protected ConditionValue _ownerrefflg;
    public ConditionValue xdfgetOwnerrefflg()
    { if (_ownerrefflg == null) { _ownerrefflg = nCV(); }
      return _ownerrefflg; }
    protected ConditionValue xgetCValueOwnerrefflg() { return xdfgetOwnerrefflg(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERREFFLG: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Ownerrefflg_Asc() { regOBA("OWNERREFFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERREFFLG: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_Ownerrefflg_Desc() { regOBD("OWNERREFFLG"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsETrifcompanydataCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ETrifcompanydataCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ETrifcompanydataCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ETrifcompanydataCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ETrifcompanydataCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ETrifcompanydataCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ETrifcompanydataCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ETrifcompanydataCQ> _myselfExistsMap;
    public Map<String, ETrifcompanydataCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ETrifcompanydataCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ETrifcompanydataCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ETrifcompanydataCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ETrifcompanydataCB.class.getName(); }
    protected String xCQ() { return ETrifcompanydataCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
