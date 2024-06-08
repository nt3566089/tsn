package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_YTRSODETAIL as TABLE. <br>
 * 山出し指示ボディ
 * <pre>
 * [primary-key]
 *     TRSODETAIL_ID
 *
 * [column]
 *     TRSODETAIL_ID, TRSO_ID, PRODUCT_ID, SO_LINE_NO, PRODUCT_CD, IFITEM_CD, LOCATION_ID, LOCATION_CD, DAMAGE_FLG, NO_SHIPPING_FLG, EXPECT_QTY, ALLOC_QTY, PICKED_QTY, SORTED_QTY, INSPECTED_QTY, SHIPPED_QTY, ADJUST_QTY, LOC_FLG, STD_DIF_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSODETAIL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_YTRSO, M_PRODUCT
 *
 * [referrer-table]
 *     T_TRIMALLOCSCHKRI, T_TRPICKDETAIL
 *
 * [foreign-property]
 *     tYtrso, mProduct
 *
 * [referrer-property]
 *     tTrimallocschkriList, tTrpickdetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTYtrsodetailDto implements Serializable {

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
    /** TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trsodetailId;

    /** TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO} */
    @JsonKey
    protected Long _trsoId;

    /** PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} */
    @JsonKey
    protected Long _productId;

    /** SO_LINE_NO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _soLineNo;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** IFITEM_CD: {varchar(30)} */
    @JsonKey
    protected String _ifitemCd;

    /** LOCATION_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _locationId;

    /** LOCATION_CD: {IX+, NotNull, varchar(30)} */
    @JsonKey
    protected String _locationCd;

    /** DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _damageFlg;

    /** NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _noShippingFlg;

    /** EXPECT_QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _expectQty;

    /** ALLOC_QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _allocQty;

    /** PICKED_QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _pickedQty;

    /** SORTED_QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _sortedQty;

    /** INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _inspectedQty;

    /** SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _shippedQty;

    /** ADJUST_QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _adjustQty;

    /** LOC_FLG: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _locFlg;

    /** STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _stdDifFlg;

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
    public BsTYtrsodetailDto() {
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
    protected TYtrsoDto _tYtrso;

    public TYtrsoDto getTYtrso() {
        return _tYtrso;
    }

    public void setTYtrso(TYtrsoDto tYtrso) {
        this._tYtrso = tYtrso;
    }

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
    protected List<TTrimallocschkriDto> _tTrimallocschkriList;

    public List<TTrimallocschkriDto> getTTrimallocschkriList() {
        if (_tTrimallocschkriList == null) { _tTrimallocschkriList = new ArrayList<TTrimallocschkriDto>(); }
        return _tTrimallocschkriList;
    }

    public void setTTrimallocschkriList(List<TTrimallocschkriDto> tTrimallocschkriList) {
        this._tTrimallocschkriList = tTrimallocschkriList;
    }

    protected List<TTrpickdetailDto> _tTrpickdetailList;

    public List<TTrpickdetailDto> getTTrpickdetailList() {
        if (_tTrpickdetailList == null) { _tTrpickdetailList = new ArrayList<TTrpickdetailDto>(); }
        return _tTrpickdetailList;
    }

    public void setTTrpickdetailList(List<TTrpickdetailDto> tTrpickdetailList) {
        this._tTrpickdetailList = tTrpickdetailList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTYtrsodetailDto)) { return false; }
        final BsTYtrsodetailDto otherEntity = (BsTYtrsodetailDto)other;
        if (!helpComparingValue(getTrsodetailId(), otherEntity.getTrsodetailId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_YTRSODETAIL");
        result = xCH(result, getTrsodetailId());
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
        sb.append(c).append(getTrsodetailId());
        sb.append(c).append(getTrsoId());
        sb.append(c).append(getProductId());
        sb.append(c).append(getSoLineNo());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getIfitemCd());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getDamageFlg());
        sb.append(c).append(getNoShippingFlg());
        sb.append(c).append(getExpectQty());
        sb.append(c).append(getAllocQty());
        sb.append(c).append(getPickedQty());
        sb.append(c).append(getSortedQty());
        sb.append(c).append(getInspectedQty());
        sb.append(c).append(getShippedQty());
        sb.append(c).append(getAdjustQty());
        sb.append(c).append(getLocFlg());
        sb.append(c).append(getStdDifFlg());
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
     * [get] TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し指示ボディID
     * @return The value of the column 'TRSODETAIL_ID'. (NullAllowed)
     */
    public Long getTrsodetailId() {
        return _trsodetailId;
    }

    /**
     * [set] TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し指示ボディID
     * @param trsodetailId The value of the column 'TRSODETAIL_ID'. (NullAllowed)
     */
    public void setTrsodetailId(Long trsodetailId) {
        __modifiedProperties.add("trsodetailId");
        this._trsodetailId = trsodetailId;
    }

    /**
     * [get] TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO} <br>
     * 山出し指示ヘッダID
     * @return The value of the column 'TRSO_ID'. (NullAllowed)
     */
    public Long getTrsoId() {
        return _trsoId;
    }

    /**
     * [set] TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO} <br>
     * 山出し指示ヘッダID
     * @param trsoId The value of the column 'TRSO_ID'. (NullAllowed)
     */
    public void setTrsoId(Long trsoId) {
        __modifiedProperties.add("trsoId");
        this._trsoId = trsoId;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] SO_LINE_NO: {NotNull, bigint(19)} <br>
     * 山出し指示行No.
     * @return The value of the column 'SO_LINE_NO'. (NullAllowed)
     */
    public Long getSoLineNo() {
        return _soLineNo;
    }

    /**
     * [set] SO_LINE_NO: {NotNull, bigint(19)} <br>
     * 山出し指示行No.
     * @param soLineNo The value of the column 'SO_LINE_NO'. (NullAllowed)
     */
    public void setSoLineNo(Long soLineNo) {
        __modifiedProperties.add("soLineNo");
        this._soLineNo = soLineNo;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] IFITEM_CD: {varchar(30)} <br>
     * I/F銘柄CD
     * @return The value of the column 'IFITEM_CD'. (NullAllowed)
     */
    public String getIfitemCd() {
        return _ifitemCd;
    }

    /**
     * [set] IFITEM_CD: {varchar(30)} <br>
     * I/F銘柄CD
     * @param ifitemCd The value of the column 'IFITEM_CD'. (NullAllowed)
     */
    public void setIfitemCd(String ifitemCd) {
        __modifiedProperties.add("ifitemCd");
        this._ifitemCd = ifitemCd;
    }

    /**
     * [get] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] LOCATION_CD: {IX+, NotNull, varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {IX+, NotNull, varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * 良品・不良品区分
     * @return The value of the column 'DAMAGE_FLG'. (NullAllowed)
     */
    public Long getDamageFlg() {
        return _damageFlg;
    }

    /**
     * [set] DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * 良品・不良品区分
     * @param damageFlg The value of the column 'DAMAGE_FLG'. (NullAllowed)
     */
    public void setDamageFlg(Long damageFlg) {
        __modifiedProperties.add("damageFlg");
        this._damageFlg = damageFlg;
    }

    /**
     * [get] NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * 出荷禁止フラグ
     * @return The value of the column 'NO_SHIPPING_FLG'. (NullAllowed)
     */
    public Long getNoShippingFlg() {
        return _noShippingFlg;
    }

    /**
     * [set] NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * 出荷禁止フラグ
     * @param noShippingFlg The value of the column 'NO_SHIPPING_FLG'. (NullAllowed)
     */
    public void setNoShippingFlg(Long noShippingFlg) {
        __modifiedProperties.add("noShippingFlg");
        this._noShippingFlg = noShippingFlg;
    }

    /**
     * [get] EXPECT_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 個装数量
     * @return The value of the column 'EXPECT_QTY'. (NullAllowed)
     */
    public Long getExpectQty() {
        return _expectQty;
    }

    /**
     * [set] EXPECT_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 個装数量
     * @param expectQty The value of the column 'EXPECT_QTY'. (NullAllowed)
     */
    public void setExpectQty(Long expectQty) {
        __modifiedProperties.add("expectQty");
        this._expectQty = expectQty;
    }

    /**
     * [get] ALLOC_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 山出し数量
     * @return The value of the column 'ALLOC_QTY'. (NullAllowed)
     */
    public Long getAllocQty() {
        return _allocQty;
    }

    /**
     * [set] ALLOC_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 山出し数量
     * @param allocQty The value of the column 'ALLOC_QTY'. (NullAllowed)
     */
    public void setAllocQty(Long allocQty) {
        __modifiedProperties.add("allocQty");
        this._allocQty = allocQty;
    }

    /**
     * [get] PICKED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量
     * @return The value of the column 'PICKED_QTY'. (NullAllowed)
     */
    public Long getPickedQty() {
        return _pickedQty;
    }

    /**
     * [set] PICKED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量
     * @param pickedQty The value of the column 'PICKED_QTY'. (NullAllowed)
     */
    public void setPickedQty(Long pickedQty) {
        __modifiedProperties.add("pickedQty");
        this._pickedQty = pickedQty;
    }

    /**
     * [get] SORTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量
     * @return The value of the column 'SORTED_QTY'. (NullAllowed)
     */
    public Long getSortedQty() {
        return _sortedQty;
    }

    /**
     * [set] SORTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量
     * @param sortedQty The value of the column 'SORTED_QTY'. (NullAllowed)
     */
    public void setSortedQty(Long sortedQty) {
        __modifiedProperties.add("sortedQty");
        this._sortedQty = sortedQty;
    }

    /**
     * [get] INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量
     * @return The value of the column 'INSPECTED_QTY'. (NullAllowed)
     */
    public Long getInspectedQty() {
        return _inspectedQty;
    }

    /**
     * [set] INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量
     * @param inspectedQty The value of the column 'INSPECTED_QTY'. (NullAllowed)
     */
    public void setInspectedQty(Long inspectedQty) {
        __modifiedProperties.add("inspectedQty");
        this._inspectedQty = inspectedQty;
    }

    /**
     * [get] SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 出荷実績数量
     * @return The value of the column 'SHIPPED_QTY'. (NullAllowed)
     */
    public Long getShippedQty() {
        return _shippedQty;
    }

    /**
     * [set] SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 出荷実績数量
     * @param shippedQty The value of the column 'SHIPPED_QTY'. (NullAllowed)
     */
    public void setShippedQty(Long shippedQty) {
        __modifiedProperties.add("shippedQty");
        this._shippedQty = shippedQty;
    }

    /**
     * [get] ADJUST_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 取消数量(個)
     * @return The value of the column 'ADJUST_QTY'. (NullAllowed)
     */
    public Long getAdjustQty() {
        return _adjustQty;
    }

    /**
     * [set] ADJUST_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 取消数量(個)
     * @param adjustQty The value of the column 'ADJUST_QTY'. (NullAllowed)
     */
    public void setAdjustQty(Long adjustQty) {
        __modifiedProperties.add("adjustQty");
        this._adjustQty = adjustQty;
    }

    /**
     * [get] LOC_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * ロケ区分
     * @return The value of the column 'LOC_FLG'. (NullAllowed)
     */
    public Long getLocFlg() {
        return _locFlg;
    }

    /**
     * [set] LOC_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * ロケ区分
     * @param locFlg The value of the column 'LOC_FLG'. (NullAllowed)
     */
    public void setLocFlg(Long locFlg) {
        __modifiedProperties.add("locFlg");
        this._locFlg = locFlg;
    }

    /**
     * [get] STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * 通常・異型品区分
     * @return The value of the column 'STD_DIF_FLG'. (NullAllowed)
     */
    public Long getStdDifFlg() {
        return _stdDifFlg;
    }

    /**
     * [set] STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * 通常・異型品区分
     * @param stdDifFlg The value of the column 'STD_DIF_FLG'. (NullAllowed)
     */
    public void setStdDifFlg(Long stdDifFlg) {
        __modifiedProperties.add("stdDifFlg");
        this._stdDifFlg = stdDifFlg;
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
