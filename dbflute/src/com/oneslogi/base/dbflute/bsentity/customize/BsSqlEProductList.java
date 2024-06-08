package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlEProductList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PRODUCT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, LOT_MANAG_FLG, LOT_REVERSE_FLG, LIMIT_DT_MANAG_FLG, LIMIT_DT_REVERSE_FLG, RECEIVE_LIMIT_NUM, SHIPPING_LIMIT_NUM, MERGE_CLS, SHIPPING_STOP_FLG, FIXED_POINT, SHAPE_GRP_CD, LENGTH, WIDTH, HEIGHT, VOLUME, NET_WEIGHT, GROSS_WEIGHT, MESSAGE_NM
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
 * Long productId = entity.getProductId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String clientCd = entity.getClientCd();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String productAbbr = entity.getProductAbbr();
 * String janCd = entity.getJanCd();
 * String lotManagFlg = entity.getLotManagFlg();
 * String lotReverseFlg = entity.getLotReverseFlg();
 * String limitDtManagFlg = entity.getLimitDtManagFlg();
 * String limitDtReverseFlg = entity.getLimitDtReverseFlg();
 * String receiveLimitNum = entity.getReceiveLimitNum();
 * String shippingLimitNum = entity.getShippingLimitNum();
 * String mergeCls = entity.getMergeCls();
 * String shippingStopFlg = entity.getShippingStopFlg();
 * String fixedPoint = entity.getFixedPoint();
 * String shapeGrpCd = entity.getShapeGrpCd();
 * String length = entity.getLength();
 * String width = entity.getWidth();
 * String height = entity.getHeight();
 * String volume = entity.getVolume();
 * String netWeight = entity.getNetWeight();
 * String grossWeight = entity.getGrossWeight();
 * String messageNm = entity.getMessageNm();
 * entity.setProductId(productId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setClientCd(clientCd);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setProductAbbr(productAbbr);
 * entity.setJanCd(janCd);
 * entity.setLotManagFlg(lotManagFlg);
 * entity.setLotReverseFlg(lotReverseFlg);
 * entity.setLimitDtManagFlg(limitDtManagFlg);
 * entity.setLimitDtReverseFlg(limitDtReverseFlg);
 * entity.setReceiveLimitNum(receiveLimitNum);
 * entity.setShippingLimitNum(shippingLimitNum);
 * entity.setMergeCls(mergeCls);
 * entity.setShippingStopFlg(shippingStopFlg);
 * entity.setFixedPoint(fixedPoint);
 * entity.setShapeGrpCd(shapeGrpCd);
 * entity.setLength(length);
 * entity.setWidth(width);
 * entity.setHeight(height);
 * entity.setVolume(volume);
 * entity.setNetWeight(netWeight);
 * entity.setGrossWeight(grossWeight);
 * entity.setMessageNm(messageNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlEProductList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_ID: {bigint(19)} */
    protected Long _productId;

    /** RECEIVE_CD: {varchar(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {bigint(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {char(1)} */
    protected String _importFlg;

    /** ERROR_FLG: {char(1)} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** CLIENT_CD: {varchar(255)} */
    protected String _clientCd;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** PRODUCT_ABBR: {varchar(255)} */
    protected String _productAbbr;

    /** JAN_CD: {varchar(255)} */
    protected String _janCd;

    /** LOT_MANAG_FLG: {varchar(255)} */
    protected String _lotManagFlg;

    /** LOT_REVERSE_FLG: {varchar(255)} */
    protected String _lotReverseFlg;

    /** LIMIT_DT_MANAG_FLG: {varchar(255)} */
    protected String _limitDtManagFlg;

    /** LIMIT_DT_REVERSE_FLG: {varchar(255)} */
    protected String _limitDtReverseFlg;

    /** RECEIVE_LIMIT_NUM: {varchar(255)} */
    protected String _receiveLimitNum;

    /** SHIPPING_LIMIT_NUM: {varchar(255)} */
    protected String _shippingLimitNum;

    /** MERGE_CLS: {varchar(255)} */
    protected String _mergeCls;

    /** SHIPPING_STOP_FLG: {varchar(255)} */
    protected String _shippingStopFlg;

    /** FIXED_POINT: {varchar(255)} */
    protected String _fixedPoint;

    /** SHAPE_GRP_CD: {varchar(255)} */
    protected String _shapeGrpCd;

    /** LENGTH: {varchar(255)} */
    protected String _length;

    /** WIDTH: {varchar(255)} */
    protected String _width;

    /** HEIGHT: {varchar(255)} */
    protected String _height;

    /** VOLUME: {varchar(255)} */
    protected String _volume;

    /** NET_WEIGHT: {varchar(255)} */
    protected String _netWeight;

    /** GROSS_WEIGHT: {varchar(255)} */
    protected String _grossWeight;

    /** MESSAGE_NM: {varchar(4000)} */
    protected String _messageNm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlEProductListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlEProductList";
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
        if (obj instanceof BsSqlEProductList) {
            BsSqlEProductList other = (BsSqlEProductList)obj;
            if (!xSV(_productId, other._productId)) { return false; }
            if (!xSV(_receiveCd, other._receiveCd)) { return false; }
            if (!xSV(_receiveRowId, other._receiveRowId)) { return false; }
            if (!xSV(_importFlg, other._importFlg)) { return false; }
            if (!xSV(_errorFlg, other._errorFlg)) { return false; }
            if (!xSV(_errorMessageCd, other._errorMessageCd)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_janCd, other._janCd)) { return false; }
            if (!xSV(_lotManagFlg, other._lotManagFlg)) { return false; }
            if (!xSV(_lotReverseFlg, other._lotReverseFlg)) { return false; }
            if (!xSV(_limitDtManagFlg, other._limitDtManagFlg)) { return false; }
            if (!xSV(_limitDtReverseFlg, other._limitDtReverseFlg)) { return false; }
            if (!xSV(_receiveLimitNum, other._receiveLimitNum)) { return false; }
            if (!xSV(_shippingLimitNum, other._shippingLimitNum)) { return false; }
            if (!xSV(_mergeCls, other._mergeCls)) { return false; }
            if (!xSV(_shippingStopFlg, other._shippingStopFlg)) { return false; }
            if (!xSV(_fixedPoint, other._fixedPoint)) { return false; }
            if (!xSV(_shapeGrpCd, other._shapeGrpCd)) { return false; }
            if (!xSV(_length, other._length)) { return false; }
            if (!xSV(_width, other._width)) { return false; }
            if (!xSV(_height, other._height)) { return false; }
            if (!xSV(_volume, other._volume)) { return false; }
            if (!xSV(_netWeight, other._netWeight)) { return false; }
            if (!xSV(_grossWeight, other._grossWeight)) { return false; }
            if (!xSV(_messageNm, other._messageNm)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productId);
        hs = xCH(hs, _receiveCd);
        hs = xCH(hs, _receiveRowId);
        hs = xCH(hs, _importFlg);
        hs = xCH(hs, _errorFlg);
        hs = xCH(hs, _errorMessageCd);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _janCd);
        hs = xCH(hs, _lotManagFlg);
        hs = xCH(hs, _lotReverseFlg);
        hs = xCH(hs, _limitDtManagFlg);
        hs = xCH(hs, _limitDtReverseFlg);
        hs = xCH(hs, _receiveLimitNum);
        hs = xCH(hs, _shippingLimitNum);
        hs = xCH(hs, _mergeCls);
        hs = xCH(hs, _shippingStopFlg);
        hs = xCH(hs, _fixedPoint);
        hs = xCH(hs, _shapeGrpCd);
        hs = xCH(hs, _length);
        hs = xCH(hs, _width);
        hs = xCH(hs, _height);
        hs = xCH(hs, _volume);
        hs = xCH(hs, _netWeight);
        hs = xCH(hs, _grossWeight);
        hs = xCH(hs, _messageNm);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_lotManagFlg));
        sb.append(dm).append(xfND(_lotReverseFlg));
        sb.append(dm).append(xfND(_limitDtManagFlg));
        sb.append(dm).append(xfND(_limitDtReverseFlg));
        sb.append(dm).append(xfND(_receiveLimitNum));
        sb.append(dm).append(xfND(_shippingLimitNum));
        sb.append(dm).append(xfND(_mergeCls));
        sb.append(dm).append(xfND(_shippingStopFlg));
        sb.append(dm).append(xfND(_fixedPoint));
        sb.append(dm).append(xfND(_shapeGrpCd));
        sb.append(dm).append(xfND(_length));
        sb.append(dm).append(xfND(_width));
        sb.append(dm).append(xfND(_height));
        sb.append(dm).append(xfND(_volume));
        sb.append(dm).append(xfND(_netWeight));
        sb.append(dm).append(xfND(_grossWeight));
        sb.append(dm).append(xfND(_messageNm));
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
    public SqlEProductList clone() {
        return (SqlEProductList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] RECEIVE_CD: {varchar(30)} <br>
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {varchar(30)} <br>
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {char(1)} <br>
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {char(1)} <br>
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CLIENT_CD: {varchar(255)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(255)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
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
     * [get] PRODUCT_ABBR: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(255)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
    }

    /**
     * [get] JAN_CD: {varchar(255)} <br>
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {varchar(255)} <br>
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] LOT_MANAG_FLG: {varchar(255)} <br>
     * @return The value of the column 'LOT_MANAG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotManagFlg() {
        checkSpecifiedProperty("lotManagFlg");
        return convertEmptyToNull(_lotManagFlg);
    }

    /**
     * [set] LOT_MANAG_FLG: {varchar(255)} <br>
     * @param lotManagFlg The value of the column 'LOT_MANAG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotManagFlg(String lotManagFlg) {
        registerModifiedProperty("lotManagFlg");
        _lotManagFlg = lotManagFlg;
    }

    /**
     * [get] LOT_REVERSE_FLG: {varchar(255)} <br>
     * @return The value of the column 'LOT_REVERSE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotReverseFlg() {
        checkSpecifiedProperty("lotReverseFlg");
        return convertEmptyToNull(_lotReverseFlg);
    }

    /**
     * [set] LOT_REVERSE_FLG: {varchar(255)} <br>
     * @param lotReverseFlg The value of the column 'LOT_REVERSE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotReverseFlg(String lotReverseFlg) {
        registerModifiedProperty("lotReverseFlg");
        _lotReverseFlg = lotReverseFlg;
    }

    /**
     * [get] LIMIT_DT_MANAG_FLG: {varchar(255)} <br>
     * @return The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDtManagFlg() {
        checkSpecifiedProperty("limitDtManagFlg");
        return convertEmptyToNull(_limitDtManagFlg);
    }

    /**
     * [set] LIMIT_DT_MANAG_FLG: {varchar(255)} <br>
     * @param limitDtManagFlg The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDtManagFlg(String limitDtManagFlg) {
        registerModifiedProperty("limitDtManagFlg");
        _limitDtManagFlg = limitDtManagFlg;
    }

    /**
     * [get] LIMIT_DT_REVERSE_FLG: {varchar(255)} <br>
     * @return The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDtReverseFlg() {
        checkSpecifiedProperty("limitDtReverseFlg");
        return convertEmptyToNull(_limitDtReverseFlg);
    }

    /**
     * [set] LIMIT_DT_REVERSE_FLG: {varchar(255)} <br>
     * @param limitDtReverseFlg The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDtReverseFlg(String limitDtReverseFlg) {
        registerModifiedProperty("limitDtReverseFlg");
        _limitDtReverseFlg = limitDtReverseFlg;
    }

    /**
     * [get] RECEIVE_LIMIT_NUM: {varchar(255)} <br>
     * @return The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveLimitNum() {
        checkSpecifiedProperty("receiveLimitNum");
        return convertEmptyToNull(_receiveLimitNum);
    }

    /**
     * [set] RECEIVE_LIMIT_NUM: {varchar(255)} <br>
     * @param receiveLimitNum The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveLimitNum(String receiveLimitNum) {
        registerModifiedProperty("receiveLimitNum");
        _receiveLimitNum = receiveLimitNum;
    }

    /**
     * [get] SHIPPING_LIMIT_NUM: {varchar(255)} <br>
     * @return The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingLimitNum() {
        checkSpecifiedProperty("shippingLimitNum");
        return convertEmptyToNull(_shippingLimitNum);
    }

    /**
     * [set] SHIPPING_LIMIT_NUM: {varchar(255)} <br>
     * @param shippingLimitNum The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingLimitNum(String shippingLimitNum) {
        registerModifiedProperty("shippingLimitNum");
        _shippingLimitNum = shippingLimitNum;
    }

    /**
     * [get] MERGE_CLS: {varchar(255)} <br>
     * @return The value of the column 'MERGE_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getMergeCls() {
        checkSpecifiedProperty("mergeCls");
        return convertEmptyToNull(_mergeCls);
    }

    /**
     * [set] MERGE_CLS: {varchar(255)} <br>
     * @param mergeCls The value of the column 'MERGE_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergeCls(String mergeCls) {
        registerModifiedProperty("mergeCls");
        _mergeCls = mergeCls;
    }

    /**
     * [get] SHIPPING_STOP_FLG: {varchar(255)} <br>
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStopFlg() {
        checkSpecifiedProperty("shippingStopFlg");
        return convertEmptyToNull(_shippingStopFlg);
    }

    /**
     * [set] SHIPPING_STOP_FLG: {varchar(255)} <br>
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        registerModifiedProperty("shippingStopFlg");
        _shippingStopFlg = shippingStopFlg;
    }

    /**
     * [get] FIXED_POINT: {varchar(255)} <br>
     * @return The value of the column 'FIXED_POINT'. (NullAllowed even if selected: for no constraint)
     */
    public String getFixedPoint() {
        checkSpecifiedProperty("fixedPoint");
        return convertEmptyToNull(_fixedPoint);
    }

    /**
     * [set] FIXED_POINT: {varchar(255)} <br>
     * @param fixedPoint The value of the column 'FIXED_POINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFixedPoint(String fixedPoint) {
        registerModifiedProperty("fixedPoint");
        _fixedPoint = fixedPoint;
    }

    /**
     * [get] SHAPE_GRP_CD: {varchar(255)} <br>
     * @return The value of the column 'SHAPE_GRP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShapeGrpCd() {
        checkSpecifiedProperty("shapeGrpCd");
        return convertEmptyToNull(_shapeGrpCd);
    }

    /**
     * [set] SHAPE_GRP_CD: {varchar(255)} <br>
     * @param shapeGrpCd The value of the column 'SHAPE_GRP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeGrpCd(String shapeGrpCd) {
        registerModifiedProperty("shapeGrpCd");
        _shapeGrpCd = shapeGrpCd;
    }

    /**
     * [get] LENGTH: {varchar(255)} <br>
     * @return The value of the column 'LENGTH'. (NullAllowed even if selected: for no constraint)
     */
    public String getLength() {
        checkSpecifiedProperty("length");
        return convertEmptyToNull(_length);
    }

    /**
     * [set] LENGTH: {varchar(255)} <br>
     * @param length The value of the column 'LENGTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLength(String length) {
        registerModifiedProperty("length");
        _length = length;
    }

    /**
     * [get] WIDTH: {varchar(255)} <br>
     * @return The value of the column 'WIDTH'. (NullAllowed even if selected: for no constraint)
     */
    public String getWidth() {
        checkSpecifiedProperty("width");
        return convertEmptyToNull(_width);
    }

    /**
     * [set] WIDTH: {varchar(255)} <br>
     * @param width The value of the column 'WIDTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWidth(String width) {
        registerModifiedProperty("width");
        _width = width;
    }

    /**
     * [get] HEIGHT: {varchar(255)} <br>
     * @return The value of the column 'HEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public String getHeight() {
        checkSpecifiedProperty("height");
        return convertEmptyToNull(_height);
    }

    /**
     * [set] HEIGHT: {varchar(255)} <br>
     * @param height The value of the column 'HEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHeight(String height) {
        registerModifiedProperty("height");
        _height = height;
    }

    /**
     * [get] VOLUME: {varchar(255)} <br>
     * @return The value of the column 'VOLUME'. (NullAllowed even if selected: for no constraint)
     */
    public String getVolume() {
        checkSpecifiedProperty("volume");
        return convertEmptyToNull(_volume);
    }

    /**
     * [set] VOLUME: {varchar(255)} <br>
     * @param volume The value of the column 'VOLUME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVolume(String volume) {
        registerModifiedProperty("volume");
        _volume = volume;
    }

    /**
     * [get] NET_WEIGHT: {varchar(255)} <br>
     * @return The value of the column 'NET_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public String getNetWeight() {
        checkSpecifiedProperty("netWeight");
        return convertEmptyToNull(_netWeight);
    }

    /**
     * [set] NET_WEIGHT: {varchar(255)} <br>
     * @param netWeight The value of the column 'NET_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNetWeight(String netWeight) {
        registerModifiedProperty("netWeight");
        _netWeight = netWeight;
    }

    /**
     * [get] GROSS_WEIGHT: {varchar(255)} <br>
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public String getGrossWeight() {
        checkSpecifiedProperty("grossWeight");
        return convertEmptyToNull(_grossWeight);
    }

    /**
     * [set] GROSS_WEIGHT: {varchar(255)} <br>
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGrossWeight(String grossWeight) {
        registerModifiedProperty("grossWeight");
        _grossWeight = grossWeight;
    }

    /**
     * [get] MESSAGE_NM: {varchar(4000)} <br>
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageNm() {
        checkSpecifiedProperty("messageNm");
        return convertEmptyToNull(_messageNm);
    }

    /**
     * [set] MESSAGE_NM: {varchar(4000)} <br>
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageNm(String messageNm) {
        registerModifiedProperty("messageNm");
        _messageNm = messageNm;
    }
}
