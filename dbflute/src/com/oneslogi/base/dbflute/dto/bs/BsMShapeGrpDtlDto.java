package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_SHAPE_GRP_DTL as TABLE. <br>
 * 荷姿グループ明細マスタ
 * <pre>
 * [primary-key]
 *     SHAPE_GRP_DTL_ID
 *
 * [column]
 *     SHAPE_GRP_DTL_ID, SHAPE_GRP_ID, SHAPE_ID, GTIN14_SYMBOL, CASE_PICK_FLG, SHAPE_SORT, EM_REPLENISH_SHAPE_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHAPE_GRP_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_SHAPE_GRP, M_SHAPE, B_CLASS_DTL(ByCasePickFlg)
 *
 * [referrer-table]
 *     M_PRODUCT_SHAPE
 *
 * [foreign-property]
 *     mShapeGrp, mShape, bClassDtlByCasePickFlg, bClassDtlByEmReplenishShapeFlg, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     mProductShapeList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMShapeGrpDtlDto implements Serializable {

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
    /** SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _shapeGrpDtlId;

    /** SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP} */
    @JsonKey
    protected Long _shapeGrpId;

    /** SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE} */
    @JsonKey
    protected Long _shapeId;

    /** GTIN14_SYMBOL: {bigint(19), default=[(1)]} */
    @JsonKey
    protected Long _gtin14Symbol;

    /** CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg} */
    @JsonKey
    protected String _casePickFlg;

    /** SHAPE_SORT: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _shapeSort;

    /** EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg} */
    @JsonKey
    protected String _emReplenishShapeFlg;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
    public BsMShapeGrpDtlDto() {
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
    protected MShapeGrpDto _mShapeGrp;

    public MShapeGrpDto getMShapeGrp() {
        return _mShapeGrp;
    }

    public void setMShapeGrp(MShapeGrpDto mShapeGrp) {
        this._mShapeGrp = mShapeGrp;
    }

    protected MShapeDto _mShape;

    public MShapeDto getMShape() {
        return _mShape;
    }

    public void setMShape(MShapeDto mShape) {
        this._mShape = mShape;
    }

    protected BClassDtlDto _bClassDtlByCasePickFlg;

    public BClassDtlDto getBClassDtlByCasePickFlg() {
        return _bClassDtlByCasePickFlg;
    }

    public void setBClassDtlByCasePickFlg(BClassDtlDto bClassDtlByCasePickFlg) {
        this._bClassDtlByCasePickFlg = bClassDtlByCasePickFlg;
    }

    protected BClassDtlDto _bClassDtlByEmReplenishShapeFlg;

    public BClassDtlDto getBClassDtlByEmReplenishShapeFlg() {
        return _bClassDtlByEmReplenishShapeFlg;
    }

    public void setBClassDtlByEmReplenishShapeFlg(BClassDtlDto bClassDtlByEmReplenishShapeFlg) {
        this._bClassDtlByEmReplenishShapeFlg = bClassDtlByEmReplenishShapeFlg;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MProductShapeDto> _mProductShapeList;

    public List<MProductShapeDto> getMProductShapeList() {
        if (_mProductShapeList == null) { _mProductShapeList = new ArrayList<MProductShapeDto>(); }
        return _mProductShapeList;
    }

    public void setMProductShapeList(List<MProductShapeDto> mProductShapeList) {
        this._mProductShapeList = mProductShapeList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMShapeGrpDtlDto)) { return false; }
        final BsMShapeGrpDtlDto otherEntity = (BsMShapeGrpDtlDto)other;
        if (!helpComparingValue(getShapeGrpDtlId(), otherEntity.getShapeGrpDtlId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_SHAPE_GRP_DTL");
        result = xCH(result, getShapeGrpDtlId());
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
        sb.append(c).append(getShapeGrpDtlId());
        sb.append(c).append(getShapeGrpId());
        sb.append(c).append(getShapeId());
        sb.append(c).append(getGtin14Symbol());
        sb.append(c).append(getCasePickFlg());
        sb.append(c).append(getShapeSort());
        sb.append(c).append(getEmReplenishShapeFlg());
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
     * [get] SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷姿グループ明細ID
     * @return The value of the column 'SHAPE_GRP_DTL_ID'. (NullAllowed)
     */
    public Long getShapeGrpDtlId() {
        return _shapeGrpDtlId;
    }

    /**
     * [set] SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷姿グループ明細ID
     * @param shapeGrpDtlId The value of the column 'SHAPE_GRP_DTL_ID'. (NullAllowed)
     */
    public void setShapeGrpDtlId(Long shapeGrpDtlId) {
        __modifiedProperties.add("shapeGrpDtlId");
        this._shapeGrpDtlId = shapeGrpDtlId;
    }

    /**
     * [get] SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP} <br>
     * 荷姿グループID
     * @return The value of the column 'SHAPE_GRP_ID'. (NullAllowed)
     */
    public Long getShapeGrpId() {
        return _shapeGrpId;
    }

    /**
     * [set] SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP} <br>
     * 荷姿グループID
     * @param shapeGrpId The value of the column 'SHAPE_GRP_ID'. (NullAllowed)
     */
    public void setShapeGrpId(Long shapeGrpId) {
        __modifiedProperties.add("shapeGrpId");
        this._shapeGrpId = shapeGrpId;
    }

    /**
     * [get] SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE} <br>
     * 荷姿ID
     * @return The value of the column 'SHAPE_ID'. (NullAllowed)
     */
    public Long getShapeId() {
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE} <br>
     * 荷姿ID
     * @param shapeId The value of the column 'SHAPE_ID'. (NullAllowed)
     */
    public void setShapeId(Long shapeId) {
        __modifiedProperties.add("shapeId");
        this._shapeId = shapeId;
    }

    /**
     * [get] GTIN14_SYMBOL: {bigint(19), default=[(1)]} <br>
     * GTIN14シンボル
     * @return The value of the column 'GTIN14_SYMBOL'. (NullAllowed)
     */
    public Long getGtin14Symbol() {
        return _gtin14Symbol;
    }

    /**
     * [set] GTIN14_SYMBOL: {bigint(19), default=[(1)]} <br>
     * GTIN14シンボル
     * @param gtin14Symbol The value of the column 'GTIN14_SYMBOL'. (NullAllowed)
     */
    public void setGtin14Symbol(Long gtin14Symbol) {
        __modifiedProperties.add("gtin14Symbol");
        this._gtin14Symbol = gtin14Symbol;
    }

    /**
     * [get] CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg} <br>
     * ケースピッキング対象
     * @return The value of the column 'CASE_PICK_FLG'. (NullAllowed)
     */
    public String getCasePickFlg() {
        return _casePickFlg;
    }

    /**
     * [set] CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg} <br>
     * ケースピッキング対象
     * @param casePickFlg The value of the column 'CASE_PICK_FLG'. (NullAllowed)
     */
    public void setCasePickFlg(String casePickFlg) {
        __modifiedProperties.add("casePickFlg");
        this._casePickFlg = casePickFlg;
    }

    /**
     * [get] SHAPE_SORT: {NotNull, bigint(19)} <br>
     * 荷姿ソート順
     * @return The value of the column 'SHAPE_SORT'. (NullAllowed)
     */
    public Long getShapeSort() {
        return _shapeSort;
    }

    /**
     * [set] SHAPE_SORT: {NotNull, bigint(19)} <br>
     * 荷姿ソート順
     * @param shapeSort The value of the column 'SHAPE_SORT'. (NullAllowed)
     */
    public void setShapeSort(Long shapeSort) {
        __modifiedProperties.add("shapeSort");
        this._shapeSort = shapeSort;
    }

    /**
     * [get] EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg} <br>
     * 緊急補充ゾーン補充荷姿
     * @return The value of the column 'EM_REPLENISH_SHAPE_FLG'. (NullAllowed)
     */
    public String getEmReplenishShapeFlg() {
        return _emReplenishShapeFlg;
    }

    /**
     * [set] EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg} <br>
     * 緊急補充ゾーン補充荷姿
     * @param emReplenishShapeFlg The value of the column 'EM_REPLENISH_SHAPE_FLG'. (NullAllowed)
     */
    public void setEmReplenishShapeFlg(String emReplenishShapeFlg) {
        __modifiedProperties.add("emReplenishShapeFlg");
        this._emReplenishShapeFlg = emReplenishShapeFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
