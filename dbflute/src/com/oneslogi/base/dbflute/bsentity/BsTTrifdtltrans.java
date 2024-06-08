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
 * The entity of T_TRIFDTLTRANS as TABLE. <br>
 * 一次輸送詳細
 * <pre>
 * [primary-key]
 *     TRIFDTLTRANS_ID
 *
 * [column]
 *     TRIFDTLTRANS_ID, REFNO, REFLINENO, SHIPCD, SHIPSCHDATE, SHIPTOCD, SHIPTOSCHDATE, PRODUCT_CD, QTY, PRODUCTIONYM, DESIGNCD, QANO, RCVPALLETNO, FIRMCARRYNO, BATJPRODUCTIONYM, SUBWAREHOUSECD, RESULTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIFDTLTRANS_ID
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
 * Long trifdtltransId = entity.getTrifdtltransId();
 * String refno = entity.getRefno();
 * Long reflineno = entity.getReflineno();
 * String shipcd = entity.getShipcd();
 * String shipschdate = entity.getShipschdate();
 * String shiptocd = entity.getShiptocd();
 * String shiptoschdate = entity.getShiptoschdate();
 * String productCd = entity.getProductCd();
 * Long qty = entity.getQty();
 * String productionym = entity.getProductionym();
 * String designcd = entity.getDesigncd();
 * String qano = entity.getQano();
 * String rcvpalletno = entity.getRcvpalletno();
 * String firmcarryno = entity.getFirmcarryno();
 * String batjproductionym = entity.getBatjproductionym();
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
 * entity.setTrifdtltransId(trifdtltransId);
 * entity.setRefno(refno);
 * entity.setReflineno(reflineno);
 * entity.setShipcd(shipcd);
 * entity.setShipschdate(shipschdate);
 * entity.setShiptocd(shiptocd);
 * entity.setShiptoschdate(shiptoschdate);
 * entity.setProductCd(productCd);
 * entity.setQty(qty);
 * entity.setProductionym(productionym);
 * entity.setDesigncd(designcd);
 * entity.setQano(qano);
 * entity.setRcvpalletno(rcvpalletno);
 * entity.setFirmcarryno(firmcarryno);
 * entity.setBatjproductionym(batjproductionym);
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
public abstract class BsTTrifdtltrans extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trifdtltransId;

    /** REFNO: {NotNull, varchar(30)} */
    protected String _refno;

    /** REFLINENO: {NotNull, bigint(19)} */
    protected Long _reflineno;

    /** SHIPCD: {NotNull, varchar(30)} */
    protected String _shipcd;

    /** SHIPSCHDATE: {NotNull, varchar(30)} */
    protected String _shipschdate;

    /** SHIPTOCD: {NotNull, varchar(30)} */
    protected String _shiptocd;

    /** SHIPTOSCHDATE: {NotNull, varchar(30)} */
    protected String _shiptoschdate;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** QTY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _qty;

    /** PRODUCTIONYM: {varchar(30)} */
    protected String _productionym;

    /** DESIGNCD: {varchar(30)} */
    protected String _designcd;

    /** QANO: {varchar(30)} */
    protected String _qano;

    /** RCVPALLETNO: {varchar(30)} */
    protected String _rcvpalletno;

    /** FIRMCARRYNO: {varchar(30)} */
    protected String _firmcarryno;

    /** BATJPRODUCTIONYM: {varchar(30)} */
    protected String _batjproductionym;

    /** SUBWAREHOUSECD: {varchar(30)} */
    protected String _subwarehousecd;

    /** RESULTFLG: {char(1), default=[0]} */
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
        return "T_TRIFDTLTRANS";
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
        if (_trifdtltransId == null) { return false; }
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
        if (obj instanceof BsTTrifdtltrans) {
            BsTTrifdtltrans other = (BsTTrifdtltrans)obj;
            if (!xSV(_trifdtltransId, other._trifdtltransId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trifdtltransId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trifdtltransId));
        sb.append(dm).append(xfND(_refno));
        sb.append(dm).append(xfND(_reflineno));
        sb.append(dm).append(xfND(_shipcd));
        sb.append(dm).append(xfND(_shipschdate));
        sb.append(dm).append(xfND(_shiptocd));
        sb.append(dm).append(xfND(_shiptoschdate));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_qty));
        sb.append(dm).append(xfND(_productionym));
        sb.append(dm).append(xfND(_designcd));
        sb.append(dm).append(xfND(_qano));
        sb.append(dm).append(xfND(_rcvpalletno));
        sb.append(dm).append(xfND(_firmcarryno));
        sb.append(dm).append(xfND(_batjproductionym));
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
    public TTrifdtltrans clone() {
        return (TTrifdtltrans)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 一次輸送詳細ID
     * @return The value of the column 'TRIFDTLTRANS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrifdtltransId() {
        checkSpecifiedProperty("trifdtltransId");
        return _trifdtltransId;
    }

    /**
     * [set] TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 一次輸送詳細ID
     * @param trifdtltransId The value of the column 'TRIFDTLTRANS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrifdtltransId(Long trifdtltransId) {
        registerModifiedProperty("trifdtltransId");
        _trifdtltransId = trifdtltransId;
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
     * [get] REFLINENO: {NotNull, bigint(19)} <br>
     * 明細番号
     * @return The value of the column 'REFLINENO'. (basically NotNull if selected: for the constraint)
     */
    public Long getReflineno() {
        checkSpecifiedProperty("reflineno");
        return _reflineno;
    }

    /**
     * [set] REFLINENO: {NotNull, bigint(19)} <br>
     * 明細番号
     * @param reflineno The value of the column 'REFLINENO'. (basically NotNull if update: for the constraint)
     */
    public void setReflineno(Long reflineno) {
        registerModifiedProperty("reflineno");
        _reflineno = reflineno;
    }

    /**
     * [get] SHIPCD: {NotNull, varchar(30)} <br>
     * 発地CD
     * @return The value of the column 'SHIPCD'. (basically NotNull if selected: for the constraint)
     */
    public String getShipcd() {
        checkSpecifiedProperty("shipcd");
        return convertEmptyToNull(_shipcd);
    }

    /**
     * [set] SHIPCD: {NotNull, varchar(30)} <br>
     * 発地CD
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
     * 受地CD
     * @return The value of the column 'SHIPTOCD'. (basically NotNull if selected: for the constraint)
     */
    public String getShiptocd() {
        checkSpecifiedProperty("shiptocd");
        return convertEmptyToNull(_shiptocd);
    }

    /**
     * [set] SHIPTOCD: {NotNull, varchar(30)} <br>
     * 受地CD
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
     * 数量（１３桁）
     * @return The value of the column 'QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getQty() {
        checkSpecifiedProperty("qty");
        return _qty;
    }

    /**
     * [set] QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 数量（１３桁）
     * @param qty The value of the column 'QTY'. (basically NotNull if update: for the constraint)
     */
    public void setQty(Long qty) {
        registerModifiedProperty("qty");
        _qty = qty;
    }

    /**
     * [get] PRODUCTIONYM: {varchar(30)} <br>
     * 製造情報
     * @return The value of the column 'PRODUCTIONYM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductionym() {
        checkSpecifiedProperty("productionym");
        return convertEmptyToNull(_productionym);
    }

    /**
     * [set] PRODUCTIONYM: {varchar(30)} <br>
     * 製造情報
     * @param productionym The value of the column 'PRODUCTIONYM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductionym(String productionym) {
        registerModifiedProperty("productionym");
        _productionym = productionym;
    }

    /**
     * [get] DESIGNCD: {varchar(30)} <br>
     * 今回デザイン
     * @return The value of the column 'DESIGNCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncd() {
        checkSpecifiedProperty("designcd");
        return convertEmptyToNull(_designcd);
    }

    /**
     * [set] DESIGNCD: {varchar(30)} <br>
     * 今回デザイン
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncd(String designcd) {
        registerModifiedProperty("designcd");
        _designcd = designcd;
    }

    /**
     * [get] QANO: {varchar(30)} <br>
     * 問合せ番号
     * @return The value of the column 'QANO'. (NullAllowed even if selected: for no constraint)
     */
    public String getQano() {
        checkSpecifiedProperty("qano");
        return convertEmptyToNull(_qano);
    }

    /**
     * [set] QANO: {varchar(30)} <br>
     * 問合せ番号
     * @param qano The value of the column 'QANO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQano(String qano) {
        registerModifiedProperty("qano");
        _qano = qano;
    }

    /**
     * [get] RCVPALLETNO: {varchar(30)} <br>
     * パレット番号（０８需給）
     * @return The value of the column 'RCVPALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvpalletno() {
        checkSpecifiedProperty("rcvpalletno");
        return convertEmptyToNull(_rcvpalletno);
    }

    /**
     * [set] RCVPALLETNO: {varchar(30)} <br>
     * パレット番号（０８需給）
     * @param rcvpalletno The value of the column 'RCVPALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvpalletno(String rcvpalletno) {
        registerModifiedProperty("rcvpalletno");
        _rcvpalletno = rcvpalletno;
    }

    /**
     * [get] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMCARRYNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirmcarryno() {
        checkSpecifiedProperty("firmcarryno");
        return convertEmptyToNull(_firmcarryno);
    }

    /**
     * [set] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmcarryno The value of the column 'FIRMCARRYNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirmcarryno(String firmcarryno) {
        registerModifiedProperty("firmcarryno");
        _firmcarryno = firmcarryno;
    }

    /**
     * [get] BATJPRODUCTIONYM: {varchar(30)} <br>
     * BATJ製造月情報
     * @return The value of the column 'BATJPRODUCTIONYM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatjproductionym() {
        checkSpecifiedProperty("batjproductionym");
        return convertEmptyToNull(_batjproductionym);
    }

    /**
     * [set] BATJPRODUCTIONYM: {varchar(30)} <br>
     * BATJ製造月情報
     * @param batjproductionym The value of the column 'BATJPRODUCTIONYM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatjproductionym(String batjproductionym) {
        registerModifiedProperty("batjproductionym");
        _batjproductionym = batjproductionym;
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
     * [get] RESULTFLG: {char(1), default=[0]} <br>
     * ワーニングフラグ
     * @return The value of the column 'RESULTFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getResultflg() {
        checkSpecifiedProperty("resultflg");
        return convertEmptyToNull(_resultflg);
    }

    /**
     * [set] RESULTFLG: {char(1), default=[0]} <br>
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
