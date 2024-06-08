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
 * The abstract condition-query of M_IMPORT_TYPE_B.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMImportTypeBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMImportTypeBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_IMPORT_TYPE_B";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBId The value of importTypeBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBId_Equal(Long importTypeBId) {
        doSetImportTypeBId_Equal(importTypeBId);
    }

    protected void doSetImportTypeBId_Equal(Long importTypeBId) {
        regImportTypeBId(CK_EQ, importTypeBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBId The value of importTypeBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBId_NotEqual(Long importTypeBId) {
        doSetImportTypeBId_NotEqual(importTypeBId);
    }

    protected void doSetImportTypeBId_NotEqual(Long importTypeBId) {
        regImportTypeBId(CK_NES, importTypeBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBId The value of importTypeBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBId_GreaterThan(Long importTypeBId) {
        regImportTypeBId(CK_GT, importTypeBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBId The value of importTypeBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBId_LessThan(Long importTypeBId) {
        regImportTypeBId(CK_LT, importTypeBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBId The value of importTypeBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBId_GreaterEqual(Long importTypeBId) {
        regImportTypeBId(CK_GE, importTypeBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBId The value of importTypeBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBId_LessEqual(Long importTypeBId) {
        regImportTypeBId(CK_LE, importTypeBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of importTypeBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of importTypeBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImportTypeBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueImportTypeBId(), "IMPORT_TYPE_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBIdList The collection of importTypeBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeBId_InScope(Collection<Long> importTypeBIdList) {
        doSetImportTypeBId_InScope(importTypeBIdList);
    }

    protected void doSetImportTypeBId_InScope(Collection<Long> importTypeBIdList) {
        regINS(CK_INS, cTL(importTypeBIdList), xgetCValueImportTypeBId(), "IMPORT_TYPE_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBIdList The collection of importTypeBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeBId_NotInScope(Collection<Long> importTypeBIdList) {
        doSetImportTypeBId_NotInScope(importTypeBIdList);
    }

    protected void doSetImportTypeBId_NotInScope(Collection<Long> importTypeBIdList) {
        regINS(CK_NINS, cTL(importTypeBIdList), xgetCValueImportTypeBId(), "IMPORT_TYPE_B_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select IMPORT_TYPE_B_ID from M_IMPORT_TYPE_B_COPY_B where ...)} <br>
     * M_IMPORT_TYPE_B_COPY_B by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMImportTypeBCopyBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MImportTypeBCopyBList for 'exists'. (NotNull)
     */
    public void existsMImportTypeBCopyBList(SubQuery<MImportTypeBCopyBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeBCopyBCB cb = new MImportTypeBCopyBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepImportTypeBId_ExistsReferrer_MImportTypeBCopyBList(cb.query());
        registerExistsReferrer(cb.query(), "IMPORT_TYPE_B_ID", "IMPORT_TYPE_B_ID", pp, "mImportTypeBCopyBList");
    }
    public abstract String keepImportTypeBId_ExistsReferrer_MImportTypeBCopyBList(MImportTypeBCopyBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select IMPORT_TYPE_B_ID from M_IMPORT_TYPE_B_COPY_H where ...)} <br>
     * M_IMPORT_TYPE_B_COPY_H by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMImportTypeBCopyHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MImportTypeBCopyHList for 'exists'. (NotNull)
     */
    public void existsMImportTypeBCopyHList(SubQuery<MImportTypeBCopyHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeBCopyHCB cb = new MImportTypeBCopyHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepImportTypeBId_ExistsReferrer_MImportTypeBCopyHList(cb.query());
        registerExistsReferrer(cb.query(), "IMPORT_TYPE_B_ID", "IMPORT_TYPE_B_ID", pp, "mImportTypeBCopyHList");
    }
    public abstract String keepImportTypeBId_ExistsReferrer_MImportTypeBCopyHList(MImportTypeBCopyHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select IMPORT_TYPE_B_ID from M_IMPORT_TYPE_B_COPY_B where ...)} <br>
     * M_IMPORT_TYPE_B_COPY_B by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMImportTypeBCopyBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ImportTypeBId_NotExistsReferrer_MImportTypeBCopyBList for 'not exists'. (NotNull)
     */
    public void notExistsMImportTypeBCopyBList(SubQuery<MImportTypeBCopyBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeBCopyBCB cb = new MImportTypeBCopyBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepImportTypeBId_NotExistsReferrer_MImportTypeBCopyBList(cb.query());
        registerNotExistsReferrer(cb.query(), "IMPORT_TYPE_B_ID", "IMPORT_TYPE_B_ID", pp, "mImportTypeBCopyBList");
    }
    public abstract String keepImportTypeBId_NotExistsReferrer_MImportTypeBCopyBList(MImportTypeBCopyBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select IMPORT_TYPE_B_ID from M_IMPORT_TYPE_B_COPY_H where ...)} <br>
     * M_IMPORT_TYPE_B_COPY_H by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMImportTypeBCopyHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ImportTypeBId_NotExistsReferrer_MImportTypeBCopyHList for 'not exists'. (NotNull)
     */
    public void notExistsMImportTypeBCopyHList(SubQuery<MImportTypeBCopyHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeBCopyHCB cb = new MImportTypeBCopyHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepImportTypeBId_NotExistsReferrer_MImportTypeBCopyHList(cb.query());
        registerNotExistsReferrer(cb.query(), "IMPORT_TYPE_B_ID", "IMPORT_TYPE_B_ID", pp, "mImportTypeBCopyHList");
    }
    public abstract String keepImportTypeBId_NotExistsReferrer_MImportTypeBCopyHList(MImportTypeBCopyHCQ sq);

    public void xsderiveMImportTypeBCopyBList(String fn, SubQuery<MImportTypeBCopyBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCopyBCB cb = new MImportTypeBCopyBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepImportTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "IMPORT_TYPE_B_ID", "IMPORT_TYPE_B_ID", pp, "mImportTypeBCopyBList", al, op);
    }
    public abstract String keepImportTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyBList(MImportTypeBCopyBCQ sq);

    public void xsderiveMImportTypeBCopyHList(String fn, SubQuery<MImportTypeBCopyHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCopyHCB cb = new MImportTypeBCopyHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepImportTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "IMPORT_TYPE_B_ID", "IMPORT_TYPE_B_ID", pp, "mImportTypeBCopyHList", al, op);
    }
    public abstract String keepImportTypeBId_SpecifyDerivedReferrer_MImportTypeBCopyHList(MImportTypeBCopyHCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_IMPORT_TYPE_B_COPY_B where ...)} <br>
     * M_IMPORT_TYPE_B_COPY_B by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMImportTypeBCopyBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MImportTypeBCopyBCB> derivedMImportTypeBCopyBList() {
        return xcreateQDRFunctionMImportTypeBCopyBList();
    }
    protected HpQDRFunction<MImportTypeBCopyBCB> xcreateQDRFunctionMImportTypeBCopyBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMImportTypeBCopyBList(fn, sq, rd, vl, op));
    }
    public void xqderiveMImportTypeBCopyBList(String fn, SubQuery<MImportTypeBCopyBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCopyBCB cb = new MImportTypeBCopyBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyBList(cb.query()); String prpp = keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "IMPORT_TYPE_B_ID", "IMPORT_TYPE_B_ID", sqpp, "mImportTypeBCopyBList", rd, vl, prpp, op);
    }
    public abstract String keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyBList(MImportTypeBCopyBCQ sq);
    public abstract String keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_IMPORT_TYPE_B_COPY_H where ...)} <br>
     * M_IMPORT_TYPE_B_COPY_H by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMImportTypeBCopyHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MImportTypeBCopyHCB> derivedMImportTypeBCopyHList() {
        return xcreateQDRFunctionMImportTypeBCopyHList();
    }
    protected HpQDRFunction<MImportTypeBCopyHCB> xcreateQDRFunctionMImportTypeBCopyHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMImportTypeBCopyHList(fn, sq, rd, vl, op));
    }
    public void xqderiveMImportTypeBCopyHList(String fn, SubQuery<MImportTypeBCopyHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCopyHCB cb = new MImportTypeBCopyHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyHList(cb.query()); String prpp = keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "IMPORT_TYPE_B_ID", "IMPORT_TYPE_B_ID", sqpp, "mImportTypeBCopyHList", rd, vl, prpp, op);
    }
    public abstract String keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyHList(MImportTypeBCopyHCQ sq);
    public abstract String keepImportTypeBId_QueryDerivedReferrer_MImportTypeBCopyHListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setImportTypeBId_IsNull() { regImportTypeBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setImportTypeBId_IsNotNull() { regImportTypeBId(CK_ISNN, DOBJ); }

    protected void regImportTypeBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportTypeBId(), "IMPORT_TYPE_B_ID"); }
    protected abstract ConditionValue xgetCValueImportTypeBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeId The value of importTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_Equal(Long importTypeId) {
        doSetImportTypeId_Equal(importTypeId);
    }

    protected void doSetImportTypeId_Equal(Long importTypeId) {
        regImportTypeId(CK_EQ, importTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeId The value of importTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_NotEqual(Long importTypeId) {
        doSetImportTypeId_NotEqual(importTypeId);
    }

    protected void doSetImportTypeId_NotEqual(Long importTypeId) {
        regImportTypeId(CK_NES, importTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeId The value of importTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_GreaterThan(Long importTypeId) {
        regImportTypeId(CK_GT, importTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeId The value of importTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_LessThan(Long importTypeId) {
        regImportTypeId(CK_LT, importTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeId The value of importTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_GreaterEqual(Long importTypeId) {
        regImportTypeId(CK_GE, importTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeId The value of importTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeId_LessEqual(Long importTypeId) {
        regImportTypeId(CK_LE, importTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param minNumber The min number of importTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of importTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImportTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueImportTypeId(), "IMPORT_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeIdList The collection of importTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeId_InScope(Collection<Long> importTypeIdList) {
        doSetImportTypeId_InScope(importTypeIdList);
    }

    protected void doSetImportTypeId_InScope(Collection<Long> importTypeIdList) {
        regINS(CK_INS, cTL(importTypeIdList), xgetCValueImportTypeId(), "IMPORT_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @param importTypeIdList The collection of importTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeId_NotInScope(Collection<Long> importTypeIdList) {
        doSetImportTypeId_NotInScope(importTypeIdList);
    }

    protected void doSetImportTypeId_NotInScope(Collection<Long> importTypeIdList) {
        regINS(CK_NINS, cTL(importTypeIdList), xgetCValueImportTypeId(), "IMPORT_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select IMPORT_TYPE_ID from M_IMPORT_TYPE where ...)} <br />
     * M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'.
     * @param subCBLambda The callback for sub-query of MImportType for 'in-scope'. (NotNull)
     */
    public void inScopeMImportType(SubQuery<MImportTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeCB cb = new MImportTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepImportTypeId_InScopeRelation_MImportType(cb.query());
        registerInScopeRelation(cb.query(), "IMPORT_TYPE_ID", "IMPORT_TYPE_ID", pp, "mImportType", false);
    }
    public abstract String keepImportTypeId_InScopeRelation_MImportType(MImportTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select IMPORT_TYPE_ID from M_IMPORT_TYPE where ...)} <br />
     * M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'.
     * @param subCBLambda The callback for sub-query of MImportType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMImportType(SubQuery<MImportTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeCB cb = new MImportTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepImportTypeId_NotInScopeRelation_MImportType(cb.query());
        registerInScopeRelation(cb.query(), "IMPORT_TYPE_ID", "IMPORT_TYPE_ID", pp, "mImportType", true);
    }
    public abstract String keepImportTypeId_NotInScopeRelation_MImportType(MImportTypeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     */
    public void setImportTypeId_IsNull() { regImportTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     */
    public void setImportTypeId_IsNotNull() { regImportTypeId(CK_ISNN, DOBJ); }

    protected void regImportTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportTypeId(), "IMPORT_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueImportTypeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_NO: {bigint(19)}
     * @param columnNo The value of columnNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnNo_Equal(Long columnNo) {
        doSetColumnNo_Equal(columnNo);
    }

    protected void doSetColumnNo_Equal(Long columnNo) {
        regColumnNo(CK_EQ, columnNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_NO: {bigint(19)}
     * @param columnNo The value of columnNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnNo_NotEqual(Long columnNo) {
        doSetColumnNo_NotEqual(columnNo);
    }

    protected void doSetColumnNo_NotEqual(Long columnNo) {
        regColumnNo(CK_NES, columnNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_NO: {bigint(19)}
     * @param columnNo The value of columnNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnNo_GreaterThan(Long columnNo) {
        regColumnNo(CK_GT, columnNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_NO: {bigint(19)}
     * @param columnNo The value of columnNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnNo_LessThan(Long columnNo) {
        regColumnNo(CK_LT, columnNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_NO: {bigint(19)}
     * @param columnNo The value of columnNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnNo_GreaterEqual(Long columnNo) {
        regColumnNo(CK_GE, columnNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_NO: {bigint(19)}
     * @param columnNo The value of columnNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColumnNo_LessEqual(Long columnNo) {
        regColumnNo(CK_LE, columnNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COLUMN_NO: {bigint(19)}
     * @param minNumber The min number of columnNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of columnNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setColumnNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueColumnNo(), "COLUMN_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COLUMN_NO: {bigint(19)}
     * @param columnNoList The collection of columnNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColumnNo_InScope(Collection<Long> columnNoList) {
        doSetColumnNo_InScope(columnNoList);
    }

    protected void doSetColumnNo_InScope(Collection<Long> columnNoList) {
        regINS(CK_INS, cTL(columnNoList), xgetCValueColumnNo(), "COLUMN_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COLUMN_NO: {bigint(19)}
     * @param columnNoList The collection of columnNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColumnNo_NotInScope(Collection<Long> columnNoList) {
        doSetColumnNo_NotInScope(columnNoList);
    }

    protected void doSetColumnNo_NotInScope(Collection<Long> columnNoList) {
        regINS(CK_NINS, cTL(columnNoList), xgetCValueColumnNo(), "COLUMN_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COLUMN_NO: {bigint(19)}
     */
    public void setColumnNo_IsNull() { regColumnNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COLUMN_NO: {bigint(19)}
     */
    public void setColumnNo_IsNotNull() { regColumnNo(CK_ISNN, DOBJ); }

    protected void regColumnNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColumnNo(), "COLUMN_NO"); }
    protected abstract ConditionValue xgetCValueColumnNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
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
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
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
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
     * @param ediColumnId The value of ediColumnId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiColumnId_GreaterThan(Long ediColumnId) {
        regEdiColumnId(CK_GT, ediColumnId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
     * @param ediColumnId The value of ediColumnId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiColumnId_LessThan(Long ediColumnId) {
        regEdiColumnId(CK_LT, ediColumnId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
     * @param ediColumnId The value of ediColumnId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiColumnId_GreaterEqual(Long ediColumnId) {
        regEdiColumnId(CK_GE, ediColumnId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
     * @param ediColumnId The value of ediColumnId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEdiColumnId_LessEqual(Long ediColumnId) {
        regEdiColumnId(CK_LE, ediColumnId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
     * @param minNumber The min number of ediColumnId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ediColumnId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEdiColumnId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEdiColumnId(), "EDI_COLUMN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
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
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
     * @param ediColumnIdList The collection of ediColumnId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEdiColumnId_NotInScope(Collection<Long> ediColumnIdList) {
        doSetEdiColumnId_NotInScope(ediColumnIdList);
    }

    protected void doSetEdiColumnId_NotInScope(Collection<Long> ediColumnIdList) {
        regINS(CK_NINS, cTL(ediColumnIdList), xgetCValueEdiColumnId(), "EDI_COLUMN_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select EDI_COLUMN_ID from M_EDI_COLUMN where ...)} <br />
     * M_EDI_COLUMN by my EDI_COLUMN_ID, named 'MEdiColumn'.
     * @param subCBLambda The callback for sub-query of MEdiColumn for 'in-scope'. (NotNull)
     */
    public void inScopeMEdiColumn(SubQuery<MEdiColumnCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MEdiColumnCB cb = new MEdiColumnCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEdiColumnId_InScopeRelation_MEdiColumn(cb.query());
        registerInScopeRelation(cb.query(), "EDI_COLUMN_ID", "EDI_COLUMN_ID", pp, "mEdiColumn", false);
    }
    public abstract String keepEdiColumnId_InScopeRelation_MEdiColumn(MEdiColumnCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select EDI_COLUMN_ID from M_EDI_COLUMN where ...)} <br />
     * M_EDI_COLUMN by my EDI_COLUMN_ID, named 'MEdiColumn'.
     * @param subCBLambda The callback for sub-query of MEdiColumn for 'not in-scope'. (NotNull)
     */
    public void notInScopeMEdiColumn(SubQuery<MEdiColumnCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MEdiColumnCB cb = new MEdiColumnCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepEdiColumnId_NotInScopeRelation_MEdiColumn(cb.query());
        registerInScopeRelation(cb.query(), "EDI_COLUMN_ID", "EDI_COLUMN_ID", pp, "mEdiColumn", true);
    }
    public abstract String keepEdiColumnId_NotInScopeRelation_MEdiColumn(MEdiColumnCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
     */
    public void setEdiColumnId_IsNull() { regEdiColumnId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EDI_COLUMN_ID: {IX, bigint(19), FK to M_EDI_COLUMN}
     */
    public void setEdiColumnId_IsNotNull() { regEdiColumnId(CK_ISNN, DOBJ); }

    protected void regEdiColumnId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEdiColumnId(), "EDI_COLUMN_ID"); }
    protected abstract ConditionValue xgetCValueEdiColumnId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_Equal(String uploadColumnNm) {
        doSetUploadColumnNm_Equal(fRES(uploadColumnNm));
    }

    protected void doSetUploadColumnNm_Equal(String uploadColumnNm) {
        regUploadColumnNm(CK_EQ, uploadColumnNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_NotEqual(String uploadColumnNm) {
        doSetUploadColumnNm_NotEqual(fRES(uploadColumnNm));
    }

    protected void doSetUploadColumnNm_NotEqual(String uploadColumnNm) {
        regUploadColumnNm(CK_NES, uploadColumnNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_GreaterThan(String uploadColumnNm) {
        regUploadColumnNm(CK_GT, fRES(uploadColumnNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_LessThan(String uploadColumnNm) {
        regUploadColumnNm(CK_LT, fRES(uploadColumnNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_GreaterEqual(String uploadColumnNm) {
        regUploadColumnNm(CK_GE, fRES(uploadColumnNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_LessEqual(String uploadColumnNm) {
        regUploadColumnNm(CK_LE, fRES(uploadColumnNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNmList The collection of uploadColumnNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_InScope(Collection<String> uploadColumnNmList) {
        doSetUploadColumnNm_InScope(uploadColumnNmList);
    }

    protected void doSetUploadColumnNm_InScope(Collection<String> uploadColumnNmList) {
        regINS(CK_INS, cTL(uploadColumnNmList), xgetCValueUploadColumnNm(), "UPLOAD_COLUMN_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNmList The collection of uploadColumnNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_NotInScope(Collection<String> uploadColumnNmList) {
        doSetUploadColumnNm_NotInScope(uploadColumnNmList);
    }

    protected void doSetUploadColumnNm_NotInScope(Collection<String> uploadColumnNmList) {
        regINS(CK_NINS, cTL(uploadColumnNmList), xgetCValueUploadColumnNm(), "UPLOAD_COLUMN_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)} <br>
     * <pre>e.g. setUploadColumnNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uploadColumnNm The value of uploadColumnNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUploadColumnNm_LikeSearch(String uploadColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uploadColumnNm), xgetCValueUploadColumnNm(), "UPLOAD_COLUMN_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUploadColumnNm_NotLikeSearch(String uploadColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uploadColumnNm), xgetCValueUploadColumnNm(), "UPLOAD_COLUMN_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_PrefixSearch(String uploadColumnNm) {
        setUploadColumnNm_LikeSearch(uploadColumnNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     */
    public void setUploadColumnNm_IsNull() { regUploadColumnNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     */
    public void setUploadColumnNm_IsNullOrEmpty() { regUploadColumnNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     */
    public void setUploadColumnNm_IsNotNull() { regUploadColumnNm(CK_ISNN, DOBJ); }

    protected void regUploadColumnNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUploadColumnNm(), "UPLOAD_COLUMN_NM"); }
    protected abstract ConditionValue xgetCValueUploadColumnNm();

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
    public HpSLCFunction<MImportTypeBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MImportTypeBCB.class);
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
    public HpSLCFunction<MImportTypeBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MImportTypeBCB.class);
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
    public HpSLCFunction<MImportTypeBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MImportTypeBCB.class);
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
    public HpSLCFunction<MImportTypeBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MImportTypeBCB.class);
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
    public HpSLCFunction<MImportTypeBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MImportTypeBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MImportTypeBCB&gt;() {
     *     public void query(MImportTypeBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MImportTypeBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MImportTypeBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MImportTypeBCQ sq);

    protected MImportTypeBCB xcreateScalarConditionCB() {
        MImportTypeBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MImportTypeBCB xcreateScalarConditionPartitionByCB() {
        MImportTypeBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MImportTypeBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCB cb = new MImportTypeBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "IMPORT_TYPE_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MImportTypeBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MImportTypeBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MImportTypeBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCB cb = new MImportTypeBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "IMPORT_TYPE_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MImportTypeBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MImportTypeBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeBCB cb = new MImportTypeBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MImportTypeBCQ sq);

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
    protected MImportTypeBCB newMyCB() {
        return new MImportTypeBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MImportTypeBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
