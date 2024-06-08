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
 * The base class for typed parameter-bean of SqlPickingListRePrint. <br>
 * This is related to "<span style="color: #AD4747">selectSqlPickingListRePrint</span>" on TTrsolistBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlPickingListRePrintPmb extends SimplePagingBean implements EntityHandlingPmb<TTrsolistBhv, SqlPickingListRePrint>, AutoPagingHandlingPmb<TTrsolistBhv, SqlPickingListRePrint>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of listkbn. */
    protected String _listkbn;

    /** The parameter of workallocateid:likePrefix. */
    protected String _workallocateid;

    /** The option of like-search for workallocateid. */
    protected LikeSearchOption _workallocateidInternalLikeSearchOption;

    /** The parameter of trsoliststs. */
    protected String _trsoliststs;

    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of shipschdateFrom. */
    protected String _shipschdateFrom;

    /** The parameter of shipschdateTo. */
    protected String _shipschdateTo;

    /** The parameter of shiptocd:likePrefix. */
    protected String _shiptocd;

    /** The option of like-search for shiptocd. */
    protected LikeSearchOption _shiptocdInternalLikeSearchOption;

    /** The parameter of customerCd:likePrefix. */
    protected String _customerCd;

    /** The option of like-search for customerCd. */
    protected LikeSearchOption _customerCdInternalLikeSearchOption;

    /** The parameter of ownerordrno:likePrefix. */
    protected String _ownerordrno;

    /** The option of like-search for ownerordrno. */
    protected LikeSearchOption _ownerordrnoInternalLikeSearchOption;

    /** The parameter of rmano:likePrefix. */
    protected String _rmano;

    /** The option of like-search for rmano. */
    protected LikeSearchOption _rmanoInternalLikeSearchOption;

    /** The parameter of otherlot2. */
    protected String _otherlot2;

    /** The parameter of otherlot4:likePrefix. */
    protected String _otherlot4;

    /** The option of like-search for otherlot4. */
    protected LikeSearchOption _otherlot4InternalLikeSearchOption;

    /** The parameter of otherlot3:likePrefix. */
    protected String _otherlot3;

    /** The option of like-search for otherlot3. */
    protected LikeSearchOption _otherlot3InternalLikeSearchOption;

    /** The parameter of notes:likePrefix. */
    protected String _notes;

    /** The option of like-search for notes. */
    protected LikeSearchOption _notesInternalLikeSearchOption;

    /** The parameter of locationCd:likePrefix. */
    protected String _locationCd;

    /** The option of like-search for locationCd. */
    protected LikeSearchOption _locationCdInternalLikeSearchOption;

    /** The parameter of printdatetimeFrom. */
    protected java.sql.Timestamp _printdatetimeFrom;

    /** The parameter of printdatetimeTo. */
    protected java.sql.Timestamp _printdatetimeTo;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlPickingListRePrint. <br>
     * This is related to "<span style="color: #AD4747">selectSqlPickingListRePrint</span>" on TTrsolistBhv.
     */
    public BsSqlPickingListRePrintPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlPickingListRePrint"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlPickingListRePrint> getEntityType() { return SqlPickingListRePrint.class; }

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
        sb.append(dm).append(_listkbn);
        sb.append(dm).append(_workallocateid);
        sb.append(dm).append(_trsoliststs);
        sb.append(dm).append(_centerId);
        sb.append(dm).append(_clientId);
        sb.append(dm).append(_shipschdateFrom);
        sb.append(dm).append(_shipschdateTo);
        sb.append(dm).append(_shiptocd);
        sb.append(dm).append(_customerCd);
        sb.append(dm).append(_ownerordrno);
        sb.append(dm).append(_rmano);
        sb.append(dm).append(_otherlot2);
        sb.append(dm).append(_otherlot4);
        sb.append(dm).append(_otherlot3);
        sb.append(dm).append(_notes);
        sb.append(dm).append(_locationCd);
        sb.append(dm).append(_printdatetimeFrom);
        sb.append(dm).append(_printdatetimeTo);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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

    /**
     * [get] trsoliststs <br>
     * @return The value of trsoliststs. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getTrsoliststs() {
        return filterStringParameter(_trsoliststs);
    }

    /**
     * [set] trsoliststs <br>
     * @param trsoliststs The value of trsoliststs. (NullAllowed)
     */
    public void setTrsoliststs(String trsoliststs) {
        _trsoliststs = trsoliststs;
    }

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
     * [get] shiptocd:likePrefix <br>
     * @return The value of shiptocd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getShiptocd() {
        return filterStringParameter(_shiptocd);
    }

    /**
     * [set as prefixSearch] shiptocd:likePrefix <br>
     * @param shiptocd The value of shiptocd. (NullAllowed)
     */
    public void setShiptocd_PrefixSearch(String shiptocd) {
        _shiptocd = shiptocd;
        _shiptocdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for shiptocd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for shiptocd. (NullAllowed)
     */
    public LikeSearchOption getShiptocdInternalLikeSearchOption() {
        return _shiptocdInternalLikeSearchOption;
    }

    /**
     * [get] customerCd:likePrefix <br>
     * @return The value of customerCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCustomerCd() {
        return filterStringParameter(_customerCd);
    }

    /**
     * [set as prefixSearch] customerCd:likePrefix <br>
     * @param customerCd The value of customerCd. (NullAllowed)
     */
    public void setCustomerCd_PrefixSearch(String customerCd) {
        _customerCd = customerCd;
        _customerCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for customerCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for customerCd. (NullAllowed)
     */
    public LikeSearchOption getCustomerCdInternalLikeSearchOption() {
        return _customerCdInternalLikeSearchOption;
    }

    /**
     * [get] ownerordrno:likePrefix <br>
     * @return The value of ownerordrno. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getOwnerordrno() {
        return filterStringParameter(_ownerordrno);
    }

    /**
     * [set as prefixSearch] ownerordrno:likePrefix <br>
     * @param ownerordrno The value of ownerordrno. (NullAllowed)
     */
    public void setOwnerordrno_PrefixSearch(String ownerordrno) {
        _ownerordrno = ownerordrno;
        _ownerordrnoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for ownerordrno. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for ownerordrno. (NullAllowed)
     */
    public LikeSearchOption getOwnerordrnoInternalLikeSearchOption() {
        return _ownerordrnoInternalLikeSearchOption;
    }

    /**
     * [get] rmano:likePrefix <br>
     * @return The value of rmano. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getRmano() {
        return filterStringParameter(_rmano);
    }

    /**
     * [set as prefixSearch] rmano:likePrefix <br>
     * @param rmano The value of rmano. (NullAllowed)
     */
    public void setRmano_PrefixSearch(String rmano) {
        _rmano = rmano;
        _rmanoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for rmano. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for rmano. (NullAllowed)
     */
    public LikeSearchOption getRmanoInternalLikeSearchOption() {
        return _rmanoInternalLikeSearchOption;
    }

    /**
     * [get] otherlot2 <br>
     * @return The value of otherlot2. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getOtherlot2() {
        return filterStringParameter(_otherlot2);
    }

    /**
     * [set] otherlot2 <br>
     * @param otherlot2 The value of otherlot2. (NullAllowed)
     */
    public void setOtherlot2(String otherlot2) {
        _otherlot2 = otherlot2;
    }

    /**
     * [get] otherlot4:likePrefix <br>
     * @return The value of otherlot4. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getOtherlot4() {
        return filterStringParameter(_otherlot4);
    }

    /**
     * [set as prefixSearch] otherlot4:likePrefix <br>
     * @param otherlot4 The value of otherlot4. (NullAllowed)
     */
    public void setOtherlot4_PrefixSearch(String otherlot4) {
        _otherlot4 = otherlot4;
        _otherlot4InternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for otherlot4. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for otherlot4. (NullAllowed)
     */
    public LikeSearchOption getOtherlot4InternalLikeSearchOption() {
        return _otherlot4InternalLikeSearchOption;
    }

    /**
     * [get] otherlot3:likePrefix <br>
     * @return The value of otherlot3. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getOtherlot3() {
        return filterStringParameter(_otherlot3);
    }

    /**
     * [set as prefixSearch] otherlot3:likePrefix <br>
     * @param otherlot3 The value of otherlot3. (NullAllowed)
     */
    public void setOtherlot3_PrefixSearch(String otherlot3) {
        _otherlot3 = otherlot3;
        _otherlot3InternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for otherlot3. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for otherlot3. (NullAllowed)
     */
    public LikeSearchOption getOtherlot3InternalLikeSearchOption() {
        return _otherlot3InternalLikeSearchOption;
    }

    /**
     * [get] notes:likePrefix <br>
     * @return The value of notes. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getNotes() {
        return filterStringParameter(_notes);
    }

    /**
     * [set as prefixSearch] notes:likePrefix <br>
     * @param notes The value of notes. (NullAllowed)
     */
    public void setNotes_PrefixSearch(String notes) {
        _notes = notes;
        _notesInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for notes. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for notes. (NullAllowed)
     */
    public LikeSearchOption getNotesInternalLikeSearchOption() {
        return _notesInternalLikeSearchOption;
    }

    /**
     * [get] locationCd:likePrefix <br>
     * @return The value of locationCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getLocationCd() {
        return filterStringParameter(_locationCd);
    }

    /**
     * [set as prefixSearch] locationCd:likePrefix <br>
     * @param locationCd The value of locationCd. (NullAllowed)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        _locationCd = locationCd;
        _locationCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for locationCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for locationCd. (NullAllowed)
     */
    public LikeSearchOption getLocationCdInternalLikeSearchOption() {
        return _locationCdInternalLikeSearchOption;
    }

    /**
     * [get] printdatetimeFrom <br>
     * @return The value of printdatetimeFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Timestamp getPrintdatetimeFrom() {
        return _printdatetimeFrom;
    }

    /**
     * [set] printdatetimeFrom <br>
     * @param printdatetimeFrom The value of printdatetimeFrom. (NullAllowed)
     */
    public void setPrintdatetimeFrom(java.sql.Timestamp printdatetimeFrom) {
        _printdatetimeFrom = printdatetimeFrom;
    }

    /**
     * [get] printdatetimeTo <br>
     * @return The value of printdatetimeTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Timestamp getPrintdatetimeTo() {
        return _printdatetimeTo;
    }

    /**
     * [set] printdatetimeTo <br>
     * @param printdatetimeTo The value of printdatetimeTo. (NullAllowed)
     */
    public void setPrintdatetimeTo(java.sql.Timestamp printdatetimeTo) {
        _printdatetimeTo = printdatetimeTo;
    }
}
