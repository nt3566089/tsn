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
 * The base condition-query of E_LOCATION.
 * @author DBFlute(AutoGenerator)
 */
public class BsELocationCQ extends AbstractBsELocationCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ELocationCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsELocationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_LOCATION) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ELocationCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ELocationCIQ xcreateCIQ() {
        ELocationCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ELocationCIQ xnewCIQ() {
        return new ELocationCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_LOCATION on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ELocationCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ELocationCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

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
    public BsELocationCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

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
    public BsELocationCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

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
    public BsELocationCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

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
    public BsELocationCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsELocationCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _locationNm;
    public ConditionValue xdfgetLocationNm()
    { if (_locationNm == null) { _locationNm = nCV(); }
      return _locationNm; }
    protected ConditionValue xgetCValueLocationNm() { return xdfgetLocationNm(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_LocationNm_Asc() { regOBA("LOCATION_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_LocationNm_Desc() { regOBD("LOCATION_NM"); return this; }

    protected ConditionValue _warehouseCd;
    public ConditionValue xdfgetWarehouseCd()
    { if (_warehouseCd == null) { _warehouseCd = nCV(); }
      return _warehouseCd; }
    protected ConditionValue xgetCValueWarehouseCd() { return xdfgetWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

    protected ConditionValue _zoneCd;
    public ConditionValue xdfgetZoneCd()
    { if (_zoneCd == null) { _zoneCd = nCV(); }
      return _zoneCd; }
    protected ConditionValue xgetCValueZoneCd() { return xdfgetZoneCd(); }

    /**
     * Add order-by as ascend. <br>
     * ZONE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ZoneCd_Asc() { regOBA("ZONE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ZoneCd_Desc() { regOBD("ZONE_CD"); return this; }

    protected ConditionValue _locationType;
    public ConditionValue xdfgetLocationType()
    { if (_locationType == null) { _locationType = nCV(); }
      return _locationType; }
    protected ConditionValue xgetCValueLocationType() { return xdfgetLocationType(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_LocationType_Asc() { regOBA("LOCATION_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_LocationType_Desc() { regOBD("LOCATION_TYPE"); return this; }

    protected ConditionValue _pickingLocationFlg;
    public ConditionValue xdfgetPickingLocationFlg()
    { if (_pickingLocationFlg == null) { _pickingLocationFlg = nCV(); }
      return _pickingLocationFlg; }
    protected ConditionValue xgetCValuePickingLocationFlg() { return xdfgetPickingLocationFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_PickingLocationFlg_Asc() { regOBA("PICKING_LOCATION_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_LOCATION_FLG: {varchar(255), default=[1]}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_PickingLocationFlg_Desc() { regOBD("PICKING_LOCATION_FLG"); return this; }

    protected ConditionValue _allocNgFlg;
    public ConditionValue xdfgetAllocNgFlg()
    { if (_allocNgFlg == null) { _allocNgFlg = nCV(); }
      return _allocNgFlg; }
    protected ConditionValue xgetCValueAllocNgFlg() { return xdfgetAllocNgFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_AllocNgFlg_Asc() { regOBA("ALLOC_NG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_NG_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_AllocNgFlg_Desc() { regOBD("ALLOC_NG_FLG"); return this; }

    protected ConditionValue _pickingOrder;
    public ConditionValue xdfgetPickingOrder()
    { if (_pickingOrder == null) { _pickingOrder = nCV(); }
      return _pickingOrder; }
    protected ConditionValue xgetCValuePickingOrder() { return xdfgetPickingOrder(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_PickingOrder_Asc() { regOBA("PICKING_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_PickingOrder_Desc() { regOBD("PICKING_ORDER"); return this; }

    protected ConditionValue _allocOrder;
    public ConditionValue xdfgetAllocOrder()
    { if (_allocOrder == null) { _allocOrder = nCV(); }
      return _allocOrder; }
    protected ConditionValue xgetCValueAllocOrder() { return xdfgetAllocOrder(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_AllocOrder_Asc() { regOBA("ALLOC_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_AllocOrder_Desc() { regOBD("ALLOC_ORDER"); return this; }

    protected ConditionValue _clientCd;
    public ConditionValue xdfgetClientCd()
    { if (_clientCd == null) { _clientCd = nCV(); }
      return _clientCd; }
    protected ConditionValue xgetCValueClientCd() { return xdfgetClientCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

    protected ConditionValue _replenishProductCd;
    public ConditionValue xdfgetReplenishProductCd()
    { if (_replenishProductCd == null) { _replenishProductCd = nCV(); }
      return _replenishProductCd; }
    protected ConditionValue xgetCValueReplenishProductCd() { return xdfgetReplenishProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ReplenishProductCd_Asc() { regOBA("REPLENISH_PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ReplenishProductCd_Desc() { regOBD("REPLENISH_PRODUCT_CD"); return this; }

    protected ConditionValue _replenishStockTypeCd;
    public ConditionValue xdfgetReplenishStockTypeCd()
    { if (_replenishStockTypeCd == null) { _replenishStockTypeCd = nCV(); }
      return _replenishStockTypeCd; }
    protected ConditionValue xgetCValueReplenishStockTypeCd() { return xdfgetReplenishStockTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ReplenishStockTypeCd_Asc() { regOBA("REPLENISH_STOCK_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_STOCK_TYPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ReplenishStockTypeCd_Desc() { regOBD("REPLENISH_STOCK_TYPE_CD"); return this; }

    protected ConditionValue _replenishDepositCd;
    public ConditionValue xdfgetReplenishDepositCd()
    { if (_replenishDepositCd == null) { _replenishDepositCd = nCV(); }
      return _replenishDepositCd; }
    protected ConditionValue xgetCValueReplenishDepositCd() { return xdfgetReplenishDepositCd(); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ReplenishDepositCd_Asc() { regOBA("REPLENISH_DEPOSIT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_DEPOSIT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ReplenishDepositCd_Desc() { regOBD("REPLENISH_DEPOSIT_CD"); return this; }

    protected ConditionValue _replenishPNum;
    public ConditionValue xdfgetReplenishPNum()
    { if (_replenishPNum == null) { _replenishPNum = nCV(); }
      return _replenishPNum; }
    protected ConditionValue xgetCValueReplenishPNum() { return xdfgetReplenishPNum(); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ReplenishPNum_Asc() { regOBA("REPLENISH_P_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_P_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ReplenishPNum_Desc() { regOBD("REPLENISH_P_NUM"); return this; }

    protected ConditionValue _replenishPProductShapeCd;
    public ConditionValue xdfgetReplenishPProductShapeCd()
    { if (_replenishPProductShapeCd == null) { _replenishPProductShapeCd = nCV(); }
      return _replenishPProductShapeCd; }
    protected ConditionValue xgetCValueReplenishPProductShapeCd() { return xdfgetReplenishPProductShapeCd(); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ReplenishPProductShapeCd_Asc() { regOBA("REPLENISH_P_PRODUCT_SHAPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_P_PRODUCT_SHAPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ReplenishPProductShapeCd_Desc() { regOBD("REPLENISH_P_PRODUCT_SHAPE_CD"); return this; }

    protected ConditionValue _maxStoreNum;
    public ConditionValue xdfgetMaxStoreNum()
    { if (_maxStoreNum == null) { _maxStoreNum = nCV(); }
      return _maxStoreNum; }
    protected ConditionValue xgetCValueMaxStoreNum() { return xdfgetMaxStoreNum(); }

    /**
     * Add order-by as ascend. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_MaxStoreNum_Asc() { regOBA("MAX_STORE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_MaxStoreNum_Desc() { regOBD("MAX_STORE_NUM"); return this; }

    protected ConditionValue _maxStoreProductShapeCd;
    public ConditionValue xdfgetMaxStoreProductShapeCd()
    { if (_maxStoreProductShapeCd == null) { _maxStoreProductShapeCd = nCV(); }
      return _maxStoreProductShapeCd; }
    protected ConditionValue xgetCValueMaxStoreProductShapeCd() { return xdfgetMaxStoreProductShapeCd(); }

    /**
     * Add order-by as ascend. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_MaxStoreProductShapeCd_Asc() { regOBA("MAX_STORE_PRODUCT_SHAPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_STORE_PRODUCT_SHAPE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_MaxStoreProductShapeCd_Desc() { regOBD("MAX_STORE_PRODUCT_SHAPE_CD"); return this; }

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
    public BsELocationCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsELocationCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsELocationCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsELocationCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsELocationCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsELocationCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsELocationCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsELocationCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsELocationCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsELocationCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsELocationCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsELocationCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ELocationCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ELocationCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ELocationCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ELocationCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ELocationCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ELocationCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ELocationCQ> _myselfExistsMap;
    public Map<String, ELocationCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ELocationCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ELocationCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ELocationCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ELocationCB.class.getName(); }
    protected String xCQ() { return ELocationCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
