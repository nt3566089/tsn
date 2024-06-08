package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_SHAPE_GRP as TABLE. <br>
 * 荷姿グループマスタ
 * <pre>
 * [primary-key]
 *     SHAPE_GRP_ID
 *
 * [column]
 *     SHAPE_GRP_ID, CLIENT_ID, SHAPE_GRP_CD, SHAPE_GRP_NAME, DECIMAL_EXIST_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHAPE_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CLIENT, B_CLASS_DTL(ByDecimalExistFlg)
 *
 * [referrer-table]
 *     M_CLIENT, M_PRODUCT, M_SHAPE_GRP_DTL
 *
 * [foreign-property]
 *     mClient, bClassDtlByDecimalExistFlg, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     mClientList, mProductList, mShapeGrpDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMShapeGrpDto implements Serializable {

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
    /** SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _shapeGrpId;

    /** CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** SHAPE_GRP_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _shapeGrpCd;

    /** SHAPE_GRP_NAME: {NotNull, varchar(255)} */
    @JsonKey
    protected String _shapeGrpName;

    /** DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg} */
    @JsonKey
    protected String _decimalExistFlg;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
    public BsMShapeGrpDto() {
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

    protected BClassDtlDto _bClassDtlByDecimalExistFlg;

    public BClassDtlDto getBClassDtlByDecimalExistFlg() {
        return _bClassDtlByDecimalExistFlg;
    }

    public void setBClassDtlByDecimalExistFlg(BClassDtlDto bClassDtlByDecimalExistFlg) {
        this._bClassDtlByDecimalExistFlg = bClassDtlByDecimalExistFlg;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MClientDto> _mClientList;

    public List<MClientDto> getMClientList() {
        if (_mClientList == null) { _mClientList = new ArrayList<MClientDto>(); }
        return _mClientList;
    }

    public void setMClientList(List<MClientDto> mClientList) {
        this._mClientList = mClientList;
    }

    protected List<MProductDto> _mProductList;

    public List<MProductDto> getMProductList() {
        if (_mProductList == null) { _mProductList = new ArrayList<MProductDto>(); }
        return _mProductList;
    }

    public void setMProductList(List<MProductDto> mProductList) {
        this._mProductList = mProductList;
    }

    protected List<MShapeGrpDtlDto> _mShapeGrpDtlList;

    public List<MShapeGrpDtlDto> getMShapeGrpDtlList() {
        if (_mShapeGrpDtlList == null) { _mShapeGrpDtlList = new ArrayList<MShapeGrpDtlDto>(); }
        return _mShapeGrpDtlList;
    }

    public void setMShapeGrpDtlList(List<MShapeGrpDtlDto> mShapeGrpDtlList) {
        this._mShapeGrpDtlList = mShapeGrpDtlList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMShapeGrpDto)) { return false; }
        final BsMShapeGrpDto otherEntity = (BsMShapeGrpDto)other;
        if (!helpComparingValue(getShapeGrpId(), otherEntity.getShapeGrpId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_SHAPE_GRP");
        result = xCH(result, getShapeGrpId());
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
        sb.append(c).append(getShapeGrpId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getShapeGrpCd());
        sb.append(c).append(getShapeGrpName());
        sb.append(c).append(getDecimalExistFlg());
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
     * [get] SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷姿グループID
     * @return The value of the column 'SHAPE_GRP_ID'. (NullAllowed)
     */
    public Long getShapeGrpId() {
        return _shapeGrpId;
    }

    /**
     * [set] SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 荷姿グループID
     * @param shapeGrpId The value of the column 'SHAPE_GRP_ID'. (NullAllowed)
     */
    public void setShapeGrpId(Long shapeGrpId) {
        __modifiedProperties.add("shapeGrpId");
        this._shapeGrpId = shapeGrpId;
    }

    /**
     * [get] CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] SHAPE_GRP_CD: {NotNull, varchar(30)} <br>
     * 荷姿グループCD
     * @return The value of the column 'SHAPE_GRP_CD'. (NullAllowed)
     */
    public String getShapeGrpCd() {
        return _shapeGrpCd;
    }

    /**
     * [set] SHAPE_GRP_CD: {NotNull, varchar(30)} <br>
     * 荷姿グループCD
     * @param shapeGrpCd The value of the column 'SHAPE_GRP_CD'. (NullAllowed)
     */
    public void setShapeGrpCd(String shapeGrpCd) {
        __modifiedProperties.add("shapeGrpCd");
        this._shapeGrpCd = shapeGrpCd;
    }

    /**
     * [get] SHAPE_GRP_NAME: {NotNull, varchar(255)} <br>
     * 荷姿グループ名称
     * @return The value of the column 'SHAPE_GRP_NAME'. (NullAllowed)
     */
    public String getShapeGrpName() {
        return _shapeGrpName;
    }

    /**
     * [set] SHAPE_GRP_NAME: {NotNull, varchar(255)} <br>
     * 荷姿グループ名称
     * @param shapeGrpName The value of the column 'SHAPE_GRP_NAME'. (NullAllowed)
     */
    public void setShapeGrpName(String shapeGrpName) {
        __modifiedProperties.add("shapeGrpName");
        this._shapeGrpName = shapeGrpName;
    }

    /**
     * [get] DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg} <br>
     * 小数有無フラグ
     * @return The value of the column 'DECIMAL_EXIST_FLG'. (NullAllowed)
     */
    public String getDecimalExistFlg() {
        return _decimalExistFlg;
    }

    /**
     * [set] DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg} <br>
     * 小数有無フラグ
     * @param decimalExistFlg The value of the column 'DECIMAL_EXIST_FLG'. (NullAllowed)
     */
    public void setDecimalExistFlg(String decimalExistFlg) {
        __modifiedProperties.add("decimalExistFlg");
        this._decimalExistFlg = decimalExistFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
