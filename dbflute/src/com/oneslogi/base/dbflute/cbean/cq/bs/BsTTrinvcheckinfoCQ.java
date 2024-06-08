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
 * The base condition-query of T_TRINVCHECKINFO.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrinvcheckinfoCQ extends AbstractBsTTrinvcheckinfoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrinvcheckinfoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrinvcheckinfoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRINVCHECKINFO) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrinvcheckinfoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrinvcheckinfoCIQ xcreateCIQ() {
        TTrinvcheckinfoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrinvcheckinfoCIQ xnewCIQ() {
        return new TTrinvcheckinfoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRINVCHECKINFO on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrinvcheckinfoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrinvcheckinfoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _trinvcheckinfoId;
    public ConditionValue xdfgetTrinvcheckinfoId()
    { if (_trinvcheckinfoId == null) { _trinvcheckinfoId = nCV(); }
      return _trinvcheckinfoId; }
    protected ConditionValue xgetCValueTrinvcheckinfoId() { return xdfgetTrinvcheckinfoId(); }

    /**
     * Add order-by as ascend. <br>
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_TrinvcheckinfoId_Asc() { regOBA("TRINVCHECKINFO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_TrinvcheckinfoId_Desc() { regOBD("TRINVCHECKINFO_ID"); return this; }

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
    public BsTTrinvcheckinfoCQ addOrderBy_Warehousecd_Asc() { regOBA("WAREHOUSECD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Warehousecd_Desc() { regOBD("WAREHOUSECD"); return this; }

    protected ConditionValue _executedate;
    public ConditionValue xdfgetExecutedate()
    { if (_executedate == null) { _executedate = nCV(); }
      return _executedate; }
    protected ConditionValue xgetCValueExecutedate() { return xdfgetExecutedate(); }

    /**
     * Add order-by as ascend. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Executedate_Asc() { regOBA("EXECUTEDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Executedate_Desc() { regOBD("EXECUTEDATE"); return this; }

    protected ConditionValue _inoutkbn;
    public ConditionValue xdfgetInoutkbn()
    { if (_inoutkbn == null) { _inoutkbn = nCV(); }
      return _inoutkbn; }
    protected ConditionValue xgetCValueInoutkbn() { return xdfgetInoutkbn(); }

    /**
     * Add order-by as ascend. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Inoutkbn_Asc() { regOBA("INOUTKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Inoutkbn_Desc() { regOBD("INOUTKBN"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    public Map<String, MProductCQ> getProductId_InScopeRelation_MProduct() { return xgetSQueMap("productId_InScopeRelation_MProduct"); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_InScopeRelation_MProduct", sq); }

    public Map<String, MProductCQ> getProductId_NotInScopeRelation_MProduct() { return xgetSQueMap("productId_NotInScopeRelation_MProduct"); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_NotInScopeRelation_MProduct", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _dualitemcdflg;
    public ConditionValue xdfgetDualitemcdflg()
    { if (_dualitemcdflg == null) { _dualitemcdflg = nCV(); }
      return _dualitemcdflg; }
    protected ConditionValue xgetCValueDualitemcdflg() { return xdfgetDualitemcdflg(); }

    /**
     * Add order-by as ascend. <br>
     * DUALITEMCDFLG: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Dualitemcdflg_Asc() { regOBA("DUALITEMCDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DUALITEMCDFLG: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Dualitemcdflg_Desc() { regOBD("DUALITEMCDFLG"); return this; }

    protected ConditionValue _dualitemcd;
    public ConditionValue xdfgetDualitemcd()
    { if (_dualitemcd == null) { _dualitemcd = nCV(); }
      return _dualitemcd; }
    protected ConditionValue xgetCValueDualitemcd() { return xdfgetDualitemcd(); }

    /**
     * Add order-by as ascend. <br>
     * DUALITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Dualitemcd_Asc() { regOBA("DUALITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DUALITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Dualitemcd_Desc() { regOBD("DUALITEMCD"); return this; }

    protected ConditionValue _ydaytlequlytotalinv;
    public ConditionValue xdfgetYdaytlequlytotalinv()
    { if (_ydaytlequlytotalinv == null) { _ydaytlequlytotalinv = nCV(); }
      return _ydaytlequlytotalinv; }
    protected ConditionValue xgetCValueYdaytlequlytotalinv() { return xdfgetYdaytlequlytotalinv(); }

    /**
     * Add order-by as ascend. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Ydaytlequlytotalinv_Asc() { regOBA("YDAYTLEQULYTOTALINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Ydaytlequlytotalinv_Desc() { regOBD("YDAYTLEQULYTOTALINV"); return this; }

    protected ConditionValue _tdayeqytotalinv;
    public ConditionValue xdfgetTdayeqytotalinv()
    { if (_tdayeqytotalinv == null) { _tdayeqytotalinv = nCV(); }
      return _tdayeqytotalinv; }
    protected ConditionValue xgetCValueTdayeqytotalinv() { return xdfgetTdayeqytotalinv(); }

    /**
     * Add order-by as ascend. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Tdayeqytotalinv_Asc() { regOBA("TDAYEQYTOTALINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Tdayeqytotalinv_Desc() { regOBD("TDAYEQYTOTALINV"); return this; }

    protected ConditionValue _sysinvtotalinv;
    public ConditionValue xdfgetSysinvtotalinv()
    { if (_sysinvtotalinv == null) { _sysinvtotalinv = nCV(); }
      return _sysinvtotalinv; }
    protected ConditionValue xgetCValueSysinvtotalinv() { return xdfgetSysinvtotalinv(); }

    /**
     * Add order-by as ascend. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Sysinvtotalinv_Asc() { regOBA("SYSINVTOTALINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Sysinvtotalinv_Desc() { regOBD("SYSINVTOTALINV"); return this; }

    protected ConditionValue _investtotalinv;
    public ConditionValue xdfgetInvesttotalinv()
    { if (_investtotalinv == null) { _investtotalinv = nCV(); }
      return _investtotalinv; }
    protected ConditionValue xgetCValueInvesttotalinv() { return xdfgetInvesttotalinv(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investtotalinv_Asc() { regOBA("INVESTTOTALINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investtotalinv_Desc() { regOBD("INVESTTOTALINV"); return this; }

    protected ConditionValue _investkeeplocinv;
    public ConditionValue xdfgetInvestkeeplocinv()
    { if (_investkeeplocinv == null) { _investkeeplocinv = nCV(); }
      return _investkeeplocinv; }
    protected ConditionValue xgetCValueInvestkeeplocinv() { return xdfgetInvestkeeplocinv(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investkeeplocinv_Asc() { regOBA("INVESTKEEPLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investkeeplocinv_Desc() { regOBD("INVESTKEEPLOCINV"); return this; }

    protected ConditionValue _investreceivelocinv;
    public ConditionValue xdfgetInvestreceivelocinv()
    { if (_investreceivelocinv == null) { _investreceivelocinv = nCV(); }
      return _investreceivelocinv; }
    protected ConditionValue xgetCValueInvestreceivelocinv() { return xdfgetInvestreceivelocinv(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investreceivelocinv_Asc() { regOBA("INVESTRECEIVELOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investreceivelocinv_Desc() { regOBD("INVESTRECEIVELOCINV"); return this; }

    protected ConditionValue _investdamageitem;
    public ConditionValue xdfgetInvestdamageitem()
    { if (_investdamageitem == null) { _investdamageitem = nCV(); }
      return _investdamageitem; }
    protected ConditionValue xgetCValueInvestdamageitem() { return xdfgetInvestdamageitem(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investdamageitem_Asc() { regOBA("INVESTDAMAGEITEM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investdamageitem_Desc() { regOBD("INVESTDAMAGEITEM"); return this; }

    protected ConditionValue _investclssifylocinv;
    public ConditionValue xdfgetInvestclssifylocinv()
    { if (_investclssifylocinv == null) { _investclssifylocinv = nCV(); }
      return _investclssifylocinv; }
    protected ConditionValue xgetCValueInvestclssifylocinv() { return xdfgetInvestclssifylocinv(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investclssifylocinv_Asc() { regOBA("INVESTCLSSIFYLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investclssifylocinv_Desc() { regOBD("INVESTCLSSIFYLOCINV"); return this; }

    protected ConditionValue _investtmplocinv;
    public ConditionValue xdfgetInvesttmplocinv()
    { if (_investtmplocinv == null) { _investtmplocinv = nCV(); }
      return _investtmplocinv; }
    protected ConditionValue xgetCValueInvesttmplocinv() { return xdfgetInvesttmplocinv(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investtmplocinv_Asc() { regOBA("INVESTTMPLOCINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investtmplocinv_Desc() { regOBD("INVESTTMPLOCINV"); return this; }

    protected ConditionValue _investautoinv;
    public ConditionValue xdfgetInvestautoinv()
    { if (_investautoinv == null) { _investautoinv = nCV(); }
      return _investautoinv; }
    protected ConditionValue xgetCValueInvestautoinv() { return xdfgetInvestautoinv(); }

    /**
     * Add order-by as ascend. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investautoinv_Asc() { regOBA("INVESTAUTOINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Investautoinv_Desc() { regOBD("INVESTAUTOINV"); return this; }

    protected ConditionValue _excesstotalinv;
    public ConditionValue xdfgetExcesstotalinv()
    { if (_excesstotalinv == null) { _excesstotalinv = nCV(); }
      return _excesstotalinv; }
    protected ConditionValue xgetCValueExcesstotalinv() { return xdfgetExcesstotalinv(); }

    /**
     * Add order-by as ascend. <br>
     * EXCESSTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Excesstotalinv_Asc() { regOBA("EXCESSTOTALINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXCESSTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Excesstotalinv_Desc() { regOBD("EXCESSTOTALINV"); return this; }

    protected ConditionValue _defecttotalinv;
    public ConditionValue xdfgetDefecttotalinv()
    { if (_defecttotalinv == null) { _defecttotalinv = nCV(); }
      return _defecttotalinv; }
    protected ConditionValue xgetCValueDefecttotalinv() { return xdfgetDefecttotalinv(); }

    /**
     * Add order-by as ascend. <br>
     * DEFECTTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Defecttotalinv_Asc() { regOBA("DEFECTTOTALINV"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFECTTOTALINV: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Defecttotalinv_Desc() { regOBD("DEFECTTOTALINV"); return this; }

    protected ConditionValue _capitemflg;
    public ConditionValue xdfgetCapitemflg()
    { if (_capitemflg == null) { _capitemflg = nCV(); }
      return _capitemflg; }
    protected ConditionValue xgetCValueCapitemflg() { return xdfgetCapitemflg(); }

    /**
     * Add order-by as ascend. <br>
     * CAPITEMFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Capitemflg_Asc() { regOBA("CAPITEMFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CAPITEMFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_Capitemflg_Desc() { regOBD("CAPITEMFLG"); return this; }

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
    public BsTTrinvcheckinfoCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsTTrinvcheckinfoCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTTrinvcheckinfoCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrinvcheckinfoCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrinvcheckinfoCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrinvcheckinfoCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrinvcheckinfoCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrinvcheckinfoCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrinvcheckinfoCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrinvcheckinfoCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrinvcheckinfoCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrinvcheckinfoCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrinvcheckinfoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrinvcheckinfoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TTrinvcheckinfoCQ bq = (TTrinvcheckinfoCQ)bqs;
        TTrinvcheckinfoCQ uq = (TTrinvcheckinfoCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("T_TRINVCHECKINFO", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

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
        String nrp = xresolveNRP("T_TRINVCHECKINFO", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProductCQ queryMProduct() {
        return xdfgetConditionQueryMProduct();
    }
    public MProductCQ xdfgetConditionQueryMProduct() {
        String prop = "mProduct";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProduct()); xsetupOuterJoinMProduct(); }
        return xgetQueRlMap(prop);
    }
    protected MProductCQ xcreateQueryMProduct() {
        String nrp = xresolveNRP("T_TRINVCHECKINFO", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TTrinvcheckinfoCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrinvcheckinfoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrinvcheckinfoCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrinvcheckinfoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrinvcheckinfoCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrinvcheckinfoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrinvcheckinfoCQ> _myselfExistsMap;
    public Map<String, TTrinvcheckinfoCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrinvcheckinfoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrinvcheckinfoCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrinvcheckinfoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrinvcheckinfoCB.class.getName(); }
    protected String xCQ() { return TTrinvcheckinfoCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
