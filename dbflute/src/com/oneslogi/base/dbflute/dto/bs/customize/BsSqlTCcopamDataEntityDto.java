package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlTCcopamDataEntity. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TDRELAYID, STCD, SNNO1, SNNO2, SNNO3, SNYMD, ARVYMD, PLNCARKND, AMCARKND, TRANNM, CARNO, GNLPLTQA, OTPLTQA, SUMPLTQA, QTY, TOTALNUM, SELNO1, SELNO2, SELNO3
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
public abstract class BsSqlTCcopamDataEntityDto implements Serializable {

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
    /** TDRELAYID: {char(1)} */
    @JsonKey
    protected String _tdrelayid;

    /** STCD: {varchar(30)} */
    @JsonKey
    protected String _stcd;

    /** SNNO1: {varchar(30)} */
    @JsonKey
    protected String _snno1;

    /** SNNO2: {varchar(30)} */
    @JsonKey
    protected String _snno2;

    /** SNNO3: {varchar(30)} */
    @JsonKey
    protected String _snno3;

    /** SNYMD: {varchar(8)} */
    @JsonKey
    protected String _snymd;

    /** ARVYMD: {varchar(8)} */
    @JsonKey
    protected String _arvymd;

    /** PLNCARKND: {varchar(255)} */
    @JsonKey
    protected String _plncarknd;

    /** AMCARKND: {varchar(255)} */
    @JsonKey
    protected String _amcarknd;

    /** TRANNM: {varchar(60)} */
    @JsonKey
    protected String _trannm;

    /** CARNO: {varchar(30)} */
    @JsonKey
    protected String _carno;

    /** GNLPLTQA: {bigint(19)} */
    @JsonKey
    protected Long _gnlpltqa;

    /** OTPLTQA: {bigint(19)} */
    @JsonKey
    protected Long _otpltqa;

    /** SUMPLTQA: {bigint(19)} */
    @JsonKey
    protected Long _sumpltqa;

    /** QTY: {bigint(19)} */
    @JsonKey
    protected Long _qty;

    /** TOTALNUM: {bigint(19)} */
    @JsonKey
    protected Long _totalnum;

    /** SELNO1: {varchar(30)} */
    @JsonKey
    protected String _selno1;

    /** SELNO2: {varchar(30)} */
    @JsonKey
    protected String _selno2;

    /** SELNO3: {varchar(30)} */
    @JsonKey
    protected String _selno3;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlTCcopamDataEntityDto() {
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
        if (other == null || !(other instanceof BsSqlTCcopamDataEntityDto)) { return false; }
        final BsSqlTCcopamDataEntityDto otherEntity = (BsSqlTCcopamDataEntityDto)other;
        if (!helpComparingValue(getTdrelayid(), otherEntity.getTdrelayid())) { return false; }
        if (!helpComparingValue(getStcd(), otherEntity.getStcd())) { return false; }
        if (!helpComparingValue(getSnno1(), otherEntity.getSnno1())) { return false; }
        if (!helpComparingValue(getSnno2(), otherEntity.getSnno2())) { return false; }
        if (!helpComparingValue(getSnno3(), otherEntity.getSnno3())) { return false; }
        if (!helpComparingValue(getSnymd(), otherEntity.getSnymd())) { return false; }
        if (!helpComparingValue(getArvymd(), otherEntity.getArvymd())) { return false; }
        if (!helpComparingValue(getPlncarknd(), otherEntity.getPlncarknd())) { return false; }
        if (!helpComparingValue(getAmcarknd(), otherEntity.getAmcarknd())) { return false; }
        if (!helpComparingValue(getTrannm(), otherEntity.getTrannm())) { return false; }
        if (!helpComparingValue(getCarno(), otherEntity.getCarno())) { return false; }
        if (!helpComparingValue(getGnlpltqa(), otherEntity.getGnlpltqa())) { return false; }
        if (!helpComparingValue(getOtpltqa(), otherEntity.getOtpltqa())) { return false; }
        if (!helpComparingValue(getSumpltqa(), otherEntity.getSumpltqa())) { return false; }
        if (!helpComparingValue(getQty(), otherEntity.getQty())) { return false; }
        if (!helpComparingValue(getTotalnum(), otherEntity.getTotalnum())) { return false; }
        if (!helpComparingValue(getSelno1(), otherEntity.getSelno1())) { return false; }
        if (!helpComparingValue(getSelno2(), otherEntity.getSelno2())) { return false; }
        if (!helpComparingValue(getSelno3(), otherEntity.getSelno3())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlTCcopamDataEntity");
        result = xCH(result, getTdrelayid());
        result = xCH(result, getStcd());
        result = xCH(result, getSnno1());
        result = xCH(result, getSnno2());
        result = xCH(result, getSnno3());
        result = xCH(result, getSnymd());
        result = xCH(result, getArvymd());
        result = xCH(result, getPlncarknd());
        result = xCH(result, getAmcarknd());
        result = xCH(result, getTrannm());
        result = xCH(result, getCarno());
        result = xCH(result, getGnlpltqa());
        result = xCH(result, getOtpltqa());
        result = xCH(result, getSumpltqa());
        result = xCH(result, getQty());
        result = xCH(result, getTotalnum());
        result = xCH(result, getSelno1());
        result = xCH(result, getSelno2());
        result = xCH(result, getSelno3());
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
        sb.append(c).append(getTdrelayid());
        sb.append(c).append(getStcd());
        sb.append(c).append(getSnno1());
        sb.append(c).append(getSnno2());
        sb.append(c).append(getSnno3());
        sb.append(c).append(getSnymd());
        sb.append(c).append(getArvymd());
        sb.append(c).append(getPlncarknd());
        sb.append(c).append(getAmcarknd());
        sb.append(c).append(getTrannm());
        sb.append(c).append(getCarno());
        sb.append(c).append(getGnlpltqa());
        sb.append(c).append(getOtpltqa());
        sb.append(c).append(getSumpltqa());
        sb.append(c).append(getQty());
        sb.append(c).append(getTotalnum());
        sb.append(c).append(getSelno1());
        sb.append(c).append(getSelno2());
        sb.append(c).append(getSelno3());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TDRELAYID: {char(1)} <br>
     * @return The value of the column 'TDRELAYID'. (NullAllowed)
     */
    public String getTdrelayid() {
        return _tdrelayid;
    }

    /**
     * [set] TDRELAYID: {char(1)} <br>
     * @param tdrelayid The value of the column 'TDRELAYID'. (NullAllowed)
     */
    public void setTdrelayid(String tdrelayid) {
        __modifiedProperties.add("tdrelayid");
        this._tdrelayid = tdrelayid;
    }

    /**
     * [get] STCD: {varchar(30)} <br>
     * @return The value of the column 'STCD'. (NullAllowed)
     */
    public String getStcd() {
        return _stcd;
    }

    /**
     * [set] STCD: {varchar(30)} <br>
     * @param stcd The value of the column 'STCD'. (NullAllowed)
     */
    public void setStcd(String stcd) {
        __modifiedProperties.add("stcd");
        this._stcd = stcd;
    }

    /**
     * [get] SNNO1: {varchar(30)} <br>
     * @return The value of the column 'SNNO1'. (NullAllowed)
     */
    public String getSnno1() {
        return _snno1;
    }

    /**
     * [set] SNNO1: {varchar(30)} <br>
     * @param snno1 The value of the column 'SNNO1'. (NullAllowed)
     */
    public void setSnno1(String snno1) {
        __modifiedProperties.add("snno1");
        this._snno1 = snno1;
    }

    /**
     * [get] SNNO2: {varchar(30)} <br>
     * @return The value of the column 'SNNO2'. (NullAllowed)
     */
    public String getSnno2() {
        return _snno2;
    }

    /**
     * [set] SNNO2: {varchar(30)} <br>
     * @param snno2 The value of the column 'SNNO2'. (NullAllowed)
     */
    public void setSnno2(String snno2) {
        __modifiedProperties.add("snno2");
        this._snno2 = snno2;
    }

    /**
     * [get] SNNO3: {varchar(30)} <br>
     * @return The value of the column 'SNNO3'. (NullAllowed)
     */
    public String getSnno3() {
        return _snno3;
    }

    /**
     * [set] SNNO3: {varchar(30)} <br>
     * @param snno3 The value of the column 'SNNO3'. (NullAllowed)
     */
    public void setSnno3(String snno3) {
        __modifiedProperties.add("snno3");
        this._snno3 = snno3;
    }

    /**
     * [get] SNYMD: {varchar(8)} <br>
     * @return The value of the column 'SNYMD'. (NullAllowed)
     */
    public String getSnymd() {
        return _snymd;
    }

    /**
     * [set] SNYMD: {varchar(8)} <br>
     * @param snymd The value of the column 'SNYMD'. (NullAllowed)
     */
    public void setSnymd(String snymd) {
        __modifiedProperties.add("snymd");
        this._snymd = snymd;
    }

    /**
     * [get] ARVYMD: {varchar(8)} <br>
     * @return The value of the column 'ARVYMD'. (NullAllowed)
     */
    public String getArvymd() {
        return _arvymd;
    }

    /**
     * [set] ARVYMD: {varchar(8)} <br>
     * @param arvymd The value of the column 'ARVYMD'. (NullAllowed)
     */
    public void setArvymd(String arvymd) {
        __modifiedProperties.add("arvymd");
        this._arvymd = arvymd;
    }

    /**
     * [get] PLNCARKND: {varchar(255)} <br>
     * @return The value of the column 'PLNCARKND'. (NullAllowed)
     */
    public String getPlncarknd() {
        return _plncarknd;
    }

    /**
     * [set] PLNCARKND: {varchar(255)} <br>
     * @param plncarknd The value of the column 'PLNCARKND'. (NullAllowed)
     */
    public void setPlncarknd(String plncarknd) {
        __modifiedProperties.add("plncarknd");
        this._plncarknd = plncarknd;
    }

    /**
     * [get] AMCARKND: {varchar(255)} <br>
     * @return The value of the column 'AMCARKND'. (NullAllowed)
     */
    public String getAmcarknd() {
        return _amcarknd;
    }

    /**
     * [set] AMCARKND: {varchar(255)} <br>
     * @param amcarknd The value of the column 'AMCARKND'. (NullAllowed)
     */
    public void setAmcarknd(String amcarknd) {
        __modifiedProperties.add("amcarknd");
        this._amcarknd = amcarknd;
    }

    /**
     * [get] TRANNM: {varchar(60)} <br>
     * @return The value of the column 'TRANNM'. (NullAllowed)
     */
    public String getTrannm() {
        return _trannm;
    }

    /**
     * [set] TRANNM: {varchar(60)} <br>
     * @param trannm The value of the column 'TRANNM'. (NullAllowed)
     */
    public void setTrannm(String trannm) {
        __modifiedProperties.add("trannm");
        this._trannm = trannm;
    }

    /**
     * [get] CARNO: {varchar(30)} <br>
     * @return The value of the column 'CARNO'. (NullAllowed)
     */
    public String getCarno() {
        return _carno;
    }

    /**
     * [set] CARNO: {varchar(30)} <br>
     * @param carno The value of the column 'CARNO'. (NullAllowed)
     */
    public void setCarno(String carno) {
        __modifiedProperties.add("carno");
        this._carno = carno;
    }

    /**
     * [get] GNLPLTQA: {bigint(19)} <br>
     * @return The value of the column 'GNLPLTQA'. (NullAllowed)
     */
    public Long getGnlpltqa() {
        return _gnlpltqa;
    }

    /**
     * [set] GNLPLTQA: {bigint(19)} <br>
     * @param gnlpltqa The value of the column 'GNLPLTQA'. (NullAllowed)
     */
    public void setGnlpltqa(Long gnlpltqa) {
        __modifiedProperties.add("gnlpltqa");
        this._gnlpltqa = gnlpltqa;
    }

    /**
     * [get] OTPLTQA: {bigint(19)} <br>
     * @return The value of the column 'OTPLTQA'. (NullAllowed)
     */
    public Long getOtpltqa() {
        return _otpltqa;
    }

    /**
     * [set] OTPLTQA: {bigint(19)} <br>
     * @param otpltqa The value of the column 'OTPLTQA'. (NullAllowed)
     */
    public void setOtpltqa(Long otpltqa) {
        __modifiedProperties.add("otpltqa");
        this._otpltqa = otpltqa;
    }

    /**
     * [get] SUMPLTQA: {bigint(19)} <br>
     * @return The value of the column 'SUMPLTQA'. (NullAllowed)
     */
    public Long getSumpltqa() {
        return _sumpltqa;
    }

    /**
     * [set] SUMPLTQA: {bigint(19)} <br>
     * @param sumpltqa The value of the column 'SUMPLTQA'. (NullAllowed)
     */
    public void setSumpltqa(Long sumpltqa) {
        __modifiedProperties.add("sumpltqa");
        this._sumpltqa = sumpltqa;
    }

    /**
     * [get] QTY: {bigint(19)} <br>
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public Long getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {bigint(19)} <br>
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(Long qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
    }

    /**
     * [get] TOTALNUM: {bigint(19)} <br>
     * @return The value of the column 'TOTALNUM'. (NullAllowed)
     */
    public Long getTotalnum() {
        return _totalnum;
    }

    /**
     * [set] TOTALNUM: {bigint(19)} <br>
     * @param totalnum The value of the column 'TOTALNUM'. (NullAllowed)
     */
    public void setTotalnum(Long totalnum) {
        __modifiedProperties.add("totalnum");
        this._totalnum = totalnum;
    }

    /**
     * [get] SELNO1: {varchar(30)} <br>
     * @return The value of the column 'SELNO1'. (NullAllowed)
     */
    public String getSelno1() {
        return _selno1;
    }

    /**
     * [set] SELNO1: {varchar(30)} <br>
     * @param selno1 The value of the column 'SELNO1'. (NullAllowed)
     */
    public void setSelno1(String selno1) {
        __modifiedProperties.add("selno1");
        this._selno1 = selno1;
    }

    /**
     * [get] SELNO2: {varchar(30)} <br>
     * @return The value of the column 'SELNO2'. (NullAllowed)
     */
    public String getSelno2() {
        return _selno2;
    }

    /**
     * [set] SELNO2: {varchar(30)} <br>
     * @param selno2 The value of the column 'SELNO2'. (NullAllowed)
     */
    public void setSelno2(String selno2) {
        __modifiedProperties.add("selno2");
        this._selno2 = selno2;
    }

    /**
     * [get] SELNO3: {varchar(30)} <br>
     * @return The value of the column 'SELNO3'. (NullAllowed)
     */
    public String getSelno3() {
        return _selno3;
    }

    /**
     * [set] SELNO3: {varchar(30)} <br>
     * @param selno3 The value of the column 'SELNO3'. (NullAllowed)
     */
    public void setSelno3(String selno3) {
        __modifiedProperties.add("selno3");
        this._selno3 = selno3;
    }

}
