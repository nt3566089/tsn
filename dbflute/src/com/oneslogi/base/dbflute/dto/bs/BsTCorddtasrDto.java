package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_CORDDTASR as TABLE. <br>
 * さしずデータ(仕分中）
 * <pre>
 * [primary-key]
 *     ORDER_SORT_ID
 *
 * [column]
 *     ORDER_SORT_ID, ORDER_H_ID, SRWHCD, DPCD, ZZORDYMD, ORDGR, DLVYMD, DED, PSTNID, SCDDLVYMD, SCDDED, SCDPSTNID, HPYNID, IPYNID, SRDED, SRPSTNID, SRYMD, SROPRTCNT, SRLINCD, SRRNK, DLVSNM, DLVDTLSNM, SSCD, SSNM, HDVID, DTLSNM, ZZMATNR, SLQACB, SLQACT, SLQANUM, LINBLK, LOCNO, LOCID, DLVPRTRNK, SRDLVYMD, SRHPYNID, SRIPYNID, SRSRLINCD, SRSRRNK, SRDLVSNM, SRDLVDTLSNM, SRDLVPRTRNK, BRTYP, BOXNO, BOXNOCNSNM, BOXTYP, MGBOXDID, DMDID, TTBOXQA, BOXCTQATA, BOXCTQAAPSRPLC, TTSROPRTCNT, BXMTRID, SPPLYMD, SLPTYP, SEQNO, OTORGCD, ORDORGCD, RLYBSCD, DLVRNK, LMPDLVNO, DIVMTD, SLEDIV, HVRTRSN, HVRTINOTYMD, CNGPRTSLPNO, TRNSCTNDIV, EOSORDAFTFLG, EOSSLPNO, HDRDBXDIV, INOTRFSLDIV, BXMNTRFSLDIV, SLPMRGTMG, SLPOTYMD, CMPCD, STSCD, STGVAL, SLPNO, TTTOPDEDRNK, CORDRCVCNT, ORDDVFG, LBCBQA, DRCLSTLBCBID, LBBOXNO, LBTTBOXQA, IKEIINCLDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ORDER_SORT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_CORDHDR
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tCordhdr
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTCorddtasrDto implements Serializable {

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
    /** ORDER_SORT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _orderSortId;

    /** ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR} */
    @JsonKey
    protected Long _orderHId;

    /** SRWHCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _srwhcd;

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

    /** PSTNID: {NotNull, char(1)} */
    @JsonKey
    protected String _pstnid;

    /** SCDDLVYMD: {varchar(8)} */
    @JsonKey
    protected String _scddlvymd;

    /** SCDDED: {NotNull, varchar(30)} */
    @JsonKey
    protected String _scdded;

    /** SCDPSTNID: {varchar(30)} */
    @JsonKey
    protected String _scdpstnid;

    /** HPYNID: {char(1)} */
    @JsonKey
    protected String _hpynid;

    /** IPYNID: {char(1)} */
    @JsonKey
    protected String _ipynid;

    /** SRDED: {varchar(30)} */
    @JsonKey
    protected String _srded;

    /** SRPSTNID: {varchar(30)} */
    @JsonKey
    protected String _srpstnid;

    /** SRYMD: {NotNull, varchar(8)} */
    @JsonKey
    protected String _srymd;

    /** SROPRTCNT: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sroprtcnt;

    /** SRLINCD: {varchar(30)} */
    @JsonKey
    protected String _srlincd;

    /** SRRNK: {bigint(19)} */
    @JsonKey
    protected Long _srrnk;

    /** DLVSNM: {bigint(19)} */
    @JsonKey
    protected Long _dlvsnm;

    /** DLVDTLSNM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _dlvdtlsnm;

    /** SSCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sscd;

    /** SSNM: {varchar(60)} */
    @JsonKey
    protected String _ssnm;

    /** HDVID: {char(1)} */
    @JsonKey
    protected String _hdvid;

    /** DTLSNM: {varchar(30)} */
    @JsonKey
    protected String _dtlsnm;

    /** ZZMATNR: {NotNull, varchar(30)} */
    @JsonKey
    protected String _zzmatnr;

    /** SLQACB: {bigint(19)} */
    @JsonKey
    protected Long _slqacb;

    /** SLQACT: {bigint(19)} */
    @JsonKey
    protected Long _slqact;

    /** SLQANUM: {bigint(19)} */
    @JsonKey
    protected Long _slqanum;

    /** LINBLK: {varchar(30)} */
    @JsonKey
    protected String _linblk;

    /** LOCNO: {varchar(30)} */
    @JsonKey
    protected String _locno;

    /** LOCID: {char(1)} */
    @JsonKey
    protected String _locid;

    /** DLVPRTRNK: {bigint(19)} */
    @JsonKey
    protected Long _dlvprtrnk;

    /** SRDLVYMD: {varchar(8)} */
    @JsonKey
    protected String _srdlvymd;

    /** SRHPYNID: {char(1)} */
    @JsonKey
    protected String _srhpynid;

    /** SRIPYNID: {char(1)} */
    @JsonKey
    protected String _sripynid;

    /** SRSRLINCD: {varchar(30)} */
    @JsonKey
    protected String _srsrlincd;

    /** SRSRRNK: {bigint(19)} */
    @JsonKey
    protected Long _srsrrnk;

    /** SRDLVSNM: {bigint(19)} */
    @JsonKey
    protected Long _srdlvsnm;

    /** SRDLVDTLSNM: {bigint(19)} */
    @JsonKey
    protected Long _srdlvdtlsnm;

    /** SRDLVPRTRNK: {bigint(19)} */
    @JsonKey
    protected Long _srdlvprtrnk;

    /** BRTYP: {varchar(30)} */
    @JsonKey
    protected String _brtyp;

    /** BOXNO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _boxno;

    /** BOXNOCNSNM: {varchar(30)} */
    @JsonKey
    protected String _boxnocnsnm;

    /** BOXTYP: {varchar(30)} */
    @JsonKey
    protected String _boxtyp;

    /** MGBOXDID: {char(1)} */
    @JsonKey
    protected String _mgboxdid;

    /** DMDID: {char(1)} */
    @JsonKey
    protected String _dmdid;

    /** TTBOXQA: {bigint(19)} */
    @JsonKey
    protected Long _ttboxqa;

    /** BOXCTQATA: {bigint(19)} */
    @JsonKey
    protected Long _boxctqata;

    /** BOXCTQAAPSRPLC: {bigint(19)} */
    @JsonKey
    protected Long _boxctqaapsrplc;

    /** TTSROPRTCNT: {bigint(19)} */
    @JsonKey
    protected Long _ttsroprtcnt;

    /** BXMTRID: {char(1)} */
    @JsonKey
    protected String _bxmtrid;

    /** SPPLYMD: {varchar(8)} */
    @JsonKey
    protected String _spplymd;

    /** SLPTYP: {NotNull, varchar(30)} */
    @JsonKey
    protected String _slptyp;

    /** SEQNO: {bigint(19)} */
    @JsonKey
    protected Long _seqno;

    /** OTORGCD: {varchar(30)} */
    @JsonKey
    protected String _otorgcd;

    /** ORDORGCD: {varchar(30)} */
    @JsonKey
    protected String _ordorgcd;

    /** RLYBSCD: {varchar(30)} */
    @JsonKey
    protected String _rlybscd;

    /** DLVRNK: {varchar(30)} */
    @JsonKey
    protected String _dlvrnk;

    /** LMPDLVNO: {varchar(30)} */
    @JsonKey
    protected String _lmpdlvno;

    /** DIVMTD: {char(1)} */
    @JsonKey
    protected String _divmtd;

    /** SLEDIV: {varchar(30)} */
    @JsonKey
    protected String _slediv;

    /** HVRTRSN: {varchar(30)} */
    @JsonKey
    protected String _hvrtrsn;

    /** HVRTINOTYMD: {varchar(30)} */
    @JsonKey
    protected String _hvrtinotymd;

    /** CNGPRTSLPNO: {varchar(30)} */
    @JsonKey
    protected String _cngprtslpno;

    /** TRNSCTNDIV: {char(1)} */
    @JsonKey
    protected String _trnsctndiv;

    /** EOSORDAFTFLG: {char(1)} */
    @JsonKey
    protected String _eosordaftflg;

    /** EOSSLPNO: {varchar(30)} */
    @JsonKey
    protected String _eosslpno;

    /** HDRDBXDIV: {char(1)} */
    @JsonKey
    protected String _hdrdbxdiv;

    /** INOTRFSLDIV: {char(1)} */
    @JsonKey
    protected String _inotrfsldiv;

    /** BXMNTRFSLDIV: {char(1)} */
    @JsonKey
    protected String _bxmntrfsldiv;

    /** SLPMRGTMG: {varchar(30)} */
    @JsonKey
    protected String _slpmrgtmg;

    /** SLPOTYMD: {varchar(8)} */
    @JsonKey
    protected String _slpotymd;

    /** CMPCD: {varchar(30)} */
    @JsonKey
    protected String _cmpcd;

    /** STSCD: {varchar(30)} */
    @JsonKey
    protected String _stscd;

    /** STGVAL: {bigint(19)} */
    @JsonKey
    protected Long _stgval;

    /** SLPNO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _slpno;

    /** TTTOPDEDRNK: {bigint(19)} */
    @JsonKey
    protected Long _tttopdedrnk;

    /** CORDRCVCNT: {bigint(19)} */
    @JsonKey
    protected Long _cordrcvcnt;

    /** ORDDVFG: {char(1)} */
    @JsonKey
    protected String _orddvfg;

    /** LBCBQA: {bigint(19), default=[0]} */
    @JsonKey
    protected Long _lbcbqa;

    /** DRCLSTLBCBID: {char(1)} */
    @JsonKey
    protected String _drclstlbcbid;

    /** LBBOXNO: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _lbboxno;

    /** LBTTBOXQA: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _lbttboxqa;

    /** IKEIINCLDFLG: {char(1), default=[0]} */
    @JsonKey
    protected String _ikeiincldflg;

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
    public BsTCorddtasrDto() {
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
    protected TCordhdrDto _tCordhdr;

    public TCordhdrDto getTCordhdr() {
        return _tCordhdr;
    }

    public void setTCordhdr(TCordhdrDto tCordhdr) {
        this._tCordhdr = tCordhdr;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTCorddtasrDto)) { return false; }
        final BsTCorddtasrDto otherEntity = (BsTCorddtasrDto)other;
        if (!helpComparingValue(getOrderSortId(), otherEntity.getOrderSortId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_CORDDTASR");
        result = xCH(result, getOrderSortId());
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
        sb.append(c).append(getOrderSortId());
        sb.append(c).append(getOrderHId());
        sb.append(c).append(getSrwhcd());
        sb.append(c).append(getDpcd());
        sb.append(c).append(getZzordymd());
        sb.append(c).append(getOrdgr());
        sb.append(c).append(getDlvymd());
        sb.append(c).append(getDed());
        sb.append(c).append(getPstnid());
        sb.append(c).append(getScddlvymd());
        sb.append(c).append(getScdded());
        sb.append(c).append(getScdpstnid());
        sb.append(c).append(getHpynid());
        sb.append(c).append(getIpynid());
        sb.append(c).append(getSrded());
        sb.append(c).append(getSrpstnid());
        sb.append(c).append(getSrymd());
        sb.append(c).append(getSroprtcnt());
        sb.append(c).append(getSrlincd());
        sb.append(c).append(getSrrnk());
        sb.append(c).append(getDlvsnm());
        sb.append(c).append(getDlvdtlsnm());
        sb.append(c).append(getSscd());
        sb.append(c).append(getSsnm());
        sb.append(c).append(getHdvid());
        sb.append(c).append(getDtlsnm());
        sb.append(c).append(getZzmatnr());
        sb.append(c).append(getSlqacb());
        sb.append(c).append(getSlqact());
        sb.append(c).append(getSlqanum());
        sb.append(c).append(getLinblk());
        sb.append(c).append(getLocno());
        sb.append(c).append(getLocid());
        sb.append(c).append(getDlvprtrnk());
        sb.append(c).append(getSrdlvymd());
        sb.append(c).append(getSrhpynid());
        sb.append(c).append(getSripynid());
        sb.append(c).append(getSrsrlincd());
        sb.append(c).append(getSrsrrnk());
        sb.append(c).append(getSrdlvsnm());
        sb.append(c).append(getSrdlvdtlsnm());
        sb.append(c).append(getSrdlvprtrnk());
        sb.append(c).append(getBrtyp());
        sb.append(c).append(getBoxno());
        sb.append(c).append(getBoxnocnsnm());
        sb.append(c).append(getBoxtyp());
        sb.append(c).append(getMgboxdid());
        sb.append(c).append(getDmdid());
        sb.append(c).append(getTtboxqa());
        sb.append(c).append(getBoxctqata());
        sb.append(c).append(getBoxctqaapsrplc());
        sb.append(c).append(getTtsroprtcnt());
        sb.append(c).append(getBxmtrid());
        sb.append(c).append(getSpplymd());
        sb.append(c).append(getSlptyp());
        sb.append(c).append(getSeqno());
        sb.append(c).append(getOtorgcd());
        sb.append(c).append(getOrdorgcd());
        sb.append(c).append(getRlybscd());
        sb.append(c).append(getDlvrnk());
        sb.append(c).append(getLmpdlvno());
        sb.append(c).append(getDivmtd());
        sb.append(c).append(getSlediv());
        sb.append(c).append(getHvrtrsn());
        sb.append(c).append(getHvrtinotymd());
        sb.append(c).append(getCngprtslpno());
        sb.append(c).append(getTrnsctndiv());
        sb.append(c).append(getEosordaftflg());
        sb.append(c).append(getEosslpno());
        sb.append(c).append(getHdrdbxdiv());
        sb.append(c).append(getInotrfsldiv());
        sb.append(c).append(getBxmntrfsldiv());
        sb.append(c).append(getSlpmrgtmg());
        sb.append(c).append(getSlpotymd());
        sb.append(c).append(getCmpcd());
        sb.append(c).append(getStscd());
        sb.append(c).append(getStgval());
        sb.append(c).append(getSlpno());
        sb.append(c).append(getTttopdedrnk());
        sb.append(c).append(getCordrcvcnt());
        sb.append(c).append(getOrddvfg());
        sb.append(c).append(getLbcbqa());
        sb.append(c).append(getDrclstlbcbid());
        sb.append(c).append(getLbboxno());
        sb.append(c).append(getLbttboxqa());
        sb.append(c).append(getIkeiincldflg());
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
     * [get] ORDER_SORT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしずデータ(仕分中)ID
     * @return The value of the column 'ORDER_SORT_ID'. (NullAllowed)
     */
    public Long getOrderSortId() {
        return _orderSortId;
    }

    /**
     * [set] ORDER_SORT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしずデータ(仕分中)ID
     * @param orderSortId The value of the column 'ORDER_SORT_ID'. (NullAllowed)
     */
    public void setOrderSortId(Long orderSortId) {
        __modifiedProperties.add("orderSortId");
        this._orderSortId = orderSortId;
    }

    /**
     * [get] ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR} <br>
     * さしずヘッダID
     * @return The value of the column 'ORDER_H_ID'. (NullAllowed)
     */
    public Long getOrderHId() {
        return _orderHId;
    }

    /**
     * [set] ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR} <br>
     * さしずヘッダID
     * @param orderHId The value of the column 'ORDER_H_ID'. (NullAllowed)
     */
    public void setOrderHId(Long orderHId) {
        __modifiedProperties.add("orderHId");
        this._orderHId = orderHId;
    }

    /**
     * [get] SRWHCD: {NotNull, varchar(30)} <br>
     * 仕分拠点CD
     * @return The value of the column 'SRWHCD'. (NullAllowed)
     */
    public String getSrwhcd() {
        return _srwhcd;
    }

    /**
     * [set] SRWHCD: {NotNull, varchar(30)} <br>
     * 仕分拠点CD
     * @param srwhcd The value of the column 'SRWHCD'. (NullAllowed)
     */
    public void setSrwhcd(String srwhcd) {
        __modifiedProperties.add("srwhcd");
        this._srwhcd = srwhcd;
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
     * [get] PSTNID: {NotNull, char(1)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (NullAllowed)
     */
    public String getPstnid() {
        return _pstnid;
    }

    /**
     * [set] PSTNID: {NotNull, char(1)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (NullAllowed)
     */
    public void setPstnid(String pstnid) {
        __modifiedProperties.add("pstnid");
        this._pstnid = pstnid;
    }

    /**
     * [get] SCDDLVYMD: {varchar(8)} <br>
     * 画面表示用配達年月日
     * @return The value of the column 'SCDDLVYMD'. (NullAllowed)
     */
    public String getScddlvymd() {
        return _scddlvymd;
    }

    /**
     * [set] SCDDLVYMD: {varchar(8)} <br>
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
     * [get] SCDPSTNID: {varchar(30)} <br>
     * 画面表示用ピストン区分
     * @return The value of the column 'SCDPSTNID'. (NullAllowed)
     */
    public String getScdpstnid() {
        return _scdpstnid;
    }

    /**
     * [set] SCDPSTNID: {varchar(30)} <br>
     * 画面表示用ピストン区分
     * @param scdpstnid The value of the column 'SCDPSTNID'. (NullAllowed)
     */
    public void setScdpstnid(String scdpstnid) {
        __modifiedProperties.add("scdpstnid");
        this._scdpstnid = scdpstnid;
    }

    /**
     * [get] HPYNID: {char(1)} <br>
     * 国内の有無区分
     * @return The value of the column 'HPYNID'. (NullAllowed)
     */
    public String getHpynid() {
        return _hpynid;
    }

    /**
     * [set] HPYNID: {char(1)} <br>
     * 国内の有無区分
     * @param hpynid The value of the column 'HPYNID'. (NullAllowed)
     */
    public void setHpynid(String hpynid) {
        __modifiedProperties.add("hpynid");
        this._hpynid = hpynid;
    }

    /**
     * [get] IPYNID: {char(1)} <br>
     * 輸入の有無区分
     * @return The value of the column 'IPYNID'. (NullAllowed)
     */
    public String getIpynid() {
        return _ipynid;
    }

    /**
     * [set] IPYNID: {char(1)} <br>
     * 輸入の有無区分
     * @param ipynid The value of the column 'IPYNID'. (NullAllowed)
     */
    public void setIpynid(String ipynid) {
        __modifiedProperties.add("ipynid");
        this._ipynid = ipynid;
    }

    /**
     * [get] SRDED: {varchar(30)} <br>
     * CAP用配達方面
     * @return The value of the column 'SRDED'. (NullAllowed)
     */
    public String getSrded() {
        return _srded;
    }

    /**
     * [set] SRDED: {varchar(30)} <br>
     * CAP用配達方面
     * @param srded The value of the column 'SRDED'. (NullAllowed)
     */
    public void setSrded(String srded) {
        __modifiedProperties.add("srded");
        this._srded = srded;
    }

    /**
     * [get] SRPSTNID: {varchar(30)} <br>
     * CAP用ピストン区分
     * @return The value of the column 'SRPSTNID'. (NullAllowed)
     */
    public String getSrpstnid() {
        return _srpstnid;
    }

    /**
     * [set] SRPSTNID: {varchar(30)} <br>
     * CAP用ピストン区分
     * @param srpstnid The value of the column 'SRPSTNID'. (NullAllowed)
     */
    public void setSrpstnid(String srpstnid) {
        __modifiedProperties.add("srpstnid");
        this._srpstnid = srpstnid;
    }

    /**
     * [get] SRYMD: {NotNull, varchar(8)} <br>
     * 仕分作業日付
     * @return The value of the column 'SRYMD'. (NullAllowed)
     */
    public String getSrymd() {
        return _srymd;
    }

    /**
     * [set] SRYMD: {NotNull, varchar(8)} <br>
     * 仕分作業日付
     * @param srymd The value of the column 'SRYMD'. (NullAllowed)
     */
    public void setSrymd(String srymd) {
        __modifiedProperties.add("srymd");
        this._srymd = srymd;
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
     * [get] SRLINCD: {varchar(30)} <br>
     * 仕分ラインCD
     * @return The value of the column 'SRLINCD'. (NullAllowed)
     */
    public String getSrlincd() {
        return _srlincd;
    }

    /**
     * [set] SRLINCD: {varchar(30)} <br>
     * 仕分ラインCD
     * @param srlincd The value of the column 'SRLINCD'. (NullAllowed)
     */
    public void setSrlincd(String srlincd) {
        __modifiedProperties.add("srlincd");
        this._srlincd = srlincd;
    }

    /**
     * [get] SRRNK: {bigint(19)} <br>
     * 仕分順
     * @return The value of the column 'SRRNK'. (NullAllowed)
     */
    public Long getSrrnk() {
        return _srrnk;
    }

    /**
     * [set] SRRNK: {bigint(19)} <br>
     * 仕分順
     * @param srrnk The value of the column 'SRRNK'. (NullAllowed)
     */
    public void setSrrnk(Long srrnk) {
        __modifiedProperties.add("srrnk");
        this._srrnk = srrnk;
    }

    /**
     * [get] DLVSNM: {bigint(19)} <br>
     * 配達通番
     * @return The value of the column 'DLVSNM'. (NullAllowed)
     */
    public Long getDlvsnm() {
        return _dlvsnm;
    }

    /**
     * [set] DLVSNM: {bigint(19)} <br>
     * 配達通番
     * @param dlvsnm The value of the column 'DLVSNM'. (NullAllowed)
     */
    public void setDlvsnm(Long dlvsnm) {
        __modifiedProperties.add("dlvsnm");
        this._dlvsnm = dlvsnm;
    }

    /**
     * [get] DLVDTLSNM: {decimal(16, 6)} <br>
     * 配達通番枝番
     * @return The value of the column 'DLVDTLSNM'. (NullAllowed)
     */
    public java.math.BigDecimal getDlvdtlsnm() {
        return _dlvdtlsnm;
    }

    /**
     * [set] DLVDTLSNM: {decimal(16, 6)} <br>
     * 配達通番枝番
     * @param dlvdtlsnm The value of the column 'DLVDTLSNM'. (NullAllowed)
     */
    public void setDlvdtlsnm(java.math.BigDecimal dlvdtlsnm) {
        __modifiedProperties.add("dlvdtlsnm");
        this._dlvdtlsnm = dlvdtlsnm;
    }

    /**
     * [get] SSCD: {NotNull, varchar(30)} <br>
     * お得意様CD
     * @return The value of the column 'SSCD'. (NullAllowed)
     */
    public String getSscd() {
        return _sscd;
    }

    /**
     * [set] SSCD: {NotNull, varchar(30)} <br>
     * お得意様CD
     * @param sscd The value of the column 'SSCD'. (NullAllowed)
     */
    public void setSscd(String sscd) {
        __modifiedProperties.add("sscd");
        this._sscd = sscd;
    }

    /**
     * [get] SSNM: {varchar(60)} <br>
     * お得意様名
     * @return The value of the column 'SSNM'. (NullAllowed)
     */
    public String getSsnm() {
        return _ssnm;
    }

    /**
     * [set] SSNM: {varchar(60)} <br>
     * お得意様名
     * @param ssnm The value of the column 'SSNM'. (NullAllowed)
     */
    public void setSsnm(String ssnm) {
        __modifiedProperties.add("ssnm");
        this._ssnm = ssnm;
    }

    /**
     * [get] HDVID: {char(1)} <br>
     * 宅配区分
     * @return The value of the column 'HDVID'. (NullAllowed)
     */
    public String getHdvid() {
        return _hdvid;
    }

    /**
     * [set] HDVID: {char(1)} <br>
     * 宅配区分
     * @param hdvid The value of the column 'HDVID'. (NullAllowed)
     */
    public void setHdvid(String hdvid) {
        __modifiedProperties.add("hdvid");
        this._hdvid = hdvid;
    }

    /**
     * [get] DTLSNM: {varchar(30)} <br>
     * 明細シーケンス
     * @return The value of the column 'DTLSNM'. (NullAllowed)
     */
    public String getDtlsnm() {
        return _dtlsnm;
    }

    /**
     * [set] DTLSNM: {varchar(30)} <br>
     * 明細シーケンス
     * @param dtlsnm The value of the column 'DTLSNM'. (NullAllowed)
     */
    public void setDtlsnm(String dtlsnm) {
        __modifiedProperties.add("dtlsnm");
        this._dtlsnm = dtlsnm;
    }

    /**
     * [get] ZZMATNR: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'ZZMATNR'. (NullAllowed)
     */
    public String getZzmatnr() {
        return _zzmatnr;
    }

    /**
     * [set] ZZMATNR: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param zzmatnr The value of the column 'ZZMATNR'. (NullAllowed)
     */
    public void setZzmatnr(String zzmatnr) {
        __modifiedProperties.add("zzmatnr");
        this._zzmatnr = zzmatnr;
    }

    /**
     * [get] SLQACB: {bigint(19)} <br>
     * 販売数量、ダンボール数
     * @return The value of the column 'SLQACB'. (NullAllowed)
     */
    public Long getSlqacb() {
        return _slqacb;
    }

    /**
     * [set] SLQACB: {bigint(19)} <br>
     * 販売数量、ダンボール数
     * @param slqacb The value of the column 'SLQACB'. (NullAllowed)
     */
    public void setSlqacb(Long slqacb) {
        __modifiedProperties.add("slqacb");
        this._slqacb = slqacb;
    }

    /**
     * [get] SLQACT: {bigint(19)} <br>
     * 販売数量、カートン数
     * @return The value of the column 'SLQACT'. (NullAllowed)
     */
    public Long getSlqact() {
        return _slqact;
    }

    /**
     * [set] SLQACT: {bigint(19)} <br>
     * 販売数量、カートン数
     * @param slqact The value of the column 'SLQACT'. (NullAllowed)
     */
    public void setSlqact(Long slqact) {
        __modifiedProperties.add("slqact");
        this._slqact = slqact;
    }

    /**
     * [get] SLQANUM: {bigint(19)} <br>
     * 販売数量、個数
     * @return The value of the column 'SLQANUM'. (NullAllowed)
     */
    public Long getSlqanum() {
        return _slqanum;
    }

    /**
     * [set] SLQANUM: {bigint(19)} <br>
     * 販売数量、個数
     * @param slqanum The value of the column 'SLQANUM'. (NullAllowed)
     */
    public void setSlqanum(Long slqanum) {
        __modifiedProperties.add("slqanum");
        this._slqanum = slqanum;
    }

    /**
     * [get] LINBLK: {varchar(30)} <br>
     * ライン／ブロック
     * @return The value of the column 'LINBLK'. (NullAllowed)
     */
    public String getLinblk() {
        return _linblk;
    }

    /**
     * [set] LINBLK: {varchar(30)} <br>
     * ライン／ブロック
     * @param linblk The value of the column 'LINBLK'. (NullAllowed)
     */
    public void setLinblk(String linblk) {
        __modifiedProperties.add("linblk");
        this._linblk = linblk;
    }

    /**
     * [get] LOCNO: {varchar(30)} <br>
     * ロケーションＮｏ.
     * @return The value of the column 'LOCNO'. (NullAllowed)
     */
    public String getLocno() {
        return _locno;
    }

    /**
     * [set] LOCNO: {varchar(30)} <br>
     * ロケーションＮｏ.
     * @param locno The value of the column 'LOCNO'. (NullAllowed)
     */
    public void setLocno(String locno) {
        __modifiedProperties.add("locno");
        this._locno = locno;
    }

    /**
     * [get] LOCID: {char(1)} <br>
     * ロケーション区分
     * @return The value of the column 'LOCID'. (NullAllowed)
     */
    public String getLocid() {
        return _locid;
    }

    /**
     * [set] LOCID: {char(1)} <br>
     * ロケーション区分
     * @param locid The value of the column 'LOCID'. (NullAllowed)
     */
    public void setLocid(String locid) {
        __modifiedProperties.add("locid");
        this._locid = locid;
    }

    /**
     * [get] DLVPRTRNK: {bigint(19)} <br>
     * 配達通番印刷順
     * @return The value of the column 'DLVPRTRNK'. (NullAllowed)
     */
    public Long getDlvprtrnk() {
        return _dlvprtrnk;
    }

    /**
     * [set] DLVPRTRNK: {bigint(19)} <br>
     * 配達通番印刷順
     * @param dlvprtrnk The value of the column 'DLVPRTRNK'. (NullAllowed)
     */
    public void setDlvprtrnk(Long dlvprtrnk) {
        __modifiedProperties.add("dlvprtrnk");
        this._dlvprtrnk = dlvprtrnk;
    }

    /**
     * [get] SRDLVYMD: {varchar(8)} <br>
     * 仕分用配達年月日
     * @return The value of the column 'SRDLVYMD'. (NullAllowed)
     */
    public String getSrdlvymd() {
        return _srdlvymd;
    }

    /**
     * [set] SRDLVYMD: {varchar(8)} <br>
     * 仕分用配達年月日
     * @param srdlvymd The value of the column 'SRDLVYMD'. (NullAllowed)
     */
    public void setSrdlvymd(String srdlvymd) {
        __modifiedProperties.add("srdlvymd");
        this._srdlvymd = srdlvymd;
    }

    /**
     * [get] SRHPYNID: {char(1)} <br>
     * 仕分用国内の有無区分
     * @return The value of the column 'SRHPYNID'. (NullAllowed)
     */
    public String getSrhpynid() {
        return _srhpynid;
    }

    /**
     * [set] SRHPYNID: {char(1)} <br>
     * 仕分用国内の有無区分
     * @param srhpynid The value of the column 'SRHPYNID'. (NullAllowed)
     */
    public void setSrhpynid(String srhpynid) {
        __modifiedProperties.add("srhpynid");
        this._srhpynid = srhpynid;
    }

    /**
     * [get] SRIPYNID: {char(1)} <br>
     * 仕分用輸入の有無区分
     * @return The value of the column 'SRIPYNID'. (NullAllowed)
     */
    public String getSripynid() {
        return _sripynid;
    }

    /**
     * [set] SRIPYNID: {char(1)} <br>
     * 仕分用輸入の有無区分
     * @param sripynid The value of the column 'SRIPYNID'. (NullAllowed)
     */
    public void setSripynid(String sripynid) {
        __modifiedProperties.add("sripynid");
        this._sripynid = sripynid;
    }

    /**
     * [get] SRSRLINCD: {varchar(30)} <br>
     * 仕分用仕分ラインCD
     * @return The value of the column 'SRSRLINCD'. (NullAllowed)
     */
    public String getSrsrlincd() {
        return _srsrlincd;
    }

    /**
     * [set] SRSRLINCD: {varchar(30)} <br>
     * 仕分用仕分ラインCD
     * @param srsrlincd The value of the column 'SRSRLINCD'. (NullAllowed)
     */
    public void setSrsrlincd(String srsrlincd) {
        __modifiedProperties.add("srsrlincd");
        this._srsrlincd = srsrlincd;
    }

    /**
     * [get] SRSRRNK: {bigint(19)} <br>
     * 仕分用仕分順
     * @return The value of the column 'SRSRRNK'. (NullAllowed)
     */
    public Long getSrsrrnk() {
        return _srsrrnk;
    }

    /**
     * [set] SRSRRNK: {bigint(19)} <br>
     * 仕分用仕分順
     * @param srsrrnk The value of the column 'SRSRRNK'. (NullAllowed)
     */
    public void setSrsrrnk(Long srsrrnk) {
        __modifiedProperties.add("srsrrnk");
        this._srsrrnk = srsrrnk;
    }

    /**
     * [get] SRDLVSNM: {bigint(19)} <br>
     * 仕分用配達通番
     * @return The value of the column 'SRDLVSNM'. (NullAllowed)
     */
    public Long getSrdlvsnm() {
        return _srdlvsnm;
    }

    /**
     * [set] SRDLVSNM: {bigint(19)} <br>
     * 仕分用配達通番
     * @param srdlvsnm The value of the column 'SRDLVSNM'. (NullAllowed)
     */
    public void setSrdlvsnm(Long srdlvsnm) {
        __modifiedProperties.add("srdlvsnm");
        this._srdlvsnm = srdlvsnm;
    }

    /**
     * [get] SRDLVDTLSNM: {bigint(19)} <br>
     * 仕分用配達通番枝番
     * @return The value of the column 'SRDLVDTLSNM'. (NullAllowed)
     */
    public Long getSrdlvdtlsnm() {
        return _srdlvdtlsnm;
    }

    /**
     * [set] SRDLVDTLSNM: {bigint(19)} <br>
     * 仕分用配達通番枝番
     * @param srdlvdtlsnm The value of the column 'SRDLVDTLSNM'. (NullAllowed)
     */
    public void setSrdlvdtlsnm(Long srdlvdtlsnm) {
        __modifiedProperties.add("srdlvdtlsnm");
        this._srdlvdtlsnm = srdlvdtlsnm;
    }

    /**
     * [get] SRDLVPRTRNK: {bigint(19)} <br>
     * 仕分用配達通番印刷順
     * @return The value of the column 'SRDLVPRTRNK'. (NullAllowed)
     */
    public Long getSrdlvprtrnk() {
        return _srdlvprtrnk;
    }

    /**
     * [set] SRDLVPRTRNK: {bigint(19)} <br>
     * 仕分用配達通番印刷順
     * @param srdlvprtrnk The value of the column 'SRDLVPRTRNK'. (NullAllowed)
     */
    public void setSrdlvprtrnk(Long srdlvprtrnk) {
        __modifiedProperties.add("srdlvprtrnk");
        this._srdlvprtrnk = srdlvprtrnk;
    }

    /**
     * [get] BRTYP: {varchar(30)} <br>
     * 銘柄タイプ
     * @return The value of the column 'BRTYP'. (NullAllowed)
     */
    public String getBrtyp() {
        return _brtyp;
    }

    /**
     * [set] BRTYP: {varchar(30)} <br>
     * 銘柄タイプ
     * @param brtyp The value of the column 'BRTYP'. (NullAllowed)
     */
    public void setBrtyp(String brtyp) {
        __modifiedProperties.add("brtyp");
        this._brtyp = brtyp;
    }

    /**
     * [get] BOXNO: {NotNull, varchar(30)} <br>
     * 箱Ｎｏ．
     * @return The value of the column 'BOXNO'. (NullAllowed)
     */
    public String getBoxno() {
        return _boxno;
    }

    /**
     * [set] BOXNO: {NotNull, varchar(30)} <br>
     * 箱Ｎｏ．
     * @param boxno The value of the column 'BOXNO'. (NullAllowed)
     */
    public void setBoxno(String boxno) {
        __modifiedProperties.add("boxno");
        this._boxno = boxno;
    }

    /**
     * [get] BOXNOCNSNM: {varchar(30)} <br>
     * 箱Ｎｏ．（通番）
     * @return The value of the column 'BOXNOCNSNM'. (NullAllowed)
     */
    public String getBoxnocnsnm() {
        return _boxnocnsnm;
    }

    /**
     * [set] BOXNOCNSNM: {varchar(30)} <br>
     * 箱Ｎｏ．（通番）
     * @param boxnocnsnm The value of the column 'BOXNOCNSNM'. (NullAllowed)
     */
    public void setBoxnocnsnm(String boxnocnsnm) {
        __modifiedProperties.add("boxnocnsnm");
        this._boxnocnsnm = boxnocnsnm;
    }

    /**
     * [get] BOXTYP: {varchar(30)} <br>
     * 箱タイプ
     * @return The value of the column 'BOXTYP'. (NullAllowed)
     */
    public String getBoxtyp() {
        return _boxtyp;
    }

    /**
     * [set] BOXTYP: {varchar(30)} <br>
     * 箱タイプ
     * @param boxtyp The value of the column 'BOXTYP'. (NullAllowed)
     */
    public void setBoxtyp(String boxtyp) {
        __modifiedProperties.add("boxtyp");
        this._boxtyp = boxtyp;
    }

    /**
     * [get] MGBOXDID: {char(1)} <br>
     * マージ箱表示区分
     * @return The value of the column 'MGBOXDID'. (NullAllowed)
     */
    public String getMgboxdid() {
        return _mgboxdid;
    }

    /**
     * [set] MGBOXDID: {char(1)} <br>
     * マージ箱表示区分
     * @param mgboxdid The value of the column 'MGBOXDID'. (NullAllowed)
     */
    public void setMgboxdid(String mgboxdid) {
        __modifiedProperties.add("mgboxdid");
        this._mgboxdid = mgboxdid;
    }

    /**
     * [get] DMDID: {char(1)} <br>
     * ＤＭ表示区分
     * @return The value of the column 'DMDID'. (NullAllowed)
     */
    public String getDmdid() {
        return _dmdid;
    }

    /**
     * [set] DMDID: {char(1)} <br>
     * ＤＭ表示区分
     * @param dmdid The value of the column 'DMDID'. (NullAllowed)
     */
    public void setDmdid(String dmdid) {
        __modifiedProperties.add("dmdid");
        this._dmdid = dmdid;
    }

    /**
     * [get] TTBOXQA: {bigint(19)} <br>
     * トータル箱数
     * @return The value of the column 'TTBOXQA'. (NullAllowed)
     */
    public Long getTtboxqa() {
        return _ttboxqa;
    }

    /**
     * [set] TTBOXQA: {bigint(19)} <br>
     * トータル箱数
     * @param ttboxqa The value of the column 'TTBOXQA'. (NullAllowed)
     */
    public void setTtboxqa(Long ttboxqa) {
        __modifiedProperties.add("ttboxqa");
        this._ttboxqa = ttboxqa;
    }

    /**
     * [get] BOXCTQATA: {bigint(19)} <br>
     * 箱内カートン数（総数）
     * @return The value of the column 'BOXCTQATA'. (NullAllowed)
     */
    public Long getBoxctqata() {
        return _boxctqata;
    }

    /**
     * [set] BOXCTQATA: {bigint(19)} <br>
     * 箱内カートン数（総数）
     * @param boxctqata The value of the column 'BOXCTQATA'. (NullAllowed)
     */
    public void setBoxctqata(Long boxctqata) {
        __modifiedProperties.add("boxctqata");
        this._boxctqata = boxctqata;
    }

    /**
     * [get] BOXCTQAAPSRPLC: {bigint(19)} <br>
     * 箱内カートン数（該当仕分場分）
     * @return The value of the column 'BOXCTQAAPSRPLC'. (NullAllowed)
     */
    public Long getBoxctqaapsrplc() {
        return _boxctqaapsrplc;
    }

    /**
     * [set] BOXCTQAAPSRPLC: {bigint(19)} <br>
     * 箱内カートン数（該当仕分場分）
     * @param boxctqaapsrplc The value of the column 'BOXCTQAAPSRPLC'. (NullAllowed)
     */
    public void setBoxctqaapsrplc(Long boxctqaapsrplc) {
        __modifiedProperties.add("boxctqaapsrplc");
        this._boxctqaapsrplc = boxctqaapsrplc;
    }

    /**
     * [get] TTSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @return The value of the column 'TTSROPRTCNT'. (NullAllowed)
     */
    public Long getTtsroprtcnt() {
        return _ttsroprtcnt;
    }

    /**
     * [set] TTSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @param ttsroprtcnt The value of the column 'TTSROPRTCNT'. (NullAllowed)
     */
    public void setTtsroprtcnt(Long ttsroprtcnt) {
        __modifiedProperties.add("ttsroprtcnt");
        this._ttsroprtcnt = ttsroprtcnt;
    }

    /**
     * [get] BXMTRID: {char(1)} <br>
     * 箱跨り区分
     * @return The value of the column 'BXMTRID'. (NullAllowed)
     */
    public String getBxmtrid() {
        return _bxmtrid;
    }

    /**
     * [set] BXMTRID: {char(1)} <br>
     * 箱跨り区分
     * @param bxmtrid The value of the column 'BXMTRID'. (NullAllowed)
     */
    public void setBxmtrid(String bxmtrid) {
        __modifiedProperties.add("bxmtrid");
        this._bxmtrid = bxmtrid;
    }

    /**
     * [get] SPPLYMD: {varchar(8)} <br>
     * 出庫予定年月日
     * @return The value of the column 'SPPLYMD'. (NullAllowed)
     */
    public String getSpplymd() {
        return _spplymd;
    }

    /**
     * [set] SPPLYMD: {varchar(8)} <br>
     * 出庫予定年月日
     * @param spplymd The value of the column 'SPPLYMD'. (NullAllowed)
     */
    public void setSpplymd(String spplymd) {
        __modifiedProperties.add("spplymd");
        this._spplymd = spplymd;
    }

    /**
     * [get] SLPTYP: {NotNull, varchar(30)} <br>
     * 伝票タイプ
     * @return The value of the column 'SLPTYP'. (NullAllowed)
     */
    public String getSlptyp() {
        return _slptyp;
    }

    /**
     * [set] SLPTYP: {NotNull, varchar(30)} <br>
     * 伝票タイプ
     * @param slptyp The value of the column 'SLPTYP'. (NullAllowed)
     */
    public void setSlptyp(String slptyp) {
        __modifiedProperties.add("slptyp");
        this._slptyp = slptyp;
    }

    /**
     * [get] SEQNO: {bigint(19)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQNO'. (NullAllowed)
     */
    public Long getSeqno() {
        return _seqno;
    }

    /**
     * [set] SEQNO: {bigint(19)} <br>
     * シーケンス番号
     * @param seqno The value of the column 'SEQNO'. (NullAllowed)
     */
    public void setSeqno(Long seqno) {
        __modifiedProperties.add("seqno");
        this._seqno = seqno;
    }

    /**
     * [get] OTORGCD: {varchar(30)} <br>
     * 出力先組織CD
     * @return The value of the column 'OTORGCD'. (NullAllowed)
     */
    public String getOtorgcd() {
        return _otorgcd;
    }

    /**
     * [set] OTORGCD: {varchar(30)} <br>
     * 出力先組織CD
     * @param otorgcd The value of the column 'OTORGCD'. (NullAllowed)
     */
    public void setOtorgcd(String otorgcd) {
        __modifiedProperties.add("otorgcd");
        this._otorgcd = otorgcd;
    }

    /**
     * [get] ORDORGCD: {varchar(30)} <br>
     * さしず元組織CD
     * @return The value of the column 'ORDORGCD'. (NullAllowed)
     */
    public String getOrdorgcd() {
        return _ordorgcd;
    }

    /**
     * [set] ORDORGCD: {varchar(30)} <br>
     * さしず元組織CD
     * @param ordorgcd The value of the column 'ORDORGCD'. (NullAllowed)
     */
    public void setOrdorgcd(String ordorgcd) {
        __modifiedProperties.add("ordorgcd");
        this._ordorgcd = ordorgcd;
    }

    /**
     * [get] RLYBSCD: {varchar(30)} <br>
     * 中継拠点CD
     * @return The value of the column 'RLYBSCD'. (NullAllowed)
     */
    public String getRlybscd() {
        return _rlybscd;
    }

    /**
     * [set] RLYBSCD: {varchar(30)} <br>
     * 中継拠点CD
     * @param rlybscd The value of the column 'RLYBSCD'. (NullAllowed)
     */
    public void setRlybscd(String rlybscd) {
        __modifiedProperties.add("rlybscd");
        this._rlybscd = rlybscd;
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
     * [get] LMPDLVNO: {varchar(30)} <br>
     * 一括配達番号
     * @return The value of the column 'LMPDLVNO'. (NullAllowed)
     */
    public String getLmpdlvno() {
        return _lmpdlvno;
    }

    /**
     * [set] LMPDLVNO: {varchar(30)} <br>
     * 一括配達番号
     * @param lmpdlvno The value of the column 'LMPDLVNO'. (NullAllowed)
     */
    public void setLmpdlvno(String lmpdlvno) {
        __modifiedProperties.add("lmpdlvno");
        this._lmpdlvno = lmpdlvno;
    }

    /**
     * [get] DIVMTD: {char(1)} <br>
     * 仕分方式
     * @return The value of the column 'DIVMTD'. (NullAllowed)
     */
    public String getDivmtd() {
        return _divmtd;
    }

    /**
     * [set] DIVMTD: {char(1)} <br>
     * 仕分方式
     * @param divmtd The value of the column 'DIVMTD'. (NullAllowed)
     */
    public void setDivmtd(String divmtd) {
        __modifiedProperties.add("divmtd");
        this._divmtd = divmtd;
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
     * [get] HVRTRSN: {varchar(30)} <br>
     * 持戻理由
     * @return The value of the column 'HVRTRSN'. (NullAllowed)
     */
    public String getHvrtrsn() {
        return _hvrtrsn;
    }

    /**
     * [set] HVRTRSN: {varchar(30)} <br>
     * 持戻理由
     * @param hvrtrsn The value of the column 'HVRTRSN'. (NullAllowed)
     */
    public void setHvrtrsn(String hvrtrsn) {
        __modifiedProperties.add("hvrtrsn");
        this._hvrtrsn = hvrtrsn;
    }

    /**
     * [get] HVRTINOTYMD: {varchar(30)} <br>
     * 持戻入出庫予定日
     * @return The value of the column 'HVRTINOTYMD'. (NullAllowed)
     */
    public String getHvrtinotymd() {
        return _hvrtinotymd;
    }

    /**
     * [set] HVRTINOTYMD: {varchar(30)} <br>
     * 持戻入出庫予定日
     * @param hvrtinotymd The value of the column 'HVRTINOTYMD'. (NullAllowed)
     */
    public void setHvrtinotymd(String hvrtinotymd) {
        __modifiedProperties.add("hvrtinotymd");
        this._hvrtinotymd = hvrtinotymd;
    }

    /**
     * [get] CNGPRTSLPNO: {varchar(30)} <br>
     * 取替相手伝票番号
     * @return The value of the column 'CNGPRTSLPNO'. (NullAllowed)
     */
    public String getCngprtslpno() {
        return _cngprtslpno;
    }

    /**
     * [set] CNGPRTSLPNO: {varchar(30)} <br>
     * 取替相手伝票番号
     * @param cngprtslpno The value of the column 'CNGPRTSLPNO'. (NullAllowed)
     */
    public void setCngprtslpno(String cngprtslpno) {
        __modifiedProperties.add("cngprtslpno");
        this._cngprtslpno = cngprtslpno;
    }

    /**
     * [get] TRNSCTNDIV: {char(1)} <br>
     * 処理区分
     * @return The value of the column 'TRNSCTNDIV'. (NullAllowed)
     */
    public String getTrnsctndiv() {
        return _trnsctndiv;
    }

    /**
     * [set] TRNSCTNDIV: {char(1)} <br>
     * 処理区分
     * @param trnsctndiv The value of the column 'TRNSCTNDIV'. (NullAllowed)
     */
    public void setTrnsctndiv(String trnsctndiv) {
        __modifiedProperties.add("trnsctndiv");
        this._trnsctndiv = trnsctndiv;
    }

    /**
     * [get] EOSORDAFTFLG: {char(1)} <br>
     * ＥＯＳさしず後フラグ
     * @return The value of the column 'EOSORDAFTFLG'. (NullAllowed)
     */
    public String getEosordaftflg() {
        return _eosordaftflg;
    }

    /**
     * [set] EOSORDAFTFLG: {char(1)} <br>
     * ＥＯＳさしず後フラグ
     * @param eosordaftflg The value of the column 'EOSORDAFTFLG'. (NullAllowed)
     */
    public void setEosordaftflg(String eosordaftflg) {
        __modifiedProperties.add("eosordaftflg");
        this._eosordaftflg = eosordaftflg;
    }

    /**
     * [get] EOSSLPNO: {varchar(30)} <br>
     * 相手（ＥＯＳ）伝票番号
     * @return The value of the column 'EOSSLPNO'. (NullAllowed)
     */
    public String getEosslpno() {
        return _eosslpno;
    }

    /**
     * [set] EOSSLPNO: {varchar(30)} <br>
     * 相手（ＥＯＳ）伝票番号
     * @param eosslpno The value of the column 'EOSSLPNO'. (NullAllowed)
     */
    public void setEosslpno(String eosslpno) {
        __modifiedProperties.add("eosslpno");
        this._eosslpno = eosslpno;
    }

    /**
     * [get] HDRDBXDIV: {char(1)} <br>
     * 100箱拒否区分
     * @return The value of the column 'HDRDBXDIV'. (NullAllowed)
     */
    public String getHdrdbxdiv() {
        return _hdrdbxdiv;
    }

    /**
     * [set] HDRDBXDIV: {char(1)} <br>
     * 100箱拒否区分
     * @param hdrdbxdiv The value of the column 'HDRDBXDIV'. (NullAllowed)
     */
    public void setHdrdbxdiv(String hdrdbxdiv) {
        __modifiedProperties.add("hdrdbxdiv");
        this._hdrdbxdiv = hdrdbxdiv;
    }

    /**
     * [get] INOTRFSLDIV: {char(1)} <br>
     * 内外仕分拒否区分
     * @return The value of the column 'INOTRFSLDIV'. (NullAllowed)
     */
    public String getInotrfsldiv() {
        return _inotrfsldiv;
    }

    /**
     * [set] INOTRFSLDIV: {char(1)} <br>
     * 内外仕分拒否区分
     * @param inotrfsldiv The value of the column 'INOTRFSLDIV'. (NullAllowed)
     */
    public void setInotrfsldiv(String inotrfsldiv) {
        __modifiedProperties.add("inotrfsldiv");
        this._inotrfsldiv = inotrfsldiv;
    }

    /**
     * [get] BXMNTRFSLDIV: {char(1)} <br>
     * 箱跨り拒否区分
     * @return The value of the column 'BXMNTRFSLDIV'. (NullAllowed)
     */
    public String getBxmntrfsldiv() {
        return _bxmntrfsldiv;
    }

    /**
     * [set] BXMNTRFSLDIV: {char(1)} <br>
     * 箱跨り拒否区分
     * @param bxmntrfsldiv The value of the column 'BXMNTRFSLDIV'. (NullAllowed)
     */
    public void setBxmntrfsldiv(String bxmntrfsldiv) {
        __modifiedProperties.add("bxmntrfsldiv");
        this._bxmntrfsldiv = bxmntrfsldiv;
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
     * [get] SLPOTYMD: {varchar(8)} <br>
     * 帳票出力年月日
     * @return The value of the column 'SLPOTYMD'. (NullAllowed)
     */
    public String getSlpotymd() {
        return _slpotymd;
    }

    /**
     * [set] SLPOTYMD: {varchar(8)} <br>
     * 帳票出力年月日
     * @param slpotymd The value of the column 'SLPOTYMD'. (NullAllowed)
     */
    public void setSlpotymd(String slpotymd) {
        __modifiedProperties.add("slpotymd");
        this._slpotymd = slpotymd;
    }

    /**
     * [get] CMPCD: {varchar(30)} <br>
     * 会社CD
     * @return The value of the column 'CMPCD'. (NullAllowed)
     */
    public String getCmpcd() {
        return _cmpcd;
    }

    /**
     * [set] CMPCD: {varchar(30)} <br>
     * 会社CD
     * @param cmpcd The value of the column 'CMPCD'. (NullAllowed)
     */
    public void setCmpcd(String cmpcd) {
        __modifiedProperties.add("cmpcd");
        this._cmpcd = cmpcd;
    }

    /**
     * [get] STSCD: {varchar(30)} <br>
     * 状態CD
     * @return The value of the column 'STSCD'. (NullAllowed)
     */
    public String getStscd() {
        return _stscd;
    }

    /**
     * [set] STSCD: {varchar(30)} <br>
     * 状態CD
     * @param stscd The value of the column 'STSCD'. (NullAllowed)
     */
    public void setStscd(String stscd) {
        __modifiedProperties.add("stscd");
        this._stscd = stscd;
    }

    /**
     * [get] STGVAL: {bigint(19)} <br>
     * 不足本数
     * @return The value of the column 'STGVAL'. (NullAllowed)
     */
    public Long getStgval() {
        return _stgval;
    }

    /**
     * [set] STGVAL: {bigint(19)} <br>
     * 不足本数
     * @param stgval The value of the column 'STGVAL'. (NullAllowed)
     */
    public void setStgval(Long stgval) {
        __modifiedProperties.add("stgval");
        this._stgval = stgval;
    }

    /**
     * [get] SLPNO: {NotNull, varchar(30)} <br>
     * 伝票番号
     * @return The value of the column 'SLPNO'. (NullAllowed)
     */
    public String getSlpno() {
        return _slpno;
    }

    /**
     * [set] SLPNO: {NotNull, varchar(30)} <br>
     * 伝票番号
     * @param slpno The value of the column 'SLPNO'. (NullAllowed)
     */
    public void setSlpno(String slpno) {
        __modifiedProperties.add("slpno");
        this._slpno = slpno;
    }

    /**
     * [get] TTTOPDEDRNK: {bigint(19)} <br>
     * 今回先頭方面仕分順
     * @return The value of the column 'TTTOPDEDRNK'. (NullAllowed)
     */
    public Long getTttopdedrnk() {
        return _tttopdedrnk;
    }

    /**
     * [set] TTTOPDEDRNK: {bigint(19)} <br>
     * 今回先頭方面仕分順
     * @param tttopdedrnk The value of the column 'TTTOPDEDRNK'. (NullAllowed)
     */
    public void setTttopdedrnk(Long tttopdedrnk) {
        __modifiedProperties.add("tttopdedrnk");
        this._tttopdedrnk = tttopdedrnk;
    }

    /**
     * [get] CORDRCVCNT: {bigint(19)} <br>
     * さしず受信回数
     * @return The value of the column 'CORDRCVCNT'. (NullAllowed)
     */
    public Long getCordrcvcnt() {
        return _cordrcvcnt;
    }

    /**
     * [set] CORDRCVCNT: {bigint(19)} <br>
     * さしず受信回数
     * @param cordrcvcnt The value of the column 'CORDRCVCNT'. (NullAllowed)
     */
    public void setCordrcvcnt(Long cordrcvcnt) {
        __modifiedProperties.add("cordrcvcnt");
        this._cordrcvcnt = cordrcvcnt;
    }

    /**
     * [get] ORDDVFG: {char(1)} <br>
     * オーダ分割フラグ
     * @return The value of the column 'ORDDVFG'. (NullAllowed)
     */
    public String getOrddvfg() {
        return _orddvfg;
    }

    /**
     * [set] ORDDVFG: {char(1)} <br>
     * オーダ分割フラグ
     * @param orddvfg The value of the column 'ORDDVFG'. (NullAllowed)
     */
    public void setOrddvfg(String orddvfg) {
        __modifiedProperties.add("orddvfg");
        this._orddvfg = orddvfg;
    }

    /**
     * [get] LBCBQA: {bigint(19), default=[0]} <br>
     * 個口数
     * @return The value of the column 'LBCBQA'. (NullAllowed)
     */
    public Long getLbcbqa() {
        return _lbcbqa;
    }

    /**
     * [set] LBCBQA: {bigint(19), default=[0]} <br>
     * 個口数
     * @param lbcbqa The value of the column 'LBCBQA'. (NullAllowed)
     */
    public void setLbcbqa(Long lbcbqa) {
        __modifiedProperties.add("lbcbqa");
        this._lbcbqa = lbcbqa;
    }

    /**
     * [get] DRCLSTLBCBID: {char(1)} <br>
     * 方面最終個口区分
     * @return The value of the column 'DRCLSTLBCBID'. (NullAllowed)
     */
    public String getDrclstlbcbid() {
        return _drclstlbcbid;
    }

    /**
     * [set] DRCLSTLBCBID: {char(1)} <br>
     * 方面最終個口区分
     * @param drclstlbcbid The value of the column 'DRCLSTLBCBID'. (NullAllowed)
     */
    public void setDrclstlbcbid(String drclstlbcbid) {
        __modifiedProperties.add("drclstlbcbid");
        this._drclstlbcbid = drclstlbcbid;
    }

    /**
     * [get] LBBOXNO: {bigint(19), default=[(0)]} <br>
     * ライン／ブロック箱Ｎｏ
     * @return The value of the column 'LBBOXNO'. (NullAllowed)
     */
    public Long getLbboxno() {
        return _lbboxno;
    }

    /**
     * [set] LBBOXNO: {bigint(19), default=[(0)]} <br>
     * ライン／ブロック箱Ｎｏ
     * @param lbboxno The value of the column 'LBBOXNO'. (NullAllowed)
     */
    public void setLbboxno(Long lbboxno) {
        __modifiedProperties.add("lbboxno");
        this._lbboxno = lbboxno;
    }

    /**
     * [get] LBTTBOXQA: {bigint(19), default=[(0)]} <br>
     * ライン／ブロックトータル箱数
     * @return The value of the column 'LBTTBOXQA'. (NullAllowed)
     */
    public Long getLbttboxqa() {
        return _lbttboxqa;
    }

    /**
     * [set] LBTTBOXQA: {bigint(19), default=[(0)]} <br>
     * ライン／ブロックトータル箱数
     * @param lbttboxqa The value of the column 'LBTTBOXQA'. (NullAllowed)
     */
    public void setLbttboxqa(Long lbttboxqa) {
        __modifiedProperties.add("lbttboxqa");
        this._lbttboxqa = lbttboxqa;
    }

    /**
     * [get] IKEIINCLDFLG: {char(1), default=[0]} <br>
     * 異型品同梱フラグ
     * @return The value of the column 'IKEIINCLDFLG'. (NullAllowed)
     */
    public String getIkeiincldflg() {
        return _ikeiincldflg;
    }

    /**
     * [set] IKEIINCLDFLG: {char(1), default=[0]} <br>
     * 異型品同梱フラグ
     * @param ikeiincldflg The value of the column 'IKEIINCLDFLG'. (NullAllowed)
     */
    public void setIkeiincldflg(String ikeiincldflg) {
        __modifiedProperties.add("ikeiincldflg");
        this._ikeiincldflg = ikeiincldflg;
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
