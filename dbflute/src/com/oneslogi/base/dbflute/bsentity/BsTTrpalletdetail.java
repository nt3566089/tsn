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
 * The entity of T_TRPALLETDETAIL as TABLE. <br>
 * パレットはり紙情報明細
 * <pre>
 * [primary-key]
 *     TRPALLETDETAIL_ID
 *
 * [column]
 *     TRPALLETDETAIL_ID, CENTER_ID, CLIENT_ID, PALLET_DETAIL_KEY, INOUT_TYPE, TRPALLET_ID, BASE_PALLET_NO, DIV_PALLET_NO, WORK_TYPE, WORK_KEY, REGISTRATION_DATE, WORK_DATE, PRODUCT_ID, PRODUCT_CD, DESIGN_FLG, LIMIT_DATE, FIRM_CARRY_NO, BAT_ARTICLE_SIGN, MOVE_B_LLOCATION_ID, MOVE_B_LOCATION_CD, MOVE_A_LOCATION_ID, MOVE_A_LOCATION_CD, INST_NUM, REST_QTY_CASE, REST_QTY_BOWL, REST_QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRPALLETDETAIL_ID
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
 * Long trpalletdetailId = entity.getTrpalletdetailId();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * Long palletDetailKey = entity.getPalletDetailKey();
 * String inoutType = entity.getInoutType();
 * Long trpalletId = entity.getTrpalletId();
 * java.math.BigDecimal basePalletNo = entity.getBasePalletNo();
 * java.math.BigDecimal divPalletNo = entity.getDivPalletNo();
 * String workType = entity.getWorkType();
 * Long workKey = entity.getWorkKey();
 * String registrationDate = entity.getRegistrationDate();
 * java.sql.Timestamp workDate = entity.getWorkDate();
 * Long productId = entity.getProductId();
 * String productCd = entity.getProductCd();
 * String designFlg = entity.getDesignFlg();
 * String limitDate = entity.getLimitDate();
 * String firmCarryNo = entity.getFirmCarryNo();
 * String batArticleSign = entity.getBatArticleSign();
 * Long moveBLlocationId = entity.getMoveBLlocationId();
 * String moveBLocationCd = entity.getMoveBLocationCd();
 * Long moveALocationId = entity.getMoveALocationId();
 * String moveALocationCd = entity.getMoveALocationCd();
 * java.math.BigDecimal instNum = entity.getInstNum();
 * java.math.BigDecimal restQtyCase = entity.getRestQtyCase();
 * java.math.BigDecimal restQtyBowl = entity.getRestQtyBowl();
 * java.math.BigDecimal restQty = entity.getRestQty();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrpalletdetailId(trpalletdetailId);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setPalletDetailKey(palletDetailKey);
 * entity.setInoutType(inoutType);
 * entity.setTrpalletId(trpalletId);
 * entity.setBasePalletNo(basePalletNo);
 * entity.setDivPalletNo(divPalletNo);
 * entity.setWorkType(workType);
 * entity.setWorkKey(workKey);
 * entity.setRegistrationDate(registrationDate);
 * entity.setWorkDate(workDate);
 * entity.setProductId(productId);
 * entity.setProductCd(productCd);
 * entity.setDesignFlg(designFlg);
 * entity.setLimitDate(limitDate);
 * entity.setFirmCarryNo(firmCarryNo);
 * entity.setBatArticleSign(batArticleSign);
 * entity.setMoveBLlocationId(moveBLlocationId);
 * entity.setMoveBLocationCd(moveBLocationCd);
 * entity.setMoveALocationId(moveALocationId);
 * entity.setMoveALocationCd(moveALocationCd);
 * entity.setInstNum(instNum);
 * entity.setRestQtyCase(restQtyCase);
 * entity.setRestQtyBowl(restQtyBowl);
 * entity.setRestQty(restQty);
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
public abstract class BsTTrpalletdetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trpalletdetailId;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

    /** PALLET_DETAIL_KEY: {NotNull, bigint(19)} */
    protected Long _palletDetailKey;

    /** INOUT_TYPE: {NotNull, varchar(30)} */
    protected String _inoutType;

    /** TRPALLET_ID: {IX, NotNull, bigint(19)} */
    protected Long _trpalletId;

    /** BASE_PALLET_NO: {decimal(16, 6)} */
    protected java.math.BigDecimal _basePalletNo;

    /** DIV_PALLET_NO: {decimal(16, 6)} */
    protected java.math.BigDecimal _divPalletNo;

    /** WORK_TYPE: {NotNull, varchar(30)} */
    protected String _workType;

    /** WORK_KEY: {bigint(19)} */
    protected Long _workKey;

    /** REGISTRATION_DATE: {varchar(8)} */
    protected String _registrationDate;

    /** WORK_DATE: {NotNull, datetime2(26, 6)} */
    protected java.sql.Timestamp _workDate;

    /** PRODUCT_ID: {NotNull, bigint(19)} */
    protected Long _productId;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** DESIGN_FLG: {varchar(30)} */
    protected String _designFlg;

    /** LIMIT_DATE: {varchar(8)} */
    protected String _limitDate;

    /** FIRM_CARRY_NO: {varchar(30)} */
    protected String _firmCarryNo;

    /** BAT_ARTICLE_SIGN: {varchar(30)} */
    protected String _batArticleSign;

    /** MOVE_B_LLOCATION_ID: {bigint(19)} */
    protected Long _moveBLlocationId;

    /** MOVE_B_LOCATION_CD: {varchar(30)} */
    protected String _moveBLocationCd;

    /** MOVE_A_LOCATION_ID: {bigint(19)} */
    protected Long _moveALocationId;

    /** MOVE_A_LOCATION_CD: {varchar(30)} */
    protected String _moveALocationCd;

    /** INST_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _instNum;

    /** REST_QTY_CASE: {decimal(16, 6)} */
    protected java.math.BigDecimal _restQtyCase;

    /** REST_QTY_BOWL: {decimal(16, 6)} */
    protected java.math.BigDecimal _restQtyBowl;

    /** REST_QTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _restQty;

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
        return "T_TRPALLETDETAIL";
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
        if (_trpalletdetailId == null) { return false; }
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
        if (obj instanceof BsTTrpalletdetail) {
            BsTTrpalletdetail other = (BsTTrpalletdetail)obj;
            if (!xSV(_trpalletdetailId, other._trpalletdetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trpalletdetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trpalletdetailId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_palletDetailKey));
        sb.append(dm).append(xfND(_inoutType));
        sb.append(dm).append(xfND(_trpalletId));
        sb.append(dm).append(xfND(_basePalletNo));
        sb.append(dm).append(xfND(_divPalletNo));
        sb.append(dm).append(xfND(_workType));
        sb.append(dm).append(xfND(_workKey));
        sb.append(dm).append(xfND(_registrationDate));
        sb.append(dm).append(xfND(_workDate));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_designFlg));
        sb.append(dm).append(xfND(_limitDate));
        sb.append(dm).append(xfND(_firmCarryNo));
        sb.append(dm).append(xfND(_batArticleSign));
        sb.append(dm).append(xfND(_moveBLlocationId));
        sb.append(dm).append(xfND(_moveBLocationCd));
        sb.append(dm).append(xfND(_moveALocationId));
        sb.append(dm).append(xfND(_moveALocationCd));
        sb.append(dm).append(xfND(_instNum));
        sb.append(dm).append(xfND(_restQtyCase));
        sb.append(dm).append(xfND(_restQtyBowl));
        sb.append(dm).append(xfND(_restQty));
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
    public TTrpalletdetail clone() {
        return (TTrpalletdetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレットはり紙情報明細ID
     * @return The value of the column 'TRPALLETDETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrpalletdetailId() {
        checkSpecifiedProperty("trpalletdetailId");
        return _trpalletdetailId;
    }

    /**
     * [set] TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレットはり紙情報明細ID
     * @param trpalletdetailId The value of the column 'TRPALLETDETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrpalletdetailId(Long trpalletdetailId) {
        registerModifiedProperty("trpalletdetailId");
        _trpalletdetailId = trpalletdetailId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
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
     * [get] PALLET_DETAIL_KEY: {NotNull, bigint(19)} <br>
     * パレットはり紙明細キー
     * @return The value of the column 'PALLET_DETAIL_KEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPalletDetailKey() {
        checkSpecifiedProperty("palletDetailKey");
        return _palletDetailKey;
    }

    /**
     * [set] PALLET_DETAIL_KEY: {NotNull, bigint(19)} <br>
     * パレットはり紙明細キー
     * @param palletDetailKey The value of the column 'PALLET_DETAIL_KEY'. (basically NotNull if update: for the constraint)
     */
    public void setPalletDetailKey(Long palletDetailKey) {
        registerModifiedProperty("palletDetailKey");
        _palletDetailKey = palletDetailKey;
    }

    /**
     * [get] INOUT_TYPE: {NotNull, varchar(30)} <br>
     * 入出庫区分
     * @return The value of the column 'INOUT_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getInoutType() {
        checkSpecifiedProperty("inoutType");
        return convertEmptyToNull(_inoutType);
    }

    /**
     * [set] INOUT_TYPE: {NotNull, varchar(30)} <br>
     * 入出庫区分
     * @param inoutType The value of the column 'INOUT_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setInoutType(String inoutType) {
        registerModifiedProperty("inoutType");
        _inoutType = inoutType;
    }

    /**
     * [get] TRPALLET_ID: {IX, NotNull, bigint(19)} <br>
     * パレットはり紙情報ID
     * @return The value of the column 'TRPALLET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrpalletId() {
        checkSpecifiedProperty("trpalletId");
        return _trpalletId;
    }

    /**
     * [set] TRPALLET_ID: {IX, NotNull, bigint(19)} <br>
     * パレットはり紙情報ID
     * @param trpalletId The value of the column 'TRPALLET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrpalletId(Long trpalletId) {
        registerModifiedProperty("trpalletId");
        _trpalletId = trpalletId;
    }

    /**
     * [get] BASE_PALLET_NO: {decimal(16, 6)} <br>
     * パレット管理番号(親)
     * @return The value of the column 'BASE_PALLET_NO'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBasePalletNo() {
        checkSpecifiedProperty("basePalletNo");
        return _basePalletNo;
    }

    /**
     * [set] BASE_PALLET_NO: {decimal(16, 6)} <br>
     * パレット管理番号(親)
     * @param basePalletNo The value of the column 'BASE_PALLET_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBasePalletNo(java.math.BigDecimal basePalletNo) {
        registerModifiedProperty("basePalletNo");
        _basePalletNo = basePalletNo;
    }

    /**
     * [get] DIV_PALLET_NO: {decimal(16, 6)} <br>
     * パレット管理番号(子)
     * @return The value of the column 'DIV_PALLET_NO'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDivPalletNo() {
        checkSpecifiedProperty("divPalletNo");
        return _divPalletNo;
    }

    /**
     * [set] DIV_PALLET_NO: {decimal(16, 6)} <br>
     * パレット管理番号(子)
     * @param divPalletNo The value of the column 'DIV_PALLET_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDivPalletNo(java.math.BigDecimal divPalletNo) {
        registerModifiedProperty("divPalletNo");
        _divPalletNo = divPalletNo;
    }

    /**
     * [get] WORK_TYPE: {NotNull, varchar(30)} <br>
     * 作業区分
     * @return The value of the column 'WORK_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getWorkType() {
        checkSpecifiedProperty("workType");
        return convertEmptyToNull(_workType);
    }

    /**
     * [set] WORK_TYPE: {NotNull, varchar(30)} <br>
     * 作業区分
     * @param workType The value of the column 'WORK_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setWorkType(String workType) {
        registerModifiedProperty("workType");
        _workType = workType;
    }

    /**
     * [get] WORK_KEY: {bigint(19)} <br>
     * 指示キー
     * @return The value of the column 'WORK_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWorkKey() {
        checkSpecifiedProperty("workKey");
        return _workKey;
    }

    /**
     * [set] WORK_KEY: {bigint(19)} <br>
     * 指示キー
     * @param workKey The value of the column 'WORK_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkKey(Long workKey) {
        registerModifiedProperty("workKey");
        _workKey = workKey;
    }

    /**
     * [get] REGISTRATION_DATE: {varchar(8)} <br>
     * 登録日
     * @return The value of the column 'REGISTRATION_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRegistrationDate() {
        checkSpecifiedProperty("registrationDate");
        return convertEmptyToNull(_registrationDate);
    }

    /**
     * [set] REGISTRATION_DATE: {varchar(8)} <br>
     * 登録日
     * @param registrationDate The value of the column 'REGISTRATION_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegistrationDate(String registrationDate) {
        registerModifiedProperty("registrationDate");
        _registrationDate = registrationDate;
    }

    /**
     * [get] WORK_DATE: {NotNull, datetime2(26, 6)} <br>
     * 作業日時
     * @return The value of the column 'WORK_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getWorkDate() {
        checkSpecifiedProperty("workDate");
        return _workDate;
    }

    /**
     * [set] WORK_DATE: {NotNull, datetime2(26, 6)} <br>
     * 作業日時
     * @param workDate The value of the column 'WORK_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setWorkDate(java.sql.Timestamp workDate) {
        registerModifiedProperty("workDate");
        _workDate = workDate;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesignFlg() {
        checkSpecifiedProperty("designFlg");
        return convertEmptyToNull(_designFlg);
    }

    /**
     * [set] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @param designFlg The value of the column 'DESIGN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesignFlg(String designFlg) {
        registerModifiedProperty("designFlg");
        _designFlg = designFlg;
    }

    /**
     * [get] LIMIT_DATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LIMIT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDate() {
        checkSpecifiedProperty("limitDate");
        return convertEmptyToNull(_limitDate);
    }

    /**
     * [set] LIMIT_DATE: {varchar(8)} <br>
     * 製造年月日
     * @param limitDate The value of the column 'LIMIT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDate(String limitDate) {
        registerModifiedProperty("limitDate");
        _limitDate = limitDate;
    }

    /**
     * [get] FIRM_CARRY_NO: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRM_CARRY_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirmCarryNo() {
        checkSpecifiedProperty("firmCarryNo");
        return convertEmptyToNull(_firmCarryNo);
    }

    /**
     * [set] FIRM_CARRY_NO: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmCarryNo The value of the column 'FIRM_CARRY_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirmCarryNo(String firmCarryNo) {
        registerModifiedProperty("firmCarryNo");
        _firmCarryNo = firmCarryNo;
    }

    /**
     * [get] BAT_ARTICLE_SIGN: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'BAT_ARTICLE_SIGN'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatArticleSign() {
        checkSpecifiedProperty("batArticleSign");
        return convertEmptyToNull(_batArticleSign);
    }

    /**
     * [set] BAT_ARTICLE_SIGN: {varchar(30)} <br>
     * 製造記号
     * @param batArticleSign The value of the column 'BAT_ARTICLE_SIGN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatArticleSign(String batArticleSign) {
        registerModifiedProperty("batArticleSign");
        _batArticleSign = batArticleSign;
    }

    /**
     * [get] MOVE_B_LLOCATION_ID: {bigint(19)} <br>
     * 移動元ロケーションID
     * @return The value of the column 'MOVE_B_LLOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMoveBLlocationId() {
        checkSpecifiedProperty("moveBLlocationId");
        return _moveBLlocationId;
    }

    /**
     * [set] MOVE_B_LLOCATION_ID: {bigint(19)} <br>
     * 移動元ロケーションID
     * @param moveBLlocationId The value of the column 'MOVE_B_LLOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveBLlocationId(Long moveBLlocationId) {
        registerModifiedProperty("moveBLlocationId");
        _moveBLlocationId = moveBLlocationId;
    }

    /**
     * [get] MOVE_B_LOCATION_CD: {varchar(30)} <br>
     * 移動元
     * @return The value of the column 'MOVE_B_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMoveBLocationCd() {
        checkSpecifiedProperty("moveBLocationCd");
        return convertEmptyToNull(_moveBLocationCd);
    }

    /**
     * [set] MOVE_B_LOCATION_CD: {varchar(30)} <br>
     * 移動元
     * @param moveBLocationCd The value of the column 'MOVE_B_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveBLocationCd(String moveBLocationCd) {
        registerModifiedProperty("moveBLocationCd");
        _moveBLocationCd = moveBLocationCd;
    }

    /**
     * [get] MOVE_A_LOCATION_ID: {bigint(19)} <br>
     * 移動先ロケーションID
     * @return The value of the column 'MOVE_A_LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMoveALocationId() {
        checkSpecifiedProperty("moveALocationId");
        return _moveALocationId;
    }

    /**
     * [set] MOVE_A_LOCATION_ID: {bigint(19)} <br>
     * 移動先ロケーションID
     * @param moveALocationId The value of the column 'MOVE_A_LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveALocationId(Long moveALocationId) {
        registerModifiedProperty("moveALocationId");
        _moveALocationId = moveALocationId;
    }

    /**
     * [get] MOVE_A_LOCATION_CD: {varchar(30)} <br>
     * 移動先
     * @return The value of the column 'MOVE_A_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMoveALocationCd() {
        checkSpecifiedProperty("moveALocationCd");
        return convertEmptyToNull(_moveALocationCd);
    }

    /**
     * [set] MOVE_A_LOCATION_CD: {varchar(30)} <br>
     * 移動先
     * @param moveALocationCd The value of the column 'MOVE_A_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveALocationCd(String moveALocationCd) {
        registerModifiedProperty("moveALocationCd");
        _moveALocationCd = moveALocationCd;
    }

    /**
     * [get] INST_NUM: {decimal(16, 6)} <br>
     * 指示数
     * @return The value of the column 'INST_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInstNum() {
        checkSpecifiedProperty("instNum");
        return _instNum;
    }

    /**
     * [set] INST_NUM: {decimal(16, 6)} <br>
     * 指示数
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        registerModifiedProperty("instNum");
        _instNum = instNum;
    }

    /**
     * [get] REST_QTY_CASE: {decimal(16, 6)} <br>
     * 残数量(ケース)
     * @return The value of the column 'REST_QTY_CASE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRestQtyCase() {
        checkSpecifiedProperty("restQtyCase");
        return _restQtyCase;
    }

    /**
     * [set] REST_QTY_CASE: {decimal(16, 6)} <br>
     * 残数量(ケース)
     * @param restQtyCase The value of the column 'REST_QTY_CASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestQtyCase(java.math.BigDecimal restQtyCase) {
        registerModifiedProperty("restQtyCase");
        _restQtyCase = restQtyCase;
    }

    /**
     * [get] REST_QTY_BOWL: {decimal(16, 6)} <br>
     * 残数量(カートン)
     * @return The value of the column 'REST_QTY_BOWL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRestQtyBowl() {
        checkSpecifiedProperty("restQtyBowl");
        return _restQtyBowl;
    }

    /**
     * [set] REST_QTY_BOWL: {decimal(16, 6)} <br>
     * 残数量(カートン)
     * @param restQtyBowl The value of the column 'REST_QTY_BOWL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestQtyBowl(java.math.BigDecimal restQtyBowl) {
        registerModifiedProperty("restQtyBowl");
        _restQtyBowl = restQtyBowl;
    }

    /**
     * [get] REST_QTY: {decimal(16, 6)} <br>
     * 個装残数量
     * @return The value of the column 'REST_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRestQty() {
        checkSpecifiedProperty("restQty");
        return _restQty;
    }

    /**
     * [set] REST_QTY: {decimal(16, 6)} <br>
     * 個装残数量
     * @param restQty The value of the column 'REST_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestQty(java.math.BigDecimal restQty) {
        registerModifiedProperty("restQty");
        _restQty = restQty;
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
