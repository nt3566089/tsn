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
 * The base condition-query of E_CENTER_STOCK_INFO_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class BsECenterStockInfoSendCQ extends AbstractBsECenterStockInfoSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ECenterStockInfoSendCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsECenterStockInfoSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_CENTER_STOCK_INFO_SEND) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ECenterStockInfoSendCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ECenterStockInfoSendCIQ xcreateCIQ() {
        ECenterStockInfoSendCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ECenterStockInfoSendCIQ xnewCIQ() {
        return new ECenterStockInfoSendCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_CENTER_STOCK_INFO_SEND on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ECenterStockInfoSendCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ECenterStockInfoSendCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsECenterStockInfoSendCQ addOrderBy_CenterStockInfoSendId_Asc() { regOBA("CENTER_STOCK_INFO_SEND_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_CenterStockInfoSendId_Desc() { regOBD("CENTER_STOCK_INFO_SEND_ID"); return this; }

    protected ConditionValue _seqno;
    public ConditionValue xdfgetSeqno()
    { if (_seqno == null) { _seqno = nCV(); }
      return _seqno; }
    protected ConditionValue xgetCValueSeqno() { return xdfgetSeqno(); }

    /**
     * Add order-by as ascend. <br>
     * SEQNO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_Seqno_Asc() { regOBA("SEQNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEQNO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_Seqno_Desc() { regOBD("SEQNO"); return this; }

    protected ConditionValue _processDt;
    public ConditionValue xdfgetProcessDt()
    { if (_processDt == null) { _processDt = nCV(); }
      return _processDt; }
    protected ConditionValue xgetCValueProcessDt() { return xdfgetProcessDt(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_DT: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_ProcessDt_Asc() { regOBA("PROCESS_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_DT: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_ProcessDt_Desc() { regOBD("PROCESS_DT"); return this; }

    protected ConditionValue _warehouseCd;
    public ConditionValue xdfgetWarehouseCd()
    { if (_warehouseCd == null) { _warehouseCd = nCV(); }
      return _warehouseCd; }
    protected ConditionValue xgetCValueWarehouseCd() { return xdfgetWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

    protected ConditionValue _warehouseName;
    public ConditionValue xdfgetWarehouseName()
    { if (_warehouseName == null) { _warehouseName = nCV(); }
      return _warehouseName; }
    protected ConditionValue xgetCValueWarehouseName() { return xdfgetWarehouseName(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_NAME: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_WarehouseName_Asc() { regOBA("WAREHOUSE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_NAME: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_WarehouseName_Desc() { regOBD("WAREHOUSE_NAME"); return this; }

    protected ConditionValue _itemCd;
    public ConditionValue xdfgetItemCd()
    { if (_itemCd == null) { _itemCd = nCV(); }
      return _itemCd; }
    protected ConditionValue xgetCValueItemCd() { return xdfgetItemCd(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_ItemCd_Asc() { regOBA("ITEM_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_ItemCd_Desc() { regOBD("ITEM_CD"); return this; }

    protected ConditionValue _itemName;
    public ConditionValue xdfgetItemName()
    { if (_itemName == null) { _itemName = nCV(); }
      return _itemName; }
    protected ConditionValue xgetCValueItemName() { return xdfgetItemName(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_NAME: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_ItemName_Asc() { regOBA("ITEM_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_NAME: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_ItemName_Desc() { regOBD("ITEM_NAME"); return this; }

    protected ConditionValue _limitDate;
    public ConditionValue xdfgetLimitDate()
    { if (_limitDate == null) { _limitDate = nCV(); }
      return _limitDate; }
    protected ConditionValue xgetCValueLimitDate() { return xdfgetLimitDate(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_LimitDate_Asc() { regOBA("LIMIT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_LimitDate_Desc() { regOBD("LIMIT_DATE"); return this; }

    protected ConditionValue _designCd;
    public ConditionValue xdfgetDesignCd()
    { if (_designCd == null) { _designCd = nCV(); }
      return _designCd; }
    protected ConditionValue xgetCValueDesignCd() { return xdfgetDesignCd(); }

    /**
     * Add order-by as ascend. <br>
     * DESIGN_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_DesignCd_Asc() { regOBA("DESIGN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESIGN_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_DesignCd_Desc() { regOBD("DESIGN_CD"); return this; }

    protected ConditionValue _invType;
    public ConditionValue xdfgetInvType()
    { if (_invType == null) { _invType = nCV(); }
      return _invType; }
    protected ConditionValue xgetCValueInvType() { return xdfgetInvType(); }

    /**
     * Add order-by as ascend. <br>
     * INV_TYPE: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_InvType_Asc() { regOBA("INV_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INV_TYPE: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_InvType_Desc() { regOBD("INV_TYPE"); return this; }

    protected ConditionValue _invNum;
    public ConditionValue xdfgetInvNum()
    { if (_invNum == null) { _invNum = nCV(); }
      return _invNum; }
    protected ConditionValue xgetCValueInvNum() { return xdfgetInvNum(); }

    /**
     * Add order-by as ascend. <br>
     * INV_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_InvNum_Asc() { regOBA("INV_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INV_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_InvNum_Desc() { regOBD("INV_NUM"); return this; }

    protected ConditionValue _transportCd;
    public ConditionValue xdfgetTransportCd()
    { if (_transportCd == null) { _transportCd = nCV(); }
      return _transportCd; }
    protected ConditionValue xgetCValueTransportCd() { return xdfgetTransportCd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_TransportCd_Asc() { regOBA("TRANSPORT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_TransportCd_Desc() { regOBD("TRANSPORT_CD"); return this; }

    protected ConditionValue _firmtransportCd;
    public ConditionValue xdfgetFirmtransportCd()
    { if (_firmtransportCd == null) { _firmtransportCd = nCV(); }
      return _firmtransportCd; }
    protected ConditionValue xgetCValueFirmtransportCd() { return xdfgetFirmtransportCd(); }

    /**
     * Add order-by as ascend. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_FirmtransportCd_Asc() { regOBA("FIRMTRANSPORT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_FirmtransportCd_Desc() { regOBD("FIRMTRANSPORT_CD"); return this; }

    protected ConditionValue _sourceCd;
    public ConditionValue xdfgetSourceCd()
    { if (_sourceCd == null) { _sourceCd = nCV(); }
      return _sourceCd; }
    protected ConditionValue xgetCValueSourceCd() { return xdfgetSourceCd(); }

    /**
     * Add order-by as ascend. <br>
     * SOURCE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_SourceCd_Asc() { regOBA("SOURCE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOURCE_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_SourceCd_Desc() { regOBD("SOURCE_CD"); return this; }

    protected ConditionValue _sourceName;
    public ConditionValue xdfgetSourceName()
    { if (_sourceName == null) { _sourceName = nCV(); }
      return _sourceName; }
    protected ConditionValue xgetCValueSourceName() { return xdfgetSourceName(); }

    /**
     * Add order-by as ascend. <br>
     * SOURCE_NAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_SourceName_Asc() { regOBA("SOURCE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOURCE_NAME: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_SourceName_Desc() { regOBD("SOURCE_NAME"); return this; }

    protected ConditionValue _schDate;
    public ConditionValue xdfgetSchDate()
    { if (_schDate == null) { _schDate = nCV(); }
      return _schDate; }
    protected ConditionValue xgetCValueSchDate() { return xdfgetSchDate(); }

    /**
     * Add order-by as ascend. <br>
     * SCH_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_SchDate_Asc() { regOBA("SCH_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCH_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_SchDate_Desc() { regOBD("SCH_DATE"); return this; }

    protected ConditionValue _receiveDate;
    public ConditionValue xdfgetReceiveDate()
    { if (_receiveDate == null) { _receiveDate = nCV(); }
      return _receiveDate; }
    protected ConditionValue xgetCValueReceiveDate() { return xdfgetReceiveDate(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_ReceiveDate_Asc() { regOBA("RECEIVE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_ReceiveDate_Desc() { regOBD("RECEIVE_DATE"); return this; }

    protected ConditionValue _schreceiveDate;
    public ConditionValue xdfgetSchreceiveDate()
    { if (_schreceiveDate == null) { _schreceiveDate = nCV(); }
      return _schreceiveDate; }
    protected ConditionValue xgetCValueSchreceiveDate() { return xdfgetSchreceiveDate(); }

    /**
     * Add order-by as ascend. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_SchreceiveDate_Asc() { regOBA("SCHRECEIVE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_SchreceiveDate_Desc() { regOBD("SCHRECEIVE_DATE"); return this; }

    protected ConditionValue _schreceiveNum;
    public ConditionValue xdfgetSchreceiveNum()
    { if (_schreceiveNum == null) { _schreceiveNum = nCV(); }
      return _schreceiveNum; }
    protected ConditionValue xgetCValueSchreceiveNum() { return xdfgetSchreceiveNum(); }

    /**
     * Add order-by as ascend. <br>
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_SchreceiveNum_Asc() { regOBA("SCHRECEIVE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_SchreceiveNum_Desc() { regOBD("SCHRECEIVE_NUM"); return this; }

    protected ConditionValue _transportPriority;
    public ConditionValue xdfgetTransportPriority()
    { if (_transportPriority == null) { _transportPriority = nCV(); }
      return _transportPriority; }
    protected ConditionValue xgetCValueTransportPriority() { return xdfgetTransportPriority(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_TransportPriority_Asc() { regOBA("TRANSPORT_PRIORITY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_TransportPriority_Desc() { regOBD("TRANSPORT_PRIORITY"); return this; }

    protected ConditionValue _itemSort;
    public ConditionValue xdfgetItemSort()
    { if (_itemSort == null) { _itemSort = nCV(); }
      return _itemSort; }
    protected ConditionValue xgetCValueItemSort() { return xdfgetItemSort(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_SORT: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_ItemSort_Asc() { regOBA("ITEM_SORT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_SORT: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_ItemSort_Desc() { regOBD("ITEM_SORT"); return this; }

    protected ConditionValue _useType;
    public ConditionValue xdfgetUseType()
    { if (_useType == null) { _useType = nCV(); }
      return _useType; }
    protected ConditionValue xgetCValueUseType() { return xdfgetUseType(); }

    /**
     * Add order-by as ascend. <br>
     * USE_TYPE: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_UseType_Asc() { regOBA("USE_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * USE_TYPE: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_UseType_Desc() { regOBD("USE_TYPE"); return this; }

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
    public BsECenterStockInfoSendCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

    protected ConditionValue _sendFlg;
    public ConditionValue xdfgetSendFlg()
    { if (_sendFlg == null) { _sendFlg = nCV(); }
      return _sendFlg; }
    protected ConditionValue xgetCValueSendFlg() { return xdfgetSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_SendFlg_Asc() { regOBA("SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_SendFlg_Desc() { regOBD("SEND_FLG"); return this; }

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
    public BsECenterStockInfoSendCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsECenterStockInfoSendCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsECenterStockInfoSendCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsECenterStockInfoSendCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsECenterStockInfoSendCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsECenterStockInfoSendCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsECenterStockInfoSendCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsECenterStockInfoSendCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsECenterStockInfoSendCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsECenterStockInfoSendCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsECenterStockInfoSendCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsECenterStockInfoSendCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ECenterStockInfoSendCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ECenterStockInfoSendCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ECenterStockInfoSendCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ECenterStockInfoSendCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ECenterStockInfoSendCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ECenterStockInfoSendCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ECenterStockInfoSendCQ> _myselfExistsMap;
    public Map<String, ECenterStockInfoSendCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ECenterStockInfoSendCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ECenterStockInfoSendCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ECenterStockInfoSendCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ECenterStockInfoSendCB.class.getName(); }
    protected String xCQ() { return ECenterStockInfoSendCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
