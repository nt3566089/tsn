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
 * The entity of T_TRSTOCKDIFFHISTORY as TABLE. <br>
 * 在庫過不足履歴
 * <pre>
 * [primary-key]
 *     TRSTOCKDIFFHISTORY_ID
 *
 * [column]
 *     TRSTOCKDIFFHISTORY_ID, CENTER_CD, DIFFADD_DATE, DIFFOCC_AREA, LOCATION_CD, INOUT_KBN, PRODUCT_CD, GOOD_ITEM_KBN, DAMAGE_REFUND_KBN, DIFF_QTY, CENTER_ID, CLIENT_ID, PRINTEDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSTOCKDIFFHISTORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient, mCenter
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trstockdiffhistoryId = entity.getTrstockdiffhistoryId();
 * String centerCd = entity.getCenterCd();
 * String diffaddDate = entity.getDiffaddDate();
 * String diffoccArea = entity.getDiffoccArea();
 * String locationCd = entity.getLocationCd();
 * String inoutKbn = entity.getInoutKbn();
 * String productCd = entity.getProductCd();
 * String goodItemKbn = entity.getGoodItemKbn();
 * String damageRefundKbn = entity.getDamageRefundKbn();
 * java.math.BigDecimal diffQty = entity.getDiffQty();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String printedflg = entity.getPrintedflg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrstockdiffhistoryId(trstockdiffhistoryId);
 * entity.setCenterCd(centerCd);
 * entity.setDiffaddDate(diffaddDate);
 * entity.setDiffoccArea(diffoccArea);
 * entity.setLocationCd(locationCd);
 * entity.setInoutKbn(inoutKbn);
 * entity.setProductCd(productCd);
 * entity.setGoodItemKbn(goodItemKbn);
 * entity.setDamageRefundKbn(damageRefundKbn);
 * entity.setDiffQty(diffQty);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setPrintedflg(printedflg);
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
public abstract class BsTTrstockdiffhistory extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trstockdiffhistoryId;

    /** CENTER_CD: {NotNull, varchar(30)} */
    protected String _centerCd;

    /** DIFFADD_DATE: {NotNull, varchar(8)} */
    protected String _diffaddDate;

    /** DIFFOCC_AREA: {NotNull, char(1)} */
    protected String _diffoccArea;

    /** LOCATION_CD: {varchar(255)} */
    protected String _locationCd;

    /** INOUT_KBN: {NotNull, varchar(30)} */
    protected String _inoutKbn;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** GOOD_ITEM_KBN: {NotNull, char(1)} */
    protected String _goodItemKbn;

    /** DAMAGE_REFUND_KBN: {char(1)} */
    protected String _damageRefundKbn;

    /** DIFF_QTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _diffQty;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** PRINTEDFLG: {NotNull, char(1)} */
    protected String _printedflg;

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
        return "T_TRSTOCKDIFFHISTORY";
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
        if (_trstockdiffhistoryId == null) { return false; }
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
    /** M_CLIENT by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] M_CLIENT by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

    /** M_CENTER by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] M_CENTER by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

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
        if (obj instanceof BsTTrstockdiffhistory) {
            BsTTrstockdiffhistory other = (BsTTrstockdiffhistory)obj;
            if (!xSV(_trstockdiffhistoryId, other._trstockdiffhistoryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trstockdiffhistoryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trstockdiffhistoryId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_diffaddDate));
        sb.append(dm).append(xfND(_diffoccArea));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_inoutKbn));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_goodItemKbn));
        sb.append(dm).append(xfND(_damageRefundKbn));
        sb.append(dm).append(xfND(_diffQty));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_printedflg));
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
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrstockdiffhistory clone() {
        return (TTrstockdiffhistory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫過不足履歴ID
     * @return The value of the column 'TRSTOCKDIFFHISTORY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrstockdiffhistoryId() {
        checkSpecifiedProperty("trstockdiffhistoryId");
        return _trstockdiffhistoryId;
    }

    /**
     * [set] TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫過不足履歴ID
     * @param trstockdiffhistoryId The value of the column 'TRSTOCKDIFFHISTORY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrstockdiffhistoryId(Long trstockdiffhistoryId) {
        registerModifiedProperty("trstockdiffhistoryId");
        _trstockdiffhistoryId = trstockdiffhistoryId;
    }

    /**
     * [get] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (basically NotNull if update: for the constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] DIFFADD_DATE: {NotNull, varchar(8)} <br>
     * 過不足登録日
     * @return The value of the column 'DIFFADD_DATE'. (basically NotNull if selected: for the constraint)
     */
    public String getDiffaddDate() {
        checkSpecifiedProperty("diffaddDate");
        return convertEmptyToNull(_diffaddDate);
    }

    /**
     * [set] DIFFADD_DATE: {NotNull, varchar(8)} <br>
     * 過不足登録日
     * @param diffaddDate The value of the column 'DIFFADD_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setDiffaddDate(String diffaddDate) {
        registerModifiedProperty("diffaddDate");
        _diffaddDate = diffaddDate;
    }

    /**
     * [get] DIFFOCC_AREA: {NotNull, char(1)} <br>
     * 過不足発生場所
     * @return The value of the column 'DIFFOCC_AREA'. (basically NotNull if selected: for the constraint)
     */
    public String getDiffoccArea() {
        checkSpecifiedProperty("diffoccArea");
        return convertEmptyToNull(_diffoccArea);
    }

    /**
     * [set] DIFFOCC_AREA: {NotNull, char(1)} <br>
     * 過不足発生場所
     * @param diffoccArea The value of the column 'DIFFOCC_AREA'. (basically NotNull if update: for the constraint)
     */
    public void setDiffoccArea(String diffoccArea) {
        registerModifiedProperty("diffoccArea");
        _diffoccArea = diffoccArea;
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
     * [get] INOUT_KBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'INOUT_KBN'. (basically NotNull if selected: for the constraint)
     */
    public String getInoutKbn() {
        checkSpecifiedProperty("inoutKbn");
        return convertEmptyToNull(_inoutKbn);
    }

    /**
     * [set] INOUT_KBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @param inoutKbn The value of the column 'INOUT_KBN'. (basically NotNull if update: for the constraint)
     */
    public void setInoutKbn(String inoutKbn) {
        registerModifiedProperty("inoutKbn");
        _inoutKbn = inoutKbn;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] GOOD_ITEM_KBN: {NotNull, char(1)} <br>
     * 適品・不適品区分
     * @return The value of the column 'GOOD_ITEM_KBN'. (basically NotNull if selected: for the constraint)
     */
    public String getGoodItemKbn() {
        checkSpecifiedProperty("goodItemKbn");
        return convertEmptyToNull(_goodItemKbn);
    }

    /**
     * [set] GOOD_ITEM_KBN: {NotNull, char(1)} <br>
     * 適品・不適品区分
     * @param goodItemKbn The value of the column 'GOOD_ITEM_KBN'. (basically NotNull if update: for the constraint)
     */
    public void setGoodItemKbn(String goodItemKbn) {
        registerModifiedProperty("goodItemKbn");
        _goodItemKbn = goodItemKbn;
    }

    /**
     * [get] DAMAGE_REFUND_KBN: {char(1)} <br>
     * かし品・国税還付品区分
     * @return The value of the column 'DAMAGE_REFUND_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getDamageRefundKbn() {
        checkSpecifiedProperty("damageRefundKbn");
        return convertEmptyToNull(_damageRefundKbn);
    }

    /**
     * [set] DAMAGE_REFUND_KBN: {char(1)} <br>
     * かし品・国税還付品区分
     * @param damageRefundKbn The value of the column 'DAMAGE_REFUND_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDamageRefundKbn(String damageRefundKbn) {
        registerModifiedProperty("damageRefundKbn");
        _damageRefundKbn = damageRefundKbn;
    }

    /**
     * [get] DIFF_QTY: {decimal(16, 6)} <br>
     * 過不足数
     * @return The value of the column 'DIFF_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDiffQty() {
        checkSpecifiedProperty("diffQty");
        return _diffQty;
    }

    /**
     * [set] DIFF_QTY: {decimal(16, 6)} <br>
     * 過不足数
     * @param diffQty The value of the column 'DIFF_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDiffQty(java.math.BigDecimal diffQty) {
        registerModifiedProperty("diffQty");
        _diffQty = diffQty;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] PRINTEDFLG: {NotNull, char(1)} <br>
     * 印刷済フラグ
     * @return The value of the column 'PRINTEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintedflg() {
        checkSpecifiedProperty("printedflg");
        return convertEmptyToNull(_printedflg);
    }

    /**
     * [set] PRINTEDFLG: {NotNull, char(1)} <br>
     * 印刷済フラグ
     * @param printedflg The value of the column 'PRINTEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setPrintedflg(String printedflg) {
        registerModifiedProperty("printedflg");
        _printedflg = printedflg;
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
