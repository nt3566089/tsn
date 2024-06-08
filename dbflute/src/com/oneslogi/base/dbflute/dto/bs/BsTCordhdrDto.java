package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_CORDHDR as TABLE. <br>
 * さしずヘッダ
 * <pre>
 * [primary-key]
 *     ORDER_H_ID
 *
 * [column]
 *     ORDER_H_ID, CENTER_ID, CLIENT_ID, ZZORGNCD, DPCD, ZZORDYMD, ORDGR, DLVYMD, DED, PSTNID, SCDDLVYMD, SCDDED, SCDPSTNID, IOID, CTQA, STA, WRKMFG, SROPRTCNT, CORDRCVCNT, COMPLETE_FLG, RCV_FLG, SKIP_KBN, SORT_DATE, COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ORDER_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer-table]
 *     T_CORDDTAEC, T_CORDDTASR
 *
 * [foreign-property]
 *     mCenter, mClient
 *
 * [referrer-property]
 *     tCorddtaecList, tCorddtasrList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTCordhdrDto implements Serializable {

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
    /** ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _orderHId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** ZZORGNCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _zzorgncd;

    /** DPCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _dpcd;

    /** ZZORDYMD: {NotNull, varchar(8)} */
    @JsonKey
    protected String _zzordymd;

    /** ORDGR: {NotNull, varchar(30)} */
    @JsonKey
    protected String _ordgr;

    /** DLVYMD: {NotNull, varchar(8)} */
    @JsonKey
    protected String _dlvymd;

    /** DED: {NotNull, varchar(30)} */
    @JsonKey
    protected String _ded;

    /** PSTNID: {NotNull, varchar(30)} */
    @JsonKey
    protected String _pstnid;

    /** SCDDLVYMD: {NotNull, varchar(8)} */
    @JsonKey
    protected String _scddlvymd;

    /** SCDDED: {NotNull, varchar(30)} */
    @JsonKey
    protected String _scdded;

    /** SCDPSTNID: {NotNull, varchar(30)} */
    @JsonKey
    protected String _scdpstnid;

    /** IOID: {NotNull, char(1)} */
    @JsonKey
    protected String _ioid;

    /** CTQA: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _ctqa;

    /** STA: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sta;

    /** WRKMFG: {NotNull, char(1)} */
    @JsonKey
    protected String _wrkmfg;

    /** SROPRTCNT: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sroprtcnt;

    /** CORDRCVCNT: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _cordrcvcnt;

    /** COMPLETE_FLG: {NotNull, char(1)} */
    @JsonKey
    protected String _completeFlg;

    /** RCV_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _rcvFlg;

    /** SKIP_KBN: {varchar(30)} */
    @JsonKey
    protected String _skipKbn;

    /** SORT_DATE: {varchar(8)} */
    @JsonKey
    protected String _sortDate;

    /** COMMENT: {varchar(255)} */
    @JsonKey
    protected String _comment;

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
    public BsTCordhdrDto() {
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
    protected List<TCorddtaecDto> _tCorddtaecList;

    public List<TCorddtaecDto> getTCorddtaecList() {
        if (_tCorddtaecList == null) { _tCorddtaecList = new ArrayList<TCorddtaecDto>(); }
        return _tCorddtaecList;
    }

    public void setTCorddtaecList(List<TCorddtaecDto> tCorddtaecList) {
        this._tCorddtaecList = tCorddtaecList;
    }

    protected List<TCorddtasrDto> _tCorddtasrList;

    public List<TCorddtasrDto> getTCorddtasrList() {
        if (_tCorddtasrList == null) { _tCorddtasrList = new ArrayList<TCorddtasrDto>(); }
        return _tCorddtasrList;
    }

    public void setTCorddtasrList(List<TCorddtasrDto> tCorddtasrList) {
        this._tCorddtasrList = tCorddtasrList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTCordhdrDto)) { return false; }
        final BsTCordhdrDto otherEntity = (BsTCordhdrDto)other;
        if (!helpComparingValue(getOrderHId(), otherEntity.getOrderHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_CORDHDR");
        result = xCH(result, getOrderHId());
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
        sb.append(c).append(getOrderHId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getZzorgncd());
        sb.append(c).append(getDpcd());
        sb.append(c).append(getZzordymd());
        sb.append(c).append(getOrdgr());
        sb.append(c).append(getDlvymd());
        sb.append(c).append(getDed());
        sb.append(c).append(getPstnid());
        sb.append(c).append(getScddlvymd());
        sb.append(c).append(getScdded());
        sb.append(c).append(getScdpstnid());
        sb.append(c).append(getIoid());
        sb.append(c).append(getCtqa());
        sb.append(c).append(getSta());
        sb.append(c).append(getWrkmfg());
        sb.append(c).append(getSroprtcnt());
        sb.append(c).append(getCordrcvcnt());
        sb.append(c).append(getCompleteFlg());
        sb.append(c).append(getRcvFlg());
        sb.append(c).append(getSkipKbn());
        sb.append(c).append(getSortDate());
        sb.append(c).append(getComment());
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
     * [get] ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしずヘッダID
     * @return The value of the column 'ORDER_H_ID'. (NullAllowed)
     */
    public Long getOrderHId() {
        return _orderHId;
    }

    /**
     * [set] ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしずヘッダID
     * @param orderHId The value of the column 'ORDER_H_ID'. (NullAllowed)
     */
    public void setOrderHId(Long orderHId) {
        __modifiedProperties.add("orderHId");
        this._orderHId = orderHId;
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
     * [get] ZZORGNCD: {NotNull, varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'ZZORGNCD'. (NullAllowed)
     */
    public String getZzorgncd() {
        return _zzorgncd;
    }

    /**
     * [set] ZZORGNCD: {NotNull, varchar(30)} <br>
     * 組織CD
     * @param zzorgncd The value of the column 'ZZORGNCD'. (NullAllowed)
     */
    public void setZzorgncd(String zzorgncd) {
        __modifiedProperties.add("zzorgncd");
        this._zzorgncd = zzorgncd;
    }

    /**
     * [get] DPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPCD'. (NullAllowed)
     */
    public String getDpcd() {
        return _dpcd;
    }

    /**
     * [set] DPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @param dpcd The value of the column 'DPCD'. (NullAllowed)
     */
    public void setDpcd(String dpcd) {
        __modifiedProperties.add("dpcd");
        this._dpcd = dpcd;
    }

    /**
     * [get] ZZORDYMD: {NotNull, varchar(8)} <br>
     * さしず年月日
     * @return The value of the column 'ZZORDYMD'. (NullAllowed)
     */
    public String getZzordymd() {
        return _zzordymd;
    }

    /**
     * [set] ZZORDYMD: {NotNull, varchar(8)} <br>
     * さしず年月日
     * @param zzordymd The value of the column 'ZZORDYMD'. (NullAllowed)
     */
    public void setZzordymd(String zzordymd) {
        __modifiedProperties.add("zzordymd");
        this._zzordymd = zzordymd;
    }

    /**
     * [get] ORDGR: {NotNull, varchar(30)} <br>
     * さしずグループ
     * @return The value of the column 'ORDGR'. (NullAllowed)
     */
    public String getOrdgr() {
        return _ordgr;
    }

    /**
     * [set] ORDGR: {NotNull, varchar(30)} <br>
     * さしずグループ
     * @param ordgr The value of the column 'ORDGR'. (NullAllowed)
     */
    public void setOrdgr(String ordgr) {
        __modifiedProperties.add("ordgr");
        this._ordgr = ordgr;
    }

    /**
     * [get] DLVYMD: {NotNull, varchar(8)} <br>
     * 配達年月日
     * @return The value of the column 'DLVYMD'. (NullAllowed)
     */
    public String getDlvymd() {
        return _dlvymd;
    }

    /**
     * [set] DLVYMD: {NotNull, varchar(8)} <br>
     * 配達年月日
     * @param dlvymd The value of the column 'DLVYMD'. (NullAllowed)
     */
    public void setDlvymd(String dlvymd) {
        __modifiedProperties.add("dlvymd");
        this._dlvymd = dlvymd;
    }

    /**
     * [get] DED: {NotNull, varchar(30)} <br>
     * 配達方面
     * @return The value of the column 'DED'. (NullAllowed)
     */
    public String getDed() {
        return _ded;
    }

    /**
     * [set] DED: {NotNull, varchar(30)} <br>
     * 配達方面
     * @param ded The value of the column 'DED'. (NullAllowed)
     */
    public void setDed(String ded) {
        __modifiedProperties.add("ded");
        this._ded = ded;
    }

    /**
     * [get] PSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (NullAllowed)
     */
    public String getPstnid() {
        return _pstnid;
    }

    /**
     * [set] PSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (NullAllowed)
     */
    public void setPstnid(String pstnid) {
        __modifiedProperties.add("pstnid");
        this._pstnid = pstnid;
    }

    /**
     * [get] SCDDLVYMD: {NotNull, varchar(8)} <br>
     * 画面表示用配達年月日
     * @return The value of the column 'SCDDLVYMD'. (NullAllowed)
     */
    public String getScddlvymd() {
        return _scddlvymd;
    }

    /**
     * [set] SCDDLVYMD: {NotNull, varchar(8)} <br>
     * 画面表示用配達年月日
     * @param scddlvymd The value of the column 'SCDDLVYMD'. (NullAllowed)
     */
    public void setScddlvymd(String scddlvymd) {
        __modifiedProperties.add("scddlvymd");
        this._scddlvymd = scddlvymd;
    }

    /**
     * [get] SCDDED: {NotNull, varchar(30)} <br>
     * 画面表示用配達方面
     * @return The value of the column 'SCDDED'. (NullAllowed)
     */
    public String getScdded() {
        return _scdded;
    }

    /**
     * [set] SCDDED: {NotNull, varchar(30)} <br>
     * 画面表示用配達方面
     * @param scdded The value of the column 'SCDDED'. (NullAllowed)
     */
    public void setScdded(String scdded) {
        __modifiedProperties.add("scdded");
        this._scdded = scdded;
    }

    /**
     * [get] SCDPSTNID: {NotNull, varchar(30)} <br>
     * 画面表示用ピストン区分
     * @return The value of the column 'SCDPSTNID'. (NullAllowed)
     */
    public String getScdpstnid() {
        return _scdpstnid;
    }

    /**
     * [set] SCDPSTNID: {NotNull, varchar(30)} <br>
     * 画面表示用ピストン区分
     * @param scdpstnid The value of the column 'SCDPSTNID'. (NullAllowed)
     */
    public void setScdpstnid(String scdpstnid) {
        __modifiedProperties.add("scdpstnid");
        this._scdpstnid = scdpstnid;
    }

    /**
     * [get] IOID: {NotNull, char(1)} <br>
     * 内外区分
     * @return The value of the column 'IOID'. (NullAllowed)
     */
    public String getIoid() {
        return _ioid;
    }

    /**
     * [set] IOID: {NotNull, char(1)} <br>
     * 内外区分
     * @param ioid The value of the column 'IOID'. (NullAllowed)
     */
    public void setIoid(String ioid) {
        __modifiedProperties.add("ioid");
        this._ioid = ioid;
    }

    /**
     * [get] CTQA: {NotNull, bigint(19)} <br>
     * カートン数
     * @return The value of the column 'CTQA'. (NullAllowed)
     */
    public Long getCtqa() {
        return _ctqa;
    }

    /**
     * [set] CTQA: {NotNull, bigint(19)} <br>
     * カートン数
     * @param ctqa The value of the column 'CTQA'. (NullAllowed)
     */
    public void setCtqa(Long ctqa) {
        __modifiedProperties.add("ctqa");
        this._ctqa = ctqa;
    }

    /**
     * [get] STA: {NotNull, decimal(16, 6)} <br>
     * 状態
     * @return The value of the column 'STA'. (NullAllowed)
     */
    public java.math.BigDecimal getSta() {
        return _sta;
    }

    /**
     * [set] STA: {NotNull, decimal(16, 6)} <br>
     * 状態
     * @param sta The value of the column 'STA'. (NullAllowed)
     */
    public void setSta(java.math.BigDecimal sta) {
        __modifiedProperties.add("sta");
        this._sta = sta;
    }

    /**
     * [get] WRKMFG: {NotNull, char(1)} <br>
     * 割込フラグ
     * @return The value of the column 'WRKMFG'. (NullAllowed)
     */
    public String getWrkmfg() {
        return _wrkmfg;
    }

    /**
     * [set] WRKMFG: {NotNull, char(1)} <br>
     * 割込フラグ
     * @param wrkmfg The value of the column 'WRKMFG'. (NullAllowed)
     */
    public void setWrkmfg(String wrkmfg) {
        __modifiedProperties.add("wrkmfg");
        this._wrkmfg = wrkmfg;
    }

    /**
     * [get] SROPRTCNT: {NotNull, bigint(19)} <br>
     * 仕分作業回数
     * @return The value of the column 'SROPRTCNT'. (NullAllowed)
     */
    public Long getSroprtcnt() {
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {NotNull, bigint(19)} <br>
     * 仕分作業回数
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (NullAllowed)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        __modifiedProperties.add("sroprtcnt");
        this._sroprtcnt = sroprtcnt;
    }

    /**
     * [get] CORDRCVCNT: {NotNull, bigint(19)} <br>
     * さしず受信回数
     * @return The value of the column 'CORDRCVCNT'. (NullAllowed)
     */
    public Long getCordrcvcnt() {
        return _cordrcvcnt;
    }

    /**
     * [set] CORDRCVCNT: {NotNull, bigint(19)} <br>
     * さしず受信回数
     * @param cordrcvcnt The value of the column 'CORDRCVCNT'. (NullAllowed)
     */
    public void setCordrcvcnt(Long cordrcvcnt) {
        __modifiedProperties.add("cordrcvcnt");
        this._cordrcvcnt = cordrcvcnt;
    }

    /**
     * [get] COMPLETE_FLG: {NotNull, char(1)} <br>
     * 完了フラグ
     * @return The value of the column 'COMPLETE_FLG'. (NullAllowed)
     */
    public String getCompleteFlg() {
        return _completeFlg;
    }

    /**
     * [set] COMPLETE_FLG: {NotNull, char(1)} <br>
     * 完了フラグ
     * @param completeFlg The value of the column 'COMPLETE_FLG'. (NullAllowed)
     */
    public void setCompleteFlg(String completeFlg) {
        __modifiedProperties.add("completeFlg");
        this._completeFlg = completeFlg;
    }

    /**
     * [get] RCV_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込済フラグ
     * @return The value of the column 'RCV_FLG'. (NullAllowed)
     */
    public String getRcvFlg() {
        return _rcvFlg;
    }

    /**
     * [set] RCV_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込済フラグ
     * @param rcvFlg The value of the column 'RCV_FLG'. (NullAllowed)
     */
    public void setRcvFlg(String rcvFlg) {
        __modifiedProperties.add("rcvFlg");
        this._rcvFlg = rcvFlg;
    }

    /**
     * [get] SKIP_KBN: {varchar(30)} <br>
     * スキップ区分
     * @return The value of the column 'SKIP_KBN'. (NullAllowed)
     */
    public String getSkipKbn() {
        return _skipKbn;
    }

    /**
     * [set] SKIP_KBN: {varchar(30)} <br>
     * スキップ区分
     * @param skipKbn The value of the column 'SKIP_KBN'. (NullAllowed)
     */
    public void setSkipKbn(String skipKbn) {
        __modifiedProperties.add("skipKbn");
        this._skipKbn = skipKbn;
    }

    /**
     * [get] SORT_DATE: {varchar(8)} <br>
     * 仕分作業日付
     * @return The value of the column 'SORT_DATE'. (NullAllowed)
     */
    public String getSortDate() {
        return _sortDate;
    }

    /**
     * [set] SORT_DATE: {varchar(8)} <br>
     * 仕分作業日付
     * @param sortDate The value of the column 'SORT_DATE'. (NullAllowed)
     */
    public void setSortDate(String sortDate) {
        __modifiedProperties.add("sortDate");
        this._sortDate = sortDate;
    }

    /**
     * [get] COMMENT: {varchar(255)} <br>
     * コメント
     * @return The value of the column 'COMMENT'. (NullAllowed)
     */
    public String getComment() {
        return _comment;
    }

    /**
     * [set] COMMENT: {varchar(255)} <br>
     * コメント
     * @param comment The value of the column 'COMMENT'. (NullAllowed)
     */
    public void setComment(String comment) {
        __modifiedProperties.add("comment");
        this._comment = comment;
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
