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
 * The base condition-query of B_ITEM.
 * @author DBFlute(AutoGenerator)
 */
public class BsBItemCQ extends AbstractBsBItemCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BItemCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBItemCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_ITEM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BItemCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BItemCIQ xcreateCIQ() {
        BItemCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BItemCIQ xnewCIQ() {
        return new BItemCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_ITEM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BItemCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BItemCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _itemId;
    public ConditionValue xdfgetItemId()
    { if (_itemId == null) { _itemId = nCV(); }
      return _itemId; }
    protected ConditionValue xgetCValueItemId() { return xdfgetItemId(); }

    public Map<String, BColCQ> xdfgetItemId_ExistsReferrer_BColList() { return xgetSQueMap("itemId_ExistsReferrer_BColList"); }
    public String keepItemId_ExistsReferrer_BColList(BColCQ sq) { return xkeepSQue("itemId_ExistsReferrer_BColList", sq); }

    public Map<String, BColExtBaseCQ> xdfgetItemId_ExistsReferrer_BColExtBaseList() { return xgetSQueMap("itemId_ExistsReferrer_BColExtBaseList"); }
    public String keepItemId_ExistsReferrer_BColExtBaseList(BColExtBaseCQ sq) { return xkeepSQue("itemId_ExistsReferrer_BColExtBaseList", sq); }

    public Map<String, BColExtUserCQ> xdfgetItemId_ExistsReferrer_BColExtUserList() { return xgetSQueMap("itemId_ExistsReferrer_BColExtUserList"); }
    public String keepItemId_ExistsReferrer_BColExtUserList(BColExtUserCQ sq) { return xkeepSQue("itemId_ExistsReferrer_BColExtUserList", sq); }

    public Map<String, BItemRoleCQ> xdfgetItemId_ExistsReferrer_BItemRoleList() { return xgetSQueMap("itemId_ExistsReferrer_BItemRoleList"); }
    public String keepItemId_ExistsReferrer_BItemRoleList(BItemRoleCQ sq) { return xkeepSQue("itemId_ExistsReferrer_BItemRoleList", sq); }

    public Map<String, BItemValidCQ> xdfgetItemId_ExistsReferrer_BItemValidAsOne() { return xgetSQueMap("itemId_ExistsReferrer_BItemValidAsOne"); }
    public String keepItemId_ExistsReferrer_BItemValidAsOne(BItemValidCQ sq) { return xkeepSQue("itemId_ExistsReferrer_BItemValidAsOne", sq); }

    public Map<String, MCenterItemCQ> xdfgetItemId_ExistsReferrer_MCenterItemList() { return xgetSQueMap("itemId_ExistsReferrer_MCenterItemList"); }
    public String keepItemId_ExistsReferrer_MCenterItemList(MCenterItemCQ sq) { return xkeepSQue("itemId_ExistsReferrer_MCenterItemList", sq); }

    public Map<String, MClientItemCQ> xdfgetItemId_ExistsReferrer_MClientItemList() { return xgetSQueMap("itemId_ExistsReferrer_MClientItemList"); }
    public String keepItemId_ExistsReferrer_MClientItemList(MClientItemCQ sq) { return xkeepSQue("itemId_ExistsReferrer_MClientItemList", sq); }

    public Map<String, BColCQ> xdfgetItemId_NotExistsReferrer_BColList() { return xgetSQueMap("itemId_NotExistsReferrer_BColList"); }
    public String keepItemId_NotExistsReferrer_BColList(BColCQ sq) { return xkeepSQue("itemId_NotExistsReferrer_BColList", sq); }

    public Map<String, BColExtBaseCQ> xdfgetItemId_NotExistsReferrer_BColExtBaseList() { return xgetSQueMap("itemId_NotExistsReferrer_BColExtBaseList"); }
    public String keepItemId_NotExistsReferrer_BColExtBaseList(BColExtBaseCQ sq) { return xkeepSQue("itemId_NotExistsReferrer_BColExtBaseList", sq); }

    public Map<String, BColExtUserCQ> xdfgetItemId_NotExistsReferrer_BColExtUserList() { return xgetSQueMap("itemId_NotExistsReferrer_BColExtUserList"); }
    public String keepItemId_NotExistsReferrer_BColExtUserList(BColExtUserCQ sq) { return xkeepSQue("itemId_NotExistsReferrer_BColExtUserList", sq); }

    public Map<String, BItemRoleCQ> xdfgetItemId_NotExistsReferrer_BItemRoleList() { return xgetSQueMap("itemId_NotExistsReferrer_BItemRoleList"); }
    public String keepItemId_NotExistsReferrer_BItemRoleList(BItemRoleCQ sq) { return xkeepSQue("itemId_NotExistsReferrer_BItemRoleList", sq); }

    public Map<String, BItemValidCQ> xdfgetItemId_NotExistsReferrer_BItemValidAsOne() { return xgetSQueMap("itemId_NotExistsReferrer_BItemValidAsOne"); }
    public String keepItemId_NotExistsReferrer_BItemValidAsOne(BItemValidCQ sq) { return xkeepSQue("itemId_NotExistsReferrer_BItemValidAsOne", sq); }

    public Map<String, MCenterItemCQ> xdfgetItemId_NotExistsReferrer_MCenterItemList() { return xgetSQueMap("itemId_NotExistsReferrer_MCenterItemList"); }
    public String keepItemId_NotExistsReferrer_MCenterItemList(MCenterItemCQ sq) { return xkeepSQue("itemId_NotExistsReferrer_MCenterItemList", sq); }

    public Map<String, MClientItemCQ> xdfgetItemId_NotExistsReferrer_MClientItemList() { return xgetSQueMap("itemId_NotExistsReferrer_MClientItemList"); }
    public String keepItemId_NotExistsReferrer_MClientItemList(MClientItemCQ sq) { return xkeepSQue("itemId_NotExistsReferrer_MClientItemList", sq); }

    public Map<String, BColCQ> xdfgetItemId_SpecifyDerivedReferrer_BColList() { return xgetSQueMap("itemId_SpecifyDerivedReferrer_BColList"); }
    public String keepItemId_SpecifyDerivedReferrer_BColList(BColCQ sq) { return xkeepSQue("itemId_SpecifyDerivedReferrer_BColList", sq); }

    public Map<String, BColExtBaseCQ> xdfgetItemId_SpecifyDerivedReferrer_BColExtBaseList() { return xgetSQueMap("itemId_SpecifyDerivedReferrer_BColExtBaseList"); }
    public String keepItemId_SpecifyDerivedReferrer_BColExtBaseList(BColExtBaseCQ sq) { return xkeepSQue("itemId_SpecifyDerivedReferrer_BColExtBaseList", sq); }

    public Map<String, BColExtUserCQ> xdfgetItemId_SpecifyDerivedReferrer_BColExtUserList() { return xgetSQueMap("itemId_SpecifyDerivedReferrer_BColExtUserList"); }
    public String keepItemId_SpecifyDerivedReferrer_BColExtUserList(BColExtUserCQ sq) { return xkeepSQue("itemId_SpecifyDerivedReferrer_BColExtUserList", sq); }

    public Map<String, BItemRoleCQ> xdfgetItemId_SpecifyDerivedReferrer_BItemRoleList() { return xgetSQueMap("itemId_SpecifyDerivedReferrer_BItemRoleList"); }
    public String keepItemId_SpecifyDerivedReferrer_BItemRoleList(BItemRoleCQ sq) { return xkeepSQue("itemId_SpecifyDerivedReferrer_BItemRoleList", sq); }

    public Map<String, MCenterItemCQ> xdfgetItemId_SpecifyDerivedReferrer_MCenterItemList() { return xgetSQueMap("itemId_SpecifyDerivedReferrer_MCenterItemList"); }
    public String keepItemId_SpecifyDerivedReferrer_MCenterItemList(MCenterItemCQ sq) { return xkeepSQue("itemId_SpecifyDerivedReferrer_MCenterItemList", sq); }

    public Map<String, MClientItemCQ> xdfgetItemId_SpecifyDerivedReferrer_MClientItemList() { return xgetSQueMap("itemId_SpecifyDerivedReferrer_MClientItemList"); }
    public String keepItemId_SpecifyDerivedReferrer_MClientItemList(MClientItemCQ sq) { return xkeepSQue("itemId_SpecifyDerivedReferrer_MClientItemList", sq); }

    public Map<String, BColCQ> xdfgetItemId_QueryDerivedReferrer_BColList() { return xgetSQueMap("itemId_QueryDerivedReferrer_BColList"); }
    public String keepItemId_QueryDerivedReferrer_BColList(BColCQ sq) { return xkeepSQue("itemId_QueryDerivedReferrer_BColList", sq); }
    public Map<String, Object> xdfgetItemId_QueryDerivedReferrer_BColListParameter() { return xgetSQuePmMap("itemId_QueryDerivedReferrer_BColList"); }
    public String keepItemId_QueryDerivedReferrer_BColListParameter(Object pm) { return xkeepSQuePm("itemId_QueryDerivedReferrer_BColList", pm); }

    public Map<String, BColExtBaseCQ> xdfgetItemId_QueryDerivedReferrer_BColExtBaseList() { return xgetSQueMap("itemId_QueryDerivedReferrer_BColExtBaseList"); }
    public String keepItemId_QueryDerivedReferrer_BColExtBaseList(BColExtBaseCQ sq) { return xkeepSQue("itemId_QueryDerivedReferrer_BColExtBaseList", sq); }
    public Map<String, Object> xdfgetItemId_QueryDerivedReferrer_BColExtBaseListParameter() { return xgetSQuePmMap("itemId_QueryDerivedReferrer_BColExtBaseList"); }
    public String keepItemId_QueryDerivedReferrer_BColExtBaseListParameter(Object pm) { return xkeepSQuePm("itemId_QueryDerivedReferrer_BColExtBaseList", pm); }

    public Map<String, BColExtUserCQ> xdfgetItemId_QueryDerivedReferrer_BColExtUserList() { return xgetSQueMap("itemId_QueryDerivedReferrer_BColExtUserList"); }
    public String keepItemId_QueryDerivedReferrer_BColExtUserList(BColExtUserCQ sq) { return xkeepSQue("itemId_QueryDerivedReferrer_BColExtUserList", sq); }
    public Map<String, Object> xdfgetItemId_QueryDerivedReferrer_BColExtUserListParameter() { return xgetSQuePmMap("itemId_QueryDerivedReferrer_BColExtUserList"); }
    public String keepItemId_QueryDerivedReferrer_BColExtUserListParameter(Object pm) { return xkeepSQuePm("itemId_QueryDerivedReferrer_BColExtUserList", pm); }

    public Map<String, BItemRoleCQ> xdfgetItemId_QueryDerivedReferrer_BItemRoleList() { return xgetSQueMap("itemId_QueryDerivedReferrer_BItemRoleList"); }
    public String keepItemId_QueryDerivedReferrer_BItemRoleList(BItemRoleCQ sq) { return xkeepSQue("itemId_QueryDerivedReferrer_BItemRoleList", sq); }
    public Map<String, Object> xdfgetItemId_QueryDerivedReferrer_BItemRoleListParameter() { return xgetSQuePmMap("itemId_QueryDerivedReferrer_BItemRoleList"); }
    public String keepItemId_QueryDerivedReferrer_BItemRoleListParameter(Object pm) { return xkeepSQuePm("itemId_QueryDerivedReferrer_BItemRoleList", pm); }

    public Map<String, MCenterItemCQ> xdfgetItemId_QueryDerivedReferrer_MCenterItemList() { return xgetSQueMap("itemId_QueryDerivedReferrer_MCenterItemList"); }
    public String keepItemId_QueryDerivedReferrer_MCenterItemList(MCenterItemCQ sq) { return xkeepSQue("itemId_QueryDerivedReferrer_MCenterItemList", sq); }
    public Map<String, Object> xdfgetItemId_QueryDerivedReferrer_MCenterItemListParameter() { return xgetSQuePmMap("itemId_QueryDerivedReferrer_MCenterItemList"); }
    public String keepItemId_QueryDerivedReferrer_MCenterItemListParameter(Object pm) { return xkeepSQuePm("itemId_QueryDerivedReferrer_MCenterItemList", pm); }

    public Map<String, MClientItemCQ> xdfgetItemId_QueryDerivedReferrer_MClientItemList() { return xgetSQueMap("itemId_QueryDerivedReferrer_MClientItemList"); }
    public String keepItemId_QueryDerivedReferrer_MClientItemList(MClientItemCQ sq) { return xkeepSQue("itemId_QueryDerivedReferrer_MClientItemList", sq); }
    public Map<String, Object> xdfgetItemId_QueryDerivedReferrer_MClientItemListParameter() { return xgetSQuePmMap("itemId_QueryDerivedReferrer_MClientItemList"); }
    public String keepItemId_QueryDerivedReferrer_MClientItemListParameter(Object pm) { return xkeepSQuePm("itemId_QueryDerivedReferrer_MClientItemList", pm); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_ItemId_Asc() { regOBA("ITEM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_ItemId_Desc() { regOBD("ITEM_ID"); return this; }

    protected ConditionValue _screenId;
    public ConditionValue xdfgetScreenId()
    { if (_screenId == null) { _screenId = nCV(); }
      return _screenId; }
    protected ConditionValue xgetCValueScreenId() { return xdfgetScreenId(); }

    public Map<String, BScreenCQ> getScreenId_InScopeRelation_BScreen() { return xgetSQueMap("screenId_InScopeRelation_BScreen"); }
    public String keepScreenId_InScopeRelation_BScreen(BScreenCQ sq) { return xkeepSQue("screenId_InScopeRelation_BScreen", sq); }

    public Map<String, BScreenCQ> getScreenId_NotInScopeRelation_BScreen() { return xgetSQueMap("screenId_NotInScopeRelation_BScreen"); }
    public String keepScreenId_NotInScopeRelation_BScreen(BScreenCQ sq) { return xkeepSQue("screenId_NotInScopeRelation_BScreen", sq); }

    /**
     * Add order-by as ascend. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_ScreenId_Asc() { regOBA("SCREEN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCREEN_ID: {+UQ, IX, NotNull, bigint(19), FK to B_SCREEN}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_ScreenId_Desc() { regOBD("SCREEN_ID"); return this; }

    protected ConditionValue _itemCd;
    public ConditionValue xdfgetItemCd()
    { if (_itemCd == null) { _itemCd = nCV(); }
      return _itemCd; }
    protected ConditionValue xgetCValueItemCd() { return xdfgetItemCd(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_CD: {UQ+, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_ItemCd_Asc() { regOBA("ITEM_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_CD: {UQ+, NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_ItemCd_Desc() { regOBD("ITEM_CD"); return this; }

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
    public BsBItemCQ addOrderBy_DictId_Asc() { regOBA("DICT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_DictId_Desc() { regOBD("DICT_ID"); return this; }

    protected ConditionValue _itemType;
    public ConditionValue xdfgetItemType()
    { if (_itemType == null) { _itemType = nCV(); }
      return _itemType; }
    protected ConditionValue xgetCValueItemType() { return xdfgetItemType(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_ItemType_Asc() { regOBA("ITEM_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=ItemType}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_ItemType_Desc() { regOBD("ITEM_TYPE"); return this; }

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
    public BsBItemCQ addOrderBy_Visible_Asc() { regOBA("VISIBLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * VISIBLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Visible}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_Visible_Desc() { regOBD("VISIBLE"); return this; }

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
    public BsBItemCQ addOrderBy_Editable_Asc() { regOBA("EDITABLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * EDITABLE: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=Editable}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_Editable_Desc() { regOBD("EDITABLE"); return this; }

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
    public BsBItemCQ addOrderBy_TextAlign_Asc() { regOBA("TEXT_ALIGN"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEXT_ALIGN: {varchar(30), FK to B_CLASS_DTL, classification=TextAlign}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_TextAlign_Desc() { regOBD("TEXT_ALIGN"); return this; }

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
    public BsBItemCQ addOrderBy_Necessary_Asc() { regOBA("NECESSARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * NECESSARY: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=Necessary}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_Necessary_Desc() { regOBD("NECESSARY"); return this; }

    protected ConditionValue _displayRequired;
    public ConditionValue xdfgetDisplayRequired()
    { if (_displayRequired == null) { _displayRequired = nCV(); }
      return _displayRequired; }
    protected ConditionValue xgetCValueDisplayRequired() { return xdfgetDisplayRequired(); }

    /**
     * Add order-by as ascend. <br>
     * DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_DisplayRequired_Asc() { regOBA("DISPLAY_REQUIRED"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISPLAY_REQUIRED: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=DisplayRequired}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_DisplayRequired_Desc() { regOBD("DISPLAY_REQUIRED"); return this; }

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
    public BsBItemCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBItemCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBItemCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBItemCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBItemCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBItemCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBItemCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBItemCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBItemCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBItemCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBItemCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBItemCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BItemCQ bq = (BItemCQ)bqs;
        BItemCQ uq = (BItemCQ)uqs;
        if (bq.hasConditionQueryBScreen()) {
            uq.queryBScreen().reflectRelationOnUnionQuery(bq.queryBScreen(), uq.queryBScreen());
        }
        if (bq.hasConditionQueryBDict()) {
            uq.queryBDict().reflectRelationOnUnionQuery(bq.queryBDict(), uq.queryBDict());
        }
        if (bq.hasConditionQueryVDict()) {
            uq.xsetParameterMapVDict(bq.xdfgetParameterMapVDict());
            uq.xdfgetConditionQueryVDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVDict(), uq.xdfgetConditionQueryVDict());
        }
        if (bq.hasConditionQueryVHtDict()) {
            uq.xsetParameterMapVHtDict(bq.xdfgetParameterMapVHtDict());
            uq.xdfgetConditionQueryVHtDict().reflectRelationOnUnionQuery(bq.xdfgetConditionQueryVHtDict(), uq.xdfgetConditionQueryVHtDict());
        }
        if (bq.hasConditionQueryBClassDtlByItemType()) {
            uq.queryBClassDtlByItemType().reflectRelationOnUnionQuery(bq.queryBClassDtlByItemType(), uq.queryBClassDtlByItemType());
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
        if (bq.hasConditionQueryBClassDtlByDisplayRequired()) {
            uq.queryBClassDtlByDisplayRequired().reflectRelationOnUnionQuery(bq.queryBClassDtlByDisplayRequired(), uq.queryBClassDtlByDisplayRequired());
        }
        if (bq.hasConditionQueryBItemValidAsOne()) {
            uq.queryBItemValidAsOne().reflectRelationOnUnionQuery(bq.queryBItemValidAsOne(), uq.queryBItemValidAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_SCREEN by my SCREEN_ID, named 'BScreen'.
     * @return The instance of condition-query. (NotNull)
     */
    public BScreenCQ queryBScreen() {
        return xdfgetConditionQueryBScreen();
    }
    public BScreenCQ xdfgetConditionQueryBScreen() {
        String prop = "bScreen";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBScreen()); xsetupOuterJoinBScreen(); }
        return xgetQueRlMap(prop);
    }
    protected BScreenCQ xcreateQueryBScreen() {
        String nrp = xresolveNRP("B_ITEM", "bScreen"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BScreenCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bScreen", nrp);
    }
    protected void xsetupOuterJoinBScreen() { xregOutJo("bScreen"); }
    public boolean hasConditionQueryBScreen() { return xhasQueRlMap("bScreen"); }

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
        String nrp = xresolveNRP("B_ITEM", "bDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bDict", nrp);
    }
    protected void xsetupOuterJoinBDict() { xregOutJo("bDict"); }
    public boolean hasConditionQueryBDict() { return xhasQueRlMap("bDict"); }

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
        String nrp = xresolveNRP("B_ITEM", "vDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("B_ITEM", "vHtDict"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VHtDictCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vHtDict", nrp);
    }
    protected void xsetupOuterJoinVHtDict() { xregOutJo("vHtDict"); }
    public boolean hasConditionQueryVHtDict() { return xhasQueRlMap("vHtDict"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my ITEM_TYPE, named 'BClassDtlByItemType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByItemType() {
        return xdfgetConditionQueryBClassDtlByItemType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByItemType() {
        String prop = "bClassDtlByItemType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByItemType()); xsetupOuterJoinBClassDtlByItemType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByItemType() {
        String nrp = xresolveNRP("B_ITEM", "bClassDtlByItemType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByItemType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByItemType() { xregOutJo("bClassDtlByItemType"); }
    public boolean hasConditionQueryBClassDtlByItemType() { return xhasQueRlMap("bClassDtlByItemType"); }

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
        String nrp = xresolveNRP("B_ITEM", "bClassDtlByVisible"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("B_ITEM", "bClassDtlByEditable"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("B_ITEM", "bClassDtlByTextAlign"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("B_ITEM", "bClassDtlByNecessary"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByNecessary", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByNecessary() { xregOutJo("bClassDtlByNecessary"); }
    public boolean hasConditionQueryBClassDtlByNecessary() { return xhasQueRlMap("bClassDtlByNecessary"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my DISPLAY_REQUIRED, named 'BClassDtlByDisplayRequired'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDisplayRequired() {
        return xdfgetConditionQueryBClassDtlByDisplayRequired();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDisplayRequired() {
        String prop = "bClassDtlByDisplayRequired";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDisplayRequired()); xsetupOuterJoinBClassDtlByDisplayRequired(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDisplayRequired() {
        String nrp = xresolveNRP("B_ITEM", "bClassDtlByDisplayRequired"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDisplayRequired", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDisplayRequired() { xregOutJo("bClassDtlByDisplayRequired"); }
    public boolean hasConditionQueryBClassDtlByDisplayRequired() { return xhasQueRlMap("bClassDtlByDisplayRequired"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_ITEM_VALID by ITEM_ID, named 'BItemValidAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public BItemValidCQ queryBItemValidAsOne() { return xdfgetConditionQueryBItemValidAsOne(); }
    public BItemValidCQ xdfgetConditionQueryBItemValidAsOne() {
        String prop = "bItemValidAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBItemValidAsOne()); xsetupOuterJoinBItemValidAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected BItemValidCQ xcreateQueryBItemValidAsOne() {
        String nrp = xresolveNRP("B_ITEM", "bItemValidAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BItemValidCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bItemValidAsOne", nrp);
    }
    protected void xsetupOuterJoinBItemValidAsOne() { xregOutJo("bItemValidAsOne"); }
    public boolean hasConditionQueryBItemValidAsOne() { return xhasQueRlMap("bItemValidAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("vDict".equalsIgnoreCase(property)) { return _parameterMapVDict; }
        if ("vHtDict".equalsIgnoreCase(property)) { return _parameterMapVHtDict; }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BItemCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BItemCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BItemCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BItemCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BItemCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BItemCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BItemCQ> _myselfExistsMap;
    public Map<String, BItemCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BItemCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BItemCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BItemCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BItemCB.class.getName(); }
    protected String xCQ() { return BItemCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
