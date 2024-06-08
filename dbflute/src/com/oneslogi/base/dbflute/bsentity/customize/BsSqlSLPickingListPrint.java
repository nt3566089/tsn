package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of SqlSLPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, PICKING_GROUP_NO, WORK_DT, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, SEEDING_NO, PICKING_H_ID, STOCK_TYPE_CD, STOCK_TYPE_NM, TEMP_NO, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, LOCATION_CD, LOCATION_NM, JANCD, STORE_LABEL_NO, STORE_DT, LIMIT_DT, LOT, SUM_PICKING_NUM, PICKING_WORK_NO1, PICKING_WORK_NO2, SHIPPING_PACKING_NO1, SHIPPING_PACKING_NO2, PACKING_CAL_CLS, SL_OUT_FLG
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
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String pickingGroupNo = entity.getPickingGroupNo();
 * String workDt = entity.getWorkDt();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String seedingNo = entity.getSeedingNo();
 * Long pickingHId = entity.getPickingHId();
 * String stockTypeCd = entity.getStockTypeCd();
 * String stockTypeNm = entity.getStockTypeNm();
 * String tempNo = entity.getTempNo();
 * Long productId = entity.getProductId();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String locationCd = entity.getLocationCd();
 * String locationNm = entity.getLocationNm();
 * String jancd = entity.getJancd();
 * String storeLabelNo = entity.getStoreLabelNo();
 * String storeDt = entity.getStoreDt();
 * String limitDt = entity.getLimitDt();
 * String lot = entity.getLot();
 * java.math.BigDecimal sumPickingNum = entity.getSumPickingNum();
 * String pickingWorkNo1 = entity.getPickingWorkNo1();
 * String pickingWorkNo2 = entity.getPickingWorkNo2();
 * String shippingPackingNo1 = entity.getShippingPackingNo1();
 * String shippingPackingNo2 = entity.getShippingPackingNo2();
 * String packingCalCls = entity.getPackingCalCls();
 * String slOutFlg = entity.getSlOutFlg();
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setPickingGroupNo(pickingGroupNo);
 * entity.setWorkDt(workDt);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setSeedingNo(seedingNo);
 * entity.setPickingHId(pickingHId);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setStockTypeNm(stockTypeNm);
 * entity.setTempNo(tempNo);
 * entity.setProductId(productId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setLocationCd(locationCd);
 * entity.setLocationNm(locationNm);
 * entity.setJancd(jancd);
 * entity.setStoreLabelNo(storeLabelNo);
 * entity.setStoreDt(storeDt);
 * entity.setLimitDt(limitDt);
 * entity.setLot(lot);
 * entity.setSumPickingNum(sumPickingNum);
 * entity.setPickingWorkNo1(pickingWorkNo1);
 * entity.setPickingWorkNo2(pickingWorkNo2);
 * entity.setShippingPackingNo1(shippingPackingNo1);
 * entity.setShippingPackingNo2(shippingPackingNo2);
 * entity.setPackingCalCls(packingCalCls);
 * entity.setSlOutFlg(slOutFlg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlSLPickingListPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** PICKING_GROUP_NO: {varchar(30)} */
    protected String _pickingGroupNo;

    /** WORK_DT: {varchar(8)} */
    protected String _workDt;

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(60)} */
    protected String _supplyCustomerNm;

    /** SEEDING_NO: {varchar(30)} */
    protected String _seedingNo;

    /** PICKING_H_ID: {bigint(19)} */
    protected Long _pickingHId;

    /** STOCK_TYPE_CD: {varchar(30)} */
    protected String _stockTypeCd;

    /** STOCK_TYPE_NM: {varchar(100)} */
    protected String _stockTypeNm;

    /** TEMP_NO: {varchar(30)} */
    protected String _tempNo;

    /** PRODUCT_ID: {PK, bigint(19), refers to M_PRODUCT.PRODUCT_ID} */
    protected Long _productId;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(60)} */
    protected String _productNm;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** LOCATION_NM: {varchar(60)} */
    protected String _locationNm;

    /** JANCD: {varchar(30)} */
    protected String _jancd;

    /** STORE_LABEL_NO: {varchar(30)} */
    protected String _storeLabelNo;

    /** STORE_DT: {varchar(8)} */
    protected String _storeDt;

    /** LIMIT_DT: {varchar(8)} */
    protected String _limitDt;

    /** LOT: {varchar(30)} */
    protected String _lot;

    /** SUM_PICKING_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _sumPickingNum;

    /** PICKING_WORK_NO1: {varchar(12)} */
    protected String _pickingWorkNo1;

    /** PICKING_WORK_NO2: {varchar(10)} */
    protected String _pickingWorkNo2;

    /** SHIPPING_PACKING_NO1: {varchar(12)} */
    protected String _shippingPackingNo1;

    /** SHIPPING_PACKING_NO2: {varchar(10)} */
    protected String _shippingPackingNo2;

    /** PACKING_CAL_CLS: {varchar(30)} */
    protected String _packingCalCls;

    /** SL_OUT_FLG: {char(1)} */
    protected String _slOutFlg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlSLPickingListPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlSLPickingListPrint";
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
        if (obj instanceof BsSqlSLPickingListPrint) {
            BsSqlSLPickingListPrint other = (BsSqlSLPickingListPrint)obj;
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
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_pickingGroupNo));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_seedingNo));
        sb.append(dm).append(xfND(_pickingHId));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_stockTypeNm));
        sb.append(dm).append(xfND(_tempNo));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_locationNm));
        sb.append(dm).append(xfND(_jancd));
        sb.append(dm).append(xfND(_storeLabelNo));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_sumPickingNum));
        sb.append(dm).append(xfND(_pickingWorkNo1));
        sb.append(dm).append(xfND(_pickingWorkNo2));
        sb.append(dm).append(xfND(_shippingPackingNo1));
        sb.append(dm).append(xfND(_shippingPackingNo2));
        sb.append(dm).append(xfND(_packingCalCls));
        sb.append(dm).append(xfND(_slOutFlg));
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
    public SqlSLPickingListPrint clone() {
        return (SqlSLPickingListPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
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
     * [get] PICKING_H_ID: {bigint(19)} <br>
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingHId() {
        checkSpecifiedProperty("pickingHId");
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {bigint(19)} <br>
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingHId(Long pickingHId) {
        registerModifiedProperty("pickingHId");
        _pickingHId = pickingHId;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(30)} <br>
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(30)} <br>
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] STOCK_TYPE_NM: {varchar(100)} <br>
     * @return The value of the column 'STOCK_TYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeNm() {
        checkSpecifiedProperty("stockTypeNm");
        return convertEmptyToNull(_stockTypeNm);
    }

    /**
     * [set] STOCK_TYPE_NM: {varchar(100)} <br>
     * @param stockTypeNm The value of the column 'STOCK_TYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeNm(String stockTypeNm) {
        registerModifiedProperty("stockTypeNm");
        _stockTypeNm = stockTypeNm;
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
     * [get] SUM_PICKING_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'SUM_PICKING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSumPickingNum() {
        checkSpecifiedProperty("sumPickingNum");
        return _sumPickingNum;
    }

    /**
     * [set] SUM_PICKING_NUM: {decimal(38, 6)} <br>
     * @param sumPickingNum The value of the column 'SUM_PICKING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSumPickingNum(java.math.BigDecimal sumPickingNum) {
        registerModifiedProperty("sumPickingNum");
        _sumPickingNum = sumPickingNum;
    }

    /**
     * [get] PICKING_WORK_NO1: {varchar(12)} <br>
     * @return The value of the column 'PICKING_WORK_NO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo1() {
        checkSpecifiedProperty("pickingWorkNo1");
        return convertEmptyToNull(_pickingWorkNo1);
    }

    /**
     * [set] PICKING_WORK_NO1: {varchar(12)} <br>
     * @param pickingWorkNo1 The value of the column 'PICKING_WORK_NO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo1(String pickingWorkNo1) {
        registerModifiedProperty("pickingWorkNo1");
        _pickingWorkNo1 = pickingWorkNo1;
    }

    /**
     * [get] PICKING_WORK_NO2: {varchar(10)} <br>
     * @return The value of the column 'PICKING_WORK_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkNo2() {
        checkSpecifiedProperty("pickingWorkNo2");
        return convertEmptyToNull(_pickingWorkNo2);
    }

    /**
     * [set] PICKING_WORK_NO2: {varchar(10)} <br>
     * @param pickingWorkNo2 The value of the column 'PICKING_WORK_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkNo2(String pickingWorkNo2) {
        registerModifiedProperty("pickingWorkNo2");
        _pickingWorkNo2 = pickingWorkNo2;
    }

    /**
     * [get] SHIPPING_PACKING_NO1: {varchar(12)} <br>
     * @return The value of the column 'SHIPPING_PACKING_NO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingPackingNo1() {
        checkSpecifiedProperty("shippingPackingNo1");
        return convertEmptyToNull(_shippingPackingNo1);
    }

    /**
     * [set] SHIPPING_PACKING_NO1: {varchar(12)} <br>
     * @param shippingPackingNo1 The value of the column 'SHIPPING_PACKING_NO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPackingNo1(String shippingPackingNo1) {
        registerModifiedProperty("shippingPackingNo1");
        _shippingPackingNo1 = shippingPackingNo1;
    }

    /**
     * [get] SHIPPING_PACKING_NO2: {varchar(10)} <br>
     * @return The value of the column 'SHIPPING_PACKING_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingPackingNo2() {
        checkSpecifiedProperty("shippingPackingNo2");
        return convertEmptyToNull(_shippingPackingNo2);
    }

    /**
     * [set] SHIPPING_PACKING_NO2: {varchar(10)} <br>
     * @param shippingPackingNo2 The value of the column 'SHIPPING_PACKING_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPackingNo2(String shippingPackingNo2) {
        registerModifiedProperty("shippingPackingNo2");
        _shippingPackingNo2 = shippingPackingNo2;
    }

    /**
     * [get] PACKING_CAL_CLS: {varchar(30)} <br>
     * @return The value of the column 'PACKING_CAL_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingCalCls() {
        checkSpecifiedProperty("packingCalCls");
        return convertEmptyToNull(_packingCalCls);
    }

    /**
     * [set] PACKING_CAL_CLS: {varchar(30)} <br>
     * @param packingCalCls The value of the column 'PACKING_CAL_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingCalCls(String packingCalCls) {
        registerModifiedProperty("packingCalCls");
        _packingCalCls = packingCalCls;
    }

    /**
     * [get] SL_OUT_FLG: {char(1)} <br>
     * @return The value of the column 'SL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlOutFlg() {
        checkSpecifiedProperty("slOutFlg");
        return convertEmptyToNull(_slOutFlg);
    }

    /**
     * [set] SL_OUT_FLG: {char(1)} <br>
     * @param slOutFlg The value of the column 'SL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlOutFlg(String slOutFlg) {
        registerModifiedProperty("slOutFlg");
        _slOutFlg = slOutFlg;
    }
}
