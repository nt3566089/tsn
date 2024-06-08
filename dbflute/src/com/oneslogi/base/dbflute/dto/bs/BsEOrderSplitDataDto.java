package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_ORDER_SPLIT_DATA as TABLE. <br>
 * オーダー分割結果データ送信テーブル
 * <pre>
 * [primary-key]
 *     ORDER_SPLIT_DATA_ID
 *
 * [column]
 *     ORDER_SPLIT_DATA_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, REC_FLG, SRWHCD, DPCD, DED, PSTNID, DLVRNK, DLVSNM, SROPRTCNT, SSCD, DLVYMD, ZZORDYMD, SLPMRGTMG, ORDGR, S, H, M, SRYMD, RLYBSCD, KEEPAREAH1, SLPTYP, CMPCD, SLPNO, SLEDIV, CNGPRTSLPNO, SPPLYMD, CGGDID, KEEPAREAH2, ZZMATNR, BOXNO, BOXTYPE, ZZMATNRTOTAL, BOXNOCNSNM, BXOSZL, BXOSZH, BXOSZW, BOXTOTALWEIGH, WEIGHTYPE, BOXTOTALNUMBER, KEEPAREAM1, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ORDER_SPLIT_DATA_ID
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
public abstract class BsEOrderSplitDataDto implements Serializable {

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
    /** ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _orderSplitDataId;

    /** SEND_CD: {varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_ROW_ID: {bigint(19)} */
    @JsonKey
    protected Long _sendRowId;

    /** WORK_FLG: {char(1)} */
    @JsonKey
    protected String _workFlg;

    /** REC_FLG: {varchar(30)} */
    @JsonKey
    protected String _recFlg;

    /** SRWHCD: {varchar(30)} */
    @JsonKey
    protected String _srwhcd;

    /** DPCD: {varchar(30)} */
    @JsonKey
    protected String _dpcd;

    /** DED: {varchar(30)} */
    @JsonKey
    protected String _ded;

    /** PSTNID: {char(1)} */
    @JsonKey
    protected String _pstnid;

    /** DLVRNK: {varchar(30)} */
    @JsonKey
    protected String _dlvrnk;

    /** DLVSNM: {bigint(19)} */
    @JsonKey
    protected Long _dlvsnm;

    /** SROPRTCNT: {bigint(19)} */
    @JsonKey
    protected Long _sroprtcnt;

    /** SSCD: {varchar(30)} */
    @JsonKey
    protected String _sscd;

    /** DLVYMD: {varchar(8)} */
    @JsonKey
    protected String _dlvymd;

    /** ZZORDYMD: {varchar(8)} */
    @JsonKey
    protected String _zzordymd;

    /** SLPMRGTMG: {varchar(30)} */
    @JsonKey
    protected String _slpmrgtmg;

    /** ORDGR: {varchar(30)} */
    @JsonKey
    protected String _ordgr;

    /** S: {bigint(19)} */
    @JsonKey
    protected Long _s;

    /** H: {bigint(19)} */
    @JsonKey
    protected Long _h;

    /** M: {bigint(19)} */
    @JsonKey
    protected Long _m;

    /** SRYMD: {varchar(8)} */
    @JsonKey
    protected String _srymd;

    /** RLYBSCD: {varchar(30)} */
    @JsonKey
    protected String _rlybscd;

    /** KEEPAREAH1: {varchar(30)} */
    @JsonKey
    protected String _keepareah1;

    /** SLPTYP: {varchar(30)} */
    @JsonKey
    protected String _slptyp;

    /** CMPCD: {varchar(30)} */
    @JsonKey
    protected String _cmpcd;

    /** SLPNO: {varchar(30)} */
    @JsonKey
    protected String _slpno;

    /** SLEDIV: {varchar(30)} */
    @JsonKey
    protected String _slediv;

    /** CNGPRTSLPNO: {varchar(30)} */
    @JsonKey
    protected String _cngprtslpno;

    /** SPPLYMD: {varchar(8)} */
    @JsonKey
    protected String _spplymd;

    /** CGGDID: {varchar(30)} */
    @JsonKey
    protected String _cggdid;

    /** KEEPAREAH2: {varchar(30)} */
    @JsonKey
    protected String _keepareah2;

    /** ZZMATNR: {varchar(30)} */
    @JsonKey
    protected String _zzmatnr;

    /** BOXNO: {varchar(30)} */
    @JsonKey
    protected String _boxno;

    /** BOXTYPE: {varchar(30)} */
    @JsonKey
    protected String _boxtype;

    /** ZZMATNRTOTAL: {bigint(19)} */
    @JsonKey
    protected Long _zzmatnrtotal;

    /** BOXNOCNSNM: {varchar(30)} */
    @JsonKey
    protected String _boxnocnsnm;

    /** BXOSZL: {bigint(19)} */
    @JsonKey
    protected Long _bxoszl;

    /** BXOSZH: {bigint(19)} */
    @JsonKey
    protected Long _bxoszh;

    /** BXOSZW: {bigint(19)} */
    @JsonKey
    protected Long _bxoszw;

    /** BOXTOTALWEIGH: {bigint(19)} */
    @JsonKey
    protected Long _boxtotalweigh;

    /** WEIGHTYPE: {varchar(30)} */
    @JsonKey
    protected String _weightype;

    /** BOXTOTALNUMBER: {bigint(19)} */
    @JsonKey
    protected Long _boxtotalnumber;

    /** KEEPAREAM1: {varchar(30)} */
    @JsonKey
    protected String _keepaream1;

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
    public BsEOrderSplitDataDto() {
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
        if (other == null || !(other instanceof BsEOrderSplitDataDto)) { return false; }
        final BsEOrderSplitDataDto otherEntity = (BsEOrderSplitDataDto)other;
        if (!helpComparingValue(getOrderSplitDataId(), otherEntity.getOrderSplitDataId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_ORDER_SPLIT_DATA");
        result = xCH(result, getOrderSplitDataId());
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
        sb.append(c).append(getOrderSplitDataId());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getSendRowId());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getRecFlg());
        sb.append(c).append(getSrwhcd());
        sb.append(c).append(getDpcd());
        sb.append(c).append(getDed());
        sb.append(c).append(getPstnid());
        sb.append(c).append(getDlvrnk());
        sb.append(c).append(getDlvsnm());
        sb.append(c).append(getSroprtcnt());
        sb.append(c).append(getSscd());
        sb.append(c).append(getDlvymd());
        sb.append(c).append(getZzordymd());
        sb.append(c).append(getSlpmrgtmg());
        sb.append(c).append(getOrdgr());
        sb.append(c).append(getS());
        sb.append(c).append(getH());
        sb.append(c).append(getM());
        sb.append(c).append(getSrymd());
        sb.append(c).append(getRlybscd());
        sb.append(c).append(getKeepareah1());
        sb.append(c).append(getSlptyp());
        sb.append(c).append(getCmpcd());
        sb.append(c).append(getSlpno());
        sb.append(c).append(getSlediv());
        sb.append(c).append(getCngprtslpno());
        sb.append(c).append(getSpplymd());
        sb.append(c).append(getCggdid());
        sb.append(c).append(getKeepareah2());
        sb.append(c).append(getZzmatnr());
        sb.append(c).append(getBoxno());
        sb.append(c).append(getBoxtype());
        sb.append(c).append(getZzmatnrtotal());
        sb.append(c).append(getBoxnocnsnm());
        sb.append(c).append(getBxoszl());
        sb.append(c).append(getBxoszh());
        sb.append(c).append(getBxoszw());
        sb.append(c).append(getBoxtotalweigh());
        sb.append(c).append(getWeightype());
        sb.append(c).append(getBoxtotalnumber());
        sb.append(c).append(getKeepaream1());
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
     * [get] ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * オーダー分割結果データ送信ID
     * @return The value of the column 'ORDER_SPLIT_DATA_ID'. (NullAllowed)
     */
    public Long getOrderSplitDataId() {
        return _orderSplitDataId;
    }

    /**
     * [set] ORDER_SPLIT_DATA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * オーダー分割結果データ送信ID
     * @param orderSplitDataId The value of the column 'ORDER_SPLIT_DATA_ID'. (NullAllowed)
     */
    public void setOrderSplitDataId(Long orderSplitDataId) {
        __modifiedProperties.add("orderSplitDataId");
        this._orderSplitDataId = orderSplitDataId;
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
     * [get] SEND_ROW_ID: {bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public Long getSendRowId() {
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (NullAllowed)
     */
    public void setSendRowId(Long sendRowId) {
        __modifiedProperties.add("sendRowId");
        this._sendRowId = sendRowId;
    }

    /**
     * [get] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {char(1)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] REC_FLG: {varchar(30)} <br>
     * レコード区分
     * @return The value of the column 'REC_FLG'. (NullAllowed)
     */
    public String getRecFlg() {
        return _recFlg;
    }

    /**
     * [set] REC_FLG: {varchar(30)} <br>
     * レコード区分
     * @param recFlg The value of the column 'REC_FLG'. (NullAllowed)
     */
    public void setRecFlg(String recFlg) {
        __modifiedProperties.add("recFlg");
        this._recFlg = recFlg;
    }

    /**
     * [get] SRWHCD: {varchar(30)} <br>
     * 仕分拠点コード
     * @return The value of the column 'SRWHCD'. (NullAllowed)
     */
    public String getSrwhcd() {
        return _srwhcd;
    }

    /**
     * [set] SRWHCD: {varchar(30)} <br>
     * 仕分拠点コード
     * @param srwhcd The value of the column 'SRWHCD'. (NullAllowed)
     */
    public void setSrwhcd(String srwhcd) {
        __modifiedProperties.add("srwhcd");
        this._srwhcd = srwhcd;
    }

    /**
     * [get] DPCD: {varchar(30)} <br>
     * 配達拠点コード
     * @return The value of the column 'DPCD'. (NullAllowed)
     */
    public String getDpcd() {
        return _dpcd;
    }

    /**
     * [set] DPCD: {varchar(30)} <br>
     * 配達拠点コード
     * @param dpcd The value of the column 'DPCD'. (NullAllowed)
     */
    public void setDpcd(String dpcd) {
        __modifiedProperties.add("dpcd");
        this._dpcd = dpcd;
    }

    /**
     * [get] DED: {varchar(30)} <br>
     * 配達方面
     * @return The value of the column 'DED'. (NullAllowed)
     */
    public String getDed() {
        return _ded;
    }

    /**
     * [set] DED: {varchar(30)} <br>
     * 配達方面
     * @param ded The value of the column 'DED'. (NullAllowed)
     */
    public void setDed(String ded) {
        __modifiedProperties.add("ded");
        this._ded = ded;
    }

    /**
     * [get] PSTNID: {char(1)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (NullAllowed)
     */
    public String getPstnid() {
        return _pstnid;
    }

    /**
     * [set] PSTNID: {char(1)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (NullAllowed)
     */
    public void setPstnid(String pstnid) {
        __modifiedProperties.add("pstnid");
        this._pstnid = pstnid;
    }

    /**
     * [get] DLVRNK: {varchar(30)} <br>
     * 配達順位
     * @return The value of the column 'DLVRNK'. (NullAllowed)
     */
    public String getDlvrnk() {
        return _dlvrnk;
    }

    /**
     * [set] DLVRNK: {varchar(30)} <br>
     * 配達順位
     * @param dlvrnk The value of the column 'DLVRNK'. (NullAllowed)
     */
    public void setDlvrnk(String dlvrnk) {
        __modifiedProperties.add("dlvrnk");
        this._dlvrnk = dlvrnk;
    }

    /**
     * [get] DLVSNM: {bigint(19)} <br>
     * 仕分通番
     * @return The value of the column 'DLVSNM'. (NullAllowed)
     */
    public Long getDlvsnm() {
        return _dlvsnm;
    }

    /**
     * [set] DLVSNM: {bigint(19)} <br>
     * 仕分通番
     * @param dlvsnm The value of the column 'DLVSNM'. (NullAllowed)
     */
    public void setDlvsnm(Long dlvsnm) {
        __modifiedProperties.add("dlvsnm");
        this._dlvsnm = dlvsnm;
    }

    /**
     * [get] SROPRTCNT: {bigint(19)} <br>
     * 仕分回数
     * @return The value of the column 'SROPRTCNT'. (NullAllowed)
     */
    public Long getSroprtcnt() {
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {bigint(19)} <br>
     * 仕分回数
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (NullAllowed)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        __modifiedProperties.add("sroprtcnt");
        this._sroprtcnt = sroprtcnt;
    }

    /**
     * [get] SSCD: {varchar(30)} <br>
     * お得意様コード
     * @return The value of the column 'SSCD'. (NullAllowed)
     */
    public String getSscd() {
        return _sscd;
    }

    /**
     * [set] SSCD: {varchar(30)} <br>
     * お得意様コード
     * @param sscd The value of the column 'SSCD'. (NullAllowed)
     */
    public void setSscd(String sscd) {
        __modifiedProperties.add("sscd");
        this._sscd = sscd;
    }

    /**
     * [get] DLVYMD: {varchar(8)} <br>
     * 販売年月日
     * @return The value of the column 'DLVYMD'. (NullAllowed)
     */
    public String getDlvymd() {
        return _dlvymd;
    }

    /**
     * [set] DLVYMD: {varchar(8)} <br>
     * 販売年月日
     * @param dlvymd The value of the column 'DLVYMD'. (NullAllowed)
     */
    public void setDlvymd(String dlvymd) {
        __modifiedProperties.add("dlvymd");
        this._dlvymd = dlvymd;
    }

    /**
     * [get] ZZORDYMD: {varchar(8)} <br>
     * さしず年月日
     * @return The value of the column 'ZZORDYMD'. (NullAllowed)
     */
    public String getZzordymd() {
        return _zzordymd;
    }

    /**
     * [set] ZZORDYMD: {varchar(8)} <br>
     * さしず年月日
     * @param zzordymd The value of the column 'ZZORDYMD'. (NullAllowed)
     */
    public void setZzordymd(String zzordymd) {
        __modifiedProperties.add("zzordymd");
        this._zzordymd = zzordymd;
    }

    /**
     * [get] SLPMRGTMG: {varchar(30)} <br>
     * 帳票マージタイミング
     * @return The value of the column 'SLPMRGTMG'. (NullAllowed)
     */
    public String getSlpmrgtmg() {
        return _slpmrgtmg;
    }

    /**
     * [set] SLPMRGTMG: {varchar(30)} <br>
     * 帳票マージタイミング
     * @param slpmrgtmg The value of the column 'SLPMRGTMG'. (NullAllowed)
     */
    public void setSlpmrgtmg(String slpmrgtmg) {
        __modifiedProperties.add("slpmrgtmg");
        this._slpmrgtmg = slpmrgtmg;
    }

    /**
     * [get] ORDGR: {varchar(30)} <br>
     * さしずグループ
     * @return The value of the column 'ORDGR'. (NullAllowed)
     */
    public String getOrdgr() {
        return _ordgr;
    }

    /**
     * [set] ORDGR: {varchar(30)} <br>
     * さしずグループ
     * @param ordgr The value of the column 'ORDGR'. (NullAllowed)
     */
    public void setOrdgr(String ordgr) {
        __modifiedProperties.add("ordgr");
        this._ordgr = ordgr;
    }

    /**
     * [get] S: {bigint(19)} <br>
     * 正箱個口
     * @return The value of the column 'S'. (NullAllowed)
     */
    public Long getS() {
        return _s;
    }

    /**
     * [set] S: {bigint(19)} <br>
     * 正箱個口
     * @param s The value of the column 'S'. (NullAllowed)
     */
    public void setS(Long s) {
        __modifiedProperties.add("s");
        this._s = s;
    }

    /**
     * [get] H: {bigint(19)} <br>
     * 半箱個口
     * @return The value of the column 'H'. (NullAllowed)
     */
    public Long getH() {
        return _h;
    }

    /**
     * [set] H: {bigint(19)} <br>
     * 半箱個口
     * @param h The value of the column 'H'. (NullAllowed)
     */
    public void setH(Long h) {
        __modifiedProperties.add("h");
        this._h = h;
    }

    /**
     * [get] M: {bigint(19)} <br>
     * 丸段個口
     * @return The value of the column 'M'. (NullAllowed)
     */
    public Long getM() {
        return _m;
    }

    /**
     * [set] M: {bigint(19)} <br>
     * 丸段個口
     * @param m The value of the column 'M'. (NullAllowed)
     */
    public void setM(Long m) {
        __modifiedProperties.add("m");
        this._m = m;
    }

    /**
     * [get] SRYMD: {varchar(8)} <br>
     * 仕分年月日
     * @return The value of the column 'SRYMD'. (NullAllowed)
     */
    public String getSrymd() {
        return _srymd;
    }

    /**
     * [set] SRYMD: {varchar(8)} <br>
     * 仕分年月日
     * @param srymd The value of the column 'SRYMD'. (NullAllowed)
     */
    public void setSrymd(String srymd) {
        __modifiedProperties.add("srymd");
        this._srymd = srymd;
    }

    /**
     * [get] RLYBSCD: {varchar(30)} <br>
     * 中継拠点コード
     * @return The value of the column 'RLYBSCD'. (NullAllowed)
     */
    public String getRlybscd() {
        return _rlybscd;
    }

    /**
     * [set] RLYBSCD: {varchar(30)} <br>
     * 中継拠点コード
     * @param rlybscd The value of the column 'RLYBSCD'. (NullAllowed)
     */
    public void setRlybscd(String rlybscd) {
        __modifiedProperties.add("rlybscd");
        this._rlybscd = rlybscd;
    }

    /**
     * [get] KEEPAREAH1: {varchar(30)} <br>
     * 拡張項目親ヘッダ
     * @return The value of the column 'KEEPAREAH1'. (NullAllowed)
     */
    public String getKeepareah1() {
        return _keepareah1;
    }

    /**
     * [set] KEEPAREAH1: {varchar(30)} <br>
     * 拡張項目親ヘッダ
     * @param keepareah1 The value of the column 'KEEPAREAH1'. (NullAllowed)
     */
    public void setKeepareah1(String keepareah1) {
        __modifiedProperties.add("keepareah1");
        this._keepareah1 = keepareah1;
    }

    /**
     * [get] SLPTYP: {varchar(30)} <br>
     * 伝票タイプ
     * @return The value of the column 'SLPTYP'. (NullAllowed)
     */
    public String getSlptyp() {
        return _slptyp;
    }

    /**
     * [set] SLPTYP: {varchar(30)} <br>
     * 伝票タイプ
     * @param slptyp The value of the column 'SLPTYP'. (NullAllowed)
     */
    public void setSlptyp(String slptyp) {
        __modifiedProperties.add("slptyp");
        this._slptyp = slptyp;
    }

    /**
     * [get] CMPCD: {varchar(30)} <br>
     * 会社コード
     * @return The value of the column 'CMPCD'. (NullAllowed)
     */
    public String getCmpcd() {
        return _cmpcd;
    }

    /**
     * [set] CMPCD: {varchar(30)} <br>
     * 会社コード
     * @param cmpcd The value of the column 'CMPCD'. (NullAllowed)
     */
    public void setCmpcd(String cmpcd) {
        __modifiedProperties.add("cmpcd");
        this._cmpcd = cmpcd;
    }

    /**
     * [get] SLPNO: {varchar(30)} <br>
     * 伝票番号
     * @return The value of the column 'SLPNO'. (NullAllowed)
     */
    public String getSlpno() {
        return _slpno;
    }

    /**
     * [set] SLPNO: {varchar(30)} <br>
     * 伝票番号
     * @param slpno The value of the column 'SLPNO'. (NullAllowed)
     */
    public void setSlpno(String slpno) {
        __modifiedProperties.add("slpno");
        this._slpno = slpno;
    }

    /**
     * [get] SLEDIV: {varchar(30)} <br>
     * 販売区分
     * @return The value of the column 'SLEDIV'. (NullAllowed)
     */
    public String getSlediv() {
        return _slediv;
    }

    /**
     * [set] SLEDIV: {varchar(30)} <br>
     * 販売区分
     * @param slediv The value of the column 'SLEDIV'. (NullAllowed)
     */
    public void setSlediv(String slediv) {
        __modifiedProperties.add("slediv");
        this._slediv = slediv;
    }

    /**
     * [get] CNGPRTSLPNO: {varchar(30)} <br>
     * 相手伝票番号
     * @return The value of the column 'CNGPRTSLPNO'. (NullAllowed)
     */
    public String getCngprtslpno() {
        return _cngprtslpno;
    }

    /**
     * [set] CNGPRTSLPNO: {varchar(30)} <br>
     * 相手伝票番号
     * @param cngprtslpno The value of the column 'CNGPRTSLPNO'. (NullAllowed)
     */
    public void setCngprtslpno(String cngprtslpno) {
        __modifiedProperties.add("cngprtslpno");
        this._cngprtslpno = cngprtslpno;
    }

    /**
     * [get] SPPLYMD: {varchar(8)} <br>
     * 出荷予定日
     * @return The value of the column 'SPPLYMD'. (NullAllowed)
     */
    public String getSpplymd() {
        return _spplymd;
    }

    /**
     * [set] SPPLYMD: {varchar(8)} <br>
     * 出荷予定日
     * @param spplymd The value of the column 'SPPLYMD'. (NullAllowed)
     */
    public void setSpplymd(String spplymd) {
        __modifiedProperties.add("spplymd");
        this._spplymd = spplymd;
    }

    /**
     * [get] CGGDID: {varchar(30)} <br>
     * たばこ商品区分
     * @return The value of the column 'CGGDID'. (NullAllowed)
     */
    public String getCggdid() {
        return _cggdid;
    }

    /**
     * [set] CGGDID: {varchar(30)} <br>
     * たばこ商品区分
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed)
     */
    public void setCggdid(String cggdid) {
        __modifiedProperties.add("cggdid");
        this._cggdid = cggdid;
    }

    /**
     * [get] KEEPAREAH2: {varchar(30)} <br>
     * 拡張項目子ヘッダ
     * @return The value of the column 'KEEPAREAH2'. (NullAllowed)
     */
    public String getKeepareah2() {
        return _keepareah2;
    }

    /**
     * [set] KEEPAREAH2: {varchar(30)} <br>
     * 拡張項目子ヘッダ
     * @param keepareah2 The value of the column 'KEEPAREAH2'. (NullAllowed)
     */
    public void setKeepareah2(String keepareah2) {
        __modifiedProperties.add("keepareah2");
        this._keepareah2 = keepareah2;
    }

    /**
     * [get] ZZMATNR: {varchar(30)} <br>
     * 銘柄コード
     * @return The value of the column 'ZZMATNR'. (NullAllowed)
     */
    public String getZzmatnr() {
        return _zzmatnr;
    }

    /**
     * [set] ZZMATNR: {varchar(30)} <br>
     * 銘柄コード
     * @param zzmatnr The value of the column 'ZZMATNR'. (NullAllowed)
     */
    public void setZzmatnr(String zzmatnr) {
        __modifiedProperties.add("zzmatnr");
        this._zzmatnr = zzmatnr;
    }

    /**
     * [get] BOXNO: {varchar(30)} <br>
     * 箱No
     * @return The value of the column 'BOXNO'. (NullAllowed)
     */
    public String getBoxno() {
        return _boxno;
    }

    /**
     * [set] BOXNO: {varchar(30)} <br>
     * 箱No
     * @param boxno The value of the column 'BOXNO'. (NullAllowed)
     */
    public void setBoxno(String boxno) {
        __modifiedProperties.add("boxno");
        this._boxno = boxno;
    }

    /**
     * [get] BOXTYPE: {varchar(30)} <br>
     * 段ボール種類
     * @return The value of the column 'BOXTYPE'. (NullAllowed)
     */
    public String getBoxtype() {
        return _boxtype;
    }

    /**
     * [set] BOXTYPE: {varchar(30)} <br>
     * 段ボール種類
     * @param boxtype The value of the column 'BOXTYPE'. (NullAllowed)
     */
    public void setBoxtype(String boxtype) {
        __modifiedProperties.add("boxtype");
        this._boxtype = boxtype;
    }

    /**
     * [get] ZZMATNRTOTAL: {bigint(19)} <br>
     * カートン数
     * @return The value of the column 'ZZMATNRTOTAL'. (NullAllowed)
     */
    public Long getZzmatnrtotal() {
        return _zzmatnrtotal;
    }

    /**
     * [set] ZZMATNRTOTAL: {bigint(19)} <br>
     * カートン数
     * @param zzmatnrtotal The value of the column 'ZZMATNRTOTAL'. (NullAllowed)
     */
    public void setZzmatnrtotal(Long zzmatnrtotal) {
        __modifiedProperties.add("zzmatnrtotal");
        this._zzmatnrtotal = zzmatnrtotal;
    }

    /**
     * [get] BOXNOCNSNM: {varchar(30)} <br>
     * 箱No（通番）
     * @return The value of the column 'BOXNOCNSNM'. (NullAllowed)
     */
    public String getBoxnocnsnm() {
        return _boxnocnsnm;
    }

    /**
     * [set] BOXNOCNSNM: {varchar(30)} <br>
     * 箱No（通番）
     * @param boxnocnsnm The value of the column 'BOXNOCNSNM'. (NullAllowed)
     */
    public void setBoxnocnsnm(String boxnocnsnm) {
        __modifiedProperties.add("boxnocnsnm");
        this._boxnocnsnm = boxnocnsnm;
    }

    /**
     * [get] BXOSZL: {bigint(19)} <br>
     * 梱包ケースサイズ(縦)
     * @return The value of the column 'BXOSZL'. (NullAllowed)
     */
    public Long getBxoszl() {
        return _bxoszl;
    }

    /**
     * [set] BXOSZL: {bigint(19)} <br>
     * 梱包ケースサイズ(縦)
     * @param bxoszl The value of the column 'BXOSZL'. (NullAllowed)
     */
    public void setBxoszl(Long bxoszl) {
        __modifiedProperties.add("bxoszl");
        this._bxoszl = bxoszl;
    }

    /**
     * [get] BXOSZH: {bigint(19)} <br>
     * 梱包ケースサイズ(高さ)
     * @return The value of the column 'BXOSZH'. (NullAllowed)
     */
    public Long getBxoszh() {
        return _bxoszh;
    }

    /**
     * [set] BXOSZH: {bigint(19)} <br>
     * 梱包ケースサイズ(高さ)
     * @param bxoszh The value of the column 'BXOSZH'. (NullAllowed)
     */
    public void setBxoszh(Long bxoszh) {
        __modifiedProperties.add("bxoszh");
        this._bxoszh = bxoszh;
    }

    /**
     * [get] BXOSZW: {bigint(19)} <br>
     * 梱包ケースサイズ(横)
     * @return The value of the column 'BXOSZW'. (NullAllowed)
     */
    public Long getBxoszw() {
        return _bxoszw;
    }

    /**
     * [set] BXOSZW: {bigint(19)} <br>
     * 梱包ケースサイズ(横)
     * @param bxoszw The value of the column 'BXOSZW'. (NullAllowed)
     */
    public void setBxoszw(Long bxoszw) {
        __modifiedProperties.add("bxoszw");
        this._bxoszw = bxoszw;
    }

    /**
     * [get] BOXTOTALWEIGH: {bigint(19)} <br>
     * 梱包総重量
     * @return The value of the column 'BOXTOTALWEIGH'. (NullAllowed)
     */
    public Long getBoxtotalweigh() {
        return _boxtotalweigh;
    }

    /**
     * [set] BOXTOTALWEIGH: {bigint(19)} <br>
     * 梱包総重量
     * @param boxtotalweigh The value of the column 'BOXTOTALWEIGH'. (NullAllowed)
     */
    public void setBoxtotalweigh(Long boxtotalweigh) {
        __modifiedProperties.add("boxtotalweigh");
        this._boxtotalweigh = boxtotalweigh;
    }

    /**
     * [get] WEIGHTYPE: {varchar(30)} <br>
     * 重量識別区分
     * @return The value of the column 'WEIGHTYPE'. (NullAllowed)
     */
    public String getWeightype() {
        return _weightype;
    }

    /**
     * [set] WEIGHTYPE: {varchar(30)} <br>
     * 重量識別区分
     * @param weightype The value of the column 'WEIGHTYPE'. (NullAllowed)
     */
    public void setWeightype(String weightype) {
        __modifiedProperties.add("weightype");
        this._weightype = weightype;
    }

    /**
     * [get] BOXTOTALNUMBER: {bigint(19)} <br>
     * 梱包内総数量
     * @return The value of the column 'BOXTOTALNUMBER'. (NullAllowed)
     */
    public Long getBoxtotalnumber() {
        return _boxtotalnumber;
    }

    /**
     * [set] BOXTOTALNUMBER: {bigint(19)} <br>
     * 梱包内総数量
     * @param boxtotalnumber The value of the column 'BOXTOTALNUMBER'. (NullAllowed)
     */
    public void setBoxtotalnumber(Long boxtotalnumber) {
        __modifiedProperties.add("boxtotalnumber");
        this._boxtotalnumber = boxtotalnumber;
    }

    /**
     * [get] KEEPAREAM1: {varchar(30)} <br>
     * 拡張項目明細
     * @return The value of the column 'KEEPAREAM1'. (NullAllowed)
     */
    public String getKeepaream1() {
        return _keepaream1;
    }

    /**
     * [set] KEEPAREAM1: {varchar(30)} <br>
     * 拡張項目明細
     * @param keepaream1 The value of the column 'KEEPAREAM1'. (NullAllowed)
     */
    public void setKeepaream1(String keepaream1) {
        __modifiedProperties.add("keepaream1");
        this._keepaream1 = keepaream1;
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
