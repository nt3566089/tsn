package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlMLocationMasterOutput. <br>
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
 * String linBlk = entity.getLinBlk();
 * String sortCenter = entity.getSortCenter();
 * String locationCd = entity.getLocationCd();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * java.math.BigDecimal stockBox = entity.getStockBox();
 * java.math.BigDecimal stockCarton = entity.getStockCarton();
 * String locid = entity.getLocid();
 * String locidNm = entity.getLocidNm();
 * Long brctg = entity.getBrctg();
 * String tosplmd = entity.getTosplmd();
 * String presplmd = entity.getPresplmd();
 * String splrevun = entity.getSplrevun();
 * String splrevunNm = entity.getSplrevunNm();
 * Long splrevctqa = entity.getSplrevctqa();
 * java.math.BigDecimal replenishPNum = entity.getReplenishPNum();
 * String bssplpt = entity.getBssplpt();
 * java.math.BigDecimal toReplenishPNum = entity.getToReplenishPNum();
 * Long toReplenishPQty = entity.getToReplenishPQty();
 * java.math.BigDecimal preReplenishPNum = entity.getPreReplenishPNum();
 * Long preReplenishPQty = entity.getPreReplenishPQty();
 * String createdate = entity.getCreatedate();
 * entity.setLinBlk(linBlk);
 * entity.setSortCenter(sortCenter);
 * entity.setLocationCd(locationCd);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setStockBox(stockBox);
 * entity.setStockCarton(stockCarton);
 * entity.setLocid(locid);
 * entity.setLocidNm(locidNm);
 * entity.setBrctg(brctg);
 * entity.setTosplmd(tosplmd);
 * entity.setPresplmd(presplmd);
 * entity.setSplrevun(splrevun);
 * entity.setSplrevunNm(splrevunNm);
 * entity.setSplrevctqa(splrevctqa);
 * entity.setReplenishPNum(replenishPNum);
 * entity.setBssplpt(bssplpt);
 * entity.setToReplenishPNum(toReplenishPNum);
 * entity.setToReplenishPQty(toReplenishPQty);
 * entity.setPreReplenishPNum(preReplenishPNum);
 * entity.setPreReplenishPQty(preReplenishPQty);
 * entity.setCreatedate(createdate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlMLocationMasterOutput extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LIN_BLK: {varchar(30)} */
    protected String _linBlk;

    /** SORT_CENTER: {varchar(60)} */
    protected String _sortCenter;

    /** LOCATION_CD: {varchar(10)} */
    protected String _locationCd;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** STOCK_BOX: {decimal(38)} */
    protected java.math.BigDecimal _stockBox;

    /** STOCK_CARTON: {decimal(36)} */
    protected java.math.BigDecimal _stockCarton;

    /** LOCID: {varchar(30)} */
    protected String _locid;

    /** LOCID_NM: {int(10)} */
    protected String _locidNm;

    /** BRCTG: {bigint(19)} */
    protected Long _brctg;

    /** TOSPLMD: {varchar(30)} */
    protected String _tosplmd;

    /** PRESPLMD: {varchar(30)} */
    protected String _presplmd;

    /** SPLREVUN: {varchar(30)} */
    protected String _splrevun;

    /** SPLREVUN_NM: {int(10)} */
    protected String _splrevunNm;

    /** SPLREVCTQA: {bigint(19)} */
    protected Long _splrevctqa;

    /** REPLENISH_P_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _replenishPNum;

    /** BSSPLPT: {varchar(30)} */
    protected String _bssplpt;

    /** TO_REPLENISH_P_NUM: {decimal(36)} */
    protected java.math.BigDecimal _toReplenishPNum;

    /** TO_REPLENISH_P_QTY: {bigint(19)} */
    protected Long _toReplenishPQty;

    /** PRE_REPLENISH_P_NUM: {decimal(36)} */
    protected java.math.BigDecimal _preReplenishPNum;

    /** PRE_REPLENISH_P_QTY: {bigint(19)} */
    protected Long _preReplenishPQty;

    /** CREATEDATE: {nvarchar(4000)} */
    protected String _createdate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlMLocationMasterOutputDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlMLocationMasterOutput";
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
        if (obj instanceof BsSqlMLocationMasterOutput) {
            BsSqlMLocationMasterOutput other = (BsSqlMLocationMasterOutput)obj;
            if (!xSV(_linBlk, other._linBlk)) { return false; }
            if (!xSV(_sortCenter, other._sortCenter)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_stockBox, other._stockBox)) { return false; }
            if (!xSV(_stockCarton, other._stockCarton)) { return false; }
            if (!xSV(_locid, other._locid)) { return false; }
            if (!xSV(_locidNm, other._locidNm)) { return false; }
            if (!xSV(_brctg, other._brctg)) { return false; }
            if (!xSV(_tosplmd, other._tosplmd)) { return false; }
            if (!xSV(_presplmd, other._presplmd)) { return false; }
            if (!xSV(_splrevun, other._splrevun)) { return false; }
            if (!xSV(_splrevunNm, other._splrevunNm)) { return false; }
            if (!xSV(_splrevctqa, other._splrevctqa)) { return false; }
            if (!xSV(_replenishPNum, other._replenishPNum)) { return false; }
            if (!xSV(_bssplpt, other._bssplpt)) { return false; }
            if (!xSV(_toReplenishPNum, other._toReplenishPNum)) { return false; }
            if (!xSV(_toReplenishPQty, other._toReplenishPQty)) { return false; }
            if (!xSV(_preReplenishPNum, other._preReplenishPNum)) { return false; }
            if (!xSV(_preReplenishPQty, other._preReplenishPQty)) { return false; }
            if (!xSV(_createdate, other._createdate)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _linBlk);
        hs = xCH(hs, _sortCenter);
        hs = xCH(hs, _locationCd);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _stockBox);
        hs = xCH(hs, _stockCarton);
        hs = xCH(hs, _locid);
        hs = xCH(hs, _locidNm);
        hs = xCH(hs, _brctg);
        hs = xCH(hs, _tosplmd);
        hs = xCH(hs, _presplmd);
        hs = xCH(hs, _splrevun);
        hs = xCH(hs, _splrevunNm);
        hs = xCH(hs, _splrevctqa);
        hs = xCH(hs, _replenishPNum);
        hs = xCH(hs, _bssplpt);
        hs = xCH(hs, _toReplenishPNum);
        hs = xCH(hs, _toReplenishPQty);
        hs = xCH(hs, _preReplenishPNum);
        hs = xCH(hs, _preReplenishPQty);
        hs = xCH(hs, _createdate);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_linBlk));
        sb.append(dm).append(xfND(_sortCenter));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_stockBox));
        sb.append(dm).append(xfND(_stockCarton));
        sb.append(dm).append(xfND(_locid));
        sb.append(dm).append(xfND(_locidNm));
        sb.append(dm).append(xfND(_brctg));
        sb.append(dm).append(xfND(_tosplmd));
        sb.append(dm).append(xfND(_presplmd));
        sb.append(dm).append(xfND(_splrevun));
        sb.append(dm).append(xfND(_splrevunNm));
        sb.append(dm).append(xfND(_splrevctqa));
        sb.append(dm).append(xfND(_replenishPNum));
        sb.append(dm).append(xfND(_bssplpt));
        sb.append(dm).append(xfND(_toReplenishPNum));
        sb.append(dm).append(xfND(_toReplenishPQty));
        sb.append(dm).append(xfND(_preReplenishPNum));
        sb.append(dm).append(xfND(_preReplenishPQty));
        sb.append(dm).append(xfND(_createdate));
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
    public SqlMLocationMasterOutput clone() {
        return (SqlMLocationMasterOutput)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LIN_BLK: {varchar(30)} <br>
     * @return The value of the column 'LIN_BLK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinBlk() {
        checkSpecifiedProperty("linBlk");
        return convertEmptyToNull(_linBlk);
    }

    /**
     * [set] LIN_BLK: {varchar(30)} <br>
     * @param linBlk The value of the column 'LIN_BLK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinBlk(String linBlk) {
        registerModifiedProperty("linBlk");
        _linBlk = linBlk;
    }

    /**
     * [get] SORT_CENTER: {varchar(60)} <br>
     * @return The value of the column 'SORT_CENTER'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortCenter() {
        checkSpecifiedProperty("sortCenter");
        return convertEmptyToNull(_sortCenter);
    }

    /**
     * [set] SORT_CENTER: {varchar(60)} <br>
     * @param sortCenter The value of the column 'SORT_CENTER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortCenter(String sortCenter) {
        registerModifiedProperty("sortCenter");
        _sortCenter = sortCenter;
    }

    /**
     * [get] LOCATION_CD: {varchar(10)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(10)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
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
     * [get] STOCK_BOX: {decimal(38)} <br>
     * @return The value of the column 'STOCK_BOX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getStockBox() {
        checkSpecifiedProperty("stockBox");
        return _stockBox;
    }

    /**
     * [set] STOCK_BOX: {decimal(38)} <br>
     * @param stockBox The value of the column 'STOCK_BOX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockBox(java.math.BigDecimal stockBox) {
        registerModifiedProperty("stockBox");
        _stockBox = stockBox;
    }

    /**
     * [get] STOCK_CARTON: {decimal(36)} <br>
     * @return The value of the column 'STOCK_CARTON'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getStockCarton() {
        checkSpecifiedProperty("stockCarton");
        return _stockCarton;
    }

    /**
     * [set] STOCK_CARTON: {decimal(36)} <br>
     * @param stockCarton The value of the column 'STOCK_CARTON'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockCarton(java.math.BigDecimal stockCarton) {
        registerModifiedProperty("stockCarton");
        _stockCarton = stockCarton;
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
     * [get] LOCID_NM: {int(10)} <br>
     * @return The value of the column 'LOCID_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocidNm() {
        checkSpecifiedProperty("locidNm");
        return convertEmptyToNull(_locidNm);
    }

    /**
     * [set] LOCID_NM: {int(10)} <br>
     * @param locidNm The value of the column 'LOCID_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocidNm(String locidNm) {
        registerModifiedProperty("locidNm");
        _locidNm = locidNm;
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
     * [get] SPLREVUN_NM: {int(10)} <br>
     * @return The value of the column 'SPLREVUN_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSplrevunNm() {
        checkSpecifiedProperty("splrevunNm");
        return convertEmptyToNull(_splrevunNm);
    }

    /**
     * [set] SPLREVUN_NM: {int(10)} <br>
     * @param splrevunNm The value of the column 'SPLREVUN_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSplrevunNm(String splrevunNm) {
        registerModifiedProperty("splrevunNm");
        _splrevunNm = splrevunNm;
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
     * [get] TO_REPLENISH_P_NUM: {decimal(36)} <br>
     * @return The value of the column 'TO_REPLENISH_P_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getToReplenishPNum() {
        checkSpecifiedProperty("toReplenishPNum");
        return _toReplenishPNum;
    }

    /**
     * [set] TO_REPLENISH_P_NUM: {decimal(36)} <br>
     * @param toReplenishPNum The value of the column 'TO_REPLENISH_P_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToReplenishPNum(java.math.BigDecimal toReplenishPNum) {
        registerModifiedProperty("toReplenishPNum");
        _toReplenishPNum = toReplenishPNum;
    }

    /**
     * [get] TO_REPLENISH_P_QTY: {bigint(19)} <br>
     * @return The value of the column 'TO_REPLENISH_P_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getToReplenishPQty() {
        checkSpecifiedProperty("toReplenishPQty");
        return _toReplenishPQty;
    }

    /**
     * [set] TO_REPLENISH_P_QTY: {bigint(19)} <br>
     * @param toReplenishPQty The value of the column 'TO_REPLENISH_P_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToReplenishPQty(Long toReplenishPQty) {
        registerModifiedProperty("toReplenishPQty");
        _toReplenishPQty = toReplenishPQty;
    }

    /**
     * [get] PRE_REPLENISH_P_NUM: {decimal(36)} <br>
     * @return The value of the column 'PRE_REPLENISH_P_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPreReplenishPNum() {
        checkSpecifiedProperty("preReplenishPNum");
        return _preReplenishPNum;
    }

    /**
     * [set] PRE_REPLENISH_P_NUM: {decimal(36)} <br>
     * @param preReplenishPNum The value of the column 'PRE_REPLENISH_P_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPreReplenishPNum(java.math.BigDecimal preReplenishPNum) {
        registerModifiedProperty("preReplenishPNum");
        _preReplenishPNum = preReplenishPNum;
    }

    /**
     * [get] PRE_REPLENISH_P_QTY: {bigint(19)} <br>
     * @return The value of the column 'PRE_REPLENISH_P_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPreReplenishPQty() {
        checkSpecifiedProperty("preReplenishPQty");
        return _preReplenishPQty;
    }

    /**
     * [set] PRE_REPLENISH_P_QTY: {bigint(19)} <br>
     * @param preReplenishPQty The value of the column 'PRE_REPLENISH_P_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPreReplenishPQty(Long preReplenishPQty) {
        registerModifiedProperty("preReplenishPQty");
        _preReplenishPQty = preReplenishPQty;
    }

    /**
     * [get] CREATEDATE: {nvarchar(4000)} <br>
     * @return The value of the column 'CREATEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreatedate() {
        checkSpecifiedProperty("createdate");
        return convertEmptyToNull(_createdate);
    }

    /**
     * [set] CREATEDATE: {nvarchar(4000)} <br>
     * @param createdate The value of the column 'CREATEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreatedate(String createdate) {
        registerModifiedProperty("createdate");
        _createdate = createdate;
    }
}
