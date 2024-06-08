package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_LOT as TABLE. <br>
 * ロット
 * <pre>
 * [primary-key]
 *     LOT_ID
 *
 * [column]
 *     LOT_ID, PRODUCT_ID, LOT, LOT_SORT, LIMIT_DT, LOT1, LOT2, LOT3, LOT4, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, TRANCEPORT_CD, SOURCE_CD, SOURCE_NM, SCH_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_PRODUCT
 *
 * [referrer-table]
 *     T_ALLOC_INST_B, T_ALLOC_LOT, T_INVENTORY_B, T_KEEPING_LOT, T_LAST_LOT, T_MOVE_INST_B, T_SHIPPING_INST_B, T_STOCK, W_HT_INVENTORY_INPUT_PROD, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SHIPPING_PICKING
 *
 * [foreign-property]
 *     mProduct
 *
 * [referrer-property]
 *     tAllocInstBList, tAllocLotList, tInventoryBList, tKeepingLotList, tLastLotList, tMoveInstBList, tShippingInstBList, tStockList, wHtInventoryInputProdList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtShippingPickingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTLotDto implements Serializable {

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
    /** LOT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _lotId;

    /** PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT} */
    @JsonKey
    protected Long _productId;

    /** LOT: {varchar(30)} */
    @JsonKey
    protected String _lot;

    /** LOT_SORT: {varchar(30)} */
    @JsonKey
    protected String _lotSort;

    /** LIMIT_DT: {varchar(8)} */
    @JsonKey
    protected String _limitDt;

    /** LOT1: {varchar(255)} */
    @JsonKey
    protected String _lot1;

    /** LOT2: {varchar(255)} */
    @JsonKey
    protected String _lot2;

    /** LOT3: {varchar(255)} */
    @JsonKey
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** DAMAGEFLG: {NotNull, char(1)} */
    @JsonKey
    protected String _damageflg;

    /** NOSHIPPINGFLG: {NotNull, char(1)} */
    @JsonKey
    protected String _noshippingflg;

    /** FOREIGNCARGOFLG: {NotNull, char(1)} */
    @JsonKey
    protected String _foreigncargoflg;

    /** CUSTOMSRELEASEFLG: {NotNull, char(1)} */
    @JsonKey
    protected String _customsreleaseflg;

    /** TAXFLG: {IX, NotNull, char(1)} */
    @JsonKey
    protected String _taxflg;

    /** TRANCEPORT_CD: {varchar(30)} */
    @JsonKey
    protected String _tranceportCd;

    /** SOURCE_CD: {varchar(30)} */
    @JsonKey
    protected String _sourceCd;

    /** SOURCE_NM: {varchar(60)} */
    @JsonKey
    protected String _sourceNm;

    /** SCH_DT: {varchar(8)} */
    @JsonKey
    protected String _schDt;

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
    public BsTLotDto() {
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
    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TAllocInstBDto> _tAllocInstBList;

    public List<TAllocInstBDto> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = new ArrayList<TAllocInstBDto>(); }
        return _tAllocInstBList;
    }

    public void setTAllocInstBList(List<TAllocInstBDto> tAllocInstBList) {
        this._tAllocInstBList = tAllocInstBList;
    }

    protected List<TAllocLotDto> _tAllocLotList;

    public List<TAllocLotDto> getTAllocLotList() {
        if (_tAllocLotList == null) { _tAllocLotList = new ArrayList<TAllocLotDto>(); }
        return _tAllocLotList;
    }

    public void setTAllocLotList(List<TAllocLotDto> tAllocLotList) {
        this._tAllocLotList = tAllocLotList;
    }

    protected List<TInventoryBDto> _tInventoryBList;

    public List<TInventoryBDto> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = new ArrayList<TInventoryBDto>(); }
        return _tInventoryBList;
    }

    public void setTInventoryBList(List<TInventoryBDto> tInventoryBList) {
        this._tInventoryBList = tInventoryBList;
    }

    protected List<TKeepingLotDto> _tKeepingLotList;

    public List<TKeepingLotDto> getTKeepingLotList() {
        if (_tKeepingLotList == null) { _tKeepingLotList = new ArrayList<TKeepingLotDto>(); }
        return _tKeepingLotList;
    }

    public void setTKeepingLotList(List<TKeepingLotDto> tKeepingLotList) {
        this._tKeepingLotList = tKeepingLotList;
    }

    protected List<TLastLotDto> _tLastLotList;

    public List<TLastLotDto> getTLastLotList() {
        if (_tLastLotList == null) { _tLastLotList = new ArrayList<TLastLotDto>(); }
        return _tLastLotList;
    }

    public void setTLastLotList(List<TLastLotDto> tLastLotList) {
        this._tLastLotList = tLastLotList;
    }

    protected List<TMoveInstBDto> _tMoveInstBList;

    public List<TMoveInstBDto> getTMoveInstBList() {
        if (_tMoveInstBList == null) { _tMoveInstBList = new ArrayList<TMoveInstBDto>(); }
        return _tMoveInstBList;
    }

    public void setTMoveInstBList(List<TMoveInstBDto> tMoveInstBList) {
        this._tMoveInstBList = tMoveInstBList;
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

    protected List<WHtShippingPickingDto> _wHtShippingPickingList;

    public List<WHtShippingPickingDto> getWHtShippingPickingList() {
        if (_wHtShippingPickingList == null) { _wHtShippingPickingList = new ArrayList<WHtShippingPickingDto>(); }
        return _wHtShippingPickingList;
    }

    public void setWHtShippingPickingList(List<WHtShippingPickingDto> wHtShippingPickingList) {
        this._wHtShippingPickingList = wHtShippingPickingList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTLotDto)) { return false; }
        final BsTLotDto otherEntity = (BsTLotDto)other;
        if (!helpComparingValue(getLotId(), otherEntity.getLotId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_LOT");
        result = xCH(result, getLotId());
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
        sb.append(c).append(getLotId());
        sb.append(c).append(getProductId());
        sb.append(c).append(getLot());
        sb.append(c).append(getLotSort());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot2());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot4());
        sb.append(c).append(getDamageflg());
        sb.append(c).append(getNoshippingflg());
        sb.append(c).append(getForeigncargoflg());
        sb.append(c).append(getCustomsreleaseflg());
        sb.append(c).append(getTaxflg());
        sb.append(c).append(getTranceportCd());
        sb.append(c).append(getSourceCd());
        sb.append(c).append(getSourceNm());
        sb.append(c).append(getSchDt());
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
     * [get] LOT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] LOT: {varchar(30)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {varchar(30)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] LOT_SORT: {varchar(30)} <br>
     * ロットソート順
     * @return The value of the column 'LOT_SORT'. (NullAllowed)
     */
    public String getLotSort() {
        return _lotSort;
    }

    /**
     * [set] LOT_SORT: {varchar(30)} <br>
     * ロットソート順
     * @param lotSort The value of the column 'LOT_SORT'. (NullAllowed)
     */
    public void setLotSort(String lotSort) {
        __modifiedProperties.add("lotSort");
        this._lotSort = lotSort;
    }

    /**
     * [get] LIMIT_DT: {varchar(8)} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] LIMIT_DT: {varchar(8)} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed)
     */
    public String getLot1() {
        return _lot1;
    }

    /**
     * [set] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed)
     */
    public void setLot1(String lot1) {
        __modifiedProperties.add("lot1");
        this._lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(255)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed)
     */
    public String getLot2() {
        return _lot2;
    }

    /**
     * [set] LOT2: {varchar(255)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed)
     */
    public void setLot2(String lot2) {
        __modifiedProperties.add("lot2");
        this._lot2 = lot2;
    }

    /**
     * [get] LOT3: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {varchar(255)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed)
     */
    public void setLot3(String lot3) {
        __modifiedProperties.add("lot3");
        this._lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed)
     */
    public String getLot4() {
        return _lot4;
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed)
     */
    public void setLot4(String lot4) {
        __modifiedProperties.add("lot4");
        this._lot4 = lot4;
    }

    /**
     * [get] DAMAGEFLG: {NotNull, char(1)} <br>
     * 良品・不良品区分
     * @return The value of the column 'DAMAGEFLG'. (NullAllowed)
     */
    public String getDamageflg() {
        return _damageflg;
    }

    /**
     * [set] DAMAGEFLG: {NotNull, char(1)} <br>
     * 良品・不良品区分
     * @param damageflg The value of the column 'DAMAGEFLG'. (NullAllowed)
     */
    public void setDamageflg(String damageflg) {
        __modifiedProperties.add("damageflg");
        this._damageflg = damageflg;
    }

    /**
     * [get] NOSHIPPINGFLG: {NotNull, char(1)} <br>
     * 出庫禁止フラグ
     * @return The value of the column 'NOSHIPPINGFLG'. (NullAllowed)
     */
    public String getNoshippingflg() {
        return _noshippingflg;
    }

    /**
     * [set] NOSHIPPINGFLG: {NotNull, char(1)} <br>
     * 出庫禁止フラグ
     * @param noshippingflg The value of the column 'NOSHIPPINGFLG'. (NullAllowed)
     */
    public void setNoshippingflg(String noshippingflg) {
        __modifiedProperties.add("noshippingflg");
        this._noshippingflg = noshippingflg;
    }

    /**
     * [get] FOREIGNCARGOFLG: {NotNull, char(1)} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public String getForeigncargoflg() {
        return _foreigncargoflg;
    }

    /**
     * [set] FOREIGNCARGOFLG: {NotNull, char(1)} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed)
     */
    public void setForeigncargoflg(String foreigncargoflg) {
        __modifiedProperties.add("foreigncargoflg");
        this._foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] CUSTOMSRELEASEFLG: {NotNull, char(1)} <br>
     * 通関済みフラグ
     * @return The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed)
     */
    public String getCustomsreleaseflg() {
        return _customsreleaseflg;
    }

    /**
     * [set] CUSTOMSRELEASEFLG: {NotNull, char(1)} <br>
     * 通関済みフラグ
     * @param customsreleaseflg The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed)
     */
    public void setCustomsreleaseflg(String customsreleaseflg) {
        __modifiedProperties.add("customsreleaseflg");
        this._customsreleaseflg = customsreleaseflg;
    }

    /**
     * [get] TAXFLG: {IX, NotNull, char(1)} <br>
     * 税区分
     * @return The value of the column 'TAXFLG'. (NullAllowed)
     */
    public String getTaxflg() {
        return _taxflg;
    }

    /**
     * [set] TAXFLG: {IX, NotNull, char(1)} <br>
     * 税区分
     * @param taxflg The value of the column 'TAXFLG'. (NullAllowed)
     */
    public void setTaxflg(String taxflg) {
        __modifiedProperties.add("taxflg");
        this._taxflg = taxflg;
    }

    /**
     * [get] TRANCEPORT_CD: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANCEPORT_CD'. (NullAllowed)
     */
    public String getTranceportCd() {
        return _tranceportCd;
    }

    /**
     * [set] TRANCEPORT_CD: {varchar(30)} <br>
     * 輸送番号
     * @param tranceportCd The value of the column 'TRANCEPORT_CD'. (NullAllowed)
     */
    public void setTranceportCd(String tranceportCd) {
        __modifiedProperties.add("tranceportCd");
        this._tranceportCd = tranceportCd;
    }

    /**
     * [get] SOURCE_CD: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SOURCE_CD'. (NullAllowed)
     */
    public String getSourceCd() {
        return _sourceCd;
    }

    /**
     * [set] SOURCE_CD: {varchar(30)} <br>
     * 発送元CD
     * @param sourceCd The value of the column 'SOURCE_CD'. (NullAllowed)
     */
    public void setSourceCd(String sourceCd) {
        __modifiedProperties.add("sourceCd");
        this._sourceCd = sourceCd;
    }

    /**
     * [get] SOURCE_NM: {varchar(60)} <br>
     * 発送元名称
     * @return The value of the column 'SOURCE_NM'. (NullAllowed)
     */
    public String getSourceNm() {
        return _sourceNm;
    }

    /**
     * [set] SOURCE_NM: {varchar(60)} <br>
     * 発送元名称
     * @param sourceNm The value of the column 'SOURCE_NM'. (NullAllowed)
     */
    public void setSourceNm(String sourceNm) {
        __modifiedProperties.add("sourceNm");
        this._sourceNm = sourceNm;
    }

    /**
     * [get] SCH_DT: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCH_DT'. (NullAllowed)
     */
    public String getSchDt() {
        return _schDt;
    }

    /**
     * [set] SCH_DT: {varchar(8)} <br>
     * 発送予定日
     * @param schDt The value of the column 'SCH_DT'. (NullAllowed)
     */
    public void setSchDt(String schDt) {
        __modifiedProperties.add("schDt");
        this._schDt = schDt;
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
