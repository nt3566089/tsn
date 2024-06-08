package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRINVCHECKINFO as TABLE. <br>
 * 在庫調査表情報
 * <pre>
 * [primary-key]
 *     TRINVCHECKINFO_ID
 *
 * [column]
 *     TRINVCHECKINFO_ID, WAREHOUSECD, EXECUTEDATE, INOUTKBN, PRODUCT_ID, DUALITEMCDFLG, DUALITEMCD, YDAYTLEQULYTOTALINV, TDAYEQYTOTALINV, SYSINVTOTALINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, EXCESSTOTALINV, DEFECTTOTALINV, CAPITEMFLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRINVCHECKINFO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT, M_PRODUCT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient, mProduct
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrinvcheckinfoDto implements Serializable {

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
    /** TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trinvcheckinfoId;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _warehousecd;

    /** EXECUTEDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _executedate;

    /** INOUTKBN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _inoutkbn;

    /** PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} */
    @JsonKey
    protected Long _productId;

    /** DUALITEMCDFLG: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _dualitemcdflg;

    /** DUALITEMCD: {varchar(30)} */
    @JsonKey
    protected String _dualitemcd;

    /** YDAYTLEQULYTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ydaytlequlytotalinv;

    /** TDAYEQYTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _tdayeqytotalinv;

    /** SYSINVTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _sysinvtotalinv;

    /** INVESTTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investtotalinv;

    /** INVESTKEEPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investkeeplocinv;

    /** INVESTRECEIVELOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investreceivelocinv;

    /** INVESTDAMAGEITEM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investdamageitem;

    /** INVESTCLSSIFYLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investclssifylocinv;

    /** INVESTTMPLOCINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investtmplocinv;

    /** INVESTAUTOINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _investautoinv;

    /** EXCESSTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _excesstotalinv;

    /** DEFECTTOTALINV: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _defecttotalinv;

    /** CAPITEMFLG: {char(1)} */
    @JsonKey
    protected String _capitemflg;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
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
    public BsTTrinvcheckinfoDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrinvcheckinfoDto)) { return false; }
        final BsTTrinvcheckinfoDto otherEntity = (BsTTrinvcheckinfoDto)other;
        if (!helpComparingValue(getTrinvcheckinfoId(), otherEntity.getTrinvcheckinfoId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRINVCHECKINFO");
        result = xCH(result, getTrinvcheckinfoId());
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
        sb.append(c).append(getTrinvcheckinfoId());
        sb.append(c).append(getWarehousecd());
        sb.append(c).append(getExecutedate());
        sb.append(c).append(getInoutkbn());
        sb.append(c).append(getProductId());
        sb.append(c).append(getDualitemcdflg());
        sb.append(c).append(getDualitemcd());
        sb.append(c).append(getYdaytlequlytotalinv());
        sb.append(c).append(getTdayeqytotalinv());
        sb.append(c).append(getSysinvtotalinv());
        sb.append(c).append(getInvesttotalinv());
        sb.append(c).append(getInvestkeeplocinv());
        sb.append(c).append(getInvestreceivelocinv());
        sb.append(c).append(getInvestdamageitem());
        sb.append(c).append(getInvestclssifylocinv());
        sb.append(c).append(getInvesttmplocinv());
        sb.append(c).append(getInvestautoinv());
        sb.append(c).append(getExcesstotalinv());
        sb.append(c).append(getDefecttotalinv());
        sb.append(c).append(getCapitemflg());
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
     * [get] TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫調査表情報ID
     * @return The value of the column 'TRINVCHECKINFO_ID'. (NullAllowed)
     */
    public Long getTrinvcheckinfoId() {
        return _trinvcheckinfoId;
    }

    /**
     * [set] TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫調査表情報ID
     * @param trinvcheckinfoId The value of the column 'TRINVCHECKINFO_ID'. (NullAllowed)
     */
    public void setTrinvcheckinfoId(Long trinvcheckinfoId) {
        __modifiedProperties.add("trinvcheckinfoId");
        this._trinvcheckinfoId = trinvcheckinfoId;
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
     * [get] EXECUTEDATE: {NotNull, varchar(8)} <br>
     * 在庫実績日
     * @return The value of the column 'EXECUTEDATE'. (NullAllowed)
     */
    public String getExecutedate() {
        return _executedate;
    }

    /**
     * [set] EXECUTEDATE: {NotNull, varchar(8)} <br>
     * 在庫実績日
     * @param executedate The value of the column 'EXECUTEDATE'. (NullAllowed)
     */
    public void setExecutedate(String executedate) {
        __modifiedProperties.add("executedate");
        this._executedate = executedate;
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
     * [get] PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] DUALITEMCDFLG: {NotNull, decimal(16, 6)} <br>
     * 庫内作業集約フラグ
     * @return The value of the column 'DUALITEMCDFLG'. (NullAllowed)
     */
    public java.math.BigDecimal getDualitemcdflg() {
        return _dualitemcdflg;
    }

    /**
     * [set] DUALITEMCDFLG: {NotNull, decimal(16, 6)} <br>
     * 庫内作業集約フラグ
     * @param dualitemcdflg The value of the column 'DUALITEMCDFLG'. (NullAllowed)
     */
    public void setDualitemcdflg(java.math.BigDecimal dualitemcdflg) {
        __modifiedProperties.add("dualitemcdflg");
        this._dualitemcdflg = dualitemcdflg;
    }

    /**
     * [get] DUALITEMCD: {varchar(30)} <br>
     * 庫内作業集約CD
     * @return The value of the column 'DUALITEMCD'. (NullAllowed)
     */
    public String getDualitemcd() {
        return _dualitemcd;
    }

    /**
     * [set] DUALITEMCD: {varchar(30)} <br>
     * 庫内作業集約CD
     * @param dualitemcd The value of the column 'DUALITEMCD'. (NullAllowed)
     */
    public void setDualitemcd(String dualitemcd) {
        __modifiedProperties.add("dualitemcd");
        this._dualitemcd = dualitemcd;
    }

    /**
     * [get] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * 前日までの過不足
     * @return The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getYdaytlequlytotalinv() {
        return _ydaytlequlytotalinv;
    }

    /**
     * [set] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * 前日までの過不足
     * @param ydaytlequlytotalinv The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed)
     */
    public void setYdaytlequlytotalinv(java.math.BigDecimal ydaytlequlytotalinv) {
        __modifiedProperties.add("ydaytlequlytotalinv");
        this._ydaytlequlytotalinv = ydaytlequlytotalinv;
    }

    /**
     * [get] TDAYEQYTOTALINV: {decimal(16, 6)} <br>
     * 当日過不足
     * @return The value of the column 'TDAYEQYTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getTdayeqytotalinv() {
        return _tdayeqytotalinv;
    }

    /**
     * [set] TDAYEQYTOTALINV: {decimal(16, 6)} <br>
     * 当日過不足
     * @param tdayeqytotalinv The value of the column 'TDAYEQYTOTALINV'. (NullAllowed)
     */
    public void setTdayeqytotalinv(java.math.BigDecimal tdayeqytotalinv) {
        __modifiedProperties.add("tdayeqytotalinv");
        this._tdayeqytotalinv = tdayeqytotalinv;
    }

    /**
     * [get] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * 台帳在庫
     * @return The value of the column 'SYSINVTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getSysinvtotalinv() {
        return _sysinvtotalinv;
    }

    /**
     * [set] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * 台帳在庫
     * @param sysinvtotalinv The value of the column 'SYSINVTOTALINV'. (NullAllowed)
     */
    public void setSysinvtotalinv(java.math.BigDecimal sysinvtotalinv) {
        __modifiedProperties.add("sysinvtotalinv");
        this._sysinvtotalinv = sysinvtotalinv;
    }

    /**
     * [get] INVESTTOTALINV: {decimal(16, 6)} <br>
     * 調査計
     * @return The value of the column 'INVESTTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvesttotalinv() {
        return _investtotalinv;
    }

    /**
     * [set] INVESTTOTALINV: {decimal(16, 6)} <br>
     * 調査計
     * @param investtotalinv The value of the column 'INVESTTOTALINV'. (NullAllowed)
     */
    public void setInvesttotalinv(java.math.BigDecimal investtotalinv) {
        __modifiedProperties.add("investtotalinv");
        this._investtotalinv = investtotalinv;
    }

    /**
     * [get] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * 保管場在庫_調査結果
     * @return The value of the column 'INVESTKEEPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestkeeplocinv() {
        return _investkeeplocinv;
    }

    /**
     * [set] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * 保管場在庫_調査結果
     * @param investkeeplocinv The value of the column 'INVESTKEEPLOCINV'. (NullAllowed)
     */
    public void setInvestkeeplocinv(java.math.BigDecimal investkeeplocinv) {
        __modifiedProperties.add("investkeeplocinv");
        this._investkeeplocinv = investkeeplocinv;
    }

    /**
     * [get] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * 引取場在庫_調査結果
     * @return The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestreceivelocinv() {
        return _investreceivelocinv;
    }

    /**
     * [set] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * 引取場在庫_調査結果
     * @param investreceivelocinv The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed)
     */
    public void setInvestreceivelocinv(java.math.BigDecimal investreceivelocinv) {
        __modifiedProperties.add("investreceivelocinv");
        this._investreceivelocinv = investreceivelocinv;
    }

    /**
     * [get] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * かし品置場在庫_調査結果
     * @return The value of the column 'INVESTDAMAGEITEM'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestdamageitem() {
        return _investdamageitem;
    }

    /**
     * [set] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * かし品置場在庫_調査結果
     * @param investdamageitem The value of the column 'INVESTDAMAGEITEM'. (NullAllowed)
     */
    public void setInvestdamageitem(java.math.BigDecimal investdamageitem) {
        __modifiedProperties.add("investdamageitem");
        this._investdamageitem = investdamageitem;
    }

    /**
     * [get] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * 仕分場在庫_調査結果
     * @return The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestclssifylocinv() {
        return _investclssifylocinv;
    }

    /**
     * [set] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * 仕分場在庫_調査結果
     * @param investclssifylocinv The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed)
     */
    public void setInvestclssifylocinv(java.math.BigDecimal investclssifylocinv) {
        __modifiedProperties.add("investclssifylocinv");
        this._investclssifylocinv = investclssifylocinv;
    }

    /**
     * [get] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * 仮置場在庫仕分済分_調査結果
     * @return The value of the column 'INVESTTMPLOCINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvesttmplocinv() {
        return _investtmplocinv;
    }

    /**
     * [set] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * 仮置場在庫仕分済分_調査結果
     * @param investtmplocinv The value of the column 'INVESTTMPLOCINV'. (NullAllowed)
     */
    public void setInvesttmplocinv(java.math.BigDecimal investtmplocinv) {
        __modifiedProperties.add("investtmplocinv");
        this._investtmplocinv = investtmplocinv;
    }

    /**
     * [get] INVESTAUTOINV: {decimal(16, 6)} <br>
     * 自動倉庫在庫_調査結果
     * @return The value of the column 'INVESTAUTOINV'. (NullAllowed)
     */
    public java.math.BigDecimal getInvestautoinv() {
        return _investautoinv;
    }

    /**
     * [set] INVESTAUTOINV: {decimal(16, 6)} <br>
     * 自動倉庫在庫_調査結果
     * @param investautoinv The value of the column 'INVESTAUTOINV'. (NullAllowed)
     */
    public void setInvestautoinv(java.math.BigDecimal investautoinv) {
        __modifiedProperties.add("investautoinv");
        this._investautoinv = investautoinv;
    }

    /**
     * [get] EXCESSTOTALINV: {decimal(16, 6)} <br>
     * 過剰
     * @return The value of the column 'EXCESSTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getExcesstotalinv() {
        return _excesstotalinv;
    }

    /**
     * [set] EXCESSTOTALINV: {decimal(16, 6)} <br>
     * 過剰
     * @param excesstotalinv The value of the column 'EXCESSTOTALINV'. (NullAllowed)
     */
    public void setExcesstotalinv(java.math.BigDecimal excesstotalinv) {
        __modifiedProperties.add("excesstotalinv");
        this._excesstotalinv = excesstotalinv;
    }

    /**
     * [get] DEFECTTOTALINV: {decimal(16, 6)} <br>
     * 不足
     * @return The value of the column 'DEFECTTOTALINV'. (NullAllowed)
     */
    public java.math.BigDecimal getDefecttotalinv() {
        return _defecttotalinv;
    }

    /**
     * [set] DEFECTTOTALINV: {decimal(16, 6)} <br>
     * 不足
     * @param defecttotalinv The value of the column 'DEFECTTOTALINV'. (NullAllowed)
     */
    public void setDefecttotalinv(java.math.BigDecimal defecttotalinv) {
        __modifiedProperties.add("defecttotalinv");
        this._defecttotalinv = defecttotalinv;
    }

    /**
     * [get] CAPITEMFLG: {char(1)} <br>
     * CAP銘柄区分
     * @return The value of the column 'CAPITEMFLG'. (NullAllowed)
     */
    public String getCapitemflg() {
        return _capitemflg;
    }

    /**
     * [set] CAPITEMFLG: {char(1)} <br>
     * CAP銘柄区分
     * @param capitemflg The value of the column 'CAPITEMFLG'. (NullAllowed)
     */
    public void setCapitemflg(String capitemflg) {
        __modifiedProperties.add("capitemflg");
        this._capitemflg = capitemflg;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} <br>
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
