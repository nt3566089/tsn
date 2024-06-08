package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of W_SGL_ROW_SHIP_INSP_H as TABLE. <br>
 * 単行出荷検品ワークヘッダ
 * <pre>
 * [primary-key]
 *     SGL_ROW_SHIP_INSP_H_ID
 *
 * [column]
 *     SGL_ROW_SHIP_INSP_H_ID, CLIENT_ID, CENTER_ID, PICKING_GROUP_NO, TEMP_NO, PRODUCT_ID, WORK_INST_NUM, SLIP_NUM, INSPECTED_SLIP_NUM, BOX_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SGL_ROW_SHIP_INSP_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_BOX, M_CLIENT, M_PRODUCT, M_CENTER
 *
 * [referrer-table]
 *     W_SGL_ROW_SHIP_INSP_B
 *
 * [foreign-property]
 *     mBox, mClient, mProduct, mCenter
 *
 * [referrer-property]
 *     wSglRowShipInspBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWSglRowShipInspHDto implements Serializable {

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
    /** SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _sglRowShipInspHId;

    /** CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER} */
    @JsonKey
    protected Long _centerId;

    /** PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)} */
    @JsonKey
    protected String _pickingGroupNo;

    /** TEMP_NO: {+UQ, NotNull, varchar(30)} */
    @JsonKey
    protected String _tempNo;

    /** PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT} */
    @JsonKey
    protected Long _productId;

    /** WORK_INST_NUM: {+UQ, NotNull, bigint(19)} */
    @JsonKey
    protected Long _workInstNum;

    /** SLIP_NUM: {bigint(19)} */
    @JsonKey
    protected Long _slipNum;

    /** INSPECTED_SLIP_NUM: {bigint(19)} */
    @JsonKey
    protected Long _inspectedSlipNum;

    /** BOX_ID: {IX, bigint(19), FK to M_BOX} */
    @JsonKey
    protected Long _boxId;

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
    public BsWSglRowShipInspHDto() {
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
    protected MBoxDto _mBox;

    public MBoxDto getMBox() {
        return _mBox;
    }

    public void setMBox(MBoxDto mBox) {
        this._mBox = mBox;
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
    protected List<WSglRowShipInspBDto> _wSglRowShipInspBList;

    public List<WSglRowShipInspBDto> getWSglRowShipInspBList() {
        if (_wSglRowShipInspBList == null) { _wSglRowShipInspBList = new ArrayList<WSglRowShipInspBDto>(); }
        return _wSglRowShipInspBList;
    }

    public void setWSglRowShipInspBList(List<WSglRowShipInspBDto> wSglRowShipInspBList) {
        this._wSglRowShipInspBList = wSglRowShipInspBList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWSglRowShipInspHDto)) { return false; }
        final BsWSglRowShipInspHDto otherEntity = (BsWSglRowShipInspHDto)other;
        if (!helpComparingValue(getSglRowShipInspHId(), otherEntity.getSglRowShipInspHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "W_SGL_ROW_SHIP_INSP_H");
        result = xCH(result, getSglRowShipInspHId());
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
        sb.append(c).append(getSglRowShipInspHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getPickingGroupNo());
        sb.append(c).append(getTempNo());
        sb.append(c).append(getProductId());
        sb.append(c).append(getWorkInstNum());
        sb.append(c).append(getSlipNum());
        sb.append(c).append(getInspectedSlipNum());
        sb.append(c).append(getBoxId());
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
     * [get] SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 単行出荷検品ワークヘッダID
     * @return The value of the column 'SGL_ROW_SHIP_INSP_H_ID'. (NullAllowed)
     */
    public Long getSglRowShipInspHId() {
        return _sglRowShipInspHId;
    }

    /**
     * [set] SGL_ROW_SHIP_INSP_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 単行出荷検品ワークヘッダID
     * @param sglRowShipInspHId The value of the column 'SGL_ROW_SHIP_INSP_H_ID'. (NullAllowed)
     */
    public void setSglRowShipInspHId(Long sglRowShipInspHId) {
        __modifiedProperties.add("sglRowShipInspHId");
        this._sglRowShipInspHId = sglRowShipInspHId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {+UQ, NotNull, bigint(19), FK to M_CENTER} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)} <br>
     * ピッキンググループNo.
     * @return The value of the column 'PICKING_GROUP_NO'. (NullAllowed)
     */
    public String getPickingGroupNo() {
        return _pickingGroupNo;
    }

    /**
     * [set] PICKING_GROUP_NO: {+UQ, NotNull, varchar(30)} <br>
     * ピッキンググループNo.
     * @param pickingGroupNo The value of the column 'PICKING_GROUP_NO'. (NullAllowed)
     */
    public void setPickingGroupNo(String pickingGroupNo) {
        __modifiedProperties.add("pickingGroupNo");
        this._pickingGroupNo = pickingGroupNo;
    }

    /**
     * [get] TEMP_NO: {+UQ, NotNull, varchar(30)} <br>
     * 仮置きNo.
     * @return The value of the column 'TEMP_NO'. (NullAllowed)
     */
    public String getTempNo() {
        return _tempNo;
    }

    /**
     * [set] TEMP_NO: {+UQ, NotNull, varchar(30)} <br>
     * 仮置きNo.
     * @param tempNo The value of the column 'TEMP_NO'. (NullAllowed)
     */
    public void setTempNo(String tempNo) {
        __modifiedProperties.add("tempNo");
        this._tempNo = tempNo;
    }

    /**
     * [get] PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {+UQ, IX, NotNull, bigint(19), FK to M_PRODUCT} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] WORK_INST_NUM: {+UQ, NotNull, bigint(19)} <br>
     * 作業指示数
     * @return The value of the column 'WORK_INST_NUM'. (NullAllowed)
     */
    public Long getWorkInstNum() {
        return _workInstNum;
    }

    /**
     * [set] WORK_INST_NUM: {+UQ, NotNull, bigint(19)} <br>
     * 作業指示数
     * @param workInstNum The value of the column 'WORK_INST_NUM'. (NullAllowed)
     */
    public void setWorkInstNum(Long workInstNum) {
        __modifiedProperties.add("workInstNum");
        this._workInstNum = workInstNum;
    }

    /**
     * [get] SLIP_NUM: {bigint(19)} <br>
     * 伝票数
     * @return The value of the column 'SLIP_NUM'. (NullAllowed)
     */
    public Long getSlipNum() {
        return _slipNum;
    }

    /**
     * [set] SLIP_NUM: {bigint(19)} <br>
     * 伝票数
     * @param slipNum The value of the column 'SLIP_NUM'. (NullAllowed)
     */
    public void setSlipNum(Long slipNum) {
        __modifiedProperties.add("slipNum");
        this._slipNum = slipNum;
    }

    /**
     * [get] INSPECTED_SLIP_NUM: {bigint(19)} <br>
     * 検品済伝票数
     * @return The value of the column 'INSPECTED_SLIP_NUM'. (NullAllowed)
     */
    public Long getInspectedSlipNum() {
        return _inspectedSlipNum;
    }

    /**
     * [set] INSPECTED_SLIP_NUM: {bigint(19)} <br>
     * 検品済伝票数
     * @param inspectedSlipNum The value of the column 'INSPECTED_SLIP_NUM'. (NullAllowed)
     */
    public void setInspectedSlipNum(Long inspectedSlipNum) {
        __modifiedProperties.add("inspectedSlipNum");
        this._inspectedSlipNum = inspectedSlipNum;
    }

    /**
     * [get] BOX_ID: {IX, bigint(19), FK to M_BOX} <br>
     * 荷材ID
     * @return The value of the column 'BOX_ID'. (NullAllowed)
     */
    public Long getBoxId() {
        return _boxId;
    }

    /**
     * [set] BOX_ID: {IX, bigint(19), FK to M_BOX} <br>
     * 荷材ID
     * @param boxId The value of the column 'BOX_ID'. (NullAllowed)
     */
    public void setBoxId(Long boxId) {
        __modifiedProperties.add("boxId");
        this._boxId = boxId;
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
