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
 * The base condition-query of M_IMPORT_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class BsMImportTypeCQ extends AbstractBsMImportTypeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MImportTypeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMImportTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from M_IMPORT_TYPE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MImportTypeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MImportTypeCIQ xcreateCIQ() {
        MImportTypeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MImportTypeCIQ xnewCIQ() {
        return new MImportTypeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join M_IMPORT_TYPE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MImportTypeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MImportTypeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _importTypeId;
    public ConditionValue xdfgetImportTypeId()
    { if (_importTypeId == null) { _importTypeId = nCV(); }
      return _importTypeId; }
    protected ConditionValue xgetCValueImportTypeId() { return xdfgetImportTypeId(); }

    public Map<String, MImportTypeBCQ> xdfgetImportTypeId_ExistsReferrer_MImportTypeBList() { return xgetSQueMap("importTypeId_ExistsReferrer_MImportTypeBList"); }
    public String keepImportTypeId_ExistsReferrer_MImportTypeBList(MImportTypeBCQ sq) { return xkeepSQue("importTypeId_ExistsReferrer_MImportTypeBList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetImportTypeId_ExistsReferrer_TEcOrderHList() { return xgetSQueMap("importTypeId_ExistsReferrer_TEcOrderHList"); }
    public String keepImportTypeId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("importTypeId_ExistsReferrer_TEcOrderHList", sq); }

    public Map<String, MImportTypeBCQ> xdfgetImportTypeId_NotExistsReferrer_MImportTypeBList() { return xgetSQueMap("importTypeId_NotExistsReferrer_MImportTypeBList"); }
    public String keepImportTypeId_NotExistsReferrer_MImportTypeBList(MImportTypeBCQ sq) { return xkeepSQue("importTypeId_NotExistsReferrer_MImportTypeBList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetImportTypeId_NotExistsReferrer_TEcOrderHList() { return xgetSQueMap("importTypeId_NotExistsReferrer_TEcOrderHList"); }
    public String keepImportTypeId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("importTypeId_NotExistsReferrer_TEcOrderHList", sq); }

    public Map<String, MImportTypeBCQ> xdfgetImportTypeId_SpecifyDerivedReferrer_MImportTypeBList() { return xgetSQueMap("importTypeId_SpecifyDerivedReferrer_MImportTypeBList"); }
    public String keepImportTypeId_SpecifyDerivedReferrer_MImportTypeBList(MImportTypeBCQ sq) { return xkeepSQue("importTypeId_SpecifyDerivedReferrer_MImportTypeBList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetImportTypeId_SpecifyDerivedReferrer_TEcOrderHList() { return xgetSQueMap("importTypeId_SpecifyDerivedReferrer_TEcOrderHList"); }
    public String keepImportTypeId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("importTypeId_SpecifyDerivedReferrer_TEcOrderHList", sq); }

    public Map<String, MImportTypeBCQ> xdfgetImportTypeId_QueryDerivedReferrer_MImportTypeBList() { return xgetSQueMap("importTypeId_QueryDerivedReferrer_MImportTypeBList"); }
    public String keepImportTypeId_QueryDerivedReferrer_MImportTypeBList(MImportTypeBCQ sq) { return xkeepSQue("importTypeId_QueryDerivedReferrer_MImportTypeBList", sq); }
    public Map<String, Object> xdfgetImportTypeId_QueryDerivedReferrer_MImportTypeBListParameter() { return xgetSQuePmMap("importTypeId_QueryDerivedReferrer_MImportTypeBList"); }
    public String keepImportTypeId_QueryDerivedReferrer_MImportTypeBListParameter(Object pm) { return xkeepSQuePm("importTypeId_QueryDerivedReferrer_MImportTypeBList", pm); }

    public Map<String, TEcOrderHCQ> xdfgetImportTypeId_QueryDerivedReferrer_TEcOrderHList() { return xgetSQueMap("importTypeId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepImportTypeId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("importTypeId_QueryDerivedReferrer_TEcOrderHList", sq); }
    public Map<String, Object> xdfgetImportTypeId_QueryDerivedReferrer_TEcOrderHListParameter() { return xgetSQuePmMap("importTypeId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepImportTypeId_QueryDerivedReferrer_TEcOrderHListParameter(Object pm) { return xkeepSQuePm("importTypeId_QueryDerivedReferrer_TEcOrderHList", pm); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_ImportTypeId_Asc() { regOBA("IMPORT_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_ImportTypeId_Desc() { regOBD("IMPORT_TYPE_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _importTypeCd;
    public ConditionValue xdfgetImportTypeCd()
    { if (_importTypeCd == null) { _importTypeCd = nCV(); }
      return _importTypeCd; }
    protected ConditionValue xgetCValueImportTypeCd() { return xdfgetImportTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_ImportTypeCd_Asc() { regOBA("IMPORT_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_ImportTypeCd_Desc() { regOBD("IMPORT_TYPE_CD"); return this; }

    protected ConditionValue _importTypeNm;
    public ConditionValue xdfgetImportTypeNm()
    { if (_importTypeNm == null) { _importTypeNm = nCV(); }
      return _importTypeNm; }
    protected ConditionValue xgetCValueImportTypeNm() { return xdfgetImportTypeNm(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_TYPE_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_ImportTypeNm_Asc() { regOBA("IMPORT_TYPE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_TYPE_NM: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_ImportTypeNm_Desc() { regOBD("IMPORT_TYPE_NM"); return this; }

    protected ConditionValue _ediId;
    public ConditionValue xdfgetEdiId()
    { if (_ediId == null) { _ediId = nCV(); }
      return _ediId; }
    protected ConditionValue xgetCValueEdiId() { return xdfgetEdiId(); }

    public Map<String, MEdiCQ> getEdiId_InScopeRelation_MEdi() { return xgetSQueMap("ediId_InScopeRelation_MEdi"); }
    public String keepEdiId_InScopeRelation_MEdi(MEdiCQ sq) { return xkeepSQue("ediId_InScopeRelation_MEdi", sq); }

    public Map<String, MEdiCQ> getEdiId_NotInScopeRelation_MEdi() { return xgetSQueMap("ediId_NotInScopeRelation_MEdi"); }
    public String keepEdiId_NotInScopeRelation_MEdi(MEdiCQ sq) { return xkeepSQue("ediId_NotInScopeRelation_MEdi", sq); }

    /**
     * Add order-by as ascend. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_EdiId_Asc() { regOBA("EDI_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_EdiId_Desc() { regOBD("EDI_ID"); return this; }

    protected ConditionValue _characterCd;
    public ConditionValue xdfgetCharacterCd()
    { if (_characterCd == null) { _characterCd = nCV(); }
      return _characterCd; }
    protected ConditionValue xgetCValueCharacterCd() { return xdfgetCharacterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CHARACTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_CharacterCd_Asc() { regOBA("CHARACTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER_CD: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_CharacterCd_Desc() { regOBD("CHARACTER_CD"); return this; }

    protected ConditionValue _lineFeedCd;
    public ConditionValue xdfgetLineFeedCd()
    { if (_lineFeedCd == null) { _lineFeedCd = nCV(); }
      return _lineFeedCd; }
    protected ConditionValue xgetCValueLineFeedCd() { return xdfgetLineFeedCd(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_LineFeedCd_Asc() { regOBA("LINE_FEED_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_LineFeedCd_Desc() { regOBD("LINE_FEED_CD"); return this; }

    protected ConditionValue _delimiter;
    public ConditionValue xdfgetDelimiter()
    { if (_delimiter == null) { _delimiter = nCV(); }
      return _delimiter; }
    protected ConditionValue xgetCValueDelimiter() { return xdfgetDelimiter(); }

    /**
     * Add order-by as ascend. <br>
     * DELIMITER: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_Delimiter_Asc() { regOBA("DELIMITER"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIMITER: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_Delimiter_Desc() { regOBD("DELIMITER"); return this; }

    protected ConditionValue _skippingRows;
    public ConditionValue xdfgetSkippingRows()
    { if (_skippingRows == null) { _skippingRows = nCV(); }
      return _skippingRows; }
    protected ConditionValue xgetCValueSkippingRows() { return xdfgetSkippingRows(); }

    /**
     * Add order-by as ascend. <br>
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_SkippingRows_Asc() { regOBA("SKIPPING_ROWS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_SkippingRows_Desc() { regOBD("SKIPPING_ROWS"); return this; }

    protected ConditionValue _uploadTableNm;
    public ConditionValue xdfgetUploadTableNm()
    { if (_uploadTableNm == null) { _uploadTableNm = nCV(); }
      return _uploadTableNm; }
    protected ConditionValue xgetCValueUploadTableNm() { return xdfgetUploadTableNm(); }

    /**
     * Add order-by as ascend. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_UploadTableNm_Asc() { regOBA("UPLOAD_TABLE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_UploadTableNm_Desc() { regOBD("UPLOAD_TABLE_NM"); return this; }

    protected ConditionValue _duplicateColumnNm;
    public ConditionValue xdfgetDuplicateColumnNm()
    { if (_duplicateColumnNm == null) { _duplicateColumnNm = nCV(); }
      return _duplicateColumnNm; }
    protected ConditionValue xgetCValueDuplicateColumnNm() { return xdfgetDuplicateColumnNm(); }

    /**
     * Add order-by as ascend. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_DuplicateColumnNm_Asc() { regOBA("DUPLICATE_COLUMN_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_DuplicateColumnNm_Desc() { regOBD("DUPLICATE_COLUMN_NM"); return this; }

    protected ConditionValue _rcvIdColumnNm;
    public ConditionValue xdfgetRcvIdColumnNm()
    { if (_rcvIdColumnNm == null) { _rcvIdColumnNm = nCV(); }
      return _rcvIdColumnNm; }
    protected ConditionValue xgetCValueRcvIdColumnNm() { return xdfgetRcvIdColumnNm(); }

    /**
     * Add order-by as ascend. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_RcvIdColumnNm_Asc() { regOBA("RCV_ID_COLUMN_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_ID_COLUMN_NM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_RcvIdColumnNm_Desc() { regOBD("RCV_ID_COLUMN_NM"); return this; }

    protected ConditionValue _rowNoColumnNm;
    public ConditionValue xdfgetRowNoColumnNm()
    { if (_rowNoColumnNm == null) { _rowNoColumnNm = nCV(); }
      return _rowNoColumnNm; }
    protected ConditionValue xgetCValueRowNoColumnNm() { return xdfgetRowNoColumnNm(); }

    /**
     * Add order-by as ascend. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_RowNoColumnNm_Asc() { regOBA("ROW_NO_COLUMN_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROW_NO_COLUMN_NM: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_RowNoColumnNm_Desc() { regOBD("ROW_NO_COLUMN_NM"); return this; }

    protected ConditionValue _giftStatementType;
    public ConditionValue xdfgetGiftStatementType()
    { if (_giftStatementType == null) { _giftStatementType = nCV(); }
      return _giftStatementType; }
    protected ConditionValue xgetCValueGiftStatementType() { return xdfgetGiftStatementType(); }

    /**
     * Add order-by as ascend. <br>
     * GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_GiftStatementType_Asc() { regOBA("GIFT_STATEMENT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_GiftStatementType_Desc() { regOBD("GIFT_STATEMENT_TYPE"); return this; }

    protected ConditionValue _giftStatementDetail;
    public ConditionValue xdfgetGiftStatementDetail()
    { if (_giftStatementDetail == null) { _giftStatementDetail = nCV(); }
      return _giftStatementDetail; }
    protected ConditionValue xgetCValueGiftStatementDetail() { return xdfgetGiftStatementDetail(); }

    /**
     * Add order-by as ascend. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_GiftStatementDetail_Asc() { regOBA("GIFT_STATEMENT_DETAIL"); return this; }

    /**
     * Add order-by as descend. <br>
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_GiftStatementDetail_Desc() { regOBD("GIFT_STATEMENT_DETAIL"); return this; }

    protected ConditionValue _oKeepingDays;
    public ConditionValue xdfgetOKeepingDays()
    { if (_oKeepingDays == null) { _oKeepingDays = nCV(); }
      return _oKeepingDays; }
    protected ConditionValue xgetCValueOKeepingDays() { return xdfgetOKeepingDays(); }

    /**
     * Add order-by as ascend. <br>
     * O_KEEPING_DAYS: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_OKeepingDays_Asc() { regOBA("O_KEEPING_DAYS"); return this; }

    /**
     * Add order-by as descend. <br>
     * O_KEEPING_DAYS: {NotNull, bigint(19)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_OKeepingDays_Desc() { regOBD("O_KEEPING_DAYS"); return this; }

    protected ConditionValue _statementTitle;
    public ConditionValue xdfgetStatementTitle()
    { if (_statementTitle == null) { _statementTitle = nCV(); }
      return _statementTitle; }
    protected ConditionValue xgetCValueStatementTitle() { return xdfgetStatementTitle(); }

    /**
     * Add order-by as ascend. <br>
     * STATEMENT_TITLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_StatementTitle_Asc() { regOBA("STATEMENT_TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * STATEMENT_TITLE: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_StatementTitle_Desc() { regOBD("STATEMENT_TITLE"); return this; }

    protected ConditionValue _statementUrl;
    public ConditionValue xdfgetStatementUrl()
    { if (_statementUrl == null) { _statementUrl = nCV(); }
      return _statementUrl; }
    protected ConditionValue xgetCValueStatementUrl() { return xdfgetStatementUrl(); }

    /**
     * Add order-by as ascend. <br>
     * STATEMENT_URL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_StatementUrl_Asc() { regOBA("STATEMENT_URL"); return this; }

    /**
     * Add order-by as descend. <br>
     * STATEMENT_URL: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_StatementUrl_Desc() { regOBD("STATEMENT_URL"); return this; }

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
    public BsMImportTypeCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMImportTypeCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMImportTypeCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {bigint(19)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMImportTypeCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMImportTypeCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMImportTypeCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMImportTypeCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMImportTypeCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {varchar(255)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMImportTypeCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @return this. (NotNull)
     */
    public BsMImportTypeCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMImportTypeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMImportTypeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MImportTypeCQ bq = (MImportTypeCQ)bqs;
        MImportTypeCQ uq = (MImportTypeCQ)uqs;
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMEdi()) {
            uq.queryMEdi().reflectRelationOnUnionQuery(bq.queryMEdi(), uq.queryMEdi());
        }
        if (bq.hasConditionQueryBClassDtlByGiftStatementType()) {
            uq.queryBClassDtlByGiftStatementType().reflectRelationOnUnionQuery(bq.queryBClassDtlByGiftStatementType(), uq.queryBClassDtlByGiftStatementType());
        }
        if (bq.hasConditionQueryBClassDtlByLineFeedCd()) {
            uq.queryBClassDtlByLineFeedCd().reflectRelationOnUnionQuery(bq.queryBClassDtlByLineFeedCd(), uq.queryBClassDtlByLineFeedCd());
        }
        if (bq.hasConditionQueryBClassDtlByUploadTableNm()) {
            uq.queryBClassDtlByUploadTableNm().reflectRelationOnUnionQuery(bq.queryBClassDtlByUploadTableNm(), uq.queryBClassDtlByUploadTableNm());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("M_IMPORT_TYPE", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * M_EDI by my EDI_ID, named 'MEdi'.
     * @return The instance of condition-query. (NotNull)
     */
    public MEdiCQ queryMEdi() {
        return xdfgetConditionQueryMEdi();
    }
    public MEdiCQ xdfgetConditionQueryMEdi() {
        String prop = "mEdi";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMEdi()); xsetupOuterJoinMEdi(); }
        return xgetQueRlMap(prop);
    }
    protected MEdiCQ xcreateQueryMEdi() {
        String nrp = xresolveNRP("M_IMPORT_TYPE", "mEdi"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MEdiCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mEdi", nrp);
    }
    protected void xsetupOuterJoinMEdi() { xregOutJo("mEdi"); }
    public boolean hasConditionQueryMEdi() { return xhasQueRlMap("mEdi"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my GIFT_STATEMENT_TYPE, named 'BClassDtlByGiftStatementType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByGiftStatementType() {
        return xdfgetConditionQueryBClassDtlByGiftStatementType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByGiftStatementType() {
        String prop = "bClassDtlByGiftStatementType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByGiftStatementType()); xsetupOuterJoinBClassDtlByGiftStatementType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByGiftStatementType() {
        String nrp = xresolveNRP("M_IMPORT_TYPE", "bClassDtlByGiftStatementType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByGiftStatementType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByGiftStatementType() { xregOutJo("bClassDtlByGiftStatementType"); }
    public boolean hasConditionQueryBClassDtlByGiftStatementType() { return xhasQueRlMap("bClassDtlByGiftStatementType"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my LINE_FEED_CD, named 'BClassDtlByLineFeedCd'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLineFeedCd() {
        return xdfgetConditionQueryBClassDtlByLineFeedCd();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLineFeedCd() {
        String prop = "bClassDtlByLineFeedCd";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLineFeedCd()); xsetupOuterJoinBClassDtlByLineFeedCd(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLineFeedCd() {
        String nrp = xresolveNRP("M_IMPORT_TYPE", "bClassDtlByLineFeedCd"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLineFeedCd", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLineFeedCd() { xregOutJo("bClassDtlByLineFeedCd"); }
    public boolean hasConditionQueryBClassDtlByLineFeedCd() { return xhasQueRlMap("bClassDtlByLineFeedCd"); }

    /**
     * Get the condition-query for relation table. <br>
     * B_CLASS_DTL by my UPLOAD_TABLE_NM, named 'BClassDtlByUploadTableNm'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByUploadTableNm() {
        return xdfgetConditionQueryBClassDtlByUploadTableNm();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByUploadTableNm() {
        String prop = "bClassDtlByUploadTableNm";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByUploadTableNm()); xsetupOuterJoinBClassDtlByUploadTableNm(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByUploadTableNm() {
        String nrp = xresolveNRP("M_IMPORT_TYPE", "bClassDtlByUploadTableNm"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByUploadTableNm", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByUploadTableNm() { xregOutJo("bClassDtlByUploadTableNm"); }
    public boolean hasConditionQueryBClassDtlByUploadTableNm() { return xhasQueRlMap("bClassDtlByUploadTableNm"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MImportTypeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MImportTypeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MImportTypeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MImportTypeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MImportTypeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MImportTypeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MImportTypeCQ> _myselfExistsMap;
    public Map<String, MImportTypeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MImportTypeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MImportTypeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MImportTypeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MImportTypeCB.class.getName(); }
    protected String xCQ() { return MImportTypeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
