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
 * The entity of W_PALLET_SYMBOL_JT as TABLE. <br>
 * 国内免税ピッキングワーク
 * <pre>
 * [primary-key]
 *     WKSOJTKEY
 *
 * [column]
 *     WKSOJTKEY, CENTER_ID, CLIENT_ID, TRPALLET_ID, PALLET_NO, OWNER_SO_NO, SO_PALLET_NO, TRSYMBOL_ID, SYMBOL_NO, SORTED_QTY, ENTER_FLG, PACKED_FLG, RCV_KEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WKSOJTKEY
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
 * Long wksojtkey = entity.getWksojtkey();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * Long trpalletId = entity.getTrpalletId();
 * Long palletNo = entity.getPalletNo();
 * String ownerSoNo = entity.getOwnerSoNo();
 * String soPalletNo = entity.getSoPalletNo();
 * Long trsymbolId = entity.getTrsymbolId();
 * Long symbolNo = entity.getSymbolNo();
 * Long sortedQty = entity.getSortedQty();
 * String enterFlg = entity.getEnterFlg();
 * String packedFlg = entity.getPackedFlg();
 * Long rcvKey = entity.getRcvKey();
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
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setTrpalletId(trpalletId);
 * entity.setPalletNo(palletNo);
 * entity.setOwnerSoNo(ownerSoNo);
 * entity.setSoPalletNo(soPalletNo);
 * entity.setTrsymbolId(trsymbolId);
 * entity.setSymbolNo(symbolNo);
 * entity.setSortedQty(sortedQty);
 * entity.setEnterFlg(enterFlg);
 * entity.setPackedFlg(packedFlg);
 * entity.setRcvKey(rcvKey);
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
public abstract class BsWPalletSymbolJt extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _wksojtkey;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

    /** TRPALLET_ID: {NotNull, bigint(19)} */
    protected Long _trpalletId;

    /** PALLET_NO: {NotNull, bigint(19)} */
    protected Long _palletNo;

    /** OWNER_SO_NO: {NotNull, varchar(60)} */
    protected String _ownerSoNo;

    /** SO_PALLET_NO: {NotNull, varchar(30)} */
    protected String _soPalletNo;

    /** TRSYMBOL_ID: {NotNull, bigint(19)} */
    protected Long _trsymbolId;

    /** SYMBOL_NO: {NotNull, bigint(19)} */
    protected Long _symbolNo;

    /** SORTED_QTY: {NotNull, bigint(19)} */
    protected Long _sortedQty;

    /** ENTER_FLG: {NotNull, varchar(30)} */
    protected String _enterFlg;

    /** PACKED_FLG: {NotNull, varchar(30)} */
    protected String _packedFlg;

    /** RCV_KEY: {NotNull, bigint(19)} */
    protected Long _rcvKey;

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
        return "W_PALLET_SYMBOL_JT";
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
        if (obj instanceof BsWPalletSymbolJt) {
            BsWPalletSymbolJt other = (BsWPalletSymbolJt)obj;
            if (!xSV(_wksojtkey, other._wksojtkey)) { return false; }
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
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_trpalletId));
        sb.append(dm).append(xfND(_palletNo));
        sb.append(dm).append(xfND(_ownerSoNo));
        sb.append(dm).append(xfND(_soPalletNo));
        sb.append(dm).append(xfND(_trsymbolId));
        sb.append(dm).append(xfND(_symbolNo));
        sb.append(dm).append(xfND(_sortedQty));
        sb.append(dm).append(xfND(_enterFlg));
        sb.append(dm).append(xfND(_packedFlg));
        sb.append(dm).append(xfND(_rcvKey));
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
    public WPalletSymbolJt clone() {
        return (WPalletSymbolJt)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)} <br>
     * 国内免税ピッキングワークID
     * @return The value of the column 'WKSOJTKEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getWksojtkey() {
        checkSpecifiedProperty("wksojtkey");
        return _wksojtkey;
    }

    /**
     * [set] WKSOJTKEY: {PK, ID, NotNull, bigint identity(19)} <br>
     * 国内免税ピッキングワークID
     * @param wksojtkey The value of the column 'WKSOJTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setWksojtkey(Long wksojtkey) {
        registerModifiedProperty("wksojtkey");
        _wksojtkey = wksojtkey;
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
     * [get] TRPALLET_ID: {NotNull, bigint(19)} <br>
     * パレットはり紙情報ID
     * @return The value of the column 'TRPALLET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrpalletId() {
        checkSpecifiedProperty("trpalletId");
        return _trpalletId;
    }

    /**
     * [set] TRPALLET_ID: {NotNull, bigint(19)} <br>
     * パレットはり紙情報ID
     * @param trpalletId The value of the column 'TRPALLET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrpalletId(Long trpalletId) {
        registerModifiedProperty("trpalletId");
        _trpalletId = trpalletId;
    }

    /**
     * [get] PALLET_NO: {NotNull, bigint(19)} <br>
     * パレット管理番号
     * @return The value of the column 'PALLET_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getPalletNo() {
        checkSpecifiedProperty("palletNo");
        return _palletNo;
    }

    /**
     * [set] PALLET_NO: {NotNull, bigint(19)} <br>
     * パレット管理番号
     * @param palletNo The value of the column 'PALLET_NO'. (basically NotNull if update: for the constraint)
     */
    public void setPalletNo(Long palletNo) {
        registerModifiedProperty("palletNo");
        _palletNo = palletNo;
    }

    /**
     * [get] OWNER_SO_NO: {NotNull, varchar(60)} <br>
     * 整理番号
     * @return The value of the column 'OWNER_SO_NO'. (basically NotNull if selected: for the constraint)
     */
    public String getOwnerSoNo() {
        checkSpecifiedProperty("ownerSoNo");
        return convertEmptyToNull(_ownerSoNo);
    }

    /**
     * [set] OWNER_SO_NO: {NotNull, varchar(60)} <br>
     * 整理番号
     * @param ownerSoNo The value of the column 'OWNER_SO_NO'. (basically NotNull if update: for the constraint)
     */
    public void setOwnerSoNo(String ownerSoNo) {
        registerModifiedProperty("ownerSoNo");
        _ownerSoNo = ownerSoNo;
    }

    /**
     * [get] SO_PALLET_NO: {NotNull, varchar(30)} <br>
     * パレット番号
     * @return The value of the column 'SO_PALLET_NO'. (basically NotNull if selected: for the constraint)
     */
    public String getSoPalletNo() {
        checkSpecifiedProperty("soPalletNo");
        return convertEmptyToNull(_soPalletNo);
    }

    /**
     * [set] SO_PALLET_NO: {NotNull, varchar(30)} <br>
     * パレット番号
     * @param soPalletNo The value of the column 'SO_PALLET_NO'. (basically NotNull if update: for the constraint)
     */
    public void setSoPalletNo(String soPalletNo) {
        registerModifiedProperty("soPalletNo");
        _soPalletNo = soPalletNo;
    }

    /**
     * [get] TRSYMBOL_ID: {NotNull, bigint(19)} <br>
     * 段ボール情報ID
     * @return The value of the column 'TRSYMBOL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrsymbolId() {
        checkSpecifiedProperty("trsymbolId");
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {NotNull, bigint(19)} <br>
     * 段ボール情報ID
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrsymbolId(Long trsymbolId) {
        registerModifiedProperty("trsymbolId");
        _trsymbolId = trsymbolId;
    }

    /**
     * [get] SYMBOL_NO: {NotNull, bigint(19)} <br>
     * シンボル管理番号
     * @return The value of the column 'SYMBOL_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getSymbolNo() {
        checkSpecifiedProperty("symbolNo");
        return _symbolNo;
    }

    /**
     * [set] SYMBOL_NO: {NotNull, bigint(19)} <br>
     * シンボル管理番号
     * @param symbolNo The value of the column 'SYMBOL_NO'. (basically NotNull if update: for the constraint)
     */
    public void setSymbolNo(Long symbolNo) {
        registerModifiedProperty("symbolNo");
        _symbolNo = symbolNo;
    }

    /**
     * [get] SORTED_QTY: {NotNull, bigint(19)} <br>
     * 仕分済数量
     * @return The value of the column 'SORTED_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getSortedQty() {
        checkSpecifiedProperty("sortedQty");
        return _sortedQty;
    }

    /**
     * [set] SORTED_QTY: {NotNull, bigint(19)} <br>
     * 仕分済数量
     * @param sortedQty The value of the column 'SORTED_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setSortedQty(Long sortedQty) {
        registerModifiedProperty("sortedQty");
        _sortedQty = sortedQty;
    }

    /**
     * [get] ENTER_FLG: {NotNull, varchar(30)} <br>
     * 確定済フラグ
     * @return The value of the column 'ENTER_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getEnterFlg() {
        checkSpecifiedProperty("enterFlg");
        return convertEmptyToNull(_enterFlg);
    }

    /**
     * [set] ENTER_FLG: {NotNull, varchar(30)} <br>
     * 確定済フラグ
     * @param enterFlg The value of the column 'ENTER_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setEnterFlg(String enterFlg) {
        registerModifiedProperty("enterFlg");
        _enterFlg = enterFlg;
    }

    /**
     * [get] PACKED_FLG: {NotNull, varchar(30)} <br>
     * 段ボール有無フラグ
     * @return The value of the column 'PACKED_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPackedFlg() {
        checkSpecifiedProperty("packedFlg");
        return convertEmptyToNull(_packedFlg);
    }

    /**
     * [set] PACKED_FLG: {NotNull, varchar(30)} <br>
     * 段ボール有無フラグ
     * @param packedFlg The value of the column 'PACKED_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setPackedFlg(String packedFlg) {
        registerModifiedProperty("packedFlg");
        _packedFlg = packedFlg;
    }

    /**
     * [get] RCV_KEY: {NotNull, bigint(19)} <br>
     * 入庫キー
     * @return The value of the column 'RCV_KEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getRcvKey() {
        checkSpecifiedProperty("rcvKey");
        return _rcvKey;
    }

    /**
     * [set] RCV_KEY: {NotNull, bigint(19)} <br>
     * 入庫キー
     * @param rcvKey The value of the column 'RCV_KEY'. (basically NotNull if update: for the constraint)
     */
    public void setRcvKey(Long rcvKey) {
        registerModifiedProperty("rcvKey");
        _rcvKey = rcvKey;
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
