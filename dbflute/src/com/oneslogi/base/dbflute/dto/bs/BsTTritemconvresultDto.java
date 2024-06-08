package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRITEMCONVRESULT as TABLE. <br>
 * 銘柄コード組替指示情報
 * <pre>
 * [primary-key]
 *     TRITEMCONVRESULT_ID
 *
 * [column]
 *     TRITEMCONVRESULT_ID, ITEMCHGINSTKEY, JTTSFLG, COMPANYCD, PRODUCT_CD_FROM, PRODUCT_CD_TO, QTY, PALLET_ID, ITEMCHGINSTFLG, ITEMCHGINSTDATE, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRITEMCONVRESULT_ID
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
public abstract class BsTTritemconvresultDto implements Serializable {

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
    /** TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _tritemconvresultId;

    /** ITEMCHGINSTKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _itemchginstkey;

    /** JTTSFLG: {char(1)} */
    @JsonKey
    protected String _jttsflg;

    /** COMPANYCD: {varchar(30)} */
    @JsonKey
    protected String _companycd;

    /** PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)} */
    @JsonKey
    protected String _productCdFrom;

    /** PRODUCT_CD_TO: {varchar(30)} */
    @JsonKey
    protected String _productCdTo;

    /** QTY: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _qty;

    /** PALLET_ID: {bigint(19)} */
    @JsonKey
    protected Long _palletId;

    /** ITEMCHGINSTFLG: {NotNull, varchar(30)} */
    @JsonKey
    protected String _itemchginstflg;

    /** ITEMCHGINSTDATE: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _itemchginstdate;

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
    public BsTTritemconvresultDto() {
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
        if (other == null || !(other instanceof BsTTritemconvresultDto)) { return false; }
        final BsTTritemconvresultDto otherEntity = (BsTTritemconvresultDto)other;
        if (!helpComparingValue(getTritemconvresultId(), otherEntity.getTritemconvresultId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRITEMCONVRESULT");
        result = xCH(result, getTritemconvresultId());
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
        sb.append(c).append(getTritemconvresultId());
        sb.append(c).append(getItemchginstkey());
        sb.append(c).append(getJttsflg());
        sb.append(c).append(getCompanycd());
        sb.append(c).append(getProductCdFrom());
        sb.append(c).append(getProductCdTo());
        sb.append(c).append(getQty());
        sb.append(c).append(getPalletId());
        sb.append(c).append(getItemchginstflg());
        sb.append(c).append(getItemchginstdate());
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
     * [get] TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 銘柄CD組替指示情報ID
     * @return The value of the column 'TRITEMCONVRESULT_ID'. (NullAllowed)
     */
    public Long getTritemconvresultId() {
        return _tritemconvresultId;
    }

    /**
     * [set] TRITEMCONVRESULT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 銘柄CD組替指示情報ID
     * @param tritemconvresultId The value of the column 'TRITEMCONVRESULT_ID'. (NullAllowed)
     */
    public void setTritemconvresultId(Long tritemconvresultId) {
        __modifiedProperties.add("tritemconvresultId");
        this._tritemconvresultId = tritemconvresultId;
    }

    /**
     * [get] ITEMCHGINSTKEY: {NotNull, decimal(16, 6)} <br>
     * 組替指示情報順序キー
     * @return The value of the column 'ITEMCHGINSTKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getItemchginstkey() {
        return _itemchginstkey;
    }

    /**
     * [set] ITEMCHGINSTKEY: {NotNull, decimal(16, 6)} <br>
     * 組替指示情報順序キー
     * @param itemchginstkey The value of the column 'ITEMCHGINSTKEY'. (NullAllowed)
     */
    public void setItemchginstkey(java.math.BigDecimal itemchginstkey) {
        __modifiedProperties.add("itemchginstkey");
        this._itemchginstkey = itemchginstkey;
    }

    /**
     * [get] JTTSFLG: {char(1)} <br>
     * ＪＴ／ＴＳ区分
     * @return The value of the column 'JTTSFLG'. (NullAllowed)
     */
    public String getJttsflg() {
        return _jttsflg;
    }

    /**
     * [set] JTTSFLG: {char(1)} <br>
     * ＪＴ／ＴＳ区分
     * @param jttsflg The value of the column 'JTTSFLG'. (NullAllowed)
     */
    public void setJttsflg(String jttsflg) {
        __modifiedProperties.add("jttsflg");
        this._jttsflg = jttsflg;
    }

    /**
     * [get] COMPANYCD: {varchar(30)} <br>
     * 組織CD
     * @return The value of the column 'COMPANYCD'. (NullAllowed)
     */
    public String getCompanycd() {
        return _companycd;
    }

    /**
     * [set] COMPANYCD: {varchar(30)} <br>
     * 組織CD
     * @param companycd The value of the column 'COMPANYCD'. (NullAllowed)
     */
    public void setCompanycd(String companycd) {
        __modifiedProperties.add("companycd");
        this._companycd = companycd;
    }

    /**
     * [get] PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)} <br>
     * 組替前銘柄CD
     * @return The value of the column 'PRODUCT_CD_FROM'. (NullAllowed)
     */
    public String getProductCdFrom() {
        return _productCdFrom;
    }

    /**
     * [set] PRODUCT_CD_FROM: {IX+, NotNull, varchar(30)} <br>
     * 組替前銘柄CD
     * @param productCdFrom The value of the column 'PRODUCT_CD_FROM'. (NullAllowed)
     */
    public void setProductCdFrom(String productCdFrom) {
        __modifiedProperties.add("productCdFrom");
        this._productCdFrom = productCdFrom;
    }

    /**
     * [get] PRODUCT_CD_TO: {varchar(30)} <br>
     * 組替後銘柄CD
     * @return The value of the column 'PRODUCT_CD_TO'. (NullAllowed)
     */
    public String getProductCdTo() {
        return _productCdTo;
    }

    /**
     * [set] PRODUCT_CD_TO: {varchar(30)} <br>
     * 組替後銘柄CD
     * @param productCdTo The value of the column 'PRODUCT_CD_TO'. (NullAllowed)
     */
    public void setProductCdTo(String productCdTo) {
        __modifiedProperties.add("productCdTo");
        this._productCdTo = productCdTo;
    }

    /**
     * [get] QTY: {decimal(16, 6)} <br>
     * 個装数量
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {decimal(16, 6)} <br>
     * 個装数量
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(java.math.BigDecimal qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
    }

    /**
     * [get] PALLET_ID: {bigint(19)} <br>
     * パレットID
     * @return The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public Long getPalletId() {
        return _palletId;
    }

    /**
     * [set] PALLET_ID: {bigint(19)} <br>
     * パレットID
     * @param palletId The value of the column 'PALLET_ID'. (NullAllowed)
     */
    public void setPalletId(Long palletId) {
        __modifiedProperties.add("palletId");
        this._palletId = palletId;
    }

    /**
     * [get] ITEMCHGINSTFLG: {NotNull, varchar(30)} <br>
     * 組替指示送信フラグ
     * @return The value of the column 'ITEMCHGINSTFLG'. (NullAllowed)
     */
    public String getItemchginstflg() {
        return _itemchginstflg;
    }

    /**
     * [set] ITEMCHGINSTFLG: {NotNull, varchar(30)} <br>
     * 組替指示送信フラグ
     * @param itemchginstflg The value of the column 'ITEMCHGINSTFLG'. (NullAllowed)
     */
    public void setItemchginstflg(String itemchginstflg) {
        __modifiedProperties.add("itemchginstflg");
        this._itemchginstflg = itemchginstflg;
    }

    /**
     * [get] ITEMCHGINSTDATE: {datetime2(26, 6)} <br>
     * 組替指示日時
     * @return The value of the column 'ITEMCHGINSTDATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getItemchginstdate() {
        return _itemchginstdate;
    }

    /**
     * [set] ITEMCHGINSTDATE: {datetime2(26, 6)} <br>
     * 組替指示日時
     * @param itemchginstdate The value of the column 'ITEMCHGINSTDATE'. (NullAllowed)
     */
    public void setItemchginstdate(java.sql.Timestamp itemchginstdate) {
        __modifiedProperties.add("itemchginstdate");
        this._itemchginstdate = itemchginstdate;
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
