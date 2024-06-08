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
 * The base condition-query of T_YAHOO_ORDER.
 * @author DBFlute(AutoGenerator)
 */
public class BsTYahooOrderCQ extends AbstractBsTYahooOrderCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TYahooOrderCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTYahooOrderCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_YAHOO_ORDER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TYahooOrderCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TYahooOrderCIQ xcreateCIQ() {
        TYahooOrderCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TYahooOrderCIQ xnewCIQ() {
        return new TYahooOrderCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_YAHOO_ORDER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TYahooOrderCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TYahooOrderCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _yahooOrderId;
    public ConditionValue xdfgetYahooOrderId()
    { if (_yahooOrderId == null) { _yahooOrderId = nCV(); }
      return _yahooOrderId; }
    protected ConditionValue xgetCValueYahooOrderId() { return xdfgetYahooOrderId(); }

    /**
     * Add order-by as ascend. <br>
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_YahooOrderId_Asc() { regOBA("YAHOO_ORDER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_YahooOrderId_Desc() { regOBD("YAHOO_ORDER_ID"); return this; }

    protected ConditionValue _orderId;
    public ConditionValue xdfgetOrderId()
    { if (_orderId == null) { _orderId = nCV(); }
      return _orderId; }
    protected ConditionValue xgetCValueOrderId() { return xdfgetOrderId(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_OrderId_Asc() { regOBA("ORDER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_OrderId_Desc() { regOBD("ORDER_ID"); return this; }

    protected ConditionValue _parentOrderId;
    public ConditionValue xdfgetParentOrderId()
    { if (_parentOrderId == null) { _parentOrderId = nCV(); }
      return _parentOrderId; }
    protected ConditionValue xgetCValueParentOrderId() { return xdfgetParentOrderId(); }

    /**
     * Add order-by as ascend. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ParentOrderId_Asc() { regOBA("PARENT_ORDER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PARENT_ORDER_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ParentOrderId_Desc() { regOBD("PARENT_ORDER_ID"); return this; }

    protected ConditionValue _deviceType;
    public ConditionValue xdfgetDeviceType()
    { if (_deviceType == null) { _deviceType = nCV(); }
      return _deviceType; }
    protected ConditionValue xgetCValueDeviceType() { return xdfgetDeviceType(); }

    /**
     * Add order-by as ascend. <br>
     * DEVICE_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_DeviceType_Asc() { regOBA("DEVICE_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEVICE_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_DeviceType_Desc() { regOBD("DEVICE_TYPE"); return this; }

    protected ConditionValue _isAffiliate;
    public ConditionValue xdfgetIsAffiliate()
    { if (_isAffiliate == null) { _isAffiliate = nCV(); }
      return _isAffiliate; }
    protected ConditionValue xgetCValueIsAffiliate() { return xdfgetIsAffiliate(); }

    /**
     * Add order-by as ascend. <br>
     * IS_AFFILIATE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_IsAffiliate_Asc() { regOBA("IS_AFFILIATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * IS_AFFILIATE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_IsAffiliate_Desc() { regOBD("IS_AFFILIATE"); return this; }

    protected ConditionValue _fspLicenseCode;
    public ConditionValue xdfgetFspLicenseCode()
    { if (_fspLicenseCode == null) { _fspLicenseCode = nCV(); }
      return _fspLicenseCode; }
    protected ConditionValue xgetCValueFspLicenseCode() { return xdfgetFspLicenseCode(); }

    /**
     * Add order-by as ascend. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_FspLicenseCode_Asc() { regOBA("FSP_LICENSE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * FSP_LICENSE_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_FspLicenseCode_Desc() { regOBD("FSP_LICENSE_CODE"); return this; }

    protected ConditionValue _fspLicenseName;
    public ConditionValue xdfgetFspLicenseName()
    { if (_fspLicenseName == null) { _fspLicenseName = nCV(); }
      return _fspLicenseName; }
    protected ConditionValue xgetCValueFspLicenseName() { return xdfgetFspLicenseName(); }

    /**
     * Add order-by as ascend. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_FspLicenseName_Asc() { regOBA("FSP_LICENSE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * FSP_LICENSE_NAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_FspLicenseName_Desc() { regOBD("FSP_LICENSE_NAME"); return this; }

    protected ConditionValue _orderTime;
    public ConditionValue xdfgetOrderTime()
    { if (_orderTime == null) { _orderTime = nCV(); }
      return _orderTime; }
    protected ConditionValue xgetCValueOrderTime() { return xdfgetOrderTime(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_TIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_OrderTime_Asc() { regOBA("ORDER_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_TIME: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_OrderTime_Desc() { regOBD("ORDER_TIME"); return this; }

    protected ConditionValue _orderTimeUnixEpoch;
    public ConditionValue xdfgetOrderTimeUnixEpoch()
    { if (_orderTimeUnixEpoch == null) { _orderTimeUnixEpoch = nCV(); }
      return _orderTimeUnixEpoch; }
    protected ConditionValue xgetCValueOrderTimeUnixEpoch() { return xdfgetOrderTimeUnixEpoch(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_OrderTimeUnixEpoch_Asc() { regOBA("ORDER_TIME_UNIX_EPOCH"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_OrderTimeUnixEpoch_Desc() { regOBD("ORDER_TIME_UNIX_EPOCH"); return this; }

    protected ConditionValue _usePointType;
    public ConditionValue xdfgetUsePointType()
    { if (_usePointType == null) { _usePointType = nCV(); }
      return _usePointType; }
    protected ConditionValue xgetCValueUsePointType() { return xdfgetUsePointType(); }

    /**
     * Add order-by as ascend. <br>
     * USE_POINT_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_UsePointType_Asc() { regOBA("USE_POINT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * USE_POINT_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_UsePointType_Desc() { regOBD("USE_POINT_TYPE"); return this; }

    protected ConditionValue _orderStatus;
    public ConditionValue xdfgetOrderStatus()
    { if (_orderStatus == null) { _orderStatus = nCV(); }
      return _orderStatus; }
    protected ConditionValue xgetCValueOrderStatus() { return xdfgetOrderStatus(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_STATUS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_OrderStatus_Asc() { regOBA("ORDER_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_STATUS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_OrderStatus_Desc() { regOBD("ORDER_STATUS"); return this; }

    protected ConditionValue _storeStatus;
    public ConditionValue xdfgetStoreStatus()
    { if (_storeStatus == null) { _storeStatus = nCV(); }
      return _storeStatus; }
    protected ConditionValue xgetCValueStoreStatus() { return xdfgetStoreStatus(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_STATUS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_StoreStatus_Asc() { regOBA("STORE_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_STATUS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_StoreStatus_Desc() { regOBD("STORE_STATUS"); return this; }

    protected ConditionValue _referer;
    public ConditionValue xdfgetReferer()
    { if (_referer == null) { _referer = nCV(); }
      return _referer; }
    protected ConditionValue xgetCValueReferer() { return xdfgetReferer(); }

    /**
     * Add order-by as ascend. <br>
     * REFERER: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Referer_Asc() { regOBA("REFERER"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFERER: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Referer_Desc() { regOBD("REFERER"); return this; }

    protected ConditionValue _entryPoint;
    public ConditionValue xdfgetEntryPoint()
    { if (_entryPoint == null) { _entryPoint = nCV(); }
      return _entryPoint; }
    protected ConditionValue xgetCValueEntryPoint() { return xdfgetEntryPoint(); }

    /**
     * Add order-by as ascend. <br>
     * ENTRY_POINT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_EntryPoint_Asc() { regOBA("ENTRY_POINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ENTRY_POINT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_EntryPoint_Desc() { regOBD("ENTRY_POINT"); return this; }

    protected ConditionValue _clink;
    public ConditionValue xdfgetClink()
    { if (_clink == null) { _clink = nCV(); }
      return _clink; }
    protected ConditionValue xgetCValueClink() { return xdfgetClink(); }

    /**
     * Add order-by as ascend. <br>
     * CLINK: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Clink_Asc() { regOBA("CLINK"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLINK: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Clink_Desc() { regOBD("CLINK"); return this; }

    protected ConditionValue _suspectMessage;
    public ConditionValue xdfgetSuspectMessage()
    { if (_suspectMessage == null) { _suspectMessage = nCV(); }
      return _suspectMessage; }
    protected ConditionValue xgetCValueSuspectMessage() { return xdfgetSuspectMessage(); }

    /**
     * Add order-by as ascend. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SuspectMessage_Asc() { regOBA("SUSPECT_MESSAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUSPECT_MESSAGE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SuspectMessage_Desc() { regOBD("SUSPECT_MESSAGE"); return this; }

    protected ConditionValue _isItemCoupon;
    public ConditionValue xdfgetIsItemCoupon()
    { if (_isItemCoupon == null) { _isItemCoupon = nCV(); }
      return _isItemCoupon; }
    protected ConditionValue xgetCValueIsItemCoupon() { return xdfgetIsItemCoupon(); }

    /**
     * Add order-by as ascend. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_IsItemCoupon_Asc() { regOBA("IS_ITEM_COUPON"); return this; }

    /**
     * Add order-by as descend. <br>
     * IS_ITEM_COUPON: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_IsItemCoupon_Desc() { regOBD("IS_ITEM_COUPON"); return this; }

    protected ConditionValue _isShippingCoupon;
    public ConditionValue xdfgetIsShippingCoupon()
    { if (_isShippingCoupon == null) { _isShippingCoupon = nCV(); }
      return _isShippingCoupon; }
    protected ConditionValue xgetCValueIsShippingCoupon() { return xdfgetIsShippingCoupon(); }

    /**
     * Add order-by as ascend. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_IsShippingCoupon_Asc() { regOBA("IS_SHIPPING_COUPON"); return this; }

    /**
     * Add order-by as descend. <br>
     * IS_SHIPPING_COUPON: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_IsShippingCoupon_Desc() { regOBD("IS_SHIPPING_COUPON"); return this; }

    protected ConditionValue _shipName;
    public ConditionValue xdfgetShipName()
    { if (_shipName == null) { _shipName = nCV(); }
      return _shipName; }
    protected ConditionValue xgetCValueShipName() { return xdfgetShipName(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipName_Asc() { regOBA("SHIP_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipName_Desc() { regOBD("SHIP_NAME"); return this; }

    protected ConditionValue _shipFirstName;
    public ConditionValue xdfgetShipFirstName()
    { if (_shipFirstName == null) { _shipFirstName = nCV(); }
      return _shipFirstName; }
    protected ConditionValue xgetCValueShipFirstName() { return xdfgetShipFirstName(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipFirstName_Asc() { regOBA("SHIP_FIRST_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_FIRST_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipFirstName_Desc() { regOBD("SHIP_FIRST_NAME"); return this; }

    protected ConditionValue _shipLastName;
    public ConditionValue xdfgetShipLastName()
    { if (_shipLastName == null) { _shipLastName = nCV(); }
      return _shipLastName; }
    protected ConditionValue xgetCValueShipLastName() { return xdfgetShipLastName(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipLastName_Asc() { regOBA("SHIP_LAST_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_LAST_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipLastName_Desc() { regOBD("SHIP_LAST_NAME"); return this; }

    protected ConditionValue _shipAddress1;
    public ConditionValue xdfgetShipAddress1()
    { if (_shipAddress1 == null) { _shipAddress1 = nCV(); }
      return _shipAddress1; }
    protected ConditionValue xgetCValueShipAddress1() { return xdfgetShipAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipAddress1_Asc() { regOBA("SHIP_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipAddress1_Desc() { regOBD("SHIP_ADDRESS1"); return this; }

    protected ConditionValue _shipAddress2;
    public ConditionValue xdfgetShipAddress2()
    { if (_shipAddress2 == null) { _shipAddress2 = nCV(); }
      return _shipAddress2; }
    protected ConditionValue xgetCValueShipAddress2() { return xdfgetShipAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipAddress2_Asc() { regOBA("SHIP_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipAddress2_Desc() { regOBD("SHIP_ADDRESS2"); return this; }

    protected ConditionValue _shipCity;
    public ConditionValue xdfgetShipCity()
    { if (_shipCity == null) { _shipCity = nCV(); }
      return _shipCity; }
    protected ConditionValue xgetCValueShipCity() { return xdfgetShipCity(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_CITY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipCity_Asc() { regOBA("SHIP_CITY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_CITY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipCity_Desc() { regOBD("SHIP_CITY"); return this; }

    protected ConditionValue _shipPrefecture;
    public ConditionValue xdfgetShipPrefecture()
    { if (_shipPrefecture == null) { _shipPrefecture = nCV(); }
      return _shipPrefecture; }
    protected ConditionValue xgetCValueShipPrefecture() { return xdfgetShipPrefecture(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipPrefecture_Asc() { regOBA("SHIP_PREFECTURE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_PREFECTURE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipPrefecture_Desc() { regOBD("SHIP_PREFECTURE"); return this; }

    protected ConditionValue _shipZipCode;
    public ConditionValue xdfgetShipZipCode()
    { if (_shipZipCode == null) { _shipZipCode = nCV(); }
      return _shipZipCode; }
    protected ConditionValue xgetCValueShipZipCode() { return xdfgetShipZipCode(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipZipCode_Asc() { regOBA("SHIP_ZIP_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_ZIP_CODE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipZipCode_Desc() { regOBD("SHIP_ZIP_CODE"); return this; }

    protected ConditionValue _shipNameKana;
    public ConditionValue xdfgetShipNameKana()
    { if (_shipNameKana == null) { _shipNameKana = nCV(); }
      return _shipNameKana; }
    protected ConditionValue xgetCValueShipNameKana() { return xdfgetShipNameKana(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipNameKana_Asc() { regOBA("SHIP_NAME_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipNameKana_Desc() { regOBD("SHIP_NAME_KANA"); return this; }

    protected ConditionValue _shipFirstNameKana;
    public ConditionValue xdfgetShipFirstNameKana()
    { if (_shipFirstNameKana == null) { _shipFirstNameKana = nCV(); }
      return _shipFirstNameKana; }
    protected ConditionValue xgetCValueShipFirstNameKana() { return xdfgetShipFirstNameKana(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipFirstNameKana_Asc() { regOBA("SHIP_FIRST_NAME_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipFirstNameKana_Desc() { regOBD("SHIP_FIRST_NAME_KANA"); return this; }

    protected ConditionValue _shipLastNameKana;
    public ConditionValue xdfgetShipLastNameKana()
    { if (_shipLastNameKana == null) { _shipLastNameKana = nCV(); }
      return _shipLastNameKana; }
    protected ConditionValue xgetCValueShipLastNameKana() { return xdfgetShipLastNameKana(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipLastNameKana_Asc() { regOBA("SHIP_LAST_NAME_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipLastNameKana_Desc() { regOBD("SHIP_LAST_NAME_KANA"); return this; }

    protected ConditionValue _shipAddress1Kana;
    public ConditionValue xdfgetShipAddress1Kana()
    { if (_shipAddress1Kana == null) { _shipAddress1Kana = nCV(); }
      return _shipAddress1Kana; }
    protected ConditionValue xgetCValueShipAddress1Kana() { return xdfgetShipAddress1Kana(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipAddress1Kana_Asc() { regOBA("SHIP_ADDRESS1_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipAddress1Kana_Desc() { regOBD("SHIP_ADDRESS1_KANA"); return this; }

    protected ConditionValue _shipAddress2Kana;
    public ConditionValue xdfgetShipAddress2Kana()
    { if (_shipAddress2Kana == null) { _shipAddress2Kana = nCV(); }
      return _shipAddress2Kana; }
    protected ConditionValue xgetCValueShipAddress2Kana() { return xdfgetShipAddress2Kana(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipAddress2Kana_Asc() { regOBA("SHIP_ADDRESS2_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipAddress2Kana_Desc() { regOBD("SHIP_ADDRESS2_KANA"); return this; }

    protected ConditionValue _shipCityKana;
    public ConditionValue xdfgetShipCityKana()
    { if (_shipCityKana == null) { _shipCityKana = nCV(); }
      return _shipCityKana; }
    protected ConditionValue xgetCValueShipCityKana() { return xdfgetShipCityKana(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipCityKana_Asc() { regOBA("SHIP_CITY_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_CITY_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipCityKana_Desc() { regOBD("SHIP_CITY_KANA"); return this; }

    protected ConditionValue _shipPrefectureKana;
    public ConditionValue xdfgetShipPrefectureKana()
    { if (_shipPrefectureKana == null) { _shipPrefectureKana = nCV(); }
      return _shipPrefectureKana; }
    protected ConditionValue xgetCValueShipPrefectureKana() { return xdfgetShipPrefectureKana(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipPrefectureKana_Asc() { regOBA("SHIP_PREFECTURE_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipPrefectureKana_Desc() { regOBD("SHIP_PREFECTURE_KANA"); return this; }

    protected ConditionValue _shipSection1Field;
    public ConditionValue xdfgetShipSection1Field()
    { if (_shipSection1Field == null) { _shipSection1Field = nCV(); }
      return _shipSection1Field; }
    protected ConditionValue xgetCValueShipSection1Field() { return xdfgetShipSection1Field(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipSection1Field_Asc() { regOBA("SHIP_SECTION1_FIELD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_SECTION1_FIELD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipSection1Field_Desc() { regOBD("SHIP_SECTION1_FIELD"); return this; }

    protected ConditionValue _shipSection1Value;
    public ConditionValue xdfgetShipSection1Value()
    { if (_shipSection1Value == null) { _shipSection1Value = nCV(); }
      return _shipSection1Value; }
    protected ConditionValue xgetCValueShipSection1Value() { return xdfgetShipSection1Value(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipSection1Value_Asc() { regOBA("SHIP_SECTION1_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_SECTION1_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipSection1Value_Desc() { regOBD("SHIP_SECTION1_VALUE"); return this; }

    protected ConditionValue _shipSection2Field;
    public ConditionValue xdfgetShipSection2Field()
    { if (_shipSection2Field == null) { _shipSection2Field = nCV(); }
      return _shipSection2Field; }
    protected ConditionValue xgetCValueShipSection2Field() { return xdfgetShipSection2Field(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipSection2Field_Asc() { regOBA("SHIP_SECTION2_FIELD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_SECTION2_FIELD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipSection2Field_Desc() { regOBD("SHIP_SECTION2_FIELD"); return this; }

    protected ConditionValue _shipSection2Value;
    public ConditionValue xdfgetShipSection2Value()
    { if (_shipSection2Value == null) { _shipSection2Value = nCV(); }
      return _shipSection2Value; }
    protected ConditionValue xgetCValueShipSection2Value() { return xdfgetShipSection2Value(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipSection2Value_Asc() { regOBA("SHIP_SECTION2_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_SECTION2_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipSection2Value_Desc() { regOBD("SHIP_SECTION2_VALUE"); return this; }

    protected ConditionValue _shipPhoneNumber;
    public ConditionValue xdfgetShipPhoneNumber()
    { if (_shipPhoneNumber == null) { _shipPhoneNumber = nCV(); }
      return _shipPhoneNumber; }
    protected ConditionValue xgetCValueShipPhoneNumber() { return xdfgetShipPhoneNumber(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipPhoneNumber_Asc() { regOBA("SHIP_PHONE_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipPhoneNumber_Desc() { regOBD("SHIP_PHONE_NUMBER"); return this; }

    protected ConditionValue _shipEmgPhoneNumber;
    public ConditionValue xdfgetShipEmgPhoneNumber()
    { if (_shipEmgPhoneNumber == null) { _shipEmgPhoneNumber = nCV(); }
      return _shipEmgPhoneNumber; }
    protected ConditionValue xgetCValueShipEmgPhoneNumber() { return xdfgetShipEmgPhoneNumber(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipEmgPhoneNumber_Asc() { regOBA("SHIP_EMG_PHONE_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipEmgPhoneNumber_Desc() { regOBD("SHIP_EMG_PHONE_NUMBER"); return this; }

    protected ConditionValue _shipMethod;
    public ConditionValue xdfgetShipMethod()
    { if (_shipMethod == null) { _shipMethod = nCV(); }
      return _shipMethod; }
    protected ConditionValue xgetCValueShipMethod() { return xdfgetShipMethod(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_METHOD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipMethod_Asc() { regOBA("SHIP_METHOD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_METHOD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipMethod_Desc() { regOBD("SHIP_METHOD"); return this; }

    protected ConditionValue _shipMethodName;
    public ConditionValue xdfgetShipMethodName()
    { if (_shipMethodName == null) { _shipMethodName = nCV(); }
      return _shipMethodName; }
    protected ConditionValue xgetCValueShipMethodName() { return xdfgetShipMethodName(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipMethodName_Asc() { regOBA("SHIP_METHOD_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_METHOD_NAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipMethodName_Desc() { regOBD("SHIP_METHOD_NAME"); return this; }

    protected ConditionValue _shipRequestDate;
    public ConditionValue xdfgetShipRequestDate()
    { if (_shipRequestDate == null) { _shipRequestDate = nCV(); }
      return _shipRequestDate; }
    protected ConditionValue xgetCValueShipRequestDate() { return xdfgetShipRequestDate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipRequestDate_Asc() { regOBA("SHIP_REQUEST_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_REQUEST_DATE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipRequestDate_Desc() { regOBD("SHIP_REQUEST_DATE"); return this; }

    protected ConditionValue _shipRequestTime;
    public ConditionValue xdfgetShipRequestTime()
    { if (_shipRequestTime == null) { _shipRequestTime = nCV(); }
      return _shipRequestTime; }
    protected ConditionValue xgetCValueShipRequestTime() { return xdfgetShipRequestTime(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipRequestTime_Asc() { regOBA("SHIP_REQUEST_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_REQUEST_TIME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipRequestTime_Desc() { regOBD("SHIP_REQUEST_TIME"); return this; }

    protected ConditionValue _shipNotes;
    public ConditionValue xdfgetShipNotes()
    { if (_shipNotes == null) { _shipNotes = nCV(); }
      return _shipNotes; }
    protected ConditionValue xgetCValueShipNotes() { return xdfgetShipNotes(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_NOTES: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipNotes_Asc() { regOBA("SHIP_NOTES"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_NOTES: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipNotes_Desc() { regOBD("SHIP_NOTES"); return this; }

    protected ConditionValue _arriveType;
    public ConditionValue xdfgetArriveType()
    { if (_arriveType == null) { _arriveType = nCV(); }
      return _arriveType; }
    protected ConditionValue xgetCValueArriveType() { return xdfgetArriveType(); }

    /**
     * Add order-by as ascend. <br>
     * ARRIVE_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ArriveType_Asc() { regOBA("ARRIVE_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARRIVE_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ArriveType_Desc() { regOBD("ARRIVE_TYPE"); return this; }

    protected ConditionValue _shipInvoiceNumber1;
    public ConditionValue xdfgetShipInvoiceNumber1()
    { if (_shipInvoiceNumber1 == null) { _shipInvoiceNumber1 = nCV(); }
      return _shipInvoiceNumber1; }
    protected ConditionValue xgetCValueShipInvoiceNumber1() { return xdfgetShipInvoiceNumber1(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipInvoiceNumber1_Asc() { regOBA("SHIP_INVOICE_NUMBER1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipInvoiceNumber1_Desc() { regOBD("SHIP_INVOICE_NUMBER1"); return this; }

    protected ConditionValue _shipInvoiceNumber2;
    public ConditionValue xdfgetShipInvoiceNumber2()
    { if (_shipInvoiceNumber2 == null) { _shipInvoiceNumber2 = nCV(); }
      return _shipInvoiceNumber2; }
    protected ConditionValue xgetCValueShipInvoiceNumber2() { return xdfgetShipInvoiceNumber2(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipInvoiceNumber2_Asc() { regOBA("SHIP_INVOICE_NUMBER2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipInvoiceNumber2_Desc() { regOBD("SHIP_INVOICE_NUMBER2"); return this; }

    protected ConditionValue _shipUrl;
    public ConditionValue xdfgetShipUrl()
    { if (_shipUrl == null) { _shipUrl = nCV(); }
      return _shipUrl; }
    protected ConditionValue xgetCValueShipUrl() { return xdfgetShipUrl(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_URL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipUrl_Asc() { regOBA("SHIP_URL"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_URL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipUrl_Desc() { regOBD("SHIP_URL"); return this; }

    protected ConditionValue _shipDate;
    public ConditionValue xdfgetShipDate()
    { if (_shipDate == null) { _shipDate = nCV(); }
      return _shipDate; }
    protected ConditionValue xgetCValueShipDate() { return xdfgetShipDate(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipDate_Asc() { regOBA("SHIP_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipDate_Desc() { regOBD("SHIP_DATE"); return this; }

    protected ConditionValue _giftWrapType;
    public ConditionValue xdfgetGiftWrapType()
    { if (_giftWrapType == null) { _giftWrapType = nCV(); }
      return _giftWrapType; }
    protected ConditionValue xgetCValueGiftWrapType() { return xdfgetGiftWrapType(); }

    /**
     * Add order-by as ascend. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GiftWrapType_Asc() { regOBA("GIFT_WRAP_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIFT_WRAP_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GiftWrapType_Desc() { regOBD("GIFT_WRAP_TYPE"); return this; }

    protected ConditionValue _giftWrapPaperType;
    public ConditionValue xdfgetGiftWrapPaperType()
    { if (_giftWrapPaperType == null) { _giftWrapPaperType = nCV(); }
      return _giftWrapPaperType; }
    protected ConditionValue xgetCValueGiftWrapPaperType() { return xdfgetGiftWrapPaperType(); }

    /**
     * Add order-by as ascend. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GiftWrapPaperType_Asc() { regOBA("GIFT_WRAP_PAPER_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GiftWrapPaperType_Desc() { regOBD("GIFT_WRAP_PAPER_TYPE"); return this; }

    protected ConditionValue _giftWrapName;
    public ConditionValue xdfgetGiftWrapName()
    { if (_giftWrapName == null) { _giftWrapName = nCV(); }
      return _giftWrapName; }
    protected ConditionValue xgetCValueGiftWrapName() { return xdfgetGiftWrapName(); }

    /**
     * Add order-by as ascend. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GiftWrapName_Asc() { regOBA("GIFT_WRAP_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIFT_WRAP_NAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GiftWrapName_Desc() { regOBD("GIFT_WRAP_NAME"); return this; }

    protected ConditionValue _needBillSlip;
    public ConditionValue xdfgetNeedBillSlip()
    { if (_needBillSlip == null) { _needBillSlip = nCV(); }
      return _needBillSlip; }
    protected ConditionValue xgetCValueNeedBillSlip() { return xdfgetNeedBillSlip(); }

    /**
     * Add order-by as ascend. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_NeedBillSlip_Asc() { regOBA("NEED_BILL_SLIP"); return this; }

    /**
     * Add order-by as descend. <br>
     * NEED_BILL_SLIP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_NeedBillSlip_Desc() { regOBD("NEED_BILL_SLIP"); return this; }

    protected ConditionValue _needDetailedSlip;
    public ConditionValue xdfgetNeedDetailedSlip()
    { if (_needDetailedSlip == null) { _needDetailedSlip = nCV(); }
      return _needDetailedSlip; }
    protected ConditionValue xgetCValueNeedDetailedSlip() { return xdfgetNeedDetailedSlip(); }

    /**
     * Add order-by as ascend. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_NeedDetailedSlip_Asc() { regOBA("NEED_DETAILED_SLIP"); return this; }

    /**
     * Add order-by as descend. <br>
     * NEED_DETAILED_SLIP: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_NeedDetailedSlip_Desc() { regOBD("NEED_DETAILED_SLIP"); return this; }

    protected ConditionValue _needReceipt;
    public ConditionValue xdfgetNeedReceipt()
    { if (_needReceipt == null) { _needReceipt = nCV(); }
      return _needReceipt; }
    protected ConditionValue xgetCValueNeedReceipt() { return xdfgetNeedReceipt(); }

    /**
     * Add order-by as ascend. <br>
     * NEED_RECEIPT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_NeedReceipt_Asc() { regOBA("NEED_RECEIPT"); return this; }

    /**
     * Add order-by as descend. <br>
     * NEED_RECEIPT: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_NeedReceipt_Desc() { regOBD("NEED_RECEIPT"); return this; }

    protected ConditionValue _option1Field;
    public ConditionValue xdfgetOption1Field()
    { if (_option1Field == null) { _option1Field = nCV(); }
      return _option1Field; }
    protected ConditionValue xgetCValueOption1Field() { return xdfgetOption1Field(); }

    /**
     * Add order-by as ascend. <br>
     * OPTION1_FIELD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Option1Field_Asc() { regOBA("OPTION1_FIELD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPTION1_FIELD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Option1Field_Desc() { regOBD("OPTION1_FIELD"); return this; }

    protected ConditionValue _option1Value;
    public ConditionValue xdfgetOption1Value()
    { if (_option1Value == null) { _option1Value = nCV(); }
      return _option1Value; }
    protected ConditionValue xgetCValueOption1Value() { return xdfgetOption1Value(); }

    /**
     * Add order-by as ascend. <br>
     * OPTION1_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Option1Value_Asc() { regOBA("OPTION1_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPTION1_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Option1Value_Desc() { regOBD("OPTION1_VALUE"); return this; }

    protected ConditionValue _option2Field;
    public ConditionValue xdfgetOption2Field()
    { if (_option2Field == null) { _option2Field = nCV(); }
      return _option2Field; }
    protected ConditionValue xgetCValueOption2Field() { return xdfgetOption2Field(); }

    /**
     * Add order-by as ascend. <br>
     * OPTION2_FIELD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Option2Field_Asc() { regOBA("OPTION2_FIELD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPTION2_FIELD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Option2Field_Desc() { regOBD("OPTION2_FIELD"); return this; }

    protected ConditionValue _option2Value;
    public ConditionValue xdfgetOption2Value()
    { if (_option2Value == null) { _option2Value = nCV(); }
      return _option2Value; }
    protected ConditionValue xgetCValueOption2Value() { return xdfgetOption2Value(); }

    /**
     * Add order-by as ascend. <br>
     * OPTION2_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Option2Value_Asc() { regOBA("OPTION2_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPTION2_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Option2Value_Desc() { regOBD("OPTION2_VALUE"); return this; }

    protected ConditionValue _giftWrapMassage;
    public ConditionValue xdfgetGiftWrapMassage()
    { if (_giftWrapMassage == null) { _giftWrapMassage = nCV(); }
      return _giftWrapMassage; }
    protected ConditionValue xgetCValueGiftWrapMassage() { return xdfgetGiftWrapMassage(); }

    /**
     * Add order-by as ascend. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GiftWrapMassage_Asc() { regOBA("GIFT_WRAP_MASSAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GiftWrapMassage_Desc() { regOBD("GIFT_WRAP_MASSAGE"); return this; }

    protected ConditionValue _billName;
    public ConditionValue xdfgetBillName()
    { if (_billName == null) { _billName = nCV(); }
      return _billName; }
    protected ConditionValue xgetCValueBillName() { return xdfgetBillName(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillName_Asc() { regOBA("BILL_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillName_Desc() { regOBD("BILL_NAME"); return this; }

    protected ConditionValue _billFirstName;
    public ConditionValue xdfgetBillFirstName()
    { if (_billFirstName == null) { _billFirstName = nCV(); }
      return _billFirstName; }
    protected ConditionValue xgetCValueBillFirstName() { return xdfgetBillFirstName(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillFirstName_Asc() { regOBA("BILL_FIRST_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_FIRST_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillFirstName_Desc() { regOBD("BILL_FIRST_NAME"); return this; }

    protected ConditionValue _billLastName;
    public ConditionValue xdfgetBillLastName()
    { if (_billLastName == null) { _billLastName = nCV(); }
      return _billLastName; }
    protected ConditionValue xgetCValueBillLastName() { return xdfgetBillLastName(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_LAST_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillLastName_Asc() { regOBA("BILL_LAST_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_LAST_NAME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillLastName_Desc() { regOBD("BILL_LAST_NAME"); return this; }

    protected ConditionValue _billAddress1;
    public ConditionValue xdfgetBillAddress1()
    { if (_billAddress1 == null) { _billAddress1 = nCV(); }
      return _billAddress1; }
    protected ConditionValue xgetCValueBillAddress1() { return xdfgetBillAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillAddress1_Asc() { regOBA("BILL_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_ADDRESS1: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillAddress1_Desc() { regOBD("BILL_ADDRESS1"); return this; }

    protected ConditionValue _billAddress2;
    public ConditionValue xdfgetBillAddress2()
    { if (_billAddress2 == null) { _billAddress2 = nCV(); }
      return _billAddress2; }
    protected ConditionValue xgetCValueBillAddress2() { return xdfgetBillAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillAddress2_Asc() { regOBA("BILL_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_ADDRESS2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillAddress2_Desc() { regOBD("BILL_ADDRESS2"); return this; }

    protected ConditionValue _billCity;
    public ConditionValue xdfgetBillCity()
    { if (_billCity == null) { _billCity = nCV(); }
      return _billCity; }
    protected ConditionValue xgetCValueBillCity() { return xdfgetBillCity(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_CITY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillCity_Asc() { regOBA("BILL_CITY"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_CITY: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillCity_Desc() { regOBD("BILL_CITY"); return this; }

    protected ConditionValue _billPrefecture;
    public ConditionValue xdfgetBillPrefecture()
    { if (_billPrefecture == null) { _billPrefecture = nCV(); }
      return _billPrefecture; }
    protected ConditionValue xgetCValueBillPrefecture() { return xdfgetBillPrefecture(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_PREFECTURE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillPrefecture_Asc() { regOBA("BILL_PREFECTURE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_PREFECTURE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillPrefecture_Desc() { regOBD("BILL_PREFECTURE"); return this; }

    protected ConditionValue _billZipCode;
    public ConditionValue xdfgetBillZipCode()
    { if (_billZipCode == null) { _billZipCode = nCV(); }
      return _billZipCode; }
    protected ConditionValue xgetCValueBillZipCode() { return xdfgetBillZipCode(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillZipCode_Asc() { regOBA("BILL_ZIP_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_ZIP_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillZipCode_Desc() { regOBD("BILL_ZIP_CODE"); return this; }

    protected ConditionValue _billNameKana;
    public ConditionValue xdfgetBillNameKana()
    { if (_billNameKana == null) { _billNameKana = nCV(); }
      return _billNameKana; }
    protected ConditionValue xgetCValueBillNameKana() { return xdfgetBillNameKana(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillNameKana_Asc() { regOBA("BILL_NAME_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillNameKana_Desc() { regOBD("BILL_NAME_KANA"); return this; }

    protected ConditionValue _billFirstNameKana;
    public ConditionValue xdfgetBillFirstNameKana()
    { if (_billFirstNameKana == null) { _billFirstNameKana = nCV(); }
      return _billFirstNameKana; }
    protected ConditionValue xgetCValueBillFirstNameKana() { return xdfgetBillFirstNameKana(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillFirstNameKana_Asc() { regOBA("BILL_FIRST_NAME_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillFirstNameKana_Desc() { regOBD("BILL_FIRST_NAME_KANA"); return this; }

    protected ConditionValue _billLastNameKana;
    public ConditionValue xdfgetBillLastNameKana()
    { if (_billLastNameKana == null) { _billLastNameKana = nCV(); }
      return _billLastNameKana; }
    protected ConditionValue xgetCValueBillLastNameKana() { return xdfgetBillLastNameKana(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillLastNameKana_Asc() { regOBA("BILL_LAST_NAME_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_LAST_NAME_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillLastNameKana_Desc() { regOBD("BILL_LAST_NAME_KANA"); return this; }

    protected ConditionValue _billAddress1Kana;
    public ConditionValue xdfgetBillAddress1Kana()
    { if (_billAddress1Kana == null) { _billAddress1Kana = nCV(); }
      return _billAddress1Kana; }
    protected ConditionValue xgetCValueBillAddress1Kana() { return xdfgetBillAddress1Kana(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillAddress1Kana_Asc() { regOBA("BILL_ADDRESS1_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_ADDRESS1_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillAddress1Kana_Desc() { regOBD("BILL_ADDRESS1_KANA"); return this; }

    protected ConditionValue _billAddress2Kana;
    public ConditionValue xdfgetBillAddress2Kana()
    { if (_billAddress2Kana == null) { _billAddress2Kana = nCV(); }
      return _billAddress2Kana; }
    protected ConditionValue xgetCValueBillAddress2Kana() { return xdfgetBillAddress2Kana(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillAddress2Kana_Asc() { regOBA("BILL_ADDRESS2_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_ADDRESS2_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillAddress2Kana_Desc() { regOBD("BILL_ADDRESS2_KANA"); return this; }

    protected ConditionValue _billCityKana;
    public ConditionValue xdfgetBillCityKana()
    { if (_billCityKana == null) { _billCityKana = nCV(); }
      return _billCityKana; }
    protected ConditionValue xgetCValueBillCityKana() { return xdfgetBillCityKana(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_CITY_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillCityKana_Asc() { regOBA("BILL_CITY_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_CITY_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillCityKana_Desc() { regOBD("BILL_CITY_KANA"); return this; }

    protected ConditionValue _billPrefectureKana;
    public ConditionValue xdfgetBillPrefectureKana()
    { if (_billPrefectureKana == null) { _billPrefectureKana = nCV(); }
      return _billPrefectureKana; }
    protected ConditionValue xgetCValueBillPrefectureKana() { return xdfgetBillPrefectureKana(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillPrefectureKana_Asc() { regOBA("BILL_PREFECTURE_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_PREFECTURE_KANA: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillPrefectureKana_Desc() { regOBD("BILL_PREFECTURE_KANA"); return this; }

    protected ConditionValue _billSection1Field;
    public ConditionValue xdfgetBillSection1Field()
    { if (_billSection1Field == null) { _billSection1Field = nCV(); }
      return _billSection1Field; }
    protected ConditionValue xgetCValueBillSection1Field() { return xdfgetBillSection1Field(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillSection1Field_Asc() { regOBA("BILL_SECTION1_FIELD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_SECTION1_FIELD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillSection1Field_Desc() { regOBD("BILL_SECTION1_FIELD"); return this; }

    protected ConditionValue _billSection1Value;
    public ConditionValue xdfgetBillSection1Value()
    { if (_billSection1Value == null) { _billSection1Value = nCV(); }
      return _billSection1Value; }
    protected ConditionValue xgetCValueBillSection1Value() { return xdfgetBillSection1Value(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillSection1Value_Asc() { regOBA("BILL_SECTION1_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_SECTION1_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillSection1Value_Desc() { regOBD("BILL_SECTION1_VALUE"); return this; }

    protected ConditionValue _billSection2Field;
    public ConditionValue xdfgetBillSection2Field()
    { if (_billSection2Field == null) { _billSection2Field = nCV(); }
      return _billSection2Field; }
    protected ConditionValue xgetCValueBillSection2Field() { return xdfgetBillSection2Field(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillSection2Field_Asc() { regOBA("BILL_SECTION2_FIELD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_SECTION2_FIELD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillSection2Field_Desc() { regOBD("BILL_SECTION2_FIELD"); return this; }

    protected ConditionValue _billSection2Value;
    public ConditionValue xdfgetBillSection2Value()
    { if (_billSection2Value == null) { _billSection2Value = nCV(); }
      return _billSection2Value; }
    protected ConditionValue xgetCValueBillSection2Value() { return xdfgetBillSection2Value(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillSection2Value_Asc() { regOBA("BILL_SECTION2_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_SECTION2_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillSection2Value_Desc() { regOBD("BILL_SECTION2_VALUE"); return this; }

    protected ConditionValue _billPhoneNumber;
    public ConditionValue xdfgetBillPhoneNumber()
    { if (_billPhoneNumber == null) { _billPhoneNumber = nCV(); }
      return _billPhoneNumber; }
    protected ConditionValue xgetCValueBillPhoneNumber() { return xdfgetBillPhoneNumber(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillPhoneNumber_Asc() { regOBA("BILL_PHONE_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_PHONE_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillPhoneNumber_Desc() { regOBD("BILL_PHONE_NUMBER"); return this; }

    protected ConditionValue _billEmgPhoneNumber;
    public ConditionValue xdfgetBillEmgPhoneNumber()
    { if (_billEmgPhoneNumber == null) { _billEmgPhoneNumber = nCV(); }
      return _billEmgPhoneNumber; }
    protected ConditionValue xgetCValueBillEmgPhoneNumber() { return xdfgetBillEmgPhoneNumber(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillEmgPhoneNumber_Asc() { regOBA("BILL_EMG_PHONE_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillEmgPhoneNumber_Desc() { regOBD("BILL_EMG_PHONE_NUMBER"); return this; }

    protected ConditionValue _billMailAddress;
    public ConditionValue xdfgetBillMailAddress()
    { if (_billMailAddress == null) { _billMailAddress = nCV(); }
      return _billMailAddress; }
    protected ConditionValue xgetCValueBillMailAddress() { return xdfgetBillMailAddress(); }

    /**
     * Add order-by as ascend. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillMailAddress_Asc() { regOBA("BILL_MAIL_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * BILL_MAIL_ADDRESS: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BillMailAddress_Desc() { regOBD("BILL_MAIL_ADDRESS"); return this; }

    protected ConditionValue _payMathod;
    public ConditionValue xdfgetPayMathod()
    { if (_payMathod == null) { _payMathod = nCV(); }
      return _payMathod; }
    protected ConditionValue xgetCValuePayMathod() { return xdfgetPayMathod(); }

    /**
     * Add order-by as ascend. <br>
     * PAY_MATHOD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayMathod_Asc() { regOBA("PAY_MATHOD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAY_MATHOD: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayMathod_Desc() { regOBD("PAY_MATHOD"); return this; }

    protected ConditionValue _payMathodName;
    public ConditionValue xdfgetPayMathodName()
    { if (_payMathodName == null) { _payMathodName = nCV(); }
      return _payMathodName; }
    protected ConditionValue xgetCValuePayMathodName() { return xdfgetPayMathodName(); }

    /**
     * Add order-by as ascend. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayMathodName_Asc() { regOBA("PAY_MATHOD_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAY_MATHOD_NAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayMathodName_Desc() { regOBD("PAY_MATHOD_NAME"); return this; }

    protected ConditionValue _payKind;
    public ConditionValue xdfgetPayKind()
    { if (_payKind == null) { _payKind = nCV(); }
      return _payKind; }
    protected ConditionValue xgetCValuePayKind() { return xdfgetPayKind(); }

    /**
     * Add order-by as ascend. <br>
     * PAY_KIND: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayKind_Asc() { regOBA("PAY_KIND"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAY_KIND: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayKind_Desc() { regOBD("PAY_KIND"); return this; }

    protected ConditionValue _cardPayCount;
    public ConditionValue xdfgetCardPayCount()
    { if (_cardPayCount == null) { _cardPayCount = nCV(); }
      return _cardPayCount; }
    protected ConditionValue xgetCValueCardPayCount() { return xdfgetCardPayCount(); }

    /**
     * Add order-by as ascend. <br>
     * CARD_PAY_COUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_CardPayCount_Asc() { regOBA("CARD_PAY_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARD_PAY_COUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_CardPayCount_Desc() { regOBD("CARD_PAY_COUNT"); return this; }

    protected ConditionValue _cardPayType;
    public ConditionValue xdfgetCardPayType()
    { if (_cardPayType == null) { _cardPayType = nCV(); }
      return _cardPayType; }
    protected ConditionValue xgetCValueCardPayType() { return xdfgetCardPayType(); }

    /**
     * Add order-by as ascend. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_CardPayType_Asc() { regOBA("CARD_PAY_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARD_PAY_TYPE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_CardPayType_Desc() { regOBD("CARD_PAY_TYPE"); return this; }

    protected ConditionValue _settleStatus;
    public ConditionValue xdfgetSettleStatus()
    { if (_settleStatus == null) { _settleStatus = nCV(); }
      return _settleStatus; }
    protected ConditionValue xgetCValueSettleStatus() { return xdfgetSettleStatus(); }

    /**
     * Add order-by as ascend. <br>
     * SETTLE_STATUS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SettleStatus_Asc() { regOBA("SETTLE_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SETTLE_STATUS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SettleStatus_Desc() { regOBD("SETTLE_STATUS"); return this; }

    protected ConditionValue _settleId;
    public ConditionValue xdfgetSettleId()
    { if (_settleId == null) { _settleId = nCV(); }
      return _settleId; }
    protected ConditionValue xgetCValueSettleId() { return xdfgetSettleId(); }

    /**
     * Add order-by as ascend. <br>
     * SETTLE_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SettleId_Asc() { regOBA("SETTLE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SETTLE_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SettleId_Desc() { regOBD("SETTLE_ID"); return this; }

    protected ConditionValue _payNo;
    public ConditionValue xdfgetPayNo()
    { if (_payNo == null) { _payNo = nCV(); }
      return _payNo; }
    protected ConditionValue xgetCValuePayNo() { return xdfgetPayNo(); }

    /**
     * Add order-by as ascend. <br>
     * PAY_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayNo_Asc() { regOBA("PAY_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAY_NO: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayNo_Desc() { regOBD("PAY_NO"); return this; }

    protected ConditionValue _payNoIssueDate;
    public ConditionValue xdfgetPayNoIssueDate()
    { if (_payNoIssueDate == null) { _payNoIssueDate = nCV(); }
      return _payNoIssueDate; }
    protected ConditionValue xgetCValuePayNoIssueDate() { return xdfgetPayNoIssueDate(); }

    /**
     * Add order-by as ascend. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayNoIssueDate_Asc() { regOBA("PAY_NO_ISSUE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayNoIssueDate_Desc() { regOBD("PAY_NO_ISSUE_DATE"); return this; }

    protected ConditionValue _payDate;
    public ConditionValue xdfgetPayDate()
    { if (_payDate == null) { _payDate = nCV(); }
      return _payDate; }
    protected ConditionValue xgetCValuePayDate() { return xdfgetPayDate(); }

    /**
     * Add order-by as ascend. <br>
     * PAY_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayDate_Asc() { regOBA("PAY_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAY_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayDate_Desc() { regOBD("PAY_DATE"); return this; }

    protected ConditionValue _buyerComments;
    public ConditionValue xdfgetBuyerComments()
    { if (_buyerComments == null) { _buyerComments = nCV(); }
      return _buyerComments; }
    protected ConditionValue xgetCValueBuyerComments() { return xdfgetBuyerComments(); }

    /**
     * Add order-by as ascend. <br>
     * BUYER_COMMENTS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BuyerComments_Asc() { regOBA("BUYER_COMMENTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * BUYER_COMMENTS: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_BuyerComments_Desc() { regOBD("BUYER_COMMENTS"); return this; }

    protected ConditionValue _ageConfirm;
    public ConditionValue xdfgetAgeConfirm()
    { if (_ageConfirm == null) { _ageConfirm = nCV(); }
      return _ageConfirm; }
    protected ConditionValue xgetCValueAgeConfirm() { return xdfgetAgeConfirm(); }

    /**
     * Add order-by as ascend. <br>
     * AGE_CONFIRM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_AgeConfirm_Asc() { regOBA("AGE_CONFIRM"); return this; }

    /**
     * Add order-by as descend. <br>
     * AGE_CONFIRM: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_AgeConfirm_Desc() { regOBD("AGE_CONFIRM"); return this; }

    protected ConditionValue _quantityDetail;
    public ConditionValue xdfgetQuantityDetail()
    { if (_quantityDetail == null) { _quantityDetail = nCV(); }
      return _quantityDetail; }
    protected ConditionValue xgetCValueQuantityDetail() { return xdfgetQuantityDetail(); }

    /**
     * Add order-by as ascend. <br>
     * QUANTITY_DETAIL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_QuantityDetail_Asc() { regOBA("QUANTITY_DETAIL"); return this; }

    /**
     * Add order-by as descend. <br>
     * QUANTITY_DETAIL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_QuantityDetail_Desc() { regOBD("QUANTITY_DETAIL"); return this; }

    protected ConditionValue _shipCharge;
    public ConditionValue xdfgetShipCharge()
    { if (_shipCharge == null) { _shipCharge = nCV(); }
      return _shipCharge; }
    protected ConditionValue xgetCValueShipCharge() { return xdfgetShipCharge(); }

    /**
     * Add order-by as ascend. <br>
     * SHIP_CHARGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipCharge_Asc() { regOBA("SHIP_CHARGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIP_CHARGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShipCharge_Desc() { regOBD("SHIP_CHARGE"); return this; }

    protected ConditionValue _payCharge;
    public ConditionValue xdfgetPayCharge()
    { if (_payCharge == null) { _payCharge = nCV(); }
      return _payCharge; }
    protected ConditionValue xgetCValuePayCharge() { return xdfgetPayCharge(); }

    /**
     * Add order-by as ascend. <br>
     * PAY_CHARGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayCharge_Asc() { regOBA("PAY_CHARGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAY_CHARGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PayCharge_Desc() { regOBD("PAY_CHARGE"); return this; }

    protected ConditionValue _giftWrapCharge;
    public ConditionValue xdfgetGiftWrapCharge()
    { if (_giftWrapCharge == null) { _giftWrapCharge = nCV(); }
      return _giftWrapCharge; }
    protected ConditionValue xgetCValueGiftWrapCharge() { return xdfgetGiftWrapCharge(); }

    /**
     * Add order-by as ascend. <br>
     * GIFT_WRAP_CHARGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GiftWrapCharge_Asc() { regOBA("GIFT_WRAP_CHARGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIFT_WRAP_CHARGE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GiftWrapCharge_Desc() { regOBD("GIFT_WRAP_CHARGE"); return this; }

    protected ConditionValue _discount;
    public ConditionValue xdfgetDiscount()
    { if (_discount == null) { _discount = nCV(); }
      return _discount; }
    protected ConditionValue xgetCValueDiscount() { return xdfgetDiscount(); }

    /**
     * Add order-by as ascend. <br>
     * DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Discount_Asc() { regOBA("DISCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Discount_Desc() { regOBD("DISCOUNT"); return this; }

    protected ConditionValue _adjustments;
    public ConditionValue xdfgetAdjustments()
    { if (_adjustments == null) { _adjustments = nCV(); }
      return _adjustments; }
    protected ConditionValue xgetCValueAdjustments() { return xdfgetAdjustments(); }

    /**
     * Add order-by as ascend. <br>
     * ADJUSTMENTS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Adjustments_Asc() { regOBA("ADJUSTMENTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTMENTS: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Adjustments_Desc() { regOBD("ADJUSTMENTS"); return this; }

    protected ConditionValue _usePoint;
    public ConditionValue xdfgetUsePoint()
    { if (_usePoint == null) { _usePoint = nCV(); }
      return _usePoint; }
    protected ConditionValue xgetCValueUsePoint() { return xdfgetUsePoint(); }

    /**
     * Add order-by as ascend. <br>
     * USE_POINT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_UsePoint_Asc() { regOBA("USE_POINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * USE_POINT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_UsePoint_Desc() { regOBD("USE_POINT"); return this; }

    protected ConditionValue _getPoint;
    public ConditionValue xdfgetGetPoint()
    { if (_getPoint == null) { _getPoint = nCV(); }
      return _getPoint; }
    protected ConditionValue xgetCValueGetPoint() { return xdfgetGetPoint(); }

    /**
     * Add order-by as ascend. <br>
     * GET_POINT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GetPoint_Asc() { regOBA("GET_POINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * GET_POINT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GetPoint_Desc() { regOBD("GET_POINT"); return this; }

    protected ConditionValue _total;
    public ConditionValue xdfgetTotal()
    { if (_total == null) { _total = nCV(); }
      return _total; }
    protected ConditionValue xgetCValueTotal() { return xdfgetTotal(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Total_Asc() { regOBA("TOTAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Total_Desc() { regOBD("TOTAL"); return this; }

    protected ConditionValue _totalPrice;
    public ConditionValue xdfgetTotalPrice()
    { if (_totalPrice == null) { _totalPrice = nCV(); }
      return _totalPrice; }
    protected ConditionValue xgetCValueTotalPrice() { return xdfgetTotalPrice(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_TotalPrice_Asc() { regOBA("TOTAL_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_TotalPrice_Desc() { regOBD("TOTAL_PRICE"); return this; }

    protected ConditionValue _shippingCDiscount;
    public ConditionValue xdfgetShippingCDiscount()
    { if (_shippingCDiscount == null) { _shippingCDiscount = nCV(); }
      return _shippingCDiscount; }
    protected ConditionValue xgetCValueShippingCDiscount() { return xdfgetShippingCDiscount(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShippingCDiscount_Asc() { regOBA("SHIPPING_C_DISCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ShippingCDiscount_Desc() { regOBD("SHIPPING_C_DISCOUNT"); return this; }

    protected ConditionValue _itemCDiscount;
    public ConditionValue xdfgetItemCDiscount()
    { if (_itemCDiscount == null) { _itemCDiscount = nCV(); }
      return _itemCDiscount; }
    protected ConditionValue xgetCValueItemCDiscount() { return xdfgetItemCDiscount(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_C_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ItemCDiscount_Asc() { regOBA("ITEM_C_DISCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_C_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ItemCDiscount_Desc() { regOBD("ITEM_C_DISCOUNT"); return this; }

    protected ConditionValue _totalMallCDiscount;
    public ConditionValue xdfgetTotalMallCDiscount()
    { if (_totalMallCDiscount == null) { _totalMallCDiscount = nCV(); }
      return _totalMallCDiscount; }
    protected ConditionValue xgetCValueTotalMallCDiscount() { return xdfgetTotalMallCDiscount(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_TotalMallCDiscount_Asc() { regOBA("TOTAL_MALL_C_DISCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_TotalMallCDiscount_Desc() { regOBD("TOTAL_MALL_C_DISCOUNT"); return this; }

    protected ConditionValue _getPointCrgToStore;
    public ConditionValue xdfgetGetPointCrgToStore()
    { if (_getPointCrgToStore == null) { _getPointCrgToStore = nCV(); }
      return _getPointCrgToStore; }
    protected ConditionValue xgetCValueGetPointCrgToStore() { return xdfgetGetPointCrgToStore(); }

    /**
     * Add order-by as ascend. <br>
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GetPointCrgToStore_Asc() { regOBA("GET_POINT_CRG_TO_STORE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GetPointCrgToStore_Desc() { regOBD("GET_POINT_CRG_TO_STORE"); return this; }

    protected ConditionValue _lineId;
    public ConditionValue xdfgetLineId()
    { if (_lineId == null) { _lineId = nCV(); }
      return _lineId; }
    protected ConditionValue xgetCValueLineId() { return xdfgetLineId(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_LineId_Asc() { regOBA("LINE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_LineId_Desc() { regOBD("LINE_ID"); return this; }

    protected ConditionValue _quantity;
    public ConditionValue xdfgetQuantity()
    { if (_quantity == null) { _quantity = nCV(); }
      return _quantity; }
    protected ConditionValue xgetCValueQuantity() { return xdfgetQuantity(); }

    /**
     * Add order-by as ascend. <br>
     * QUANTITY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Quantity_Asc() { regOBA("QUANTITY"); return this; }

    /**
     * Add order-by as descend. <br>
     * QUANTITY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Quantity_Desc() { regOBD("QUANTITY"); return this; }

    protected ConditionValue _itemId;
    public ConditionValue xdfgetItemId()
    { if (_itemId == null) { _itemId = nCV(); }
      return _itemId; }
    protected ConditionValue xgetCValueItemId() { return xdfgetItemId(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ItemId_Asc() { regOBA("ITEM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ItemId_Desc() { regOBD("ITEM_ID"); return this; }

    protected ConditionValue _subCode;
    public ConditionValue xdfgetSubCode()
    { if (_subCode == null) { _subCode = nCV(); }
      return _subCode; }
    protected ConditionValue xgetCValueSubCode() { return xdfgetSubCode(); }

    /**
     * Add order-by as ascend. <br>
     * SUB_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SubCode_Asc() { regOBA("SUB_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUB_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SubCode_Desc() { regOBD("SUB_CODE"); return this; }

    protected ConditionValue _title;
    public ConditionValue xdfgetTitle()
    { if (_title == null) { _title = nCV(); }
      return _title; }
    protected ConditionValue xgetCValueTitle() { return xdfgetTitle(); }

    /**
     * Add order-by as ascend. <br>
     * TITLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Title_Asc() { regOBA("TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TITLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Title_Desc() { regOBD("TITLE"); return this; }

    protected ConditionValue _itemOptionName;
    public ConditionValue xdfgetItemOptionName()
    { if (_itemOptionName == null) { _itemOptionName = nCV(); }
      return _itemOptionName; }
    protected ConditionValue xgetCValueItemOptionName() { return xdfgetItemOptionName(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ItemOptionName_Asc() { regOBA("ITEM_OPTION_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_OPTION_NAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ItemOptionName_Desc() { regOBD("ITEM_OPTION_NAME"); return this; }

    protected ConditionValue _itemOptionValue;
    public ConditionValue xdfgetItemOptionValue()
    { if (_itemOptionValue == null) { _itemOptionValue = nCV(); }
      return _itemOptionValue; }
    protected ConditionValue xgetCValueItemOptionValue() { return xdfgetItemOptionValue(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ItemOptionValue_Asc() { regOBA("ITEM_OPTION_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_OPTION_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ItemOptionValue_Desc() { regOBD("ITEM_OPTION_VALUE"); return this; }

    protected ConditionValue _subCodeOption;
    public ConditionValue xdfgetSubCodeOption()
    { if (_subCodeOption == null) { _subCodeOption = nCV(); }
      return _subCodeOption; }
    protected ConditionValue xgetCValueSubCodeOption() { return xdfgetSubCodeOption(); }

    /**
     * Add order-by as ascend. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SubCodeOption_Asc() { regOBA("SUB_CODE_OPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUB_CODE_OPTION: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SubCodeOption_Desc() { regOBD("SUB_CODE_OPTION"); return this; }

    protected ConditionValue _inscriptionName;
    public ConditionValue xdfgetInscriptionName()
    { if (_inscriptionName == null) { _inscriptionName = nCV(); }
      return _inscriptionName; }
    protected ConditionValue xgetCValueInscriptionName() { return xdfgetInscriptionName(); }

    /**
     * Add order-by as ascend. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_InscriptionName_Asc() { regOBA("INSCRIPTION_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSCRIPTION_NAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_InscriptionName_Desc() { regOBD("INSCRIPTION_NAME"); return this; }

    protected ConditionValue _inscriptionValue;
    public ConditionValue xdfgetInscriptionValue()
    { if (_inscriptionValue == null) { _inscriptionValue = nCV(); }
      return _inscriptionValue; }
    protected ConditionValue xgetCValueInscriptionValue() { return xdfgetInscriptionValue(); }

    /**
     * Add order-by as ascend. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_InscriptionValue_Asc() { regOBA("INSCRIPTION_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSCRIPTION_VALUE: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_InscriptionValue_Desc() { regOBD("INSCRIPTION_VALUE"); return this; }

    protected ConditionValue _unitPrice;
    public ConditionValue xdfgetUnitPrice()
    { if (_unitPrice == null) { _unitPrice = nCV(); }
      return _unitPrice; }
    protected ConditionValue xgetCValueUnitPrice() { return xdfgetUnitPrice(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_UnitPrice_Asc() { regOBA("UNIT_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_UnitPrice_Desc() { regOBD("UNIT_PRICE"); return this; }

    protected ConditionValue _unitGetPoint;
    public ConditionValue xdfgetUnitGetPoint()
    { if (_unitGetPoint == null) { _unitGetPoint = nCV(); }
      return _unitGetPoint; }
    protected ConditionValue xgetCValueUnitGetPoint() { return xdfgetUnitGetPoint(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_GET_POINT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_UnitGetPoint_Asc() { regOBA("UNIT_GET_POINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_GET_POINT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_UnitGetPoint_Desc() { regOBD("UNIT_GET_POINT"); return this; }

    protected ConditionValue _lineSubTotal;
    public ConditionValue xdfgetLineSubTotal()
    { if (_lineSubTotal == null) { _lineSubTotal = nCV(); }
      return _lineSubTotal; }
    protected ConditionValue xgetCValueLineSubTotal() { return xdfgetLineSubTotal(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_SUB_TOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_LineSubTotal_Asc() { regOBA("LINE_SUB_TOTAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_SUB_TOTAL: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_LineSubTotal_Desc() { regOBD("LINE_SUB_TOTAL"); return this; }

    protected ConditionValue _lineGetPoint;
    public ConditionValue xdfgetLineGetPoint()
    { if (_lineGetPoint == null) { _lineGetPoint = nCV(); }
      return _lineGetPoint; }
    protected ConditionValue xgetCValueLineGetPoint() { return xdfgetLineGetPoint(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_GET_POINT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_LineGetPoint_Asc() { regOBA("LINE_GET_POINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_GET_POINT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_LineGetPoint_Desc() { regOBD("LINE_GET_POINT"); return this; }

    protected ConditionValue _pointFspCode;
    public ConditionValue xdfgetPointFspCode()
    { if (_pointFspCode == null) { _pointFspCode = nCV(); }
      return _pointFspCode; }
    protected ConditionValue xgetCValuePointFspCode() { return xdfgetPointFspCode(); }

    /**
     * Add order-by as ascend. <br>
     * POINT_FSP_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PointFspCode_Asc() { regOBA("POINT_FSP_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * POINT_FSP_CODE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PointFspCode_Desc() { regOBD("POINT_FSP_CODE"); return this; }

    protected ConditionValue _itemCondition;
    public ConditionValue xdfgetItemCondition()
    { if (_itemCondition == null) { _itemCondition = nCV(); }
      return _itemCondition; }
    protected ConditionValue xgetCValueItemCondition() { return xdfgetItemCondition(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_CONDITION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ItemCondition_Asc() { regOBA("ITEM_CONDITION"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_CONDITION: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ItemCondition_Desc() { regOBD("ITEM_CONDITION"); return this; }

    protected ConditionValue _couponId;
    public ConditionValue xdfgetCouponId()
    { if (_couponId == null) { _couponId = nCV(); }
      return _couponId; }
    protected ConditionValue xgetCValueCouponId() { return xdfgetCouponId(); }

    /**
     * Add order-by as ascend. <br>
     * COUPON_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_CouponId_Asc() { regOBA("COUPON_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUPON_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_CouponId_Desc() { regOBD("COUPON_ID"); return this; }

    protected ConditionValue _couponDiscount;
    public ConditionValue xdfgetCouponDiscount()
    { if (_couponDiscount == null) { _couponDiscount = nCV(); }
      return _couponDiscount; }
    protected ConditionValue xgetCValueCouponDiscount() { return xdfgetCouponDiscount(); }

    /**
     * Add order-by as ascend. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_CouponDiscount_Asc() { regOBA("COUPON_DISCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUPON_DISCOUNT: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_CouponDiscount_Desc() { regOBD("COUPON_DISCOUNT"); return this; }

    protected ConditionValue _originalPrice;
    public ConditionValue xdfgetOriginalPrice()
    { if (_originalPrice == null) { _originalPrice = nCV(); }
      return _originalPrice; }
    protected ConditionValue xgetCValueOriginalPrice() { return xdfgetOriginalPrice(); }

    /**
     * Add order-by as ascend. <br>
     * ORIGINAL_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_OriginalPrice_Asc() { regOBA("ORIGINAL_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORIGINAL_PRICE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_OriginalPrice_Desc() { regOBD("ORIGINAL_PRICE"); return this; }

    protected ConditionValue _isGetPointFix;
    public ConditionValue xdfgetIsGetPointFix()
    { if (_isGetPointFix == null) { _isGetPointFix = nCV(); }
      return _isGetPointFix; }
    protected ConditionValue xgetCValueIsGetPointFix() { return xdfgetIsGetPointFix(); }

    /**
     * Add order-by as ascend. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_IsGetPointFix_Asc() { regOBA("IS_GET_POINT_FIX"); return this; }

    /**
     * Add order-by as descend. <br>
     * IS_GET_POINT_FIX: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_IsGetPointFix_Desc() { regOBD("IS_GET_POINT_FIX"); return this; }

    protected ConditionValue _getPointFixDate;
    public ConditionValue xdfgetGetPointFixDate()
    { if (_getPointFixDate == null) { _getPointFixDate = nCV(); }
      return _getPointFixDate; }
    protected ConditionValue xgetCValueGetPointFixDate() { return xdfgetGetPointFixDate(); }

    /**
     * Add order-by as ascend. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GetPointFixDate_Asc() { regOBA("GET_POINT_FIX_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GET_POINT_FIX_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GetPointFixDate_Desc() { regOBD("GET_POINT_FIX_DATE"); return this; }

    protected ConditionValue _releaseDate;
    public ConditionValue xdfgetReleaseDate()
    { if (_releaseDate == null) { _releaseDate = nCV(); }
      return _releaseDate; }
    protected ConditionValue xgetCValueReleaseDate() { return xdfgetReleaseDate(); }

    /**
     * Add order-by as ascend. <br>
     * RELEASE_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ReleaseDate_Asc() { regOBA("RELEASE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * RELEASE_DATE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ReleaseDate_Desc() { regOBD("RELEASE_DATE"); return this; }

    protected ConditionValue _getPointType;
    public ConditionValue xdfgetGetPointType()
    { if (_getPointType == null) { _getPointType = nCV(); }
      return _getPointType; }
    protected ConditionValue xgetCValueGetPointType() { return xdfgetGetPointType(); }

    /**
     * Add order-by as ascend. <br>
     * GET_POINT_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GetPointType_Asc() { regOBA("GET_POINT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GET_POINT_TYPE: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_GetPointType_Desc() { regOBD("GET_POINT_TYPE"); return this; }

    protected ConditionValue _jan;
    public ConditionValue xdfgetJan()
    { if (_jan == null) { _jan = nCV(); }
      return _jan; }
    protected ConditionValue xgetCValueJan() { return xdfgetJan(); }

    /**
     * Add order-by as ascend. <br>
     * JAN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Jan_Asc() { regOBA("JAN"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Jan_Desc() { regOBD("JAN"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _pointChargedToStore;
    public ConditionValue xdfgetPointChargedToStore()
    { if (_pointChargedToStore == null) { _pointChargedToStore = nCV(); }
      return _pointChargedToStore; }
    protected ConditionValue xgetCValuePointChargedToStore() { return xdfgetPointChargedToStore(); }

    /**
     * Add order-by as ascend. <br>
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PointChargedToStore_Asc() { regOBA("POINT_CHARGED_TO_STORE"); return this; }

    /**
     * Add order-by as descend. <br>
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PointChargedToStore_Desc() { regOBD("POINT_CHARGED_TO_STORE"); return this; }

    protected ConditionValue _packingQty;
    public ConditionValue xdfgetPackingQty()
    { if (_packingQty == null) { _packingQty = nCV(); }
      return _packingQty; }
    protected ConditionValue xgetCValuePackingQty() { return xdfgetPackingQty(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PackingQty_Asc() { regOBA("PACKING_QTY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_QTY: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_PackingQty_Desc() { regOBD("PACKING_QTY"); return this; }

    protected ConditionValue _slipItemNm1;
    public ConditionValue xdfgetSlipItemNm1()
    { if (_slipItemNm1 == null) { _slipItemNm1 = nCV(); }
      return _slipItemNm1; }
    protected ConditionValue xgetCValueSlipItemNm1() { return xdfgetSlipItemNm1(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemNm1_Asc() { regOBA("SLIP_ITEM_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemNm1_Desc() { regOBD("SLIP_ITEM_NM1"); return this; }

    protected ConditionValue _slipItemNm2;
    public ConditionValue xdfgetSlipItemNm2()
    { if (_slipItemNm2 == null) { _slipItemNm2 = nCV(); }
      return _slipItemNm2; }
    protected ConditionValue xgetCValueSlipItemNm2() { return xdfgetSlipItemNm2(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemNm2_Asc() { regOBA("SLIP_ITEM_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM2: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemNm2_Desc() { regOBD("SLIP_ITEM_NM2"); return this; }

    protected ConditionValue _slipItemNm3;
    public ConditionValue xdfgetSlipItemNm3()
    { if (_slipItemNm3 == null) { _slipItemNm3 = nCV(); }
      return _slipItemNm3; }
    protected ConditionValue xgetCValueSlipItemNm3() { return xdfgetSlipItemNm3(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemNm3_Asc() { regOBA("SLIP_ITEM_NM3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM3: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemNm3_Desc() { regOBD("SLIP_ITEM_NM3"); return this; }

    protected ConditionValue _slipItemNm4;
    public ConditionValue xdfgetSlipItemNm4()
    { if (_slipItemNm4 == null) { _slipItemNm4 = nCV(); }
      return _slipItemNm4; }
    protected ConditionValue xgetCValueSlipItemNm4() { return xdfgetSlipItemNm4(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemNm4_Asc() { regOBA("SLIP_ITEM_NM4"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM4: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemNm4_Desc() { regOBD("SLIP_ITEM_NM4"); return this; }

    protected ConditionValue _slipItemNm5;
    public ConditionValue xdfgetSlipItemNm5()
    { if (_slipItemNm5 == null) { _slipItemNm5 = nCV(); }
      return _slipItemNm5; }
    protected ConditionValue xgetCValueSlipItemNm5() { return xdfgetSlipItemNm5(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemNm5_Asc() { regOBA("SLIP_ITEM_NM5"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_NM5: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemNm5_Desc() { regOBD("SLIP_ITEM_NM5"); return this; }

    protected ConditionValue _slipItemCd1;
    public ConditionValue xdfgetSlipItemCd1()
    { if (_slipItemCd1 == null) { _slipItemCd1 = nCV(); }
      return _slipItemCd1; }
    protected ConditionValue xgetCValueSlipItemCd1() { return xdfgetSlipItemCd1(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemCd1_Asc() { regOBA("SLIP_ITEM_CD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_CD1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemCd1_Desc() { regOBD("SLIP_ITEM_CD1"); return this; }

    protected ConditionValue _slipItemCd2;
    public ConditionValue xdfgetSlipItemCd2()
    { if (_slipItemCd2 == null) { _slipItemCd2 = nCV(); }
      return _slipItemCd2; }
    protected ConditionValue xgetCValueSlipItemCd2() { return xdfgetSlipItemCd2(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemCd2_Asc() { regOBA("SLIP_ITEM_CD2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_ITEM_CD2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_SlipItemCd2_Desc() { regOBD("SLIP_ITEM_CD2"); return this; }

    protected ConditionValue _freightHandling1;
    public ConditionValue xdfgetFreightHandling1()
    { if (_freightHandling1 == null) { _freightHandling1 = nCV(); }
      return _freightHandling1; }
    protected ConditionValue xgetCValueFreightHandling1() { return xdfgetFreightHandling1(); }

    /**
     * Add order-by as ascend. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_FreightHandling1_Asc() { regOBA("FREIGHT_HANDLING1"); return this; }

    /**
     * Add order-by as descend. <br>
     * FREIGHT_HANDLING1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_FreightHandling1_Desc() { regOBD("FREIGHT_HANDLING1"); return this; }

    protected ConditionValue _freightHandling2;
    public ConditionValue xdfgetFreightHandling2()
    { if (_freightHandling2 == null) { _freightHandling2 = nCV(); }
      return _freightHandling2; }
    protected ConditionValue xgetCValueFreightHandling2() { return xdfgetFreightHandling2(); }

    /**
     * Add order-by as ascend. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_FreightHandling2_Asc() { regOBA("FREIGHT_HANDLING2"); return this; }

    /**
     * Add order-by as descend. <br>
     * FREIGHT_HANDLING2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_FreightHandling2_Desc() { regOBD("FREIGHT_HANDLING2"); return this; }

    protected ConditionValue _article;
    public ConditionValue xdfgetArticle()
    { if (_article == null) { _article = nCV(); }
      return _article; }
    protected ConditionValue xgetCValueArticle() { return xdfgetArticle(); }

    /**
     * Add order-by as ascend. <br>
     * ARTICLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Article_Asc() { regOBA("ARTICLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ARTICLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_Article_Desc() { regOBD("ARTICLE"); return this; }

    protected ConditionValue _receiveId;
    public ConditionValue xdfgetReceiveId()
    { if (_receiveId == null) { _receiveId = nCV(); }
      return _receiveId; }
    protected ConditionValue xgetCValueReceiveId() { return xdfgetReceiveId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ReceiveId_Asc() { regOBA("RECEIVE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ID: {IX, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ReceiveId_Desc() { regOBD("RECEIVE_ID"); return this; }

    protected ConditionValue _rowNo;
    public ConditionValue xdfgetRowNo()
    { if (_rowNo == null) { _rowNo = nCV(); }
      return _rowNo; }
    protected ConditionValue xgetCValueRowNo() { return xdfgetRowNo(); }

    /**
     * Add order-by as ascend. <br>
     * ROW_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_RowNo_Asc() { regOBA("ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROW_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_RowNo_Desc() { regOBD("ROW_NO"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _importTypeId;
    public ConditionValue xdfgetImportTypeId()
    { if (_importTypeId == null) { _importTypeId = nCV(); }
      return _importTypeId; }
    protected ConditionValue xgetCValueImportTypeId() { return xdfgetImportTypeId(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ImportTypeId_Asc() { regOBA("IMPORT_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_TYPE_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ImportTypeId_Desc() { regOBD("IMPORT_TYPE_ID"); return this; }

    protected ConditionValue _ecOrderBId;
    public ConditionValue xdfgetEcOrderBId()
    { if (_ecOrderBId == null) { _ecOrderBId = nCV(); }
      return _ecOrderBId; }
    protected ConditionValue xgetCValueEcOrderBId() { return xdfgetEcOrderBId(); }

    public Map<String, TEcOrderBCQ> getEcOrderBId_InScopeRelation_TEcOrderB() { return xgetSQueMap("ecOrderBId_InScopeRelation_TEcOrderB"); }
    public String keepEcOrderBId_InScopeRelation_TEcOrderB(TEcOrderBCQ sq) { return xkeepSQue("ecOrderBId_InScopeRelation_TEcOrderB", sq); }

    public Map<String, TEcOrderBCQ> getEcOrderBId_NotInScopeRelation_TEcOrderB() { return xgetSQueMap("ecOrderBId_NotInScopeRelation_TEcOrderB"); }
    public String keepEcOrderBId_NotInScopeRelation_TEcOrderB(TEcOrderBCQ sq) { return xkeepSQue("ecOrderBId_NotInScopeRelation_TEcOrderB", sq); }

    /**
     * Add order-by as ascend. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_EcOrderBId_Asc() { regOBA("EC_ORDER_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_EcOrderBId_Desc() { regOBD("EC_ORDER_B_ID"); return this; }

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
    public BsTYahooOrderCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTYahooOrderCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTYahooOrderCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTYahooOrderCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTYahooOrderCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTYahooOrderCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTYahooOrderCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTYahooOrderCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTYahooOrderCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTYahooOrderCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTYahooOrderCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTYahooOrderCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TYahooOrderCQ bq = (TYahooOrderCQ)bqs;
        TYahooOrderCQ uq = (TYahooOrderCQ)uqs;
        if (bq.hasConditionQueryTEcOrderB()) {
            uq.queryTEcOrderB().reflectRelationOnUnionQuery(bq.queryTEcOrderB(), uq.queryTEcOrderB());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * T_EC_ORDER_B by my EC_ORDER_B_ID, named 'TEcOrderB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TEcOrderBCQ queryTEcOrderB() {
        return xdfgetConditionQueryTEcOrderB();
    }
    public TEcOrderBCQ xdfgetConditionQueryTEcOrderB() {
        String prop = "tEcOrderB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTEcOrderB()); xsetupOuterJoinTEcOrderB(); }
        return xgetQueRlMap(prop);
    }
    protected TEcOrderBCQ xcreateQueryTEcOrderB() {
        String nrp = xresolveNRP("T_YAHOO_ORDER", "tEcOrderB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TEcOrderBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tEcOrderB", nrp);
    }
    protected void xsetupOuterJoinTEcOrderB() { xregOutJo("tEcOrderB"); }
    public boolean hasConditionQueryTEcOrderB() { return xhasQueRlMap("tEcOrderB"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TYahooOrderCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TYahooOrderCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TYahooOrderCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TYahooOrderCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TYahooOrderCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TYahooOrderCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TYahooOrderCQ> _myselfExistsMap;
    public Map<String, TYahooOrderCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TYahooOrderCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TYahooOrderCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TYahooOrderCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TYahooOrderCB.class.getName(); }
    protected String xCQ() { return TYahooOrderCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
