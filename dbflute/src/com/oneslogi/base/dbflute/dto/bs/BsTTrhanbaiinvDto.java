package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRHANBAIINV as TABLE. <br>
 * 販売物流在庫情報
 * <pre>
 * [primary-key]
 *     TRHANBAIINV_ID
 *
 * [column]
 *     TRHANBAIINV_ID, INOUTKBN, PRODUCT_CD, GOODITEMKBN, STOCKQTY, DAMAGEITEMQTY, REFUNDITEMQTY, STOCKDATETIME, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRHANBAIINV_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrhanbaiinvDto implements Serializable {

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
    /** TRHANBAIINV_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trhanbaiinvId;

    /** INOUTKBN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _inoutkbn;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** GOODITEMKBN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _gooditemkbn;

    /** STOCKQTY: {bigint(19)} */
    @JsonKey
    protected Long _stockqty;

    /** DAMAGEITEMQTY: {bigint(19)} */
    @JsonKey
    protected Long _damageitemqty;

    /** REFUNDITEMQTY: {bigint(19)} */
    @JsonKey
    protected Long _refunditemqty;

    /** STOCKDATETIME: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _stockdatetime;

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
    public BsTTrhanbaiinvDto() {
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

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrhanbaiinvDto)) { return false; }
        final BsTTrhanbaiinvDto otherEntity = (BsTTrhanbaiinvDto)other;
        if (!helpComparingValue(getTrhanbaiinvId(), otherEntity.getTrhanbaiinvId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRHANBAIINV");
        result = xCH(result, getTrhanbaiinvId());
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
        sb.append(c).append(getTrhanbaiinvId());
        sb.append(c).append(getInoutkbn());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getGooditemkbn());
        sb.append(c).append(getStockqty());
        sb.append(c).append(getDamageitemqty());
        sb.append(c).append(getRefunditemqty());
        sb.append(c).append(getStockdatetime());
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
     * [get] TRHANBAIINV_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 販売物流在庫情報ID
     * @return The value of the column 'TRHANBAIINV_ID'. (NullAllowed)
     */
    public Long getTrhanbaiinvId() {
        return _trhanbaiinvId;
    }

    /**
     * [set] TRHANBAIINV_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 販売物流在庫情報ID
     * @param trhanbaiinvId The value of the column 'TRHANBAIINV_ID'. (NullAllowed)
     */
    public void setTrhanbaiinvId(Long trhanbaiinvId) {
        __modifiedProperties.add("trhanbaiinvId");
        this._trhanbaiinvId = trhanbaiinvId;
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
     * [get] GOODITEMKBN: {NotNull, varchar(30)} <br>
     * 適品・不適品区分
     * @return The value of the column 'GOODITEMKBN'. (NullAllowed)
     */
    public String getGooditemkbn() {
        return _gooditemkbn;
    }

    /**
     * [set] GOODITEMKBN: {NotNull, varchar(30)} <br>
     * 適品・不適品区分
     * @param gooditemkbn The value of the column 'GOODITEMKBN'. (NullAllowed)
     */
    public void setGooditemkbn(String gooditemkbn) {
        __modifiedProperties.add("gooditemkbn");
        this._gooditemkbn = gooditemkbn;
    }

    /**
     * [get] STOCKQTY: {bigint(19)} <br>
     * 在庫数量
     * @return The value of the column 'STOCKQTY'. (NullAllowed)
     */
    public Long getStockqty() {
        return _stockqty;
    }

    /**
     * [set] STOCKQTY: {bigint(19)} <br>
     * 在庫数量
     * @param stockqty The value of the column 'STOCKQTY'. (NullAllowed)
     */
    public void setStockqty(Long stockqty) {
        __modifiedProperties.add("stockqty");
        this._stockqty = stockqty;
    }

    /**
     * [get] DAMAGEITEMQTY: {bigint(19)} <br>
     * かし品数量
     * @return The value of the column 'DAMAGEITEMQTY'. (NullAllowed)
     */
    public Long getDamageitemqty() {
        return _damageitemqty;
    }

    /**
     * [set] DAMAGEITEMQTY: {bigint(19)} <br>
     * かし品数量
     * @param damageitemqty The value of the column 'DAMAGEITEMQTY'. (NullAllowed)
     */
    public void setDamageitemqty(Long damageitemqty) {
        __modifiedProperties.add("damageitemqty");
        this._damageitemqty = damageitemqty;
    }

    /**
     * [get] REFUNDITEMQTY: {bigint(19)} <br>
     * 国税還付品数量
     * @return The value of the column 'REFUNDITEMQTY'. (NullAllowed)
     */
    public Long getRefunditemqty() {
        return _refunditemqty;
    }

    /**
     * [set] REFUNDITEMQTY: {bigint(19)} <br>
     * 国税還付品数量
     * @param refunditemqty The value of the column 'REFUNDITEMQTY'. (NullAllowed)
     */
    public void setRefunditemqty(Long refunditemqty) {
        __modifiedProperties.add("refunditemqty");
        this._refunditemqty = refunditemqty;
    }

    /**
     * [get] STOCKDATETIME: {datetime2(26, 6)} <br>
     * 在庫実績日
     * @return The value of the column 'STOCKDATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getStockdatetime() {
        return _stockdatetime;
    }

    /**
     * [set] STOCKDATETIME: {datetime2(26, 6)} <br>
     * 在庫実績日
     * @param stockdatetime The value of the column 'STOCKDATETIME'. (NullAllowed)
     */
    public void setStockdatetime(java.sql.Timestamp stockdatetime) {
        __modifiedProperties.add("stockdatetime");
        this._stockdatetime = stockdatetime;
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
