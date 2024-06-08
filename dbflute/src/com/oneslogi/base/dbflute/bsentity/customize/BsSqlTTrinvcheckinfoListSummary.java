package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlTTrinvcheckinfoListSummary. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, EXECUTEDATE, INOUTKBN, DUALITEMCD, CENTER_ID, CLIENT_ID, DUALPRODUCTID, CAPITEMFLG, SYSINVTOTALINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, YDAYTLEQULYTOTALINV, TDAYEQYTOTALINV
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
 * String centerCd = entity.getCenterCd();
 * String executedate = entity.getExecutedate();
 * String inoutkbn = entity.getInoutkbn();
 * String dualitemcd = entity.getDualitemcd();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * Long dualproductid = entity.getDualproductid();
 * String capitemflg = entity.getCapitemflg();
 * java.math.BigDecimal sysinvtotalinv = entity.getSysinvtotalinv();
 * java.math.BigDecimal investtotalinv = entity.getInvesttotalinv();
 * java.math.BigDecimal investkeeplocinv = entity.getInvestkeeplocinv();
 * java.math.BigDecimal investreceivelocinv = entity.getInvestreceivelocinv();
 * java.math.BigDecimal investdamageitem = entity.getInvestdamageitem();
 * java.math.BigDecimal investclssifylocinv = entity.getInvestclssifylocinv();
 * java.math.BigDecimal investtmplocinv = entity.getInvesttmplocinv();
 * java.math.BigDecimal investautoinv = entity.getInvestautoinv();
 * java.math.BigDecimal ydaytlequlytotalinv = entity.getYdaytlequlytotalinv();
 * java.math.BigDecimal tdayeqytotalinv = entity.getTdayeqytotalinv();
 * entity.setCenterCd(centerCd);
 * entity.setExecutedate(executedate);
 * entity.setInoutkbn(inoutkbn);
 * entity.setDualitemcd(dualitemcd);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setDualproductid(dualproductid);
 * entity.setCapitemflg(capitemflg);
 * entity.setSysinvtotalinv(sysinvtotalinv);
 * entity.setInvesttotalinv(investtotalinv);
 * entity.setInvestkeeplocinv(investkeeplocinv);
 * entity.setInvestreceivelocinv(investreceivelocinv);
 * entity.setInvestdamageitem(investdamageitem);
 * entity.setInvestclssifylocinv(investclssifylocinv);
 * entity.setInvesttmplocinv(investtmplocinv);
 * entity.setInvestautoinv(investautoinv);
 * entity.setYdaytlequlytotalinv(ydaytlequlytotalinv);
 * entity.setTdayeqytotalinv(tdayeqytotalinv);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlTTrinvcheckinfoListSummary extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** EXECUTEDATE: {varchar(8)} */
    protected String _executedate;

    /** INOUTKBN: {varchar(30)} */
    protected String _inoutkbn;

    /** DUALITEMCD: {nvarchar(8)} */
    protected String _dualitemcd;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** DUALPRODUCTID: {bigint(19)} */
    protected Long _dualproductid;

    /** CAPITEMFLG: {bigint(19)} */
    protected String _capitemflg;

    /** SYSINVTOTALINV: {decimal(38, 6)} */
    protected java.math.BigDecimal _sysinvtotalinv;

    /** INVESTTOTALINV: {decimal(38, 6)} */
    protected java.math.BigDecimal _investtotalinv;

    /** INVESTKEEPLOCINV: {decimal(38, 6)} */
    protected java.math.BigDecimal _investkeeplocinv;

    /** INVESTRECEIVELOCINV: {decimal(38, 6)} */
    protected java.math.BigDecimal _investreceivelocinv;

    /** INVESTDAMAGEITEM: {decimal(38, 6)} */
    protected java.math.BigDecimal _investdamageitem;

    /** INVESTCLSSIFYLOCINV: {decimal(38, 6)} */
    protected java.math.BigDecimal _investclssifylocinv;

    /** INVESTTMPLOCINV: {decimal(38, 6)} */
    protected java.math.BigDecimal _investtmplocinv;

    /** INVESTAUTOINV: {decimal(38, 6)} */
    protected java.math.BigDecimal _investautoinv;

    /** YDAYTLEQULYTOTALINV: {decimal(38, 6)} */
    protected java.math.BigDecimal _ydaytlequlytotalinv;

    /** TDAYEQYTOTALINV: {decimal(38, 6)} */
    protected java.math.BigDecimal _tdayeqytotalinv;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlTTrinvcheckinfoListSummaryDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlTTrinvcheckinfoListSummary";
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
        if (obj instanceof BsSqlTTrinvcheckinfoListSummary) {
            BsSqlTTrinvcheckinfoListSummary other = (BsSqlTTrinvcheckinfoListSummary)obj;
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_executedate, other._executedate)) { return false; }
            if (!xSV(_inoutkbn, other._inoutkbn)) { return false; }
            if (!xSV(_dualitemcd, other._dualitemcd)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_dualproductid, other._dualproductid)) { return false; }
            if (!xSV(_capitemflg, other._capitemflg)) { return false; }
            if (!xSV(_sysinvtotalinv, other._sysinvtotalinv)) { return false; }
            if (!xSV(_investtotalinv, other._investtotalinv)) { return false; }
            if (!xSV(_investkeeplocinv, other._investkeeplocinv)) { return false; }
            if (!xSV(_investreceivelocinv, other._investreceivelocinv)) { return false; }
            if (!xSV(_investdamageitem, other._investdamageitem)) { return false; }
            if (!xSV(_investclssifylocinv, other._investclssifylocinv)) { return false; }
            if (!xSV(_investtmplocinv, other._investtmplocinv)) { return false; }
            if (!xSV(_investautoinv, other._investautoinv)) { return false; }
            if (!xSV(_ydaytlequlytotalinv, other._ydaytlequlytotalinv)) { return false; }
            if (!xSV(_tdayeqytotalinv, other._tdayeqytotalinv)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _executedate);
        hs = xCH(hs, _inoutkbn);
        hs = xCH(hs, _dualitemcd);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _dualproductid);
        hs = xCH(hs, _capitemflg);
        hs = xCH(hs, _sysinvtotalinv);
        hs = xCH(hs, _investtotalinv);
        hs = xCH(hs, _investkeeplocinv);
        hs = xCH(hs, _investreceivelocinv);
        hs = xCH(hs, _investdamageitem);
        hs = xCH(hs, _investclssifylocinv);
        hs = xCH(hs, _investtmplocinv);
        hs = xCH(hs, _investautoinv);
        hs = xCH(hs, _ydaytlequlytotalinv);
        hs = xCH(hs, _tdayeqytotalinv);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_executedate));
        sb.append(dm).append(xfND(_inoutkbn));
        sb.append(dm).append(xfND(_dualitemcd));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_dualproductid));
        sb.append(dm).append(xfND(_capitemflg));
        sb.append(dm).append(xfND(_sysinvtotalinv));
        sb.append(dm).append(xfND(_investtotalinv));
        sb.append(dm).append(xfND(_investkeeplocinv));
        sb.append(dm).append(xfND(_investreceivelocinv));
        sb.append(dm).append(xfND(_investdamageitem));
        sb.append(dm).append(xfND(_investclssifylocinv));
        sb.append(dm).append(xfND(_investtmplocinv));
        sb.append(dm).append(xfND(_investautoinv));
        sb.append(dm).append(xfND(_ydaytlequlytotalinv));
        sb.append(dm).append(xfND(_tdayeqytotalinv));
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
    public SqlTTrinvcheckinfoListSummary clone() {
        return (SqlTTrinvcheckinfoListSummary)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] EXECUTEDATE: {varchar(8)} <br>
     * @return The value of the column 'EXECUTEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getExecutedate() {
        checkSpecifiedProperty("executedate");
        return convertEmptyToNull(_executedate);
    }

    /**
     * [set] EXECUTEDATE: {varchar(8)} <br>
     * @param executedate The value of the column 'EXECUTEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExecutedate(String executedate) {
        registerModifiedProperty("executedate");
        _executedate = executedate;
    }

    /**
     * [get] INOUTKBN: {varchar(30)} <br>
     * @return The value of the column 'INOUTKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInoutkbn() {
        checkSpecifiedProperty("inoutkbn");
        return convertEmptyToNull(_inoutkbn);
    }

    /**
     * [set] INOUTKBN: {varchar(30)} <br>
     * @param inoutkbn The value of the column 'INOUTKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInoutkbn(String inoutkbn) {
        registerModifiedProperty("inoutkbn");
        _inoutkbn = inoutkbn;
    }

    /**
     * [get] DUALITEMCD: {nvarchar(8)} <br>
     * @return The value of the column 'DUALITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDualitemcd() {
        checkSpecifiedProperty("dualitemcd");
        return convertEmptyToNull(_dualitemcd);
    }

    /**
     * [set] DUALITEMCD: {nvarchar(8)} <br>
     * @param dualitemcd The value of the column 'DUALITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDualitemcd(String dualitemcd) {
        registerModifiedProperty("dualitemcd");
        _dualitemcd = dualitemcd;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] DUALPRODUCTID: {bigint(19)} <br>
     * @return The value of the column 'DUALPRODUCTID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDualproductid() {
        checkSpecifiedProperty("dualproductid");
        return _dualproductid;
    }

    /**
     * [set] DUALPRODUCTID: {bigint(19)} <br>
     * @param dualproductid The value of the column 'DUALPRODUCTID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDualproductid(Long dualproductid) {
        registerModifiedProperty("dualproductid");
        _dualproductid = dualproductid;
    }

    /**
     * [get] CAPITEMFLG: {bigint(19)} <br>
     * @return The value of the column 'CAPITEMFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCapitemflg() {
        checkSpecifiedProperty("capitemflg");
        return convertEmptyToNull(_capitemflg);
    }

    /**
     * [set] CAPITEMFLG: {bigint(19)} <br>
     * @param capitemflg The value of the column 'CAPITEMFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCapitemflg(String capitemflg) {
        registerModifiedProperty("capitemflg");
        _capitemflg = capitemflg;
    }

    /**
     * [get] SYSINVTOTALINV: {decimal(38, 6)} <br>
     * @return The value of the column 'SYSINVTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSysinvtotalinv() {
        checkSpecifiedProperty("sysinvtotalinv");
        return _sysinvtotalinv;
    }

    /**
     * [set] SYSINVTOTALINV: {decimal(38, 6)} <br>
     * @param sysinvtotalinv The value of the column 'SYSINVTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSysinvtotalinv(java.math.BigDecimal sysinvtotalinv) {
        registerModifiedProperty("sysinvtotalinv");
        _sysinvtotalinv = sysinvtotalinv;
    }

    /**
     * [get] INVESTTOTALINV: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvesttotalinv() {
        checkSpecifiedProperty("investtotalinv");
        return _investtotalinv;
    }

    /**
     * [set] INVESTTOTALINV: {decimal(38, 6)} <br>
     * @param investtotalinv The value of the column 'INVESTTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvesttotalinv(java.math.BigDecimal investtotalinv) {
        registerModifiedProperty("investtotalinv");
        _investtotalinv = investtotalinv;
    }

    /**
     * [get] INVESTKEEPLOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTKEEPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestkeeplocinv() {
        checkSpecifiedProperty("investkeeplocinv");
        return _investkeeplocinv;
    }

    /**
     * [set] INVESTKEEPLOCINV: {decimal(38, 6)} <br>
     * @param investkeeplocinv The value of the column 'INVESTKEEPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestkeeplocinv(java.math.BigDecimal investkeeplocinv) {
        registerModifiedProperty("investkeeplocinv");
        _investkeeplocinv = investkeeplocinv;
    }

    /**
     * [get] INVESTRECEIVELOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestreceivelocinv() {
        checkSpecifiedProperty("investreceivelocinv");
        return _investreceivelocinv;
    }

    /**
     * [set] INVESTRECEIVELOCINV: {decimal(38, 6)} <br>
     * @param investreceivelocinv The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestreceivelocinv(java.math.BigDecimal investreceivelocinv) {
        registerModifiedProperty("investreceivelocinv");
        _investreceivelocinv = investreceivelocinv;
    }

    /**
     * [get] INVESTDAMAGEITEM: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTDAMAGEITEM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestdamageitem() {
        checkSpecifiedProperty("investdamageitem");
        return _investdamageitem;
    }

    /**
     * [set] INVESTDAMAGEITEM: {decimal(38, 6)} <br>
     * @param investdamageitem The value of the column 'INVESTDAMAGEITEM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestdamageitem(java.math.BigDecimal investdamageitem) {
        registerModifiedProperty("investdamageitem");
        _investdamageitem = investdamageitem;
    }

    /**
     * [get] INVESTCLSSIFYLOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestclssifylocinv() {
        checkSpecifiedProperty("investclssifylocinv");
        return _investclssifylocinv;
    }

    /**
     * [set] INVESTCLSSIFYLOCINV: {decimal(38, 6)} <br>
     * @param investclssifylocinv The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestclssifylocinv(java.math.BigDecimal investclssifylocinv) {
        registerModifiedProperty("investclssifylocinv");
        _investclssifylocinv = investclssifylocinv;
    }

    /**
     * [get] INVESTTMPLOCINV: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTTMPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvesttmplocinv() {
        checkSpecifiedProperty("investtmplocinv");
        return _investtmplocinv;
    }

    /**
     * [set] INVESTTMPLOCINV: {decimal(38, 6)} <br>
     * @param investtmplocinv The value of the column 'INVESTTMPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvesttmplocinv(java.math.BigDecimal investtmplocinv) {
        registerModifiedProperty("investtmplocinv");
        _investtmplocinv = investtmplocinv;
    }

    /**
     * [get] INVESTAUTOINV: {decimal(38, 6)} <br>
     * @return The value of the column 'INVESTAUTOINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestautoinv() {
        checkSpecifiedProperty("investautoinv");
        return _investautoinv;
    }

    /**
     * [set] INVESTAUTOINV: {decimal(38, 6)} <br>
     * @param investautoinv The value of the column 'INVESTAUTOINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestautoinv(java.math.BigDecimal investautoinv) {
        registerModifiedProperty("investautoinv");
        _investautoinv = investautoinv;
    }

    /**
     * [get] YDAYTLEQULYTOTALINV: {decimal(38, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getYdaytlequlytotalinv() {
        checkSpecifiedProperty("ydaytlequlytotalinv");
        return _ydaytlequlytotalinv;
    }

    /**
     * [set] YDAYTLEQULYTOTALINV: {decimal(38, 6)} <br>
     * @param ydaytlequlytotalinv The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYdaytlequlytotalinv(java.math.BigDecimal ydaytlequlytotalinv) {
        registerModifiedProperty("ydaytlequlytotalinv");
        _ydaytlequlytotalinv = ydaytlequlytotalinv;
    }

    /**
     * [get] TDAYEQYTOTALINV: {decimal(38, 6)} <br>
     * @return The value of the column 'TDAYEQYTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTdayeqytotalinv() {
        checkSpecifiedProperty("tdayeqytotalinv");
        return _tdayeqytotalinv;
    }

    /**
     * [set] TDAYEQYTOTALINV: {decimal(38, 6)} <br>
     * @param tdayeqytotalinv The value of the column 'TDAYEQYTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTdayeqytotalinv(java.math.BigDecimal tdayeqytotalinv) {
        registerModifiedProperty("tdayeqytotalinv");
        _tdayeqytotalinv = tdayeqytotalinv;
    }
}
