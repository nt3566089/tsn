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
 * The entity of E_RETURNED_RECEIVE_PLAN as TABLE. <br>
 * 返品入庫予定受信テーブル
 * <pre>
 * [primary-key]
 *     RETURNED_RECEIVE_PLAN_ID
 *
 * [column]
 *     RETURNED_RECEIVE_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, HEADER_FLG, SORT_BS_CD, DELIVAY_CENTER_CD, ORDER_GROUP, SALE_DATETIME, CUSTOMER_CD, SLIP_TYPE, SLIP_NO, SEQUENCE_NO, ORDER_DATE, SHIPING_DATE, OTORGCD, ORDORGCD, RLYBSCD, DIRECTION_CD, PISTON_ID, DELIVALY_RANK, BULK_DELIVALY_NO, DIVMTD, ZZHDVRID, CUSTOMER_NM, HEADER_PRICE_SALE, ZREGPRCC, TAX, ZZGODFPC, ZZGODSPC, ZZGODCTX, COMPANY_CD, SALE_TYPE, HVRT_REASON, HVRT_INOUT_DATE, CNG_PRT_SLIP_NO, PROCESS_TYPE, EOS_ORD_AFT_FLG, EOS_SLIP_NO, HDRD_BX_TYPE, INOT_RFSL_TYPE, BX_MNT_RFSL_TYPE, REPORT_MERFE_TIMING, REPORT_OUT_DATETIME, CLIENT_ID, KWMENG, STATUS_CD, STG_VAL, DETAIL_PRICE_SALE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RETURNED_RECEIVE_PLAN_ID
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
 * Long returnedReceivePlanId = entity.getReturnedReceivePlanId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String headerFlg = entity.getHeaderFlg();
 * String sortBsCd = entity.getSortBsCd();
 * String delivayCenterCd = entity.getDelivayCenterCd();
 * String orderGroup = entity.getOrderGroup();
 * String saleDatetime = entity.getSaleDatetime();
 * String customerCd = entity.getCustomerCd();
 * String slipType = entity.getSlipType();
 * String slipNo = entity.getSlipNo();
 * String sequenceNo = entity.getSequenceNo();
 * String orderDate = entity.getOrderDate();
 * String shipingDate = entity.getShipingDate();
 * String otorgcd = entity.getOtorgcd();
 * String ordorgcd = entity.getOrdorgcd();
 * String rlybscd = entity.getRlybscd();
 * String directionCd = entity.getDirectionCd();
 * String pistonId = entity.getPistonId();
 * String delivalyRank = entity.getDelivalyRank();
 * String bulkDelivalyNo = entity.getBulkDelivalyNo();
 * String divmtd = entity.getDivmtd();
 * String zzhdvrid = entity.getZzhdvrid();
 * String customerNm = entity.getCustomerNm();
 * String headerPriceSale = entity.getHeaderPriceSale();
 * String zregprcc = entity.getZregprcc();
 * String tax = entity.getTax();
 * String zzgodfpc = entity.getZzgodfpc();
 * String zzgodspc = entity.getZzgodspc();
 * String zzgodctx = entity.getZzgodctx();
 * String companyCd = entity.getCompanyCd();
 * String saleType = entity.getSaleType();
 * String hvrtReason = entity.getHvrtReason();
 * String hvrtInoutDate = entity.getHvrtInoutDate();
 * String cngPrtSlipNo = entity.getCngPrtSlipNo();
 * String processType = entity.getProcessType();
 * String eosOrdAftFlg = entity.getEosOrdAftFlg();
 * String eosSlipNo = entity.getEosSlipNo();
 * String hdrdBxType = entity.getHdrdBxType();
 * String inotRfslType = entity.getInotRfslType();
 * String bxMntRfslType = entity.getBxMntRfslType();
 * String reportMerfeTiming = entity.getReportMerfeTiming();
 * String reportOutDatetime = entity.getReportOutDatetime();
 * String clientId = entity.getClientId();
 * String kwmeng = entity.getKwmeng();
 * String statusCd = entity.getStatusCd();
 * String stgVal = entity.getStgVal();
 * String detailPriceSale = entity.getDetailPriceSale();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setReturnedReceivePlanId(returnedReceivePlanId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setHeaderFlg(headerFlg);
 * entity.setSortBsCd(sortBsCd);
 * entity.setDelivayCenterCd(delivayCenterCd);
 * entity.setOrderGroup(orderGroup);
 * entity.setSaleDatetime(saleDatetime);
 * entity.setCustomerCd(customerCd);
 * entity.setSlipType(slipType);
 * entity.setSlipNo(slipNo);
 * entity.setSequenceNo(sequenceNo);
 * entity.setOrderDate(orderDate);
 * entity.setShipingDate(shipingDate);
 * entity.setOtorgcd(otorgcd);
 * entity.setOrdorgcd(ordorgcd);
 * entity.setRlybscd(rlybscd);
 * entity.setDirectionCd(directionCd);
 * entity.setPistonId(pistonId);
 * entity.setDelivalyRank(delivalyRank);
 * entity.setBulkDelivalyNo(bulkDelivalyNo);
 * entity.setDivmtd(divmtd);
 * entity.setZzhdvrid(zzhdvrid);
 * entity.setCustomerNm(customerNm);
 * entity.setHeaderPriceSale(headerPriceSale);
 * entity.setZregprcc(zregprcc);
 * entity.setTax(tax);
 * entity.setZzgodfpc(zzgodfpc);
 * entity.setZzgodspc(zzgodspc);
 * entity.setZzgodctx(zzgodctx);
 * entity.setCompanyCd(companyCd);
 * entity.setSaleType(saleType);
 * entity.setHvrtReason(hvrtReason);
 * entity.setHvrtInoutDate(hvrtInoutDate);
 * entity.setCngPrtSlipNo(cngPrtSlipNo);
 * entity.setProcessType(processType);
 * entity.setEosOrdAftFlg(eosOrdAftFlg);
 * entity.setEosSlipNo(eosSlipNo);
 * entity.setHdrdBxType(hdrdBxType);
 * entity.setInotRfslType(inotRfslType);
 * entity.setBxMntRfslType(bxMntRfslType);
 * entity.setReportMerfeTiming(reportMerfeTiming);
 * entity.setReportOutDatetime(reportOutDatetime);
 * entity.setClientId(clientId);
 * entity.setKwmeng(kwmeng);
 * entity.setStatusCd(statusCd);
 * entity.setStgVal(stgVal);
 * entity.setDetailPriceSale(detailPriceSale);
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
public abstract class BsEReturnedReceivePlan extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _returnedReceivePlanId;

    /** RECEIVE_CD: {NotNull, varchar(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {NotNull, bigint(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** HEADER_FLG: {NotNull, char(1)} */
    protected String _headerFlg;

    /** SORT_BS_CD: {varchar(255)} */
    protected String _sortBsCd;

    /** DELIVAY_CENTER_CD: {varchar(255)} */
    protected String _delivayCenterCd;

    /** ORDER_GROUP: {varchar(255)} */
    protected String _orderGroup;

    /** SALE_DATETIME: {varchar(255)} */
    protected String _saleDatetime;

    /** CUSTOMER_CD: {varchar(255)} */
    protected String _customerCd;

    /** SLIP_TYPE: {varchar(255)} */
    protected String _slipType;

    /** SLIP_NO: {varchar(255)} */
    protected String _slipNo;

    /** SEQUENCE_NO: {varchar(255)} */
    protected String _sequenceNo;

    /** ORDER_DATE: {varchar(255)} */
    protected String _orderDate;

    /** SHIPING_DATE: {varchar(255)} */
    protected String _shipingDate;

    /** OTORGCD: {varchar(255)} */
    protected String _otorgcd;

    /** ORDORGCD: {varchar(255)} */
    protected String _ordorgcd;

    /** RLYBSCD: {varchar(255)} */
    protected String _rlybscd;

    /** DIRECTION_CD: {varchar(255)} */
    protected String _directionCd;

    /** PISTON_ID: {varchar(255)} */
    protected String _pistonId;

    /** DELIVALY_RANK: {varchar(255)} */
    protected String _delivalyRank;

    /** BULK_DELIVALY_NO: {varchar(255)} */
    protected String _bulkDelivalyNo;

    /** DIVMTD: {varchar(255)} */
    protected String _divmtd;

    /** ZZHDVRID: {varchar(255)} */
    protected String _zzhdvrid;

    /** CUSTOMER_NM: {varchar(255)} */
    protected String _customerNm;

    /** HEADER_PRICE_SALE: {varchar(255)} */
    protected String _headerPriceSale;

    /** ZREGPRCC: {varchar(255)} */
    protected String _zregprcc;

    /** TAX: {varchar(255)} */
    protected String _tax;

    /** ZZGODFPC: {varchar(255)} */
    protected String _zzgodfpc;

    /** ZZGODSPC: {varchar(255)} */
    protected String _zzgodspc;

    /** ZZGODCTX: {varchar(255)} */
    protected String _zzgodctx;

    /** COMPANY_CD: {varchar(255)} */
    protected String _companyCd;

    /** SALE_TYPE: {varchar(255)} */
    protected String _saleType;

    /** HVRT_REASON: {varchar(255)} */
    protected String _hvrtReason;

    /** HVRT_INOUT_DATE: {varchar(255)} */
    protected String _hvrtInoutDate;

    /** CNG_PRT_SLIP_NO: {varchar(255)} */
    protected String _cngPrtSlipNo;

    /** PROCESS_TYPE: {varchar(255)} */
    protected String _processType;

    /** EOS_ORD_AFT_FLG: {varchar(255)} */
    protected String _eosOrdAftFlg;

    /** EOS_SLIP_NO: {varchar(255)} */
    protected String _eosSlipNo;

    /** HDRD_BX_TYPE: {varchar(255)} */
    protected String _hdrdBxType;

    /** INOT_RFSL_TYPE: {varchar(255)} */
    protected String _inotRfslType;

    /** BX_MNT_RFSL_TYPE: {varchar(255)} */
    protected String _bxMntRfslType;

    /** REPORT_MERFE_TIMING: {varchar(255)} */
    protected String _reportMerfeTiming;

    /** REPORT_OUT_DATETIME: {varchar(255)} */
    protected String _reportOutDatetime;

    /** CLIENT_ID: {varchar(255)} */
    protected String _clientId;

    /** KWMENG: {varchar(255)} */
    protected String _kwmeng;

    /** STATUS_CD: {varchar(255)} */
    protected String _statusCd;

    /** STG_VAL: {varchar(255)} */
    protected String _stgVal;

    /** DETAIL_PRICE_SALE: {varchar(255)} */
    protected String _detailPriceSale;

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
        return "E_RETURNED_RECEIVE_PLAN";
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
        if (_returnedReceivePlanId == null) { return false; }
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
        if (obj instanceof BsEReturnedReceivePlan) {
            BsEReturnedReceivePlan other = (BsEReturnedReceivePlan)obj;
            if (!xSV(_returnedReceivePlanId, other._returnedReceivePlanId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _returnedReceivePlanId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_returnedReceivePlanId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_headerFlg));
        sb.append(dm).append(xfND(_sortBsCd));
        sb.append(dm).append(xfND(_delivayCenterCd));
        sb.append(dm).append(xfND(_orderGroup));
        sb.append(dm).append(xfND(_saleDatetime));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_slipType));
        sb.append(dm).append(xfND(_slipNo));
        sb.append(dm).append(xfND(_sequenceNo));
        sb.append(dm).append(xfND(_orderDate));
        sb.append(dm).append(xfND(_shipingDate));
        sb.append(dm).append(xfND(_otorgcd));
        sb.append(dm).append(xfND(_ordorgcd));
        sb.append(dm).append(xfND(_rlybscd));
        sb.append(dm).append(xfND(_directionCd));
        sb.append(dm).append(xfND(_pistonId));
        sb.append(dm).append(xfND(_delivalyRank));
        sb.append(dm).append(xfND(_bulkDelivalyNo));
        sb.append(dm).append(xfND(_divmtd));
        sb.append(dm).append(xfND(_zzhdvrid));
        sb.append(dm).append(xfND(_customerNm));
        sb.append(dm).append(xfND(_headerPriceSale));
        sb.append(dm).append(xfND(_zregprcc));
        sb.append(dm).append(xfND(_tax));
        sb.append(dm).append(xfND(_zzgodfpc));
        sb.append(dm).append(xfND(_zzgodspc));
        sb.append(dm).append(xfND(_zzgodctx));
        sb.append(dm).append(xfND(_companyCd));
        sb.append(dm).append(xfND(_saleType));
        sb.append(dm).append(xfND(_hvrtReason));
        sb.append(dm).append(xfND(_hvrtInoutDate));
        sb.append(dm).append(xfND(_cngPrtSlipNo));
        sb.append(dm).append(xfND(_processType));
        sb.append(dm).append(xfND(_eosOrdAftFlg));
        sb.append(dm).append(xfND(_eosSlipNo));
        sb.append(dm).append(xfND(_hdrdBxType));
        sb.append(dm).append(xfND(_inotRfslType));
        sb.append(dm).append(xfND(_bxMntRfslType));
        sb.append(dm).append(xfND(_reportMerfeTiming));
        sb.append(dm).append(xfND(_reportOutDatetime));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_kwmeng));
        sb.append(dm).append(xfND(_statusCd));
        sb.append(dm).append(xfND(_stgVal));
        sb.append(dm).append(xfND(_detailPriceSale));
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
    public EReturnedReceivePlan clone() {
        return (EReturnedReceivePlan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品入庫予定受信ID
     * @return The value of the column 'RETURNED_RECEIVE_PLAN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReturnedReceivePlanId() {
        checkSpecifiedProperty("returnedReceivePlanId");
        return _returnedReceivePlanId;
    }

    /**
     * [set] RETURNED_RECEIVE_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品入庫予定受信ID
     * @param returnedReceivePlanId The value of the column 'RETURNED_RECEIVE_PLAN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReturnedReceivePlanId(Long returnedReceivePlanId) {
        registerModifiedProperty("returnedReceivePlanId");
        _returnedReceivePlanId = returnedReceivePlanId;
    }

    /**
     * [get] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
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
     * [get] HEADER_FLG: {NotNull, char(1)} <br>
     * ヘッダフラグ
     * @return The value of the column 'HEADER_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getHeaderFlg() {
        checkSpecifiedProperty("headerFlg");
        return convertEmptyToNull(_headerFlg);
    }

    /**
     * [set] HEADER_FLG: {NotNull, char(1)} <br>
     * ヘッダフラグ
     * @param headerFlg The value of the column 'HEADER_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setHeaderFlg(String headerFlg) {
        registerModifiedProperty("headerFlg");
        _headerFlg = headerFlg;
    }

    /**
     * [get] SORT_BS_CD: {varchar(255)} <br>
     * 仕分基地コード
     * @return The value of the column 'SORT_BS_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortBsCd() {
        checkSpecifiedProperty("sortBsCd");
        return convertEmptyToNull(_sortBsCd);
    }

    /**
     * [set] SORT_BS_CD: {varchar(255)} <br>
     * 仕分基地コード
     * @param sortBsCd The value of the column 'SORT_BS_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortBsCd(String sortBsCd) {
        registerModifiedProperty("sortBsCd");
        _sortBsCd = sortBsCd;
    }

    /**
     * [get] DELIVAY_CENTER_CD: {varchar(255)} <br>
     * 配達拠点コード
     * @return The value of the column 'DELIVAY_CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivayCenterCd() {
        checkSpecifiedProperty("delivayCenterCd");
        return convertEmptyToNull(_delivayCenterCd);
    }

    /**
     * [set] DELIVAY_CENTER_CD: {varchar(255)} <br>
     * 配達拠点コード
     * @param delivayCenterCd The value of the column 'DELIVAY_CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivayCenterCd(String delivayCenterCd) {
        registerModifiedProperty("delivayCenterCd");
        _delivayCenterCd = delivayCenterCd;
    }

    /**
     * [get] ORDER_GROUP: {varchar(255)} <br>
     * さしずグループ
     * @return The value of the column 'ORDER_GROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderGroup() {
        checkSpecifiedProperty("orderGroup");
        return convertEmptyToNull(_orderGroup);
    }

    /**
     * [set] ORDER_GROUP: {varchar(255)} <br>
     * さしずグループ
     * @param orderGroup The value of the column 'ORDER_GROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderGroup(String orderGroup) {
        registerModifiedProperty("orderGroup");
        _orderGroup = orderGroup;
    }

    /**
     * [get] SALE_DATETIME: {varchar(255)} <br>
     * 販売年月日
     * @return The value of the column 'SALE_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSaleDatetime() {
        checkSpecifiedProperty("saleDatetime");
        return convertEmptyToNull(_saleDatetime);
    }

    /**
     * [set] SALE_DATETIME: {varchar(255)} <br>
     * 販売年月日
     * @param saleDatetime The value of the column 'SALE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSaleDatetime(String saleDatetime) {
        registerModifiedProperty("saleDatetime");
        _saleDatetime = saleDatetime;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様コード
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {varchar(255)} <br>
     * お得意様コード
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
    }

    /**
     * [get] SLIP_TYPE: {varchar(255)} <br>
     * 伝票タイプ
     * @return The value of the column 'SLIP_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipType() {
        checkSpecifiedProperty("slipType");
        return convertEmptyToNull(_slipType);
    }

    /**
     * [set] SLIP_TYPE: {varchar(255)} <br>
     * 伝票タイプ
     * @param slipType The value of the column 'SLIP_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipType(String slipType) {
        registerModifiedProperty("slipType");
        _slipType = slipType;
    }

    /**
     * [get] SLIP_NO: {varchar(255)} <br>
     * 伝票番号
     * @return The value of the column 'SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipNo() {
        checkSpecifiedProperty("slipNo");
        return convertEmptyToNull(_slipNo);
    }

    /**
     * [set] SLIP_NO: {varchar(255)} <br>
     * 伝票番号
     * @param slipNo The value of the column 'SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipNo(String slipNo) {
        registerModifiedProperty("slipNo");
        _slipNo = slipNo;
    }

    /**
     * [get] SEQUENCE_NO: {varchar(255)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQUENCE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSequenceNo() {
        checkSpecifiedProperty("sequenceNo");
        return convertEmptyToNull(_sequenceNo);
    }

    /**
     * [set] SEQUENCE_NO: {varchar(255)} <br>
     * シーケンス番号
     * @param sequenceNo The value of the column 'SEQUENCE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSequenceNo(String sequenceNo) {
        registerModifiedProperty("sequenceNo");
        _sequenceNo = sequenceNo;
    }

    /**
     * [get] ORDER_DATE: {varchar(255)} <br>
     * さしず年月日
     * @return The value of the column 'ORDER_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderDate() {
        checkSpecifiedProperty("orderDate");
        return convertEmptyToNull(_orderDate);
    }

    /**
     * [set] ORDER_DATE: {varchar(255)} <br>
     * さしず年月日
     * @param orderDate The value of the column 'ORDER_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderDate(String orderDate) {
        registerModifiedProperty("orderDate");
        _orderDate = orderDate;
    }

    /**
     * [get] SHIPING_DATE: {varchar(255)} <br>
     * 出荷予定年月日
     * @return The value of the column 'SHIPING_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipingDate() {
        checkSpecifiedProperty("shipingDate");
        return convertEmptyToNull(_shipingDate);
    }

    /**
     * [set] SHIPING_DATE: {varchar(255)} <br>
     * 出荷予定年月日
     * @param shipingDate The value of the column 'SHIPING_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipingDate(String shipingDate) {
        registerModifiedProperty("shipingDate");
        _shipingDate = shipingDate;
    }

    /**
     * [get] OTORGCD: {varchar(255)} <br>
     * 出力先組織コード
     * @return The value of the column 'OTORGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtorgcd() {
        checkSpecifiedProperty("otorgcd");
        return convertEmptyToNull(_otorgcd);
    }

    /**
     * [set] OTORGCD: {varchar(255)} <br>
     * 出力先組織コード
     * @param otorgcd The value of the column 'OTORGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtorgcd(String otorgcd) {
        registerModifiedProperty("otorgcd");
        _otorgcd = otorgcd;
    }

    /**
     * [get] ORDORGCD: {varchar(255)} <br>
     * さしず元組織コード
     * @return The value of the column 'ORDORGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdorgcd() {
        checkSpecifiedProperty("ordorgcd");
        return convertEmptyToNull(_ordorgcd);
    }

    /**
     * [set] ORDORGCD: {varchar(255)} <br>
     * さしず元組織コード
     * @param ordorgcd The value of the column 'ORDORGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdorgcd(String ordorgcd) {
        registerModifiedProperty("ordorgcd");
        _ordorgcd = ordorgcd;
    }

    /**
     * [get] RLYBSCD: {varchar(255)} <br>
     * 中継拠点コード
     * @return The value of the column 'RLYBSCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRlybscd() {
        checkSpecifiedProperty("rlybscd");
        return convertEmptyToNull(_rlybscd);
    }

    /**
     * [set] RLYBSCD: {varchar(255)} <br>
     * 中継拠点コード
     * @param rlybscd The value of the column 'RLYBSCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRlybscd(String rlybscd) {
        registerModifiedProperty("rlybscd");
        _rlybscd = rlybscd;
    }

    /**
     * [get] DIRECTION_CD: {varchar(255)} <br>
     * 配達方面
     * @return The value of the column 'DIRECTION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectionCd() {
        checkSpecifiedProperty("directionCd");
        return convertEmptyToNull(_directionCd);
    }

    /**
     * [set] DIRECTION_CD: {varchar(255)} <br>
     * 配達方面
     * @param directionCd The value of the column 'DIRECTION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionCd(String directionCd) {
        registerModifiedProperty("directionCd");
        _directionCd = directionCd;
    }

    /**
     * [get] PISTON_ID: {varchar(255)} <br>
     * ピストン区分
     * @return The value of the column 'PISTON_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getPistonId() {
        checkSpecifiedProperty("pistonId");
        return convertEmptyToNull(_pistonId);
    }

    /**
     * [set] PISTON_ID: {varchar(255)} <br>
     * ピストン区分
     * @param pistonId The value of the column 'PISTON_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPistonId(String pistonId) {
        registerModifiedProperty("pistonId");
        _pistonId = pistonId;
    }

    /**
     * [get] DELIVALY_RANK: {varchar(255)} <br>
     * 配達順位
     * @return The value of the column 'DELIVALY_RANK'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivalyRank() {
        checkSpecifiedProperty("delivalyRank");
        return convertEmptyToNull(_delivalyRank);
    }

    /**
     * [set] DELIVALY_RANK: {varchar(255)} <br>
     * 配達順位
     * @param delivalyRank The value of the column 'DELIVALY_RANK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivalyRank(String delivalyRank) {
        registerModifiedProperty("delivalyRank");
        _delivalyRank = delivalyRank;
    }

    /**
     * [get] BULK_DELIVALY_NO: {varchar(255)} <br>
     * 一括配達番号
     * @return The value of the column 'BULK_DELIVALY_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBulkDelivalyNo() {
        checkSpecifiedProperty("bulkDelivalyNo");
        return convertEmptyToNull(_bulkDelivalyNo);
    }

    /**
     * [set] BULK_DELIVALY_NO: {varchar(255)} <br>
     * 一括配達番号
     * @param bulkDelivalyNo The value of the column 'BULK_DELIVALY_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBulkDelivalyNo(String bulkDelivalyNo) {
        registerModifiedProperty("bulkDelivalyNo");
        _bulkDelivalyNo = bulkDelivalyNo;
    }

    /**
     * [get] DIVMTD: {varchar(255)} <br>
     * 仕分方式
     * @return The value of the column 'DIVMTD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDivmtd() {
        checkSpecifiedProperty("divmtd");
        return convertEmptyToNull(_divmtd);
    }

    /**
     * [set] DIVMTD: {varchar(255)} <br>
     * 仕分方式
     * @param divmtd The value of the column 'DIVMTD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDivmtd(String divmtd) {
        registerModifiedProperty("divmtd");
        _divmtd = divmtd;
    }

    /**
     * [get] ZZHDVRID: {varchar(255)} <br>
     * 宅配区分
     * @return The value of the column 'ZZHDVRID'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzhdvrid() {
        checkSpecifiedProperty("zzhdvrid");
        return convertEmptyToNull(_zzhdvrid);
    }

    /**
     * [set] ZZHDVRID: {varchar(255)} <br>
     * 宅配区分
     * @param zzhdvrid The value of the column 'ZZHDVRID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzhdvrid(String zzhdvrid) {
        registerModifiedProperty("zzhdvrid");
        _zzhdvrid = zzhdvrid;
    }

    /**
     * [get] CUSTOMER_NM: {varchar(255)} <br>
     * お得意様名称
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerNm() {
        checkSpecifiedProperty("customerNm");
        return convertEmptyToNull(_customerNm);
    }

    /**
     * [set] CUSTOMER_NM: {varchar(255)} <br>
     * お得意様名称
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerNm(String customerNm) {
        registerModifiedProperty("customerNm");
        _customerNm = customerNm;
    }

    /**
     * [get] HEADER_PRICE_SALE: {varchar(255)} <br>
     * ヘッダ定価代金
     * @return The value of the column 'HEADER_PRICE_SALE'. (NullAllowed even if selected: for no constraint)
     */
    public String getHeaderPriceSale() {
        checkSpecifiedProperty("headerPriceSale");
        return convertEmptyToNull(_headerPriceSale);
    }

    /**
     * [set] HEADER_PRICE_SALE: {varchar(255)} <br>
     * ヘッダ定価代金
     * @param headerPriceSale The value of the column 'HEADER_PRICE_SALE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHeaderPriceSale(String headerPriceSale) {
        registerModifiedProperty("headerPriceSale");
        _headerPriceSale = headerPriceSale;
    }

    /**
     * [get] ZREGPRCC: {varchar(255)} <br>
     * 販売代金
     * @return The value of the column 'ZREGPRCC'. (NullAllowed even if selected: for no constraint)
     */
    public String getZregprcc() {
        checkSpecifiedProperty("zregprcc");
        return convertEmptyToNull(_zregprcc);
    }

    /**
     * [set] ZREGPRCC: {varchar(255)} <br>
     * 販売代金
     * @param zregprcc The value of the column 'ZREGPRCC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZregprcc(String zregprcc) {
        registerModifiedProperty("zregprcc");
        _zregprcc = zregprcc;
    }

    /**
     * [get] TAX: {varchar(255)} <br>
     * 消費税
     * @return The value of the column 'TAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getTax() {
        checkSpecifiedProperty("tax");
        return convertEmptyToNull(_tax);
    }

    /**
     * [set] TAX: {varchar(255)} <br>
     * 消費税
     * @param tax The value of the column 'TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTax(String tax) {
        registerModifiedProperty("tax");
        _tax = tax;
    }

    /**
     * [get] ZZGODFPC: {varchar(255)} <br>
     * 商品分定価代金
     * @return The value of the column 'ZZGODFPC'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzgodfpc() {
        checkSpecifiedProperty("zzgodfpc");
        return convertEmptyToNull(_zzgodfpc);
    }

    /**
     * [set] ZZGODFPC: {varchar(255)} <br>
     * 商品分定価代金
     * @param zzgodfpc The value of the column 'ZZGODFPC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzgodfpc(String zzgodfpc) {
        registerModifiedProperty("zzgodfpc");
        _zzgodfpc = zzgodfpc;
    }

    /**
     * [get] ZZGODSPC: {varchar(255)} <br>
     * 商品分販売代金
     * @return The value of the column 'ZZGODSPC'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzgodspc() {
        checkSpecifiedProperty("zzgodspc");
        return convertEmptyToNull(_zzgodspc);
    }

    /**
     * [set] ZZGODSPC: {varchar(255)} <br>
     * 商品分販売代金
     * @param zzgodspc The value of the column 'ZZGODSPC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzgodspc(String zzgodspc) {
        registerModifiedProperty("zzgodspc");
        _zzgodspc = zzgodspc;
    }

    /**
     * [get] ZZGODCTX: {varchar(255)} <br>
     * 商品分消費税
     * @return The value of the column 'ZZGODCTX'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzgodctx() {
        checkSpecifiedProperty("zzgodctx");
        return convertEmptyToNull(_zzgodctx);
    }

    /**
     * [set] ZZGODCTX: {varchar(255)} <br>
     * 商品分消費税
     * @param zzgodctx The value of the column 'ZZGODCTX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzgodctx(String zzgodctx) {
        registerModifiedProperty("zzgodctx");
        _zzgodctx = zzgodctx;
    }

    /**
     * [get] COMPANY_CD: {varchar(255)} <br>
     * 会社コード
     * @return The value of the column 'COMPANY_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanyCd() {
        checkSpecifiedProperty("companyCd");
        return convertEmptyToNull(_companyCd);
    }

    /**
     * [set] COMPANY_CD: {varchar(255)} <br>
     * 会社コード
     * @param companyCd The value of the column 'COMPANY_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyCd(String companyCd) {
        registerModifiedProperty("companyCd");
        _companyCd = companyCd;
    }

    /**
     * [get] SALE_TYPE: {varchar(255)} <br>
     * 販売区分
     * @return The value of the column 'SALE_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSaleType() {
        checkSpecifiedProperty("saleType");
        return convertEmptyToNull(_saleType);
    }

    /**
     * [set] SALE_TYPE: {varchar(255)} <br>
     * 販売区分
     * @param saleType The value of the column 'SALE_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSaleType(String saleType) {
        registerModifiedProperty("saleType");
        _saleType = saleType;
    }

    /**
     * [get] HVRT_REASON: {varchar(255)} <br>
     * 持戻理由
     * @return The value of the column 'HVRT_REASON'. (NullAllowed even if selected: for no constraint)
     */
    public String getHvrtReason() {
        checkSpecifiedProperty("hvrtReason");
        return convertEmptyToNull(_hvrtReason);
    }

    /**
     * [set] HVRT_REASON: {varchar(255)} <br>
     * 持戻理由
     * @param hvrtReason The value of the column 'HVRT_REASON'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHvrtReason(String hvrtReason) {
        registerModifiedProperty("hvrtReason");
        _hvrtReason = hvrtReason;
    }

    /**
     * [get] HVRT_INOUT_DATE: {varchar(255)} <br>
     * 持戻入庫予定日
     * @return The value of the column 'HVRT_INOUT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getHvrtInoutDate() {
        checkSpecifiedProperty("hvrtInoutDate");
        return convertEmptyToNull(_hvrtInoutDate);
    }

    /**
     * [set] HVRT_INOUT_DATE: {varchar(255)} <br>
     * 持戻入庫予定日
     * @param hvrtInoutDate The value of the column 'HVRT_INOUT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHvrtInoutDate(String hvrtInoutDate) {
        registerModifiedProperty("hvrtInoutDate");
        _hvrtInoutDate = hvrtInoutDate;
    }

    /**
     * [get] CNG_PRT_SLIP_NO: {varchar(255)} <br>
     * 取替相手伝票番号
     * @return The value of the column 'CNG_PRT_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCngPrtSlipNo() {
        checkSpecifiedProperty("cngPrtSlipNo");
        return convertEmptyToNull(_cngPrtSlipNo);
    }

    /**
     * [set] CNG_PRT_SLIP_NO: {varchar(255)} <br>
     * 取替相手伝票番号
     * @param cngPrtSlipNo The value of the column 'CNG_PRT_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCngPrtSlipNo(String cngPrtSlipNo) {
        registerModifiedProperty("cngPrtSlipNo");
        _cngPrtSlipNo = cngPrtSlipNo;
    }

    /**
     * [get] PROCESS_TYPE: {varchar(255)} <br>
     * 処理区分
     * @return The value of the column 'PROCESS_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessType() {
        checkSpecifiedProperty("processType");
        return convertEmptyToNull(_processType);
    }

    /**
     * [set] PROCESS_TYPE: {varchar(255)} <br>
     * 処理区分
     * @param processType The value of the column 'PROCESS_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessType(String processType) {
        registerModifiedProperty("processType");
        _processType = processType;
    }

    /**
     * [get] EOS_ORD_AFT_FLG: {varchar(255)} <br>
     * EOSさしず後フラグ
     * @return The value of the column 'EOS_ORD_AFT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEosOrdAftFlg() {
        checkSpecifiedProperty("eosOrdAftFlg");
        return convertEmptyToNull(_eosOrdAftFlg);
    }

    /**
     * [set] EOS_ORD_AFT_FLG: {varchar(255)} <br>
     * EOSさしず後フラグ
     * @param eosOrdAftFlg The value of the column 'EOS_ORD_AFT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEosOrdAftFlg(String eosOrdAftFlg) {
        registerModifiedProperty("eosOrdAftFlg");
        _eosOrdAftFlg = eosOrdAftFlg;
    }

    /**
     * [get] EOS_SLIP_NO: {varchar(255)} <br>
     * 相手(EOS)伝票番号
     * @return The value of the column 'EOS_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getEosSlipNo() {
        checkSpecifiedProperty("eosSlipNo");
        return convertEmptyToNull(_eosSlipNo);
    }

    /**
     * [set] EOS_SLIP_NO: {varchar(255)} <br>
     * 相手(EOS)伝票番号
     * @param eosSlipNo The value of the column 'EOS_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEosSlipNo(String eosSlipNo) {
        registerModifiedProperty("eosSlipNo");
        _eosSlipNo = eosSlipNo;
    }

    /**
     * [get] HDRD_BX_TYPE: {varchar(255)} <br>
     * 100箱拒否区分
     * @return The value of the column 'HDRD_BX_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getHdrdBxType() {
        checkSpecifiedProperty("hdrdBxType");
        return convertEmptyToNull(_hdrdBxType);
    }

    /**
     * [set] HDRD_BX_TYPE: {varchar(255)} <br>
     * 100箱拒否区分
     * @param hdrdBxType The value of the column 'HDRD_BX_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHdrdBxType(String hdrdBxType) {
        registerModifiedProperty("hdrdBxType");
        _hdrdBxType = hdrdBxType;
    }

    /**
     * [get] INOT_RFSL_TYPE: {varchar(255)} <br>
     * 内外仕分拒否区分
     * @return The value of the column 'INOT_RFSL_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInotRfslType() {
        checkSpecifiedProperty("inotRfslType");
        return convertEmptyToNull(_inotRfslType);
    }

    /**
     * [set] INOT_RFSL_TYPE: {varchar(255)} <br>
     * 内外仕分拒否区分
     * @param inotRfslType The value of the column 'INOT_RFSL_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInotRfslType(String inotRfslType) {
        registerModifiedProperty("inotRfslType");
        _inotRfslType = inotRfslType;
    }

    /**
     * [get] BX_MNT_RFSL_TYPE: {varchar(255)} <br>
     * 箱跨り拒否区分
     * @return The value of the column 'BX_MNT_RFSL_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getBxMntRfslType() {
        checkSpecifiedProperty("bxMntRfslType");
        return convertEmptyToNull(_bxMntRfslType);
    }

    /**
     * [set] BX_MNT_RFSL_TYPE: {varchar(255)} <br>
     * 箱跨り拒否区分
     * @param bxMntRfslType The value of the column 'BX_MNT_RFSL_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxMntRfslType(String bxMntRfslType) {
        registerModifiedProperty("bxMntRfslType");
        _bxMntRfslType = bxMntRfslType;
    }

    /**
     * [get] REPORT_MERFE_TIMING: {varchar(255)} <br>
     * 帳票マージタイミング
     * @return The value of the column 'REPORT_MERFE_TIMING'. (NullAllowed even if selected: for no constraint)
     */
    public String getReportMerfeTiming() {
        checkSpecifiedProperty("reportMerfeTiming");
        return convertEmptyToNull(_reportMerfeTiming);
    }

    /**
     * [set] REPORT_MERFE_TIMING: {varchar(255)} <br>
     * 帳票マージタイミング
     * @param reportMerfeTiming The value of the column 'REPORT_MERFE_TIMING'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReportMerfeTiming(String reportMerfeTiming) {
        registerModifiedProperty("reportMerfeTiming");
        _reportMerfeTiming = reportMerfeTiming;
    }

    /**
     * [get] REPORT_OUT_DATETIME: {varchar(255)} <br>
     * 帳票出力年月日
     * @return The value of the column 'REPORT_OUT_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getReportOutDatetime() {
        checkSpecifiedProperty("reportOutDatetime");
        return convertEmptyToNull(_reportOutDatetime);
    }

    /**
     * [set] REPORT_OUT_DATETIME: {varchar(255)} <br>
     * 帳票出力年月日
     * @param reportOutDatetime The value of the column 'REPORT_OUT_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReportOutDatetime(String reportOutDatetime) {
        registerModifiedProperty("reportOutDatetime");
        _reportOutDatetime = reportOutDatetime;
    }

    /**
     * [get] CLIENT_ID: {varchar(255)} <br>
     * 銘柄コード
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientId() {
        checkSpecifiedProperty("clientId");
        return convertEmptyToNull(_clientId);
    }

    /**
     * [set] CLIENT_ID: {varchar(255)} <br>
     * 銘柄コード
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(String clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] KWMENG: {varchar(255)} <br>
     * 販売数量
     * @return The value of the column 'KWMENG'. (NullAllowed even if selected: for no constraint)
     */
    public String getKwmeng() {
        checkSpecifiedProperty("kwmeng");
        return convertEmptyToNull(_kwmeng);
    }

    /**
     * [set] KWMENG: {varchar(255)} <br>
     * 販売数量
     * @param kwmeng The value of the column 'KWMENG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKwmeng(String kwmeng) {
        registerModifiedProperty("kwmeng");
        _kwmeng = kwmeng;
    }

    /**
     * [get] STATUS_CD: {varchar(255)} <br>
     * 状態コード
     * @return The value of the column 'STATUS_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStatusCd() {
        checkSpecifiedProperty("statusCd");
        return convertEmptyToNull(_statusCd);
    }

    /**
     * [set] STATUS_CD: {varchar(255)} <br>
     * 状態コード
     * @param statusCd The value of the column 'STATUS_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatusCd(String statusCd) {
        registerModifiedProperty("statusCd");
        _statusCd = statusCd;
    }

    /**
     * [get] STG_VAL: {varchar(255)} <br>
     * 不足本数
     * @return The value of the column 'STG_VAL'. (NullAllowed even if selected: for no constraint)
     */
    public String getStgVal() {
        checkSpecifiedProperty("stgVal");
        return convertEmptyToNull(_stgVal);
    }

    /**
     * [set] STG_VAL: {varchar(255)} <br>
     * 不足本数
     * @param stgVal The value of the column 'STG_VAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStgVal(String stgVal) {
        registerModifiedProperty("stgVal");
        _stgVal = stgVal;
    }

    /**
     * [get] DETAIL_PRICE_SALE: {varchar(255)} <br>
     * 明細定価代金
     * @return The value of the column 'DETAIL_PRICE_SALE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDetailPriceSale() {
        checkSpecifiedProperty("detailPriceSale");
        return convertEmptyToNull(_detailPriceSale);
    }

    /**
     * [set] DETAIL_PRICE_SALE: {varchar(255)} <br>
     * 明細定価代金
     * @param detailPriceSale The value of the column 'DETAIL_PRICE_SALE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDetailPriceSale(String detailPriceSale) {
        registerModifiedProperty("detailPriceSale");
        _detailPriceSale = detailPriceSale;
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
