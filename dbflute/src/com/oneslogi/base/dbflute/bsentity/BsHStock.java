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
 * The entity of H_STOCK as TABLE. <br>
 * 在庫履歴
 * <pre>
 * [primary-key]
 *     STOCK_ID
 *
 * [column]
 *     STOCK_ID, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, WAREHOUSE_ID, WAREHOUSE_CD, WAREHOUSE_NM, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, STOCK_TYPE_ID, ZONE_ID, ZONE_CD, ZONE_NM, LOCATION_ID, LOCATION_CD, LOCATION_NM, DEPOSIT_ID, DEPOSIT_CD, DEPOSIT_NM, DEPOSIT_ABBR, LOT_ID, LOT, LIMIT_DT, SHAPE_ID, STORE_NO_ID, STORE_LABEL_NO, OLD_STORE_NUM_ID, OLD_STORE_LABEL_NO, SUPPLIER_ID, SUPPLIER_CD, SUPPLIER_NM, SUPPLIER_ABBR, STORE_DT, UNIT_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     M_SHAPE, M_STOCK_TYPE
 *
 * [referrer table]
 *     H_INVENTORY_B, H_MOVE_B, H_PACKING_B, H_RECEIVE_B, H_STOCK_INOUT, H_STOCK_REPORT
 *
 * [foreign property]
 *     mShape, mStockType
 *
 * [referrer property]
 *     hInventoryBList, hMoveBList, hPackingBList, hReceiveBList, hStockInoutList, hStockReportList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long stockId = entity.getStockId();
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * Long warehouseId = entity.getWarehouseId();
 * String warehouseCd = entity.getWarehouseCd();
 * String warehouseNm = entity.getWarehouseNm();
 * Long productId = entity.getProductId();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String productAbbr = entity.getProductAbbr();
 * String janCd = entity.getJanCd();
 * Long stockTypeId = entity.getStockTypeId();
 * Long zoneId = entity.getZoneId();
 * String zoneCd = entity.getZoneCd();
 * String zoneNm = entity.getZoneNm();
 * Long locationId = entity.getLocationId();
 * String locationCd = entity.getLocationCd();
 * String locationNm = entity.getLocationNm();
 * Long depositId = entity.getDepositId();
 * String depositCd = entity.getDepositCd();
 * String depositNm = entity.getDepositNm();
 * String depositAbbr = entity.getDepositAbbr();
 * Long lotId = entity.getLotId();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * Long shapeId = entity.getShapeId();
 * Long storeNoId = entity.getStoreNoId();
 * String storeLabelNo = entity.getStoreLabelNo();
 * Long oldStoreNumId = entity.getOldStoreNumId();
 * String oldStoreLabelNo = entity.getOldStoreLabelNo();
 * Long supplierId = entity.getSupplierId();
 * String supplierCd = entity.getSupplierCd();
 * String supplierNm = entity.getSupplierNm();
 * String supplierAbbr = entity.getSupplierAbbr();
 * String storeDt = entity.getStoreDt();
 * Long unitNum = entity.getUnitNum();
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
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setWarehouseId(warehouseId);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setWarehouseNm(warehouseNm);
 * entity.setProductId(productId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setProductAbbr(productAbbr);
 * entity.setJanCd(janCd);
 * entity.setStockTypeId(stockTypeId);
 * entity.setZoneId(zoneId);
 * entity.setZoneCd(zoneCd);
 * entity.setZoneNm(zoneNm);
 * entity.setLocationId(locationId);
 * entity.setLocationCd(locationCd);
 * entity.setLocationNm(locationNm);
 * entity.setDepositId(depositId);
 * entity.setDepositCd(depositCd);
 * entity.setDepositNm(depositNm);
 * entity.setDepositAbbr(depositAbbr);
 * entity.setLotId(lotId);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setShapeId(shapeId);
 * entity.setStoreNoId(storeNoId);
 * entity.setStoreLabelNo(storeLabelNo);
 * entity.setOldStoreNumId(oldStoreNumId);
 * entity.setOldStoreLabelNo(oldStoreLabelNo);
 * entity.setSupplierId(supplierId);
 * entity.setSupplierCd(supplierCd);
 * entity.setSupplierNm(supplierNm);
 * entity.setSupplierAbbr(supplierAbbr);
 * entity.setStoreDt(storeDt);
 * entity.setUnitNum(unitNum);
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
public abstract class BsHStock extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

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

    /** WAREHOUSE_ID: {NotNull, bigint(19)} */
    protected Long _warehouseId;

    /** WAREHOUSE_CD: {varchar(30)} */
    protected String _warehouseCd;

    /** WAREHOUSE_NM: {varchar(60)} */
    protected String _warehouseNm;

    /** PRODUCT_ID: {NotNull, bigint(19)} */
    protected Long _productId;

    /** PRODUCT_CD: {IX, varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** PRODUCT_ABBR: {varchar(60)} */
    protected String _productAbbr;

    /** JAN_CD: {IX, varchar(30)} */
    protected String _janCd;

    /** STOCK_TYPE_ID: {IX, NotNull, bigint(19), FK to M_STOCK_TYPE} */
    protected Long _stockTypeId;

    /** ZONE_ID: {bigint(19)} */
    protected Long _zoneId;

    /** ZONE_CD: {varchar(30)} */
    protected String _zoneCd;

    /** ZONE_NM: {varchar(60)} */
    protected String _zoneNm;

    /** LOCATION_ID: {NotNull, bigint(19)} */
    protected Long _locationId;

    /** LOCATION_CD: {IX, varchar(30)} */
    protected String _locationCd;

    /** LOCATION_NM: {varchar(60)} */
    protected String _locationNm;

    /** DEPOSIT_ID: {NotNull, bigint(19)} */
    protected Long _depositId;

    /** DEPOSIT_CD: {IX, varchar(30)} */
    protected String _depositCd;

    /** DEPOSIT_NM: {varchar(60)} */
    protected String _depositNm;

    /** DEPOSIT_ABBR: {varchar(60)} */
    protected String _depositAbbr;

    /** LOT_ID: {NotNull, bigint(19)} */
    protected Long _lotId;

    /** LOT: {IX, varchar(30)} */
    protected String _lot;

    /** LIMIT_DT: {IX, varchar(8)} */
    protected String _limitDt;

    /** SHAPE_ID: {IX, bigint(19), FK to M_SHAPE} */
    protected Long _shapeId;

    /** STORE_NO_ID: {NotNull, bigint(19)} */
    protected Long _storeNoId;

    /** STORE_LABEL_NO: {varchar(30)} */
    protected String _storeLabelNo;

    /** OLD_STORE_NUM_ID: {bigint(19)} */
    protected Long _oldStoreNumId;

    /** OLD_STORE_LABEL_NO: {varchar(30)} */
    protected String _oldStoreLabelNo;

    /** SUPPLIER_ID: {bigint(19)} */
    protected Long _supplierId;

    /** SUPPLIER_CD: {varchar(30)} */
    protected String _supplierCd;

    /** SUPPLIER_NM: {varchar(60)} */
    protected String _supplierNm;

    /** SUPPLIER_ABBR: {varchar(60)} */
    protected String _supplierAbbr;

    /** STORE_DT: {varchar(8)} */
    protected String _storeDt;

    /** UNIT_NUM: {bigint(19)} */
    protected Long _unitNum;

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
        return "H_STOCK";
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

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** H_INVENTORY_B by STOCK_ID, named 'HInventoryBList'. */
    protected List<HInventoryB> _hInventoryBList;

    /**
     * [get] H_INVENTORY_B by STOCK_ID, named 'HInventoryBList'.
     * @return The entity list of referrer property 'HInventoryBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HInventoryB> getHInventoryBList() {
        if (_hInventoryBList == null) { _hInventoryBList = newReferrerList(); }
        return _hInventoryBList;
    }

    /**
     * [set] H_INVENTORY_B by STOCK_ID, named 'HInventoryBList'.
     * @param hInventoryBList The entity list of referrer property 'HInventoryBList'. (NullAllowed)
     */
    public void setHInventoryBList(List<HInventoryB> hInventoryBList) {
        _hInventoryBList = hInventoryBList;
    }

    /** H_MOVE_B by STOCK_ID, named 'HMoveBList'. */
    protected List<HMoveB> _hMoveBList;

    /**
     * [get] H_MOVE_B by STOCK_ID, named 'HMoveBList'.
     * @return The entity list of referrer property 'HMoveBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HMoveB> getHMoveBList() {
        if (_hMoveBList == null) { _hMoveBList = newReferrerList(); }
        return _hMoveBList;
    }

    /**
     * [set] H_MOVE_B by STOCK_ID, named 'HMoveBList'.
     * @param hMoveBList The entity list of referrer property 'HMoveBList'. (NullAllowed)
     */
    public void setHMoveBList(List<HMoveB> hMoveBList) {
        _hMoveBList = hMoveBList;
    }

    /** H_PACKING_B by STOCK_ID, named 'HPackingBList'. */
    protected List<HPackingB> _hPackingBList;

    /**
     * [get] H_PACKING_B by STOCK_ID, named 'HPackingBList'.
     * @return The entity list of referrer property 'HPackingBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HPackingB> getHPackingBList() {
        if (_hPackingBList == null) { _hPackingBList = newReferrerList(); }
        return _hPackingBList;
    }

    /**
     * [set] H_PACKING_B by STOCK_ID, named 'HPackingBList'.
     * @param hPackingBList The entity list of referrer property 'HPackingBList'. (NullAllowed)
     */
    public void setHPackingBList(List<HPackingB> hPackingBList) {
        _hPackingBList = hPackingBList;
    }

    /** H_RECEIVE_B by STOCK_ID, named 'HReceiveBList'. */
    protected List<HReceiveB> _hReceiveBList;

    /**
     * [get] H_RECEIVE_B by STOCK_ID, named 'HReceiveBList'.
     * @return The entity list of referrer property 'HReceiveBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HReceiveB> getHReceiveBList() {
        if (_hReceiveBList == null) { _hReceiveBList = newReferrerList(); }
        return _hReceiveBList;
    }

    /**
     * [set] H_RECEIVE_B by STOCK_ID, named 'HReceiveBList'.
     * @param hReceiveBList The entity list of referrer property 'HReceiveBList'. (NullAllowed)
     */
    public void setHReceiveBList(List<HReceiveB> hReceiveBList) {
        _hReceiveBList = hReceiveBList;
    }

    /** H_STOCK_INOUT by STOCK_ID, named 'HStockInoutList'. */
    protected List<HStockInout> _hStockInoutList;

    /**
     * [get] H_STOCK_INOUT by STOCK_ID, named 'HStockInoutList'.
     * @return The entity list of referrer property 'HStockInoutList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HStockInout> getHStockInoutList() {
        if (_hStockInoutList == null) { _hStockInoutList = newReferrerList(); }
        return _hStockInoutList;
    }

    /**
     * [set] H_STOCK_INOUT by STOCK_ID, named 'HStockInoutList'.
     * @param hStockInoutList The entity list of referrer property 'HStockInoutList'. (NullAllowed)
     */
    public void setHStockInoutList(List<HStockInout> hStockInoutList) {
        _hStockInoutList = hStockInoutList;
    }

    /** H_STOCK_REPORT by STOCK_ID, named 'HStockReportList'. */
    protected List<HStockReport> _hStockReportList;

    /**
     * [get] H_STOCK_REPORT by STOCK_ID, named 'HStockReportList'.
     * @return The entity list of referrer property 'HStockReportList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HStockReport> getHStockReportList() {
        if (_hStockReportList == null) { _hStockReportList = newReferrerList(); }
        return _hStockReportList;
    }

    /**
     * [set] H_STOCK_REPORT by STOCK_ID, named 'HStockReportList'.
     * @param hStockReportList The entity list of referrer property 'HStockReportList'. (NullAllowed)
     */
    public void setHStockReportList(List<HStockReport> hStockReportList) {
        _hStockReportList = hStockReportList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsHStock) {
            BsHStock other = (BsHStock)obj;
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
        if (_mShape != null)
        { sb.append(li).append(xbRDS(_mShape, "mShape")); }
        if (_mStockType != null)
        { sb.append(li).append(xbRDS(_mStockType, "mStockType")); }
        if (_hInventoryBList != null) { for (HInventoryB et : _hInventoryBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hInventoryBList")); } } }
        if (_hMoveBList != null) { for (HMoveB et : _hMoveBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hMoveBList")); } } }
        if (_hPackingBList != null) { for (HPackingB et : _hPackingBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hPackingBList")); } } }
        if (_hReceiveBList != null) { for (HReceiveB et : _hReceiveBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hReceiveBList")); } } }
        if (_hStockInoutList != null) { for (HStockInout et : _hStockInoutList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hStockInoutList")); } } }
        if (_hStockReportList != null) { for (HStockReport et : _hStockReportList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hStockReportList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_warehouseId));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_warehouseNm));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_zoneId));
        sb.append(dm).append(xfND(_zoneCd));
        sb.append(dm).append(xfND(_zoneNm));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_locationNm));
        sb.append(dm).append(xfND(_depositId));
        sb.append(dm).append(xfND(_depositCd));
        sb.append(dm).append(xfND(_depositNm));
        sb.append(dm).append(xfND(_depositAbbr));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_shapeId));
        sb.append(dm).append(xfND(_storeNoId));
        sb.append(dm).append(xfND(_storeLabelNo));
        sb.append(dm).append(xfND(_oldStoreNumId));
        sb.append(dm).append(xfND(_oldStoreLabelNo));
        sb.append(dm).append(xfND(_supplierId));
        sb.append(dm).append(xfND(_supplierCd));
        sb.append(dm).append(xfND(_supplierNm));
        sb.append(dm).append(xfND(_supplierAbbr));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_unitNum));
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
        if (_mShape != null)
        { sb.append(dm).append("mShape"); }
        if (_mStockType != null)
        { sb.append(dm).append("mStockType"); }
        if (_hInventoryBList != null && !_hInventoryBList.isEmpty())
        { sb.append(dm).append("hInventoryBList"); }
        if (_hMoveBList != null && !_hMoveBList.isEmpty())
        { sb.append(dm).append("hMoveBList"); }
        if (_hPackingBList != null && !_hPackingBList.isEmpty())
        { sb.append(dm).append("hPackingBList"); }
        if (_hReceiveBList != null && !_hReceiveBList.isEmpty())
        { sb.append(dm).append("hReceiveBList"); }
        if (_hStockInoutList != null && !_hStockInoutList.isEmpty())
        { sb.append(dm).append("hStockInoutList"); }
        if (_hStockReportList != null && !_hStockReportList.isEmpty())
        { sb.append(dm).append("hStockReportList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public HStock clone() {
        return (HStock)super.clone();
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
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * 荷主名称
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * 荷主名称
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * 拠点名称
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * 拠点名称
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] WAREHOUSE_ID: {NotNull, bigint(19)} <br>
     * 倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getWarehouseId() {
        checkSpecifiedProperty("warehouseId");
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {NotNull, bigint(19)} <br>
     * 倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (basically NotNull if update: for the constraint)
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
     * [get] WAREHOUSE_NM: {varchar(60)} <br>
     * 倉庫名称
     * @return The value of the column 'WAREHOUSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseNm() {
        checkSpecifiedProperty("warehouseNm");
        return convertEmptyToNull(_warehouseNm);
    }

    /**
     * [set] WAREHOUSE_NM: {varchar(60)} <br>
     * 倉庫名称
     * @param warehouseNm The value of the column 'WAREHOUSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseNm(String warehouseNm) {
        registerModifiedProperty("warehouseNm");
        _warehouseNm = warehouseNm;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
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
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * 商品略称
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * 商品略称
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
    }

    /**
     * [get] JAN_CD: {IX, varchar(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {IX, varchar(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] STOCK_TYPE_ID: {IX, NotNull, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockTypeId() {
        checkSpecifiedProperty("stockTypeId");
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {IX, NotNull, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockTypeId(Long stockTypeId) {
        registerModifiedProperty("stockTypeId");
        _stockTypeId = stockTypeId;
    }

    /**
     * [get] ZONE_ID: {bigint(19)} <br>
     * ゾーンID
     * @return The value of the column 'ZONE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getZoneId() {
        checkSpecifiedProperty("zoneId");
        return _zoneId;
    }

    /**
     * [set] ZONE_ID: {bigint(19)} <br>
     * ゾーンID
     * @param zoneId The value of the column 'ZONE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneId(Long zoneId) {
        registerModifiedProperty("zoneId");
        _zoneId = zoneId;
    }

    /**
     * [get] ZONE_CD: {varchar(30)} <br>
     * ゾーンCD
     * @return The value of the column 'ZONE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZoneCd() {
        checkSpecifiedProperty("zoneCd");
        return convertEmptyToNull(_zoneCd);
    }

    /**
     * [set] ZONE_CD: {varchar(30)} <br>
     * ゾーンCD
     * @param zoneCd The value of the column 'ZONE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneCd(String zoneCd) {
        registerModifiedProperty("zoneCd");
        _zoneCd = zoneCd;
    }

    /**
     * [get] ZONE_NM: {varchar(60)} <br>
     * ゾーン名称
     * @return The value of the column 'ZONE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getZoneNm() {
        checkSpecifiedProperty("zoneNm");
        return convertEmptyToNull(_zoneNm);
    }

    /**
     * [set] ZONE_NM: {varchar(60)} <br>
     * ゾーン名称
     * @param zoneNm The value of the column 'ZONE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneNm(String zoneNm) {
        registerModifiedProperty("zoneNm");
        _zoneNm = zoneNm;
    }

    /**
     * [get] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] LOCATION_CD: {IX, varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {IX, varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {varchar(60)} <br>
     * ロケーション名称
     * @return The value of the column 'LOCATION_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationNm() {
        checkSpecifiedProperty("locationNm");
        return convertEmptyToNull(_locationNm);
    }

    /**
     * [set] LOCATION_NM: {varchar(60)} <br>
     * ロケーション名称
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationNm(String locationNm) {
        registerModifiedProperty("locationNm");
        _locationNm = locationNm;
    }

    /**
     * [get] DEPOSIT_ID: {NotNull, bigint(19)} <br>
     * 預託ID
     * @return The value of the column 'DEPOSIT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDepositId() {
        checkSpecifiedProperty("depositId");
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {NotNull, bigint(19)} <br>
     * 預託ID
     * @param depositId The value of the column 'DEPOSIT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDepositId(Long depositId) {
        registerModifiedProperty("depositId");
        _depositId = depositId;
    }

    /**
     * [get] DEPOSIT_CD: {IX, varchar(30)} <br>
     * 預託CD
     * @return The value of the column 'DEPOSIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositCd() {
        checkSpecifiedProperty("depositCd");
        return convertEmptyToNull(_depositCd);
    }

    /**
     * [set] DEPOSIT_CD: {IX, varchar(30)} <br>
     * 預託CD
     * @param depositCd The value of the column 'DEPOSIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositCd(String depositCd) {
        registerModifiedProperty("depositCd");
        _depositCd = depositCd;
    }

    /**
     * [get] DEPOSIT_NM: {varchar(60)} <br>
     * 預託名称
     * @return The value of the column 'DEPOSIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositNm() {
        checkSpecifiedProperty("depositNm");
        return convertEmptyToNull(_depositNm);
    }

    /**
     * [set] DEPOSIT_NM: {varchar(60)} <br>
     * 預託名称
     * @param depositNm The value of the column 'DEPOSIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositNm(String depositNm) {
        registerModifiedProperty("depositNm");
        _depositNm = depositNm;
    }

    /**
     * [get] DEPOSIT_ABBR: {varchar(60)} <br>
     * 預託略称
     * @return The value of the column 'DEPOSIT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositAbbr() {
        checkSpecifiedProperty("depositAbbr");
        return convertEmptyToNull(_depositAbbr);
    }

    /**
     * [set] DEPOSIT_ABBR: {varchar(60)} <br>
     * 預託略称
     * @param depositAbbr The value of the column 'DEPOSIT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositAbbr(String depositAbbr) {
        registerModifiedProperty("depositAbbr");
        _depositAbbr = depositAbbr;
    }

    /**
     * [get] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] LOT: {IX, varchar(30)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {IX, varchar(30)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMIT_DT: {IX, varchar(8)} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] LIMIT_DT: {IX, varchar(8)} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
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
     * [get] STORE_NO_ID: {NotNull, bigint(19)} <br>
     * 入庫No.ID
     * @return The value of the column 'STORE_NO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStoreNoId() {
        checkSpecifiedProperty("storeNoId");
        return _storeNoId;
    }

    /**
     * [set] STORE_NO_ID: {NotNull, bigint(19)} <br>
     * 入庫No.ID
     * @param storeNoId The value of the column 'STORE_NO_ID'. (basically NotNull if update: for the constraint)
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
     * [get] OLD_STORE_NUM_ID: {bigint(19)} <br>
     * 元入庫No.ID
     * @return The value of the column 'OLD_STORE_NUM_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOldStoreNumId() {
        checkSpecifiedProperty("oldStoreNumId");
        return _oldStoreNumId;
    }

    /**
     * [set] OLD_STORE_NUM_ID: {bigint(19)} <br>
     * 元入庫No.ID
     * @param oldStoreNumId The value of the column 'OLD_STORE_NUM_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOldStoreNumId(Long oldStoreNumId) {
        registerModifiedProperty("oldStoreNumId");
        _oldStoreNumId = oldStoreNumId;
    }

    /**
     * [get] OLD_STORE_LABEL_NO: {varchar(30)} <br>
     * 元入庫ラベルNo.
     * @return The value of the column 'OLD_STORE_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOldStoreLabelNo() {
        checkSpecifiedProperty("oldStoreLabelNo");
        return convertEmptyToNull(_oldStoreLabelNo);
    }

    /**
     * [set] OLD_STORE_LABEL_NO: {varchar(30)} <br>
     * 元入庫ラベルNo.
     * @param oldStoreLabelNo The value of the column 'OLD_STORE_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOldStoreLabelNo(String oldStoreLabelNo) {
        registerModifiedProperty("oldStoreLabelNo");
        _oldStoreLabelNo = oldStoreLabelNo;
    }

    /**
     * [get] SUPPLIER_ID: {bigint(19)} <br>
     * 仕入先ID
     * @return The value of the column 'SUPPLIER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSupplierId() {
        checkSpecifiedProperty("supplierId");
        return _supplierId;
    }

    /**
     * [set] SUPPLIER_ID: {bigint(19)} <br>
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
     * [get] SUPPLIER_NM: {varchar(60)} <br>
     * 仕入先名称
     * @return The value of the column 'SUPPLIER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierNm() {
        checkSpecifiedProperty("supplierNm");
        return convertEmptyToNull(_supplierNm);
    }

    /**
     * [set] SUPPLIER_NM: {varchar(60)} <br>
     * 仕入先名称
     * @param supplierNm The value of the column 'SUPPLIER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierNm(String supplierNm) {
        registerModifiedProperty("supplierNm");
        _supplierNm = supplierNm;
    }

    /**
     * [get] SUPPLIER_ABBR: {varchar(60)} <br>
     * 仕入先略称
     * @return The value of the column 'SUPPLIER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierAbbr() {
        checkSpecifiedProperty("supplierAbbr");
        return convertEmptyToNull(_supplierAbbr);
    }

    /**
     * [set] SUPPLIER_ABBR: {varchar(60)} <br>
     * 仕入先略称
     * @param supplierAbbr The value of the column 'SUPPLIER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierAbbr(String supplierAbbr) {
        registerModifiedProperty("supplierAbbr");
        _supplierAbbr = supplierAbbr;
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
