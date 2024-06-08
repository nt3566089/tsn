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
 * The entity of E_RETURNED_EXCHANGE as TABLE. <br>
 * 返品取替品実績送信テーブル
 * <pre>
 * [primary-key]
 *     RETURNED_EXCHANGE_ID
 *
 * [column]
 *     RETURNED_EXCHANGE_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CENTER_CD, RCVTYPE, SYHN_KBN, RECORD_TYPE, SUPPLIERRCVNO, SEQNO, WORK_TYPE, OTHERREFNO1, RMANO, OTHERREFNO3, SUPPLIERCD, FROMADDRESS2, FROMADDRESS1, IFITEMCD, RECEIVEDQTY1, PRICE_WHOLESALE, LOT2, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RETURNED_EXCHANGE_ID
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
 * Long returnedExchangeId = entity.getReturnedExchangeId();
 * String sendCd = entity.getSendCd();
 * Long sendRowId = entity.getSendRowId();
 * String workFlg = entity.getWorkFlg();
 * String centerCd = entity.getCenterCd();
 * String rcvtype = entity.getRcvtype();
 * String syhnKbn = entity.getSyhnKbn();
 * String recordType = entity.getRecordType();
 * String supplierrcvno = entity.getSupplierrcvno();
 * String seqno = entity.getSeqno();
 * String workType = entity.getWorkType();
 * String otherrefno1 = entity.getOtherrefno1();
 * String rmano = entity.getRmano();
 * String otherrefno3 = entity.getOtherrefno3();
 * String suppliercd = entity.getSuppliercd();
 * String fromaddress2 = entity.getFromaddress2();
 * String fromaddress1 = entity.getFromaddress1();
 * String ifitemcd = entity.getIfitemcd();
 * String receivedqty1 = entity.getReceivedqty1();
 * String priceWholesale = entity.getPriceWholesale();
 * String lot2 = entity.getLot2();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setReturnedExchangeId(returnedExchangeId);
 * entity.setSendCd(sendCd);
 * entity.setSendRowId(sendRowId);
 * entity.setWorkFlg(workFlg);
 * entity.setCenterCd(centerCd);
 * entity.setRcvtype(rcvtype);
 * entity.setSyhnKbn(syhnKbn);
 * entity.setRecordType(recordType);
 * entity.setSupplierrcvno(supplierrcvno);
 * entity.setSeqno(seqno);
 * entity.setWorkType(workType);
 * entity.setOtherrefno1(otherrefno1);
 * entity.setRmano(rmano);
 * entity.setOtherrefno3(otherrefno3);
 * entity.setSuppliercd(suppliercd);
 * entity.setFromaddress2(fromaddress2);
 * entity.setFromaddress1(fromaddress1);
 * entity.setIfitemcd(ifitemcd);
 * entity.setReceivedqty1(receivedqty1);
 * entity.setPriceWholesale(priceWholesale);
 * entity.setLot2(lot2);
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
public abstract class BsEReturnedExchange extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RETURNED_EXCHANGE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _returnedExchangeId;

    /** SEND_CD: {NotNull, varchar(30)} */
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[(0)]} */
    protected String _workFlg;

    /** CENTER_CD: {NotNull, varchar(30)} */
    protected String _centerCd;

    /** RCVTYPE: {NotNull, varchar(30)} */
    protected String _rcvtype;

    /** SYHN_KBN: {NotNull, varchar(30)} */
    protected String _syhnKbn;

    /** RECORD_TYPE: {varchar(255)} */
    protected String _recordType;

    /** SUPPLIERRCVNO: {varchar(255)} */
    protected String _supplierrcvno;

    /** SEQNO: {varchar(255)} */
    protected String _seqno;

    /** WORK_TYPE: {varchar(255)} */
    protected String _workType;

    /** OTHERREFNO1: {varchar(255)} */
    protected String _otherrefno1;

    /** RMANO: {varchar(255)} */
    protected String _rmano;

    /** OTHERREFNO3: {varchar(255)} */
    protected String _otherrefno3;

    /** SUPPLIERCD: {varchar(255)} */
    protected String _suppliercd;

    /** FROMADDRESS2: {varchar(255)} */
    protected String _fromaddress2;

    /** FROMADDRESS1: {varchar(255)} */
    protected String _fromaddress1;

    /** IFITEMCD: {varchar(255)} */
    protected String _ifitemcd;

    /** RECEIVEDQTY1: {varchar(255)} */
    protected String _receivedqty1;

    /** PRICE_WHOLESALE: {varchar(255)} */
    protected String _priceWholesale;

    /** LOT2: {varchar(255)} */
    protected String _lot2;

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
        return "E_RETURNED_EXCHANGE";
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
        if (_returnedExchangeId == null) { return false; }
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
        if (obj instanceof BsEReturnedExchange) {
            BsEReturnedExchange other = (BsEReturnedExchange)obj;
            if (!xSV(_returnedExchangeId, other._returnedExchangeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _returnedExchangeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_returnedExchangeId));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendRowId));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_rcvtype));
        sb.append(dm).append(xfND(_syhnKbn));
        sb.append(dm).append(xfND(_recordType));
        sb.append(dm).append(xfND(_supplierrcvno));
        sb.append(dm).append(xfND(_seqno));
        sb.append(dm).append(xfND(_workType));
        sb.append(dm).append(xfND(_otherrefno1));
        sb.append(dm).append(xfND(_rmano));
        sb.append(dm).append(xfND(_otherrefno3));
        sb.append(dm).append(xfND(_suppliercd));
        sb.append(dm).append(xfND(_fromaddress2));
        sb.append(dm).append(xfND(_fromaddress1));
        sb.append(dm).append(xfND(_ifitemcd));
        sb.append(dm).append(xfND(_receivedqty1));
        sb.append(dm).append(xfND(_priceWholesale));
        sb.append(dm).append(xfND(_lot2));
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
    public EReturnedExchange clone() {
        return (EReturnedExchange)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RETURNED_EXCHANGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品取替品実績送信ID
     * @return The value of the column 'RETURNED_EXCHANGE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReturnedExchangeId() {
        checkSpecifiedProperty("returnedExchangeId");
        return _returnedExchangeId;
    }

    /**
     * [set] RETURNED_EXCHANGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品取替品実績送信ID
     * @param returnedExchangeId The value of the column 'RETURNED_EXCHANGE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReturnedExchangeId(Long returnedExchangeId) {
        registerModifiedProperty("returnedExchangeId");
        _returnedExchangeId = returnedExchangeId;
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
     * [get] WORK_FLG: {NotNull, char(1), default=[(0)]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1), default=[(0)]} <br>
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
     * [get] RCVTYPE: {NotNull, varchar(30)} <br>
     * 返品/取替区分(返品、取替)
     * @return The value of the column 'RCVTYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getRcvtype() {
        checkSpecifiedProperty("rcvtype");
        return convertEmptyToNull(_rcvtype);
    }

    /**
     * [set] RCVTYPE: {NotNull, varchar(30)} <br>
     * 返品/取替区分(返品、取替)
     * @param rcvtype The value of the column 'RCVTYPE'. (basically NotNull if update: for the constraint)
     */
    public void setRcvtype(String rcvtype) {
        registerModifiedProperty("rcvtype");
        _rcvtype = rcvtype;
    }

    /**
     * [get] SYHN_KBN: {NotNull, varchar(30)} <br>
     * 銘柄区分
     * @return The value of the column 'SYHN_KBN'. (basically NotNull if selected: for the constraint)
     */
    public String getSyhnKbn() {
        checkSpecifiedProperty("syhnKbn");
        return convertEmptyToNull(_syhnKbn);
    }

    /**
     * [set] SYHN_KBN: {NotNull, varchar(30)} <br>
     * 銘柄区分
     * @param syhnKbn The value of the column 'SYHN_KBN'. (basically NotNull if update: for the constraint)
     */
    public void setSyhnKbn(String syhnKbn) {
        registerModifiedProperty("syhnKbn");
        _syhnKbn = syhnKbn;
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
     * [get] SUPPLIERRCVNO: {varchar(255)} <br>
     * 伝票番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrcvno() {
        checkSpecifiedProperty("supplierrcvno");
        return convertEmptyToNull(_supplierrcvno);
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(255)} <br>
     * 伝票番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        registerModifiedProperty("supplierrcvno");
        _supplierrcvno = supplierrcvno;
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
     * [get] WORK_TYPE: {varchar(255)} <br>
     * 処理区分
     * @return The value of the column 'WORK_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkType() {
        checkSpecifiedProperty("workType");
        return convertEmptyToNull(_workType);
    }

    /**
     * [set] WORK_TYPE: {varchar(255)} <br>
     * 処理区分
     * @param workType The value of the column 'WORK_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkType(String workType) {
        registerModifiedProperty("workType");
        _workType = workType;
    }

    /**
     * [get] OTHERREFNO1: {varchar(255)} <br>
     * お得意様CD
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno1() {
        checkSpecifiedProperty("otherrefno1");
        return convertEmptyToNull(_otherrefno1);
    }

    /**
     * [set] OTHERREFNO1: {varchar(255)} <br>
     * お得意様CD
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno1(String otherrefno1) {
        registerModifiedProperty("otherrefno1");
        _otherrefno1 = otherrefno1;
    }

    /**
     * [get] RMANO: {varchar(255)} <br>
     * 販売年月日
     * @return The value of the column 'RMANO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRmano() {
        checkSpecifiedProperty("rmano");
        return convertEmptyToNull(_rmano);
    }

    /**
     * [set] RMANO: {varchar(255)} <br>
     * 販売年月日
     * @param rmano The value of the column 'RMANO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRmano(String rmano) {
        registerModifiedProperty("rmano");
        _rmano = rmano;
    }

    /**
     * [get] OTHERREFNO3: {varchar(255)} <br>
     * 返品区分
     * @return The value of the column 'OTHERREFNO3'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno3() {
        checkSpecifiedProperty("otherrefno3");
        return convertEmptyToNull(_otherrefno3);
    }

    /**
     * [set] OTHERREFNO3: {varchar(255)} <br>
     * 返品区分
     * @param otherrefno3 The value of the column 'OTHERREFNO3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno3(String otherrefno3) {
        registerModifiedProperty("otherrefno3");
        _otherrefno3 = otherrefno3;
    }

    /**
     * [get] SUPPLIERCD: {varchar(255)} <br>
     * 配達拠点CD
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuppliercd() {
        checkSpecifiedProperty("suppliercd");
        return convertEmptyToNull(_suppliercd);
    }

    /**
     * [set] SUPPLIERCD: {varchar(255)} <br>
     * 配達拠点CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuppliercd(String suppliercd) {
        registerModifiedProperty("suppliercd");
        _suppliercd = suppliercd;
    }

    /**
     * [get] FROMADDRESS2: {varchar(255)} <br>
     * 方面CD
     * @return The value of the column 'FROMADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromaddress2() {
        checkSpecifiedProperty("fromaddress2");
        return convertEmptyToNull(_fromaddress2);
    }

    /**
     * [set] FROMADDRESS2: {varchar(255)} <br>
     * 方面CD
     * @param fromaddress2 The value of the column 'FROMADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromaddress2(String fromaddress2) {
        registerModifiedProperty("fromaddress2");
        _fromaddress2 = fromaddress2;
    }

    /**
     * [get] FROMADDRESS1: {varchar(255)} <br>
     * 内外
     * @return The value of the column 'FROMADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromaddress1() {
        checkSpecifiedProperty("fromaddress1");
        return convertEmptyToNull(_fromaddress1);
    }

    /**
     * [set] FROMADDRESS1: {varchar(255)} <br>
     * 内外
     * @param fromaddress1 The value of the column 'FROMADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromaddress1(String fromaddress1) {
        registerModifiedProperty("fromaddress1");
        _fromaddress1 = fromaddress1;
    }

    /**
     * [get] IFITEMCD: {varchar(255)} <br>
     * 銘柄CD(実績)
     * @return The value of the column 'IFITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfitemcd() {
        checkSpecifiedProperty("ifitemcd");
        return convertEmptyToNull(_ifitemcd);
    }

    /**
     * [set] IFITEMCD: {varchar(255)} <br>
     * 銘柄CD(実績)
     * @param ifitemcd The value of the column 'IFITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfitemcd(String ifitemcd) {
        registerModifiedProperty("ifitemcd");
        _ifitemcd = ifitemcd;
    }

    /**
     * [get] RECEIVEDQTY1: {varchar(255)} <br>
     * 入庫実績数(個装換算)
     * @return The value of the column 'RECEIVEDQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedqty1() {
        checkSpecifiedProperty("receivedqty1");
        return convertEmptyToNull(_receivedqty1);
    }

    /**
     * [set] RECEIVEDQTY1: {varchar(255)} <br>
     * 入庫実績数(個装換算)
     * @param receivedqty1 The value of the column 'RECEIVEDQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedqty1(String receivedqty1) {
        registerModifiedProperty("receivedqty1");
        _receivedqty1 = receivedqty1;
    }

    /**
     * [get] PRICE_WHOLESALE: {varchar(255)} <br>
     * 不足本数(実績)
     * @return The value of the column 'PRICE_WHOLESALE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPriceWholesale() {
        checkSpecifiedProperty("priceWholesale");
        return convertEmptyToNull(_priceWholesale);
    }

    /**
     * [set] PRICE_WHOLESALE: {varchar(255)} <br>
     * 不足本数(実績)
     * @param priceWholesale The value of the column 'PRICE_WHOLESALE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPriceWholesale(String priceWholesale) {
        registerModifiedProperty("priceWholesale");
        _priceWholesale = priceWholesale;
    }

    /**
     * [get] LOT2: {varchar(255)} <br>
     * 状態CD(実績)
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(255)} <br>
     * 状態CD(実績)
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
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
