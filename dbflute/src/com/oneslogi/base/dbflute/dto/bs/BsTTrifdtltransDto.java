package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRIFDTLTRANS as TABLE. <br>
 * 一次輸送詳細
 * <pre>
 * [primary-key]
 *     TRIFDTLTRANS_ID
 *
 * [column]
 *     TRIFDTLTRANS_ID, REFNO, REFLINENO, SHIPCD, SHIPSCHDATE, SHIPTOCD, SHIPTOSCHDATE, PRODUCT_CD, QTY, PRODUCTIONYM, DESIGNCD, QANO, RCVPALLETNO, FIRMCARRYNO, BATJPRODUCTIONYM, SUBWAREHOUSECD, RESULTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIFDTLTRANS_ID
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
public abstract class BsTTrifdtltransDto implements Serializable {

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
    /** TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trifdtltransId;

    /** REFNO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _refno;

    /** REFLINENO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _reflineno;

    /** SHIPCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _shipcd;

    /** SHIPSCHDATE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _shipschdate;

    /** SHIPTOCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _shiptocd;

    /** SHIPTOSCHDATE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _shiptoschdate;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _qty;

    /** PRODUCTIONYM: {varchar(30)} */
    @JsonKey
    protected String _productionym;

    /** DESIGNCD: {varchar(30)} */
    @JsonKey
    protected String _designcd;

    /** QANO: {varchar(30)} */
    @JsonKey
    protected String _qano;

    /** RCVPALLETNO: {varchar(30)} */
    @JsonKey
    protected String _rcvpalletno;

    /** FIRMCARRYNO: {varchar(30)} */
    @JsonKey
    protected String _firmcarryno;

    /** BATJPRODUCTIONYM: {varchar(30)} */
    @JsonKey
    protected String _batjproductionym;

    /** SUBWAREHOUSECD: {varchar(30)} */
    @JsonKey
    protected String _subwarehousecd;

    /** RESULTFLG: {char(1), default=[0]} */
    @JsonKey
    protected String _resultflg;

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
    public BsTTrifdtltransDto() {
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
        if (other == null || !(other instanceof BsTTrifdtltransDto)) { return false; }
        final BsTTrifdtltransDto otherEntity = (BsTTrifdtltransDto)other;
        if (!helpComparingValue(getTrifdtltransId(), otherEntity.getTrifdtltransId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRIFDTLTRANS");
        result = xCH(result, getTrifdtltransId());
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
        sb.append(c).append(getTrifdtltransId());
        sb.append(c).append(getRefno());
        sb.append(c).append(getReflineno());
        sb.append(c).append(getShipcd());
        sb.append(c).append(getShipschdate());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getShiptoschdate());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getQty());
        sb.append(c).append(getProductionym());
        sb.append(c).append(getDesigncd());
        sb.append(c).append(getQano());
        sb.append(c).append(getRcvpalletno());
        sb.append(c).append(getFirmcarryno());
        sb.append(c).append(getBatjproductionym());
        sb.append(c).append(getSubwarehousecd());
        sb.append(c).append(getResultflg());
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
     * [get] TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 一次輸送詳細ID
     * @return The value of the column 'TRIFDTLTRANS_ID'. (NullAllowed)
     */
    public Long getTrifdtltransId() {
        return _trifdtltransId;
    }

    /**
     * [set] TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 一次輸送詳細ID
     * @param trifdtltransId The value of the column 'TRIFDTLTRANS_ID'. (NullAllowed)
     */
    public void setTrifdtltransId(Long trifdtltransId) {
        __modifiedProperties.add("trifdtltransId");
        this._trifdtltransId = trifdtltransId;
    }

    /**
     * [get] REFNO: {NotNull, varchar(30)} <br>
     * 整理番号
     * @return The value of the column 'REFNO'. (NullAllowed)
     */
    public String getRefno() {
        return _refno;
    }

    /**
     * [set] REFNO: {NotNull, varchar(30)} <br>
     * 整理番号
     * @param refno The value of the column 'REFNO'. (NullAllowed)
     */
    public void setRefno(String refno) {
        __modifiedProperties.add("refno");
        this._refno = refno;
    }

    /**
     * [get] REFLINENO: {NotNull, bigint(19)} <br>
     * 明細番号
     * @return The value of the column 'REFLINENO'. (NullAllowed)
     */
    public Long getReflineno() {
        return _reflineno;
    }

    /**
     * [set] REFLINENO: {NotNull, bigint(19)} <br>
     * 明細番号
     * @param reflineno The value of the column 'REFLINENO'. (NullAllowed)
     */
    public void setReflineno(Long reflineno) {
        __modifiedProperties.add("reflineno");
        this._reflineno = reflineno;
    }

    /**
     * [get] SHIPCD: {NotNull, varchar(30)} <br>
     * 発地CD
     * @return The value of the column 'SHIPCD'. (NullAllowed)
     */
    public String getShipcd() {
        return _shipcd;
    }

    /**
     * [set] SHIPCD: {NotNull, varchar(30)} <br>
     * 発地CD
     * @param shipcd The value of the column 'SHIPCD'. (NullAllowed)
     */
    public void setShipcd(String shipcd) {
        __modifiedProperties.add("shipcd");
        this._shipcd = shipcd;
    }

    /**
     * [get] SHIPSCHDATE: {NotNull, varchar(30)} <br>
     * 発送予定年月日
     * @return The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public String getShipschdate() {
        return _shipschdate;
    }

    /**
     * [set] SHIPSCHDATE: {NotNull, varchar(30)} <br>
     * 発送予定年月日
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (NullAllowed)
     */
    public void setShipschdate(String shipschdate) {
        __modifiedProperties.add("shipschdate");
        this._shipschdate = shipschdate;
    }

    /**
     * [get] SHIPTOCD: {NotNull, varchar(30)} <br>
     * 受地CD
     * @return The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public String getShiptocd() {
        return _shiptocd;
    }

    /**
     * [set] SHIPTOCD: {NotNull, varchar(30)} <br>
     * 受地CD
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public void setShiptocd(String shiptocd) {
        __modifiedProperties.add("shiptocd");
        this._shiptocd = shiptocd;
    }

    /**
     * [get] SHIPTOSCHDATE: {NotNull, varchar(30)} <br>
     * 受入予定年月日
     * @return The value of the column 'SHIPTOSCHDATE'. (NullAllowed)
     */
    public String getShiptoschdate() {
        return _shiptoschdate;
    }

    /**
     * [set] SHIPTOSCHDATE: {NotNull, varchar(30)} <br>
     * 受入予定年月日
     * @param shiptoschdate The value of the column 'SHIPTOSCHDATE'. (NullAllowed)
     */
    public void setShiptoschdate(String shiptoschdate) {
        __modifiedProperties.add("shiptoschdate");
        this._shiptoschdate = shiptoschdate;
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
     * [get] QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 数量（１３桁）
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public Long getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 数量（１３桁）
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(Long qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
    }

    /**
     * [get] PRODUCTIONYM: {varchar(30)} <br>
     * 製造情報
     * @return The value of the column 'PRODUCTIONYM'. (NullAllowed)
     */
    public String getProductionym() {
        return _productionym;
    }

    /**
     * [set] PRODUCTIONYM: {varchar(30)} <br>
     * 製造情報
     * @param productionym The value of the column 'PRODUCTIONYM'. (NullAllowed)
     */
    public void setProductionym(String productionym) {
        __modifiedProperties.add("productionym");
        this._productionym = productionym;
    }

    /**
     * [get] DESIGNCD: {varchar(30)} <br>
     * 今回デザイン
     * @return The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public String getDesigncd() {
        return _designcd;
    }

    /**
     * [set] DESIGNCD: {varchar(30)} <br>
     * 今回デザイン
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public void setDesigncd(String designcd) {
        __modifiedProperties.add("designcd");
        this._designcd = designcd;
    }

    /**
     * [get] QANO: {varchar(30)} <br>
     * 問合せ番号
     * @return The value of the column 'QANO'. (NullAllowed)
     */
    public String getQano() {
        return _qano;
    }

    /**
     * [set] QANO: {varchar(30)} <br>
     * 問合せ番号
     * @param qano The value of the column 'QANO'. (NullAllowed)
     */
    public void setQano(String qano) {
        __modifiedProperties.add("qano");
        this._qano = qano;
    }

    /**
     * [get] RCVPALLETNO: {varchar(30)} <br>
     * パレット番号（０８需給）
     * @return The value of the column 'RCVPALLETNO'. (NullAllowed)
     */
    public String getRcvpalletno() {
        return _rcvpalletno;
    }

    /**
     * [set] RCVPALLETNO: {varchar(30)} <br>
     * パレット番号（０８需給）
     * @param rcvpalletno The value of the column 'RCVPALLETNO'. (NullAllowed)
     */
    public void setRcvpalletno(String rcvpalletno) {
        __modifiedProperties.add("rcvpalletno");
        this._rcvpalletno = rcvpalletno;
    }

    /**
     * [get] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public String getFirmcarryno() {
        return _firmcarryno;
    }

    /**
     * [set] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmcarryno The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public void setFirmcarryno(String firmcarryno) {
        __modifiedProperties.add("firmcarryno");
        this._firmcarryno = firmcarryno;
    }

    /**
     * [get] BATJPRODUCTIONYM: {varchar(30)} <br>
     * BATJ製造月情報
     * @return The value of the column 'BATJPRODUCTIONYM'. (NullAllowed)
     */
    public String getBatjproductionym() {
        return _batjproductionym;
    }

    /**
     * [set] BATJPRODUCTIONYM: {varchar(30)} <br>
     * BATJ製造月情報
     * @param batjproductionym The value of the column 'BATJPRODUCTIONYM'. (NullAllowed)
     */
    public void setBatjproductionym(String batjproductionym) {
        __modifiedProperties.add("batjproductionym");
        this._batjproductionym = batjproductionym;
    }

    /**
     * [get] SUBWAREHOUSECD: {varchar(30)} <br>
     * 枝倉庫CD
     * @return The value of the column 'SUBWAREHOUSECD'. (NullAllowed)
     */
    public String getSubwarehousecd() {
        return _subwarehousecd;
    }

    /**
     * [set] SUBWAREHOUSECD: {varchar(30)} <br>
     * 枝倉庫CD
     * @param subwarehousecd The value of the column 'SUBWAREHOUSECD'. (NullAllowed)
     */
    public void setSubwarehousecd(String subwarehousecd) {
        __modifiedProperties.add("subwarehousecd");
        this._subwarehousecd = subwarehousecd;
    }

    /**
     * [get] RESULTFLG: {char(1), default=[0]} <br>
     * ワーニングフラグ
     * @return The value of the column 'RESULTFLG'. (NullAllowed)
     */
    public String getResultflg() {
        return _resultflg;
    }

    /**
     * [set] RESULTFLG: {char(1), default=[0]} <br>
     * ワーニングフラグ
     * @param resultflg The value of the column 'RESULTFLG'. (NullAllowed)
     */
    public void setResultflg(String resultflg) {
        __modifiedProperties.add("resultflg");
        this._resultflg = resultflg;
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
