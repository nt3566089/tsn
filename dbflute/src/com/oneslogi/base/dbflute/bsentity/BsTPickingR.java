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
 * The entity of T_PICKING_R as TABLE. <br>
 * 出庫帳票
 * <pre>
 * [primary-key]
 *     PICKING_H_ID
 *
 * [column]
 *     PICKING_H_ID, OPL_OUT_FLG, TPL_OUT_FLG, MLT_OUT_FLG, SPL_OUT_FLG, PL1_OUT_FLG, PL1_OUT_USER_ID, PL1_OUT_DT, PL_OUT_FLG, SL_OUT_FLG, PL2_OUT_FLG, PL2_OUT_USER_ID, PL2_OUT_DT, CASE_OUT_FLG, CASE_OUT_USER_ID, CASE_OUT_DT, PACKING_OUT_FLG, PACKING_OUT_USER_ID, PACKING_OUT_DT, SLIP_OUT_FLG, SLIP_OUT_USER_ID, SLIP_OUT_DT, INVOICE_CREATE_FLG, INVOICE_CREATE_DT, INVOICE_ISSUE_NUM, SHIPPING_RECORD_OUT_FLG, SHIPPING_RECORD_OUT_USER_ID, SHIPPING_RECORD_OUT_DT, BOL_OUT_FLG, BOL_OUT_USER_ID, BOL_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_USER, T_PICKING_H, B_CLASS_DTL(ByInvoiceCreateFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUserByPl1OutUserId, bUserByCaseOutUserId, bUserByShippingRecordOutUserId, tPickingH, bUserByPl2OutUserId, bUserBySlipOutUserId, bUserByPackingOutUserId, bClassDtlByInvoiceCreateFlg, bClassDtlByOplOutFlg, bClassDtlByTplOutFlg, bClassDtlByCaseOutFlg, bClassDtlByMltOutFlg, bClassDtlBySplOutFlg, bClassDtlByPlOutFlg, bClassDtlBySlOutFlg, bClassDtlByPl1OutFlg, bClassDtlByPl2OutFlg, bClassDtlByPackingOutFlg, bClassDtlBySlipOutFlg, bClassDtlByShippingRecordOutFlg, bClassDtlByBolOutFlg
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long pickingHId = entity.getPickingHId();
 * String oplOutFlg = entity.getOplOutFlg();
 * String tplOutFlg = entity.getTplOutFlg();
 * String mltOutFlg = entity.getMltOutFlg();
 * String splOutFlg = entity.getSplOutFlg();
 * String pl1OutFlg = entity.getPl1OutFlg();
 * Long pl1OutUserId = entity.getPl1OutUserId();
 * java.sql.Timestamp pl1OutDt = entity.getPl1OutDt();
 * String plOutFlg = entity.getPlOutFlg();
 * String slOutFlg = entity.getSlOutFlg();
 * String pl2OutFlg = entity.getPl2OutFlg();
 * Long pl2OutUserId = entity.getPl2OutUserId();
 * java.sql.Timestamp pl2OutDt = entity.getPl2OutDt();
 * String caseOutFlg = entity.getCaseOutFlg();
 * Long caseOutUserId = entity.getCaseOutUserId();
 * java.sql.Timestamp caseOutDt = entity.getCaseOutDt();
 * String packingOutFlg = entity.getPackingOutFlg();
 * Long packingOutUserId = entity.getPackingOutUserId();
 * java.sql.Timestamp packingOutDt = entity.getPackingOutDt();
 * String slipOutFlg = entity.getSlipOutFlg();
 * Long slipOutUserId = entity.getSlipOutUserId();
 * java.sql.Timestamp slipOutDt = entity.getSlipOutDt();
 * String invoiceCreateFlg = entity.getInvoiceCreateFlg();
 * java.sql.Timestamp invoiceCreateDt = entity.getInvoiceCreateDt();
 * Long invoiceIssueNum = entity.getInvoiceIssueNum();
 * String shippingRecordOutFlg = entity.getShippingRecordOutFlg();
 * Long shippingRecordOutUserId = entity.getShippingRecordOutUserId();
 * java.sql.Timestamp shippingRecordOutDt = entity.getShippingRecordOutDt();
 * String bolOutFlg = entity.getBolOutFlg();
 * Long bolOutUserId = entity.getBolOutUserId();
 * java.sql.Timestamp bolOutDt = entity.getBolOutDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPickingHId(pickingHId);
 * entity.setOplOutFlg(oplOutFlg);
 * entity.setTplOutFlg(tplOutFlg);
 * entity.setMltOutFlg(mltOutFlg);
 * entity.setSplOutFlg(splOutFlg);
 * entity.setPl1OutFlg(pl1OutFlg);
 * entity.setPl1OutUserId(pl1OutUserId);
 * entity.setPl1OutDt(pl1OutDt);
 * entity.setPlOutFlg(plOutFlg);
 * entity.setSlOutFlg(slOutFlg);
 * entity.setPl2OutFlg(pl2OutFlg);
 * entity.setPl2OutUserId(pl2OutUserId);
 * entity.setPl2OutDt(pl2OutDt);
 * entity.setCaseOutFlg(caseOutFlg);
 * entity.setCaseOutUserId(caseOutUserId);
 * entity.setCaseOutDt(caseOutDt);
 * entity.setPackingOutFlg(packingOutFlg);
 * entity.setPackingOutUserId(packingOutUserId);
 * entity.setPackingOutDt(packingOutDt);
 * entity.setSlipOutFlg(slipOutFlg);
 * entity.setSlipOutUserId(slipOutUserId);
 * entity.setSlipOutDt(slipOutDt);
 * entity.setInvoiceCreateFlg(invoiceCreateFlg);
 * entity.setInvoiceCreateDt(invoiceCreateDt);
 * entity.setInvoiceIssueNum(invoiceIssueNum);
 * entity.setShippingRecordOutFlg(shippingRecordOutFlg);
 * entity.setShippingRecordOutUserId(shippingRecordOutUserId);
 * entity.setShippingRecordOutDt(shippingRecordOutDt);
 * entity.setBolOutFlg(bolOutFlg);
 * entity.setBolOutUserId(bolOutUserId);
 * entity.setBolOutDt(bolOutDt);
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
public abstract class BsTPickingR extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H} */
    protected Long _pickingHId;

    /** OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _oplOutFlg;

    /** TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _tplOutFlg;

    /** MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _mltOutFlg;

    /** SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _splOutFlg;

    /** PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _pl1OutFlg;

    /** PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    protected Long _pl1OutUserId;

    /** PL1_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _pl1OutDt;

    /** PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _plOutFlg;

    /** SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _slOutFlg;

    /** PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _pl2OutFlg;

    /** PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    protected Long _pl2OutUserId;

    /** PL2_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _pl2OutDt;

    /** CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _caseOutFlg;

    /** CASE_OUT_USER_ID: {bigint(19), FK to B_USER} */
    protected Long _caseOutUserId;

    /** CASE_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _caseOutDt;

    /** PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _packingOutFlg;

    /** PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    protected Long _packingOutUserId;

    /** PACKING_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _packingOutDt;

    /** SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _slipOutFlg;

    /** SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    protected Long _slipOutUserId;

    /** SLIP_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _slipOutDt;

    /** INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} */
    protected String _invoiceCreateFlg;

    /** INVOICE_CREATE_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _invoiceCreateDt;

    /** INVOICE_ISSUE_NUM: {bigint(19)} */
    protected Long _invoiceIssueNum;

    /** SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    protected String _shippingRecordOutFlg;

    /** SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER} */
    protected Long _shippingRecordOutUserId;

    /** SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _shippingRecordOutDt;

    /** BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg} */
    protected String _bolOutFlg;

    /** BOL_OUT_USER_ID: {bigint(19)} */
    protected Long _bolOutUserId;

    /** BOL_OUT_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _bolOutDt;

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
        return "T_PICKING_R";
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
        if (_pickingHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of oplOutFlg as the classification of ListOutFlg. <br>
     * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getOplOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getOplOutFlg());
    }

    /**
     * Set the value of oplOutFlg as the classification of ListOutFlg. <br>
     * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setOplOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setOplOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of tplOutFlg as the classification of ListOutFlg. <br>
     * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getTplOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getTplOutFlg());
    }

    /**
     * Set the value of tplOutFlg as the classification of ListOutFlg. <br>
     * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTplOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setTplOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of mltOutFlg as the classification of ListOutFlg. <br>
     * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getMltOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getMltOutFlg());
    }

    /**
     * Set the value of mltOutFlg as the classification of ListOutFlg. <br>
     * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMltOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setMltOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of splOutFlg as the classification of ListOutFlg. <br>
     * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getSplOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getSplOutFlg());
    }

    /**
     * Set the value of splOutFlg as the classification of ListOutFlg. <br>
     * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSplOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setSplOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of pl1OutFlg as the classification of ListOutFlg. <br>
     * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getPl1OutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getPl1OutFlg());
    }

    /**
     * Set the value of pl1OutFlg as the classification of ListOutFlg. <br>
     * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPl1OutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setPl1OutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of plOutFlg as the classification of ListOutFlg. <br>
     * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getPlOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getPlOutFlg());
    }

    /**
     * Set the value of plOutFlg as the classification of ListOutFlg. <br>
     * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPlOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setPlOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of slOutFlg as the classification of ListOutFlg. <br>
     * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getSlOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getSlOutFlg());
    }

    /**
     * Set the value of slOutFlg as the classification of ListOutFlg. <br>
     * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSlOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setSlOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of pl2OutFlg as the classification of ListOutFlg. <br>
     * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getPl2OutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getPl2OutFlg());
    }

    /**
     * Set the value of pl2OutFlg as the classification of ListOutFlg. <br>
     * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPl2OutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setPl2OutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of caseOutFlg as the classification of ListOutFlg. <br>
     * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getCaseOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getCaseOutFlg());
    }

    /**
     * Set the value of caseOutFlg as the classification of ListOutFlg. <br>
     * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCaseOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setCaseOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of packingOutFlg as the classification of ListOutFlg. <br>
     * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getPackingOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getPackingOutFlg());
    }

    /**
     * Set the value of packingOutFlg as the classification of ListOutFlg. <br>
     * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPackingOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setPackingOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of slipOutFlg as the classification of ListOutFlg. <br>
     * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getSlipOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getSlipOutFlg());
    }

    /**
     * Set the value of slipOutFlg as the classification of ListOutFlg. <br>
     * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSlipOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setSlipOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of invoiceCreateFlg as the classification of InvoiceCreateFlg. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InvoiceCreateFlg getInvoiceCreateFlgAsInvoiceCreateFlg() {
        return CDef.InvoiceCreateFlg.codeOf(getInvoiceCreateFlg());
    }

    /**
     * Set the value of invoiceCreateFlg as the classification of InvoiceCreateFlg. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInvoiceCreateFlgAsInvoiceCreateFlg(CDef.InvoiceCreateFlg cdef) {
        setInvoiceCreateFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of shippingRecordOutFlg as the classification of ListOutFlg. <br>
     * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getShippingRecordOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getShippingRecordOutFlg());
    }

    /**
     * Set the value of shippingRecordOutFlg as the classification of ListOutFlg. <br>
     * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setShippingRecordOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setShippingRecordOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of bolOutFlg as the classification of BolOutFlg. <br>
     * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.BolOutFlg getBolOutFlgAsBolOutFlg() {
        return CDef.BolOutFlg.codeOf(getBolOutFlg());
    }

    /**
     * Set the value of bolOutFlg as the classification of BolOutFlg. <br>
     * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setBolOutFlgAsBolOutFlg(CDef.BolOutFlg cdef) {
        setBolOutFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of oplOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setOplOutFlg_$0() {
        setOplOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of oplOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setOplOutFlg_$1() {
        setOplOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of tplOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setTplOutFlg_$0() {
        setTplOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of tplOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setTplOutFlg_$1() {
        setTplOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of mltOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setMltOutFlg_$0() {
        setMltOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of mltOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setMltOutFlg_$1() {
        setMltOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of splOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setSplOutFlg_$0() {
        setSplOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of splOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setSplOutFlg_$1() {
        setSplOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of pl1OutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setPl1OutFlg_$0() {
        setPl1OutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of pl1OutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setPl1OutFlg_$1() {
        setPl1OutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of plOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setPlOutFlg_$0() {
        setPlOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of plOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setPlOutFlg_$1() {
        setPlOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of slOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setSlOutFlg_$0() {
        setSlOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of slOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setSlOutFlg_$1() {
        setSlOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of pl2OutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setPl2OutFlg_$0() {
        setPl2OutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of pl2OutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setPl2OutFlg_$1() {
        setPl2OutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of caseOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setCaseOutFlg_$0() {
        setCaseOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of caseOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setCaseOutFlg_$1() {
        setCaseOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of packingOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setPackingOutFlg_$0() {
        setPackingOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of packingOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setPackingOutFlg_$1() {
        setPackingOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of slipOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setSlipOutFlg_$0() {
        setSlipOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of slipOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setSlipOutFlg_$1() {
        setSlipOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of invoiceCreateFlg as $0 (0). <br>
     * $0: 未出力
     */
    public void setInvoiceCreateFlg_$0() {
        setInvoiceCreateFlgAsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$0);
    }

    /**
     * Set the value of invoiceCreateFlg as $1 (1). <br>
     * $1: 出力済
     */
    public void setInvoiceCreateFlg_$1() {
        setInvoiceCreateFlgAsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$1);
    }

    /**
     * Set the value of shippingRecordOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setShippingRecordOutFlg_$0() {
        setShippingRecordOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of shippingRecordOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setShippingRecordOutFlg_$1() {
        setShippingRecordOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    /**
     * Set the value of bolOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setBolOutFlg_$0() {
        setBolOutFlgAsBolOutFlg(CDef.BolOutFlg.$0);
    }

    /**
     * Set the value of bolOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setBolOutFlg_$1() {
        setBolOutFlgAsBolOutFlg(CDef.BolOutFlg.$1);
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
     * Is the value of oplOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOplOutFlg$0() {
        CDef.ListOutFlg cdef = getOplOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of oplOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOplOutFlg$1() {
        CDef.ListOutFlg cdef = getOplOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of tplOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTplOutFlg$0() {
        CDef.ListOutFlg cdef = getTplOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of tplOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTplOutFlg$1() {
        CDef.ListOutFlg cdef = getTplOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of mltOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMltOutFlg$0() {
        CDef.ListOutFlg cdef = getMltOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of mltOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMltOutFlg$1() {
        CDef.ListOutFlg cdef = getMltOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of splOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSplOutFlg$0() {
        CDef.ListOutFlg cdef = getSplOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of splOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSplOutFlg$1() {
        CDef.ListOutFlg cdef = getSplOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of pl1OutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPl1OutFlg$0() {
        CDef.ListOutFlg cdef = getPl1OutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of pl1OutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPl1OutFlg$1() {
        CDef.ListOutFlg cdef = getPl1OutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of plOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPlOutFlg$0() {
        CDef.ListOutFlg cdef = getPlOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of plOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPlOutFlg$1() {
        CDef.ListOutFlg cdef = getPlOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of slOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlOutFlg$0() {
        CDef.ListOutFlg cdef = getSlOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of slOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlOutFlg$1() {
        CDef.ListOutFlg cdef = getSlOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of pl2OutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPl2OutFlg$0() {
        CDef.ListOutFlg cdef = getPl2OutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of pl2OutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPl2OutFlg$1() {
        CDef.ListOutFlg cdef = getPl2OutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of caseOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCaseOutFlg$0() {
        CDef.ListOutFlg cdef = getCaseOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of caseOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCaseOutFlg$1() {
        CDef.ListOutFlg cdef = getCaseOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of packingOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingOutFlg$0() {
        CDef.ListOutFlg cdef = getPackingOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of packingOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingOutFlg$1() {
        CDef.ListOutFlg cdef = getPackingOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of slipOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipOutFlg$0() {
        CDef.ListOutFlg cdef = getSlipOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of slipOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSlipOutFlg$1() {
        CDef.ListOutFlg cdef = getSlipOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of invoiceCreateFlg $0? <br>
     * $0: 未出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInvoiceCreateFlg$0() {
        CDef.InvoiceCreateFlg cdef = getInvoiceCreateFlgAsInvoiceCreateFlg();
        return cdef != null ? cdef.equals(CDef.InvoiceCreateFlg.$0) : false;
    }

    /**
     * Is the value of invoiceCreateFlg $1? <br>
     * $1: 出力済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInvoiceCreateFlg$1() {
        CDef.InvoiceCreateFlg cdef = getInvoiceCreateFlgAsInvoiceCreateFlg();
        return cdef != null ? cdef.equals(CDef.InvoiceCreateFlg.$1) : false;
    }

    /**
     * Is the value of shippingRecordOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingRecordOutFlg$0() {
        CDef.ListOutFlg cdef = getShippingRecordOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of shippingRecordOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingRecordOutFlg$1() {
        CDef.ListOutFlg cdef = getShippingRecordOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    /**
     * Is the value of bolOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isBolOutFlg$0() {
        CDef.BolOutFlg cdef = getBolOutFlgAsBolOutFlg();
        return cdef != null ? cdef.equals(CDef.BolOutFlg.$0) : false;
    }

    /**
     * Is the value of bolOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isBolOutFlg$1() {
        CDef.BolOutFlg cdef = getBolOutFlgAsBolOutFlg();
        return cdef != null ? cdef.equals(CDef.BolOutFlg.$1) : false;
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
     * Get the value of the column 'oplOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getOplOutFlgName() {
        CDef.ListOutFlg cdef = getOplOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'tplOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getTplOutFlgName() {
        CDef.ListOutFlg cdef = getTplOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'mltOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMltOutFlgName() {
        CDef.ListOutFlg cdef = getMltOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'splOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSplOutFlgName() {
        CDef.ListOutFlg cdef = getSplOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'pl1OutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPl1OutFlgName() {
        CDef.ListOutFlg cdef = getPl1OutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'plOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPlOutFlgName() {
        CDef.ListOutFlg cdef = getPlOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'slOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSlOutFlgName() {
        CDef.ListOutFlg cdef = getSlOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'pl2OutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPl2OutFlgName() {
        CDef.ListOutFlg cdef = getPl2OutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'caseOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCaseOutFlgName() {
        CDef.ListOutFlg cdef = getCaseOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'packingOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPackingOutFlgName() {
        CDef.ListOutFlg cdef = getPackingOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'slipOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSlipOutFlgName() {
        CDef.ListOutFlg cdef = getSlipOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'invoiceCreateFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInvoiceCreateFlgName() {
        CDef.InvoiceCreateFlg cdef = getInvoiceCreateFlgAsInvoiceCreateFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'shippingRecordOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getShippingRecordOutFlgName() {
        CDef.ListOutFlg cdef = getShippingRecordOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'bolOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getBolOutFlgName() {
        CDef.BolOutFlg cdef = getBolOutFlgAsBolOutFlg();
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
    /** B_USER by my PL1_OUT_USER_ID, named 'BUserByPl1OutUserId'. */
    protected BUser _bUserByPl1OutUserId;

    /**
     * [get] B_USER by my PL1_OUT_USER_ID, named 'BUserByPl1OutUserId'. <br>
     * @return The entity of foreign property 'BUserByPl1OutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByPl1OutUserId() {
        return _bUserByPl1OutUserId;
    }

    /**
     * [set] B_USER by my PL1_OUT_USER_ID, named 'BUserByPl1OutUserId'.
     * @param bUserByPl1OutUserId The entity of foreign property 'BUserByPl1OutUserId'. (NullAllowed)
     */
    public void setBUserByPl1OutUserId(BUser bUserByPl1OutUserId) {
        _bUserByPl1OutUserId = bUserByPl1OutUserId;
    }

    /** B_USER by my CASE_OUT_USER_ID, named 'BUserByCaseOutUserId'. */
    protected BUser _bUserByCaseOutUserId;

    /**
     * [get] B_USER by my CASE_OUT_USER_ID, named 'BUserByCaseOutUserId'. <br>
     * @return The entity of foreign property 'BUserByCaseOutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByCaseOutUserId() {
        return _bUserByCaseOutUserId;
    }

    /**
     * [set] B_USER by my CASE_OUT_USER_ID, named 'BUserByCaseOutUserId'.
     * @param bUserByCaseOutUserId The entity of foreign property 'BUserByCaseOutUserId'. (NullAllowed)
     */
    public void setBUserByCaseOutUserId(BUser bUserByCaseOutUserId) {
        _bUserByCaseOutUserId = bUserByCaseOutUserId;
    }

    /** B_USER by my SHIPPING_RECORD_OUT_USER_ID, named 'BUserByShippingRecordOutUserId'. */
    protected BUser _bUserByShippingRecordOutUserId;

    /**
     * [get] B_USER by my SHIPPING_RECORD_OUT_USER_ID, named 'BUserByShippingRecordOutUserId'. <br>
     * @return The entity of foreign property 'BUserByShippingRecordOutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByShippingRecordOutUserId() {
        return _bUserByShippingRecordOutUserId;
    }

    /**
     * [set] B_USER by my SHIPPING_RECORD_OUT_USER_ID, named 'BUserByShippingRecordOutUserId'.
     * @param bUserByShippingRecordOutUserId The entity of foreign property 'BUserByShippingRecordOutUserId'. (NullAllowed)
     */
    public void setBUserByShippingRecordOutUserId(BUser bUserByShippingRecordOutUserId) {
        _bUserByShippingRecordOutUserId = bUserByShippingRecordOutUserId;
    }

    /** T_PICKING_H by my PICKING_H_ID, named 'TPickingH'. */
    protected TPickingH _tPickingH;

    /**
     * [get] T_PICKING_H by my PICKING_H_ID, named 'TPickingH'. <br>
     * @return The entity of foreign property 'TPickingH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TPickingH getTPickingH() {
        return _tPickingH;
    }

    /**
     * [set] T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @param tPickingH The entity of foreign property 'TPickingH'. (NullAllowed)
     */
    public void setTPickingH(TPickingH tPickingH) {
        _tPickingH = tPickingH;
    }

    /** B_USER by my PL2_OUT_USER_ID, named 'BUserByPl2OutUserId'. */
    protected BUser _bUserByPl2OutUserId;

    /**
     * [get] B_USER by my PL2_OUT_USER_ID, named 'BUserByPl2OutUserId'. <br>
     * @return The entity of foreign property 'BUserByPl2OutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByPl2OutUserId() {
        return _bUserByPl2OutUserId;
    }

    /**
     * [set] B_USER by my PL2_OUT_USER_ID, named 'BUserByPl2OutUserId'.
     * @param bUserByPl2OutUserId The entity of foreign property 'BUserByPl2OutUserId'. (NullAllowed)
     */
    public void setBUserByPl2OutUserId(BUser bUserByPl2OutUserId) {
        _bUserByPl2OutUserId = bUserByPl2OutUserId;
    }

    /** B_USER by my SLIP_OUT_USER_ID, named 'BUserBySlipOutUserId'. */
    protected BUser _bUserBySlipOutUserId;

    /**
     * [get] B_USER by my SLIP_OUT_USER_ID, named 'BUserBySlipOutUserId'. <br>
     * @return The entity of foreign property 'BUserBySlipOutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserBySlipOutUserId() {
        return _bUserBySlipOutUserId;
    }

    /**
     * [set] B_USER by my SLIP_OUT_USER_ID, named 'BUserBySlipOutUserId'.
     * @param bUserBySlipOutUserId The entity of foreign property 'BUserBySlipOutUserId'. (NullAllowed)
     */
    public void setBUserBySlipOutUserId(BUser bUserBySlipOutUserId) {
        _bUserBySlipOutUserId = bUserBySlipOutUserId;
    }

    /** B_USER by my PACKING_OUT_USER_ID, named 'BUserByPackingOutUserId'. */
    protected BUser _bUserByPackingOutUserId;

    /**
     * [get] B_USER by my PACKING_OUT_USER_ID, named 'BUserByPackingOutUserId'. <br>
     * @return The entity of foreign property 'BUserByPackingOutUserId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BUser getBUserByPackingOutUserId() {
        return _bUserByPackingOutUserId;
    }

    /**
     * [set] B_USER by my PACKING_OUT_USER_ID, named 'BUserByPackingOutUserId'.
     * @param bUserByPackingOutUserId The entity of foreign property 'BUserByPackingOutUserId'. (NullAllowed)
     */
    public void setBUserByPackingOutUserId(BUser bUserByPackingOutUserId) {
        _bUserByPackingOutUserId = bUserByPackingOutUserId;
    }

    /** B_CLASS_DTL by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'. */
    protected BClassDtl _bClassDtlByInvoiceCreateFlg;

    /**
     * [get] B_CLASS_DTL by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByInvoiceCreateFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInvoiceCreateFlg() {
        return _bClassDtlByInvoiceCreateFlg;
    }

    /**
     * [set] B_CLASS_DTL by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'.
     * @param bClassDtlByInvoiceCreateFlg The entity of foreign property 'BClassDtlByInvoiceCreateFlg'. (NullAllowed)
     */
    public void setBClassDtlByInvoiceCreateFlg(BClassDtl bClassDtlByInvoiceCreateFlg) {
        _bClassDtlByInvoiceCreateFlg = bClassDtlByInvoiceCreateFlg;
    }

    /** B_CLASS_DTL by my OPL_OUT_FLG, named 'BClassDtlByOplOutFlg'. */
    protected BClassDtl _bClassDtlByOplOutFlg;

    /**
     * [get] B_CLASS_DTL by my OPL_OUT_FLG, named 'BClassDtlByOplOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByOplOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByOplOutFlg() {
        return _bClassDtlByOplOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my OPL_OUT_FLG, named 'BClassDtlByOplOutFlg'.
     * @param bClassDtlByOplOutFlg The entity of foreign property 'BClassDtlByOplOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByOplOutFlg(BClassDtl bClassDtlByOplOutFlg) {
        _bClassDtlByOplOutFlg = bClassDtlByOplOutFlg;
    }

    /** B_CLASS_DTL by my TPL_OUT_FLG, named 'BClassDtlByTplOutFlg'. */
    protected BClassDtl _bClassDtlByTplOutFlg;

    /**
     * [get] B_CLASS_DTL by my TPL_OUT_FLG, named 'BClassDtlByTplOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByTplOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByTplOutFlg() {
        return _bClassDtlByTplOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my TPL_OUT_FLG, named 'BClassDtlByTplOutFlg'.
     * @param bClassDtlByTplOutFlg The entity of foreign property 'BClassDtlByTplOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByTplOutFlg(BClassDtl bClassDtlByTplOutFlg) {
        _bClassDtlByTplOutFlg = bClassDtlByTplOutFlg;
    }

    /** B_CLASS_DTL by my CASE_OUT_FLG, named 'BClassDtlByCaseOutFlg'. */
    protected BClassDtl _bClassDtlByCaseOutFlg;

    /**
     * [get] B_CLASS_DTL by my CASE_OUT_FLG, named 'BClassDtlByCaseOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByCaseOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCaseOutFlg() {
        return _bClassDtlByCaseOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my CASE_OUT_FLG, named 'BClassDtlByCaseOutFlg'.
     * @param bClassDtlByCaseOutFlg The entity of foreign property 'BClassDtlByCaseOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByCaseOutFlg(BClassDtl bClassDtlByCaseOutFlg) {
        _bClassDtlByCaseOutFlg = bClassDtlByCaseOutFlg;
    }

    /** B_CLASS_DTL by my MLT_OUT_FLG, named 'BClassDtlByMltOutFlg'. */
    protected BClassDtl _bClassDtlByMltOutFlg;

    /**
     * [get] B_CLASS_DTL by my MLT_OUT_FLG, named 'BClassDtlByMltOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByMltOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByMltOutFlg() {
        return _bClassDtlByMltOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my MLT_OUT_FLG, named 'BClassDtlByMltOutFlg'.
     * @param bClassDtlByMltOutFlg The entity of foreign property 'BClassDtlByMltOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByMltOutFlg(BClassDtl bClassDtlByMltOutFlg) {
        _bClassDtlByMltOutFlg = bClassDtlByMltOutFlg;
    }

    /** B_CLASS_DTL by my SPL_OUT_FLG, named 'BClassDtlBySplOutFlg'. */
    protected BClassDtl _bClassDtlBySplOutFlg;

    /**
     * [get] B_CLASS_DTL by my SPL_OUT_FLG, named 'BClassDtlBySplOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlBySplOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySplOutFlg() {
        return _bClassDtlBySplOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my SPL_OUT_FLG, named 'BClassDtlBySplOutFlg'.
     * @param bClassDtlBySplOutFlg The entity of foreign property 'BClassDtlBySplOutFlg'. (NullAllowed)
     */
    public void setBClassDtlBySplOutFlg(BClassDtl bClassDtlBySplOutFlg) {
        _bClassDtlBySplOutFlg = bClassDtlBySplOutFlg;
    }

    /** B_CLASS_DTL by my PL_OUT_FLG, named 'BClassDtlByPlOutFlg'. */
    protected BClassDtl _bClassDtlByPlOutFlg;

    /**
     * [get] B_CLASS_DTL by my PL_OUT_FLG, named 'BClassDtlByPlOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByPlOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPlOutFlg() {
        return _bClassDtlByPlOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my PL_OUT_FLG, named 'BClassDtlByPlOutFlg'.
     * @param bClassDtlByPlOutFlg The entity of foreign property 'BClassDtlByPlOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByPlOutFlg(BClassDtl bClassDtlByPlOutFlg) {
        _bClassDtlByPlOutFlg = bClassDtlByPlOutFlg;
    }

    /** B_CLASS_DTL by my SL_OUT_FLG, named 'BClassDtlBySlOutFlg'. */
    protected BClassDtl _bClassDtlBySlOutFlg;

    /**
     * [get] B_CLASS_DTL by my SL_OUT_FLG, named 'BClassDtlBySlOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlBySlOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySlOutFlg() {
        return _bClassDtlBySlOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my SL_OUT_FLG, named 'BClassDtlBySlOutFlg'.
     * @param bClassDtlBySlOutFlg The entity of foreign property 'BClassDtlBySlOutFlg'. (NullAllowed)
     */
    public void setBClassDtlBySlOutFlg(BClassDtl bClassDtlBySlOutFlg) {
        _bClassDtlBySlOutFlg = bClassDtlBySlOutFlg;
    }

    /** B_CLASS_DTL by my PL1_OUT_FLG, named 'BClassDtlByPl1OutFlg'. */
    protected BClassDtl _bClassDtlByPl1OutFlg;

    /**
     * [get] B_CLASS_DTL by my PL1_OUT_FLG, named 'BClassDtlByPl1OutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByPl1OutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPl1OutFlg() {
        return _bClassDtlByPl1OutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my PL1_OUT_FLG, named 'BClassDtlByPl1OutFlg'.
     * @param bClassDtlByPl1OutFlg The entity of foreign property 'BClassDtlByPl1OutFlg'. (NullAllowed)
     */
    public void setBClassDtlByPl1OutFlg(BClassDtl bClassDtlByPl1OutFlg) {
        _bClassDtlByPl1OutFlg = bClassDtlByPl1OutFlg;
    }

    /** B_CLASS_DTL by my PL2_OUT_FLG, named 'BClassDtlByPl2OutFlg'. */
    protected BClassDtl _bClassDtlByPl2OutFlg;

    /**
     * [get] B_CLASS_DTL by my PL2_OUT_FLG, named 'BClassDtlByPl2OutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByPl2OutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPl2OutFlg() {
        return _bClassDtlByPl2OutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my PL2_OUT_FLG, named 'BClassDtlByPl2OutFlg'.
     * @param bClassDtlByPl2OutFlg The entity of foreign property 'BClassDtlByPl2OutFlg'. (NullAllowed)
     */
    public void setBClassDtlByPl2OutFlg(BClassDtl bClassDtlByPl2OutFlg) {
        _bClassDtlByPl2OutFlg = bClassDtlByPl2OutFlg;
    }

    /** B_CLASS_DTL by my PACKING_OUT_FLG, named 'BClassDtlByPackingOutFlg'. */
    protected BClassDtl _bClassDtlByPackingOutFlg;

    /**
     * [get] B_CLASS_DTL by my PACKING_OUT_FLG, named 'BClassDtlByPackingOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByPackingOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPackingOutFlg() {
        return _bClassDtlByPackingOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my PACKING_OUT_FLG, named 'BClassDtlByPackingOutFlg'.
     * @param bClassDtlByPackingOutFlg The entity of foreign property 'BClassDtlByPackingOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByPackingOutFlg(BClassDtl bClassDtlByPackingOutFlg) {
        _bClassDtlByPackingOutFlg = bClassDtlByPackingOutFlg;
    }

    /** B_CLASS_DTL by my SLIP_OUT_FLG, named 'BClassDtlBySlipOutFlg'. */
    protected BClassDtl _bClassDtlBySlipOutFlg;

    /**
     * [get] B_CLASS_DTL by my SLIP_OUT_FLG, named 'BClassDtlBySlipOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlBySlipOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySlipOutFlg() {
        return _bClassDtlBySlipOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my SLIP_OUT_FLG, named 'BClassDtlBySlipOutFlg'.
     * @param bClassDtlBySlipOutFlg The entity of foreign property 'BClassDtlBySlipOutFlg'. (NullAllowed)
     */
    public void setBClassDtlBySlipOutFlg(BClassDtl bClassDtlBySlipOutFlg) {
        _bClassDtlBySlipOutFlg = bClassDtlBySlipOutFlg;
    }

    /** B_CLASS_DTL by my SHIPPING_RECORD_OUT_FLG, named 'BClassDtlByShippingRecordOutFlg'. */
    protected BClassDtl _bClassDtlByShippingRecordOutFlg;

    /**
     * [get] B_CLASS_DTL by my SHIPPING_RECORD_OUT_FLG, named 'BClassDtlByShippingRecordOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByShippingRecordOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByShippingRecordOutFlg() {
        return _bClassDtlByShippingRecordOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my SHIPPING_RECORD_OUT_FLG, named 'BClassDtlByShippingRecordOutFlg'.
     * @param bClassDtlByShippingRecordOutFlg The entity of foreign property 'BClassDtlByShippingRecordOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByShippingRecordOutFlg(BClassDtl bClassDtlByShippingRecordOutFlg) {
        _bClassDtlByShippingRecordOutFlg = bClassDtlByShippingRecordOutFlg;
    }

    /** B_CLASS_DTL by my BOL_OUT_FLG, named 'BClassDtlByBolOutFlg'. */
    protected BClassDtl _bClassDtlByBolOutFlg;

    /**
     * [get] B_CLASS_DTL by my BOL_OUT_FLG, named 'BClassDtlByBolOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByBolOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByBolOutFlg() {
        return _bClassDtlByBolOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my BOL_OUT_FLG, named 'BClassDtlByBolOutFlg'.
     * @param bClassDtlByBolOutFlg The entity of foreign property 'BClassDtlByBolOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByBolOutFlg(BClassDtl bClassDtlByBolOutFlg) {
        _bClassDtlByBolOutFlg = bClassDtlByBolOutFlg;
    }

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
        if (obj instanceof BsTPickingR) {
            BsTPickingR other = (BsTPickingR)obj;
            if (!xSV(_pickingHId, other._pickingHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _pickingHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bUserByPl1OutUserId != null)
        { sb.append(li).append(xbRDS(_bUserByPl1OutUserId, "bUserByPl1OutUserId")); }
        if (_bUserByCaseOutUserId != null)
        { sb.append(li).append(xbRDS(_bUserByCaseOutUserId, "bUserByCaseOutUserId")); }
        if (_bUserByShippingRecordOutUserId != null)
        { sb.append(li).append(xbRDS(_bUserByShippingRecordOutUserId, "bUserByShippingRecordOutUserId")); }
        if (_tPickingH != null)
        { sb.append(li).append(xbRDS(_tPickingH, "tPickingH")); }
        if (_bUserByPl2OutUserId != null)
        { sb.append(li).append(xbRDS(_bUserByPl2OutUserId, "bUserByPl2OutUserId")); }
        if (_bUserBySlipOutUserId != null)
        { sb.append(li).append(xbRDS(_bUserBySlipOutUserId, "bUserBySlipOutUserId")); }
        if (_bUserByPackingOutUserId != null)
        { sb.append(li).append(xbRDS(_bUserByPackingOutUserId, "bUserByPackingOutUserId")); }
        if (_bClassDtlByInvoiceCreateFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInvoiceCreateFlg, "bClassDtlByInvoiceCreateFlg")); }
        if (_bClassDtlByOplOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByOplOutFlg, "bClassDtlByOplOutFlg")); }
        if (_bClassDtlByTplOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByTplOutFlg, "bClassDtlByTplOutFlg")); }
        if (_bClassDtlByCaseOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCaseOutFlg, "bClassDtlByCaseOutFlg")); }
        if (_bClassDtlByMltOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByMltOutFlg, "bClassDtlByMltOutFlg")); }
        if (_bClassDtlBySplOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySplOutFlg, "bClassDtlBySplOutFlg")); }
        if (_bClassDtlByPlOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPlOutFlg, "bClassDtlByPlOutFlg")); }
        if (_bClassDtlBySlOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySlOutFlg, "bClassDtlBySlOutFlg")); }
        if (_bClassDtlByPl1OutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPl1OutFlg, "bClassDtlByPl1OutFlg")); }
        if (_bClassDtlByPl2OutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPl2OutFlg, "bClassDtlByPl2OutFlg")); }
        if (_bClassDtlByPackingOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPackingOutFlg, "bClassDtlByPackingOutFlg")); }
        if (_bClassDtlBySlipOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySlipOutFlg, "bClassDtlBySlipOutFlg")); }
        if (_bClassDtlByShippingRecordOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByShippingRecordOutFlg, "bClassDtlByShippingRecordOutFlg")); }
        if (_bClassDtlByBolOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByBolOutFlg, "bClassDtlByBolOutFlg")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_pickingHId));
        sb.append(dm).append(xfND(_oplOutFlg));
        sb.append(dm).append(xfND(_tplOutFlg));
        sb.append(dm).append(xfND(_mltOutFlg));
        sb.append(dm).append(xfND(_splOutFlg));
        sb.append(dm).append(xfND(_pl1OutFlg));
        sb.append(dm).append(xfND(_pl1OutUserId));
        sb.append(dm).append(xfND(_pl1OutDt));
        sb.append(dm).append(xfND(_plOutFlg));
        sb.append(dm).append(xfND(_slOutFlg));
        sb.append(dm).append(xfND(_pl2OutFlg));
        sb.append(dm).append(xfND(_pl2OutUserId));
        sb.append(dm).append(xfND(_pl2OutDt));
        sb.append(dm).append(xfND(_caseOutFlg));
        sb.append(dm).append(xfND(_caseOutUserId));
        sb.append(dm).append(xfND(_caseOutDt));
        sb.append(dm).append(xfND(_packingOutFlg));
        sb.append(dm).append(xfND(_packingOutUserId));
        sb.append(dm).append(xfND(_packingOutDt));
        sb.append(dm).append(xfND(_slipOutFlg));
        sb.append(dm).append(xfND(_slipOutUserId));
        sb.append(dm).append(xfND(_slipOutDt));
        sb.append(dm).append(xfND(_invoiceCreateFlg));
        sb.append(dm).append(xfND(_invoiceCreateDt));
        sb.append(dm).append(xfND(_invoiceIssueNum));
        sb.append(dm).append(xfND(_shippingRecordOutFlg));
        sb.append(dm).append(xfND(_shippingRecordOutUserId));
        sb.append(dm).append(xfND(_shippingRecordOutDt));
        sb.append(dm).append(xfND(_bolOutFlg));
        sb.append(dm).append(xfND(_bolOutUserId));
        sb.append(dm).append(xfND(_bolOutDt));
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
        if (_bUserByPl1OutUserId != null)
        { sb.append(dm).append("bUserByPl1OutUserId"); }
        if (_bUserByCaseOutUserId != null)
        { sb.append(dm).append("bUserByCaseOutUserId"); }
        if (_bUserByShippingRecordOutUserId != null)
        { sb.append(dm).append("bUserByShippingRecordOutUserId"); }
        if (_tPickingH != null)
        { sb.append(dm).append("tPickingH"); }
        if (_bUserByPl2OutUserId != null)
        { sb.append(dm).append("bUserByPl2OutUserId"); }
        if (_bUserBySlipOutUserId != null)
        { sb.append(dm).append("bUserBySlipOutUserId"); }
        if (_bUserByPackingOutUserId != null)
        { sb.append(dm).append("bUserByPackingOutUserId"); }
        if (_bClassDtlByInvoiceCreateFlg != null)
        { sb.append(dm).append("bClassDtlByInvoiceCreateFlg"); }
        if (_bClassDtlByOplOutFlg != null)
        { sb.append(dm).append("bClassDtlByOplOutFlg"); }
        if (_bClassDtlByTplOutFlg != null)
        { sb.append(dm).append("bClassDtlByTplOutFlg"); }
        if (_bClassDtlByCaseOutFlg != null)
        { sb.append(dm).append("bClassDtlByCaseOutFlg"); }
        if (_bClassDtlByMltOutFlg != null)
        { sb.append(dm).append("bClassDtlByMltOutFlg"); }
        if (_bClassDtlBySplOutFlg != null)
        { sb.append(dm).append("bClassDtlBySplOutFlg"); }
        if (_bClassDtlByPlOutFlg != null)
        { sb.append(dm).append("bClassDtlByPlOutFlg"); }
        if (_bClassDtlBySlOutFlg != null)
        { sb.append(dm).append("bClassDtlBySlOutFlg"); }
        if (_bClassDtlByPl1OutFlg != null)
        { sb.append(dm).append("bClassDtlByPl1OutFlg"); }
        if (_bClassDtlByPl2OutFlg != null)
        { sb.append(dm).append("bClassDtlByPl2OutFlg"); }
        if (_bClassDtlByPackingOutFlg != null)
        { sb.append(dm).append("bClassDtlByPackingOutFlg"); }
        if (_bClassDtlBySlipOutFlg != null)
        { sb.append(dm).append("bClassDtlBySlipOutFlg"); }
        if (_bClassDtlByShippingRecordOutFlg != null)
        { sb.append(dm).append("bClassDtlByShippingRecordOutFlg"); }
        if (_bClassDtlByBolOutFlg != null)
        { sb.append(dm).append("bClassDtlByBolOutFlg"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TPickingR clone() {
        return (TPickingR)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H} <br>
     * 出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickingHId() {
        checkSpecifiedProperty("pickingHId");
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H} <br>
     * 出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPickingHId(Long pickingHId) {
        registerModifiedProperty("pickingHId");
        _pickingHId = pickingHId;
    }

    /**
     * [get] OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * オーダーピッキングリスト出力フラグ
     * @return The value of the column 'OPL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOplOutFlg() {
        checkSpecifiedProperty("oplOutFlg");
        return convertEmptyToNull(_oplOutFlg);
    }

    /**
     * [set] OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * オーダーピッキングリスト出力フラグ
     * @param oplOutFlg The value of the column 'OPL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOplOutFlg(String oplOutFlg) {
        registerModifiedProperty("oplOutFlg");
        _oplOutFlg = oplOutFlg;
    }

    /**
     * [get] TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * トータルピッキングリスト出力フラグ
     * @return The value of the column 'TPL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTplOutFlg() {
        checkSpecifiedProperty("tplOutFlg");
        return convertEmptyToNull(_tplOutFlg);
    }

    /**
     * [set] TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * トータルピッキングリスト出力フラグ
     * @param tplOutFlg The value of the column 'TPL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTplOutFlg(String tplOutFlg) {
        registerModifiedProperty("tplOutFlg");
        _tplOutFlg = tplOutFlg;
    }

    /**
     * [get] MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * マルチピッキングリスト出力フラグ
     * @return The value of the column 'MLT_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMltOutFlg() {
        checkSpecifiedProperty("mltOutFlg");
        return convertEmptyToNull(_mltOutFlg);
    }

    /**
     * [set] MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * マルチピッキングリスト出力フラグ
     * @param mltOutFlg The value of the column 'MLT_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMltOutFlg(String mltOutFlg) {
        registerModifiedProperty("mltOutFlg");
        _mltOutFlg = mltOutFlg;
    }

    /**
     * [get] SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 単行ピッキングリスト出力フラグ
     * @return The value of the column 'SPL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSplOutFlg() {
        checkSpecifiedProperty("splOutFlg");
        return convertEmptyToNull(_splOutFlg);
    }

    /**
     * [set] SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 単行ピッキングリスト出力フラグ
     * @param splOutFlg The value of the column 'SPL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSplOutFlg(String splOutFlg) {
        registerModifiedProperty("splOutFlg");
        _splOutFlg = splOutFlg;
    }

    /**
     * [get] PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 1次ピッキングリスト出力フラグ
     * @return The value of the column 'PL1_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPl1OutFlg() {
        checkSpecifiedProperty("pl1OutFlg");
        return convertEmptyToNull(_pl1OutFlg);
    }

    /**
     * [set] PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 1次ピッキングリスト出力フラグ
     * @param pl1OutFlg The value of the column 'PL1_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl1OutFlg(String pl1OutFlg) {
        registerModifiedProperty("pl1OutFlg");
        _pl1OutFlg = pl1OutFlg;
    }

    /**
     * [get] PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 1次ピッキングリスト出力者ID
     * @return The value of the column 'PL1_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPl1OutUserId() {
        checkSpecifiedProperty("pl1OutUserId");
        return _pl1OutUserId;
    }

    /**
     * [set] PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 1次ピッキングリスト出力者ID
     * @param pl1OutUserId The value of the column 'PL1_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl1OutUserId(Long pl1OutUserId) {
        registerModifiedProperty("pl1OutUserId");
        _pl1OutUserId = pl1OutUserId;
    }

    /**
     * [get] PL1_OUT_DT: {datetime2(26, 6)} <br>
     * 1次ピッキングリスト出力日時
     * @return The value of the column 'PL1_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getPl1OutDt() {
        checkSpecifiedProperty("pl1OutDt");
        return _pl1OutDt;
    }

    /**
     * [set] PL1_OUT_DT: {datetime2(26, 6)} <br>
     * 1次ピッキングリスト出力日時
     * @param pl1OutDt The value of the column 'PL1_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl1OutDt(java.sql.Timestamp pl1OutDt) {
        registerModifiedProperty("pl1OutDt");
        _pl1OutDt = pl1OutDt;
    }

    /**
     * [get] PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 摘み取りリスト出力フラグ
     * @return The value of the column 'PL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlOutFlg() {
        checkSpecifiedProperty("plOutFlg");
        return convertEmptyToNull(_plOutFlg);
    }

    /**
     * [set] PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 摘み取りリスト出力フラグ
     * @param plOutFlg The value of the column 'PL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlOutFlg(String plOutFlg) {
        registerModifiedProperty("plOutFlg");
        _plOutFlg = plOutFlg;
    }

    /**
     * [get] SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 種蒔きリスト出力フラグ
     * @return The value of the column 'SL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlOutFlg() {
        checkSpecifiedProperty("slOutFlg");
        return convertEmptyToNull(_slOutFlg);
    }

    /**
     * [set] SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 種蒔きリスト出力フラグ
     * @param slOutFlg The value of the column 'SL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlOutFlg(String slOutFlg) {
        registerModifiedProperty("slOutFlg");
        _slOutFlg = slOutFlg;
    }

    /**
     * [get] PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 2次ピッキングリスト出力フラグ
     * @return The value of the column 'PL2_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPl2OutFlg() {
        checkSpecifiedProperty("pl2OutFlg");
        return convertEmptyToNull(_pl2OutFlg);
    }

    /**
     * [set] PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 2次ピッキングリスト出力フラグ
     * @param pl2OutFlg The value of the column 'PL2_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl2OutFlg(String pl2OutFlg) {
        registerModifiedProperty("pl2OutFlg");
        _pl2OutFlg = pl2OutFlg;
    }

    /**
     * [get] PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 2次ピッキングリスト出力者ID
     * @return The value of the column 'PL2_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPl2OutUserId() {
        checkSpecifiedProperty("pl2OutUserId");
        return _pl2OutUserId;
    }

    /**
     * [set] PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 2次ピッキングリスト出力者ID
     * @param pl2OutUserId The value of the column 'PL2_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl2OutUserId(Long pl2OutUserId) {
        registerModifiedProperty("pl2OutUserId");
        _pl2OutUserId = pl2OutUserId;
    }

    /**
     * [get] PL2_OUT_DT: {datetime2(26, 6)} <br>
     * 2次ピッキングリスト出力日時
     * @return The value of the column 'PL2_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getPl2OutDt() {
        checkSpecifiedProperty("pl2OutDt");
        return _pl2OutDt;
    }

    /**
     * [set] PL2_OUT_DT: {datetime2(26, 6)} <br>
     * 2次ピッキングリスト出力日時
     * @param pl2OutDt The value of the column 'PL2_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPl2OutDt(java.sql.Timestamp pl2OutDt) {
        registerModifiedProperty("pl2OutDt");
        _pl2OutDt = pl2OutDt;
    }

    /**
     * [get] CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * ケースピッキングリスト出力フラグ
     * @return The value of the column 'CASE_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseOutFlg() {
        checkSpecifiedProperty("caseOutFlg");
        return convertEmptyToNull(_caseOutFlg);
    }

    /**
     * [set] CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * ケースピッキングリスト出力フラグ
     * @param caseOutFlg The value of the column 'CASE_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseOutFlg(String caseOutFlg) {
        registerModifiedProperty("caseOutFlg");
        _caseOutFlg = caseOutFlg;
    }

    /**
     * [get] CASE_OUT_USER_ID: {bigint(19), FK to B_USER} <br>
     * ケースピッキングリスト出力者ID
     * @return The value of the column 'CASE_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCaseOutUserId() {
        checkSpecifiedProperty("caseOutUserId");
        return _caseOutUserId;
    }

    /**
     * [set] CASE_OUT_USER_ID: {bigint(19), FK to B_USER} <br>
     * ケースピッキングリスト出力者ID
     * @param caseOutUserId The value of the column 'CASE_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseOutUserId(Long caseOutUserId) {
        registerModifiedProperty("caseOutUserId");
        _caseOutUserId = caseOutUserId;
    }

    /**
     * [get] CASE_OUT_DT: {datetime2(26, 6)} <br>
     * ケースピッキングリスト出力日時
     * @return The value of the column 'CASE_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getCaseOutDt() {
        checkSpecifiedProperty("caseOutDt");
        return _caseOutDt;
    }

    /**
     * [set] CASE_OUT_DT: {datetime2(26, 6)} <br>
     * ケースピッキングリスト出力日時
     * @param caseOutDt The value of the column 'CASE_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseOutDt(java.sql.Timestamp caseOutDt) {
        registerModifiedProperty("caseOutDt");
        _caseOutDt = caseOutDt;
    }

    /**
     * [get] PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 納品明細書出力フラグ
     * @return The value of the column 'PACKING_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingOutFlg() {
        checkSpecifiedProperty("packingOutFlg");
        return convertEmptyToNull(_packingOutFlg);
    }

    /**
     * [set] PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 納品明細書出力フラグ
     * @param packingOutFlg The value of the column 'PACKING_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingOutFlg(String packingOutFlg) {
        registerModifiedProperty("packingOutFlg");
        _packingOutFlg = packingOutFlg;
    }

    /**
     * [get] PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 納品明細書出力者ID
     * @return The value of the column 'PACKING_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPackingOutUserId() {
        checkSpecifiedProperty("packingOutUserId");
        return _packingOutUserId;
    }

    /**
     * [set] PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 納品明細書出力者ID
     * @param packingOutUserId The value of the column 'PACKING_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingOutUserId(Long packingOutUserId) {
        registerModifiedProperty("packingOutUserId");
        _packingOutUserId = packingOutUserId;
    }

    /**
     * [get] PACKING_OUT_DT: {datetime2(26, 6)} <br>
     * 納品明細書出力日時
     * @return The value of the column 'PACKING_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getPackingOutDt() {
        checkSpecifiedProperty("packingOutDt");
        return _packingOutDt;
    }

    /**
     * [set] PACKING_OUT_DT: {datetime2(26, 6)} <br>
     * 納品明細書出力日時
     * @param packingOutDt The value of the column 'PACKING_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingOutDt(java.sql.Timestamp packingOutDt) {
        registerModifiedProperty("packingOutDt");
        _packingOutDt = packingOutDt;
    }

    /**
     * [get] SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 送り状出力フラグ
     * @return The value of the column 'SLIP_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipOutFlg() {
        checkSpecifiedProperty("slipOutFlg");
        return convertEmptyToNull(_slipOutFlg);
    }

    /**
     * [set] SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 送り状出力フラグ
     * @param slipOutFlg The value of the column 'SLIP_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipOutFlg(String slipOutFlg) {
        registerModifiedProperty("slipOutFlg");
        _slipOutFlg = slipOutFlg;
    }

    /**
     * [get] SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 送り状出力者ID
     * @return The value of the column 'SLIP_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSlipOutUserId() {
        checkSpecifiedProperty("slipOutUserId");
        return _slipOutUserId;
    }

    /**
     * [set] SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 送り状出力者ID
     * @param slipOutUserId The value of the column 'SLIP_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipOutUserId(Long slipOutUserId) {
        registerModifiedProperty("slipOutUserId");
        _slipOutUserId = slipOutUserId;
    }

    /**
     * [get] SLIP_OUT_DT: {datetime2(26, 6)} <br>
     * 送り状出力日時
     * @return The value of the column 'SLIP_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getSlipOutDt() {
        checkSpecifiedProperty("slipOutDt");
        return _slipOutDt;
    }

    /**
     * [set] SLIP_OUT_DT: {datetime2(26, 6)} <br>
     * 送り状出力日時
     * @param slipOutDt The value of the column 'SLIP_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipOutDt(java.sql.Timestamp slipOutDt) {
        registerModifiedProperty("slipOutDt");
        _slipOutDt = slipOutDt;
    }

    /**
     * [get] INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ作成フラグ
     * @return The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceCreateFlg() {
        checkSpecifiedProperty("invoiceCreateFlg");
        return convertEmptyToNull(_invoiceCreateFlg);
    }

    /**
     * [set] INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ作成フラグ
     * @param invoiceCreateFlg The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceCreateFlg(String invoiceCreateFlg) {
        registerModifiedProperty("invoiceCreateFlg");
        _invoiceCreateFlg = invoiceCreateFlg;
    }

    /**
     * [get] INVOICE_CREATE_DT: {datetime2(26, 6)} <br>
     * 送り状データ作成日時
     * @return The value of the column 'INVOICE_CREATE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getInvoiceCreateDt() {
        checkSpecifiedProperty("invoiceCreateDt");
        return _invoiceCreateDt;
    }

    /**
     * [set] INVOICE_CREATE_DT: {datetime2(26, 6)} <br>
     * 送り状データ作成日時
     * @param invoiceCreateDt The value of the column 'INVOICE_CREATE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceCreateDt(java.sql.Timestamp invoiceCreateDt) {
        registerModifiedProperty("invoiceCreateDt");
        _invoiceCreateDt = invoiceCreateDt;
    }

    /**
     * [get] INVOICE_ISSUE_NUM: {bigint(19)} <br>
     * 送り状発行枚数
     * @return The value of the column 'INVOICE_ISSUE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInvoiceIssueNum() {
        checkSpecifiedProperty("invoiceIssueNum");
        return _invoiceIssueNum;
    }

    /**
     * [set] INVOICE_ISSUE_NUM: {bigint(19)} <br>
     * 送り状発行枚数
     * @param invoiceIssueNum The value of the column 'INVOICE_ISSUE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceIssueNum(Long invoiceIssueNum) {
        registerModifiedProperty("invoiceIssueNum");
        _invoiceIssueNum = invoiceIssueNum;
    }

    /**
     * [get] SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 出荷実績出力フラグ
     * @return The value of the column 'SHIPPING_RECORD_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingRecordOutFlg() {
        checkSpecifiedProperty("shippingRecordOutFlg");
        return convertEmptyToNull(_shippingRecordOutFlg);
    }

    /**
     * [set] SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 出荷実績出力フラグ
     * @param shippingRecordOutFlg The value of the column 'SHIPPING_RECORD_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingRecordOutFlg(String shippingRecordOutFlg) {
        registerModifiedProperty("shippingRecordOutFlg");
        _shippingRecordOutFlg = shippingRecordOutFlg;
    }

    /**
     * [get] SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 出荷実績出力者ID
     * @return The value of the column 'SHIPPING_RECORD_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingRecordOutUserId() {
        checkSpecifiedProperty("shippingRecordOutUserId");
        return _shippingRecordOutUserId;
    }

    /**
     * [set] SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER} <br>
     * 出荷実績出力者ID
     * @param shippingRecordOutUserId The value of the column 'SHIPPING_RECORD_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingRecordOutUserId(Long shippingRecordOutUserId) {
        registerModifiedProperty("shippingRecordOutUserId");
        _shippingRecordOutUserId = shippingRecordOutUserId;
    }

    /**
     * [get] SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)} <br>
     * 出荷実績出力日時
     * @return The value of the column 'SHIPPING_RECORD_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getShippingRecordOutDt() {
        checkSpecifiedProperty("shippingRecordOutDt");
        return _shippingRecordOutDt;
    }

    /**
     * [set] SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)} <br>
     * 出荷実績出力日時
     * @param shippingRecordOutDt The value of the column 'SHIPPING_RECORD_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingRecordOutDt(java.sql.Timestamp shippingRecordOutDt) {
        registerModifiedProperty("shippingRecordOutDt");
        _shippingRecordOutDt = shippingRecordOutDt;
    }

    /**
     * [get] BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * @return The value of the column 'BOL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getBolOutFlg() {
        checkSpecifiedProperty("bolOutFlg");
        return convertEmptyToNull(_bolOutFlg);
    }

    /**
     * [set] BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * @param bolOutFlg The value of the column 'BOL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBolOutFlg(String bolOutFlg) {
        registerModifiedProperty("bolOutFlg");
        _bolOutFlg = bolOutFlg;
    }

    /**
     * [get] BOL_OUT_USER_ID: {bigint(19)} <br>
     * Bill of Lading出力者ID
     * @return The value of the column 'BOL_OUT_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBolOutUserId() {
        checkSpecifiedProperty("bolOutUserId");
        return _bolOutUserId;
    }

    /**
     * [set] BOL_OUT_USER_ID: {bigint(19)} <br>
     * Bill of Lading出力者ID
     * @param bolOutUserId The value of the column 'BOL_OUT_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBolOutUserId(Long bolOutUserId) {
        registerModifiedProperty("bolOutUserId");
        _bolOutUserId = bolOutUserId;
    }

    /**
     * [get] BOL_OUT_DT: {datetime2(26, 6)} <br>
     * Bill of Lading出力日時
     * @return The value of the column 'BOL_OUT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getBolOutDt() {
        checkSpecifiedProperty("bolOutDt");
        return _bolOutDt;
    }

    /**
     * [set] BOL_OUT_DT: {datetime2(26, 6)} <br>
     * Bill of Lading出力日時
     * @param bolOutDt The value of the column 'BOL_OUT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBolOutDt(java.sql.Timestamp bolOutDt) {
        registerModifiedProperty("bolOutDt");
        _bolOutDt = bolOutDt;
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
