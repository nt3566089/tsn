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
 * The entity of T_TRPALLETSYMBOL as TABLE. <br>
 * パレット内個体情報
 * <pre>
 * [primary-key]
 *     PALLET_INDIVIDUAL_INFO_ID
 *
 * [column]
 *     PALLET_INDIVIDUAL_INFO_ID, PALLETSYMBOLKEY, PALLETKEY, SOID, SODETAILID, OWNERSONO, SOPALLETNO, RCVID, CENTER_SYMBOL_ID, SORTEDQTY1, LOT_ID, PALLETSYMBOLPRINTFLG, PACKEDFLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PALLET_INDIVIDUAL_INFO_ID
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
 * Long palletIndividualInfoId = entity.getPalletIndividualInfoId();
 * java.math.BigDecimal palletsymbolkey = entity.getPalletsymbolkey();
 * String palletkey = entity.getPalletkey();
 * Long soid = entity.getSoid();
 * Long sodetailid = entity.getSodetailid();
 * String ownersono = entity.getOwnersono();
 * String sopalletno = entity.getSopalletno();
 * Long rcvid = entity.getRcvid();
 * Long centerSymbolId = entity.getCenterSymbolId();
 * Long sortedqty1 = entity.getSortedqty1();
 * Long lotId = entity.getLotId();
 * java.math.BigDecimal palletsymbolprintflg = entity.getPalletsymbolprintflg();
 * String packedflg = entity.getPackedflg();
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
 * entity.setPalletIndividualInfoId(palletIndividualInfoId);
 * entity.setPalletsymbolkey(palletsymbolkey);
 * entity.setPalletkey(palletkey);
 * entity.setSoid(soid);
 * entity.setSodetailid(sodetailid);
 * entity.setOwnersono(ownersono);
 * entity.setSopalletno(sopalletno);
 * entity.setRcvid(rcvid);
 * entity.setCenterSymbolId(centerSymbolId);
 * entity.setSortedqty1(sortedqty1);
 * entity.setLotId(lotId);
 * entity.setPalletsymbolprintflg(palletsymbolprintflg);
 * entity.setPackedflg(packedflg);
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
public abstract class BsTTrpalletsymbol extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PALLET_INDIVIDUAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _palletIndividualInfoId;

    /** PALLETSYMBOLKEY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _palletsymbolkey;

    /** PALLETKEY: {IX+, varchar(30)} */
    protected String _palletkey;

    /** SOID: {bigint(19)} */
    protected Long _soid;

    /** SODETAILID: {bigint(19)} */
    protected Long _sodetailid;

    /** OWNERSONO: {varchar(60)} */
    protected String _ownersono;

    /** SOPALLETNO: {varchar(30)} */
    protected String _sopalletno;

    /** RCVID: {bigint(19)} */
    protected Long _rcvid;

    /** CENTER_SYMBOL_ID: {IX+, bigint(19)} */
    protected Long _centerSymbolId;

    /** SORTEDQTY1: {bigint(19)} */
    protected Long _sortedqty1;

    /** LOT_ID: {bigint(19)} */
    protected Long _lotId;

    /** PALLETSYMBOLPRINTFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _palletsymbolprintflg;

    /** PACKEDFLG: {char(1)} */
    protected String _packedflg;

    /** CENTER_ID: {IX+, NotNull, bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
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
        return "T_TRPALLETSYMBOL";
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
        if (_palletIndividualInfoId == null) { return false; }
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
        if (obj instanceof BsTTrpalletsymbol) {
            BsTTrpalletsymbol other = (BsTTrpalletsymbol)obj;
            if (!xSV(_palletIndividualInfoId, other._palletIndividualInfoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _palletIndividualInfoId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_palletIndividualInfoId));
        sb.append(dm).append(xfND(_palletsymbolkey));
        sb.append(dm).append(xfND(_palletkey));
        sb.append(dm).append(xfND(_soid));
        sb.append(dm).append(xfND(_sodetailid));
        sb.append(dm).append(xfND(_ownersono));
        sb.append(dm).append(xfND(_sopalletno));
        sb.append(dm).append(xfND(_rcvid));
        sb.append(dm).append(xfND(_centerSymbolId));
        sb.append(dm).append(xfND(_sortedqty1));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_palletsymbolprintflg));
        sb.append(dm).append(xfND(_packedflg));
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
        return "";
    }

    @Override
    public TTrpalletsymbol clone() {
        return (TTrpalletsymbol)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PALLET_INDIVIDUAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレット内個体情報ID
     * @return The value of the column 'PALLET_INDIVIDUAL_INFO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPalletIndividualInfoId() {
        checkSpecifiedProperty("palletIndividualInfoId");
        return _palletIndividualInfoId;
    }

    /**
     * [set] PALLET_INDIVIDUAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * パレット内個体情報ID
     * @param palletIndividualInfoId The value of the column 'PALLET_INDIVIDUAL_INFO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPalletIndividualInfoId(Long palletIndividualInfoId) {
        registerModifiedProperty("palletIndividualInfoId");
        _palletIndividualInfoId = palletIndividualInfoId;
    }

    /**
     * [get] PALLETSYMBOLKEY: {NotNull, decimal(16, 6)} <br>
     * パレット内個体情報キー
     * @return The value of the column 'PALLETSYMBOLKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPalletsymbolkey() {
        checkSpecifiedProperty("palletsymbolkey");
        return _palletsymbolkey;
    }

    /**
     * [set] PALLETSYMBOLKEY: {NotNull, decimal(16, 6)} <br>
     * パレット内個体情報キー
     * @param palletsymbolkey The value of the column 'PALLETSYMBOLKEY'. (basically NotNull if update: for the constraint)
     */
    public void setPalletsymbolkey(java.math.BigDecimal palletsymbolkey) {
        registerModifiedProperty("palletsymbolkey");
        _palletsymbolkey = palletsymbolkey;
    }

    /**
     * [get] PALLETKEY: {IX+, varchar(30)} <br>
     * パレット積付キー
     * @return The value of the column 'PALLETKEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletkey() {
        checkSpecifiedProperty("palletkey");
        return convertEmptyToNull(_palletkey);
    }

    /**
     * [set] PALLETKEY: {IX+, varchar(30)} <br>
     * パレット積付キー
     * @param palletkey The value of the column 'PALLETKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletkey(String palletkey) {
        registerModifiedProperty("palletkey");
        _palletkey = palletkey;
    }

    /**
     * [get] SOID: {bigint(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSoid() {
        checkSpecifiedProperty("soid");
        return _soid;
    }

    /**
     * [set] SOID: {bigint(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSoid(Long soid) {
        registerModifiedProperty("soid");
        _soid = soid;
    }

    /**
     * [get] SODETAILID: {bigint(19)} <br>
     * 出庫予定明細ID
     * @return The value of the column 'SODETAILID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSodetailid() {
        checkSpecifiedProperty("sodetailid");
        return _sodetailid;
    }

    /**
     * [set] SODETAILID: {bigint(19)} <br>
     * 出庫予定明細ID
     * @param sodetailid The value of the column 'SODETAILID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSodetailid(Long sodetailid) {
        registerModifiedProperty("sodetailid");
        _sodetailid = sodetailid;
    }

    /**
     * [get] OWNERSONO: {varchar(60)} <br>
     * 整理番号
     * @return The value of the column 'OWNERSONO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnersono() {
        checkSpecifiedProperty("ownersono");
        return convertEmptyToNull(_ownersono);
    }

    /**
     * [set] OWNERSONO: {varchar(60)} <br>
     * 整理番号
     * @param ownersono The value of the column 'OWNERSONO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnersono(String ownersono) {
        registerModifiedProperty("ownersono");
        _ownersono = ownersono;
    }

    /**
     * [get] SOPALLETNO: {varchar(30)} <br>
     * パレット番号
     * @return The value of the column 'SOPALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSopalletno() {
        checkSpecifiedProperty("sopalletno");
        return convertEmptyToNull(_sopalletno);
    }

    /**
     * [set] SOPALLETNO: {varchar(30)} <br>
     * パレット番号
     * @param sopalletno The value of the column 'SOPALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSopalletno(String sopalletno) {
        registerModifiedProperty("sopalletno");
        _sopalletno = sopalletno;
    }

    /**
     * [get] RCVID: {bigint(19)} <br>
     * 入庫予定ID
     * @return The value of the column 'RCVID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRcvid() {
        checkSpecifiedProperty("rcvid");
        return _rcvid;
    }

    /**
     * [set] RCVID: {bigint(19)} <br>
     * 入庫予定ID
     * @param rcvid The value of the column 'RCVID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvid(Long rcvid) {
        registerModifiedProperty("rcvid");
        _rcvid = rcvid;
    }

    /**
     * [get] CENTER_SYMBOL_ID: {IX+, bigint(19)} <br>
     * 拠点シンボルID
     * @return The value of the column 'CENTER_SYMBOL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterSymbolId() {
        checkSpecifiedProperty("centerSymbolId");
        return _centerSymbolId;
    }

    /**
     * [set] CENTER_SYMBOL_ID: {IX+, bigint(19)} <br>
     * 拠点シンボルID
     * @param centerSymbolId The value of the column 'CENTER_SYMBOL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterSymbolId(Long centerSymbolId) {
        registerModifiedProperty("centerSymbolId");
        _centerSymbolId = centerSymbolId;
    }

    /**
     * [get] SORTEDQTY1: {bigint(19)} <br>
     * 仕分済数量１（バラ）
     * @return The value of the column 'SORTEDQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSortedqty1() {
        checkSpecifiedProperty("sortedqty1");
        return _sortedqty1;
    }

    /**
     * [set] SORTEDQTY1: {bigint(19)} <br>
     * 仕分済数量１（バラ）
     * @param sortedqty1 The value of the column 'SORTEDQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortedqty1(Long sortedqty1) {
        registerModifiedProperty("sortedqty1");
        _sortedqty1 = sortedqty1;
    }

    /**
     * [get] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLotId() {
        checkSpecifiedProperty("lotId");
        return _lotId;
    }

    /**
     * [set] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotId(Long lotId) {
        registerModifiedProperty("lotId");
        _lotId = lotId;
    }

    /**
     * [get] PALLETSYMBOLPRINTFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * パレット内個体情報CD一覧印刷区分
     * @return The value of the column 'PALLETSYMBOLPRINTFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPalletsymbolprintflg() {
        checkSpecifiedProperty("palletsymbolprintflg");
        return _palletsymbolprintflg;
    }

    /**
     * [set] PALLETSYMBOLPRINTFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * パレット内個体情報CD一覧印刷区分
     * @param palletsymbolprintflg The value of the column 'PALLETSYMBOLPRINTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setPalletsymbolprintflg(java.math.BigDecimal palletsymbolprintflg) {
        registerModifiedProperty("palletsymbolprintflg");
        _palletsymbolprintflg = palletsymbolprintflg;
    }

    /**
     * [get] PACKEDFLG: {char(1)} <br>
     * 段ボール有無フラグ
     * @return The value of the column 'PACKEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackedflg() {
        checkSpecifiedProperty("packedflg");
        return convertEmptyToNull(_packedflg);
    }

    /**
     * [set] PACKEDFLG: {char(1)} <br>
     * 段ボール有無フラグ
     * @param packedflg The value of the column 'PACKEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackedflg(String packedflg) {
        registerModifiedProperty("packedflg");
        _packedflg = packedflg;
    }

    /**
     * [get] CENTER_ID: {IX+, NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX+, NotNull, bigint(19)} <br>
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
