package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of B_CULTURE_ATTRIBUTE.
 * @author DBFlute(AutoGenerator)
 */
public class BsBCultureAttributeCQ extends AbstractBsBCultureAttributeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BCultureAttributeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBCultureAttributeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from B_CULTURE_ATTRIBUTE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BCultureAttributeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BCultureAttributeCIQ xcreateCIQ() {
        BCultureAttributeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BCultureAttributeCIQ xnewCIQ() {
        return new BCultureAttributeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join B_CULTURE_ATTRIBUTE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BCultureAttributeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BCultureAttributeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _cultureId;
    public ConditionValue xdfgetCultureId()
    { if (_cultureId == null) { _cultureId = nCV(); }
      return _cultureId; }
    protected ConditionValue xgetCValueCultureId() { return xdfgetCultureId(); }

    public Map<String, BCultureCQ> getCultureId_InScopeRelation_BCulture() { return xgetSQueMap("cultureId_InScopeRelation_BCulture"); }
    public String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq) { return xkeepSQue("cultureId_InScopeRelation_BCulture", sq); }

    public Map<String, BCultureCQ> getCultureId_NotInScopeRelation_BCulture() { return xgetSQueMap("cultureId_NotInScopeRelation_BCulture"); }
    public String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq) { return xkeepSQue("cultureId_NotInScopeRelation_BCulture", sq); }

    /**
     * Add order-by as ascend. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_CultureId_Asc() { regOBA("CULTURE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19), FK to B_CULTURE}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_CultureId_Desc() { regOBD("CULTURE_ID"); return this; }

    protected ConditionValue _dateTimeFormatDisplay;
    public ConditionValue xdfgetDateTimeFormatDisplay()
    { if (_dateTimeFormatDisplay == null) { _dateTimeFormatDisplay = nCV(); }
      return _dateTimeFormatDisplay; }
    protected ConditionValue xgetCValueDateTimeFormatDisplay() { return xdfgetDateTimeFormatDisplay(); }

    /**
     * Add order-by as ascend. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateTimeFormatDisplay_Asc() { regOBA("DATE_TIME_FORMAT_DISPLAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATE_TIME_FORMAT_DISPLAY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateTimeFormatDisplay_Desc() { regOBD("DATE_TIME_FORMAT_DISPLAY"); return this; }

    protected ConditionValue _dateTimeFormatReport;
    public ConditionValue xdfgetDateTimeFormatReport()
    { if (_dateTimeFormatReport == null) { _dateTimeFormatReport = nCV(); }
      return _dateTimeFormatReport; }
    protected ConditionValue xgetCValueDateTimeFormatReport() { return xdfgetDateTimeFormatReport(); }

    /**
     * Add order-by as ascend. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateTimeFormatReport_Asc() { regOBA("DATE_TIME_FORMAT_REPORT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATE_TIME_FORMAT_REPORT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateTimeFormatReport_Desc() { regOBD("DATE_TIME_FORMAT_REPORT"); return this; }

    protected ConditionValue _dateTimeFormatExcel;
    public ConditionValue xdfgetDateTimeFormatExcel()
    { if (_dateTimeFormatExcel == null) { _dateTimeFormatExcel = nCV(); }
      return _dateTimeFormatExcel; }
    protected ConditionValue xgetCValueDateTimeFormatExcel() { return xdfgetDateTimeFormatExcel(); }

    /**
     * Add order-by as ascend. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateTimeFormatExcel_Asc() { regOBA("DATE_TIME_FORMAT_EXCEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATE_TIME_FORMAT_EXCEL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateTimeFormatExcel_Desc() { regOBD("DATE_TIME_FORMAT_EXCEL"); return this; }

    protected ConditionValue _dateTimeFormatText;
    public ConditionValue xdfgetDateTimeFormatText()
    { if (_dateTimeFormatText == null) { _dateTimeFormatText = nCV(); }
      return _dateTimeFormatText; }
    protected ConditionValue xgetCValueDateTimeFormatText() { return xdfgetDateTimeFormatText(); }

    /**
     * Add order-by as ascend. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateTimeFormatText_Asc() { regOBA("DATE_TIME_FORMAT_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATE_TIME_FORMAT_TEXT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateTimeFormatText_Desc() { regOBD("DATE_TIME_FORMAT_TEXT"); return this; }

    protected ConditionValue _dateFormatDisplay;
    public ConditionValue xdfgetDateFormatDisplay()
    { if (_dateFormatDisplay == null) { _dateFormatDisplay = nCV(); }
      return _dateFormatDisplay; }
    protected ConditionValue xgetCValueDateFormatDisplay() { return xdfgetDateFormatDisplay(); }

    /**
     * Add order-by as ascend. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateFormatDisplay_Asc() { regOBA("DATE_FORMAT_DISPLAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATE_FORMAT_DISPLAY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateFormatDisplay_Desc() { regOBD("DATE_FORMAT_DISPLAY"); return this; }

    protected ConditionValue _dateFormatReport;
    public ConditionValue xdfgetDateFormatReport()
    { if (_dateFormatReport == null) { _dateFormatReport = nCV(); }
      return _dateFormatReport; }
    protected ConditionValue xgetCValueDateFormatReport() { return xdfgetDateFormatReport(); }

    /**
     * Add order-by as ascend. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateFormatReport_Asc() { regOBA("DATE_FORMAT_REPORT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATE_FORMAT_REPORT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateFormatReport_Desc() { regOBD("DATE_FORMAT_REPORT"); return this; }

    protected ConditionValue _dateFormatExcel;
    public ConditionValue xdfgetDateFormatExcel()
    { if (_dateFormatExcel == null) { _dateFormatExcel = nCV(); }
      return _dateFormatExcel; }
    protected ConditionValue xgetCValueDateFormatExcel() { return xdfgetDateFormatExcel(); }

    /**
     * Add order-by as ascend. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateFormatExcel_Asc() { regOBA("DATE_FORMAT_EXCEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATE_FORMAT_EXCEL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateFormatExcel_Desc() { regOBD("DATE_FORMAT_EXCEL"); return this; }

    protected ConditionValue _dateFormatText;
    public ConditionValue xdfgetDateFormatText()
    { if (_dateFormatText == null) { _dateFormatText = nCV(); }
      return _dateFormatText; }
    protected ConditionValue xgetCValueDateFormatText() { return xdfgetDateFormatText(); }

    /**
     * Add order-by as ascend. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateFormatText_Asc() { regOBA("DATE_FORMAT_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATE_FORMAT_TEXT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DateFormatText_Desc() { regOBD("DATE_FORMAT_TEXT"); return this; }

    protected ConditionValue _timeFormatDisplay;
    public ConditionValue xdfgetTimeFormatDisplay()
    { if (_timeFormatDisplay == null) { _timeFormatDisplay = nCV(); }
      return _timeFormatDisplay; }
    protected ConditionValue xgetCValueTimeFormatDisplay() { return xdfgetTimeFormatDisplay(); }

    /**
     * Add order-by as ascend. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_TimeFormatDisplay_Asc() { regOBA("TIME_FORMAT_DISPLAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * TIME_FORMAT_DISPLAY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_TimeFormatDisplay_Desc() { regOBD("TIME_FORMAT_DISPLAY"); return this; }

    protected ConditionValue _timeFormatReport;
    public ConditionValue xdfgetTimeFormatReport()
    { if (_timeFormatReport == null) { _timeFormatReport = nCV(); }
      return _timeFormatReport; }
    protected ConditionValue xgetCValueTimeFormatReport() { return xdfgetTimeFormatReport(); }

    /**
     * Add order-by as ascend. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_TimeFormatReport_Asc() { regOBA("TIME_FORMAT_REPORT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TIME_FORMAT_REPORT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_TimeFormatReport_Desc() { regOBD("TIME_FORMAT_REPORT"); return this; }

    protected ConditionValue _timeFormatExcel;
    public ConditionValue xdfgetTimeFormatExcel()
    { if (_timeFormatExcel == null) { _timeFormatExcel = nCV(); }
      return _timeFormatExcel; }
    protected ConditionValue xgetCValueTimeFormatExcel() { return xdfgetTimeFormatExcel(); }

    /**
     * Add order-by as ascend. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_TimeFormatExcel_Asc() { regOBA("TIME_FORMAT_EXCEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TIME_FORMAT_EXCEL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_TimeFormatExcel_Desc() { regOBD("TIME_FORMAT_EXCEL"); return this; }

    protected ConditionValue _timeFormatText;
    public ConditionValue xdfgetTimeFormatText()
    { if (_timeFormatText == null) { _timeFormatText = nCV(); }
      return _timeFormatText; }
    protected ConditionValue xgetCValueTimeFormatText() { return xdfgetTimeFormatText(); }

    /**
     * Add order-by as ascend. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_TimeFormatText_Asc() { regOBA("TIME_FORMAT_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TIME_FORMAT_TEXT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_TimeFormatText_Desc() { regOBD("TIME_FORMAT_TEXT"); return this; }

    protected ConditionValue _numberFormatDisplay;
    public ConditionValue xdfgetNumberFormatDisplay()
    { if (_numberFormatDisplay == null) { _numberFormatDisplay = nCV(); }
      return _numberFormatDisplay; }
    protected ConditionValue xgetCValueNumberFormatDisplay() { return xdfgetNumberFormatDisplay(); }

    /**
     * Add order-by as ascend. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_NumberFormatDisplay_Asc() { regOBA("NUMBER_FORMAT_DISPLAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUMBER_FORMAT_DISPLAY: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_NumberFormatDisplay_Desc() { regOBD("NUMBER_FORMAT_DISPLAY"); return this; }

    protected ConditionValue _numberFormatReport;
    public ConditionValue xdfgetNumberFormatReport()
    { if (_numberFormatReport == null) { _numberFormatReport = nCV(); }
      return _numberFormatReport; }
    protected ConditionValue xgetCValueNumberFormatReport() { return xdfgetNumberFormatReport(); }

    /**
     * Add order-by as ascend. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_NumberFormatReport_Asc() { regOBA("NUMBER_FORMAT_REPORT"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUMBER_FORMAT_REPORT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_NumberFormatReport_Desc() { regOBD("NUMBER_FORMAT_REPORT"); return this; }

    protected ConditionValue _numberFormatExcel;
    public ConditionValue xdfgetNumberFormatExcel()
    { if (_numberFormatExcel == null) { _numberFormatExcel = nCV(); }
      return _numberFormatExcel; }
    protected ConditionValue xgetCValueNumberFormatExcel() { return xdfgetNumberFormatExcel(); }

    /**
     * Add order-by as ascend. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_NumberFormatExcel_Asc() { regOBA("NUMBER_FORMAT_EXCEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUMBER_FORMAT_EXCEL: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_NumberFormatExcel_Desc() { regOBD("NUMBER_FORMAT_EXCEL"); return this; }

    protected ConditionValue _numberFormatText;
    public ConditionValue xdfgetNumberFormatText()
    { if (_numberFormatText == null) { _numberFormatText = nCV(); }
      return _numberFormatText; }
    protected ConditionValue xgetCValueNumberFormatText() { return xdfgetNumberFormatText(); }

    /**
     * Add order-by as ascend. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_NumberFormatText_Asc() { regOBA("NUMBER_FORMAT_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUMBER_FORMAT_TEXT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_NumberFormatText_Desc() { regOBD("NUMBER_FORMAT_TEXT"); return this; }

    protected ConditionValue _currencyFormatReport;
    public ConditionValue xdfgetCurrencyFormatReport()
    { if (_currencyFormatReport == null) { _currencyFormatReport = nCV(); }
      return _currencyFormatReport; }
    protected ConditionValue xgetCValueCurrencyFormatReport() { return xdfgetCurrencyFormatReport(); }

    /**
     * Add order-by as ascend. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_CurrencyFormatReport_Asc() { regOBA("CURRENCY_FORMAT_REPORT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CURRENCY_FORMAT_REPORT: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_CurrencyFormatReport_Desc() { regOBD("CURRENCY_FORMAT_REPORT"); return this; }

    protected ConditionValue _fontNameExcel;
    public ConditionValue xdfgetFontNameExcel()
    { if (_fontNameExcel == null) { _fontNameExcel = nCV(); }
      return _fontNameExcel; }
    protected ConditionValue xgetCValueFontNameExcel() { return xdfgetFontNameExcel(); }

    /**
     * Add order-by as ascend. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_FontNameExcel_Asc() { regOBA("FONT_NAME_EXCEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * FONT_NAME_EXCEL: {varchar(60)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_FontNameExcel_Desc() { regOBD("FONT_NAME_EXCEL"); return this; }

    protected ConditionValue _fontSizeExcel;
    public ConditionValue xdfgetFontSizeExcel()
    { if (_fontSizeExcel == null) { _fontSizeExcel = nCV(); }
      return _fontSizeExcel; }
    protected ConditionValue xgetCValueFontSizeExcel() { return xdfgetFontSizeExcel(); }

    /**
     * Add order-by as ascend. <br>
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_FontSizeExcel_Asc() { regOBA("FONT_SIZE_EXCEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * FONT_SIZE_EXCEL: {decimal(16, 6)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_FontSizeExcel_Desc() { regOBD("FONT_SIZE_EXCEL"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsBCultureAttributeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BCultureAttributeCQ bq = (BCultureAttributeCQ)bqs;
        BCultureAttributeCQ uq = (BCultureAttributeCQ)uqs;
        if (bq.hasConditionQueryBCulture()) {
            uq.queryBCulture().reflectRelationOnUnionQuery(bq.queryBCulture(), uq.queryBCulture());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @return The instance of condition-query. (NotNull)
     */
    public BCultureCQ queryBCulture() {
        return xdfgetConditionQueryBCulture();
    }
    public BCultureCQ xdfgetConditionQueryBCulture() {
        String prop = "bCulture";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBCulture()); xsetupOuterJoinBCulture(); }
        return xgetQueRlMap(prop);
    }
    protected BCultureCQ xcreateQueryBCulture() {
        String nrp = xresolveNRP("B_CULTURE_ATTRIBUTE", "bCulture"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BCultureCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bCulture", nrp);
    }
    protected void xsetupOuterJoinBCulture() { xregOutJo("bCulture"); }
    public boolean hasConditionQueryBCulture() { return xhasQueRlMap("bCulture"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BCultureAttributeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BCultureAttributeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BCultureAttributeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BCultureAttributeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BCultureAttributeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BCultureAttributeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BCultureAttributeCQ> _myselfExistsMap;
    public Map<String, BCultureAttributeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BCultureAttributeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BCultureAttributeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BCultureAttributeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BCultureAttributeCB.class.getName(); }
    protected String xCQ() { return BCultureAttributeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
