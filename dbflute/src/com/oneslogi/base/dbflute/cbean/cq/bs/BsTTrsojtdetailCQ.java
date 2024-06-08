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
 * The base condition-query of T_TRSOJTDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrsojtdetailCQ extends AbstractBsTTrsojtdetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrsojtdetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrsojtdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from T_TRSOJTDETAIL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TTrsojtdetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TTrsojtdetailCIQ xcreateCIQ() {
        TTrsojtdetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TTrsojtdetailCIQ xnewCIQ() {
        return new TTrsojtdetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join T_TRSOJTDETAIL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TTrsojtdetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TTrsojtdetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sojtlineid;
    public ConditionValue xdfgetSojtlineid()
    { if (_sojtlineid == null) { _sojtlineid = nCV(); }
      return _sojtlineid; }
    protected ConditionValue xgetCValueSojtlineid() { return xdfgetSojtlineid(); }

    /**
     * Add order-by as ascend. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Sojtlineid_Asc() { regOBA("SOJTLINEID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Sojtlineid_Desc() { regOBD("SOJTLINEID"); return this; }

    protected ConditionValue _sojtid;
    public ConditionValue xdfgetSojtid()
    { if (_sojtid == null) { _sojtid = nCV(); }
      return _sojtid; }
    protected ConditionValue xgetCValueSojtid() { return xdfgetSojtid(); }

    /**
     * Add order-by as ascend. <br>
     * SOJTID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Sojtid_Asc() { regOBA("SOJTID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOJTID: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Sojtid_Desc() { regOBD("SOJTID"); return this; }

    protected ConditionValue _sojtlineno;
    public ConditionValue xdfgetSojtlineno()
    { if (_sojtlineno == null) { _sojtlineno = nCV(); }
      return _sojtlineno; }
    protected ConditionValue xgetCValueSojtlineno() { return xdfgetSojtlineno(); }

    /**
     * Add order-by as ascend. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Sojtlineno_Asc() { regOBA("SOJTLINENO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Sojtlineno_Desc() { regOBD("SOJTLINENO"); return this; }

    protected ConditionValue _datatype;
    public ConditionValue xdfgetDatatype()
    { if (_datatype == null) { _datatype = nCV(); }
      return _datatype; }
    protected ConditionValue xgetCValueDatatype() { return xdfgetDatatype(); }

    /**
     * Add order-by as ascend. <br>
     * DATATYPE: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Datatype_Asc() { regOBA("DATATYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATATYPE: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Datatype_Desc() { regOBD("DATATYPE"); return this; }

    protected ConditionValue _planseq;
    public ConditionValue xdfgetPlanseq()
    { if (_planseq == null) { _planseq = nCV(); }
      return _planseq; }
    protected ConditionValue xgetCValuePlanseq() { return xdfgetPlanseq(); }

    /**
     * Add order-by as ascend. <br>
     * PLANSEQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Planseq_Asc() { regOBA("PLANSEQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANSEQ: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Planseq_Desc() { regOBD("PLANSEQ"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsTTrsojtdetailCQ addOrderBy_Lot3_Asc() { regOBA("LOT3"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Lot3_Desc() { regOBD("LOT3"); return this; }

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
    public BsTTrsojtdetailCQ addOrderBy_Lot4_Asc() { regOBA("LOT4"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT4: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Lot4_Desc() { regOBD("LOT4"); return this; }

    protected ConditionValue _expectqty1;
    public ConditionValue xdfgetExpectqty1()
    { if (_expectqty1 == null) { _expectqty1 = nCV(); }
      return _expectqty1; }
    protected ConditionValue xgetCValueExpectqty1() { return xdfgetExpectqty1(); }

    /**
     * Add order-by as ascend. <br>
     * EXPECTQTY1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Expectqty1_Asc() { regOBA("EXPECTQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPECTQTY1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Expectqty1_Desc() { regOBD("EXPECTQTY1"); return this; }

    protected ConditionValue _pickedqty1;
    public ConditionValue xdfgetPickedqty1()
    { if (_pickedqty1 == null) { _pickedqty1 = nCV(); }
      return _pickedqty1; }
    protected ConditionValue xgetCValuePickedqty1() { return xdfgetPickedqty1(); }

    /**
     * Add order-by as ascend. <br>
     * PICKEDQTY1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Pickedqty1_Asc() { regOBA("PICKEDQTY1"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKEDQTY1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Pickedqty1_Desc() { regOBD("PICKEDQTY1"); return this; }

    protected ConditionValue _poid;
    public ConditionValue xdfgetPoid()
    { if (_poid == null) { _poid = nCV(); }
      return _poid; }
    protected ConditionValue xgetCValuePoid() { return xdfgetPoid(); }

    /**
     * Add order-by as ascend. <br>
     * POID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Poid_Asc() { regOBA("POID"); return this; }

    /**
     * Add order-by as descend. <br>
     * POID: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Poid_Desc() { regOBD("POID"); return this; }

    protected ConditionValue _palletId;
    public ConditionValue xdfgetPalletId()
    { if (_palletId == null) { _palletId = nCV(); }
      return _palletId; }
    protected ConditionValue xgetCValuePalletId() { return xdfgetPalletId(); }

    /**
     * Add order-by as ascend. <br>
     * PALLET_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_PalletId_Asc() { regOBA("PALLET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALLET_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_PalletId_Desc() { regOBD("PALLET_ID"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _soid;
    public ConditionValue xdfgetSoid()
    { if (_soid == null) { _soid = nCV(); }
      return _soid; }
    protected ConditionValue xgetCValueSoid() { return xdfgetSoid(); }

    /**
     * Add order-by as ascend. <br>
     * SOID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Soid_Asc() { regOBA("SOID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Soid_Desc() { regOBD("SOID"); return this; }

    protected ConditionValue _sodetailid;
    public ConditionValue xdfgetSodetailid()
    { if (_sodetailid == null) { _sodetailid = nCV(); }
      return _sodetailid; }
    protected ConditionValue xgetCValueSodetailid() { return xdfgetSodetailid(); }

    /**
     * Add order-by as ascend. <br>
     * SODETAILID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Sodetailid_Asc() { regOBA("SODETAILID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SODETAILID: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Sodetailid_Desc() { regOBD("SODETAILID"); return this; }

    protected ConditionValue _trsoaddflg;
    public ConditionValue xdfgetTrsoaddflg()
    { if (_trsoaddflg == null) { _trsoaddflg = nCV(); }
      return _trsoaddflg; }
    protected ConditionValue xgetCValueTrsoaddflg() { return xdfgetTrsoaddflg(); }

    /**
     * Add order-by as ascend. <br>
     * TRSOADDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Trsoaddflg_Asc() { regOBA("TRSOADDFLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRSOADDFLG: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Trsoaddflg_Desc() { regOBD("TRSOADDFLG"); return this; }

    protected ConditionValue _planoutseq;
    public ConditionValue xdfgetPlanoutseq()
    { if (_planoutseq == null) { _planoutseq = nCV(); }
      return _planoutseq; }
    protected ConditionValue xgetCValuePlanoutseq() { return xdfgetPlanoutseq(); }

    /**
     * Add order-by as ascend. <br>
     * PLANOUTSEQ: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Planoutseq_Asc() { regOBA("PLANOUTSEQ"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANOUTSEQ: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Planoutseq_Desc() { regOBD("PLANOUTSEQ"); return this; }

    protected ConditionValue _planprice1;
    public ConditionValue xdfgetPlanprice1()
    { if (_planprice1 == null) { _planprice1 = nCV(); }
      return _planprice1; }
    protected ConditionValue xgetCValuePlanprice1() { return xdfgetPlanprice1(); }

    /**
     * Add order-by as ascend. <br>
     * PLANPRICE1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Planprice1_Asc() { regOBA("PLANPRICE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANPRICE1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Planprice1_Desc() { regOBD("PLANPRICE1"); return this; }

    protected ConditionValue _planprice2;
    public ConditionValue xdfgetPlanprice2()
    { if (_planprice2 == null) { _planprice2 = nCV(); }
      return _planprice2; }
    protected ConditionValue xgetCValuePlanprice2() { return xdfgetPlanprice2(); }

    /**
     * Add order-by as ascend. <br>
     * PLANPRICE2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Planprice2_Asc() { regOBA("PLANPRICE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANPRICE2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Planprice2_Desc() { regOBD("PLANPRICE2"); return this; }

    protected ConditionValue _planitemname;
    public ConditionValue xdfgetPlanitemname()
    { if (_planitemname == null) { _planitemname = nCV(); }
      return _planitemname; }
    protected ConditionValue xgetCValuePlanitemname() { return xdfgetPlanitemname(); }

    /**
     * Add order-by as ascend. <br>
     * PLANITEMNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Planitemname_Asc() { regOBA("PLANITEMNAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANITEMNAME: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Planitemname_Desc() { regOBD("PLANITEMNAME"); return this; }

    protected ConditionValue _plandata1;
    public ConditionValue xdfgetPlandata1()
    { if (_plandata1 == null) { _plandata1 = nCV(); }
      return _plandata1; }
    protected ConditionValue xgetCValuePlandata1() { return xdfgetPlandata1(); }

    /**
     * Add order-by as ascend. <br>
     * PLANDATA1: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Plandata1_Asc() { regOBA("PLANDATA1"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANDATA1: {char(1)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Plandata1_Desc() { regOBD("PLANDATA1"); return this; }

    protected ConditionValue _plandata2;
    public ConditionValue xdfgetPlandata2()
    { if (_plandata2 == null) { _plandata2 = nCV(); }
      return _plandata2; }
    protected ConditionValue xgetCValuePlandata2() { return xdfgetPlandata2(); }

    /**
     * Add order-by as ascend. <br>
     * PLANDATA2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Plandata2_Asc() { regOBA("PLANDATA2"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANDATA2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Plandata2_Desc() { regOBD("PLANDATA2"); return this; }

    protected ConditionValue _plandata3;
    public ConditionValue xdfgetPlandata3()
    { if (_plandata3 == null) { _plandata3 = nCV(); }
      return _plandata3; }
    protected ConditionValue xgetCValuePlandata3() { return xdfgetPlandata3(); }

    /**
     * Add order-by as ascend. <br>
     * PLANDATA3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Plandata3_Asc() { regOBA("PLANDATA3"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANDATA3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_Plandata3_Desc() { regOBD("PLANDATA3"); return this; }

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
    public BsTTrsojtdetailCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTTrsojtdetailCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTTrsojtdetailCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTTrsojtdetailCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTTrsojtdetailCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTTrsojtdetailCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTTrsojtdetailCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTTrsojtdetailCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTTrsojtdetailCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsTTrsojtdetailCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTTrsojtdetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTTrsojtdetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TTrsojtdetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TTrsojtdetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TTrsojtdetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TTrsojtdetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TTrsojtdetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TTrsojtdetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TTrsojtdetailCQ> _myselfExistsMap;
    public Map<String, TTrsojtdetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TTrsojtdetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TTrsojtdetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TTrsojtdetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TTrsojtdetailCB.class.getName(); }
    protected String xCQ() { return TTrsojtdetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
