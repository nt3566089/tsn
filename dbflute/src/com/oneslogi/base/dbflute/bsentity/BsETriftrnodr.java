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
 * The entity of E_TRIFTRNODR as TABLE. <br>
 * IF振替指示
 * <pre>
 * [primary-key]
 *     IFDATAKEY
 *
 * [column]
 *     IFDATAKEY, SEGNAME, REFNO, NEXUSPKEY, ORDERNO, ORDERTYPE, CUSTORDERNO, TRANTYPE, RMANO, TRANSDETAILTYPE, SCHDATE, SCHTIME, ACTUALDATE, ACTUALTIME, WAREHOUSECD, FROMCOMPANYCD, FROMOWNERCD, TOCOMPANYCD, TOOWNERCD, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, PRIORITY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * java.math.BigDecimal ifdatakey = entity.getIfdatakey();
 * String segname = entity.getSegname();
 * String refno = entity.getRefno();
 * String nexuspkey = entity.getNexuspkey();
 * String orderno = entity.getOrderno();
 * String ordertype = entity.getOrdertype();
 * String custorderno = entity.getCustorderno();
 * String trantype = entity.getTrantype();
 * String rmano = entity.getRmano();
 * String transdetailtype = entity.getTransdetailtype();
 * String schdate = entity.getSchdate();
 * String schtime = entity.getSchtime();
 * String actualdate = entity.getActualdate();
 * String actualtime = entity.getActualtime();
 * String warehousecd = entity.getWarehousecd();
 * String fromcompanycd = entity.getFromcompanycd();
 * String fromownercd = entity.getFromownercd();
 * String tocompanycd = entity.getTocompanycd();
 * String toownercd = entity.getToownercd();
 * String notes = entity.getNotes();
 * String otherrefno1 = entity.getOtherrefno1();
 * String otherrefno2 = entity.getOtherrefno2();
 * String otherrefno3 = entity.getOtherrefno3();
 * String priority = entity.getPriority();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setIfdatakey(ifdatakey);
 * entity.setSegname(segname);
 * entity.setRefno(refno);
 * entity.setNexuspkey(nexuspkey);
 * entity.setOrderno(orderno);
 * entity.setOrdertype(ordertype);
 * entity.setCustorderno(custorderno);
 * entity.setTrantype(trantype);
 * entity.setRmano(rmano);
 * entity.setTransdetailtype(transdetailtype);
 * entity.setSchdate(schdate);
 * entity.setSchtime(schtime);
 * entity.setActualdate(actualdate);
 * entity.setActualtime(actualtime);
 * entity.setWarehousecd(warehousecd);
 * entity.setFromcompanycd(fromcompanycd);
 * entity.setFromownercd(fromownercd);
 * entity.setTocompanycd(tocompanycd);
 * entity.setToownercd(toownercd);
 * entity.setNotes(notes);
 * entity.setOtherrefno1(otherrefno1);
 * entity.setOtherrefno2(otherrefno2);
 * entity.setOtherrefno3(otherrefno3);
 * entity.setPriority(priority);
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
public abstract class BsETriftrnodr extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** IFDATAKEY: {PK, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _ifdatakey;

    /** SEGNAME: {NotNull, varchar(30)} */
    protected String _segname;

    /** REFNO: {NotNull, varchar(60)} */
    protected String _refno;

    /** NEXUSPKEY: {NotNull, varchar(30)} */
    protected String _nexuspkey;

    /** ORDERNO: {NotNull, varchar(30)} */
    protected String _orderno;

    /** ORDERTYPE: {NotNull, varchar(30)} */
    protected String _ordertype;

    /** CUSTORDERNO: {NotNull, varchar(30)} */
    protected String _custorderno;

    /** TRANTYPE: {NotNull, varchar(30)} */
    protected String _trantype;

    /** RMANO: {NotNull, varchar(30)} */
    protected String _rmano;

    /** TRANSDETAILTYPE: {NotNull, varchar(30)} */
    protected String _transdetailtype;

    /** SCHDATE: {NotNull, varchar(30)} */
    protected String _schdate;

    /** SCHTIME: {NotNull, varchar(30)} */
    protected String _schtime;

    /** ACTUALDATE: {NotNull, varchar(30)} */
    protected String _actualdate;

    /** ACTUALTIME: {NotNull, varchar(30)} */
    protected String _actualtime;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    protected String _warehousecd;

    /** FROMCOMPANYCD: {NotNull, varchar(30)} */
    protected String _fromcompanycd;

    /** FROMOWNERCD: {NotNull, varchar(30)} */
    protected String _fromownercd;

    /** TOCOMPANYCD: {NotNull, varchar(30)} */
    protected String _tocompanycd;

    /** TOOWNERCD: {NotNull, varchar(30)} */
    protected String _toownercd;

    /** NOTES: {NotNull, varchar(4000)} */
    protected String _notes;

    /** OTHERREFNO1: {NotNull, varchar(60)} */
    protected String _otherrefno1;

    /** OTHERREFNO2: {NotNull, varchar(60)} */
    protected String _otherrefno2;

    /** OTHERREFNO3: {NotNull, varchar(60)} */
    protected String _otherrefno3;

    /** PRIORITY: {NotNull, varchar(30)} */
    protected String _priority;

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
        return "E_TRIFTRNODR";
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
        if (_ifdatakey == null) { return false; }
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
        if (obj instanceof BsETriftrnodr) {
            BsETriftrnodr other = (BsETriftrnodr)obj;
            if (!xSV(_ifdatakey, other._ifdatakey)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _ifdatakey);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_ifdatakey));
        sb.append(dm).append(xfND(_segname));
        sb.append(dm).append(xfND(_refno));
        sb.append(dm).append(xfND(_nexuspkey));
        sb.append(dm).append(xfND(_orderno));
        sb.append(dm).append(xfND(_ordertype));
        sb.append(dm).append(xfND(_custorderno));
        sb.append(dm).append(xfND(_trantype));
        sb.append(dm).append(xfND(_rmano));
        sb.append(dm).append(xfND(_transdetailtype));
        sb.append(dm).append(xfND(_schdate));
        sb.append(dm).append(xfND(_schtime));
        sb.append(dm).append(xfND(_actualdate));
        sb.append(dm).append(xfND(_actualtime));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_fromcompanycd));
        sb.append(dm).append(xfND(_fromownercd));
        sb.append(dm).append(xfND(_tocompanycd));
        sb.append(dm).append(xfND(_toownercd));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_otherrefno1));
        sb.append(dm).append(xfND(_otherrefno2));
        sb.append(dm).append(xfND(_otherrefno3));
        sb.append(dm).append(xfND(_priority));
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
    public ETriftrnodr clone() {
        return (ETriftrnodr)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] IFDATAKEY: {PK, NotNull, decimal(16, 6)} <br>
     * ＩＦデータキー
     * @return The value of the column 'IFDATAKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getIfdatakey() {
        checkSpecifiedProperty("ifdatakey");
        return _ifdatakey;
    }

    /**
     * [set] IFDATAKEY: {PK, NotNull, decimal(16, 6)} <br>
     * ＩＦデータキー
     * @param ifdatakey The value of the column 'IFDATAKEY'. (basically NotNull if update: for the constraint)
     */
    public void setIfdatakey(java.math.BigDecimal ifdatakey) {
        registerModifiedProperty("ifdatakey");
        _ifdatakey = ifdatakey;
    }

    /**
     * [get] SEGNAME: {NotNull, varchar(30)} <br>
     * セグメント名
     * @return The value of the column 'SEGNAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSegname() {
        checkSpecifiedProperty("segname");
        return convertEmptyToNull(_segname);
    }

    /**
     * [set] SEGNAME: {NotNull, varchar(30)} <br>
     * セグメント名
     * @param segname The value of the column 'SEGNAME'. (basically NotNull if update: for the constraint)
     */
    public void setSegname(String segname) {
        registerModifiedProperty("segname");
        _segname = segname;
    }

    /**
     * [get] REFNO: {NotNull, varchar(60)} <br>
     * 相手伝票番号
     * @return The value of the column 'REFNO'. (basically NotNull if selected: for the constraint)
     */
    public String getRefno() {
        checkSpecifiedProperty("refno");
        return convertEmptyToNull(_refno);
    }

    /**
     * [set] REFNO: {NotNull, varchar(60)} <br>
     * 相手伝票番号
     * @param refno The value of the column 'REFNO'. (basically NotNull if update: for the constraint)
     */
    public void setRefno(String refno) {
        registerModifiedProperty("refno");
        _refno = refno;
    }

    /**
     * [get] NEXUSPKEY: {NotNull, varchar(30)} <br>
     * NexusPKey
     * @return The value of the column 'NEXUSPKEY'. (basically NotNull if selected: for the constraint)
     */
    public String getNexuspkey() {
        checkSpecifiedProperty("nexuspkey");
        return convertEmptyToNull(_nexuspkey);
    }

    /**
     * [set] NEXUSPKEY: {NotNull, varchar(30)} <br>
     * NexusPKey
     * @param nexuspkey The value of the column 'NEXUSPKEY'. (basically NotNull if update: for the constraint)
     */
    public void setNexuspkey(String nexuspkey) {
        registerModifiedProperty("nexuspkey");
        _nexuspkey = nexuspkey;
    }

    /**
     * [get] ORDERNO: {NotNull, varchar(30)} <br>
     * 相手受注番号
     * @return The value of the column 'ORDERNO'. (basically NotNull if selected: for the constraint)
     */
    public String getOrderno() {
        checkSpecifiedProperty("orderno");
        return convertEmptyToNull(_orderno);
    }

    /**
     * [set] ORDERNO: {NotNull, varchar(30)} <br>
     * 相手受注番号
     * @param orderno The value of the column 'ORDERNO'. (basically NotNull if update: for the constraint)
     */
    public void setOrderno(String orderno) {
        registerModifiedProperty("orderno");
        _orderno = orderno;
    }

    /**
     * [get] ORDERTYPE: {NotNull, varchar(30)} <br>
     * 相手受注タイプ
     * @return The value of the column 'ORDERTYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getOrdertype() {
        checkSpecifiedProperty("ordertype");
        return convertEmptyToNull(_ordertype);
    }

    /**
     * [set] ORDERTYPE: {NotNull, varchar(30)} <br>
     * 相手受注タイプ
     * @param ordertype The value of the column 'ORDERTYPE'. (basically NotNull if update: for the constraint)
     */
    public void setOrdertype(String ordertype) {
        registerModifiedProperty("ordertype");
        _ordertype = ordertype;
    }

    /**
     * [get] CUSTORDERNO: {NotNull, varchar(30)} <br>
     * 顧客オーダ番号
     * @return The value of the column 'CUSTORDERNO'. (basically NotNull if selected: for the constraint)
     */
    public String getCustorderno() {
        checkSpecifiedProperty("custorderno");
        return convertEmptyToNull(_custorderno);
    }

    /**
     * [set] CUSTORDERNO: {NotNull, varchar(30)} <br>
     * 顧客オーダ番号
     * @param custorderno The value of the column 'CUSTORDERNO'. (basically NotNull if update: for the constraint)
     */
    public void setCustorderno(String custorderno) {
        registerModifiedProperty("custorderno");
        _custorderno = custorderno;
    }

    /**
     * [get] TRANTYPE: {NotNull, varchar(30)} <br>
     * 振替タイプ
     * @return The value of the column 'TRANTYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getTrantype() {
        checkSpecifiedProperty("trantype");
        return convertEmptyToNull(_trantype);
    }

    /**
     * [set] TRANTYPE: {NotNull, varchar(30)} <br>
     * 振替タイプ
     * @param trantype The value of the column 'TRANTYPE'. (basically NotNull if update: for the constraint)
     */
    public void setTrantype(String trantype) {
        registerModifiedProperty("trantype");
        _trantype = trantype;
    }

    /**
     * [get] RMANO: {NotNull, varchar(30)} <br>
     * RMANo
     * @return The value of the column 'RMANO'. (basically NotNull if selected: for the constraint)
     */
    public String getRmano() {
        checkSpecifiedProperty("rmano");
        return convertEmptyToNull(_rmano);
    }

    /**
     * [set] RMANO: {NotNull, varchar(30)} <br>
     * RMANo
     * @param rmano The value of the column 'RMANO'. (basically NotNull if update: for the constraint)
     */
    public void setRmano(String rmano) {
        registerModifiedProperty("rmano");
        _rmano = rmano;
    }

    /**
     * [get] TRANSDETAILTYPE: {NotNull, varchar(30)} <br>
     * 振替明細タイプ
     * @return The value of the column 'TRANSDETAILTYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getTransdetailtype() {
        checkSpecifiedProperty("transdetailtype");
        return convertEmptyToNull(_transdetailtype);
    }

    /**
     * [set] TRANSDETAILTYPE: {NotNull, varchar(30)} <br>
     * 振替明細タイプ
     * @param transdetailtype The value of the column 'TRANSDETAILTYPE'. (basically NotNull if update: for the constraint)
     */
    public void setTransdetailtype(String transdetailtype) {
        registerModifiedProperty("transdetailtype");
        _transdetailtype = transdetailtype;
    }

    /**
     * [get] SCHDATE: {NotNull, varchar(30)} <br>
     * 予定日
     * @return The value of the column 'SCHDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getSchdate() {
        checkSpecifiedProperty("schdate");
        return convertEmptyToNull(_schdate);
    }

    /**
     * [set] SCHDATE: {NotNull, varchar(30)} <br>
     * 予定日
     * @param schdate The value of the column 'SCHDATE'. (basically NotNull if update: for the constraint)
     */
    public void setSchdate(String schdate) {
        registerModifiedProperty("schdate");
        _schdate = schdate;
    }

    /**
     * [get] SCHTIME: {NotNull, varchar(30)} <br>
     * 予定時刻
     * @return The value of the column 'SCHTIME'. (basically NotNull if selected: for the constraint)
     */
    public String getSchtime() {
        checkSpecifiedProperty("schtime");
        return convertEmptyToNull(_schtime);
    }

    /**
     * [set] SCHTIME: {NotNull, varchar(30)} <br>
     * 予定時刻
     * @param schtime The value of the column 'SCHTIME'. (basically NotNull if update: for the constraint)
     */
    public void setSchtime(String schtime) {
        registerModifiedProperty("schtime");
        _schtime = schtime;
    }

    /**
     * [get] ACTUALDATE: {NotNull, varchar(30)} <br>
     * 実績日
     * @return The value of the column 'ACTUALDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getActualdate() {
        checkSpecifiedProperty("actualdate");
        return convertEmptyToNull(_actualdate);
    }

    /**
     * [set] ACTUALDATE: {NotNull, varchar(30)} <br>
     * 実績日
     * @param actualdate The value of the column 'ACTUALDATE'. (basically NotNull if update: for the constraint)
     */
    public void setActualdate(String actualdate) {
        registerModifiedProperty("actualdate");
        _actualdate = actualdate;
    }

    /**
     * [get] ACTUALTIME: {NotNull, varchar(30)} <br>
     * 実績時刻
     * @return The value of the column 'ACTUALTIME'. (basically NotNull if selected: for the constraint)
     */
    public String getActualtime() {
        checkSpecifiedProperty("actualtime");
        return convertEmptyToNull(_actualtime);
    }

    /**
     * [set] ACTUALTIME: {NotNull, varchar(30)} <br>
     * 実績時刻
     * @param actualtime The value of the column 'ACTUALTIME'. (basically NotNull if update: for the constraint)
     */
    public void setActualtime(String actualtime) {
        registerModifiedProperty("actualtime");
        _actualtime = actualtime;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSECD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 倉庫CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] FROMCOMPANYCD: {NotNull, varchar(30)} <br>
     * 振出代理店CD
     * @return The value of the column 'FROMCOMPANYCD'. (basically NotNull if selected: for the constraint)
     */
    public String getFromcompanycd() {
        checkSpecifiedProperty("fromcompanycd");
        return convertEmptyToNull(_fromcompanycd);
    }

    /**
     * [set] FROMCOMPANYCD: {NotNull, varchar(30)} <br>
     * 振出代理店CD
     * @param fromcompanycd The value of the column 'FROMCOMPANYCD'. (basically NotNull if update: for the constraint)
     */
    public void setFromcompanycd(String fromcompanycd) {
        registerModifiedProperty("fromcompanycd");
        _fromcompanycd = fromcompanycd;
    }

    /**
     * [get] FROMOWNERCD: {NotNull, varchar(30)} <br>
     * 振出荷主CD
     * @return The value of the column 'FROMOWNERCD'. (basically NotNull if selected: for the constraint)
     */
    public String getFromownercd() {
        checkSpecifiedProperty("fromownercd");
        return convertEmptyToNull(_fromownercd);
    }

    /**
     * [set] FROMOWNERCD: {NotNull, varchar(30)} <br>
     * 振出荷主CD
     * @param fromownercd The value of the column 'FROMOWNERCD'. (basically NotNull if update: for the constraint)
     */
    public void setFromownercd(String fromownercd) {
        registerModifiedProperty("fromownercd");
        _fromownercd = fromownercd;
    }

    /**
     * [get] TOCOMPANYCD: {NotNull, varchar(30)} <br>
     * 振入代理店CD
     * @return The value of the column 'TOCOMPANYCD'. (basically NotNull if selected: for the constraint)
     */
    public String getTocompanycd() {
        checkSpecifiedProperty("tocompanycd");
        return convertEmptyToNull(_tocompanycd);
    }

    /**
     * [set] TOCOMPANYCD: {NotNull, varchar(30)} <br>
     * 振入代理店CD
     * @param tocompanycd The value of the column 'TOCOMPANYCD'. (basically NotNull if update: for the constraint)
     */
    public void setTocompanycd(String tocompanycd) {
        registerModifiedProperty("tocompanycd");
        _tocompanycd = tocompanycd;
    }

    /**
     * [get] TOOWNERCD: {NotNull, varchar(30)} <br>
     * 振入荷主CD
     * @return The value of the column 'TOOWNERCD'. (basically NotNull if selected: for the constraint)
     */
    public String getToownercd() {
        checkSpecifiedProperty("toownercd");
        return convertEmptyToNull(_toownercd);
    }

    /**
     * [set] TOOWNERCD: {NotNull, varchar(30)} <br>
     * 振入荷主CD
     * @param toownercd The value of the column 'TOOWNERCD'. (basically NotNull if update: for the constraint)
     */
    public void setToownercd(String toownercd) {
        registerModifiedProperty("toownercd");
        _toownercd = toownercd;
    }

    /**
     * [get] NOTES: {NotNull, varchar(4000)} <br>
     * 備考
     * @return The value of the column 'NOTES'. (basically NotNull if selected: for the constraint)
     */
    public String getNotes() {
        checkSpecifiedProperty("notes");
        return convertEmptyToNull(_notes);
    }

    /**
     * [set] NOTES: {NotNull, varchar(4000)} <br>
     * 備考
     * @param notes The value of the column 'NOTES'. (basically NotNull if update: for the constraint)
     */
    public void setNotes(String notes) {
        registerModifiedProperty("notes");
        _notes = notes;
    }

    /**
     * [get] OTHERREFNO1: {NotNull, varchar(60)} <br>
     * 他照会番号1
     * @return The value of the column 'OTHERREFNO1'. (basically NotNull if selected: for the constraint)
     */
    public String getOtherrefno1() {
        checkSpecifiedProperty("otherrefno1");
        return convertEmptyToNull(_otherrefno1);
    }

    /**
     * [set] OTHERREFNO1: {NotNull, varchar(60)} <br>
     * 他照会番号1
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (basically NotNull if update: for the constraint)
     */
    public void setOtherrefno1(String otherrefno1) {
        registerModifiedProperty("otherrefno1");
        _otherrefno1 = otherrefno1;
    }

    /**
     * [get] OTHERREFNO2: {NotNull, varchar(60)} <br>
     * 他照会番号2
     * @return The value of the column 'OTHERREFNO2'. (basically NotNull if selected: for the constraint)
     */
    public String getOtherrefno2() {
        checkSpecifiedProperty("otherrefno2");
        return convertEmptyToNull(_otherrefno2);
    }

    /**
     * [set] OTHERREFNO2: {NotNull, varchar(60)} <br>
     * 他照会番号2
     * @param otherrefno2 The value of the column 'OTHERREFNO2'. (basically NotNull if update: for the constraint)
     */
    public void setOtherrefno2(String otherrefno2) {
        registerModifiedProperty("otherrefno2");
        _otherrefno2 = otherrefno2;
    }

    /**
     * [get] OTHERREFNO3: {NotNull, varchar(60)} <br>
     * 他照会番号3
     * @return The value of the column 'OTHERREFNO3'. (basically NotNull if selected: for the constraint)
     */
    public String getOtherrefno3() {
        checkSpecifiedProperty("otherrefno3");
        return convertEmptyToNull(_otherrefno3);
    }

    /**
     * [set] OTHERREFNO3: {NotNull, varchar(60)} <br>
     * 他照会番号3
     * @param otherrefno3 The value of the column 'OTHERREFNO3'. (basically NotNull if update: for the constraint)
     */
    public void setOtherrefno3(String otherrefno3) {
        registerModifiedProperty("otherrefno3");
        _otherrefno3 = otherrefno3;
    }

    /**
     * [get] PRIORITY: {NotNull, varchar(30)} <br>
     * 優先順位
     * @return The value of the column 'PRIORITY'. (basically NotNull if selected: for the constraint)
     */
    public String getPriority() {
        checkSpecifiedProperty("priority");
        return convertEmptyToNull(_priority);
    }

    /**
     * [set] PRIORITY: {NotNull, varchar(30)} <br>
     * 優先順位
     * @param priority The value of the column 'PRIORITY'. (basically NotNull if update: for the constraint)
     */
    public void setPriority(String priority) {
        registerModifiedProperty("priority");
        _priority = priority;
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
