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
 * The entity of T_TRZONEINVENTORY as TABLE. <br>
 * ゾーン別在庫情報
 * <pre>
 * [primary-key]
 *     TRZONEINVENTORYKEY, WAREHOUSECD, FLOOR, ZONE
 *
 * [column]
 *     TRZONEINVENTORYKEY, WAREHOUSECD, FLOOR, ZONE, PALLETCAPACITY, PALLETSPACE, ZONEINVFLG, QTY1ALLOCATED, RCVQTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * java.math.BigDecimal trzoneinventorykey = entity.getTrzoneinventorykey();
 * String warehousecd = entity.getWarehousecd();
 * String floor = entity.getFloor();
 * String zone = entity.getZone();
 * java.math.BigDecimal palletcapacity = entity.getPalletcapacity();
 * java.math.BigDecimal palletspace = entity.getPalletspace();
 * java.math.BigDecimal zoneinvflg = entity.getZoneinvflg();
 * java.math.BigDecimal qty1allocated = entity.getQty1allocated();
 * java.math.BigDecimal rcvqty = entity.getRcvqty();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrzoneinventorykey(trzoneinventorykey);
 * entity.setWarehousecd(warehousecd);
 * entity.setFloor(floor);
 * entity.setZone(zone);
 * entity.setPalletcapacity(palletcapacity);
 * entity.setPalletspace(palletspace);
 * entity.setZoneinvflg(zoneinvflg);
 * entity.setQty1allocated(qty1allocated);
 * entity.setRcvqty(rcvqty);
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
public abstract class BsTTrzoneinventory extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _trzoneinventorykey;

    /** WAREHOUSECD: {PK, NotNull, varchar(30)} */
    protected String _warehousecd;

    /** FLOOR: {PK, NotNull, varchar(60)} */
    protected String _floor;

    /** ZONE: {PK, NotNull, varchar(60)} */
    protected String _zone;

    /** PALLETCAPACITY: {decimal(16, 6)} */
    protected java.math.BigDecimal _palletcapacity;

    /** PALLETSPACE: {decimal(16, 6)} */
    protected java.math.BigDecimal _palletspace;

    /** ZONEINVFLG: {decimal(16, 6)} */
    protected java.math.BigDecimal _zoneinvflg;

    /** QTY1ALLOCATED: {decimal(16, 6)} */
    protected java.math.BigDecimal _qty1allocated;

    /** RCVQTY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _rcvqty;

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
        return "T_TRZONEINVENTORY";
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
        if (_trzoneinventorykey == null) { return false; }
        if (_warehousecd == null) { return false; }
        if (_floor == null) { return false; }
        if (_zone == null) { return false; }
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
        if (obj instanceof BsTTrzoneinventory) {
            BsTTrzoneinventory other = (BsTTrzoneinventory)obj;
            if (!xSV(_trzoneinventorykey, other._trzoneinventorykey)) { return false; }
            if (!xSV(_warehousecd, other._warehousecd)) { return false; }
            if (!xSV(_floor, other._floor)) { return false; }
            if (!xSV(_zone, other._zone)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trzoneinventorykey);
        hs = xCH(hs, _warehousecd);
        hs = xCH(hs, _floor);
        hs = xCH(hs, _zone);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trzoneinventorykey));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_floor));
        sb.append(dm).append(xfND(_zone));
        sb.append(dm).append(xfND(_palletcapacity));
        sb.append(dm).append(xfND(_palletspace));
        sb.append(dm).append(xfND(_zoneinvflg));
        sb.append(dm).append(xfND(_qty1allocated));
        sb.append(dm).append(xfND(_rcvqty));
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
    public TTrzoneinventory clone() {
        return (TTrzoneinventory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)} <br>
     * ゾーン別在庫キー
     * @return The value of the column 'TRZONEINVENTORYKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTrzoneinventorykey() {
        checkSpecifiedProperty("trzoneinventorykey");
        return _trzoneinventorykey;
    }

    /**
     * [set] TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)} <br>
     * ゾーン別在庫キー
     * @param trzoneinventorykey The value of the column 'TRZONEINVENTORYKEY'. (basically NotNull if update: for the constraint)
     */
    public void setTrzoneinventorykey(java.math.BigDecimal trzoneinventorykey) {
        registerModifiedProperty("trzoneinventorykey");
        _trzoneinventorykey = trzoneinventorykey;
    }

    /**
     * [get] WAREHOUSECD: {PK, NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {PK, NotNull, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] FLOOR: {PK, NotNull, varchar(60)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (basically NotNull if selected: for the constraint)
     */
    public String getFloor() {
        checkSpecifiedProperty("floor");
        return convertEmptyToNull(_floor);
    }

    /**
     * [set] FLOOR: {PK, NotNull, varchar(60)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (basically NotNull if update: for the constraint)
     */
    public void setFloor(String floor) {
        registerModifiedProperty("floor");
        _floor = floor;
    }

    /**
     * [get] ZONE: {PK, NotNull, varchar(60)} <br>
     * ゾーン
     * @return The value of the column 'ZONE'. (basically NotNull if selected: for the constraint)
     */
    public String getZone() {
        checkSpecifiedProperty("zone");
        return convertEmptyToNull(_zone);
    }

    /**
     * [set] ZONE: {PK, NotNull, varchar(60)} <br>
     * ゾーン
     * @param zone The value of the column 'ZONE'. (basically NotNull if update: for the constraint)
     */
    public void setZone(String zone) {
        registerModifiedProperty("zone");
        _zone = zone;
    }

    /**
     * [get] PALLETCAPACITY: {decimal(16, 6)} <br>
     * 許容パレット枚数
     * @return The value of the column 'PALLETCAPACITY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPalletcapacity() {
        checkSpecifiedProperty("palletcapacity");
        return _palletcapacity;
    }

    /**
     * [set] PALLETCAPACITY: {decimal(16, 6)} <br>
     * 許容パレット枚数
     * @param palletcapacity The value of the column 'PALLETCAPACITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletcapacity(java.math.BigDecimal palletcapacity) {
        registerModifiedProperty("palletcapacity");
        _palletcapacity = palletcapacity;
    }

    /**
     * [get] PALLETSPACE: {decimal(16, 6)} <br>
     * 空きパレット数
     * @return The value of the column 'PALLETSPACE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPalletspace() {
        checkSpecifiedProperty("palletspace");
        return _palletspace;
    }

    /**
     * [set] PALLETSPACE: {decimal(16, 6)} <br>
     * 空きパレット数
     * @param palletspace The value of the column 'PALLETSPACE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletspace(java.math.BigDecimal palletspace) {
        registerModifiedProperty("palletspace");
        _palletspace = palletspace;
    }

    /**
     * [get] ZONEINVFLG: {decimal(16, 6)} <br>
     * 引当済在庫有無フラグ
     * @return The value of the column 'ZONEINVFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getZoneinvflg() {
        checkSpecifiedProperty("zoneinvflg");
        return _zoneinvflg;
    }

    /**
     * [set] ZONEINVFLG: {decimal(16, 6)} <br>
     * 引当済在庫有無フラグ
     * @param zoneinvflg The value of the column 'ZONEINVFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZoneinvflg(java.math.BigDecimal zoneinvflg) {
        registerModifiedProperty("zoneinvflg");
        _zoneinvflg = zoneinvflg;
    }

    /**
     * [get] QTY1ALLOCATED: {decimal(16, 6)} <br>
     * 引当済在庫数量
     * @return The value of the column 'QTY1ALLOCATED'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getQty1allocated() {
        checkSpecifiedProperty("qty1allocated");
        return _qty1allocated;
    }

    /**
     * [set] QTY1ALLOCATED: {decimal(16, 6)} <br>
     * 引当済在庫数量
     * @param qty1allocated The value of the column 'QTY1ALLOCATED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty1allocated(java.math.BigDecimal qty1allocated) {
        registerModifiedProperty("qty1allocated");
        _qty1allocated = qty1allocated;
    }

    /**
     * [get] RCVQTY: {decimal(16, 6), default=[(0)]} <br>
     * 格納予定数量
     * @return The value of the column 'RCVQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRcvqty() {
        checkSpecifiedProperty("rcvqty");
        return _rcvqty;
    }

    /**
     * [set] RCVQTY: {decimal(16, 6), default=[(0)]} <br>
     * 格納予定数量
     * @param rcvqty The value of the column 'RCVQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvqty(java.math.BigDecimal rcvqty) {
        registerModifiedProperty("rcvqty");
        _rcvqty = rcvqty;
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
