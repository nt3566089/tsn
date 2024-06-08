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
 * The abstract condition-query of B_CLASS_DTL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBClassDtlCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBClassDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_CLASS_DTL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param classDtlId The value of classDtlId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassDtlId_Equal(Long classDtlId) {
        doSetClassDtlId_Equal(classDtlId);
    }

    protected void doSetClassDtlId_Equal(Long classDtlId) {
        regClassDtlId(CK_EQ, classDtlId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param classDtlId The value of classDtlId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassDtlId_NotEqual(Long classDtlId) {
        doSetClassDtlId_NotEqual(classDtlId);
    }

    protected void doSetClassDtlId_NotEqual(Long classDtlId) {
        regClassDtlId(CK_NES, classDtlId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param classDtlId The value of classDtlId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassDtlId_GreaterThan(Long classDtlId) {
        regClassDtlId(CK_GT, classDtlId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param classDtlId The value of classDtlId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassDtlId_LessThan(Long classDtlId) {
        regClassDtlId(CK_LT, classDtlId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param classDtlId The value of classDtlId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassDtlId_GreaterEqual(Long classDtlId) {
        regClassDtlId(CK_GE, classDtlId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param classDtlId The value of classDtlId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassDtlId_LessEqual(Long classDtlId) {
        regClassDtlId(CK_LE, classDtlId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of classDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of classDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClassDtlId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClassDtlId(), "CLASS_DTL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param classDtlIdList The collection of classDtlId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlId_InScope(Collection<Long> classDtlIdList) {
        doSetClassDtlId_InScope(classDtlIdList);
    }

    protected void doSetClassDtlId_InScope(Collection<Long> classDtlIdList) {
        regINS(CK_INS, cTL(classDtlIdList), xgetCValueClassDtlId(), "CLASS_DTL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param classDtlIdList The collection of classDtlId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlId_NotInScope(Collection<Long> classDtlIdList) {
        doSetClassDtlId_NotInScope(classDtlIdList);
    }

    protected void doSetClassDtlId_NotInScope(Collection<Long> classDtlIdList) {
        regINS(CK_NINS, cTL(classDtlIdList), xgetCValueClassDtlId(), "CLASS_DTL_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLASS_DTL_ID from B_CLASS_DTL_SUB where ...)} <br>
     * B_CLASS_DTL_SUB by CLASS_DTL_ID, named 'BClassDtlSubAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBClassDtlSubAsOne</span>(subCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     subCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BClassDtlSubAsOne for 'exists'. (NotNull)
     */
    public void existsBClassDtlSubAsOne(SubQuery<BClassDtlSubCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassDtlSubCB cb = new BClassDtlSubCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClassDtlId_ExistsReferrer_BClassDtlSubAsOne(cb.query());
        registerExistsReferrer(cb.query(), "CLASS_DTL_ID", "CLASS_DTL_ID", pp, "bClassDtlSubAsOne");
    }
    public abstract String keepClassDtlId_ExistsReferrer_BClassDtlSubAsOne(BClassDtlSubCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLASS_DTL_ID from B_CLASS_GRP_DTL where ...)} <br>
     * B_CLASS_GRP_DTL by CLASS_DTL_ID, named 'BClassGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBClassGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BClassGrpDtlList for 'exists'. (NotNull)
     */
    public void existsBClassGrpDtlList(SubQuery<BClassGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassGrpDtlCB cb = new BClassGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClassDtlId_ExistsReferrer_BClassGrpDtlList(cb.query());
        registerExistsReferrer(cb.query(), "CLASS_DTL_ID", "CLASS_DTL_ID", pp, "bClassGrpDtlList");
    }
    public abstract String keepClassDtlId_ExistsReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLASS_DTL_ID from B_CLASS_DTL_SUB where ...)} <br>
     * B_CLASS_DTL_SUB by CLASS_DTL_ID, named 'BClassDtlSubAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBClassDtlSubAsOne</span>(subCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     subCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClassDtlId_NotExistsReferrer_BClassDtlSubAsOne for 'not exists'. (NotNull)
     */
    public void notExistsBClassDtlSubAsOne(SubQuery<BClassDtlSubCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassDtlSubCB cb = new BClassDtlSubCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClassDtlId_NotExistsReferrer_BClassDtlSubAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "CLASS_DTL_ID", "CLASS_DTL_ID", pp, "bClassDtlSubAsOne");
    }
    public abstract String keepClassDtlId_NotExistsReferrer_BClassDtlSubAsOne(BClassDtlSubCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLASS_DTL_ID from B_CLASS_GRP_DTL where ...)} <br>
     * B_CLASS_GRP_DTL by CLASS_DTL_ID, named 'BClassGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBClassGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClassDtlId_NotExistsReferrer_BClassGrpDtlList for 'not exists'. (NotNull)
     */
    public void notExistsBClassGrpDtlList(SubQuery<BClassGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassGrpDtlCB cb = new BClassGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClassDtlId_NotExistsReferrer_BClassGrpDtlList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLASS_DTL_ID", "CLASS_DTL_ID", pp, "bClassGrpDtlList");
    }
    public abstract String keepClassDtlId_NotExistsReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq);

    public void xsderiveBClassGrpDtlList(String fn, SubQuery<BClassGrpDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassGrpDtlCB cb = new BClassGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClassDtlId_SpecifyDerivedReferrer_BClassGrpDtlList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLASS_DTL_ID", "CLASS_DTL_ID", pp, "bClassGrpDtlList", al, op);
    }
    public abstract String keepClassDtlId_SpecifyDerivedReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_CLASS_GRP_DTL where ...)} <br>
     * B_CLASS_GRP_DTL by CLASS_DTL_ID, named 'BClassGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBClassGrpDtlList()</span>.<span style="color: #CC4747">max</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dtlCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BClassGrpDtlCB> derivedBClassGrpDtlList() {
        return xcreateQDRFunctionBClassGrpDtlList();
    }
    protected HpQDRFunction<BClassGrpDtlCB> xcreateQDRFunctionBClassGrpDtlList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBClassGrpDtlList(fn, sq, rd, vl, op));
    }
    public void xqderiveBClassGrpDtlList(String fn, SubQuery<BClassGrpDtlCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassGrpDtlCB cb = new BClassGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClassDtlId_QueryDerivedReferrer_BClassGrpDtlList(cb.query()); String prpp = keepClassDtlId_QueryDerivedReferrer_BClassGrpDtlListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLASS_DTL_ID", "CLASS_DTL_ID", sqpp, "bClassGrpDtlList", rd, vl, prpp, op);
    }
    public abstract String keepClassDtlId_QueryDerivedReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq);
    public abstract String keepClassDtlId_QueryDerivedReferrer_BClassGrpDtlListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClassDtlId_IsNull() { regClassDtlId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLASS_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClassDtlId_IsNotNull() { regClassDtlId(CK_ISNN, DOBJ); }

    protected void regClassDtlId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassDtlId(), "CLASS_DTL_ID"); }
    protected abstract ConditionValue xgetCValueClassDtlId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classId The value of classId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_Equal(Long classId) {
        doSetClassId_Equal(classId);
    }

    protected void doSetClassId_Equal(Long classId) {
        regClassId(CK_EQ, classId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classId The value of classId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_NotEqual(Long classId) {
        doSetClassId_NotEqual(classId);
    }

    protected void doSetClassId_NotEqual(Long classId) {
        regClassId(CK_NES, classId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classId The value of classId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_GreaterThan(Long classId) {
        regClassId(CK_GT, classId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classId The value of classId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_LessThan(Long classId) {
        regClassId(CK_LT, classId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classId The value of classId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_GreaterEqual(Long classId) {
        regClassId(CK_GE, classId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classId The value of classId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_LessEqual(Long classId) {
        regClassId(CK_LE, classId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param minNumber The min number of classId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of classId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClassId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClassId(), "CLASS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classIdList The collection of classId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassId_InScope(Collection<Long> classIdList) {
        doSetClassId_InScope(classIdList);
    }

    protected void doSetClassId_InScope(Collection<Long> classIdList) {
        regINS(CK_INS, cTL(classIdList), xgetCValueClassId(), "CLASS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLASS_ID: {UQ+, IX, NotNull, bigint(19), FK to B_CLASS}
     * @param classIdList The collection of classId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassId_NotInScope(Collection<Long> classIdList) {
        doSetClassId_NotInScope(classIdList);
    }

    protected void doSetClassId_NotInScope(Collection<Long> classIdList) {
        regINS(CK_NINS, cTL(classIdList), xgetCValueClassId(), "CLASS_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLASS_ID from B_CLASS where ...)} <br />
     * B_CLASS by my CLASS_ID, named 'BClass'.
     * @param subCBLambda The callback for sub-query of BClass for 'in-scope'. (NotNull)
     */
    public void inScopeBClass(SubQuery<BClassCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassCB cb = new BClassCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClassId_InScopeRelation_BClass(cb.query());
        registerInScopeRelation(cb.query(), "CLASS_ID", "CLASS_ID", pp, "bClass", false);
    }
    public abstract String keepClassId_InScopeRelation_BClass(BClassCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLASS_ID from B_CLASS where ...)} <br />
     * B_CLASS by my CLASS_ID, named 'BClass'.
     * @param subCBLambda The callback for sub-query of BClass for 'not in-scope'. (NotNull)
     */
    public void notInScopeBClass(SubQuery<BClassCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassCB cb = new BClassCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClassId_NotInScopeRelation_BClass(cb.query());
        registerInScopeRelation(cb.query(), "CLASS_ID", "CLASS_ID", pp, "bClass", true);
    }
    public abstract String keepClassId_NotInScopeRelation_BClass(BClassCQ sq);

    protected void regClassId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassId(), "CLASS_ID"); }
    protected abstract ConditionValue xgetCValueClassId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_Equal(String classDtlCd) {
        doSetClassDtlCd_Equal(fRES(classDtlCd));
    }

    protected void doSetClassDtlCd_Equal(String classDtlCd) {
        regClassDtlCd(CK_EQ, classDtlCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_NotEqual(String classDtlCd) {
        doSetClassDtlCd_NotEqual(fRES(classDtlCd));
    }

    protected void doSetClassDtlCd_NotEqual(String classDtlCd) {
        regClassDtlCd(CK_NES, classDtlCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_GreaterThan(String classDtlCd) {
        regClassDtlCd(CK_GT, fRES(classDtlCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_LessThan(String classDtlCd) {
        regClassDtlCd(CK_LT, fRES(classDtlCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_GreaterEqual(String classDtlCd) {
        regClassDtlCd(CK_GE, fRES(classDtlCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_LessEqual(String classDtlCd) {
        regClassDtlCd(CK_LE, fRES(classDtlCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCdList The collection of classDtlCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_InScope(Collection<String> classDtlCdList) {
        doSetClassDtlCd_InScope(classDtlCdList);
    }

    protected void doSetClassDtlCd_InScope(Collection<String> classDtlCdList) {
        regINS(CK_INS, cTL(classDtlCdList), xgetCValueClassDtlCd(), "CLASS_DTL_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCdList The collection of classDtlCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_NotInScope(Collection<String> classDtlCdList) {
        doSetClassDtlCd_NotInScope(classDtlCdList);
    }

    protected void doSetClassDtlCd_NotInScope(Collection<String> classDtlCdList) {
        regINS(CK_NINS, cTL(classDtlCdList), xgetCValueClassDtlCd(), "CLASS_DTL_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)} <br>
     * <pre>e.g. setClassDtlCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param classDtlCd The value of classDtlCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClassDtlCd_LikeSearch(String classDtlCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(classDtlCd), xgetCValueClassDtlCd(), "CLASS_DTL_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClassDtlCd_NotLikeSearch(String classDtlCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(classDtlCd), xgetCValueClassDtlCd(), "CLASS_DTL_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_DTL_CD: {+UQ, NotNull, varchar(100)}
     * @param classDtlCd The value of classDtlCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassDtlCd_PrefixSearch(String classDtlCd) {
        setClassDtlCd_LikeSearch(classDtlCd, xcLSOPPre());
    }

    protected void regClassDtlCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassDtlCd(), "CLASS_DTL_CD"); }
    protected abstract ConditionValue xgetCValueClassDtlCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_Equal(Long dictId) {
        doSetDictId_Equal(dictId);
    }

    protected void doSetDictId_Equal(Long dictId) {
        regDictId(CK_EQ, dictId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_NotEqual(Long dictId) {
        doSetDictId_NotEqual(dictId);
    }

    protected void doSetDictId_NotEqual(Long dictId) {
        regDictId(CK_NES, dictId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterThan(Long dictId) {
        regDictId(CK_GT, dictId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessThan(Long dictId) {
        regDictId(CK_LT, dictId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterEqual(Long dictId) {
        regDictId(CK_GE, dictId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessEqual(Long dictId) {
        regDictId(CK_LE, dictId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param minNumber The min number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDictId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDictId(), "DICT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictIdList The collection of dictId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictId_InScope(Collection<Long> dictIdList) {
        doSetDictId_InScope(dictIdList);
    }

    protected void doSetDictId_InScope(Collection<Long> dictIdList) {
        regINS(CK_INS, cTL(dictIdList), xgetCValueDictId(), "DICT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {IX, NotNull, bigint(19), FK to B_DICT}
     * @param dictIdList The collection of dictId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictId_NotInScope(Collection<Long> dictIdList) {
        doSetDictId_NotInScope(dictIdList);
    }

    protected void doSetDictId_NotInScope(Collection<Long> dictIdList) {
        regINS(CK_NINS, cTL(dictIdList), xgetCValueDictId(), "DICT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DICT_ID from B_DICT where ...)} <br />
     * B_DICT by my DICT_ID, named 'BDict'.
     * @param subCBLambda The callback for sub-query of BDict for 'in-scope'. (NotNull)
     */
    public void inScopeBDict(SubQuery<BDictCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCB cb = new BDictCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDictId_InScopeRelation_BDict(cb.query());
        registerInScopeRelation(cb.query(), "DICT_ID", "DICT_ID", pp, "bDict", false);
    }
    public abstract String keepDictId_InScopeRelation_BDict(BDictCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DICT_ID from B_DICT where ...)} <br />
     * B_DICT by my DICT_ID, named 'BDict'.
     * @param subCBLambda The callback for sub-query of BDict for 'not in-scope'. (NotNull)
     */
    public void notInScopeBDict(SubQuery<BDictCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCB cb = new BDictCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDictId_NotInScopeRelation_BDict(cb.query());
        registerInScopeRelation(cb.query(), "DICT_ID", "DICT_ID", pp, "bDict", true);
    }
    public abstract String keepDictId_NotInScopeRelation_BDict(BDictCQ sq);

    protected void regDictId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDictId(), "DICT_ID"); }
    protected abstract ConditionValue xgetCValueDictId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_Equal(Long viewOrder) {
        doSetViewOrder_Equal(viewOrder);
    }

    protected void doSetViewOrder_Equal(Long viewOrder) {
        regViewOrder(CK_EQ, viewOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_NotEqual(Long viewOrder) {
        doSetViewOrder_NotEqual(viewOrder);
    }

    protected void doSetViewOrder_NotEqual(Long viewOrder) {
        regViewOrder(CK_NES, viewOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_GreaterThan(Long viewOrder) {
        regViewOrder(CK_GT, viewOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_LessThan(Long viewOrder) {
        regViewOrder(CK_LT, viewOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_GreaterEqual(Long viewOrder) {
        regViewOrder(CK_GE, viewOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrder The value of viewOrder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setViewOrder_LessEqual(Long viewOrder) {
        regViewOrder(CK_LE, viewOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param minNumber The min number of viewOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of viewOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setViewOrder_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueViewOrder(), "VIEW_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrderList The collection of viewOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setViewOrder_InScope(Collection<Long> viewOrderList) {
        doSetViewOrder_InScope(viewOrderList);
    }

    protected void doSetViewOrder_InScope(Collection<Long> viewOrderList) {
        regINS(CK_INS, cTL(viewOrderList), xgetCValueViewOrder(), "VIEW_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     * @param viewOrderList The collection of viewOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setViewOrder_NotInScope(Collection<Long> viewOrderList) {
        doSetViewOrder_NotInScope(viewOrderList);
    }

    protected void doSetViewOrder_NotInScope(Collection<Long> viewOrderList) {
        regINS(CK_NINS, cTL(viewOrderList), xgetCValueViewOrder(), "VIEW_ORDER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     */
    public void setViewOrder_IsNull() { regViewOrder(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VIEW_ORDER: {bigint(19)}
     */
    public void setViewOrder_IsNotNull() { regViewOrder(CK_ISNN, DOBJ); }

    protected void regViewOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueViewOrder(), "VIEW_ORDER"); }
    protected abstract ConditionValue xgetCValueViewOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_Equal(String defaultFlg) {
        doSetDefaultFlg_Equal(fRES(defaultFlg));
    }

    protected void doSetDefaultFlg_Equal(String defaultFlg) {
        regDefaultFlg(CK_EQ, defaultFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_NotEqual(String defaultFlg) {
        doSetDefaultFlg_NotEqual(fRES(defaultFlg));
    }

    protected void doSetDefaultFlg_NotEqual(String defaultFlg) {
        regDefaultFlg(CK_NES, defaultFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_GreaterThan(String defaultFlg) {
        regDefaultFlg(CK_GT, fRES(defaultFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_LessThan(String defaultFlg) {
        regDefaultFlg(CK_LT, fRES(defaultFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_GreaterEqual(String defaultFlg) {
        regDefaultFlg(CK_GE, fRES(defaultFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_LessEqual(String defaultFlg) {
        regDefaultFlg(CK_LE, fRES(defaultFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlgList The collection of defaultFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_InScope(Collection<String> defaultFlgList) {
        doSetDefaultFlg_InScope(defaultFlgList);
    }

    protected void doSetDefaultFlg_InScope(Collection<String> defaultFlgList) {
        regINS(CK_INS, cTL(defaultFlgList), xgetCValueDefaultFlg(), "DEFAULT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlgList The collection of defaultFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_NotInScope(Collection<String> defaultFlgList) {
        doSetDefaultFlg_NotInScope(defaultFlgList);
    }

    protected void doSetDefaultFlg_NotInScope(Collection<String> defaultFlgList) {
        regINS(CK_NINS, cTL(defaultFlgList), xgetCValueDefaultFlg(), "DEFAULT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setDefaultFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param defaultFlg The value of defaultFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDefaultFlg_LikeSearch(String defaultFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(defaultFlg), xgetCValueDefaultFlg(), "DEFAULT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDefaultFlg_NotLikeSearch(String defaultFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(defaultFlg), xgetCValueDefaultFlg(), "DEFAULT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_FLG: {NotNull, char(1), default=[0]}
     * @param defaultFlg The value of defaultFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultFlg_PrefixSearch(String defaultFlg) {
        setDefaultFlg_LikeSearch(defaultFlg, xcLSOPPre());
    }

    protected void regDefaultFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefaultFlg(), "DEFAULT_FLG"); }
    protected abstract ConditionValue xgetCValueDefaultFlg();

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
    public HpSLCFunction<BClassDtlCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BClassDtlCB.class);
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
    public HpSLCFunction<BClassDtlCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BClassDtlCB.class);
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
    public HpSLCFunction<BClassDtlCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BClassDtlCB.class);
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
    public HpSLCFunction<BClassDtlCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BClassDtlCB.class);
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
    public HpSLCFunction<BClassDtlCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BClassDtlCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BClassDtlCB&gt;() {
     *     public void query(BClassDtlCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BClassDtlCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BClassDtlCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassDtlCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BClassDtlCQ sq);

    protected BClassDtlCB xcreateScalarConditionCB() {
        BClassDtlCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BClassDtlCB xcreateScalarConditionPartitionByCB() {
        BClassDtlCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BClassDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassDtlCB cb = new BClassDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CLASS_DTL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BClassDtlCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BClassDtlCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BClassDtlCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassDtlCB cb = new BClassDtlCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CLASS_DTL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BClassDtlCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BClassDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassDtlCB cb = new BClassDtlCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BClassDtlCQ sq);

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
    protected BClassDtlCB newMyCB() {
        return new BClassDtlCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BClassDtlCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
