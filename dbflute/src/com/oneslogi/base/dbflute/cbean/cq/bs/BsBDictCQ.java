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
 * The base condition-query of B_DICT.
 * @author DBFlute(AutoGenerator)
 */
public class BsBDictCQ extends AbstractBsBDictCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BDictCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBDictCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_DICT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BDictCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BDictCIQ xcreateCIQ() {
        BDictCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BDictCIQ xnewCIQ() {
        return new BDictCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_DICT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BDictCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BDictCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _dictId;
    public ConditionValue xdfgetDictId()
    { if (_dictId == null) { _dictId = nCV(); }
      return _dictId; }
    protected ConditionValue xgetCValueDictId() { return xdfgetDictId(); }

    public Map<String, BArgCQ> xdfgetDictId_ExistsReferrer_BArgList() { return xgetSQueMap("dictId_ExistsReferrer_BArgList"); }
    public String keepDictId_ExistsReferrer_BArgList(BArgCQ sq) { return xkeepSQue("dictId_ExistsReferrer_BArgList", sq); }

    public Map<String, BColCQ> xdfgetDictId_ExistsReferrer_BColList() { return xgetSQueMap("dictId_ExistsReferrer_BColList"); }
    public String keepDictId_ExistsReferrer_BColList(BColCQ sq) { return xkeepSQue("dictId_ExistsReferrer_BColList", sq); }

    public Map<String, BDictCultureCQ> xdfgetDictId_ExistsReferrer_BDictCultureList() { return xgetSQueMap("dictId_ExistsReferrer_BDictCultureList"); }
    public String keepDictId_ExistsReferrer_BDictCultureList(BDictCultureCQ sq) { return xkeepSQue("dictId_ExistsReferrer_BDictCultureList", sq); }

    public Map<String, BDictValidCQ> xdfgetDictId_ExistsReferrer_BDictValidAsOne() { return xgetSQueMap("dictId_ExistsReferrer_BDictValidAsOne"); }
    public String keepDictId_ExistsReferrer_BDictValidAsOne(BDictValidCQ sq) { return xkeepSQue("dictId_ExistsReferrer_BDictValidAsOne", sq); }

    public Map<String, BItemCQ> xdfgetDictId_ExistsReferrer_BItemList() { return xgetSQueMap("dictId_ExistsReferrer_BItemList"); }
    public String keepDictId_ExistsReferrer_BItemList(BItemCQ sq) { return xkeepSQue("dictId_ExistsReferrer_BItemList", sq); }

    public Map<String, BMenuGrpCQ> xdfgetDictId_ExistsReferrer_BMenuGrpList() { return xgetSQueMap("dictId_ExistsReferrer_BMenuGrpList"); }
    public String keepDictId_ExistsReferrer_BMenuGrpList(BMenuGrpCQ sq) { return xkeepSQue("dictId_ExistsReferrer_BMenuGrpList", sq); }

    public Map<String, BScreenCQ> xdfgetDictId_ExistsReferrer_BScreenList() { return xgetSQueMap("dictId_ExistsReferrer_BScreenList"); }
    public String keepDictId_ExistsReferrer_BScreenList(BScreenCQ sq) { return xkeepSQue("dictId_ExistsReferrer_BScreenList", sq); }

    public Map<String, MHtDictCQ> xdfgetDictId_ExistsReferrer_MHtDictAsOne() { return xgetSQueMap("dictId_ExistsReferrer_MHtDictAsOne"); }
    public String keepDictId_ExistsReferrer_MHtDictAsOne(MHtDictCQ sq) { return xkeepSQue("dictId_ExistsReferrer_MHtDictAsOne", sq); }

    public Map<String, PReportLayoutItemCQ> xdfgetDictId_ExistsReferrer_PReportLayoutItemList() { return xgetSQueMap("dictId_ExistsReferrer_PReportLayoutItemList"); }
    public String keepDictId_ExistsReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq) { return xkeepSQue("dictId_ExistsReferrer_PReportLayoutItemList", sq); }

    public Map<String, PSubrepLayoutItemCQ> xdfgetDictId_ExistsReferrer_PSubrepLayoutItemList() { return xgetSQueMap("dictId_ExistsReferrer_PSubrepLayoutItemList"); }
    public String keepDictId_ExistsReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq) { return xkeepSQue("dictId_ExistsReferrer_PSubrepLayoutItemList", sq); }

    public Map<String, BArgCQ> xdfgetDictId_NotExistsReferrer_BArgList() { return xgetSQueMap("dictId_NotExistsReferrer_BArgList"); }
    public String keepDictId_NotExistsReferrer_BArgList(BArgCQ sq) { return xkeepSQue("dictId_NotExistsReferrer_BArgList", sq); }

    public Map<String, BColCQ> xdfgetDictId_NotExistsReferrer_BColList() { return xgetSQueMap("dictId_NotExistsReferrer_BColList"); }
    public String keepDictId_NotExistsReferrer_BColList(BColCQ sq) { return xkeepSQue("dictId_NotExistsReferrer_BColList", sq); }

    public Map<String, BDictCultureCQ> xdfgetDictId_NotExistsReferrer_BDictCultureList() { return xgetSQueMap("dictId_NotExistsReferrer_BDictCultureList"); }
    public String keepDictId_NotExistsReferrer_BDictCultureList(BDictCultureCQ sq) { return xkeepSQue("dictId_NotExistsReferrer_BDictCultureList", sq); }

    public Map<String, BDictValidCQ> xdfgetDictId_NotExistsReferrer_BDictValidAsOne() { return xgetSQueMap("dictId_NotExistsReferrer_BDictValidAsOne"); }
    public String keepDictId_NotExistsReferrer_BDictValidAsOne(BDictValidCQ sq) { return xkeepSQue("dictId_NotExistsReferrer_BDictValidAsOne", sq); }

    public Map<String, BItemCQ> xdfgetDictId_NotExistsReferrer_BItemList() { return xgetSQueMap("dictId_NotExistsReferrer_BItemList"); }
    public String keepDictId_NotExistsReferrer_BItemList(BItemCQ sq) { return xkeepSQue("dictId_NotExistsReferrer_BItemList", sq); }

    public Map<String, BMenuGrpCQ> xdfgetDictId_NotExistsReferrer_BMenuGrpList() { return xgetSQueMap("dictId_NotExistsReferrer_BMenuGrpList"); }
    public String keepDictId_NotExistsReferrer_BMenuGrpList(BMenuGrpCQ sq) { return xkeepSQue("dictId_NotExistsReferrer_BMenuGrpList", sq); }

    public Map<String, BScreenCQ> xdfgetDictId_NotExistsReferrer_BScreenList() { return xgetSQueMap("dictId_NotExistsReferrer_BScreenList"); }
    public String keepDictId_NotExistsReferrer_BScreenList(BScreenCQ sq) { return xkeepSQue("dictId_NotExistsReferrer_BScreenList", sq); }

    public Map<String, MHtDictCQ> xdfgetDictId_NotExistsReferrer_MHtDictAsOne() { return xgetSQueMap("dictId_NotExistsReferrer_MHtDictAsOne"); }
    public String keepDictId_NotExistsReferrer_MHtDictAsOne(MHtDictCQ sq) { return xkeepSQue("dictId_NotExistsReferrer_MHtDictAsOne", sq); }

    public Map<String, PReportLayoutItemCQ> xdfgetDictId_NotExistsReferrer_PReportLayoutItemList() { return xgetSQueMap("dictId_NotExistsReferrer_PReportLayoutItemList"); }
    public String keepDictId_NotExistsReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq) { return xkeepSQue("dictId_NotExistsReferrer_PReportLayoutItemList", sq); }

    public Map<String, PSubrepLayoutItemCQ> xdfgetDictId_NotExistsReferrer_PSubrepLayoutItemList() { return xgetSQueMap("dictId_NotExistsReferrer_PSubrepLayoutItemList"); }
    public String keepDictId_NotExistsReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq) { return xkeepSQue("dictId_NotExistsReferrer_PSubrepLayoutItemList", sq); }

    public Map<String, BArgCQ> xdfgetDictId_SpecifyDerivedReferrer_BArgList() { return xgetSQueMap("dictId_SpecifyDerivedReferrer_BArgList"); }
    public String keepDictId_SpecifyDerivedReferrer_BArgList(BArgCQ sq) { return xkeepSQue("dictId_SpecifyDerivedReferrer_BArgList", sq); }

    public Map<String, BColCQ> xdfgetDictId_SpecifyDerivedReferrer_BColList() { return xgetSQueMap("dictId_SpecifyDerivedReferrer_BColList"); }
    public String keepDictId_SpecifyDerivedReferrer_BColList(BColCQ sq) { return xkeepSQue("dictId_SpecifyDerivedReferrer_BColList", sq); }

    public Map<String, BDictCultureCQ> xdfgetDictId_SpecifyDerivedReferrer_BDictCultureList() { return xgetSQueMap("dictId_SpecifyDerivedReferrer_BDictCultureList"); }
    public String keepDictId_SpecifyDerivedReferrer_BDictCultureList(BDictCultureCQ sq) { return xkeepSQue("dictId_SpecifyDerivedReferrer_BDictCultureList", sq); }

    public Map<String, BItemCQ> xdfgetDictId_SpecifyDerivedReferrer_BItemList() { return xgetSQueMap("dictId_SpecifyDerivedReferrer_BItemList"); }
    public String keepDictId_SpecifyDerivedReferrer_BItemList(BItemCQ sq) { return xkeepSQue("dictId_SpecifyDerivedReferrer_BItemList", sq); }

    public Map<String, BMenuGrpCQ> xdfgetDictId_SpecifyDerivedReferrer_BMenuGrpList() { return xgetSQueMap("dictId_SpecifyDerivedReferrer_BMenuGrpList"); }
    public String keepDictId_SpecifyDerivedReferrer_BMenuGrpList(BMenuGrpCQ sq) { return xkeepSQue("dictId_SpecifyDerivedReferrer_BMenuGrpList", sq); }

    public Map<String, BScreenCQ> xdfgetDictId_SpecifyDerivedReferrer_BScreenList() { return xgetSQueMap("dictId_SpecifyDerivedReferrer_BScreenList"); }
    public String keepDictId_SpecifyDerivedReferrer_BScreenList(BScreenCQ sq) { return xkeepSQue("dictId_SpecifyDerivedReferrer_BScreenList", sq); }

    public Map<String, PReportLayoutItemCQ> xdfgetDictId_SpecifyDerivedReferrer_PReportLayoutItemList() { return xgetSQueMap("dictId_SpecifyDerivedReferrer_PReportLayoutItemList"); }
    public String keepDictId_SpecifyDerivedReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq) { return xkeepSQue("dictId_SpecifyDerivedReferrer_PReportLayoutItemList", sq); }

    public Map<String, PSubrepLayoutItemCQ> xdfgetDictId_SpecifyDerivedReferrer_PSubrepLayoutItemList() { return xgetSQueMap("dictId_SpecifyDerivedReferrer_PSubrepLayoutItemList"); }
    public String keepDictId_SpecifyDerivedReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq) { return xkeepSQue("dictId_SpecifyDerivedReferrer_PSubrepLayoutItemList", sq); }

    public Map<String, BArgCQ> xdfgetDictId_QueryDerivedReferrer_BArgList() { return xgetSQueMap("dictId_QueryDerivedReferrer_BArgList"); }
    public String keepDictId_QueryDerivedReferrer_BArgList(BArgCQ sq) { return xkeepSQue("dictId_QueryDerivedReferrer_BArgList", sq); }
    public Map<String, Object> xdfgetDictId_QueryDerivedReferrer_BArgListParameter() { return xgetSQuePmMap("dictId_QueryDerivedReferrer_BArgList"); }
    public String keepDictId_QueryDerivedReferrer_BArgListParameter(Object pm) { return xkeepSQuePm("dictId_QueryDerivedReferrer_BArgList", pm); }

    public Map<String, BColCQ> xdfgetDictId_QueryDerivedReferrer_BColList() { return xgetSQueMap("dictId_QueryDerivedReferrer_BColList"); }
    public String keepDictId_QueryDerivedReferrer_BColList(BColCQ sq) { return xkeepSQue("dictId_QueryDerivedReferrer_BColList", sq); }
    public Map<String, Object> xdfgetDictId_QueryDerivedReferrer_BColListParameter() { return xgetSQuePmMap("dictId_QueryDerivedReferrer_BColList"); }
    public String keepDictId_QueryDerivedReferrer_BColListParameter(Object pm) { return xkeepSQuePm("dictId_QueryDerivedReferrer_BColList", pm); }

    public Map<String, BDictCultureCQ> xdfgetDictId_QueryDerivedReferrer_BDictCultureList() { return xgetSQueMap("dictId_QueryDerivedReferrer_BDictCultureList"); }
    public String keepDictId_QueryDerivedReferrer_BDictCultureList(BDictCultureCQ sq) { return xkeepSQue("dictId_QueryDerivedReferrer_BDictCultureList", sq); }
    public Map<String, Object> xdfgetDictId_QueryDerivedReferrer_BDictCultureListParameter() { return xgetSQuePmMap("dictId_QueryDerivedReferrer_BDictCultureList"); }
    public String keepDictId_QueryDerivedReferrer_BDictCultureListParameter(Object pm) { return xkeepSQuePm("dictId_QueryDerivedReferrer_BDictCultureList", pm); }

    public Map<String, BItemCQ> xdfgetDictId_QueryDerivedReferrer_BItemList() { return xgetSQueMap("dictId_QueryDerivedReferrer_BItemList"); }
    public String keepDictId_QueryDerivedReferrer_BItemList(BItemCQ sq) { return xkeepSQue("dictId_QueryDerivedReferrer_BItemList", sq); }
    public Map<String, Object> xdfgetDictId_QueryDerivedReferrer_BItemListParameter() { return xgetSQuePmMap("dictId_QueryDerivedReferrer_BItemList"); }
    public String keepDictId_QueryDerivedReferrer_BItemListParameter(Object pm) { return xkeepSQuePm("dictId_QueryDerivedReferrer_BItemList", pm); }

    public Map<String, BMenuGrpCQ> xdfgetDictId_QueryDerivedReferrer_BMenuGrpList() { return xgetSQueMap("dictId_QueryDerivedReferrer_BMenuGrpList"); }
    public String keepDictId_QueryDerivedReferrer_BMenuGrpList(BMenuGrpCQ sq) { return xkeepSQue("dictId_QueryDerivedReferrer_BMenuGrpList", sq); }
    public Map<String, Object> xdfgetDictId_QueryDerivedReferrer_BMenuGrpListParameter() { return xgetSQuePmMap("dictId_QueryDerivedReferrer_BMenuGrpList"); }
    public String keepDictId_QueryDerivedReferrer_BMenuGrpListParameter(Object pm) { return xkeepSQuePm("dictId_QueryDerivedReferrer_BMenuGrpList", pm); }

    public Map<String, BScreenCQ> xdfgetDictId_QueryDerivedReferrer_BScreenList() { return xgetSQueMap("dictId_QueryDerivedReferrer_BScreenList"); }
    public String keepDictId_QueryDerivedReferrer_BScreenList(BScreenCQ sq) { return xkeepSQue("dictId_QueryDerivedReferrer_BScreenList", sq); }
    public Map<String, Object> xdfgetDictId_QueryDerivedReferrer_BScreenListParameter() { return xgetSQuePmMap("dictId_QueryDerivedReferrer_BScreenList"); }
    public String keepDictId_QueryDerivedReferrer_BScreenListParameter(Object pm) { return xkeepSQuePm("dictId_QueryDerivedReferrer_BScreenList", pm); }

    public Map<String, PReportLayoutItemCQ> xdfgetDictId_QueryDerivedReferrer_PReportLayoutItemList() { return xgetSQueMap("dictId_QueryDerivedReferrer_PReportLayoutItemList"); }
    public String keepDictId_QueryDerivedReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq) { return xkeepSQue("dictId_QueryDerivedReferrer_PReportLayoutItemList", sq); }
    public Map<String, Object> xdfgetDictId_QueryDerivedReferrer_PReportLayoutItemListParameter() { return xgetSQuePmMap("dictId_QueryDerivedReferrer_PReportLayoutItemList"); }
    public String keepDictId_QueryDerivedReferrer_PReportLayoutItemListParameter(Object pm) { return xkeepSQuePm("dictId_QueryDerivedReferrer_PReportLayoutItemList", pm); }

    public Map<String, PSubrepLayoutItemCQ> xdfgetDictId_QueryDerivedReferrer_PSubrepLayoutItemList() { return xgetSQueMap("dictId_QueryDerivedReferrer_PSubrepLayoutItemList"); }
    public String keepDictId_QueryDerivedReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq) { return xkeepSQue("dictId_QueryDerivedReferrer_PSubrepLayoutItemList", sq); }
    public Map<String, Object> xdfgetDictId_QueryDerivedReferrer_PSubrepLayoutItemListParameter() { return xgetSQuePmMap("dictId_QueryDerivedReferrer_PSubrepLayoutItemList"); }
    public String keepDictId_QueryDerivedReferrer_PSubrepLayoutItemListParameter(Object pm) { return xkeepSQuePm("dictId_QueryDerivedReferrer_PSubrepLayoutItemList", pm); }

    /**
     * Add order-by as ascend. <br>
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _dictNm;
    public ConditionValue xdfgetDictNm()
    { if (_dictNm == null) { _dictNm = nCV(); }
      return _dictNm; }
    protected ConditionValue xgetCValueDictNm() { return xdfgetDictNm(); }

    /**
     * Add order-by as ascend. <br>
     * DICT_NM: {UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_DictNm_Asc() { regOBA("DICT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_NM: {UQ, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_DictNm_Desc() { regOBD("DICT_NM"); return this; }

    protected ConditionValue _dataType;
    public ConditionValue xdfgetDataType()
    { if (_dataType == null) { _dataType = nCV(); }
      return _dataType; }
    protected ConditionValue xgetCValueDataType() { return xdfgetDataType(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_DataType_Asc() { regOBA("DATA_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_DataType_Desc() { regOBD("DATA_TYPE"); return this; }

    protected ConditionValue _systemType;
    public ConditionValue xdfgetSystemType()
    { if (_systemType == null) { _systemType = nCV(); }
      return _systemType; }
    protected ConditionValue xgetCValueSystemType() { return xdfgetSystemType(); }

    /**
     * Add order-by as ascend. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_SystemType_Asc() { regOBA("SYSTEM_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_SystemType_Desc() { regOBD("SYSTEM_TYPE"); return this; }

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
    public BsBDictCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBDictCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBDictCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBDictCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBDictCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBDictCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBDictCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBDictCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBDictCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBDictCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBDictCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBDictCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BDictCQ bq = (BDictCQ)bqs;
        BDictCQ uq = (BDictCQ)uqs;
        if (bq.hasConditionQueryBClassDtlByDataType()) {
            uq.queryBClassDtlByDataType().reflectRelationOnUnionQuery(bq.queryBClassDtlByDataType(), uq.queryBClassDtlByDataType());
        }
        if (bq.hasConditionQueryBDictValidAsOne()) {
            uq.queryBDictValidAsOne().reflectRelationOnUnionQuery(bq.queryBDictValidAsOne(), uq.queryBDictValidAsOne());
        }
        if (bq.hasConditionQueryMHtDictAsOne()) {
            uq.queryMHtDictAsOne().reflectRelationOnUnionQuery(bq.queryMHtDictAsOne(), uq.queryMHtDictAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DATA_TYPE, named 'BClassDtlByDataType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDataType() {
        return xdfgetConditionQueryBClassDtlByDataType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDataType() {
        String prop = "bClassDtlByDataType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDataType()); xsetupOuterJoinBClassDtlByDataType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDataType() {
        String nrp = xresolveNRP("B_DICT", "bClassDtlByDataType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDataType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDataType() { xregOutJo("bClassDtlByDataType"); }
    public boolean hasConditionQueryBClassDtlByDataType() { return xhasQueRlMap("bClassDtlByDataType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_DICT_VALID by DICT_ID, named 'BDictValidAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public BDictValidCQ queryBDictValidAsOne() { return xdfgetConditionQueryBDictValidAsOne(); }
    public BDictValidCQ xdfgetConditionQueryBDictValidAsOne() {
        String prop = "bDictValidAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBDictValidAsOne()); xsetupOuterJoinBDictValidAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected BDictValidCQ xcreateQueryBDictValidAsOne() {
        String nrp = xresolveNRP("B_DICT", "bDictValidAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BDictValidCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bDictValidAsOne", nrp);
    }
    protected void xsetupOuterJoinBDictValidAsOne() { xregOutJo("bDictValidAsOne"); }
    public boolean hasConditionQueryBDictValidAsOne() { return xhasQueRlMap("bDictValidAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_HT_DICT by DICT_ID, named 'MHtDictAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MHtDictCQ queryMHtDictAsOne() { return xdfgetConditionQueryMHtDictAsOne(); }
    public MHtDictCQ xdfgetConditionQueryMHtDictAsOne() {
        String prop = "mHtDictAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMHtDictAsOne()); xsetupOuterJoinMHtDictAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MHtDictCQ xcreateQueryMHtDictAsOne() {
        String nrp = xresolveNRP("B_DICT", "mHtDictAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MHtDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mHtDictAsOne", nrp);
    }
    protected void xsetupOuterJoinMHtDictAsOne() { xregOutJo("mHtDictAsOne"); }
    public boolean hasConditionQueryMHtDictAsOne() { return xhasQueRlMap("mHtDictAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BDictCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BDictCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BDictCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BDictCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BDictCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BDictCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BDictCQ> _myselfExistsMap;
    public Map<String, BDictCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BDictCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BDictCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BDictCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BDictCB.class.getName(); }
    protected String xCQ() { return BDictCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
