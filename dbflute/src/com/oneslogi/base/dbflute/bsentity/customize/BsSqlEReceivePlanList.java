package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlEReceivePlanList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     RECEIVE_CD, RECEIVE_PLAN_ID, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CENTER_CD, PLAN_CLIENT_RECEIVE_NO, PLAN_SUPPLIER_CD, VERSION_NO, CONTROL_NO, CUSTOMER_NM, CUSTOMER_ABBR, RECEIVE_PLAN_DT, PROCESS_TYPE_CD, PROCESS_TYPE_NM, STOCK_TYPE_CD, STOCK_TYPE_NM, PLAN_DEPOSIT_CD, PLAN_DEPOSIT_NM, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, LOT_MANAG_FLG, LIMIT_DT_MANAG_FLG, PLAN_NUM, PLAN_WAREHOUSE_CD, PLAN_LOCATION_CD, PLAN_LOT, PLAN_LIMIT_DT, PLAN_CLIENT_ORDER_NO, MESSAGE_NM, LOCATION_ID, LCS_WAREHOUSE_CD, SPARE_STR_1, SPARE_STR_2, SPARE_STR_3, SPARE_NUM_1, SPARE_NUM_2, SPARE_NUM_3
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
 * String receiveCd = entity.getReceiveCd();
 * Long receivePlanId = entity.getReceivePlanId();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String clientCd = entity.getClientCd();
 * String centerCd = entity.getCenterCd();
 * String planClientReceiveNo = entity.getPlanClientReceiveNo();
 * String planSupplierCd = entity.getPlanSupplierCd();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * String customerNm = entity.getCustomerNm();
 * String customerAbbr = entity.getCustomerAbbr();
 * String receivePlanDt = entity.getReceivePlanDt();
 * String processTypeCd = entity.getProcessTypeCd();
 * String processTypeNm = entity.getProcessTypeNm();
 * String stockTypeCd = entity.getStockTypeCd();
 * String stockTypeNm = entity.getStockTypeNm();
 * String planDepositCd = entity.getPlanDepositCd();
 * String planDepositNm = entity.getPlanDepositNm();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String productAbbr = entity.getProductAbbr();
 * String janCd = entity.getJanCd();
 * String lotManagFlg = entity.getLotManagFlg();
 * String limitDtManagFlg = entity.getLimitDtManagFlg();
 * String planNum = entity.getPlanNum();
 * String planWarehouseCd = entity.getPlanWarehouseCd();
 * String planLocationCd = entity.getPlanLocationCd();
 * String planLot = entity.getPlanLot();
 * String planLimitDt = entity.getPlanLimitDt();
 * String planClientOrderNo = entity.getPlanClientOrderNo();
 * String messageNm = entity.getMessageNm();
 * Long locationId = entity.getLocationId();
 * String lcsWarehouseCd = entity.getLcsWarehouseCd();
 * String spareStr1 = entity.getSpareStr1();
 * String spareStr2 = entity.getSpareStr2();
 * String spareStr3 = entity.getSpareStr3();
 * String spareNum1 = entity.getSpareNum1();
 * String spareNum2 = entity.getSpareNum2();
 * String spareNum3 = entity.getSpareNum3();
 * entity.setReceiveCd(receiveCd);
 * entity.setReceivePlanId(receivePlanId);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setClientCd(clientCd);
 * entity.setCenterCd(centerCd);
 * entity.setPlanClientReceiveNo(planClientReceiveNo);
 * entity.setPlanSupplierCd(planSupplierCd);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setCustomerNm(customerNm);
 * entity.setCustomerAbbr(customerAbbr);
 * entity.setReceivePlanDt(receivePlanDt);
 * entity.setProcessTypeCd(processTypeCd);
 * entity.setProcessTypeNm(processTypeNm);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setStockTypeNm(stockTypeNm);
 * entity.setPlanDepositCd(planDepositCd);
 * entity.setPlanDepositNm(planDepositNm);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setProductAbbr(productAbbr);
 * entity.setJanCd(janCd);
 * entity.setLotManagFlg(lotManagFlg);
 * entity.setLimitDtManagFlg(limitDtManagFlg);
 * entity.setPlanNum(planNum);
 * entity.setPlanWarehouseCd(planWarehouseCd);
 * entity.setPlanLocationCd(planLocationCd);
 * entity.setPlanLot(planLot);
 * entity.setPlanLimitDt(planLimitDt);
 * entity.setPlanClientOrderNo(planClientOrderNo);
 * entity.setMessageNm(messageNm);
 * entity.setLocationId(locationId);
 * entity.setLcsWarehouseCd(lcsWarehouseCd);
 * entity.setSpareStr1(spareStr1);
 * entity.setSpareStr2(spareStr2);
 * entity.setSpareStr3(spareStr3);
 * entity.setSpareNum1(spareNum1);
 * entity.setSpareNum2(spareNum2);
 * entity.setSpareNum3(spareNum3);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlEReceivePlanList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_CD: {varchar(30)} */
    protected String _receiveCd;

    /** RECEIVE_PLAN_ID: {bigint(19)} */
    protected Long _receivePlanId;

    /** RECEIVE_ROW_ID: {bigint(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {char(1)} */
    protected String _importFlg;

    /** ERROR_FLG: {char(1)} */
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

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** CUSTOMER_NM: {varchar(60)} */
    protected String _customerNm;

    /** CUSTOMER_ABBR: {varchar(60)} */
    protected String _customerAbbr;

    /** RECEIVE_PLAN_DT: {varchar(255)} */
    protected String _receivePlanDt;

    /** PROCESS_TYPE_CD: {varchar(255)} */
    protected String _processTypeCd;

    /** PROCESS_TYPE_NM: {varchar(100)} */
    protected String _processTypeNm;

    /** STOCK_TYPE_CD: {varchar(255)} */
    protected String _stockTypeCd;

    /** STOCK_TYPE_NM: {varchar(100)} */
    protected String _stockTypeNm;

    /** PLAN_DEPOSIT_CD: {varchar(255)} */
    protected String _planDepositCd;

    /** PLAN_DEPOSIT_NM: {varchar(60)} */
    protected String _planDepositNm;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** PRODUCT_ABBR: {varchar(60)} */
    protected String _productAbbr;

    /** JAN_CD: {varchar(30)} */
    protected String _janCd;

    /** LOT_MANAG_FLG: {char(1), classification=LotManagFlg} */
    protected String _lotManagFlg;

    /** LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} */
    protected String _limitDtManagFlg;

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

    /** MESSAGE_NM: {varchar(4000)} */
    protected String _messageNm;

    /** LOCATION_ID: {bigint(19)} */
    protected Long _locationId;

    /** LCS_WAREHOUSE_CD: {varchar(30)} */
    protected String _lcsWarehouseCd;

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

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlEReceivePlanListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlEReceivePlanList";
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
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of lotManagFlg as the classification of LotManagFlg. <br>
     * LOT_MANAG_FLG: {char(1), classification=LotManagFlg} <br>
     * ロット管理フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LotManagFlg getLotManagFlgAsLotManagFlg() {
        return CDef.LotManagFlg.codeOf(getLotManagFlg());
    }

    /**
     * Set the value of lotManagFlg as the classification of LotManagFlg. <br>
     * LOT_MANAG_FLG: {char(1), classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLotManagFlgAsLotManagFlg(CDef.LotManagFlg cdef) {
        setLotManagFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of limitDtManagFlg as the classification of LimitDtManagFlg. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LimitDtManagFlg getLimitDtManagFlgAsLimitDtManagFlg() {
        return CDef.LimitDtManagFlg.codeOf(getLimitDtManagFlg());
    }

    /**
     * Set the value of limitDtManagFlg as the classification of LimitDtManagFlg. <br>
     * LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg cdef) {
        setLimitDtManagFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of lotManagFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLotManagFlg_$0() {
        setLotManagFlgAsLotManagFlg(CDef.LotManagFlg.$0);
    }

    /**
     * Set the value of lotManagFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLotManagFlg_$1() {
        setLotManagFlgAsLotManagFlg(CDef.LotManagFlg.$1);
    }

    /**
     * Set the value of limitDtManagFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setLimitDtManagFlg_$0() {
        setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg.$0);
    }

    /**
     * Set the value of limitDtManagFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setLimitDtManagFlg_$1() {
        setLimitDtManagFlgAsLimitDtManagFlg(CDef.LimitDtManagFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of lotManagFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotManagFlg$0() {
        CDef.LotManagFlg cdef = getLotManagFlgAsLotManagFlg();
        return cdef != null ? cdef.equals(CDef.LotManagFlg.$0) : false;
    }

    /**
     * Is the value of lotManagFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLotManagFlg$1() {
        CDef.LotManagFlg cdef = getLotManagFlgAsLotManagFlg();
        return cdef != null ? cdef.equals(CDef.LotManagFlg.$1) : false;
    }

    /**
     * Is the value of limitDtManagFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtManagFlg$0() {
        CDef.LimitDtManagFlg cdef = getLimitDtManagFlgAsLimitDtManagFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtManagFlg.$0) : false;
    }

    /**
     * Is the value of limitDtManagFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLimitDtManagFlg$1() {
        CDef.LimitDtManagFlg cdef = getLimitDtManagFlgAsLimitDtManagFlg();
        return cdef != null ? cdef.equals(CDef.LimitDtManagFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'lotManagFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLotManagFlgName() {
        CDef.LotManagFlg cdef = getLotManagFlgAsLotManagFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'limitDtManagFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLimitDtManagFlgName() {
        CDef.LimitDtManagFlg cdef = getLimitDtManagFlgAsLimitDtManagFlg();
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
        if (obj instanceof BsSqlEReceivePlanList) {
            BsSqlEReceivePlanList other = (BsSqlEReceivePlanList)obj;
            if (!xSV(_receiveCd, other._receiveCd)) { return false; }
            if (!xSV(_receivePlanId, other._receivePlanId)) { return false; }
            if (!xSV(_receiveRowId, other._receiveRowId)) { return false; }
            if (!xSV(_importFlg, other._importFlg)) { return false; }
            if (!xSV(_errorFlg, other._errorFlg)) { return false; }
            if (!xSV(_errorMessageCd, other._errorMessageCd)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_planClientReceiveNo, other._planClientReceiveNo)) { return false; }
            if (!xSV(_planSupplierCd, other._planSupplierCd)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_controlNo, other._controlNo)) { return false; }
            if (!xSV(_customerNm, other._customerNm)) { return false; }
            if (!xSV(_customerAbbr, other._customerAbbr)) { return false; }
            if (!xSV(_receivePlanDt, other._receivePlanDt)) { return false; }
            if (!xSV(_processTypeCd, other._processTypeCd)) { return false; }
            if (!xSV(_processTypeNm, other._processTypeNm)) { return false; }
            if (!xSV(_stockTypeCd, other._stockTypeCd)) { return false; }
            if (!xSV(_stockTypeNm, other._stockTypeNm)) { return false; }
            if (!xSV(_planDepositCd, other._planDepositCd)) { return false; }
            if (!xSV(_planDepositNm, other._planDepositNm)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_janCd, other._janCd)) { return false; }
            if (!xSV(_lotManagFlg, other._lotManagFlg)) { return false; }
            if (!xSV(_limitDtManagFlg, other._limitDtManagFlg)) { return false; }
            if (!xSV(_planNum, other._planNum)) { return false; }
            if (!xSV(_planWarehouseCd, other._planWarehouseCd)) { return false; }
            if (!xSV(_planLocationCd, other._planLocationCd)) { return false; }
            if (!xSV(_planLot, other._planLot)) { return false; }
            if (!xSV(_planLimitDt, other._planLimitDt)) { return false; }
            if (!xSV(_planClientOrderNo, other._planClientOrderNo)) { return false; }
            if (!xSV(_messageNm, other._messageNm)) { return false; }
            if (!xSV(_locationId, other._locationId)) { return false; }
            if (!xSV(_lcsWarehouseCd, other._lcsWarehouseCd)) { return false; }
            if (!xSV(_spareStr1, other._spareStr1)) { return false; }
            if (!xSV(_spareStr2, other._spareStr2)) { return false; }
            if (!xSV(_spareStr3, other._spareStr3)) { return false; }
            if (!xSV(_spareNum1, other._spareNum1)) { return false; }
            if (!xSV(_spareNum2, other._spareNum2)) { return false; }
            if (!xSV(_spareNum3, other._spareNum3)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receiveCd);
        hs = xCH(hs, _receivePlanId);
        hs = xCH(hs, _receiveRowId);
        hs = xCH(hs, _importFlg);
        hs = xCH(hs, _errorFlg);
        hs = xCH(hs, _errorMessageCd);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _planClientReceiveNo);
        hs = xCH(hs, _planSupplierCd);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _controlNo);
        hs = xCH(hs, _customerNm);
        hs = xCH(hs, _customerAbbr);
        hs = xCH(hs, _receivePlanDt);
        hs = xCH(hs, _processTypeCd);
        hs = xCH(hs, _processTypeNm);
        hs = xCH(hs, _stockTypeCd);
        hs = xCH(hs, _stockTypeNm);
        hs = xCH(hs, _planDepositCd);
        hs = xCH(hs, _planDepositNm);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _janCd);
        hs = xCH(hs, _lotManagFlg);
        hs = xCH(hs, _limitDtManagFlg);
        hs = xCH(hs, _planNum);
        hs = xCH(hs, _planWarehouseCd);
        hs = xCH(hs, _planLocationCd);
        hs = xCH(hs, _planLot);
        hs = xCH(hs, _planLimitDt);
        hs = xCH(hs, _planClientOrderNo);
        hs = xCH(hs, _messageNm);
        hs = xCH(hs, _locationId);
        hs = xCH(hs, _lcsWarehouseCd);
        hs = xCH(hs, _spareStr1);
        hs = xCH(hs, _spareStr2);
        hs = xCH(hs, _spareStr3);
        hs = xCH(hs, _spareNum1);
        hs = xCH(hs, _spareNum2);
        hs = xCH(hs, _spareNum3);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receivePlanId));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_planClientReceiveNo));
        sb.append(dm).append(xfND(_planSupplierCd));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_customerNm));
        sb.append(dm).append(xfND(_customerAbbr));
        sb.append(dm).append(xfND(_receivePlanDt));
        sb.append(dm).append(xfND(_processTypeCd));
        sb.append(dm).append(xfND(_processTypeNm));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_stockTypeNm));
        sb.append(dm).append(xfND(_planDepositCd));
        sb.append(dm).append(xfND(_planDepositNm));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_lotManagFlg));
        sb.append(dm).append(xfND(_limitDtManagFlg));
        sb.append(dm).append(xfND(_planNum));
        sb.append(dm).append(xfND(_planWarehouseCd));
        sb.append(dm).append(xfND(_planLocationCd));
        sb.append(dm).append(xfND(_planLot));
        sb.append(dm).append(xfND(_planLimitDt));
        sb.append(dm).append(xfND(_planClientOrderNo));
        sb.append(dm).append(xfND(_messageNm));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_lcsWarehouseCd));
        sb.append(dm).append(xfND(_spareStr1));
        sb.append(dm).append(xfND(_spareStr2));
        sb.append(dm).append(xfND(_spareStr3));
        sb.append(dm).append(xfND(_spareNum1));
        sb.append(dm).append(xfND(_spareNum2));
        sb.append(dm).append(xfND(_spareNum3));
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
    public SqlEReceivePlanList clone() {
        return (SqlEReceivePlanList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_CD: {varchar(30)} <br>
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {varchar(30)} <br>
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_PLAN_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_PLAN_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceivePlanId() {
        checkSpecifiedProperty("receivePlanId");
        return _receivePlanId;
    }

    /**
     * [set] RECEIVE_PLAN_ID: {bigint(19)} <br>
     * @param receivePlanId The value of the column 'RECEIVE_PLAN_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanId(Long receivePlanId) {
        registerModifiedProperty("receivePlanId");
        _receivePlanId = receivePlanId;
    }

    /**
     * [get] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {bigint(19)} <br>
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {char(1)} <br>
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {char(1)} <br>
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {char(1)} <br>
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {char(1)} <br>
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CLIENT_CD: {varchar(255)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(255)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CENTER_CD: {varchar(255)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(255)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] PLAN_CLIENT_RECEIVE_NO: {varchar(255)} <br>
     * @return The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanClientReceiveNo() {
        checkSpecifiedProperty("planClientReceiveNo");
        return convertEmptyToNull(_planClientReceiveNo);
    }

    /**
     * [set] PLAN_CLIENT_RECEIVE_NO: {varchar(255)} <br>
     * @param planClientReceiveNo The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanClientReceiveNo(String planClientReceiveNo) {
        registerModifiedProperty("planClientReceiveNo");
        _planClientReceiveNo = planClientReceiveNo;
    }

    /**
     * [get] PLAN_SUPPLIER_CD: {varchar(255)} <br>
     * @return The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanSupplierCd() {
        checkSpecifiedProperty("planSupplierCd");
        return convertEmptyToNull(_planSupplierCd);
    }

    /**
     * [set] PLAN_SUPPLIER_CD: {varchar(255)} <br>
     * @param planSupplierCd The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanSupplierCd(String planSupplierCd) {
        registerModifiedProperty("planSupplierCd");
        _planSupplierCd = planSupplierCd;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerNm() {
        checkSpecifiedProperty("customerNm");
        return convertEmptyToNull(_customerNm);
    }

    /**
     * [set] CUSTOMER_NM: {varchar(60)} <br>
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerNm(String customerNm) {
        registerModifiedProperty("customerNm");
        _customerNm = customerNm;
    }

    /**
     * [get] CUSTOMER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CUSTOMER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerAbbr() {
        checkSpecifiedProperty("customerAbbr");
        return convertEmptyToNull(_customerAbbr);
    }

    /**
     * [set] CUSTOMER_ABBR: {varchar(60)} <br>
     * @param customerAbbr The value of the column 'CUSTOMER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerAbbr(String customerAbbr) {
        registerModifiedProperty("customerAbbr");
        _customerAbbr = customerAbbr;
    }

    /**
     * [get] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * @return The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivePlanDt() {
        checkSpecifiedProperty("receivePlanDt");
        return convertEmptyToNull(_receivePlanDt);
    }

    /**
     * [set] RECEIVE_PLAN_DT: {varchar(255)} <br>
     * @param receivePlanDt The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        registerModifiedProperty("receivePlanDt");
        _receivePlanDt = receivePlanDt;
    }

    /**
     * [get] PROCESS_TYPE_CD: {varchar(255)} <br>
     * @return The value of the column 'PROCESS_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessTypeCd() {
        checkSpecifiedProperty("processTypeCd");
        return convertEmptyToNull(_processTypeCd);
    }

    /**
     * [set] PROCESS_TYPE_CD: {varchar(255)} <br>
     * @param processTypeCd The value of the column 'PROCESS_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessTypeCd(String processTypeCd) {
        registerModifiedProperty("processTypeCd");
        _processTypeCd = processTypeCd;
    }

    /**
     * [get] PROCESS_TYPE_NM: {varchar(100)} <br>
     * @return The value of the column 'PROCESS_TYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcessTypeNm() {
        checkSpecifiedProperty("processTypeNm");
        return convertEmptyToNull(_processTypeNm);
    }

    /**
     * [set] PROCESS_TYPE_NM: {varchar(100)} <br>
     * @param processTypeNm The value of the column 'PROCESS_TYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcessTypeNm(String processTypeNm) {
        registerModifiedProperty("processTypeNm");
        _processTypeNm = processTypeNm;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(255)} <br>
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(255)} <br>
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] STOCK_TYPE_NM: {varchar(100)} <br>
     * @return The value of the column 'STOCK_TYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeNm() {
        checkSpecifiedProperty("stockTypeNm");
        return convertEmptyToNull(_stockTypeNm);
    }

    /**
     * [set] STOCK_TYPE_NM: {varchar(100)} <br>
     * @param stockTypeNm The value of the column 'STOCK_TYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeNm(String stockTypeNm) {
        registerModifiedProperty("stockTypeNm");
        _stockTypeNm = stockTypeNm;
    }

    /**
     * [get] PLAN_DEPOSIT_CD: {varchar(255)} <br>
     * @return The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanDepositCd() {
        checkSpecifiedProperty("planDepositCd");
        return convertEmptyToNull(_planDepositCd);
    }

    /**
     * [set] PLAN_DEPOSIT_CD: {varchar(255)} <br>
     * @param planDepositCd The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanDepositCd(String planDepositCd) {
        registerModifiedProperty("planDepositCd");
        _planDepositCd = planDepositCd;
    }

    /**
     * [get] PLAN_DEPOSIT_NM: {varchar(60)} <br>
     * @return The value of the column 'PLAN_DEPOSIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanDepositNm() {
        checkSpecifiedProperty("planDepositNm");
        return convertEmptyToNull(_planDepositNm);
    }

    /**
     * [set] PLAN_DEPOSIT_NM: {varchar(60)} <br>
     * @param planDepositNm The value of the column 'PLAN_DEPOSIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanDepositNm(String planDepositNm) {
        registerModifiedProperty("planDepositNm");
        _planDepositNm = planDepositNm;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] PRODUCT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductAbbr() {
        checkSpecifiedProperty("productAbbr");
        return convertEmptyToNull(_productAbbr);
    }

    /**
     * [set] PRODUCT_ABBR: {varchar(60)} <br>
     * @param productAbbr The value of the column 'PRODUCT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductAbbr(String productAbbr) {
        registerModifiedProperty("productAbbr");
        _productAbbr = productAbbr;
    }

    /**
     * [get] JAN_CD: {varchar(30)} <br>
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {varchar(30)} <br>
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] LOT_MANAG_FLG: {char(1), classification=LotManagFlg} <br>
     * // cls(LotManagFlg)
     * @return The value of the column 'LOT_MANAG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotManagFlg() {
        checkSpecifiedProperty("lotManagFlg");
        return convertEmptyToNull(_lotManagFlg);
    }

    /**
     * [set] LOT_MANAG_FLG: {char(1), classification=LotManagFlg} <br>
     * // cls(LotManagFlg)
     * @param lotManagFlg The value of the column 'LOT_MANAG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotManagFlg(String lotManagFlg) {
        registerModifiedProperty("lotManagFlg");
        _lotManagFlg = lotManagFlg;
    }

    /**
     * [get] LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} <br>
     * // cls(LimitDtManagFlg)
     * @return The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDtManagFlg() {
        checkSpecifiedProperty("limitDtManagFlg");
        return convertEmptyToNull(_limitDtManagFlg);
    }

    /**
     * [set] LIMIT_DT_MANAG_FLG: {char(1), classification=LimitDtManagFlg} <br>
     * // cls(LimitDtManagFlg)
     * @param limitDtManagFlg The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDtManagFlg(String limitDtManagFlg) {
        registerModifiedProperty("limitDtManagFlg");
        _limitDtManagFlg = limitDtManagFlg;
    }

    /**
     * [get] PLAN_NUM: {varchar(255)} <br>
     * @return The value of the column 'PLAN_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanNum() {
        checkSpecifiedProperty("planNum");
        return convertEmptyToNull(_planNum);
    }

    /**
     * [set] PLAN_NUM: {varchar(255)} <br>
     * @param planNum The value of the column 'PLAN_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanNum(String planNum) {
        registerModifiedProperty("planNum");
        _planNum = planNum;
    }

    /**
     * [get] PLAN_WAREHOUSE_CD: {varchar(255)} <br>
     * @return The value of the column 'PLAN_WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanWarehouseCd() {
        checkSpecifiedProperty("planWarehouseCd");
        return convertEmptyToNull(_planWarehouseCd);
    }

    /**
     * [set] PLAN_WAREHOUSE_CD: {varchar(255)} <br>
     * @param planWarehouseCd The value of the column 'PLAN_WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanWarehouseCd(String planWarehouseCd) {
        registerModifiedProperty("planWarehouseCd");
        _planWarehouseCd = planWarehouseCd;
    }

    /**
     * [get] PLAN_LOCATION_CD: {varchar(255)} <br>
     * @return The value of the column 'PLAN_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanLocationCd() {
        checkSpecifiedProperty("planLocationCd");
        return convertEmptyToNull(_planLocationCd);
    }

    /**
     * [set] PLAN_LOCATION_CD: {varchar(255)} <br>
     * @param planLocationCd The value of the column 'PLAN_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanLocationCd(String planLocationCd) {
        registerModifiedProperty("planLocationCd");
        _planLocationCd = planLocationCd;
    }

    /**
     * [get] PLAN_LOT: {varchar(255)} <br>
     * @return The value of the column 'PLAN_LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanLot() {
        checkSpecifiedProperty("planLot");
        return convertEmptyToNull(_planLot);
    }

    /**
     * [set] PLAN_LOT: {varchar(255)} <br>
     * @param planLot The value of the column 'PLAN_LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanLot(String planLot) {
        registerModifiedProperty("planLot");
        _planLot = planLot;
    }

    /**
     * [get] PLAN_LIMIT_DT: {varchar(255)} <br>
     * @return The value of the column 'PLAN_LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanLimitDt() {
        checkSpecifiedProperty("planLimitDt");
        return convertEmptyToNull(_planLimitDt);
    }

    /**
     * [set] PLAN_LIMIT_DT: {varchar(255)} <br>
     * @param planLimitDt The value of the column 'PLAN_LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanLimitDt(String planLimitDt) {
        registerModifiedProperty("planLimitDt");
        _planLimitDt = planLimitDt;
    }

    /**
     * [get] PLAN_CLIENT_ORDER_NO: {varchar(255)} <br>
     * @return The value of the column 'PLAN_CLIENT_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanClientOrderNo() {
        checkSpecifiedProperty("planClientOrderNo");
        return convertEmptyToNull(_planClientOrderNo);
    }

    /**
     * [set] PLAN_CLIENT_ORDER_NO: {varchar(255)} <br>
     * @param planClientOrderNo The value of the column 'PLAN_CLIENT_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanClientOrderNo(String planClientOrderNo) {
        registerModifiedProperty("planClientOrderNo");
        _planClientOrderNo = planClientOrderNo;
    }

    /**
     * [get] MESSAGE_NM: {varchar(4000)} <br>
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMessageNm() {
        checkSpecifiedProperty("messageNm");
        return convertEmptyToNull(_messageNm);
    }

    /**
     * [set] MESSAGE_NM: {varchar(4000)} <br>
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMessageNm(String messageNm) {
        registerModifiedProperty("messageNm");
        _messageNm = messageNm;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] LCS_WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'LCS_WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLcsWarehouseCd() {
        checkSpecifiedProperty("lcsWarehouseCd");
        return convertEmptyToNull(_lcsWarehouseCd);
    }

    /**
     * [set] LCS_WAREHOUSE_CD: {varchar(30)} <br>
     * @param lcsWarehouseCd The value of the column 'LCS_WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLcsWarehouseCd(String lcsWarehouseCd) {
        registerModifiedProperty("lcsWarehouseCd");
        _lcsWarehouseCd = lcsWarehouseCd;
    }

    /**
     * [get] SPARE_STR_1: {varchar(255)} <br>
     * @return The value of the column 'SPARE_STR_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr1() {
        checkSpecifiedProperty("spareStr1");
        return convertEmptyToNull(_spareStr1);
    }

    /**
     * [set] SPARE_STR_1: {varchar(255)} <br>
     * @param spareStr1 The value of the column 'SPARE_STR_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr1(String spareStr1) {
        registerModifiedProperty("spareStr1");
        _spareStr1 = spareStr1;
    }

    /**
     * [get] SPARE_STR_2: {varchar(255)} <br>
     * @return The value of the column 'SPARE_STR_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr2() {
        checkSpecifiedProperty("spareStr2");
        return convertEmptyToNull(_spareStr2);
    }

    /**
     * [set] SPARE_STR_2: {varchar(255)} <br>
     * @param spareStr2 The value of the column 'SPARE_STR_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr2(String spareStr2) {
        registerModifiedProperty("spareStr2");
        _spareStr2 = spareStr2;
    }

    /**
     * [get] SPARE_STR_3: {varchar(255)} <br>
     * @return The value of the column 'SPARE_STR_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr3() {
        checkSpecifiedProperty("spareStr3");
        return convertEmptyToNull(_spareStr3);
    }

    /**
     * [set] SPARE_STR_3: {varchar(255)} <br>
     * @param spareStr3 The value of the column 'SPARE_STR_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr3(String spareStr3) {
        registerModifiedProperty("spareStr3");
        _spareStr3 = spareStr3;
    }

    /**
     * [get] SPARE_NUM_1: {varchar(255)} <br>
     * @return The value of the column 'SPARE_NUM_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareNum1() {
        checkSpecifiedProperty("spareNum1");
        return convertEmptyToNull(_spareNum1);
    }

    /**
     * [set] SPARE_NUM_1: {varchar(255)} <br>
     * @param spareNum1 The value of the column 'SPARE_NUM_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum1(String spareNum1) {
        registerModifiedProperty("spareNum1");
        _spareNum1 = spareNum1;
    }

    /**
     * [get] SPARE_NUM_2: {varchar(255)} <br>
     * @return The value of the column 'SPARE_NUM_2'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareNum2() {
        checkSpecifiedProperty("spareNum2");
        return convertEmptyToNull(_spareNum2);
    }

    /**
     * [set] SPARE_NUM_2: {varchar(255)} <br>
     * @param spareNum2 The value of the column 'SPARE_NUM_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum2(String spareNum2) {
        registerModifiedProperty("spareNum2");
        _spareNum2 = spareNum2;
    }

    /**
     * [get] SPARE_NUM_3: {varchar(255)} <br>
     * @return The value of the column 'SPARE_NUM_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareNum3() {
        checkSpecifiedProperty("spareNum3");
        return convertEmptyToNull(_spareNum3);
    }

    /**
     * [set] SPARE_NUM_3: {varchar(255)} <br>
     * @param spareNum3 The value of the column 'SPARE_NUM_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareNum3(String spareNum3) {
        registerModifiedProperty("spareNum3");
        _spareNum3 = spareNum3;
    }
}
