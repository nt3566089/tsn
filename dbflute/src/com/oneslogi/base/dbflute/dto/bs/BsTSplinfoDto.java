package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_SPLINFO as TABLE. <br>
 * 補充情報(仕分)
 * <pre>
 * [primary-key]
 *     SPLINFO_ID
 *
 * [column]
 *     SPLINFO_ID, CENTER_ID, CLIENT_ID, SPLYMD, UPDDTM, CSPLNUN, LINBLK, LOCATION_ID, LOCATION_CD, PRODUCT_ID, PRODUCT_CD, SPLID, DPCD, DED, LOC_KBN, PRECB, PRECT, CALCB, CALCT, REQCB, REQCT, STATUS, RESCB, RESTB, ABSTOSPLCBQA, ABSTOSPLCTQA, ABSCBQA, RESCBQA, LBKBN, PRTRNK, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SPLINFO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTSplinfoDto implements Serializable {

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
    /** SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _splinfoId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** SPLYMD: {NotNull, varchar(8)} */
    @JsonKey
    protected String _splymd;

    /** UPDDTM: {datetime2(26, 6), default=[NULL]} */
    @JsonKey
    protected java.sql.Timestamp _upddtm;

    /** CSPLNUN: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _csplnun;

    /** LINBLK: {NotNull, varchar(30)} */
    @JsonKey
    protected String _linblk;

    /** LOCATION_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _locationId;

    /** LOCATION_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** PRODUCT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** SPLID: {NotNull, decimal(16, 6), default=[(1)]} */
    @JsonKey
    protected java.math.BigDecimal _splid;

    /** DPCD: {varchar(30)} */
    @JsonKey
    protected String _dpcd;

    /** DED: {varchar(255)} */
    @JsonKey
    protected String _ded;

    /** LOC_KBN: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _locKbn;

    /** PRECB: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _precb;

    /** PRECT: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _prect;

    /** CALCB: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _calcb;

    /** CALCT: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _calct;

    /** REQCB: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _reqcb;

    /** REQCT: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _reqct;

    /** STATUS: {NotNull, varchar(30), default=[0]} */
    @JsonKey
    protected String _status;

    /** RESCB: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _rescb;

    /** RESTB: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _restb;

    /** ABSTOSPLCBQA: {bigint(19)} */
    @JsonKey
    protected Long _abstosplcbqa;

    /** ABSTOSPLCTQA: {bigint(19)} */
    @JsonKey
    protected Long _abstosplctqa;

    /** ABSCBQA: {bigint(19)} */
    @JsonKey
    protected Long _abscbqa;

    /** RESCBQA: {bigint(19)} */
    @JsonKey
    protected Long _rescbqa;

    /** LBKBN: {bigint(19)} */
    @JsonKey
    protected Long _lbkbn;

    /** PRTRNK: {bigint(19)} */
    @JsonKey
    protected Long _prtrnk;

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
    public BsTSplinfoDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTSplinfoDto)) { return false; }
        final BsTSplinfoDto otherEntity = (BsTSplinfoDto)other;
        if (!helpComparingValue(getSplinfoId(), otherEntity.getSplinfoId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_SPLINFO");
        result = xCH(result, getSplinfoId());
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
        sb.append(c).append(getSplinfoId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getSplymd());
        sb.append(c).append(getUpddtm());
        sb.append(c).append(getCsplnun());
        sb.append(c).append(getLinblk());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getSplid());
        sb.append(c).append(getDpcd());
        sb.append(c).append(getDed());
        sb.append(c).append(getLocKbn());
        sb.append(c).append(getPrecb());
        sb.append(c).append(getPrect());
        sb.append(c).append(getCalcb());
        sb.append(c).append(getCalct());
        sb.append(c).append(getReqcb());
        sb.append(c).append(getReqct());
        sb.append(c).append(getStatus());
        sb.append(c).append(getRescb());
        sb.append(c).append(getRestb());
        sb.append(c).append(getAbstosplcbqa());
        sb.append(c).append(getAbstosplctqa());
        sb.append(c).append(getAbscbqa());
        sb.append(c).append(getRescbqa());
        sb.append(c).append(getLbkbn());
        sb.append(c).append(getPrtrnk());
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
     * [get] SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 補充情報ID
     * @return The value of the column 'SPLINFO_ID'. (NullAllowed)
     */
    public Long getSplinfoId() {
        return _splinfoId;
    }

    /**
     * [set] SPLINFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 補充情報ID
     * @param splinfoId The value of the column 'SPLINFO_ID'. (NullAllowed)
     */
    public void setSplinfoId(Long splinfoId) {
        __modifiedProperties.add("splinfoId");
        this._splinfoId = splinfoId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] SPLYMD: {NotNull, varchar(8)} <br>
     * 補充年月日
     * @return The value of the column 'SPLYMD'. (NullAllowed)
     */
    public String getSplymd() {
        return _splymd;
    }

    /**
     * [set] SPLYMD: {NotNull, varchar(8)} <br>
     * 補充年月日
     * @param splymd The value of the column 'SPLYMD'. (NullAllowed)
     */
    public void setSplymd(String splymd) {
        __modifiedProperties.add("splymd");
        this._splymd = splymd;
    }

    /**
     * [get] UPDDTM: {datetime2(26, 6), default=[NULL]} <br>
     * 更新時間
     * @return The value of the column 'UPDDTM'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpddtm() {
        return _upddtm;
    }

    /**
     * [set] UPDDTM: {datetime2(26, 6), default=[NULL]} <br>
     * 更新時間
     * @param upddtm The value of the column 'UPDDTM'. (NullAllowed)
     */
    public void setUpddtm(java.sql.Timestamp upddtm) {
        __modifiedProperties.add("upddtm");
        this._upddtm = upddtm;
    }

    /**
     * [get] CSPLNUN: {NotNull, bigint(19)} <br>
     * 補充回数
     * @return The value of the column 'CSPLNUN'. (NullAllowed)
     */
    public Long getCsplnun() {
        return _csplnun;
    }

    /**
     * [set] CSPLNUN: {NotNull, bigint(19)} <br>
     * 補充回数
     * @param csplnun The value of the column 'CSPLNUN'. (NullAllowed)
     */
    public void setCsplnun(Long csplnun) {
        __modifiedProperties.add("csplnun");
        this._csplnun = csplnun;
    }

    /**
     * [get] LINBLK: {NotNull, varchar(30)} <br>
     * ライン／ブロック
     * @return The value of the column 'LINBLK'. (NullAllowed)
     */
    public String getLinblk() {
        return _linblk;
    }

    /**
     * [set] LINBLK: {NotNull, varchar(30)} <br>
     * ライン／ブロック
     * @param linblk The value of the column 'LINBLK'. (NullAllowed)
     */
    public void setLinblk(String linblk) {
        __modifiedProperties.add("linblk");
        this._linblk = linblk;
    }

    /**
     * [get] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] LOCATION_CD: {NotNull, varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {NotNull, varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] SPLID: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 補充区分
     * @return The value of the column 'SPLID'. (NullAllowed)
     */
    public java.math.BigDecimal getSplid() {
        return _splid;
    }

    /**
     * [set] SPLID: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 補充区分
     * @param splid The value of the column 'SPLID'. (NullAllowed)
     */
    public void setSplid(java.math.BigDecimal splid) {
        __modifiedProperties.add("splid");
        this._splid = splid;
    }

    /**
     * [get] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPCD'. (NullAllowed)
     */
    public String getDpcd() {
        return _dpcd;
    }

    /**
     * [set] DPCD: {varchar(30)} <br>
     * 配達拠点CD
     * @param dpcd The value of the column 'DPCD'. (NullAllowed)
     */
    public void setDpcd(String dpcd) {
        __modifiedProperties.add("dpcd");
        this._dpcd = dpcd;
    }

    /**
     * [get] DED: {varchar(255)} <br>
     * 配達方面
     * @return The value of the column 'DED'. (NullAllowed)
     */
    public String getDed() {
        return _ded;
    }

    /**
     * [set] DED: {varchar(255)} <br>
     * 配達方面
     * @param ded The value of the column 'DED'. (NullAllowed)
     */
    public void setDed(String ded) {
        __modifiedProperties.add("ded");
        this._ded = ded;
    }

    /**
     * [get] LOC_KBN: {NotNull, char(1), default=[0]} <br>
     * ロケーション区分
     * @return The value of the column 'LOC_KBN'. (NullAllowed)
     */
    public String getLocKbn() {
        return _locKbn;
    }

    /**
     * [set] LOC_KBN: {NotNull, char(1), default=[0]} <br>
     * ロケーション区分
     * @param locKbn The value of the column 'LOC_KBN'. (NullAllowed)
     */
    public void setLocKbn(String locKbn) {
        __modifiedProperties.add("locKbn");
        this._locKbn = locKbn;
    }

    /**
     * [get] PRECB: {NotNull, bigint(19)} <br>
     * 補充前在庫（段ボール）
     * @return The value of the column 'PRECB'. (NullAllowed)
     */
    public Long getPrecb() {
        return _precb;
    }

    /**
     * [set] PRECB: {NotNull, bigint(19)} <br>
     * 補充前在庫（段ボール）
     * @param precb The value of the column 'PRECB'. (NullAllowed)
     */
    public void setPrecb(Long precb) {
        __modifiedProperties.add("precb");
        this._precb = precb;
    }

    /**
     * [get] PRECT: {NotNull, bigint(19)} <br>
     * 補充前在庫（カートン）
     * @return The value of the column 'PRECT'. (NullAllowed)
     */
    public Long getPrect() {
        return _prect;
    }

    /**
     * [set] PRECT: {NotNull, bigint(19)} <br>
     * 補充前在庫（カートン）
     * @param prect The value of the column 'PRECT'. (NullAllowed)
     */
    public void setPrect(Long prect) {
        __modifiedProperties.add("prect");
        this._prect = prect;
    }

    /**
     * [get] CALCB: {NotNull, bigint(19)} <br>
     * 算定補充量（段ボール）
     * @return The value of the column 'CALCB'. (NullAllowed)
     */
    public Long getCalcb() {
        return _calcb;
    }

    /**
     * [set] CALCB: {NotNull, bigint(19)} <br>
     * 算定補充量（段ボール）
     * @param calcb The value of the column 'CALCB'. (NullAllowed)
     */
    public void setCalcb(Long calcb) {
        __modifiedProperties.add("calcb");
        this._calcb = calcb;
    }

    /**
     * [get] CALCT: {NotNull, bigint(19)} <br>
     * 算定補充量（カートン）
     * @return The value of the column 'CALCT'. (NullAllowed)
     */
    public Long getCalct() {
        return _calct;
    }

    /**
     * [set] CALCT: {NotNull, bigint(19)} <br>
     * 算定補充量（カートン）
     * @param calct The value of the column 'CALCT'. (NullAllowed)
     */
    public void setCalct(Long calct) {
        __modifiedProperties.add("calct");
        this._calct = calct;
    }

    /**
     * [get] REQCB: {NotNull, bigint(19), default=[(0)]} <br>
     * 補充量（段ボール）
     * @return The value of the column 'REQCB'. (NullAllowed)
     */
    public Long getReqcb() {
        return _reqcb;
    }

    /**
     * [set] REQCB: {NotNull, bigint(19), default=[(0)]} <br>
     * 補充量（段ボール）
     * @param reqcb The value of the column 'REQCB'. (NullAllowed)
     */
    public void setReqcb(Long reqcb) {
        __modifiedProperties.add("reqcb");
        this._reqcb = reqcb;
    }

    /**
     * [get] REQCT: {NotNull, bigint(19), default=[(0)]} <br>
     * 補充量（カートン）
     * @return The value of the column 'REQCT'. (NullAllowed)
     */
    public Long getReqct() {
        return _reqct;
    }

    /**
     * [set] REQCT: {NotNull, bigint(19), default=[(0)]} <br>
     * 補充量（カートン）
     * @param reqct The value of the column 'REQCT'. (NullAllowed)
     */
    public void setReqct(Long reqct) {
        __modifiedProperties.add("reqct");
        this._reqct = reqct;
    }

    /**
     * [get] STATUS: {NotNull, varchar(30), default=[0]} <br>
     * 補充状態ステータス
     * @return The value of the column 'STATUS'. (NullAllowed)
     */
    public String getStatus() {
        return _status;
    }

    /**
     * [set] STATUS: {NotNull, varchar(30), default=[0]} <br>
     * 補充状態ステータス
     * @param status The value of the column 'STATUS'. (NullAllowed)
     */
    public void setStatus(String status) {
        __modifiedProperties.add("status");
        this._status = status;
    }

    /**
     * [get] RESCB: {NotNull, bigint(19), default=[(0)]} <br>
     * 実補充量（段ボール）
     * @return The value of the column 'RESCB'. (NullAllowed)
     */
    public Long getRescb() {
        return _rescb;
    }

    /**
     * [set] RESCB: {NotNull, bigint(19), default=[(0)]} <br>
     * 実補充量（段ボール）
     * @param rescb The value of the column 'RESCB'. (NullAllowed)
     */
    public void setRescb(Long rescb) {
        __modifiedProperties.add("rescb");
        this._rescb = rescb;
    }

    /**
     * [get] RESTB: {NotNull, bigint(19), default=[(0)]} <br>
     * 実補充量（カートン）
     * @return The value of the column 'RESTB'. (NullAllowed)
     */
    public Long getRestb() {
        return _restb;
    }

    /**
     * [set] RESTB: {NotNull, bigint(19), default=[(0)]} <br>
     * 実補充量（カートン）
     * @param restb The value of the column 'RESTB'. (NullAllowed)
     */
    public void setRestb(Long restb) {
        __modifiedProperties.add("restb");
        this._restb = restb;
    }

    /**
     * [get] ABSTOSPLCBQA: {bigint(19)} <br>
     * 絶対補充量、ダンボール数
     * @return The value of the column 'ABSTOSPLCBQA'. (NullAllowed)
     */
    public Long getAbstosplcbqa() {
        return _abstosplcbqa;
    }

    /**
     * [set] ABSTOSPLCBQA: {bigint(19)} <br>
     * 絶対補充量、ダンボール数
     * @param abstosplcbqa The value of the column 'ABSTOSPLCBQA'. (NullAllowed)
     */
    public void setAbstosplcbqa(Long abstosplcbqa) {
        __modifiedProperties.add("abstosplcbqa");
        this._abstosplcbqa = abstosplcbqa;
    }

    /**
     * [get] ABSTOSPLCTQA: {bigint(19)} <br>
     * 絶対補充量、カートン数
     * @return The value of the column 'ABSTOSPLCTQA'. (NullAllowed)
     */
    public Long getAbstosplctqa() {
        return _abstosplctqa;
    }

    /**
     * [set] ABSTOSPLCTQA: {bigint(19)} <br>
     * 絶対補充量、カートン数
     * @param abstosplctqa The value of the column 'ABSTOSPLCTQA'. (NullAllowed)
     */
    public void setAbstosplctqa(Long abstosplctqa) {
        __modifiedProperties.add("abstosplctqa");
        this._abstosplctqa = abstosplctqa;
    }

    /**
     * [get] ABSCBQA: {bigint(19)} <br>
     * 絶対補充切り上げダンボール数
     * @return The value of the column 'ABSCBQA'. (NullAllowed)
     */
    public Long getAbscbqa() {
        return _abscbqa;
    }

    /**
     * [set] ABSCBQA: {bigint(19)} <br>
     * 絶対補充切り上げダンボール数
     * @param abscbqa The value of the column 'ABSCBQA'. (NullAllowed)
     */
    public void setAbscbqa(Long abscbqa) {
        __modifiedProperties.add("abscbqa");
        this._abscbqa = abscbqa;
    }

    /**
     * [get] RESCBQA: {bigint(19)} <br>
     * 内予備ダンボール数
     * @return The value of the column 'RESCBQA'. (NullAllowed)
     */
    public Long getRescbqa() {
        return _rescbqa;
    }

    /**
     * [set] RESCBQA: {bigint(19)} <br>
     * 内予備ダンボール数
     * @param rescbqa The value of the column 'RESCBQA'. (NullAllowed)
     */
    public void setRescbqa(Long rescbqa) {
        __modifiedProperties.add("rescbqa");
        this._rescbqa = rescbqa;
    }

    /**
     * [get] LBKBN: {bigint(19)} <br>
     * ライン／ブロック区分
     * @return The value of the column 'LBKBN'. (NullAllowed)
     */
    public Long getLbkbn() {
        return _lbkbn;
    }

    /**
     * [set] LBKBN: {bigint(19)} <br>
     * ライン／ブロック区分
     * @param lbkbn The value of the column 'LBKBN'. (NullAllowed)
     */
    public void setLbkbn(Long lbkbn) {
        __modifiedProperties.add("lbkbn");
        this._lbkbn = lbkbn;
    }

    /**
     * [get] PRTRNK: {bigint(19)} <br>
     * 印刷順
     * @return The value of the column 'PRTRNK'. (NullAllowed)
     */
    public Long getPrtrnk() {
        return _prtrnk;
    }

    /**
     * [set] PRTRNK: {bigint(19)} <br>
     * 印刷順
     * @param prtrnk The value of the column 'PRTRNK'. (NullAllowed)
     */
    public void setPrtrnk(Long prtrnk) {
        __modifiedProperties.add("prtrnk");
        this._prtrnk = prtrnk;
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
