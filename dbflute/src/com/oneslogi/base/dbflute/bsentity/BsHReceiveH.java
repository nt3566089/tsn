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
 * The entity of H_RECEIVE_H as TABLE. <br>
 * 入荷ヘッダ履歴
 * <pre>
 * [primary-key]
 *     STORE_RECORD_H_ID
 *
 * [column]
 *     STORE_RECORD_H_ID, HIST_DT, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, PROCESS_TYPE_ID, RECEIVE_PLAN_DT, CLIENT_RECEIVE_NO, RECEIVE_SLIP_NO, SUPPLIER_ID, SUPPLIER_CD, SUPPLIER_NM, DEPOSIT_ID, DEPOSIT_CD, DEPOSIT_NM, RECEIVE_DELIVERY_STATUS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_PROCESS_TYPE, B_CLASS_DTL(ByReceiveDeliveryStatus)
 *
 * [referrer table]
 *     H_RECEIVE_B
 *
 * [foreign property]
 *     mProcessType, bClassDtlByReceiveDeliveryStatus
 *
 * [referrer property]
 *     hReceiveBList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long storeRecordHId = entity.getStoreRecordHId();
 * String histDt = entity.getHistDt();
 * Long clientId = entity.getClientId();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * Long processTypeId = entity.getProcessTypeId();
 * String receivePlanDt = entity.getReceivePlanDt();
 * String clientReceiveNo = entity.getClientReceiveNo();
 * String receiveSlipNo = entity.getReceiveSlipNo();
 * Long supplierId = entity.getSupplierId();
 * String supplierCd = entity.getSupplierCd();
 * String supplierNm = entity.getSupplierNm();
 * Long depositId = entity.getDepositId();
 * String depositCd = entity.getDepositCd();
 * String depositNm = entity.getDepositNm();
 * String receiveDeliveryStatus = entity.getReceiveDeliveryStatus();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setStoreRecordHId(storeRecordHId);
 * entity.setHistDt(histDt);
 * entity.setClientId(clientId);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setProcessTypeId(processTypeId);
 * entity.setReceivePlanDt(receivePlanDt);
 * entity.setClientReceiveNo(clientReceiveNo);
 * entity.setReceiveSlipNo(receiveSlipNo);
 * entity.setSupplierId(supplierId);
 * entity.setSupplierCd(supplierCd);
 * entity.setSupplierNm(supplierNm);
 * entity.setDepositId(depositId);
 * entity.setDepositCd(depositCd);
 * entity.setDepositNm(depositNm);
 * entity.setReceiveDeliveryStatus(receiveDeliveryStatus);
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
public abstract class BsHReceiveH extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _storeRecordHId;

    /** HIST_DT: {NotNull, varchar(8)} */
    protected String _histDt;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} */
    protected Long _processTypeId;

    /** RECEIVE_PLAN_DT: {varchar(8)} */
    protected String _receivePlanDt;

    /** CLIENT_RECEIVE_NO: {IX, varchar(30)} */
    protected String _clientReceiveNo;

    /** RECEIVE_SLIP_NO: {IX, varchar(30)} */
    protected String _receiveSlipNo;

    /** SUPPLIER_ID: {bigint(19)} */
    protected Long _supplierId;

    /** SUPPLIER_CD: {IX, varchar(30)} */
    protected String _supplierCd;

    /** SUPPLIER_NM: {varchar(60)} */
    protected String _supplierNm;

    /** DEPOSIT_ID: {bigint(19)} */
    protected Long _depositId;

    /** DEPOSIT_CD: {varchar(30)} */
    protected String _depositCd;

    /** DEPOSIT_NM: {varchar(60)} */
    protected String _depositNm;

    /** RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} */
    protected String _receiveDeliveryStatus;

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
        return "H_RECEIVE_H";
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
        if (_storeRecordHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of receiveDeliveryStatus as the classification of ReceiveDeliveryStatus. <br>
     * RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ReceiveDeliveryStatus getReceiveDeliveryStatusAsReceiveDeliveryStatus() {
        return CDef.ReceiveDeliveryStatus.codeOf(getReceiveDeliveryStatus());
    }

    /**
     * Set the value of receiveDeliveryStatus as the classification of ReceiveDeliveryStatus. <br>
     * RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus cdef) {
        setReceiveDeliveryStatus(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of receiveDeliveryStatus as $00 (00). <br>
     * $00: 未完
     */
    public void setReceiveDeliveryStatus_$00() {
        setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$00);
    }

    /**
     * Set the value of receiveDeliveryStatus as $01 (01). <br>
     * $01: 完納
     */
    public void setReceiveDeliveryStatus_$01() {
        setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$01);
    }

    /**
     * Set the value of receiveDeliveryStatus as $02 (02). <br>
     * $02: 分納
     */
    public void setReceiveDeliveryStatus_$02() {
        setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$02);
    }

    /**
     * Set the value of receiveDeliveryStatus as $09 (09). <br>
     * $09: 打切り
     */
    public void setReceiveDeliveryStatus_$09() {
        setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$09);
    }

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
     * Is the value of receiveDeliveryStatus $00? <br>
     * $00: 未完
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveDeliveryStatus$00() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveDeliveryStatus.$00) : false;
    }

    /**
     * Is the value of receiveDeliveryStatus $01? <br>
     * $01: 完納
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveDeliveryStatus$01() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveDeliveryStatus.$01) : false;
    }

    /**
     * Is the value of receiveDeliveryStatus $02? <br>
     * $02: 分納
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveDeliveryStatus$02() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveDeliveryStatus.$02) : false;
    }

    /**
     * Is the value of receiveDeliveryStatus $09? <br>
     * $09: 打切り
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReceiveDeliveryStatus$09() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.equals(CDef.ReceiveDeliveryStatus.$09) : false;
    }

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
     * Get the value of the column 'receiveDeliveryStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getReceiveDeliveryStatusName() {
        CDef.ReceiveDeliveryStatus cdef = getReceiveDeliveryStatusAsReceiveDeliveryStatus();
        return cdef != null ? cdef.name() : null;
    }

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
    /** M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'. */
    protected MProcessType _mProcessType;

    /**
     * [get] M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'. <br>
     * @return The entity of foreign property 'MProcessType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProcessType getMProcessType() {
        return _mProcessType;
    }

    /**
     * [set] M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param mProcessType The entity of foreign property 'MProcessType'. (NullAllowed)
     */
    public void setMProcessType(MProcessType mProcessType) {
        _mProcessType = mProcessType;
    }

    /** B_CLASS_DTL by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'. */
    protected BClassDtl _bClassDtlByReceiveDeliveryStatus;

    /**
     * [get] B_CLASS_DTL by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByReceiveDeliveryStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByReceiveDeliveryStatus() {
        return _bClassDtlByReceiveDeliveryStatus;
    }

    /**
     * [set] B_CLASS_DTL by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'.
     * @param bClassDtlByReceiveDeliveryStatus The entity of foreign property 'BClassDtlByReceiveDeliveryStatus'. (NullAllowed)
     */
    public void setBClassDtlByReceiveDeliveryStatus(BClassDtl bClassDtlByReceiveDeliveryStatus) {
        _bClassDtlByReceiveDeliveryStatus = bClassDtlByReceiveDeliveryStatus;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** H_RECEIVE_B by STORE_RECORD_H_ID, named 'HReceiveBList'. */
    protected List<HReceiveB> _hReceiveBList;

    /**
     * [get] H_RECEIVE_B by STORE_RECORD_H_ID, named 'HReceiveBList'.
     * @return The entity list of referrer property 'HReceiveBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HReceiveB> getHReceiveBList() {
        if (_hReceiveBList == null) { _hReceiveBList = newReferrerList(); }
        return _hReceiveBList;
    }

    /**
     * [set] H_RECEIVE_B by STORE_RECORD_H_ID, named 'HReceiveBList'.
     * @param hReceiveBList The entity list of referrer property 'HReceiveBList'. (NullAllowed)
     */
    public void setHReceiveBList(List<HReceiveB> hReceiveBList) {
        _hReceiveBList = hReceiveBList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsHReceiveH) {
            BsHReceiveH other = (BsHReceiveH)obj;
            if (!xSV(_storeRecordHId, other._storeRecordHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _storeRecordHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mProcessType != null)
        { sb.append(li).append(xbRDS(_mProcessType, "mProcessType")); }
        if (_bClassDtlByReceiveDeliveryStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByReceiveDeliveryStatus, "bClassDtlByReceiveDeliveryStatus")); }
        if (_hReceiveBList != null) { for (HReceiveB et : _hReceiveBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hReceiveBList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_storeRecordHId));
        sb.append(dm).append(xfND(_histDt));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_processTypeId));
        sb.append(dm).append(xfND(_receivePlanDt));
        sb.append(dm).append(xfND(_clientReceiveNo));
        sb.append(dm).append(xfND(_receiveSlipNo));
        sb.append(dm).append(xfND(_supplierId));
        sb.append(dm).append(xfND(_supplierCd));
        sb.append(dm).append(xfND(_supplierNm));
        sb.append(dm).append(xfND(_depositId));
        sb.append(dm).append(xfND(_depositCd));
        sb.append(dm).append(xfND(_depositNm));
        sb.append(dm).append(xfND(_receiveDeliveryStatus));
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
        if (_mProcessType != null)
        { sb.append(dm).append("mProcessType"); }
        if (_bClassDtlByReceiveDeliveryStatus != null)
        { sb.append(dm).append("bClassDtlByReceiveDeliveryStatus"); }
        if (_hReceiveBList != null && !_hReceiveBList.isEmpty())
        { sb.append(dm).append("hReceiveBList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public HReceiveH clone() {
        return (HReceiveH)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫実績ヘッダID
     * @return The value of the column 'STORE_RECORD_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStoreRecordHId() {
        checkSpecifiedProperty("storeRecordHId");
        return _storeRecordHId;
    }

    /**
     * [set] STORE_RECORD_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫実績ヘッダID
     * @param storeRecordHId The value of the column 'STORE_RECORD_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStoreRecordHId(Long storeRecordHId) {
        registerModifiedProperty("storeRecordHId");
        _storeRecordHId = storeRecordHId;
    }

    /**
     * [get] HIST_DT: {NotNull, varchar(8)} <br>
     * 履歴日
     * @return The value of the column 'HIST_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getHistDt() {
        checkSpecifiedProperty("histDt");
        return convertEmptyToNull(_histDt);
    }

    /**
     * [set] HIST_DT: {NotNull, varchar(8)} <br>
     * 履歴日
     * @param histDt The value of the column 'HIST_DT'. (basically NotNull if update: for the constraint)
     */
    public void setHistDt(String histDt) {
        registerModifiedProperty("histDt");
        _histDt = histDt;
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
     * [get] CLIENT_CD: {varchar(30)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * 荷主名称
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * 荷主名称
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
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
     * [get] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * 拠点名称
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * 拠点名称
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProcessTypeId() {
        checkSpecifiedProperty("processTypeId");
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProcessTypeId(Long processTypeId) {
        registerModifiedProperty("processTypeId");
        _processTypeId = processTypeId;
    }

    /**
     * [get] RECEIVE_PLAN_DT: {varchar(8)} <br>
     * 入荷予定日
     * @return The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivePlanDt() {
        checkSpecifiedProperty("receivePlanDt");
        return convertEmptyToNull(_receivePlanDt);
    }

    /**
     * [set] RECEIVE_PLAN_DT: {varchar(8)} <br>
     * 入荷予定日
     * @param receivePlanDt The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        registerModifiedProperty("receivePlanDt");
        _receivePlanDt = receivePlanDt;
    }

    /**
     * [get] CLIENT_RECEIVE_NO: {IX, varchar(30)} <br>
     * 顧客入荷指示No.
     * @return The value of the column 'CLIENT_RECEIVE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientReceiveNo() {
        checkSpecifiedProperty("clientReceiveNo");
        return convertEmptyToNull(_clientReceiveNo);
    }

    /**
     * [set] CLIENT_RECEIVE_NO: {IX, varchar(30)} <br>
     * 顧客入荷指示No.
     * @param clientReceiveNo The value of the column 'CLIENT_RECEIVE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientReceiveNo(String clientReceiveNo) {
        registerModifiedProperty("clientReceiveNo");
        _clientReceiveNo = clientReceiveNo;
    }

    /**
     * [get] RECEIVE_SLIP_NO: {IX, varchar(30)} <br>
     * WMS入荷伝票No.
     * @return The value of the column 'RECEIVE_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveSlipNo() {
        checkSpecifiedProperty("receiveSlipNo");
        return convertEmptyToNull(_receiveSlipNo);
    }

    /**
     * [set] RECEIVE_SLIP_NO: {IX, varchar(30)} <br>
     * WMS入荷伝票No.
     * @param receiveSlipNo The value of the column 'RECEIVE_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveSlipNo(String receiveSlipNo) {
        registerModifiedProperty("receiveSlipNo");
        _receiveSlipNo = receiveSlipNo;
    }

    /**
     * [get] SUPPLIER_ID: {bigint(19)} <br>
     * 仕入先ID
     * @return The value of the column 'SUPPLIER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSupplierId() {
        checkSpecifiedProperty("supplierId");
        return _supplierId;
    }

    /**
     * [set] SUPPLIER_ID: {bigint(19)} <br>
     * 仕入先ID
     * @param supplierId The value of the column 'SUPPLIER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierId(Long supplierId) {
        registerModifiedProperty("supplierId");
        _supplierId = supplierId;
    }

    /**
     * [get] SUPPLIER_CD: {IX, varchar(30)} <br>
     * 仕入先CD
     * @return The value of the column 'SUPPLIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierCd() {
        checkSpecifiedProperty("supplierCd");
        return convertEmptyToNull(_supplierCd);
    }

    /**
     * [set] SUPPLIER_CD: {IX, varchar(30)} <br>
     * 仕入先CD
     * @param supplierCd The value of the column 'SUPPLIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierCd(String supplierCd) {
        registerModifiedProperty("supplierCd");
        _supplierCd = supplierCd;
    }

    /**
     * [get] SUPPLIER_NM: {varchar(60)} <br>
     * 仕入先名称
     * @return The value of the column 'SUPPLIER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierNm() {
        checkSpecifiedProperty("supplierNm");
        return convertEmptyToNull(_supplierNm);
    }

    /**
     * [set] SUPPLIER_NM: {varchar(60)} <br>
     * 仕入先名称
     * @param supplierNm The value of the column 'SUPPLIER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierNm(String supplierNm) {
        registerModifiedProperty("supplierNm");
        _supplierNm = supplierNm;
    }

    /**
     * [get] DEPOSIT_ID: {bigint(19)} <br>
     * 預託ID
     * @return The value of the column 'DEPOSIT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDepositId() {
        checkSpecifiedProperty("depositId");
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {bigint(19)} <br>
     * 預託ID
     * @param depositId The value of the column 'DEPOSIT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositId(Long depositId) {
        registerModifiedProperty("depositId");
        _depositId = depositId;
    }

    /**
     * [get] DEPOSIT_CD: {varchar(30)} <br>
     * 預託CD
     * @return The value of the column 'DEPOSIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositCd() {
        checkSpecifiedProperty("depositCd");
        return convertEmptyToNull(_depositCd);
    }

    /**
     * [set] DEPOSIT_CD: {varchar(30)} <br>
     * 預託CD
     * @param depositCd The value of the column 'DEPOSIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositCd(String depositCd) {
        registerModifiedProperty("depositCd");
        _depositCd = depositCd;
    }

    /**
     * [get] DEPOSIT_NM: {varchar(60)} <br>
     * 預託名称
     * @return The value of the column 'DEPOSIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositNm() {
        checkSpecifiedProperty("depositNm");
        return convertEmptyToNull(_depositNm);
    }

    /**
     * [set] DEPOSIT_NM: {varchar(60)} <br>
     * 預託名称
     * @param depositNm The value of the column 'DEPOSIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositNm(String depositNm) {
        registerModifiedProperty("depositNm");
        _depositNm = depositNm;
    }

    /**
     * [get] RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @return The value of the column 'RECEIVE_DELIVERY_STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveDeliveryStatus() {
        checkSpecifiedProperty("receiveDeliveryStatus");
        return convertEmptyToNull(_receiveDeliveryStatus);
    }

    /**
     * [set] RECEIVE_DELIVERY_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @param receiveDeliveryStatus The value of the column 'RECEIVE_DELIVERY_STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveDeliveryStatus(String receiveDeliveryStatus) {
        registerModifiedProperty("receiveDeliveryStatus");
        _receiveDeliveryStatus = receiveDeliveryStatus;
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
