package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRSTOCKDIFFHISTORY as TABLE. <br>
 * 在庫過不足履歴
 * <pre>
 * [primary-key]
 *     TRSTOCKDIFFHISTORY_ID
 *
 * [column]
 *     TRSTOCKDIFFHISTORY_ID, CENTER_CD, DIFFADD_DATE, DIFFOCC_AREA, LOCATION_CD, INOUT_KBN, PRODUCT_CD, GOOD_ITEM_KBN, DAMAGE_REFUND_KBN, DIFF_QTY, CENTER_ID, CLIENT_ID, PRINTEDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSTOCKDIFFHISTORY_ID
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
public abstract class BsTTrstockdiffhistoryDto implements Serializable {

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
    /** TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trstockdiffhistoryId;

    /** CENTER_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** DIFFADD_DATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _diffaddDate;

    /** DIFFOCC_AREA: {NotNull, char(1)} */
    @JsonKey
    protected String _diffoccArea;

    /** LOCATION_CD: {varchar(255)} */
    @JsonKey
    protected String _locationCd;

    /** INOUT_KBN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _inoutKbn;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** GOOD_ITEM_KBN: {NotNull, char(1)} */
    @JsonKey
    protected String _goodItemKbn;

    /** DAMAGE_REFUND_KBN: {char(1)} */
    @JsonKey
    protected String _damageRefundKbn;

    /** DIFF_QTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _diffQty;

    /** CENTER_ID: {NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** PRINTEDFLG: {NotNull, char(1)} */
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
    public BsTTrstockdiffhistoryDto() {
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
        if (other == null || !(other instanceof BsTTrstockdiffhistoryDto)) { return false; }
        final BsTTrstockdiffhistoryDto otherEntity = (BsTTrstockdiffhistoryDto)other;
        if (!helpComparingValue(getTrstockdiffhistoryId(), otherEntity.getTrstockdiffhistoryId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRSTOCKDIFFHISTORY");
        result = xCH(result, getTrstockdiffhistoryId());
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
        sb.append(c).append(getTrstockdiffhistoryId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getDiffaddDate());
        sb.append(c).append(getDiffoccArea());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getInoutKbn());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getGoodItemKbn());
        sb.append(c).append(getDamageRefundKbn());
        sb.append(c).append(getDiffQty());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
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
     * [get] TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫過不足履歴ID
     * @return The value of the column 'TRSTOCKDIFFHISTORY_ID'. (NullAllowed)
     */
    public Long getTrstockdiffhistoryId() {
        return _trstockdiffhistoryId;
    }

    /**
     * [set] TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫過不足履歴ID
     * @param trstockdiffhistoryId The value of the column 'TRSTOCKDIFFHISTORY_ID'. (NullAllowed)
     */
    public void setTrstockdiffhistoryId(Long trstockdiffhistoryId) {
        __modifiedProperties.add("trstockdiffhistoryId");
        this._trstockdiffhistoryId = trstockdiffhistoryId;
    }

    /**
     * [get] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {NotNull, varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] DIFFADD_DATE: {NotNull, varchar(8)} <br>
     * 過不足登録日
     * @return The value of the column 'DIFFADD_DATE'. (NullAllowed)
     */
    public String getDiffaddDate() {
        return _diffaddDate;
    }

    /**
     * [set] DIFFADD_DATE: {NotNull, varchar(8)} <br>
     * 過不足登録日
     * @param diffaddDate The value of the column 'DIFFADD_DATE'. (NullAllowed)
     */
    public void setDiffaddDate(String diffaddDate) {
        __modifiedProperties.add("diffaddDate");
        this._diffaddDate = diffaddDate;
    }

    /**
     * [get] DIFFOCC_AREA: {NotNull, char(1)} <br>
     * 過不足発生場所
     * @return The value of the column 'DIFFOCC_AREA'. (NullAllowed)
     */
    public String getDiffoccArea() {
        return _diffoccArea;
    }

    /**
     * [set] DIFFOCC_AREA: {NotNull, char(1)} <br>
     * 過不足発生場所
     * @param diffoccArea The value of the column 'DIFFOCC_AREA'. (NullAllowed)
     */
    public void setDiffoccArea(String diffoccArea) {
        __modifiedProperties.add("diffoccArea");
        this._diffoccArea = diffoccArea;
    }

    /**
     * [get] LOCATION_CD: {varchar(255)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {varchar(255)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] INOUT_KBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'INOUT_KBN'. (NullAllowed)
     */
    public String getInoutKbn() {
        return _inoutKbn;
    }

    /**
     * [set] INOUT_KBN: {NotNull, varchar(30)} <br>
     * 内外区分
     * @param inoutKbn The value of the column 'INOUT_KBN'. (NullAllowed)
     */
    public void setInoutKbn(String inoutKbn) {
        __modifiedProperties.add("inoutKbn");
        this._inoutKbn = inoutKbn;
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
     * [get] GOOD_ITEM_KBN: {NotNull, char(1)} <br>
     * 適品・不適品区分
     * @return The value of the column 'GOOD_ITEM_KBN'. (NullAllowed)
     */
    public String getGoodItemKbn() {
        return _goodItemKbn;
    }

    /**
     * [set] GOOD_ITEM_KBN: {NotNull, char(1)} <br>
     * 適品・不適品区分
     * @param goodItemKbn The value of the column 'GOOD_ITEM_KBN'. (NullAllowed)
     */
    public void setGoodItemKbn(String goodItemKbn) {
        __modifiedProperties.add("goodItemKbn");
        this._goodItemKbn = goodItemKbn;
    }

    /**
     * [get] DAMAGE_REFUND_KBN: {char(1)} <br>
     * かし品・国税還付品区分
     * @return The value of the column 'DAMAGE_REFUND_KBN'. (NullAllowed)
     */
    public String getDamageRefundKbn() {
        return _damageRefundKbn;
    }

    /**
     * [set] DAMAGE_REFUND_KBN: {char(1)} <br>
     * かし品・国税還付品区分
     * @param damageRefundKbn The value of the column 'DAMAGE_REFUND_KBN'. (NullAllowed)
     */
    public void setDamageRefundKbn(String damageRefundKbn) {
        __modifiedProperties.add("damageRefundKbn");
        this._damageRefundKbn = damageRefundKbn;
    }

    /**
     * [get] DIFF_QTY: {decimal(16, 6)} <br>
     * 過不足数
     * @return The value of the column 'DIFF_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getDiffQty() {
        return _diffQty;
    }

    /**
     * [set] DIFF_QTY: {decimal(16, 6)} <br>
     * 過不足数
     * @param diffQty The value of the column 'DIFF_QTY'. (NullAllowed)
     */
    public void setDiffQty(java.math.BigDecimal diffQty) {
        __modifiedProperties.add("diffQty");
        this._diffQty = diffQty;
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
