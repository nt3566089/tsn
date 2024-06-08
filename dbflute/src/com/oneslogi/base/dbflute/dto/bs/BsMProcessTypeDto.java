package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_PROCESS_TYPE as TABLE. <br>
 * 処理区分マスタ
 * <pre>
 * [primary-key]
 *     PROCESS_TYPE_ID
 *
 * [column]
 *     PROCESS_TYPE_ID, PROCESS_TYPE_CD, DICT_ID, RECEIVE_FLG, SHIPPING_FLG, STOCK_ADJUST_FLG, DEFAULT_FLG, STOCK_TYPE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PROCESS_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, M_STOCK_TYPE, V_DICT, B_CLASS_DTL(ByReceiveFlg)
 *
 * [referrer-table]
 *     H_MOVE_H, H_RECEIVE_H, H_SHIPPING_H, H_STOCK_INOUT, T_ALLOC_INST_H, T_MOVE_INST_H, T_PACKING_H, T_PICKING_H, T_RECEIVE_PLAN_H, T_SHIPPING_INST_H, T_STOCK_INOUT, T_STORE_RECORD_H, W_HT_RECEIVE_NO_PLAN_INSP
 *
 * [foreign-property]
 *     bDict, mStockType, vDict, bClassDtlByReceiveFlg, bClassDtlByShippingFlg, bClassDtlByStockAdjustFlg
 *
 * [referrer-property]
 *     hMoveHList, hReceiveHList, hShippingHList, hStockInoutList, tAllocInstHList, tMoveInstHList, tPackingHList, tPickingHList, tReceivePlanHList, tShippingInstHList, tStockInoutList, tStoreRecordHList, wHtReceiveNoPlanInspList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMProcessTypeDto implements Serializable {

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
    /** PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _processTypeId;

    /** PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)} */
    @JsonKey
    protected String _processTypeCd;

    /** DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} */
    @JsonKey
    protected Long _dictId;

    /** RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg} */
    @JsonKey
    protected String _receiveFlg;

    /** SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg} */
    @JsonKey
    protected String _shippingFlg;

    /** STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg} */
    @JsonKey
    protected String _stockAdjustFlg;

    /** DEFAULT_FLG: {char(1), default=[0]} */
    @JsonKey
    protected String _defaultFlg;

    /** STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} */
    @JsonKey
    protected Long _stockTypeId;

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
    public BsMProcessTypeDto() {
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

    protected MStockTypeDto _mStockType;

    public MStockTypeDto getMStockType() {
        return _mStockType;
    }

    public void setMStockType(MStockTypeDto mStockType) {
        this._mStockType = mStockType;
    }

    protected VDictDto _vDict;

    public VDictDto getVDict() {
        return _vDict;
    }

    public void setVDict(VDictDto vDict) {
        this._vDict = vDict;
    }

    protected BClassDtlDto _bClassDtlByReceiveFlg;

    public BClassDtlDto getBClassDtlByReceiveFlg() {
        return _bClassDtlByReceiveFlg;
    }

    public void setBClassDtlByReceiveFlg(BClassDtlDto bClassDtlByReceiveFlg) {
        this._bClassDtlByReceiveFlg = bClassDtlByReceiveFlg;
    }

    protected BClassDtlDto _bClassDtlByShippingFlg;

    public BClassDtlDto getBClassDtlByShippingFlg() {
        return _bClassDtlByShippingFlg;
    }

    public void setBClassDtlByShippingFlg(BClassDtlDto bClassDtlByShippingFlg) {
        this._bClassDtlByShippingFlg = bClassDtlByShippingFlg;
    }

    protected BClassDtlDto _bClassDtlByStockAdjustFlg;

    public BClassDtlDto getBClassDtlByStockAdjustFlg() {
        return _bClassDtlByStockAdjustFlg;
    }

    public void setBClassDtlByStockAdjustFlg(BClassDtlDto bClassDtlByStockAdjustFlg) {
        this._bClassDtlByStockAdjustFlg = bClassDtlByStockAdjustFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<HMoveHDto> _hMoveHList;

    public List<HMoveHDto> getHMoveHList() {
        if (_hMoveHList == null) { _hMoveHList = new ArrayList<HMoveHDto>(); }
        return _hMoveHList;
    }

    public void setHMoveHList(List<HMoveHDto> hMoveHList) {
        this._hMoveHList = hMoveHList;
    }

    protected List<HReceiveHDto> _hReceiveHList;

    public List<HReceiveHDto> getHReceiveHList() {
        if (_hReceiveHList == null) { _hReceiveHList = new ArrayList<HReceiveHDto>(); }
        return _hReceiveHList;
    }

    public void setHReceiveHList(List<HReceiveHDto> hReceiveHList) {
        this._hReceiveHList = hReceiveHList;
    }

    protected List<HShippingHDto> _hShippingHList;

    public List<HShippingHDto> getHShippingHList() {
        if (_hShippingHList == null) { _hShippingHList = new ArrayList<HShippingHDto>(); }
        return _hShippingHList;
    }

    public void setHShippingHList(List<HShippingHDto> hShippingHList) {
        this._hShippingHList = hShippingHList;
    }

    protected List<HStockInoutDto> _hStockInoutList;

    public List<HStockInoutDto> getHStockInoutList() {
        if (_hStockInoutList == null) { _hStockInoutList = new ArrayList<HStockInoutDto>(); }
        return _hStockInoutList;
    }

    public void setHStockInoutList(List<HStockInoutDto> hStockInoutList) {
        this._hStockInoutList = hStockInoutList;
    }

    protected List<TAllocInstHDto> _tAllocInstHList;

    public List<TAllocInstHDto> getTAllocInstHList() {
        if (_tAllocInstHList == null) { _tAllocInstHList = new ArrayList<TAllocInstHDto>(); }
        return _tAllocInstHList;
    }

    public void setTAllocInstHList(List<TAllocInstHDto> tAllocInstHList) {
        this._tAllocInstHList = tAllocInstHList;
    }

    protected List<TMoveInstHDto> _tMoveInstHList;

    public List<TMoveInstHDto> getTMoveInstHList() {
        if (_tMoveInstHList == null) { _tMoveInstHList = new ArrayList<TMoveInstHDto>(); }
        return _tMoveInstHList;
    }

    public void setTMoveInstHList(List<TMoveInstHDto> tMoveInstHList) {
        this._tMoveInstHList = tMoveInstHList;
    }

    protected List<TPackingHDto> _tPackingHList;

    public List<TPackingHDto> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = new ArrayList<TPackingHDto>(); }
        return _tPackingHList;
    }

    public void setTPackingHList(List<TPackingHDto> tPackingHList) {
        this._tPackingHList = tPackingHList;
    }

    protected List<TPickingHDto> _tPickingHList;

    public List<TPickingHDto> getTPickingHList() {
        if (_tPickingHList == null) { _tPickingHList = new ArrayList<TPickingHDto>(); }
        return _tPickingHList;
    }

    public void setTPickingHList(List<TPickingHDto> tPickingHList) {
        this._tPickingHList = tPickingHList;
    }

    protected List<TReceivePlanHDto> _tReceivePlanHList;

    public List<TReceivePlanHDto> getTReceivePlanHList() {
        if (_tReceivePlanHList == null) { _tReceivePlanHList = new ArrayList<TReceivePlanHDto>(); }
        return _tReceivePlanHList;
    }

    public void setTReceivePlanHList(List<TReceivePlanHDto> tReceivePlanHList) {
        this._tReceivePlanHList = tReceivePlanHList;
    }

    protected List<TShippingInstHDto> _tShippingInstHList;

    public List<TShippingInstHDto> getTShippingInstHList() {
        if (_tShippingInstHList == null) { _tShippingInstHList = new ArrayList<TShippingInstHDto>(); }
        return _tShippingInstHList;
    }

    public void setTShippingInstHList(List<TShippingInstHDto> tShippingInstHList) {
        this._tShippingInstHList = tShippingInstHList;
    }

    protected List<TStockInoutDto> _tStockInoutList;

    public List<TStockInoutDto> getTStockInoutList() {
        if (_tStockInoutList == null) { _tStockInoutList = new ArrayList<TStockInoutDto>(); }
        return _tStockInoutList;
    }

    public void setTStockInoutList(List<TStockInoutDto> tStockInoutList) {
        this._tStockInoutList = tStockInoutList;
    }

    protected List<TStoreRecordHDto> _tStoreRecordHList;

    public List<TStoreRecordHDto> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = new ArrayList<TStoreRecordHDto>(); }
        return _tStoreRecordHList;
    }

    public void setTStoreRecordHList(List<TStoreRecordHDto> tStoreRecordHList) {
        this._tStoreRecordHList = tStoreRecordHList;
    }

    protected List<WHtReceiveNoPlanInspDto> _wHtReceiveNoPlanInspList;

    public List<WHtReceiveNoPlanInspDto> getWHtReceiveNoPlanInspList() {
        if (_wHtReceiveNoPlanInspList == null) { _wHtReceiveNoPlanInspList = new ArrayList<WHtReceiveNoPlanInspDto>(); }
        return _wHtReceiveNoPlanInspList;
    }

    public void setWHtReceiveNoPlanInspList(List<WHtReceiveNoPlanInspDto> wHtReceiveNoPlanInspList) {
        this._wHtReceiveNoPlanInspList = wHtReceiveNoPlanInspList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMProcessTypeDto)) { return false; }
        final BsMProcessTypeDto otherEntity = (BsMProcessTypeDto)other;
        if (!helpComparingValue(getProcessTypeId(), otherEntity.getProcessTypeId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_PROCESS_TYPE");
        result = xCH(result, getProcessTypeId());
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
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getProcessTypeCd());
        sb.append(c).append(getDictId());
        sb.append(c).append(getReceiveFlg());
        sb.append(c).append(getShippingFlg());
        sb.append(c).append(getStockAdjustFlg());
        sb.append(c).append(getDefaultFlg());
        sb.append(c).append(getStockTypeId());
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
     * [get] PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public Long getProcessTypeId() {
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public void setProcessTypeId(Long processTypeId) {
        __modifiedProperties.add("processTypeId");
        this._processTypeId = processTypeId;
    }

    /**
     * [get] PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)} <br>
     * 処理区分CD
     * @return The value of the column 'PROCESS_TYPE_CD'. (NullAllowed)
     */
    public String getProcessTypeCd() {
        return _processTypeCd;
    }

    /**
     * [set] PROCESS_TYPE_CD: {UQ, NotNull, varchar(30)} <br>
     * 処理区分CD
     * @param processTypeCd The value of the column 'PROCESS_TYPE_CD'. (NullAllowed)
     */
    public void setProcessTypeCd(String processTypeCd) {
        __modifiedProperties.add("processTypeCd");
        this._processTypeCd = processTypeCd;
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
     * [get] RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg} <br>
     * 入荷フラグ
     * @return The value of the column 'RECEIVE_FLG'. (NullAllowed)
     */
    public String getReceiveFlg() {
        return _receiveFlg;
    }

    /**
     * [set] RECEIVE_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ReceiveFlg} <br>
     * 入荷フラグ
     * @param receiveFlg The value of the column 'RECEIVE_FLG'. (NullAllowed)
     */
    public void setReceiveFlg(String receiveFlg) {
        __modifiedProperties.add("receiveFlg");
        this._receiveFlg = receiveFlg;
    }

    /**
     * [get] SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg} <br>
     * 出荷フラグ
     * @return The value of the column 'SHIPPING_FLG'. (NullAllowed)
     */
    public String getShippingFlg() {
        return _shippingFlg;
    }

    /**
     * [set] SHIPPING_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=ShippingFlg} <br>
     * 出荷フラグ
     * @param shippingFlg The value of the column 'SHIPPING_FLG'. (NullAllowed)
     */
    public void setShippingFlg(String shippingFlg) {
        __modifiedProperties.add("shippingFlg");
        this._shippingFlg = shippingFlg;
    }

    /**
     * [get] STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg} <br>
     * 在庫調整フラグ
     * @return The value of the column 'STOCK_ADJUST_FLG'. (NullAllowed)
     */
    public String getStockAdjustFlg() {
        return _stockAdjustFlg;
    }

    /**
     * [set] STOCK_ADJUST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=StockAdjustFlg} <br>
     * 在庫調整フラグ
     * @param stockAdjustFlg The value of the column 'STOCK_ADJUST_FLG'. (NullAllowed)
     */
    public void setStockAdjustFlg(String stockAdjustFlg) {
        __modifiedProperties.add("stockAdjustFlg");
        this._stockAdjustFlg = stockAdjustFlg;
    }

    /**
     * [get] DEFAULT_FLG: {char(1), default=[0]} <br>
     * デフォルトフラグ
     * @return The value of the column 'DEFAULT_FLG'. (NullAllowed)
     */
    public String getDefaultFlg() {
        return _defaultFlg;
    }

    /**
     * [set] DEFAULT_FLG: {char(1), default=[0]} <br>
     * デフォルトフラグ
     * @param defaultFlg The value of the column 'DEFAULT_FLG'. (NullAllowed)
     */
    public void setDefaultFlg(String defaultFlg) {
        __modifiedProperties.add("defaultFlg");
        this._defaultFlg = defaultFlg;
    }

    /**
     * [get] STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getStockTypeId() {
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {IX, bigint(19), FK to M_STOCK_TYPE} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setStockTypeId(Long stockTypeId) {
        __modifiedProperties.add("stockTypeId");
        this._stockTypeId = stockTypeId;
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
