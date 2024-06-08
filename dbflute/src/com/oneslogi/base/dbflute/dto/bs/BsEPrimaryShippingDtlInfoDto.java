package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_PRIMARY_SHIPPING_DTL_INFO as TABLE. <br>
 * 一次輸送詳細情報受信テーブル
 * <pre>
 * [primary-key]
 *     PRIMARY_SHIPPING_DTL_INFO_ID
 *
 * [column]
 *     PRIMARY_SHIPPING_DTL_INFO_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, ZZBUKRS, ZZSNDYMD, RCDID, ZZREFENO, BNWHCD, HDRID, DTLNO, SPNDDA, PDLGTM, ZZSENDNO, PRCSORG, EKGRP, SPCD, SPSKPLCD, RCCD, RCSKPLCD, ZZRCVYMD, ZZSHTYPE, AGCD, ZZCBXQTY, ZZPLTQTY, ZZTPLQTY, ZZSHPCLS, ZZREFE01, ZZREFE02, ZZREFE03, ZZREFE04, ZZREFE05, ZZREFE06, ZZREFE07, ZZREFE08, ZZREFE09, ZZREFE10, DTLQA, ZZREFENO2, OPRTNO, BLOCKNM, ZZMATNR, LOTNO, QUANTY, GRPCSD, SFPOQA, DSSKPLCD, MFINF, SFTHDES, CNFATCL, LASTGR, SFLASTDES, SHNO, PLTNO, TRADELIVNO, BATJMFYM, SFFIL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRIMARY_SHIPPING_DTL_INFO_ID
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
public abstract class BsEPrimaryShippingDtlInfoDto implements Serializable {

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
    /** PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _primaryShippingDtlInfoId;

    /** RECEIVE_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** ZZBUKRS: {varchar(100)} */
    @JsonKey
    protected String _zzbukrs;

    /** ZZSNDYMD: {varchar(100)} */
    @JsonKey
    protected String _zzsndymd;

    /** RCDID: {varchar(100)} */
    @JsonKey
    protected String _rcdid;

    /** ZZREFENO: {varchar(100)} */
    @JsonKey
    protected String _zzrefeno;

    /** BNWHCD: {varchar(100)} */
    @JsonKey
    protected String _bnwhcd;

    /** HDRID: {varchar(100)} */
    @JsonKey
    protected String _hdrid;

    /** DTLNO: {varchar(100)} */
    @JsonKey
    protected String _dtlno;

    /** SPNDDA: {varchar(100)} */
    @JsonKey
    protected String _spndda;

    /** PDLGTM: {varchar(100)} */
    @JsonKey
    protected String _pdlgtm;

    /** ZZSENDNO: {varchar(100)} */
    @JsonKey
    protected String _zzsendno;

    /** PRCSORG: {varchar(100)} */
    @JsonKey
    protected String _prcsorg;

    /** EKGRP: {varchar(100)} */
    @JsonKey
    protected String _ekgrp;

    /** SPCD: {varchar(100)} */
    @JsonKey
    protected String _spcd;

    /** SPSKPLCD: {varchar(100)} */
    @JsonKey
    protected String _spskplcd;

    /** RCCD: {varchar(100)} */
    @JsonKey
    protected String _rccd;

    /** RCSKPLCD: {varchar(100)} */
    @JsonKey
    protected String _rcskplcd;

    /** ZZRCVYMD: {varchar(100)} */
    @JsonKey
    protected String _zzrcvymd;

    /** ZZSHTYPE: {varchar(100)} */
    @JsonKey
    protected String _zzshtype;

    /** AGCD: {varchar(100)} */
    @JsonKey
    protected String _agcd;

    /** ZZCBXQTY: {varchar(100)} */
    @JsonKey
    protected String _zzcbxqty;

    /** ZZPLTQTY: {varchar(100)} */
    @JsonKey
    protected String _zzpltqty;

    /** ZZTPLQTY: {varchar(100)} */
    @JsonKey
    protected String _zztplqty;

    /** ZZSHPCLS: {varchar(100)} */
    @JsonKey
    protected String _zzshpcls;

    /** ZZREFE01: {varchar(100)} */
    @JsonKey
    protected String _zzrefe01;

    /** ZZREFE02: {varchar(100)} */
    @JsonKey
    protected String _zzrefe02;

    /** ZZREFE03: {varchar(100)} */
    @JsonKey
    protected String _zzrefe03;

    /** ZZREFE04: {varchar(100)} */
    @JsonKey
    protected String _zzrefe04;

    /** ZZREFE05: {varchar(100)} */
    @JsonKey
    protected String _zzrefe05;

    /** ZZREFE06: {varchar(100)} */
    @JsonKey
    protected String _zzrefe06;

    /** ZZREFE07: {varchar(100)} */
    @JsonKey
    protected String _zzrefe07;

    /** ZZREFE08: {varchar(100)} */
    @JsonKey
    protected String _zzrefe08;

    /** ZZREFE09: {varchar(100)} */
    @JsonKey
    protected String _zzrefe09;

    /** ZZREFE10: {varchar(100)} */
    @JsonKey
    protected String _zzrefe10;

    /** DTLQA: {varchar(100)} */
    @JsonKey
    protected String _dtlqa;

    /** ZZREFENO2: {varchar(100)} */
    @JsonKey
    protected String _zzrefeno2;

    /** OPRTNO: {varchar(100)} */
    @JsonKey
    protected String _oprtno;

    /** BLOCKNM: {varchar(100)} */
    @JsonKey
    protected String _blocknm;

    /** ZZMATNR: {varchar(100)} */
    @JsonKey
    protected String _zzmatnr;

    /** LOTNO: {varchar(100)} */
    @JsonKey
    protected String _lotno;

    /** QUANTY: {varchar(100)} */
    @JsonKey
    protected String _quanty;

    /** GRPCSD: {varchar(100)} */
    @JsonKey
    protected String _grpcsd;

    /** SFPOQA: {varchar(100)} */
    @JsonKey
    protected String _sfpoqa;

    /** DSSKPLCD: {varchar(100)} */
    @JsonKey
    protected String _dsskplcd;

    /** MFINF: {varchar(100)} */
    @JsonKey
    protected String _mfinf;

    /** SFTHDES: {varchar(100)} */
    @JsonKey
    protected String _sfthdes;

    /** CNFATCL: {varchar(100)} */
    @JsonKey
    protected String _cnfatcl;

    /** LASTGR: {varchar(100)} */
    @JsonKey
    protected String _lastgr;

    /** SFLASTDES: {varchar(100)} */
    @JsonKey
    protected String _sflastdes;

    /** SHNO: {varchar(100)} */
    @JsonKey
    protected String _shno;

    /** PLTNO: {varchar(100)} */
    @JsonKey
    protected String _pltno;

    /** TRADELIVNO: {varchar(100)} */
    @JsonKey
    protected String _tradelivno;

    /** BATJMFYM: {varchar(100)} */
    @JsonKey
    protected String _batjmfym;

    /** SFFIL: {varchar(100)} */
    @JsonKey
    protected String _sffil;

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
    public BsEPrimaryShippingDtlInfoDto() {
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
        if (other == null || !(other instanceof BsEPrimaryShippingDtlInfoDto)) { return false; }
        final BsEPrimaryShippingDtlInfoDto otherEntity = (BsEPrimaryShippingDtlInfoDto)other;
        if (!helpComparingValue(getPrimaryShippingDtlInfoId(), otherEntity.getPrimaryShippingDtlInfoId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_PRIMARY_SHIPPING_DTL_INFO");
        result = xCH(result, getPrimaryShippingDtlInfoId());
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
        sb.append(c).append(getPrimaryShippingDtlInfoId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getZzbukrs());
        sb.append(c).append(getZzsndymd());
        sb.append(c).append(getRcdid());
        sb.append(c).append(getZzrefeno());
        sb.append(c).append(getBnwhcd());
        sb.append(c).append(getHdrid());
        sb.append(c).append(getDtlno());
        sb.append(c).append(getSpndda());
        sb.append(c).append(getPdlgtm());
        sb.append(c).append(getZzsendno());
        sb.append(c).append(getPrcsorg());
        sb.append(c).append(getEkgrp());
        sb.append(c).append(getSpcd());
        sb.append(c).append(getSpskplcd());
        sb.append(c).append(getRccd());
        sb.append(c).append(getRcskplcd());
        sb.append(c).append(getZzrcvymd());
        sb.append(c).append(getZzshtype());
        sb.append(c).append(getAgcd());
        sb.append(c).append(getZzcbxqty());
        sb.append(c).append(getZzpltqty());
        sb.append(c).append(getZztplqty());
        sb.append(c).append(getZzshpcls());
        sb.append(c).append(getZzrefe01());
        sb.append(c).append(getZzrefe02());
        sb.append(c).append(getZzrefe03());
        sb.append(c).append(getZzrefe04());
        sb.append(c).append(getZzrefe05());
        sb.append(c).append(getZzrefe06());
        sb.append(c).append(getZzrefe07());
        sb.append(c).append(getZzrefe08());
        sb.append(c).append(getZzrefe09());
        sb.append(c).append(getZzrefe10());
        sb.append(c).append(getDtlqa());
        sb.append(c).append(getZzrefeno2());
        sb.append(c).append(getOprtno());
        sb.append(c).append(getBlocknm());
        sb.append(c).append(getZzmatnr());
        sb.append(c).append(getLotno());
        sb.append(c).append(getQuanty());
        sb.append(c).append(getGrpcsd());
        sb.append(c).append(getSfpoqa());
        sb.append(c).append(getDsskplcd());
        sb.append(c).append(getMfinf());
        sb.append(c).append(getSfthdes());
        sb.append(c).append(getCnfatcl());
        sb.append(c).append(getLastgr());
        sb.append(c).append(getSflastdes());
        sb.append(c).append(getShno());
        sb.append(c).append(getPltno());
        sb.append(c).append(getTradelivno());
        sb.append(c).append(getBatjmfym());
        sb.append(c).append(getSffil());
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
     * [get] PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 一次輸送詳細情報受信ID
     * @return The value of the column 'PRIMARY_SHIPPING_DTL_INFO_ID'. (NullAllowed)
     */
    public Long getPrimaryShippingDtlInfoId() {
        return _primaryShippingDtlInfoId;
    }

    /**
     * [set] PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 一次輸送詳細情報受信ID
     * @param primaryShippingDtlInfoId The value of the column 'PRIMARY_SHIPPING_DTL_INFO_ID'. (NullAllowed)
     */
    public void setPrimaryShippingDtlInfoId(Long primaryShippingDtlInfoId) {
        __modifiedProperties.add("primaryShippingDtlInfoId");
        this._primaryShippingDtlInfoId = primaryShippingDtlInfoId;
    }

    /**
     * [get] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] ZZBUKRS: {varchar(100)} <br>
     * 会社コード
     * @return The value of the column 'ZZBUKRS'. (NullAllowed)
     */
    public String getZzbukrs() {
        return _zzbukrs;
    }

    /**
     * [set] ZZBUKRS: {varchar(100)} <br>
     * 会社コード
     * @param zzbukrs The value of the column 'ZZBUKRS'. (NullAllowed)
     */
    public void setZzbukrs(String zzbukrs) {
        __modifiedProperties.add("zzbukrs");
        this._zzbukrs = zzbukrs;
    }

    /**
     * [get] ZZSNDYMD: {varchar(100)} <br>
     * 発送予定年月日
     * @return The value of the column 'ZZSNDYMD'. (NullAllowed)
     */
    public String getZzsndymd() {
        return _zzsndymd;
    }

    /**
     * [set] ZZSNDYMD: {varchar(100)} <br>
     * 発送予定年月日
     * @param zzsndymd The value of the column 'ZZSNDYMD'. (NullAllowed)
     */
    public void setZzsndymd(String zzsndymd) {
        __modifiedProperties.add("zzsndymd");
        this._zzsndymd = zzsndymd;
    }

    /**
     * [get] RCDID: {varchar(100)} <br>
     * レコード区分
     * @return The value of the column 'RCDID'. (NullAllowed)
     */
    public String getRcdid() {
        return _rcdid;
    }

    /**
     * [set] RCDID: {varchar(100)} <br>
     * レコード区分
     * @param rcdid The value of the column 'RCDID'. (NullAllowed)
     */
    public void setRcdid(String rcdid) {
        __modifiedProperties.add("rcdid");
        this._rcdid = rcdid;
    }

    /**
     * [get] ZZREFENO: {varchar(100)} <br>
     * 整理番号
     * @return The value of the column 'ZZREFENO'. (NullAllowed)
     */
    public String getZzrefeno() {
        return _zzrefeno;
    }

    /**
     * [set] ZZREFENO: {varchar(100)} <br>
     * 整理番号
     * @param zzrefeno The value of the column 'ZZREFENO'. (NullAllowed)
     */
    public void setZzrefeno(String zzrefeno) {
        __modifiedProperties.add("zzrefeno");
        this._zzrefeno = zzrefeno;
    }

    /**
     * [get] BNWHCD: {varchar(100)} <br>
     * 枝倉庫コード
     * @return The value of the column 'BNWHCD'. (NullAllowed)
     */
    public String getBnwhcd() {
        return _bnwhcd;
    }

    /**
     * [set] BNWHCD: {varchar(100)} <br>
     * 枝倉庫コード
     * @param bnwhcd The value of the column 'BNWHCD'. (NullAllowed)
     */
    public void setBnwhcd(String bnwhcd) {
        __modifiedProperties.add("bnwhcd");
        this._bnwhcd = bnwhcd;
    }

    /**
     * [get] HDRID: {varchar(100)} <br>
     * ヘッダ区分
     * @return The value of the column 'HDRID'. (NullAllowed)
     */
    public String getHdrid() {
        return _hdrid;
    }

    /**
     * [set] HDRID: {varchar(100)} <br>
     * ヘッダ区分
     * @param hdrid The value of the column 'HDRID'. (NullAllowed)
     */
    public void setHdrid(String hdrid) {
        __modifiedProperties.add("hdrid");
        this._hdrid = hdrid;
    }

    /**
     * [get] DTLNO: {varchar(100)} <br>
     * 明細番号
     * @return The value of the column 'DTLNO'. (NullAllowed)
     */
    public String getDtlno() {
        return _dtlno;
    }

    /**
     * [set] DTLNO: {varchar(100)} <br>
     * 明細番号
     * @param dtlno The value of the column 'DTLNO'. (NullAllowed)
     */
    public void setDtlno(String dtlno) {
        __modifiedProperties.add("dtlno");
        this._dtlno = dtlno;
    }

    /**
     * [get] SPNDDA: {varchar(100)} <br>
     * 発地所要日付
     * @return The value of the column 'SPNDDA'. (NullAllowed)
     */
    public String getSpndda() {
        return _spndda;
    }

    /**
     * [set] SPNDDA: {varchar(100)} <br>
     * 発地所要日付
     * @param spndda The value of the column 'SPNDDA'. (NullAllowed)
     */
    public void setSpndda(String spndda) {
        __modifiedProperties.add("spndda");
        this._spndda = spndda;
    }

    /**
     * [get] PDLGTM: {varchar(100)} <br>
     * 予定納入時間
     * @return The value of the column 'PDLGTM'. (NullAllowed)
     */
    public String getPdlgtm() {
        return _pdlgtm;
    }

    /**
     * [set] PDLGTM: {varchar(100)} <br>
     * 予定納入時間
     * @param pdlgtm The value of the column 'PDLGTM'. (NullAllowed)
     */
    public void setPdlgtm(String pdlgtm) {
        __modifiedProperties.add("pdlgtm");
        this._pdlgtm = pdlgtm;
    }

    /**
     * [get] ZZSENDNO: {varchar(100)} <br>
     * 発送番号
     * @return The value of the column 'ZZSENDNO'. (NullAllowed)
     */
    public String getZzsendno() {
        return _zzsendno;
    }

    /**
     * [set] ZZSENDNO: {varchar(100)} <br>
     * 発送番号
     * @param zzsendno The value of the column 'ZZSENDNO'. (NullAllowed)
     */
    public void setZzsendno(String zzsendno) {
        __modifiedProperties.add("zzsendno");
        this._zzsendno = zzsendno;
    }

    /**
     * [get] PRCSORG: {varchar(100)} <br>
     * 購買組織
     * @return The value of the column 'PRCSORG'. (NullAllowed)
     */
    public String getPrcsorg() {
        return _prcsorg;
    }

    /**
     * [set] PRCSORG: {varchar(100)} <br>
     * 購買組織
     * @param prcsorg The value of the column 'PRCSORG'. (NullAllowed)
     */
    public void setPrcsorg(String prcsorg) {
        __modifiedProperties.add("prcsorg");
        this._prcsorg = prcsorg;
    }

    /**
     * [get] EKGRP: {varchar(100)} <br>
     * 購買グループ
     * @return The value of the column 'EKGRP'. (NullAllowed)
     */
    public String getEkgrp() {
        return _ekgrp;
    }

    /**
     * [set] EKGRP: {varchar(100)} <br>
     * 購買グループ
     * @param ekgrp The value of the column 'EKGRP'. (NullAllowed)
     */
    public void setEkgrp(String ekgrp) {
        __modifiedProperties.add("ekgrp");
        this._ekgrp = ekgrp;
    }

    /**
     * [get] SPCD: {varchar(100)} <br>
     * 発地コード
     * @return The value of the column 'SPCD'. (NullAllowed)
     */
    public String getSpcd() {
        return _spcd;
    }

    /**
     * [set] SPCD: {varchar(100)} <br>
     * 発地コード
     * @param spcd The value of the column 'SPCD'. (NullAllowed)
     */
    public void setSpcd(String spcd) {
        __modifiedProperties.add("spcd");
        this._spcd = spcd;
    }

    /**
     * [get] SPSKPLCD: {varchar(100)} <br>
     * 発地保管場所コード
     * @return The value of the column 'SPSKPLCD'. (NullAllowed)
     */
    public String getSpskplcd() {
        return _spskplcd;
    }

    /**
     * [set] SPSKPLCD: {varchar(100)} <br>
     * 発地保管場所コード
     * @param spskplcd The value of the column 'SPSKPLCD'. (NullAllowed)
     */
    public void setSpskplcd(String spskplcd) {
        __modifiedProperties.add("spskplcd");
        this._spskplcd = spskplcd;
    }

    /**
     * [get] RCCD: {varchar(100)} <br>
     * 受地コード
     * @return The value of the column 'RCCD'. (NullAllowed)
     */
    public String getRccd() {
        return _rccd;
    }

    /**
     * [set] RCCD: {varchar(100)} <br>
     * 受地コード
     * @param rccd The value of the column 'RCCD'. (NullAllowed)
     */
    public void setRccd(String rccd) {
        __modifiedProperties.add("rccd");
        this._rccd = rccd;
    }

    /**
     * [get] RCSKPLCD: {varchar(100)} <br>
     * 受地保管場所コード
     * @return The value of the column 'RCSKPLCD'. (NullAllowed)
     */
    public String getRcskplcd() {
        return _rcskplcd;
    }

    /**
     * [set] RCSKPLCD: {varchar(100)} <br>
     * 受地保管場所コード
     * @param rcskplcd The value of the column 'RCSKPLCD'. (NullAllowed)
     */
    public void setRcskplcd(String rcskplcd) {
        __modifiedProperties.add("rcskplcd");
        this._rcskplcd = rcskplcd;
    }

    /**
     * [get] ZZRCVYMD: {varchar(100)} <br>
     * 受入予定年月日
     * @return The value of the column 'ZZRCVYMD'. (NullAllowed)
     */
    public String getZzrcvymd() {
        return _zzrcvymd;
    }

    /**
     * [set] ZZRCVYMD: {varchar(100)} <br>
     * 受入予定年月日
     * @param zzrcvymd The value of the column 'ZZRCVYMD'. (NullAllowed)
     */
    public void setZzrcvymd(String zzrcvymd) {
        __modifiedProperties.add("zzrcvymd");
        this._zzrcvymd = zzrcvymd;
    }

    /**
     * [get] ZZSHTYPE: {varchar(100)} <br>
     * 輸送形態コード
     * @return The value of the column 'ZZSHTYPE'. (NullAllowed)
     */
    public String getZzshtype() {
        return _zzshtype;
    }

    /**
     * [set] ZZSHTYPE: {varchar(100)} <br>
     * 輸送形態コード
     * @param zzshtype The value of the column 'ZZSHTYPE'. (NullAllowed)
     */
    public void setZzshtype(String zzshtype) {
        __modifiedProperties.add("zzshtype");
        this._zzshtype = zzshtype;
    }

    /**
     * [get] AGCD: {varchar(100)} <br>
     * 業者コード
     * @return The value of the column 'AGCD'. (NullAllowed)
     */
    public String getAgcd() {
        return _agcd;
    }

    /**
     * [set] AGCD: {varchar(100)} <br>
     * 業者コード
     * @param agcd The value of the column 'AGCD'. (NullAllowed)
     */
    public void setAgcd(String agcd) {
        __modifiedProperties.add("agcd");
        this._agcd = agcd;
    }

    /**
     * [get] ZZCBXQTY: {varchar(100)} <br>
     * 総段ボール数
     * @return The value of the column 'ZZCBXQTY'. (NullAllowed)
     */
    public String getZzcbxqty() {
        return _zzcbxqty;
    }

    /**
     * [set] ZZCBXQTY: {varchar(100)} <br>
     * 総段ボール数
     * @param zzcbxqty The value of the column 'ZZCBXQTY'. (NullAllowed)
     */
    public void setZzcbxqty(String zzcbxqty) {
        __modifiedProperties.add("zzcbxqty");
        this._zzcbxqty = zzcbxqty;
    }

    /**
     * [get] ZZPLTQTY: {varchar(100)} <br>
     * パレット数
     * @return The value of the column 'ZZPLTQTY'. (NullAllowed)
     */
    public String getZzpltqty() {
        return _zzpltqty;
    }

    /**
     * [set] ZZPLTQTY: {varchar(100)} <br>
     * パレット数
     * @param zzpltqty The value of the column 'ZZPLTQTY'. (NullAllowed)
     */
    public void setZzpltqty(String zzpltqty) {
        __modifiedProperties.add("zzpltqty");
        this._zzpltqty = zzpltqty;
    }

    /**
     * [get] ZZTPLQTY: {varchar(100)} <br>
     * 総パレット数
     * @return The value of the column 'ZZTPLQTY'. (NullAllowed)
     */
    public String getZztplqty() {
        return _zztplqty;
    }

    /**
     * [set] ZZTPLQTY: {varchar(100)} <br>
     * 総パレット数
     * @param zztplqty The value of the column 'ZZTPLQTY'. (NullAllowed)
     */
    public void setZztplqty(String zztplqty) {
        __modifiedProperties.add("zztplqty");
        this._zztplqty = zztplqty;
    }

    /**
     * [get] ZZSHPCLS: {varchar(100)} <br>
     * 輸送種別
     * @return The value of the column 'ZZSHPCLS'. (NullAllowed)
     */
    public String getZzshpcls() {
        return _zzshpcls;
    }

    /**
     * [set] ZZSHPCLS: {varchar(100)} <br>
     * 輸送種別
     * @param zzshpcls The value of the column 'ZZSHPCLS'. (NullAllowed)
     */
    public void setZzshpcls(String zzshpcls) {
        __modifiedProperties.add("zzshpcls");
        this._zzshpcls = zzshpcls;
    }

    /**
     * [get] ZZREFE01: {varchar(100)} <br>
     * 発送番号内整理番号(1)
     * @return The value of the column 'ZZREFE01'. (NullAllowed)
     */
    public String getZzrefe01() {
        return _zzrefe01;
    }

    /**
     * [set] ZZREFE01: {varchar(100)} <br>
     * 発送番号内整理番号(1)
     * @param zzrefe01 The value of the column 'ZZREFE01'. (NullAllowed)
     */
    public void setZzrefe01(String zzrefe01) {
        __modifiedProperties.add("zzrefe01");
        this._zzrefe01 = zzrefe01;
    }

    /**
     * [get] ZZREFE02: {varchar(100)} <br>
     * 発送番号内整理番号(2)
     * @return The value of the column 'ZZREFE02'. (NullAllowed)
     */
    public String getZzrefe02() {
        return _zzrefe02;
    }

    /**
     * [set] ZZREFE02: {varchar(100)} <br>
     * 発送番号内整理番号(2)
     * @param zzrefe02 The value of the column 'ZZREFE02'. (NullAllowed)
     */
    public void setZzrefe02(String zzrefe02) {
        __modifiedProperties.add("zzrefe02");
        this._zzrefe02 = zzrefe02;
    }

    /**
     * [get] ZZREFE03: {varchar(100)} <br>
     * 発送番号内整理番号(3)
     * @return The value of the column 'ZZREFE03'. (NullAllowed)
     */
    public String getZzrefe03() {
        return _zzrefe03;
    }

    /**
     * [set] ZZREFE03: {varchar(100)} <br>
     * 発送番号内整理番号(3)
     * @param zzrefe03 The value of the column 'ZZREFE03'. (NullAllowed)
     */
    public void setZzrefe03(String zzrefe03) {
        __modifiedProperties.add("zzrefe03");
        this._zzrefe03 = zzrefe03;
    }

    /**
     * [get] ZZREFE04: {varchar(100)} <br>
     * 発送番号内整理番号(4)
     * @return The value of the column 'ZZREFE04'. (NullAllowed)
     */
    public String getZzrefe04() {
        return _zzrefe04;
    }

    /**
     * [set] ZZREFE04: {varchar(100)} <br>
     * 発送番号内整理番号(4)
     * @param zzrefe04 The value of the column 'ZZREFE04'. (NullAllowed)
     */
    public void setZzrefe04(String zzrefe04) {
        __modifiedProperties.add("zzrefe04");
        this._zzrefe04 = zzrefe04;
    }

    /**
     * [get] ZZREFE05: {varchar(100)} <br>
     * 発送番号内整理番号(5)
     * @return The value of the column 'ZZREFE05'. (NullAllowed)
     */
    public String getZzrefe05() {
        return _zzrefe05;
    }

    /**
     * [set] ZZREFE05: {varchar(100)} <br>
     * 発送番号内整理番号(5)
     * @param zzrefe05 The value of the column 'ZZREFE05'. (NullAllowed)
     */
    public void setZzrefe05(String zzrefe05) {
        __modifiedProperties.add("zzrefe05");
        this._zzrefe05 = zzrefe05;
    }

    /**
     * [get] ZZREFE06: {varchar(100)} <br>
     * 発送番号内整理番号(6)
     * @return The value of the column 'ZZREFE06'. (NullAllowed)
     */
    public String getZzrefe06() {
        return _zzrefe06;
    }

    /**
     * [set] ZZREFE06: {varchar(100)} <br>
     * 発送番号内整理番号(6)
     * @param zzrefe06 The value of the column 'ZZREFE06'. (NullAllowed)
     */
    public void setZzrefe06(String zzrefe06) {
        __modifiedProperties.add("zzrefe06");
        this._zzrefe06 = zzrefe06;
    }

    /**
     * [get] ZZREFE07: {varchar(100)} <br>
     * 発送番号内整理番号(7)
     * @return The value of the column 'ZZREFE07'. (NullAllowed)
     */
    public String getZzrefe07() {
        return _zzrefe07;
    }

    /**
     * [set] ZZREFE07: {varchar(100)} <br>
     * 発送番号内整理番号(7)
     * @param zzrefe07 The value of the column 'ZZREFE07'. (NullAllowed)
     */
    public void setZzrefe07(String zzrefe07) {
        __modifiedProperties.add("zzrefe07");
        this._zzrefe07 = zzrefe07;
    }

    /**
     * [get] ZZREFE08: {varchar(100)} <br>
     * 発送番号内整理番号(8)
     * @return The value of the column 'ZZREFE08'. (NullAllowed)
     */
    public String getZzrefe08() {
        return _zzrefe08;
    }

    /**
     * [set] ZZREFE08: {varchar(100)} <br>
     * 発送番号内整理番号(8)
     * @param zzrefe08 The value of the column 'ZZREFE08'. (NullAllowed)
     */
    public void setZzrefe08(String zzrefe08) {
        __modifiedProperties.add("zzrefe08");
        this._zzrefe08 = zzrefe08;
    }

    /**
     * [get] ZZREFE09: {varchar(100)} <br>
     * 発送番号内整理番号(9)
     * @return The value of the column 'ZZREFE09'. (NullAllowed)
     */
    public String getZzrefe09() {
        return _zzrefe09;
    }

    /**
     * [set] ZZREFE09: {varchar(100)} <br>
     * 発送番号内整理番号(9)
     * @param zzrefe09 The value of the column 'ZZREFE09'. (NullAllowed)
     */
    public void setZzrefe09(String zzrefe09) {
        __modifiedProperties.add("zzrefe09");
        this._zzrefe09 = zzrefe09;
    }

    /**
     * [get] ZZREFE10: {varchar(100)} <br>
     * 発送番号内整理番号(10)
     * @return The value of the column 'ZZREFE10'. (NullAllowed)
     */
    public String getZzrefe10() {
        return _zzrefe10;
    }

    /**
     * [set] ZZREFE10: {varchar(100)} <br>
     * 発送番号内整理番号(10)
     * @param zzrefe10 The value of the column 'ZZREFE10'. (NullAllowed)
     */
    public void setZzrefe10(String zzrefe10) {
        __modifiedProperties.add("zzrefe10");
        this._zzrefe10 = zzrefe10;
    }

    /**
     * [get] DTLQA: {varchar(100)} <br>
     * 明細数
     * @return The value of the column 'DTLQA'. (NullAllowed)
     */
    public String getDtlqa() {
        return _dtlqa;
    }

    /**
     * [set] DTLQA: {varchar(100)} <br>
     * 明細数
     * @param dtlqa The value of the column 'DTLQA'. (NullAllowed)
     */
    public void setDtlqa(String dtlqa) {
        __modifiedProperties.add("dtlqa");
        this._dtlqa = dtlqa;
    }

    /**
     * [get] ZZREFENO2: {varchar(100)} <br>
     * 相手整理番号
     * @return The value of the column 'ZZREFENO2'. (NullAllowed)
     */
    public String getZzrefeno2() {
        return _zzrefeno2;
    }

    /**
     * [set] ZZREFENO2: {varchar(100)} <br>
     * 相手整理番号
     * @param zzrefeno2 The value of the column 'ZZREFENO2'. (NullAllowed)
     */
    public void setZzrefeno2(String zzrefeno2) {
        __modifiedProperties.add("zzrefeno2");
        this._zzrefeno2 = zzrefeno2;
    }

    /**
     * [get] OPRTNO: {varchar(100)} <br>
     * 作業番号
     * @return The value of the column 'OPRTNO'. (NullAllowed)
     */
    public String getOprtno() {
        return _oprtno;
    }

    /**
     * [set] OPRTNO: {varchar(100)} <br>
     * 作業番号
     * @param oprtno The value of the column 'OPRTNO'. (NullAllowed)
     */
    public void setOprtno(String oprtno) {
        __modifiedProperties.add("oprtno");
        this._oprtno = oprtno;
    }

    /**
     * [get] BLOCKNM: {varchar(100)} <br>
     * ブロック名
     * @return The value of the column 'BLOCKNM'. (NullAllowed)
     */
    public String getBlocknm() {
        return _blocknm;
    }

    /**
     * [set] BLOCKNM: {varchar(100)} <br>
     * ブロック名
     * @param blocknm The value of the column 'BLOCKNM'. (NullAllowed)
     */
    public void setBlocknm(String blocknm) {
        __modifiedProperties.add("blocknm");
        this._blocknm = blocknm;
    }

    /**
     * [get] ZZMATNR: {varchar(100)} <br>
     * 銘柄コード
     * @return The value of the column 'ZZMATNR'. (NullAllowed)
     */
    public String getZzmatnr() {
        return _zzmatnr;
    }

    /**
     * [set] ZZMATNR: {varchar(100)} <br>
     * 銘柄コード
     * @param zzmatnr The value of the column 'ZZMATNR'. (NullAllowed)
     */
    public void setZzmatnr(String zzmatnr) {
        __modifiedProperties.add("zzmatnr");
        this._zzmatnr = zzmatnr;
    }

    /**
     * [get] LOTNO: {varchar(100)} <br>
     * ロット番号
     * @return The value of the column 'LOTNO'. (NullAllowed)
     */
    public String getLotno() {
        return _lotno;
    }

    /**
     * [set] LOTNO: {varchar(100)} <br>
     * ロット番号
     * @param lotno The value of the column 'LOTNO'. (NullAllowed)
     */
    public void setLotno(String lotno) {
        __modifiedProperties.add("lotno");
        this._lotno = lotno;
    }

    /**
     * [get] QUANTY: {varchar(100)} <br>
     * 数量（１３桁）
     * @return The value of the column 'QUANTY'. (NullAllowed)
     */
    public String getQuanty() {
        return _quanty;
    }

    /**
     * [set] QUANTY: {varchar(100)} <br>
     * 数量（１３桁）
     * @param quanty The value of the column 'QUANTY'. (NullAllowed)
     */
    public void setQuanty(String quanty) {
        __modifiedProperties.add("quanty");
        this._quanty = quanty;
    }

    /**
     * [get] GRPCSD: {varchar(100)} <br>
     * 入庫処理日数
     * @return The value of the column 'GRPCSD'. (NullAllowed)
     */
    public String getGrpcsd() {
        return _grpcsd;
    }

    /**
     * [set] GRPCSD: {varchar(100)} <br>
     * 入庫処理日数
     * @param grpcsd The value of the column 'GRPCSD'. (NullAllowed)
     */
    public void setGrpcsd(String grpcsd) {
        __modifiedProperties.add("grpcsd");
        this._grpcsd = grpcsd;
    }

    /**
     * [get] SFPOQA: {varchar(100)} <br>
     * 滅却数量（計算用）
     * @return The value of the column 'SFPOQA'. (NullAllowed)
     */
    public String getSfpoqa() {
        return _sfpoqa;
    }

    /**
     * [set] SFPOQA: {varchar(100)} <br>
     * 滅却数量（計算用）
     * @param sfpoqa The value of the column 'SFPOQA'. (NullAllowed)
     */
    public void setSfpoqa(String sfpoqa) {
        __modifiedProperties.add("sfpoqa");
        this._sfpoqa = sfpoqa;
    }

    /**
     * [get] DSSKPLCD: {varchar(100)} <br>
     * 相手先保管場所
     * @return The value of the column 'DSSKPLCD'. (NullAllowed)
     */
    public String getDsskplcd() {
        return _dsskplcd;
    }

    /**
     * [set] DSSKPLCD: {varchar(100)} <br>
     * 相手先保管場所
     * @param dsskplcd The value of the column 'DSSKPLCD'. (NullAllowed)
     */
    public void setDsskplcd(String dsskplcd) {
        __modifiedProperties.add("dsskplcd");
        this._dsskplcd = dsskplcd;
    }

    /**
     * [get] MFINF: {varchar(100)} <br>
     * 製造情報
     * @return The value of the column 'MFINF'. (NullAllowed)
     */
    public String getMfinf() {
        return _mfinf;
    }

    /**
     * [set] MFINF: {varchar(100)} <br>
     * 製造情報
     * @param mfinf The value of the column 'MFINF'. (NullAllowed)
     */
    public void setMfinf(String mfinf) {
        __modifiedProperties.add("mfinf");
        this._mfinf = mfinf;
    }

    /**
     * [get] SFTHDES: {varchar(100)} <br>
     * 今回デザイン
     * @return The value of the column 'SFTHDES'. (NullAllowed)
     */
    public String getSfthdes() {
        return _sfthdes;
    }

    /**
     * [set] SFTHDES: {varchar(100)} <br>
     * 今回デザイン
     * @param sfthdes The value of the column 'SFTHDES'. (NullAllowed)
     */
    public void setSfthdes(String sfthdes) {
        __modifiedProperties.add("sfthdes");
        this._sfthdes = sfthdes;
    }

    /**
     * [get] CNFATCL: {varchar(100)} <br>
     * 確認事項
     * @return The value of the column 'CNFATCL'. (NullAllowed)
     */
    public String getCnfatcl() {
        return _cnfatcl;
    }

    /**
     * [set] CNFATCL: {varchar(100)} <br>
     * 確認事項
     * @param cnfatcl The value of the column 'CNFATCL'. (NullAllowed)
     */
    public void setCnfatcl(String cnfatcl) {
        __modifiedProperties.add("cnfatcl");
        this._cnfatcl = cnfatcl;
    }

    /**
     * [get] LASTGR: {varchar(100)} <br>
     * 前回入庫
     * @return The value of the column 'LASTGR'. (NullAllowed)
     */
    public String getLastgr() {
        return _lastgr;
    }

    /**
     * [set] LASTGR: {varchar(100)} <br>
     * 前回入庫
     * @param lastgr The value of the column 'LASTGR'. (NullAllowed)
     */
    public void setLastgr(String lastgr) {
        __modifiedProperties.add("lastgr");
        this._lastgr = lastgr;
    }

    /**
     * [get] SFLASTDES: {varchar(100)} <br>
     * 前回デザイン
     * @return The value of the column 'SFLASTDES'. (NullAllowed)
     */
    public String getSflastdes() {
        return _sflastdes;
    }

    /**
     * [set] SFLASTDES: {varchar(100)} <br>
     * 前回デザイン
     * @param sflastdes The value of the column 'SFLASTDES'. (NullAllowed)
     */
    public void setSflastdes(String sflastdes) {
        __modifiedProperties.add("sflastdes");
        this._sflastdes = sflastdes;
    }

    /**
     * [get] SHNO: {varchar(100)} <br>
     * 問合せ番号
     * @return The value of the column 'SHNO'. (NullAllowed)
     */
    public String getShno() {
        return _shno;
    }

    /**
     * [set] SHNO: {varchar(100)} <br>
     * 問合せ番号
     * @param shno The value of the column 'SHNO'. (NullAllowed)
     */
    public void setShno(String shno) {
        __modifiedProperties.add("shno");
        this._shno = shno;
    }

    /**
     * [get] PLTNO: {varchar(100)} <br>
     * パレット番号（０８需給）
     * @return The value of the column 'PLTNO'. (NullAllowed)
     */
    public String getPltno() {
        return _pltno;
    }

    /**
     * [set] PLTNO: {varchar(100)} <br>
     * パレット番号（０８需給）
     * @param pltno The value of the column 'PLTNO'. (NullAllowed)
     */
    public void setPltno(String pltno) {
        __modifiedProperties.add("pltno");
        this._pltno = pltno;
    }

    /**
     * [get] TRADELIVNO: {varchar(100)} <br>
     * 商社搬入番号
     * @return The value of the column 'TRADELIVNO'. (NullAllowed)
     */
    public String getTradelivno() {
        return _tradelivno;
    }

    /**
     * [set] TRADELIVNO: {varchar(100)} <br>
     * 商社搬入番号
     * @param tradelivno The value of the column 'TRADELIVNO'. (NullAllowed)
     */
    public void setTradelivno(String tradelivno) {
        __modifiedProperties.add("tradelivno");
        this._tradelivno = tradelivno;
    }

    /**
     * [get] BATJMFYM: {varchar(100)} <br>
     * BATJ製造月情報
     * @return The value of the column 'BATJMFYM'. (NullAllowed)
     */
    public String getBatjmfym() {
        return _batjmfym;
    }

    /**
     * [set] BATJMFYM: {varchar(100)} <br>
     * BATJ製造月情報
     * @param batjmfym The value of the column 'BATJMFYM'. (NullAllowed)
     */
    public void setBatjmfym(String batjmfym) {
        __modifiedProperties.add("batjmfym");
        this._batjmfym = batjmfym;
    }

    /**
     * [get] SFFIL: {varchar(100)} <br>
     * 空白
     * @return The value of the column 'SFFIL'. (NullAllowed)
     */
    public String getSffil() {
        return _sffil;
    }

    /**
     * [set] SFFIL: {varchar(100)} <br>
     * 空白
     * @param sffil The value of the column 'SFFIL'. (NullAllowed)
     */
    public void setSffil(String sffil) {
        __modifiedProperties.add("sffil");
        this._sffil = sffil;
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
