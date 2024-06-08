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
 * The entity of E_BONDED_RECEIVE_RECORD_SEND as TABLE. <br>
 * 入庫実績送信テーブル（需給）
 * <pre>
 * [primary-key]
 *     BONDED_RECEIVE_RECORD_SEND_ID
 *
 * [column]
 *     BONDED_RECEIVE_RECORD_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CENTER_CD, FROMSUB, SBWAREHOUSECD, REFNO, RECEIVE_PLAN_DT, CARRIERNO, WAREHOUSE_CD, OTHERREFNO1, PRODUCT_CD, LOT3, LOT4, LOT1, RECEIVEDQTY1_SUM, LOT2, CARRIERSNAME, CARRIERWBNO, FOREIGNCARGOFLG, OTHERLOT1, RECORD_TYPE, DOM_REFNO, JTTSFLG, SEQNO, TRANSPORT_TYPE, RECEIVEDATE, RECEIVEDATETIME, LOTNO, RECEIVEDQTY2_SUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_RECEIVE_RECORD_SEND_ID
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
 * Long bondedReceiveRecordSendId = entity.getBondedReceiveRecordSendId();
 * String sendCd = entity.getSendCd();
 * Long sendRowId = entity.getSendRowId();
 * String workFlg = entity.getWorkFlg();
 * String centerCd = entity.getCenterCd();
 * String fromsub = entity.getFromsub();
 * String sbwarehousecd = entity.getSbwarehousecd();
 * String refno = entity.getRefno();
 * String receivePlanDt = entity.getReceivePlanDt();
 * String carrierno = entity.getCarrierno();
 * String warehouseCd = entity.getWarehouseCd();
 * String otherrefno1 = entity.getOtherrefno1();
 * String productCd = entity.getProductCd();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String lot1 = entity.getLot1();
 * String receivedqty1Sum = entity.getReceivedqty1Sum();
 * String lot2 = entity.getLot2();
 * String carriersname = entity.getCarriersname();
 * String carrierwbno = entity.getCarrierwbno();
 * String foreigncargoflg = entity.getForeigncargoflg();
 * String otherlot1 = entity.getOtherlot1();
 * String recordType = entity.getRecordType();
 * String domRefno = entity.getDomRefno();
 * String jttsflg = entity.getJttsflg();
 * String seqno = entity.getSeqno();
 * String transportType = entity.getTransportType();
 * String receivedate = entity.getReceivedate();
 * String receivedatetime = entity.getReceivedatetime();
 * String lotno = entity.getLotno();
 * String receivedqty2Sum = entity.getReceivedqty2Sum();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBondedReceiveRecordSendId(bondedReceiveRecordSendId);
 * entity.setSendCd(sendCd);
 * entity.setSendRowId(sendRowId);
 * entity.setWorkFlg(workFlg);
 * entity.setCenterCd(centerCd);
 * entity.setFromsub(fromsub);
 * entity.setSbwarehousecd(sbwarehousecd);
 * entity.setRefno(refno);
 * entity.setReceivePlanDt(receivePlanDt);
 * entity.setCarrierno(carrierno);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setOtherrefno1(otherrefno1);
 * entity.setProductCd(productCd);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setLot1(lot1);
 * entity.setReceivedqty1Sum(receivedqty1Sum);
 * entity.setLot2(lot2);
 * entity.setCarriersname(carriersname);
 * entity.setCarrierwbno(carrierwbno);
 * entity.setForeigncargoflg(foreigncargoflg);
 * entity.setOtherlot1(otherlot1);
 * entity.setRecordType(recordType);
 * entity.setDomRefno(domRefno);
 * entity.setJttsflg(jttsflg);
 * entity.setSeqno(seqno);
 * entity.setTransportType(transportType);
 * entity.setReceivedate(receivedate);
 * entity.setReceivedatetime(receivedatetime);
 * entity.setLotno(lotno);
 * entity.setReceivedqty2Sum(receivedqty2Sum);
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
public abstract class BsEBondedReceiveRecordSend extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BONDED_RECEIVE_RECORD_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _bondedReceiveRecordSendId;

    /** SEND_CD: {NotNull, varchar(30)} */
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[0]} */
    protected String _workFlg;

    /** CENTER_CD: {NotNull, varchar(30)} */
    protected String _centerCd;

    /** FROMSUB: {NotNull, char(1)} */
    protected String _fromsub;

    /** SBWAREHOUSECD: {varchar(255)} */
    protected String _sbwarehousecd;

    /** REFNO: {varchar(255)} */
    protected String _refno;

    /** RECEIVE_PLAN_DT: {varchar(255)} */
    protected String _receivePlanDt;

    /** CARRIERNO: {varchar(255)} */
    protected String _carrierno;

    /** WAREHOUSE_CD: {varchar(255)} */
    protected String _warehouseCd;

    /** OTHERREFNO1: {varchar(255)} */
    protected String _otherrefno1;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** LOT3: {varchar(255)} */
    protected String _lot3;

    /** LOT4: {varchar(255)} */
    protected String _lot4;

    /** LOT1: {varchar(255)} */
    protected String _lot1;

    /** RECEIVEDQTY1_SUM: {varchar(255)} */
    protected String _receivedqty1Sum;

    /** LOT2: {varchar(255)} */
    protected String _lot2;

    /** CARRIERSNAME: {varchar(255)} */
    protected String _carriersname;

    /** CARRIERWBNO: {varchar(255)} */
    protected String _carrierwbno;

    /** FOREIGNCARGOFLG: {varchar(255)} */
    protected String _foreigncargoflg;

    /** OTHERLOT1: {varchar(255)} */
    protected String _otherlot1;

    /** RECORD_TYPE: {varchar(255)} */
    protected String _recordType;

    /** DOM_REFNO: {varchar(255)} */
    protected String _domRefno;

    /** JTTSFLG: {varchar(255)} */
    protected String _jttsflg;

    /** SEQNO: {varchar(255)} */
    protected String _seqno;

    /** TRANSPORT_TYPE: {varchar(255)} */
    protected String _transportType;

    /** RECEIVEDATE: {varchar(255)} */
    protected String _receivedate;

    /** RECEIVEDATETIME: {varchar(255)} */
    protected String _receivedatetime;

    /** LOTNO: {varchar(255)} */
    protected String _lotno;

    /** RECEIVEDQTY2_SUM: {varchar(255)} */
    protected String _receivedqty2Sum;

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
        return "E_BONDED_RECEIVE_RECORD_SEND";
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
        if (_bondedReceiveRecordSendId == null) { return false; }
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
        if (obj instanceof BsEBondedReceiveRecordSend) {
            BsEBondedReceiveRecordSend other = (BsEBondedReceiveRecordSend)obj;
            if (!xSV(_bondedReceiveRecordSendId, other._bondedReceiveRecordSendId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bondedReceiveRecordSendId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bondedReceiveRecordSendId));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendRowId));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_fromsub));
        sb.append(dm).append(xfND(_sbwarehousecd));
        sb.append(dm).append(xfND(_refno));
        sb.append(dm).append(xfND(_receivePlanDt));
        sb.append(dm).append(xfND(_carrierno));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_otherrefno1));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_receivedqty1Sum));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_carriersname));
        sb.append(dm).append(xfND(_carrierwbno));
        sb.append(dm).append(xfND(_foreigncargoflg));
        sb.append(dm).append(xfND(_otherlot1));
        sb.append(dm).append(xfND(_recordType));
        sb.append(dm).append(xfND(_domRefno));
        sb.append(dm).append(xfND(_jttsflg));
        sb.append(dm).append(xfND(_seqno));
        sb.append(dm).append(xfND(_transportType));
        sb.append(dm).append(xfND(_receivedate));
        sb.append(dm).append(xfND(_receivedatetime));
        sb.append(dm).append(xfND(_lotno));
        sb.append(dm).append(xfND(_receivedqty2Sum));
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
    public EBondedReceiveRecordSend clone() {
        return (EBondedReceiveRecordSend)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BONDED_RECEIVE_RECORD_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫実績送信テーブル（需給）ID
     * @return The value of the column 'BONDED_RECEIVE_RECORD_SEND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBondedReceiveRecordSendId() {
        checkSpecifiedProperty("bondedReceiveRecordSendId");
        return _bondedReceiveRecordSendId;
    }

    /**
     * [set] BONDED_RECEIVE_RECORD_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫実績送信テーブル（需給）ID
     * @param bondedReceiveRecordSendId The value of the column 'BONDED_RECEIVE_RECORD_SEND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBondedReceiveRecordSendId(Long bondedReceiveRecordSendId) {
        registerModifiedProperty("bondedReceiveRecordSendId");
        _bondedReceiveRecordSendId = bondedReceiveRecordSendId;
    }

    /**
     * [get] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getSendCd() {
        checkSpecifiedProperty("sendCd");
        return convertEmptyToNull(_sendCd);
    }

    /**
     * [set] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (basically NotNull if update: for the constraint)
     */
    public void setSendCd(String sendCd) {
        registerModifiedProperty("sendCd");
        _sendCd = sendCd;
    }

    /**
     * [get] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSendRowId() {
        checkSpecifiedProperty("sendRowId");
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSendRowId(Long sendRowId) {
        registerModifiedProperty("sendRowId");
        _sendRowId = sendRowId;
    }

    /**
     * [get] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setWorkFlg(String workFlg) {
        registerModifiedProperty("workFlg");
        _workFlg = workFlg;
    }

    /**
     * [get] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (basically NotNull if update: for the constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] FROMSUB: {NotNull, char(1)} <br>
     * 入庫経路区分
     * @return The value of the column 'FROMSUB'. (basically NotNull if selected: for the constraint)
     */
    public String getFromsub() {
        checkSpecifiedProperty("fromsub");
        return convertEmptyToNull(_fromsub);
    }

    /**
     * [set] FROMSUB: {NotNull, char(1)} <br>
     * 入庫経路区分
     * @param fromsub The value of the column 'FROMSUB'. (basically NotNull if update: for the constraint)
     */
    public void setFromsub(String fromsub) {
        registerModifiedProperty("fromsub");
        _fromsub = fromsub;
    }

    /**
     * [get] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫CD
     * @return The value of the column 'SBWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSbwarehousecd() {
        checkSpecifiedProperty("sbwarehousecd");
        return convertEmptyToNull(_sbwarehousecd);
    }

    /**
     * [set] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫CD
     * @param sbwarehousecd The value of the column 'SBWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSbwarehousecd(String sbwarehousecd) {
        registerModifiedProperty("sbwarehousecd");
        _sbwarehousecd = sbwarehousecd;
    }

    /**
     * [get] REFNO: {varchar(255)} <br>
     * 整理番号
     * @return The value of the column 'REFNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRefno() {
        checkSpecifiedProperty("refno");
        return convertEmptyToNull(_refno);
    }

    /**
     * [set] REFNO: {varchar(255)} <br>
     * 整理番号
     * @param refno The value of the column 'REFNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRefno(String refno) {
        registerModifiedProperty("refno");
        _refno = refno;
    }

    /**
     * [get] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * 入荷予定日
     * @return The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivePlanDt() {
        checkSpecifiedProperty("receivePlanDt");
        return convertEmptyToNull(_receivePlanDt);
    }

    /**
     * [set] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * 入荷予定日
     * @param receivePlanDt The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        registerModifiedProperty("receivePlanDt");
        _receivePlanDt = receivePlanDt;
    }

    /**
     * [get] CARRIERNO: {varchar(255)} <br>
     * コンテナNo
     * @return The value of the column 'CARRIERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierno() {
        checkSpecifiedProperty("carrierno");
        return convertEmptyToNull(_carrierno);
    }

    /**
     * [set] CARRIERNO: {varchar(255)} <br>
     * コンテナNo
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierno(String carrierno) {
        registerModifiedProperty("carrierno");
        _carrierno = carrierno;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(255)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(255)} <br>
     * 倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者CD
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno1() {
        checkSpecifiedProperty("otherrefno1");
        return convertEmptyToNull(_otherrefno1);
    }

    /**
     * [set] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者CD
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno1(String otherrefno1) {
        registerModifiedProperty("otherrefno1");
        _otherrefno1 = otherrefno1;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] LOT3: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(255)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(255)} <br>
     * 製造年月
     * @return The value of the column 'LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {varchar(255)} <br>
     * 製造年月
     * @param lot4 The value of the column 'LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot4(String lot4) {
        registerModifiedProperty("lot4");
        _lot4 = lot4;
    }

    /**
     * [get] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] RECEIVEDQTY1_SUM: {varchar(255)} <br>
     * 個数
     * @return The value of the column 'RECEIVEDQTY1_SUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedqty1Sum() {
        checkSpecifiedProperty("receivedqty1Sum");
        return convertEmptyToNull(_receivedqty1Sum);
    }

    /**
     * [set] RECEIVEDQTY1_SUM: {varchar(255)} <br>
     * 個数
     * @param receivedqty1Sum The value of the column 'RECEIVEDQTY1_SUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedqty1Sum(String receivedqty1Sum) {
        registerModifiedProperty("receivedqty1Sum");
        _receivedqty1Sum = receivedqty1Sum;
    }

    /**
     * [get] LOT2: {varchar(255)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(255)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
    }

    /**
     * [get] CARRIERSNAME: {varchar(255)} <br>
     * SRC_CD
     * @return The value of the column 'CARRIERSNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriersname() {
        checkSpecifiedProperty("carriersname");
        return convertEmptyToNull(_carriersname);
    }

    /**
     * [set] CARRIERSNAME: {varchar(255)} <br>
     * SRC_CD
     * @param carriersname The value of the column 'CARRIERSNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriersname(String carriersname) {
        registerModifiedProperty("carriersname");
        _carriersname = carriersname;
    }

    /**
     * [get] CARRIERWBNO: {varchar(255)} <br>
     * オーダーNo
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierwbno() {
        checkSpecifiedProperty("carrierwbno");
        return convertEmptyToNull(_carrierwbno);
    }

    /**
     * [set] CARRIERWBNO: {varchar(255)} <br>
     * オーダーNo
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierwbno(String carrierwbno) {
        registerModifiedProperty("carrierwbno");
        _carrierwbno = carrierwbno;
    }

    /**
     * [get] FOREIGNCARGOFLG: {varchar(255)} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getForeigncargoflg() {
        checkSpecifiedProperty("foreigncargoflg");
        return convertEmptyToNull(_foreigncargoflg);
    }

    /**
     * [set] FOREIGNCARGOFLG: {varchar(255)} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForeigncargoflg(String foreigncargoflg) {
        registerModifiedProperty("foreigncargoflg");
        _foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] OTHERLOT1: {varchar(255)} <br>
     * 在庫区分
     * @return The value of the column 'OTHERLOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot1() {
        checkSpecifiedProperty("otherlot1");
        return convertEmptyToNull(_otherlot1);
    }

    /**
     * [set] OTHERLOT1: {varchar(255)} <br>
     * 在庫区分
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot1(String otherlot1) {
        registerModifiedProperty("otherlot1");
        _otherlot1 = otherlot1;
    }

    /**
     * [get] RECORD_TYPE: {varchar(255)} <br>
     * レコード区分
     * @return The value of the column 'RECORD_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRecordType() {
        checkSpecifiedProperty("recordType");
        return convertEmptyToNull(_recordType);
    }

    /**
     * [set] RECORD_TYPE: {varchar(255)} <br>
     * レコード区分
     * @param recordType The value of the column 'RECORD_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRecordType(String recordType) {
        registerModifiedProperty("recordType");
        _recordType = recordType;
    }

    /**
     * [get] DOM_REFNO: {varchar(255)} <br>
     * 国産用整理番号
     * @return The value of the column 'DOM_REFNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDomRefno() {
        checkSpecifiedProperty("domRefno");
        return convertEmptyToNull(_domRefno);
    }

    /**
     * [set] DOM_REFNO: {varchar(255)} <br>
     * 国産用整理番号
     * @param domRefno The value of the column 'DOM_REFNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDomRefno(String domRefno) {
        registerModifiedProperty("domRefno");
        _domRefno = domRefno;
    }

    /**
     * [get] JTTSFLG: {varchar(255)} <br>
     * JT/TS区分
     * @return The value of the column 'JTTSFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getJttsflg() {
        checkSpecifiedProperty("jttsflg");
        return convertEmptyToNull(_jttsflg);
    }

    /**
     * [set] JTTSFLG: {varchar(255)} <br>
     * JT/TS区分
     * @param jttsflg The value of the column 'JTTSFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJttsflg(String jttsflg) {
        registerModifiedProperty("jttsflg");
        _jttsflg = jttsflg;
    }

    /**
     * [get] SEQNO: {varchar(255)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSeqno() {
        checkSpecifiedProperty("seqno");
        return convertEmptyToNull(_seqno);
    }

    /**
     * [set] SEQNO: {varchar(255)} <br>
     * シーケンス番号
     * @param seqno The value of the column 'SEQNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSeqno(String seqno) {
        registerModifiedProperty("seqno");
        _seqno = seqno;
    }

    /**
     * [get] TRANSPORT_TYPE: {varchar(255)} <br>
     * 輸送種別
     * @return The value of the column 'TRANSPORT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportType() {
        checkSpecifiedProperty("transportType");
        return convertEmptyToNull(_transportType);
    }

    /**
     * [set] TRANSPORT_TYPE: {varchar(255)} <br>
     * 輸送種別
     * @param transportType The value of the column 'TRANSPORT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportType(String transportType) {
        registerModifiedProperty("transportType");
        _transportType = transportType;
    }

    /**
     * [get] RECEIVEDATE: {varchar(255)} <br>
     * 入庫登録年月日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedate() {
        checkSpecifiedProperty("receivedate");
        return convertEmptyToNull(_receivedate);
    }

    /**
     * [set] RECEIVEDATE: {varchar(255)} <br>
     * 入庫登録年月日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedate(String receivedate) {
        registerModifiedProperty("receivedate");
        _receivedate = receivedate;
    }

    /**
     * [get] RECEIVEDATETIME: {varchar(255)} <br>
     * 入庫登録時刻
     * @return The value of the column 'RECEIVEDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedatetime() {
        checkSpecifiedProperty("receivedatetime");
        return convertEmptyToNull(_receivedatetime);
    }

    /**
     * [set] RECEIVEDATETIME: {varchar(255)} <br>
     * 入庫登録時刻
     * @param receivedatetime The value of the column 'RECEIVEDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedatetime(String receivedatetime) {
        registerModifiedProperty("receivedatetime");
        _receivedatetime = receivedatetime;
    }

    /**
     * [get] LOTNO: {varchar(255)} <br>
     * ロット番号
     * @return The value of the column 'LOTNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotno() {
        checkSpecifiedProperty("lotno");
        return convertEmptyToNull(_lotno);
    }

    /**
     * [set] LOTNO: {varchar(255)} <br>
     * ロット番号
     * @param lotno The value of the column 'LOTNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotno(String lotno) {
        registerModifiedProperty("lotno");
        _lotno = lotno;
    }

    /**
     * [get] RECEIVEDQTY2_SUM: {varchar(255)} <br>
     * 数量
     * @return The value of the column 'RECEIVEDQTY2_SUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedqty2Sum() {
        checkSpecifiedProperty("receivedqty2Sum");
        return convertEmptyToNull(_receivedqty2Sum);
    }

    /**
     * [set] RECEIVEDQTY2_SUM: {varchar(255)} <br>
     * 数量
     * @param receivedqty2Sum The value of the column 'RECEIVEDQTY2_SUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedqty2Sum(String receivedqty2Sum) {
        registerModifiedProperty("receivedqty2Sum");
        _receivedqty2Sum = receivedqty2Sum;
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
