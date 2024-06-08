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
 * The base condition-query of T_CDTLVMKADM.
 * @author DBFlute(AutoGenerator)
 */
public class BsTCdtlvmkadmCQ extends AbstractBsTCdtlvmkadmCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TCdtlvmkadmCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTCdtlvmkadmCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_CDTLVMKADM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TCdtlvmkadmCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TCdtlvmkadmCIQ xcreateCIQ() {
        TCdtlvmkadmCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TCdtlvmkadmCIQ xnewCIQ() {
        return new TCdtlvmkadmCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_CDTLVMKADM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TCdtlvmkadmCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TCdtlvmkadmCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _specificationLabelMakeManageId;
    public ConditionValue xdfgetSpecificationLabelMakeManageId()
    { if (_specificationLabelMakeManageId == null) { _specificationLabelMakeManageId = nCV(); }
      return _specificationLabelMakeManageId; }
    protected ConditionValue xgetCValueSpecificationLabelMakeManageId() { return xdfgetSpecificationLabelMakeManageId(); }

    /**
     * Add order-by as ascend. <br>
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_SpecificationLabelMakeManageId_Asc() { regOBA("SPECIFICATION_LABEL_MAKE_MANAGE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_SpecificationLabelMakeManageId_Desc() { regOBD("SPECIFICATION_LABEL_MAKE_MANAGE_ID"); return this; }

    protected ConditionValue _zzorgncd;
    public ConditionValue xdfgetZzorgncd()
    { if (_zzorgncd == null) { _zzorgncd = nCV(); }
      return _zzorgncd; }
    protected ConditionValue xgetCValueZzorgncd() { return xdfgetZzorgncd(); }

    /**
     * Add order-by as ascend. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Zzorgncd_Asc() { regOBA("ZZORGNCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Zzorgncd_Desc() { regOBD("ZZORGNCD"); return this; }

    protected ConditionValue _srymd;
    public ConditionValue xdfgetSrymd()
    { if (_srymd == null) { _srymd = nCV(); }
      return _srymd; }
    protected ConditionValue xgetCValueSrymd() { return xdfgetSrymd(); }

    /**
     * Add order-by as ascend. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Srymd_Asc() { regOBA("SRYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Srymd_Desc() { regOBD("SRYMD"); return this; }

    protected ConditionValue _sroprtcnt;
    public ConditionValue xdfgetSroprtcnt()
    { if (_sroprtcnt == null) { _sroprtcnt = nCV(); }
      return _sroprtcnt; }
    protected ConditionValue xgetCValueSroprtcnt() { return xdfgetSroprtcnt(); }

    /**
     * Add order-by as ascend. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Sroprtcnt_Asc() { regOBA("SROPRTCNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Sroprtcnt_Desc() { regOBD("SROPRTCNT"); return this; }

    protected ConditionValue _dlvymd;
    public ConditionValue xdfgetDlvymd()
    { if (_dlvymd == null) { _dlvymd = nCV(); }
      return _dlvymd; }
    protected ConditionValue xgetCValueDlvymd() { return xdfgetDlvymd(); }

    /**
     * Add order-by as ascend. <br>
     * DLVYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Dlvymd_Asc() { regOBA("DLVYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DLVYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Dlvymd_Desc() { regOBD("DLVYMD"); return this; }

    protected ConditionValue _dpcd;
    public ConditionValue xdfgetDpcd()
    { if (_dpcd == null) { _dpcd = nCV(); }
      return _dpcd; }
    protected ConditionValue xgetCValueDpcd() { return xdfgetDpcd(); }

    /**
     * Add order-by as ascend. <br>
     * DPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Dpcd_Asc() { regOBA("DPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DPCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Dpcd_Desc() { regOBD("DPCD"); return this; }

    protected ConditionValue _ded;
    public ConditionValue xdfgetDed()
    { if (_ded == null) { _ded = nCV(); }
      return _ded; }
    protected ConditionValue xgetCValueDed() { return xdfgetDed(); }

    /**
     * Add order-by as ascend. <br>
     * DED: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Ded_Asc() { regOBA("DED"); return this; }

    /**
     * Add order-by as descend. <br>
     * DED: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Ded_Desc() { regOBD("DED"); return this; }

    protected ConditionValue _pstnid;
    public ConditionValue xdfgetPstnid()
    { if (_pstnid == null) { _pstnid = nCV(); }
      return _pstnid; }
    protected ConditionValue xgetCValuePstnid() { return xdfgetPstnid(); }

    /**
     * Add order-by as ascend. <br>
     * PSTNID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Pstnid_Asc() { regOBA("PSTNID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PSTNID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Pstnid_Desc() { regOBD("PSTNID"); return this; }

    protected ConditionValue _linblk;
    public ConditionValue xdfgetLinblk()
    { if (_linblk == null) { _linblk = nCV(); }
      return _linblk; }
    protected ConditionValue xgetCValueLinblk() { return xdfgetLinblk(); }

    /**
     * Add order-by as ascend. <br>
     * LINBLK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Linblk_Asc() { regOBA("LINBLK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINBLK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Linblk_Desc() { regOBD("LINBLK"); return this; }

    protected ConditionValue _srrnk;
    public ConditionValue xdfgetSrrnk()
    { if (_srrnk == null) { _srrnk = nCV(); }
      return _srrnk; }
    protected ConditionValue xgetCValueSrrnk() { return xdfgetSrrnk(); }

    /**
     * Add order-by as ascend. <br>
     * SRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Srrnk_Asc() { regOBA("SRRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Srrnk_Desc() { regOBD("SRRNK"); return this; }

    protected ConditionValue _mkdtm;
    public ConditionValue xdfgetMkdtm()
    { if (_mkdtm == null) { _mkdtm = nCV(); }
      return _mkdtm; }
    protected ConditionValue xgetCValueMkdtm() { return xdfgetMkdtm(); }

    /**
     * Add order-by as ascend. <br>
     * MKDTM: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Mkdtm_Asc() { regOBA("MKDTM"); return this; }

    /**
     * Add order-by as descend. <br>
     * MKDTM: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Mkdtm_Desc() { regOBD("MKDTM"); return this; }

    protected ConditionValue _lstdsymd;
    public ConditionValue xdfgetLstdsymd()
    { if (_lstdsymd == null) { _lstdsymd = nCV(); }
      return _lstdsymd; }
    protected ConditionValue xgetCValueLstdsymd() { return xdfgetLstdsymd(); }

    /**
     * Add order-by as ascend. <br>
     * LSTDSYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Lstdsymd_Asc() { regOBA("LSTDSYMD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LSTDSYMD: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Lstdsymd_Desc() { regOBD("LSTDSYMD"); return this; }

    protected ConditionValue _srlincd;
    public ConditionValue xdfgetSrlincd()
    { if (_srlincd == null) { _srlincd = nCV(); }
      return _srlincd; }
    protected ConditionValue xgetCValueSrlincd() { return xdfgetSrlincd(); }

    /**
     * Add order-by as ascend. <br>
     * SRLINCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Srlincd_Asc() { regOBA("SRLINCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRLINCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Srlincd_Desc() { regOBD("SRLINCD"); return this; }

    protected ConditionValue _srsrrnk;
    public ConditionValue xdfgetSrsrrnk()
    { if (_srsrrnk == null) { _srsrrnk = nCV(); }
      return _srsrrnk; }
    protected ConditionValue xgetCValueSrsrrnk() { return xdfgetSrsrrnk(); }

    /**
     * Add order-by as ascend. <br>
     * SRSRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Srsrrnk_Asc() { regOBA("SRSRRNK"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRSRRNK: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_Srsrrnk_Desc() { regOBD("SRSRRNK"); return this; }

    protected ConditionValue _specificationPrintedflg;
    public ConditionValue xdfgetSpecificationPrintedflg()
    { if (_specificationPrintedflg == null) { _specificationPrintedflg = nCV(); }
      return _specificationPrintedflg; }
    protected ConditionValue xgetCValueSpecificationPrintedflg() { return xdfgetSpecificationPrintedflg(); }

    /**
     * Add order-by as ascend. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_SpecificationPrintedflg_Asc() { regOBA("SPECIFICATION_PRINTEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_SpecificationPrintedflg_Desc() { regOBD("SPECIFICATION_PRINTEDFLG"); return this; }

    protected ConditionValue _labelPrintedflg;
    public ConditionValue xdfgetLabelPrintedflg()
    { if (_labelPrintedflg == null) { _labelPrintedflg = nCV(); }
      return _labelPrintedflg; }
    protected ConditionValue xgetCValueLabelPrintedflg() { return xdfgetLabelPrintedflg(); }

    /**
     * Add order-by as ascend. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_LabelPrintedflg_Asc() { regOBA("LABEL_PRINTEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_LabelPrintedflg_Desc() { regOBD("LABEL_PRINTEDFLG"); return this; }

    protected ConditionValue _reportId;
    public ConditionValue xdfgetReportId()
    { if (_reportId == null) { _reportId = nCV(); }
      return _reportId; }
    protected ConditionValue xgetCValueReportId() { return xdfgetReportId(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_ReportId_Asc() { regOBA("REPORT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_ReportId_Desc() { regOBD("REPORT_ID"); return this; }

    protected ConditionValue _reportNm;
    public ConditionValue xdfgetReportNm()
    { if (_reportNm == null) { _reportNm = nCV(); }
      return _reportNm; }
    protected ConditionValue xgetCValueReportNm() { return xdfgetReportNm(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_NM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_ReportNm_Asc() { regOBA("REPORT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_NM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_ReportNm_Desc() { regOBD("REPORT_NM"); return this; }

    protected ConditionValue _stockNum;
    public ConditionValue xdfgetStockNum()
    { if (_stockNum == null) { _stockNum = nCV(); }
      return _stockNum; }
    protected ConditionValue xgetCValueStockNum() { return xdfgetStockNum(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_StockNum_Asc() { regOBA("STOCK_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_StockNum_Desc() { regOBD("STOCK_NUM"); return this; }

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
    public BsTCdtlvmkadmCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTCdtlvmkadmCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTCdtlvmkadmCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTCdtlvmkadmCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTCdtlvmkadmCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTCdtlvmkadmCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTCdtlvmkadmCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTCdtlvmkadmCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTCdtlvmkadmCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTCdtlvmkadmCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTCdtlvmkadmCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTCdtlvmkadmCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTCdtlvmkadmCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TCdtlvmkadmCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TCdtlvmkadmCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TCdtlvmkadmCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TCdtlvmkadmCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TCdtlvmkadmCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TCdtlvmkadmCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TCdtlvmkadmCQ> _myselfExistsMap;
    public Map<String, TCdtlvmkadmCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TCdtlvmkadmCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TCdtlvmkadmCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TCdtlvmkadmCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TCdtlvmkadmCB.class.getName(); }
    protected String xCQ() { return TCdtlvmkadmCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
