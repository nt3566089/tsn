package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRMANUFACTUREDATEHISTORY as TABLE. <br>
 * 製造年月日履歴
 * <pre>
 * [primary-key]
 *     TRMANUFACTUREDATEHISTORY_ID
 *
 * [column]
 *     TRMANUFACTUREDATEHISTORY_ID, CENTER_CD, OWNER_CD, INVENTORY_KBN, LINE_BLOCK, PRODUCT_CD, INVENTORY_KEY, INVENTORY_B_ID, INVENTORY_DATE, BF_MANUFACTURE_DATE, AF_MANUFACTURE_DATE, DESIGN_FLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRMANUFACTUREDATEHISTORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CLIENT, M_CENTER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mClient, mCenter
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTTrmanufacturedatehistoryDto implements Serializable {

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
    /** TRMANUFACTUREDATEHISTORY_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trmanufacturedatehistoryId;

    /** CENTER_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** OWNER_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _ownerCd;

    /** INVENTORY_KBN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _inventoryKbn;

    /** LINE_BLOCK: {NotNull, varchar(30)} */
    @JsonKey
    protected String _lineBlock;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** INVENTORY_KEY: {NotNull, varchar(30)} */
    @JsonKey
    protected String _inventoryKey;

    /** INVENTORY_B_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _inventoryBId;

    /** INVENTORY_DATE: {IX, NotNull, varchar(8)} */
    @JsonKey
    protected String _inventoryDate;

    /** BF_MANUFACTURE_DATE: {varchar(8)} */
    @JsonKey
    protected String _bfManufactureDate;

    /** AF_MANUFACTURE_DATE: {varchar(8)} */
    @JsonKey
    protected String _afManufactureDate;

    /** DESIGN_FLG: {varchar(30)} */
    @JsonKey
    protected String _designFlg;

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
    public BsTTrmanufacturedatehistoryDto() {
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
    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTTrmanufacturedatehistoryDto)) { return false; }
        final BsTTrmanufacturedatehistoryDto otherEntity = (BsTTrmanufacturedatehistoryDto)other;
        if (!helpComparingValue(getTrmanufacturedatehistoryId(), otherEntity.getTrmanufacturedatehistoryId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRMANUFACTUREDATEHISTORY");
        result = xCH(result, getTrmanufacturedatehistoryId());
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
        sb.append(c).append(getTrmanufacturedatehistoryId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getOwnerCd());
        sb.append(c).append(getInventoryKbn());
        sb.append(c).append(getLineBlock());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getInventoryKey());
        sb.append(c).append(getInventoryBId());
        sb.append(c).append(getInventoryDate());
        sb.append(c).append(getBfManufactureDate());
        sb.append(c).append(getAfManufactureDate());
        sb.append(c).append(getDesignFlg());
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
     * [get] TRMANUFACTUREDATEHISTORY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製造年月日履歴ID
     * @return The value of the column 'TRMANUFACTUREDATEHISTORY_ID'. (NullAllowed)
     */
    public Long getTrmanufacturedatehistoryId() {
        return _trmanufacturedatehistoryId;
    }

    /**
     * [set] TRMANUFACTUREDATEHISTORY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 製造年月日履歴ID
     * @param trmanufacturedatehistoryId The value of the column 'TRMANUFACTUREDATEHISTORY_ID'. (NullAllowed)
     */
    public void setTrmanufacturedatehistoryId(Long trmanufacturedatehistoryId) {
        __modifiedProperties.add("trmanufacturedatehistoryId");
        this._trmanufacturedatehistoryId = trmanufacturedatehistoryId;
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
     * [get] OWNER_CD: {NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @return The value of the column 'OWNER_CD'. (NullAllowed)
     */
    public String getOwnerCd() {
        return _ownerCd;
    }

    /**
     * [set] OWNER_CD: {NotNull, varchar(30)} <br>
     * 取引先（荷主）CD
     * @param ownerCd The value of the column 'OWNER_CD'. (NullAllowed)
     */
    public void setOwnerCd(String ownerCd) {
        __modifiedProperties.add("ownerCd");
        this._ownerCd = ownerCd;
    }

    /**
     * [get] INVENTORY_KBN: {NotNull, varchar(30)} <br>
     * 棚卸区分
     * @return The value of the column 'INVENTORY_KBN'. (NullAllowed)
     */
    public String getInventoryKbn() {
        return _inventoryKbn;
    }

    /**
     * [set] INVENTORY_KBN: {NotNull, varchar(30)} <br>
     * 棚卸区分
     * @param inventoryKbn The value of the column 'INVENTORY_KBN'. (NullAllowed)
     */
    public void setInventoryKbn(String inventoryKbn) {
        __modifiedProperties.add("inventoryKbn");
        this._inventoryKbn = inventoryKbn;
    }

    /**
     * [get] LINE_BLOCK: {NotNull, varchar(30)} <br>
     * ライン／ブロック
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public String getLineBlock() {
        return _lineBlock;
    }

    /**
     * [set] LINE_BLOCK: {NotNull, varchar(30)} <br>
     * ライン／ブロック
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed)
     */
    public void setLineBlock(String lineBlock) {
        __modifiedProperties.add("lineBlock");
        this._lineBlock = lineBlock;
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
     * [get] INVENTORY_KEY: {NotNull, varchar(30)} <br>
     * 在庫調査指示キー
     * @return The value of the column 'INVENTORY_KEY'. (NullAllowed)
     */
    public String getInventoryKey() {
        return _inventoryKey;
    }

    /**
     * [set] INVENTORY_KEY: {NotNull, varchar(30)} <br>
     * 在庫調査指示キー
     * @param inventoryKey The value of the column 'INVENTORY_KEY'. (NullAllowed)
     */
    public void setInventoryKey(String inventoryKey) {
        __modifiedProperties.add("inventoryKey");
        this._inventoryKey = inventoryKey;
    }

    /**
     * [get] INVENTORY_B_ID: {NotNull, bigint(19)} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public Long getInventoryBId() {
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {NotNull, bigint(19)} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public void setInventoryBId(Long inventoryBId) {
        __modifiedProperties.add("inventoryBId");
        this._inventoryBId = inventoryBId;
    }

    /**
     * [get] INVENTORY_DATE: {IX, NotNull, varchar(8)} <br>
     * 在庫調査日
     * @return The value of the column 'INVENTORY_DATE'. (NullAllowed)
     */
    public String getInventoryDate() {
        return _inventoryDate;
    }

    /**
     * [set] INVENTORY_DATE: {IX, NotNull, varchar(8)} <br>
     * 在庫調査日
     * @param inventoryDate The value of the column 'INVENTORY_DATE'. (NullAllowed)
     */
    public void setInventoryDate(String inventoryDate) {
        __modifiedProperties.add("inventoryDate");
        this._inventoryDate = inventoryDate;
    }

    /**
     * [get] BF_MANUFACTURE_DATE: {varchar(8)} <br>
     * 前回製造年月日
     * @return The value of the column 'BF_MANUFACTURE_DATE'. (NullAllowed)
     */
    public String getBfManufactureDate() {
        return _bfManufactureDate;
    }

    /**
     * [set] BF_MANUFACTURE_DATE: {varchar(8)} <br>
     * 前回製造年月日
     * @param bfManufactureDate The value of the column 'BF_MANUFACTURE_DATE'. (NullAllowed)
     */
    public void setBfManufactureDate(String bfManufactureDate) {
        __modifiedProperties.add("bfManufactureDate");
        this._bfManufactureDate = bfManufactureDate;
    }

    /**
     * [get] AF_MANUFACTURE_DATE: {varchar(8)} <br>
     * 今回製造年月日
     * @return The value of the column 'AF_MANUFACTURE_DATE'. (NullAllowed)
     */
    public String getAfManufactureDate() {
        return _afManufactureDate;
    }

    /**
     * [set] AF_MANUFACTURE_DATE: {varchar(8)} <br>
     * 今回製造年月日
     * @param afManufactureDate The value of the column 'AF_MANUFACTURE_DATE'. (NullAllowed)
     */
    public void setAfManufactureDate(String afManufactureDate) {
        __modifiedProperties.add("afManufactureDate");
        this._afManufactureDate = afManufactureDate;
    }

    /**
     * [get] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGN_FLG'. (NullAllowed)
     */
    public String getDesignFlg() {
        return _designFlg;
    }

    /**
     * [set] DESIGN_FLG: {varchar(30)} <br>
     * デザイン区分
     * @param designFlg The value of the column 'DESIGN_FLG'. (NullAllowed)
     */
    public void setDesignFlg(String designFlg) {
        __modifiedProperties.add("designFlg");
        this._designFlg = designFlg;
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
