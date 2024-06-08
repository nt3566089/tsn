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
 * The entity of E_SHIPPING_INOUT_PLAN as TABLE. <br>
 * 品質検査完了実績送信テーブル
 * <pre>
 * [primary-key]
 *     SHIPPING_INOUT_PLAN_ID
 *
 * [column]
 *     SHIPPING_INOUT_PLAN_ID, SEND_CD, SEND_LOW_CD, WORK_FLG, CENTER_CD, SBWAREHOUSECD, SUPPLIERRCVNO, EXAMKBN, EXAMDATE, EXAMEND, PRODUCT_CD, LOT1, BEFZAIKOINV, BEFLOT4, BEFLOT3, AFTZAIKOINV, AFTLOT4, AFTLOT3, QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INOUT_PLAN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shippingInoutPlanId = entity.getShippingInoutPlanId();
 * String sendCd = entity.getSendCd();
 * Long sendLowCd = entity.getSendLowCd();
 * String workFlg = entity.getWorkFlg();
 * String centerCd = entity.getCenterCd();
 * String sbwarehousecd = entity.getSbwarehousecd();
 * String supplierrcvno = entity.getSupplierrcvno();
 * String examkbn = entity.getExamkbn();
 * String examdate = entity.getExamdate();
 * String examend = entity.getExamend();
 * String productCd = entity.getProductCd();
 * String lot1 = entity.getLot1();
 * String befzaikoinv = entity.getBefzaikoinv();
 * String beflot4 = entity.getBeflot4();
 * String beflot3 = entity.getBeflot3();
 * String aftzaikoinv = entity.getAftzaikoinv();
 * String aftlot4 = entity.getAftlot4();
 * String aftlot3 = entity.getAftlot3();
 * String qty = entity.getQty();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShippingInoutPlanId(shippingInoutPlanId);
 * entity.setSendCd(sendCd);
 * entity.setSendLowCd(sendLowCd);
 * entity.setWorkFlg(workFlg);
 * entity.setCenterCd(centerCd);
 * entity.setSbwarehousecd(sbwarehousecd);
 * entity.setSupplierrcvno(supplierrcvno);
 * entity.setExamkbn(examkbn);
 * entity.setExamdate(examdate);
 * entity.setExamend(examend);
 * entity.setProductCd(productCd);
 * entity.setLot1(lot1);
 * entity.setBefzaikoinv(befzaikoinv);
 * entity.setBeflot4(beflot4);
 * entity.setBeflot3(beflot3);
 * entity.setAftzaikoinv(aftzaikoinv);
 * entity.setAftlot4(aftlot4);
 * entity.setAftlot3(aftlot3);
 * entity.setQty(qty);
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
public abstract class BsEShippingInoutPlan extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _shippingInoutPlanId;

    /** SEND_CD: {NotNull, varchar(30)} */
    protected String _sendCd;

    /** SEND_LOW_CD: {NotNull, bigint(19)} */
    protected Long _sendLowCd;

    /** WORK_FLG: {NotNull, varchar(8)} */
    protected String _workFlg;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** SBWAREHOUSECD: {varchar(255)} */
    protected String _sbwarehousecd;

    /** SUPPLIERRCVNO: {varchar(255)} */
    protected String _supplierrcvno;

    /** EXAMKBN: {varchar(255)} */
    protected String _examkbn;

    /** EXAMDATE: {varchar(255)} */
    protected String _examdate;

    /** EXAMEND: {varchar(255)} */
    protected String _examend;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** LOT1: {varchar(255)} */
    protected String _lot1;

    /** BEFZAIKOINV: {varchar(255)} */
    protected String _befzaikoinv;

    /** BEFLOT4: {varchar(255)} */
    protected String _beflot4;

    /** BEFLOT3: {varchar(255)} */
    protected String _beflot3;

    /** AFTZAIKOINV: {varchar(255)} */
    protected String _aftzaikoinv;

    /** AFTLOT4: {varchar(255)} */
    protected String _aftlot4;

    /** AFTLOT3: {varchar(255)} */
    protected String _aftlot3;

    /** QTY: {varchar(255)} */
    protected String _qty;

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
        return "E_SHIPPING_INOUT_PLAN";
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
        if (_shippingInoutPlanId == null) { return false; }
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsEShippingInoutPlan) {
            BsEShippingInoutPlan other = (BsEShippingInoutPlan)obj;
            if (!xSV(_shippingInoutPlanId, other._shippingInoutPlanId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingInoutPlanId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingInoutPlanId));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendLowCd));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_sbwarehousecd));
        sb.append(dm).append(xfND(_supplierrcvno));
        sb.append(dm).append(xfND(_examkbn));
        sb.append(dm).append(xfND(_examdate));
        sb.append(dm).append(xfND(_examend));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_befzaikoinv));
        sb.append(dm).append(xfND(_beflot4));
        sb.append(dm).append(xfND(_beflot3));
        sb.append(dm).append(xfND(_aftzaikoinv));
        sb.append(dm).append(xfND(_aftlot4));
        sb.append(dm).append(xfND(_aftlot3));
        sb.append(dm).append(xfND(_qty));
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
        return "";
    }

    @Override
    public EShippingInoutPlan clone() {
        return (EShippingInoutPlan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 品質検査完了実績送信ID
     * @return The value of the column 'SHIPPING_INOUT_PLAN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInoutPlanId() {
        checkSpecifiedProperty("shippingInoutPlanId");
        return _shippingInoutPlanId;
    }

    /**
     * [set] SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 品質検査完了実績送信ID
     * @param shippingInoutPlanId The value of the column 'SHIPPING_INOUT_PLAN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInoutPlanId(Long shippingInoutPlanId) {
        registerModifiedProperty("shippingInoutPlanId");
        _shippingInoutPlanId = shippingInoutPlanId;
    }

    /**
     * [get] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getSendCd() {
        checkSpecifiedProperty("sendCd");
        return convertEmptyToNull(_sendCd);
    }

    /**
     * [set] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (basically NotNull if update: for the constraint)
     */
    public void setSendCd(String sendCd) {
        registerModifiedProperty("sendCd");
        _sendCd = sendCd;
    }

    /**
     * [get] SEND_LOW_CD: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_LOW_CD'. (basically NotNull if selected: for the constraint)
     */
    public Long getSendLowCd() {
        checkSpecifiedProperty("sendLowCd");
        return _sendLowCd;
    }

    /**
     * [set] SEND_LOW_CD: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendLowCd The value of the column 'SEND_LOW_CD'. (basically NotNull if update: for the constraint)
     */
    public void setSendLowCd(Long sendLowCd) {
        registerModifiedProperty("sendLowCd");
        _sendLowCd = sendLowCd;
    }

    /**
     * [get] WORK_FLG: {NotNull, varchar(8)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {NotNull, varchar(8)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setWorkFlg(String workFlg) {
        registerModifiedProperty("workFlg");
        _workFlg = workFlg;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫CD
     * @return The value of the column 'SBWAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSbwarehousecd() {
        checkSpecifiedProperty("sbwarehousecd");
        return convertEmptyToNull(_sbwarehousecd);
    }

    /**
     * [set] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫CD
     * @param sbwarehousecd The value of the column 'SBWAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSbwarehousecd(String sbwarehousecd) {
        registerModifiedProperty("sbwarehousecd");
        _sbwarehousecd = sbwarehousecd;
    }

    /**
     * [get] SUPPLIERRCVNO: {varchar(255)} <br>
     * 保税管理番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrcvno() {
        checkSpecifiedProperty("supplierrcvno");
        return convertEmptyToNull(_supplierrcvno);
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(255)} <br>
     * 保税管理番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        registerModifiedProperty("supplierrcvno");
        _supplierrcvno = supplierrcvno;
    }

    /**
     * [get] EXAMKBN: {varchar(255)} <br>
     * 検査区分
     * @return The value of the column 'EXAMKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getExamkbn() {
        checkSpecifiedProperty("examkbn");
        return convertEmptyToNull(_examkbn);
    }

    /**
     * [set] EXAMKBN: {varchar(255)} <br>
     * 検査区分
     * @param examkbn The value of the column 'EXAMKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExamkbn(String examkbn) {
        registerModifiedProperty("examkbn");
        _examkbn = examkbn;
    }

    /**
     * [get] EXAMDATE: {varchar(255)} <br>
     * 検査日
     * @return The value of the column 'EXAMDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getExamdate() {
        checkSpecifiedProperty("examdate");
        return convertEmptyToNull(_examdate);
    }

    /**
     * [set] EXAMDATE: {varchar(255)} <br>
     * 検査日
     * @param examdate The value of the column 'EXAMDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExamdate(String examdate) {
        registerModifiedProperty("examdate");
        _examdate = examdate;
    }

    /**
     * [get] EXAMEND: {varchar(255)} <br>
     * 検査完了
     * @return The value of the column 'EXAMEND'. (NullAllowed even if selected: for no constraint)
     */
    public String getExamend() {
        checkSpecifiedProperty("examend");
        return convertEmptyToNull(_examend);
    }

    /**
     * [set] EXAMEND: {varchar(255)} <br>
     * 検査完了
     * @param examend The value of the column 'EXAMEND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExamend(String examend) {
        registerModifiedProperty("examend");
        _examend = examend;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] BEFZAIKOINV: {varchar(255)} <br>
     * 変更前在庫区分
     * @return The value of the column 'BEFZAIKOINV'. (NullAllowed even if selected: for no constraint)
     */
    public String getBefzaikoinv() {
        checkSpecifiedProperty("befzaikoinv");
        return convertEmptyToNull(_befzaikoinv);
    }

    /**
     * [set] BEFZAIKOINV: {varchar(255)} <br>
     * 変更前在庫区分
     * @param befzaikoinv The value of the column 'BEFZAIKOINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBefzaikoinv(String befzaikoinv) {
        registerModifiedProperty("befzaikoinv");
        _befzaikoinv = befzaikoinv;
    }

    /**
     * [get] BEFLOT4: {varchar(255)} <br>
     * 変更前製造年月
     * @return The value of the column 'BEFLOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getBeflot4() {
        checkSpecifiedProperty("beflot4");
        return convertEmptyToNull(_beflot4);
    }

    /**
     * [set] BEFLOT4: {varchar(255)} <br>
     * 変更前製造年月
     * @param beflot4 The value of the column 'BEFLOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBeflot4(String beflot4) {
        registerModifiedProperty("beflot4");
        _beflot4 = beflot4;
    }

    /**
     * [get] BEFLOT3: {varchar(255)} <br>
     * 変更前デザイン区分
     * @return The value of the column 'BEFLOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getBeflot3() {
        checkSpecifiedProperty("beflot3");
        return convertEmptyToNull(_beflot3);
    }

    /**
     * [set] BEFLOT3: {varchar(255)} <br>
     * 変更前デザイン区分
     * @param beflot3 The value of the column 'BEFLOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBeflot3(String beflot3) {
        registerModifiedProperty("beflot3");
        _beflot3 = beflot3;
    }

    /**
     * [get] AFTZAIKOINV: {varchar(255)} <br>
     * 変更後在庫区分
     * @return The value of the column 'AFTZAIKOINV'. (NullAllowed even if selected: for no constraint)
     */
    public String getAftzaikoinv() {
        checkSpecifiedProperty("aftzaikoinv");
        return convertEmptyToNull(_aftzaikoinv);
    }

    /**
     * [set] AFTZAIKOINV: {varchar(255)} <br>
     * 変更後在庫区分
     * @param aftzaikoinv The value of the column 'AFTZAIKOINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAftzaikoinv(String aftzaikoinv) {
        registerModifiedProperty("aftzaikoinv");
        _aftzaikoinv = aftzaikoinv;
    }

    /**
     * [get] AFTLOT4: {varchar(255)} <br>
     * 変更後製造年月
     * @return The value of the column 'AFTLOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getAftlot4() {
        checkSpecifiedProperty("aftlot4");
        return convertEmptyToNull(_aftlot4);
    }

    /**
     * [set] AFTLOT4: {varchar(255)} <br>
     * 変更後製造年月
     * @param aftlot4 The value of the column 'AFTLOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAftlot4(String aftlot4) {
        registerModifiedProperty("aftlot4");
        _aftlot4 = aftlot4;
    }

    /**
     * [get] AFTLOT3: {varchar(255)} <br>
     * 変更後デザイン区分
     * @return The value of the column 'AFTLOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAftlot3() {
        checkSpecifiedProperty("aftlot3");
        return convertEmptyToNull(_aftlot3);
    }

    /**
     * [set] AFTLOT3: {varchar(255)} <br>
     * 変更後デザイン区分
     * @param aftlot3 The value of the column 'AFTLOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAftlot3(String aftlot3) {
        registerModifiedProperty("aftlot3");
        _aftlot3 = aftlot3;
    }

    /**
     * [get] QTY: {varchar(255)} <br>
     * 個数(個装)
     * @return The value of the column 'QTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getQty() {
        checkSpecifiedProperty("qty");
        return convertEmptyToNull(_qty);
    }

    /**
     * [set] QTY: {varchar(255)} <br>
     * 個数(個装)
     * @param qty The value of the column 'QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty(String qty) {
        registerModifiedProperty("qty");
        _qty = qty;
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
