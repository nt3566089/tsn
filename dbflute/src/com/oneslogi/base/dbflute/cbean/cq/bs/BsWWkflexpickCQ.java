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
 * The base condition-query of W_WKFLEXPICK.
 * @author DBFlute(AutoGenerator)
 */
public class BsWWkflexpickCQ extends AbstractBsWWkflexpickCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WWkflexpickCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWWkflexpickCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from W_WKFLEXPICK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WWkflexpickCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WWkflexpickCIQ xcreateCIQ() {
        WWkflexpickCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WWkflexpickCIQ xnewCIQ() {
        return new WWkflexpickCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join W_WKFLEXPICK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WWkflexpickCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WWkflexpickCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _zipInputId;
    public ConditionValue xdfgetZipInputId()
    { if (_zipInputId == null) { _zipInputId = nCV(); }
      return _zipInputId; }
    protected ConditionValue xgetCValueZipInputId() { return xdfgetZipInputId(); }

    /**
     * Add order-by as ascend. <br>
     * ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_ZipInputId_Asc() { regOBA("ZIP_INPUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_ZipInputId_Desc() { regOBD("ZIP_INPUT_ID"); return this; }

    protected ConditionValue _printkey;
    public ConditionValue xdfgetPrintkey()
    { if (_printkey == null) { _printkey = nCV(); }
      return _printkey; }
    protected ConditionValue xgetCValuePrintkey() { return xdfgetPrintkey(); }

    /**
     * Add order-by as ascend. <br>
     * PrintKey: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Printkey_Asc() { regOBA("PrintKey"); return this; }

    /**
     * Add order-by as descend. <br>
     * PrintKey: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Printkey_Desc() { regOBD("PrintKey"); return this; }

    protected ConditionValue _flexibityno;
    public ConditionValue xdfgetFlexibityno()
    { if (_flexibityno == null) { _flexibityno = nCV(); }
      return _flexibityno; }
    protected ConditionValue xgetCValueFlexibityno() { return xdfgetFlexibityno(); }

    /**
     * Add order-by as ascend. <br>
     * FlexibityNo: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Flexibityno_Asc() { regOBA("FlexibityNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * FlexibityNo: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Flexibityno_Desc() { regOBD("FlexibityNo"); return this; }

    protected ConditionValue _flexpicklistno;
    public ConditionValue xdfgetFlexpicklistno()
    { if (_flexpicklistno == null) { _flexpicklistno = nCV(); }
      return _flexpicklistno; }
    protected ConditionValue xgetCValueFlexpicklistno() { return xdfgetFlexpicklistno(); }

    /**
     * Add order-by as ascend. <br>
     * FlexPickListNo: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Flexpicklistno_Asc() { regOBA("FlexPickListNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * FlexPickListNo: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Flexpicklistno_Desc() { regOBD("FlexPickListNo"); return this; }

    protected ConditionValue _flexpicklistlno;
    public ConditionValue xdfgetFlexpicklistlno()
    { if (_flexpicklistlno == null) { _flexpicklistlno = nCV(); }
      return _flexpicklistlno; }
    protected ConditionValue xgetCValueFlexpicklistlno() { return xdfgetFlexpicklistlno(); }

    /**
     * Add order-by as ascend. <br>
     * FlexPickListLNo: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Flexpicklistlno_Asc() { regOBA("FlexPickListLNo"); return this; }

    /**
     * Add order-by as descend. <br>
     * FlexPickListLNo: {NotNull, decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Flexpicklistlno_Desc() { regOBD("FlexPickListLNo"); return this; }

    protected ConditionValue _warehousecd;
    public ConditionValue xdfgetWarehousecd()
    { if (_warehousecd == null) { _warehousecd = nCV(); }
      return _warehousecd; }
    protected ConditionValue xgetCValueWarehousecd() { return xdfgetWarehousecd(); }

    /**
     * Add order-by as ascend. <br>
     * WarehouseCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Warehousecd_Asc() { regOBA("WarehouseCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * WarehouseCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Warehousecd_Desc() { regOBD("WarehouseCd"); return this; }

    protected ConditionValue _warehousename;
    public ConditionValue xdfgetWarehousename()
    { if (_warehousename == null) { _warehousename = nCV(); }
      return _warehousename; }
    protected ConditionValue xgetCValueWarehousename() { return xdfgetWarehousename(); }

    /**
     * Add order-by as ascend. <br>
     * WarehouseName: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Warehousename_Asc() { regOBA("WarehouseName"); return this; }

    /**
     * Add order-by as descend. <br>
     * WarehouseName: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Warehousename_Desc() { regOBD("WarehouseName"); return this; }

    protected ConditionValue _shipcd;
    public ConditionValue xdfgetShipcd()
    { if (_shipcd == null) { _shipcd = nCV(); }
      return _shipcd; }
    protected ConditionValue xgetCValueShipcd() { return xdfgetShipcd(); }

    /**
     * Add order-by as ascend. <br>
     * ShipCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Shipcd_Asc() { regOBA("ShipCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * ShipCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Shipcd_Desc() { regOBD("ShipCd"); return this; }

    protected ConditionValue _shipName;
    public ConditionValue xdfgetShipName()
    { if (_shipName == null) { _shipName = nCV(); }
      return _shipName; }
    protected ConditionValue xgetCValueShipName() { return xdfgetShipName(); }

    /**
     * Add order-by as ascend. <br>
     * Ship_Name: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_ShipName_Asc() { regOBA("Ship_Name"); return this; }

    /**
     * Add order-by as descend. <br>
     * Ship_Name: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_ShipName_Desc() { regOBD("Ship_Name"); return this; }

    protected ConditionValue _schdate;
    public ConditionValue xdfgetSchdate()
    { if (_schdate == null) { _schdate = nCV(); }
      return _schdate; }
    protected ConditionValue xgetCValueSchdate() { return xdfgetSchdate(); }

    /**
     * Add order-by as ascend. <br>
     * SchDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Schdate_Asc() { regOBA("SchDate"); return this; }

    /**
     * Add order-by as descend. <br>
     * SchDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Schdate_Desc() { regOBD("SchDate"); return this; }

    protected ConditionValue _transportcd;
    public ConditionValue xdfgetTransportcd()
    { if (_transportcd == null) { _transportcd = nCV(); }
      return _transportcd; }
    protected ConditionValue xgetCValueTransportcd() { return xdfgetTransportcd(); }

    /**
     * Add order-by as ascend. <br>
     * TransportCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Transportcd_Asc() { regOBA("TransportCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * TransportCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Transportcd_Desc() { regOBD("TransportCd"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _itemName;
    public ConditionValue xdfgetItemName()
    { if (_itemName == null) { _itemName = nCV(); }
      return _itemName; }
    protected ConditionValue xgetCValueItemName() { return xdfgetItemName(); }

    /**
     * Add order-by as ascend. <br>
     * Item_Name: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_ItemName_Asc() { regOBA("Item_Name"); return this; }

    /**
     * Add order-by as descend. <br>
     * Item_Name: {varchar(100)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_ItemName_Desc() { regOBD("Item_Name"); return this; }

    protected ConditionValue _manufacturdate;
    public ConditionValue xdfgetManufacturdate()
    { if (_manufacturdate == null) { _manufacturdate = nCV(); }
      return _manufacturdate; }
    protected ConditionValue xgetCValueManufacturdate() { return xdfgetManufacturdate(); }

    /**
     * Add order-by as ascend. <br>
     * ManufacturDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Manufacturdate_Asc() { regOBA("ManufacturDate"); return this; }

    /**
     * Add order-by as descend. <br>
     * ManufacturDate: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Manufacturdate_Desc() { regOBD("ManufacturDate"); return this; }

    protected ConditionValue _designcd;
    public ConditionValue xdfgetDesigncd()
    { if (_designcd == null) { _designcd = nCV(); }
      return _designcd; }
    protected ConditionValue xgetCValueDesigncd() { return xdfgetDesigncd(); }

    /**
     * Add order-by as ascend. <br>
     * DesignCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Designcd_Asc() { regOBA("DesignCd"); return this; }

    /**
     * Add order-by as descend. <br>
     * DesignCd: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Designcd_Desc() { regOBD("DesignCd"); return this; }

    protected ConditionValue _qtycase;
    public ConditionValue xdfgetQtycase()
    { if (_qtycase == null) { _qtycase = nCV(); }
      return _qtycase; }
    protected ConditionValue xgetCValueQtycase() { return xdfgetQtycase(); }

    /**
     * Add order-by as ascend. <br>
     * QtyCase: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Qtycase_Asc() { regOBA("QtyCase"); return this; }

    /**
     * Add order-by as descend. <br>
     * QtyCase: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Qtycase_Desc() { regOBD("QtyCase"); return this; }

    protected ConditionValue _qtybowl;
    public ConditionValue xdfgetQtybowl()
    { if (_qtybowl == null) { _qtybowl = nCV(); }
      return _qtybowl; }
    protected ConditionValue xgetCValueQtybowl() { return xdfgetQtybowl(); }

    /**
     * Add order-by as ascend. <br>
     * QtyBowl: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Qtybowl_Asc() { regOBA("QtyBowl"); return this; }

    /**
     * Add order-by as descend. <br>
     * QtyBowl: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Qtybowl_Desc() { regOBD("QtyBowl"); return this; }

    protected ConditionValue _rootoutseq;
    public ConditionValue xdfgetRootoutseq()
    { if (_rootoutseq == null) { _rootoutseq = nCV(); }
      return _rootoutseq; }
    protected ConditionValue xgetCValueRootoutseq() { return xdfgetRootoutseq(); }

    /**
     * Add order-by as ascend. <br>
     * RootOutSeq: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Rootoutseq_Asc() { regOBA("RootOutSeq"); return this; }

    /**
     * Add order-by as descend. <br>
     * RootOutSeq: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Rootoutseq_Desc() { regOBD("RootOutSeq"); return this; }

    protected ConditionValue _usernum1;
    public ConditionValue xdfgetUsernum1()
    { if (_usernum1 == null) { _usernum1 = nCV(); }
      return _usernum1; }
    protected ConditionValue xgetCValueUsernum1() { return xdfgetUsernum1(); }

    /**
     * Add order-by as ascend. <br>
     * UserNum1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Usernum1_Asc() { regOBA("UserNum1"); return this; }

    /**
     * Add order-by as descend. <br>
     * UserNum1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Usernum1_Desc() { regOBD("UserNum1"); return this; }

    protected ConditionValue _usernum3;
    public ConditionValue xdfgetUsernum3()
    { if (_usernum3 == null) { _usernum3 = nCV(); }
      return _usernum3; }
    protected ConditionValue xgetCValueUsernum3() { return xdfgetUsernum3(); }

    /**
     * Add order-by as ascend. <br>
     * UserNum3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Usernum3_Asc() { regOBA("UserNum3"); return this; }

    /**
     * Add order-by as descend. <br>
     * UserNum3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_Usernum3_Desc() { regOBD("UserNum3"); return this; }

    protected ConditionValue _vaExtdata1;
    public ConditionValue xdfgetVaExtdata1()
    { if (_vaExtdata1 == null) { _vaExtdata1 = nCV(); }
      return _vaExtdata1; }
    protected ConditionValue xgetCValueVaExtdata1() { return xdfgetVaExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * VA_ExtData1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_VaExtdata1_Asc() { regOBA("VA_ExtData1"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_ExtData1: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_VaExtdata1_Desc() { regOBD("VA_ExtData1"); return this; }

    protected ConditionValue _vaExtdata2;
    public ConditionValue xdfgetVaExtdata2()
    { if (_vaExtdata2 == null) { _vaExtdata2 = nCV(); }
      return _vaExtdata2; }
    protected ConditionValue xgetCValueVaExtdata2() { return xdfgetVaExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * VA_ExtData2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_VaExtdata2_Asc() { regOBA("VA_ExtData2"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_ExtData2: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_VaExtdata2_Desc() { regOBD("VA_ExtData2"); return this; }

    protected ConditionValue _vaExtdata3;
    public ConditionValue xdfgetVaExtdata3()
    { if (_vaExtdata3 == null) { _vaExtdata3 = nCV(); }
      return _vaExtdata3; }
    protected ConditionValue xgetCValueVaExtdata3() { return xdfgetVaExtdata3(); }

    /**
     * Add order-by as ascend. <br>
     * VA_ExtData3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_VaExtdata3_Asc() { regOBA("VA_ExtData3"); return this; }

    /**
     * Add order-by as descend. <br>
     * VA_ExtData3: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_VaExtdata3_Desc() { regOBD("VA_ExtData3"); return this; }

    protected ConditionValue _nvExtdata1;
    public ConditionValue xdfgetNvExtdata1()
    { if (_nvExtdata1 == null) { _nvExtdata1 = nCV(); }
      return _nvExtdata1; }
    protected ConditionValue xgetCValueNvExtdata1() { return xdfgetNvExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * NV_ExtData1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_NvExtdata1_Asc() { regOBA("NV_ExtData1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_ExtData1: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_NvExtdata1_Desc() { regOBD("NV_ExtData1"); return this; }

    protected ConditionValue _nvExtdata2;
    public ConditionValue xdfgetNvExtdata2()
    { if (_nvExtdata2 == null) { _nvExtdata2 = nCV(); }
      return _nvExtdata2; }
    protected ConditionValue xgetCValueNvExtdata2() { return xdfgetNvExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * NV_ExtData2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_NvExtdata2_Asc() { regOBA("NV_ExtData2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_ExtData2: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_NvExtdata2_Desc() { regOBD("NV_ExtData2"); return this; }

    protected ConditionValue _nvExtdata3;
    public ConditionValue xdfgetNvExtdata3()
    { if (_nvExtdata3 == null) { _nvExtdata3 = nCV(); }
      return _nvExtdata3; }
    protected ConditionValue xgetCValueNvExtdata3() { return xdfgetNvExtdata3(); }

    /**
     * Add order-by as ascend. <br>
     * NV_ExtData3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_NvExtdata3_Asc() { regOBA("NV_ExtData3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NV_ExtData3: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_NvExtdata3_Desc() { regOBD("NV_ExtData3"); return this; }

    protected ConditionValue _nmExtdata1;
    public ConditionValue xdfgetNmExtdata1()
    { if (_nmExtdata1 == null) { _nmExtdata1 = nCV(); }
      return _nmExtdata1; }
    protected ConditionValue xgetCValueNmExtdata1() { return xdfgetNmExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * NM_ExtData1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_NmExtdata1_Asc() { regOBA("NM_ExtData1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_ExtData1: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_NmExtdata1_Desc() { regOBD("NM_ExtData1"); return this; }

    protected ConditionValue _nmExtdata2;
    public ConditionValue xdfgetNmExtdata2()
    { if (_nmExtdata2 == null) { _nmExtdata2 = nCV(); }
      return _nmExtdata2; }
    protected ConditionValue xgetCValueNmExtdata2() { return xdfgetNmExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * NM_ExtData2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_NmExtdata2_Asc() { regOBA("NM_ExtData2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_ExtData2: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_NmExtdata2_Desc() { regOBD("NM_ExtData2"); return this; }

    protected ConditionValue _nmExtdata3;
    public ConditionValue xdfgetNmExtdata3()
    { if (_nmExtdata3 == null) { _nmExtdata3 = nCV(); }
      return _nmExtdata3; }
    protected ConditionValue xgetCValueNmExtdata3() { return xdfgetNmExtdata3(); }

    /**
     * Add order-by as ascend. <br>
     * NM_ExtData3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_NmExtdata3_Asc() { regOBA("NM_ExtData3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NM_ExtData3: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_NmExtdata3_Desc() { regOBD("NM_ExtData3"); return this; }

    protected ConditionValue _dtExtdata1;
    public ConditionValue xdfgetDtExtdata1()
    { if (_dtExtdata1 == null) { _dtExtdata1 = nCV(); }
      return _dtExtdata1; }
    protected ConditionValue xgetCValueDtExtdata1() { return xdfgetDtExtdata1(); }

    /**
     * Add order-by as ascend. <br>
     * DT_ExtData1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_DtExtdata1_Asc() { regOBA("DT_ExtData1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_ExtData1: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_DtExtdata1_Desc() { regOBD("DT_ExtData1"); return this; }

    protected ConditionValue _dtExtdata2;
    public ConditionValue xdfgetDtExtdata2()
    { if (_dtExtdata2 == null) { _dtExtdata2 = nCV(); }
      return _dtExtdata2; }
    protected ConditionValue xgetCValueDtExtdata2() { return xdfgetDtExtdata2(); }

    /**
     * Add order-by as ascend. <br>
     * DT_ExtData2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_DtExtdata2_Asc() { regOBA("DT_ExtData2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_ExtData2: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_DtExtdata2_Desc() { regOBD("DT_ExtData2"); return this; }

    protected ConditionValue _dtExtdata3;
    public ConditionValue xdfgetDtExtdata3()
    { if (_dtExtdata3 == null) { _dtExtdata3 = nCV(); }
      return _dtExtdata3; }
    protected ConditionValue xgetCValueDtExtdata3() { return xdfgetDtExtdata3(); }

    /**
     * Add order-by as ascend. <br>
     * DT_ExtData3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_DtExtdata3_Asc() { regOBA("DT_ExtData3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DT_ExtData3: {varchar(8)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_DtExtdata3_Desc() { regOBD("DT_ExtData3"); return this; }

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
    public BsWWkflexpickCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWWkflexpickCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWWkflexpickCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWWkflexpickCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWWkflexpickCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWWkflexpickCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWWkflexpickCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWWkflexpickCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWWkflexpickCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsWWkflexpickCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWWkflexpickCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWWkflexpickCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WWkflexpickCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WWkflexpickCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WWkflexpickCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WWkflexpickCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WWkflexpickCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WWkflexpickCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WWkflexpickCQ> _myselfExistsMap;
    public Map<String, WWkflexpickCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WWkflexpickCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WWkflexpickCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WWkflexpickCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WWkflexpickCB.class.getName(); }
    protected String xCQ() { return WWkflexpickCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
