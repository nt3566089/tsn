package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of H_PACKING_H as TABLE. <br>
 * 梱包ヘッダ履歴
 * <pre>
 * [primary-key]
 *     PACKING_H_ID
 *
 * [column]
 *     PACKING_H_ID, SHIPPING_INST_H_ID, PROCESS_TYPE_ID, CARRIER_TRACE_NUM, BOX_ID, BOX_CD, BOX_NM, GROSS_WEIGHT, TOTAL_VOLUME, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     H_SHIPPING_H
 *
 * [referrer-table]
 *     H_PACKING_B
 *
 * [foreign-property]
 *     hShippingH
 *
 * [referrer-property]
 *     hPackingBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsHPackingHDto implements Serializable {

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
    /** PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _packingHId;

    /** SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H} */
    @JsonKey
    protected Long _shippingInstHId;

    /** PROCESS_TYPE_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _processTypeId;

    /** CARRIER_TRACE_NUM: {varchar(30)} */
    @JsonKey
    protected String _carrierTraceNum;

    /** BOX_ID: {bigint(19)} */
    @JsonKey
    protected Long _boxId;

    /** BOX_CD: {varchar(30)} */
    @JsonKey
    protected String _boxCd;

    /** BOX_NM: {varchar(60)} */
    @JsonKey
    protected String _boxNm;

    /** GROSS_WEIGHT: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _grossWeight;

    /** TOTAL_VOLUME: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _totalVolume;

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
    public BsHPackingHDto() {
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
    protected HShippingHDto _hShippingH;

    public HShippingHDto getHShippingH() {
        return _hShippingH;
    }

    public void setHShippingH(HShippingHDto hShippingH) {
        this._hShippingH = hShippingH;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<HPackingBDto> _hPackingBList;

    public List<HPackingBDto> getHPackingBList() {
        if (_hPackingBList == null) { _hPackingBList = new ArrayList<HPackingBDto>(); }
        return _hPackingBList;
    }

    public void setHPackingBList(List<HPackingBDto> hPackingBList) {
        this._hPackingBList = hPackingBList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsHPackingHDto)) { return false; }
        final BsHPackingHDto otherEntity = (BsHPackingHDto)other;
        if (!helpComparingValue(getPackingHId(), otherEntity.getPackingHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "H_PACKING_H");
        result = xCH(result, getPackingHId());
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
        sb.append(c).append(getPackingHId());
        sb.append(c).append(getShippingInstHId());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getCarrierTraceNum());
        sb.append(c).append(getBoxId());
        sb.append(c).append(getBoxCd());
        sb.append(c).append(getBoxNm());
        sb.append(c).append(getGrossWeight());
        sb.append(c).append(getTotalVolume());
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
     * [get] PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 梱包ヘッダID
     * @return The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public Long getPackingHId() {
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 梱包ヘッダID
     * @param packingHId The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public void setPackingHId(Long packingHId) {
        __modifiedProperties.add("packingHId");
        this._packingHId = packingHId;
    }

    /**
     * [get] SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H} <br>
     * 出荷指示ヘッダID
     * @return The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public Long getShippingInstHId() {
        return _shippingInstHId;
    }

    /**
     * [set] SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H} <br>
     * 出荷指示ヘッダID
     * @param shippingInstHId The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public void setShippingInstHId(Long shippingInstHId) {
        __modifiedProperties.add("shippingInstHId");
        this._shippingInstHId = shippingInstHId;
    }

    /**
     * [get] PROCESS_TYPE_ID: {NotNull, bigint(19)} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public Long getProcessTypeId() {
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {NotNull, bigint(19)} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public void setProcessTypeId(Long processTypeId) {
        __modifiedProperties.add("processTypeId");
        this._processTypeId = processTypeId;
    }

    /**
     * [get] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * 貨物追跡No.
     * @return The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public String getCarrierTraceNum() {
        return _carrierTraceNum;
    }

    /**
     * [set] CARRIER_TRACE_NUM: {varchar(30)} <br>
     * 貨物追跡No.
     * @param carrierTraceNum The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public void setCarrierTraceNum(String carrierTraceNum) {
        __modifiedProperties.add("carrierTraceNum");
        this._carrierTraceNum = carrierTraceNum;
    }

    /**
     * [get] BOX_ID: {bigint(19)} <br>
     * 荷材ID
     * @return The value of the column 'BOX_ID'. (NullAllowed)
     */
    public Long getBoxId() {
        return _boxId;
    }

    /**
     * [set] BOX_ID: {bigint(19)} <br>
     * 荷材ID
     * @param boxId The value of the column 'BOX_ID'. (NullAllowed)
     */
    public void setBoxId(Long boxId) {
        __modifiedProperties.add("boxId");
        this._boxId = boxId;
    }

    /**
     * [get] BOX_CD: {varchar(30)} <br>
     * 荷材CD
     * @return The value of the column 'BOX_CD'. (NullAllowed)
     */
    public String getBoxCd() {
        return _boxCd;
    }

    /**
     * [set] BOX_CD: {varchar(30)} <br>
     * 荷材CD
     * @param boxCd The value of the column 'BOX_CD'. (NullAllowed)
     */
    public void setBoxCd(String boxCd) {
        __modifiedProperties.add("boxCd");
        this._boxCd = boxCd;
    }

    /**
     * [get] BOX_NM: {varchar(60)} <br>
     * 荷材名称
     * @return The value of the column 'BOX_NM'. (NullAllowed)
     */
    public String getBoxNm() {
        return _boxNm;
    }

    /**
     * [set] BOX_NM: {varchar(60)} <br>
     * 荷材名称
     * @param boxNm The value of the column 'BOX_NM'. (NullAllowed)
     */
    public void setBoxNm(String boxNm) {
        __modifiedProperties.add("boxNm");
        this._boxNm = boxNm;
    }

    /**
     * [get] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * 総重量(g)
     * @return The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public java.math.BigDecimal getGrossWeight() {
        return _grossWeight;
    }

    /**
     * [set] GROSS_WEIGHT: {decimal(16, 6)} <br>
     * 総重量(g)
     * @param grossWeight The value of the column 'GROSS_WEIGHT'. (NullAllowed)
     */
    public void setGrossWeight(java.math.BigDecimal grossWeight) {
        __modifiedProperties.add("grossWeight");
        this._grossWeight = grossWeight;
    }

    /**
     * [get] TOTAL_VOLUME: {decimal(16, 6)} <br>
     * 総容積(mm3)
     * @return The value of the column 'TOTAL_VOLUME'. (NullAllowed)
     */
    public java.math.BigDecimal getTotalVolume() {
        return _totalVolume;
    }

    /**
     * [set] TOTAL_VOLUME: {decimal(16, 6)} <br>
     * 総容積(mm3)
     * @param totalVolume The value of the column 'TOTAL_VOLUME'. (NullAllowed)
     */
    public void setTotalVolume(java.math.BigDecimal totalVolume) {
        __modifiedProperties.add("totalVolume");
        this._totalVolume = totalVolume;
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
