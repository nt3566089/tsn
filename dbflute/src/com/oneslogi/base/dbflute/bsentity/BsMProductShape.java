package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of M_PRODUCT_SHAPE as TABLE. <br>
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
 * [foreign table]
 *     M_PRODUCT, M_SHAPE_GRP_DTL, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_LOCATION
 *
 * [foreign property]
 *     mProduct, mShapeGrpDtl, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mLocationByMaxStoreProductShapeIdList, mLocationByReplenishPProductShapeIdList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long productShapeId = entity.getProductShapeId();
 * Long productId = entity.getProductId();
 * Long shapeGrpDtlId = entity.getShapeGrpDtlId();
 * Long unitNum = entity.getUnitNum();
 * java.math.BigDecimal length = entity.getLength();
 * java.math.BigDecimal width = entity.getWidth();
 * java.math.BigDecimal height = entity.getHeight();
 * java.math.BigDecimal volume = entity.getVolume();
 * java.math.BigDecimal netWeight = entity.getNetWeight();
 * java.math.BigDecimal grossWeight = entity.getGrossWeight();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setProductShapeId(productShapeId);
 * entity.setProductId(productId);
 * entity.setShapeGrpDtlId(shapeGrpDtlId);
 * entity.setUnitNum(unitNum);
 * entity.setLength(length);
 * entity.setWidth(width);
 * entity.setHeight(height);
 * entity.setVolume(volume);
 * entity.setNetWeight(netWeight);
 * entity.setGrossWeight(grossWeight);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMProductShape extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _productShapeId;

    /** PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT} */
    protected Long _productId;

    /** SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL} */
    protected Long _shapeGrpDtlId;

    /** UNIT_NUM: {bigint(19)} */
    protected Long _unitNum;

    /** LENGTH: {decimal(16, 6)} */
    protected java.math.BigDecimal _length;

    /** WIDTH: {decimal(16, 6)} */
    protected java.math.BigDecimal _width;

    /** HEIGHT: {decimal(16, 6)} */
    protected java.math.BigDecimal _height;

    /** VOLUME: {decimal(16, 6)} */
    protected java.math.BigDecimal _volume;

    /** NET_WEIGHT: {decimal(16, 6)} */
    protected java.math.BigDecimal _netWeight;

    /** GROSS_WEIGHT: {decimal(16, 6)} */
    protected java.math.BigDecimal _grossWeight;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "M_PRODUCT_SHAPE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_productShapeId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param productId : UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT. (NotNull)
     * @param shapeGrpDtlId : +UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL. (NotNull)
     */
    public void uniqueBy(Long productId, Long shapeGrpDtlId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("productId");
        __uniqueDrivenProperties.addPropertyName("shapeGrpDtlId");
        setProductId(productId);setShapeGrpDtlId(shapeGrpDtlId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** M_PRODUCT by my PRODUCT_ID, named 'MProduct'. */
    protected MProduct _mProduct;

    /**
     * [get] M_PRODUCT by my PRODUCT_ID, named 'MProduct'. <br>
     * @return The entity of foreign property 'MProduct'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProduct getMProduct() {
        return _mProduct;
    }

    /**
     * [set] M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param mProduct The entity of foreign property 'MProduct'. (NullAllowed)
     */
    public void setMProduct(MProduct mProduct) {
        _mProduct = mProduct;
    }

    /** M_SHAPE_GRP_DTL by my SHAPE_GRP_DTL_ID, named 'MShapeGrpDtl'. */
    protected MShapeGrpDtl _mShapeGrpDtl;

    /**
     * [get] M_SHAPE_GRP_DTL by my SHAPE_GRP_DTL_ID, named 'MShapeGrpDtl'. <br>
     * @return The entity of foreign property 'MShapeGrpDtl'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MShapeGrpDtl getMShapeGrpDtl() {
        return _mShapeGrpDtl;
    }

    /**
     * [set] M_SHAPE_GRP_DTL by my SHAPE_GRP_DTL_ID, named 'MShapeGrpDtl'.
     * @param mShapeGrpDtl The entity of foreign property 'MShapeGrpDtl'. (NullAllowed)
     */
    public void setMShapeGrpDtl(MShapeGrpDtl mShapeGrpDtl) {
        _mShapeGrpDtl = mShapeGrpDtl;
    }

    /** B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_LOCATION by MAX_STORE_PRODUCT_SHAPE_ID, named 'MLocationByMaxStoreProductShapeIdList'. */
    protected List<MLocation> _mLocationByMaxStoreProductShapeIdList;

    /**
     * [get] M_LOCATION by MAX_STORE_PRODUCT_SHAPE_ID, named 'MLocationByMaxStoreProductShapeIdList'.
     * @return The entity list of referrer property 'MLocationByMaxStoreProductShapeIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MLocation> getMLocationByMaxStoreProductShapeIdList() {
        if (_mLocationByMaxStoreProductShapeIdList == null) { _mLocationByMaxStoreProductShapeIdList = newReferrerList(); }
        return _mLocationByMaxStoreProductShapeIdList;
    }

    /**
     * [set] M_LOCATION by MAX_STORE_PRODUCT_SHAPE_ID, named 'MLocationByMaxStoreProductShapeIdList'.
     * @param mLocationByMaxStoreProductShapeIdList The entity list of referrer property 'MLocationByMaxStoreProductShapeIdList'. (NullAllowed)
     */
    public void setMLocationByMaxStoreProductShapeIdList(List<MLocation> mLocationByMaxStoreProductShapeIdList) {
        _mLocationByMaxStoreProductShapeIdList = mLocationByMaxStoreProductShapeIdList;
    }

    /** M_LOCATION by REPLENISH_P_PRODUCT_SHAPE_ID, named 'MLocationByReplenishPProductShapeIdList'. */
    protected List<MLocation> _mLocationByReplenishPProductShapeIdList;

    /**
     * [get] M_LOCATION by REPLENISH_P_PRODUCT_SHAPE_ID, named 'MLocationByReplenishPProductShapeIdList'.
     * @return The entity list of referrer property 'MLocationByReplenishPProductShapeIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MLocation> getMLocationByReplenishPProductShapeIdList() {
        if (_mLocationByReplenishPProductShapeIdList == null) { _mLocationByReplenishPProductShapeIdList = newReferrerList(); }
        return _mLocationByReplenishPProductShapeIdList;
    }

    /**
     * [set] M_LOCATION by REPLENISH_P_PRODUCT_SHAPE_ID, named 'MLocationByReplenishPProductShapeIdList'.
     * @param mLocationByReplenishPProductShapeIdList The entity list of referrer property 'MLocationByReplenishPProductShapeIdList'. (NullAllowed)
     */
    public void setMLocationByReplenishPProductShapeIdList(List<MLocation> mLocationByReplenishPProductShapeIdList) {
        _mLocationByReplenishPProductShapeIdList = mLocationByReplenishPProductShapeIdList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMProductShape) {
            BsMProductShape other = (BsMProductShape)obj;
            if (!xSV(_productShapeId, other._productShapeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productShapeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_mShapeGrpDtl != null)
        { sb.append(li).append(xbRDS(_mShapeGrpDtl, "mShapeGrpDtl")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_mLocationByMaxStoreProductShapeIdList != null) { for (MLocation et : _mLocationByMaxStoreProductShapeIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mLocationByMaxStoreProductShapeIdList")); } } }
        if (_mLocationByReplenishPProductShapeIdList != null) { for (MLocation et : _mLocationByReplenishPProductShapeIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mLocationByReplenishPProductShapeIdList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productShapeId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_shapeGrpDtlId));
        sb.append(dm).append(xfND(_unitNum));
        sb.append(dm).append(xfND(_length));
        sb.append(dm).append(xfND(_width));
        sb.append(dm).append(xfND(_height));
        sb.append(dm).append(xfND(_volume));
        sb.append(dm).append(xfND(_netWeight));
        sb.append(dm).append(xfND(_grossWeight));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_mShapeGrpDtl != null)
        { sb.append(dm).append("mShapeGrpDtl"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_mLocationByMaxStoreProductShapeIdList != null && !_mLocationByMaxStoreProductShapeIdList.isEmpty())
        { sb.append(dm).append("mLocationByMaxStoreProductShapeIdList"); }
        if (_mLocationByReplenishPProductShapeIdList != null && !_mLocationByReplenishPProductShapeIdList.isEmpty())
        { sb.append(dm).append("mLocationByReplenishPProductShapeIdList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MProductShape clone() {
        return (MProductShape)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 商品荷姿ID
     * @return The value of the column 'PRODUCT_SHAPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductShapeId() {
        checkSpecifiedProperty("productShapeId");
        return _productShapeId;
    }

    /**
     * [set] PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 商品荷姿ID
     * @param productShapeId The value of the column 'PRODUCT_SHAPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductShapeId(Long productShapeId) {
        registerModifiedProperty("productShapeId");
        _productShapeId = productShapeId;
    }

    /**
     * [get] PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL} <br>
     * 荷姿グループ明細ID
     * @return The value of the column 'SHAPE_GRP_DTL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShapeGrpDtlId() {
        checkSpecifiedProperty("shapeGrpDtlId");
        return _shapeGrpDtlId;
    }

    /**
     * [set] SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL} <br>
     * 荷姿グループ明細ID
     * @param shapeGrpDtlId The value of the column 'SHAPE_GRP_DTL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShapeGrpDtlId(Long shapeGrpDtlId) {
        registerModifiedProperty("shapeGrpDtlId");
        _shapeGrpDtlId = shapeGrpDtlId;
    }

    /**
     * [get] UNIT_NUM: {bigint(19)} <br>
     * 入数
     * @return The value of the column 'UNIT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnitNum() {
        checkSpecifiedProperty("unitNum");
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {bigint(19)} <br>
     * 入数
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNum(Long unitNum) {
        registerModifiedProperty("unitNum");
        _unitNum = unitNum;
    }

    /**
     * [get] LENGTH: {decimal(16, 6)} <br>
     * 縦(mm)
     * @return The value of the column 'LENGTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getLength() {
        checkSpecifiedProperty("length");
        return _length;
    }

    /**
     * [set] LENGTH: {decimal(16, 6)} <br>
     * 縦(mm)
     * @param length The value of the column 'LENGTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLength(java.math.BigDecimal length) {
        registerModifiedProperty("length");
        _length = length;
    }

    /**
     * [get] WIDTH: {decimal(16, 6)} <br>
     * 横(mm)
     * @return The value of the column 'WIDTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getWidth() {
        checkSpecifiedProperty("width");
        return _width;
    }

    /**
     * [set] WIDTH: {decimal(16, 6)} <br>
     * 横(mm)
     * @param width The value of the column 'WIDTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWidth(java.math.BigDecimal width) {
        registerModifiedProperty("width");
        _width = width;
    }

    /**
     * [get] HEIGHT: {decimal(16, 6)} <br>
     * 高さ(mm)
     * @return The value of the column 'HEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getHeight() {
        checkSpecifiedProperty("height");
        return _height;
    }

    /**
     * [set] HEIGHT: {decimal(16, 6)} <br>
     * 高さ(mm)
     * @param height The value of the column 'HEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHeight(java.math.BigDecimal height) {
        registerModifiedProperty("height");
        _height = height;
    }

    /**
     * [get] VOLUME: {decimal(16, 6)} <br>
     * 容積(mm3)
     * @return The value of the column 'VOLUME'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getVolume() {
        checkSpecifiedProperty("volume");
        return _volume;
    }

    /**
     * [set] VOLUME: {decimal(16, 6)} <br>
     * 容積(mm3)
     * @param volume The value of the column 'VOLUME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVolume(java.math.BigDecimal volume) {
        registerModifiedProperty("volume");
        _volume = volume;
    }

    /**
     * [get] NET_WEIGHT: {decimal(16, 6)} <br>
     * 商品重量(g)
     * @return The value of the column 'NET_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNetWeight() {
        checkSpecifiedProperty("netWeight");
        return _netWeight;
    }

    /**
     * [set] NET_WEIGHT: {decimal(16, 6)} <br>
     * 商品重量(g)
     * @param netWeight The value of the column 'NET_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNetWeight(java.math.BigDecimal netWeight) {
        registerModifiedProperty("netWeight");
        _netWeight = netWeight;
    }

    /**
     * [get] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * 総重量(g)
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getGrossWeight() {
        checkSpecifiedProperty("grossWeight");
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * 総重量(g)
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGrossWeight(java.math.BigDecimal grossWeight) {
        registerModifiedProperty("grossWeight");
        _grossWeight = grossWeight;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
