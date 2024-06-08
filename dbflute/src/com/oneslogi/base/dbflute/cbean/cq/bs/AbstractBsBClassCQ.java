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
 * The abstract condition-query of B_CLASS.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBClassCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBClassCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_CLASS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param classId The value of classId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_GreaterThan(Long classId) {
        regClassId(CK_GT, classId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param classId The value of classId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_LessThan(Long classId) {
        regClassId(CK_LT, classId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param classId The value of classId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_GreaterEqual(Long classId) {
        regClassId(CK_GE, classId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param classId The value of classId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClassId_LessEqual(Long classId) {
        regClassId(CK_LE, classId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of classId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of classId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClassId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClassId(), "CLASS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param classIdList The collection of classId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassId_NotInScope(Collection<Long> classIdList) {
        doSetClassId_NotInScope(classIdList);
    }

    protected void doSetClassId_NotInScope(Collection<Long> classIdList) {
        regINS(CK_NINS, cTL(classIdList), xgetCValueClassId(), "CLASS_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLASS_ID from B_CLASS_DTL where ...)} <br>
     * B_CLASS_DTL by CLASS_ID, named 'BClassDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBClassDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BClassDtlList for 'exists'. (NotNull)
     */
    public void existsBClassDtlList(SubQuery<BClassDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassDtlCB cb = new BClassDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClassId_ExistsReferrer_BClassDtlList(cb.query());
        registerExistsReferrer(cb.query(), "CLASS_ID", "CLASS_ID", pp, "bClassDtlList");
    }
    public abstract String keepClassId_ExistsReferrer_BClassDtlList(BClassDtlCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CLASS_ID from B_CLASS_GRP where ...)} <br>
     * B_CLASS_GRP by CLASS_ID, named 'BClassGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBClassGrpList</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BClassGrpList for 'exists'. (NotNull)
     */
    public void existsBClassGrpList(SubQuery<BClassGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassGrpCB cb = new BClassGrpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClassId_ExistsReferrer_BClassGrpList(cb.query());
        registerExistsReferrer(cb.query(), "CLASS_ID", "CLASS_ID", pp, "bClassGrpList");
    }
    public abstract String keepClassId_ExistsReferrer_BClassGrpList(BClassGrpCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLASS_ID from B_CLASS_DTL where ...)} <br>
     * B_CLASS_DTL by CLASS_ID, named 'BClassDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBClassDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClassId_NotExistsReferrer_BClassDtlList for 'not exists'. (NotNull)
     */
    public void notExistsBClassDtlList(SubQuery<BClassDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassDtlCB cb = new BClassDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClassId_NotExistsReferrer_BClassDtlList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLASS_ID", "CLASS_ID", pp, "bClassDtlList");
    }
    public abstract String keepClassId_NotExistsReferrer_BClassDtlList(BClassDtlCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CLASS_ID from B_CLASS_GRP where ...)} <br>
     * B_CLASS_GRP by CLASS_ID, named 'BClassGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBClassGrpList</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ClassId_NotExistsReferrer_BClassGrpList for 'not exists'. (NotNull)
     */
    public void notExistsBClassGrpList(SubQuery<BClassGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassGrpCB cb = new BClassGrpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepClassId_NotExistsReferrer_BClassGrpList(cb.query());
        registerNotExistsReferrer(cb.query(), "CLASS_ID", "CLASS_ID", pp, "bClassGrpList");
    }
    public abstract String keepClassId_NotExistsReferrer_BClassGrpList(BClassGrpCQ sq);

    public void xsderiveBClassDtlList(String fn, SubQuery<BClassDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassDtlCB cb = new BClassDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClassId_SpecifyDerivedReferrer_BClassDtlList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLASS_ID", "CLASS_ID", pp, "bClassDtlList", al, op);
    }
    public abstract String keepClassId_SpecifyDerivedReferrer_BClassDtlList(BClassDtlCQ sq);

    public void xsderiveBClassGrpList(String fn, SubQuery<BClassGrpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassGrpCB cb = new BClassGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepClassId_SpecifyDerivedReferrer_BClassGrpList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CLASS_ID", "CLASS_ID", pp, "bClassGrpList", al, op);
    }
    public abstract String keepClassId_SpecifyDerivedReferrer_BClassGrpList(BClassGrpCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_CLASS_DTL where ...)} <br>
     * B_CLASS_DTL by CLASS_ID, named 'BClassDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBClassDtlList()</span>.<span style="color: #CC4747">max</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dtlCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BClassDtlCB> derivedBClassDtlList() {
        return xcreateQDRFunctionBClassDtlList();
    }
    protected HpQDRFunction<BClassDtlCB> xcreateQDRFunctionBClassDtlList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBClassDtlList(fn, sq, rd, vl, op));
    }
    public void xqderiveBClassDtlList(String fn, SubQuery<BClassDtlCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassDtlCB cb = new BClassDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClassId_QueryDerivedReferrer_BClassDtlList(cb.query()); String prpp = keepClassId_QueryDerivedReferrer_BClassDtlListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLASS_ID", "CLASS_ID", sqpp, "bClassDtlList", rd, vl, prpp, op);
    }
    public abstract String keepClassId_QueryDerivedReferrer_BClassDtlList(BClassDtlCQ sq);
    public abstract String keepClassId_QueryDerivedReferrer_BClassDtlListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_CLASS_GRP where ...)} <br>
     * B_CLASS_GRP by CLASS_ID, named 'BClassGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBClassGrpList()</span>.<span style="color: #CC4747">max</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     grpCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BClassGrpCB> derivedBClassGrpList() {
        return xcreateQDRFunctionBClassGrpList();
    }
    protected HpQDRFunction<BClassGrpCB> xcreateQDRFunctionBClassGrpList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBClassGrpList(fn, sq, rd, vl, op));
    }
    public void xqderiveBClassGrpList(String fn, SubQuery<BClassGrpCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassGrpCB cb = new BClassGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepClassId_QueryDerivedReferrer_BClassGrpList(cb.query()); String prpp = keepClassId_QueryDerivedReferrer_BClassGrpListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CLASS_ID", "CLASS_ID", sqpp, "bClassGrpList", rd, vl, prpp, op);
    }
    public abstract String keepClassId_QueryDerivedReferrer_BClassGrpList(BClassGrpCQ sq);
    public abstract String keepClassId_QueryDerivedReferrer_BClassGrpListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClassId_IsNull() { regClassId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLASS_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClassId_IsNotNull() { regClassId(CK_ISNN, DOBJ); }

    protected void regClassId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassId(), "CLASS_ID"); }
    protected abstract ConditionValue xgetCValueClassId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {UQ, NotNull, varchar(30)}
     * @param classCd The value of classCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_Equal(String classCd) {
        doSetClassCd_Equal(fRES(classCd));
    }

    protected void doSetClassCd_Equal(String classCd) {
        regClassCd(CK_EQ, classCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {UQ, NotNull, varchar(30)}
     * @param classCd The value of classCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_NotEqual(String classCd) {
        doSetClassCd_NotEqual(fRES(classCd));
    }

    protected void doSetClassCd_NotEqual(String classCd) {
        regClassCd(CK_NES, classCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {UQ, NotNull, varchar(30)}
     * @param classCd The value of classCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_GreaterThan(String classCd) {
        regClassCd(CK_GT, fRES(classCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {UQ, NotNull, varchar(30)}
     * @param classCd The value of classCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_LessThan(String classCd) {
        regClassCd(CK_LT, fRES(classCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {UQ, NotNull, varchar(30)}
     * @param classCd The value of classCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_GreaterEqual(String classCd) {
        regClassCd(CK_GE, fRES(classCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {UQ, NotNull, varchar(30)}
     * @param classCd The value of classCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_LessEqual(String classCd) {
        regClassCd(CK_LE, fRES(classCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_CD: {UQ, NotNull, varchar(30)}
     * @param classCdList The collection of classCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_InScope(Collection<String> classCdList) {
        doSetClassCd_InScope(classCdList);
    }

    protected void doSetClassCd_InScope(Collection<String> classCdList) {
        regINS(CK_INS, cTL(classCdList), xgetCValueClassCd(), "CLASS_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_CD: {UQ, NotNull, varchar(30)}
     * @param classCdList The collection of classCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_NotInScope(Collection<String> classCdList) {
        doSetClassCd_NotInScope(classCdList);
    }

    protected void doSetClassCd_NotInScope(Collection<String> classCdList) {
        regINS(CK_NINS, cTL(classCdList), xgetCValueClassCd(), "CLASS_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_CD: {UQ, NotNull, varchar(30)} <br>
     * <pre>e.g. setClassCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param classCd The value of classCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClassCd_LikeSearch(String classCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(classCd), xgetCValueClassCd(), "CLASS_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_CD: {UQ, NotNull, varchar(30)}
     * @param classCd The value of classCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClassCd_NotLikeSearch(String classCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(classCd), xgetCValueClassCd(), "CLASS_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_CD: {UQ, NotNull, varchar(30)}
     * @param classCd The value of classCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_PrefixSearch(String classCd) {
        setClassCd_LikeSearch(classCd, xcLSOPPre());
    }

    protected void regClassCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassCd(), "CLASS_CD"); }
    protected abstract ConditionValue xgetCValueClassCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_COMMENT: {varchar(100)}
     * @param classComment The value of classComment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassComment_Equal(String classComment) {
        doSetClassComment_Equal(fRES(classComment));
    }

    protected void doSetClassComment_Equal(String classComment) {
        regClassComment(CK_EQ, classComment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_COMMENT: {varchar(100)}
     * @param classComment The value of classComment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassComment_NotEqual(String classComment) {
        doSetClassComment_NotEqual(fRES(classComment));
    }

    protected void doSetClassComment_NotEqual(String classComment) {
        regClassComment(CK_NES, classComment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_COMMENT: {varchar(100)}
     * @param classComment The value of classComment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassComment_GreaterThan(String classComment) {
        regClassComment(CK_GT, fRES(classComment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_COMMENT: {varchar(100)}
     * @param classComment The value of classComment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassComment_LessThan(String classComment) {
        regClassComment(CK_LT, fRES(classComment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_COMMENT: {varchar(100)}
     * @param classComment The value of classComment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassComment_GreaterEqual(String classComment) {
        regClassComment(CK_GE, fRES(classComment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_COMMENT: {varchar(100)}
     * @param classComment The value of classComment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassComment_LessEqual(String classComment) {
        regClassComment(CK_LE, fRES(classComment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_COMMENT: {varchar(100)}
     * @param classCommentList The collection of classComment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassComment_InScope(Collection<String> classCommentList) {
        doSetClassComment_InScope(classCommentList);
    }

    protected void doSetClassComment_InScope(Collection<String> classCommentList) {
        regINS(CK_INS, cTL(classCommentList), xgetCValueClassComment(), "CLASS_COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_COMMENT: {varchar(100)}
     * @param classCommentList The collection of classComment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassComment_NotInScope(Collection<String> classCommentList) {
        doSetClassComment_NotInScope(classCommentList);
    }

    protected void doSetClassComment_NotInScope(Collection<String> classCommentList) {
        regINS(CK_NINS, cTL(classCommentList), xgetCValueClassComment(), "CLASS_COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_COMMENT: {varchar(100)} <br>
     * <pre>e.g. setClassComment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param classComment The value of classComment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClassComment_LikeSearch(String classComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(classComment), xgetCValueClassComment(), "CLASS_COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_COMMENT: {varchar(100)}
     * @param classComment The value of classComment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClassComment_NotLikeSearch(String classComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(classComment), xgetCValueClassComment(), "CLASS_COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_COMMENT: {varchar(100)}
     * @param classComment The value of classComment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassComment_PrefixSearch(String classComment) {
        setClassComment_LikeSearch(classComment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLASS_COMMENT: {varchar(100)}
     */
    public void setClassComment_IsNull() { regClassComment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLASS_COMMENT: {varchar(100)}
     */
    public void setClassComment_IsNullOrEmpty() { regClassComment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLASS_COMMENT: {varchar(100)}
     */
    public void setClassComment_IsNotNull() { regClassComment(CK_ISNN, DOBJ); }

    protected void regClassComment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassComment(), "CLASS_COMMENT"); }
    protected abstract ConditionValue xgetCValueClassComment();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @param systemType The value of systemType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_Equal(String systemType) {
        doSetSystemType_Equal(fRES(systemType));
    }

    /**
     * Equal(=). As SystemType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemType_Equal_AsSystemType(CDef.SystemType cdef) {
        doSetSystemType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $base (base). And OnlyOnceRegistered. <br>
     * $base: 基盤
     */
    public void setSystemType_Equal_$base() {
        setSystemType_Equal_AsSystemType(CDef.SystemType.$base);
    }

    /**
     * Equal(=). As $wms (wms). And OnlyOnceRegistered. <br>
     * $wms: WMS
     */
    public void setSystemType_Equal_$wms() {
        setSystemType_Equal_AsSystemType(CDef.SystemType.$wms);
    }

    /**
     * Equal(=). As $tsn (tsn). And OnlyOnceRegistered. <br>
     * $tsn: tsn
     */
    public void setSystemType_Equal_$tsn() {
        setSystemType_Equal_AsSystemType(CDef.SystemType.$tsn);
    }

    protected void doSetSystemType_Equal(String systemType) {
        regSystemType(CK_EQ, systemType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @param systemType The value of systemType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_NotEqual(String systemType) {
        doSetSystemType_NotEqual(fRES(systemType));
    }

    /**
     * NotEqual(&lt;&gt;). As SystemType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemType_NotEqual_AsSystemType(CDef.SystemType cdef) {
        doSetSystemType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $base (base). And OnlyOnceRegistered. <br>
     * $base: 基盤
     */
    public void setSystemType_NotEqual_$base() {
        setSystemType_NotEqual_AsSystemType(CDef.SystemType.$base);
    }

    /**
     * NotEqual(&lt;&gt;). As $wms (wms). And OnlyOnceRegistered. <br>
     * $wms: WMS
     */
    public void setSystemType_NotEqual_$wms() {
        setSystemType_NotEqual_AsSystemType(CDef.SystemType.$wms);
    }

    /**
     * NotEqual(&lt;&gt;). As $tsn (tsn). And OnlyOnceRegistered. <br>
     * $tsn: tsn
     */
    public void setSystemType_NotEqual_$tsn() {
        setSystemType_NotEqual_AsSystemType(CDef.SystemType.$tsn);
    }

    protected void doSetSystemType_NotEqual(String systemType) {
        regSystemType(CK_NES, systemType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @param systemTypeList The collection of systemType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_InScope(Collection<String> systemTypeList) {
        doSetSystemType_InScope(systemTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As SystemType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_InScope_AsSystemType(Collection<CDef.SystemType> cdefList) {
        doSetSystemType_InScope(cTStrL(cdefList));
    }

    protected void doSetSystemType_InScope(Collection<String> systemTypeList) {
        regINS(CK_INS, cTL(systemTypeList), xgetCValueSystemType(), "SYSTEM_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @param systemTypeList The collection of systemType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_NotInScope(Collection<String> systemTypeList) {
        doSetSystemType_NotInScope(systemTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SystemType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_NotInScope_AsSystemType(Collection<CDef.SystemType> cdefList) {
        doSetSystemType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSystemType_NotInScope(Collection<String> systemTypeList) {
        regINS(CK_NINS, cTL(systemTypeList), xgetCValueSystemType(), "SYSTEM_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     */
    public void setSystemType_IsNull() { regSystemType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     */
    public void setSystemType_IsNullOrEmpty() { regSystemType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     */
    public void setSystemType_IsNotNull() { regSystemType(CK_ISNN, DOBJ); }

    protected void regSystemType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSystemType(), "SYSTEM_TYPE"); }
    protected abstract ConditionValue xgetCValueSystemType();

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
    public HpSLCFunction<BClassCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BClassCB.class);
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
    public HpSLCFunction<BClassCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BClassCB.class);
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
    public HpSLCFunction<BClassCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BClassCB.class);
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
    public HpSLCFunction<BClassCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BClassCB.class);
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
    public HpSLCFunction<BClassCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BClassCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BClassCB&gt;() {
     *     public void query(BClassCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BClassCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BClassCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BClassCQ sq);

    protected BClassCB xcreateScalarConditionCB() {
        BClassCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BClassCB xcreateScalarConditionPartitionByCB() {
        BClassCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BClassCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassCB cb = new BClassCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CLASS_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BClassCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BClassCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BClassCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BClassCB cb = new BClassCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CLASS_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BClassCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BClassCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BClassCB cb = new BClassCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BClassCQ sq);

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
    protected BClassCB newMyCB() {
        return new BClassCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BClassCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
