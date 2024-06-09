package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of W_HT_INVENTORY_INPUT_PROD as TABLE. <br>
 * 商品棚卸ワーク
 * <pre>
 * [primary-key]
 *     HT_INVENTORY_INPUT_PROD_ID
 *
 * [column]
 *     HT_INVENTORY_INPUT_PROD_ID, MAC_ADDRESS, CLIENT_ID, CENTER_ID, WAREHOUSE_ID, INVENTORY_H_ID, RCV_LABEL_NO, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, LOC_ID, LOC_CD, LOC_NM, JAN_CD, CONSIGNMENT_CLS_ID, CONSIGNMENT_CLS_NM, STOCK_TYPE_ID, STK_CLS_NM, LOT_ID, LOT, LIMIT_DT, QTY, INVENTORY_B_VERSION_NO, CR_DT, WORK_START_DT, WORK_END_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_INVENTORY_INPUT_PROD_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, M_CUSTOMER, M_LOCATION, T_LOT, M_PRODUCT, M_STOCK_TYPE, M_WAREHOUSE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient, mCustomer, mLocation, tLot, mProduct, mStockType, mWarehouse
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long htInventoryInputProdId = entity.getHtInventoryInputProdId();
 * String macAddress = entity.getMacAddress();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * Long warehouseId = entity.getWarehouseId();
 * Long inventoryHId = entity.getInventoryHId();
 * String rcvLabelNo = entity.getRcvLabelNo();
 * Long productId = entity.getProductId();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * Long locId = entity.getLocId();
 * String locCd = entity.getLocCd();
 * String locNm = entity.getLocNm();
 * String janCd = entity.getJanCd();
 * Long consignmentClsId = entity.getConsignmentClsId();
 * String consignmentClsNm = entity.getConsignmentClsNm();
 * Long stockTypeId = entity.getStockTypeId();
 * String stkClsNm = entity.getStkClsNm();
 * Long lotId = entity.getLotId();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * java.math.BigDecimal qty = entity.getQty();
 * Long inventoryBVersionNo = entity.getInventoryBVersionNo();
 * java.sql.Timestamp crDt = entity.getCrDt();
 * java.sql.Timestamp workStartDt = entity.getWorkStartDt();
 * java.sql.Timestamp workEndDt = entity.getWorkEndDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setHtInventoryInputProdId(htInventoryInputProdId);
 * entity.setMacAddress(macAddress);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setWarehouseId(warehouseId);
 * entity.setInventoryHId(inventoryHId);
 * entity.setRcvLabelNo(rcvLabelNo);
 * entity.setProductId(productId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setLocId(locId);
 * entity.setLocCd(locCd);
 * entity.setLocNm(locNm);
 * entity.setJanCd(janCd);
 * entity.setConsignmentClsId(consignmentClsId);
 * entity.setConsignmentClsNm(consignmentClsNm);
 * entity.setStockTypeId(stockTypeId);
 * entity.setStkClsNm(stkClsNm);
 * entity.setLotId(lotId);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setQty(qty);
 * entity.setInventoryBVersionNo(inventoryBVersionNo);
 * entity.setCrDt(crDt);
 * entity.setWorkStartDt(workStartDt);
 * entity.setWorkEndDt(workEndDt);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWHtInventoryInputProd extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** HT_INVENTORY_INPUT_PROD_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _htInventoryInputProdId;

    /** MAC_ADDRESS: {IX, NotNull, varchar(30)} */
    protected String _macAddress;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE} */
    protected Long _warehouseId;

    /** INVENTORY_H_ID: {UQ+, NotNull, bigint(19)} */
    protected Long _inventoryHId;

    /** RCV_LABEL_NO: {varchar(30)} */
    protected String _rcvLabelNo;

    /** PRODUCT_ID: {+UQ, NotNull, bigint(19), FK to M_PRODUCT} */
    protected Long _productId;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** LOC_ID: {+UQ, bigint(19), FK to M_LOCATION} */
    protected Long _locId;

    /** LOC_CD: {varchar(30)} */
    protected String _locCd;

    /** LOC_NM: {varchar(60)} */
    protected String _locNm;

    /** JAN_CD: {varchar(30)} */
    protected String _janCd;

    /** CONSIGNMENT_CLS_ID: {+UQ, bigint(19), FK to M_CUSTOMER} */
    protected Long _consignmentClsId;

    /** CONSIGNMENT_CLS_NM: {varchar(60)} */
    protected String _consignmentClsNm;

    /** STOCK_TYPE_ID: {+UQ, bigint(19), FK to M_STOCK_TYPE} */
    protected Long _stockTypeId;

    /** STK_CLS_NM: {varchar(60)} */
    protected String _stkClsNm;

    /** LOT_ID: {bigint(19), FK to T_LOT} */
    protected Long _lotId;

    /** LOT: {+UQ, varchar(30)} */
    protected String _lot;

    /** LIMIT_DT: {+UQ, varchar(8)} */
    protected String _limitDt;

    /** QTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _qty;

    /** INVENTORY_B_VERSION_NO: {+UQ, bigint(19)} */
    protected Long _inventoryBVersionNo;

    /** CR_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _crDt;

    /** WORK_START_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _workStartDt;

    /** WORK_END_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _workEndDt;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "W_HT_INVENTORY_INPUT_PROD";
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
        if (_htInventoryInputProdId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param inventoryHId : UQ+, NotNull, bigint(19). (NotNull)
     * @param productId : +UQ, NotNull, bigint(19), FK to M_PRODUCT. (NotNull)
     * @param locId : +UQ, bigint(19), FK to M_LOCATION. (NotNull)
     * @param consignmentClsId : +UQ, bigint(19), FK to M_CUSTOMER. (NotNull)
     * @param stockTypeId : +UQ, bigint(19), FK to M_STOCK_TYPE. (NotNull)
     * @param lot : +UQ, varchar(30). (NotNull)
     * @param limitDt : +UQ, varchar(8). (NotNull)
     * @param inventoryBVersionNo : +UQ, bigint(19). (NotNull)
     */
    public void uniqueBy(Long inventoryHId, Long productId, Long locId, Long consignmentClsId, Long stockTypeId, String lot, String limitDt, Long inventoryBVersionNo) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("inventoryHId");
        __uniqueDrivenProperties.addPropertyName("productId");
        __uniqueDrivenProperties.addPropertyName("locId");
        __uniqueDrivenProperties.addPropertyName("consignmentClsId");
        __uniqueDrivenProperties.addPropertyName("stockTypeId");
        __uniqueDrivenProperties.addPropertyName("lot");
        __uniqueDrivenProperties.addPropertyName("limitDt");
        __uniqueDrivenProperties.addPropertyName("inventoryBVersionNo");
        setInventoryHId(inventoryHId);setProductId(productId);setLocId(locId);setConsignmentClsId(consignmentClsId);setStockTypeId(stockTypeId);setLot(lot);setLimitDt(limitDt);setInventoryBVersionNo(inventoryBVersionNo);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** M_CENTER by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] M_CENTER by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    /** M_CLIENT by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] M_CLIENT by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

    /** M_CUSTOMER by my CONSIGNMENT_CLS_ID, named 'MCustomer'. */
    protected MCustomer _mCustomer;

    /**
     * [get] M_CUSTOMER by my CONSIGNMENT_CLS_ID, named 'MCustomer'. <br>
     * @return The entity of foreign property 'MCustomer'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomer() {
        return _mCustomer;
    }

    /**
     * [set] M_CUSTOMER by my CONSIGNMENT_CLS_ID, named 'MCustomer'.
     * @param mCustomer The entity of foreign property 'MCustomer'. (NullAllowed)
     */
    public void setMCustomer(MCustomer mCustomer) {
        _mCustomer = mCustomer;
    }

    /** M_LOCATION by my LOC_ID, named 'MLocation'. */
    protected MLocation _mLocation;

    /**
     * [get] M_LOCATION by my LOC_ID, named 'MLocation'. <br>
     * @return The entity of foreign property 'MLocation'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MLocation getMLocation() {
        return _mLocation;
    }

    /**
     * [set] M_LOCATION by my LOC_ID, named 'MLocation'.
     * @param mLocation The entity of foreign property 'MLocation'. (NullAllowed)
     */
    public void setMLocation(MLocation mLocation) {
        _mLocation = mLocation;
    }

    /** T_LOT by my LOT_ID, named 'TLot'. */
    protected TLot _tLot;

    /**
     * [get] T_LOT by my LOT_ID, named 'TLot'. <br>
     * @return The entity of foreign property 'TLot'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TLot getTLot() {
        return _tLot;
    }

    /**
     * [set] T_LOT by my LOT_ID, named 'TLot'.
     * @param tLot The entity of foreign property 'TLot'. (NullAllowed)
     */
    public void setTLot(TLot tLot) {
        _tLot = tLot;
    }

    /** M_PRODUCT by my PRODUCT_ID, named 'MProduct'. */
    protected MProduct _mProduct;

    /**
     * [get] M_PRODUCT by my PRODUCT_ID, named 'MProduct'. <br>
     * @return The entity of foreign property 'MProduct'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProduct getMProduct() {
        return _mProduct;
    }

    /**
     * [set] M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param mProduct The entity of foreign property 'MProduct'. (NullAllowed)
     */
    public void setMProduct(MProduct mProduct) {
        _mProduct = mProduct;
    }

    /** M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'. */
    protected MStockType _mStockType;

    /**
     * [get] M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'. <br>
     * @return The entity of foreign property 'MStockType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MStockType getMStockType() {
        return _mStockType;
    }

    /**
     * [set] M_STOCK_TYPE by my STOCK_TYPE_ID, named 'MStockType'.
     * @param mStockType The entity of foreign property 'MStockType'. (NullAllowed)
     */
    public void setMStockType(MStockType mStockType) {
        _mStockType = mStockType;
    }

    /** M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'. */
    protected MWarehouse _mWarehouse;

    /**
     * [get] M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'. <br>
     * @return The entity of foreign property 'MWarehouse'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MWarehouse getMWarehouse() {
        return _mWarehouse;
    }

    /**
     * [set] M_WAREHOUSE by my WAREHOUSE_ID, named 'MWarehouse'.
     * @param mWarehouse The entity of foreign property 'MWarehouse'. (NullAllowed)
     */
    public void setMWarehouse(MWarehouse mWarehouse) {
        _mWarehouse = mWarehouse;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWHtInventoryInputProd) {
            BsWHtInventoryInputProd other = (BsWHtInventoryInputProd)obj;
            if (!xSV(_htInventoryInputProdId, other._htInventoryInputProdId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _htInventoryInputProdId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mCustomer != null)
        { sb.append(li).append(xbRDS(_mCustomer, "mCustomer")); }
        if (_mLocation != null)
        { sb.append(li).append(xbRDS(_mLocation, "mLocation")); }
        if (_tLot != null)
        { sb.append(li).append(xbRDS(_tLot, "tLot")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        if (_mWarehouse != null)
        { sb.append(li).append(xbRDS(_mWarehouse, "mWarehouse")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_htInventoryInputProdId));
        sb.append(dm).append(xfND(_macAddress));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_inventoryHId));
        sb.append(dm).append(xfND(_rcvLabelNo));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_locId));
        sb.append(dm).append(xfND(_locCd));
        sb.append(dm).append(xfND(_locNm));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_consignmentClsId));
        sb.append(dm).append(xfND(_consignmentClsNm));
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_stkClsNm));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_qty));
        sb.append(dm).append(xfND(_inventoryBVersionNo));
        sb.append(dm).append(xfND(_crDt));
        sb.append(dm).append(xfND(_workStartDt));
        sb.append(dm).append(xfND(_workEndDt));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mCustomer != null)
        { sb.append(dm).append("mCustomer"); }
        if (_mLocation != null)
        { sb.append(dm).append("mLocation"); }
        if (_tLot != null)
        { sb.append(dm).append("tLot"); }
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (_mWarehouse != null)
        { sb.append(dm).append("mWarehouse"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WHtInventoryInputProd clone() {
        return (WHtInventoryInputProd)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] HT_INVENTORY_INPUT_PROD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 商品棚卸ワークID
     * @return The value of the column 'HT_INVENTORY_INPUT_PROD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getHtInventoryInputProdId() {
        checkSpecifiedProperty("htInventoryInputProdId");
        return _htInventoryInputProdId;
    }

    /**
     * [set] HT_INVENTORY_INPUT_PROD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 商品棚卸ワークID
     * @param htInventoryInputProdId The value of the column 'HT_INVENTORY_INPUT_PROD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setHtInventoryInputProdId(Long htInventoryInputProdId) {
        registerModifiedProperty("htInventoryInputProdId");
        _htInventoryInputProdId = htInventoryInputProdId;
    }

    /**
     * [get] MAC_ADDRESS: {IX, NotNull, varchar(30)} <br>
     * MACアドレス
     * @return The value of the column 'MAC_ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    public String getMacAddress() {
        checkSpecifiedProperty("macAddress");
        return convertEmptyToNull(_macAddress);
    }

    /**
     * [set] MAC_ADDRESS: {IX, NotNull, varchar(30)} <br>
     * MACアドレス
     * @param macAddress The value of the column 'MAC_ADDRESS'. (basically NotNull if update: for the constraint)
     */
    public void setMacAddress(String macAddress) {
        registerModifiedProperty("macAddress");
        _macAddress = macAddress;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE} <br>
     * 倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWarehouseId() {
        checkSpecifiedProperty("warehouseId");
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {bigint(19), FK to M_WAREHOUSE} <br>
     * 倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseId(Long warehouseId) {
        registerModifiedProperty("warehouseId");
        _warehouseId = warehouseId;
    }

    /**
     * [get] INVENTORY_H_ID: {UQ+, NotNull, bigint(19)} <br>
     * 棚卸ヘッダID
     * @return The value of the column 'INVENTORY_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryHId() {
        checkSpecifiedProperty("inventoryHId");
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {UQ+, NotNull, bigint(19)} <br>
     * 棚卸ヘッダID
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryHId(Long inventoryHId) {
        registerModifiedProperty("inventoryHId");
        _inventoryHId = inventoryHId;
    }

    /**
     * [get] RCV_LABEL_NO: {varchar(30)} <br>
     * 入庫ラベルＮＯ
     * @return The value of the column 'RCV_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvLabelNo() {
        checkSpecifiedProperty("rcvLabelNo");
        return convertEmptyToNull(_rcvLabelNo);
    }

    /**
     * [set] RCV_LABEL_NO: {varchar(30)} <br>
     * 入庫ラベルＮＯ
     * @param rcvLabelNo The value of the column 'RCV_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvLabelNo(String rcvLabelNo) {
        registerModifiedProperty("rcvLabelNo");
        _rcvLabelNo = rcvLabelNo;
    }

    /**
     * [get] PRODUCT_ID: {+UQ, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {+UQ, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] LOC_ID: {+UQ, bigint(19), FK to M_LOCATION} <br>
     * ロケーションID
     * @return The value of the column 'LOC_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocId() {
        checkSpecifiedProperty("locId");
        return _locId;
    }

    /**
     * [set] LOC_ID: {+UQ, bigint(19), FK to M_LOCATION} <br>
     * ロケーションID
     * @param locId The value of the column 'LOC_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocId(Long locId) {
        registerModifiedProperty("locId");
        _locId = locId;
    }

    /**
     * [get] LOC_CD: {varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOC_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocCd() {
        checkSpecifiedProperty("locCd");
        return convertEmptyToNull(_locCd);
    }

    /**
     * [set] LOC_CD: {varchar(30)} <br>
     * ロケーションCD
     * @param locCd The value of the column 'LOC_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocCd(String locCd) {
        registerModifiedProperty("locCd");
        _locCd = locCd;
    }

    /**
     * [get] LOC_NM: {varchar(60)} <br>
     * ロケーション名称
     * @return The value of the column 'LOC_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocNm() {
        checkSpecifiedProperty("locNm");
        return convertEmptyToNull(_locNm);
    }

    /**
     * [set] LOC_NM: {varchar(60)} <br>
     * ロケーション名称
     * @param locNm The value of the column 'LOC_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocNm(String locNm) {
        registerModifiedProperty("locNm");
        _locNm = locNm;
    }

    /**
     * [get] JAN_CD: {varchar(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {varchar(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] CONSIGNMENT_CLS_ID: {+UQ, bigint(19), FK to M_CUSTOMER} <br>
     * 預託在庫区分ID
     * @return The value of the column 'CONSIGNMENT_CLS_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getConsignmentClsId() {
        checkSpecifiedProperty("consignmentClsId");
        return _consignmentClsId;
    }

    /**
     * [set] CONSIGNMENT_CLS_ID: {+UQ, bigint(19), FK to M_CUSTOMER} <br>
     * 預託在庫区分ID
     * @param consignmentClsId The value of the column 'CONSIGNMENT_CLS_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setConsignmentClsId(Long consignmentClsId) {
        registerModifiedProperty("consignmentClsId");
        _consignmentClsId = consignmentClsId;
    }

    /**
     * [get] CONSIGNMENT_CLS_NM: {varchar(60)} <br>
     * 預託在庫区分名称
     * @return The value of the column 'CONSIGNMENT_CLS_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getConsignmentClsNm() {
        checkSpecifiedProperty("consignmentClsNm");
        return convertEmptyToNull(_consignmentClsNm);
    }

    /**
     * [set] CONSIGNMENT_CLS_NM: {varchar(60)} <br>
     * 預託在庫区分名称
     * @param consignmentClsNm The value of the column 'CONSIGNMENT_CLS_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setConsignmentClsNm(String consignmentClsNm) {
        registerModifiedProperty("consignmentClsNm");
        _consignmentClsNm = consignmentClsNm;
    }

    /**
     * [get] STOCK_TYPE_ID: {+UQ, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockTypeId() {
        checkSpecifiedProperty("stockTypeId");
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {+UQ, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeId(Long stockTypeId) {
        registerModifiedProperty("stockTypeId");
        _stockTypeId = stockTypeId;
    }

    /**
     * [get] STK_CLS_NM: {varchar(60)} <br>
     * 在庫区分名称
     * @return The value of the column 'STK_CLS_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getStkClsNm() {
        checkSpecifiedProperty("stkClsNm");
        return convertEmptyToNull(_stkClsNm);
    }

    /**
     * [set] STK_CLS_NM: {varchar(60)} <br>
     * 在庫区分名称
     * @param stkClsNm The value of the column 'STK_CLS_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStkClsNm(String stkClsNm) {
        registerModifiedProperty("stkClsNm");
        _stkClsNm = stkClsNm;
    }

    /**
     * [get] LOT_ID: {bigint(19), FK to T_LOT} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {bigint(19), FK to T_LOT} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] LOT: {+UQ, varchar(30)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {+UQ, varchar(30)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMIT_DT: {+UQ, varchar(8)} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] LIMIT_DT: {+UQ, varchar(8)} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] QTY: {decimal(16, 6)} <br>
     * 数量
     * @return The value of the column 'QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getQty() {
        checkSpecifiedProperty("qty");
        return _qty;
    }

    /**
     * [set] QTY: {decimal(16, 6)} <br>
     * 数量
     * @param qty The value of the column 'QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty(java.math.BigDecimal qty) {
        registerModifiedProperty("qty");
        _qty = qty;
    }

    /**
     * [get] INVENTORY_B_VERSION_NO: {+UQ, bigint(19)} <br>
     * 棚卸ボディバージョンNo.
     * @return The value of the column 'INVENTORY_B_VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryBVersionNo() {
        checkSpecifiedProperty("inventoryBVersionNo");
        return _inventoryBVersionNo;
    }

    /**
     * [set] INVENTORY_B_VERSION_NO: {+UQ, bigint(19)} <br>
     * 棚卸ボディバージョンNo.
     * @param inventoryBVersionNo The value of the column 'INVENTORY_B_VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryBVersionNo(Long inventoryBVersionNo) {
        registerModifiedProperty("inventoryBVersionNo");
        _inventoryBVersionNo = inventoryBVersionNo;
    }

    /**
     * [get] CR_DT: {datetime2(26, 6)} <br>
     * 登録日付
     * @return The value of the column 'CR_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getCrDt() {
        checkSpecifiedProperty("crDt");
        return _crDt;
    }

    /**
     * [set] CR_DT: {datetime2(26, 6)} <br>
     * 登録日付
     * @param crDt The value of the column 'CR_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCrDt(java.sql.Timestamp crDt) {
        registerModifiedProperty("crDt");
        _crDt = crDt;
    }

    /**
     * [get] WORK_START_DT: {datetime2(26, 6)} <br>
     * 開始時間
     * @return The value of the column 'WORK_START_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getWorkStartDt() {
        checkSpecifiedProperty("workStartDt");
        return _workStartDt;
    }

    /**
     * [set] WORK_START_DT: {datetime2(26, 6)} <br>
     * 開始時間
     * @param workStartDt The value of the column 'WORK_START_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkStartDt(java.sql.Timestamp workStartDt) {
        registerModifiedProperty("workStartDt");
        _workStartDt = workStartDt;
    }

    /**
     * [get] WORK_END_DT: {datetime2(26, 6)} <br>
     * 終了時間
     * @return The value of the column 'WORK_END_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getWorkEndDt() {
        checkSpecifiedProperty("workEndDt");
        return _workEndDt;
    }

    /**
     * [set] WORK_END_DT: {datetime2(26, 6)} <br>
     * 終了時間
     * @param workEndDt The value of the column 'WORK_END_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkEndDt(java.sql.Timestamp workEndDt) {
        registerModifiedProperty("workEndDt");
        _workEndDt = workEndDt;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
