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
 * The entity of E_RECEIVE_PLAN as TABLE. <br>
 * 入荷予定受信
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_ID
 *
 * [column]
 *     RECEIVE_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CENTER_CD, PLAN_CLIENT_RECEIVE_NO, PLAN_SUPPLIER_CD, RECEIVE_PLAN_DT, PROCESS_TYPE_CD, STOCK_TYPE_CD, PLAN_DEPOSIT_CD, PRODUCT_CD, PRODUCT_NM, PLAN_NUM, PLAN_WAREHOUSE_CD, PLAN_LOCATION_CD, PLAN_LOT, PLAN_LIMIT_DT, PLAN_CLIENT_ORDER_NO, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_ID
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
 * Long receivePlanId = entity.getReceivePlanId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String clientCd = entity.getClientCd();
 * String centerCd = entity.getCenterCd();
 * String planClientReceiveNo = entity.getPlanClientReceiveNo();
 * String planSupplierCd = entity.getPlanSupplierCd();
 * String receivePlanDt = entity.getReceivePlanDt();
 * String processTypeCd = entity.getProcessTypeCd();
 * String stockTypeCd = entity.getStockTypeCd();
 * String planDepositCd = entity.getPlanDepositCd();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String planNum = entity.getPlanNum();
 * String planWarehouseCd = entity.getPlanWarehouseCd();
 * String planLocationCd = entity.getPlanLocationCd();
 * String planLot = entity.getPlanLot();
 * String planLimitDt = entity.getPlanLimitDt();
 * String planClientOrderNo = entity.getPlanClientOrderNo();
 * String spareStr1 = entity.getSpareStr1();
 * String spareStr2 = entity.getSpareStr2();
 * String spareStr3 = entity.getSpareStr3();
 * String spareNum1 = entity.getSpareNum1();
 * String spareNum2 = entity.getSpareNum2();
 * String spareNum3 = entity.getSpareNum3();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setReceivePlanId(receivePlanId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setClientCd(clientCd);
 * entity.setCenterCd(centerCd);
 * entity.setPlanClientReceiveNo(planClientReceiveNo);
 * entity.setPlanSupplierCd(planSupplierCd);
 * entity.setReceivePlanDt(receivePlanDt);
 * entity.setProcessTypeCd(processTypeCd);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setPlanDepositCd(planDepositCd);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setPlanNum(planNum);
 * entity.setPlanWarehouseCd(planWarehouseCd);
 * entity.setPlanLocationCd(planLocationCd);
 * entity.setPlanLot(planLot);
 * entity.setPlanLimitDt(planLimitDt);
 * entity.setPlanClientOrderNo(planClientOrderNo);
 * entity.setSpareStr1(spareStr1);
 * entity.setSpareStr2(spareStr2);
 * entity.setSpareStr3(spareStr3);
 * entity.setSpareNum1(spareNum1);
 * entity.setSpareNum2(spareNum2);
 * entity.setSpareNum3(spareNum3);
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
public abstract class BsEReceivePlan extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _receivePlanId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** CLIENT_CD: {varchar(255)} */
    protected String _clientCd;

    /** CENTER_CD: {varchar(255)} */
    protected String _centerCd;

    /** PLAN_CLIENT_RECEIVE_NO: {varchar(255)} */
    protected String _planClientReceiveNo;

    /** PLAN_SUPPLIER_CD: {varchar(255)} */
    protected String _planSupplierCd;

    /** RECEIVE_PLAN_DT: {varchar(255)} */
    protected String _receivePlanDt;

    /** PROCESS_TYPE_CD: {varchar(255)} */
    protected String _processTypeCd;

    /** STOCK_TYPE_CD: {varchar(255)} */
    protected String _stockTypeCd;

    /** PLAN_DEPOSIT_CD: {varchar(255)} */
    protected String _planDepositCd;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** PLAN_NUM: {varchar(255)} */
    protected String _planNum;

    /** PLAN_WAREHOUSE_CD: {varchar(255)} */
    protected String _planWarehouseCd;

    /** PLAN_LOCATION_CD: {varchar(255)} */
    protected String _planLocationCd;

    /** PLAN_LOT: {varchar(255)} */
    protected String _planLot;

    /** PLAN_LIMIT_DT: {varchar(255)} */
    protected String _planLimitDt;

    /** PLAN_CLIENT_ORDER_NO: {varchar(255)} */
    protected String _planClientOrderNo;

    /** SPARE_STR_1: {varchar(255)} */
    protected String _spareStr1;

    /** SPARE_STR_2: {varchar(255)} */
    protected String _spareStr2;

    /** SPARE_STR_3: {varchar(255)} */
    protected String _spareStr3;

    /** SPARE_NUM_1: {varchar(255)} */
    protected String _spareNum1;

    /** SPARE_NUM_2: {varchar(255)} */
    protected String _spareNum2;

    /** SPARE_NUM_3: {varchar(255)} */
    protected String _spareNum3;

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
        return "E_RECEIVE_PLAN";
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
        if (_receivePlanId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param receiveCd : UQ+, IX, NotNull, varchar(30). (NotNull)
     * @param receiveRowId : +UQ, NotNull, bigint(19). (NotNull)
     */
    public void uniqueBy(String receiveCd, Long receiveRowId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("receiveCd");
        __uniqueDrivenProperties.addPropertyName("receiveRowId");
        setReceiveCd(receiveCd);setReceiveRowId(receiveRowId);
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
        if (obj instanceof BsEReceivePlan) {
            BsEReceivePlan other = (BsEReceivePlan)obj;
            if (!xSV(_receivePlanId, other._receivePlanId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receivePlanId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receivePlanId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_planClientReceiveNo));
        sb.append(dm).append(xfND(_planSupplierCd));
        sb.append(dm).append(xfND(_receivePlanDt));
        sb.append(dm).append(xfND(_processTypeCd));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_planDepositCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_planNum));
        sb.append(dm).append(xfND(_planWarehouseCd));
        sb.append(dm).append(xfND(_planLocationCd));
        sb.append(dm).append(xfND(_planLot));
        sb.append(dm).append(xfND(_planLimitDt));
        sb.append(dm).append(xfND(_planClientOrderNo));
        sb.append(dm).append(xfND(_spareStr1));
        sb.append(dm).append(xfND(_spareStr2));
        sb.append(dm).append(xfND(_spareStr3));
        sb.append(dm).append(xfND(_spareNum1));
        sb.append(dm).append(xfND(_spareNum2));
        sb.append(dm).append(xfND(_spareNum3));
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
    public EReceivePlan clone() {
        return (EReceivePlan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入荷予定受信ID
     * @return The value of the column 'RECEIVE_PLAN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivePlanId() {
        checkSpecifiedProperty("receivePlanId");
        return _receivePlanId;
    }

    /**
     * [set] RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入荷予定受信ID
     * @param receivePlanId The value of the column 'RECEIVE_PLAN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanId(Long receivePlanId) {
        registerModifiedProperty("receivePlanId");
        _receivePlanId = receivePlanId;
    }

    /**
     * [get] RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {UQ+, IX, NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(255)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(255)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] PLAN_CLIENT_RECEIVE_NO: {varchar(255)} <br>
     * 予定顧客入荷指示No.
     * @return The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanClientReceiveNo() {
        checkSpecifiedProperty("planClientReceiveNo");
        return convertEmptyToNull(_planClientReceiveNo);
    }

    /**
     * [set] PLAN_CLIENT_RECEIVE_NO: {varchar(255)} <br>
     * 予定顧客入荷指示No.
     * @param planClientReceiveNo The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanClientReceiveNo(String planClientReceiveNo) {
        registerModifiedProperty("planClientReceiveNo");
        _planClientReceiveNo = planClientReceiveNo;
    }

    /**
     * [get] PLAN_SUPPLIER_CD: {varchar(255)} <br>
     * 予定仕入先CD
     * @return The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanSupplierCd() {
        checkSpecifiedProperty("planSupplierCd");
        return convertEmptyToNull(_planSupplierCd);
    }

    /**
     * [set] PLAN_SUPPLIER_CD: {varchar(255)} <br>
     * 予定仕入先CD
     * @param planSupplierCd The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanSupplierCd(String planSupplierCd) {
        registerModifiedProperty("planSupplierCd");
        _planSupplierCd = planSupplierCd;
    }

    /**
     * [get] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * 入荷予定日
     * @return The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivePlanDt() {
        checkSpecifiedProperty("receivePlanDt");
        return convertEmptyToNull(_receivePlanDt);
    }

    /**
     * [set] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * 入荷予定日
     * @param receivePlanDt The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        registerModifiedProperty("receivePlanDt");
        _receivePlanDt = receivePlanDt;
    }

    /**
     * [get] PROCESS_TYPE_CD: {varchar(255)} <br>
     * 処理区分CD
     * @return The value of the column 'PROCESS_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessTypeCd() {
        checkSpecifiedProperty("processTypeCd");
        return convertEmptyToNull(_processTypeCd);
    }

    /**
     * [set] PROCESS_TYPE_CD: {varchar(255)} <br>
     * 処理区分CD
     * @param processTypeCd The value of the column 'PROCESS_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessTypeCd(String processTypeCd) {
        registerModifiedProperty("processTypeCd");
        _processTypeCd = processTypeCd;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(255)} <br>
     * 在庫区分CD
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(255)} <br>
     * 在庫区分CD
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] PLAN_DEPOSIT_CD: {varchar(255)} <br>
     * 予定預託CD
     * @return The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanDepositCd() {
        checkSpecifiedProperty("planDepositCd");
        return convertEmptyToNull(_planDepositCd);
    }

    /**
     * [set] PLAN_DEPOSIT_CD: {varchar(255)} <br>
     * 予定預託CD
     * @param planDepositCd The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanDepositCd(String planDepositCd) {
        registerModifiedProperty("planDepositCd");
        _planDepositCd = planDepositCd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] PLAN_NUM: {varchar(255)} <br>
     * 予定数
     * @return The value of the column 'PLAN_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanNum() {
        checkSpecifiedProperty("planNum");
        return convertEmptyToNull(_planNum);
    }

    /**
     * [set] PLAN_NUM: {varchar(255)} <br>
     * 予定数
     * @param planNum The value of the column 'PLAN_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanNum(String planNum) {
        registerModifiedProperty("planNum");
        _planNum = planNum;
    }

    /**
     * [get] PLAN_WAREHOUSE_CD: {varchar(255)} <br>
     * 予定倉庫CD
     * @return The value of the column 'PLAN_WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanWarehouseCd() {
        checkSpecifiedProperty("planWarehouseCd");
        return convertEmptyToNull(_planWarehouseCd);
    }

    /**
     * [set] PLAN_WAREHOUSE_CD: {varchar(255)} <br>
     * 予定倉庫CD
     * @param planWarehouseCd The value of the column 'PLAN_WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanWarehouseCd(String planWarehouseCd) {
        registerModifiedProperty("planWarehouseCd");
        _planWarehouseCd = planWarehouseCd;
    }

    /**
     * [get] PLAN_LOCATION_CD: {varchar(255)} <br>
     * 予定ロケーションCD
     * @return The value of the column 'PLAN_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanLocationCd() {
        checkSpecifiedProperty("planLocationCd");
        return convertEmptyToNull(_planLocationCd);
    }

    /**
     * [set] PLAN_LOCATION_CD: {varchar(255)} <br>
     * 予定ロケーションCD
     * @param planLocationCd The value of the column 'PLAN_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanLocationCd(String planLocationCd) {
        registerModifiedProperty("planLocationCd");
        _planLocationCd = planLocationCd;
    }

    /**
     * [get] PLAN_LOT: {varchar(255)} <br>
     * 予定ロット
     * @return The value of the column 'PLAN_LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanLot() {
        checkSpecifiedProperty("planLot");
        return convertEmptyToNull(_planLot);
    }

    /**
     * [set] PLAN_LOT: {varchar(255)} <br>
     * 予定ロット
     * @param planLot The value of the column 'PLAN_LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanLot(String planLot) {
        registerModifiedProperty("planLot");
        _planLot = planLot;
    }

    /**
     * [get] PLAN_LIMIT_DT: {varchar(255)} <br>
     * 予定期限日
     * @return The value of the column 'PLAN_LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanLimitDt() {
        checkSpecifiedProperty("planLimitDt");
        return convertEmptyToNull(_planLimitDt);
    }

    /**
     * [set] PLAN_LIMIT_DT: {varchar(255)} <br>
     * 予定期限日
     * @param planLimitDt The value of the column 'PLAN_LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanLimitDt(String planLimitDt) {
        registerModifiedProperty("planLimitDt");
        _planLimitDt = planLimitDt;
    }

    /**
     * [get] PLAN_CLIENT_ORDER_NO: {varchar(255)} <br>
     * 予定顧客発注№
     * @return The value of the column 'PLAN_CLIENT_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanClientOrderNo() {
        checkSpecifiedProperty("planClientOrderNo");
        return convertEmptyToNull(_planClientOrderNo);
    }

    /**
     * [set] PLAN_CLIENT_ORDER_NO: {varchar(255)} <br>
     * 予定顧客発注№
     * @param planClientOrderNo The value of the column 'PLAN_CLIENT_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanClientOrderNo(String planClientOrderNo) {
        registerModifiedProperty("planClientOrderNo");
        _planClientOrderNo = planClientOrderNo;
    }

    /**
     * [get] SPARE_STR_1: {varchar(255)} <br>
     * 予備項目１（文字列）
     * @return The value of the column 'SPARE_STR_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr1() {
        checkSpecifiedProperty("spareStr1");
        return convertEmptyToNull(_spareStr1);
    }

    /**
     * [set] SPARE_STR_1: {varchar(255)} <br>
     * 予備項目１（文字列）
     * @param spareStr1 The value of the column 'SPARE_STR_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr1(String spareStr1) {
        registerModifiedProperty("spareStr1");
        _spareStr1 = spareStr1;
    }

    /**
     * [get] SPARE_STR_2: {varchar(255)} <br>
     * 予備項目２（文字列）
     * @return The value of the column 'SPARE_STR_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr2() {
        checkSpecifiedProperty("spareStr2");
        return convertEmptyToNull(_spareStr2);
    }

    /**
     * [set] SPARE_STR_2: {varchar(255)} <br>
     * 予備項目２（文字列）
     * @param spareStr2 The value of the column 'SPARE_STR_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr2(String spareStr2) {
        registerModifiedProperty("spareStr2");
        _spareStr2 = spareStr2;
    }

    /**
     * [get] SPARE_STR_3: {varchar(255)} <br>
     * 予備項目３（文字列）
     * @return The value of the column 'SPARE_STR_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr3() {
        checkSpecifiedProperty("spareStr3");
        return convertEmptyToNull(_spareStr3);
    }

    /**
     * [set] SPARE_STR_3: {varchar(255)} <br>
     * 予備項目３（文字列）
     * @param spareStr3 The value of the column 'SPARE_STR_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr3(String spareStr3) {
        registerModifiedProperty("spareStr3");
        _spareStr3 = spareStr3;
    }

    /**
     * [get] SPARE_NUM_1: {varchar(255)} <br>
     * 予備項目１（数値）
     * @return The value of the column 'SPARE_NUM_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareNum1() {
        checkSpecifiedProperty("spareNum1");
        return convertEmptyToNull(_spareNum1);
    }

    /**
     * [set] SPARE_NUM_1: {varchar(255)} <br>
     * 予備項目１（数値）
     * @param spareNum1 The value of the column 'SPARE_NUM_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum1(String spareNum1) {
        registerModifiedProperty("spareNum1");
        _spareNum1 = spareNum1;
    }

    /**
     * [get] SPARE_NUM_2: {varchar(255)} <br>
     * 予備項目２（数値）
     * @return The value of the column 'SPARE_NUM_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareNum2() {
        checkSpecifiedProperty("spareNum2");
        return convertEmptyToNull(_spareNum2);
    }

    /**
     * [set] SPARE_NUM_2: {varchar(255)} <br>
     * 予備項目２（数値）
     * @param spareNum2 The value of the column 'SPARE_NUM_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum2(String spareNum2) {
        registerModifiedProperty("spareNum2");
        _spareNum2 = spareNum2;
    }

    /**
     * [get] SPARE_NUM_3: {varchar(255)} <br>
     * 予備項目３（数値）
     * @return The value of the column 'SPARE_NUM_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareNum3() {
        checkSpecifiedProperty("spareNum3");
        return convertEmptyToNull(_spareNum3);
    }

    /**
     * [set] SPARE_NUM_3: {varchar(255)} <br>
     * 予備項目３（数値）
     * @param spareNum3 The value of the column 'SPARE_NUM_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum3(String spareNum3) {
        registerModifiedProperty("spareNum3");
        _spareNum3 = spareNum3;
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
