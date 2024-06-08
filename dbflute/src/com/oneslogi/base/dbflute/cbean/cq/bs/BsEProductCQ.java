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
 * The base condition-query of E_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class BsEProductCQ extends AbstractBsEProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_PRODUCT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EProductCIQ xcreateCIQ() {
        EProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EProductCIQ xnewCIQ() {
        return new EProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_PRODUCT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsEProductCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

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
    public BsEProductCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

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
    public BsEProductCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

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
    public BsEProductCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsEProductCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

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
    public BsEProductCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

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
    public BsEProductCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _productNm;
    public ConditionValue xdfgetProductNm()
    { if (_productNm == null) { _productNm = nCV(); }
      return _productNm; }
    protected ConditionValue xgetCValueProductNm() { return xdfgetProductNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _productAbbr;
    public ConditionValue xdfgetProductAbbr()
    { if (_productAbbr == null) { _productAbbr = nCV(); }
      return _productAbbr; }
    protected ConditionValue xgetCValueProductAbbr() { return xdfgetProductAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ABBR: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ProductAbbr_Asc() { regOBA("PRODUCT_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ABBR: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ProductAbbr_Desc() { regOBD("PRODUCT_ABBR"); return this; }

    protected ConditionValue _janCd;
    public ConditionValue xdfgetJanCd()
    { if (_janCd == null) { _janCd = nCV(); }
      return _janCd; }
    protected ConditionValue xgetCValueJanCd() { return xdfgetJanCd(); }

    /**
     * Add order-by as ascend. <br>
     * JAN_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _lotManagFlg;
    public ConditionValue xdfgetLotManagFlg()
    { if (_lotManagFlg == null) { _lotManagFlg = nCV(); }
      return _lotManagFlg; }
    protected ConditionValue xgetCValueLotManagFlg() { return xdfgetLotManagFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_MANAG_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_LotManagFlg_Asc() { regOBA("LOT_MANAG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_MANAG_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_LotManagFlg_Desc() { regOBD("LOT_MANAG_FLG"); return this; }

    protected ConditionValue _lotReverseFlg;
    public ConditionValue xdfgetLotReverseFlg()
    { if (_lotReverseFlg == null) { _lotReverseFlg = nCV(); }
      return _lotReverseFlg; }
    protected ConditionValue xgetCValueLotReverseFlg() { return xdfgetLotReverseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_REVERSE_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_LotReverseFlg_Asc() { regOBA("LOT_REVERSE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_REVERSE_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_LotReverseFlg_Desc() { regOBD("LOT_REVERSE_FLG"); return this; }

    protected ConditionValue _limitDtManagFlg;
    public ConditionValue xdfgetLimitDtManagFlg()
    { if (_limitDtManagFlg == null) { _limitDtManagFlg = nCV(); }
      return _limitDtManagFlg; }
    protected ConditionValue xgetCValueLimitDtManagFlg() { return xdfgetLimitDtManagFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT_MANAG_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_LimitDtManagFlg_Asc() { regOBA("LIMIT_DT_MANAG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT_MANAG_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_LimitDtManagFlg_Desc() { regOBD("LIMIT_DT_MANAG_FLG"); return this; }

    protected ConditionValue _limitDtReverseFlg;
    public ConditionValue xdfgetLimitDtReverseFlg()
    { if (_limitDtReverseFlg == null) { _limitDtReverseFlg = nCV(); }
      return _limitDtReverseFlg; }
    protected ConditionValue xgetCValueLimitDtReverseFlg() { return xdfgetLimitDtReverseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT_REVERSE_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_LimitDtReverseFlg_Asc() { regOBA("LIMIT_DT_REVERSE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT_REVERSE_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_LimitDtReverseFlg_Desc() { regOBD("LIMIT_DT_REVERSE_FLG"); return this; }

    protected ConditionValue _receiveLimitNum;
    public ConditionValue xdfgetReceiveLimitNum()
    { if (_receiveLimitNum == null) { _receiveLimitNum = nCV(); }
      return _receiveLimitNum; }
    protected ConditionValue xgetCValueReceiveLimitNum() { return xdfgetReceiveLimitNum(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_LIMIT_NUM: {varchar(255), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ReceiveLimitNum_Asc() { regOBA("RECEIVE_LIMIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_LIMIT_NUM: {varchar(255), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ReceiveLimitNum_Desc() { regOBD("RECEIVE_LIMIT_NUM"); return this; }

    protected ConditionValue _shippingLimitNum;
    public ConditionValue xdfgetShippingLimitNum()
    { if (_shippingLimitNum == null) { _shippingLimitNum = nCV(); }
      return _shippingLimitNum; }
    protected ConditionValue xgetCValueShippingLimitNum() { return xdfgetShippingLimitNum(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_LIMIT_NUM: {varchar(255), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ShippingLimitNum_Asc() { regOBA("SHIPPING_LIMIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_LIMIT_NUM: {varchar(255), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ShippingLimitNum_Desc() { regOBD("SHIPPING_LIMIT_NUM"); return this; }

    protected ConditionValue _mergeCls;
    public ConditionValue xdfgetMergeCls()
    { if (_mergeCls == null) { _mergeCls = nCV(); }
      return _mergeCls; }
    protected ConditionValue xgetCValueMergeCls() { return xdfgetMergeCls(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_CLS: {varchar(255), default=[02]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_MergeCls_Asc() { regOBA("MERGE_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_CLS: {varchar(255), default=[02]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_MergeCls_Desc() { regOBD("MERGE_CLS"); return this; }

    protected ConditionValue _shippingStopFlg;
    public ConditionValue xdfgetShippingStopFlg()
    { if (_shippingStopFlg == null) { _shippingStopFlg = nCV(); }
      return _shippingStopFlg; }
    protected ConditionValue xgetCValueShippingStopFlg() { return xdfgetShippingStopFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_STOP_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ShippingStopFlg_Asc() { regOBA("SHIPPING_STOP_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STOP_FLG: {varchar(255), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ShippingStopFlg_Desc() { regOBD("SHIPPING_STOP_FLG"); return this; }

    protected ConditionValue _fixedPoint;
    public ConditionValue xdfgetFixedPoint()
    { if (_fixedPoint == null) { _fixedPoint = nCV(); }
      return _fixedPoint; }
    protected ConditionValue xgetCValueFixedPoint() { return xdfgetFixedPoint(); }

    /**
     * Add order-by as ascend. <br>
     * FIXED_POINT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_FixedPoint_Asc() { regOBA("FIXED_POINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIXED_POINT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_FixedPoint_Desc() { regOBD("FIXED_POINT"); return this; }

    protected ConditionValue _shapeGrpCd;
    public ConditionValue xdfgetShapeGrpCd()
    { if (_shapeGrpCd == null) { _shapeGrpCd = nCV(); }
      return _shapeGrpCd; }
    protected ConditionValue xgetCValueShapeGrpCd() { return xdfgetShapeGrpCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_GRP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ShapeGrpCd_Asc() { regOBA("SHAPE_GRP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_GRP_CD: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ShapeGrpCd_Desc() { regOBD("SHAPE_GRP_CD"); return this; }

    protected ConditionValue _length;
    public ConditionValue xdfgetLength()
    { if (_length == null) { _length = nCV(); }
      return _length; }
    protected ConditionValue xgetCValueLength() { return xdfgetLength(); }

    /**
     * Add order-by as ascend. <br>
     * LENGTH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_Length_Asc() { regOBA("LENGTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * LENGTH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_Length_Desc() { regOBD("LENGTH"); return this; }

    protected ConditionValue _width;
    public ConditionValue xdfgetWidth()
    { if (_width == null) { _width = nCV(); }
      return _width; }
    protected ConditionValue xgetCValueWidth() { return xdfgetWidth(); }

    /**
     * Add order-by as ascend. <br>
     * WIDTH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_Width_Asc() { regOBA("WIDTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * WIDTH: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_Width_Desc() { regOBD("WIDTH"); return this; }

    protected ConditionValue _height;
    public ConditionValue xdfgetHeight()
    { if (_height == null) { _height = nCV(); }
      return _height; }
    protected ConditionValue xgetCValueHeight() { return xdfgetHeight(); }

    /**
     * Add order-by as ascend. <br>
     * HEIGHT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_Height_Asc() { regOBA("HEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEIGHT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_Height_Desc() { regOBD("HEIGHT"); return this; }

    protected ConditionValue _volume;
    public ConditionValue xdfgetVolume()
    { if (_volume == null) { _volume = nCV(); }
      return _volume; }
    protected ConditionValue xgetCValueVolume() { return xdfgetVolume(); }

    /**
     * Add order-by as ascend. <br>
     * VOLUME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_Volume_Asc() { regOBA("VOLUME"); return this; }

    /**
     * Add order-by as descend. <br>
     * VOLUME: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_Volume_Desc() { regOBD("VOLUME"); return this; }

    protected ConditionValue _netWeight;
    public ConditionValue xdfgetNetWeight()
    { if (_netWeight == null) { _netWeight = nCV(); }
      return _netWeight; }
    protected ConditionValue xgetCValueNetWeight() { return xdfgetNetWeight(); }

    /**
     * Add order-by as ascend. <br>
     * NET_WEIGHT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_NetWeight_Asc() { regOBA("NET_WEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * NET_WEIGHT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_NetWeight_Desc() { regOBD("NET_WEIGHT"); return this; }

    protected ConditionValue _grossWeight;
    public ConditionValue xdfgetGrossWeight()
    { if (_grossWeight == null) { _grossWeight = nCV(); }
      return _grossWeight; }
    protected ConditionValue xgetCValueGrossWeight() { return xdfgetGrossWeight(); }

    /**
     * Add order-by as ascend. <br>
     * GROSS_WEIGHT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_GrossWeight_Asc() { regOBA("GROSS_WEIGHT"); return this; }

    /**
     * Add order-by as descend. <br>
     * GROSS_WEIGHT: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_GrossWeight_Desc() { regOBD("GROSS_WEIGHT"); return this; }

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
    public BsEProductCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEProductCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEProductCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEProductCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEProductCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEProductCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEProductCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEProductCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEProductCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEProductCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EProductCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EProductCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EProductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EProductCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EProductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EProductCQ> _myselfExistsMap;
    public Map<String, EProductCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EProductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EProductCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EProductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EProductCB.class.getName(); }
    protected String xCQ() { return EProductCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
