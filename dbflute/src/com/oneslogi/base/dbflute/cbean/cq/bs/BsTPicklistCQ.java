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
 * The base condition-query of T_PICKLIST.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPicklistCQ extends AbstractBsTPicklistCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPicklistCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPicklistCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_PICKLIST) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TPicklistCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TPicklistCIQ xcreateCIQ() {
        TPicklistCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TPicklistCIQ xnewCIQ() {
        return new TPicklistCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_PICKLIST on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TPicklistCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TPicklistCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _tPicklistId;
    public ConditionValue xdfgetTPicklistId()
    { if (_tPicklistId == null) { _tPicklistId = nCV(); }
      return _tPicklistId; }
    protected ConditionValue xgetCValueTPicklistId() { return xdfgetTPicklistId(); }

    /**
     * Add order-by as ascend. <br>
     * T_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_TPicklistId_Asc() { regOBA("T_PICKLIST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * T_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_TPicklistId_Desc() { regOBD("T_PICKLIST_ID"); return this; }

    protected ConditionValue _picklistkey;
    public ConditionValue xdfgetPicklistkey()
    { if (_picklistkey == null) { _picklistkey = nCV(); }
      return _picklistkey; }
    protected ConditionValue xgetCValuePicklistkey() { return xdfgetPicklistkey(); }

    /**
     * Add order-by as ascend. <br>
     * PICKLISTKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Picklistkey_Asc() { regOBA("PICKLISTKEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKLISTKEY: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Picklistkey_Desc() { regOBD("PICKLISTKEY"); return this; }

    protected ConditionValue _workallocateid;
    public ConditionValue xdfgetWorkallocateid()
    { if (_workallocateid == null) { _workallocateid = nCV(); }
      return _workallocateid; }
    protected ConditionValue xgetCValueWorkallocateid() { return xdfgetWorkallocateid(); }

    /**
     * Add order-by as ascend. <br>
     * WORKALLOCATEID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Workallocateid_Asc() { regOBA("WORKALLOCATEID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORKALLOCATEID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Workallocateid_Desc() { regOBD("WORKALLOCATEID"); return this; }

    protected ConditionValue _floor;
    public ConditionValue xdfgetFloor()
    { if (_floor == null) { _floor = nCV(); }
      return _floor; }
    protected ConditionValue xgetCValueFloor() { return xdfgetFloor(); }

    /**
     * Add order-by as ascend. <br>
     * FLOOR: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Floor_Asc() { regOBA("FLOOR"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLOOR: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Floor_Desc() { regOBD("FLOOR"); return this; }

    protected ConditionValue _listkbn;
    public ConditionValue xdfgetListkbn()
    { if (_listkbn == null) { _listkbn = nCV(); }
      return _listkbn; }
    protected ConditionValue xgetCValueListkbn() { return xdfgetListkbn(); }

    /**
     * Add order-by as ascend. <br>
     * LISTKBN: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Listkbn_Asc() { regOBA("LISTKBN"); return this; }

    /**
     * Add order-by as descend. <br>
     * LISTKBN: {NotNull, char(1)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Listkbn_Desc() { regOBD("LISTKBN"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsTPicklistCQ addOrderBy_Lot1_Asc() { regOBA("LOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Lot1_Desc() { regOBD("LOT1"); return this; }

    protected ConditionValue _lot2;
    public ConditionValue xdfgetLot2()
    { if (_lot2 == null) { _lot2 = nCV(); }
      return _lot2; }
    protected ConditionValue xgetCValueLot2() { return xdfgetLot2(); }

    /**
     * Add order-by as ascend. <br>
     * LOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Lot2_Asc() { regOBA("LOT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Lot2_Desc() { regOBD("LOT2"); return this; }

    protected ConditionValue _lot3;
    public ConditionValue xdfgetLot3()
    { if (_lot3 == null) { _lot3 = nCV(); }
      return _lot3; }
    protected ConditionValue xgetCValueLot3() { return xdfgetLot3(); }

    /**
     * Add order-by as ascend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

    protected ConditionValue _lot4;
    public ConditionValue xdfgetLot4()
    { if (_lot4 == null) { _lot4 = nCV(); }
      return _lot4; }
    protected ConditionValue xgetCValueLot4() { return xdfgetLot4(); }

    /**
     * Add order-by as ascend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

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
    public BsTPicklistCQ addOrderBy_Otherlot1_Asc() { regOBA("OTHERLOT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHERLOT1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Otherlot1_Desc() { regOBD("OTHERLOT1"); return this; }

    protected ConditionValue _noshippingflg;
    public ConditionValue xdfgetNoshippingflg()
    { if (_noshippingflg == null) { _noshippingflg = nCV(); }
      return _noshippingflg; }
    protected ConditionValue xgetCValueNoshippingflg() { return xdfgetNoshippingflg(); }

    /**
     * Add order-by as ascend. <br>
     * NOSHIPPINGFLG: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Noshippingflg_Asc() { regOBA("NOSHIPPINGFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOSHIPPINGFLG: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Noshippingflg_Desc() { regOBD("NOSHIPPINGFLG"); return this; }

    protected ConditionValue _pickschdate;
    public ConditionValue xdfgetPickschdate()
    { if (_pickschdate == null) { _pickschdate = nCV(); }
      return _pickschdate; }
    protected ConditionValue xgetCValuePickschdate() { return xdfgetPickschdate(); }

    /**
     * Add order-by as ascend. <br>
     * PICKSCHDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Pickschdate_Asc() { regOBA("PICKSCHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKSCHDATE: {NotNull, varchar(8)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Pickschdate_Desc() { regOBD("PICKSCHDATE"); return this; }

    protected ConditionValue _expectqty1;
    public ConditionValue xdfgetExpectqty1()
    { if (_expectqty1 == null) { _expectqty1 = nCV(); }
      return _expectqty1; }
    protected ConditionValue xgetCValueExpectqty1() { return xdfgetExpectqty1(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY1: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Expectqty1_Asc() { regOBA("EXPECTQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY1: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Expectqty1_Desc() { regOBD("EXPECTQTY1"); return this; }

    protected ConditionValue _expectqty2;
    public ConditionValue xdfgetExpectqty2()
    { if (_expectqty2 == null) { _expectqty2 = nCV(); }
      return _expectqty2; }
    protected ConditionValue xgetCValueExpectqty2() { return xdfgetExpectqty2(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY2: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Expectqty2_Asc() { regOBA("EXPECTQTY2"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY2: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Expectqty2_Desc() { regOBD("EXPECTQTY2"); return this; }

    protected ConditionValue _expectqty3;
    public ConditionValue xdfgetExpectqty3()
    { if (_expectqty3 == null) { _expectqty3 = nCV(); }
      return _expectqty3; }
    protected ConditionValue xgetCValueExpectqty3() { return xdfgetExpectqty3(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY3: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Expectqty3_Asc() { regOBA("EXPECTQTY3"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY3: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Expectqty3_Desc() { regOBD("EXPECTQTY3"); return this; }

    protected ConditionValue _pickedqty1;
    public ConditionValue xdfgetPickedqty1()
    { if (_pickedqty1 == null) { _pickedqty1 = nCV(); }
      return _pickedqty1; }
    protected ConditionValue xgetCValuePickedqty1() { return xdfgetPickedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * PICKEDQTY1: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Pickedqty1_Asc() { regOBA("PICKEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKEDQTY1: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Pickedqty1_Desc() { regOBD("PICKEDQTY1"); return this; }

    protected ConditionValue _pickedqty2;
    public ConditionValue xdfgetPickedqty2()
    { if (_pickedqty2 == null) { _pickedqty2 = nCV(); }
      return _pickedqty2; }
    protected ConditionValue xgetCValuePickedqty2() { return xdfgetPickedqty2(); }

    /**
     * Add order-by as ascend. <br>
     * PICKEDQTY2: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Pickedqty2_Asc() { regOBA("PICKEDQTY2"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKEDQTY2: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Pickedqty2_Desc() { regOBD("PICKEDQTY2"); return this; }

    protected ConditionValue _pickedqty3;
    public ConditionValue xdfgetPickedqty3()
    { if (_pickedqty3 == null) { _pickedqty3 = nCV(); }
      return _pickedqty3; }
    protected ConditionValue xgetCValuePickedqty3() { return xdfgetPickedqty3(); }

    /**
     * Add order-by as ascend. <br>
     * PICKEDQTY3: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Pickedqty3_Asc() { regOBA("PICKEDQTY3"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKEDQTY3: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Pickedqty3_Desc() { regOBD("PICKEDQTY3"); return this; }

    protected ConditionValue _sortrecievedqty1;
    public ConditionValue xdfgetSortrecievedqty1()
    { if (_sortrecievedqty1 == null) { _sortrecievedqty1 = nCV(); }
      return _sortrecievedqty1; }
    protected ConditionValue xgetCValueSortrecievedqty1() { return xdfgetSortrecievedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * SORTRECIEVEDQTY1: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Sortrecievedqty1_Asc() { regOBA("SORTRECIEVEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTRECIEVEDQTY1: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Sortrecievedqty1_Desc() { regOBD("SORTRECIEVEDQTY1"); return this; }

    protected ConditionValue _sortrecievedqty2;
    public ConditionValue xdfgetSortrecievedqty2()
    { if (_sortrecievedqty2 == null) { _sortrecievedqty2 = nCV(); }
      return _sortrecievedqty2; }
    protected ConditionValue xgetCValueSortrecievedqty2() { return xdfgetSortrecievedqty2(); }

    /**
     * Add order-by as ascend. <br>
     * SORTRECIEVEDQTY2: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Sortrecievedqty2_Asc() { regOBA("SORTRECIEVEDQTY2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTRECIEVEDQTY2: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Sortrecievedqty2_Desc() { regOBD("SORTRECIEVEDQTY2"); return this; }

    protected ConditionValue _sortrecievedqty3;
    public ConditionValue xdfgetSortrecievedqty3()
    { if (_sortrecievedqty3 == null) { _sortrecievedqty3 = nCV(); }
      return _sortrecievedqty3; }
    protected ConditionValue xgetCValueSortrecievedqty3() { return xdfgetSortrecievedqty3(); }

    /**
     * Add order-by as ascend. <br>
     * SORTRECIEVEDQTY3: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Sortrecievedqty3_Asc() { regOBA("SORTRECIEVEDQTY3"); return this; }

    /**
     * Add order-by as descend. <br>
     * SORTRECIEVEDQTY3: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_Sortrecievedqty3_Desc() { regOBD("SORTRECIEVEDQTY3"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTPicklistCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTPicklistCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTPicklistCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTPicklistCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTPicklistCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTPicklistCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTPicklistCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTPicklistCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTPicklistCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTPicklistCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTPicklistCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTPicklistCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TPicklistCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TPicklistCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TPicklistCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TPicklistCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TPicklistCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TPicklistCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TPicklistCQ> _myselfExistsMap;
    public Map<String, TPicklistCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TPicklistCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TPicklistCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TPicklistCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TPicklistCB.class.getName(); }
    protected String xCQ() { return TPicklistCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
