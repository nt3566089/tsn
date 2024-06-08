package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_PRODUCT_M_SEND as TABLE. <br>
 * 銘柄テーブル(マテハン)送信テーブル
 * <pre>
 * [primary-key]
 *     PRODUCT_M_SEND_ID
 *
 * [column]
 *     PRODUCT_M_SEND_ID, COMPANY_CD, PRODUCT_CD, BRFNFL, BRFNHF, BRANFL, BRANHF, IOID_CLS, OTRNK, BRCTG, NUMCT, CTNUM, CBCT, PATCBQA, CTBCDID, CTBCD, CBBCDID, CBBCD, FWBRID, CTFM, CTSZL, CTSZW, CTSZH, CTCC, CTWEIGHT, ZZFRDATEH, ZZTODATEH, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_M_SEND_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsEProductMSendDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _productMSendId;

    /** COMPANY_CD: {varchar(30)} */
    @JsonKey
    protected String _companyCd;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** BRFNFL: {varchar(255)} */
    @JsonKey
    protected String _brfnfl;

    /** BRFNHF: {varchar(255)} */
    @JsonKey
    protected String _brfnhf;

    /** BRANFL: {varchar(255)} */
    @JsonKey
    protected String _branfl;

    /** BRANHF: {varchar(255)} */
    @JsonKey
    protected String _branhf;

    /** IOID_CLS: {varchar(30)} */
    @JsonKey
    protected String _ioidCls;

    /** OTRNK: {bigint(19)} */
    @JsonKey
    protected Long _otrnk;

    /** BRCTG: {bigint(19)} */
    @JsonKey
    protected Long _brctg;

    /** NUMCT: {bigint(19)} */
    @JsonKey
    protected Long _numct;

    /** CTNUM: {bigint(19)} */
    @JsonKey
    protected Long _ctnum;

    /** CBCT: {bigint(19)} */
    @JsonKey
    protected Long _cbct;

    /** PATCBQA: {bigint(19)} */
    @JsonKey
    protected Long _patcbqa;

    /** CTBCDID: {varchar(30)} */
    @JsonKey
    protected String _ctbcdid;

    /** CTBCD: {varchar(30)} */
    @JsonKey
    protected String _ctbcd;

    /** CBBCDID: {varchar(30)} */
    @JsonKey
    protected String _cbbcdid;

    /** CBBCD: {varchar(30)} */
    @JsonKey
    protected String _cbbcd;

    /** FWBRID: {varchar(30)} */
    @JsonKey
    protected String _fwbrid;

    /** CTFM: {varchar(30)} */
    @JsonKey
    protected String _ctfm;

    /** CTSZL: {bigint(19)} */
    @JsonKey
    protected Long _ctszl;

    /** CTSZW: {bigint(19)} */
    @JsonKey
    protected Long _ctszw;

    /** CTSZH: {bigint(19)} */
    @JsonKey
    protected Long _ctszh;

    /** CTCC: {bigint(19)} */
    @JsonKey
    protected Long _ctcc;

    /** CTWEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ctweight;

    /** ZZFRDATEH: {varchar(8)} */
    @JsonKey
    protected String _zzfrdateh;

    /** ZZTODATEH: {varchar(8)} */
    @JsonKey
    protected String _zztodateh;

    /** SEND_CD: {varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** WORK_FLG: {char(1), default=[(0)]} */
    @JsonKey
    protected String _workFlg;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEProductMSendDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsEProductMSendDto)) { return false; }
        final BsEProductMSendDto otherEntity = (BsEProductMSendDto)other;
        if (!helpComparingValue(getProductMSendId(), otherEntity.getProductMSendId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_PRODUCT_M_SEND");
        result = xCH(result, getProductMSendId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getProductMSendId());
        sb.append(c).append(getCompanyCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getBrfnfl());
        sb.append(c).append(getBrfnhf());
        sb.append(c).append(getBranfl());
        sb.append(c).append(getBranhf());
        sb.append(c).append(getIoidCls());
        sb.append(c).append(getOtrnk());
        sb.append(c).append(getBrctg());
        sb.append(c).append(getNumct());
        sb.append(c).append(getCtnum());
        sb.append(c).append(getCbct());
        sb.append(c).append(getPatcbqa());
        sb.append(c).append(getCtbcdid());
        sb.append(c).append(getCtbcd());
        sb.append(c).append(getCbbcdid());
        sb.append(c).append(getCbbcd());
        sb.append(c).append(getFwbrid());
        sb.append(c).append(getCtfm());
        sb.append(c).append(getCtszl());
        sb.append(c).append(getCtszw());
        sb.append(c).append(getCtszh());
        sb.append(c).append(getCtcc());
        sb.append(c).append(getCtweight());
        sb.append(c).append(getZzfrdateh());
        sb.append(c).append(getZztodateh());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 銘柄(マテハン)送信ID
     * @return The value of the column 'PRODUCT_M_SEND_ID'. (NullAllowed)
     */
    public Long getProductMSendId() {
        return _productMSendId;
    }

    /**
     * [set] PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 銘柄(マテハン)送信ID
     * @param productMSendId The value of the column 'PRODUCT_M_SEND_ID'. (NullAllowed)
     */
    public void setProductMSendId(Long productMSendId) {
        __modifiedProperties.add("productMSendId");
        this._productMSendId = productMSendId;
    }

    /**
     * [get] COMPANY_CD: {varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'COMPANY_CD'. (NullAllowed)
     */
    public String getCompanyCd() {
        return _companyCd;
    }

    /**
     * [set] COMPANY_CD: {varchar(30)} <br>
     * 組織CD
     * @param companyCd The value of the column 'COMPANY_CD'. (NullAllowed)
     */
    public void setCompanyCd(String companyCd) {
        __modifiedProperties.add("companyCd");
        this._companyCd = companyCd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] BRFNFL: {varchar(255)} <br>
     * 銘柄名正称(全角)
     * @return The value of the column 'BRFNFL'. (NullAllowed)
     */
    public String getBrfnfl() {
        return _brfnfl;
    }

    /**
     * [set] BRFNFL: {varchar(255)} <br>
     * 銘柄名正称(全角)
     * @param brfnfl The value of the column 'BRFNFL'. (NullAllowed)
     */
    public void setBrfnfl(String brfnfl) {
        __modifiedProperties.add("brfnfl");
        this._brfnfl = brfnfl;
    }

    /**
     * [get] BRFNHF: {varchar(255)} <br>
     * 銘柄名正称(半角)
     * @return The value of the column 'BRFNHF'. (NullAllowed)
     */
    public String getBrfnhf() {
        return _brfnhf;
    }

    /**
     * [set] BRFNHF: {varchar(255)} <br>
     * 銘柄名正称(半角)
     * @param brfnhf The value of the column 'BRFNHF'. (NullAllowed)
     */
    public void setBrfnhf(String brfnhf) {
        __modifiedProperties.add("brfnhf");
        this._brfnhf = brfnhf;
    }

    /**
     * [get] BRANFL: {varchar(255)} <br>
     * 銘柄名略称(全角)
     * @return The value of the column 'BRANFL'. (NullAllowed)
     */
    public String getBranfl() {
        return _branfl;
    }

    /**
     * [set] BRANFL: {varchar(255)} <br>
     * 銘柄名略称(全角)
     * @param branfl The value of the column 'BRANFL'. (NullAllowed)
     */
    public void setBranfl(String branfl) {
        __modifiedProperties.add("branfl");
        this._branfl = branfl;
    }

    /**
     * [get] BRANHF: {varchar(255)} <br>
     * 銘柄名略称(半角)
     * @return The value of the column 'BRANHF'. (NullAllowed)
     */
    public String getBranhf() {
        return _branhf;
    }

    /**
     * [set] BRANHF: {varchar(255)} <br>
     * 銘柄名略称(半角)
     * @param branhf The value of the column 'BRANHF'. (NullAllowed)
     */
    public void setBranhf(String branhf) {
        __modifiedProperties.add("branhf");
        this._branhf = branhf;
    }

    /**
     * [get] IOID_CLS: {varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'IOID_CLS'. (NullAllowed)
     */
    public String getIoidCls() {
        return _ioidCls;
    }

    /**
     * [set] IOID_CLS: {varchar(30)} <br>
     * 内外区分
     * @param ioidCls The value of the column 'IOID_CLS'. (NullAllowed)
     */
    public void setIoidCls(String ioidCls) {
        __modifiedProperties.add("ioidCls");
        this._ioidCls = ioidCls;
    }

    /**
     * [get] OTRNK: {bigint(19)} <br>
     * 出力順
     * @return The value of the column 'OTRNK'. (NullAllowed)
     */
    public Long getOtrnk() {
        return _otrnk;
    }

    /**
     * [set] OTRNK: {bigint(19)} <br>
     * 出力順
     * @param otrnk The value of the column 'OTRNK'. (NullAllowed)
     */
    public void setOtrnk(Long otrnk) {
        __modifiedProperties.add("otrnk");
        this._otrnk = otrnk;
    }

    /**
     * [get] BRCTG: {bigint(19)} <br>
     * 銘柄カテゴリ
     * @return The value of the column 'BRCTG'. (NullAllowed)
     */
    public Long getBrctg() {
        return _brctg;
    }

    /**
     * [set] BRCTG: {bigint(19)} <br>
     * 銘柄カテゴリ
     * @param brctg The value of the column 'BRCTG'. (NullAllowed)
     */
    public void setBrctg(Long brctg) {
        __modifiedProperties.add("brctg");
        this._brctg = brctg;
    }

    /**
     * [get] NUMCT: {bigint(19)} <br>
     * 本数／個
     * @return The value of the column 'NUMCT'. (NullAllowed)
     */
    public Long getNumct() {
        return _numct;
    }

    /**
     * [set] NUMCT: {bigint(19)} <br>
     * 本数／個
     * @param numct The value of the column 'NUMCT'. (NullAllowed)
     */
    public void setNumct(Long numct) {
        __modifiedProperties.add("numct");
        this._numct = numct;
    }

    /**
     * [get] CTNUM: {bigint(19)} <br>
     * 個／カートン
     * @return The value of the column 'CTNUM'. (NullAllowed)
     */
    public Long getCtnum() {
        return _ctnum;
    }

    /**
     * [set] CTNUM: {bigint(19)} <br>
     * 個／カートン
     * @param ctnum The value of the column 'CTNUM'. (NullAllowed)
     */
    public void setCtnum(Long ctnum) {
        __modifiedProperties.add("ctnum");
        this._ctnum = ctnum;
    }

    /**
     * [get] CBCT: {bigint(19)} <br>
     * カートン／ダンボール
     * @return The value of the column 'CBCT'. (NullAllowed)
     */
    public Long getCbct() {
        return _cbct;
    }

    /**
     * [set] CBCT: {bigint(19)} <br>
     * カートン／ダンボール
     * @param cbct The value of the column 'CBCT'. (NullAllowed)
     */
    public void setCbct(Long cbct) {
        __modifiedProperties.add("cbct");
        this._cbct = cbct;
    }

    /**
     * [get] PATCBQA: {bigint(19)} <br>
     * ダンボール／パレット
     * @return The value of the column 'PATCBQA'. (NullAllowed)
     */
    public Long getPatcbqa() {
        return _patcbqa;
    }

    /**
     * [set] PATCBQA: {bigint(19)} <br>
     * ダンボール／パレット
     * @param patcbqa The value of the column 'PATCBQA'. (NullAllowed)
     */
    public void setPatcbqa(Long patcbqa) {
        __modifiedProperties.add("patcbqa");
        this._patcbqa = patcbqa;
    }

    /**
     * [get] CTBCDID: {varchar(30)} <br>
     * カートンバーコード区分
     * @return The value of the column 'CTBCDID'. (NullAllowed)
     */
    public String getCtbcdid() {
        return _ctbcdid;
    }

    /**
     * [set] CTBCDID: {varchar(30)} <br>
     * カートンバーコード区分
     * @param ctbcdid The value of the column 'CTBCDID'. (NullAllowed)
     */
    public void setCtbcdid(String ctbcdid) {
        __modifiedProperties.add("ctbcdid");
        this._ctbcdid = ctbcdid;
    }

    /**
     * [get] CTBCD: {varchar(30)} <br>
     * カートンバーコード
     * @return The value of the column 'CTBCD'. (NullAllowed)
     */
    public String getCtbcd() {
        return _ctbcd;
    }

    /**
     * [set] CTBCD: {varchar(30)} <br>
     * カートンバーコード
     * @param ctbcd The value of the column 'CTBCD'. (NullAllowed)
     */
    public void setCtbcd(String ctbcd) {
        __modifiedProperties.add("ctbcd");
        this._ctbcd = ctbcd;
    }

    /**
     * [get] CBBCDID: {varchar(30)} <br>
     * 段ボールバーコード区分
     * @return The value of the column 'CBBCDID'. (NullAllowed)
     */
    public String getCbbcdid() {
        return _cbbcdid;
    }

    /**
     * [set] CBBCDID: {varchar(30)} <br>
     * 段ボールバーコード区分
     * @param cbbcdid The value of the column 'CBBCDID'. (NullAllowed)
     */
    public void setCbbcdid(String cbbcdid) {
        __modifiedProperties.add("cbbcdid");
        this._cbbcdid = cbbcdid;
    }

    /**
     * [get] CBBCD: {varchar(30)} <br>
     * 段ボールバーコード
     * @return The value of the column 'CBBCD'. (NullAllowed)
     */
    public String getCbbcd() {
        return _cbbcd;
    }

    /**
     * [set] CBBCD: {varchar(30)} <br>
     * 段ボールバーコード
     * @param cbbcd The value of the column 'CBBCD'. (NullAllowed)
     */
    public void setCbbcd(String cbbcd) {
        __modifiedProperties.add("cbbcd");
        this._cbbcd = cbbcd;
    }

    /**
     * [get] FWBRID: {varchar(30)} <br>
     * CAP銘柄区分
     * @return The value of the column 'FWBRID'. (NullAllowed)
     */
    public String getFwbrid() {
        return _fwbrid;
    }

    /**
     * [set] FWBRID: {varchar(30)} <br>
     * CAP銘柄区分
     * @param fwbrid The value of the column 'FWBRID'. (NullAllowed)
     */
    public void setFwbrid(String fwbrid) {
        __modifiedProperties.add("fwbrid");
        this._fwbrid = fwbrid;
    }

    /**
     * [get] CTFM: {varchar(30)} <br>
     * カートン形状
     * @return The value of the column 'CTFM'. (NullAllowed)
     */
    public String getCtfm() {
        return _ctfm;
    }

    /**
     * [set] CTFM: {varchar(30)} <br>
     * カートン形状
     * @param ctfm The value of the column 'CTFM'. (NullAllowed)
     */
    public void setCtfm(String ctfm) {
        __modifiedProperties.add("ctfm");
        this._ctfm = ctfm;
    }

    /**
     * [get] CTSZL: {bigint(19)} <br>
     * カートン寸法(Ｌ)
     * @return The value of the column 'CTSZL'. (NullAllowed)
     */
    public Long getCtszl() {
        return _ctszl;
    }

    /**
     * [set] CTSZL: {bigint(19)} <br>
     * カートン寸法(Ｌ)
     * @param ctszl The value of the column 'CTSZL'. (NullAllowed)
     */
    public void setCtszl(Long ctszl) {
        __modifiedProperties.add("ctszl");
        this._ctszl = ctszl;
    }

    /**
     * [get] CTSZW: {bigint(19)} <br>
     * カートン寸法(Ｗ)
     * @return The value of the column 'CTSZW'. (NullAllowed)
     */
    public Long getCtszw() {
        return _ctszw;
    }

    /**
     * [set] CTSZW: {bigint(19)} <br>
     * カートン寸法(Ｗ)
     * @param ctszw The value of the column 'CTSZW'. (NullAllowed)
     */
    public void setCtszw(Long ctszw) {
        __modifiedProperties.add("ctszw");
        this._ctszw = ctszw;
    }

    /**
     * [get] CTSZH: {bigint(19)} <br>
     * カートン寸法(Ｈ)
     * @return The value of the column 'CTSZH'. (NullAllowed)
     */
    public Long getCtszh() {
        return _ctszh;
    }

    /**
     * [set] CTSZH: {bigint(19)} <br>
     * カートン寸法(Ｈ)
     * @param ctszh The value of the column 'CTSZH'. (NullAllowed)
     */
    public void setCtszh(Long ctszh) {
        __modifiedProperties.add("ctszh");
        this._ctszh = ctszh;
    }

    /**
     * [get] CTCC: {bigint(19)} <br>
     * カートン容積
     * @return The value of the column 'CTCC'. (NullAllowed)
     */
    public Long getCtcc() {
        return _ctcc;
    }

    /**
     * [set] CTCC: {bigint(19)} <br>
     * カートン容積
     * @param ctcc The value of the column 'CTCC'. (NullAllowed)
     */
    public void setCtcc(Long ctcc) {
        __modifiedProperties.add("ctcc");
        this._ctcc = ctcc;
    }

    /**
     * [get] CTWEIGHT: {decimal(16, 6)} <br>
     * カートン重量
     * @return The value of the column 'CTWEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getCtweight() {
        return _ctweight;
    }

    /**
     * [set] CTWEIGHT: {decimal(16, 6)} <br>
     * カートン重量
     * @param ctweight The value of the column 'CTWEIGHT'. (NullAllowed)
     */
    public void setCtweight(java.math.BigDecimal ctweight) {
        __modifiedProperties.add("ctweight");
        this._ctweight = ctweight;
    }

    /**
     * [get] ZZFRDATEH: {varchar(8)} <br>
     * 適用開始年月日
     * @return The value of the column 'ZZFRDATEH'. (NullAllowed)
     */
    public String getZzfrdateh() {
        return _zzfrdateh;
    }

    /**
     * [set] ZZFRDATEH: {varchar(8)} <br>
     * 適用開始年月日
     * @param zzfrdateh The value of the column 'ZZFRDATEH'. (NullAllowed)
     */
    public void setZzfrdateh(String zzfrdateh) {
        __modifiedProperties.add("zzfrdateh");
        this._zzfrdateh = zzfrdateh;
    }

    /**
     * [get] ZZTODATEH: {varchar(8)} <br>
     * 適用終了年月日
     * @return The value of the column 'ZZTODATEH'. (NullAllowed)
     */
    public String getZztodateh() {
        return _zztodateh;
    }

    /**
     * [set] ZZTODATEH: {varchar(8)} <br>
     * 適用終了年月日
     * @param zztodateh The value of the column 'ZZTODATEH'. (NullAllowed)
     */
    public void setZztodateh(String zztodateh) {
        __modifiedProperties.add("zztodateh");
        this._zztodateh = zztodateh;
    }

    /**
     * [get] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed)
     */
    public String getSendCd() {
        return _sendCd;
    }

    /**
     * [set] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed)
     */
    public void setSendCd(String sendCd) {
        __modifiedProperties.add("sendCd");
        this._sendCd = sendCd;
    }

    /**
     * [get] WORK_FLG: {char(1), default=[(0)]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {char(1), default=[(0)]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
