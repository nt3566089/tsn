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
 * The entity of T_TRRCVBAT as TABLE. <br>
 * ＢＡＴ入庫予定情報
 * <pre>
 * [primary-key]
 *     TRRCVBAT_ID
 *
 * [column]
 *     TRRCVBAT_ID, BATNO, BATDELINO, BATDELIDETAILNO, BATWAREHOUSECD, BATKEEPWAREHOUSECD, BATPARTNERNORCV, BATPARTNERNOSND, BATDELIDETAILNUM, PRODUCT_CD, LOT3, EXPECTQTY1, DATA_MAKE_FLG, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRRCVBAT_ID
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
 * Long trrcvbatId = entity.getTrrcvbatId();
 * java.math.BigDecimal batno = entity.getBatno();
 * String batdelino = entity.getBatdelino();
 * Long batdelidetailno = entity.getBatdelidetailno();
 * String batwarehousecd = entity.getBatwarehousecd();
 * String batkeepwarehousecd = entity.getBatkeepwarehousecd();
 * String batpartnernorcv = entity.getBatpartnernorcv();
 * String batpartnernosnd = entity.getBatpartnernosnd();
 * Long batdelidetailnum = entity.getBatdelidetailnum();
 * String productCd = entity.getProductCd();
 * String lot3 = entity.getLot3();
 * java.math.BigDecimal expectqty1 = entity.getExpectqty1();
 * String dataMakeFlg = entity.getDataMakeFlg();
 * String vaExtdata1 = entity.getVaExtdata1();
 * String vaExtdata2 = entity.getVaExtdata2();
 * String vaExtdata3 = entity.getVaExtdata3();
 * String nvExtdata1 = entity.getNvExtdata1();
 * String nvExtdata2 = entity.getNvExtdata2();
 * String nvExtdata3 = entity.getNvExtdata3();
 * Long nmExtdata1 = entity.getNmExtdata1();
 * Long nmExtdata2 = entity.getNmExtdata2();
 * Long nmExtdata3 = entity.getNmExtdata3();
 * String dtExtdata1 = entity.getDtExtdata1();
 * String dtExtdata2 = entity.getDtExtdata2();
 * String dtExtdata3 = entity.getDtExtdata3();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrrcvbatId(trrcvbatId);
 * entity.setBatno(batno);
 * entity.setBatdelino(batdelino);
 * entity.setBatdelidetailno(batdelidetailno);
 * entity.setBatwarehousecd(batwarehousecd);
 * entity.setBatkeepwarehousecd(batkeepwarehousecd);
 * entity.setBatpartnernorcv(batpartnernorcv);
 * entity.setBatpartnernosnd(batpartnernosnd);
 * entity.setBatdelidetailnum(batdelidetailnum);
 * entity.setProductCd(productCd);
 * entity.setLot3(lot3);
 * entity.setExpectqty1(expectqty1);
 * entity.setDataMakeFlg(dataMakeFlg);
 * entity.setVaExtdata1(vaExtdata1);
 * entity.setVaExtdata2(vaExtdata2);
 * entity.setVaExtdata3(vaExtdata3);
 * entity.setNvExtdata1(nvExtdata1);
 * entity.setNvExtdata2(nvExtdata2);
 * entity.setNvExtdata3(nvExtdata3);
 * entity.setNmExtdata1(nmExtdata1);
 * entity.setNmExtdata2(nmExtdata2);
 * entity.setNmExtdata3(nmExtdata3);
 * entity.setDtExtdata1(dtExtdata1);
 * entity.setDtExtdata2(dtExtdata2);
 * entity.setDtExtdata3(dtExtdata3);
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
public abstract class BsTTrrcvbat extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trrcvbatId;

    /** BATNO: {decimal(16, 6)} */
    protected java.math.BigDecimal _batno;

    /** BATDELINO: {varchar(30)} */
    protected String _batdelino;

    /** BATDELIDETAILNO: {bigint(19)} */
    protected Long _batdelidetailno;

    /** BATWAREHOUSECD: {varchar(30)} */
    protected String _batwarehousecd;

    /** BATKEEPWAREHOUSECD: {varchar(30)} */
    protected String _batkeepwarehousecd;

    /** BATPARTNERNORCV: {varchar(30)} */
    protected String _batpartnernorcv;

    /** BATPARTNERNOSND: {varchar(30)} */
    protected String _batpartnernosnd;

    /** BATDELIDETAILNUM: {bigint(19)} */
    protected Long _batdelidetailnum;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** EXPECTQTY1: {decimal(16, 6)} */
    protected java.math.BigDecimal _expectqty1;

    /** DATA_MAKE_FLG: {char(1)} */
    protected String _dataMakeFlg;

    /** VA_EXTDATA1: {varchar(30)} */
    protected String _vaExtdata1;

    /** VA_EXTDATA2: {varchar(30)} */
    protected String _vaExtdata2;

    /** VA_EXTDATA3: {varchar(30)} */
    protected String _vaExtdata3;

    /** NV_EXTDATA1: {varchar(60)} */
    protected String _nvExtdata1;

    /** NV_EXTDATA2: {varchar(60)} */
    protected String _nvExtdata2;

    /** NV_EXTDATA3: {varchar(60)} */
    protected String _nvExtdata3;

    /** NM_EXTDATA1: {bigint(19)} */
    protected Long _nmExtdata1;

    /** NM_EXTDATA2: {bigint(19)} */
    protected Long _nmExtdata2;

    /** NM_EXTDATA3: {bigint(19)} */
    protected Long _nmExtdata3;

    /** DT_EXTDATA1: {varchar(8)} */
    protected String _dtExtdata1;

    /** DT_EXTDATA2: {varchar(8)} */
    protected String _dtExtdata2;

    /** DT_EXTDATA3: {varchar(8)} */
    protected String _dtExtdata3;

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
        return "T_TRRCVBAT";
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
        if (_trrcvbatId == null) { return false; }
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
        if (obj instanceof BsTTrrcvbat) {
            BsTTrrcvbat other = (BsTTrrcvbat)obj;
            if (!xSV(_trrcvbatId, other._trrcvbatId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trrcvbatId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trrcvbatId));
        sb.append(dm).append(xfND(_batno));
        sb.append(dm).append(xfND(_batdelino));
        sb.append(dm).append(xfND(_batdelidetailno));
        sb.append(dm).append(xfND(_batwarehousecd));
        sb.append(dm).append(xfND(_batkeepwarehousecd));
        sb.append(dm).append(xfND(_batpartnernorcv));
        sb.append(dm).append(xfND(_batpartnernosnd));
        sb.append(dm).append(xfND(_batdelidetailnum));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_expectqty1));
        sb.append(dm).append(xfND(_dataMakeFlg));
        sb.append(dm).append(xfND(_vaExtdata1));
        sb.append(dm).append(xfND(_vaExtdata2));
        sb.append(dm).append(xfND(_vaExtdata3));
        sb.append(dm).append(xfND(_nvExtdata1));
        sb.append(dm).append(xfND(_nvExtdata2));
        sb.append(dm).append(xfND(_nvExtdata3));
        sb.append(dm).append(xfND(_nmExtdata1));
        sb.append(dm).append(xfND(_nmExtdata2));
        sb.append(dm).append(xfND(_nmExtdata3));
        sb.append(dm).append(xfND(_dtExtdata1));
        sb.append(dm).append(xfND(_dtExtdata2));
        sb.append(dm).append(xfND(_dtExtdata3));
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
    public TTrrcvbat clone() {
        return (TTrrcvbat)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ＢＡＴ入庫予定情報ID
     * @return The value of the column 'TRRCVBAT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrrcvbatId() {
        checkSpecifiedProperty("trrcvbatId");
        return _trrcvbatId;
    }

    /**
     * [set] TRRCVBAT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ＢＡＴ入庫予定情報ID
     * @param trrcvbatId The value of the column 'TRRCVBAT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrrcvbatId(Long trrcvbatId) {
        registerModifiedProperty("trrcvbatId");
        _trrcvbatId = trrcvbatId;
    }

    /**
     * [get] BATNO: {decimal(16, 6)} <br>
     * ＢＡＴ管理番号
     * @return The value of the column 'BATNO'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBatno() {
        checkSpecifiedProperty("batno");
        return _batno;
    }

    /**
     * [set] BATNO: {decimal(16, 6)} <br>
     * ＢＡＴ管理番号
     * @param batno The value of the column 'BATNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatno(java.math.BigDecimal batno) {
        registerModifiedProperty("batno");
        _batno = batno;
    }

    /**
     * [get] BATDELINO: {varchar(30)} <br>
     * ＳＡＰデリバリー番号（ヘッダ）
     * @return The value of the column 'BATDELINO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatdelino() {
        checkSpecifiedProperty("batdelino");
        return convertEmptyToNull(_batdelino);
    }

    /**
     * [set] BATDELINO: {varchar(30)} <br>
     * ＳＡＰデリバリー番号（ヘッダ）
     * @param batdelino The value of the column 'BATDELINO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatdelino(String batdelino) {
        registerModifiedProperty("batdelino");
        _batdelino = batdelino;
    }

    /**
     * [get] BATDELIDETAILNO: {bigint(19)} <br>
     * ＳＡＰデリバリー番号（明細）
     * @return The value of the column 'BATDELIDETAILNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBatdelidetailno() {
        checkSpecifiedProperty("batdelidetailno");
        return _batdelidetailno;
    }

    /**
     * [set] BATDELIDETAILNO: {bigint(19)} <br>
     * ＳＡＰデリバリー番号（明細）
     * @param batdelidetailno The value of the column 'BATDELIDETAILNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatdelidetailno(Long batdelidetailno) {
        registerModifiedProperty("batdelidetailno");
        _batdelidetailno = batdelidetailno;
    }

    /**
     * [get] BATWAREHOUSECD: {varchar(30)} <br>
     * ＢＡＴ搬入依頼拠点CD
     * @return The value of the column 'BATWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatwarehousecd() {
        checkSpecifiedProperty("batwarehousecd");
        return convertEmptyToNull(_batwarehousecd);
    }

    /**
     * [set] BATWAREHOUSECD: {varchar(30)} <br>
     * ＢＡＴ搬入依頼拠点CD
     * @param batwarehousecd The value of the column 'BATWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatwarehousecd(String batwarehousecd) {
        registerModifiedProperty("batwarehousecd");
        _batwarehousecd = batwarehousecd;
    }

    /**
     * [get] BATKEEPWAREHOUSECD: {varchar(30)} <br>
     * ＢＡＴ搬入依頼保管場所CD
     * @return The value of the column 'BATKEEPWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatkeepwarehousecd() {
        checkSpecifiedProperty("batkeepwarehousecd");
        return convertEmptyToNull(_batkeepwarehousecd);
    }

    /**
     * [set] BATKEEPWAREHOUSECD: {varchar(30)} <br>
     * ＢＡＴ搬入依頼保管場所CD
     * @param batkeepwarehousecd The value of the column 'BATKEEPWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatkeepwarehousecd(String batkeepwarehousecd) {
        registerModifiedProperty("batkeepwarehousecd");
        _batkeepwarehousecd = batkeepwarehousecd;
    }

    /**
     * [get] BATPARTNERNORCV: {varchar(30)} <br>
     * パートナー番号（受信）
     * @return The value of the column 'BATPARTNERNORCV'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatpartnernorcv() {
        checkSpecifiedProperty("batpartnernorcv");
        return convertEmptyToNull(_batpartnernorcv);
    }

    /**
     * [set] BATPARTNERNORCV: {varchar(30)} <br>
     * パートナー番号（受信）
     * @param batpartnernorcv The value of the column 'BATPARTNERNORCV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatpartnernorcv(String batpartnernorcv) {
        registerModifiedProperty("batpartnernorcv");
        _batpartnernorcv = batpartnernorcv;
    }

    /**
     * [get] BATPARTNERNOSND: {varchar(30)} <br>
     * パートナー番号（送信）
     * @return The value of the column 'BATPARTNERNOSND'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatpartnernosnd() {
        checkSpecifiedProperty("batpartnernosnd");
        return convertEmptyToNull(_batpartnernosnd);
    }

    /**
     * [set] BATPARTNERNOSND: {varchar(30)} <br>
     * パートナー番号（送信）
     * @param batpartnernosnd The value of the column 'BATPARTNERNOSND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatpartnernosnd(String batpartnernosnd) {
        registerModifiedProperty("batpartnernosnd");
        _batpartnernosnd = batpartnernosnd;
    }

    /**
     * [get] BATDELIDETAILNUM: {bigint(19)} <br>
     * 伝票番号
     * @return The value of the column 'BATDELIDETAILNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBatdelidetailnum() {
        checkSpecifiedProperty("batdelidetailnum");
        return _batdelidetailnum;
    }

    /**
     * [set] BATDELIDETAILNUM: {bigint(19)} <br>
     * 伝票番号
     * @param batdelidetailnum The value of the column 'BATDELIDETAILNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatdelidetailnum(Long batdelidetailnum) {
        registerModifiedProperty("batdelidetailnum");
        _batdelidetailnum = batdelidetailnum;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] EXPECTQTY1: {decimal(16, 6)} <br>
     * 個数（個装）
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getExpectqty1() {
        checkSpecifiedProperty("expectqty1");
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {decimal(16, 6)} <br>
     * 個数（個装）
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectqty1(java.math.BigDecimal expectqty1) {
        registerModifiedProperty("expectqty1");
        _expectqty1 = expectqty1;
    }

    /**
     * [get] DATA_MAKE_FLG: {char(1)} <br>
     * データ作成フラグ
     * @return The value of the column 'DATA_MAKE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataMakeFlg() {
        checkSpecifiedProperty("dataMakeFlg");
        return convertEmptyToNull(_dataMakeFlg);
    }

    /**
     * [set] DATA_MAKE_FLG: {char(1)} <br>
     * データ作成フラグ
     * @param dataMakeFlg The value of the column 'DATA_MAKE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataMakeFlg(String dataMakeFlg) {
        registerModifiedProperty("dataMakeFlg");
        _dataMakeFlg = dataMakeFlg;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata1() {
        checkSpecifiedProperty("vaExtdata1");
        return convertEmptyToNull(_vaExtdata1);
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata1(String vaExtdata1) {
        registerModifiedProperty("vaExtdata1");
        _vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @return The value of the column 'VA_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata2() {
        checkSpecifiedProperty("vaExtdata2");
        return convertEmptyToNull(_vaExtdata2);
    }

    /**
     * [set] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @param vaExtdata2 The value of the column 'VA_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata2(String vaExtdata2) {
        registerModifiedProperty("vaExtdata2");
        _vaExtdata2 = vaExtdata2;
    }

    /**
     * [get] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @return The value of the column 'VA_EXTDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata3() {
        checkSpecifiedProperty("vaExtdata3");
        return convertEmptyToNull(_vaExtdata3);
    }

    /**
     * [set] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @param vaExtdata3 The value of the column 'VA_EXTDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata3(String vaExtdata3) {
        registerModifiedProperty("vaExtdata3");
        _vaExtdata3 = vaExtdata3;
    }

    /**
     * [get] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @return The value of the column 'NV_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getNvExtdata1() {
        checkSpecifiedProperty("nvExtdata1");
        return convertEmptyToNull(_nvExtdata1);
    }

    /**
     * [set] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @param nvExtdata1 The value of the column 'NV_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNvExtdata1(String nvExtdata1) {
        registerModifiedProperty("nvExtdata1");
        _nvExtdata1 = nvExtdata1;
    }

    /**
     * [get] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @return The value of the column 'NV_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getNvExtdata2() {
        checkSpecifiedProperty("nvExtdata2");
        return convertEmptyToNull(_nvExtdata2);
    }

    /**
     * [set] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @param nvExtdata2 The value of the column 'NV_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNvExtdata2(String nvExtdata2) {
        registerModifiedProperty("nvExtdata2");
        _nvExtdata2 = nvExtdata2;
    }

    /**
     * [get] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @return The value of the column 'NV_EXTDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public String getNvExtdata3() {
        checkSpecifiedProperty("nvExtdata3");
        return convertEmptyToNull(_nvExtdata3);
    }

    /**
     * [set] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @param nvExtdata3 The value of the column 'NV_EXTDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNvExtdata3(String nvExtdata3) {
        registerModifiedProperty("nvExtdata3");
        _nvExtdata3 = nvExtdata3;
    }

    /**
     * [get] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @return The value of the column 'NM_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNmExtdata1() {
        checkSpecifiedProperty("nmExtdata1");
        return _nmExtdata1;
    }

    /**
     * [set] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @param nmExtdata1 The value of the column 'NM_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmExtdata1(Long nmExtdata1) {
        registerModifiedProperty("nmExtdata1");
        _nmExtdata1 = nmExtdata1;
    }

    /**
     * [get] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @return The value of the column 'NM_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNmExtdata2() {
        checkSpecifiedProperty("nmExtdata2");
        return _nmExtdata2;
    }

    /**
     * [set] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @param nmExtdata2 The value of the column 'NM_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmExtdata2(Long nmExtdata2) {
        registerModifiedProperty("nmExtdata2");
        _nmExtdata2 = nmExtdata2;
    }

    /**
     * [get] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @return The value of the column 'NM_EXTDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNmExtdata3() {
        checkSpecifiedProperty("nmExtdata3");
        return _nmExtdata3;
    }

    /**
     * [set] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @param nmExtdata3 The value of the column 'NM_EXTDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNmExtdata3(Long nmExtdata3) {
        registerModifiedProperty("nmExtdata3");
        _nmExtdata3 = nmExtdata3;
    }

    /**
     * [get] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @return The value of the column 'DT_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata1() {
        checkSpecifiedProperty("dtExtdata1");
        return convertEmptyToNull(_dtExtdata1);
    }

    /**
     * [set] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @param dtExtdata1 The value of the column 'DT_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata1(String dtExtdata1) {
        registerModifiedProperty("dtExtdata1");
        _dtExtdata1 = dtExtdata1;
    }

    /**
     * [get] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @return The value of the column 'DT_EXTDATA2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata2() {
        checkSpecifiedProperty("dtExtdata2");
        return convertEmptyToNull(_dtExtdata2);
    }

    /**
     * [set] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @param dtExtdata2 The value of the column 'DT_EXTDATA2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata2(String dtExtdata2) {
        registerModifiedProperty("dtExtdata2");
        _dtExtdata2 = dtExtdata2;
    }

    /**
     * [get] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @return The value of the column 'DT_EXTDATA3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtExtdata3() {
        checkSpecifiedProperty("dtExtdata3");
        return convertEmptyToNull(_dtExtdata3);
    }

    /**
     * [set] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @param dtExtdata3 The value of the column 'DT_EXTDATA3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtExtdata3(String dtExtdata3) {
        registerModifiedProperty("dtExtdata3");
        _dtExtdata3 = dtExtdata3;
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
