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
 * The entity of T_YTRSO as TABLE. <br>
 * 山出し指示ヘッダ
 * <pre>
 * [primary-key]
 *     TRSR_ID
 *
 * [column]
 *     TRSR_ID, CENTER_ID, CLIENT_ID, SO_KEY, SR_STATUS, RESTOCK_NUMBER, RESTOCK_KBN, SORTING_RACK_NO, RESTOCK_SORT_KEY, SHIP_SCH_DATE, SHIP_DATE, CENTER_CD, SORT_RESTOCK_FLG, DELIVERY_CENTER_CD, LINE_BLOCK, DELIVERY_DIRECTION, PICK_BATCH_KEY, PICKLIST_COMMENT, FROM_PICKLIST_NO, TO_PICKLIST_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSR_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     T_YTRSODETAIL
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     tYtrsodetailList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trsrId = entity.getTrsrId();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * Long soKey = entity.getSoKey();
 * String srStatus = entity.getSrStatus();
 * Long restockNumber = entity.getRestockNumber();
 * String restockKbn = entity.getRestockKbn();
 * String sortingRackNo = entity.getSortingRackNo();
 * String restockSortKey = entity.getRestockSortKey();
 * String shipSchDate = entity.getShipSchDate();
 * String shipDate = entity.getShipDate();
 * String centerCd = entity.getCenterCd();
 * String sortRestockFlg = entity.getSortRestockFlg();
 * String deliveryCenterCd = entity.getDeliveryCenterCd();
 * String lineBlock = entity.getLineBlock();
 * String deliveryDirection = entity.getDeliveryDirection();
 * Long pickBatchKey = entity.getPickBatchKey();
 * String picklistComment = entity.getPicklistComment();
 * Long fromPicklistNo = entity.getFromPicklistNo();
 * Long toPicklistNo = entity.getToPicklistNo();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrsrId(trsrId);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setSoKey(soKey);
 * entity.setSrStatus(srStatus);
 * entity.setRestockNumber(restockNumber);
 * entity.setRestockKbn(restockKbn);
 * entity.setSortingRackNo(sortingRackNo);
 * entity.setRestockSortKey(restockSortKey);
 * entity.setShipSchDate(shipSchDate);
 * entity.setShipDate(shipDate);
 * entity.setCenterCd(centerCd);
 * entity.setSortRestockFlg(sortRestockFlg);
 * entity.setDeliveryCenterCd(deliveryCenterCd);
 * entity.setLineBlock(lineBlock);
 * entity.setDeliveryDirection(deliveryDirection);
 * entity.setPickBatchKey(pickBatchKey);
 * entity.setPicklistComment(picklistComment);
 * entity.setFromPicklistNo(fromPicklistNo);
 * entity.setToPicklistNo(toPicklistNo);
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
public abstract class BsTYtrso extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRSR_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trsrId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** SO_KEY: {NotNull, bigint(19)} */
    protected Long _soKey;

    /** SR_STATUS: {IX, NotNull, varchar(30)} */
    protected String _srStatus;

    /** RESTOCK_NUMBER: {bigint(19), default=[(0)]} */
    protected Long _restockNumber;

    /** RESTOCK_KBN: {varchar(30)} */
    protected String _restockKbn;

    /** SORTING_RACK_NO: {varchar(30)} */
    protected String _sortingRackNo;

    /** RESTOCK_SORT_KEY: {varchar(30)} */
    protected String _restockSortKey;

    /** SHIP_SCH_DATE: {IX, NotNull, varchar(8)} */
    protected String _shipSchDate;

    /** SHIP_DATE: {IX, varchar(8)} */
    protected String _shipDate;

    /** CENTER_CD: {IX, NotNull, varchar(30)} */
    protected String _centerCd;

    /** SORT_RESTOCK_FLG: {varchar(30)} */
    protected String _sortRestockFlg;

    /** DELIVERY_CENTER_CD: {varchar(255)} */
    protected String _deliveryCenterCd;

    /** LINE_BLOCK: {varchar(30)} */
    protected String _lineBlock;

    /** DELIVERY_DIRECTION: {varchar(30)} */
    protected String _deliveryDirection;

    /** PICK_BATCH_KEY: {IX, bigint(19)} */
    protected Long _pickBatchKey;

    /** PICKLIST_COMMENT: {varchar(30)} */
    protected String _picklistComment;

    /** FROM_PICKLIST_NO: {IX, bigint(19)} */
    protected Long _fromPicklistNo;

    /** TO_PICKLIST_NO: {IX, bigint(19)} */
    protected Long _toPicklistNo;

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
        return "T_YTRSO";
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
        if (_trsrId == null) { return false; }
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
    /** T_YTRSODETAIL by TRSO_ID, named 'TYtrsodetailList'. */
    protected List<TYtrsodetail> _tYtrsodetailList;

    /**
     * [get] T_YTRSODETAIL by TRSO_ID, named 'TYtrsodetailList'.
     * @return The entity list of referrer property 'TYtrsodetailList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TYtrsodetail> getTYtrsodetailList() {
        if (_tYtrsodetailList == null) { _tYtrsodetailList = newReferrerList(); }
        return _tYtrsodetailList;
    }

    /**
     * [set] T_YTRSODETAIL by TRSO_ID, named 'TYtrsodetailList'.
     * @param tYtrsodetailList The entity list of referrer property 'TYtrsodetailList'. (NullAllowed)
     */
    public void setTYtrsodetailList(List<TYtrsodetail> tYtrsodetailList) {
        _tYtrsodetailList = tYtrsodetailList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTYtrso) {
            BsTYtrso other = (BsTYtrso)obj;
            if (!xSV(_trsrId, other._trsrId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trsrId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_tYtrsodetailList != null) { for (TYtrsodetail et : _tYtrsodetailList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tYtrsodetailList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trsrId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_soKey));
        sb.append(dm).append(xfND(_srStatus));
        sb.append(dm).append(xfND(_restockNumber));
        sb.append(dm).append(xfND(_restockKbn));
        sb.append(dm).append(xfND(_sortingRackNo));
        sb.append(dm).append(xfND(_restockSortKey));
        sb.append(dm).append(xfND(_shipSchDate));
        sb.append(dm).append(xfND(_shipDate));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_sortRestockFlg));
        sb.append(dm).append(xfND(_deliveryCenterCd));
        sb.append(dm).append(xfND(_lineBlock));
        sb.append(dm).append(xfND(_deliveryDirection));
        sb.append(dm).append(xfND(_pickBatchKey));
        sb.append(dm).append(xfND(_picklistComment));
        sb.append(dm).append(xfND(_fromPicklistNo));
        sb.append(dm).append(xfND(_toPicklistNo));
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
        if (_tYtrsodetailList != null && !_tYtrsodetailList.isEmpty())
        { sb.append(dm).append("tYtrsodetailList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TYtrso clone() {
        return (TYtrso)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRSR_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し指示ヘッダID
     * @return The value of the column 'TRSR_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrsrId() {
        checkSpecifiedProperty("trsrId");
        return _trsrId;
    }

    /**
     * [set] TRSR_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し指示ヘッダID
     * @param trsrId The value of the column 'TRSR_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrsrId(Long trsrId) {
        registerModifiedProperty("trsrId");
        _trsrId = trsrId;
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
     * [get] SO_KEY: {NotNull, bigint(19)} <br>
     * 山出し指示キー
     * @return The value of the column 'SO_KEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getSoKey() {
        checkSpecifiedProperty("soKey");
        return _soKey;
    }

    /**
     * [set] SO_KEY: {NotNull, bigint(19)} <br>
     * 山出し指示キー
     * @param soKey The value of the column 'SO_KEY'. (basically NotNull if update: for the constraint)
     */
    public void setSoKey(Long soKey) {
        registerModifiedProperty("soKey");
        _soKey = soKey;
    }

    /**
     * [get] SR_STATUS: {IX, NotNull, varchar(30)} <br>
     * 山出しステータス
     * @return The value of the column 'SR_STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getSrStatus() {
        checkSpecifiedProperty("srStatus");
        return convertEmptyToNull(_srStatus);
    }

    /**
     * [set] SR_STATUS: {IX, NotNull, varchar(30)} <br>
     * 山出しステータス
     * @param srStatus The value of the column 'SR_STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setSrStatus(String srStatus) {
        registerModifiedProperty("srStatus");
        _srStatus = srStatus;
    }

    /**
     * [get] RESTOCK_NUMBER: {bigint(19), default=[(0)]} <br>
     * 補充回数
     * @return The value of the column 'RESTOCK_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRestockNumber() {
        checkSpecifiedProperty("restockNumber");
        return _restockNumber;
    }

    /**
     * [set] RESTOCK_NUMBER: {bigint(19), default=[(0)]} <br>
     * 補充回数
     * @param restockNumber The value of the column 'RESTOCK_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestockNumber(Long restockNumber) {
        registerModifiedProperty("restockNumber");
        _restockNumber = restockNumber;
    }

    /**
     * [get] RESTOCK_KBN: {varchar(30)} <br>
     * 補充区分
     * @return The value of the column 'RESTOCK_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getRestockKbn() {
        checkSpecifiedProperty("restockKbn");
        return convertEmptyToNull(_restockKbn);
    }

    /**
     * [set] RESTOCK_KBN: {varchar(30)} <br>
     * 補充区分
     * @param restockKbn The value of the column 'RESTOCK_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestockKbn(String restockKbn) {
        registerModifiedProperty("restockKbn");
        _restockKbn = restockKbn;
    }

    /**
     * [get] SORTING_RACK_NO: {varchar(30)} <br>
     * 仕分ラック番号
     * @return The value of the column 'SORTING_RACK_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortingRackNo() {
        checkSpecifiedProperty("sortingRackNo");
        return convertEmptyToNull(_sortingRackNo);
    }

    /**
     * [set] SORTING_RACK_NO: {varchar(30)} <br>
     * 仕分ラック番号
     * @param sortingRackNo The value of the column 'SORTING_RACK_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortingRackNo(String sortingRackNo) {
        registerModifiedProperty("sortingRackNo");
        _sortingRackNo = sortingRackNo;
    }

    /**
     * [get] RESTOCK_SORT_KEY: {varchar(30)} <br>
     * 補充先ソートキー
     * @return The value of the column 'RESTOCK_SORT_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getRestockSortKey() {
        checkSpecifiedProperty("restockSortKey");
        return convertEmptyToNull(_restockSortKey);
    }

    /**
     * [set] RESTOCK_SORT_KEY: {varchar(30)} <br>
     * 補充先ソートキー
     * @param restockSortKey The value of the column 'RESTOCK_SORT_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestockSortKey(String restockSortKey) {
        registerModifiedProperty("restockSortKey");
        _restockSortKey = restockSortKey;
    }

    /**
     * [get] SHIP_SCH_DATE: {IX, NotNull, varchar(8)} <br>
     * 山出し日
     * @return The value of the column 'SHIP_SCH_DATE'. (basically NotNull if selected: for the constraint)
     */
    public String getShipSchDate() {
        checkSpecifiedProperty("shipSchDate");
        return convertEmptyToNull(_shipSchDate);
    }

    /**
     * [set] SHIP_SCH_DATE: {IX, NotNull, varchar(8)} <br>
     * 山出し日
     * @param shipSchDate The value of the column 'SHIP_SCH_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setShipSchDate(String shipSchDate) {
        registerModifiedProperty("shipSchDate");
        _shipSchDate = shipSchDate;
    }

    /**
     * [get] SHIP_DATE: {IX, varchar(8)} <br>
     * 山出し実績日
     * @return The value of the column 'SHIP_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipDate() {
        checkSpecifiedProperty("shipDate");
        return convertEmptyToNull(_shipDate);
    }

    /**
     * [set] SHIP_DATE: {IX, varchar(8)} <br>
     * 山出し実績日
     * @param shipDate The value of the column 'SHIP_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipDate(String shipDate) {
        registerModifiedProperty("shipDate");
        _shipDate = shipDate;
    }

    /**
     * [get] CENTER_CD: {IX, NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {IX, NotNull, varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (basically NotNull if update: for the constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] SORT_RESTOCK_FLG: {varchar(30)} <br>
     * ソート用補充区分
     * @return The value of the column 'SORT_RESTOCK_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortRestockFlg() {
        checkSpecifiedProperty("sortRestockFlg");
        return convertEmptyToNull(_sortRestockFlg);
    }

    /**
     * [set] SORT_RESTOCK_FLG: {varchar(30)} <br>
     * ソート用補充区分
     * @param sortRestockFlg The value of the column 'SORT_RESTOCK_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortRestockFlg(String sortRestockFlg) {
        registerModifiedProperty("sortRestockFlg");
        _sortRestockFlg = sortRestockFlg;
    }

    /**
     * [get] DELIVERY_CENTER_CD: {varchar(255)} <br>
     * 配達拠点CD
     * @return The value of the column 'DELIVERY_CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCenterCd() {
        checkSpecifiedProperty("deliveryCenterCd");
        return convertEmptyToNull(_deliveryCenterCd);
    }

    /**
     * [set] DELIVERY_CENTER_CD: {varchar(255)} <br>
     * 配達拠点CD
     * @param deliveryCenterCd The value of the column 'DELIVERY_CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCenterCd(String deliveryCenterCd) {
        registerModifiedProperty("deliveryCenterCd");
        _deliveryCenterCd = deliveryCenterCd;
    }

    /**
     * [get] LINE_BLOCK: {varchar(30)} <br>
     * 補充先
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineBlock() {
        checkSpecifiedProperty("lineBlock");
        return convertEmptyToNull(_lineBlock);
    }

    /**
     * [set] LINE_BLOCK: {varchar(30)} <br>
     * 補充先
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineBlock(String lineBlock) {
        registerModifiedProperty("lineBlock");
        _lineBlock = lineBlock;
    }

    /**
     * [get] DELIVERY_DIRECTION: {varchar(30)} <br>
     * 配達方面
     * @return The value of the column 'DELIVERY_DIRECTION'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryDirection() {
        checkSpecifiedProperty("deliveryDirection");
        return convertEmptyToNull(_deliveryDirection);
    }

    /**
     * [set] DELIVERY_DIRECTION: {varchar(30)} <br>
     * 配達方面
     * @param deliveryDirection The value of the column 'DELIVERY_DIRECTION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryDirection(String deliveryDirection) {
        registerModifiedProperty("deliveryDirection");
        _deliveryDirection = deliveryDirection;
    }

    /**
     * [get] PICK_BATCH_KEY: {IX, bigint(19)} <br>
     * 引当バッチキー
     * @return The value of the column 'PICK_BATCH_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickBatchKey() {
        checkSpecifiedProperty("pickBatchKey");
        return _pickBatchKey;
    }

    /**
     * [set] PICK_BATCH_KEY: {IX, bigint(19)} <br>
     * 引当バッチキー
     * @param pickBatchKey The value of the column 'PICK_BATCH_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickBatchKey(Long pickBatchKey) {
        registerModifiedProperty("pickBatchKey");
        _pickBatchKey = pickBatchKey;
    }

    /**
     * [get] PICKLIST_COMMENT: {varchar(30)} <br>
     * 山出しリストコメント
     * @return The value of the column 'PICKLIST_COMMENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPicklistComment() {
        checkSpecifiedProperty("picklistComment");
        return convertEmptyToNull(_picklistComment);
    }

    /**
     * [set] PICKLIST_COMMENT: {varchar(30)} <br>
     * 山出しリストコメント
     * @param picklistComment The value of the column 'PICKLIST_COMMENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicklistComment(String picklistComment) {
        registerModifiedProperty("picklistComment");
        _picklistComment = picklistComment;
    }

    /**
     * [get] FROM_PICKLIST_NO: {IX, bigint(19)} <br>
     * FROM山出しリストNo.
     * @return The value of the column 'FROM_PICKLIST_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFromPicklistNo() {
        checkSpecifiedProperty("fromPicklistNo");
        return _fromPicklistNo;
    }

    /**
     * [set] FROM_PICKLIST_NO: {IX, bigint(19)} <br>
     * FROM山出しリストNo.
     * @param fromPicklistNo The value of the column 'FROM_PICKLIST_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromPicklistNo(Long fromPicklistNo) {
        registerModifiedProperty("fromPicklistNo");
        _fromPicklistNo = fromPicklistNo;
    }

    /**
     * [get] TO_PICKLIST_NO: {IX, bigint(19)} <br>
     * TO山出しリストNo.
     * @return The value of the column 'TO_PICKLIST_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getToPicklistNo() {
        checkSpecifiedProperty("toPicklistNo");
        return _toPicklistNo;
    }

    /**
     * [set] TO_PICKLIST_NO: {IX, bigint(19)} <br>
     * TO山出しリストNo.
     * @param toPicklistNo The value of the column 'TO_PICKLIST_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToPicklistNo(Long toPicklistNo) {
        registerModifiedProperty("toPicklistNo");
        _toPicklistNo = toPicklistNo;
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
