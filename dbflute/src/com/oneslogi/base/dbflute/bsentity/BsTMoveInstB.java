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
 * The entity of T_MOVE_INST_B as TABLE. <br>
 * 在庫移動指示ボディ
 * <pre>
 * [primary-key]
 *     MOVE_INST_B_ID
 *
 * [column]
 *     MOVE_INST_B_ID, MOVE_INST_H_ID, MOVE_INST_STATUS, INOUT_TYPE, WAREHOUSE_ID, WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, STOCK_TYPE_ID, STOCK_TYPE_CD, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, DEPOSIT_CD, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, STORE_DT, SUPPLIER_ID, SUPPLIER_CD, SHAPE_ID, SHAPE_CD, UNIT_NUM, INST_NUM, LOT1, LOT2, LOT3, LOT4, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, TRANCEPORT_CD, SOURCE_CD, SOURCE_NM, SCH_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_MOVE_INST_H, M_WAREHOUSE, T_LOT, M_LOCATION, M_SHAPE, M_PRODUCT, M_STOCK_TYPE, T_STORE_NO, M_CUSTOMER, B_CLASS_DTL(ByInoutType), T_MOVE_INST_B_SUB(AsOne)
 *
 * [referrer table]
 *     T_MOVE_RECORD_B, T_MOVE_INST_B_SUB
 *
 * [foreign property]
 *     tMoveInstH, mWarehouse, tLot, mLocation, mShape, mProduct, mStockType, tStoreNo, mCustomerBySupplierId, mCustomerByDepositId, bClassDtlByInoutType, bClassDtlByMoveInstStatus, tMoveInstBSubAsOne
 *
 * [referrer property]
 *     tMoveRecordBList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long moveInstBId = entity.getMoveInstBId();
 * Long moveInstHId = entity.getMoveInstHId();
 * String moveInstStatus = entity.getMoveInstStatus();
 * String inoutType = entity.getInoutType();
 * Long warehouseId = entity.getWarehouseId();
 * String warehouseCd = entity.getWarehouseCd();
 * Long productId = entity.getProductId();
 * String productCd = entity.getProductCd();
 * Long stockTypeId = entity.getStockTypeId();
 * String stockTypeCd = entity.getStockTypeCd();
 * Long locationId = entity.getLocationId();
 * String locationCd = entity.getLocationCd();
 * Long depositId = entity.getDepositId();
 * String depositCd = entity.getDepositCd();
 * Long lotId = entity.getLotId();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * Long storeNoId = entity.getStoreNoId();
 * String storeLabelNo = entity.getStoreLabelNo();
 * String storeDt = entity.getStoreDt();
 * Long supplierId = entity.getSupplierId();
 * String supplierCd = entity.getSupplierCd();
 * Long shapeId = entity.getShapeId();
 * String shapeCd = entity.getShapeCd();
 * Long unitNum = entity.getUnitNum();
 * java.math.BigDecimal instNum = entity.getInstNum();
 * String lot1 = entity.getLot1();
 * String lot2 = entity.getLot2();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String damageflg = entity.getDamageflg();
 * String noshippingflg = entity.getNoshippingflg();
 * String foreigncargoflg = entity.getForeigncargoflg();
 * String customsreleaseflg = entity.getCustomsreleaseflg();
 * String taxflg = entity.getTaxflg();
 * String tranceportCd = entity.getTranceportCd();
 * String sourceCd = entity.getSourceCd();
 * String sourceNm = entity.getSourceNm();
 * String schDt = entity.getSchDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setMoveInstBId(moveInstBId);
 * entity.setMoveInstHId(moveInstHId);
 * entity.setMoveInstStatus(moveInstStatus);
 * entity.setInoutType(inoutType);
 * entity.setWarehouseId(warehouseId);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setProductId(productId);
 * entity.setProductCd(productCd);
 * entity.setStockTypeId(stockTypeId);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setLocationId(locationId);
 * entity.setLocationCd(locationCd);
 * entity.setDepositId(depositId);
 * entity.setDepositCd(depositCd);
 * entity.setLotId(lotId);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setStoreNoId(storeNoId);
 * entity.setStoreLabelNo(storeLabelNo);
 * entity.setStoreDt(storeDt);
 * entity.setSupplierId(supplierId);
 * entity.setSupplierCd(supplierCd);
 * entity.setShapeId(shapeId);
 * entity.setShapeCd(shapeCd);
 * entity.setUnitNum(unitNum);
 * entity.setInstNum(instNum);
 * entity.setLot1(lot1);
 * entity.setLot2(lot2);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setDamageflg(damageflg);
 * entity.setNoshippingflg(noshippingflg);
 * entity.setForeigncargoflg(foreigncargoflg);
 * entity.setCustomsreleaseflg(customsreleaseflg);
 * entity.setTaxflg(taxflg);
 * entity.setTranceportCd(tranceportCd);
 * entity.setSourceCd(sourceCd);
 * entity.setSourceNm(sourceNm);
 * entity.setSchDt(schDt);
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
public abstract class BsTMoveInstB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _moveInstBId;

    /** MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H} */
    protected Long _moveInstHId;

    /** MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus} */
    protected String _moveInstStatus;

    /** INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} */
    protected String _inoutType;

    /** WAREHOUSE_ID: {IX, bigint(19), FK to M_WAREHOUSE} */
    protected Long _warehouseId;

    /** WAREHOUSE_CD: {varchar(30)} */
    protected String _warehouseCd;

    /** PRODUCT_ID: {IX, bigint(19), FK to M_PRODUCT} */
    protected Long _productId;

    /** PRODUCT_CD: {IX, varchar(100)} */
    protected String _productCd;

    /** STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} */
    protected Long _stockTypeId;

    /** STOCK_TYPE_CD: {varchar(30)} */
    protected String _stockTypeCd;

    /** LOCATION_ID: {IX, bigint(19), FK to M_LOCATION} */
    protected Long _locationId;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    protected Long _depositId;

    /** DEPOSIT_CD: {varchar(30)} */
    protected String _depositCd;

    /** LOT_ID: {IX, bigint(19), FK to T_LOT} */
    protected Long _lotId;

    /** LOT: {varchar(30)} */
    protected String _lot;

    /** LIMIT_DT: {varchar(8)} */
    protected String _limitDt;

    /** STORE_NO_ID: {IX, bigint(19), FK to T_STORE_NO} */
    protected Long _storeNoId;

    /** STORE_LABEL_NO: {varchar(30)} */
    protected String _storeLabelNo;

    /** STORE_DT: {varchar(8)} */
    protected String _storeDt;

    /** SUPPLIER_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    protected Long _supplierId;

    /** SUPPLIER_CD: {varchar(30)} */
    protected String _supplierCd;

    /** SHAPE_ID: {IX, bigint(19), FK to M_SHAPE} */
    protected Long _shapeId;

    /** SHAPE_CD: {varchar(30)} */
    protected String _shapeCd;

    /** UNIT_NUM: {bigint(19)} */
    protected Long _unitNum;

    /** INST_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _instNum;

    /** LOT1: {varchar(255)} */
    protected String _lot1;

    /** LOT2: {varchar(255)} */
    protected String _lot2;

    /** LOT3: {varchar(255)} */
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** DAMAGEFLG: {NotNull, char(1)} */
    protected String _damageflg;

    /** NOSHIPPINGFLG: {NotNull, char(1)} */
    protected String _noshippingflg;

    /** FOREIGNCARGOFLG: {NotNull, char(1)} */
    protected String _foreigncargoflg;

    /** CUSTOMSRELEASEFLG: {NotNull, char(1)} */
    protected String _customsreleaseflg;

    /** TAXFLG: {NotNull, char(1)} */
    protected String _taxflg;

    /** TRANCEPORT_CD: {varchar(30)} */
    protected String _tranceportCd;

    /** SOURCE_CD: {varchar(30)} */
    protected String _sourceCd;

    /** SOURCE_NM: {varchar(60)} */
    protected String _sourceNm;

    /** SCH_DT: {varchar(8)} */
    protected String _schDt;

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
        return "T_MOVE_INST_B";
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
        if (_moveInstBId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of moveInstStatus as the classification of MoveInstStatus. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus} <br>
     * 在庫移動指示ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MoveInstStatus getMoveInstStatusAsMoveInstStatus() {
        return CDef.MoveInstStatus.codeOf(getMoveInstStatus());
    }

    /**
     * Set the value of moveInstStatus as the classification of MoveInstStatus. <br>
     * MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus} <br>
     * 在庫移動指示ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMoveInstStatusAsMoveInstStatus(CDef.MoveInstStatus cdef) {
        setMoveInstStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of inoutType as the classification of InoutType. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InoutType getInoutTypeAsInoutType() {
        return CDef.InoutType.codeOf(getInoutType());
    }

    /**
     * Set the value of inoutType as the classification of InoutType. <br>
     * INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInoutTypeAsInoutType(CDef.InoutType cdef) {
        setInoutType(cdef != null ? cdef.code() : null);
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
     * Set the value of moveInstStatus as $00 (00). <br>
     * $00: 未作業
     */
    public void setMoveInstStatus_$00() {
        setMoveInstStatusAsMoveInstStatus(CDef.MoveInstStatus.$00);
    }

    /**
     * Set the value of moveInstStatus as $01 (01). <br>
     * $01: 作業中
     */
    public void setMoveInstStatus_$01() {
        setMoveInstStatusAsMoveInstStatus(CDef.MoveInstStatus.$01);
    }

    /**
     * Set the value of moveInstStatus as $02 (02). <br>
     * $02: 完了
     */
    public void setMoveInstStatus_$02() {
        setMoveInstStatusAsMoveInstStatus(CDef.MoveInstStatus.$02);
    }

    /**
     * Set the value of moveInstStatus as $99 (99). <br>
     * $99: 取消
     */
    public void setMoveInstStatus_$99() {
        setMoveInstStatusAsMoveInstStatus(CDef.MoveInstStatus.$99);
    }

    /**
     * Set the value of inoutType as $0 (0). <br>
     * $0: 入庫
     */
    public void setInoutType_$0() {
        setInoutTypeAsInoutType(CDef.InoutType.$0);
    }

    /**
     * Set the value of inoutType as $1 (1). <br>
     * $1: 出庫
     */
    public void setInoutType_$1() {
        setInoutTypeAsInoutType(CDef.InoutType.$1);
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
     * Is the value of moveInstStatus $00? <br>
     * $00: 未作業
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMoveInstStatus$00() {
        CDef.MoveInstStatus cdef = getMoveInstStatusAsMoveInstStatus();
        return cdef != null ? cdef.equals(CDef.MoveInstStatus.$00) : false;
    }

    /**
     * Is the value of moveInstStatus $01? <br>
     * $01: 作業中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMoveInstStatus$01() {
        CDef.MoveInstStatus cdef = getMoveInstStatusAsMoveInstStatus();
        return cdef != null ? cdef.equals(CDef.MoveInstStatus.$01) : false;
    }

    /**
     * Is the value of moveInstStatus $02? <br>
     * $02: 完了
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMoveInstStatus$02() {
        CDef.MoveInstStatus cdef = getMoveInstStatusAsMoveInstStatus();
        return cdef != null ? cdef.equals(CDef.MoveInstStatus.$02) : false;
    }

    /**
     * Is the value of moveInstStatus $99? <br>
     * $99: 取消
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMoveInstStatus$99() {
        CDef.MoveInstStatus cdef = getMoveInstStatusAsMoveInstStatus();
        return cdef != null ? cdef.equals(CDef.MoveInstStatus.$99) : false;
    }

    /**
     * Is the value of inoutType $0? <br>
     * $0: 入庫
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInoutType$0() {
        CDef.InoutType cdef = getInoutTypeAsInoutType();
        return cdef != null ? cdef.equals(CDef.InoutType.$0) : false;
    }

    /**
     * Is the value of inoutType $1? <br>
     * $1: 出庫
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInoutType$1() {
        CDef.InoutType cdef = getInoutTypeAsInoutType();
        return cdef != null ? cdef.equals(CDef.InoutType.$1) : false;
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
     * Get the value of the column 'moveInstStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMoveInstStatusName() {
        CDef.MoveInstStatus cdef = getMoveInstStatusAsMoveInstStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'inoutType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInoutTypeName() {
        CDef.InoutType cdef = getInoutTypeAsInoutType();
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

    /** B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'. */
    protected BClassDtl _bClassDtlByInoutType;

    /**
     * [get] B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'. <br>
     * @return The entity of foreign property 'BClassDtlByInoutType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInoutType() {
        return _bClassDtlByInoutType;
    }

    /**
     * [set] B_CLASS_DTL by my INOUT_TYPE, named 'BClassDtlByInoutType'.
     * @param bClassDtlByInoutType The entity of foreign property 'BClassDtlByInoutType'. (NullAllowed)
     */
    public void setBClassDtlByInoutType(BClassDtl bClassDtlByInoutType) {
        _bClassDtlByInoutType = bClassDtlByInoutType;
    }

    /** B_CLASS_DTL by my MOVE_INST_STATUS, named 'BClassDtlByMoveInstStatus'. */
    protected BClassDtl _bClassDtlByMoveInstStatus;

    /**
     * [get] B_CLASS_DTL by my MOVE_INST_STATUS, named 'BClassDtlByMoveInstStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByMoveInstStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByMoveInstStatus() {
        return _bClassDtlByMoveInstStatus;
    }

    /**
     * [set] B_CLASS_DTL by my MOVE_INST_STATUS, named 'BClassDtlByMoveInstStatus'.
     * @param bClassDtlByMoveInstStatus The entity of foreign property 'BClassDtlByMoveInstStatus'. (NullAllowed)
     */
    public void setBClassDtlByMoveInstStatus(BClassDtl bClassDtlByMoveInstStatus) {
        _bClassDtlByMoveInstStatus = bClassDtlByMoveInstStatus;
    }

    /** T_MOVE_INST_B_SUB by T_MOVE_INST_B_SUB_ID, named 'TMoveInstBSubAsOne'. */
    protected TMoveInstBSub _tMoveInstBSubAsOne;

    /**
     * [get] T_MOVE_INST_B_SUB by T_MOVE_INST_B_SUB_ID, named 'TMoveInstBSubAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'TMoveInstBSubAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public TMoveInstBSub getTMoveInstBSubAsOne() {
        return _tMoveInstBSubAsOne;
    }

    /**
     * [set] T_MOVE_INST_B_SUB by T_MOVE_INST_B_SUB_ID, named 'TMoveInstBSubAsOne'.
     * @param TMoveInstBSubAsOne The entity of foreign property(referrer-as-one) 'TMoveInstBSubAsOne'. (NullAllowed)
     */
    public void setTMoveInstBSubAsOne(TMoveInstBSub TMoveInstBSubAsOne) {
        _tMoveInstBSubAsOne = TMoveInstBSubAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_MOVE_RECORD_B by MOVE_INST_B_ID, named 'TMoveRecordBList'. */
    protected List<TMoveRecordB> _tMoveRecordBList;

    /**
     * [get] T_MOVE_RECORD_B by MOVE_INST_B_ID, named 'TMoveRecordBList'.
     * @return The entity list of referrer property 'TMoveRecordBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveRecordB> getTMoveRecordBList() {
        if (_tMoveRecordBList == null) { _tMoveRecordBList = newReferrerList(); }
        return _tMoveRecordBList;
    }

    /**
     * [set] T_MOVE_RECORD_B by MOVE_INST_B_ID, named 'TMoveRecordBList'.
     * @param tMoveRecordBList The entity list of referrer property 'TMoveRecordBList'. (NullAllowed)
     */
    public void setTMoveRecordBList(List<TMoveRecordB> tMoveRecordBList) {
        _tMoveRecordBList = tMoveRecordBList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTMoveInstB) {
            BsTMoveInstB other = (BsTMoveInstB)obj;
            if (!xSV(_moveInstBId, other._moveInstBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _moveInstBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tMoveInstH != null)
        { sb.append(li).append(xbRDS(_tMoveInstH, "tMoveInstH")); }
        if (_mWarehouse != null)
        { sb.append(li).append(xbRDS(_mWarehouse, "mWarehouse")); }
        if (_tLot != null)
        { sb.append(li).append(xbRDS(_tLot, "tLot")); }
        if (_mLocation != null)
        { sb.append(li).append(xbRDS(_mLocation, "mLocation")); }
        if (_mShape != null)
        { sb.append(li).append(xbRDS(_mShape, "mShape")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        if (_tStoreNo != null)
        { sb.append(li).append(xbRDS(_tStoreNo, "tStoreNo")); }
        if (_mCustomerBySupplierId != null)
        { sb.append(li).append(xbRDS(_mCustomerBySupplierId, "mCustomerBySupplierId")); }
        if (_mCustomerByDepositId != null)
        { sb.append(li).append(xbRDS(_mCustomerByDepositId, "mCustomerByDepositId")); }
        if (_bClassDtlByInoutType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInoutType, "bClassDtlByInoutType")); }
        if (_bClassDtlByMoveInstStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByMoveInstStatus, "bClassDtlByMoveInstStatus")); }
        if (_tMoveInstBSubAsOne != null)
        { sb.append(li).append(xbRDS(_tMoveInstBSubAsOne, "tMoveInstBSubAsOne")); }
        if (_tMoveRecordBList != null) { for (TMoveRecordB et : _tMoveRecordBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveRecordBList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_moveInstBId));
        sb.append(dm).append(xfND(_moveInstHId));
        sb.append(dm).append(xfND(_moveInstStatus));
        sb.append(dm).append(xfND(_inoutType));
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_depositId));
        sb.append(dm).append(xfND(_depositCd));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_storeNoId));
        sb.append(dm).append(xfND(_storeLabelNo));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_supplierId));
        sb.append(dm).append(xfND(_supplierCd));
        sb.append(dm).append(xfND(_shapeId));
        sb.append(dm).append(xfND(_shapeCd));
        sb.append(dm).append(xfND(_unitNum));
        sb.append(dm).append(xfND(_instNum));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_damageflg));
        sb.append(dm).append(xfND(_noshippingflg));
        sb.append(dm).append(xfND(_foreigncargoflg));
        sb.append(dm).append(xfND(_customsreleaseflg));
        sb.append(dm).append(xfND(_taxflg));
        sb.append(dm).append(xfND(_tranceportCd));
        sb.append(dm).append(xfND(_sourceCd));
        sb.append(dm).append(xfND(_sourceNm));
        sb.append(dm).append(xfND(_schDt));
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
        if (_tMoveInstH != null)
        { sb.append(dm).append("tMoveInstH"); }
        if (_mWarehouse != null)
        { sb.append(dm).append("mWarehouse"); }
        if (_tLot != null)
        { sb.append(dm).append("tLot"); }
        if (_mLocation != null)
        { sb.append(dm).append("mLocation"); }
        if (_mShape != null)
        { sb.append(dm).append("mShape"); }
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (_tStoreNo != null)
        { sb.append(dm).append("tStoreNo"); }
        if (_mCustomerBySupplierId != null)
        { sb.append(dm).append("mCustomerBySupplierId"); }
        if (_mCustomerByDepositId != null)
        { sb.append(dm).append("mCustomerByDepositId"); }
        if (_bClassDtlByInoutType != null)
        { sb.append(dm).append("bClassDtlByInoutType"); }
        if (_bClassDtlByMoveInstStatus != null)
        { sb.append(dm).append("bClassDtlByMoveInstStatus"); }
        if (_tMoveInstBSubAsOne != null)
        { sb.append(dm).append("tMoveInstBSubAsOne"); }
        if (_tMoveRecordBList != null && !_tMoveRecordBList.isEmpty())
        { sb.append(dm).append("tMoveRecordBList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TMoveInstB clone() {
        return (TMoveInstB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫移動指示ボディID
     * @return The value of the column 'MOVE_INST_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMoveInstBId() {
        checkSpecifiedProperty("moveInstBId");
        return _moveInstBId;
    }

    /**
     * [set] MOVE_INST_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫移動指示ボディID
     * @param moveInstBId The value of the column 'MOVE_INST_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMoveInstBId(Long moveInstBId) {
        registerModifiedProperty("moveInstBId");
        _moveInstBId = moveInstBId;
    }

    /**
     * [get] MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H} <br>
     * 在庫移動指示ヘッダID
     * @return The value of the column 'MOVE_INST_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMoveInstHId() {
        checkSpecifiedProperty("moveInstHId");
        return _moveInstHId;
    }

    /**
     * [set] MOVE_INST_H_ID: {IX, NotNull, bigint(19), FK to T_MOVE_INST_H} <br>
     * 在庫移動指示ヘッダID
     * @param moveInstHId The value of the column 'MOVE_INST_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMoveInstHId(Long moveInstHId) {
        registerModifiedProperty("moveInstHId");
        _moveInstHId = moveInstHId;
    }

    /**
     * [get] MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus} <br>
     * 在庫移動指示ステータス
     * @return The value of the column 'MOVE_INST_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getMoveInstStatus() {
        checkSpecifiedProperty("moveInstStatus");
        return convertEmptyToNull(_moveInstStatus);
    }

    /**
     * [set] MOVE_INST_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=MoveInstStatus} <br>
     * 在庫移動指示ステータス
     * @param moveInstStatus The value of the column 'MOVE_INST_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveInstStatus(String moveInstStatus) {
        registerModifiedProperty("moveInstStatus");
        _moveInstStatus = moveInstStatus;
    }

    /**
     * [get] INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @return The value of the column 'INOUT_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getInoutType() {
        checkSpecifiedProperty("inoutType");
        return convertEmptyToNull(_inoutType);
    }

    /**
     * [set] INOUT_TYPE: {NotNull, char(1), FK to B_CLASS_DTL, classification=InoutType} <br>
     * 入出庫区分
     * @param inoutType The value of the column 'INOUT_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setInoutType(String inoutType) {
        registerModifiedProperty("inoutType");
        _inoutType = inoutType;
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
     * [get] WAREHOUSE_CD: {varchar(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(30)} <br>
     * 倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
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
     * [get] PRODUCT_CD: {IX, varchar(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {IX, varchar(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
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
     * [get] STOCK_TYPE_CD: {varchar(30)} <br>
     * 在庫区分CD
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(30)} <br>
     * 在庫区分CD
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
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
     * [get] LOCATION_CD: {varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
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
     * [get] DEPOSIT_CD: {varchar(30)} <br>
     * 預託CD
     * @return The value of the column 'DEPOSIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositCd() {
        checkSpecifiedProperty("depositCd");
        return convertEmptyToNull(_depositCd);
    }

    /**
     * [set] DEPOSIT_CD: {varchar(30)} <br>
     * 預託CD
     * @param depositCd The value of the column 'DEPOSIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositCd(String depositCd) {
        registerModifiedProperty("depositCd");
        _depositCd = depositCd;
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
     * [get] STORE_LABEL_NO: {varchar(30)} <br>
     * 入庫ラベルNo.
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreLabelNo() {
        checkSpecifiedProperty("storeLabelNo");
        return convertEmptyToNull(_storeLabelNo);
    }

    /**
     * [set] STORE_LABEL_NO: {varchar(30)} <br>
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
     * [get] SHAPE_CD: {varchar(30)} <br>
     * 荷姿CD
     * @return The value of the column 'SHAPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShapeCd() {
        checkSpecifiedProperty("shapeCd");
        return convertEmptyToNull(_shapeCd);
    }

    /**
     * [set] SHAPE_CD: {varchar(30)} <br>
     * 荷姿CD
     * @param shapeCd The value of the column 'SHAPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeCd(String shapeCd) {
        registerModifiedProperty("shapeCd");
        _shapeCd = shapeCd;
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
     * [get] INST_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 指示数
     * @return The value of the column 'INST_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getInstNum() {
        checkSpecifiedProperty("instNum");
        return _instNum;
    }

    /**
     * [set] INST_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 指示数
     * @param instNum The value of the column 'INST_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        registerModifiedProperty("instNum");
        _instNum = instNum;
    }

    /**
     * [get] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(255)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(255)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
    }

    /**
     * [get] LOT3: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(255)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot4(String lot4) {
        registerModifiedProperty("lot4");
        _lot4 = lot4;
    }

    /**
     * [get] DAMAGEFLG: {NotNull, char(1)} <br>
     * 良品・不良品区分
     * @return The value of the column 'DAMAGEFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDamageflg() {
        checkSpecifiedProperty("damageflg");
        return convertEmptyToNull(_damageflg);
    }

    /**
     * [set] DAMAGEFLG: {NotNull, char(1)} <br>
     * 良品・不良品区分
     * @param damageflg The value of the column 'DAMAGEFLG'. (basically NotNull if update: for the constraint)
     */
    public void setDamageflg(String damageflg) {
        registerModifiedProperty("damageflg");
        _damageflg = damageflg;
    }

    /**
     * [get] NOSHIPPINGFLG: {NotNull, char(1)} <br>
     * 出庫禁止フラグ
     * @return The value of the column 'NOSHIPPINGFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getNoshippingflg() {
        checkSpecifiedProperty("noshippingflg");
        return convertEmptyToNull(_noshippingflg);
    }

    /**
     * [set] NOSHIPPINGFLG: {NotNull, char(1)} <br>
     * 出庫禁止フラグ
     * @param noshippingflg The value of the column 'NOSHIPPINGFLG'. (basically NotNull if update: for the constraint)
     */
    public void setNoshippingflg(String noshippingflg) {
        registerModifiedProperty("noshippingflg");
        _noshippingflg = noshippingflg;
    }

    /**
     * [get] FOREIGNCARGOFLG: {NotNull, char(1)} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getForeigncargoflg() {
        checkSpecifiedProperty("foreigncargoflg");
        return convertEmptyToNull(_foreigncargoflg);
    }

    /**
     * [set] FOREIGNCARGOFLG: {NotNull, char(1)} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (basically NotNull if update: for the constraint)
     */
    public void setForeigncargoflg(String foreigncargoflg) {
        registerModifiedProperty("foreigncargoflg");
        _foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] CUSTOMSRELEASEFLG: {NotNull, char(1)} <br>
     * 通関済みフラグ
     * @return The value of the column 'CUSTOMSRELEASEFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getCustomsreleaseflg() {
        checkSpecifiedProperty("customsreleaseflg");
        return convertEmptyToNull(_customsreleaseflg);
    }

    /**
     * [set] CUSTOMSRELEASEFLG: {NotNull, char(1)} <br>
     * 通関済みフラグ
     * @param customsreleaseflg The value of the column 'CUSTOMSRELEASEFLG'. (basically NotNull if update: for the constraint)
     */
    public void setCustomsreleaseflg(String customsreleaseflg) {
        registerModifiedProperty("customsreleaseflg");
        _customsreleaseflg = customsreleaseflg;
    }

    /**
     * [get] TAXFLG: {NotNull, char(1)} <br>
     * 税区分
     * @return The value of the column 'TAXFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getTaxflg() {
        checkSpecifiedProperty("taxflg");
        return convertEmptyToNull(_taxflg);
    }

    /**
     * [set] TAXFLG: {NotNull, char(1)} <br>
     * 税区分
     * @param taxflg The value of the column 'TAXFLG'. (basically NotNull if update: for the constraint)
     */
    public void setTaxflg(String taxflg) {
        registerModifiedProperty("taxflg");
        _taxflg = taxflg;
    }

    /**
     * [get] TRANCEPORT_CD: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANCEPORT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTranceportCd() {
        checkSpecifiedProperty("tranceportCd");
        return convertEmptyToNull(_tranceportCd);
    }

    /**
     * [set] TRANCEPORT_CD: {varchar(30)} <br>
     * 輸送番号
     * @param tranceportCd The value of the column 'TRANCEPORT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTranceportCd(String tranceportCd) {
        registerModifiedProperty("tranceportCd");
        _tranceportCd = tranceportCd;
    }

    /**
     * [get] SOURCE_CD: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SOURCE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSourceCd() {
        checkSpecifiedProperty("sourceCd");
        return convertEmptyToNull(_sourceCd);
    }

    /**
     * [set] SOURCE_CD: {varchar(30)} <br>
     * 発送元CD
     * @param sourceCd The value of the column 'SOURCE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSourceCd(String sourceCd) {
        registerModifiedProperty("sourceCd");
        _sourceCd = sourceCd;
    }

    /**
     * [get] SOURCE_NM: {varchar(60)} <br>
     * 発送元名称
     * @return The value of the column 'SOURCE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSourceNm() {
        checkSpecifiedProperty("sourceNm");
        return convertEmptyToNull(_sourceNm);
    }

    /**
     * [set] SOURCE_NM: {varchar(60)} <br>
     * 発送元名称
     * @param sourceNm The value of the column 'SOURCE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSourceNm(String sourceNm) {
        registerModifiedProperty("sourceNm");
        _sourceNm = sourceNm;
    }

    /**
     * [get] SCH_DT: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCH_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getSchDt() {
        checkSpecifiedProperty("schDt");
        return convertEmptyToNull(_schDt);
    }

    /**
     * [set] SCH_DT: {varchar(8)} <br>
     * 発送予定日
     * @param schDt The value of the column 'SCH_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSchDt(String schDt) {
        registerModifiedProperty("schDt");
        _schDt = schDt;
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
