package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRIMALLOCSCHKRI as TABLE. <br>
 * 山出し引当不能情報ボディ
 * <pre>
 * [primary-key]
 *     TRIMALLOCSCH_ID
 *
 * [column]
 *     TRIMALLOCSCH_ID, TRIMALLOC_H_ID, TRSODETAIL_ID, ALLOC_IMP_KEY, ALC_IMP_RESG_No, LOCATION_ID, LOCATION_CD, EXPECT_QTY, MANUFACTUREDATE, DESIGN_FLG, ALCIMEXP_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOCSCH_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_YTRSODETAIL, T_TRIMALLOC_H
 *
 * [referrer-table]
 *     T_TRIMALLOCADJUST
 *
 * [foreign-property]
 *     tYtrsodetail, tTrimallocH
 *
 * [referrer-property]
 *     tTrimallocadjustList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrimallocschkriDto implements Serializable {

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
    /** TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trimallocschId;

    /** TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H} */
    @JsonKey
    protected Long _trimallocHId;

    /** TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL} */
    @JsonKey
    protected Long _trsodetailId;

    /** ALLOC_IMP_KEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _allocImpKey;

    /** ALC_IMP_RESG_No: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _alcImpResgNo;

    /** LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _locationId;

    /** LOCATION_CD: {varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** EXPECT_QTY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _expectQty;

    /** MANUFACTUREDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _manufacturedate;

    /** DESIGN_FLG: {NotNull, varchar(30)} */
    @JsonKey
    protected String _designFlg;

    /** ALCIMEXP_FLG: {NotNull, varchar(30)} */
    @JsonKey
    protected String _alcimexpFlg;

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
    public BsTTrimallocschkriDto() {
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
    protected TYtrsodetailDto _tYtrsodetail;

    public TYtrsodetailDto getTYtrsodetail() {
        return _tYtrsodetail;
    }

    public void setTYtrsodetail(TYtrsodetailDto tYtrsodetail) {
        this._tYtrsodetail = tYtrsodetail;
    }

    protected TTrimallocHDto _tTrimallocH;

    public TTrimallocHDto getTTrimallocH() {
        return _tTrimallocH;
    }

    public void setTTrimallocH(TTrimallocHDto tTrimallocH) {
        this._tTrimallocH = tTrimallocH;
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
        if (other == null || !(other instanceof BsTTrimallocschkriDto)) { return false; }
        final BsTTrimallocschkriDto otherEntity = (BsTTrimallocschkriDto)other;
        if (!helpComparingValue(getTrimallocschId(), otherEntity.getTrimallocschId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRIMALLOCSCHKRI");
        result = xCH(result, getTrimallocschId());
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
        sb.append(c).append(getTrimallocschId());
        sb.append(c).append(getTrimallocHId());
        sb.append(c).append(getTrsodetailId());
        sb.append(c).append(getAllocImpKey());
        sb.append(c).append(getAlcImpResgNo());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getExpectQty());
        sb.append(c).append(getManufacturedate());
        sb.append(c).append(getDesignFlg());
        sb.append(c).append(getAlcimexpFlg());
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
     * [get] TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能情報ボディID
     * @return The value of the column 'TRIMALLOCSCH_ID'. (NullAllowed)
     */
    public Long getTrimallocschId() {
        return _trimallocschId;
    }

    /**
     * [set] TRIMALLOCSCH_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し引当不能情報ボディID
     * @param trimallocschId The value of the column 'TRIMALLOCSCH_ID'. (NullAllowed)
     */
    public void setTrimallocschId(Long trimallocschId) {
        __modifiedProperties.add("trimallocschId");
        this._trimallocschId = trimallocschId;
    }

    /**
     * [get] TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H} <br>
     * 山出し引当不能情報ヘッダID
     * @return The value of the column 'TRIMALLOC_H_ID'. (NullAllowed)
     */
    public Long getTrimallocHId() {
        return _trimallocHId;
    }

    /**
     * [set] TRIMALLOC_H_ID: {NotNull, bigint(19), FK to T_TRIMALLOC_H} <br>
     * 山出し引当不能情報ヘッダID
     * @param trimallocHId The value of the column 'TRIMALLOC_H_ID'. (NullAllowed)
     */
    public void setTrimallocHId(Long trimallocHId) {
        __modifiedProperties.add("trimallocHId");
        this._trimallocHId = trimallocHId;
    }

    /**
     * [get] TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL} <br>
     * 山出し指示ボディID
     * @return The value of the column 'TRSODETAIL_ID'. (NullAllowed)
     */
    public Long getTrsodetailId() {
        return _trsodetailId;
    }

    /**
     * [set] TRSODETAIL_ID: {bigint(19), FK to T_YTRSODETAIL} <br>
     * 山出し指示ボディID
     * @param trsodetailId The value of the column 'TRSODETAIL_ID'. (NullAllowed)
     */
    public void setTrsodetailId(Long trsodetailId) {
        __modifiedProperties.add("trsodetailId");
        this._trsodetailId = trsodetailId;
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
     * [get] ALC_IMP_RESG_No: {NotNull, bigint(19)} <br>
     * 引当不能補充先行No.
     * @return The value of the column 'ALC_IMP_RESG_No'. (NullAllowed)
     */
    public Long getAlcImpResgNo() {
        return _alcImpResgNo;
    }

    /**
     * [set] ALC_IMP_RESG_No: {NotNull, bigint(19)} <br>
     * 引当不能補充先行No.
     * @param alcImpResgNo The value of the column 'ALC_IMP_RESG_No'. (NullAllowed)
     */
    public void setAlcImpResgNo(Long alcImpResgNo) {
        __modifiedProperties.add("alcImpResgNo");
        this._alcImpResgNo = alcImpResgNo;
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
     * [get] EXPECT_QTY: {NotNull, bigint(19)} <br>
     * 山出し指示数量(個装)
     * @return The value of the column 'EXPECT_QTY'. (NullAllowed)
     */
    public Long getExpectQty() {
        return _expectQty;
    }

    /**
     * [set] EXPECT_QTY: {NotNull, bigint(19)} <br>
     * 山出し指示数量(個装)
     * @param expectQty The value of the column 'EXPECT_QTY'. (NullAllowed)
     */
    public void setExpectQty(Long expectQty) {
        __modifiedProperties.add("expectQty");
        this._expectQty = expectQty;
    }

    /**
     * [get] MANUFACTUREDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTUREDATE'. (NullAllowed)
     */
    public String getManufacturedate() {
        return _manufacturedate;
    }

    /**
     * [set] MANUFACTUREDATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param manufacturedate The value of the column 'MANUFACTUREDATE'. (NullAllowed)
     */
    public void setManufacturedate(String manufacturedate) {
        __modifiedProperties.add("manufacturedate");
        this._manufacturedate = manufacturedate;
    }

    /**
     * [get] DESIGN_FLG: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_FLG'. (NullAllowed)
     */
    public String getDesignFlg() {
        return _designFlg;
    }

    /**
     * [set] DESIGN_FLG: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @param designFlg The value of the column 'DESIGN_FLG'. (NullAllowed)
     */
    public void setDesignFlg(String designFlg) {
        __modifiedProperties.add("designFlg");
        this._designFlg = designFlg;
    }

    /**
     * [get] ALCIMEXP_FLG: {NotNull, varchar(30)} <br>
     * マスタ登録有無フラグ
     * @return The value of the column 'ALCIMEXP_FLG'. (NullAllowed)
     */
    public String getAlcimexpFlg() {
        return _alcimexpFlg;
    }

    /**
     * [set] ALCIMEXP_FLG: {NotNull, varchar(30)} <br>
     * マスタ登録有無フラグ
     * @param alcimexpFlg The value of the column 'ALCIMEXP_FLG'. (NullAllowed)
     */
    public void setAlcimexpFlg(String alcimexpFlg) {
        __modifiedProperties.add("alcimexpFlg");
        this._alcimexpFlg = alcimexpFlg;
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
