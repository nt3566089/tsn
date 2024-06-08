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
 * The base condition-query of E_ZIP.
 * @author DBFlute(AutoGenerator)
 */
public class BsEZipCQ extends AbstractBsEZipCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EZipCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEZipCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_ZIP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EZipCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EZipCIQ xcreateCIQ() {
        EZipCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EZipCIQ xnewCIQ() {
        return new EZipCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_ZIP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EZipCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EZipCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _zipId;
    public ConditionValue xdfgetZipId()
    { if (_zipId == null) { _zipId = nCV(); }
      return _zipId; }
    protected ConditionValue xgetCValueZipId() { return xdfgetZipId(); }

    /**
     * Add order-by as ascend. <br>
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ZipId_Asc() { regOBA("ZIP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ZipId_Desc() { regOBD("ZIP_ID"); return this; }

    protected ConditionValue _receiveCd;
    public ConditionValue xdfgetReceiveCd()
    { if (_receiveCd == null) { _receiveCd = nCV(); }
      return _receiveCd; }
    protected ConditionValue xgetCValueReceiveCd() { return xdfgetReceiveCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

    protected ConditionValue _receiveRowId;
    public ConditionValue xdfgetReceiveRowId()
    { if (_receiveRowId == null) { _receiveRowId = nCV(); }
      return _receiveRowId; }
    protected ConditionValue xgetCValueReceiveRowId() { return xdfgetReceiveRowId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMessageCd;
    public ConditionValue xdfgetErrorMessageCd()
    { if (_errorMessageCd == null) { _errorMessageCd = nCV(); }
      return _errorMessageCd; }
    protected ConditionValue xgetCValueErrorMessageCd() { return xdfgetErrorMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _zipCd;
    public ConditionValue xdfgetZipCd()
    { if (_zipCd == null) { _zipCd = nCV(); }
      return _zipCd; }
    protected ConditionValue xgetCValueZipCd() { return xdfgetZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * ZIP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ZipCd_Asc() { regOBA("ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ZipCd_Desc() { regOBD("ZIP_CD"); return this; }

    protected ConditionValue _publicCd;
    public ConditionValue xdfgetPublicCd()
    { if (_publicCd == null) { _publicCd = nCV(); }
      return _publicCd; }
    protected ConditionValue xgetCValuePublicCd() { return xdfgetPublicCd(); }

    /**
     * Add order-by as ascend. <br>
     * PUBLIC_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_PublicCd_Asc() { regOBA("PUBLIC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PUBLIC_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_PublicCd_Desc() { regOBD("PUBLIC_CD"); return this; }

    protected ConditionValue _zipCd5;
    public ConditionValue xdfgetZipCd5()
    { if (_zipCd5 == null) { _zipCd5 = nCV(); }
      return _zipCd5; }
    protected ConditionValue xgetCValueZipCd5() { return xdfgetZipCd5(); }

    /**
     * Add order-by as ascend. <br>
     * ZIP_CD5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ZipCd5_Asc() { regOBA("ZIP_CD5"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_CD5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ZipCd5_Desc() { regOBD("ZIP_CD5"); return this; }

    protected ConditionValue _addressKn1;
    public ConditionValue xdfgetAddressKn1()
    { if (_addressKn1 == null) { _addressKn1 = nCV(); }
      return _addressKn1; }
    protected ConditionValue xgetCValueAddressKn1() { return xdfgetAddressKn1(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS_KN1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_AddressKn1_Asc() { regOBA("ADDRESS_KN1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS_KN1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_AddressKn1_Desc() { regOBD("ADDRESS_KN1"); return this; }

    protected ConditionValue _addressKn2;
    public ConditionValue xdfgetAddressKn2()
    { if (_addressKn2 == null) { _addressKn2 = nCV(); }
      return _addressKn2; }
    protected ConditionValue xgetCValueAddressKn2() { return xdfgetAddressKn2(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS_KN2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_AddressKn2_Asc() { regOBA("ADDRESS_KN2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS_KN2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_AddressKn2_Desc() { regOBD("ADDRESS_KN2"); return this; }

    protected ConditionValue _addressKn3;
    public ConditionValue xdfgetAddressKn3()
    { if (_addressKn3 == null) { _addressKn3 = nCV(); }
      return _addressKn3; }
    protected ConditionValue xgetCValueAddressKn3() { return xdfgetAddressKn3(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS_KN3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_AddressKn3_Asc() { regOBA("ADDRESS_KN3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS_KN3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_AddressKn3_Desc() { regOBD("ADDRESS_KN3"); return this; }

    protected ConditionValue _companyKn;
    public ConditionValue xdfgetCompanyKn()
    { if (_companyKn == null) { _companyKn = nCV(); }
      return _companyKn; }
    protected ConditionValue xgetCValueCompanyKn() { return xdfgetCompanyKn(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANY_KN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_CompanyKn_Asc() { regOBA("COMPANY_KN"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_KN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_CompanyKn_Desc() { regOBD("COMPANY_KN"); return this; }

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
    public BsEZipCQ addOrderBy_Address1_Asc() { regOBA("ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Address1_Desc() { regOBD("ADDRESS1"); return this; }

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
    public BsEZipCQ addOrderBy_Address2_Asc() { regOBA("ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Address2_Desc() { regOBD("ADDRESS2"); return this; }

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
    public BsEZipCQ addOrderBy_Address3_Asc() { regOBA("ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Address3_Desc() { regOBD("ADDRESS3"); return this; }

    protected ConditionValue _address4;
    public ConditionValue xdfgetAddress4()
    { if (_address4 == null) { _address4 = nCV(); }
      return _address4; }
    protected ConditionValue xgetCValueAddress4() { return xdfgetAddress4(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Address4_Asc() { regOBA("ADDRESS4"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Address4_Desc() { regOBD("ADDRESS4"); return this; }

    protected ConditionValue _companyNm;
    public ConditionValue xdfgetCompanyNm()
    { if (_companyNm == null) { _companyNm = nCV(); }
      return _companyNm; }
    protected ConditionValue xgetCValueCompanyNm() { return xdfgetCompanyNm(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANY_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_CompanyNm_Asc() { regOBA("COMPANY_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_CompanyNm_Desc() { regOBD("COMPANY_NM"); return this; }

    protected ConditionValue _flg1;
    public ConditionValue xdfgetFlg1()
    { if (_flg1 == null) { _flg1 = nCV(); }
      return _flg1; }
    protected ConditionValue xgetCValueFlg1() { return xdfgetFlg1(); }

    /**
     * Add order-by as ascend. <br>
     * FLG1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Flg1_Asc() { regOBA("FLG1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLG1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Flg1_Desc() { regOBD("FLG1"); return this; }

    protected ConditionValue _flg2;
    public ConditionValue xdfgetFlg2()
    { if (_flg2 == null) { _flg2 = nCV(); }
      return _flg2; }
    protected ConditionValue xgetCValueFlg2() { return xdfgetFlg2(); }

    /**
     * Add order-by as ascend. <br>
     * FLG2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Flg2_Asc() { regOBA("FLG2"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLG2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Flg2_Desc() { regOBD("FLG2"); return this; }

    protected ConditionValue _flg3;
    public ConditionValue xdfgetFlg3()
    { if (_flg3 == null) { _flg3 = nCV(); }
      return _flg3; }
    protected ConditionValue xgetCValueFlg3() { return xdfgetFlg3(); }

    /**
     * Add order-by as ascend. <br>
     * FLG3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Flg3_Asc() { regOBA("FLG3"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLG3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Flg3_Desc() { regOBD("FLG3"); return this; }

    protected ConditionValue _flg4;
    public ConditionValue xdfgetFlg4()
    { if (_flg4 == null) { _flg4 = nCV(); }
      return _flg4; }
    protected ConditionValue xgetCValueFlg4() { return xdfgetFlg4(); }

    /**
     * Add order-by as ascend. <br>
     * FLG4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Flg4_Asc() { regOBA("FLG4"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLG4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Flg4_Desc() { regOBD("FLG4"); return this; }

    protected ConditionValue _updType;
    public ConditionValue xdfgetUpdType()
    { if (_updType == null) { _updType = nCV(); }
      return _updType; }
    protected ConditionValue xgetCValueUpdType() { return xdfgetUpdType(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_UpdType_Asc() { regOBA("UPD_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_UpdType_Desc() { regOBD("UPD_TYPE"); return this; }

    protected ConditionValue _reasonType;
    public ConditionValue xdfgetReasonType()
    { if (_reasonType == null) { _reasonType = nCV(); }
      return _reasonType; }
    protected ConditionValue xgetCValueReasonType() { return xdfgetReasonType(); }

    /**
     * Add order-by as ascend. <br>
     * REASON_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ReasonType_Asc() { regOBA("REASON_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * REASON_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ReasonType_Desc() { regOBD("REASON_TYPE"); return this; }

    protected ConditionValue _handlingAddress;
    public ConditionValue xdfgetHandlingAddress()
    { if (_handlingAddress == null) { _handlingAddress = nCV(); }
      return _handlingAddress; }
    protected ConditionValue xgetCValueHandlingAddress() { return xdfgetHandlingAddress(); }

    /**
     * Add order-by as ascend. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_HandlingAddress_Asc() { regOBA("HANDLING_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_HandlingAddress_Desc() { regOBD("HANDLING_ADDRESS"); return this; }

    protected ConditionValue _flg5;
    public ConditionValue xdfgetFlg5()
    { if (_flg5 == null) { _flg5 = nCV(); }
      return _flg5; }
    protected ConditionValue xgetCValueFlg5() { return xdfgetFlg5(); }

    /**
     * Add order-by as ascend. <br>
     * FLG5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Flg5_Asc() { regOBA("FLG5"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLG5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Flg5_Desc() { regOBD("FLG5"); return this; }

    protected ConditionValue _flg6;
    public ConditionValue xdfgetFlg6()
    { if (_flg6 == null) { _flg6 = nCV(); }
      return _flg6; }
    protected ConditionValue xgetCValueFlg6() { return xdfgetFlg6(); }

    /**
     * Add order-by as ascend. <br>
     * FLG6: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Flg6_Asc() { regOBA("FLG6"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLG6: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_Flg6_Desc() { regOBD("FLG6"); return this; }

    protected ConditionValue _updCd;
    public ConditionValue xdfgetUpdCd()
    { if (_updCd == null) { _updCd = nCV(); }
      return _updCd; }
    protected ConditionValue xgetCValueUpdCd() { return xdfgetUpdCd(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_UpdCd_Asc() { regOBA("UPD_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_UpdCd_Desc() { regOBD("UPD_CD"); return this; }

    protected ConditionValue _companyFlg;
    public ConditionValue xdfgetCompanyFlg()
    { if (_companyFlg == null) { _companyFlg = nCV(); }
      return _companyFlg; }
    protected ConditionValue xgetCValueCompanyFlg() { return xdfgetCompanyFlg(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_CompanyFlg_Asc() { regOBA("COMPANY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_CompanyFlg_Desc() { regOBD("COMPANY_FLG"); return this; }

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
    public BsEZipCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEZipCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEZipCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEZipCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEZipCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEZipCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEZipCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEZipCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEZipCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEZipCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEZipCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEZipCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EZipCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EZipCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EZipCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EZipCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EZipCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EZipCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EZipCQ> _myselfExistsMap;
    public Map<String, EZipCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EZipCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EZipCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EZipCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EZipCB.class.getName(); }
    protected String xCQ() { return EZipCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
