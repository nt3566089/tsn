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
 * The entity of T_STOCK as TABLE. <br>
 * 在庫
 * <pre>
 * [primary-key]
 *     STOCK_ID
 *
 * [column]
 *     STOCK_ID, CLIENT_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, DEPOSIT_ID, LOT_ID, SHAPE_ID, STORE_NO_ID, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, TRANSIT_NUM, COMPANYCD, LOGICFLG1, LOGICFLG2, LOGICFLG3, TAGCD, QTY2AVG, QTY3AVG, QTY1INSTRUCTED, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_CUSTOMER, M_LOCATION, T_LOT, M_PRODUCT, M_SHAPE, M_STOCK_TYPE, T_STORE_NO, M_WAREHOUSE, T_STOCK_REPORT(AsOne)
 *
 * [referrer table]
 *     T_INVENTORY_B, T_PALLET, T_PICKING_B, T_STOCK_INOUT, T_TRIMALLOCSTOCK, T_TRPICKDETAIL, T_STOCK_REPORT
 *
 * [foreign property]
 *     mClient, mCustomer, mLocation, tLot, mProduct, mShape, mStockType, tStoreNo, mWarehouse, tStockReportAsOne
 *
 * [referrer property]
 *     tInventoryBList, tPalletList, tPickingBList, tStockInoutList, tTrimallocstockList, tTrpickdetailList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long stockId = entity.getStockId();
 * Long clientId = entity.getClientId();
 * Long warehouseId = entity.getWarehouseId();
 * Long productId = entity.getProductId();
 * Long stockTypeId = entity.getStockTypeId();
 * Long locationId = entity.getLocationId();
 * Long depositId = entity.getDepositId();
 * Long lotId = entity.getLotId();
 * Long shapeId = entity.getShapeId();
 * Long storeNoId = entity.getStoreNoId();
 * Long unitNum = entity.getUnitNum();
 * java.math.BigDecimal chargeNum = entity.getChargeNum();
 * java.math.BigDecimal allocNum = entity.getAllocNum();
 * java.math.BigDecimal moveNum = entity.getMoveNum();
 * java.math.BigDecimal transitNum = entity.getTransitNum();
 * String companycd = entity.getCompanycd();
 * String logicflg1 = entity.getLogicflg1();
 * String logicflg2 = entity.getLogicflg2();
 * String logicflg3 = entity.getLogicflg3();
 * String tagcd = entity.getTagcd();
 * java.math.BigDecimal qty2avg = entity.getQty2avg();
 * java.math.BigDecimal qty3avg = entity.getQty3avg();
 * Long qty1instructed = entity.getQty1instructed();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setStockId(stockId);
 * entity.setClientId(clientId);
 * entity.setWarehouseId(warehouseId);
 * entity.setProductId(productId);
 * entity.setStockTypeId(stockTypeId);
 * entity.setLocationId(locationId);
 * entity.setDepositId(depositId);
 * entity.setLotId(lotId);
 * entity.setShapeId(shapeId);
 * entity.setStoreNoId(storeNoId);
 * entity.setUnitNum(unitNum);
 * entity.setChargeNum(chargeNum);
 * entity.setAllocNum(allocNum);
 * entity.setMoveNum(moveNum);
 * entity.setTransitNum(transitNum);
 * entity.setCompanycd(companycd);
 * entity.setLogicflg1(logicflg1);
 * entity.setLogicflg2(logicflg2);
 * entity.setLogicflg3(logicflg3);
 * entity.setTagcd(tagcd);
 * entity.setQty2avg(qty2avg);
 * entity.setQty3avg(qty3avg);
 * entity.setQty1instructed(qty1instructed);
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
public abstract class BsTStock extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STOCK_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _stockId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** WAREHOUSE_ID: {NotNull, bigint(19), FK to M_WAREHOUSE} */
    protected Long _warehouseId;

    /** PRODUCT_ID: {IX+, NotNull, bigint(19), FK to M_PRODUCT} */
    protected Long _productId;

    /** STOCK_TYPE_ID: {IX+, NotNull, bigint(19), FK to M_STOCK_TYPE} */
    protected Long _stockTypeId;

    /** LOCATION_ID: {+UQ, IX+, NotNull, bigint(19), FK to M_LOCATION} */
    protected Long _locationId;

    /** DEPOSIT_ID: {IX+, NotNull, bigint(19), FK to M_CUSTOMER} */
    protected Long _depositId;

    /** LOT_ID: {IX+, NotNull, bigint(19), FK to T_LOT} */
    protected Long _lotId;

    /** SHAPE_ID: {IX, bigint(19), FK to M_SHAPE} */
    protected Long _shapeId;

    /** STORE_NO_ID: {UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO} */
    protected Long _storeNoId;

    /** UNIT_NUM: {bigint(19)} */
    protected Long _unitNum;

    /** CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _chargeNum;

    /** ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _allocNum;

    /** MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _moveNum;

    /** TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _transitNum;

    /** COMPANYCD: {varchar(30)} */
    protected String _companycd;

    /** LOGICFLG1: {char(1)} */
    protected String _logicflg1;

    /** LOGICFLG2: {char(1)} */
    protected String _logicflg2;

    /** LOGICFLG3: {char(1)} */
    protected String _logicflg3;

    /** TAGCD: {varchar(30)} */
    protected String _tagcd;

    /** QTY2AVG: {decimal(16, 6)} */
    protected java.math.BigDecimal _qty2avg;

    /** QTY3AVG: {decimal(16, 6)} */
    protected java.math.BigDecimal _qty3avg;

    /** QTY1INSTRUCTED: {bigint(19)} */
    protected Long _qty1instructed;

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
        return "T_STOCK";
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
        if (_stockId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param storeNoId : UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO. (NotNull)
     * @param locationId : +UQ, IX+, NotNull, bigint(19), FK to M_LOCATION. (NotNull)
     */
    public void uniqueBy(Long storeNoId, Long locationId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("storeNoId");
        __uniqueDrivenProperties.addPropertyName("locationId");
        setStoreNoId(storeNoId);setLocationId(locationId);
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

    /** M_CUSTOMER by my DEPOSIT_ID, named 'MCustomer'. */
    protected MCustomer _mCustomer;

    /**
     * [get] M_CUSTOMER by my DEPOSIT_ID, named 'MCustomer'. <br>
     * @return The entity of foreign property 'MCustomer'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomer() {
        return _mCustomer;
    }

    /**
     * [set] M_CUSTOMER by my DEPOSIT_ID, named 'MCustomer'.
     * @param mCustomer The entity of foreign property 'MCustomer'. (NullAllowed)
     */
    public void setMCustomer(MCustomer mCustomer) {
        _mCustomer = mCustomer;
    }

    /** M_LOCATION by my LOCATION_ID, named 'MLocation'. */
    protected MLocation _mLocation;

    /**
     * [get] M_LOCATION by my LOCATION_ID, named 'MLocation'. <br>
     * @return The entity of foreign property 'MLocation'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MLocation getMLocation() {
        return _mLocation;
    }

    /**
     * [set] M_LOCATION by my LOCATION_ID, named 'MLocation'.
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

    /** M_SHAPE by my SHAPE_ID, named 'MShape'. */
    protected MShape _mShape;

    /**
     * [get] M_SHAPE by my SHAPE_ID, named 'MShape'. <br>
     * @return The entity of foreign property 'MShape'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MShape getMShape() {
        return _mShape;
    }

    /**
     * [set] M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @param mShape The entity of foreign property 'MShape'. (NullAllowed)
     */
    public void setMShape(MShape mShape) {
        _mShape = mShape;
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

    /** T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'. */
    protected TStoreNo _tStoreNo;

    /**
     * [get] T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'. <br>
     * @return The entity of foreign property 'TStoreNo'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TStoreNo getTStoreNo() {
        return _tStoreNo;
    }

    /**
     * [set] T_STORE_NO by my STORE_NO_ID, named 'TStoreNo'.
     * @param tStoreNo The entity of foreign property 'TStoreNo'. (NullAllowed)
     */
    public void setTStoreNo(TStoreNo tStoreNo) {
        _tStoreNo = tStoreNo;
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

    /** T_STOCK_REPORT by STOCK_ID, named 'TStockReportAsOne'. */
    protected TStockReport _tStockReportAsOne;

    /**
     * [get] T_STOCK_REPORT by STOCK_ID, named 'TStockReportAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'TStockReportAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public TStockReport getTStockReportAsOne() {
        return _tStockReportAsOne;
    }

    /**
     * [set] T_STOCK_REPORT by STOCK_ID, named 'TStockReportAsOne'.
     * @param TStockReportAsOne The entity of foreign property(referrer-as-one) 'TStockReportAsOne'. (NullAllowed)
     */
    public void setTStockReportAsOne(TStockReport TStockReportAsOne) {
        _tStockReportAsOne = TStockReportAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_INVENTORY_B by STOCK_ID, named 'TInventoryBList'. */
    protected List<TInventoryB> _tInventoryBList;

    /**
     * [get] T_INVENTORY_B by STOCK_ID, named 'TInventoryBList'.
     * @return The entity list of referrer property 'TInventoryBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryB> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = newReferrerList(); }
        return _tInventoryBList;
    }

    /**
     * [set] T_INVENTORY_B by STOCK_ID, named 'TInventoryBList'.
     * @param tInventoryBList The entity list of referrer property 'TInventoryBList'. (NullAllowed)
     */
    public void setTInventoryBList(List<TInventoryB> tInventoryBList) {
        _tInventoryBList = tInventoryBList;
    }

    /** T_PALLET by STOCK_ID, named 'TPalletList'. */
    protected List<TPallet> _tPalletList;

    /**
     * [get] T_PALLET by STOCK_ID, named 'TPalletList'.
     * @return The entity list of referrer property 'TPalletList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPallet> getTPalletList() {
        if (_tPalletList == null) { _tPalletList = newReferrerList(); }
        return _tPalletList;
    }

    /**
     * [set] T_PALLET by STOCK_ID, named 'TPalletList'.
     * @param tPalletList The entity list of referrer property 'TPalletList'. (NullAllowed)
     */
    public void setTPalletList(List<TPallet> tPalletList) {
        _tPalletList = tPalletList;
    }

    /** T_PICKING_B by STOCK_ID, named 'TPickingBList'. */
    protected List<TPickingB> _tPickingBList;

    /**
     * [get] T_PICKING_B by STOCK_ID, named 'TPickingBList'.
     * @return The entity list of referrer property 'TPickingBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingB> getTPickingBList() {
        if (_tPickingBList == null) { _tPickingBList = newReferrerList(); }
        return _tPickingBList;
    }

    /**
     * [set] T_PICKING_B by STOCK_ID, named 'TPickingBList'.
     * @param tPickingBList The entity list of referrer property 'TPickingBList'. (NullAllowed)
     */
    public void setTPickingBList(List<TPickingB> tPickingBList) {
        _tPickingBList = tPickingBList;
    }

    /** T_STOCK_INOUT by STOCK_ID, named 'TStockInoutList'. */
    protected List<TStockInout> _tStockInoutList;

    /**
     * [get] T_STOCK_INOUT by STOCK_ID, named 'TStockInoutList'.
     * @return The entity list of referrer property 'TStockInoutList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStockInout> getTStockInoutList() {
        if (_tStockInoutList == null) { _tStockInoutList = newReferrerList(); }
        return _tStockInoutList;
    }

    /**
     * [set] T_STOCK_INOUT by STOCK_ID, named 'TStockInoutList'.
     * @param tStockInoutList The entity list of referrer property 'TStockInoutList'. (NullAllowed)
     */
    public void setTStockInoutList(List<TStockInout> tStockInoutList) {
        _tStockInoutList = tStockInoutList;
    }

    /** T_TRIMALLOCSTOCK by STOCK_ID, named 'TTrimallocstockList'. */
    protected List<TTrimallocstock> _tTrimallocstockList;

    /**
     * [get] T_TRIMALLOCSTOCK by STOCK_ID, named 'TTrimallocstockList'.
     * @return The entity list of referrer property 'TTrimallocstockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrimallocstock> getTTrimallocstockList() {
        if (_tTrimallocstockList == null) { _tTrimallocstockList = newReferrerList(); }
        return _tTrimallocstockList;
    }

    /**
     * [set] T_TRIMALLOCSTOCK by STOCK_ID, named 'TTrimallocstockList'.
     * @param tTrimallocstockList The entity list of referrer property 'TTrimallocstockList'. (NullAllowed)
     */
    public void setTTrimallocstockList(List<TTrimallocstock> tTrimallocstockList) {
        _tTrimallocstockList = tTrimallocstockList;
    }

    /** T_TRPICKDETAIL by STOCK_ID, named 'TTrpickdetailList'. */
    protected List<TTrpickdetail> _tTrpickdetailList;

    /**
     * [get] T_TRPICKDETAIL by STOCK_ID, named 'TTrpickdetailList'.
     * @return The entity list of referrer property 'TTrpickdetailList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrpickdetail> getTTrpickdetailList() {
        if (_tTrpickdetailList == null) { _tTrpickdetailList = newReferrerList(); }
        return _tTrpickdetailList;
    }

    /**
     * [set] T_TRPICKDETAIL by STOCK_ID, named 'TTrpickdetailList'.
     * @param tTrpickdetailList The entity list of referrer property 'TTrpickdetailList'. (NullAllowed)
     */
    public void setTTrpickdetailList(List<TTrpickdetail> tTrpickdetailList) {
        _tTrpickdetailList = tTrpickdetailList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTStock) {
            BsTStock other = (BsTStock)obj;
            if (!xSV(_stockId, other._stockId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _stockId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
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
        if (_mShape != null)
        { sb.append(li).append(xbRDS(_mShape, "mShape")); }
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        if (_tStoreNo != null)
        { sb.append(li).append(xbRDS(_tStoreNo, "tStoreNo")); }
        if (_mWarehouse != null)
        { sb.append(li).append(xbRDS(_mWarehouse, "mWarehouse")); }
        if (_tStockReportAsOne != null)
        { sb.append(li).append(xbRDS(_tStockReportAsOne, "tStockReportAsOne")); }
        if (_tInventoryBList != null) { for (TInventoryB et : _tInventoryBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryBList")); } } }
        if (_tPalletList != null) { for (TPallet et : _tPalletList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPalletList")); } } }
        if (_tPickingBList != null) { for (TPickingB et : _tPickingBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingBList")); } } }
        if (_tStockInoutList != null) { for (TStockInout et : _tStockInoutList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockInoutList")); } } }
        if (_tTrimallocstockList != null) { for (TTrimallocstock et : _tTrimallocstockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrimallocstockList")); } } }
        if (_tTrpickdetailList != null) { for (TTrpickdetail et : _tTrpickdetailList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrpickdetailList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_depositId));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_shapeId));
        sb.append(dm).append(xfND(_storeNoId));
        sb.append(dm).append(xfND(_unitNum));
        sb.append(dm).append(xfND(_chargeNum));
        sb.append(dm).append(xfND(_allocNum));
        sb.append(dm).append(xfND(_moveNum));
        sb.append(dm).append(xfND(_transitNum));
        sb.append(dm).append(xfND(_companycd));
        sb.append(dm).append(xfND(_logicflg1));
        sb.append(dm).append(xfND(_logicflg2));
        sb.append(dm).append(xfND(_logicflg3));
        sb.append(dm).append(xfND(_tagcd));
        sb.append(dm).append(xfND(_qty2avg));
        sb.append(dm).append(xfND(_qty3avg));
        sb.append(dm).append(xfND(_qty1instructed));
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
        if (_mShape != null)
        { sb.append(dm).append("mShape"); }
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (_tStoreNo != null)
        { sb.append(dm).append("tStoreNo"); }
        if (_mWarehouse != null)
        { sb.append(dm).append("mWarehouse"); }
        if (_tStockReportAsOne != null)
        { sb.append(dm).append("tStockReportAsOne"); }
        if (_tInventoryBList != null && !_tInventoryBList.isEmpty())
        { sb.append(dm).append("tInventoryBList"); }
        if (_tPalletList != null && !_tPalletList.isEmpty())
        { sb.append(dm).append("tPalletList"); }
        if (_tPickingBList != null && !_tPickingBList.isEmpty())
        { sb.append(dm).append("tPickingBList"); }
        if (_tStockInoutList != null && !_tStockInoutList.isEmpty())
        { sb.append(dm).append("tStockInoutList"); }
        if (_tTrimallocstockList != null && !_tTrimallocstockList.isEmpty())
        { sb.append(dm).append("tTrimallocstockList"); }
        if (_tTrpickdetailList != null && !_tTrpickdetailList.isEmpty())
        { sb.append(dm).append("tTrpickdetailList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TStock clone() {
        return (TStock)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockId() {
        checkSpecifiedProperty("stockId");
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockId(Long stockId) {
        registerModifiedProperty("stockId");
        _stockId = stockId;
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
     * [get] WAREHOUSE_ID: {NotNull, bigint(19), FK to M_WAREHOUSE} <br>
     * 倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getWarehouseId() {
        checkSpecifiedProperty("warehouseId");
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {NotNull, bigint(19), FK to M_WAREHOUSE} <br>
     * 倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWarehouseId(Long warehouseId) {
        registerModifiedProperty("warehouseId");
        _warehouseId = warehouseId;
    }

    /**
     * [get] PRODUCT_ID: {IX+, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX+, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] STOCK_TYPE_ID: {IX+, NotNull, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockTypeId() {
        checkSpecifiedProperty("stockTypeId");
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {IX+, NotNull, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockTypeId(Long stockTypeId) {
        registerModifiedProperty("stockTypeId");
        _stockTypeId = stockTypeId;
    }

    /**
     * [get] LOCATION_ID: {+UQ, IX+, NotNull, bigint(19), FK to M_LOCATION} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {+UQ, IX+, NotNull, bigint(19), FK to M_LOCATION} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] DEPOSIT_ID: {IX+, NotNull, bigint(19), FK to M_CUSTOMER} <br>
     * 預託ID
     * @return The value of the column 'DEPOSIT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDepositId() {
        checkSpecifiedProperty("depositId");
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {IX+, NotNull, bigint(19), FK to M_CUSTOMER} <br>
     * 預託ID
     * @param depositId The value of the column 'DEPOSIT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDepositId(Long depositId) {
        registerModifiedProperty("depositId");
        _depositId = depositId;
    }

    /**
     * [get] LOT_ID: {IX+, NotNull, bigint(19), FK to T_LOT} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX+, NotNull, bigint(19), FK to T_LOT} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] SHAPE_ID: {IX, bigint(19), FK to M_SHAPE} <br>
     * 荷姿ID
     * @return The value of the column 'SHAPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShapeId() {
        checkSpecifiedProperty("shapeId");
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {IX, bigint(19), FK to M_SHAPE} <br>
     * 荷姿ID
     * @param shapeId The value of the column 'SHAPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeId(Long shapeId) {
        registerModifiedProperty("shapeId");
        _shapeId = shapeId;
    }

    /**
     * [get] STORE_NO_ID: {UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO} <br>
     * 入庫No.ID
     * @return The value of the column 'STORE_NO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStoreNoId() {
        checkSpecifiedProperty("storeNoId");
        return _storeNoId;
    }

    /**
     * [set] STORE_NO_ID: {UQ+, IX, NotNull, bigint(19), FK to T_STORE_NO} <br>
     * 入庫No.ID
     * @param storeNoId The value of the column 'STORE_NO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStoreNoId(Long storeNoId) {
        registerModifiedProperty("storeNoId");
        _storeNoId = storeNoId;
    }

    /**
     * [get] UNIT_NUM: {bigint(19)} <br>
     * 入数
     * @return The value of the column 'UNIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnitNum() {
        checkSpecifiedProperty("unitNum");
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {bigint(19)} <br>
     * 入数
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNum(Long unitNum) {
        registerModifiedProperty("unitNum");
        _unitNum = unitNum;
    }

    /**
     * [get] CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当可能数
     * @return The value of the column 'CHARGE_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getChargeNum() {
        checkSpecifiedProperty("chargeNum");
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当可能数
     * @param chargeNum The value of the column 'CHARGE_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        registerModifiedProperty("chargeNum");
        _chargeNum = chargeNum;
    }

    /**
     * [get] ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当済数
     * @return The value of the column 'ALLOC_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getAllocNum() {
        checkSpecifiedProperty("allocNum");
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当済数
     * @param allocNum The value of the column 'ALLOC_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        registerModifiedProperty("allocNum");
        _allocNum = allocNum;
    }

    /**
     * [get] MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 移動中数
     * @return The value of the column 'MOVE_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getMoveNum() {
        checkSpecifiedProperty("moveNum");
        return _moveNum;
    }

    /**
     * [set] MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 移動中数
     * @param moveNum The value of the column 'MOVE_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setMoveNum(java.math.BigDecimal moveNum) {
        registerModifiedProperty("moveNum");
        _moveNum = moveNum;
    }

    /**
     * [get] TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 積送中数
     * @return The value of the column 'TRANSIT_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTransitNum() {
        checkSpecifiedProperty("transitNum");
        return _transitNum;
    }

    /**
     * [set] TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 積送中数
     * @param transitNum The value of the column 'TRANSIT_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setTransitNum(java.math.BigDecimal transitNum) {
        registerModifiedProperty("transitNum");
        _transitNum = transitNum;
    }

    /**
     * [get] COMPANYCD: {varchar(30)} <br>
     * 取引先（代理店）コード
     * @return The value of the column 'COMPANYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanycd() {
        checkSpecifiedProperty("companycd");
        return convertEmptyToNull(_companycd);
    }

    /**
     * [set] COMPANYCD: {varchar(30)} <br>
     * 取引先（代理店）コード
     * @param companycd The value of the column 'COMPANYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanycd(String companycd) {
        registerModifiedProperty("companycd");
        _companycd = companycd;
    }

    /**
     * [get] LOGICFLG1: {char(1)} <br>
     * 理論在庫フラグ１
     * @return The value of the column 'LOGICFLG1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogicflg1() {
        checkSpecifiedProperty("logicflg1");
        return convertEmptyToNull(_logicflg1);
    }

    /**
     * [set] LOGICFLG1: {char(1)} <br>
     * 理論在庫フラグ１
     * @param logicflg1 The value of the column 'LOGICFLG1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogicflg1(String logicflg1) {
        registerModifiedProperty("logicflg1");
        _logicflg1 = logicflg1;
    }

    /**
     * [get] LOGICFLG2: {char(1)} <br>
     * 理論在庫フラグ２
     * @return The value of the column 'LOGICFLG2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogicflg2() {
        checkSpecifiedProperty("logicflg2");
        return convertEmptyToNull(_logicflg2);
    }

    /**
     * [set] LOGICFLG2: {char(1)} <br>
     * 理論在庫フラグ２
     * @param logicflg2 The value of the column 'LOGICFLG2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogicflg2(String logicflg2) {
        registerModifiedProperty("logicflg2");
        _logicflg2 = logicflg2;
    }

    /**
     * [get] LOGICFLG3: {char(1)} <br>
     * 理論在庫フラグ３
     * @return The value of the column 'LOGICFLG3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogicflg3() {
        checkSpecifiedProperty("logicflg3");
        return convertEmptyToNull(_logicflg3);
    }

    /**
     * [set] LOGICFLG3: {char(1)} <br>
     * 理論在庫フラグ３
     * @param logicflg3 The value of the column 'LOGICFLG3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogicflg3(String logicflg3) {
        registerModifiedProperty("logicflg3");
        _logicflg3 = logicflg3;
    }

    /**
     * [get] TAGCD: {varchar(30)} <br>
     * タグCD
     * @return The value of the column 'TAGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagcd() {
        checkSpecifiedProperty("tagcd");
        return convertEmptyToNull(_tagcd);
    }

    /**
     * [set] TAGCD: {varchar(30)} <br>
     * タグCD
     * @param tagcd The value of the column 'TAGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagcd(String tagcd) {
        registerModifiedProperty("tagcd");
        _tagcd = tagcd;
    }

    /**
     * [get] QTY2AVG: {decimal(16, 6)} <br>
     * 実在庫数量２
     * @return The value of the column 'QTY2AVG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getQty2avg() {
        checkSpecifiedProperty("qty2avg");
        return _qty2avg;
    }

    /**
     * [set] QTY2AVG: {decimal(16, 6)} <br>
     * 実在庫数量２
     * @param qty2avg The value of the column 'QTY2AVG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty2avg(java.math.BigDecimal qty2avg) {
        registerModifiedProperty("qty2avg");
        _qty2avg = qty2avg;
    }

    /**
     * [get] QTY3AVG: {decimal(16, 6)} <br>
     * 実在庫数量３
     * @return The value of the column 'QTY3AVG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getQty3avg() {
        checkSpecifiedProperty("qty3avg");
        return _qty3avg;
    }

    /**
     * [set] QTY3AVG: {decimal(16, 6)} <br>
     * 実在庫数量３
     * @param qty3avg The value of the column 'QTY3AVG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty3avg(java.math.BigDecimal qty3avg) {
        registerModifiedProperty("qty3avg");
        _qty3avg = qty3avg;
    }

    /**
     * [get] QTY1INSTRUCTED: {bigint(19)} <br>
     * 入荷見込数量１／引当不可（バラ）
     * @return The value of the column 'QTY1INSTRUCTED'. (NullAllowed even if selected: for no constraint)
     */
    public Long getQty1instructed() {
        checkSpecifiedProperty("qty1instructed");
        return _qty1instructed;
    }

    /**
     * [set] QTY1INSTRUCTED: {bigint(19)} <br>
     * 入荷見込数量１／引当不可（バラ）
     * @param qty1instructed The value of the column 'QTY1INSTRUCTED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty1instructed(Long qty1instructed) {
        registerModifiedProperty("qty1instructed");
        _qty1instructed = qty1instructed;
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
