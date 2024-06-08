package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_CLCKINV as TABLE. <br>
 * 仕分用論理在庫
 * <pre>
 * [primary-key]
 *     CLCKINV_ID
 *
 * [column]
 *     CLCKINV_ID, CENTER_ID, LOCATION_ID, PRESRCBQA, PRESRCTQA, LCKCBIVQ, LCKCTIVQ, DSCBQA, DSCTQA, TOSPLCBQA, TOSPLCTQA, PRESPLCBQA, PRESPLCTQA, TSTINVCB, TSTINVCT, TSPLCB, TSPLCT, TPRESPLCB, TPRESPLCT, TINVMDTCB, TINVMDTCT, CSPLNUN, UPFG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLCKINV_ID
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
public abstract class BsTClckinvDto implements Serializable {

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
    /** CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _clckinvId;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _locationId;

    /** PRESRCBQA: {bigint(19)} */
    @JsonKey
    protected Long _presrcbqa;

    /** PRESRCTQA: {bigint(19)} */
    @JsonKey
    protected Long _presrctqa;

    /** LCKCBIVQ: {bigint(19)} */
    @JsonKey
    protected Long _lckcbivq;

    /** LCKCTIVQ: {bigint(19)} */
    @JsonKey
    protected Long _lckctivq;

    /** DSCBQA: {bigint(19)} */
    @JsonKey
    protected Long _dscbqa;

    /** DSCTQA: {bigint(19)} */
    @JsonKey
    protected Long _dsctqa;

    /** TOSPLCBQA: {bigint(19)} */
    @JsonKey
    protected Long _tosplcbqa;

    /** TOSPLCTQA: {bigint(19)} */
    @JsonKey
    protected Long _tosplctqa;

    /** PRESPLCBQA: {bigint(19)} */
    @JsonKey
    protected Long _presplcbqa;

    /** PRESPLCTQA: {bigint(19)} */
    @JsonKey
    protected Long _presplctqa;

    /** TSTINVCB: {bigint(19)} */
    @JsonKey
    protected Long _tstinvcb;

    /** TSTINVCT: {bigint(19)} */
    @JsonKey
    protected Long _tstinvct;

    /** TSPLCB: {bigint(19)} */
    @JsonKey
    protected Long _tsplcb;

    /** TSPLCT: {bigint(19)} */
    @JsonKey
    protected Long _tsplct;

    /** TPRESPLCB: {bigint(19)} */
    @JsonKey
    protected Long _tpresplcb;

    /** TPRESPLCT: {bigint(19)} */
    @JsonKey
    protected Long _tpresplct;

    /** TINVMDTCB: {bigint(19)} */
    @JsonKey
    protected Long _tinvmdtcb;

    /** TINVMDTCT: {bigint(19)} */
    @JsonKey
    protected Long _tinvmdtct;

    /** CSPLNUN: {bigint(19)} */
    @JsonKey
    protected Long _csplnun;

    /** UPFG: {NotNull, varchar(30), default=[0]} */
    @JsonKey
    protected String _upfg;

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
    public BsTClckinvDto() {
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
        if (other == null || !(other instanceof BsTClckinvDto)) { return false; }
        final BsTClckinvDto otherEntity = (BsTClckinvDto)other;
        if (!helpComparingValue(getClckinvId(), otherEntity.getClckinvId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_CLCKINV");
        result = xCH(result, getClckinvId());
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
        sb.append(c).append(getClckinvId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getPresrcbqa());
        sb.append(c).append(getPresrctqa());
        sb.append(c).append(getLckcbivq());
        sb.append(c).append(getLckctivq());
        sb.append(c).append(getDscbqa());
        sb.append(c).append(getDsctqa());
        sb.append(c).append(getTosplcbqa());
        sb.append(c).append(getTosplctqa());
        sb.append(c).append(getPresplcbqa());
        sb.append(c).append(getPresplctqa());
        sb.append(c).append(getTstinvcb());
        sb.append(c).append(getTstinvct());
        sb.append(c).append(getTsplcb());
        sb.append(c).append(getTsplct());
        sb.append(c).append(getTpresplcb());
        sb.append(c).append(getTpresplct());
        sb.append(c).append(getTinvmdtcb());
        sb.append(c).append(getTinvmdtct());
        sb.append(c).append(getCsplnun());
        sb.append(c).append(getUpfg());
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
     * [get] CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分用論理在庫ID
     * @return The value of the column 'CLCKINV_ID'. (NullAllowed)
     */
    public Long getClckinvId() {
        return _clckinvId;
    }

    /**
     * [set] CLCKINV_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 仕分用論理在庫ID
     * @param clckinvId The value of the column 'CLCKINV_ID'. (NullAllowed)
     */
    public void setClckinvId(Long clckinvId) {
        __modifiedProperties.add("clckinvId");
        this._clckinvId = clckinvId;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] PRESRCBQA: {bigint(19)} <br>
     * 仕分前在庫(ダンボール)
     * @return The value of the column 'PRESRCBQA'. (NullAllowed)
     */
    public Long getPresrcbqa() {
        return _presrcbqa;
    }

    /**
     * [set] PRESRCBQA: {bigint(19)} <br>
     * 仕分前在庫(ダンボール)
     * @param presrcbqa The value of the column 'PRESRCBQA'. (NullAllowed)
     */
    public void setPresrcbqa(Long presrcbqa) {
        __modifiedProperties.add("presrcbqa");
        this._presrcbqa = presrcbqa;
    }

    /**
     * [get] PRESRCTQA: {bigint(19)} <br>
     * 仕分前在庫(カートン)
     * @return The value of the column 'PRESRCTQA'. (NullAllowed)
     */
    public Long getPresrctqa() {
        return _presrctqa;
    }

    /**
     * [set] PRESRCTQA: {bigint(19)} <br>
     * 仕分前在庫(カートン)
     * @param presrctqa The value of the column 'PRESRCTQA'. (NullAllowed)
     */
    public void setPresrctqa(Long presrctqa) {
        __modifiedProperties.add("presrctqa");
        this._presrctqa = presrctqa;
    }

    /**
     * [get] LCKCBIVQ: {bigint(19)} <br>
     * 仕分後在庫(ダンボール)
     * @return The value of the column 'LCKCBIVQ'. (NullAllowed)
     */
    public Long getLckcbivq() {
        return _lckcbivq;
    }

    /**
     * [set] LCKCBIVQ: {bigint(19)} <br>
     * 仕分後在庫(ダンボール)
     * @param lckcbivq The value of the column 'LCKCBIVQ'. (NullAllowed)
     */
    public void setLckcbivq(Long lckcbivq) {
        __modifiedProperties.add("lckcbivq");
        this._lckcbivq = lckcbivq;
    }

    /**
     * [get] LCKCTIVQ: {bigint(19)} <br>
     * 仕分後在庫(カートン)
     * @return The value of the column 'LCKCTIVQ'. (NullAllowed)
     */
    public Long getLckctivq() {
        return _lckctivq;
    }

    /**
     * [set] LCKCTIVQ: {bigint(19)} <br>
     * 仕分後在庫(カートン)
     * @param lckctivq The value of the column 'LCKCTIVQ'. (NullAllowed)
     */
    public void setLckctivq(Long lckctivq) {
        __modifiedProperties.add("lckctivq");
        this._lckctivq = lckctivq;
    }

    /**
     * [get] DSCBQA: {bigint(19)} <br>
     * 払い出し(ダンボール)
     * @return The value of the column 'DSCBQA'. (NullAllowed)
     */
    public Long getDscbqa() {
        return _dscbqa;
    }

    /**
     * [set] DSCBQA: {bigint(19)} <br>
     * 払い出し(ダンボール)
     * @param dscbqa The value of the column 'DSCBQA'. (NullAllowed)
     */
    public void setDscbqa(Long dscbqa) {
        __modifiedProperties.add("dscbqa");
        this._dscbqa = dscbqa;
    }

    /**
     * [get] DSCTQA: {bigint(19)} <br>
     * 払い出し(カートン)
     * @return The value of the column 'DSCTQA'. (NullAllowed)
     */
    public Long getDsctqa() {
        return _dsctqa;
    }

    /**
     * [set] DSCTQA: {bigint(19)} <br>
     * 払い出し(カートン)
     * @param dsctqa The value of the column 'DSCTQA'. (NullAllowed)
     */
    public void setDsctqa(Long dsctqa) {
        __modifiedProperties.add("dsctqa");
        this._dsctqa = dsctqa;
    }

    /**
     * [get] TOSPLCBQA: {bigint(19)} <br>
     * 今回当日補充数(ダンボール)
     * @return The value of the column 'TOSPLCBQA'. (NullAllowed)
     */
    public Long getTosplcbqa() {
        return _tosplcbqa;
    }

    /**
     * [set] TOSPLCBQA: {bigint(19)} <br>
     * 今回当日補充数(ダンボール)
     * @param tosplcbqa The value of the column 'TOSPLCBQA'. (NullAllowed)
     */
    public void setTosplcbqa(Long tosplcbqa) {
        __modifiedProperties.add("tosplcbqa");
        this._tosplcbqa = tosplcbqa;
    }

    /**
     * [get] TOSPLCTQA: {bigint(19)} <br>
     * 今回当日補充数(カートン)
     * @return The value of the column 'TOSPLCTQA'. (NullAllowed)
     */
    public Long getTosplctqa() {
        return _tosplctqa;
    }

    /**
     * [set] TOSPLCTQA: {bigint(19)} <br>
     * 今回当日補充数(カートン)
     * @param tosplctqa The value of the column 'TOSPLCTQA'. (NullAllowed)
     */
    public void setTosplctqa(Long tosplctqa) {
        __modifiedProperties.add("tosplctqa");
        this._tosplctqa = tosplctqa;
    }

    /**
     * [get] PRESPLCBQA: {bigint(19)} <br>
     * 今回事前補充数(ダンボール)
     * @return The value of the column 'PRESPLCBQA'. (NullAllowed)
     */
    public Long getPresplcbqa() {
        return _presplcbqa;
    }

    /**
     * [set] PRESPLCBQA: {bigint(19)} <br>
     * 今回事前補充数(ダンボール)
     * @param presplcbqa The value of the column 'PRESPLCBQA'. (NullAllowed)
     */
    public void setPresplcbqa(Long presplcbqa) {
        __modifiedProperties.add("presplcbqa");
        this._presplcbqa = presplcbqa;
    }

    /**
     * [get] PRESPLCTQA: {bigint(19)} <br>
     * 今回事前補充数(カートン)
     * @return The value of the column 'PRESPLCTQA'. (NullAllowed)
     */
    public Long getPresplctqa() {
        return _presplctqa;
    }

    /**
     * [set] PRESPLCTQA: {bigint(19)} <br>
     * 今回事前補充数(カートン)
     * @param presplctqa The value of the column 'PRESPLCTQA'. (NullAllowed)
     */
    public void setPresplctqa(Long presplctqa) {
        __modifiedProperties.add("presplctqa");
        this._presplctqa = presplctqa;
    }

    /**
     * [get] TSTINVCB: {bigint(19)} <br>
     * 当日開始在庫数(ダンボール)
     * @return The value of the column 'TSTINVCB'. (NullAllowed)
     */
    public Long getTstinvcb() {
        return _tstinvcb;
    }

    /**
     * [set] TSTINVCB: {bigint(19)} <br>
     * 当日開始在庫数(ダンボール)
     * @param tstinvcb The value of the column 'TSTINVCB'. (NullAllowed)
     */
    public void setTstinvcb(Long tstinvcb) {
        __modifiedProperties.add("tstinvcb");
        this._tstinvcb = tstinvcb;
    }

    /**
     * [get] TSTINVCT: {bigint(19)} <br>
     * 当日開始在庫数(カートン)
     * @return The value of the column 'TSTINVCT'. (NullAllowed)
     */
    public Long getTstinvct() {
        return _tstinvct;
    }

    /**
     * [set] TSTINVCT: {bigint(19)} <br>
     * 当日開始在庫数(カートン)
     * @param tstinvct The value of the column 'TSTINVCT'. (NullAllowed)
     */
    public void setTstinvct(Long tstinvct) {
        __modifiedProperties.add("tstinvct");
        this._tstinvct = tstinvct;
    }

    /**
     * [get] TSPLCB: {bigint(19)} <br>
     * 当日補充数合計（ダンボール）
     * @return The value of the column 'TSPLCB'. (NullAllowed)
     */
    public Long getTsplcb() {
        return _tsplcb;
    }

    /**
     * [set] TSPLCB: {bigint(19)} <br>
     * 当日補充数合計（ダンボール）
     * @param tsplcb The value of the column 'TSPLCB'. (NullAllowed)
     */
    public void setTsplcb(Long tsplcb) {
        __modifiedProperties.add("tsplcb");
        this._tsplcb = tsplcb;
    }

    /**
     * [get] TSPLCT: {bigint(19)} <br>
     * 当日補充数合計（カートン）
     * @return The value of the column 'TSPLCT'. (NullAllowed)
     */
    public Long getTsplct() {
        return _tsplct;
    }

    /**
     * [set] TSPLCT: {bigint(19)} <br>
     * 当日補充数合計（カートン）
     * @param tsplct The value of the column 'TSPLCT'. (NullAllowed)
     */
    public void setTsplct(Long tsplct) {
        __modifiedProperties.add("tsplct");
        this._tsplct = tsplct;
    }

    /**
     * [get] TPRESPLCB: {bigint(19)} <br>
     * 当日事前補充数合計（ダンボール）
     * @return The value of the column 'TPRESPLCB'. (NullAllowed)
     */
    public Long getTpresplcb() {
        return _tpresplcb;
    }

    /**
     * [set] TPRESPLCB: {bigint(19)} <br>
     * 当日事前補充数合計（ダンボール）
     * @param tpresplcb The value of the column 'TPRESPLCB'. (NullAllowed)
     */
    public void setTpresplcb(Long tpresplcb) {
        __modifiedProperties.add("tpresplcb");
        this._tpresplcb = tpresplcb;
    }

    /**
     * [get] TPRESPLCT: {bigint(19)} <br>
     * 当日事前補充数合計(カートン)
     * @return The value of the column 'TPRESPLCT'. (NullAllowed)
     */
    public Long getTpresplct() {
        return _tpresplct;
    }

    /**
     * [set] TPRESPLCT: {bigint(19)} <br>
     * 当日事前補充数合計(カートン)
     * @param tpresplct The value of the column 'TPRESPLCT'. (NullAllowed)
     */
    public void setTpresplct(Long tpresplct) {
        __modifiedProperties.add("tpresplct");
        this._tpresplct = tpresplct;
    }

    /**
     * [get] TINVMDTCB: {bigint(19)} <br>
     * 当日在庫修正数合計(ダンボール)
     * @return The value of the column 'TINVMDTCB'. (NullAllowed)
     */
    public Long getTinvmdtcb() {
        return _tinvmdtcb;
    }

    /**
     * [set] TINVMDTCB: {bigint(19)} <br>
     * 当日在庫修正数合計(ダンボール)
     * @param tinvmdtcb The value of the column 'TINVMDTCB'. (NullAllowed)
     */
    public void setTinvmdtcb(Long tinvmdtcb) {
        __modifiedProperties.add("tinvmdtcb");
        this._tinvmdtcb = tinvmdtcb;
    }

    /**
     * [get] TINVMDTCT: {bigint(19)} <br>
     * 当日在庫修正数合計(カートン)
     * @return The value of the column 'TINVMDTCT'. (NullAllowed)
     */
    public Long getTinvmdtct() {
        return _tinvmdtct;
    }

    /**
     * [set] TINVMDTCT: {bigint(19)} <br>
     * 当日在庫修正数合計(カートン)
     * @param tinvmdtct The value of the column 'TINVMDTCT'. (NullAllowed)
     */
    public void setTinvmdtct(Long tinvmdtct) {
        __modifiedProperties.add("tinvmdtct");
        this._tinvmdtct = tinvmdtct;
    }

    /**
     * [get] CSPLNUN: {bigint(19)} <br>
     * 今回補充回数
     * @return The value of the column 'CSPLNUN'. (NullAllowed)
     */
    public Long getCsplnun() {
        return _csplnun;
    }

    /**
     * [set] CSPLNUN: {bigint(19)} <br>
     * 今回補充回数
     * @param csplnun The value of the column 'CSPLNUN'. (NullAllowed)
     */
    public void setCsplnun(Long csplnun) {
        __modifiedProperties.add("csplnun");
        this._csplnun = csplnun;
    }

    /**
     * [get] UPFG: {NotNull, varchar(30), default=[0]} <br>
     * 自動割付ロケ不定棚フラグ
     * @return The value of the column 'UPFG'. (NullAllowed)
     */
    public String getUpfg() {
        return _upfg;
    }

    /**
     * [set] UPFG: {NotNull, varchar(30), default=[0]} <br>
     * 自動割付ロケ不定棚フラグ
     * @param upfg The value of the column 'UPFG'. (NullAllowed)
     */
    public void setUpfg(String upfg) {
        __modifiedProperties.add("upfg");
        this._upfg = upfg;
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
