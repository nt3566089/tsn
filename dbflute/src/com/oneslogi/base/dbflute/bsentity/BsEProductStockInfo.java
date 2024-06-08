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
 * The entity of E_PRODUCT_STOCK_INFO as TABLE. <br>
 * 製品在庫情報送信テーブル
 * <pre>
 * [primary-key]
 *     E_PRODUCT_STOCK_INFO_ID
 *
 * [column]
 *     E_PRODUCT_STOCK_INFO_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_ID, CLIENT_ID, SEQ, IN_OUT_KBN, CENTER_CD, CENTER_NM, EXECUTE_DATE, PRODUCT_CD, PRODUCT_NM, STOCK_LOCATION, STOCK_LOCATION_NM, MANUFACTURE_DATE, DESIGN_KBN, LOCATION_CD, TRANSPORT_CD, FIRM_CARRY_NO, SOURCE_CD, SOURCE_NM, SCH_DATE, RCV_DATE, P_TDAY_TOTAL_DIFF_QTY, P_QTY, P_INVENTORY_NUM, P_YDAY_TOTAL_DIFF_QTY, P_TDAY_DIFF_QTY, SL_YDAY_TOTAL_DIFF_QTY, SL_TDAY_DIFF_QTY, QTY, INVENTORY_NUM, USER_USE4, LOT_ATRB1_TITLE, USER_NUM4, USER_NUM3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     E_PRODUCT_STOCK_INFO_ID
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
 * Long eProductStockInfoId = entity.getEProductStockInfoId();
 * String sendCd = entity.getSendCd();
 * Long sendRowId = entity.getSendRowId();
 * String workFlg = entity.getWorkFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * Long seq = entity.getSeq();
 * String inOutKbn = entity.getInOutKbn();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String executeDate = entity.getExecuteDate();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String stockLocation = entity.getStockLocation();
 * String stockLocationNm = entity.getStockLocationNm();
 * String manufactureDate = entity.getManufactureDate();
 * String designKbn = entity.getDesignKbn();
 * String locationCd = entity.getLocationCd();
 * String transportCd = entity.getTransportCd();
 * String firmCarryNo = entity.getFirmCarryNo();
 * String sourceCd = entity.getSourceCd();
 * String sourceNm = entity.getSourceNm();
 * String schDate = entity.getSchDate();
 * String rcvDate = entity.getRcvDate();
 * Long pTdayTotalDiffQty = entity.getPTdayTotalDiffQty();
 * Long pQty = entity.getPQty();
 * Long pInventoryNum = entity.getPInventoryNum();
 * Long pYdayTotalDiffQty = entity.getPYdayTotalDiffQty();
 * Long pTdayDiffQty = entity.getPTdayDiffQty();
 * Long slYdayTotalDiffQty = entity.getSlYdayTotalDiffQty();
 * Long slTdayDiffQty = entity.getSlTdayDiffQty();
 * Long qty = entity.getQty();
 * Long inventoryNum = entity.getInventoryNum();
 * String userUse4 = entity.getUserUse4();
 * String lotAtrb1Title = entity.getLotAtrb1Title();
 * String userNum4 = entity.getUserNum4();
 * String userNum3 = entity.getUserNum3();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setEProductStockInfoId(eProductStockInfoId);
 * entity.setSendCd(sendCd);
 * entity.setSendRowId(sendRowId);
 * entity.setWorkFlg(workFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setSeq(seq);
 * entity.setInOutKbn(inOutKbn);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setExecuteDate(executeDate);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setStockLocation(stockLocation);
 * entity.setStockLocationNm(stockLocationNm);
 * entity.setManufactureDate(manufactureDate);
 * entity.setDesignKbn(designKbn);
 * entity.setLocationCd(locationCd);
 * entity.setTransportCd(transportCd);
 * entity.setFirmCarryNo(firmCarryNo);
 * entity.setSourceCd(sourceCd);
 * entity.setSourceNm(sourceNm);
 * entity.setSchDate(schDate);
 * entity.setRcvDate(rcvDate);
 * entity.setPTdayTotalDiffQty(pTdayTotalDiffQty);
 * entity.setPQty(pQty);
 * entity.setPInventoryNum(pInventoryNum);
 * entity.setPYdayTotalDiffQty(pYdayTotalDiffQty);
 * entity.setPTdayDiffQty(pTdayDiffQty);
 * entity.setSlYdayTotalDiffQty(slYdayTotalDiffQty);
 * entity.setSlTdayDiffQty(slTdayDiffQty);
 * entity.setQty(qty);
 * entity.setInventoryNum(inventoryNum);
 * entity.setUserUse4(userUse4);
 * entity.setLotAtrb1Title(lotAtrb1Title);
 * entity.setUserNum4(userNum4);
 * entity.setUserNum3(userNum3);
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
public abstract class BsEProductStockInfo extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _eProductStockInfoId;

    /** SEND_CD: {NotNull, varchar(30)} */
    protected String _sendCd;

    /** SEND_ROW_ID: {NotNull, bigint(19)} */
    protected Long _sendRowId;

    /** WORK_FLG: {NotNull, char(1), default=[0]} */
    protected String _workFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

    /** SEQ: {NotNull, bigint(19)} */
    protected Long _seq;

    /** IN_OUT_KBN: {NotNull, varchar(30)} */
    protected String _inOutKbn;

    /** CENTER_CD: {NotNull, varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {NotNull, varchar(60)} */
    protected String _centerNm;

    /** EXECUTE_DATE: {NotNull, varchar(8)} */
    protected String _executeDate;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    protected String _productCd;

    /** PRODUCT_NM: {NotNull, varchar(60)} */
    protected String _productNm;

    /** STOCK_LOCATION: {NotNull, varchar(30)} */
    protected String _stockLocation;

    /** STOCK_LOCATION_NM: {NotNull, varchar(60)} */
    protected String _stockLocationNm;

    /** MANUFACTURE_DATE: {NotNull, varchar(8)} */
    protected String _manufactureDate;

    /** DESIGN_KBN: {NotNull, varchar(30)} */
    protected String _designKbn;

    /** LOCATION_CD: {NotNull, varchar(30)} */
    protected String _locationCd;

    /** TRANSPORT_CD: {NotNull, varchar(30)} */
    protected String _transportCd;

    /** FIRM_CARRY_NO: {NotNull, varchar(30)} */
    protected String _firmCarryNo;

    /** SOURCE_CD: {NotNull, varchar(30)} */
    protected String _sourceCd;

    /** SOURCE_NM: {NotNull, varchar(60)} */
    protected String _sourceNm;

    /** SCH_DATE: {NotNull, varchar(8)} */
    protected String _schDate;

    /** RCV_DATE: {NotNull, varchar(14)} */
    protected String _rcvDate;

    /** P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} */
    protected Long _pTdayTotalDiffQty;

    /** P_QTY: {NotNull, bigint(19)} */
    protected Long _pQty;

    /** P_INVENTORY_NUM: {NotNull, bigint(19)} */
    protected Long _pInventoryNum;

    /** P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} */
    protected Long _pYdayTotalDiffQty;

    /** P_TDAY_DIFF_QTY: {NotNull, bigint(19)} */
    protected Long _pTdayDiffQty;

    /** SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} */
    protected Long _slYdayTotalDiffQty;

    /** SL_TDAY_DIFF_QTY: {NotNull, bigint(19)} */
    protected Long _slTdayDiffQty;

    /** QTY: {NotNull, bigint(19)} */
    protected Long _qty;

    /** INVENTORY_NUM: {NotNull, bigint(19)} */
    protected Long _inventoryNum;

    /** USER_USE4: {NotNull, varchar(30)} */
    protected String _userUse4;

    /** LOT_ATRB1_TITLE: {NotNull, varchar(60)} */
    protected String _lotAtrb1Title;

    /** USER_NUM4: {NotNull, varchar(30)} */
    protected String _userNum4;

    /** USER_NUM3: {NotNull, varchar(30)} */
    protected String _userNum3;

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
        return "E_PRODUCT_STOCK_INFO";
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
        if (_eProductStockInfoId == null) { return false; }
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
        if (obj instanceof BsEProductStockInfo) {
            BsEProductStockInfo other = (BsEProductStockInfo)obj;
            if (!xSV(_eProductStockInfoId, other._eProductStockInfoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _eProductStockInfoId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_eProductStockInfoId));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendRowId));
        sb.append(dm).append(xfND(_workFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_seq));
        sb.append(dm).append(xfND(_inOutKbn));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_executeDate));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_stockLocation));
        sb.append(dm).append(xfND(_stockLocationNm));
        sb.append(dm).append(xfND(_manufactureDate));
        sb.append(dm).append(xfND(_designKbn));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_transportCd));
        sb.append(dm).append(xfND(_firmCarryNo));
        sb.append(dm).append(xfND(_sourceCd));
        sb.append(dm).append(xfND(_sourceNm));
        sb.append(dm).append(xfND(_schDate));
        sb.append(dm).append(xfND(_rcvDate));
        sb.append(dm).append(xfND(_pTdayTotalDiffQty));
        sb.append(dm).append(xfND(_pQty));
        sb.append(dm).append(xfND(_pInventoryNum));
        sb.append(dm).append(xfND(_pYdayTotalDiffQty));
        sb.append(dm).append(xfND(_pTdayDiffQty));
        sb.append(dm).append(xfND(_slYdayTotalDiffQty));
        sb.append(dm).append(xfND(_slTdayDiffQty));
        sb.append(dm).append(xfND(_qty));
        sb.append(dm).append(xfND(_inventoryNum));
        sb.append(dm).append(xfND(_userUse4));
        sb.append(dm).append(xfND(_lotAtrb1Title));
        sb.append(dm).append(xfND(_userNum4));
        sb.append(dm).append(xfND(_userNum3));
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
    public EProductStockInfo clone() {
        return (EProductStockInfo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製品在庫情報送信テーブルID
     * @return The value of the column 'E_PRODUCT_STOCK_INFO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getEProductStockInfoId() {
        checkSpecifiedProperty("EProductStockInfoId");
        return _eProductStockInfoId;
    }

    /**
     * [set] E_PRODUCT_STOCK_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製品在庫情報送信テーブルID
     * @param eProductStockInfoId The value of the column 'E_PRODUCT_STOCK_INFO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setEProductStockInfoId(Long eProductStockInfoId) {
        registerModifiedProperty("EProductStockInfoId");
        _eProductStockInfoId = eProductStockInfoId;
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
     * [get] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSendRowId() {
        checkSpecifiedProperty("sendRowId");
        return _sendRowId;
    }

    /**
     * [set] SEND_ROW_ID: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendRowId The value of the column 'SEND_ROW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSendRowId(Long sendRowId) {
        registerModifiedProperty("sendRowId");
        _sendRowId = sendRowId;
    }

    /**
     * [get] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getWorkFlg() {
        checkSpecifiedProperty("workFlg");
        return convertEmptyToNull(_workFlg);
    }

    /**
     * [set] WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setWorkFlg(String workFlg) {
        registerModifiedProperty("workFlg");
        _workFlg = workFlg;
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
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] SEQ: {NotNull, bigint(19)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQ'. (basically NotNull if selected: for the constraint)
     */
    public Long getSeq() {
        checkSpecifiedProperty("seq");
        return _seq;
    }

    /**
     * [set] SEQ: {NotNull, bigint(19)} <br>
     * シーケンス番号
     * @param seq The value of the column 'SEQ'. (basically NotNull if update: for the constraint)
     */
    public void setSeq(Long seq) {
        registerModifiedProperty("seq");
        _seq = seq;
    }

    /**
     * [get] IN_OUT_KBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'IN_OUT_KBN'. (basically NotNull if selected: for the constraint)
     */
    public String getInOutKbn() {
        checkSpecifiedProperty("inOutKbn");
        return convertEmptyToNull(_inOutKbn);
    }

    /**
     * [set] IN_OUT_KBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @param inOutKbn The value of the column 'IN_OUT_KBN'. (basically NotNull if update: for the constraint)
     */
    public void setInOutKbn(String inOutKbn) {
        registerModifiedProperty("inOutKbn");
        _inOutKbn = inOutKbn;
    }

    /**
     * [get] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (basically NotNull if update: for the constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {NotNull, varchar(60)} <br>
     * 拠点名称
     * @return The value of the column 'CENTER_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {NotNull, varchar(60)} <br>
     * 拠点名称
     * @param centerNm The value of the column 'CENTER_NM'. (basically NotNull if update: for the constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] EXECUTE_DATE: {NotNull, varchar(8)} <br>
     * 情報作成日
     * @return The value of the column 'EXECUTE_DATE'. (basically NotNull if selected: for the constraint)
     */
    public String getExecuteDate() {
        checkSpecifiedProperty("executeDate");
        return convertEmptyToNull(_executeDate);
    }

    /**
     * [set] EXECUTE_DATE: {NotNull, varchar(8)} <br>
     * 情報作成日
     * @param executeDate The value of the column 'EXECUTE_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setExecuteDate(String executeDate) {
        registerModifiedProperty("executeDate");
        _executeDate = executeDate;
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
     * [get] PRODUCT_NM: {NotNull, varchar(60)} <br>
     * 銘柄名称
     * @return The value of the column 'PRODUCT_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {NotNull, varchar(60)} <br>
     * 銘柄名称
     * @param productNm The value of the column 'PRODUCT_NM'. (basically NotNull if update: for the constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] STOCK_LOCATION: {NotNull, varchar(30)} <br>
     * 格納場所区分
     * @return The value of the column 'STOCK_LOCATION'. (basically NotNull if selected: for the constraint)
     */
    public String getStockLocation() {
        checkSpecifiedProperty("stockLocation");
        return convertEmptyToNull(_stockLocation);
    }

    /**
     * [set] STOCK_LOCATION: {NotNull, varchar(30)} <br>
     * 格納場所区分
     * @param stockLocation The value of the column 'STOCK_LOCATION'. (basically NotNull if update: for the constraint)
     */
    public void setStockLocation(String stockLocation) {
        registerModifiedProperty("stockLocation");
        _stockLocation = stockLocation;
    }

    /**
     * [get] STOCK_LOCATION_NM: {NotNull, varchar(60)} <br>
     * 格納場所区分名称
     * @return The value of the column 'STOCK_LOCATION_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getStockLocationNm() {
        checkSpecifiedProperty("stockLocationNm");
        return convertEmptyToNull(_stockLocationNm);
    }

    /**
     * [set] STOCK_LOCATION_NM: {NotNull, varchar(60)} <br>
     * 格納場所区分名称
     * @param stockLocationNm The value of the column 'STOCK_LOCATION_NM'. (basically NotNull if update: for the constraint)
     */
    public void setStockLocationNm(String stockLocationNm) {
        registerModifiedProperty("stockLocationNm");
        _stockLocationNm = stockLocationNm;
    }

    /**
     * [get] MANUFACTURE_DATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTURE_DATE'. (basically NotNull if selected: for the constraint)
     */
    public String getManufactureDate() {
        checkSpecifiedProperty("manufactureDate");
        return convertEmptyToNull(_manufactureDate);
    }

    /**
     * [set] MANUFACTURE_DATE: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param manufactureDate The value of the column 'MANUFACTURE_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setManufactureDate(String manufactureDate) {
        registerModifiedProperty("manufactureDate");
        _manufactureDate = manufactureDate;
    }

    /**
     * [get] DESIGN_KBN: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_KBN'. (basically NotNull if selected: for the constraint)
     */
    public String getDesignKbn() {
        checkSpecifiedProperty("designKbn");
        return convertEmptyToNull(_designKbn);
    }

    /**
     * [set] DESIGN_KBN: {NotNull, varchar(30)} <br>
     * デザイン区分
     * @param designKbn The value of the column 'DESIGN_KBN'. (basically NotNull if update: for the constraint)
     */
    public void setDesignKbn(String designKbn) {
        registerModifiedProperty("designKbn");
        _designKbn = designKbn;
    }

    /**
     * [get] LOCATION_CD: {NotNull, varchar(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {NotNull, varchar(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (basically NotNull if update: for the constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] TRANSPORT_CD: {NotNull, varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORT_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getTransportCd() {
        checkSpecifiedProperty("transportCd");
        return convertEmptyToNull(_transportCd);
    }

    /**
     * [set] TRANSPORT_CD: {NotNull, varchar(30)} <br>
     * 輸送番号
     * @param transportCd The value of the column 'TRANSPORT_CD'. (basically NotNull if update: for the constraint)
     */
    public void setTransportCd(String transportCd) {
        registerModifiedProperty("transportCd");
        _transportCd = transportCd;
    }

    /**
     * [get] FIRM_CARRY_NO: {NotNull, varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRM_CARRY_NO'. (basically NotNull if selected: for the constraint)
     */
    public String getFirmCarryNo() {
        checkSpecifiedProperty("firmCarryNo");
        return convertEmptyToNull(_firmCarryNo);
    }

    /**
     * [set] FIRM_CARRY_NO: {NotNull, varchar(30)} <br>
     * 商社搬入番号
     * @param firmCarryNo The value of the column 'FIRM_CARRY_NO'. (basically NotNull if update: for the constraint)
     */
    public void setFirmCarryNo(String firmCarryNo) {
        registerModifiedProperty("firmCarryNo");
        _firmCarryNo = firmCarryNo;
    }

    /**
     * [get] SOURCE_CD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SOURCE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getSourceCd() {
        checkSpecifiedProperty("sourceCd");
        return convertEmptyToNull(_sourceCd);
    }

    /**
     * [set] SOURCE_CD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @param sourceCd The value of the column 'SOURCE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setSourceCd(String sourceCd) {
        registerModifiedProperty("sourceCd");
        _sourceCd = sourceCd;
    }

    /**
     * [get] SOURCE_NM: {NotNull, varchar(60)} <br>
     * 発送元名称
     * @return The value of the column 'SOURCE_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getSourceNm() {
        checkSpecifiedProperty("sourceNm");
        return convertEmptyToNull(_sourceNm);
    }

    /**
     * [set] SOURCE_NM: {NotNull, varchar(60)} <br>
     * 発送元名称
     * @param sourceNm The value of the column 'SOURCE_NM'. (basically NotNull if update: for the constraint)
     */
    public void setSourceNm(String sourceNm) {
        registerModifiedProperty("sourceNm");
        _sourceNm = sourceNm;
    }

    /**
     * [get] SCH_DATE: {NotNull, varchar(8)} <br>
     * 発送日
     * @return The value of the column 'SCH_DATE'. (basically NotNull if selected: for the constraint)
     */
    public String getSchDate() {
        checkSpecifiedProperty("schDate");
        return convertEmptyToNull(_schDate);
    }

    /**
     * [set] SCH_DATE: {NotNull, varchar(8)} <br>
     * 発送日
     * @param schDate The value of the column 'SCH_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setSchDate(String schDate) {
        registerModifiedProperty("schDate");
        _schDate = schDate;
    }

    /**
     * [get] RCV_DATE: {NotNull, varchar(14)} <br>
     * 入庫日
     * @return The value of the column 'RCV_DATE'. (basically NotNull if selected: for the constraint)
     */
    public String getRcvDate() {
        checkSpecifiedProperty("rcvDate");
        return convertEmptyToNull(_rcvDate);
    }

    /**
     * [set] RCV_DATE: {NotNull, varchar(14)} <br>
     * 入庫日
     * @param rcvDate The value of the column 'RCV_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setRcvDate(String rcvDate) {
        registerModifiedProperty("rcvDate");
        _rcvDate = rcvDate;
    }

    /**
     * [get] P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_当月過不足総計
     * @return The value of the column 'P_TDAY_TOTAL_DIFF_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPTdayTotalDiffQty() {
        checkSpecifiedProperty("PTdayTotalDiffQty");
        return _pTdayTotalDiffQty;
    }

    /**
     * [set] P_TDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_当月過不足総計
     * @param pTdayTotalDiffQty The value of the column 'P_TDAY_TOTAL_DIFF_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setPTdayTotalDiffQty(Long pTdayTotalDiffQty) {
        registerModifiedProperty("PTdayTotalDiffQty");
        _pTdayTotalDiffQty = pTdayTotalDiffQty;
    }

    /**
     * [get] P_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_システム在庫
     * @return The value of the column 'P_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPQty() {
        checkSpecifiedProperty("PQty");
        return _pQty;
    }

    /**
     * [set] P_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_システム在庫
     * @param pQty The value of the column 'P_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setPQty(Long pQty) {
        registerModifiedProperty("PQty");
        _pQty = pQty;
    }

    /**
     * [get] P_INVENTORY_NUM: {NotNull, bigint(19)} <br>
     * 銘柄計_調査結果
     * @return The value of the column 'P_INVENTORY_NUM'. (basically NotNull if selected: for the constraint)
     */
    public Long getPInventoryNum() {
        checkSpecifiedProperty("PInventoryNum");
        return _pInventoryNum;
    }

    /**
     * [set] P_INVENTORY_NUM: {NotNull, bigint(19)} <br>
     * 銘柄計_調査結果
     * @param pInventoryNum The value of the column 'P_INVENTORY_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setPInventoryNum(Long pInventoryNum) {
        registerModifiedProperty("PInventoryNum");
        _pInventoryNum = pInventoryNum;
    }

    /**
     * [get] P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_前日までの過不足
     * @return The value of the column 'P_YDAY_TOTAL_DIFF_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPYdayTotalDiffQty() {
        checkSpecifiedProperty("PYdayTotalDiffQty");
        return _pYdayTotalDiffQty;
    }

    /**
     * [set] P_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_前日までの過不足
     * @param pYdayTotalDiffQty The value of the column 'P_YDAY_TOTAL_DIFF_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setPYdayTotalDiffQty(Long pYdayTotalDiffQty) {
        registerModifiedProperty("PYdayTotalDiffQty");
        _pYdayTotalDiffQty = pYdayTotalDiffQty;
    }

    /**
     * [get] P_TDAY_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_当日過不足
     * @return The value of the column 'P_TDAY_DIFF_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPTdayDiffQty() {
        checkSpecifiedProperty("PTdayDiffQty");
        return _pTdayDiffQty;
    }

    /**
     * [set] P_TDAY_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄計_当日過不足
     * @param pTdayDiffQty The value of the column 'P_TDAY_DIFF_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setPTdayDiffQty(Long pTdayDiffQty) {
        registerModifiedProperty("PTdayDiffQty");
        _pTdayDiffQty = pTdayDiffQty;
    }

    /**
     * [get] SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄格納場所計_前日までの過不足
     * @return The value of the column 'SL_YDAY_TOTAL_DIFF_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getSlYdayTotalDiffQty() {
        checkSpecifiedProperty("slYdayTotalDiffQty");
        return _slYdayTotalDiffQty;
    }

    /**
     * [set] SL_YDAY_TOTAL_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄格納場所計_前日までの過不足
     * @param slYdayTotalDiffQty The value of the column 'SL_YDAY_TOTAL_DIFF_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setSlYdayTotalDiffQty(Long slYdayTotalDiffQty) {
        registerModifiedProperty("slYdayTotalDiffQty");
        _slYdayTotalDiffQty = slYdayTotalDiffQty;
    }

    /**
     * [get] SL_TDAY_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄格納場所計_当日過不足
     * @return The value of the column 'SL_TDAY_DIFF_QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getSlTdayDiffQty() {
        checkSpecifiedProperty("slTdayDiffQty");
        return _slTdayDiffQty;
    }

    /**
     * [set] SL_TDAY_DIFF_QTY: {NotNull, bigint(19)} <br>
     * 銘柄格納場所計_当日過不足
     * @param slTdayDiffQty The value of the column 'SL_TDAY_DIFF_QTY'. (basically NotNull if update: for the constraint)
     */
    public void setSlTdayDiffQty(Long slTdayDiffQty) {
        registerModifiedProperty("slTdayDiffQty");
        _slTdayDiffQty = slTdayDiffQty;
    }

    /**
     * [get] QTY: {NotNull, bigint(19)} <br>
     * システム在庫
     * @return The value of the column 'QTY'. (basically NotNull if selected: for the constraint)
     */
    public Long getQty() {
        checkSpecifiedProperty("qty");
        return _qty;
    }

    /**
     * [set] QTY: {NotNull, bigint(19)} <br>
     * システム在庫
     * @param qty The value of the column 'QTY'. (basically NotNull if update: for the constraint)
     */
    public void setQty(Long qty) {
        registerModifiedProperty("qty");
        _qty = qty;
    }

    /**
     * [get] INVENTORY_NUM: {NotNull, bigint(19)} <br>
     * 調査結果
     * @return The value of the column 'INVENTORY_NUM'. (basically NotNull if selected: for the constraint)
     */
    public Long getInventoryNum() {
        checkSpecifiedProperty("inventoryNum");
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {NotNull, bigint(19)} <br>
     * 調査結果
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setInventoryNum(Long inventoryNum) {
        registerModifiedProperty("inventoryNum");
        _inventoryNum = inventoryNum;
    }

    /**
     * [get] USER_USE4: {NotNull, varchar(30)} <br>
     * 銘柄CD(親銘柄)
     * @return The value of the column 'USER_USE4'. (basically NotNull if selected: for the constraint)
     */
    public String getUserUse4() {
        checkSpecifiedProperty("userUse4");
        return convertEmptyToNull(_userUse4);
    }

    /**
     * [set] USER_USE4: {NotNull, varchar(30)} <br>
     * 銘柄CD(親銘柄)
     * @param userUse4 The value of the column 'USER_USE4'. (basically NotNull if update: for the constraint)
     */
    public void setUserUse4(String userUse4) {
        registerModifiedProperty("userUse4");
        _userUse4 = userUse4;
    }

    /**
     * [get] LOT_ATRB1_TITLE: {NotNull, varchar(60)} <br>
     * 銘柄CD(庫内集約銘柄)
     * @return The value of the column 'LOT_ATRB1_TITLE'. (basically NotNull if selected: for the constraint)
     */
    public String getLotAtrb1Title() {
        checkSpecifiedProperty("lotAtrb1Title");
        return convertEmptyToNull(_lotAtrb1Title);
    }

    /**
     * [set] LOT_ATRB1_TITLE: {NotNull, varchar(60)} <br>
     * 銘柄CD(庫内集約銘柄)
     * @param lotAtrb1Title The value of the column 'LOT_ATRB1_TITLE'. (basically NotNull if update: for the constraint)
     */
    public void setLotAtrb1Title(String lotAtrb1Title) {
        registerModifiedProperty("lotAtrb1Title");
        _lotAtrb1Title = lotAtrb1Title;
    }

    /**
     * [get] USER_NUM4: {NotNull, varchar(30)} <br>
     * CAP銘柄区分
     * @return The value of the column 'USER_NUM4'. (basically NotNull if selected: for the constraint)
     */
    public String getUserNum4() {
        checkSpecifiedProperty("userNum4");
        return convertEmptyToNull(_userNum4);
    }

    /**
     * [set] USER_NUM4: {NotNull, varchar(30)} <br>
     * CAP銘柄区分
     * @param userNum4 The value of the column 'USER_NUM4'. (basically NotNull if update: for the constraint)
     */
    public void setUserNum4(String userNum4) {
        registerModifiedProperty("userNum4");
        _userNum4 = userNum4;
    }

    /**
     * [get] USER_NUM3: {NotNull, varchar(30)} <br>
     * 一般出力順
     * @return The value of the column 'USER_NUM3'. (basically NotNull if selected: for the constraint)
     */
    public String getUserNum3() {
        checkSpecifiedProperty("userNum3");
        return convertEmptyToNull(_userNum3);
    }

    /**
     * [set] USER_NUM3: {NotNull, varchar(30)} <br>
     * 一般出力順
     * @param userNum3 The value of the column 'USER_NUM3'. (basically NotNull if update: for the constraint)
     */
    public void setUserNum3(String userNum3) {
        registerModifiedProperty("userNum3");
        _userNum3 = userNum3;
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
