package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRSOJTDETAIL as TABLE. <br>
 * 出庫指図明細
 * <pre>
 * [primary-key]
 *     SOJTLINEID
 *
 * [column]
 *     SOJTLINEID, SOJTID, SOJTLINENO, DATATYPE, PLANSEQ, PRODUCT_ID, LOT3, LOT4, EXPECTQTY1, PICKEDQTY1, POID, PALLET_ID, LOCATION_ID, LOT_ID, SOID, SODETAILID, TRSOADDFLG, PLANOUTSEQ, PLANPRICE1, PLANPRICE2, PLANITEMNAME, PLANDATA1, PLANDATA2, PLANDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsTTrsojtdetailDto implements Serializable {

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

    /** SOJTID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sojtid;

    /** SOJTLINENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sojtlineno;

    /** DATATYPE: {char(1)} */
    @JsonKey
    protected String _datatype;

    /** PLANSEQ: {bigint(19)} */
    @JsonKey
    protected Long _planseq;

    /** PRODUCT_ID: {bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** LOT3: {varchar(60)} */
    @JsonKey
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** EXPECTQTY1: {bigint(19)} */
    @JsonKey
    protected Long _expectqty1;

    /** PICKEDQTY1: {bigint(19)} */
    @JsonKey
    protected Long _pickedqty1;

    /** POID: {varchar(30)} */
    @JsonKey
    protected String _poid;

    /** PALLET_ID: {bigint(19)} */
    @JsonKey
    protected Long _palletId;

    /** LOCATION_ID: {bigint(19)} */
    @JsonKey
    protected Long _locationId;

    /** LOT_ID: {bigint(19)} */
    @JsonKey
    protected Long _lotId;

    /** SOID: {bigint(19)} */
    @JsonKey
    protected Long _soid;

    /** SODETAILID: {bigint(19)} */
    @JsonKey
    protected Long _sodetailid;

    /** TRSOADDFLG: {char(1)} */
    @JsonKey
    protected String _trsoaddflg;

    /** PLANOUTSEQ: {varchar(30)} */
    @JsonKey
    protected String _planoutseq;

    /** PLANPRICE1: {varchar(30)} */
    @JsonKey
    protected String _planprice1;

    /** PLANPRICE2: {varchar(30)} */
    @JsonKey
    protected String _planprice2;

    /** PLANITEMNAME: {varchar(60)} */
    @JsonKey
    protected String _planitemname;

    /** PLANDATA1: {char(1)} */
    @JsonKey
    protected String _plandata1;

    /** PLANDATA2: {varchar(30)} */
    @JsonKey
    protected String _plandata2;

    /** PLANDATA3: {varchar(30)} */
    @JsonKey
    protected String _plandata3;

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
    public BsTTrsojtdetailDto() {
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
        if (other == null || !(other instanceof BsTTrsojtdetailDto)) { return false; }
        final BsTTrsojtdetailDto otherEntity = (BsTTrsojtdetailDto)other;
        if (!helpComparingValue(getSojtlineid(), otherEntity.getSojtlineid())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSOJTDETAIL");
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
        sb.append(c).append(getSojtid());
        sb.append(c).append(getSojtlineno());
        sb.append(c).append(getDatatype());
        sb.append(c).append(getPlanseq());
        sb.append(c).append(getProductId());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot4());
        sb.append(c).append(getExpectqty1());
        sb.append(c).append(getPickedqty1());
        sb.append(c).append(getPoid());
        sb.append(c).append(getPalletId());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getLotId());
        sb.append(c).append(getSoid());
        sb.append(c).append(getSodetailid());
        sb.append(c).append(getTrsoaddflg());
        sb.append(c).append(getPlanoutseq());
        sb.append(c).append(getPlanprice1());
        sb.append(c).append(getPlanprice2());
        sb.append(c).append(getPlanitemname());
        sb.append(c).append(getPlandata1());
        sb.append(c).append(getPlandata2());
        sb.append(c).append(getPlandata3());
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
     * 出庫指図明細ID
     * @return The value of the column 'SOJTLINEID'. (NullAllowed)
     */
    public Long getSojtlineid() {
        return _sojtlineid;
    }

    /**
     * [set] SOJTLINEID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫指図明細ID
     * @param sojtlineid The value of the column 'SOJTLINEID'. (NullAllowed)
     */
    public void setSojtlineid(Long sojtlineid) {
        __modifiedProperties.add("sojtlineid");
        this._sojtlineid = sojtlineid;
    }

    /**
     * [get] SOJTID: {NotNull, bigint(19)} <br>
     * 出庫指図ID
     * @return The value of the column 'SOJTID'. (NullAllowed)
     */
    public Long getSojtid() {
        return _sojtid;
    }

    /**
     * [set] SOJTID: {NotNull, bigint(19)} <br>
     * 出庫指図ID
     * @param sojtid The value of the column 'SOJTID'. (NullAllowed)
     */
    public void setSojtid(Long sojtid) {
        __modifiedProperties.add("sojtid");
        this._sojtid = sojtid;
    }

    /**
     * [get] SOJTLINENO: {NotNull, bigint(19)} <br>
     * 出庫指図行№
     * @return The value of the column 'SOJTLINENO'. (NullAllowed)
     */
    public Long getSojtlineno() {
        return _sojtlineno;
    }

    /**
     * [set] SOJTLINENO: {NotNull, bigint(19)} <br>
     * 出庫指図行№
     * @param sojtlineno The value of the column 'SOJTLINENO'. (NullAllowed)
     */
    public void setSojtlineno(Long sojtlineno) {
        __modifiedProperties.add("sojtlineno");
        this._sojtlineno = sojtlineno;
    }

    /**
     * [get] DATATYPE: {char(1)} <br>
     * データタイプ
     * @return The value of the column 'DATATYPE'. (NullAllowed)
     */
    public String getDatatype() {
        return _datatype;
    }

    /**
     * [set] DATATYPE: {char(1)} <br>
     * データタイプ
     * @param datatype The value of the column 'DATATYPE'. (NullAllowed)
     */
    public void setDatatype(String datatype) {
        __modifiedProperties.add("datatype");
        this._datatype = datatype;
    }

    /**
     * [get] PLANSEQ: {bigint(19)} <br>
     * 計画受信回数
     * @return The value of the column 'PLANSEQ'. (NullAllowed)
     */
    public Long getPlanseq() {
        return _planseq;
    }

    /**
     * [set] PLANSEQ: {bigint(19)} <br>
     * 計画受信回数
     * @param planseq The value of the column 'PLANSEQ'. (NullAllowed)
     */
    public void setPlanseq(Long planseq) {
        __modifiedProperties.add("planseq");
        this._planseq = planseq;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
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
     * [get] EXPECTQTY1: {bigint(19)} <br>
     * 個装数量
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public Long getExpectqty1() {
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {bigint(19)} <br>
     * 個装数量
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed)
     */
    public void setExpectqty1(Long expectqty1) {
        __modifiedProperties.add("expectqty1");
        this._expectqty1 = expectqty1;
    }

    /**
     * [get] PICKEDQTY1: {bigint(19)} <br>
     * ピッキング済数量１（バラ）
     * @return The value of the column 'PICKEDQTY1'. (NullAllowed)
     */
    public Long getPickedqty1() {
        return _pickedqty1;
    }

    /**
     * [set] PICKEDQTY1: {bigint(19)} <br>
     * ピッキング済数量１（バラ）
     * @param pickedqty1 The value of the column 'PICKEDQTY1'. (NullAllowed)
     */
    public void setPickedqty1(Long pickedqty1) {
        __modifiedProperties.add("pickedqty1");
        this._pickedqty1 = pickedqty1;
    }

    /**
     * [get] POID: {varchar(30)} <br>
     * パレット番号（保税）
     * @return The value of the column 'POID'. (NullAllowed)
     */
    public String getPoid() {
        return _poid;
    }

    /**
     * [set] POID: {varchar(30)} <br>
     * パレット番号（保税）
     * @param poid The value of the column 'POID'. (NullAllowed)
     */
    public void setPoid(String poid) {
        __modifiedProperties.add("poid");
        this._poid = poid;
    }

    /**
     * [get] PALLET_ID: {bigint(19)} <br>
     * パレットID
     * @return The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public Long getPalletId() {
        return _palletId;
    }

    /**
     * [set] PALLET_ID: {bigint(19)} <br>
     * パレットID
     * @param palletId The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public void setPalletId(Long palletId) {
        __modifiedProperties.add("palletId");
        this._palletId = palletId;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * ロケーションiD
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * ロケーションiD
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {bigint(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] SOID: {bigint(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (NullAllowed)
     */
    public Long getSoid() {
        return _soid;
    }

    /**
     * [set] SOID: {bigint(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (NullAllowed)
     */
    public void setSoid(Long soid) {
        __modifiedProperties.add("soid");
        this._soid = soid;
    }

    /**
     * [get] SODETAILID: {bigint(19)} <br>
     * 出庫予定明細ID
     * @return The value of the column 'SODETAILID'. (NullAllowed)
     */
    public Long getSodetailid() {
        return _sodetailid;
    }

    /**
     * [set] SODETAILID: {bigint(19)} <br>
     * 出庫予定明細ID
     * @param sodetailid The value of the column 'SODETAILID'. (NullAllowed)
     */
    public void setSodetailid(Long sodetailid) {
        __modifiedProperties.add("sodetailid");
        this._sodetailid = sodetailid;
    }

    /**
     * [get] TRSOADDFLG: {char(1)} <br>
     * 出庫予定作成フラグ
     * @return The value of the column 'TRSOADDFLG'. (NullAllowed)
     */
    public String getTrsoaddflg() {
        return _trsoaddflg;
    }

    /**
     * [set] TRSOADDFLG: {char(1)} <br>
     * 出庫予定作成フラグ
     * @param trsoaddflg The value of the column 'TRSOADDFLG'. (NullAllowed)
     */
    public void setTrsoaddflg(String trsoaddflg) {
        __modifiedProperties.add("trsoaddflg");
        this._trsoaddflg = trsoaddflg;
    }

    /**
     * [get] PLANOUTSEQ: {varchar(30)} <br>
     * 伝票出力順
     * @return The value of the column 'PLANOUTSEQ'. (NullAllowed)
     */
    public String getPlanoutseq() {
        return _planoutseq;
    }

    /**
     * [set] PLANOUTSEQ: {varchar(30)} <br>
     * 伝票出力順
     * @param planoutseq The value of the column 'PLANOUTSEQ'. (NullAllowed)
     */
    public void setPlanoutseq(String planoutseq) {
        __modifiedProperties.add("planoutseq");
        this._planoutseq = planoutseq;
    }

    /**
     * [get] PLANPRICE1: {varchar(30)} <br>
     * 単価
     * @return The value of the column 'PLANPRICE1'. (NullAllowed)
     */
    public String getPlanprice1() {
        return _planprice1;
    }

    /**
     * [set] PLANPRICE1: {varchar(30)} <br>
     * 単価
     * @param planprice1 The value of the column 'PLANPRICE1'. (NullAllowed)
     */
    public void setPlanprice1(String planprice1) {
        __modifiedProperties.add("planprice1");
        this._planprice1 = planprice1;
    }

    /**
     * [get] PLANPRICE2: {varchar(30)} <br>
     * 価格
     * @return The value of the column 'PLANPRICE2'. (NullAllowed)
     */
    public String getPlanprice2() {
        return _planprice2;
    }

    /**
     * [set] PLANPRICE2: {varchar(30)} <br>
     * 価格
     * @param planprice2 The value of the column 'PLANPRICE2'. (NullAllowed)
     */
    public void setPlanprice2(String planprice2) {
        __modifiedProperties.add("planprice2");
        this._planprice2 = planprice2;
    }

    /**
     * [get] PLANITEMNAME: {varchar(60)} <br>
     * 銘柄名称
     * @return The value of the column 'PLANITEMNAME'. (NullAllowed)
     */
    public String getPlanitemname() {
        return _planitemname;
    }

    /**
     * [set] PLANITEMNAME: {varchar(60)} <br>
     * 銘柄名称
     * @param planitemname The value of the column 'PLANITEMNAME'. (NullAllowed)
     */
    public void setPlanitemname(String planitemname) {
        __modifiedProperties.add("planitemname");
        this._planitemname = planitemname;
    }

    /**
     * [get] PLANDATA1: {char(1)} <br>
     * その他１
     * @return The value of the column 'PLANDATA1'. (NullAllowed)
     */
    public String getPlandata1() {
        return _plandata1;
    }

    /**
     * [set] PLANDATA1: {char(1)} <br>
     * その他１
     * @param plandata1 The value of the column 'PLANDATA1'. (NullAllowed)
     */
    public void setPlandata1(String plandata1) {
        __modifiedProperties.add("plandata1");
        this._plandata1 = plandata1;
    }

    /**
     * [get] PLANDATA2: {varchar(30)} <br>
     * その他２
     * @return The value of the column 'PLANDATA2'. (NullAllowed)
     */
    public String getPlandata2() {
        return _plandata2;
    }

    /**
     * [set] PLANDATA2: {varchar(30)} <br>
     * その他２
     * @param plandata2 The value of the column 'PLANDATA2'. (NullAllowed)
     */
    public void setPlandata2(String plandata2) {
        __modifiedProperties.add("plandata2");
        this._plandata2 = plandata2;
    }

    /**
     * [get] PLANDATA3: {varchar(30)} <br>
     * その他３
     * @return The value of the column 'PLANDATA3'. (NullAllowed)
     */
    public String getPlandata3() {
        return _plandata3;
    }

    /**
     * [set] PLANDATA3: {varchar(30)} <br>
     * その他３
     * @param plandata3 The value of the column 'PLANDATA3'. (NullAllowed)
     */
    public void setPlandata3(String plandata3) {
        __modifiedProperties.add("plandata3");
        this._plandata3 = plandata3;
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
