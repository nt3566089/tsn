package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlBondedShippingRelationListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PICKBATCHKEY, WORKALLOCATEID, PICKDATE, LISTKBN, PRINTEDFLG, LISTKBN_NM, PRINTEDFLG_NM, CENTER_CD, CENTER_ABBR, CLIENT_CD, CLIENT_ABBR
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
 * Long pickbatchkey = entity.getPickbatchkey();
 * Long workallocateid = entity.getWorkallocateid();
 * java.sql.Timestamp pickdate = entity.getPickdate();
 * String listkbn = entity.getListkbn();
 * String printedflg = entity.getPrintedflg();
 * String listkbnNm = entity.getListkbnNm();
 * String printedflgNm = entity.getPrintedflgNm();
 * String centerCd = entity.getCenterCd();
 * String centerAbbr = entity.getCenterAbbr();
 * String clientCd = entity.getClientCd();
 * String clientAbbr = entity.getClientAbbr();
 * entity.setPickbatchkey(pickbatchkey);
 * entity.setWorkallocateid(workallocateid);
 * entity.setPickdate(pickdate);
 * entity.setListkbn(listkbn);
 * entity.setPrintedflg(printedflg);
 * entity.setListkbnNm(listkbnNm);
 * entity.setPrintedflgNm(printedflgNm);
 * entity.setCenterCd(centerCd);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setClientCd(clientCd);
 * entity.setClientAbbr(clientAbbr);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlBondedShippingRelationListPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PICKBATCHKEY: {bigint(19)} */
    protected Long _pickbatchkey;

    /** WORKALLOCATEID: {bigint(19)} */
    protected Long _workallocateid;

    /** PICKDATE: {datetime2(26, 6)} */
    protected java.sql.Timestamp _pickdate;

    /** LISTKBN: {varchar(100)} */
    protected String _listkbn;

    /** PRINTEDFLG: {char(1)} */
    protected String _printedflg;

    /** LISTKBN_NM: {varchar(100)} */
    protected String _listkbnNm;

    /** PRINTEDFLG_NM: {varchar(100)} */
    protected String _printedflgNm;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_ABBR: {varchar(60)} */
    protected String _centerAbbr;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_ABBR: {varchar(60)} */
    protected String _clientAbbr;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlBondedShippingRelationListPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlBondedShippingRelationListPrint";
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
        if (obj instanceof BsSqlBondedShippingRelationListPrint) {
            BsSqlBondedShippingRelationListPrint other = (BsSqlBondedShippingRelationListPrint)obj;
            if (!xSV(_pickbatchkey, other._pickbatchkey)) { return false; }
            if (!xSV(_workallocateid, other._workallocateid)) { return false; }
            if (!xSV(_pickdate, other._pickdate)) { return false; }
            if (!xSV(_listkbn, other._listkbn)) { return false; }
            if (!xSV(_printedflg, other._printedflg)) { return false; }
            if (!xSV(_listkbnNm, other._listkbnNm)) { return false; }
            if (!xSV(_printedflgNm, other._printedflgNm)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerAbbr, other._centerAbbr)) { return false; }
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
        hs = xCH(hs, _pickbatchkey);
        hs = xCH(hs, _workallocateid);
        hs = xCH(hs, _pickdate);
        hs = xCH(hs, _listkbn);
        hs = xCH(hs, _printedflg);
        hs = xCH(hs, _listkbnNm);
        hs = xCH(hs, _printedflgNm);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerAbbr);
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
        sb.append(dm).append(xfND(_pickbatchkey));
        sb.append(dm).append(xfND(_workallocateid));
        sb.append(dm).append(xfND(_pickdate));
        sb.append(dm).append(xfND(_listkbn));
        sb.append(dm).append(xfND(_printedflg));
        sb.append(dm).append(xfND(_listkbnNm));
        sb.append(dm).append(xfND(_printedflgNm));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerAbbr));
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
    public SqlBondedShippingRelationListPrint clone() {
        return (SqlBondedShippingRelationListPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PICKBATCHKEY: {bigint(19)} <br>
     * @return The value of the column 'PICKBATCHKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickbatchkey() {
        checkSpecifiedProperty("pickbatchkey");
        return _pickbatchkey;
    }

    /**
     * [set] PICKBATCHKEY: {bigint(19)} <br>
     * @param pickbatchkey The value of the column 'PICKBATCHKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickbatchkey(Long pickbatchkey) {
        registerModifiedProperty("pickbatchkey");
        _pickbatchkey = pickbatchkey;
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
     * [get] PICKDATE: {datetime2(26, 6)} <br>
     * @return The value of the column 'PICKDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getPickdate() {
        checkSpecifiedProperty("pickdate");
        return _pickdate;
    }

    /**
     * [set] PICKDATE: {datetime2(26, 6)} <br>
     * @param pickdate The value of the column 'PICKDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickdate(java.sql.Timestamp pickdate) {
        registerModifiedProperty("pickdate");
        _pickdate = pickdate;
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
     * [get] PRINTEDFLG: {char(1)} <br>
     * @return The value of the column 'PRINTEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrintedflg() {
        checkSpecifiedProperty("printedflg");
        return convertEmptyToNull(_printedflg);
    }

    /**
     * [set] PRINTEDFLG: {char(1)} <br>
     * @param printedflg The value of the column 'PRINTEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintedflg(String printedflg) {
        registerModifiedProperty("printedflg");
        _printedflg = printedflg;
    }

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
     * [get] PRINTEDFLG_NM: {varchar(100)} <br>
     * @return The value of the column 'PRINTEDFLG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrintedflgNm() {
        checkSpecifiedProperty("printedflgNm");
        return convertEmptyToNull(_printedflgNm);
    }

    /**
     * [set] PRINTEDFLG_NM: {varchar(100)} <br>
     * @param printedflgNm The value of the column 'PRINTEDFLG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintedflgNm(String printedflgNm) {
        registerModifiedProperty("printedflgNm");
        _printedflgNm = printedflgNm;
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
