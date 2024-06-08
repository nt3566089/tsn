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
 * The base condition-query of M_COMMON_CARRIER.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCommonCarrierCQ extends AbstractBsMCommonCarrierCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCommonCarrierCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCommonCarrierCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_COMMON_CARRIER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCommonCarrierCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCommonCarrierCIQ xcreateCIQ() {
        MCommonCarrierCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCommonCarrierCIQ xnewCIQ() {
        return new MCommonCarrierCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_COMMON_CARRIER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCommonCarrierCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCommonCarrierCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _commonCarrierId;
    public ConditionValue xdfgetCommonCarrierId()
    { if (_commonCarrierId == null) { _commonCarrierId = nCV(); }
      return _commonCarrierId; }
    protected ConditionValue xgetCValueCommonCarrierId() { return xdfgetCommonCarrierId(); }

    public Map<String, MCarrierCQ> xdfgetCommonCarrierId_ExistsReferrer_MCarrierList() { return xgetSQueMap("commonCarrierId_ExistsReferrer_MCarrierList"); }
    public String keepCommonCarrierId_ExistsReferrer_MCarrierList(MCarrierCQ sq) { return xkeepSQue("commonCarrierId_ExistsReferrer_MCarrierList", sq); }

    public Map<String, MCarrierZipCQ> xdfgetCommonCarrierId_ExistsReferrer_MCarrierZipList() { return xgetSQueMap("commonCarrierId_ExistsReferrer_MCarrierZipList"); }
    public String keepCommonCarrierId_ExistsReferrer_MCarrierZipList(MCarrierZipCQ sq) { return xkeepSQue("commonCarrierId_ExistsReferrer_MCarrierZipList", sq); }

    public Map<String, MCarrierCQ> xdfgetCommonCarrierId_NotExistsReferrer_MCarrierList() { return xgetSQueMap("commonCarrierId_NotExistsReferrer_MCarrierList"); }
    public String keepCommonCarrierId_NotExistsReferrer_MCarrierList(MCarrierCQ sq) { return xkeepSQue("commonCarrierId_NotExistsReferrer_MCarrierList", sq); }

    public Map<String, MCarrierZipCQ> xdfgetCommonCarrierId_NotExistsReferrer_MCarrierZipList() { return xgetSQueMap("commonCarrierId_NotExistsReferrer_MCarrierZipList"); }
    public String keepCommonCarrierId_NotExistsReferrer_MCarrierZipList(MCarrierZipCQ sq) { return xkeepSQue("commonCarrierId_NotExistsReferrer_MCarrierZipList", sq); }

    public Map<String, MCarrierCQ> xdfgetCommonCarrierId_SpecifyDerivedReferrer_MCarrierList() { return xgetSQueMap("commonCarrierId_SpecifyDerivedReferrer_MCarrierList"); }
    public String keepCommonCarrierId_SpecifyDerivedReferrer_MCarrierList(MCarrierCQ sq) { return xkeepSQue("commonCarrierId_SpecifyDerivedReferrer_MCarrierList", sq); }

    public Map<String, MCarrierZipCQ> xdfgetCommonCarrierId_SpecifyDerivedReferrer_MCarrierZipList() { return xgetSQueMap("commonCarrierId_SpecifyDerivedReferrer_MCarrierZipList"); }
    public String keepCommonCarrierId_SpecifyDerivedReferrer_MCarrierZipList(MCarrierZipCQ sq) { return xkeepSQue("commonCarrierId_SpecifyDerivedReferrer_MCarrierZipList", sq); }

    public Map<String, MCarrierCQ> xdfgetCommonCarrierId_QueryDerivedReferrer_MCarrierList() { return xgetSQueMap("commonCarrierId_QueryDerivedReferrer_MCarrierList"); }
    public String keepCommonCarrierId_QueryDerivedReferrer_MCarrierList(MCarrierCQ sq) { return xkeepSQue("commonCarrierId_QueryDerivedReferrer_MCarrierList", sq); }
    public Map<String, Object> xdfgetCommonCarrierId_QueryDerivedReferrer_MCarrierListParameter() { return xgetSQuePmMap("commonCarrierId_QueryDerivedReferrer_MCarrierList"); }
    public String keepCommonCarrierId_QueryDerivedReferrer_MCarrierListParameter(Object pm) { return xkeepSQuePm("commonCarrierId_QueryDerivedReferrer_MCarrierList", pm); }

    public Map<String, MCarrierZipCQ> xdfgetCommonCarrierId_QueryDerivedReferrer_MCarrierZipList() { return xgetSQueMap("commonCarrierId_QueryDerivedReferrer_MCarrierZipList"); }
    public String keepCommonCarrierId_QueryDerivedReferrer_MCarrierZipList(MCarrierZipCQ sq) { return xkeepSQue("commonCarrierId_QueryDerivedReferrer_MCarrierZipList", sq); }
    public Map<String, Object> xdfgetCommonCarrierId_QueryDerivedReferrer_MCarrierZipListParameter() { return xgetSQuePmMap("commonCarrierId_QueryDerivedReferrer_MCarrierZipList"); }
    public String keepCommonCarrierId_QueryDerivedReferrer_MCarrierZipListParameter(Object pm) { return xkeepSQuePm("commonCarrierId_QueryDerivedReferrer_MCarrierZipList", pm); }

    /**
     * Add order-by as ascend. <br>
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_CommonCarrierId_Asc() { regOBA("COMMON_CARRIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_CommonCarrierId_Desc() { regOBD("COMMON_CARRIER_ID"); return this; }

    protected ConditionValue _carrierCd;
    public ConditionValue xdfgetCarrierCd()
    { if (_carrierCd == null) { _carrierCd = nCV(); }
      return _carrierCd; }
    protected ConditionValue xgetCValueCarrierCd() { return xdfgetCarrierCd(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_CD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_CarrierCd_Asc() { regOBA("CARRIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_CarrierCd_Desc() { regOBD("CARRIER_CD"); return this; }

    protected ConditionValue _carrierNm;
    public ConditionValue xdfgetCarrierNm()
    { if (_carrierNm == null) { _carrierNm = nCV(); }
      return _carrierNm; }
    protected ConditionValue xgetCValueCarrierNm() { return xdfgetCarrierNm(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_CarrierNm_Asc() { regOBA("CARRIER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_CarrierNm_Desc() { regOBD("CARRIER_NM"); return this; }

    protected ConditionValue _carrierAbbr;
    public ConditionValue xdfgetCarrierAbbr()
    { if (_carrierAbbr == null) { _carrierAbbr = nCV(); }
      return _carrierAbbr; }
    protected ConditionValue xgetCValueCarrierAbbr() { return xdfgetCarrierAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_CarrierAbbr_Asc() { regOBA("CARRIER_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_CarrierAbbr_Desc() { regOBD("CARRIER_ABBR"); return this; }

    protected ConditionValue _arrivalStoreBarcode;
    public ConditionValue xdfgetArrivalStoreBarcode()
    { if (_arrivalStoreBarcode == null) { _arrivalStoreBarcode = nCV(); }
      return _arrivalStoreBarcode; }
    protected ConditionValue xgetCValueArrivalStoreBarcode() { return xdfgetArrivalStoreBarcode(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_ArrivalStoreBarcode_Asc() { regOBA("ARRIVAL_STORE_BARCODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_ArrivalStoreBarcode_Desc() { regOBD("ARRIVAL_STORE_BARCODE"); return this; }

    protected ConditionValue _arrivalStoreStartBit;
    public ConditionValue xdfgetArrivalStoreStartBit()
    { if (_arrivalStoreStartBit == null) { _arrivalStoreStartBit = nCV(); }
      return _arrivalStoreStartBit; }
    protected ConditionValue xgetCValueArrivalStoreStartBit() { return xdfgetArrivalStoreStartBit(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_ArrivalStoreStartBit_Asc() { regOBA("ARRIVAL_STORE_START_BIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_ArrivalStoreStartBit_Desc() { regOBD("ARRIVAL_STORE_START_BIT"); return this; }

    protected ConditionValue _arrivalStoreEndBit;
    public ConditionValue xdfgetArrivalStoreEndBit()
    { if (_arrivalStoreEndBit == null) { _arrivalStoreEndBit = nCV(); }
      return _arrivalStoreEndBit; }
    protected ConditionValue xgetCValueArrivalStoreEndBit() { return xdfgetArrivalStoreEndBit(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_ArrivalStoreEndBit_Asc() { regOBA("ARRIVAL_STORE_END_BIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_ArrivalStoreEndBit_Desc() { regOBD("ARRIVAL_STORE_END_BIT"); return this; }

    protected ConditionValue _arrivalStoreFormat;
    public ConditionValue xdfgetArrivalStoreFormat()
    { if (_arrivalStoreFormat == null) { _arrivalStoreFormat = nCV(); }
      return _arrivalStoreFormat; }
    protected ConditionValue xgetCValueArrivalStoreFormat() { return xdfgetArrivalStoreFormat(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_ArrivalStoreFormat_Asc() { regOBA("ARRIVAL_STORE_FORMAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_ArrivalStoreFormat_Desc() { regOBD("ARRIVAL_STORE_FORMAT"); return this; }

    protected ConditionValue _trackingBarcode;
    public ConditionValue xdfgetTrackingBarcode()
    { if (_trackingBarcode == null) { _trackingBarcode = nCV(); }
      return _trackingBarcode; }
    protected ConditionValue xgetCValueTrackingBarcode() { return xdfgetTrackingBarcode(); }

    /**
     * Add order-by as ascend. <br>
     * TRACKING_BARCODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_TrackingBarcode_Asc() { regOBA("TRACKING_BARCODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACKING_BARCODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_TrackingBarcode_Desc() { regOBD("TRACKING_BARCODE"); return this; }

    protected ConditionValue _trackingStartBit;
    public ConditionValue xdfgetTrackingStartBit()
    { if (_trackingStartBit == null) { _trackingStartBit = nCV(); }
      return _trackingStartBit; }
    protected ConditionValue xgetCValueTrackingStartBit() { return xdfgetTrackingStartBit(); }

    /**
     * Add order-by as ascend. <br>
     * TRACKING_START_BIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_TrackingStartBit_Asc() { regOBA("TRACKING_START_BIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACKING_START_BIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_TrackingStartBit_Desc() { regOBD("TRACKING_START_BIT"); return this; }

    protected ConditionValue _trackingEndBit;
    public ConditionValue xdfgetTrackingEndBit()
    { if (_trackingEndBit == null) { _trackingEndBit = nCV(); }
      return _trackingEndBit; }
    protected ConditionValue xgetCValueTrackingEndBit() { return xdfgetTrackingEndBit(); }

    /**
     * Add order-by as ascend. <br>
     * TRACKING_END_BIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_TrackingEndBit_Asc() { regOBA("TRACKING_END_BIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACKING_END_BIT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_TrackingEndBit_Desc() { regOBD("TRACKING_END_BIT"); return this; }

    protected ConditionValue _bolOutputTargetFlg;
    public ConditionValue xdfgetBolOutputTargetFlg()
    { if (_bolOutputTargetFlg == null) { _bolOutputTargetFlg = nCV(); }
      return _bolOutputTargetFlg; }
    protected ConditionValue xgetCValueBolOutputTargetFlg() { return xdfgetBolOutputTargetFlg(); }

    /**
     * Add order-by as ascend. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_BolOutputTargetFlg_Asc() { regOBA("BOL_OUTPUT_TARGET_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_BolOutputTargetFlg_Desc() { regOBD("BOL_OUTPUT_TARGET_FLG"); return this; }

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
    public BsMCommonCarrierCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCommonCarrierCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCommonCarrierCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCommonCarrierCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCommonCarrierCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCommonCarrierCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCommonCarrierCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCommonCarrierCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCommonCarrierCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMCommonCarrierCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCommonCarrierCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCommonCarrierCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCommonCarrierCQ bq = (MCommonCarrierCQ)bqs;
        MCommonCarrierCQ uq = (MCommonCarrierCQ)uqs;
        if (bq.hasConditionQueryBClassDtlByArrivalStoreFormat()) {
            uq.queryBClassDtlByArrivalStoreFormat().reflectRelationOnUnionQuery(bq.queryBClassDtlByArrivalStoreFormat(), uq.queryBClassDtlByArrivalStoreFormat());
        }
        if (bq.hasConditionQueryBClassDtlByBolOutputTargetFlg()) {
            uq.queryBClassDtlByBolOutputTargetFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByBolOutputTargetFlg(), uq.queryBClassDtlByBolOutputTargetFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my ARRIVAL_STORE_FORMAT, named 'BClassDtlByArrivalStoreFormat'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByArrivalStoreFormat() {
        return xdfgetConditionQueryBClassDtlByArrivalStoreFormat();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByArrivalStoreFormat() {
        String prop = "bClassDtlByArrivalStoreFormat";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByArrivalStoreFormat()); xsetupOuterJoinBClassDtlByArrivalStoreFormat(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByArrivalStoreFormat() {
        String nrp = xresolveNRP("M_COMMON_CARRIER", "bClassDtlByArrivalStoreFormat"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByArrivalStoreFormat", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByArrivalStoreFormat() { xregOutJo("bClassDtlByArrivalStoreFormat"); }
    public boolean hasConditionQueryBClassDtlByArrivalStoreFormat() { return xhasQueRlMap("bClassDtlByArrivalStoreFormat"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my BOL_OUTPUT_TARGET_FLG, named 'BClassDtlByBolOutputTargetFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByBolOutputTargetFlg() {
        return xdfgetConditionQueryBClassDtlByBolOutputTargetFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByBolOutputTargetFlg() {
        String prop = "bClassDtlByBolOutputTargetFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByBolOutputTargetFlg()); xsetupOuterJoinBClassDtlByBolOutputTargetFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByBolOutputTargetFlg() {
        String nrp = xresolveNRP("M_COMMON_CARRIER", "bClassDtlByBolOutputTargetFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByBolOutputTargetFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByBolOutputTargetFlg() { xregOutJo("bClassDtlByBolOutputTargetFlg"); }
    public boolean hasConditionQueryBClassDtlByBolOutputTargetFlg() { return xhasQueRlMap("bClassDtlByBolOutputTargetFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCommonCarrierCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCommonCarrierCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCommonCarrierCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCommonCarrierCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCommonCarrierCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCommonCarrierCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCommonCarrierCQ> _myselfExistsMap;
    public Map<String, MCommonCarrierCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCommonCarrierCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCommonCarrierCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCommonCarrierCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCommonCarrierCB.class.getName(); }
    protected String xCQ() { return MCommonCarrierCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
