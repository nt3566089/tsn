package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlPickingListRePrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LISTKBN_NM, CENTER_CD, CENTER_ABBR, SHIPPING_LIST_PRINT_ID, PRINTDATETIME, SHIPSCHDATE, WORKALLOCATEID, OWNERORDERNO, ORDERTYPE_NM, CUSTORDERNO, RMANO, OWNERSONO, SHIPTOCD, DELIVNAME, TRSOLISTSTS_NM, SOPALLETNO, LOCATION_CD, LISTKBN, SOKEY, SOID, CLIENT_CD, CLIENT_ABBR
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
 * String listkbnNm = entity.getListkbnNm();
 * String centerCd = entity.getCenterCd();
 * String centerAbbr = entity.getCenterAbbr();
 * Long shippingListPrintId = entity.getShippingListPrintId();
 * java.sql.Timestamp printdatetime = entity.getPrintdatetime();
 * String shipschdate = entity.getShipschdate();
 * Long workallocateid = entity.getWorkallocateid();
 * String ownerorderno = entity.getOwnerorderno();
 * String ordertypeNm = entity.getOrdertypeNm();
 * String custorderno = entity.getCustorderno();
 * String rmano = entity.getRmano();
 * String ownersono = entity.getOwnersono();
 * String shiptocd = entity.getShiptocd();
 * String delivname = entity.getDelivname();
 * String trsoliststsNm = entity.getTrsoliststsNm();
 * String sopalletno = entity.getSopalletno();
 * String locationCd = entity.getLocationCd();
 * String listkbn = entity.getListkbn();
 * Long sokey = entity.getSokey();
 * Long soid = entity.getSoid();
 * String clientCd = entity.getClientCd();
 * String clientAbbr = entity.getClientAbbr();
 * entity.setListkbnNm(listkbnNm);
 * entity.setCenterCd(centerCd);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setShippingListPrintId(shippingListPrintId);
 * entity.setPrintdatetime(printdatetime);
 * entity.setShipschdate(shipschdate);
 * entity.setWorkallocateid(workallocateid);
 * entity.setOwnerorderno(ownerorderno);
 * entity.setOrdertypeNm(ordertypeNm);
 * entity.setCustorderno(custorderno);
 * entity.setRmano(rmano);
 * entity.setOwnersono(ownersono);
 * entity.setShiptocd(shiptocd);
 * entity.setDelivname(delivname);
 * entity.setTrsoliststsNm(trsoliststsNm);
 * entity.setSopalletno(sopalletno);
 * entity.setLocationCd(locationCd);
 * entity.setListkbn(listkbn);
 * entity.setSokey(sokey);
 * entity.setSoid(soid);
 * entity.setClientCd(clientCd);
 * entity.setClientAbbr(clientAbbr);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlPickingListRePrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LISTKBN_NM: {varchar(100)} */
    protected String _listkbnNm;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_ABBR: {varchar(60)} */
    protected String _centerAbbr;

    /** SHIPPING_LIST_PRINT_ID: {bigint(19)} */
    protected Long _shippingListPrintId;

    /** PRINTDATETIME: {datetime2(26, 6)} */
    protected java.sql.Timestamp _printdatetime;

    /** SHIPSCHDATE: {varchar(8)} */
    protected String _shipschdate;

    /** WORKALLOCATEID: {bigint(19)} */
    protected Long _workallocateid;

    /** OWNERORDERNO: {varchar(60)} */
    protected String _ownerorderno;

    /** ORDERTYPE_NM: {varchar(100)} */
    protected String _ordertypeNm;

    /** CUSTORDERNO: {varchar(60)} */
    protected String _custorderno;

    /** RMANO: {varchar(60)} */
    protected String _rmano;

    /** OWNERSONO: {varchar(60)} */
    protected String _ownersono;

    /** SHIPTOCD: {varchar(60)} */
    protected String _shiptocd;

    /** DELIVNAME: {varchar(255)} */
    protected String _delivname;

    /** TRSOLISTSTS_NM: {varchar(100)} */
    protected String _trsoliststsNm;

    /** SOPALLETNO: {varchar(30)} */
    protected String _sopalletno;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** LISTKBN: {varchar(100)} */
    protected String _listkbn;

    /** SOKEY: {bigint(19)} */
    protected Long _sokey;

    /** SOID: {bigint(19)} */
    protected Long _soid;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_ABBR: {varchar(60)} */
    protected String _clientAbbr;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlPickingListRePrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlPickingListRePrint";
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
        if (obj instanceof BsSqlPickingListRePrint) {
            BsSqlPickingListRePrint other = (BsSqlPickingListRePrint)obj;
            if (!xSV(_listkbnNm, other._listkbnNm)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerAbbr, other._centerAbbr)) { return false; }
            if (!xSV(_shippingListPrintId, other._shippingListPrintId)) { return false; }
            if (!xSV(_printdatetime, other._printdatetime)) { return false; }
            if (!xSV(_shipschdate, other._shipschdate)) { return false; }
            if (!xSV(_workallocateid, other._workallocateid)) { return false; }
            if (!xSV(_ownerorderno, other._ownerorderno)) { return false; }
            if (!xSV(_ordertypeNm, other._ordertypeNm)) { return false; }
            if (!xSV(_custorderno, other._custorderno)) { return false; }
            if (!xSV(_rmano, other._rmano)) { return false; }
            if (!xSV(_ownersono, other._ownersono)) { return false; }
            if (!xSV(_shiptocd, other._shiptocd)) { return false; }
            if (!xSV(_delivname, other._delivname)) { return false; }
            if (!xSV(_trsoliststsNm, other._trsoliststsNm)) { return false; }
            if (!xSV(_sopalletno, other._sopalletno)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            if (!xSV(_listkbn, other._listkbn)) { return false; }
            if (!xSV(_sokey, other._sokey)) { return false; }
            if (!xSV(_soid, other._soid)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientAbbr, other._clientAbbr)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _listkbnNm);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerAbbr);
        hs = xCH(hs, _shippingListPrintId);
        hs = xCH(hs, _printdatetime);
        hs = xCH(hs, _shipschdate);
        hs = xCH(hs, _workallocateid);
        hs = xCH(hs, _ownerorderno);
        hs = xCH(hs, _ordertypeNm);
        hs = xCH(hs, _custorderno);
        hs = xCH(hs, _rmano);
        hs = xCH(hs, _ownersono);
        hs = xCH(hs, _shiptocd);
        hs = xCH(hs, _delivname);
        hs = xCH(hs, _trsoliststsNm);
        hs = xCH(hs, _sopalletno);
        hs = xCH(hs, _locationCd);
        hs = xCH(hs, _listkbn);
        hs = xCH(hs, _sokey);
        hs = xCH(hs, _soid);
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientAbbr);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_listkbnNm));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_shippingListPrintId));
        sb.append(dm).append(xfND(_printdatetime));
        sb.append(dm).append(xfND(_shipschdate));
        sb.append(dm).append(xfND(_workallocateid));
        sb.append(dm).append(xfND(_ownerorderno));
        sb.append(dm).append(xfND(_ordertypeNm));
        sb.append(dm).append(xfND(_custorderno));
        sb.append(dm).append(xfND(_rmano));
        sb.append(dm).append(xfND(_ownersono));
        sb.append(dm).append(xfND(_shiptocd));
        sb.append(dm).append(xfND(_delivname));
        sb.append(dm).append(xfND(_trsoliststsNm));
        sb.append(dm).append(xfND(_sopalletno));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_listkbn));
        sb.append(dm).append(xfND(_sokey));
        sb.append(dm).append(xfND(_soid));
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientAbbr));
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
    public SqlPickingListRePrint clone() {
        return (SqlPickingListRePrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LISTKBN_NM: {varchar(100)} <br>
     * @return The value of the column 'LISTKBN_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getListkbnNm() {
        checkSpecifiedProperty("listkbnNm");
        return convertEmptyToNull(_listkbnNm);
    }

    /**
     * [set] LISTKBN_NM: {varchar(100)} <br>
     * @param listkbnNm The value of the column 'LISTKBN_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setListkbnNm(String listkbnNm) {
        registerModifiedProperty("listkbnNm");
        _listkbnNm = listkbnNm;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CENTER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterAbbr() {
        checkSpecifiedProperty("centerAbbr");
        return convertEmptyToNull(_centerAbbr);
    }

    /**
     * [set] CENTER_ABBR: {varchar(60)} <br>
     * @param centerAbbr The value of the column 'CENTER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterAbbr(String centerAbbr) {
        registerModifiedProperty("centerAbbr");
        _centerAbbr = centerAbbr;
    }

    /**
     * [get] SHIPPING_LIST_PRINT_ID: {bigint(19)} <br>
     * @return The value of the column 'SHIPPING_LIST_PRINT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingListPrintId() {
        checkSpecifiedProperty("shippingListPrintId");
        return _shippingListPrintId;
    }

    /**
     * [set] SHIPPING_LIST_PRINT_ID: {bigint(19)} <br>
     * @param shippingListPrintId The value of the column 'SHIPPING_LIST_PRINT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingListPrintId(Long shippingListPrintId) {
        registerModifiedProperty("shippingListPrintId");
        _shippingListPrintId = shippingListPrintId;
    }

    /**
     * [get] PRINTDATETIME: {datetime2(26, 6)} <br>
     * @return The value of the column 'PRINTDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getPrintdatetime() {
        checkSpecifiedProperty("printdatetime");
        return _printdatetime;
    }

    /**
     * [set] PRINTDATETIME: {datetime2(26, 6)} <br>
     * @param printdatetime The value of the column 'PRINTDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintdatetime(java.sql.Timestamp printdatetime) {
        registerModifiedProperty("printdatetime");
        _printdatetime = printdatetime;
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
     * [get] WORKALLOCATEID: {bigint(19)} <br>
     * @return The value of the column 'WORKALLOCATEID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWorkallocateid() {
        checkSpecifiedProperty("workallocateid");
        return _workallocateid;
    }

    /**
     * [set] WORKALLOCATEID: {bigint(19)} <br>
     * @param workallocateid The value of the column 'WORKALLOCATEID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkallocateid(Long workallocateid) {
        registerModifiedProperty("workallocateid");
        _workallocateid = workallocateid;
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
     * [get] ORDERTYPE_NM: {varchar(100)} <br>
     * @return The value of the column 'ORDERTYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdertypeNm() {
        checkSpecifiedProperty("ordertypeNm");
        return convertEmptyToNull(_ordertypeNm);
    }

    /**
     * [set] ORDERTYPE_NM: {varchar(100)} <br>
     * @param ordertypeNm The value of the column 'ORDERTYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdertypeNm(String ordertypeNm) {
        registerModifiedProperty("ordertypeNm");
        _ordertypeNm = ordertypeNm;
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
     * [get] DELIVNAME: {varchar(255)} <br>
     * @return The value of the column 'DELIVNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivname() {
        checkSpecifiedProperty("delivname");
        return convertEmptyToNull(_delivname);
    }

    /**
     * [set] DELIVNAME: {varchar(255)} <br>
     * @param delivname The value of the column 'DELIVNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivname(String delivname) {
        registerModifiedProperty("delivname");
        _delivname = delivname;
    }

    /**
     * [get] TRSOLISTSTS_NM: {varchar(100)} <br>
     * @return The value of the column 'TRSOLISTSTS_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrsoliststsNm() {
        checkSpecifiedProperty("trsoliststsNm");
        return convertEmptyToNull(_trsoliststsNm);
    }

    /**
     * [set] TRSOLISTSTS_NM: {varchar(100)} <br>
     * @param trsoliststsNm The value of the column 'TRSOLISTSTS_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrsoliststsNm(String trsoliststsNm) {
        registerModifiedProperty("trsoliststsNm");
        _trsoliststsNm = trsoliststsNm;
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
     * [get] LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] LISTKBN: {varchar(100)} <br>
     * @return The value of the column 'LISTKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getListkbn() {
        checkSpecifiedProperty("listkbn");
        return convertEmptyToNull(_listkbn);
    }

    /**
     * [set] LISTKBN: {varchar(100)} <br>
     * @param listkbn The value of the column 'LISTKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setListkbn(String listkbn) {
        registerModifiedProperty("listkbn");
        _listkbn = listkbn;
    }

    /**
     * [get] SOKEY: {bigint(19)} <br>
     * @return The value of the column 'SOKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSokey() {
        checkSpecifiedProperty("sokey");
        return _sokey;
    }

    /**
     * [set] SOKEY: {bigint(19)} <br>
     * @param sokey The value of the column 'SOKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSokey(Long sokey) {
        registerModifiedProperty("sokey");
        _sokey = sokey;
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

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientAbbr() {
        checkSpecifiedProperty("clientAbbr");
        return convertEmptyToNull(_clientAbbr);
    }

    /**
     * [set] CLIENT_ABBR: {varchar(60)} <br>
     * @param clientAbbr The value of the column 'CLIENT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientAbbr(String clientAbbr) {
        registerModifiedProperty("clientAbbr");
        _clientAbbr = clientAbbr;
    }
}
