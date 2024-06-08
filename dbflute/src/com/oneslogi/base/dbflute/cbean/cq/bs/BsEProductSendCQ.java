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
 * The base condition-query of E_PRODUCT_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class BsEProductSendCQ extends AbstractBsEProductSendCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EProductSendCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEProductSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from E_PRODUCT_SEND) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EProductSendCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EProductSendCIQ xcreateCIQ() {
        EProductSendCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EProductSendCIQ xnewCIQ() {
        return new EProductSendCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join E_PRODUCT_SEND on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EProductSendCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EProductSendCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productSendId;
    public ConditionValue xdfgetProductSendId()
    { if (_productSendId == null) { _productSendId = nCV(); }
      return _productSendId; }
    protected ConditionValue xgetCValueProductSendId() { return xdfgetProductSendId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_ProductSendId_Asc() { regOBA("PRODUCT_SEND_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_ProductSendId_Desc() { regOBD("PRODUCT_SEND_ID"); return this; }

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
    public BsEProductSendCQ addOrderBy_SendCd_Asc() { regOBA("SEND_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_SendCd_Desc() { regOBD("SEND_CD"); return this; }

    protected ConditionValue _sendRowId;
    public ConditionValue xdfgetSendRowId()
    { if (_sendRowId == null) { _sendRowId = nCV(); }
      return _sendRowId; }
    protected ConditionValue xgetCValueSendRowId() { return xdfgetSendRowId(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_ROW_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_SendRowId_Asc() { regOBA("SEND_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_ROW_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_SendRowId_Desc() { regOBD("SEND_ROW_ID"); return this; }

    protected ConditionValue _processedFlg;
    public ConditionValue xdfgetProcessedFlg()
    { if (_processedFlg == null) { _processedFlg = nCV(); }
      return _processedFlg; }
    protected ConditionValue xgetCValueProcessedFlg() { return xdfgetProcessedFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESSED_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_ProcessedFlg_Asc() { regOBA("PROCESSED_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESSED_FLG: {NotNull, char(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_ProcessedFlg_Desc() { regOBD("PROCESSED_FLG"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _productNm;
    public ConditionValue xdfgetProductNm()
    { if (_productNm == null) { _productNm = nCV(); }
      return _productNm; }
    protected ConditionValue xgetCValueProductNm() { return xdfgetProductNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {NotNull, varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _productAbbr;
    public ConditionValue xdfgetProductAbbr()
    { if (_productAbbr == null) { _productAbbr = nCV(); }
      return _productAbbr; }
    protected ConditionValue xgetCValueProductAbbr() { return xdfgetProductAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ABBR: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_ProductAbbr_Asc() { regOBA("PRODUCT_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ABBR: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_ProductAbbr_Desc() { regOBD("PRODUCT_ABBR"); return this; }

    protected ConditionValue _priceBuy;
    public ConditionValue xdfgetPriceBuy()
    { if (_priceBuy == null) { _priceBuy = nCV(); }
      return _priceBuy; }
    protected ConditionValue xgetCValuePriceBuy() { return xdfgetPriceBuy(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_BUY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_PriceBuy_Asc() { regOBA("PRICE_BUY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_BUY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_PriceBuy_Desc() { regOBD("PRICE_BUY"); return this; }

    protected ConditionValue _unit2;
    public ConditionValue xdfgetUnit2()
    { if (_unit2 == null) { _unit2 = nCV(); }
      return _unit2; }
    protected ConditionValue xgetCValueUnit2() { return xdfgetUnit2(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT2: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_Unit2_Asc() { regOBA("UNIT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT2: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_Unit2_Desc() { regOBD("UNIT2"); return this; }

    protected ConditionValue _bxPerNumber;
    public ConditionValue xdfgetBxPerNumber()
    { if (_bxPerNumber == null) { _bxPerNumber = nCV(); }
      return _bxPerNumber; }
    protected ConditionValue xgetCValueBxPerNumber() { return xdfgetBxPerNumber(); }

    /**
     * Add order-by as ascend. <br>
     * BX_PER_NUMBER: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_BxPerNumber_Asc() { regOBA("BX_PER_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * BX_PER_NUMBER: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_BxPerNumber_Desc() { regOBD("BX_PER_NUMBER"); return this; }

    protected ConditionValue _pBxCount;
    public ConditionValue xdfgetPBxCount()
    { if (_pBxCount == null) { _pBxCount = nCV(); }
      return _pBxCount; }
    protected ConditionValue xgetCValuePBxCount() { return xdfgetPBxCount(); }

    /**
     * Add order-by as ascend. <br>
     * P_BX_COUNT: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_PBxCount_Asc() { regOBA("P_BX_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_BX_COUNT: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_PBxCount_Desc() { regOBD("P_BX_COUNT"); return this; }

    protected ConditionValue _fUser1;
    public ConditionValue xdfgetFUser1()
    { if (_fUser1 == null) { _fUser1 = nCV(); }
      return _fUser1; }
    protected ConditionValue xgetCValueFUser1() { return xdfgetFUser1(); }

    /**
     * Add order-by as ascend. <br>
     * F_USER1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_FUser1_Asc() { regOBA("F_USER1"); return this; }

    /**
     * Add order-by as descend. <br>
     * F_USER1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_FUser1_Desc() { regOBD("F_USER1"); return this; }

    protected ConditionValue _length1;
    public ConditionValue xdfgetLength1()
    { if (_length1 == null) { _length1 = nCV(); }
      return _length1; }
    protected ConditionValue xgetCValueLength1() { return xdfgetLength1(); }

    /**
     * Add order-by as ascend. <br>
     * LENGTH1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_Length1_Asc() { regOBA("LENGTH1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LENGTH1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_Length1_Desc() { regOBD("LENGTH1"); return this; }

    protected ConditionValue _width1;
    public ConditionValue xdfgetWidth1()
    { if (_width1 == null) { _width1 = nCV(); }
      return _width1; }
    protected ConditionValue xgetCValueWidth1() { return xdfgetWidth1(); }

    /**
     * Add order-by as ascend. <br>
     * WIDTH1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_Width1_Asc() { regOBA("WIDTH1"); return this; }

    /**
     * Add order-by as descend. <br>
     * WIDTH1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_Width1_Desc() { regOBD("WIDTH1"); return this; }

    protected ConditionValue _height1;
    public ConditionValue xdfgetHeight1()
    { if (_height1 == null) { _height1 = nCV(); }
      return _height1; }
    protected ConditionValue xgetCValueHeight1() { return xdfgetHeight1(); }

    /**
     * Add order-by as ascend. <br>
     * HEIGHT1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_Height1_Asc() { regOBA("HEIGHT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEIGHT1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_Height1_Desc() { regOBD("HEIGHT1"); return this; }

    protected ConditionValue _pOdd;
    public ConditionValue xdfgetPOdd()
    { if (_pOdd == null) { _pOdd = nCV(); }
      return _pOdd; }
    protected ConditionValue xgetCValuePOdd() { return xdfgetPOdd(); }

    /**
     * Add order-by as ascend. <br>
     * P_ODD: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_POdd_Asc() { regOBA("P_ODD"); return this; }

    /**
     * Add order-by as descend. <br>
     * P_ODD: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_POdd_Desc() { regOBD("P_ODD"); return this; }

    protected ConditionValue _spOperator1;
    public ConditionValue xdfgetSpOperator1()
    { if (_spOperator1 == null) { _spOperator1 = nCV(); }
      return _spOperator1; }
    protected ConditionValue xgetCValueSpOperator1() { return xdfgetSpOperator1(); }

    /**
     * Add order-by as ascend. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_SpOperator1_Asc() { regOBA("SP_OPERATOR1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SP_OPERATOR1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_SpOperator1_Desc() { regOBD("SP_OPERATOR1"); return this; }

    protected ConditionValue _manuitemcd;
    public ConditionValue xdfgetManuitemcd()
    { if (_manuitemcd == null) { _manuitemcd = nCV(); }
      return _manuitemcd; }
    protected ConditionValue xgetCValueManuitemcd() { return xdfgetManuitemcd(); }

    /**
     * Add order-by as ascend. <br>
     * MANUITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_Manuitemcd_Asc() { regOBA("MANUITEMCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MANUITEMCD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_Manuitemcd_Desc() { regOBD("MANUITEMCD"); return this; }

    protected ConditionValue _useruse3;
    public ConditionValue xdfgetUseruse3()
    { if (_useruse3 == null) { _useruse3 = nCV(); }
      return _useruse3; }
    protected ConditionValue xgetCValueUseruse3() { return xdfgetUseruse3(); }

    /**
     * Add order-by as ascend. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_Useruse3_Asc() { regOBA("USERUSE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * USERUSE3: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_Useruse3_Desc() { regOBD("USERUSE3"); return this; }

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
    public BsEProductSendCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEProductSendCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEProductSendCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEProductSendCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEProductSendCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEProductSendCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEProductSendCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEProductSendCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEProductSendCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsEProductSendCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEProductSendCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEProductSendCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EProductSendCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EProductSendCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EProductSendCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EProductSendCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EProductSendCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EProductSendCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EProductSendCQ> _myselfExistsMap;
    public Map<String, EProductSendCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EProductSendCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EProductSendCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EProductSendCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EProductSendCB.class.getName(); }
    protected String xCQ() { return EProductSendCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
