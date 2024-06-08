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
 * The entity of E_SHIPPING_RECORD_DATA as TABLE. <br>
 * 発送実績データ受信テーブル
 * <pre>
 * [primary-key]
 *     SHIPPING_RECORD_DATA_ID
 *
 * [column]
 *     SHIPPING_RECORD_DATA_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, DATA_FLG, RECORD_DATA, TRANSPORTCD, ITEMCD_H, ORDERNO_H, CASEQTY, FRACTQTY, SHIPTOCD, FACTORYCD, ITEMCD_M, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO_M, MACHINENO, CREATENO, LIMITDATE, CASELOT4, DISTRIBUTIONCD, PALLETID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_RECORD_DATA_ID
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
 * Long shippingRecordDataId = entity.getShippingRecordDataId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String dataFlg = entity.getDataFlg();
 * String recordData = entity.getRecordData();
 * String transportcd = entity.getTransportcd();
 * String itemcdH = entity.getItemcdH();
 * String ordernoH = entity.getOrdernoH();
 * String caseqty = entity.getCaseqty();
 * String fractqty = entity.getFractqty();
 * String shiptocd = entity.getShiptocd();
 * String factorycd = entity.getFactorycd();
 * String itemcdM = entity.getItemcdM();
 * String skucd = entity.getSkucd();
 * String destinationcd = entity.getDestinationcd();
 * String manufacturecd = entity.getManufacturecd();
 * String ordernoM = entity.getOrdernoM();
 * String machineno = entity.getMachineno();
 * String createno = entity.getCreateno();
 * String limitdate = entity.getLimitdate();
 * String caselot4 = entity.getCaselot4();
 * String distributioncd = entity.getDistributioncd();
 * String palletid = entity.getPalletid();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShippingRecordDataId(shippingRecordDataId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setDataFlg(dataFlg);
 * entity.setRecordData(recordData);
 * entity.setTransportcd(transportcd);
 * entity.setItemcdH(itemcdH);
 * entity.setOrdernoH(ordernoH);
 * entity.setCaseqty(caseqty);
 * entity.setFractqty(fractqty);
 * entity.setShiptocd(shiptocd);
 * entity.setFactorycd(factorycd);
 * entity.setItemcdM(itemcdM);
 * entity.setSkucd(skucd);
 * entity.setDestinationcd(destinationcd);
 * entity.setManufacturecd(manufacturecd);
 * entity.setOrdernoM(ordernoM);
 * entity.setMachineno(machineno);
 * entity.setCreateno(createno);
 * entity.setLimitdate(limitdate);
 * entity.setCaselot4(caselot4);
 * entity.setDistributioncd(distributioncd);
 * entity.setPalletid(palletid);
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
public abstract class BsEShippingRecordData extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _shippingRecordDataId;

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

    /** DATA_FLG: {NotNull, char(1), default=[0]} */
    protected String _dataFlg;

    /** RECORD_DATA: {varchar(255)} */
    protected String _recordData;

    /** TRANSPORTCD: {varchar(255)} */
    protected String _transportcd;

    /** ITEMCD_H: {varchar(255)} */
    protected String _itemcdH;

    /** ORDERNO_H: {varchar(255)} */
    protected String _ordernoH;

    /** CASEQTY: {varchar(255)} */
    protected String _caseqty;

    /** FRACTQTY: {varchar(255)} */
    protected String _fractqty;

    /** SHIPTOCD: {varchar(255)} */
    protected String _shiptocd;

    /** FACTORYCD: {varchar(255)} */
    protected String _factorycd;

    /** ITEMCD_M: {varchar(255)} */
    protected String _itemcdM;

    /** SKUCD: {varchar(255)} */
    protected String _skucd;

    /** DESTINATIONCD: {varchar(255)} */
    protected String _destinationcd;

    /** MANUFACTURECD: {varchar(255)} */
    protected String _manufacturecd;

    /** ORDERNO_M: {varchar(255)} */
    protected String _ordernoM;

    /** MACHINENO: {varchar(255)} */
    protected String _machineno;

    /** CREATENO: {varchar(255)} */
    protected String _createno;

    /** LIMITDATE: {varchar(255)} */
    protected String _limitdate;

    /** CASELOT4: {varchar(255)} */
    protected String _caselot4;

    /** DISTRIBUTIONCD: {varchar(255)} */
    protected String _distributioncd;

    /** PALLETID: {varchar(255)} */
    protected String _palletid;

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
        return "E_SHIPPING_RECORD_DATA";
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
        if (_shippingRecordDataId == null) { return false; }
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
        if (obj instanceof BsEShippingRecordData) {
            BsEShippingRecordData other = (BsEShippingRecordData)obj;
            if (!xSV(_shippingRecordDataId, other._shippingRecordDataId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingRecordDataId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingRecordDataId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_dataFlg));
        sb.append(dm).append(xfND(_recordData));
        sb.append(dm).append(xfND(_transportcd));
        sb.append(dm).append(xfND(_itemcdH));
        sb.append(dm).append(xfND(_ordernoH));
        sb.append(dm).append(xfND(_caseqty));
        sb.append(dm).append(xfND(_fractqty));
        sb.append(dm).append(xfND(_shiptocd));
        sb.append(dm).append(xfND(_factorycd));
        sb.append(dm).append(xfND(_itemcdM));
        sb.append(dm).append(xfND(_skucd));
        sb.append(dm).append(xfND(_destinationcd));
        sb.append(dm).append(xfND(_manufacturecd));
        sb.append(dm).append(xfND(_ordernoM));
        sb.append(dm).append(xfND(_machineno));
        sb.append(dm).append(xfND(_createno));
        sb.append(dm).append(xfND(_limitdate));
        sb.append(dm).append(xfND(_caselot4));
        sb.append(dm).append(xfND(_distributioncd));
        sb.append(dm).append(xfND(_palletid));
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
    public EShippingRecordData clone() {
        return (EShippingRecordData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 発送実績データ受信ID
     * @return The value of the column 'SHIPPING_RECORD_DATA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingRecordDataId() {
        checkSpecifiedProperty("shippingRecordDataId");
        return _shippingRecordDataId;
    }

    /**
     * [set] SHIPPING_RECORD_DATA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 発送実績データ受信ID
     * @param shippingRecordDataId The value of the column 'SHIPPING_RECORD_DATA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingRecordDataId(Long shippingRecordDataId) {
        registerModifiedProperty("shippingRecordDataId");
        _shippingRecordDataId = shippingRecordDataId;
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
     * [get] DATA_FLG: {NotNull, char(1), default=[0]} <br>
     * ヘッダフラグ
     * @return The value of the column 'DATA_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDataFlg() {
        checkSpecifiedProperty("dataFlg");
        return convertEmptyToNull(_dataFlg);
    }

    /**
     * [set] DATA_FLG: {NotNull, char(1), default=[0]} <br>
     * ヘッダフラグ
     * @param dataFlg The value of the column 'DATA_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDataFlg(String dataFlg) {
        registerModifiedProperty("dataFlg");
        _dataFlg = dataFlg;
    }

    /**
     * [get] RECORD_DATA: {varchar(255)} <br>
     * レコード長判定用項目
     * @return The value of the column 'RECORD_DATA'. (NullAllowed even if selected: for no constraint)
     */
    public String getRecordData() {
        checkSpecifiedProperty("recordData");
        return convertEmptyToNull(_recordData);
    }

    /**
     * [set] RECORD_DATA: {varchar(255)} <br>
     * レコード長判定用項目
     * @param recordData The value of the column 'RECORD_DATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRecordData(String recordData) {
        registerModifiedProperty("recordData");
        _recordData = recordData;
    }

    /**
     * [get] TRANSPORTCD: {varchar(255)} <br>
     * 輸送整理番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportcd() {
        checkSpecifiedProperty("transportcd");
        return convertEmptyToNull(_transportcd);
    }

    /**
     * [set] TRANSPORTCD: {varchar(255)} <br>
     * 輸送整理番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportcd(String transportcd) {
        registerModifiedProperty("transportcd");
        _transportcd = transportcd;
    }

    /**
     * [get] ITEMCD_H: {varchar(255)} <br>
     * ヘッダ部銘柄CD
     * @return The value of the column 'ITEMCD_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcdH() {
        checkSpecifiedProperty("itemcdH");
        return convertEmptyToNull(_itemcdH);
    }

    /**
     * [set] ITEMCD_H: {varchar(255)} <br>
     * ヘッダ部銘柄CD
     * @param itemcdH The value of the column 'ITEMCD_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcdH(String itemcdH) {
        registerModifiedProperty("itemcdH");
        _itemcdH = itemcdH;
    }

    /**
     * [get] ORDERNO_H: {varchar(255)} <br>
     * ヘッダ部発注番号
     * @return The value of the column 'ORDERNO_H'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdernoH() {
        checkSpecifiedProperty("ordernoH");
        return convertEmptyToNull(_ordernoH);
    }

    /**
     * [set] ORDERNO_H: {varchar(255)} <br>
     * ヘッダ部発注番号
     * @param ordernoH The value of the column 'ORDERNO_H'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdernoH(String ordernoH) {
        registerModifiedProperty("ordernoH");
        _ordernoH = ordernoH;
    }

    /**
     * [get] CASEQTY: {varchar(255)} <br>
     * 段ボール数
     * @return The value of the column 'CASEQTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseqty() {
        checkSpecifiedProperty("caseqty");
        return convertEmptyToNull(_caseqty);
    }

    /**
     * [set] CASEQTY: {varchar(255)} <br>
     * 段ボール数
     * @param caseqty The value of the column 'CASEQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseqty(String caseqty) {
        registerModifiedProperty("caseqty");
        _caseqty = caseqty;
    }

    /**
     * [get] FRACTQTY: {varchar(255)} <br>
     * 個数
     * @return The value of the column 'FRACTQTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getFractqty() {
        checkSpecifiedProperty("fractqty");
        return convertEmptyToNull(_fractqty);
    }

    /**
     * [set] FRACTQTY: {varchar(255)} <br>
     * 個数
     * @param fractqty The value of the column 'FRACTQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFractqty(String fractqty) {
        registerModifiedProperty("fractqty");
        _fractqty = fractqty;
    }

    /**
     * [get] SHIPTOCD: {varchar(255)} <br>
     * 受入先CD
     * @return The value of the column 'SHIPTOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptocd() {
        checkSpecifiedProperty("shiptocd");
        return convertEmptyToNull(_shiptocd);
    }

    /**
     * [set] SHIPTOCD: {varchar(255)} <br>
     * 受入先CD
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptocd(String shiptocd) {
        registerModifiedProperty("shiptocd");
        _shiptocd = shiptocd;
    }

    /**
     * [get] FACTORYCD: {varchar(255)} <br>
     * 工場
     * @return The value of the column 'FACTORYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFactorycd() {
        checkSpecifiedProperty("factorycd");
        return convertEmptyToNull(_factorycd);
    }

    /**
     * [set] FACTORYCD: {varchar(255)} <br>
     * 工場
     * @param factorycd The value of the column 'FACTORYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFactorycd(String factorycd) {
        registerModifiedProperty("factorycd");
        _factorycd = factorycd;
    }

    /**
     * [get] ITEMCD_M: {varchar(255)} <br>
     * 明細部銘柄CD
     * @return The value of the column 'ITEMCD_M'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcdM() {
        checkSpecifiedProperty("itemcdM");
        return convertEmptyToNull(_itemcdM);
    }

    /**
     * [set] ITEMCD_M: {varchar(255)} <br>
     * 明細部銘柄CD
     * @param itemcdM The value of the column 'ITEMCD_M'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcdM(String itemcdM) {
        registerModifiedProperty("itemcdM");
        _itemcdM = itemcdM;
    }

    /**
     * [get] SKUCD: {varchar(255)} <br>
     * SKUCD
     * @return The value of the column 'SKUCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSkucd() {
        checkSpecifiedProperty("skucd");
        return convertEmptyToNull(_skucd);
    }

    /**
     * [set] SKUCD: {varchar(255)} <br>
     * SKUCD
     * @param skucd The value of the column 'SKUCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSkucd(String skucd) {
        registerModifiedProperty("skucd");
        _skucd = skucd;
    }

    /**
     * [get] DESTINATIONCD: {varchar(255)} <br>
     * 仕向地CD
     * @return The value of the column 'DESTINATIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationcd() {
        checkSpecifiedProperty("destinationcd");
        return convertEmptyToNull(_destinationcd);
    }

    /**
     * [set] DESTINATIONCD: {varchar(255)} <br>
     * 仕向地CD
     * @param destinationcd The value of the column 'DESTINATIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationcd(String destinationcd) {
        registerModifiedProperty("destinationcd");
        _destinationcd = destinationcd;
    }

    /**
     * [get] MANUFACTURECD: {varchar(255)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufacturecd() {
        checkSpecifiedProperty("manufacturecd");
        return convertEmptyToNull(_manufacturecd);
    }

    /**
     * [set] MANUFACTURECD: {varchar(255)} <br>
     * 製造記号
     * @param manufacturecd The value of the column 'MANUFACTURECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufacturecd(String manufacturecd) {
        registerModifiedProperty("manufacturecd");
        _manufacturecd = manufacturecd;
    }

    /**
     * [get] ORDERNO_M: {varchar(255)} <br>
     * 明細部発注番号
     * @return The value of the column 'ORDERNO_M'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdernoM() {
        checkSpecifiedProperty("ordernoM");
        return convertEmptyToNull(_ordernoM);
    }

    /**
     * [set] ORDERNO_M: {varchar(255)} <br>
     * 明細部発注番号
     * @param ordernoM The value of the column 'ORDERNO_M'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdernoM(String ordernoM) {
        registerModifiedProperty("ordernoM");
        _ordernoM = ordernoM;
    }

    /**
     * [get] MACHINENO: {varchar(255)} <br>
     * 号機
     * @return The value of the column 'MACHINENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMachineno() {
        checkSpecifiedProperty("machineno");
        return convertEmptyToNull(_machineno);
    }

    /**
     * [set] MACHINENO: {varchar(255)} <br>
     * 号機
     * @param machineno The value of the column 'MACHINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMachineno(String machineno) {
        registerModifiedProperty("machineno");
        _machineno = machineno;
    }

    /**
     * [get] CREATENO: {varchar(255)} <br>
     * 生出番号
     * @return The value of the column 'CREATENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCreateno() {
        checkSpecifiedProperty("createno");
        return convertEmptyToNull(_createno);
    }

    /**
     * [set] CREATENO: {varchar(255)} <br>
     * 生出番号
     * @param createno The value of the column 'CREATENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreateno(String createno) {
        registerModifiedProperty("createno");
        _createno = createno;
    }

    /**
     * [get] LIMITDATE: {varchar(255)} <br>
     * 製造年月日
     * @return The value of the column 'LIMITDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitdate() {
        checkSpecifiedProperty("limitdate");
        return convertEmptyToNull(_limitdate);
    }

    /**
     * [set] LIMITDATE: {varchar(255)} <br>
     * 製造年月日
     * @param limitdate The value of the column 'LIMITDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitdate(String limitdate) {
        registerModifiedProperty("limitdate");
        _limitdate = limitdate;
    }

    /**
     * [get] CASELOT4: {varchar(255)} <br>
     * 実製造年月日
     * @return The value of the column 'CASELOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaselot4() {
        checkSpecifiedProperty("caselot4");
        return convertEmptyToNull(_caselot4);
    }

    /**
     * [set] CASELOT4: {varchar(255)} <br>
     * 実製造年月日
     * @param caselot4 The value of the column 'CASELOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaselot4(String caselot4) {
        registerModifiedProperty("caselot4");
        _caselot4 = caselot4;
    }

    /**
     * [get] DISTRIBUTIONCD: {varchar(255)} <br>
     * 流通識別
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistributioncd() {
        checkSpecifiedProperty("distributioncd");
        return convertEmptyToNull(_distributioncd);
    }

    /**
     * [set] DISTRIBUTIONCD: {varchar(255)} <br>
     * 流通識別
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistributioncd(String distributioncd) {
        registerModifiedProperty("distributioncd");
        _distributioncd = distributioncd;
    }

    /**
     * [get] PALLETID: {varchar(255)} <br>
     * パレットID
     * @return The value of the column 'PALLETID'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletid() {
        checkSpecifiedProperty("palletid");
        return convertEmptyToNull(_palletid);
    }

    /**
     * [set] PALLETID: {varchar(255)} <br>
     * パレットID
     * @param palletid The value of the column 'PALLETID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletid(String palletid) {
        registerModifiedProperty("palletid");
        _palletid = palletid;
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
