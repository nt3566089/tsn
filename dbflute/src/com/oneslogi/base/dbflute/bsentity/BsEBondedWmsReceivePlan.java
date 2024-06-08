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
 * The entity of E_BONDED_WMS_RECEIVE_PLAN as TABLE. <br>
 * 入庫予定データ受信テーブル
 * <pre>
 * [primary-key]
 *     BONDED_WMS_RECEIVE_PLAN_ID
 *
 * [column]
 *     BONDED_WMS_RECEIVE_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, NOTES, SBWAREHOUSECD, SUPPLIERRCVNO, RCVSCHDATE, CARRIERNO, SHIPTOCD, OTHERREFNO1, PRODUCT_CD, LOT3, LOT4, LOT1, EXPECTQTY1, FROMFAX, BATJMFYM, CARRIERSNAME, CARRIERWBNO, FOREIGNCARGOFLG, BL_NO, CARRIERNAME, FROMEMAIL, ARRIVALPORTDATE, SHIPNAME, BATDELINO, BATDELIDETAILNO, BATWAREHOUSECD, BATKEEPWAREHOUSECD, BATPARTNERNORCV, BATPARTNERNOSND, BATDELIDETAILNUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_WMS_RECEIVE_PLAN_ID
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
 * Long bondedWmsReceivePlanId = entity.getBondedWmsReceivePlanId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String notes = entity.getNotes();
 * String sbwarehousecd = entity.getSbwarehousecd();
 * String supplierrcvno = entity.getSupplierrcvno();
 * String rcvschdate = entity.getRcvschdate();
 * String carrierno = entity.getCarrierno();
 * String shiptocd = entity.getShiptocd();
 * String otherrefno1 = entity.getOtherrefno1();
 * String productCd = entity.getProductCd();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String lot1 = entity.getLot1();
 * String expectqty1 = entity.getExpectqty1();
 * String fromfax = entity.getFromfax();
 * String batjmfym = entity.getBatjmfym();
 * String carriersname = entity.getCarriersname();
 * String carrierwbno = entity.getCarrierwbno();
 * String foreigncargoflg = entity.getForeigncargoflg();
 * String blNo = entity.getBlNo();
 * String carriername = entity.getCarriername();
 * String fromemail = entity.getFromemail();
 * String arrivalportdate = entity.getArrivalportdate();
 * String shipname = entity.getShipname();
 * String batdelino = entity.getBatdelino();
 * String batdelidetailno = entity.getBatdelidetailno();
 * String batwarehousecd = entity.getBatwarehousecd();
 * String batkeepwarehousecd = entity.getBatkeepwarehousecd();
 * String batpartnernorcv = entity.getBatpartnernorcv();
 * String batpartnernosnd = entity.getBatpartnernosnd();
 * String batdelidetailnum = entity.getBatdelidetailnum();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBondedWmsReceivePlanId(bondedWmsReceivePlanId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setNotes(notes);
 * entity.setSbwarehousecd(sbwarehousecd);
 * entity.setSupplierrcvno(supplierrcvno);
 * entity.setRcvschdate(rcvschdate);
 * entity.setCarrierno(carrierno);
 * entity.setShiptocd(shiptocd);
 * entity.setOtherrefno1(otherrefno1);
 * entity.setProductCd(productCd);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setLot1(lot1);
 * entity.setExpectqty1(expectqty1);
 * entity.setFromfax(fromfax);
 * entity.setBatjmfym(batjmfym);
 * entity.setCarriersname(carriersname);
 * entity.setCarrierwbno(carrierwbno);
 * entity.setForeigncargoflg(foreigncargoflg);
 * entity.setBlNo(blNo);
 * entity.setCarriername(carriername);
 * entity.setFromemail(fromemail);
 * entity.setArrivalportdate(arrivalportdate);
 * entity.setShipname(shipname);
 * entity.setBatdelino(batdelino);
 * entity.setBatdelidetailno(batdelidetailno);
 * entity.setBatwarehousecd(batwarehousecd);
 * entity.setBatkeepwarehousecd(batkeepwarehousecd);
 * entity.setBatpartnernorcv(batpartnernorcv);
 * entity.setBatpartnernosnd(batpartnernosnd);
 * entity.setBatdelidetailnum(batdelidetailnum);
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
public abstract class BsEBondedWmsReceivePlan extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _bondedWmsReceivePlanId;

    /** RECEIVE_CD: {NotNull, varchar(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {NotNull, bigint(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** NOTES: {varchar(4000)} */
    protected String _notes;

    /** SBWAREHOUSECD: {varchar(255)} */
    protected String _sbwarehousecd;

    /** SUPPLIERRCVNO: {varchar(255)} */
    protected String _supplierrcvno;

    /** RCVSCHDATE: {varchar(255)} */
    protected String _rcvschdate;

    /** CARRIERNO: {varchar(255)} */
    protected String _carrierno;

    /** SHIPTOCD: {varchar(255)} */
    protected String _shiptocd;

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

    /** EXPECTQTY1: {varchar(255)} */
    protected String _expectqty1;

    /** FROMFAX: {varchar(255)} */
    protected String _fromfax;

    /** BATJMFYM: {varchar(255)} */
    protected String _batjmfym;

    /** CARRIERSNAME: {varchar(255)} */
    protected String _carriersname;

    /** CARRIERWBNO: {varchar(255)} */
    protected String _carrierwbno;

    /** FOREIGNCARGOFLG: {varchar(255)} */
    protected String _foreigncargoflg;

    /** BL_NO: {varchar(255)} */
    protected String _blNo;

    /** CARRIERNAME: {varchar(255)} */
    protected String _carriername;

    /** FROMEMAIL: {varchar(255)} */
    protected String _fromemail;

    /** ARRIVALPORTDATE: {varchar(255)} */
    protected String _arrivalportdate;

    /** SHIPNAME: {varchar(255)} */
    protected String _shipname;

    /** BATDELINO: {varchar(255)} */
    protected String _batdelino;

    /** BATDELIDETAILNO: {varchar(255)} */
    protected String _batdelidetailno;

    /** BATWAREHOUSECD: {varchar(255)} */
    protected String _batwarehousecd;

    /** BATKEEPWAREHOUSECD: {varchar(255)} */
    protected String _batkeepwarehousecd;

    /** BATPARTNERNORCV: {varchar(255)} */
    protected String _batpartnernorcv;

    /** BATPARTNERNOSND: {varchar(255)} */
    protected String _batpartnernosnd;

    /** BATDELIDETAILNUM: {varchar(255)} */
    protected String _batdelidetailnum;

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
        return "E_BONDED_WMS_RECEIVE_PLAN";
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
        if (_bondedWmsReceivePlanId == null) { return false; }
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
        if (obj instanceof BsEBondedWmsReceivePlan) {
            BsEBondedWmsReceivePlan other = (BsEBondedWmsReceivePlan)obj;
            if (!xSV(_bondedWmsReceivePlanId, other._bondedWmsReceivePlanId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bondedWmsReceivePlanId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bondedWmsReceivePlanId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_sbwarehousecd));
        sb.append(dm).append(xfND(_supplierrcvno));
        sb.append(dm).append(xfND(_rcvschdate));
        sb.append(dm).append(xfND(_carrierno));
        sb.append(dm).append(xfND(_shiptocd));
        sb.append(dm).append(xfND(_otherrefno1));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_expectqty1));
        sb.append(dm).append(xfND(_fromfax));
        sb.append(dm).append(xfND(_batjmfym));
        sb.append(dm).append(xfND(_carriersname));
        sb.append(dm).append(xfND(_carrierwbno));
        sb.append(dm).append(xfND(_foreigncargoflg));
        sb.append(dm).append(xfND(_blNo));
        sb.append(dm).append(xfND(_carriername));
        sb.append(dm).append(xfND(_fromemail));
        sb.append(dm).append(xfND(_arrivalportdate));
        sb.append(dm).append(xfND(_shipname));
        sb.append(dm).append(xfND(_batdelino));
        sb.append(dm).append(xfND(_batdelidetailno));
        sb.append(dm).append(xfND(_batwarehousecd));
        sb.append(dm).append(xfND(_batkeepwarehousecd));
        sb.append(dm).append(xfND(_batpartnernorcv));
        sb.append(dm).append(xfND(_batpartnernosnd));
        sb.append(dm).append(xfND(_batdelidetailnum));
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
    public EBondedWmsReceivePlan clone() {
        return (EBondedWmsReceivePlan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫予定データ受信ID
     * @return The value of the column 'BONDED_WMS_RECEIVE_PLAN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBondedWmsReceivePlanId() {
        checkSpecifiedProperty("bondedWmsReceivePlanId");
        return _bondedWmsReceivePlanId;
    }

    /**
     * [set] BONDED_WMS_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫予定データ受信ID
     * @param bondedWmsReceivePlanId The value of the column 'BONDED_WMS_RECEIVE_PLAN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBondedWmsReceivePlanId(Long bondedWmsReceivePlanId) {
        registerModifiedProperty("bondedWmsReceivePlanId");
        _bondedWmsReceivePlanId = bondedWmsReceivePlanId;
    }

    /**
     * [get] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 入庫予定拡張管理番号
     * @return The value of the column 'NOTES'. (NullAllowed even if selected: for no constraint)
     */
    public String getNotes() {
        checkSpecifiedProperty("notes");
        return convertEmptyToNull(_notes);
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 入庫予定拡張管理番号
     * @param notes The value of the column 'NOTES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotes(String notes) {
        registerModifiedProperty("notes");
        _notes = notes;
    }

    /**
     * [get] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫コード
     * @return The value of the column 'SBWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSbwarehousecd() {
        checkSpecifiedProperty("sbwarehousecd");
        return convertEmptyToNull(_sbwarehousecd);
    }

    /**
     * [set] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫コード
     * @param sbwarehousecd The value of the column 'SBWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSbwarehousecd(String sbwarehousecd) {
        registerModifiedProperty("sbwarehousecd");
        _sbwarehousecd = sbwarehousecd;
    }

    /**
     * [get] SUPPLIERRCVNO: {varchar(255)} <br>
     * 保税管理番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrcvno() {
        checkSpecifiedProperty("supplierrcvno");
        return convertEmptyToNull(_supplierrcvno);
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(255)} <br>
     * 保税管理番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        registerModifiedProperty("supplierrcvno");
        _supplierrcvno = supplierrcvno;
    }

    /**
     * [get] RCVSCHDATE: {varchar(255)} <br>
     * 受入予定年月日
     * @return The value of the column 'RCVSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvschdate() {
        checkSpecifiedProperty("rcvschdate");
        return convertEmptyToNull(_rcvschdate);
    }

    /**
     * [set] RCVSCHDATE: {varchar(255)} <br>
     * 受入予定年月日
     * @param rcvschdate The value of the column 'RCVSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvschdate(String rcvschdate) {
        registerModifiedProperty("rcvschdate");
        _rcvschdate = rcvschdate;
    }

    /**
     * [get] CARRIERNO: {varchar(255)} <br>
     * コンテナNO
     * @return The value of the column 'CARRIERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierno() {
        checkSpecifiedProperty("carrierno");
        return convertEmptyToNull(_carrierno);
    }

    /**
     * [set] CARRIERNO: {varchar(255)} <br>
     * コンテナNO
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierno(String carrierno) {
        registerModifiedProperty("carrierno");
        _carrierno = carrierno;
    }

    /**
     * [get] SHIPTOCD: {varchar(255)} <br>
     * 受地コード
     * @return The value of the column 'SHIPTOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptocd() {
        checkSpecifiedProperty("shiptocd");
        return convertEmptyToNull(_shiptocd);
    }

    /**
     * [set] SHIPTOCD: {varchar(255)} <br>
     * 受地コード
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptocd(String shiptocd) {
        registerModifiedProperty("shiptocd");
        _shiptocd = shiptocd;
    }

    /**
     * [get] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者コード
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno1() {
        checkSpecifiedProperty("otherrefno1");
        return convertEmptyToNull(_otherrefno1);
    }

    /**
     * [set] OTHERREFNO1: {varchar(255)} <br>
     * 特販業者コード
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
     * [get] EXPECTQTY1: {varchar(255)} <br>
     * 個数（個装）
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public String getExpectqty1() {
        checkSpecifiedProperty("expectqty1");
        return convertEmptyToNull(_expectqty1);
    }

    /**
     * [set] EXPECTQTY1: {varchar(255)} <br>
     * 個数（個装）
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectqty1(String expectqty1) {
        registerModifiedProperty("expectqty1");
        _expectqty1 = expectqty1;
    }

    /**
     * [get] FROMFAX: {varchar(255)} <br>
     * ラインNO
     * @return The value of the column 'FROMFAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromfax() {
        checkSpecifiedProperty("fromfax");
        return convertEmptyToNull(_fromfax);
    }

    /**
     * [set] FROMFAX: {varchar(255)} <br>
     * ラインNO
     * @param fromfax The value of the column 'FROMFAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromfax(String fromfax) {
        registerModifiedProperty("fromfax");
        _fromfax = fromfax;
    }

    /**
     * [get] BATJMFYM: {varchar(255)} <br>
     * BATJ製造月記号
     * @return The value of the column 'BATJMFYM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatjmfym() {
        checkSpecifiedProperty("batjmfym");
        return convertEmptyToNull(_batjmfym);
    }

    /**
     * [set] BATJMFYM: {varchar(255)} <br>
     * BATJ製造月記号
     * @param batjmfym The value of the column 'BATJMFYM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatjmfym(String batjmfym) {
        registerModifiedProperty("batjmfym");
        _batjmfym = batjmfym;
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
     * OrderNO
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierwbno() {
        checkSpecifiedProperty("carrierwbno");
        return convertEmptyToNull(_carrierwbno);
    }

    /**
     * [set] CARRIERWBNO: {varchar(255)} <br>
     * OrderNO
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierwbno(String carrierwbno) {
        registerModifiedProperty("carrierwbno");
        _carrierwbno = carrierwbno;
    }

    /**
     * [get] FOREIGNCARGOFLG: {varchar(255)} <br>
     * 入庫時内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getForeigncargoflg() {
        checkSpecifiedProperty("foreigncargoflg");
        return convertEmptyToNull(_foreigncargoflg);
    }

    /**
     * [set] FOREIGNCARGOFLG: {varchar(255)} <br>
     * 入庫時内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForeigncargoflg(String foreigncargoflg) {
        registerModifiedProperty("foreigncargoflg");
        _foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] BL_NO: {varchar(255)} <br>
     * BL_NO
     * @return The value of the column 'BL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBlNo() {
        checkSpecifiedProperty("blNo");
        return convertEmptyToNull(_blNo);
    }

    /**
     * [set] BL_NO: {varchar(255)} <br>
     * BL_NO
     * @param blNo The value of the column 'BL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBlNo(String blNo) {
        registerModifiedProperty("blNo");
        _blNo = blNo;
    }

    /**
     * [get] CARRIERNAME: {varchar(255)} <br>
     * 連携項目
     * @return The value of the column 'CARRIERNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriername() {
        checkSpecifiedProperty("carriername");
        return convertEmptyToNull(_carriername);
    }

    /**
     * [set] CARRIERNAME: {varchar(255)} <br>
     * 連携項目
     * @param carriername The value of the column 'CARRIERNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriername(String carriername) {
        registerModifiedProperty("carriername");
        _carriername = carriername;
    }

    /**
     * [get] FROMEMAIL: {varchar(255)} <br>
     * 依頼番号
     * @return The value of the column 'FROMEMAIL'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromemail() {
        checkSpecifiedProperty("fromemail");
        return convertEmptyToNull(_fromemail);
    }

    /**
     * [set] FROMEMAIL: {varchar(255)} <br>
     * 依頼番号
     * @param fromemail The value of the column 'FROMEMAIL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromemail(String fromemail) {
        registerModifiedProperty("fromemail");
        _fromemail = fromemail;
    }

    /**
     * [get] ARRIVALPORTDATE: {varchar(255)} <br>
     * 入港日
     * @return The value of the column 'ARRIVALPORTDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getArrivalportdate() {
        checkSpecifiedProperty("arrivalportdate");
        return convertEmptyToNull(_arrivalportdate);
    }

    /**
     * [set] ARRIVALPORTDATE: {varchar(255)} <br>
     * 入港日
     * @param arrivalportdate The value of the column 'ARRIVALPORTDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArrivalportdate(String arrivalportdate) {
        registerModifiedProperty("arrivalportdate");
        _arrivalportdate = arrivalportdate;
    }

    /**
     * [get] SHIPNAME: {varchar(255)} <br>
     * 船名
     * @return The value of the column 'SHIPNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipname() {
        checkSpecifiedProperty("shipname");
        return convertEmptyToNull(_shipname);
    }

    /**
     * [set] SHIPNAME: {varchar(255)} <br>
     * 船名
     * @param shipname The value of the column 'SHIPNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipname(String shipname) {
        registerModifiedProperty("shipname");
        _shipname = shipname;
    }

    /**
     * [get] BATDELINO: {varchar(255)} <br>
     * ＳＡＰデリバリー番号（ヘッダ）
     * @return The value of the column 'BATDELINO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatdelino() {
        checkSpecifiedProperty("batdelino");
        return convertEmptyToNull(_batdelino);
    }

    /**
     * [set] BATDELINO: {varchar(255)} <br>
     * ＳＡＰデリバリー番号（ヘッダ）
     * @param batdelino The value of the column 'BATDELINO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatdelino(String batdelino) {
        registerModifiedProperty("batdelino");
        _batdelino = batdelino;
    }

    /**
     * [get] BATDELIDETAILNO: {varchar(255)} <br>
     * ＳＡＰデリバリー番号（明細）
     * @return The value of the column 'BATDELIDETAILNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatdelidetailno() {
        checkSpecifiedProperty("batdelidetailno");
        return convertEmptyToNull(_batdelidetailno);
    }

    /**
     * [set] BATDELIDETAILNO: {varchar(255)} <br>
     * ＳＡＰデリバリー番号（明細）
     * @param batdelidetailno The value of the column 'BATDELIDETAILNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatdelidetailno(String batdelidetailno) {
        registerModifiedProperty("batdelidetailno");
        _batdelidetailno = batdelidetailno;
    }

    /**
     * [get] BATWAREHOUSECD: {varchar(255)} <br>
     * ＢＡＴ搬入依頼拠点コード
     * @return The value of the column 'BATWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatwarehousecd() {
        checkSpecifiedProperty("batwarehousecd");
        return convertEmptyToNull(_batwarehousecd);
    }

    /**
     * [set] BATWAREHOUSECD: {varchar(255)} <br>
     * ＢＡＴ搬入依頼拠点コード
     * @param batwarehousecd The value of the column 'BATWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatwarehousecd(String batwarehousecd) {
        registerModifiedProperty("batwarehousecd");
        _batwarehousecd = batwarehousecd;
    }

    /**
     * [get] BATKEEPWAREHOUSECD: {varchar(255)} <br>
     * ＢＡＴ搬入依頼保管場所コード
     * @return The value of the column 'BATKEEPWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatkeepwarehousecd() {
        checkSpecifiedProperty("batkeepwarehousecd");
        return convertEmptyToNull(_batkeepwarehousecd);
    }

    /**
     * [set] BATKEEPWAREHOUSECD: {varchar(255)} <br>
     * ＢＡＴ搬入依頼保管場所コード
     * @param batkeepwarehousecd The value of the column 'BATKEEPWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatkeepwarehousecd(String batkeepwarehousecd) {
        registerModifiedProperty("batkeepwarehousecd");
        _batkeepwarehousecd = batkeepwarehousecd;
    }

    /**
     * [get] BATPARTNERNORCV: {varchar(255)} <br>
     * パートナー番号（受信）
     * @return The value of the column 'BATPARTNERNORCV'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatpartnernorcv() {
        checkSpecifiedProperty("batpartnernorcv");
        return convertEmptyToNull(_batpartnernorcv);
    }

    /**
     * [set] BATPARTNERNORCV: {varchar(255)} <br>
     * パートナー番号（受信）
     * @param batpartnernorcv The value of the column 'BATPARTNERNORCV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatpartnernorcv(String batpartnernorcv) {
        registerModifiedProperty("batpartnernorcv");
        _batpartnernorcv = batpartnernorcv;
    }

    /**
     * [get] BATPARTNERNOSND: {varchar(255)} <br>
     * パートナー番号（送信）
     * @return The value of the column 'BATPARTNERNOSND'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatpartnernosnd() {
        checkSpecifiedProperty("batpartnernosnd");
        return convertEmptyToNull(_batpartnernosnd);
    }

    /**
     * [set] BATPARTNERNOSND: {varchar(255)} <br>
     * パートナー番号（送信）
     * @param batpartnernosnd The value of the column 'BATPARTNERNOSND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatpartnernosnd(String batpartnernosnd) {
        registerModifiedProperty("batpartnernosnd");
        _batpartnernosnd = batpartnernosnd;
    }

    /**
     * [get] BATDELIDETAILNUM: {varchar(255)} <br>
     * 伝票番号
     * @return The value of the column 'BATDELIDETAILNUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatdelidetailnum() {
        checkSpecifiedProperty("batdelidetailnum");
        return convertEmptyToNull(_batdelidetailnum);
    }

    /**
     * [set] BATDELIDETAILNUM: {varchar(255)} <br>
     * 伝票番号
     * @param batdelidetailnum The value of the column 'BATDELIDETAILNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatdelidetailnum(String batdelidetailnum) {
        registerModifiedProperty("batdelidetailnum");
        _batdelidetailnum = batdelidetailnum;
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
