package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of W_WKGDITMSTOCKDIFFHISTORYB as TABLE. <br>
 * 適品在庫過不足履歴簿作成用ワーク
 * <pre>
 * [primary-key]
 *     PRINTKEY, WAREHOUSECD, DIFFADDDATE, DIFFOCCAREA, PRODUCT_CD
 *
 * [column]
 *     PRINTKEY, WAREHOUSECD, WAREHOUSENAME, DIFFADDDATE, DIFFOCCAREA, PRODUCT_CD, ITEMNAME, DIFFQTY, INOUTKBN, ITEMORDERBY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsWWkgditmstockdiffhistorybDto implements Serializable {

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
    /** PRINTKEY: {PK, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _printkey;

    /** WAREHOUSECD: {PK, NotNull, varchar(60)} */
    @JsonKey
    protected String _warehousecd;

    /** WAREHOUSENAME: {varchar(100)} */
    @JsonKey
    protected String _warehousename;

    /** DIFFADDDATE: {PK, NotNull, varchar(8)} */
    @JsonKey
    protected String _diffadddate;

    /** DIFFOCCAREA: {PK, NotNull, char(1)} */
    @JsonKey
    protected String _diffoccarea;

    /** PRODUCT_CD: {PK, NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** ITEMNAME: {varchar(100)} */
    @JsonKey
    protected String _itemname;

    /** DIFFQTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _diffqty;

    /** INOUTKBN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _inoutkbn;

    /** ITEMORDERBY: {bigint(19)} */
    @JsonKey
    protected Long _itemorderby;

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
    public BsWWkgditmstockdiffhistorybDto() {
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
        if (other == null || !(other instanceof BsWWkgditmstockdiffhistorybDto)) { return false; }
        final BsWWkgditmstockdiffhistorybDto otherEntity = (BsWWkgditmstockdiffhistorybDto)other;
        if (!helpComparingValue(getPrintkey(), otherEntity.getPrintkey())) { return false; }
        if (!helpComparingValue(getWarehousecd(), otherEntity.getWarehousecd())) { return false; }
        if (!helpComparingValue(getDiffadddate(), otherEntity.getDiffadddate())) { return false; }
        if (!helpComparingValue(getDiffoccarea(), otherEntity.getDiffoccarea())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_WKGDITMSTOCKDIFFHISTORYB");
        result = xCH(result, getPrintkey());
        result = xCH(result, getWarehousecd());
        result = xCH(result, getDiffadddate());
        result = xCH(result, getDiffoccarea());
        result = xCH(result, getProductCd());
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
        sb.append(c).append(getWarehousename());
        sb.append(c).append(getDiffadddate());
        sb.append(c).append(getDiffoccarea());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getItemname());
        sb.append(c).append(getDiffqty());
        sb.append(c).append(getInoutkbn());
        sb.append(c).append(getItemorderby());
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
     * [get] PRINTKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 印刷キー
     * @return The value of the column 'PRINTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getPrintkey() {
        return _printkey;
    }

    /**
     * [set] PRINTKEY: {PK, NotNull, decimal(16, 6)} <br>
     * 印刷キー
     * @param printkey The value of the column 'PRINTKEY'. (NullAllowed)
     */
    public void setPrintkey(java.math.BigDecimal printkey) {
        __modifiedProperties.add("printkey");
        this._printkey = printkey;
    }

    /**
     * [get] WAREHOUSECD: {PK, NotNull, varchar(60)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public String getWarehousecd() {
        return _warehousecd;
    }

    /**
     * [set] WAREHOUSECD: {PK, NotNull, varchar(60)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed)
     */
    public void setWarehousecd(String warehousecd) {
        __modifiedProperties.add("warehousecd");
        this._warehousecd = warehousecd;
    }

    /**
     * [get] WAREHOUSENAME: {varchar(100)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSENAME'. (NullAllowed)
     */
    public String getWarehousename() {
        return _warehousename;
    }

    /**
     * [set] WAREHOUSENAME: {varchar(100)} <br>
     * 拠点名称
     * @param warehousename The value of the column 'WAREHOUSENAME'. (NullAllowed)
     */
    public void setWarehousename(String warehousename) {
        __modifiedProperties.add("warehousename");
        this._warehousename = warehousename;
    }

    /**
     * [get] DIFFADDDATE: {PK, NotNull, varchar(8)} <br>
     * 過不足登録日
     * @return The value of the column 'DIFFADDDATE'. (NullAllowed)
     */
    public String getDiffadddate() {
        return _diffadddate;
    }

    /**
     * [set] DIFFADDDATE: {PK, NotNull, varchar(8)} <br>
     * 過不足登録日
     * @param diffadddate The value of the column 'DIFFADDDATE'. (NullAllowed)
     */
    public void setDiffadddate(String diffadddate) {
        __modifiedProperties.add("diffadddate");
        this._diffadddate = diffadddate;
    }

    /**
     * [get] DIFFOCCAREA: {PK, NotNull, char(1)} <br>
     * 過不足発生場所
     * @return The value of the column 'DIFFOCCAREA'. (NullAllowed)
     */
    public String getDiffoccarea() {
        return _diffoccarea;
    }

    /**
     * [set] DIFFOCCAREA: {PK, NotNull, char(1)} <br>
     * 過不足発生場所
     * @param diffoccarea The value of the column 'DIFFOCCAREA'. (NullAllowed)
     */
    public void setDiffoccarea(String diffoccarea) {
        __modifiedProperties.add("diffoccarea");
        this._diffoccarea = diffoccarea;
    }

    /**
     * [get] PRODUCT_CD: {PK, NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {PK, NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] ITEMNAME: {varchar(100)} <br>
     * 銘柄名称
     * @return The value of the column 'ITEMNAME'. (NullAllowed)
     */
    public String getItemname() {
        return _itemname;
    }

    /**
     * [set] ITEMNAME: {varchar(100)} <br>
     * 銘柄名称
     * @param itemname The value of the column 'ITEMNAME'. (NullAllowed)
     */
    public void setItemname(String itemname) {
        __modifiedProperties.add("itemname");
        this._itemname = itemname;
    }

    /**
     * [get] DIFFQTY: {decimal(16, 6)} <br>
     * 過不足数
     * @return The value of the column 'DIFFQTY'. (NullAllowed)
     */
    public java.math.BigDecimal getDiffqty() {
        return _diffqty;
    }

    /**
     * [set] DIFFQTY: {decimal(16, 6)} <br>
     * 過不足数
     * @param diffqty The value of the column 'DIFFQTY'. (NullAllowed)
     */
    public void setDiffqty(java.math.BigDecimal diffqty) {
        __modifiedProperties.add("diffqty");
        this._diffqty = diffqty;
    }

    /**
     * [get] INOUTKBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public String getInoutkbn() {
        return _inoutkbn;
    }

    /**
     * [set] INOUTKBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @param inoutkbn The value of the column 'INOUTKBN'. (NullAllowed)
     */
    public void setInoutkbn(String inoutkbn) {
        __modifiedProperties.add("inoutkbn");
        this._inoutkbn = inoutkbn;
    }

    /**
     * [get] ITEMORDERBY: {bigint(19)} <br>
     * 一般出力順
     * @return The value of the column 'ITEMORDERBY'. (NullAllowed)
     */
    public Long getItemorderby() {
        return _itemorderby;
    }

    /**
     * [set] ITEMORDERBY: {bigint(19)} <br>
     * 一般出力順
     * @param itemorderby The value of the column 'ITEMORDERBY'. (NullAllowed)
     */
    public void setItemorderby(Long itemorderby) {
        __modifiedProperties.add("itemorderby");
        this._itemorderby = itemorderby;
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
