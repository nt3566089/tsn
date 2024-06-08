package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_WKPALLET as TABLE. <br>
 * 印刷用パレットはり紙情報
 * <pre>
 * [primary-key]
 *     WKPALLET_ID
 *
 * [column]
 *     WKPALLET_ID, PALLETNO, PRINTKEY, LotKey, RcvKey, RcvLineNo, PRINTEDFLG, PrintingDate, LOT1, TRANSPORTNO, SourceCd, SchDate, ReceiveCd, RcvDate, ReceiveDate, WAREHOUSECD, PRODUCT_CD, LOT3, LOT4, LOT2, ReceiveQtyCase, ReceiveQtyBowl, ReceiveQty, RestQtyCase, RestQtyBowl, RestQty, PalletSts, PluralproductionKBN, RtnRcvKbn, ShTypeCd, PALLETCUTTINGKBN, LOCCD, RcvPalletNo, IMAGENAME1, IMAGENAME2, IMAGENAME3, WAREHOUSE_SNAME, ITEM_SNAME, FOREIGNCARGOCD, CARRIERSEQ, OTHERLOT1, USERNUM3, ADDRESS2, AcceptUserCd, AcceptDate, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WKPALLET_ID
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
public abstract class BsWWkpalletDto implements Serializable {

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
    /** WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _wkpalletId;

    /** PALLETNO: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _palletno;

    /** PRINTKEY: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _printkey;

    /** LotKey: {bigint(19)} */
    @JsonKey
    protected Long _lotkey;

    /** RcvKey: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvkey;

    /** RcvLineNo: {bigint(19)} */
    @JsonKey
    protected Long _rcvlineno;

    /** PRINTEDFLG: {char(1)} */
    @JsonKey
    protected String _printedflg;

    /** PrintingDate: {varchar(8)} */
    @JsonKey
    protected String _printingdate;

    /** LOT1: {varchar(60)} */
    @JsonKey
    protected String _lot1;

    /** TRANSPORTNO: {varchar(30)} */
    @JsonKey
    protected String _transportno;

    /** SourceCd: {varchar(30)} */
    @JsonKey
    protected String _sourcecd;

    /** SchDate: {varchar(8)} */
    @JsonKey
    protected String _schdate;

    /** ReceiveCd: {varchar(30)} */
    @JsonKey
    protected String _receivecd;

    /** RcvDate: {varchar(8)} */
    @JsonKey
    protected String _rcvdate;

    /** ReceiveDate: {varchar(8)} */
    @JsonKey
    protected String _receivedate;

    /** WAREHOUSECD: {varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** PRODUCT_CD: {varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** LOT3: {varchar(30)} */
    @JsonKey
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    @JsonKey
    protected String _lot4;

    /** LOT2: {varchar(60)} */
    @JsonKey
    protected String _lot2;

    /** ReceiveQtyCase: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _receiveqtycase;

    /** ReceiveQtyBowl: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _receiveqtybowl;

    /** ReceiveQty: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _receiveqty;

    /** RestQtyCase: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _restqtycase;

    /** RestQtyBowl: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _restqtybowl;

    /** RestQty: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _restqty;

    /** PalletSts: {char(1)} */
    @JsonKey
    protected String _palletsts;

    /** PluralproductionKBN: {char(1)} */
    @JsonKey
    protected String _pluralproductionkbn;

    /** RtnRcvKbn: {char(1)} */
    @JsonKey
    protected String _rtnrcvkbn;

    /** ShTypeCd: {varchar(30)} */
    @JsonKey
    protected String _shtypecd;

    /** PALLETCUTTINGKBN: {char(1)} */
    @JsonKey
    protected String _palletcuttingkbn;

    /** LOCCD: {varchar(30)} */
    @JsonKey
    protected String _loccd;

    /** RcvPalletNo: {varchar(30)} */
    @JsonKey
    protected String _rcvpalletno;

    /** IMAGENAME1: {varchar(4000)} */
    @JsonKey
    protected String _imagename1;

    /** IMAGENAME2: {varchar(4000)} */
    @JsonKey
    protected String _imagename2;

    /** IMAGENAME3: {varchar(4000)} */
    @JsonKey
    protected String _imagename3;

    /** WAREHOUSE_SNAME: {varchar(100)} */
    @JsonKey
    protected String _warehouseSname;

    /** ITEM_SNAME: {varchar(100)} */
    @JsonKey
    protected String _itemSname;

    /** FOREIGNCARGOCD: {char(1)} */
    @JsonKey
    protected String _foreigncargocd;

    /** CARRIERSEQ: {varchar(30)} */
    @JsonKey
    protected String _carrierseq;

    /** OTHERLOT1: {varchar(60)} */
    @JsonKey
    protected String _otherlot1;

    /** USERNUM3: {bigint(19)} */
    @JsonKey
    protected Long _usernum3;

    /** ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _address2;

    /** AcceptUserCd: {varchar(30)} */
    @JsonKey
    protected String _acceptusercd;

    /** AcceptDate: {varchar(8)} */
    @JsonKey
    protected String _acceptdate;

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
    public BsWWkpalletDto() {
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
        if (other == null || !(other instanceof BsWWkpalletDto)) { return false; }
        final BsWWkpalletDto otherEntity = (BsWWkpalletDto)other;
        if (!helpComparingValue(getWkpalletId(), otherEntity.getWkpalletId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_WKPALLET");
        result = xCH(result, getWkpalletId());
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
        sb.append(c).append(getWkpalletId());
        sb.append(c).append(getPalletno());
        sb.append(c).append(getPrintkey());
        sb.append(c).append(getLotkey());
        sb.append(c).append(getRcvkey());
        sb.append(c).append(getRcvlineno());
        sb.append(c).append(getPrintedflg());
        sb.append(c).append(getPrintingdate());
        sb.append(c).append(getLot1());
        sb.append(c).append(getTransportno());
        sb.append(c).append(getSourcecd());
        sb.append(c).append(getSchdate());
        sb.append(c).append(getReceivecd());
        sb.append(c).append(getRcvdate());
        sb.append(c).append(getReceivedate());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getLot3());
        sb.append(c).append(getLot4());
        sb.append(c).append(getLot2());
        sb.append(c).append(getReceiveqtycase());
        sb.append(c).append(getReceiveqtybowl());
        sb.append(c).append(getReceiveqty());
        sb.append(c).append(getRestqtycase());
        sb.append(c).append(getRestqtybowl());
        sb.append(c).append(getRestqty());
        sb.append(c).append(getPalletsts());
        sb.append(c).append(getPluralproductionkbn());
        sb.append(c).append(getRtnrcvkbn());
        sb.append(c).append(getShtypecd());
        sb.append(c).append(getPalletcuttingkbn());
        sb.append(c).append(getLoccd());
        sb.append(c).append(getRcvpalletno());
        sb.append(c).append(getImagename1());
        sb.append(c).append(getImagename2());
        sb.append(c).append(getImagename3());
        sb.append(c).append(getWarehouseSname());
        sb.append(c).append(getItemSname());
        sb.append(c).append(getForeigncargocd());
        sb.append(c).append(getCarrierseq());
        sb.append(c).append(getOtherlot1());
        sb.append(c).append(getUsernum3());
        sb.append(c).append(getAddress2());
        sb.append(c).append(getAcceptusercd());
        sb.append(c).append(getAcceptdate());
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
     * [get] WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷用パレットはり紙情報ID
     * @return The value of the column 'WKPALLET_ID'. (NullAllowed)
     */
    public Long getWkpalletId() {
        return _wkpalletId;
    }

    /**
     * [set] WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷用パレットはり紙情報ID
     * @param wkpalletId The value of the column 'WKPALLET_ID'. (NullAllowed)
     */
    public void setWkpalletId(Long wkpalletId) {
        __modifiedProperties.add("wkpalletId");
        this._wkpalletId = wkpalletId;
    }

    /**
     * [get] PALLETNO: {NotNull, decimal(16, 6)} <br>
     * パレット管理番号
     * @return The value of the column 'PALLETNO'. (NullAllowed)
     */
    public java.math.BigDecimal getPalletno() {
        return _palletno;
    }

    /**
     * [set] PALLETNO: {NotNull, decimal(16, 6)} <br>
     * パレット管理番号
     * @param palletno The value of the column 'PALLETNO'. (NullAllowed)
     */
    public void setPalletno(java.math.BigDecimal palletno) {
        __modifiedProperties.add("palletno");
        this._palletno = palletno;
    }

    /**
     * [get] PRINTKEY: {NotNull, bigint(19)} <br>
     * 印刷キー
     * @return The value of the column 'PRINTKEY'. (NullAllowed)
     */
    public Long getPrintkey() {
        return _printkey;
    }

    /**
     * [set] PRINTKEY: {NotNull, bigint(19)} <br>
     * 印刷キー
     * @param printkey The value of the column 'PRINTKEY'. (NullAllowed)
     */
    public void setPrintkey(Long printkey) {
        __modifiedProperties.add("printkey");
        this._printkey = printkey;
    }

    /**
     * [get] LotKey: {bigint(19)} <br>
     * ロットキー
     * @return The value of the column 'LotKey'. (NullAllowed)
     */
    public Long getLotkey() {
        return _lotkey;
    }

    /**
     * [set] LotKey: {bigint(19)} <br>
     * ロットキー
     * @param lotkey The value of the column 'LotKey'. (NullAllowed)
     */
    public void setLotkey(Long lotkey) {
        __modifiedProperties.add("lotkey");
        this._lotkey = lotkey;
    }

    /**
     * [get] RcvKey: {decimal(16, 6)} <br>
     * 入庫キー
     * @return The value of the column 'RcvKey'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvkey() {
        return _rcvkey;
    }

    /**
     * [set] RcvKey: {decimal(16, 6)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RcvKey'. (NullAllowed)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        __modifiedProperties.add("rcvkey");
        this._rcvkey = rcvkey;
    }

    /**
     * [get] RcvLineNo: {bigint(19)} <br>
     * 入庫キー行番号
     * @return The value of the column 'RcvLineNo'. (NullAllowed)
     */
    public Long getRcvlineno() {
        return _rcvlineno;
    }

    /**
     * [set] RcvLineNo: {bigint(19)} <br>
     * 入庫キー行番号
     * @param rcvlineno The value of the column 'RcvLineNo'. (NullAllowed)
     */
    public void setRcvlineno(Long rcvlineno) {
        __modifiedProperties.add("rcvlineno");
        this._rcvlineno = rcvlineno;
    }

    /**
     * [get] PRINTEDFLG: {char(1)} <br>
     * PRINTEDFLG
     * @return The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public String getPrintedflg() {
        return _printedflg;
    }

    /**
     * [set] PRINTEDFLG: {char(1)} <br>
     * PRINTEDFLG
     * @param printedflg The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public void setPrintedflg(String printedflg) {
        __modifiedProperties.add("printedflg");
        this._printedflg = printedflg;
    }

    /**
     * [get] PrintingDate: {varchar(8)} <br>
     * パレットはり紙作成日
     * @return The value of the column 'PrintingDate'. (NullAllowed)
     */
    public String getPrintingdate() {
        return _printingdate;
    }

    /**
     * [set] PrintingDate: {varchar(8)} <br>
     * パレットはり紙作成日
     * @param printingdate The value of the column 'PrintingDate'. (NullAllowed)
     */
    public void setPrintingdate(String printingdate) {
        __modifiedProperties.add("printingdate");
        this._printingdate = printingdate;
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
     * [get] TRANSPORTNO: {varchar(30)} <br>
     * 保税管理番号
     * @return The value of the column 'TRANSPORTNO'. (NullAllowed)
     */
    public String getTransportno() {
        return _transportno;
    }

    /**
     * [set] TRANSPORTNO: {varchar(30)} <br>
     * 保税管理番号
     * @param transportno The value of the column 'TRANSPORTNO'. (NullAllowed)
     */
    public void setTransportno(String transportno) {
        __modifiedProperties.add("transportno");
        this._transportno = transportno;
    }

    /**
     * [get] SourceCd: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SourceCd'. (NullAllowed)
     */
    public String getSourcecd() {
        return _sourcecd;
    }

    /**
     * [set] SourceCd: {varchar(30)} <br>
     * 発送元CD
     * @param sourcecd The value of the column 'SourceCd'. (NullAllowed)
     */
    public void setSourcecd(String sourcecd) {
        __modifiedProperties.add("sourcecd");
        this._sourcecd = sourcecd;
    }

    /**
     * [get] SchDate: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SchDate'. (NullAllowed)
     */
    public String getSchdate() {
        return _schdate;
    }

    /**
     * [set] SchDate: {varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SchDate'. (NullAllowed)
     */
    public void setSchdate(String schdate) {
        __modifiedProperties.add("schdate");
        this._schdate = schdate;
    }

    /**
     * [get] ReceiveCd: {varchar(30)} <br>
     * 受入先CD
     * @return The value of the column 'ReceiveCd'. (NullAllowed)
     */
    public String getReceivecd() {
        return _receivecd;
    }

    /**
     * [set] ReceiveCd: {varchar(30)} <br>
     * 受入先CD
     * @param receivecd The value of the column 'ReceiveCd'. (NullAllowed)
     */
    public void setReceivecd(String receivecd) {
        __modifiedProperties.add("receivecd");
        this._receivecd = receivecd;
    }

    /**
     * [get] RcvDate: {varchar(8)} <br>
     * 受入予定日
     * @return The value of the column 'RcvDate'. (NullAllowed)
     */
    public String getRcvdate() {
        return _rcvdate;
    }

    /**
     * [set] RcvDate: {varchar(8)} <br>
     * 受入予定日
     * @param rcvdate The value of the column 'RcvDate'. (NullAllowed)
     */
    public void setRcvdate(String rcvdate) {
        __modifiedProperties.add("rcvdate");
        this._rcvdate = rcvdate;
    }

    /**
     * [get] ReceiveDate: {varchar(8)} <br>
     * 入庫実績日
     * @return The value of the column 'ReceiveDate'. (NullAllowed)
     */
    public String getReceivedate() {
        return _receivedate;
    }

    /**
     * [set] ReceiveDate: {varchar(8)} <br>
     * 入庫実績日
     * @param receivedate The value of the column 'ReceiveDate'. (NullAllowed)
     */
    public void setReceivedate(String receivedate) {
        __modifiedProperties.add("receivedate");
        this._receivedate = receivedate;
    }

    /**
     * [get] WAREHOUSECD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] LOT3: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed)
     */
    public String getLot3() {
        return _lot3;
    }

    /**
     * [set] LOT3: {varchar(30)} <br>
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
     * [get] ReceiveQtyCase: {decimal(16, 6)} <br>
     * 入庫時数量（ケース）
     * @return The value of the column 'ReceiveQtyCase'. (NullAllowed)
     */
    public java.math.BigDecimal getReceiveqtycase() {
        return _receiveqtycase;
    }

    /**
     * [set] ReceiveQtyCase: {decimal(16, 6)} <br>
     * 入庫時数量（ケース）
     * @param receiveqtycase The value of the column 'ReceiveQtyCase'. (NullAllowed)
     */
    public void setReceiveqtycase(java.math.BigDecimal receiveqtycase) {
        __modifiedProperties.add("receiveqtycase");
        this._receiveqtycase = receiveqtycase;
    }

    /**
     * [get] ReceiveQtyBowl: {decimal(16, 6)} <br>
     * 入庫時数量（カートン）
     * @return The value of the column 'ReceiveQtyBowl'. (NullAllowed)
     */
    public java.math.BigDecimal getReceiveqtybowl() {
        return _receiveqtybowl;
    }

    /**
     * [set] ReceiveQtyBowl: {decimal(16, 6)} <br>
     * 入庫時数量（カートン）
     * @param receiveqtybowl The value of the column 'ReceiveQtyBowl'. (NullAllowed)
     */
    public void setReceiveqtybowl(java.math.BigDecimal receiveqtybowl) {
        __modifiedProperties.add("receiveqtybowl");
        this._receiveqtybowl = receiveqtybowl;
    }

    /**
     * [get] ReceiveQty: {decimal(16, 6)} <br>
     * 個装入庫時数量
     * @return The value of the column 'ReceiveQty'. (NullAllowed)
     */
    public java.math.BigDecimal getReceiveqty() {
        return _receiveqty;
    }

    /**
     * [set] ReceiveQty: {decimal(16, 6)} <br>
     * 個装入庫時数量
     * @param receiveqty The value of the column 'ReceiveQty'. (NullAllowed)
     */
    public void setReceiveqty(java.math.BigDecimal receiveqty) {
        __modifiedProperties.add("receiveqty");
        this._receiveqty = receiveqty;
    }

    /**
     * [get] RestQtyCase: {decimal(16, 6)} <br>
     * 残数量（ケース）
     * @return The value of the column 'RestQtyCase'. (NullAllowed)
     */
    public java.math.BigDecimal getRestqtycase() {
        return _restqtycase;
    }

    /**
     * [set] RestQtyCase: {decimal(16, 6)} <br>
     * 残数量（ケース）
     * @param restqtycase The value of the column 'RestQtyCase'. (NullAllowed)
     */
    public void setRestqtycase(java.math.BigDecimal restqtycase) {
        __modifiedProperties.add("restqtycase");
        this._restqtycase = restqtycase;
    }

    /**
     * [get] RestQtyBowl: {decimal(16, 6)} <br>
     * 残数量（カートン）
     * @return The value of the column 'RestQtyBowl'. (NullAllowed)
     */
    public java.math.BigDecimal getRestqtybowl() {
        return _restqtybowl;
    }

    /**
     * [set] RestQtyBowl: {decimal(16, 6)} <br>
     * 残数量（カートン）
     * @param restqtybowl The value of the column 'RestQtyBowl'. (NullAllowed)
     */
    public void setRestqtybowl(java.math.BigDecimal restqtybowl) {
        __modifiedProperties.add("restqtybowl");
        this._restqtybowl = restqtybowl;
    }

    /**
     * [get] RestQty: {decimal(16, 6)} <br>
     * 個装残数量
     * @return The value of the column 'RestQty'. (NullAllowed)
     */
    public java.math.BigDecimal getRestqty() {
        return _restqty;
    }

    /**
     * [set] RestQty: {decimal(16, 6)} <br>
     * 個装残数量
     * @param restqty The value of the column 'RestQty'. (NullAllowed)
     */
    public void setRestqty(java.math.BigDecimal restqty) {
        __modifiedProperties.add("restqty");
        this._restqty = restqty;
    }

    /**
     * [get] PalletSts: {char(1)} <br>
     * パレットはり紙ステータス
     * @return The value of the column 'PalletSts'. (NullAllowed)
     */
    public String getPalletsts() {
        return _palletsts;
    }

    /**
     * [set] PalletSts: {char(1)} <br>
     * パレットはり紙ステータス
     * @param palletsts The value of the column 'PalletSts'. (NullAllowed)
     */
    public void setPalletsts(String palletsts) {
        __modifiedProperties.add("palletsts");
        this._palletsts = palletsts;
    }

    /**
     * [get] PluralproductionKBN: {char(1)} <br>
     * 複数製造月日区分
     * @return The value of the column 'PluralproductionKBN'. (NullAllowed)
     */
    public String getPluralproductionkbn() {
        return _pluralproductionkbn;
    }

    /**
     * [set] PluralproductionKBN: {char(1)} <br>
     * 複数製造月日区分
     * @param pluralproductionkbn The value of the column 'PluralproductionKBN'. (NullAllowed)
     */
    public void setPluralproductionkbn(String pluralproductionkbn) {
        __modifiedProperties.add("pluralproductionkbn");
        this._pluralproductionkbn = pluralproductionkbn;
    }

    /**
     * [get] RtnRcvKbn: {char(1)} <br>
     * 逆転入庫区分
     * @return The value of the column 'RtnRcvKbn'. (NullAllowed)
     */
    public String getRtnrcvkbn() {
        return _rtnrcvkbn;
    }

    /**
     * [set] RtnRcvKbn: {char(1)} <br>
     * 逆転入庫区分
     * @param rtnrcvkbn The value of the column 'RtnRcvKbn'. (NullAllowed)
     */
    public void setRtnrcvkbn(String rtnrcvkbn) {
        __modifiedProperties.add("rtnrcvkbn");
        this._rtnrcvkbn = rtnrcvkbn;
    }

    /**
     * [get] ShTypeCd: {varchar(30)} <br>
     * 輸送形態CD
     * @return The value of the column 'ShTypeCd'. (NullAllowed)
     */
    public String getShtypecd() {
        return _shtypecd;
    }

    /**
     * [set] ShTypeCd: {varchar(30)} <br>
     * 輸送形態CD
     * @param shtypecd The value of the column 'ShTypeCd'. (NullAllowed)
     */
    public void setShtypecd(String shtypecd) {
        __modifiedProperties.add("shtypecd");
        this._shtypecd = shtypecd;
    }

    /**
     * [get] PALLETCUTTINGKBN: {char(1)} <br>
     * パレット分割区分
     * @return The value of the column 'PALLETCUTTINGKBN'. (NullAllowed)
     */
    public String getPalletcuttingkbn() {
        return _palletcuttingkbn;
    }

    /**
     * [set] PALLETCUTTINGKBN: {char(1)} <br>
     * パレット分割区分
     * @param palletcuttingkbn The value of the column 'PALLETCUTTINGKBN'. (NullAllowed)
     */
    public void setPalletcuttingkbn(String palletcuttingkbn) {
        __modifiedProperties.add("palletcuttingkbn");
        this._palletcuttingkbn = palletcuttingkbn;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * ロケCD
     * @return The value of the column 'LOCCD'. (NullAllowed)
     */
    public String getLoccd() {
        return _loccd;
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * ロケCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed)
     */
    public void setLoccd(String loccd) {
        __modifiedProperties.add("loccd");
        this._loccd = loccd;
    }

    /**
     * [get] RcvPalletNo: {varchar(30)} <br>
     * パレット番号（08需給）
     * @return The value of the column 'RcvPalletNo'. (NullAllowed)
     */
    public String getRcvpalletno() {
        return _rcvpalletno;
    }

    /**
     * [set] RcvPalletNo: {varchar(30)} <br>
     * パレット番号（08需給）
     * @param rcvpalletno The value of the column 'RcvPalletNo'. (NullAllowed)
     */
    public void setRcvpalletno(String rcvpalletno) {
        __modifiedProperties.add("rcvpalletno");
        this._rcvpalletno = rcvpalletno;
    }

    /**
     * [get] IMAGENAME1: {varchar(4000)} <br>
     * イメージファイルパス1
     * @return The value of the column 'IMAGENAME1'. (NullAllowed)
     */
    public String getImagename1() {
        return _imagename1;
    }

    /**
     * [set] IMAGENAME1: {varchar(4000)} <br>
     * イメージファイルパス1
     * @param imagename1 The value of the column 'IMAGENAME1'. (NullAllowed)
     */
    public void setImagename1(String imagename1) {
        __modifiedProperties.add("imagename1");
        this._imagename1 = imagename1;
    }

    /**
     * [get] IMAGENAME2: {varchar(4000)} <br>
     * イメージファイルパス2
     * @return The value of the column 'IMAGENAME2'. (NullAllowed)
     */
    public String getImagename2() {
        return _imagename2;
    }

    /**
     * [set] IMAGENAME2: {varchar(4000)} <br>
     * イメージファイルパス2
     * @param imagename2 The value of the column 'IMAGENAME2'. (NullAllowed)
     */
    public void setImagename2(String imagename2) {
        __modifiedProperties.add("imagename2");
        this._imagename2 = imagename2;
    }

    /**
     * [get] IMAGENAME3: {varchar(4000)} <br>
     * イメージファイルパス3
     * @return The value of the column 'IMAGENAME3'. (NullAllowed)
     */
    public String getImagename3() {
        return _imagename3;
    }

    /**
     * [set] IMAGENAME3: {varchar(4000)} <br>
     * イメージファイルパス3
     * @param imagename3 The value of the column 'IMAGENAME3'. (NullAllowed)
     */
    public void setImagename3(String imagename3) {
        __modifiedProperties.add("imagename3");
        this._imagename3 = imagename3;
    }

    /**
     * [get] WAREHOUSE_SNAME: {varchar(100)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSE_SNAME'. (NullAllowed)
     */
    public String getWarehouseSname() {
        return _warehouseSname;
    }

    /**
     * [set] WAREHOUSE_SNAME: {varchar(100)} <br>
     * 拠点名称
     * @param warehouseSname The value of the column 'WAREHOUSE_SNAME'. (NullAllowed)
     */
    public void setWarehouseSname(String warehouseSname) {
        __modifiedProperties.add("warehouseSname");
        this._warehouseSname = warehouseSname;
    }

    /**
     * [get] ITEM_SNAME: {varchar(100)} <br>
     * 銘柄名称
     * @return The value of the column 'ITEM_SNAME'. (NullAllowed)
     */
    public String getItemSname() {
        return _itemSname;
    }

    /**
     * [set] ITEM_SNAME: {varchar(100)} <br>
     * 銘柄名称
     * @param itemSname The value of the column 'ITEM_SNAME'. (NullAllowed)
     */
    public void setItemSname(String itemSname) {
        __modifiedProperties.add("itemSname");
        this._itemSname = itemSname;
    }

    /**
     * [get] FOREIGNCARGOCD: {char(1)} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOCD'. (NullAllowed)
     */
    public String getForeigncargocd() {
        return _foreigncargocd;
    }

    /**
     * [set] FOREIGNCARGOCD: {char(1)} <br>
     * 内貨・外貨区分
     * @param foreigncargocd The value of the column 'FOREIGNCARGOCD'. (NullAllowed)
     */
    public void setForeigncargocd(String foreigncargocd) {
        __modifiedProperties.add("foreigncargocd");
        this._foreigncargocd = foreigncargocd;
    }

    /**
     * [get] CARRIERSEQ: {varchar(30)} <br>
     * 銘柄マスタ使用区分
     * @return The value of the column 'CARRIERSEQ'. (NullAllowed)
     */
    public String getCarrierseq() {
        return _carrierseq;
    }

    /**
     * [set] CARRIERSEQ: {varchar(30)} <br>
     * 銘柄マスタ使用区分
     * @param carrierseq The value of the column 'CARRIERSEQ'. (NullAllowed)
     */
    public void setCarrierseq(String carrierseq) {
        __modifiedProperties.add("carrierseq");
        this._carrierseq = carrierseq;
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
     * [get] USERNUM3: {bigint(19)} <br>
     * 一般出力順
     * @return The value of the column 'USERNUM3'. (NullAllowed)
     */
    public Long getUsernum3() {
        return _usernum3;
    }

    /**
     * [set] USERNUM3: {bigint(19)} <br>
     * 一般出力順
     * @param usernum3 The value of the column 'USERNUM3'. (NullAllowed)
     */
    public void setUsernum3(Long usernum3) {
        __modifiedProperties.add("usernum3");
        this._usernum3 = usernum3;
    }

    /**
     * [get] ADDRESS2: {varchar(255)} <br>
     * 親拠点CD
     * @return The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public String getAddress2() {
        return _address2;
    }

    /**
     * [set] ADDRESS2: {varchar(255)} <br>
     * 親拠点CD
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public void setAddress2(String address2) {
        __modifiedProperties.add("address2");
        this._address2 = address2;
    }

    /**
     * [get] AcceptUserCd: {varchar(30)} <br>
     * 受入検品ユーザCD
     * @return The value of the column 'AcceptUserCd'. (NullAllowed)
     */
    public String getAcceptusercd() {
        return _acceptusercd;
    }

    /**
     * [set] AcceptUserCd: {varchar(30)} <br>
     * 受入検品ユーザCD
     * @param acceptusercd The value of the column 'AcceptUserCd'. (NullAllowed)
     */
    public void setAcceptusercd(String acceptusercd) {
        __modifiedProperties.add("acceptusercd");
        this._acceptusercd = acceptusercd;
    }

    /**
     * [get] AcceptDate: {varchar(8)} <br>
     * 受入検品日時
     * @return The value of the column 'AcceptDate'. (NullAllowed)
     */
    public String getAcceptdate() {
        return _acceptdate;
    }

    /**
     * [set] AcceptDate: {varchar(8)} <br>
     * 受入検品日時
     * @param acceptdate The value of the column 'AcceptDate'. (NullAllowed)
     */
    public void setAcceptdate(String acceptdate) {
        __modifiedProperties.add("acceptdate");
        this._acceptdate = acceptdate;
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
