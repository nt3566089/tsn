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
 * The entity of E_PRODUCT_SEND as TABLE. <br>
 * 銘柄テーブル送信
 * <pre>
 * [primary-key]
 *     PRODUCT_SEND_ID
 *
 * [column]
 *     PRODUCT_SEND_ID, SEND_CD, SEND_ROW_ID, PROCESSED_FLG, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, PRICE_BUY, UNIT2, BX_PER_NUMBER, P_BX_COUNT, F_USER1, LENGTH1, WIDTH1, HEIGHT1, P_ODD, SP_OPERATOR1, MANUITEMCD, USERUSE3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_SEND_ID
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
 * Long productSendId = entity.getProductSendId();
 * String sendCd = entity.getSendCd();
 * Long sendRowId = entity.getSendRowId();
 * String processedFlg = entity.getProcessedFlg();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String productAbbr = entity.getProductAbbr();
 * Long priceBuy = entity.getPriceBuy();
 * java.math.BigDecimal unit2 = entity.getUnit2();
 * java.math.BigDecimal bxPerNumber = entity.getBxPerNumber();
 * java.math.BigDecimal pBxCount = entity.getPBxCount();
 * String fUser1 = entity.getFUser1();
 * Long length1 = entity.getLength1();
 * Long width1 = entity.getWidth1();
 * Long height1 = entity.getHeight1();
 * java.math.BigDecimal pOdd = entity.getPOdd();
 * String spOperator1 = entity.getSpOperator1();
 * String manuitemcd = entity.getManuitemcd();
 * String useruse3 = entity.getUseruse3();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setProductSendId(productSendId);
 * entity.setSendCd(sendCd);
 * entity.setSendRowId(sendRowId);
 * entity.setProcessedFlg(processedFlg);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setProductAbbr(productAbbr);
 * entity.setPriceBuy(priceBuy);
 * entity.setUnit2(unit2);
 * entity.setBxPerNumber(bxPerNumber);
 * entity.setPBxCount(pBxCount);
 * entity.setFUser1(fUser1);
 * entity.setLength1(length1);
 * entity.setWidth1(width1);
 * entity.setHeight1(height1);
 * entity.setPOdd(pOdd);
 * entity.setSpOperator1(spOperator1);
 * entity.setManuitemcd(manuitemcd);
 * entity.setUseruse3(useruse3);
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
public abstract class BsEProductSend extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _productSendId;

    /** SEND_CD: {varchar(30)} */
    protected String _sendCd;

    /** SEND_ROW_ID: {bigint(19)} */
    protected Long _sendRowId;

    /** PROCESSED_FLG: {NotNull, char(1), default=[0]} */
    protected String _processedFlg;

    /** PRODUCT_CD: {NotNull, varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {NotNull, varchar(255)} */
    protected String _productNm;

    /** PRODUCT_ABBR: {NotNull, varchar(60)} */
    protected String _productAbbr;

    /** PRICE_BUY: {NotNull, bigint(19)} */
    protected Long _priceBuy;

    /** UNIT2: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _unit2;

    /** BX_PER_NUMBER: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _bxPerNumber;

    /** P_BX_COUNT: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _pBxCount;

    /** F_USER1: {varchar(30)} */
    protected String _fUser1;

    /** LENGTH1: {bigint(19)} */
    protected Long _length1;

    /** WIDTH1: {bigint(19)} */
    protected Long _width1;

    /** HEIGHT1: {bigint(19)} */
    protected Long _height1;

    /** P_ODD: {decimal(16, 6)} */
    protected java.math.BigDecimal _pOdd;

    /** SP_OPERATOR1: {varchar(30)} */
    protected String _spOperator1;

    /** MANUITEMCD: {varchar(30)} */
    protected String _manuitemcd;

    /** USERUSE3: {NotNull, varchar(60)} */
    protected String _useruse3;

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
        return "E_PRODUCT_SEND";
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
        if (_productSendId == null) { return false; }
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
        if (obj instanceof BsEProductSend) {
            BsEProductSend other = (BsEProductSend)obj;
            if (!xSV(_productSendId, other._productSendId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productSendId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productSendId));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendRowId));
        sb.append(dm).append(xfND(_processedFlg));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_priceBuy));
        sb.append(dm).append(xfND(_unit2));
        sb.append(dm).append(xfND(_bxPerNumber));
        sb.append(dm).append(xfND(_pBxCount));
        sb.append(dm).append(xfND(_fUser1));
        sb.append(dm).append(xfND(_length1));
        sb.append(dm).append(xfND(_width1));
        sb.append(dm).append(xfND(_height1));
        sb.append(dm).append(xfND(_pOdd));
        sb.append(dm).append(xfND(_spOperator1));
        sb.append(dm).append(xfND(_manuitemcd));
        sb.append(dm).append(xfND(_useruse3));
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
    public EProductSend clone() {
        return (EProductSend)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 銘柄テーブル送信ID
     * @return The value of the column 'PRODUCT_SEND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductSendId() {
        checkSpecifiedProperty("productSendId");
        return _productSendId;
    }

    /**
     * [set] PRODUCT_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 銘柄テーブル送信ID
     * @param productSendId The value of the column 'PRODUCT_SEND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductSendId(Long productSendId) {
        registerModifiedProperty("productSendId");
        _productSendId = productSendId;
    }

    /**
     * [get] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSendCd() {
        checkSpecifiedProperty("sendCd");
        return convertEmptyToNull(_sendCd);
    }

    /**
     * [set] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendCd(String sendCd) {
        registerModifiedProperty("sendCd");
        _sendCd = sendCd;
    }

    /**
     * [get] SEND_ROW_ID: {bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSendRowId() {
        checkSpecifiedProperty("sendRowId");
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendRowId(Long sendRowId) {
        registerModifiedProperty("sendRowId");
        _sendRowId = sendRowId;
    }

    /**
     * [get] PROCESSED_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'PROCESSED_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getProcessedFlg() {
        checkSpecifiedProperty("processedFlg");
        return convertEmptyToNull(_processedFlg);
    }

    /**
     * [set] PROCESSED_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @param processedFlg The value of the column 'PROCESSED_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setProcessedFlg(String processedFlg) {
        registerModifiedProperty("processedFlg");
        _processedFlg = processedFlg;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(100)} <br>
     * 銘柄コード
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(100)} <br>
     * 銘柄コード
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {NotNull, varchar(255)} <br>
     * 銘柄名正称（全角）
     * @return The value of the column 'PRODUCT_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {NotNull, varchar(255)} <br>
     * 銘柄名正称（全角）
     * @param productNm The value of the column 'PRODUCT_NM'. (basically NotNull if update: for the constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] PRODUCT_ABBR: {NotNull, varchar(60)} <br>
     * 銘柄名略称（半角）
     * @return The value of the column 'PRODUCT_ABBR'. (basically NotNull if selected: for the constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {NotNull, varchar(60)} <br>
     * 銘柄名略称（半角）
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (basically NotNull if update: for the constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
    }

    /**
     * [get] PRICE_BUY: {NotNull, bigint(19)} <br>
     * 装置本数
     * @return The value of the column 'PRICE_BUY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPriceBuy() {
        checkSpecifiedProperty("priceBuy");
        return _priceBuy;
    }

    /**
     * [set] PRICE_BUY: {NotNull, bigint(19)} <br>
     * 装置本数
     * @param priceBuy The value of the column 'PRICE_BUY'. (basically NotNull if update: for the constraint)
     */
    public void setPriceBuy(Long priceBuy) {
        registerModifiedProperty("priceBuy");
        _priceBuy = priceBuy;
    }

    /**
     * [get] UNIT2: {NotNull, decimal(16, 6)} <br>
     * 1カートン当個数
     * @return The value of the column 'UNIT2'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getUnit2() {
        checkSpecifiedProperty("unit2");
        return _unit2;
    }

    /**
     * [set] UNIT2: {NotNull, decimal(16, 6)} <br>
     * 1カートン当個数
     * @param unit2 The value of the column 'UNIT2'. (basically NotNull if update: for the constraint)
     */
    public void setUnit2(java.math.BigDecimal unit2) {
        registerModifiedProperty("unit2");
        _unit2 = unit2;
    }

    /**
     * [get] BX_PER_NUMBER: {NotNull, decimal(16, 6)} <br>
     * 1段ボール当個数
     * @return The value of the column 'BX_PER_NUMBER'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getBxPerNumber() {
        checkSpecifiedProperty("bxPerNumber");
        return _bxPerNumber;
    }

    /**
     * [set] BX_PER_NUMBER: {NotNull, decimal(16, 6)} <br>
     * 1段ボール当個数
     * @param bxPerNumber The value of the column 'BX_PER_NUMBER'. (basically NotNull if update: for the constraint)
     */
    public void setBxPerNumber(java.math.BigDecimal bxPerNumber) {
        registerModifiedProperty("bxPerNumber");
        _bxPerNumber = bxPerNumber;
    }

    /**
     * [get] P_BX_COUNT: {NotNull, decimal(16, 6)} <br>
     * 1パレット当段ボール数
     * @return The value of the column 'P_BX_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPBxCount() {
        checkSpecifiedProperty("PBxCount");
        return _pBxCount;
    }

    /**
     * [set] P_BX_COUNT: {NotNull, decimal(16, 6)} <br>
     * 1パレット当段ボール数
     * @param pBxCount The value of the column 'P_BX_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setPBxCount(java.math.BigDecimal pBxCount) {
        registerModifiedProperty("PBxCount");
        _pBxCount = pBxCount;
    }

    /**
     * [get] F_USER1: {varchar(30)} <br>
     * 特販業者コード
     * @return The value of the column 'F_USER1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser1() {
        checkSpecifiedProperty("FUser1");
        return convertEmptyToNull(_fUser1);
    }

    /**
     * [set] F_USER1: {varchar(30)} <br>
     * 特販業者コード
     * @param fUser1 The value of the column 'F_USER1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser1(String fUser1) {
        registerModifiedProperty("FUser1");
        _fUser1 = fUser1;
    }

    /**
     * [get] LENGTH1: {bigint(19)} <br>
     * 段ボール長さ（縦）
     * @return The value of the column 'LENGTH1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLength1() {
        checkSpecifiedProperty("length1");
        return _length1;
    }

    /**
     * [set] LENGTH1: {bigint(19)} <br>
     * 段ボール長さ（縦）
     * @param length1 The value of the column 'LENGTH1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLength1(Long length1) {
        registerModifiedProperty("length1");
        _length1 = length1;
    }

    /**
     * [get] WIDTH1: {bigint(19)} <br>
     * 段ボール幅（横）
     * @return The value of the column 'WIDTH1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWidth1() {
        checkSpecifiedProperty("width1");
        return _width1;
    }

    /**
     * [set] WIDTH1: {bigint(19)} <br>
     * 段ボール幅（横）
     * @param width1 The value of the column 'WIDTH1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWidth1(Long width1) {
        registerModifiedProperty("width1");
        _width1 = width1;
    }

    /**
     * [get] HEIGHT1: {bigint(19)} <br>
     * 段ボール高さ
     * @return The value of the column 'HEIGHT1'. (NullAllowed even if selected: for no constraint)
     */
    public Long getHeight1() {
        checkSpecifiedProperty("height1");
        return _height1;
    }

    /**
     * [set] HEIGHT1: {bigint(19)} <br>
     * 段ボール高さ
     * @param height1 The value of the column 'HEIGHT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHeight1(Long height1) {
        registerModifiedProperty("height1");
        _height1 = height1;
    }

    /**
     * [get] P_ODD: {decimal(16, 6)} <br>
     * 一段基準数
     * @return The value of the column 'P_ODD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPOdd() {
        checkSpecifiedProperty("POdd");
        return _pOdd;
    }

    /**
     * [set] P_ODD: {decimal(16, 6)} <br>
     * 一段基準数
     * @param pOdd The value of the column 'P_ODD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPOdd(java.math.BigDecimal pOdd) {
        registerModifiedProperty("POdd");
        _pOdd = pOdd;
    }

    /**
     * [get] SP_OPERATOR1: {varchar(30)} <br>
     * 段ボールコード
     * @return The value of the column 'SP_OPERATOR1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpOperator1() {
        checkSpecifiedProperty("spOperator1");
        return convertEmptyToNull(_spOperator1);
    }

    /**
     * [set] SP_OPERATOR1: {varchar(30)} <br>
     * 段ボールコード
     * @param spOperator1 The value of the column 'SP_OPERATOR1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpOperator1(String spOperator1) {
        registerModifiedProperty("spOperator1");
        _spOperator1 = spOperator1;
    }

    /**
     * [get] MANUITEMCD: {varchar(30)} <br>
     * ITFバーコード
     * @return The value of the column 'MANUITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getManuitemcd() {
        checkSpecifiedProperty("manuitemcd");
        return convertEmptyToNull(_manuitemcd);
    }

    /**
     * [set] MANUITEMCD: {varchar(30)} <br>
     * ITFバーコード
     * @param manuitemcd The value of the column 'MANUITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManuitemcd(String manuitemcd) {
        registerModifiedProperty("manuitemcd");
        _manuitemcd = manuitemcd;
    }

    /**
     * [get] USERUSE3: {NotNull, varchar(60)} <br>
     * レコード更新処理区分
     * @return The value of the column 'USERUSE3'. (basically NotNull if selected: for the constraint)
     */
    public String getUseruse3() {
        checkSpecifiedProperty("useruse3");
        return convertEmptyToNull(_useruse3);
    }

    /**
     * [set] USERUSE3: {NotNull, varchar(60)} <br>
     * レコード更新処理区分
     * @param useruse3 The value of the column 'USERUSE3'. (basically NotNull if update: for the constraint)
     */
    public void setUseruse3(String useruse3) {
        registerModifiedProperty("useruse3");
        _useruse3 = useruse3;
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
