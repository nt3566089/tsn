package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlMLocationMasterEdit. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LocGroup, LOCATION_CD, ALLOC_NG_FLG, DEL_FLG, LOCATION_NM, PICKING_ORDER, PALLETECAPACITY, MAX_STORE_NUM, LINBLK, LOCID, PRODUCT_CD, PRODUCT_NM, BRCTG, SPLREVUN, SPLREVCTQA, REPLENISH_P_NUM, BSSPLPT, TOSPLMD, PRESPLMD, TRANSPORTPRIORITY, VIRTUALLOCFLG, LINNM, BLKNM, CENTER_ID, CENTER_CD, CENTER_NM, CLIENT_ID, CLIENT_CD, CLIENT_NM, LOCATION_ID, UPD_DT, USER_NM, ZONE, ALLOC_ORDER, LOCATION_TYPE, REPLENISH_PRODUCT_ID, REPLENISH_STOCK_TYPE_ID, REPLENISH_DEPOSIT_ID, REPLENISH_P_PRODUCT_SHAPE_ID, MAX_STORE_PRODUCT_SHAPE_ID, VERSION_NO, CONTROL_NO, ADD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
 * String locGroup = entity.getLocGroup();
 * String locationCd = entity.getLocationCd();
 * String allocNgFlg = entity.getAllocNgFlg();
 * String delFlg = entity.getDelFlg();
 * String locationNm = entity.getLocationNm();
 * Long pickingOrder = entity.getPickingOrder();
 * Long palletecapacity = entity.getPalletecapacity();
 * java.math.BigDecimal maxStoreNum = entity.getMaxStoreNum();
 * String linblk = entity.getLinblk();
 * String locid = entity.getLocid();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * Long brctg = entity.getBrctg();
 * String splrevun = entity.getSplrevun();
 * Long splrevctqa = entity.getSplrevctqa();
 * java.math.BigDecimal replenishPNum = entity.getReplenishPNum();
 * String bssplpt = entity.getBssplpt();
 * String tosplmd = entity.getTosplmd();
 * String presplmd = entity.getPresplmd();
 * java.math.BigDecimal transportpriority = entity.getTransportpriority();
 * String virtuallocflg = entity.getVirtuallocflg();
 * String linnm = entity.getLinnm();
 * String blknm = entity.getBlknm();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * Long locationId = entity.getLocationId();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String userNm = entity.getUserNm();
 * String zone = entity.getZone();
 * Long allocOrder = entity.getAllocOrder();
 * String locationType = entity.getLocationType();
 * Long replenishProductId = entity.getReplenishProductId();
 * Long replenishStockTypeId = entity.getReplenishStockTypeId();
 * Long replenishDepositId = entity.getReplenishDepositId();
 * Long replenishPProductShapeId = entity.getReplenishPProductShapeId();
 * Long maxStoreProductShapeId = entity.getMaxStoreProductShapeId();
 * Long versionNo = entity.getVersionNo();
 * Integer controlNo = entity.getControlNo();
 * Integer addProcess = entity.getAddProcess();
 * entity.setLocGroup(locGroup);
 * entity.setLocationCd(locationCd);
 * entity.setAllocNgFlg(allocNgFlg);
 * entity.setDelFlg(delFlg);
 * entity.setLocationNm(locationNm);
 * entity.setPickingOrder(pickingOrder);
 * entity.setPalletecapacity(palletecapacity);
 * entity.setMaxStoreNum(maxStoreNum);
 * entity.setLinblk(linblk);
 * entity.setLocid(locid);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setBrctg(brctg);
 * entity.setSplrevun(splrevun);
 * entity.setSplrevctqa(splrevctqa);
 * entity.setReplenishPNum(replenishPNum);
 * entity.setBssplpt(bssplpt);
 * entity.setTosplmd(tosplmd);
 * entity.setPresplmd(presplmd);
 * entity.setTransportpriority(transportpriority);
 * entity.setVirtuallocflg(virtuallocflg);
 * entity.setLinnm(linnm);
 * entity.setBlknm(blknm);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setLocationId(locationId);
 * entity.setUpdDt(updDt);
 * entity.setUserNm(userNm);
 * entity.setZone(zone);
 * entity.setAllocOrder(allocOrder);
 * entity.setLocationType(locationType);
 * entity.setReplenishProductId(replenishProductId);
 * entity.setReplenishStockTypeId(replenishStockTypeId);
 * entity.setReplenishDepositId(replenishDepositId);
 * entity.setReplenishPProductShapeId(replenishPProductShapeId);
 * entity.setMaxStoreProductShapeId(maxStoreProductShapeId);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddProcess(addProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlMLocationMasterEdit extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LocGroup: {varchar(30)} */
    protected String _locGroup;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** ALLOC_NG_FLG: {char(1)} */
    protected String _allocNgFlg;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    protected String _delFlg;

    /** LOCATION_NM: {varchar(60)} */
    protected String _locationNm;

    /** PICKING_ORDER: {bigint(19)} */
    protected Long _pickingOrder;

    /** PALLETECAPACITY: {bigint(19)} */
    protected Long _palletecapacity;

    /** MAX_STORE_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _maxStoreNum;

    /** LINBLK: {varchar(30)} */
    protected String _linblk;

    /** LOCID: {varchar(30)} */
    protected String _locid;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** BRCTG: {bigint(19)} */
    protected Long _brctg;

    /** SPLREVUN: {varchar(30)} */
    protected String _splrevun;

    /** SPLREVCTQA: {bigint(19)} */
    protected Long _splrevctqa;

    /** REPLENISH_P_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _replenishPNum;

    /** BSSPLPT: {varchar(30)} */
    protected String _bssplpt;

    /** TOSPLMD: {varchar(30)} */
    protected String _tosplmd;

    /** PRESPLMD: {varchar(30)} */
    protected String _presplmd;

    /** TRANSPORTPRIORITY: {decimal(16, 6)} */
    protected java.math.BigDecimal _transportpriority;

    /** VIRTUALLOCFLG: {char(1)} */
    protected String _virtuallocflg;

    /** LINNM: {varchar(30)} */
    protected String _linnm;

    /** BLKNM: {varchar(30)} */
    protected String _blknm;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** LOCATION_ID: {bigint(19)} */
    protected Long _locationId;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** USER_NM: {varchar(60)} */
    protected String _userNm;

    /** ZONE: {varchar(6)} */
    protected String _zone;

    /** ALLOC_ORDER: {bigint(19)} */
    protected Long _allocOrder;

    /** LOCATION_TYPE: {varchar(30)} */
    protected String _locationType;

    /** REPLENISH_PRODUCT_ID: {bigint(19)} */
    protected Long _replenishProductId;

    /** REPLENISH_STOCK_TYPE_ID: {bigint(19)} */
    protected Long _replenishStockTypeId;

    /** REPLENISH_DEPOSIT_ID: {bigint(19)} */
    protected Long _replenishDepositId;

    /** REPLENISH_P_PRODUCT_SHAPE_ID: {bigint(19)} */
    protected Long _replenishPProductShapeId;

    /** MAX_STORE_PRODUCT_SHAPE_ID: {bigint(19)} */
    protected Long _maxStoreProductShapeId;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** CONTROL_NO: {int(10)} */
    protected Integer _controlNo;

    /** ADD_PROCESS: {int(10)} */
    protected Integer _addProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlMLocationMasterEditDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlMLocationMasterEdit";
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
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), classification=DelFlg} <br>
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
        if (obj instanceof BsSqlMLocationMasterEdit) {
            BsSqlMLocationMasterEdit other = (BsSqlMLocationMasterEdit)obj;
            if (!xSV(_locGroup, other._locGroup)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            if (!xSV(_allocNgFlg, other._allocNgFlg)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
            if (!xSV(_locationNm, other._locationNm)) { return false; }
            if (!xSV(_pickingOrder, other._pickingOrder)) { return false; }
            if (!xSV(_palletecapacity, other._palletecapacity)) { return false; }
            if (!xSV(_maxStoreNum, other._maxStoreNum)) { return false; }
            if (!xSV(_linblk, other._linblk)) { return false; }
            if (!xSV(_locid, other._locid)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_brctg, other._brctg)) { return false; }
            if (!xSV(_splrevun, other._splrevun)) { return false; }
            if (!xSV(_splrevctqa, other._splrevctqa)) { return false; }
            if (!xSV(_replenishPNum, other._replenishPNum)) { return false; }
            if (!xSV(_bssplpt, other._bssplpt)) { return false; }
            if (!xSV(_tosplmd, other._tosplmd)) { return false; }
            if (!xSV(_presplmd, other._presplmd)) { return false; }
            if (!xSV(_transportpriority, other._transportpriority)) { return false; }
            if (!xSV(_virtuallocflg, other._virtuallocflg)) { return false; }
            if (!xSV(_linnm, other._linnm)) { return false; }
            if (!xSV(_blknm, other._blknm)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_locationId, other._locationId)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_userNm, other._userNm)) { return false; }
            if (!xSV(_zone, other._zone)) { return false; }
            if (!xSV(_allocOrder, other._allocOrder)) { return false; }
            if (!xSV(_locationType, other._locationType)) { return false; }
            if (!xSV(_replenishProductId, other._replenishProductId)) { return false; }
            if (!xSV(_replenishStockTypeId, other._replenishStockTypeId)) { return false; }
            if (!xSV(_replenishDepositId, other._replenishDepositId)) { return false; }
            if (!xSV(_replenishPProductShapeId, other._replenishPProductShapeId)) { return false; }
            if (!xSV(_maxStoreProductShapeId, other._maxStoreProductShapeId)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_controlNo, other._controlNo)) { return false; }
            if (!xSV(_addProcess, other._addProcess)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _locGroup);
        hs = xCH(hs, _locationCd);
        hs = xCH(hs, _allocNgFlg);
        hs = xCH(hs, _delFlg);
        hs = xCH(hs, _locationNm);
        hs = xCH(hs, _pickingOrder);
        hs = xCH(hs, _palletecapacity);
        hs = xCH(hs, _maxStoreNum);
        hs = xCH(hs, _linblk);
        hs = xCH(hs, _locid);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _brctg);
        hs = xCH(hs, _splrevun);
        hs = xCH(hs, _splrevctqa);
        hs = xCH(hs, _replenishPNum);
        hs = xCH(hs, _bssplpt);
        hs = xCH(hs, _tosplmd);
        hs = xCH(hs, _presplmd);
        hs = xCH(hs, _transportpriority);
        hs = xCH(hs, _virtuallocflg);
        hs = xCH(hs, _linnm);
        hs = xCH(hs, _blknm);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _locationId);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _userNm);
        hs = xCH(hs, _zone);
        hs = xCH(hs, _allocOrder);
        hs = xCH(hs, _locationType);
        hs = xCH(hs, _replenishProductId);
        hs = xCH(hs, _replenishStockTypeId);
        hs = xCH(hs, _replenishDepositId);
        hs = xCH(hs, _replenishPProductShapeId);
        hs = xCH(hs, _maxStoreProductShapeId);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _controlNo);
        hs = xCH(hs, _addProcess);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_locGroup));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_allocNgFlg));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_locationNm));
        sb.append(dm).append(xfND(_pickingOrder));
        sb.append(dm).append(xfND(_palletecapacity));
        sb.append(dm).append(xfND(_maxStoreNum));
        sb.append(dm).append(xfND(_linblk));
        sb.append(dm).append(xfND(_locid));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_brctg));
        sb.append(dm).append(xfND(_splrevun));
        sb.append(dm).append(xfND(_splrevctqa));
        sb.append(dm).append(xfND(_replenishPNum));
        sb.append(dm).append(xfND(_bssplpt));
        sb.append(dm).append(xfND(_tosplmd));
        sb.append(dm).append(xfND(_presplmd));
        sb.append(dm).append(xfND(_transportpriority));
        sb.append(dm).append(xfND(_virtuallocflg));
        sb.append(dm).append(xfND(_linnm));
        sb.append(dm).append(xfND(_blknm));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_userNm));
        sb.append(dm).append(xfND(_zone));
        sb.append(dm).append(xfND(_allocOrder));
        sb.append(dm).append(xfND(_locationType));
        sb.append(dm).append(xfND(_replenishProductId));
        sb.append(dm).append(xfND(_replenishStockTypeId));
        sb.append(dm).append(xfND(_replenishDepositId));
        sb.append(dm).append(xfND(_replenishPProductShapeId));
        sb.append(dm).append(xfND(_maxStoreProductShapeId));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addProcess));
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
    public SqlMLocationMasterEdit clone() {
        return (SqlMLocationMasterEdit)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LocGroup: {varchar(30)} <br>
     * @return The value of the column 'LocGroup'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocGroup() {
        checkSpecifiedProperty("locGroup");
        return convertEmptyToNull(_locGroup);
    }

    /**
     * [set] LocGroup: {varchar(30)} <br>
     * @param locGroup The value of the column 'LocGroup'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocGroup(String locGroup) {
        registerModifiedProperty("locGroup");
        _locGroup = locGroup;
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
     * [get] ALLOC_NG_FLG: {char(1)} <br>
     * @return The value of the column 'ALLOC_NG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocNgFlg() {
        checkSpecifiedProperty("allocNgFlg");
        return convertEmptyToNull(_allocNgFlg);
    }

    /**
     * [set] ALLOC_NG_FLG: {char(1)} <br>
     * @param allocNgFlg The value of the column 'ALLOC_NG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocNgFlg(String allocNgFlg) {
        registerModifiedProperty("allocNgFlg");
        _allocNgFlg = allocNgFlg;
    }

    /**
     * [get] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @return The value of the column 'DEL_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
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
     * [get] PICKING_ORDER: {bigint(19)} <br>
     * @return The value of the column 'PICKING_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingOrder() {
        checkSpecifiedProperty("pickingOrder");
        return _pickingOrder;
    }

    /**
     * [set] PICKING_ORDER: {bigint(19)} <br>
     * @param pickingOrder The value of the column 'PICKING_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingOrder(Long pickingOrder) {
        registerModifiedProperty("pickingOrder");
        _pickingOrder = pickingOrder;
    }

    /**
     * [get] PALLETECAPACITY: {bigint(19)} <br>
     * @return The value of the column 'PALLETECAPACITY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPalletecapacity() {
        checkSpecifiedProperty("palletecapacity");
        return _palletecapacity;
    }

    /**
     * [set] PALLETECAPACITY: {bigint(19)} <br>
     * @param palletecapacity The value of the column 'PALLETECAPACITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletecapacity(Long palletecapacity) {
        registerModifiedProperty("palletecapacity");
        _palletecapacity = palletecapacity;
    }

    /**
     * [get] MAX_STORE_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'MAX_STORE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMaxStoreNum() {
        checkSpecifiedProperty("maxStoreNum");
        return _maxStoreNum;
    }

    /**
     * [set] MAX_STORE_NUM: {decimal(16, 6)} <br>
     * @param maxStoreNum The value of the column 'MAX_STORE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxStoreNum(java.math.BigDecimal maxStoreNum) {
        registerModifiedProperty("maxStoreNum");
        _maxStoreNum = maxStoreNum;
    }

    /**
     * [get] LINBLK: {varchar(30)} <br>
     * @return The value of the column 'LINBLK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinblk() {
        checkSpecifiedProperty("linblk");
        return convertEmptyToNull(_linblk);
    }

    /**
     * [set] LINBLK: {varchar(30)} <br>
     * @param linblk The value of the column 'LINBLK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinblk(String linblk) {
        registerModifiedProperty("linblk");
        _linblk = linblk;
    }

    /**
     * [get] LOCID: {varchar(30)} <br>
     * @return The value of the column 'LOCID'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocid() {
        checkSpecifiedProperty("locid");
        return convertEmptyToNull(_locid);
    }

    /**
     * [set] LOCID: {varchar(30)} <br>
     * @param locid The value of the column 'LOCID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocid(String locid) {
        registerModifiedProperty("locid");
        _locid = locid;
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
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] BRCTG: {bigint(19)} <br>
     * @return The value of the column 'BRCTG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBrctg() {
        checkSpecifiedProperty("brctg");
        return _brctg;
    }

    /**
     * [set] BRCTG: {bigint(19)} <br>
     * @param brctg The value of the column 'BRCTG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrctg(Long brctg) {
        registerModifiedProperty("brctg");
        _brctg = brctg;
    }

    /**
     * [get] SPLREVUN: {varchar(30)} <br>
     * @return The value of the column 'SPLREVUN'. (NullAllowed even if selected: for no constraint)
     */
    public String getSplrevun() {
        checkSpecifiedProperty("splrevun");
        return convertEmptyToNull(_splrevun);
    }

    /**
     * [set] SPLREVUN: {varchar(30)} <br>
     * @param splrevun The value of the column 'SPLREVUN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSplrevun(String splrevun) {
        registerModifiedProperty("splrevun");
        _splrevun = splrevun;
    }

    /**
     * [get] SPLREVCTQA: {bigint(19)} <br>
     * @return The value of the column 'SPLREVCTQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSplrevctqa() {
        checkSpecifiedProperty("splrevctqa");
        return _splrevctqa;
    }

    /**
     * [set] SPLREVCTQA: {bigint(19)} <br>
     * @param splrevctqa The value of the column 'SPLREVCTQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSplrevctqa(Long splrevctqa) {
        registerModifiedProperty("splrevctqa");
        _splrevctqa = splrevctqa;
    }

    /**
     * [get] REPLENISH_P_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'REPLENISH_P_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReplenishPNum() {
        checkSpecifiedProperty("replenishPNum");
        return _replenishPNum;
    }

    /**
     * [set] REPLENISH_P_NUM: {decimal(16, 6)} <br>
     * @param replenishPNum The value of the column 'REPLENISH_P_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishPNum(java.math.BigDecimal replenishPNum) {
        registerModifiedProperty("replenishPNum");
        _replenishPNum = replenishPNum;
    }

    /**
     * [get] BSSPLPT: {varchar(30)} <br>
     * @return The value of the column 'BSSPLPT'. (NullAllowed even if selected: for no constraint)
     */
    public String getBssplpt() {
        checkSpecifiedProperty("bssplpt");
        return convertEmptyToNull(_bssplpt);
    }

    /**
     * [set] BSSPLPT: {varchar(30)} <br>
     * @param bssplpt The value of the column 'BSSPLPT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBssplpt(String bssplpt) {
        registerModifiedProperty("bssplpt");
        _bssplpt = bssplpt;
    }

    /**
     * [get] TOSPLMD: {varchar(30)} <br>
     * @return The value of the column 'TOSPLMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTosplmd() {
        checkSpecifiedProperty("tosplmd");
        return convertEmptyToNull(_tosplmd);
    }

    /**
     * [set] TOSPLMD: {varchar(30)} <br>
     * @param tosplmd The value of the column 'TOSPLMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTosplmd(String tosplmd) {
        registerModifiedProperty("tosplmd");
        _tosplmd = tosplmd;
    }

    /**
     * [get] PRESPLMD: {varchar(30)} <br>
     * @return The value of the column 'PRESPLMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPresplmd() {
        checkSpecifiedProperty("presplmd");
        return convertEmptyToNull(_presplmd);
    }

    /**
     * [set] PRESPLMD: {varchar(30)} <br>
     * @param presplmd The value of the column 'PRESPLMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPresplmd(String presplmd) {
        registerModifiedProperty("presplmd");
        _presplmd = presplmd;
    }

    /**
     * [get] TRANSPORTPRIORITY: {decimal(16, 6)} <br>
     * @return The value of the column 'TRANSPORTPRIORITY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTransportpriority() {
        checkSpecifiedProperty("transportpriority");
        return _transportpriority;
    }

    /**
     * [set] TRANSPORTPRIORITY: {decimal(16, 6)} <br>
     * @param transportpriority The value of the column 'TRANSPORTPRIORITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportpriority(java.math.BigDecimal transportpriority) {
        registerModifiedProperty("transportpriority");
        _transportpriority = transportpriority;
    }

    /**
     * [get] VIRTUALLOCFLG: {char(1)} <br>
     * @return The value of the column 'VIRTUALLOCFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getVirtuallocflg() {
        checkSpecifiedProperty("virtuallocflg");
        return convertEmptyToNull(_virtuallocflg);
    }

    /**
     * [set] VIRTUALLOCFLG: {char(1)} <br>
     * @param virtuallocflg The value of the column 'VIRTUALLOCFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVirtuallocflg(String virtuallocflg) {
        registerModifiedProperty("virtuallocflg");
        _virtuallocflg = virtuallocflg;
    }

    /**
     * [get] LINNM: {varchar(30)} <br>
     * @return The value of the column 'LINNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinnm() {
        checkSpecifiedProperty("linnm");
        return convertEmptyToNull(_linnm);
    }

    /**
     * [set] LINNM: {varchar(30)} <br>
     * @param linnm The value of the column 'LINNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinnm(String linnm) {
        registerModifiedProperty("linnm");
        _linnm = linnm;
    }

    /**
     * [get] BLKNM: {varchar(30)} <br>
     * @return The value of the column 'BLKNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBlknm() {
        checkSpecifiedProperty("blknm");
        return convertEmptyToNull(_blknm);
    }

    /**
     * [set] BLKNM: {varchar(30)} <br>
     * @param blknm The value of the column 'BLKNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBlknm(String blknm) {
        registerModifiedProperty("blknm");
        _blknm = blknm;
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
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
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
     * [get] LOCATION_ID: {bigint(19)} <br>
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] USER_NM: {varchar(60)} <br>
     * @return The value of the column 'USER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserNm() {
        checkSpecifiedProperty("userNm");
        return convertEmptyToNull(_userNm);
    }

    /**
     * [set] USER_NM: {varchar(60)} <br>
     * @param userNm The value of the column 'USER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserNm(String userNm) {
        registerModifiedProperty("userNm");
        _userNm = userNm;
    }

    /**
     * [get] ZONE: {varchar(6)} <br>
     * @return The value of the column 'ZONE'. (NullAllowed even if selected: for no constraint)
     */
    public String getZone() {
        checkSpecifiedProperty("zone");
        return convertEmptyToNull(_zone);
    }

    /**
     * [set] ZONE: {varchar(6)} <br>
     * @param zone The value of the column 'ZONE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZone(String zone) {
        registerModifiedProperty("zone");
        _zone = zone;
    }

    /**
     * [get] ALLOC_ORDER: {bigint(19)} <br>
     * @return The value of the column 'ALLOC_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocOrder() {
        checkSpecifiedProperty("allocOrder");
        return _allocOrder;
    }

    /**
     * [set] ALLOC_ORDER: {bigint(19)} <br>
     * @param allocOrder The value of the column 'ALLOC_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocOrder(Long allocOrder) {
        registerModifiedProperty("allocOrder");
        _allocOrder = allocOrder;
    }

    /**
     * [get] LOCATION_TYPE: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationType() {
        checkSpecifiedProperty("locationType");
        return convertEmptyToNull(_locationType);
    }

    /**
     * [set] LOCATION_TYPE: {varchar(30)} <br>
     * @param locationType The value of the column 'LOCATION_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationType(String locationType) {
        registerModifiedProperty("locationType");
        _locationType = locationType;
    }

    /**
     * [get] REPLENISH_PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'REPLENISH_PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReplenishProductId() {
        checkSpecifiedProperty("replenishProductId");
        return _replenishProductId;
    }

    /**
     * [set] REPLENISH_PRODUCT_ID: {bigint(19)} <br>
     * @param replenishProductId The value of the column 'REPLENISH_PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishProductId(Long replenishProductId) {
        registerModifiedProperty("replenishProductId");
        _replenishProductId = replenishProductId;
    }

    /**
     * [get] REPLENISH_STOCK_TYPE_ID: {bigint(19)} <br>
     * @return The value of the column 'REPLENISH_STOCK_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReplenishStockTypeId() {
        checkSpecifiedProperty("replenishStockTypeId");
        return _replenishStockTypeId;
    }

    /**
     * [set] REPLENISH_STOCK_TYPE_ID: {bigint(19)} <br>
     * @param replenishStockTypeId The value of the column 'REPLENISH_STOCK_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishStockTypeId(Long replenishStockTypeId) {
        registerModifiedProperty("replenishStockTypeId");
        _replenishStockTypeId = replenishStockTypeId;
    }

    /**
     * [get] REPLENISH_DEPOSIT_ID: {bigint(19)} <br>
     * @return The value of the column 'REPLENISH_DEPOSIT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReplenishDepositId() {
        checkSpecifiedProperty("replenishDepositId");
        return _replenishDepositId;
    }

    /**
     * [set] REPLENISH_DEPOSIT_ID: {bigint(19)} <br>
     * @param replenishDepositId The value of the column 'REPLENISH_DEPOSIT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishDepositId(Long replenishDepositId) {
        registerModifiedProperty("replenishDepositId");
        _replenishDepositId = replenishDepositId;
    }

    /**
     * [get] REPLENISH_P_PRODUCT_SHAPE_ID: {bigint(19)} <br>
     * @return The value of the column 'REPLENISH_P_PRODUCT_SHAPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReplenishPProductShapeId() {
        checkSpecifiedProperty("replenishPProductShapeId");
        return _replenishPProductShapeId;
    }

    /**
     * [set] REPLENISH_P_PRODUCT_SHAPE_ID: {bigint(19)} <br>
     * @param replenishPProductShapeId The value of the column 'REPLENISH_P_PRODUCT_SHAPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReplenishPProductShapeId(Long replenishPProductShapeId) {
        registerModifiedProperty("replenishPProductShapeId");
        _replenishPProductShapeId = replenishPProductShapeId;
    }

    /**
     * [get] MAX_STORE_PRODUCT_SHAPE_ID: {bigint(19)} <br>
     * @return The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMaxStoreProductShapeId() {
        checkSpecifiedProperty("maxStoreProductShapeId");
        return _maxStoreProductShapeId;
    }

    /**
     * [set] MAX_STORE_PRODUCT_SHAPE_ID: {bigint(19)} <br>
     * @param maxStoreProductShapeId The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxStoreProductShapeId(Long maxStoreProductShapeId) {
        registerModifiedProperty("maxStoreProductShapeId");
        _maxStoreProductShapeId = maxStoreProductShapeId;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {int(10)} <br>
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {int(10)} <br>
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Integer controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_PROCESS: {int(10)} <br>
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {int(10)} <br>
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(Integer addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }
}
