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
 * The entity of M_CENTER_CUSTOMER as TABLE. <br>
 * 拠点取引先マスタ
 * <pre>
 * [primary-key]
 *     CENTER_CUSTOMER_ID
 *
 * [column]
 *     CENTER_CUSTOMER_ID, CENTER_ID, CUSTOMER_ID, DELIVERY_COURSE_ID, DELIVERY_ORDER, DELIVERY_READ_TIME, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CUSTOMER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CUSTOMER, M_DELIVERY_COURSE, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     T_ALLOC_INST_H
 *
 * [foreign property]
 *     mCenter, mCustomer, mDeliveryCourse, bClassDtlByDelFlg
 *
 * [referrer property]
 *     tAllocInstHByDelivCustomerIdList, tAllocInstHBySupplyCustomerIdList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long centerCustomerId = entity.getCenterCustomerId();
 * Long centerId = entity.getCenterId();
 * Long customerId = entity.getCustomerId();
 * Long deliveryCourseId = entity.getDeliveryCourseId();
 * Long deliveryOrder = entity.getDeliveryOrder();
 * Long deliveryReadTime = entity.getDeliveryReadTime();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setCenterCustomerId(centerCustomerId);
 * entity.setCenterId(centerId);
 * entity.setCustomerId(customerId);
 * entity.setDeliveryCourseId(deliveryCourseId);
 * entity.setDeliveryOrder(deliveryOrder);
 * entity.setDeliveryReadTime(deliveryReadTime);
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
public abstract class BsMCenterCustomer extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CENTER_CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _centerCustomerId;

    /** CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** CUSTOMER_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CUSTOMER} */
    protected Long _customerId;

    /** DELIVERY_COURSE_ID: {+UQ, IX, NotNull, bigint(19), FK to M_DELIVERY_COURSE} */
    protected Long _deliveryCourseId;

    /** DELIVERY_ORDER: {bigint(19)} */
    protected Long _deliveryOrder;

    /** DELIVERY_READ_TIME: {bigint(19)} */
    protected Long _deliveryReadTime;

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
        return "M_CENTER_CUSTOMER";
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
        if (_centerCustomerId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param customerId : +UQ, IX, NotNull, bigint(19), FK to M_CUSTOMER. (NotNull)
     * @param deliveryCourseId : +UQ, IX, NotNull, bigint(19), FK to M_DELIVERY_COURSE. (NotNull)
     */
    public void uniqueBy(Long centerId, Long customerId, Long deliveryCourseId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("centerId");
        __uniqueDrivenProperties.addPropertyName("customerId");
        __uniqueDrivenProperties.addPropertyName("deliveryCourseId");
        setCenterId(centerId);setCustomerId(customerId);setDeliveryCourseId(deliveryCourseId);
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

    /** M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'. */
    protected MCustomer _mCustomer;

    /**
     * [get] M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'. <br>
     * @return The entity of foreign property 'MCustomer'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomer() {
        return _mCustomer;
    }

    /**
     * [set] M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @param mCustomer The entity of foreign property 'MCustomer'. (NullAllowed)
     */
    public void setMCustomer(MCustomer mCustomer) {
        _mCustomer = mCustomer;
    }

    /** M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'. */
    protected MDeliveryCourse _mDeliveryCourse;

    /**
     * [get] M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'. <br>
     * @return The entity of foreign property 'MDeliveryCourse'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MDeliveryCourse getMDeliveryCourse() {
        return _mDeliveryCourse;
    }

    /**
     * [set] M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @param mDeliveryCourse The entity of foreign property 'MDeliveryCourse'. (NullAllowed)
     */
    public void setMDeliveryCourse(MDeliveryCourse mDeliveryCourse) {
        _mDeliveryCourse = mDeliveryCourse;
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
    /** T_ALLOC_INST_H by CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHByDelivCustomerIdList'. */
    protected List<TAllocInstH> _tAllocInstHByDelivCustomerIdList;

    /**
     * [get] T_ALLOC_INST_H by CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHByDelivCustomerIdList'.
     * @return The entity list of referrer property 'TAllocInstHByDelivCustomerIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstH> getTAllocInstHByDelivCustomerIdList() {
        if (_tAllocInstHByDelivCustomerIdList == null) { _tAllocInstHByDelivCustomerIdList = newReferrerList(); }
        return _tAllocInstHByDelivCustomerIdList;
    }

    /**
     * [set] T_ALLOC_INST_H by CENTER_ID, DELIV_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHByDelivCustomerIdList'.
     * @param tAllocInstHByDelivCustomerIdList The entity list of referrer property 'TAllocInstHByDelivCustomerIdList'. (NullAllowed)
     */
    public void setTAllocInstHByDelivCustomerIdList(List<TAllocInstH> tAllocInstHByDelivCustomerIdList) {
        _tAllocInstHByDelivCustomerIdList = tAllocInstHByDelivCustomerIdList;
    }

    /** T_ALLOC_INST_H by CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHBySupplyCustomerIdList'. */
    protected List<TAllocInstH> _tAllocInstHBySupplyCustomerIdList;

    /**
     * [get] T_ALLOC_INST_H by CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHBySupplyCustomerIdList'.
     * @return The entity list of referrer property 'TAllocInstHBySupplyCustomerIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TAllocInstH> getTAllocInstHBySupplyCustomerIdList() {
        if (_tAllocInstHBySupplyCustomerIdList == null) { _tAllocInstHBySupplyCustomerIdList = newReferrerList(); }
        return _tAllocInstHBySupplyCustomerIdList;
    }

    /**
     * [set] T_ALLOC_INST_H by CENTER_ID, SUPPLY_CUSTOMER_ID, DELIVERY_COURSE_ID, named 'TAllocInstHBySupplyCustomerIdList'.
     * @param tAllocInstHBySupplyCustomerIdList The entity list of referrer property 'TAllocInstHBySupplyCustomerIdList'. (NullAllowed)
     */
    public void setTAllocInstHBySupplyCustomerIdList(List<TAllocInstH> tAllocInstHBySupplyCustomerIdList) {
        _tAllocInstHBySupplyCustomerIdList = tAllocInstHBySupplyCustomerIdList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMCenterCustomer) {
            BsMCenterCustomer other = (BsMCenterCustomer)obj;
            if (!xSV(_centerCustomerId, other._centerCustomerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _centerCustomerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mCustomer != null)
        { sb.append(li).append(xbRDS(_mCustomer, "mCustomer")); }
        if (_mDeliveryCourse != null)
        { sb.append(li).append(xbRDS(_mDeliveryCourse, "mDeliveryCourse")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_tAllocInstHByDelivCustomerIdList != null) { for (TAllocInstH et : _tAllocInstHByDelivCustomerIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstHByDelivCustomerIdList")); } } }
        if (_tAllocInstHBySupplyCustomerIdList != null) { for (TAllocInstH et : _tAllocInstHBySupplyCustomerIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tAllocInstHBySupplyCustomerIdList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_centerCustomerId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_customerId));
        sb.append(dm).append(xfND(_deliveryCourseId));
        sb.append(dm).append(xfND(_deliveryOrder));
        sb.append(dm).append(xfND(_deliveryReadTime));
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
        if (_mCustomer != null)
        { sb.append(dm).append("mCustomer"); }
        if (_mDeliveryCourse != null)
        { sb.append(dm).append("mDeliveryCourse"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_tAllocInstHByDelivCustomerIdList != null && !_tAllocInstHByDelivCustomerIdList.isEmpty())
        { sb.append(dm).append("tAllocInstHByDelivCustomerIdList"); }
        if (_tAllocInstHBySupplyCustomerIdList != null && !_tAllocInstHBySupplyCustomerIdList.isEmpty())
        { sb.append(dm).append("tAllocInstHBySupplyCustomerIdList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCenterCustomer clone() {
        return (MCenterCustomer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CENTER_CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点取引先ID
     * @return The value of the column 'CENTER_CUSTOMER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterCustomerId() {
        checkSpecifiedProperty("centerCustomerId");
        return _centerCustomerId;
    }

    /**
     * [set] CENTER_CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点取引先ID
     * @param centerCustomerId The value of the column 'CENTER_CUSTOMER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterCustomerId(Long centerCustomerId) {
        registerModifiedProperty("centerCustomerId");
        _centerCustomerId = centerCustomerId;
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
     * [get] CUSTOMER_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CUSTOMER} <br>
     * 取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCustomerId() {
        checkSpecifiedProperty("customerId");
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {+UQ, IX, NotNull, bigint(19), FK to M_CUSTOMER} <br>
     * 取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCustomerId(Long customerId) {
        registerModifiedProperty("customerId");
        _customerId = customerId;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {+UQ, IX, NotNull, bigint(19), FK to M_DELIVERY_COURSE} <br>
     * 配送コースID
     * @return The value of the column 'DELIVERY_COURSE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDeliveryCourseId() {
        checkSpecifiedProperty("deliveryCourseId");
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {+UQ, IX, NotNull, bigint(19), FK to M_DELIVERY_COURSE} <br>
     * 配送コースID
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        registerModifiedProperty("deliveryCourseId");
        _deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] DELIVERY_ORDER: {bigint(19)} <br>
     * 配送順
     * @return The value of the column 'DELIVERY_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDeliveryOrder() {
        checkSpecifiedProperty("deliveryOrder");
        return _deliveryOrder;
    }

    /**
     * [set] DELIVERY_ORDER: {bigint(19)} <br>
     * 配送順
     * @param deliveryOrder The value of the column 'DELIVERY_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryOrder(Long deliveryOrder) {
        registerModifiedProperty("deliveryOrder");
        _deliveryOrder = deliveryOrder;
    }

    /**
     * [get] DELIVERY_READ_TIME: {bigint(19)} <br>
     * 配送リードタイム
     * @return The value of the column 'DELIVERY_READ_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDeliveryReadTime() {
        checkSpecifiedProperty("deliveryReadTime");
        return _deliveryReadTime;
    }

    /**
     * [set] DELIVERY_READ_TIME: {bigint(19)} <br>
     * 配送リードタイム
     * @param deliveryReadTime The value of the column 'DELIVERY_READ_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryReadTime(Long deliveryReadTime) {
        registerModifiedProperty("deliveryReadTime");
        _deliveryReadTime = deliveryReadTime;
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
