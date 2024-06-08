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
 * The entity of T_TRLEAVERESULT as TABLE. <br>
 * 出庫実績情報
 * <pre>
 * [primary-key]
 *     TRLEAVERESULT_ID
 *
 * [column]
 *     TRLEAVERESULT_ID, LEAVERESULTKEY, REFNO, TAXPALLETNO, FACTORYCD, PRODUCT_CD, MACHINENO, CREATENO, RCVKEY, CASEFLG, FIRMCARRYNO, LIMITDATE, DESIGNCD, BATJMFYM, QTY, LASTITEMCD, LASTDESIGNCD, SHIPCD, CARRYOUTDATE, SHIPTOCD, RCVDATE, SHTYPECD, TPLQTY, RCVPALLETNO, CASEQTY, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRLEAVERESULT_ID
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
 * Long trleaveresultId = entity.getTrleaveresultId();
 * java.math.BigDecimal leaveresultkey = entity.getLeaveresultkey();
 * String refno = entity.getRefno();
 * String taxpalletno = entity.getTaxpalletno();
 * String factorycd = entity.getFactorycd();
 * String productCd = entity.getProductCd();
 * String machineno = entity.getMachineno();
 * String createno = entity.getCreateno();
 * String rcvkey = entity.getRcvkey();
 * String caseflg = entity.getCaseflg();
 * String firmcarryno = entity.getFirmcarryno();
 * String limitdate = entity.getLimitdate();
 * String designcd = entity.getDesigncd();
 * String batjmfym = entity.getBatjmfym();
 * String qty = entity.getQty();
 * String lastitemcd = entity.getLastitemcd();
 * String lastdesigncd = entity.getLastdesigncd();
 * String shipcd = entity.getShipcd();
 * String carryoutdate = entity.getCarryoutdate();
 * String shiptocd = entity.getShiptocd();
 * String rcvdate = entity.getRcvdate();
 * String shtypecd = entity.getShtypecd();
 * String tplqty = entity.getTplqty();
 * String rcvpalletno = entity.getRcvpalletno();
 * String caseqty = entity.getCaseqty();
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
 * entity.setTrleaveresultId(trleaveresultId);
 * entity.setLeaveresultkey(leaveresultkey);
 * entity.setRefno(refno);
 * entity.setTaxpalletno(taxpalletno);
 * entity.setFactorycd(factorycd);
 * entity.setProductCd(productCd);
 * entity.setMachineno(machineno);
 * entity.setCreateno(createno);
 * entity.setRcvkey(rcvkey);
 * entity.setCaseflg(caseflg);
 * entity.setFirmcarryno(firmcarryno);
 * entity.setLimitdate(limitdate);
 * entity.setDesigncd(designcd);
 * entity.setBatjmfym(batjmfym);
 * entity.setQty(qty);
 * entity.setLastitemcd(lastitemcd);
 * entity.setLastdesigncd(lastdesigncd);
 * entity.setShipcd(shipcd);
 * entity.setCarryoutdate(carryoutdate);
 * entity.setShiptocd(shiptocd);
 * entity.setRcvdate(rcvdate);
 * entity.setShtypecd(shtypecd);
 * entity.setTplqty(tplqty);
 * entity.setRcvpalletno(rcvpalletno);
 * entity.setCaseqty(caseqty);
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
public abstract class BsTTrleaveresult extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRLEAVERESULT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trleaveresultId;

    /** LEAVERESULTKEY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _leaveresultkey;

    /** REFNO: {varchar(30)} */
    protected String _refno;

    /** TAXPALLETNO: {varchar(30)} */
    protected String _taxpalletno;

    /** FACTORYCD: {varchar(30)} */
    protected String _factorycd;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** MACHINENO: {varchar(30)} */
    protected String _machineno;

    /** CREATENO: {varchar(30)} */
    protected String _createno;

    /** RCVKEY: {varchar(30)} */
    protected String _rcvkey;

    /** CASEFLG: {char(1)} */
    protected String _caseflg;

    /** FIRMCARRYNO: {varchar(30)} */
    protected String _firmcarryno;

    /** LIMITDATE: {varchar(8)} */
    protected String _limitdate;

    /** DESIGNCD: {varchar(30)} */
    protected String _designcd;

    /** BATJMFYM: {varchar(30)} */
    protected String _batjmfym;

    /** QTY: {varchar(255)} */
    protected String _qty;

    /** LASTITEMCD: {varchar(30)} */
    protected String _lastitemcd;

    /** LASTDESIGNCD: {varchar(30)} */
    protected String _lastdesigncd;

    /** SHIPCD: {varchar(30)} */
    protected String _shipcd;

    /** CARRYOUTDATE: {varchar(8)} */
    protected String _carryoutdate;

    /** SHIPTOCD: {varchar(30)} */
    protected String _shiptocd;

    /** RCVDATE: {varchar(8)} */
    protected String _rcvdate;

    /** SHTYPECD: {varchar(30)} */
    protected String _shtypecd;

    /** TPLQTY: {varchar(30)} */
    protected String _tplqty;

    /** RCVPALLETNO: {varchar(30)} */
    protected String _rcvpalletno;

    /** CASEQTY: {varchar(30)} */
    protected String _caseqty;

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
        return "T_TRLEAVERESULT";
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
        if (_trleaveresultId == null) { return false; }
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
        if (obj instanceof BsTTrleaveresult) {
            BsTTrleaveresult other = (BsTTrleaveresult)obj;
            if (!xSV(_trleaveresultId, other._trleaveresultId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trleaveresultId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trleaveresultId));
        sb.append(dm).append(xfND(_leaveresultkey));
        sb.append(dm).append(xfND(_refno));
        sb.append(dm).append(xfND(_taxpalletno));
        sb.append(dm).append(xfND(_factorycd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_machineno));
        sb.append(dm).append(xfND(_createno));
        sb.append(dm).append(xfND(_rcvkey));
        sb.append(dm).append(xfND(_caseflg));
        sb.append(dm).append(xfND(_firmcarryno));
        sb.append(dm).append(xfND(_limitdate));
        sb.append(dm).append(xfND(_designcd));
        sb.append(dm).append(xfND(_batjmfym));
        sb.append(dm).append(xfND(_qty));
        sb.append(dm).append(xfND(_lastitemcd));
        sb.append(dm).append(xfND(_lastdesigncd));
        sb.append(dm).append(xfND(_shipcd));
        sb.append(dm).append(xfND(_carryoutdate));
        sb.append(dm).append(xfND(_shiptocd));
        sb.append(dm).append(xfND(_rcvdate));
        sb.append(dm).append(xfND(_shtypecd));
        sb.append(dm).append(xfND(_tplqty));
        sb.append(dm).append(xfND(_rcvpalletno));
        sb.append(dm).append(xfND(_caseqty));
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
    public TTrleaveresult clone() {
        return (TTrleaveresult)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRLEAVERESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫実績情報ID
     * @return The value of the column 'TRLEAVERESULT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrleaveresultId() {
        checkSpecifiedProperty("trleaveresultId");
        return _trleaveresultId;
    }

    /**
     * [set] TRLEAVERESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫実績情報ID
     * @param trleaveresultId The value of the column 'TRLEAVERESULT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrleaveresultId(Long trleaveresultId) {
        registerModifiedProperty("trleaveresultId");
        _trleaveresultId = trleaveresultId;
    }

    /**
     * [get] LEAVERESULTKEY: {NotNull, decimal(16, 6)} <br>
     * 出庫実績キー
     * @return The value of the column 'LEAVERESULTKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getLeaveresultkey() {
        checkSpecifiedProperty("leaveresultkey");
        return _leaveresultkey;
    }

    /**
     * [set] LEAVERESULTKEY: {NotNull, decimal(16, 6)} <br>
     * 出庫実績キー
     * @param leaveresultkey The value of the column 'LEAVERESULTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setLeaveresultkey(java.math.BigDecimal leaveresultkey) {
        registerModifiedProperty("leaveresultkey");
        _leaveresultkey = leaveresultkey;
    }

    /**
     * [get] REFNO: {varchar(30)} <br>
     * 整理番号
     * @return The value of the column 'REFNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRefno() {
        checkSpecifiedProperty("refno");
        return convertEmptyToNull(_refno);
    }

    /**
     * [set] REFNO: {varchar(30)} <br>
     * 整理番号
     * @param refno The value of the column 'REFNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRefno(String refno) {
        registerModifiedProperty("refno");
        _refno = refno;
    }

    /**
     * [get] TAXPALLETNO: {varchar(30)} <br>
     * 保税パレット番号
     * @return The value of the column 'TAXPALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTaxpalletno() {
        checkSpecifiedProperty("taxpalletno");
        return convertEmptyToNull(_taxpalletno);
    }

    /**
     * [set] TAXPALLETNO: {varchar(30)} <br>
     * 保税パレット番号
     * @param taxpalletno The value of the column 'TAXPALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTaxpalletno(String taxpalletno) {
        registerModifiedProperty("taxpalletno");
        _taxpalletno = taxpalletno;
    }

    /**
     * [get] FACTORYCD: {varchar(30)} <br>
     * 工場CD
     * @return The value of the column 'FACTORYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFactorycd() {
        checkSpecifiedProperty("factorycd");
        return convertEmptyToNull(_factorycd);
    }

    /**
     * [set] FACTORYCD: {varchar(30)} <br>
     * 工場CD
     * @param factorycd The value of the column 'FACTORYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFactorycd(String factorycd) {
        registerModifiedProperty("factorycd");
        _factorycd = factorycd;
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
     * [get] MACHINENO: {varchar(30)} <br>
     * 号機
     * @return The value of the column 'MACHINENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMachineno() {
        checkSpecifiedProperty("machineno");
        return convertEmptyToNull(_machineno);
    }

    /**
     * [set] MACHINENO: {varchar(30)} <br>
     * 号機
     * @param machineno The value of the column 'MACHINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMachineno(String machineno) {
        registerModifiedProperty("machineno");
        _machineno = machineno;
    }

    /**
     * [get] CREATENO: {varchar(30)} <br>
     * 生出番号
     * @return The value of the column 'CREATENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreateno() {
        checkSpecifiedProperty("createno");
        return convertEmptyToNull(_createno);
    }

    /**
     * [set] CREATENO: {varchar(30)} <br>
     * 生出番号
     * @param createno The value of the column 'CREATENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateno(String createno) {
        registerModifiedProperty("createno");
        _createno = createno;
    }

    /**
     * [get] RCVKEY: {varchar(30)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvkey() {
        checkSpecifiedProperty("rcvkey");
        return convertEmptyToNull(_rcvkey);
    }

    /**
     * [set] RCVKEY: {varchar(30)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvkey(String rcvkey) {
        registerModifiedProperty("rcvkey");
        _rcvkey = rcvkey;
    }

    /**
     * [get] CASEFLG: {char(1)} <br>
     * 段ボール有無フラグ
     * @return The value of the column 'CASEFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseflg() {
        checkSpecifiedProperty("caseflg");
        return convertEmptyToNull(_caseflg);
    }

    /**
     * [set] CASEFLG: {char(1)} <br>
     * 段ボール有無フラグ
     * @param caseflg The value of the column 'CASEFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseflg(String caseflg) {
        registerModifiedProperty("caseflg");
        _caseflg = caseflg;
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
     * [get] LIMITDATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LIMITDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitdate() {
        checkSpecifiedProperty("limitdate");
        return convertEmptyToNull(_limitdate);
    }

    /**
     * [set] LIMITDATE: {varchar(8)} <br>
     * 製造年月日
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitdate(String limitdate) {
        registerModifiedProperty("limitdate");
        _limitdate = limitdate;
    }

    /**
     * [get] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncd() {
        checkSpecifiedProperty("designcd");
        return convertEmptyToNull(_designcd);
    }

    /**
     * [set] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncd(String designcd) {
        registerModifiedProperty("designcd");
        _designcd = designcd;
    }

    /**
     * [get] BATJMFYM: {varchar(30)} <br>
     * BATJ製造月記号
     * @return The value of the column 'BATJMFYM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatjmfym() {
        checkSpecifiedProperty("batjmfym");
        return convertEmptyToNull(_batjmfym);
    }

    /**
     * [set] BATJMFYM: {varchar(30)} <br>
     * BATJ製造月記号
     * @param batjmfym The value of the column 'BATJMFYM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatjmfym(String batjmfym) {
        registerModifiedProperty("batjmfym");
        _batjmfym = batjmfym;
    }

    /**
     * [get] QTY: {varchar(255)} <br>
     * 個装数量
     * @return The value of the column 'QTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getQty() {
        checkSpecifiedProperty("qty");
        return convertEmptyToNull(_qty);
    }

    /**
     * [set] QTY: {varchar(255)} <br>
     * 個装数量
     * @param qty The value of the column 'QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty(String qty) {
        registerModifiedProperty("qty");
        _qty = qty;
    }

    /**
     * [get] LASTITEMCD: {varchar(30)} <br>
     * 銘柄変更前銘柄CD
     * @return The value of the column 'LASTITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLastitemcd() {
        checkSpecifiedProperty("lastitemcd");
        return convertEmptyToNull(_lastitemcd);
    }

    /**
     * [set] LASTITEMCD: {varchar(30)} <br>
     * 銘柄変更前銘柄CD
     * @param lastitemcd The value of the column 'LASTITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastitemcd(String lastitemcd) {
        registerModifiedProperty("lastitemcd");
        _lastitemcd = lastitemcd;
    }

    /**
     * [get] LASTDESIGNCD: {varchar(30)} <br>
     * 銘柄変更前デザイン区分
     * @return The value of the column 'LASTDESIGNCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLastdesigncd() {
        checkSpecifiedProperty("lastdesigncd");
        return convertEmptyToNull(_lastdesigncd);
    }

    /**
     * [set] LASTDESIGNCD: {varchar(30)} <br>
     * 銘柄変更前デザイン区分
     * @param lastdesigncd The value of the column 'LASTDESIGNCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastdesigncd(String lastdesigncd) {
        registerModifiedProperty("lastdesigncd");
        _lastdesigncd = lastdesigncd;
    }

    /**
     * [get] SHIPCD: {varchar(30)} <br>
     * 発地CD
     * @return The value of the column 'SHIPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipcd() {
        checkSpecifiedProperty("shipcd");
        return convertEmptyToNull(_shipcd);
    }

    /**
     * [set] SHIPCD: {varchar(30)} <br>
     * 発地CD
     * @param shipcd The value of the column 'SHIPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipcd(String shipcd) {
        registerModifiedProperty("shipcd");
        _shipcd = shipcd;
    }

    /**
     * [get] CARRYOUTDATE: {varchar(8)} <br>
     * 払出実績日
     * @return The value of the column 'CARRYOUTDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarryoutdate() {
        checkSpecifiedProperty("carryoutdate");
        return convertEmptyToNull(_carryoutdate);
    }

    /**
     * [set] CARRYOUTDATE: {varchar(8)} <br>
     * 払出実績日
     * @param carryoutdate The value of the column 'CARRYOUTDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarryoutdate(String carryoutdate) {
        registerModifiedProperty("carryoutdate");
        _carryoutdate = carryoutdate;
    }

    /**
     * [get] SHIPTOCD: {varchar(30)} <br>
     * 着地CD
     * @return The value of the column 'SHIPTOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptocd() {
        checkSpecifiedProperty("shiptocd");
        return convertEmptyToNull(_shiptocd);
    }

    /**
     * [set] SHIPTOCD: {varchar(30)} <br>
     * 着地CD
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptocd(String shiptocd) {
        registerModifiedProperty("shiptocd");
        _shiptocd = shiptocd;
    }

    /**
     * [get] RCVDATE: {varchar(8)} <br>
     * 受入予定日
     * @return The value of the column 'RCVDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvdate() {
        checkSpecifiedProperty("rcvdate");
        return convertEmptyToNull(_rcvdate);
    }

    /**
     * [set] RCVDATE: {varchar(8)} <br>
     * 受入予定日
     * @param rcvdate The value of the column 'RCVDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvdate(String rcvdate) {
        registerModifiedProperty("rcvdate");
        _rcvdate = rcvdate;
    }

    /**
     * [get] SHTYPECD: {varchar(30)} <br>
     * 輸送形態CD
     * @return The value of the column 'SHTYPECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShtypecd() {
        checkSpecifiedProperty("shtypecd");
        return convertEmptyToNull(_shtypecd);
    }

    /**
     * [set] SHTYPECD: {varchar(30)} <br>
     * 輸送形態CD
     * @param shtypecd The value of the column 'SHTYPECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShtypecd(String shtypecd) {
        registerModifiedProperty("shtypecd");
        _shtypecd = shtypecd;
    }

    /**
     * [get] TPLQTY: {varchar(30)} <br>
     * 総パレット数
     * @return The value of the column 'TPLQTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getTplqty() {
        checkSpecifiedProperty("tplqty");
        return convertEmptyToNull(_tplqty);
    }

    /**
     * [set] TPLQTY: {varchar(30)} <br>
     * 総パレット数
     * @param tplqty The value of the column 'TPLQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTplqty(String tplqty) {
        registerModifiedProperty("tplqty");
        _tplqty = tplqty;
    }

    /**
     * [get] RCVPALLETNO: {varchar(30)} <br>
     * 08需給パレット番号
     * @return The value of the column 'RCVPALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvpalletno() {
        checkSpecifiedProperty("rcvpalletno");
        return convertEmptyToNull(_rcvpalletno);
    }

    /**
     * [set] RCVPALLETNO: {varchar(30)} <br>
     * 08需給パレット番号
     * @param rcvpalletno The value of the column 'RCVPALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvpalletno(String rcvpalletno) {
        registerModifiedProperty("rcvpalletno");
        _rcvpalletno = rcvpalletno;
    }

    /**
     * [get] CASEQTY: {varchar(30)} <br>
     * 段ボール数
     * @return The value of the column 'CASEQTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseqty() {
        checkSpecifiedProperty("caseqty");
        return convertEmptyToNull(_caseqty);
    }

    /**
     * [set] CASEQTY: {varchar(30)} <br>
     * 段ボール数
     * @param caseqty The value of the column 'CASEQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseqty(String caseqty) {
        registerModifiedProperty("caseqty");
        _caseqty = caseqty;
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
