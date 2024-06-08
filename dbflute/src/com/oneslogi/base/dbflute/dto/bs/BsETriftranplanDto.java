package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_TRIFTRANPLAN as TABLE. <br>
 * IF輸送受払計画中間
 * <pre>
 * [primary-key]
 *     UJTYPE, RECNO
 *
 * [column]
 *     UJTYPE, RECNO, WAREHOUSECD, REFNO, SHIPCD, SHIPSCHDATE, SHIPTOCD, SHIPTOSCHDATE, DATATYPE, PRODUCT_CD, QTY, SUBWAREHOUSECD, RESULTFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsETriftranplanDto implements Serializable {

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
    /** UJTYPE: {PK, NotNull, char(1)} */
    @JsonKey
    protected String _ujtype;

    /** RECNO: {PK, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _recno;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** REFNO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _refno;

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

    /** DATATYPE: {NotNull, char(1)} */
    @JsonKey
    protected String _datatype;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** QTY: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _qty;

    /** SUBWAREHOUSECD: {varchar(30)} */
    @JsonKey
    protected String _subwarehousecd;

    /** RESULTFLG: {char(1)} */
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
    public BsETriftranplanDto() {
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
        if (other == null || !(other instanceof BsETriftranplanDto)) { return false; }
        final BsETriftranplanDto otherEntity = (BsETriftranplanDto)other;
        if (!helpComparingValue(getUjtype(), otherEntity.getUjtype())) { return false; }
        if (!helpComparingValue(getRecno(), otherEntity.getRecno())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_TRIFTRANPLAN");
        result = xCH(result, getUjtype());
        result = xCH(result, getRecno());
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
        sb.append(c).append(getUjtype());
        sb.append(c).append(getRecno());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getRefno());
        sb.append(c).append(getShipcd());
        sb.append(c).append(getShipschdate());
        sb.append(c).append(getShiptocd());
        sb.append(c).append(getShiptoschdate());
        sb.append(c).append(getDatatype());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getQty());
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
     * [get] UJTYPE: {PK, NotNull, char(1)} <br>
     * 輸入／国産区分
     * @return The value of the column 'UJTYPE'. (NullAllowed)
     */
    public String getUjtype() {
        return _ujtype;
    }

    /**
     * [set] UJTYPE: {PK, NotNull, char(1)} <br>
     * 輸入／国産区分
     * @param ujtype The value of the column 'UJTYPE'. (NullAllowed)
     */
    public void setUjtype(String ujtype) {
        __modifiedProperties.add("ujtype");
        this._ujtype = ujtype;
    }

    /**
     * [get] RECNO: {PK, NotNull, decimal(16, 6)} <br>
     * レコード番号
     * @return The value of the column 'RECNO'. (NullAllowed)
     */
    public java.math.BigDecimal getRecno() {
        return _recno;
    }

    /**
     * [set] RECNO: {PK, NotNull, decimal(16, 6)} <br>
     * レコード番号
     * @param recno The value of the column 'RECNO'. (NullAllowed)
     */
    public void setRecno(java.math.BigDecimal recno) {
        __modifiedProperties.add("recno");
        this._recno = recno;
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
     * [get] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SHIPCD'. (NullAllowed)
     */
    public String getShipcd() {
        return _shipcd;
    }

    /**
     * [set] SHIPCD: {NotNull, varchar(30)} <br>
     * 発送元CD
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
     * 受入先CD
     * @return The value of the column 'SHIPTOCD'. (NullAllowed)
     */
    public String getShiptocd() {
        return _shiptocd;
    }

    /**
     * [set] SHIPTOCD: {NotNull, varchar(30)} <br>
     * 受入先CD
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
     * [get] DATATYPE: {NotNull, char(1)} <br>
     * 修正区分
     * @return The value of the column 'DATATYPE'. (NullAllowed)
     */
    public String getDatatype() {
        return _datatype;
    }

    /**
     * [set] DATATYPE: {NotNull, char(1)} <br>
     * 修正区分
     * @param datatype The value of the column 'DATATYPE'. (NullAllowed)
     */
    public void setDatatype(String datatype) {
        __modifiedProperties.add("datatype");
        this._datatype = datatype;
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
     * 個数
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public Long getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {NotNull, bigint(19), default=[(0)]} <br>
     * 個数
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(Long qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
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
     * [get] RESULTFLG: {char(1)} <br>
     * ワーニングフラグ
     * @return The value of the column 'RESULTFLG'. (NullAllowed)
     */
    public String getResultflg() {
        return _resultflg;
    }

    /**
     * [set] RESULTFLG: {char(1)} <br>
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
