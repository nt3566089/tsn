package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRPACKRMDR as TABLE. <br>
 * 梱包残
 * <pre>
 * [primary-key]
 *     PACKING_REMAINING_ID
 *
 * [column]
 *     PACKING_REMAINING_ID, PACKRMDRKEY, PICKING_INST_DETAIL_ID, TAGCD, SOKEY, SOLINENO, ACTFLG, DELIVERYGROUPKEY, WBKEY, WAREHOUSECD, OWNERCD, ITEMADMIN, PRODUCT_CD, LOTKEY, PACKEDQTY1, PACKEDQTY2, PACKEDQTY3, EXPECTQTY1, EXPECTQTY2, EXPECTQTY3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_REMAINING_ID
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
public abstract class BsTTrpackrmdrDto implements Serializable {

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
    /** PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _packingRemainingId;

    /** PACKRMDRKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _packrmdrkey;

    /** PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _pickingInstDetailId;

    /** TAGCD: {varchar(30)} */
    @JsonKey
    protected String _tagcd;

    /** SOKEY: {IX+, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sokey;

    /** SOLINENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _solineno;

    /** ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} */
    @JsonKey
    protected java.math.BigDecimal _actflg;

    /** DELIVERYGROUPKEY: {IX, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _deliverygroupkey;

    /** WBKEY: {IX, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _wbkey;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** OWNERCD: {IX+, NotNull, varchar(30)} */
    @JsonKey
    protected String _ownercd;

    /** ITEMADMIN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _itemadmin;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** LOTKEY: {IX, NotNull, bigint(19)} */
    @JsonKey
    protected Long _lotkey;

    /** PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _packedqty1;

    /** PACKEDQTY2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _packedqty2;

    /** PACKEDQTY3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _packedqty3;

    /** EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]} */
    @JsonKey
    protected java.math.BigDecimal _expectqty1;

    /** EXPECTQTY2: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _expectqty2;

    /** EXPECTQTY3: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _expectqty3;

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
    public BsTTrpackrmdrDto() {
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
        if (other == null || !(other instanceof BsTTrpackrmdrDto)) { return false; }
        final BsTTrpackrmdrDto otherEntity = (BsTTrpackrmdrDto)other;
        if (!helpComparingValue(getPackingRemainingId(), otherEntity.getPackingRemainingId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRPACKRMDR");
        result = xCH(result, getPackingRemainingId());
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
        sb.append(c).append(getPackingRemainingId());
        sb.append(c).append(getPackrmdrkey());
        sb.append(c).append(getPickingInstDetailId());
        sb.append(c).append(getTagcd());
        sb.append(c).append(getSokey());
        sb.append(c).append(getSolineno());
        sb.append(c).append(getActflg());
        sb.append(c).append(getDeliverygroupkey());
        sb.append(c).append(getWbkey());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getOwnercd());
        sb.append(c).append(getItemadmin());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getLotkey());
        sb.append(c).append(getPackedqty1());
        sb.append(c).append(getPackedqty2());
        sb.append(c).append(getPackedqty3());
        sb.append(c).append(getExpectqty1());
        sb.append(c).append(getExpectqty2());
        sb.append(c).append(getExpectqty3());
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
     * [get] PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 梱包残ID
     * @return The value of the column 'PACKING_REMAINING_ID'. (NullAllowed)
     */
    public Long getPackingRemainingId() {
        return _packingRemainingId;
    }

    /**
     * [set] PACKING_REMAINING_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 梱包残ID
     * @param packingRemainingId The value of the column 'PACKING_REMAINING_ID'. (NullAllowed)
     */
    public void setPackingRemainingId(Long packingRemainingId) {
        __modifiedProperties.add("packingRemainingId");
        this._packingRemainingId = packingRemainingId;
    }

    /**
     * [get] PACKRMDRKEY: {NotNull, decimal(16, 6)} <br>
     * 梱包残Ｋｅｙ
     * @return The value of the column 'PACKRMDRKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getPackrmdrkey() {
        return _packrmdrkey;
    }

    /**
     * [set] PACKRMDRKEY: {NotNull, decimal(16, 6)} <br>
     * 梱包残Ｋｅｙ
     * @param packrmdrkey The value of the column 'PACKRMDRKEY'. (NullAllowed)
     */
    public void setPackrmdrkey(java.math.BigDecimal packrmdrkey) {
        __modifiedProperties.add("packrmdrkey");
        this._packrmdrkey = packrmdrkey;
    }

    /**
     * [get] PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)} <br>
     * ピッキング指示明細ID
     * @return The value of the column 'PICKING_INST_DETAIL_ID'. (NullAllowed)
     */
    public Long getPickingInstDetailId() {
        return _pickingInstDetailId;
    }

    /**
     * [set] PICKING_INST_DETAIL_ID: {IX, NotNull, bigint(19)} <br>
     * ピッキング指示明細ID
     * @param pickingInstDetailId The value of the column 'PICKING_INST_DETAIL_ID'. (NullAllowed)
     */
    public void setPickingInstDetailId(Long pickingInstDetailId) {
        __modifiedProperties.add("pickingInstDetailId");
        this._pickingInstDetailId = pickingInstDetailId;
    }

    /**
     * [get] TAGCD: {varchar(30)} <br>
     * 仕分タグCD
     * @return The value of the column 'TAGCD'. (NullAllowed)
     */
    public String getTagcd() {
        return _tagcd;
    }

    /**
     * [set] TAGCD: {varchar(30)} <br>
     * 仕分タグCD
     * @param tagcd The value of the column 'TAGCD'. (NullAllowed)
     */
    public void setTagcd(String tagcd) {
        __modifiedProperties.add("tagcd");
        this._tagcd = tagcd;
    }

    /**
     * [get] SOKEY: {IX+, NotNull, decimal(16, 6)} <br>
     * 出庫指示Ｋｅｙ
     * @return The value of the column 'SOKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSokey() {
        return _sokey;
    }

    /**
     * [set] SOKEY: {IX+, NotNull, decimal(16, 6)} <br>
     * 出庫指示Ｋｅｙ
     * @param sokey The value of the column 'SOKEY'. (NullAllowed)
     */
    public void setSokey(java.math.BigDecimal sokey) {
        __modifiedProperties.add("sokey");
        this._sokey = sokey;
    }

    /**
     * [get] SOLINENO: {NotNull, bigint(19)} <br>
     * 出庫指示行№
     * @return The value of the column 'SOLINENO'. (NullAllowed)
     */
    public Long getSolineno() {
        return _solineno;
    }

    /**
     * [set] SOLINENO: {NotNull, bigint(19)} <br>
     * 出庫指示行№
     * @param solineno The value of the column 'SOLINENO'. (NullAllowed)
     */
    public void setSolineno(Long solineno) {
        __modifiedProperties.add("solineno");
        this._solineno = solineno;
    }

    /**
     * [get] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @return The value of the column 'ACTFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getActflg() {
        return _actflg;
    }

    /**
     * [set] ACTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 活動中フラグ
     * @param actflg The value of the column 'ACTFLG'. (NullAllowed)
     */
    public void setActflg(java.math.BigDecimal actflg) {
        __modifiedProperties.add("actflg");
        this._actflg = actflg;
    }

    /**
     * [get] DELIVERYGROUPKEY: {IX, decimal(16, 6)} <br>
     * 配送グループＫｅｙ
     * @return The value of the column 'DELIVERYGROUPKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getDeliverygroupkey() {
        return _deliverygroupkey;
    }

    /**
     * [set] DELIVERYGROUPKEY: {IX, decimal(16, 6)} <br>
     * 配送グループＫｅｙ
     * @param deliverygroupkey The value of the column 'DELIVERYGROUPKEY'. (NullAllowed)
     */
    public void setDeliverygroupkey(java.math.BigDecimal deliverygroupkey) {
        __modifiedProperties.add("deliverygroupkey");
        this._deliverygroupkey = deliverygroupkey;
    }

    /**
     * [get] WBKEY: {IX, decimal(16, 6)} <br>
     * 送り状Ｋｅｙ
     * @return The value of the column 'WBKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getWbkey() {
        return _wbkey;
    }

    /**
     * [set] WBKEY: {IX, decimal(16, 6)} <br>
     * 送り状Ｋｅｙ
     * @param wbkey The value of the column 'WBKEY'. (NullAllowed)
     */
    public void setWbkey(java.math.BigDecimal wbkey) {
        __modifiedProperties.add("wbkey");
        this._wbkey = wbkey;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 倉庫CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] OWNERCD: {IX+, NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @return The value of the column 'OWNERCD'. (NullAllowed)
     */
    public String getOwnercd() {
        return _ownercd;
    }

    /**
     * [set] OWNERCD: {IX+, NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @param ownercd The value of the column 'OWNERCD'. (NullAllowed)
     */
    public void setOwnercd(String ownercd) {
        __modifiedProperties.add("ownercd");
        this._ownercd = ownercd;
    }

    /**
     * [get] ITEMADMIN: {NotNull, varchar(30)} <br>
     * 品目管理社
     * @return The value of the column 'ITEMADMIN'. (NullAllowed)
     */
    public String getItemadmin() {
        return _itemadmin;
    }

    /**
     * [set] ITEMADMIN: {NotNull, varchar(30)} <br>
     * 品目管理社
     * @param itemadmin The value of the column 'ITEMADMIN'. (NullAllowed)
     */
    public void setItemadmin(String itemadmin) {
        __modifiedProperties.add("itemadmin");
        this._itemadmin = itemadmin;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] LOTKEY: {IX, NotNull, bigint(19)} <br>
     * ロットＫｅｙ
     * @return The value of the column 'LOTKEY'. (NullAllowed)
     */
    public Long getLotkey() {
        return _lotkey;
    }

    /**
     * [set] LOTKEY: {IX, NotNull, bigint(19)} <br>
     * ロットＫｅｙ
     * @param lotkey The value of the column 'LOTKEY'. (NullAllowed)
     */
    public void setLotkey(Long lotkey) {
        __modifiedProperties.add("lotkey");
        this._lotkey = lotkey;
    }

    /**
     * [get] PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 梱包済数量１（バラ）
     * @return The value of the column 'PACKEDQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getPackedqty1() {
        return _packedqty1;
    }

    /**
     * [set] PACKEDQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 梱包済数量１（バラ）
     * @param packedqty1 The value of the column 'PACKEDQTY1'. (NullAllowed)
     */
    public void setPackedqty1(java.math.BigDecimal packedqty1) {
        __modifiedProperties.add("packedqty1");
        this._packedqty1 = packedqty1;
    }

    /**
     * [get] PACKEDQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 梱包済数量２
     * @return The value of the column 'PACKEDQTY2'. (NullAllowed)
     */
    public Long getPackedqty2() {
        return _packedqty2;
    }

    /**
     * [set] PACKEDQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 梱包済数量２
     * @param packedqty2 The value of the column 'PACKEDQTY2'. (NullAllowed)
     */
    public void setPackedqty2(Long packedqty2) {
        __modifiedProperties.add("packedqty2");
        this._packedqty2 = packedqty2;
    }

    /**
     * [get] PACKEDQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 梱包済数量３
     * @return The value of the column 'PACKEDQTY3'. (NullAllowed)
     */
    public Long getPackedqty3() {
        return _packedqty3;
    }

    /**
     * [set] PACKEDQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 梱包済数量３
     * @param packedqty3 The value of the column 'PACKEDQTY3'. (NullAllowed)
     */
    public void setPackedqty3(Long packedqty3) {
        __modifiedProperties.add("packedqty3");
        this._packedqty3 = packedqty3;
    }

    /**
     * [get] EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 梱包予定数量１（バラ）
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public java.math.BigDecimal getExpectqty1() {
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 梱包予定数量１（バラ）
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public void setExpectqty1(java.math.BigDecimal expectqty1) {
        __modifiedProperties.add("expectqty1");
        this._expectqty1 = expectqty1;
    }

    /**
     * [get] EXPECTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 梱包予定数量２
     * @return The value of the column 'EXPECTQTY2'. (NullAllowed)
     */
    public Long getExpectqty2() {
        return _expectqty2;
    }

    /**
     * [set] EXPECTQTY2: {NotNull, bigint(19), default=[(0)]} <br>
     * 梱包予定数量２
     * @param expectqty2 The value of the column 'EXPECTQTY2'. (NullAllowed)
     */
    public void setExpectqty2(Long expectqty2) {
        __modifiedProperties.add("expectqty2");
        this._expectqty2 = expectqty2;
    }

    /**
     * [get] EXPECTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 梱包予定数量３
     * @return The value of the column 'EXPECTQTY3'. (NullAllowed)
     */
    public Long getExpectqty3() {
        return _expectqty3;
    }

    /**
     * [set] EXPECTQTY3: {NotNull, bigint(19), default=[(0)]} <br>
     * 梱包予定数量３
     * @param expectqty3 The value of the column 'EXPECTQTY3'. (NullAllowed)
     */
    public void setExpectqty3(Long expectqty3) {
        __modifiedProperties.add("expectqty3");
        this._expectqty3 = expectqty3;
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
