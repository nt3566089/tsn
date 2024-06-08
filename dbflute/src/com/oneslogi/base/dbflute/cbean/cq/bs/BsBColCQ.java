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
 * The base condition-query of B_COL.
 * @author DBFlute(AutoGenerator)
 */
public class BsBColCQ extends AbstractBsBColCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BColCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBColCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_COL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BColCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BColCIQ xcreateCIQ() {
        BColCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BColCIQ xnewCIQ() {
        return new BColCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_COL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BColCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BColCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _colId;
    public ConditionValue xdfgetColId()
    { if (_colId == null) { _colId = nCV(); }
      return _colId; }
    protected ConditionValue xgetCValueColId() { return xdfgetColId(); }

    public Map<String, BColRoleCQ> xdfgetColId_ExistsReferrer_BColRoleList() { return xgetSQueMap("colId_ExistsReferrer_BColRoleList"); }
    public String keepColId_ExistsReferrer_BColRoleList(BColRoleCQ sq) { return xkeepSQue("colId_ExistsReferrer_BColRoleList", sq); }

    public Map<String, BColValidCQ> xdfgetColId_ExistsReferrer_BColValidAsOne() { return xgetSQueMap("colId_ExistsReferrer_BColValidAsOne"); }
    public String keepColId_ExistsReferrer_BColValidAsOne(BColValidCQ sq) { return xkeepSQue("colId_ExistsReferrer_BColValidAsOne", sq); }

    public Map<String, MCenterColCQ> xdfgetColId_ExistsReferrer_MCenterColList() { return xgetSQueMap("colId_ExistsReferrer_MCenterColList"); }
    public String keepColId_ExistsReferrer_MCenterColList(MCenterColCQ sq) { return xkeepSQue("colId_ExistsReferrer_MCenterColList", sq); }

    public Map<String, MClientColCQ> xdfgetColId_ExistsReferrer_MClientColList() { return xgetSQueMap("colId_ExistsReferrer_MClientColList"); }
    public String keepColId_ExistsReferrer_MClientColList(MClientColCQ sq) { return xkeepSQue("colId_ExistsReferrer_MClientColList", sq); }

    public Map<String, BColRoleCQ> xdfgetColId_NotExistsReferrer_BColRoleList() { return xgetSQueMap("colId_NotExistsReferrer_BColRoleList"); }
    public String keepColId_NotExistsReferrer_BColRoleList(BColRoleCQ sq) { return xkeepSQue("colId_NotExistsReferrer_BColRoleList", sq); }

    public Map<String, BColValidCQ> xdfgetColId_NotExistsReferrer_BColValidAsOne() { return xgetSQueMap("colId_NotExistsReferrer_BColValidAsOne"); }
    public String keepColId_NotExistsReferrer_BColValidAsOne(BColValidCQ sq) { return xkeepSQue("colId_NotExistsReferrer_BColValidAsOne", sq); }

    public Map<String, MCenterColCQ> xdfgetColId_NotExistsReferrer_MCenterColList() { return xgetSQueMap("colId_NotExistsReferrer_MCenterColList"); }
    public String keepColId_NotExistsReferrer_MCenterColList(MCenterColCQ sq) { return xkeepSQue("colId_NotExistsReferrer_MCenterColList", sq); }

    public Map<String, MClientColCQ> xdfgetColId_NotExistsReferrer_MClientColList() { return xgetSQueMap("colId_NotExistsReferrer_MClientColList"); }
    public String keepColId_NotExistsReferrer_MClientColList(MClientColCQ sq) { return xkeepSQue("colId_NotExistsReferrer_MClientColList", sq); }

    public Map<String, BColRoleCQ> xdfgetColId_SpecifyDerivedReferrer_BColRoleList() { return xgetSQueMap("colId_SpecifyDerivedReferrer_BColRoleList"); }
    public String keepColId_SpecifyDerivedReferrer_BColRoleList(BColRoleCQ sq) { return xkeepSQue("colId_SpecifyDerivedReferrer_BColRoleList", sq); }

    public Map<String, MCenterColCQ> xdfgetColId_SpecifyDerivedReferrer_MCenterColList() { return xgetSQueMap("colId_SpecifyDerivedReferrer_MCenterColList"); }
    public String keepColId_SpecifyDerivedReferrer_MCenterColList(MCenterColCQ sq) { return xkeepSQue("colId_SpecifyDerivedReferrer_MCenterColList", sq); }

    public Map<String, MClientColCQ> xdfgetColId_SpecifyDerivedReferrer_MClientColList() { return xgetSQueMap("colId_SpecifyDerivedReferrer_MClientColList"); }
    public String keepColId_SpecifyDerivedReferrer_MClientColList(MClientColCQ sq) { return xkeepSQue("colId_SpecifyDerivedReferrer_MClientColList", sq); }

    public Map<String, BColRoleCQ> xdfgetColId_QueryDerivedReferrer_BColRoleList() { return xgetSQueMap("colId_QueryDerivedReferrer_BColRoleList"); }
    public String keepColId_QueryDerivedReferrer_BColRoleList(BColRoleCQ sq) { return xkeepSQue("colId_QueryDerivedReferrer_BColRoleList", sq); }
    public Map<String, Object> xdfgetColId_QueryDerivedReferrer_BColRoleListParameter() { return xgetSQuePmMap("colId_QueryDerivedReferrer_BColRoleList"); }
    public String keepColId_QueryDerivedReferrer_BColRoleListParameter(Object pm) { return xkeepSQuePm("colId_QueryDerivedReferrer_BColRoleList", pm); }

    public Map<String, MCenterColCQ> xdfgetColId_QueryDerivedReferrer_MCenterColList() { return xgetSQueMap("colId_QueryDerivedReferrer_MCenterColList"); }
    public String keepColId_QueryDerivedReferrer_MCenterColList(MCenterColCQ sq) { return xkeepSQue("colId_QueryDerivedReferrer_MCenterColList", sq); }
    public Map<String, Object> xdfgetColId_QueryDerivedReferrer_MCenterColListParameter() { return xgetSQuePmMap("colId_QueryDerivedReferrer_MCenterColList"); }
    public String keepColId_QueryDerivedReferrer_MCenterColListParameter(Object pm) { return xkeepSQuePm("colId_QueryDerivedReferrer_MCenterColList", pm); }

    public Map<String, MClientColCQ> xdfgetColId_QueryDerivedReferrer_MClientColList() { return xgetSQueMap("colId_QueryDerivedReferrer_MClientColList"); }
    public String keepColId_QueryDerivedReferrer_MClientColList(MClientColCQ sq) { return xkeepSQue("colId_QueryDerivedReferrer_MClientColList", sq); }
    public Map<String, Object> xdfgetColId_QueryDerivedReferrer_MClientColListParameter() { return xgetSQuePmMap("colId_QueryDerivedReferrer_MClientColList"); }
    public String keepColId_QueryDerivedReferrer_MClientColListParameter(Object pm) { return xkeepSQuePm("colId_QueryDerivedReferrer_MClientColList", pm); }

    /**
     * Add order-by as ascend. <br>
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_ColId_Asc() { regOBA("COL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_ColId_Desc() { regOBD("COL_ID"); return this; }

    protected ConditionValue _itemId;
    public ConditionValue xdfgetItemId()
    { if (_itemId == null) { _itemId = nCV(); }
      return _itemId; }
    protected ConditionValue xgetCValueItemId() { return xdfgetItemId(); }

    public Map<String, BItemCQ> getItemId_InScopeRelation_BItem() { return xgetSQueMap("itemId_InScopeRelation_BItem"); }
    public String keepItemId_InScopeRelation_BItem(BItemCQ sq) { return xkeepSQue("itemId_InScopeRelation_BItem", sq); }

    public Map<String, BItemCQ> getItemId_NotInScopeRelation_BItem() { return xgetSQueMap("itemId_NotInScopeRelation_BItem"); }
    public String keepItemId_NotInScopeRelation_BItem(BItemCQ sq) { return xkeepSQue("itemId_NotInScopeRelation_BItem", sq); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_ItemId_Asc() { regOBA("ITEM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_ID: {UQ+, IX, NotNull, bigint(19), FK to B_ITEM}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_ItemId_Desc() { regOBD("ITEM_ID"); return this; }

    protected ConditionValue _colCd;
    public ConditionValue xdfgetColCd()
    { if (_colCd == null) { _colCd = nCV(); }
      return _colCd; }
    protected ConditionValue xgetCValueColCd() { return xdfgetColCd(); }

    /**
     * Add order-by as ascend. <br>
     * COL_CD: {+UQ, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_ColCd_Asc() { regOBA("COL_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COL_CD: {+UQ, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_ColCd_Desc() { regOBD("COL_CD"); return this; }

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
    public BsBColCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _colOrder;
    public ConditionValue xdfgetColOrder()
    { if (_colOrder == null) { _colOrder = nCV(); }
      return _colOrder; }
    protected ConditionValue xgetCValueColOrder() { return xdfgetColOrder(); }

    /**
     * Add order-by as ascend. <br>
     * COL_ORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_ColOrder_Asc() { regOBA("COL_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * COL_ORDER: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_ColOrder_Desc() { regOBD("COL_ORDER"); return this; }

    protected ConditionValue _colType;
    public ConditionValue xdfgetColType()
    { if (_colType == null) { _colType = nCV(); }
      return _colType; }
    protected ConditionValue xgetCValueColType() { return xdfgetColType(); }

    /**
     * Add order-by as ascend. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_ColType_Asc() { regOBA("COL_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * COL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ColType}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_ColType_Desc() { regOBD("COL_TYPE"); return this; }

    protected ConditionValue _visible;
    public ConditionValue xdfgetVisible()
    { if (_visible == null) { _visible = nCV(); }
      return _visible; }
    protected ConditionValue xgetCValueVisible() { return xdfgetVisible(); }

    /**
     * Add order-by as ascend. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_Visible_Asc() { regOBA("VISIBLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_Visible_Desc() { regOBD("VISIBLE"); return this; }

    protected ConditionValue _editable;
    public ConditionValue xdfgetEditable()
    { if (_editable == null) { _editable = nCV(); }
      return _editable; }
    protected ConditionValue xgetCValueEditable() { return xdfgetEditable(); }

    /**
     * Add order-by as ascend. <br>
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_Editable_Asc() { regOBA("EDITABLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_Editable_Desc() { regOBD("EDITABLE"); return this; }

    protected ConditionValue _textAlign;
    public ConditionValue xdfgetTextAlign()
    { if (_textAlign == null) { _textAlign = nCV(); }
      return _textAlign; }
    protected ConditionValue xgetCValueTextAlign() { return xdfgetTextAlign(); }

    /**
     * Add order-by as ascend. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_TextAlign_Asc() { regOBA("TEXT_ALIGN"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_TextAlign_Desc() { regOBD("TEXT_ALIGN"); return this; }

    protected ConditionValue _necessary;
    public ConditionValue xdfgetNecessary()
    { if (_necessary == null) { _necessary = nCV(); }
      return _necessary; }
    protected ConditionValue xgetCValueNecessary() { return xdfgetNecessary(); }

    /**
     * Add order-by as ascend. <br>
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_Necessary_Asc() { regOBA("NECESSARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_Necessary_Desc() { regOBD("NECESSARY"); return this; }

    protected ConditionValue _colWidth;
    public ConditionValue xdfgetColWidth()
    { if (_colWidth == null) { _colWidth = nCV(); }
      return _colWidth; }
    protected ConditionValue xgetCValueColWidth() { return xdfgetColWidth(); }

    /**
     * Add order-by as ascend. <br>
     * COL_WIDTH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_ColWidth_Asc() { regOBA("COL_WIDTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * COL_WIDTH: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_ColWidth_Desc() { regOBD("COL_WIDTH"); return this; }

    protected ConditionValue _inColIndex;
    public ConditionValue xdfgetInColIndex()
    { if (_inColIndex == null) { _inColIndex = nCV(); }
      return _inColIndex; }
    protected ConditionValue xgetCValueInColIndex() { return xdfgetInColIndex(); }

    /**
     * Add order-by as ascend. <br>
     * IN_COL_INDEX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_InColIndex_Asc() { regOBA("IN_COL_INDEX"); return this; }

    /**
     * Add order-by as descend. <br>
     * IN_COL_INDEX: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_InColIndex_Desc() { regOBD("IN_COL_INDEX"); return this; }

    protected ConditionValue _inColDefaultValue;
    public ConditionValue xdfgetInColDefaultValue()
    { if (_inColDefaultValue == null) { _inColDefaultValue = nCV(); }
      return _inColDefaultValue; }
    protected ConditionValue xgetCValueInColDefaultValue() { return xdfgetInColDefaultValue(); }

    /**
     * Add order-by as ascend. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_InColDefaultValue_Asc() { regOBA("IN_COL_DEFAULT_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * IN_COL_DEFAULT_VALUE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_InColDefaultValue_Desc() { regOBD("IN_COL_DEFAULT_VALUE"); return this; }

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
    public BsBColCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBColCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBColCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBColCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBColCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBColCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBColCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBColCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBColCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBColCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBColCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBColCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BColCQ bq = (BColCQ)bqs;
        BColCQ uq = (BColCQ)uqs;
        if (bq.hasConditionQueryBDict()) {
            uq.queryBDict().reflectRelationOnUnionQuery(bq.queryBDict(), uq.queryBDict());
        }
        if (bq.hasConditionQueryBItem()) {
            uq.queryBItem().reflectRelationOnUnionQuery(bq.queryBItem(), uq.queryBItem());
        }
        if (bq.hasConditionQueryVDict()) {
            uq.xsetParameterMapVDict(bq.xdfgetParameterMapVDict());
            uq.xdfgetConditionQueryVDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVDict(), uq.xdfgetConditionQueryVDict());
        }
        if (bq.hasConditionQueryVHtDict()) {
            uq.xsetParameterMapVHtDict(bq.xdfgetParameterMapVHtDict());
            uq.xdfgetConditionQueryVHtDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVHtDict(), uq.xdfgetConditionQueryVHtDict());
        }
        if (bq.hasConditionQueryBClassDtlByColType()) {
            uq.queryBClassDtlByColType().reflectRelationOnUnionQuery(bq.queryBClassDtlByColType(), uq.queryBClassDtlByColType());
        }
        if (bq.hasConditionQueryBClassDtlByVisible()) {
            uq.queryBClassDtlByVisible().reflectRelationOnUnionQuery(bq.queryBClassDtlByVisible(), uq.queryBClassDtlByVisible());
        }
        if (bq.hasConditionQueryBClassDtlByEditable()) {
            uq.queryBClassDtlByEditable().reflectRelationOnUnionQuery(bq.queryBClassDtlByEditable(), uq.queryBClassDtlByEditable());
        }
        if (bq.hasConditionQueryBClassDtlByTextAlign()) {
            uq.queryBClassDtlByTextAlign().reflectRelationOnUnionQuery(bq.queryBClassDtlByTextAlign(), uq.queryBClassDtlByTextAlign());
        }
        if (bq.hasConditionQueryBClassDtlByNecessary()) {
            uq.queryBClassDtlByNecessary().reflectRelationOnUnionQuery(bq.queryBClassDtlByNecessary(), uq.queryBClassDtlByNecessary());
        }
        if (bq.hasConditionQueryBColValidAsOne()) {
            uq.queryBColValidAsOne().reflectRelationOnUnionQuery(bq.queryBColValidAsOne(), uq.queryBColValidAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_DICT by my DICT_ID, named 'BDict'.
     * @return The instance of condition-query. (NotNull)
     */
    public BDictCQ queryBDict() {
        return xdfgetConditionQueryBDict();
    }
    public BDictCQ xdfgetConditionQueryBDict() {
        String prop = "bDict";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBDict()); xsetupOuterJoinBDict(); }
        return xgetQueRlMap(prop);
    }
    protected BDictCQ xcreateQueryBDict() {
        String nrp = xresolveNRP("B_COL", "bDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bDict", nrp);
    }
    protected void xsetupOuterJoinBDict() { xregOutJo("bDict"); }
    public boolean hasConditionQueryBDict() { return xhasQueRlMap("bDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_ITEM by my ITEM_ID, named 'BItem'.
     * @return The instance of condition-query. (NotNull)
     */
    public BItemCQ queryBItem() {
        return xdfgetConditionQueryBItem();
    }
    public BItemCQ xdfgetConditionQueryBItem() {
        String prop = "bItem";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBItem()); xsetupOuterJoinBItem(); }
        return xgetQueRlMap(prop);
    }
    protected BItemCQ xcreateQueryBItem() {
        String nrp = xresolveNRP("B_COL", "bItem"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BItemCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bItem", nrp);
    }
    protected void xsetupOuterJoinBItem() { xregOutJo("bItem"); }
    public boolean hasConditionQueryBItem() { return xhasQueRlMap("bItem"); }

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
        String nrp = xresolveNRP("B_COL", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vDict", nrp);
    }
    protected void xsetupOuterJoinVDict() { xregOutJo("vDict"); }
    public boolean hasConditionQueryVDict() { return xhasQueRlMap("vDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * V_HT_DICT by my DICT_ID, named 'VHtDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public VHtDictCQ queryVHtDict(Long cultureId) {
        Map<String, Object> parameterMap = xdfgetParameterMapVHtDict();
        parameterMap.put("cultureId", cultureId);
        xassertFCDP("vHtDict", parameterMap);
        return xdfgetConditionQueryVHtDict();
    }
    public VHtDictCQ xdfgetConditionQueryVHtDict() {
        String prop = "vHtDict";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVHtDict()); xsetupOuterJoinVHtDict(); }
        return xgetQueRlMap(prop);
    }
    protected Map<String, Object> _parameterMapVHtDict;
    public Map<String, Object> xdfgetParameterMapVHtDict()
    { if (_parameterMapVHtDict == null) { _parameterMapVHtDict = newLinkedHashMapSized(4); }
      return _parameterMapVHtDict; }
    public void xsetParameterMapVHtDict(Map<String, Object> parameterMap)
    { _parameterMapVHtDict = parameterMap; } // for UnionQuery
    protected VHtDictCQ xcreateQueryVHtDict() {
        String nrp = xresolveNRP("B_COL", "vHtDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VHtDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vHtDict", nrp);
    }
    protected void xsetupOuterJoinVHtDict() { xregOutJo("vHtDict"); }
    public boolean hasConditionQueryVHtDict() { return xhasQueRlMap("vHtDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my COL_TYPE, named 'BClassDtlByColType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByColType() {
        return xdfgetConditionQueryBClassDtlByColType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByColType() {
        String prop = "bClassDtlByColType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByColType()); xsetupOuterJoinBClassDtlByColType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByColType() {
        String nrp = xresolveNRP("B_COL", "bClassDtlByColType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByColType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByColType() { xregOutJo("bClassDtlByColType"); }
    public boolean hasConditionQueryBClassDtlByColType() { return xhasQueRlMap("bClassDtlByColType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByVisible() {
        return xdfgetConditionQueryBClassDtlByVisible();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByVisible() {
        String prop = "bClassDtlByVisible";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByVisible()); xsetupOuterJoinBClassDtlByVisible(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByVisible() {
        String nrp = xresolveNRP("B_COL", "bClassDtlByVisible"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByVisible", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByVisible() { xregOutJo("bClassDtlByVisible"); }
    public boolean hasConditionQueryBClassDtlByVisible() { return xhasQueRlMap("bClassDtlByVisible"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my EDITABLE, named 'BClassDtlByEditable'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByEditable() {
        return xdfgetConditionQueryBClassDtlByEditable();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByEditable() {
        String prop = "bClassDtlByEditable";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByEditable()); xsetupOuterJoinBClassDtlByEditable(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByEditable() {
        String nrp = xresolveNRP("B_COL", "bClassDtlByEditable"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByEditable", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByEditable() { xregOutJo("bClassDtlByEditable"); }
    public boolean hasConditionQueryBClassDtlByEditable() { return xhasQueRlMap("bClassDtlByEditable"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my TEXT_ALIGN, named 'BClassDtlByTextAlign'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByTextAlign() {
        return xdfgetConditionQueryBClassDtlByTextAlign();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByTextAlign() {
        String prop = "bClassDtlByTextAlign";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByTextAlign()); xsetupOuterJoinBClassDtlByTextAlign(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByTextAlign() {
        String nrp = xresolveNRP("B_COL", "bClassDtlByTextAlign"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByTextAlign", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByTextAlign() { xregOutJo("bClassDtlByTextAlign"); }
    public boolean hasConditionQueryBClassDtlByTextAlign() { return xhasQueRlMap("bClassDtlByTextAlign"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my NECESSARY, named 'BClassDtlByNecessary'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByNecessary() {
        return xdfgetConditionQueryBClassDtlByNecessary();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByNecessary() {
        String prop = "bClassDtlByNecessary";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByNecessary()); xsetupOuterJoinBClassDtlByNecessary(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByNecessary() {
        String nrp = xresolveNRP("B_COL", "bClassDtlByNecessary"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByNecessary", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByNecessary() { xregOutJo("bClassDtlByNecessary"); }
    public boolean hasConditionQueryBClassDtlByNecessary() { return xhasQueRlMap("bClassDtlByNecessary"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_COL_VALID by COL_ID, named 'BColValidAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public BColValidCQ queryBColValidAsOne() { return xdfgetConditionQueryBColValidAsOne(); }
    public BColValidCQ xdfgetConditionQueryBColValidAsOne() {
        String prop = "bColValidAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBColValidAsOne()); xsetupOuterJoinBColValidAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected BColValidCQ xcreateQueryBColValidAsOne() {
        String nrp = xresolveNRP("B_COL", "bColValidAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BColValidCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bColValidAsOne", nrp);
    }
    protected void xsetupOuterJoinBColValidAsOne() { xregOutJo("bColValidAsOne"); }
    public boolean hasConditionQueryBColValidAsOne() { return xhasQueRlMap("bColValidAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vDict".equalsIgnoreCase(property)) { return _parameterMapVDict; }
        if ("vHtDict".equalsIgnoreCase(property)) { return _parameterMapVHtDict; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BColCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BColCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BColCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BColCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BColCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BColCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BColCQ> _myselfExistsMap;
    public Map<String, BColCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BColCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BColCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BColCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BColCB.class.getName(); }
    protected String xCQ() { return BColCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
