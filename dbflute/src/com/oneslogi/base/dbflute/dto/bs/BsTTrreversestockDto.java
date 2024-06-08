package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of T_TRREVERSESTOCK as TABLE. <br>
 * 逆転補充情報
 * <pre>
 * [primary-key]
 *     TRREVERSESTOCK_ID
 *
 * [column]
 *     TRREVERSESTOCK_ID, TRCASESTOCKDETAIL_ID, CENTER_SYMBOL_ID, SORTSTOCKDATE, SORTSTOCKKBN, SOTEDUNIT, SORTLOCCD, PRODUCT_CD, STMANUFACTUREDATE, SOMANUFACTUREDATE, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRREVERSESTOCK_ID
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
public abstract class BsTTrreversestockDto implements Serializable {

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
    /** TRREVERSESTOCK_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _trreversestockId;

    /** TRCASESTOCKDETAIL_ID: {NotNull, bigint(19)} */
    @JsonKey
    protected Long _trcasestockdetailId;

    /** CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _centerSymbolId;

    /** SORTSTOCKDATE: {NotNull, varchar(8)} */
    @JsonKey
    protected String _sortstockdate;

    /** SORTSTOCKKBN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sortstockkbn;

    /** SOTEDUNIT: {NotNull, varchar(30)} */
    @JsonKey
    protected String _sotedunit;

    /** SORTLOCCD: {NotNull, varchar(255)} */
    @JsonKey
    protected String _sortloccd;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** STMANUFACTUREDATE: {varchar(8)} */
    @JsonKey
    protected String _stmanufacturedate;

    /** SOMANUFACTUREDATE: {varchar(8)} */
    @JsonKey
    protected String _somanufacturedate;

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
    public BsTTrreversestockDto() {
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
        if (other == null || !(other instanceof BsTTrreversestockDto)) { return false; }
        final BsTTrreversestockDto otherEntity = (BsTTrreversestockDto)other;
        if (!helpComparingValue(getTrreversestockId(), otherEntity.getTrreversestockId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRREVERSESTOCK");
        result = xCH(result, getTrreversestockId());
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
        sb.append(c).append(getTrreversestockId());
        sb.append(c).append(getTrcasestockdetailId());
        sb.append(c).append(getCenterSymbolId());
        sb.append(c).append(getSortstockdate());
        sb.append(c).append(getSortstockkbn());
        sb.append(c).append(getSotedunit());
        sb.append(c).append(getSortloccd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getStmanufacturedate());
        sb.append(c).append(getSomanufacturedate());
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
     * [get] TRREVERSESTOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 逆転補充情報ID
     * @return The value of the column 'TRREVERSESTOCK_ID'. (NullAllowed)
     */
    public Long getTrreversestockId() {
        return _trreversestockId;
    }

    /**
     * [set] TRREVERSESTOCK_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 逆転補充情報ID
     * @param trreversestockId The value of the column 'TRREVERSESTOCK_ID'. (NullAllowed)
     */
    public void setTrreversestockId(Long trreversestockId) {
        __modifiedProperties.add("trreversestockId");
        this._trreversestockId = trreversestockId;
    }

    /**
     * [get] TRCASESTOCKDETAIL_ID: {NotNull, bigint(19)} <br>
     * ケース補充明細情報ID
     * @return The value of the column 'TRCASESTOCKDETAIL_ID'. (NullAllowed)
     */
    public Long getTrcasestockdetailId() {
        return _trcasestockdetailId;
    }

    /**
     * [set] TRCASESTOCKDETAIL_ID: {NotNull, bigint(19)} <br>
     * ケース補充明細情報ID
     * @param trcasestockdetailId The value of the column 'TRCASESTOCKDETAIL_ID'. (NullAllowed)
     */
    public void setTrcasestockdetailId(Long trcasestockdetailId) {
        __modifiedProperties.add("trcasestockdetailId");
        this._trcasestockdetailId = trcasestockdetailId;
    }

    /**
     * [get] CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)} <br>
     * 拠点シンボルID
     * @return The value of the column 'CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public java.math.BigDecimal getCenterSymbolId() {
        return _centerSymbolId;
    }

    /**
     * [set] CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)} <br>
     * 拠点シンボルID
     * @param centerSymbolId The value of the column 'CENTER_SYMBOL_ID'. (NullAllowed)
     */
    public void setCenterSymbolId(java.math.BigDecimal centerSymbolId) {
        __modifiedProperties.add("centerSymbolId");
        this._centerSymbolId = centerSymbolId;
    }

    /**
     * [get] SORTSTOCKDATE: {NotNull, varchar(8)} <br>
     * ラック間製品移動日
     * @return The value of the column 'SORTSTOCKDATE'. (NullAllowed)
     */
    public String getSortstockdate() {
        return _sortstockdate;
    }

    /**
     * [set] SORTSTOCKDATE: {NotNull, varchar(8)} <br>
     * ラック間製品移動日
     * @param sortstockdate The value of the column 'SORTSTOCKDATE'. (NullAllowed)
     */
    public void setSortstockdate(String sortstockdate) {
        __modifiedProperties.add("sortstockdate");
        this._sortstockdate = sortstockdate;
    }

    /**
     * [get] SORTSTOCKKBN: {NotNull, varchar(30)} <br>
     * 仕分補充区分
     * @return The value of the column 'SORTSTOCKKBN'. (NullAllowed)
     */
    public String getSortstockkbn() {
        return _sortstockkbn;
    }

    /**
     * [set] SORTSTOCKKBN: {NotNull, varchar(30)} <br>
     * 仕分補充区分
     * @param sortstockkbn The value of the column 'SORTSTOCKKBN'. (NullAllowed)
     */
    public void setSortstockkbn(String sortstockkbn) {
        __modifiedProperties.add("sortstockkbn");
        this._sortstockkbn = sortstockkbn;
    }

    /**
     * [get] SOTEDUNIT: {NotNull, varchar(30)} <br>
     * 補充先
     * @return The value of the column 'SOTEDUNIT'. (NullAllowed)
     */
    public String getSotedunit() {
        return _sotedunit;
    }

    /**
     * [set] SOTEDUNIT: {NotNull, varchar(30)} <br>
     * 補充先
     * @param sotedunit The value of the column 'SOTEDUNIT'. (NullAllowed)
     */
    public void setSotedunit(String sotedunit) {
        __modifiedProperties.add("sotedunit");
        this._sotedunit = sotedunit;
    }

    /**
     * [get] SORTLOCCD: {NotNull, varchar(255)} <br>
     * 仕分ロケ
     * @return The value of the column 'SORTLOCCD'. (NullAllowed)
     */
    public String getSortloccd() {
        return _sortloccd;
    }

    /**
     * [set] SORTLOCCD: {NotNull, varchar(255)} <br>
     * 仕分ロケ
     * @param sortloccd The value of the column 'SORTLOCCD'. (NullAllowed)
     */
    public void setSortloccd(String sortloccd) {
        __modifiedProperties.add("sortloccd");
        this._sortloccd = sortloccd;
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
     * [get] STMANUFACTUREDATE: {varchar(8)} <br>
     * 補充製品製造年月日
     * @return The value of the column 'STMANUFACTUREDATE'. (NullAllowed)
     */
    public String getStmanufacturedate() {
        return _stmanufacturedate;
    }

    /**
     * [set] STMANUFACTUREDATE: {varchar(8)} <br>
     * 補充製品製造年月日
     * @param stmanufacturedate The value of the column 'STMANUFACTUREDATE'. (NullAllowed)
     */
    public void setStmanufacturedate(String stmanufacturedate) {
        __modifiedProperties.add("stmanufacturedate");
        this._stmanufacturedate = stmanufacturedate;
    }

    /**
     * [get] SOMANUFACTUREDATE: {varchar(8)} <br>
     * 仕分ロケ内製造年月日
     * @return The value of the column 'SOMANUFACTUREDATE'. (NullAllowed)
     */
    public String getSomanufacturedate() {
        return _somanufacturedate;
    }

    /**
     * [set] SOMANUFACTUREDATE: {varchar(8)} <br>
     * 仕分ロケ内製造年月日
     * @param somanufacturedate The value of the column 'SOMANUFACTUREDATE'. (NullAllowed)
     */
    public void setSomanufacturedate(String somanufacturedate) {
        __modifiedProperties.add("somanufacturedate");
        this._somanufacturedate = somanufacturedate;
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
