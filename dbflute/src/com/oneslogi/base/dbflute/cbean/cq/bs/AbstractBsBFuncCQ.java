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
 * The abstract condition-query of B_FUNC.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBFuncCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBFuncCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_FUNC";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param funcId The value of funcId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFuncId_Equal(Long funcId) {
        doSetFuncId_Equal(funcId);
    }

    protected void doSetFuncId_Equal(Long funcId) {
        regFuncId(CK_EQ, funcId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param funcId The value of funcId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFuncId_NotEqual(Long funcId) {
        doSetFuncId_NotEqual(funcId);
    }

    protected void doSetFuncId_NotEqual(Long funcId) {
        regFuncId(CK_NES, funcId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param funcId The value of funcId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFuncId_GreaterThan(Long funcId) {
        regFuncId(CK_GT, funcId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param funcId The value of funcId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFuncId_LessThan(Long funcId) {
        regFuncId(CK_LT, funcId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param funcId The value of funcId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFuncId_GreaterEqual(Long funcId) {
        regFuncId(CK_GE, funcId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param funcId The value of funcId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFuncId_LessEqual(Long funcId) {
        regFuncId(CK_LE, funcId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of funcId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of funcId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFuncId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFuncId(), "FUNC_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param funcIdList The collection of funcId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncId_InScope(Collection<Long> funcIdList) {
        doSetFuncId_InScope(funcIdList);
    }

    protected void doSetFuncId_InScope(Collection<Long> funcIdList) {
        regINS(CK_INS, cTL(funcIdList), xgetCValueFuncId(), "FUNC_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param funcIdList The collection of funcId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncId_NotInScope(Collection<Long> funcIdList) {
        doSetFuncId_NotInScope(funcIdList);
    }

    protected void doSetFuncId_NotInScope(Collection<Long> funcIdList) {
        regINS(CK_NINS, cTL(funcIdList), xgetCValueFuncId(), "FUNC_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select FUNC_ID from B_ARG where ...)} <br>
     * B_ARG by FUNC_ID, named 'BArgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBArgList</span>(argCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     argCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BArgList for 'exists'. (NotNull)
     */
    public void existsBArgList(SubQuery<BArgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BArgCB cb = new BArgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepFuncId_ExistsReferrer_BArgList(cb.query());
        registerExistsReferrer(cb.query(), "FUNC_ID", "FUNC_ID", pp, "bArgList");
    }
    public abstract String keepFuncId_ExistsReferrer_BArgList(BArgCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select FUNC_ID from B_FUNC_ROLE where ...)} <br>
     * B_FUNC_ROLE by FUNC_ID, named 'BFuncRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBFuncRoleList</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BFuncRoleList for 'exists'. (NotNull)
     */
    public void existsBFuncRoleList(SubQuery<BFuncRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BFuncRoleCB cb = new BFuncRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepFuncId_ExistsReferrer_BFuncRoleList(cb.query());
        registerExistsReferrer(cb.query(), "FUNC_ID", "FUNC_ID", pp, "bFuncRoleList");
    }
    public abstract String keepFuncId_ExistsReferrer_BFuncRoleList(BFuncRoleCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FUNC_ID from B_ARG where ...)} <br>
     * B_ARG by FUNC_ID, named 'BArgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBArgList</span>(argCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     argCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of FuncId_NotExistsReferrer_BArgList for 'not exists'. (NotNull)
     */
    public void notExistsBArgList(SubQuery<BArgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BArgCB cb = new BArgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepFuncId_NotExistsReferrer_BArgList(cb.query());
        registerNotExistsReferrer(cb.query(), "FUNC_ID", "FUNC_ID", pp, "bArgList");
    }
    public abstract String keepFuncId_NotExistsReferrer_BArgList(BArgCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FUNC_ID from B_FUNC_ROLE where ...)} <br>
     * B_FUNC_ROLE by FUNC_ID, named 'BFuncRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBFuncRoleList</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of FuncId_NotExistsReferrer_BFuncRoleList for 'not exists'. (NotNull)
     */
    public void notExistsBFuncRoleList(SubQuery<BFuncRoleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BFuncRoleCB cb = new BFuncRoleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepFuncId_NotExistsReferrer_BFuncRoleList(cb.query());
        registerNotExistsReferrer(cb.query(), "FUNC_ID", "FUNC_ID", pp, "bFuncRoleList");
    }
    public abstract String keepFuncId_NotExistsReferrer_BFuncRoleList(BFuncRoleCQ sq);

    public void xsderiveBArgList(String fn, SubQuery<BArgCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BArgCB cb = new BArgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepFuncId_SpecifyDerivedReferrer_BArgList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "FUNC_ID", "FUNC_ID", pp, "bArgList", al, op);
    }
    public abstract String keepFuncId_SpecifyDerivedReferrer_BArgList(BArgCQ sq);

    public void xsderiveBFuncRoleList(String fn, SubQuery<BFuncRoleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BFuncRoleCB cb = new BFuncRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepFuncId_SpecifyDerivedReferrer_BFuncRoleList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "FUNC_ID", "FUNC_ID", pp, "bFuncRoleList", al, op);
    }
    public abstract String keepFuncId_SpecifyDerivedReferrer_BFuncRoleList(BFuncRoleCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_ARG where ...)} <br>
     * B_ARG by FUNC_ID, named 'BArgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBArgList()</span>.<span style="color: #CC4747">max</span>(argCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     argCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     argCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BArgCB> derivedBArgList() {
        return xcreateQDRFunctionBArgList();
    }
    protected HpQDRFunction<BArgCB> xcreateQDRFunctionBArgList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBArgList(fn, sq, rd, vl, op));
    }
    public void xqderiveBArgList(String fn, SubQuery<BArgCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BArgCB cb = new BArgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepFuncId_QueryDerivedReferrer_BArgList(cb.query()); String prpp = keepFuncId_QueryDerivedReferrer_BArgListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "FUNC_ID", "FUNC_ID", sqpp, "bArgList", rd, vl, prpp, op);
    }
    public abstract String keepFuncId_QueryDerivedReferrer_BArgList(BArgCQ sq);
    public abstract String keepFuncId_QueryDerivedReferrer_BArgListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_FUNC_ROLE where ...)} <br>
     * B_FUNC_ROLE by FUNC_ID, named 'BFuncRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBFuncRoleList()</span>.<span style="color: #CC4747">max</span>(roleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     roleCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     roleCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BFuncRoleCB> derivedBFuncRoleList() {
        return xcreateQDRFunctionBFuncRoleList();
    }
    protected HpQDRFunction<BFuncRoleCB> xcreateQDRFunctionBFuncRoleList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBFuncRoleList(fn, sq, rd, vl, op));
    }
    public void xqderiveBFuncRoleList(String fn, SubQuery<BFuncRoleCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BFuncRoleCB cb = new BFuncRoleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepFuncId_QueryDerivedReferrer_BFuncRoleList(cb.query()); String prpp = keepFuncId_QueryDerivedReferrer_BFuncRoleListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "FUNC_ID", "FUNC_ID", sqpp, "bFuncRoleList", rd, vl, prpp, op);
    }
    public abstract String keepFuncId_QueryDerivedReferrer_BFuncRoleList(BFuncRoleCQ sq);
    public abstract String keepFuncId_QueryDerivedReferrer_BFuncRoleListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setFuncId_IsNull() { regFuncId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FUNC_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setFuncId_IsNotNull() { regFuncId(CK_ISNN, DOBJ); }

    protected void regFuncId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFuncId(), "FUNC_ID"); }
    protected abstract ConditionValue xgetCValueFuncId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {UQ+, NotNull, varchar(100)}
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
     * CLASS_CD: {UQ+, NotNull, varchar(100)}
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
     * CLASS_CD: {UQ+, NotNull, varchar(100)}
     * @param classCd The value of classCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_GreaterThan(String classCd) {
        regClassCd(CK_GT, fRES(classCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {UQ+, NotNull, varchar(100)}
     * @param classCd The value of classCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_LessThan(String classCd) {
        regClassCd(CK_LT, fRES(classCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {UQ+, NotNull, varchar(100)}
     * @param classCd The value of classCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_GreaterEqual(String classCd) {
        regClassCd(CK_GE, fRES(classCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLASS_CD: {UQ+, NotNull, varchar(100)}
     * @param classCd The value of classCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_LessEqual(String classCd) {
        regClassCd(CK_LE, fRES(classCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLASS_CD: {UQ+, NotNull, varchar(100)}
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
     * CLASS_CD: {UQ+, NotNull, varchar(100)}
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
     * CLASS_CD: {UQ+, NotNull, varchar(100)} <br>
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
     * CLASS_CD: {UQ+, NotNull, varchar(100)}
     * @param classCd The value of classCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClassCd_NotLikeSearch(String classCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(classCd), xgetCValueClassCd(), "CLASS_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLASS_CD: {UQ+, NotNull, varchar(100)}
     * @param classCd The value of classCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClassCd_PrefixSearch(String classCd) {
        setClassCd_LikeSearch(classCd, xcLSOPPre());
    }

    protected void regClassCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClassCd(), "CLASS_CD"); }
    protected abstract ConditionValue xgetCValueClassCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * METHOD_CD: {+UQ, NotNull, varchar(100)}
     * @param methodCd The value of methodCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_Equal(String methodCd) {
        doSetMethodCd_Equal(fRES(methodCd));
    }

    protected void doSetMethodCd_Equal(String methodCd) {
        regMethodCd(CK_EQ, methodCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * METHOD_CD: {+UQ, NotNull, varchar(100)}
     * @param methodCd The value of methodCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_NotEqual(String methodCd) {
        doSetMethodCd_NotEqual(fRES(methodCd));
    }

    protected void doSetMethodCd_NotEqual(String methodCd) {
        regMethodCd(CK_NES, methodCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * METHOD_CD: {+UQ, NotNull, varchar(100)}
     * @param methodCd The value of methodCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_GreaterThan(String methodCd) {
        regMethodCd(CK_GT, fRES(methodCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * METHOD_CD: {+UQ, NotNull, varchar(100)}
     * @param methodCd The value of methodCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_LessThan(String methodCd) {
        regMethodCd(CK_LT, fRES(methodCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * METHOD_CD: {+UQ, NotNull, varchar(100)}
     * @param methodCd The value of methodCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_GreaterEqual(String methodCd) {
        regMethodCd(CK_GE, fRES(methodCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * METHOD_CD: {+UQ, NotNull, varchar(100)}
     * @param methodCd The value of methodCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_LessEqual(String methodCd) {
        regMethodCd(CK_LE, fRES(methodCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * METHOD_CD: {+UQ, NotNull, varchar(100)}
     * @param methodCdList The collection of methodCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_InScope(Collection<String> methodCdList) {
        doSetMethodCd_InScope(methodCdList);
    }

    protected void doSetMethodCd_InScope(Collection<String> methodCdList) {
        regINS(CK_INS, cTL(methodCdList), xgetCValueMethodCd(), "METHOD_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * METHOD_CD: {+UQ, NotNull, varchar(100)}
     * @param methodCdList The collection of methodCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_NotInScope(Collection<String> methodCdList) {
        doSetMethodCd_NotInScope(methodCdList);
    }

    protected void doSetMethodCd_NotInScope(Collection<String> methodCdList) {
        regINS(CK_NINS, cTL(methodCdList), xgetCValueMethodCd(), "METHOD_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * METHOD_CD: {+UQ, NotNull, varchar(100)} <br>
     * <pre>e.g. setMethodCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param methodCd The value of methodCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMethodCd_LikeSearch(String methodCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(methodCd), xgetCValueMethodCd(), "METHOD_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * METHOD_CD: {+UQ, NotNull, varchar(100)}
     * @param methodCd The value of methodCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMethodCd_NotLikeSearch(String methodCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(methodCd), xgetCValueMethodCd(), "METHOD_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * METHOD_CD: {+UQ, NotNull, varchar(100)}
     * @param methodCd The value of methodCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMethodCd_PrefixSearch(String methodCd) {
        setMethodCd_LikeSearch(methodCd, xcLSOPPre());
    }

    protected void regMethodCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMethodCd(), "METHOD_CD"); }
    protected abstract ConditionValue xgetCValueMethodCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FUNC_CD: {varchar(100)}
     * @param funcCd The value of funcCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncCd_Equal(String funcCd) {
        doSetFuncCd_Equal(fRES(funcCd));
    }

    protected void doSetFuncCd_Equal(String funcCd) {
        regFuncCd(CK_EQ, funcCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FUNC_CD: {varchar(100)}
     * @param funcCd The value of funcCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncCd_NotEqual(String funcCd) {
        doSetFuncCd_NotEqual(fRES(funcCd));
    }

    protected void doSetFuncCd_NotEqual(String funcCd) {
        regFuncCd(CK_NES, funcCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FUNC_CD: {varchar(100)}
     * @param funcCd The value of funcCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncCd_GreaterThan(String funcCd) {
        regFuncCd(CK_GT, fRES(funcCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FUNC_CD: {varchar(100)}
     * @param funcCd The value of funcCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncCd_LessThan(String funcCd) {
        regFuncCd(CK_LT, fRES(funcCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FUNC_CD: {varchar(100)}
     * @param funcCd The value of funcCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncCd_GreaterEqual(String funcCd) {
        regFuncCd(CK_GE, fRES(funcCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FUNC_CD: {varchar(100)}
     * @param funcCd The value of funcCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncCd_LessEqual(String funcCd) {
        regFuncCd(CK_LE, fRES(funcCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FUNC_CD: {varchar(100)}
     * @param funcCdList The collection of funcCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncCd_InScope(Collection<String> funcCdList) {
        doSetFuncCd_InScope(funcCdList);
    }

    protected void doSetFuncCd_InScope(Collection<String> funcCdList) {
        regINS(CK_INS, cTL(funcCdList), xgetCValueFuncCd(), "FUNC_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FUNC_CD: {varchar(100)}
     * @param funcCdList The collection of funcCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncCd_NotInScope(Collection<String> funcCdList) {
        doSetFuncCd_NotInScope(funcCdList);
    }

    protected void doSetFuncCd_NotInScope(Collection<String> funcCdList) {
        regINS(CK_NINS, cTL(funcCdList), xgetCValueFuncCd(), "FUNC_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FUNC_CD: {varchar(100)} <br>
     * <pre>e.g. setFuncCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param funcCd The value of funcCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFuncCd_LikeSearch(String funcCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(funcCd), xgetCValueFuncCd(), "FUNC_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FUNC_CD: {varchar(100)}
     * @param funcCd The value of funcCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFuncCd_NotLikeSearch(String funcCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(funcCd), xgetCValueFuncCd(), "FUNC_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FUNC_CD: {varchar(100)}
     * @param funcCd The value of funcCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncCd_PrefixSearch(String funcCd) {
        setFuncCd_LikeSearch(funcCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FUNC_CD: {varchar(100)}
     */
    public void setFuncCd_IsNull() { regFuncCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FUNC_CD: {varchar(100)}
     */
    public void setFuncCd_IsNullOrEmpty() { regFuncCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FUNC_CD: {varchar(100)}
     */
    public void setFuncCd_IsNotNull() { regFuncCd(CK_ISNN, DOBJ); }

    protected void regFuncCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFuncCd(), "FUNC_CD"); }
    protected abstract ConditionValue xgetCValueFuncCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FUNC_NM: {varchar(60)}
     * @param funcNm The value of funcNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncNm_Equal(String funcNm) {
        doSetFuncNm_Equal(fRES(funcNm));
    }

    protected void doSetFuncNm_Equal(String funcNm) {
        regFuncNm(CK_EQ, funcNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FUNC_NM: {varchar(60)}
     * @param funcNm The value of funcNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncNm_NotEqual(String funcNm) {
        doSetFuncNm_NotEqual(fRES(funcNm));
    }

    protected void doSetFuncNm_NotEqual(String funcNm) {
        regFuncNm(CK_NES, funcNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FUNC_NM: {varchar(60)}
     * @param funcNm The value of funcNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncNm_GreaterThan(String funcNm) {
        regFuncNm(CK_GT, fRES(funcNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FUNC_NM: {varchar(60)}
     * @param funcNm The value of funcNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncNm_LessThan(String funcNm) {
        regFuncNm(CK_LT, fRES(funcNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FUNC_NM: {varchar(60)}
     * @param funcNm The value of funcNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncNm_GreaterEqual(String funcNm) {
        regFuncNm(CK_GE, fRES(funcNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FUNC_NM: {varchar(60)}
     * @param funcNm The value of funcNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncNm_LessEqual(String funcNm) {
        regFuncNm(CK_LE, fRES(funcNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FUNC_NM: {varchar(60)}
     * @param funcNmList The collection of funcNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncNm_InScope(Collection<String> funcNmList) {
        doSetFuncNm_InScope(funcNmList);
    }

    protected void doSetFuncNm_InScope(Collection<String> funcNmList) {
        regINS(CK_INS, cTL(funcNmList), xgetCValueFuncNm(), "FUNC_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FUNC_NM: {varchar(60)}
     * @param funcNmList The collection of funcNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncNm_NotInScope(Collection<String> funcNmList) {
        doSetFuncNm_NotInScope(funcNmList);
    }

    protected void doSetFuncNm_NotInScope(Collection<String> funcNmList) {
        regINS(CK_NINS, cTL(funcNmList), xgetCValueFuncNm(), "FUNC_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FUNC_NM: {varchar(60)} <br>
     * <pre>e.g. setFuncNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param funcNm The value of funcNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFuncNm_LikeSearch(String funcNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(funcNm), xgetCValueFuncNm(), "FUNC_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FUNC_NM: {varchar(60)}
     * @param funcNm The value of funcNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFuncNm_NotLikeSearch(String funcNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(funcNm), xgetCValueFuncNm(), "FUNC_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FUNC_NM: {varchar(60)}
     * @param funcNm The value of funcNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFuncNm_PrefixSearch(String funcNm) {
        setFuncNm_LikeSearch(funcNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FUNC_NM: {varchar(60)}
     */
    public void setFuncNm_IsNull() { regFuncNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FUNC_NM: {varchar(60)}
     */
    public void setFuncNm_IsNullOrEmpty() { regFuncNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FUNC_NM: {varchar(60)}
     */
    public void setFuncNm_IsNotNull() { regFuncNm(CK_ISNN, DOBJ); }

    protected void regFuncNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFuncNm(), "FUNC_NM"); }
    protected abstract ConditionValue xgetCValueFuncNm();

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
    public HpSLCFunction<BFuncCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BFuncCB.class);
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
    public HpSLCFunction<BFuncCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BFuncCB.class);
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
    public HpSLCFunction<BFuncCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BFuncCB.class);
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
    public HpSLCFunction<BFuncCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BFuncCB.class);
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
    public HpSLCFunction<BFuncCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BFuncCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BFuncCB&gt;() {
     *     public void query(BFuncCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BFuncCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BFuncCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BFuncCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BFuncCQ sq);

    protected BFuncCB xcreateScalarConditionCB() {
        BFuncCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BFuncCB xcreateScalarConditionPartitionByCB() {
        BFuncCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BFuncCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BFuncCB cb = new BFuncCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "FUNC_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BFuncCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BFuncCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BFuncCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BFuncCB cb = new BFuncCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "FUNC_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BFuncCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BFuncCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BFuncCB cb = new BFuncCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BFuncCQ sq);

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
    protected BFuncCB newMyCB() {
        return new BFuncCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BFuncCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
