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
 * The base condition-query of W_ZIP_COMPANY_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsWZipCompanyInputCQ extends AbstractBsWZipCompanyInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WZipCompanyInputCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWZipCompanyInputCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_ZIP_COMPANY_INPUT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WZipCompanyInputCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WZipCompanyInputCIQ xcreateCIQ() {
        WZipCompanyInputCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WZipCompanyInputCIQ xnewCIQ() {
        return new WZipCompanyInputCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_ZIP_COMPANY_INPUT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WZipCompanyInputCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WZipCompanyInputCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _zipCompanyInputId;
    public ConditionValue xdfgetZipCompanyInputId()
    { if (_zipCompanyInputId == null) { _zipCompanyInputId = nCV(); }
      return _zipCompanyInputId; }
    protected ConditionValue xgetCValueZipCompanyInputId() { return xdfgetZipCompanyInputId(); }

    /**
     * Add order-by as ascend. <br>
     * ZIP_COMPANY_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_ZipCompanyInputId_Asc() { regOBA("ZIP_COMPANY_INPUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_COMPANY_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_ZipCompanyInputId_Desc() { regOBD("ZIP_COMPANY_INPUT_ID"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_PublicCd_Asc() { regOBA("PUBLIC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PUBLIC_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_PublicCd_Desc() { regOBD("PUBLIC_CD"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_CompanyKn_Asc() { regOBA("COMPANY_KN"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_KN: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_CompanyKn_Desc() { regOBD("COMPANY_KN"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_CompanyNm_Asc() { regOBA("COMPANY_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_CompanyNm_Desc() { regOBD("COMPANY_NM"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_Address1_Asc() { regOBA("ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_Address1_Desc() { regOBD("ADDRESS1"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_Address2_Asc() { regOBA("ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_Address2_Desc() { regOBD("ADDRESS2"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_Address3_Asc() { regOBA("ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_Address3_Desc() { regOBD("ADDRESS3"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_Address4_Asc() { regOBA("ADDRESS4"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_Address4_Desc() { regOBD("ADDRESS4"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_ZipCd_Asc() { regOBA("ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_ZipCd_Desc() { regOBD("ZIP_CD"); return this; }

    protected ConditionValue _zipCd5;
    public ConditionValue xdfgetZipCd5()
    { if (_zipCd5 == null) { _zipCd5 = nCV(); }
      return _zipCd5; }
    protected ConditionValue xgetCValueZipCd5() { return xdfgetZipCd5(); }

    /**
     * Add order-by as ascend. <br>
     * ZIP_CD_5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_ZipCd5_Asc() { regOBA("ZIP_CD_5"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_CD_5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_ZipCd5_Desc() { regOBD("ZIP_CD_5"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_HandlingAddress_Asc() { regOBA("HANDLING_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * HANDLING_ADDRESS: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_HandlingAddress_Desc() { regOBD("HANDLING_ADDRESS"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_Flg5_Asc() { regOBA("FLG5"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLG5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_Flg5_Desc() { regOBD("FLG5"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_Flg6_Asc() { regOBA("FLG6"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLG6: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_Flg6_Desc() { regOBD("FLG6"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_UpdCd_Asc() { regOBA("UPD_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_UpdCd_Desc() { regOBD("UPD_CD"); return this; }

    protected ConditionValue _companyFlg;
    public ConditionValue xdfgetCompanyFlg()
    { if (_companyFlg == null) { _companyFlg = nCV(); }
      return _companyFlg; }
    protected ConditionValue xgetCValueCompanyFlg() { return xdfgetCompanyFlg(); }

    /**
     * Add order-by as ascend. <br>
     * COMPANY_FLG: {varchar(255), default=[1]}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_CompanyFlg_Asc() { regOBA("COMPANY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPANY_FLG: {varchar(255), default=[1]}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_CompanyFlg_Desc() { regOBD("COMPANY_FLG"); return this; }

    protected ConditionValue _lineNo;
    public ConditionValue xdfgetLineNo()
    { if (_lineNo == null) { _lineNo = nCV(); }
      return _lineNo; }
    protected ConditionValue xgetCValueLineNo() { return xdfgetLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMsg;
    public ConditionValue xdfgetErrorMsg()
    { if (_errorMsg == null) { _errorMsg = nCV(); }
      return _errorMsg; }
    protected ConditionValue xgetCValueErrorMsg() { return xdfgetErrorMsg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_ErrorMsg_Asc() { regOBA("ERROR_MSG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_ErrorMsg_Desc() { regOBD("ERROR_MSG"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWZipCompanyInputCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWZipCompanyInputCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWZipCompanyInputCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWZipCompanyInputCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WZipCompanyInputCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WZipCompanyInputCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WZipCompanyInputCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WZipCompanyInputCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WZipCompanyInputCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WZipCompanyInputCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WZipCompanyInputCQ> _myselfExistsMap;
    public Map<String, WZipCompanyInputCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WZipCompanyInputCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WZipCompanyInputCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WZipCompanyInputCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WZipCompanyInputCB.class.getName(); }
    protected String xCQ() { return WZipCompanyInputCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
