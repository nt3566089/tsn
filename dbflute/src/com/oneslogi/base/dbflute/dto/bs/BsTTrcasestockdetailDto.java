package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRCASESTOCKDETAIL as TABLE. <br>
 * ケース補充明細情報
 * <pre>
 * [primary-key]
 *     TRCASESTOCKDETAIL_ID
 *
 * [column]
 *     TRCASESTOCKDETAIL_ID, CASESTOCKDETAILNO, CENTER_SYMBOL_ID, SORTSTOCKDATE, WORKTIME, SORTSTOCKKBN, OPERATETIMES, SOTEDUNIT, SORTLOCCD, PRODUCT_CD, OPERATEQTY, MANUFACTUREDATE, CONFIRMNO, PRINTDATETIME, PRINTEDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRCASESTOCKDETAIL_ID
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
public abstract class BsTTrcasestockdetailDto implements Serializable {

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
    /** TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trcasestockdetailId;

    /** CASESTOCKDETAILNO: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _casestockdetailno;

    /** CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _centerSymbolId;

    /** SORTSTOCKDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _sortstockdate;

    /** WORKTIME: {NotNull, varchar(6)} */
    @JsonKey
    protected String _worktime;

    /** SORTSTOCKKBN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sortstockkbn;

    /** OPERATETIMES: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _operatetimes;

    /** SOTEDUNIT: {IX+, NotNull, varchar(30)} */
    @JsonKey
    protected String _sotedunit;

    /** SORTLOCCD: {NotNull, varchar(255)} */
    @JsonKey
    protected String _sortloccd;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** OPERATEQTY: {varchar(255)} */
    @JsonKey
    protected String _operateqty;

    /** MANUFACTUREDATE: {varchar(8)} */
    @JsonKey
    protected String _manufacturedate;

    /** CONFIRMNO: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _confirmno;

    /** PRINTDATETIME: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _printdatetime;

    /** PRINTEDFLG: {NotNull, char(1), default=[(0)]} */
    @JsonKey
    protected String _printedflg;

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
    public BsTTrcasestockdetailDto() {
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
        if (other == null || !(other instanceof BsTTrcasestockdetailDto)) { return false; }
        final BsTTrcasestockdetailDto otherEntity = (BsTTrcasestockdetailDto)other;
        if (!helpComparingValue(getTrcasestockdetailId(), otherEntity.getTrcasestockdetailId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRCASESTOCKDETAIL");
        result = xCH(result, getTrcasestockdetailId());
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
        sb.append(c).append(getTrcasestockdetailId());
        sb.append(c).append(getCasestockdetailno());
        sb.append(c).append(getCenterSymbolId());
        sb.append(c).append(getSortstockdate());
        sb.append(c).append(getWorktime());
        sb.append(c).append(getSortstockkbn());
        sb.append(c).append(getOperatetimes());
        sb.append(c).append(getSotedunit());
        sb.append(c).append(getSortloccd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getOperateqty());
        sb.append(c).append(getManufacturedate());
        sb.append(c).append(getConfirmno());
        sb.append(c).append(getPrintdatetime());
        sb.append(c).append(getPrintedflg());
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
     * [get] TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ケース補充明細情報ID
     * @return The value of the column 'TRCASESTOCKDETAIL_ID'. (NullAllowed)
     */
    public Long getTrcasestockdetailId() {
        return _trcasestockdetailId;
    }

    /**
     * [set] TRCASESTOCKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * ケース補充明細情報ID
     * @param trcasestockdetailId The value of the column 'TRCASESTOCKDETAIL_ID'. (NullAllowed)
     */
    public void setTrcasestockdetailId(Long trcasestockdetailId) {
        __modifiedProperties.add("trcasestockdetailId");
        this._trcasestockdetailId = trcasestockdetailId;
    }

    /**
     * [get] CASESTOCKDETAILNO: {NotNull, bigint(19)} <br>
     * ケース補充明細番号
     * @return The value of the column 'CASESTOCKDETAILNO'. (NullAllowed)
     */
    public Long getCasestockdetailno() {
        return _casestockdetailno;
    }

    /**
     * [set] CASESTOCKDETAILNO: {NotNull, bigint(19)} <br>
     * ケース補充明細番号
     * @param casestockdetailno The value of the column 'CASESTOCKDETAILNO'. (NullAllowed)
     */
    public void setCasestockdetailno(Long casestockdetailno) {
        __modifiedProperties.add("casestockdetailno");
        this._casestockdetailno = casestockdetailno;
    }

    /**
     * [get] CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)} <br>
     * 拠点シンボルID
     * @return The value of the column 'CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public java.math.BigDecimal getCenterSymbolId() {
        return _centerSymbolId;
    }

    /**
     * [set] CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)} <br>
     * 拠点シンボルID
     * @param centerSymbolId The value of the column 'CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public void setCenterSymbolId(java.math.BigDecimal centerSymbolId) {
        __modifiedProperties.add("centerSymbolId");
        this._centerSymbolId = centerSymbolId;
    }

    /**
     * [get] SORTSTOCKDATE: {NotNull, varchar(8)} <br>
     * ラック間製品移動日
     * @return The value of the column 'SORTSTOCKDATE'. (NullAllowed)
     */
    public String getSortstockdate() {
        return _sortstockdate;
    }

    /**
     * [set] SORTSTOCKDATE: {NotNull, varchar(8)} <br>
     * ラック間製品移動日
     * @param sortstockdate The value of the column 'SORTSTOCKDATE'. (NullAllowed)
     */
    public void setSortstockdate(String sortstockdate) {
        __modifiedProperties.add("sortstockdate");
        this._sortstockdate = sortstockdate;
    }

    /**
     * [get] WORKTIME: {NotNull, varchar(6)} <br>
     * 作業時刻
     * @return The value of the column 'WORKTIME'. (NullAllowed)
     */
    public String getWorktime() {
        return _worktime;
    }

    /**
     * [set] WORKTIME: {NotNull, varchar(6)} <br>
     * 作業時刻
     * @param worktime The value of the column 'WORKTIME'. (NullAllowed)
     */
    public void setWorktime(String worktime) {
        __modifiedProperties.add("worktime");
        this._worktime = worktime;
    }

    /**
     * [get] SORTSTOCKKBN: {NotNull, varchar(30)} <br>
     * 仕分補充区分
     * @return The value of the column 'SORTSTOCKKBN'. (NullAllowed)
     */
    public String getSortstockkbn() {
        return _sortstockkbn;
    }

    /**
     * [set] SORTSTOCKKBN: {NotNull, varchar(30)} <br>
     * 仕分補充区分
     * @param sortstockkbn The value of the column 'SORTSTOCKKBN'. (NullAllowed)
     */
    public void setSortstockkbn(String sortstockkbn) {
        __modifiedProperties.add("sortstockkbn");
        this._sortstockkbn = sortstockkbn;
    }

    /**
     * [get] OPERATETIMES: {NotNull, decimal(16, 6)} <br>
     * 操作回数
     * @return The value of the column 'OPERATETIMES'. (NullAllowed)
     */
    public java.math.BigDecimal getOperatetimes() {
        return _operatetimes;
    }

    /**
     * [set] OPERATETIMES: {NotNull, decimal(16, 6)} <br>
     * 操作回数
     * @param operatetimes The value of the column 'OPERATETIMES'. (NullAllowed)
     */
    public void setOperatetimes(java.math.BigDecimal operatetimes) {
        __modifiedProperties.add("operatetimes");
        this._operatetimes = operatetimes;
    }

    /**
     * [get] SOTEDUNIT: {IX+, NotNull, varchar(30)} <br>
     * 補充先
     * @return The value of the column 'SOTEDUNIT'. (NullAllowed)
     */
    public String getSotedunit() {
        return _sotedunit;
    }

    /**
     * [set] SOTEDUNIT: {IX+, NotNull, varchar(30)} <br>
     * 補充先
     * @param sotedunit The value of the column 'SOTEDUNIT'. (NullAllowed)
     */
    public void setSotedunit(String sotedunit) {
        __modifiedProperties.add("sotedunit");
        this._sotedunit = sotedunit;
    }

    /**
     * [get] SORTLOCCD: {NotNull, varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'SORTLOCCD'. (NullAllowed)
     */
    public String getSortloccd() {
        return _sortloccd;
    }

    /**
     * [set] SORTLOCCD: {NotNull, varchar(255)} <br>
     * 仕分ロケ
     * @param sortloccd The value of the column 'SORTLOCCD'. (NullAllowed)
     */
    public void setSortloccd(String sortloccd) {
        __modifiedProperties.add("sortloccd");
        this._sortloccd = sortloccd;
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
     * [get] OPERATEQTY: {varchar(255)} <br>
     * 操作数量（カートン）
     * @return The value of the column 'OPERATEQTY'. (NullAllowed)
     */
    public String getOperateqty() {
        return _operateqty;
    }

    /**
     * [set] OPERATEQTY: {varchar(255)} <br>
     * 操作数量（カートン）
     * @param operateqty The value of the column 'OPERATEQTY'. (NullAllowed)
     */
    public void setOperateqty(String operateqty) {
        __modifiedProperties.add("operateqty");
        this._operateqty = operateqty;
    }

    /**
     * [get] MANUFACTUREDATE: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'MANUFACTUREDATE'. (NullAllowed)
     */
    public String getManufacturedate() {
        return _manufacturedate;
    }

    /**
     * [set] MANUFACTUREDATE: {varchar(8)} <br>
     * 製造年月日
     * @param manufacturedate The value of the column 'MANUFACTUREDATE'. (NullAllowed)
     */
    public void setManufacturedate(String manufacturedate) {
        __modifiedProperties.add("manufacturedate");
        this._manufacturedate = manufacturedate;
    }

    /**
     * [get] CONFIRMNO: {decimal(16, 6)} <br>
     * 確認番号
     * @return The value of the column 'CONFIRMNO'. (NullAllowed)
     */
    public java.math.BigDecimal getConfirmno() {
        return _confirmno;
    }

    /**
     * [set] CONFIRMNO: {decimal(16, 6)} <br>
     * 確認番号
     * @param confirmno The value of the column 'CONFIRMNO'. (NullAllowed)
     */
    public void setConfirmno(java.math.BigDecimal confirmno) {
        __modifiedProperties.add("confirmno");
        this._confirmno = confirmno;
    }

    /**
     * [get] PRINTDATETIME: {datetime2(26, 6)} <br>
     * 印刷日時
     * @return The value of the column 'PRINTDATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPrintdatetime() {
        return _printdatetime;
    }

    /**
     * [set] PRINTDATETIME: {datetime2(26, 6)} <br>
     * 印刷日時
     * @param printdatetime The value of the column 'PRINTDATETIME'. (NullAllowed)
     */
    public void setPrintdatetime(java.sql.Timestamp printdatetime) {
        __modifiedProperties.add("printdatetime");
        this._printdatetime = printdatetime;
    }

    /**
     * [get] PRINTEDFLG: {NotNull, char(1), default=[(0)]} <br>
     * 印刷済フラグ
     * @return The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public String getPrintedflg() {
        return _printedflg;
    }

    /**
     * [set] PRINTEDFLG: {NotNull, char(1), default=[(0)]} <br>
     * 印刷済フラグ
     * @param printedflg The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public void setPrintedflg(String printedflg) {
        __modifiedProperties.add("printedflg");
        this._printedflg = printedflg;
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
