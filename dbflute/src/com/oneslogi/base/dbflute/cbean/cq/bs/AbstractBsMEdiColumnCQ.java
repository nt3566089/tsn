package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of M_EDI_COLUMN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMEdiColumnCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMEdiColumnCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "M_EDI_COLUMN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ediColumnId The value of ediColumnId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiColumnId_Equal(Long ediColumnId) {
        doSetEdiColumnId_Equal(ediColumnId);
    }

    protected void doSetEdiColumnId_Equal(Long ediColumnId) {
        regEdiColumnId(CK_EQ, ediColumnId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ediColumnId The value of ediColumnId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiColumnId_NotEqual(Long ediColumnId) {
        doSetEdiColumnId_NotEqual(ediColumnId);
    }

    protected void doSetEdiColumnId_NotEqual(Long ediColumnId) {
        regEdiColumnId(CK_NES, ediColumnId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ediColumnId The value of ediColumnId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiColumnId_GreaterThan(Long ediColumnId) {
        regEdiColumnId(CK_GT, ediColumnId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ediColumnId The value of ediColumnId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiColumnId_LessThan(Long ediColumnId) {
        regEdiColumnId(CK_LT, ediColumnId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ediColumnId The value of ediColumnId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiColumnId_GreaterEqual(Long ediColumnId) {
        regEdiColumnId(CK_GE, ediColumnId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ediColumnId The value of ediColumnId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiColumnId_LessEqual(Long ediColumnId) {
        regEdiColumnId(CK_LE, ediColumnId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of ediColumnId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ediColumnId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEdiColumnId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEdiColumnId(), "EDI_COLUMN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ediColumnIdList The collection of ediColumnId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiColumnId_InScope(Collection<Long> ediColumnIdList) {
        doSetEdiColumnId_InScope(ediColumnIdList);
    }

    protected void doSetEdiColumnId_InScope(Collection<Long> ediColumnIdList) {
        regINS(CK_INS, cTL(ediColumnIdList), xgetCValueEdiColumnId(), "EDI_COLUMN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param ediColumnIdList The collection of ediColumnId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiColumnId_NotInScope(Collection<Long> ediColumnIdList) {
        doSetEdiColumnId_NotInScope(ediColumnIdList);
    }

    protected void doSetEdiColumnId_NotInScope(Collection<Long> ediColumnIdList) {
        regINS(CK_NINS, cTL(ediColumnIdList), xgetCValueEdiColumnId(), "EDI_COLUMN_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select EDI_COLUMN_ID from M_IMPORT_TYPE_B where ...)} <br>
     * M_IMPORT_TYPE_B by EDI_COLUMN_ID, named 'MImportTypeBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMImportTypeBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MImportTypeBList for 'exists'. (NotNull)
     */
    public void existsMImportTypeBList(SubQuery<MImportTypeBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeBCB cb = new MImportTypeBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEdiColumnId_ExistsReferrer_MImportTypeBList(cb.query());
        registerExistsReferrer(cb.query(), "EDI_COLUMN_ID", "EDI_COLUMN_ID", pp, "mImportTypeBList");
    }
    public abstract String keepEdiColumnId_ExistsReferrer_MImportTypeBList(MImportTypeBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select EDI_COLUMN_ID from M_IMPORT_TYPE_B where ...)} <br>
     * M_IMPORT_TYPE_B by EDI_COLUMN_ID, named 'MImportTypeBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMImportTypeBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of EdiColumnId_NotExistsReferrer_MImportTypeBList for 'not exists'. (NotNull)
     */
    public void notExistsMImportTypeBList(SubQuery<MImportTypeBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeBCB cb = new MImportTypeBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEdiColumnId_NotExistsReferrer_MImportTypeBList(cb.query());
        registerNotExistsReferrer(cb.query(), "EDI_COLUMN_ID", "EDI_COLUMN_ID", pp, "mImportTypeBList");
    }
    public abstract String keepEdiColumnId_NotExistsReferrer_MImportTypeBList(MImportTypeBCQ sq);

    public void xsderiveMImportTypeBList(String fn, SubQuery<MImportTypeBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCB cb = new MImportTypeBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepEdiColumnId_SpecifyDerivedReferrer_MImportTypeBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "EDI_COLUMN_ID", "EDI_COLUMN_ID", pp, "mImportTypeBList", al, op);
    }
    public abstract String keepEdiColumnId_SpecifyDerivedReferrer_MImportTypeBList(MImportTypeBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_IMPORT_TYPE_B where ...)} <br>
     * M_IMPORT_TYPE_B by EDI_COLUMN_ID, named 'MImportTypeBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMImportTypeBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MImportTypeBCB> derivedMImportTypeBList() {
        return xcreateQDRFunctionMImportTypeBList();
    }
    protected HpQDRFunction<MImportTypeBCB> xcreateQDRFunctionMImportTypeBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMImportTypeBList(fn, sq, rd, vl, op));
    }
    public void xqderiveMImportTypeBList(String fn, SubQuery<MImportTypeBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCB cb = new MImportTypeBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepEdiColumnId_QueryDerivedReferrer_MImportTypeBList(cb.query()); String prpp = keepEdiColumnId_QueryDerivedReferrer_MImportTypeBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "EDI_COLUMN_ID", "EDI_COLUMN_ID", sqpp, "mImportTypeBList", rd, vl, prpp, op);
    }
    public abstract String keepEdiColumnId_QueryDerivedReferrer_MImportTypeBList(MImportTypeBCQ sq);
    public abstract String keepEdiColumnId_QueryDerivedReferrer_MImportTypeBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setEdiColumnId_IsNull() { regEdiColumnId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setEdiColumnId_IsNotNull() { regEdiColumnId(CK_ISNN, DOBJ); }

    protected void regEdiColumnId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEdiColumnId(), "EDI_COLUMN_ID"); }
    protected abstract ConditionValue xgetCValueEdiColumnId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediId The value of ediId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiId_Equal(Long ediId) {
        doSetEdiId_Equal(ediId);
    }

    protected void doSetEdiId_Equal(Long ediId) {
        regEdiId(CK_EQ, ediId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediId The value of ediId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiId_NotEqual(Long ediId) {
        doSetEdiId_NotEqual(ediId);
    }

    protected void doSetEdiId_NotEqual(Long ediId) {
        regEdiId(CK_NES, ediId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediId The value of ediId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiId_GreaterThan(Long ediId) {
        regEdiId(CK_GT, ediId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediId The value of ediId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiId_LessThan(Long ediId) {
        regEdiId(CK_LT, ediId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediId The value of ediId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiId_GreaterEqual(Long ediId) {
        regEdiId(CK_GE, ediId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediId The value of ediId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiId_LessEqual(Long ediId) {
        regEdiId(CK_LE, ediId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param minNumber The min number of ediId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ediId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEdiId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEdiId(), "EDI_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediIdList The collection of ediId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiId_InScope(Collection<Long> ediIdList) {
        doSetEdiId_InScope(ediIdList);
    }

    protected void doSetEdiId_InScope(Collection<Long> ediIdList) {
        regINS(CK_INS, cTL(ediIdList), xgetCValueEdiId(), "EDI_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @param ediIdList The collection of ediId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiId_NotInScope(Collection<Long> ediIdList) {
        doSetEdiId_NotInScope(ediIdList);
    }

    protected void doSetEdiId_NotInScope(Collection<Long> ediIdList) {
        regINS(CK_NINS, cTL(ediIdList), xgetCValueEdiId(), "EDI_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select EDI_ID from M_EDI where ...)} <br />
     * M_EDI by my EDI_ID, named 'MEdi'.
     * @param subCBLambda The callback for sub-query of MEdi for 'in-scope'. (NotNull)
     */
    public void inScopeMEdi(SubQuery<MEdiCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MEdiCB cb = new MEdiCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEdiId_InScopeRelation_MEdi(cb.query());
        registerInScopeRelation(cb.query(), "EDI_ID", "EDI_ID", pp, "mEdi", false);
    }
    public abstract String keepEdiId_InScopeRelation_MEdi(MEdiCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select EDI_ID from M_EDI where ...)} <br />
     * M_EDI by my EDI_ID, named 'MEdi'.
     * @param subCBLambda The callback for sub-query of MEdi for 'not in-scope'. (NotNull)
     */
    public void notInScopeMEdi(SubQuery<MEdiCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MEdiCB cb = new MEdiCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEdiId_NotInScopeRelation_MEdi(cb.query());
        registerInScopeRelation(cb.query(), "EDI_ID", "EDI_ID", pp, "mEdi", true);
    }
    public abstract String keepEdiId_NotInScopeRelation_MEdi(MEdiCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     */
    public void setEdiId_IsNull() { regEdiId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     */
    public void setEdiId_IsNotNull() { regEdiId(CK_ISNN, DOBJ); }

    protected void regEdiId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEdiId(), "EDI_ID"); }
    protected abstract ConditionValue xgetCValueEdiId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     * @param ediColumnNm The value of ediColumnNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiColumnNm_Equal(String ediColumnNm) {
        doSetEdiColumnNm_Equal(fRES(ediColumnNm));
    }

    protected void doSetEdiColumnNm_Equal(String ediColumnNm) {
        regEdiColumnNm(CK_EQ, ediColumnNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     * @param ediColumnNm The value of ediColumnNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiColumnNm_NotEqual(String ediColumnNm) {
        doSetEdiColumnNm_NotEqual(fRES(ediColumnNm));
    }

    protected void doSetEdiColumnNm_NotEqual(String ediColumnNm) {
        regEdiColumnNm(CK_NES, ediColumnNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     * @param ediColumnNm The value of ediColumnNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiColumnNm_GreaterThan(String ediColumnNm) {
        regEdiColumnNm(CK_GT, fRES(ediColumnNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     * @param ediColumnNm The value of ediColumnNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiColumnNm_LessThan(String ediColumnNm) {
        regEdiColumnNm(CK_LT, fRES(ediColumnNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     * @param ediColumnNm The value of ediColumnNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiColumnNm_GreaterEqual(String ediColumnNm) {
        regEdiColumnNm(CK_GE, fRES(ediColumnNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     * @param ediColumnNm The value of ediColumnNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiColumnNm_LessEqual(String ediColumnNm) {
        regEdiColumnNm(CK_LE, fRES(ediColumnNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     * @param ediColumnNmList The collection of ediColumnNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiColumnNm_InScope(Collection<String> ediColumnNmList) {
        doSetEdiColumnNm_InScope(ediColumnNmList);
    }

    protected void doSetEdiColumnNm_InScope(Collection<String> ediColumnNmList) {
        regINS(CK_INS, cTL(ediColumnNmList), xgetCValueEdiColumnNm(), "EDI_COLUMN_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     * @param ediColumnNmList The collection of ediColumnNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiColumnNm_NotInScope(Collection<String> ediColumnNmList) {
        doSetEdiColumnNm_NotInScope(ediColumnNmList);
    }

    protected void doSetEdiColumnNm_NotInScope(Collection<String> ediColumnNmList) {
        regINS(CK_NINS, cTL(ediColumnNmList), xgetCValueEdiColumnNm(), "EDI_COLUMN_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)} <br>
     * <pre>e.g. setEdiColumnNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ediColumnNm The value of ediColumnNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEdiColumnNm_LikeSearch(String ediColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ediColumnNm), xgetCValueEdiColumnNm(), "EDI_COLUMN_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     * @param ediColumnNm The value of ediColumnNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEdiColumnNm_NotLikeSearch(String ediColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ediColumnNm), xgetCValueEdiColumnNm(), "EDI_COLUMN_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     * @param ediColumnNm The value of ediColumnNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiColumnNm_PrefixSearch(String ediColumnNm) {
        setEdiColumnNm_LikeSearch(ediColumnNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     */
    public void setEdiColumnNm_IsNull() { regEdiColumnNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     */
    public void setEdiColumnNm_IsNullOrEmpty() { regEdiColumnNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EDI_COLUMN_NM: {varchar(255)}
     */
    public void setEdiColumnNm_IsNotNull() { regEdiColumnNm(CK_ISNN, DOBJ); }

    protected void regEdiColumnNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEdiColumnNm(), "EDI_COLUMN_NM"); }
    protected abstract ConditionValue xgetCValueEdiColumnNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal_AsDelFlg(CDef.DelFlg cdef) {
        doSetDelFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未削除
     */
    public void setDelFlg_Equal_$0() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 削除済
     */
    public void setDelFlg_Equal_$1() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$1);
    }

    protected void doSetDelFlg_Equal(String delFlg) {
        regDelFlg(CK_EQ, delFlg);
    }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "DEL_FLG"); }
    protected abstract ConditionValue xgetCValueDelFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     * @param controlNo The value of controlNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_Equal(Long controlNo) {
        doSetControlNo_Equal(controlNo);
    }

    protected void doSetControlNo_Equal(Long controlNo) {
        regControlNo(CK_EQ, controlNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     * @param controlNo The value of controlNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_NotEqual(Long controlNo) {
        doSetControlNo_NotEqual(controlNo);
    }

    protected void doSetControlNo_NotEqual(Long controlNo) {
        regControlNo(CK_NES, controlNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     * @param minNumber The min number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setControlNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueControlNo(), "CONTROL_NO", rangeOfOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     */
    public void setControlNo_IsNull() { regControlNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {bigint(19)}
     */
    public void setControlNo_IsNotNull() { regControlNo(CK_ISNN, DOBJ); }

    protected void regControlNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueControlNo(), "CONTROL_NO"); }
    protected abstract ConditionValue xgetCValueControlNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @param addDt The value of addDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_Equal(java.sql.Timestamp addDt) {
        regAddDt(CK_EQ,  addDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {datetime2(26, 6)}
     * @param addDt The value of addDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_LessEqual(java.sql.Timestamp addDt) {
        regAddDt(CK_LE, addDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {datetime2(26, 6)}
     */
    public void setAddDt_IsNull() { regAddDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {datetime2(26, 6)}
     */
    public void setAddDt_IsNotNull() { regAddDt(CK_ISNN, DOBJ); }

    protected void regAddDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddDt(), "ADD_DT"); }
    protected abstract ConditionValue xgetCValueAddDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_USER: {varchar(255)}
     * @param addUser The value of addUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddUser_Equal(String addUser) {
        doSetAddUser_Equal(fRES(addUser));
    }

    protected void doSetAddUser_Equal(String addUser) {
        regAddUser(CK_EQ, addUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {varchar(255)}
     */
    public void setAddUser_IsNull() { regAddUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_USER: {varchar(255)}
     */
    public void setAddUser_IsNullOrEmpty() { regAddUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {varchar(255)}
     */
    public void setAddUser_IsNotNull() { regAddUser(CK_ISNN, DOBJ); }

    protected void regAddUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddUser(), "ADD_USER"); }
    protected abstract ConditionValue xgetCValueAddUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_PROCESS: {varchar(4000)}
     * @param addProcess The value of addProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddProcess_Equal(String addProcess) {
        doSetAddProcess_Equal(fRES(addProcess));
    }

    protected void doSetAddProcess_Equal(String addProcess) {
        regAddProcess(CK_EQ, addProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {varchar(4000)}
     */
    public void setAddProcess_IsNull() { regAddProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {varchar(4000)}
     */
    public void setAddProcess_IsNullOrEmpty() { regAddProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {varchar(4000)}
     */
    public void setAddProcess_IsNotNull() { regAddProcess(CK_ISNN, DOBJ); }

    protected void regAddProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddProcess(), "ADD_PROCESS"); }
    protected abstract ConditionValue xgetCValueAddProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @param updDt The value of updDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_Equal(java.sql.Timestamp updDt) {
        regUpdDt(CK_EQ,  updDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {datetime2(26, 6)}
     * @param updDt The value of updDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_LessEqual(java.sql.Timestamp updDt) {
        regUpdDt(CK_LE, updDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {datetime2(26, 6)}
     */
    public void setUpdDt_IsNull() { regUpdDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {datetime2(26, 6)}
     */
    public void setUpdDt_IsNotNull() { regUpdDt(CK_ISNN, DOBJ); }

    protected void regUpdDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdDt(), "UPD_DT"); }
    protected abstract ConditionValue xgetCValueUpdDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255)}
     * @param updUser The value of updUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUser_Equal(String updUser) {
        doSetUpdUser_Equal(fRES(updUser));
    }

    protected void doSetUpdUser_Equal(String updUser) {
        regUpdUser(CK_EQ, updUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255)}
     */
    public void setUpdUser_IsNull() { regUpdUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255)}
     */
    public void setUpdUser_IsNullOrEmpty() { regUpdUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255)}
     */
    public void setUpdUser_IsNotNull() { regUpdUser(CK_ISNN, DOBJ); }

    protected void regUpdUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdUser(), "UPD_USER"); }
    protected abstract ConditionValue xgetCValueUpdUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_PROCESS: {varchar(4000)}
     * @param updProcess The value of updProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdProcess_Equal(String updProcess) {
        doSetUpdProcess_Equal(fRES(updProcess));
    }

    protected void doSetUpdProcess_Equal(String updProcess) {
        regUpdProcess(CK_EQ, updProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {varchar(4000)}
     */
    public void setUpdProcess_IsNull() { regUpdProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {varchar(4000)}
     */
    public void setUpdProcess_IsNullOrEmpty() { regUpdProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {varchar(4000)}
     */
    public void setUpdProcess_IsNotNull() { regUpdProcess(CK_ISNN, DOBJ); }

    protected void regUpdProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdProcess(), "UPD_PROCESS"); }
    protected abstract ConditionValue xgetCValueUpdProcess();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MEdiColumnCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MEdiColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MEdiColumnCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MEdiColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MEdiColumnCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MEdiColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MEdiColumnCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MEdiColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MEdiColumnCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MEdiColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MEdiColumnCB&gt;() {
     *     public void query(MEdiColumnCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MEdiColumnCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MEdiColumnCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MEdiColumnCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MEdiColumnCQ sq);

    protected MEdiColumnCB xcreateScalarConditionCB() {
        MEdiColumnCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MEdiColumnCB xcreateScalarConditionPartitionByCB() {
        MEdiColumnCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MEdiColumnCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MEdiColumnCB cb = new MEdiColumnCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "EDI_COLUMN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MEdiColumnCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MEdiColumnCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MEdiColumnCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MEdiColumnCB cb = new MEdiColumnCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "EDI_COLUMN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MEdiColumnCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MEdiColumnCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MEdiColumnCB cb = new MEdiColumnCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MEdiColumnCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    /**
     * Order along the list of manual values. #beforejava8 <br>
     * This function with Union is unsupported! <br>
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderOption option = new ManualOrderOption();
        option.acceptOrderValueList(orderValueList);
        withManualOrder(option);
    }

    @Override
    protected void filterFromToOption(String columnDbName, FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected MEdiColumnCB newMyCB() {
        return new MEdiColumnCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MEdiColumnCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
