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
 * The base class for typed parameter-bean of SqlCardboardMoveHistoryList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlCardboardMoveHistoryList</span>" on TTrsymbolBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlCardboardMoveHistoryListPmb extends SimplePagingBean implements EntityHandlingPmb<TTrsymbolBhv, SqlCardboardMoveHistoryList>, AutoPagingHandlingPmb<TTrsymbolBhv, SqlCardboardMoveHistoryList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of createDateTimeFrom. */
    protected String _createDateTimeFrom;

    /** The parameter of createDateTimeTo. */
    protected String _createDateTimeTo;

    /** The parameter of makerCaseNoFrom. */
    protected String _makerCaseNoFrom;

    /** The parameter of makerCaseNoTo. */
    protected String _makerCaseNoTo;

    /** The parameter of trsymbolId:likePrefix. */
    protected String _trsymbolId;

    /** The option of like-search for trsymbolId. */
    protected LikeSearchOption _trsymbolIdInternalLikeSearchOption;

    /** The parameter of receiveDate. */
    protected String _receiveDate;

    /** The parameter of shipDate. */
    protected String _shipDate;

    /** The parameter of ItemCd:likePrefix. */
    protected String _itemCd;

    /** The option of like-search for ItemCd. */
    protected LikeSearchOption _itemCdInternalLikeSearchOption;

    /** The parameter of lot1:likePrefix. */
    protected String _lot1;

    /** The option of like-search for lot1. */
    protected LikeSearchOption _lot1InternalLikeSearchOption;

    /** The parameter of lot4. */
    protected String _lot4;

    /** The parameter of symbolMakeNoFrom. */
    protected String _symbolMakeNoFrom;

    /** The parameter of symbolMakeNoTo. */
    protected String _symbolMakeNoTo;

    /** The parameter of lot3. */
    protected String _lot3;

    /** The parameter of caseItfNo:likePrefix. */
    protected String _caseItfNo;

    /** The option of like-search for caseItfNo. */
    protected LikeSearchOption _caseItfNoInternalLikeSearchOption;

    /** The parameter of carrierNo:likePrefix. */
    protected String _carrierNo;

    /** The option of like-search for carrierNo. */
    protected LikeSearchOption _carrierNoInternalLikeSearchOption;

    /** The parameter of centerId. */
    protected Long _centerId;

    /** The parameter of clientId. */
    protected Long _clientId;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlCardboardMoveHistoryList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlCardboardMoveHistoryList</span>" on TTrsymbolBhv.
     */
    public BsSqlCardboardMoveHistoryListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlCardboardMoveHistoryList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlCardboardMoveHistoryList> getEntityType() { return SqlCardboardMoveHistoryList.class; }

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
        sb.append(dm).append(_createDateTimeFrom);
        sb.append(dm).append(_createDateTimeTo);
        sb.append(dm).append(_makerCaseNoFrom);
        sb.append(dm).append(_makerCaseNoTo);
        sb.append(dm).append(_trsymbolId);
        sb.append(dm).append(_receiveDate);
        sb.append(dm).append(_shipDate);
        sb.append(dm).append(_itemCd);
        sb.append(dm).append(_lot1);
        sb.append(dm).append(_lot4);
        sb.append(dm).append(_symbolMakeNoFrom);
        sb.append(dm).append(_symbolMakeNoTo);
        sb.append(dm).append(_lot3);
        sb.append(dm).append(_caseItfNo);
        sb.append(dm).append(_carrierNo);
        sb.append(dm).append(_centerId);
        sb.append(dm).append(_clientId);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] createDateTimeFrom <br>
     * @return The value of createDateTimeFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCreateDateTimeFrom() {
        return filterStringParameter(_createDateTimeFrom);
    }

    /**
     * [set] createDateTimeFrom <br>
     * @param createDateTimeFrom The value of createDateTimeFrom. (NullAllowed)
     */
    public void setCreateDateTimeFrom(String createDateTimeFrom) {
        _createDateTimeFrom = createDateTimeFrom;
    }

    /**
     * [get] createDateTimeTo <br>
     * @return The value of createDateTimeTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCreateDateTimeTo() {
        return filterStringParameter(_createDateTimeTo);
    }

    /**
     * [set] createDateTimeTo <br>
     * @param createDateTimeTo The value of createDateTimeTo. (NullAllowed)
     */
    public void setCreateDateTimeTo(String createDateTimeTo) {
        _createDateTimeTo = createDateTimeTo;
    }

    /**
     * [get] makerCaseNoFrom <br>
     * @return The value of makerCaseNoFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getMakerCaseNoFrom() {
        return filterStringParameter(_makerCaseNoFrom);
    }

    /**
     * [set] makerCaseNoFrom <br>
     * @param makerCaseNoFrom The value of makerCaseNoFrom. (NullAllowed)
     */
    public void setMakerCaseNoFrom(String makerCaseNoFrom) {
        _makerCaseNoFrom = makerCaseNoFrom;
    }

    /**
     * [get] makerCaseNoTo <br>
     * @return The value of makerCaseNoTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getMakerCaseNoTo() {
        return filterStringParameter(_makerCaseNoTo);
    }

    /**
     * [set] makerCaseNoTo <br>
     * @param makerCaseNoTo The value of makerCaseNoTo. (NullAllowed)
     */
    public void setMakerCaseNoTo(String makerCaseNoTo) {
        _makerCaseNoTo = makerCaseNoTo;
    }

    /**
     * [get] trsymbolId:likePrefix <br>
     * @return The value of trsymbolId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getTrsymbolId() {
        return filterStringParameter(_trsymbolId);
    }

    /**
     * [set as prefixSearch] trsymbolId:likePrefix <br>
     * @param trsymbolId The value of trsymbolId. (NullAllowed)
     */
    public void setTrsymbolId_PrefixSearch(String trsymbolId) {
        _trsymbolId = trsymbolId;
        _trsymbolIdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for trsymbolId. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for trsymbolId. (NullAllowed)
     */
    public LikeSearchOption getTrsymbolIdInternalLikeSearchOption() {
        return _trsymbolIdInternalLikeSearchOption;
    }

    /**
     * [get] receiveDate <br>
     * @return The value of receiveDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getReceiveDate() {
        return filterStringParameter(_receiveDate);
    }

    /**
     * [set] receiveDate <br>
     * @param receiveDate The value of receiveDate. (NullAllowed)
     */
    public void setReceiveDate(String receiveDate) {
        _receiveDate = receiveDate;
    }

    /**
     * [get] shipDate <br>
     * @return The value of shipDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getShipDate() {
        return filterStringParameter(_shipDate);
    }

    /**
     * [set] shipDate <br>
     * @param shipDate The value of shipDate. (NullAllowed)
     */
    public void setShipDate(String shipDate) {
        _shipDate = shipDate;
    }

    /**
     * [get] ItemCd:likePrefix <br>
     * @return The value of ItemCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getItemCd() {
        return filterStringParameter(_itemCd);
    }

    /**
     * [set as prefixSearch] ItemCd:likePrefix <br>
     * @param itemCd The value of ItemCd. (NullAllowed)
     */
    public void setItemCd_PrefixSearch(String itemCd) {
        _itemCd = itemCd;
        _itemCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for ItemCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for ItemCd. (NullAllowed)
     */
    public LikeSearchOption getItemCdInternalLikeSearchOption() {
        return _itemCdInternalLikeSearchOption;
    }

    /**
     * [get] lot1:likePrefix <br>
     * @return The value of lot1. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getLot1() {
        return filterStringParameter(_lot1);
    }

    /**
     * [set as prefixSearch] lot1:likePrefix <br>
     * @param lot1 The value of lot1. (NullAllowed)
     */
    public void setLot1_PrefixSearch(String lot1) {
        _lot1 = lot1;
        _lot1InternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for lot1. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for lot1. (NullAllowed)
     */
    public LikeSearchOption getLot1InternalLikeSearchOption() {
        return _lot1InternalLikeSearchOption;
    }

    /**
     * [get] lot4 <br>
     * @return The value of lot4. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getLot4() {
        return filterStringParameter(_lot4);
    }

    /**
     * [set] lot4 <br>
     * @param lot4 The value of lot4. (NullAllowed)
     */
    public void setLot4(String lot4) {
        _lot4 = lot4;
    }

    /**
     * [get] symbolMakeNoFrom <br>
     * @return The value of symbolMakeNoFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSymbolMakeNoFrom() {
        return filterStringParameter(_symbolMakeNoFrom);
    }

    /**
     * [set] symbolMakeNoFrom <br>
     * @param symbolMakeNoFrom The value of symbolMakeNoFrom. (NullAllowed)
     */
    public void setSymbolMakeNoFrom(String symbolMakeNoFrom) {
        _symbolMakeNoFrom = symbolMakeNoFrom;
    }

    /**
     * [get] symbolMakeNoTo <br>
     * @return The value of symbolMakeNoTo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSymbolMakeNoTo() {
        return filterStringParameter(_symbolMakeNoTo);
    }

    /**
     * [set] symbolMakeNoTo <br>
     * @param symbolMakeNoTo The value of symbolMakeNoTo. (NullAllowed)
     */
    public void setSymbolMakeNoTo(String symbolMakeNoTo) {
        _symbolMakeNoTo = symbolMakeNoTo;
    }

    /**
     * [get] lot3 <br>
     * @return The value of lot3. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getLot3() {
        return filterStringParameter(_lot3);
    }

    /**
     * [set] lot3 <br>
     * @param lot3 The value of lot3. (NullAllowed)
     */
    public void setLot3(String lot3) {
        _lot3 = lot3;
    }

    /**
     * [get] caseItfNo:likePrefix <br>
     * @return The value of caseItfNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCaseItfNo() {
        return filterStringParameter(_caseItfNo);
    }

    /**
     * [set as prefixSearch] caseItfNo:likePrefix <br>
     * @param caseItfNo The value of caseItfNo. (NullAllowed)
     */
    public void setCaseItfNo_PrefixSearch(String caseItfNo) {
        _caseItfNo = caseItfNo;
        _caseItfNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for caseItfNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for caseItfNo. (NullAllowed)
     */
    public LikeSearchOption getCaseItfNoInternalLikeSearchOption() {
        return _caseItfNoInternalLikeSearchOption;
    }

    /**
     * [get] carrierNo:likePrefix <br>
     * @return The value of carrierNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getCarrierNo() {
        return filterStringParameter(_carrierNo);
    }

    /**
     * [set as prefixSearch] carrierNo:likePrefix <br>
     * @param carrierNo The value of carrierNo. (NullAllowed)
     */
    public void setCarrierNo_PrefixSearch(String carrierNo) {
        _carrierNo = carrierNo;
        _carrierNoInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for carrierNo. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for carrierNo. (NullAllowed)
     */
    public LikeSearchOption getCarrierNoInternalLikeSearchOption() {
        return _carrierNoInternalLikeSearchOption;
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
}
