package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_SHIPPING_INOUT_PLAN as TABLE. <br>
 * 品質検査完了実績送信テーブル
 * <pre>
 * [primary-key]
 *     SHIPPING_INOUT_PLAN_ID
 *
 * [column]
 *     SHIPPING_INOUT_PLAN_ID, SEND_CD, SEND_LOW_CD, WORK_FLG, CENTER_CD, SBWAREHOUSECD, SUPPLIERRCVNO, EXAMKBN, EXAMDATE, EXAMEND, PRODUCT_CD, LOT1, BEFZAIKOINV, BEFLOT4, BEFLOT3, AFTZAIKOINV, AFTLOT4, AFTLOT3, QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INOUT_PLAN_ID
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
public abstract class BsEShippingInoutPlanDto implements Serializable {

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
    /** SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _shippingInoutPlanId;

    /** SEND_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sendCd;

    /** SEND_LOW_CD: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _sendLowCd;

    /** WORK_FLG: {NotNull, varchar(8)} */
    @JsonKey
    protected String _workFlg;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** SBWAREHOUSECD: {varchar(255)} */
    @JsonKey
    protected String _sbwarehousecd;

    /** SUPPLIERRCVNO: {varchar(255)} */
    @JsonKey
    protected String _supplierrcvno;

    /** EXAMKBN: {varchar(255)} */
    @JsonKey
    protected String _examkbn;

    /** EXAMDATE: {varchar(255)} */
    @JsonKey
    protected String _examdate;

    /** EXAMEND: {varchar(255)} */
    @JsonKey
    protected String _examend;

    /** PRODUCT_CD: {varchar(255)} */
    @JsonKey
    protected String _productCd;

    /** LOT1: {varchar(255)} */
    @JsonKey
    protected String _lot1;

    /** BEFZAIKOINV: {varchar(255)} */
    @JsonKey
    protected String _befzaikoinv;

    /** BEFLOT4: {varchar(255)} */
    @JsonKey
    protected String _beflot4;

    /** BEFLOT3: {varchar(255)} */
    @JsonKey
    protected String _beflot3;

    /** AFTZAIKOINV: {varchar(255)} */
    @JsonKey
    protected String _aftzaikoinv;

    /** AFTLOT4: {varchar(255)} */
    @JsonKey
    protected String _aftlot4;

    /** AFTLOT3: {varchar(255)} */
    @JsonKey
    protected String _aftlot3;

    /** QTY: {varchar(255)} */
    @JsonKey
    protected String _qty;

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
    public BsEShippingInoutPlanDto() {
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
        if (other == null || !(other instanceof BsEShippingInoutPlanDto)) { return false; }
        final BsEShippingInoutPlanDto otherEntity = (BsEShippingInoutPlanDto)other;
        if (!helpComparingValue(getShippingInoutPlanId(), otherEntity.getShippingInoutPlanId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_SHIPPING_INOUT_PLAN");
        result = xCH(result, getShippingInoutPlanId());
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
        sb.append(c).append(getShippingInoutPlanId());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getSendLowCd());
        sb.append(c).append(getWorkFlg());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getSbwarehousecd());
        sb.append(c).append(getSupplierrcvno());
        sb.append(c).append(getExamkbn());
        sb.append(c).append(getExamdate());
        sb.append(c).append(getExamend());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getLot1());
        sb.append(c).append(getBefzaikoinv());
        sb.append(c).append(getBeflot4());
        sb.append(c).append(getBeflot3());
        sb.append(c).append(getAftzaikoinv());
        sb.append(c).append(getAftlot4());
        sb.append(c).append(getAftlot3());
        sb.append(c).append(getQty());
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
     * [get] SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 品質検査完了実績送信ID
     * @return The value of the column 'SHIPPING_INOUT_PLAN_ID'. (NullAllowed)
     */
    public Long getShippingInoutPlanId() {
        return _shippingInoutPlanId;
    }

    /**
     * [set] SHIPPING_INOUT_PLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 品質検査完了実績送信ID
     * @param shippingInoutPlanId The value of the column 'SHIPPING_INOUT_PLAN_ID'. (NullAllowed)
     */
    public void setShippingInoutPlanId(Long shippingInoutPlanId) {
        __modifiedProperties.add("shippingInoutPlanId");
        this._shippingInoutPlanId = shippingInoutPlanId;
    }

    /**
     * [get] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed)
     */
    public String getSendCd() {
        return _sendCd;
    }

    /**
     * [set] SEND_CD: {NotNull, varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed)
     */
    public void setSendCd(String sendCd) {
        __modifiedProperties.add("sendCd");
        this._sendCd = sendCd;
    }

    /**
     * [get] SEND_LOW_CD: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @return The value of the column 'SEND_LOW_CD'. (NullAllowed)
     */
    public Long getSendLowCd() {
        return _sendLowCd;
    }

    /**
     * [set] SEND_LOW_CD: {NotNull, bigint(19)} <br>
     * 送信行ID
     * @param sendLowCd The value of the column 'SEND_LOW_CD'. (NullAllowed)
     */
    public void setSendLowCd(Long sendLowCd) {
        __modifiedProperties.add("sendLowCd");
        this._sendLowCd = sendLowCd;
    }

    /**
     * [get] WORK_FLG: {NotNull, varchar(8)} <br>
     * 処理済フラグ
     * @return The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public String getWorkFlg() {
        return _workFlg;
    }

    /**
     * [set] WORK_FLG: {NotNull, varchar(8)} <br>
     * 処理済フラグ
     * @param workFlg The value of the column 'WORK_FLG'. (NullAllowed)
     */
    public void setWorkFlg(String workFlg) {
        __modifiedProperties.add("workFlg");
        this._workFlg = workFlg;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫CD
     * @return The value of the column 'SBWAREHOUSECD'. (NullAllowed)
     */
    public String getSbwarehousecd() {
        return _sbwarehousecd;
    }

    /**
     * [set] SBWAREHOUSECD: {varchar(255)} <br>
     * 保税倉庫CD
     * @param sbwarehousecd The value of the column 'SBWAREHOUSECD'. (NullAllowed)
     */
    public void setSbwarehousecd(String sbwarehousecd) {
        __modifiedProperties.add("sbwarehousecd");
        this._sbwarehousecd = sbwarehousecd;
    }

    /**
     * [get] SUPPLIERRCVNO: {varchar(255)} <br>
     * 保税管理番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public String getSupplierrcvno() {
        return _supplierrcvno;
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(255)} <br>
     * 保税管理番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        __modifiedProperties.add("supplierrcvno");
        this._supplierrcvno = supplierrcvno;
    }

    /**
     * [get] EXAMKBN: {varchar(255)} <br>
     * 検査区分
     * @return The value of the column 'EXAMKBN'. (NullAllowed)
     */
    public String getExamkbn() {
        return _examkbn;
    }

    /**
     * [set] EXAMKBN: {varchar(255)} <br>
     * 検査区分
     * @param examkbn The value of the column 'EXAMKBN'. (NullAllowed)
     */
    public void setExamkbn(String examkbn) {
        __modifiedProperties.add("examkbn");
        this._examkbn = examkbn;
    }

    /**
     * [get] EXAMDATE: {varchar(255)} <br>
     * 検査日
     * @return The value of the column 'EXAMDATE'. (NullAllowed)
     */
    public String getExamdate() {
        return _examdate;
    }

    /**
     * [set] EXAMDATE: {varchar(255)} <br>
     * 検査日
     * @param examdate The value of the column 'EXAMDATE'. (NullAllowed)
     */
    public void setExamdate(String examdate) {
        __modifiedProperties.add("examdate");
        this._examdate = examdate;
    }

    /**
     * [get] EXAMEND: {varchar(255)} <br>
     * 検査完了
     * @return The value of the column 'EXAMEND'. (NullAllowed)
     */
    public String getExamend() {
        return _examend;
    }

    /**
     * [set] EXAMEND: {varchar(255)} <br>
     * 検査完了
     * @param examend The value of the column 'EXAMEND'. (NullAllowed)
     */
    public void setExamend(String examend) {
        __modifiedProperties.add("examend");
        this._examend = examend;
    }

    /**
     * [get] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {varchar(255)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed)
     */
    public String getLot1() {
        return _lot1;
    }

    /**
     * [set] LOT1: {varchar(255)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed)
     */
    public void setLot1(String lot1) {
        __modifiedProperties.add("lot1");
        this._lot1 = lot1;
    }

    /**
     * [get] BEFZAIKOINV: {varchar(255)} <br>
     * 変更前在庫区分
     * @return The value of the column 'BEFZAIKOINV'. (NullAllowed)
     */
    public String getBefzaikoinv() {
        return _befzaikoinv;
    }

    /**
     * [set] BEFZAIKOINV: {varchar(255)} <br>
     * 変更前在庫区分
     * @param befzaikoinv The value of the column 'BEFZAIKOINV'. (NullAllowed)
     */
    public void setBefzaikoinv(String befzaikoinv) {
        __modifiedProperties.add("befzaikoinv");
        this._befzaikoinv = befzaikoinv;
    }

    /**
     * [get] BEFLOT4: {varchar(255)} <br>
     * 変更前製造年月
     * @return The value of the column 'BEFLOT4'. (NullAllowed)
     */
    public String getBeflot4() {
        return _beflot4;
    }

    /**
     * [set] BEFLOT4: {varchar(255)} <br>
     * 変更前製造年月
     * @param beflot4 The value of the column 'BEFLOT4'. (NullAllowed)
     */
    public void setBeflot4(String beflot4) {
        __modifiedProperties.add("beflot4");
        this._beflot4 = beflot4;
    }

    /**
     * [get] BEFLOT3: {varchar(255)} <br>
     * 変更前デザイン区分
     * @return The value of the column 'BEFLOT3'. (NullAllowed)
     */
    public String getBeflot3() {
        return _beflot3;
    }

    /**
     * [set] BEFLOT3: {varchar(255)} <br>
     * 変更前デザイン区分
     * @param beflot3 The value of the column 'BEFLOT3'. (NullAllowed)
     */
    public void setBeflot3(String beflot3) {
        __modifiedProperties.add("beflot3");
        this._beflot3 = beflot3;
    }

    /**
     * [get] AFTZAIKOINV: {varchar(255)} <br>
     * 変更後在庫区分
     * @return The value of the column 'AFTZAIKOINV'. (NullAllowed)
     */
    public String getAftzaikoinv() {
        return _aftzaikoinv;
    }

    /**
     * [set] AFTZAIKOINV: {varchar(255)} <br>
     * 変更後在庫区分
     * @param aftzaikoinv The value of the column 'AFTZAIKOINV'. (NullAllowed)
     */
    public void setAftzaikoinv(String aftzaikoinv) {
        __modifiedProperties.add("aftzaikoinv");
        this._aftzaikoinv = aftzaikoinv;
    }

    /**
     * [get] AFTLOT4: {varchar(255)} <br>
     * 変更後製造年月
     * @return The value of the column 'AFTLOT4'. (NullAllowed)
     */
    public String getAftlot4() {
        return _aftlot4;
    }

    /**
     * [set] AFTLOT4: {varchar(255)} <br>
     * 変更後製造年月
     * @param aftlot4 The value of the column 'AFTLOT4'. (NullAllowed)
     */
    public void setAftlot4(String aftlot4) {
        __modifiedProperties.add("aftlot4");
        this._aftlot4 = aftlot4;
    }

    /**
     * [get] AFTLOT3: {varchar(255)} <br>
     * 変更後デザイン区分
     * @return The value of the column 'AFTLOT3'. (NullAllowed)
     */
    public String getAftlot3() {
        return _aftlot3;
    }

    /**
     * [set] AFTLOT3: {varchar(255)} <br>
     * 変更後デザイン区分
     * @param aftlot3 The value of the column 'AFTLOT3'. (NullAllowed)
     */
    public void setAftlot3(String aftlot3) {
        __modifiedProperties.add("aftlot3");
        this._aftlot3 = aftlot3;
    }

    /**
     * [get] QTY: {varchar(255)} <br>
     * 個数(個装)
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public String getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {varchar(255)} <br>
     * 個数(個装)
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(String qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
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
