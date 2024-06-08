package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_STOCK_TYPE as TABLE. <br>
 * 在庫区分マスタ
 * <pre>
 * [primary-key]
 *     STOCK_TYPE_ID
 *
 * [column]
 *     STOCK_TYPE_ID, STOCK_TYPE_CD, DICT_ID, REVERSE_VALID_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, V_DICT, B_CLASS_DTL(ByReverseValidFlg)
 *
 * [referrer-table]
 *     H_INVENTORY_B, H_SHIPPING_B, H_STOCK, M_LOCATION, M_PROCESS_TYPE, T_ALLOC_INST_B, T_INVENTORY_B, T_INVENTORY_INST, T_MOVE_INST_B, T_RECEIVE_PLAN_H, T_SHIPPING_INST_B, T_STOCK, T_STORE_RECORD_H, W_HT_INVENTORY_INPUT_PROD, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE
 *
 * [foreign-property]
 *     bDict, vDict, bClassDtlByReverseValidFlg
 *
 * [referrer-property]
 *     hInventoryBList, hShippingBList, hStockList, mLocationList, mProcessTypeList, tAllocInstBList, tInventoryBList, tInventoryInstList, tMoveInstBList, tReceivePlanHList, tShippingInstBList, tStockList, tStoreRecordHList, wHtInventoryInputProdList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMStockTypeDto implements Serializable {

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
    /** STOCK_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _stockTypeId;

    /** STOCK_TYPE_CD: {UQ, NotNull, varchar(30)} */
    @JsonKey
    protected String _stockTypeCd;

    /** DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} */
    @JsonKey
    protected Long _dictId;

    /** REVERSE_VALID_FLG: {char(1), FK to B_CLASS_DTL, classification=ReverseValidFlg} */
    @JsonKey
    protected String _reverseValidFlg;

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
    public BsMStockTypeDto() {
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
    protected BDictDto _bDict;

    public BDictDto getBDict() {
        return _bDict;
    }

    public void setBDict(BDictDto bDict) {
        this._bDict = bDict;
    }

    protected VDictDto _vDict;

    public VDictDto getVDict() {
        return _vDict;
    }

    public void setVDict(VDictDto vDict) {
        this._vDict = vDict;
    }

    protected BClassDtlDto _bClassDtlByReverseValidFlg;

    public BClassDtlDto getBClassDtlByReverseValidFlg() {
        return _bClassDtlByReverseValidFlg;
    }

    public void setBClassDtlByReverseValidFlg(BClassDtlDto bClassDtlByReverseValidFlg) {
        this._bClassDtlByReverseValidFlg = bClassDtlByReverseValidFlg;
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

    protected List<HShippingBDto> _hShippingBList;

    public List<HShippingBDto> getHShippingBList() {
        if (_hShippingBList == null) { _hShippingBList = new ArrayList<HShippingBDto>(); }
        return _hShippingBList;
    }

    public void setHShippingBList(List<HShippingBDto> hShippingBList) {
        this._hShippingBList = hShippingBList;
    }

    protected List<HStockDto> _hStockList;

    public List<HStockDto> getHStockList() {
        if (_hStockList == null) { _hStockList = new ArrayList<HStockDto>(); }
        return _hStockList;
    }

    public void setHStockList(List<HStockDto> hStockList) {
        this._hStockList = hStockList;
    }

    protected List<MLocationDto> _mLocationList;

    public List<MLocationDto> getMLocationList() {
        if (_mLocationList == null) { _mLocationList = new ArrayList<MLocationDto>(); }
        return _mLocationList;
    }

    public void setMLocationList(List<MLocationDto> mLocationList) {
        this._mLocationList = mLocationList;
    }

    protected List<MProcessTypeDto> _mProcessTypeList;

    public List<MProcessTypeDto> getMProcessTypeList() {
        if (_mProcessTypeList == null) { _mProcessTypeList = new ArrayList<MProcessTypeDto>(); }
        return _mProcessTypeList;
    }

    public void setMProcessTypeList(List<MProcessTypeDto> mProcessTypeList) {
        this._mProcessTypeList = mProcessTypeList;
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

    protected List<TInventoryInstDto> _tInventoryInstList;

    public List<TInventoryInstDto> getTInventoryInstList() {
        if (_tInventoryInstList == null) { _tInventoryInstList = new ArrayList<TInventoryInstDto>(); }
        return _tInventoryInstList;
    }

    public void setTInventoryInstList(List<TInventoryInstDto> tInventoryInstList) {
        this._tInventoryInstList = tInventoryInstList;
    }

    protected List<TMoveInstBDto> _tMoveInstBList;

    public List<TMoveInstBDto> getTMoveInstBList() {
        if (_tMoveInstBList == null) { _tMoveInstBList = new ArrayList<TMoveInstBDto>(); }
        return _tMoveInstBList;
    }

    public void setTMoveInstBList(List<TMoveInstBDto> tMoveInstBList) {
        this._tMoveInstBList = tMoveInstBList;
    }

    protected List<TReceivePlanHDto> _tReceivePlanHList;

    public List<TReceivePlanHDto> getTReceivePlanHList() {
        if (_tReceivePlanHList == null) { _tReceivePlanHList = new ArrayList<TReceivePlanHDto>(); }
        return _tReceivePlanHList;
    }

    public void setTReceivePlanHList(List<TReceivePlanHDto> tReceivePlanHList) {
        this._tReceivePlanHList = tReceivePlanHList;
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

    protected List<TStoreRecordHDto> _tStoreRecordHList;

    public List<TStoreRecordHDto> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = new ArrayList<TStoreRecordHDto>(); }
        return _tStoreRecordHList;
    }

    public void setTStoreRecordHList(List<TStoreRecordHDto> tStoreRecordHList) {
        this._tStoreRecordHList = tStoreRecordHList;
    }

    protected List<WHtInventoryInputProdDto> _wHtInventoryInputProdList;

    public List<WHtInventoryInputProdDto> getWHtInventoryInputProdList() {
        if (_wHtInventoryInputProdList == null) { _wHtInventoryInputProdList = new ArrayList<WHtInventoryInputProdDto>(); }
        return _wHtInventoryInputProdList;
    }

    public void setWHtInventoryInputProdList(List<WHtInventoryInputProdDto> wHtInventoryInputProdList) {
        this._wHtInventoryInputProdList = wHtInventoryInputProdList;
    }

    protected List<WHtReceiveInspectionDto> _wHtReceiveInspectionList;

    public List<WHtReceiveInspectionDto> getWHtReceiveInspectionList() {
        if (_wHtReceiveInspectionList == null) { _wHtReceiveInspectionList = new ArrayList<WHtReceiveInspectionDto>(); }
        return _wHtReceiveInspectionList;
    }

    public void setWHtReceiveInspectionList(List<WHtReceiveInspectionDto> wHtReceiveInspectionList) {
        this._wHtReceiveInspectionList = wHtReceiveInspectionList;
    }

    protected List<WHtReceiveNoPlanInspDto> _wHtReceiveNoPlanInspList;

    public List<WHtReceiveNoPlanInspDto> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = new ArrayList<WHtReceiveNoPlanInspDto>(); }
        return _wHtReceiveNoPlanInspList;
    }

    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInspDto> wHtReceiveNoPlanInspList) {
        this._wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    protected List<WHtReceiveStoreDto> _wHtReceiveStoreList;

    public List<WHtReceiveStoreDto> getWHtReceiveStoreList() {
        if (_wHtReceiveStoreList == null) { _wHtReceiveStoreList = new ArrayList<WHtReceiveStoreDto>(); }
        return _wHtReceiveStoreList;
    }

    public void setWHtReceiveStoreList(List<WHtReceiveStoreDto> wHtReceiveStoreList) {
        this._wHtReceiveStoreList = wHtReceiveStoreList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMStockTypeDto)) { return false; }
        final BsMStockTypeDto otherEntity = (BsMStockTypeDto)other;
        if (!helpComparingValue(getStockTypeId(), otherEntity.getStockTypeId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_STOCK_TYPE");
        result = xCH(result, getStockTypeId());
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
        sb.append(c).append(getStockTypeId());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getDictId());
        sb.append(c).append(getReverseValidFlg());
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
     * [get] STOCK_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getStockTypeId() {
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setStockTypeId(Long stockTypeId) {
        __modifiedProperties.add("stockTypeId");
        this._stockTypeId = stockTypeId;
    }

    /**
     * [get] STOCK_TYPE_CD: {UQ, NotNull, varchar(30)} <br>
     * 在庫区分CD
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public String getStockTypeCd() {
        return _stockTypeCd;
    }

    /**
     * [set] STOCK_TYPE_CD: {UQ, NotNull, varchar(30)} <br>
     * 在庫区分CD
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public void setStockTypeCd(String stockTypeCd) {
        __modifiedProperties.add("stockTypeCd");
        this._stockTypeCd = stockTypeCd;
    }

    /**
     * [get] DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (NullAllowed)
     */
    public Long getDictId() {
        return _dictId;
    }

    /**
     * [set] DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (NullAllowed)
     */
    public void setDictId(Long dictId) {
        __modifiedProperties.add("dictId");
        this._dictId = dictId;
    }

    /**
     * [get] REVERSE_VALID_FLG: {char(1), FK to B_CLASS_DTL, classification=ReverseValidFlg} <br>
     * 逆転防止有効フラグ
     * @return The value of the column 'REVERSE_VALID_FLG'. (NullAllowed)
     */
    public String getReverseValidFlg() {
        return _reverseValidFlg;
    }

    /**
     * [set] REVERSE_VALID_FLG: {char(1), FK to B_CLASS_DTL, classification=ReverseValidFlg} <br>
     * 逆転防止有効フラグ
     * @param reverseValidFlg The value of the column 'REVERSE_VALID_FLG'. (NullAllowed)
     */
    public void setReverseValidFlg(String reverseValidFlg) {
        __modifiedProperties.add("reverseValidFlg");
        this._reverseValidFlg = reverseValidFlg;
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
