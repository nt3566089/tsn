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
 * The entity of T_TRPICKRESULT as TABLE. <br>
 * 棚出明細
 * <pre>
 * [primary-key]
 *     PICKING_DETAIL_ID
 *
 * [column]
 *     PICKING_DETAIL_ID, WORKALLOCATEID, FLOOR, LISTKBN, LOCATION_ID, LOT_ID, PALLET_ID, CENTER_SYMBOL_ID, PICKEDQTY1, SORTEDQTY1, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_DETAIL_ID
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
 * Long pickingDetailId = entity.getPickingDetailId();
 * Long workallocateid = entity.getWorkallocateid();
 * String floor = entity.getFloor();
 * Long listkbn = entity.getListkbn();
 * String locationId = entity.getLocationId();
 * Long lotId = entity.getLotId();
 * Long palletId = entity.getPalletId();
 * Long centerSymbolId = entity.getCenterSymbolId();
 * Long pickedqty1 = entity.getPickedqty1();
 * Long sortedqty1 = entity.getSortedqty1();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPickingDetailId(pickingDetailId);
 * entity.setWorkallocateid(workallocateid);
 * entity.setFloor(floor);
 * entity.setListkbn(listkbn);
 * entity.setLocationId(locationId);
 * entity.setLotId(lotId);
 * entity.setPalletId(palletId);
 * entity.setCenterSymbolId(centerSymbolId);
 * entity.setPickedqty1(pickedqty1);
 * entity.setSortedqty1(sortedqty1);
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
public abstract class BsTTrpickresult extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _pickingDetailId;

    /** WORKALLOCATEID: {NotNull, bigint(19)} */
    protected Long _workallocateid;

    /** FLOOR: {NotNull, varchar(30)} */
    protected String _floor;

    /** LISTKBN: {NotNull, bigint(19)} */
    protected Long _listkbn;

    /** LOCATION_ID: {NotNull, varchar(30)} */
    protected String _locationId;

    /** LOT_ID: {NotNull, bigint(19)} */
    protected Long _lotId;

    /** PALLET_ID: {IX, NotNull, bigint(19)} */
    protected Long _palletId;

    /** CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)} */
    protected Long _centerSymbolId;

    /** PICKEDQTY1: {bigint(19)} */
    protected Long _pickedqty1;

    /** SORTEDQTY1: {bigint(19)} */
    protected Long _sortedqty1;

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
        return "T_TRPICKRESULT";
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
        if (_pickingDetailId == null) { return false; }
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
        if (obj instanceof BsTTrpickresult) {
            BsTTrpickresult other = (BsTTrpickresult)obj;
            if (!xSV(_pickingDetailId, other._pickingDetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _pickingDetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_pickingDetailId));
        sb.append(dm).append(xfND(_workallocateid));
        sb.append(dm).append(xfND(_floor));
        sb.append(dm).append(xfND(_listkbn));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_lotId));
        sb.append(dm).append(xfND(_palletId));
        sb.append(dm).append(xfND(_centerSymbolId));
        sb.append(dm).append(xfND(_pickedqty1));
        sb.append(dm).append(xfND(_sortedqty1));
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
    public TTrpickresult clone() {
        return (TTrpickresult)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚出明細ID
     * @return The value of the column 'PICKING_DETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickingDetailId() {
        checkSpecifiedProperty("pickingDetailId");
        return _pickingDetailId;
    }

    /**
     * [set] PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚出明細ID
     * @param pickingDetailId The value of the column 'PICKING_DETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPickingDetailId(Long pickingDetailId) {
        registerModifiedProperty("pickingDetailId");
        _pickingDetailId = pickingDetailId;
    }

    /**
     * [get] WORKALLOCATEID: {NotNull, bigint(19)} <br>
     * 棚出しリストキー
     * @return The value of the column 'WORKALLOCATEID'. (basically NotNull if selected: for the constraint)
     */
    public Long getWorkallocateid() {
        checkSpecifiedProperty("workallocateid");
        return _workallocateid;
    }

    /**
     * [set] WORKALLOCATEID: {NotNull, bigint(19)} <br>
     * 棚出しリストキー
     * @param workallocateid The value of the column 'WORKALLOCATEID'. (basically NotNull if update: for the constraint)
     */
    public void setWorkallocateid(Long workallocateid) {
        registerModifiedProperty("workallocateid");
        _workallocateid = workallocateid;
    }

    /**
     * [get] FLOOR: {NotNull, varchar(30)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (basically NotNull if selected: for the constraint)
     */
    public String getFloor() {
        checkSpecifiedProperty("floor");
        return convertEmptyToNull(_floor);
    }

    /**
     * [set] FLOOR: {NotNull, varchar(30)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (basically NotNull if update: for the constraint)
     */
    public void setFloor(String floor) {
        registerModifiedProperty("floor");
        _floor = floor;
    }

    /**
     * [get] LISTKBN: {NotNull, bigint(19)} <br>
     * 単品・端数区分
     * @return The value of the column 'LISTKBN'. (basically NotNull if selected: for the constraint)
     */
    public Long getListkbn() {
        checkSpecifiedProperty("listkbn");
        return _listkbn;
    }

    /**
     * [set] LISTKBN: {NotNull, bigint(19)} <br>
     * 単品・端数区分
     * @param listkbn The value of the column 'LISTKBN'. (basically NotNull if update: for the constraint)
     */
    public void setListkbn(Long listkbn) {
        registerModifiedProperty("listkbn");
        _listkbn = listkbn;
    }

    /**
     * [get] LOCATION_ID: {NotNull, varchar(30)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getLocationId() {
        checkSpecifiedProperty("locationId");
        return convertEmptyToNull(_locationId);
    }

    /**
     * [set] LOCATION_ID: {NotNull, varchar(30)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationId(String locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
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
     * [get] PALLET_ID: {IX, NotNull, bigint(19)} <br>
     * パレットID
     * @return The value of the column 'PALLET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPalletId() {
        checkSpecifiedProperty("palletId");
        return _palletId;
    }

    /**
     * [set] PALLET_ID: {IX, NotNull, bigint(19)} <br>
     * パレットID
     * @param palletId The value of the column 'PALLET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPalletId(Long palletId) {
        registerModifiedProperty("palletId");
        _palletId = palletId;
    }

    /**
     * [get] CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)} <br>
     * 拠点シンボルID
     * @return The value of the column 'CENTER_SYMBOL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterSymbolId() {
        checkSpecifiedProperty("centerSymbolId");
        return _centerSymbolId;
    }

    /**
     * [set] CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)} <br>
     * 拠点シンボルID
     * @param centerSymbolId The value of the column 'CENTER_SYMBOL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterSymbolId(Long centerSymbolId) {
        registerModifiedProperty("centerSymbolId");
        _centerSymbolId = centerSymbolId;
    }

    /**
     * [get] PICKEDQTY1: {bigint(19)} <br>
     * ピッキング済数量
     * @return The value of the column 'PICKEDQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickedqty1() {
        checkSpecifiedProperty("pickedqty1");
        return _pickedqty1;
    }

    /**
     * [set] PICKEDQTY1: {bigint(19)} <br>
     * ピッキング済数量
     * @param pickedqty1 The value of the column 'PICKEDQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickedqty1(Long pickedqty1) {
        registerModifiedProperty("pickedqty1");
        _pickedqty1 = pickedqty1;
    }

    /**
     * [get] SORTEDQTY1: {bigint(19)} <br>
     * 仕分済数量
     * @return The value of the column 'SORTEDQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSortedqty1() {
        checkSpecifiedProperty("sortedqty1");
        return _sortedqty1;
    }

    /**
     * [set] SORTEDQTY1: {bigint(19)} <br>
     * 仕分済数量
     * @param sortedqty1 The value of the column 'SORTEDQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortedqty1(Long sortedqty1) {
        registerModifiedProperty("sortedqty1");
        _sortedqty1 = sortedqty1;
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
