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
 * The base class for typed parameter-bean of SqlBoxMaster. <br>
 * This is related to "<span style="color: #AD4747">selectSqlBoxMaster</span>" on MBoxBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlBoxMasterPmb extends SimplePagingBean implements EntityHandlingPmb<MBoxBhv, SqlBoxMaster>, AutoPagingHandlingPmb<MBoxBhv, SqlBoxMaster>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of boxCd:likePrefix. */
    protected String _boxCd;

    /** The option of like-search for boxCd. */
    protected LikeSearchOption _boxCdInternalLikeSearchOption;

    /** The parameter of boxNm:likePrefix. */
    protected String _boxNm;

    /** The option of like-search for boxNm. */
    protected LikeSearchOption _boxNmInternalLikeSearchOption;

    /** The parameter of boxType. */
    protected String _boxType;

    /** The parameter of delFlg. */
    protected String _delFlg;

    /** The parameter of centerId. */
    protected Long _centerId;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlBoxMaster. <br>
     * This is related to "<span style="color: #AD4747">selectSqlBoxMaster</span>" on MBoxBhv.
     */
    public BsSqlBoxMasterPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlBoxMaster"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlBoxMaster> getEntityType() { return SqlBoxMaster.class; }

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
        sb.append(dm).append(_boxCd);
        sb.append(dm).append(_boxNm);
        sb.append(dm).append(_boxType);
        sb.append(dm).append(_delFlg);
        sb.append(dm).append(_centerId);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] boxCd:likePrefix <br>
     * @return The value of boxCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getBoxCd() {
        return filterStringParameter(_boxCd);
    }

    /**
     * [set as prefixSearch] boxCd:likePrefix <br>
     * @param boxCd The value of boxCd. (NullAllowed)
     */
    public void setBoxCd_PrefixSearch(String boxCd) {
        _boxCd = boxCd;
        _boxCdInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for boxCd. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for boxCd. (NullAllowed)
     */
    public LikeSearchOption getBoxCdInternalLikeSearchOption() {
        return _boxCdInternalLikeSearchOption;
    }

    /**
     * [get] boxNm:likePrefix <br>
     * @return The value of boxNm. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getBoxNm() {
        return filterStringParameter(_boxNm);
    }

    /**
     * [set as prefixSearch] boxNm:likePrefix <br>
     * @param boxNm The value of boxNm. (NullAllowed)
     */
    public void setBoxNm_PrefixSearch(String boxNm) {
        _boxNm = boxNm;
        _boxNmInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for boxNm. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for boxNm. (NullAllowed)
     */
    public LikeSearchOption getBoxNmInternalLikeSearchOption() {
        return _boxNmInternalLikeSearchOption;
    }

    /**
     * [get] boxType <br>
     * @return The value of boxType. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getBoxType() {
        return filterStringParameter(_boxType);
    }

    /**
     * [set] boxType <br>
     * @param boxType The value of boxType. (NullAllowed)
     */
    public void setBoxType(String boxType) {
        _boxType = boxType;
    }

    /**
     * [get] delFlg <br>
     * @return The value of delFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getDelFlg() {
        return filterStringParameter(_delFlg);
    }

    /**
     * [set] delFlg <br>
     * @param delFlg The value of delFlg. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        _delFlg = delFlg;
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
}
