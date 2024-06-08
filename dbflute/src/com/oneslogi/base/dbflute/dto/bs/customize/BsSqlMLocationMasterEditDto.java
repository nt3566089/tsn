package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlMLocationMasterEdit. <br>
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
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsSqlMLocationMasterEditDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** LocGroup: {varchar(30)} */
    @JsonKey
    protected String _locGroup;

    /** LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** ALLOC_NG_FLG: {char(1)} */
    @JsonKey
    protected String _allocNgFlg;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** LOCATION_NM: {varchar(60)} */
    @JsonKey
    protected String _locationNm;

    /** PICKING_ORDER: {bigint(19)} */
    @JsonKey
    protected Long _pickingOrder;

    /** PALLETECAPACITY: {bigint(19)} */
    @JsonKey
    protected Long _palletecapacity;

    /** MAX_STORE_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _maxStoreNum;

    /** LINBLK: {varchar(30)} */
    @JsonKey
    protected String _linblk;

    /** LOCID: {varchar(30)} */
    @JsonKey
    protected String _locid;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** BRCTG: {bigint(19)} */
    @JsonKey
    protected Long _brctg;

    /** SPLREVUN: {varchar(30)} */
    @JsonKey
    protected String _splrevun;

    /** SPLREVCTQA: {bigint(19)} */
    @JsonKey
    protected Long _splrevctqa;

    /** REPLENISH_P_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _replenishPNum;

    /** BSSPLPT: {varchar(30)} */
    @JsonKey
    protected String _bssplpt;

    /** TOSPLMD: {varchar(30)} */
    @JsonKey
    protected String _tosplmd;

    /** PRESPLMD: {varchar(30)} */
    @JsonKey
    protected String _presplmd;

    /** TRANSPORTPRIORITY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _transportpriority;

    /** VIRTUALLOCFLG: {char(1)} */
    @JsonKey
    protected String _virtuallocflg;

    /** LINNM: {varchar(30)} */
    @JsonKey
    protected String _linnm;

    /** BLKNM: {varchar(30)} */
    @JsonKey
    protected String _blknm;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    @JsonKey
    protected String _centerNm;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    @JsonKey
    protected String _clientNm;

    /** LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _locationId;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** USER_NM: {varchar(60)} */
    @JsonKey
    protected String _userNm;

    /** ZONE: {varchar(6)} */
    @JsonKey
    protected String _zone;

    /** ALLOC_ORDER: {bigint(19)} */
    @JsonKey
    protected Long _allocOrder;

    /** LOCATION_TYPE: {varchar(30)} */
    @JsonKey
    protected String _locationType;

    /** REPLENISH_PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _replenishProductId;

    /** REPLENISH_STOCK_TYPE_ID: {bigint(19)} */
    @JsonKey
    protected Long _replenishStockTypeId;

    /** REPLENISH_DEPOSIT_ID: {bigint(19)} */
    @JsonKey
    protected Long _replenishDepositId;

    /** REPLENISH_P_PRODUCT_SHAPE_ID: {bigint(19)} */
    @JsonKey
    protected Long _replenishPProductShapeId;

    /** MAX_STORE_PRODUCT_SHAPE_ID: {bigint(19)} */
    @JsonKey
    protected Long _maxStoreProductShapeId;

    /** VERSION_NO: {bigint(19)} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {int(10)} */
    @JsonKey
    protected Integer _controlNo;

    /** ADD_PROCESS: {int(10)} */
    @JsonKey
    protected Integer _addProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlMLocationMasterEditDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsSqlMLocationMasterEditDto)) { return false; }
        final BsSqlMLocationMasterEditDto otherEntity = (BsSqlMLocationMasterEditDto)other;
        if (!helpComparingValue(getLocGroup(), otherEntity.getLocGroup())) { return false; }
        if (!helpComparingValue(getLocationCd(), otherEntity.getLocationCd())) { return false; }
        if (!helpComparingValue(getAllocNgFlg(), otherEntity.getAllocNgFlg())) { return false; }
        if (!helpComparingValue(getDelFlg(), otherEntity.getDelFlg())) { return false; }
        if (!helpComparingValue(getLocationNm(), otherEntity.getLocationNm())) { return false; }
        if (!helpComparingValue(getPickingOrder(), otherEntity.getPickingOrder())) { return false; }
        if (!helpComparingValue(getPalletecapacity(), otherEntity.getPalletecapacity())) { return false; }
        if (!helpComparingValue(getMaxStoreNum(), otherEntity.getMaxStoreNum())) { return false; }
        if (!helpComparingValue(getLinblk(), otherEntity.getLinblk())) { return false; }
        if (!helpComparingValue(getLocid(), otherEntity.getLocid())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getBrctg(), otherEntity.getBrctg())) { return false; }
        if (!helpComparingValue(getSplrevun(), otherEntity.getSplrevun())) { return false; }
        if (!helpComparingValue(getSplrevctqa(), otherEntity.getSplrevctqa())) { return false; }
        if (!helpComparingValue(getReplenishPNum(), otherEntity.getReplenishPNum())) { return false; }
        if (!helpComparingValue(getBssplpt(), otherEntity.getBssplpt())) { return false; }
        if (!helpComparingValue(getTosplmd(), otherEntity.getTosplmd())) { return false; }
        if (!helpComparingValue(getPresplmd(), otherEntity.getPresplmd())) { return false; }
        if (!helpComparingValue(getTransportpriority(), otherEntity.getTransportpriority())) { return false; }
        if (!helpComparingValue(getVirtuallocflg(), otherEntity.getVirtuallocflg())) { return false; }
        if (!helpComparingValue(getLinnm(), otherEntity.getLinnm())) { return false; }
        if (!helpComparingValue(getBlknm(), otherEntity.getBlknm())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getLocationId(), otherEntity.getLocationId())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getUserNm(), otherEntity.getUserNm())) { return false; }
        if (!helpComparingValue(getZone(), otherEntity.getZone())) { return false; }
        if (!helpComparingValue(getAllocOrder(), otherEntity.getAllocOrder())) { return false; }
        if (!helpComparingValue(getLocationType(), otherEntity.getLocationType())) { return false; }
        if (!helpComparingValue(getReplenishProductId(), otherEntity.getReplenishProductId())) { return false; }
        if (!helpComparingValue(getReplenishStockTypeId(), otherEntity.getReplenishStockTypeId())) { return false; }
        if (!helpComparingValue(getReplenishDepositId(), otherEntity.getReplenishDepositId())) { return false; }
        if (!helpComparingValue(getReplenishPProductShapeId(), otherEntity.getReplenishPProductShapeId())) { return false; }
        if (!helpComparingValue(getMaxStoreProductShapeId(), otherEntity.getMaxStoreProductShapeId())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getControlNo(), otherEntity.getControlNo())) { return false; }
        if (!helpComparingValue(getAddProcess(), otherEntity.getAddProcess())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlMLocationMasterEdit");
        result = xCH(result, getLocGroup());
        result = xCH(result, getLocationCd());
        result = xCH(result, getAllocNgFlg());
        result = xCH(result, getDelFlg());
        result = xCH(result, getLocationNm());
        result = xCH(result, getPickingOrder());
        result = xCH(result, getPalletecapacity());
        result = xCH(result, getMaxStoreNum());
        result = xCH(result, getLinblk());
        result = xCH(result, getLocid());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getBrctg());
        result = xCH(result, getSplrevun());
        result = xCH(result, getSplrevctqa());
        result = xCH(result, getReplenishPNum());
        result = xCH(result, getBssplpt());
        result = xCH(result, getTosplmd());
        result = xCH(result, getPresplmd());
        result = xCH(result, getTransportpriority());
        result = xCH(result, getVirtuallocflg());
        result = xCH(result, getLinnm());
        result = xCH(result, getBlknm());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getClientId());
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
        result = xCH(result, getLocationId());
        result = xCH(result, getUpdDt());
        result = xCH(result, getUserNm());
        result = xCH(result, getZone());
        result = xCH(result, getAllocOrder());
        result = xCH(result, getLocationType());
        result = xCH(result, getReplenishProductId());
        result = xCH(result, getReplenishStockTypeId());
        result = xCH(result, getReplenishDepositId());
        result = xCH(result, getReplenishPProductShapeId());
        result = xCH(result, getMaxStoreProductShapeId());
        result = xCH(result, getVersionNo());
        result = xCH(result, getControlNo());
        result = xCH(result, getAddProcess());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getLocGroup());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getAllocNgFlg());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getLocationNm());
        sb.append(c).append(getPickingOrder());
        sb.append(c).append(getPalletecapacity());
        sb.append(c).append(getMaxStoreNum());
        sb.append(c).append(getLinblk());
        sb.append(c).append(getLocid());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getBrctg());
        sb.append(c).append(getSplrevun());
        sb.append(c).append(getSplrevctqa());
        sb.append(c).append(getReplenishPNum());
        sb.append(c).append(getBssplpt());
        sb.append(c).append(getTosplmd());
        sb.append(c).append(getPresplmd());
        sb.append(c).append(getTransportpriority());
        sb.append(c).append(getVirtuallocflg());
        sb.append(c).append(getLinnm());
        sb.append(c).append(getBlknm());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUserNm());
        sb.append(c).append(getZone());
        sb.append(c).append(getAllocOrder());
        sb.append(c).append(getLocationType());
        sb.append(c).append(getReplenishProductId());
        sb.append(c).append(getReplenishStockTypeId());
        sb.append(c).append(getReplenishDepositId());
        sb.append(c).append(getReplenishPProductShapeId());
        sb.append(c).append(getMaxStoreProductShapeId());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LocGroup: {varchar(30)} <br>
     * @return The value of the column 'LocGroup'. (NullAllowed)
     */
    public String getLocGroup() {
        return _locGroup;
    }

    /**
     * [set] LocGroup: {varchar(30)} <br>
     * @param locGroup The value of the column 'LocGroup'. (NullAllowed)
     */
    public void setLocGroup(String locGroup) {
        __modifiedProperties.add("locGroup");
        this._locGroup = locGroup;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] ALLOC_NG_FLG: {char(1)} <br>
     * @return The value of the column 'ALLOC_NG_FLG'. (NullAllowed)
     */
    public String getAllocNgFlg() {
        return _allocNgFlg;
    }

    /**
     * [set] ALLOC_NG_FLG: {char(1)} <br>
     * @param allocNgFlg The value of the column 'ALLOC_NG_FLG'. (NullAllowed)
     */
    public void setAllocNgFlg(String allocNgFlg) {
        __modifiedProperties.add("allocNgFlg");
        this._allocNgFlg = allocNgFlg;
    }

    /**
     * [get] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] LOCATION_NM: {varchar(60)} <br>
     * @return The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public String getLocationNm() {
        return _locationNm;
    }

    /**
     * [set] LOCATION_NM: {varchar(60)} <br>
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public void setLocationNm(String locationNm) {
        __modifiedProperties.add("locationNm");
        this._locationNm = locationNm;
    }

    /**
     * [get] PICKING_ORDER: {bigint(19)} <br>
     * @return The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public Long getPickingOrder() {
        return _pickingOrder;
    }

    /**
     * [set] PICKING_ORDER: {bigint(19)} <br>
     * @param pickingOrder The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public void setPickingOrder(Long pickingOrder) {
        __modifiedProperties.add("pickingOrder");
        this._pickingOrder = pickingOrder;
    }

    /**
     * [get] PALLETECAPACITY: {bigint(19)} <br>
     * @return The value of the column 'PALLETECAPACITY'. (NullAllowed)
     */
    public Long getPalletecapacity() {
        return _palletecapacity;
    }

    /**
     * [set] PALLETECAPACITY: {bigint(19)} <br>
     * @param palletecapacity The value of the column 'PALLETECAPACITY'. (NullAllowed)
     */
    public void setPalletecapacity(Long palletecapacity) {
        __modifiedProperties.add("palletecapacity");
        this._palletecapacity = palletecapacity;
    }

    /**
     * [get] MAX_STORE_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'MAX_STORE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getMaxStoreNum() {
        return _maxStoreNum;
    }

    /**
     * [set] MAX_STORE_NUM: {decimal(16, 6)} <br>
     * @param maxStoreNum The value of the column 'MAX_STORE_NUM'. (NullAllowed)
     */
    public void setMaxStoreNum(java.math.BigDecimal maxStoreNum) {
        __modifiedProperties.add("maxStoreNum");
        this._maxStoreNum = maxStoreNum;
    }

    /**
     * [get] LINBLK: {varchar(30)} <br>
     * @return The value of the column 'LINBLK'. (NullAllowed)
     */
    public String getLinblk() {
        return _linblk;
    }

    /**
     * [set] LINBLK: {varchar(30)} <br>
     * @param linblk The value of the column 'LINBLK'. (NullAllowed)
     */
    public void setLinblk(String linblk) {
        __modifiedProperties.add("linblk");
        this._linblk = linblk;
    }

    /**
     * [get] LOCID: {varchar(30)} <br>
     * @return The value of the column 'LOCID'. (NullAllowed)
     */
    public String getLocid() {
        return _locid;
    }

    /**
     * [set] LOCID: {varchar(30)} <br>
     * @param locid The value of the column 'LOCID'. (NullAllowed)
     */
    public void setLocid(String locid) {
        __modifiedProperties.add("locid");
        this._locid = locid;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] BRCTG: {bigint(19)} <br>
     * @return The value of the column 'BRCTG'. (NullAllowed)
     */
    public Long getBrctg() {
        return _brctg;
    }

    /**
     * [set] BRCTG: {bigint(19)} <br>
     * @param brctg The value of the column 'BRCTG'. (NullAllowed)
     */
    public void setBrctg(Long brctg) {
        __modifiedProperties.add("brctg");
        this._brctg = brctg;
    }

    /**
     * [get] SPLREVUN: {varchar(30)} <br>
     * @return The value of the column 'SPLREVUN'. (NullAllowed)
     */
    public String getSplrevun() {
        return _splrevun;
    }

    /**
     * [set] SPLREVUN: {varchar(30)} <br>
     * @param splrevun The value of the column 'SPLREVUN'. (NullAllowed)
     */
    public void setSplrevun(String splrevun) {
        __modifiedProperties.add("splrevun");
        this._splrevun = splrevun;
    }

    /**
     * [get] SPLREVCTQA: {bigint(19)} <br>
     * @return The value of the column 'SPLREVCTQA'. (NullAllowed)
     */
    public Long getSplrevctqa() {
        return _splrevctqa;
    }

    /**
     * [set] SPLREVCTQA: {bigint(19)} <br>
     * @param splrevctqa The value of the column 'SPLREVCTQA'. (NullAllowed)
     */
    public void setSplrevctqa(Long splrevctqa) {
        __modifiedProperties.add("splrevctqa");
        this._splrevctqa = splrevctqa;
    }

    /**
     * [get] REPLENISH_P_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'REPLENISH_P_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getReplenishPNum() {
        return _replenishPNum;
    }

    /**
     * [set] REPLENISH_P_NUM: {decimal(16, 6)} <br>
     * @param replenishPNum The value of the column 'REPLENISH_P_NUM'. (NullAllowed)
     */
    public void setReplenishPNum(java.math.BigDecimal replenishPNum) {
        __modifiedProperties.add("replenishPNum");
        this._replenishPNum = replenishPNum;
    }

    /**
     * [get] BSSPLPT: {varchar(30)} <br>
     * @return The value of the column 'BSSPLPT'. (NullAllowed)
     */
    public String getBssplpt() {
        return _bssplpt;
    }

    /**
     * [set] BSSPLPT: {varchar(30)} <br>
     * @param bssplpt The value of the column 'BSSPLPT'. (NullAllowed)
     */
    public void setBssplpt(String bssplpt) {
        __modifiedProperties.add("bssplpt");
        this._bssplpt = bssplpt;
    }

    /**
     * [get] TOSPLMD: {varchar(30)} <br>
     * @return The value of the column 'TOSPLMD'. (NullAllowed)
     */
    public String getTosplmd() {
        return _tosplmd;
    }

    /**
     * [set] TOSPLMD: {varchar(30)} <br>
     * @param tosplmd The value of the column 'TOSPLMD'. (NullAllowed)
     */
    public void setTosplmd(String tosplmd) {
        __modifiedProperties.add("tosplmd");
        this._tosplmd = tosplmd;
    }

    /**
     * [get] PRESPLMD: {varchar(30)} <br>
     * @return The value of the column 'PRESPLMD'. (NullAllowed)
     */
    public String getPresplmd() {
        return _presplmd;
    }

    /**
     * [set] PRESPLMD: {varchar(30)} <br>
     * @param presplmd The value of the column 'PRESPLMD'. (NullAllowed)
     */
    public void setPresplmd(String presplmd) {
        __modifiedProperties.add("presplmd");
        this._presplmd = presplmd;
    }

    /**
     * [get] TRANSPORTPRIORITY: {decimal(16, 6)} <br>
     * @return The value of the column 'TRANSPORTPRIORITY'. (NullAllowed)
     */
    public java.math.BigDecimal getTransportpriority() {
        return _transportpriority;
    }

    /**
     * [set] TRANSPORTPRIORITY: {decimal(16, 6)} <br>
     * @param transportpriority The value of the column 'TRANSPORTPRIORITY'. (NullAllowed)
     */
    public void setTransportpriority(java.math.BigDecimal transportpriority) {
        __modifiedProperties.add("transportpriority");
        this._transportpriority = transportpriority;
    }

    /**
     * [get] VIRTUALLOCFLG: {char(1)} <br>
     * @return The value of the column 'VIRTUALLOCFLG'. (NullAllowed)
     */
    public String getVirtuallocflg() {
        return _virtuallocflg;
    }

    /**
     * [set] VIRTUALLOCFLG: {char(1)} <br>
     * @param virtuallocflg The value of the column 'VIRTUALLOCFLG'. (NullAllowed)
     */
    public void setVirtuallocflg(String virtuallocflg) {
        __modifiedProperties.add("virtuallocflg");
        this._virtuallocflg = virtuallocflg;
    }

    /**
     * [get] LINNM: {varchar(30)} <br>
     * @return The value of the column 'LINNM'. (NullAllowed)
     */
    public String getLinnm() {
        return _linnm;
    }

    /**
     * [set] LINNM: {varchar(30)} <br>
     * @param linnm The value of the column 'LINNM'. (NullAllowed)
     */
    public void setLinnm(String linnm) {
        __modifiedProperties.add("linnm");
        this._linnm = linnm;
    }

    /**
     * [get] BLKNM: {varchar(30)} <br>
     * @return The value of the column 'BLKNM'. (NullAllowed)
     */
    public String getBlknm() {
        return _blknm;
    }

    /**
     * [set] BLKNM: {varchar(30)} <br>
     * @param blknm The value of the column 'BLKNM'. (NullAllowed)
     */
    public void setBlknm(String blknm) {
        __modifiedProperties.add("blknm");
        this._blknm = blknm;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] USER_NM: {varchar(60)} <br>
     * @return The value of the column 'USER_NM'. (NullAllowed)
     */
    public String getUserNm() {
        return _userNm;
    }

    /**
     * [set] USER_NM: {varchar(60)} <br>
     * @param userNm The value of the column 'USER_NM'. (NullAllowed)
     */
    public void setUserNm(String userNm) {
        __modifiedProperties.add("userNm");
        this._userNm = userNm;
    }

    /**
     * [get] ZONE: {varchar(6)} <br>
     * @return The value of the column 'ZONE'. (NullAllowed)
     */
    public String getZone() {
        return _zone;
    }

    /**
     * [set] ZONE: {varchar(6)} <br>
     * @param zone The value of the column 'ZONE'. (NullAllowed)
     */
    public void setZone(String zone) {
        __modifiedProperties.add("zone");
        this._zone = zone;
    }

    /**
     * [get] ALLOC_ORDER: {bigint(19)} <br>
     * @return The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public Long getAllocOrder() {
        return _allocOrder;
    }

    /**
     * [set] ALLOC_ORDER: {bigint(19)} <br>
     * @param allocOrder The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public void setAllocOrder(Long allocOrder) {
        __modifiedProperties.add("allocOrder");
        this._allocOrder = allocOrder;
    }

    /**
     * [get] LOCATION_TYPE: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_TYPE'. (NullAllowed)
     */
    public String getLocationType() {
        return _locationType;
    }

    /**
     * [set] LOCATION_TYPE: {varchar(30)} <br>
     * @param locationType The value of the column 'LOCATION_TYPE'. (NullAllowed)
     */
    public void setLocationType(String locationType) {
        __modifiedProperties.add("locationType");
        this._locationType = locationType;
    }

    /**
     * [get] REPLENISH_PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'REPLENISH_PRODUCT_ID'. (NullAllowed)
     */
    public Long getReplenishProductId() {
        return _replenishProductId;
    }

    /**
     * [set] REPLENISH_PRODUCT_ID: {bigint(19)} <br>
     * @param replenishProductId The value of the column 'REPLENISH_PRODUCT_ID'. (NullAllowed)
     */
    public void setReplenishProductId(Long replenishProductId) {
        __modifiedProperties.add("replenishProductId");
        this._replenishProductId = replenishProductId;
    }

    /**
     * [get] REPLENISH_STOCK_TYPE_ID: {bigint(19)} <br>
     * @return The value of the column 'REPLENISH_STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getReplenishStockTypeId() {
        return _replenishStockTypeId;
    }

    /**
     * [set] REPLENISH_STOCK_TYPE_ID: {bigint(19)} <br>
     * @param replenishStockTypeId The value of the column 'REPLENISH_STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setReplenishStockTypeId(Long replenishStockTypeId) {
        __modifiedProperties.add("replenishStockTypeId");
        this._replenishStockTypeId = replenishStockTypeId;
    }

    /**
     * [get] REPLENISH_DEPOSIT_ID: {bigint(19)} <br>
     * @return The value of the column 'REPLENISH_DEPOSIT_ID'. (NullAllowed)
     */
    public Long getReplenishDepositId() {
        return _replenishDepositId;
    }

    /**
     * [set] REPLENISH_DEPOSIT_ID: {bigint(19)} <br>
     * @param replenishDepositId The value of the column 'REPLENISH_DEPOSIT_ID'. (NullAllowed)
     */
    public void setReplenishDepositId(Long replenishDepositId) {
        __modifiedProperties.add("replenishDepositId");
        this._replenishDepositId = replenishDepositId;
    }

    /**
     * [get] REPLENISH_P_PRODUCT_SHAPE_ID: {bigint(19)} <br>
     * @return The value of the column 'REPLENISH_P_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public Long getReplenishPProductShapeId() {
        return _replenishPProductShapeId;
    }

    /**
     * [set] REPLENISH_P_PRODUCT_SHAPE_ID: {bigint(19)} <br>
     * @param replenishPProductShapeId The value of the column 'REPLENISH_P_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public void setReplenishPProductShapeId(Long replenishPProductShapeId) {
        __modifiedProperties.add("replenishPProductShapeId");
        this._replenishPProductShapeId = replenishPProductShapeId;
    }

    /**
     * [get] MAX_STORE_PRODUCT_SHAPE_ID: {bigint(19)} <br>
     * @return The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public Long getMaxStoreProductShapeId() {
        return _maxStoreProductShapeId;
    }

    /**
     * [set] MAX_STORE_PRODUCT_SHAPE_ID: {bigint(19)} <br>
     * @param maxStoreProductShapeId The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public void setMaxStoreProductShapeId(Long maxStoreProductShapeId) {
        __modifiedProperties.add("maxStoreProductShapeId");
        this._maxStoreProductShapeId = maxStoreProductShapeId;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {int(10)} <br>
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Integer getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {int(10)} <br>
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Integer controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_PROCESS: {int(10)} <br>
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public Integer getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {int(10)} <br>
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(Integer addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

}
