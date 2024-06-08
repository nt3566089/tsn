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
 * The entity of W_LOCATION_INPUT as TABLE. <br>
 * ロケーションマスタ取込ワーク
 * <pre>
 * [primary-key]
 *     LOCATION_INPUT_ID
 *
 * [column]
 *     LOCATION_INPUT_ID, CENTER_CD, WAREHOUSE_CD, ZONE_CD, LOCATION_CD, LOCATION_NM, PICKING_LOCATION_FLG, PICKING_ORDER, LOCATION_TYPE, ALLOC_ORDER, ALLOC_NG_FLG, RESTOCK_PRODUCT_CD, RESTOCK_STOCK_TYPE_CD, RESTOCK_DEPOSIT_CD, RESTOCK_SHAPE_CD, RESTOCK_POINT_NUM, MAX_STORE_SHAPE_CD, MAX_STORE_NUM, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_INPUT_ID
 *
 * [version-no]
 *     VERSION_NO
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
 * Long locationInputId = entity.getLocationInputId();
 * String centerCd = entity.getCenterCd();
 * String warehouseCd = entity.getWarehouseCd();
 * String zoneCd = entity.getZoneCd();
 * String locationCd = entity.getLocationCd();
 * String locationNm = entity.getLocationNm();
 * String pickingLocationFlg = entity.getPickingLocationFlg();
 * String pickingOrder = entity.getPickingOrder();
 * String locationType = entity.getLocationType();
 * String allocOrder = entity.getAllocOrder();
 * String allocNgFlg = entity.getAllocNgFlg();
 * String restockProductCd = entity.getRestockProductCd();
 * String restockStockTypeCd = entity.getRestockStockTypeCd();
 * String restockDepositCd = entity.getRestockDepositCd();
 * String restockShapeCd = entity.getRestockShapeCd();
 * String restockPointNum = entity.getRestockPointNum();
 * String maxStoreShapeCd = entity.getMaxStoreShapeCd();
 * String maxStoreNum = entity.getMaxStoreNum();
 * Long lineNo = entity.getLineNo();
 * String workFlg = entity.getWorkFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMsg = entity.getErrorMsg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setLocationInputId(locationInputId);
 * entity.setCenterCd(centerCd);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setZoneCd(zoneCd);
 * entity.setLocationCd(locationCd);
 * entity.setLocationNm(locationNm);
 * entity.setPickingLocationFlg(pickingLocationFlg);
 * entity.setPickingOrder(pickingOrder);
 * entity.setLocationType(locationType);
 * entity.setAllocOrder(allocOrder);
 * entity.setAllocNgFlg(allocNgFlg);
 * entity.setRestockProductCd(restockProductCd);
 * entity.setRestockStockTypeCd(restockStockTypeCd);
 * entity.setRestockDepositCd(restockDepositCd);
 * entity.setRestockShapeCd(restockShapeCd);
 * entity.setRestockPointNum(restockPointNum);
 * entity.setMaxStoreShapeCd(maxStoreShapeCd);
 * entity.setMaxStoreNum(maxStoreNum);
 * entity.setLineNo(lineNo);
 * entity.setWorkFlg(workFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMsg(errorMsg);
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
public abstract class BsWLocationInput extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _locationInputId;

    /** CENTER_CD: {varchar(255)} */
    protected String _centerCd;

    /** WAREHOUSE_CD: {varchar(255)} */
    protected String _warehouseCd;

    /** ZONE_CD: {varchar(255)} */
    protected String _zoneCd;

    /** LOCATION_CD: {varchar(255)} */
    protected String _locationCd;

    /** LOCATION_NM: {varchar(255)} */
    protected String _locationNm;

    /** PICKING_LOCATION_FLG: {varchar(255)} */
    protected String _pickingLocationFlg;

    /** PICKING_ORDER: {varchar(255)} */
    protected String _pickingOrder;

    /** LOCATION_TYPE: {varchar(255)} */
    protected String _locationType;

    /** ALLOC_ORDER: {varchar(255)} */
    protected String _allocOrder;

    /** ALLOC_NG_FLG: {varchar(255)} */
    protected String _allocNgFlg;

    /** RESTOCK_PRODUCT_CD: {varchar(255)} */
    protected String _restockProductCd;

    /** RESTOCK_STOCK_TYPE_CD: {varchar(255)} */
    protected String _restockStockTypeCd;

    /** RESTOCK_DEPOSIT_CD: {varchar(255)} */
    protected String _restockDepositCd;

    /** RESTOCK_SHAPE_CD: {varchar(255)} */
    protected String _restockShapeCd;

    /** RESTOCK_POINT_NUM: {varchar(255)} */
    protected String _restockPointNum;

    /** MAX_STORE_SHAPE_CD: {varchar(255)} */
    protected String _maxStoreShapeCd;

    /** MAX_STORE_NUM: {varchar(255)} */
    protected String _maxStoreNum;

    /** LINE_NO: {NotNull, bigint(19)} */
    protected Long _lineNo;

    /** WORK_FLG: {char(1), default=[(0)]} */
    protected String _workFlg;

    /** ERROR_FLG: {char(1), default=[(0)]} */
    protected String _errorFlg;

    /** ERROR_MSG: {varchar(2147483647)} */
    protected String _errorMsg;

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
        return "W_LOCATION_INPUT";
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
        if (_locationInputId == null) { return false; }
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
        if (obj instanceof BsWLocationInput) {
            BsWLocationInput other = (BsWLocationInput)obj;
            if (!xSV(_locationInputId, other._locationInputId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _locationInputId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_locationInputId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_zoneCd));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_locationNm));
        sb.append(dm).append(xfND(_pickingLocationFlg));
        sb.append(dm).append(xfND(_pickingOrder));
        sb.append(dm).append(xfND(_locationType));
        sb.append(dm).append(xfND(_allocOrder));
        sb.append(dm).append(xfND(_allocNgFlg));
        sb.append(dm).append(xfND(_restockProductCd));
        sb.append(dm).append(xfND(_restockStockTypeCd));
        sb.append(dm).append(xfND(_restockDepositCd));
        sb.append(dm).append(xfND(_restockShapeCd));
        sb.append(dm).append(xfND(_restockPointNum));
        sb.append(dm).append(xfND(_maxStoreShapeCd));
        sb.append(dm).append(xfND(_maxStoreNum));
        sb.append(dm).append(xfND(_lineNo));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMsg));
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
        return "";
    }

    @Override
    public WLocationInput clone() {
        return (WLocationInput)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ロケーションマスタ取込ワークID
     * @return The value of the column 'LOCATION_INPUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLocationInputId() {
        checkSpecifiedProperty("locationInputId");
        return _locationInputId;
    }

    /**
     * [set] LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ロケーションマスタ取込ワークID
     * @param locationInputId The value of the column 'LOCATION_INPUT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationInputId(Long locationInputId) {
        registerModifiedProperty("locationInputId");
        _locationInputId = locationInputId;
    }

    /**
     * [get] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * 倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] ZONE_CD: {varchar(255)} <br>
     * ゾーンCD
     * @return The value of the column 'ZONE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZoneCd() {
        checkSpecifiedProperty("zoneCd");
        return convertEmptyToNull(_zoneCd);
    }

    /**
     * [set] ZONE_CD: {varchar(255)} <br>
     * ゾーンCD
     * @param zoneCd The value of the column 'ZONE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneCd(String zoneCd) {
        registerModifiedProperty("zoneCd");
        _zoneCd = zoneCd;
    }

    /**
     * [get] LOCATION_CD: {varchar(255)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(255)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {varchar(255)} <br>
     * ロケーション名称
     * @return The value of the column 'LOCATION_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationNm() {
        checkSpecifiedProperty("locationNm");
        return convertEmptyToNull(_locationNm);
    }

    /**
     * [set] LOCATION_NM: {varchar(255)} <br>
     * ロケーション名称
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationNm(String locationNm) {
        registerModifiedProperty("locationNm");
        _locationNm = locationNm;
    }

    /**
     * [get] PICKING_LOCATION_FLG: {varchar(255)} <br>
     * ピックロケフラグ
     * @return The value of the column 'PICKING_LOCATION_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingLocationFlg() {
        checkSpecifiedProperty("pickingLocationFlg");
        return convertEmptyToNull(_pickingLocationFlg);
    }

    /**
     * [set] PICKING_LOCATION_FLG: {varchar(255)} <br>
     * ピックロケフラグ
     * @param pickingLocationFlg The value of the column 'PICKING_LOCATION_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingLocationFlg(String pickingLocationFlg) {
        registerModifiedProperty("pickingLocationFlg");
        _pickingLocationFlg = pickingLocationFlg;
    }

    /**
     * [get] PICKING_ORDER: {varchar(255)} <br>
     * ピッキング順序
     * @return The value of the column 'PICKING_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingOrder() {
        checkSpecifiedProperty("pickingOrder");
        return convertEmptyToNull(_pickingOrder);
    }

    /**
     * [set] PICKING_ORDER: {varchar(255)} <br>
     * ピッキング順序
     * @param pickingOrder The value of the column 'PICKING_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingOrder(String pickingOrder) {
        registerModifiedProperty("pickingOrder");
        _pickingOrder = pickingOrder;
    }

    /**
     * [get] LOCATION_TYPE: {varchar(255)} <br>
     * ロケーション種別
     * @return The value of the column 'LOCATION_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationType() {
        checkSpecifiedProperty("locationType");
        return convertEmptyToNull(_locationType);
    }

    /**
     * [set] LOCATION_TYPE: {varchar(255)} <br>
     * ロケーション種別
     * @param locationType The value of the column 'LOCATION_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationType(String locationType) {
        registerModifiedProperty("locationType");
        _locationType = locationType;
    }

    /**
     * [get] ALLOC_ORDER: {varchar(255)} <br>
     * 引当順序
     * @return The value of the column 'ALLOC_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocOrder() {
        checkSpecifiedProperty("allocOrder");
        return convertEmptyToNull(_allocOrder);
    }

    /**
     * [set] ALLOC_ORDER: {varchar(255)} <br>
     * 引当順序
     * @param allocOrder The value of the column 'ALLOC_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocOrder(String allocOrder) {
        registerModifiedProperty("allocOrder");
        _allocOrder = allocOrder;
    }

    /**
     * [get] ALLOC_NG_FLG: {varchar(255)} <br>
     * 引当禁止フラグ
     * @return The value of the column 'ALLOC_NG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocNgFlg() {
        checkSpecifiedProperty("allocNgFlg");
        return convertEmptyToNull(_allocNgFlg);
    }

    /**
     * [set] ALLOC_NG_FLG: {varchar(255)} <br>
     * 引当禁止フラグ
     * @param allocNgFlg The value of the column 'ALLOC_NG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocNgFlg(String allocNgFlg) {
        registerModifiedProperty("allocNgFlg");
        _allocNgFlg = allocNgFlg;
    }

    /**
     * [get] RESTOCK_PRODUCT_CD: {varchar(255)} <br>
     * 補充商品CD
     * @return The value of the column 'RESTOCK_PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRestockProductCd() {
        checkSpecifiedProperty("restockProductCd");
        return convertEmptyToNull(_restockProductCd);
    }

    /**
     * [set] RESTOCK_PRODUCT_CD: {varchar(255)} <br>
     * 補充商品CD
     * @param restockProductCd The value of the column 'RESTOCK_PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestockProductCd(String restockProductCd) {
        registerModifiedProperty("restockProductCd");
        _restockProductCd = restockProductCd;
    }

    /**
     * [get] RESTOCK_STOCK_TYPE_CD: {varchar(255)} <br>
     * 補充在庫区分CD
     * @return The value of the column 'RESTOCK_STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRestockStockTypeCd() {
        checkSpecifiedProperty("restockStockTypeCd");
        return convertEmptyToNull(_restockStockTypeCd);
    }

    /**
     * [set] RESTOCK_STOCK_TYPE_CD: {varchar(255)} <br>
     * 補充在庫区分CD
     * @param restockStockTypeCd The value of the column 'RESTOCK_STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestockStockTypeCd(String restockStockTypeCd) {
        registerModifiedProperty("restockStockTypeCd");
        _restockStockTypeCd = restockStockTypeCd;
    }

    /**
     * [get] RESTOCK_DEPOSIT_CD: {varchar(255)} <br>
     * 補充預託CD
     * @return The value of the column 'RESTOCK_DEPOSIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRestockDepositCd() {
        checkSpecifiedProperty("restockDepositCd");
        return convertEmptyToNull(_restockDepositCd);
    }

    /**
     * [set] RESTOCK_DEPOSIT_CD: {varchar(255)} <br>
     * 補充預託CD
     * @param restockDepositCd The value of the column 'RESTOCK_DEPOSIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestockDepositCd(String restockDepositCd) {
        registerModifiedProperty("restockDepositCd");
        _restockDepositCd = restockDepositCd;
    }

    /**
     * [get] RESTOCK_SHAPE_CD: {varchar(255)} <br>
     * 補充点荷姿CD
     * @return The value of the column 'RESTOCK_SHAPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRestockShapeCd() {
        checkSpecifiedProperty("restockShapeCd");
        return convertEmptyToNull(_restockShapeCd);
    }

    /**
     * [set] RESTOCK_SHAPE_CD: {varchar(255)} <br>
     * 補充点荷姿CD
     * @param restockShapeCd The value of the column 'RESTOCK_SHAPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestockShapeCd(String restockShapeCd) {
        registerModifiedProperty("restockShapeCd");
        _restockShapeCd = restockShapeCd;
    }

    /**
     * [get] RESTOCK_POINT_NUM: {varchar(255)} <br>
     * 補充点
     * @return The value of the column 'RESTOCK_POINT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getRestockPointNum() {
        checkSpecifiedProperty("restockPointNum");
        return convertEmptyToNull(_restockPointNum);
    }

    /**
     * [set] RESTOCK_POINT_NUM: {varchar(255)} <br>
     * 補充点
     * @param restockPointNum The value of the column 'RESTOCK_POINT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestockPointNum(String restockPointNum) {
        registerModifiedProperty("restockPointNum");
        _restockPointNum = restockPointNum;
    }

    /**
     * [get] MAX_STORE_SHAPE_CD: {varchar(255)} <br>
     * 最大格納数商品荷姿CD
     * @return The value of the column 'MAX_STORE_SHAPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMaxStoreShapeCd() {
        checkSpecifiedProperty("maxStoreShapeCd");
        return convertEmptyToNull(_maxStoreShapeCd);
    }

    /**
     * [set] MAX_STORE_SHAPE_CD: {varchar(255)} <br>
     * 最大格納数商品荷姿CD
     * @param maxStoreShapeCd The value of the column 'MAX_STORE_SHAPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxStoreShapeCd(String maxStoreShapeCd) {
        registerModifiedProperty("maxStoreShapeCd");
        _maxStoreShapeCd = maxStoreShapeCd;
    }

    /**
     * [get] MAX_STORE_NUM: {varchar(255)} <br>
     * 最大格納数
     * @return The value of the column 'MAX_STORE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMaxStoreNum() {
        checkSpecifiedProperty("maxStoreNum");
        return convertEmptyToNull(_maxStoreNum);
    }

    /**
     * [set] MAX_STORE_NUM: {varchar(255)} <br>
     * 最大格納数
     * @param maxStoreNum The value of the column 'MAX_STORE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxStoreNum(String maxStoreNum) {
        registerModifiedProperty("maxStoreNum");
        _maxStoreNum = maxStoreNum;
    }

    /**
     * [get] LINE_NO: {NotNull, bigint(19)} <br>
     * 行NO.
     * @return The value of the column 'LINE_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getLineNo() {
        checkSpecifiedProperty("lineNo");
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {NotNull, bigint(19)} <br>
     * 行NO.
     * @param lineNo The value of the column 'LINE_NO'. (basically NotNull if update: for the constraint)
     */
    public void setLineNo(Long lineNo) {
        registerModifiedProperty("lineNo");
        _lineNo = lineNo;
    }

    /**
     * [get] WORK_FLG: {char(1), default=[(0)]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {char(1), default=[(0)]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkFlg(String workFlg) {
        registerModifiedProperty("workFlg");
        _workFlg = workFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1), default=[(0)]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {char(1), default=[(0)]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @return The value of the column 'ERROR_MSG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMsg() {
        checkSpecifiedProperty("errorMsg");
        return convertEmptyToNull(_errorMsg);
    }

    /**
     * [set] ERROR_MSG: {varchar(2147483647)} <br>
     * エラー内容
     * @param errorMsg The value of the column 'ERROR_MSG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMsg(String errorMsg) {
        registerModifiedProperty("errorMsg");
        _errorMsg = errorMsg;
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
