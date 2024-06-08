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
 * The abstract condition-query of B_TIME_ZONE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBTimeZoneCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBTimeZoneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_TIME_ZONE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param timeZoneId The value of timeZoneId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_Equal(Long timeZoneId) {
        doSetTimeZoneId_Equal(timeZoneId);
    }

    protected void doSetTimeZoneId_Equal(Long timeZoneId) {
        regTimeZoneId(CK_EQ, timeZoneId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param timeZoneId The value of timeZoneId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_NotEqual(Long timeZoneId) {
        doSetTimeZoneId_NotEqual(timeZoneId);
    }

    protected void doSetTimeZoneId_NotEqual(Long timeZoneId) {
        regTimeZoneId(CK_NES, timeZoneId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param timeZoneId The value of timeZoneId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_GreaterThan(Long timeZoneId) {
        regTimeZoneId(CK_GT, timeZoneId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param timeZoneId The value of timeZoneId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_LessThan(Long timeZoneId) {
        regTimeZoneId(CK_LT, timeZoneId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param timeZoneId The value of timeZoneId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_GreaterEqual(Long timeZoneId) {
        regTimeZoneId(CK_GE, timeZoneId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param timeZoneId The value of timeZoneId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTimeZoneId_LessEqual(Long timeZoneId) {
        regTimeZoneId(CK_LE, timeZoneId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of timeZoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of timeZoneId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTimeZoneId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTimeZoneId(), "TIME_ZONE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TIME_ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param timeZoneIdList The collection of timeZoneId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneId_InScope(Collection<Long> timeZoneIdList) {
        doSetTimeZoneId_InScope(timeZoneIdList);
    }

    protected void doSetTimeZoneId_InScope(Collection<Long> timeZoneIdList) {
        regINS(CK_INS, cTL(timeZoneIdList), xgetCValueTimeZoneId(), "TIME_ZONE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TIME_ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param timeZoneIdList The collection of timeZoneId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneId_NotInScope(Collection<Long> timeZoneIdList) {
        doSetTimeZoneId_NotInScope(timeZoneIdList);
    }

    protected void doSetTimeZoneId_NotInScope(Collection<Long> timeZoneIdList) {
        regINS(CK_NINS, cTL(timeZoneIdList), xgetCValueTimeZoneId(), "TIME_ZONE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TIME_ZONE_ID from B_SYSTEM where ...)} <br>
     * B_SYSTEM by TIME_ZONE_ID, named 'BSystemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBSystemList</span>(systemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     systemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BSystemList for 'exists'. (NotNull)
     */
    public void existsBSystemList(SubQuery<BSystemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BSystemCB cb = new BSystemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTimeZoneId_ExistsReferrer_BSystemList(cb.query());
        registerExistsReferrer(cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", pp, "bSystemList");
    }
    public abstract String keepTimeZoneId_ExistsReferrer_BSystemList(BSystemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TIME_ZONE_ID from M_CENTER where ...)} <br>
     * M_CENTER by TIME_ZONE_ID, named 'MCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterList for 'exists'. (NotNull)
     */
    public void existsMCenterList(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTimeZoneId_ExistsReferrer_MCenterList(cb.query());
        registerExistsReferrer(cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", pp, "mCenterList");
    }
    public abstract String keepTimeZoneId_ExistsReferrer_MCenterList(MCenterCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TIME_ZONE_ID from B_SYSTEM where ...)} <br>
     * B_SYSTEM by TIME_ZONE_ID, named 'BSystemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBSystemList</span>(systemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     systemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TimeZoneId_NotExistsReferrer_BSystemList for 'not exists'. (NotNull)
     */
    public void notExistsBSystemList(SubQuery<BSystemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BSystemCB cb = new BSystemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTimeZoneId_NotExistsReferrer_BSystemList(cb.query());
        registerNotExistsReferrer(cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", pp, "bSystemList");
    }
    public abstract String keepTimeZoneId_NotExistsReferrer_BSystemList(BSystemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TIME_ZONE_ID from M_CENTER where ...)} <br>
     * M_CENTER by TIME_ZONE_ID, named 'MCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TimeZoneId_NotExistsReferrer_MCenterList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterList(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTimeZoneId_NotExistsReferrer_MCenterList(cb.query());
        registerNotExistsReferrer(cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", pp, "mCenterList");
    }
    public abstract String keepTimeZoneId_NotExistsReferrer_MCenterList(MCenterCQ sq);

    public void xsderiveBSystemList(String fn, SubQuery<BSystemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BSystemCB cb = new BSystemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTimeZoneId_SpecifyDerivedReferrer_BSystemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", pp, "bSystemList", al, op);
    }
    public abstract String keepTimeZoneId_SpecifyDerivedReferrer_BSystemList(BSystemCQ sq);

    public void xsderiveMCenterList(String fn, SubQuery<MCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCB cb = new MCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTimeZoneId_SpecifyDerivedReferrer_MCenterList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", pp, "mCenterList", al, op);
    }
    public abstract String keepTimeZoneId_SpecifyDerivedReferrer_MCenterList(MCenterCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_SYSTEM where ...)} <br>
     * B_SYSTEM by TIME_ZONE_ID, named 'BSystemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBSystemList()</span>.<span style="color: #CC4747">max</span>(systemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     systemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     systemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BSystemCB> derivedBSystemList() {
        return xcreateQDRFunctionBSystemList();
    }
    protected HpQDRFunction<BSystemCB> xcreateQDRFunctionBSystemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBSystemList(fn, sq, rd, vl, op));
    }
    public void xqderiveBSystemList(String fn, SubQuery<BSystemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BSystemCB cb = new BSystemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTimeZoneId_QueryDerivedReferrer_BSystemList(cb.query()); String prpp = keepTimeZoneId_QueryDerivedReferrer_BSystemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", sqpp, "bSystemList", rd, vl, prpp, op);
    }
    public abstract String keepTimeZoneId_QueryDerivedReferrer_BSystemList(BSystemCQ sq);
    public abstract String keepTimeZoneId_QueryDerivedReferrer_BSystemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER where ...)} <br>
     * M_CENTER by TIME_ZONE_ID, named 'MCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterList()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     centerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterCB> derivedMCenterList() {
        return xcreateQDRFunctionMCenterList();
    }
    protected HpQDRFunction<MCenterCB> xcreateQDRFunctionMCenterList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterList(String fn, SubQuery<MCenterCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCB cb = new MCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTimeZoneId_QueryDerivedReferrer_MCenterList(cb.query()); String prpp = keepTimeZoneId_QueryDerivedReferrer_MCenterListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TIME_ZONE_ID", "TIME_ZONE_ID", sqpp, "mCenterList", rd, vl, prpp, op);
    }
    public abstract String keepTimeZoneId_QueryDerivedReferrer_MCenterList(MCenterCQ sq);
    public abstract String keepTimeZoneId_QueryDerivedReferrer_MCenterListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTimeZoneId_IsNull() { regTimeZoneId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TIME_ZONE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTimeZoneId_IsNotNull() { regTimeZoneId(CK_ISNN, DOBJ); }

    protected void regTimeZoneId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimeZoneId(), "TIME_ZONE_ID"); }
    protected abstract ConditionValue xgetCValueTimeZoneId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {UQ, NotNull, varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_Equal(String timeZoneCd) {
        doSetTimeZoneCd_Equal(fRES(timeZoneCd));
    }

    protected void doSetTimeZoneCd_Equal(String timeZoneCd) {
        regTimeZoneCd(CK_EQ, timeZoneCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {UQ, NotNull, varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_NotEqual(String timeZoneCd) {
        doSetTimeZoneCd_NotEqual(fRES(timeZoneCd));
    }

    protected void doSetTimeZoneCd_NotEqual(String timeZoneCd) {
        regTimeZoneCd(CK_NES, timeZoneCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {UQ, NotNull, varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_GreaterThan(String timeZoneCd) {
        regTimeZoneCd(CK_GT, fRES(timeZoneCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {UQ, NotNull, varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_LessThan(String timeZoneCd) {
        regTimeZoneCd(CK_LT, fRES(timeZoneCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {UQ, NotNull, varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_GreaterEqual(String timeZoneCd) {
        regTimeZoneCd(CK_GE, fRES(timeZoneCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIME_ZONE_CD: {UQ, NotNull, varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_LessEqual(String timeZoneCd) {
        regTimeZoneCd(CK_LE, fRES(timeZoneCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_ZONE_CD: {UQ, NotNull, varchar(30)}
     * @param timeZoneCdList The collection of timeZoneCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_InScope(Collection<String> timeZoneCdList) {
        doSetTimeZoneCd_InScope(timeZoneCdList);
    }

    protected void doSetTimeZoneCd_InScope(Collection<String> timeZoneCdList) {
        regINS(CK_INS, cTL(timeZoneCdList), xgetCValueTimeZoneCd(), "TIME_ZONE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIME_ZONE_CD: {UQ, NotNull, varchar(30)}
     * @param timeZoneCdList The collection of timeZoneCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_NotInScope(Collection<String> timeZoneCdList) {
        doSetTimeZoneCd_NotInScope(timeZoneCdList);
    }

    protected void doSetTimeZoneCd_NotInScope(Collection<String> timeZoneCdList) {
        regINS(CK_NINS, cTL(timeZoneCdList), xgetCValueTimeZoneCd(), "TIME_ZONE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_ZONE_CD: {UQ, NotNull, varchar(30)} <br>
     * <pre>e.g. setTimeZoneCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param timeZoneCd The value of timeZoneCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTimeZoneCd_LikeSearch(String timeZoneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(timeZoneCd), xgetCValueTimeZoneCd(), "TIME_ZONE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_ZONE_CD: {UQ, NotNull, varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTimeZoneCd_NotLikeSearch(String timeZoneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(timeZoneCd), xgetCValueTimeZoneCd(), "TIME_ZONE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIME_ZONE_CD: {UQ, NotNull, varchar(30)}
     * @param timeZoneCd The value of timeZoneCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimeZoneCd_PrefixSearch(String timeZoneCd) {
        setTimeZoneCd_LikeSearch(timeZoneCd, xcLSOPPre());
    }

    protected void regTimeZoneCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimeZoneCd(), "TIME_ZONE_CD"); }
    protected abstract ConditionValue xgetCValueTimeZoneCd();

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
    public HpSLCFunction<BTimeZoneCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BTimeZoneCB.class);
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
    public HpSLCFunction<BTimeZoneCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BTimeZoneCB.class);
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
    public HpSLCFunction<BTimeZoneCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BTimeZoneCB.class);
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
    public HpSLCFunction<BTimeZoneCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BTimeZoneCB.class);
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
    public HpSLCFunction<BTimeZoneCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BTimeZoneCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BTimeZoneCB&gt;() {
     *     public void query(BTimeZoneCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BTimeZoneCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BTimeZoneCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BTimeZoneCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BTimeZoneCQ sq);

    protected BTimeZoneCB xcreateScalarConditionCB() {
        BTimeZoneCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BTimeZoneCB xcreateScalarConditionPartitionByCB() {
        BTimeZoneCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BTimeZoneCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BTimeZoneCB cb = new BTimeZoneCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TIME_ZONE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BTimeZoneCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BTimeZoneCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BTimeZoneCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BTimeZoneCB cb = new BTimeZoneCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TIME_ZONE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BTimeZoneCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BTimeZoneCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BTimeZoneCB cb = new BTimeZoneCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BTimeZoneCQ sq);

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
    protected BTimeZoneCB newMyCB() {
        return new BTimeZoneCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BTimeZoneCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
