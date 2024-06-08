package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRIMALLOCSTOCK as TABLE. <br>
 * 山出し引当不能在庫情報
 * <pre>
 * [primary-key]
 *     TRIMALLOCSTOCK_ID
 *
 * [column]
 *     TRIMALLOCSTOCK_ID, TRIMALLOC_H_ID, STOCK_ID, ALLOC_IMP_KEY, ALC_IMP_STKG_NO, LOCATION_CD, DESIGN_FLG, MANUFACTUREDATE, MONTH_FLG, QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOCSTOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_STOCK
 *
 * [referrer-table]
 *     T_TRIMALLOCADJUST
 *
 * [foreign-property]
 *     tStock
 *
 * [referrer-property]
 *     tTrimallocadjustList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrimallocstockDto implements Serializable {

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
    /** TRIMALLOCSTOCK_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trimallocstockId;

    /** TRIMALLOC_H_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _trimallocHId;

    /** STOCK_ID: {NotNull, bigint(19), FK to T_STOCK} */
    @JsonKey
    protected Long _stockId;

    /** ALLOC_IMP_KEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _allocImpKey;

    /** ALC_IMP_STKG_NO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _alcImpStkgNo;

    /** LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** DESIGN_FLG: {varchar(30)} */
    @JsonKey
    protected String _designFlg;

    /** MANUFACTUREDATE: {varchar(8)} */
    @JsonKey
    protected String _manufacturedate;

    /** MONTH_FLG: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _monthFlg;

    /** QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _qty;

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
    public BsTTrimallocstockDto() {
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
    protected TStockDto _tStock;

    public TStockDto getTStock() {
        return _tStock;
    }

    public void setTStock(TStockDto tStock) {
        this._tStock = tStock;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TTrimallocadjustDto> _tTrimallocadjustList;

    public List<TTrimallocadjustDto> getTTrimallocadjustList() {
        if (_tTrimallocadjustList == null) { _tTrimallocadjustList = new ArrayList<TTrimallocadjustDto>(); }
        return _tTrimallocadjustList;
    }

    public void setTTrimallocadjustList(List<TTrimallocadjustDto> tTrimallocadjustList) {
        this._tTrimallocadjustList = tTrimallocadjustList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrimallocstockDto)) { return false; }
        final BsTTrimallocstockDto otherEntity = (BsTTrimallocstockDto)other;
        if (!helpComparingValue(getTrimallocstockId(), otherEntity.getTrimallocstockId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRIMALLOCSTOCK");
        result = xCH(result, getTrimallocstockId());
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
        sb.append(c).append(getTrimallocstockId());
        sb.append(c).append(getTrimallocHId());
        sb.append(c).append(getStockId());
        sb.append(c).append(getAllocImpKey());
        sb.append(c).append(getAlcImpStkgNo());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getDesignFlg());
        sb.append(c).append(getManufacturedate());
        sb.append(c).append(getMonthFlg());
        sb.append(c).append(getQty());
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
     * [get] TRIMALLOCSTOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能在庫情報ID
     * @return The value of the column 'TRIMALLOCSTOCK_ID'. (NullAllowed)
     */
    public Long getTrimallocstockId() {
        return _trimallocstockId;
    }

    /**
     * [set] TRIMALLOCSTOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能在庫情報ID
     * @param trimallocstockId The value of the column 'TRIMALLOCSTOCK_ID'. (NullAllowed)
     */
    public void setTrimallocstockId(Long trimallocstockId) {
        __modifiedProperties.add("trimallocstockId");
        this._trimallocstockId = trimallocstockId;
    }

    /**
     * [get] TRIMALLOC_H_ID: {NotNull, bigint(19)} <br>
     * 山出し引当不能情報ヘッダID
     * @return The value of the column 'TRIMALLOC_H_ID'. (NullAllowed)
     */
    public Long getTrimallocHId() {
        return _trimallocHId;
    }

    /**
     * [set] TRIMALLOC_H_ID: {NotNull, bigint(19)} <br>
     * 山出し引当不能情報ヘッダID
     * @param trimallocHId The value of the column 'TRIMALLOC_H_ID'. (NullAllowed)
     */
    public void setTrimallocHId(Long trimallocHId) {
        __modifiedProperties.add("trimallocHId");
        this._trimallocHId = trimallocHId;
    }

    /**
     * [get] STOCK_ID: {NotNull, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public Long getStockId() {
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {NotNull, bigint(19), FK to T_STOCK} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public void setStockId(Long stockId) {
        __modifiedProperties.add("stockId");
        this._stockId = stockId;
    }

    /**
     * [get] ALLOC_IMP_KEY: {NotNull, bigint(19)} <br>
     * 引当不能キー
     * @return The value of the column 'ALLOC_IMP_KEY'. (NullAllowed)
     */
    public Long getAllocImpKey() {
        return _allocImpKey;
    }

    /**
     * [set] ALLOC_IMP_KEY: {NotNull, bigint(19)} <br>
     * 引当不能キー
     * @param allocImpKey The value of the column 'ALLOC_IMP_KEY'. (NullAllowed)
     */
    public void setAllocImpKey(Long allocImpKey) {
        __modifiedProperties.add("allocImpKey");
        this._allocImpKey = allocImpKey;
    }

    /**
     * [get] ALC_IMP_STKG_NO: {NotNull, bigint(19)} <br>
     * 引当不能在庫行№
     * @return The value of the column 'ALC_IMP_STKG_NO'. (NullAllowed)
     */
    public Long getAlcImpStkgNo() {
        return _alcImpStkgNo;
    }

    /**
     * [set] ALC_IMP_STKG_NO: {NotNull, bigint(19)} <br>
     * 引当不能在庫行№
     * @param alcImpStkgNo The value of the column 'ALC_IMP_STKG_NO'. (NullAllowed)
     */
    public void setAlcImpStkgNo(Long alcImpStkgNo) {
        __modifiedProperties.add("alcImpStkgNo");
        this._alcImpStkgNo = alcImpStkgNo;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_FLG'. (NullAllowed)
     */
    public String getDesignFlg() {
        return _designFlg;
    }

    /**
     * [set] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @param designFlg The value of the column 'DESIGN_FLG'. (NullAllowed)
     */
    public void setDesignFlg(String designFlg) {
        __modifiedProperties.add("designFlg");
        this._designFlg = designFlg;
    }

    /**
     * [get] MANUFACTUREDATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTUREDATE'. (NullAllowed)
     */
    public String getManufacturedate() {
        return _manufacturedate;
    }

    /**
     * [set] MANUFACTUREDATE: {varchar(8)} <br>
     * 製造年月日
     * @param manufacturedate The value of the column 'MANUFACTUREDATE'. (NullAllowed)
     */
    public void setManufacturedate(String manufacturedate) {
        __modifiedProperties.add("manufacturedate");
        this._manufacturedate = manufacturedate;
    }

    /**
     * [get] MONTH_FLG: {NotNull, bigint(19)} <br>
     * 月替りデ変区分
     * @return The value of the column 'MONTH_FLG'. (NullAllowed)
     */
    public Long getMonthFlg() {
        return _monthFlg;
    }

    /**
     * [set] MONTH_FLG: {NotNull, bigint(19)} <br>
     * 月替りデ変区分
     * @param monthFlg The value of the column 'MONTH_FLG'. (NullAllowed)
     */
    public void setMonthFlg(Long monthFlg) {
        __modifiedProperties.add("monthFlg");
        this._monthFlg = monthFlg;
    }

    /**
     * [get] QTY: {NotNull, bigint(19)} <br>
     * 在庫数量（個装）
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public Long getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {NotNull, bigint(19)} <br>
     * 在庫数量（個装）
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(Long qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
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
