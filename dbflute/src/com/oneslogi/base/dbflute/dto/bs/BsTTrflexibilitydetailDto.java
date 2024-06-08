package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRFLEXIBILITYDETAIL as TABLE. <br>
 * 融通輸送明細情報
 * <pre>
 * [primary-key]
 *     FLEXIBLE_TRANSPORT_DETAIL_INFO_ID
 *
 * [column]
 *     FLEXIBLE_TRANSPORT_DETAIL_INFO_ID, FLEXIBLE_TRANSPORT_INFO_ID, FLEXIBITYLINENO, PRODUCT_ID, STDDIFFLG, FLEXPICKLISTNO, PRINTEDFLG, COMPLETEFLG, MANUFACTUREDATE, DESIGNCD, QTYCASE, QTYBOWL, HTQTYCASE, HTQTYBOWL, NV_EXTDATA1, CENTER_ID, CLIENT_ID, SOID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FLEXIBLE_TRANSPORT_DETAIL_INFO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_TRFLEXIBILITY
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tTrflexibility
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrflexibilitydetailDto implements Serializable {

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
    /** FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _flexibleTransportDetailInfoId;

    /** FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY} */
    @JsonKey
    protected Long _flexibleTransportInfoId;

    /** FLEXIBITYLINENO: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _flexibitylineno;

    /** PRODUCT_ID: {IX+, NotNull, bigint(19)} */
    @JsonKey
    protected Long _productId;

    /** STDDIFFLG: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _stddifflg;

    /** FLEXPICKLISTNO: {IX, NotNull, varchar(30)} */
    @JsonKey
    protected String _flexpicklistno;

    /** PRINTEDFLG: {NotNull, char(1)} */
    @JsonKey
    protected String _printedflg;

    /** COMPLETEFLG: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _completeflg;

    /** MANUFACTUREDATE: {varchar(8)} */
    @JsonKey
    protected String _manufacturedate;

    /** DESIGNCD: {varchar(30)} */
    @JsonKey
    protected String _designcd;

    /** QTYCASE: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qtycase;

    /** QTYBOWL: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qtybowl;

    /** HTQTYCASE: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _htqtycase;

    /** HTQTYBOWL: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _htqtybowl;

    /** NV_EXTDATA1: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata1;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** SOID: {bigint(19)} */
    @JsonKey
    protected Long _soid;

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
    public BsTTrflexibilitydetailDto() {
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
    protected TTrflexibilityDto _tTrflexibility;

    public TTrflexibilityDto getTTrflexibility() {
        return _tTrflexibility;
    }

    public void setTTrflexibility(TTrflexibilityDto tTrflexibility) {
        this._tTrflexibility = tTrflexibility;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrflexibilitydetailDto)) { return false; }
        final BsTTrflexibilitydetailDto otherEntity = (BsTTrflexibilitydetailDto)other;
        if (!helpComparingValue(getFlexibleTransportDetailInfoId(), otherEntity.getFlexibleTransportDetailInfoId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRFLEXIBILITYDETAIL");
        result = xCH(result, getFlexibleTransportDetailInfoId());
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
        sb.append(c).append(getFlexibleTransportDetailInfoId());
        sb.append(c).append(getFlexibleTransportInfoId());
        sb.append(c).append(getFlexibitylineno());
        sb.append(c).append(getProductId());
        sb.append(c).append(getStddifflg());
        sb.append(c).append(getFlexpicklistno());
        sb.append(c).append(getPrintedflg());
        sb.append(c).append(getCompleteflg());
        sb.append(c).append(getManufacturedate());
        sb.append(c).append(getDesigncd());
        sb.append(c).append(getQtycase());
        sb.append(c).append(getQtybowl());
        sb.append(c).append(getHtqtycase());
        sb.append(c).append(getHtqtybowl());
        sb.append(c).append(getNvExtdata1());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getSoid());
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
     * [get] FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送明細情報ID
     * @return The value of the column 'FLEXIBLE_TRANSPORT_DETAIL_INFO_ID'. (NullAllowed)
     */
    public Long getFlexibleTransportDetailInfoId() {
        return _flexibleTransportDetailInfoId;
    }

    /**
     * [set] FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 融通輸送明細情報ID
     * @param flexibleTransportDetailInfoId The value of the column 'FLEXIBLE_TRANSPORT_DETAIL_INFO_ID'. (NullAllowed)
     */
    public void setFlexibleTransportDetailInfoId(Long flexibleTransportDetailInfoId) {
        __modifiedProperties.add("flexibleTransportDetailInfoId");
        this._flexibleTransportDetailInfoId = flexibleTransportDetailInfoId;
    }

    /**
     * [get] FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY} <br>
     * 融通輸送情報ID
     * @return The value of the column 'FLEXIBLE_TRANSPORT_INFO_ID'. (NullAllowed)
     */
    public Long getFlexibleTransportInfoId() {
        return _flexibleTransportInfoId;
    }

    /**
     * [set] FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY} <br>
     * 融通輸送情報ID
     * @param flexibleTransportInfoId The value of the column 'FLEXIBLE_TRANSPORT_INFO_ID'. (NullAllowed)
     */
    public void setFlexibleTransportInfoId(Long flexibleTransportInfoId) {
        __modifiedProperties.add("flexibleTransportInfoId");
        this._flexibleTransportInfoId = flexibleTransportInfoId;
    }

    /**
     * [get] FLEXIBITYLINENO: {NotNull, decimal(16, 6)} <br>
     * 融通行No.
     * @return The value of the column 'FLEXIBITYLINENO'. (NullAllowed)
     */
    public java.math.BigDecimal getFlexibitylineno() {
        return _flexibitylineno;
    }

    /**
     * [set] FLEXIBITYLINENO: {NotNull, decimal(16, 6)} <br>
     * 融通行No.
     * @param flexibitylineno The value of the column 'FLEXIBITYLINENO'. (NullAllowed)
     */
    public void setFlexibitylineno(java.math.BigDecimal flexibitylineno) {
        __modifiedProperties.add("flexibitylineno");
        this._flexibitylineno = flexibitylineno;
    }

    /**
     * [get] PRODUCT_ID: {IX+, NotNull, bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX+, NotNull, bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] STDDIFFLG: {NotNull, decimal(16, 6)} <br>
     * 通常異型品区分
     * @return The value of the column 'STDDIFFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getStddifflg() {
        return _stddifflg;
    }

    /**
     * [set] STDDIFFLG: {NotNull, decimal(16, 6)} <br>
     * 通常異型品区分
     * @param stddifflg The value of the column 'STDDIFFLG'. (NullAllowed)
     */
    public void setStddifflg(java.math.BigDecimal stddifflg) {
        __modifiedProperties.add("stddifflg");
        this._stddifflg = stddifflg;
    }

    /**
     * [get] FLEXPICKLISTNO: {IX, NotNull, varchar(30)} <br>
     * 融通山出しリストNo.
     * @return The value of the column 'FLEXPICKLISTNO'. (NullAllowed)
     */
    public String getFlexpicklistno() {
        return _flexpicklistno;
    }

    /**
     * [set] FLEXPICKLISTNO: {IX, NotNull, varchar(30)} <br>
     * 融通山出しリストNo.
     * @param flexpicklistno The value of the column 'FLEXPICKLISTNO'. (NullAllowed)
     */
    public void setFlexpicklistno(String flexpicklistno) {
        __modifiedProperties.add("flexpicklistno");
        this._flexpicklistno = flexpicklistno;
    }

    /**
     * [get] PRINTEDFLG: {NotNull, char(1)} <br>
     * 印刷済フラグ
     * @return The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public String getPrintedflg() {
        return _printedflg;
    }

    /**
     * [set] PRINTEDFLG: {NotNull, char(1)} <br>
     * 印刷済フラグ
     * @param printedflg The value of the column 'PRINTEDFLG'. (NullAllowed)
     */
    public void setPrintedflg(String printedflg) {
        __modifiedProperties.add("printedflg");
        this._printedflg = printedflg;
    }

    /**
     * [get] COMPLETEFLG: {decimal(16, 6)} <br>
     * 完了ステータス
     * @return The value of the column 'COMPLETEFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getCompleteflg() {
        return _completeflg;
    }

    /**
     * [set] COMPLETEFLG: {decimal(16, 6)} <br>
     * 完了ステータス
     * @param completeflg The value of the column 'COMPLETEFLG'. (NullAllowed)
     */
    public void setCompleteflg(java.math.BigDecimal completeflg) {
        __modifiedProperties.add("completeflg");
        this._completeflg = completeflg;
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
     * [get] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public String getDesigncd() {
        return _designcd;
    }

    /**
     * [set] DESIGNCD: {varchar(30)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public void setDesigncd(String designcd) {
        __modifiedProperties.add("designcd");
        this._designcd = designcd;
    }

    /**
     * [get] QTYCASE: {NotNull, decimal(16, 6)} <br>
     * 数量（ケース）
     * @return The value of the column 'QTYCASE'. (NullAllowed)
     */
    public java.math.BigDecimal getQtycase() {
        return _qtycase;
    }

    /**
     * [set] QTYCASE: {NotNull, decimal(16, 6)} <br>
     * 数量（ケース）
     * @param qtycase The value of the column 'QTYCASE'. (NullAllowed)
     */
    public void setQtycase(java.math.BigDecimal qtycase) {
        __modifiedProperties.add("qtycase");
        this._qtycase = qtycase;
    }

    /**
     * [get] QTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 数量（カートン）
     * @return The value of the column 'QTYBOWL'. (NullAllowed)
     */
    public java.math.BigDecimal getQtybowl() {
        return _qtybowl;
    }

    /**
     * [set] QTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 数量（カートン）
     * @param qtybowl The value of the column 'QTYBOWL'. (NullAllowed)
     */
    public void setQtybowl(java.math.BigDecimal qtybowl) {
        __modifiedProperties.add("qtybowl");
        this._qtybowl = qtybowl;
    }

    /**
     * [get] HTQTYCASE: {NotNull, decimal(16, 6)} <br>
     * 実績数量（ケース）
     * @return The value of the column 'HTQTYCASE'. (NullAllowed)
     */
    public java.math.BigDecimal getHtqtycase() {
        return _htqtycase;
    }

    /**
     * [set] HTQTYCASE: {NotNull, decimal(16, 6)} <br>
     * 実績数量（ケース）
     * @param htqtycase The value of the column 'HTQTYCASE'. (NullAllowed)
     */
    public void setHtqtycase(java.math.BigDecimal htqtycase) {
        __modifiedProperties.add("htqtycase");
        this._htqtycase = htqtycase;
    }

    /**
     * [get] HTQTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 実績数量（カートン）
     * @return The value of the column 'HTQTYBOWL'. (NullAllowed)
     */
    public java.math.BigDecimal getHtqtybowl() {
        return _htqtybowl;
    }

    /**
     * [set] HTQTYBOWL: {NotNull, decimal(16, 6)} <br>
     * 実績数量（カートン）
     * @param htqtybowl The value of the column 'HTQTYBOWL'. (NullAllowed)
     */
    public void setHtqtybowl(java.math.BigDecimal htqtybowl) {
        __modifiedProperties.add("htqtybowl");
        this._htqtybowl = htqtybowl;
    }

    /**
     * [get] NV_EXTDATA1: {varchar(60)} <br>
     * 画面更新者
     * @return The value of the column 'NV_EXTDATA1'. (NullAllowed)
     */
    public String getNvExtdata1() {
        return _nvExtdata1;
    }

    /**
     * [set] NV_EXTDATA1: {varchar(60)} <br>
     * 画面更新者
     * @param nvExtdata1 The value of the column 'NV_EXTDATA1'. (NullAllowed)
     */
    public void setNvExtdata1(String nvExtdata1) {
        __modifiedProperties.add("nvExtdata1");
        this._nvExtdata1 = nvExtdata1;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
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
