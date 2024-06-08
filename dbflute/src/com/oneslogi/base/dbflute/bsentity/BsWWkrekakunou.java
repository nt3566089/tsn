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
 * The entity of W_WKREKAKUNOU as TABLE. <br>
 * 国免仕分戻し登録ワーク
 * <pre>
 * [primary-key]
 *     REKAKUNOU_ID
 *
 * [column]
 *     REKAKUNOU_ID, CENTER_ID, CLIENT_ID, REKAKUNOUKEY, REKAKUNOULINENO, PALLETSYMBOLKEY, PALLETKEY, SOJTKEY, SOJTLINENO, OWNERSONO, SOPALLETNO, RCVKEY, TRSYMBOL_ID, SORTEDQTY1, LOT_ID, PACKEDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REKAKUNOU_ID
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
 * Long rekakunouId = entity.getRekakunouId();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * java.math.BigDecimal rekakunoukey = entity.getRekakunoukey();
 * Long rekakunoulineno = entity.getRekakunoulineno();
 * java.math.BigDecimal palletsymbolkey = entity.getPalletsymbolkey();
 * String palletkey = entity.getPalletkey();
 * java.math.BigDecimal sojtkey = entity.getSojtkey();
 * Long sojtlineno = entity.getSojtlineno();
 * String ownersono = entity.getOwnersono();
 * String sopalletno = entity.getSopalletno();
 * java.math.BigDecimal rcvkey = entity.getRcvkey();
 * Long trsymbolId = entity.getTrsymbolId();
 * java.math.BigDecimal sortedqty1 = entity.getSortedqty1();
 * Long lotId = entity.getLotId();
 * String packedflg = entity.getPackedflg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setRekakunouId(rekakunouId);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setRekakunoukey(rekakunoukey);
 * entity.setRekakunoulineno(rekakunoulineno);
 * entity.setPalletsymbolkey(palletsymbolkey);
 * entity.setPalletkey(palletkey);
 * entity.setSojtkey(sojtkey);
 * entity.setSojtlineno(sojtlineno);
 * entity.setOwnersono(ownersono);
 * entity.setSopalletno(sopalletno);
 * entity.setRcvkey(rcvkey);
 * entity.setTrsymbolId(trsymbolId);
 * entity.setSortedqty1(sortedqty1);
 * entity.setLotId(lotId);
 * entity.setPackedflg(packedflg);
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
public abstract class BsWWkrekakunou extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _rekakunouId;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

    /** REKAKUNOUKEY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _rekakunoukey;

    /** REKAKUNOULINENO: {NotNull, bigint(19)} */
    protected Long _rekakunoulineno;

    /** PALLETSYMBOLKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _palletsymbolkey;

    /** PALLETKEY: {varchar(30)} */
    protected String _palletkey;

    /** SOJTKEY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _sojtkey;

    /** SOJTLINENO: {NotNull, bigint(19)} */
    protected Long _sojtlineno;

    /** OWNERSONO: {NotNull, varchar(60)} */
    protected String _ownersono;

    /** SOPALLETNO: {NotNull, varchar(30)} */
    protected String _sopalletno;

    /** RCVKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _rcvkey;

    /** TRSYMBOL_ID: {bigint(19)} */
    protected Long _trsymbolId;

    /** SORTEDQTY1: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _sortedqty1;

    /** LOT_ID: {NotNull, bigint(19)} */
    protected Long _lotId;

    /** PACKEDFLG: {NotNull, char(1)} */
    protected String _packedflg;

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
        return "W_WKREKAKUNOU";
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
        if (_rekakunouId == null) { return false; }
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
        if (obj instanceof BsWWkrekakunou) {
            BsWWkrekakunou other = (BsWWkrekakunou)obj;
            if (!xSV(_rekakunouId, other._rekakunouId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _rekakunouId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_rekakunouId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_rekakunoukey));
        sb.append(dm).append(xfND(_rekakunoulineno));
        sb.append(dm).append(xfND(_palletsymbolkey));
        sb.append(dm).append(xfND(_palletkey));
        sb.append(dm).append(xfND(_sojtkey));
        sb.append(dm).append(xfND(_sojtlineno));
        sb.append(dm).append(xfND(_ownersono));
        sb.append(dm).append(xfND(_sopalletno));
        sb.append(dm).append(xfND(_rcvkey));
        sb.append(dm).append(xfND(_trsymbolId));
        sb.append(dm).append(xfND(_sortedqty1));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_packedflg));
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
    public WWkrekakunou clone() {
        return (WWkrekakunou)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 国免仕分戻し登録ワークID
     * @return The value of the column 'REKAKUNOU_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRekakunouId() {
        checkSpecifiedProperty("rekakunouId");
        return _rekakunouId;
    }

    /**
     * [set] REKAKUNOU_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 国免仕分戻し登録ワークID
     * @param rekakunouId The value of the column 'REKAKUNOU_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRekakunouId(Long rekakunouId) {
        registerModifiedProperty("rekakunouId");
        _rekakunouId = rekakunouId;
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
     * [get] REKAKUNOUKEY: {NotNull, decimal(16, 6)} <br>
     * 仕分戻しキー
     * @return The value of the column 'REKAKUNOUKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRekakunoukey() {
        checkSpecifiedProperty("rekakunoukey");
        return _rekakunoukey;
    }

    /**
     * [set] REKAKUNOUKEY: {NotNull, decimal(16, 6)} <br>
     * 仕分戻しキー
     * @param rekakunoukey The value of the column 'REKAKUNOUKEY'. (basically NotNull if update: for the constraint)
     */
    public void setRekakunoukey(java.math.BigDecimal rekakunoukey) {
        registerModifiedProperty("rekakunoukey");
        _rekakunoukey = rekakunoukey;
    }

    /**
     * [get] REKAKUNOULINENO: {NotNull, bigint(19)} <br>
     * 仕分戻し行No.
     * @return The value of the column 'REKAKUNOULINENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getRekakunoulineno() {
        checkSpecifiedProperty("rekakunoulineno");
        return _rekakunoulineno;
    }

    /**
     * [set] REKAKUNOULINENO: {NotNull, bigint(19)} <br>
     * 仕分戻し行No.
     * @param rekakunoulineno The value of the column 'REKAKUNOULINENO'. (basically NotNull if update: for the constraint)
     */
    public void setRekakunoulineno(Long rekakunoulineno) {
        registerModifiedProperty("rekakunoulineno");
        _rekakunoulineno = rekakunoulineno;
    }

    /**
     * [get] PALLETSYMBOLKEY: {decimal(16, 6)} <br>
     * パレット内個体情報キー
     * @return The value of the column 'PALLETSYMBOLKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPalletsymbolkey() {
        checkSpecifiedProperty("palletsymbolkey");
        return _palletsymbolkey;
    }

    /**
     * [set] PALLETSYMBOLKEY: {decimal(16, 6)} <br>
     * パレット内個体情報キー
     * @param palletsymbolkey The value of the column 'PALLETSYMBOLKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletsymbolkey(java.math.BigDecimal palletsymbolkey) {
        registerModifiedProperty("palletsymbolkey");
        _palletsymbolkey = palletsymbolkey;
    }

    /**
     * [get] PALLETKEY: {varchar(30)} <br>
     * パレット積付キー
     * @return The value of the column 'PALLETKEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletkey() {
        checkSpecifiedProperty("palletkey");
        return convertEmptyToNull(_palletkey);
    }

    /**
     * [set] PALLETKEY: {varchar(30)} <br>
     * パレット積付キー
     * @param palletkey The value of the column 'PALLETKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletkey(String palletkey) {
        registerModifiedProperty("palletkey");
        _palletkey = palletkey;
    }

    /**
     * [get] SOJTKEY: {NotNull, decimal(16, 6)} <br>
     * 出庫指図Ｋｅｙ
     * @return The value of the column 'SOJTKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSojtkey() {
        checkSpecifiedProperty("sojtkey");
        return _sojtkey;
    }

    /**
     * [set] SOJTKEY: {NotNull, decimal(16, 6)} <br>
     * 出庫指図Ｋｅｙ
     * @param sojtkey The value of the column 'SOJTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setSojtkey(java.math.BigDecimal sojtkey) {
        registerModifiedProperty("sojtkey");
        _sojtkey = sojtkey;
    }

    /**
     * [get] SOJTLINENO: {NotNull, bigint(19)} <br>
     * 出庫指図行№
     * @return The value of the column 'SOJTLINENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getSojtlineno() {
        checkSpecifiedProperty("sojtlineno");
        return _sojtlineno;
    }

    /**
     * [set] SOJTLINENO: {NotNull, bigint(19)} <br>
     * 出庫指図行№
     * @param sojtlineno The value of the column 'SOJTLINENO'. (basically NotNull if update: for the constraint)
     */
    public void setSojtlineno(Long sojtlineno) {
        registerModifiedProperty("sojtlineno");
        _sojtlineno = sojtlineno;
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
     * [get] RCVKEY: {decimal(16, 6)} <br>
     * 入庫Ｋｅｙ
     * @return The value of the column 'RCVKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRcvkey() {
        checkSpecifiedProperty("rcvkey");
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {decimal(16, 6)} <br>
     * 入庫Ｋｅｙ
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        registerModifiedProperty("rcvkey");
        _rcvkey = rcvkey;
    }

    /**
     * [get] TRSYMBOL_ID: {bigint(19)} <br>
     * 段ボール情報ID
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrsymbolId() {
        checkSpecifiedProperty("trsymbolId");
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {bigint(19)} <br>
     * 段ボール情報ID
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrsymbolId(Long trsymbolId) {
        registerModifiedProperty("trsymbolId");
        _trsymbolId = trsymbolId;
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
     * [get] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
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
