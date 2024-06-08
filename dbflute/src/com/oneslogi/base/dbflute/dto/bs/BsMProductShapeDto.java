package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_PRODUCT_SHAPE as TABLE. <br>
 * 商品荷姿マスタ
 * <pre>
 * [primary-key]
 *     PRODUCT_SHAPE_ID
 *
 * [column]
 *     PRODUCT_SHAPE_ID, PRODUCT_ID, SHAPE_GRP_DTL_ID, UNIT_NUM, LENGTH, WIDTH, HEIGHT, VOLUME, NET_WEIGHT, GROSS_WEIGHT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_SHAPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_PRODUCT, M_SHAPE_GRP_DTL, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer-table]
 *     M_LOCATION
 *
 * [foreign-property]
 *     mProduct, mShapeGrpDtl, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     mLocationByMaxStoreProductShapeIdList, mLocationByReplenishPProductShapeIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMProductShapeDto implements Serializable {

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
    /** PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _productShapeId;

    /** PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT} */
    @JsonKey
    protected Long _productId;

    /** SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL} */
    @JsonKey
    protected Long _shapeGrpDtlId;

    /** UNIT_NUM: {bigint(19)} */
    @JsonKey
    protected Long _unitNum;

    /** LENGTH: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _length;

    /** WIDTH: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _width;

    /** HEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _height;

    /** VOLUME: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _volume;

    /** NET_WEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _netWeight;

    /** GROSS_WEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _grossWeight;

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
    public BsMProductShapeDto() {
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

    protected MShapeGrpDtlDto _mShapeGrpDtl;

    public MShapeGrpDtlDto getMShapeGrpDtl() {
        return _mShapeGrpDtl;
    }

    public void setMShapeGrpDtl(MShapeGrpDtlDto mShapeGrpDtl) {
        this._mShapeGrpDtl = mShapeGrpDtl;
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
    protected List<MLocationDto> _mLocationByMaxStoreProductShapeIdList;

    public List<MLocationDto> getMLocationByMaxStoreProductShapeIdList() {
        if (_mLocationByMaxStoreProductShapeIdList == null) { _mLocationByMaxStoreProductShapeIdList = new ArrayList<MLocationDto>(); }
        return _mLocationByMaxStoreProductShapeIdList;
    }

    public void setMLocationByMaxStoreProductShapeIdList(List<MLocationDto> mLocationByMaxStoreProductShapeIdList) {
        this._mLocationByMaxStoreProductShapeIdList = mLocationByMaxStoreProductShapeIdList;
    }

    protected List<MLocationDto> _mLocationByReplenishPProductShapeIdList;

    public List<MLocationDto> getMLocationByReplenishPProductShapeIdList() {
        if (_mLocationByReplenishPProductShapeIdList == null) { _mLocationByReplenishPProductShapeIdList = new ArrayList<MLocationDto>(); }
        return _mLocationByReplenishPProductShapeIdList;
    }

    public void setMLocationByReplenishPProductShapeIdList(List<MLocationDto> mLocationByReplenishPProductShapeIdList) {
        this._mLocationByReplenishPProductShapeIdList = mLocationByReplenishPProductShapeIdList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMProductShapeDto)) { return false; }
        final BsMProductShapeDto otherEntity = (BsMProductShapeDto)other;
        if (!helpComparingValue(getProductShapeId(), otherEntity.getProductShapeId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_PRODUCT_SHAPE");
        result = xCH(result, getProductShapeId());
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
        sb.append(c).append(getProductShapeId());
        sb.append(c).append(getProductId());
        sb.append(c).append(getShapeGrpDtlId());
        sb.append(c).append(getUnitNum());
        sb.append(c).append(getLength());
        sb.append(c).append(getWidth());
        sb.append(c).append(getHeight());
        sb.append(c).append(getVolume());
        sb.append(c).append(getNetWeight());
        sb.append(c).append(getGrossWeight());
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
     * [get] PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 商品荷姿ID
     * @return The value of the column 'PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public Long getProductShapeId() {
        return _productShapeId;
    }

    /**
     * [set] PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 商品荷姿ID
     * @param productShapeId The value of the column 'PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public void setProductShapeId(Long productShapeId) {
        __modifiedProperties.add("productShapeId");
        this._productShapeId = productShapeId;
    }

    /**
     * [get] PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL} <br>
     * 荷姿グループ明細ID
     * @return The value of the column 'SHAPE_GRP_DTL_ID'. (NullAllowed)
     */
    public Long getShapeGrpDtlId() {
        return _shapeGrpDtlId;
    }

    /**
     * [set] SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL} <br>
     * 荷姿グループ明細ID
     * @param shapeGrpDtlId The value of the column 'SHAPE_GRP_DTL_ID'. (NullAllowed)
     */
    public void setShapeGrpDtlId(Long shapeGrpDtlId) {
        __modifiedProperties.add("shapeGrpDtlId");
        this._shapeGrpDtlId = shapeGrpDtlId;
    }

    /**
     * [get] UNIT_NUM: {bigint(19)} <br>
     * 入数
     * @return The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public Long getUnitNum() {
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {bigint(19)} <br>
     * 入数
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public void setUnitNum(Long unitNum) {
        __modifiedProperties.add("unitNum");
        this._unitNum = unitNum;
    }

    /**
     * [get] LENGTH: {decimal(16, 6)} <br>
     * 縦(mm)
     * @return The value of the column 'LENGTH'. (NullAllowed)
     */
    public java.math.BigDecimal getLength() {
        return _length;
    }

    /**
     * [set] LENGTH: {decimal(16, 6)} <br>
     * 縦(mm)
     * @param length The value of the column 'LENGTH'. (NullAllowed)
     */
    public void setLength(java.math.BigDecimal length) {
        __modifiedProperties.add("length");
        this._length = length;
    }

    /**
     * [get] WIDTH: {decimal(16, 6)} <br>
     * 横(mm)
     * @return The value of the column 'WIDTH'. (NullAllowed)
     */
    public java.math.BigDecimal getWidth() {
        return _width;
    }

    /**
     * [set] WIDTH: {decimal(16, 6)} <br>
     * 横(mm)
     * @param width The value of the column 'WIDTH'. (NullAllowed)
     */
    public void setWidth(java.math.BigDecimal width) {
        __modifiedProperties.add("width");
        this._width = width;
    }

    /**
     * [get] HEIGHT: {decimal(16, 6)} <br>
     * 高さ(mm)
     * @return The value of the column 'HEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getHeight() {
        return _height;
    }

    /**
     * [set] HEIGHT: {decimal(16, 6)} <br>
     * 高さ(mm)
     * @param height The value of the column 'HEIGHT'. (NullAllowed)
     */
    public void setHeight(java.math.BigDecimal height) {
        __modifiedProperties.add("height");
        this._height = height;
    }

    /**
     * [get] VOLUME: {decimal(16, 6)} <br>
     * 容積(mm3)
     * @return The value of the column 'VOLUME'. (NullAllowed)
     */
    public java.math.BigDecimal getVolume() {
        return _volume;
    }

    /**
     * [set] VOLUME: {decimal(16, 6)} <br>
     * 容積(mm3)
     * @param volume The value of the column 'VOLUME'. (NullAllowed)
     */
    public void setVolume(java.math.BigDecimal volume) {
        __modifiedProperties.add("volume");
        this._volume = volume;
    }

    /**
     * [get] NET_WEIGHT: {decimal(16, 6)} <br>
     * 商品重量(g)
     * @return The value of the column 'NET_WEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getNetWeight() {
        return _netWeight;
    }

    /**
     * [set] NET_WEIGHT: {decimal(16, 6)} <br>
     * 商品重量(g)
     * @param netWeight The value of the column 'NET_WEIGHT'. (NullAllowed)
     */
    public void setNetWeight(java.math.BigDecimal netWeight) {
        __modifiedProperties.add("netWeight");
        this._netWeight = netWeight;
    }

    /**
     * [get] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * 総重量(g)
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getGrossWeight() {
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * 総重量(g)
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public void setGrossWeight(java.math.BigDecimal grossWeight) {
        __modifiedProperties.add("grossWeight");
        this._grossWeight = grossWeight;
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
