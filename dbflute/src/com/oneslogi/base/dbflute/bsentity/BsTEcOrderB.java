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
 * The entity of T_EC_ORDER_B as TABLE. <br>
 * EC受注ボディ
 * <pre>
 * [primary-key]
 *     EC_ORDER_B_ID
 *
 * [column]
 *     EC_ORDER_B_ID, EC_ORDER_H_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_OPTION, ORDER_NUM, UNIT_PRICE, UNIT_TOTAL_PRICE, ERROR_FLG, ERROR_MESSAGE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EC_ORDER_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_EC_ORDER_H, B_CLASS_DTL(ByErrorFlg)
 *
 * [referrer table]
 *     T_AMAZON_ORDER, T_RAKUTEN_ORDER, T_YAHOO_ORDER
 *
 * [foreign property]
 *     tEcOrderH, bClassDtlByErrorFlg
 *
 * [referrer property]
 *     tAmazonOrderList, tRakutenOrderList, tYahooOrderList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long ecOrderBId = entity.getEcOrderBId();
 * Long ecOrderHId = entity.getEcOrderHId();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String productOption = entity.getProductOption();
 * Long orderNum = entity.getOrderNum();
 * Long unitPrice = entity.getUnitPrice();
 * Long unitTotalPrice = entity.getUnitTotalPrice();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setEcOrderBId(ecOrderBId);
 * entity.setEcOrderHId(ecOrderHId);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setProductOption(productOption);
 * entity.setOrderNum(orderNum);
 * entity.setUnitPrice(unitPrice);
 * entity.setUnitTotalPrice(unitTotalPrice);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
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
public abstract class BsTEcOrderB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _ecOrderBId;

    /** EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H} */
    protected Long _ecOrderHId;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** PRODUCT_OPTION: {varchar(255)} */
    protected String _productOption;

    /** ORDER_NUM: {bigint(19)} */
    protected Long _orderNum;

    /** UNIT_PRICE: {bigint(19)} */
    protected Long _unitPrice;

    /** UNIT_TOTAL_PRICE: {bigint(19)} */
    protected Long _unitTotalPrice;

    /** ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

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
        return "T_EC_ORDER_B";
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
        if (_ecOrderBId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ErrorFlg getErrorFlgAsErrorFlg() {
        return CDef.ErrorFlg.codeOf(getErrorFlg());
    }

    /**
     * Set the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setErrorFlgAsErrorFlg(CDef.ErrorFlg cdef) {
        setErrorFlg(cdef != null ? cdef.code() : null);
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
     * Set the value of errorFlg as $0 (0). <br>
     * $0: エラー無
     */
    public void setErrorFlg_$0() {
        setErrorFlgAsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * Set the value of errorFlg as $1 (1). <br>
     * $1: エラー有
     */
    public void setErrorFlg_$1() {
        setErrorFlgAsErrorFlg(CDef.ErrorFlg.$1);
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
     * Is the value of errorFlg $0? <br>
     * $0: エラー無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorFlg$0() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.equals(CDef.ErrorFlg.$0) : false;
    }

    /**
     * Is the value of errorFlg $1? <br>
     * $1: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorFlg$1() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.equals(CDef.ErrorFlg.$1) : false;
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
     * Get the value of the column 'errorFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getErrorFlgName() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
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
    /** T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'. */
    protected TEcOrderH _tEcOrderH;

    /**
     * [get] T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'. <br>
     * @return The entity of foreign property 'TEcOrderH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TEcOrderH getTEcOrderH() {
        return _tEcOrderH;
    }

    /**
     * [set] T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'.
     * @param tEcOrderH The entity of foreign property 'TEcOrderH'. (NullAllowed)
     */
    public void setTEcOrderH(TEcOrderH tEcOrderH) {
        _tEcOrderH = tEcOrderH;
    }

    /** B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'. */
    protected BClassDtl _bClassDtlByErrorFlg;

    /**
     * [get] B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByErrorFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByErrorFlg() {
        return _bClassDtlByErrorFlg;
    }

    /**
     * [set] B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @param bClassDtlByErrorFlg The entity of foreign property 'BClassDtlByErrorFlg'. (NullAllowed)
     */
    public void setBClassDtlByErrorFlg(BClassDtl bClassDtlByErrorFlg) {
        _bClassDtlByErrorFlg = bClassDtlByErrorFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_AMAZON_ORDER by EC_ORDER_B_ID, named 'TAmazonOrderList'. */
    protected List<TAmazonOrder> _tAmazonOrderList;

    /**
     * [get] T_AMAZON_ORDER by EC_ORDER_B_ID, named 'TAmazonOrderList'.
     * @return The entity list of referrer property 'TAmazonOrderList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAmazonOrder> getTAmazonOrderList() {
        if (_tAmazonOrderList == null) { _tAmazonOrderList = newReferrerList(); }
        return _tAmazonOrderList;
    }

    /**
     * [set] T_AMAZON_ORDER by EC_ORDER_B_ID, named 'TAmazonOrderList'.
     * @param tAmazonOrderList The entity list of referrer property 'TAmazonOrderList'. (NullAllowed)
     */
    public void setTAmazonOrderList(List<TAmazonOrder> tAmazonOrderList) {
        _tAmazonOrderList = tAmazonOrderList;
    }

    /** T_RAKUTEN_ORDER by EC_ORDER_B_ID, named 'TRakutenOrderList'. */
    protected List<TRakutenOrder> _tRakutenOrderList;

    /**
     * [get] T_RAKUTEN_ORDER by EC_ORDER_B_ID, named 'TRakutenOrderList'.
     * @return The entity list of referrer property 'TRakutenOrderList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TRakutenOrder> getTRakutenOrderList() {
        if (_tRakutenOrderList == null) { _tRakutenOrderList = newReferrerList(); }
        return _tRakutenOrderList;
    }

    /**
     * [set] T_RAKUTEN_ORDER by EC_ORDER_B_ID, named 'TRakutenOrderList'.
     * @param tRakutenOrderList The entity list of referrer property 'TRakutenOrderList'. (NullAllowed)
     */
    public void setTRakutenOrderList(List<TRakutenOrder> tRakutenOrderList) {
        _tRakutenOrderList = tRakutenOrderList;
    }

    /** T_YAHOO_ORDER by EC_ORDER_B_ID, named 'TYahooOrderList'. */
    protected List<TYahooOrder> _tYahooOrderList;

    /**
     * [get] T_YAHOO_ORDER by EC_ORDER_B_ID, named 'TYahooOrderList'.
     * @return The entity list of referrer property 'TYahooOrderList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TYahooOrder> getTYahooOrderList() {
        if (_tYahooOrderList == null) { _tYahooOrderList = newReferrerList(); }
        return _tYahooOrderList;
    }

    /**
     * [set] T_YAHOO_ORDER by EC_ORDER_B_ID, named 'TYahooOrderList'.
     * @param tYahooOrderList The entity list of referrer property 'TYahooOrderList'. (NullAllowed)
     */
    public void setTYahooOrderList(List<TYahooOrder> tYahooOrderList) {
        _tYahooOrderList = tYahooOrderList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTEcOrderB) {
            BsTEcOrderB other = (BsTEcOrderB)obj;
            if (!xSV(_ecOrderBId, other._ecOrderBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _ecOrderBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tEcOrderH != null)
        { sb.append(li).append(xbRDS(_tEcOrderH, "tEcOrderH")); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByErrorFlg, "bClassDtlByErrorFlg")); }
        if (_tAmazonOrderList != null) { for (TAmazonOrder et : _tAmazonOrderList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAmazonOrderList")); } } }
        if (_tRakutenOrderList != null) { for (TRakutenOrder et : _tRakutenOrderList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tRakutenOrderList")); } } }
        if (_tYahooOrderList != null) { for (TYahooOrder et : _tYahooOrderList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tYahooOrderList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_ecOrderBId));
        sb.append(dm).append(xfND(_ecOrderHId));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_productOption));
        sb.append(dm).append(xfND(_orderNum));
        sb.append(dm).append(xfND(_unitPrice));
        sb.append(dm).append(xfND(_unitTotalPrice));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
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
        if (_tEcOrderH != null)
        { sb.append(dm).append("tEcOrderH"); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(dm).append("bClassDtlByErrorFlg"); }
        if (_tAmazonOrderList != null && !_tAmazonOrderList.isEmpty())
        { sb.append(dm).append("tAmazonOrderList"); }
        if (_tRakutenOrderList != null && !_tRakutenOrderList.isEmpty())
        { sb.append(dm).append("tRakutenOrderList"); }
        if (_tYahooOrderList != null && !_tYahooOrderList.isEmpty())
        { sb.append(dm).append("tYahooOrderList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TEcOrderB clone() {
        return (TEcOrderB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * EC受注ボディID
     * @return The value of the column 'EC_ORDER_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getEcOrderBId() {
        checkSpecifiedProperty("ecOrderBId");
        return _ecOrderBId;
    }

    /**
     * [set] EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * EC受注ボディID
     * @param ecOrderBId The value of the column 'EC_ORDER_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setEcOrderBId(Long ecOrderBId) {
        registerModifiedProperty("ecOrderBId");
        _ecOrderBId = ecOrderBId;
    }

    /**
     * [get] EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H} <br>
     * EC受注ヘッダID
     * @return The value of the column 'EC_ORDER_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getEcOrderHId() {
        checkSpecifiedProperty("ecOrderHId");
        return _ecOrderHId;
    }

    /**
     * [set] EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H} <br>
     * EC受注ヘッダID
     * @param ecOrderHId The value of the column 'EC_ORDER_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEcOrderHId(Long ecOrderHId) {
        registerModifiedProperty("ecOrderHId");
        _ecOrderHId = ecOrderHId;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] PRODUCT_OPTION: {varchar(255)} <br>
     * 商品オプション
     * @return The value of the column 'PRODUCT_OPTION'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductOption() {
        checkSpecifiedProperty("productOption");
        return convertEmptyToNull(_productOption);
    }

    /**
     * [set] PRODUCT_OPTION: {varchar(255)} <br>
     * 商品オプション
     * @param productOption The value of the column 'PRODUCT_OPTION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductOption(String productOption) {
        registerModifiedProperty("productOption");
        _productOption = productOption;
    }

    /**
     * [get] ORDER_NUM: {bigint(19)} <br>
     * 個数
     * @return The value of the column 'ORDER_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOrderNum() {
        checkSpecifiedProperty("orderNum");
        return _orderNum;
    }

    /**
     * [set] ORDER_NUM: {bigint(19)} <br>
     * 個数
     * @param orderNum The value of the column 'ORDER_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderNum(Long orderNum) {
        registerModifiedProperty("orderNum");
        _orderNum = orderNum;
    }

    /**
     * [get] UNIT_PRICE: {bigint(19)} <br>
     * 単価
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnitPrice() {
        checkSpecifiedProperty("unitPrice");
        return _unitPrice;
    }

    /**
     * [set] UNIT_PRICE: {bigint(19)} <br>
     * 単価
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitPrice(Long unitPrice) {
        registerModifiedProperty("unitPrice");
        _unitPrice = unitPrice;
    }

    /**
     * [get] UNIT_TOTAL_PRICE: {bigint(19)} <br>
     * 小計
     * @return The value of the column 'UNIT_TOTAL_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnitTotalPrice() {
        checkSpecifiedProperty("unitTotalPrice");
        return _unitTotalPrice;
    }

    /**
     * [set] UNIT_TOTAL_PRICE: {bigint(19)} <br>
     * 小計
     * @param unitTotalPrice The value of the column 'UNIT_TOTAL_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitTotalPrice(Long unitTotalPrice) {
        registerModifiedProperty("unitTotalPrice");
        _unitTotalPrice = unitTotalPrice;
    }

    /**
     * [get] ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
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
