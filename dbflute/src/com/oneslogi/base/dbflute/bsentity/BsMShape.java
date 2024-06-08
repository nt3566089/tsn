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
 * The entity of M_SHAPE as TABLE. <br>
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
 * [foreign table]
 *     B_DICT, V_DICT, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     H_INVENTORY_B, H_STOCK, M_SHAPE_GRP_DTL, T_ALLOC_INST_B, T_INVENTORY_B, T_MOVE_INST_B, T_PICKING_B, T_SHIPPING_INST_B, T_STOCK
 *
 * [foreign property]
 *     bDictByShapeDictId, bDictByShapeUnitDictId, vDictByShapeDictId, vDictByShapeUnitDictId, bClassDtlByDelFlg
 *
 * [referrer property]
 *     hInventoryBList, hStockList, mShapeGrpDtlList, tAllocInstBList, tInventoryBList, tMoveInstBList, tPickingBList, tShippingInstBList, tStockList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shapeId = entity.getShapeId();
 * String shapeCd = entity.getShapeCd();
 * Long shapeDictId = entity.getShapeDictId();
 * Long shapeUnitDictId = entity.getShapeUnitDictId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShapeId(shapeId);
 * entity.setShapeCd(shapeCd);
 * entity.setShapeDictId(shapeDictId);
 * entity.setShapeUnitDictId(shapeUnitDictId);
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
public abstract class BsMShape extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHAPE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _shapeId;

    /** SHAPE_CD: {UQ, NotNull, varchar(30)} */
    protected String _shapeCd;

    /** SHAPE_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} */
    protected Long _shapeDictId;

    /** SHAPE_UNIT_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} */
    protected Long _shapeUnitDictId;

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
        return "M_SHAPE";
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
        if (_shapeId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param shapeCd : UQ, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(String shapeCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("shapeCd");
        setShapeCd(shapeCd);
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
    /** B_DICT by my SHAPE_DICT_ID, named 'BDictByShapeDictId'. */
    protected BDict _bDictByShapeDictId;

    /**
     * [get] B_DICT by my SHAPE_DICT_ID, named 'BDictByShapeDictId'. <br>
     * @return The entity of foreign property 'BDictByShapeDictId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BDict getBDictByShapeDictId() {
        return _bDictByShapeDictId;
    }

    /**
     * [set] B_DICT by my SHAPE_DICT_ID, named 'BDictByShapeDictId'.
     * @param bDictByShapeDictId The entity of foreign property 'BDictByShapeDictId'. (NullAllowed)
     */
    public void setBDictByShapeDictId(BDict bDictByShapeDictId) {
        _bDictByShapeDictId = bDictByShapeDictId;
    }

    /** B_DICT by my SHAPE_UNIT_DICT_ID, named 'BDictByShapeUnitDictId'. */
    protected BDict _bDictByShapeUnitDictId;

    /**
     * [get] B_DICT by my SHAPE_UNIT_DICT_ID, named 'BDictByShapeUnitDictId'. <br>
     * @return The entity of foreign property 'BDictByShapeUnitDictId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BDict getBDictByShapeUnitDictId() {
        return _bDictByShapeUnitDictId;
    }

    /**
     * [set] B_DICT by my SHAPE_UNIT_DICT_ID, named 'BDictByShapeUnitDictId'.
     * @param bDictByShapeUnitDictId The entity of foreign property 'BDictByShapeUnitDictId'. (NullAllowed)
     */
    public void setBDictByShapeUnitDictId(BDict bDictByShapeUnitDictId) {
        _bDictByShapeUnitDictId = bDictByShapeUnitDictId;
    }

    /** V_DICT by my SHAPE_DICT_ID, named 'VDictByShapeDictId'. */
    protected VDict _vDictByShapeDictId;

    /**
     * [get] V_DICT by my SHAPE_DICT_ID, named 'VDictByShapeDictId'. <br>
     * @return The entity of foreign property 'VDictByShapeDictId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VDict getVDictByShapeDictId() {
        return _vDictByShapeDictId;
    }

    /**
     * [set] V_DICT by my SHAPE_DICT_ID, named 'VDictByShapeDictId'.
     * @param vDictByShapeDictId The entity of foreign property 'VDictByShapeDictId'. (NullAllowed)
     */
    public void setVDictByShapeDictId(VDict vDictByShapeDictId) {
        _vDictByShapeDictId = vDictByShapeDictId;
    }

    /** V_DICT by my SHAPE_UNIT_DICT_ID, named 'VDictByShapeUnitDictId'. */
    protected VDict _vDictByShapeUnitDictId;

    /**
     * [get] V_DICT by my SHAPE_UNIT_DICT_ID, named 'VDictByShapeUnitDictId'. <br>
     * @return The entity of foreign property 'VDictByShapeUnitDictId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VDict getVDictByShapeUnitDictId() {
        return _vDictByShapeUnitDictId;
    }

    /**
     * [set] V_DICT by my SHAPE_UNIT_DICT_ID, named 'VDictByShapeUnitDictId'.
     * @param vDictByShapeUnitDictId The entity of foreign property 'VDictByShapeUnitDictId'. (NullAllowed)
     */
    public void setVDictByShapeUnitDictId(VDict vDictByShapeUnitDictId) {
        _vDictByShapeUnitDictId = vDictByShapeUnitDictId;
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
    /** H_INVENTORY_B by SHAPE_ID, named 'HInventoryBList'. */
    protected List<HInventoryB> _hInventoryBList;

    /**
     * [get] H_INVENTORY_B by SHAPE_ID, named 'HInventoryBList'.
     * @return The entity list of referrer property 'HInventoryBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HInventoryB> getHInventoryBList() {
        if (_hInventoryBList == null) { _hInventoryBList = newReferrerList(); }
        return _hInventoryBList;
    }

    /**
     * [set] H_INVENTORY_B by SHAPE_ID, named 'HInventoryBList'.
     * @param hInventoryBList The entity list of referrer property 'HInventoryBList'. (NullAllowed)
     */
    public void setHInventoryBList(List<HInventoryB> hInventoryBList) {
        _hInventoryBList = hInventoryBList;
    }

    /** H_STOCK by SHAPE_ID, named 'HStockList'. */
    protected List<HStock> _hStockList;

    /**
     * [get] H_STOCK by SHAPE_ID, named 'HStockList'.
     * @return The entity list of referrer property 'HStockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<HStock> getHStockList() {
        if (_hStockList == null) { _hStockList = newReferrerList(); }
        return _hStockList;
    }

    /**
     * [set] H_STOCK by SHAPE_ID, named 'HStockList'.
     * @param hStockList The entity list of referrer property 'HStockList'. (NullAllowed)
     */
    public void setHStockList(List<HStock> hStockList) {
        _hStockList = hStockList;
    }

    /** M_SHAPE_GRP_DTL by SHAPE_ID, named 'MShapeGrpDtlList'. */
    protected List<MShapeGrpDtl> _mShapeGrpDtlList;

    /**
     * [get] M_SHAPE_GRP_DTL by SHAPE_ID, named 'MShapeGrpDtlList'.
     * @return The entity list of referrer property 'MShapeGrpDtlList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MShapeGrpDtl> getMShapeGrpDtlList() {
        if (_mShapeGrpDtlList == null) { _mShapeGrpDtlList = newReferrerList(); }
        return _mShapeGrpDtlList;
    }

    /**
     * [set] M_SHAPE_GRP_DTL by SHAPE_ID, named 'MShapeGrpDtlList'.
     * @param mShapeGrpDtlList The entity list of referrer property 'MShapeGrpDtlList'. (NullAllowed)
     */
    public void setMShapeGrpDtlList(List<MShapeGrpDtl> mShapeGrpDtlList) {
        _mShapeGrpDtlList = mShapeGrpDtlList;
    }

    /** T_ALLOC_INST_B by SHAPE_ID, named 'TAllocInstBList'. */
    protected List<TAllocInstB> _tAllocInstBList;

    /**
     * [get] T_ALLOC_INST_B by SHAPE_ID, named 'TAllocInstBList'.
     * @return The entity list of referrer property 'TAllocInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstB> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = newReferrerList(); }
        return _tAllocInstBList;
    }

    /**
     * [set] T_ALLOC_INST_B by SHAPE_ID, named 'TAllocInstBList'.
     * @param tAllocInstBList The entity list of referrer property 'TAllocInstBList'. (NullAllowed)
     */
    public void setTAllocInstBList(List<TAllocInstB> tAllocInstBList) {
        _tAllocInstBList = tAllocInstBList;
    }

    /** T_INVENTORY_B by SHAPE_ID, named 'TInventoryBList'. */
    protected List<TInventoryB> _tInventoryBList;

    /**
     * [get] T_INVENTORY_B by SHAPE_ID, named 'TInventoryBList'.
     * @return The entity list of referrer property 'TInventoryBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryB> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = newReferrerList(); }
        return _tInventoryBList;
    }

    /**
     * [set] T_INVENTORY_B by SHAPE_ID, named 'TInventoryBList'.
     * @param tInventoryBList The entity list of referrer property 'TInventoryBList'. (NullAllowed)
     */
    public void setTInventoryBList(List<TInventoryB> tInventoryBList) {
        _tInventoryBList = tInventoryBList;
    }

    /** T_MOVE_INST_B by SHAPE_ID, named 'TMoveInstBList'. */
    protected List<TMoveInstB> _tMoveInstBList;

    /**
     * [get] T_MOVE_INST_B by SHAPE_ID, named 'TMoveInstBList'.
     * @return The entity list of referrer property 'TMoveInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TMoveInstB> getTMoveInstBList() {
        if (_tMoveInstBList == null) { _tMoveInstBList = newReferrerList(); }
        return _tMoveInstBList;
    }

    /**
     * [set] T_MOVE_INST_B by SHAPE_ID, named 'TMoveInstBList'.
     * @param tMoveInstBList The entity list of referrer property 'TMoveInstBList'. (NullAllowed)
     */
    public void setTMoveInstBList(List<TMoveInstB> tMoveInstBList) {
        _tMoveInstBList = tMoveInstBList;
    }

    /** T_PICKING_B by SHAPE_ID, named 'TPickingBList'. */
    protected List<TPickingB> _tPickingBList;

    /**
     * [get] T_PICKING_B by SHAPE_ID, named 'TPickingBList'.
     * @return The entity list of referrer property 'TPickingBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPickingB> getTPickingBList() {
        if (_tPickingBList == null) { _tPickingBList = newReferrerList(); }
        return _tPickingBList;
    }

    /**
     * [set] T_PICKING_B by SHAPE_ID, named 'TPickingBList'.
     * @param tPickingBList The entity list of referrer property 'TPickingBList'. (NullAllowed)
     */
    public void setTPickingBList(List<TPickingB> tPickingBList) {
        _tPickingBList = tPickingBList;
    }

    /** T_SHIPPING_INST_B by SHAPE_ID, named 'TShippingInstBList'. */
    protected List<TShippingInstB> _tShippingInstBList;

    /**
     * [get] T_SHIPPING_INST_B by SHAPE_ID, named 'TShippingInstBList'.
     * @return The entity list of referrer property 'TShippingInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstB> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = newReferrerList(); }
        return _tShippingInstBList;
    }

    /**
     * [set] T_SHIPPING_INST_B by SHAPE_ID, named 'TShippingInstBList'.
     * @param tShippingInstBList The entity list of referrer property 'TShippingInstBList'. (NullAllowed)
     */
    public void setTShippingInstBList(List<TShippingInstB> tShippingInstBList) {
        _tShippingInstBList = tShippingInstBList;
    }

    /** T_STOCK by SHAPE_ID, named 'TStockList'. */
    protected List<TStock> _tStockList;

    /**
     * [get] T_STOCK by SHAPE_ID, named 'TStockList'.
     * @return The entity list of referrer property 'TStockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TStock> getTStockList() {
        if (_tStockList == null) { _tStockList = newReferrerList(); }
        return _tStockList;
    }

    /**
     * [set] T_STOCK by SHAPE_ID, named 'TStockList'.
     * @param tStockList The entity list of referrer property 'TStockList'. (NullAllowed)
     */
    public void setTStockList(List<TStock> tStockList) {
        _tStockList = tStockList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMShape) {
            BsMShape other = (BsMShape)obj;
            if (!xSV(_shapeId, other._shapeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shapeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bDictByShapeDictId != null)
        { sb.append(li).append(xbRDS(_bDictByShapeDictId, "bDictByShapeDictId")); }
        if (_bDictByShapeUnitDictId != null)
        { sb.append(li).append(xbRDS(_bDictByShapeUnitDictId, "bDictByShapeUnitDictId")); }
        if (_vDictByShapeDictId != null)
        { sb.append(li).append(xbRDS(_vDictByShapeDictId, "vDictByShapeDictId")); }
        if (_vDictByShapeUnitDictId != null)
        { sb.append(li).append(xbRDS(_vDictByShapeUnitDictId, "vDictByShapeUnitDictId")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_hInventoryBList != null) { for (HInventoryB et : _hInventoryBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hInventoryBList")); } } }
        if (_hStockList != null) { for (HStock et : _hStockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "hStockList")); } } }
        if (_mShapeGrpDtlList != null) { for (MShapeGrpDtl et : _mShapeGrpDtlList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mShapeGrpDtlList")); } } }
        if (_tAllocInstBList != null) { for (TAllocInstB et : _tAllocInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstBList")); } } }
        if (_tInventoryBList != null) { for (TInventoryB et : _tInventoryBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryBList")); } } }
        if (_tMoveInstBList != null) { for (TMoveInstB et : _tMoveInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tMoveInstBList")); } } }
        if (_tPickingBList != null) { for (TPickingB et : _tPickingBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPickingBList")); } } }
        if (_tShippingInstBList != null) { for (TShippingInstB et : _tShippingInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstBList")); } } }
        if (_tStockList != null) { for (TStock et : _tStockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tStockList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shapeId));
        sb.append(dm).append(xfND(_shapeCd));
        sb.append(dm).append(xfND(_shapeDictId));
        sb.append(dm).append(xfND(_shapeUnitDictId));
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
        if (_bDictByShapeDictId != null)
        { sb.append(dm).append("bDictByShapeDictId"); }
        if (_bDictByShapeUnitDictId != null)
        { sb.append(dm).append("bDictByShapeUnitDictId"); }
        if (_vDictByShapeDictId != null)
        { sb.append(dm).append("vDictByShapeDictId"); }
        if (_vDictByShapeUnitDictId != null)
        { sb.append(dm).append("vDictByShapeUnitDictId"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_hInventoryBList != null && !_hInventoryBList.isEmpty())
        { sb.append(dm).append("hInventoryBList"); }
        if (_hStockList != null && !_hStockList.isEmpty())
        { sb.append(dm).append("hStockList"); }
        if (_mShapeGrpDtlList != null && !_mShapeGrpDtlList.isEmpty())
        { sb.append(dm).append("mShapeGrpDtlList"); }
        if (_tAllocInstBList != null && !_tAllocInstBList.isEmpty())
        { sb.append(dm).append("tAllocInstBList"); }
        if (_tInventoryBList != null && !_tInventoryBList.isEmpty())
        { sb.append(dm).append("tInventoryBList"); }
        if (_tMoveInstBList != null && !_tMoveInstBList.isEmpty())
        { sb.append(dm).append("tMoveInstBList"); }
        if (_tPickingBList != null && !_tPickingBList.isEmpty())
        { sb.append(dm).append("tPickingBList"); }
        if (_tShippingInstBList != null && !_tShippingInstBList.isEmpty())
        { sb.append(dm).append("tShippingInstBList"); }
        if (_tStockList != null && !_tStockList.isEmpty())
        { sb.append(dm).append("tStockList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MShape clone() {
        return (MShape)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHAPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷姿ID
     * @return The value of the column 'SHAPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShapeId() {
        checkSpecifiedProperty("shapeId");
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷姿ID
     * @param shapeId The value of the column 'SHAPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShapeId(Long shapeId) {
        registerModifiedProperty("shapeId");
        _shapeId = shapeId;
    }

    /**
     * [get] SHAPE_CD: {UQ, NotNull, varchar(30)} <br>
     * 荷姿CD
     * @return The value of the column 'SHAPE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getShapeCd() {
        checkSpecifiedProperty("shapeCd");
        return convertEmptyToNull(_shapeCd);
    }

    /**
     * [set] SHAPE_CD: {UQ, NotNull, varchar(30)} <br>
     * 荷姿CD
     * @param shapeCd The value of the column 'SHAPE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setShapeCd(String shapeCd) {
        registerModifiedProperty("shapeCd");
        _shapeCd = shapeCd;
    }

    /**
     * [get] SHAPE_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 荷姿名称辞書ID
     * @return The value of the column 'SHAPE_DICT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShapeDictId() {
        checkSpecifiedProperty("shapeDictId");
        return _shapeDictId;
    }

    /**
     * [set] SHAPE_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 荷姿名称辞書ID
     * @param shapeDictId The value of the column 'SHAPE_DICT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShapeDictId(Long shapeDictId) {
        registerModifiedProperty("shapeDictId");
        _shapeDictId = shapeDictId;
    }

    /**
     * [get] SHAPE_UNIT_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 荷姿単位辞書ID
     * @return The value of the column 'SHAPE_UNIT_DICT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShapeUnitDictId() {
        checkSpecifiedProperty("shapeUnitDictId");
        return _shapeUnitDictId;
    }

    /**
     * [set] SHAPE_UNIT_DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT} <br>
     * 荷姿単位辞書ID
     * @param shapeUnitDictId The value of the column 'SHAPE_UNIT_DICT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShapeUnitDictId(Long shapeUnitDictId) {
        registerModifiedProperty("shapeUnitDictId");
        _shapeUnitDictId = shapeUnitDictId;
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
