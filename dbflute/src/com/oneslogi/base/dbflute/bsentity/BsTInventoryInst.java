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
 * The entity of T_INVENTORY_INST as TABLE. <br>
 * 棚卸指示
 * <pre>
 * [primary-key]
 *     INVENTORY_INST_ID
 *
 * [column]
 *     INVENTORY_INST_ID, INVENTORY_H_ID, DEPOSIT_ID, STOCK_TYPE_ID, FROM_LOCATION_CD, TO_LOCATION_CD, ZONE_ID, FROM_STOCK_INOUT_DT, TO_STOCK_INOUT_DT, STOCK_EXIST_ONLY_FLG, INVENTORY_INST_KBN, LINE_BLOCK, DIRECTIONAL_PISTON, SORTING_ORDER, SORTING_NUM_TIMES, LOCATION_CD, PRODUCT_CD, PRODUCT_DIVISION, LOCATION_GRP, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_INST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_STOCK_TYPE, M_ZONE, T_INVENTORY_H, M_CUSTOMER, B_CLASS_DTL(ByStockExistOnlyFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mStockType, mZone, tInventoryH, mCustomer, bClassDtlByStockExistOnlyFlg
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long inventoryInstId = entity.getInventoryInstId();
 * Long inventoryHId = entity.getInventoryHId();
 * Long depositId = entity.getDepositId();
 * Long stockTypeId = entity.getStockTypeId();
 * String fromLocationCd = entity.getFromLocationCd();
 * String toLocationCd = entity.getToLocationCd();
 * Long zoneId = entity.getZoneId();
 * String fromStockInoutDt = entity.getFromStockInoutDt();
 * String toStockInoutDt = entity.getToStockInoutDt();
 * String stockExistOnlyFlg = entity.getStockExistOnlyFlg();
 * String inventoryInstKbn = entity.getInventoryInstKbn();
 * String lineBlock = entity.getLineBlock();
 * String directionalPiston = entity.getDirectionalPiston();
 * String sortingOrder = entity.getSortingOrder();
 * Long sortingNumTimes = entity.getSortingNumTimes();
 * String locationCd = entity.getLocationCd();
 * String productCd = entity.getProductCd();
 * String productDivision = entity.getProductDivision();
 * String locationGrp = entity.getLocationGrp();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setInventoryInstId(inventoryInstId);
 * entity.setInventoryHId(inventoryHId);
 * entity.setDepositId(depositId);
 * entity.setStockTypeId(stockTypeId);
 * entity.setFromLocationCd(fromLocationCd);
 * entity.setToLocationCd(toLocationCd);
 * entity.setZoneId(zoneId);
 * entity.setFromStockInoutDt(fromStockInoutDt);
 * entity.setToStockInoutDt(toStockInoutDt);
 * entity.setStockExistOnlyFlg(stockExistOnlyFlg);
 * entity.setInventoryInstKbn(inventoryInstKbn);
 * entity.setLineBlock(lineBlock);
 * entity.setDirectionalPiston(directionalPiston);
 * entity.setSortingOrder(sortingOrder);
 * entity.setSortingNumTimes(sortingNumTimes);
 * entity.setLocationCd(locationCd);
 * entity.setProductCd(productCd);
 * entity.setProductDivision(productDivision);
 * entity.setLocationGrp(locationGrp);
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
public abstract class BsTInventoryInst extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _inventoryInstId;

    /** INVENTORY_H_ID: {IX, NotNull, bigint(19), FK to T_INVENTORY_H} */
    protected Long _inventoryHId;

    /** DEPOSIT_ID: {IX, bigint(19), FK to M_CUSTOMER} */
    protected Long _depositId;

    /** STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} */
    protected Long _stockTypeId;

    /** FROM_LOCATION_CD: {varchar(30)} */
    protected String _fromLocationCd;

    /** TO_LOCATION_CD: {varchar(30)} */
    protected String _toLocationCd;

    /** ZONE_ID: {IX, bigint(19), FK to M_ZONE} */
    protected Long _zoneId;

    /** FROM_STOCK_INOUT_DT: {varchar(8)} */
    protected String _fromStockInoutDt;

    /** TO_STOCK_INOUT_DT: {varchar(8)} */
    protected String _toStockInoutDt;

    /** STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} */
    protected String _stockExistOnlyFlg;

    /** INVENTORY_INST_KBN: {NotNull, varchar(30)} */
    protected String _inventoryInstKbn;

    /** LINE_BLOCK: {varchar(30)} */
    protected String _lineBlock;

    /** DIRECTIONAL_PISTON: {varchar(255)} */
    protected String _directionalPiston;

    /** SORTING_ORDER: {varchar(255)} */
    protected String _sortingOrder;

    /** SORTING_NUM_TIMES: {bigint(19)} */
    protected Long _sortingNumTimes;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** PRODUCT_DIVISION: {varchar(30)} */
    protected String _productDivision;

    /** LOCATION_GRP: {varchar(30)} */
    protected String _locationGrp;

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
        return "T_INVENTORY_INST";
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
        if (_inventoryInstId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of stockExistOnlyFlg as the classification of StockExistOnlyFlg. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StockExistOnlyFlg getStockExistOnlyFlgAsStockExistOnlyFlg() {
        return CDef.StockExistOnlyFlg.codeOf(getStockExistOnlyFlg());
    }

    /**
     * Set the value of stockExistOnlyFlg as the classification of StockExistOnlyFlg. <br>
     * STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStockExistOnlyFlgAsStockExistOnlyFlg(CDef.StockExistOnlyFlg cdef) {
        setStockExistOnlyFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of stockExistOnlyFlg as $0 (0). <br>
     * $0: 全て
     */
    public void setStockExistOnlyFlg_$0() {
        setStockExistOnlyFlgAsStockExistOnlyFlg(CDef.StockExistOnlyFlg.$0);
    }

    /**
     * Set the value of stockExistOnlyFlg as $1 (1). <br>
     * $1: 在庫有のみ
     */
    public void setStockExistOnlyFlg_$1() {
        setStockExistOnlyFlgAsStockExistOnlyFlg(CDef.StockExistOnlyFlg.$1);
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
     * Is the value of stockExistOnlyFlg $0? <br>
     * $0: 全て
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockExistOnlyFlg$0() {
        CDef.StockExistOnlyFlg cdef = getStockExistOnlyFlgAsStockExistOnlyFlg();
        return cdef != null ? cdef.equals(CDef.StockExistOnlyFlg.$0) : false;
    }

    /**
     * Is the value of stockExistOnlyFlg $1? <br>
     * $1: 在庫有のみ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockExistOnlyFlg$1() {
        CDef.StockExistOnlyFlg cdef = getStockExistOnlyFlgAsStockExistOnlyFlg();
        return cdef != null ? cdef.equals(CDef.StockExistOnlyFlg.$1) : false;
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
     * Get the value of the column 'stockExistOnlyFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStockExistOnlyFlgName() {
        CDef.StockExistOnlyFlg cdef = getStockExistOnlyFlgAsStockExistOnlyFlg();
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

    /** M_ZONE by my ZONE_ID, named 'MZone'. */
    protected MZone _mZone;

    /**
     * [get] M_ZONE by my ZONE_ID, named 'MZone'. <br>
     * @return The entity of foreign property 'MZone'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MZone getMZone() {
        return _mZone;
    }

    /**
     * [set] M_ZONE by my ZONE_ID, named 'MZone'.
     * @param mZone The entity of foreign property 'MZone'. (NullAllowed)
     */
    public void setMZone(MZone mZone) {
        _mZone = mZone;
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

    /** B_CLASS_DTL by my STOCK_EXIST_ONLY_FLG, named 'BClassDtlByStockExistOnlyFlg'. */
    protected BClassDtl _bClassDtlByStockExistOnlyFlg;

    /**
     * [get] B_CLASS_DTL by my STOCK_EXIST_ONLY_FLG, named 'BClassDtlByStockExistOnlyFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStockExistOnlyFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStockExistOnlyFlg() {
        return _bClassDtlByStockExistOnlyFlg;
    }

    /**
     * [set] B_CLASS_DTL by my STOCK_EXIST_ONLY_FLG, named 'BClassDtlByStockExistOnlyFlg'.
     * @param bClassDtlByStockExistOnlyFlg The entity of foreign property 'BClassDtlByStockExistOnlyFlg'. (NullAllowed)
     */
    public void setBClassDtlByStockExistOnlyFlg(BClassDtl bClassDtlByStockExistOnlyFlg) {
        _bClassDtlByStockExistOnlyFlg = bClassDtlByStockExistOnlyFlg;
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
        if (obj instanceof BsTInventoryInst) {
            BsTInventoryInst other = (BsTInventoryInst)obj;
            if (!xSV(_inventoryInstId, other._inventoryInstId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryInstId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        if (_mZone != null)
        { sb.append(li).append(xbRDS(_mZone, "mZone")); }
        if (_tInventoryH != null)
        { sb.append(li).append(xbRDS(_tInventoryH, "tInventoryH")); }
        if (_mCustomer != null)
        { sb.append(li).append(xbRDS(_mCustomer, "mCustomer")); }
        if (_bClassDtlByStockExistOnlyFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStockExistOnlyFlg, "bClassDtlByStockExistOnlyFlg")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryInstId));
        sb.append(dm).append(xfND(_inventoryHId));
        sb.append(dm).append(xfND(_depositId));
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_fromLocationCd));
        sb.append(dm).append(xfND(_toLocationCd));
        sb.append(dm).append(xfND(_zoneId));
        sb.append(dm).append(xfND(_fromStockInoutDt));
        sb.append(dm).append(xfND(_toStockInoutDt));
        sb.append(dm).append(xfND(_stockExistOnlyFlg));
        sb.append(dm).append(xfND(_inventoryInstKbn));
        sb.append(dm).append(xfND(_lineBlock));
        sb.append(dm).append(xfND(_directionalPiston));
        sb.append(dm).append(xfND(_sortingOrder));
        sb.append(dm).append(xfND(_sortingNumTimes));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productDivision));
        sb.append(dm).append(xfND(_locationGrp));
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
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (_mZone != null)
        { sb.append(dm).append("mZone"); }
        if (_tInventoryH != null)
        { sb.append(dm).append("tInventoryH"); }
        if (_mCustomer != null)
        { sb.append(dm).append("mCustomer"); }
        if (_bClassDtlByStockExistOnlyFlg != null)
        { sb.append(dm).append("bClassDtlByStockExistOnlyFlg"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TInventoryInst clone() {
        return (TInventoryInst)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚卸指示ID
     * @return The value of the column 'INVENTORY_INST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryInstId() {
        checkSpecifiedProperty("inventoryInstId");
        return _inventoryInstId;
    }

    /**
     * [set] INVENTORY_INST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚卸指示ID
     * @param inventoryInstId The value of the column 'INVENTORY_INST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryInstId(Long inventoryInstId) {
        registerModifiedProperty("inventoryInstId");
        _inventoryInstId = inventoryInstId;
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
     * [get] FROM_LOCATION_CD: {varchar(30)} <br>
     * FROMロケーションCD
     * @return The value of the column 'FROM_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromLocationCd() {
        checkSpecifiedProperty("fromLocationCd");
        return convertEmptyToNull(_fromLocationCd);
    }

    /**
     * [set] FROM_LOCATION_CD: {varchar(30)} <br>
     * FROMロケーションCD
     * @param fromLocationCd The value of the column 'FROM_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromLocationCd(String fromLocationCd) {
        registerModifiedProperty("fromLocationCd");
        _fromLocationCd = fromLocationCd;
    }

    /**
     * [get] TO_LOCATION_CD: {varchar(30)} <br>
     * TOロケーションCD
     * @return The value of the column 'TO_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getToLocationCd() {
        checkSpecifiedProperty("toLocationCd");
        return convertEmptyToNull(_toLocationCd);
    }

    /**
     * [set] TO_LOCATION_CD: {varchar(30)} <br>
     * TOロケーションCD
     * @param toLocationCd The value of the column 'TO_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToLocationCd(String toLocationCd) {
        registerModifiedProperty("toLocationCd");
        _toLocationCd = toLocationCd;
    }

    /**
     * [get] ZONE_ID: {IX, bigint(19), FK to M_ZONE} <br>
     * ゾーンID
     * @return The value of the column 'ZONE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZoneId() {
        checkSpecifiedProperty("zoneId");
        return _zoneId;
    }

    /**
     * [set] ZONE_ID: {IX, bigint(19), FK to M_ZONE} <br>
     * ゾーンID
     * @param zoneId The value of the column 'ZONE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneId(Long zoneId) {
        registerModifiedProperty("zoneId");
        _zoneId = zoneId;
    }

    /**
     * [get] FROM_STOCK_INOUT_DT: {varchar(8)} <br>
     * FROM受払日
     * @return The value of the column 'FROM_STOCK_INOUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromStockInoutDt() {
        checkSpecifiedProperty("fromStockInoutDt");
        return convertEmptyToNull(_fromStockInoutDt);
    }

    /**
     * [set] FROM_STOCK_INOUT_DT: {varchar(8)} <br>
     * FROM受払日
     * @param fromStockInoutDt The value of the column 'FROM_STOCK_INOUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromStockInoutDt(String fromStockInoutDt) {
        registerModifiedProperty("fromStockInoutDt");
        _fromStockInoutDt = fromStockInoutDt;
    }

    /**
     * [get] TO_STOCK_INOUT_DT: {varchar(8)} <br>
     * TO受払日
     * @return The value of the column 'TO_STOCK_INOUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getToStockInoutDt() {
        checkSpecifiedProperty("toStockInoutDt");
        return convertEmptyToNull(_toStockInoutDt);
    }

    /**
     * [set] TO_STOCK_INOUT_DT: {varchar(8)} <br>
     * TO受払日
     * @param toStockInoutDt The value of the column 'TO_STOCK_INOUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToStockInoutDt(String toStockInoutDt) {
        registerModifiedProperty("toStockInoutDt");
        _toStockInoutDt = toStockInoutDt;
    }

    /**
     * [get] STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @return The value of the column 'STOCK_EXIST_ONLY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockExistOnlyFlg() {
        checkSpecifiedProperty("stockExistOnlyFlg");
        return convertEmptyToNull(_stockExistOnlyFlg);
    }

    /**
     * [set] STOCK_EXIST_ONLY_FLG: {char(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @param stockExistOnlyFlg The value of the column 'STOCK_EXIST_ONLY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockExistOnlyFlg(String stockExistOnlyFlg) {
        registerModifiedProperty("stockExistOnlyFlg");
        _stockExistOnlyFlg = stockExistOnlyFlg;
    }

    /**
     * [get] INVENTORY_INST_KBN: {NotNull, varchar(30)} <br>
     * 在庫調査区分
     * @return The value of the column 'INVENTORY_INST_KBN'. (basically NotNull if selected: for the constraint)
     */
    public String getInventoryInstKbn() {
        checkSpecifiedProperty("inventoryInstKbn");
        return convertEmptyToNull(_inventoryInstKbn);
    }

    /**
     * [set] INVENTORY_INST_KBN: {NotNull, varchar(30)} <br>
     * 在庫調査区分
     * @param inventoryInstKbn The value of the column 'INVENTORY_INST_KBN'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryInstKbn(String inventoryInstKbn) {
        registerModifiedProperty("inventoryInstKbn");
        _inventoryInstKbn = inventoryInstKbn;
    }

    /**
     * [get] LINE_BLOCK: {varchar(30)} <br>
     * ライン/ブロック
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineBlock() {
        checkSpecifiedProperty("lineBlock");
        return convertEmptyToNull(_lineBlock);
    }

    /**
     * [set] LINE_BLOCK: {varchar(30)} <br>
     * ライン/ブロック
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineBlock(String lineBlock) {
        registerModifiedProperty("lineBlock");
        _lineBlock = lineBlock;
    }

    /**
     * [get] DIRECTIONAL_PISTON: {varchar(255)} <br>
     * 方面ピストン
     * @return The value of the column 'DIRECTIONAL_PISTON'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectionalPiston() {
        checkSpecifiedProperty("directionalPiston");
        return convertEmptyToNull(_directionalPiston);
    }

    /**
     * [set] DIRECTIONAL_PISTON: {varchar(255)} <br>
     * 方面ピストン
     * @param directionalPiston The value of the column 'DIRECTIONAL_PISTON'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionalPiston(String directionalPiston) {
        registerModifiedProperty("directionalPiston");
        _directionalPiston = directionalPiston;
    }

    /**
     * [get] SORTING_ORDER: {varchar(255)} <br>
     * 仕分順
     * @return The value of the column 'SORTING_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortingOrder() {
        checkSpecifiedProperty("sortingOrder");
        return convertEmptyToNull(_sortingOrder);
    }

    /**
     * [set] SORTING_ORDER: {varchar(255)} <br>
     * 仕分順
     * @param sortingOrder The value of the column 'SORTING_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortingOrder(String sortingOrder) {
        registerModifiedProperty("sortingOrder");
        _sortingOrder = sortingOrder;
    }

    /**
     * [get] SORTING_NUM_TIMES: {bigint(19)} <br>
     * 仕分回数
     * @return The value of the column 'SORTING_NUM_TIMES'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSortingNumTimes() {
        checkSpecifiedProperty("sortingNumTimes");
        return _sortingNumTimes;
    }

    /**
     * [set] SORTING_NUM_TIMES: {bigint(19)} <br>
     * 仕分回数
     * @param sortingNumTimes The value of the column 'SORTING_NUM_TIMES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortingNumTimes(Long sortingNumTimes) {
        registerModifiedProperty("sortingNumTimes");
        _sortingNumTimes = sortingNumTimes;
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
     * [get] PRODUCT_DIVISION: {varchar(30)} <br>
     * 銘柄区分
     * @return The value of the column 'PRODUCT_DIVISION'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductDivision() {
        checkSpecifiedProperty("productDivision");
        return convertEmptyToNull(_productDivision);
    }

    /**
     * [set] PRODUCT_DIVISION: {varchar(30)} <br>
     * 銘柄区分
     * @param productDivision The value of the column 'PRODUCT_DIVISION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductDivision(String productDivision) {
        registerModifiedProperty("productDivision");
        _productDivision = productDivision;
    }

    /**
     * [get] LOCATION_GRP: {varchar(30)} <br>
     * ロケーショングループ
     * @return The value of the column 'LOCATION_GRP'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationGrp() {
        checkSpecifiedProperty("locationGrp");
        return convertEmptyToNull(_locationGrp);
    }

    /**
     * [set] LOCATION_GRP: {varchar(30)} <br>
     * ロケーショングループ
     * @param locationGrp The value of the column 'LOCATION_GRP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationGrp(String locationGrp) {
        registerModifiedProperty("locationGrp");
        _locationGrp = locationGrp;
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
