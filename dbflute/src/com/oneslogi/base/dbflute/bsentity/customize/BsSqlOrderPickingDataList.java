package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of SqlOrderPickingDataList. <br>
 * <pre>
 * [primary-key]
 *     product_id
 *
 * [column]
 *     center_id, shipping_packing_no, stock_id, box_cd, box_nm, product_cd, product_nm, jan_cd, location_cd, location_nm, picking_num, picking_work_no, client_cd, client_nm, center_cd, center_nm, warehouse_cd, warehouse_abbr, work_dt, deliv_dt, delivery_course_cd, delivery_course_nm, carrier_cd, carrier_nm, supply_customer_cd, supply_customer_nm, picking_batch_no, client_shipping_no, wms_shipping_slip_no, picking_work_message, zone_picking_order, zone_cd, zone_nm, location_picking_order, limit_dt, lot, store_label_no, store_dt, client_id, stock_type_cd, stock_type_nm, charge_num, product_id
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
 * Long centerId = entity.getCenterId();
 * String shippingPackingNo = entity.getShippingPackingNo();
 * Long stockId = entity.getStockId();
 * String boxCd = entity.getBoxCd();
 * String boxNm = entity.getBoxNm();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String janCd = entity.getJanCd();
 * String locationCd = entity.getLocationCd();
 * String locationNm = entity.getLocationNm();
 * java.math.BigDecimal pickingNum = entity.getPickingNum();
 * String pickingWorkNo = entity.getPickingWorkNo();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String warehouseCd = entity.getWarehouseCd();
 * String warehouseAbbr = entity.getWarehouseAbbr();
 * String workDt = entity.getWorkDt();
 * String delivDt = entity.getDelivDt();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String pickingBatchNo = entity.getPickingBatchNo();
 * String clientShippingNo = entity.getClientShippingNo();
 * String wmsShippingSlipNo = entity.getWmsShippingSlipNo();
 * String pickingWorkMessage = entity.getPickingWorkMessage();
 * Long zonePickingOrder = entity.getZonePickingOrder();
 * String zoneCd = entity.getZoneCd();
 * String zoneNm = entity.getZoneNm();
 * Long locationPickingOrder = entity.getLocationPickingOrder();
 * String limitDt = entity.getLimitDt();
 * String lot = entity.getLot();
 * String storeLabelNo = entity.getStoreLabelNo();
 * String storeDt = entity.getStoreDt();
 * Long clientId = entity.getClientId();
 * String stockTypeCd = entity.getStockTypeCd();
 * String stockTypeNm = entity.getStockTypeNm();
 * java.math.BigDecimal chargeNum = entity.getChargeNum();
 * Long productId = entity.getProductId();
 * entity.setCenterId(centerId);
 * entity.setShippingPackingNo(shippingPackingNo);
 * entity.setStockId(stockId);
 * entity.setBoxCd(boxCd);
 * entity.setBoxNm(boxNm);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setJanCd(janCd);
 * entity.setLocationCd(locationCd);
 * entity.setLocationNm(locationNm);
 * entity.setPickingNum(pickingNum);
 * entity.setPickingWorkNo(pickingWorkNo);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setWarehouseAbbr(warehouseAbbr);
 * entity.setWorkDt(workDt);
 * entity.setDelivDt(delivDt);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setPickingBatchNo(pickingBatchNo);
 * entity.setClientShippingNo(clientShippingNo);
 * entity.setWmsShippingSlipNo(wmsShippingSlipNo);
 * entity.setPickingWorkMessage(pickingWorkMessage);
 * entity.setZonePickingOrder(zonePickingOrder);
 * entity.setZoneCd(zoneCd);
 * entity.setZoneNm(zoneNm);
 * entity.setLocationPickingOrder(locationPickingOrder);
 * entity.setLimitDt(limitDt);
 * entity.setLot(lot);
 * entity.setStoreLabelNo(storeLabelNo);
 * entity.setStoreDt(storeDt);
 * entity.setClientId(clientId);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setStockTypeNm(stockTypeNm);
 * entity.setChargeNum(chargeNum);
 * entity.setProductId(productId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlOrderPickingDataList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** center_id: {bigint(19)} */
    protected Long _centerId;

    /** shipping_packing_no: {varchar(30)} */
    protected String _shippingPackingNo;

    /** stock_id: {bigint(19)} */
    protected Long _stockId;

    /** box_cd: {varchar(30)} */
    protected String _boxCd;

    /** box_nm: {varchar(60)} */
    protected String _boxNm;

    /** product_cd: {varchar(100)} */
    protected String _productCd;

    /** product_nm: {varchar(60)} */
    protected String _productNm;

    /** jan_cd: {varchar(30)} */
    protected String _janCd;

    /** location_cd: {varchar(30)} */
    protected String _locationCd;

    /** location_nm: {varchar(60)} */
    protected String _locationNm;

    /** picking_num: {decimal(38, 6)} */
    protected java.math.BigDecimal _pickingNum;

    /** picking_work_no: {varchar(30)} */
    protected String _pickingWorkNo;

    /** client_cd: {varchar(30)} */
    protected String _clientCd;

    /** client_nm: {varchar(60)} */
    protected String _clientNm;

    /** center_cd: {varchar(30)} */
    protected String _centerCd;

    /** center_nm: {varchar(60)} */
    protected String _centerNm;

    /** warehouse_cd: {varchar(30)} */
    protected String _warehouseCd;

    /** warehouse_abbr: {varchar(60)} */
    protected String _warehouseAbbr;

    /** work_dt: {varchar(8)} */
    protected String _workDt;

    /** deliv_dt: {varchar(8)} */
    protected String _delivDt;

    /** delivery_course_cd: {varchar(30)} */
    protected String _deliveryCourseCd;

    /** delivery_course_nm: {varchar(60)} */
    protected String _deliveryCourseNm;

    /** carrier_cd: {varchar(30)} */
    protected String _carrierCd;

    /** carrier_nm: {varchar(60)} */
    protected String _carrierNm;

    /** supply_customer_cd: {varchar(30)} */
    protected String _supplyCustomerCd;

    /** supply_customer_nm: {varchar(60)} */
    protected String _supplyCustomerNm;

    /** picking_batch_no: {varchar(30)} */
    protected String _pickingBatchNo;

    /** client_shipping_no: {varchar(30)} */
    protected String _clientShippingNo;

    /** wms_shipping_slip_no: {varchar(30)} */
    protected String _wmsShippingSlipNo;

    /** picking_work_message: {varchar(255)} */
    protected String _pickingWorkMessage;

    /** zone_picking_order: {bigint(19)} */
    protected Long _zonePickingOrder;

    /** zone_cd: {varchar(30)} */
    protected String _zoneCd;

    /** zone_nm: {varchar(60)} */
    protected String _zoneNm;

    /** location_picking_order: {bigint(19)} */
    protected Long _locationPickingOrder;

    /** limit_dt: {varchar(8)} */
    protected String _limitDt;

    /** lot: {varchar(30)} */
    protected String _lot;

    /** store_label_no: {varchar(30)} */
    protected String _storeLabelNo;

    /** store_dt: {varchar(8)} */
    protected String _storeDt;

    /** client_id: {bigint(19)} */
    protected Long _clientId;

    /** stock_type_cd: {varchar(30)} */
    protected String _stockTypeCd;

    /** stock_type_nm: {varchar(100)} */
    protected String _stockTypeNm;

    /** charge_num: {decimal(16, 6)} */
    protected java.math.BigDecimal _chargeNum;

    /** product_id: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} */
    protected Long _productId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlOrderPickingDataListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlOrderPickingDataList";
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
        if (obj instanceof BsSqlOrderPickingDataList) {
            BsSqlOrderPickingDataList other = (BsSqlOrderPickingDataList)obj;
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
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_shippingPackingNo));
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_boxCd));
        sb.append(dm).append(xfND(_boxNm));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_locationNm));
        sb.append(dm).append(xfND(_pickingNum));
        sb.append(dm).append(xfND(_pickingWorkNo));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_warehouseAbbr));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_pickingBatchNo));
        sb.append(dm).append(xfND(_clientShippingNo));
        sb.append(dm).append(xfND(_wmsShippingSlipNo));
        sb.append(dm).append(xfND(_pickingWorkMessage));
        sb.append(dm).append(xfND(_zonePickingOrder));
        sb.append(dm).append(xfND(_zoneCd));
        sb.append(dm).append(xfND(_zoneNm));
        sb.append(dm).append(xfND(_locationPickingOrder));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_storeLabelNo));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_stockTypeNm));
        sb.append(dm).append(xfND(_chargeNum));
        sb.append(dm).append(xfND(_productId));
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
    public SqlOrderPickingDataList clone() {
        return (SqlOrderPickingDataList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] center_id: {bigint(19)} <br>
     * @return The value of the column 'center_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] center_id: {bigint(19)} <br>
     * @param centerId The value of the column 'center_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] shipping_packing_no: {varchar(30)} <br>
     * @return The value of the column 'shipping_packing_no'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingPackingNo() {
        checkSpecifiedProperty("shippingPackingNo");
        return convertEmptyToNull(_shippingPackingNo);
    }

    /**
     * [set] shipping_packing_no: {varchar(30)} <br>
     * @param shippingPackingNo The value of the column 'shipping_packing_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPackingNo(String shippingPackingNo) {
        registerModifiedProperty("shippingPackingNo");
        _shippingPackingNo = shippingPackingNo;
    }

    /**
     * [get] stock_id: {bigint(19)} <br>
     * @return The value of the column 'stock_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockId() {
        checkSpecifiedProperty("stockId");
        return _stockId;
    }

    /**
     * [set] stock_id: {bigint(19)} <br>
     * @param stockId The value of the column 'stock_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockId(Long stockId) {
        registerModifiedProperty("stockId");
        _stockId = stockId;
    }

    /**
     * [get] box_cd: {varchar(30)} <br>
     * @return The value of the column 'box_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxCd() {
        checkSpecifiedProperty("boxCd");
        return convertEmptyToNull(_boxCd);
    }

    /**
     * [set] box_cd: {varchar(30)} <br>
     * @param boxCd The value of the column 'box_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxCd(String boxCd) {
        registerModifiedProperty("boxCd");
        _boxCd = boxCd;
    }

    /**
     * [get] box_nm: {varchar(60)} <br>
     * @return The value of the column 'box_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxNm() {
        checkSpecifiedProperty("boxNm");
        return convertEmptyToNull(_boxNm);
    }

    /**
     * [set] box_nm: {varchar(60)} <br>
     * @param boxNm The value of the column 'box_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxNm(String boxNm) {
        registerModifiedProperty("boxNm");
        _boxNm = boxNm;
    }

    /**
     * [get] product_cd: {varchar(100)} <br>
     * @return The value of the column 'product_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] product_cd: {varchar(100)} <br>
     * @param productCd The value of the column 'product_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] product_nm: {varchar(60)} <br>
     * @return The value of the column 'product_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] product_nm: {varchar(60)} <br>
     * @param productNm The value of the column 'product_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] jan_cd: {varchar(30)} <br>
     * @return The value of the column 'jan_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] jan_cd: {varchar(30)} <br>
     * @param janCd The value of the column 'jan_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] location_cd: {varchar(30)} <br>
     * @return The value of the column 'location_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] location_cd: {varchar(30)} <br>
     * @param locationCd The value of the column 'location_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] location_nm: {varchar(60)} <br>
     * @return The value of the column 'location_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationNm() {
        checkSpecifiedProperty("locationNm");
        return convertEmptyToNull(_locationNm);
    }

    /**
     * [set] location_nm: {varchar(60)} <br>
     * @param locationNm The value of the column 'location_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationNm(String locationNm) {
        registerModifiedProperty("locationNm");
        _locationNm = locationNm;
    }

    /**
     * [get] picking_num: {decimal(38, 6)} <br>
     * @return The value of the column 'picking_num'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickingNum() {
        checkSpecifiedProperty("pickingNum");
        return _pickingNum;
    }

    /**
     * [set] picking_num: {decimal(38, 6)} <br>
     * @param pickingNum The value of the column 'picking_num'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingNum(java.math.BigDecimal pickingNum) {
        registerModifiedProperty("pickingNum");
        _pickingNum = pickingNum;
    }

    /**
     * [get] picking_work_no: {varchar(30)} <br>
     * @return The value of the column 'picking_work_no'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo() {
        checkSpecifiedProperty("pickingWorkNo");
        return convertEmptyToNull(_pickingWorkNo);
    }

    /**
     * [set] picking_work_no: {varchar(30)} <br>
     * @param pickingWorkNo The value of the column 'picking_work_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        registerModifiedProperty("pickingWorkNo");
        _pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] client_cd: {varchar(30)} <br>
     * @return The value of the column 'client_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] client_cd: {varchar(30)} <br>
     * @param clientCd The value of the column 'client_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] client_nm: {varchar(60)} <br>
     * @return The value of the column 'client_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] client_nm: {varchar(60)} <br>
     * @param clientNm The value of the column 'client_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }

    /**
     * [get] center_cd: {varchar(30)} <br>
     * @return The value of the column 'center_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] center_cd: {varchar(30)} <br>
     * @param centerCd The value of the column 'center_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] center_nm: {varchar(60)} <br>
     * @return The value of the column 'center_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] center_nm: {varchar(60)} <br>
     * @param centerNm The value of the column 'center_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] warehouse_cd: {varchar(30)} <br>
     * @return The value of the column 'warehouse_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] warehouse_cd: {varchar(30)} <br>
     * @param warehouseCd The value of the column 'warehouse_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] warehouse_abbr: {varchar(60)} <br>
     * @return The value of the column 'warehouse_abbr'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseAbbr() {
        checkSpecifiedProperty("warehouseAbbr");
        return convertEmptyToNull(_warehouseAbbr);
    }

    /**
     * [set] warehouse_abbr: {varchar(60)} <br>
     * @param warehouseAbbr The value of the column 'warehouse_abbr'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseAbbr(String warehouseAbbr) {
        registerModifiedProperty("warehouseAbbr");
        _warehouseAbbr = warehouseAbbr;
    }

    /**
     * [get] work_dt: {varchar(8)} <br>
     * @return The value of the column 'work_dt'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] work_dt: {varchar(8)} <br>
     * @param workDt The value of the column 'work_dt'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] deliv_dt: {varchar(8)} <br>
     * @return The value of the column 'deliv_dt'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivDt() {
        checkSpecifiedProperty("delivDt");
        return convertEmptyToNull(_delivDt);
    }

    /**
     * [set] deliv_dt: {varchar(8)} <br>
     * @param delivDt The value of the column 'deliv_dt'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivDt(String delivDt) {
        registerModifiedProperty("delivDt");
        _delivDt = delivDt;
    }

    /**
     * [get] delivery_course_cd: {varchar(30)} <br>
     * @return The value of the column 'delivery_course_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] delivery_course_cd: {varchar(30)} <br>
     * @param deliveryCourseCd The value of the column 'delivery_course_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] delivery_course_nm: {varchar(60)} <br>
     * @return The value of the column 'delivery_course_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseNm() {
        checkSpecifiedProperty("deliveryCourseNm");
        return convertEmptyToNull(_deliveryCourseNm);
    }

    /**
     * [set] delivery_course_nm: {varchar(60)} <br>
     * @param deliveryCourseNm The value of the column 'delivery_course_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        registerModifiedProperty("deliveryCourseNm");
        _deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] carrier_cd: {varchar(30)} <br>
     * @return The value of the column 'carrier_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] carrier_cd: {varchar(30)} <br>
     * @param carrierCd The value of the column 'carrier_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] carrier_nm: {varchar(60)} <br>
     * @return The value of the column 'carrier_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierNm() {
        checkSpecifiedProperty("carrierNm");
        return convertEmptyToNull(_carrierNm);
    }

    /**
     * [set] carrier_nm: {varchar(60)} <br>
     * @param carrierNm The value of the column 'carrier_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierNm(String carrierNm) {
        registerModifiedProperty("carrierNm");
        _carrierNm = carrierNm;
    }

    /**
     * [get] supply_customer_cd: {varchar(30)} <br>
     * @return The value of the column 'supply_customer_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        checkSpecifiedProperty("supplyCustomerCd");
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] supply_customer_cd: {varchar(30)} <br>
     * @param supplyCustomerCd The value of the column 'supply_customer_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        registerModifiedProperty("supplyCustomerCd");
        _supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] supply_customer_nm: {varchar(60)} <br>
     * @return The value of the column 'supply_customer_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] supply_customer_nm: {varchar(60)} <br>
     * @param supplyCustomerNm The value of the column 'supply_customer_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] picking_batch_no: {varchar(30)} <br>
     * @return The value of the column 'picking_batch_no'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingBatchNo() {
        checkSpecifiedProperty("pickingBatchNo");
        return convertEmptyToNull(_pickingBatchNo);
    }

    /**
     * [set] picking_batch_no: {varchar(30)} <br>
     * @param pickingBatchNo The value of the column 'picking_batch_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingBatchNo(String pickingBatchNo) {
        registerModifiedProperty("pickingBatchNo");
        _pickingBatchNo = pickingBatchNo;
    }

    /**
     * [get] client_shipping_no: {varchar(30)} <br>
     * @return The value of the column 'client_shipping_no'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientShippingNo() {
        checkSpecifiedProperty("clientShippingNo");
        return convertEmptyToNull(_clientShippingNo);
    }

    /**
     * [set] client_shipping_no: {varchar(30)} <br>
     * @param clientShippingNo The value of the column 'client_shipping_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientShippingNo(String clientShippingNo) {
        registerModifiedProperty("clientShippingNo");
        _clientShippingNo = clientShippingNo;
    }

    /**
     * [get] wms_shipping_slip_no: {varchar(30)} <br>
     * @return The value of the column 'wms_shipping_slip_no'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsShippingSlipNo() {
        checkSpecifiedProperty("wmsShippingSlipNo");
        return convertEmptyToNull(_wmsShippingSlipNo);
    }

    /**
     * [set] wms_shipping_slip_no: {varchar(30)} <br>
     * @param wmsShippingSlipNo The value of the column 'wms_shipping_slip_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsShippingSlipNo(String wmsShippingSlipNo) {
        registerModifiedProperty("wmsShippingSlipNo");
        _wmsShippingSlipNo = wmsShippingSlipNo;
    }

    /**
     * [get] picking_work_message: {varchar(255)} <br>
     * @return The value of the column 'picking_work_message'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkMessage() {
        checkSpecifiedProperty("pickingWorkMessage");
        return convertEmptyToNull(_pickingWorkMessage);
    }

    /**
     * [set] picking_work_message: {varchar(255)} <br>
     * @param pickingWorkMessage The value of the column 'picking_work_message'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        registerModifiedProperty("pickingWorkMessage");
        _pickingWorkMessage = pickingWorkMessage;
    }

    /**
     * [get] zone_picking_order: {bigint(19)} <br>
     * @return The value of the column 'zone_picking_order'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZonePickingOrder() {
        checkSpecifiedProperty("zonePickingOrder");
        return _zonePickingOrder;
    }

    /**
     * [set] zone_picking_order: {bigint(19)} <br>
     * @param zonePickingOrder The value of the column 'zone_picking_order'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZonePickingOrder(Long zonePickingOrder) {
        registerModifiedProperty("zonePickingOrder");
        _zonePickingOrder = zonePickingOrder;
    }

    /**
     * [get] zone_cd: {varchar(30)} <br>
     * @return The value of the column 'zone_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getZoneCd() {
        checkSpecifiedProperty("zoneCd");
        return convertEmptyToNull(_zoneCd);
    }

    /**
     * [set] zone_cd: {varchar(30)} <br>
     * @param zoneCd The value of the column 'zone_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneCd(String zoneCd) {
        registerModifiedProperty("zoneCd");
        _zoneCd = zoneCd;
    }

    /**
     * [get] zone_nm: {varchar(60)} <br>
     * @return The value of the column 'zone_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getZoneNm() {
        checkSpecifiedProperty("zoneNm");
        return convertEmptyToNull(_zoneNm);
    }

    /**
     * [set] zone_nm: {varchar(60)} <br>
     * @param zoneNm The value of the column 'zone_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneNm(String zoneNm) {
        registerModifiedProperty("zoneNm");
        _zoneNm = zoneNm;
    }

    /**
     * [get] location_picking_order: {bigint(19)} <br>
     * @return The value of the column 'location_picking_order'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationPickingOrder() {
        checkSpecifiedProperty("locationPickingOrder");
        return _locationPickingOrder;
    }

    /**
     * [set] location_picking_order: {bigint(19)} <br>
     * @param locationPickingOrder The value of the column 'location_picking_order'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationPickingOrder(Long locationPickingOrder) {
        registerModifiedProperty("locationPickingOrder");
        _locationPickingOrder = locationPickingOrder;
    }

    /**
     * [get] limit_dt: {varchar(8)} <br>
     * @return The value of the column 'limit_dt'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] limit_dt: {varchar(8)} <br>
     * @param limitDt The value of the column 'limit_dt'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] lot: {varchar(30)} <br>
     * @return The value of the column 'lot'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] lot: {varchar(30)} <br>
     * @param lot The value of the column 'lot'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] store_label_no: {varchar(30)} <br>
     * @return The value of the column 'store_label_no'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreLabelNo() {
        checkSpecifiedProperty("storeLabelNo");
        return convertEmptyToNull(_storeLabelNo);
    }

    /**
     * [set] store_label_no: {varchar(30)} <br>
     * @param storeLabelNo The value of the column 'store_label_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        registerModifiedProperty("storeLabelNo");
        _storeLabelNo = storeLabelNo;
    }

    /**
     * [get] store_dt: {varchar(8)} <br>
     * @return The value of the column 'store_dt'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreDt() {
        checkSpecifiedProperty("storeDt");
        return convertEmptyToNull(_storeDt);
    }

    /**
     * [set] store_dt: {varchar(8)} <br>
     * @param storeDt The value of the column 'store_dt'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreDt(String storeDt) {
        registerModifiedProperty("storeDt");
        _storeDt = storeDt;
    }

    /**
     * [get] client_id: {bigint(19)} <br>
     * @return The value of the column 'client_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] client_id: {bigint(19)} <br>
     * @param clientId The value of the column 'client_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] stock_type_cd: {varchar(30)} <br>
     * @return The value of the column 'stock_type_cd'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] stock_type_cd: {varchar(30)} <br>
     * @param stockTypeCd The value of the column 'stock_type_cd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] stock_type_nm: {varchar(100)} <br>
     * @return The value of the column 'stock_type_nm'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeNm() {
        checkSpecifiedProperty("stockTypeNm");
        return convertEmptyToNull(_stockTypeNm);
    }

    /**
     * [set] stock_type_nm: {varchar(100)} <br>
     * @param stockTypeNm The value of the column 'stock_type_nm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeNm(String stockTypeNm) {
        registerModifiedProperty("stockTypeNm");
        _stockTypeNm = stockTypeNm;
    }

    /**
     * [get] charge_num: {decimal(16, 6)} <br>
     * @return The value of the column 'charge_num'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getChargeNum() {
        checkSpecifiedProperty("chargeNum");
        return _chargeNum;
    }

    /**
     * [set] charge_num: {decimal(16, 6)} <br>
     * @param chargeNum The value of the column 'charge_num'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        registerModifiedProperty("chargeNum");
        _chargeNum = chargeNum;
    }

    /**
     * [get] product_id: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} <br>
     * @return The value of the column 'product_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] product_id: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} <br>
     * @param productId The value of the column 'product_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }
}
