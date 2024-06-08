package com.oneslogi.base.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.paging.SimplePagingBean;
import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of SqlTTrassortorderCorrectList. <br>
 * This is related to "<span style="color: #AD4747">selectSqlTTrassortorderCorrectList</span>" on TTrassortorderBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSqlTTrassortorderCorrectListPmb extends SimplePagingBean implements EntityHandlingPmb<TTrassortorderBhv, SqlTTrassortorderCorrectList>, AutoPagingHandlingPmb<TTrassortorderBhv, SqlTTrassortorderCorrectList>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of warehouseCd. */
    protected String _warehouseCd;

    /** The parameter of putdmyDirectionNoList. */
    protected List<String> _putdmyDirectionNoList;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SqlTTrassortorderCorrectList. <br>
     * This is related to "<span style="color: #AD4747">selectSqlTTrassortorderCorrectList</span>" on TTrassortorderBhv.
     */
    public BsSqlTTrassortorderCorrectListPmb() {
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
    public String getOutsideSqlPath() { return "selectSqlTTrassortorderCorrectList"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SqlTTrassortorderCorrectList> getEntityType() { return SqlTTrassortorderCorrectList.class; }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }

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
        sb.append(dm).append(_warehouseCd);
        sb.append(dm).append(_putdmyDirectionNoList);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] warehouseCd <br>
     * @return The value of warehouseCd. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getWarehouseCd() {
        return filterStringParameter(_warehouseCd);
    }

    /**
     * [set] warehouseCd <br>
     * @param warehouseCd The value of warehouseCd. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] putdmyDirectionNoList <br>
     * @return The value of putdmyDirectionNoList. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<String> getPutdmyDirectionNoList() {
        return _putdmyDirectionNoList;
    }

    /**
     * [set] putdmyDirectionNoList <br>
     * @param putdmyDirectionNoList The value of putdmyDirectionNoList. (NullAllowed)
     */
    public void setPutdmyDirectionNoList(List<String> putdmyDirectionNoList) {
        _putdmyDirectionNoList = putdmyDirectionNoList;
    }
}
