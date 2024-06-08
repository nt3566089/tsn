package com.oneslogi.base.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of SqlShippingPalleteInfoList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlShippingPalleteInfoList</span>" on TTrsoBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlShippingPalleteInfoListPmb implements ListHandlingPmb<TTrsoBhv, SqlShippingPalleteInfoList>, EntityHandlingPmb<TTrsoBhv, SqlShippingPalleteInfoList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The parameter of shipSchDtFrom. */
    protected String _shipSchDtFrom;

    /** The parameter of shipSchDtTo. */
    protected String _shipSchDtTo;

    /** The parameter of ownerOrderNo:likePrefix. */
    protected String _ownerOrderNo;

    /** The option of like-search for ownerOrderNo. */
    protected LikeSearchOption _ownerOrderNoInternalLikeSearchOption;

    /** The parameter of requestType. */
    protected String _requestType;

    /** The parameter of custorderNo:likePrefix. */
    protected String _custorderNo;

    /** The option of like-search for custorderNo. */
    protected LikeSearchOption _custorderNoInternalLikeSearchOption;

    /** The parameter of rmaNo:likePrefix. */
    protected String _rmaNo;

    /** The option of like-search for rmaNo. */
    protected LikeSearchOption _rmaNoInternalLikeSearchOption;

    /** The parameter of refNo:likePrefix. */
    protected String _refNo;

    /** The option of like-search for refNo. */
    protected LikeSearchOption _refNoInternalLikeSearchOption;

    /** The parameter of soPalletNo:likePrefix. */
    protected String _soPalletNo;

    /** The option of like-search for soPalletNo. */
    protected LikeSearchOption _soPalletNoInternalLikeSearchOption;

    /** The parameter of status. */
    protected String _status;

    /** The parameter of shipToCd:likePrefix. */
    protected String _shipToCd;

    /** The option of like-search for shipToCd. */
    protected LikeSearchOption _shipToCdInternalLikeSearchOption;

    /** The parameter of customerCd:likePrefix. */
    protected String _customerCd;

    /** The option of like-search for customerCd. */
    protected LikeSearchOption _customerCdInternalLikeSearchOption;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlShippingPalleteInfoList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlShippingPalleteInfoList</span>" on TTrsoBhv.
     */
    public BsSqlShippingPalleteInfoListPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSqlShippingPalleteInfoList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlShippingPalleteInfoList> getEntityType() { return SqlShippingPalleteInfoList.class; }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

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
        sb.append(dm).append(_shipSchDtFrom);
        sb.append(dm).append(_shipSchDtTo);
        sb.append(dm).append(_ownerOrderNo);
        sb.append(dm).append(_requestType);
        sb.append(dm).append(_custorderNo);
        sb.append(dm).append(_rmaNo);
        sb.append(dm).append(_refNo);
        sb.append(dm).append(_soPalletNo);
        sb.append(dm).append(_status);
        sb.append(dm).append(_shipToCd);
        sb.append(dm).append(_customerCd);
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
     * [get] shipSchDtFrom <br>
     * @return The value of shipSchDtFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getShipSchDtFrom() {
        return filterStringParameter(_shipSchDtFrom);
    }

    /**
     * [set] shipSchDtFrom <br>
     * @param shipSchDtFrom The value of shipSchDtFrom. (NullAllowed)
     */
    public void setShipSchDtFrom(String shipSchDtFrom) {
        _shipSchDtFrom = shipSchDtFrom;
    }

    /**
     * [get] shipSchDtTo <br>
     * @return The value of shipSchDtTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getShipSchDtTo() {
        return filterStringParameter(_shipSchDtTo);
    }

    /**
     * [set] shipSchDtTo <br>
     * @param shipSchDtTo The value of shipSchDtTo. (NullAllowed)
     */
    public void setShipSchDtTo(String shipSchDtTo) {
        _shipSchDtTo = shipSchDtTo;
    }

    /**
     * [get] ownerOrderNo:likePrefix <br>
     * @return The value of ownerOrderNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getOwnerOrderNo() {
        return filterStringParameter(_ownerOrderNo);
    }

    /**
     * [set as prefixSearch] ownerOrderNo:likePrefix <br>
     * @param ownerOrderNo The value of ownerOrderNo. (NullAllowed)
     */
    public void setOwnerOrderNo_PrefixSearch(String ownerOrderNo) {
        _ownerOrderNo = ownerOrderNo;
        _ownerOrderNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for ownerOrderNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for ownerOrderNo. (NullAllowed)
     */
    public LikeSearchOption getOwnerOrderNoInternalLikeSearchOption() {
        return _ownerOrderNoInternalLikeSearchOption;
    }

    /**
     * [get] requestType <br>
     * @return The value of requestType. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getRequestType() {
        return filterStringParameter(_requestType);
    }

    /**
     * [set] requestType <br>
     * @param requestType The value of requestType. (NullAllowed)
     */
    public void setRequestType(String requestType) {
        _requestType = requestType;
    }

    /**
     * [get] custorderNo:likePrefix <br>
     * @return The value of custorderNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCustorderNo() {
        return filterStringParameter(_custorderNo);
    }

    /**
     * [set as prefixSearch] custorderNo:likePrefix <br>
     * @param custorderNo The value of custorderNo. (NullAllowed)
     */
    public void setCustorderNo_PrefixSearch(String custorderNo) {
        _custorderNo = custorderNo;
        _custorderNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for custorderNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for custorderNo. (NullAllowed)
     */
    public LikeSearchOption getCustorderNoInternalLikeSearchOption() {
        return _custorderNoInternalLikeSearchOption;
    }

    /**
     * [get] rmaNo:likePrefix <br>
     * @return The value of rmaNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getRmaNo() {
        return filterStringParameter(_rmaNo);
    }

    /**
     * [set as prefixSearch] rmaNo:likePrefix <br>
     * @param rmaNo The value of rmaNo. (NullAllowed)
     */
    public void setRmaNo_PrefixSearch(String rmaNo) {
        _rmaNo = rmaNo;
        _rmaNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for rmaNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for rmaNo. (NullAllowed)
     */
    public LikeSearchOption getRmaNoInternalLikeSearchOption() {
        return _rmaNoInternalLikeSearchOption;
    }

    /**
     * [get] refNo:likePrefix <br>
     * @return The value of refNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getRefNo() {
        return filterStringParameter(_refNo);
    }

    /**
     * [set as prefixSearch] refNo:likePrefix <br>
     * @param refNo The value of refNo. (NullAllowed)
     */
    public void setRefNo_PrefixSearch(String refNo) {
        _refNo = refNo;
        _refNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for refNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for refNo. (NullAllowed)
     */
    public LikeSearchOption getRefNoInternalLikeSearchOption() {
        return _refNoInternalLikeSearchOption;
    }

    /**
     * [get] soPalletNo:likePrefix <br>
     * @return The value of soPalletNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSoPalletNo() {
        return filterStringParameter(_soPalletNo);
    }

    /**
     * [set as prefixSearch] soPalletNo:likePrefix <br>
     * @param soPalletNo The value of soPalletNo. (NullAllowed)
     */
    public void setSoPalletNo_PrefixSearch(String soPalletNo) {
        _soPalletNo = soPalletNo;
        _soPalletNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for soPalletNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for soPalletNo. (NullAllowed)
     */
    public LikeSearchOption getSoPalletNoInternalLikeSearchOption() {
        return _soPalletNoInternalLikeSearchOption;
    }

    /**
     * [get] status <br>
     * @return The value of status. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getStatus() {
        return filterStringParameter(_status);
    }

    /**
     * [set] status <br>
     * @param status The value of status. (NullAllowed)
     */
    public void setStatus(String status) {
        _status = status;
    }

    /**
     * [get] shipToCd:likePrefix <br>
     * @return The value of shipToCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getShipToCd() {
        return filterStringParameter(_shipToCd);
    }

    /**
     * [set as prefixSearch] shipToCd:likePrefix <br>
     * @param shipToCd The value of shipToCd. (NullAllowed)
     */
    public void setShipToCd_PrefixSearch(String shipToCd) {
        _shipToCd = shipToCd;
        _shipToCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for shipToCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for shipToCd. (NullAllowed)
     */
    public LikeSearchOption getShipToCdInternalLikeSearchOption() {
        return _shipToCdInternalLikeSearchOption;
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
}
