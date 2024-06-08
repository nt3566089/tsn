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
 * The entity of E_TRIFCASE as TABLE. <br>
 * IFケース情報
 * <pre>
 * [primary-key]
 *     JTSYMBOLNO
 *
 * [column]
 *     JTSYMBOLNO, FACTORYCD, PRODUCT_CD, MACHINENO, LIMITDATE, ORDERNO, CREATENO, SKUCD, DESTINATIONCD, MANUFACTURECD, DATETIME, DISTRIBUTIONCD, PALLETID, TRANSPORTCD, SHIPTOCD, HEAD_ORDERNO, CASEQTY, FRACTQTY, SYMBOLADDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * java.math.BigDecimal jtsymbolno = entity.getJtsymbolno();
 * String factorycd = entity.getFactorycd();
 * String productCd = entity.getProductCd();
 * String machineno = entity.getMachineno();
 * String limitdate = entity.getLimitdate();
 * String orderno = entity.getOrderno();
 * String createno = entity.getCreateno();
 * String skucd = entity.getSkucd();
 * String destinationcd = entity.getDestinationcd();
 * String manufacturecd = entity.getManufacturecd();
 * String datetime = entity.getDatetime();
 * String distributioncd = entity.getDistributioncd();
 * String palletid = entity.getPalletid();
 * String transportcd = entity.getTransportcd();
 * String shiptocd = entity.getShiptocd();
 * String headOrderno = entity.getHeadOrderno();
 * Long caseqty = entity.getCaseqty();
 * Long fractqty = entity.getFractqty();
 * String symboladdflg = entity.getSymboladdflg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setJtsymbolno(jtsymbolno);
 * entity.setFactorycd(factorycd);
 * entity.setProductCd(productCd);
 * entity.setMachineno(machineno);
 * entity.setLimitdate(limitdate);
 * entity.setOrderno(orderno);
 * entity.setCreateno(createno);
 * entity.setSkucd(skucd);
 * entity.setDestinationcd(destinationcd);
 * entity.setManufacturecd(manufacturecd);
 * entity.setDatetime(datetime);
 * entity.setDistributioncd(distributioncd);
 * entity.setPalletid(palletid);
 * entity.setTransportcd(transportcd);
 * entity.setShiptocd(shiptocd);
 * entity.setHeadOrderno(headOrderno);
 * entity.setCaseqty(caseqty);
 * entity.setFractqty(fractqty);
 * entity.setSymboladdflg(symboladdflg);
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
public abstract class BsETrifcase extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** JTSYMBOLNO: {PK, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _jtsymbolno;

    /** FACTORYCD: {varchar(30)} */
    protected String _factorycd;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** MACHINENO: {varchar(30)} */
    protected String _machineno;

    /** LIMITDATE: {varchar(8)} */
    protected String _limitdate;

    /** ORDERNO: {varchar(30)} */
    protected String _orderno;

    /** CREATENO: {varchar(30)} */
    protected String _createno;

    /** SKUCD: {varchar(30)} */
    protected String _skucd;

    /** DESTINATIONCD: {varchar(30)} */
    protected String _destinationcd;

    /** MANUFACTURECD: {varchar(30)} */
    protected String _manufacturecd;

    /** DATETIME: {varchar(8)} */
    protected String _datetime;

    /** DISTRIBUTIONCD: {char(1)} */
    protected String _distributioncd;

    /** PALLETID: {varchar(30)} */
    protected String _palletid;

    /** TRANSPORTCD: {varchar(30)} */
    protected String _transportcd;

    /** SHIPTOCD: {varchar(30)} */
    protected String _shiptocd;

    /** HEAD_ORDERNO: {varchar(30)} */
    protected String _headOrderno;

    /** CASEQTY: {bigint(19)} */
    protected Long _caseqty;

    /** FRACTQTY: {bigint(19)} */
    protected Long _fractqty;

    /** SYMBOLADDFLG: {char(1)} */
    protected String _symboladdflg;

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
        return "E_TRIFCASE";
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
        if (_jtsymbolno == null) { return false; }
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
        if (obj instanceof BsETrifcase) {
            BsETrifcase other = (BsETrifcase)obj;
            if (!xSV(_jtsymbolno, other._jtsymbolno)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _jtsymbolno);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_jtsymbolno));
        sb.append(dm).append(xfND(_factorycd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_machineno));
        sb.append(dm).append(xfND(_limitdate));
        sb.append(dm).append(xfND(_orderno));
        sb.append(dm).append(xfND(_createno));
        sb.append(dm).append(xfND(_skucd));
        sb.append(dm).append(xfND(_destinationcd));
        sb.append(dm).append(xfND(_manufacturecd));
        sb.append(dm).append(xfND(_datetime));
        sb.append(dm).append(xfND(_distributioncd));
        sb.append(dm).append(xfND(_palletid));
        sb.append(dm).append(xfND(_transportcd));
        sb.append(dm).append(xfND(_shiptocd));
        sb.append(dm).append(xfND(_headOrderno));
        sb.append(dm).append(xfND(_caseqty));
        sb.append(dm).append(xfND(_fractqty));
        sb.append(dm).append(xfND(_symboladdflg));
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
    public ETrifcase clone() {
        return (ETrifcase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] JTSYMBOLNO: {PK, NotNull, decimal(16, 6)} <br>
     * JT段ボール管理番号
     * @return The value of the column 'JTSYMBOLNO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getJtsymbolno() {
        checkSpecifiedProperty("jtsymbolno");
        return _jtsymbolno;
    }

    /**
     * [set] JTSYMBOLNO: {PK, NotNull, decimal(16, 6)} <br>
     * JT段ボール管理番号
     * @param jtsymbolno The value of the column 'JTSYMBOLNO'. (basically NotNull if update: for the constraint)
     */
    public void setJtsymbolno(java.math.BigDecimal jtsymbolno) {
        registerModifiedProperty("jtsymbolno");
        _jtsymbolno = jtsymbolno;
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
     * [get] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @return The value of the column 'ORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderno() {
        checkSpecifiedProperty("orderno");
        return convertEmptyToNull(_orderno);
    }

    /**
     * [set] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @param orderno The value of the column 'ORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderno(String orderno) {
        registerModifiedProperty("orderno");
        _orderno = orderno;
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
     * [get] SKUCD: {varchar(30)} <br>
     * SKUCD
     * @return The value of the column 'SKUCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSkucd() {
        checkSpecifiedProperty("skucd");
        return convertEmptyToNull(_skucd);
    }

    /**
     * [set] SKUCD: {varchar(30)} <br>
     * SKUCD
     * @param skucd The value of the column 'SKUCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSkucd(String skucd) {
        registerModifiedProperty("skucd");
        _skucd = skucd;
    }

    /**
     * [get] DESTINATIONCD: {varchar(30)} <br>
     * 仕向地CD
     * @return The value of the column 'DESTINATIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationcd() {
        checkSpecifiedProperty("destinationcd");
        return convertEmptyToNull(_destinationcd);
    }

    /**
     * [set] DESTINATIONCD: {varchar(30)} <br>
     * 仕向地CD
     * @param destinationcd The value of the column 'DESTINATIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationcd(String destinationcd) {
        registerModifiedProperty("destinationcd");
        _destinationcd = destinationcd;
    }

    /**
     * [get] MANUFACTURECD: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufacturecd() {
        checkSpecifiedProperty("manufacturecd");
        return convertEmptyToNull(_manufacturecd);
    }

    /**
     * [set] MANUFACTURECD: {varchar(30)} <br>
     * 製造記号
     * @param manufacturecd The value of the column 'MANUFACTURECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufacturecd(String manufacturecd) {
        registerModifiedProperty("manufacturecd");
        _manufacturecd = manufacturecd;
    }

    /**
     * [get] DATETIME: {varchar(8)} <br>
     * 日付時刻
     * @return The value of the column 'DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDatetime() {
        checkSpecifiedProperty("datetime");
        return convertEmptyToNull(_datetime);
    }

    /**
     * [set] DATETIME: {varchar(8)} <br>
     * 日付時刻
     * @param datetime The value of the column 'DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDatetime(String datetime) {
        registerModifiedProperty("datetime");
        _datetime = datetime;
    }

    /**
     * [get] DISTRIBUTIONCD: {char(1)} <br>
     * 流通識別
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistributioncd() {
        checkSpecifiedProperty("distributioncd");
        return convertEmptyToNull(_distributioncd);
    }

    /**
     * [set] DISTRIBUTIONCD: {char(1)} <br>
     * 流通識別
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistributioncd(String distributioncd) {
        registerModifiedProperty("distributioncd");
        _distributioncd = distributioncd;
    }

    /**
     * [get] PALLETID: {varchar(30)} <br>
     * パレットID
     * @return The value of the column 'PALLETID'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletid() {
        checkSpecifiedProperty("palletid");
        return convertEmptyToNull(_palletid);
    }

    /**
     * [set] PALLETID: {varchar(30)} <br>
     * パレットID
     * @param palletid The value of the column 'PALLETID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletid(String palletid) {
        registerModifiedProperty("palletid");
        _palletid = palletid;
    }

    /**
     * [get] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportcd() {
        checkSpecifiedProperty("transportcd");
        return convertEmptyToNull(_transportcd);
    }

    /**
     * [set] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportcd(String transportcd) {
        registerModifiedProperty("transportcd");
        _transportcd = transportcd;
    }

    /**
     * [get] SHIPTOCD: {varchar(30)} <br>
     * 受入先CD
     * @return The value of the column 'SHIPTOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptocd() {
        checkSpecifiedProperty("shiptocd");
        return convertEmptyToNull(_shiptocd);
    }

    /**
     * [set] SHIPTOCD: {varchar(30)} <br>
     * 受入先CD
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptocd(String shiptocd) {
        registerModifiedProperty("shiptocd");
        _shiptocd = shiptocd;
    }

    /**
     * [get] HEAD_ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @return The value of the column 'HEAD_ORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getHeadOrderno() {
        checkSpecifiedProperty("headOrderno");
        return convertEmptyToNull(_headOrderno);
    }

    /**
     * [set] HEAD_ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @param headOrderno The value of the column 'HEAD_ORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHeadOrderno(String headOrderno) {
        registerModifiedProperty("headOrderno");
        _headOrderno = headOrderno;
    }

    /**
     * [get] CASEQTY: {bigint(19)} <br>
     * ケース数
     * @return The value of the column 'CASEQTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCaseqty() {
        checkSpecifiedProperty("caseqty");
        return _caseqty;
    }

    /**
     * [set] CASEQTY: {bigint(19)} <br>
     * ケース数
     * @param caseqty The value of the column 'CASEQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseqty(Long caseqty) {
        registerModifiedProperty("caseqty");
        _caseqty = caseqty;
    }

    /**
     * [get] FRACTQTY: {bigint(19)} <br>
     * 個数
     * @return The value of the column 'FRACTQTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getFractqty() {
        checkSpecifiedProperty("fractqty");
        return _fractqty;
    }

    /**
     * [set] FRACTQTY: {bigint(19)} <br>
     * 個数
     * @param fractqty The value of the column 'FRACTQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFractqty(Long fractqty) {
        registerModifiedProperty("fractqty");
        _fractqty = fractqty;
    }

    /**
     * [get] SYMBOLADDFLG: {char(1)} <br>
     * 段ボール作成済フラグ
     * @return The value of the column 'SYMBOLADDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymboladdflg() {
        checkSpecifiedProperty("symboladdflg");
        return convertEmptyToNull(_symboladdflg);
    }

    /**
     * [set] SYMBOLADDFLG: {char(1)} <br>
     * 段ボール作成済フラグ
     * @param symboladdflg The value of the column 'SYMBOLADDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymboladdflg(String symboladdflg) {
        registerModifiedProperty("symboladdflg");
        _symboladdflg = symboladdflg;
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
