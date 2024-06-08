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
 * The entity of M_BOX as TABLE. <br>
 * 荷材マスタ
 * <pre>
 * [primary-key]
 *     BOX_ID
 *
 * [column]
 *     BOX_ID, CENTER_ID, BOX_CD, BOX_NM, LENGTH, WIDTH, HEIGHT, VOLUME, VOLUME_RATE, PERMIT_VOLUME, PERMIT_WEIGHT, BOX_TYPE, BXOSZL, BXOSZW, BXOSZH, BXWEIGHT, bxcpy, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BOX_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_BOX_GRP, M_BOX_GRP_DTL, M_CARRIER_BOX, M_PARAM, T_PACKING_H, W_HT_SHIPPING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT
 *
 * [foreign property]
 *     mCenter, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mBoxGrpList, mBoxGrpDtlList, mCarrierBoxList, mParamList, tPackingHList, wHtShippingList, wSglRowShipInspHList, wShippingInterruptList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long boxId = entity.getBoxId();
 * Long centerId = entity.getCenterId();
 * String boxCd = entity.getBoxCd();
 * String boxNm = entity.getBoxNm();
 * java.math.BigDecimal length = entity.getLength();
 * java.math.BigDecimal width = entity.getWidth();
 * java.math.BigDecimal height = entity.getHeight();
 * java.math.BigDecimal volume = entity.getVolume();
 * Long volumeRate = entity.getVolumeRate();
 * java.math.BigDecimal permitVolume = entity.getPermitVolume();
 * java.math.BigDecimal permitWeight = entity.getPermitWeight();
 * String boxType = entity.getBoxType();
 * Long bxoszl = entity.getBxoszl();
 * Long bxoszw = entity.getBxoszw();
 * Long bxoszh = entity.getBxoszh();
 * java.math.BigDecimal bxweight = entity.getBxweight();
 * java.math.BigDecimal bxcpy = entity.getBxcpy();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBoxId(boxId);
 * entity.setCenterId(centerId);
 * entity.setBoxCd(boxCd);
 * entity.setBoxNm(boxNm);
 * entity.setLength(length);
 * entity.setWidth(width);
 * entity.setHeight(height);
 * entity.setVolume(volume);
 * entity.setVolumeRate(volumeRate);
 * entity.setPermitVolume(permitVolume);
 * entity.setPermitWeight(permitWeight);
 * entity.setBoxType(boxType);
 * entity.setBxoszl(bxoszl);
 * entity.setBxoszw(bxoszw);
 * entity.setBxoszh(bxoszh);
 * entity.setBxweight(bxweight);
 * entity.setBxcpy(bxcpy);
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
public abstract class BsMBox extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BOX_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _boxId;

    /** CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** BOX_CD: {+UQ, IX, NotNull, varchar(30)} */
    protected String _boxCd;

    /** BOX_NM: {NotNull, varchar(60)} */
    protected String _boxNm;

    /** LENGTH: {decimal(16, 6)} */
    protected java.math.BigDecimal _length;

    /** WIDTH: {decimal(16, 6)} */
    protected java.math.BigDecimal _width;

    /** HEIGHT: {decimal(16, 6)} */
    protected java.math.BigDecimal _height;

    /** VOLUME: {decimal(16, 6)} */
    protected java.math.BigDecimal _volume;

    /** VOLUME_RATE: {bigint(19)} */
    protected Long _volumeRate;

    /** PERMIT_VOLUME: {decimal(16, 6)} */
    protected java.math.BigDecimal _permitVolume;

    /** PERMIT_WEIGHT: {decimal(16, 6)} */
    protected java.math.BigDecimal _permitWeight;

    /** BOX_TYPE: {varchar(30)} */
    protected String _boxType;

    /** BXOSZL: {bigint(19)} */
    protected Long _bxoszl;

    /** BXOSZW: {bigint(19)} */
    protected Long _bxoszw;

    /** BXOSZH: {bigint(19)} */
    protected Long _bxoszh;

    /** BXWEIGHT: {decimal(16, 6)} */
    protected java.math.BigDecimal _bxweight;

    /** bxcpy: {decimal(16, 6)} */
    protected java.math.BigDecimal _bxcpy;

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
        return "M_BOX";
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
        if (_boxId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param boxCd : +UQ, IX, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(Long centerId, String boxCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("centerId");
        __uniqueDrivenProperties.addPropertyName("boxCd");
        setCenterId(centerId);setBoxCd(boxCd);
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
    /** M_CENTER by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] M_CENTER by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
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
    /** M_BOX_GRP by STANDARD_BOX_ID, named 'MBoxGrpList'. */
    protected List<MBoxGrp> _mBoxGrpList;

    /**
     * [get] M_BOX_GRP by STANDARD_BOX_ID, named 'MBoxGrpList'.
     * @return The entity list of referrer property 'MBoxGrpList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MBoxGrp> getMBoxGrpList() {
        if (_mBoxGrpList == null) { _mBoxGrpList = newReferrerList(); }
        return _mBoxGrpList;
    }

    /**
     * [set] M_BOX_GRP by STANDARD_BOX_ID, named 'MBoxGrpList'.
     * @param mBoxGrpList The entity list of referrer property 'MBoxGrpList'. (NullAllowed)
     */
    public void setMBoxGrpList(List<MBoxGrp> mBoxGrpList) {
        _mBoxGrpList = mBoxGrpList;
    }

    /** M_BOX_GRP_DTL by BOX_ID, named 'MBoxGrpDtlList'. */
    protected List<MBoxGrpDtl> _mBoxGrpDtlList;

    /**
     * [get] M_BOX_GRP_DTL by BOX_ID, named 'MBoxGrpDtlList'.
     * @return The entity list of referrer property 'MBoxGrpDtlList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MBoxGrpDtl> getMBoxGrpDtlList() {
        if (_mBoxGrpDtlList == null) { _mBoxGrpDtlList = newReferrerList(); }
        return _mBoxGrpDtlList;
    }

    /**
     * [set] M_BOX_GRP_DTL by BOX_ID, named 'MBoxGrpDtlList'.
     * @param mBoxGrpDtlList The entity list of referrer property 'MBoxGrpDtlList'. (NullAllowed)
     */
    public void setMBoxGrpDtlList(List<MBoxGrpDtl> mBoxGrpDtlList) {
        _mBoxGrpDtlList = mBoxGrpDtlList;
    }

    /** M_CARRIER_BOX by BOX_ID, named 'MCarrierBoxList'. */
    protected List<MCarrierBox> _mCarrierBoxList;

    /**
     * [get] M_CARRIER_BOX by BOX_ID, named 'MCarrierBoxList'.
     * @return The entity list of referrer property 'MCarrierBoxList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierBox> getMCarrierBoxList() {
        if (_mCarrierBoxList == null) { _mCarrierBoxList = newReferrerList(); }
        return _mCarrierBoxList;
    }

    /**
     * [set] M_CARRIER_BOX by BOX_ID, named 'MCarrierBoxList'.
     * @param mCarrierBoxList The entity list of referrer property 'MCarrierBoxList'. (NullAllowed)
     */
    public void setMCarrierBoxList(List<MCarrierBox> mCarrierBoxList) {
        _mCarrierBoxList = mCarrierBoxList;
    }

    /** M_PARAM by DEFAULT_BOX_ID, named 'MParamList'. */
    protected List<MParam> _mParamList;

    /**
     * [get] M_PARAM by DEFAULT_BOX_ID, named 'MParamList'.
     * @return The entity list of referrer property 'MParamList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MParam> getMParamList() {
        if (_mParamList == null) { _mParamList = newReferrerList(); }
        return _mParamList;
    }

    /**
     * [set] M_PARAM by DEFAULT_BOX_ID, named 'MParamList'.
     * @param mParamList The entity list of referrer property 'MParamList'. (NullAllowed)
     */
    public void setMParamList(List<MParam> mParamList) {
        _mParamList = mParamList;
    }

    /** T_PACKING_H by BOX_ID, named 'TPackingHList'. */
    protected List<TPackingH> _tPackingHList;

    /**
     * [get] T_PACKING_H by BOX_ID, named 'TPackingHList'.
     * @return The entity list of referrer property 'TPackingHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPackingH> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = newReferrerList(); }
        return _tPackingHList;
    }

    /**
     * [set] T_PACKING_H by BOX_ID, named 'TPackingHList'.
     * @param tPackingHList The entity list of referrer property 'TPackingHList'. (NullAllowed)
     */
    public void setTPackingHList(List<TPackingH> tPackingHList) {
        _tPackingHList = tPackingHList;
    }

    /** W_HT_SHIPPING by BOX_ID, named 'WHtShippingList'. */
    protected List<WHtShipping> _wHtShippingList;

    /**
     * [get] W_HT_SHIPPING by BOX_ID, named 'WHtShippingList'.
     * @return The entity list of referrer property 'WHtShippingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WHtShipping> getWHtShippingList() {
        if (_wHtShippingList == null) { _wHtShippingList = newReferrerList(); }
        return _wHtShippingList;
    }

    /**
     * [set] W_HT_SHIPPING by BOX_ID, named 'WHtShippingList'.
     * @param wHtShippingList The entity list of referrer property 'WHtShippingList'. (NullAllowed)
     */
    public void setWHtShippingList(List<WHtShipping> wHtShippingList) {
        _wHtShippingList = wHtShippingList;
    }

    /** W_SGL_ROW_SHIP_INSP_H by BOX_ID, named 'WSglRowShipInspHList'. */
    protected List<WSglRowShipInspH> _wSglRowShipInspHList;

    /**
     * [get] W_SGL_ROW_SHIP_INSP_H by BOX_ID, named 'WSglRowShipInspHList'.
     * @return The entity list of referrer property 'WSglRowShipInspHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WSglRowShipInspH> getWSglRowShipInspHList() {
        if (_wSglRowShipInspHList == null) { _wSglRowShipInspHList = newReferrerList(); }
        return _wSglRowShipInspHList;
    }

    /**
     * [set] W_SGL_ROW_SHIP_INSP_H by BOX_ID, named 'WSglRowShipInspHList'.
     * @param wSglRowShipInspHList The entity list of referrer property 'WSglRowShipInspHList'. (NullAllowed)
     */
    public void setWSglRowShipInspHList(List<WSglRowShipInspH> wSglRowShipInspHList) {
        _wSglRowShipInspHList = wSglRowShipInspHList;
    }

    /** W_SHIPPING_INTERRUPT by BOX_ID, named 'WShippingInterruptList'. */
    protected List<WShippingInterrupt> _wShippingInterruptList;

    /**
     * [get] W_SHIPPING_INTERRUPT by BOX_ID, named 'WShippingInterruptList'.
     * @return The entity list of referrer property 'WShippingInterruptList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WShippingInterrupt> getWShippingInterruptList() {
        if (_wShippingInterruptList == null) { _wShippingInterruptList = newReferrerList(); }
        return _wShippingInterruptList;
    }

    /**
     * [set] W_SHIPPING_INTERRUPT by BOX_ID, named 'WShippingInterruptList'.
     * @param wShippingInterruptList The entity list of referrer property 'WShippingInterruptList'. (NullAllowed)
     */
    public void setWShippingInterruptList(List<WShippingInterrupt> wShippingInterruptList) {
        _wShippingInterruptList = wShippingInterruptList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMBox) {
            BsMBox other = (BsMBox)obj;
            if (!xSV(_boxId, other._boxId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _boxId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_mBoxGrpList != null) { for (MBoxGrp et : _mBoxGrpList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mBoxGrpList")); } } }
        if (_mBoxGrpDtlList != null) { for (MBoxGrpDtl et : _mBoxGrpDtlList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mBoxGrpDtlList")); } } }
        if (_mCarrierBoxList != null) { for (MCarrierBox et : _mCarrierBoxList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierBoxList")); } } }
        if (_mParamList != null) { for (MParam et : _mParamList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mParamList")); } } }
        if (_tPackingHList != null) { for (TPackingH et : _tPackingHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPackingHList")); } } }
        if (_wHtShippingList != null) { for (WHtShipping et : _wHtShippingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wHtShippingList")); } } }
        if (_wSglRowShipInspHList != null) { for (WSglRowShipInspH et : _wSglRowShipInspHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wSglRowShipInspHList")); } } }
        if (_wShippingInterruptList != null) { for (WShippingInterrupt et : _wShippingInterruptList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "wShippingInterruptList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_boxId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_boxCd));
        sb.append(dm).append(xfND(_boxNm));
        sb.append(dm).append(xfND(_length));
        sb.append(dm).append(xfND(_width));
        sb.append(dm).append(xfND(_height));
        sb.append(dm).append(xfND(_volume));
        sb.append(dm).append(xfND(_volumeRate));
        sb.append(dm).append(xfND(_permitVolume));
        sb.append(dm).append(xfND(_permitWeight));
        sb.append(dm).append(xfND(_boxType));
        sb.append(dm).append(xfND(_bxoszl));
        sb.append(dm).append(xfND(_bxoszw));
        sb.append(dm).append(xfND(_bxoszh));
        sb.append(dm).append(xfND(_bxweight));
        sb.append(dm).append(xfND(_bxcpy));
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
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_mBoxGrpList != null && !_mBoxGrpList.isEmpty())
        { sb.append(dm).append("mBoxGrpList"); }
        if (_mBoxGrpDtlList != null && !_mBoxGrpDtlList.isEmpty())
        { sb.append(dm).append("mBoxGrpDtlList"); }
        if (_mCarrierBoxList != null && !_mCarrierBoxList.isEmpty())
        { sb.append(dm).append("mCarrierBoxList"); }
        if (_mParamList != null && !_mParamList.isEmpty())
        { sb.append(dm).append("mParamList"); }
        if (_tPackingHList != null && !_tPackingHList.isEmpty())
        { sb.append(dm).append("tPackingHList"); }
        if (_wHtShippingList != null && !_wHtShippingList.isEmpty())
        { sb.append(dm).append("wHtShippingList"); }
        if (_wSglRowShipInspHList != null && !_wSglRowShipInspHList.isEmpty())
        { sb.append(dm).append("wSglRowShipInspHList"); }
        if (_wShippingInterruptList != null && !_wShippingInterruptList.isEmpty())
        { sb.append(dm).append("wShippingInterruptList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MBox clone() {
        return (MBox)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BOX_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷材ID
     * @return The value of the column 'BOX_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBoxId() {
        checkSpecifiedProperty("boxId");
        return _boxId;
    }

    /**
     * [set] BOX_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷材ID
     * @param boxId The value of the column 'BOX_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBoxId(Long boxId) {
        registerModifiedProperty("boxId");
        _boxId = boxId;
    }

    /**
     * [get] CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] BOX_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * 荷材CD
     * @return The value of the column 'BOX_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getBoxCd() {
        checkSpecifiedProperty("boxCd");
        return convertEmptyToNull(_boxCd);
    }

    /**
     * [set] BOX_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * 荷材CD
     * @param boxCd The value of the column 'BOX_CD'. (basically NotNull if update: for the constraint)
     */
    public void setBoxCd(String boxCd) {
        registerModifiedProperty("boxCd");
        _boxCd = boxCd;
    }

    /**
     * [get] BOX_NM: {NotNull, varchar(60)} <br>
     * 荷材名称
     * @return The value of the column 'BOX_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getBoxNm() {
        checkSpecifiedProperty("boxNm");
        return convertEmptyToNull(_boxNm);
    }

    /**
     * [set] BOX_NM: {NotNull, varchar(60)} <br>
     * 荷材名称
     * @param boxNm The value of the column 'BOX_NM'. (basically NotNull if update: for the constraint)
     */
    public void setBoxNm(String boxNm) {
        registerModifiedProperty("boxNm");
        _boxNm = boxNm;
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
     * [get] VOLUME_RATE: {bigint(19)} <br>
     * 容積率(%)
     * @return The value of the column 'VOLUME_RATE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVolumeRate() {
        checkSpecifiedProperty("volumeRate");
        return _volumeRate;
    }

    /**
     * [set] VOLUME_RATE: {bigint(19)} <br>
     * 容積率(%)
     * @param volumeRate The value of the column 'VOLUME_RATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVolumeRate(Long volumeRate) {
        registerModifiedProperty("volumeRate");
        _volumeRate = volumeRate;
    }

    /**
     * [get] PERMIT_VOLUME: {decimal(16, 6)} <br>
     * 許容容積(mm3)
     * @return The value of the column 'PERMIT_VOLUME'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPermitVolume() {
        checkSpecifiedProperty("permitVolume");
        return _permitVolume;
    }

    /**
     * [set] PERMIT_VOLUME: {decimal(16, 6)} <br>
     * 許容容積(mm3)
     * @param permitVolume The value of the column 'PERMIT_VOLUME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPermitVolume(java.math.BigDecimal permitVolume) {
        registerModifiedProperty("permitVolume");
        _permitVolume = permitVolume;
    }

    /**
     * [get] PERMIT_WEIGHT: {decimal(16, 6)} <br>
     * 許容重量(g)
     * @return The value of the column 'PERMIT_WEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPermitWeight() {
        checkSpecifiedProperty("permitWeight");
        return _permitWeight;
    }

    /**
     * [set] PERMIT_WEIGHT: {decimal(16, 6)} <br>
     * 許容重量(g)
     * @param permitWeight The value of the column 'PERMIT_WEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPermitWeight(java.math.BigDecimal permitWeight) {
        registerModifiedProperty("permitWeight");
        _permitWeight = permitWeight;
    }

    /**
     * [get] BOX_TYPE: {varchar(30)} <br>
     * 箱種別
     * @return The value of the column 'BOX_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxType() {
        checkSpecifiedProperty("boxType");
        return convertEmptyToNull(_boxType);
    }

    /**
     * [set] BOX_TYPE: {varchar(30)} <br>
     * 箱種別
     * @param boxType The value of the column 'BOX_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxType(String boxType) {
        registerModifiedProperty("boxType");
        _boxType = boxType;
    }

    /**
     * [get] BXOSZL: {bigint(19)} <br>
     * 箱外寸(L)(㎜)
     * @return The value of the column 'BXOSZL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxoszl() {
        checkSpecifiedProperty("bxoszl");
        return _bxoszl;
    }

    /**
     * [set] BXOSZL: {bigint(19)} <br>
     * 箱外寸(L)(㎜)
     * @param bxoszl The value of the column 'BXOSZL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxoszl(Long bxoszl) {
        registerModifiedProperty("bxoszl");
        _bxoszl = bxoszl;
    }

    /**
     * [get] BXOSZW: {bigint(19)} <br>
     * 箱外寸(W)(㎜)
     * @return The value of the column 'BXOSZW'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxoszw() {
        checkSpecifiedProperty("bxoszw");
        return _bxoszw;
    }

    /**
     * [set] BXOSZW: {bigint(19)} <br>
     * 箱外寸(W)(㎜)
     * @param bxoszw The value of the column 'BXOSZW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxoszw(Long bxoszw) {
        registerModifiedProperty("bxoszw");
        _bxoszw = bxoszw;
    }

    /**
     * [get] BXOSZH: {bigint(19)} <br>
     * 箱外寸(H)(㎜)
     * @return The value of the column 'BXOSZH'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBxoszh() {
        checkSpecifiedProperty("bxoszh");
        return _bxoszh;
    }

    /**
     * [set] BXOSZH: {bigint(19)} <br>
     * 箱外寸(H)(㎜)
     * @param bxoszh The value of the column 'BXOSZH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxoszh(Long bxoszh) {
        registerModifiedProperty("bxoszh");
        _bxoszh = bxoszh;
    }

    /**
     * [get] BXWEIGHT: {decimal(16, 6)} <br>
     * 空箱重量(g)
     * @return The value of the column 'BXWEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBxweight() {
        checkSpecifiedProperty("bxweight");
        return _bxweight;
    }

    /**
     * [set] BXWEIGHT: {decimal(16, 6)} <br>
     * 空箱重量(g)
     * @param bxweight The value of the column 'BXWEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxweight(java.math.BigDecimal bxweight) {
        registerModifiedProperty("bxweight");
        _bxweight = bxweight;
    }

    /**
     * [get] bxcpy: {decimal(16, 6)} <br>
     * 容積(cm3)
     * @return The value of the column 'bxcpy'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBxcpy() {
        checkSpecifiedProperty("bxcpy");
        return _bxcpy;
    }

    /**
     * [set] bxcpy: {decimal(16, 6)} <br>
     * 容積(cm3)
     * @param bxcpy The value of the column 'bxcpy'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxcpy(java.math.BigDecimal bxcpy) {
        registerModifiedProperty("bxcpy");
        _bxcpy = bxcpy;
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
