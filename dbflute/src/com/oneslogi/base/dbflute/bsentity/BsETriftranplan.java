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
 * The entity of E_TRIFTRANPLAN as TABLE. <br>
 * IF輸送受払計画中間
 * <pre>
 * [primary-key]
 *     UJTYPE, RECNO
 *
 * [column]
 *     UJTYPE, RECNO, WAREHOUSECD, REFNO, SHIPCD, SHIPSCHDATE, SHIPTOCD, SHIPTOSCHDATE, DATATYPE, PRODUCT_CD, QTY, SUBWAREHOUSECD, RESULTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * String ujtype = entity.getUjtype();
 * java.math.BigDecimal recno = entity.getRecno();
 * String warehousecd = entity.getWarehousecd();
 * String refno = entity.getRefno();
 * String shipcd = entity.getShipcd();
 * String shipschdate = entity.getShipschdate();
 * String shiptocd = entity.getShiptocd();
 * String shiptoschdate = entity.getShiptoschdate();
 * String datatype = entity.getDatatype();
 * String productCd = entity.getProductCd();
 * Long qty = entity.getQty();
 * String subwarehousecd = entity.getSubwarehousecd();
 * String resultflg = entity.getResultflg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setUjtype(ujtype);
 * entity.setRecno(recno);
 * entity.setWarehousecd(warehousecd);
 * entity.setRefno(refno);
 * entity.setShipcd(shipcd);
 * entity.setShipschdate(shipschdate);
 * entity.setShiptocd(shiptocd);
 * entity.setShiptoschdate(shiptoschdate);
 * entity.setDatatype(datatype);
 * entity.setProductCd(productCd);
 * entity.setQty(qty);
 * entity.setSubwarehousecd(subwarehousecd);
 * entity.setResultflg(resultflg);
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
public abstract class BsETriftranplan extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** UJTYPE: {PK, NotNull, char(1)} */
    protected String _ujtype;

    /** RECNO: {PK, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _recno;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    protected String _warehousecd;

    /** REFNO: {NotNull, varchar(30)} */
    protected String _refno;

    /** SHIPCD: {NotNull, varchar(30)} */
    protected String _shipcd;

    /** SHIPSCHDATE: {NotNull, varchar(30)} */
    protected String _shipschdate;

    /** SHIPTOCD: {NotNull, varchar(30)} */
    protected String _shiptocd;

    /** SHIPTOSCHDATE: {NotNull, varchar(30)} */
    protected String _shiptoschdate;

    /** DATATYPE: {NotNull, char(1)} */
    protected String _datatype;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** QTY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _qty;

    /** SUBWAREHOUSECD: {varchar(30)} */
    protected String _subwarehousecd;

    /** RESULTFLG: {char(1)} */
    protected String _resultflg;

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
        return "E_TRIFTRANPLAN";
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
        if (_ujtype == null) { return false; }
        if (_recno == null) { return false; }
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
        if (obj instanceof BsETriftranplan) {
            BsETriftranplan other = (BsETriftranplan)obj;
            if (!xSV(_ujtype, other._ujtype)) { return false; }
            if (!xSV(_recno, other._recno)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _ujtype);
        hs = xCH(hs, _recno);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_ujtype));
        sb.append(dm).append(xfND(_recno));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_refno));
        sb.append(dm).append(xfND(_shipcd));
        sb.append(dm).append(xfND(_shipschdate));
        sb.append(dm).append(xfND(_shiptocd));
        sb.append(dm).append(xfND(_shiptoschdate));
        sb.append(dm).append(xfND(_datatype));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_qty));
        sb.append(dm).append(xfND(_subwarehousecd));
        sb.append(dm).append(xfND(_resultflg));
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
    public ETriftranplan clone() {
        return (ETriftranplan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UJTYPE: {PK, NotNull, char(1)} <br>
     * 輸入／国産区分
     * @return The value of the column 'UJTYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getUjtype() {
        checkSpecifiedProperty("ujtype");
        return convertEmptyToNull(_ujtype);
    }

    /**
     * [set] UJTYPE: {PK, NotNull, char(1)} <br>
     * 輸入／国産区分
     * @param ujtype The value of the column 'UJTYPE'. (basically NotNull if update: for the constraint)
     */
    public void setUjtype(String ujtype) {
        registerModifiedProperty("ujtype");
        _ujtype = ujtype;
    }

    /**
     * [get] RECNO: {PK, NotNull, decimal(16, 6)} <br>
     * レコード番号
     * @return The value of the column 'RECNO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRecno() {
        checkSpecifiedProperty("recno");
        return _recno;
    }

    /**
     * [set] RECNO: {PK, NotNull, decimal(16, 6)} <br>
     * レコード番号
     * @param recno The value of the column 'RECNO'. (basically NotNull if update: for the constraint)
     */
    public void setRecno(java.math.BigDecimal recno) {
        registerModifiedProperty("recno");
        _recno = recno;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] REFNO: {NotNull, varchar(30)} <br>
     * 整理番号
     * @return The value of the column 'REFNO'. (basically NotNull if selected: for the constraint)
     */
    public String getRefno() {
        checkSpecifiedProperty("refno");
        return convertEmptyToNull(_refno);
    }

    /**
     * [set] REFNO: {NotNull, varchar(30)} <br>
     * 整理番号
     * @param refno The value of the column 'REFNO'. (basically NotNull if update: for the constraint)
     */
    public void setRefno(String refno) {
        registerModifiedProperty("refno");
        _refno = refno;
    }

    /**
     * [get] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SHIPCD'. (basically NotNull if selected: for the constraint)
     */
    public String getShipcd() {
        checkSpecifiedProperty("shipcd");
        return convertEmptyToNull(_shipcd);
    }

    /**
     * [set] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @param shipcd The value of the column 'SHIPCD'. (basically NotNull if update: for the constraint)
     */
    public void setShipcd(String shipcd) {
        registerModifiedProperty("shipcd");
        _shipcd = shipcd;
    }

    /**
     * [get] SHIPSCHDATE: {NotNull, varchar(30)} <br>
     * 発送予定年月日
     * @return The value of the column 'SHIPSCHDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getShipschdate() {
        checkSpecifiedProperty("shipschdate");
        return convertEmptyToNull(_shipschdate);
    }

    /**
     * [set] SHIPSCHDATE: {NotNull, varchar(30)} <br>
     * 発送予定年月日
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (basically NotNull if update: for the constraint)
     */
    public void setShipschdate(String shipschdate) {
        registerModifiedProperty("shipschdate");
        _shipschdate = shipschdate;
    }

    /**
     * [get] SHIPTOCD: {NotNull, varchar(30)} <br>
     * 受入先CD
     * @return The value of the column 'SHIPTOCD'. (basically NotNull if selected: for the constraint)
     */
    public String getShiptocd() {
        checkSpecifiedProperty("shiptocd");
        return convertEmptyToNull(_shiptocd);
    }

    /**
     * [set] SHIPTOCD: {NotNull, varchar(30)} <br>
     * 受入先CD
     * @param shiptocd The value of the column 'SHIPTOCD'. (basically NotNull if update: for the constraint)
     */
    public void setShiptocd(String shiptocd) {
        registerModifiedProperty("shiptocd");
        _shiptocd = shiptocd;
    }

    /**
     * [get] SHIPTOSCHDATE: {NotNull, varchar(30)} <br>
     * 受入予定年月日
     * @return The value of the column 'SHIPTOSCHDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getShiptoschdate() {
        checkSpecifiedProperty("shiptoschdate");
        return convertEmptyToNull(_shiptoschdate);
    }

    /**
     * [set] SHIPTOSCHDATE: {NotNull, varchar(30)} <br>
     * 受入予定年月日
     * @param shiptoschdate The value of the column 'SHIPTOSCHDATE'. (basically NotNull if update: for the constraint)
     */
    public void setShiptoschdate(String shiptoschdate) {
        registerModifiedProperty("shiptoschdate");
        _shiptoschdate = shiptoschdate;
    }

    /**
     * [get] DATATYPE: {NotNull, char(1)} <br>
     * 修正区分
     * @return The value of the column 'DATATYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getDatatype() {
        checkSpecifiedProperty("datatype");
        return convertEmptyToNull(_datatype);
    }

    /**
     * [set] DATATYPE: {NotNull, char(1)} <br>
     * 修正区分
     * @param datatype The value of the column 'DATATYPE'. (basically NotNull if update: for the constraint)
     */
    public void setDatatype(String datatype) {
        registerModifiedProperty("datatype");
        _datatype = datatype;
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
     * [get] QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 個数
     * @return The value of the column 'QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getQty() {
        checkSpecifiedProperty("qty");
        return _qty;
    }

    /**
     * [set] QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 個数
     * @param qty The value of the column 'QTY'. (basically NotNull if update: for the constraint)
     */
    public void setQty(Long qty) {
        registerModifiedProperty("qty");
        _qty = qty;
    }

    /**
     * [get] SUBWAREHOUSECD: {varchar(30)} <br>
     * 枝倉庫CD
     * @return The value of the column 'SUBWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSubwarehousecd() {
        checkSpecifiedProperty("subwarehousecd");
        return convertEmptyToNull(_subwarehousecd);
    }

    /**
     * [set] SUBWAREHOUSECD: {varchar(30)} <br>
     * 枝倉庫CD
     * @param subwarehousecd The value of the column 'SUBWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSubwarehousecd(String subwarehousecd) {
        registerModifiedProperty("subwarehousecd");
        _subwarehousecd = subwarehousecd;
    }

    /**
     * [get] RESULTFLG: {char(1)} <br>
     * ワーニングフラグ
     * @return The value of the column 'RESULTFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getResultflg() {
        checkSpecifiedProperty("resultflg");
        return convertEmptyToNull(_resultflg);
    }

    /**
     * [set] RESULTFLG: {char(1)} <br>
     * ワーニングフラグ
     * @param resultflg The value of the column 'RESULTFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setResultflg(String resultflg) {
        registerModifiedProperty("resultflg");
        _resultflg = resultflg;
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
