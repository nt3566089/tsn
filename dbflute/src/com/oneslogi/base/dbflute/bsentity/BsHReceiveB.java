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
 * The entity of H_RECEIVE_B as TABLE. <br>
 * 入荷ボディ履歴
 * <pre>
 * [primary-key]
 *     STORE_RECORD_B_ID
 *
 * [column]
 *     STORE_RECORD_B_ID, STORE_RECORD_H_ID, STOCK_ID, PLAN_NUM, PROCESS_NO, STORE_DT, STORE_NUM, STORE_FLG, STORE_LOCATION_ID, STORE_LOCATION_CD, STORE_LOCATION_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     H_STOCK, H_RECEIVE_H, B_CLASS_DTL(ByStoreFlg), H_RECEIVE_SPARE(AsOne)
 *
 * [referrer table]
 *     H_RECEIVE_SPARE
 *
 * [foreign property]
 *     hStock, hReceiveH, bClassDtlByStoreFlg, hReceiveSpareAsOne
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long storeRecordBId = entity.getStoreRecordBId();
 * Long storeRecordHId = entity.getStoreRecordHId();
 * Long stockId = entity.getStockId();
 * java.math.BigDecimal planNum = entity.getPlanNum();
 * String processNo = entity.getProcessNo();
 * String storeDt = entity.getStoreDt();
 * java.math.BigDecimal storeNum = entity.getStoreNum();
 * String storeFlg = entity.getStoreFlg();
 * Long storeLocationId = entity.getStoreLocationId();
 * String storeLocationCd = entity.getStoreLocationCd();
 * String storeLocationNm = entity.getStoreLocationNm();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setStoreRecordBId(storeRecordBId);
 * entity.setStoreRecordHId(storeRecordHId);
 * entity.setStockId(stockId);
 * entity.setPlanNum(planNum);
 * entity.setProcessNo(processNo);
 * entity.setStoreDt(storeDt);
 * entity.setStoreNum(storeNum);
 * entity.setStoreFlg(storeFlg);
 * entity.setStoreLocationId(storeLocationId);
 * entity.setStoreLocationCd(storeLocationCd);
 * entity.setStoreLocationNm(storeLocationNm);
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
public abstract class BsHReceiveB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _storeRecordBId;

    /** STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H} */
    protected Long _storeRecordHId;

    /** STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK} */
    protected Long _stockId;

    /** PLAN_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _planNum;

    /** PROCESS_NO: {varchar(30)} */
    protected String _processNo;

    /** STORE_DT: {IX, varchar(8)} */
    protected String _storeDt;

    /** STORE_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _storeNum;

    /** STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg} */
    protected String _storeFlg;

    /** STORE_LOCATION_ID: {bigint(19)} */
    protected Long _storeLocationId;

    /** STORE_LOCATION_CD: {varchar(30)} */
    protected String _storeLocationCd;

    /** STORE_LOCATION_NM: {varchar(60)} */
    protected String _storeLocationNm;

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
        return "H_RECEIVE_B";
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
        if (_storeRecordBId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of storeFlg as the classification of StoreFlg. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 格納フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StoreFlg getStoreFlgAsStoreFlg() {
        return CDef.StoreFlg.codeOf(getStoreFlg());
    }

    /**
     * Set the value of storeFlg as the classification of StoreFlg. <br>
     * STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 格納フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStoreFlgAsStoreFlg(CDef.StoreFlg cdef) {
        setStoreFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of storeFlg as $0 (0). <br>
     * $0: 未格納
     */
    public void setStoreFlg_$0() {
        setStoreFlgAsStoreFlg(CDef.StoreFlg.$0);
    }

    /**
     * Set the value of storeFlg as $1 (1). <br>
     * $1: 格納
     */
    public void setStoreFlg_$1() {
        setStoreFlgAsStoreFlg(CDef.StoreFlg.$1);
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
     * Is the value of storeFlg $0? <br>
     * $0: 未格納
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStoreFlg$0() {
        CDef.StoreFlg cdef = getStoreFlgAsStoreFlg();
        return cdef != null ? cdef.equals(CDef.StoreFlg.$0) : false;
    }

    /**
     * Is the value of storeFlg $1? <br>
     * $1: 格納
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStoreFlg$1() {
        CDef.StoreFlg cdef = getStoreFlgAsStoreFlg();
        return cdef != null ? cdef.equals(CDef.StoreFlg.$1) : false;
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
     * Get the value of the column 'storeFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStoreFlgName() {
        CDef.StoreFlg cdef = getStoreFlgAsStoreFlg();
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
    /** H_STOCK by my STOCK_ID, named 'HStock'. */
    protected HStock _hStock;

    /**
     * [get] H_STOCK by my STOCK_ID, named 'HStock'. <br>
     * @return The entity of foreign property 'HStock'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public HStock getHStock() {
        return _hStock;
    }

    /**
     * [set] H_STOCK by my STOCK_ID, named 'HStock'.
     * @param hStock The entity of foreign property 'HStock'. (NullAllowed)
     */
    public void setHStock(HStock hStock) {
        _hStock = hStock;
    }

    /** H_RECEIVE_H by my STORE_RECORD_H_ID, named 'HReceiveH'. */
    protected HReceiveH _hReceiveH;

    /**
     * [get] H_RECEIVE_H by my STORE_RECORD_H_ID, named 'HReceiveH'. <br>
     * @return The entity of foreign property 'HReceiveH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public HReceiveH getHReceiveH() {
        return _hReceiveH;
    }

    /**
     * [set] H_RECEIVE_H by my STORE_RECORD_H_ID, named 'HReceiveH'.
     * @param hReceiveH The entity of foreign property 'HReceiveH'. (NullAllowed)
     */
    public void setHReceiveH(HReceiveH hReceiveH) {
        _hReceiveH = hReceiveH;
    }

    /** B_CLASS_DTL by my STORE_FLG, named 'BClassDtlByStoreFlg'. */
    protected BClassDtl _bClassDtlByStoreFlg;

    /**
     * [get] B_CLASS_DTL by my STORE_FLG, named 'BClassDtlByStoreFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStoreFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStoreFlg() {
        return _bClassDtlByStoreFlg;
    }

    /**
     * [set] B_CLASS_DTL by my STORE_FLG, named 'BClassDtlByStoreFlg'.
     * @param bClassDtlByStoreFlg The entity of foreign property 'BClassDtlByStoreFlg'. (NullAllowed)
     */
    public void setBClassDtlByStoreFlg(BClassDtl bClassDtlByStoreFlg) {
        _bClassDtlByStoreFlg = bClassDtlByStoreFlg;
    }

    /** H_RECEIVE_SPARE by STORE_RECORD_B_ID, named 'HReceiveSpareAsOne'. */
    protected HReceiveSpare _hReceiveSpareAsOne;

    /**
     * [get] H_RECEIVE_SPARE by STORE_RECORD_B_ID, named 'HReceiveSpareAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'HReceiveSpareAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public HReceiveSpare getHReceiveSpareAsOne() {
        return _hReceiveSpareAsOne;
    }

    /**
     * [set] H_RECEIVE_SPARE by STORE_RECORD_B_ID, named 'HReceiveSpareAsOne'.
     * @param HReceiveSpareAsOne The entity of foreign property(referrer-as-one) 'HReceiveSpareAsOne'. (NullAllowed)
     */
    public void setHReceiveSpareAsOne(HReceiveSpare HReceiveSpareAsOne) {
        _hReceiveSpareAsOne = HReceiveSpareAsOne;
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
        if (obj instanceof BsHReceiveB) {
            BsHReceiveB other = (BsHReceiveB)obj;
            if (!xSV(_storeRecordBId, other._storeRecordBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _storeRecordBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_hStock != null)
        { sb.append(li).append(xbRDS(_hStock, "hStock")); }
        if (_hReceiveH != null)
        { sb.append(li).append(xbRDS(_hReceiveH, "hReceiveH")); }
        if (_bClassDtlByStoreFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStoreFlg, "bClassDtlByStoreFlg")); }
        if (_hReceiveSpareAsOne != null)
        { sb.append(li).append(xbRDS(_hReceiveSpareAsOne, "hReceiveSpareAsOne")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_storeRecordBId));
        sb.append(dm).append(xfND(_storeRecordHId));
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_planNum));
        sb.append(dm).append(xfND(_processNo));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_storeNum));
        sb.append(dm).append(xfND(_storeFlg));
        sb.append(dm).append(xfND(_storeLocationId));
        sb.append(dm).append(xfND(_storeLocationCd));
        sb.append(dm).append(xfND(_storeLocationNm));
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
        if (_hStock != null)
        { sb.append(dm).append("hStock"); }
        if (_hReceiveH != null)
        { sb.append(dm).append("hReceiveH"); }
        if (_bClassDtlByStoreFlg != null)
        { sb.append(dm).append("bClassDtlByStoreFlg"); }
        if (_hReceiveSpareAsOne != null)
        { sb.append(dm).append("hReceiveSpareAsOne"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public HReceiveB clone() {
        return (HReceiveB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫実績ボディID
     * @return The value of the column 'STORE_RECORD_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStoreRecordBId() {
        checkSpecifiedProperty("storeRecordBId");
        return _storeRecordBId;
    }

    /**
     * [set] STORE_RECORD_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫実績ボディID
     * @param storeRecordBId The value of the column 'STORE_RECORD_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStoreRecordBId(Long storeRecordBId) {
        registerModifiedProperty("storeRecordBId");
        _storeRecordBId = storeRecordBId;
    }

    /**
     * [get] STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H} <br>
     * 入庫実績ヘッダID
     * @return The value of the column 'STORE_RECORD_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStoreRecordHId() {
        checkSpecifiedProperty("storeRecordHId");
        return _storeRecordHId;
    }

    /**
     * [set] STORE_RECORD_H_ID: {IX, NotNull, bigint(19), FK to H_RECEIVE_H} <br>
     * 入庫実績ヘッダID
     * @param storeRecordHId The value of the column 'STORE_RECORD_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStoreRecordHId(Long storeRecordHId) {
        registerModifiedProperty("storeRecordHId");
        _storeRecordHId = storeRecordHId;
    }

    /**
     * [get] STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockId() {
        checkSpecifiedProperty("stockId");
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {IX, NotNull, bigint(19), FK to H_STOCK} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockId(Long stockId) {
        registerModifiedProperty("stockId");
        _stockId = stockId;
    }

    /**
     * [get] PLAN_NUM: {decimal(16, 6)} <br>
     * 予定数
     * @return The value of the column 'PLAN_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPlanNum() {
        checkSpecifiedProperty("planNum");
        return _planNum;
    }

    /**
     * [set] PLAN_NUM: {decimal(16, 6)} <br>
     * 予定数
     * @param planNum The value of the column 'PLAN_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanNum(java.math.BigDecimal planNum) {
        registerModifiedProperty("planNum");
        _planNum = planNum;
    }

    /**
     * [get] PROCESS_NO: {varchar(30)} <br>
     * 処理No.
     * @return The value of the column 'PROCESS_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessNo() {
        checkSpecifiedProperty("processNo");
        return convertEmptyToNull(_processNo);
    }

    /**
     * [set] PROCESS_NO: {varchar(30)} <br>
     * 処理No.
     * @param processNo The value of the column 'PROCESS_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessNo(String processNo) {
        registerModifiedProperty("processNo");
        _processNo = processNo;
    }

    /**
     * [get] STORE_DT: {IX, varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'STORE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreDt() {
        checkSpecifiedProperty("storeDt");
        return convertEmptyToNull(_storeDt);
    }

    /**
     * [set] STORE_DT: {IX, varchar(8)} <br>
     * 入庫日
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreDt(String storeDt) {
        registerModifiedProperty("storeDt");
        _storeDt = storeDt;
    }

    /**
     * [get] STORE_NUM: {decimal(16, 6)} <br>
     * 入庫数
     * @return The value of the column 'STORE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getStoreNum() {
        checkSpecifiedProperty("storeNum");
        return _storeNum;
    }

    /**
     * [set] STORE_NUM: {decimal(16, 6)} <br>
     * 入庫数
     * @param storeNum The value of the column 'STORE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreNum(java.math.BigDecimal storeNum) {
        registerModifiedProperty("storeNum");
        _storeNum = storeNum;
    }

    /**
     * [get] STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 入庫格納フラグ
     * @return The value of the column 'STORE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreFlg() {
        checkSpecifiedProperty("storeFlg");
        return convertEmptyToNull(_storeFlg);
    }

    /**
     * [set] STORE_FLG: {char(1), FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 入庫格納フラグ
     * @param storeFlg The value of the column 'STORE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreFlg(String storeFlg) {
        registerModifiedProperty("storeFlg");
        _storeFlg = storeFlg;
    }

    /**
     * [get] STORE_LOCATION_ID: {bigint(19)} <br>
     * 入庫格納ロケーションID
     * @return The value of the column 'STORE_LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStoreLocationId() {
        checkSpecifiedProperty("storeLocationId");
        return _storeLocationId;
    }

    /**
     * [set] STORE_LOCATION_ID: {bigint(19)} <br>
     * 入庫格納ロケーションID
     * @param storeLocationId The value of the column 'STORE_LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreLocationId(Long storeLocationId) {
        registerModifiedProperty("storeLocationId");
        _storeLocationId = storeLocationId;
    }

    /**
     * [get] STORE_LOCATION_CD: {varchar(30)} <br>
     * 入庫格納ロケーションCD
     * @return The value of the column 'STORE_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreLocationCd() {
        checkSpecifiedProperty("storeLocationCd");
        return convertEmptyToNull(_storeLocationCd);
    }

    /**
     * [set] STORE_LOCATION_CD: {varchar(30)} <br>
     * 入庫格納ロケーションCD
     * @param storeLocationCd The value of the column 'STORE_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreLocationCd(String storeLocationCd) {
        registerModifiedProperty("storeLocationCd");
        _storeLocationCd = storeLocationCd;
    }

    /**
     * [get] STORE_LOCATION_NM: {varchar(60)} <br>
     * 入庫格納ロケーション名称
     * @return The value of the column 'STORE_LOCATION_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreLocationNm() {
        checkSpecifiedProperty("storeLocationNm");
        return convertEmptyToNull(_storeLocationNm);
    }

    /**
     * [set] STORE_LOCATION_NM: {varchar(60)} <br>
     * 入庫格納ロケーション名称
     * @param storeLocationNm The value of the column 'STORE_LOCATION_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreLocationNm(String storeLocationNm) {
        registerModifiedProperty("storeLocationNm");
        _storeLocationNm = storeLocationNm;
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
