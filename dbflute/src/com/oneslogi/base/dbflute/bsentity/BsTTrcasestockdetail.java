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
 * The entity of T_TRCASESTOCKDETAIL as TABLE. <br>
 * ケース補充明細情報
 * <pre>
 * [primary-key]
 *     TRCASESTOCKDETAIL_ID
 *
 * [column]
 *     TRCASESTOCKDETAIL_ID, CASESTOCKDETAILNO, CENTER_SYMBOL_ID, SORTSTOCKDATE, WORKTIME, SORTSTOCKKBN, OPERATETIMES, SOTEDUNIT, SORTLOCCD, PRODUCT_CD, OPERATEQTY, MANUFACTUREDATE, CONFIRMNO, PRINTDATETIME, PRINTEDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRCASESTOCKDETAIL_ID
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
 * Long trcasestockdetailId = entity.getTrcasestockdetailId();
 * Long casestockdetailno = entity.getCasestockdetailno();
 * java.math.BigDecimal centerSymbolId = entity.getCenterSymbolId();
 * String sortstockdate = entity.getSortstockdate();
 * String worktime = entity.getWorktime();
 * String sortstockkbn = entity.getSortstockkbn();
 * java.math.BigDecimal operatetimes = entity.getOperatetimes();
 * String sotedunit = entity.getSotedunit();
 * String sortloccd = entity.getSortloccd();
 * String productCd = entity.getProductCd();
 * String operateqty = entity.getOperateqty();
 * String manufacturedate = entity.getManufacturedate();
 * java.math.BigDecimal confirmno = entity.getConfirmno();
 * java.sql.Timestamp printdatetime = entity.getPrintdatetime();
 * String printedflg = entity.getPrintedflg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrcasestockdetailId(trcasestockdetailId);
 * entity.setCasestockdetailno(casestockdetailno);
 * entity.setCenterSymbolId(centerSymbolId);
 * entity.setSortstockdate(sortstockdate);
 * entity.setWorktime(worktime);
 * entity.setSortstockkbn(sortstockkbn);
 * entity.setOperatetimes(operatetimes);
 * entity.setSotedunit(sotedunit);
 * entity.setSortloccd(sortloccd);
 * entity.setProductCd(productCd);
 * entity.setOperateqty(operateqty);
 * entity.setManufacturedate(manufacturedate);
 * entity.setConfirmno(confirmno);
 * entity.setPrintdatetime(printdatetime);
 * entity.setPrintedflg(printedflg);
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
public abstract class BsTTrcasestockdetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trcasestockdetailId;

    /** CASESTOCKDETAILNO: {NotNull, bigint(19)} */
    protected Long _casestockdetailno;

    /** CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _centerSymbolId;

    /** SORTSTOCKDATE: {NotNull, varchar(8)} */
    protected String _sortstockdate;

    /** WORKTIME: {NotNull, varchar(6)} */
    protected String _worktime;

    /** SORTSTOCKKBN: {NotNull, varchar(30)} */
    protected String _sortstockkbn;

    /** OPERATETIMES: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _operatetimes;

    /** SOTEDUNIT: {IX+, NotNull, varchar(30)} */
    protected String _sotedunit;

    /** SORTLOCCD: {NotNull, varchar(255)} */
    protected String _sortloccd;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** OPERATEQTY: {varchar(255)} */
    protected String _operateqty;

    /** MANUFACTUREDATE: {varchar(8)} */
    protected String _manufacturedate;

    /** CONFIRMNO: {decimal(16, 6)} */
    protected java.math.BigDecimal _confirmno;

    /** PRINTDATETIME: {datetime2(26, 6)} */
    protected java.sql.Timestamp _printdatetime;

    /** PRINTEDFLG: {NotNull, char(1), default=[(0)]} */
    protected String _printedflg;

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
        return "T_TRCASESTOCKDETAIL";
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
        if (_trcasestockdetailId == null) { return false; }
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
        if (obj instanceof BsTTrcasestockdetail) {
            BsTTrcasestockdetail other = (BsTTrcasestockdetail)obj;
            if (!xSV(_trcasestockdetailId, other._trcasestockdetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trcasestockdetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trcasestockdetailId));
        sb.append(dm).append(xfND(_casestockdetailno));
        sb.append(dm).append(xfND(_centerSymbolId));
        sb.append(dm).append(xfND(_sortstockdate));
        sb.append(dm).append(xfND(_worktime));
        sb.append(dm).append(xfND(_sortstockkbn));
        sb.append(dm).append(xfND(_operatetimes));
        sb.append(dm).append(xfND(_sotedunit));
        sb.append(dm).append(xfND(_sortloccd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_operateqty));
        sb.append(dm).append(xfND(_manufacturedate));
        sb.append(dm).append(xfND(_confirmno));
        sb.append(dm).append(xfND(_printdatetime));
        sb.append(dm).append(xfND(_printedflg));
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
    public TTrcasestockdetail clone() {
        return (TTrcasestockdetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ケース補充明細情報ID
     * @return The value of the column 'TRCASESTOCKDETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrcasestockdetailId() {
        checkSpecifiedProperty("trcasestockdetailId");
        return _trcasestockdetailId;
    }

    /**
     * [set] TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ケース補充明細情報ID
     * @param trcasestockdetailId The value of the column 'TRCASESTOCKDETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrcasestockdetailId(Long trcasestockdetailId) {
        registerModifiedProperty("trcasestockdetailId");
        _trcasestockdetailId = trcasestockdetailId;
    }

    /**
     * [get] CASESTOCKDETAILNO: {NotNull, bigint(19)} <br>
     * ケース補充明細番号
     * @return The value of the column 'CASESTOCKDETAILNO'. (basically NotNull if selected: for the constraint)
     */
    public Long getCasestockdetailno() {
        checkSpecifiedProperty("casestockdetailno");
        return _casestockdetailno;
    }

    /**
     * [set] CASESTOCKDETAILNO: {NotNull, bigint(19)} <br>
     * ケース補充明細番号
     * @param casestockdetailno The value of the column 'CASESTOCKDETAILNO'. (basically NotNull if update: for the constraint)
     */
    public void setCasestockdetailno(Long casestockdetailno) {
        registerModifiedProperty("casestockdetailno");
        _casestockdetailno = casestockdetailno;
    }

    /**
     * [get] CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)} <br>
     * 拠点シンボルID
     * @return The value of the column 'CENTER_SYMBOL_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getCenterSymbolId() {
        checkSpecifiedProperty("centerSymbolId");
        return _centerSymbolId;
    }

    /**
     * [set] CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)} <br>
     * 拠点シンボルID
     * @param centerSymbolId The value of the column 'CENTER_SYMBOL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterSymbolId(java.math.BigDecimal centerSymbolId) {
        registerModifiedProperty("centerSymbolId");
        _centerSymbolId = centerSymbolId;
    }

    /**
     * [get] SORTSTOCKDATE: {NotNull, varchar(8)} <br>
     * ラック間製品移動日
     * @return The value of the column 'SORTSTOCKDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getSortstockdate() {
        checkSpecifiedProperty("sortstockdate");
        return convertEmptyToNull(_sortstockdate);
    }

    /**
     * [set] SORTSTOCKDATE: {NotNull, varchar(8)} <br>
     * ラック間製品移動日
     * @param sortstockdate The value of the column 'SORTSTOCKDATE'. (basically NotNull if update: for the constraint)
     */
    public void setSortstockdate(String sortstockdate) {
        registerModifiedProperty("sortstockdate");
        _sortstockdate = sortstockdate;
    }

    /**
     * [get] WORKTIME: {NotNull, varchar(6)} <br>
     * 作業時刻
     * @return The value of the column 'WORKTIME'. (basically NotNull if selected: for the constraint)
     */
    public String getWorktime() {
        checkSpecifiedProperty("worktime");
        return convertEmptyToNull(_worktime);
    }

    /**
     * [set] WORKTIME: {NotNull, varchar(6)} <br>
     * 作業時刻
     * @param worktime The value of the column 'WORKTIME'. (basically NotNull if update: for the constraint)
     */
    public void setWorktime(String worktime) {
        registerModifiedProperty("worktime");
        _worktime = worktime;
    }

    /**
     * [get] SORTSTOCKKBN: {NotNull, varchar(30)} <br>
     * 仕分補充区分
     * @return The value of the column 'SORTSTOCKKBN'. (basically NotNull if selected: for the constraint)
     */
    public String getSortstockkbn() {
        checkSpecifiedProperty("sortstockkbn");
        return convertEmptyToNull(_sortstockkbn);
    }

    /**
     * [set] SORTSTOCKKBN: {NotNull, varchar(30)} <br>
     * 仕分補充区分
     * @param sortstockkbn The value of the column 'SORTSTOCKKBN'. (basically NotNull if update: for the constraint)
     */
    public void setSortstockkbn(String sortstockkbn) {
        registerModifiedProperty("sortstockkbn");
        _sortstockkbn = sortstockkbn;
    }

    /**
     * [get] OPERATETIMES: {NotNull, decimal(16, 6)} <br>
     * 操作回数
     * @return The value of the column 'OPERATETIMES'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getOperatetimes() {
        checkSpecifiedProperty("operatetimes");
        return _operatetimes;
    }

    /**
     * [set] OPERATETIMES: {NotNull, decimal(16, 6)} <br>
     * 操作回数
     * @param operatetimes The value of the column 'OPERATETIMES'. (basically NotNull if update: for the constraint)
     */
    public void setOperatetimes(java.math.BigDecimal operatetimes) {
        registerModifiedProperty("operatetimes");
        _operatetimes = operatetimes;
    }

    /**
     * [get] SOTEDUNIT: {IX+, NotNull, varchar(30)} <br>
     * 補充先
     * @return The value of the column 'SOTEDUNIT'. (basically NotNull if selected: for the constraint)
     */
    public String getSotedunit() {
        checkSpecifiedProperty("sotedunit");
        return convertEmptyToNull(_sotedunit);
    }

    /**
     * [set] SOTEDUNIT: {IX+, NotNull, varchar(30)} <br>
     * 補充先
     * @param sotedunit The value of the column 'SOTEDUNIT'. (basically NotNull if update: for the constraint)
     */
    public void setSotedunit(String sotedunit) {
        registerModifiedProperty("sotedunit");
        _sotedunit = sotedunit;
    }

    /**
     * [get] SORTLOCCD: {NotNull, varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'SORTLOCCD'. (basically NotNull if selected: for the constraint)
     */
    public String getSortloccd() {
        checkSpecifiedProperty("sortloccd");
        return convertEmptyToNull(_sortloccd);
    }

    /**
     * [set] SORTLOCCD: {NotNull, varchar(255)} <br>
     * 仕分ロケ
     * @param sortloccd The value of the column 'SORTLOCCD'. (basically NotNull if update: for the constraint)
     */
    public void setSortloccd(String sortloccd) {
        registerModifiedProperty("sortloccd");
        _sortloccd = sortloccd;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] OPERATEQTY: {varchar(255)} <br>
     * 操作数量（カートン）
     * @return The value of the column 'OPERATEQTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getOperateqty() {
        checkSpecifiedProperty("operateqty");
        return convertEmptyToNull(_operateqty);
    }

    /**
     * [set] OPERATEQTY: {varchar(255)} <br>
     * 操作数量（カートン）
     * @param operateqty The value of the column 'OPERATEQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOperateqty(String operateqty) {
        registerModifiedProperty("operateqty");
        _operateqty = operateqty;
    }

    /**
     * [get] MANUFACTUREDATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTUREDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufacturedate() {
        checkSpecifiedProperty("manufacturedate");
        return convertEmptyToNull(_manufacturedate);
    }

    /**
     * [set] MANUFACTUREDATE: {varchar(8)} <br>
     * 製造年月日
     * @param manufacturedate The value of the column 'MANUFACTUREDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufacturedate(String manufacturedate) {
        registerModifiedProperty("manufacturedate");
        _manufacturedate = manufacturedate;
    }

    /**
     * [get] CONFIRMNO: {decimal(16, 6)} <br>
     * 確認番号
     * @return The value of the column 'CONFIRMNO'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getConfirmno() {
        checkSpecifiedProperty("confirmno");
        return _confirmno;
    }

    /**
     * [set] CONFIRMNO: {decimal(16, 6)} <br>
     * 確認番号
     * @param confirmno The value of the column 'CONFIRMNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setConfirmno(java.math.BigDecimal confirmno) {
        registerModifiedProperty("confirmno");
        _confirmno = confirmno;
    }

    /**
     * [get] PRINTDATETIME: {datetime2(26, 6)} <br>
     * 印刷日時
     * @return The value of the column 'PRINTDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getPrintdatetime() {
        checkSpecifiedProperty("printdatetime");
        return _printdatetime;
    }

    /**
     * [set] PRINTDATETIME: {datetime2(26, 6)} <br>
     * 印刷日時
     * @param printdatetime The value of the column 'PRINTDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintdatetime(java.sql.Timestamp printdatetime) {
        registerModifiedProperty("printdatetime");
        _printdatetime = printdatetime;
    }

    /**
     * [get] PRINTEDFLG: {NotNull, char(1), default=[(0)]} <br>
     * 印刷済フラグ
     * @return The value of the column 'PRINTEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintedflg() {
        checkSpecifiedProperty("printedflg");
        return convertEmptyToNull(_printedflg);
    }

    /**
     * [set] PRINTEDFLG: {NotNull, char(1), default=[(0)]} <br>
     * 印刷済フラグ
     * @param printedflg The value of the column 'PRINTEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setPrintedflg(String printedflg) {
        registerModifiedProperty("printedflg");
        _printedflg = printedflg;
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
