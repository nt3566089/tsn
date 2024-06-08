package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_MH_STOCK as TABLE. <br>
 * 共通下位データ送信テーブル(棚在庫)
 * <pre>
 * [primary-key]
 *     MH_STOCK_ID
 *
 * [column]
 *     MH_STOCK_ID, COMPANY_CD, LINBLK, ZONE_CD, LOCNO, LOCKBN, PRODUCT_CD, TSTINVCB, TSTINVCT, TOSPLCBQA, TOSPLCTQA, TSPLCB, TSPLCT, PRESPLCBQA, PRESPLCTQA, TPRESPLCB, TPRESPLCT, TINVMDTCBS, TINVMDTCB, TINVMDTCTS, TINVMDTCT, CSPLNUN, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MH_STOCK_ID
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
public abstract class BsEMhStockDto implements Serializable {

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
    /** MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _mhStockId;

    /** COMPANY_CD: {varchar(30)} */
    @JsonKey
    protected String _companyCd;

    /** LINBLK: {varchar(30)} */
    @JsonKey
    protected String _linblk;

    /** ZONE_CD: {varchar(30)} */
    @JsonKey
    protected String _zoneCd;

    /** LOCNO: {varchar(255)} */
    @JsonKey
    protected String _locno;

    /** LOCKBN: {char(1)} */
    @JsonKey
    protected String _lockbn;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** TSTINVCB: {bigint(19)} */
    @JsonKey
    protected Long _tstinvcb;

    /** TSTINVCT: {bigint(19)} */
    @JsonKey
    protected Long _tstinvct;

    /** TOSPLCBQA: {bigint(19)} */
    @JsonKey
    protected Long _tosplcbqa;

    /** TOSPLCTQA: {bigint(19)} */
    @JsonKey
    protected Long _tosplctqa;

    /** TSPLCB: {bigint(19)} */
    @JsonKey
    protected Long _tsplcb;

    /** TSPLCT: {bigint(19)} */
    @JsonKey
    protected Long _tsplct;

    /** PRESPLCBQA: {bigint(19)} */
    @JsonKey
    protected Long _presplcbqa;

    /** PRESPLCTQA: {bigint(19)} */
    @JsonKey
    protected Long _presplctqa;

    /** TPRESPLCB: {bigint(19)} */
    @JsonKey
    protected Long _tpresplcb;

    /** TPRESPLCT: {bigint(19)} */
    @JsonKey
    protected Long _tpresplct;

    /** TINVMDTCBS: {char(1)} */
    @JsonKey
    protected String _tinvmdtcbs;

    /** TINVMDTCB: {bigint(19)} */
    @JsonKey
    protected Long _tinvmdtcb;

    /** TINVMDTCTS: {char(1)} */
    @JsonKey
    protected String _tinvmdtcts;

    /** TINVMDTCT: {bigint(19)} */
    @JsonKey
    protected Long _tinvmdtct;

    /** CSPLNUN: {bigint(19)} */
    @JsonKey
    protected Long _csplnun;

    /** SEND_CD: {varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** WORK_FLG: {char(1)} */
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
    public BsEMhStockDto() {
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
        if (other == null || !(other instanceof BsEMhStockDto)) { return false; }
        final BsEMhStockDto otherEntity = (BsEMhStockDto)other;
        if (!helpComparingValue(getMhStockId(), otherEntity.getMhStockId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_MH_STOCK");
        result = xCH(result, getMhStockId());
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
        sb.append(c).append(getMhStockId());
        sb.append(c).append(getCompanyCd());
        sb.append(c).append(getLinblk());
        sb.append(c).append(getZoneCd());
        sb.append(c).append(getLocno());
        sb.append(c).append(getLockbn());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getTstinvcb());
        sb.append(c).append(getTstinvct());
        sb.append(c).append(getTosplcbqa());
        sb.append(c).append(getTosplctqa());
        sb.append(c).append(getTsplcb());
        sb.append(c).append(getTsplct());
        sb.append(c).append(getPresplcbqa());
        sb.append(c).append(getPresplctqa());
        sb.append(c).append(getTpresplcb());
        sb.append(c).append(getTpresplct());
        sb.append(c).append(getTinvmdtcbs());
        sb.append(c).append(getTinvmdtcb());
        sb.append(c).append(getTinvmdtcts());
        sb.append(c).append(getTinvmdtct());
        sb.append(c).append(getCsplnun());
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
     * [get] MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通下位データ送信(棚在庫)ID
     * @return The value of the column 'MH_STOCK_ID'. (NullAllowed)
     */
    public Long getMhStockId() {
        return _mhStockId;
    }

    /**
     * [set] MH_STOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 共通下位データ送信(棚在庫)ID
     * @param mhStockId The value of the column 'MH_STOCK_ID'. (NullAllowed)
     */
    public void setMhStockId(Long mhStockId) {
        __modifiedProperties.add("mhStockId");
        this._mhStockId = mhStockId;
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
     * [get] LINBLK: {varchar(30)} <br>
     * ライン/ブロック
     * @return The value of the column 'LINBLK'. (NullAllowed)
     */
    public String getLinblk() {
        return _linblk;
    }

    /**
     * [set] LINBLK: {varchar(30)} <br>
     * ライン/ブロック
     * @param linblk The value of the column 'LINBLK'. (NullAllowed)
     */
    public void setLinblk(String linblk) {
        __modifiedProperties.add("linblk");
        this._linblk = linblk;
    }

    /**
     * [get] ZONE_CD: {varchar(30)} <br>
     * ゾーンCD
     * @return The value of the column 'ZONE_CD'. (NullAllowed)
     */
    public String getZoneCd() {
        return _zoneCd;
    }

    /**
     * [set] ZONE_CD: {varchar(30)} <br>
     * ゾーンCD
     * @param zoneCd The value of the column 'ZONE_CD'. (NullAllowed)
     */
    public void setZoneCd(String zoneCd) {
        __modifiedProperties.add("zoneCd");
        this._zoneCd = zoneCd;
    }

    /**
     * [get] LOCNO: {varchar(255)} <br>
     * ロケーションＮｏ
     * @return The value of the column 'LOCNO'. (NullAllowed)
     */
    public String getLocno() {
        return _locno;
    }

    /**
     * [set] LOCNO: {varchar(255)} <br>
     * ロケーションＮｏ
     * @param locno The value of the column 'LOCNO'. (NullAllowed)
     */
    public void setLocno(String locno) {
        __modifiedProperties.add("locno");
        this._locno = locno;
    }

    /**
     * [get] LOCKBN: {char(1)} <br>
     * ロケーション区分
     * @return The value of the column 'LOCKBN'. (NullAllowed)
     */
    public String getLockbn() {
        return _lockbn;
    }

    /**
     * [set] LOCKBN: {char(1)} <br>
     * ロケーション区分
     * @param lockbn The value of the column 'LOCKBN'. (NullAllowed)
     */
    public void setLockbn(String lockbn) {
        __modifiedProperties.add("lockbn");
        this._lockbn = lockbn;
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
     * [get] TSPLCB: {bigint(19)} <br>
     * 当日補充数合計(ダンボール)
     * @return The value of the column 'TSPLCB'. (NullAllowed)
     */
    public Long getTsplcb() {
        return _tsplcb;
    }

    /**
     * [set] TSPLCB: {bigint(19)} <br>
     * 当日補充数合計(ダンボール)
     * @param tsplcb The value of the column 'TSPLCB'. (NullAllowed)
     */
    public void setTsplcb(Long tsplcb) {
        __modifiedProperties.add("tsplcb");
        this._tsplcb = tsplcb;
    }

    /**
     * [get] TSPLCT: {bigint(19)} <br>
     * 当日補充数合計(カートン)
     * @return The value of the column 'TSPLCT'. (NullAllowed)
     */
    public Long getTsplct() {
        return _tsplct;
    }

    /**
     * [set] TSPLCT: {bigint(19)} <br>
     * 当日補充数合計(カートン)
     * @param tsplct The value of the column 'TSPLCT'. (NullAllowed)
     */
    public void setTsplct(Long tsplct) {
        __modifiedProperties.add("tsplct");
        this._tsplct = tsplct;
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
     * [get] TPRESPLCB: {bigint(19)} <br>
     * 当日事前補充数合計(ダンボール)
     * @return The value of the column 'TPRESPLCB'. (NullAllowed)
     */
    public Long getTpresplcb() {
        return _tpresplcb;
    }

    /**
     * [set] TPRESPLCB: {bigint(19)} <br>
     * 当日事前補充数合計(ダンボール)
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
     * [get] TINVMDTCBS: {char(1)} <br>
     * 当日在庫修正数合計(ダンボール)符号
     * @return The value of the column 'TINVMDTCBS'. (NullAllowed)
     */
    public String getTinvmdtcbs() {
        return _tinvmdtcbs;
    }

    /**
     * [set] TINVMDTCBS: {char(1)} <br>
     * 当日在庫修正数合計(ダンボール)符号
     * @param tinvmdtcbs The value of the column 'TINVMDTCBS'. (NullAllowed)
     */
    public void setTinvmdtcbs(String tinvmdtcbs) {
        __modifiedProperties.add("tinvmdtcbs");
        this._tinvmdtcbs = tinvmdtcbs;
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
     * [get] TINVMDTCTS: {char(1)} <br>
     * 当日在庫修正数合計(カートン)符号
     * @return The value of the column 'TINVMDTCTS'. (NullAllowed)
     */
    public String getTinvmdtcts() {
        return _tinvmdtcts;
    }

    /**
     * [set] TINVMDTCTS: {char(1)} <br>
     * 当日在庫修正数合計(カートン)符号
     * @param tinvmdtcts The value of the column 'TINVMDTCTS'. (NullAllowed)
     */
    public void setTinvmdtcts(String tinvmdtcts) {
        __modifiedProperties.add("tinvmdtcts");
        this._tinvmdtcts = tinvmdtcts;
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
