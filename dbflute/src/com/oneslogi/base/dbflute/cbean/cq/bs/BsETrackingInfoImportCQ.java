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
 * The base condition-query of E_TRACKING_INFO_IMPORT.
 * @author DBFlute(AutoGenerator)
 */
public class BsETrackingInfoImportCQ extends AbstractBsETrackingInfoImportCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ETrackingInfoImportCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsETrackingInfoImportCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_TRACKING_INFO_IMPORT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ETrackingInfoImportCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ETrackingInfoImportCIQ xcreateCIQ() {
        ETrackingInfoImportCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ETrackingInfoImportCIQ xnewCIQ() {
        return new ETrackingInfoImportCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_TRACKING_INFO_IMPORT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ETrackingInfoImportCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ETrackingInfoImportCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trackingInfoImportId;
    public ConditionValue xdfgetTrackingInfoImportId()
    { if (_trackingInfoImportId == null) { _trackingInfoImportId = nCV(); }
      return _trackingInfoImportId; }
    protected ConditionValue xgetCValueTrackingInfoImportId() { return xdfgetTrackingInfoImportId(); }

    /**
     * Add order-by as ascend. <br>
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_TrackingInfoImportId_Asc() { regOBA("TRACKING_INFO_IMPORT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_TrackingInfoImportId_Desc() { regOBD("TRACKING_INFO_IMPORT_ID"); return this; }

    protected ConditionValue _symbolposkey;
    public ConditionValue xdfgetSymbolposkey()
    { if (_symbolposkey == null) { _symbolposkey = nCV(); }
      return _symbolposkey; }
    protected ConditionValue xgetCValueSymbolposkey() { return xdfgetSymbolposkey(); }

    /**
     * Add order-by as ascend. <br>
     * SYMBOLPOSKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Symbolposkey_Asc() { regOBA("SYMBOLPOSKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYMBOLPOSKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Symbolposkey_Desc() { regOBD("SYMBOLPOSKEY"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _warehouseSname;
    public ConditionValue xdfgetWarehouseSname()
    { if (_warehouseSname == null) { _warehouseSname = nCV(); }
      return _warehouseSname; }
    protected ConditionValue xgetCValueWarehouseSname() { return xdfgetWarehouseSname(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_WarehouseSname_Asc() { regOBA("WAREHOUSE_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_WarehouseSname_Desc() { regOBD("WAREHOUSE_SNAME"); return this; }

    protected ConditionValue _factorySname;
    public ConditionValue xdfgetFactorySname()
    { if (_factorySname == null) { _factorySname = nCV(); }
      return _factorySname; }
    protected ConditionValue xgetCValueFactorySname() { return xdfgetFactorySname(); }

    /**
     * Add order-by as ascend. <br>
     * FACTORY_SNAME: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_FactorySname_Asc() { regOBA("FACTORY_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * FACTORY_SNAME: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_FactorySname_Desc() { regOBD("FACTORY_SNAME"); return this; }

    protected ConditionValue _factorycd;
    public ConditionValue xdfgetFactorycd()
    { if (_factorycd == null) { _factorycd = nCV(); }
      return _factorycd; }
    protected ConditionValue xgetCValueFactorycd() { return xdfgetFactorycd(); }

    /**
     * Add order-by as ascend. <br>
     * FACTORYCD: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Factorycd_Asc() { regOBA("FACTORYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FACTORYCD: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Factorycd_Desc() { regOBD("FACTORYCD"); return this; }

    protected ConditionValue _itemcdCase;
    public ConditionValue xdfgetItemcdCase()
    { if (_itemcdCase == null) { _itemcdCase = nCV(); }
      return _itemcdCase; }
    protected ConditionValue xgetCValueItemcdCase() { return xdfgetItemcdCase(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD_CASE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ItemcdCase_Asc() { regOBA("ITEMCD_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD_CASE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ItemcdCase_Desc() { regOBD("ITEMCD_CASE"); return this; }

    protected ConditionValue _itemSnameCase;
    public ConditionValue xdfgetItemSnameCase()
    { if (_itemSnameCase == null) { _itemSnameCase = nCV(); }
      return _itemSnameCase; }
    protected ConditionValue xgetCValueItemSnameCase() { return xdfgetItemSnameCase(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_SNAME_CASE: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ItemSnameCase_Asc() { regOBA("ITEM_SNAME_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_SNAME_CASE: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ItemSnameCase_Desc() { regOBD("ITEM_SNAME_CASE"); return this; }

    protected ConditionValue _itemcdWh;
    public ConditionValue xdfgetItemcdWh()
    { if (_itemcdWh == null) { _itemcdWh = nCV(); }
      return _itemcdWh; }
    protected ConditionValue xgetCValueItemcdWh() { return xdfgetItemcdWh(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD_WH: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ItemcdWh_Asc() { regOBA("ITEMCD_WH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD_WH: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ItemcdWh_Desc() { regOBD("ITEMCD_WH"); return this; }

    protected ConditionValue _itemSnameWh;
    public ConditionValue xdfgetItemSnameWh()
    { if (_itemSnameWh == null) { _itemSnameWh = nCV(); }
      return _itemSnameWh; }
    protected ConditionValue xgetCValueItemSnameWh() { return xdfgetItemSnameWh(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_SNAME_WH: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ItemSnameWh_Asc() { regOBA("ITEM_SNAME_WH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_SNAME_WH: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ItemSnameWh_Desc() { regOBD("ITEM_SNAME_WH"); return this; }

    protected ConditionValue _rcvkey;
    public ConditionValue xdfgetRcvkey()
    { if (_rcvkey == null) { _rcvkey = nCV(); }
      return _rcvkey; }
    protected ConditionValue xgetCValueRcvkey() { return xdfgetRcvkey(); }

    /**
     * Add order-by as ascend. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Rcvkey_Asc() { regOBA("RCVKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Rcvkey_Desc() { regOBD("RCVKEY"); return this; }

    protected ConditionValue _machineno;
    public ConditionValue xdfgetMachineno()
    { if (_machineno == null) { _machineno = nCV(); }
      return _machineno; }
    protected ConditionValue xgetCValueMachineno() { return xdfgetMachineno(); }

    /**
     * Add order-by as ascend. <br>
     * MACHINENO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Machineno_Asc() { regOBA("MACHINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MACHINENO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Machineno_Desc() { regOBD("MACHINENO"); return this; }

    protected ConditionValue _createno;
    public ConditionValue xdfgetCreateno()
    { if (_createno == null) { _createno = nCV(); }
      return _createno; }
    protected ConditionValue xgetCValueCreateno() { return xdfgetCreateno(); }

    /**
     * Add order-by as ascend. <br>
     * CREATENO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Createno_Asc() { regOBA("CREATENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATENO: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Createno_Desc() { regOBD("CREATENO"); return this; }

    protected ConditionValue _limitdatenow;
    public ConditionValue xdfgetLimitdatenow()
    { if (_limitdatenow == null) { _limitdatenow = nCV(); }
      return _limitdatenow; }
    protected ConditionValue xgetCValueLimitdatenow() { return xdfgetLimitdatenow(); }

    /**
     * Add order-by as ascend. <br>
     * LIMITDATENOW: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Limitdatenow_Asc() { regOBA("LIMITDATENOW"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITDATENOW: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Limitdatenow_Desc() { regOBD("LIMITDATENOW"); return this; }

    protected ConditionValue _designcdCase;
    public ConditionValue xdfgetDesigncdCase()
    { if (_designcdCase == null) { _designcdCase = nCV(); }
      return _designcdCase; }
    protected ConditionValue xgetCValueDesigncdCase() { return xdfgetDesigncdCase(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGNCD_CASE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_DesigncdCase_Asc() { regOBA("DESIGNCD_CASE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGNCD_CASE: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_DesigncdCase_Desc() { regOBD("DESIGNCD_CASE"); return this; }

    protected ConditionValue _lot1;
    public ConditionValue xdfgetLot1()
    { if (_lot1 == null) { _lot1 = nCV(); }
      return _lot1; }
    protected ConditionValue xgetCValueLot1() { return xdfgetLot1(); }

    /**
     * Add order-by as ascend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

    protected ConditionValue _manufacturecd;
    public ConditionValue xdfgetManufacturecd()
    { if (_manufacturecd == null) { _manufacturecd = nCV(); }
      return _manufacturecd; }
    protected ConditionValue xgetCValueManufacturecd() { return xdfgetManufacturecd(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURECD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Manufacturecd_Asc() { regOBA("MANUFACTURECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURECD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Manufacturecd_Desc() { regOBD("MANUFACTURECD"); return this; }

    protected ConditionValue _otherlot1;
    public ConditionValue xdfgetOtherlot1()
    { if (_otherlot1 == null) { _otherlot1 = nCV(); }
      return _otherlot1; }
    protected ConditionValue xgetCValueOtherlot1() { return xdfgetOtherlot1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Otherlot1_Asc() { regOBA("OTHERLOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Otherlot1_Desc() { regOBD("OTHERLOT1"); return this; }

    protected ConditionValue _casecreatetype;
    public ConditionValue xdfgetCasecreatetype()
    { if (_casecreatetype == null) { _casecreatetype = nCV(); }
      return _casecreatetype; }
    protected ConditionValue xgetCValueCasecreatetype() { return xdfgetCasecreatetype(); }

    /**
     * Add order-by as ascend. <br>
     * CASECREATETYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Casecreatetype_Asc() { regOBA("CASECREATETYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASECREATETYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Casecreatetype_Desc() { regOBD("CASECREATETYPE"); return this; }

    protected ConditionValue _casecreatetypeNm;
    public ConditionValue xdfgetCasecreatetypeNm()
    { if (_casecreatetypeNm == null) { _casecreatetypeNm = nCV(); }
      return _casecreatetypeNm; }
    protected ConditionValue xgetCValueCasecreatetypeNm() { return xdfgetCasecreatetypeNm(); }

    /**
     * Add order-by as ascend. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_CasecreatetypeNm_Asc() { regOBA("CASECREATETYPE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_CasecreatetypeNm_Desc() { regOBD("CASECREATETYPE_NM"); return this; }

    protected ConditionValue _receivedate;
    public ConditionValue xdfgetReceivedate()
    { if (_receivedate == null) { _receivedate = nCV(); }
      return _receivedate; }
    protected ConditionValue xgetCValueReceivedate() { return xdfgetReceivedate(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Receivedate_Asc() { regOBA("RECEIVEDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVEDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Receivedate_Desc() { regOBD("RECEIVEDATE"); return this; }

    protected ConditionValue _arrivalportdate;
    public ConditionValue xdfgetArrivalportdate()
    { if (_arrivalportdate == null) { _arrivalportdate = nCV(); }
      return _arrivalportdate; }
    protected ConditionValue xgetCValueArrivalportdate() { return xdfgetArrivalportdate(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Arrivalportdate_Asc() { regOBA("ARRIVALPORTDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Arrivalportdate_Desc() { regOBD("ARRIVALPORTDATE"); return this; }

    protected ConditionValue _shipname;
    public ConditionValue xdfgetShipname()
    { if (_shipname == null) { _shipname = nCV(); }
      return _shipname; }
    protected ConditionValue xgetCValueShipname() { return xdfgetShipname(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Shipname_Asc() { regOBA("SHIPNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Shipname_Desc() { regOBD("SHIPNAME"); return this; }

    protected ConditionValue _initnum;
    public ConditionValue xdfgetInitnum()
    { if (_initnum == null) { _initnum = nCV(); }
      return _initnum; }
    protected ConditionValue xgetCValueInitnum() { return xdfgetInitnum(); }

    /**
     * Add order-by as ascend. <br>
     * INITNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Initnum_Asc() { regOBA("INITNUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INITNUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Initnum_Desc() { regOBD("INITNUM"); return this; }

    protected ConditionValue _mixedflg;
    public ConditionValue xdfgetMixedflg()
    { if (_mixedflg == null) { _mixedflg = nCV(); }
      return _mixedflg; }
    protected ConditionValue xgetCValueMixedflg() { return xdfgetMixedflg(); }

    /**
     * Add order-by as ascend. <br>
     * MIXEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Mixedflg_Asc() { regOBA("MIXEDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIXEDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Mixedflg_Desc() { regOBD("MIXEDFLG"); return this; }

    protected ConditionValue _lendflg;
    public ConditionValue xdfgetLendflg()
    { if (_lendflg == null) { _lendflg = nCV(); }
      return _lendflg; }
    protected ConditionValue xgetCValueLendflg() { return xdfgetLendflg(); }

    /**
     * Add order-by as ascend. <br>
     * LENDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Lendflg_Asc() { regOBA("LENDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LENDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Lendflg_Desc() { regOBD("LENDFLG"); return this; }

    protected ConditionValue _locgroup;
    public ConditionValue xdfgetLocgroup()
    { if (_locgroup == null) { _locgroup = nCV(); }
      return _locgroup; }
    protected ConditionValue xgetCValueLocgroup() { return xdfgetLocgroup(); }

    /**
     * Add order-by as ascend. <br>
     * LOCGROUP: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Locgroup_Asc() { regOBA("LOCGROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCGROUP: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Locgroup_Desc() { regOBD("LOCGROUP"); return this; }

    protected ConditionValue _loccd;
    public ConditionValue xdfgetLoccd()
    { if (_loccd == null) { _loccd = nCV(); }
      return _loccd; }
    protected ConditionValue xgetCValueLoccd() { return xdfgetLoccd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Loccd_Asc() { regOBA("LOCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Loccd_Desc() { regOBD("LOCCD"); return this; }

    protected ConditionValue _shipdate;
    public ConditionValue xdfgetShipdate()
    { if (_shipdate == null) { _shipdate = nCV(); }
      return _shipdate; }
    protected ConditionValue xgetCValueShipdate() { return xdfgetShipdate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Shipdate_Asc() { regOBA("SHIPDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPDATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Shipdate_Desc() { regOBD("SHIPDATE"); return this; }

    protected ConditionValue _currentLocationCd;
    public ConditionValue xdfgetCurrentLocationCd()
    { if (_currentLocationCd == null) { _currentLocationCd = nCV(); }
      return _currentLocationCd; }
    protected ConditionValue xgetCValueCurrentLocationCd() { return xdfgetCurrentLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_CurrentLocationCd_Asc() { regOBA("CURRENT_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_CurrentLocationCd_Desc() { regOBD("CURRENT_LOCATION_CD"); return this; }

    protected ConditionValue _currentLocationSname;
    public ConditionValue xdfgetCurrentLocationSname()
    { if (_currentLocationSname == null) { _currentLocationSname = nCV(); }
      return _currentLocationSname; }
    protected ConditionValue xgetCValueCurrentLocationSname() { return xdfgetCurrentLocationSname(); }

    /**
     * Add order-by as ascend. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_CurrentLocationSname_Asc() { regOBA("CURRENT_LOCATION_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_CurrentLocationSname_Desc() { regOBD("CURRENT_LOCATION_SNAME"); return this; }

    protected ConditionValue _adddatetime;
    public ConditionValue xdfgetAdddatetime()
    { if (_adddatetime == null) { _adddatetime = nCV(); }
      return _adddatetime; }
    protected ConditionValue xgetCValueAdddatetime() { return xdfgetAdddatetime(); }

    /**
     * Add order-by as ascend. <br>
     * ADDDATETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Adddatetime_Asc() { regOBA("ADDDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDDATETIME: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Adddatetime_Desc() { regOBD("ADDDATETIME"); return this; }

    protected ConditionValue _tracetype;
    public ConditionValue xdfgetTracetype()
    { if (_tracetype == null) { _tracetype = nCV(); }
      return _tracetype; }
    protected ConditionValue xgetCValueTracetype() { return xdfgetTracetype(); }

    /**
     * Add order-by as ascend. <br>
     * TRACETYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Tracetype_Asc() { regOBA("TRACETYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRACETYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Tracetype_Desc() { regOBD("TRACETYPE"); return this; }

    protected ConditionValue _othercd1;
    public ConditionValue xdfgetOthercd1()
    { if (_othercd1 == null) { _othercd1 = nCV(); }
      return _othercd1; }
    protected ConditionValue xgetCValueOthercd1() { return xdfgetOthercd1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERCD1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Othercd1_Asc() { regOBA("OTHERCD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERCD1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Othercd1_Desc() { regOBD("OTHERCD1"); return this; }

    protected ConditionValue _examsts;
    public ConditionValue xdfgetExamsts()
    { if (_examsts == null) { _examsts = nCV(); }
      return _examsts; }
    protected ConditionValue xgetCValueExamsts() { return xdfgetExamsts(); }

    /**
     * Add order-by as ascend. <br>
     * EXAMSTS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Examsts_Asc() { regOBA("EXAMSTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXAMSTS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Examsts_Desc() { regOBD("EXAMSTS"); return this; }

    protected ConditionValue _caseinnumbowl;
    public ConditionValue xdfgetCaseinnumbowl()
    { if (_caseinnumbowl == null) { _caseinnumbowl = nCV(); }
      return _caseinnumbowl; }
    protected ConditionValue xgetCValueCaseinnumbowl() { return xdfgetCaseinnumbowl(); }

    /**
     * Add order-by as ascend. <br>
     * CASEINNUMBOWL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Caseinnumbowl_Asc() { regOBA("CASEINNUMBOWL"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEINNUMBOWL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Caseinnumbowl_Desc() { regOBD("CASEINNUMBOWL"); return this; }

    protected ConditionValue _shipnumbowl;
    public ConditionValue xdfgetShipnumbowl()
    { if (_shipnumbowl == null) { _shipnumbowl = nCV(); }
      return _shipnumbowl; }
    protected ConditionValue xgetCValueShipnumbowl() { return xdfgetShipnumbowl(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPNUMBOWL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Shipnumbowl_Asc() { regOBA("SHIPNUMBOWL"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPNUMBOWL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Shipnumbowl_Desc() { regOBD("SHIPNUMBOWL"); return this; }

    protected ConditionValue _supplierrcvno;
    public ConditionValue xdfgetSupplierrcvno()
    { if (_supplierrcvno == null) { _supplierrcvno = nCV(); }
      return _supplierrcvno; }
    protected ConditionValue xgetCValueSupplierrcvno() { return xdfgetSupplierrcvno(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Supplierrcvno_Asc() { regOBA("SUPPLIERRCVNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Supplierrcvno_Desc() { regOBD("SUPPLIERRCVNO"); return this; }

    protected ConditionValue _tokuhancd;
    public ConditionValue xdfgetTokuhancd()
    { if (_tokuhancd == null) { _tokuhancd = nCV(); }
      return _tokuhancd; }
    protected ConditionValue xgetCValueTokuhancd() { return xdfgetTokuhancd(); }

    /**
     * Add order-by as ascend. <br>
     * TOKUHANCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Tokuhancd_Asc() { regOBA("TOKUHANCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOKUHANCD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Tokuhancd_Desc() { regOBD("TOKUHANCD"); return this; }

    protected ConditionValue _tokuhanNm;
    public ConditionValue xdfgetTokuhanNm()
    { if (_tokuhanNm == null) { _tokuhanNm = nCV(); }
      return _tokuhanNm; }
    protected ConditionValue xgetCValueTokuhanNm() { return xdfgetTokuhanNm(); }

    /**
     * Add order-by as ascend. <br>
     * TOKUHAN_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_TokuhanNm_Asc() { regOBA("TOKUHAN_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOKUHAN_NM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_TokuhanNm_Desc() { regOBD("TOKUHAN_NM"); return this; }

    protected ConditionValue _makercaseno;
    public ConditionValue xdfgetMakercaseno()
    { if (_makercaseno == null) { _makercaseno = nCV(); }
      return _makercaseno; }
    protected ConditionValue xgetCValueMakercaseno() { return xdfgetMakercaseno(); }

    /**
     * Add order-by as ascend. <br>
     * MAKERCASENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Makercaseno_Asc() { regOBA("MAKERCASENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAKERCASENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Makercaseno_Desc() { regOBD("MAKERCASENO"); return this; }

    protected ConditionValue _caseitfno;
    public ConditionValue xdfgetCaseitfno()
    { if (_caseitfno == null) { _caseitfno = nCV(); }
      return _caseitfno; }
    protected ConditionValue xgetCValueCaseitfno() { return xdfgetCaseitfno(); }

    /**
     * Add order-by as ascend. <br>
     * CASEITFNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Caseitfno_Asc() { regOBA("CASEITFNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEITFNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Caseitfno_Desc() { regOBD("CASEITFNO"); return this; }

    protected ConditionValue _casebarcodevaliant;
    public ConditionValue xdfgetCasebarcodevaliant()
    { if (_casebarcodevaliant == null) { _casebarcodevaliant = nCV(); }
      return _casebarcodevaliant; }
    protected ConditionValue xgetCValueCasebarcodevaliant() { return xdfgetCasebarcodevaliant(); }

    /**
     * Add order-by as ascend. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Casebarcodevaliant_Asc() { regOBA("CASEBARCODEVALIANT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Casebarcodevaliant_Desc() { regOBD("CASEBARCODEVALIANT"); return this; }

    protected ConditionValue _caselot4;
    public ConditionValue xdfgetCaselot4()
    { if (_caselot4 == null) { _caselot4 = nCV(); }
      return _caselot4; }
    protected ConditionValue xgetCValueCaselot4() { return xdfgetCaselot4(); }

    /**
     * Add order-by as ascend. <br>
     * CASELOT4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Caselot4_Asc() { regOBA("CASELOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASELOT4: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Caselot4_Desc() { regOBD("CASELOT4"); return this; }

    protected ConditionValue _casecenterno;
    public ConditionValue xdfgetCasecenterno()
    { if (_casecenterno == null) { _casecenterno = nCV(); }
      return _casecenterno; }
    protected ConditionValue xgetCValueCasecenterno() { return xdfgetCasecenterno(); }

    /**
     * Add order-by as ascend. <br>
     * CASECENTERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Casecenterno_Asc() { regOBA("CASECENTERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASECENTERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Casecenterno_Desc() { regOBD("CASECENTERNO"); return this; }

    protected ConditionValue _casepackno;
    public ConditionValue xdfgetCasepackno()
    { if (_casepackno == null) { _casepackno = nCV(); }
      return _casepackno; }
    protected ConditionValue xgetCValueCasepackno() { return xdfgetCasepackno(); }

    /**
     * Add order-by as ascend. <br>
     * CASEPACKNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Casepackno_Asc() { regOBA("CASEPACKNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEPACKNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Casepackno_Desc() { regOBD("CASEPACKNO"); return this; }

    protected ConditionValue _casepacktime;
    public ConditionValue xdfgetCasepacktime()
    { if (_casepacktime == null) { _casepacktime = nCV(); }
      return _casepacktime; }
    protected ConditionValue xgetCValueCasepacktime() { return xdfgetCasepacktime(); }

    /**
     * Add order-by as ascend. <br>
     * CASEPACKTIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Casepacktime_Asc() { regOBA("CASEPACKTIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEPACKTIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Casepacktime_Desc() { regOBD("CASEPACKTIME"); return this; }

    protected ConditionValue _senderLocation;
    public ConditionValue xdfgetSenderLocation()
    { if (_senderLocation == null) { _senderLocation = nCV(); }
      return _senderLocation; }
    protected ConditionValue xgetCValueSenderLocation() { return xdfgetSenderLocation(); }

    /**
     * Add order-by as ascend. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_SenderLocation_Asc() { regOBA("SENDER_LOCATION"); return this; }

    /**
     * Add order-by as descend. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_SenderLocation_Desc() { regOBD("SENDER_LOCATION"); return this; }

    protected ConditionValue _receiverLocation;
    public ConditionValue xdfgetReceiverLocation()
    { if (_receiverLocation == null) { _receiverLocation = nCV(); }
      return _receiverLocation; }
    protected ConditionValue xgetCValueReceiverLocation() { return xdfgetReceiverLocation(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ReceiverLocation_Asc() { regOBA("RECEIVER_LOCATION"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ReceiverLocation_Desc() { regOBD("RECEIVER_LOCATION"); return this; }

    protected ConditionValue _shipmentId;
    public ConditionValue xdfgetShipmentId()
    { if (_shipmentId == null) { _shipmentId = nCV(); }
      return _shipmentId; }
    protected ConditionValue xgetCValueShipmentId() { return xdfgetShipmentId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ShipmentId_Asc() { regOBA("SHIPMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ShipmentId_Desc() { regOBD("SHIPMENT_ID"); return this; }

    protected ConditionValue _shipmentDate;
    public ConditionValue xdfgetShipmentDate()
    { if (_shipmentDate == null) { _shipmentDate = nCV(); }
      return _shipmentDate; }
    protected ConditionValue xgetCValueShipmentDate() { return xdfgetShipmentDate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ShipmentDate_Asc() { regOBA("SHIPMENT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ShipmentDate_Desc() { regOBD("SHIPMENT_DATE"); return this; }

    protected ConditionValue _numberOfPallets;
    public ConditionValue xdfgetNumberOfPallets()
    { if (_numberOfPallets == null) { _numberOfPallets = nCV(); }
      return _numberOfPallets; }
    protected ConditionValue xgetCValueNumberOfPallets() { return xdfgetNumberOfPallets(); }

    /**
     * Add order-by as ascend. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_NumberOfPallets_Asc() { regOBA("NUMBER_OF_PALLETS"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_NumberOfPallets_Desc() { regOBD("NUMBER_OF_PALLETS"); return this; }

    protected ConditionValue _carrierno;
    public ConditionValue xdfgetCarrierno()
    { if (_carrierno == null) { _carrierno = nCV(); }
      return _carrierno; }
    protected ConditionValue xgetCValueCarrierno() { return xdfgetCarrierno(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Carrierno_Asc() { regOBA("CARRIERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Carrierno_Desc() { regOBD("CARRIERNO"); return this; }

    protected ConditionValue _tkhnorderno;
    public ConditionValue xdfgetTkhnorderno()
    { if (_tkhnorderno == null) { _tkhnorderno = nCV(); }
      return _tkhnorderno; }
    protected ConditionValue xgetCValueTkhnorderno() { return xdfgetTkhnorderno(); }

    /**
     * Add order-by as ascend. <br>
     * TKHNORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Tkhnorderno_Asc() { regOBA("TKHNORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TKHNORDERNO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Tkhnorderno_Desc() { regOBD("TKHNORDERNO"); return this; }

    protected ConditionValue _srccd;
    public ConditionValue xdfgetSrccd()
    { if (_srccd == null) { _srccd = nCV(); }
      return _srccd; }
    protected ConditionValue xgetCValueSrccd() { return xdfgetSrccd(); }

    /**
     * Add order-by as ascend. <br>
     * SRCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Srccd_Asc() { regOBA("SRCCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SRCCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Srccd_Desc() { regOBD("SRCCD"); return this; }

    protected ConditionValue _blno;
    public ConditionValue xdfgetBlno()
    { if (_blno == null) { _blno = nCV(); }
      return _blno; }
    protected ConditionValue xgetCValueBlno() { return xdfgetBlno(); }

    /**
     * Add order-by as ascend. <br>
     * BLNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Blno_Asc() { regOBA("BLNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLNO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Blno_Desc() { regOBD("BLNO"); return this; }

    protected ConditionValue _invoiceno;
    public ConditionValue xdfgetInvoiceno()
    { if (_invoiceno == null) { _invoiceno = nCV(); }
      return _invoiceno; }
    protected ConditionValue xgetCValueInvoiceno() { return xdfgetInvoiceno(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Invoiceno_Asc() { regOBA("INVOICENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICENO: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Invoiceno_Desc() { regOBD("INVOICENO"); return this; }

    protected ConditionValue _sscc;
    public ConditionValue xdfgetSscc()
    { if (_sscc == null) { _sscc = nCV(); }
      return _sscc; }
    protected ConditionValue xgetCValueSscc() { return xdfgetSscc(); }

    /**
     * Add order-by as ascend. <br>
     * SSCC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Sscc_Asc() { regOBA("SSCC"); return this; }

    /**
     * Add order-by as descend. <br>
     * SSCC: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Sscc_Desc() { regOBD("SSCC"); return this; }

    protected ConditionValue _caseno;
    public ConditionValue xdfgetCaseno()
    { if (_caseno == null) { _caseno = nCV(); }
      return _caseno; }
    protected ConditionValue xgetCValueCaseno() { return xdfgetCaseno(); }

    /**
     * Add order-by as ascend. <br>
     * CASENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Caseno_Asc() { regOBA("CASENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASENO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_Caseno_Desc() { regOBD("CASENO"); return this; }

    protected ConditionValue _invNum;
    public ConditionValue xdfgetInvNum()
    { if (_invNum == null) { _invNum = nCV(); }
      return _invNum; }
    protected ConditionValue xgetCValueInvNum() { return xdfgetInvNum(); }

    /**
     * Add order-by as ascend. <br>
     * INV_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_InvNum_Asc() { regOBA("INV_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INV_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_InvNum_Desc() { regOBD("INV_NUM"); return this; }

    protected ConditionValue _sortNum;
    public ConditionValue xdfgetSortNum()
    { if (_sortNum == null) { _sortNum = nCV(); }
      return _sortNum; }
    protected ConditionValue xgetCValueSortNum() { return xdfgetSortNum(); }

    /**
     * Add order-by as ascend. <br>
     * SORT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_SortNum_Asc() { regOBA("SORT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_SortNum_Desc() { regOBD("SORT_NUM"); return this; }

    protected ConditionValue _adoptNum;
    public ConditionValue xdfgetAdoptNum()
    { if (_adoptNum == null) { _adoptNum = nCV(); }
      return _adoptNum; }
    protected ConditionValue xgetCValueAdoptNum() { return xdfgetAdoptNum(); }

    /**
     * Add order-by as ascend. <br>
     * ADOPT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_AdoptNum_Asc() { regOBA("ADOPT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADOPT_NUM: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_AdoptNum_Desc() { regOBD("ADOPT_NUM"); return this; }

    protected ConditionValue _sendCd;
    public ConditionValue xdfgetSendCd()
    { if (_sendCd == null) { _sendCd = nCV(); }
      return _sendCd; }
    protected ConditionValue xgetCValueSendCd() { return xdfgetSendCd(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

    protected ConditionValue _sendFlg;
    public ConditionValue xdfgetSendFlg()
    { if (_sendFlg == null) { _sendFlg = nCV(); }
      return _sendFlg; }
    protected ConditionValue xgetCValueSendFlg() { return xdfgetSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_SendFlg_Asc() { regOBA("SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_FLG: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_SendFlg_Desc() { regOBD("SEND_FLG"); return this; }

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
    public BsETrackingInfoImportCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsETrackingInfoImportCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsETrackingInfoImportCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsETrackingInfoImportCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsETrackingInfoImportCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsETrackingInfoImportCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsETrackingInfoImportCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsETrackingInfoImportCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsETrackingInfoImportCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsETrackingInfoImportCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsETrackingInfoImportCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsETrackingInfoImportCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ETrackingInfoImportCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ETrackingInfoImportCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ETrackingInfoImportCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ETrackingInfoImportCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ETrackingInfoImportCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ETrackingInfoImportCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ETrackingInfoImportCQ> _myselfExistsMap;
    public Map<String, ETrackingInfoImportCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ETrackingInfoImportCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ETrackingInfoImportCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ETrackingInfoImportCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ETrackingInfoImportCB.class.getName(); }
    protected String xCQ() { return ETrackingInfoImportCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
