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
 * The entity of W_PRODUCT_INPUT as TABLE. <br>
 * 商品マスタ取込ワーク
 * <pre>
 * [primary-key]
 *     PRODUCT_INPUT_ID
 *
 * [column]
 *     PRODUCT_INPUT_ID, CLIENT_CD, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, LOT_MANAG_FLG, LIMIT_DT_MANAG_FLG, RECEIVE_LIMIT_NUM, SHIPPING_LIMIT_NUM, MERGE_CLS, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, SHIPPING_STOP_FLG, SHAPE_GRP_CD, FIXED_POINT, LENGTH, WIDTH, HEIGHT, VOLUME, NET_WEIGHT, GROSS_WEIGHT, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_INPUT_ID
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
 * Long productInputId = entity.getProductInputId();
 * String clientCd = entity.getClientCd();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String productAbbr = entity.getProductAbbr();
 * String janCd = entity.getJanCd();
 * String lotManagFlg = entity.getLotManagFlg();
 * String limitDtManagFlg = entity.getLimitDtManagFlg();
 * String receiveLimitNum = entity.getReceiveLimitNum();
 * String shippingLimitNum = entity.getShippingLimitNum();
 * String mergeCls = entity.getMergeCls();
 * String lotReverseFlg = entity.getLotReverseFlg();
 * String limitDtReverseFlg = entity.getLimitDtReverseFlg();
 * String shippingStopFlg = entity.getShippingStopFlg();
 * String shapeGrpCd = entity.getShapeGrpCd();
 * String fixedPoint = entity.getFixedPoint();
 * String length = entity.getLength();
 * String width = entity.getWidth();
 * String height = entity.getHeight();
 * String volume = entity.getVolume();
 * String netWeight = entity.getNetWeight();
 * String grossWeight = entity.getGrossWeight();
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
 * entity.setProductInputId(productInputId);
 * entity.setClientCd(clientCd);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setProductAbbr(productAbbr);
 * entity.setJanCd(janCd);
 * entity.setLotManagFlg(lotManagFlg);
 * entity.setLimitDtManagFlg(limitDtManagFlg);
 * entity.setReceiveLimitNum(receiveLimitNum);
 * entity.setShippingLimitNum(shippingLimitNum);
 * entity.setMergeCls(mergeCls);
 * entity.setLotReverseFlg(lotReverseFlg);
 * entity.setLimitDtReverseFlg(limitDtReverseFlg);
 * entity.setShippingStopFlg(shippingStopFlg);
 * entity.setShapeGrpCd(shapeGrpCd);
 * entity.setFixedPoint(fixedPoint);
 * entity.setLength(length);
 * entity.setWidth(width);
 * entity.setHeight(height);
 * entity.setVolume(volume);
 * entity.setNetWeight(netWeight);
 * entity.setGrossWeight(grossWeight);
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
public abstract class BsWProductInput extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _productInputId;

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

    /** LOT_MANAG_FLG: {varchar(255), default=[0]} */
    protected String _lotManagFlg;

    /** LIMIT_DT_MANAG_FLG: {varchar(255), default=[0]} */
    protected String _limitDtManagFlg;

    /** RECEIVE_LIMIT_NUM: {varchar(255)} */
    protected String _receiveLimitNum;

    /** SHIPPING_LIMIT_NUM: {varchar(255)} */
    protected String _shippingLimitNum;

    /** MERGE_CLS: {varchar(255), default=[02]} */
    protected String _mergeCls;

    /** LOT_REVERSE_FLG: {varchar(255), default=[0]} */
    protected String _lotReverseFlg;

    /** LIMIT_DT_REVERSE_FLG: {varchar(255), default=[0]} */
    protected String _limitDtReverseFlg;

    /** SHIPPING_STOP_FLG: {varchar(255), default=[0]} */
    protected String _shippingStopFlg;

    /** SHAPE_GRP_CD: {varchar(255)} */
    protected String _shapeGrpCd;

    /** FIXED_POINT: {varchar(255)} */
    protected String _fixedPoint;

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
        return "W_PRODUCT_INPUT";
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
        if (_productInputId == null) { return false; }
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
        if (obj instanceof BsWProductInput) {
            BsWProductInput other = (BsWProductInput)obj;
            if (!xSV(_productInputId, other._productInputId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productInputId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productInputId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_lotManagFlg));
        sb.append(dm).append(xfND(_limitDtManagFlg));
        sb.append(dm).append(xfND(_receiveLimitNum));
        sb.append(dm).append(xfND(_shippingLimitNum));
        sb.append(dm).append(xfND(_mergeCls));
        sb.append(dm).append(xfND(_lotReverseFlg));
        sb.append(dm).append(xfND(_limitDtReverseFlg));
        sb.append(dm).append(xfND(_shippingStopFlg));
        sb.append(dm).append(xfND(_shapeGrpCd));
        sb.append(dm).append(xfND(_fixedPoint));
        sb.append(dm).append(xfND(_length));
        sb.append(dm).append(xfND(_width));
        sb.append(dm).append(xfND(_height));
        sb.append(dm).append(xfND(_volume));
        sb.append(dm).append(xfND(_netWeight));
        sb.append(dm).append(xfND(_grossWeight));
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
    public WProductInput clone() {
        return (WProductInput)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 商品マスタ取込ワークID
     * @return The value of the column 'PRODUCT_INPUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductInputId() {
        checkSpecifiedProperty("productInputId");
        return _productInputId;
    }

    /**
     * [set] PRODUCT_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 商品マスタ取込ワークID
     * @param productInputId The value of the column 'PRODUCT_INPUT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductInputId(Long productInputId) {
        registerModifiedProperty("productInputId");
        _productInputId = productInputId;
    }

    /**
     * [get] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
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
     * [get] PRODUCT_ABBR: {varchar(255)} <br>
     * 商品略称
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(255)} <br>
     * 商品略称
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
    }

    /**
     * [get] JAN_CD: {varchar(255)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {varchar(255)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] LOT_MANAG_FLG: {varchar(255), default=[0]} <br>
     * ロット管理フラグ
     * @return The value of the column 'LOT_MANAG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotManagFlg() {
        checkSpecifiedProperty("lotManagFlg");
        return convertEmptyToNull(_lotManagFlg);
    }

    /**
     * [set] LOT_MANAG_FLG: {varchar(255), default=[0]} <br>
     * ロット管理フラグ
     * @param lotManagFlg The value of the column 'LOT_MANAG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotManagFlg(String lotManagFlg) {
        registerModifiedProperty("lotManagFlg");
        _lotManagFlg = lotManagFlg;
    }

    /**
     * [get] LIMIT_DT_MANAG_FLG: {varchar(255), default=[0]} <br>
     * 期限日管理フラグ
     * @return The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDtManagFlg() {
        checkSpecifiedProperty("limitDtManagFlg");
        return convertEmptyToNull(_limitDtManagFlg);
    }

    /**
     * [set] LIMIT_DT_MANAG_FLG: {varchar(255), default=[0]} <br>
     * 期限日管理フラグ
     * @param limitDtManagFlg The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDtManagFlg(String limitDtManagFlg) {
        registerModifiedProperty("limitDtManagFlg");
        _limitDtManagFlg = limitDtManagFlg;
    }

    /**
     * [get] RECEIVE_LIMIT_NUM: {varchar(255)} <br>
     * 入荷期限日数
     * @return The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveLimitNum() {
        checkSpecifiedProperty("receiveLimitNum");
        return convertEmptyToNull(_receiveLimitNum);
    }

    /**
     * [set] RECEIVE_LIMIT_NUM: {varchar(255)} <br>
     * 入荷期限日数
     * @param receiveLimitNum The value of the column 'RECEIVE_LIMIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveLimitNum(String receiveLimitNum) {
        registerModifiedProperty("receiveLimitNum");
        _receiveLimitNum = receiveLimitNum;
    }

    /**
     * [get] SHIPPING_LIMIT_NUM: {varchar(255)} <br>
     * 出荷期限日数
     * @return The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingLimitNum() {
        checkSpecifiedProperty("shippingLimitNum");
        return convertEmptyToNull(_shippingLimitNum);
    }

    /**
     * [set] SHIPPING_LIMIT_NUM: {varchar(255)} <br>
     * 出荷期限日数
     * @param shippingLimitNum The value of the column 'SHIPPING_LIMIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingLimitNum(String shippingLimitNum) {
        registerModifiedProperty("shippingLimitNum");
        _shippingLimitNum = shippingLimitNum;
    }

    /**
     * [get] MERGE_CLS: {varchar(255), default=[02]} <br>
     * 入庫No.マージ区分
     * @return The value of the column 'MERGE_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getMergeCls() {
        checkSpecifiedProperty("mergeCls");
        return convertEmptyToNull(_mergeCls);
    }

    /**
     * [set] MERGE_CLS: {varchar(255), default=[02]} <br>
     * 入庫No.マージ区分
     * @param mergeCls The value of the column 'MERGE_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMergeCls(String mergeCls) {
        registerModifiedProperty("mergeCls");
        _mergeCls = mergeCls;
    }

    /**
     * [get] LOT_REVERSE_FLG: {varchar(255), default=[0]} <br>
     * ロット逆転防止フラグ
     * @return The value of the column 'LOT_REVERSE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotReverseFlg() {
        checkSpecifiedProperty("lotReverseFlg");
        return convertEmptyToNull(_lotReverseFlg);
    }

    /**
     * [set] LOT_REVERSE_FLG: {varchar(255), default=[0]} <br>
     * ロット逆転防止フラグ
     * @param lotReverseFlg The value of the column 'LOT_REVERSE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotReverseFlg(String lotReverseFlg) {
        registerModifiedProperty("lotReverseFlg");
        _lotReverseFlg = lotReverseFlg;
    }

    /**
     * [get] LIMIT_DT_REVERSE_FLG: {varchar(255), default=[0]} <br>
     * 期限日逆転防止フラグ
     * @return The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDtReverseFlg() {
        checkSpecifiedProperty("limitDtReverseFlg");
        return convertEmptyToNull(_limitDtReverseFlg);
    }

    /**
     * [set] LIMIT_DT_REVERSE_FLG: {varchar(255), default=[0]} <br>
     * 期限日逆転防止フラグ
     * @param limitDtReverseFlg The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDtReverseFlg(String limitDtReverseFlg) {
        registerModifiedProperty("limitDtReverseFlg");
        _limitDtReverseFlg = limitDtReverseFlg;
    }

    /**
     * [get] SHIPPING_STOP_FLG: {varchar(255), default=[0]} <br>
     * 出荷停止フラグ
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStopFlg() {
        checkSpecifiedProperty("shippingStopFlg");
        return convertEmptyToNull(_shippingStopFlg);
    }

    /**
     * [set] SHIPPING_STOP_FLG: {varchar(255), default=[0]} <br>
     * 出荷停止フラグ
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        registerModifiedProperty("shippingStopFlg");
        _shippingStopFlg = shippingStopFlg;
    }

    /**
     * [get] SHAPE_GRP_CD: {varchar(255)} <br>
     * 荷姿グループCD
     * @return The value of the column 'SHAPE_GRP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShapeGrpCd() {
        checkSpecifiedProperty("shapeGrpCd");
        return convertEmptyToNull(_shapeGrpCd);
    }

    /**
     * [set] SHAPE_GRP_CD: {varchar(255)} <br>
     * 荷姿グループCD
     * @param shapeGrpCd The value of the column 'SHAPE_GRP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShapeGrpCd(String shapeGrpCd) {
        registerModifiedProperty("shapeGrpCd");
        _shapeGrpCd = shapeGrpCd;
    }

    /**
     * [get] FIXED_POINT: {varchar(255)} <br>
     * 定点
     * @return The value of the column 'FIXED_POINT'. (NullAllowed even if selected: for no constraint)
     */
    public String getFixedPoint() {
        checkSpecifiedProperty("fixedPoint");
        return convertEmptyToNull(_fixedPoint);
    }

    /**
     * [set] FIXED_POINT: {varchar(255)} <br>
     * 定点
     * @param fixedPoint The value of the column 'FIXED_POINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFixedPoint(String fixedPoint) {
        registerModifiedProperty("fixedPoint");
        _fixedPoint = fixedPoint;
    }

    /**
     * [get] LENGTH: {varchar(255)} <br>
     * 縦(mm)
     * @return The value of the column 'LENGTH'. (NullAllowed even if selected: for no constraint)
     */
    public String getLength() {
        checkSpecifiedProperty("length");
        return convertEmptyToNull(_length);
    }

    /**
     * [set] LENGTH: {varchar(255)} <br>
     * 縦(mm)
     * @param length The value of the column 'LENGTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLength(String length) {
        registerModifiedProperty("length");
        _length = length;
    }

    /**
     * [get] WIDTH: {varchar(255)} <br>
     * 横(mm)
     * @return The value of the column 'WIDTH'. (NullAllowed even if selected: for no constraint)
     */
    public String getWidth() {
        checkSpecifiedProperty("width");
        return convertEmptyToNull(_width);
    }

    /**
     * [set] WIDTH: {varchar(255)} <br>
     * 横(mm)
     * @param width The value of the column 'WIDTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWidth(String width) {
        registerModifiedProperty("width");
        _width = width;
    }

    /**
     * [get] HEIGHT: {varchar(255)} <br>
     * 高さ(mm)
     * @return The value of the column 'HEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public String getHeight() {
        checkSpecifiedProperty("height");
        return convertEmptyToNull(_height);
    }

    /**
     * [set] HEIGHT: {varchar(255)} <br>
     * 高さ(mm)
     * @param height The value of the column 'HEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHeight(String height) {
        registerModifiedProperty("height");
        _height = height;
    }

    /**
     * [get] VOLUME: {varchar(255)} <br>
     * 容積(mm3)
     * @return The value of the column 'VOLUME'. (NullAllowed even if selected: for no constraint)
     */
    public String getVolume() {
        checkSpecifiedProperty("volume");
        return convertEmptyToNull(_volume);
    }

    /**
     * [set] VOLUME: {varchar(255)} <br>
     * 容積(mm3)
     * @param volume The value of the column 'VOLUME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVolume(String volume) {
        registerModifiedProperty("volume");
        _volume = volume;
    }

    /**
     * [get] NET_WEIGHT: {varchar(255)} <br>
     * 商品重量(g)
     * @return The value of the column 'NET_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public String getNetWeight() {
        checkSpecifiedProperty("netWeight");
        return convertEmptyToNull(_netWeight);
    }

    /**
     * [set] NET_WEIGHT: {varchar(255)} <br>
     * 商品重量(g)
     * @param netWeight The value of the column 'NET_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNetWeight(String netWeight) {
        registerModifiedProperty("netWeight");
        _netWeight = netWeight;
    }

    /**
     * [get] GROSS_WEIGHT: {varchar(255)} <br>
     * 総重量(g)
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public String getGrossWeight() {
        checkSpecifiedProperty("grossWeight");
        return convertEmptyToNull(_grossWeight);
    }

    /**
     * [set] GROSS_WEIGHT: {varchar(255)} <br>
     * 総重量(g)
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGrossWeight(String grossWeight) {
        registerModifiedProperty("grossWeight");
        _grossWeight = grossWeight;
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
