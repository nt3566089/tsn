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
 * The base condition-query of B_CULTURE.
 * @author DBFlute(AutoGenerator)
 */
public class BsBCultureCQ extends AbstractBsBCultureCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BCultureCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBCultureCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_CULTURE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BCultureCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BCultureCIQ xcreateCIQ() {
        BCultureCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BCultureCIQ xnewCIQ() {
        return new BCultureCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_CULTURE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BCultureCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BCultureCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _cultureId;
    public ConditionValue xdfgetCultureId()
    { if (_cultureId == null) { _cultureId = nCV(); }
      return _cultureId; }
    protected ConditionValue xgetCValueCultureId() { return xdfgetCultureId(); }

    public Map<String, BCultureCQ> xdfgetCultureId_ExistsReferrer_BCultureSelfList() { return xgetSQueMap("cultureId_ExistsReferrer_BCultureSelfList"); }
    public String keepCultureId_ExistsReferrer_BCultureSelfList(BCultureCQ sq) { return xkeepSQue("cultureId_ExistsReferrer_BCultureSelfList", sq); }

    public Map<String, BCultureAttributeCQ> xdfgetCultureId_ExistsReferrer_BCultureAttributeAsOne() { return xgetSQueMap("cultureId_ExistsReferrer_BCultureAttributeAsOne"); }
    public String keepCultureId_ExistsReferrer_BCultureAttributeAsOne(BCultureAttributeCQ sq) { return xkeepSQue("cultureId_ExistsReferrer_BCultureAttributeAsOne", sq); }

    public Map<String, BDictCultureCQ> xdfgetCultureId_ExistsReferrer_BDictCultureList() { return xgetSQueMap("cultureId_ExistsReferrer_BDictCultureList"); }
    public String keepCultureId_ExistsReferrer_BDictCultureList(BDictCultureCQ sq) { return xkeepSQue("cultureId_ExistsReferrer_BDictCultureList", sq); }

    public Map<String, BInfoCQ> xdfgetCultureId_ExistsReferrer_BInfoList() { return xgetSQueMap("cultureId_ExistsReferrer_BInfoList"); }
    public String keepCultureId_ExistsReferrer_BInfoList(BInfoCQ sq) { return xkeepSQue("cultureId_ExistsReferrer_BInfoList", sq); }

    public Map<String, BMessageCQ> xdfgetCultureId_ExistsReferrer_BMessageList() { return xgetSQueMap("cultureId_ExistsReferrer_BMessageList"); }
    public String keepCultureId_ExistsReferrer_BMessageList(BMessageCQ sq) { return xkeepSQue("cultureId_ExistsReferrer_BMessageList", sq); }

    public Map<String, BUserCQ> xdfgetCultureId_ExistsReferrer_BUserList() { return xgetSQueMap("cultureId_ExistsReferrer_BUserList"); }
    public String keepCultureId_ExistsReferrer_BUserList(BUserCQ sq) { return xkeepSQue("cultureId_ExistsReferrer_BUserList", sq); }

    public Map<String, MCenterCQ> xdfgetCultureId_ExistsReferrer_MCenterList() { return xgetSQueMap("cultureId_ExistsReferrer_MCenterList"); }
    public String keepCultureId_ExistsReferrer_MCenterList(MCenterCQ sq) { return xkeepSQue("cultureId_ExistsReferrer_MCenterList", sq); }

    public Map<String, BCultureCQ> xdfgetCultureId_NotExistsReferrer_BCultureSelfList() { return xgetSQueMap("cultureId_NotExistsReferrer_BCultureSelfList"); }
    public String keepCultureId_NotExistsReferrer_BCultureSelfList(BCultureCQ sq) { return xkeepSQue("cultureId_NotExistsReferrer_BCultureSelfList", sq); }

    public Map<String, BCultureAttributeCQ> xdfgetCultureId_NotExistsReferrer_BCultureAttributeAsOne() { return xgetSQueMap("cultureId_NotExistsReferrer_BCultureAttributeAsOne"); }
    public String keepCultureId_NotExistsReferrer_BCultureAttributeAsOne(BCultureAttributeCQ sq) { return xkeepSQue("cultureId_NotExistsReferrer_BCultureAttributeAsOne", sq); }

    public Map<String, BDictCultureCQ> xdfgetCultureId_NotExistsReferrer_BDictCultureList() { return xgetSQueMap("cultureId_NotExistsReferrer_BDictCultureList"); }
    public String keepCultureId_NotExistsReferrer_BDictCultureList(BDictCultureCQ sq) { return xkeepSQue("cultureId_NotExistsReferrer_BDictCultureList", sq); }

    public Map<String, BInfoCQ> xdfgetCultureId_NotExistsReferrer_BInfoList() { return xgetSQueMap("cultureId_NotExistsReferrer_BInfoList"); }
    public String keepCultureId_NotExistsReferrer_BInfoList(BInfoCQ sq) { return xkeepSQue("cultureId_NotExistsReferrer_BInfoList", sq); }

    public Map<String, BMessageCQ> xdfgetCultureId_NotExistsReferrer_BMessageList() { return xgetSQueMap("cultureId_NotExistsReferrer_BMessageList"); }
    public String keepCultureId_NotExistsReferrer_BMessageList(BMessageCQ sq) { return xkeepSQue("cultureId_NotExistsReferrer_BMessageList", sq); }

    public Map<String, BUserCQ> xdfgetCultureId_NotExistsReferrer_BUserList() { return xgetSQueMap("cultureId_NotExistsReferrer_BUserList"); }
    public String keepCultureId_NotExistsReferrer_BUserList(BUserCQ sq) { return xkeepSQue("cultureId_NotExistsReferrer_BUserList", sq); }

    public Map<String, MCenterCQ> xdfgetCultureId_NotExistsReferrer_MCenterList() { return xgetSQueMap("cultureId_NotExistsReferrer_MCenterList"); }
    public String keepCultureId_NotExistsReferrer_MCenterList(MCenterCQ sq) { return xkeepSQue("cultureId_NotExistsReferrer_MCenterList", sq); }

    public Map<String, BCultureCQ> xdfgetCultureId_SpecifyDerivedReferrer_BCultureSelfList() { return xgetSQueMap("cultureId_SpecifyDerivedReferrer_BCultureSelfList"); }
    public String keepCultureId_SpecifyDerivedReferrer_BCultureSelfList(BCultureCQ sq) { return xkeepSQue("cultureId_SpecifyDerivedReferrer_BCultureSelfList", sq); }

    public Map<String, BDictCultureCQ> xdfgetCultureId_SpecifyDerivedReferrer_BDictCultureList() { return xgetSQueMap("cultureId_SpecifyDerivedReferrer_BDictCultureList"); }
    public String keepCultureId_SpecifyDerivedReferrer_BDictCultureList(BDictCultureCQ sq) { return xkeepSQue("cultureId_SpecifyDerivedReferrer_BDictCultureList", sq); }

    public Map<String, BInfoCQ> xdfgetCultureId_SpecifyDerivedReferrer_BInfoList() { return xgetSQueMap("cultureId_SpecifyDerivedReferrer_BInfoList"); }
    public String keepCultureId_SpecifyDerivedReferrer_BInfoList(BInfoCQ sq) { return xkeepSQue("cultureId_SpecifyDerivedReferrer_BInfoList", sq); }

    public Map<String, BMessageCQ> xdfgetCultureId_SpecifyDerivedReferrer_BMessageList() { return xgetSQueMap("cultureId_SpecifyDerivedReferrer_BMessageList"); }
    public String keepCultureId_SpecifyDerivedReferrer_BMessageList(BMessageCQ sq) { return xkeepSQue("cultureId_SpecifyDerivedReferrer_BMessageList", sq); }

    public Map<String, BUserCQ> xdfgetCultureId_SpecifyDerivedReferrer_BUserList() { return xgetSQueMap("cultureId_SpecifyDerivedReferrer_BUserList"); }
    public String keepCultureId_SpecifyDerivedReferrer_BUserList(BUserCQ sq) { return xkeepSQue("cultureId_SpecifyDerivedReferrer_BUserList", sq); }

    public Map<String, MCenterCQ> xdfgetCultureId_SpecifyDerivedReferrer_MCenterList() { return xgetSQueMap("cultureId_SpecifyDerivedReferrer_MCenterList"); }
    public String keepCultureId_SpecifyDerivedReferrer_MCenterList(MCenterCQ sq) { return xkeepSQue("cultureId_SpecifyDerivedReferrer_MCenterList", sq); }

    public Map<String, BCultureCQ> xdfgetCultureId_QueryDerivedReferrer_BCultureSelfList() { return xgetSQueMap("cultureId_QueryDerivedReferrer_BCultureSelfList"); }
    public String keepCultureId_QueryDerivedReferrer_BCultureSelfList(BCultureCQ sq) { return xkeepSQue("cultureId_QueryDerivedReferrer_BCultureSelfList", sq); }
    public Map<String, Object> xdfgetCultureId_QueryDerivedReferrer_BCultureSelfListParameter() { return xgetSQuePmMap("cultureId_QueryDerivedReferrer_BCultureSelfList"); }
    public String keepCultureId_QueryDerivedReferrer_BCultureSelfListParameter(Object pm) { return xkeepSQuePm("cultureId_QueryDerivedReferrer_BCultureSelfList", pm); }

    public Map<String, BDictCultureCQ> xdfgetCultureId_QueryDerivedReferrer_BDictCultureList() { return xgetSQueMap("cultureId_QueryDerivedReferrer_BDictCultureList"); }
    public String keepCultureId_QueryDerivedReferrer_BDictCultureList(BDictCultureCQ sq) { return xkeepSQue("cultureId_QueryDerivedReferrer_BDictCultureList", sq); }
    public Map<String, Object> xdfgetCultureId_QueryDerivedReferrer_BDictCultureListParameter() { return xgetSQuePmMap("cultureId_QueryDerivedReferrer_BDictCultureList"); }
    public String keepCultureId_QueryDerivedReferrer_BDictCultureListParameter(Object pm) { return xkeepSQuePm("cultureId_QueryDerivedReferrer_BDictCultureList", pm); }

    public Map<String, BInfoCQ> xdfgetCultureId_QueryDerivedReferrer_BInfoList() { return xgetSQueMap("cultureId_QueryDerivedReferrer_BInfoList"); }
    public String keepCultureId_QueryDerivedReferrer_BInfoList(BInfoCQ sq) { return xkeepSQue("cultureId_QueryDerivedReferrer_BInfoList", sq); }
    public Map<String, Object> xdfgetCultureId_QueryDerivedReferrer_BInfoListParameter() { return xgetSQuePmMap("cultureId_QueryDerivedReferrer_BInfoList"); }
    public String keepCultureId_QueryDerivedReferrer_BInfoListParameter(Object pm) { return xkeepSQuePm("cultureId_QueryDerivedReferrer_BInfoList", pm); }

    public Map<String, BMessageCQ> xdfgetCultureId_QueryDerivedReferrer_BMessageList() { return xgetSQueMap("cultureId_QueryDerivedReferrer_BMessageList"); }
    public String keepCultureId_QueryDerivedReferrer_BMessageList(BMessageCQ sq) { return xkeepSQue("cultureId_QueryDerivedReferrer_BMessageList", sq); }
    public Map<String, Object> xdfgetCultureId_QueryDerivedReferrer_BMessageListParameter() { return xgetSQuePmMap("cultureId_QueryDerivedReferrer_BMessageList"); }
    public String keepCultureId_QueryDerivedReferrer_BMessageListParameter(Object pm) { return xkeepSQuePm("cultureId_QueryDerivedReferrer_BMessageList", pm); }

    public Map<String, BUserCQ> xdfgetCultureId_QueryDerivedReferrer_BUserList() { return xgetSQueMap("cultureId_QueryDerivedReferrer_BUserList"); }
    public String keepCultureId_QueryDerivedReferrer_BUserList(BUserCQ sq) { return xkeepSQue("cultureId_QueryDerivedReferrer_BUserList", sq); }
    public Map<String, Object> xdfgetCultureId_QueryDerivedReferrer_BUserListParameter() { return xgetSQuePmMap("cultureId_QueryDerivedReferrer_BUserList"); }
    public String keepCultureId_QueryDerivedReferrer_BUserListParameter(Object pm) { return xkeepSQuePm("cultureId_QueryDerivedReferrer_BUserList", pm); }

    public Map<String, MCenterCQ> xdfgetCultureId_QueryDerivedReferrer_MCenterList() { return xgetSQueMap("cultureId_QueryDerivedReferrer_MCenterList"); }
    public String keepCultureId_QueryDerivedReferrer_MCenterList(MCenterCQ sq) { return xkeepSQue("cultureId_QueryDerivedReferrer_MCenterList", sq); }
    public Map<String, Object> xdfgetCultureId_QueryDerivedReferrer_MCenterListParameter() { return xgetSQuePmMap("cultureId_QueryDerivedReferrer_MCenterList"); }
    public String keepCultureId_QueryDerivedReferrer_MCenterListParameter(Object pm) { return xkeepSQuePm("cultureId_QueryDerivedReferrer_MCenterList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_CultureId_Asc() { regOBA("CULTURE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_CultureId_Desc() { regOBD("CULTURE_ID"); return this; }

    protected ConditionValue _cultureCd;
    public ConditionValue xdfgetCultureCd()
    { if (_cultureCd == null) { _cultureCd = nCV(); }
      return _cultureCd; }
    protected ConditionValue xgetCValueCultureCd() { return xdfgetCultureCd(); }

    /**
     * Add order-by as ascend. <br>
     * CULTURE_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_CultureCd_Asc() { regOBA("CULTURE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CULTURE_CD: {UQ, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_CultureCd_Desc() { regOBD("CULTURE_CD"); return this; }

    protected ConditionValue _dictId;
    public ConditionValue xdfgetDictId()
    { if (_dictId == null) { _dictId = nCV(); }
      return _dictId; }
    protected ConditionValue xgetCValueDictId() { return xdfgetDictId(); }

    public Map<String, BDictCQ> getDictId_InScopeRelation_BDict() { return xgetSQueMap("dictId_InScopeRelation_BDict"); }
    public String keepDictId_InScopeRelation_BDict(BDictCQ sq) { return xkeepSQue("dictId_InScopeRelation_BDict", sq); }

    public Map<String, BDictCQ> getDictId_NotInScopeRelation_BDict() { return xgetSQueMap("dictId_NotInScopeRelation_BDict"); }
    public String keepDictId_NotInScopeRelation_BDict(BDictCQ sq) { return xkeepSQue("dictId_NotInScopeRelation_BDict", sq); }

    /**
     * Add order-by as ascend. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _langCultureId;
    public ConditionValue xdfgetLangCultureId()
    { if (_langCultureId == null) { _langCultureId = nCV(); }
      return _langCultureId; }
    protected ConditionValue xgetCValueLangCultureId() { return xdfgetLangCultureId(); }

    public Map<String, BCultureCQ> getLangCultureId_InScopeRelation_BCultureSelf() { return xgetSQueMap("langCultureId_InScopeRelation_BCultureSelf"); }
    public String keepLangCultureId_InScopeRelation_BCultureSelf(BCultureCQ sq) { return xkeepSQue("langCultureId_InScopeRelation_BCultureSelf", sq); }

    public Map<String, BCultureCQ> getLangCultureId_NotInScopeRelation_BCultureSelf() { return xgetSQueMap("langCultureId_NotInScopeRelation_BCultureSelf"); }
    public String keepLangCultureId_NotInScopeRelation_BCultureSelf(BCultureCQ sq) { return xkeepSQue("langCultureId_NotInScopeRelation_BCultureSelf", sq); }

    /**
     * Add order-by as ascend. <br>
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_LangCultureId_Asc() { regOBA("LANG_CULTURE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_LangCultureId_Desc() { regOBD("LANG_CULTURE_ID"); return this; }

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
    public BsBCultureCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBCultureCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBCultureCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBCultureCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBCultureCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBCultureCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBCultureCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBCultureCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBCultureCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBCultureCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBCultureCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBCultureCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BCultureCQ bq = (BCultureCQ)bqs;
        BCultureCQ uq = (BCultureCQ)uqs;
        if (bq.hasConditionQueryBCultureSelf()) {
            uq.queryBCultureSelf().reflectRelationOnUnionQuery(bq.queryBCultureSelf(), uq.queryBCultureSelf());
        }
        if (bq.hasConditionQueryVDict()) {
            uq.xsetParameterMapVDict(bq.xdfgetParameterMapVDict());
            uq.xdfgetConditionQueryVDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVDict(), uq.xdfgetConditionQueryVDict());
        }
        if (bq.hasConditionQueryBCultureAttributeAsOne()) {
            uq.queryBCultureAttributeAsOne().reflectRelationOnUnionQuery(bq.queryBCultureAttributeAsOne(), uq.queryBCultureAttributeAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CULTURE by my LANG_CULTURE_ID, named 'BCultureSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public BCultureCQ queryBCultureSelf() {
        return xdfgetConditionQueryBCultureSelf();
    }
    public BCultureCQ xdfgetConditionQueryBCultureSelf() {
        String prop = "bCultureSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBCultureSelf()); xsetupOuterJoinBCultureSelf(); }
        return xgetQueRlMap(prop);
    }
    protected BCultureCQ xcreateQueryBCultureSelf() {
        String nrp = xresolveNRP("B_CULTURE", "bCultureSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BCultureCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bCultureSelf", nrp);
    }
    protected void xsetupOuterJoinBCultureSelf() { xregOutJo("bCultureSelf"); }
    public boolean hasConditionQueryBCultureSelf() { return xhasQueRlMap("bCultureSelf"); }

    /**
     * Get the condition-query for relation table. <br>
     * V_DICT by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public VDictCQ queryVDict(Long cultureId) {
        Map<String, Object> parameterMap = xdfgetParameterMapVDict();
        parameterMap.put("cultureId", cultureId);
        xassertFCDP("vDict", parameterMap);
        return xdfgetConditionQueryVDict();
    }
    public VDictCQ xdfgetConditionQueryVDict() {
        String prop = "vDict";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVDict()); xsetupOuterJoinVDict(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapVDict;
    public Map<String, Object> xdfgetParameterMapVDict()
    { if (_parameterMapVDict == null) { _parameterMapVDict = newLinkedHashMapSized(4); }
      return _parameterMapVDict; }
    public void xsetParameterMapVDict(Map<String, Object> parameterMap)
    { _parameterMapVDict = parameterMap; } // for UnionQuery
    protected VDictCQ xcreateQueryVDict() {
        String nrp = xresolveNRP("B_CULTURE", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vDict", nrp);
    }
    protected void xsetupOuterJoinVDict() { xregOutJo("vDict"); }
    public boolean hasConditionQueryVDict() { return xhasQueRlMap("vDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CULTURE_ATTRIBUTE by CULTURE_ID, named 'BCultureAttributeAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public BCultureAttributeCQ queryBCultureAttributeAsOne() { return xdfgetConditionQueryBCultureAttributeAsOne(); }
    public BCultureAttributeCQ xdfgetConditionQueryBCultureAttributeAsOne() {
        String prop = "bCultureAttributeAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBCultureAttributeAsOne()); xsetupOuterJoinBCultureAttributeAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected BCultureAttributeCQ xcreateQueryBCultureAttributeAsOne() {
        String nrp = xresolveNRP("B_CULTURE", "bCultureAttributeAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BCultureAttributeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bCultureAttributeAsOne", nrp);
    }
    protected void xsetupOuterJoinBCultureAttributeAsOne() { xregOutJo("bCultureAttributeAsOne"); }
    public boolean hasConditionQueryBCultureAttributeAsOne() { return xhasQueRlMap("bCultureAttributeAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vDict".equalsIgnoreCase(property)) { return _parameterMapVDict; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BCultureCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BCultureCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BCultureCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BCultureCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BCultureCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BCultureCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BCultureCQ> _myselfExistsMap;
    public Map<String, BCultureCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BCultureCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BCultureCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BCultureCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BCultureCB.class.getName(); }
    protected String xCQ() { return BCultureCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
