package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_WKSOCANCELPICK1 as TABLE. <br>
 * 棚出済リスト情報中間1
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PRINTKEY, WAREHOUSECD, WAREHOUSE_SNAME, PICKEDDATE, WORKALLOCATEID, FLOOR, LOCCD, PRODUCT_CD, ITEM_SNAME, LOT1, LOT4, LOT3, PICKEDQTY_C, PICKEDQTY_P, USERNUM3, PRINTPAGENO, SEQSORTKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsWWksocancelpick1Dto implements Serializable {

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
    /** PRINTKEY: {NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _printkey;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** WAREHOUSE_SNAME: {NotNull, varchar(100)} */
    @JsonKey
    protected String _warehouseSname;

    /** PICKEDDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _pickeddate;

    /** WORKALLOCATEID: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _workallocateid;

    /** FLOOR: {NotNull, varchar(60)} */
    @JsonKey
    protected String _floor;

    /** LOCCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _loccd;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** ITEM_SNAME: {NotNull, varchar(100)} */
    @JsonKey
    protected String _itemSname;

    /** LOT1: {varchar(60)} */
    @JsonKey
    protected String _lot1;

    /** LOT4: {NotNull, varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** LOT3: {varchar(60)} */
    @JsonKey
    protected String _lot3;

    /** PICKEDQTY_C: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _pickedqtyC;

    /** PICKEDQTY_P: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _pickedqtyP;

    /** USERNUM3: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _usernum3;

    /** PRINTPAGENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _printpageno;

    /** SEQSORTKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _seqsortkey;

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
    public BsWWksocancelpick1Dto() {
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
        if (other == null || !(other instanceof BsWWksocancelpick1Dto)) { return false; }
        final BsWWksocancelpick1Dto otherEntity = (BsWWksocancelpick1Dto)other;
        if (!helpComparingValue(getPrintkey(), otherEntity.getPrintkey())) { return false; }
        if (!helpComparingValue(getWarehousecd(), otherEntity.getWarehousecd())) { return false; }
        if (!helpComparingValue(getWarehouseSname(), otherEntity.getWarehouseSname())) { return false; }
        if (!helpComparingValue(getPickeddate(), otherEntity.getPickeddate())) { return false; }
        if (!helpComparingValue(getWorkallocateid(), otherEntity.getWorkallocateid())) { return false; }
        if (!helpComparingValue(getFloor(), otherEntity.getFloor())) { return false; }
        if (!helpComparingValue(getLoccd(), otherEntity.getLoccd())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getItemSname(), otherEntity.getItemSname())) { return false; }
        if (!helpComparingValue(getLot1(), otherEntity.getLot1())) { return false; }
        if (!helpComparingValue(getLot4(), otherEntity.getLot4())) { return false; }
        if (!helpComparingValue(getLot3(), otherEntity.getLot3())) { return false; }
        if (!helpComparingValue(getPickedqtyC(), otherEntity.getPickedqtyC())) { return false; }
        if (!helpComparingValue(getPickedqtyP(), otherEntity.getPickedqtyP())) { return false; }
        if (!helpComparingValue(getUsernum3(), otherEntity.getUsernum3())) { return false; }
        if (!helpComparingValue(getPrintpageno(), otherEntity.getPrintpageno())) { return false; }
        if (!helpComparingValue(getSeqsortkey(), otherEntity.getSeqsortkey())) { return false; }
        if (!helpComparingValue(getDelFlg(), otherEntity.getDelFlg())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getControlNo(), otherEntity.getControlNo())) { return false; }
        if (!helpComparingValue(getAddDt(), otherEntity.getAddDt())) { return false; }
        if (!helpComparingValue(getAddUser(), otherEntity.getAddUser())) { return false; }
        if (!helpComparingValue(getAddProcess(), otherEntity.getAddProcess())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getUpdUser(), otherEntity.getUpdUser())) { return false; }
        if (!helpComparingValue(getUpdProcess(), otherEntity.getUpdProcess())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_WKSOCANCELPICK1");
        result = xCH(result, getPrintkey());
        result = xCH(result, getWarehousecd());
        result = xCH(result, getWarehouseSname());
        result = xCH(result, getPickeddate());
        result = xCH(result, getWorkallocateid());
        result = xCH(result, getFloor());
        result = xCH(result, getLoccd());
        result = xCH(result, getProductCd());
        result = xCH(result, getItemSname());
        result = xCH(result, getLot1());
        result = xCH(result, getLot4());
        result = xCH(result, getLot3());
        result = xCH(result, getPickedqtyC());
        result = xCH(result, getPickedqtyP());
        result = xCH(result, getUsernum3());
        result = xCH(result, getPrintpageno());
        result = xCH(result, getSeqsortkey());
        result = xCH(result, getDelFlg());
        result = xCH(result, getVersionNo());
        result = xCH(result, getControlNo());
        result = xCH(result, getAddDt());
        result = xCH(result, getAddUser());
        result = xCH(result, getAddProcess());
        result = xCH(result, getUpdDt());
        result = xCH(result, getUpdUser());
        result = xCH(result, getUpdProcess());
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
        sb.append(c).append(getPrintkey());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getWarehouseSname());
        sb.append(c).append(getPickeddate());
        sb.append(c).append(getWorkallocateid());
        sb.append(c).append(getFloor());
        sb.append(c).append(getLoccd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getItemSname());
        sb.append(c).append(getLot1());
        sb.append(c).append(getLot4());
        sb.append(c).append(getLot3());
        sb.append(c).append(getPickedqtyC());
        sb.append(c).append(getPickedqtyP());
        sb.append(c).append(getUsernum3());
        sb.append(c).append(getPrintpageno());
        sb.append(c).append(getSeqsortkey());
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
     * [get] PRINTKEY: {NotNull, bigint identity(19)} <br>
     * 印刷キー
     * @return The value of the column 'PRINTKEY'. (NullAllowed)
     */
    public Long getPrintkey() {
        return _printkey;
    }

    /**
     * [set] PRINTKEY: {NotNull, bigint identity(19)} <br>
     * 印刷キー
     * @param printkey The value of the column 'PRINTKEY'. (NullAllowed)
     */
    public void setPrintkey(Long printkey) {
        __modifiedProperties.add("printkey");
        this._printkey = printkey;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] WAREHOUSE_SNAME: {NotNull, varchar(100)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSE_SNAME'. (NullAllowed)
     */
    public String getWarehouseSname() {
        return _warehouseSname;
    }

    /**
     * [set] WAREHOUSE_SNAME: {NotNull, varchar(100)} <br>
     * 拠点名称
     * @param warehouseSname The value of the column 'WAREHOUSE_SNAME'. (NullAllowed)
     */
    public void setWarehouseSname(String warehouseSname) {
        __modifiedProperties.add("warehouseSname");
        this._warehouseSname = warehouseSname;
    }

    /**
     * [get] PICKEDDATE: {NotNull, varchar(8)} <br>
     * 棚出検品日
     * @return The value of the column 'PICKEDDATE'. (NullAllowed)
     */
    public String getPickeddate() {
        return _pickeddate;
    }

    /**
     * [set] PICKEDDATE: {NotNull, varchar(8)} <br>
     * 棚出検品日
     * @param pickeddate The value of the column 'PICKEDDATE'. (NullAllowed)
     */
    public void setPickeddate(String pickeddate) {
        __modifiedProperties.add("pickeddate");
        this._pickeddate = pickeddate;
    }

    /**
     * [get] WORKALLOCATEID: {NotNull, decimal(16, 6)} <br>
     * 棚出リストキー
     * @return The value of the column 'WORKALLOCATEID'. (NullAllowed)
     */
    public java.math.BigDecimal getWorkallocateid() {
        return _workallocateid;
    }

    /**
     * [set] WORKALLOCATEID: {NotNull, decimal(16, 6)} <br>
     * 棚出リストキー
     * @param workallocateid The value of the column 'WORKALLOCATEID'. (NullAllowed)
     */
    public void setWorkallocateid(java.math.BigDecimal workallocateid) {
        __modifiedProperties.add("workallocateid");
        this._workallocateid = workallocateid;
    }

    /**
     * [get] FLOOR: {NotNull, varchar(60)} <br>
     * フロア
     * @return The value of the column 'FLOOR'. (NullAllowed)
     */
    public String getFloor() {
        return _floor;
    }

    /**
     * [set] FLOOR: {NotNull, varchar(60)} <br>
     * フロア
     * @param floor The value of the column 'FLOOR'. (NullAllowed)
     */
    public void setFloor(String floor) {
        __modifiedProperties.add("floor");
        this._floor = floor;
    }

    /**
     * [get] LOCCD: {NotNull, varchar(30)} <br>
     * ロケCD
     * @return The value of the column 'LOCCD'. (NullAllowed)
     */
    public String getLoccd() {
        return _loccd;
    }

    /**
     * [set] LOCCD: {NotNull, varchar(30)} <br>
     * ロケCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed)
     */
    public void setLoccd(String loccd) {
        __modifiedProperties.add("loccd");
        this._loccd = loccd;
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
     * [get] ITEM_SNAME: {NotNull, varchar(100)} <br>
     * 銘柄名称
     * @return The value of the column 'ITEM_SNAME'. (NullAllowed)
     */
    public String getItemSname() {
        return _itemSname;
    }

    /**
     * [set] ITEM_SNAME: {NotNull, varchar(100)} <br>
     * 銘柄名称
     * @param itemSname The value of the column 'ITEM_SNAME'. (NullAllowed)
     */
    public void setItemSname(String itemSname) {
        __modifiedProperties.add("itemSname");
        this._itemSname = itemSname;
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
     * [get] LOT4: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed)
     */
    public String getLot4() {
        return _lot4;
    }

    /**
     * [set] LOT4: {NotNull, varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed)
     */
    public void setLot4(String lot4) {
        __modifiedProperties.add("lot4");
        this._lot4 = lot4;
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
     * [get] PICKEDQTY_C: {NotNull, decimal(16, 6)} <br>
     * 棚出済数量（ケース）
     * @return The value of the column 'PICKEDQTY_C'. (NullAllowed)
     */
    public java.math.BigDecimal getPickedqtyC() {
        return _pickedqtyC;
    }

    /**
     * [set] PICKEDQTY_C: {NotNull, decimal(16, 6)} <br>
     * 棚出済数量（ケース）
     * @param pickedqtyC The value of the column 'PICKEDQTY_C'. (NullAllowed)
     */
    public void setPickedqtyC(java.math.BigDecimal pickedqtyC) {
        __modifiedProperties.add("pickedqtyC");
        this._pickedqtyC = pickedqtyC;
    }

    /**
     * [get] PICKEDQTY_P: {NotNull, decimal(16, 6)} <br>
     * 棚出済数量（パレット）
     * @return The value of the column 'PICKEDQTY_P'. (NullAllowed)
     */
    public java.math.BigDecimal getPickedqtyP() {
        return _pickedqtyP;
    }

    /**
     * [set] PICKEDQTY_P: {NotNull, decimal(16, 6)} <br>
     * 棚出済数量（パレット）
     * @param pickedqtyP The value of the column 'PICKEDQTY_P'. (NullAllowed)
     */
    public void setPickedqtyP(java.math.BigDecimal pickedqtyP) {
        __modifiedProperties.add("pickedqtyP");
        this._pickedqtyP = pickedqtyP;
    }

    /**
     * [get] USERNUM3: {NotNull, bigint(19)} <br>
     * 一般出力順
     * @return The value of the column 'USERNUM3'. (NullAllowed)
     */
    public Long getUsernum3() {
        return _usernum3;
    }

    /**
     * [set] USERNUM3: {NotNull, bigint(19)} <br>
     * 一般出力順
     * @param usernum3 The value of the column 'USERNUM3'. (NullAllowed)
     */
    public void setUsernum3(Long usernum3) {
        __modifiedProperties.add("usernum3");
        this._usernum3 = usernum3;
    }

    /**
     * [get] PRINTPAGENO: {NotNull, bigint(19)} <br>
     * 帳票改頁
     * @return The value of the column 'PRINTPAGENO'. (NullAllowed)
     */
    public Long getPrintpageno() {
        return _printpageno;
    }

    /**
     * [set] PRINTPAGENO: {NotNull, bigint(19)} <br>
     * 帳票改頁
     * @param printpageno The value of the column 'PRINTPAGENO'. (NullAllowed)
     */
    public void setPrintpageno(Long printpageno) {
        __modifiedProperties.add("printpageno");
        this._printpageno = printpageno;
    }

    /**
     * [get] SEQSORTKEY: {NotNull, decimal(16, 6)} <br>
     * 連番ソートキー
     * @return The value of the column 'SEQSORTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getSeqsortkey() {
        return _seqsortkey;
    }

    /**
     * [set] SEQSORTKEY: {NotNull, decimal(16, 6)} <br>
     * 連番ソートキー
     * @param seqsortkey The value of the column 'SEQSORTKEY'. (NullAllowed)
     */
    public void setSeqsortkey(java.math.BigDecimal seqsortkey) {
        __modifiedProperties.add("seqsortkey");
        this._seqsortkey = seqsortkey;
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
