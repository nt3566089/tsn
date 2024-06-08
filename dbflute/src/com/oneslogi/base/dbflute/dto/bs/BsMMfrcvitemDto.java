package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_MFRCVITEM as TABLE. <br>
 * 入庫銘柄組替マスタ
 * <pre>
 * [primary-key]
 *     RCVITEM_ID
 *
 * [column]
 *     RCVITEM_ID, CLIENT_ID, RCVITEMKEY, ITEMCD_FROM, DESIGNCD_FROM, ITEMCD_TO, DESIGNCD_TO, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, ITEM_NM_FROM, ITEM_NM_TO, FCFLG, USERNUM3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RCVITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CLIENT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMMfrcvitemDto implements Serializable {

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
    /** RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)} */
    @JsonKey
    protected Long _rcvitemId;

    /** CLIENT_ID: {bigint(19), FK to M_CLIENT} */
    @JsonKey
    protected Long _clientId;

    /** RCVITEMKEY: {NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _rcvitemkey;

    /** ITEMCD_FROM: {NotNull, varchar(30)} */
    @JsonKey
    protected String _itemcdFrom;

    /** DESIGNCD_FROM: {varchar(30)} */
    @JsonKey
    protected String _designcdFrom;

    /** ITEMCD_TO: {varchar(30)} */
    @JsonKey
    protected String _itemcdTo;

    /** DESIGNCD_TO: {varchar(30)} */
    @JsonKey
    protected String _designcdTo;

    /** VA_EXTDATA1: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata1;

    /** VA_EXTDATA2: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata2;

    /** VA_EXTDATA3: {varchar(30)} */
    @JsonKey
    protected String _vaExtdata3;

    /** NV_EXTDATA1: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata1;

    /** NV_EXTDATA2: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata2;

    /** NV_EXTDATA3: {varchar(60)} */
    @JsonKey
    protected String _nvExtdata3;

    /** NM_EXTDATA1: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata1;

    /** NM_EXTDATA2: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata2;

    /** NM_EXTDATA3: {bigint(19)} */
    @JsonKey
    protected Long _nmExtdata3;

    /** DT_EXTDATA1: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata1;

    /** DT_EXTDATA2: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata2;

    /** DT_EXTDATA3: {varchar(8)} */
    @JsonKey
    protected String _dtExtdata3;

    /** ITEM_NM_FROM: {varchar(100)} */
    @JsonKey
    protected String _itemNmFrom;

    /** ITEM_NM_TO: {varchar(100)} */
    @JsonKey
    protected String _itemNmTo;

    /** FCFLG: {varchar(30)} */
    @JsonKey
    protected String _fcflg;

    /** USERNUM3: {varchar(30)} */
    @JsonKey
    protected String _usernum3;

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
    public BsMMfrcvitemDto() {
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

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMMfrcvitemDto)) { return false; }
        final BsMMfrcvitemDto otherEntity = (BsMMfrcvitemDto)other;
        if (!helpComparingValue(getRcvitemId(), otherEntity.getRcvitemId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_MFRCVITEM");
        result = xCH(result, getRcvitemId());
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
        sb.append(c).append(getRcvitemId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getRcvitemkey());
        sb.append(c).append(getItemcdFrom());
        sb.append(c).append(getDesigncdFrom());
        sb.append(c).append(getItemcdTo());
        sb.append(c).append(getDesigncdTo());
        sb.append(c).append(getVaExtdata1());
        sb.append(c).append(getVaExtdata2());
        sb.append(c).append(getVaExtdata3());
        sb.append(c).append(getNvExtdata1());
        sb.append(c).append(getNvExtdata2());
        sb.append(c).append(getNvExtdata3());
        sb.append(c).append(getNmExtdata1());
        sb.append(c).append(getNmExtdata2());
        sb.append(c).append(getNmExtdata3());
        sb.append(c).append(getDtExtdata1());
        sb.append(c).append(getDtExtdata2());
        sb.append(c).append(getDtExtdata3());
        sb.append(c).append(getItemNmFrom());
        sb.append(c).append(getItemNmTo());
        sb.append(c).append(getFcflg());
        sb.append(c).append(getUsernum3());
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
     * [get] RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫銘柄組替ID
     * @return The value of the column 'RCVITEM_ID'. (NullAllowed)
     */
    public Long getRcvitemId() {
        return _rcvitemId;
    }

    /**
     * [set] RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫銘柄組替ID
     * @param rcvitemId The value of the column 'RCVITEM_ID'. (NullAllowed)
     */
    public void setRcvitemId(Long rcvitemId) {
        __modifiedProperties.add("rcvitemId");
        this._rcvitemId = rcvitemId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] RCVITEMKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫銘柄組替キー
     * @return The value of the column 'RCVITEMKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getRcvitemkey() {
        return _rcvitemkey;
    }

    /**
     * [set] RCVITEMKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫銘柄組替キー
     * @param rcvitemkey The value of the column 'RCVITEMKEY'. (NullAllowed)
     */
    public void setRcvitemkey(java.math.BigDecimal rcvitemkey) {
        __modifiedProperties.add("rcvitemkey");
        this._rcvitemkey = rcvitemkey;
    }

    /**
     * [get] ITEMCD_FROM: {NotNull, varchar(30)} <br>
     * 組替前銘柄CD
     * @return The value of the column 'ITEMCD_FROM'. (NullAllowed)
     */
    public String getItemcdFrom() {
        return _itemcdFrom;
    }

    /**
     * [set] ITEMCD_FROM: {NotNull, varchar(30)} <br>
     * 組替前銘柄CD
     * @param itemcdFrom The value of the column 'ITEMCD_FROM'. (NullAllowed)
     */
    public void setItemcdFrom(String itemcdFrom) {
        __modifiedProperties.add("itemcdFrom");
        this._itemcdFrom = itemcdFrom;
    }

    /**
     * [get] DESIGNCD_FROM: {varchar(30)} <br>
     * 組替前デザイン区分
     * @return The value of the column 'DESIGNCD_FROM'. (NullAllowed)
     */
    public String getDesigncdFrom() {
        return _designcdFrom;
    }

    /**
     * [set] DESIGNCD_FROM: {varchar(30)} <br>
     * 組替前デザイン区分
     * @param designcdFrom The value of the column 'DESIGNCD_FROM'. (NullAllowed)
     */
    public void setDesigncdFrom(String designcdFrom) {
        __modifiedProperties.add("designcdFrom");
        this._designcdFrom = designcdFrom;
    }

    /**
     * [get] ITEMCD_TO: {varchar(30)} <br>
     * 組替後銘柄CD
     * @return The value of the column 'ITEMCD_TO'. (NullAllowed)
     */
    public String getItemcdTo() {
        return _itemcdTo;
    }

    /**
     * [set] ITEMCD_TO: {varchar(30)} <br>
     * 組替後銘柄CD
     * @param itemcdTo The value of the column 'ITEMCD_TO'. (NullAllowed)
     */
    public void setItemcdTo(String itemcdTo) {
        __modifiedProperties.add("itemcdTo");
        this._itemcdTo = itemcdTo;
    }

    /**
     * [get] DESIGNCD_TO: {varchar(30)} <br>
     * 組替後デザイン区分
     * @return The value of the column 'DESIGNCD_TO'. (NullAllowed)
     */
    public String getDesigncdTo() {
        return _designcdTo;
    }

    /**
     * [set] DESIGNCD_TO: {varchar(30)} <br>
     * 組替後デザイン区分
     * @param designcdTo The value of the column 'DESIGNCD_TO'. (NullAllowed)
     */
    public void setDesigncdTo(String designcdTo) {
        __modifiedProperties.add("designcdTo");
        this._designcdTo = designcdTo;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public String getVaExtdata1() {
        return _vaExtdata1;
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * 半角文字拡張項目１
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed)
     */
    public void setVaExtdata1(String vaExtdata1) {
        __modifiedProperties.add("vaExtdata1");
        this._vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @return The value of the column 'VA_EXTDATA2'. (NullAllowed)
     */
    public String getVaExtdata2() {
        return _vaExtdata2;
    }

    /**
     * [set] VA_EXTDATA2: {varchar(30)} <br>
     * 半角文字拡張項目２
     * @param vaExtdata2 The value of the column 'VA_EXTDATA2'. (NullAllowed)
     */
    public void setVaExtdata2(String vaExtdata2) {
        __modifiedProperties.add("vaExtdata2");
        this._vaExtdata2 = vaExtdata2;
    }

    /**
     * [get] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @return The value of the column 'VA_EXTDATA3'. (NullAllowed)
     */
    public String getVaExtdata3() {
        return _vaExtdata3;
    }

    /**
     * [set] VA_EXTDATA3: {varchar(30)} <br>
     * 半角文字拡張項目３
     * @param vaExtdata3 The value of the column 'VA_EXTDATA3'. (NullAllowed)
     */
    public void setVaExtdata3(String vaExtdata3) {
        __modifiedProperties.add("vaExtdata3");
        this._vaExtdata3 = vaExtdata3;
    }

    /**
     * [get] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @return The value of the column 'NV_EXTDATA1'. (NullAllowed)
     */
    public String getNvExtdata1() {
        return _nvExtdata1;
    }

    /**
     * [set] NV_EXTDATA1: {varchar(60)} <br>
     * 全角文字拡張項目１
     * @param nvExtdata1 The value of the column 'NV_EXTDATA1'. (NullAllowed)
     */
    public void setNvExtdata1(String nvExtdata1) {
        __modifiedProperties.add("nvExtdata1");
        this._nvExtdata1 = nvExtdata1;
    }

    /**
     * [get] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @return The value of the column 'NV_EXTDATA2'. (NullAllowed)
     */
    public String getNvExtdata2() {
        return _nvExtdata2;
    }

    /**
     * [set] NV_EXTDATA2: {varchar(60)} <br>
     * 全角文字拡張項目２
     * @param nvExtdata2 The value of the column 'NV_EXTDATA2'. (NullAllowed)
     */
    public void setNvExtdata2(String nvExtdata2) {
        __modifiedProperties.add("nvExtdata2");
        this._nvExtdata2 = nvExtdata2;
    }

    /**
     * [get] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @return The value of the column 'NV_EXTDATA3'. (NullAllowed)
     */
    public String getNvExtdata3() {
        return _nvExtdata3;
    }

    /**
     * [set] NV_EXTDATA3: {varchar(60)} <br>
     * 全角文字拡張項目３
     * @param nvExtdata3 The value of the column 'NV_EXTDATA3'. (NullAllowed)
     */
    public void setNvExtdata3(String nvExtdata3) {
        __modifiedProperties.add("nvExtdata3");
        this._nvExtdata3 = nvExtdata3;
    }

    /**
     * [get] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @return The value of the column 'NM_EXTDATA1'. (NullAllowed)
     */
    public Long getNmExtdata1() {
        return _nmExtdata1;
    }

    /**
     * [set] NM_EXTDATA1: {bigint(19)} <br>
     * 数値拡張項目１
     * @param nmExtdata1 The value of the column 'NM_EXTDATA1'. (NullAllowed)
     */
    public void setNmExtdata1(Long nmExtdata1) {
        __modifiedProperties.add("nmExtdata1");
        this._nmExtdata1 = nmExtdata1;
    }

    /**
     * [get] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @return The value of the column 'NM_EXTDATA2'. (NullAllowed)
     */
    public Long getNmExtdata2() {
        return _nmExtdata2;
    }

    /**
     * [set] NM_EXTDATA2: {bigint(19)} <br>
     * 数値拡張項目２
     * @param nmExtdata2 The value of the column 'NM_EXTDATA2'. (NullAllowed)
     */
    public void setNmExtdata2(Long nmExtdata2) {
        __modifiedProperties.add("nmExtdata2");
        this._nmExtdata2 = nmExtdata2;
    }

    /**
     * [get] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @return The value of the column 'NM_EXTDATA3'. (NullAllowed)
     */
    public Long getNmExtdata3() {
        return _nmExtdata3;
    }

    /**
     * [set] NM_EXTDATA3: {bigint(19)} <br>
     * 数値拡張項目３
     * @param nmExtdata3 The value of the column 'NM_EXTDATA3'. (NullAllowed)
     */
    public void setNmExtdata3(Long nmExtdata3) {
        __modifiedProperties.add("nmExtdata3");
        this._nmExtdata3 = nmExtdata3;
    }

    /**
     * [get] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @return The value of the column 'DT_EXTDATA1'. (NullAllowed)
     */
    public String getDtExtdata1() {
        return _dtExtdata1;
    }

    /**
     * [set] DT_EXTDATA1: {varchar(8)} <br>
     * 日付拡張項目１
     * @param dtExtdata1 The value of the column 'DT_EXTDATA1'. (NullAllowed)
     */
    public void setDtExtdata1(String dtExtdata1) {
        __modifiedProperties.add("dtExtdata1");
        this._dtExtdata1 = dtExtdata1;
    }

    /**
     * [get] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @return The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    public String getDtExtdata2() {
        return _dtExtdata2;
    }

    /**
     * [set] DT_EXTDATA2: {varchar(8)} <br>
     * 日付拡張項目２
     * @param dtExtdata2 The value of the column 'DT_EXTDATA2'. (NullAllowed)
     */
    public void setDtExtdata2(String dtExtdata2) {
        __modifiedProperties.add("dtExtdata2");
        this._dtExtdata2 = dtExtdata2;
    }

    /**
     * [get] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @return The value of the column 'DT_EXTDATA3'. (NullAllowed)
     */
    public String getDtExtdata3() {
        return _dtExtdata3;
    }

    /**
     * [set] DT_EXTDATA3: {varchar(8)} <br>
     * 日付拡張項目３
     * @param dtExtdata3 The value of the column 'DT_EXTDATA3'. (NullAllowed)
     */
    public void setDtExtdata3(String dtExtdata3) {
        __modifiedProperties.add("dtExtdata3");
        this._dtExtdata3 = dtExtdata3;
    }

    /**
     * [get] ITEM_NM_FROM: {varchar(100)} <br>
     * 組替前銘柄名称
     * @return The value of the column 'ITEM_NM_FROM'. (NullAllowed)
     */
    public String getItemNmFrom() {
        return _itemNmFrom;
    }

    /**
     * [set] ITEM_NM_FROM: {varchar(100)} <br>
     * 組替前銘柄名称
     * @param itemNmFrom The value of the column 'ITEM_NM_FROM'. (NullAllowed)
     */
    public void setItemNmFrom(String itemNmFrom) {
        __modifiedProperties.add("itemNmFrom");
        this._itemNmFrom = itemNmFrom;
    }

    /**
     * [get] ITEM_NM_TO: {varchar(100)} <br>
     * 組替後銘柄名称
     * @return The value of the column 'ITEM_NM_TO'. (NullAllowed)
     */
    public String getItemNmTo() {
        return _itemNmTo;
    }

    /**
     * [set] ITEM_NM_TO: {varchar(100)} <br>
     * 組替後銘柄名称
     * @param itemNmTo The value of the column 'ITEM_NM_TO'. (NullAllowed)
     */
    public void setItemNmTo(String itemNmTo) {
        __modifiedProperties.add("itemNmTo");
        this._itemNmTo = itemNmTo;
    }

    /**
     * [get] FCFLG: {varchar(30)} <br>
     * 内外区分
     * @return The value of the column 'FCFLG'. (NullAllowed)
     */
    public String getFcflg() {
        return _fcflg;
    }

    /**
     * [set] FCFLG: {varchar(30)} <br>
     * 内外区分
     * @param fcflg The value of the column 'FCFLG'. (NullAllowed)
     */
    public void setFcflg(String fcflg) {
        __modifiedProperties.add("fcflg");
        this._fcflg = fcflg;
    }

    /**
     * [get] USERNUM3: {varchar(30)} <br>
     * 一般出力順
     * @return The value of the column 'USERNUM3'. (NullAllowed)
     */
    public String getUsernum3() {
        return _usernum3;
    }

    /**
     * [set] USERNUM3: {varchar(30)} <br>
     * 一般出力順
     * @param usernum3 The value of the column 'USERNUM3'. (NullAllowed)
     */
    public void setUsernum3(String usernum3) {
        __modifiedProperties.add("usernum3");
        this._usernum3 = usernum3;
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
