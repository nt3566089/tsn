package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of E_TRIFITEMDATA as TABLE. <br>
 * IF銘柄
 * <pre>
 * [primary-key]
 *     IFDATAKEY
 *
 * [column]
 *     IFDATAKEY, SEGNAME, REFNO, ITEMADMIN, PRODUCT_CD, ITEMGROUP, INVTYPE, SETITEMFLG, NAME, SNAME, ANAME, OWNERITEMCD, SUPPLIERITEMCD, POSITEMCD, ITFCD, MANUITEMCD, PRICE_BUY, PRICE_WHOLESALE, PRICE_SALE, ABCTYPE, QTY1TYPE, UNIT1, UNIT1STYLE, LENGTH1, WIDTH1, HEIGHT1, GROSSWEIGHT1, NETWEIGHT1, CUBE1, LITER1, UNIT2, UNIT2STYLE, LENGTH2, WIDTH2, HEIGHT2, GROSSWEIGHT2, NETWEIGHT2, CUBE2, LITER2, UNIT3, UNIT3STYLE, LENGTH3, WIDTH3, HEIGHT3, GROSSWEIGHT3, NETWEIGHT3, CUBE3, LITER3, P_QTY, P_HEIGHT, P_ODD, NOTES, F_USER1, F_USER2, F_USER3, F_USER4, F_USER5, PRICE_INSURANCE, LIMITDAY, USERUSE1, USERUSE2, USERUSE3, USERUSE4, USERUSE5, PRICELEVEL, ITEMCATALOGURL, USERNUM1, USERNUM2, USERNUM3, USERNUM4, USERNUM5, USERDATE1, USERDATE2, USERDATE3, USERDATE4, USERDATE5, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public abstract class BsETrifitemdataDto implements Serializable {

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
    /** IFDATAKEY: {PK, NotNull, decimal(16, 6)} */
    @JsonKey
    protected java.math.BigDecimal _ifdatakey;

    /** SEGNAME: {NotNull, varchar(30)} */
    @JsonKey
    protected String _segname;

    /** REFNO: {NotNull, varchar(30)} */
    @JsonKey
    protected String _refno;

    /** ITEMADMIN: {NotNull, varchar(30)} */
    @JsonKey
    protected String _itemadmin;

    /** PRODUCT_CD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _productCd;

    /** ITEMGROUP: {NotNull, varchar(60)} */
    @JsonKey
    protected String _itemgroup;

    /** INVTYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _invtype;

    /** SETITEMFLG: {NotNull, char(1)} */
    @JsonKey
    protected String _setitemflg;

    /** NAME: {NotNull, varchar(255)} */
    @JsonKey
    protected String _name;

    /** SNAME: {NotNull, varchar(100)} */
    @JsonKey
    protected String _sname;

    /** ANAME: {NotNull, varchar(100)} */
    @JsonKey
    protected String _aname;

    /** OWNERITEMCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _owneritemcd;

    /** SUPPLIERITEMCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _supplieritemcd;

    /** POSITEMCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _positemcd;

    /** ITFCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _itfcd;

    /** MANUITEMCD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _manuitemcd;

    /** PRICE_BUY: {NotNull, varchar(30)} */
    @JsonKey
    protected String _priceBuy;

    /** PRICE_WHOLESALE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _priceWholesale;

    /** PRICE_SALE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _priceSale;

    /** ABCTYPE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _abctype;

    /** QTY1TYPE: {NotNull, char(1)} */
    @JsonKey
    protected String _qty1type;

    /** UNIT1: {NotNull, varchar(30)} */
    @JsonKey
    protected String _unit1;

    /** UNIT1STYLE: {NotNull, varchar(60)} */
    @JsonKey
    protected String _unit1style;

    /** LENGTH1: {NotNull, varchar(30)} */
    @JsonKey
    protected String _length1;

    /** WIDTH1: {NotNull, varchar(30)} */
    @JsonKey
    protected String _width1;

    /** HEIGHT1: {NotNull, varchar(30)} */
    @JsonKey
    protected String _height1;

    /** GROSSWEIGHT1: {NotNull, varchar(30)} */
    @JsonKey
    protected String _grossweight1;

    /** NETWEIGHT1: {NotNull, varchar(30)} */
    @JsonKey
    protected String _netweight1;

    /** CUBE1: {NotNull, varchar(30)} */
    @JsonKey
    protected String _cube1;

    /** LITER1: {NotNull, varchar(30)} */
    @JsonKey
    protected String _liter1;

    /** UNIT2: {NotNull, varchar(30)} */
    @JsonKey
    protected String _unit2;

    /** UNIT2STYLE: {NotNull, varchar(60)} */
    @JsonKey
    protected String _unit2style;

    /** LENGTH2: {NotNull, varchar(30)} */
    @JsonKey
    protected String _length2;

    /** WIDTH2: {NotNull, varchar(30)} */
    @JsonKey
    protected String _width2;

    /** HEIGHT2: {NotNull, varchar(30)} */
    @JsonKey
    protected String _height2;

    /** GROSSWEIGHT2: {NotNull, varchar(30)} */
    @JsonKey
    protected String _grossweight2;

    /** NETWEIGHT2: {NotNull, varchar(30)} */
    @JsonKey
    protected String _netweight2;

    /** CUBE2: {NotNull, varchar(30)} */
    @JsonKey
    protected String _cube2;

    /** LITER2: {NotNull, varchar(30)} */
    @JsonKey
    protected String _liter2;

    /** UNIT3: {NotNull, varchar(30)} */
    @JsonKey
    protected String _unit3;

    /** UNIT3STYLE: {NotNull, varchar(60)} */
    @JsonKey
    protected String _unit3style;

    /** LENGTH3: {NotNull, varchar(30)} */
    @JsonKey
    protected String _length3;

    /** WIDTH3: {NotNull, varchar(30)} */
    @JsonKey
    protected String _width3;

    /** HEIGHT3: {NotNull, varchar(30)} */
    @JsonKey
    protected String _height3;

    /** GROSSWEIGHT3: {NotNull, varchar(30)} */
    @JsonKey
    protected String _grossweight3;

    /** NETWEIGHT3: {NotNull, varchar(30)} */
    @JsonKey
    protected String _netweight3;

    /** CUBE3: {NotNull, varchar(30)} */
    @JsonKey
    protected String _cube3;

    /** LITER3: {NotNull, varchar(30)} */
    @JsonKey
    protected String _liter3;

    /** P_QTY: {NotNull, varchar(30)} */
    @JsonKey
    protected String _pQty;

    /** P_HEIGHT: {NotNull, varchar(30)} */
    @JsonKey
    protected String _pHeight;

    /** P_ODD: {NotNull, varchar(30)} */
    @JsonKey
    protected String _pOdd;

    /** NOTES: {NotNull, varchar(4000)} */
    @JsonKey
    protected String _notes;

    /** F_USER1: {NotNull, varchar(30)} */
    @JsonKey
    protected String _fUser1;

    /** F_USER2: {NotNull, varchar(30)} */
    @JsonKey
    protected String _fUser2;

    /** F_USER3: {NotNull, varchar(30)} */
    @JsonKey
    protected String _fUser3;

    /** F_USER4: {NotNull, varchar(30)} */
    @JsonKey
    protected String _fUser4;

    /** F_USER5: {NotNull, varchar(30)} */
    @JsonKey
    protected String _fUser5;

    /** PRICE_INSURANCE: {NotNull, varchar(30)} */
    @JsonKey
    protected String _priceInsurance;

    /** LIMITDAY: {NotNull, varchar(30)} */
    @JsonKey
    protected String _limitday;

    /** USERUSE1: {NotNull, varchar(60)} */
    @JsonKey
    protected String _useruse1;

    /** USERUSE2: {NotNull, varchar(60)} */
    @JsonKey
    protected String _useruse2;

    /** USERUSE3: {NotNull, varchar(60)} */
    @JsonKey
    protected String _useruse3;

    /** USERUSE4: {NotNull, varchar(60)} */
    @JsonKey
    protected String _useruse4;

    /** USERUSE5: {NotNull, varchar(60)} */
    @JsonKey
    protected String _useruse5;

    /** PRICELEVEL: {NotNull, char(1)} */
    @JsonKey
    protected String _pricelevel;

    /** ITEMCATALOGURL: {NotNull, varchar(255)} */
    @JsonKey
    protected String _itemcatalogurl;

    /** USERNUM1: {NotNull, varchar(30)} */
    @JsonKey
    protected String _usernum1;

    /** USERNUM2: {NotNull, varchar(30)} */
    @JsonKey
    protected String _usernum2;

    /** USERNUM3: {NotNull, varchar(30)} */
    @JsonKey
    protected String _usernum3;

    /** USERNUM4: {NotNull, varchar(30)} */
    @JsonKey
    protected String _usernum4;

    /** USERNUM5: {NotNull, varchar(30)} */
    @JsonKey
    protected String _usernum5;

    /** USERDATE1: {NotNull, varchar(30)} */
    @JsonKey
    protected String _userdate1;

    /** USERDATE2: {NotNull, varchar(30)} */
    @JsonKey
    protected String _userdate2;

    /** USERDATE3: {NotNull, varchar(30)} */
    @JsonKey
    protected String _userdate3;

    /** USERDATE4: {NotNull, varchar(30)} */
    @JsonKey
    protected String _userdate4;

    /** USERDATE5: {NotNull, varchar(30)} */
    @JsonKey
    protected String _userdate5;

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
    public BsETrifitemdataDto() {
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
        if (other == null || !(other instanceof BsETrifitemdataDto)) { return false; }
        final BsETrifitemdataDto otherEntity = (BsETrifitemdataDto)other;
        if (!helpComparingValue(getIfdatakey(), otherEntity.getIfdatakey())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "E_TRIFITEMDATA");
        result = xCH(result, getIfdatakey());
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
        sb.append(c).append(getIfdatakey());
        sb.append(c).append(getSegname());
        sb.append(c).append(getRefno());
        sb.append(c).append(getItemadmin());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getItemgroup());
        sb.append(c).append(getInvtype());
        sb.append(c).append(getSetitemflg());
        sb.append(c).append(getName());
        sb.append(c).append(getSname());
        sb.append(c).append(getAname());
        sb.append(c).append(getOwneritemcd());
        sb.append(c).append(getSupplieritemcd());
        sb.append(c).append(getPositemcd());
        sb.append(c).append(getItfcd());
        sb.append(c).append(getManuitemcd());
        sb.append(c).append(getPriceBuy());
        sb.append(c).append(getPriceWholesale());
        sb.append(c).append(getPriceSale());
        sb.append(c).append(getAbctype());
        sb.append(c).append(getQty1type());
        sb.append(c).append(getUnit1());
        sb.append(c).append(getUnit1style());
        sb.append(c).append(getLength1());
        sb.append(c).append(getWidth1());
        sb.append(c).append(getHeight1());
        sb.append(c).append(getGrossweight1());
        sb.append(c).append(getNetweight1());
        sb.append(c).append(getCube1());
        sb.append(c).append(getLiter1());
        sb.append(c).append(getUnit2());
        sb.append(c).append(getUnit2style());
        sb.append(c).append(getLength2());
        sb.append(c).append(getWidth2());
        sb.append(c).append(getHeight2());
        sb.append(c).append(getGrossweight2());
        sb.append(c).append(getNetweight2());
        sb.append(c).append(getCube2());
        sb.append(c).append(getLiter2());
        sb.append(c).append(getUnit3());
        sb.append(c).append(getUnit3style());
        sb.append(c).append(getLength3());
        sb.append(c).append(getWidth3());
        sb.append(c).append(getHeight3());
        sb.append(c).append(getGrossweight3());
        sb.append(c).append(getNetweight3());
        sb.append(c).append(getCube3());
        sb.append(c).append(getLiter3());
        sb.append(c).append(getPQty());
        sb.append(c).append(getPHeight());
        sb.append(c).append(getPOdd());
        sb.append(c).append(getNotes());
        sb.append(c).append(getFUser1());
        sb.append(c).append(getFUser2());
        sb.append(c).append(getFUser3());
        sb.append(c).append(getFUser4());
        sb.append(c).append(getFUser5());
        sb.append(c).append(getPriceInsurance());
        sb.append(c).append(getLimitday());
        sb.append(c).append(getUseruse1());
        sb.append(c).append(getUseruse2());
        sb.append(c).append(getUseruse3());
        sb.append(c).append(getUseruse4());
        sb.append(c).append(getUseruse5());
        sb.append(c).append(getPricelevel());
        sb.append(c).append(getItemcatalogurl());
        sb.append(c).append(getUsernum1());
        sb.append(c).append(getUsernum2());
        sb.append(c).append(getUsernum3());
        sb.append(c).append(getUsernum4());
        sb.append(c).append(getUsernum5());
        sb.append(c).append(getUserdate1());
        sb.append(c).append(getUserdate2());
        sb.append(c).append(getUserdate3());
        sb.append(c).append(getUserdate4());
        sb.append(c).append(getUserdate5());
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
     * [get] IFDATAKEY: {PK, NotNull, decimal(16, 6)} <br>
     * ＩＦデータキー
     * @return The value of the column 'IFDATAKEY'. (NullAllowed)
     */
    public java.math.BigDecimal getIfdatakey() {
        return _ifdatakey;
    }

    /**
     * [set] IFDATAKEY: {PK, NotNull, decimal(16, 6)} <br>
     * ＩＦデータキー
     * @param ifdatakey The value of the column 'IFDATAKEY'. (NullAllowed)
     */
    public void setIfdatakey(java.math.BigDecimal ifdatakey) {
        __modifiedProperties.add("ifdatakey");
        this._ifdatakey = ifdatakey;
    }

    /**
     * [get] SEGNAME: {NotNull, varchar(30)} <br>
     * オンライン取込フラグ
     * @return The value of the column 'SEGNAME'. (NullAllowed)
     */
    public String getSegname() {
        return _segname;
    }

    /**
     * [set] SEGNAME: {NotNull, varchar(30)} <br>
     * オンライン取込フラグ
     * @param segname The value of the column 'SEGNAME'. (NullAllowed)
     */
    public void setSegname(String segname) {
        __modifiedProperties.add("segname");
        this._segname = segname;
    }

    /**
     * [get] REFNO: {NotNull, varchar(30)} <br>
     * 銘柄マスタ更新済フラグ
     * @return The value of the column 'REFNO'. (NullAllowed)
     */
    public String getRefno() {
        return _refno;
    }

    /**
     * [set] REFNO: {NotNull, varchar(30)} <br>
     * 銘柄マスタ更新済フラグ
     * @param refno The value of the column 'REFNO'. (NullAllowed)
     */
    public void setRefno(String refno) {
        __modifiedProperties.add("refno");
        this._refno = refno;
    }

    /**
     * [get] ITEMADMIN: {NotNull, varchar(30)} <br>
     * 銘柄管理社
     * @return The value of the column 'ITEMADMIN'. (NullAllowed)
     */
    public String getItemadmin() {
        return _itemadmin;
    }

    /**
     * [set] ITEMADMIN: {NotNull, varchar(30)} <br>
     * 銘柄管理社
     * @param itemadmin The value of the column 'ITEMADMIN'. (NullAllowed)
     */
    public void setItemadmin(String itemadmin) {
        __modifiedProperties.add("itemadmin");
        this._itemadmin = itemadmin;
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
     * [get] ITEMGROUP: {NotNull, varchar(60)} <br>
     * 銘柄グループ
     * @return The value of the column 'ITEMGROUP'. (NullAllowed)
     */
    public String getItemgroup() {
        return _itemgroup;
    }

    /**
     * [set] ITEMGROUP: {NotNull, varchar(60)} <br>
     * 銘柄グループ
     * @param itemgroup The value of the column 'ITEMGROUP'. (NullAllowed)
     */
    public void setItemgroup(String itemgroup) {
        __modifiedProperties.add("itemgroup");
        this._itemgroup = itemgroup;
    }

    /**
     * [get] INVTYPE: {NotNull, varchar(30)} <br>
     * 銘柄在庫タイプ
     * @return The value of the column 'INVTYPE'. (NullAllowed)
     */
    public String getInvtype() {
        return _invtype;
    }

    /**
     * [set] INVTYPE: {NotNull, varchar(30)} <br>
     * 銘柄在庫タイプ
     * @param invtype The value of the column 'INVTYPE'. (NullAllowed)
     */
    public void setInvtype(String invtype) {
        __modifiedProperties.add("invtype");
        this._invtype = invtype;
    }

    /**
     * [get] SETITEMFLG: {NotNull, char(1)} <br>
     * セット品フラグ
     * @return The value of the column 'SETITEMFLG'. (NullAllowed)
     */
    public String getSetitemflg() {
        return _setitemflg;
    }

    /**
     * [set] SETITEMFLG: {NotNull, char(1)} <br>
     * セット品フラグ
     * @param setitemflg The value of the column 'SETITEMFLG'. (NullAllowed)
     */
    public void setSetitemflg(String setitemflg) {
        __modifiedProperties.add("setitemflg");
        this._setitemflg = setitemflg;
    }

    /**
     * [get] NAME: {NotNull, varchar(255)} <br>
     * 銘柄名正称(全角)
     * @return The value of the column 'NAME'. (NullAllowed)
     */
    public String getName() {
        return _name;
    }

    /**
     * [set] NAME: {NotNull, varchar(255)} <br>
     * 銘柄名正称(全角)
     * @param name The value of the column 'NAME'. (NullAllowed)
     */
    public void setName(String name) {
        __modifiedProperties.add("name");
        this._name = name;
    }

    /**
     * [get] SNAME: {NotNull, varchar(100)} <br>
     * 銘柄名正称(全角)
     * @return The value of the column 'SNAME'. (NullAllowed)
     */
    public String getSname() {
        return _sname;
    }

    /**
     * [set] SNAME: {NotNull, varchar(100)} <br>
     * 銘柄名正称(全角)
     * @param sname The value of the column 'SNAME'. (NullAllowed)
     */
    public void setSname(String sname) {
        __modifiedProperties.add("sname");
        this._sname = sname;
    }

    /**
     * [get] ANAME: {NotNull, varchar(100)} <br>
     * 銘柄名略称(半角)
     * @return The value of the column 'ANAME'. (NullAllowed)
     */
    public String getAname() {
        return _aname;
    }

    /**
     * [set] ANAME: {NotNull, varchar(100)} <br>
     * 銘柄名略称(半角)
     * @param aname The value of the column 'ANAME'. (NullAllowed)
     */
    public void setAname(String aname) {
        __modifiedProperties.add("aname");
        this._aname = aname;
    }

    /**
     * [get] OWNERITEMCD: {NotNull, varchar(30)} <br>
     * 返品親銘柄CD
     * @return The value of the column 'OWNERITEMCD'. (NullAllowed)
     */
    public String getOwneritemcd() {
        return _owneritemcd;
    }

    /**
     * [set] OWNERITEMCD: {NotNull, varchar(30)} <br>
     * 返品親銘柄CD
     * @param owneritemcd The value of the column 'OWNERITEMCD'. (NullAllowed)
     */
    public void setOwneritemcd(String owneritemcd) {
        __modifiedProperties.add("owneritemcd");
        this._owneritemcd = owneritemcd;
    }

    /**
     * [get] SUPPLIERITEMCD: {NotNull, varchar(30)} <br>
     * 銘柄CD（6桁）
     * @return The value of the column 'SUPPLIERITEMCD'. (NullAllowed)
     */
    public String getSupplieritemcd() {
        return _supplieritemcd;
    }

    /**
     * [set] SUPPLIERITEMCD: {NotNull, varchar(30)} <br>
     * 銘柄CD（6桁）
     * @param supplieritemcd The value of the column 'SUPPLIERITEMCD'. (NullAllowed)
     */
    public void setSupplieritemcd(String supplieritemcd) {
        __modifiedProperties.add("supplieritemcd");
        this._supplieritemcd = supplieritemcd;
    }

    /**
     * [get] POSITEMCD: {NotNull, varchar(30)} <br>
     * 個装バーコード
     * @return The value of the column 'POSITEMCD'. (NullAllowed)
     */
    public String getPositemcd() {
        return _positemcd;
    }

    /**
     * [set] POSITEMCD: {NotNull, varchar(30)} <br>
     * 個装バーコード
     * @param positemcd The value of the column 'POSITEMCD'. (NullAllowed)
     */
    public void setPositemcd(String positemcd) {
        __modifiedProperties.add("positemcd");
        this._positemcd = positemcd;
    }

    /**
     * [get] ITFCD: {NotNull, varchar(30)} <br>
     * カートンバーコード
     * @return The value of the column 'ITFCD'. (NullAllowed)
     */
    public String getItfcd() {
        return _itfcd;
    }

    /**
     * [set] ITFCD: {NotNull, varchar(30)} <br>
     * カートンバーコード
     * @param itfcd The value of the column 'ITFCD'. (NullAllowed)
     */
    public void setItfcd(String itfcd) {
        __modifiedProperties.add("itfcd");
        this._itfcd = itfcd;
    }

    /**
     * [get] MANUITEMCD: {NotNull, varchar(30)} <br>
     * 段ボールバーコード
     * @return The value of the column 'MANUITEMCD'. (NullAllowed)
     */
    public String getManuitemcd() {
        return _manuitemcd;
    }

    /**
     * [set] MANUITEMCD: {NotNull, varchar(30)} <br>
     * 段ボールバーコード
     * @param manuitemcd The value of the column 'MANUITEMCD'. (NullAllowed)
     */
    public void setManuitemcd(String manuitemcd) {
        __modifiedProperties.add("manuitemcd");
        this._manuitemcd = manuitemcd;
    }

    /**
     * [get] PRICE_BUY: {NotNull, varchar(30)} <br>
     * 装置本数
     * @return The value of the column 'PRICE_BUY'. (NullAllowed)
     */
    public String getPriceBuy() {
        return _priceBuy;
    }

    /**
     * [set] PRICE_BUY: {NotNull, varchar(30)} <br>
     * 装置本数
     * @param priceBuy The value of the column 'PRICE_BUY'. (NullAllowed)
     */
    public void setPriceBuy(String priceBuy) {
        __modifiedProperties.add("priceBuy");
        this._priceBuy = priceBuy;
    }

    /**
     * [get] PRICE_WHOLESALE: {NotNull, varchar(30)} <br>
     * 最小受注単位
     * @return The value of the column 'PRICE_WHOLESALE'. (NullAllowed)
     */
    public String getPriceWholesale() {
        return _priceWholesale;
    }

    /**
     * [set] PRICE_WHOLESALE: {NotNull, varchar(30)} <br>
     * 最小受注単位
     * @param priceWholesale The value of the column 'PRICE_WHOLESALE'. (NullAllowed)
     */
    public void setPriceWholesale(String priceWholesale) {
        __modifiedProperties.add("priceWholesale");
        this._priceWholesale = priceWholesale;
    }

    /**
     * [get] PRICE_SALE: {NotNull, varchar(30)} <br>
     * 定価
     * @return The value of the column 'PRICE_SALE'. (NullAllowed)
     */
    public String getPriceSale() {
        return _priceSale;
    }

    /**
     * [set] PRICE_SALE: {NotNull, varchar(30)} <br>
     * 定価
     * @param priceSale The value of the column 'PRICE_SALE'. (NullAllowed)
     */
    public void setPriceSale(String priceSale) {
        __modifiedProperties.add("priceSale");
        this._priceSale = priceSale;
    }

    /**
     * [get] ABCTYPE: {NotNull, varchar(30)} <br>
     * たばこ区分
     * @return The value of the column 'ABCTYPE'. (NullAllowed)
     */
    public String getAbctype() {
        return _abctype;
    }

    /**
     * [set] ABCTYPE: {NotNull, varchar(30)} <br>
     * たばこ区分
     * @param abctype The value of the column 'ABCTYPE'. (NullAllowed)
     */
    public void setAbctype(String abctype) {
        __modifiedProperties.add("abctype");
        this._abctype = abctype;
    }

    /**
     * [get] QTY1TYPE: {NotNull, char(1)} <br>
     * 数量１単位レベル
     * @return The value of the column 'QTY1TYPE'. (NullAllowed)
     */
    public String getQty1type() {
        return _qty1type;
    }

    /**
     * [set] QTY1TYPE: {NotNull, char(1)} <br>
     * 数量１単位レベル
     * @param qty1type The value of the column 'QTY1TYPE'. (NullAllowed)
     */
    public void setQty1type(String qty1type) {
        __modifiedProperties.add("qty1type");
        this._qty1type = qty1type;
    }

    /**
     * [get] UNIT1: {NotNull, varchar(30)} <br>
     * 1ケース当カートン数
     * @return The value of the column 'UNIT1'. (NullAllowed)
     */
    public String getUnit1() {
        return _unit1;
    }

    /**
     * [set] UNIT1: {NotNull, varchar(30)} <br>
     * 1ケース当カートン数
     * @param unit1 The value of the column 'UNIT1'. (NullAllowed)
     */
    public void setUnit1(String unit1) {
        __modifiedProperties.add("unit1");
        this._unit1 = unit1;
    }

    /**
     * [get] UNIT1STYLE: {NotNull, varchar(60)} <br>
     * ケース単位
     * @return The value of the column 'UNIT1STYLE'. (NullAllowed)
     */
    public String getUnit1style() {
        return _unit1style;
    }

    /**
     * [set] UNIT1STYLE: {NotNull, varchar(60)} <br>
     * ケース単位
     * @param unit1style The value of the column 'UNIT1STYLE'. (NullAllowed)
     */
    public void setUnit1style(String unit1style) {
        __modifiedProperties.add("unit1style");
        this._unit1style = unit1style;
    }

    /**
     * [get] LENGTH1: {NotNull, varchar(30)} <br>
     * 縦１
     * @return The value of the column 'LENGTH1'. (NullAllowed)
     */
    public String getLength1() {
        return _length1;
    }

    /**
     * [set] LENGTH1: {NotNull, varchar(30)} <br>
     * 縦１
     * @param length1 The value of the column 'LENGTH1'. (NullAllowed)
     */
    public void setLength1(String length1) {
        __modifiedProperties.add("length1");
        this._length1 = length1;
    }

    /**
     * [get] WIDTH1: {NotNull, varchar(30)} <br>
     * 横１
     * @return The value of the column 'WIDTH1'. (NullAllowed)
     */
    public String getWidth1() {
        return _width1;
    }

    /**
     * [set] WIDTH1: {NotNull, varchar(30)} <br>
     * 横１
     * @param width1 The value of the column 'WIDTH1'. (NullAllowed)
     */
    public void setWidth1(String width1) {
        __modifiedProperties.add("width1");
        this._width1 = width1;
    }

    /**
     * [get] HEIGHT1: {NotNull, varchar(30)} <br>
     * 高さ１
     * @return The value of the column 'HEIGHT1'. (NullAllowed)
     */
    public String getHeight1() {
        return _height1;
    }

    /**
     * [set] HEIGHT1: {NotNull, varchar(30)} <br>
     * 高さ１
     * @param height1 The value of the column 'HEIGHT1'. (NullAllowed)
     */
    public void setHeight1(String height1) {
        __modifiedProperties.add("height1");
        this._height1 = height1;
    }

    /**
     * [get] GROSSWEIGHT1: {NotNull, varchar(30)} <br>
     * グロス重量１
     * @return The value of the column 'GROSSWEIGHT1'. (NullAllowed)
     */
    public String getGrossweight1() {
        return _grossweight1;
    }

    /**
     * [set] GROSSWEIGHT1: {NotNull, varchar(30)} <br>
     * グロス重量１
     * @param grossweight1 The value of the column 'GROSSWEIGHT1'. (NullAllowed)
     */
    public void setGrossweight1(String grossweight1) {
        __modifiedProperties.add("grossweight1");
        this._grossweight1 = grossweight1;
    }

    /**
     * [get] NETWEIGHT1: {NotNull, varchar(30)} <br>
     * ネット重量１
     * @return The value of the column 'NETWEIGHT1'. (NullAllowed)
     */
    public String getNetweight1() {
        return _netweight1;
    }

    /**
     * [set] NETWEIGHT1: {NotNull, varchar(30)} <br>
     * ネット重量１
     * @param netweight1 The value of the column 'NETWEIGHT1'. (NullAllowed)
     */
    public void setNetweight1(String netweight1) {
        __modifiedProperties.add("netweight1");
        this._netweight1 = netweight1;
    }

    /**
     * [get] CUBE1: {NotNull, varchar(30)} <br>
     * 体積（容積）１
     * @return The value of the column 'CUBE1'. (NullAllowed)
     */
    public String getCube1() {
        return _cube1;
    }

    /**
     * [set] CUBE1: {NotNull, varchar(30)} <br>
     * 体積（容積）１
     * @param cube1 The value of the column 'CUBE1'. (NullAllowed)
     */
    public void setCube1(String cube1) {
        __modifiedProperties.add("cube1");
        this._cube1 = cube1;
    }

    /**
     * [get] LITER1: {NotNull, varchar(30)} <br>
     * 内容量１
     * @return The value of the column 'LITER1'. (NullAllowed)
     */
    public String getLiter1() {
        return _liter1;
    }

    /**
     * [set] LITER1: {NotNull, varchar(30)} <br>
     * 内容量１
     * @param liter1 The value of the column 'LITER1'. (NullAllowed)
     */
    public void setLiter1(String liter1) {
        __modifiedProperties.add("liter1");
        this._liter1 = liter1;
    }

    /**
     * [get] UNIT2: {NotNull, varchar(30)} <br>
     * 1カートン当個数
     * @return The value of the column 'UNIT2'. (NullAllowed)
     */
    public String getUnit2() {
        return _unit2;
    }

    /**
     * [set] UNIT2: {NotNull, varchar(30)} <br>
     * 1カートン当個数
     * @param unit2 The value of the column 'UNIT2'. (NullAllowed)
     */
    public void setUnit2(String unit2) {
        __modifiedProperties.add("unit2");
        this._unit2 = unit2;
    }

    /**
     * [get] UNIT2STYLE: {NotNull, varchar(60)} <br>
     * カートン単位
     * @return The value of the column 'UNIT2STYLE'. (NullAllowed)
     */
    public String getUnit2style() {
        return _unit2style;
    }

    /**
     * [set] UNIT2STYLE: {NotNull, varchar(60)} <br>
     * カートン単位
     * @param unit2style The value of the column 'UNIT2STYLE'. (NullAllowed)
     */
    public void setUnit2style(String unit2style) {
        __modifiedProperties.add("unit2style");
        this._unit2style = unit2style;
    }

    /**
     * [get] LENGTH2: {NotNull, varchar(30)} <br>
     * カートン寸法(Ｌ)
     * @return The value of the column 'LENGTH2'. (NullAllowed)
     */
    public String getLength2() {
        return _length2;
    }

    /**
     * [set] LENGTH2: {NotNull, varchar(30)} <br>
     * カートン寸法(Ｌ)
     * @param length2 The value of the column 'LENGTH2'. (NullAllowed)
     */
    public void setLength2(String length2) {
        __modifiedProperties.add("length2");
        this._length2 = length2;
    }

    /**
     * [get] WIDTH2: {NotNull, varchar(30)} <br>
     * カートン寸法(W)
     * @return The value of the column 'WIDTH2'. (NullAllowed)
     */
    public String getWidth2() {
        return _width2;
    }

    /**
     * [set] WIDTH2: {NotNull, varchar(30)} <br>
     * カートン寸法(W)
     * @param width2 The value of the column 'WIDTH2'. (NullAllowed)
     */
    public void setWidth2(String width2) {
        __modifiedProperties.add("width2");
        this._width2 = width2;
    }

    /**
     * [get] HEIGHT2: {NotNull, varchar(30)} <br>
     * カートン寸法(H)
     * @return The value of the column 'HEIGHT2'. (NullAllowed)
     */
    public String getHeight2() {
        return _height2;
    }

    /**
     * [set] HEIGHT2: {NotNull, varchar(30)} <br>
     * カートン寸法(H)
     * @param height2 The value of the column 'HEIGHT2'. (NullAllowed)
     */
    public void setHeight2(String height2) {
        __modifiedProperties.add("height2");
        this._height2 = height2;
    }

    /**
     * [get] GROSSWEIGHT2: {NotNull, varchar(30)} <br>
     * グロス重量２
     * @return The value of the column 'GROSSWEIGHT2'. (NullAllowed)
     */
    public String getGrossweight2() {
        return _grossweight2;
    }

    /**
     * [set] GROSSWEIGHT2: {NotNull, varchar(30)} <br>
     * グロス重量２
     * @param grossweight2 The value of the column 'GROSSWEIGHT2'. (NullAllowed)
     */
    public void setGrossweight2(String grossweight2) {
        __modifiedProperties.add("grossweight2");
        this._grossweight2 = grossweight2;
    }

    /**
     * [get] NETWEIGHT2: {NotNull, varchar(30)} <br>
     * ネット重量２
     * @return The value of the column 'NETWEIGHT2'. (NullAllowed)
     */
    public String getNetweight2() {
        return _netweight2;
    }

    /**
     * [set] NETWEIGHT2: {NotNull, varchar(30)} <br>
     * ネット重量２
     * @param netweight2 The value of the column 'NETWEIGHT2'. (NullAllowed)
     */
    public void setNetweight2(String netweight2) {
        __modifiedProperties.add("netweight2");
        this._netweight2 = netweight2;
    }

    /**
     * [get] CUBE2: {NotNull, varchar(30)} <br>
     * カートン容積
     * @return The value of the column 'CUBE2'. (NullAllowed)
     */
    public String getCube2() {
        return _cube2;
    }

    /**
     * [set] CUBE2: {NotNull, varchar(30)} <br>
     * カートン容積
     * @param cube2 The value of the column 'CUBE2'. (NullAllowed)
     */
    public void setCube2(String cube2) {
        __modifiedProperties.add("cube2");
        this._cube2 = cube2;
    }

    /**
     * [get] LITER2: {NotNull, varchar(30)} <br>
     * 内容量２
     * @return The value of the column 'LITER2'. (NullAllowed)
     */
    public String getLiter2() {
        return _liter2;
    }

    /**
     * [set] LITER2: {NotNull, varchar(30)} <br>
     * 内容量２
     * @param liter2 The value of the column 'LITER2'. (NullAllowed)
     */
    public void setLiter2(String liter2) {
        __modifiedProperties.add("liter2");
        this._liter2 = liter2;
    }

    /**
     * [get] UNIT3: {NotNull, varchar(30)} <br>
     * 個数
     * @return The value of the column 'UNIT3'. (NullAllowed)
     */
    public String getUnit3() {
        return _unit3;
    }

    /**
     * [set] UNIT3: {NotNull, varchar(30)} <br>
     * 個数
     * @param unit3 The value of the column 'UNIT3'. (NullAllowed)
     */
    public void setUnit3(String unit3) {
        __modifiedProperties.add("unit3");
        this._unit3 = unit3;
    }

    /**
     * [get] UNIT3STYLE: {NotNull, varchar(60)} <br>
     * 個装単位
     * @return The value of the column 'UNIT3STYLE'. (NullAllowed)
     */
    public String getUnit3style() {
        return _unit3style;
    }

    /**
     * [set] UNIT3STYLE: {NotNull, varchar(60)} <br>
     * 個装単位
     * @param unit3style The value of the column 'UNIT3STYLE'. (NullAllowed)
     */
    public void setUnit3style(String unit3style) {
        __modifiedProperties.add("unit3style");
        this._unit3style = unit3style;
    }

    /**
     * [get] LENGTH3: {NotNull, varchar(30)} <br>
     * 縦３
     * @return The value of the column 'LENGTH3'. (NullAllowed)
     */
    public String getLength3() {
        return _length3;
    }

    /**
     * [set] LENGTH3: {NotNull, varchar(30)} <br>
     * 縦３
     * @param length3 The value of the column 'LENGTH3'. (NullAllowed)
     */
    public void setLength3(String length3) {
        __modifiedProperties.add("length3");
        this._length3 = length3;
    }

    /**
     * [get] WIDTH3: {NotNull, varchar(30)} <br>
     * 横３
     * @return The value of the column 'WIDTH3'. (NullAllowed)
     */
    public String getWidth3() {
        return _width3;
    }

    /**
     * [set] WIDTH3: {NotNull, varchar(30)} <br>
     * 横３
     * @param width3 The value of the column 'WIDTH3'. (NullAllowed)
     */
    public void setWidth3(String width3) {
        __modifiedProperties.add("width3");
        this._width3 = width3;
    }

    /**
     * [get] HEIGHT3: {NotNull, varchar(30)} <br>
     * 高さ３
     * @return The value of the column 'HEIGHT3'. (NullAllowed)
     */
    public String getHeight3() {
        return _height3;
    }

    /**
     * [set] HEIGHT3: {NotNull, varchar(30)} <br>
     * 高さ３
     * @param height3 The value of the column 'HEIGHT3'. (NullAllowed)
     */
    public void setHeight3(String height3) {
        __modifiedProperties.add("height3");
        this._height3 = height3;
    }

    /**
     * [get] GROSSWEIGHT3: {NotNull, varchar(30)} <br>
     * グロス重量３
     * @return The value of the column 'GROSSWEIGHT3'. (NullAllowed)
     */
    public String getGrossweight3() {
        return _grossweight3;
    }

    /**
     * [set] GROSSWEIGHT3: {NotNull, varchar(30)} <br>
     * グロス重量３
     * @param grossweight3 The value of the column 'GROSSWEIGHT3'. (NullAllowed)
     */
    public void setGrossweight3(String grossweight3) {
        __modifiedProperties.add("grossweight3");
        this._grossweight3 = grossweight3;
    }

    /**
     * [get] NETWEIGHT3: {NotNull, varchar(30)} <br>
     * ネット重量３
     * @return The value of the column 'NETWEIGHT3'. (NullAllowed)
     */
    public String getNetweight3() {
        return _netweight3;
    }

    /**
     * [set] NETWEIGHT3: {NotNull, varchar(30)} <br>
     * ネット重量３
     * @param netweight3 The value of the column 'NETWEIGHT3'. (NullAllowed)
     */
    public void setNetweight3(String netweight3) {
        __modifiedProperties.add("netweight3");
        this._netweight3 = netweight3;
    }

    /**
     * [get] CUBE3: {NotNull, varchar(30)} <br>
     * 体積（容積）３
     * @return The value of the column 'CUBE3'. (NullAllowed)
     */
    public String getCube3() {
        return _cube3;
    }

    /**
     * [set] CUBE3: {NotNull, varchar(30)} <br>
     * 体積（容積）３
     * @param cube3 The value of the column 'CUBE3'. (NullAllowed)
     */
    public void setCube3(String cube3) {
        __modifiedProperties.add("cube3");
        this._cube3 = cube3;
    }

    /**
     * [get] LITER3: {NotNull, varchar(30)} <br>
     * 内容量３
     * @return The value of the column 'LITER3'. (NullAllowed)
     */
    public String getLiter3() {
        return _liter3;
    }

    /**
     * [set] LITER3: {NotNull, varchar(30)} <br>
     * 内容量３
     * @param liter3 The value of the column 'LITER3'. (NullAllowed)
     */
    public void setLiter3(String liter3) {
        __modifiedProperties.add("liter3");
        this._liter3 = liter3;
    }

    /**
     * [get] P_QTY: {NotNull, varchar(30)} <br>
     * 1パレット当ケース数
     * @return The value of the column 'P_QTY'. (NullAllowed)
     */
    public String getPQty() {
        return _pQty;
    }

    /**
     * [set] P_QTY: {NotNull, varchar(30)} <br>
     * 1パレット当ケース数
     * @param pQty The value of the column 'P_QTY'. (NullAllowed)
     */
    public void setPQty(String pQty) {
        __modifiedProperties.add("PQty");
        this._pQty = pQty;
    }

    /**
     * [get] P_HEIGHT: {NotNull, varchar(30)} <br>
     * パレット積付段数
     * @return The value of the column 'P_HEIGHT'. (NullAllowed)
     */
    public String getPHeight() {
        return _pHeight;
    }

    /**
     * [set] P_HEIGHT: {NotNull, varchar(30)} <br>
     * パレット積付段数
     * @param pHeight The value of the column 'P_HEIGHT'. (NullAllowed)
     */
    public void setPHeight(String pHeight) {
        __modifiedProperties.add("PHeight");
        this._pHeight = pHeight;
    }

    /**
     * [get] P_ODD: {NotNull, varchar(30)} <br>
     * パレット積付端数
     * @return The value of the column 'P_ODD'. (NullAllowed)
     */
    public String getPOdd() {
        return _pOdd;
    }

    /**
     * [set] P_ODD: {NotNull, varchar(30)} <br>
     * パレット積付端数
     * @param pOdd The value of the column 'P_ODD'. (NullAllowed)
     */
    public void setPOdd(String pOdd) {
        __modifiedProperties.add("POdd");
        this._pOdd = pOdd;
    }

    /**
     * [get] NOTES: {NotNull, varchar(4000)} <br>
     * 備考
     * @return The value of the column 'NOTES'. (NullAllowed)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * [set] NOTES: {NotNull, varchar(4000)} <br>
     * 備考
     * @param notes The value of the column 'NOTES'. (NullAllowed)
     */
    public void setNotes(String notes) {
        __modifiedProperties.add("notes");
        this._notes = notes;
    }

    /**
     * [get] F_USER1: {NotNull, varchar(30)} <br>
     * 特販業者CD(1)
     * @return The value of the column 'F_USER1'. (NullAllowed)
     */
    public String getFUser1() {
        return _fUser1;
    }

    /**
     * [set] F_USER1: {NotNull, varchar(30)} <br>
     * 特販業者CD(1)
     * @param fUser1 The value of the column 'F_USER1'. (NullAllowed)
     */
    public void setFUser1(String fUser1) {
        __modifiedProperties.add("FUser1");
        this._fUser1 = fUser1;
    }

    /**
     * [get] F_USER2: {NotNull, varchar(30)} <br>
     * 特販業者CD(2)
     * @return The value of the column 'F_USER2'. (NullAllowed)
     */
    public String getFUser2() {
        return _fUser2;
    }

    /**
     * [set] F_USER2: {NotNull, varchar(30)} <br>
     * 特販業者CD(2)
     * @param fUser2 The value of the column 'F_USER2'. (NullAllowed)
     */
    public void setFUser2(String fUser2) {
        __modifiedProperties.add("FUser2");
        this._fUser2 = fUser2;
    }

    /**
     * [get] F_USER3: {NotNull, varchar(30)} <br>
     * 特販業者CD(3)
     * @return The value of the column 'F_USER3'. (NullAllowed)
     */
    public String getFUser3() {
        return _fUser3;
    }

    /**
     * [set] F_USER3: {NotNull, varchar(30)} <br>
     * 特販業者CD(3)
     * @param fUser3 The value of the column 'F_USER3'. (NullAllowed)
     */
    public void setFUser3(String fUser3) {
        __modifiedProperties.add("FUser3");
        this._fUser3 = fUser3;
    }

    /**
     * [get] F_USER4: {NotNull, varchar(30)} <br>
     * 特販業者CD(4)
     * @return The value of the column 'F_USER4'. (NullAllowed)
     */
    public String getFUser4() {
        return _fUser4;
    }

    /**
     * [set] F_USER4: {NotNull, varchar(30)} <br>
     * 特販業者CD(4)
     * @param fUser4 The value of the column 'F_USER4'. (NullAllowed)
     */
    public void setFUser4(String fUser4) {
        __modifiedProperties.add("FUser4");
        this._fUser4 = fUser4;
    }

    /**
     * [get] F_USER5: {NotNull, varchar(30)} <br>
     * 特販業者CD(5)
     * @return The value of the column 'F_USER5'. (NullAllowed)
     */
    public String getFUser5() {
        return _fUser5;
    }

    /**
     * [set] F_USER5: {NotNull, varchar(30)} <br>
     * 特販業者CD(5)
     * @param fUser5 The value of the column 'F_USER5'. (NullAllowed)
     */
    public void setFUser5(String fUser5) {
        __modifiedProperties.add("FUser5");
        this._fUser5 = fUser5;
    }

    /**
     * [get] PRICE_INSURANCE: {NotNull, varchar(30)} <br>
     * 寄託価格
     * @return The value of the column 'PRICE_INSURANCE'. (NullAllowed)
     */
    public String getPriceInsurance() {
        return _priceInsurance;
    }

    /**
     * [set] PRICE_INSURANCE: {NotNull, varchar(30)} <br>
     * 寄託価格
     * @param priceInsurance The value of the column 'PRICE_INSURANCE'. (NullAllowed)
     */
    public void setPriceInsurance(String priceInsurance) {
        __modifiedProperties.add("priceInsurance");
        this._priceInsurance = priceInsurance;
    }

    /**
     * [get] LIMITDAY: {NotNull, varchar(30)} <br>
     * 賞味期限日数
     * @return The value of the column 'LIMITDAY'. (NullAllowed)
     */
    public String getLimitday() {
        return _limitday;
    }

    /**
     * [set] LIMITDAY: {NotNull, varchar(30)} <br>
     * 賞味期限日数
     * @param limitday The value of the column 'LIMITDAY'. (NullAllowed)
     */
    public void setLimitday(String limitday) {
        __modifiedProperties.add("limitday");
        this._limitday = limitday;
    }

    /**
     * [get] USERUSE1: {NotNull, varchar(60)} <br>
     * メーカー・CD
     * @return The value of the column 'USERUSE1'. (NullAllowed)
     */
    public String getUseruse1() {
        return _useruse1;
    }

    /**
     * [set] USERUSE1: {NotNull, varchar(60)} <br>
     * メーカー・CD
     * @param useruse1 The value of the column 'USERUSE1'. (NullAllowed)
     */
    public void setUseruse1(String useruse1) {
        __modifiedProperties.add("useruse1");
        this._useruse1 = useruse1;
    }

    /**
     * [get] USERUSE2: {NotNull, varchar(60)} <br>
     * 国CD
     * @return The value of the column 'USERUSE2'. (NullAllowed)
     */
    public String getUseruse2() {
        return _useruse2;
    }

    /**
     * [set] USERUSE2: {NotNull, varchar(60)} <br>
     * 国CD
     * @param useruse2 The value of the column 'USERUSE2'. (NullAllowed)
     */
    public void setUseruse2(String useruse2) {
        __modifiedProperties.add("useruse2");
        this._useruse2 = useruse2;
    }

    /**
     * [get] USERUSE3: {NotNull, varchar(60)} <br>
     * レコード更新処理区分
     * @return The value of the column 'USERUSE3'. (NullAllowed)
     */
    public String getUseruse3() {
        return _useruse3;
    }

    /**
     * [set] USERUSE3: {NotNull, varchar(60)} <br>
     * レコード更新処理区分
     * @param useruse3 The value of the column 'USERUSE3'. (NullAllowed)
     */
    public void setUseruse3(String useruse3) {
        __modifiedProperties.add("useruse3");
        this._useruse3 = useruse3;
    }

    /**
     * [get] USERUSE4: {NotNull, varchar(60)} <br>
     * 親銘柄CD
     * @return The value of the column 'USERUSE4'. (NullAllowed)
     */
    public String getUseruse4() {
        return _useruse4;
    }

    /**
     * [set] USERUSE4: {NotNull, varchar(60)} <br>
     * 親銘柄CD
     * @param useruse4 The value of the column 'USERUSE4'. (NullAllowed)
     */
    public void setUseruse4(String useruse4) {
        __modifiedProperties.add("useruse4");
        this._useruse4 = useruse4;
    }

    /**
     * [get] USERUSE5: {NotNull, varchar(60)} <br>
     * 出納用銘柄CD
     * @return The value of the column 'USERUSE5'. (NullAllowed)
     */
    public String getUseruse5() {
        return _useruse5;
    }

    /**
     * [set] USERUSE5: {NotNull, varchar(60)} <br>
     * 出納用銘柄CD
     * @param useruse5 The value of the column 'USERUSE5'. (NullAllowed)
     */
    public void setUseruse5(String useruse5) {
        __modifiedProperties.add("useruse5");
        this._useruse5 = useruse5;
    }

    /**
     * [get] PRICELEVEL: {NotNull, char(1)} <br>
     * 銘柄単価設定レベル
     * @return The value of the column 'PRICELEVEL'. (NullAllowed)
     */
    public String getPricelevel() {
        return _pricelevel;
    }

    /**
     * [set] PRICELEVEL: {NotNull, char(1)} <br>
     * 銘柄単価設定レベル
     * @param pricelevel The value of the column 'PRICELEVEL'. (NullAllowed)
     */
    public void setPricelevel(String pricelevel) {
        __modifiedProperties.add("pricelevel");
        this._pricelevel = pricelevel;
    }

    /**
     * [get] ITEMCATALOGURL: {NotNull, varchar(255)} <br>
     * 銘柄紹介URL
     * @return The value of the column 'ITEMCATALOGURL'. (NullAllowed)
     */
    public String getItemcatalogurl() {
        return _itemcatalogurl;
    }

    /**
     * [set] ITEMCATALOGURL: {NotNull, varchar(255)} <br>
     * 銘柄紹介URL
     * @param itemcatalogurl The value of the column 'ITEMCATALOGURL'. (NullAllowed)
     */
    public void setItemcatalogurl(String itemcatalogurl) {
        __modifiedProperties.add("itemcatalogurl");
        this._itemcatalogurl = itemcatalogurl;
    }

    /**
     * [get] USERNUM1: {NotNull, varchar(30)} <br>
     * 使用区分
     * @return The value of the column 'USERNUM1'. (NullAllowed)
     */
    public String getUsernum1() {
        return _usernum1;
    }

    /**
     * [set] USERNUM1: {NotNull, varchar(30)} <br>
     * 使用区分
     * @param usernum1 The value of the column 'USERNUM1'. (NullAllowed)
     */
    public void setUsernum1(String usernum1) {
        __modifiedProperties.add("usernum1");
        this._usernum1 = usernum1;
    }

    /**
     * [get] USERNUM2: {NotNull, varchar(30)} <br>
     * カートン形状
     * @return The value of the column 'USERNUM2'. (NullAllowed)
     */
    public String getUsernum2() {
        return _usernum2;
    }

    /**
     * [set] USERNUM2: {NotNull, varchar(30)} <br>
     * カートン形状
     * @param usernum2 The value of the column 'USERNUM2'. (NullAllowed)
     */
    public void setUsernum2(String usernum2) {
        __modifiedProperties.add("usernum2");
        this._usernum2 = usernum2;
    }

    /**
     * [get] USERNUM3: {NotNull, varchar(30)} <br>
     * 一般出力順
     * @return The value of the column 'USERNUM3'. (NullAllowed)
     */
    public String getUsernum3() {
        return _usernum3;
    }

    /**
     * [set] USERNUM3: {NotNull, varchar(30)} <br>
     * 一般出力順
     * @param usernum3 The value of the column 'USERNUM3'. (NullAllowed)
     */
    public void setUsernum3(String usernum3) {
        __modifiedProperties.add("usernum3");
        this._usernum3 = usernum3;
    }

    /**
     * [get] USERNUM4: {NotNull, varchar(30)} <br>
     * CAP銘柄区分
     * @return The value of the column 'USERNUM4'. (NullAllowed)
     */
    public String getUsernum4() {
        return _usernum4;
    }

    /**
     * [set] USERNUM4: {NotNull, varchar(30)} <br>
     * CAP銘柄区分
     * @param usernum4 The value of the column 'USERNUM4'. (NullAllowed)
     */
    public void setUsernum4(String usernum4) {
        __modifiedProperties.add("usernum4");
        this._usernum4 = usernum4;
    }

    /**
     * [get] USERNUM5: {NotNull, varchar(30)} <br>
     * 製品包装形態
     * @return The value of the column 'USERNUM5'. (NullAllowed)
     */
    public String getUsernum5() {
        return _usernum5;
    }

    /**
     * [set] USERNUM5: {NotNull, varchar(30)} <br>
     * 製品包装形態
     * @param usernum5 The value of the column 'USERNUM5'. (NullAllowed)
     */
    public void setUsernum5(String usernum5) {
        __modifiedProperties.add("usernum5");
        this._usernum5 = usernum5;
    }

    /**
     * [get] USERDATE1: {NotNull, varchar(30)} <br>
     * 適用開始年月日
     * @return The value of the column 'USERDATE1'. (NullAllowed)
     */
    public String getUserdate1() {
        return _userdate1;
    }

    /**
     * [set] USERDATE1: {NotNull, varchar(30)} <br>
     * 適用開始年月日
     * @param userdate1 The value of the column 'USERDATE1'. (NullAllowed)
     */
    public void setUserdate1(String userdate1) {
        __modifiedProperties.add("userdate1");
        this._userdate1 = userdate1;
    }

    /**
     * [get] USERDATE2: {NotNull, varchar(30)} <br>
     * 適用終了年月日
     * @return The value of the column 'USERDATE2'. (NullAllowed)
     */
    public String getUserdate2() {
        return _userdate2;
    }

    /**
     * [set] USERDATE2: {NotNull, varchar(30)} <br>
     * 適用終了年月日
     * @param userdate2 The value of the column 'USERDATE2'. (NullAllowed)
     */
    public void setUserdate2(String userdate2) {
        __modifiedProperties.add("userdate2");
        this._userdate2 = userdate2;
    }

    /**
     * [get] USERDATE3: {NotNull, varchar(30)} <br>
     * 廃止年月日
     * @return The value of the column 'USERDATE3'. (NullAllowed)
     */
    public String getUserdate3() {
        return _userdate3;
    }

    /**
     * [set] USERDATE3: {NotNull, varchar(30)} <br>
     * 廃止年月日
     * @param userdate3 The value of the column 'USERDATE3'. (NullAllowed)
     */
    public void setUserdate3(String userdate3) {
        __modifiedProperties.add("userdate3");
        this._userdate3 = userdate3;
    }

    /**
     * [get] USERDATE4: {NotNull, varchar(30)} <br>
     * 取扱中止年月日
     * @return The value of the column 'USERDATE4'. (NullAllowed)
     */
    public String getUserdate4() {
        return _userdate4;
    }

    /**
     * [set] USERDATE4: {NotNull, varchar(30)} <br>
     * 取扱中止年月日
     * @param userdate4 The value of the column 'USERDATE4'. (NullAllowed)
     */
    public void setUserdate4(String userdate4) {
        __modifiedProperties.add("userdate4");
        this._userdate4 = userdate4;
    }

    /**
     * [get] USERDATE5: {NotNull, varchar(30)} <br>
     * 発売年月日
     * @return The value of the column 'USERDATE5'. (NullAllowed)
     */
    public String getUserdate5() {
        return _userdate5;
    }

    /**
     * [set] USERDATE5: {NotNull, varchar(30)} <br>
     * 発売年月日
     * @param userdate5 The value of the column 'USERDATE5'. (NullAllowed)
     */
    public void setUserdate5(String userdate5) {
        __modifiedProperties.add("userdate5");
        this._userdate5 = userdate5;
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
