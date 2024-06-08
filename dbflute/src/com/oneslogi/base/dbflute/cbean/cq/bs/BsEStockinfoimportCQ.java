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
 * The base condition-query of E_STOCKINFOIMPORT.
 * @author DBFlute(AutoGenerator)
 */
public class BsEStockinfoimportCQ extends AbstractBsEStockinfoimportCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EStockinfoimportCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEStockinfoimportCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_STOCKINFOIMPORT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EStockinfoimportCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EStockinfoimportCIQ xcreateCIQ() {
        EStockinfoimportCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EStockinfoimportCIQ xnewCIQ() {
        return new EStockinfoimportCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_STOCKINFOIMPORT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EStockinfoimportCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EStockinfoimportCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _centerStockInfoSendId;
    public ConditionValue xdfgetCenterStockInfoSendId()
    { if (_centerStockInfoSendId == null) { _centerStockInfoSendId = nCV(); }
      return _centerStockInfoSendId; }
    protected ConditionValue xgetCValueCenterStockInfoSendId() { return xdfgetCenterStockInfoSendId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_CenterStockInfoSendId_Asc() { regOBA("CENTER_STOCK_INFO_SEND_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_CenterStockInfoSendId_Desc() { regOBD("CENTER_STOCK_INFO_SEND_ID"); return this; }

    protected ConditionValue _sendCd;
    public ConditionValue xdfgetSendCd()
    { if (_sendCd == null) { _sendCd = nCV(); }
      return _sendCd; }
    protected ConditionValue xgetCValueSendCd() { return xdfgetSendCd(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

    protected ConditionValue _sendRowId;
    public ConditionValue xdfgetSendRowId()
    { if (_sendRowId == null) { _sendRowId = nCV(); }
      return _sendRowId; }
    protected ConditionValue xgetCValueSendRowId() { return xdfgetSendRowId(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_SendRowId_Asc() { regOBA("SEND_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_SendRowId_Desc() { regOBD("SEND_ROW_ID"); return this; }

    protected ConditionValue _workFlg;
    public ConditionValue xdfgetWorkFlg()
    { if (_workFlg == null) { _workFlg = nCV(); }
      return _workFlg; }
    protected ConditionValue xgetCValueWorkFlg() { return xdfgetWorkFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_WorkFlg_Asc() { regOBA("WORK_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_WorkFlg_Desc() { regOBD("WORK_FLG"); return this; }

    protected ConditionValue _seqno;
    public ConditionValue xdfgetSeqno()
    { if (_seqno == null) { _seqno = nCV(); }
      return _seqno; }
    protected ConditionValue xgetCValueSeqno() { return xdfgetSeqno(); }

    /**
     * Add order-by as ascend. <br>
     * SEQNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Seqno_Asc() { regOBA("SEQNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Seqno_Desc() { regOBD("SEQNO"); return this; }

    protected ConditionValue _adddatetime;
    public ConditionValue xdfgetAdddatetime()
    { if (_adddatetime == null) { _adddatetime = nCV(); }
      return _adddatetime; }
    protected ConditionValue xgetCValueAdddatetime() { return xdfgetAdddatetime(); }

    /**
     * Add order-by as ascend. <br>
     * ADDDATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Adddatetime_Asc() { regOBA("ADDDATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDDATETIME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Adddatetime_Desc() { regOBD("ADDDATETIME"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _warehouseSname;
    public ConditionValue xdfgetWarehouseSname()
    { if (_warehouseSname == null) { _warehouseSname = nCV(); }
      return _warehouseSname; }
    protected ConditionValue xgetCValueWarehouseSname() { return xdfgetWarehouseSname(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_WarehouseSname_Asc() { regOBA("WAREHOUSE_SNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_WarehouseSname_Desc() { regOBD("WAREHOUSE_SNAME"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _itemName;
    public ConditionValue xdfgetItemName()
    { if (_itemName == null) { _itemName = nCV(); }
      return _itemName; }
    protected ConditionValue xgetCValueItemName() { return xdfgetItemName(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_ItemName_Asc() { regOBA("ITEM_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_ItemName_Desc() { regOBD("ITEM_NAME"); return this; }

    protected ConditionValue _limitdate;
    public ConditionValue xdfgetLimitdate()
    { if (_limitdate == null) { _limitdate = nCV(); }
      return _limitdate; }
    protected ConditionValue xgetCValueLimitdate() { return xdfgetLimitdate(); }

    /**
     * Add order-by as ascend. <br>
     * LIMITDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Limitdate_Asc() { regOBA("LIMITDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Limitdate_Desc() { regOBD("LIMITDATE"); return this; }

    protected ConditionValue _designCd;
    public ConditionValue xdfgetDesignCd()
    { if (_designCd == null) { _designCd = nCV(); }
      return _designCd; }
    protected ConditionValue xgetCValueDesignCd() { return xdfgetDesignCd(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGN_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_DesignCd_Asc() { regOBA("DESIGN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGN_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_DesignCd_Desc() { regOBD("DESIGN_CD"); return this; }

    protected ConditionValue _otherlot1;
    public ConditionValue xdfgetOtherlot1()
    { if (_otherlot1 == null) { _otherlot1 = nCV(); }
      return _otherlot1; }
    protected ConditionValue xgetCValueOtherlot1() { return xdfgetOtherlot1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERLOT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Otherlot1_Asc() { regOBA("OTHERLOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Otherlot1_Desc() { regOBD("OTHERLOT1"); return this; }

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
    public BsEStockinfoimportCQ addOrderBy_Address3_Asc() { regOBA("ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Address3_Desc() { regOBD("ADDRESS3"); return this; }

    protected ConditionValue _qty1;
    public ConditionValue xdfgetQty1()
    { if (_qty1 == null) { _qty1 = nCV(); }
      return _qty1; }
    protected ConditionValue xgetCValueQty1() { return xdfgetQty1(); }

    /**
     * Add order-by as ascend. <br>
     * QTY1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Qty1_Asc() { regOBA("QTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * QTY1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Qty1_Desc() { regOBD("QTY1"); return this; }

    protected ConditionValue _refno;
    public ConditionValue xdfgetRefno()
    { if (_refno == null) { _refno = nCV(); }
      return _refno; }
    protected ConditionValue xgetCValueRefno() { return xdfgetRefno(); }

    /**
     * Add order-by as ascend. <br>
     * REFNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Refno_Asc() { regOBA("REFNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Refno_Desc() { regOBD("REFNO"); return this; }

    protected ConditionValue _firmcarryno;
    public ConditionValue xdfgetFirmcarryno()
    { if (_firmcarryno == null) { _firmcarryno = nCV(); }
      return _firmcarryno; }
    protected ConditionValue xgetCValueFirmcarryno() { return xdfgetFirmcarryno(); }

    /**
     * Add order-by as ascend. <br>
     * FIRMCARRYNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Firmcarryno_Asc() { regOBA("FIRMCARRYNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRMCARRYNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Firmcarryno_Desc() { regOBD("FIRMCARRYNO"); return this; }

    protected ConditionValue _manufacturecd;
    public ConditionValue xdfgetManufacturecd()
    { if (_manufacturecd == null) { _manufacturecd = nCV(); }
      return _manufacturecd; }
    protected ConditionValue xgetCValueManufacturecd() { return xdfgetManufacturecd(); }

    /**
     * Add order-by as ascend. <br>
     * MANUFACTURECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Manufacturecd_Asc() { regOBA("MANUFACTURECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Manufacturecd_Desc() { regOBD("MANUFACTURECD"); return this; }

    protected ConditionValue _sourceCd;
    public ConditionValue xdfgetSourceCd()
    { if (_sourceCd == null) { _sourceCd = nCV(); }
      return _sourceCd; }
    protected ConditionValue xgetCValueSourceCd() { return xdfgetSourceCd(); }

    /**
     * Add order-by as ascend. <br>
     * SOURCE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_SourceCd_Asc() { regOBA("SOURCE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOURCE_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_SourceCd_Desc() { regOBD("SOURCE_CD"); return this; }

    protected ConditionValue _sourceName;
    public ConditionValue xdfgetSourceName()
    { if (_sourceName == null) { _sourceName = nCV(); }
      return _sourceName; }
    protected ConditionValue xgetCValueSourceName() { return xdfgetSourceName(); }

    /**
     * Add order-by as ascend. <br>
     * SOURCE_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_SourceName_Asc() { regOBA("SOURCE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOURCE_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_SourceName_Desc() { regOBD("SOURCE_NAME"); return this; }

    protected ConditionValue _shipschdate;
    public ConditionValue xdfgetShipschdate()
    { if (_shipschdate == null) { _shipschdate = nCV(); }
      return _shipschdate; }
    protected ConditionValue xgetCValueShipschdate() { return xdfgetShipschdate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPSCHDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Shipschdate_Asc() { regOBA("SHIPSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPSCHDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Shipschdate_Desc() { regOBD("SHIPSCHDATE"); return this; }

    protected ConditionValue _schreceiveDate;
    public ConditionValue xdfgetSchreceiveDate()
    { if (_schreceiveDate == null) { _schreceiveDate = nCV(); }
      return _schreceiveDate; }
    protected ConditionValue xgetCValueSchreceiveDate() { return xdfgetSchreceiveDate(); }

    /**
     * Add order-by as ascend. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_SchreceiveDate_Asc() { regOBA("SCHRECEIVE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHRECEIVE_DATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_SchreceiveDate_Desc() { regOBD("SCHRECEIVE_DATE"); return this; }

    protected ConditionValue _schreceiveNum;
    public ConditionValue xdfgetSchreceiveNum()
    { if (_schreceiveNum == null) { _schreceiveNum = nCV(); }
      return _schreceiveNum; }
    protected ConditionValue xgetCValueSchreceiveNum() { return xdfgetSchreceiveNum(); }

    /**
     * Add order-by as ascend. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_SchreceiveNum_Asc() { regOBA("SCHRECEIVE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHRECEIVE_NUM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_SchreceiveNum_Desc() { regOBD("SCHRECEIVE_NUM"); return this; }

    protected ConditionValue _transportPriority;
    public ConditionValue xdfgetTransportPriority()
    { if (_transportPriority == null) { _transportPriority = nCV(); }
      return _transportPriority; }
    protected ConditionValue xgetCValueTransportPriority() { return xdfgetTransportPriority(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_TransportPriority_Asc() { regOBA("TRANSPORT_PRIORITY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORT_PRIORITY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_TransportPriority_Desc() { regOBD("TRANSPORT_PRIORITY"); return this; }

    protected ConditionValue _itemOrderby;
    public ConditionValue xdfgetItemOrderby()
    { if (_itemOrderby == null) { _itemOrderby = nCV(); }
      return _itemOrderby; }
    protected ConditionValue xgetCValueItemOrderby() { return xdfgetItemOrderby(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_ORDERBY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_ItemOrderby_Asc() { regOBA("ITEM_ORDERBY"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_ORDERBY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_ItemOrderby_Desc() { regOBD("ITEM_ORDERBY"); return this; }

    protected ConditionValue _usetype;
    public ConditionValue xdfgetUsetype()
    { if (_usetype == null) { _usetype = nCV(); }
      return _usetype; }
    protected ConditionValue xgetCValueUsetype() { return xdfgetUsetype(); }

    /**
     * Add order-by as ascend. <br>
     * USETYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Usetype_Asc() { regOBA("USETYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * USETYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Usetype_Desc() { regOBD("USETYPE"); return this; }

    protected ConditionValue _locgroup;
    public ConditionValue xdfgetLocgroup()
    { if (_locgroup == null) { _locgroup = nCV(); }
      return _locgroup; }
    protected ConditionValue xgetCValueLocgroup() { return xdfgetLocgroup(); }

    /**
     * Add order-by as ascend. <br>
     * LOCGROUP: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Locgroup_Asc() { regOBA("LOCGROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCGROUP: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Locgroup_Desc() { regOBD("LOCGROUP"); return this; }

    protected ConditionValue _locgroupname;
    public ConditionValue xdfgetLocgroupname()
    { if (_locgroupname == null) { _locgroupname = nCV(); }
      return _locgroupname; }
    protected ConditionValue xgetCValueLocgroupname() { return xdfgetLocgroupname(); }

    /**
     * Add order-by as ascend. <br>
     * LOCGROUPNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Locgroupname_Asc() { regOBA("LOCGROUPNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCGROUPNAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Locgroupname_Desc() { regOBD("LOCGROUPNAME"); return this; }

    protected ConditionValue _otherrefno1;
    public ConditionValue xdfgetOtherrefno1()
    { if (_otherrefno1 == null) { _otherrefno1 = nCV(); }
      return _otherrefno1; }
    protected ConditionValue xgetCValueOtherrefno1() { return xdfgetOtherrefno1(); }

    /**
     * Add order-by as ascend. <br>
     * OTHERREFNO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Otherrefno1_Asc() { regOBA("OTHERREFNO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERREFNO1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_Otherrefno1_Desc() { regOBD("OTHERREFNO1"); return this; }

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
    public BsEStockinfoimportCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEStockinfoimportCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEStockinfoimportCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEStockinfoimportCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEStockinfoimportCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEStockinfoimportCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEStockinfoimportCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEStockinfoimportCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEStockinfoimportCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEStockinfoimportCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEStockinfoimportCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEStockinfoimportCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EStockinfoimportCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EStockinfoimportCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EStockinfoimportCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EStockinfoimportCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EStockinfoimportCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EStockinfoimportCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EStockinfoimportCQ> _myselfExistsMap;
    public Map<String, EStockinfoimportCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EStockinfoimportCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EStockinfoimportCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EStockinfoimportCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EStockinfoimportCB.class.getName(); }
    protected String xCQ() { return EStockinfoimportCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
