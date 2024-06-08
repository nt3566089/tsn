package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRIMALLOCADJUST as TABLE. <br>
 * 山出し引当不能調整情報
 * <pre>
 * [primary-key]
 *     TRIMALLOCADJUST_ID
 *
 * [column]
 *     TRIMALLOCADJUST_ID, TRIMALLOCSTOCK_ID, TRIMALLOCSCH_ID, ALLOC_IMP_KEY, ALC_IMP_RESG_NO, ALC_IMP_STKG_NO, ADJUSTED_QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOCADJUST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_TRIMALLOCSTOCK, T_TRIMALLOCSCHKRI
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tTrimallocstock, tTrimallocschkri
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrimallocadjustDto implements Serializable {

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
    /** TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trimallocadjustId;

    /** TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK} */
    @JsonKey
    protected Long _trimallocstockId;

    /** TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI} */
    @JsonKey
    protected Long _trimallocschId;

    /** ALLOC_IMP_KEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _allocImpKey;

    /** ALC_IMP_RESG_NO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _alcImpResgNo;

    /** ALC_IMP_STKG_NO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _alcImpStkgNo;

    /** ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _adjustedQty;

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
    public BsTTrimallocadjustDto() {
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
    protected TTrimallocstockDto _tTrimallocstock;

    public TTrimallocstockDto getTTrimallocstock() {
        return _tTrimallocstock;
    }

    public void setTTrimallocstock(TTrimallocstockDto tTrimallocstock) {
        this._tTrimallocstock = tTrimallocstock;
    }

    protected TTrimallocschkriDto _tTrimallocschkri;

    public TTrimallocschkriDto getTTrimallocschkri() {
        return _tTrimallocschkri;
    }

    public void setTTrimallocschkri(TTrimallocschkriDto tTrimallocschkri) {
        this._tTrimallocschkri = tTrimallocschkri;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrimallocadjustDto)) { return false; }
        final BsTTrimallocadjustDto otherEntity = (BsTTrimallocadjustDto)other;
        if (!helpComparingValue(getTrimallocadjustId(), otherEntity.getTrimallocadjustId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRIMALLOCADJUST");
        result = xCH(result, getTrimallocadjustId());
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
        sb.append(c).append(getTrimallocadjustId());
        sb.append(c).append(getTrimallocstockId());
        sb.append(c).append(getTrimallocschId());
        sb.append(c).append(getAllocImpKey());
        sb.append(c).append(getAlcImpResgNo());
        sb.append(c).append(getAlcImpStkgNo());
        sb.append(c).append(getAdjustedQty());
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
     * [get] TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能調整情報ID
     * @return The value of the column 'TRIMALLOCADJUST_ID'. (NullAllowed)
     */
    public Long getTrimallocadjustId() {
        return _trimallocadjustId;
    }

    /**
     * [set] TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能調整情報ID
     * @param trimallocadjustId The value of the column 'TRIMALLOCADJUST_ID'. (NullAllowed)
     */
    public void setTrimallocadjustId(Long trimallocadjustId) {
        __modifiedProperties.add("trimallocadjustId");
        this._trimallocadjustId = trimallocadjustId;
    }

    /**
     * [get] TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK} <br>
     * 山出し引当不能在庫情報ID
     * @return The value of the column 'TRIMALLOCSTOCK_ID'. (NullAllowed)
     */
    public Long getTrimallocstockId() {
        return _trimallocstockId;
    }

    /**
     * [set] TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK} <br>
     * 山出し引当不能在庫情報ID
     * @param trimallocstockId The value of the column 'TRIMALLOCSTOCK_ID'. (NullAllowed)
     */
    public void setTrimallocstockId(Long trimallocstockId) {
        __modifiedProperties.add("trimallocstockId");
        this._trimallocstockId = trimallocstockId;
    }

    /**
     * [get] TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI} <br>
     * 山出し引当不能情報ボディID
     * @return The value of the column 'TRIMALLOCSCH_ID'. (NullAllowed)
     */
    public Long getTrimallocschId() {
        return _trimallocschId;
    }

    /**
     * [set] TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI} <br>
     * 山出し引当不能情報ボディID
     * @param trimallocschId The value of the column 'TRIMALLOCSCH_ID'. (NullAllowed)
     */
    public void setTrimallocschId(Long trimallocschId) {
        __modifiedProperties.add("trimallocschId");
        this._trimallocschId = trimallocschId;
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
     * [get] ALC_IMP_RESG_NO: {NotNull, bigint(19)} <br>
     * 引当不能補充先行№
     * @return The value of the column 'ALC_IMP_RESG_NO'. (NullAllowed)
     */
    public Long getAlcImpResgNo() {
        return _alcImpResgNo;
    }

    /**
     * [set] ALC_IMP_RESG_NO: {NotNull, bigint(19)} <br>
     * 引当不能補充先行№
     * @param alcImpResgNo The value of the column 'ALC_IMP_RESG_NO'. (NullAllowed)
     */
    public void setAlcImpResgNo(Long alcImpResgNo) {
        __modifiedProperties.add("alcImpResgNo");
        this._alcImpResgNo = alcImpResgNo;
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
     * [get] ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 取消・調整数量（個装）
     * @return The value of the column 'ADJUSTED_QTY'. (NullAllowed)
     */
    public Long getAdjustedQty() {
        return _adjustedQty;
    }

    /**
     * [set] ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 取消・調整数量（個装）
     * @param adjustedQty The value of the column 'ADJUSTED_QTY'. (NullAllowed)
     */
    public void setAdjustedQty(Long adjustedQty) {
        __modifiedProperties.add("adjustedQty");
        this._adjustedQty = adjustedQty;
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
