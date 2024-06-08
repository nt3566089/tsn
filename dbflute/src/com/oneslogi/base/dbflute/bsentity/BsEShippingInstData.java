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
 * The entity of E_SHIPPING_INST_DATA as TABLE. <br>
 * 出荷指図情報受信テーブル
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_DATA_ID
 *
 * [column]
 *     SHIPPING_INST_DATA_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, INSTRUCTIONS_DATE, OWNER_DIRECT_NO, SALES_TYPE, SHIPTO_CODE, PRODUCT_CD, EXPECT_QTY, UNIT_PRICE, PLAN_PRICE_TOTAL, PLAN_NAME, PLANPOST, PLAN_ADRESS1, PLAN_ADRESS2, PLAN_PRODUCT_NAME, WAREHOUSE_PLANT, WAREHOUSE_PLANT_NAME, ORDER_DATE, DELIVERY_DATE, PURCHASE_NO, ORDER_NUMBER, ITEM_LINE_NO, SKU_CODE, CARDBOARD, CARTON, TOTAL_QTY, NOTE, RESERVE2, RESERVE3, RESERVE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_DATA_ID
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
 * Long shippingInstDataId = entity.getShippingInstDataId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String instructionsDate = entity.getInstructionsDate();
 * String ownerDirectNo = entity.getOwnerDirectNo();
 * String salesType = entity.getSalesType();
 * String shiptoCode = entity.getShiptoCode();
 * String productCd = entity.getProductCd();
 * String expectQty = entity.getExpectQty();
 * String unitPrice = entity.getUnitPrice();
 * String planPriceTotal = entity.getPlanPriceTotal();
 * String planName = entity.getPlanName();
 * String planpost = entity.getPlanpost();
 * String planAdress1 = entity.getPlanAdress1();
 * String planAdress2 = entity.getPlanAdress2();
 * String planProductName = entity.getPlanProductName();
 * String warehousePlant = entity.getWarehousePlant();
 * String warehousePlantName = entity.getWarehousePlantName();
 * String orderDate = entity.getOrderDate();
 * String deliveryDate = entity.getDeliveryDate();
 * String purchaseNo = entity.getPurchaseNo();
 * String orderNumber = entity.getOrderNumber();
 * String itemLineNo = entity.getItemLineNo();
 * String skuCode = entity.getSkuCode();
 * String cardboard = entity.getCardboard();
 * String carton = entity.getCarton();
 * String totalQty = entity.getTotalQty();
 * String note = entity.getNote();
 * String reserve2 = entity.getReserve2();
 * String reserve3 = entity.getReserve3();
 * String reserve = entity.getReserve();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShippingInstDataId(shippingInstDataId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setInstructionsDate(instructionsDate);
 * entity.setOwnerDirectNo(ownerDirectNo);
 * entity.setSalesType(salesType);
 * entity.setShiptoCode(shiptoCode);
 * entity.setProductCd(productCd);
 * entity.setExpectQty(expectQty);
 * entity.setUnitPrice(unitPrice);
 * entity.setPlanPriceTotal(planPriceTotal);
 * entity.setPlanName(planName);
 * entity.setPlanpost(planpost);
 * entity.setPlanAdress1(planAdress1);
 * entity.setPlanAdress2(planAdress2);
 * entity.setPlanProductName(planProductName);
 * entity.setWarehousePlant(warehousePlant);
 * entity.setWarehousePlantName(warehousePlantName);
 * entity.setOrderDate(orderDate);
 * entity.setDeliveryDate(deliveryDate);
 * entity.setPurchaseNo(purchaseNo);
 * entity.setOrderNumber(orderNumber);
 * entity.setItemLineNo(itemLineNo);
 * entity.setSkuCode(skuCode);
 * entity.setCardboard(cardboard);
 * entity.setCarton(carton);
 * entity.setTotalQty(totalQty);
 * entity.setNote(note);
 * entity.setReserve2(reserve2);
 * entity.setReserve3(reserve3);
 * entity.setReserve(reserve);
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
public abstract class BsEShippingInstData extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _shippingInstDataId;

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

    /** INSTRUCTIONS_DATE: {varchar(255)} */
    protected String _instructionsDate;

    /** OWNER_DIRECT_NO: {varchar(255)} */
    protected String _ownerDirectNo;

    /** SALES_TYPE: {varchar(255)} */
    protected String _salesType;

    /** SHIPTO_CODE: {varchar(255)} */
    protected String _shiptoCode;

    /** PRODUCT_CD: {varchar(255)} */
    protected String _productCd;

    /** EXPECT_QTY: {varchar(255)} */
    protected String _expectQty;

    /** UNIT_PRICE: {varchar(255)} */
    protected String _unitPrice;

    /** PLAN_PRICE_TOTAL: {varchar(255)} */
    protected String _planPriceTotal;

    /** PLAN_NAME: {varchar(255)} */
    protected String _planName;

    /** PLANPOST: {varchar(255)} */
    protected String _planpost;

    /** PLAN_ADRESS1: {varchar(255)} */
    protected String _planAdress1;

    /** PLAN_ADRESS2: {varchar(255)} */
    protected String _planAdress2;

    /** PLAN_PRODUCT_NAME: {varchar(255)} */
    protected String _planProductName;

    /** WAREHOUSE_PLANT: {varchar(255)} */
    protected String _warehousePlant;

    /** WAREHOUSE_PLANT_NAME: {varchar(255)} */
    protected String _warehousePlantName;

    /** ORDER_DATE: {varchar(255)} */
    protected String _orderDate;

    /** DELIVERY_DATE: {varchar(255)} */
    protected String _deliveryDate;

    /** PURCHASE_NO: {varchar(255)} */
    protected String _purchaseNo;

    /** ORDER_NUMBER: {varchar(255)} */
    protected String _orderNumber;

    /** ITEM_LINE_NO: {varchar(255)} */
    protected String _itemLineNo;

    /** SKU_CODE: {varchar(255)} */
    protected String _skuCode;

    /** CARDBOARD: {varchar(255)} */
    protected String _cardboard;

    /** CARTON: {varchar(255)} */
    protected String _carton;

    /** TOTAL_QTY: {varchar(255)} */
    protected String _totalQty;

    /** NOTE: {varchar(255)} */
    protected String _note;

    /** RESERVE2: {varchar(255)} */
    protected String _reserve2;

    /** RESERVE3: {varchar(255)} */
    protected String _reserve3;

    /** RESERVE: {varchar(255)} */
    protected String _reserve;

    /** DEL_FLG: {char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {bigint(19), default=[(0)]} */
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
        return "E_SHIPPING_INST_DATA";
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
        if (_shippingInstDataId == null) { return false; }
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
     * DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
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
        if (obj instanceof BsEShippingInstData) {
            BsEShippingInstData other = (BsEShippingInstData)obj;
            if (!xSV(_shippingInstDataId, other._shippingInstDataId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingInstDataId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingInstDataId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_instructionsDate));
        sb.append(dm).append(xfND(_ownerDirectNo));
        sb.append(dm).append(xfND(_salesType));
        sb.append(dm).append(xfND(_shiptoCode));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_expectQty));
        sb.append(dm).append(xfND(_unitPrice));
        sb.append(dm).append(xfND(_planPriceTotal));
        sb.append(dm).append(xfND(_planName));
        sb.append(dm).append(xfND(_planpost));
        sb.append(dm).append(xfND(_planAdress1));
        sb.append(dm).append(xfND(_planAdress2));
        sb.append(dm).append(xfND(_planProductName));
        sb.append(dm).append(xfND(_warehousePlant));
        sb.append(dm).append(xfND(_warehousePlantName));
        sb.append(dm).append(xfND(_orderDate));
        sb.append(dm).append(xfND(_deliveryDate));
        sb.append(dm).append(xfND(_purchaseNo));
        sb.append(dm).append(xfND(_orderNumber));
        sb.append(dm).append(xfND(_itemLineNo));
        sb.append(dm).append(xfND(_skuCode));
        sb.append(dm).append(xfND(_cardboard));
        sb.append(dm).append(xfND(_carton));
        sb.append(dm).append(xfND(_totalQty));
        sb.append(dm).append(xfND(_note));
        sb.append(dm).append(xfND(_reserve2));
        sb.append(dm).append(xfND(_reserve3));
        sb.append(dm).append(xfND(_reserve));
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
    public EShippingInstData clone() {
        return (EShippingInstData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出荷指図情報受信ID
     * @return The value of the column 'SHIPPING_INST_DATA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInstDataId() {
        checkSpecifiedProperty("shippingInstDataId");
        return _shippingInstDataId;
    }

    /**
     * [set] SHIPPING_INST_DATA_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出荷指図情報受信ID
     * @param shippingInstDataId The value of the column 'SHIPPING_INST_DATA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInstDataId(Long shippingInstDataId) {
        registerModifiedProperty("shippingInstDataId");
        _shippingInstDataId = shippingInstDataId;
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
     * [get] INSTRUCTIONS_DATE: {varchar(255)} <br>
     * 指図日
     * @return The value of the column 'INSTRUCTIONS_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInstructionsDate() {
        checkSpecifiedProperty("instructionsDate");
        return convertEmptyToNull(_instructionsDate);
    }

    /**
     * [set] INSTRUCTIONS_DATE: {varchar(255)} <br>
     * 指図日
     * @param instructionsDate The value of the column 'INSTRUCTIONS_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInstructionsDate(String instructionsDate) {
        registerModifiedProperty("instructionsDate");
        _instructionsDate = instructionsDate;
    }

    /**
     * [get] OWNER_DIRECT_NO: {varchar(255)} <br>
     * 出荷伝票番号
     * @return The value of the column 'OWNER_DIRECT_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnerDirectNo() {
        checkSpecifiedProperty("ownerDirectNo");
        return convertEmptyToNull(_ownerDirectNo);
    }

    /**
     * [set] OWNER_DIRECT_NO: {varchar(255)} <br>
     * 出荷伝票番号
     * @param ownerDirectNo The value of the column 'OWNER_DIRECT_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnerDirectNo(String ownerDirectNo) {
        registerModifiedProperty("ownerDirectNo");
        _ownerDirectNo = ownerDirectNo;
    }

    /**
     * [get] SALES_TYPE: {varchar(255)} <br>
     * 売上種別
     * @return The value of the column 'SALES_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesType() {
        checkSpecifiedProperty("salesType");
        return convertEmptyToNull(_salesType);
    }

    /**
     * [set] SALES_TYPE: {varchar(255)} <br>
     * 売上種別
     * @param salesType The value of the column 'SALES_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesType(String salesType) {
        registerModifiedProperty("salesType");
        _salesType = salesType;
    }

    /**
     * [get] SHIPTO_CODE: {varchar(255)} <br>
     * 出荷先コード
     * @return The value of the column 'SHIPTO_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptoCode() {
        checkSpecifiedProperty("shiptoCode");
        return convertEmptyToNull(_shiptoCode);
    }

    /**
     * [set] SHIPTO_CODE: {varchar(255)} <br>
     * 出荷先コード
     * @param shiptoCode The value of the column 'SHIPTO_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptoCode(String shiptoCode) {
        registerModifiedProperty("shiptoCode");
        _shiptoCode = shiptoCode;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄コード
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄コード
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] EXPECT_QTY: {varchar(255)} <br>
     * 受注数量
     * @return The value of the column 'EXPECT_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getExpectQty() {
        checkSpecifiedProperty("expectQty");
        return convertEmptyToNull(_expectQty);
    }

    /**
     * [set] EXPECT_QTY: {varchar(255)} <br>
     * 受注数量
     * @param expectQty The value of the column 'EXPECT_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectQty(String expectQty) {
        registerModifiedProperty("expectQty");
        _expectQty = expectQty;
    }

    /**
     * [get] UNIT_PRICE: {varchar(255)} <br>
     * 単価
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitPrice() {
        checkSpecifiedProperty("unitPrice");
        return convertEmptyToNull(_unitPrice);
    }

    /**
     * [set] UNIT_PRICE: {varchar(255)} <br>
     * 単価
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitPrice(String unitPrice) {
        registerModifiedProperty("unitPrice");
        _unitPrice = unitPrice;
    }

    /**
     * [get] PLAN_PRICE_TOTAL: {varchar(255)} <br>
     * 売上金額
     * @return The value of the column 'PLAN_PRICE_TOTAL'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanPriceTotal() {
        checkSpecifiedProperty("planPriceTotal");
        return convertEmptyToNull(_planPriceTotal);
    }

    /**
     * [set] PLAN_PRICE_TOTAL: {varchar(255)} <br>
     * 売上金額
     * @param planPriceTotal The value of the column 'PLAN_PRICE_TOTAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanPriceTotal(String planPriceTotal) {
        registerModifiedProperty("planPriceTotal");
        _planPriceTotal = planPriceTotal;
    }

    /**
     * [get] PLAN_NAME: {varchar(255)} <br>
     * 出荷先名称
     * @return The value of the column 'PLAN_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanName() {
        checkSpecifiedProperty("planName");
        return convertEmptyToNull(_planName);
    }

    /**
     * [set] PLAN_NAME: {varchar(255)} <br>
     * 出荷先名称
     * @param planName The value of the column 'PLAN_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanName(String planName) {
        registerModifiedProperty("planName");
        _planName = planName;
    }

    /**
     * [get] PLANPOST: {varchar(255)} <br>
     * 出荷先郵便番号
     * @return The value of the column 'PLANPOST'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanpost() {
        checkSpecifiedProperty("planpost");
        return convertEmptyToNull(_planpost);
    }

    /**
     * [set] PLANPOST: {varchar(255)} <br>
     * 出荷先郵便番号
     * @param planpost The value of the column 'PLANPOST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanpost(String planpost) {
        registerModifiedProperty("planpost");
        _planpost = planpost;
    }

    /**
     * [get] PLAN_ADRESS1: {varchar(255)} <br>
     * 出荷先住所1
     * @return The value of the column 'PLAN_ADRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanAdress1() {
        checkSpecifiedProperty("planAdress1");
        return convertEmptyToNull(_planAdress1);
    }

    /**
     * [set] PLAN_ADRESS1: {varchar(255)} <br>
     * 出荷先住所1
     * @param planAdress1 The value of the column 'PLAN_ADRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanAdress1(String planAdress1) {
        registerModifiedProperty("planAdress1");
        _planAdress1 = planAdress1;
    }

    /**
     * [get] PLAN_ADRESS2: {varchar(255)} <br>
     * 出荷先住所2
     * @return The value of the column 'PLAN_ADRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanAdress2() {
        checkSpecifiedProperty("planAdress2");
        return convertEmptyToNull(_planAdress2);
    }

    /**
     * [set] PLAN_ADRESS2: {varchar(255)} <br>
     * 出荷先住所2
     * @param planAdress2 The value of the column 'PLAN_ADRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanAdress2(String planAdress2) {
        registerModifiedProperty("planAdress2");
        _planAdress2 = planAdress2;
    }

    /**
     * [get] PLAN_PRODUCT_NAME: {varchar(255)} <br>
     * 銘柄テキスト
     * @return The value of the column 'PLAN_PRODUCT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanProductName() {
        checkSpecifiedProperty("planProductName");
        return convertEmptyToNull(_planProductName);
    }

    /**
     * [set] PLAN_PRODUCT_NAME: {varchar(255)} <br>
     * 銘柄テキスト
     * @param planProductName The value of the column 'PLAN_PRODUCT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanProductName(String planProductName) {
        registerModifiedProperty("planProductName");
        _planProductName = planProductName;
    }

    /**
     * [get] WAREHOUSE_PLANT: {varchar(255)} <br>
     * 出荷プラント
     * @return The value of the column 'WAREHOUSE_PLANT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousePlant() {
        checkSpecifiedProperty("warehousePlant");
        return convertEmptyToNull(_warehousePlant);
    }

    /**
     * [set] WAREHOUSE_PLANT: {varchar(255)} <br>
     * 出荷プラント
     * @param warehousePlant The value of the column 'WAREHOUSE_PLANT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousePlant(String warehousePlant) {
        registerModifiedProperty("warehousePlant");
        _warehousePlant = warehousePlant;
    }

    /**
     * [get] WAREHOUSE_PLANT_NAME: {varchar(255)} <br>
     * 出荷プラント名称
     * @return The value of the column 'WAREHOUSE_PLANT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousePlantName() {
        checkSpecifiedProperty("warehousePlantName");
        return convertEmptyToNull(_warehousePlantName);
    }

    /**
     * [set] WAREHOUSE_PLANT_NAME: {varchar(255)} <br>
     * 出荷プラント名称
     * @param warehousePlantName The value of the column 'WAREHOUSE_PLANT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousePlantName(String warehousePlantName) {
        registerModifiedProperty("warehousePlantName");
        _warehousePlantName = warehousePlantName;
    }

    /**
     * [get] ORDER_DATE: {varchar(255)} <br>
     * 受注日
     * @return The value of the column 'ORDER_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderDate() {
        checkSpecifiedProperty("orderDate");
        return convertEmptyToNull(_orderDate);
    }

    /**
     * [set] ORDER_DATE: {varchar(255)} <br>
     * 受注日
     * @param orderDate The value of the column 'ORDER_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderDate(String orderDate) {
        registerModifiedProperty("orderDate");
        _orderDate = orderDate;
    }

    /**
     * [get] DELIVERY_DATE: {varchar(255)} <br>
     * 納品日
     * @return The value of the column 'DELIVERY_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryDate() {
        checkSpecifiedProperty("deliveryDate");
        return convertEmptyToNull(_deliveryDate);
    }

    /**
     * [set] DELIVERY_DATE: {varchar(255)} <br>
     * 納品日
     * @param deliveryDate The value of the column 'DELIVERY_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryDate(String deliveryDate) {
        registerModifiedProperty("deliveryDate");
        _deliveryDate = deliveryDate;
    }

    /**
     * [get] PURCHASE_NO: {varchar(255)} <br>
     * 発注番号
     * @return The value of the column 'PURCHASE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPurchaseNo() {
        checkSpecifiedProperty("purchaseNo");
        return convertEmptyToNull(_purchaseNo);
    }

    /**
     * [set] PURCHASE_NO: {varchar(255)} <br>
     * 発注番号
     * @param purchaseNo The value of the column 'PURCHASE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchaseNo(String purchaseNo) {
        registerModifiedProperty("purchaseNo");
        _purchaseNo = purchaseNo;
    }

    /**
     * [get] ORDER_NUMBER: {varchar(255)} <br>
     * 受注番号
     * @return The value of the column 'ORDER_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderNumber() {
        checkSpecifiedProperty("orderNumber");
        return convertEmptyToNull(_orderNumber);
    }

    /**
     * [set] ORDER_NUMBER: {varchar(255)} <br>
     * 受注番号
     * @param orderNumber The value of the column 'ORDER_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderNumber(String orderNumber) {
        registerModifiedProperty("orderNumber");
        _orderNumber = orderNumber;
    }

    /**
     * [get] ITEM_LINE_NO: {varchar(255)} <br>
     * No.
     * @return The value of the column 'ITEM_LINE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemLineNo() {
        checkSpecifiedProperty("itemLineNo");
        return convertEmptyToNull(_itemLineNo);
    }

    /**
     * [set] ITEM_LINE_NO: {varchar(255)} <br>
     * No.
     * @param itemLineNo The value of the column 'ITEM_LINE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemLineNo(String itemLineNo) {
        registerModifiedProperty("itemLineNo");
        _itemLineNo = itemLineNo;
    }

    /**
     * [get] SKU_CODE: {varchar(255)} <br>
     * SKU Code
     * @return The value of the column 'SKU_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSkuCode() {
        checkSpecifiedProperty("skuCode");
        return convertEmptyToNull(_skuCode);
    }

    /**
     * [set] SKU_CODE: {varchar(255)} <br>
     * SKU Code
     * @param skuCode The value of the column 'SKU_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSkuCode(String skuCode) {
        registerModifiedProperty("skuCode");
        _skuCode = skuCode;
    }

    /**
     * [get] CARDBOARD: {varchar(255)} <br>
     * 段ボール
     * @return The value of the column 'CARDBOARD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCardboard() {
        checkSpecifiedProperty("cardboard");
        return convertEmptyToNull(_cardboard);
    }

    /**
     * [set] CARDBOARD: {varchar(255)} <br>
     * 段ボール
     * @param cardboard The value of the column 'CARDBOARD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCardboard(String cardboard) {
        registerModifiedProperty("cardboard");
        _cardboard = cardboard;
    }

    /**
     * [get] CARTON: {varchar(255)} <br>
     * カートン
     * @return The value of the column 'CARTON'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarton() {
        checkSpecifiedProperty("carton");
        return convertEmptyToNull(_carton);
    }

    /**
     * [set] CARTON: {varchar(255)} <br>
     * カートン
     * @param carton The value of the column 'CARTON'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarton(String carton) {
        registerModifiedProperty("carton");
        _carton = carton;
    }

    /**
     * [get] TOTAL_QTY: {varchar(255)} <br>
     * 合計
     * @return The value of the column 'TOTAL_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getTotalQty() {
        checkSpecifiedProperty("totalQty");
        return convertEmptyToNull(_totalQty);
    }

    /**
     * [set] TOTAL_QTY: {varchar(255)} <br>
     * 合計
     * @param totalQty The value of the column 'TOTAL_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalQty(String totalQty) {
        registerModifiedProperty("totalQty");
        _totalQty = totalQty;
    }

    /**
     * [get] NOTE: {varchar(255)} <br>
     * 備考
     * @return The value of the column 'NOTE'. (NullAllowed even if selected: for no constraint)
     */
    public String getNote() {
        checkSpecifiedProperty("note");
        return convertEmptyToNull(_note);
    }

    /**
     * [set] NOTE: {varchar(255)} <br>
     * 備考
     * @param note The value of the column 'NOTE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNote(String note) {
        registerModifiedProperty("note");
        _note = note;
    }

    /**
     * [get] RESERVE2: {varchar(255)} <br>
     * 予備2
     * @return The value of the column 'RESERVE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getReserve2() {
        checkSpecifiedProperty("reserve2");
        return convertEmptyToNull(_reserve2);
    }

    /**
     * [set] RESERVE2: {varchar(255)} <br>
     * 予備2
     * @param reserve2 The value of the column 'RESERVE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReserve2(String reserve2) {
        registerModifiedProperty("reserve2");
        _reserve2 = reserve2;
    }

    /**
     * [get] RESERVE3: {varchar(255)} <br>
     * 予備3
     * @return The value of the column 'RESERVE3'. (NullAllowed even if selected: for no constraint)
     */
    public String getReserve3() {
        checkSpecifiedProperty("reserve3");
        return convertEmptyToNull(_reserve3);
    }

    /**
     * [set] RESERVE3: {varchar(255)} <br>
     * 予備3
     * @param reserve3 The value of the column 'RESERVE3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReserve3(String reserve3) {
        registerModifiedProperty("reserve3");
        _reserve3 = reserve3;
    }

    /**
     * [get] RESERVE: {varchar(255)} <br>
     * 予備
     * @return The value of the column 'RESERVE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReserve() {
        checkSpecifiedProperty("reserve");
        return convertEmptyToNull(_reserve);
    }

    /**
     * [set] RESERVE: {varchar(255)} <br>
     * 予備
     * @param reserve The value of the column 'RESERVE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReserve(String reserve) {
        registerModifiedProperty("reserve");
        _reserve = reserve;
    }

    /**
     * [get] DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
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
