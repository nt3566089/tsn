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
 * The entity of T_BTRPICK as TABLE. <br>
 * ピッキング引当
 * <pre>
 * [primary-key]
 *     PICKING_INST_ID
 *
 * [column]
 *     PICKING_INST_ID, PICKBATCHKEY, PICKBATCHTYPE, PICKBATCHGROUP, PICKDATE, PICKSTARTDATE, NOTES, SHIPDATE, DELIVSCHDATE, ALLOCGROUP, SOID, PICKLINETOTAL, PICKINGWAY, EXECKEY, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_INST_ID
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
 * Long pickingInstId = entity.getPickingInstId();
 * Long pickbatchkey = entity.getPickbatchkey();
 * String pickbatchtype = entity.getPickbatchtype();
 * String pickbatchgroup = entity.getPickbatchgroup();
 * java.sql.Timestamp pickdate = entity.getPickdate();
 * java.sql.Timestamp pickstartdate = entity.getPickstartdate();
 * String notes = entity.getNotes();
 * String shipdate = entity.getShipdate();
 * java.sql.Timestamp delivschdate = entity.getDelivschdate();
 * String allocgroup = entity.getAllocgroup();
 * Long soid = entity.getSoid();
 * Long picklinetotal = entity.getPicklinetotal();
 * Long pickingway = entity.getPickingway();
 * Long execkey = entity.getExeckey();
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
 * entity.setPickingInstId(pickingInstId);
 * entity.setPickbatchkey(pickbatchkey);
 * entity.setPickbatchtype(pickbatchtype);
 * entity.setPickbatchgroup(pickbatchgroup);
 * entity.setPickdate(pickdate);
 * entity.setPickstartdate(pickstartdate);
 * entity.setNotes(notes);
 * entity.setShipdate(shipdate);
 * entity.setDelivschdate(delivschdate);
 * entity.setAllocgroup(allocgroup);
 * entity.setSoid(soid);
 * entity.setPicklinetotal(picklinetotal);
 * entity.setPickingway(pickingway);
 * entity.setExeckey(execkey);
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
public abstract class BsTBtrpick extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _pickingInstId;

    /** PICKBATCHKEY: {NotNull, bigint(19)} */
    protected Long _pickbatchkey;

    /** PICKBATCHTYPE: {IX+, varchar(30)} */
    protected String _pickbatchtype;

    /** PICKBATCHGROUP: {varchar(60)} */
    protected String _pickbatchgroup;

    /** PICKDATE: {IX, NotNull, datetime2(26, 6)} */
    protected java.sql.Timestamp _pickdate;

    /** PICKSTARTDATE: {datetime2(26, 6)} */
    protected java.sql.Timestamp _pickstartdate;

    /** NOTES: {varchar(4000)} */
    protected String _notes;

    /** SHIPDATE: {IX, varchar(8)} */
    protected String _shipdate;

    /** DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]} */
    protected java.sql.Timestamp _delivschdate;

    /** ALLOCGROUP: {varchar(60)} */
    protected String _allocgroup;

    /** SOID: {bigint(19)} */
    protected Long _soid;

    /** PICKLINETOTAL: {bigint(19), default=[(0)]} */
    protected Long _picklinetotal;

    /** PICKINGWAY: {bigint(19), default=[(0)]} */
    protected Long _pickingway;

    /** EXECKEY: {IX, bigint(19)} */
    protected Long _execkey;

    /** CENTER_ID: {NotNull, bigint(19)} */
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
        return "T_BTRPICK";
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
        if (_pickingInstId == null) { return false; }
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
        if (obj instanceof BsTBtrpick) {
            BsTBtrpick other = (BsTBtrpick)obj;
            if (!xSV(_pickingInstId, other._pickingInstId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _pickingInstId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_pickingInstId));
        sb.append(dm).append(xfND(_pickbatchkey));
        sb.append(dm).append(xfND(_pickbatchtype));
        sb.append(dm).append(xfND(_pickbatchgroup));
        sb.append(dm).append(xfND(_pickdate));
        sb.append(dm).append(xfND(_pickstartdate));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_shipdate));
        sb.append(dm).append(xfND(_delivschdate));
        sb.append(dm).append(xfND(_allocgroup));
        sb.append(dm).append(xfND(_soid));
        sb.append(dm).append(xfND(_picklinetotal));
        sb.append(dm).append(xfND(_pickingway));
        sb.append(dm).append(xfND(_execkey));
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
    public TBtrpick clone() {
        return (TBtrpick)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング指示ID
     * @return The value of the column 'PICKING_INST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickingInstId() {
        checkSpecifiedProperty("pickingInstId");
        return _pickingInstId;
    }

    /**
     * [set] PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング指示ID
     * @param pickingInstId The value of the column 'PICKING_INST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPickingInstId(Long pickingInstId) {
        registerModifiedProperty("pickingInstId");
        _pickingInstId = pickingInstId;
    }

    /**
     * [get] PICKBATCHKEY: {NotNull, bigint(19)} <br>
     * 引当バッチキー
     * @return The value of the column 'PICKBATCHKEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickbatchkey() {
        checkSpecifiedProperty("pickbatchkey");
        return _pickbatchkey;
    }

    /**
     * [set] PICKBATCHKEY: {NotNull, bigint(19)} <br>
     * 引当バッチキー
     * @param pickbatchkey The value of the column 'PICKBATCHKEY'. (basically NotNull if update: for the constraint)
     */
    public void setPickbatchkey(Long pickbatchkey) {
        registerModifiedProperty("pickbatchkey");
        _pickbatchkey = pickbatchkey;
    }

    /**
     * [get] PICKBATCHTYPE: {IX+, varchar(30)} <br>
     * 引当バッチタイプ
     * @return The value of the column 'PICKBATCHTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickbatchtype() {
        checkSpecifiedProperty("pickbatchtype");
        return convertEmptyToNull(_pickbatchtype);
    }

    /**
     * [set] PICKBATCHTYPE: {IX+, varchar(30)} <br>
     * 引当バッチタイプ
     * @param pickbatchtype The value of the column 'PICKBATCHTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickbatchtype(String pickbatchtype) {
        registerModifiedProperty("pickbatchtype");
        _pickbatchtype = pickbatchtype;
    }

    /**
     * [get] PICKBATCHGROUP: {varchar(60)} <br>
     * 引当バッチグループ
     * @return The value of the column 'PICKBATCHGROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickbatchgroup() {
        checkSpecifiedProperty("pickbatchgroup");
        return convertEmptyToNull(_pickbatchgroup);
    }

    /**
     * [set] PICKBATCHGROUP: {varchar(60)} <br>
     * 引当バッチグループ
     * @param pickbatchgroup The value of the column 'PICKBATCHGROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickbatchgroup(String pickbatchgroup) {
        registerModifiedProperty("pickbatchgroup");
        _pickbatchgroup = pickbatchgroup;
    }

    /**
     * [get] PICKDATE: {IX, NotNull, datetime2(26, 6)} <br>
     * ピッキング指示日・時刻
     * @return The value of the column 'PICKDATE'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getPickdate() {
        checkSpecifiedProperty("pickdate");
        return _pickdate;
    }

    /**
     * [set] PICKDATE: {IX, NotNull, datetime2(26, 6)} <br>
     * ピッキング指示日・時刻
     * @param pickdate The value of the column 'PICKDATE'. (basically NotNull if update: for the constraint)
     */
    public void setPickdate(java.sql.Timestamp pickdate) {
        registerModifiedProperty("pickdate");
        _pickdate = pickdate;
    }

    /**
     * [get] PICKSTARTDATE: {datetime2(26, 6)} <br>
     * ピッキング開始予定日・時刻
     * @return The value of the column 'PICKSTARTDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getPickstartdate() {
        checkSpecifiedProperty("pickstartdate");
        return _pickstartdate;
    }

    /**
     * [set] PICKSTARTDATE: {datetime2(26, 6)} <br>
     * ピッキング開始予定日・時刻
     * @param pickstartdate The value of the column 'PICKSTARTDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickstartdate(java.sql.Timestamp pickstartdate) {
        registerModifiedProperty("pickstartdate");
        _pickstartdate = pickstartdate;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 備考
     * @return The value of the column 'NOTES'. (NullAllowed even if selected: for no constraint)
     */
    public String getNotes() {
        checkSpecifiedProperty("notes");
        return convertEmptyToNull(_notes);
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 備考
     * @param notes The value of the column 'NOTES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotes(String notes) {
        registerModifiedProperty("notes");
        _notes = notes;
    }

    /**
     * [get] SHIPDATE: {IX, varchar(8)} <br>
     * 出庫日
     * @return The value of the column 'SHIPDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipdate() {
        checkSpecifiedProperty("shipdate");
        return convertEmptyToNull(_shipdate);
    }

    /**
     * [set] SHIPDATE: {IX, varchar(8)} <br>
     * 出庫日
     * @param shipdate The value of the column 'SHIPDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipdate(String shipdate) {
        registerModifiedProperty("shipdate");
        _shipdate = shipdate;
    }

    /**
     * [get] DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]} <br>
     * 納品指定日・時刻
     * @return The value of the column 'DELIVSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getDelivschdate() {
        checkSpecifiedProperty("delivschdate");
        return _delivschdate;
    }

    /**
     * [set] DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]} <br>
     * 納品指定日・時刻
     * @param delivschdate The value of the column 'DELIVSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivschdate(java.sql.Timestamp delivschdate) {
        registerModifiedProperty("delivschdate");
        _delivschdate = delivschdate;
    }

    /**
     * [get] ALLOCGROUP: {varchar(60)} <br>
     * 引当締めグループ
     * @return The value of the column 'ALLOCGROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocgroup() {
        checkSpecifiedProperty("allocgroup");
        return convertEmptyToNull(_allocgroup);
    }

    /**
     * [set] ALLOCGROUP: {varchar(60)} <br>
     * 引当締めグループ
     * @param allocgroup The value of the column 'ALLOCGROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocgroup(String allocgroup) {
        registerModifiedProperty("allocgroup");
        _allocgroup = allocgroup;
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
     * [get] PICKLINETOTAL: {bigint(19), default=[(0)]} <br>
     * ピッキング引当総行数
     * @return The value of the column 'PICKLINETOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPicklinetotal() {
        checkSpecifiedProperty("picklinetotal");
        return _picklinetotal;
    }

    /**
     * [set] PICKLINETOTAL: {bigint(19), default=[(0)]} <br>
     * ピッキング引当総行数
     * @param picklinetotal The value of the column 'PICKLINETOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicklinetotal(Long picklinetotal) {
        registerModifiedProperty("picklinetotal");
        _picklinetotal = picklinetotal;
    }

    /**
     * [get] PICKINGWAY: {bigint(19), default=[(0)]} <br>
     * ピッキング種別
     * @return The value of the column 'PICKINGWAY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingway() {
        checkSpecifiedProperty("pickingway");
        return _pickingway;
    }

    /**
     * [set] PICKINGWAY: {bigint(19), default=[(0)]} <br>
     * ピッキング種別
     * @param pickingway The value of the column 'PICKINGWAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingway(Long pickingway) {
        registerModifiedProperty("pickingway");
        _pickingway = pickingway;
    }

    /**
     * [get] EXECKEY: {IX, bigint(19)} <br>
     * ログ実行キー
     * @return The value of the column 'EXECKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getExeckey() {
        checkSpecifiedProperty("execkey");
        return _execkey;
    }

    /**
     * [set] EXECKEY: {IX, bigint(19)} <br>
     * ログ実行キー
     * @param execkey The value of the column 'EXECKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExeckey(Long execkey) {
        registerModifiedProperty("execkey");
        _execkey = execkey;
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
