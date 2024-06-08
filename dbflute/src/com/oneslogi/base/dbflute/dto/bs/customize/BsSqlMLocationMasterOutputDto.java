package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlMLocationMasterOutput. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LIN_BLK, SORT_CENTER, LOCATION_CD, PRODUCT_CD, PRODUCT_NM, STOCK_BOX, STOCK_CARTON, LOCID, LOCID_NM, BRCTG, TOSPLMD, PRESPLMD, SPLREVUN, SPLREVUN_NM, SPLREVCTQA, REPLENISH_P_NUM, BSSPLPT, TO_REPLENISH_P_NUM, TO_REPLENISH_P_QTY, PRE_REPLENISH_P_NUM, PRE_REPLENISH_P_QTY, CREATEDATE
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
public abstract class BsSqlMLocationMasterOutputDto implements Serializable {

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
    /** LIN_BLK: {varchar(30)} */
    @JsonKey
    protected String _linBlk;

    /** SORT_CENTER: {varchar(60)} */
    @JsonKey
    protected String _sortCenter;

    /** LOCATION_CD: {varchar(10)} */
    @JsonKey
    protected String _locationCd;

    /** PRODUCT_CD: {varchar(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    @JsonKey
    protected String _productNm;

    /** STOCK_BOX: {decimal(38)} */
    @JsonKey
    protected java.math.BigDecimal _stockBox;

    /** STOCK_CARTON: {decimal(36)} */
    @JsonKey
    protected java.math.BigDecimal _stockCarton;

    /** LOCID: {varchar(30)} */
    @JsonKey
    protected String _locid;

    /** LOCID_NM: {int(10)} */
    @JsonKey
    protected String _locidNm;

    /** BRCTG: {bigint(19)} */
    @JsonKey
    protected Long _brctg;

    /** TOSPLMD: {varchar(30)} */
    @JsonKey
    protected String _tosplmd;

    /** PRESPLMD: {varchar(30)} */
    @JsonKey
    protected String _presplmd;

    /** SPLREVUN: {varchar(30)} */
    @JsonKey
    protected String _splrevun;

    /** SPLREVUN_NM: {int(10)} */
    @JsonKey
    protected String _splrevunNm;

    /** SPLREVCTQA: {bigint(19)} */
    @JsonKey
    protected Long _splrevctqa;

    /** REPLENISH_P_NUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _replenishPNum;

    /** BSSPLPT: {varchar(30)} */
    @JsonKey
    protected String _bssplpt;

    /** TO_REPLENISH_P_NUM: {decimal(36)} */
    @JsonKey
    protected java.math.BigDecimal _toReplenishPNum;

    /** TO_REPLENISH_P_QTY: {bigint(19)} */
    @JsonKey
    protected Long _toReplenishPQty;

    /** PRE_REPLENISH_P_NUM: {decimal(36)} */
    @JsonKey
    protected java.math.BigDecimal _preReplenishPNum;

    /** PRE_REPLENISH_P_QTY: {bigint(19)} */
    @JsonKey
    protected Long _preReplenishPQty;

    /** CREATEDATE: {nvarchar(4000)} */
    @JsonKey
    protected String _createdate;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlMLocationMasterOutputDto() {
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
        if (other == null || !(other instanceof BsSqlMLocationMasterOutputDto)) { return false; }
        final BsSqlMLocationMasterOutputDto otherEntity = (BsSqlMLocationMasterOutputDto)other;
        if (!helpComparingValue(getLinBlk(), otherEntity.getLinBlk())) { return false; }
        if (!helpComparingValue(getSortCenter(), otherEntity.getSortCenter())) { return false; }
        if (!helpComparingValue(getLocationCd(), otherEntity.getLocationCd())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getStockBox(), otherEntity.getStockBox())) { return false; }
        if (!helpComparingValue(getStockCarton(), otherEntity.getStockCarton())) { return false; }
        if (!helpComparingValue(getLocid(), otherEntity.getLocid())) { return false; }
        if (!helpComparingValue(getLocidNm(), otherEntity.getLocidNm())) { return false; }
        if (!helpComparingValue(getBrctg(), otherEntity.getBrctg())) { return false; }
        if (!helpComparingValue(getTosplmd(), otherEntity.getTosplmd())) { return false; }
        if (!helpComparingValue(getPresplmd(), otherEntity.getPresplmd())) { return false; }
        if (!helpComparingValue(getSplrevun(), otherEntity.getSplrevun())) { return false; }
        if (!helpComparingValue(getSplrevunNm(), otherEntity.getSplrevunNm())) { return false; }
        if (!helpComparingValue(getSplrevctqa(), otherEntity.getSplrevctqa())) { return false; }
        if (!helpComparingValue(getReplenishPNum(), otherEntity.getReplenishPNum())) { return false; }
        if (!helpComparingValue(getBssplpt(), otherEntity.getBssplpt())) { return false; }
        if (!helpComparingValue(getToReplenishPNum(), otherEntity.getToReplenishPNum())) { return false; }
        if (!helpComparingValue(getToReplenishPQty(), otherEntity.getToReplenishPQty())) { return false; }
        if (!helpComparingValue(getPreReplenishPNum(), otherEntity.getPreReplenishPNum())) { return false; }
        if (!helpComparingValue(getPreReplenishPQty(), otherEntity.getPreReplenishPQty())) { return false; }
        if (!helpComparingValue(getCreatedate(), otherEntity.getCreatedate())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlMLocationMasterOutput");
        result = xCH(result, getLinBlk());
        result = xCH(result, getSortCenter());
        result = xCH(result, getLocationCd());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getStockBox());
        result = xCH(result, getStockCarton());
        result = xCH(result, getLocid());
        result = xCH(result, getLocidNm());
        result = xCH(result, getBrctg());
        result = xCH(result, getTosplmd());
        result = xCH(result, getPresplmd());
        result = xCH(result, getSplrevun());
        result = xCH(result, getSplrevunNm());
        result = xCH(result, getSplrevctqa());
        result = xCH(result, getReplenishPNum());
        result = xCH(result, getBssplpt());
        result = xCH(result, getToReplenishPNum());
        result = xCH(result, getToReplenishPQty());
        result = xCH(result, getPreReplenishPNum());
        result = xCH(result, getPreReplenishPQty());
        result = xCH(result, getCreatedate());
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
        sb.append(c).append(getLinBlk());
        sb.append(c).append(getSortCenter());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getStockBox());
        sb.append(c).append(getStockCarton());
        sb.append(c).append(getLocid());
        sb.append(c).append(getLocidNm());
        sb.append(c).append(getBrctg());
        sb.append(c).append(getTosplmd());
        sb.append(c).append(getPresplmd());
        sb.append(c).append(getSplrevun());
        sb.append(c).append(getSplrevunNm());
        sb.append(c).append(getSplrevctqa());
        sb.append(c).append(getReplenishPNum());
        sb.append(c).append(getBssplpt());
        sb.append(c).append(getToReplenishPNum());
        sb.append(c).append(getToReplenishPQty());
        sb.append(c).append(getPreReplenishPNum());
        sb.append(c).append(getPreReplenishPQty());
        sb.append(c).append(getCreatedate());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LIN_BLK: {varchar(30)} <br>
     * @return The value of the column 'LIN_BLK'. (NullAllowed)
     */
    public String getLinBlk() {
        return _linBlk;
    }

    /**
     * [set] LIN_BLK: {varchar(30)} <br>
     * @param linBlk The value of the column 'LIN_BLK'. (NullAllowed)
     */
    public void setLinBlk(String linBlk) {
        __modifiedProperties.add("linBlk");
        this._linBlk = linBlk;
    }

    /**
     * [get] SORT_CENTER: {varchar(60)} <br>
     * @return The value of the column 'SORT_CENTER'. (NullAllowed)
     */
    public String getSortCenter() {
        return _sortCenter;
    }

    /**
     * [set] SORT_CENTER: {varchar(60)} <br>
     * @param sortCenter The value of the column 'SORT_CENTER'. (NullAllowed)
     */
    public void setSortCenter(String sortCenter) {
        __modifiedProperties.add("sortCenter");
        this._sortCenter = sortCenter;
    }

    /**
     * [get] LOCATION_CD: {varchar(10)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {varchar(10)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
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
     * [get] STOCK_BOX: {decimal(38)} <br>
     * @return The value of the column 'STOCK_BOX'. (NullAllowed)
     */
    public java.math.BigDecimal getStockBox() {
        return _stockBox;
    }

    /**
     * [set] STOCK_BOX: {decimal(38)} <br>
     * @param stockBox The value of the column 'STOCK_BOX'. (NullAllowed)
     */
    public void setStockBox(java.math.BigDecimal stockBox) {
        __modifiedProperties.add("stockBox");
        this._stockBox = stockBox;
    }

    /**
     * [get] STOCK_CARTON: {decimal(36)} <br>
     * @return The value of the column 'STOCK_CARTON'. (NullAllowed)
     */
    public java.math.BigDecimal getStockCarton() {
        return _stockCarton;
    }

    /**
     * [set] STOCK_CARTON: {decimal(36)} <br>
     * @param stockCarton The value of the column 'STOCK_CARTON'. (NullAllowed)
     */
    public void setStockCarton(java.math.BigDecimal stockCarton) {
        __modifiedProperties.add("stockCarton");
        this._stockCarton = stockCarton;
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
     * [get] LOCID_NM: {int(10)} <br>
     * @return The value of the column 'LOCID_NM'. (NullAllowed)
     */
    public String getLocidNm() {
        return _locidNm;
    }

    /**
     * [set] LOCID_NM: {int(10)} <br>
     * @param locidNm The value of the column 'LOCID_NM'. (NullAllowed)
     */
    public void setLocidNm(String locidNm) {
        __modifiedProperties.add("locidNm");
        this._locidNm = locidNm;
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
     * [get] SPLREVUN_NM: {int(10)} <br>
     * @return The value of the column 'SPLREVUN_NM'. (NullAllowed)
     */
    public String getSplrevunNm() {
        return _splrevunNm;
    }

    /**
     * [set] SPLREVUN_NM: {int(10)} <br>
     * @param splrevunNm The value of the column 'SPLREVUN_NM'. (NullAllowed)
     */
    public void setSplrevunNm(String splrevunNm) {
        __modifiedProperties.add("splrevunNm");
        this._splrevunNm = splrevunNm;
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
     * [get] TO_REPLENISH_P_NUM: {decimal(36)} <br>
     * @return The value of the column 'TO_REPLENISH_P_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getToReplenishPNum() {
        return _toReplenishPNum;
    }

    /**
     * [set] TO_REPLENISH_P_NUM: {decimal(36)} <br>
     * @param toReplenishPNum The value of the column 'TO_REPLENISH_P_NUM'. (NullAllowed)
     */
    public void setToReplenishPNum(java.math.BigDecimal toReplenishPNum) {
        __modifiedProperties.add("toReplenishPNum");
        this._toReplenishPNum = toReplenishPNum;
    }

    /**
     * [get] TO_REPLENISH_P_QTY: {bigint(19)} <br>
     * @return The value of the column 'TO_REPLENISH_P_QTY'. (NullAllowed)
     */
    public Long getToReplenishPQty() {
        return _toReplenishPQty;
    }

    /**
     * [set] TO_REPLENISH_P_QTY: {bigint(19)} <br>
     * @param toReplenishPQty The value of the column 'TO_REPLENISH_P_QTY'. (NullAllowed)
     */
    public void setToReplenishPQty(Long toReplenishPQty) {
        __modifiedProperties.add("toReplenishPQty");
        this._toReplenishPQty = toReplenishPQty;
    }

    /**
     * [get] PRE_REPLENISH_P_NUM: {decimal(36)} <br>
     * @return The value of the column 'PRE_REPLENISH_P_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getPreReplenishPNum() {
        return _preReplenishPNum;
    }

    /**
     * [set] PRE_REPLENISH_P_NUM: {decimal(36)} <br>
     * @param preReplenishPNum The value of the column 'PRE_REPLENISH_P_NUM'. (NullAllowed)
     */
    public void setPreReplenishPNum(java.math.BigDecimal preReplenishPNum) {
        __modifiedProperties.add("preReplenishPNum");
        this._preReplenishPNum = preReplenishPNum;
    }

    /**
     * [get] PRE_REPLENISH_P_QTY: {bigint(19)} <br>
     * @return The value of the column 'PRE_REPLENISH_P_QTY'. (NullAllowed)
     */
    public Long getPreReplenishPQty() {
        return _preReplenishPQty;
    }

    /**
     * [set] PRE_REPLENISH_P_QTY: {bigint(19)} <br>
     * @param preReplenishPQty The value of the column 'PRE_REPLENISH_P_QTY'. (NullAllowed)
     */
    public void setPreReplenishPQty(Long preReplenishPQty) {
        __modifiedProperties.add("preReplenishPQty");
        this._preReplenishPQty = preReplenishPQty;
    }

    /**
     * [get] CREATEDATE: {nvarchar(4000)} <br>
     * @return The value of the column 'CREATEDATE'. (NullAllowed)
     */
    public String getCreatedate() {
        return _createdate;
    }

    /**
     * [set] CREATEDATE: {nvarchar(4000)} <br>
     * @param createdate The value of the column 'CREATEDATE'. (NullAllowed)
     */
    public void setCreatedate(String createdate) {
        __modifiedProperties.add("createdate");
        this._createdate = createdate;
    }

}
