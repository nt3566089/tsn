package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlShippingPalleteInfoList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     STS, SOPALLETNO, SHIPSCHDATE, OWNERORDERNO, ORDERTYPE, CUSTORDERNO, RMANO, OWNERSONO, SHIPDATE, ExpectQty1Style1, ExpectQty1Style2, SHIPTOCD, SHIPTONAME, OTHERREFNO1, PALLETKEY, SOID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String sts = entity.getSts();
 * String sopalletno = entity.getSopalletno();
 * String shipschdate = entity.getShipschdate();
 * String ownerorderno = entity.getOwnerorderno();
 * String ordertype = entity.getOrdertype();
 * String custorderno = entity.getCustorderno();
 * String rmano = entity.getRmano();
 * String ownersono = entity.getOwnersono();
 * String shipdate = entity.getShipdate();
 * java.math.BigDecimal expectQty1Style1 = entity.getExpectQty1Style1();
 * java.math.BigDecimal expectQty1Style2 = entity.getExpectQty1Style2();
 * String shiptocd = entity.getShiptocd();
 * String shiptoname = entity.getShiptoname();
 * String otherrefno1 = entity.getOtherrefno1();
 * String palletkey = entity.getPalletkey();
 * Long soid = entity.getSoid();
 * entity.setSts(sts);
 * entity.setSopalletno(sopalletno);
 * entity.setShipschdate(shipschdate);
 * entity.setOwnerorderno(ownerorderno);
 * entity.setOrdertype(ordertype);
 * entity.setCustorderno(custorderno);
 * entity.setRmano(rmano);
 * entity.setOwnersono(ownersono);
 * entity.setShipdate(shipdate);
 * entity.setExpectQty1Style1(expectQty1Style1);
 * entity.setExpectQty1Style2(expectQty1Style2);
 * entity.setShiptocd(shiptocd);
 * entity.setShiptoname(shiptoname);
 * entity.setOtherrefno1(otherrefno1);
 * entity.setPalletkey(palletkey);
 * entity.setSoid(soid);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlShippingPalleteInfoList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STS: {varchar(30)} */
    protected String _sts;

    /** SOPALLETNO: {varchar(30)} */
    protected String _sopalletno;

    /** SHIPSCHDATE: {varchar(8)} */
    protected String _shipschdate;

    /** OWNERORDERNO: {varchar(60)} */
    protected String _ownerorderno;

    /** ORDERTYPE: {varchar(60)} */
    protected String _ordertype;

    /** CUSTORDERNO: {varchar(60)} */
    protected String _custorderno;

    /** RMANO: {varchar(60)} */
    protected String _rmano;

    /** OWNERSONO: {varchar(60)} */
    protected String _ownersono;

    /** SHIPDATE: {varchar(8)} */
    protected String _shipdate;

    /** ExpectQty1Style1: {decimal(38, 6)} */
    protected java.math.BigDecimal _expectQty1Style1;

    /** ExpectQty1Style2: {decimal(38, 6)} */
    protected java.math.BigDecimal _expectQty1Style2;

    /** SHIPTOCD: {varchar(60)} */
    protected String _shiptocd;

    /** SHIPTONAME: {varchar(255)} */
    protected String _shiptoname;

    /** OTHERREFNO1: {varchar(60)} */
    protected String _otherrefno1;

    /** PALLETKEY: {varchar(30)} */
    protected String _palletkey;

    /** SOID: {bigint(19)} */
    protected Long _soid;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlShippingPalleteInfoListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlShippingPalleteInfoList";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlShippingPalleteInfoList) {
            BsSqlShippingPalleteInfoList other = (BsSqlShippingPalleteInfoList)obj;
            if (!xSV(_sts, other._sts)) { return false; }
            if (!xSV(_sopalletno, other._sopalletno)) { return false; }
            if (!xSV(_shipschdate, other._shipschdate)) { return false; }
            if (!xSV(_ownerorderno, other._ownerorderno)) { return false; }
            if (!xSV(_ordertype, other._ordertype)) { return false; }
            if (!xSV(_custorderno, other._custorderno)) { return false; }
            if (!xSV(_rmano, other._rmano)) { return false; }
            if (!xSV(_ownersono, other._ownersono)) { return false; }
            if (!xSV(_shipdate, other._shipdate)) { return false; }
            if (!xSV(_expectQty1Style1, other._expectQty1Style1)) { return false; }
            if (!xSV(_expectQty1Style2, other._expectQty1Style2)) { return false; }
            if (!xSV(_shiptocd, other._shiptocd)) { return false; }
            if (!xSV(_shiptoname, other._shiptoname)) { return false; }
            if (!xSV(_otherrefno1, other._otherrefno1)) { return false; }
            if (!xSV(_palletkey, other._palletkey)) { return false; }
            if (!xSV(_soid, other._soid)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sts);
        hs = xCH(hs, _sopalletno);
        hs = xCH(hs, _shipschdate);
        hs = xCH(hs, _ownerorderno);
        hs = xCH(hs, _ordertype);
        hs = xCH(hs, _custorderno);
        hs = xCH(hs, _rmano);
        hs = xCH(hs, _ownersono);
        hs = xCH(hs, _shipdate);
        hs = xCH(hs, _expectQty1Style1);
        hs = xCH(hs, _expectQty1Style2);
        hs = xCH(hs, _shiptocd);
        hs = xCH(hs, _shiptoname);
        hs = xCH(hs, _otherrefno1);
        hs = xCH(hs, _palletkey);
        hs = xCH(hs, _soid);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sts));
        sb.append(dm).append(xfND(_sopalletno));
        sb.append(dm).append(xfND(_shipschdate));
        sb.append(dm).append(xfND(_ownerorderno));
        sb.append(dm).append(xfND(_ordertype));
        sb.append(dm).append(xfND(_custorderno));
        sb.append(dm).append(xfND(_rmano));
        sb.append(dm).append(xfND(_ownersono));
        sb.append(dm).append(xfND(_shipdate));
        sb.append(dm).append(xfND(_expectQty1Style1));
        sb.append(dm).append(xfND(_expectQty1Style2));
        sb.append(dm).append(xfND(_shiptocd));
        sb.append(dm).append(xfND(_shiptoname));
        sb.append(dm).append(xfND(_otherrefno1));
        sb.append(dm).append(xfND(_palletkey));
        sb.append(dm).append(xfND(_soid));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlShippingPalleteInfoList clone() {
        return (SqlShippingPalleteInfoList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STS: {varchar(30)} <br>
     * @return The value of the column 'STS'. (NullAllowed even if selected: for no constraint)
     */
    public String getSts() {
        checkSpecifiedProperty("sts");
        return convertEmptyToNull(_sts);
    }

    /**
     * [set] STS: {varchar(30)} <br>
     * @param sts The value of the column 'STS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSts(String sts) {
        registerModifiedProperty("sts");
        _sts = sts;
    }

    /**
     * [get] SOPALLETNO: {varchar(30)} <br>
     * @return The value of the column 'SOPALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSopalletno() {
        checkSpecifiedProperty("sopalletno");
        return convertEmptyToNull(_sopalletno);
    }

    /**
     * [set] SOPALLETNO: {varchar(30)} <br>
     * @param sopalletno The value of the column 'SOPALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSopalletno(String sopalletno) {
        registerModifiedProperty("sopalletno");
        _sopalletno = sopalletno;
    }

    /**
     * [get] SHIPSCHDATE: {varchar(8)} <br>
     * @return The value of the column 'SHIPSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipschdate() {
        checkSpecifiedProperty("shipschdate");
        return convertEmptyToNull(_shipschdate);
    }

    /**
     * [set] SHIPSCHDATE: {varchar(8)} <br>
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipschdate(String shipschdate) {
        registerModifiedProperty("shipschdate");
        _shipschdate = shipschdate;
    }

    /**
     * [get] OWNERORDERNO: {varchar(60)} <br>
     * @return The value of the column 'OWNERORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnerorderno() {
        checkSpecifiedProperty("ownerorderno");
        return convertEmptyToNull(_ownerorderno);
    }

    /**
     * [set] OWNERORDERNO: {varchar(60)} <br>
     * @param ownerorderno The value of the column 'OWNERORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnerorderno(String ownerorderno) {
        registerModifiedProperty("ownerorderno");
        _ownerorderno = ownerorderno;
    }

    /**
     * [get] ORDERTYPE: {varchar(60)} <br>
     * @return The value of the column 'ORDERTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdertype() {
        checkSpecifiedProperty("ordertype");
        return convertEmptyToNull(_ordertype);
    }

    /**
     * [set] ORDERTYPE: {varchar(60)} <br>
     * @param ordertype The value of the column 'ORDERTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdertype(String ordertype) {
        registerModifiedProperty("ordertype");
        _ordertype = ordertype;
    }

    /**
     * [get] CUSTORDERNO: {varchar(60)} <br>
     * @return The value of the column 'CUSTORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustorderno() {
        checkSpecifiedProperty("custorderno");
        return convertEmptyToNull(_custorderno);
    }

    /**
     * [set] CUSTORDERNO: {varchar(60)} <br>
     * @param custorderno The value of the column 'CUSTORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustorderno(String custorderno) {
        registerModifiedProperty("custorderno");
        _custorderno = custorderno;
    }

    /**
     * [get] RMANO: {varchar(60)} <br>
     * @return The value of the column 'RMANO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRmano() {
        checkSpecifiedProperty("rmano");
        return convertEmptyToNull(_rmano);
    }

    /**
     * [set] RMANO: {varchar(60)} <br>
     * @param rmano The value of the column 'RMANO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRmano(String rmano) {
        registerModifiedProperty("rmano");
        _rmano = rmano;
    }

    /**
     * [get] OWNERSONO: {varchar(60)} <br>
     * @return The value of the column 'OWNERSONO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnersono() {
        checkSpecifiedProperty("ownersono");
        return convertEmptyToNull(_ownersono);
    }

    /**
     * [set] OWNERSONO: {varchar(60)} <br>
     * @param ownersono The value of the column 'OWNERSONO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnersono(String ownersono) {
        registerModifiedProperty("ownersono");
        _ownersono = ownersono;
    }

    /**
     * [get] SHIPDATE: {varchar(8)} <br>
     * @return The value of the column 'SHIPDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipdate() {
        checkSpecifiedProperty("shipdate");
        return convertEmptyToNull(_shipdate);
    }

    /**
     * [set] SHIPDATE: {varchar(8)} <br>
     * @param shipdate The value of the column 'SHIPDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipdate(String shipdate) {
        registerModifiedProperty("shipdate");
        _shipdate = shipdate;
    }

    /**
     * [get] ExpectQty1Style1: {decimal(38, 6)} <br>
     * @return The value of the column 'ExpectQty1Style1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getExpectQty1Style1() {
        checkSpecifiedProperty("expectQty1Style1");
        return _expectQty1Style1;
    }

    /**
     * [set] ExpectQty1Style1: {decimal(38, 6)} <br>
     * @param expectQty1Style1 The value of the column 'ExpectQty1Style1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectQty1Style1(java.math.BigDecimal expectQty1Style1) {
        registerModifiedProperty("expectQty1Style1");
        _expectQty1Style1 = expectQty1Style1;
    }

    /**
     * [get] ExpectQty1Style2: {decimal(38, 6)} <br>
     * @return The value of the column 'ExpectQty1Style2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getExpectQty1Style2() {
        checkSpecifiedProperty("expectQty1Style2");
        return _expectQty1Style2;
    }

    /**
     * [set] ExpectQty1Style2: {decimal(38, 6)} <br>
     * @param expectQty1Style2 The value of the column 'ExpectQty1Style2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectQty1Style2(java.math.BigDecimal expectQty1Style2) {
        registerModifiedProperty("expectQty1Style2");
        _expectQty1Style2 = expectQty1Style2;
    }

    /**
     * [get] SHIPTOCD: {varchar(60)} <br>
     * @return The value of the column 'SHIPTOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptocd() {
        checkSpecifiedProperty("shiptocd");
        return convertEmptyToNull(_shiptocd);
    }

    /**
     * [set] SHIPTOCD: {varchar(60)} <br>
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptocd(String shiptocd) {
        registerModifiedProperty("shiptocd");
        _shiptocd = shiptocd;
    }

    /**
     * [get] SHIPTONAME: {varchar(255)} <br>
     * @return The value of the column 'SHIPTONAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptoname() {
        checkSpecifiedProperty("shiptoname");
        return convertEmptyToNull(_shiptoname);
    }

    /**
     * [set] SHIPTONAME: {varchar(255)} <br>
     * @param shiptoname The value of the column 'SHIPTONAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptoname(String shiptoname) {
        registerModifiedProperty("shiptoname");
        _shiptoname = shiptoname;
    }

    /**
     * [get] OTHERREFNO1: {varchar(60)} <br>
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno1() {
        checkSpecifiedProperty("otherrefno1");
        return convertEmptyToNull(_otherrefno1);
    }

    /**
     * [set] OTHERREFNO1: {varchar(60)} <br>
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno1(String otherrefno1) {
        registerModifiedProperty("otherrefno1");
        _otherrefno1 = otherrefno1;
    }

    /**
     * [get] PALLETKEY: {varchar(30)} <br>
     * @return The value of the column 'PALLETKEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletkey() {
        checkSpecifiedProperty("palletkey");
        return convertEmptyToNull(_palletkey);
    }

    /**
     * [set] PALLETKEY: {varchar(30)} <br>
     * @param palletkey The value of the column 'PALLETKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletkey(String palletkey) {
        registerModifiedProperty("palletkey");
        _palletkey = palletkey;
    }

    /**
     * [get] SOID: {bigint(19)} <br>
     * @return The value of the column 'SOID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSoid() {
        checkSpecifiedProperty("soid");
        return _soid;
    }

    /**
     * [set] SOID: {bigint(19)} <br>
     * @param soid The value of the column 'SOID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSoid(Long soid) {
        registerModifiedProperty("soid");
        _soid = soid;
    }
}
