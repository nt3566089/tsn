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
 * The entity of W_WKPALLETSYMBOLJT as TABLE. <br>
 * 国免在庫引当中間
 * <pre>
 * [primary-key]
 *     WKSOJTKEY, SYMBOLNO
 *
 * [column]
 *     WKSOJTKEY, PALLETNO, OWNERSONO, SOPALLETNO, RCVKEY, SYMBOLNO, SORTEDQTY1, LOTKEY, PACKEDFLG, ENTERFLG, ACTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * java.math.BigDecimal wksojtkey = entity.getWksojtkey();
 * java.math.BigDecimal palletno = entity.getPalletno();
 * String ownersono = entity.getOwnersono();
 * String sopalletno = entity.getSopalletno();
 * java.math.BigDecimal rcvkey = entity.getRcvkey();
 * java.math.BigDecimal symbolno = entity.getSymbolno();
 * java.math.BigDecimal sortedqty1 = entity.getSortedqty1();
 * Long lotkey = entity.getLotkey();
 * String packedflg = entity.getPackedflg();
 * java.math.BigDecimal enterflg = entity.getEnterflg();
 * java.math.BigDecimal actflg = entity.getActflg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setWksojtkey(wksojtkey);
 * entity.setPalletno(palletno);
 * entity.setOwnersono(ownersono);
 * entity.setSopalletno(sopalletno);
 * entity.setRcvkey(rcvkey);
 * entity.setSymbolno(symbolno);
 * entity.setSortedqty1(sortedqty1);
 * entity.setLotkey(lotkey);
 * entity.setPackedflg(packedflg);
 * entity.setEnterflg(enterflg);
 * entity.setActflg(actflg);
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
public abstract class BsWWkpalletsymboljt extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WKSOJTKEY: {PK, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _wksojtkey;

    /** PALLETNO: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _palletno;

    /** OWNERSONO: {NotNull, varchar(60)} */
    protected String _ownersono;

    /** SOPALLETNO: {NotNull, varchar(30)} */
    protected String _sopalletno;

    /** RCVKEY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _rcvkey;

    /** SYMBOLNO: {PK, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _symbolno;

    /** SORTEDQTY1: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _sortedqty1;

    /** LOTKEY: {NotNull, bigint(19)} */
    protected Long _lotkey;

    /** PACKEDFLG: {NotNull, char(1)} */
    protected String _packedflg;

    /** ENTERFLG: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _enterflg;

    /** ACTFLG: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _actflg;

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
        return "W_WKPALLETSYMBOLJT";
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
        if (_wksojtkey == null) { return false; }
        if (_symbolno == null) { return false; }
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
        if (obj instanceof BsWWkpalletsymboljt) {
            BsWWkpalletsymboljt other = (BsWWkpalletsymboljt)obj;
            if (!xSV(_wksojtkey, other._wksojtkey)) { return false; }
            if (!xSV(_symbolno, other._symbolno)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _wksojtkey);
        hs = xCH(hs, _symbolno);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_wksojtkey));
        sb.append(dm).append(xfND(_palletno));
        sb.append(dm).append(xfND(_ownersono));
        sb.append(dm).append(xfND(_sopalletno));
        sb.append(dm).append(xfND(_rcvkey));
        sb.append(dm).append(xfND(_symbolno));
        sb.append(dm).append(xfND(_sortedqty1));
        sb.append(dm).append(xfND(_lotkey));
        sb.append(dm).append(xfND(_packedflg));
        sb.append(dm).append(xfND(_enterflg));
        sb.append(dm).append(xfND(_actflg));
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
    public WWkpalletsymboljt clone() {
        return (WWkpalletsymboljt)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WKSOJTKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 国免在庫引当中間情報キー
     * @return The value of the column 'WKSOJTKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getWksojtkey() {
        checkSpecifiedProperty("wksojtkey");
        return _wksojtkey;
    }

    /**
     * [set] WKSOJTKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 国免在庫引当中間情報キー
     * @param wksojtkey The value of the column 'WKSOJTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setWksojtkey(java.math.BigDecimal wksojtkey) {
        registerModifiedProperty("wksojtkey");
        _wksojtkey = wksojtkey;
    }

    /**
     * [get] PALLETNO: {NotNull, decimal(16, 6)} <br>
     * パレット管理番号
     * @return The value of the column 'PALLETNO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPalletno() {
        checkSpecifiedProperty("palletno");
        return _palletno;
    }

    /**
     * [set] PALLETNO: {NotNull, decimal(16, 6)} <br>
     * パレット管理番号
     * @param palletno The value of the column 'PALLETNO'. (basically NotNull if update: for the constraint)
     */
    public void setPalletno(java.math.BigDecimal palletno) {
        registerModifiedProperty("palletno");
        _palletno = palletno;
    }

    /**
     * [get] OWNERSONO: {NotNull, varchar(60)} <br>
     * 整理番号
     * @return The value of the column 'OWNERSONO'. (basically NotNull if selected: for the constraint)
     */
    public String getOwnersono() {
        checkSpecifiedProperty("ownersono");
        return convertEmptyToNull(_ownersono);
    }

    /**
     * [set] OWNERSONO: {NotNull, varchar(60)} <br>
     * 整理番号
     * @param ownersono The value of the column 'OWNERSONO'. (basically NotNull if update: for the constraint)
     */
    public void setOwnersono(String ownersono) {
        registerModifiedProperty("ownersono");
        _ownersono = ownersono;
    }

    /**
     * [get] SOPALLETNO: {NotNull, varchar(30)} <br>
     * パレット番号
     * @return The value of the column 'SOPALLETNO'. (basically NotNull if selected: for the constraint)
     */
    public String getSopalletno() {
        checkSpecifiedProperty("sopalletno");
        return convertEmptyToNull(_sopalletno);
    }

    /**
     * [set] SOPALLETNO: {NotNull, varchar(30)} <br>
     * パレット番号
     * @param sopalletno The value of the column 'SOPALLETNO'. (basically NotNull if update: for the constraint)
     */
    public void setSopalletno(String sopalletno) {
        registerModifiedProperty("sopalletno");
        _sopalletno = sopalletno;
    }

    /**
     * [get] RCVKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRcvkey() {
        checkSpecifiedProperty("rcvkey");
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (basically NotNull if update: for the constraint)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        registerModifiedProperty("rcvkey");
        _rcvkey = rcvkey;
    }

    /**
     * [get] SYMBOLNO: {PK, NotNull, decimal(16, 6)} <br>
     * シンボル管理番号
     * @return The value of the column 'SYMBOLNO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSymbolno() {
        checkSpecifiedProperty("symbolno");
        return _symbolno;
    }

    /**
     * [set] SYMBOLNO: {PK, NotNull, decimal(16, 6)} <br>
     * シンボル管理番号
     * @param symbolno The value of the column 'SYMBOLNO'. (basically NotNull if update: for the constraint)
     */
    public void setSymbolno(java.math.BigDecimal symbolno) {
        registerModifiedProperty("symbolno");
        _symbolno = symbolno;
    }

    /**
     * [get] SORTEDQTY1: {NotNull, decimal(16, 6)} <br>
     * 仕分済数量１（バラ）
     * @return The value of the column 'SORTEDQTY1'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSortedqty1() {
        checkSpecifiedProperty("sortedqty1");
        return _sortedqty1;
    }

    /**
     * [set] SORTEDQTY1: {NotNull, decimal(16, 6)} <br>
     * 仕分済数量１（バラ）
     * @param sortedqty1 The value of the column 'SORTEDQTY1'. (basically NotNull if update: for the constraint)
     */
    public void setSortedqty1(java.math.BigDecimal sortedqty1) {
        registerModifiedProperty("sortedqty1");
        _sortedqty1 = sortedqty1;
    }

    /**
     * [get] LOTKEY: {NotNull, bigint(19)} <br>
     * ロットキー
     * @return The value of the column 'LOTKEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getLotkey() {
        checkSpecifiedProperty("lotkey");
        return _lotkey;
    }

    /**
     * [set] LOTKEY: {NotNull, bigint(19)} <br>
     * ロットキー
     * @param lotkey The value of the column 'LOTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setLotkey(Long lotkey) {
        registerModifiedProperty("lotkey");
        _lotkey = lotkey;
    }

    /**
     * [get] PACKEDFLG: {NotNull, char(1)} <br>
     * 段ボール有無フラグ
     * @return The value of the column 'PACKEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPackedflg() {
        checkSpecifiedProperty("packedflg");
        return convertEmptyToNull(_packedflg);
    }

    /**
     * [set] PACKEDFLG: {NotNull, char(1)} <br>
     * 段ボール有無フラグ
     * @param packedflg The value of the column 'PACKEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setPackedflg(String packedflg) {
        registerModifiedProperty("packedflg");
        _packedflg = packedflg;
    }

    /**
     * [get] ENTERFLG: {NotNull, decimal(16, 6)} <br>
     * 確定フラグ
     * @return The value of the column 'ENTERFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getEnterflg() {
        checkSpecifiedProperty("enterflg");
        return _enterflg;
    }

    /**
     * [set] ENTERFLG: {NotNull, decimal(16, 6)} <br>
     * 確定フラグ
     * @param enterflg The value of the column 'ENTERFLG'. (basically NotNull if update: for the constraint)
     */
    public void setEnterflg(java.math.BigDecimal enterflg) {
        registerModifiedProperty("enterflg");
        _enterflg = enterflg;
    }

    /**
     * [get] ACTFLG: {NotNull, decimal(16, 6)} <br>
     * 活動中フラグ
     * @return The value of the column 'ACTFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getActflg() {
        checkSpecifiedProperty("actflg");
        return _actflg;
    }

    /**
     * [set] ACTFLG: {NotNull, decimal(16, 6)} <br>
     * 活動中フラグ
     * @param actflg The value of the column 'ACTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setActflg(java.math.BigDecimal actflg) {
        registerModifiedProperty("actflg");
        _actflg = actflg;
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
