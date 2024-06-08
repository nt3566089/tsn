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
 * The entity of E_STOCK_INQUIRY_ANSWER as TABLE. <br>
 * 在庫照会回答送信テーブル
 * <pre>
 * [primary-key]
 *     TRINVREANSWER_ID
 *
 * [column]
 *     TRINVREANSWER_ID, INVINQNO, INVINQDATE, COMPANYCD, PRODUCT_CD, MANUFACTURDATE, DESIGNCD, STOCKKBN, STOCKQTY, TRANSPORTCD, FIRMCARRYNO, SHIPCD, SHIPSCHDATE, RECEIVEDATE, RCVSCHDATE, EXPECTQTY, GETDATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRINVREANSWER_ID
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
 * Long trinvreanswerId = entity.getTrinvreanswerId();
 * String invinqno = entity.getInvinqno();
 * String invinqdate = entity.getInvinqdate();
 * String companycd = entity.getCompanycd();
 * String productCd = entity.getProductCd();
 * String manufacturdate = entity.getManufacturdate();
 * String designcd = entity.getDesigncd();
 * String stockkbn = entity.getStockkbn();
 * Long stockqty = entity.getStockqty();
 * String transportcd = entity.getTransportcd();
 * String firmcarryno = entity.getFirmcarryno();
 * String shipcd = entity.getShipcd();
 * String shipschdate = entity.getShipschdate();
 * String receivedate = entity.getReceivedate();
 * String rcvschdate = entity.getRcvschdate();
 * Long expectqty = entity.getExpectqty();
 * String getdate = entity.getGetdate();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrinvreanswerId(trinvreanswerId);
 * entity.setInvinqno(invinqno);
 * entity.setInvinqdate(invinqdate);
 * entity.setCompanycd(companycd);
 * entity.setProductCd(productCd);
 * entity.setManufacturdate(manufacturdate);
 * entity.setDesigncd(designcd);
 * entity.setStockkbn(stockkbn);
 * entity.setStockqty(stockqty);
 * entity.setTransportcd(transportcd);
 * entity.setFirmcarryno(firmcarryno);
 * entity.setShipcd(shipcd);
 * entity.setShipschdate(shipschdate);
 * entity.setReceivedate(receivedate);
 * entity.setRcvschdate(rcvschdate);
 * entity.setExpectqty(expectqty);
 * entity.setGetdate(getdate);
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
public abstract class BsEStockInquiryAnswer extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRINVREANSWER_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trinvreanswerId;

    /** INVINQNO: {NotNull, varchar(30)} */
    protected String _invinqno;

    /** INVINQDATE: {UQ+, IX, NotNull, varchar(8)} */
    protected String _invinqdate;

    /** COMPANYCD: {+UQ, NotNull, varchar(30)} */
    protected String _companycd;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** MANUFACTURDATE: {varchar(8)} */
    protected String _manufacturdate;

    /** DESIGNCD: {varchar(30)} */
    protected String _designcd;

    /** STOCKKBN: {varchar(30)} */
    protected String _stockkbn;

    /** STOCKQTY: {bigint(19), default=[0000000000000]} */
    protected Long _stockqty;

    /** TRANSPORTCD: {varchar(30)} */
    protected String _transportcd;

    /** FIRMCARRYNO: {varchar(30)} */
    protected String _firmcarryno;

    /** SHIPCD: {varchar(30)} */
    protected String _shipcd;

    /** SHIPSCHDATE: {varchar(8)} */
    protected String _shipschdate;

    /** RECEIVEDATE: {varchar(8)} */
    protected String _receivedate;

    /** RCVSCHDATE: {varchar(8)} */
    protected String _rcvschdate;

    /** EXPECTQTY: {bigint(19)} */
    protected Long _expectqty;

    /** GETDATE: {NotNull, varchar(8)} */
    protected String _getdate;

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
        return "E_STOCK_INQUIRY_ANSWER";
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
        if (_trinvreanswerId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param invinqdate : UQ+, IX, NotNull, varchar(8). (NotNull)
     * @param companycd : +UQ, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(String invinqdate, String companycd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("invinqdate");
        __uniqueDrivenProperties.addPropertyName("companycd");
        setInvinqdate(invinqdate);setCompanycd(companycd);
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
        if (obj instanceof BsEStockInquiryAnswer) {
            BsEStockInquiryAnswer other = (BsEStockInquiryAnswer)obj;
            if (!xSV(_trinvreanswerId, other._trinvreanswerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trinvreanswerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trinvreanswerId));
        sb.append(dm).append(xfND(_invinqno));
        sb.append(dm).append(xfND(_invinqdate));
        sb.append(dm).append(xfND(_companycd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_manufacturdate));
        sb.append(dm).append(xfND(_designcd));
        sb.append(dm).append(xfND(_stockkbn));
        sb.append(dm).append(xfND(_stockqty));
        sb.append(dm).append(xfND(_transportcd));
        sb.append(dm).append(xfND(_firmcarryno));
        sb.append(dm).append(xfND(_shipcd));
        sb.append(dm).append(xfND(_shipschdate));
        sb.append(dm).append(xfND(_receivedate));
        sb.append(dm).append(xfND(_rcvschdate));
        sb.append(dm).append(xfND(_expectqty));
        sb.append(dm).append(xfND(_getdate));
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
    public EStockInquiryAnswer clone() {
        return (EStockInquiryAnswer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRINVREANSWER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫照会回答情報送信ID
     * @return The value of the column 'TRINVREANSWER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrinvreanswerId() {
        checkSpecifiedProperty("trinvreanswerId");
        return _trinvreanswerId;
    }

    /**
     * [set] TRINVREANSWER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫照会回答情報送信ID
     * @param trinvreanswerId The value of the column 'TRINVREANSWER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrinvreanswerId(Long trinvreanswerId) {
        registerModifiedProperty("trinvreanswerId");
        _trinvreanswerId = trinvreanswerId;
    }

    /**
     * [get] INVINQNO: {NotNull, varchar(30)} <br>
     * 在庫照会No.
     * @return The value of the column 'INVINQNO'. (basically NotNull if selected: for the constraint)
     */
    public String getInvinqno() {
        checkSpecifiedProperty("invinqno");
        return convertEmptyToNull(_invinqno);
    }

    /**
     * [set] INVINQNO: {NotNull, varchar(30)} <br>
     * 在庫照会No.
     * @param invinqno The value of the column 'INVINQNO'. (basically NotNull if update: for the constraint)
     */
    public void setInvinqno(String invinqno) {
        registerModifiedProperty("invinqno");
        _invinqno = invinqno;
    }

    /**
     * [get] INVINQDATE: {UQ+, IX, NotNull, varchar(8)} <br>
     * 在庫照会日
     * @return The value of the column 'INVINQDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getInvinqdate() {
        checkSpecifiedProperty("invinqdate");
        return convertEmptyToNull(_invinqdate);
    }

    /**
     * [set] INVINQDATE: {UQ+, IX, NotNull, varchar(8)} <br>
     * 在庫照会日
     * @param invinqdate The value of the column 'INVINQDATE'. (basically NotNull if update: for the constraint)
     */
    public void setInvinqdate(String invinqdate) {
        registerModifiedProperty("invinqdate");
        _invinqdate = invinqdate;
    }

    /**
     * [get] COMPANYCD: {+UQ, NotNull, varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'COMPANYCD'. (basically NotNull if selected: for the constraint)
     */
    public String getCompanycd() {
        checkSpecifiedProperty("companycd");
        return convertEmptyToNull(_companycd);
    }

    /**
     * [set] COMPANYCD: {+UQ, NotNull, varchar(30)} <br>
     * 組織CD
     * @param companycd The value of the column 'COMPANYCD'. (basically NotNull if update: for the constraint)
     */
    public void setCompanycd(String companycd) {
        registerModifiedProperty("companycd");
        _companycd = companycd;
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
     * [get] MANUFACTURDATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTURDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufacturdate() {
        checkSpecifiedProperty("manufacturdate");
        return convertEmptyToNull(_manufacturdate);
    }

    /**
     * [set] MANUFACTURDATE: {varchar(8)} <br>
     * 製造年月日
     * @param manufacturdate The value of the column 'MANUFACTURDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufacturdate(String manufacturdate) {
        registerModifiedProperty("manufacturdate");
        _manufacturdate = manufacturdate;
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
     * [get] STOCKKBN: {varchar(30)} <br>
     * 在庫区分
     * @return The value of the column 'STOCKKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockkbn() {
        checkSpecifiedProperty("stockkbn");
        return convertEmptyToNull(_stockkbn);
    }

    /**
     * [set] STOCKKBN: {varchar(30)} <br>
     * 在庫区分
     * @param stockkbn The value of the column 'STOCKKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockkbn(String stockkbn) {
        registerModifiedProperty("stockkbn");
        _stockkbn = stockkbn;
    }

    /**
     * [get] STOCKQTY: {bigint(19), default=[0000000000000]} <br>
     * 在庫数量
     * @return The value of the column 'STOCKQTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockqty() {
        checkSpecifiedProperty("stockqty");
        return _stockqty;
    }

    /**
     * [set] STOCKQTY: {bigint(19), default=[0000000000000]} <br>
     * 在庫数量
     * @param stockqty The value of the column 'STOCKQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockqty(Long stockqty) {
        registerModifiedProperty("stockqty");
        _stockqty = stockqty;
    }

    /**
     * [get] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号(整理番号)
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportcd() {
        checkSpecifiedProperty("transportcd");
        return convertEmptyToNull(_transportcd);
    }

    /**
     * [set] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号(整理番号)
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportcd(String transportcd) {
        registerModifiedProperty("transportcd");
        _transportcd = transportcd;
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
     * [get] SHIPCD: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SHIPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipcd() {
        checkSpecifiedProperty("shipcd");
        return convertEmptyToNull(_shipcd);
    }

    /**
     * [set] SHIPCD: {varchar(30)} <br>
     * 発送元CD
     * @param shipcd The value of the column 'SHIPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipcd(String shipcd) {
        registerModifiedProperty("shipcd");
        _shipcd = shipcd;
    }

    /**
     * [get] SHIPSCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SHIPSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipschdate() {
        checkSpecifiedProperty("shipschdate");
        return convertEmptyToNull(_shipschdate);
    }

    /**
     * [set] SHIPSCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipschdate(String shipschdate) {
        registerModifiedProperty("shipschdate");
        _shipschdate = shipschdate;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedate() {
        checkSpecifiedProperty("receivedate");
        return convertEmptyToNull(_receivedate);
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedate(String receivedate) {
        registerModifiedProperty("receivedate");
        _receivedate = receivedate;
    }

    /**
     * [get] RCVSCHDATE: {varchar(8)} <br>
     * 入庫予定年月日
     * @return The value of the column 'RCVSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvschdate() {
        checkSpecifiedProperty("rcvschdate");
        return convertEmptyToNull(_rcvschdate);
    }

    /**
     * [set] RCVSCHDATE: {varchar(8)} <br>
     * 入庫予定年月日
     * @param rcvschdate The value of the column 'RCVSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvschdate(String rcvschdate) {
        registerModifiedProperty("rcvschdate");
        _rcvschdate = rcvschdate;
    }

    /**
     * [get] EXPECTQTY: {bigint(19)} <br>
     * 受入予定数量
     * @return The value of the column 'EXPECTQTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getExpectqty() {
        checkSpecifiedProperty("expectqty");
        return _expectqty;
    }

    /**
     * [set] EXPECTQTY: {bigint(19)} <br>
     * 受入予定数量
     * @param expectqty The value of the column 'EXPECTQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectqty(Long expectqty) {
        registerModifiedProperty("expectqty");
        _expectqty = expectqty;
    }

    /**
     * [get] GETDATE: {NotNull, varchar(8)} <br>
     * データ取得日時
     * @return The value of the column 'GETDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getGetdate() {
        checkSpecifiedProperty("getdate");
        return convertEmptyToNull(_getdate);
    }

    /**
     * [set] GETDATE: {NotNull, varchar(8)} <br>
     * データ取得日時
     * @param getdate The value of the column 'GETDATE'. (basically NotNull if update: for the constraint)
     */
    public void setGetdate(String getdate) {
        registerModifiedProperty("getdate");
        _getdate = getdate;
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
