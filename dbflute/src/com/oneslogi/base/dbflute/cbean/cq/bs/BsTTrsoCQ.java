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
 * The base condition-query of T_TRSO.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrsoCQ extends AbstractBsTTrsoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrsoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrsoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRSO) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrsoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrsoCIQ xcreateCIQ() {
        TTrsoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrsoCIQ xnewCIQ() {
        return new TTrsoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRSO on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrsoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrsoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _soid;
    public ConditionValue xdfgetSoid()
    { if (_soid == null) { _soid = nCV(); }
      return _soid; }
    protected ConditionValue xgetCValueSoid() { return xdfgetSoid(); }

    /**
     * Add order-by as ascend. <br>
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Soid_Asc() { regOBA("SOID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Soid_Desc() { regOBD("SOID"); return this; }

    protected ConditionValue _sokey;
    public ConditionValue xdfgetSokey()
    { if (_sokey == null) { _sokey = nCV(); }
      return _sokey; }
    protected ConditionValue xgetCValueSokey() { return xdfgetSokey(); }

    /**
     * Add order-by as ascend. <br>
     * SOKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Sokey_Asc() { regOBA("SOKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Sokey_Desc() { regOBD("SOKEY"); return this; }

    protected ConditionValue _ownersono;
    public ConditionValue xdfgetOwnersono()
    { if (_ownersono == null) { _ownersono = nCV(); }
      return _ownersono; }
    protected ConditionValue xgetCValueOwnersono() { return xdfgetOwnersono(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERSONO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Ownersono_Asc() { regOBA("OWNERSONO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERSONO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Ownersono_Desc() { regOBD("OWNERSONO"); return this; }

    protected ConditionValue _preownersono;
    public ConditionValue xdfgetPreownersono()
    { if (_preownersono == null) { _preownersono = nCV(); }
      return _preownersono; }
    protected ConditionValue xgetCValuePreownersono() { return xdfgetPreownersono(); }

    /**
     * Add order-by as ascend. <br>
     * PREOWNERSONO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Preownersono_Asc() { regOBA("PREOWNERSONO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PREOWNERSONO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Preownersono_Desc() { regOBD("PREOWNERSONO"); return this; }

    protected ConditionValue _sotype;
    public ConditionValue xdfgetSotype()
    { if (_sotype == null) { _sotype = nCV(); }
      return _sotype; }
    protected ConditionValue xgetCValueSotype() { return xdfgetSotype(); }

    /**
     * Add order-by as ascend. <br>
     * SOTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Sotype_Asc() { regOBA("SOTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Sotype_Desc() { regOBD("SOTYPE"); return this; }

    protected ConditionValue _partflg;
    public ConditionValue xdfgetPartflg()
    { if (_partflg == null) { _partflg = nCV(); }
      return _partflg; }
    protected ConditionValue xgetCValuePartflg() { return xdfgetPartflg(); }

    /**
     * Add order-by as ascend. <br>
     * PARTFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Partflg_Asc() { regOBA("PARTFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PARTFLG: {NotNull, char(1), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Partflg_Desc() { regOBD("PARTFLG"); return this; }

    protected ConditionValue _sts;
    public ConditionValue xdfgetSts()
    { if (_sts == null) { _sts = nCV(); }
      return _sts; }
    protected ConditionValue xgetCValueSts() { return xdfgetSts(); }

    /**
     * Add order-by as ascend. <br>
     * STS: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Sts_Asc() { regOBA("STS"); return this; }

    /**
     * Add order-by as descend. <br>
     * STS: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Sts_Desc() { regOBD("STS"); return this; }

    protected ConditionValue _companycd;
    public ConditionValue xdfgetCompanycd()
    { if (_companycd == null) { _companycd = nCV(); }
      return _companycd; }
    protected ConditionValue xgetCValueCompanycd() { return xdfgetCompanycd(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANYCD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Companycd_Asc() { regOBA("COMPANYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANYCD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Companycd_Desc() { regOBD("COMPANYCD"); return this; }

    protected ConditionValue _orderkey;
    public ConditionValue xdfgetOrderkey()
    { if (_orderkey == null) { _orderkey = nCV(); }
      return _orderkey; }
    protected ConditionValue xgetCValueOrderkey() { return xdfgetOrderkey(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERKEY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Orderkey_Asc() { regOBA("ORDERKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERKEY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Orderkey_Desc() { regOBD("ORDERKEY"); return this; }

    protected ConditionValue _ownerorderno;
    public ConditionValue xdfgetOwnerorderno()
    { if (_ownerorderno == null) { _ownerorderno = nCV(); }
      return _ownerorderno; }
    protected ConditionValue xgetCValueOwnerorderno() { return xdfgetOwnerorderno(); }

    /**
     * Add order-by as ascend. <br>
     * OWNERORDERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Ownerorderno_Asc() { regOBA("OWNERORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNERORDERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Ownerorderno_Desc() { regOBD("OWNERORDERNO"); return this; }

    protected ConditionValue _ordertype;
    public ConditionValue xdfgetOrdertype()
    { if (_ordertype == null) { _ordertype = nCV(); }
      return _ordertype; }
    protected ConditionValue xgetCValueOrdertype() { return xdfgetOrdertype(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Ordertype_Asc() { regOBA("ORDERTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERTYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Ordertype_Desc() { regOBD("ORDERTYPE"); return this; }

    protected ConditionValue _custorderno;
    public ConditionValue xdfgetCustorderno()
    { if (_custorderno == null) { _custorderno = nCV(); }
      return _custorderno; }
    protected ConditionValue xgetCValueCustorderno() { return xdfgetCustorderno(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTORDERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Custorderno_Asc() { regOBA("CUSTORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTORDERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Custorderno_Desc() { regOBD("CUSTORDERNO"); return this; }

    protected ConditionValue _customerCd;
    public ConditionValue xdfgetCustomerCd()
    { if (_customerCd == null) { _customerCd = nCV(); }
      return _customerCd; }
    protected ConditionValue xgetCValueCustomerCd() { return xdfgetCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

    protected ConditionValue _rmano;
    public ConditionValue xdfgetRmano()
    { if (_rmano == null) { _rmano = nCV(); }
      return _rmano; }
    protected ConditionValue xgetCValueRmano() { return xdfgetRmano(); }

    /**
     * Add order-by as ascend. <br>
     * RMANO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Rmano_Asc() { regOBA("RMANO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RMANO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Rmano_Desc() { regOBD("RMANO"); return this; }

    protected ConditionValue _orderdate;
    public ConditionValue xdfgetOrderdate()
    { if (_orderdate == null) { _orderdate = nCV(); }
      return _orderdate; }
    protected ConditionValue xgetCValueOrderdate() { return xdfgetOrderdate(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Orderdate_Asc() { regOBA("ORDERDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Orderdate_Desc() { regOBD("ORDERDATE"); return this; }

    protected ConditionValue _shipschdate;
    public ConditionValue xdfgetShipschdate()
    { if (_shipschdate == null) { _shipschdate = nCV(); }
      return _shipschdate; }
    protected ConditionValue xgetCValueShipschdate() { return xdfgetShipschdate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPSCHDATE: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Shipschdate_Asc() { regOBA("SHIPSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPSCHDATE: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Shipschdate_Desc() { regOBD("SHIPSCHDATE"); return this; }

    protected ConditionValue _shipdate;
    public ConditionValue xdfgetShipdate()
    { if (_shipdate == null) { _shipdate = nCV(); }
      return _shipdate; }
    protected ConditionValue xgetCValueShipdate() { return xdfgetShipdate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Shipdate_Asc() { regOBA("SHIPDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Shipdate_Desc() { regOBD("SHIPDATE"); return this; }

    protected ConditionValue _delivschdate;
    public ConditionValue xdfgetDelivschdate()
    { if (_delivschdate == null) { _delivschdate = nCV(); }
      return _delivschdate; }
    protected ConditionValue xgetCValueDelivschdate() { return xdfgetDelivschdate(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Delivschdate_Asc() { regOBA("DELIVSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Delivschdate_Desc() { regOBD("DELIVSCHDATE"); return this; }

    protected ConditionValue _delivdate;
    public ConditionValue xdfgetDelivdate()
    { if (_delivdate == null) { _delivdate = nCV(); }
      return _delivdate; }
    protected ConditionValue xgetCValueDelivdate() { return xdfgetDelivdate(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Delivdate_Asc() { regOBA("DELIVDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Delivdate_Desc() { regOBD("DELIVDATE"); return this; }

    protected ConditionValue _carryschdate;
    public ConditionValue xdfgetCarryschdate()
    { if (_carryschdate == null) { _carryschdate = nCV(); }
      return _carryschdate; }
    protected ConditionValue xgetCValueCarryschdate() { return xdfgetCarryschdate(); }

    /**
     * Add order-by as ascend. <br>
     * CARRYSCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carryschdate_Asc() { regOBA("CARRYSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRYSCHDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carryschdate_Desc() { regOBD("CARRYSCHDATE"); return this; }

    protected ConditionValue _carryoutdate;
    public ConditionValue xdfgetCarryoutdate()
    { if (_carryoutdate == null) { _carryoutdate = nCV(); }
      return _carryoutdate; }
    protected ConditionValue xgetCValueCarryoutdate() { return xdfgetCarryoutdate(); }

    /**
     * Add order-by as ascend. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carryoutdate_Asc() { regOBA("CARRYOUTDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carryoutdate_Desc() { regOBD("CARRYOUTDATE"); return this; }

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
    public BsTTrsoCQ addOrderBy_Transportpriority_Asc() { regOBA("TRANSPORTPRIORITY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Transportpriority_Desc() { regOBD("TRANSPORTPRIORITY"); return this; }

    protected ConditionValue _shiptocd;
    public ConditionValue xdfgetShiptocd()
    { if (_shiptocd == null) { _shiptocd = nCV(); }
      return _shiptocd; }
    protected ConditionValue xgetCValueShiptocd() { return xdfgetShiptocd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Shiptocd_Asc() { regOBA("SHIPTOCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Shiptocd_Desc() { regOBD("SHIPTOCD"); return this; }

    protected ConditionValue _shiptosub;
    public ConditionValue xdfgetShiptosub()
    { if (_shiptosub == null) { _shiptosub = nCV(); }
      return _shiptosub; }
    protected ConditionValue xgetCValueShiptosub() { return xdfgetShiptosub(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPTOSUB: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Shiptosub_Asc() { regOBA("SHIPTOSUB"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPTOSUB: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Shiptosub_Desc() { regOBD("SHIPTOSUB"); return this; }

    protected ConditionValue _delivname;
    public ConditionValue xdfgetDelivname()
    { if (_delivname == null) { _delivname = nCV(); }
      return _delivname; }
    protected ConditionValue xgetCValueDelivname() { return xdfgetDelivname(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Delivname_Asc() { regOBA("DELIVNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Delivname_Desc() { regOBD("DELIVNAME"); return this; }

    protected ConditionValue _address1;
    public ConditionValue xdfgetAddress1()
    { if (_address1 == null) { _address1 = nCV(); }
      return _address1; }
    protected ConditionValue xgetCValueAddress1() { return xdfgetAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS1: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Address1_Asc() { regOBA("ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS1: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Address1_Desc() { regOBD("ADDRESS1"); return this; }

    protected ConditionValue _address2;
    public ConditionValue xdfgetAddress2()
    { if (_address2 == null) { _address2 = nCV(); }
      return _address2; }
    protected ConditionValue xgetCValueAddress2() { return xdfgetAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Address2_Asc() { regOBA("ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Address2_Desc() { regOBD("ADDRESS2"); return this; }

    protected ConditionValue _address3;
    public ConditionValue xdfgetAddress3()
    { if (_address3 == null) { _address3 = nCV(); }
      return _address3; }
    protected ConditionValue xgetCValueAddress3() { return xdfgetAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Address3_Asc() { regOBA("ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Address3_Desc() { regOBD("ADDRESS3"); return this; }

    protected ConditionValue _postno;
    public ConditionValue xdfgetPostno()
    { if (_postno == null) { _postno = nCV(); }
      return _postno; }
    protected ConditionValue xgetCValuePostno() { return xdfgetPostno(); }

    /**
     * Add order-by as ascend. <br>
     * POSTNO: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Postno_Asc() { regOBA("POSTNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * POSTNO: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Postno_Desc() { regOBD("POSTNO"); return this; }

    protected ConditionValue _countrycd;
    public ConditionValue xdfgetCountrycd()
    { if (_countrycd == null) { _countrycd = nCV(); }
      return _countrycd; }
    protected ConditionValue xgetCValueCountrycd() { return xdfgetCountrycd(); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Countrycd_Asc() { regOBA("COUNTRYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRYCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Countrycd_Desc() { regOBD("COUNTRYCD"); return this; }

    protected ConditionValue _portcd;
    public ConditionValue xdfgetPortcd()
    { if (_portcd == null) { _portcd = nCV(); }
      return _portcd; }
    protected ConditionValue xgetCValuePortcd() { return xdfgetPortcd(); }

    /**
     * Add order-by as ascend. <br>
     * PORTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Portcd_Asc() { regOBA("PORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PORTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Portcd_Desc() { regOBD("PORTCD"); return this; }

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
    public BsTTrsoCQ addOrderBy_Districtcd_Asc() { regOBA("DISTRICTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISTRICTCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Districtcd_Desc() { regOBD("DISTRICTCD"); return this; }

    protected ConditionValue _phoneno;
    public ConditionValue xdfgetPhoneno()
    { if (_phoneno == null) { _phoneno = nCV(); }
      return _phoneno; }
    protected ConditionValue xgetCValuePhoneno() { return xdfgetPhoneno(); }

    /**
     * Add order-by as ascend. <br>
     * PHONENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Phoneno_Asc() { regOBA("PHONENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PHONENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Phoneno_Desc() { regOBD("PHONENO"); return this; }

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
    public BsTTrsoCQ addOrderBy_Fax1_Asc() { regOBA("FAX1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FAX1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Fax1_Desc() { regOBD("FAX1"); return this; }

    protected ConditionValue _email;
    public ConditionValue xdfgetEmail()
    { if (_email == null) { _email = nCV(); }
      return _email; }
    protected ConditionValue xgetCValueEmail() { return xdfgetEmail(); }

    /**
     * Add order-by as ascend. <br>
     * EMAIL: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Email_Asc() { regOBA("EMAIL"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMAIL: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Email_Desc() { regOBD("EMAIL"); return this; }

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
    public BsTTrsoCQ addOrderBy_Refname_Asc() { regOBA("REFNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Refname_Desc() { regOBD("REFNAME"); return this; }

    protected ConditionValue _areacd;
    public ConditionValue xdfgetAreacd()
    { if (_areacd == null) { _areacd = nCV(); }
      return _areacd; }
    protected ConditionValue xgetCValueAreacd() { return xdfgetAreacd(); }

    /**
     * Add order-by as ascend. <br>
     * AREACD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Areacd_Asc() { regOBA("AREACD"); return this; }

    /**
     * Add order-by as descend. <br>
     * AREACD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Areacd_Desc() { regOBD("AREACD"); return this; }

    protected ConditionValue _allocgroup;
    public ConditionValue xdfgetAllocgroup()
    { if (_allocgroup == null) { _allocgroup = nCV(); }
      return _allocgroup; }
    protected ConditionValue xgetCValueAllocgroup() { return xdfgetAllocgroup(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOCGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Allocgroup_Asc() { regOBA("ALLOCGROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOCGROUP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Allocgroup_Desc() { regOBD("ALLOCGROUP"); return this; }

    protected ConditionValue _carriercd;
    public ConditionValue xdfgetCarriercd()
    { if (_carriercd == null) { _carriercd = nCV(); }
      return _carriercd; }
    protected ConditionValue xgetCValueCarriercd() { return xdfgetCarriercd(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carriercd_Asc() { regOBA("CARRIERCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carriercd_Desc() { regOBD("CARRIERCD"); return this; }

    protected ConditionValue _carriername;
    public ConditionValue xdfgetCarriername()
    { if (_carriername == null) { _carriername = nCV(); }
      return _carriername; }
    protected ConditionValue xgetCValueCarriername() { return xdfgetCarriername(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carriername_Asc() { regOBA("CARRIERNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carriername_Desc() { regOBD("CARRIERNAME"); return this; }

    protected ConditionValue _carrierwbno;
    public ConditionValue xdfgetCarrierwbno()
    { if (_carrierwbno == null) { _carrierwbno = nCV(); }
      return _carrierwbno; }
    protected ConditionValue xgetCValueCarrierwbno() { return xdfgetCarrierwbno(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERWBNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carrierwbno_Asc() { regOBA("CARRIERWBNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERWBNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carrierwbno_Desc() { regOBD("CARRIERWBNO"); return this; }

    protected ConditionValue _deliverycd;
    public ConditionValue xdfgetDeliverycd()
    { if (_deliverycd == null) { _deliverycd = nCV(); }
      return _deliverycd; }
    protected ConditionValue xgetCValueDeliverycd() { return xdfgetDeliverycd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERYCD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Deliverycd_Asc() { regOBA("DELIVERYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERYCD: {IX, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Deliverycd_Desc() { regOBD("DELIVERYCD"); return this; }

    protected ConditionValue _carrierno;
    public ConditionValue xdfgetCarrierno()
    { if (_carrierno == null) { _carrierno = nCV(); }
      return _carrierno; }
    protected ConditionValue xgetCValueCarrierno() { return xdfgetCarrierno(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carrierno_Asc() { regOBA("CARRIERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carrierno_Desc() { regOBD("CARRIERNO"); return this; }

    protected ConditionValue _carriersname;
    public ConditionValue xdfgetCarriersname()
    { if (_carriersname == null) { _carriersname = nCV(); }
      return _carriersname; }
    protected ConditionValue xgetCValueCarriersname() { return xdfgetCarriersname(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERSNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carriersname_Asc() { regOBA("CARRIERSNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERSNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carriersname_Desc() { regOBD("CARRIERSNAME"); return this; }

    protected ConditionValue _carcd;
    public ConditionValue xdfgetCarcd()
    { if (_carcd == null) { _carcd = nCV(); }
      return _carcd; }
    protected ConditionValue xgetCValueCarcd() { return xdfgetCarcd(); }

    /**
     * Add order-by as ascend. <br>
     * CARCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carcd_Asc() { regOBA("CARCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carcd_Desc() { regOBD("CARCD"); return this; }

    protected ConditionValue _carrierseq;
    public ConditionValue xdfgetCarrierseq()
    { if (_carrierseq == null) { _carrierseq = nCV(); }
      return _carrierseq; }
    protected ConditionValue xgetCValueCarrierseq() { return xdfgetCarrierseq(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carrierseq_Asc() { regOBA("CARRIERSEQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Carrierseq_Desc() { regOBD("CARRIERSEQ"); return this; }

    protected ConditionValue _itemcd;
    public ConditionValue xdfgetItemcd()
    { if (_itemcd == null) { _itemcd = nCV(); }
      return _itemcd; }
    protected ConditionValue xgetCValueItemcd() { return xdfgetItemcd(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Itemcd_Asc() { regOBA("ITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Itemcd_Desc() { regOBD("ITEMCD"); return this; }

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
    public BsTTrsoCQ addOrderBy_Notes_Asc() { regOBA("NOTES"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOTES: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Notes_Desc() { regOBD("NOTES"); return this; }

    protected ConditionValue _otherrefno1;
    public ConditionValue xdfgetOtherrefno1()
    { if (_otherrefno1 == null) { _otherrefno1 = nCV(); }
      return _otherrefno1; }
    protected ConditionValue xgetCValueOtherrefno1() { return xdfgetOtherrefno1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Otherrefno1_Asc() { regOBA("OTHERREFNO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Otherrefno1_Desc() { regOBD("OTHERREFNO1"); return this; }

    protected ConditionValue _otherrefno2;
    public ConditionValue xdfgetOtherrefno2()
    { if (_otherrefno2 == null) { _otherrefno2 = nCV(); }
      return _otherrefno2; }
    protected ConditionValue xgetCValueOtherrefno2() { return xdfgetOtherrefno2(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Otherrefno2_Asc() { regOBA("OTHERREFNO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Otherrefno2_Desc() { regOBD("OTHERREFNO2"); return this; }

    protected ConditionValue _otherrefno3;
    public ConditionValue xdfgetOtherrefno3()
    { if (_otherrefno3 == null) { _otherrefno3 = nCV(); }
      return _otherrefno3; }
    protected ConditionValue xgetCValueOtherrefno3() { return xdfgetOtherrefno3(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Otherrefno3_Asc() { regOBA("OTHERREFNO3"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Otherrefno3_Desc() { regOBD("OTHERREFNO3"); return this; }

    protected ConditionValue _pickingInstId;
    public ConditionValue xdfgetPickingInstId()
    { if (_pickingInstId == null) { _pickingInstId = nCV(); }
      return _pickingInstId; }
    protected ConditionValue xgetCValuePickingInstId() { return xdfgetPickingInstId(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_PickingInstId_Asc() { regOBA("PICKING_INST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_PickingInstId_Desc() { regOBD("PICKING_INST_ID"); return this; }

    protected ConditionValue _execkey;
    public ConditionValue xdfgetExeckey()
    { if (_execkey == null) { _execkey = nCV(); }
      return _execkey; }
    protected ConditionValue xgetCValueExeckey() { return xdfgetExeckey(); }

    /**
     * Add order-by as ascend. <br>
     * EXECKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Execkey_Asc() { regOBA("EXECKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXECKEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_Execkey_Desc() { regOBD("EXECKEY"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrsoCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrsoCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrsoCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrsoCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrsoCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrsoCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrsoCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrsoCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrsoCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsoCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrsoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrsoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrsoCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrsoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrsoCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrsoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrsoCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrsoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrsoCQ> _myselfExistsMap;
    public Map<String, TTrsoCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrsoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrsoCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrsoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrsoCB.class.getName(); }
    protected String xCQ() { return TTrsoCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
