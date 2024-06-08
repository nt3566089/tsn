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
 * The entity of T_TRFLEXIBILITY as TABLE. <br>
 * 融通輸送情報
 * <pre>
 * [primary-key]
 *     FLEXIBLE_TRANSPORT_INFO_ID
 *
 * [column]
 *     FLEXIBLE_TRANSPORT_INFO_ID, SUPPLIERCD, SHIPCD, SCHDATE, FLEXIBITYNO, TRANSPORTCD, RCVDATE, STS, INSTRACTDATETIME, VA_EXTDATA1, NM_EXTDATA1, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FLEXIBLE_TRANSPORT_INFO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     T_TRFLEXIBILITYDETAIL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tTrflexibilitydetailList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long flexibleTransportInfoId = entity.getFlexibleTransportInfoId();
 * String suppliercd = entity.getSuppliercd();
 * String shipcd = entity.getShipcd();
 * String schdate = entity.getSchdate();
 * java.math.BigDecimal flexibityno = entity.getFlexibityno();
 * String transportcd = entity.getTransportcd();
 * String rcvdate = entity.getRcvdate();
 * Long sts = entity.getSts();
 * java.sql.Timestamp instractdatetime = entity.getInstractdatetime();
 * String vaExtdata1 = entity.getVaExtdata1();
 * Long nmExtdata1 = entity.getNmExtdata1();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setFlexibleTransportInfoId(flexibleTransportInfoId);
 * entity.setSuppliercd(suppliercd);
 * entity.setShipcd(shipcd);
 * entity.setSchdate(schdate);
 * entity.setFlexibityno(flexibityno);
 * entity.setTransportcd(transportcd);
 * entity.setRcvdate(rcvdate);
 * entity.setSts(sts);
 * entity.setInstractdatetime(instractdatetime);
 * entity.setVaExtdata1(vaExtdata1);
 * entity.setNmExtdata1(nmExtdata1);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
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
public abstract class BsTTrflexibility extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** FLEXIBLE_TRANSPORT_INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _flexibleTransportInfoId;

    /** SUPPLIERCD: {NotNull, varchar(30)} */
    protected String _suppliercd;

    /** SHIPCD: {NotNull, varchar(30)} */
    protected String _shipcd;

    /** SCHDATE: {NotNull, varchar(8)} */
    protected String _schdate;

    /** FLEXIBITYNO: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _flexibityno;

    /** TRANSPORTCD: {IX, NotNull, varchar(30)} */
    protected String _transportcd;

    /** RCVDATE: {IX, NotNull, varchar(8)} */
    protected String _rcvdate;

    /** STS: {IX, NotNull, bigint(19)} */
    protected Long _sts;

    /** INSTRACTDATETIME: {NotNull, datetime2(26, 6)} */
    protected java.sql.Timestamp _instractdatetime;

    /** VA_EXTDATA1: {varchar(30)} */
    protected String _vaExtdata1;

    /** NM_EXTDATA1: {bigint(19)} */
    protected Long _nmExtdata1;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

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
        return "T_TRFLEXIBILITY";
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
        if (_flexibleTransportInfoId == null) { return false; }
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
    /** T_TRFLEXIBILITYDETAIL by FLEXIBLE_TRANSPORT_INFO_ID, named 'TTrflexibilitydetailList'. */
    protected List<TTrflexibilitydetail> _tTrflexibilitydetailList;

    /**
     * [get] T_TRFLEXIBILITYDETAIL by FLEXIBLE_TRANSPORT_INFO_ID, named 'TTrflexibilitydetailList'.
     * @return The entity list of referrer property 'TTrflexibilitydetailList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrflexibilitydetail> getTTrflexibilitydetailList() {
        if (_tTrflexibilitydetailList == null) { _tTrflexibilitydetailList = newReferrerList(); }
        return _tTrflexibilitydetailList;
    }

    /**
     * [set] T_TRFLEXIBILITYDETAIL by FLEXIBLE_TRANSPORT_INFO_ID, named 'TTrflexibilitydetailList'.
     * @param tTrflexibilitydetailList The entity list of referrer property 'TTrflexibilitydetailList'. (NullAllowed)
     */
    public void setTTrflexibilitydetailList(List<TTrflexibilitydetail> tTrflexibilitydetailList) {
        _tTrflexibilitydetailList = tTrflexibilitydetailList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTTrflexibility) {
            BsTTrflexibility other = (BsTTrflexibility)obj;
            if (!xSV(_flexibleTransportInfoId, other._flexibleTransportInfoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _flexibleTransportInfoId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tTrflexibilitydetailList != null) { for (TTrflexibilitydetail et : _tTrflexibilitydetailList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrflexibilitydetailList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_flexibleTransportInfoId));
        sb.append(dm).append(xfND(_suppliercd));
        sb.append(dm).append(xfND(_shipcd));
        sb.append(dm).append(xfND(_schdate));
        sb.append(dm).append(xfND(_flexibityno));
        sb.append(dm).append(xfND(_transportcd));
        sb.append(dm).append(xfND(_rcvdate));
        sb.append(dm).append(xfND(_sts));
        sb.append(dm).append(xfND(_instractdatetime));
        sb.append(dm).append(xfND(_vaExtdata1));
        sb.append(dm).append(xfND(_nmExtdata1));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
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
        if (_tTrflexibilitydetailList != null && !_tTrflexibilitydetailList.isEmpty())
        { sb.append(dm).append("tTrflexibilitydetailList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrflexibility clone() {
        return (TTrflexibility)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FLEXIBLE_TRANSPORT_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送情報ID
     * @return The value of the column 'FLEXIBLE_TRANSPORT_INFO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFlexibleTransportInfoId() {
        checkSpecifiedProperty("flexibleTransportInfoId");
        return _flexibleTransportInfoId;
    }

    /**
     * [set] FLEXIBLE_TRANSPORT_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送情報ID
     * @param flexibleTransportInfoId The value of the column 'FLEXIBLE_TRANSPORT_INFO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFlexibleTransportInfoId(Long flexibleTransportInfoId) {
        registerModifiedProperty("flexibleTransportInfoId");
        _flexibleTransportInfoId = flexibleTransportInfoId;
    }

    /**
     * [get] SUPPLIERCD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SUPPLIERCD'. (basically NotNull if selected: for the constraint)
     */
    public String getSuppliercd() {
        checkSpecifiedProperty("suppliercd");
        return convertEmptyToNull(_suppliercd);
    }

    /**
     * [set] SUPPLIERCD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (basically NotNull if update: for the constraint)
     */
    public void setSuppliercd(String suppliercd) {
        registerModifiedProperty("suppliercd");
        _suppliercd = suppliercd;
    }

    /**
     * [get] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送先CD
     * @return The value of the column 'SHIPCD'. (basically NotNull if selected: for the constraint)
     */
    public String getShipcd() {
        checkSpecifiedProperty("shipcd");
        return convertEmptyToNull(_shipcd);
    }

    /**
     * [set] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送先CD
     * @param shipcd The value of the column 'SHIPCD'. (basically NotNull if update: for the constraint)
     */
    public void setShipcd(String shipcd) {
        registerModifiedProperty("shipcd");
        _shipcd = shipcd;
    }

    /**
     * [get] SCHDATE: {NotNull, varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCHDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getSchdate() {
        checkSpecifiedProperty("schdate");
        return convertEmptyToNull(_schdate);
    }

    /**
     * [set] SCHDATE: {NotNull, varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SCHDATE'. (basically NotNull if update: for the constraint)
     */
    public void setSchdate(String schdate) {
        registerModifiedProperty("schdate");
        _schdate = schdate;
    }

    /**
     * [get] FLEXIBITYNO: {NotNull, decimal(16, 6)} <br>
     * 融通No.
     * @return The value of the column 'FLEXIBITYNO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getFlexibityno() {
        checkSpecifiedProperty("flexibityno");
        return _flexibityno;
    }

    /**
     * [set] FLEXIBITYNO: {NotNull, decimal(16, 6)} <br>
     * 融通No.
     * @param flexibityno The value of the column 'FLEXIBITYNO'. (basically NotNull if update: for the constraint)
     */
    public void setFlexibityno(java.math.BigDecimal flexibityno) {
        registerModifiedProperty("flexibityno");
        _flexibityno = flexibityno;
    }

    /**
     * [get] TRANSPORTCD: {IX, NotNull, varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (basically NotNull if selected: for the constraint)
     */
    public String getTransportcd() {
        checkSpecifiedProperty("transportcd");
        return convertEmptyToNull(_transportcd);
    }

    /**
     * [set] TRANSPORTCD: {IX, NotNull, varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (basically NotNull if update: for the constraint)
     */
    public void setTransportcd(String transportcd) {
        registerModifiedProperty("transportcd");
        _transportcd = transportcd;
    }

    /**
     * [get] RCVDATE: {IX, NotNull, varchar(8)} <br>
     * 受入予定日
     * @return The value of the column 'RCVDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getRcvdate() {
        checkSpecifiedProperty("rcvdate");
        return convertEmptyToNull(_rcvdate);
    }

    /**
     * [set] RCVDATE: {IX, NotNull, varchar(8)} <br>
     * 受入予定日
     * @param rcvdate The value of the column 'RCVDATE'. (basically NotNull if update: for the constraint)
     */
    public void setRcvdate(String rcvdate) {
        registerModifiedProperty("rcvdate");
        _rcvdate = rcvdate;
    }

    /**
     * [get] STS: {IX, NotNull, bigint(19)} <br>
     * ステータス
     * @return The value of the column 'STS'. (basically NotNull if selected: for the constraint)
     */
    public Long getSts() {
        checkSpecifiedProperty("sts");
        return _sts;
    }

    /**
     * [set] STS: {IX, NotNull, bigint(19)} <br>
     * ステータス
     * @param sts The value of the column 'STS'. (basically NotNull if update: for the constraint)
     */
    public void setSts(Long sts) {
        registerModifiedProperty("sts");
        _sts = sts;
    }

    /**
     * [get] INSTRACTDATETIME: {NotNull, datetime2(26, 6)} <br>
     * 指示登録日時
     * @return The value of the column 'INSTRACTDATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getInstractdatetime() {
        checkSpecifiedProperty("instractdatetime");
        return _instractdatetime;
    }

    /**
     * [set] INSTRACTDATETIME: {NotNull, datetime2(26, 6)} <br>
     * 指示登録日時
     * @param instractdatetime The value of the column 'INSTRACTDATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setInstractdatetime(java.sql.Timestamp instractdatetime) {
        registerModifiedProperty("instractdatetime");
        _instractdatetime = instractdatetime;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * 指示変更フラグ
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata1() {
        checkSpecifiedProperty("vaExtdata1");
        return convertEmptyToNull(_vaExtdata1);
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * 指示変更フラグ
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata1(String vaExtdata1) {
        registerModifiedProperty("vaExtdata1");
        _vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] NM_EXTDATA1: {bigint(19)} <br>
     * 発送元融通ステータス
     * @return The value of the column 'NM_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNmExtdata1() {
        checkSpecifiedProperty("nmExtdata1");
        return _nmExtdata1;
    }

    /**
     * [set] NM_EXTDATA1: {bigint(19)} <br>
     * 発送元融通ステータス
     * @param nmExtdata1 The value of the column 'NM_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmExtdata1(Long nmExtdata1) {
        registerModifiedProperty("nmExtdata1");
        _nmExtdata1 = nmExtdata1;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
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
