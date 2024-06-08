package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_PICKLIST as TABLE. <br>
 * 棚出リスト
 * <pre>
 * [primary-key]
 *     T_PICKLIST_ID
 *
 * [column]
 *     T_PICKLIST_ID, PICKLISTKEY, WORKALLOCATEID, FLOOR, LISTKBN, LOCATION_ID, LOT_ID, PRODUCT_ID, LOT1, LOT2, LOT3, LOT4, OTHERLOT1, NOSHIPPINGFLG, PICKSCHDATE, EXPECTQTY1, EXPECTQTY2, EXPECTQTY3, PICKEDQTY1, PICKEDQTY2, PICKEDQTY3, SORTRECIEVEDQTY1, SORTRECIEVEDQTY2, SORTRECIEVEDQTY3, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     T_PICKLIST_ID
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
public abstract class BsTPicklistDto implements Serializable {

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
    /** T_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _tPicklistId;

    /** PICKLISTKEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _picklistkey;

    /** WORKALLOCATEID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _workallocateid;

    /** FLOOR: {NotNull, varchar(30)} */
    @JsonKey
    protected String _floor;

    /** LISTKBN: {NotNull, char(1)} */
    @JsonKey
    protected String _listkbn;

    /** LOCATION_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _locationId;

    /** LOT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _lotId;

    /** PRODUCT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** LOT1: {varchar(60)} */
    @JsonKey
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    @JsonKey
    protected String _lot2;

    /** LOT3: {varchar(60)} */
    @JsonKey
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** OTHERLOT1: {varchar(60)} */
    @JsonKey
    protected String _otherlot1;

    /** NOSHIPPINGFLG: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _noshippingflg;

    /** PICKSCHDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _pickschdate;

    /** EXPECTQTY1: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _expectqty1;

    /** EXPECTQTY2: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _expectqty2;

    /** EXPECTQTY3: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _expectqty3;

    /** PICKEDQTY1: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _pickedqty1;

    /** PICKEDQTY2: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _pickedqty2;

    /** PICKEDQTY3: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _pickedqty3;

    /** SORTRECIEVEDQTY1: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sortrecievedqty1;

    /** SORTRECIEVEDQTY2: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sortrecievedqty2;

    /** SORTRECIEVEDQTY3: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sortrecievedqty3;

    /** CENTER_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _clientId;

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
    public BsTPicklistDto() {
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
        if (other == null || !(other instanceof BsTPicklistDto)) { return false; }
        final BsTPicklistDto otherEntity = (BsTPicklistDto)other;
        if (!helpComparingValue(getTPicklistId(), otherEntity.getTPicklistId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_PICKLIST");
        result = xCH(result, getTPicklistId());
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
        sb.append(c).append(getTPicklistId());
        sb.append(c).append(getPicklistkey());
        sb.append(c).append(getWorkallocateid());
        sb.append(c).append(getFloor());
        sb.append(c).append(getListkbn());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getLotId());
        sb.append(c).append(getProductId());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot2());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot4());
        sb.append(c).append(getOtherlot1());
        sb.append(c).append(getNoshippingflg());
        sb.append(c).append(getPickschdate());
        sb.append(c).append(getExpectqty1());
        sb.append(c).append(getExpectqty2());
        sb.append(c).append(getExpectqty3());
        sb.append(c).append(getPickedqty1());
        sb.append(c).append(getPickedqty2());
        sb.append(c).append(getPickedqty3());
        sb.append(c).append(getSortrecievedqty1());
        sb.append(c).append(getSortrecievedqty2());
        sb.append(c).append(getSortrecievedqty3());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
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
     * [get] T_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚出リストID
     * @return The value of the column 'T_PICKLIST_ID'. (NullAllowed)
     */
    public Long getTPicklistId() {
        return _tPicklistId;
    }

    /**
     * [set] T_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 棚出リストID
     * @param tPicklistId The value of the column 'T_PICKLIST_ID'. (NullAllowed)
     */
    public void setTPicklistId(Long tPicklistId) {
        __modifiedProperties.add("TPicklistId");
        this._tPicklistId = tPicklistId;
    }

    /**
     * [get] PICKLISTKEY: {NotNull, bigint(19)} <br>
     * 棚出キー
     * @return The value of the column 'PICKLISTKEY'. (NullAllowed)
     */
    public Long getPicklistkey() {
        return _picklistkey;
    }

    /**
     * [set] PICKLISTKEY: {NotNull, bigint(19)} <br>
     * 棚出キー
     * @param picklistkey The value of the column 'PICKLISTKEY'. (NullAllowed)
     */
    public void setPicklistkey(Long picklistkey) {
        __modifiedProperties.add("picklistkey");
        this._picklistkey = picklistkey;
    }

    /**
     * [get] WORKALLOCATEID: {NotNull, bigint(19)} <br>
     * 棚出リストキー
     * @return The value of the column 'WORKALLOCATEID'. (NullAllowed)
     */
    public Long getWorkallocateid() {
        return _workallocateid;
    }

    /**
     * [set] WORKALLOCATEID: {NotNull, bigint(19)} <br>
     * 棚出リストキー
     * @param workallocateid The value of the column 'WORKALLOCATEID'. (NullAllowed)
     */
    public void setWorkallocateid(Long workallocateid) {
        __modifiedProperties.add("workallocateid");
        this._workallocateid = workallocateid;
    }

    /**
     * [get] FLOOR: {NotNull, varchar(30)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (NullAllowed)
     */
    public String getFloor() {
        return _floor;
    }

    /**
     * [set] FLOOR: {NotNull, varchar(30)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (NullAllowed)
     */
    public void setFloor(String floor) {
        __modifiedProperties.add("floor");
        this._floor = floor;
    }

    /**
     * [get] LISTKBN: {NotNull, char(1)} <br>
     * 単品・端数区分
     * @return The value of the column 'LISTKBN'. (NullAllowed)
     */
    public String getListkbn() {
        return _listkbn;
    }

    /**
     * [set] LISTKBN: {NotNull, char(1)} <br>
     * 単品・端数区分
     * @param listkbn The value of the column 'LISTKBN'. (NullAllowed)
     */
    public void setListkbn(String listkbn) {
        __modifiedProperties.add("listkbn");
        this._listkbn = listkbn;
    }

    /**
     * [get] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {NotNull, bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {NotNull, bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
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
     * [get] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed)
     */
    public String getLot1() {
        return _lot1;
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed)
     */
    public void setLot1(String lot1) {
        __modifiedProperties.add("lot1");
        this._lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(60)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed)
     */
    public String getLot2() {
        return _lot2;
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed)
     */
    public void setLot2(String lot2) {
        __modifiedProperties.add("lot2");
        this._lot2 = lot2;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed)
     */
    public void setLot3(String lot3) {
        __modifiedProperties.add("lot3");
        this._lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed)
     */
    public String getLot4() {
        return _lot4;
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed)
     */
    public void setLot4(String lot4) {
        __modifiedProperties.add("lot4");
        this._lot4 = lot4;
    }

    /**
     * [get] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @return The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public String getOtherlot1() {
        return _otherlot1;
    }

    /**
     * [set] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed)
     */
    public void setOtherlot1(String otherlot1) {
        __modifiedProperties.add("otherlot1");
        this._otherlot1 = otherlot1;
    }

    /**
     * [get] NOSHIPPINGFLG: {NotNull, bigint(19)} <br>
     * 出庫禁止フラグ
     * @return The value of the column 'NOSHIPPINGFLG'. (NullAllowed)
     */
    public Long getNoshippingflg() {
        return _noshippingflg;
    }

    /**
     * [set] NOSHIPPINGFLG: {NotNull, bigint(19)} <br>
     * 出庫禁止フラグ
     * @param noshippingflg The value of the column 'NOSHIPPINGFLG'. (NullAllowed)
     */
    public void setNoshippingflg(Long noshippingflg) {
        __modifiedProperties.add("noshippingflg");
        this._noshippingflg = noshippingflg;
    }

    /**
     * [get] PICKSCHDATE: {NotNull, varchar(8)} <br>
     * 棚出し予定日
     * @return The value of the column 'PICKSCHDATE'. (NullAllowed)
     */
    public String getPickschdate() {
        return _pickschdate;
    }

    /**
     * [set] PICKSCHDATE: {NotNull, varchar(8)} <br>
     * 棚出し予定日
     * @param pickschdate The value of the column 'PICKSCHDATE'. (NullAllowed)
     */
    public void setPickschdate(String pickschdate) {
        __modifiedProperties.add("pickschdate");
        this._pickschdate = pickschdate;
    }

    /**
     * [get] EXPECTQTY1: {NotNull, bigint(19)} <br>
     * 棚出し予定数量（パレット）
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public Long getExpectqty1() {
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {NotNull, bigint(19)} <br>
     * 棚出し予定数量（パレット）
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public void setExpectqty1(Long expectqty1) {
        __modifiedProperties.add("expectqty1");
        this._expectqty1 = expectqty1;
    }

    /**
     * [get] EXPECTQTY2: {NotNull, bigint(19)} <br>
     * 棚出し予定数量（ケース）
     * @return The value of the column 'EXPECTQTY2'. (NullAllowed)
     */
    public Long getExpectqty2() {
        return _expectqty2;
    }

    /**
     * [set] EXPECTQTY2: {NotNull, bigint(19)} <br>
     * 棚出し予定数量（ケース）
     * @param expectqty2 The value of the column 'EXPECTQTY2'. (NullAllowed)
     */
    public void setExpectqty2(Long expectqty2) {
        __modifiedProperties.add("expectqty2");
        this._expectqty2 = expectqty2;
    }

    /**
     * [get] EXPECTQTY3: {NotNull, bigint(19)} <br>
     * 棚出し予定数量（カートン）
     * @return The value of the column 'EXPECTQTY3'. (NullAllowed)
     */
    public Long getExpectqty3() {
        return _expectqty3;
    }

    /**
     * [set] EXPECTQTY3: {NotNull, bigint(19)} <br>
     * 棚出し予定数量（カートン）
     * @param expectqty3 The value of the column 'EXPECTQTY3'. (NullAllowed)
     */
    public void setExpectqty3(Long expectqty3) {
        __modifiedProperties.add("expectqty3");
        this._expectqty3 = expectqty3;
    }

    /**
     * [get] PICKEDQTY1: {NotNull, bigint(19)} <br>
     * 棚出し完了数量（パレット）
     * @return The value of the column 'PICKEDQTY1'. (NullAllowed)
     */
    public Long getPickedqty1() {
        return _pickedqty1;
    }

    /**
     * [set] PICKEDQTY1: {NotNull, bigint(19)} <br>
     * 棚出し完了数量（パレット）
     * @param pickedqty1 The value of the column 'PICKEDQTY1'. (NullAllowed)
     */
    public void setPickedqty1(Long pickedqty1) {
        __modifiedProperties.add("pickedqty1");
        this._pickedqty1 = pickedqty1;
    }

    /**
     * [get] PICKEDQTY2: {NotNull, bigint(19)} <br>
     * 棚出し完了数量（ケース）
     * @return The value of the column 'PICKEDQTY2'. (NullAllowed)
     */
    public Long getPickedqty2() {
        return _pickedqty2;
    }

    /**
     * [set] PICKEDQTY2: {NotNull, bigint(19)} <br>
     * 棚出し完了数量（ケース）
     * @param pickedqty2 The value of the column 'PICKEDQTY2'. (NullAllowed)
     */
    public void setPickedqty2(Long pickedqty2) {
        __modifiedProperties.add("pickedqty2");
        this._pickedqty2 = pickedqty2;
    }

    /**
     * [get] PICKEDQTY3: {NotNull, bigint(19)} <br>
     * 棚出し完了数量（カートン）
     * @return The value of the column 'PICKEDQTY3'. (NullAllowed)
     */
    public Long getPickedqty3() {
        return _pickedqty3;
    }

    /**
     * [set] PICKEDQTY3: {NotNull, bigint(19)} <br>
     * 棚出し完了数量（カートン）
     * @param pickedqty3 The value of the column 'PICKEDQTY3'. (NullAllowed)
     */
    public void setPickedqty3(Long pickedqty3) {
        __modifiedProperties.add("pickedqty3");
        this._pickedqty3 = pickedqty3;
    }

    /**
     * [get] SORTRECIEVEDQTY1: {NotNull, bigint(19)} <br>
     * 仕分場受入完了数量（パレット）
     * @return The value of the column 'SORTRECIEVEDQTY1'. (NullAllowed)
     */
    public Long getSortrecievedqty1() {
        return _sortrecievedqty1;
    }

    /**
     * [set] SORTRECIEVEDQTY1: {NotNull, bigint(19)} <br>
     * 仕分場受入完了数量（パレット）
     * @param sortrecievedqty1 The value of the column 'SORTRECIEVEDQTY1'. (NullAllowed)
     */
    public void setSortrecievedqty1(Long sortrecievedqty1) {
        __modifiedProperties.add("sortrecievedqty1");
        this._sortrecievedqty1 = sortrecievedqty1;
    }

    /**
     * [get] SORTRECIEVEDQTY2: {NotNull, bigint(19)} <br>
     * 仕分場受入完了数量（ケース）
     * @return The value of the column 'SORTRECIEVEDQTY2'. (NullAllowed)
     */
    public Long getSortrecievedqty2() {
        return _sortrecievedqty2;
    }

    /**
     * [set] SORTRECIEVEDQTY2: {NotNull, bigint(19)} <br>
     * 仕分場受入完了数量（ケース）
     * @param sortrecievedqty2 The value of the column 'SORTRECIEVEDQTY2'. (NullAllowed)
     */
    public void setSortrecievedqty2(Long sortrecievedqty2) {
        __modifiedProperties.add("sortrecievedqty2");
        this._sortrecievedqty2 = sortrecievedqty2;
    }

    /**
     * [get] SORTRECIEVEDQTY3: {NotNull, bigint(19)} <br>
     * 仕分場受入完了数量（カートン）
     * @return The value of the column 'SORTRECIEVEDQTY3'. (NullAllowed)
     */
    public Long getSortrecievedqty3() {
        return _sortrecievedqty3;
    }

    /**
     * [set] SORTRECIEVEDQTY3: {NotNull, bigint(19)} <br>
     * 仕分場受入完了数量（カートン）
     * @param sortrecievedqty3 The value of the column 'SORTRECIEVEDQTY3'. (NullAllowed)
     */
    public void setSortrecievedqty3(Long sortrecievedqty3) {
        __modifiedProperties.add("sortrecievedqty3");
        this._sortrecievedqty3 = sortrecievedqty3;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
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
