package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of SqlPLPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     WMS_SHIPPING_SLIP_NO, SHIPPING_SLIP_NO, CLIENT_CD, CLIENT_NM, CLIENT_ABBR, CENTER_CD, CENTER_NM, CENTER_ABBR, WAREHOUSE_CD, WAREHOUSE_NM, WAREHOUSE_ABBR, WORK_DT, DELIV_DT, PICKING_GROUP_NO, CARRIER_CD, CARRIER_NM, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, PICKING_WORK_NO, DELIV_UNIT_NO, SHIPPING_PACKING_NO, BOX_CD, BOX_NM, PACKING_CAL_CLS, PICKING_WORK_MESSAGE, PICKING_WORK_MESSAGE_COUNT, LOCATION_CD, LOCATION_NM, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, PL_OUT_FLG, JANCD, STORE_LABEL_NO, STORE_DT, LOT, LIMIT_DT, PICKING_NUM, TEMP_NO, SEEDING_NO, CART_NO, BUCKET_COL_NO, BUCKET_ROW_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String wmsShippingSlipNo = entity.getWmsShippingSlipNo();
 * Long shippingSlipNo = entity.getShippingSlipNo();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * String clientAbbr = entity.getClientAbbr();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String centerAbbr = entity.getCenterAbbr();
 * String warehouseCd = entity.getWarehouseCd();
 * String warehouseNm = entity.getWarehouseNm();
 * String warehouseAbbr = entity.getWarehouseAbbr();
 * String workDt = entity.getWorkDt();
 * String delivDt = entity.getDelivDt();
 * String pickingGroupNo = entity.getPickingGroupNo();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * String delivUnitNo = entity.getDelivUnitNo();
 * String shippingPackingNo = entity.getShippingPackingNo();
 * String boxCd = entity.getBoxCd();
 * String boxNm = entity.getBoxNm();
 * String packingCalCls = entity.getPackingCalCls();
 * String pickingWorkMessage = entity.getPickingWorkMessage();
 * Long pickingWorkMessageCount = entity.getPickingWorkMessageCount();
 * String locationCd = entity.getLocationCd();
 * String locationNm = entity.getLocationNm();
 * Long productId = entity.getProductId();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String plOutFlg = entity.getPlOutFlg();
 * String jancd = entity.getJancd();
 * String storeLabelNo = entity.getStoreLabelNo();
 * String storeDt = entity.getStoreDt();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * java.math.BigDecimal pickingNum = entity.getPickingNum();
 * String tempNo = entity.getTempNo();
 * String seedingNo = entity.getSeedingNo();
 * Long cartNo = entity.getCartNo();
 * Long bucketColNo = entity.getBucketColNo();
 * Long bucketRowNo = entity.getBucketRowNo();
 * entity.setWmsShippingSlipNo(wmsShippingSlipNo);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setClientAbbr(clientAbbr);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setWarehouseNm(warehouseNm);
 * entity.setWarehouseAbbr(warehouseAbbr);
 * entity.setWorkDt(workDt);
 * entity.setDelivDt(delivDt);
 * entity.setPickingGroupNo(pickingGroupNo);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setDelivUnitNo(delivUnitNo);
 * entity.setShippingPackingNo(shippingPackingNo);
 * entity.setBoxCd(boxCd);
 * entity.setBoxNm(boxNm);
 * entity.setPackingCalCls(packingCalCls);
 * entity.setPickingWorkMessage(pickingWorkMessage);
 * entity.setPickingWorkMessageCount(pickingWorkMessageCount);
 * entity.setLocationCd(locationCd);
 * entity.setLocationNm(locationNm);
 * entity.setProductId(productId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setPlOutFlg(plOutFlg);
 * entity.setJancd(jancd);
 * entity.setStoreLabelNo(storeLabelNo);
 * entity.setStoreDt(storeDt);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setPickingNum(pickingNum);
 * entity.setTempNo(tempNo);
 * entity.setSeedingNo(seedingNo);
 * entity.setCartNo(cartNo);
 * entity.setBucketColNo(bucketColNo);
 * entity.setBucketRowNo(bucketRowNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlPLPickingListPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WMS_SHIPPING_SLIP_NO: {varchar(30)} */
    protected String _wmsShippingSlipNo;

    /** SHIPPING_SLIP_NO: {int(10)} */
    protected Long _shippingSlipNo;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** CLIENT_ABBR: {varchar(60)} */
    protected String _clientAbbr;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** CENTER_ABBR: {varchar(60)} */
    protected String _centerAbbr;

    /** WAREHOUSE_CD: {varchar(30)} */
    protected String _warehouseCd;

    /** WAREHOUSE_NM: {varchar(60)} */
    protected String _warehouseNm;

    /** WAREHOUSE_ABBR: {varchar(60)} */
    protected String _warehouseAbbr;

    /** WORK_DT: {varchar(8)} */
    protected String _workDt;

    /** DELIV_DT: {varchar(8)} */
    protected String _delivDt;

    /** PICKING_GROUP_NO: {varchar(30)} */
    protected String _pickingGroupNo;

    /** CARRIER_CD: {varchar(30)} */
    protected String _carrierCd;

    /** CARRIER_NM: {varchar(60)} */
    protected String _carrierNm;

    /** DELIVERY_COURSE_CD: {varchar(30)} */
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {varchar(60)} */
    protected String _deliveryCourseNm;

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(60)} */
    protected String _supplyCustomerNm;

    /** PICKING_WORK_NO: {varchar(30)} */
    protected String _pickingWorkNo;

    /** DELIV_UNIT_NO: {varchar(30)} */
    protected String _delivUnitNo;

    /** SHIPPING_PACKING_NO: {varchar(30)} */
    protected String _shippingPackingNo;

    /** BOX_CD: {varchar(30)} */
    protected String _boxCd;

    /** BOX_NM: {varchar(60)} */
    protected String _boxNm;

    /** PACKING_CAL_CLS: {varchar(30), classification=PackingCalCls} */
    protected String _packingCalCls;

    /** PICKING_WORK_MESSAGE: {varchar(255)} */
    protected String _pickingWorkMessage;

    /** PICKING_WORK_MESSAGE_COUNT: {int(10)} */
    protected Long _pickingWorkMessageCount;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** LOCATION_NM: {varchar(60)} */
    protected String _locationNm;

    /** PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} */
    protected Long _productId;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(60)} */
    protected String _productNm;

    /** PL_OUT_FLG: {char(1), classification=ListOutFlg} */
    protected String _plOutFlg;

    /** JANCD: {varchar(30)} */
    protected String _jancd;

    /** STORE_LABEL_NO: {varchar(30)} */
    protected String _storeLabelNo;

    /** STORE_DT: {varchar(8)} */
    protected String _storeDt;

    /** LOT: {varchar(30)} */
    protected String _lot;

    /** LIMIT_DT: {varchar(8)} */
    protected String _limitDt;

    /** PICKING_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _pickingNum;

    /** TEMP_NO: {varchar(30)} */
    protected String _tempNo;

    /** SEEDING_NO: {varchar(30)} */
    protected String _seedingNo;

    /** CART_NO: {bigint(19)} */
    protected Long _cartNo;

    /** BUCKET_COL_NO: {bigint(19)} */
    protected Long _bucketColNo;

    /** BUCKET_ROW_NO: {bigint(19)} */
    protected Long _bucketRowNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlPLPickingListPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlPLPickingListPrint";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_productId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of packingCalCls as the classification of PackingCalCls. <br>
     * PACKING_CAL_CLS: {varchar(30), classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PackingCalCls getPackingCalClsAsPackingCalCls() {
        return CDef.PackingCalCls.codeOf(getPackingCalCls());
    }

    /**
     * Set the value of packingCalCls as the classification of PackingCalCls. <br>
     * PACKING_CAL_CLS: {varchar(30), classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPackingCalClsAsPackingCalCls(CDef.PackingCalCls cdef) {
        setPackingCalCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of plOutFlg as the classification of ListOutFlg. <br>
     * PL_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getPlOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getPlOutFlg());
    }

    /**
     * Set the value of plOutFlg as the classification of ListOutFlg. <br>
     * PL_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPlOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setPlOutFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of packingCalCls as $0 (0). <br>
     * $0: 梱包計算無
     */
    public void setPackingCalCls_$0() {
        setPackingCalClsAsPackingCalCls(CDef.PackingCalCls.$0);
    }

    /**
     * Set the value of packingCalCls as $1 (1). <br>
     * $1: 容積と重量による梱包計算
     */
    public void setPackingCalCls_$1() {
        setPackingCalClsAsPackingCalCls(CDef.PackingCalCls.$1);
    }

    /**
     * Set the value of plOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setPlOutFlg_$0() {
        setPlOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of plOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setPlOutFlg_$1() {
        setPlOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of packingCalCls $0? <br>
     * $0: 梱包計算無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingCalCls$0() {
        CDef.PackingCalCls cdef = getPackingCalClsAsPackingCalCls();
        return cdef != null ? cdef.equals(CDef.PackingCalCls.$0) : false;
    }

    /**
     * Is the value of packingCalCls $1? <br>
     * $1: 容積と重量による梱包計算
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingCalCls$1() {
        CDef.PackingCalCls cdef = getPackingCalClsAsPackingCalCls();
        return cdef != null ? cdef.equals(CDef.PackingCalCls.$1) : false;
    }

    /**
     * Is the value of plOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPlOutFlg$0() {
        CDef.ListOutFlg cdef = getPlOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of plOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPlOutFlg$1() {
        CDef.ListOutFlg cdef = getPlOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'packingCalCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPackingCalClsName() {
        CDef.PackingCalCls cdef = getPackingCalClsAsPackingCalCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'plOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPlOutFlgName() {
        CDef.ListOutFlg cdef = getPlOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected MProduct __innerDomain;

    protected MProduct innerDomain() {
        if (__innerDomain == null) {
            __innerDomain = new MProduct();
        }
        return __innerDomain;
    }

    /**
     * Prepare the inner instance of domain entity (basically for LoadReferrer).
     * <pre>
     * List&lt;UnpaidSummaryMember&gt; memberList = memberBhv.outsideSql()...;
     * List&lt;Member&gt; domainList = new ArrayList&lt;Member&gt;();
     * for (UnpaidSummaryMember member : memberList) {
     *     domainList.add(member.<span style="color: #CC4747">prepareDomain()</span>);
     * }
     * memberBhv.<span style="color: #CC4747">loadPurchaseList</span>(domainList, new ConditionBeanSetupper...);
     * for (UnpaidSummaryMember member : memberList) {
     *     Purchase purchase = member.<span style="color: #CC4747">getPurchaseList()</span>; <span style="color: #3F7E5E">// you can get it</span>
     *     ...
     * }
     * </pre>
     * @return The domain entity for this customize entity. (NotNull)
     */
    public MProduct prepareDomain() {
        innerDomain().setProductId(getProductId());
        return innerDomain();
    }

    /**
     * M_LOCATION by REPLENISH_PRODUCT_ID, named 'MLocationList'.
     * @return The entity list of referrer property 'MLocationList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MLocation> getMLocationList() {
        return innerDomain().getMLocationList();
    }

    /**
     * M_MFWHxITEM by PRODUCT_ID, named 'MMfwhxitemList'.
     * @return The entity list of referrer property 'MMfwhxitemList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MMfwhxitem> getMMfwhxitemList() {
        return innerDomain().getMMfwhxitemList();
    }

    /**
     * M_PRODUCT_SHAPE by PRODUCT_ID, named 'MProductShapeList'.
     * @return The entity list of referrer property 'MProductShapeList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MProductShape> getMProductShapeList() {
        return innerDomain().getMProductShapeList();
    }

    /**
     * M_SET_STRUCTURE by PRODUCT_ID, named 'MSetStructureList'.
     * @return The entity list of referrer property 'MSetStructureList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MSetStructure> getMSetStructureList() {
        return innerDomain().getMSetStructureList();
    }

    /**
     * T_ALLOC_INST_B by PRODUCT_ID, named 'TAllocInstBList'.
     * @return The entity list of referrer property 'TAllocInstBList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TAllocInstB> getTAllocInstBList() {
        return innerDomain().getTAllocInstBList();
    }

    /**
     * T_ALLOC_LOT by PRODUCT_ID, named 'TAllocLotList'.
     * @return The entity list of referrer property 'TAllocLotList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TAllocLot> getTAllocLotList() {
        return innerDomain().getTAllocLotList();
    }

    /**
     * T_INVENTORY_B by PRODUCT_ID, named 'TInventoryBList'.
     * @return The entity list of referrer property 'TInventoryBList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TInventoryB> getTInventoryBList() {
        return innerDomain().getTInventoryBList();
    }

    /**
     * T_KEEPING_LOT by PRODUCT_ID, named 'TKeepingLotList'.
     * @return The entity list of referrer property 'TKeepingLotList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TKeepingLot> getTKeepingLotList() {
        return innerDomain().getTKeepingLotList();
    }

    /**
     * T_LAST_LOT by PRODUCT_ID, named 'TLastLotList'.
     * @return The entity list of referrer property 'TLastLotList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TLastLot> getTLastLotList() {
        return innerDomain().getTLastLotList();
    }

    /**
     * T_LOT by PRODUCT_ID, named 'TLotList'.
     * @return The entity list of referrer property 'TLotList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TLot> getTLotList() {
        return innerDomain().getTLotList();
    }

    /**
     * T_MOVE_INST_B by PRODUCT_ID, named 'TMoveInstBList'.
     * @return The entity list of referrer property 'TMoveInstBList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TMoveInstB> getTMoveInstBList() {
        return innerDomain().getTMoveInstBList();
    }

    /**
     * T_RECEIVE_PLAN_B by PRODUCT_ID, named 'TReceivePlanBList'.
     * @return The entity list of referrer property 'TReceivePlanBList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TReceivePlanB> getTReceivePlanBList() {
        return innerDomain().getTReceivePlanBList();
    }

    /**
     * T_SERIAL_NO by PRODUCT_ID, named 'TSerialNoList'.
     * @return The entity list of referrer property 'TSerialNoList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TSerialNo> getTSerialNoList() {
        return innerDomain().getTSerialNoList();
    }

    /**
     * T_SHIPPING_INST_B by PRODUCT_ID, named 'TShippingInstBList'.
     * @return The entity list of referrer property 'TShippingInstBList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TShippingInstB> getTShippingInstBList() {
        return innerDomain().getTShippingInstBList();
    }

    /**
     * T_STOCK by PRODUCT_ID, named 'TStockList'.
     * @return The entity list of referrer property 'TStockList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TStock> getTStockList() {
        return innerDomain().getTStockList();
    }

    /**
     * T_TRINVCHECKINFO by PRODUCT_ID, named 'TTrinvcheckinfoList'.
     * @return The entity list of referrer property 'TTrinvcheckinfoList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TTrinvcheckinfo> getTTrinvcheckinfoList() {
        return innerDomain().getTTrinvcheckinfoList();
    }

    /**
     * T_YTRSODETAIL by PRODUCT_ID, named 'TYtrsodetailList'.
     * @return The entity list of referrer property 'TYtrsodetailList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<TYtrsodetail> getTYtrsodetailList() {
        return innerDomain().getTYtrsodetailList();
    }

    /**
     * W_HT_INVENTORY_INPUT_PROD by PRODUCT_ID, named 'WHtInventoryInputProdList'.
     * @return The entity list of referrer property 'WHtInventoryInputProdList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtInventoryInputProd> getWHtInventoryInputProdList() {
        return innerDomain().getWHtInventoryInputProdList();
    }

    /**
     * W_HT_RECEIVE_INSPECTION by PRODUCT_ID, named 'WHtReceiveInspectionList'.
     * @return The entity list of referrer property 'WHtReceiveInspectionList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtReceiveInspection> getWHtReceiveInspectionList() {
        return innerDomain().getWHtReceiveInspectionList();
    }

    /**
     * W_HT_RECEIVE_NO_PLAN_INSP by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The entity list of referrer property 'WHtReceiveNoPlanInspList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtReceiveNoPlanInsp> getWHtReceiveNoPlanInspList() {
        return innerDomain().getWHtReceiveNoPlanInspList();
    }

    /**
     * W_HT_RECEIVE_STORE by PRODUCT_ID, named 'WHtReceiveStoreList'.
     * @return The entity list of referrer property 'WHtReceiveStoreList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtReceiveStore> getWHtReceiveStoreList() {
        return innerDomain().getWHtReceiveStoreList();
    }

    /**
     * W_HT_SHIPPING by PRODUCT_ID, named 'WHtShippingList'.
     * @return The entity list of referrer property 'WHtShippingList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtShipping> getWHtShippingList() {
        return innerDomain().getWHtShippingList();
    }

    /**
     * W_HT_SHIPPING_PICKING by PRODUCT_ID, named 'WHtShippingPickingList'.
     * @return The entity list of referrer property 'WHtShippingPickingList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WHtShippingPicking> getWHtShippingPickingList() {
        return innerDomain().getWHtShippingPickingList();
    }

    /**
     * W_SGL_ROW_SHIP_INSP_H by PRODUCT_ID, named 'WSglRowShipInspHList'.
     * @return The entity list of referrer property 'WSglRowShipInspHList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WSglRowShipInspH> getWSglRowShipInspHList() {
        return innerDomain().getWSglRowShipInspHList();
    }

    /**
     * W_SHIPPING_INTERRUPT by PRODUCT_ID, named 'WShippingInterruptList'.
     * @return The entity list of referrer property 'WShippingInterruptList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<WShippingInterrupt> getWShippingInterruptList() {
        return innerDomain().getWShippingInterruptList();
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlPLPickingListPrint) {
            BsSqlPLPickingListPrint other = (BsSqlPLPickingListPrint)obj;
            if (!xSV(_productId, other._productId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_wmsShippingSlipNo));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_clientAbbr));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_warehouseNm));
        sb.append(dm).append(xfND(_warehouseAbbr));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_pickingGroupNo));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_delivUnitNo));
        sb.append(dm).append(xfND(_shippingPackingNo));
        sb.append(dm).append(xfND(_boxCd));
        sb.append(dm).append(xfND(_boxNm));
        sb.append(dm).append(xfND(_packingCalCls));
        sb.append(dm).append(xfND(_pickingWorkMessage));
        sb.append(dm).append(xfND(_pickingWorkMessageCount));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_locationNm));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_plOutFlg));
        sb.append(dm).append(xfND(_jancd));
        sb.append(dm).append(xfND(_storeLabelNo));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_pickingNum));
        sb.append(dm).append(xfND(_tempNo));
        sb.append(dm).append(xfND(_seedingNo));
        sb.append(dm).append(xfND(_cartNo));
        sb.append(dm).append(xfND(_bucketColNo));
        sb.append(dm).append(xfND(_bucketRowNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlPLPickingListPrint clone() {
        return (SqlPLPickingListPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WMS_SHIPPING_SLIP_NO: {varchar(30)} <br>
     * @return The value of the column 'WMS_SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsShippingSlipNo() {
        checkSpecifiedProperty("wmsShippingSlipNo");
        return convertEmptyToNull(_wmsShippingSlipNo);
    }

    /**
     * [set] WMS_SHIPPING_SLIP_NO: {varchar(30)} <br>
     * @param wmsShippingSlipNo The value of the column 'WMS_SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsShippingSlipNo(String wmsShippingSlipNo) {
        registerModifiedProperty("wmsShippingSlipNo");
        _wmsShippingSlipNo = wmsShippingSlipNo;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {int(10)} <br>
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingSlipNo() {
        checkSpecifiedProperty("shippingSlipNo");
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {int(10)} <br>
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipNo(Long shippingSlipNo) {
        registerModifiedProperty("shippingSlipNo");
        _shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }

    /**
     * [get] CLIENT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientAbbr() {
        checkSpecifiedProperty("clientAbbr");
        return convertEmptyToNull(_clientAbbr);
    }

    /**
     * [set] CLIENT_ABBR: {varchar(60)} <br>
     * @param clientAbbr The value of the column 'CLIENT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientAbbr(String clientAbbr) {
        registerModifiedProperty("clientAbbr");
        _clientAbbr = clientAbbr;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] CENTER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CENTER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterAbbr() {
        checkSpecifiedProperty("centerAbbr");
        return convertEmptyToNull(_centerAbbr);
    }

    /**
     * [set] CENTER_ABBR: {varchar(60)} <br>
     * @param centerAbbr The value of the column 'CENTER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterAbbr(String centerAbbr) {
        registerModifiedProperty("centerAbbr");
        _centerAbbr = centerAbbr;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(30)} <br>
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] WAREHOUSE_NM: {varchar(60)} <br>
     * @return The value of the column 'WAREHOUSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseNm() {
        checkSpecifiedProperty("warehouseNm");
        return convertEmptyToNull(_warehouseNm);
    }

    /**
     * [set] WAREHOUSE_NM: {varchar(60)} <br>
     * @param warehouseNm The value of the column 'WAREHOUSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseNm(String warehouseNm) {
        registerModifiedProperty("warehouseNm");
        _warehouseNm = warehouseNm;
    }

    /**
     * [get] WAREHOUSE_ABBR: {varchar(60)} <br>
     * @return The value of the column 'WAREHOUSE_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseAbbr() {
        checkSpecifiedProperty("warehouseAbbr");
        return convertEmptyToNull(_warehouseAbbr);
    }

    /**
     * [set] WAREHOUSE_ABBR: {varchar(60)} <br>
     * @param warehouseAbbr The value of the column 'WAREHOUSE_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseAbbr(String warehouseAbbr) {
        registerModifiedProperty("warehouseAbbr");
        _warehouseAbbr = warehouseAbbr;
    }

    /**
     * [get] WORK_DT: {varchar(8)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {varchar(8)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] DELIV_DT: {varchar(8)} <br>
     * @return The value of the column 'DELIV_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivDt() {
        checkSpecifiedProperty("delivDt");
        return convertEmptyToNull(_delivDt);
    }

    /**
     * [set] DELIV_DT: {varchar(8)} <br>
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivDt(String delivDt) {
        registerModifiedProperty("delivDt");
        _delivDt = delivDt;
    }

    /**
     * [get] PICKING_GROUP_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_GROUP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingGroupNo() {
        checkSpecifiedProperty("pickingGroupNo");
        return convertEmptyToNull(_pickingGroupNo);
    }

    /**
     * [set] PICKING_GROUP_NO: {varchar(30)} <br>
     * @param pickingGroupNo The value of the column 'PICKING_GROUP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingGroupNo(String pickingGroupNo) {
        registerModifiedProperty("pickingGroupNo");
        _pickingGroupNo = pickingGroupNo;
    }

    /**
     * [get] CARRIER_CD: {varchar(30)} <br>
     * @return The value of the column 'CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {varchar(30)} <br>
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {varchar(60)} <br>
     * @return The value of the column 'CARRIER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierNm() {
        checkSpecifiedProperty("carrierNm");
        return convertEmptyToNull(_carrierNm);
    }

    /**
     * [set] CARRIER_NM: {varchar(60)} <br>
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierNm(String carrierNm) {
        registerModifiedProperty("carrierNm");
        _carrierNm = carrierNm;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseNm() {
        checkSpecifiedProperty("deliveryCourseNm");
        return convertEmptyToNull(_deliveryCourseNm);
    }

    /**
     * [set] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        registerModifiedProperty("deliveryCourseNm");
        _deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        checkSpecifiedProperty("supplyCustomerCd");
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        registerModifiedProperty("supplyCustomerCd");
        _supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] PICKING_WORK_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo() {
        checkSpecifiedProperty("pickingWorkNo");
        return convertEmptyToNull(_pickingWorkNo);
    }

    /**
     * [set] PICKING_WORK_NO: {varchar(30)} <br>
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        registerModifiedProperty("pickingWorkNo");
        _pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] DELIV_UNIT_NO: {varchar(30)} <br>
     * @return The value of the column 'DELIV_UNIT_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivUnitNo() {
        checkSpecifiedProperty("delivUnitNo");
        return convertEmptyToNull(_delivUnitNo);
    }

    /**
     * [set] DELIV_UNIT_NO: {varchar(30)} <br>
     * @param delivUnitNo The value of the column 'DELIV_UNIT_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivUnitNo(String delivUnitNo) {
        registerModifiedProperty("delivUnitNo");
        _delivUnitNo = delivUnitNo;
    }

    /**
     * [get] SHIPPING_PACKING_NO: {varchar(30)} <br>
     * @return The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingPackingNo() {
        checkSpecifiedProperty("shippingPackingNo");
        return convertEmptyToNull(_shippingPackingNo);
    }

    /**
     * [set] SHIPPING_PACKING_NO: {varchar(30)} <br>
     * @param shippingPackingNo The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPackingNo(String shippingPackingNo) {
        registerModifiedProperty("shippingPackingNo");
        _shippingPackingNo = shippingPackingNo;
    }

    /**
     * [get] BOX_CD: {varchar(30)} <br>
     * @return The value of the column 'BOX_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxCd() {
        checkSpecifiedProperty("boxCd");
        return convertEmptyToNull(_boxCd);
    }

    /**
     * [set] BOX_CD: {varchar(30)} <br>
     * @param boxCd The value of the column 'BOX_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxCd(String boxCd) {
        registerModifiedProperty("boxCd");
        _boxCd = boxCd;
    }

    /**
     * [get] BOX_NM: {varchar(60)} <br>
     * @return The value of the column 'BOX_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxNm() {
        checkSpecifiedProperty("boxNm");
        return convertEmptyToNull(_boxNm);
    }

    /**
     * [set] BOX_NM: {varchar(60)} <br>
     * @param boxNm The value of the column 'BOX_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxNm(String boxNm) {
        registerModifiedProperty("boxNm");
        _boxNm = boxNm;
    }

    /**
     * [get] PACKING_CAL_CLS: {varchar(30), classification=PackingCalCls} <br>
     * // cls(PackingCalCls)
     * @return The value of the column 'PACKING_CAL_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingCalCls() {
        checkSpecifiedProperty("packingCalCls");
        return convertEmptyToNull(_packingCalCls);
    }

    /**
     * [set] PACKING_CAL_CLS: {varchar(30), classification=PackingCalCls} <br>
     * // cls(PackingCalCls)
     * @param packingCalCls The value of the column 'PACKING_CAL_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingCalCls(String packingCalCls) {
        registerModifiedProperty("packingCalCls");
        _packingCalCls = packingCalCls;
    }

    /**
     * [get] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * @return The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkMessage() {
        checkSpecifiedProperty("pickingWorkMessage");
        return convertEmptyToNull(_pickingWorkMessage);
    }

    /**
     * [set] PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * @param pickingWorkMessage The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        registerModifiedProperty("pickingWorkMessage");
        _pickingWorkMessage = pickingWorkMessage;
    }

    /**
     * [get] PICKING_WORK_MESSAGE_COUNT: {int(10)} <br>
     * @return The value of the column 'PICKING_WORK_MESSAGE_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingWorkMessageCount() {
        checkSpecifiedProperty("pickingWorkMessageCount");
        return _pickingWorkMessageCount;
    }

    /**
     * [set] PICKING_WORK_MESSAGE_COUNT: {int(10)} <br>
     * @param pickingWorkMessageCount The value of the column 'PICKING_WORK_MESSAGE_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkMessageCount(Long pickingWorkMessageCount) {
        registerModifiedProperty("pickingWorkMessageCount");
        _pickingWorkMessageCount = pickingWorkMessageCount;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {varchar(60)} <br>
     * @return The value of the column 'LOCATION_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationNm() {
        checkSpecifiedProperty("locationNm");
        return convertEmptyToNull(_locationNm);
    }

    /**
     * [set] LOCATION_NM: {varchar(60)} <br>
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationNm(String locationNm) {
        registerModifiedProperty("locationNm");
        _locationNm = locationNm;
    }

    /**
     * [get] PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(60)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] PL_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * // cls(ListOutFlg)
     * @return The value of the column 'PL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlOutFlg() {
        checkSpecifiedProperty("plOutFlg");
        return convertEmptyToNull(_plOutFlg);
    }

    /**
     * [set] PL_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * // cls(ListOutFlg)
     * @param plOutFlg The value of the column 'PL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlOutFlg(String plOutFlg) {
        registerModifiedProperty("plOutFlg");
        _plOutFlg = plOutFlg;
    }

    /**
     * [get] JANCD: {varchar(30)} <br>
     * @return The value of the column 'JANCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJancd() {
        checkSpecifiedProperty("jancd");
        return convertEmptyToNull(_jancd);
    }

    /**
     * [set] JANCD: {varchar(30)} <br>
     * @param jancd The value of the column 'JANCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJancd(String jancd) {
        registerModifiedProperty("jancd");
        _jancd = jancd;
    }

    /**
     * [get] STORE_LABEL_NO: {varchar(30)} <br>
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreLabelNo() {
        checkSpecifiedProperty("storeLabelNo");
        return convertEmptyToNull(_storeLabelNo);
    }

    /**
     * [set] STORE_LABEL_NO: {varchar(30)} <br>
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        registerModifiedProperty("storeLabelNo");
        _storeLabelNo = storeLabelNo;
    }

    /**
     * [get] STORE_DT: {varchar(8)} <br>
     * @return The value of the column 'STORE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreDt() {
        checkSpecifiedProperty("storeDt");
        return convertEmptyToNull(_storeDt);
    }

    /**
     * [set] STORE_DT: {varchar(8)} <br>
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreDt(String storeDt) {
        registerModifiedProperty("storeDt");
        _storeDt = storeDt;
    }

    /**
     * [get] LOT: {varchar(30)} <br>
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {varchar(30)} <br>
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMIT_DT: {varchar(8)} <br>
     * @return The value of the column 'LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] LIMIT_DT: {varchar(8)} <br>
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] PICKING_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'PICKING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickingNum() {
        checkSpecifiedProperty("pickingNum");
        return _pickingNum;
    }

    /**
     * [set] PICKING_NUM: {decimal(38, 6)} <br>
     * @param pickingNum The value of the column 'PICKING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingNum(java.math.BigDecimal pickingNum) {
        registerModifiedProperty("pickingNum");
        _pickingNum = pickingNum;
    }

    /**
     * [get] TEMP_NO: {varchar(30)} <br>
     * @return The value of the column 'TEMP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTempNo() {
        checkSpecifiedProperty("tempNo");
        return convertEmptyToNull(_tempNo);
    }

    /**
     * [set] TEMP_NO: {varchar(30)} <br>
     * @param tempNo The value of the column 'TEMP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTempNo(String tempNo) {
        registerModifiedProperty("tempNo");
        _tempNo = tempNo;
    }

    /**
     * [get] SEEDING_NO: {varchar(30)} <br>
     * @return The value of the column 'SEEDING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSeedingNo() {
        checkSpecifiedProperty("seedingNo");
        return convertEmptyToNull(_seedingNo);
    }

    /**
     * [set] SEEDING_NO: {varchar(30)} <br>
     * @param seedingNo The value of the column 'SEEDING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSeedingNo(String seedingNo) {
        registerModifiedProperty("seedingNo");
        _seedingNo = seedingNo;
    }

    /**
     * [get] CART_NO: {bigint(19)} <br>
     * @return The value of the column 'CART_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCartNo() {
        checkSpecifiedProperty("cartNo");
        return _cartNo;
    }

    /**
     * [set] CART_NO: {bigint(19)} <br>
     * @param cartNo The value of the column 'CART_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCartNo(Long cartNo) {
        registerModifiedProperty("cartNo");
        _cartNo = cartNo;
    }

    /**
     * [get] BUCKET_COL_NO: {bigint(19)} <br>
     * @return The value of the column 'BUCKET_COL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBucketColNo() {
        checkSpecifiedProperty("bucketColNo");
        return _bucketColNo;
    }

    /**
     * [set] BUCKET_COL_NO: {bigint(19)} <br>
     * @param bucketColNo The value of the column 'BUCKET_COL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBucketColNo(Long bucketColNo) {
        registerModifiedProperty("bucketColNo");
        _bucketColNo = bucketColNo;
    }

    /**
     * [get] BUCKET_ROW_NO: {bigint(19)} <br>
     * @return The value of the column 'BUCKET_ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBucketRowNo() {
        checkSpecifiedProperty("bucketRowNo");
        return _bucketRowNo;
    }

    /**
     * [set] BUCKET_ROW_NO: {bigint(19)} <br>
     * @param bucketRowNo The value of the column 'BUCKET_ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBucketRowNo(Long bucketRowNo) {
        registerModifiedProperty("bucketRowNo");
        _bucketRowNo = bucketRowNo;
    }
}
