package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_SHAPE as TABLE. <br>
 * 荷姿マスタ
 * <pre>
 * [primary-key]
 *     SHAPE_ID
 *
 * [column]
 *     SHAPE_ID, SHAPE_CD, SHAPE_DICT_ID, SHAPE_UNIT_DICT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHAPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, V_DICT, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer-table]
 *     H_INVENTORY_B, H_STOCK, M_SHAPE_GRP_DTL, T_ALLOC_INST_B, T_INVENTORY_B, T_MOVE_INST_B, T_PICKING_B, T_SHIPPING_INST_B, T_STOCK
 *
 * [foreign-property]
 *     bDictByShapeDictId, bDictByShapeUnitDictId, vDictByShapeDictId, vDictByShapeUnitDictId, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     hInventoryBList, hStockList, mShapeGrpDtlList, tAllocInstBList, tInventoryBList, tMoveInstBList, tPickingBList, tShippingInstBList, tStockList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMShapeDto implements Serializable {

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
    /** SHAPE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _shapeId;

    /** SHAPE_CD: {UQ, NotNull, varchar(30)} */
    @JsonKey
    protected String _shapeCd;

    /** SHAPE_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} */
    @JsonKey
    protected Long _shapeDictId;

    /** SHAPE_UNIT_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} */
    @JsonKey
    protected Long _shapeUnitDictId;

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
    public BsMShapeDto() {
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
    protected BDictDto _bDictByShapeDictId;

    public BDictDto getBDictByShapeDictId() {
        return _bDictByShapeDictId;
    }

    public void setBDictByShapeDictId(BDictDto bDictByShapeDictId) {
        this._bDictByShapeDictId = bDictByShapeDictId;
    }

    protected BDictDto _bDictByShapeUnitDictId;

    public BDictDto getBDictByShapeUnitDictId() {
        return _bDictByShapeUnitDictId;
    }

    public void setBDictByShapeUnitDictId(BDictDto bDictByShapeUnitDictId) {
        this._bDictByShapeUnitDictId = bDictByShapeUnitDictId;
    }

    protected VDictDto _vDictByShapeDictId;

    public VDictDto getVDictByShapeDictId() {
        return _vDictByShapeDictId;
    }

    public void setVDictByShapeDictId(VDictDto vDictByShapeDictId) {
        this._vDictByShapeDictId = vDictByShapeDictId;
    }

    protected VDictDto _vDictByShapeUnitDictId;

    public VDictDto getVDictByShapeUnitDictId() {
        return _vDictByShapeUnitDictId;
    }

    public void setVDictByShapeUnitDictId(VDictDto vDictByShapeUnitDictId) {
        this._vDictByShapeUnitDictId = vDictByShapeUnitDictId;
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
    protected List<HInventoryBDto> _hInventoryBList;

    public List<HInventoryBDto> getHInventoryBList() {
        if (_hInventoryBList == null) { _hInventoryBList = new ArrayList<HInventoryBDto>(); }
        return _hInventoryBList;
    }

    public void setHInventoryBList(List<HInventoryBDto> hInventoryBList) {
        this._hInventoryBList = hInventoryBList;
    }

    protected List<HStockDto> _hStockList;

    public List<HStockDto> getHStockList() {
        if (_hStockList == null) { _hStockList = new ArrayList<HStockDto>(); }
        return _hStockList;
    }

    public void setHStockList(List<HStockDto> hStockList) {
        this._hStockList = hStockList;
    }

    protected List<MShapeGrpDtlDto> _mShapeGrpDtlList;

    public List<MShapeGrpDtlDto> getMShapeGrpDtlList() {
        if (_mShapeGrpDtlList == null) { _mShapeGrpDtlList = new ArrayList<MShapeGrpDtlDto>(); }
        return _mShapeGrpDtlList;
    }

    public void setMShapeGrpDtlList(List<MShapeGrpDtlDto> mShapeGrpDtlList) {
        this._mShapeGrpDtlList = mShapeGrpDtlList;
    }

    protected List<TAllocInstBDto> _tAllocInstBList;

    public List<TAllocInstBDto> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = new ArrayList<TAllocInstBDto>(); }
        return _tAllocInstBList;
    }

    public void setTAllocInstBList(List<TAllocInstBDto> tAllocInstBList) {
        this._tAllocInstBList = tAllocInstBList;
    }

    protected List<TInventoryBDto> _tInventoryBList;

    public List<TInventoryBDto> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = new ArrayList<TInventoryBDto>(); }
        return _tInventoryBList;
    }

    public void setTInventoryBList(List<TInventoryBDto> tInventoryBList) {
        this._tInventoryBList = tInventoryBList;
    }

    protected List<TMoveInstBDto> _tMoveInstBList;

    public List<TMoveInstBDto> getTMoveInstBList() {
        if (_tMoveInstBList == null) { _tMoveInstBList = new ArrayList<TMoveInstBDto>(); }
        return _tMoveInstBList;
    }

    public void setTMoveInstBList(List<TMoveInstBDto> tMoveInstBList) {
        this._tMoveInstBList = tMoveInstBList;
    }

    protected List<TPickingBDto> _tPickingBList;

    public List<TPickingBDto> getTPickingBList() {
        if (_tPickingBList == null) { _tPickingBList = new ArrayList<TPickingBDto>(); }
        return _tPickingBList;
    }

    public void setTPickingBList(List<TPickingBDto> tPickingBList) {
        this._tPickingBList = tPickingBList;
    }

    protected List<TShippingInstBDto> _tShippingInstBList;

    public List<TShippingInstBDto> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = new ArrayList<TShippingInstBDto>(); }
        return _tShippingInstBList;
    }

    public void setTShippingInstBList(List<TShippingInstBDto> tShippingInstBList) {
        this._tShippingInstBList = tShippingInstBList;
    }

    protected List<TStockDto> _tStockList;

    public List<TStockDto> getTStockList() {
        if (_tStockList == null) { _tStockList = new ArrayList<TStockDto>(); }
        return _tStockList;
    }

    public void setTStockList(List<TStockDto> tStockList) {
        this._tStockList = tStockList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMShapeDto)) { return false; }
        final BsMShapeDto otherEntity = (BsMShapeDto)other;
        if (!helpComparingValue(getShapeId(), otherEntity.getShapeId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_SHAPE");
        result = xCH(result, getShapeId());
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
        sb.append(c).append(getShapeId());
        sb.append(c).append(getShapeCd());
        sb.append(c).append(getShapeDictId());
        sb.append(c).append(getShapeUnitDictId());
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
     * [get] SHAPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷姿ID
     * @return The value of the column 'SHAPE_ID'. (NullAllowed)
     */
    public Long getShapeId() {
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷姿ID
     * @param shapeId The value of the column 'SHAPE_ID'. (NullAllowed)
     */
    public void setShapeId(Long shapeId) {
        __modifiedProperties.add("shapeId");
        this._shapeId = shapeId;
    }

    /**
     * [get] SHAPE_CD: {UQ, NotNull, varchar(30)} <br>
     * 荷姿CD
     * @return The value of the column 'SHAPE_CD'. (NullAllowed)
     */
    public String getShapeCd() {
        return _shapeCd;
    }

    /**
     * [set] SHAPE_CD: {UQ, NotNull, varchar(30)} <br>
     * 荷姿CD
     * @param shapeCd The value of the column 'SHAPE_CD'. (NullAllowed)
     */
    public void setShapeCd(String shapeCd) {
        __modifiedProperties.add("shapeCd");
        this._shapeCd = shapeCd;
    }

    /**
     * [get] SHAPE_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 荷姿名称辞書ID
     * @return The value of the column 'SHAPE_DICT_ID'. (NullAllowed)
     */
    public Long getShapeDictId() {
        return _shapeDictId;
    }

    /**
     * [set] SHAPE_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 荷姿名称辞書ID
     * @param shapeDictId The value of the column 'SHAPE_DICT_ID'. (NullAllowed)
     */
    public void setShapeDictId(Long shapeDictId) {
        __modifiedProperties.add("shapeDictId");
        this._shapeDictId = shapeDictId;
    }

    /**
     * [get] SHAPE_UNIT_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 荷姿単位辞書ID
     * @return The value of the column 'SHAPE_UNIT_DICT_ID'. (NullAllowed)
     */
    public Long getShapeUnitDictId() {
        return _shapeUnitDictId;
    }

    /**
     * [set] SHAPE_UNIT_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 荷姿単位辞書ID
     * @param shapeUnitDictId The value of the column 'SHAPE_UNIT_DICT_ID'. (NullAllowed)
     */
    public void setShapeUnitDictId(Long shapeUnitDictId) {
        __modifiedProperties.add("shapeUnitDictId");
        this._shapeUnitDictId = shapeUnitDictId;
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
