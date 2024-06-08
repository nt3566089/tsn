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
 * The entity of T_PIC_MTHD_RCMD as TABLE. <br>
 * ピッキング提案
 * <pre>
 * [primary-key]
 *     PIC_MTHD_RCMD_ID
 *
 * [column]
 *     PIC_MTHD_RCMD_ID, CLIENT_ID, CENTER_ID, PICKING_BATCH_NO, RCMD_PICKING_CLS, PACKING_NUM, WORK_VOLUME, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, EMERGENCY_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PIC_MTHD_RCMD_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, B_CLASS_DTL(ByRcmdPickingCls)
 *
 * [referrer table]
 *     T_PIC_MTHD_RCMD_CART, T_PIC_MTHD_RCMD_DATA
 *
 * [foreign property]
 *     mCenter, mClient, bClassDtlByRcmdPickingCls, bClassDtlByEmergencyFlg
 *
 * [referrer property]
 *     tPicMthdRcmdCartList, tPicMthdRcmdDataList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long picMthdRcmdId = entity.getPicMthdRcmdId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * String pickingBatchNo = entity.getPickingBatchNo();
 * String rcmdPickingCls = entity.getRcmdPickingCls();
 * Long packingNum = entity.getPackingNum();
 * java.math.BigDecimal workVolume = entity.getWorkVolume();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * String carrierCd = entity.getCarrierCd();
 * String carrierNm = entity.getCarrierNm();
 * String emergencyFlg = entity.getEmergencyFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPicMthdRcmdId(picMthdRcmdId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setPickingBatchNo(pickingBatchNo);
 * entity.setRcmdPickingCls(rcmdPickingCls);
 * entity.setPackingNum(packingNum);
 * entity.setWorkVolume(workVolume);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setCarrierCd(carrierCd);
 * entity.setCarrierNm(carrierNm);
 * entity.setEmergencyFlg(emergencyFlg);
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
public abstract class BsTPicMthdRcmd extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _picMthdRcmdId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    protected Long _centerId;

    /** PICKING_BATCH_NO: {varchar(30)} */
    protected String _pickingBatchNo;

    /** RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls} */
    protected String _rcmdPickingCls;

    /** PACKING_NUM: {bigint(19)} */
    protected Long _packingNum;

    /** WORK_VOLUME: {decimal(16, 6)} */
    protected java.math.BigDecimal _workVolume;

    /** DELIVERY_COURSE_CD: {varchar(100)} */
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {varchar(255)} */
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {varchar(100)} */
    protected String _carrierCd;

    /** CARRIER_NM: {varchar(255)} */
    protected String _carrierNm;

    /** EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} */
    protected String _emergencyFlg;

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
        return "T_PIC_MTHD_RCMD";
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
        if (_picMthdRcmdId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of rcmdPickingCls as the classification of RcmdPickingCls. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls} <br>
     * 提案ピッキング方法
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.RcmdPickingCls getRcmdPickingClsAsRcmdPickingCls() {
        return CDef.RcmdPickingCls.codeOf(getRcmdPickingCls());
    }

    /**
     * Set the value of rcmdPickingCls as the classification of RcmdPickingCls. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls} <br>
     * 提案ピッキング方法
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setRcmdPickingClsAsRcmdPickingCls(CDef.RcmdPickingCls cdef) {
        setRcmdPickingCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of emergencyFlg as the classification of EmergencyFlg. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.EmergencyFlg getEmergencyFlgAsEmergencyFlg() {
        return CDef.EmergencyFlg.codeOf(getEmergencyFlg());
    }

    /**
     * Set the value of emergencyFlg as the classification of EmergencyFlg. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setEmergencyFlgAsEmergencyFlg(CDef.EmergencyFlg cdef) {
        setEmergencyFlg(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of rcmdPickingCls as $1 (1). <br>
     * $1: オーダーピッキング
     */
    public void setRcmdPickingCls_$1() {
        setRcmdPickingClsAsRcmdPickingCls(CDef.RcmdPickingCls.$1);
    }

    /**
     * Set the value of rcmdPickingCls as $2 (2). <br>
     * $2: トータルピッキング＋摘み取り
     */
    public void setRcmdPickingCls_$2() {
        setRcmdPickingClsAsRcmdPickingCls(CDef.RcmdPickingCls.$2);
    }

    /**
     * Set the value of rcmdPickingCls as $3 (3). <br>
     * $3: トータルピッキング＋種蒔き
     */
    public void setRcmdPickingCls_$3() {
        setRcmdPickingClsAsRcmdPickingCls(CDef.RcmdPickingCls.$3);
    }

    /**
     * Set the value of rcmdPickingCls as $4 (4). <br>
     * $4: マルチピッキング
     */
    public void setRcmdPickingCls_$4() {
        setRcmdPickingClsAsRcmdPickingCls(CDef.RcmdPickingCls.$4);
    }

    /**
     * Set the value of rcmdPickingCls as $5 (5). <br>
     * $5: 単行ピッキング
     */
    public void setRcmdPickingCls_$5() {
        setRcmdPickingClsAsRcmdPickingCls(CDef.RcmdPickingCls.$5);
    }

    /**
     * Set the value of rcmdPickingCls as $6 (6). <br>
     * $6: ケースピッキング
     */
    public void setRcmdPickingCls_$6() {
        setRcmdPickingClsAsRcmdPickingCls(CDef.RcmdPickingCls.$6);
    }

    /**
     * Set the value of emergencyFlg as $0 (0). <br>
     * $0: 通常
     */
    public void setEmergencyFlg_$0() {
        setEmergencyFlgAsEmergencyFlg(CDef.EmergencyFlg.$0);
    }

    /**
     * Set the value of emergencyFlg as $1 (1). <br>
     * $1: 緊急
     */
    public void setEmergencyFlg_$1() {
        setEmergencyFlgAsEmergencyFlg(CDef.EmergencyFlg.$1);
    }

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
     * Is the value of rcmdPickingCls $1? <br>
     * $1: オーダーピッキング
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRcmdPickingCls$1() {
        CDef.RcmdPickingCls cdef = getRcmdPickingClsAsRcmdPickingCls();
        return cdef != null ? cdef.equals(CDef.RcmdPickingCls.$1) : false;
    }

    /**
     * Is the value of rcmdPickingCls $2? <br>
     * $2: トータルピッキング＋摘み取り
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRcmdPickingCls$2() {
        CDef.RcmdPickingCls cdef = getRcmdPickingClsAsRcmdPickingCls();
        return cdef != null ? cdef.equals(CDef.RcmdPickingCls.$2) : false;
    }

    /**
     * Is the value of rcmdPickingCls $3? <br>
     * $3: トータルピッキング＋種蒔き
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRcmdPickingCls$3() {
        CDef.RcmdPickingCls cdef = getRcmdPickingClsAsRcmdPickingCls();
        return cdef != null ? cdef.equals(CDef.RcmdPickingCls.$3) : false;
    }

    /**
     * Is the value of rcmdPickingCls $4? <br>
     * $4: マルチピッキング
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRcmdPickingCls$4() {
        CDef.RcmdPickingCls cdef = getRcmdPickingClsAsRcmdPickingCls();
        return cdef != null ? cdef.equals(CDef.RcmdPickingCls.$4) : false;
    }

    /**
     * Is the value of rcmdPickingCls $5? <br>
     * $5: 単行ピッキング
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRcmdPickingCls$5() {
        CDef.RcmdPickingCls cdef = getRcmdPickingClsAsRcmdPickingCls();
        return cdef != null ? cdef.equals(CDef.RcmdPickingCls.$5) : false;
    }

    /**
     * Is the value of rcmdPickingCls $6? <br>
     * $6: ケースピッキング
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRcmdPickingCls$6() {
        CDef.RcmdPickingCls cdef = getRcmdPickingClsAsRcmdPickingCls();
        return cdef != null ? cdef.equals(CDef.RcmdPickingCls.$6) : false;
    }

    /**
     * Is the value of emergencyFlg $0? <br>
     * $0: 通常
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEmergencyFlg$0() {
        CDef.EmergencyFlg cdef = getEmergencyFlgAsEmergencyFlg();
        return cdef != null ? cdef.equals(CDef.EmergencyFlg.$0) : false;
    }

    /**
     * Is the value of emergencyFlg $1? <br>
     * $1: 緊急
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEmergencyFlg$1() {
        CDef.EmergencyFlg cdef = getEmergencyFlgAsEmergencyFlg();
        return cdef != null ? cdef.equals(CDef.EmergencyFlg.$1) : false;
    }

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
     * Get the value of the column 'rcmdPickingCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getRcmdPickingClsName() {
        CDef.RcmdPickingCls cdef = getRcmdPickingClsAsRcmdPickingCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'emergencyFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getEmergencyFlgName() {
        CDef.EmergencyFlg cdef = getEmergencyFlgAsEmergencyFlg();
        return cdef != null ? cdef.name() : null;
    }

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

    /** M_CLIENT by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] M_CLIENT by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

    /** B_CLASS_DTL by my RCMD_PICKING_CLS, named 'BClassDtlByRcmdPickingCls'. */
    protected BClassDtl _bClassDtlByRcmdPickingCls;

    /**
     * [get] B_CLASS_DTL by my RCMD_PICKING_CLS, named 'BClassDtlByRcmdPickingCls'. <br>
     * @return The entity of foreign property 'BClassDtlByRcmdPickingCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByRcmdPickingCls() {
        return _bClassDtlByRcmdPickingCls;
    }

    /**
     * [set] B_CLASS_DTL by my RCMD_PICKING_CLS, named 'BClassDtlByRcmdPickingCls'.
     * @param bClassDtlByRcmdPickingCls The entity of foreign property 'BClassDtlByRcmdPickingCls'. (NullAllowed)
     */
    public void setBClassDtlByRcmdPickingCls(BClassDtl bClassDtlByRcmdPickingCls) {
        _bClassDtlByRcmdPickingCls = bClassDtlByRcmdPickingCls;
    }

    /** B_CLASS_DTL by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'. */
    protected BClassDtl _bClassDtlByEmergencyFlg;

    /**
     * [get] B_CLASS_DTL by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByEmergencyFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByEmergencyFlg() {
        return _bClassDtlByEmergencyFlg;
    }

    /**
     * [set] B_CLASS_DTL by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'.
     * @param bClassDtlByEmergencyFlg The entity of foreign property 'BClassDtlByEmergencyFlg'. (NullAllowed)
     */
    public void setBClassDtlByEmergencyFlg(BClassDtl bClassDtlByEmergencyFlg) {
        _bClassDtlByEmergencyFlg = bClassDtlByEmergencyFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** T_PIC_MTHD_RCMD_CART by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdCartList'. */
    protected List<TPicMthdRcmdCart> _tPicMthdRcmdCartList;

    /**
     * [get] T_PIC_MTHD_RCMD_CART by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdCartList'.
     * @return The entity list of referrer property 'TPicMthdRcmdCartList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPicMthdRcmdCart> getTPicMthdRcmdCartList() {
        if (_tPicMthdRcmdCartList == null) { _tPicMthdRcmdCartList = newReferrerList(); }
        return _tPicMthdRcmdCartList;
    }

    /**
     * [set] T_PIC_MTHD_RCMD_CART by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdCartList'.
     * @param tPicMthdRcmdCartList The entity list of referrer property 'TPicMthdRcmdCartList'. (NullAllowed)
     */
    public void setTPicMthdRcmdCartList(List<TPicMthdRcmdCart> tPicMthdRcmdCartList) {
        _tPicMthdRcmdCartList = tPicMthdRcmdCartList;
    }

    /** T_PIC_MTHD_RCMD_DATA by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdDataList'. */
    protected List<TPicMthdRcmdData> _tPicMthdRcmdDataList;

    /**
     * [get] T_PIC_MTHD_RCMD_DATA by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdDataList'.
     * @return The entity list of referrer property 'TPicMthdRcmdDataList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TPicMthdRcmdData> getTPicMthdRcmdDataList() {
        if (_tPicMthdRcmdDataList == null) { _tPicMthdRcmdDataList = newReferrerList(); }
        return _tPicMthdRcmdDataList;
    }

    /**
     * [set] T_PIC_MTHD_RCMD_DATA by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdDataList'.
     * @param tPicMthdRcmdDataList The entity list of referrer property 'TPicMthdRcmdDataList'. (NullAllowed)
     */
    public void setTPicMthdRcmdDataList(List<TPicMthdRcmdData> tPicMthdRcmdDataList) {
        _tPicMthdRcmdDataList = tPicMthdRcmdDataList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTPicMthdRcmd) {
            BsTPicMthdRcmd other = (BsTPicMthdRcmd)obj;
            if (!xSV(_picMthdRcmdId, other._picMthdRcmdId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _picMthdRcmdId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_bClassDtlByRcmdPickingCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByRcmdPickingCls, "bClassDtlByRcmdPickingCls")); }
        if (_bClassDtlByEmergencyFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByEmergencyFlg, "bClassDtlByEmergencyFlg")); }
        if (_tPicMthdRcmdCartList != null) { for (TPicMthdRcmdCart et : _tPicMthdRcmdCartList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPicMthdRcmdCartList")); } } }
        if (_tPicMthdRcmdDataList != null) { for (TPicMthdRcmdData et : _tPicMthdRcmdDataList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tPicMthdRcmdDataList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_picMthdRcmdId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_pickingBatchNo));
        sb.append(dm).append(xfND(_rcmdPickingCls));
        sb.append(dm).append(xfND(_packingNum));
        sb.append(dm).append(xfND(_workVolume));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_carrierNm));
        sb.append(dm).append(xfND(_emergencyFlg));
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
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_bClassDtlByRcmdPickingCls != null)
        { sb.append(dm).append("bClassDtlByRcmdPickingCls"); }
        if (_bClassDtlByEmergencyFlg != null)
        { sb.append(dm).append("bClassDtlByEmergencyFlg"); }
        if (_tPicMthdRcmdCartList != null && !_tPicMthdRcmdCartList.isEmpty())
        { sb.append(dm).append("tPicMthdRcmdCartList"); }
        if (_tPicMthdRcmdDataList != null && !_tPicMthdRcmdDataList.isEmpty())
        { sb.append(dm).append("tPicMthdRcmdDataList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TPicMthdRcmd clone() {
        return (TPicMthdRcmd)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング提案ID
     * @return The value of the column 'PIC_MTHD_RCMD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPicMthdRcmdId() {
        checkSpecifiedProperty("picMthdRcmdId");
        return _picMthdRcmdId;
    }

    /**
     * [set] PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ピッキング提案ID
     * @param picMthdRcmdId The value of the column 'PIC_MTHD_RCMD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPicMthdRcmdId(Long picMthdRcmdId) {
        registerModifiedProperty("picMthdRcmdId");
        _picMthdRcmdId = picMthdRcmdId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] PICKING_BATCH_NO: {varchar(30)} <br>
     * ピッキングバッチNo.
     * @return The value of the column 'PICKING_BATCH_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingBatchNo() {
        checkSpecifiedProperty("pickingBatchNo");
        return convertEmptyToNull(_pickingBatchNo);
    }

    /**
     * [set] PICKING_BATCH_NO: {varchar(30)} <br>
     * ピッキングバッチNo.
     * @param pickingBatchNo The value of the column 'PICKING_BATCH_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingBatchNo(String pickingBatchNo) {
        registerModifiedProperty("pickingBatchNo");
        _pickingBatchNo = pickingBatchNo;
    }

    /**
     * [get] RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls} <br>
     * 提案ピッキング方法
     * @return The value of the column 'RCMD_PICKING_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcmdPickingCls() {
        checkSpecifiedProperty("rcmdPickingCls");
        return convertEmptyToNull(_rcmdPickingCls);
    }

    /**
     * [set] RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls} <br>
     * 提案ピッキング方法
     * @param rcmdPickingCls The value of the column 'RCMD_PICKING_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcmdPickingCls(String rcmdPickingCls) {
        registerModifiedProperty("rcmdPickingCls");
        _rcmdPickingCls = rcmdPickingCls;
    }

    /**
     * [get] PACKING_NUM: {bigint(19)} <br>
     * 梱包数
     * @return The value of the column 'PACKING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPackingNum() {
        checkSpecifiedProperty("packingNum");
        return _packingNum;
    }

    /**
     * [set] PACKING_NUM: {bigint(19)} <br>
     * 梱包数
     * @param packingNum The value of the column 'PACKING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum(Long packingNum) {
        registerModifiedProperty("packingNum");
        _packingNum = packingNum;
    }

    /**
     * [get] WORK_VOLUME: {decimal(16, 6)} <br>
     * 仕事量
     * @return The value of the column 'WORK_VOLUME'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getWorkVolume() {
        checkSpecifiedProperty("workVolume");
        return _workVolume;
    }

    /**
     * [set] WORK_VOLUME: {decimal(16, 6)} <br>
     * 仕事量
     * @param workVolume The value of the column 'WORK_VOLUME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkVolume(java.math.BigDecimal workVolume) {
        registerModifiedProperty("workVolume");
        _workVolume = workVolume;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(100)} <br>
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(100)} <br>
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {varchar(255)} <br>
     * 配送コース名称
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseNm() {
        checkSpecifiedProperty("deliveryCourseNm");
        return convertEmptyToNull(_deliveryCourseNm);
    }

    /**
     * [set] DELIVERY_COURSE_NM: {varchar(255)} <br>
     * 配送コース名称
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        registerModifiedProperty("deliveryCourseNm");
        _deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_CD: {varchar(100)} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {varchar(100)} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {varchar(255)} <br>
     * 運送業者名称
     * @return The value of the column 'CARRIER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierNm() {
        checkSpecifiedProperty("carrierNm");
        return convertEmptyToNull(_carrierNm);
    }

    /**
     * [set] CARRIER_NM: {varchar(255)} <br>
     * 運送業者名称
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierNm(String carrierNm) {
        registerModifiedProperty("carrierNm");
        _carrierNm = carrierNm;
    }

    /**
     * [get] EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmergencyFlg() {
        checkSpecifiedProperty("emergencyFlg");
        return convertEmptyToNull(_emergencyFlg);
    }

    /**
     * [set] EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        registerModifiedProperty("emergencyFlg");
        _emergencyFlg = emergencyFlg;
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
