package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlEProductShapeList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PRODUCT_SHAPE_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, PRODUCT_CD, SHAPE_CD, UNIT_NUM, LENGTH, WIDTH, HEIGHT, VOLUME, NET_WEIGHT, GROSS_WEIGHT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS, MESSAGE_NM, PRODUCT_ID, PRODUCT_NM, SHAPE_ID, MS_UNIT_NUM, SHAPE_NM
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
 * Long productShapeId = entity.getProductShapeId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String clientCd = entity.getClientCd();
 * String productCd = entity.getProductCd();
 * String shapeCd = entity.getShapeCd();
 * String unitNum = entity.getUnitNum();
 * String length = entity.getLength();
 * String width = entity.getWidth();
 * String height = entity.getHeight();
 * String volume = entity.getVolume();
 * String netWeight = entity.getNetWeight();
 * String grossWeight = entity.getGrossWeight();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * String messageNm = entity.getMessageNm();
 * Long productId = entity.getProductId();
 * String productNm = entity.getProductNm();
 * Long shapeId = entity.getShapeId();
 * Long msUnitNum = entity.getMsUnitNum();
 * String shapeNm = entity.getShapeNm();
 * entity.setProductShapeId(productShapeId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setClientCd(clientCd);
 * entity.setProductCd(productCd);
 * entity.setShapeCd(shapeCd);
 * entity.setUnitNum(unitNum);
 * entity.setLength(length);
 * entity.setWidth(width);
 * entity.setHeight(height);
 * entity.setVolume(volume);
 * entity.setNetWeight(netWeight);
 * entity.setGrossWeight(grossWeight);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * entity.setMessageNm(messageNm);
 * entity.setProductId(productId);
 * entity.setProductNm(productNm);
 * entity.setShapeId(shapeId);
 * entity.setMsUnitNum(msUnitNum);
 * entity.setShapeNm(shapeNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlEProductShapeList extends AbstractEntity implements CustomizeEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_SHAPE_ID: {bigint(19)} */
    protected Long _productShapeId;

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

    /** SHAPE_CD: {varchar(30)} */
    protected String _shapeCd;

    /** UNIT_NUM: {varchar(255)} */
    protected String _unitNum;

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

    /** DEL_FLG: {char(1), classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {bigint(19)} */
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

    /** MESSAGE_NM: {varchar(4000)} */
    protected String _messageNm;

    /** PRODUCT_ID: {bigint(19)} */
    protected Long _productId;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** SHAPE_ID: {bigint(19)} */
    protected Long _shapeId;

    /** MS_UNIT_NUM: {int(10)} */
    protected Long _msUnitNum;

    /** SHAPE_NM: {varchar(100)} */
    protected String _shapeNm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlEProductShapeListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlEProductShapeList";
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
        if (obj instanceof BsSqlEProductShapeList) {
            BsSqlEProductShapeList other = (BsSqlEProductShapeList)obj;
            if (!xSV(_productShapeId, other._productShapeId)) { return false; }
            if (!xSV(_receiveCd, other._receiveCd)) { return false; }
            if (!xSV(_receiveRowId, other._receiveRowId)) { return false; }
            if (!xSV(_importFlg, other._importFlg)) { return false; }
            if (!xSV(_errorFlg, other._errorFlg)) { return false; }
            if (!xSV(_errorMessageCd, other._errorMessageCd)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_shapeCd, other._shapeCd)) { return false; }
            if (!xSV(_unitNum, other._unitNum)) { return false; }
            if (!xSV(_length, other._length)) { return false; }
            if (!xSV(_width, other._width)) { return false; }
            if (!xSV(_height, other._height)) { return false; }
            if (!xSV(_volume, other._volume)) { return false; }
            if (!xSV(_netWeight, other._netWeight)) { return false; }
            if (!xSV(_grossWeight, other._grossWeight)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_controlNo, other._controlNo)) { return false; }
            if (!xSV(_addDt, other._addDt)) { return false; }
            if (!xSV(_addUser, other._addUser)) { return false; }
            if (!xSV(_addProcess, other._addProcess)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_updUser, other._updUser)) { return false; }
            if (!xSV(_updProcess, other._updProcess)) { return false; }
            if (!xSV(_messageNm, other._messageNm)) { return false; }
            if (!xSV(_productId, other._productId)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_shapeId, other._shapeId)) { return false; }
            if (!xSV(_msUnitNum, other._msUnitNum)) { return false; }
            if (!xSV(_shapeNm, other._shapeNm)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productShapeId);
        hs = xCH(hs, _receiveCd);
        hs = xCH(hs, _receiveRowId);
        hs = xCH(hs, _importFlg);
        hs = xCH(hs, _errorFlg);
        hs = xCH(hs, _errorMessageCd);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _shapeCd);
        hs = xCH(hs, _unitNum);
        hs = xCH(hs, _length);
        hs = xCH(hs, _width);
        hs = xCH(hs, _height);
        hs = xCH(hs, _volume);
        hs = xCH(hs, _netWeight);
        hs = xCH(hs, _grossWeight);
        hs = xCH(hs, _delFlg);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _controlNo);
        hs = xCH(hs, _addDt);
        hs = xCH(hs, _addUser);
        hs = xCH(hs, _addProcess);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _updUser);
        hs = xCH(hs, _updProcess);
        hs = xCH(hs, _messageNm);
        hs = xCH(hs, _productId);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _shapeId);
        hs = xCH(hs, _msUnitNum);
        hs = xCH(hs, _shapeNm);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productShapeId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_shapeCd));
        sb.append(dm).append(xfND(_unitNum));
        sb.append(dm).append(xfND(_length));
        sb.append(dm).append(xfND(_width));
        sb.append(dm).append(xfND(_height));
        sb.append(dm).append(xfND(_volume));
        sb.append(dm).append(xfND(_netWeight));
        sb.append(dm).append(xfND(_grossWeight));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        sb.append(dm).append(xfND(_messageNm));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_shapeId));
        sb.append(dm).append(xfND(_msUnitNum));
        sb.append(dm).append(xfND(_shapeNm));
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
    public SqlEProductShapeList clone() {
        return (SqlEProductShapeList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_SHAPE_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_SHAPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductShapeId() {
        checkSpecifiedProperty("productShapeId");
        return _productShapeId;
    }

    /**
     * [set] PRODUCT_SHAPE_ID: {bigint(19)} <br>
     * @param productShapeId The value of the column 'PRODUCT_SHAPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductShapeId(Long productShapeId) {
        registerModifiedProperty("productShapeId");
        _productShapeId = productShapeId;
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
     * [get] SHAPE_CD: {varchar(30)} <br>
     * @return The value of the column 'SHAPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShapeCd() {
        checkSpecifiedProperty("shapeCd");
        return convertEmptyToNull(_shapeCd);
    }

    /**
     * [set] SHAPE_CD: {varchar(30)} <br>
     * @param shapeCd The value of the column 'SHAPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeCd(String shapeCd) {
        registerModifiedProperty("shapeCd");
        _shapeCd = shapeCd;
    }

    /**
     * [get] UNIT_NUM: {varchar(255)} <br>
     * @return The value of the column 'UNIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitNum() {
        checkSpecifiedProperty("unitNum");
        return convertEmptyToNull(_unitNum);
    }

    /**
     * [set] UNIT_NUM: {varchar(255)} <br>
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNum(String unitNum) {
        registerModifiedProperty("unitNum");
        _unitNum = unitNum;
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
     * [get] CONTROL_NO: {bigint(19)} <br>
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
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
     * [get] UPD_USER: {varchar(255)} <br>
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
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
     * [get] SHAPE_ID: {bigint(19)} <br>
     * @return The value of the column 'SHAPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShapeId() {
        checkSpecifiedProperty("shapeId");
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {bigint(19)} <br>
     * @param shapeId The value of the column 'SHAPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeId(Long shapeId) {
        registerModifiedProperty("shapeId");
        _shapeId = shapeId;
    }

    /**
     * [get] MS_UNIT_NUM: {int(10)} <br>
     * @return The value of the column 'MS_UNIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMsUnitNum() {
        checkSpecifiedProperty("msUnitNum");
        return _msUnitNum;
    }

    /**
     * [set] MS_UNIT_NUM: {int(10)} <br>
     * @param msUnitNum The value of the column 'MS_UNIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMsUnitNum(Long msUnitNum) {
        registerModifiedProperty("msUnitNum");
        _msUnitNum = msUnitNum;
    }

    /**
     * [get] SHAPE_NM: {varchar(100)} <br>
     * @return The value of the column 'SHAPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getShapeNm() {
        checkSpecifiedProperty("shapeNm");
        return convertEmptyToNull(_shapeNm);
    }

    /**
     * [set] SHAPE_NM: {varchar(100)} <br>
     * @param shapeNm The value of the column 'SHAPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeNm(String shapeNm) {
        registerModifiedProperty("shapeNm");
        _shapeNm = shapeNm;
    }
}
