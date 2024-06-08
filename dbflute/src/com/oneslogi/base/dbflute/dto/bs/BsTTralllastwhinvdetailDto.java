package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of T_TRALLLASTWHINVDETAIL as TABLE. <br>
 * 拠点別在庫照会（保管場・仕分場・引取場）明細情報
 * <pre>
 * [primary-key]
 *     ALLLASTWHINVDETAILKEY
 *
 * [column]
 *     ALLLASTWHINVDETAILKEY, PRODUCT_CD, PRODUCTDATE, DESIGNCD, INVNUM, INVKBNCD, INVKBN, TRANSPORTCD, FIRMCARRYNO, ASSORTEDUNIT, LOCCD, SCHDATE, RECEIVEDATE, OUTPUTTYPE, OUTPUTORG, USETYPE, PROCFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALLLASTWHINVDETAILKEY
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
public abstract class BsTTralllastwhinvdetailDto implements Serializable {

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
    /** ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _alllastwhinvdetailkey;

    /** PRODUCT_CD: {IX+, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCTDATE: {IX+, varchar(8)} */
    @JsonKey
    protected String _productdate;

    /** DESIGNCD: {IX+, varchar(30)} */
    @JsonKey
    protected String _designcd;

    /** INVNUM: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _invnum;

    /** INVKBNCD: {char(1)} */
    @JsonKey
    protected String _invkbncd;

    /** INVKBN: {varchar(30)} */
    @JsonKey
    protected String _invkbn;

    /** TRANSPORTCD: {varchar(30)} */
    @JsonKey
    protected String _transportcd;

    /** FIRMCARRYNO: {varchar(30)} */
    @JsonKey
    protected String _firmcarryno;

    /** ASSORTEDUNIT: {varchar(30)} */
    @JsonKey
    protected String _assortedunit;

    /** LOCCD: {varchar(30)} */
    @JsonKey
    protected String _loccd;

    /** SCHDATE: {varchar(8)} */
    @JsonKey
    protected String _schdate;

    /** RECEIVEDATE: {varchar(8)} */
    @JsonKey
    protected String _receivedate;

    /** OUTPUTTYPE: {decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _outputtype;

    /** OUTPUTORG: {bigint(19)} */
    @JsonKey
    protected Long _outputorg;

    /** USETYPE: {IX+, bigint(19)} */
    @JsonKey
    protected Long _usetype;

    /** PROCFLG: {bigint(19)} */
    @JsonKey
    protected Long _procflg;

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
    public BsTTralllastwhinvdetailDto() {
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
        if (other == null || !(other instanceof BsTTralllastwhinvdetailDto)) { return false; }
        final BsTTralllastwhinvdetailDto otherEntity = (BsTTralllastwhinvdetailDto)other;
        if (!helpComparingValue(getAlllastwhinvdetailkey(), otherEntity.getAlllastwhinvdetailkey())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "T_TRALLLASTWHINVDETAIL");
        result = xCH(result, getAlllastwhinvdetailkey());
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
        sb.append(c).append(getAlllastwhinvdetailkey());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductdate());
        sb.append(c).append(getDesigncd());
        sb.append(c).append(getInvnum());
        sb.append(c).append(getInvkbncd());
        sb.append(c).append(getInvkbn());
        sb.append(c).append(getTransportcd());
        sb.append(c).append(getFirmcarryno());
        sb.append(c).append(getAssortedunit());
        sb.append(c).append(getLoccd());
        sb.append(c).append(getSchdate());
        sb.append(c).append(getReceivedate());
        sb.append(c).append(getOutputtype());
        sb.append(c).append(getOutputorg());
        sb.append(c).append(getUsetype());
        sb.append(c).append(getProcflg());
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
     * [get] ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点別在庫照会（保管場・仕分場・引取場）明細キー
     * @return The value of the column 'ALLLASTWHINVDETAILKEY'. (NullAllowed)
     */
    public Long getAlllastwhinvdetailkey() {
        return _alllastwhinvdetailkey;
    }

    /**
     * [set] ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)} <br>
     * 拠点別在庫照会（保管場・仕分場・引取場）明細キー
     * @param alllastwhinvdetailkey The value of the column 'ALLLASTWHINVDETAILKEY'. (NullAllowed)
     */
    public void setAlllastwhinvdetailkey(Long alllastwhinvdetailkey) {
        __modifiedProperties.add("alllastwhinvdetailkey");
        this._alllastwhinvdetailkey = alllastwhinvdetailkey;
    }

    /**
     * [get] PRODUCT_CD: {IX+, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {IX+, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCTDATE: {IX+, varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'PRODUCTDATE'. (NullAllowed)
     */
    public String getProductdate() {
        return _productdate;
    }

    /**
     * [set] PRODUCTDATE: {IX+, varchar(8)} <br>
     * 製造年月日
     * @param productdate The value of the column 'PRODUCTDATE'. (NullAllowed)
     */
    public void setProductdate(String productdate) {
        __modifiedProperties.add("productdate");
        this._productdate = productdate;
    }

    /**
     * [get] DESIGNCD: {IX+, varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public String getDesigncd() {
        return _designcd;
    }

    /**
     * [set] DESIGNCD: {IX+, varchar(30)} <br>
     * デザイン区分
     * @param designcd The value of the column 'DESIGNCD'. (NullAllowed)
     */
    public void setDesigncd(String designcd) {
        __modifiedProperties.add("designcd");
        this._designcd = designcd;
    }

    /**
     * [get] INVNUM: {decimal(16, 6)} <br>
     * 在庫数量
     * @return The value of the column 'INVNUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInvnum() {
        return _invnum;
    }

    /**
     * [set] INVNUM: {decimal(16, 6)} <br>
     * 在庫数量
     * @param invnum The value of the column 'INVNUM'. (NullAllowed)
     */
    public void setInvnum(java.math.BigDecimal invnum) {
        __modifiedProperties.add("invnum");
        this._invnum = invnum;
    }

    /**
     * [get] INVKBNCD: {char(1)} <br>
     * 情報元CD値
     * @return The value of the column 'INVKBNCD'. (NullAllowed)
     */
    public String getInvkbncd() {
        return _invkbncd;
    }

    /**
     * [set] INVKBNCD: {char(1)} <br>
     * 情報元CD値
     * @param invkbncd The value of the column 'INVKBNCD'. (NullAllowed)
     */
    public void setInvkbncd(String invkbncd) {
        __modifiedProperties.add("invkbncd");
        this._invkbncd = invkbncd;
    }

    /**
     * [get] INVKBN: {varchar(30)} <br>
     * 情報元
     * @return The value of the column 'INVKBN'. (NullAllowed)
     */
    public String getInvkbn() {
        return _invkbn;
    }

    /**
     * [set] INVKBN: {varchar(30)} <br>
     * 情報元
     * @param invkbn The value of the column 'INVKBN'. (NullAllowed)
     */
    public void setInvkbn(String invkbn) {
        __modifiedProperties.add("invkbn");
        this._invkbn = invkbn;
    }

    /**
     * [get] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public String getTransportcd() {
        return _transportcd;
    }

    /**
     * [set] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed)
     */
    public void setTransportcd(String transportcd) {
        __modifiedProperties.add("transportcd");
        this._transportcd = transportcd;
    }

    /**
     * [get] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public String getFirmcarryno() {
        return _firmcarryno;
    }

    /**
     * [set] FIRMCARRYNO: {varchar(30)} <br>
     * 商社搬入番号
     * @param firmcarryno The value of the column 'FIRMCARRYNO'. (NullAllowed)
     */
    public void setFirmcarryno(String firmcarryno) {
        __modifiedProperties.add("firmcarryno");
        this._firmcarryno = firmcarryno;
    }

    /**
     * [get] ASSORTEDUNIT: {varchar(30)} <br>
     * 仕分ロケ
     * @return The value of the column 'ASSORTEDUNIT'. (NullAllowed)
     */
    public String getAssortedunit() {
        return _assortedunit;
    }

    /**
     * [set] ASSORTEDUNIT: {varchar(30)} <br>
     * 仕分ロケ
     * @param assortedunit The value of the column 'ASSORTEDUNIT'. (NullAllowed)
     */
    public void setAssortedunit(String assortedunit) {
        __modifiedProperties.add("assortedunit");
        this._assortedunit = assortedunit;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * 保管場ロケ
     * @return The value of the column 'LOCCD'. (NullAllowed)
     */
    public String getLoccd() {
        return _loccd;
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * 保管場ロケ
     * @param loccd The value of the column 'LOCCD'. (NullAllowed)
     */
    public void setLoccd(String loccd) {
        __modifiedProperties.add("loccd");
        this._loccd = loccd;
    }

    /**
     * [get] SCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SCHDATE'. (NullAllowed)
     */
    public String getSchdate() {
        return _schdate;
    }

    /**
     * [set] SCHDATE: {varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SCHDATE'. (NullAllowed)
     */
    public void setSchdate(String schdate) {
        __modifiedProperties.add("schdate");
        this._schdate = schdate;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫実績日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public String getReceivedate() {
        return _receivedate;
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫実績日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed)
     */
    public void setReceivedate(String receivedate) {
        __modifiedProperties.add("receivedate");
        this._receivedate = receivedate;
    }

    /**
     * [get] OUTPUTTYPE: {decimal(16, 6)} <br>
     * 一般出力順
     * @return The value of the column 'OUTPUTTYPE'. (NullAllowed)
     */
    public java.math.BigDecimal getOutputtype() {
        return _outputtype;
    }

    /**
     * [set] OUTPUTTYPE: {decimal(16, 6)} <br>
     * 一般出力順
     * @param outputtype The value of the column 'OUTPUTTYPE'. (NullAllowed)
     */
    public void setOutputtype(java.math.BigDecimal outputtype) {
        __modifiedProperties.add("outputtype");
        this._outputtype = outputtype;
    }

    /**
     * [get] OUTPUTORG: {bigint(19)} <br>
     * 出力順（組織）
     * @return The value of the column 'OUTPUTORG'. (NullAllowed)
     */
    public Long getOutputorg() {
        return _outputorg;
    }

    /**
     * [set] OUTPUTORG: {bigint(19)} <br>
     * 出力順（組織）
     * @param outputorg The value of the column 'OUTPUTORG'. (NullAllowed)
     */
    public void setOutputorg(Long outputorg) {
        __modifiedProperties.add("outputorg");
        this._outputorg = outputorg;
    }

    /**
     * [get] USETYPE: {IX+, bigint(19)} <br>
     * 使用区分
     * @return The value of the column 'USETYPE'. (NullAllowed)
     */
    public Long getUsetype() {
        return _usetype;
    }

    /**
     * [set] USETYPE: {IX+, bigint(19)} <br>
     * 使用区分
     * @param usetype The value of the column 'USETYPE'. (NullAllowed)
     */
    public void setUsetype(Long usetype) {
        __modifiedProperties.add("usetype");
        this._usetype = usetype;
    }

    /**
     * [get] PROCFLG: {bigint(19)} <br>
     * 処理区分
     * @return The value of the column 'PROCFLG'. (NullAllowed)
     */
    public Long getProcflg() {
        return _procflg;
    }

    /**
     * [set] PROCFLG: {bigint(19)} <br>
     * 処理区分
     * @param procflg The value of the column 'PROCFLG'. (NullAllowed)
     */
    public void setProcflg(Long procflg) {
        __modifiedProperties.add("procflg");
        this._procflg = procflg;
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
