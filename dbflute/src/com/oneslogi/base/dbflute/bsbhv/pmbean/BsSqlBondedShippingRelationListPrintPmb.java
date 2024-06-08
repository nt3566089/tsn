package com.oneslogi.base.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.paging.SimplePagingBean;
import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of SqlBondedShippingRelationListPrint. <br>
 * This is related to "<span style="color: #AD4747">selectSqlBondedShippingRelationListPrint</span>" on TTrsolistBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlBondedShippingRelationListPrintPmb extends SimplePagingBean implements EntityHandlingPmb<TTrsolistBhv, SqlBondedShippingRelationListPrint>, AutoPagingHandlingPmb<TTrsolistBhv, SqlBondedShippingRelationListPrint>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of shipschdateFrom. */
    protected String _shipschdateFrom;

    /** The parameter of shipschdateTo. */
    protected String _shipschdateTo;

    /** The parameter of printedflg. */
    protected String _printedflg;

    /** The parameter of listkbn. */
    protected String _listkbn;

    /** The parameter of pickbatchkey:likePrefix. */
    protected String _pickbatchkey;

    /** The option of like-search for pickbatchkey. */
    protected LikeSearchOption _pickbatchkeyInternalLikeSearchOption;

    /** The parameter of workallocateid:likePrefix. */
    protected String _workallocateid;

    /** The option of like-search for workallocateid. */
    protected LikeSearchOption _workallocateidInternalLikeSearchOption;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlBondedShippingRelationListPrint. <br>
     * This is related to "<span style="color: #AD4747">selectSqlBondedShippingRelationListPrint</span>" on TTrsolistBhv.
     */
    public BsSqlBondedShippingRelationListPrintPmb() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlBondedShippingRelationListPrint"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlBondedShippingRelationListPrint> getEntityType() { return SqlBondedShippingRelationListPrint.class; }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }

    protected void assertLikeSearchOptionValid(String name, LikeSearchOption option) { PmbCustodial.assertLikeSearchOptionValid(name, option); }

    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_centerId);
        sb.append(dm).append(_clientId);
        sb.append(dm).append(_shipschdateFrom);
        sb.append(dm).append(_shipschdateTo);
        sb.append(dm).append(_printedflg);
        sb.append(dm).append(_listkbn);
        sb.append(dm).append(_pickbatchkey);
        sb.append(dm).append(_workallocateid);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] centerId <br>
     * @return The value of centerId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] centerId <br>
     * @param centerId The value of centerId. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        _centerId = centerId;
    }

    /**
     * [get] clientId <br>
     * @return The value of clientId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] clientId <br>
     * @param clientId The value of clientId. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        _clientId = clientId;
    }

    /**
     * [get] shipschdateFrom <br>
     * @return The value of shipschdateFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getShipschdateFrom() {
        return filterStringParameter(_shipschdateFrom);
    }

    /**
     * [set] shipschdateFrom <br>
     * @param shipschdateFrom The value of shipschdateFrom. (NullAllowed)
     */
    public void setShipschdateFrom(String shipschdateFrom) {
        _shipschdateFrom = shipschdateFrom;
    }

    /**
     * [get] shipschdateTo <br>
     * @return The value of shipschdateTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getShipschdateTo() {
        return filterStringParameter(_shipschdateTo);
    }

    /**
     * [set] shipschdateTo <br>
     * @param shipschdateTo The value of shipschdateTo. (NullAllowed)
     */
    public void setShipschdateTo(String shipschdateTo) {
        _shipschdateTo = shipschdateTo;
    }

    /**
     * [get] printedflg <br>
     * @return The value of printedflg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPrintedflg() {
        return filterStringParameter(_printedflg);
    }

    /**
     * [set] printedflg <br>
     * @param printedflg The value of printedflg. (NullAllowed)
     */
    public void setPrintedflg(String printedflg) {
        _printedflg = printedflg;
    }

    /**
     * [get] listkbn <br>
     * @return The value of listkbn. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getListkbn() {
        return filterStringParameter(_listkbn);
    }

    /**
     * [set] listkbn <br>
     * @param listkbn The value of listkbn. (NullAllowed)
     */
    public void setListkbn(String listkbn) {
        _listkbn = listkbn;
    }

    /**
     * [get] pickbatchkey:likePrefix <br>
     * @return The value of pickbatchkey. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPickbatchkey() {
        return filterStringParameter(_pickbatchkey);
    }

    /**
     * [set as prefixSearch] pickbatchkey:likePrefix <br>
     * @param pickbatchkey The value of pickbatchkey. (NullAllowed)
     */
    public void setPickbatchkey_PrefixSearch(String pickbatchkey) {
        _pickbatchkey = pickbatchkey;
        _pickbatchkeyInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for pickbatchkey. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for pickbatchkey. (NullAllowed)
     */
    public LikeSearchOption getPickbatchkeyInternalLikeSearchOption() {
        return _pickbatchkeyInternalLikeSearchOption;
    }

    /**
     * [get] workallocateid:likePrefix <br>
     * @return The value of workallocateid. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getWorkallocateid() {
        return filterStringParameter(_workallocateid);
    }

    /**
     * [set as prefixSearch] workallocateid:likePrefix <br>
     * @param workallocateid The value of workallocateid. (NullAllowed)
     */
    public void setWorkallocateid_PrefixSearch(String workallocateid) {
        _workallocateid = workallocateid;
        _workallocateidInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for workallocateid. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for workallocateid. (NullAllowed)
     */
    public LikeSearchOption getWorkallocateidInternalLikeSearchOption() {
        return _workallocateidInternalLikeSearchOption;
    }
}
