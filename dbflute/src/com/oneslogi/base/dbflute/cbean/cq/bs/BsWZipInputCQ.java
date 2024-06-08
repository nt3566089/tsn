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
 * The base condition-query of W_ZIP_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsWZipInputCQ extends AbstractBsWZipInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WZipInputCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWZipInputCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_ZIP_INPUT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WZipInputCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WZipInputCIQ xcreateCIQ() {
        WZipInputCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WZipInputCIQ xnewCIQ() {
        return new WZipInputCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_ZIP_INPUT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WZipInputCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WZipInputCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _zipInputId;
    public ConditionValue xdfgetZipInputId()
    { if (_zipInputId == null) { _zipInputId = nCV(); }
      return _zipInputId; }
    protected ConditionValue xgetCValueZipInputId() { return xdfgetZipInputId(); }

    /**
     * Add order-by as ascend. <br>
     * ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_ZipInputId_Asc() { regOBA("ZIP_INPUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_ZipInputId_Desc() { regOBD("ZIP_INPUT_ID"); return this; }

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
    public BsWZipInputCQ addOrderBy_PublicCd_Asc() { regOBA("PUBLIC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PUBLIC_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_PublicCd_Desc() { regOBD("PUBLIC_CD"); return this; }

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
    public BsWZipInputCQ addOrderBy_ZipCd5_Asc() { regOBA("ZIP_CD_5"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_CD_5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_ZipCd5_Desc() { regOBD("ZIP_CD_5"); return this; }

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
    public BsWZipInputCQ addOrderBy_ZipCd_Asc() { regOBA("ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_ZipCd_Desc() { regOBD("ZIP_CD"); return this; }

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
    public BsWZipInputCQ addOrderBy_AddressKn1_Asc() { regOBA("ADDRESS_KN1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS_KN1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_AddressKn1_Desc() { regOBD("ADDRESS_KN1"); return this; }

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
    public BsWZipInputCQ addOrderBy_AddressKn2_Asc() { regOBA("ADDRESS_KN2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS_KN2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_AddressKn2_Desc() { regOBD("ADDRESS_KN2"); return this; }

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
    public BsWZipInputCQ addOrderBy_AddressKn3_Asc() { regOBA("ADDRESS_KN3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS_KN3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_AddressKn3_Desc() { regOBD("ADDRESS_KN3"); return this; }

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
    public BsWZipInputCQ addOrderBy_Address1_Asc() { regOBA("ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_Address1_Desc() { regOBD("ADDRESS1"); return this; }

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
    public BsWZipInputCQ addOrderBy_Address2_Asc() { regOBA("ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_Address2_Desc() { regOBD("ADDRESS2"); return this; }

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
    public BsWZipInputCQ addOrderBy_Address3_Asc() { regOBA("ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_Address3_Desc() { regOBD("ADDRESS3"); return this; }

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
    public BsWZipInputCQ addOrderBy_Flg1_Asc() { regOBA("FLG1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLG1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_Flg1_Desc() { regOBD("FLG1"); return this; }

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
    public BsWZipInputCQ addOrderBy_Flg2_Asc() { regOBA("FLG2"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLG2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_Flg2_Desc() { regOBD("FLG2"); return this; }

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
    public BsWZipInputCQ addOrderBy_Flg3_Asc() { regOBA("FLG3"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLG3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_Flg3_Desc() { regOBD("FLG3"); return this; }

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
    public BsWZipInputCQ addOrderBy_Flg4_Asc() { regOBA("FLG4"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLG4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_Flg4_Desc() { regOBD("FLG4"); return this; }

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
    public BsWZipInputCQ addOrderBy_UpdType_Asc() { regOBA("UPD_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_UpdType_Desc() { regOBD("UPD_TYPE"); return this; }

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
    public BsWZipInputCQ addOrderBy_ReasonType_Asc() { regOBA("REASON_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * REASON_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_ReasonType_Desc() { regOBD("REASON_TYPE"); return this; }

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
    public BsWZipInputCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

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
    public BsWZipInputCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

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
    public BsWZipInputCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsWZipInputCQ addOrderBy_ErrorMsg_Asc() { regOBA("ERROR_MSG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_ErrorMsg_Desc() { regOBD("ERROR_MSG"); return this; }

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
    public BsWZipInputCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWZipInputCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWZipInputCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWZipInputCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWZipInputCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWZipInputCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWZipInputCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWZipInputCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWZipInputCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWZipInputCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWZipInputCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWZipInputCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WZipInputCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WZipInputCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WZipInputCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WZipInputCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WZipInputCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WZipInputCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WZipInputCQ> _myselfExistsMap;
    public Map<String, WZipInputCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WZipInputCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WZipInputCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WZipInputCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WZipInputCB.class.getName(); }
    protected String xCQ() { return WZipInputCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
