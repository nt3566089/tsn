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
 * The base condition-query of T_YTRSO.
 * @author DBFlute(AutoGenerator)
 */
public class BsTYtrsoCQ extends AbstractBsTYtrsoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TYtrsoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTYtrsoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_YTRSO) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TYtrsoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TYtrsoCIQ xcreateCIQ() {
        TYtrsoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TYtrsoCIQ xnewCIQ() {
        return new TYtrsoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_YTRSO on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TYtrsoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TYtrsoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trsrId;
    public ConditionValue xdfgetTrsrId()
    { if (_trsrId == null) { _trsrId = nCV(); }
      return _trsrId; }
    protected ConditionValue xgetCValueTrsrId() { return xdfgetTrsrId(); }

    public Map<String, TYtrsodetailCQ> xdfgetTrsrId_ExistsReferrer_TYtrsodetailList() { return xgetSQueMap("trsrId_ExistsReferrer_TYtrsodetailList"); }
    public String keepTrsrId_ExistsReferrer_TYtrsodetailList(TYtrsodetailCQ sq) { return xkeepSQue("trsrId_ExistsReferrer_TYtrsodetailList", sq); }

    public Map<String, TYtrsodetailCQ> xdfgetTrsrId_NotExistsReferrer_TYtrsodetailList() { return xgetSQueMap("trsrId_NotExistsReferrer_TYtrsodetailList"); }
    public String keepTrsrId_NotExistsReferrer_TYtrsodetailList(TYtrsodetailCQ sq) { return xkeepSQue("trsrId_NotExistsReferrer_TYtrsodetailList", sq); }

    public Map<String, TYtrsodetailCQ> xdfgetTrsrId_SpecifyDerivedReferrer_TYtrsodetailList() { return xgetSQueMap("trsrId_SpecifyDerivedReferrer_TYtrsodetailList"); }
    public String keepTrsrId_SpecifyDerivedReferrer_TYtrsodetailList(TYtrsodetailCQ sq) { return xkeepSQue("trsrId_SpecifyDerivedReferrer_TYtrsodetailList", sq); }

    public Map<String, TYtrsodetailCQ> xdfgetTrsrId_QueryDerivedReferrer_TYtrsodetailList() { return xgetSQueMap("trsrId_QueryDerivedReferrer_TYtrsodetailList"); }
    public String keepTrsrId_QueryDerivedReferrer_TYtrsodetailList(TYtrsodetailCQ sq) { return xkeepSQue("trsrId_QueryDerivedReferrer_TYtrsodetailList", sq); }
    public Map<String, Object> xdfgetTrsrId_QueryDerivedReferrer_TYtrsodetailListParameter() { return xgetSQuePmMap("trsrId_QueryDerivedReferrer_TYtrsodetailList"); }
    public String keepTrsrId_QueryDerivedReferrer_TYtrsodetailListParameter(Object pm) { return xkeepSQuePm("trsrId_QueryDerivedReferrer_TYtrsodetailList", pm); }

    /**
     * Add order-by as ascend. <br>
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_TrsrId_Asc() { regOBA("TRSR_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSR_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_TrsrId_Desc() { regOBD("TRSR_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _soKey;
    public ConditionValue xdfgetSoKey()
    { if (_soKey == null) { _soKey = nCV(); }
      return _soKey; }
    protected ConditionValue xgetCValueSoKey() { return xdfgetSoKey(); }

    /**
     * Add order-by as ascend. <br>
     * SO_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_SoKey_Asc() { regOBA("SO_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SO_KEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_SoKey_Desc() { regOBD("SO_KEY"); return this; }

    protected ConditionValue _srStatus;
    public ConditionValue xdfgetSrStatus()
    { if (_srStatus == null) { _srStatus = nCV(); }
      return _srStatus; }
    protected ConditionValue xgetCValueSrStatus() { return xdfgetSrStatus(); }

    /**
     * Add order-by as ascend. <br>
     * SR_STATUS: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_SrStatus_Asc() { regOBA("SR_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SR_STATUS: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_SrStatus_Desc() { regOBD("SR_STATUS"); return this; }

    protected ConditionValue _restockNumber;
    public ConditionValue xdfgetRestockNumber()
    { if (_restockNumber == null) { _restockNumber = nCV(); }
      return _restockNumber; }
    protected ConditionValue xgetCValueRestockNumber() { return xdfgetRestockNumber(); }

    /**
     * Add order-by as ascend. <br>
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_RestockNumber_Asc() { regOBA("RESTOCK_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESTOCK_NUMBER: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_RestockNumber_Desc() { regOBD("RESTOCK_NUMBER"); return this; }

    protected ConditionValue _restockKbn;
    public ConditionValue xdfgetRestockKbn()
    { if (_restockKbn == null) { _restockKbn = nCV(); }
      return _restockKbn; }
    protected ConditionValue xgetCValueRestockKbn() { return xdfgetRestockKbn(); }

    /**
     * Add order-by as ascend. <br>
     * RESTOCK_KBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_RestockKbn_Asc() { regOBA("RESTOCK_KBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESTOCK_KBN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_RestockKbn_Desc() { regOBD("RESTOCK_KBN"); return this; }

    protected ConditionValue _sortingRackNo;
    public ConditionValue xdfgetSortingRackNo()
    { if (_sortingRackNo == null) { _sortingRackNo = nCV(); }
      return _sortingRackNo; }
    protected ConditionValue xgetCValueSortingRackNo() { return xdfgetSortingRackNo(); }

    /**
     * Add order-by as ascend. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_SortingRackNo_Asc() { regOBA("SORTING_RACK_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTING_RACK_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_SortingRackNo_Desc() { regOBD("SORTING_RACK_NO"); return this; }

    protected ConditionValue _restockSortKey;
    public ConditionValue xdfgetRestockSortKey()
    { if (_restockSortKey == null) { _restockSortKey = nCV(); }
      return _restockSortKey; }
    protected ConditionValue xgetCValueRestockSortKey() { return xdfgetRestockSortKey(); }

    /**
     * Add order-by as ascend. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_RestockSortKey_Asc() { regOBA("RESTOCK_SORT_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RESTOCK_SORT_KEY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_RestockSortKey_Desc() { regOBD("RESTOCK_SORT_KEY"); return this; }

    protected ConditionValue _shipSchDate;
    public ConditionValue xdfgetShipSchDate()
    { if (_shipSchDate == null) { _shipSchDate = nCV(); }
      return _shipSchDate; }
    protected ConditionValue xgetCValueShipSchDate() { return xdfgetShipSchDate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_ShipSchDate_Asc() { regOBA("SHIP_SCH_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_SCH_DATE: {IX, NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_ShipSchDate_Desc() { regOBD("SHIP_SCH_DATE"); return this; }

    protected ConditionValue _shipDate;
    public ConditionValue xdfgetShipDate()
    { if (_shipDate == null) { _shipDate = nCV(); }
      return _shipDate; }
    protected ConditionValue xgetCValueShipDate() { return xdfgetShipDate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_DATE: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_ShipDate_Asc() { regOBA("SHIP_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_DATE: {IX, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_ShipDate_Desc() { regOBD("SHIP_DATE"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _sortRestockFlg;
    public ConditionValue xdfgetSortRestockFlg()
    { if (_sortRestockFlg == null) { _sortRestockFlg = nCV(); }
      return _sortRestockFlg; }
    protected ConditionValue xgetCValueSortRestockFlg() { return xdfgetSortRestockFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_SortRestockFlg_Asc() { regOBA("SORT_RESTOCK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_RESTOCK_FLG: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_SortRestockFlg_Desc() { regOBD("SORT_RESTOCK_FLG"); return this; }

    protected ConditionValue _deliveryCenterCd;
    public ConditionValue xdfgetDeliveryCenterCd()
    { if (_deliveryCenterCd == null) { _deliveryCenterCd = nCV(); }
      return _deliveryCenterCd; }
    protected ConditionValue xgetCValueDeliveryCenterCd() { return xdfgetDeliveryCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_DeliveryCenterCd_Asc() { regOBA("DELIVERY_CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_DeliveryCenterCd_Desc() { regOBD("DELIVERY_CENTER_CD"); return this; }

    protected ConditionValue _lineBlock;
    public ConditionValue xdfgetLineBlock()
    { if (_lineBlock == null) { _lineBlock = nCV(); }
      return _lineBlock; }
    protected ConditionValue xgetCValueLineBlock() { return xdfgetLineBlock(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_BLOCK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_LineBlock_Asc() { regOBA("LINE_BLOCK"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_BLOCK: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_LineBlock_Desc() { regOBD("LINE_BLOCK"); return this; }

    protected ConditionValue _deliveryDirection;
    public ConditionValue xdfgetDeliveryDirection()
    { if (_deliveryDirection == null) { _deliveryDirection = nCV(); }
      return _deliveryDirection; }
    protected ConditionValue xgetCValueDeliveryDirection() { return xdfgetDeliveryDirection(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_DeliveryDirection_Asc() { regOBA("DELIVERY_DIRECTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_DIRECTION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_DeliveryDirection_Desc() { regOBD("DELIVERY_DIRECTION"); return this; }

    protected ConditionValue _pickBatchKey;
    public ConditionValue xdfgetPickBatchKey()
    { if (_pickBatchKey == null) { _pickBatchKey = nCV(); }
      return _pickBatchKey; }
    protected ConditionValue xgetCValuePickBatchKey() { return xdfgetPickBatchKey(); }

    /**
     * Add order-by as ascend. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_PickBatchKey_Asc() { regOBA("PICK_BATCH_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_PickBatchKey_Desc() { regOBD("PICK_BATCH_KEY"); return this; }

    protected ConditionValue _picklistComment;
    public ConditionValue xdfgetPicklistComment()
    { if (_picklistComment == null) { _picklistComment = nCV(); }
      return _picklistComment; }
    protected ConditionValue xgetCValuePicklistComment() { return xdfgetPicklistComment(); }

    /**
     * Add order-by as ascend. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_PicklistComment_Asc() { regOBA("PICKLIST_COMMENT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKLIST_COMMENT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_PicklistComment_Desc() { regOBD("PICKLIST_COMMENT"); return this; }

    protected ConditionValue _fromPicklistNo;
    public ConditionValue xdfgetFromPicklistNo()
    { if (_fromPicklistNo == null) { _fromPicklistNo = nCV(); }
      return _fromPicklistNo; }
    protected ConditionValue xgetCValueFromPicklistNo() { return xdfgetFromPicklistNo(); }

    /**
     * Add order-by as ascend. <br>
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_FromPicklistNo_Asc() { regOBA("FROM_PICKLIST_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FROM_PICKLIST_NO: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_FromPicklistNo_Desc() { regOBD("FROM_PICKLIST_NO"); return this; }

    protected ConditionValue _toPicklistNo;
    public ConditionValue xdfgetToPicklistNo()
    { if (_toPicklistNo == null) { _toPicklistNo = nCV(); }
      return _toPicklistNo; }
    protected ConditionValue xgetCValueToPicklistNo() { return xdfgetToPicklistNo(); }

    /**
     * Add order-by as ascend. <br>
     * TO_PICKLIST_NO: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_ToPicklistNo_Asc() { regOBA("TO_PICKLIST_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TO_PICKLIST_NO: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_ToPicklistNo_Desc() { regOBD("TO_PICKLIST_NO"); return this; }

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
    public BsTYtrsoCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTYtrsoCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTYtrsoCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTYtrsoCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTYtrsoCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTYtrsoCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTYtrsoCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTYtrsoCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTYtrsoCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTYtrsoCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTYtrsoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTYtrsoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TYtrsoCQ bq = (TYtrsoCQ)bqs;
        TYtrsoCQ uq = (TYtrsoCQ)uqs;
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("T_YTRSO", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("T_YTRSO", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TYtrsoCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TYtrsoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TYtrsoCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TYtrsoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TYtrsoCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TYtrsoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TYtrsoCQ> _myselfExistsMap;
    public Map<String, TYtrsoCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TYtrsoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TYtrsoCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TYtrsoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TYtrsoCB.class.getName(); }
    protected String xCQ() { return TYtrsoCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
