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
 * The entity of T_INVENTORY_B as TABLE. <br>
 * 棚卸ボディ
 * <pre>
 * [primary-key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, INVENTORY_H_ID, STOCK_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, DEPOSIT_ID, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, STORE_DT, SUPPLIER_ID, SUPPLIER_CD, SHAPE_ID, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, INVENTORY_NUM, INPUT_TYPE, STOCK_ADJUST_FLG, MOVE_INST_H_ID, PRODUCT_CD, FIRMTRANSPORT_CD, MANUFACTURE_DT, MANUFACTURE_SYMBOL, FCFLG, DIFFQTY_HENPIN, DIFFQTY_TAXREFOND, SUFFERER_QTY, MONTH_STATUSSU, BLUK_RECIVED_QTY, REFUNDITEM_QTY, INVENTORY_INPUT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CUSTOMER, T_INVENTORY_H, M_STOCK_TYPE, M_LOCATION, M_WAREHOUSE, T_STORE_NO, T_MOVE_INST_H, T_LOT, T_STOCK, M_SHAPE, M_PRODUCT, B_CLASS_DTL(ByInputType), T_INVENTORY_R(AsOne)
 *
 * [referrer table]
 *     T_INVENTORY_INP_HIST, T_INVENTORY_R
 *
 * [foreign property]
 *     mCustomerByDepositId, tInventoryH, mStockType, mLocation, mWarehouse, tStoreNo, mCustomerBySupplierId, tMoveInstH, tLot, tStock, mShape, mProduct, bClassDtlByInputType, bClassDtlByStockAdjustFlg, tInventoryRAsOne
 *
 * [referrer property]
 *     tInventoryInpHistList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long inventoryBId = entity.getInventoryBId();
 * Long inventoryHId = entity.getInventoryHId();
 * Long stockId = entity.getStockId();
 * Long warehouseId = entity.getWarehouseId();
 * Long productId = entity.getProductId();
 * Long stockTypeId = entity.getStockTypeId();
 * Long locationId = entity.getLocationId();
 * Long depositId = entity.getDepositId();
 * Long lotId = entity.getLotId();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * Long storeNoId = entity.getStoreNoId();
 * String storeLabelNo = entity.getStoreLabelNo();
 * String storeDt = entity.getStoreDt();
 * Long supplierId = entity.getSupplierId();
 * String supplierCd = entity.getSupplierCd();
 * Long shapeId = entity.getShapeId();
 * Long unitNum = entity.getUnitNum();
 * java.math.BigDecimal chargeNum = entity.getChargeNum();
 * java.math.BigDecimal allocNum = entity.getAllocNum();
 * java.math.BigDecimal moveNum = entity.getMoveNum();
 * java.math.BigDecimal inventoryNum = entity.getInventoryNum();
 * String inputType = entity.getInputType();
 * String stockAdjustFlg = entity.getStockAdjustFlg();
 * Long moveInstHId = entity.getMoveInstHId();
 * String productCd = entity.getProductCd();
 * String firmtransportCd = entity.getFirmtransportCd();
 * String manufactureDt = entity.getManufactureDt();
 * String manufactureSymbol = entity.getManufactureSymbol();
 * String fcflg = entity.getFcflg();
 * Long diffqtyHenpin = entity.getDiffqtyHenpin();
 * Long diffqtyTaxrefond = entity.getDiffqtyTaxrefond();
 * Long suffererQty = entity.getSuffererQty();
 * Long monthStatussu = entity.getMonthStatussu();
 * Long blukRecivedQty = entity.getBlukRecivedQty();
 * Long refunditemQty = entity.getRefunditemQty();
 * String inventoryInputFlg = entity.getInventoryInputFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setInventoryBId(inventoryBId);
 * entity.setInventoryHId(inventoryHId);
 * entity.setStockId(stockId);
 * entity.setWarehouseId(warehouseId);
 * entity.setProductId(productId);
 * entity.setStockTypeId(stockTypeId);
 * entity.setLocationId(locationId);
 * entity.setDepositId(depositId);
 * entity.setLotId(lotId);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setStoreNoId(storeNoId);
 * entity.setStoreLabelNo(storeLabelNo);
 * entity.setStoreDt(storeDt);
 * entity.setSupplierId(supplierId);
 * entity.setSupplierCd(supplierCd);
 * entity.setShapeId(shapeId);
 * entity.setUnitNum(unitNum);
 * entity.setChargeNum(chargeNum);
 * entity.setAllocNum(allocNum);
 * entity.setMoveNum(moveNum);
 * entity.setInventoryNum(inventoryNum);
 * entity.setInputType(inputType);
 * entity.setStockAdjustFlg(stockAdjustFlg);
 * entity.setMoveInstHId(moveInstHId);
 * entity.setProductCd(productCd);
 * entity.setFirmtransportCd(firmtransportCd);
 * entity.setManufactureDt(manufactureDt);
 * entity.setManufactureSymbol(manufactureSymbol);
 * entity.setFcflg(fcflg);
 * entity.setDiffqtyHenpin(diffqtyHenpin);
 * entity.setDiffqtyTaxrefond(diffqtyTaxrefond);
 * entity.setSuffererQty(suffererQty);
 * entity.setMonthStatussu(monthStatussu);
 * entity.setBlukRecivedQty(blukRecivedQty);
 * entity.setRefunditemQty(refunditemQty);
 * entity.setInventoryInputFlg(inventoryInputFlg);
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
public abstract class BsTInventoryB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _inventoryBId;

    /** INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H} */
    protected Long _inventoryHId;

    /** STOCK_ID: {IX, bigint(19), FK to T_STOCK} */
    protected Long _stockId;

    /** WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE} */
    protected Long _warehouseId;

    /** PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT} */
    protected Long _productId;

    /** STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} */
    protected Long _stockTypeId;

    /** LOCATION_ID: {IX, bigint(19), FK to M_LOCATION} */
    protected Long _locationId;

    /** DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    protected Long _depositId;

    /** LOT_ID: {IX, bigint(19), FK to T_LOT} */
    protected Long _lotId;

    /** LOT: {varchar(30)} */
    protected String _lot;

    /** LIMIT_DT: {varchar(8)} */
    protected String _limitDt;

    /** STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO} */
    protected Long _storeNoId;

    /** STORE_LABEL_NO: {IX, varchar(30)} */
    protected String _storeLabelNo;

    /** STORE_DT: {varchar(8)} */
    protected String _storeDt;

    /** SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    protected Long _supplierId;

    /** SUPPLIER_CD: {varchar(30)} */
    protected String _supplierCd;

    /** SHAPE_ID: {IX, bigint(19), FK to M_SHAPE} */
    protected Long _shapeId;

    /** UNIT_NUM: {bigint(19)} */
    protected Long _unitNum;

    /** CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _chargeNum;

    /** ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _allocNum;

    /** MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _moveNum;

    /** INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _inventoryNum;

    /** INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} */
    protected String _inputType;

    /** STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg} */
    protected String _stockAdjustFlg;

    /** MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H} */
    protected Long _moveInstHId;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** FIRMTRANSPORT_CD: {varchar(30)} */
    protected String _firmtransportCd;

    /** MANUFACTURE_DT: {varchar(8)} */
    protected String _manufactureDt;

    /** MANUFACTURE_SYMBOL: {varchar(30)} */
    protected String _manufactureSymbol;

    /** FCFLG: {varchar(30)} */
    protected String _fcflg;

    /** DIFFQTY_HENPIN: {bigint(19)} */
    protected Long _diffqtyHenpin;

    /** DIFFQTY_TAXREFOND: {bigint(19)} */
    protected Long _diffqtyTaxrefond;

    /** SUFFERER_QTY: {bigint(19)} */
    protected Long _suffererQty;

    /** MONTH_STATUSSU: {bigint(19)} */
    protected Long _monthStatussu;

    /** BLUK_RECIVED_QTY: {bigint(19)} */
    protected Long _blukRecivedQty;

    /** REFUNDITEM_QTY: {bigint(19)} */
    protected Long _refunditemQty;

    /** INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]} */
    protected String _inventoryInputFlg;

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
        return "T_INVENTORY_B";
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
        if (_inventoryBId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of inputType as the classification of InputType. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InputType getInputTypeAsInputType() {
        return CDef.InputType.codeOf(getInputType());
    }

    /**
     * Set the value of inputType as the classification of InputType. <br>
     * INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInputTypeAsInputType(CDef.InputType cdef) {
        setInputType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of stockAdjustFlg as the classification of StockMoveFlg. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StockMoveFlg getStockAdjustFlgAsStockMoveFlg() {
        return CDef.StockMoveFlg.codeOf(getStockAdjustFlg());
    }

    /**
     * Set the value of stockAdjustFlg as the classification of StockMoveFlg. <br>
     * STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStockAdjustFlgAsStockMoveFlg(CDef.StockMoveFlg cdef) {
        setStockAdjustFlg(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of inputType as $00 (00). <br>
     * $00: 画面入力
     */
    public void setInputType_$00() {
        setInputTypeAsInputType(CDef.InputType.$00);
    }

    /**
     * Set the value of inputType as $10 (10). <br>
     * $10: アップロード
     */
    public void setInputType_$10() {
        setInputTypeAsInputType(CDef.InputType.$10);
    }

    /**
     * Set the value of inputType as $20 (20). <br>
     * $20: EDI
     */
    public void setInputType_$20() {
        setInputTypeAsInputType(CDef.InputType.$20);
    }

    /**
     * Set the value of inputType as $30 (30). <br>
     * $30: HT
     */
    public void setInputType_$30() {
        setInputTypeAsInputType(CDef.InputType.$30);
    }

    /**
     * Set the value of stockAdjustFlg as $0 (0). <br>
     * $0: 未調整
     */
    public void setStockAdjustFlg_$0() {
        setStockAdjustFlgAsStockMoveFlg(CDef.StockMoveFlg.$0);
    }

    /**
     * Set the value of stockAdjustFlg as $1 (1). <br>
     * $1: 調整済
     */
    public void setStockAdjustFlg_$1() {
        setStockAdjustFlgAsStockMoveFlg(CDef.StockMoveFlg.$1);
    }

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
     * Is the value of inputType $00? <br>
     * $00: 画面入力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$00() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$00) : false;
    }

    /**
     * Is the value of inputType $10? <br>
     * $10: アップロード
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$10() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$10) : false;
    }

    /**
     * Is the value of inputType $20? <br>
     * $20: EDI
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$20() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$20) : false;
    }

    /**
     * Is the value of inputType $30? <br>
     * $30: HT
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$30() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$30) : false;
    }

    /**
     * Is the value of stockAdjustFlg $0? <br>
     * $0: 未調整
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockAdjustFlg$0() {
        CDef.StockMoveFlg cdef = getStockAdjustFlgAsStockMoveFlg();
        return cdef != null ? cdef.equals(CDef.StockMoveFlg.$0) : false;
    }

    /**
     * Is the value of stockAdjustFlg $1? <br>
     * $1: 調整済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockAdjustFlg$1() {
        CDef.StockMoveFlg cdef = getStockAdjustFlgAsStockMoveFlg();
        return cdef != null ? cdef.equals(CDef.StockMoveFlg.$1) : false;
    }

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
     * Get the value of the column 'inputType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInputTypeName() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'stockAdjustFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStockAdjustFlgName() {
        CDef.StockMoveFlg cdef = getStockAdjustFlgAsStockMoveFlg();
        return cdef != null ? cdef.name() : null;
    }

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
    /** M_CUSTOMER by my DEPOSIT_ID, named 'MCustomerByDepositId'. */
    protected MCustomer _mCustomerByDepositId;

    /**
     * [get] M_CUSTOMER by my DEPOSIT_ID, named 'MCustomerByDepositId'. <br>
     * @return The entity of foreign property 'MCustomerByDepositId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerByDepositId() {
        return _mCustomerByDepositId;
    }

    /**
     * [set] M_CUSTOMER by my DEPOSIT_ID, named 'MCustomerByDepositId'.
     * @param mCustomerByDepositId The entity of foreign property 'MCustomerByDepositId'. (NullAllowed)
     */
    public void setMCustomerByDepositId(MCustomer mCustomerByDepositId) {
        _mCustomerByDepositId = mCustomerByDepositId;
    }

    /** T_INVENTORY_H by my INVENTORY_H_ID, named 'TInventoryH'. */
    protected TInventoryH _tInventoryH;

    /**
     * [get] T_INVENTORY_H by my INVENTORY_H_ID, named 'TInventoryH'. <br>
     * @return The entity of foreign property 'TInventoryH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TInventoryH getTInventoryH() {
        return _tInventoryH;
    }

    /**
     * [set] T_INVENTORY_H by my INVENTORY_H_ID, named 'TInventoryH'.
     * @param tInventoryH The entity of foreign property 'TInventoryH'. (NullAllowed)
     */
    public void setTInventoryH(TInventoryH tInventoryH) {
        _tInventoryH = tInventoryH;
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

    /** M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'. */
    protected MCustomer _mCustomerBySupplierId;

    /**
     * [get] M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'. <br>
     * @return The entity of foreign property 'MCustomerBySupplierId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerBySupplierId() {
        return _mCustomerBySupplierId;
    }

    /**
     * [set] M_CUSTOMER by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * @param mCustomerBySupplierId The entity of foreign property 'MCustomerBySupplierId'. (NullAllowed)
     */
    public void setMCustomerBySupplierId(MCustomer mCustomerBySupplierId) {
        _mCustomerBySupplierId = mCustomerBySupplierId;
    }

    /** T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'. */
    protected TMoveInstH _tMoveInstH;

    /**
     * [get] T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'. <br>
     * @return The entity of foreign property 'TMoveInstH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TMoveInstH getTMoveInstH() {
        return _tMoveInstH;
    }

    /**
     * [set] T_MOVE_INST_H by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @param tMoveInstH The entity of foreign property 'TMoveInstH'. (NullAllowed)
     */
    public void setTMoveInstH(TMoveInstH tMoveInstH) {
        _tMoveInstH = tMoveInstH;
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

    /** T_STOCK by my STOCK_ID, named 'TStock'. */
    protected TStock _tStock;

    /**
     * [get] T_STOCK by my STOCK_ID, named 'TStock'. <br>
     * @return The entity of foreign property 'TStock'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TStock getTStock() {
        return _tStock;
    }

    /**
     * [set] T_STOCK by my STOCK_ID, named 'TStock'.
     * @param tStock The entity of foreign property 'TStock'. (NullAllowed)
     */
    public void setTStock(TStock tStock) {
        _tStock = tStock;
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

    /** B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'. */
    protected BClassDtl _bClassDtlByInputType;

    /**
     * [get] B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'. <br>
     * @return The entity of foreign property 'BClassDtlByInputType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInputType() {
        return _bClassDtlByInputType;
    }

    /**
     * [set] B_CLASS_DTL by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @param bClassDtlByInputType The entity of foreign property 'BClassDtlByInputType'. (NullAllowed)
     */
    public void setBClassDtlByInputType(BClassDtl bClassDtlByInputType) {
        _bClassDtlByInputType = bClassDtlByInputType;
    }

    /** B_CLASS_DTL by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'. */
    protected BClassDtl _bClassDtlByStockAdjustFlg;

    /**
     * [get] B_CLASS_DTL by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStockAdjustFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStockAdjustFlg() {
        return _bClassDtlByStockAdjustFlg;
    }

    /**
     * [set] B_CLASS_DTL by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'.
     * @param bClassDtlByStockAdjustFlg The entity of foreign property 'BClassDtlByStockAdjustFlg'. (NullAllowed)
     */
    public void setBClassDtlByStockAdjustFlg(BClassDtl bClassDtlByStockAdjustFlg) {
        _bClassDtlByStockAdjustFlg = bClassDtlByStockAdjustFlg;
    }

    /** T_INVENTORY_R by INVENTORY_B_ID, named 'TInventoryRAsOne'. */
    protected TInventoryR _tInventoryRAsOne;

    /**
     * [get] T_INVENTORY_R by INVENTORY_B_ID, named 'TInventoryRAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'TInventoryRAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public TInventoryR getTInventoryRAsOne() {
        return _tInventoryRAsOne;
    }

    /**
     * [set] T_INVENTORY_R by INVENTORY_B_ID, named 'TInventoryRAsOne'.
     * @param TInventoryRAsOne The entity of foreign property(referrer-as-one) 'TInventoryRAsOne'. (NullAllowed)
     */
    public void setTInventoryRAsOne(TInventoryR TInventoryRAsOne) {
        _tInventoryRAsOne = TInventoryRAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_INVENTORY_INP_HIST by INVENTORY_B_ID, named 'TInventoryInpHistList'. */
    protected List<TInventoryInpHist> _tInventoryInpHistList;

    /**
     * [get] T_INVENTORY_INP_HIST by INVENTORY_B_ID, named 'TInventoryInpHistList'.
     * @return The entity list of referrer property 'TInventoryInpHistList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryInpHist> getTInventoryInpHistList() {
        if (_tInventoryInpHistList == null) { _tInventoryInpHistList = newReferrerList(); }
        return _tInventoryInpHistList;
    }

    /**
     * [set] T_INVENTORY_INP_HIST by INVENTORY_B_ID, named 'TInventoryInpHistList'.
     * @param tInventoryInpHistList The entity list of referrer property 'TInventoryInpHistList'. (NullAllowed)
     */
    public void setTInventoryInpHistList(List<TInventoryInpHist> tInventoryInpHistList) {
        _tInventoryInpHistList = tInventoryInpHistList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTInventoryB) {
            BsTInventoryB other = (BsTInventoryB)obj;
            if (!xSV(_inventoryBId, other._inventoryBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCustomerByDepositId != null)
        { sb.append(li).append(xbRDS(_mCustomerByDepositId, "mCustomerByDepositId")); }
        if (_tInventoryH != null)
        { sb.append(li).append(xbRDS(_tInventoryH, "tInventoryH")); }
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        if (_mLocation != null)
        { sb.append(li).append(xbRDS(_mLocation, "mLocation")); }
        if (_mWarehouse != null)
        { sb.append(li).append(xbRDS(_mWarehouse, "mWarehouse")); }
        if (_tStoreNo != null)
        { sb.append(li).append(xbRDS(_tStoreNo, "tStoreNo")); }
        if (_mCustomerBySupplierId != null)
        { sb.append(li).append(xbRDS(_mCustomerBySupplierId, "mCustomerBySupplierId")); }
        if (_tMoveInstH != null)
        { sb.append(li).append(xbRDS(_tMoveInstH, "tMoveInstH")); }
        if (_tLot != null)
        { sb.append(li).append(xbRDS(_tLot, "tLot")); }
        if (_tStock != null)
        { sb.append(li).append(xbRDS(_tStock, "tStock")); }
        if (_mShape != null)
        { sb.append(li).append(xbRDS(_mShape, "mShape")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_bClassDtlByInputType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInputType, "bClassDtlByInputType")); }
        if (_bClassDtlByStockAdjustFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStockAdjustFlg, "bClassDtlByStockAdjustFlg")); }
        if (_tInventoryRAsOne != null)
        { sb.append(li).append(xbRDS(_tInventoryRAsOne, "tInventoryRAsOne")); }
        if (_tInventoryInpHistList != null) { for (TInventoryInpHist et : _tInventoryInpHistList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryInpHistList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryBId));
        sb.append(dm).append(xfND(_inventoryHId));
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_depositId));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_storeNoId));
        sb.append(dm).append(xfND(_storeLabelNo));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_supplierId));
        sb.append(dm).append(xfND(_supplierCd));
        sb.append(dm).append(xfND(_shapeId));
        sb.append(dm).append(xfND(_unitNum));
        sb.append(dm).append(xfND(_chargeNum));
        sb.append(dm).append(xfND(_allocNum));
        sb.append(dm).append(xfND(_moveNum));
        sb.append(dm).append(xfND(_inventoryNum));
        sb.append(dm).append(xfND(_inputType));
        sb.append(dm).append(xfND(_stockAdjustFlg));
        sb.append(dm).append(xfND(_moveInstHId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_firmtransportCd));
        sb.append(dm).append(xfND(_manufactureDt));
        sb.append(dm).append(xfND(_manufactureSymbol));
        sb.append(dm).append(xfND(_fcflg));
        sb.append(dm).append(xfND(_diffqtyHenpin));
        sb.append(dm).append(xfND(_diffqtyTaxrefond));
        sb.append(dm).append(xfND(_suffererQty));
        sb.append(dm).append(xfND(_monthStatussu));
        sb.append(dm).append(xfND(_blukRecivedQty));
        sb.append(dm).append(xfND(_refunditemQty));
        sb.append(dm).append(xfND(_inventoryInputFlg));
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
        if (_mCustomerByDepositId != null)
        { sb.append(dm).append("mCustomerByDepositId"); }
        if (_tInventoryH != null)
        { sb.append(dm).append("tInventoryH"); }
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (_mLocation != null)
        { sb.append(dm).append("mLocation"); }
        if (_mWarehouse != null)
        { sb.append(dm).append("mWarehouse"); }
        if (_tStoreNo != null)
        { sb.append(dm).append("tStoreNo"); }
        if (_mCustomerBySupplierId != null)
        { sb.append(dm).append("mCustomerBySupplierId"); }
        if (_tMoveInstH != null)
        { sb.append(dm).append("tMoveInstH"); }
        if (_tLot != null)
        { sb.append(dm).append("tLot"); }
        if (_tStock != null)
        { sb.append(dm).append("tStock"); }
        if (_mShape != null)
        { sb.append(dm).append("mShape"); }
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_bClassDtlByInputType != null)
        { sb.append(dm).append("bClassDtlByInputType"); }
        if (_bClassDtlByStockAdjustFlg != null)
        { sb.append(dm).append("bClassDtlByStockAdjustFlg"); }
        if (_tInventoryRAsOne != null)
        { sb.append(dm).append("tInventoryRAsOne"); }
        if (_tInventoryInpHistList != null && !_tInventoryInpHistList.isEmpty())
        { sb.append(dm).append("tInventoryInpHistList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TInventoryB clone() {
        return (TInventoryB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryBId() {
        checkSpecifiedProperty("inventoryBId");
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryBId(Long inventoryBId) {
        registerModifiedProperty("inventoryBId");
        _inventoryBId = inventoryBId;
    }

    /**
     * [get] INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H} <br>
     * 棚卸ヘッダID
     * @return The value of the column 'INVENTORY_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryHId() {
        checkSpecifiedProperty("inventoryHId");
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H} <br>
     * 棚卸ヘッダID
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryHId(Long inventoryHId) {
        registerModifiedProperty("inventoryHId");
        _inventoryHId = inventoryHId;
    }

    /**
     * [get] STOCK_ID: {IX, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockId() {
        checkSpecifiedProperty("stockId");
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {IX, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockId(Long stockId) {
        registerModifiedProperty("stockId");
        _stockId = stockId;
    }

    /**
     * [get] WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE} <br>
     * 倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWarehouseId() {
        checkSpecifiedProperty("warehouseId");
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE} <br>
     * 倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseId(Long warehouseId) {
        registerModifiedProperty("warehouseId");
        _warehouseId = warehouseId;
    }

    /**
     * [get] PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockTypeId() {
        checkSpecifiedProperty("stockTypeId");
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeId(Long stockTypeId) {
        registerModifiedProperty("stockTypeId");
        _stockTypeId = stockTypeId;
    }

    /**
     * [get] LOCATION_ID: {IX, bigint(19), FK to M_LOCATION} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, bigint(19), FK to M_LOCATION} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 預託ID
     * @return The value of the column 'DEPOSIT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDepositId() {
        checkSpecifiedProperty("depositId");
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 預託ID
     * @param depositId The value of the column 'DEPOSIT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositId(Long depositId) {
        registerModifiedProperty("depositId");
        _depositId = depositId;
    }

    /**
     * [get] LOT_ID: {IX, bigint(19), FK to T_LOT} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, bigint(19), FK to T_LOT} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] LOT: {varchar(30)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {varchar(30)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMIT_DT: {varchar(8)} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] LIMIT_DT: {varchar(8)} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO} <br>
     * 入庫No.ID
     * @return The value of the column 'STORE_NO_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStoreNoId() {
        checkSpecifiedProperty("storeNoId");
        return _storeNoId;
    }

    /**
     * [set] STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO} <br>
     * 入庫No.ID
     * @param storeNoId The value of the column 'STORE_NO_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreNoId(Long storeNoId) {
        registerModifiedProperty("storeNoId");
        _storeNoId = storeNoId;
    }

    /**
     * [get] STORE_LABEL_NO: {IX, varchar(30)} <br>
     * 入庫ラベルNo.
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreLabelNo() {
        checkSpecifiedProperty("storeLabelNo");
        return convertEmptyToNull(_storeLabelNo);
    }

    /**
     * [set] STORE_LABEL_NO: {IX, varchar(30)} <br>
     * 入庫ラベルNo.
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        registerModifiedProperty("storeLabelNo");
        _storeLabelNo = storeLabelNo;
    }

    /**
     * [get] STORE_DT: {varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'STORE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreDt() {
        checkSpecifiedProperty("storeDt");
        return convertEmptyToNull(_storeDt);
    }

    /**
     * [set] STORE_DT: {varchar(8)} <br>
     * 入庫日
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreDt(String storeDt) {
        registerModifiedProperty("storeDt");
        _storeDt = storeDt;
    }

    /**
     * [get] SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 仕入先ID
     * @return The value of the column 'SUPPLIER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSupplierId() {
        checkSpecifiedProperty("supplierId");
        return _supplierId;
    }

    /**
     * [set] SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER} <br>
     * 仕入先ID
     * @param supplierId The value of the column 'SUPPLIER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierId(Long supplierId) {
        registerModifiedProperty("supplierId");
        _supplierId = supplierId;
    }

    /**
     * [get] SUPPLIER_CD: {varchar(30)} <br>
     * 仕入先CD
     * @return The value of the column 'SUPPLIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierCd() {
        checkSpecifiedProperty("supplierCd");
        return convertEmptyToNull(_supplierCd);
    }

    /**
     * [set] SUPPLIER_CD: {varchar(30)} <br>
     * 仕入先CD
     * @param supplierCd The value of the column 'SUPPLIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierCd(String supplierCd) {
        registerModifiedProperty("supplierCd");
        _supplierCd = supplierCd;
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
     * [get] INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 棚卸数
     * @return The value of the column 'INVENTORY_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getInventoryNum() {
        checkSpecifiedProperty("inventoryNum");
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 棚卸数
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        registerModifiedProperty("inventoryNum");
        _inventoryNum = inventoryNum;
    }

    /**
     * [get] INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInputType() {
        checkSpecifiedProperty("inputType");
        return convertEmptyToNull(_inputType);
    }

    /**
     * [set] INPUT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInputType(String inputType) {
        registerModifiedProperty("inputType");
        _inputType = inputType;
    }

    /**
     * [get] STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @return The value of the column 'STOCK_ADJUST_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getStockAdjustFlg() {
        checkSpecifiedProperty("stockAdjustFlg");
        return convertEmptyToNull(_stockAdjustFlg);
    }

    /**
     * [set] STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @param stockAdjustFlg The value of the column 'STOCK_ADJUST_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setStockAdjustFlg(String stockAdjustFlg) {
        registerModifiedProperty("stockAdjustFlg");
        _stockAdjustFlg = stockAdjustFlg;
    }

    /**
     * [get] MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H} <br>
     * 在庫移動指示ヘッダID
     * @return The value of the column 'MOVE_INST_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMoveInstHId() {
        checkSpecifiedProperty("moveInstHId");
        return _moveInstHId;
    }

    /**
     * [set] MOVE_INST_H_ID: {IX, bigint(19), FK to T_MOVE_INST_H} <br>
     * 在庫移動指示ヘッダID
     * @param moveInstHId The value of the column 'MOVE_INST_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveInstHId(Long moveInstHId) {
        registerModifiedProperty("moveInstHId");
        _moveInstHId = moveInstHId;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] FIRMTRANSPORT_CD: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMTRANSPORT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirmtransportCd() {
        checkSpecifiedProperty("firmtransportCd");
        return convertEmptyToNull(_firmtransportCd);
    }

    /**
     * [set] FIRMTRANSPORT_CD: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmtransportCd The value of the column 'FIRMTRANSPORT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirmtransportCd(String firmtransportCd) {
        registerModifiedProperty("firmtransportCd");
        _firmtransportCd = firmtransportCd;
    }

    /**
     * [get] MANUFACTURE_DT: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTURE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufactureDt() {
        checkSpecifiedProperty("manufactureDt");
        return convertEmptyToNull(_manufactureDt);
    }

    /**
     * [set] MANUFACTURE_DT: {varchar(8)} <br>
     * 製造年月日
     * @param manufactureDt The value of the column 'MANUFACTURE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufactureDt(String manufactureDt) {
        registerModifiedProperty("manufactureDt");
        _manufactureDt = manufactureDt;
    }

    /**
     * [get] MANUFACTURE_SYMBOL: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURE_SYMBOL'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufactureSymbol() {
        checkSpecifiedProperty("manufactureSymbol");
        return convertEmptyToNull(_manufactureSymbol);
    }

    /**
     * [set] MANUFACTURE_SYMBOL: {varchar(30)} <br>
     * 製造記号
     * @param manufactureSymbol The value of the column 'MANUFACTURE_SYMBOL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufactureSymbol(String manufactureSymbol) {
        registerModifiedProperty("manufactureSymbol");
        _manufactureSymbol = manufactureSymbol;
    }

    /**
     * [get] FCFLG: {varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'FCFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getFcflg() {
        checkSpecifiedProperty("fcflg");
        return convertEmptyToNull(_fcflg);
    }

    /**
     * [set] FCFLG: {varchar(30)} <br>
     * 内外区分
     * @param fcflg The value of the column 'FCFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFcflg(String fcflg) {
        registerModifiedProperty("fcflg");
        _fcflg = fcflg;
    }

    /**
     * [get] DIFFQTY_HENPIN: {bigint(19)} <br>
     * 累計過不足数_返品
     * @return The value of the column 'DIFFQTY_HENPIN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDiffqtyHenpin() {
        checkSpecifiedProperty("diffqtyHenpin");
        return _diffqtyHenpin;
    }

    /**
     * [set] DIFFQTY_HENPIN: {bigint(19)} <br>
     * 累計過不足数_返品
     * @param diffqtyHenpin The value of the column 'DIFFQTY_HENPIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDiffqtyHenpin(Long diffqtyHenpin) {
        registerModifiedProperty("diffqtyHenpin");
        _diffqtyHenpin = diffqtyHenpin;
    }

    /**
     * [get] DIFFQTY_TAXREFOND: {bigint(19)} <br>
     * 累計過不足数_国税還付品
     * @return The value of the column 'DIFFQTY_TAXREFOND'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDiffqtyTaxrefond() {
        checkSpecifiedProperty("diffqtyTaxrefond");
        return _diffqtyTaxrefond;
    }

    /**
     * [set] DIFFQTY_TAXREFOND: {bigint(19)} <br>
     * 累計過不足数_国税還付品
     * @param diffqtyTaxrefond The value of the column 'DIFFQTY_TAXREFOND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDiffqtyTaxrefond(Long diffqtyTaxrefond) {
        registerModifiedProperty("diffqtyTaxrefond");
        _diffqtyTaxrefond = diffqtyTaxrefond;
    }

    /**
     * [get] SUFFERER_QTY: {bigint(19)} <br>
     * り災品
     * @return The value of the column 'SUFFERER_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSuffererQty() {
        checkSpecifiedProperty("suffererQty");
        return _suffererQty;
    }

    /**
     * [set] SUFFERER_QTY: {bigint(19)} <br>
     * り災品
     * @param suffererQty The value of the column 'SUFFERER_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuffererQty(Long suffererQty) {
        registerModifiedProperty("suffererQty");
        _suffererQty = suffererQty;
    }

    /**
     * [get] MONTH_STATUSSU: {bigint(19)} <br>
     * 不適品ラベル作成個装数
     * @return The value of the column 'MONTH_STATUSSU'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMonthStatussu() {
        checkSpecifiedProperty("monthStatussu");
        return _monthStatussu;
    }

    /**
     * [set] MONTH_STATUSSU: {bigint(19)} <br>
     * 不適品ラベル作成個装数
     * @param monthStatussu The value of the column 'MONTH_STATUSSU'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMonthStatussu(Long monthStatussu) {
        registerModifiedProperty("monthStatussu");
        _monthStatussu = monthStatussu;
    }

    /**
     * [get] BLUK_RECIVED_QTY: {bigint(19)} <br>
     * 一括登録個装数
     * @return The value of the column 'BLUK_RECIVED_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBlukRecivedQty() {
        checkSpecifiedProperty("blukRecivedQty");
        return _blukRecivedQty;
    }

    /**
     * [set] BLUK_RECIVED_QTY: {bigint(19)} <br>
     * 一括登録個装数
     * @param blukRecivedQty The value of the column 'BLUK_RECIVED_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBlukRecivedQty(Long blukRecivedQty) {
        registerModifiedProperty("blukRecivedQty");
        _blukRecivedQty = blukRecivedQty;
    }

    /**
     * [get] REFUNDITEM_QTY: {bigint(19)} <br>
     * 国税還付品数
     * @return The value of the column 'REFUNDITEM_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRefunditemQty() {
        checkSpecifiedProperty("refunditemQty");
        return _refunditemQty;
    }

    /**
     * [set] REFUNDITEM_QTY: {bigint(19)} <br>
     * 国税還付品数
     * @param refunditemQty The value of the column 'REFUNDITEM_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRefunditemQty(Long refunditemQty) {
        registerModifiedProperty("refunditemQty");
        _refunditemQty = refunditemQty;
    }

    /**
     * [get] INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]} <br>
     * 入力フラグ
     * @return The value of the column 'INVENTORY_INPUT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getInventoryInputFlg() {
        checkSpecifiedProperty("inventoryInputFlg");
        return convertEmptyToNull(_inventoryInputFlg);
    }

    /**
     * [set] INVENTORY_INPUT_FLG: {NotNull, char(1), default=[0]} <br>
     * 入力フラグ
     * @param inventoryInputFlg The value of the column 'INVENTORY_INPUT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryInputFlg(String inventoryInputFlg) {
        registerModifiedProperty("inventoryInputFlg");
        _inventoryInputFlg = inventoryInputFlg;
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
