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
 * The entity of E_BONDED_SHIPPING_PLAN_BULK_INPUT as TABLE. <br>
 * 出庫指示受信テーブル（需給）
 * <pre>
 * [primary-key]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
 *
 * [column]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, SBWAREHOUSECD, CUSTORDERNO, ORDERTYPE, SHIPCD, CarryoutPlanCd, ShipToCd, ShipToNm, ReceivePlanYm, ShTypeCd, ShTypeNm, Refno, PickingComment, PhoneNo, BATJMfYm, RmaNo, OwnerOrderNo, PalletNo, PRODUCT_CD, DesignCd, ManufactureYm, FirmcarryNo, Qty, InOutKbn, StockType, CustomsReleaseDate, SupplierCvNo, IfItemCd, SendFlg, PalletOrder, PalletType, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
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
 * Long bondedShippingPlanBulkInputId = entity.getBondedShippingPlanBulkInputId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String sbwarehousecd = entity.getSbwarehousecd();
 * String custorderno = entity.getCustorderno();
 * String ordertype = entity.getOrdertype();
 * String shipcd = entity.getShipcd();
 * String carryoutplancd = entity.getCarryoutplancd();
 * String shiptocd = entity.getShiptocd();
 * String shiptonm = entity.getShiptonm();
 * String receiveplanym = entity.getReceiveplanym();
 * String shtypecd = entity.getShtypecd();
 * String shtypenm = entity.getShtypenm();
 * String refno = entity.getRefno();
 * String pickingcomment = entity.getPickingcomment();
 * String phoneno = entity.getPhoneno();
 * String batjmfym = entity.getBatjmfym();
 * String rmano = entity.getRmano();
 * String ownerorderno = entity.getOwnerorderno();
 * String palletno = entity.getPalletno();
 * String productCd = entity.getProductCd();
 * String designcd = entity.getDesigncd();
 * String manufactureym = entity.getManufactureym();
 * String firmcarryno = entity.getFirmcarryno();
 * String qty = entity.getQty();
 * String inoutkbn = entity.getInoutkbn();
 * String stocktype = entity.getStocktype();
 * String customsreleasedate = entity.getCustomsreleasedate();
 * String suppliercvno = entity.getSuppliercvno();
 * String ifitemcd = entity.getIfitemcd();
 * String sendflg = entity.getSendflg();
 * String palletorder = entity.getPalletorder();
 * String pallettype = entity.getPallettype();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBondedShippingPlanBulkInputId(bondedShippingPlanBulkInputId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setSbwarehousecd(sbwarehousecd);
 * entity.setCustorderno(custorderno);
 * entity.setOrdertype(ordertype);
 * entity.setShipcd(shipcd);
 * entity.setCarryoutplancd(carryoutplancd);
 * entity.setShiptocd(shiptocd);
 * entity.setShiptonm(shiptonm);
 * entity.setReceiveplanym(receiveplanym);
 * entity.setShtypecd(shtypecd);
 * entity.setShtypenm(shtypenm);
 * entity.setRefno(refno);
 * entity.setPickingcomment(pickingcomment);
 * entity.setPhoneno(phoneno);
 * entity.setBatjmfym(batjmfym);
 * entity.setRmano(rmano);
 * entity.setOwnerorderno(ownerorderno);
 * entity.setPalletno(palletno);
 * entity.setProductCd(productCd);
 * entity.setDesigncd(designcd);
 * entity.setManufactureym(manufactureym);
 * entity.setFirmcarryno(firmcarryno);
 * entity.setQty(qty);
 * entity.setInoutkbn(inoutkbn);
 * entity.setStocktype(stocktype);
 * entity.setCustomsreleasedate(customsreleasedate);
 * entity.setSuppliercvno(suppliercvno);
 * entity.setIfitemcd(ifitemcd);
 * entity.setSendflg(sendflg);
 * entity.setPalletorder(palletorder);
 * entity.setPallettype(pallettype);
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
public abstract class BsEBondedShippingPlanBulkInput extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _bondedShippingPlanBulkInputId;

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

    /** SBWAREHOUSECD: {varchar(255)} */
    protected String _sbwarehousecd;

    /** CUSTORDERNO: {varchar(255)} */
    protected String _custorderno;

    /** ORDERTYPE: {varchar(255)} */
    protected String _ordertype;

    /** SHIPCD: {varchar(255)} */
    protected String _shipcd;

    /** CarryoutPlanCd: {varchar(255)} */
    protected String _carryoutplancd;

    /** ShipToCd: {varchar(255)} */
    protected String _shiptocd;

    /** ShipToNm: {varchar(255)} */
    protected String _shiptonm;

    /** ReceivePlanYm: {varchar(255)} */
    protected String _receiveplanym;

    /** ShTypeCd: {varchar(255)} */
    protected String _shtypecd;

    /** ShTypeNm: {varchar(255)} */
    protected String _shtypenm;

    /** Refno: {varchar(255)} */
    protected String _refno;

    /** PickingComment: {varchar(255)} */
    protected String _pickingcomment;

    /** PhoneNo: {varchar(255)} */
    protected String _phoneno;

    /** BATJMfYm: {varchar(255)} */
    protected String _batjmfym;

    /** RmaNo: {varchar(255)} */
    protected String _rmano;

    /** OwnerOrderNo: {varchar(255)} */
    protected String _ownerorderno;

    /** PalletNo: {varchar(255)} */
    protected String _palletno;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** DesignCd: {varchar(255)} */
    protected String _designcd;

    /** ManufactureYm: {varchar(255)} */
    protected String _manufactureym;

    /** FirmcarryNo: {varchar(255)} */
    protected String _firmcarryno;

    /** Qty: {varchar(255)} */
    protected String _qty;

    /** InOutKbn: {varchar(255)} */
    protected String _inoutkbn;

    /** StockType: {varchar(255)} */
    protected String _stocktype;

    /** CustomsReleaseDate: {varchar(255)} */
    protected String _customsreleasedate;

    /** SupplierCvNo: {varchar(255)} */
    protected String _suppliercvno;

    /** IfItemCd: {varchar(255)} */
    protected String _ifitemcd;

    /** SendFlg: {varchar(255)} */
    protected String _sendflg;

    /** PalletOrder: {varchar(255)} */
    protected String _palletorder;

    /** PalletType: {varchar(255)} */
    protected String _pallettype;

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
        return "E_BONDED_SHIPPING_PLAN_BULK_INPUT";
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
        if (_bondedShippingPlanBulkInputId == null) { return false; }
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
        if (obj instanceof BsEBondedShippingPlanBulkInput) {
            BsEBondedShippingPlanBulkInput other = (BsEBondedShippingPlanBulkInput)obj;
            if (!xSV(_bondedShippingPlanBulkInputId, other._bondedShippingPlanBulkInputId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bondedShippingPlanBulkInputId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bondedShippingPlanBulkInputId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_sbwarehousecd));
        sb.append(dm).append(xfND(_custorderno));
        sb.append(dm).append(xfND(_ordertype));
        sb.append(dm).append(xfND(_shipcd));
        sb.append(dm).append(xfND(_carryoutplancd));
        sb.append(dm).append(xfND(_shiptocd));
        sb.append(dm).append(xfND(_shiptonm));
        sb.append(dm).append(xfND(_receiveplanym));
        sb.append(dm).append(xfND(_shtypecd));
        sb.append(dm).append(xfND(_shtypenm));
        sb.append(dm).append(xfND(_refno));
        sb.append(dm).append(xfND(_pickingcomment));
        sb.append(dm).append(xfND(_phoneno));
        sb.append(dm).append(xfND(_batjmfym));
        sb.append(dm).append(xfND(_rmano));
        sb.append(dm).append(xfND(_ownerorderno));
        sb.append(dm).append(xfND(_palletno));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_designcd));
        sb.append(dm).append(xfND(_manufactureym));
        sb.append(dm).append(xfND(_firmcarryno));
        sb.append(dm).append(xfND(_qty));
        sb.append(dm).append(xfND(_inoutkbn));
        sb.append(dm).append(xfND(_stocktype));
        sb.append(dm).append(xfND(_customsreleasedate));
        sb.append(dm).append(xfND(_suppliercvno));
        sb.append(dm).append(xfND(_ifitemcd));
        sb.append(dm).append(xfND(_sendflg));
        sb.append(dm).append(xfND(_palletorder));
        sb.append(dm).append(xfND(_pallettype));
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
    public EBondedShippingPlanBulkInput clone() {
        return (EBondedShippingPlanBulkInput)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫指示受信（需給）ID
     * @return The value of the column 'BONDED_SHIPPING_PLAN_BULK_INPUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBondedShippingPlanBulkInputId() {
        checkSpecifiedProperty("bondedShippingPlanBulkInputId");
        return _bondedShippingPlanBulkInputId;
    }

    /**
     * [set] BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫指示受信（需給）ID
     * @param bondedShippingPlanBulkInputId The value of the column 'BONDED_SHIPPING_PLAN_BULK_INPUT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBondedShippingPlanBulkInputId(Long bondedShippingPlanBulkInputId) {
        registerModifiedProperty("bondedShippingPlanBulkInputId");
        _bondedShippingPlanBulkInputId = bondedShippingPlanBulkInputId;
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
     * [get] CUSTORDERNO: {varchar(255)} <br>
     * 依頼番号
     * @return The value of the column 'CUSTORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustorderno() {
        checkSpecifiedProperty("custorderno");
        return convertEmptyToNull(_custorderno);
    }

    /**
     * [set] CUSTORDERNO: {varchar(255)} <br>
     * 依頼番号
     * @param custorderno The value of the column 'CUSTORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustorderno(String custorderno) {
        registerModifiedProperty("custorderno");
        _custorderno = custorderno;
    }

    /**
     * [get] ORDERTYPE: {varchar(255)} <br>
     * 依頼種別
     * @return The value of the column 'ORDERTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdertype() {
        checkSpecifiedProperty("ordertype");
        return convertEmptyToNull(_ordertype);
    }

    /**
     * [set] ORDERTYPE: {varchar(255)} <br>
     * 依頼種別
     * @param ordertype The value of the column 'ORDERTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdertype(String ordertype) {
        registerModifiedProperty("ordertype");
        _ordertype = ordertype;
    }

    /**
     * [get] SHIPCD: {varchar(255)} <br>
     * 発地CD
     * @return The value of the column 'SHIPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipcd() {
        checkSpecifiedProperty("shipcd");
        return convertEmptyToNull(_shipcd);
    }

    /**
     * [set] SHIPCD: {varchar(255)} <br>
     * 発地CD
     * @param shipcd The value of the column 'SHIPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipcd(String shipcd) {
        registerModifiedProperty("shipcd");
        _shipcd = shipcd;
    }

    /**
     * [get] CarryoutPlanCd: {varchar(255)} <br>
     * 払出予定日
     * @return The value of the column 'CarryoutPlanCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarryoutplancd() {
        checkSpecifiedProperty("carryoutplancd");
        return convertEmptyToNull(_carryoutplancd);
    }

    /**
     * [set] CarryoutPlanCd: {varchar(255)} <br>
     * 払出予定日
     * @param carryoutplancd The value of the column 'CarryoutPlanCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarryoutplancd(String carryoutplancd) {
        registerModifiedProperty("carryoutplancd");
        _carryoutplancd = carryoutplancd;
    }

    /**
     * [get] ShipToCd: {varchar(255)} <br>
     * 着地CD
     * @return The value of the column 'ShipToCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptocd() {
        checkSpecifiedProperty("shiptocd");
        return convertEmptyToNull(_shiptocd);
    }

    /**
     * [set] ShipToCd: {varchar(255)} <br>
     * 着地CD
     * @param shiptocd The value of the column 'ShipToCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptocd(String shiptocd) {
        registerModifiedProperty("shiptocd");
        _shiptocd = shiptocd;
    }

    /**
     * [get] ShipToNm: {varchar(255)} <br>
     * 着地名称
     * @return The value of the column 'ShipToNm'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptonm() {
        checkSpecifiedProperty("shiptonm");
        return convertEmptyToNull(_shiptonm);
    }

    /**
     * [set] ShipToNm: {varchar(255)} <br>
     * 着地名称
     * @param shiptonm The value of the column 'ShipToNm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptonm(String shiptonm) {
        registerModifiedProperty("shiptonm");
        _shiptonm = shiptonm;
    }

    /**
     * [get] ReceivePlanYm: {varchar(255)} <br>
     * 受入予定日
     * @return The value of the column 'ReceivePlanYm'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveplanym() {
        checkSpecifiedProperty("receiveplanym");
        return convertEmptyToNull(_receiveplanym);
    }

    /**
     * [set] ReceivePlanYm: {varchar(255)} <br>
     * 受入予定日
     * @param receiveplanym The value of the column 'ReceivePlanYm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveplanym(String receiveplanym) {
        registerModifiedProperty("receiveplanym");
        _receiveplanym = receiveplanym;
    }

    /**
     * [get] ShTypeCd: {varchar(255)} <br>
     * 輸送形態CD
     * @return The value of the column 'ShTypeCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getShtypecd() {
        checkSpecifiedProperty("shtypecd");
        return convertEmptyToNull(_shtypecd);
    }

    /**
     * [set] ShTypeCd: {varchar(255)} <br>
     * 輸送形態CD
     * @param shtypecd The value of the column 'ShTypeCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShtypecd(String shtypecd) {
        registerModifiedProperty("shtypecd");
        _shtypecd = shtypecd;
    }

    /**
     * [get] ShTypeNm: {varchar(255)} <br>
     * 輸送形態名
     * @return The value of the column 'ShTypeNm'. (NullAllowed even if selected: for no constraint)
     */
    public String getShtypenm() {
        checkSpecifiedProperty("shtypenm");
        return convertEmptyToNull(_shtypenm);
    }

    /**
     * [set] ShTypeNm: {varchar(255)} <br>
     * 輸送形態名
     * @param shtypenm The value of the column 'ShTypeNm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShtypenm(String shtypenm) {
        registerModifiedProperty("shtypenm");
        _shtypenm = shtypenm;
    }

    /**
     * [get] Refno: {varchar(255)} <br>
     * 整理番号
     * @return The value of the column 'Refno'. (NullAllowed even if selected: for no constraint)
     */
    public String getRefno() {
        checkSpecifiedProperty("refno");
        return convertEmptyToNull(_refno);
    }

    /**
     * [set] Refno: {varchar(255)} <br>
     * 整理番号
     * @param refno The value of the column 'Refno'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRefno(String refno) {
        registerModifiedProperty("refno");
        _refno = refno;
    }

    /**
     * [get] PickingComment: {varchar(255)} <br>
     * 出庫時備考
     * @return The value of the column 'PickingComment'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingcomment() {
        checkSpecifiedProperty("pickingcomment");
        return convertEmptyToNull(_pickingcomment);
    }

    /**
     * [set] PickingComment: {varchar(255)} <br>
     * 出庫時備考
     * @param pickingcomment The value of the column 'PickingComment'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingcomment(String pickingcomment) {
        registerModifiedProperty("pickingcomment");
        _pickingcomment = pickingcomment;
    }

    /**
     * [get] PhoneNo: {varchar(255)} <br>
     * 車記号
     * @return The value of the column 'PhoneNo'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhoneno() {
        checkSpecifiedProperty("phoneno");
        return convertEmptyToNull(_phoneno);
    }

    /**
     * [set] PhoneNo: {varchar(255)} <br>
     * 車記号
     * @param phoneno The value of the column 'PhoneNo'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhoneno(String phoneno) {
        registerModifiedProperty("phoneno");
        _phoneno = phoneno;
    }

    /**
     * [get] BATJMfYm: {varchar(255)} <br>
     * BATJ製造月記号
     * @return The value of the column 'BATJMfYm'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatjmfym() {
        checkSpecifiedProperty("batjmfym");
        return convertEmptyToNull(_batjmfym);
    }

    /**
     * [set] BATJMfYm: {varchar(255)} <br>
     * BATJ製造月記号
     * @param batjmfym The value of the column 'BATJMfYm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatjmfym(String batjmfym) {
        registerModifiedProperty("batjmfym");
        _batjmfym = batjmfym;
    }

    /**
     * [get] RmaNo: {varchar(255)} <br>
     * 問合番号
     * @return The value of the column 'RmaNo'. (NullAllowed even if selected: for no constraint)
     */
    public String getRmano() {
        checkSpecifiedProperty("rmano");
        return convertEmptyToNull(_rmano);
    }

    /**
     * [set] RmaNo: {varchar(255)} <br>
     * 問合番号
     * @param rmano The value of the column 'RmaNo'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRmano(String rmano) {
        registerModifiedProperty("rmano");
        _rmano = rmano;
    }

    /**
     * [get] OwnerOrderNo: {varchar(255)} <br>
     * 車割キー
     * @return The value of the column 'OwnerOrderNo'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnerorderno() {
        checkSpecifiedProperty("ownerorderno");
        return convertEmptyToNull(_ownerorderno);
    }

    /**
     * [set] OwnerOrderNo: {varchar(255)} <br>
     * 車割キー
     * @param ownerorderno The value of the column 'OwnerOrderNo'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnerorderno(String ownerorderno) {
        registerModifiedProperty("ownerorderno");
        _ownerorderno = ownerorderno;
    }

    /**
     * [get] PalletNo: {varchar(255)} <br>
     * パレット番号
     * @return The value of the column 'PalletNo'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletno() {
        checkSpecifiedProperty("palletno");
        return convertEmptyToNull(_palletno);
    }

    /**
     * [set] PalletNo: {varchar(255)} <br>
     * パレット番号
     * @param palletno The value of the column 'PalletNo'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletno(String palletno) {
        registerModifiedProperty("palletno");
        _palletno = palletno;
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
     * [get] DesignCd: {varchar(255)} <br>
     * デザイン区分
     * @return The value of the column 'DesignCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncd() {
        checkSpecifiedProperty("designcd");
        return convertEmptyToNull(_designcd);
    }

    /**
     * [set] DesignCd: {varchar(255)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DesignCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncd(String designcd) {
        registerModifiedProperty("designcd");
        _designcd = designcd;
    }

    /**
     * [get] ManufactureYm: {varchar(255)} <br>
     * 製造年月
     * @return The value of the column 'ManufactureYm'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufactureym() {
        checkSpecifiedProperty("manufactureym");
        return convertEmptyToNull(_manufactureym);
    }

    /**
     * [set] ManufactureYm: {varchar(255)} <br>
     * 製造年月
     * @param manufactureym The value of the column 'ManufactureYm'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufactureym(String manufactureym) {
        registerModifiedProperty("manufactureym");
        _manufactureym = manufactureym;
    }

    /**
     * [get] FirmcarryNo: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'FirmcarryNo'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirmcarryno() {
        checkSpecifiedProperty("firmcarryno");
        return convertEmptyToNull(_firmcarryno);
    }

    /**
     * [set] FirmcarryNo: {varchar(255)} <br>
     * 商社搬入番号
     * @param firmcarryno The value of the column 'FirmcarryNo'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirmcarryno(String firmcarryno) {
        registerModifiedProperty("firmcarryno");
        _firmcarryno = firmcarryno;
    }

    /**
     * [get] Qty: {varchar(255)} <br>
     * 個数（個装）
     * @return The value of the column 'Qty'. (NullAllowed even if selected: for no constraint)
     */
    public String getQty() {
        checkSpecifiedProperty("qty");
        return convertEmptyToNull(_qty);
    }

    /**
     * [set] Qty: {varchar(255)} <br>
     * 個数（個装）
     * @param qty The value of the column 'Qty'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty(String qty) {
        registerModifiedProperty("qty");
        _qty = qty;
    }

    /**
     * [get] InOutKbn: {varchar(255)} <br>
     * 出庫時外貨・内貨区分
     * @return The value of the column 'InOutKbn'. (NullAllowed even if selected: for no constraint)
     */
    public String getInoutkbn() {
        checkSpecifiedProperty("inoutkbn");
        return convertEmptyToNull(_inoutkbn);
    }

    /**
     * [set] InOutKbn: {varchar(255)} <br>
     * 出庫時外貨・内貨区分
     * @param inoutkbn The value of the column 'InOutKbn'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInoutkbn(String inoutkbn) {
        registerModifiedProperty("inoutkbn");
        _inoutkbn = inoutkbn;
    }

    /**
     * [get] StockType: {varchar(255)} <br>
     * 在庫区分
     * @return The value of the column 'StockType'. (NullAllowed even if selected: for no constraint)
     */
    public String getStocktype() {
        checkSpecifiedProperty("stocktype");
        return convertEmptyToNull(_stocktype);
    }

    /**
     * [set] StockType: {varchar(255)} <br>
     * 在庫区分
     * @param stocktype The value of the column 'StockType'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStocktype(String stocktype) {
        registerModifiedProperty("stocktype");
        _stocktype = stocktype;
    }

    /**
     * [get] CustomsReleaseDate: {varchar(255)} <br>
     * 通関日
     * @return The value of the column 'CustomsReleaseDate'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomsreleasedate() {
        checkSpecifiedProperty("customsreleasedate");
        return convertEmptyToNull(_customsreleasedate);
    }

    /**
     * [set] CustomsReleaseDate: {varchar(255)} <br>
     * 通関日
     * @param customsreleasedate The value of the column 'CustomsReleaseDate'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomsreleasedate(String customsreleasedate) {
        registerModifiedProperty("customsreleasedate");
        _customsreleasedate = customsreleasedate;
    }

    /**
     * [get] SupplierCvNo: {varchar(255)} <br>
     * 保税管理番号
     * @return The value of the column 'SupplierCvNo'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuppliercvno() {
        checkSpecifiedProperty("suppliercvno");
        return convertEmptyToNull(_suppliercvno);
    }

    /**
     * [set] SupplierCvNo: {varchar(255)} <br>
     * 保税管理番号
     * @param suppliercvno The value of the column 'SupplierCvNo'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuppliercvno(String suppliercvno) {
        registerModifiedProperty("suppliercvno");
        _suppliercvno = suppliercvno;
    }

    /**
     * [get] IfItemCd: {varchar(255)} <br>
     * 需給CD
     * @return The value of the column 'IfItemCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfitemcd() {
        checkSpecifiedProperty("ifitemcd");
        return convertEmptyToNull(_ifitemcd);
    }

    /**
     * [set] IfItemCd: {varchar(255)} <br>
     * 需給CD
     * @param ifitemcd The value of the column 'IfItemCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfitemcd(String ifitemcd) {
        registerModifiedProperty("ifitemcd");
        _ifitemcd = ifitemcd;
    }

    /**
     * [get] SendFlg: {varchar(255)} <br>
     * 送信済フラグ
     * @return The value of the column 'SendFlg'. (NullAllowed even if selected: for no constraint)
     */
    public String getSendflg() {
        checkSpecifiedProperty("sendflg");
        return convertEmptyToNull(_sendflg);
    }

    /**
     * [set] SendFlg: {varchar(255)} <br>
     * 送信済フラグ
     * @param sendflg The value of the column 'SendFlg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendflg(String sendflg) {
        registerModifiedProperty("sendflg");
        _sendflg = sendflg;
    }

    /**
     * [get] PalletOrder: {varchar(255)} <br>
     * パレタイズ順
     * @return The value of the column 'PalletOrder'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletorder() {
        checkSpecifiedProperty("palletorder");
        return convertEmptyToNull(_palletorder);
    }

    /**
     * [set] PalletOrder: {varchar(255)} <br>
     * パレタイズ順
     * @param palletorder The value of the column 'PalletOrder'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletorder(String palletorder) {
        registerModifiedProperty("palletorder");
        _palletorder = palletorder;
    }

    /**
     * [get] PalletType: {varchar(255)} <br>
     * パレット種別
     * @return The value of the column 'PalletType'. (NullAllowed even if selected: for no constraint)
     */
    public String getPallettype() {
        checkSpecifiedProperty("pallettype");
        return convertEmptyToNull(_pallettype);
    }

    /**
     * [set] PalletType: {varchar(255)} <br>
     * パレット種別
     * @param pallettype The value of the column 'PalletType'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPallettype(String pallettype) {
        registerModifiedProperty("pallettype");
        _pallettype = pallettype;
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
