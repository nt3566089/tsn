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
 * The entity of T_TRINVCORRECT as TABLE. <br>
 * 在庫調査補正情報
 * <pre>
 * [primary-key]
 *     TRINVCORRECT_ID
 *
 * [column]
 *     TRINVCORRECT_ID, CASEINVENTORYNO, CORRECTQTY, PUTDMYCASECD, PUTDMYCUTCASECD, PUTDMYCASEDETAILNO, PUTDMYDIRECTIONNO, PUTDMYDIRECTIONORDERGNO, ACTFLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRINVCORRECT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trinvcorrectId = entity.getTrinvcorrectId();
 * java.math.BigDecimal caseinventoryno = entity.getCaseinventoryno();
 * java.math.BigDecimal correctqty = entity.getCorrectqty();
 * java.math.BigDecimal putdmycasecd = entity.getPutdmycasecd();
 * java.math.BigDecimal putdmycutcasecd = entity.getPutdmycutcasecd();
 * Long putdmycasedetailno = entity.getPutdmycasedetailno();
 * Long putdmydirectionno = entity.getPutdmydirectionno();
 * Long putdmydirectionordergno = entity.getPutdmydirectionordergno();
 * java.math.BigDecimal actflg = entity.getActflg();
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
 * entity.setTrinvcorrectId(trinvcorrectId);
 * entity.setCaseinventoryno(caseinventoryno);
 * entity.setCorrectqty(correctqty);
 * entity.setPutdmycasecd(putdmycasecd);
 * entity.setPutdmycutcasecd(putdmycutcasecd);
 * entity.setPutdmycasedetailno(putdmycasedetailno);
 * entity.setPutdmydirectionno(putdmydirectionno);
 * entity.setPutdmydirectionordergno(putdmydirectionordergno);
 * entity.setActflg(actflg);
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
public abstract class BsTTrinvcorrect extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trinvcorrectId;

    /** CASEINVENTORYNO: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _caseinventoryno;

    /** CORRECTQTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _correctqty;

    /** PUTDMYCASECD: {decimal(16, 6)} */
    protected java.math.BigDecimal _putdmycasecd;

    /** PUTDMYCUTCASECD: {decimal(16, 6)} */
    protected java.math.BigDecimal _putdmycutcasecd;

    /** PUTDMYCASEDETAILNO: {bigint(19)} */
    protected Long _putdmycasedetailno;

    /** PUTDMYDIRECTIONNO: {bigint(19)} */
    protected Long _putdmydirectionno;

    /** PUTDMYDIRECTIONORDERGNO: {bigint(19)} */
    protected Long _putdmydirectionordergno;

    /** ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} */
    protected java.math.BigDecimal _actflg;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
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
        return "T_TRINVCORRECT";
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
        if (_trinvcorrectId == null) { return false; }
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
        if (obj instanceof BsTTrinvcorrect) {
            BsTTrinvcorrect other = (BsTTrinvcorrect)obj;
            if (!xSV(_trinvcorrectId, other._trinvcorrectId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trinvcorrectId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trinvcorrectId));
        sb.append(dm).append(xfND(_caseinventoryno));
        sb.append(dm).append(xfND(_correctqty));
        sb.append(dm).append(xfND(_putdmycasecd));
        sb.append(dm).append(xfND(_putdmycutcasecd));
        sb.append(dm).append(xfND(_putdmycasedetailno));
        sb.append(dm).append(xfND(_putdmydirectionno));
        sb.append(dm).append(xfND(_putdmydirectionordergno));
        sb.append(dm).append(xfND(_actflg));
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
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrinvcorrect clone() {
        return (TTrinvcorrect)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫調査補正情報ID
     * @return The value of the column 'TRINVCORRECT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrinvcorrectId() {
        checkSpecifiedProperty("trinvcorrectId");
        return _trinvcorrectId;
    }

    /**
     * [set] TRINVCORRECT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫調査補正情報ID
     * @param trinvcorrectId The value of the column 'TRINVCORRECT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrinvcorrectId(Long trinvcorrectId) {
        registerModifiedProperty("trinvcorrectId");
        _trinvcorrectId = trinvcorrectId;
    }

    /**
     * [get] CASEINVENTORYNO: {NotNull, decimal(16, 6)} <br>
     * ケース在庫調査番号
     * @return The value of the column 'CASEINVENTORYNO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getCaseinventoryno() {
        checkSpecifiedProperty("caseinventoryno");
        return _caseinventoryno;
    }

    /**
     * [set] CASEINVENTORYNO: {NotNull, decimal(16, 6)} <br>
     * ケース在庫調査番号
     * @param caseinventoryno The value of the column 'CASEINVENTORYNO'. (basically NotNull if update: for the constraint)
     */
    public void setCaseinventoryno(java.math.BigDecimal caseinventoryno) {
        registerModifiedProperty("caseinventoryno");
        _caseinventoryno = caseinventoryno;
    }

    /**
     * [get] CORRECTQTY: {decimal(16, 6)} <br>
     * 補正対象数量
     * @return The value of the column 'CORRECTQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCorrectqty() {
        checkSpecifiedProperty("correctqty");
        return _correctqty;
    }

    /**
     * [set] CORRECTQTY: {decimal(16, 6)} <br>
     * 補正対象数量
     * @param correctqty The value of the column 'CORRECTQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorrectqty(java.math.BigDecimal correctqty) {
        registerModifiedProperty("correctqty");
        _correctqty = correctqty;
    }

    /**
     * [get] PUTDMYCASECD: {decimal(16, 6)} <br>
     * 挿入ダミーケースCD
     * @return The value of the column 'PUTDMYCASECD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPutdmycasecd() {
        checkSpecifiedProperty("putdmycasecd");
        return _putdmycasecd;
    }

    /**
     * [set] PUTDMYCASECD: {decimal(16, 6)} <br>
     * 挿入ダミーケースCD
     * @param putdmycasecd The value of the column 'PUTDMYCASECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPutdmycasecd(java.math.BigDecimal putdmycasecd) {
        registerModifiedProperty("putdmycasecd");
        _putdmycasecd = putdmycasecd;
    }

    /**
     * [get] PUTDMYCUTCASECD: {decimal(16, 6)} <br>
     * 挿入ダミー分割ケースCD
     * @return The value of the column 'PUTDMYCUTCASECD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPutdmycutcasecd() {
        checkSpecifiedProperty("putdmycutcasecd");
        return _putdmycutcasecd;
    }

    /**
     * [set] PUTDMYCUTCASECD: {decimal(16, 6)} <br>
     * 挿入ダミー分割ケースCD
     * @param putdmycutcasecd The value of the column 'PUTDMYCUTCASECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPutdmycutcasecd(java.math.BigDecimal putdmycutcasecd) {
        registerModifiedProperty("putdmycutcasecd");
        _putdmycutcasecd = putdmycutcasecd;
    }

    /**
     * [get] PUTDMYCASEDETAILNO: {bigint(19)} <br>
     * 挿入ダミーケース明細番号
     * @return The value of the column 'PUTDMYCASEDETAILNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPutdmycasedetailno() {
        checkSpecifiedProperty("putdmycasedetailno");
        return _putdmycasedetailno;
    }

    /**
     * [set] PUTDMYCASEDETAILNO: {bigint(19)} <br>
     * 挿入ダミーケース明細番号
     * @param putdmycasedetailno The value of the column 'PUTDMYCASEDETAILNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPutdmycasedetailno(Long putdmycasedetailno) {
        registerModifiedProperty("putdmycasedetailno");
        _putdmycasedetailno = putdmycasedetailno;
    }

    /**
     * [get] PUTDMYDIRECTIONNO: {bigint(19)} <br>
     * 挿入ダミーさしず番号
     * @return The value of the column 'PUTDMYDIRECTIONNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPutdmydirectionno() {
        checkSpecifiedProperty("putdmydirectionno");
        return _putdmydirectionno;
    }

    /**
     * [set] PUTDMYDIRECTIONNO: {bigint(19)} <br>
     * 挿入ダミーさしず番号
     * @param putdmydirectionno The value of the column 'PUTDMYDIRECTIONNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPutdmydirectionno(Long putdmydirectionno) {
        registerModifiedProperty("putdmydirectionno");
        _putdmydirectionno = putdmydirectionno;
    }

    /**
     * [get] PUTDMYDIRECTIONORDERGNO: {bigint(19)} <br>
     * 挿入ダミーさしず実績枝番号
     * @return The value of the column 'PUTDMYDIRECTIONORDERGNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPutdmydirectionordergno() {
        checkSpecifiedProperty("putdmydirectionordergno");
        return _putdmydirectionordergno;
    }

    /**
     * [set] PUTDMYDIRECTIONORDERGNO: {bigint(19)} <br>
     * 挿入ダミーさしず実績枝番号
     * @param putdmydirectionordergno The value of the column 'PUTDMYDIRECTIONORDERGNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPutdmydirectionordergno(Long putdmydirectionordergno) {
        registerModifiedProperty("putdmydirectionordergno");
        _putdmydirectionordergno = putdmydirectionordergno;
    }

    /**
     * [get] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @return The value of the column 'ACTFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getActflg() {
        checkSpecifiedProperty("actflg");
        return _actflg;
    }

    /**
     * [set] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @param actflg The value of the column 'ACTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setActflg(java.math.BigDecimal actflg) {
        registerModifiedProperty("actflg");
        _actflg = actflg;
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
