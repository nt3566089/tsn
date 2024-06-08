package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_SHIPPING_PLAN_BULK_INPUT as TABLE. <br>
 * さしず受信テーブル
 * <pre>
 * [primary-key]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
 *
 * [column]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, HEDDER_FLG, ZZORGNCD, DPCD, ORDGR, RMANO, SSCD, SLPTYP, SLPNO, SEQNO, ZZORDYMD, ZZWAYMD1, OTORGCD, ORDORGCD, RLYBSCD, DED, PSTNID, DLVRNK, LMPDLVNO, DIVMTD, HDVID, NAME1, ZREGPRCA, ZREGPRCC, ZZSALTAX, ZZGODFPC, ZZGODSPC, ZZGODCTX, LOGISTICSCD, SLEDIV, HVRTRSN, ZZVBELNB, CNGPRTSLPNO, TRNSCTNDIV, EOSORDAFTFLG, EOSSLPNO, HDRDBXDIV, INOTRFSLDIV, BXMNTRFSLDIV, SLPMRGTMG, ZZBLOTDT, CGGDID, MATNR, KWMENG, MVGR1, MVGR4, KZWI3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
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
public abstract class BsEShippingPlanBulkInputDto implements Serializable {

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
    /** BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _bondedShippingPlanBulkInputId;

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

    /** HEDDER_FLG: {NotNull, char(1)} */
    @JsonKey
    protected String _hedderFlg;

    /** ZZORGNCD: {varchar(255)} */
    @JsonKey
    protected String _zzorgncd;

    /** DPCD: {varchar(255)} */
    @JsonKey
    protected String _dpcd;

    /** ORDGR: {varchar(255)} */
    @JsonKey
    protected String _ordgr;

    /** RMANO: {varchar(255)} */
    @JsonKey
    protected String _rmano;

    /** SSCD: {varchar(255)} */
    @JsonKey
    protected String _sscd;

    /** SLPTYP: {varchar(255)} */
    @JsonKey
    protected String _slptyp;

    /** SLPNO: {varchar(255)} */
    @JsonKey
    protected String _slpno;

    /** SEQNO: {varchar(255)} */
    @JsonKey
    protected String _seqno;

    /** ZZORDYMD: {varchar(255)} */
    @JsonKey
    protected String _zzordymd;

    /** ZZWAYMD1: {varchar(255)} */
    @JsonKey
    protected String _zzwaymd1;

    /** OTORGCD: {varchar(255)} */
    @JsonKey
    protected String _otorgcd;

    /** ORDORGCD: {varchar(255)} */
    @JsonKey
    protected String _ordorgcd;

    /** RLYBSCD: {varchar(255)} */
    @JsonKey
    protected String _rlybscd;

    /** DED: {varchar(255)} */
    @JsonKey
    protected String _ded;

    /** PSTNID: {varchar(255)} */
    @JsonKey
    protected String _pstnid;

    /** DLVRNK: {varchar(255)} */
    @JsonKey
    protected String _dlvrnk;

    /** LMPDLVNO: {varchar(255)} */
    @JsonKey
    protected String _lmpdlvno;

    /** DIVMTD: {varchar(255)} */
    @JsonKey
    protected String _divmtd;

    /** HDVID: {varchar(255)} */
    @JsonKey
    protected String _hdvid;

    /** NAME1: {varchar(255)} */
    @JsonKey
    protected String _name1;

    /** ZREGPRCA: {varchar(255)} */
    @JsonKey
    protected String _zregprca;

    /** ZREGPRCC: {varchar(255)} */
    @JsonKey
    protected String _zregprcc;

    /** ZZSALTAX: {varchar(255)} */
    @JsonKey
    protected String _zzsaltax;

    /** ZZGODFPC: {varchar(255)} */
    @JsonKey
    protected String _zzgodfpc;

    /** ZZGODSPC: {varchar(255)} */
    @JsonKey
    protected String _zzgodspc;

    /** ZZGODCTX: {varchar(255)} */
    @JsonKey
    protected String _zzgodctx;

    /** LOGISTICSCD: {varchar(255)} */
    @JsonKey
    protected String _logisticscd;

    /** SLEDIV: {varchar(255)} */
    @JsonKey
    protected String _slediv;

    /** HVRTRSN: {varchar(255)} */
    @JsonKey
    protected String _hvrtrsn;

    /** ZZVBELNB: {varchar(255)} */
    @JsonKey
    protected String _zzvbelnb;

    /** CNGPRTSLPNO: {varchar(255)} */
    @JsonKey
    protected String _cngprtslpno;

    /** TRNSCTNDIV: {varchar(255)} */
    @JsonKey
    protected String _trnsctndiv;

    /** EOSORDAFTFLG: {varchar(255)} */
    @JsonKey
    protected String _eosordaftflg;

    /** EOSSLPNO: {varchar(255)} */
    @JsonKey
    protected String _eosslpno;

    /** HDRDBXDIV: {varchar(255)} */
    @JsonKey
    protected String _hdrdbxdiv;

    /** INOTRFSLDIV: {varchar(255)} */
    @JsonKey
    protected String _inotrfsldiv;

    /** BXMNTRFSLDIV: {varchar(255)} */
    @JsonKey
    protected String _bxmntrfsldiv;

    /** SLPMRGTMG: {varchar(255)} */
    @JsonKey
    protected String _slpmrgtmg;

    /** ZZBLOTDT: {varchar(255)} */
    @JsonKey
    protected String _zzblotdt;

    /** CGGDID: {varchar(255)} */
    @JsonKey
    protected String _cggdid;

    /** MATNR: {varchar(255)} */
    @JsonKey
    protected String _matnr;

    /** KWMENG: {varchar(255)} */
    @JsonKey
    protected String _kwmeng;

    /** MVGR1: {varchar(255)} */
    @JsonKey
    protected String _mvgr1;

    /** MVGR4: {varchar(255)} */
    @JsonKey
    protected String _mvgr4;

    /** KZWI3: {varchar(255)} */
    @JsonKey
    protected String _kzwi3;

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
    public BsEShippingPlanBulkInputDto() {
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
        if (other == null || !(other instanceof BsEShippingPlanBulkInputDto)) { return false; }
        final BsEShippingPlanBulkInputDto otherEntity = (BsEShippingPlanBulkInputDto)other;
        if (!helpComparingValue(getBondedShippingPlanBulkInputId(), otherEntity.getBondedShippingPlanBulkInputId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_SHIPPING_PLAN_BULK_INPUT");
        result = xCH(result, getBondedShippingPlanBulkInputId());
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
        sb.append(c).append(getBondedShippingPlanBulkInputId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getHedderFlg());
        sb.append(c).append(getZzorgncd());
        sb.append(c).append(getDpcd());
        sb.append(c).append(getOrdgr());
        sb.append(c).append(getRmano());
        sb.append(c).append(getSscd());
        sb.append(c).append(getSlptyp());
        sb.append(c).append(getSlpno());
        sb.append(c).append(getSeqno());
        sb.append(c).append(getZzordymd());
        sb.append(c).append(getZzwaymd1());
        sb.append(c).append(getOtorgcd());
        sb.append(c).append(getOrdorgcd());
        sb.append(c).append(getRlybscd());
        sb.append(c).append(getDed());
        sb.append(c).append(getPstnid());
        sb.append(c).append(getDlvrnk());
        sb.append(c).append(getLmpdlvno());
        sb.append(c).append(getDivmtd());
        sb.append(c).append(getHdvid());
        sb.append(c).append(getName1());
        sb.append(c).append(getZregprca());
        sb.append(c).append(getZregprcc());
        sb.append(c).append(getZzsaltax());
        sb.append(c).append(getZzgodfpc());
        sb.append(c).append(getZzgodspc());
        sb.append(c).append(getZzgodctx());
        sb.append(c).append(getLogisticscd());
        sb.append(c).append(getSlediv());
        sb.append(c).append(getHvrtrsn());
        sb.append(c).append(getZzvbelnb());
        sb.append(c).append(getCngprtslpno());
        sb.append(c).append(getTrnsctndiv());
        sb.append(c).append(getEosordaftflg());
        sb.append(c).append(getEosslpno());
        sb.append(c).append(getHdrdbxdiv());
        sb.append(c).append(getInotrfsldiv());
        sb.append(c).append(getBxmntrfsldiv());
        sb.append(c).append(getSlpmrgtmg());
        sb.append(c).append(getZzblotdt());
        sb.append(c).append(getCggdid());
        sb.append(c).append(getMatnr());
        sb.append(c).append(getKwmeng());
        sb.append(c).append(getMvgr1());
        sb.append(c).append(getMvgr4());
        sb.append(c).append(getKzwi3());
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
     * [get] BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしず受信ID
     * @return The value of the column 'BONDED_SHIPPING_PLAN_BULK_INPUT_ID'. (NullAllowed)
     */
    public Long getBondedShippingPlanBulkInputId() {
        return _bondedShippingPlanBulkInputId;
    }

    /**
     * [set] BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしず受信ID
     * @param bondedShippingPlanBulkInputId The value of the column 'BONDED_SHIPPING_PLAN_BULK_INPUT_ID'. (NullAllowed)
     */
    public void setBondedShippingPlanBulkInputId(Long bondedShippingPlanBulkInputId) {
        __modifiedProperties.add("bondedShippingPlanBulkInputId");
        this._bondedShippingPlanBulkInputId = bondedShippingPlanBulkInputId;
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
     * [get] HEDDER_FLG: {NotNull, char(1)} <br>
     * ヘッダフラグ
     * @return The value of the column 'HEDDER_FLG'. (NullAllowed)
     */
    public String getHedderFlg() {
        return _hedderFlg;
    }

    /**
     * [set] HEDDER_FLG: {NotNull, char(1)} <br>
     * ヘッダフラグ
     * @param hedderFlg The value of the column 'HEDDER_FLG'. (NullAllowed)
     */
    public void setHedderFlg(String hedderFlg) {
        __modifiedProperties.add("hedderFlg");
        this._hedderFlg = hedderFlg;
    }

    /**
     * [get] ZZORGNCD: {varchar(255)} <br>
     * 仕分基地CD
     * @return The value of the column 'ZZORGNCD'. (NullAllowed)
     */
    public String getZzorgncd() {
        return _zzorgncd;
    }

    /**
     * [set] ZZORGNCD: {varchar(255)} <br>
     * 仕分基地CD
     * @param zzorgncd The value of the column 'ZZORGNCD'. (NullAllowed)
     */
    public void setZzorgncd(String zzorgncd) {
        __modifiedProperties.add("zzorgncd");
        this._zzorgncd = zzorgncd;
    }

    /**
     * [get] DPCD: {varchar(255)} <br>
     * 配達拠点コード
     * @return The value of the column 'DPCD'. (NullAllowed)
     */
    public String getDpcd() {
        return _dpcd;
    }

    /**
     * [set] DPCD: {varchar(255)} <br>
     * 配達拠点コード
     * @param dpcd The value of the column 'DPCD'. (NullAllowed)
     */
    public void setDpcd(String dpcd) {
        __modifiedProperties.add("dpcd");
        this._dpcd = dpcd;
    }

    /**
     * [get] ORDGR: {varchar(255)} <br>
     * さしずグループ
     * @return The value of the column 'ORDGR'. (NullAllowed)
     */
    public String getOrdgr() {
        return _ordgr;
    }

    /**
     * [set] ORDGR: {varchar(255)} <br>
     * さしずグループ
     * @param ordgr The value of the column 'ORDGR'. (NullAllowed)
     */
    public void setOrdgr(String ordgr) {
        __modifiedProperties.add("ordgr");
        this._ordgr = ordgr;
    }

    /**
     * [get] RMANO: {varchar(255)} <br>
     * 販売年月日
     * @return The value of the column 'RMANO'. (NullAllowed)
     */
    public String getRmano() {
        return _rmano;
    }

    /**
     * [set] RMANO: {varchar(255)} <br>
     * 販売年月日
     * @param rmano The value of the column 'RMANO'. (NullAllowed)
     */
    public void setRmano(String rmano) {
        __modifiedProperties.add("rmano");
        this._rmano = rmano;
    }

    /**
     * [get] SSCD: {varchar(255)} <br>
     * お得意様CD
     * @return The value of the column 'SSCD'. (NullAllowed)
     */
    public String getSscd() {
        return _sscd;
    }

    /**
     * [set] SSCD: {varchar(255)} <br>
     * お得意様CD
     * @param sscd The value of the column 'SSCD'. (NullAllowed)
     */
    public void setSscd(String sscd) {
        __modifiedProperties.add("sscd");
        this._sscd = sscd;
    }

    /**
     * [get] SLPTYP: {varchar(255)} <br>
     * 伝票タイプ
     * @return The value of the column 'SLPTYP'. (NullAllowed)
     */
    public String getSlptyp() {
        return _slptyp;
    }

    /**
     * [set] SLPTYP: {varchar(255)} <br>
     * 伝票タイプ
     * @param slptyp The value of the column 'SLPTYP'. (NullAllowed)
     */
    public void setSlptyp(String slptyp) {
        __modifiedProperties.add("slptyp");
        this._slptyp = slptyp;
    }

    /**
     * [get] SLPNO: {varchar(255)} <br>
     * 伝票番号
     * @return The value of the column 'SLPNO'. (NullAllowed)
     */
    public String getSlpno() {
        return _slpno;
    }

    /**
     * [set] SLPNO: {varchar(255)} <br>
     * 伝票番号
     * @param slpno The value of the column 'SLPNO'. (NullAllowed)
     */
    public void setSlpno(String slpno) {
        __modifiedProperties.add("slpno");
        this._slpno = slpno;
    }

    /**
     * [get] SEQNO: {varchar(255)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQNO'. (NullAllowed)
     */
    public String getSeqno() {
        return _seqno;
    }

    /**
     * [set] SEQNO: {varchar(255)} <br>
     * シーケンス番号
     * @param seqno The value of the column 'SEQNO'. (NullAllowed)
     */
    public void setSeqno(String seqno) {
        __modifiedProperties.add("seqno");
        this._seqno = seqno;
    }

    /**
     * [get] ZZORDYMD: {varchar(255)} <br>
     * さしず年月日
     * @return The value of the column 'ZZORDYMD'. (NullAllowed)
     */
    public String getZzordymd() {
        return _zzordymd;
    }

    /**
     * [set] ZZORDYMD: {varchar(255)} <br>
     * さしず年月日
     * @param zzordymd The value of the column 'ZZORDYMD'. (NullAllowed)
     */
    public void setZzordymd(String zzordymd) {
        __modifiedProperties.add("zzordymd");
        this._zzordymd = zzordymd;
    }

    /**
     * [get] ZZWAYMD1: {varchar(255)} <br>
     * 出荷予定年月日
     * @return The value of the column 'ZZWAYMD1'. (NullAllowed)
     */
    public String getZzwaymd1() {
        return _zzwaymd1;
    }

    /**
     * [set] ZZWAYMD1: {varchar(255)} <br>
     * 出荷予定年月日
     * @param zzwaymd1 The value of the column 'ZZWAYMD1'. (NullAllowed)
     */
    public void setZzwaymd1(String zzwaymd1) {
        __modifiedProperties.add("zzwaymd1");
        this._zzwaymd1 = zzwaymd1;
    }

    /**
     * [get] OTORGCD: {varchar(255)} <br>
     * 出力先組織CD
     * @return The value of the column 'OTORGCD'. (NullAllowed)
     */
    public String getOtorgcd() {
        return _otorgcd;
    }

    /**
     * [set] OTORGCD: {varchar(255)} <br>
     * 出力先組織CD
     * @param otorgcd The value of the column 'OTORGCD'. (NullAllowed)
     */
    public void setOtorgcd(String otorgcd) {
        __modifiedProperties.add("otorgcd");
        this._otorgcd = otorgcd;
    }

    /**
     * [get] ORDORGCD: {varchar(255)} <br>
     * さしず元組織CD
     * @return The value of the column 'ORDORGCD'. (NullAllowed)
     */
    public String getOrdorgcd() {
        return _ordorgcd;
    }

    /**
     * [set] ORDORGCD: {varchar(255)} <br>
     * さしず元組織CD
     * @param ordorgcd The value of the column 'ORDORGCD'. (NullAllowed)
     */
    public void setOrdorgcd(String ordorgcd) {
        __modifiedProperties.add("ordorgcd");
        this._ordorgcd = ordorgcd;
    }

    /**
     * [get] RLYBSCD: {varchar(255)} <br>
     * 中継拠点CD
     * @return The value of the column 'RLYBSCD'. (NullAllowed)
     */
    public String getRlybscd() {
        return _rlybscd;
    }

    /**
     * [set] RLYBSCD: {varchar(255)} <br>
     * 中継拠点CD
     * @param rlybscd The value of the column 'RLYBSCD'. (NullAllowed)
     */
    public void setRlybscd(String rlybscd) {
        __modifiedProperties.add("rlybscd");
        this._rlybscd = rlybscd;
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
     * [get] PSTNID: {varchar(255)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (NullAllowed)
     */
    public String getPstnid() {
        return _pstnid;
    }

    /**
     * [set] PSTNID: {varchar(255)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (NullAllowed)
     */
    public void setPstnid(String pstnid) {
        __modifiedProperties.add("pstnid");
        this._pstnid = pstnid;
    }

    /**
     * [get] DLVRNK: {varchar(255)} <br>
     * 配達順位
     * @return The value of the column 'DLVRNK'. (NullAllowed)
     */
    public String getDlvrnk() {
        return _dlvrnk;
    }

    /**
     * [set] DLVRNK: {varchar(255)} <br>
     * 配達順位
     * @param dlvrnk The value of the column 'DLVRNK'. (NullAllowed)
     */
    public void setDlvrnk(String dlvrnk) {
        __modifiedProperties.add("dlvrnk");
        this._dlvrnk = dlvrnk;
    }

    /**
     * [get] LMPDLVNO: {varchar(255)} <br>
     * 一括配達番号
     * @return The value of the column 'LMPDLVNO'. (NullAllowed)
     */
    public String getLmpdlvno() {
        return _lmpdlvno;
    }

    /**
     * [set] LMPDLVNO: {varchar(255)} <br>
     * 一括配達番号
     * @param lmpdlvno The value of the column 'LMPDLVNO'. (NullAllowed)
     */
    public void setLmpdlvno(String lmpdlvno) {
        __modifiedProperties.add("lmpdlvno");
        this._lmpdlvno = lmpdlvno;
    }

    /**
     * [get] DIVMTD: {varchar(255)} <br>
     * 仕分方式
     * @return The value of the column 'DIVMTD'. (NullAllowed)
     */
    public String getDivmtd() {
        return _divmtd;
    }

    /**
     * [set] DIVMTD: {varchar(255)} <br>
     * 仕分方式
     * @param divmtd The value of the column 'DIVMTD'. (NullAllowed)
     */
    public void setDivmtd(String divmtd) {
        __modifiedProperties.add("divmtd");
        this._divmtd = divmtd;
    }

    /**
     * [get] HDVID: {varchar(255)} <br>
     * 宅配区分
     * @return The value of the column 'HDVID'. (NullAllowed)
     */
    public String getHdvid() {
        return _hdvid;
    }

    /**
     * [set] HDVID: {varchar(255)} <br>
     * 宅配区分
     * @param hdvid The value of the column 'HDVID'. (NullAllowed)
     */
    public void setHdvid(String hdvid) {
        __modifiedProperties.add("hdvid");
        this._hdvid = hdvid;
    }

    /**
     * [get] NAME1: {varchar(255)} <br>
     * お得意様名称
     * @return The value of the column 'NAME1'. (NullAllowed)
     */
    public String getName1() {
        return _name1;
    }

    /**
     * [set] NAME1: {varchar(255)} <br>
     * お得意様名称
     * @param name1 The value of the column 'NAME1'. (NullAllowed)
     */
    public void setName1(String name1) {
        __modifiedProperties.add("name1");
        this._name1 = name1;
    }

    /**
     * [get] ZREGPRCA: {varchar(255)} <br>
     * 定価代金
     * @return The value of the column 'ZREGPRCA'. (NullAllowed)
     */
    public String getZregprca() {
        return _zregprca;
    }

    /**
     * [set] ZREGPRCA: {varchar(255)} <br>
     * 定価代金
     * @param zregprca The value of the column 'ZREGPRCA'. (NullAllowed)
     */
    public void setZregprca(String zregprca) {
        __modifiedProperties.add("zregprca");
        this._zregprca = zregprca;
    }

    /**
     * [get] ZREGPRCC: {varchar(255)} <br>
     * 販売代金
     * @return The value of the column 'ZREGPRCC'. (NullAllowed)
     */
    public String getZregprcc() {
        return _zregprcc;
    }

    /**
     * [set] ZREGPRCC: {varchar(255)} <br>
     * 販売代金
     * @param zregprcc The value of the column 'ZREGPRCC'. (NullAllowed)
     */
    public void setZregprcc(String zregprcc) {
        __modifiedProperties.add("zregprcc");
        this._zregprcc = zregprcc;
    }

    /**
     * [get] ZZSALTAX: {varchar(255)} <br>
     * 消費税
     * @return The value of the column 'ZZSALTAX'. (NullAllowed)
     */
    public String getZzsaltax() {
        return _zzsaltax;
    }

    /**
     * [set] ZZSALTAX: {varchar(255)} <br>
     * 消費税
     * @param zzsaltax The value of the column 'ZZSALTAX'. (NullAllowed)
     */
    public void setZzsaltax(String zzsaltax) {
        __modifiedProperties.add("zzsaltax");
        this._zzsaltax = zzsaltax;
    }

    /**
     * [get] ZZGODFPC: {varchar(255)} <br>
     * 商品分定価代金
     * @return The value of the column 'ZZGODFPC'. (NullAllowed)
     */
    public String getZzgodfpc() {
        return _zzgodfpc;
    }

    /**
     * [set] ZZGODFPC: {varchar(255)} <br>
     * 商品分定価代金
     * @param zzgodfpc The value of the column 'ZZGODFPC'. (NullAllowed)
     */
    public void setZzgodfpc(String zzgodfpc) {
        __modifiedProperties.add("zzgodfpc");
        this._zzgodfpc = zzgodfpc;
    }

    /**
     * [get] ZZGODSPC: {varchar(255)} <br>
     * 商品分販売代金
     * @return The value of the column 'ZZGODSPC'. (NullAllowed)
     */
    public String getZzgodspc() {
        return _zzgodspc;
    }

    /**
     * [set] ZZGODSPC: {varchar(255)} <br>
     * 商品分販売代金
     * @param zzgodspc The value of the column 'ZZGODSPC'. (NullAllowed)
     */
    public void setZzgodspc(String zzgodspc) {
        __modifiedProperties.add("zzgodspc");
        this._zzgodspc = zzgodspc;
    }

    /**
     * [get] ZZGODCTX: {varchar(255)} <br>
     * 商品分消費税
     * @return The value of the column 'ZZGODCTX'. (NullAllowed)
     */
    public String getZzgodctx() {
        return _zzgodctx;
    }

    /**
     * [set] ZZGODCTX: {varchar(255)} <br>
     * 商品分消費税
     * @param zzgodctx The value of the column 'ZZGODCTX'. (NullAllowed)
     */
    public void setZzgodctx(String zzgodctx) {
        __modifiedProperties.add("zzgodctx");
        this._zzgodctx = zzgodctx;
    }

    /**
     * [get] LOGISTICSCD: {varchar(255)} <br>
     * 会社CD
     * @return The value of the column 'LOGISTICSCD'. (NullAllowed)
     */
    public String getLogisticscd() {
        return _logisticscd;
    }

    /**
     * [set] LOGISTICSCD: {varchar(255)} <br>
     * 会社CD
     * @param logisticscd The value of the column 'LOGISTICSCD'. (NullAllowed)
     */
    public void setLogisticscd(String logisticscd) {
        __modifiedProperties.add("logisticscd");
        this._logisticscd = logisticscd;
    }

    /**
     * [get] SLEDIV: {varchar(255)} <br>
     * 販売区分
     * @return The value of the column 'SLEDIV'. (NullAllowed)
     */
    public String getSlediv() {
        return _slediv;
    }

    /**
     * [set] SLEDIV: {varchar(255)} <br>
     * 販売区分
     * @param slediv The value of the column 'SLEDIV'. (NullAllowed)
     */
    public void setSlediv(String slediv) {
        __modifiedProperties.add("slediv");
        this._slediv = slediv;
    }

    /**
     * [get] HVRTRSN: {varchar(255)} <br>
     * 持戻理由
     * @return The value of the column 'HVRTRSN'. (NullAllowed)
     */
    public String getHvrtrsn() {
        return _hvrtrsn;
    }

    /**
     * [set] HVRTRSN: {varchar(255)} <br>
     * 持戻理由
     * @param hvrtrsn The value of the column 'HVRTRSN'. (NullAllowed)
     */
    public void setHvrtrsn(String hvrtrsn) {
        __modifiedProperties.add("hvrtrsn");
        this._hvrtrsn = hvrtrsn;
    }

    /**
     * [get] ZZVBELNB: {varchar(255)} <br>
     * 持戻入庫予定日
     * @return The value of the column 'ZZVBELNB'. (NullAllowed)
     */
    public String getZzvbelnb() {
        return _zzvbelnb;
    }

    /**
     * [set] ZZVBELNB: {varchar(255)} <br>
     * 持戻入庫予定日
     * @param zzvbelnb The value of the column 'ZZVBELNB'. (NullAllowed)
     */
    public void setZzvbelnb(String zzvbelnb) {
        __modifiedProperties.add("zzvbelnb");
        this._zzvbelnb = zzvbelnb;
    }

    /**
     * [get] CNGPRTSLPNO: {varchar(255)} <br>
     * 取替相手伝票番号
     * @return The value of the column 'CNGPRTSLPNO'. (NullAllowed)
     */
    public String getCngprtslpno() {
        return _cngprtslpno;
    }

    /**
     * [set] CNGPRTSLPNO: {varchar(255)} <br>
     * 取替相手伝票番号
     * @param cngprtslpno The value of the column 'CNGPRTSLPNO'. (NullAllowed)
     */
    public void setCngprtslpno(String cngprtslpno) {
        __modifiedProperties.add("cngprtslpno");
        this._cngprtslpno = cngprtslpno;
    }

    /**
     * [get] TRNSCTNDIV: {varchar(255)} <br>
     * 処理区分
     * @return The value of the column 'TRNSCTNDIV'. (NullAllowed)
     */
    public String getTrnsctndiv() {
        return _trnsctndiv;
    }

    /**
     * [set] TRNSCTNDIV: {varchar(255)} <br>
     * 処理区分
     * @param trnsctndiv The value of the column 'TRNSCTNDIV'. (NullAllowed)
     */
    public void setTrnsctndiv(String trnsctndiv) {
        __modifiedProperties.add("trnsctndiv");
        this._trnsctndiv = trnsctndiv;
    }

    /**
     * [get] EOSORDAFTFLG: {varchar(255)} <br>
     * ＥＯＳさしず後フラグ
     * @return The value of the column 'EOSORDAFTFLG'. (NullAllowed)
     */
    public String getEosordaftflg() {
        return _eosordaftflg;
    }

    /**
     * [set] EOSORDAFTFLG: {varchar(255)} <br>
     * ＥＯＳさしず後フラグ
     * @param eosordaftflg The value of the column 'EOSORDAFTFLG'. (NullAllowed)
     */
    public void setEosordaftflg(String eosordaftflg) {
        __modifiedProperties.add("eosordaftflg");
        this._eosordaftflg = eosordaftflg;
    }

    /**
     * [get] EOSSLPNO: {varchar(255)} <br>
     * 相手（ＥＯＳ）伝票番号
     * @return The value of the column 'EOSSLPNO'. (NullAllowed)
     */
    public String getEosslpno() {
        return _eosslpno;
    }

    /**
     * [set] EOSSLPNO: {varchar(255)} <br>
     * 相手（ＥＯＳ）伝票番号
     * @param eosslpno The value of the column 'EOSSLPNO'. (NullAllowed)
     */
    public void setEosslpno(String eosslpno) {
        __modifiedProperties.add("eosslpno");
        this._eosslpno = eosslpno;
    }

    /**
     * [get] HDRDBXDIV: {varchar(255)} <br>
     * 100箱拒否区分
     * @return The value of the column 'HDRDBXDIV'. (NullAllowed)
     */
    public String getHdrdbxdiv() {
        return _hdrdbxdiv;
    }

    /**
     * [set] HDRDBXDIV: {varchar(255)} <br>
     * 100箱拒否区分
     * @param hdrdbxdiv The value of the column 'HDRDBXDIV'. (NullAllowed)
     */
    public void setHdrdbxdiv(String hdrdbxdiv) {
        __modifiedProperties.add("hdrdbxdiv");
        this._hdrdbxdiv = hdrdbxdiv;
    }

    /**
     * [get] INOTRFSLDIV: {varchar(255)} <br>
     * 内外仕分拒否区分
     * @return The value of the column 'INOTRFSLDIV'. (NullAllowed)
     */
    public String getInotrfsldiv() {
        return _inotrfsldiv;
    }

    /**
     * [set] INOTRFSLDIV: {varchar(255)} <br>
     * 内外仕分拒否区分
     * @param inotrfsldiv The value of the column 'INOTRFSLDIV'. (NullAllowed)
     */
    public void setInotrfsldiv(String inotrfsldiv) {
        __modifiedProperties.add("inotrfsldiv");
        this._inotrfsldiv = inotrfsldiv;
    }

    /**
     * [get] BXMNTRFSLDIV: {varchar(255)} <br>
     * 箱跨り拒否区分
     * @return The value of the column 'BXMNTRFSLDIV'. (NullAllowed)
     */
    public String getBxmntrfsldiv() {
        return _bxmntrfsldiv;
    }

    /**
     * [set] BXMNTRFSLDIV: {varchar(255)} <br>
     * 箱跨り拒否区分
     * @param bxmntrfsldiv The value of the column 'BXMNTRFSLDIV'. (NullAllowed)
     */
    public void setBxmntrfsldiv(String bxmntrfsldiv) {
        __modifiedProperties.add("bxmntrfsldiv");
        this._bxmntrfsldiv = bxmntrfsldiv;
    }

    /**
     * [get] SLPMRGTMG: {varchar(255)} <br>
     * 帳票マージタイミング
     * @return The value of the column 'SLPMRGTMG'. (NullAllowed)
     */
    public String getSlpmrgtmg() {
        return _slpmrgtmg;
    }

    /**
     * [set] SLPMRGTMG: {varchar(255)} <br>
     * 帳票マージタイミング
     * @param slpmrgtmg The value of the column 'SLPMRGTMG'. (NullAllowed)
     */
    public void setSlpmrgtmg(String slpmrgtmg) {
        __modifiedProperties.add("slpmrgtmg");
        this._slpmrgtmg = slpmrgtmg;
    }

    /**
     * [get] ZZBLOTDT: {varchar(255)} <br>
     * 帳票出力年月日
     * @return The value of the column 'ZZBLOTDT'. (NullAllowed)
     */
    public String getZzblotdt() {
        return _zzblotdt;
    }

    /**
     * [set] ZZBLOTDT: {varchar(255)} <br>
     * 帳票出力年月日
     * @param zzblotdt The value of the column 'ZZBLOTDT'. (NullAllowed)
     */
    public void setZzblotdt(String zzblotdt) {
        __modifiedProperties.add("zzblotdt");
        this._zzblotdt = zzblotdt;
    }

    /**
     * [get] CGGDID: {varchar(255)} <br>
     * たばこ商品区分
     * @return The value of the column 'CGGDID'. (NullAllowed)
     */
    public String getCggdid() {
        return _cggdid;
    }

    /**
     * [set] CGGDID: {varchar(255)} <br>
     * たばこ商品区分
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed)
     */
    public void setCggdid(String cggdid) {
        __modifiedProperties.add("cggdid");
        this._cggdid = cggdid;
    }

    /**
     * [get] MATNR: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'MATNR'. (NullAllowed)
     */
    public String getMatnr() {
        return _matnr;
    }

    /**
     * [set] MATNR: {varchar(255)} <br>
     * 銘柄CD
     * @param matnr The value of the column 'MATNR'. (NullAllowed)
     */
    public void setMatnr(String matnr) {
        __modifiedProperties.add("matnr");
        this._matnr = matnr;
    }

    /**
     * [get] KWMENG: {varchar(255)} <br>
     * 販売数量
     * @return The value of the column 'KWMENG'. (NullAllowed)
     */
    public String getKwmeng() {
        return _kwmeng;
    }

    /**
     * [set] KWMENG: {varchar(255)} <br>
     * 販売数量
     * @param kwmeng The value of the column 'KWMENG'. (NullAllowed)
     */
    public void setKwmeng(String kwmeng) {
        __modifiedProperties.add("kwmeng");
        this._kwmeng = kwmeng;
    }

    /**
     * [get] MVGR1: {varchar(255)} <br>
     * 状態CD
     * @return The value of the column 'MVGR1'. (NullAllowed)
     */
    public String getMvgr1() {
        return _mvgr1;
    }

    /**
     * [set] MVGR1: {varchar(255)} <br>
     * 状態CD
     * @param mvgr1 The value of the column 'MVGR1'. (NullAllowed)
     */
    public void setMvgr1(String mvgr1) {
        __modifiedProperties.add("mvgr1");
        this._mvgr1 = mvgr1;
    }

    /**
     * [get] MVGR4: {varchar(255)} <br>
     * 不足本数
     * @return The value of the column 'MVGR4'. (NullAllowed)
     */
    public String getMvgr4() {
        return _mvgr4;
    }

    /**
     * [set] MVGR4: {varchar(255)} <br>
     * 不足本数
     * @param mvgr4 The value of the column 'MVGR4'. (NullAllowed)
     */
    public void setMvgr4(String mvgr4) {
        __modifiedProperties.add("mvgr4");
        this._mvgr4 = mvgr4;
    }

    /**
     * [get] KZWI3: {varchar(255)} <br>
     * 定価代金
     * @return The value of the column 'KZWI3'. (NullAllowed)
     */
    public String getKzwi3() {
        return _kzwi3;
    }

    /**
     * [set] KZWI3: {varchar(255)} <br>
     * 定価代金
     * @param kzwi3 The value of the column 'KZWI3'. (NullAllowed)
     */
    public void setKzwi3(String kzwi3) {
        __modifiedProperties.add("kzwi3");
        this._kzwi3 = kzwi3;
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
