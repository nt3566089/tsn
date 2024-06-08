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
 * The base condition-query of E_BONDED_SHIPPING_PLAN_BULK_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsEBondedShippingPlanBulkInputCQ extends AbstractBsEBondedShippingPlanBulkInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EBondedShippingPlanBulkInputCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEBondedShippingPlanBulkInputCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_BONDED_SHIPPING_PLAN_BULK_INPUT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EBondedShippingPlanBulkInputCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EBondedShippingPlanBulkInputCIQ xcreateCIQ() {
        EBondedShippingPlanBulkInputCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EBondedShippingPlanBulkInputCIQ xnewCIQ() {
        return new EBondedShippingPlanBulkInputCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_BONDED_SHIPPING_PLAN_BULK_INPUT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EBondedShippingPlanBulkInputCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EBondedShippingPlanBulkInputCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bondedShippingPlanBulkInputId;
    public ConditionValue xdfgetBondedShippingPlanBulkInputId()
    { if (_bondedShippingPlanBulkInputId == null) { _bondedShippingPlanBulkInputId = nCV(); }
      return _bondedShippingPlanBulkInputId; }
    protected ConditionValue xgetCValueBondedShippingPlanBulkInputId() { return xdfgetBondedShippingPlanBulkInputId(); }

    /**
     * Add order-by as ascend. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_BondedShippingPlanBulkInputId_Asc() { regOBA("BONDED_SHIPPING_PLAN_BULK_INPUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_BondedShippingPlanBulkInputId_Desc() { regOBD("BONDED_SHIPPING_PLAN_BULK_INPUT_ID"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _sbwarehousecd;
    public ConditionValue xdfgetSbwarehousecd()
    { if (_sbwarehousecd == null) { _sbwarehousecd = nCV(); }
      return _sbwarehousecd; }
    protected ConditionValue xgetCValueSbwarehousecd() { return xdfgetSbwarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Sbwarehousecd_Asc() { regOBA("SBWAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SBWAREHOUSECD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Sbwarehousecd_Desc() { regOBD("SBWAREHOUSECD"); return this; }

    protected ConditionValue _custorderno;
    public ConditionValue xdfgetCustorderno()
    { if (_custorderno == null) { _custorderno = nCV(); }
      return _custorderno; }
    protected ConditionValue xgetCValueCustorderno() { return xdfgetCustorderno(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTORDERNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Custorderno_Asc() { regOBA("CUSTORDERNO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTORDERNO: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Custorderno_Desc() { regOBD("CUSTORDERNO"); return this; }

    protected ConditionValue _ordertype;
    public ConditionValue xdfgetOrdertype()
    { if (_ordertype == null) { _ordertype = nCV(); }
      return _ordertype; }
    protected ConditionValue xgetCValueOrdertype() { return xdfgetOrdertype(); }

    /**
     * Add order-by as ascend. <br>
     * ORDERTYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Ordertype_Asc() { regOBA("ORDERTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDERTYPE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Ordertype_Desc() { regOBD("ORDERTYPE"); return this; }

    protected ConditionValue _shipcd;
    public ConditionValue xdfgetShipcd()
    { if (_shipcd == null) { _shipcd = nCV(); }
      return _shipcd; }
    protected ConditionValue xgetCValueShipcd() { return xdfgetShipcd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Shipcd_Asc() { regOBA("SHIPCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPCD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Shipcd_Desc() { regOBD("SHIPCD"); return this; }

    protected ConditionValue _carryoutplancd;
    public ConditionValue xdfgetCarryoutplancd()
    { if (_carryoutplancd == null) { _carryoutplancd = nCV(); }
      return _carryoutplancd; }
    protected ConditionValue xgetCValueCarryoutplancd() { return xdfgetCarryoutplancd(); }

    /**
     * Add order-by as ascend. <br>
     * CarryoutPlanCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Carryoutplancd_Asc() { regOBA("CarryoutPlanCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * CarryoutPlanCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Carryoutplancd_Desc() { regOBD("CarryoutPlanCd"); return this; }

    protected ConditionValue _shiptocd;
    public ConditionValue xdfgetShiptocd()
    { if (_shiptocd == null) { _shiptocd = nCV(); }
      return _shiptocd; }
    protected ConditionValue xgetCValueShiptocd() { return xdfgetShiptocd(); }

    /**
     * Add order-by as ascend. <br>
     * ShipToCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Shiptocd_Asc() { regOBA("ShipToCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * ShipToCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Shiptocd_Desc() { regOBD("ShipToCd"); return this; }

    protected ConditionValue _shiptonm;
    public ConditionValue xdfgetShiptonm()
    { if (_shiptonm == null) { _shiptonm = nCV(); }
      return _shiptonm; }
    protected ConditionValue xgetCValueShiptonm() { return xdfgetShiptonm(); }

    /**
     * Add order-by as ascend. <br>
     * ShipToNm: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Shiptonm_Asc() { regOBA("ShipToNm"); return this; }

    /**
     * Add order-by as descend. <br>
     * ShipToNm: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Shiptonm_Desc() { regOBD("ShipToNm"); return this; }

    protected ConditionValue _receiveplanym;
    public ConditionValue xdfgetReceiveplanym()
    { if (_receiveplanym == null) { _receiveplanym = nCV(); }
      return _receiveplanym; }
    protected ConditionValue xgetCValueReceiveplanym() { return xdfgetReceiveplanym(); }

    /**
     * Add order-by as ascend. <br>
     * ReceivePlanYm: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Receiveplanym_Asc() { regOBA("ReceivePlanYm"); return this; }

    /**
     * Add order-by as descend. <br>
     * ReceivePlanYm: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Receiveplanym_Desc() { regOBD("ReceivePlanYm"); return this; }

    protected ConditionValue _shtypecd;
    public ConditionValue xdfgetShtypecd()
    { if (_shtypecd == null) { _shtypecd = nCV(); }
      return _shtypecd; }
    protected ConditionValue xgetCValueShtypecd() { return xdfgetShtypecd(); }

    /**
     * Add order-by as ascend. <br>
     * ShTypeCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Shtypecd_Asc() { regOBA("ShTypeCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * ShTypeCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Shtypecd_Desc() { regOBD("ShTypeCd"); return this; }

    protected ConditionValue _shtypenm;
    public ConditionValue xdfgetShtypenm()
    { if (_shtypenm == null) { _shtypenm = nCV(); }
      return _shtypenm; }
    protected ConditionValue xgetCValueShtypenm() { return xdfgetShtypenm(); }

    /**
     * Add order-by as ascend. <br>
     * ShTypeNm: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Shtypenm_Asc() { regOBA("ShTypeNm"); return this; }

    /**
     * Add order-by as descend. <br>
     * ShTypeNm: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Shtypenm_Desc() { regOBD("ShTypeNm"); return this; }

    protected ConditionValue _refno;
    public ConditionValue xdfgetRefno()
    { if (_refno == null) { _refno = nCV(); }
      return _refno; }
    protected ConditionValue xgetCValueRefno() { return xdfgetRefno(); }

    /**
     * Add order-by as ascend. <br>
     * Refno: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Refno_Asc() { regOBA("Refno"); return this; }

    /**
     * Add order-by as descend. <br>
     * Refno: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Refno_Desc() { regOBD("Refno"); return this; }

    protected ConditionValue _pickingcomment;
    public ConditionValue xdfgetPickingcomment()
    { if (_pickingcomment == null) { _pickingcomment = nCV(); }
      return _pickingcomment; }
    protected ConditionValue xgetCValuePickingcomment() { return xdfgetPickingcomment(); }

    /**
     * Add order-by as ascend. <br>
     * PickingComment: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Pickingcomment_Asc() { regOBA("PickingComment"); return this; }

    /**
     * Add order-by as descend. <br>
     * PickingComment: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Pickingcomment_Desc() { regOBD("PickingComment"); return this; }

    protected ConditionValue _phoneno;
    public ConditionValue xdfgetPhoneno()
    { if (_phoneno == null) { _phoneno = nCV(); }
      return _phoneno; }
    protected ConditionValue xgetCValuePhoneno() { return xdfgetPhoneno(); }

    /**
     * Add order-by as ascend. <br>
     * PhoneNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Phoneno_Asc() { regOBA("PhoneNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * PhoneNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Phoneno_Desc() { regOBD("PhoneNo"); return this; }

    protected ConditionValue _batjmfym;
    public ConditionValue xdfgetBatjmfym()
    { if (_batjmfym == null) { _batjmfym = nCV(); }
      return _batjmfym; }
    protected ConditionValue xgetCValueBatjmfym() { return xdfgetBatjmfym(); }

    /**
     * Add order-by as ascend. <br>
     * BATJMfYm: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Batjmfym_Asc() { regOBA("BATJMfYm"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATJMfYm: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Batjmfym_Desc() { regOBD("BATJMfYm"); return this; }

    protected ConditionValue _rmano;
    public ConditionValue xdfgetRmano()
    { if (_rmano == null) { _rmano = nCV(); }
      return _rmano; }
    protected ConditionValue xgetCValueRmano() { return xdfgetRmano(); }

    /**
     * Add order-by as ascend. <br>
     * RmaNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Rmano_Asc() { regOBA("RmaNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * RmaNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Rmano_Desc() { regOBD("RmaNo"); return this; }

    protected ConditionValue _ownerorderno;
    public ConditionValue xdfgetOwnerorderno()
    { if (_ownerorderno == null) { _ownerorderno = nCV(); }
      return _ownerorderno; }
    protected ConditionValue xgetCValueOwnerorderno() { return xdfgetOwnerorderno(); }

    /**
     * Add order-by as ascend. <br>
     * OwnerOrderNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Ownerorderno_Asc() { regOBA("OwnerOrderNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * OwnerOrderNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Ownerorderno_Desc() { regOBD("OwnerOrderNo"); return this; }

    protected ConditionValue _palletno;
    public ConditionValue xdfgetPalletno()
    { if (_palletno == null) { _palletno = nCV(); }
      return _palletno; }
    protected ConditionValue xgetCValuePalletno() { return xdfgetPalletno(); }

    /**
     * Add order-by as ascend. <br>
     * PalletNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Palletno_Asc() { regOBA("PalletNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * PalletNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Palletno_Desc() { regOBD("PalletNo"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _designcd;
    public ConditionValue xdfgetDesigncd()
    { if (_designcd == null) { _designcd = nCV(); }
      return _designcd; }
    protected ConditionValue xgetCValueDesigncd() { return xdfgetDesigncd(); }

    /**
     * Add order-by as ascend. <br>
     * DesignCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Designcd_Asc() { regOBA("DesignCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * DesignCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Designcd_Desc() { regOBD("DesignCd"); return this; }

    protected ConditionValue _manufactureym;
    public ConditionValue xdfgetManufactureym()
    { if (_manufactureym == null) { _manufactureym = nCV(); }
      return _manufactureym; }
    protected ConditionValue xgetCValueManufactureym() { return xdfgetManufactureym(); }

    /**
     * Add order-by as ascend. <br>
     * ManufactureYm: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Manufactureym_Asc() { regOBA("ManufactureYm"); return this; }

    /**
     * Add order-by as descend. <br>
     * ManufactureYm: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Manufactureym_Desc() { regOBD("ManufactureYm"); return this; }

    protected ConditionValue _firmcarryno;
    public ConditionValue xdfgetFirmcarryno()
    { if (_firmcarryno == null) { _firmcarryno = nCV(); }
      return _firmcarryno; }
    protected ConditionValue xgetCValueFirmcarryno() { return xdfgetFirmcarryno(); }

    /**
     * Add order-by as ascend. <br>
     * FirmcarryNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Firmcarryno_Asc() { regOBA("FirmcarryNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * FirmcarryNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Firmcarryno_Desc() { regOBD("FirmcarryNo"); return this; }

    protected ConditionValue _qty;
    public ConditionValue xdfgetQty()
    { if (_qty == null) { _qty = nCV(); }
      return _qty; }
    protected ConditionValue xgetCValueQty() { return xdfgetQty(); }

    /**
     * Add order-by as ascend. <br>
     * Qty: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Qty_Asc() { regOBA("Qty"); return this; }

    /**
     * Add order-by as descend. <br>
     * Qty: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Qty_Desc() { regOBD("Qty"); return this; }

    protected ConditionValue _inoutkbn;
    public ConditionValue xdfgetInoutkbn()
    { if (_inoutkbn == null) { _inoutkbn = nCV(); }
      return _inoutkbn; }
    protected ConditionValue xgetCValueInoutkbn() { return xdfgetInoutkbn(); }

    /**
     * Add order-by as ascend. <br>
     * InOutKbn: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Inoutkbn_Asc() { regOBA("InOutKbn"); return this; }

    /**
     * Add order-by as descend. <br>
     * InOutKbn: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Inoutkbn_Desc() { regOBD("InOutKbn"); return this; }

    protected ConditionValue _stocktype;
    public ConditionValue xdfgetStocktype()
    { if (_stocktype == null) { _stocktype = nCV(); }
      return _stocktype; }
    protected ConditionValue xgetCValueStocktype() { return xdfgetStocktype(); }

    /**
     * Add order-by as ascend. <br>
     * StockType: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Stocktype_Asc() { regOBA("StockType"); return this; }

    /**
     * Add order-by as descend. <br>
     * StockType: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Stocktype_Desc() { regOBD("StockType"); return this; }

    protected ConditionValue _customsreleasedate;
    public ConditionValue xdfgetCustomsreleasedate()
    { if (_customsreleasedate == null) { _customsreleasedate = nCV(); }
      return _customsreleasedate; }
    protected ConditionValue xgetCValueCustomsreleasedate() { return xdfgetCustomsreleasedate(); }

    /**
     * Add order-by as ascend. <br>
     * CustomsReleaseDate: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Customsreleasedate_Asc() { regOBA("CustomsReleaseDate"); return this; }

    /**
     * Add order-by as descend. <br>
     * CustomsReleaseDate: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Customsreleasedate_Desc() { regOBD("CustomsReleaseDate"); return this; }

    protected ConditionValue _suppliercvno;
    public ConditionValue xdfgetSuppliercvno()
    { if (_suppliercvno == null) { _suppliercvno = nCV(); }
      return _suppliercvno; }
    protected ConditionValue xgetCValueSuppliercvno() { return xdfgetSuppliercvno(); }

    /**
     * Add order-by as ascend. <br>
     * SupplierCvNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Suppliercvno_Asc() { regOBA("SupplierCvNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * SupplierCvNo: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Suppliercvno_Desc() { regOBD("SupplierCvNo"); return this; }

    protected ConditionValue _ifitemcd;
    public ConditionValue xdfgetIfitemcd()
    { if (_ifitemcd == null) { _ifitemcd = nCV(); }
      return _ifitemcd; }
    protected ConditionValue xgetCValueIfitemcd() { return xdfgetIfitemcd(); }

    /**
     * Add order-by as ascend. <br>
     * IfItemCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Ifitemcd_Asc() { regOBA("IfItemCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * IfItemCd: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Ifitemcd_Desc() { regOBD("IfItemCd"); return this; }

    protected ConditionValue _sendflg;
    public ConditionValue xdfgetSendflg()
    { if (_sendflg == null) { _sendflg = nCV(); }
      return _sendflg; }
    protected ConditionValue xgetCValueSendflg() { return xdfgetSendflg(); }

    /**
     * Add order-by as ascend. <br>
     * SendFlg: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Sendflg_Asc() { regOBA("SendFlg"); return this; }

    /**
     * Add order-by as descend. <br>
     * SendFlg: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Sendflg_Desc() { regOBD("SendFlg"); return this; }

    protected ConditionValue _palletorder;
    public ConditionValue xdfgetPalletorder()
    { if (_palletorder == null) { _palletorder = nCV(); }
      return _palletorder; }
    protected ConditionValue xgetCValuePalletorder() { return xdfgetPalletorder(); }

    /**
     * Add order-by as ascend. <br>
     * PalletOrder: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Palletorder_Asc() { regOBA("PalletOrder"); return this; }

    /**
     * Add order-by as descend. <br>
     * PalletOrder: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Palletorder_Desc() { regOBD("PalletOrder"); return this; }

    protected ConditionValue _pallettype;
    public ConditionValue xdfgetPallettype()
    { if (_pallettype == null) { _pallettype = nCV(); }
      return _pallettype; }
    protected ConditionValue xgetCValuePallettype() { return xdfgetPallettype(); }

    /**
     * Add order-by as ascend. <br>
     * PalletType: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Pallettype_Asc() { regOBA("PalletType"); return this; }

    /**
     * Add order-by as descend. <br>
     * PalletType: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_Pallettype_Desc() { regOBD("PalletType"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEBondedShippingPlanBulkInputCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEBondedShippingPlanBulkInputCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EBondedShippingPlanBulkInputCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EBondedShippingPlanBulkInputCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EBondedShippingPlanBulkInputCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EBondedShippingPlanBulkInputCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EBondedShippingPlanBulkInputCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EBondedShippingPlanBulkInputCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EBondedShippingPlanBulkInputCQ> _myselfExistsMap;
    public Map<String, EBondedShippingPlanBulkInputCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EBondedShippingPlanBulkInputCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EBondedShippingPlanBulkInputCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EBondedShippingPlanBulkInputCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EBondedShippingPlanBulkInputCB.class.getName(); }
    protected String xCQ() { return EBondedShippingPlanBulkInputCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
