package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRSORCVDIRECT as TABLE. <br>
 * 入庫/出庫依頼書印刷
 * <pre>
 * [primary-key]
 *     SOJTLINEID
 *
 * [column]
 *     SOJTLINEID, SoRcvDirectKey, InstructionsDate, OwnerDirectNo, SalesType, SalesTypeCd, ShipToCode, OriginalPONo, PRODUCT_ID, ExpectQty, PlanPrice, PlanPriceTotal, PlanName, PlanPost, PlanAddress1, PlanAddress2, PlanItemName, WareHousePlant, WareHousePlantName, WareHouseName, OrderDate, DeliveryDate, PurchaseNumber, OrderNumber, ItemLineNo, SkuCode, CardBoard, CarTon, TotalExpectQty, TotalCardBoardQty, TotalCarTonQty, Note, Reserve2, Reserve3, Reserve, CenterId, ClientId, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOJTLINEID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrsorcvdirectDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** SOJTLINEID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _sojtlineid;

    /** SoRcvDirectKey: {bigint(19)} */
    @JsonKey
    protected Long _sorcvdirectkey;

    /** InstructionsDate: {NotNull, varchar(8)} */
    @JsonKey
    protected String _instructionsdate;

    /** OwnerDirectNo: {NotNull, varchar(30)} */
    @JsonKey
    protected String _ownerdirectno;

    /** SalesType: {NotNull, varchar(30)} */
    @JsonKey
    protected String _salestype;

    /** SalesTypeCd: {NotNull, char(1)} */
    @JsonKey
    protected String _salestypecd;

    /** ShipToCode: {NotNull, varchar(30)} */
    @JsonKey
    protected String _shiptocode;

    /** OriginalPONo: {NotNull, varchar(30)} */
    @JsonKey
    protected String _originalpono;

    /** PRODUCT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** ExpectQty: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _expectqty;

    /** PlanPrice: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _planprice;

    /** PlanPriceTotal: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _planpricetotal;

    /** PlanName: {NotNull, varchar(100)} */
    @JsonKey
    protected String _planname;

    /** PlanPost: {NotNull, varchar(30)} */
    @JsonKey
    protected String _planpost;

    /** PlanAddress1: {NotNull, varchar(100)} */
    @JsonKey
    protected String _planaddress1;

    /** PlanAddress2: {NotNull, varchar(255)} */
    @JsonKey
    protected String _planaddress2;

    /** PlanItemName: {varchar(255)} */
    @JsonKey
    protected String _planitemname;

    /** WareHousePlant: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehouseplant;

    /** WareHousePlantName: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehouseplantname;

    /** WareHouseName: {NotNull, varchar(60)} */
    @JsonKey
    protected String _warehousename;

    /** OrderDate: {NotNull, varchar(8)} */
    @JsonKey
    protected String _orderdate;

    /** DeliveryDate: {varchar(8)} */
    @JsonKey
    protected String _deliverydate;

    /** PurchaseNumber: {varchar(100)} */
    @JsonKey
    protected String _purchasenumber;

    /** OrderNumber: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _ordernumber;

    /** ItemLineNo: {NotNull, varchar(30)} */
    @JsonKey
    protected String _itemlineno;

    /** SkuCode: {NotNull, varchar(30)} */
    @JsonKey
    protected String _skucode;

    /** CardBoard: {bigint(19)} */
    @JsonKey
    protected Long _cardboard;

    /** CarTon: {bigint(19)} */
    @JsonKey
    protected Long _carton;

    /** TotalExpectQty: {bigint(19)} */
    @JsonKey
    protected Long _totalexpectqty;

    /** TotalCardBoardQty: {bigint(19)} */
    @JsonKey
    protected Long _totalcardboardqty;

    /** TotalCarTonQty: {bigint(19)} */
    @JsonKey
    protected Long _totalcartonqty;

    /** Note: {varchar(4000)} */
    @JsonKey
    protected String _note;

    /** Reserve2: {varchar(255)} */
    @JsonKey
    protected String _reserve2;

    /** Reserve3: {varchar(255)} */
    @JsonKey
    protected String _reserve3;

    /** Reserve: {varchar(255)} */
    @JsonKey
    protected String _reserve;

    /** CenterId: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerid;

    /** ClientId: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientid;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrsorcvdirectDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrsorcvdirectDto)) { return false; }
        final BsTTrsorcvdirectDto otherEntity = (BsTTrsorcvdirectDto)other;
        if (!helpComparingValue(getSojtlineid(), otherEntity.getSojtlineid())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSORCVDIRECT");
        result = xCH(result, getSojtlineid());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getSojtlineid());
        sb.append(c).append(getSorcvdirectkey());
        sb.append(c).append(getInstructionsdate());
        sb.append(c).append(getOwnerdirectno());
        sb.append(c).append(getSalestype());
        sb.append(c).append(getSalestypecd());
        sb.append(c).append(getShiptocode());
        sb.append(c).append(getOriginalpono());
        sb.append(c).append(getProductId());
        sb.append(c).append(getExpectqty());
        sb.append(c).append(getPlanprice());
        sb.append(c).append(getPlanpricetotal());
        sb.append(c).append(getPlanname());
        sb.append(c).append(getPlanpost());
        sb.append(c).append(getPlanaddress1());
        sb.append(c).append(getPlanaddress2());
        sb.append(c).append(getPlanitemname());
        sb.append(c).append(getWarehouseplant());
        sb.append(c).append(getWarehouseplantname());
        sb.append(c).append(getWarehousename());
        sb.append(c).append(getOrderdate());
        sb.append(c).append(getDeliverydate());
        sb.append(c).append(getPurchasenumber());
        sb.append(c).append(getOrdernumber());
        sb.append(c).append(getItemlineno());
        sb.append(c).append(getSkucode());
        sb.append(c).append(getCardboard());
        sb.append(c).append(getCarton());
        sb.append(c).append(getTotalexpectqty());
        sb.append(c).append(getTotalcardboardqty());
        sb.append(c).append(getTotalcartonqty());
        sb.append(c).append(getNote());
        sb.append(c).append(getReserve2());
        sb.append(c).append(getReserve3());
        sb.append(c).append(getReserve());
        sb.append(c).append(getCenterid());
        sb.append(c).append(getClientid());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SOJTLINEID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫/出庫依頼書印刷ID
     * @return The value of the column 'SOJTLINEID'. (NullAllowed)
     */
    public Long getSojtlineid() {
        return _sojtlineid;
    }

    /**
     * [set] SOJTLINEID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫/出庫依頼書印刷ID
     * @param sojtlineid The value of the column 'SOJTLINEID'. (NullAllowed)
     */
    public void setSojtlineid(Long sojtlineid) {
        __modifiedProperties.add("sojtlineid");
        this._sojtlineid = sojtlineid;
    }

    /**
     * [get] SoRcvDirectKey: {bigint(19)} <br>
     * 入庫/出庫依頼書印刷Key
     * @return The value of the column 'SoRcvDirectKey'. (NullAllowed)
     */
    public Long getSorcvdirectkey() {
        return _sorcvdirectkey;
    }

    /**
     * [set] SoRcvDirectKey: {bigint(19)} <br>
     * 入庫/出庫依頼書印刷Key
     * @param sorcvdirectkey The value of the column 'SoRcvDirectKey'. (NullAllowed)
     */
    public void setSorcvdirectkey(Long sorcvdirectkey) {
        __modifiedProperties.add("sorcvdirectkey");
        this._sorcvdirectkey = sorcvdirectkey;
    }

    /**
     * [get] InstructionsDate: {NotNull, varchar(8)} <br>
     * 指図日
     * @return The value of the column 'InstructionsDate'. (NullAllowed)
     */
    public String getInstructionsdate() {
        return _instructionsdate;
    }

    /**
     * [set] InstructionsDate: {NotNull, varchar(8)} <br>
     * 指図日
     * @param instructionsdate The value of the column 'InstructionsDate'. (NullAllowed)
     */
    public void setInstructionsdate(String instructionsdate) {
        __modifiedProperties.add("instructionsdate");
        this._instructionsdate = instructionsdate;
    }

    /**
     * [get] OwnerDirectNo: {NotNull, varchar(30)} <br>
     * 出庫伝票番号
     * @return The value of the column 'OwnerDirectNo'. (NullAllowed)
     */
    public String getOwnerdirectno() {
        return _ownerdirectno;
    }

    /**
     * [set] OwnerDirectNo: {NotNull, varchar(30)} <br>
     * 出庫伝票番号
     * @param ownerdirectno The value of the column 'OwnerDirectNo'. (NullAllowed)
     */
    public void setOwnerdirectno(String ownerdirectno) {
        __modifiedProperties.add("ownerdirectno");
        this._ownerdirectno = ownerdirectno;
    }

    /**
     * [get] SalesType: {NotNull, varchar(30)} <br>
     * 売上種別
     * @return The value of the column 'SalesType'. (NullAllowed)
     */
    public String getSalestype() {
        return _salestype;
    }

    /**
     * [set] SalesType: {NotNull, varchar(30)} <br>
     * 売上種別
     * @param salestype The value of the column 'SalesType'. (NullAllowed)
     */
    public void setSalestype(String salestype) {
        __modifiedProperties.add("salestype");
        this._salestype = salestype;
    }

    /**
     * [get] SalesTypeCd: {NotNull, char(1)} <br>
     * 売上種別（CD）
     * @return The value of the column 'SalesTypeCd'. (NullAllowed)
     */
    public String getSalestypecd() {
        return _salestypecd;
    }

    /**
     * [set] SalesTypeCd: {NotNull, char(1)} <br>
     * 売上種別（CD）
     * @param salestypecd The value of the column 'SalesTypeCd'. (NullAllowed)
     */
    public void setSalestypecd(String salestypecd) {
        __modifiedProperties.add("salestypecd");
        this._salestypecd = salestypecd;
    }

    /**
     * [get] ShipToCode: {NotNull, varchar(30)} <br>
     * 出庫先CD
     * @return The value of the column 'ShipToCode'. (NullAllowed)
     */
    public String getShiptocode() {
        return _shiptocode;
    }

    /**
     * [set] ShipToCode: {NotNull, varchar(30)} <br>
     * 出庫先CD
     * @param shiptocode The value of the column 'ShipToCode'. (NullAllowed)
     */
    public void setShiptocode(String shiptocode) {
        __modifiedProperties.add("shiptocode");
        this._shiptocode = shiptocode;
    }

    /**
     * [get] OriginalPONo: {NotNull, varchar(30)} <br>
     * 特約店CD
     * @return The value of the column 'OriginalPONo'. (NullAllowed)
     */
    public String getOriginalpono() {
        return _originalpono;
    }

    /**
     * [set] OriginalPONo: {NotNull, varchar(30)} <br>
     * 特約店CD
     * @param originalpono The value of the column 'OriginalPONo'. (NullAllowed)
     */
    public void setOriginalpono(String originalpono) {
        __modifiedProperties.add("originalpono");
        this._originalpono = originalpono;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] ExpectQty: {NotNull, bigint(19)} <br>
     * 受注数量
     * @return The value of the column 'ExpectQty'. (NullAllowed)
     */
    public Long getExpectqty() {
        return _expectqty;
    }

    /**
     * [set] ExpectQty: {NotNull, bigint(19)} <br>
     * 受注数量
     * @param expectqty The value of the column 'ExpectQty'. (NullAllowed)
     */
    public void setExpectqty(Long expectqty) {
        __modifiedProperties.add("expectqty");
        this._expectqty = expectqty;
    }

    /**
     * [get] PlanPrice: {NotNull, bigint(19)} <br>
     * 単価
     * @return The value of the column 'PlanPrice'. (NullAllowed)
     */
    public Long getPlanprice() {
        return _planprice;
    }

    /**
     * [set] PlanPrice: {NotNull, bigint(19)} <br>
     * 単価
     * @param planprice The value of the column 'PlanPrice'. (NullAllowed)
     */
    public void setPlanprice(Long planprice) {
        __modifiedProperties.add("planprice");
        this._planprice = planprice;
    }

    /**
     * [get] PlanPriceTotal: {NotNull, bigint(19)} <br>
     * 売上金額
     * @return The value of the column 'PlanPriceTotal'. (NullAllowed)
     */
    public Long getPlanpricetotal() {
        return _planpricetotal;
    }

    /**
     * [set] PlanPriceTotal: {NotNull, bigint(19)} <br>
     * 売上金額
     * @param planpricetotal The value of the column 'PlanPriceTotal'. (NullAllowed)
     */
    public void setPlanpricetotal(Long planpricetotal) {
        __modifiedProperties.add("planpricetotal");
        this._planpricetotal = planpricetotal;
    }

    /**
     * [get] PlanName: {NotNull, varchar(100)} <br>
     * 出庫先名称
     * @return The value of the column 'PlanName'. (NullAllowed)
     */
    public String getPlanname() {
        return _planname;
    }

    /**
     * [set] PlanName: {NotNull, varchar(100)} <br>
     * 出庫先名称
     * @param planname The value of the column 'PlanName'. (NullAllowed)
     */
    public void setPlanname(String planname) {
        __modifiedProperties.add("planname");
        this._planname = planname;
    }

    /**
     * [get] PlanPost: {NotNull, varchar(30)} <br>
     * 出庫先郵便番号
     * @return The value of the column 'PlanPost'. (NullAllowed)
     */
    public String getPlanpost() {
        return _planpost;
    }

    /**
     * [set] PlanPost: {NotNull, varchar(30)} <br>
     * 出庫先郵便番号
     * @param planpost The value of the column 'PlanPost'. (NullAllowed)
     */
    public void setPlanpost(String planpost) {
        __modifiedProperties.add("planpost");
        this._planpost = planpost;
    }

    /**
     * [get] PlanAddress1: {NotNull, varchar(100)} <br>
     * 出庫先住所1
     * @return The value of the column 'PlanAddress1'. (NullAllowed)
     */
    public String getPlanaddress1() {
        return _planaddress1;
    }

    /**
     * [set] PlanAddress1: {NotNull, varchar(100)} <br>
     * 出庫先住所1
     * @param planaddress1 The value of the column 'PlanAddress1'. (NullAllowed)
     */
    public void setPlanaddress1(String planaddress1) {
        __modifiedProperties.add("planaddress1");
        this._planaddress1 = planaddress1;
    }

    /**
     * [get] PlanAddress2: {NotNull, varchar(255)} <br>
     * 出庫先住所2
     * @return The value of the column 'PlanAddress2'. (NullAllowed)
     */
    public String getPlanaddress2() {
        return _planaddress2;
    }

    /**
     * [set] PlanAddress2: {NotNull, varchar(255)} <br>
     * 出庫先住所2
     * @param planaddress2 The value of the column 'PlanAddress2'. (NullAllowed)
     */
    public void setPlanaddress2(String planaddress2) {
        __modifiedProperties.add("planaddress2");
        this._planaddress2 = planaddress2;
    }

    /**
     * [get] PlanItemName: {varchar(255)} <br>
     * 銘柄テキスト
     * @return The value of the column 'PlanItemName'. (NullAllowed)
     */
    public String getPlanitemname() {
        return _planitemname;
    }

    /**
     * [set] PlanItemName: {varchar(255)} <br>
     * 銘柄テキスト
     * @param planitemname The value of the column 'PlanItemName'. (NullAllowed)
     */
    public void setPlanitemname(String planitemname) {
        __modifiedProperties.add("planitemname");
        this._planitemname = planitemname;
    }

    /**
     * [get] WareHousePlant: {NotNull, varchar(30)} <br>
     * 出庫プラント
     * @return The value of the column 'WareHousePlant'. (NullAllowed)
     */
    public String getWarehouseplant() {
        return _warehouseplant;
    }

    /**
     * [set] WareHousePlant: {NotNull, varchar(30)} <br>
     * 出庫プラント
     * @param warehouseplant The value of the column 'WareHousePlant'. (NullAllowed)
     */
    public void setWarehouseplant(String warehouseplant) {
        __modifiedProperties.add("warehouseplant");
        this._warehouseplant = warehouseplant;
    }

    /**
     * [get] WareHousePlantName: {NotNull, varchar(30)} <br>
     * 出庫プラント名称
     * @return The value of the column 'WareHousePlantName'. (NullAllowed)
     */
    public String getWarehouseplantname() {
        return _warehouseplantname;
    }

    /**
     * [set] WareHousePlantName: {NotNull, varchar(30)} <br>
     * 出庫プラント名称
     * @param warehouseplantname The value of the column 'WareHousePlantName'. (NullAllowed)
     */
    public void setWarehouseplantname(String warehouseplantname) {
        __modifiedProperties.add("warehouseplantname");
        this._warehouseplantname = warehouseplantname;
    }

    /**
     * [get] WareHouseName: {NotNull, varchar(60)} <br>
     * 倉庫名
     * @return The value of the column 'WareHouseName'. (NullAllowed)
     */
    public String getWarehousename() {
        return _warehousename;
    }

    /**
     * [set] WareHouseName: {NotNull, varchar(60)} <br>
     * 倉庫名
     * @param warehousename The value of the column 'WareHouseName'. (NullAllowed)
     */
    public void setWarehousename(String warehousename) {
        __modifiedProperties.add("warehousename");
        this._warehousename = warehousename;
    }

    /**
     * [get] OrderDate: {NotNull, varchar(8)} <br>
     * 受注日
     * @return The value of the column 'OrderDate'. (NullAllowed)
     */
    public String getOrderdate() {
        return _orderdate;
    }

    /**
     * [set] OrderDate: {NotNull, varchar(8)} <br>
     * 受注日
     * @param orderdate The value of the column 'OrderDate'. (NullAllowed)
     */
    public void setOrderdate(String orderdate) {
        __modifiedProperties.add("orderdate");
        this._orderdate = orderdate;
    }

    /**
     * [get] DeliveryDate: {varchar(8)} <br>
     * 納品日
     * @return The value of the column 'DeliveryDate'. (NullAllowed)
     */
    public String getDeliverydate() {
        return _deliverydate;
    }

    /**
     * [set] DeliveryDate: {varchar(8)} <br>
     * 納品日
     * @param deliverydate The value of the column 'DeliveryDate'. (NullAllowed)
     */
    public void setDeliverydate(String deliverydate) {
        __modifiedProperties.add("deliverydate");
        this._deliverydate = deliverydate;
    }

    /**
     * [get] PurchaseNumber: {varchar(100)} <br>
     * 発注番号
     * @return The value of the column 'PurchaseNumber'. (NullAllowed)
     */
    public String getPurchasenumber() {
        return _purchasenumber;
    }

    /**
     * [set] PurchaseNumber: {varchar(100)} <br>
     * 発注番号
     * @param purchasenumber The value of the column 'PurchaseNumber'. (NullAllowed)
     */
    public void setPurchasenumber(String purchasenumber) {
        __modifiedProperties.add("purchasenumber");
        this._purchasenumber = purchasenumber;
    }

    /**
     * [get] OrderNumber: {NotNull, bigint(19)} <br>
     * 受注番号
     * @return The value of the column 'OrderNumber'. (NullAllowed)
     */
    public Long getOrdernumber() {
        return _ordernumber;
    }

    /**
     * [set] OrderNumber: {NotNull, bigint(19)} <br>
     * 受注番号
     * @param ordernumber The value of the column 'OrderNumber'. (NullAllowed)
     */
    public void setOrdernumber(Long ordernumber) {
        __modifiedProperties.add("ordernumber");
        this._ordernumber = ordernumber;
    }

    /**
     * [get] ItemLineNo: {NotNull, varchar(30)} <br>
     * No.
     * @return The value of the column 'ItemLineNo'. (NullAllowed)
     */
    public String getItemlineno() {
        return _itemlineno;
    }

    /**
     * [set] ItemLineNo: {NotNull, varchar(30)} <br>
     * No.
     * @param itemlineno The value of the column 'ItemLineNo'. (NullAllowed)
     */
    public void setItemlineno(String itemlineno) {
        __modifiedProperties.add("itemlineno");
        this._itemlineno = itemlineno;
    }

    /**
     * [get] SkuCode: {NotNull, varchar(30)} <br>
     * SKU Code
     * @return The value of the column 'SkuCode'. (NullAllowed)
     */
    public String getSkucode() {
        return _skucode;
    }

    /**
     * [set] SkuCode: {NotNull, varchar(30)} <br>
     * SKU Code
     * @param skucode The value of the column 'SkuCode'. (NullAllowed)
     */
    public void setSkucode(String skucode) {
        __modifiedProperties.add("skucode");
        this._skucode = skucode;
    }

    /**
     * [get] CardBoard: {bigint(19)} <br>
     * 段ボール
     * @return The value of the column 'CardBoard'. (NullAllowed)
     */
    public Long getCardboard() {
        return _cardboard;
    }

    /**
     * [set] CardBoard: {bigint(19)} <br>
     * 段ボール
     * @param cardboard The value of the column 'CardBoard'. (NullAllowed)
     */
    public void setCardboard(Long cardboard) {
        __modifiedProperties.add("cardboard");
        this._cardboard = cardboard;
    }

    /**
     * [get] CarTon: {bigint(19)} <br>
     * カートン
     * @return The value of the column 'CarTon'. (NullAllowed)
     */
    public Long getCarton() {
        return _carton;
    }

    /**
     * [set] CarTon: {bigint(19)} <br>
     * カートン
     * @param carton The value of the column 'CarTon'. (NullAllowed)
     */
    public void setCarton(Long carton) {
        __modifiedProperties.add("carton");
        this._carton = carton;
    }

    /**
     * [get] TotalExpectQty: {bigint(19)} <br>
     * 合計（受注数）
     * @return The value of the column 'TotalExpectQty'. (NullAllowed)
     */
    public Long getTotalexpectqty() {
        return _totalexpectqty;
    }

    /**
     * [set] TotalExpectQty: {bigint(19)} <br>
     * 合計（受注数）
     * @param totalexpectqty The value of the column 'TotalExpectQty'. (NullAllowed)
     */
    public void setTotalexpectqty(Long totalexpectqty) {
        __modifiedProperties.add("totalexpectqty");
        this._totalexpectqty = totalexpectqty;
    }

    /**
     * [get] TotalCardBoardQty: {bigint(19)} <br>
     * 合計（段ボール）
     * @return The value of the column 'TotalCardBoardQty'. (NullAllowed)
     */
    public Long getTotalcardboardqty() {
        return _totalcardboardqty;
    }

    /**
     * [set] TotalCardBoardQty: {bigint(19)} <br>
     * 合計（段ボール）
     * @param totalcardboardqty The value of the column 'TotalCardBoardQty'. (NullAllowed)
     */
    public void setTotalcardboardqty(Long totalcardboardqty) {
        __modifiedProperties.add("totalcardboardqty");
        this._totalcardboardqty = totalcardboardqty;
    }

    /**
     * [get] TotalCarTonQty: {bigint(19)} <br>
     * 合計（カートン）
     * @return The value of the column 'TotalCarTonQty'. (NullAllowed)
     */
    public Long getTotalcartonqty() {
        return _totalcartonqty;
    }

    /**
     * [set] TotalCarTonQty: {bigint(19)} <br>
     * 合計（カートン）
     * @param totalcartonqty The value of the column 'TotalCarTonQty'. (NullAllowed)
     */
    public void setTotalcartonqty(Long totalcartonqty) {
        __modifiedProperties.add("totalcartonqty");
        this._totalcartonqty = totalcartonqty;
    }

    /**
     * [get] Note: {varchar(4000)} <br>
     * 備考
     * @return The value of the column 'Note'. (NullAllowed)
     */
    public String getNote() {
        return _note;
    }

    /**
     * [set] Note: {varchar(4000)} <br>
     * 備考
     * @param note The value of the column 'Note'. (NullAllowed)
     */
    public void setNote(String note) {
        __modifiedProperties.add("note");
        this._note = note;
    }

    /**
     * [get] Reserve2: {varchar(255)} <br>
     * 予備2
     * @return The value of the column 'Reserve2'. (NullAllowed)
     */
    public String getReserve2() {
        return _reserve2;
    }

    /**
     * [set] Reserve2: {varchar(255)} <br>
     * 予備2
     * @param reserve2 The value of the column 'Reserve2'. (NullAllowed)
     */
    public void setReserve2(String reserve2) {
        __modifiedProperties.add("reserve2");
        this._reserve2 = reserve2;
    }

    /**
     * [get] Reserve3: {varchar(255)} <br>
     * 予備3
     * @return The value of the column 'Reserve3'. (NullAllowed)
     */
    public String getReserve3() {
        return _reserve3;
    }

    /**
     * [set] Reserve3: {varchar(255)} <br>
     * 予備3
     * @param reserve3 The value of the column 'Reserve3'. (NullAllowed)
     */
    public void setReserve3(String reserve3) {
        __modifiedProperties.add("reserve3");
        this._reserve3 = reserve3;
    }

    /**
     * [get] Reserve: {varchar(255)} <br>
     * 予備
     * @return The value of the column 'Reserve'. (NullAllowed)
     */
    public String getReserve() {
        return _reserve;
    }

    /**
     * [set] Reserve: {varchar(255)} <br>
     * 予備
     * @param reserve The value of the column 'Reserve'. (NullAllowed)
     */
    public void setReserve(String reserve) {
        __modifiedProperties.add("reserve");
        this._reserve = reserve;
    }

    /**
     * [get] CenterId: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CenterId'. (NullAllowed)
     */
    public Long getCenterid() {
        return _centerid;
    }

    /**
     * [set] CenterId: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerid The value of the column 'CenterId'. (NullAllowed)
     */
    public void setCenterid(Long centerid) {
        __modifiedProperties.add("centerid");
        this._centerid = centerid;
    }

    /**
     * [get] ClientId: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'ClientId'. (NullAllowed)
     */
    public Long getClientid() {
        return _clientid;
    }

    /**
     * [set] ClientId: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientid The value of the column 'ClientId'. (NullAllowed)
     */
    public void setClientid(Long clientid) {
        __modifiedProperties.add("clientid");
        this._clientid = clientid;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
