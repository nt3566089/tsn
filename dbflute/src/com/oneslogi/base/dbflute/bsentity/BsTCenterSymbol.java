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
 * The entity of T_CENTER_SYMBOL as TABLE. <br>
 * 拠点シンボル
 * <pre>
 * [primary-key]
 *     CENTER_SYMBOL_ID
 *
 * [column]
 *     CENTER_SYMBOL_ID, CENTER_ID, CLIENT_ID, PALLET_ID, TRSYMBOL_ID, CHILD_CENTER_SYMBOL_ID, SORTSTOCK_NUMBER, QR_CODE, LOT_ID, CASE_MOVE_STS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_SYMBOL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, T_CENTER_SYMBOL, M_CLIENT, T_TRSYMBOL, T_PALLET
 *
 * [referrer table]
 *     T_CENTER_SYMBOL
 *
 * [foreign property]
 *     mCenter, tCenterSymbolSelf, mClient, tTrsymbol, tPallet
 *
 * [referrer property]
 *     tCenterSymbolSelfList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long centerSymbolId = entity.getCenterSymbolId();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * Long palletId = entity.getPalletId();
 * Long trsymbolId = entity.getTrsymbolId();
 * Long childCenterSymbolId = entity.getChildCenterSymbolId();
 * Long sortstockNumber = entity.getSortstockNumber();
 * String qrCode = entity.getQrCode();
 * Long lotId = entity.getLotId();
 * String caseMoveSts = entity.getCaseMoveSts();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCenterSymbolId(centerSymbolId);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setPalletId(palletId);
 * entity.setTrsymbolId(trsymbolId);
 * entity.setChildCenterSymbolId(childCenterSymbolId);
 * entity.setSortstockNumber(sortstockNumber);
 * entity.setQrCode(qrCode);
 * entity.setLotId(lotId);
 * entity.setCaseMoveSts(caseMoveSts);
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
public abstract class BsTCenterSymbol extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)} */
    protected Long _centerSymbolId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** PALLET_ID: {bigint(19), FK to T_PALLET} */
    protected Long _palletId;

    /** TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL} */
    protected Long _trsymbolId;

    /** CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL} */
    protected Long _childCenterSymbolId;

    /** SORTSTOCK_NUMBER: {+UQ, bigint(19)} */
    protected Long _sortstockNumber;

    /** QR_CODE: {NotNull, varchar(255)} */
    protected String _qrCode;

    /** LOT_ID: {bigint(19)} */
    protected Long _lotId;

    /** CASE_MOVE_STS: {NotNull, varchar(30)} */
    protected String _caseMoveSts;

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
        return "T_CENTER_SYMBOL";
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
        if (_centerSymbolId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param centerSymbolId : PK, ID, UQ+, IX, NotNull, bigint identity(19). (NotNull)
     * @param sortstockNumber : +UQ, bigint(19). (NotNull)
     */
    public void uniqueBy(Long centerSymbolId, Long sortstockNumber) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("centerSymbolId");
        __uniqueDrivenProperties.addPropertyName("sortstockNumber");
        setCenterSymbolId(centerSymbolId);setSortstockNumber(sortstockNumber);
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

    /** T_CENTER_SYMBOL by my CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelf'. */
    protected TCenterSymbol _tCenterSymbolSelf;

    /**
     * [get] T_CENTER_SYMBOL by my CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelf'. <br>
     * @return The entity of foreign property 'TCenterSymbolSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TCenterSymbol getTCenterSymbolSelf() {
        return _tCenterSymbolSelf;
    }

    /**
     * [set] T_CENTER_SYMBOL by my CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelf'.
     * @param tCenterSymbolSelf The entity of foreign property 'TCenterSymbolSelf'. (NullAllowed)
     */
    public void setTCenterSymbolSelf(TCenterSymbol tCenterSymbolSelf) {
        _tCenterSymbolSelf = tCenterSymbolSelf;
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

    /** T_TRSYMBOL by my TRSYMBOL_ID, named 'TTrsymbol'. */
    protected TTrsymbol _tTrsymbol;

    /**
     * [get] T_TRSYMBOL by my TRSYMBOL_ID, named 'TTrsymbol'. <br>
     * @return The entity of foreign property 'TTrsymbol'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TTrsymbol getTTrsymbol() {
        return _tTrsymbol;
    }

    /**
     * [set] T_TRSYMBOL by my TRSYMBOL_ID, named 'TTrsymbol'.
     * @param tTrsymbol The entity of foreign property 'TTrsymbol'. (NullAllowed)
     */
    public void setTTrsymbol(TTrsymbol tTrsymbol) {
        _tTrsymbol = tTrsymbol;
    }

    /** T_PALLET by my PALLET_ID, named 'TPallet'. */
    protected TPallet _tPallet;

    /**
     * [get] T_PALLET by my PALLET_ID, named 'TPallet'. <br>
     * @return The entity of foreign property 'TPallet'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TPallet getTPallet() {
        return _tPallet;
    }

    /**
     * [set] T_PALLET by my PALLET_ID, named 'TPallet'.
     * @param tPallet The entity of foreign property 'TPallet'. (NullAllowed)
     */
    public void setTPallet(TPallet tPallet) {
        _tPallet = tPallet;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_CENTER_SYMBOL by CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelfList'. */
    protected List<TCenterSymbol> _tCenterSymbolSelfList;

    /**
     * [get] T_CENTER_SYMBOL by CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelfList'.
     * @return The entity list of referrer property 'TCenterSymbolSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TCenterSymbol> getTCenterSymbolSelfList() {
        if (_tCenterSymbolSelfList == null) { _tCenterSymbolSelfList = newReferrerList(); }
        return _tCenterSymbolSelfList;
    }

    /**
     * [set] T_CENTER_SYMBOL by CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelfList'.
     * @param tCenterSymbolSelfList The entity list of referrer property 'TCenterSymbolSelfList'. (NullAllowed)
     */
    public void setTCenterSymbolSelfList(List<TCenterSymbol> tCenterSymbolSelfList) {
        _tCenterSymbolSelfList = tCenterSymbolSelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTCenterSymbol) {
            BsTCenterSymbol other = (BsTCenterSymbol)obj;
            if (!xSV(_centerSymbolId, other._centerSymbolId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _centerSymbolId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_tCenterSymbolSelf != null)
        { sb.append(li).append(xbRDS(_tCenterSymbolSelf, "tCenterSymbolSelf")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_tTrsymbol != null)
        { sb.append(li).append(xbRDS(_tTrsymbol, "tTrsymbol")); }
        if (_tPallet != null)
        { sb.append(li).append(xbRDS(_tPallet, "tPallet")); }
        if (_tCenterSymbolSelfList != null) { for (TCenterSymbol et : _tCenterSymbolSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tCenterSymbolSelfList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_centerSymbolId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_palletId));
        sb.append(dm).append(xfND(_trsymbolId));
        sb.append(dm).append(xfND(_childCenterSymbolId));
        sb.append(dm).append(xfND(_sortstockNumber));
        sb.append(dm).append(xfND(_qrCode));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_caseMoveSts));
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
        if (_tCenterSymbolSelf != null)
        { sb.append(dm).append("tCenterSymbolSelf"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_tTrsymbol != null)
        { sb.append(dm).append("tTrsymbol"); }
        if (_tPallet != null)
        { sb.append(dm).append("tPallet"); }
        if (_tCenterSymbolSelfList != null && !_tCenterSymbolSelfList.isEmpty())
        { sb.append(dm).append("tCenterSymbolSelfList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TCenterSymbol clone() {
        return (TCenterSymbol)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)} <br>
     * 拠点シンボルID
     * @return The value of the column 'CENTER_SYMBOL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterSymbolId() {
        checkSpecifiedProperty("centerSymbolId");
        return _centerSymbolId;
    }

    /**
     * [set] CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)} <br>
     * 拠点シンボルID
     * @param centerSymbolId The value of the column 'CENTER_SYMBOL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterSymbolId(Long centerSymbolId) {
        registerModifiedProperty("centerSymbolId");
        _centerSymbolId = centerSymbolId;
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
     * [get] PALLET_ID: {bigint(19), FK to T_PALLET} <br>
     * パレットID
     * @return The value of the column 'PALLET_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPalletId() {
        checkSpecifiedProperty("palletId");
        return _palletId;
    }

    /**
     * [set] PALLET_ID: {bigint(19), FK to T_PALLET} <br>
     * パレットID
     * @param palletId The value of the column 'PALLET_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletId(Long palletId) {
        registerModifiedProperty("palletId");
        _palletId = palletId;
    }

    /**
     * [get] TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL} <br>
     * 段ボール情報ID
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrsymbolId() {
        checkSpecifiedProperty("trsymbolId");
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL} <br>
     * 段ボール情報ID
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrsymbolId(Long trsymbolId) {
        registerModifiedProperty("trsymbolId");
        _trsymbolId = trsymbolId;
    }

    /**
     * [get] CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL} <br>
     * 子拠点シンボルID
     * @return The value of the column 'CHILD_CENTER_SYMBOL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getChildCenterSymbolId() {
        checkSpecifiedProperty("childCenterSymbolId");
        return _childCenterSymbolId;
    }

    /**
     * [set] CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL} <br>
     * 子拠点シンボルID
     * @param childCenterSymbolId The value of the column 'CHILD_CENTER_SYMBOL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChildCenterSymbolId(Long childCenterSymbolId) {
        registerModifiedProperty("childCenterSymbolId");
        _childCenterSymbolId = childCenterSymbolId;
    }

    /**
     * [get] SORTSTOCK_NUMBER: {+UQ, bigint(19)} <br>
     * 補充順
     * @return The value of the column 'SORTSTOCK_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSortstockNumber() {
        checkSpecifiedProperty("sortstockNumber");
        return _sortstockNumber;
    }

    /**
     * [set] SORTSTOCK_NUMBER: {+UQ, bigint(19)} <br>
     * 補充順
     * @param sortstockNumber The value of the column 'SORTSTOCK_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortstockNumber(Long sortstockNumber) {
        registerModifiedProperty("sortstockNumber");
        _sortstockNumber = sortstockNumber;
    }

    /**
     * [get] QR_CODE: {NotNull, varchar(255)} <br>
     * QRコード
     * @return The value of the column 'QR_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getQrCode() {
        checkSpecifiedProperty("qrCode");
        return convertEmptyToNull(_qrCode);
    }

    /**
     * [set] QR_CODE: {NotNull, varchar(255)} <br>
     * QRコード
     * @param qrCode The value of the column 'QR_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setQrCode(String qrCode) {
        registerModifiedProperty("qrCode");
        _qrCode = qrCode;
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
     * [get] CASE_MOVE_STS: {NotNull, varchar(30)} <br>
     * 移動ステータス
     * @return The value of the column 'CASE_MOVE_STS'. (basically NotNull if selected: for the constraint)
     */
    public String getCaseMoveSts() {
        checkSpecifiedProperty("caseMoveSts");
        return convertEmptyToNull(_caseMoveSts);
    }

    /**
     * [set] CASE_MOVE_STS: {NotNull, varchar(30)} <br>
     * 移動ステータス
     * @param caseMoveSts The value of the column 'CASE_MOVE_STS'. (basically NotNull if update: for the constraint)
     */
    public void setCaseMoveSts(String caseMoveSts) {
        registerModifiedProperty("caseMoveSts");
        _caseMoveSts = caseMoveSts;
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
