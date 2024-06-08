package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlBillOfLadingPrintSubReport. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INST_NUM2, TYPE, WEIGHT, PRODUCT_ABBR, NMFC_CODE, FREIGHT_CLS
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
 * Long instNum2 = entity.getInstNum2();
 * String type = entity.getType();
 * java.math.BigDecimal weight = entity.getWeight();
 * String productAbbr = entity.getProductAbbr();
 * String nmfcCode = entity.getNmfcCode();
 * String freightCls = entity.getFreightCls();
 * entity.setInstNum2(instNum2);
 * entity.setType(type);
 * entity.setWeight(weight);
 * entity.setProductAbbr(productAbbr);
 * entity.setNmfcCode(nmfcCode);
 * entity.setFreightCls(freightCls);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlBillOfLadingPrintSubReport extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INST_NUM2: {int(10)} */
    protected Long _instNum2;

    /** TYPE: {varchar(30)} */
    protected String _type;

    /** WEIGHT: {decimal(38, 6)} */
    protected java.math.BigDecimal _weight;

    /** PRODUCT_ABBR: {varchar(60)} */
    protected String _productAbbr;

    /** NMFC_CODE: {varchar(30)} */
    protected String _nmfcCode;

    /** FREIGHT_CLS: {varchar(100)} */
    protected String _freightCls;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlBillOfLadingPrintSubReportDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlBillOfLadingPrintSubReport";
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
        if (obj instanceof BsSqlBillOfLadingPrintSubReport) {
            BsSqlBillOfLadingPrintSubReport other = (BsSqlBillOfLadingPrintSubReport)obj;
            if (!xSV(_instNum2, other._instNum2)) { return false; }
            if (!xSV(_type, other._type)) { return false; }
            if (!xSV(_weight, other._weight)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_nmfcCode, other._nmfcCode)) { return false; }
            if (!xSV(_freightCls, other._freightCls)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _instNum2);
        hs = xCH(hs, _type);
        hs = xCH(hs, _weight);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _nmfcCode);
        hs = xCH(hs, _freightCls);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_instNum2));
        sb.append(dm).append(xfND(_type));
        sb.append(dm).append(xfND(_weight));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_nmfcCode));
        sb.append(dm).append(xfND(_freightCls));
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
    public SqlBillOfLadingPrintSubReport clone() {
        return (SqlBillOfLadingPrintSubReport)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INST_NUM2: {int(10)} <br>
     * @return The value of the column 'INST_NUM2'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInstNum2() {
        checkSpecifiedProperty("instNum2");
        return _instNum2;
    }

    /**
     * [set] INST_NUM2: {int(10)} <br>
     * @param instNum2 The value of the column 'INST_NUM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInstNum2(Long instNum2) {
        registerModifiedProperty("instNum2");
        _instNum2 = instNum2;
    }

    /**
     * [get] TYPE: {varchar(30)} <br>
     * @return The value of the column 'TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getType() {
        checkSpecifiedProperty("type");
        return convertEmptyToNull(_type);
    }

    /**
     * [set] TYPE: {varchar(30)} <br>
     * @param type The value of the column 'TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setType(String type) {
        registerModifiedProperty("type");
        _type = type;
    }

    /**
     * [get] WEIGHT: {decimal(38, 6)} <br>
     * @return The value of the column 'WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getWeight() {
        checkSpecifiedProperty("weight");
        return _weight;
    }

    /**
     * [set] WEIGHT: {decimal(38, 6)} <br>
     * @param weight The value of the column 'WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWeight(java.math.BigDecimal weight) {
        registerModifiedProperty("weight");
        _weight = weight;
    }

    /**
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
    }

    /**
     * [get] NMFC_CODE: {varchar(30)} <br>
     * @return The value of the column 'NMFC_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getNmfcCode() {
        checkSpecifiedProperty("nmfcCode");
        return convertEmptyToNull(_nmfcCode);
    }

    /**
     * [set] NMFC_CODE: {varchar(30)} <br>
     * @param nmfcCode The value of the column 'NMFC_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmfcCode(String nmfcCode) {
        registerModifiedProperty("nmfcCode");
        _nmfcCode = nmfcCode;
    }

    /**
     * [get] FREIGHT_CLS: {varchar(100)} <br>
     * @return The value of the column 'FREIGHT_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getFreightCls() {
        checkSpecifiedProperty("freightCls");
        return convertEmptyToNull(_freightCls);
    }

    /**
     * [set] FREIGHT_CLS: {varchar(100)} <br>
     * @param freightCls The value of the column 'FREIGHT_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFreightCls(String freightCls) {
        registerModifiedProperty("freightCls");
        _freightCls = freightCls;
    }
}
