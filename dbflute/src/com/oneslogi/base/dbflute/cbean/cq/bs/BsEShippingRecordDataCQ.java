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
 * The base condition-query of E_SHIPPING_RECORD_DATA.
 * @author DBFlute(AutoGenerator)
 */
public class BsEShippingRecordDataCQ extends AbstractBsEShippingRecordDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EShippingRecordDataCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEShippingRecordDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_SHIPPING_RECORD_DATA) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EShippingRecordDataCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EShippingRecordDataCIQ xcreateCIQ() {
        EShippingRecordDataCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EShippingRecordDataCIQ xnewCIQ() {
        return new EShippingRecordDataCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_SHIPPING_RECORD_DATA on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EShippingRecordDataCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EShippingRecordDataCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingRecordDataId;
    public ConditionValue xdfgetShippingRecordDataId()
    { if (_shippingRecordDataId == null) { _shippingRecordDataId = nCV(); }
      return _shippingRecordDataId; }
    protected ConditionValue xgetCValueShippingRecordDataId() { return xdfgetShippingRecordDataId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ShippingRecordDataId_Asc() { regOBA("SHIPPING_RECORD_DATA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ShippingRecordDataId_Desc() { regOBD("SHIPPING_RECORD_DATA_ID"); return this; }

    protected ConditionValue _receiveCd;
    public ConditionValue xdfgetReceiveCd()
    { if (_receiveCd == null) { _receiveCd = nCV(); }
      return _receiveCd; }
    protected ConditionValue xgetCValueReceiveCd() { return xdfgetReceiveCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

    protected ConditionValue _receiveRowId;
    public ConditionValue xdfgetReceiveRowId()
    { if (_receiveRowId == null) { _receiveRowId = nCV(); }
      return _receiveRowId; }
    protected ConditionValue xgetCValueReceiveRowId() { return xdfgetReceiveRowId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _dataFlg;
    public ConditionValue xdfgetDataFlg()
    { if (_dataFlg == null) { _dataFlg = nCV(); }
      return _dataFlg; }
    protected ConditionValue xgetCValueDataFlg() { return xdfgetDataFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_DataFlg_Asc() { regOBA("DATA_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_DataFlg_Desc() { regOBD("DATA_FLG"); return this; }

    protected ConditionValue _recordData;
    public ConditionValue xdfgetRecordData()
    { if (_recordData == null) { _recordData = nCV(); }
      return _recordData; }
    protected ConditionValue xgetCValueRecordData() { return xdfgetRecordData(); }

    /**
     * Add order-by as ascend. <br>
     * RECORD_DATA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_RecordData_Asc() { regOBA("RECORD_DATA"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECORD_DATA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_RecordData_Desc() { regOBD("RECORD_DATA"); return this; }

    protected ConditionValue _transportcd;
    public ConditionValue xdfgetTransportcd()
    { if (_transportcd == null) { _transportcd = nCV(); }
      return _transportcd; }
    protected ConditionValue xgetCValueTransportcd() { return xdfgetTransportcd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSPORTCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Transportcd_Asc() { regOBA("TRANSPORTCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSPORTCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Transportcd_Desc() { regOBD("TRANSPORTCD"); return this; }

    protected ConditionValue _itemcdH;
    public ConditionValue xdfgetItemcdH()
    { if (_itemcdH == null) { _itemcdH = nCV(); }
      return _itemcdH; }
    protected ConditionValue xgetCValueItemcdH() { return xdfgetItemcdH(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD_H: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ItemcdH_Asc() { regOBA("ITEMCD_H"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD_H: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ItemcdH_Desc() { regOBD("ITEMCD_H"); return this; }

    protected ConditionValue _ordernoH;
    public ConditionValue xdfgetOrdernoH()
    { if (_ordernoH == null) { _ordernoH = nCV(); }
      return _ordernoH; }
    protected ConditionValue xgetCValueOrdernoH() { return xdfgetOrdernoH(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERNO_H: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_OrdernoH_Asc() { regOBA("ORDERNO_H"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERNO_H: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_OrdernoH_Desc() { regOBD("ORDERNO_H"); return this; }

    protected ConditionValue _caseqty;
    public ConditionValue xdfgetCaseqty()
    { if (_caseqty == null) { _caseqty = nCV(); }
      return _caseqty; }
    protected ConditionValue xgetCValueCaseqty() { return xdfgetCaseqty(); }

    /**
     * Add order-by as ascend. <br>
     * CASEQTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Caseqty_Asc() { regOBA("CASEQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASEQTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Caseqty_Desc() { regOBD("CASEQTY"); return this; }

    protected ConditionValue _fractqty;
    public ConditionValue xdfgetFractqty()
    { if (_fractqty == null) { _fractqty = nCV(); }
      return _fractqty; }
    protected ConditionValue xgetCValueFractqty() { return xdfgetFractqty(); }

    /**
     * Add order-by as ascend. <br>
     * FRACTQTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Fractqty_Asc() { regOBA("FRACTQTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * FRACTQTY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Fractqty_Desc() { regOBD("FRACTQTY"); return this; }

    protected ConditionValue _shiptocd;
    public ConditionValue xdfgetShiptocd()
    { if (_shiptocd == null) { _shiptocd = nCV(); }
      return _shiptocd; }
    protected ConditionValue xgetCValueShiptocd() { return xdfgetShiptocd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPTOCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Shiptocd_Asc() { regOBA("SHIPTOCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPTOCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Shiptocd_Desc() { regOBD("SHIPTOCD"); return this; }

    protected ConditionValue _factorycd;
    public ConditionValue xdfgetFactorycd()
    { if (_factorycd == null) { _factorycd = nCV(); }
      return _factorycd; }
    protected ConditionValue xgetCValueFactorycd() { return xdfgetFactorycd(); }

    /**
     * Add order-by as ascend. <br>
     * FACTORYCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Factorycd_Asc() { regOBA("FACTORYCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FACTORYCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Factorycd_Desc() { regOBD("FACTORYCD"); return this; }

    protected ConditionValue _itemcdM;
    public ConditionValue xdfgetItemcdM()
    { if (_itemcdM == null) { _itemcdM = nCV(); }
      return _itemcdM; }
    protected ConditionValue xgetCValueItemcdM() { return xdfgetItemcdM(); }

    /**
     * Add order-by as ascend. <br>
     * ITEMCD_M: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ItemcdM_Asc() { regOBA("ITEMCD_M"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEMCD_M: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ItemcdM_Desc() { regOBD("ITEMCD_M"); return this; }

    protected ConditionValue _skucd;
    public ConditionValue xdfgetSkucd()
    { if (_skucd == null) { _skucd = nCV(); }
      return _skucd; }
    protected ConditionValue xgetCValueSkucd() { return xdfgetSkucd(); }

    /**
     * Add order-by as ascend. <br>
     * SKUCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Skucd_Asc() { regOBA("SKUCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SKUCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Skucd_Desc() { regOBD("SKUCD"); return this; }

    protected ConditionValue _destinationcd;
    public ConditionValue xdfgetDestinationcd()
    { if (_destinationcd == null) { _destinationcd = nCV(); }
      return _destinationcd; }
    protected ConditionValue xgetCValueDestinationcd() { return xdfgetDestinationcd(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATIONCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Destinationcd_Asc() { regOBA("DESTINATIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATIONCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Destinationcd_Desc() { regOBD("DESTINATIONCD"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_Manufacturecd_Asc() { regOBA("MANUFACTURECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUFACTURECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Manufacturecd_Desc() { regOBD("MANUFACTURECD"); return this; }

    protected ConditionValue _ordernoM;
    public ConditionValue xdfgetOrdernoM()
    { if (_ordernoM == null) { _ordernoM = nCV(); }
      return _ordernoM; }
    protected ConditionValue xgetCValueOrdernoM() { return xdfgetOrdernoM(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERNO_M: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_OrdernoM_Asc() { regOBA("ORDERNO_M"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERNO_M: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_OrdernoM_Desc() { regOBD("ORDERNO_M"); return this; }

    protected ConditionValue _machineno;
    public ConditionValue xdfgetMachineno()
    { if (_machineno == null) { _machineno = nCV(); }
      return _machineno; }
    protected ConditionValue xgetCValueMachineno() { return xdfgetMachineno(); }

    /**
     * Add order-by as ascend. <br>
     * MACHINENO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Machineno_Asc() { regOBA("MACHINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * MACHINENO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Machineno_Desc() { regOBD("MACHINENO"); return this; }

    protected ConditionValue _createno;
    public ConditionValue xdfgetCreateno()
    { if (_createno == null) { _createno = nCV(); }
      return _createno; }
    protected ConditionValue xgetCValueCreateno() { return xdfgetCreateno(); }

    /**
     * Add order-by as ascend. <br>
     * CREATENO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Createno_Asc() { regOBA("CREATENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATENO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Createno_Desc() { regOBD("CREATENO"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_Limitdate_Asc() { regOBA("LIMITDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMITDATE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Limitdate_Desc() { regOBD("LIMITDATE"); return this; }

    protected ConditionValue _caselot4;
    public ConditionValue xdfgetCaselot4()
    { if (_caselot4 == null) { _caselot4 = nCV(); }
      return _caselot4; }
    protected ConditionValue xgetCValueCaselot4() { return xdfgetCaselot4(); }

    /**
     * Add order-by as ascend. <br>
     * CASELOT4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Caselot4_Asc() { regOBA("CASELOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASELOT4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Caselot4_Desc() { regOBD("CASELOT4"); return this; }

    protected ConditionValue _distributioncd;
    public ConditionValue xdfgetDistributioncd()
    { if (_distributioncd == null) { _distributioncd = nCV(); }
      return _distributioncd; }
    protected ConditionValue xgetCValueDistributioncd() { return xdfgetDistributioncd(); }

    /**
     * Add order-by as ascend. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Distributioncd_Asc() { regOBA("DISTRIBUTIONCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Distributioncd_Desc() { regOBD("DISTRIBUTIONCD"); return this; }

    protected ConditionValue _palletid;
    public ConditionValue xdfgetPalletid()
    { if (_palletid == null) { _palletid = nCV(); }
      return _palletid; }
    protected ConditionValue xgetCValuePalletid() { return xdfgetPalletid(); }

    /**
     * Add order-by as ascend. <br>
     * PALLETID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Palletid_Asc() { regOBA("PALLETID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLETID: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_Palletid_Desc() { regOBD("PALLETID"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEShippingRecordDataCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEShippingRecordDataCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEShippingRecordDataCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEShippingRecordDataCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EShippingRecordDataCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EShippingRecordDataCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EShippingRecordDataCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EShippingRecordDataCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EShippingRecordDataCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EShippingRecordDataCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EShippingRecordDataCQ> _myselfExistsMap;
    public Map<String, EShippingRecordDataCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EShippingRecordDataCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EShippingRecordDataCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EShippingRecordDataCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EShippingRecordDataCB.class.getName(); }
    protected String xCQ() { return EShippingRecordDataCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
