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
 * The entity of W_WKSORTSUB as TABLE. <br>
 * 仕分結果登録中間
 * <pre>
 * [primary-key]
 *     SORTSUBKEY, SORTSUBLINENO
 *
 * [column]
 *     SORTSUBKEY, SORTSUBLINENO, SOKEY, PLNO, SYMBOLNO, LOTKEY, LOCCD, QTY, PICKEDFLG, SORTEDFLG, MANUALSYMBOLNO, ASSORTSEQ, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * java.math.BigDecimal sortsubkey = entity.getSortsubkey();
 * Long sortsublineno = entity.getSortsublineno();
 * java.math.BigDecimal sokey = entity.getSokey();
 * String plno = entity.getPlno();
 * java.math.BigDecimal symbolno = entity.getSymbolno();
 * java.math.BigDecimal lotkey = entity.getLotkey();
 * String loccd = entity.getLoccd();
 * java.math.BigDecimal qty = entity.getQty();
 * java.math.BigDecimal pickedflg = entity.getPickedflg();
 * java.math.BigDecimal sortedflg = entity.getSortedflg();
 * String manualsymbolno = entity.getManualsymbolno();
 * Long assortseq = entity.getAssortseq();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSortsubkey(sortsubkey);
 * entity.setSortsublineno(sortsublineno);
 * entity.setSokey(sokey);
 * entity.setPlno(plno);
 * entity.setSymbolno(symbolno);
 * entity.setLotkey(lotkey);
 * entity.setLoccd(loccd);
 * entity.setQty(qty);
 * entity.setPickedflg(pickedflg);
 * entity.setSortedflg(sortedflg);
 * entity.setManualsymbolno(manualsymbolno);
 * entity.setAssortseq(assortseq);
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
public abstract class BsWWksortsub extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SORTSUBKEY: {PK, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _sortsubkey;

    /** SORTSUBLINENO: {PK, NotNull, bigint(19)} */
    protected Long _sortsublineno;

    /** SOKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _sokey;

    /** PLNO: {varchar(30)} */
    protected String _plno;

    /** SYMBOLNO: {decimal(16, 6)} */
    protected java.math.BigDecimal _symbolno;

    /** LOTKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _lotkey;

    /** LOCCD: {varchar(30)} */
    protected String _loccd;

    /** QTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _qty;

    /** PICKEDFLG: {decimal(16, 6)} */
    protected java.math.BigDecimal _pickedflg;

    /** SORTEDFLG: {decimal(16, 6)} */
    protected java.math.BigDecimal _sortedflg;

    /** MANUALSYMBOLNO: {varchar(30)} */
    protected String _manualsymbolno;

    /** ASSORTSEQ: {bigint(19)} */
    protected Long _assortseq;

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
        return "W_WKSORTSUB";
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
        if (_sortsubkey == null) { return false; }
        if (_sortsublineno == null) { return false; }
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
        if (obj instanceof BsWWksortsub) {
            BsWWksortsub other = (BsWWksortsub)obj;
            if (!xSV(_sortsubkey, other._sortsubkey)) { return false; }
            if (!xSV(_sortsublineno, other._sortsublineno)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sortsubkey);
        hs = xCH(hs, _sortsublineno);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sortsubkey));
        sb.append(dm).append(xfND(_sortsublineno));
        sb.append(dm).append(xfND(_sokey));
        sb.append(dm).append(xfND(_plno));
        sb.append(dm).append(xfND(_symbolno));
        sb.append(dm).append(xfND(_lotkey));
        sb.append(dm).append(xfND(_loccd));
        sb.append(dm).append(xfND(_qty));
        sb.append(dm).append(xfND(_pickedflg));
        sb.append(dm).append(xfND(_sortedflg));
        sb.append(dm).append(xfND(_manualsymbolno));
        sb.append(dm).append(xfND(_assortseq));
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
    public WWksortsub clone() {
        return (WWksortsub)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SORTSUBKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 仕分結果登録キー
     * @return The value of the column 'SORTSUBKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getSortsubkey() {
        checkSpecifiedProperty("sortsubkey");
        return _sortsubkey;
    }

    /**
     * [set] SORTSUBKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 仕分結果登録キー
     * @param sortsubkey The value of the column 'SORTSUBKEY'. (basically NotNull if update: for the constraint)
     */
    public void setSortsubkey(java.math.BigDecimal sortsubkey) {
        registerModifiedProperty("sortsubkey");
        _sortsubkey = sortsubkey;
    }

    /**
     * [get] SORTSUBLINENO: {PK, NotNull, bigint(19)} <br>
     * 仕分結果登録行No.
     * @return The value of the column 'SORTSUBLINENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getSortsublineno() {
        checkSpecifiedProperty("sortsublineno");
        return _sortsublineno;
    }

    /**
     * [set] SORTSUBLINENO: {PK, NotNull, bigint(19)} <br>
     * 仕分結果登録行No.
     * @param sortsublineno The value of the column 'SORTSUBLINENO'. (basically NotNull if update: for the constraint)
     */
    public void setSortsublineno(Long sortsublineno) {
        registerModifiedProperty("sortsublineno");
        _sortsublineno = sortsublineno;
    }

    /**
     * [get] SOKEY: {decimal(16, 6)} <br>
     * 出庫指示キー
     * @return The value of the column 'SOKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSokey() {
        checkSpecifiedProperty("sokey");
        return _sokey;
    }

    /**
     * [set] SOKEY: {decimal(16, 6)} <br>
     * 出庫指示キー
     * @param sokey The value of the column 'SOKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSokey(java.math.BigDecimal sokey) {
        registerModifiedProperty("sokey");
        _sokey = sokey;
    }

    /**
     * [get] PLNO: {varchar(30)} <br>
     * P/LNo.
     * @return The value of the column 'PLNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlno() {
        checkSpecifiedProperty("plno");
        return convertEmptyToNull(_plno);
    }

    /**
     * [set] PLNO: {varchar(30)} <br>
     * P/LNo.
     * @param plno The value of the column 'PLNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlno(String plno) {
        registerModifiedProperty("plno");
        _plno = plno;
    }

    /**
     * [get] SYMBOLNO: {decimal(16, 6)} <br>
     * シンボル管理番号
     * @return The value of the column 'SYMBOLNO'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSymbolno() {
        checkSpecifiedProperty("symbolno");
        return _symbolno;
    }

    /**
     * [set] SYMBOLNO: {decimal(16, 6)} <br>
     * シンボル管理番号
     * @param symbolno The value of the column 'SYMBOLNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolno(java.math.BigDecimal symbolno) {
        registerModifiedProperty("symbolno");
        _symbolno = symbolno;
    }

    /**
     * [get] LOTKEY: {decimal(16, 6)} <br>
     * ロットキー
     * @return The value of the column 'LOTKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getLotkey() {
        checkSpecifiedProperty("lotkey");
        return _lotkey;
    }

    /**
     * [set] LOTKEY: {decimal(16, 6)} <br>
     * ロットキー
     * @param lotkey The value of the column 'LOTKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotkey(java.math.BigDecimal lotkey) {
        registerModifiedProperty("lotkey");
        _lotkey = lotkey;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * ロケCD
     * @return The value of the column 'LOCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLoccd() {
        checkSpecifiedProperty("loccd");
        return convertEmptyToNull(_loccd);
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * ロケCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoccd(String loccd) {
        registerModifiedProperty("loccd");
        _loccd = loccd;
    }

    /**
     * [get] QTY: {decimal(16, 6)} <br>
     * 仕分中数量
     * @return The value of the column 'QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getQty() {
        checkSpecifiedProperty("qty");
        return _qty;
    }

    /**
     * [set] QTY: {decimal(16, 6)} <br>
     * 仕分中数量
     * @param qty The value of the column 'QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty(java.math.BigDecimal qty) {
        registerModifiedProperty("qty");
        _qty = qty;
    }

    /**
     * [get] PICKEDFLG: {decimal(16, 6)} <br>
     * 棚出カートンフラグ
     * @return The value of the column 'PICKEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickedflg() {
        checkSpecifiedProperty("pickedflg");
        return _pickedflg;
    }

    /**
     * [set] PICKEDFLG: {decimal(16, 6)} <br>
     * 棚出カートンフラグ
     * @param pickedflg The value of the column 'PICKEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickedflg(java.math.BigDecimal pickedflg) {
        registerModifiedProperty("pickedflg");
        _pickedflg = pickedflg;
    }

    /**
     * [get] SORTEDFLG: {decimal(16, 6)} <br>
     * 仕分カートンフラグ
     * @return The value of the column 'SORTEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSortedflg() {
        checkSpecifiedProperty("sortedflg");
        return _sortedflg;
    }

    /**
     * [set] SORTEDFLG: {decimal(16, 6)} <br>
     * 仕分カートンフラグ
     * @param sortedflg The value of the column 'SORTEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortedflg(java.math.BigDecimal sortedflg) {
        registerModifiedProperty("sortedflg");
        _sortedflg = sortedflg;
    }

    /**
     * [get] MANUALSYMBOLNO: {varchar(30)} <br>
     * 入力段ボール番号
     * @return The value of the column 'MANUALSYMBOLNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getManualsymbolno() {
        checkSpecifiedProperty("manualsymbolno");
        return convertEmptyToNull(_manualsymbolno);
    }

    /**
     * [set] MANUALSYMBOLNO: {varchar(30)} <br>
     * 入力段ボール番号
     * @param manualsymbolno The value of the column 'MANUALSYMBOLNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManualsymbolno(String manualsymbolno) {
        registerModifiedProperty("manualsymbolno");
        _manualsymbolno = manualsymbolno;
    }

    /**
     * [get] ASSORTSEQ: {bigint(19)} <br>
     * 詰合せ連番
     * @return The value of the column 'ASSORTSEQ'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAssortseq() {
        checkSpecifiedProperty("assortseq");
        return _assortseq;
    }

    /**
     * [set] ASSORTSEQ: {bigint(19)} <br>
     * 詰合せ連番
     * @param assortseq The value of the column 'ASSORTSEQ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortseq(Long assortseq) {
        registerModifiedProperty("assortseq");
        _assortseq = assortseq;
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
