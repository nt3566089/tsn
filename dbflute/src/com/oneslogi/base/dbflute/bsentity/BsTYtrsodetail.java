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
 * The entity of T_YTRSODETAIL as TABLE. <br>
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
 * [foreign table]
 *     T_YTRSO, M_PRODUCT
 *
 * [referrer table]
 *     T_TRIMALLOCSCHKRI, T_TRPICKDETAIL
 *
 * [foreign property]
 *     tYtrso, mProduct
 *
 * [referrer property]
 *     tTrimallocschkriList, tTrpickdetailList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trsodetailId = entity.getTrsodetailId();
 * Long trsoId = entity.getTrsoId();
 * Long productId = entity.getProductId();
 * Long soLineNo = entity.getSoLineNo();
 * String productCd = entity.getProductCd();
 * String ifitemCd = entity.getIfitemCd();
 * Long locationId = entity.getLocationId();
 * String locationCd = entity.getLocationCd();
 * Long damageFlg = entity.getDamageFlg();
 * Long noShippingFlg = entity.getNoShippingFlg();
 * Long expectQty = entity.getExpectQty();
 * Long allocQty = entity.getAllocQty();
 * Long pickedQty = entity.getPickedQty();
 * Long sortedQty = entity.getSortedQty();
 * Long inspectedQty = entity.getInspectedQty();
 * Long shippedQty = entity.getShippedQty();
 * Long adjustQty = entity.getAdjustQty();
 * Long locFlg = entity.getLocFlg();
 * Long stdDifFlg = entity.getStdDifFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrsodetailId(trsodetailId);
 * entity.setTrsoId(trsoId);
 * entity.setProductId(productId);
 * entity.setSoLineNo(soLineNo);
 * entity.setProductCd(productCd);
 * entity.setIfitemCd(ifitemCd);
 * entity.setLocationId(locationId);
 * entity.setLocationCd(locationCd);
 * entity.setDamageFlg(damageFlg);
 * entity.setNoShippingFlg(noShippingFlg);
 * entity.setExpectQty(expectQty);
 * entity.setAllocQty(allocQty);
 * entity.setPickedQty(pickedQty);
 * entity.setSortedQty(sortedQty);
 * entity.setInspectedQty(inspectedQty);
 * entity.setShippedQty(shippedQty);
 * entity.setAdjustQty(adjustQty);
 * entity.setLocFlg(locFlg);
 * entity.setStdDifFlg(stdDifFlg);
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
public abstract class BsTYtrsodetail extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trsodetailId;

    /** TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO} */
    protected Long _trsoId;

    /** PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} */
    protected Long _productId;

    /** SO_LINE_NO: {NotNull, bigint(19)} */
    protected Long _soLineNo;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** IFITEM_CD: {varchar(30)} */
    protected String _ifitemCd;

    /** LOCATION_ID: {NotNull, bigint(19)} */
    protected Long _locationId;

    /** LOCATION_CD: {IX+, NotNull, varchar(30)} */
    protected String _locationCd;

    /** DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]} */
    protected Long _damageFlg;

    /** NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]} */
    protected Long _noShippingFlg;

    /** EXPECT_QTY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _expectQty;

    /** ALLOC_QTY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _allocQty;

    /** PICKED_QTY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _pickedQty;

    /** SORTED_QTY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _sortedQty;

    /** INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _inspectedQty;

    /** SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _shippedQty;

    /** ADJUST_QTY: {NotNull, bigint(19), default=[(0)]} */
    protected Long _adjustQty;

    /** LOC_FLG: {NotNull, bigint(19), default=[(0)]} */
    protected Long _locFlg;

    /** STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]} */
    protected Long _stdDifFlg;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
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
        return "T_YTRSODETAIL";
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
        if (_trsodetailId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
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
    /** T_YTRSO by my TRSO_ID, named 'TYtrso'. */
    protected TYtrso _tYtrso;

    /**
     * [get] T_YTRSO by my TRSO_ID, named 'TYtrso'. <br>
     * @return The entity of foreign property 'TYtrso'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TYtrso getTYtrso() {
        return _tYtrso;
    }

    /**
     * [set] T_YTRSO by my TRSO_ID, named 'TYtrso'.
     * @param tYtrso The entity of foreign property 'TYtrso'. (NullAllowed)
     */
    public void setTYtrso(TYtrso tYtrso) {
        _tYtrso = tYtrso;
    }

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

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_TRIMALLOCSCHKRI by TRSODETAIL_ID, named 'TTrimallocschkriList'. */
    protected List<TTrimallocschkri> _tTrimallocschkriList;

    /**
     * [get] T_TRIMALLOCSCHKRI by TRSODETAIL_ID, named 'TTrimallocschkriList'.
     * @return The entity list of referrer property 'TTrimallocschkriList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrimallocschkri> getTTrimallocschkriList() {
        if (_tTrimallocschkriList == null) { _tTrimallocschkriList = newReferrerList(); }
        return _tTrimallocschkriList;
    }

    /**
     * [set] T_TRIMALLOCSCHKRI by TRSODETAIL_ID, named 'TTrimallocschkriList'.
     * @param tTrimallocschkriList The entity list of referrer property 'TTrimallocschkriList'. (NullAllowed)
     */
    public void setTTrimallocschkriList(List<TTrimallocschkri> tTrimallocschkriList) {
        _tTrimallocschkriList = tTrimallocschkriList;
    }

    /** T_TRPICKDETAIL by TRSODETAIL_ID, named 'TTrpickdetailList'. */
    protected List<TTrpickdetail> _tTrpickdetailList;

    /**
     * [get] T_TRPICKDETAIL by TRSODETAIL_ID, named 'TTrpickdetailList'.
     * @return The entity list of referrer property 'TTrpickdetailList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TTrpickdetail> getTTrpickdetailList() {
        if (_tTrpickdetailList == null) { _tTrpickdetailList = newReferrerList(); }
        return _tTrpickdetailList;
    }

    /**
     * [set] T_TRPICKDETAIL by TRSODETAIL_ID, named 'TTrpickdetailList'.
     * @param tTrpickdetailList The entity list of referrer property 'TTrpickdetailList'. (NullAllowed)
     */
    public void setTTrpickdetailList(List<TTrpickdetail> tTrpickdetailList) {
        _tTrpickdetailList = tTrpickdetailList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTYtrsodetail) {
            BsTYtrsodetail other = (BsTYtrsodetail)obj;
            if (!xSV(_trsodetailId, other._trsodetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trsodetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tYtrso != null)
        { sb.append(li).append(xbRDS(_tYtrso, "tYtrso")); }
        if (_mProduct != null)
        { sb.append(li).append(xbRDS(_mProduct, "mProduct")); }
        if (_tTrimallocschkriList != null) { for (TTrimallocschkri et : _tTrimallocschkriList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrimallocschkriList")); } } }
        if (_tTrpickdetailList != null) { for (TTrpickdetail et : _tTrpickdetailList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tTrpickdetailList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trsodetailId));
        sb.append(dm).append(xfND(_trsoId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_soLineNo));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_ifitemCd));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_damageFlg));
        sb.append(dm).append(xfND(_noShippingFlg));
        sb.append(dm).append(xfND(_expectQty));
        sb.append(dm).append(xfND(_allocQty));
        sb.append(dm).append(xfND(_pickedQty));
        sb.append(dm).append(xfND(_sortedQty));
        sb.append(dm).append(xfND(_inspectedQty));
        sb.append(dm).append(xfND(_shippedQty));
        sb.append(dm).append(xfND(_adjustQty));
        sb.append(dm).append(xfND(_locFlg));
        sb.append(dm).append(xfND(_stdDifFlg));
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
        if (_tYtrso != null)
        { sb.append(dm).append("tYtrso"); }
        if (_mProduct != null)
        { sb.append(dm).append("mProduct"); }
        if (_tTrimallocschkriList != null && !_tTrimallocschkriList.isEmpty())
        { sb.append(dm).append("tTrimallocschkriList"); }
        if (_tTrpickdetailList != null && !_tTrpickdetailList.isEmpty())
        { sb.append(dm).append("tTrpickdetailList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TYtrsodetail clone() {
        return (TYtrsodetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し指示ボディID
     * @return The value of the column 'TRSODETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrsodetailId() {
        checkSpecifiedProperty("trsodetailId");
        return _trsodetailId;
    }

    /**
     * [set] TRSODETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 山出し指示ボディID
     * @param trsodetailId The value of the column 'TRSODETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrsodetailId(Long trsodetailId) {
        registerModifiedProperty("trsodetailId");
        _trsodetailId = trsodetailId;
    }

    /**
     * [get] TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO} <br>
     * 山出し指示ヘッダID
     * @return The value of the column 'TRSO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrsoId() {
        checkSpecifiedProperty("trsoId");
        return _trsoId;
    }

    /**
     * [set] TRSO_ID: {NotNull, bigint(19), FK to T_YTRSO} <br>
     * 山出し指示ヘッダID
     * @param trsoId The value of the column 'TRSO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrsoId(Long trsoId) {
        registerModifiedProperty("trsoId");
        _trsoId = trsoId;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] SO_LINE_NO: {NotNull, bigint(19)} <br>
     * 山出し指示行No.
     * @return The value of the column 'SO_LINE_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getSoLineNo() {
        checkSpecifiedProperty("soLineNo");
        return _soLineNo;
    }

    /**
     * [set] SO_LINE_NO: {NotNull, bigint(19)} <br>
     * 山出し指示行No.
     * @param soLineNo The value of the column 'SO_LINE_NO'. (basically NotNull if update: for the constraint)
     */
    public void setSoLineNo(Long soLineNo) {
        registerModifiedProperty("soLineNo");
        _soLineNo = soLineNo;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] IFITEM_CD: {varchar(30)} <br>
     * I/F銘柄CD
     * @return The value of the column 'IFITEM_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfitemCd() {
        checkSpecifiedProperty("ifitemCd");
        return convertEmptyToNull(_ifitemCd);
    }

    /**
     * [set] IFITEM_CD: {varchar(30)} <br>
     * I/F銘柄CD
     * @param ifitemCd The value of the column 'IFITEM_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfitemCd(String ifitemCd) {
        registerModifiedProperty("ifitemCd");
        _ifitemCd = ifitemCd;
    }

    /**
     * [get] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] LOCATION_CD: {IX+, NotNull, varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {IX+, NotNull, varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (basically NotNull if update: for the constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * 良品・不良品区分
     * @return The value of the column 'DAMAGE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Long getDamageFlg() {
        checkSpecifiedProperty("damageFlg");
        return _damageFlg;
    }

    /**
     * [set] DAMAGE_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * 良品・不良品区分
     * @param damageFlg The value of the column 'DAMAGE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDamageFlg(Long damageFlg) {
        registerModifiedProperty("damageFlg");
        _damageFlg = damageFlg;
    }

    /**
     * [get] NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * 出荷禁止フラグ
     * @return The value of the column 'NO_SHIPPING_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Long getNoShippingFlg() {
        checkSpecifiedProperty("noShippingFlg");
        return _noShippingFlg;
    }

    /**
     * [set] NO_SHIPPING_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * 出荷禁止フラグ
     * @param noShippingFlg The value of the column 'NO_SHIPPING_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setNoShippingFlg(Long noShippingFlg) {
        registerModifiedProperty("noShippingFlg");
        _noShippingFlg = noShippingFlg;
    }

    /**
     * [get] EXPECT_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 個装数量
     * @return The value of the column 'EXPECT_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getExpectQty() {
        checkSpecifiedProperty("expectQty");
        return _expectQty;
    }

    /**
     * [set] EXPECT_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 個装数量
     * @param expectQty The value of the column 'EXPECT_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setExpectQty(Long expectQty) {
        registerModifiedProperty("expectQty");
        _expectQty = expectQty;
    }

    /**
     * [get] ALLOC_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 山出し数量
     * @return The value of the column 'ALLOC_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getAllocQty() {
        checkSpecifiedProperty("allocQty");
        return _allocQty;
    }

    /**
     * [set] ALLOC_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 山出し数量
     * @param allocQty The value of the column 'ALLOC_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setAllocQty(Long allocQty) {
        registerModifiedProperty("allocQty");
        _allocQty = allocQty;
    }

    /**
     * [get] PICKED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量
     * @return The value of the column 'PICKED_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPickedQty() {
        checkSpecifiedProperty("pickedQty");
        return _pickedQty;
    }

    /**
     * [set] PICKED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * ピッキング済数量
     * @param pickedQty The value of the column 'PICKED_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setPickedQty(Long pickedQty) {
        registerModifiedProperty("pickedQty");
        _pickedQty = pickedQty;
    }

    /**
     * [get] SORTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量
     * @return The value of the column 'SORTED_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getSortedQty() {
        checkSpecifiedProperty("sortedQty");
        return _sortedQty;
    }

    /**
     * [set] SORTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 仕分済数量
     * @param sortedQty The value of the column 'SORTED_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setSortedQty(Long sortedQty) {
        registerModifiedProperty("sortedQty");
        _sortedQty = sortedQty;
    }

    /**
     * [get] INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量
     * @return The value of the column 'INSPECTED_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getInspectedQty() {
        checkSpecifiedProperty("inspectedQty");
        return _inspectedQty;
    }

    /**
     * [set] INSPECTED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 検品済数量
     * @param inspectedQty The value of the column 'INSPECTED_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setInspectedQty(Long inspectedQty) {
        registerModifiedProperty("inspectedQty");
        _inspectedQty = inspectedQty;
    }

    /**
     * [get] SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 出荷実績数量
     * @return The value of the column 'SHIPPED_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippedQty() {
        checkSpecifiedProperty("shippedQty");
        return _shippedQty;
    }

    /**
     * [set] SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 出荷実績数量
     * @param shippedQty The value of the column 'SHIPPED_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setShippedQty(Long shippedQty) {
        registerModifiedProperty("shippedQty");
        _shippedQty = shippedQty;
    }

    /**
     * [get] ADJUST_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 取消数量(個)
     * @return The value of the column 'ADJUST_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getAdjustQty() {
        checkSpecifiedProperty("adjustQty");
        return _adjustQty;
    }

    /**
     * [set] ADJUST_QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 取消数量(個)
     * @param adjustQty The value of the column 'ADJUST_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setAdjustQty(Long adjustQty) {
        registerModifiedProperty("adjustQty");
        _adjustQty = adjustQty;
    }

    /**
     * [get] LOC_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * ロケ区分
     * @return The value of the column 'LOC_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Long getLocFlg() {
        checkSpecifiedProperty("locFlg");
        return _locFlg;
    }

    /**
     * [set] LOC_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * ロケ区分
     * @param locFlg The value of the column 'LOC_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setLocFlg(Long locFlg) {
        registerModifiedProperty("locFlg");
        _locFlg = locFlg;
    }

    /**
     * [get] STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * 通常・異型品区分
     * @return The value of the column 'STD_DIF_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Long getStdDifFlg() {
        checkSpecifiedProperty("stdDifFlg");
        return _stdDifFlg;
    }

    /**
     * [set] STD_DIF_FLG: {NotNull, bigint(19), default=[(0)]} <br>
     * 通常・異型品区分
     * @param stdDifFlg The value of the column 'STD_DIF_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setStdDifFlg(Long stdDifFlg) {
        registerModifiedProperty("stdDifFlg");
        _stdDifFlg = stdDifFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
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
